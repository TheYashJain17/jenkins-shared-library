def call(String ProjectName, String ImageTag, String DockerHubUser){

   echo "Building the docker Image From Clonned Code"
   sh "export PATH=$PATH:/usr/local/bin && docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
   echo "Docker Image Built Successfully"
  
}
