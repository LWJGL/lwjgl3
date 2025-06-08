/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.generator

import java.io.*

enum class Module(
    val key: String,
    val packageName: String,
    packageInfo: String,
    internal val callingConvention: CallingConvention = CallingConvention.DEFAULT,
    internal val library: JNILibrary? = null,
    internal val arrayOverloads: Boolean = true
) {
    CORE("core", "org.lwjgl.system", ""),
    CORE_JNI(
        "core.jni",
        "org.lwjgl.system.jni",
        "Contains bindings to the Java Native Interface (JNI)."
    ),
    CORE_LIBC(
        "core.libc",
        "org.lwjgl.system.libc",
        "Contains bindings to standard C library APIs."
    ),
    CORE_LIBFFI(
        "core.libffi",
        "org.lwjgl.system.libffi",
        """
        Contains bindings to the ${url("https://sourceware.org/libffi/", "libffi")}, a portable, high level programming interface to various calling
        conventions. This allows a programmer to call any function specified by a call interface description at run-time.
        """
    ),
    CORE_LINUX(
        "core.linux",
        "org.lwjgl.system.linux",
        "Contains bindings to native APIs specific to the Linux operating system."
    ),
    CORE_FREEBSD(
        "core.freebsd",
        "org.lwjgl.system.freebsd",
        "Contains bindings to native APIs specific to the FreeBSD operating system."
    ),
    CORE_LINUX_LIBURING(
        "core.linux.liburing",
        "org.lwjgl.system.linux.liburing",
        "Contains bindings to liburing.", // TODO:
        arrayOverloads = false
    ),
    CORE_MACOS(
        "core.macos",
        "org.lwjgl.system.macosx",
        "Contains bindings to native APIs specific to the macOS operating system."
    ),
    CORE_WINDOWS(
        "core.windows",
        "org.lwjgl.system.windows",
        "Contains bindings to native APIs specific to the Windows operating system.",
        CallingConvention.STDCALL
    ),

    ASSIMP(
        "assimp",
        "org.lwjgl.assimp",
        """
        Contains bindings to the ${url("https://www.assimp.org/", "Assimp")} library, a library to import and export various 3d-model-formats including
        scene-post-processing to generate missing render data.

        Assimp aims to provide a full asset conversion pipeline for use in game engines / realtime rendering systems of any kind, but it is not limited to this
        purpose. In the past, it has been used in a wide range of applications.

        Written in C++, it is available under a liberal BSD license. Assimp loads all input model formats into one straightforward data structure for further
        processing. This feature set is augmented by various post processing tools, including frequently-needed operations such as computing normal and tangent
        vectors.

        <h3>Resources</h3>
        ${ul(
            url("https://assimp-docs.readthedocs.io/en/latest/", "Documentation"),
            url("https://github.com/assimp/assimp", "Source Repository")
        )}
        """
    ),
    BGFX(
        "bgfx",
        "org.lwjgl.bgfx",
        """
        Contains bindings to the ${url("https://bkaradzic.github.io/bgfx/", "bgfx")} library.

        Starting with LWJGL 3.2.1, builds of the bgfx tools are available for download via the LWJGL site's <a href="https://www.lwjgl.org/browse">file
        browser</a>. These tools are:
        ${ul(
            "Geometry Compiler (geometryc)",
            "Shader Compiler (shaderc)",
            "Texture Compiler (texturec)",
            "Texture Viewer (texturev)"
        )}
        The binaries are built from source, at the corresponding commit that was used to build the bgfx library. For example, the latest Windows x64 version of
        shaderc can be found under {@code nightly/windows/x64/bgfx-tools/}.

        <h3>Resources</h3>
        ${ul(
            url("https://bkaradzic.github.io/bgfx/bgfx.html", "Documentation"),
            url("https://github.com/bkaradzic/bgfx", "Source Repository")
        )}
        """
    ),
    EGL(
        "egl",
        "org.lwjgl.egl",
        """
        Contains bindings to the ${url("https://www.khronos.org/egl", "EGL")} API, an interface between Khronos rendering APIs such as OpenGL ES or OpenVG and
        the underlying native platform window system. It handles graphics context management, surface/buffer binding and rendering synchronization and enables
        high-performance, accelerated, mixed-mode 2D and 3D rendering using other Khronos APIs.

        <h3>Resources</h3>
        ${ul(
            url("https://registry.khronos.org/EGL/sdk/docs/man/", "Reference Pages"),
            url("https://registry.khronos.org/EGL/", "EGL Registry"),
            url("https://github.com/KhronosGroup/EGL-Registry", "Source Repository")
        )}
        """,
        CallingConvention.STDCALL
    ),
    FMOD(
        "fmod",
        "org.lwjgl.fmod",
        """
        Contains bindings to the ${url("https://www.fmod.com", "FMOD")}, an end-to-end solution for adding sound and music to any game.

        The FMOD license does not permit redistribution, so LWJGL does not include the FMOD native libraries. They must be downloaded and deployed separately.
        The {@code SharedLibraryLoader} enables many options and it can be as simple as putting the libraries on the classpath. LWJGL by default will look for
        these shared libraries:
        ${ul(
            "fmod",
            "fmodstudio",
            "fsbank"
        )}

        but these can be overridden with an absolute/relative path or simple name, using the corresponding {@link org.lwjgl.system.Configuration Configuration}
        options. For example, setting {@link org.lwjgl.system.Configuration\#FMOD_LIBRARY_NAME FMOD_LIBRARY_NAME} to "fmodL" will load the logging version of
        the FMOD core library.
        """,
        CallingConvention.STDCALL,
        arrayOverloads = false
    ),
    FREETYPE(
        "freetype",
        "org.lwjgl.util.freetype",
        """
        Contains bindings to the ${url("https://freetype.org/", "FreeType")}, a freely available software library to render fonts.

        It is written in C, designed to be small, efficient, highly customizable, and portable while capable of producing high-quality output (glyph images) of
        most vector and bitmap font formats.

        <h3>Resources</h3>
        ${ul(
            url("https://freetype.org/freetype2/docs/documentation.html", "Documentation"),
            url("https://github.com/freetype/freetype", "Source Repository")
        )}
        """,
        arrayOverloads = false
    ),
    GLFW(
        "glfw",
        "org.lwjgl.glfw",
        """
        Contains bindings to the ${url("https://www.glfw.org/", "GLFW")} library.

        GLFW comes with extensive documentation, which you can read online ${url("https://www.glfw.org/docs/latest/", "here")}. The
        ${url("https://www.glfw.org/faq.html", "Frequently Asked Questions")} are also useful.

        <h3>Using GLFW on macOS</h3> 

        On macOS the JVM must be started with the {@code -XstartOnFirstThread} argument for GLFW to work. This is necessary because most GLFW functions must be
        called on the main thread and the Cocoa API requires that thread to be the first thread in the process. GLFW windows and the GLFW event loop are
        incompatible with other window toolkits (such as AWT/Swing or JavaFX).

        Applications that cannot function with the above limitation may set {@link org.lwjgl.system.Configuration\#GLFW_LIBRARY_NAME GLFW_LIBRARY_NAME} to the
        value {@code "glfw_async"}. This will instruct LWJGL to load an alternative GLFW build that dispatches Cocoa calls to the main thread in blocking mode.
        The other window toolkit must be initialized (e.g. with AWT's {@code Toolkit.getDefaultToolkit()}) before #Init() is called.

        <h3>Resources</h3>
        ${ul(
            url("https://www.glfw.org/documentation.html", "Documentation"),
            url("https://github.com/glfw/glfw", "Source Repository")
        )}
        """
    ),
    HARFBUZZ(
        "harfbuzz",
        "org.lwjgl.util.harfbuzz",
        """
        Contains bindings to the ${url("https://harfbuzz.github.io/", "HarfBuzz")}, a text shaping library.

        Using the HarfBuzz library allows programs to convert a sequence of Unicode input into properly formatted and positioned glyph output — for any writing
        system and language.

        <h3>Resources</h3>
        ${ul(
            url("https://harfbuzz.github.io/user-manual.html", "Documentation"),
            url("https://github.com/harfbuzz/harfbuzz", "Source Repository")
        )}
        """,
        arrayOverloads = false
    ),
    HWLOC(
        "hwloc",
        "org.lwjgl.util.hwloc",
        """
        Contains bindings to the ${url("https://www.open-mpi.org/projects/hwloc/", "hwloc")}, a portable abstraction (across OS, versions, architectures, ...)
        of the hierarchical topology of modern architectures, including NUMA memory nodes, sockets, shared caches, cores and simultaneous multithreading.

        It also gathers various system attributes such as cache and memory information as well as the locality of I/O devices such as network interfaces,
        InfiniBand HCAs or GPUs.

        hwloc primarily aims at helping applications with gathering information about increasingly complex parallel computing platforms so as to exploit them
        accordingly and efficiently. For instance, two tasks that tightly cooperate should probably be placed onto cores sharing a cache. However, two
        independent memory-intensive tasks should better be spread out onto different sockets so as to maximize their memory throughput.

        hwloc may also help many applications just by providing a portable CPU and memory binding API and a reliable way to find out how many cores and/or
        hardware threads are available.

        <h3>Resources</h3>
        ${ul(
            url("https://www.open-mpi.org/projects/hwloc/doc/", "Documentation"),
            url("https://github.com/open-mpi/hwloc", "Source Repository")
        )}
        """,
        arrayOverloads = false
    ),
    JAWT(
        "jawt",
        "org.lwjgl.system.jawt",
        "Contains bindings to the AWT native interface (jawt.h).",
        CallingConvention.STDCALL
    ),
    JEMALLOC(
        "jemalloc",
        "org.lwjgl.system.jemalloc",
        """
        Contains bindings to the ${url("https://jemalloc.net/", "jemalloc")} library. jemalloc is a general purpose malloc implementation that emphasizes
        fragmentation avoidance and scalable concurrency support.

        The jemalloc shared library that comes with LWJGL is configured with:
        ${ul(
            "--with-jemalloc-prefix=je_",
            "--enable-lazy-lock=no (FreeBSD)",
            "--disable-stats",
            "--disable-fill",
            "--disable-cxx",
            "--disable-initial-exec-tls (FreeBSD, Linux &amp; macOS)",
            "--disable-zone-allocator (macOS)"
        )}

        The shared library may be replaced with a custom build that has more features enabled.

        Dynamic configuration (for enabled features) is also possible, using either the {@code MALLOC_CONF} environment variable or the
        ${url("https://jemalloc.net/jemalloc.3.html\\#mallctl_namespace", "MALLCTL NAMESPACE")} and the {@code mallctl*} functions.

        <h3>Resources</h3>
        ${ul(
            url("https://jemalloc.net/jemalloc.3.html", "Documentation"),
            url("https://github.com/jemalloc/jemalloc", "Source Repository")
        )}
        """
    ),
    KTX(
        "ktx",
        "org.lwjgl.util.ktx",
        """
        Contains bindings to the ${url("https://www.khronos.org/ktx/", "KTX (Khronos Texture)")}, a lightweight container for textures for OpenGL®, Vulkan® and
        other GPU APIs.

        The LWJGL bindings support the KTX encoding functionality, but its presence is optional. Applications may choose to deploy the read-only version of the
        KTX library ({@code ktx_read}) and the bindings will work. The {@link org.lwjgl.system.Configuration\#KTX_LIBRARY_NAME KTX_LIBRARY_NAME} option can be
        used to change the loaded library.

        <h3>Resources</h3>
        ${ul(
            url("https://github.com/KhronosGroup/3D-Formats-Guidelines/blob/main/KTXDeveloperGuide.md", "Developer Guide"),
            url("https://registry.khronos.org/KTX/specs/2.0/ktxspec.v2.html", "Specification"),
            url("https://github.com/KhronosGroup/KTX-Software", "Source Repository")
        )}
        """,
        CallingConvention.STDCALL,
        arrayOverloads = false
    ),
    LLVM(
        "llvm",
        "org.lwjgl.llvm",
        """
        Contains bindings to <a href="https://llvm.org/">LLVM</a>, a collection of modular and reusable compiler and toolchain technologies.

        <h3>BINDINGS ONLY</h3>

        LWJGL does not currently include pre-built LLVM/Clang binaries. The user must download or build LLVM separately and use
        {@link org.lwjgl.system.Configuration Configuration} to point LWJGL to the appropriate binaries.

        <h3>Resources</h3>
        ${ul(
            url("https://llvm.org/docs/", "Documentation"),
            url("https://github.com/llvm/llvm-project", "Source Repository")
        )}
        """,
        library = JNILibrary.create("LibLLVM"),
        arrayOverloads = false
    ),
    LMDB(
        "lmdb",
        "org.lwjgl.util.lmdb",
        """
        Bindings to ${url("https://symas.com/lmdb/", "LMDB")}, the Symas Lightning Memory-Mapped Database.

        LMDB is a Btree-based database management library modeled loosely on the BerkeleyDB API, but much simplified. The entire database is exposed in a
        memory map, and all data fetches return data directly from the mapped memory, so no malloc's or memcpy's occur during data fetches. As such, the
        library is extremely simple because it requires no page caching layer of its own, and it is extremely high performance and memory-efficient. It is also
        fully transactional with full ACID semantics, and when the memory map is read-only, the database integrity cannot be corrupted by stray pointer writes
        from application code.

        <h3>Resources</h3>
        ${ul(
            url("http://www.lmdb.tech/doc/", "Documentation"),
            url("https://github.com/LMDB/lmdb", "Source Repository")
        )}
        """,
        library = JNILibrary.create("LibLMDB", setupAllocator = true)
    ),
    LZ4(
        "lz4",
        "org.lwjgl.util.lz4",
        """
        Contains bindings to ${url("https://lz4.org/", "LZ4")}, a lossless compression algorithm, providing compression speed &gt; 500 MB/s per core,
        scalable with multi-cores CPU. It features an extremely fast decoder, with speed in multiple GB/s per core, typically reaching RAM speed limits on
        multi-core systems.

        <h3>Resources</h3>
        ${ul(
            url("https://github.com/lz4/lz4", "Source Repository")
        )}
        """,
        library = JNILibrary.create("LibLZ4", setupAllocator = true),
        arrayOverloads = false
    ),
    MESHOPTIMIZER(
        "meshoptimizer",
        "org.lwjgl.util.meshoptimizer",
        "Contains bindings to ${url("https://github.com/zeux/meshoptimizer", "meshoptimizer")}, a library that provides algorithms to help optimize meshes.",
        library = JNILibrary.create("LibMeshOptimizer"),
        arrayOverloads = false
    ),
    MSDFGEN(
        "msdfgen",
        "org.lwjgl.util.msdfgen",
        "Contains bindings to ${url("https://github.com/Chlumsky/msdfgen", "msdfgen")}, a multi-channel signed distance field generator library.",
        library = JNILibrary.create("LibMsdfGen"),
        arrayOverloads = false
    ),
    NANOVG(
        "nanovg",
        "org.lwjgl.nanovg",
        """
        Contains bindings to ${url("https://github.com/memononen/nanovg", "NanoVG")}, a small antialiased vector graphics rendering library for OpenGL. It has
        lean API modeled after HTML5 canvas API. It is aimed to be a practical and fun toolset for building scalable user interfaces and visualizations.
        """,
        library = JNILibrary.create("LibNanoVG", setupAllocator = true)
    ),
    NFD(
        "nfd",
        "org.lwjgl.util.nfd",
        """
        Contains bindings to ${url("https://github.com/btzy/nativefiledialog-extended", "Native File Dialog Extended")}, a small C library that portably
        invokes native file open, folder select and file save dialogs. Write dialog code once and have it pop up native dialogs on all supported platforms.
        """,
        library = JNILibrary.create(
            "LibNFD",
            libraryName = "(Platform.get() == Platform.FREEBSD || Platform.get() == Platform.LINUX) && Configuration.NFD_LINUX_PORTAL.get(false) ? \"lwjgl_nfd_portal\" : \"lwjgl_nfd\"",
            setupAllocator = true
        )
    ),
    NUKLEAR(
        "nuklear",
        "org.lwjgl.nuklear",
        """
        Bindings to the ${url("https://immediate-mode-ui.github.io/Nuklear/", "Nuklear")} library.

        A minimal state immediate mode graphical user interface single header toolkit written in ANSI C and licensed under public domain. It was designed as a
        simple embeddable user interface for application and does not have any dependencies, a default renderbackend or OS window and input handling but
        instead provides a very modular library approach by using simple input state for input and draw commands describing primitive shapes as output. So
        instead of providing a layered library that tries to abstract over a number of platform and render backends it only focuses on the actual UI.

        <h3>Resources</h3>
        ${ul(
            url("https://github.com/Immediate-Mode-UI/Nuklear", "Source Repository")
        )}
        """,
        library = JNILibrary.simple()
    ),
    ODBC(
        "odbc",
        "org.lwjgl.odbc",
        """
        Contains bindings to ${url("https://learn.microsoft.com/en-us/sql/odbc/microsoft-open-database-connectivity-odbc", "ODBC")}.

        The Microsoft Open Database Connectivity (ODBC) interface is a C programming language interface that makes it possible for applications to access data
        from a variety of database management systems (DBMSs). ODBC is a low-level, high-performance interface that is designed specifically for relational
        data stores.

        The ODBC interface allows maximum interoperability — an application can access data in diverse DBMSs through a single interface. Moreover, that
        application will be independent of any DBMS from which it accesses data. Users of the application can add software components called drivers, which
        interface between an application and a specific DBMS.

        <h3>Resources</h3>
        ${ul(
            url("https://learn.microsoft.com/en-us/sql/odbc/reference/odbc-programmer-s-reference", "Documentation")
        )}
        """,
        CallingConvention.STDCALL,
        arrayOverloads = false
    ),
    OPENAL(
        "openal",
        "org.lwjgl.openal",
        """
        Contains bindings to the ${url("https://www.openal.org/", "OpenAL")} cross-platform 3D audio API.

        LWJGL comes with a software OpenAL implementation, ${url("https://www.openal-soft.org/", "OpenAL Soft")}.

        OpenAL Soft can be dynamically configured with ${url("https://github.com/kcat/openal-soft/blob/master/docs/env-vars.txt", "environment variables")}. A
        very useful option for debugging is {@code ALSOFT_LOGLEVEL}; it can be set to values 0 through 4, with higher values producing more information.

        In addition to standard OpenAL features, OpenAL Soft supports ${url("https://en.wikipedia.org/wiki/Head-related_transfer_function", "HRTF")},
        ${url("https://en.wikipedia.org/wiki/Ambisonics", "Ambisonics")} and ${url("https://www.codemasters.com/research/3D_sound_for_3D_games.pdf", "3D7.1")}.
        Documentation for these features is available in the OpenAL Soft ${url("https://github.com/kcat/openal-soft/tree/master/docs", "repository")}.

        <h3>Resources</h3>
        ${ul(
            url("https://www.openal.org/documentation/openal-1.1-specification.pdf", "Documentation"),
            url("https://www.openal.org/documentation/OpenAL_Programmers_Guide.pdf", "Programmer's Guide"),
            url("https://github.com/kcat/openal-soft", "Source Repository")
        )}
        """
    ),
    OPENCL(
        "opencl",
        "org.lwjgl.opencl",
        """
        Contains bindings to the ${url("https://www.khronos.org/opencl/", "OpenCL")} cross-platform parallel programming API.

        <h3>Resources</h3>
        ${ul(
            url("https://registry.khronos.org/OpenCL/sdk/3.0/docs/man/html/", "Reference Pages"),
            url("https://registry.khronos.org/OpenCL/", "OpenCL Registry"),
            url("https://github.com/KhronosGroup/OpenCL-Registry", "Source Repository"),
            url("https://github.com/KhronosGroup/OpenCL-Headers", "Source Repository (headers)")
        )}
        """,
        CallingConvention.STDCALL
    ),
    OPENGL(
        "opengl",
        "org.lwjgl.opengl",
        """
        Contains bindings to the ${url("https://www.opengl.org/", "OpenGL")} cross-platform 2D and 3D rendering API.

        The ${url("https://www.khronos.org/registry/OpenGL/index_gl.php", "OpenGL registry")} is a useful online resource that contains the OpenGL and OpenGL
        Shading Language specifications, as well as specifications of OpenGL extensions.
        The ${url("https://www.khronos.org/registry/OpenGL-Refpages/", "OpenGL Reference Pages")} is another convenient source of documentation.

        The bindings of the core OpenGL functionality are contained in two distinct class hierarchies:
        ${ul(
            "{@code GL11..GL46}: all symbols of the Compatibility Profile are included",
            "{@code GL11C..GL46C}: only symbols of the Core Profile are included"
        )}

        Each of the above classes extends the class of the previous OpenGL version in the corresponding hierarchy.

        The recommended way to write OpenGL applications with LWJGL is to statically import the class that corresponds to the minimum required OpenGL version.
        This will expose all symbols up to that version. Additional functionality (later core versions or extensions) should be guarded with appropriate checks
        using the {@link org.lwjgl.opengl.GLCapabilities GLCapabilities} instance of the OpenGL context.

        The Compatibility Profile and Core Profile class hierarchies should not be mixed with static imports, as that would result in compilation ambiguities
        when resolving the symbols. Note that the Compatibility Profile hierarchy can be used with a Core Profile context (as long as no deprecated symbol is
        used) and the Core Profile hierarchy can be used with a Compatibility Profile context. The recommendation is to use the Compatibility Profile hierarchy
        only when deprecated functionality is required. In any other case, the Core Profile hierarchy should be preferred.

        For example, an OpenGL application that requires OpenGL 3.3, must use modern OpenGL features only and needs the best possible performance:
        ${ul(
            "Should create a 3.3 Compatibility Profile context. A Core Profile context would have extra validation overhead.",
            "Should use the Core Profile hierarchy to avoid deprecated symbols. Auto-complete lists in an IDE will also be cleaner."
        )}

        <h3>Resources</h3>
        ${ul(
            url("https://docs.gl/", "Reference Pages (docs.gl)"),
            url("https://registry.khronos.org/OpenGL-Refpages/gl4/", "Reference Pages (Khronos)"),
            url("https://registry.khronos.org/OpenGL/index_gl.php", "OpenGL Registry"),
            url("https://github.com/KhronosGroup/OpenGL-Registry", "Source Repository")
        )}
        """,
        CallingConvention.STDCALL,
        library = JNILibrary.create("GL", custom = true)
    ),
    OPENGLES(
        "opengles",
        "org.lwjgl.opengles",
        """
        Contains bindings to the ${url("https://www.khronos.org/opengles/", "OpenGL ES")}, a royalty-free, cross-platform API for full-function 2D and 3D
        graphics on embedded systems - including consoles, phones, appliances and vehicles. It consists of well-defined subsets of desktop OpenGL, creating a
        flexible and powerful low-level interface between software and graphics acceleration.

        <h3>Resources</h3>
        ${ul(
            url("https://docs.gl/", "Reference Pages (docs.gl)"),
            url("https://registry.khronos.org/OpenGL-Refpages/es3/", "Reference Pages (Khronos)"),
            url("https://registry.khronos.org/OpenGL/index_es.php", "OpenGL ES Registry"),
            url("https://github.com/KhronosGroup/OpenGL-Registry", "Source Repository")
        )}
        """,
        CallingConvention.STDCALL,
        library = JNILibrary.create("GLES", custom = true)
    ),
    OPENXR(
        "openxr",
        "org.lwjgl.openxr",
        """
        Contains bindings to ${url("https://www.khronos.org/openxr/", "OpenXR")}.

        OpenXR is a royalty-free, open standard that provides high-performance access to Augmented Reality (AR) and Virtual Reality (VR)—collectively known as
        XR—platforms and devices.

        <h3>Resources</h3>
        ${ul(
            url("https://registry.khronos.org/OpenXR/specs/1.1/man/html/openxr.html", "Reference Pages"),
            url("https://registry.khronos.org/OpenXR/", "OpenXR Registry"),
            url("https://github.com/KhronosGroup/OpenXR-SDK", "Source Repository (loader)"),
        )}
        """,
        CallingConvention.STDCALL,
        arrayOverloads = false
    ),
    OPUS(
        "opus",
        "org.lwjgl.util.opus",
        """
        Contains bindings to the ${url("https://opus-codec.org", "Opus Audio Codec")} library.

        <h3>Resources</h3>
        ${ul(
            url("https://opus-codec.org/docs/", "Documentation"),
            url("https://github.com/xiph/opus", "Source Repository")
        )}
        """,
        arrayOverloads = false
    ),
    PAR(
        "par",
        "org.lwjgl.util.par",
        "Contains bindings to the ${url("https://github.com/prideout/par", "par")} library.",
        library = JNILibrary.create("LibPar", setupAllocator = true)
    ),
    REMOTERY(
        "remotery",
        "org.lwjgl.util.remotery",
        """
        Contains bindings to ${url("https://github.com/Celtoys/Remotery", "Remotery")}, a realtime CPU/GPU profiler hosted in a single C file with a viewer
        that runs in a web browser.
        ${{
            val COMMIT = "c3e8a2f38603c054be479bcefeaa54ad455dd4b9"
            """
        <b>LWJGL</b>: The current version of the Remotery bindings is compatible with commit
        <a href="https://github.com/Celtoys/Remotery/tree/$COMMIT/vis">${COMMIT.substring(0, 7)}</a>. Run the following commands to clone the
        Remotery repository at that commit:
        ${codeBlock("""
git clone --depth=1 https://github.com/Celtoys/Remotery.git
cd Remotery
git fetch --depth=1 origin $COMMIT
git branch --no-track lwjgl $COMMIT
git checkout lwjgl
git branch -D @{-1}""")}"""}()}

        Now open {@code vis/index.html} in your favorite browser to view the profiler.
        """,
        library = JNILibrary.create("LibRemotery"),
        arrayOverloads = false
    ),
    RPMALLOC(
        "rpmalloc",
        "org.lwjgl.system.rpmalloc",
        """
        Contains bindings to the ${url("https://github.com/mjansson/rpmalloc", "rpmalloc")} library. rpmalloc is a public domain cross platform lock free
        thread caching 16-byte aligned memory allocator implemented in C.
        """,
        library = JNILibrary.create("LibRPmalloc"),
        arrayOverloads = false
    ),
    SDL(
        "sdl",
        "org.lwjgl.sdl",
        """
        Contains bindings to the ${url("https://www.libsdl.org/", "Simple DirectMedia Layer")}, a cross-platform development library designed to provide low
        level access to audio, keyboard, mouse, joystick, and graphics hardware via OpenGL/Direct3D/Metal/Vulkan. It is used by video playback software,
        emulators, and popular games.

        <h3>Resources</h3>
        ${ul(
            url("https://wiki.libsdl.org/SDL3/FrontPage", "Documentation"),
            url("https://github.com/libsdl-org/SDL", "Source Repository")
        )}

        <h3>SDL header to Java class mapping</h3>
        <table>
        ${mapOf(
            "SDL_asyncio.h" to "SDLAsyncIO",
            "SDL_audio.h" to "SDLAudio",
            "SDL_blendmode.h" to "SDLBlendMode",
            "SDL_camera.h" to "SDLCamera",
            "SDL_clipboard.h" to "SDLClipboard",
            "SDL_cpuinfo.h" to "SDLCPUInfo",
            "SDL_dialog.h" to "SDLDialog",
            "SDL_error.h" to "SDLError",
            "SDL_events.h" to "SDLEvents",
            "SDL_filesystem.h" to "SDLFileSystem",
            "SDL_gamepad.h" to "SDLGamepad",
            "SDL_gpu.h" to "SDLGPU",
            "SDL_guid.h" to "SDLGUID",
            "SDL_haptic.h" to "SDLHaptic",
            "SDL_hidapi.h" to "SDLHIDAPI",
            "SDL_hints.h" to "SDLHints",
            "SDL_init.h" to "SDLInit",
            "SDL_iostream.h" to "SDLIOStream",
            "SDL_joystick.h" to "SDLJoystick",
            "SDL_keyboard.h" to "SDLKeyboard",
            "SDL_keycode.h" to "SDLKeycode",
            "SDL_loadso.h" to "SDLLoadSO",
            "SDL_locale.h" to "SDLLocale",
            "SDL_log.h" to "SDLLog",
            "SDL_messagebox.h" to "SDLMessageBox",
            "SDL_metal.h" to "SDLMetal",
            "SDL_misc.h" to "SDLMisc",
            "SDL_mouse.h" to "SDLMouse",
            "SDL_pen.h" to "SDLPen",
            "SDL_pixels.h" to "SDLPixels",
            "SDL_platform.h" to "SDLPlatform",
            "SDL_power.h" to "SDLPower",
            "SDL_properties.h" to "SDLProperties",
            "SDL_rect.h" to "SDLRect",
            "SDL_render.h" to "SDLRender",
            "SDL_scancode.h" to "SDLScancode",
            "SDL_sensor.h" to "SDLSensor",
            "SDL_stdinc.h" to "SDLStdinc",
            "SDL_storage.h" to "SDLStorage",
            "SDL_surface.h" to "SDLSurface",
            "SDL_system.h" to "SDLSystem",
            "SDL_thread.h" to "SDLThread",
            "SDL_time.h" to "SDLTime",
            "SDL_timer.h" to "SDLTimer",
            "SDL_touch.h" to "SDLTouch",
            "SDL_tray.h" to "SDLTray",
            "SDL_version.h" to "SDLVersion",
            "SDL_video.h" to "SDLVideo",
            "SDL_vulkan.h" to "SDLVulkan"
        )
            .map { (header, java) -> "<tr><td>{@code $header}</td><td>{@link org.lwjgl.sdl.$java $java}</td></tr>" }
            .joinToString(separator = "\n")
        }
        </table>
        """,
        arrayOverloads = false
    ),
    SHADERC(
        "shaderc",
        "org.lwjgl.util.shaderc",
        """
        Contains bindings to ${url("https://github.com/google/shaderc", "Shaderc")}, a collection of libraries for shader compilation.

        Shaderc wraps around core functionality in ${url("https://github.com/KhronosGroup/glslang", "glslang")} and ${url(
            "https://github.com/KhronosGroup/SPIRV-Tools",
            "SPIRV-Tools"
        )}. Shaderc aims to to provide:

        ${ul(
            "a command line compiler with GCC- and Clang-like usage, for better integration with build systems",
            "an API where functionality can be added without breaking existing clients",
            "an API supporting standard concurrency patterns across multiple operating systems",
            "increased functionality such as file \\#include support"
        )}
        """,
        arrayOverloads = false
    ),
    SPNG(
        "spng",
        "org.lwjgl.util.spng",
        """
        Contains bindings to ${url("https://libspng.org/", "libspbg")} (simple png), a C library for reading and writing Portable Network Graphics (PNG) format
        files with a focus on security and easy of use.

        <h3>Resources</h3>
        ${ul(
            url("https://libspng.org/docs/", "Documentation"),
            url("https://github.com/randy408/libspng/", "Source Repository"),
        )}
        """,
        library = JNILibrary.create("LibSPNG", setupAllocator = true),
        arrayOverloads = false
    ),
    SPVC(
        "spvc",
        "org.lwjgl.util.spvc",
        """
        Contains bindings to ${url("https://github.com/KhronosGroup/SPIRV-Cross", "SPIRV-Cross")}, a library for performing reflection on SPIR-V and
        disassembling SPIR-V back to high level languages.
        """,
        arrayOverloads = false
    ),
    STB(
        "stb",
        "org.lwjgl.stb",
        """
        Contains bindings to ${url("https://github.com/nothings/stb", "stb")}, a set of single-file public domain libraries.

        The functionality provided by stb includes:
        ${ul(
            "Parsing TrueType files, extract glyph metrics and rendering packed font textures.",
            "Easy rendering of bitmap fonts.",
            "Reading/writing image files and resizing images (e.g. for gamma-correct MIP map creation).",
            "Decoding Ogg Vorbis audio files.",
            "Compressing DXT textures at runtime.",
            "Packing rectangular textures into texture atlases.",
            "Computing Perlin noise."
        )}
        """,
        library = JNILibrary.create("LibSTB", setupAllocator = true)
    ),
    TINYEXR(
        "tinyexr",
        "org.lwjgl.util.tinyexr",
        """
        Contains bindings to the ${url("https://github.com/syoyo/tinyexr", "Tiny OpenEXR")} image library.

        tinyexr is a small, single header-only library to load and save OpenEXR(.exr) images.
        """,
        library = JNILibrary.create("LibTinyEXR", setupAllocator = true, cpp = true),
        arrayOverloads = false
    ),
    TINYFD(
        "tinyfd",
        "org.lwjgl.util.tinyfd",
        "Contains bindings to ${url("https://sourceforge.net/projects/tinyfiledialogs/", "tiny file dialogs")}.",
        library = JNILibrary.simple(
            """Library.loadSystem(System::load, System::loadLibrary, TinyFileDialogs.class, "org.lwjgl.tinyfd", Platform.mapLibraryNameBundled("lwjgl_tinyfd"));
        if (Platform.get() == Platform.WINDOWS) {
            tinyfd_setGlobalInt("tinyfd_winUtf8", 1);
        }"""
        )
    ),
    VMA(
        "vma",
        "org.lwjgl.util.vma",
        """
        Contains bindings to ${url("https://gpuopen.com/vulkan-memory-allocator/", "VMA")}, a simple and easy to integrate API to help you allocate memory for
        Vulkan® buffer and image storage.

        <h3>Resources</h3>
        ${ul(
            url("https://gpuopen-librariesandsdks.github.io/VulkanMemoryAllocator/html/", "Documentation"),
            url("https://github.com/GPUOpen-LibrariesAndSDKs/VulkanMemoryAllocator", "Source Repository"),
        )}
        """,
        library = JNILibrary.create("LibVma", setupAllocator = true, cpp = true),
        arrayOverloads = false
    ),
    VULKAN(
        "vulkan",
        "org.lwjgl.vulkan",
        """
        Contains bindings to ${url("https://www.vulkan.org/", "Vulkan")}, a new generation graphics and compute API that provides high-efficiency,
        cross-platform access to modern GPUs used in a wide variety of devices from PCs and consoles to mobile phones and embedded platforms.

        Experimental extensions (KHX, NVX, etc) is not supported API. When such an extension is promoted to stable, the corresponding experimental bindings
        will be removed.

        <b>macOS</b>: LWJGL bundles ${url("https://moltengl.com/moltenvk/", "MoltenVK")}, which emulates Vulkan over Metal.

        <h3>Resources</h3>
        ${ul(
            url("https://docs.vulkan.org/", "Documentation (Khronos)"),
            url("https://vkdoc.net/", "Documentation (VulkanHub"),
            url("https://vulkan.lunarg.com/", "Vulkan SDK"),
            url("https://github.com/KhronosGroup/Vulkan-Docs", "Source Repository"),
            url("https://github.com/KhronosGroup/Vulkan-Headers", "Source Repository (headers)")
        )}
        """,
        CallingConvention.STDCALL
    ),
    XXHASH(
        "xxhash",
        "org.lwjgl.util.xxhash",
        """
        Contains bindings to ${url("https://xxhash.com/", "xxHash")}, an extremely fast non-cryptographic hash algorithm.

        xxHash successfully completes the ${url("https://github.com/aappleby/smhasher", "SMHasher")} test suite which evaluates collision, dispersion and
        randomness qualities of hash functions.

        <h3>Resources</h3>
        ${ul(
            url("https://xxhash.com/doc/v0.8.2/index.html/", "Documentation"),
            url("https://github.com/Cyan4973/xxHash", "Source Repository"),
        )}
        """,
        library = JNILibrary.create("LibXXHash", setupAllocator = true)
    ),
    YOGA(
        "yoga",
        "org.lwjgl.util.yoga",
        """
        Contains bindings to ${url("https://www.yogalayout.dev/", "Yoga")}.

        Yoga is a cross-platform layout engine enabling maximum collaboration within your team by implementing an API familiar to many designers and opening it
        up to developers across different platforms.
        ${ul(
            "Do you already know Flexbox? Then you already know Yoga.",
            "Write code in a language familiar to you - Java, C#, Objective-C, C.",
            "C under the hood so your code moves fast.",
            "Battle tested in popular frameworks like React Native."
        )}

        <h3>LWJGL implementation</h3>

        Unlike the official Yoga Java bindings, the LWJGL bindings directly expose the native C API. {@code YGNodeRef} handles do not need to be wrapped in
        Java instances, so there is no memory overhead.

        <h3>Resources</h3>
        ${ul(
            url("https://www.yogalayout.dev/docs/about-yoga", "Documentation"),
            url("https://github.com/facebook/yoga", "Source Repository")
        )}
        """,
        library = JNILibrary.create("LibYoga"),
        arrayOverloads = false
    ),
    ZSTD(
        "zstd",
        "org.lwjgl.util.zstd",
        """
        Contains bindings to ${url("https://facebook.github.io/zstd/", "Zstandard")} (zstd), a fast lossless compression algorithm, targeting real-time
        compression scenarios at zlib-level and better compression ratios.

        Zstandard is a real-time compression algorithm, providing high compression ratios. It offers a very wide range of compression / speed trade-off, while
        being backed by a very fast decoder. It also offers a special mode for small data, called dictionary compression, and can create dictionaries from any
        sample set.

        <h3>Resources</h3>
        ${ul(
            url("https://raw.githack.com/facebook/zstd/release/doc/zstd_manual.html", "Documentation"),
            url("https://github.com/facebook/zstd", "Source Repository")
        )}
        """,
        library = JNILibrary.create("LibZstd", setupAllocator = true),
        arrayOverloads = false
    );

    companion object {
        internal val CHECKS = !System.getProperty("binding.DISABLE_CHECKS", "false")!!.toBoolean()
    }

    init {
        if (packageInfo.isNotEmpty()) {
            packageInfo(this, packageInfo)
        }

        if (library != null && enabled) {
            library.configure(this)
        }
    }

    val enabled
        get() = key.startsWith("core") || System.getProperty("binding.$key", "false")!!.toBoolean()

    val path = if (name.startsWith("CORE_")) "core" else name.lowercase()
    val java = if (name.startsWith("CORE_")) "org.lwjgl" else "org.lwjgl.${name.lowercase()}"

    internal val packageKotlin
        get() = name.let {
            if (it.startsWith("CORE_")) {
                this.key
            } else {
                it.lowercase()
            }
        }

    @Suppress("LeakingThis")
    private val CALLBACK_RECEIVER = ANONYMOUS.nativeClass(this)

    fun callback(init: NativeClass.() -> FunctionType) = CALLBACK_RECEIVER.init()
}

internal interface JNILibrary {
    companion object {
        fun simple(expression: String? = null): JNILibrary = JNILibrarySimple(expression)
        fun create(
            className: String,
            libraryName: String? = null,
            custom: Boolean = false,
            setupAllocator: Boolean = false,
            cpp: Boolean = false
        ): JNILibrary =
            JNILibraryWithInit(className, libraryName, custom, setupAllocator, cpp)
    }

    fun expression(module: Module): String
    fun configure(module: Module)
}

private class JNILibrarySimple(private val expression: String?) : JNILibrary {
    override fun expression(module: Module) = if (expression != null)
        expression
    else
        "lwjgl_${module.key}"
    override fun configure(module: Module) = Unit
}

private class JNILibraryWithInit constructor(
    private val className: String,
    private val libraryName: String?,
    private val custom: Boolean,
    private val setupAllocator: Boolean,
    private val cpp: Boolean
) : JNILibrary {

    override fun expression(module: Module) = "$className.initialize();"
    override fun configure(module: Module) {
        if (custom) {
            return
        }

        Generator.register(object : GeneratorTargetNative(module, className) {
            init {
                this.access = Access.INTERNAL
                this.cpp = this@JNILibraryWithInit.cpp
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
                println("Initializes the ${module.key} shared library.".toJavaDoc(indentation = ""))
                println(
                    """${access.modifier}final class $className {

    static {
        String libName = Platform.mapLibraryNameBundled(${libraryName ?: "\"lwjgl_${module.key}\""});
        Library.loadSystem(System::load, System::loadLibrary, $className.class, "${module.java}", libName);${if (setupAllocator) """

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
