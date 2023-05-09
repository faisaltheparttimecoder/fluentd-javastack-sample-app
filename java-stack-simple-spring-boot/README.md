# Fluent Java Stack Simple Spring Boot Stack

This is a simple Spring Boot Java stack generator app. When called, it prints a Java stack on the screen. This app can be used to test the Fluentd multiline regex functionality.

### `throwException` Endpoint

When calling the `throwException` endpoint, the program generates a Java error in the following format:
        ```
        2023-05-08 21:53:30.294 ERROR 84637 --- [nio-8080-exec-1] o.a.c.c.C.[.[.[/].[dispatcherServlet]    : Servlet.service() for servlet [dispatcherServlet] in context with path [] threw exception [Request processing failed; nested exception is java.lang.RuntimeException: Forcefully throwing up Internal Spring Boot simple java stack exception!] with root cause

        java.lang.RuntimeException: Forcefully throwing up Internal Spring Boot simple java stack exception!
                at com.self.javastacksimplespringboot.JavaStackSimpleSpringBootApplication.throwException(JavaStackSimpleSpringBootApplication.java:22) ~[classes/:na]
                at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:1.8.0_275]
                at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:1.8.0_275]
                at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_275]
                at java.lang.reflect.Method.invoke(Method.java:498) ~[na:1.8.0_275]
                at org.springframework.web.method.support.InvocableHandlerMethod.doInvoke(InvocableHandlerMethod.java:205) ~[spring-web-5.3.27.jar:5.3.27]
                at org.springframework.web.method.support.InvocableHandlerMethod.invokeForRequest(InvocableHandlerMethod.java:150) ~[spring-web-5.3.27.jar:5.3.27]
                at org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod.invokeAndHandle(ServletInvocableHandlerMethod.java:117) ~[spring-webmvc-5.3.27.jar:5.3.27]
                at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.invokeHandlerMethod(RequestMappingHandlerAdapter.java:895) ~[spring-webmvc-5.3.27.jar:5.3.27]
                at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.handleInternal(RequestMappingHandlerAdapter.java:808) ~[spring-webmvc-5.3.27.jar:5.3.27]
                at org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter.handle(AbstractHandlerMethodAdapter.java:87) ~[spring-webmvc-5.3.27.jar:5.3.27]
                at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1072) ~[spring-webmvc-5.3.27.jar:5.3.27]
                at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:965) ~[spring-webmvc-5.3.27.jar:5.3.27]
                at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1006) ~[spring-webmvc-5.3.27.jar:5.3.27]
                at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:898) ~[spring-webmvc-5.3.27.jar:5.3.27]
                at javax.servlet.http.HttpServlet.service(HttpServlet.java:529) ~[tomcat-embed-core-9.0.74.jar:4.0.FR]
                at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:883) ~[spring-webmvc-5.3.27.jar:5.3.27]
                at javax.servlet.http.HttpServlet.service(HttpServlet.java:623) ~[tomcat-embed-core-9.0.74.jar:4.0.FR]
                at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:209) ~[tomcat-embed-core-9.0.74.jar:9.0.74]
                at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:153) ~[tomcat-embed-core-9.0.74.jar:9.0.74]
                at org.apache.tomcat.websocket.server.WsFilter.doFilter(WsFilter.java:51) ~[tomcat-embed-websocket-9.0.74.jar:9.0.74]
                at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:178) ~[tomcat-embed-core-9.0.74.jar:9.0.74]
                at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:153) ~[tomcat-embed-core-9.0.74.jar:9.0.74]
                at org.springframework.web.filter.RequestContextFilter.doFilterInternal(RequestContextFilter.java:100) ~[spring-web-5.3.27.jar:5.3.27]
                at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117) ~[spring-web-5.3.27.jar:5.3.27]
                at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:178) ~[tomcat-embed-core-9.0.74.jar:9.0.74]
                at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:153) ~[tomcat-embed-core-9.0.74.jar:9.0.74]
                at org.springframework.web.filter.FormContentFilter.doFilterInternal(FormContentFilter.java:93) ~[spring-web-5.3.27.jar:5.3.27]
                at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117) ~[spring-web-5.3.27.jar:5.3.27]
                at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:178) ~[tomcat-embed-core-9.0.74.jar:9.0.74]
                at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:153) ~[tomcat-embed-core-9.0.74.jar:9.0.74]
                at org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:201) ~[spring-web-5.3.27.jar:5.3.27]
                at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117) ~[spring-web-5.3.27.jar:5.3.27]
                at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:178) ~[tomcat-embed-core-9.0.74.jar:9.0.74]
                at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:153) ~[tomcat-embed-core-9.0.74.jar:9.0.74]
                at org.apache.catalina.core.StandardWrapperValve.invoke(StandardWrapperValve.java:167) ~[tomcat-embed-core-9.0.74.jar:9.0.74]
                at org.apache.catalina.core.StandardContextValve.invoke(StandardContextValve.java:90) [tomcat-embed-core-9.0.74.jar:9.0.74]
                at org.apache.catalina.authenticator.AuthenticatorBase.invoke(AuthenticatorBase.java:481) [tomcat-embed-core-9.0.74.jar:9.0.74]
                at org.apache.catalina.core.StandardHostValve.invoke(StandardHostValve.java:130) [tomcat-embed-core-9.0.74.jar:9.0.74]
                at org.apache.catalina.valves.ErrorReportValve.invoke(ErrorReportValve.java:93) [tomcat-embed-core-9.0.74.jar:9.0.74]
                at org.apache.catalina.core.StandardEngineValve.invoke(StandardEngineValve.java:74) [tomcat-embed-core-9.0.74.jar:9.0.74]
                at org.apache.catalina.connector.CoyoteAdapter.service(CoyoteAdapter.java:343) [tomcat-embed-core-9.0.74.jar:9.0.74]
                at org.apache.coyote.http11.Http11Processor.service(Http11Processor.java:389) [tomcat-embed-core-9.0.74.jar:9.0.74]
                at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:63) [tomcat-embed-core-9.0.74.jar:9.0.74]
                at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:926) [tomcat-embed-core-9.0.74.jar:9.0.74]
                at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1791) [tomcat-embed-core-9.0.74.jar:9.0.74]
                at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:52) [tomcat-embed-core-9.0.74.jar:9.0.74]
                at org.apache.tomcat.util.threads.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1191) [tomcat-embed-core-9.0.74.jar:9.0.74]
                at org.apache.tomcat.util.threads.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:659) [tomcat-embed-core-9.0.74.jar:9.0.74]
                at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) [tomcat-embed-core-9.0.74.jar:9.0.74]
                at java.lang.Thread.run(Thread.java:748) [na:1.8.0_275]
        ```

### Running the Program

To run this program, use the following command:
        ```
        ./mvnw clean spring-boot:run
        ```

### Building the Package

To build the package, use the following commands:
        ```
        ./mvnw clean install
        ./mvnw clean package
        java -jar target/java-stack-simple-spring-boot-0.0.1-SNAPSHOT.jar
        ```

### Pushing to Docker

To push the package to Docker, follow these steps:
        ```
        docker build --no-cache -t myorg/myorg .
        docker run -p8080:8000 myorg/myorg
        docker images
        docker tag <image id> myorg/myorg:<tag>
        docker push myorg/myorg:<tag>
        ```

Note that `myorg/myorg`, `<tag>` and `<image id>` should be replaced with the username/imagename, tag and image ID respectively.