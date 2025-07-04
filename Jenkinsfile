// create a pipeline that runs the tests and builds the project
pipeline {
    agent any // use any available agent
    stages {
        stage('Build') {
            steps {
                // Build the project using Maven
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                // Run the tests using Maven
                sh 'mvn test'
            }
        }
    }
}