# spring-react-starter
A starter repository for a web application built with Spring and React

# Build the war file
./gradlew build

# Push to Cloud Foundry
cf push spring-react-starter -p build/libs/spring-react-starter.war

# Verify:
curl <URL> => <html><body>HELLO WORLD!</body></html>
curl <URL>/greeting => "{"id":666,"content":"Hello, World!"}"
curl <URL>/greeting?name=Bananaman => "{"id":666,"content":"Hello, Bananaman!"}"
