package com.example.demo.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequiredArgsConstructor
public class AuthController {

    private final AppUserRepository userRepo;
    private final BCryptPasswordEncoder encoder;

    // Mostrar formulario
    @GetMapping("/register")
    public String showRegisterForm(Model model,
                                   @RequestParam(required = false) String error,
                                   @RequestParam(required = false) String ok) {
        model.addAttribute("error", error);
        model.addAttribute("ok", ok);
        return "auth/register";
    }

    // Procesar registro
    @PostMapping("/register")
    public String doRegister(@RequestParam String username,
                             @RequestParam String password,
                             @RequestParam String confirmPassword,
                             RedirectAttributes ra) {

        if (username == null || username.isBlank() ||
                password == null || password.isBlank()) {
            ra.addAttribute("error", "Usuario y contraseña son obligatorios");
            return "redirect:/register";
        }

        if (!password.equals(confirmPassword)) {
            ra.addAttribute("error", "Las contraseñas no coinciden");
            return "redirect:/register";
        }

        if (userRepo.existsByUsername(username)) {
            ra.addAttribute("error", "El usuario ya existe");
            return "redirect:/register";
        }

        AppUser newUser = AppUser.builder()
                .username(username.trim())
                .password(encoder.encode(password))
                .role("ROLE_USER")    // por defecto usuario normal
                .enabled(true)
                .build();
        userRepo.save(newUser);

        ra.addAttribute("ok", "Cuenta creada. Inicia sesión.");
        return "redirect:/login";
    }
}
