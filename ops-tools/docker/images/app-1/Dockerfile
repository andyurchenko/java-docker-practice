FROM maven:3.9.9-amazoncorretto-17-al2023
COPY . /app
WORKDIR /app
RUN --mount=type=cache,target=/root/.m2 mvn dependency:copy-dependencies -DincludeScope=runtime
EXPOSE 8080
CMD mvn spring-boot:run -Dspring-boot.run.jvmArguments='-Dspring.datasource.url=jdbc:postgresql://postgres:5432/school -Dspring.redis.host=redis'
