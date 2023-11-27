def call(){

  sh 'cd /var/lib/jenkins/workspace/demo1/target'
  sh 'curl -X PUT -u admin -T kubernetes-configmap-reload-0.0.1-SNAPSHOT.jar http://http://35.209.248.239:8082/artifactory/example-repo-local/'
}
