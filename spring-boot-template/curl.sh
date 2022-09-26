curl localhost:8080/api/
curl -d 'parameter' -X POST localhost:8080/api/
curl -X DELETE localhost:8080/api/12
curl -d '{"field":"value"}' -H "Content-Type: application/json" -X PUT localhost:8080/api/
curl -d '{"field":"value"}' -H "Content-Type: application/json" -X PATCH localhost:8080/api/