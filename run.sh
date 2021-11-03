echo 'Cleaning Project'
mvn clean
echo  'Running Tests'
mvn test
echo 'Build'
mvn install
echo 'Running Application'
java -cp target/superleague-1.0-SNAPSHOT.jar org.example.Main
