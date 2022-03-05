pipeline {
   agent {
        docker { dockerfile true }
    }
    stages {
          stage ("test") {
              steps {
                sh 'mvn clean generate-resources'
              }
        }
    }
}