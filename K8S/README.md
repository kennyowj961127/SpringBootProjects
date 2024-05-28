kubectl apply -f dashboard-adminuser.yaml

kubectl apply -f dashboard-rolebinding.yaml

kubectl -n kubernetes-dashboard create token admin-user

kubectl get secret admin-user -n kubernetes-dashboard -o jsonpath="{.data.token}" | base64 -d

## Permanent Token

eyJhbGciOiJSUzI1NiIsImtpZCI6IlptYkZJNk9iR2xrTENMbS1lQTFhVDZCaWV2NXV0TmhYTmMtY3NNVEdTaGcifQ.eyJpc3MiOiJrdWJlcm5ldGVzL3NlcnZpY2VhY2NvdW50Iiwia3ViZXJuZXRlcy5pby9zZXJ2aWNlYWNjb3VudC9uYW1lc3BhY2UiOiJrdWJlcm5ldGVzLWRhc2hib2FyZCIsImt1YmVybmV0ZXMuaW8vc2VydmljZWFjY291bnQvc2VjcmV0Lm5hbWUiOiJhZG1pbi11c2VyIiwia3ViZXJuZXRlcy5pby9zZXJ2aWNlYWNjb3VudC9zZXJ2aWNlLWFjY291bnQubmFtZSI6ImFkbWluLXVzZXIiLCJrdWJlcm5ldGVzLmlvL3NlcnZpY2VhY2NvdW50L3NlcnZpY2UtYWNjb3VudC51aWQiOiJmZTY2ZjVmNC02ZTUwLTQ0NjktODgxNi1lMGVmMWQzNjk0NjgiLCJzdWIiOiJzeXN0ZW06c2VydmljZWFjY291bnQ6a3ViZXJuZXRlcy1kYXNoYm9hcmQ6YWRtaW4tdXNlciJ9.R0javCHMS_mo3AiBsj7e8nzj7MU29Oh-ddYfJqoP7phC9RHclfhpMmXQp_Xu7ZRnyNBXsvpWdlzn2LLdsgfUBMrVy_0stjwoWcYVtwLzur97Ht5PUq7FDE6KPjSfCW44jZz76jt_g6DmK7cO18eoMrTkbocqcYb_Zl2IeB5YkJXQo97-ajEBjJBW-HO03iuDf9fuOXRxvvt2e3tIi8N8uonwde8625CITvMCcfub4Jr_xDy6gfbY0DzXZz8mt5oXSH2VRGSr3wQjB4GzZVcQS7p2aZnfFqVo4Od1edGSv-dQe38DdMXm1noEjlmu6OCeXw5DVkBMmMvIsEwSQOCGAA


kubectl get deployments

kubectl get services

kubectl get replicaset

kubectl get pods

kubectl apply -f configserver.yml

kubectl delete pod name

## Logs of a pod
kubectl get events --sort-by=.metadata.creationTimestamp

## Scale the deployment
kubectl scale deployment accounts-deployment --replicas=1

kubectl describe pods name

## Update the image
kubectl set image deployment gatewayserver-deployment gatewayserver=eazybytes/gatewayserver:s11 --record

## Rollout history
kubectl rollout history deployment gatewayserver-deployment

## Rollback to previous version
kubectl rollout undo deployment gatewayserver-deployment --to-revision=1

## Delete the deployment
kubectl delete -f filename