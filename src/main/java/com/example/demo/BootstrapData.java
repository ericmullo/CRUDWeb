package com.example.demo;

import com.example.demo.auth.*;
import com.example.demo.producto.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class BootstrapData {

  @Bean
  CommandLineRunner initData(AppUserRepository userRepo,
                             ProductoRepository prodRepo,
                             BCryptPasswordEncoder encoder) {
    return args -> {
      // Usuarios
      if (userRepo.findByUsername("admin").isEmpty()) {
        userRepo.save(AppUser.builder()
          .username("admin")
          .password(encoder.encode("admin123"))
          .role("ROLE_ADMIN")
          .enabled(true)
          .build());
      }
      if (userRepo.findByUsername("user").isEmpty()) {
        userRepo.save(AppUser.builder()
          .username("user")
          .password(encoder.encode("user123"))
          .role("ROLE_USER")
          .enabled(true)
          .build());
      }

      // Productos
      if (prodRepo.count() == 0) {
        prodRepo.save(Producto.builder().nombre("Café Latte").categoria("Bebidas").precio(2.80).stock(50).build());
        prodRepo.save(Producto.builder().nombre("Capuchino").categoria("Bebidas").precio(3.20).stock(40).build());
        prodRepo.save(Producto.builder().nombre("Cheesecake").categoria("Postres").precio(4.50).stock(20).build());
      }
    };
  }
}
