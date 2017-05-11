/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.generator

import java.io.*
import java.lang.Math.*
import java.lang.reflect.*
import java.nio.*
import java.nio.file.*
import java.nio.file.attribute.*
import java.util.concurrent.*
import java.util.concurrent.atomic.*
import java.util.function.*

/*
    A template will be generated in the following cases:

    - The target Java source does not exist.
    - The source template has a later timestamp than the target.
    - Any file in the source package has later timestamp than the target.
    - Any file in the generator itself has later timestamp than the target. (implies re-generation of all templates)

    Example template: /src/main/kotlin/org/lwjgl/opengl/templates/ARB_imaging.kt

    - Generator source      -> /src/main/kotlin/org/lwjgl/generator/
    - Source package        -> /src/main/kotlin/org/lwjgl/opengl/
    - Source template       -> /src/main/kotlin/org/lwjgl/opengl/templates/ARB_imaging.kt

    - Target source (Java)  -> modules/core/src/generated/java/org/lwjgl/opengl/ARBImaging.java
    - Target source (C)     -> modules/core/src/generated/c/opengl/org_lwjgl_opengl_ARBImaging.c
*/

enum class Binding(
    val key: String,
    val packageName: String,
    val arrayOverloads: Boolean = true
) {
    ASSIMP("binding.assimp", "org.lwjgl.assimp"),
    BGFX("binding.bgfx", "org.lwjgl.bgfx"),
    EGL("binding.egl", "org.lwjgl.egl"),
    GLFW("binding.glfw", "org.lwjgl.glfw"),
    JAWT("binding.jawt", "org.lwjgl.system.jawt"),
    JEMALLOC("binding.jemalloc", "org.lwjgl.system.jemalloc"),
    LMDB("binding.lmdb", "org.lwjgl.util.lmdb"),
    NANOVG("binding.nanovg", "org.lwjgl.nanovg"),
    NFD("binding.nfd", "org.lwjgl.util.nfd"),
    NUKLEAR("binding.nuklear", "org.lwjgl.nuklear"),
    OPENAL("binding.openal", "org.lwjgl.openal"),
    OPENCL("binding.opencl", "org.lwjgl.opencl"),
    OPENGL("binding.opengl", "org.lwjgl.opengl"),
    OPENGLES("binding.opengles", "org.lwjgl.opengles"),
    OPENVR("binding.openvr", "org.lwjgl.openvr", arrayOverloads = false),
    OVR("binding.ovr", "org.lwjgl.ovr"),
    PAR("binding.par", "org.lwjgl.util.par"),
    SSE("binding.sse", "org.lwjgl.util.simd"),
    STB("binding.stb", "org.lwjgl.stb"),
    TINYEXR("binding.tinyexr", "org.lwjgl.util.tinyexr", arrayOverloads = false),
    TINYFD("binding.tinyfd", "org.lwjgl.util.tinyfd"),
    VULKAN("binding.vulkan", "org.lwjgl.vulkan"),
    XXHASH("binding.xxhash", "org.lwjgl.util.xxhash"),
    YOGA("binding.yoga", "org.lwjgl.util.yoga", arrayOverloads = false);

    companion object {
        val CHECKS = !System.getProperty("binding.DISABLE_CHECKS", "false").toBoolean()

        private val PACKAGES = enumValues<Binding>().associateBy { it.packageName }

        fun isEnabled(packageName: String) = Binding.PACKAGES[packageName]?.enabled ?: true
    }

    val enabled
        get() = System.getProperty(key, "false").toBoolean()
}

fun String.dependsOn(vararg bindings: Binding): String? = if (bindings.any { it.enabled }) this else null

fun main(args: Array<String>) {
    if (args.size < 2)
        throw IllegalArgumentException("The code Generator requires 2 paths as arguments: a) the template source path and b) the generation target path")

    val validateDirectory = { name: String, path: String ->
        if (!Files.isDirectory(Paths.get(path)))
            throw IllegalArgumentException("Invalid $name path: $path")
    }

    validateDirectory("template source", args[0])
    validateDirectory("generation target", args[1])

    generate(args[0], args[1]) {
        // We discover templates reflectively.
        // For a package passed to the generate function, we  search for <package>.templates.* class files and run any public static methods that return
        // NativeClass objects.

        // Note: For a Kotlin package X.Y.Z, <Z>Package is the class Kotlin generates that contains all top-level functions/properties in that package.
        // Example: org.lwjgl.opengl -> org.lwjgl.opengl.OpenglPackage (the first letter is capitalized)

        val pool = ForkJoinPool.commonPool()

        // Generate bindings

        val bindingsSystem = arrayOf(
            "org.lwjgl.system",
            "org.lwjgl.system.dyncall",
            "org.lwjgl.system.jemalloc",
            "org.lwjgl.system.jni",
            "org.lwjgl.system.libc",
            "org.lwjgl.system.linux",
            "org.lwjgl.system.macosx",
            "org.lwjgl.system.windows"
        )
        val bindingsModular = Binding.values().asSequence()

        try {
            val errors = AtomicInteger()

            CountDownLatch(bindingsSystem.size + bindingsModular.count()).let { latch ->
                fun generate(packageName: String, binding: Binding? = null) {
                    pool.submit {
                        try {
                            this.generate(packageName, binding)
                        } catch(t: Throwable) {
                            errors.incrementAndGet()
                            t.printStackTrace()
                        }
                        latch.countDown()
                    }
                }

                bindingsSystem.forEach { generate(it) }
                bindingsModular.forEach { generate(it.packageName, it) }

                latch.await()
            }

            if (errors.get() != 0)
                throw RuntimeException("Generation failed")

            // Generate utility classes. These are auto-registered during the process above.

            CountDownLatch(4).let { latch ->
                fun submit(work: () -> Unit) {
                    pool.submit {
                        try {
                            work()
                        } catch(t: Throwable) {
                            errors.incrementAndGet()
                            t.printStackTrace()
                        }
                        latch.countDown()
                    }
                }

                submit { generate("struct", Generator.structs) }
                submit { generate("callback", Generator.callbacks) }
                submit { generate("custom class", Generator.customClasses) }

                submit { generate(JNI) }

                latch.await()
            }

            if (errors.get() != 0)
                throw RuntimeException("Generation failed")
        } finally {
            pool.shutdown()
        }
    }
}

private fun generate(
    srcPath: String,
    trgPath: String,
    generate: Generator.() -> Unit
) {
    Generator(srcPath, trgPath).generate()
}

class Generator(
    val srcPath: String,
    val trgPath: String
) {

    companion object {
        // package -> #name -> class#prefix_name
        internal val tokens = ConcurrentHashMap<String, MutableMap<String, String>>()
        // package -> #name() -> class#prefix_name()
        internal val functions = ConcurrentHashMap<String, MutableMap<String, String>>()

        internal val structs = ConcurrentLinkedQueue<Struct>()
        internal val callbacks = ConcurrentLinkedQueue<CallbackFunction>()
        internal val customClasses = ConcurrentLinkedQueue<GeneratorTarget>()

        /** Registers a struct definition. */
        fun register(struct: Struct): Struct {
            if (Binding.isEnabled(struct.packageName))
                structs.add(struct)
            return struct
        }

        /** Registers a callback function. */
        fun register(callback: CallbackFunction) {
            if (Binding.isEnabled(callback.packageName))
                callbacks.add(callback)
        }

        /** Registers a custom class. */
        fun <T : GeneratorTarget> register(customClass: T): T {
            if (Binding.isEnabled(customClass.packageName))
                customClasses.add(customClass)
            return customClass
        }

        fun registerLibraryInit(packageName: String, className: String, libraryName: String, setupAllocator: Boolean = false) {
            if (!Binding.isEnabled(packageName))
                return

            Generator.register(object : GeneratorTargetNative(packageName, className) {
                init {
                    access = Access.INTERNAL
                    documentation = "Initializes the $libraryName shared library."
                    javaImport("org.lwjgl.system.*")
                    if (setupAllocator)
                        javaImport("static org.lwjgl.system.MemoryUtil.*")
                    nativeDirective("""#define LWJGL_MALLOC_LIB $nativeFileNameJNI
#include "lwjgl_malloc.h"""")
                }

                override fun PrintWriter.generateJava() {
                    generateJavaPreamble()
                    println(
                        """${access.modifier}final class $className {

    static {
        String libName = Platform.mapLibraryNameBundled("lwjgl_$libraryName");
        Library.loadSystem(System::load, System::loadLibrary, $className.class, libName);${if (setupAllocator) """

        MemoryAllocator allocator = getAllocator();
        setupMalloc(
            allocator.getMalloc(),
            allocator.getCalloc(),
            allocator.getRealloc(),
            allocator.getFree(),
            allocator.getAlignedAlloc(),
            allocator.getAlignedFree()
        );""" else ""}
    }

    private $className() {
    }

    static void initialize() {
        // intentionally empty to trigger static initializer
    }${if (setupAllocator) """

    private static native void setupMalloc(
        long malloc,
        long calloc,
        long realloc,
        long free,
        long aligned_alloc,
        long aligned_free
    );""" else ""}

}""")
                }

                override val skipNative
                    get() = !setupAllocator

                override fun PrintWriter.generateNative() {
                    generateNativePreamble()
                }
            })
        }
    }

    private val GENERATOR_LAST_MODIFIED = sequenceOf(
        Paths.get("modules/generator/src/main/kotlin").lastModified(),
        Paths.get("config/build-bindings.xml").lastModified
    ).fold(0L, ::max)

    private fun methodFilter(method: Method, javaClass: Class<*>) =
        // static
        method.modifiers and Modifier.STATIC != 0 &&
        // returns NativeClass
        method.returnType === javaClass &&
        // has no arguments
        method.parameterTypes.isEmpty()

    private fun apply(packagePath: String, packageName: String, consume: Sequence<Method>.() -> Unit) {
        val packageDirectory = Paths.get(packagePath)
        if (!Files.isDirectory(packageDirectory))
            throw IllegalStateException()

        Files.list(packageDirectory)
            .filter { KOTLIN_PATH_MATCHER.matches(it) }
            .sorted()
            .also {
                it.forEach {
                    try {
                        Class
                            .forName("$packageName.${it.fileName.toString().substringBeforeLast('.').upperCaseFirst}Kt")
                            .methods
                            .asSequence()
                            .consume()
                    } catch (e: ClassNotFoundException) {
                        // ignore
                    }
                }
                it.close()
            }
    }

    internal fun generate(packageName: String, binding: Binding? = null) {
        val packagePath = "$srcPath/${packageName.replace('.', '/')}"

        val packageLastModified = Paths.get(packagePath).lastModified(maxDepth = 1)
        packageLastModifiedMap[packageName] = packageLastModified

        if (binding?.enabled == false)
            return

        // Find and run configuration methods
        //runConfiguration(packagePath, packageName)
        apply(packagePath, packageName) {
            this
                .filter { methodFilter(it, Void.TYPE) }
                .forEach { it.invoke(null) }
        }

        // Find the template methods
        val templates = java.util.TreeSet<Method> { o1, o2 -> o1.name.compareTo(o2.name) }
        apply("$packagePath/templates", "$packageName.templates") {
            this.filterTo(templates) {
                methodFilter(it, NativeClass::class.java)
            }
        }
        if (templates.isEmpty()) {
            println("*WARNING* No templates found in $packageName.templates package.")
            return
        }

        // Get classes with bodies and register tokens/functions
        val packageTokens = LinkedHashMap<String, String>()
        val packageFunctions = LinkedHashMap<String, String>()

        val duplicateTokens = HashSet<String>()
        val duplicateFunctions = HashSet<String>()

        val classes = ArrayList<NativeClass>()
        for (template in templates) {
            val nativeClass = template.invoke(null) as NativeClass? ?: continue

            if (nativeClass.packageName != packageName)
                throw IllegalStateException("NativeClass ${nativeClass.className} has invalid package [${nativeClass.packageName}]. Should be: [$packageName]")

            if (nativeClass.hasBody) {
                classes.add(nativeClass)

                // Register tokens/functions for javadoc link references
                nativeClass.registerLinks(
                    packageTokens,
                    duplicateTokens,
                    packageFunctions,
                    duplicateFunctions
                )
            }
        }

        packageTokens.keys.removeAll(duplicateTokens)
        packageFunctions.keys.removeAll(duplicateFunctions)

        tokens.put(packageName, packageTokens)
        functions.put(packageName, packageFunctions)

        // Generate the template code
        classes.forEach {
            it.registerFunctions(binding?.arrayOverloads ?: true)
            generate(it, max(packageLastModified, GENERATOR_LAST_MODIFIED))
        }
    }

    private fun generate(nativeClass: NativeClass, packageLastModified: Long) {
        val packagePath = nativeClass.packageName.replace('.', '/')

        val outputJava = Paths.get("$trgPath/java/$packagePath/${nativeClass.className}.java")

        val lmt = max(nativeClass.getLastModified("$srcPath/$packagePath/templates"), packageLastModified)
        if (lmt < outputJava.lastModified) {
            //println("SKIPPED: ${nativeClass.packageName}.${nativeClass.className}")
            return
        }

        //println("GENERATING: ${nativeClass.packageName}.${nativeClass.className}")

        generateOutput(nativeClass, outputJava, lmt) {
            it.generateJava()
        }

        if (!nativeClass.skipNative) {
            generateNative(nativeClass) {
                generateOutput(nativeClass, it) {
                    it.generateNative()
                }
            }
        } else
            nativeClass.nativeDirectivesWarning()
    }

    internal fun <T : GeneratorTarget> generate(typeName: String, targets: Iterable<T>) {
        targets.forEach {
            try {
                generate(it)
            } catch (e: Exception) {
                throw RuntimeException("Uncaught exception while generating $typeName: ${it.packageName}.${it.className}", e)
            }
        }
    }

    internal fun generate(target: GeneratorTarget) {
        val packagePath = target.packageName.replace('.', '/')

        val outputJava = Paths.get("$trgPath/java/$packagePath/${target.className}.java")

        val lmt = if (target.sourceFile == null) null else max(
            target.getLastModified("$srcPath/$packagePath"),
            max(packageLastModifiedMap[target.packageName]!!, GENERATOR_LAST_MODIFIED)
        )

        if (lmt != null && lmt < outputJava.lastModified) {
            //println("SKIPPED: ${target.packageName}.${target.className}")
            return
        }

        //println("GENERATING: ${target.packageName}.${target.className}")

        generateOutput(target, outputJava, lmt) {
            it.generateJava()
        }

        if (target is GeneratorTargetNative && !target.skipNative) {
            generateNative(target) {
                generateOutput(target, it) {
                    it.generateNative()
                }
            }
        }
    }

    private fun generateNative(target: GeneratorTargetNative, generate: (Path) -> Unit) {
        var subPackagePath = target.packageName.substring("org.lwjgl.".length).replace('.', '/')
        if (!target.nativeSubPath.isEmpty())
            subPackagePath = "$subPackagePath/${target.nativeSubPath}"

        generate(Paths.get("$trgPath/c/$subPackagePath/${target.nativeFileName}.c"))
    }

}

// File management

private val packageLastModifiedMap: MutableMap<String, Long> = ConcurrentHashMap()

internal val Path.lastModified get() = if (Files.isRegularFile(this))
    Files.getLastModifiedTime(this).toMillis()
else
    0L

private val KOTLIN_PATH_MATCHER = FileSystems.getDefault().getPathMatcher("glob:**/*.kt")

internal fun Path.lastModified(
    maxDepth: Int = Int.MAX_VALUE,
    glob: String? = null,
    matcher: PathMatcher = if (glob == null) KOTLIN_PATH_MATCHER else FileSystems.getDefault().getPathMatcher("glob:$glob")
): Long {
    if (!Files.isDirectory(this))
        throw IllegalStateException()

    return Files
        .find(this, maxDepth, BiPredicate { path, _ -> matcher.matches(path) })
        .mapToLong(Path::lastModified)
        .reduce(0L, Math::max)
}

private fun ensurePath(path: Path) {
    val parent = path.parent ?: throw IllegalArgumentException("The given path has no parent directory.")

    if (!Files.isDirectory(parent)) {
        println("\tMKDIR: $parent")
        Files.createDirectories(parent)
    }
}

private fun readFile(file: Path) = Files.newByteChannel(file).use {
    val bytesTotal = it.size().toInt()
    val buffer = ByteBuffer.allocateDirect(bytesTotal)

    var bytesRead = 0
    do {
        bytesRead += it.read(buffer)
    } while (bytesRead < bytesTotal)

    buffer.flip()
    buffer
}

private class LWJGLWriter(out: Writer) : PrintWriter(out) {
    override fun println() = print('\n')
}

private fun <T> generateOutput(
    target: T,
    file: Path,
    /** If not null, the file timestamp will be updated if no change occured since last generation. */
    lmt: Long? = null,
    generate: T.(PrintWriter) -> Unit
) {
    // TODO: Add error handling

    ensurePath(file)

    if (Files.isRegularFile(file)) {
        // Generate in-memory
        val baos = ByteArrayOutputStream(4 * 1024)
        LWJGLWriter(OutputStreamWriter(baos, Charsets.UTF_8)).use {
            target.generate(it)
        }

        // Compare the existing file content with the generated content.
        val before = readFile(file)
        val after = baos.toByteArray()

        fun somethingChanged(before: ByteBuffer, after: ByteArray): Boolean {
            if (before.remaining() != after.size)
                return true

            return (0..before.limit() - 1).any { before.get(it) != after[it] }
        }

        if (somethingChanged(before, after)) {
            println("\tUPDATING: $file")
            // Overwrite
            Files.newOutputStream(file).use {
                it.write(after)
            }
        } else if (lmt != null) {
            // Update the file timestamp
            Files.setLastModifiedTime(file, FileTime.fromMillis(lmt + 1))
        }
    } else {
        println("\tWRITING: $file")
        LWJGLWriter(Files.newBufferedWriter(file, Charsets.UTF_8)).use {
            target.generate(it)
        }
    }
}

/** Returns true if the array was empty. */
internal inline fun <T> Array<out T>.forEachWithMore(apply: (T, Boolean) -> Unit): Boolean {
    for (i in 0..this.lastIndex)
        apply(this[i], 0 < i)
    return this.isEmpty()
}

/** Returns true if the collection was empty. */
internal fun <T> Collection<T>.forEachWithMore(moreOverride: Boolean = false, apply: (T, Boolean) -> Unit): Boolean = this.asSequence().forEachWithMore(moreOverride, apply)

/** Returns true if the sequence was empty. */
internal fun <T> Sequence<T>.forEachWithMore(moreOverride: Boolean = false, apply: (T, Boolean) -> Unit): Boolean {
    var more = moreOverride
    for (item in this) {
        apply(item, more)
        if (!more)
            more = true
    }
    return more
}

/** Returns the string with the first letter uppercase. */
internal val String.upperCaseFirst
    get() = if (this.length <= 1)
        this.toUpperCase()
    else
        "${Character.toUpperCase(this[0])}${this.substring(1)}"
