pipeline {
    agent any
    stages {
        stage('Build') {
            tools {
                jdk "jdk8"
            }
            steps {
                sh './gradlew clean build publish'
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: 'build/libs/*.jar', fingerprint: true
            cleanWs()
        }
    }
}
