pipeline {
    agent any

    tools {
        maven 'Maven'
        jdk 'JDK11'
    }

    options {
        timestamps()
    }

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/kalavathi-s/testProject.git', branch: 'main'
            }
        }

        stage('Build and Test') {
            steps {
                sh 'mvn -B clean verify'
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: 'target/*.war', allowEmptyArchive: true
            junit allowEmptyResults: true, testResults: 'target/surefire-reports/*.xml'
        }
    }
}
