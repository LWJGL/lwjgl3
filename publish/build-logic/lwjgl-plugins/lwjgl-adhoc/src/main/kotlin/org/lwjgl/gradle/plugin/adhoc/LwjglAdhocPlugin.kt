/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.gradle.plugin.adhoc

import org.gradle.api.*
import org.gradle.api.artifacts.*
import org.gradle.api.attributes.*
import org.gradle.api.attributes.java.*
import org.gradle.api.component.*
import org.gradle.api.model.*
import org.gradle.kotlin.dsl.*
import org.gradle.nativeplatform.*
import org.lwjgl.gradle.utils.*
import java.io.*
import javax.inject.*

internal fun projectDependency(project: Project) = "${project.group}:${project.name}:${project.version}"
internal fun platformCapability(project: Project) = "${project.group}:${project.name}-platform:${project.version}"

class LwjglComponent internal constructor(
    project: Project,
    softwareComponentFactory: SoftwareComponentFactory,
    configurations: LwjglConfigurations
) {
    private val component = softwareComponentFactory.adhoc("lwjgl")

    init {
        project.components.add(component)

        addVariant(configurations.apiElementsConfig, "compile")
        addVariant(configurations.runtimeElementsConfig, "runtime")
    }

    internal fun addVariant(configuration: Configuration, mavenScope: String? = null) {
        component.addVariantsFromConfiguration(configuration) {
            if (mavenScope != null) {
                mapToMavenScope(mavenScope)
            }
        }
    }
}

internal enum class ConfigurationType {
    CONSUMABLE,
    RESOLVABLE,
    DECLARABLE
}

class LwjglConfigurations internal constructor(
    private val project: Project
) {
    private val objects: ObjectFactory = project.objects

    internal val apiConfig = createDeclarable("api")
    internal val compileOnlyApiConfig = createDeclarable("compileOnlyApi")
    internal val runtimeOnlyConfig = createDeclarable("runtimeOnly")
    internal val compileOnlyConfig = createDeclarable("compileOnly", compileOnlyApiConfig)
    internal val implementationConfig = createDeclarable("implementation", apiConfig)

    internal val apiElementsConfig = createConsumable("apiElements", Usage.JAVA_API, apiConfig, compileOnlyApiConfig)
    internal val runtimeElementsConfig = createConsumable("runtimeElements", Usage.JAVA_RUNTIME, runtimeOnlyConfig, implementationConfig)

    private fun createDeclarable(name: String, vararg configurations: Configuration): Configuration {
        return createConfiguration(name, ConfigurationType.DECLARABLE) {
            configurations.forEach { configuration ->
                extendsFrom(configuration)
            }
        }
    }

    private fun createConsumable(name: String, usage: String, vararg configurations: Configuration): Configuration {
        return createConfiguration(name, ConfigurationType.CONSUMABLE) {
            configurations.forEach { configuration ->
                extendsFrom(configuration)
            }
            attributes {
                attribute(Usage.USAGE_ATTRIBUTE, objects.named(Usage::class.java, usage))
                attribute(Category.CATEGORY_ATTRIBUTE, objects.named(Category::class.java, Category.LIBRARY))
                attribute(Bundling.BUNDLING_ATTRIBUTE, objects.named(Bundling::class.java, Bundling.EXTERNAL))
                attribute(LibraryElements.LIBRARY_ELEMENTS_ATTRIBUTE, objects.named(LibraryElements::class.java, LibraryElements.JAR))
                attribute(TargetJvmVersion.TARGET_JVM_VERSION_ATTRIBUTE, 8)
            }
        }
    }

    internal fun createPlatformApi(os: String, arch: String): Configuration {
        return createPlatform("api", os, arch, Usage.JAVA_API)
    }

    internal fun createPlatformRuntime(os: String, arch: String): Configuration {
        return createPlatform("runtime", os, arch, Usage.JAVA_RUNTIME)
    }

    private fun createPlatform(name: String, os: String, arch: String, usage: String): Configuration {
        return createConfiguration("${os.toCamelCase()}${arch.toPascalCase()}${name.toPascalCase()}Elements", ConfigurationType.CONSUMABLE) {
            attributes {
                attribute(Usage.USAGE_ATTRIBUTE, objects.named(Usage::class.java, usage))
                attribute(Category.CATEGORY_ATTRIBUTE, objects.named(Category::class.java, Category.LIBRARY))
                attribute(Bundling.BUNDLING_ATTRIBUTE, objects.named(Bundling::class.java, Bundling.EXTERNAL))
                attribute(LibraryElements.LIBRARY_ELEMENTS_ATTRIBUTE, objects.named(LibraryElements::class.java, LibraryElements.JAR))
                attribute(TargetJvmVersion.TARGET_JVM_VERSION_ATTRIBUTE, 8)
                attribute(OperatingSystemFamily.OPERATING_SYSTEM_ATTRIBUTE, objects.named(OperatingSystemFamily::class.java, os))
                attribute(MachineArchitecture.ARCHITECTURE_ATTRIBUTE, objects.named(MachineArchitecture::class.java, arch))
            }
            outgoing.capability(platformCapability(project))
        }
    }

    internal fun createDocumentionJavadoc(): Configuration {
        return createDocumention("javadocElements", DocsType.JAVADOC)
    }

    internal fun createDocumentionSources(): Configuration {
        return createDocumention("sourcesElements", DocsType.SOURCES)
    }

    private fun createDocumention(name: String, docsType: String): Configuration {
        return createConfiguration(name, ConfigurationType.CONSUMABLE) {
            attributes {
                attribute(Usage.USAGE_ATTRIBUTE, objects.named(Usage::class.java, Usage.JAVA_RUNTIME))
                attribute(Category.CATEGORY_ATTRIBUTE, objects.named(Category::class.java, Category.DOCUMENTATION))
                attribute(Bundling.BUNDLING_ATTRIBUTE, objects.named(Bundling::class.java, Bundling.EXTERNAL))
                attribute(DocsType.DOCS_TYPE_ATTRIBUTE, objects.named(DocsType::class.java, docsType))
            }
        }
    }

    private fun createConfiguration(name: String, type: ConfigurationType, action: Action<Configuration>? = null): Configuration {
        return project.configurations.create(name) {
            isCanBeConsumed = type == ConfigurationType.CONSUMABLE
            isCanBeResolved = type == ConfigurationType.RESOLVABLE
            action?.execute(this)
        }
    }
}

open class LwjglAdhocExtension(
    private val project: Project,
    private val configurations: LwjglConfigurations,
    private val component: LwjglComponent
) {
    fun main(artifact: File) {
        val configurations = listOf(
            configurations.apiElementsConfig,
            configurations.runtimeElementsConfig
        )

        configurations.forEach { configuration ->
            configuration.outgoing.artifact(artifact)
            project.dependencies {
                add(configuration.name, projectDependency(project)) {
                    capabilities {
                        requireCapability(platformCapability(project))
                    }
                }
            }
        }
    }

    fun platform(os: String, arch: String, classifier: String, artifact: File? = null) {
        val configurations = listOf(
            configurations.createPlatformApi(os, arch),
            configurations.createPlatformRuntime(os, arch)
        )

        configurations.forEach { configuration ->
            if (artifact != null) {
                configuration.outgoing.artifact(artifact) {
                    this.classifier = classifier
                }
            }
            component.addVariant(configuration)
        }
    }

    fun javadoc(artifact: File) {
        val configurations = listOf(
            configurations.createDocumentionJavadoc()
        )

        configurations.forEach { configuration ->
            configuration.outgoing.artifact(artifact) {
                this.classifier = "javadoc"
            }
            component.addVariant(configuration)
        }
    }

    fun sources(artifact: File) {
        val configurations = listOf(
            configurations.createDocumentionSources()
        )

        configurations.forEach { configuration ->
            configuration.outgoing.artifact(artifact) {
                this.classifier = "sources"
            }
            component.addVariant(configuration)
        }
    }
}

class LwjglAdhocPlugin @Inject constructor(
    private val softwareComponentFactory: SoftwareComponentFactory
) : Plugin<Project> {
    override fun apply(project: Project) {
        val lwjglConfigurations = LwjglConfigurations(project)
        val lwjglComponent = LwjglComponent(project, softwareComponentFactory, lwjglConfigurations)

        project.extensions.create(
            LwjglAdhocExtension::class.java,
            "lwjglAdhoc",
            LwjglAdhocExtension::class.java,
            project,
            lwjglConfigurations,
            lwjglComponent
        )
    }
}