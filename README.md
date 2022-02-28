# Drivers App

The goal of this project is to assess development skills suitable for a backend developer position. It tests knowledge and proficiency with software design, unit testing and web technologies like HTTP and REST.

Drivers microservice service responsibility is to store, maintain and query driver’s data.

## Driver domain
A driver model should store the following data: personal information (such as name, age, address), driver status, working hours and current location.

## Installation
1. [install Mysql](https://www.mysqltutorial.org/install-mysql/)
2. open Mysql client terminal:
3. `create database drivers_app`;
4. `create user 'springuser'@'%' identified by 'ThePassword'`;
5. `grant all on drivers_app.* to 'springuser'@'%'`;

## Run
To run the application use `./gradlew bootRun`

## Endpoints
## Basic Endpoints
The microservice should expose CRUD endpoints in a RESTful way and respond with JSON format.

### Create driver
- Route: `/drivers/add`
- Method: `POST`

### Get driver
- Route: `/drivers/:id`

### update driver

### delete driver

### get all drivers

## Query Endpoints

### Active Drivers
Query all active drivers
- Route: `/active-drivers`

### Drivers In Time Window
- Route: `/time-window?fromHour=:fromHour&toHour=:toHour`

The microservice should expose a query endpoints with the ability to query all active drivers, drivers that currently located in map bounds and drivers that working in a specific time window.



curl 'http://localhost:8080/drivers/all'

curl http://localhost:8080/drivers/add -d name=dorka -d age=25 -d address=holon -d status=INACTIVE -d startWorkingHour=12 -d endWorkingHour=17 -d latitude=12.552 -d long
itude=35.55 -X POST

// לא ביצענו בדיקה לנתונים שנכנסים

curl 'http://localhost:8080/drivers/5' -X DELETE

curl 'http://localhost:8080/drivers/active'

curl http://localhost:8080/drivers/timeWindow -d fromHour=10 -d toHour=17