#!groovy
String workPath = '/opt/jenkins'
@Library('Jenkinslib') _
first()
def tools = new org.shirann.firstModule()
pipeline {
    agent {node { label "build01"
                customWorkspace "${workPath}"
            }
    }
    stages {
        stage('Hello') {
            steps {
                script {
                    javaHome = tool 'jdk'
                    sh "${javaHome}/bin/java -version"
                    mavenHome = tool 'M2'
                    println(mavenHome)
                    sh "${mavenHome}/bin/mvn -v"
                    // sh '/usr/local/apache-maven-3.8.1/bin/mvn -v'
                    tools.printMes('123')
                    echo 'Hello World'
                }
            }
        }
    }
}
