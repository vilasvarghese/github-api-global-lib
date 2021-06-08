/*def call(Map config = [:]) {
    sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
}

1. Call this without any parameter 
def call() {
    sh "echo Hello World"
}

2. 

*/
def call(Map config = [:]) {
    sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
}
