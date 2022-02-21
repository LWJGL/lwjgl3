### 3.3.1

_Released 2022 Feb 21_

This build includes the following changes:

#### Bindings

- Added [liburing](https://github.com/axboe/liburing) bindings.
  * Can be found in the LWJGL core module (package `org.lwjgl.system.linux.liburing`).
- Added [OpenXR](https://www.khronos.org/openxr/) bindings. (#569)
- Assimp: Updated to 5.2.2 (up from 5.1.0)
- glfw: Updated to latest 3.3.6 (up from 3.3.5)
  * Added `glfwGetGLXFBConfig`.
  * Added `glfwGetEGLConfig`.
- meshoptimizer: Updated to 0.17 (up from 0.16)
- Nuklear: Updated to 4.9.6 (up from 4.09.0)
- Shaderc: Updated to 2022.1 (up from 2021.3)
- vma: Updated to latest 3.3.0-development
  * Added virtual allocator API.
  * Added `VMA_MEMORY_USAGE_AUTO`.
- Vulkan: Updated to 1.3.206 (up from 1.2.198)
  * Includes MoltenVK 1.1.7 (up from 1.1.5)
- xxhash: Updated to 0.8.1 (up from 0.8.0)
- Zstd: Updated to 1.5.2 (up from 1.5.0)
  * Also, the LWJGL memory allocator is now used for internal allocations.

#### Improvements

- GLFW: An alternative macOS build now supports Cocoa calls on any thread.
  * A different window toolkit (AWT, JavaFX, etc.) may now run at the same time as GLFW. It must be initialized before `glfwInit` is called.
  * Enabled with `Configuration.GLFW_LIBRARY_NAME.set("glfw_async");`.

#### Fixes

- Core: Fixed extra `NUL` in string returned from `SharedLibrary::getPath()` on Linux & macOS. (#713)
- Core: Fixed integer overflow when casting pointers on 32-bit architectures. (#720)
- Core: Fixed rare `NPE` with `Configuration.DEBUG_STACK` enabled. (#721)
- OpenCL: Fixed values of the `KERNEL_ARG_ADDRESS_*` constants. (#733)
- OpenCL: Fixed value of `KERNEL_ARG_TYPE_QUALIFIER` constant. (#735)
- vma: Fixed nullability of `VmaVirtualAllocationCreateInfo::pUserData` member.
- Vulkan: All `noautovalidity` parameters/members are now regarded as nullable. (#702)

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

### 3.2.3

_Released 2019 Sep 01_

This build includes the following changes:

#### Bindings

- Added [Shaderc](https://github.com/google/shaderc) bindings. (#77)
- Added bindings to platform APIs that can be used to programmatically generate input events.
- Assimp: Updated to 5.0.0rc2 (up from 5.0.0rc1).
- bgfx: Updated to API version 100 (up from 99)
- glfw: Updated to 3.3.1 (up from 3.3.0)
- EGL: Added `EGL_NV_stream_dma`.
- jemalloc: Updated to 5.2.1 (up from 5.2.0)
- LibOVR: Updated to 1.39.0 (up from 1.35.0)
- libdivide: Updated to 2.0 (up from 1.0)
- lz4: Updated to 1.9.2 (up from 1.9.1)
    * Also, the LWJGL memory allocator is now used for internal allocations.
- nuklear: Updated to 4.01.0 (up from 4.00.2)
- OpenGL(ES): Added latest extensions.
    * `GL_EXT_multiview_tessellation_geometry_shader`
    * `GL_EXT_multiview_texture_multisample`
    * `GL_EXT_multiview_timer_query`
    * `GL_EXT_texture_shadow_lod`
    * `GL_EXT_texture_sRGB_R8`
    * `GL_KHR_shader_subgroup`
    * `GL_NV_shader_subgroup_partitioned`
    * `GL_NVX_gpu_multicast2`
    * `GL_NVX_progress_fence`
- OpenVR: Updated to 1.6.10 (up from 1.3.22)
- par: Updated `par_shapes` to latest version.
    * Added `par_shapes_create_cone`. 
- par: Added [par_streamlines](https://prideout.net/blog/par_streamlines) bindings.
- rpmalloc: Updated to 1.4.0 (up from 1.3.2)
- stb
    * Updated `stb_image` to 2.23 (up from 2.22)
    * Updated `stb_truetype` to 1.22 (up from 1.21)
    * Updated `stb_vorbis` to 1.17 (up from 1.16)
- Vulkan: Updated to 1.1.121 (up from 1.0.107)
    * Includes MoltenVK 1.0.36
- xxhash: Updated to 0.7.1 (up from 0.7.0)
- Zstd: Updated to 1.4.3 (up from 1.4.0)

#### Improvements

- Linux: Added support for ARM builds.
    * 32-bit: ARMv7/armhf architecture. Maven classifier: `linux-arm32`
    * 64-bit: ARMv8/AArch64 architecture. Maven classifier: `linux-arm64`
- Windows: There is now a separate native JAR file per architecture.
    * The default contains x64 shared libraries only. Maven classifier: `windows`
    * `lwjgl-natives-windows-x86.jar` contains x86 shared libraries only. Maven classifier: `windows-x86`
    * The `32` suffix has been dropped from x86 shared library names.
- Windows: Shared libraries are now built with Visual Studio 2019 (up from 2017)
- Maven: LWJGL artifacts now include a Bill of Materials (`lwjgl-bom`). (#481)
    * The [build customizer](https://www.lwjgl.org/customize) may be used to migrate Maven/Gradle scripts. 
- Refactored the layout of native JAR files.
    * Shared libraries have been moved from the root to a `<platform>/<arch>/<module>/` subfolder.
        * `<platform>`: one of `linux`, `macos`, `windows`.
        * `<arch>`: one of `x64`, `x86`, `arm64`, `arm32`.
        * `<module>`: the corresponding Java module name as a package hierarchy.
        * Example: `glfw.so` in `lwjgl-glfw-natives-linux.jar` is under the `linux/x64/org/lwjgl/glfw` folder.
    * The new layout allows multiple native JAR files to be combined for custom deployment.
    * Custom (or the old) layout may be used with newly exposed `Configuration` options.
- Core: Added `enum Platform.Architecture` and `Platform.getArchitecture()` API.
- Core: Added relative & absolute `apply(Consumer<T>)` methods to `StructBuffer<T>`. 
- Core: Added `Consumer<T>` setters to structs with nested arrays of structs.
- Core: Added `memByteBuffer` overloads that return `ByteBuffer` views of other buffer types.
- Core: Added `CLongBuffer`, a class similar to `PointerBuffer` but for C `long` values.

#### Fixes

- Core: Removed support for Critical JNI Natives. (#490)
    * Will be restored in LWJGL 3.3 (disabled by default, enabled with a `Configuration` option). 
- Core: Fixed buffer attachment offset detection on JDK 12+. (#491)
- Core: Fixed `ByteBuffer` attachments in `memSlice` & `memDuplicate`.
- Generator: Fixed invalid generation of functions with struct parameters passed by value. (#496)
    * Affected bindings: OpenVR and LLVM/Clang.
- Generator: Improved javadoc for array and nested struct members.
- EGL/GLES: Fixed bootstrapping code.
    * Regression caused by `org.lwjgl.system.JNI` refactoring in `3.2.2`.
- LLVM: Fixed default library names.
- lmdb: Reverted to the official release. (#482)
    * Windows: Performance issues are eliminated, but sparse database mappings & incremental file growth are not supported anymore.
- OpenGL: Fixed signatures of `glGetnUniformiv` and `glGetnUniformuiv`.

#### Breaking Changes

- Core: The `Library.loadSystem` & `Library.loadNative` methods now require a module name parameter. **(S)**
- Core: Removed `Consumer<T>` overloads from read-only structs with nested struct members. **(S)**
- Core: `MemoryUtil.memFree(PointerBuffer)` changed to `memFree(CustomBuffer)`. **(B)**
- LZ4: The `autoFlush` and `favorDecSpeed` members of `LZ4F_preferences_t` are now mapped to Java `boolean`. **(S)**
- Vulkan: The `descriptorCount` member of `VkWriteDescriptorSet` must now be set explicitly. **(S)**
    * The semantics of `descriptorCount` may change via extensions, which invalidates auto-sizing.
    
#### Known Issues

- Vulkan: GLFW configuration for MoltenVK is broken in LWJGL 3.2.3. (#502)
    * This issue is fixed in LWJGL 3.3.0.

### 3.2.2

_Released 2019 May 05_

This build includes the following changes:

#### Bindings

- bgfx: Updated to API version 99 (up from 90)
- CUDA: Updated to 10.1 (up from 10.0)
- glfw: Updated to 3.3.0 (up from 3.3.0 pre-release):
    * Added `GLFW_RAW_MOUSE_MOTION`.
    * Added `glfwGetMonitorWorkarea`.
    * Added `glfwRawMouseMotionSupported`.
- jemalloc: Updated to 5.2.0 (up from pre-release 5.2.0)
- LibOVR: Updated to 1.35.0 (up from 1.31.0)
- LLVM/Clang: Updated to 8.0 (up from 7.0)
- lmdb: Updated to 0.9.24 (up from 0.9.23)
- lz4: Updated to 1.9.1 (up from 1.8.3)
- NanoVG: Added support for using bgfx as the rendering back-end.
- NanoVG: Added Blendish & OUI bindings. 
- NativeFileDialog: Updated to 1.1.4 (up from 1.1.3)
- OpenVR: Updated to 1.3.22 (up from 1.1.3b)
- Opus: Updated to 1.3.1 (up from 1.3.0)
- stb
    * Updated `stb_image` to 2.22 (up from 2.19)
    * Updated `stb_image_resize` to 0.96 (up from 0.95)
    * Updated `stb_image_write` to 1.13 (up from 1.09)
    * Updated `stb_perlin` to 0.4 (up from 0.3)
    * Updated `stb_rect_pack` to 1.00 (up from 0.11)
    * Updated `stb_truetype` to 1.21 (up from 1.19)
    * Updated `stb_vorbis` to 1.16 (up from 1.14)
- tinyfiledialogs: Updated to 3.3.9 (up from 3.3.8)
- vma: Updated to 2.2.0 (up from 2.1.0)
- Vulkan: Updated to 1.1.107 (up from 1.0.95)
    * Includes MoltenVK 1.0.35 (up from 1.0.27)
- xxhash: Updated to 0.7.0 (up from 0.6.5)
- Yoga: Updated to 1.14.0 (up from 1.10.0)
- Zstd: Updated to 1.4.0 (up from 1.3.7)

#### Improvements

- build(ant): The `release` target now works in offline mode (`LWJGL_BUILD_OFFLINE=true`).
    * The build can be incomplete. Missing natives will be ignored and javadoc generation can be disabled for faster builds.
- build(gradle): Deployments of incomplete builds to the local Maven repository are now allowed.
- Core: Implemented workaround for [JDK-8195129](https://bugs.openjdk.java.net/browse/JDK-8195129) in the `SharedLibraryLoader`.
- perf: Critical JNI Natives are now generated for primitive-only functions.
- LLVM: The bindings can now be used with LLVM/Clang version 5.0 or newer (down from 8.0).

#### Fixes

- build(ant): Fixed building on Linux & macOS when the path to LWJGL's root directory is shallow. (#442)
- Core: Fixed race condition in callback deallocation when the debug allocator is enabled. (#444)
- Generator: The workaround for [JDK-8167409](https://bugs.openjdk.java.net/browse/JDK-8167409) is now applicable to functions with 5 parameters + 1 implicit parameter (function address or struct value result).
- Generator: Support `void()` in callback functions without parameters. 
- Assimp: Added missing members to various struct types.
- LLVM: `LLVMGetErrorMessage` now returns `ByteBuffer` instead of `String`, so that `LLVMDisposeErrorMessage` can be used.
- nuklear: The `nk_text_edit`, `nk_text_undo_state` and `nk_text_undo_record` structs are now public.
- OpenCL: Array overloads of `EnqueueRead/Write` functions cannot be used to perform non-blocking reads/writes anymore.  
- OpenGL: Added `GL_DRAW_INDIRECT_BUFFER` overloads to `NV_bindless_multi_draw_indirect` & `NV_bindless_multi_draw_indirect_count` extensions.
- vma: Fixed `VmaMemoryUsage` enumeration values. (#458)

#### Breaking Changes

- Core: Function address parameters in `org.lwjgl.system.JNI` & `org.lwjgl.system.jawt.JAWTFunctions` methods are now last, after normal parameters. **(S)**
    * Enables tail-calls without argument shuffling, when Critical JNI Natives are used.
- glfw: removed `CharSequence` overload of `glfwUpdateGamepadMappings`. **(S)** (#462)

#### Known Issues

- Core: LWJGL 3.2.2 is incompatible with Java 12 or higher. (#491)
    * This issue is fixed in LWJGL 3.2.3.
- Core: Using LWJGL 3.2.2 with a garbage collector that does not support object pinning, may lead to excessive GC-related blocking. (#490)
    * Workaround: pass `-XX:-CriticalJNINatives` to the JVM.
    * This issue is fixed in LWJGL 3.2.3.

### 3.2.1

_Released 2018 Dec 08_

This build includes the following changes:

#### Bindings

- Added [CUDA](https://developer.nvidia.com/cuda-zone/) bindings.
    * Only the Driver API & NVRTC are supported in this release.
    * Bindings to more CUDA Toolkit libraries will be added in the future.
- Added [libdivide](https://libdivide.com/) bindings.
- Added [LLVM/Clang](https://llvm.org/) bindings.
    * LLVM binaries are not included in this release. They must be separately downloaded or built for each platform.
- Added [Meow hash](https://github.com/cmuratori/meow_hash/) bindings.
- Added [Opus](http://opus-codec.org/) bindings.
- bgfx: Updated to API version 90 (up from 76)
- dyncall: Updated to 1.0 (up from 1.0-RC)
- glfw: Updated to pre-release 3.3.0 version (up from 3.3.0 pre-release):
    * Added `GLFW_SCALE_TO_MONITOR`.
    * Added `glfwAttachWin32Window`. (experimental)
- jemalloc: Updated to pre-release 5.2.0 (up from 5.1.0)
    * When available, it is again the default memory allocator on Windows.
- LibOVR: Updated to 1.31.0 (up from 1.26.0)
- lz4: Updated to 1.8.3 (up from 1.8.2)
- Nuklear: Updated to 4.00.2 (up from 4.00.1)
- OpenAL Soft: Updated to 1.19.1 (up from 1.18.2)
    * Added `ALC_SOFT_device_clock` extension.
- OpenGL(ES): Added latest extensions:
    * `NV_memory_attachment`
    * `NV_compute_shader_derivatives`
    * `NV_fragment_shader_barycentric`
    * `NV_mesh_shader`
    * `NV_representative_fragment_test`
    * `NV_scissor_exclusive`
    * `NV_shader_texture_footprint`
    * `NV_shading_rate_image`
    * `QCOM_shader_framebuffer_fetch_rate`
    * `QCOM_texture_foveated_subsampled_layout`
- OpenVR: Updated to 1.1.3b (up from 1.0.16)
- rpmalloc: Updated to 1.3.2 (up from 1.3.1)
- tinyfiledialogs: Updated to 3.3.8 (up from 3.3.6)
- vma: Updated to 2.1.0 (up from 2.0.0)
- Vulkan: Updated to 1.1.95 (up from 1.0.82)
    * Includes MoltenVK 1.0.27 (up from 1.0.16)
- Yoga: Updated to 1.10.0 (up from 1.9.0)
- Zstd: Updated to 1.3.7 (up from 1.3.5)

#### Improvements

- perf(core): Refactored LWJGL internals to make call stacks shallower.
    * Makes it harder to cross Hotspot's default `MaxInlineLevel` threshold, which can disable important optimizations.
- perf(core): Added `memDuplicate` and refactored `memSlice` with implementations that use `Unsafe` to construct buffer instances, similar to `mem-X-Buffer`.
    * Compared to the default JDK implementations, these methods are faster and enable Scalar Replacement via EA on Hotspot.
    * The `memSlice` with offset method is also thread-safe now.
- perf(core): Implemented workarounds to make struct buffer iteration garbage free on Hotspot.
- perf(core): Re-tuned string codecs and `memCopy`/`memSet` for Java versions 8 to 11.
- perf(core): Added thread-local array cache to minimize allocations while decoding text.
- bgfx: Builds of bgfx tools (`geometryc`, `shaderc`, `texturec`, `texturev`) are now available.
    * Use the [file browser](https://www.lwjgl.org/browse) in the LWJGL website to download the executables.
    * For example, the latest Windows x64 build of `shaderc` can be found under `nightly/windows/x64/bgfx-tools/`.
- vma: `VmaVulkanFunctions.set(VkInstance, VkDevice)` will now use Vulkan 1.1 functions instead of `KHR_get_memory_requirements2` functions, if available.
- Generator: The template DSL has been simplified considerably.
- Generator: Added the `LWJGL Template Extraction Tool`. It uses the new Clang bindings to parse native headers and extract LWJGL template declarations.
    * Extracts both declarations and associated documentation.
    * Written in Kotlin. The source can be found in the `extract` module.

#### Fixes

- Core: Fixed text decoding from buffer with `.position() > 0`.
    * Affected all decoders on Java 9+, only UTF-16 on Java 8.
- Core: Fixed the bounds check in `memCopy`. (#414)
- OpenAL: Fixed signature of `alListener3i`. (#427)
- OpenVR: The `pGamePoseArray` parameter of `VRCompositor_WaitGetPoses` is now nullable. (#418)
- OpenVR: Fixed returned type of `VRRenderModels_GetComponentStateForDevicePath`.
- OpenVR: Renamed `VRInput_UncompressSkeletalActionData` to `VRInput_DecompressSkeletalBoneData`.
- OpenVR: Fixed wrong modifiers in `VRInput` functions:
    - `VRInput_GetDigitalActionData`
    - `VRInput_GetAnalogActionData`
    - `VRInput_GetPoseActionData`
    - `VRInput_GetSkeletalActionData`
    - `VRInput_GetOriginTrackedDeviceInfo`
- vma: The native library is now initialized automatically.
- vma: Optional `KHR_get_memory_requirements2` addresses in `VmaVulkanFunctions` are now nullable.
- vma: Nullability of `VmaAllocationCreateInfo` & `VmaAllocationInfo` members.

#### Breaking Changes

- Core: `sun.misc.Unsafe` is now required, there is no JNI fallback.
- vma: The `VmaVulkanFunctions.set` helper method now returns `VmaVulkanFunctions`. **(B)**

#### Known Issues

- Core: LWJGL 3.2.1 is incompatible with Java 12 or higher. (#491)
    * This issue is fixed in LWJGL 3.2.3.

### 3.2.0

_Released 2018 Jul 30_

This build includes the following changes:

#### Bindings

- Added [Vulkan Memory Allocator](https://github.com/GPUOpen-LibrariesAndSDKs/VulkanMemoryAllocator) bindings.
- bgfx: Updated to API version 76 (up from 60)
    * `bgfx_init` now accepts a parameter structure instead of arguments.
- glfw: Updated to pre-release 3.3.0 version (up from 3.3.0 pre-release):
    * Added support for gamepad mapping input modifiers (SDL 2.0.6+ format)
    * Added `GLFW_FOCUS_ON_SHOW`.
- dyncall: Updated to revision 275 (up from 241)
- jemalloc: Update to 5.1.0 (up from 5.0.1)
- lz4: Updated to 1.8.2 (up from 1.8.1)
- LibOVR: Updated to 1.26.0 (up from 1.20.0) 
- Nuklear: Updated to 4.00.1 (up from 3.00.2)
- OpenGL: Introduced new `GL11C...GL46C` classes that include symbols of the Core Profile only.
    * Read the `org.lwjgl.opengl` package javadoc for more information on this feature.
- OpenVR: Updated to 1.0.16 (up from 1.0.12)
- rpmalloc: Updated to 1.3.1 (up from 1.2.2)
- stb
    * Updated `stb_image` to 2.19 (up from 2.18)
    * Updated `stb_image_write` to 1.09 (up from 1.08)
    * Updated `stb_truetype` to 1.19 (up from 1.18)
    * Updated `stb_vorbis` to 1.14 (up from 1.13b)
- tinyfiledialogs: Updated to 3.3.6 (up from 3.2.9)
- Vulkan: Updated to 1.1.82 (up from 1.0.68)
    * Includes MoltenVK 1.0.16
- xxhash: Update to 0.6.5 (up from 0.6.4)
- Yoga: Updated to 1.9.0 (up from 1.7.1)
- Zstd: Updated to 1.3.5 (up from 1.3.4)

#### Improvements

- Versioned classes in bindings now form inheritance hierarchies.
    * Applicable to the following versioned classes: `AL`, `ALC`, `CL`, `EGL`, `GL`, `GLES`, `GLX`, `VK`
    * For example, the `GL30` class now extends the `GL21` class, `GL21` extends `GL20` and so on.
    * With this change, importing a versioned class allows all symbols up to that version to be resolved. Earlier versions do not need to be imported separately.
- perf(core): `memGetAddress`/`memPutAddress` are now an order of magnitude faster on 32-bit JVMs.
- perf(core): Optimized pointer arithmetic by helping the JVM identify unsigned integers.
- perf(core): The new `java.util.Objects` index check intrinsics are used on Java 9.
- perf(core): `MemoryUtil` string decoding methods are now faster on both Java 8 and 9+.
    * The Java 9 implementations are tuned for compact strings ([JEP 254](http://openjdk.java.net/jeps/254)).
- perf(generator):  Function pointers in capabilities classes are not sorted by name anymore.
    * This makes it more likely that for functions that are commonly used together, their respective pointers
    will be closer in memory, avoiding unnecessary cache misses.
- Generator: `org.lwjgl.system.JNI` now includes signatures for known callback functions.
    * Can be used for callback function delegation.
- Generator: Added support for custom methods in struct classes.
- Generator: Added fluent setters for nested structs.
- Generator: Made StructBuffer subclass generation optional.
- Loader: Now prints the path of shared libraries loaded from system paths in debug mode, when possible.
- docs(core): Improved `PointerBuffer` javadoc.
- docs: The LWJGL javadoc is now generated with JDK 10.
- Core: `MemoryUtil` methods now replace requests for zero-size allocations with non-zero-size allocations.
    * A zero-size allocation now always returns a non-`NULL` pointer or throws an `OOME`. This is consistent with `ByteBuffer.allocateDirect` and avoids the undefined behavior of native allocators.
    * The returned buffer has a capacity of zero, regardless of the actual allocation size.
- Core `MemoryUtil.memRealloc` is not `@Nullable` anymore, will either succeed or throw an `OOME`, like `memAlloc/memCalloc`.
- Core: It is now possible to create a `MemoryStack` backed by externally managed memory.
- Core: The debug allocator now also tracks internal allocations of shared libraries that have been configured to use the LWJGL memory allocator.
    * This enables monitoring/debugging allocations inside shared libraries. Internal resources that are never released are now reported on shutdown.
    * Enabled by default when `Configuration.DEBUG_MEMORY_ALLOCATOR` is enabled.
    * May be disabled with `Configuration.DEBUG_MEMORY_ALLOCATOR_INTERNAL.set(false)`. 
- LMDB: The LWJGL memory allocator is now used for internal allocations.
- NanoVG/NanoSVG: The LWJGL memory allocator is now used for internal allocations.
- OpenGL/GLES: Calling an unavailable function triggers a JNI `FatalError` instead of an arbitrary segfault.
    * Avoids the intimidating crash log and writes a clean stack trace to `stderr`.

#### Fixes

- Generator: Fixed nullability of macro bindings.
- Generator: Fixed location of generated static blocks
- Core: Struct buffer `malloc/calloc` methods now support zero capacity, instead of throwing a `NPE`.
- macOS: Fixed version number detection in `.dylib` name mapping
- Nullability fixes in:
    * Assimp
    * CGL
    * Yoga
    * Parameters of struct multi-setter methods
- OpenCL: Fixed `CL_DEVICE_PREFERRED_VECTOR_WIDTH_INT` constant name.
- OpenCL: Dropped unnecessary `clSetKernalArg3<t>` overloads.
- OpenGL/GLES: The thread-local-free function pointer lookups do not depend on JVMTI anymore.
- stb: Fixed type of `stbi_write_jpg` function's `data` parameter. 

#### Breaking Changes

- Core: `MemoryUtil.MemoryAllocationReport` now also returns the address of the memory allocation.
- NanoVG: Parameters `windowWidth`/`windowHeight` of the `nvgBeginFrame` function changed to `float`.

#### Known Issues

- vma: The native library is not initialized automatically.
    * Workaround: call `Class.forName("org.lwjgl.util.vma.LibVma")` before using the VMA bindings.
- vma: `KHR_get_memory_requirements2` function addresses in `VmaVulkanFunctions` are not optional.
    * Workaround: Enable the `KHR_get_memory_requirements2` extension, or set the equivalent function addresses from Vulkan `1.1`.

### 3.1.6

_Released 2018 Feb 04_

This build includes the following changes:

#### Bindings

- bgfx: Updated to API version 60 (up from 55)
- glfw: Updated to pre-release 3.3.0 version (up from 3.3.0 pre-release):
    * Support for lock key modifiers (`GLFW_LOCK_KEY_MODS` input mode, `GLFW_MOD_CAPS_LOCK`, `GLFW_MOD_NUM_LOCK`)
    * Support for string window hints (`glfwWindowHintString`, `GLFW_COCOA_FRAME_NAME`, `GLFW_X11_CLASS_NAME`, `GLFW_X11_INSTANCE_NAME`)
    * Support monitor & joystick user ponters (`glfwSetMonitorUserPointer`, `glfwGetMonitorUserPointer`, `glfwSetJoystickUserPointer`, `glfwGetJoystickUserPointer`)
    * Support for window content scale callbacks (`glfwSetWindowContentScaleCallback`)
    * Support for cursor hover tests (`GLFW_HOVERED`)
- lz4: Update to 1.8.1 (up from 1.8.0)
- Nuklear: Update to 3.00.2 (up from 2.00.4)
- OpenVR: Updated to 1.0.12 (up from 1.0.10)
- rpmalloc: Updated to 1.2.2 (up from 1.2.0)
- stb
    * Updated `stb_dxt` to 1.08b (up from 1.0.7)
    * Updated `stb_image` to 2.18 (up from 2.16)
    * Updated `stb_image_write` to 1.08 (up from 1.07)
        * `STBIW_ZLIB_COMPRESS` can be overridden at runtime with `stbi_zlib_compress`.
    * Updated `stb_truetype` to 1.18 (up from 1.17)
    * Updated `stb_vorbis` to 1.13b (up from 1.11)
- tinyfiledialogs: Updated to 3.2.9 (up from 3.2.4)
- Vulkan: Updated to 1.0.68 (up from 1.0.65)
- xxhash: Updated to 0.6.4 (up from 0.6.3)
- Zstd: Updated to 1.3.4 (up from 1.3.2)
- Yoga: Updated to 1.7.1 (up from 1.7.0)

#### Improvements

- Added [JSR-305](https://jcp.org/en/jsr/detail?id=305) nullability annotations to the core and all bindings. (#344)
    * Enables static analysis tools ([FindBugs](http://findbugs.sourceforge.net/), IDEs) to detect accesses that could cause `NullPointerException`. Eliminating those improves the quality of LWJGL applications.
    * Enables better interopation with JVM-based languages that feature built-in null-safety. For example, see [Kotlin's JSR-305 support](https://kotlinlang.org/docs/reference/java-interop.html#jsr-305-support).
- Added `Configuration` setting to disable function lookup checks.
- lmdb: Databases are now binary compatible across 32 & 64-bit architectures. (#364)
    * `MDB_VL32` is enabled on 32-bit builds.
- par_shapes: Patched to support 32-bit indices and extremely dense meshes.
- stb_truetype: Exposed members of internal structures for advanced glyph packing customization. (#358)
- Tootle: Now supports the Direct3D rasterizer for overdraw optimization.

#### Fixes

- JPMS: A natives module now `requires transitive` the corresponding Java module, instead of the opposite. (#334)
    * Enables loading shared libraries from non-modular paths/JARs.
- JPMS: `module-info` files have been moved under `META-INF/version/9/` (#334)
    * All LWJGL artifacts are now multi-release JAR files to avoid trouble with older tools that are not compatible with Java 9.
- JPMS: Added appropriate `requires static` declarations to satisfy optional binding interop dependencies. (#369)
- Fixed broken javadoc links in all bindings. Also updated URLs to avoid redirects.
- bgfx: Restored default API thread encoder functions, that were erroneously removed in `3.1.4`.
- LibOVR: Fixed `ovr_TraceMessage` signature. 
- OpenAL: Fixed capability name of the `AL_SOFT_source_resampler` extension.
- Tootle: Fixed `pnClusterRemapOut` parameter validation.

#### Breaking Changes

- Several methods that previously accepted `null`/`NULL` and returned `null`, now require non-null input.
    * Applies to: struct & callback creation methods and `memByteBuffer`/`memUTF8`/`stack.UTF8`/etc.
    * Added corresponding methods with the `Safe` suffix that accept `null`/`NULL`, matching the old behavior.
    * With this change the common case (non-null input) requires no code changes and is warning/error-free. The uncommon case (null input) is recognizable (the suffix) and must be handled properly to eliminate warnings/errors. 
- Allocation methods that returned `null`/`NULL` on allocation failure, now throw `OutOfMemoryError` instead. This matches the behavior of `ByteBuffer.allocateDirect`.
    * Applies to: struct allocation methods and `memAlloc`/`memCalloc`/etc.
    * Does not apply to allocations via direct binding calls (e.g. `LibCStdlib.malloc`).
- Getters of struct members that should never be `NULL`, throw `NullPointerException` instead of returning `null` when the struct instance is not initialized.
    * Use `Struct::isNull` to test pointer members of untrusted struct instances.
- bgfx: Restored native mapping of `bgfx_init(_vendorId)` and `bgfx_update_texture_cube(_side)` parameters. (#368)
- bgfx: `uint16_t` bitfield constants are now mapped to `int`. (#368)
- glfw: `glfwInitHintString` has been renamed to `glfwWindowHintString`.
- lmdb: Databases developed on 32-bit architectures must be recreated. (#364)
- par_shapes: Changed `par_shapes_mesh::triangles` from `uint16_t/ShortBuffer` to `uint32_t/IntBuffer`. 
- stb_rect_pack: `stbrp_rect::was_packed` is now mapped to Java `boolean`.

### 3.1.5

_Released 2017 Nov 22_

This build includes the following changes:

#### Bindings

- Added [AMD Tootle](https://github.com/GPUOpen-Tools/amd-tootle) bindings.
    * Only the software rasterizer is supported.

#### Fixes

- Fixed various javadoc links.
- par: Parsing of floating point values in L-systems is now locale-insensitive. 
- stb: Fixed buffer checks to account for row stride, when specified.
- Generator: Fixed auto-size transformations by non-constant expressions.

#### Breaking Changes

- Removed array overloads from the LZ4 & ODBC bindings.
    * They were added by mistake in LWJGL `3.1.4`.

### 3.1.4

_Released 2017 Nov 19_

This build includes the following changes:

#### Bindings

- Added [LZ4](http://lz4.github.io/lz4/) bindings.
- Added [NanoSVG](https://github.com/memononen/nanosvg) to the existing `NanoVG` bindings.
- Added [ODBC](https://docs.microsoft.com/en-us/sql/odbc/microsoft-open-database-connectivity-odbc) bindings.
- Added [Remotery](https://github.com/Celtoys/Remotery) bindings.
- Added [Zstandard](http://facebook.github.io/zstd/) bindings.
- bgfx: Updated to API version 55 (up from 48)
- glfw: Updated to pre-release 3.3.0 version (up from 3.3.0 pre-release):
    * Support for transparent window framebuffers (`GLFW_TRANSPARENT_FRAMEBUFFER` window hint)
    * Support for whole window opacity (`glfwGetWindowOpacity` and `glfwSetWindowOpacity`)
    * Support for content scale queries (`glfwGetMonitorContentScale` and `glfwGetWindowContentScale`)
    * Linux: Added support for the experimental Wayland backend. Enable with `-Dorg.lwjgl.glfw.libname=glfw_wayland`.
- LibOVR: Updated to 1.20.0 (up from 1.18.0)
- Nuklear: Updated to 2.00.4 (up from 2.00.2)
- tinyfiledialogs: Updated to 3.2.4 (up from 3.0.5)
- Vulkan: Updated to 1.0.65 (up from 1.0.61)
- Yoga: Updated to 1.7.0 (up from 1.6.0)

#### Improvements

- Replaced `Automatic-Module-Name` with explicit JPMS modules.
    * Enables applications using LWJGL to be bundled in custom run-time images with the `jlink` tool.
- lmdb: Significantly improved incremental growth performance on Windows.
    * Granularity of mapped memory commits increased from `4KB` (page size) to `2MB`.
    * This is an unofficial patch of `ITS#8324`.

#### Fixes

- EGL: Fixed nullability of `eglMakeCurrent` arguments.
- OpenVR: Fixed mapping of Vulkan forward declarations.
- Fixed native library resource discovery when running LWJGL as JPMS modules.
- Fixed invalid size calculation in `<StructType>.malloc(capacity)` methods.
- Fixed `MemoryStack` debugging when a try-with-resources block does not inline the call to `AutoCloseable::close`.
    * Supports Java 9 try-with-resources, which generates a synthetic `$closeResource` method.
    * Supports Kotlin's `T.use`, which uses the `kotlin.AutoCloseable::closeFinally` extension function.
- Fixed build number lookup from the jar manifest.

#### Known Issues

- The Maven `3.1.4` build was compiled with a JDK 9 boot classpath, making it incompatible with JDK 8 because of the covariant return types in `java.nio`
classes, introduced with [JDK-4774077](https://bugs.openjdk.java.net/browse/JDK-4774077).
    * The website and github binaries have been fixed.

### 3.1.3

_Released 2017 Sep 22_

This build includes the following changes:

#### Bindings

- Added [rpmalloc](https://github.com/mjansson/rpmalloc) bindings.
    * Use `-Dorg.lwjgl.system.allocator=rpmalloc` to make it the default memory allocator.
- Added new extensions to OpenCL, EGL, OpenGL and OpenGL ES.
- Assimp: Updated to 4.0.1 (up from 3.3.1)
- bgfx: Updated to API version 48 (up from 41)
- EGL: Added support for latest extensions
- glfw: Updated to pre-release 3.3.0 version (up from 3.3.0 pre-release):
    * Improvements to error code query (`glfwGetError`)
    * More library initialization hints (`glfwInitHintString`)
    * SDL_GameControllerDB support
        * Import gamepad mappings (`glfwUpdateGamepadMappings`)
        * Query to determine whether a joystick has a gamepad mapping (`glfwJoystickIsGamepad`)
        * Query the name of a controller provided by its gamepad mapping (`glfwGetGamepadName`)
        * Retrieve gamepad input state (`glfwGetGamepadState`, `GLFW_GAMEPAD_*`, `GLFWgamepadstate`)
        * Query the SDL compatible GUID of a joystick (`glfwGetJoystickGUID`)
    * Linux: Moved to [evdev](https://www.freedesktop.org/software/libevdev/doc/latest/) for joystick input
    * EGL: Fixed support for `EGL_KHR_create_context_no_error`
    * GLX: Added support for `GLX_ARB_create_context_no_error`
    * WGL: Added support for `WGL_ARB_create_context_no_error` and `WGL_EXT_colorspace`
- jemalloc: Updated to 5.0.1 (up from 4.5.0)
- LibOVR: Updated to 1.18.0 (up from 1.14.0)
- lmdb: Updated to 0.9.21 (up from withdrawn 0.9.20)
- NanoVG: Updated to latest version (performance updates and new `nvgShapeAntiAlias` function).
- Nuklear: Updated to 2.00.2 (up from 1.37.0)
- OpenAL: Added `ALC_SOFT_output_limiter` extension.
- OpenAL Soft: Updated to 1.18.2 (up from 1.17.2)
- OpenCL: Added support for OpenCL 2.2
- OpenGL: Added support for OpenGL 4.6 and latest extensions
- OpenGL ES: Added support for latest extensions
- OpenVR: Update to 1.0.10 (up from 1.0.7)
- stb
    * Updated `stb_dxt` to 1.07 (up from 1.06)
    * Updated `stb_image` to 2.16 (up from 2.15)
    * Updated `stb_image_resize` to 0.95 (up from 0.94)
    * Updated `stb_image_write` to 1.07 (up from 1.05)
    * Updated `stb_truetype` to 1.17 (up from 1.15)
    * Updated `stb_vorbis` to 1.11 (up from 1.10)
- tinyfiledialogs: Updated to 3.0.5 (up from 2.8.3)
- Vulkan: Updated to 1.0.61 (up from 1.0.49)
- xxhash: Updated to 0.6.3 (up from 0.6.2)
- Yoga: Updated to 1.6.0 (up from 1.5.0)

#### Improvements

- Generator: Added `@NativeType` annotations to generated bindings. Documents the native type of:
    * Callback and struct classes.
    * Struct members.
    * Function parameters and return values.
- The default memory allocator on Windows is now the system allocator instead of jemalloc.
    * jemalloc is not properly optimized for Windows and its performance is not competitive.
    * jemalloc is still a major performance win on Linux and macOS.
    * rpmalloc is faster on all platforms but requires per-thread setup, so must be enabled manually.
- Buffers created via `MemoryUtil` may now have up to `Integer.MAX_VALUE` elements, regardless of element size.
    * For example this allows a `LongBuffer` allocation of up to 16GB.
- Added typed overloads to `MemoryUtil::memSet` and `MemoryUtil::memCopy`.
- `StructBuffer` subclasses are now `Iterable` and have `stream()` and `parallelStream()` methods.
- OpenGL: Added `LongBuffer` overloads to buffer object functions.

#### Fixes

- bgfx: Fixed signature of `bgfx_create_frame_buffer_from_attachment`.
- OpenGL: Fixed signature of `glPixelStoref`.
- OpenGL: `ARB_direct_state_access` interactions are now respected when checking if the extension is available.
- stb_image: added `ShortBuffer` overload to `stbi_image_free`.
- stb_truetype: Fixed signature of `stbtt_PackFontRangesGatherRects` and `stbtt_PackFontRangesRenderIntoRects`.

#### Breaking Changes

- glfw: Signature of `glfwGetError` has changed.
- jemalloc: Removed `JEmacros` and moved its functionality to `JEmalloc`.
- jemalloc: `ChunkHooks` has been replaced by `ExtentHooks`.
- OpenCL: Removed two confusing `clCompileProgram` overloads.

#### Known Issues

- The `<StructType>.malloc(capacity)` methods allocate memory with invalid size.
    * Workaround: `<StructType>.calloc(capacity)` or `<StructType>.create(nmemAlloc(capacity * <StructType>.SIZEOF))`

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
    * The [download configurator](https://www.lwjgl.org/customize) on the website can be used to customize LWJGL builds and Maven/Gradle projects.
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
* Moved advanced functionality from the base package to the [system](https://github.com/LWJGL/lwjgl3/tree/master/modules/lwjgl/core/src/main/java/org/lwjgl/system) package. Public API in the system package may change between releases.
* Critical methods have been optimized for better performance and garbage elimination.
* JNI methods are now [deduplicated](https://github.com/LWJGL/lwjgl3-generated/blob/master/core/src/generated/java/org/lwjgl/system/JNI.java) and struct layout is calculated in Java. This means much smaller shared libraries.
* Introduced the [Configuration](https://github.com/LWJGL/lwjgl3/blob/master/modules/lwjgl/core/src/main/java/org/lwjgl/system/Configuration.java) class that can be used to programmatically configure LWJGL.
* Introduced explicit memory management API, which is also used internally by LWJGL.
* Introduced a debug allocator that can be enabled for the explicit memory management API. It reports memory leaks with full stack-traces to the leaked allocations.
* All struct classes now have a corresponding [StructBuffer](https://github.com/LWJGL/lwjgl3/blob/master/modules/lwjgl/core/src/main/java/org/lwjgl/system/StructBuffer.java) implementation. Bindings now use Struct and StructBuffer parameters and return values, instead of ByteBuffer, which improves type safety.
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
