#!groovy
String workPath = '/opt/jenkins'
@Library('Jenkinslib') _
def tools = new org.shirann.firstModule()
def deploy = new org.shirann.deploy()
String buildShell = "${env.buildShell}"
String srcUrl = "${env.srcUrl}"
String branchName = "${env.branchName}"
String buildType = "${env.buildType}"
pipeline {
    agent {node { label "build01"
                customWorkspace "${workPath}"
            }
    }
    options {
        skipDefaultCheckout()
    }
    stages {
        stage('checkout'){
            steps{
                script {
                    checkout([$class: 'GitSCM', branches: [[name: "${branchName}"]], extensions: [], userRemoteConfigs: [[credentialsId: 'cd85d544-e1c8-4f7a-a2ae-0a463216f918', url: "${srcUrl}"]]])
                }
            }
        }
        stage('build') {
            steps{
                timeout(time: 5, unit: "MINUTES"){
                    steps {
                        script {
                            tools.build("${buildType}", "${buildShell}")
                        }
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