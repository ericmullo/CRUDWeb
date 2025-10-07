<!-- BADGES Y TÍTULO PRINCIPAL -->
<p align="center">
  <img src="https://img.shields.io/badge/Spring%20Boot-3.x-6DB33F?logo=springboot&logoColor=white" />
  <img src="https://img.shields.io/badge/Java-17-007396?logo=openjdk&logoColor=white" />
  <img src="https://img.shields.io/badge/Maven-3.9-blue?logo=apachemaven&logoColor=white" />
  <img src="https://img.shields.io/badge/H2%20Database-Embedded-004088?logo=h2&logoColor=white" />
  <img src="https://img.shields.io/badge/Thymeleaf-Templates-005F0F?logo=thymeleaf&logoColor=white" />
</p>

<h1 align="center">📚 Demo MVC – CRUD + Login (Spring Boot)</h1>
<p align="center">Login + registro de usuarios y CRUD de productos.<br>Rutas protegidas con Spring Security, vistas con Thymeleaf y BD H2.</p>

<p align="center">
  <a href="#instalación--ejecución">Instalación</a> •
  <a href="#credenciales-de-prueba">Credenciales</a> •
  <a href="#funcionalidades">Funcionalidades</a> •
  <a href="#endpoints-principales">Endpoints</a> •
  <a href="#estructura-del-proyecto">Estructura</a> •
  <a href="#capturas">Capturas</a>
</p>

---

<h2 align="center">Ejecución</h2>

<p align="center">
Para ejecutar el proyecto localmente, sigue los pasos:
</p>

<p align="center">
  🌐 <b>Aplicación:</b>  
  <a href="http://localhost:8080/login">http://localhost:8080/login</a>  
  🛠 <b>Consola H2:</b>  
  <a href="http://localhost:8080/h2">http://localhost:8080/h2</a>  
  <br><br>
  <b>JDBC URL:</b> jdbc:h2:file:./data/demoapp  
  <b>User:</b> <code>sa</code>  
  <b>Password:</b> (vacía)
</p>

---

<h2 align="center">🔐 Credenciales de Prueba</h2>

<p align="center">
  Puedes usar estos usuarios por defecto para ingresar al sistema.
</p>

<p align="center">
  <table>
    <tr>
      <th>Rol</th>
      <th>Usuario</th>
      <th>Contraseña</th>
    </tr>
    <tr>
      <td>Administrador</td>
      <td><code>admin</code></td>
      <td><code>admin123</code></td>
    </tr>
    <tr>
      <td>Usuario</td>
      <td><code>user</code></td>
      <td><code>user123</code></td>
    </tr>
  </table>


---

<h2 align="center">⚙️ Funcionalidades</h2>

<p align="center">
  • Autenticación de usuarios (login, logout y registro).<br>
  • CRUD completo de productos.<br>
  • Seguridad mediante <b>Spring Security</b>.<br>
  • Persistencia con <b>Spring Data JPA</b> + <b>H2</b>.<br>
  • Interfaz moderna con <b>Thymeleaf</b> y CSS.<br>
  • Datos de ejemplo iniciales cargados automáticamente.<br>
</p>

---

<h2 align="center">🔗 Endpoints Principales</h2>

<p align="center">
  <table>
    <tr>
      <th>Método</th>
      <th>Ruta</th>
      <th>Descripción</th>
    </tr>
    <tr>
      <td>GET</td>
      <td><code>/login</code></td>
      <td>Pantalla de inicio de sesión</td>
    </tr>
    <tr>
      <td>GET</td>
      <td><code>/register</code></td>
      <td>Registro de nuevos usuarios</td>
    </tr>
    <tr>
      <td>GET</td>
      <td><code>/productos</code></td>
      <td>Listado de productos (protegido)</td>
    </tr>
    <tr>
      <td>GET</td>
      <td><code>/productos/nuevo</code></td>
      <td>Formulario para crear producto</td>
    </tr>
    <tr>
      <td>POST</td>
      <td><code>/productos</code></td>
      <td>Guardar nuevo producto</td>
    </tr>
    <tr>
      <td>GET</td>
      <td><code>/productos/{id}/editar</code></td>
      <td>Editar producto existente</td>
    </tr>
    <tr>
      <td>POST</td>
      <td><code>/productos/{id}</code></td>
      <td>Actualizar producto</td>
    </tr>
    <tr>
      <td>POST</td>
      <td><code>/productos/{id}/eliminar</code></td>
      <td>Eliminar producto</td>
    </tr>
  </table>


