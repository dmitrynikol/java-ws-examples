Sample projects using JAX-WS technologies.
=========================

1) RESTful example how to integrate Apache CXF and Spring 3. (RESTfulAppApacheCXF project)
 
Used technologies:
- JAX-RS
- Apache CXF
- Spring Framework
- JAX-B
- Jackson
- Maven

You can test functionality with Curl.

http://localhost:8080/RESTfulAppApacheCXF/rest/users/all - get all users (GET) 
http://localhost:8080/RESTfulWebApp/rest/users/create - create user (POST) 
http://localhost:8080/RESTfulAppApacheCXF/rest/users/3 - find user by id = 5 (GET) 
http://localhost:8080/RESTfulAppApacheCXF/rest/users/3 - update user with id = 5 (PUT) 
http://localhost:8080/RESTfulAppApacheCXF/rest/users/3 - delete user with id = 5 (DELETE)

For more details see comments in code.
