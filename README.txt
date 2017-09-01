$ mvn archetype:generate -DgroupId=com.test.jaxrs -DartifactId=Test-JAX-RS -DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false

$ mvn eclipse:eclipse -Dwtpversion=2.0

$ mvn package


Hello World Test
----------------
http://localhost:8080/Test-JAX-RS/rest/hello/Rahamath.S
http://localhost:8080/Test-JAX-RS/rest/hello/sayHello
http://localhost:8080/Test-JAX-RS/rest/hello/sayHelloInJSON

Real World Test with User details
---------------------------------

You hit following URL in any browser or from your standalone program
--------------------------------------------------------------------
	http://localhost:8080/Test-JAX-RS/rest/user/getUsersInXML
	http://localhost:8080/Test-JAX-RS/rest/user/getUsersInJSON
	http://localhost:8080/Test-JAX-RS/rest/user/getUsersInTEXT

Following html page will list all above 3 urls response
-------------------------------------------------------
	http://localhost:8080/Test-JAX-RS/callrest.html
	
	
http://localhost:8080/Test-JAX-RS/rest/user/getOneUserInJSON