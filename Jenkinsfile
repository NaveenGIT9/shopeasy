pipeline {
    agent any

    stages {
        stage('Build & Test') {
            steps {
                sh 'mvn -B clean package'
            }
        }
        stage('Deploy to Tomcat') {
            steps {
                sh 'cp target/shopeasy.war $HOME/devops/tomcat/webapps/'
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
