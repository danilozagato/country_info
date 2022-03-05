pipeline {
   agent {
        docker { image 'maven:3-alpine' }
   }
    stages {
          stage ("test") {
              steps {
                sh 'mvn clean generate-resources'
              }
        }
    }
}