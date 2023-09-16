# Full-Stack-SPA
 Developed a single page web application using Angular2, RESTful Web Services and JPA/Hibernate along with Amazon RDS. • Frontend Development: Angular, Bootstrap, Visual Studio Code • Backend Development: Spring Boot Framework through STS tools • Container Orchestration: Docker, Rancher, Kubernetes, AWS EC2

Required Accounts:
AWS,
DockerHub
Required Software:
Springboot based STS
VSCode
Angular
Node
Maven
Docker
Details of the included folders :
a. springboot-survey is Back End Application of RestFul Web Services made using Springboot FrameWork
b. Survey is an angular application made using VS Code

## Amazon RDS:
This project used Amazon RDS, but due to pricing, it’s not running. Any DBS Server can be used, please change it accordingly on the springboot app
## SPRING BOOT:
I used Spring Boot for backend using Java as programming language. STS installation is required to run the application locally.
Update the Database URL, username and password in the application.properties file.
Use the “./mvnw spring-boot:build-image” command to dockerise the application. Then push the docor image to dockerusername/springboot-survey:0.0.5-SNAPSHOT
Then, used Rancher and EC2 instances to create a cluster and deployed the application. Application is not running on the cloud now
## ANGULAR:
Used VSCode to create angular application. Developed four components: Create-Survey, Student list, update-survey, and welcome page for our application.
Each component has its CSS and .ts files, which add functionality to the application.
Created a dockerfile with following content.
FROM nginx:1.17.1-alpine
COPY nginx.conf /etc/nginx/nginx.conf COPY /dist/survey /usr/share/nginx/html
nginx.conf file :
events{} http { include /etc/nginx/mime.types; server { listen 80; server_name localhost; root /usr/share/nginx/html; index index.html; location / { try_files $uri $uri/ /index.html; } } }
Dockerised it and pushed it to Dockerusername/angsurv:0.7
Then used Rancher and EC2 machines to create a cluster, and the application is not currently running at the url
## References:
1. Angular, Spring Boot, Rancher Documentation.
