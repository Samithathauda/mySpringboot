
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


stage('Test EC2 SSH') {
    steps {
        withCredentials([
            sshUserPrivateKey(
                credentialsId: 'ec2-deploy-key',
                keyFileVariable: 'EC2_KEY',
                usernameVariable: 'EC2_USER'
            )
        ]) {
            bat '''
                ssh -i "%EC2_KEY%" -o StrictHostKeyChecking=accept-new -o BatchMode=yes %EC2_USER%@16.170.215.201 "echo SSH_CONNECTION_SUCCESS"
            '''
        }
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
