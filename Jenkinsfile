#!groovy
String workPath = '/opt/jenkins'
@Library('Jenkinslib') _
def tools = new org.shirann.firstModule()
pipeline {
    agent {node { label "build01"
                customWorkspace "${workPath}"
            }
    }
    stages {
        stage('choseBuildTool') {
            input {
                message "请选择构建工具:"
                ok 'Submit'
                parameters {
                    choice(choices: ['mvn', 'npm', 'gradle', 'ant'], description: '', name: 'Tool')
                }
            }
        }
        stage('choseBuildShell') {
            input {
                message "请选择构建命令:"
                ok 'Submit'
                parameters {
                    choice(choices: ['-v', 'clean package', 'clean', 'clean install', 'clean test'], description: '', name: 'Shell')
                }
            }
        }
        stage('build') {
            timeout(time: 5, unit: "MINUTES"){
                script {
                    tools.build(Tool, Shell)
                }
            }
        }
    }
}

