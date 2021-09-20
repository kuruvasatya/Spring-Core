From alpine/git
WORKDIR /app
RUN git clone https://github.com/kuruvasatya/Spring-Core.git

From maven:3.5-jdk-8-alpine
WoRKDIR /app
COPY --from=0 /app/Spring-Core/Mini_Project /app
RUN mvn clean install package

FROM openjdk:8-jre-alpine
WORKDIR /app
copy --from=1 /app/target/Mini_Project-0.0.1-SNAPSHOT.jar /app
CMD java -cp Mini_Project-0.0.1-SNAPSHOT.jar com.test.Test