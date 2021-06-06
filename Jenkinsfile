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
            echo "Build step..."
                sh "mvn clean package"
            }
            post {
                success {
                    echo "Archiving..."
                    archiveArtifacts artifacts: "**/target/*.war"
                }
            }
        }
        stage("Deploy to staging"){
            steps {
                echo "Deploy step..."
                deploy job: "deploy_to_staging"
            }
        }
    }
}