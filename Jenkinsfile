
pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'Source code is available in the workspace'
            }
        }

        stage('Build and Test') {
            steps {
                bat 'mvnw.cmd -B clean verify'
            }
        }

        stage('Verify JAR') {
            steps {
                bat 'dir target\\*.jar'
            }
        }
    }

    post {
        success {
            echo 'Build and tests completed successfully.'
        }
        failure {
            echo 'Build failed. Check the console output.'
        }
    }
}
