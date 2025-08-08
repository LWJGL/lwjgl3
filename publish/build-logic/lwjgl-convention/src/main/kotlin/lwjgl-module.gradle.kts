/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
plugins {
    id("lwjgl-adhoc")
    id("lwjgl-publishing")
    id("lwjgl-platforms")
}

fun getFile(path: String): File {
    val root = project.rootProject.layout.projectDirectory.asFile
    return root.resolve("bin/RELEASE/${project.name}/${path}")
}

fun hasArtifact(classifier: String): Boolean {
    return getFile("${project.name}-${classifier}.jar").exists()
}

fun getArtifact(classifier: String? = null): File {
    return if (classifier == null) {
        getFile("${project.name}.jar")
    } else {
        getFile("${project.name}-${classifier}.jar")
    }
}

val isPresent = getFile("").exists()
val isLocal = lwjglPublication.isLocal

lwjglPublication.isEnabled = isPresent

if (isPresent) {
    lwjglAdhoc.main(getArtifact())
}

if (isPresent && (!isLocal || hasArtifact("javadoc"))) {
    lwjglAdhoc.javadoc(getArtifact("javadoc"))
}

if (isPresent && (!isLocal || hasArtifact("sources"))) {
    lwjglAdhoc.sources(getArtifact("sources"))
}

lwjglPlatforms.all { platform, requiresNative ->
    if (requiresNative) {
        if (isPresent && (!isLocal || hasArtifact(platform.classifier()))) {
            lwjglAdhoc.platform(platform.os, platform.arch, platform.classifier(), getArtifact(platform.classifier()))
        }
    } else {
        lwjglAdhoc.platform(platform.os, platform.arch, platform.classifier())
    }
}

lwjglPublication.all {
    from(components["lwjgl"])

    suppressAllPomMetadataWarnings()

    pom {
        packaging = "jar"
    }
}