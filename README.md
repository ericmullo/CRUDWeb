Proyecto MVC con CRUD y Login desarrollado con Spring Boot, Thymeleaf, Spring Security y base de datos H2, listo para ejecutar en IntelliJ IDEA con Maven.

Requisitos:
Java 17, Maven y IntelliJ IDEA.

Ejecución:

Ejecutar mvn spring-boot:run.

Acceder a http://localhost:8080/login.

Usuario de prueba: admin, contraseña: admin123.

La sección protegida es /books, accesible solo tras iniciar sesión.

Consola de H2: http://localhost:8080/h2 (JDBC URL: jdbc:h2:mem:demo).

Demostración para el video:

Al intentar acceder a /books sin iniciar sesión, el sistema redirige automáticamente a /login.

Al iniciar sesión con admin/admin123, se redirige a la página de libros.

Permite crear, editar y eliminar registros de libros.

Tras cerrar sesión, no es posible acceder nuevamente a /books sin autenticarse.

Estructura del proyecto:

model/: contiene las entidades User y Book.

repository/: repositorios JPA.

controller/: incluye AuthController y BookController.

security/: configuración de seguridad con SecurityConfig y CustomUserDetailsService.

config/: DataLoader inicializa un usuario y libros de ejemplo.

templates/: vistas Thymeleaf (login.html, books/list.html, books/form.html).

El proyecto está completamente funcional y preparado para su entrega académica.