/*

1. Call this without any parameter. helloWorld() 
def call() {
    sh "echo Hello World"
}

2.helloWorld(name:"Vilas",dayOfWeek:"Monday")
def call(Map config = [:]) {
    sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
}

Entire pipeline code to call
@Library('shared-library') _
pipeline{
	agent any
	stages {
		stage("Example") {
			steps {
			    helloWorld(name:"Vilas",dayOfWeek:"Monday")
				//helloWorld()

			}
		}
	}
}

*/
def call() {
    sh "Today is 8th June, 2021"
}
