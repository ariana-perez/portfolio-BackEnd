# 💻 Portfolio Web - #YoProgramo

*NOTA: En este repositorio se encuentra todo lo relacionado al **Backend** del proyecto, para dirigirse al repositorio del Frotend hacer click en el siguiente Link: 
https://github.com/ariana-perez/portfolio-FrontEnd.git 

- ***Backend** del **Portfolio Web Fullstack*** realizado como Proyecto Final del curso **Argentina Programa - #YoProgramo**.

- Se trata de una **API REST** realizada utilizando las tecnologías **Java + Spring Boot** bajo el modelo **MVC** para la lógica y **MySQL** para persistencia de datos.

- A continuación se incluye el **Diagrama Entidad - Relación** (DER) utilizado en la Base de Datos Relacional y que posteriormente se traduce en los Modelos o Entidades del Backend:

<div align="center">
<img src= "https://user-images.githubusercontent.com/106455100/187568665-137d8801-ce1a-4b0d-b6a1-7800a1bb62c0.png" width="800px">
 </div>

 
  # ⌨🖱 Instalación
- Si queremos correr la aplicación en un entorno local debemos tener en cuenta lo siguiente: 

1. Clonar el repositorio utilizando GIT o descargando el archivo ZIP:
 
   `git clone https://github.com/ariana-perez/portfolio-BackEnd.git`
  
2. Instalar las dependencias de Maven utilizando nuestro IDE preferido o a través del comando:

    `mvn install`

3. Crear/Configurar el archivo _application.properties_ en src/main/resources/

```properties
spring.jpa.hibernate.ddl-auto = update
spring.datasource.url = jdbc:mysql://<host_DB>:<puerto_DB>/<nombre_DB>?serverTimezone=UTC&createDatabaseIfNotExist=true
spring.datasource.username = <usuario>
spring.datasource.password= <contraseña>
spring.jpa.database-platform = org.hibernate.dialect.MySQL8Dialect
portfolio.jwtSecret = <clave_alfanumérica_JWT>
portfolio.jwtExpirationMs = <tiempo_expiración_JWT> 
```
NOTA: Reemplazar los valores borrando los <>.

4. Ejecutar nuestra aplicación iniciando el archivo `ApApplication.java` o bien ejecutando el siguiente comando:
    `mvn sprin-boot:run`
    
 ## 📩 Contacto
🙋‍♂️Si tienes dudas o te interesa ponerte en contacto conmigo podés hacerlo a través de:
**[Whatsapp](https://api.whatsapp.com/send/?phone=5491158028233&text&type=phone_number&app_absent=0) - [Github](https://github.com/ariana-perez) - [Web](https://frontendaap.web.app/)**
