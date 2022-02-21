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

#### Breaking Changes

```
(B): binary incompatible change
(S): source incompatible change
```
