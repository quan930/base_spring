package cn.lilq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * @auther: Li Liangquan
 * @date: 2021/2/10 17:34
 * spring base 项目
 * maven 中央仓库
 * docker 构建 push
 *
 * 生成镜像
 * mvn dockerfile:build 或 mvn package 即可生成镜像
 * 推送镜像
 * mvn deploy 或 mvn dockerfile:push
 * 在settings.xml中配置server
 * ----------------------------------------
 * <servers>
 *  <server>
 *      <id>docker.io</id>
 *      <username>xxxxxx</username>
 *      <password>xxxxxxxx</password>
 *  </server>
 * </servers>
 * -----------------------------------------
 *
 * maven提交中央仓库 mvn deploy
 * ----------------------------------------
 * <servers>
 *  <server>
 *      <id>ossrh</id>
 *      <username>xxxxxx</username>
 *      <password>xxxxxxxx</password>
 *  </server>
 * </servers>
 * -----------------------------------------
 * -----------------------------------------
 * <settings>
 * <profiles>
 *   <profile>
 *     <id>ossrh</id>
 *     <activation>
 *       <activeByDefault>true</activeByDefault>
 *     </activation>
 *     <properties>
 *       <gpg.executable>gpg2</gpg.executable>
 *       <gpg.passphrase>the_pass_phrase</gpg.passphrase>
 *     </properties>
 *   </profile>
 * </profiles>
 * </settings>
 * -----------------------------------------
 */
@SpringBootApplication
public class BaseSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(BaseSpringApplication.class, args);
    }
}
