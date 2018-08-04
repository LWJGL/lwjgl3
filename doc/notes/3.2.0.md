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