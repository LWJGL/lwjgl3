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

    Example template: <templates>/opengl/templates/ARB_imaging.kt

    - Generator source      -> <generator>/src/main/kotlin/org/lwjgl/generator/
    - Source package        -> <templates>/opengl/
    - Source template       -> <templates>/opengl/templates/ARB_imaging.kt

    - Target source (Java)  -> <module>/src/generated/java/opengl/org/lwjgl/opengl/ARBImaging.java
    - Target source (C)     -> <module>/src/generated/c/opengl/org_lwjgl_opengl_ARBImaging.c
*/

enum class Module(
    val key: String,
    val packageName: String,
    internal val callingConvention: CallingConvention = CallingConvention.DEFAULT,
    internal val library: JNILibrary? = null,
    internal val arrayOverloads: Boolean = true
) {
    CORE("core", "org.lwjgl.system"),
    CORE_DYNCALL("core.dyncall", "org.lwjgl.system.dyncall"),
    CORE_JNI("core.jni", "org.lwjgl.system.jni"),
    CORE_LIBC("core.libc", "org.lwjgl.system.libc"),
    CORE_LINUX("core.linux", "org.lwjgl.system.linux"),
    CORE_MACOS("core.macos", "org.lwjgl.system.macosx"),
    CORE_WINDOWS("core.windows", "org.lwjgl.system.windows", CallingConvention.STDCALL),

    ASSIMP("assimp", "org.lwjgl.assimp"),
    BGFX("bgfx", "org.lwjgl.bgfx"),
    BULLET("bullet", "org.lwjgl.bullet", library = JNILibrary.create("LibBullet"), arrayOverloads = false),
    CUDA("cuda", "org.lwjgl.cuda", CallingConvention.STDCALL, arrayOverloads = false),
    EGL("egl", "org.lwjgl.egl", CallingConvention.STDCALL),
    GLFW("glfw", "org.lwjgl.glfw"),
    JAWT("jawt", "org.lwjgl.system.jawt", CallingConvention.STDCALL),
    JEMALLOC("jemalloc", "org.lwjgl.system.jemalloc"),
    LIBDIVIDE("libdivide", "org.lwjgl.util.libdivide", library = JNILibrary.simple(), arrayOverloads = false),
    LLVM("llvm", "org.lwjgl.llvm", library = JNILibrary.create("LibLLVM"), arrayOverloads = false),
    LMDB("lmdb", "org.lwjgl.util.lmdb", library = JNILibrary.create("LibLMDB", setupAllocator = true)),
    LZ4("lz4", "org.lwjgl.util.lz4", library = JNILibrary.create("LibLZ4"), arrayOverloads = false),
    MEOW("meow", "org.lwjgl.util.meow", library = JNILibrary.create("LibMeow"), arrayOverloads = false),
    NANOVG("nanovg", "org.lwjgl.nanovg", library = JNILibrary.create("LibNanoVG", setupAllocator = true)),
    NFD("nfd", "org.lwjgl.util.nfd", library = JNILibrary.create("LibNFD", setupAllocator = true)),
    NUKLEAR("nuklear", "org.lwjgl.nuklear", library = JNILibrary.simple()),
    ODBC("odbc", "org.lwjgl.odbc", CallingConvention.STDCALL, arrayOverloads = false),
    OPENAL("openal", "org.lwjgl.openal"),
    OPENCL("opencl", "org.lwjgl.opencl", CallingConvention.STDCALL),
    OPENGL("opengl", "org.lwjgl.opengl", CallingConvention.STDCALL, library = JNILibrary.create("GL", custom = true)),
    OPENGLES("opengles", "org.lwjgl.opengles", CallingConvention.STDCALL, library = JNILibrary.create("GLES", custom = true)),
    OPENVR("openvr", "org.lwjgl.openvr", CallingConvention.STDCALL, library = JNILibrary.create("OpenVR", custom = true), arrayOverloads = false),
    OPUS("opus", "org.lwjgl.util.opus", arrayOverloads = false),
    OVR("ovr", "org.lwjgl.ovr", library = JNILibrary.create("LibOVR")),
    PAR("par", "org.lwjgl.util.par", library = JNILibrary.create("LibPar", setupAllocator = true)),
    REMOTERY("remotery", "org.lwjgl.util.remotery", library = JNILibrary.create("LibRemotery"), arrayOverloads = false),
    RPMALLOC("rpmalloc", "org.lwjgl.system.rpmalloc", library = JNILibrary.create("LibRPmalloc"), arrayOverloads = false),
    SSE("sse", "org.lwjgl.util.simd", library = JNILibrary.create("LibSSE")),
    STB("stb", "org.lwjgl.stb", library = JNILibrary.create("LibSTB", setupAllocator = true)),
    TINYEXR("tinyexr", "org.lwjgl.util.tinyexr", library = JNILibrary.simple(), arrayOverloads = false),
    TINYFD("tinyfd", "org.lwjgl.util.tinyfd",library = JNILibrary.simple(
            """Library.loadSystem(System::load, System::loadLibrary, TinyFileDialogs.class, Platform.mapLibraryNameBundled("lwjgl_tinyfd"));
        tinyfd_winUtf8().put(0, 1);"""
    )),
    TOOTLE("tootle", "org.lwjgl.util.tootle", library = JNILibrary.simple(), arrayOverloads = false),
    VMA("vma", "org.lwjgl.util.vma", library = JNILibrary.create("LibVma", setupAllocator = true, cpp = true), arrayOverloads = false),
    VULKAN("vulkan", "org.lwjgl.vulkan", CallingConvention.STDCALL),
    XXHASH("xxhash", "org.lwjgl.util.xxhash", library = JNILibrary.create("LibXXHash", setupAllocator = true)),
    YOGA("yoga", "org.lwjgl.util.yoga", library = JNILibrary.simple(), arrayOverloads = false),
    ZSTD("zstd", "org.lwjgl.util.zstd", library = JNILibrary.create("LibZstd"), arrayOverloads = false);

    companion object {
        internal val CHECKS = !System.getProperty("binding.DISABLE_CHECKS", "false")!!.toBoolean()
    }

    init {
        if (library != null && enabled) {
            library.configure(this)
        }
    }

    val enabled
        get() = key.startsWith("core") || System.getProperty("binding.$key", "false")!!.toBoolean()

    internal val java
        get() = name.let {
            if (it.startsWith("CORE_")) {
                "core"
            } else {
                it.toLowerCase()
            }
        }

    internal val packageKotlin
        get() = name.let {
            if (it.startsWith("CORE_")) {
                this.key
            } else {
                it.toLowerCase()
            }
        }

    @Suppress("LeakingThis")
    private val CALLBACK_RECEIVER = ANONYMOUS.nativeClass(this)

    fun callback(init: NativeClass.() -> FunctionType) = CALLBACK_RECEIVER.init()
}

internal interface JNILibrary {
    companion object {
        fun simple(expression: String? = null): JNILibrary = JNILibrarySimple(expression)
        fun create(className: String, custom: Boolean = false, setupAllocator: Boolean = false, cpp: Boolean = false): JNILibrary =
            JNILibraryWithInit(className, custom, setupAllocator, cpp)
    }

    fun expression(module: Module): String
    fun configure(module: Module)
}

private class JNILibrarySimple(private val expression: String?): JNILibrary {
    override fun expression(module: Module) = if (expression != null)
        expression
    else
        "lwjgl_${module.key}"
    override fun configure(module: Module) = Unit
}

private class JNILibraryWithInit constructor(
    private val className: String,
    private val custom: Boolean = false,
    private val setupAllocator: Boolean = false,
    private val cpp: Boolean = false
): JNILibrary {

    override fun expression(module: Module) = "$className.initialize();"
    override fun configure(module: Module) {
        if (custom) {
            return
        }

        Generator.register(object : GeneratorTargetNative(module, className) {
            init {
                this.access = Access.INTERNAL
                this.cpp = this@JNILibraryWithInit.cpp
                this.documentation = "Initializes the ${module.key} shared library."
                javaImport("org.lwjgl.system.*")
                if (setupAllocator)
                    javaImport("static org.lwjgl.system.MemoryUtil.*")
                nativeDirective(
                    """#define LWJGL_MALLOC_LIB $nativeFileNameJNI
#include "lwjgl_malloc.h""""
                )
            }

            override fun PrintWriter.generateJava() {
                generateJavaPreamble()
                println(
                    """${access.modifier}final class $className {

    static {
        String libName = Platform.mapLibraryNameBundled("lwjgl_${module.key}");
        Library.loadSystem(System::load, System::loadLibrary, $className.class, libName);${if (setupAllocator) """

        MemoryAllocator allocator = getAllocator(Configuration.DEBUG_MEMORY_ALLOCATOR_INTERNAL.get(true));
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

}"""
                )
            }

            override val skipNative
                get() = !setupAllocator

            override fun PrintWriter.generateNative() {
                generateNativePreamble()
            }
        })
    }
}

fun String.dependsOn(vararg modules: Module): String? = if (modules.any { it.enabled }) this else null

fun main(args: Array<String>) {
    if (args.isEmpty())
        throw IllegalArgumentException("Module root path not specified")

    if (!Files.isDirectory(Paths.get(args[0]))) {
        throw IllegalArgumentException("Invalid module root path: ${args[0]}")
    }

    Generator(args[0]).apply {
        // We discover templates reflectively.
        // For a package passed to the generate function, we  search for <package>.templates.* class files and run any public static methods that return
        // NativeClass objects.

        // Note: For a Kotlin package X.Y.Z, <Z>Package is the class Kotlin generates that contains all top-level functions/properties in that package.
        // Example: org.lwjgl.opengl -> org.lwjgl.opengl.OpenglPackage (the first letter is capitalized)

        val pool = ForkJoinPool.commonPool()

        // Generate bindings
        try {
            val errors = AtomicInteger()

            Module.values().let { modules ->
                val latch = CountDownLatch(modules.size)
                modules.forEach {
                    pool.submit {
                        try {
                            this.generateModule(it)
                        } catch (t: Throwable) {
                            errors.incrementAndGet()
                            t.printStackTrace()
                        }
                        latch.countDown()
                    }
                }
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
                        } catch (t: Throwable) {
                            errors.incrementAndGet()
                            t.printStackTrace()
                        }
                        latch.countDown()
                    }
                }

                fun <T : GeneratorTarget> generateRegistered(typeName: String, targets: Iterable<T>) {
                    targets.forEach {
                        try {
                            generateSimple(it)
                        } catch (e: Exception) {
                            throw RuntimeException("Uncaught exception while generating $typeName: ${it.packageName}.${it.className}", e)
                        }
                    }
                }

                submit { generateRegistered("struct", Generator.structs) }
                submit { generateRegistered("callback", Generator.callbacks) }
                submit { generateRegistered("custom class", Generator.customClasses) }

                Generator.callbacks.forEach {
                    if (it.module.enabled)
                        JNI.register(it)
                }

                submit { generateSimple(JNI) }

                latch.await()
            }

            if (errors.get() != 0)
                throw RuntimeException("Generation failed")
        } finally {
            pool.shutdown()
        }
    }
}

class Generator(private val moduleRoot: String) {

    companion object {
        // package -> #name -> class#prefix_name
        internal val tokens = ConcurrentHashMap<Module, MutableMap<String, String>>()
        // package -> #name() -> class#prefix_name()
        internal val functions = ConcurrentHashMap<Module, MutableMap<String, String>>()

        internal val structs = ConcurrentLinkedQueue<Struct>()
        internal val callbacks = ConcurrentLinkedQueue<CallbackFunction>()
        internal val customClasses = ConcurrentLinkedQueue<GeneratorTarget>()

        /** Registers a struct definition. */
        fun register(struct: Struct): Struct {
            if (struct.module.enabled)
                structs.add(struct)
            return struct
        }

        /** Registers a callback function. */
        fun register(callback: CallbackFunction) {
            if (callback.module.enabled)
                callbacks.add(callback)
        }

        /** Registers a custom class. */
        fun <T : GeneratorTarget> register(customClass: T): T {
            if (customClass.module.enabled)
                customClasses.add(customClass)
            return customClass
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
                it.forEach { path ->
                    try {
                        Class
                            .forName("$packageName.${path.fileName.toString().substringBeforeLast('.').upperCaseFirst}Kt")
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

    internal fun generateModule(module: Module) {
        val packageKotlin = module.packageKotlin
        val pathKotlin = "$moduleRoot/${module.java}/src/templates/kotlin/${packageKotlin.replace('.', '/')}"

        val moduleLastModified = Paths.get(pathKotlin).lastModified(maxDepth = 1)
        moduleLastModifiedMap[module] = moduleLastModified

        if (!module.enabled)
            return

        // Find and run configuration methods
        //runConfiguration(packagePath, packageName)
        apply(pathKotlin, packageKotlin) {
            this
                .filter { methodFilter(it, Void.TYPE) }
                .forEach {
                    it.invoke(null)
                }
        }

        // Find the template methods
        val templates = java.util.TreeSet<Method> { o1, o2 -> o1.name.compareTo(o2.name) }
        apply("$pathKotlin/templates", "$packageKotlin.templates") {
            this.filterTo(templates) {
                methodFilter(it, NativeClass::class.java)
            }
        }
        if (templates.isEmpty()) {
            println("*WARNING* No templates found in $packageKotlin.templates package.")
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

            if (nativeClass.module !== module)
                throw IllegalStateException("NativeClass ${nativeClass.className} has invalid module [${nativeClass.module.name}]. Should be: [${module.name}]")

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

        tokens[module] = packageTokens
        functions[module] = packageFunctions

        // Generate the template code
        classes.forEach {
            it.registerFunctions(module.arrayOverloads)
            generate(pathKotlin, it, max(moduleLastModified, GENERATOR_LAST_MODIFIED))
        }
    }

    private fun generate(pathKotlin: String, nativeClass: NativeClass, moduleLastModified: Long) {
        val outputJava = Paths
            .get("$moduleRoot/${nativeClass.module.java}/src/generated/java/${nativeClass.packageName.replace('.', '/')}/${nativeClass.className}.java")

        val lmt = max(nativeClass.getLastModified("$pathKotlin/templates"), moduleLastModified)
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
                generateOutput(nativeClass, it) { out ->
                    out.generateNative()
                }
            }
        } else
            nativeClass.nativeDirectivesWarning()
    }

    internal fun generateSimple(target: GeneratorTarget) {
        val modulePath = "$moduleRoot/${target.module.java}"
        val packageKotlin = target.module.packageKotlin
        val pathKotlin = "$modulePath/src/templates/kotlin/${packageKotlin.replace('.', '/')}"

        val outputJava = Paths.get("$modulePath/src/generated/java/${target.packageName.replace('.', '/')}/${target.className}.java")

        val lmt = if (target.sourceFile == null) null else max(
            target.getLastModified(pathKotlin),
            max(moduleLastModifiedMap[target.module]!!, GENERATOR_LAST_MODIFIED)
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
                generateOutput(target, it) { out ->
                    out.generateNative()
                }
            }
        }
    }

    private fun generateNative(target: GeneratorTargetNative, generate: (Path) -> Unit) {
        val targetFile =
            "${target.nativeSubPath.let { if (it.isEmpty()) "" else "$it/" }}${target.nativeFileName}.${if (target.cpp) "cpp" else "c"}"
        generate(Paths.get("$moduleRoot/${target.module.java}/src/generated/c/$targetFile"))
    }

}

// File management

private val moduleLastModifiedMap: MutableMap<Module, Long> = ConcurrentHashMap()

internal val Path.lastModified
    get() = if (Files.isRegularFile(this))
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
        throw IllegalStateException("$this is not a directory")

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
        PrintWriter(OutputStreamWriter(baos, Charsets.UTF_8)).use {
            target.generate(it)
        }

        // Compare the existing file content with the generated content.
        val before = readFile(file)
        val after = baos.toByteArray()

        fun somethingChanged(before: ByteBuffer, after: ByteArray): Boolean {
            if (before.remaining() != after.size)
                return true

            return (0 until before.limit()).any { before.get(it) != after[it] }
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
        PrintWriter(Files.newBufferedWriter(file, Charsets.UTF_8)).use {
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
internal fun <T> Collection<T>.forEachWithMore(moreOverride: Boolean = false, apply: (T, Boolean) -> Unit): Boolean =
    this.asSequence().forEachWithMore(moreOverride, apply)

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
