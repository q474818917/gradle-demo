# gradle-demo
+ mkdir gradle-demo
+ cd gradle-demo 
+ gradle init
+ 编辑build.gradle
```
apply plugin:'templates'
buildscript {
    repositories {
        maven {
            url 'http://dl.bintray.com/cjstehno/public'
        }
    }
    dependencies {
        classpath 'gradle-templates:gradle-templates:1.4.1'
    }
}
```
+ gradle initWebappProject
+ 导入idea、配置gradle_home，使用自己配置的gradle
+ 添加依赖
```
dependencies {
    // The production code uses the SLF4J logging API at compile time
    compile 'org.slf4j:slf4j-api:1.7.14'
    compile 'ch.qos.logback:logback-core:1.1.3'
    compile 'ch.qos.logback:logback-classic:1.1.3'
    compile 'org.springframework:spring-context:4.3.4.RELEASE'
    compile 'org.springframework:spring-web:4.3.4.RELEASE'
    compile 'org.springframework:spring-webmvc:4.3.4.RELEASE'
    testCompile 'junit:junit:4.12'
}
```
+ 点击右侧的gradle，刷新，加载jar包
+ 运行gradle jettyRun
