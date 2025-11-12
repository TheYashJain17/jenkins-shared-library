def call(){

      echo "Running The Code"
      sh "export PATH=$PATH:/usr/local/bin && docker compose up -d"
      echo "Code Is Running Successfully"
  
}
