pipeline{
agent any
environment {
PATH ="/usr/share/maven:$PATH"
}





stages{



 stage("Maven Build"){
 steps{
 sh" mvn -f Calculator/pom.xml clean install"
 }
 }
 
 stage("Unit Testing"){
 steps{
 sh "mvn -f Calculator/pom.xml test"
 }
 }
 
       stage('create image for docker') {
            steps{
                sh 'docker build -t aayushmalviya/calculator ./Calculator/ '
            }
        }
        stage('Run Docker Image')
        {
          steps
          {
          script{
                def docker_container = sh(returnStdout: true, script: 'docker ps -a -f name="Cont1" -q')
                if(docker_container)
                     {
                sh "docker stop ${docker_container}"
                sh "docker rm --force ${docker_container}"
            }
             docker.image('aayushmalviya/calculator').run('--name Cont1')
       
          }
        }
        }
        
       
        

 }
}