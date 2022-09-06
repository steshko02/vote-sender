FROM adoptopenjdk/openjdk16:alpine-jre
ARG JAR_FILE=target/VoteSender-1.0-SNAPSHOT.jar
WORKDIR /opt/vote_sender
COPY ${JAR_FILE} vote_sender.jar
ENTRYPOINT ["java","-jar","vote_sender.jar"]