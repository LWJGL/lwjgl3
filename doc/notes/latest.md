### 3.3.5

_Release 2024 Dec 15_

This build includes the following changes:

#### Bindings

- Assimp: Updated to 5.4.3 (up from 5.4.2)
- bgfx: Updated to API version 129 (up from 128)
- FMOD: Updated to 2.03.04 (up from 2.02.21)
- freetype: Updated to 2.13.3 (up from 2.13.2)
- harfbuzz: Updated to 10.1.0 (up from 9.0.0)
- hwloc: Updated to 2.11.2 (up from 2.11.1)
- libdivide: Updated to 5.1 (up from 5.0)
  * Added `MathUtil` multi-release support for `Long.divideUnsigned`/`Long.remainderUnsigned` and `Math.unsignedMultiplyHigh`.
- liburing: Updated to 2.8 (up from 2.6)
- LLVM/Clang: Updated to 19.1.0 (up from 18.1.7)
- lmdb: Updated to 0.9.33 (up from 0.9.32)
- lz4: Updated to 1.10.0 (up from 1.9.4)
- meshoptimizer: Updated to 0.22 (up from 0.21)
- NativeFileDialog: Update to 1.2.1 (up from 1.2.0)
- Nuklear: Updated to 4.12.3 (up from 4.12.1)
- OpenAL Soft: Updated to 1.24.1 (up from 1.23.1)
  * Added `ALC_SOFT_system_events` extension.
  * Added `AL_EXT_debug` extension.
  * Added `AL_EXT_direct_context` extension.
  * macOS: 10.15+ is now required (up from 10.11).
- OpenXR: Updated to 1.1.43 (up from 1.1.38)
- Shaderc: Updated to 2024.4 (up from 2024.2)
- SPIRV-Cross: Updated to 0.64.0 (up from 0.61.0)
- stb
  * Updated `stb_image_resize` to 2.12 (up from 2.09)
- Vulkan: Updated to 1.4.303 (up from 1.3.289)
  * Includes MoltenVK 1.2.11 (up from 1.2.10)
- Yoga: Updated to 3.2.0 (up from 3.1.0)

#### Improvements

- Core: Migrated jsr305 nullability annotations to JSpecify (https://jspecify.dev). (#1008)
  * The `org.jspecify:jspecify` dependency remains optional.
- Core: Added `Configuration.DISABLE_HASH_CHECKS`, a dynamic option that disables shared library hash checks. (#1007)
- FreeBSD: LWJGL now requires FreeBSD 13.3 or later. (up from 13.2)
- OpenGL: Added `Configuration.OPENGL_CONTEXT_API` option to control the default OpenGL context management API.
- OpenGL: The `Configuration.OPENGL(ES)_CONTEXT_API` options now support `"OSMesa"` as a value.
  * Similar to `GLFW_OSMESA_CONTEXT_API`, LWJGL will try to load libOSMesa when enabled, without having to change `Configuration.OPENGL_LIBRARY_NAME`.
- OpenGL: The default context management API is now EGL when Wayland is detected.
- msdfgen: Added support for glyph index based msdfgen-ext APIs. (#1002)

#### Fixes

- Core: Fixed support for `va_list` parameters.

#### Breaking Changes

- Core: Replaced thread-local storage of `errno/GetLastError()` with virtual output parameters. (#1003)
  * The `LibCErrno.getErrno()` and `WinBase.getLastError()` methods have been removed.
  * System calls in `org.lwjgl.system.linux.*`, `org.lwjgl.system.windows.*` and `org.lwjgl.opengl.WGL` now take an optional output parameter for the error code.
  * This approach is similar to `Linker.Option.CaptureCallState` in Project Panama's FFM API.
- Core: Dropped support for non-LTS JDK versions earlier than the latest LTS version.
  * Supported JDK versions: 8, 11, 17, 21+
  * The `module-info` class and the first batch of multi-release overrides now live under `META-INF/versions/11` instead of `META-INF/versions/9`.