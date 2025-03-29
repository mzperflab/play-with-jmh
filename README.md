# Play With Java Microbenchmark Harness
Introduction project for JMH the java micro benchmarking tool

# Create Project
````bash
mvn archetype:generate
    -DinteractiveMode=false
    -DarchetypeGroupId=org.apache.maven.archetypes
    -DarchetypeArtifactId=maven-archetype-quickstart 
    -DarchetypeVersion=1.5
    -DgroupId=io.performancelab
    -DartifactId=play-with-jmh
    -Dversion=1.0
````

# Build & Package
```bash 
mvn clean install package
```

# Run from command line 
```bash
java -jar target/play-with-jmh-1.0-SNAPSHOT.jar
```
 
