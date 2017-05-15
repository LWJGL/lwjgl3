### 3.1.2

_Released 2017 May 15_

This build includes the following changes:

#### Bindings

- Added [OpenVR](https://github.com/ValveSoftware/openvr) bindings.
- Added [Tiny OpenEXR](https://github.com/syoyo/tinyexr) bindings.
- Added [Yoga](https://facebook.github.io/yoga/) bindings.
- bgfx: Updated to API version 41 (up from 34)
- glfw: Updated to pre-release 3.3.0 version (up from 3.2.1). Includes many fixes and new features:
    * Last error code query (`glfwGetError`)
    * Requesting attention from the user (`glfwRequestWindowAttention`) 
    * Platform dependent scancodes for keys (`glfwGetKeyScancode`)
    * Window maximization events (`glfwSetWindowMaximizeCallback`)
    * Window attribute modification (`glfwSetWindowAttrib`)
    * Joystick hats (`glfwGetJoystickHats`)
    * Library initialization hints (`glfwInitHint`)
    * Headless [OSMesa](https://www.mesa3d.org/osmesa.html) backend
    * Cursor centering control (`GLFW_CENTER_CURSOR`)
    * macOS: Cocoa hints (`GLFW_COCOA_RETINA_FRAMEBUFFER`, `GLFW_COCOA_FRAME_AUTOSAVE`, `GLFW_COCOA_GRAPHICS_SWITCHING`, `GLFW_COCOA_CHDIR_RESOURCES`, `GLFW_COCOA_MENUBAR`)
    * macOS: Vulkan support via [MoltenVK](https://moltengl.com/moltenvk/)
    * X11: Moved to XI2 `XI_RawMotion` for disabled cursor mode motion input 
    * EGL: Added support for `EGL_KHR_get_all_proc_addresses` and `EGL_KHR_context_flush_control` 
- jemalloc: Updated to 4.5.0 (up from 4.4.0)
- LibOVR: Update to 1.14.0 (up from 1.10.0)
- lmdb: Updated to 0.9.20 (up from 0.9.18)
- NanoVG: Added support for fallback fonts.
- nuklear: Updated to 1.37.0 (up from 1.29.1, with the new versioning)
- OpenAL: Added `AL_SOFT_source_resampler` and `AL_SOFT_source_spatialize` extensions.
- stb
    * Updated `stb_dxt` to 1.0.6 (up from 1.0.4)
    * Updated `stb_easy_font` to 1.0 (up from 0.7)
    * Updated `stb_image` to 2.15 (up from 2.13)
    * Updated `stb_image_resize` to 0.94 (up from 0.91)
    * Updated `stb_image_write` to 1.05 (up from 1.02)
    * Updated `stb_perlin` to 0.3 (up from 0.2)
    * Updated `stb_rect_pack` to 0.11 (up from 0.10)
    * Updated `stb_truetype` to 1.15 (up from 1.12)
    * Updated `stb_vorbis` to 1.10 (up from 1.09)
- tinyfiledialogs: Updated to 2.8.3 (up from 2.7.2)
- Vulkan: Updated to 1.0.49 (up from 1.0.38)

#### Improvements

- `MemoryStack`: Increased default stack size to 64kb (up from 32kb)
- Shared library loading can now utilize a `ClassLoader` specified by the caller. (#277)
- Significantly reduced `DEBUG_MEMORY_ALLOCATOR` and `DEBUG_STACK` overhead in Java 9 using the new `StackWalker` API.
- Migrated windows builds to [appveyor](https://ci.appveyor.com/project/LWJGL-CI/lwjgl3) and updated to Visual Studio 2017 (up from 2015)
- EGL: The core API now includes javadoc links to the Khronos references pages
- OpenGL ES: The core API now includes javadoc links to the Khronos references pages
- Added support for OSGi (#277)
    * LWJGL OSGi bundles are available under the `org.lwjgl.osgi` Maven `groupId`.
    * Contributed and maintained by @io7m. 

#### Fixes

- Assimp: Struct member nullability fixes
- Linux: Removed dependencies to newer GLIBC versions.
- LibOVR: Fixed layout of the `ovrInputState` struct.
- OpenAL: Removed buffer auto-sizing from `alcCaptureSamples`. The number of samples must now be specified explicitly, similar to `alcRenderSamplesSOFT`.
- Vulkan: Function addresses are now retrieved only once, using the optimal method for each function type.
    * This avoids warnings on pedantic validation layers.
- Fixed callback invocation bugs on 32-bit architectures.
- Fixed various javadoc formatting issues (#308)

#### Breaking Changes

- Mapped more integer parameters and return values to Java `boolean`, that were missed while working on #181.
    * Xlib's `Bool`
    * OpenCL's `cl_bool`
    * DynCall's `DCbool`
- Moved JNI global reference functions from `MemoryUtil` to the generated `org.lwjgl.system.jni.JNINativeInterface`.
- The Vulkan capabilities have been split into two classes: `VKCapabilitiesInstance` and `VKCapabilitiesDevice`.
    * Flags for core Vulkan versions exist in both classes.
    * Flags for instance extensions exist only in `VKCapabilitiesInstance`.
    * Flags for device extensions exist only in `VKCapabilitiesDevice`.
    * Functions that dispatch on `VkInstance` or `VkPhysicalDevice` exist only in `VKCapabilitiesInstance`.
    * Functions that dispatch on `VkDevice` and device-derived handles exist only in `VKCapabilitiesDevice`.
    * Bootstrapping functions can be retrieved with `VK.getFunctionProvider()`.

### 3.1.1

_Released 2016 Dec 27_

This build includes the following changes:

#### Bindings

- Added [Assimp](http://www.assimp.org/) bindings.
- bgfx: Updated to API version 34 (up from 28)
- jemalloc: Updated to version 4.4.0 (up from 4.2.1)
- LibOVR: Updated to version 1.10.0 (up from 1.9.0)
- nuklear: Updated to version 1.191 (up from 1.17)
- Vulkan: Updated to version 1.0.38 (up from 1.0.32)
- stb: Updated stb_image to 2.13 (up from 2.12)
- tinyfiledialogs: Updated to version 2.7.2 (up from 2.6.1)

#### Improvements

- Refactored function pointer lookups in OpenAL, OpenGL and OpenGL ES.
    * Significant reduction in bytecode size (and corresponding JIT code).
    * No thread-local lookup in GL and GLES, even with incompatible contexts.
    * Removed obsolete thread-local and capabilities state `Configuration` options.
- Linux: All natives are now built with GCC 6.2 (up from 4.8)
- Loader: If `jemalloc` initialization fails and `org.lwjgl.system.allocator` has not been set, a simple warning is now shown instead of an exception.
- Structs: Added bound checks to element accessors of array members.
- Generator: Validation is now required for all data pointer parameters. If validation is not possible, such parameters must be marked as potentially unsafe.  
- The SHA-1 hash of shared libraries is now included in the corresponding `natives` JAR files.
- The upstream git revision used to build shared libraries is now included in the corresponding `natives` JAR files.

#### Fixes

- Fixed loader diagnostics when `System.loadLibrary` fails.
- Fixed setters of struct members with optional AutoSize. (#255)
- Fixed `MemoryUtil.memRealloc` to return `null` when the allocation fails.
- Vulkan: Function pointer loading of disabled extensions is now skipped.
- Generator: `binding.DISABLE_CHECKS` is now respected in structs.

#### Breaking Changes

- macOS: LWJGL now requires macOS 10.9/Mavericks or later (up from 10.7/Lion)
- A small number of method signatures have changed because of auto-size transformations that were missing in previous releases.
- NanoVG: Text functions with an `end` pointer to the end of the string are now auto-size transformed. Buffers passed to them should not include a null-terminating byte.
- Added `LibC` prefix to all class names in the `libc` bindings, to avoid conflicts with standard Java classes (`Locale`, `String`, etc.)
- OpenGL and OpenGL ES now come with native libraries (`lwjgl_opengl` and `lwjgl_opengles` respectively).
- Removed `MemoryUtil.memSetupBuffer`.

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
