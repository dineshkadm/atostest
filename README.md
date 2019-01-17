This test is completed in approx. 2.5 hours. This is the demo application; hence limited validation added and focus mainly on happy path scenarios.

Due to the time constraint certain unit tests are not added. Also, code comments were not added.

The h2database is used as it is memory database and dose not required additional efforts.


### Building

The test can be built with

    mvn clean install


Build the project:

    mvn clean package
    mvn spring-boot:run 

The application exposes the following rest URLs:

- GET on `http://localhost:8080/customers`:  To getting all customers data.

- POST on `http://localhost:8080/customers` :  Add Customer

    curl -w "\n" -X POST http://localhost:8080/customers

    media type - application/json
    payload
       {

           "firstName": "Dinesh",
           "lastName": "Kadam"

       }

Note: The Id value is generated by the system.


- DELETE

    http://localhost:8080/customers/[customer ID]


The integration tests are added using Spring MVC mock framework. We can add more test scenarios there.
