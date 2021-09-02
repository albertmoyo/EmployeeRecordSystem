**Employee Record System**

Build

`mvn clean install`

Run

`mvn spring-boot:run`

**Swagger UI**

http://localhost:8099/employee-service-api/swagger-ui.html#/

**REST API**

Request:
-Create Employee:
`curl -X POST "http://localhost:8099/employee-service-api/api/employee/save" -H "accept: */*" -H "Content-Type: application/json" -d "{ \"dateOfExit\": \"2021-09-02T13:37:57.816Z\", \"dateOfJoining\": \"2021-09-02T13:37:57.816Z\", \"employeeRoleMapping\": [ { \"employeeId\": \"1\", \"roleId\": \"1\", \"effectiveDate\": \"2021-09-02T13:37:57.816Z\" } ], \"firstName\": \"Albert\", \"lastName\": \"J\", \"middleName\": \"Moyo\", \"status\": 1}"`

Response:
`{
"employeeId": 2,
"firstName": "Albert",
"middleName": "Moyo",
"lastName": "J",
"dateOfJoining": "2021-09-02T13:37:57.816+00:00",
"dateOfExit": "2021-09-02T13:37:57.816+00:00",
"status": 1,
"employeeRoleMapping": [
{
"employeeId": 1,
"roleId": 1,
"effectiveDate": "2021-09-02T13:37:57.816+00:00"
}
]
}`

-getEmployees

Response:
`[
{
"employeeId": 1,
"firstName": "Albert",
"middleName": "Moyo",
"lastName": "J",
"dateOfJoining": "2021-09-02T13:37:57.816+00:00",
"dateOfExit": "2021-09-02T13:37:57.816+00:00",
"status": 1,
"employeeRoleMapping": []
},
{
"employeeId": 2,
"firstName": "Albert",
"middleName": "Moyo",
"lastName": "J",
"dateOfJoining": "2021-09-02T13:37:57.816+00:00",
"dateOfExit": "2021-09-02T13:37:57.816+00:00",
"status": 1,
"employeeRoleMapping": []
},
{
"employeeId": 3,
"firstName": "Albert",
"middleName": "Moyo",
"lastName": "J",
"dateOfJoining": "2021-09-02T13:37:57.816+00:00",
"dateOfExit": "2021-09-02T13:37:57.816+00:00",
"status": 1,
"employeeRoleMapping": []
},
{
"employeeId": 4,
"firstName": "Albert",
"middleName": "Moyo",
"lastName": "J",
"dateOfJoining": "2021-09-02T13:37:57.816+00:00",
"dateOfExit": "2021-09-02T13:37:57.816+00:00",
"status": 1,
"employeeRoleMapping": []
},
{
"employeeId": 5,
"firstName": "Albert",
"middleName": "Moyo",
"lastName": "J",
"dateOfJoining": "2021-09-02T13:37:57.816+00:00",
"dateOfExit": "2021-09-02T13:37:57.816+00:00",
"status": 1,
"employeeRoleMapping": []
}
]`

-deleteEmployee
Request:
`curl -X DELETE "http://localhost:8099/employee-service-api/api/employee/deleteEmployee/1" -H "accept: */*"`

Response:
`Delete successful!`

-searchEmployeeByFirstName i.e 'Albert'

Request:
`curl -X GET "http://localhost:8099/employee-service-api/api/employee/getEmployeesSearchByName/Albert" -H "accept: */*"`

Response:
`[
{
"employeeId": 1,
"firstName": "Albert",
"middleName": "Moyo",
"lastName": "J",
"dateOfJoining": "2021-09-02T13:37:57.816+00:00",
"dateOfExit": "2021-09-02T13:37:57.816+00:00",
"status": 1,
"employeeRoleMapping": []
},
{
"employeeId": 2,
"firstName": "Albert",
"middleName": "Moyo",
"lastName": "J",
"dateOfJoining": "2021-09-02T13:37:57.816+00:00",
"dateOfExit": "2021-09-02T13:37:57.816+00:00",
"status": 1,
"employeeRoleMapping": []
},
{
"employeeId": 3,
"firstName": "Albert",
"middleName": "Moyo",
"lastName": "J",
"dateOfJoining": "2021-09-02T13:37:57.816+00:00",
"dateOfExit": "2021-09-02T13:37:57.816+00:00",
"status": 1,
"employeeRoleMapping": []
},
{
"employeeId": 4,
"firstName": "Albert",
"middleName": "Moyo",
"lastName": "J",
"dateOfJoining": "2021-09-02T13:37:57.816+00:00",
"dateOfExit": "2021-09-02T13:37:57.816+00:00",
"status": 1,
"employeeRoleMapping": []
},
{
"employeeId": 5,
"firstName": "Albert",
"middleName": "Moyo",
"lastName": "J",
"dateOfJoining": "2021-09-02T13:37:57.816+00:00",
"dateOfExit": "2021-09-02T13:37:57.816+00:00",
"status": 1,
"employeeRoleMapping": []
}
]`

To run the angular part:
- navigate to \Employee Record System\src\main\ui>

## Node_modules folder

Contents of the Folder `node_modules` will not exist at the time of pushing to the branch, however
running `npm install` in the `\Employee Record System\src\main\ui>` directory  will fetch all dependencies itself which adds time to the slug compile step.
## Build
Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory. Use the `--prod` flag for a production build.

## Development server
- Run `ng serve` for a dev server.
This will start-up the Angular app:
`** Angular Live Development Server is listening on localhost:4200, open your browser on http://localhost:4200/ **
`
- Add some Employees through the API call:
   Request:
   -Create Employee:
   `curl -X POST "http://localhost:8099/employee-service-api/api/employee/save" -H "accept: */*" -H "Content-Type: application/json" -d "{ \"dateOfExit\": \"2021-09-02T13:37:57.816Z\", \"dateOfJoining\": \"2021-09-02T13:37:57.816Z\", \"employeeRoleMapping\": [ { \"employeeId\": \"1\", \"roleId\": \"1\", \"effectiveDate\": \"2021-09-02T13:37:57.816Z\" } ], \"firstName\": \"Albert\", \"lastName\": \"J\", \"middleName\": \"Moyo\", \"status\": 1}"`
   
Once Employees have been loaded through the API - Create Employee,
the Angular screen will contain a table with Employee Data.



