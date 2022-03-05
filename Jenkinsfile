pipeline {
   agent { dockerfile true }
    stages {
          stage ("test") {
              steps {
                sh 'mvn clean generate-resources'
              }
        }
    }
}