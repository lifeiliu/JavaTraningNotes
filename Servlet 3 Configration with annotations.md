# Servlet 3 Configration with annotations, seurity,Servlet Filter
### use annotation instead of xml to do the servlet-mapping
    - its available since v3
    - how to do it?
        just remove <servlet>and <servlet-mapping> tags in web.xml
        in the Servlet.java code, at the top of class declarification, add annotation as '@WebServlet("/yourURI.html")' 

### security configrations
    @SevletSecurity(@HttpConstraint(rolesAllowed={"role1","role2"}))
    on any servlet class which needs to constraint the role based access 

### Filters
    Servlet filter are in front of servlet, jsp, and static files in the server. as a result, user HTTP request will first intercept by Servlet fileter, then goes to the request services.
    Servlet Filters are used to intercept a request and conduct pre-processing or post-processing on that request.
    as shown here ![filter img](http://tutorials.jenkov.com/images/java-servlets/servlet-filters-1.png)
    It is useful in implementing features such as
    - Logging of requests
    - Authentication and Authorization
    - Encryption or Decryption
    - Formatting the request header or body before sending to the servlet.
#### how to use filter
    we can create a filter pakage then put your customized filter class which implements filter. at the top of the class, use annotation `@WebFilter(your url )`. by default, it needs to implements 3 methods:
    init(), destory()and doFilter(request,response,chain). the last method could put ur business logic inside, to define what you want to do before the request sends to servlet.
    1. init( FilterConfig config ) 
        This is a one-time method that gets invoked when the filter is initialized.
    2. doFilter(HttpServletRequest request,HttpServletResponse response, FilterChain chain)
        This method gets invoked every time when the filter has to filter a request. All the filter actions on the request can be implemented here. The FilterChain parameter can be used to implement the next filter in the filter chain.
    3. destroy()
        This is a one-time method that gets invoked when the filter is taken out of service.
#### code example

```java
    @WebFilter("/searchResults.html")
    public class MenuSearchFilter implements Filter {
        @Override
        public void destroy() {
        }

        @Override
        public void doFilter(ServletRequest request, ServletResponse reponse, FilterChain chain)
                throws IOException, ServletException {
            String searchTerm = request.getParameter("searchTerm");
            System.out.println("from filter we know that you searched: " + searchTerm);
            chain.doFilter(request, reponse);
        }

        @Override
        public void init(FilterConfig arg0) throws ServletException {
       }
``` 


#### another code example,  want to change requet parameter. however, it would not let you do to in the orignial request. the idea is that, request is from user, it won't let you change it later.
    to solve this problem, we need to use HttpServletRequestWarpper class.
```java
        public class MenuSearchCorrectionRequestWarpper extends HttpServletRequestWrapper {
        private String newSearchTerm;

        public MenuSearchCorrectionRequestWarpper(HttpServletRequest request) {
            super(request);
            // TODO Auto-generated constructor stub
        }

        public void setNewSearchTerm(String newSearchTerm) {
            this.newSearchTerm = newSearchTerm;
        }

        @Override
        public String getParameter(String key) {
            if (key.equals("searchTerm")) {
                return newSearchTerm;
            } else {
                return super.getParameter(key);
            }
        }
    }

    @WebFilter("/searchResults.html")
    public class MenuSearchCorrectionFilter implements Filter {

        @Override
        public void destroy() {
            // TODO Auto-generated method stub

        }

        @Override
        public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
                throws IOException, ServletException {
            String searchTerm = request.getParameter("searchTerm");
            if (searchTerm.toLowerCase().equals("chook")) {
                MenuSearchCorrectionRequestWarpper warpper = new MenuSearchCorrectionRequestWarpper(
                        (HttpServletRequest) request);
                warpper.setNewSearchTerm("chicken");
                chain.doFilter(warpper, response);
            } else {
                chain.doFilter(request, response);
            }
        }

        @Override
        public void init(FilterConfig arg0) throws ServletException {
            // TODO Auto-generated method stub

        }

    }
```