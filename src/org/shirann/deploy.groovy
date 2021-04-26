#!groovy
package org.shirann

def AnsibleDeploy(host, func){
    sh "ansible ${host} ${func}"
}