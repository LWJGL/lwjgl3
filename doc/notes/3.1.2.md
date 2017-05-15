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