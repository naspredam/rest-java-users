start:
	./gradlew build
	docker build -t rest-spring-boot-reactive-java-users .
	docker-compose up -d

stop:
	docker-compose down
