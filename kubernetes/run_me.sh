echo "#"
echo "# Create fluentd namespace"
echo "#"
kubectl create namespace fluentd

echo "#"
echo "# Load the RBAC needed for fluentd to function"
echo "#"
kubectl apply -f fluentd-rbac.yaml

echo "#"
echo "# Delete all the configmaps if exists"
echo "#"
kubectl delete configmaps -n fluentd fluentd-config

echo "#"
echo "# Apply a new config maps"
echo "#"
kubectl apply -f fluentd-configmap.yaml

echo "#"
echo "# Check if the configmaps is started successfully"
echo "#"
kubectl get configmaps -A

echo "#"
echo "# Delete the old fluentd demonsets"
echo "#"
kubectl delete daemonset fluentd -n fluentd

echo "#"
echo "# Load a fresh fluentd demonsets"
echo "#"
kubectl apply -f fluentd.yaml

echo "#"
echo "# Get the list of demonsets and if they are started successfully"
echo "#"
kubectl get daemonset -A

echo "#"
echo "# Get all the pods are see if they are started"
echo "#"
kubectl get pods -A

echo "#"
echo "# Delete all the error stack generators pods"
echo "#"
kubectl delete pod simple-spring-boot-java-stack-error-generator -n java-error-stack-ns
kubectl delete pod complex-spring-webflux-java-stack-error-generator -n java-error-stack-ns
kubectl delete pod complex-plain-java-error-generator -n java-error-stack-ns
kubectl delete namespace java-error-stack-ns

echo "#"
echo "# Create the pod namespace"
echo "#"
kubectl create namespace java-error-stack-ns

echo "#"
echo "# Load all the error stack generator pods"
echo "#"
kubectl apply -f error-stack-pods.yml

echo "#"
echo "#  Sleep for 10 seconds for container to start"
echo "#"
sleep 10

echo "#"
echo "# Check the logs of fluentd and see if have no errors"
echo "#"
kubectl logs -n fluentd  `kubectl get pods -n fluentd -o=jsonpath='{.items[0].metadata.name}'`

echo "#"
echo "# Connect to fluentd pods"
echo "#"
kubectl exec  -n fluentd -it `kubectl get pods -n fluentd -o=jsonpath='{.items[0].metadata.name}'` bash