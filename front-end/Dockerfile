FROM node:12.18.2-alpine AS builder
WORKDIR /usr/src/app
COPY package.json package-lock.json ./
RUN npm install
COPY . .
RUN npm run build-prod

FROM nginx:alpine
WORKDIR /usr/share/nginx/html
# Remove default nginx static assets
RUN rm -rf ./*
# Copy static assets from builder stage
COPY --from=builder /usr/src/app/dist/ .
# Containers run nginx with global directives and daemon off
ENTRYPOINT ["nginx", "-g", "daemon off;"]
