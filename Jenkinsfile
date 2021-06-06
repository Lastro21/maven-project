pipeline {
    agent any
    stages{
        stage("Init"){
            steps {
                echo "Init step..."
            }
        }
        stage("Build"){
            steps {
            echo "Init step..."
                sh "mvn clean package"
            }
            post {
                success {
                    echo "Archiving..."
                    archiveArtifacts artifacts: "**/target/*.war"
                }
            }
        }
        stage("Deploy"){
            steps {
                echo "Deploy step..."
            }
        }
    }
}