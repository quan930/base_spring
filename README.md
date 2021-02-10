# base_spring
spring base 项目
### docker
+ 生成镜像 
`mvn dockerfile:build` 或 `mvn package` 即可生成镜像
+ 推送镜像
`mvn deploy` 或 `mvn dockerfile:push`
 在settings.xml中配置server
```xml
<servers>
    <server>
        <id>docker.io</id>
        <username>xxxxxx</username>
        <password>xxxxxxxx</password>
    </server>
</servers>
```