# Servlet 2 Servlet Security

### Authentication and Authorization
    Authentication is to verify if the username or password is correct or not
    Authorization is to role based that defines which user could do a specific operations

### example of Authrization
in web.xml at the bottom but before `</webapp>` add
```xml
    <security-constraint>
        <web-resource-collection>
            <web-resource-name>order pages</web-resource-name>
            <!--see here, we can set multiple pages in diff url-pattern for a single role-->
            <url-pattern>/order.html</url-pattern>
            <url-pattern>/thankYou.html</url-pattern>
        </web-resource-collection>
        
        <auth-constraint>
            <role-name>user</role-name>
        </auth-constraint>
    </security-constraint>
    
    <security-constraint>
        <web-resource-collection>
            <web-resource-name>staff pages</web-resource-name>
            <!--see here we can use * to match all files-->
            <url-pattern>/admin/*</url-pattern>
        </web-resource-collection>
        
        <auth-constraint>
            <role-name>admin</role-name>
        </auth-constraint>
    </security-constraint>
```
### example of basic authentication
in web.xml, add list of roles and login-config
```xml
    <security-role>
        <role-name>user</role-name>
    </security-role>
    
    <security-role>
        <role-name>admin</role-name>
    </security-role>

    <serurity-constraint>
        ............
    </serurity-constraint>

    <login-config>
        <auth-method>BASIC</auth-method>
        <real-name>Ricky's Restaurant</real-name>
    </login-config>
```
and Then need to add users and roles inside main.java
```java
    tomcat.addUser("username","password");
    tomcat.addRole("username","roleName"); // in this case, user or admin
```

### example of form based authentication
first change the web.xml configrations
```xml
    <login-config>
        <auth-method>FORM</auth-method>
        <form-login-config>
            <form-login-page>/login.html</form-login-page>
            <form-error-page>/failed-login.html</form-error-page>
        </form-login-config>
    </login-config>
```
Then, we need to add these two pages login.html and failed-login.html