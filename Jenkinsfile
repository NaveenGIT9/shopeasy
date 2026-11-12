pipeline {
    agent any

    stages {
        stage('Build & Test') {
            steps {
                sh 'mvn -B clean package'
            }
        }
    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
        success {
            archiveArtifacts artifacts: 'target/shopeasy.war'
        }
    }
}
