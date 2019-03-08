
From command line
mvn process-resources
mvn process-test-resources
mvn clean resources:resources
mvn clean resources:testResources
mvn -Dproject.name="Override from command line" process-resources
mvn clean -P prod -Dproject.name="Override from command line" process-resources

Check the target folder after every execution.