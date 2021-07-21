FROM openjdk:11.0.1-jdk-sid
VOLUME /tmp
EXPOSE 2000
ARG JAR_FILE
ADD ${JAR_FILE} app.jar
ENTRYPOINT exec java $JAVA_OPTS_PORTFOLIO -Djava.security.egd=file:/dev/./urandom -jar /app.jar --security.jwt.secret=${JWT_SECRET} --spring.data.mongodb.host=${DATABASE_HOST_PORTFOLIO} --spring.data.mongodb.port=${DATABASE_PORT_PORTFOLIO} --spring.data.mongodb.username=${DATABASE_USERNAME_PORTFOLIO} --spring.data.mongodb.password=${DATABASE_PASSWORD_PORTFOLIO} --spring.data.mongodb.database=${DATABASE_NAME_PORTFOLIO} --eureka.client.service-url.defaultZone=${EUREKA_SERVICE_URL}
