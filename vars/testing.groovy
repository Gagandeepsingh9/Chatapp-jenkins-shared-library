def call(String user,String image){
    sh "trivy image ${user}/${image} -o image_vulnerabilities.json"
}