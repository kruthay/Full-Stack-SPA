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
Unzip the file SourceFiles.zip. It consists of two folders :
a. springboot-survey is Back End Application of RestFul Web Services made using Springboot FrameWork
b. Survey is an angular application made using VS Code

SPRING BOOT:
Not used Eclipse EE with MYSQL RDS. Instead, Spring Boot is used. 
STS installation is required to run the application locally. 
Updated the RDS URL, username and password in the application.properties file. 
Used the “./mvnw spring-boot:build-image” command to dockerize the application. Then we’ve pushed the 
image to kanewilliamson/springboot-survey:0.0.5-SNAPSHOT
Then, used Rancher and EC2 instances to create a cluster and deployed the application

ANGULAR:
Used VSCode as suggested to create our angular application. Developed four components: Create-Survey, 
Student list, update-survey, and welcome for our application.
Each component has its CSS and .ts files, which add functionality to the application.
Created a dockerfile with content

FROM nginx:1.17.1-alpine
COPY nginx.conf /etc/nginx/nginx.conf
COPY /dist/survey /usr/share/nginx/html
nginx.conf file :
events{}
http {
 
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
Dockerized it and pushed it to kanewilliamson/angsurv:0.7
Then used Rancher and EC2 machines to create a cluster, and the application was deployed  to AWS Ec2 instance
