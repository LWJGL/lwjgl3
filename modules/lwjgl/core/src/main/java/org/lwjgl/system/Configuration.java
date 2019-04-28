/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import org.lwjgl.system.MemoryUtil.*;

import javax.annotation.*;
import java.io.*;
import java.util.function.*;

/**
 * This class can be used to programmatically set the LWJGL runtime configuration. It is an alternative to using system properties.
 *
 * <p>Care must be taken when setting <em>static</em> options. Such options are only read once or cached in {@code static final} fields. They must be
 * configured through this class before touching any other LWJGL class.</p>
 */
public class Configuration<T> {

    /**
     * Takes priority over {@code java.library.path}. It may contain one or more directory paths, separated by {@link File#pathSeparator}.
     *
     * <p style="font-family: monospace">
     * Property: <b>org.lwjgl.librarypath</b><br>
     * &nbsp; &nbsp;Usage: Dynamic<br>
     */
    public static final Configuration<String> LIBRARY_PATH = new Configuration<>("org.lwjgl.librarypath", StateInit.STRING);

    /**
     * Sets the mapping algorithm used to resolve the <b>name</b> of bundled shared libraries. Supported values:
     *
     * <ul>
     * <li><em>default</em> - Maps {@code <libname>} to {@code <libname>}.</li>
     * <li><em>legacy</em> - Maps {@code <libname>} to {@code is64bit(arch) ? <libname> : <libname>32}.</li>
     * <li><em>&lt;classpath&gt;</em> - A class that implements the {@link Function Function&lt;String, String&gt;} interface. It will be instantiated using reflection.</li>
     * </ul>
     *
     * <p>When set programmatically, it can also be a {@link Function Function&lt;String, String&gt;} instance.</p>
     *
     * <p style="font-family: monospace">
     * Property: <b>org.lwjgl.system.bundledLibrary.nameMapper</b><br>
     * &nbsp; &nbsp; Type: String or a {@link Function Function&lt;String, String&gt;} instance<br>
     * &nbsp; &nbsp;Usage: Static</p>
     */
    public static final Configuration<Object> BUNDLED_LIBRARY_NAME_MAPPER =
        new Configuration<>("org.lwjgl.system.bundledLibrary.nameMapper", StateInit.STRING);

    /**
     * Sets the mapping algorithm used to resolve bundled shared libraries in the <b>classpath/modulepath</b>. Supported values:
     *
     * <ul>
     * <li><em>default</em> - Maps {@code <libpath>} to {@code <arch>/<libpath>}.</li>
     * <li><em>legacy</em> - Maps {@code <libpath>} to {@code <libpath>}.</li>
     * <li><em>&lt;classpath&gt;</em> - A class that implements the {@link Function Function&lt;String, String&gt;} interface. It will be instantiated using reflection.</li>
     * </ul>
     *
     * <p>When set programmatically, it can also be a {@link Function Function&lt;String, String&gt;} instance.</p>
     *
     * <p style="font-family: monospace">
     * Property: <b>org.lwjgl.system.bundledLibrary.nameMapper</b><br>
     * &nbsp; &nbsp; Type: String or a {@link Function Function&lt;String, String&gt;} instance<br>
     * &nbsp; &nbsp;Usage: Static</p>
     */
    public static final Configuration<Object> BUNDLED_LIBRARY_PATH_MAPPER =
        new Configuration<>("org.lwjgl.system.bundledLibrary.pathMapper", StateInit.STRING);

    /**
     * Changes the temporary directory name created by LWJGL when extracting shared libraries from JAR files. If this option is not set, it defaults to
     * <code>lwjgl&lt;user name&gt;</code>.
     *
     * <p style="font-family: monospace">
     * Property: <b>org.lwjgl.system.SharedLibraryExtractDirectory</b><br>
     * &nbsp; &nbsp;Usage: Dynamic<br>
     */
    public static final Configuration<String> SHARED_LIBRARY_EXTRACT_DIRECTORY = new Configuration<>(
        "org.lwjgl.system.SharedLibraryExtractDirectory",
        StateInit.STRING
    );

    /**
     * Changes the path where LWJGL extracts shared libraries from JAR files. If this option is not set, LWJGL will try the following paths and the first
     * successful will be used:
     *
     * <ul>
     * <li>{@code System.getProperty("java.io.tmpdir")}/extractDir/version/</li>
     * <li>{@code System.getProperty("user.home")}/.extractDir/version/</li>
     * <li>.extractDir/version/</li>
     * <li>{@code Files.createTempFile("lwjgl", "")}</li>
     * </ul>
     *
     * where:
     *
     * <pre><code>
     * extractDir = Configuration.SHARED_LIBRARY_EXTRACT_DIRECTORY
     * version = Version.getVersion().replace(' ', '-')
     * </code></pre>
     *
     * <p style="font-family: monospace">
     * Property: <b>org.lwjgl.system.SharedLibraryExtractPath</b><br>
     * &nbsp; &nbsp;Usage: Dynamic</p>
     */
    public static final Configuration<String> SHARED_LIBRARY_EXTRACT_PATH = new Configuration<>(
        "org.lwjgl.system.SharedLibraryExtractPath",
        StateInit.STRING
    );

    /**
     * EXPERIMENTAL: Emulates {@link System#loadLibrary} behavior in {@link Library#loadNative(String)}.
     *
     * <p style="font-family: monospace">
     * Property: <b>org.lwjgl.system.EmulateSystemLoadLibrary</b><br>
     * &nbsp; &nbsp;Usage: Dynamic</p>
     */
    public static final Configuration<Boolean> EMULATE_SYSTEM_LOADLIBRARY = new Configuration<>(
        "org.lwjgl.system.EmulateSystemLoadLibrary",
        StateInit.BOOLEAN
    );

    /**
     * Can be used to override the LWJGL library name. It can be an absolute path.
     *
     * <p style="font-family: monospace">
     * Property: <b>org.lwjgl.libname</b><br>
     * &nbsp; &nbsp;Usage: Dynamic</p>
     */
    public static final Configuration<String> LIBRARY_NAME = new Configuration<>("org.lwjgl.libname", StateInit.STRING);

    /**
     * Sets the allocator used for the {@link MemoryUtil} explicit memory management API
     * ({@link MemoryUtil#memAlloc memAlloc}/{@link MemoryUtil#memFree memFree}/etc). Supported values:
     *
     * <ul>
     * <li><em>jemalloc</em> - The allocator provided by the jemalloc library</li>
     * <li><em>rpmalloc</em> - The allocator provided by the rpmalloc library.<br>
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><p>LWJGL calls {@code rpmalloc_initialize} once, when the allocator is
     * created. It never calls {@code rpmalloc_finalize}. The user is responsible for calling {@code rpmalloc_thread_initialize} and
     * {@code rpmalloc_thread_finalize} when appropriate.</p></div></li>
     * <li><em>system</em> - The default system memory allocator</li>
     * <li><em>&lt;classpath&gt;</em> - A class that implements the {@link MemoryAllocator MemoryAllocator} interface. It will be instantiated using reflection.</li>
     * </ul>
     *
     * <p>When set programmatically, it can also be a {@link MemoryAllocator MemoryAllocator} instance.</p>
     *
     * <p style="font-family: monospace">
     * Property: <b>org.lwjgl.system.allocator</b><br>
     * &nbsp; &nbsp; Type: String or a {@link MemoryAllocator} instance<br>
     * &nbsp; &nbsp;Usage: Static</p>
     */
    public static final Configuration<Object> MEMORY_ALLOCATOR = new Configuration<>("org.lwjgl.system.allocator", StateInit.STRING);

    /**
     * Sets the stack size, in kilobytes, that will be used in the default {@link MemoryStack} constructor. This value is also used for the LWJGL-managed,
     * thread-local, {@link MemoryStack} instances.
     *
     * <p>If this option is not set, it defaults to 64.</p>
     *
     * <p style="font-family: monospace">
     * Property: <b>org.lwjgl.system.stackSize</b><br>
     * &nbsp; &nbsp;Usage: Static</p>
     */
    public static final Configuration<Integer> STACK_SIZE = new Configuration<>("org.lwjgl.system.stackSize", StateInit.INT);

    /**
     * Sets the size of arrays cached in thread-local storage to minimize allocations while decoding text.
     *
     * <p>The memory cost for the cache is up to two arrays per thread that does text decoding. When the text length is up to this value, a cached array will
     * be used. When the text length is longer than this value, a new array buffer will be allocated.</p>
     *
     * <p>If this option is not set, it defaults to 8192. Setting the value to 0 will disable the array cache.</p>
     *
     * <p style="font-family: monospace">
     * Property: <b>org.lwjgl.system.arrayTLCSize</b><br>
     * &nbsp; &nbsp;Usage: Static</p>
     */
    public static final Configuration<Integer> ARRAY_TLC_SIZE = new Configuration<>("org.lwjgl.system.arrayTLCSize", StateInit.INT);

    /**
     * Set to true to disable LWJGL's basic checks. These are trivial checks that LWJGL performs to avoid JVM crashes, very useful during development.
     * Their performance impact is usually minimal, but they may be disabled for release builds.
     *
     * <p style="font-family: monospace">
     * Property: <b>org.lwjgl.util.NoChecks</b><br>
     * &nbsp; &nbsp;Usage: Static</p>
     */
    public static final Configuration<Boolean> DISABLE_CHECKS = new Configuration<>("org.lwjgl.util.NoChecks", StateInit.BOOLEAN);

    /**
     * Set to true to disable LWJGL's function lookup checks. These checks ensure that required functions are not missing from dynamically loaded shared
     * libraries. This setting is useful when a trusted incompatible library must be loaded.
     *
     * <p style="font-family: monospace">
     * Property: <b>org.lwjgl.util.NoFunctionChecks</b><br>
     * &nbsp; &nbsp;Usage: Dynamic</p>
     */
    public static final Configuration<Boolean> DISABLE_FUNCTION_CHECKS = new Configuration<>("org.lwjgl.util.NoFunctionChecks", StateInit.BOOLEAN);

    /**
     * Set to true to enable LWJGL's debug mode. Information messages will be printed to the {@link APIUtil#DEBUG_STREAM} and extra runtime checks will
     * be performed (some potentially expensive, performance-wise).
     *
     * <p style="font-family: monospace">
     * Property: <b>org.lwjgl.util.Debug</b><br>
     * &nbsp; &nbsp;Usage: Static</p>
     */
    public static final Configuration<Boolean> DEBUG = new Configuration<>("org.lwjgl.util.Debug", StateInit.BOOLEAN);

    /**
     * When enabled, ShaderLibraryLoader exceptions will be printed to the {@link #DEBUG_STREAM}.
     *
     * <p>This option requires {@link #DEBUG} to be enabled.</p>
     *
     * <p style="font-family: monospace">
     * Property: <b>org.lwjgl.util.DebugLoader</b><br>
     * &nbsp; &nbsp;Usage: Static</p>
     */
    public static final Configuration<Boolean> DEBUG_LOADER = new Configuration<>("org.lwjgl.util.DebugLoader", StateInit.BOOLEAN);

    /**
     * Can be set to override the default {@link APIUtil#DEBUG_STREAM}. It must be the name of a class that implements the
     * {@link Supplier Supplier&lt;PrintStream&gt;} interface. The class will be instantiated using reflection and the result of {@link Supplier#get get} will
     * become the {@code #DEBUG_STREAM} used by LWJGL.
     *
     * <p>When set programmatically, it can also be a {@link PrintStream} instance.</p>
     *
     * <p style="font-family: monospace">
     * Property: <b>org.lwjgl.util.DebugStream</b><br>
     * &nbsp; &nbsp; Type: String or a {@link PrintStream} instance<br>
     * &nbsp; &nbsp;Usage: Static</p>
     */
    public static final Configuration<Object> DEBUG_STREAM = new Configuration<>("org.lwjgl.util.DebugStream", StateInit.STRING);

    /**
     * Set to true to enable LWJGL's debug mode for the {@link MemoryUtil} explicit memory management API
     * ({@link MemoryUtil#memAlloc memAlloc}/{@link MemoryUtil#memFree memFree}/etc). All memory allocations through that API will be tracked and leaks
     * will be reported on JVM exit. The {@code memReport} methods can also be used.
     *
     * <p>When this option is enabled, a stacktrace is generated on every allocation, which may negatively impact performance. If this becomes a serious issue,
     * the JVM option {@code -XX:MaxJavaStackTraceDepth=d} (where {@code d >= 6}) can be used to reduce the overhead.</p>
     *
     * <p style="font-family: monospace">
     * Property: <b>org.lwjgl.util.DebugAllocator</b><br>
     * &nbsp; &nbsp;Usage: Static</p>
     */
    public static final Configuration<Boolean> DEBUG_MEMORY_ALLOCATOR = new Configuration<>("org.lwjgl.util.DebugAllocator", StateInit.BOOLEAN);

    /**
     * Set to false to disable tracking of internal memory allocations, in native shared libraries that have been set up to use the LWJGL memory allocator.
     *
     * <p>If this option is not set, it defaults to true.</p>
     *
     * <p style="font-family: monospace">
     * Property: <b>org.lwjgl.util.DebugAllocator.internal</b><br>
     * &nbsp; &nbsp;Usage: Static</p>
     */
    public static final Configuration<Boolean> DEBUG_MEMORY_ALLOCATOR_INTERNAL = new Configuration<>("org.lwjgl.util.DebugAllocator.internal", StateInit.BOOLEAN);

    /**
     * Set to true to enable LWJGL's debug mode for the {@link MemoryStack}. When using the stack, each frame should be popped in the same method that pushed
     * it. If this symmetry is broken, this mode will report it immediately.
     *
     * <p>When this option is enabled, a stacktrace is generated on every push or pop to the stack, which may negatively impact performance. If this becomes a
     * serious issue, the JVM option {@code -XX:MaxJavaStackTraceDepth=d} (where {@code d >= 5}) can be used to reduce the overhead.</p>
     *
     * <p style="font-family: monospace">
     * Property: <b>org.lwjgl.util.DebugStack</b><br>
     * &nbsp; &nbsp;Usage: Static</p>
     */
    public static final Configuration<Boolean> DEBUG_STACK = new Configuration<>("org.lwjgl.util.DebugStack", StateInit.BOOLEAN);

    /**
     * When enabled, capabilities classes will print an error message when they fail to retrieve a function pointer.
     *
     * <p>Function pointers in such classes are retrieved unconditionally, so this option may generate a lot of output and many false negatives.</p>
     *
     * <p>This option requires {@link #DEBUG} to be enabled.</p>
     *
     * <p style="font-family: monospace">
     * Property: <b>org.lwjgl.util.DebugFunctions</b><br>
     * &nbsp; &nbsp;Usage: Static</p>
     */
    public static final Configuration<Boolean> DEBUG_FUNCTIONS = new Configuration<>("org.lwjgl.util.DebugFunctions", StateInit.BOOLEAN);

    // -- ASSIMP

    /** Similar to {@link #LIBRARY_NAME} for the AssImp library (<b>org.lwjgl.assimp.libname</b>). */
    public static final Configuration<String> ASSIMP_LIBRARY_NAME = new Configuration<>("org.lwjgl.assimp.libname", StateInit.STRING);

    // -- BGFX

    /** Similar to {@link #LIBRARY_NAME} for the BGFX library (<b>org.lwjgl.bgfx.libname</b>). */
    public static final Configuration<String> BGFX_LIBRARY_NAME = new Configuration<>("org.lwjgl.bgfx.libname", StateInit.STRING);

    // -- CUDA

    /** Similar to {@link #LIBRARY_NAME} for the CUDA Driver library &ndash; nvcuda (<b>org.lwjgl.cuda.libname</b>). */
    public static final Configuration<String> CUDA_LIBRARY_NAME = new Configuration<>("org.lwjgl.cuda.libname", StateInit.STRING);

    /**
     * By default, when LWJGL detects multiple CUDA Toolkits, it will use the toolkit with the greatest version. This option can be used to force a specific
     * CUDA Toolkit version.
     *
     * <p style="font-family: monospace">
     * Property: <b>org.lwjgl.cuda.toolkit.version</b><br>
     * &nbsp; &nbsp;Usage: Static</p>
     */
    public static final Configuration<String> CUDA_TOOLKIT_VERSION = new Configuration<>("org.lwjgl.cuda.toolkit.version", StateInit.STRING);

    /**
     * By default, LWJGL will try to detect CUDA Toolkits in the default installation folder. This option can be used to load toolkit libraries from a
     * non-standard installation folder.
     *
     * <p style="font-family: monospace">
     * Property: <b>org.lwjgl.cuda.toolkit.path</b><br>
     * &nbsp; &nbsp;Usage: Static</p>
     */
    public static final Configuration<String> CUDA_TOOLKIT_PATH = new Configuration<>("org.lwjgl.cuda.toolkit.path", StateInit.STRING);

    /** Similar to {@link #LIBRARY_NAME} for the CUDA NVRTC library (<b>org.lwjgl.cuda.nvrtc.libname</b>). */
    public static final Configuration<String> CUDA_NVRTC_LIBRARY_NAME = new Configuration<>("org.lwjgl.cuda.nvrtc.libname", StateInit.STRING);

    /** Similar to {@link #LIBRARY_NAME} for the CUDA NVRTC Builtins library (<b>org.lwjgl.cuda.nvrtc-builtins.libname</b>). */
    public static final Configuration<String> CUDA_NVRTC_BUILTINS_LIBRARY_NAME = new Configuration<>("org.lwjgl.cuda.nvrtc-builtins.libname", StateInit.STRING);

    /**
     * By default, CUDA uses the legacy default stream. To enable per-thread synchronization, set this option to {@code true} before initializing the CUDA
     * driver.
     *
     * <p>To check if the CUDA driver supports PTDS, call {@code org.lwjgl.cuda.CUDA.isPerThreadDefaultStreamSupported()}</p>
     *
     * <p style="font-family: monospace">
     * Property: <b>org.lwjgl.cuda.ptds</b><br>
     * &nbsp; &nbsp;Usage: Static</p>
     */
    public static final Configuration<Boolean> CUDA_API_PER_THREAD_DEFAULT_STREAM = new Configuration<>("org.lwjgl.cuda.ptds", StateInit.BOOLEAN);

    // -- EGL

    /**
     * By default, LWJGL will automatically initialize the EGL library, when it is first accessed. Set this property to disable this behavior.
     *
     * <p style="font-family: monospace">
     * Property: <b>org.lwjgl.egl.explicitInit</b><br>
     * &nbsp; &nbsp;Usage: Static</p>
     */
    public static final Configuration<Boolean> EGL_EXPLICIT_INIT = new Configuration<>("org.lwjgl.egl.explicitInit", StateInit.BOOLEAN);

    /** Similar to {@link #LIBRARY_NAME} for the EGL library (<b>org.lwjgl.egl.libname</b>). */
    public static final Configuration<String> EGL_LIBRARY_NAME = new Configuration<>("org.lwjgl.egl.libname", StateInit.STRING);

    // -- GLFW

    /** Similar to {@link #LIBRARY_NAME} for the GLFW library (<b>org.lwjgl.glfw.libname</b>). */
    public static final Configuration<String> GLFW_LIBRARY_NAME = new Configuration<>("org.lwjgl.glfw.libname", StateInit.STRING);

    /**
     * By default, LWJGL will check if certain GLFW functions are called on the first thread of the process and fail if that is not the case. Set this property
     * to false to disable this behavior.
     *
     * <p style="font-family: monospace">
     * Property: <b>org.lwjgl.glfw.checkThread0</b><br>
     * &nbsp; &nbsp;Usage: Static</p>
     */
    public static final Configuration<Boolean> GLFW_CHECK_THREAD0 = new Configuration<>("org.lwjgl.glfw.checkThread0", StateInit.BOOLEAN);

    // -- JAWT

    /** Similar to {@link #LIBRARY_NAME} for the jawt library (<b>org.lwjgl.system.jawt.libname</b>). */
    public static final Configuration<String> JAWT_LIBRARY_NAME = new Configuration<>("org.lwjgl.system.jawt.libname", StateInit.STRING);

    // -- JEMALLOC

    /** Similar to {@link #LIBRARY_NAME} for the jemalloc library (<b>org.lwjgl.system.jemalloc.libname</b>). */
    public static final Configuration<String> JEMALLOC_LIBRARY_NAME = new Configuration<>("org.lwjgl.system.jemalloc.libname", StateInit.STRING);

    // -- LLVM

    /** Similar to {@link #LIBRARY_NAME} for the LLVM library (<b>org.lwjgl.llvm.libname</b>). */
    public static final Configuration<String> LLVM_LIBRARY_NAME = new Configuration<>("org.lwjgl.llvm.libname", StateInit.STRING);

    /** Similar to {@link #LIBRARY_NAME} for the LLVM/Clang Library (<b>org.lwjgl.llvm.clang.libname</b>). */
    public static final Configuration<String> LLVM_CLANG_LIBRARY_NAME = new Configuration<>("org.lwjgl.llvm.clang.libname", StateInit.STRING);

    /** Similar to {@link #LIBRARY_NAME} for the LLVM/LTO library (<b>org.lwjgl.llvm.clang.libname</b>). */
    public static final Configuration<String> LLVM_LTO_LIBRARY_NAME = new Configuration<>("org.lwjgl.llvm.lto.libname", StateInit.STRING);

    // -- ODBC

    /** Similar to {@link #LIBRARY_NAME} for the ODBC library (<b>org.lwjgl.odbc.libname</b>). */
    public static final Configuration<String> ODBC_LIBRARY_NAME = new Configuration<>("org.lwjgl.odbc.libname", StateInit.STRING);

    // -- OPENAL

    /** Similar to {@link #EGL_EXPLICIT_INIT} for the OpenAL library (<b>org.lwjgl.openal.explicitInit</b>). */
    public static final Configuration<Boolean> OPENAL_EXPLICIT_INIT = new Configuration<>("org.lwjgl.openal.explicitInit", StateInit.BOOLEAN);

    /** Similar to {@link #LIBRARY_NAME} for the OpenAL library (<b>org.lwjgl.openal.libname</b>). */
    public static final Configuration<String> OPENAL_LIBRARY_NAME = new Configuration<>("org.lwjgl.openal.libname", StateInit.STRING);

    // -- OPENCL

    /** Similar to {@link #EGL_EXPLICIT_INIT} for the OpenCL library (<b>org.lwjgl.opencl.explicitInit</b>). */
    public static final Configuration<Boolean> OPENCL_EXPLICIT_INIT = new Configuration<>("org.lwjgl.opencl.explicitInit", StateInit.BOOLEAN);

    /** Similar to {@link #LIBRARY_NAME} for the OpenCL library (<b>org.lwjgl.opencl.libname</b>). */
    public static final Configuration<String> OPENCL_LIBRARY_NAME = new Configuration<>("org.lwjgl.opencl.libname", StateInit.STRING);

    // -- OPENGL

    /** Similar to {@link #EGL_EXPLICIT_INIT} for the OpenGL library (<b>org.lwjgl.opengl.explicitInit</b>). */
    public static final Configuration<Boolean> OPENGL_EXPLICIT_INIT = new Configuration<>("org.lwjgl.opengl.explicitInit", StateInit.BOOLEAN);

    /** Similar to {@link #LIBRARY_NAME} for the OpenGL library (<b>org.lwjgl.opengl.libname</b>). */
    public static final Configuration<String> OPENGL_LIBRARY_NAME = new Configuration<>("org.lwjgl.opengl.libname", StateInit.STRING);

    /**
     * Can be used to limit the maximum available OpenGL version. This can be useful to ensure that an application has not accidentally used features only
     * available in a higher OpenGL version.
     *
     * <p>When set programmatically, it can also be an {@link APIUtil.APIVersion} instance.</p>
     *
     * <p style="font-family: monospace">
     * Property: <b>org.lwjgl.opengl.maxVersion</b><br>
     * &nbsp; &nbsp; Type: String (M.n) or an {@link APIUtil.APIVersion} instance<br>
     * &nbsp; &nbsp;Usage: Static</p>
     */
    public static final Configuration<Object> OPENGL_MAXVERSION = new Configuration<>("org.lwjgl.opengl.maxVersion", StateInit.STRING);

    // -- OPENGL ES

    /** Similar to {@link #EGL_EXPLICIT_INIT} for the OpenGL ES library (<b>org.lwjgl.opengles.explicitInit</b>). */
    public static final Configuration<Boolean> OPENGLES_EXPLICIT_INIT = new Configuration<>("org.lwjgl.opengles.explicitInit", StateInit.BOOLEAN);

    /** Similar to {@link #LIBRARY_NAME} for the OpenGL ES library (<b>org.lwjgl.opengles.libname</b>). */
    public static final Configuration<String> OPENGLES_LIBRARY_NAME = new Configuration<>("org.lwjgl.opengles.libname", StateInit.STRING);

    /** Similar to {@link #OPENGL_MAXVERSION} for the OpenGL ES library (<b>org.lwjgl.opengles.maxVersion</b>). */
    public static final Configuration<Object> OPENGLES_MAXVERSION = new Configuration<>("org.lwjgl.opengles.maxVersion", StateInit.STRING);

    // -- OPENVR

    /** Similar to {@link #LIBRARY_NAME} for the OpenVR library (<b>org.lwjgl.openvr.libname</b>). */
    public static final Configuration<String> OPENVR_LIBRARY_NAME = new Configuration<>("org.lwjgl.openvr.libname", StateInit.STRING);

    // -- OPUS

    /** Similar to {@link #LIBRARY_NAME} for the Opus library (<b>org.lwjgl.opus.libname</b>). */
    public static final Configuration<String> OPUS_LIBRARY_NAME = new Configuration<>("org.lwjgl.opus.libname", StateInit.STRING);

    // -- SHADERC

    /** Similar to {@link #LIBRARY_NAME} for the Shaderc libshaderc library (<b>org.lwjgl.shaderc.libname</b>). */
    public static final Configuration<String> SHADERC_LIBRARY_NAME = new Configuration<>("org.lwjgl.shaderc.libname", StateInit.STRING);

    /** Similar to {@link #LIBRARY_NAME} for the Shaderc libshaderc_spvc library (<b>org.lwjgl.shaderc_spvc.libname</b>). */
    public static final Configuration<String> SHADERC_SPVC_LIBRARY_NAME = new Configuration<>("org.lwjgl.shaderc.spvc.libname", StateInit.STRING);

    // -- VULKAN

    /** Similar to {@link #EGL_EXPLICIT_INIT} for the Vulkan library (<b>org.lwjgl.vulkan.explicitInit</b>). */
    public static final Configuration<Boolean> VULKAN_EXPLICIT_INIT = new Configuration<>("org.lwjgl.vulkan.explicitInit", StateInit.BOOLEAN);

    /** Similar to {@link #LIBRARY_NAME} for the Vulkan library (<b>org.lwjgl.vulkan.libname</b>). */
    public static final Configuration<String> VULKAN_LIBRARY_NAME = new Configuration<>("org.lwjgl.vulkan.libname", StateInit.STRING);

    private interface StateInit<T> extends Function<String, T> {
        StateInit<Boolean> BOOLEAN = property -> {
            String value = System.getProperty(property);
            return value == null ? null : Boolean.parseBoolean(value);
        };

        StateInit<Integer> INT = Integer::getInteger;

        StateInit<String> STRING = System::getProperty;
    }

    private final String property;

    @Nullable
    private T state;

    Configuration(String property, StateInit<? extends T> init) {
        this.property = property;
        this.state = init.apply(property);
    }

    public String getProperty() {
        return property;
    }

    /**
     * Sets the option value.
     *
     * @param value the value to set
     */
    public void set(@Nullable T value) {
        this.state = value;
    }

    /**
     * Returns the option value.
     *
     * <p>If the option value has not been set, null will be returned.</p>
     */
    @Nullable
    public T get() {
        return state;
    }

    /**
     * Returns the option value.
     *
     * <p>If the option value has not been set, the specified default value will be returned.</p>
     *
     * @param defaultValue the default value
     */
    public T get(T defaultValue) {
        T state = this.state;
        if (state == null) {
            state = defaultValue;
        }

        return state;
    }

}
