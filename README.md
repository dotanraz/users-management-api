
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
               than run:  docker run user-mngmnt-api:latest --networks=host

**Endpoints**
 - Get Requests:<br />
	 Get All Users: localhost:8080/api/v1/getAllUsers <br />
     Get User by Id: localhost:8080/api/v1/getUser/{id} <br />
	     e.g localhost:8080/api/v1/users/33 <br />
 - Post Requests: <br />
	 Add User: localhost:8080/api/v1/addUser <br />
	     body: e.g - <br />
	         {
	         "firstName": "dotan",
	         "lastName": "asrer"
	         } <br />

	  Edit User by Id: localhost:8080/api/v1/updateUser/{id} <br />
		  body required, e.g: <br />
	           {
	           "firstName": "dotan",
	           "lastName": "asrer"
	           } <br />
        
        Add test data: <br />
		localhost:8080/api/v1/insertTestData/{amountOfUsers} <br />
            use this endpoint to generate test data for testing purpose. <br />
            e.g localhost:8080/api/v1/users/insertTestData/112 <br />
  - Delete Requests:  <br />
	     Delete User by Id: localhost:8080/api/v1/deleteUser/{id} <br />
	        no body required <br />