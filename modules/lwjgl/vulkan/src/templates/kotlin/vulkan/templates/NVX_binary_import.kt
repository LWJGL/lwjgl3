/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NVX_binary_import = "NVXBinaryImport".nativeClassVK("NVX_binary_import", type = "device", postfix = "NVX") {
    documentation =
        """
        This extension allows applications to import CuBIN binaries and execute them.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        There is currently no specification language written for this extension. The links to APIs defined by the extension are to stubs that only include generated content such as API declarations and implicit valid usage statements.
        </div>

        <h5>Stub API References</h5>
        There is currently no specification language written for this type. This section acts only as placeholder and to avoid dead links in the specification and reference pages.

        <pre><code>
￿VK_DEFINE_NON_DISPATCHABLE_HANDLE(VkCuFunctionNVX)</code></pre>

        There is currently no specification language written for this type. This section acts only as placeholder and to avoid dead links in the specification and reference pages.

        <pre><code>
￿VK_DEFINE_NON_DISPATCHABLE_HANDLE(VkCuModuleNVX)</code></pre>

        There is currently no specification language written for this command. This section acts only as placeholder and to avoid dead links in the specification and reference pages.

        <pre><code>
￿VkResult vkCreateCuFunctionNVX(
￿    VkDevice                                    device,
￿    const VkCuFunctionCreateInfoNVX*            pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkCuFunctionNVX*                            pFunction);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkCuFunctionCreateInfoNVX structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pFunction} <b>must</b> be a valid pointer to a {@code VkCuFunctionNVX} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_INITIALIZATION_FAILED</li>
            </ul></dd>
        </dl>

        There is currently no specification language written for this type. This section acts only as placeholder and to avoid dead links in the specification and reference pages.

        <pre><code>
￿typedef struct VkCuFunctionCreateInfoNVX {
￿    VkStructureType    sType;
￿    const void*        pNext;
￿    VkCuModuleNVX      module;
￿    const char*        pName;
￿} VkCuFunctionCreateInfoNVX;</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_CU_FUNCTION_CREATE_INFO_NVX</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code module} <b>must</b> be a valid {@code VkCuModuleNVX} handle</li>
            <li>{@code pName} <b>must</b> be a null-terminated UTF-8 string</li>
        </ul>

        There is currently no specification language written for this command. This section acts only as placeholder and to avoid dead links in the specification and reference pages.

        <pre><code>
￿void vkDestroyCuFunctionNVX(
￿    VkDevice                                    device,
￿    VkCuFunctionNVX                             function,
￿    const VkAllocationCallbacks*                pAllocator);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code function} <b>must</b> be a valid {@code VkCuFunctionNVX} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code function} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        There is currently no specification language written for this command. This section acts only as placeholder and to avoid dead links in the specification and reference pages.

        <pre><code>
￿VkResult vkCreateCuModuleNVX(
￿    VkDevice                                    device,
￿    const VkCuModuleCreateInfoNVX*              pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkCuModuleNVX*                              pModule);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkCuModuleCreateInfoNVX structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pModule} <b>must</b> be a valid pointer to a {@code VkCuModuleNVX} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_INITIALIZATION_FAILED</li>
            </ul></dd>
        </dl>

        There is currently no specification language written for this type. This section acts only as placeholder and to avoid dead links in the specification and reference pages.

        <pre><code>
￿typedef struct VkCuModuleCreateInfoNVX {
￿    VkStructureType    sType;
￿    const void*        pNext;
￿    size_t             dataSize;
￿    const void*        pData;
￿} VkCuModuleCreateInfoNVX;</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_CU_MODULE_CREATE_INFO_NVX</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code pData} <b>must</b> be a valid pointer to an array of {@code dataSize} bytes</li>
            <li>{@code dataSize} <b>must</b> be greater than 0</li>
        </ul>

        There is currently no specification language written for this command. This section acts only as placeholder and to avoid dead links in the specification and reference pages.

        <pre><code>
￿void vkDestroyCuModuleNVX(
￿    VkDevice                                    device,
￿    VkCuModuleNVX                               module,
￿    const VkAllocationCallbacks*                pAllocator);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code module} <b>must</b> be a valid {@code VkCuModuleNVX} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code module} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        There is currently no specification language written for this command. This section acts only as placeholder and to avoid dead links in the specification and reference pages.

        <pre><code>
￿void vkCmdCuLaunchKernelNVX(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkCuLaunchInfoNVX*                    pLaunchInfo);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pLaunchInfo} <b>must</b> be a valid pointer to a valid ##VkCuLaunchInfoNVX structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics Compute</td></tr></tbody>
        </table>

        There is currently no specification language written for this type. This section acts only as placeholder and to avoid dead links in the specification and reference pages.

        <pre><code>
￿typedef struct VkCuLaunchInfoNVX {
￿    VkStructureType        sType;
￿    const void*            pNext;
￿    VkCuFunctionNVX        function;
￿    uint32_t               gridDimX;
￿    uint32_t               gridDimY;
￿    uint32_t               gridDimZ;
￿    uint32_t               blockDimX;
￿    uint32_t               blockDimY;
￿    uint32_t               blockDimZ;
￿    uint32_t               sharedMemBytes;
￿    size_t                 paramCount;
￿    const void* const *    pParams;
￿    size_t                 extraCount;
￿    const void* const *    pExtras;
￿} VkCuLaunchInfoNVX;</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_CU_LAUNCH_INFO_NVX</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code function} <b>must</b> be a valid {@code VkCuFunctionNVX} handle</li>
            <li>If {@code paramCount} is not 0, {@code pParams} <b>must</b> be a valid pointer to an array of {@code paramCount} bytes</li>
            <li>If {@code extraCount} is not 0, {@code pExtras} <b>must</b> be a valid pointer to an array of {@code extraCount} bytes</li>
        </ul>

        <h5>VK_NVX_binary_import</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_NVX_binary_import}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>30</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Eric Werness <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NVX_binary_import]%20@ewerness-nv%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NVX_binary_import%20extension%3E%3E">ewerness-nv</a></li>
                <li>Liam Middlebrook <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NVX_binary_import]%20@liam-middlebrook%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NVX_binary_import%20extension%3E%3E">liam-middlebrook</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2021-04-09</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Eric Werness, NVIDIA</li>
                <li>Liam Middlebrook, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "NVX_BINARY_IMPORT_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "NVX_BINARY_IMPORT_EXTENSION_NAME".."VK_NVX_binary_import"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_CU_MODULE_CREATE_INFO_NVX".."1000029000",
        "STRUCTURE_TYPE_CU_FUNCTION_CREATE_INFO_NVX".."1000029001",
        "STRUCTURE_TYPE_CU_LAUNCH_INFO_NVX".."1000029002"
    )

    EnumConstant(
        "Extends {@code VkObjectType}.",

        "OBJECT_TYPE_CU_MODULE_NVX".."1000029000",
        "OBJECT_TYPE_CU_FUNCTION_NVX".."1000029001"
    )

    EnumConstant(
        "Extends {@code VkDebugReportObjectTypeEXT}.",

        "DEBUG_REPORT_OBJECT_TYPE_CU_MODULE_NVX_EXT".."1000029000",
        "DEBUG_REPORT_OBJECT_TYPE_CU_FUNCTION_NVX_EXT".."1000029001"
    )

    VkResult(
        "CreateCuModuleNVX",
        """
        Stub description of vkCreateCuModuleNVX.

        <h5>C Specification</h5>
        There is currently no specification language written for this command. This section acts only as placeholder and to avoid dead links in the specification and reference pages.

        <pre><code>
￿VkResult vkCreateCuModuleNVX(
￿    VkDevice                                    device,
￿    const VkCuModuleCreateInfoNVX*              pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkCuModuleNVX*                              pModule);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkCuModuleCreateInfoNVX structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pModule} <b>must</b> be a valid pointer to a {@code VkCuModuleNVX} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_INITIALIZATION_FAILED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkCuModuleCreateInfoNVX
        """,

        VkDevice("device", ""),
        VkCuModuleCreateInfoNVX.const.p("pCreateInfo", ""),
        nullable..VkAllocationCallbacks.const.p("pAllocator", ""),
        Check(1)..VkCuModuleNVX.p("pModule", "")
    )

    VkResult(
        "CreateCuFunctionNVX",
        """
        Stub description of vkCreateCuFunctionNVX.

        <h5>C Specification</h5>
        There is currently no specification language written for this command. This section acts only as placeholder and to avoid dead links in the specification and reference pages.

        <pre><code>
￿VkResult vkCreateCuFunctionNVX(
￿    VkDevice                                    device,
￿    const VkCuFunctionCreateInfoNVX*            pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkCuFunctionNVX*                            pFunction);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkCuFunctionCreateInfoNVX structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pFunction} <b>must</b> be a valid pointer to a {@code VkCuFunctionNVX} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_INITIALIZATION_FAILED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkCuFunctionCreateInfoNVX
        """,

        VkDevice("device", ""),
        VkCuFunctionCreateInfoNVX.const.p("pCreateInfo", ""),
        nullable..VkAllocationCallbacks.const.p("pAllocator", ""),
        Check(1)..VkCuFunctionNVX.p("pFunction", "")
    )

    void(
        "DestroyCuModuleNVX",
        """
        Stub description of vkDestroyCuModuleNVX.

        <h5>C Specification</h5>
        There is currently no specification language written for this command. This section acts only as placeholder and to avoid dead links in the specification and reference pages.

        <pre><code>
￿void vkDestroyCuModuleNVX(
￿    VkDevice                                    device,
￿    VkCuModuleNVX                               module,
￿    const VkAllocationCallbacks*                pAllocator);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code module} <b>must</b> be a valid {@code VkCuModuleNVX} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code module} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice("device", ""),
        VkCuModuleNVX("module", ""),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "")
    )

    void(
        "DestroyCuFunctionNVX",
        """
        Stub description of vkDestroyCuFunctionNVX.

        <h5>C Specification</h5>
        There is currently no specification language written for this command. This section acts only as placeholder and to avoid dead links in the specification and reference pages.

        <pre><code>
￿void vkDestroyCuFunctionNVX(
￿    VkDevice                                    device,
￿    VkCuFunctionNVX                             function,
￿    const VkAllocationCallbacks*                pAllocator);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code function} <b>must</b> be a valid {@code VkCuFunctionNVX} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code function} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice("device", ""),
        VkCuFunctionNVX("function", ""),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "")
    )

    void(
        "CmdCuLaunchKernelNVX",
        """
        Stub description of vkCmdCuLaunchKernelNVX.

        <h5>C Specification</h5>
        There is currently no specification language written for this command. This section acts only as placeholder and to avoid dead links in the specification and reference pages.

        <pre><code>
￿void vkCmdCuLaunchKernelNVX(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkCuLaunchInfoNVX*                    pLaunchInfo);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pLaunchInfo} <b>must</b> be a valid pointer to a valid ##VkCuLaunchInfoNVX structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics Compute</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkCuLaunchInfoNVX
        """,

        VkCommandBuffer("commandBuffer", ""),
        VkCuLaunchInfoNVX.const.p("pLaunchInfo", "")
    )
}