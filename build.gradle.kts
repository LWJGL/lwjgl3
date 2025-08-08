/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
import java.net.*

plugins {
    `java-platform`
    `maven-publish`
    signing
}

enum class Artifacts(
    val artifact: String,
    val projectName: String,
    val projectDescription: String,
    vararg val platforms: Platforms
) {

    fun directory(buildDir: String) = "$buildDir/$artifact"

    private fun path() = "${directory("bin/MAVEN")}/$artifact"

    val isActive get() = File(directory("bin/RELEASE")).exists()

    fun hasArtifact(classifier: String) = File("${directory("bin/RELEASE")}/${artifact}-${classifier}.jar").exists()

    fun artifact(classifier: String? = null) =
        if (classifier === null)
            File("${path()}.jar")
        else
            File("${path()}-$classifier.jar")

}

publishing {
    publications {
        /*
        Ideally, we'd have the following structure:
        -------------------------------------------
        lwjgl
            lwjgl-windows (depends on lwjgl)
        glfw (depends on lwjgl)
            glfw-windows (depends on glfw & lwjgl-windows)
        stb (depends on lwjgl)
            stb-windows (depends on stb & lwjgl-windows)
        -------------------------------------------
        If a user wanted to use GLFW + stb in their project, running on
        the Windows platform, they'd only have to define glfw-windows
        and stb-windows as dependencies. This would automatically
        resolve stb, glfw, lwjgl and lwjgl-windows as transitive
        dependencies. Unfortunately, it is not possible to define such
        a relationship between Maven artifacts when using classifiers.
        A method to make this work is make the natives-<arch> classified
        JARs separate artifacts. We do not do it for aesthetic reasons.
        Instead, we assume that a tool is available (on the LWJGL website)
        that automatically generates POM/Gradle dependency structures for
        projects wanting to use LWJGL. The output is going to be verbose;
        the above example is going to look like this in Gradle:
        -------------------------------------------
        compile 'org.lwjgl:lwjgl:$lwjglVersion' // NOTE: this is optional, all binding artifacts have a dependency on lwjgl
            compile 'org.lwjgl:lwjgl:$lwjglVersion:natives-$lwjglArch'
        compile 'org.lwjgl:lwjgl-glfw:$lwjglVersion'
            compile 'org.lwjgl:lwjgl-glfw:$lwjglVersion:natives-$lwjglArch'
        compile 'org.lwjgl:lwjgl-stb:$lwjglVersion'
            compile 'org.lwjgl:lwjgl-stb:$lwjglVersion:natives-$lwjglArch'
        -------------------------------------------
        and a whole lot more verbose in Maven. Hopefully, the automation
        is going to alleviate the pain.
         */
        fun org.gradle.api.publish.maven.MavenPom.setupPom(pomName: String, pomDescription: String, pomPackaging: String) {
            name.set(pomName)
            description.set(pomDescription)
            packaging = pomPackaging
        }

        Artifacts.values().forEach { module ->
            if (module.isActive) {
                create<MavenPublication>("maven${module.name}") {
                    artifactId = module.artifact
                    artifact(module.artifact())
                    if (publishType !== PublishType.LOCAL || module.hasArtifact("sources")) {
                        artifact(module.artifact("sources")) {
                            classifier = "sources"
                        }
                    }
                    if (publishType !== PublishType.LOCAL || module.hasArtifact("javadoc")) {
                        artifact(module.artifact("javadoc")) {
                            classifier = "javadoc"
                        }
                    }
                    module.platforms.forEach {
                        if (publishType !== PublishType.LOCAL || module.hasArtifact("natives-${it.classifier}")) {
                            artifact(module.artifact("natives-${it.classifier}")) {
                                classifier = "natives-${it.classifier}"
                            }
                        }
                    }

                    pom {
                        setupPom(module.projectName, module.projectDescription, "jar")

                        if (module != Artifacts.CORE) {
                            withXml {
                                asNode().appendNode("dependencies").apply {
                                    appendNode("dependency").apply {
                                        appendNode("groupId", "org.lwjgl")
                                        appendNode("artifactId", "lwjgl")
                                        appendNode("version", project.version)
                                        appendNode("scope", "compile")
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        create<MavenPublication>("lwjglBOM") {
            from(components["javaPlatform"])
            artifactId = "lwjgl-bom"

            pom {
                setupPom("LWJGL BOM", "LWJGL 3 Bill of Materials.", "pom")

                withXml {
                    asElement().getElementsByTagName("dependencyManagement").item(0).apply {
                        asElement().getElementsByTagName("dependencies").item(0).apply {
                            Artifacts.values().forEach { module ->
                                module.platforms.forEach {
                                    ownerDocument.createElement("dependency").also(::appendChild).apply {
                                        appendChild(ownerDocument.createElement("groupId").also(::appendChild).apply { textContent = "org.lwjgl" })
                                        appendChild(ownerDocument.createElement("artifactId").also(::appendChild).apply { textContent = module.artifact })
                                        appendChild(ownerDocument.createElement("version").also(::appendChild).apply { textContent = project.version as String })
                                        appendChild(ownerDocument.createElement("classifier").also(::appendChild).apply { textContent = "natives-${it.classifier}" })
                                    }
                                }
                            }
                        }
                    }

                    // Workaround for https://github.com/gradle/gradle/issues/7529
                    asNode()
                }
            }
        }
    }
}

val copyArchives = tasks.create<Copy>("copyArchives") {
    from("bin/RELEASE")
    include("**")
    destinationDir = buildDir
}

tasks.withType<Sign> {
    dependsOn(copyArchives)
}

dependencies {
    constraints {
        Artifacts.values().forEach { module ->
            api("org.lwjgl:${module.artifact}:$version")
        }
    }
}