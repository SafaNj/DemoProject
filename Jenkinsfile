pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/SafaNj/DemoProject.git'
            }
        }

        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('SonarQube') {
                    sh """
                        ${tool 'Scanner'}/bin/sonar-scanner \
                          -Dsonar.projectKey=DemoProject \
                          -Dsonar.sources=src \
                          -Dsonar.java.binaries=.
                    """
                }
            }
        }
    }
}
