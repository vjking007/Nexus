//Generate a Jenkinsfile for a maven project with stages for build, test, and deploy with simple echo commands in each stage.
//Use a declarative pipeline syntax.
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building the project...'
                // Add your build commands here, e.g., sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                echo 'Running tests...'
                // Add your test commands here, e.g., sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying the application...'
                // Add your deploy commands here, e.g., sh 'mvn deploy'
            }
        }
    }

    post {
        always {
            echo 'This will always run after the stages.'
        }
        success {
            echo 'The pipeline completed successfully!'
        }
        failure {
            echo 'The pipeline failed.'
        }
    }
}