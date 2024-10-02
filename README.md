This project demonstrates how to execute the UI automation test scenarios for Entrata website in Java.

**Prerequisites**
Java Development Kit (JDK) 11: Ensure you have JDK installed

Maven: This project uses Maven for dependency management

IDE: An Integrated Development Environment (IDE) like IntelliJ IDEA, Eclipse, or VS Code can be helpful.

pom.xml: The pom contains all the required dependencies to execute the test

Note: Please ensure mvn and java version dependencies according to your machine configuration with pom.xml

**Setting Up the Project**

Clone the Repository with following command on terminal:
git clone https://github.com/omkarjadhav644/EntrataSelenium.git
import the pom.xml for the project in the IDE

*Mandatory steps*
Update the correct chromedriver under /Entrata_Assignment/src/main/resources as per your chrome version in format(chromedriver_chromeVersion). In repository it is 129.
Same chrome version need to be updated in /Entrata_Assignment/src/main/resources/Selenium.properties

To execute all the tests run the following command
**mvn verify or mvn clean install**

Alternate solution to run the tests via IDE
Execute the tests with IDE under EntrataTests package for any of the class in MainPageTests,SummitPageTests,WatchDemoFormTests.

You can expect the below output:
<img width="1422" alt="image" src="https://github.com/user-attachments/assets/ce2bf9ae-eb77-432b-9cf7-50724dfb9cba">
