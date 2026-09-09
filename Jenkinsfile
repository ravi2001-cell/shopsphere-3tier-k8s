pipeline {
  agent any
  environment { IMAGE_TAG = "${BUILD_NUMBER}" }
  stages {
    stage('Checkout'){ steps { checkout scm } }
    stage('Backend Test & Build'){ steps { dir('backend'){ sh 'mvn clean verify' } } }
    stage('Frontend Build'){ steps { dir('frontend'){ sh 'npm install && npm run build' } } }
    stage('Docker Build'){ steps { sh 'docker build -t shopsphere-backend:${IMAGE_TAG} backend'; sh 'docker build -t shopsphere-frontend:${IMAGE_TAG} frontend' } }
    stage('Trivy Scan'){ steps { sh 'trivy image --exit-code 0 --severity HIGH,CRITICAL shopsphere-backend:${IMAGE_TAG}'; sh 'trivy image --exit-code 0 --severity HIGH,CRITICAL shopsphere-frontend:${IMAGE_TAG}' } }
  }
  post { always { cleanWs() } }
}
