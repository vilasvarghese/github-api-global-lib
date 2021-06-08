/*def call(Map config = [:]) {
    sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
}

1. Call this without any parameter 

def call() {
    sh "echo Hello World"
}
*/
def call(String name, String dt) {
    sh "echo Hello World ${name} ${dt}"
}
