##Build
mvn clean install

##Run
docker-compose -f docker-compose-rabbitmq.yml up -d

rasmi-rabbit-producer> mvn spring-boot:run

##Test
curl --location --request GET 'http://localhost:8080/hospital/producer?hId=1&hName=hospital1&address=address1'
or
curl --location --request GET 'http://localhost:8080/patient/producer?pId=123&pName=patient1&disease=disease1'

##save
http://localhost:8080/hospital/savehospital
Body--
{
"hId":3,
"hName":"hospital3",
"address":"address3"
}

http://localhost:8080/patient/savepatient
Body--
{
"pId":3,
"pName":"hospital2",
"disease":"disease2"
}



rasmi-rabbit-consumer> mvn spring-boot:run
Show data on browser::
http://localhost:15672/


user-name:guest
password:guest

##Stop Container
docker-compose -f docker-compose-rabbitmq.yml down