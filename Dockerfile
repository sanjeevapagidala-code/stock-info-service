# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the application's JAR file to the container
COPY target/trade-now-0.0.1-SNAPSHOT.jar app.jar

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]

#Build the project using Maven: mvn clean package
#Build the Docker image:docker build -t trade-now-app .
#Run the Docker container:docker run -p 8080:8080 trade-now-app
