def call(){

  sh 'curl -X PUT -u admin:Pass@1234 -T  /var/lib/jenkins/workspace/demo/target/kubernetes-configmap-reload-0.0.1-SNAPSHOT.jar http://35.209.248.239:8082/artifactory/example-repo-local/'
}
