pipeline {
    agent any
    stages{
        stage('Init'){
            steps {
                sh "mvn clean package"
            }
            post {
                sucess {
                    echo "Archiving..."
                    archiveArtifacts artifacts: "**/target/*.war"
                }
            }
        }
        stage('Build'){
            steps {
                echo "Build step..."
            }
        }
        stage('Deploy'){
            steps {
                echo "Deploy step..."
            }
        }
    }
}