This is a demo project for consuming SOAP based web services. 

used the url to generate the java classes provided by the SOAP in the folder called sei inside the bin of the jdk

go to the command prompt 
run it as administrator
go to the bin folder structure 
enter the following command
wsimport -s sei http://webservicex.net/geoipservice.asmx?WSDL

This generates the stubs and classes.

Use this classes - add these to the same package structure and use.