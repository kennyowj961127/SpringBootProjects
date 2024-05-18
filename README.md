# SpringBootProjects

Build Docker Image procedure
1. mvn clean install -DskipTests
2. docker build . -t kennyowj961127/cards:s4 
3. docker image push docker.io/kennyowj961127/accounts:s4

Run rabbitmq command
 docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.12-management;           

Hookdeck command
hookdeck listen 8071 Source

Prerequisites ( Database and Redis )

docker run -p 3307:3306 --name accountsdb -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=accountsdb -d mysql &&
docker run -p 3308:3306 --name loansdb -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=loansdb -d mysql &&
docker run -p 3309:3306 --name cardsdb -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=cardsdb -d mysql &&
docker run -p 6379:6379 --name kennyredis -d redis


Apache benchmark
ab -n 10 -c2 -v 3 http://localhost:8072/kennybank/cards/api/contact-info


