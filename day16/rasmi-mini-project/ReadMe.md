## Build the app

``` 
mvn clean install
```

## Run the app

``` 
docker-compose -f docker-compose-mongo.yml up -d
mvn spring-boot:run

```
## Creating docker image

```
mvn install dockerfile:build

```
## running docker compose

``` 
docker-compose up -d

```


## Post

http://localhost:9090/doctor/save
http://localhost:9090/patient/save
``` 
```

## Get
http://localhost:9090/doctor/doctorappointment?doctorName=doctor1
http://localhost:9090/patient/myappointment?patientName=pat1

``` 

```

```




## Show data

```
docker exec -it <containerName> bash

mongo

show dbs

use db name


show tables

db.prescription.find()
db.appointment.find()


```

## Stop docker container
    docker-compose -f docker-compose-mongo.yml down

