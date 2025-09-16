pipeline {
    agent any
    tools { maven 'Maven-3.9.1' }
    stages {
        stage('Checkout') {
            steps {
                echo "📥 Checking out source code..."
                git branch: 'main', url: 'https://github.com/vjking007/Nexus.git'
            }
        }

        stage('Build') {
            steps {
                echo "🏗️ Building the project with Maven..."
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Test') {
            steps {
                echo "🧪 Running tests..."
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }

        stage('Archive Artifact') {
            steps {
                echo "📦 Archiving build artifacts..."
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
    }

    post {
        success {
            echo "✅ Build and test completed successfully!"
        }
        failure {
            echo "❌ Build failed. Please check logs."
        }
    }
}
