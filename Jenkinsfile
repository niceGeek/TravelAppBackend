pipeline {
    agent any
    stages {
    stage('Test') {
            steps {
                bat 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }

            }

        }
    stage('Build') {
            steps {
                bat 'mvn -B -DskipTests clean package'
            }
        }
        		
    }
}