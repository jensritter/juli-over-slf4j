Maven Dependency for a  replacement for tomcat-juli.

This should be only needed for standalone usages of tomcat-jdbc. ( i hope ) 


To use this import tomcat-jdbc and exclude tomcat-juli.

```xml
<dependency>
    <groupId>org.apache.tomcat</groupId>
    <artifactId>tomcat-jdbc</artifactId>
    <version>8.0.21</version>
    <exclusions>
        <exclusion>
            <artifactId>tomcat-juli</artifactId>
            <groupId>org.apache.tomcat</groupId>
        </exclusion>
    </exclusions>
</dependency>
```

