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
1. Cleaning Project
   - ```$ mvn clean```
2. Running Tests
   - ```mvn test```
3. Build Application
   - ```mvn install```
4. Running Application
   -```java -cp target/superleague-1.0-SNAPSHOT.jar org.example.Main```
