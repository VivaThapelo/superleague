# Span super league

<h1>A league table for Span Digital</h1>

**Prerequisite for running application:**
1. Java 8 SDK
    - Download from the Oracle website
    - Install it on your system
2. Maven
    - Use Homebrew to install maven 
    Run ($ brew install maven) on the terminal
3. Bash Terminal
   - Run the bash file run.sh
   ($ ./run.sh) on the terminal
4. Code Editing Tool
   - Open run.sh to understand what it does.
   - It cleans the maven project
   - Runs tests
   - Builds the application
   - Runs the application

**Manually running commands**
Cleaning Project
```$ mvn clean```
Running Tests
```mvn test```
Build Application
```mvn install```
Running Application
```java -cp target/superleague-1.0-SNAPSHOT.jar org.example.Main```
