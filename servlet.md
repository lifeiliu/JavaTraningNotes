## Servlet Notes(get/post and sessions/cookies *important*)

1. how to get user input content from html in servlet?
     in the html file, for each input label, <input type="text" name="xxx">
     it is like a key-value pair where key is "xxx" and value is whatever inputed in this text input
     to get the text, in servlet, just simply use request.getParameter("xxx"). 

2. when to use "get"/"post"?
     2.1 difference
        visual different of get and post is that when you do get, your URI will contain the parameter key-value pairs
        that are sending to the server. and post does not contain that
     2.2 why use get?
        - easily book mark your search result
        - can refresh the page, won't change 
        - could pre- save some result in a link 
          e.g. in the main page save a "see our all chicken dishes" with a` "<a href='searchResults.html?searchTerm=chicken' >View all of our chicken dishes</a>"`


    2.3 why use post？
        - for privacy. espacially in login page, where you don't want your username and password appears in the URI.
        - something are expected to happen,e.g send information, add, delete data from server. and want the user only do the job once.

    2.4 which to choose in this search form?
        beacuse it is just retriving data from the server and also it is fine for use to do it many times they want, it would be better to set it as get. 

    2.5 but if you chose post and don't want the clients do refresh more than one time? 
        Using Post-Redirect-Get design pattern!
       - why to use redirect? when we use post, we are sending server infos. after submit the form, we don't want sevlet excute anymore. however, if we are staying in the same html and when we refresh, it will excute.
       so we do `response.redirect("somepage.html?parameter=?"+paravelue)`
       - this is a 302 redirect. 
       - difference in 302 and 303?  

3. sessions and cookies
    3.1 what is sessions and why to use?
        - Http is a stateless protocal, Each time user requests to the server, server treats the request as the new request. So we need to maintain the state of an user to recognize to particular user.
        - SSH is long term lasting connection. but costly. 
    3.2 how to let the server recognize a user? e.g. amazon remebers userId and keeps cart every time you visit their web.
        - use cookie! server send little files to client and saved in client's computer.next time server communicate with the client, it will check if the client has the cookie it saved before. if yes, it will read and recognize the client. 
        - cookie's limitation. cookie only text, hard to convert to objects. and small. <4k
        - server session!
        server generate UID, cookie store UID, server store key-value pair. e.g. client's shopping cart info. 





