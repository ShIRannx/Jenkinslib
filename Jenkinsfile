#!groovy
@Library('Jenkinslib') _
def tools = new org.shirann.firstModule.tools()
pipeline {
    agent any
    stages {
        stage('Hello') {
            steps {
                tools.printMes('123')
                echo 'Hello World'
            }
        }
    }
}
