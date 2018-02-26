Zerocode Hello World
===

#### How to run the examples?
Ans: The same stuff you do everyday for any maven project.

```
Step-1: 
Import the maven project "zerocode-rest-help" 
          * i.e. /zerocode-hello-world/pom.xml, 
          * mvn clean install -DskipTests
          * The above command brings all the libs to the local .m2 repo

Step-2: 
Start the Mock REST server
          * i.e. just Run as main() -> test/.../RunMeFirstRESTServer.java

Step-3: 
          * Run the JustHelloWorldTest.java test  
          * i.e. src/test/java/org/jsmart/zerocode/testhelp/tests/helloworld/JustHelloWorldTest.java
```

> -OR-

```
Run as Suite:
          * src/test/java/org/jsmart/zerocode/testhelp/tests/HelloWorldSuite.java

More examples:
          * src/test/java/org/jsmart/zerocode/testhelp/tests/helloworldmore/JustHelloWorldMoreTest.java
```
-done-


Now see the
* Results @ `target/zerocode-test-reports`
* Logs @ `target/logs/zerocode_test_logs.log`
* Test coverage CSV Report @ `target/zerocode_full_report_YYYY-MM-DDTHH-MM-SS.SSS.csv`
* Test coverage Chart @ `target/zerocode_results_chart_YYYY-MM-DDTHH-MM-SS.SSS.html`

