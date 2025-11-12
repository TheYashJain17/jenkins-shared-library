def call(String projectName, String imageTag){

   withCredentials([
                    usernamePassword(
                        credentialsId: "dockerhubCred", 
                        passwordVariable: "dockerPass", 
                        usernameVariable: "dockerUser"
                        )
                    ]){
                        
                        sh "export PATH=$PATH:/usr/local/bin && docker login -u ${env.dockerUser} -p ${dockerPass}"
                        sh "export PATH=$PATH:/usr/local/bin && docker image tag ${env.dockerUser}/${projectName}:${imageTag} ${env.dockerUser}/${projectName}:${imageTag}"
                        sh "export PATH=$PATH:/usr/local/bin && docker push ${env.dockerUser}/${projectName}:${imageTag}"
                        
                    }
                    
                    echo "Pushed theThe Image To dockerhub successfully"
  
}
