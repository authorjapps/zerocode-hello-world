Zerocode Hello World
===

Sample API testing code using [JUnit](https://github.com/junit-team/junit4) and [Zerocode](https://github.com/authorjapps/zerocode) test framework
> The simple and convinient way of testing your APIs

![hello_gif](https://user-images.githubusercontent.com/12598420/48679206-33616a00-eb85-11e8-9b6f-11f22c8ee813.gif)

<br/>

Maven and CI 🔨
====

**Continuous Integration:** [![Build Status](https://travis-ci.com/authorjapps/zerocode-hello-world.svg?branch=master)](https://travis-ci.org/authorjapps/zerocode-hello-world) <br/>


##### This HelloWorld project can be setup via POM as well as Gradle.

_For Gradle setup, please see the [README-GRADLE.md](https://github.com/authorjapps/zerocode-hello-world/blob/master/README-GRADLE.md) file_


#### Maven library-
```xml
<dependency>
    <groupId>org.jsmart</groupId>
    <artifactId>zerocode-tdd</artifactId>
    <version>1.3.x</version>
</dependency>
```
+ Look maven central for [latest version](https://search.maven.org/search?q=a:zerocode-tdd).



#### How to run the examples?
Ans: The same and usual stuff you do everyday for any maven project.

Step-1: 
* Import this maven project `zerocode-hello-world` using Eclipse or IntelliJ or your favourite IDE
```
          * i.e. /zerocode-hello-world/pom.xml, 
          * mvn clean install -DskipTests
          * The above command brings all the libs to the local .m2 repo
```

Step-2:
* Run the JustHelloWorldTest.java test (it invokes GitHub REST https apis and asserts the result)
```
          * i.e. src/test/java/org/jsmart/zerocode/testhelp/tests/helloworld/JustHelloWorldTest.java
          * Then, you can fiddle with the assertions/verify section and run the test again, 
            observe the PASS/FAILURES at the console.
          
          * To run more tests go to individual package and run. e.g. folders-  helloworldgithub, helloworldmore etc
```
Done.
That's it. It is as simple as that. 

* * * * * * * * * * * *

See more(optional) below what happens when test run is completed.

#### Sample **test run log** below for reference-

Quick look at the test case and its **run log** below-

- JUnit Test case-
```java
@TargetEnv("github_host.properties")
@RunWith(ZeroCodeUnitRunner.class)
public class JustHelloWorldTest {

    @Test
    @Scenario("helloworld/hello_world_status_ok_assertions.json")
    public void testGet() throws Exception {
    
    }

}
```

- Test case JSON content of _"helloworld/hello_world_status_ok_assertions.json"_

```javaScript
{
    "scenarioName": "Invoke GitHub RESTful GET api and assert the response",
    "steps": [
        {
            "name": "get_user_details",
            "url": "/users/siddhagalaxy",
            "method": "GET",
            "request": {
            },
            "verify": {
                "status": 200,
                "body": {
                    "login" : "siddhagalaxy",
                    "id" : 33847730,
                    "type" : "User"
                }
            }
        }
    ]
}
```
- github_host.properties contains-
```properties
# Web Server host and port
restful.application.endpoint.host=https://api.github.com
restful.application.endpoint.port=443

# Web Service context; Leave it blank in case you do not have a common context
restful.application.endpoint.context=
```

- Output i.e. the **actual** Response and **expected** Response -
```java
2018-04-10 21:47:33,748 [main] INFO o.j.z.c.r.ZeroCodeMultiStepsScenarioRunnerImpl - 
------ BDD: Scenario:Invoke GitHub RESTful GET api and assert the response -----

2018-04-10 21:47:34,700 [main] INFO org.jsmart.zerocode.core.runner.StepNotificationHandler - 
***Step PASSED:
GIVEN- the GitHub REST end point, WHEN- I invoke GET, THEN- I will receive the 200 status with body
->get_user_details

--------- TEST-STEP-CORRELATION-ID: 0b27d9e4-d3ff-46c8-9b10-53fa0f153a33 ---------
requestTimeStamp:2018-04-10T21:47:33.768
step:get_user_details
url:https://api.github.com:443/users/siddhagalaxy
method:GET
request:
{ } 
--------- TEST-STEP-CORRELATION-ID: 0b27d9e4-d3ff-46c8-9b10-53fa0f153a33 ---------
Response:
{
  "status" : 200,
  "headers" : {
    "Server" : [ [ "GitHub.com" ] ],
    "Content-Type" : [ [ "application/json; charset=utf-8" ] ],
    "ETag" : [ [ "W/\"638280d346aa3b795c938e1635ac65a9\"" ] ],
    "Cache-Control" : [ [ "public, max-age=60, s-maxage=60" ] ],
    "X-Runtime-rack" : [ [ "0.072247" ] ],
    "Status" : [ [ "200 OK" ] ]
  },
  "body" : {
    "login" : "siddhagalaxy",
    "id" : 33847730,
    "avatar_url" : "https://avatars0.githubusercontent.com/u/33847730?v=4",
    "gravatar_id" : "",
    "url" : "https://api.github.com/users/siddhagalaxy",
    "html_url" : "https://github.com/siddhagalaxy",
    "type" : "User",
    "created_at" : "2017-11-20T22:13:14Z",
    "updated_at" : "2018-03-26T19:57:08Z"
  }
}
*responseTimeStamp:2018-04-10T21:47:34.692 
*Response delay:924.0 milli-secs 
---------> Assertion: <----------
{
  "status" : 200,
  "body" : {
    "login" : "siddhagalaxy",
    "id" : 33847730,
    "type" : "User"
  }
} 
-done-

**FINISHED executing all Steps for [Invoke GitHub RESTful GET api and assert the response] **.
Steps were:[get_user_details]
```

---


So what happens when your tests grows to **thousands** in numbers? 
You then, need to organize them by feature, by consumer and/or by profile etc. Hence Zerocode helps here to maintain peace! 

Also it **saves** you from creating **hundreds** of java `Pojos` with `getters/setters`, creating their **builders** and getting lost in `visualizing` or `interpreting` in mind how the actual request/response could look like.
This hassle one has to face **everytime** you run the tests **or** encounter a test failure **or** during a bug/scenario analysis.

Running Local Mock Server(for other Hello World tests)
===

Step-3: (Optional Step to bring up **local REST server** and fiddle with the tests)
```java
Start the Local Mock REST server
          * i.e. just Run as main() -> test/.../RunMeFirstLocalMockRESTServer.java. 
          * Then you can run the src/test/java/org/jsmart/zerocode/testhelp/tests/helloworldmore/JustHelloWorldMoreTest.java
```

Run as Suite:
```java
          * src/test/java/org/jsmart/zerocode/testhelp/tests/HelloWorldGitHubSuite.java

More examples:
          * src/test/java/org/jsmart/zerocode/testhelp/tests/helloworldmore/JustHelloWorldMoreTest.java
          * -or- Browse under test/resources/ folders- helloworld, helloworld_github_REST_api, helloworld_more
```
Done.

Now you can see the-
* Reports @ `target`
* Logs @ `target/logs/zerocode_test_logs.log`
* Test coverage CSV Report @ `target/zerocode_full_report_YYYY-MM-DDTHH-MM-SS.SSS.csv`
* Test coverage Chart @ `target/zerocode_results_chart_YYYY-MM-DDTHH-MM-SS.SSS.html`
* More [reports](https://github.com/authorjapps/zerocode#generated-reports-and-charts)

References:
---
Eclipse(General key-board shotcuts):
=====
For quick reference only- See more eclipse keys https://www.linkedin.com/pulse/top-30-eclipse-keyboard-shortcuts-java-programmer-jayveersinh-solanki/
1. Open a matching java file -> Ctrl + Shift + R
1. Open a matching JSON file -> Ctrl + Shift + R
1. To navigate to file -> Ctrl + Click
1. Clik a JSON file and navigate to it's JUnit Test -> Alt+Cmd+G(Mac: ⌥+⌘+G), Windows(Alt+Ctrl+G)

IntelliJ(General key-board shotcuts):
=====
More keys: https://www.jetbrains.com/help/idea/mastering-intellij-idea-keyboard-shortcuts.html
1. Open a matching java file -> Ctrl + n
1. Open a matching JSON or XML file -> Ctrl + Shift + n
1. To navigate to file -> Ctrl + Click
1. Usage/invocation of a JSON file or Java File or Java method/variable etc -> Alt + F7
