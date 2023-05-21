#e an official tomcat image as a parent image
FROM tomcat:7

#giving the working directory
WORKDIR aayushmalviya/calculator .

#Clean the base directory of tomcat
RUN rm -rf /usr/local/tomcat/webapps/*

#copy war file of project created to the root for tomcat deployement
COPY ./target/Calculator.war /usr/local/tomcat/webapps/ROOT.war

#running the command to start tomcat
CMD ["catalina.sh", "run"]