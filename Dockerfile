FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY ./target/HotelService-0.0.1-SNAPSHOT.jar hotelService.jar
ENTRYPOINT [ "java","-jar","/hotelService.jar" ]