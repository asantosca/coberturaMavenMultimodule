#Maven Cobertura#

This is a fully functional Cobertura project written in Maven using multi modules.

The purpose of this project is to demonstrate how to have Cobertura on a Maven project containing multi-modules.

Environment:

* Maven
* jUnit
* Cobertura


How to execute this project:

* Get the files from GitHub
* At the root of the project type `mvn clean test`. It will clean the working directory
and create a cobertura report in `./target/surefire-reports/cobertura/index.html`

On my mac I can open the index.html page by using `open ./target/surefire-reports/cobertura/index.html`.

Notes and Caveats

You'll note that the tests aren't complete. The method getGoodbye is not currently being tested. This is intentional to show how Cobertura handles code not covered.
  
Note that, although there are two modules, the end report contains both reports from the sub modules.
