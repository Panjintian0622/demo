# 基于哪个镜像
FROM java:8
# 拷贝文件到容器，也可以直接写成ADD microservice-discovery-eureka-0.0.1-SNAPSHOT.jar /app.jar
ADD target/*.jar app.jar
RUN bash -c 'touch /app.jar'
# 开放8000端口
EXPOSE 8000
# 配置容器启动后执行的命令
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dfile.encoding=UTF8","-Duser.timezone=GMT+08","-Xmx600m","-jar","/app.jar"]