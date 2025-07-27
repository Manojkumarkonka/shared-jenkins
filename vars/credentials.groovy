def call(){
  withCredentials([usernamePassword(credentialsId:'credentialsid',usernameVariable:'dockerusername',passwordVariable:'docker-password')])
  sh "docker login -u {env.$dockerusername} -p {env.$docker-password}"
}
                   
