
> Gradle - A build tool simillar to maven

How to build and run using Gradle ?
===

You need to have [Gradle](http://www.gradle.org/installation) and [Java 1.8+](http://www.oracle.com/technetwork/java/javase/downloads/index.html) installed.

This document gives you the basics of how to run this praject as gradle project.
1. Version used - gradle-4.10.2
1. Use the gradlew file as per your OS (.bat file for windows and .sh file for UNIX/LINUX/Mac OS.)
+ Basic commands for clean build.
  + Go into your project folder. i.e. `zerocode-hello-world`
  + Run `./gradlew clean build` to build your project.
  + Then right click and run any test as JUnit, from the folder `../zerocode-hello-world/src/test/java/org/jsmart/zerocode/testhelp/tests`
+ IDE keyboard shortcuts(handy ones) are [here](https://github.com/umangsingh123/zerocode-hello-world#references)
+ Tests are,
```
            helloworld/JustHelloWorldTest.java
            helloworldqueryparams/HelloWorldQueryParamsTest.java
            helloworldmore/JustHelloWorldMoreTest.java
            HelloWorldGitHubSuite.java
            helloworldjavaexec/HelloWorldJavaMethodExecTest.java
            helloworldarraysize/HelloWorldArraySizeTest.java
            helloworldregexmatch/HelloWorldRegexMatchDateTest.java
            wiremock/WireMockCustomerEndPointTest.java
            helloworldgithub/GitHubHelloWorldTest.java
            helloworldgithub/GitHubSslHttpsTest.java
            helloworldgithub/MoreGitHubSslAndAssertionsTest.java
            loadtesting/LoadGetEndPointTest.java
            loadtesting/restendpoint/TestGitGubEndPoint.java
```

+ `clean`, `build` are gradle tasks . 
+ See more help on [helloworld readme here](https://github.com/umangsingh123/zerocode-hello-world)
+ For more information on gradle tasks follow the link below or use gradle help on your system.

  + https://docs.gradle.org/current/userguide/command_line_interface.html 
