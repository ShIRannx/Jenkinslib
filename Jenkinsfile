#!groovy
String workPath = '/opt/jenkins'
@Library('Jenkinslib') _
def tools = new org.shirann.firstModule()
String Tool = "${env.Tool}"
String Shell = "${env.Shell}"
pipeline {
    agent {node { label "build01"
                customWorkspace "${workPath}"
            }
    }
    stages {
        stage('build') {
            steps{
                timeout(time: 5, unit: "MINUTES"){
                    script {
                        tools.build("${Tool}", "${Shell}")
                    }
                }
            }
        }
    }
}

