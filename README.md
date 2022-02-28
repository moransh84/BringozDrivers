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
### Basic Endpoints
The microservice should expose CRUD endpoints in a RESTful way and respond with JSON format.

#### Create driver
- Route: `/drivers/add`
- Method: `POST`

#### Get driver
- Route: `/drivers/:id`
- Method: `GET`

#### update driver
- Route: `/drivers/:id`
- Method: `PUT`

#### delete driver
- Route: `/drivers/:id`
- Method: `DELETE`

#### get all drivers
- Route: `/drivers/all`
- Method: `GET`

### Query Endpoints

#### Active Drivers
Query all active drivers
- Route: `/active-drivers`

#### Drivers In Time Window
Query all drivers that working in a specific time window
- Route: `/time-window?fromHour=:fromHour&toHour=:toHour`