# Full-Stack-SPA

Developed a Single Page Web Application (SPA) using Angular 2, RESTful Web Services, and JPA/Hibernate integrated with Amazon RDS.

## Tech Stack:

- **Frontend Development:** Angular, Bootstrap, Visual Studio Code
- **Backend Development:** Spring Boot Framework (STS tools)
- **Container Orchestration:** Docker, Rancher, Kubernetes, AWS EC2

## Required Accounts:

- AWS
- DockerHub

## Required Software:

- Spring Boot based STS
- Visual Studio Code
- Angular
- Node
- Maven
- Docker

## Included Folders:

1. **springboot-survey:** Backend application for RESTful Web Services using Spring Boot.
2. **Survey:** Angular application developed using Visual Studio Code.

## Amazon RDS:

This project initially utilized Amazon RDS; however, due to pricing concerns, it is currently not running. Any DBS Server can be used, and modifications should be made accordingly in the Spring Boot application.

## Spring Boot:

- Backend developed using Spring Boot in Java.
- STS installation required to run the application locally.
- Update the Database URL, username, and password in the `application.properties` file.
- Use the command `./mvnw spring-boot:build-image` to dockerize the application.
- Push the Docker image to `dockerusername/springboot-survey:0.0.5-SNAPSHOT`.
- Deployed on Rancher and EC2 instances to create a cluster (not currently running on the cloud).

## Angular:

- Developed Angular application using Visual Studio Code.
- Created four components: `Create-Survey`, `Student list`, `Update-Survey`, and a welcome page.
- Each component has its CSS and `.ts` files, adding functionality to the application.
- Dockerized the Angular application, pushed it to `dockerusername/angsurv:0.7`.
- Deployed on Rancher and EC2 machines to create a cluster (not currently running at the provided URL).

## Dockerfile for Angular:

```Dockerfile
FROM nginx:1.17.1-alpine
COPY nginx.conf /etc/nginx/nginx.conf
COPY /dist/survey /usr/share/nginx/html

# nginx.conf file:
events{}
http
{
  include /etc/nginx/mime.types;
  server {
    listen 80;
    server_name localhost;
    root /usr/share/nginx/html;
    index index.html;
    location / {
      try_files $uri $uri/ /index.html;
    }
  }
}
```


### References
Angular, Spring Boot, Rancher Documentation.
css

Feel free to adjust any part of it to better suit your preferences!
