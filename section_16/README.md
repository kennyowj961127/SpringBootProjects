helm ls

helm repo add bitnami https://charts.bitnami.com/bitnami

helm install happy-panda bitnami/wordpress


## Create Helm Chart
helm create mychart

## Build Helm Chart
helm dependencies build

## Get Helm Chart
helm template .

## KeyCloak Helm Chart
Step 1, helm dependencies build

Step 2. helm install keyclock keycloak

** Please be patient while the chart is being deployed **

Keycloak can be accessed through the following DNS name from within your cluster:

    keycloak.default.svc.cluster.local (port 80)

To access Keycloak from outside the cluster execute the following commands:

1. Get the Keycloak URL by running these commands:

  NOTE: It may take a few minutes for the LoadBalancer IP to be available.
        You can watch its status by running 'kubectl get --namespace default svc -w keycloak'

    export HTTP_SERVICE_PORT=$(kubectl get --namespace default -o jsonpath="{.spec.ports[?(@.name=='http')].port}" services keycloak)
    export SERVICE_IP=$(kubectl get svc --namespace default keycloak -o jsonpath='{.status.loadBalancer.ingress[0].ip}')

    echo "http://${SERVICE_IP}:${HTTP_SERVICE_PORT}/"

2. Access Keycloak using the obtained URL.
3. Access the Administration Console using the following credentials:

  echo Username: user
  echo Password: $(kubectl get secret --namespace default keycloak -o jsonpath="{.data.admin-password}" | base64 -d)


## Pod - PVC
kubectl get pvc

kubectl delete pvc <pvc-name>