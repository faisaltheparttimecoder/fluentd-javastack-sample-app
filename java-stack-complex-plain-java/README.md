# Fluent Java Error Stack Plain using plain Java 

This is a simple vanilla Java stack generator app. When called, it prints a Java stack on the screen. This app can be used to test the Fluentd multiline regex functionality.

### Exception emitted

The program when run generates a Java error in the following format:
    ```
    Exception in thread "main" java.lang.RuntimeException: This is a real complex java stack error from a plain old vanilla java code!!!
            at com.self.javastackcomplexplainjava.JavaStackComplexPlanJavaApplication.foo8(JavaStackComplexPlanJavaApplication.java:52)
            at com.self.javastackcomplexplainjava.JavaStackComplexPlanJavaApplication.foo7(JavaStackComplexPlanJavaApplication.java:44)
            at com.self.javastackcomplexplainjava.JavaStackComplexPlanJavaApplication.foo6(JavaStackComplexPlanJavaApplication.java:39)
            at com.self.javastackcomplexplainjava.JavaStackComplexPlanJavaApplication.foo5(JavaStackComplexPlanJavaApplication.java:34)
            at com.self.javastackcomplexplainjava.JavaStackComplexPlanJavaApplication.foo4(JavaStackComplexPlanJavaApplication.java:29)
            at com.self.javastackcomplexplainjava.JavaStackComplexPlanJavaApplication.foo3(JavaStackComplexPlanJavaApplication.java:24)
            at com.self.javastackcomplexplainjava.JavaStackComplexPlanJavaApplication.foo2(JavaStackComplexPlanJavaApplication.java:20)
            at com.self.javastackcomplexplainjava.JavaStackComplexPlanJavaApplication.foo1(JavaStackComplexPlanJavaApplication.java:16)
            at com.self.javastackcomplexplainjava.JavaStackComplexPlanJavaApplication.main(JavaStackComplexPlanJavaApplication.java:12)
    Caused by: java.lang.NumberFormatException: For input string: "10.1"
            at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
            at java.lang.Integer.parseInt(Integer.java:580)
            at java.lang.Integer.parseInt(Integer.java:615)
            at com.self.javastackcomplexplainjava.JavaStackComplexPlanJavaApplication.foo8(JavaStackComplexPlanJavaApplication.java:50)
            ... 8 more
    ```

### Running the Program

To run this program, use the following command:
    ```
    ./mvnw clean install
    java -cp target/java-stack-complex-plain-java-1.0-SNAPSHOT.jar com.self.javastackcomplexplainjava.JavaStackComplexPlanJavaApplication
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