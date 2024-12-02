/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_cuda_kernel_launch = "NVCudaKernelLaunch".nativeClassVK("NV_cuda_kernel_launch", type = "device", postfix = "NV") {
    documentation =
        """
        Interoperability between APIs can sometimes create additional overhead depending on the platform used. This extension targets deployment of existing CUDA kernels via Vulkan, with a way to directly upload PTX kernels and dispatch the kernels from Vulkan’s command buffer without the need to use interoperability between the Vulkan and CUDA contexts. However, we do encourage actual development using the native CUDA runtime for the purpose of debugging and profiling.

        The application will first have to create a CUDA module using #CreateCudaModuleNV() then create the CUDA function entry point with #CreateCudaFunctionNV().

        Then in order to dispatch this function, the application will create a command buffer where it will launch the kernel with #CmdCudaLaunchKernelNV().

        When done, the application will then destroy the function handle, as well as the CUDA module handle with #DestroyCudaFunctionNV() and #DestroyCudaModuleNV().

        To reduce the impact of compilation time, this extension offers the capability to return a binary cache from the PTX that was provided. For this, a first query for the required cache size is made with #GetCudaModuleCacheNV() with a {@code NULL} pointer to a buffer and with a valid pointer receiving the size; then another call of the same function with a valid pointer to a buffer to retrieve the data. The resulting cache could then be used later for further runs of this application by sending this cache instead of the PTX code (using the same #CreateCudaModuleNV()), thus significantly speeding up the initialization of the CUDA module.

        As with {@code VkPipelineCache}, the binary cache depends on the hardware architecture. The application must assume the cache might fail, and need to handle falling back to the original PTX code as necessary. Most often, the cache will succeed if the same GPU driver and architecture is used between the cache generation from PTX and the use of this cache. In the event of a new driver version, or if using a different GPU architecture, the cache is likely to become invalid.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_NV_cuda_kernel_launch}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>308</dd>

            <dt><b>Revision</b></dt>
            <dd><ul>
                <li>This is a <em>provisional</em> extension and <b>must</b> be used with caution. See the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#boilerplate-provisional-header">description</a> of provisional header files for enablement and stability details.</li>
            </ul></dd>

            <dt><b>API Interactions</b></dt>
            <dd><ul>
                <li>Interacts with VK_EXT_debug_report</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Tristan Lorach <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_cuda_kernel_launch]%20@tlorach%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_cuda_kernel_launch%20extension*">tlorach</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2020-09-30</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Eric Werness, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "NV_CUDA_KERNEL_LAUNCH_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "NV_CUDA_KERNEL_LAUNCH_EXTENSION_NAME".."VK_NV_cuda_kernel_launch"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_CUDA_MODULE_CREATE_INFO_NV".."1000307000",
        "STRUCTURE_TYPE_CUDA_FUNCTION_CREATE_INFO_NV".."1000307001",
        "STRUCTURE_TYPE_CUDA_LAUNCH_INFO_NV".."1000307002",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_CUDA_KERNEL_LAUNCH_FEATURES_NV".."1000307003",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_CUDA_KERNEL_LAUNCH_PROPERTIES_NV".."1000307004"
    )

    EnumConstant(
        "Extends {@code VkObjectType}.",

        "OBJECT_TYPE_CUDA_MODULE_NV".."1000307000",
        "OBJECT_TYPE_CUDA_FUNCTION_NV".."1000307001"
    )

    EnumConstant(
        "Extends {@code VkDebugReportObjectTypeEXT}.",

        "DEBUG_REPORT_OBJECT_TYPE_CUDA_MODULE_NV_EXT".."1000307000",
        "DEBUG_REPORT_OBJECT_TYPE_CUDA_FUNCTION_NV_EXT".."1000307001"
    )

    VkResult(
        "CreateCudaModuleNV",
        """
        Creates a new CUDA module object.

        <h5>C Specification</h5>
        To create a CUDA module, call:

        <pre><code>
￿VkResult vkCreateCudaModuleNV(
￿    VkDevice                                    device,
￿    const VkCudaModuleCreateInfoNV*             pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkCudaModuleNV*                             pModule);</code></pre>

        <h5>Description</h5>
        Once a CUDA module has been created, the application <b>may</b> create the function entry point, which <b>must</b> refer to one function in the module.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkCudaModuleCreateInfoNV structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pModule} <b>must</b> be a valid pointer to a {@code VkCudaModuleNV} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_INITIALIZATION_FAILED</li>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkCudaModuleCreateInfoNV
        """,

        VkDevice("device", "the logical device that creates the shader module."),
        VkCudaModuleCreateInfoNV.const.p("pCreateInfo", "a pointer to a ##VkCudaModuleCreateInfoNV structure."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a href=\"https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkCudaModuleNV.p("pModule", "a pointer to a {@code VkCudaModuleNV} handle in which the resulting CUDA module object is returned.")
    )

    VkResult(
        "GetCudaModuleCacheNV",
        """
        Get CUDA module cache.

        <h5>C Specification</h5>
        To get the CUDA module cache call:

        <pre><code>
￿VkResult vkGetCudaModuleCacheNV(
￿    VkDevice                                    device,
￿    VkCudaModuleNV                              module,
￿    size_t*                                     pCacheSize,
￿    void*                                       pCacheData);</code></pre>

        <h5>Description</h5>
        If {@code pCacheData} is {@code NULL}, then the size of the binary cache, in bytes, is returned in {@code pCacheSize}. Otherwise, {@code pCacheSize} <b>must</b> point to a variable set by the application to the size of the buffer, in bytes, pointed to by {@code pCacheData}, and on return the variable is overwritten with the amount of data actually written to {@code pCacheData}. If {@code pCacheSize} is less than the size of the binary shader code, nothing is written to {@code pCacheData}, and #INCOMPLETE will be returned instead of #SUCCESS.

        The returned cache <b>may</b> then be used later for further initialization of the CUDA module, by sending this cache <em>instead</em> of the PTX code when using #CreateCudaModuleNV().

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Using the binary cache instead of the original PTX code <b>should</b> significantly speed up initialization of the CUDA module, given that the whole compilation and validation will not be necessary.

        As with {@code VkPipelineCache}, the binary cache depends on the specific implementation. The application <b>must</b> assume the cache upload might fail in many circumstances and thus <b>may</b> have to get ready for falling back to the original PTX code if necessary. Most often, the cache <b>may</b> succeed if the same device driver and architecture is used between the cache generation from PTX and the use of this cache. In the event of a new driver version or if using a different device architecture, this cache <b>may</b> become invalid.
        </div>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code module} <b>must</b> be a valid {@code VkCudaModuleNV} handle</li>
            <li>{@code pCacheSize} <b>must</b> be a valid pointer to a {@code size_t} value</li>
            <li>If the value referenced by {@code pCacheSize} is not 0, and {@code pCacheData} is not {@code NULL}, {@code pCacheData} <b>must</b> be a valid pointer to an array of {@code pCacheSize} bytes</li>
            <li>{@code module} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#INCOMPLETE</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_INITIALIZATION_FAILED</li>
            </ul></dd>
        </dl>
        """,

        VkDevice("device", "the logical device that destroys the Function."),
        VkCudaModuleNV("module", "the CUDA module."),
        AutoSize("pCacheData")..Check(1)..size_t.p("pCacheSize", "a pointer containing the amount of bytes to be copied in {@code pCacheData}"),
        nullable..void.p("pCacheData", "a pointer to a buffer in which to copy the binary cache")
    )

    VkResult(
        "CreateCudaFunctionNV",
        """
        Creates a new CUDA function object.

        <h5>C Specification</h5>
        To create a CUDA function, call:

        <pre><code>
￿VkResult vkCreateCudaFunctionNV(
￿    VkDevice                                    device,
￿    const VkCudaFunctionCreateInfoNV*           pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkCudaFunctionNV*                           pFunction);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkCudaFunctionCreateInfoNV structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pFunction} <b>must</b> be a valid pointer to a {@code VkCudaFunctionNV} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_INITIALIZATION_FAILED</li>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkCudaFunctionCreateInfoNV
        """,

        VkDevice("device", "the logical device that creates the shader module."),
        VkCudaFunctionCreateInfoNV.const.p("pCreateInfo", "a pointer to a ##VkCudaFunctionCreateInfoNV structure."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a href=\"https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkCudaFunctionNV.p("pFunction", "a pointer to a {@code VkCudaFunctionNV} handle in which the resulting CUDA function object is returned.")
    )

    void(
        "DestroyCudaModuleNV",
        """
        Destroy a CUDA module.

        <h5>C Specification</h5>
        To destroy a CUDA shader module, call:

        <pre><code>
￿void vkDestroyCudaModuleNV(
￿    VkDevice                                    device,
￿    VkCudaModuleNV                              module,
￿    const VkAllocationCallbacks*                pAllocator);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code module} <b>must</b> be a valid {@code VkCudaModuleNV} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code module} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice("device", "the logical device that destroys the shader module."),
        VkCudaModuleNV("module", "the handle of the CUDA module to destroy."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a href=\"https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    void(
        "DestroyCudaFunctionNV",
        """
        Destroy a CUDA function.

        <h5>C Specification</h5>
        To destroy a CUDA function handle, call:

        <pre><code>
￿void vkDestroyCudaFunctionNV(
￿    VkDevice                                    device,
￿    VkCudaFunctionNV                            function,
￿    const VkAllocationCallbacks*                pAllocator);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code function} <b>must</b> be a valid {@code VkCudaFunctionNV} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code function} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice("device", "the logical device that destroys the Function."),
        VkCudaFunctionNV("function", "the handle of the CUDA function to destroy."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a href=\"https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    void(
        "CmdCudaLaunchKernelNV",
        """
        Dispatch compute work items.

        <h5>C Specification</h5>
        To record a CUDA kernel launch, call:

        <pre><code>
￿void vkCmdCudaLaunchKernelNV(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkCudaLaunchInfoNV*                   pLaunchInfo);</code></pre>

        <h5>Description</h5>
        When the command is executed, a global workgroup consisting of <code>gridDimX × gridDimY × gridDimZ</code> local workgroups is assembled.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pLaunchInfo} <b>must</b> be a valid pointer to a valid ##VkCudaLaunchInfoNV structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics Compute</td><td>Action</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkCudaLaunchInfoNV
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkCudaLaunchInfoNV.const.p("pLaunchInfo", "a pointer to a ##VkCudaLaunchInfoNV structure in which the grid (similar to workgroup) dimension, function handle and related arguments are defined.")
    )
}