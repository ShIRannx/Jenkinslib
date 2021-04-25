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
                    mav = tool "${M2}/bin"
                    sh "mav -v"
                    tools.printMes('123')
                    echo 'Hello World'
                }
            }
        }
    }
}
