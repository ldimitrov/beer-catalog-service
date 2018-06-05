# beer-catalog-service

Simple service with simple `Beer` JPA Entity model and repository with `CommandLineRunner` to pupulate the database automatically.

# Start the application
./mvnw spring-boot:run

After it starts you should be able to open: 
[http://localhost:8762/beers](http://localhost:8762/beers) endpoint

If you start the following eureka service:

[https://github.com/ldimitrov/eureka-service](https://github.com/ldimitrov/eureka-service)
you should see the `beer-catalog-service` as a registered instance with Eureka 
