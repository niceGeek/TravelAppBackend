FROM payara/server-full:latest
COPY target/travel-app-backend-1.0.war $DEPLOY_DIR

