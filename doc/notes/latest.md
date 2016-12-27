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