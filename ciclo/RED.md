mvn test
[INFO] Scanning for projects...
[INFO] 
[INFO] ---------------< cl.kibernumacademy:notificationcenter >----------------
[INFO] Building notificationcenter 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- jacoco:0.8.11:prepare-agent (default) @ notificationcenter ---
[INFO] argLine set to -javaagent:C:\\Users\\mvera\\.m2\\repository\\org\\jacoco\\org.jacoco.agent\\0.8.11\\org.jacoco.agent-0.8.11-runtime.jar=destfile=C:\\Users\\mvera\\Documents\\QA\\notificationcenter\\target\\jacoco.exec
[INFO]
[INFO] --- resources:3.0.2:resources (default-resources) @ notificationcenter ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\Users\mvera\Documents\QA\notificationcenter\src\main\resources
[INFO]
[INFO] --- compiler:3.8.0:compile (default-compile) @ notificationcenter ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- resources:3.0.2:testResources (default-testResources) @ notificationcenter ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\Users\mvera\Documents\QA\notificationcenter\src\test\resources
[INFO]
[INFO] --- compiler:3.8.0:testCompile (default-testCompile) @ notificationcenter ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to C:\Users\mvera\Documents\QA\notificationcenter\target\test-classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR :
[INFO] -------------------------------------------------------------
[ERROR] /C:/Users/mvera/Documents/QA/notificationcenter/src/test/java/cl/kibernumacademy/service/NotificationProcessorTest.java:[30,11] cannot find symbol
  symbol:   class NotificationService
  location: class cl.kibernumacademy.service.NotificationProcessorTest
[ERROR] /C:/Users/mvera/Documents/QA/notificationcenter/src/test/java/cl/kibernumacademy/service/NotificationProcessorTest.java:[33,11] cannot find symbol
  symbol:   class NotificationService
  location: class cl.kibernumacademy.service.NotificationProcessorTest
[ERROR] /C:/Users/mvera/Documents/QA/notificationcenter/src/test/java/cl/kibernumacademy/service/NotificationProcessorTest.java:[36,11] cannot find symbol
  symbol:   class NotificationHistory
  location: class cl.kibernumacademy.service.NotificationProcessorTest
[ERROR] /C:/Users/mvera/Documents/QA/notificationcenter/src/test/java/cl/kibernumacademy/service/NotificationProcessorTest.java:[39,26] cannot find symbol
  symbol:   class Notification
  location: class cl.kibernumacademy.service.NotificationProcessorTest
[ERROR] /C:/Users/mvera/Documents/QA/notificationcenter/src/test/java/cl/kibernumacademy/service/NotificationProcessorTest.java:[42,11] cannot find symbol
  symbol:   class NotificationProcessor
  location: class cl.kibernumacademy.service.NotificationProcessorTest
[ERROR] /C:/Users/mvera/Documents/QA/notificationcenter/src/test/java/cl/kibernumacademy/service/NotificationProcessorTest.java:[46,33] cannot find symbol
  symbol:   class NotificationProcessor
  location: class cl.kibernumacademy.service.NotificationProcessorTest
[ERROR] /C:/Users/mvera/Documents/QA/notificationcenter/src/test/java/cl/kibernumacademy/service/NotificationProcessorTest.java:[56,81] cannot find symbol
  symbol:   variable Channel
  location: class cl.kibernumacademy.service.NotificationProcessorTest
[ERROR] /C:/Users/mvera/Documents/QA/notificationcenter/src/test/java/cl/kibernumacademy/service/NotificationProcessorTest.java:[62,5] cannot find symbol
  symbol:   class Notification
  location: class cl.kibernumacademy.service.NotificationProcessorTest
[ERROR] /C:/Users/mvera/Documents/QA/notificationcenter/src/test/java/cl/kibernumacademy/service/NotificationProcessorTest.java:[65,18] cannot find symbol
  symbol:   variable Channel
  location: class cl.kibernumacademy.service.NotificationProcessorTest
[ERROR] /C:/Users/mvera/Documents/QA/notificationcenter/src/test/java/cl/kibernumacademy/service/NotificationProcessorTest.java:[75,81] cannot find symbol
  symbol:   variable Channel
  location: class cl.kibernumacademy.service.NotificationProcessorTest
[ERROR] /C:/Users/mvera/Documents/QA/notificationcenter/src/test/java/cl/kibernumacademy/service/NotificationProcessorTest.java:[81,5] cannot find symbol
  symbol:   class Notification
  location: class cl.kibernumacademy.service.NotificationProcessorTest
[ERROR] /C:/Users/mvera/Documents/QA/notificationcenter/src/test/java/cl/kibernumacademy/service/NotificationProcessorTest.java:[84,18] cannot find symbol
  symbol:   variable Channel
  location: class cl.kibernumacademy.service.NotificationProcessorTest
[ERROR] /C:/Users/mvera/Documents/QA/notificationcenter/src/test/java/cl/kibernumacademy/service/NotificationProcessorTest.java:[93,74] cannot find symbol
  symbol:   variable Channel
  location: class cl.kibernumacademy.service.NotificationProcessorTest
[ERROR] /C:/Users/mvera/Documents/QA/notificationcenter/src/test/java/cl/kibernumacademy/service/NotificationProcessorTest.java:[105,74] cannot find symbol
  symbol:   variable Channel
  location: class cl.kibernumacademy.service.NotificationProcessorTest
[ERROR] /C:/Users/mvera/Documents/QA/notificationcenter/src/test/java/cl/kibernumacademy/service/NotificationProcessorTest.java:[117,81] cannot find symbol
  symbol:   variable Channel
  location: class cl.kibernumacademy.service.NotificationProcessorTest
[ERROR] /C:/Users/mvera/Documents/QA/notificationcenter/src/test/java/cl/kibernumacademy/service/NotificationProcessorTest.java:[129,81] cannot find symbol
  symbol:   variable Channel
  location: class cl.kibernumacademy.service.NotificationProcessorTest
[ERROR] /C:/Users/mvera/Documents/QA/notificationcenter/src/test/java/cl/kibernumacademy/service/NotificationProcessorTest.java:[131,17] cannot find symbol
  symbol:   method isTrue()
  location: interface org.mockito.BDDMockito.Then<java.lang.Boolean>
[ERROR] /C:/Users/mvera/Documents/QA/notificationcenter/src/test/java/cl/kibernumacademy/service/NotificationProcessorTest.java:[142,64] cannot find symbol
  symbol:   variable Channel
  location: class cl.kibernumacademy.service.NotificationProcessorTest
[ERROR] /C:/Users/mvera/Documents/QA/notificationcenter/src/test/java/cl/kibernumacademy/service/NotificationProcessorTest.java:[145,5] cannot find symbol
  symbol:   class Notification
  location: class cl.kibernumacademy.service.NotificationProcessorTest
[ERROR] /C:/Users/mvera/Documents/QA/notificationcenter/src/test/java/cl/kibernumacademy/service/NotificationProcessorTest.java:[149,18] cannot find symbol
  symbol:   variable Channel
  location: class cl.kibernumacademy.service.NotificationProcessorTest
[INFO] 20 errors
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.188 s
[INFO] Finished at: 2025-07-17T23:01:55-04:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.0:testCompile (default-testCompile) on project notificationcenter: Compilation failure: Compilation failure:
[ERROR] /C:/Users/mvera/Documents/QA/notificationcenter/src/test/java/cl/kibernumacademy/service/NotificationProcessorTest.java:[30,11] cannot find symbol
[ERROR]   symbol:   class NotificationService
[ERROR]   location: class cl.kibernumacademy.service.NotificationProcessorTest
[ERROR] /C:/Users/mvera/Documents/QA/notificationcenter/src/test/java/cl/kibernumacademy/service/NotificationProcessorTest.java:[33,11] cannot find symbol
[ERROR]   symbol:   class NotificationService
[ERROR]   location: class cl.kibernumacademy.service.NotificationProcessorTest
[ERROR] /C:/Users/mvera/Documents/QA/notificationcenter/src/test/java/cl/kibernumacademy/service/NotificationProcessorTest.java:[36,11] cannot find symbol
[ERROR]   symbol:   class NotificationHistory
[ERROR]   location: class cl.kibernumacademy.service.NotificationProcessorTest
[ERROR] /C:/Users/mvera/Documents/QA/notificationcenter/src/test/java/cl/kibernumacademy/service/NotificationProcessorTest.java:[39,26] cannot find symbol
[ERROR]   symbol:   class Notification
[ERROR]   location: class cl.kibernumacademy.service.NotificationProcessorTest
[ERROR] /C:/Users/mvera/Documents/QA/notificationcenter/src/test/java/cl/kibernumacademy/service/NotificationProcessorTest.java:[42,11] cannot find symbol
[ERROR]   symbol:   class NotificationProcessor
[ERROR]   location: class cl.kibernumacademy.service.NotificationProcessorTest
[ERROR] /C:/Users/mvera/Documents/QA/notificationcenter/src/test/java/cl/kibernumacademy/service/NotificationProcessorTest.java:[46,33] cannot find symbol
[ERROR]   symbol:   class NotificationProcessor
[ERROR]   location: class cl.kibernumacademy.service.NotificationProcessorTest
[ERROR] /C:/Users/mvera/Documents/QA/notificationcenter/src/test/java/cl/kibernumacademy/service/NotificationProcessorTest.java:[56,81] cannot find symbol
[ERROR]   symbol:   variable Channel
[ERROR]   location: class cl.kibernumacademy.service.NotificationProcessorTest
[ERROR] /C:/Users/mvera/Documents/QA/notificationcenter/src/test/java/cl/kibernumacademy/service/NotificationProcessorTest.java:[62,5] cannot find symbol
[ERROR]   symbol:   class Notification
[ERROR]   location: class cl.kibernumacademy.service.NotificationProcessorTest
[ERROR] /C:/Users/mvera/Documents/QA/notificationcenter/src/test/java/cl/kibernumacademy/service/NotificationProcessorTest.java:[65,18] cannot find symbol
[ERROR]   symbol:   variable Channel
[ERROR]   location: class cl.kibernumacademy.service.NotificationProcessorTest
[ERROR] /C:/Users/mvera/Documents/QA/notificationcenter/src/test/java/cl/kibernumacademy/service/NotificationProcessorTest.java:[75,81] cannot find symbol
[ERROR]   symbol:   variable Channel
[ERROR]   location: class cl.kibernumacademy.service.NotificationProcessorTest
[ERROR] /C:/Users/mvera/Documents/QA/notificationcenter/src/test/java/cl/kibernumacademy/service/NotificationProcessorTest.java:[81,5] cannot find symbol
[ERROR]   symbol:   class Notification
[ERROR]   location: class cl.kibernumacademy.service.NotificationProcessorTest
[ERROR] /C:/Users/mvera/Documents/QA/notificationcenter/src/test/java/cl/kibernumacademy/service/NotificationProcessorTest.java:[84,18] cannot find symbol
[ERROR]   symbol:   variable Channel
[ERROR]   location: class cl.kibernumacademy.service.NotificationProcessorTest
[ERROR] /C:/Users/mvera/Documents/QA/notificationcenter/src/test/java/cl/kibernumacademy/service/NotificationProcessorTest.java:[93,74] cannot find symbol
[ERROR]   symbol:   variable Channel
[ERROR]   location: class cl.kibernumacademy.service.NotificationProcessorTest
[ERROR] /C:/Users/mvera/Documents/QA/notificationcenter/src/test/java/cl/kibernumacademy/service/NotificationProcessorTest.java:[105,74] cannot find symbol
[ERROR]   symbol:   variable Channel
[ERROR]   location: class cl.kibernumacademy.service.NotificationProcessorTest
[ERROR] /C:/Users/mvera/Documents/QA/notificationcenter/src/test/java/cl/kibernumacademy/service/NotificationProcessorTest.java:[117,81] cannot find symbol
[ERROR]   symbol:   variable Channel
[ERROR]   location: class cl.kibernumacademy.service.NotificationProcessorTest
[ERROR] /C:/Users/mvera/Documents/QA/notificationcenter/src/test/java/cl/kibernumacademy/service/NotificationProcessorTest.java:[129,81] cannot find symbol
[ERROR]   symbol:   variable Channel
[ERROR]   location: class cl.kibernumacademy.service.NotificationProcessorTest
[ERROR] /C:/Users/mvera/Documents/QA/notificationcenter/src/test/java/cl/kibernumacademy/service/NotificationProcessorTest.java:[131,17] cannot find symbol
[ERROR]   symbol:   method isTrue()
[ERROR]   location: interface org.mockito.BDDMockito.Then<java.lang.Boolean>
[ERROR] /C:/Users/mvera/Documents/QA/notificationcenter/src/test/java/cl/kibernumacademy/service/NotificationProcessorTest.java:[142,64] cannot find symbol
[ERROR]   symbol:   variable Channel
[ERROR]   location: class cl.kibernumacademy.service.NotificationProcessorTest
[ERROR] /C:/Users/mvera/Documents/QA/notificationcenter/src/test/java/cl/kibernumacademy/service/NotificationProcessorTest.java:[145,5] cannot find symbol
[ERROR]   symbol:   class Notification
[ERROR]   location: class cl.kibernumacademy.service.NotificationProcessorTest
[ERROR] /C:/Users/mvera/Documents/QA/notificationcenter/src/test/java/cl/kibernumacademy/service/NotificationProcessorTest.java:[149,18] cannot find symbol
[ERROR]   symbol:   variable Channel
[ERROR]   location: class cl.kibernumacademy.service.NotificationProcessorTest
[ERROR] -> [Help 1]
[ERROR]
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR]
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException