#!groovy
@Library('Jenkinslib') _
first()
def tools = new org.shirann.firstModule()
pipeline {
    agent any
    stages {
        stage('Hello') {
            steps {
                script {
                    tools.printMes('123')
                    echo 'Hello World'
                }
            }
        }
    }
}
