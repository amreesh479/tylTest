# tylTest

This test framework uses the Page Object Model. The main end to end test flow has been tested in `Purchase.feature` file and has been tagged with `@test`

The test can be executed on Chrome/Firefox browser by updating browser value in `config.properties` file.

chromedriver and geckodriver have been added to this project at `/src/test/java/com/tyltest/solution/config`. They are required to run the tests. Please check they are available before running the tests.

There are multiple options available to run the test

1. From maven command line

    `mvn clean install`

2. From `TestRunner` class available at `/src/test/java/com/tyltest/solution`

3. From `Purchase.feature` file available at `/src/test/resources`
 
    



