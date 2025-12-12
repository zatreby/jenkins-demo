pipeline {
    agent any

    tools {
        maven 'Maven'
        jdk 'Java'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/zatreby/jenkins-demo.git'
            }
        }

        stage('Build') {
            steps {
                echo 'compiling...'
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                echo 'testing...'
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                echo 'packaging...'
                sh 'mvn package'
            }
        }
    }
}

