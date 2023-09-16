### 3.3.3

_Released 2023 Sep 16_

This build includes the following changes:

#### Bindings

- bgfx: Updated to API version 122 (up from 118)
  * macOS: support for the OpenGL backend has been dropped.
- EGL: Added latest extensions.
  * `EGL_EXT_gl_colorspace_bt2020_hlg`
- FMOD: Updated to 2.02.16 (up from 2.02.13)
- freetype: Updated to 2.13.2 (up from 2.13.0)
- harfbuzz: Updated to 8.2.0 (up from 7.1.0)
- hwloc: Updated to 2.9.3 (up from 2.9.0)
- KTX: Updated to 4.3.0-alpha3 (up from 4.1.0-rc3)
- liburing: Updated to 2.4 (up from 2.4-dev)
- lmdb: Updated to 0.9.31 (up from 0.9.30)
- meshoptimizer: Updated to 0.19 (up from 0.18)
- NativeFileDialog: Update to 1.1.0 (up from 1.0.2)
  * Added `Configuration.NFD_LINUX_PORTAL` which enables the XDG Desktop Portal backend on Linux. (#893)
- Nuklear: Updated to 4.10.6 (up from 4.10.5)
- OpenAL Soft: Updated to 1.23.1 (up from 1.23.0)
  * Added `AL_SOFT_buffer_length_query` extension.
  * Added `AL_SOFT_source_start_delay` extension.
  * Added `AL_SOFT_UHJ_ex` extension.
- OpenCL: Added latest extensions.
  * `cl_ext_image_from_buffer`
  * `cl_ext_image_requirements_info`
  * `cl_intel_bfloat16_conversions`
  * `cl_intel_split_work_group_barrier`
  * `cl_intel_subgroup_matrix_multiply_accumulate`
  * `cl_intel_subgroup_split_matrix_multiply_accumulate`
- OpenGL: Added latest extensions.
  * `GL_NV_uniform_buffer_std430_layout`
- OpenVR: Updated to 1.26.7 (up from 1.23.7)
- OpenXR: Updated to 1.0.29 (up from 1.0.27)
- Opus: Updated to 1.4.0 (up from 1.3.1)
- Shaderc: Updated to 2023.6 (up from 2023.3)
- SPIRV-Cross: Updated to 0.57.0 (up from 0.51.0)
- tinyexr: Updated to 1.0.7 (up from 1.0.2)
- tinyfiledialogs: Updated to 3.13.3 (up from 3.9.0)
- Vulkan: Updated to 1.3.264 (up from 1.3.246)
  * Includes MoltenVK 1.2.5 (up from 1.2.3)
- xxhash: Updated to 0.8.2 (up from 0.8.1)
- Yoga: Updated to 2.0.0 (up from 1.19.0)
- Zstd: Updated to 1.5.5 (up from 1.5.4)

#### Improvements

- Core: LWJGL is now compatible with GraalVM Native Image. (#875)

#### Fixes

- Core: Java `memset`/`memcpy` implementations no longer touch memory outside the target range. (#892)
- CUDA: Fixed library name on Linux. (#884)
- Nuklear: Fixed the result auto-sizing of `nk_font_atlas_bake`. (#903)
- OpenGL: Added support for [libglvnd](https://github.com/NVIDIA/libglvnd). (#880)
  * LWJGL will now try to load `libGLX.so.0` before `libGL.so.1` on Linux, matching GLFW.
  * Use `Configuration.OPENGL_LIBRARY_NAME` and `GLFWNativeGLX::setPath` to override this behavior.
