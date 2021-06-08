/*

1. Call this without any parameter. helloWorld() 
def call() {
    sh "echo Hello World"
}

2.helloWorld(name:"Vilas",dayOfWeek:"Monday")
def call(Map config = [:]) {
    sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
}

*/
def call(Map config = [:]) {
    sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
}
