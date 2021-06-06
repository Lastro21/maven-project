pipeline {
    agent any
    stages {
        stage("Init") {
            steps {
                echo "Init step..."
            }
        }
        stage("Build") {
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
        stage("Deploy to staging") {
            steps {
                echo "Deploy step..."
                build job: "deploy_to_staging"
            }
        }
        stage("Deploy to production") {
            steps {
                echo "Deploy step..."
                timeout(time: 5, unit: 'DAYS') {
                    input message: "Approve Prod deployment?"
                }
                build job: "deploy_to_prod"
            }
        }
    }
}