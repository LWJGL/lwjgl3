### 3.3.0

_Released 2021 Nov 15_

This build includes the following changes:

#### Bindings

- Added [libffi](https://sourceware.org/libffi/) bindings.
    * Bundled with the LWJGL core, under the `org.lwjgl.system` package.
- Added [meshoptimizer](https://github.com/zeux/meshoptimizer) bindings.
- Added [SPIRV-Cross](https://github.com/KhronosGroup/SPIRV-Cross) bindings.
- Assimp: Updated to 5.1.0 (up from 5.0.0.rc2)
- bgfx: Updated to API version 115 (up from 100)
- CUDA: Updated to 11.5.0 (up from 10.1.0)
    * Now includes full API documentation.
- glfw: Updated to latest 3.3.5 (up from 3.3.1):
    * Added `GLFW_WIN32_KEYBOARD_MENU`.
    * Added `GLFW_CURSOR_UNAVAILABLE`.
    * Added `GLFW_FEATURE_UNAVAILABLE`.
    * Added `GLFW_FEATURE_UNIMPLEMENTED`.
    * Added `GLFW_MOUSE_PASSTHROUGH`.
    * Added `GLFW_ANGLE_PLATFORM_TYPE`.
    * Added `GLFW_CONTEXT_DEBUG`.
    * Added `GLFW_X11_XCB_VULKAN_SURFACE`.
    * Added `GLFW_PLATFORM`, `GLFW_PLATFORM_UNAVAILABLE`.
    * Added `GLFW_ANY_PLATFORM`, `GLFW_PLATFORM_WIN32`, `GLFW_PLATFORM_COCOA`, `GLFW_PLATFORM_WAYLAND`, `GLFW_PLATFORM_X11`, `GLFW_PLATFORM_NULL`.
    * Added `glfwInitAllocator`.
    * Added `glfwGetPlatform`.
    * Added `glfwPlatformSupported`.
    * Added `glfwInitVulkanLoader`.
    * Added standard cursors for diagonal and omnidirectional resize/move and operation-not-allowed.
    * Added OSMesa native access functions.
- LibOVR: Updated to 1.64.0 (up from 1.39.0)
- libdivide: Updated to 5.0 (up from 2.0)
    * Added support for 16-bit divisions.
- LLVM/Clang: Updated to 13.0.1 (up from 8.0) 
- lmdb: Updated to 0.9.28 (up from 0.9.24)
- lz4: Updated to 1.9.3 (up from 1.9.2)
- NativeFileDialog: Updated to 1.2.0 (up from 1.1.6)
- Nuklear: Updated to 4.09.0 (up from 4.01.0)
- OpenAL Soft: Updated to 1.21.1 (up from 1.19.1)
    * Added `AL_SOFT_bformat_ex` extension.
    * Added `AL_SOFT_buffer_samples` extension.
    * Added `AL_SOFT_buffer_sub_data` extension.
    * Added `AL_SOFT_direct_channels_remix` extension.
- OpenCL: Added support for OpenCL 3.0.
- OpenVR: Updated to 1.16.8 (up from 1.6.10)
- Opus: Added Opusfile & Libopusenc bindings (#634)
- par: Added [par_octasphere](https://prideout.net/blog/octasphere/) bindings.
- rpmalloc: Updated to 1.4.3 (up from 1.4.0)
- Shaderc: Updated to 2021.3 (up from 2019.1)
- stb
    * Updated `stb_dxt` to 1.12 (up from 1.08)
    * Updated `stb_easy_font` to 1.1 (up from 1.0)
    * Updated `stb_image` to 2.27 (up from 2.23)
    * Updated `stb_image_resize` to 0.97 (up from 0.96)
    * Updated `stb_image_write` to 1.16 (up from 1.13)
    * Updated `stb_perlin` to 0.5 (up from 0.4)
    * Updated `stb_rect_pack` to 1.01 (up from 1.00)
    * Updated `stb_truetype` to 1.26 (up from 1.22)
    * Updated `stb_vorbis` to 1.22 (up from 1.17)
- tinyexr: Updated to 1.0.1 (up from 1.0.0 pre-release)
- tinyfiledialogs: Updated to 3.8.8 (up from 3.3.9)
- vma: Updated to 3.3.0-development (up from 2.2.0)
- Vulkan: Updated to 1.2.198 (up from 1.1.121)
    * Includes Vulkan Video
    * Includes MoltenVK 1.1.5 (up from 1.0.36)
- xxhash: Updated to 0.8.0 (up from 0.7.1)
- Yoga: Updated to 1.19.0 (up from 1.14.0)
- Zstd: Updated to 1.5.0 (up from 1.4.3)

#### Improvements

- macOS/Windows: Added support for ARM builds. (#601)
    * Maven classifier for macOS: `natives-macos-arm64`
    * Maven classifier for Windows: `natives-windows-arm64`
- Linux: Shared libraries are now built with GCC 7.5 (up from GCC 4.8)
- Generator: Struct member javadoc moved to the corresponding getter method.
    * There are links to the getter method in the class javadoc (`Layout` section) and in the javadoc of the corresponding setter and `.Buffer` accessors. 
    * Makes it easier to navigate to the documentation of a particular member.
- Generator: simplified stack allocation methods in `Struct` classes.
    * 4 new methods added, named `malloc` and `calloc`, without a "Stack" suffix.
    * 8 old methods with the "Stack" suffix are now deprecated, to be removed in LWJGL `3.4.0`.
- Core: Replaced internal usages of dyncall with libffi.
    * This resolves a range of long-standing issues, mainly with upcalls (callbacks).
    * Single native callback handler used for all upcalls, regardless of signature. Arguments and return values handled Java-side (per callback type).
    * Improved upcall performance (before: JNI downcall per argument, after: simple memory accesses)
    * Support for structs returned by-value. (#283)
- Core: Implemented overflow protection in text encoding methods.
- Core: When LWJGL fails to resolve native libraries, it will now attempt to report native JAR files in the classpath with mismatching platform/architecture. (#587)
- Core: The `SharedLibraryLoader` now prefers to extract natives to the working directory, over the user's home directory.
- Core: Added version information to module descriptors. (#685)
    * The LWJGL version/build used will now be included in stacktraces of modular applications. 
- docs: The javadoc of callback classes/interfaces now includes a link to the corresponding `invoke` method, for better IDE navigation.
- macOS: Shared libraries are now built with Xcode 11.3 (up from 10.0)
- GLFW: Added overrides for internally loaded shared libraries.
    * Useful when there's a mismatch with the library loaded by LWJGL.
    * `GLFWNativeEGL.setEGLPath` & `GLFWNativeEGL.setGLESPath`
    * `GLFWNativeGLX.setPath`
    * `GLFWNativeNSGL.setFramework`
    * `GLFWNativeWGL.setPath`
    * `GLFWVulkan.setPath`
- GLFW: There is now a single Linux native that supports both X11 and Wayland.
    * Use `glfwPlatformSupported(GLFW_PLATFORM_WAYLAND)` to test if Wayland is available.
    * Use `glfwInitHint(GLFW_PLATFORM, GLFW_PLATFORM_WAYLAND)` to enable the Wayland backend.
- GL: Added support for OSMesa contexts. (#595)
- GL/GLES/AL: Added `createCapabilities` overloads that accept an `IntFunction<PointerBuffer>`. Enables explicit management of the off-heap memory used by the capabilities instances.
- GL/GLES/AL: When capabilities creation fails, the current thread/process capabilities state is no longer reset to null.
- GL/GLES/AL/CL/EGL: Added `Configuration` options to forcibly disable specific extensions for debugging purposes. (#683)
- OpenAL: Introduced `ALC::setCapabilities`. Rarely useful when opening multiple devices with different ALC capabilities. (#582)
- Vulkan: Struct classes now include an additional `sType` setter that writes the appropriate struct type value. (#537)
- Vulkan: Struct classes now include type-safe `pNext` setters, one for each struct type that is known to extend them.
    * These setters **prepend** the struct to the `pNext` chain, enabling cleaner code when chaining multiple structs.
    * Order does not matter, but do note that structs will be chained in the reverse order of the `pNext` calls.
    * Also be careful when the base struct is `malloc`ed, make sure to call `.pNext(NULL)` first, otherwise the last struct in the chain will point to invalid memory.

#### Fixes

- Generator: Native libraries are now initialized before constants. (#630)
- Core: Fixed unsafe field reads in `MemoryUtil` setup code. (#632)
- Core: The `SharedLibraryLoader` now prepends a `.` to `SHARED_LIBRARY_EXTRACT_DIRECTORY` when the target directory is not temporary.
- Core: The `SharedLibraryLoader` will now load libraries in the correct `ClassLoader` when testing for [JDK-8195129](https://bugs.openjdk.java.net/browse/JDK-8195129). (#648)
- Core: Changed the encoding of `dlopen` paths to UTF-8. (#691)
- CUDA: Implemented missing `cuIpcOpenEventHandle`/`cuIpcOpenMemHandle` using libFFI.
- EGL: Fixed nullability of `eglInitialize` arguments.
- GLFW: Fixed main thread check. Setting `GLFW_CHECK_THREAD0` to `false` is now required for offscreen interop. (#538)
- OpenCL: Added missing `errcode_ret` parameter to `clLinkProgram`. (#560)
- OpenGL: Restored `GL_TEXTURE` in the core profile. (#573)
- OpenGL: Added buffer object offset overloads to `GetQueryObject*` functions.
- stb: Removed redundant `stb_image_resize` overloads. (#605)
- Vulkan: Fixed GLFW configuration for MoltenVK. (#502)
- Vulkan: Fixed `vkGetInstanceProcAddr` to work with `null` instance arguments.
- Vulkan: Fixed unsigned arithmetic in `VK_VERSION_MAJOR` and `VK_VERSION_MINOR` macros.
    
#### Breaking Changes

```
(B): binary incompatible change
(S): source incompatible change
```

- Linux: Shared libraries are now built on Ubuntu 18.04 (up from Ubuntu 16.04) (B)
    * GLIBC versions older than 2.14 are no longer supported. Some, but not all, LWJGL natives may require up to GLIBC 2.27.
    * Applications deployed on older systems must now build & bundle custom LWJGL natives. Contact LWJGL developers if you need assistance.
- Removed deprecated methods that were marked for removal in LWJGL 3.3. (S)
- Core: Users of the dyncall bindings must migrate to libffi. (S)
- CUDA: Merged versioned classes into a single class that contains the entire functionality. (S)
    * The bindings still require CUDA 3.2 as the minimum version. There are runtime checks for functions introduced after 3.2.
- Shaderc: The shaderc_spvc library has been removed since Shaderc 2020.4. Users may migrate to the new SPIRV-Cross bindings. (S)
- Vulkan: All header boilerplate constants have been moved to `VK10`. (S)
