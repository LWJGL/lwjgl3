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
    CORE_LINUX_LIBURING(
        "core.linux.liburing",
        "org.lwjgl.system.linux.liburing",
        "Contains bindings to liburing." // TODO:
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
        Contains bindings to the ${url("http://www.assimp.org/", "Assimp")} library, a library to import and export various 3d-model-formats including
        scene-post-processing to generate missing render data.

        Assimp aims to provide a full asset conversion pipeline for use in game engines / realtime rendering systems of any kind, but it is not limited to this
        purpose. In the past, it has been used in a wide range of applications.

        Written in C++, it is available under a liberal BSD license. Assimp loads all input model formats into one straightforward data structure for further
        processing. This feature set is augmented by various post processing tools, including frequently-needed operations such as computing normal and tangent
        vectors.
        """
    ),
    BGFX(
        "bgfx",
        "org.lwjgl.bgfx",
        """
        Contains bindings to the ${url("https://github.com/bkaradzic/bgfx", "bgfx")} library.

        The bgfx documentation can be found online ${url("https://bkaradzic.github.io/bgfx/", "here")}. The API reference is available
        ${url("https://bkaradzic.github.io/bgfx/bgfx.html", "here")}.

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
        """
    ),
    CUDA(
        "cuda",
        "org.lwjgl.cuda",
        """
        Contains bindings to <a href="https://developer.nvidia.com/cuda-zone">CUDA</a>.

        <h3>UNSTABLE API</h3>

        Until these bindings are sufficiently tested, this API should be considered unstable. Also, bindings to more (and eventually, all) CUDA Toolkit
        libraries will be added in the near future.
        """,
        CallingConvention.STDCALL,
        arrayOverloads = false
    ),
    EGL(
        "egl",
        "org.lwjgl.egl",
        """
        Contains bindings to the ${url("https://www.khronos.org/egl", "EGL")} API, an interface between Khronos rendering APIs such as OpenGL ES or OpenVG and
        the underlying native platform window system. It handles graphics context management, surface/buffer binding and rendering synchronization and enables
        high-performance, accelerated, mixed-mode 2D and 3D rendering using other Khronos APIs.

        The ${url("https://www.khronos.org/registry/EGL/", "Khronos EGL registry")} is a useful online resource that contains the EGL specification, as well
        as specifications of EGL extensions.
        """,
        CallingConvention.STDCALL
    ),
    GLFW(
        "glfw",
        "org.lwjgl.glfw",
        """
        Contains bindings to the ${url("http://www.glfw.org/", "GLFW")} library.

        GLFW comes with extensive documentation, which you can read online ${url("http://www.glfw.org/docs/latest/", "here")}. The
        ${url("http://www.glfw.org/faq.html", "Frequently Asked Questions")} are also useful.

        <h3>Using GLFW on macOS</h3> 

        On macOS the JVM must be started with the {@code -XstartOnFirstThread} argument for GLFW to work. This is necessary because most GLFW functions must be
        called on the main thread and the Cocoa API requires that thread to be the first thread in the process. GLFW windows and the GLFW event loop are
        incompatible with other window toolkits (such as AWT/Swing or JavaFX).

        Applications that cannot function with the above limitation may set {@link org.lwjgl.system.Configuration\#GLFW_LIBRARY_NAME GLFW_LIBRARY_NAME} to the
        value {@code "glfw_async"}. This will instruct LWJGL to load an alternative GLFW build that dispatches Cocoa calls to the main thread in blocking mode.
        The other window toolkit must be initialized (e.g. with AWT's {@code Toolkit.getDefaultToolkit()}) before #Init() is called.
        """
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
        Contains bindings to the ${url("http://jemalloc.net/", "jemalloc")} library. jemalloc is a general purpose malloc implementation that emphasizes
        fragmentation avoidance and scalable concurrency support.

        The jemalloc documentation can be found ${url("http://jemalloc.net/jemalloc.3.html", "here")}. The jemalloc
        ${url("https://github.com/jemalloc/jemalloc/wiki", "wiki")} also contains useful information.

        The jemalloc shared library that comes with LWJGL is configured with:
        ${ul(
            "--with-jemalloc-prefix=je_",
            "--enable-lazy-lock (Linux)",
            "--disable-stats",
            "--disable-fill",
            "--disable-cxx",
            "--disable-initial-exec-tls (Linux &amp; macOS)",
            "--disable-zone-allocator (macOS)"
        )}

        The shared library may be replaced with a custom build that has more features enabled.

        Dynamic configuration (for enabled features) is also possible, using either the {@code MALLOC_CONF} environment variable or the
        ${url("http://jemalloc.net/jemalloc.3.html\\#mallctl_namespace", "MALLCTL NAMESPACE")} and the {@code mallctl*} functions.
        """
    ),
    LIBDIVIDE(
        "libdivide",
        "org.lwjgl.util.libdivide",
        "Contains bindings to ${url("https://libdivide.com/", "libdivide")}.",
        library = JNILibrary.simple(),
        arrayOverloads = false
    ),
    LLVM(
        "llvm",
        "org.lwjgl.llvm",
        """
        Contains bindings to <a href="https://llvm.org/">LLVM</a>, a collection of modular and reusable compiler and toolchain technologies.

        <h3>UNSTABLE API</h3>

        Until these bindings are sufficiently tested, this API should be considered unstable.

        <h3>BINDINGS ONLY</h3>

        LWJGL does not currently include pre-built LLVM/Clang binaries. The user must download or build LLVM separately and use
        {@link org.lwjgl.system.Configuration Configuration} to point LWJGL to the appropriate binaries.
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

        The library is fully thread-aware and supports concurrent read/write access from multiple processes and threads. Data pages use a copy-on-write
        strategy so no active data pages are ever overwritten, which also provides resistance to corruption and eliminates the need of any special recovery
        procedures after a system crash. Writes are fully serialized; only one write transaction may be active at a time, which guarantees that writers can
        never deadlock. The database structure is multi-versioned so readers run with no locks; writers cannot block readers, and readers don't block writers.

        Unlike other well-known database mechanisms which use either write-ahead transaction logs or append-only data writes, LMDB requires no maintenance
        during operation. Both write-ahead loggers and append-only databases require periodic checkpointing and/or compaction of their log or database files
        otherwise they grow without bound. LMDB tracks free pages within the database and re-uses them for new write operations, so the database size does not
        grow without bound in normal use.

        The memory map can be used as a read-only or read-write map. It is read-only by default as this provides total immunity to corruption. Using read-write
        mode offers much higher write performance, but adds the possibility for stray application writes thru pointers to silently corrupt the database. Of
        course if your application code is known to be bug-free (...) then this is not an issue.

        <h3>Restrictions/caveats (in addition to those listed for some functions)</h3>
        ${ul(
            """
            Only the database owner should normally use the database on BSD systems or when otherwise configured with {@code MDB_USE_POSIX_SEM}. Multiple users
            can cause startup to fail later, as noted above.
            """,
            """
            There is normally no pure read-only mode, since readers need write access to locks and lock file. Exceptions: On read-only filesystems or with the
            #NOLOCK flag described under #env_open().
            """,
            """
            An LMDB configuration will often reserve considerable unused memory address space and maybe file size for future growth. This does not use actual
            memory or disk space, but users may need to understand the difference so they won't be scared off.
            """,
            """
            By default, in versions before 0.9.10, unused portions of the data file might receive garbage data from memory freed by other code. (This does not
            happen when using the #WRITEMAP flag.) As of 0.9.10 the default behavior is to initialize such memory before writing to the data file. Since there
            may be a slight performance cost due to this initialization, applications may disable it using the #NOMEMINIT flag. Applications handling sensitive
            data which must not be written should not use this flag. This flag is irrelevant when using #WRITEMAP.
            """,
            """
            A thread can only use one transaction at a time, plus any child transactions. Each transaction belongs to one thread. The #NOTLS flag changes this
            for read-only transactions.
            """,
            "Use an {@code MDB_env*} in the process which opened it, without {@code fork()}ing.",
            """
            Do not have open an LMDB database twice in the same process at the same time. Not even from a plain {@code open()} call - {@code close()}ing it
            breaks {@code flock()} advisory locking.
            """,
            """
            Avoid long-lived transactions. Read transactions prevent reuse of pages freed by newer write transactions, thus the database can grow quickly.
            Write transactions prevent other write transactions, since writes are serialized.
            """,
            """
            Avoid suspending a process with active transactions. These would then be "long-lived" as above. Also read transactions suspended when writers
            commit could sometimes see wrong data.
            """
        )}

        ...when several processes can use a database concurrently:
        ${ul(
            """
            Avoid aborting a process with an active transaction. The transaction becomes "long-lived" as above until a check for stale readers is performed or
            the lockfile is reset, since the process may not remove it from the lockfile.

            This does not apply to write transactions if the system clears stale writers, see above.
            """,
            "If you do that anyway, do a periodic check for stale readers. Or close the environment once in a while, so the lockfile can get reset.",
            """
            Do not use LMDB databases on remote filesystems, even between processes on the same host. This breaks {@code flock()} on some OSes, possibly memory
            map sync, and certainly sync between programs on different hosts.
            """,
            "Opening a database can fail if another process is opening or closing it at exactly the same time."
        )}

        <h3>Reader Lock Table</h3>

        Readers don't acquire any locks for their data access. Instead, they simply record their transaction ID in the reader table. The reader mutex is needed
        just to find an empty slot in the reader table. The slot's address is saved in thread-specific data so that subsequent read transactions started by the
        same thread need no further locking to proceed.

        If #NOTLS is set, the slot address is not saved in thread-specific data.

        No reader table is used if the database is on a read-only filesystem, or if #NOLOCK is set.

        Since the database uses multi-version concurrency control, readers don't actually need any locking. This table is used to keep track of which readers
        are using data from which old transactions, so that we'll know when a particular old transaction is no longer in use. Old transactions that have
        discarded any data pages can then have those pages reclaimed for use by a later write transaction.

        The lock table is constructed such that reader slots are aligned with the processor's cache line size. Any slot is only ever used by one thread. This
        alignment guarantees that there will be no contention or cache thrashing as threads update their own slot info, and also eliminates any need for
        locking when accessing a slot.

        A writer thread will scan every slot in the table to determine the oldest outstanding reader transaction. Any freed pages older than this will be
        reclaimed by the writer. The writer doesn't use any locks when scanning this table. This means that there's no guarantee that the writer will see the
        most up-to-date reader info, but that's not required for correct operation - all we need is to know the upper bound on the oldest reader, we don't care
        at all about the newest reader. So the only consequence of reading stale information here is that old pages might hang around a while longer before
        being reclaimed. That's actually good anyway, because the longer we delay reclaiming old pages, the more likely it is that a string of contiguous pages
        can be found after coalescing old pages from many old transactions together.
        """,
        library = JNILibrary.create("LibLMDB", setupAllocator = true)
    ),
    LZ4(
        "lz4",
        "org.lwjgl.util.lz4",
        """
        Contains bindings to ${url("http://lz4.github.io/lz4/", "LZ4")}, a lossless compression algorithm, providing compression speed &gt; 500 MB/s per core,
        scalable with multi-cores CPU. It features an extremely fast decoder, with speed in multiple GB/s per core, typically reaching RAM speed limits on
        multi-core systems.
        """,
        library = JNILibrary.create("LibLZ4", setupAllocator = true),
        arrayOverloads = false
    ),
    MEOW(
        "meow",
        "org.lwjgl.util.meow",
        "Contains bindings to ${url("https://github.com/cmuratori/meow_hash", "Meow hash")}, an extremely fast non-cryptographic hash.",
        library = JNILibrary.create("LibMeow"),
        arrayOverloads = false
    ),
    MESHOPTIMIZER(
        "meshoptimizer",
        "org.lwjgl.util.meshoptimizer",
        "Contains bindings to ${url("https://github.com/zeux/meshoptimizer", "meshoptimizer")}, a library that provides algorithms to help optimize meshes.",
        library = JNILibrary.create("LibMeshOptimizer"),
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
        Contains bindings to ${url("https://github.com/mlabbe/nativefiledialog", "Native File Dialog")}, a tiny, neat C library that portably invokes native
        file open and save dialogs. Write dialog code once and have it popup native dialogs on all supported platforms.
        """,
        library = JNILibrary.create("LibNFD", setupAllocator = true)
    ),
    NUKLEAR(
        "nuklear",
        "org.lwjgl.nuklear",
        """
        Bindings to the ${url("https://github.com/vurtun/nuklear", "Nuklear")} library.

        A minimal state immediate mode graphical user interface single header toolkit written in ANSI C and licensed under public domain. It was designed as a
        simple embeddable user interface for application and does not have any dependencies, a default renderbackend or OS window and input handling but
        instead provides a very modular library approach by using simple input state for input and draw commands describing primitive shapes as output. So
        instead of providing a layered library that tries to abstract over a number of platform and render backends it only focuses on the actual UI.

        Developed by Micha Mettke.
        """,
        library = JNILibrary.simple()
    ),
    ODBC(
        "odbc",
        "org.lwjgl.odbc",
        """
        Contains bindings to ${url("https://docs.microsoft.com/en-us/sql/odbc/microsoft-open-database-connectivity-odbc", "ODBC")}.

        The Microsoft Open Database Connectivity (ODBC) interface is a C programming language interface that makes it possible for applications to access data
        from a variety of database management systems (DBMSs). ODBC is a low-level, high-performance interface that is designed specifically for relational
        data stores.

        The ODBC interface allows maximum interoperability — an application can access data in diverse DBMSs through a single interface. Moreover, that
        application will be independent of any DBMS from which it accesses data. Users of the application can add software components called drivers, which
        interface between an application and a specific DBMS.
        """,
        CallingConvention.STDCALL,
        arrayOverloads = false
    ),
    OPENAL(
        "openal",
        "org.lwjgl.openal",
        """
        Contains bindings to the ${url("http://www.openal.org/", "OpenAL")} cross-platform 3D audio API.

        LWJGL comes with a software OpenAL implementation, ${url("http://www.openal-soft.org/", "OpenAL Soft")}.

        OpenAL Soft can be dynamically configured with ${url("https://github.com/kcat/openal-soft/blob/master/docs/env-vars.txt", "environment variables")}. A
        very useful option for debugging is {@code ALSOFT_LOGLEVEL}; it can be set to values 0 through 4, with higher values producing more information.

        In addition to standard OpenAL features, OpenAL Soft supports ${url("https://en.wikipedia.org/wiki/Head-related_transfer_function", "HRTF")},
        ${url("https://en.wikipedia.org/wiki/Ambisonics", "Ambisonics")} and ${url("http://www.codemasters.com/research/3D_sound_for_3D_games.pdf", "3D7.1")}.
        Documentation for these features is available in the OpenAL Soft ${url("https://github.com/kcat/openal-soft/tree/master/docs", "repository")}.
        """
    ),
    OPENCL(
        "opencl",
        "org.lwjgl.opencl",
        """
        Contains bindings to the ${url("https://www.khronos.org/opencl/", "OpenCL")} cross-platform parallel programming API.

        The ${url("https://www.khronos.org/registry/OpenCL/", "Khronos OpenCL registry")} is a useful online resource that contains the OpenCL specification, as
        well as the specifications of OpenCL extensions.
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

        The ${url(
            "https://www.khronos.org/registry/OpenGL/index_es.php",
            "Khronos OpenGL ES registry"
        )} is a useful online resource that contains the OpenGL ES and OpenGL
        ES Shading Language specifications, as well as specifications of OpenGL ES extensions. The ${url(
            "https://www.khronos.org/registry/OpenGL-Refpages/",
            "OpenGL ES Reference Pages"
        )} is another convenient source of documentation.
        """,
        CallingConvention.STDCALL,
        library = JNILibrary.create("GLES", custom = true)
    ),
    OPENVR(
        "openvr",
        "org.lwjgl.openvr",
        """
        Contains bindings to ${url("https://github.com/ValveSoftware/openvr", "OpenVR")}.

        OpenVR is an API and runtime that allows access to VR hardware from multiple vendors without requiring that applications have specific knowledge of the
        hardware they are targeting.
        """,
        CallingConvention.STDCALL,
        library = JNILibrary.create("OpenVR", custom = true),
        arrayOverloads = false
    ),
    OPENXR(
        "openxr",
        "org.lwjgl.openxr",
        """
        Contains bindings to ${url("https://www.khronos.org/openxr/", "OpenXR")}.

        OpenXR is a royalty-free, open standard that provides high-performance access to Augmented Reality (AR) and Virtual Reality (VR)—collectively known as
        XR—platforms and devices.
        """,
        CallingConvention.STDCALL,
        arrayOverloads = false
    ),
    OPUS(
        "opus",
        "org.lwjgl.util.opus",
        "Contains bindings to the <a href=\"https://opus-codec.org\">opus-codec</a> library.",
        arrayOverloads = false
    ),
    OVR(
        "ovr",
        "org.lwjgl.ovr",
        """
        Contains bindings to LibOVR, the ${url("https://developer.oculus.com/", "Oculus SDK")} library.

        Documentation on how to get started with the Oculus SDK can be found ${url("https://developer.oculus.com/documentation/", "here")}.
        """,
        library = JNILibrary.create("LibOVR")
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
    SPVC(
        "spvc",
        "org.lwjgl.util.spvc",
        """
        Contains bindings to ${url("https://github.com/KhronosGroup/SPIRV-Cross", "SPIRV-Cross")}, a library for performing reflection on SPIR-V and
        disassembling SPIR-V back to high level languages.
        """,
        arrayOverloads = false
    ),
    SSE(
        "sse",
        "org.lwjgl.util.simd",
        "Contains bindings to SSE macros.",
        library = JNILibrary.create("LibSSE")
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
        library = JNILibrary.simple(),
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
    TOOTLE(
        "tootle",
        "org.lwjgl.util.tootle",
        """
        Contains bindings to ${url("https://github.com/GPUOpen-Tools/amd-tootle", "AMD Tootle")}.

        AMD Tootle (Triangle Order Optimization Tool) is a 3D triangle mesh optimization library that improves on existing mesh preprocessing techniques. By
        using AMD Tootle, developers can optimize their models for pixel overdraw as well as vertex cache performance. This can provide significant performance
        improvements in pixel limited situations, with no penalty in vertex-limited scenarios, and no runtime cost.
        """,
        library = JNILibrary.simple(),
        arrayOverloads = false
    ),
    VMA(
        "vma",
        "org.lwjgl.util.vma",
        """
        Contains bindings to ${url("https://github.com/GPUOpen-LibrariesAndSDKs/VulkanMemoryAllocator", "Vulkan")}, an easy to integrate Vulkan memory
        allocation library.

        <h4>Problem</h4>

        Memory allocation and resource (buffer and image) creation in Vulkan is difficult (comparing to older graphics API-s, like D3D11 or OpenGL) for several
        reasons:
        ${ul(
            "It requires a lot of boilerplate code, just like everything else in Vulkan, because it is a low-level and high-performance API.",
            """
            There is additional level of indirection: {@code VkDeviceMemory} is allocated separately from creating {@code VkBuffer/VkImage} and they must be
            bound together. The binding cannot be changed later - resource must be recreated.
            """,
            "Driver must be queried for supported memory heaps and memory types. Different IHVs provide different types of it.",
            "It is recommended practice to allocate bigger chunks of memory and assign parts of them to particular resources."
        )}

        <h4>Features</h4>

        This library can help game developers to manage memory allocations and resource creation by offering some higher-level functions. Features of the
        library are divided into several layers, low level to high level:

        ${ol(
            """
            Functions that help to choose correct and optimal memory type based on intended usage of the memory.

            - Required or preferred traits of the memory are expressed using higher-level description comparing to Vulkan flags.
            """,
            """
            Functions that allocate memory blocks, reserve and return parts of them (`VkDeviceMemory` + offset + size) to the user.

            - Library keeps track of allocated memory blocks, used and unused ranges inside them, finds best matching unused ranges for new allocations, takes
            all the rules of alignment and buffer/image granularity into consideration.
            """,
            "Functions that can create an image/buffer, allocate memory for it and bind them together - all in one call."
        )}

        Additional features:

        ${ul(
            "Thread-safety: Library is designed to be used by multithreaded code.",
            "Configuration: Fill optional members of CreateInfo structure to provide custom CPU memory allocator and other parameters.",
            """
            Customization: Predefine appropriate macros to provide your own implementation of all external facilities used by the library, from assert, mutex,
            and atomic, to vector and linked list.
            """,
            """
            Support memory mapping, reference-counted internally. Support for persistently mapped memory: Just allocate with appropriate flag and you get
            access to mapped pointer.
            """,
            "Custom memory pools: Create a pool with desired parameters (e.g. fixed or limited maximum size) and allocate memory out of it.",
            "Support for VK_KHR_dedicated_allocation extension: Enable it and it will be used automatically by the library.",
            "Defragmentation: Call one function and let the library move data around to free some memory blocks and make your allocations better compacted.",
            """
            Lost allocations: Allocate memory with appropriate flags and let the library remove allocations that are not used for many frames to make room for
            new ones.
            """,
            """
            Statistics: Obtain detailed statistics about the amount of memory used, unused, number of allocated blocks, number of allocations etc. - globally,
            per memory heap, and per memory type.
            """,
            "Debug annotations: Associate string with name or opaque pointer to your own data with every allocation.",
            "JSON dump: Obtain a string in JSON format with detailed map of internal state, including list of allocations and gaps between them."
        )}
        """,
        library = JNILibrary.create("LibVma", setupAllocator = true, cpp = true),
        arrayOverloads = false
    ),
    VULKAN(
        "vulkan",
        "org.lwjgl.vulkan",
        """
        Contains bindings to ${url("https://www.khronos.org/vulkan/", "Vulkan")}, a new generation graphics and compute API that provides high-efficiency,
        cross-platform access to modern GPUs used in a wide variety of devices from PCs and consoles to mobile phones and embedded platforms.

        Experimental extensions (KHX, NVX, etc) is not supported API. When such an extension is promoted to stable, the corresponding experimental bindings
        will be removed.

        <b>macOS</b>: LWJGL bundles ${url("https://moltengl.com/moltenvk/", "MoltenVK")}, which emulates Vulkan over Metal.
        """,
        CallingConvention.STDCALL
    ),
    XXHASH(
        "xxhash",
        "org.lwjgl.util.xxhash",
        """
        Contains bindings to ${url("https://github.com/Cyan4973/xxHash", "xxHash")}, an extremely fast non-cryptographic hash algorithm.

        xxHash successfully completes the ${url("https://github.com/aappleby/smhasher", "SMHasher")} test suite which evaluates collision, dispersion and
        randomness qualities of hash functions.
        """,
        library = JNILibrary.create("LibXXHash", setupAllocator = true)
    ),
    YOGA(
        "yoga",
        "org.lwjgl.util.yoga",
        """
        Contains bindings to ${url("https://facebook.github.io/yoga/", "Yoga")}.

        Yoga is a cross-platform layout engine enabling maximum collaboration within your team by implementing an API familiar to many designers and opening it
        up to developers across different platforms.
        ${ul(
            "Do you already know Flexbox? Then you already know Yoga.",
            "Write code in a language familiar to you - Java, C#, Objective-C, C.",
            "C under the hood so your code moves fast.",
            "Battle tested in popular frameworks like React Native."
        )}

        <h3>LWJGL implementation</h3>

        Unlike the official Yoga Java bindings, the LWJGL bindings directly expose the native C API. {@code YGNodeRef} handles do not need to be wrapped in Java
        instances, so there is no memory overhead. The internal Yoga structs are also exposed, which makes it very efficient to read the current tree layout
        after a call to #NodeCalculateLayout():
        ${codeBlock("""
// Public API, 4x JNI call overhead
float l = YGNodeLayoutGetLeft(node);
float t = YGNodeLayoutGetTop(node);
float w = YGNodeLayoutGetWidth(node);
float h = YGNodeLayoutGetHeight(node);

// Internal API without overhead (plain memory accesses, assuming allocations are eliminated via EA)
YGLayout layout = YGNode.create(node).layout();

float l = layout.positions(YGEdgeLeft);
float t = layout.positions(YGEdgeTop);
float w = layout.dimensions(YGDimensionWidth);
float h = layout.dimensions(YGDimensionHeight);""")}
        """,
        library = JNILibrary.create("LibYoga"),
        arrayOverloads = false
    ),
    ZSTD(
        "zstd",
        "org.lwjgl.util.zstd",
        """
        Contains bindings to ${url("http://facebook.github.io/zstd/", "Zstandard")} (zstd), a fast lossless compression algorithm, targeting real-time
        compression scenarios at zlib-level and better compression ratios.

        Zstandard is a real-time compression algorithm, providing high compression ratios. It offers a very wide range of compression / speed trade-off, while
        being backed by a very fast decoder. It also offers a special mode for small data, called dictionary compression, and can create dictionaries from any
        sample set.
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

    internal val path = if (name.startsWith("CORE_")) "core" else name.lowercase()
    internal val java = if (name.startsWith("CORE_")) "org.lwjgl" else "org.lwjgl.${name.lowercase()}"

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
        fun create(className: String, custom: Boolean = false, setupAllocator: Boolean = false, cpp: Boolean = false): JNILibrary =
            JNILibraryWithInit(className, custom, setupAllocator, cpp)
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
    private val custom: Boolean = false,
    private val setupAllocator: Boolean = false,
    private val cpp: Boolean = false
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