# ShopSphere — 3-Tier Kubernetes E-Commerce

Production-style learning project with a React frontend, Spring Boot REST API, PostgreSQL persistence, JWT authentication, Docker, and Kubernetes manifests.

## Features
- Register and login before accessing the store
- BCrypt password hashing + JWT authentication
- Product catalogue and premium responsive UI
- Cart, checkout, persistent orders and order history
- PostgreSQL persistence
- Docker images for frontend/backend
- Kubernetes Deployments, Services, ConfigMap, Secret, PostgreSQL StatefulSet/PVC, Ingress and HPA

## Architecture
Browser -> Ingress -> frontend (Nginx/React) -> /api -> backend (Spring Boot) -> PostgreSQL

## Local development
1. Start PostgreSQL: `docker compose up -d db`
2. Backend: `cd backend && mvn spring-boot:run`
3. Frontend: `cd frontend && npm install && npm run dev`

## Docker Compose
`docker compose up --build`
Open http://localhost:8080

## Kubernetes
Build/push images, replace `YOUR_DOCKERHUB_USER` in `k8s/frontend.yaml` and `k8s/backend.yaml`, then:
`kubectl apply -f k8s/`

For a production AWS deployment, use EKS + AWS Load Balancer Controller + RDS PostgreSQL and store secrets in AWS Secrets Manager/External Secrets instead of Git.