# users-management-api
a User Management REST API system.

**Basic Architecture**
    1. Spring Boot Backend to manage REST API calls
    2. PostgreSql DB

**Quick Powerup**
    1. Powerup Postgre DB - run ./tools/restartPostgresDb.sh
    2. Powerup Main application -
        two options:
            1. Run Main.java
            2. As a Docker Container - run buildDockerImage.sh,
               than run:  Docker run user-mngmnt-api:latest --networks=host

**Endpoints**
 - Get Requests:
	 Get All Users: localhost:8080/api/v1/users
     Get User by Id: localhost:8080/api/v1/users/{id}
	     e.g localhost:8080/api/v1/users/33
 - Post Requests:
	 Add User: localhost:8080/api/v1/users
	     body: e.g -
	         {
	         "firstName": "dotan",
	         "lastName": "asrer",
	         "weight": 0.0,
	         "dateOfBirth": 0
	         }

	 Edit User by Id: localhost:8080/api/v1/users/{id}
        body required, e.g:
           {
           "firstName": "dotan",
           "lastName": "asrer",
           "weight": 0.0,
           "dateOfBirth": 0
           }
        Add test data:
		localhost:8080/api/v1/users/insertTestData/{amountOfUsers}
            use this endpoint to generate test data for testing purpose.
            e.g localhost:8080/api/v1/users/insertTestData/112
 - Delete Requests:
	    Delete User by Id: localhost:8080/api/v1/users/{id}
	        no body required