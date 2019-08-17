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

```
(B): binary incompatible change
(S): source incompatible change
```

- Core: Function address parameters in `org.lwjgl.system.JNI` & `org.lwjgl.system.jawt.JAWTFunctions` methods are now last, after normal parameters. **(S)**
    * Enables tail-calls without argument shuffling, when Critical JNI Natives are used.
- glfw: removed `CharSequence` overload of `glfwUpdateGamepadMappings`. **(S)** (#462)

#### Known Issues

- Core: LWJGL 3.2.2 is incompatible with Java 12 or higher. (#491)
    * This issue is fixed in LWJGL 3.2.3.
- Core: Using LWJGL 3.2.2 with a garbage collector that does not support object pinning, may lead to excessive GC-related blocking. (#490)
    * Workaround: pass `-XX:-CriticalJNINatives` to the JVM.
    * This issue is fixed in LWJGL 3.2.3.