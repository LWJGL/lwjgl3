/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.generator

import java.io.*

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