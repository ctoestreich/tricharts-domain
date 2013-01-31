grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"

grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {
        // uncomment to disable ehcache
        // excludes 'ehcache'
    }
    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    legacyResolve true // whether to do a secondary resolve on plugin installation, not advised but set here for backwards compatibility
    repositories {
        grailsPlugins()
        grailsHome()
        grailsCentral()

        mavenLocal()
        mavenCentral()

        mavenRepo "https://repo.springsource.org/repo"
    }
    dependencies {
        // specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes eg.
        runtime 'mysql:mysql-connector-java:5.1.21'
//        compile 'joda-time:joda-time-hibernate:1.3'
//        compile 'org.jadira.usertype:usertype.jodatime:1.9'
        compile "org.jadira.usertype:usertype.jodatime:1.9"
    }

    plugins {
        compile ":joda-time:1.4"
        runtime ":hibernate:$grailsVersion"
//        build(":tomcat:$grailsVersion",
//              ":release:2.2.0",
//              ":rest-client-builder:1.0.3") {
//            export = false
//        }
    }
}
