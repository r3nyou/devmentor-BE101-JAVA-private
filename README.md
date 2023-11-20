## setup
```
docker build -t mvn-openjdk-17 .
docker run -it --rm -v "$PWD":/var/www mvn-openjdk-17 bash
```

Run main method
```
mvn compile exec:exec
```

Run unit test
```
mvn test
```