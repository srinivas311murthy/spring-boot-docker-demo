pipeline {
    environment {
        registry = "srinivas311murthy/spring-boot-docker-demo"
        registryCredential = 'dockerhub'
        dockerImage = ''
    }
   agent any

   tools {
      // Install the Maven version configured as "M3" and add it to the path.
      maven "maven3"
   }

   stages {
       stage('Checkout') {
         steps {
            // Get some code from a GitHub repository
            git 'https://github.com/srinivas311murthy/spring-boot-docker-demo.git'
         }
      }
    stage('Build') {
         steps {
            // Run Maven on a Unix agent.
            sh "mvn -Dmaven.test.failure.ignore=true clean package"

            // To run Maven on a Windows agent, use
            // bat "mvn -Dmaven.test.failure.ignore=true clean package"
         }

      }
      
     stage('Building image') {
          steps{
            script {
              dockerImage = docker.build registry + ":$BUILD_ID"
            }
          }
      }
      stage('push Image') {
          steps{
            script {
              docker.withRegistry( '', registryCredential ) {
                dockerImage.push()
              }
            }
          }
    }

   }
}
