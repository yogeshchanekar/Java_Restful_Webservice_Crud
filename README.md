# Java_Restful_Webservice_Crud

This project is created in esclipse IDE (Maven project) and to test restful web service you need to install Advanced Rest Client

Link for Google chrome = https://chrome.google.com/webstore/detail/advanced-rest-client/hgmloofddffdnphfgcellkdfbfbjeloo


To run this Project click on project go to Run-Configuration= R-click on MavenBuild-New Configuration- give name "restcrudjava" like that then
give Base directory path  i.e project workspce = goals(tomcat:7)=Then apply and run

You need to use the 'Advanced REST Client' to be able to test the RESTful web service.

Link to test :-

http://localhost:8080/restcrud/rest/employees
http://localhost:8080/restcrud/rest/employees/Emp01
http://localhost:8080/restcrud/rest/employees/Emp02


Note:- 
If you want data in json format just remove the MediaType.APPLICATION_XML from EmployeeeService.java file.

