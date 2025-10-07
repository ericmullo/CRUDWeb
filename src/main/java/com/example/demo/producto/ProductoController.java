package com.example.demo.producto;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/productos")
@RequiredArgsConstructor
public class ProductoController {

  private final ProductoRepository repo;

  @GetMapping
  public String list(Model model) {
    model.addAttribute("productos", repo.findAll());
    return "productos/lista";
  }

  @GetMapping("/nuevo")
  public String nuevo(Model model) {
    model.addAttribute("producto", new Producto());
    return "productos/form";
  }

  @PostMapping
  public String crear(Producto p) {
    repo.save(p);
    return "redirect:/productos";
  }

  @GetMapping("/{id}/editar")
  public String editar(@PathVariable Long id, Model model) {
    model.addAttribute("producto", repo.findById(id).orElseThrow());
    return "productos/form";
  }

  @PostMapping("/{id}")
  public String actualizar(@PathVariable Long id, Producto p) {
    p.setId(id);
    repo.save(p);
    return "redirect:/productos";
  }

  @PostMapping("/{id}/eliminar")
  public String eliminar(@PathVariable Long id) {
    repo.deleteById(id);
    return "redirect:/productos";
  }
}
