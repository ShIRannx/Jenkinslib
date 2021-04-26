package org.shirann

def printMes(content){
  println(content)
}


def build(buildType, buildShell){
  def buildTools = ["maven": "M2", "gradle": "Gradle", "ant": "Ant", "npm": "Nodejs"]
  println("当前选择的构建类型为:${buildType}")
  buildToolHome = tool buildTools[buildType]
  sh "${buildToolHome}/bin/${buildType} ${buildShell}"
}