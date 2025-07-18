mvn clean test
[INFO] Scanning for projects...
[INFO] 
[INFO] ---------------< cl.kibernumacademy:notificationcenter >----------------
[INFO] Building notificationcenter 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- clean:3.1.0:clean (default-clean) @ notificationcenter ---
[INFO] Deleting C:\Users\mvera\Documents\QA\notificationcenter\target
[INFO] 
[INFO] --- jacoco:0.8.11:prepare-agent (default) @ notificationcenter ---
[INFO] argLine set to -javaagent:C:\\Users\\mvera\\.m2\\repository\\org\\jacoco\\org.jacoco.agent\\0.8.11\\org.jacoco.agent-0.8.11-runtime.jar=destfile=C:\\Users\\mvera\\Documents\\QA\\notificationcenter\\target\\jacoco.exec
[INFO]
[INFO] --- resources:3.0.2:resources (default-resources) @ notificationcenter ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\Users\mvera\Documents\QA\notificationcenter\src\main\resources
[INFO]
[INFO] --- compiler:3.8.0:compile (default-compile) @ notificationcenter ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 7 source files to C:\Users\mvera\Documents\QA\notificationcenter\target\classes
[INFO] 
[INFO] --- resources:3.0.2:testResources (default-testResources) @ notificationcenter ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\Users\mvera\Documents\QA\notificationcenter\src\test\resources
[INFO]
[INFO] --- compiler:3.8.0:testCompile (default-testCompile) @ notificationcenter ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to C:\Users\mvera\Documents\QA\notificationcenter\target\test-classes
[INFO] 
[INFO] --- surefire:2.22.1:test (default-test) @ notificationcenter ---
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running cl.kibernumacademy.service.NotificationProcessorTest
[INFO] Tests run: 7, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.625 s - in cl.kibernumacademy.service.NotificationProcessorTest
[INFO] 
[INFO] Results:
[INFO]
[INFO] Tests run: 7, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO]
[INFO] --- jacoco:0.8.11:report (report) @ notificationcenter ---
[INFO] Loading execution data file C:\Users\mvera\Documents\QA\notificationcenter\target\jacoco.exec
[INFO] Analyzed bundle 'notificationcenter' with 6 classes
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.362 s
[INFO] Finished at: 2025-07-17T23:26:39-04:00
[INFO] ------------------------------------------------------------------------