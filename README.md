### 服务注册中心

url：http://localhost:8080/ --- 打开 Spring Eureka 服务注册中心

### 访问 service0

url：http://localhost:8081/ --- 返回：Hello This Is Service0

url：http://localhost:8081/test --- 返回：Service0

### 访问 service1

url：http://localhost:8082/ --- 返回：Hello This Is Service1

url：http://localhost:8082/hello --- 返回：Service0 Service1

### 访问 gateway

url：http://localhost:8083/service0/ --- 返回：Hello This Is Service0

url：http://localhost:8083/service0/test --- 返回：Service0

url：http://localhost:8083/service1/ --- 返回：Hello This Is Service1

url：http://localhost:8083/service1/hello --- 返回：Service0 Service1






