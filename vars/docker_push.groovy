def call(){

   withCredentials([
                    usernamePassword(
                        credentialsId: "dockerhubCred", 
                        passwordVariable: "dockerPass", 
                        usernameVariable: "dockerUser"
                        )
                    ]){
                        
                        sh "export PATH=$PATH:/usr/local/bin && docker login -u ${env.dockerUser} -p ${dockerPass}"
                        sh "export PATH=$PATH:/usr/local/bin && docker image tag ai-landing-page ${env.dockerUser}/ai-landing-page"
                        sh "export PATH=$PATH:/usr/local/bin && docker push ${env.dockerUser}/ai-landing-page"
                        
                    }
                    
                    echo "Pushed theThe Image To dockerhub successfully"
  
}
