/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
plugins {
    `maven-publish`
    signing
    id("lwjgl-publication")
}

val lwjglGroup: String by project
val lwjglVersion: String by project

val signingKeyId: String? by project
val signingKey: String? by project
val signingPassword: String? by project

val sonatypeUsername: String? by project
val sonatypePassword: String? by project

val releaseRepo: String? by project
val snapshotRepo: String? by project

val pomUrl: String? by project
val pomScmConnection: String? by project
val pomScmDeveloperConnection: String? by project
val pomScmUrl: String? by project
val pomLicenseName: String? by project
val pomLicenseUrl: String? by project
val pomLicenseDistribution: String? by project
val pomDeveloperId: String? by project
val pomDeveloperName: String? by project
val pomDeveloperEmail: String? by project
val pomDeveloperUrl: String? by project

enum class PublishType {
    LOCAL,
    SNAPSHOT,
    RELEASE;

    override fun toString(): String = name.lowercase()
}

val publishType: PublishType = when {
    hasProperty("release") -> PublishType.RELEASE
    hasProperty("snapshot") -> PublishType.SNAPSHOT
    else -> PublishType.LOCAL
}

logger.info("Publishing to {} repository", publishType)

data class SigningCredentials(
    val keyId: String,
    val key: String,
    val password: String
)

data class PublishingCredentials(
    val username: String,
    val password: String
)

data class PomScmInfo(
    val connection: String,
    val developerConnection: String,
    val url: String
)

data class PomLicenseInfo(
    val name: String,
    val url: String,
    val distribution: String
)

data class PomDeveloperInfo(
    val id: String,
    val name: String,
    val email: String,
    val url: String
)

data class PomInfo(
    val url: String,
    val scm: PomScmInfo,
    val license: PomLicenseInfo,
    val developer: PomDeveloperInfo
)

val signingCredentials: SigningCredentials? = signingKeyId?.let { keyId ->
    signingKey?.let { key ->
        signingPassword?.let { password ->
            SigningCredentials(keyId, key, password)
        }
    }
}

val publishingCredentials: PublishingCredentials? = sonatypeUsername?.let { username ->
    sonatypePassword?.let { password ->
        PublishingCredentials(username, password)
    }
}

val publishRepository: String = when (publishType) {
    PublishType.RELEASE -> releaseRepo ?: ""
    PublishType.SNAPSHOT -> snapshotRepo ?: ""
    else -> ""
}

val pomScmInfo: PomScmInfo? = pomScmConnection?.let { connection ->
    pomScmDeveloperConnection?.let { developerConnection ->
        pomScmUrl?.let { url ->
            PomScmInfo(connection, developerConnection, url)
        }
    }
}

val pomLicenseInfo: PomLicenseInfo? = pomLicenseName?.let { name ->
    pomLicenseUrl?.let { url ->
        pomLicenseDistribution?.let { distribution ->
            PomLicenseInfo(name, url, distribution)
        }
    }
}

val pomDeveloperInfo: PomDeveloperInfo? = pomDeveloperId?.let { id ->
    pomDeveloperName?.let { name ->
        pomDeveloperEmail?.let { email ->
            pomDeveloperUrl?.let { url ->
                PomDeveloperInfo(id, name, email, url)
            }
        }
    }
}

val pomInfo: PomInfo? = pomUrl?.let { url ->
    pomScmInfo?.let { scmInfo ->
        pomLicenseInfo?.let { licenseInfo ->
            pomDeveloperInfo?.let { developerInfo ->
                PomInfo(url, scmInfo, licenseInfo, developerInfo)
            }
        }
    }
}

fun throwMissingPropertyException(vararg properties: String) {
    val missingProperties = when (properties.size) {
        1 -> "property '${properties[0]}'"
        else -> {
            val allButLast = properties.dropLast(1).joinToString(", ") { "'$it'" }
            "properties $allButLast and '${properties.last()}'"
        }
    }

    throw GradleException("Missing required $missingProperties for '$publishType' publishing")
}

if (publishType != PublishType.LOCAL && signingCredentials == null) {
    throwMissingPropertyException("signingKeyId", "signingKey", "signingPassword")
}

if (publishType != PublishType.LOCAL && publishingCredentials == null) {
    throwMissingPropertyException("sonatypeUsername", "sonatypePassword")
}

if (publishType == PublishType.RELEASE && releaseRepo == null) {
    throwMissingPropertyException("releaseRepo")
}

if (publishType == PublishType.SNAPSHOT && snapshotRepo == null) {
    throwMissingPropertyException("snapshotRepo")
}

if (publishType != PublishType.LOCAL && pomScmInfo == null) {
    throwMissingPropertyException("pomScmConnection", "pomScmDeveloperConnection", "pomScmUrl")
}

if (publishType != PublishType.LOCAL && pomLicenseInfo == null) {
    throwMissingPropertyException("pomLicenseName", "pomLicenseUrl", "pomLicenseDistribution")
}

if (publishType != PublishType.LOCAL && pomLicenseInfo == null) {
    throwMissingPropertyException("pomDeveloperId", "pomDeveloperName", "pomDeveloperEmail", "pomDeveloperUrl")
}

if (publishType != PublishType.LOCAL && pomInfo == null) {
    throwMissingPropertyException("pomUrl")
}

defaultTasks = mutableListOf("publish")

group = lwjglGroup
version = when (publishType) {
    PublishType.RELEASE -> lwjglVersion
    PublishType.SNAPSHOT -> "$lwjglVersion-SNAPSHOT"
    PublishType.LOCAL -> "$lwjglVersion-SNAPSHOT"
}

publishing {
    repositories {
        if (publishType != PublishType.LOCAL) {
            maven {
                url = uri(publishRepository)

                if (publishingCredentials != null) {
                    credentials {
                        username = publishingCredentials.username
                        password = publishingCredentials.password
                    }
                }
            }
        } else {
            mavenLocal()
        }
    }
}

signing {
    setRequired({
        signingCredentials != null
    })
    if (signingCredentials != null) {
        useInMemoryPgpKeys(
            signingCredentials.keyId,
            signingCredentials.key,
            signingCredentials.password
        )
    }
    sign(publishing.publications)
}

lwjglPublication.isLocal = publishType == PublishType.LOCAL

lwjglPublication {
    if (pomInfo != null) {
        pom {
            url.set(pomInfo.url)

            scm {
                connection.set(pomInfo.scm.connection)
                developerConnection.set(pomInfo.scm.developerConnection)
                url.set(pomInfo.scm.url)
            }

            licenses {
                license {
                    name.set(pomInfo.license.name)
                    url.set(pomInfo.license.url)
                    distribution.set(pomInfo.license.distribution)
                }
            }

            developers {
                developer {
                    id.set(pomInfo.developer.id)
                    name.set(pomInfo.developer.name)
                    email.set(pomInfo.developer.email)
                    url.set(pomInfo.developer.url)
                }
            }
        }
    }
}