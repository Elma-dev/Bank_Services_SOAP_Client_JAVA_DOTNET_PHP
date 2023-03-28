# Bank_Services_SOAP_Client_JAVA_DOTNET_PHP
# SOAP
You can find some SOAP [fundamentals](https://github.com/Elma-dev/SOAP_Fundamentals) in this repository I previously made.
# Bank Services
In this repository, I am attempting to build a little project regarding bank services using SOAP and Java while learning the basics of SOAP, such as how to build services, deploy them to servers, design WSDL using jaxWS, and generate Java classes from WSDL files.
# Some Services 
**Services that the bank will provide:**

  **1. ConvertToMAD**

This function could the user to convert money in mad to euro or usd.

  **2. Create Compte**

With this function you can create new compte .

  **2. All Comptes**

You can get all comptes created in the bank with this function.

# Deploy Services In Server

We can now deploy the services in the server using the following technique after defining them with jaxws:

![image](https://user-images.githubusercontent.com/67378945/228092532-63746607-9436-4c24-829f-f4af443dffc2.png)

# WSDL FILE (Web Services Description Language)
all you need to get your WSDL file is enter to the **address:port** of the server in  any browser and you get this page, in my case **localhost:port(127.0.0.1:2001)**
![image](https://user-images.githubusercontent.com/67378945/228093657-ad5d9bd6-34e4-425e-a44f-f970c4a714ab.png)

The WSDL file link can be found in the information cell.
![image](https://user-images.githubusercontent.com/67378945/228093582-acbe5bcd-2e2d-4494-827f-84e57df48f7e.png)
**The WSDL file contains a wealth of information about services, such as the kind of input a user enters, the kind of output produced by each method or service, and other details in XML format.** 
# Test Server with SoapUI
* **Services**

![image](https://user-images.githubusercontent.com/67378945/228094877-b7b8e970-6840-46c7-90ed-0a0129a1685a.png)

* **convertToMAD** 

Request/Replay

![image](https://user-images.githubusercontent.com/67378945/228096246-6168501b-b9ef-4f0a-89d1-36b0d2144161.png)

* **createNewCompte**

![image](https://user-images.githubusercontent.com/67378945/228097083-7599c4b0-09c6-4d5b-a8d7-1b8e0b04ba3b.png)

* **getAllCompte

![image](https://user-images.githubusercontent.com/67378945/228097268-fe1b8285-902f-4e17-8aeb-01d0d2cc17e7.png)

  
