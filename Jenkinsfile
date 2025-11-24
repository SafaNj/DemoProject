pipeline {
    agent any
    
    stages {
        stage('Setup SSH') {
            steps {
                sh '''
                mkdir -p ~/.ssh
                ssh-keyscan github.com >> ~/.ssh/known_hosts
                '''
            }
        }
        
        stage('Checkout') {
            steps {
                git credentialsId: 'github-ssh-key', 
                    url: 'git@github.com:SafaNj/DemoProject.git',
                    branch: 'main'
            }
        }
        
        stage('Build & Analyze') {
            steps {
                echo '🚀 Building and analyzing with SonarQube...'
                sh 'ls -la'  // Voir les fichiers
                sh 'find . -name "*.java"'  // Vérifier les fichiers Java
            }
        }
    }
}
