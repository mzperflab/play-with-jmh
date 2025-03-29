# Play With Java Microbenchmark Harness
introduction project for jmh the java benchmarking tool
# Create Project
mvn archetype:generate
    -DinteractiveMode=false
    -DarchetypeGroupId=org.apache.maven.archetypes
    -DarchetypeArtifactId=maven-archetype-quickstart 
    -DarchetypeVersion=1.5
    -DgroupId=io.performancelab
    -DartifactId=play-with-jmh
    -Dversion=1.0

# Build & Package  
mvn clean install package

# Run from command line 
java -jar target/play-with-jmh-1.0-SNAPSHOT.jar

 
