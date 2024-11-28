# Literalura - Gestión de Libros con Spring Boot

**Literalura** es una aplicación moderna desarrollada con **Spring Boot** que te permite gestionar un catálogo de libros mediante una interfaz sencilla y potente. Aprovechando la API **Gutendex** y la base de datos **PostgreSQL**, el proyecto ofrece a los usuarios la capacidad de buscar, filtrar y gestionar libros de dominio público de manera eficiente.

## Funcionalidades

- **Búsqueda de Libros**: Encuentra libros por título, autor o idioma.
- **Filtrado por Idioma**: Filtra los libros registrados por idioma.
- **Top 15 Libros**: Visualiza los 15 libros más registrados en el sistema.
- **Estadísticas de Libros**: Obtén estadísticas sobre el número total de libros y autores en el catálogo.
- **Interacción con la API Gutendex**: Accede a miles de libros de dominio público de la API Gutendex.
- **Gestión de Datos**: La persistencia de datos es gestionada mediante **Spring Data JPA** y una base de datos **PostgreSQL**.

## Tecnologías Utilizadas

- **Spring Boot**: Framework para el desarrollo de aplicaciones Java.
- **Spring Data JPA**: Para la interacción con la base de datos.
- **PostgreSQL**: Base de datos relacional utilizada para almacenar los datos de los libros.
- **Gutendex API**: API que permite acceder a libros de dominio público.
- **Java 11+**: Lenguaje de programación utilizado para el desarrollo.

## Instalación

Sigue estos pasos para instalar y ejecutar el proyecto en tu máquina local:

1. **Clona este repositorio**:
   ```bash
   git clone https://github.com/tu-usuario/literalura.git

2. Instala las dependencias: Si estás utilizando IntelliJ IDEA, abre el proyecto y Spring Boot se encargará de descargar las dependencias automáticamente.

3. Configura la base de datos: Asegúrate de tener PostgreSQL instalado y crea una base de datos llamada literalura. Luego, configura los detalles de la base de datos en el archivo application.properties ubicado en src/main/resources.

Abre el archivo application.properties y agrega las siguientes líneas para conectar con PostgreSQL:


spring.datasource.url=jdbc:postgresql://localhost:xxxx/literalura
spring.datasource.username=tu-usuario
spring.datasource.password=tu-contraseña
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.format_sql=true

Reemplaza tu-usuario y tu-contraseña con los datos correspondientes de tu base de datos.

4. Ejecuta el proyecto: Si usas IntelliJ IDEA, simplemente haz clic en el botón de Run o ejecuta el siguiente comando desde la terminal en el directorio raíz del proyecto:
``bash
 mvn spring-boot:run




Esto iniciará el servidor y podrás acceder a la aplicación en tu navegador.

Contribuir
Si deseas contribuir al proyecto, sigue estos pasos:

Haz un fork del repositorio.
Crea una rama con tu nueva característica (git checkout -b feature/nueva-caracteristica).
Realiza los cambios necesarios y haz un commit (git commit -am 'Añadir nueva característica').
Haz un push a tu rama (git push origin feature/nueva-caracteristica).
Crea un pull request describiendo los cambios que has realizado.
Licencia
Este proyecto está bajo la licencia MIT. Si deseas más detalles sobre la licencia, consulta el archivo LICENSE.

Contacto
Autor: Jansie Carolina García Soto

