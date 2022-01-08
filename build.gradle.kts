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

val lwjglVersion: String by project
val sonatypeUsername: String by project
val sonatypePassword: String by project

defaultTasks = mutableListOf("publish")
buildDir = file("bin/MAVEN")
group = "org.lwjgl"
version = lwjglVersion

enum class BuildType {
    LOCAL,
    SNAPSHOT,
    RELEASE
}

data class Deployment(
    val type: BuildType,
    val repo: URI,
    val user: String? = null,
    val password: String? = null
)

val deployment = when {
    hasProperty("release") -> Deployment(
        type = BuildType.RELEASE,
        repo = uri("https://oss.sonatype.org/service/local/staging/deploy/maven2/"),
        user = sonatypeUsername,
        password = sonatypePassword
    )
    hasProperty("snapshot") -> {
        version = "$version-SNAPSHOT"
        Deployment(
            type = BuildType.SNAPSHOT,
            repo = uri("https://oss.sonatype.org/content/repositories/snapshots/"),
            user = sonatypeUsername,
            password = sonatypePassword
        )
    }
    else -> {
        version = "$version-SNAPSHOT"
        Deployment(
            type = BuildType.LOCAL,
            repo = repositories.mavenLocal().url
        )
    }
}
println("${deployment.type.name} BUILD")

enum class Platforms(val classifier: String) {
    LINUX("linux"),
    LINUX_ARM64("linux-arm64"),
    LINUX_ARM32("linux-arm32"),
    MACOS("macos"),
    MACOS_ARM64("macos-arm64"),
    WINDOWS("windows"),
    WINDOWS_X86("windows-x86"),
    WINDOWS_ARM64("windows-arm64");

    companion object {
        val ALL = values()
    }
}

enum class Artifacts(
    val artifact: String,
    val projectName: String,
    val projectDescription: String,
    vararg val platforms: Platforms
) {
    CORE("lwjgl", "LWJGL", "The LWJGL core library.", *Platforms.ALL),
    ASSIMP(
        "lwjgl-assimp", "LWJGL - Assimp bindings",
        "A portable Open Source library to import various well-known 3D model formats in a uniform manner.",
        *Platforms.ALL
    ),
    BGFX(
        "lwjgl-bgfx", "LWJGL - bgfx bindings",
        "A cross-platform, graphics API agnostic rendering library. It provides a high performance, low level abstraction for common platform graphics APIs like OpenGL, Direct3D and Apple Metal.",
        Platforms.LINUX, Platforms.LINUX_ARM64, Platforms.LINUX_ARM32,
        Platforms.MACOS, Platforms.MACOS_ARM64,
        Platforms.WINDOWS, Platforms.WINDOWS_X86
    ),
    CUDA(
        "lwjgl-cuda", "LWJGL - CUDA bindings",
        "A parallel computing platform and programming model developed by NVIDIA for general computing on GPUs."
    ),
    EGL(
        "lwjgl-egl", "LWJGL - EGL bindings",
        "An interface between Khronos rendering APIs such as OpenGL ES or OpenVG and the underlying native platform window system."
    ),
    GLFW(
        "lwjgl-glfw", "LWJGL - GLFW bindings",
        "A multi-platform library for OpenGL, OpenGL ES and Vulkan development on the desktop. It provides a simple API for creating windows, contexts and surfaces, receiving input and events.",
        *Platforms.ALL
    ),
    JAWT(
        "lwjgl-jawt", "LWJGL - JAWT bindings",
        "The AWT native interface."
    ),
    JEMALLOC(
        "lwjgl-jemalloc", "LWJGL - jemalloc bindings",
        "A general purpose malloc implementation that emphasizes fragmentation avoidance and scalable concurrency support.",
        *Platforms.ALL
    ),
    LIBDIVIDE(
        "lwjgl-libdivide", "LWJGL - libdivide bindings",
        "A library that replaces expensive integer divides with comparatively cheap multiplication and bitshifts.",
        *Platforms.ALL
    ),
    LLVM(
        "lwjgl-llvm", "LWJGL - LLVM/Clang bindings",
        "A collection of modular and reusable compiler and toolchain technologies.",
        *Platforms.ALL
    ),
    LMDB(
        "lwjgl-lmdb", "LWJGL - LMDB bindings",
        "A compact, fast, powerful, and robust database that implements a simplified variant of the BerkeleyDB (BDB) API.",
        *Platforms.ALL
    ),
    LZ4(
        "lwjgl-lz4", "LWJGL - LZ4 bindings",
        "A lossless data compression algorithm that is focused on compression and decompression speed.",
        *Platforms.ALL
    ),
    MEOW(
        "lwjgl-meow", "LWJGL - Meow hash bindings",
        "An extremely fast non-cryptographic hash.",
        Platforms.LINUX, Platforms.LINUX_ARM64,
        Platforms.MACOS, Platforms.MACOS_ARM64,
        Platforms.WINDOWS, Platforms.WINDOWS_X86, Platforms.WINDOWS_ARM64
    ),
    MESHOPTIMIZER(
        "lwjgl-meshoptimizer", "LWJGL - meshoptimizer bindings",
        "A library that provides algorithms to help optimize meshes.",
        *Platforms.ALL
    ),
    NANOVG(
        "lwjgl-nanovg", "LWJGL - NanoVG & NanoSVG bindings",
        "A small antialiased vector graphics rendering library for OpenGL. Also includes NanoSVG, a simple SVG parser.",
        *Platforms.ALL
    ),
    NFD(
        "lwjgl-nfd", "LWJGL - Native File Dialog bindings",
        "A tiny, neat C library that portably invokes native file open and save dialogs.",
        *Platforms.ALL
    ),
    NUKLEAR(
        "lwjgl-nuklear", "LWJGL - Nuklear bindings",
        "A minimal state immediate mode graphical user interface toolkit.",
        *Platforms.ALL
    ),
    ODBC(
        "lwjgl-odbc", "LWJGL - ODBC bindings",
        "A C programming language interface that makes it possible for applications to access data from a variety of database management systems (DBMSs)."
    ),
    OPENAL(
        "lwjgl-openal", "LWJGL - OpenAL bindings",
        "A cross-platform 3D audio API appropriate for use with gaming applications and many other types of audio applications.",
        *Platforms.ALL
    ),
    OPENCL(
        "lwjgl-opencl", "LWJGL - OpenCL bindings",
        "An open, royalty-free standard for cross-platform, parallel programming of diverse processors found in personal computers, servers, mobile devices and embedded platforms."
    ),
    OPENGL(
        "lwjgl-opengl", "LWJGL - OpenGL bindings",
        "The most widely adopted 2D and 3D graphics API in the industry, bringing thousands of applications to a wide variety of computer platforms.",
        *Platforms.ALL
    ),
    OPENGLES(
        "lwjgl-opengles", "LWJGL - OpenGL ES bindings",
        "A royalty-free, cross-platform API for full-function 2D and 3D graphics on embedded systems - including consoles, phones, appliances and vehicles.",
        *Platforms.ALL
    ),
    OPENVR(
        "lwjgl-openvr", "LWJGL - OpenVR bindings",
        "An API and runtime that allows access to VR hardware from multiple vendors without requiring that applications have specific knowledge of the hardware they are targeting.",
        Platforms.LINUX, Platforms.MACOS, Platforms.WINDOWS, Platforms.WINDOWS_X86
    ),
    OPENXR(
        "lwjgl-openxr", "LWJGL - OpenXR bindings",
        "A royalty-free, open standard that provides high-performance access to Augmented Reality (AR) and Virtual Reality (VR)—collectively known as XR—platforms and devices.",
        Platforms.LINUX, Platforms.LINUX_ARM64, Platforms.LINUX_ARM32,
        Platforms.WINDOWS, Platforms.WINDOWS_X86, Platforms.WINDOWS_ARM64
    ),
    OPUS(
        "lwjgl-opus", "LWJGL - Opus bindings",
        "A totally open, royalty-free, highly versatile audio codec.",
        *Platforms.ALL
    ),
    OVR(
        "lwjgl-ovr", "LWJGL - OVR bindings",
        "The API of the Oculus SDK.",
        Platforms.WINDOWS, Platforms.WINDOWS_X86
    ),
    PAR(
        "lwjgl-par", "LWJGL - par_shapes bindings",
        "Generate parametric surfaces and other simple shapes.",
        *Platforms.ALL
    ),
    REMOTERY(
        "lwjgl-remotery", "LWJGL - Remotery bindings",
        "A realtime CPU/GPU profiler hosted in a single C file with a viewer that runs in a web browser.",
        Platforms.LINUX, Platforms.LINUX_ARM64, Platforms.LINUX_ARM32,
        Platforms.MACOS, Platforms.MACOS_ARM64,
        Platforms.WINDOWS, Platforms.WINDOWS_X86
    ),
    RPMALLOC(
        "lwjgl-rpmalloc", "LWJGL - rpmalloc bindings",
        "A public domain cross platform lock free thread caching 16-byte aligned memory allocator implemented in C.",
        *Platforms.ALL
    ),
    SHADERC(
        "lwjgl-shaderc", "LWJGL - Shaderc bindings",
        "A collection of libraries for shader compilation.",
        *Platforms.ALL
    ),
    SPVC(
        "lwjgl-spvc", "LWJGL - SPIRV-Cross bindings",
        "A library for performing reflection on SPIR-V and disassembling SPIR-V back to high level languages.",
        *Platforms.ALL
    ),
    SSE(
        "lwjgl-sse", "LWJGL - SSE bindings",
        "Simple SSE intrinsics.",
        Platforms.LINUX, Platforms.MACOS, Platforms.WINDOWS, Platforms.WINDOWS_X86
    ),
    STB(
        "lwjgl-stb", "LWJGL - stb bindings",
        "Single-file public domain libraries for fonts, images, ogg vorbis files and more.",
        *Platforms.ALL
    ),
    TINYEXR(
        "lwjgl-tinyexr", "LWJGL - Tiny OpenEXR bindings",
        "A small library to load and save OpenEXR(.exr) images.",
        *Platforms.ALL
    ),
    TINYFD(
        "lwjgl-tinyfd", "LWJGL - Tiny File Dialogs bindings",
        "Provides basic modal dialogs.",
        *Platforms.ALL
    ),
    TOOTLE(
        "lwjgl-tootle", "LWJGL - AMD Tootle bindings",
        "A 3D triangle mesh optimization library that improves on existing mesh preprocessing techniques.",
        Platforms.LINUX, Platforms.MACOS, Platforms.WINDOWS, Platforms.WINDOWS_X86
    ),
    VMA(
        "lwjgl-vma", "LWJGL - Vulkan Memory Allocator bindings",
        "An easy to integrate Vulkan memory allocation library.",
        *Platforms.ALL
    ),
    VULKAN(
        "lwjgl-vulkan", "LWJGL - Vulkan bindings",
        "A new generation graphics and compute API that provides high-efficiency, cross-platform access to modern GPUs used in a wide variety of devices from PCs and consoles to mobile phones and embedded platforms.",
        Platforms.MACOS, Platforms.MACOS_ARM64
    ),
    XXHASH(
        "lwjgl-xxhash", "LWJGL - xxHash bindings",
        "An extremely fast hash algorithm, running at RAM speed limits.",
        *Platforms.ALL
    ),
    YOGA(
        "lwjgl-yoga", "LWJGL - Yoga bindings",
        "An open-source, cross-platform layout library that implements Flexbox.",
        *Platforms.ALL
    ),
    ZSTD(
        "lwjgl-zstd", "LWJGL - Zstandard bindings",
        "A fast lossless compression algorithm, targeting real-time compression scenarios at zlib-level and better compression ratios.",
        *Platforms.ALL
    );

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
    repositories {
        maven {
            url = deployment.repo

            if (deployment.type !== BuildType.LOCAL) {
                credentials {
                    username = deployment.user
                    password = deployment.password
                }
            }
        }
    }
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
            url.set("https://www.lwjgl.org")
            packaging = pomPackaging

            scm {
                connection.set("scm:git:https://github.com/LWJGL/lwjgl3.git")
                developerConnection.set("scm:git:https://github.com/LWJGL/lwjgl3.git")
                url.set("https://github.com/LWJGL/lwjgl3.git")
            }

            licenses {
                license {
                    name.set("BSD")
                    url.set("https://www.lwjgl.org/license")
                    distribution.set("repo")
                }
            }

            developers {
                developer {
                    id.set("spasi")
                    name.set("Ioannis Tsakpinis")
                    email.set("iotsakp@gmail.com")
                    url.set("https://github.com/Spasi")
                }
            }
        }

        Artifacts.values().forEach { module ->
            if (module.isActive) {
                create<MavenPublication>("maven${module.name}") {
                    artifactId = module.artifact
                    artifact(module.artifact())
                    if (deployment.type !== BuildType.LOCAL || module.hasArtifact("sources")) {
                        artifact(module.artifact("sources")) {
                            classifier = "sources"
                        }
                    }
                    if (deployment.type !== BuildType.LOCAL || module.hasArtifact("javadoc")) {
                        artifact(module.artifact("javadoc")) {
                            classifier = "javadoc"
                        }
                    }
                    module.platforms.forEach {
                        if (deployment.type !== BuildType.LOCAL || module.hasArtifact("natives-${it.classifier}")) {
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

signing {
    isRequired = deployment.type === BuildType.RELEASE
    sign(publishing.publications)
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