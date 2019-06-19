#JSP

### why need to introduce JSP?
    1. current servlet combines html and java code
        the html needs to change frequently and be modified by web designer
    2. change of html needs a lot efforts.
### how to write
    most part like a plain html page
    you can insert java code inside a <% %>, and inside it,out can do write things in the page.
    add this .jsp file under WEB-APP 
    visit the page like other html pages 
### how the JSP works
    1. client send GET/squares.jsp request to server
    2. server convert this file to servlet
    3. server compile servlet to .class file and run it, send response to   client
    4. cliend web browser show page 
### convert servlet to JSP
    since the server will convert JSP files to corresponing Servlet class, we can convert our Servlet.java files into JSP, such that we can have more html liked pages under WEB-INF folder. 

    LET'S ROCK!

    '''
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import ="java.util.List" %>
    <%@page import ="com.virtualpairprogrammers.data.MenuDao" %>
    <%@page import ="com.virtualpairprogrammers.data.MenuDaoFactory" %>
    <%@page import ="com.virtualpairprogrammers.domain.MenuItem" %>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Ricky's Restaurant</title>
    </head>
    <body>
        <% MenuDao menuDao = MenuDaoFactory.getMenuDao();
        List<MenuItem> menuItems = menuDao.getFullMenu(); %>
        <h1>Menu</h1>
        <ul>
        <% for(MenuItem each : menuItems){
                out.println("<li>"+each+"</li>");
            }%>
        </ul>
    </body>
    </html>
    '''

    include header, footer,css, imgs....
    `<jsp:include page="/header.jsp" />`

# MVC model view controller
just simply replace servlet to JSP could not completely seprate html(view) and java code(business logic). It seems ugly in either way. we need to use both of them and let them do their own jobs. 

###embeding jsp inside servlet
    ```java
        ServletContext context = request.getServletContext();
        RequestDispatcher dispatcher = context.getRequestDispatcher("/searchResult.jsp");
        dispatcher.forward(request, response);
    ``` 






















