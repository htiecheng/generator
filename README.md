# 新建一个空白的springboot工程
# 在maven中添加插件
```
<!-- MyBatis 逆向工程 插件 -->
<plugin>
    <groupId>org.mybatis.generator</groupId>
    <artifactId>mybatis-generator-maven-plugin</artifactId>
    <version>1.3.5</version>
    <dependencies>
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>5.1.37</version>
        </dependency>
    </dependencies>
    <configuration>
        <!--允许移动生成的文件 -->
        <verbose>true</verbose>
        <!-- 是否覆盖 -->
        <overwrite>true</overwrite>
        <!-- 自动生成的配置文件路径 -->
        <configurationFile>src/main/resources/config/generatorConfig.xml</configurationFile>
    </configuration>
</plugin>
```

# 在resources/config中添加generateConfig.xml

# 使用插件运行
## 进入配置

## 设置maven

## 双击运行插件
