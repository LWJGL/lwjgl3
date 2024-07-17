### 3.3.4

_Release 2024 Jul 17_

This build includes the following changes:

#### Bindings

- Added [msdfgen](https://github.com/Chlumsky/msdfgen) bindings.
- Assimp: Updated to 5.4.2 (up from 5.2.5)
- bgfx: Updated to API version 128 (up from 122)
  * Windows: support for the Direct3D 9 backend has been dropped.
- CUDA: Updated to 12.5.1 (up from 12.1.0)
- FMOD: Updated to 2.02.21 (up from 2.02.16)
- glfw: Updated to 3.4 (up from 3.3.8)
  * Added `GLFW_UNLIMITED_MOUSE_BUTTONS`, `GLFW_SCALE_FRAMEBUFFER`, `GLFW_WIN32_SHOWDEFAULT`.
  * Added `glfwGetWindowTitle`, `glfwGetCocoaView`.
- glfw: Added experimental support for IME. (#946)
  * Added `GLFW_SOFT_FULLSCREEN`, `GLFW_IME`, `GLFW_MANAGE_PREEDIT_CANDIDATE` and `GLFW_X11_ONTHESPOT`.
  * Added `glfwGetPreeditCursorRectangle`, `glfwSetPreeditCursorRectangle`, `glfwResetPreeditText`, `glfwGetPreeditCandidate`.
  * Added `glfwSetPreeditCallback`, `glfwSetIMEStatusCallback`, `glfwSetPreeditCandidateCallback`.
- harfbuzz: Updated to 9.0.0 (up from 8.2.0)
- hwloc: Updated to 2.11.1 (up from 2.9.3)
- KTX: Updated to 4.3.2 (up from 4.3.0-alpha3)
- libffi: Updated to 3.4.6 (up from 3.4.4)
- liburing: Updated to 2.6 (up from 2.4)
- lmdb: Updated to 0.9.32 (up from 0.9.31)
- LLVM/Clang: Updated to 18.1.7 (up from 16.0.0)
- meshoptimizer: Updated to 0.21 (up from 0.19)
- NativeFileDialog: Update to 1.2.0 (up from 1.1.0)
- Nuklear: Updated to 4.12.1 (up from 4.10.6)
- OpenVR: Updated to 2.5.1 (up from 1.26.7)
  * Added support for Linux ARM64
- OpenXR: Updated to 1.1.38 (up from 1.0.29)
- Opus: Updated to 1.5.2 (up from 1.4.0)
- rpmalloc: Updated to 1.4.5 (up from 1.4.4)
- Shaderc: Updated to 2024.2 (up from 2023.6)
- SPIRV-Cross: Updated to 0.61.0 (up from 0.57.0)
- stb
  * Updated `stb_image` to 2.30 (up from 2.28)
  * Updated `stb_image_resize` to 2.09 (up from 0.97)
- tinyexr: Updated to 1.0.8 (up from 1.0.7)
- tinyfiledialogs: Updated to 3.18.1 (up from 3.13.3)
- vma: Updated to 3.1.0 (up from 3.0.1)
- Vulkan: Updated to 1.3.289 (up from 1.3.264)
  * Includes MoltenVK 1.2.10 (up from 1.2.5)
- Yoga: Updated to 3.1.0 (up from 2.0.0)
- Zstd: Updated to 1.5.6 (up from 1.5.5)

#### Improvements

- FreeBSD: Added support for the FreeBSD operating system, x64 architecture. (#421)
  * Maven classifier: `freebsd`
- Linux: Added support for the PowerPC 64 LE architecture. (#495)
  * Maven classifier: `linux-ppc64le`
- Linux: Added support for the RISC-V 64 architecture. (#890)
  * Maven classifier: `linux-riscv64`
- Linux: ARM/PowerPC/RISC-V shared libraries are now built with GCC 11 (up from GCC 7).
- Windows: Shared libraries are now built with Clang/LLVM (clang-cl toolset) when possible.
- Vulkan: Made `VkMemoryRequirements` mutable for the `vmaAllocateMemory(Pages)` functions. (#937)

#### Fixes

- Core: Fixed callback wrapper memory leak with the CHM closure registry. (#927)
- Core: The `SharedLibraryLoader` will now always test if `System::load` works before choosing the extract path. (#987)
- bgfx: Fixed `bgfx_is_frame_buffer_valid` to accept `BGFXAttachment.Buffer`. (#993)
- JAWT: Fixed `JAWT_MACOSX_USE_CALAYER` value.
- LLVM: Fixed `LLVMGetBufferStart` to return `ByteBuffer` instead of `String`. (#934)
- LLVM: Fixed `LookupIntrinsicID` to return `unsigned` instead of `void`. (#950)
- Nuklear: Fixed auto-sizing of `nk_stroke_polyline`, `nk_stroke_polygon`, `nk_fill_polygon` buffers. (#978)
- tinyfd: The `aDefaultPath` parameter of `tinyfd_selectFolderDialog` is now nullable. (#922)

#### Breaking Changes

- Linux: ARM/PowerPC/RISC-V shared libraries now require GLIBC version 2.35 (up from 2.27)
- macOS: LWJGL now requires macOS 10.11/El Capitan or later (up from 10.9/Mavericks)
- meshoptimizer: Fixed autosizing issues. (#981)
  * For consistency across the API, auto-sizing of some parameters was removed and the corresponding count parameters were made explicit.
  * Auto-sizing is now always based on input parameters, the destination buffers are only checked for enough capacity.
- stb: `stb_image_resize2.h` replaced `stb_image_resize.h` with a new API.