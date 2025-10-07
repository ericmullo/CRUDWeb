package com.example.demo.auth;

import jakarta.persistence.*;
import lombok.*;

@Entity @Table(name = "users")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class AppUser {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(unique = true, nullable = false)
  private String username;

  @Column(nullable = false)
  private String password; // encriptada (BCrypt)

  @Column(nullable = false)
  private String role; // "ROLE_ADMIN" o "ROLE_USER"

  private boolean enabled = true;
}
