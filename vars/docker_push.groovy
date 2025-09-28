def call(String cred_id,String image){
  withCredentials([usernamePassword(
    credentialsId: "${cred_id}",
    usernameVariable: "DOCKER_USER",
    passwordVariable: "DOCKER_PASS")])
  {
    sh "echo ${env.DOCKER_PASS} | docker login -u ${env.DOCKER_USER} --password-stdin"
    sh "docker push ${env.DOCKER_USER}/${image}"
}
}
