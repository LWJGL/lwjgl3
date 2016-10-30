### 3.1.0

_Released 2016 Oct 30_

This build includes the following changes:

#### Bindings

- Bindings have been split into modules and are available as separate artifacts. (#100)
    * The [download configurator](https://www.lwjgl.org/download) on the website can be used to customize LWJGL builds and Maven/Gradle projects.
- Added [LMDB](http://lmdb.tech/doc/) bindings.
- Added [Nuklear](https://github.com/vurtun/nuklear) bindings. (#101)
- Added [Tiny File Dialogs](https://sourceforge.net/projects/tinyfiledialogs/) bindings.
- Added [bgfx](https://github.com/bkaradzic/bgfx) bindings. (#240)
- Added support for new EGL, OpenCL, OpenGL, OpenGL ES and Vulkan extensions.
- Updated all bindings to latest versions.
- Vulkan javadoc is now almost identical to the Vulkan man pages, with links to the online Vulkan specification.

#### Improvements

- Generator: Removed buffer object binding checks. (#197)
- Generator: Added support for mapping `byte/short` parameters to `int`.
- Generator: Added support for `va_list` parameters.
- Generator: Reduced bytecode size of generated methods.
- Generator: The Vulkan bindings are now [automatically generated](https://github.com/LWJGL/lwjgl3-vulkangen).
- Optimized `strlen` methods used internally by LWJGL.
- Optimized misaligned `memSet` and `memCopy`.
- Added support for stack allocations with custom alignment.
- Removed allocation functionality from read-only, externally managed structs.
- Improved library loading diagnostics and added `Configuration.DEBUG_LOADER` option.
- Libraries extracted by the `SharedLibraryLoader` are now locked to avoid conflicts with other processes (e.g. antivirus software). (#225)
- Simplified javadoc of unsafe versions.

#### Fixes

- Callback instances are now tracked when the `DEBUG_MEMORY_ALLOCATOR` option is enabled.
- Fixed `realloc` tracking in the debug allocator.
- Shared libraries that ship with LWJGL are now always preferred over system libraries.
- Fixed return type of functions that return pointer to boolean.
- stb_image: Fixed result auto-sizing of `stbi_load*` functions.
- Functions that deallocate memory no longer have Java array overloads.
- Fixed `memSet` bugs.
- Fixed Java array overload generation for functions with multiple auto-size-result parameters.
- Fixed custom checks in Java array overloads.
- Fixed lookup of Critical JNI natives on Windows x86.
- Disabled Critical JNI natives for functions affected by JDK-8167409 on Linux & MacOS.

#### Breaking Changes

- xxHash: Added support for stack allocation of streaming hash state. Opaque handles have been replaced by the `XXH*State` structs.
- NanoVG: Dropped version suffixes from NanoVGGL classes.
- Mapped more integer parameters and return values to Java booleans, that were missed while working on #181.
- Dropped VKUtil class and moved the version macros to VK10.

### 3.0.0

_Released 2016 Jun 03_

This build includes the following changes:

#### Bindings

- Added support for Java array parameters and HotSpot Critical Natives. (#175)
- Added [Vulkan](https://www.khronos.org/vulkan/) bindings. (#50)
- Added [NanoVG](https://github.com/memononen/nanovg) bindings. (#99)
- Added [NativeFileDialog](https://github.com/mlabbe/nativefiledialog) bindings.
- Added [par_shapes.h](http://github.prideout.net/shapes) bindings.
- Added [dyncall](http://www.dyncall.org/) bindings.
- Added [jawt](https://en.wikipedia.org/wiki/Java_AWT_Native_Interface) bindings for AWT/Swing integration. (#125)
- Added simple OS-specific **window creation** bindings, for custom window/context creation. (#105)
- Added missing OpenCL and OpenAL **extensions**.
- **Fully documented** OpenCL and OpenAL.
- Moved **WGL** and **GLX** capabilities to the new `WGLCapabilities` and `GLXCapabilities` classes, respectively. Functionality in WGL, GLX and corresponding extensions that does not require a current context can now be used without creating a dummy context first. (#171)

#### Improvements

- Added **stack allocation** APIs (the `MemoryStack` class and new allocation methods in struct classes and `MemoryUtil`).
- Made the implementations of `PointerBuffer` and `Struct/StructBuffer` subclasses as lightweight as possible. This makes it easier for escape analysis to **eliminate allocations**.
- Minor struct API improvements.
- Added **nullability information** to **struct members**, to protect against buggy code crashing the JVM.
- All bindings are updated to the **latest versions** of the corresponding libraries. Notably, GLFW now has `glfwSetWindowIcon` and `glfwSetWindowMonitor`, it now doesn't lack anything compared to LWJGL 2's Display.
- Refactored callbacks for Java 8. (#182)
- Added `NativeResource` interface and made freeable objects usable as resources in try-with-resources statements. (#186)
- **Faster thread-local lookups** for the stack and current capabilities. New options in Configuration can be used to **complete eliminate** thread-local lookup in OpenGL, OpenGL ES and OpenAL, when it is known that only a single context will be used, or that all contexts will be compatible (same capabilities and same function pointers).
- Added `memSlice` for all buffers types in `MemoryUtil`. (#179)
- Refactored the `Configuration` class for type safety and added more options.
- **JDK 9** can now be used to build and run LWJGL.
- Javadoc is now generated with JDK 9. The API is fully indexed and **search** functionality is available. Also made multiple Javadoc formatting improvements.
- Improved debug diagnostics on startup and when loading the LWJGL shared library fails.
- Optimized `memSet` and `memCopy` for small buffers.

#### Fixes

- **Stopped** using **UPX** compression for binaries. This eliminates various integration issues and virus scanning false-positives.
- The `SharedLibraryLoader` now works with any shared library, not only libraries LWJGL knows about. (#176)

#### Breaking Changes

- LWJGL now requires **Java 8** to build and run. Certain custom interfaces have been replaced with `java.util.function` interfaces. (#177)
- **Dropped** support for **Linux x86**. (#162)
- **Dropped** libffi bindings.
- **Dropped** `ALDevice/ALContext` wrappers from OpenAL and `CLPlatform/CLDevice` wrappers from OpenCL. (#152)
- **Dropped** the `getInstance()` method from bindings loaded from shared libraries. Function pointers are now stored either in capabilities classes or in a nested **Functions** inner class.
- **Dropped** infrequently used method overloads in bindings. Full javadoc is now generated on (almost) all overloads.
- **Dropped** utility classes that were not useful.
- Added **AutoSize** support to **struct members**. Instance setters for the corresponding count/size members were removed to avoid bugs and confusion.
- Replaced `MemoryUtil.memFree(StructBuffer)` with `StructBuffer.free()`.
- Renamed `__ALIGNMENT` to `ALIGNOF` in struct classes.
- Removed `org.lwjgl.system.Retainable` interface. `Closure` and `FunctionProvider` subclasses are now destroyed using `.free()` instead of `.release()`.
- Moved **xxHash** and **SSE** bindings to the `org.lwjgl.util` package.
- Integer-boolean native types (0 or 1 are the only legal values) are now mapped to Java booleans. (#181)
- **Macros** without parameters are now generated as static final values, not methods.

### 3.0.0 Beta

[DOWNLOAD](https://build.lwjgl.org/release/3.0.0b/lwjgl-3.0.0b.zip)

_Released 2015 Nov 20_

This build includes the following changes:

* The API is now considered **stable**. There were several API changes, especially to struct and callback classes.
* Moved advanced functionality from the base package to the [system](https://github.com/LWJGL/lwjgl3/tree/master/modules/core/src/main/java/org/lwjgl/system) package. Public API in the system package may change between releases.
* Critical methods have been optimized for better performance and garbage elimination.
* JNI methods are now [deduplicated](https://github.com/LWJGL/lwjgl3-generated/blob/master/java/org/lwjgl/system/JNI.java) and struct layout is calculated in Java. This means much smaller shared libraries.
* Introduced the [Configuration](https://github.com/LWJGL/lwjgl3/blob/master/modules/core/src/main/java/org/lwjgl/system/Configuration.java) class that can be used to programmatically configure LWJGL.
* Introduced explicit memory management API, which is also used internally by LWJGL.
* Introduced a debug allocator that can be enabled for the explicit memory management API. It reports memory leaks with full stack-traces to the leaked allocations.
* All struct classes now have a corresponding [StructBuffer](https://github.com/LWJGL/lwjgl3/blob/master/modules/core/src/main/java/org/lwjgl/system/StructBuffer.java) implementation. Bindings now use Struct and StructBuffer parameters and return values, instead of ByteBuffer, which improves type safety.
* Struct fields and accessors are now documented.
* Many other fixes and minor features.

Changes to bindings:

* Removed obsolete OS-specific bindings.
* Added bindings to many OpenGL extensions that were missing in 3.0.0a.
* Added bindings to [jemalloc](http://www.canonware.com/jemalloc/).
* Added bindings to [EGL](https://www.khronos.org/egl).
* Added bindings to [OpenGL ES](https://www.khronos.org/opengles/).
* Added bindings to [xxHash](https://github.com/Cyan4973/xxHash).
* The bindings to [LibOVR](https://developer.oculus.com/) were updated to 0.8.0.0 and are now included in the official build.
* Several other fixes and updates to existing bindings.

### 3.0.0 Alpha

[DOWNLOAD](https://build.lwjgl.org/release/3.0.0a/lwjgl-3.0.0a.zip) (not recommended)

_Released 2015 Jul 13_

The first official release. This build suffers from several bugs and the API is very different from subsequent releases.
