#!groovy
String workPath = '/opt/jenkins'
@Library('Jenkinslib') _
def tools = new org.shirann.firstModule()
def deploy = new org.shirann.deploy()
String Tool = "${env.Tool}"
String Shell = "${env.Shell}"
pipeline {
    agent {node { label "build01"
                customWorkspace "${workPath}"
            }
    }
    options {
        skipDefaultCheckout()
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
        stage('deploy') {
            steps{
                timeout(time: 30, unit: "MINUTES"){
                    script{
                        deploy.AnsibleDeploy("storages", "-m ping")
                    }
                }
            }
        }
    }
}

