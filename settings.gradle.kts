rootProject.name = "SmartTomcatAJP"
//systemProp.system=systemValue


pluginManagement {
    repositories {
        maven {
            setUrl("https://maven.aliyun.com/nexus/content/repositories/gradle-plugin")
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
