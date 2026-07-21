pipeline {
    agent any

    stages {
        stage('clone') {
            steps {
                git url: 'https://github.com/kalavathi-s/testProject.git', branch: 'main'
            }
        }

        stage('build') {
            steps {
                sh 'echo "JAVA_HOME=$JAVA_HOME" && java -version && mvn -version'
                sh 'mvn clean package'
            }
        }
        stage('deploy') {
            steps {
                sh 'sudo cp /var/lib/jenkins/workspace/pipeline/target/beautiful-war-demo.war /home/ec2-user/apache-tomcat-10.1.57/webapps'
            }
        }
    }
}
