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

val nativeArtifacts = mutableListOf<String>()

lwjglPlatforms.all { platform, requiresNative ->
    if (requiresNative) {
        if (isPresent && (!isLocal || hasArtifact(platform.classifier()))) {
            nativeArtifacts.add("${project.group}:${project.name}:${project.version}:${platform.classifier()}")
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

val metadataTask = tasks.register("generateMetadata") {
    val outputFile = layout.buildDirectory.file("generated/metadata.txt")
    val text = nativeArtifacts.joinToString("\n")

    outputs.file(outputFile)

    doLast {
        val file = outputFile.get().asFile
        file.parentFile.mkdirs()
        file.writeText(text)
    }
}

configurations.register("metadata") {
    isCanBeResolved = false
    isCanBeConsumed = true
    attributes {
        attribute(Usage.USAGE_ATTRIBUTE, objects.named(Usage::class.java, "metadata"))
    }
    outgoing.artifact(metadataTask) {
        classifier = "metadata"
        extension = "txt"
        builtBy(metadataTask)
    }
}