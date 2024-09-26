FROM maven:3.9.9-amazoncorretto-17-al2023
# COPY . /app
# WORKDIR /app
# RUN mvn clean package
# COPY app/target/*.jar /app.jar

COPY target/*.jar /app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]