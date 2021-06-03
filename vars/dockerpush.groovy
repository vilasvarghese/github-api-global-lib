def call(String project) {
  sh 'docker build . -t vilasvarghese/devops:$Docker_tag'
		   withCredentials([string(credentialsId: 'docker_password', variable: 'docker_password')]) {
				    
				  sh 'docker login -u vilasvarghese -p $docker_password'
				  sh 'docker push vilasvarghese/devops:$Docker_tag'
			}
}
