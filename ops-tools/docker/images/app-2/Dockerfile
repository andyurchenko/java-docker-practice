FROM maven:3-amazoncorretto-17-alpine
COPY . /app
WORKDIR /app
RUN --mount=type=cache,target=/root/.m2 mvn dependency:copy-dependencies -DincludeScope=runtime
EXPOSE 8080
