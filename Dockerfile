FROM maven:3.8.5-openjdk-17

WORKDIR /var/www
COPY . /var/www
VOLUME /var/www

# RUN javac src/main/java/com/devmentor/App.java

# CMD ["java", "App"]