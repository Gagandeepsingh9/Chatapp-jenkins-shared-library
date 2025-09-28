def call(String user,String image){
     sh "docker build -t ${user}/${image} ."
}