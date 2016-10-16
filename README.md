# spring-react-starter
A starter repository for a web application built with Spring and React

### Build the war file
```
./gradlew build
```

### Push to Cloud Foundry
```
cf push spring-react-starter -p build/libs/spring-react-starter.war
```

### Verify:
```
curl <URL> => <html><body>HELLO WORLD!</body></html> \n
curl <URL>/greeting => "{"id":666,"content":"Hello, World!"}" \n
curl <URL>/greeting?name=Bananaman => "{"id":666,"content":"Hello, Bananaman!"}"
```


## To do:
Stand up a CI environment
Spin up two separate instances of the application, faux-prod and faux-staging.
Introduce jasmine and capybara
Replace state management with Redux
Introduce routing
Introduce a CLI
Write api tests and extract services