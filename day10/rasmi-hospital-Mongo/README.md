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
docker-compose -f docker-compose-mongo.yml up -d

```


## Post

``` 
 curl --request POST 'http://localhost:8083/saveHospital' --header 'Content-Type: application/json' --data-raw '{"hId": 12,"hName": "1re206","address": "Bangalore"}'```

## Get 

``` 
curl -X GET 'http://localhost:8083/getHospital?hId=12' 
```

## Put

``` 
curl -X PUT 'http://localhost:8083/updateHospital?hId=12&hName=Nims&address=Hyd'
```

## Delete

```
curl -X DELETE 'http://localhost:8083/deleteHospital?hId=12' 
```




## Show data

```
docker exec -it  rasmi-hospital-mongo-mongo-1 bash

mongo

show dbs

show tables

db.customer.find()

```

## Stop docker container
    docker-compose -f docker-compose-mongo.yml down

## Dockerization

### Maven 
Here i am using maven spotify plugin to create the docker image for this application.
Use the below command to create the docker image.
For creating please use your repository to create the image which will be easy to push image in your docker hub.
update in your pom.xml.
<docker.image.prefix> <your repo name> </docker.image.prefix>

```bash
$ mvn install dockerfile:build
```

### Push docker images

```bash
docker login

$ docker push <repository-name>/<app-name>

```

