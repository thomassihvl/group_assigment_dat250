# dat250-jpa-examples

 - Atom / Sublime / vi ...
 - jdk
 - Maven

 - https://maven.apache.org
 https://maven.apache.org/download.cgi (download)
 https://maven.apache.org/install.html (install)
 https://maven.apache.org/run.html (validate)

download -> install -> validate (check individual tools first, if it has not been tested it does not work)

 - git client

Derby Database

http://db.apache.org/derby/

http://db.apache.org/derby/papers/DerbyTut/index.html (installation, and validation instructions instructions)

- did not configure DERBY_INSTALL and Embedded Derby?
- CLASSPATH install juts for the sampleapp example
- run ./ij and ./sysinfo to verify

http://db.apache.org/derby/derby_downloads.html (download)

Eclipse Database Connecticity

https://www.vogella.com/tutorials/EclipseDataToolsPlatform/article.html

Also need to install the Derby package

https://github.com/selabhvl/dat250public/wiki

Problem with a driver name already existing (rename derby client does not seem to solve the problem). Insists on connecting with username and password

"A driver already exists with that name. Please provide a unique driver name.""

 https://www.jetbrains.com/help/idea/connecting-to-a-database.html#connect-to-derby-database

 - works with user / user (username, password) (and also other username/password)

https://mkyong.com/maven/how-to-create-a-java-project-with-maven/

 JPA example for lectures

 <dependency>
     <groupId>org.apache.derby</groupId>
     <artifactId>derbyclient</artifactId>
     <version>10.15.2.0</version>
 </dependency>

 <dependency>
    <groupId>org.apache.derby</groupId>
    <artifactId>derby</artifactId>
    <version>10.15.2.0</version>
</dependency>
 https://www.vogella.com/tutorials/JavaPersistenceAPI/article.html

Cannot load the driver class in persistence.xml. Both libraries has been tested.

Drivere er nå i derbytools...

http://zetcode.com/java/eclipselink/

https://www.eclipse.org/eclipselink/

https://wiki.eclipse.org/EclipseLink/Maven


Move into general setup?
https://codefresh.io/docker-tutorial/java_docker_pipeline/

https://gist.github.com/lordofthelake/5833336

https://intellipaat.com/community/21525/git-untrack-folder-remove-a-folder-from-git-tracking
