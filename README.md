Liveasy Backend Development Assignment
Overview
This project is a backend service developed as part of the Liveasy assignment for the backend development role. The service is built using the Spring Boot framework, with PostgreSQL as the database. The APIs developed in this project align with the requirements provided in the assignment documentation.

Tech Stack
Backend Framework: Spring Boot
Database: PostgreSQL
Language: Java
Build Tool: Maven
Version Control: Git
Deployment: Local server (port 8082)
APIs Implemented
The following APIs have been developed as per the assignment requirements:

POST /load/save : Adds new load details.

Payload:
json
Copy code
{
  "loadingPoint": "delhi",
  "unloadingPoint": "jaipur",
  "productType": "chemicals",
  "truckType": "canter",
  "noOfTrucks": "1",
  "weight": "100",
  "comment": "",
  "shipperId": "shipper:<UUID>",
  "Date": "dd-mm-yyyy"
}
Response: "Load details added successfully"

GET /load/shipperids: Retrieves a list of loads by shipperId.
Query Parameters:
shipperId (required)
Response: Returns a list of loads associated with the shipperId.
[
    "SI:<sm19sly>",
    "shipper:<UUID>",
    "shipper:<15ply>",
    "shipper:<21tly",
    "shipper:<25SIly>",
    "shipper:<30SWly>",
    "shipper:<45Lily>",
    "shipper:<28CLly>",
    "shipper:<12COly>",
    "shipper:<19CBly>"
]

GET /load/{loadId}: Retrieves load details by loadId.
{
    "id": 9,
    "loadingpoint": "chandighar",
    "unloadingpoint": "bhopal",
    "producttype": "Cosmetics",
    "trucktype": "Auto",
    "nooftrucks": 4,
    "weight": 200,
    "comments": "Makeup",
    "shipperid": "shipper:<12COly>",
    "date": "2025-03-20T00:00:00.000+00:00"
}

Response: Returns the load details for the specified loadId.
PUT /load/{loadId}: Updates load details by loadId.

Payload:
json
Copy code
{
    "id": 5,
    "loadingpoint": "vadodara",
    "unloadingpoint": "thrivendram",
    "producttype": "ShuttleItems",
    "trucktype": "Container",
    "nooftrucks": 5,
    "weight": 800,
    "comments": "playthings",
    "shipperid": "shipper:<25SIly>",
    "date": "2025-01-05T00:00:00.000+00:00"
}
Response: "Load details updated successfully"

DELETE /load/{loadId}: Deletes load details by loadId.

Response: "Load details deleted successfully".


Database Schema
A PostgreSQL database is used, with the following tables:
Table: items
Columns: [id,loadingpoint,unloadingpoint,producttype,trucktype,nooftrucks,weight,comments,shipperid,date]

How to Run the Project
Clone the repository:
git clone  https://github.com/sasikiranmeesala/Liveasy_Assignment.git
Install the required dependencies using Maven:

mvn clean install
Configure the PostgreSQL database connection:

Update application.properties or application.yml with your PostgreSQL database URL, username, and password:
spring.datasource.url=jdbc:postgresql://localhost:5432/items
spring.datasource.username=yourusername
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update

Run the Spring Boot application:
mvn spring-boot:run

Access the APIs:
Base URL: http://localhost:8082
Example: http://localhost:8082/load/save

Testing
You can use tools like Postman or Curl to test the APIs. Example requests are available for each API endpoint.

Contact
For any further clarifications or questions, feel free to reach out at sasikiran1713@gmail.com.

