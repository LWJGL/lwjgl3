/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.gradle.plugin.publication

import org.gradle.api.*
import org.gradle.api.publish.*
import org.gradle.api.publish.maven.*
import org.gradle.api.publish.maven.plugins.*
import org.gradle.kotlin.dsl.*
import org.lwjgl.gradle.utils.*

class LwjglPublication internal constructor() {
    internal var title: String = ""
    internal var description: String = ""

    fun title(title: String) {
        this.title = title
    }

    fun description(description: String) {
        this.description = description
    }
}

open class LwjglPublicationExtension(
    private val project: Project
) {
    var isLocal: Boolean = false
    var isEnabled: Boolean = true

    private val pomActions = mutableListOf<Action<MavenPom>>()

    private val publicationList = mutableListOf<MavenPublication>()
    private val actions = mutableListOf<Action<MavenPublication>>()

    fun create(action: Action<LwjglPublication>) {
        if (!isEnabled) {
            return
        }

        val publication = LwjglPublication()

        action.execute(publication)

        project.extensions.configure<PublishingExtension> {
            publications {
                create<MavenPublication>(project.name.toPascalCase()) {
                    artifactId = project.name

                    pom {
                        name.set(publication.title)
                        description.set(publication.description)

                        pomActions.forEach { action ->
                            action.execute(this)
                        }
                    }

                    publicationList.add(this)
                    actions.forEach { action ->
                        action.execute(this)
                    }
                }
            }
        }
    }

    fun pom(action: Action<MavenPom>) {
        pomActions.add(action)
    }

    fun all(action: Action<MavenPublication>) {
        actions.add(action)
        publicationList.forEach { publication ->
            action.execute(publication)
        }
    }
}

class LwjglPublicationPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.pluginManager.apply(MavenPublishPlugin::class.java)
        project.extensions.create(
            LwjglPublicationExtension::class.java,
            "lwjglPublication",
            LwjglPublicationExtension::class.java,
            project
        )
    }
}