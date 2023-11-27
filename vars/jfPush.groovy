def call(){

  sh 'cd /target'
  sh 'curl -X PUT -u admin -T kubernetes-configmap-reload-0.0.1-SNAPSHOT.jar http://104.198.212.181:8082/artifactory/example-repo-local/'
}
