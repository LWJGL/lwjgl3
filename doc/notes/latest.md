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