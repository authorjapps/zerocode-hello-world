Zerocode Hello World
===

#### How to run the examples?
Ans: The same stuff you do everyday for any maven project.

> Step-1: 
Import the maven project "zerocode-rest-help" <br>
          * i.e. /zerocode-hello-world/pom.xml, <br>
          * then run following from the command line/terminal to bring in the libs to the local .m2 repo <br>
          * mvn clean install -DskipTests

> Step-2: 
Start the Mock REST server(-or- If you have a REST web application, you can point to that host,port) <br>
          * i.e. just Run as main() -> test/.../RunMeFirstRESTServer.java

> Step-3: <br>
          * Run the HelloWorld test  <br>
          * i.e. src/test/java/org/jsmart/zerocode/testhelp/tests/helloworld/JustHelloWorldTest.java

> -OR-

> Run as Suite:
          * src/test/java/org/jsmart/zerocode/testhelp/tests/HelloWorldSuite.java

> More examples:
          * src/test/java/org/jsmart/zerocode/testhelp/tests/helloworldmore/JustHelloWorldMoreTest.java

-done-


Now see the
* Results @ target/zerocode-test-reports
* Logs @ target/logs/zerocode_test_logs.log
* Test coverage CSV Report @ target/zerocode_full_report_YYYY-MM-DDTHH-MM-SS.SSS.csv
* Test coverage Chart @ target/zerocode_results_chart_YYYY-MM-DDTHH-MM-SS.SSS.html

