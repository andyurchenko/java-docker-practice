FROM maven:3-amazoncorretto-17-alpine
COPY . /app
WORKDIR /app
RUN mvn package -DskipTests
RUN cp target/*.jar app.jar
EXPOSE 8080
