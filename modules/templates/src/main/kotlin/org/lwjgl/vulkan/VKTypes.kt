/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan

import org.lwjgl.generator.*

val IMG = "IMG"
val AMD = "AMD"
val ARM = "ARM"
val FSL = "FSL"
val BRCM = "BRCM"
val NXP = "NXP"
val NV = "NV"
val NVX = "NVX"
val VIV = "VIV"
val VSI = "VSI"
val KDAB = "KDAB"
val ANDROID = "ANDROID"
val CHROMIUM = "CHROMIUM"
val GOOGLE = "GOOGLE"
val QCOM = "QCOM"
val LUNARG = "LUNARG"
val SAMSUNG = "SAMSUNG"
val SEC = "SEC"
val TIZEN = "TIZEN"
val RENDERDOC = "RENDERDOC"
val NN = "NN"
val MVK = "MVK"
val KHR = "KHR"
val EXT = "EXT"
val MESA = "MESA"

// Handle types
val VkInstance = VK_DEFINE_HANDLE("VkInstance")
val VkPhysicalDevice = VK_DEFINE_HANDLE("VkPhysicalDevice")
val VkDevice = VK_DEFINE_HANDLE("VkDevice")
val VkQueue = VK_DEFINE_HANDLE("VkQueue")
val VkSemaphore = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkSemaphore")
val VkCommandBuffer = VK_DEFINE_HANDLE("VkCommandBuffer")
val VkFence = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkFence")
val VkDeviceMemory = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkDeviceMemory")
val VkBuffer = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkBuffer")
val VkImage = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkImage")
val VkEvent = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkEvent")
val VkQueryPool = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkQueryPool")
val VkBufferView = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkBufferView")
val VkImageView = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkImageView")
val VkShaderModule = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkShaderModule")
val VkPipelineCache = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkPipelineCache")
val VkPipelineLayout = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkPipelineLayout")
val VkRenderPass = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkRenderPass")
val VkPipeline = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkPipeline")
val VkDescriptorSetLayout = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkDescriptorSetLayout")
val VkSampler = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkSampler")
val VkDescriptorPool = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkDescriptorPool")
val VkDescriptorSet = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkDescriptorSet")
val VkFramebuffer = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkFramebuffer")
val VkCommandPool = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkCommandPool")

// Enum types
val VkPipelineCacheHeaderVersion = "VkPipelineCacheHeaderVersion".enumType
val VkResult = "VkResult".enumType
val VkStructureType = "VkStructureType".enumType
val VkSystemAllocationScope = "VkSystemAllocationScope".enumType
val VkInternalAllocationType = "VkInternalAllocationType".enumType
val VkFormat = "VkFormat".enumType
val VkImageType = "VkImageType".enumType
val VkImageTiling = "VkImageTiling".enumType
val VkPhysicalDeviceType = "VkPhysicalDeviceType".enumType
val VkSampleCountFlagBits = "VkSampleCountFlagBits".enumType
val VkQueryType = "VkQueryType".enumType
val VkSharingMode = "VkSharingMode".enumType
val VkImageLayout = "VkImageLayout".enumType
val VkImageViewType = "VkImageViewType".enumType
val VkComponentSwizzle = "VkComponentSwizzle".enumType
val VkShaderStageFlagBits = "VkShaderStageFlagBits".enumType
val VkVertexInputRate = "VkVertexInputRate".enumType
val VkPrimitiveTopology = "VkPrimitiveTopology".enumType
val VkPolygonMode = "VkPolygonMode".enumType
val VkFrontFace = "VkFrontFace".enumType
val VkCompareOp = "VkCompareOp".enumType
val VkStencilOp = "VkStencilOp".enumType
val VkLogicOp = "VkLogicOp".enumType
val VkBlendFactor = "VkBlendFactor".enumType
val VkBlendOp = "VkBlendOp".enumType
val VkDynamicState = "VkDynamicState".enumType
val VkFilter = "VkFilter".enumType
val VkSamplerMipmapMode = "VkSamplerMipmapMode".enumType
val VkSamplerAddressMode = "VkSamplerAddressMode".enumType
val VkBorderColor = "VkBorderColor".enumType
val VkDescriptorType = "VkDescriptorType".enumType
val VkAttachmentLoadOp = "VkAttachmentLoadOp".enumType
val VkAttachmentStoreOp = "VkAttachmentStoreOp".enumType
val VkPipelineBindPoint = "VkPipelineBindPoint".enumType
val VkCommandBufferLevel = "VkCommandBufferLevel".enumType
val VkIndexType = "VkIndexType".enumType
val VkPipelineStageFlagBits = "VkPipelineStageFlagBits".enumType
val VkSubpassContents = "VkSubpassContents".enumType
val VkObjectType = "VkObjectType".enumType

// Bitmask types
val VkInstanceCreateFlags = typedef(VkFlags, "VkInstanceCreateFlags")
val VkFormatFeatureFlags = typedef(VkFlags, "VkFormatFeatureFlags")
val VkImageUsageFlags = typedef(VkFlags, "VkImageUsageFlags")
val VkImageCreateFlags = typedef(VkFlags, "VkImageCreateFlags")
val VkSampleCountFlags = typedef(VkFlags, "VkSampleCountFlags")
val VkQueueFlags = typedef(VkFlags, "VkQueueFlags")
val VkMemoryPropertyFlags = typedef(VkFlags, "VkMemoryPropertyFlags")
val VkMemoryHeapFlags = typedef(VkFlags, "VkMemoryHeapFlags")
val VkDeviceCreateFlags = typedef(VkFlags, "VkDeviceCreateFlags")
val VkDeviceQueueCreateFlags = typedef(VkFlags, "VkDeviceQueueCreateFlags")
val VkPipelineStageFlags = typedef(VkFlags, "VkPipelineStageFlags")
val VkMemoryMapFlags = typedef(VkFlags, "VkMemoryMapFlags")
val VkImageAspectFlags = typedef(VkFlags, "VkImageAspectFlags")
val VkSparseImageFormatFlags = typedef(VkFlags, "VkSparseImageFormatFlags")
val VkSparseMemoryBindFlags = typedef(VkFlags, "VkSparseMemoryBindFlags")
val VkFenceCreateFlags = typedef(VkFlags, "VkFenceCreateFlags")
val VkSemaphoreCreateFlags = typedef(VkFlags, "VkSemaphoreCreateFlags")
val VkEventCreateFlags = typedef(VkFlags, "VkEventCreateFlags")
val VkQueryPoolCreateFlags = typedef(VkFlags, "VkQueryPoolCreateFlags")
val VkQueryPipelineStatisticFlags = typedef(VkFlags, "VkQueryPipelineStatisticFlags")
val VkQueryResultFlags = typedef(VkFlags, "VkQueryResultFlags")
val VkBufferCreateFlags = typedef(VkFlags, "VkBufferCreateFlags")
val VkBufferUsageFlags = typedef(VkFlags, "VkBufferUsageFlags")
val VkBufferViewCreateFlags = typedef(VkFlags, "VkBufferViewCreateFlags")
val VkImageViewCreateFlags = typedef(VkFlags, "VkImageViewCreateFlags")
val VkShaderModuleCreateFlags = typedef(VkFlags, "VkShaderModuleCreateFlags")
val VkPipelineCacheCreateFlags = typedef(VkFlags, "VkPipelineCacheCreateFlags")
val VkPipelineCreateFlags = typedef(VkFlags, "VkPipelineCreateFlags")
val VkPipelineShaderStageCreateFlags = typedef(VkFlags, "VkPipelineShaderStageCreateFlags")
val VkPipelineVertexInputStateCreateFlags = typedef(VkFlags, "VkPipelineVertexInputStateCreateFlags")
val VkPipelineInputAssemblyStateCreateFlags = typedef(VkFlags, "VkPipelineInputAssemblyStateCreateFlags")
val VkPipelineTessellationStateCreateFlags = typedef(VkFlags, "VkPipelineTessellationStateCreateFlags")
val VkPipelineViewportStateCreateFlags = typedef(VkFlags, "VkPipelineViewportStateCreateFlags")
val VkPipelineRasterizationStateCreateFlags = typedef(VkFlags, "VkPipelineRasterizationStateCreateFlags")
val VkCullModeFlags = typedef(VkFlags, "VkCullModeFlags")
val VkPipelineMultisampleStateCreateFlags = typedef(VkFlags, "VkPipelineMultisampleStateCreateFlags")
val VkPipelineDepthStencilStateCreateFlags = typedef(VkFlags, "VkPipelineDepthStencilStateCreateFlags")
val VkPipelineColorBlendStateCreateFlags = typedef(VkFlags, "VkPipelineColorBlendStateCreateFlags")
val VkColorComponentFlags = typedef(VkFlags, "VkColorComponentFlags")
val VkPipelineDynamicStateCreateFlags = typedef(VkFlags, "VkPipelineDynamicStateCreateFlags")
val VkPipelineLayoutCreateFlags = typedef(VkFlags, "VkPipelineLayoutCreateFlags")
val VkShaderStageFlags = typedef(VkFlags, "VkShaderStageFlags")
val VkSamplerCreateFlags = typedef(VkFlags, "VkSamplerCreateFlags")
val VkDescriptorSetLayoutCreateFlags = typedef(VkFlags, "VkDescriptorSetLayoutCreateFlags")
val VkDescriptorPoolCreateFlags = typedef(VkFlags, "VkDescriptorPoolCreateFlags")
val VkDescriptorPoolResetFlags = typedef(VkFlags, "VkDescriptorPoolResetFlags")
val VkFramebufferCreateFlags = typedef(VkFlags, "VkFramebufferCreateFlags")
val VkRenderPassCreateFlags = typedef(VkFlags, "VkRenderPassCreateFlags")
val VkAttachmentDescriptionFlags = typedef(VkFlags, "VkAttachmentDescriptionFlags")
val VkSubpassDescriptionFlags = typedef(VkFlags, "VkSubpassDescriptionFlags")
val VkAccessFlags = typedef(VkFlags, "VkAccessFlags")
val VkDependencyFlags = typedef(VkFlags, "VkDependencyFlags")
val VkCommandPoolCreateFlags = typedef(VkFlags, "VkCommandPoolCreateFlags")
val VkCommandPoolResetFlags = typedef(VkFlags, "VkCommandPoolResetFlags")
val VkCommandBufferUsageFlags = typedef(VkFlags, "VkCommandBufferUsageFlags")
val VkQueryControlFlags = typedef(VkFlags, "VkQueryControlFlags")
val VkCommandBufferResetFlags = typedef(VkFlags, "VkCommandBufferResetFlags")
val VkStencilFaceFlags = typedef(VkFlags, "VkStencilFaceFlags")

// Function pointer types
val PFN_vkAllocationFunction = "PFN_vkAllocationFunction".callback(
    VULKAN_PACKAGE, void_p, "VkAllocationFunction",
    "Application-defined memory allocation function.",

    opaque_p.IN("pUserData", "the value specified for ##VkAllocationCallbacks{@code ::pUserData} in the allocator specified by the application."),
    size_t.IN("size", "the size in bytes of the requested allocation."),
    size_t.IN("alignment", "the requested alignment of the allocation in bytes and <b>must</b> be a power of two."),
    VkSystemAllocationScope.IN("allocationScope", "a {@code VkSystemAllocationScope} value specifying the allocation scope of the lifetime of the allocation, as described <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-host-allocation-scope\">here</a>.")
) {
    documentation =
        """
        Application-defined memory allocation function.

        <h5>C Specification</h5>
        The type of {@code pfnAllocation} is:

        <code><pre>
￿typedef void* (VKAPI_PTR *PFN_vkAllocationFunction)(
￿    void*                                       pUserData,
￿    size_t                                      size,
￿    size_t                                      alignment,
￿    VkSystemAllocationScope                     allocationScope);</pre></code>

        <h5>Description</h5>
        If {@code pfnAllocation} is unable to allocate the requested memory, it <b>must</b> return {@code NULL}. If the allocation was successful, it <b>must</b> return a valid pointer to memory allocation containing at least {@code size} bytes, and with the pointer value being a multiple of {@code alignment}.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Correct Vulkan operation <b>cannot</b> be assumed if the application does not follow these rules.

        For example, {@code pfnAllocation} (or {@code pfnReallocation}) could cause termination of running Vulkan instance(s) on a failed allocation for debugging purposes, either directly or indirectly. In these circumstances, it <b>cannot</b> be assumed that any part of any affected VkInstance objects are going to operate correctly (even #DestroyInstance()), and the application <b>must</b> ensure it cleans up properly via other means (e.g. process termination).
        </div>

        If {@code pfnAllocation} returns {@code NULL}, and if the implementation is unable to continue correct processing of the current command without the requested allocation, it <b>must</b> treat this as a run-time error, and generate #ERROR_OUT_OF_HOST_MEMORY at the appropriate time for the command in which the condition was detected, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#fundamentals-errorcodes">Return Codes</a>.

        If the implementation is able to continue correct processing of the current command without the requested allocation, then it <b>may</b> do so, and <b>must</b> not generate #ERROR_OUT_OF_HOST_MEMORY as a result of this failed allocation.

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """
    useSystemCallConvention()
}

val PFN_vkReallocationFunction = "PFN_vkReallocationFunction".callback(
    VULKAN_PACKAGE, void_p, "VkReallocationFunction",
    "Application-defined memory reallocation function.",

    opaque_p.IN("pUserData", "the value specified for ##VkAllocationCallbacks{@code ::pUserData} in the allocator specified by the application."),
    opaque_p.IN("pOriginal", "<b>must</b> be either {@code NULL} or a pointer previously returned by {@code pfnReallocation} or {@code pfnAllocation} of the same allocator."),
    size_t.IN("size", "the size in bytes of the requested allocation."),
    size_t.IN("alignment", "the requested alignment of the allocation in bytes and <b>must</b> be a power of two."),
    VkSystemAllocationScope.IN("allocationScope", "a {@code VkSystemAllocationScope} value specifying the allocation scope of the lifetime of the allocation, as described <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-host-allocation-scope\">here</a>.")
) {
    documentation =
        """
        Application-defined memory reallocation function.

        <h5>C Specification</h5>
        The type of {@code pfnReallocation} is:

        <code><pre>
￿typedef void* (VKAPI_PTR *PFN_vkReallocationFunction)(
￿    void*                                       pUserData,
￿    void*                                       pOriginal,
￿    size_t                                      size,
￿    size_t                                      alignment,
￿    VkSystemAllocationScope                     allocationScope);</pre></code>

        <h5>Description</h5>
        {@code pfnReallocation} <b>must</b> return an allocation with enough space for {@code size} bytes, and the contents of the original allocation from bytes zero to <code>min(original size, new size) - 1</code> <b>must</b> be preserved in the returned allocation. If {@code size} is larger than the old size, the contents of the additional space are undefined. If satisfying these requirements involves creating a new allocation, then the old allocation <b>should</b> be freed.

        If {@code pOriginal} is {@code NULL}, then {@code pfnReallocation} <b>must</b> behave equivalently to a call to ##VkAllocationFunction with the same parameter values (without {@code pOriginal}).

        If {@code size} is zero, then {@code pfnReallocation} <b>must</b> behave equivalently to a call to ##VkFreeFunction with the same {@code pUserData} parameter value, and {@code pMemory} equal to {@code pOriginal}.

        If {@code pOriginal} is non-{@code NULL}, the implementation <b>must</b> ensure that {@code alignment} is equal to the {@code alignment} used to originally allocate {@code pOriginal}.

        If this function fails and {@code pOriginal} is non-{@code NULL} the application <b>must</b> not free the old allocation.

        {@code pfnReallocation} <b>must</b> follow the same <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkAllocationFunction_return_rules">rules for return values as tname:PFN_vkAllocationFunction</a>.

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """
    useSystemCallConvention()
}

val PFN_vkFreeFunction = "PFN_vkFreeFunction".callback(
    VULKAN_PACKAGE, void, "VkFreeFunction",
    "Application-defined memory free function.",

    opaque_p.IN("pUserData", "the value specified for ##VkAllocationCallbacks{@code ::pUserData} in the allocator specified by the application."),
    opaque_p.IN("pMemory", "the allocation to be freed.")
) {
    documentation =
        """
        Application-defined memory free function.

        <h5>C Specification</h5>
        The type of {@code pfnFree} is:

        <code><pre>
￿typedef void (VKAPI_PTR *PFN_vkFreeFunction)(
￿    void*                                       pUserData,
￿    void*                                       pMemory);</pre></code>

        <h5>Description</h5>
        {@code pMemory} <b>may</b> be {@code NULL}, which the callback <b>must</b> handle safely. If {@code pMemory} is non-{@code NULL}, it <b>must</b> be a pointer previously allocated by {@code pfnAllocation} or {@code pfnReallocation}. The application <b>should</b> free this memory.

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """
    useSystemCallConvention()
}

val PFN_vkInternalAllocationNotification = "PFN_vkInternalAllocationNotification".callback(
    VULKAN_PACKAGE, void, "VkInternalAllocationNotification",
    "Application-defined memory allocation notification function.",

    opaque_p.IN("pUserData", "the value specified for ##VkAllocationCallbacks{@code ::pUserData} in the allocator specified by the application."),
    size_t.IN("size", "the requested size of an allocation."),
    VkInternalAllocationType.IN("allocationType", "a {@code VkInternalAllocationType} value specifying the requested type of an allocation."),
    VkSystemAllocationScope.IN("allocationScope", "a {@code VkSystemAllocationScope} value specifying the allocation scope of the lifetime of the allocation, as described <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-host-allocation-scope\">here</a>.")
) {
    documentation =
        """
        Application-defined memory allocation notification function.

        <h5>C Specification</h5>
        The type of {@code pfnInternalAllocation} is:

        <code><pre>
￿typedef void (VKAPI_PTR *PFN_vkInternalAllocationNotification)(
￿    void*                                       pUserData,
￿    size_t                                      size,
￿    VkInternalAllocationType                    allocationType,
￿    VkSystemAllocationScope                     allocationScope);</pre></code>

        <h5>Description</h5>
        This is a purely informational callback.

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """
    useSystemCallConvention()
}

val PFN_vkInternalFreeNotification = "PFN_vkInternalFreeNotification".callback(
    VULKAN_PACKAGE, void, "VkInternalFreeNotification",
    "Application-defined memory free notification function.",

    opaque_p.IN("pUserData", "the value specified for ##VkAllocationCallbacks{@code ::pUserData} in the allocator specified by the application."),
    size_t.IN("size", "the requested size of an allocation."),
    VkInternalAllocationType.IN("allocationType", "a {@code VkInternalAllocationType} value specifying the requested type of an allocation."),
    VkSystemAllocationScope.IN("allocationScope", "a {@code VkSystemAllocationScope} value specifying the allocation scope of the lifetime of the allocation, as described <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-host-allocation-scope\">here</a>.")
) {
    documentation =
        """
        Application-defined memory free notification function.

        <h5>C Specification</h5>
        The type of {@code pfnInternalFree} is:

        <code><pre>
￿typedef void (VKAPI_PTR *PFN_vkInternalFreeNotification)(
￿    void*                                       pUserData,
￿    size_t                                      size,
￿    VkInternalAllocationType                    allocationType,
￿    VkSystemAllocationScope                     allocationScope);</pre></code>

        

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """
    useSystemCallConvention()
}

// Struct types
val VkApplicationInfo = struct(VULKAN_PACKAGE, "VkApplicationInfo") {
    documentation =
        """
        Structure specifying application info.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_APPLICATION_INFO</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>If {@code pApplicationName} is not {@code NULL}, {@code pApplicationName} <b>must</b> be a null-terminated UTF-8 string</li>
            <li>If {@code pEngineName} is not {@code NULL}, {@code pEngineName} <b>must</b> be a null-terminated UTF-8 string</li>
        </ul>

        <h5>See Also</h5>
        ##VkInstanceCreateInfo
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    nullable..const..charUTF8_p.member("pApplicationName", "a pointer to a null-terminated UTF-8 string containing the name of the application.")
    uint32_t.member("applicationVersion", "an unsigned integer variable containing the developer-supplied version number of the application.")
    nullable..const..charUTF8_p.member("pEngineName", "a pointer to a null-terminated UTF-8 string containing the name of the engine (if any) used to create the application.")
    uint32_t.member("engineVersion", "an unsigned integer variable containing the developer-supplied version number of the engine used to create the application.")
    uint32_t.member("apiVersion", "the version of the Vulkan API against which the application expects to run, encoded as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#fundamentals-versionnum\">API Version Numbers and Semantics</a> section. If {@code apiVersion} is 0 the implementation <b>must</b> ignore it, otherwise if the implementation does not support the requested {@code apiVersion}, or an effective substitute for {@code apiVersion}, it <b>must</b> return #ERROR_INCOMPATIBLE_DRIVER. The patch version number specified in {@code apiVersion} is ignored when creating an instance object. Only the major and minor versions of the instance <b>must</b> match those requested in {@code apiVersion}.")
}

val VkInstanceCreateInfo = struct(VULKAN_PACKAGE, "VkInstanceCreateInfo") {
    documentation =
        """
        Structure specifying parameters of a newly created instance.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_INSTANCE_CREATE_INFO</li>
            <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of ##VkDebugReportCallbackCreateInfoEXT</li>
            <li>{@code flags} <b>must</b> be 0</li>
            <li>If {@code pApplicationInfo} is not {@code NULL}, {@code pApplicationInfo} <b>must</b> be a pointer to a valid ##VkApplicationInfo structure</li>
            <li>If {@code enabledLayerCount} is not 0, {@code ppEnabledLayerNames} <b>must</b> be a pointer to an array of {@code enabledLayerCount} null-terminated UTF-8 strings</li>
            <li>If {@code enabledExtensionCount} is not 0, {@code ppEnabledExtensionNames} <b>must</b> be a pointer to an array of {@code enabledExtensionCount} null-terminated UTF-8 strings</li>
        </ul>

        <h5>See Also</h5>
        ##VkApplicationInfo, #CreateInstance()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkInstanceCreateFlags.member("flags", "reserved for future use.")
    nullable..const..VkApplicationInfo.p.member("pApplicationInfo", "{@code NULL} or a pointer to an instance of ##VkApplicationInfo. If not {@code NULL}, this information helps implementations recognize behavior inherent to classes of applications. ##VkApplicationInfo is defined in detail below.")
    AutoSize("ppEnabledLayerNames", optional = true)..uint32_t.member("enabledLayerCount", "the number of global layers to enable.")
    const..charUTF8_p_const_p.member("ppEnabledLayerNames", "a pointer to an array of {@code enabledLayerCount} null-terminated UTF-8 strings containing the names of layers to enable for the created instance. See the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#extended-functionality-layers\">Layers</a> section for further details.")
    AutoSize("ppEnabledExtensionNames", optional = true)..uint32_t.member("enabledExtensionCount", "the number of global extensions to enable.")
    const..charUTF8_p_const_p.member("ppEnabledExtensionNames", "a pointer to an array of {@code enabledExtensionCount} null-terminated UTF-8 strings containing the names of extensions to enable.")
}

val VkAllocationCallbacks = struct(VULKAN_PACKAGE, "VkAllocationCallbacks") {
    documentation =
        """
        Structure containing callback function pointers for memory allocation.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code pfnAllocation} <b>must</b> be a pointer to a valid user-defined ##VkAllocationFunction</li>
            <li>{@code pfnReallocation} <b>must</b> be a pointer to a valid user-defined ##VkReallocationFunction</li>
            <li>{@code pfnFree} <b>must</b> be a pointer to a valid user-defined ##VkFreeFunction</li>
            <li>If either of {@code pfnInternalAllocation} or {@code pfnInternalFree} is not {@code NULL}, both <b>must</b> be valid callbacks</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationFunction, ##VkFreeFunction, ##VkInternalAllocationNotification, ##VkInternalFreeNotification, ##VkReallocationFunction, #AllocateMemory(), #CreateAndroidSurfaceKHR(), #CreateBuffer(), #CreateBufferView(), #CreateCommandPool(), #CreateComputePipelines(), #CreateDebugReportCallbackEXT(), #CreateDescriptorPool(), #CreateDescriptorSetLayout(), #CreateDescriptorUpdateTemplateKHR(), #CreateDevice(), #CreateDisplayModeKHR(), #CreateDisplayPlaneSurfaceKHR(), #CreateEvent(), #CreateFence(), #CreateFramebuffer(), #CreateGraphicsPipelines(), #CreateIOSSurfaceMVK(), #CreateImage(), #CreateImageView(), #CreateIndirectCommandsLayoutNVX(), #CreateInstance(), #CreateMacOSSurfaceMVK(), #CreateMirSurfaceKHR(), #CreateObjectTableNVX(), #CreatePipelineCache(), #CreatePipelineLayout(), #CreateQueryPool(), #CreateRenderPass(), #CreateSampler(), #CreateSemaphore(), #CreateShaderModule(), #CreateSharedSwapchainsKHR(), #CreateSwapchainKHR(), #CreateViSurfaceNN(), #CreateWaylandSurfaceKHR(), #CreateWin32SurfaceKHR(), #CreateXcbSurfaceKHR(), #CreateXlibSurfaceKHR(), #DestroyBuffer(), #DestroyBufferView(), #DestroyCommandPool(), #DestroyDebugReportCallbackEXT(), #DestroyDescriptorPool(), #DestroyDescriptorSetLayout(), #DestroyDescriptorUpdateTemplateKHR(), #DestroyDevice(), #DestroyEvent(), #DestroyFence(), #DestroyFramebuffer(), #DestroyImage(), #DestroyImageView(), #DestroyIndirectCommandsLayoutNVX(), #DestroyInstance(), #DestroyObjectTableNVX(), #DestroyPipeline(), #DestroyPipelineCache(), #DestroyPipelineLayout(), #DestroyQueryPool(), #DestroyRenderPass(), #DestroySampler(), #DestroySemaphore(), #DestroyShaderModule(), #DestroySurfaceKHR(), #DestroySwapchainKHR(), #FreeMemory(), #RegisterDeviceEventEXT(), #RegisterDisplayEventEXT()
        """

    nullable..opaque_p.member("pUserData", "a value to be interpreted by the implementation of the callbacks. When any of the callbacks in ##VkAllocationCallbacks are called, the Vulkan implementation will pass this value as the first parameter to the callback. This value <b>can</b> vary each time an allocator is passed into a command, even when the same object takes an allocator in multiple commands.")
    PFN_vkAllocationFunction.member("pfnAllocation", "a pointer to an application-defined memory allocation function of type ##VkAllocationFunction.")
    PFN_vkReallocationFunction.member("pfnReallocation", "a pointer to an application-defined memory reallocation function of type ##VkReallocationFunction.")
    PFN_vkFreeFunction.member("pfnFree", "a pointer to an application-defined memory free function of type ##VkFreeFunction.")
    nullable..PFN_vkInternalAllocationNotification.member("pfnInternalAllocation", "a pointer to an application-defined function that is called by the implementation when the implementation makes internal allocations, and it is of type ##VkInternalAllocationNotification.")
    nullable..PFN_vkInternalFreeNotification.member("pfnInternalFree", "a pointer to an application-defined function that is called by the implementation when the implementation frees internal allocations, and it is of type ##VkInternalFreeNotification.")
}

val VkPhysicalDeviceFeatures = struct(VULKAN_PACKAGE, "VkPhysicalDeviceFeatures") {
    documentation =
        """
        Structure describing the fine-grained features that can be supported by an implementation.

        <h5>Description</h5>
        <ul>
            <li>
                {@code robustBufferAccess} indicates that accesses to buffers are bounds-checked against the range of the buffer descriptor (as determined by ##VkDescriptorBufferInfo{@code ::range}, ##VkBufferViewCreateInfo{@code ::range}, or the size of the buffer). Out of bounds accesses <b>must</b> not cause application termination, and the effects of shader loads, stores, and atomics <b>must</b> conform to an implementation-dependent behavior as described below.
                <ul>
                    <li>
                        A buffer access is considered to be out of bounds if any of the following are true:
                        <ul>
                            <li>The pointer was formed by {@code OpImageTexelPointer} and the coordinate is less than zero or greater than or equal to the number of whole elements in the bound range.</li>
                            <li>
                                The pointer was not formed by {@code OpImageTexelPointer} and the object pointed to is not wholly contained within the bound range.
                                <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        If a SPIR-V {@code OpLoad} instruction loads a structure and the tail end of the structure is out of bounds, then all members of the structure are considered out of bounds even if the members at the end are not statically used.
                                </div>
                            </li>
                            <li>If any buffer access in a given SPIR-V block is determined to be out of bounds, then any other access of the same type (load, store, or atomic) in the same SPIR-V block that accesses an address less than 16 bytes away from the out of bounds address <b>may</b> also be considered out of bounds.</li>
                        </ul>
                    </li>
                    <li>
                        Out-of-bounds buffer loads will return any of the following values:
                        <ul>
                            <li>Values from anywhere within the memory range(s) bound to the buffer (possibly including bytes of memory past the end of the buffer, up to the end of the bound range).</li>
                            <li>
                                Zero values, or <code>(0,0,0,x)</code> vectors for vector reads where x is a valid value represented in the type of the vector components and <b>may</b> be any of:
                                <ul>
                                    <li>0, 1, or the maximum representable positive integer value, for signed or unsigned integer components</li>
                                    <li>0.0 or 1.0, for floating-point components</li>
                                </ul>
                            </li>
                        </ul>
                    </li>
                    <li>Out-of-bounds writes <b>may</b> modify values within the memory range(s) bound to the buffer, but <b>must</b> not modify any other memory.</li>
                    <li>Out-of-bounds atomics <b>may</b> modify values within the memory range(s) bound to the buffer, but <b>must</b> not modify any other memory, and return an undefined value.</li>
                    <li>
                        Vertex input attributes are considered out of bounds if the address of the attribute plus the size of the attribute is greater than the size of the bound buffer. Further, if any vertex input attribute using a specific vertex input binding is out of bounds, then all vertex input attributes using that vertex input binding for that vertex shader invocation are considered out of bounds.
                        <ul>
                            <li>
                                If a vertex input attribute is out of bounds, it will be assigned one of the following values:
                                <ul>
                                    <li>Values from anywhere within the memory range(s) bound to the buffer, converted according to the format of the attribute.</li>
                                    <li>Zero values, format converted according to the format of the attribute.</li>
                                    <li>Zero values, or <code>(0,0,0,x)</code> vectors, as described above.</li>
                                </ul>
                            </li>
                        </ul>
                    </li>
                    <li>If {@code robustBufferAccess} is not enabled, out of bounds accesses <b>may</b> corrupt any memory within the process and cause undefined behavior up to and including application termination.</li>
                </ul>
            </li>
            <li>{@code fullDrawIndexUint32} indicates the full 32-bit range of indices is supported for indexed draw calls when using a {@code VkIndexType} of #INDEX_TYPE_UINT32. {@code maxDrawIndexedIndexValue} is the maximum index value that <b>may</b> be used (aside from the primitive restart index, which is always 2<sup>32</sup>-1 when the {@code VkIndexType} is #INDEX_TYPE_UINT32). If this feature is supported, {@code maxDrawIndexedIndexValue} <b>must</b> be 2<sup>32</sup>-1; otherwise it <b>must</b> be no smaller than 2<sup>24</sup>-1. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-limits-maxDrawIndexedIndexValue">maxDrawIndexedIndexValue</a>.</li>
            <li>{@code imageCubeArray} indicates whether image views with a {@code VkImageViewType} of #IMAGE_VIEW_TYPE_CUBE_ARRAY <b>can</b> be created, and that the corresponding {@code SampledCubeArray} and {@code ImageCubeArray} SPIR-V capabilities <b>can</b> be used in shader code.</li>
            <li>{@code independentBlend} indicates whether the ##VkPipelineColorBlendAttachmentState settings are controlled independently per-attachment. If this feature is not enabled, the ##VkPipelineColorBlendAttachmentState settings for all color attachments <b>must</b> be identical. Otherwise, a different ##VkPipelineColorBlendAttachmentState <b>can</b> be provided for each bound color attachment.</li>
            <li>{@code geometryShader} indicates whether geometry shaders are supported. If this feature is not enabled, the #SHADER_STAGE_GEOMETRY_BIT and #PIPELINE_STAGE_GEOMETRY_SHADER_BIT enum values <b>must</b> not be used. This also indicates whether shader modules <b>can</b> declare the {@code Geometry} capability.</li>
            <li>{@code tessellationShader} indicates whether tessellation control and evaluation shaders are supported. If this feature is not enabled, the #SHADER_STAGE_TESSELLATION_CONTROL_BIT, #SHADER_STAGE_TESSELLATION_EVALUATION_BIT, #PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT, #PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT, and #STRUCTURE_TYPE_PIPELINE_TESSELLATION_STATE_CREATE_INFO enum values <b>must</b> not be used. This also indicates whether shader modules <b>can</b> declare the {@code Tessellation} capability.</li>
            <li>{@code sampleRateShading} indicates whether per-sample shading and multisample interpolation are supported. If this feature is not enabled, the {@code sampleShadingEnable} member of the ##VkPipelineMultisampleStateCreateInfo structure <b>must</b> be set to #FALSE and the {@code minSampleShading} member is ignored. This also indicates whether shader modules <b>can</b> declare the {@code SampleRateShading} capability.</li>
            <li>{@code dualSrcBlend} indicates whether blend operations which take two sources are supported. If this feature is not enabled, the #BLEND_FACTOR_SRC1_COLOR, #BLEND_FACTOR_ONE_MINUS_SRC1_COLOR, #BLEND_FACTOR_SRC1_ALPHA, and #BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA enum values <b>must</b> not be used as source or destination blending factors. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#framebuffer-dsb">the “Dual-Source Blending” section</a>.</li>
            <li>{@code logicOp} indicates whether logic operations are supported. If this feature is not enabled, the {@code logicOpEnable} member of the ##VkPipelineColorBlendStateCreateInfo structure <b>must</b> be set to #FALSE, and the {@code logicOp} member is ignored.</li>
            <li>{@code multiDrawIndirect} indicates whether multiple draw indirect is supported. If this feature is not enabled, the {@code drawCount} parameter to the #CmdDrawIndirect() and #CmdDrawIndexedIndirect() commands <b>must</b> be 0 or 1. The {@code maxDrawIndirectCount} member of the ##VkPhysicalDeviceLimits structure <b>must</b> also be 1 if this feature is not supported. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-limits-maxDrawIndirectCount">maxDrawIndirectCount</a>.</li>
            <li>{@code drawIndirectFirstInstance} indicates whether indirect draw calls support the {@code firstInstance} parameter. If this feature is not enabled, the {@code firstInstance} member of all ##VkDrawIndirectCommand and ##VkDrawIndexedIndirectCommand structures that are provided to the #CmdDrawIndirect() and #CmdDrawIndexedIndirect() commands <b>must</b> be 0.</li>
            <li>{@code depthClamp} indicates whether depth clamping is supported. If this feature is not enabled, the {@code depthClampEnable} member of the ##VkPipelineRasterizationStateCreateInfo structure <b>must</b> be set to #FALSE. Otherwise, setting {@code depthClampEnable} to #TRUE will enable depth clamping.</li>
            <li>{@code depthBiasClamp} indicates whether depth bias clamping is supported. If this feature is not enabled, the {@code depthBiasClamp} member of the ##VkPipelineRasterizationStateCreateInfo structure <b>must</b> be set to 0.0 unless the #DYNAMIC_STATE_DEPTH_BIAS dynamic state is enabled, and the {@code depthBiasClamp} parameter to #CmdSetDepthBias() <b>must</b> be set to 0.0.</li>
            <li>{@code fillModeNonSolid} indicates whether point and wireframe fill modes are supported. If this feature is not enabled, the #POLYGON_MODE_POINT and #POLYGON_MODE_LINE enum values <b>must</b> not be used.</li>
            <li>{@code depthBounds} indicates whether depth bounds tests are supported. If this feature is not enabled, the {@code depthBoundsTestEnable} member of the ##VkPipelineDepthStencilStateCreateInfo structure <b>must</b> be set to #FALSE. When {@code depthBoundsTestEnable} is set to #FALSE, the {@code minDepthBounds} and {@code maxDepthBounds} members of the ##VkPipelineDepthStencilStateCreateInfo structure are ignored.</li>
            <li>{@code wideLines} indicates whether lines with width other than 1.0 are supported. If this feature is not enabled, the {@code lineWidth} member of the ##VkPipelineRasterizationStateCreateInfo structure <b>must</b> be set to 1.0 unless the #DYNAMIC_STATE_LINE_WIDTH dynamic state is enabled, and the {@code lineWidth} parameter to #CmdSetLineWidth() <b>must</b> be set to 1.0. When this feature is supported, the range and granularity of supported line widths are indicated by the {@code lineWidthRange} and {@code lineWidthGranularity} members of the ##VkPhysicalDeviceLimits structure, respectively.</li>
            <li>{@code largePoints} indicates whether points with size greater than 1.0 are supported. If this feature is not enabled, only a point size of 1.0 written by a shader is supported. The range and granularity of supported point sizes are indicated by the {@code pointSizeRange} and {@code pointSizeGranularity} members of the ##VkPhysicalDeviceLimits structure, respectively.</li>
            <li>{@code alphaToOne} indicates whether the implementation is able to replace the alpha value of the color fragment output from the fragment shader with the maximum representable alpha value for fixed-point colors or 1.0 for floating-point colors. If this feature is not enabled, then the {@code alphaToOneEnable} member of the ##VkPipelineMultisampleStateCreateInfo structure <b>must</b> be set to #FALSE. Otherwise setting {@code alphaToOneEnable} to #TRUE will enable alpha-to-one behavior.</li>
            <li>{@code multiViewport} indicates whether more than one viewport is supported. If this feature is not enabled, the {@code viewportCount} and {@code scissorCount} members of the ##VkPipelineViewportStateCreateInfo structure <b>must</b> be set to 1. Similarly, the {@code viewportCount} parameter to the #CmdSetViewport() command and the {@code scissorCount} parameter to the #CmdSetScissor() command <b>must</b> be 1, and the {@code firstViewport} parameter to the #CmdSetViewport() command and the {@code firstScissor} parameter to the #CmdSetScissor() command <b>must</b> be 0.</li>
            <li>{@code samplerAnisotropy} indicates whether anisotropic filtering is supported. If this feature is not enabled, the {@code maxAnisotropy} member of the ##VkSamplerCreateInfo structure <b>must</b> be 1.0.</li>
            <li>
                {@code textureCompressionETC2} indicates whether all of the ETC2 and EAC compressed texture formats are supported. If this feature is enabled, then the #FORMAT_FEATURE_SAMPLED_IMAGE_BIT, #FORMAT_FEATURE_BLIT_SRC_BIT and #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT features <b>must</b> be supported in {@code optimalTilingFeatures} for the following formats:
                <ul>
                    <li>#FORMAT_ETC2_R8G8B8_UNORM_BLOCK</li>
                    <li>#FORMAT_ETC2_R8G8B8_SRGB_BLOCK</li>
                    <li>#FORMAT_ETC2_R8G8B8A1_UNORM_BLOCK</li>
                    <li>#FORMAT_ETC2_R8G8B8A1_SRGB_BLOCK</li>
                    <li>#FORMAT_ETC2_R8G8B8A8_UNORM_BLOCK</li>
                    <li>#FORMAT_ETC2_R8G8B8A8_SRGB_BLOCK</li>
                    <li>#FORMAT_EAC_R11_UNORM_BLOCK</li>
                    <li>#FORMAT_EAC_R11_SNORM_BLOCK</li>
                    <li>#FORMAT_EAC_R11G11_UNORM_BLOCK</li>
                    <li>#FORMAT_EAC_R11G11_SNORM_BLOCK</li>
                </ul>

                #GetPhysicalDeviceFormatProperties() and #GetPhysicalDeviceImageFormatProperties() <b>can</b> be used to check for additional supported properties of individual formats.
            </li>
            <li>
                {@code textureCompressionASTC_LDR} indicates whether all of the ASTC LDR compressed texture formats are supported. If this feature is enabled, then the #FORMAT_FEATURE_SAMPLED_IMAGE_BIT, #FORMAT_FEATURE_BLIT_SRC_BIT and #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT features <b>must</b> be supported in {@code optimalTilingFeatures} for the following formats:
                <ul>
                    <li>#FORMAT_ASTC_4x4_UNORM_BLOCK</li>
                    <li>#FORMAT_ASTC_4x4_SRGB_BLOCK</li>
                    <li>#FORMAT_ASTC_5x4_UNORM_BLOCK</li>
                    <li>#FORMAT_ASTC_5x4_SRGB_BLOCK</li>
                    <li>#FORMAT_ASTC_5x5_UNORM_BLOCK</li>
                    <li>#FORMAT_ASTC_5x5_SRGB_BLOCK</li>
                    <li>#FORMAT_ASTC_6x5_UNORM_BLOCK</li>
                    <li>#FORMAT_ASTC_6x5_SRGB_BLOCK</li>
                    <li>#FORMAT_ASTC_6x6_UNORM_BLOCK</li>
                    <li>#FORMAT_ASTC_6x6_SRGB_BLOCK</li>
                    <li>#FORMAT_ASTC_8x5_UNORM_BLOCK</li>
                    <li>#FORMAT_ASTC_8x5_SRGB_BLOCK</li>
                    <li>#FORMAT_ASTC_8x6_UNORM_BLOCK</li>
                    <li>#FORMAT_ASTC_8x6_SRGB_BLOCK</li>
                    <li>#FORMAT_ASTC_8x8_UNORM_BLOCK</li>
                    <li>#FORMAT_ASTC_8x8_SRGB_BLOCK</li>
                    <li>#FORMAT_ASTC_10x5_UNORM_BLOCK</li>
                    <li>#FORMAT_ASTC_10x5_SRGB_BLOCK</li>
                    <li>#FORMAT_ASTC_10x6_UNORM_BLOCK</li>
                    <li>#FORMAT_ASTC_10x6_SRGB_BLOCK</li>
                    <li>#FORMAT_ASTC_10x8_UNORM_BLOCK</li>
                    <li>#FORMAT_ASTC_10x8_SRGB_BLOCK</li>
                    <li>#FORMAT_ASTC_10x10_UNORM_BLOCK</li>
                    <li>#FORMAT_ASTC_10x10_SRGB_BLOCK</li>
                    <li>#FORMAT_ASTC_12x10_UNORM_BLOCK</li>
                    <li>#FORMAT_ASTC_12x10_SRGB_BLOCK</li>
                    <li>#FORMAT_ASTC_12x12_UNORM_BLOCK</li>
                    <li>#FORMAT_ASTC_12x12_SRGB_BLOCK</li>
                </ul>

                #GetPhysicalDeviceFormatProperties() and #GetPhysicalDeviceImageFormatProperties() <b>can</b> be used to check for additional supported properties of individual formats.
            </li>
            <li>
                {@code textureCompressionBC} indicates whether all of the BC compressed texture formats are supported. If this feature is enabled, then the #FORMAT_FEATURE_SAMPLED_IMAGE_BIT, #FORMAT_FEATURE_BLIT_SRC_BIT and #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT features <b>must</b> be supported in {@code optimalTilingFeatures} for the following formats:
                <ul>
                    <li>#FORMAT_BC1_RGB_UNORM_BLOCK</li>
                    <li>#FORMAT_BC1_RGB_SRGB_BLOCK</li>
                    <li>#FORMAT_BC1_RGBA_UNORM_BLOCK</li>
                    <li>#FORMAT_BC1_RGBA_SRGB_BLOCK</li>
                    <li>#FORMAT_BC2_UNORM_BLOCK</li>
                    <li>#FORMAT_BC2_SRGB_BLOCK</li>
                    <li>#FORMAT_BC3_UNORM_BLOCK</li>
                    <li>#FORMAT_BC3_SRGB_BLOCK</li>
                    <li>#FORMAT_BC4_UNORM_BLOCK</li>
                    <li>#FORMAT_BC4_SNORM_BLOCK</li>
                    <li>#FORMAT_BC5_UNORM_BLOCK</li>
                    <li>#FORMAT_BC5_SNORM_BLOCK</li>
                    <li>#FORMAT_BC6H_UFLOAT_BLOCK</li>
                    <li>#FORMAT_BC6H_SFLOAT_BLOCK</li>
                    <li>#FORMAT_BC7_UNORM_BLOCK</li>
                    <li>#FORMAT_BC7_SRGB_BLOCK</li>
                </ul>

                #GetPhysicalDeviceFormatProperties() and #GetPhysicalDeviceImageFormatProperties() <b>can</b> be used to check for additional supported properties of individual formats.
            </li>
            <li>{@code occlusionQueryPrecise} indicates whether occlusion queries returning actual sample counts are supported. Occlusion queries are created in a {@code VkQueryPool} by specifying the {@code queryType} of #QUERY_TYPE_OCCLUSION in the ##VkQueryPoolCreateInfo structure which is passed to #CreateQueryPool(). If this feature is enabled, queries of this type <b>can</b> enable #QUERY_CONTROL_PRECISE_BIT in the {@code flags} parameter to #CmdBeginQuery(). If this feature is not supported, the implementation supports only boolean occlusion queries. When any samples are passed, boolean queries will return a non-zero result value, otherwise a result value of zero is returned. When this feature is enabled and #QUERY_CONTROL_PRECISE_BIT is set, occlusion queries will report the actual number of samples passed.</li>
            <li>{@code pipelineStatisticsQuery} indicates whether the pipeline statistics queries are supported. If this feature is not enabled, queries of type #QUERY_TYPE_PIPELINE_STATISTICS <b>cannot</b> be created, and none of the {@code VkQueryPipelineStatisticFlagBits} bits <b>can</b> be set in the {@code pipelineStatistics} member of the ##VkQueryPoolCreateInfo structure.</li>
            <li>{@code vertexPipelineStoresAndAtomics} indicates whether storage buffers and images support stores and atomic operations in the vertex, tessellation, and geometry shader stages. If this feature is not enabled, all storage image, storage texel buffers, and storage buffer variables used by these stages in shader modules <b>must</b> be decorated with the {@code NonWriteable} decoration (or the {@code readonly} memory qualifier in GLSL).</li>
            <li>{@code fragmentStoresAndAtomics} indicates whether storage buffers and images support stores and atomic operations in the fragment shader stage. If this feature is not enabled, all storage image, storage texel buffers, and storage buffer variables used by the fragment stage in shader modules <b>must</b> be decorated with the {@code NonWriteable} decoration (or the {@code readonly} memory qualifier in GLSL).</li>
            <li>{@code shaderTessellationAndGeometryPointSize} indicates whether the {@code PointSize} built-in decoration is available in the tessellation control, tessellation evaluation, and geometry shader stages. If this feature is not enabled, members decorated with the {@code PointSize} built-in decoration <b>must</b> not be read from or written to and all points written from a tessellation or geometry shader will have a size of 1.0. This also indicates whether shader modules <b>can</b> declare the {@code TessellationPointSize} capability for tessellation control and evaluation shaders, or if the shader modules <b>can</b> declare the {@code GeometryPointSize} capability for geometry shaders. An implementation supporting this feature <b>must</b> also support one or both of the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-tessellationShader">{@code tessellationShader}</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-geometryShader">{@code geometryShader}</a> features.</li>
            <li>{@code shaderImageGatherExtended} indicates whether the extended set of image gather instructions are available in shader code. If this feature is not enabled, the {@code OpImage}*{@code Gather} instructions do not support the {@code Offset} and {@code ConstOffsets} operands. This also indicates whether shader modules <b>can</b> declare the {@code ImageGatherExtended} capability.</li>
            <li>{@code shaderStorageImageExtendedFormats} indicates whether the extended storage image formats are available in shader code. If this feature is not enabled, the formats requiring the {@code StorageImageExtendedFormats} capability are not supported for storage images. This also indicates whether shader modules <b>can</b> declare the {@code StorageImageExtendedFormats} capability.</li>
            <li>{@code shaderStorageImageMultisample} indicates whether multisampled storage images are supported. If this feature is not enabled, images that are created with a {@code usage} that includes #IMAGE_USAGE_STORAGE_BIT <b>must</b> be created with {@code samples} equal to #SAMPLE_COUNT_1_BIT. This also indicates whether shader modules <b>can</b> declare the {@code StorageImageMultisample} capability.</li>
            <li>{@code shaderStorageImageReadWithoutFormat} indicates whether storage images require a format qualifier to be specified when reading from storage images. If this feature is not enabled, the {@code OpImageRead} instruction <b>must</b> not have an {@code OpTypeImage} of {@code Unknown}. This also indicates whether shader modules <b>can</b> declare the {@code StorageImageReadWithoutFormat} capability.</li>
            <li>{@code shaderStorageImageWriteWithoutFormat} indicates whether storage images require a format qualifier to be specified when writing to storage images. If this feature is not enabled, the {@code OpImageWrite} instruction <b>must</b> not have an {@code OpTypeImage} of {@code Unknown}. This also indicates whether shader modules <b>can</b> declare the {@code StorageImageWriteWithoutFormat} capability.</li>
            <li>{@code shaderUniformBufferArrayDynamicIndexing} indicates whether arrays of uniform buffers <b>can</b> be indexed by <em>dynamically uniform</em> integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of #DESCRIPTOR_TYPE_UNIFORM_BUFFER or #DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC <b>must</b> be indexed only by constant integral expressions when aggregated into arrays in shader code. This also indicates whether shader modules <b>can</b> declare the {@code UniformBufferArrayDynamicIndexing} capability.</li>
            <li>{@code shaderSampledImageArrayDynamicIndexing} indicates whether arrays of samplers or sampled images <b>can</b> be indexed by dynamically uniform integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of #DESCRIPTOR_TYPE_SAMPLER, #DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER, or #DESCRIPTOR_TYPE_SAMPLED_IMAGE <b>must</b> be indexed only by constant integral expressions when aggregated into arrays in shader code. This also indicates whether shader modules <b>can</b> declare the {@code SampledImageArrayDynamicIndexing} capability.</li>
            <li>{@code shaderStorageBufferArrayDynamicIndexing} indicates whether arrays of storage buffers <b>can</b> be indexed by dynamically uniform integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of #DESCRIPTOR_TYPE_STORAGE_BUFFER or #DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC <b>must</b> be indexed only by constant integral expressions when aggregated into arrays in shader code. This also indicates whether shader modules <b>can</b> declare the {@code StorageBufferArrayDynamicIndexing} capability.</li>
            <li>{@code shaderStorageImageArrayDynamicIndexing} indicates whether arrays of storage images <b>can</b> be indexed by dynamically uniform integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of #DESCRIPTOR_TYPE_STORAGE_IMAGE <b>must</b> be indexed only by constant integral expressions when aggregated into arrays in shader code. This also indicates whether shader modules <b>can</b> declare the {@code StorageImageArrayDynamicIndexing} capability.</li>
            <li>{@code shaderClipDistance} indicates whether clip distances are supported in shader code. If this feature is not enabled, any members decorated with the {@code ClipDistance} built-in decoration <b>must</b> not be read from or written to in shader modules. This also indicates whether shader modules <b>can</b> declare the {@code ClipDistance} capability.</li>
            <li>{@code shaderCullDistance} indicates whether cull distances are supported in shader code. If this feature is not enabled, any members decorated with the {@code CullDistance} built-in decoration <b>must</b> not be read from or written to in shader modules. This also indicates whether shader modules <b>can</b> declare the {@code CullDistance} capability.</li>
            <li>{@code shaderFloat64} indicates whether 64-bit floats (doubles) are supported in shader code. If this feature is not enabled, 64-bit floating-point types <b>must</b> not be used in shader code. This also indicates whether shader modules <b>can</b> declare the {@code Float64} capability.</li>
            <li>{@code shaderInt64} indicates whether 64-bit integers (signed and unsigned) are supported in shader code. If this feature is not enabled, 64-bit integer types <b>must</b> not be used in shader code. This also indicates whether shader modules <b>can</b> declare the {@code Int64} capability.</li>
            <li>{@code shaderInt16} indicates whether 16-bit integers (signed and unsigned) are supported in shader code. If this feature is not enabled, 16-bit integer types <b>must</b> not be used in shader code. This also indicates whether shader modules <b>can</b> declare the {@code Int16} capability.</li>
            <li>{@code shaderResourceResidency} indicates whether image operations that return resource residency information are supported in shader code. If this feature is not enabled, the {@code OpImageSparse}* instructions <b>must</b> not be used in shader code. This also indicates whether shader modules <b>can</b> declare the {@code SparseResidency} capability. The feature requires at least one of the {@code sparseResidency}* features to be supported.</li>
            <li>{@code shaderResourceMinLod} indicates whether image operations that specify the minimum resource level-of-detail (LOD) are supported in shader code. If this feature is not enabled, the {@code MinLod} image operand <b>must</b> not be used in shader code. This also indicates whether shader modules <b>can</b> declare the {@code MinLod} capability.</li>
            <li>{@code sparseBinding} indicates whether resource memory <b>can</b> be managed at opaque sparse block level instead of at the object level. If this feature is not enabled, resource memory <b>must</b> be bound only on a per-object basis using the #BindBufferMemory() and #BindImageMemory() commands. In this case, buffers and images <b>must</b> not be created with #BUFFER_CREATE_SPARSE_BINDING_BIT and #IMAGE_CREATE_SPARSE_BINDING_BIT set in the {@code flags} member of the ##VkBufferCreateInfo and ##VkImageCreateInfo structures, respectively. Otherwise resource memory <b>can</b> be managed as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#sparsememory-sparseresourcefeatures">Sparse Resource Features</a>.</li>
            <li>{@code sparseResidencyBuffer} indicates whether the device <b>can</b> access partially resident buffers. If this feature is not enabled, buffers <b>must</b> not be created with #BUFFER_CREATE_SPARSE_RESIDENCY_BIT set in the {@code flags} member of the ##VkBufferCreateInfo structure.</li>
            <li>{@code sparseResidencyImage2D} indicates whether the device <b>can</b> access partially resident 2D images with 1 sample per pixel. If this feature is not enabled, images with an {@code imageType} of #IMAGE_TYPE_2D and {@code samples} set to #SAMPLE_COUNT_1_BIT <b>must</b> not be created with #IMAGE_CREATE_SPARSE_RESIDENCY_BIT set in the {@code flags} member of the ##VkImageCreateInfo structure.</li>
            <li>{@code sparseResidencyImage3D} indicates whether the device <b>can</b> access partially resident 3D images. If this feature is not enabled, images with an {@code imageType} of #IMAGE_TYPE_3D <b>must</b> not be created with #IMAGE_CREATE_SPARSE_RESIDENCY_BIT set in the {@code flags} member of the ##VkImageCreateInfo structure.</li>
            <li>{@code sparseResidency2Samples} indicates whether the physical device <b>can</b> access partially resident 2D images with 2 samples per pixel. If this feature is not enabled, images with an {@code imageType} of #IMAGE_TYPE_2D and {@code samples} set to #SAMPLE_COUNT_2_BIT <b>must</b> not be created with #IMAGE_CREATE_SPARSE_RESIDENCY_BIT set in the {@code flags} member of the ##VkImageCreateInfo structure.</li>
            <li>{@code sparseResidency4Samples} indicates whether the physical device <b>can</b> access partially resident 2D images with 4 samples per pixel. If this feature is not enabled, images with an {@code imageType} of #IMAGE_TYPE_2D and {@code samples} set to #SAMPLE_COUNT_4_BIT <b>must</b> not be created with #IMAGE_CREATE_SPARSE_RESIDENCY_BIT set in the {@code flags} member of the ##VkImageCreateInfo structure.</li>
            <li>{@code sparseResidency8Samples} indicates whether the physical device <b>can</b> access partially resident 2D images with 8 samples per pixel. If this feature is not enabled, images with an {@code imageType} of #IMAGE_TYPE_2D and {@code samples} set to #SAMPLE_COUNT_8_BIT <b>must</b> not be created with #IMAGE_CREATE_SPARSE_RESIDENCY_BIT set in the {@code flags} member of the ##VkImageCreateInfo structure.</li>
            <li>{@code sparseResidency16Samples} indicates whether the physical device <b>can</b> access partially resident 2D images with 16 samples per pixel. If this feature is not enabled, images with an {@code imageType} of #IMAGE_TYPE_2D and {@code samples} set to #SAMPLE_COUNT_16_BIT <b>must</b> not be created with #IMAGE_CREATE_SPARSE_RESIDENCY_BIT set in the {@code flags} member of the ##VkImageCreateInfo structure.</li>
            <li>{@code sparseResidencyAliased} indicates whether the physical device <b>can</b> correctly access data aliased into multiple locations. If this feature is not enabled, the #BUFFER_CREATE_SPARSE_ALIASED_BIT and #IMAGE_CREATE_SPARSE_ALIASED_BIT enum values <b>must</b> not be used in {@code flags} members of the ##VkBufferCreateInfo and ##VkImageCreateInfo structures, respectively.</li>
            <li>{@code variableMultisampleRate} indicates whether all pipelines that will be bound to a command buffer during a subpass with no attachments <b>must</b> have the same value for ##VkPipelineMultisampleStateCreateInfo{@code ::rasterizationSamples}. If set to #TRUE, the implementation supports variable multisample rates in a subpass with no attachments. If set to #FALSE, then all pipelines bound in such a subpass <b>must</b> have the same multisample rate. This has no effect in situations where a subpass uses any attachments.</li>
            <li>{@code inheritedQueries} indicates whether a secondary command buffer <b>may</b> be executed while a query is active.</li>
        </ul>

        <h5>See Also</h5>
        ##VkDeviceCreateInfo, ##VkPhysicalDeviceFeatures2KHR, #GetPhysicalDeviceFeatures()
        """

    VkBool32.member("robustBufferAccess", "")
    VkBool32.member("fullDrawIndexUint32", "")
    VkBool32.member("imageCubeArray", "")
    VkBool32.member("independentBlend", "")
    VkBool32.member("geometryShader", "")
    VkBool32.member("tessellationShader", "")
    VkBool32.member("sampleRateShading", "")
    VkBool32.member("dualSrcBlend", "")
    VkBool32.member("logicOp", "")
    VkBool32.member("multiDrawIndirect", "")
    VkBool32.member("drawIndirectFirstInstance", "")
    VkBool32.member("depthClamp", "")
    VkBool32.member("depthBiasClamp", "")
    VkBool32.member("fillModeNonSolid", "")
    VkBool32.member("depthBounds", "")
    VkBool32.member("wideLines", "")
    VkBool32.member("largePoints", "")
    VkBool32.member("alphaToOne", "")
    VkBool32.member("multiViewport", "")
    VkBool32.member("samplerAnisotropy", "")
    VkBool32.member("textureCompressionETC2", "")
    VkBool32.member("textureCompressionASTC_LDR", "")
    VkBool32.member("textureCompressionBC", "")
    VkBool32.member("occlusionQueryPrecise", "")
    VkBool32.member("pipelineStatisticsQuery", "")
    VkBool32.member("vertexPipelineStoresAndAtomics", "")
    VkBool32.member("fragmentStoresAndAtomics", "")
    VkBool32.member("shaderTessellationAndGeometryPointSize", "")
    VkBool32.member("shaderImageGatherExtended", "")
    VkBool32.member("shaderStorageImageExtendedFormats", "")
    VkBool32.member("shaderStorageImageMultisample", "")
    VkBool32.member("shaderStorageImageReadWithoutFormat", "")
    VkBool32.member("shaderStorageImageWriteWithoutFormat", "")
    VkBool32.member("shaderUniformBufferArrayDynamicIndexing", "")
    VkBool32.member("shaderSampledImageArrayDynamicIndexing", "")
    VkBool32.member("shaderStorageBufferArrayDynamicIndexing", "")
    VkBool32.member("shaderStorageImageArrayDynamicIndexing", "")
    VkBool32.member("shaderClipDistance", "")
    VkBool32.member("shaderCullDistance", "")
    VkBool32.member("shaderFloat64", "")
    VkBool32.member("shaderInt64", "")
    VkBool32.member("shaderInt16", "")
    VkBool32.member("shaderResourceResidency", "")
    VkBool32.member("shaderResourceMinLod", "")
    VkBool32.member("sparseBinding", "")
    VkBool32.member("sparseResidencyBuffer", "")
    VkBool32.member("sparseResidencyImage2D", "")
    VkBool32.member("sparseResidencyImage3D", "")
    VkBool32.member("sparseResidency2Samples", "")
    VkBool32.member("sparseResidency4Samples", "")
    VkBool32.member("sparseResidency8Samples", "")
    VkBool32.member("sparseResidency16Samples", "")
    VkBool32.member("sparseResidencyAliased", "")
    VkBool32.member("variableMultisampleRate", "")
    VkBool32.member("inheritedQueries", "")
}

val VkFormatProperties = struct(VULKAN_PACKAGE, "VkFormatProperties", mutable = false) {
    documentation =
        """
        Structure specifying image format properties.

        <h5>Description</h5>
        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        If no format feature flags are supported, the format itself is not supported, and images of that format cannot be created.
        </div>

        If {@code format} is a block-compression format, then buffers <b>must</b> not support any features for the format.

        <h5>See Also</h5>
        ##VkFormatProperties2KHR, #GetPhysicalDeviceFormatProperties()
        """

    VkFormatFeatureFlags.member("linearTilingFeatures", "a bitmask of {@code VkFormatFeatureFlagBits} specifying features supported by images created with a {@code tiling} parameter of #IMAGE_TILING_LINEAR.")
    VkFormatFeatureFlags.member("optimalTilingFeatures", "a bitmask of {@code VkFormatFeatureFlagBits} specifying features supported by images created with a {@code tiling} parameter of #IMAGE_TILING_OPTIMAL.")
    VkFormatFeatureFlags.member("bufferFeatures", "a bitmask of {@code VkFormatFeatureFlagBits} specifying features supported by buffers.")
}

val VkExtent3D = struct(VULKAN_PACKAGE, "VkExtent3D") {
    documentation =
        """
        Structure specifying a three-dimensional extent.
        """

    uint32_t.member("width", "")
    uint32_t.member("height", "")
    uint32_t.member("depth", "")
}

val VkImageFormatProperties = struct(VULKAN_PACKAGE, "VkImageFormatProperties", mutable = false) {
    documentation =
        """
        Structure specifying a image format properties.

        <h5>Description</h5>
        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        There is no mechanism to query the size of an image before creating it, to compare that size against {@code maxResourceSize}. If an application attempts to create an image that exceeds this limit, the creation will fail or the image will be invalid. While the advertised limit <b>must</b> be at least 2<sup>31</sup>, it <b>may</b> not be possible to create an image that approaches that size, particularly for #IMAGE_TYPE_1D.
        </div>

        If the combination of parameters to #GetPhysicalDeviceImageFormatProperties() is not supported by the implementation for use in #CreateImage(), then all members of ##VkImageFormatProperties will be filled with zero.

        <h5>See Also</h5>
        ##VkExtent3D, ##VkExternalImageFormatPropertiesNV, ##VkImageFormatProperties2KHR, #GetPhysicalDeviceImageFormatProperties()
        """

    VkExtent3D.member("maxExtent", "are the maximum image dimensions. See the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#features-extentperimagetype\">Allowed Extent Values</a> section below for how these values are constrained by {@code type}.")
    uint32_t.member("maxMipLevels", "the maximum number of mipmap levels. {@code maxMipLevels} <b>must</b> either be equal to 1 (valid only if {@code tiling} is #IMAGE_TILING_LINEAR) or be equal to <code>⌈log<sub>2</sub>(max(width, height, depth))⌉ + 1</code>. <code>width</code>, <code>height</code>, and <code>depth</code> are taken from the corresponding members of {@code maxExtent}.")
    uint32_t.member("maxArrayLayers", "the maximum number of array layers. {@code maxArrayLayers} <b>must</b> either be equal to 1 or be greater than or equal to the {@code maxImageArrayLayers} member of ##VkPhysicalDeviceLimits. A value of 1 is valid only if {@code tiling} is #IMAGE_TILING_LINEAR or if {@code type} is #IMAGE_TYPE_3D.")
    VkSampleCountFlags.member("sampleCounts", "a bitmask of {@code VkSampleCountFlagBits} specifying all the supported sample counts for this image as described <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#features-supported-sample-counts\">below</a>.")
    VkDeviceSize.member("maxResourceSize", "an upper bound on the total image size in bytes, inclusive of all image subresources. Implementations <b>may</b> have an address space limit on total size of a resource, which is advertised by this property. {@code maxResourceSize} <b>must</b> be at least 2<sup>31</sup>.")
}

val VkPhysicalDeviceLimits = struct(VULKAN_PACKAGE, "VkPhysicalDeviceLimits", mutable = false) {
    documentation =
        """
        Structure reporting implementation-dependent physical device limits.

        <h5>Description</h5>
        <dl>
            <dt>1</dt>
            <dd>For all bitmasks of {@code VkSampleCountFlagBits}, the sample count limits defined above represent the minimum supported sample counts for each image type. Individual images <b>may</b> support additional sample counts, which are queried using #GetPhysicalDeviceImageFormatProperties() as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-supported-sample-counts">Supported Sample Counts</a>.</dd>
        </dl>

        <h5>See Also</h5>
        ##VkPhysicalDeviceProperties
        """

    uint32_t.member("maxImageDimension1D", "the maximum dimension ({@code width}) supported for all images created with an {@code imageType} of #IMAGE_TYPE_1D.")
    uint32_t.member("maxImageDimension2D", "the maximum dimension ({@code width} or {@code height}) supported for all images created with an {@code imageType} of #IMAGE_TYPE_2D and without #IMAGE_CREATE_CUBE_COMPATIBLE_BIT set in {@code flags}.")
    uint32_t.member("maxImageDimension3D", "the maximum dimension ({@code width}, {@code height}, or {@code depth}) supported for all images created with an {@code imageType} of #IMAGE_TYPE_3D.")
    uint32_t.member("maxImageDimensionCube", "the maximum dimension ({@code width} or {@code height}) supported for all images created with an {@code imageType} of #IMAGE_TYPE_2D and with #IMAGE_CREATE_CUBE_COMPATIBLE_BIT set in {@code flags}.")
    uint32_t.member("maxImageArrayLayers", "the maximum number of layers ({@code arrayLayers}) for an image.")
    uint32_t.member("maxTexelBufferElements", "the maximum number of addressable texels for a buffer view created on a buffer which was created with the #BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT or #BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT set in the {@code usage} member of the ##VkBufferCreateInfo structure.")
    uint32_t.member("maxUniformBufferRange", "the maximum value that <b>can</b> be specified in the {@code range} member of any ##VkDescriptorBufferInfo structures passed to a call to #UpdateDescriptorSets() for descriptors of type #DESCRIPTOR_TYPE_UNIFORM_BUFFER or #DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC.")
    uint32_t.member("maxStorageBufferRange", "the maximum value that <b>can</b> be specified in the {@code range} member of any ##VkDescriptorBufferInfo structures passed to a call to #UpdateDescriptorSets() for descriptors of type #DESCRIPTOR_TYPE_STORAGE_BUFFER or #DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC.")
    uint32_t.member("maxPushConstantsSize", "the maximum size, in bytes, of the pool of push constant memory. For each of the push constant ranges indicated by the {@code pPushConstantRanges} member of the ##VkPipelineLayoutCreateInfo structure, <code>(offset + size)</code> <b>must</b> be less than or equal to this limit.")
    uint32_t.member("maxMemoryAllocationCount", "the maximum number of device memory allocations, as created by #AllocateMemory(), which <b>can</b> simultaneously exist.")
    uint32_t.member("maxSamplerAllocationCount", "the maximum number of sampler objects, as created by #CreateSampler(), which <b>can</b> simultaneously exist on a device.")
    VkDeviceSize.member("bufferImageGranularity", "the granularity, in bytes, at which buffer or linear image resources, and optimal image resources <b>can</b> be bound to adjacent offsets in the same {@code VkDeviceMemory} object without aliasing. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#resources-bufferimagegranularity\">Buffer-Image Granularity</a> for more details.")
    VkDeviceSize.member("sparseAddressSpaceSize", "the total amount of address space available, in bytes, for sparse memory resources. This is an upper bound on the sum of the size of all sparse resources, regardless of whether any memory is bound to them.")
    uint32_t.member("maxBoundDescriptorSets", "the maximum number of descriptor sets that <b>can</b> be simultaneously used by a pipeline. All {@code DescriptorSet} decorations in shader modules <b>must</b> have a value less than {@code maxBoundDescriptorSets}. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#descriptorsets-sets\">the “Descriptor Sets” section</a>.")
    uint32_t.member("maxPerStageDescriptorSamplers", "the maximum number of samplers that <b>can</b> be accessible to a single shader stage in a pipeline layout. Descriptors with a type of #DESCRIPTOR_TYPE_SAMPLER or #DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER count against this limit. A descriptor is accessible to a shader stage when the {@code stageFlags} member of the ##VkDescriptorSetLayoutBinding structure has the bit for that shader stage set. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#descriptorsets-sampler\">the “Sampler” section</a> and <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#descriptorsets-combinedimagesampler\">the “Combined Image Sampler” section</a>.")
    uint32_t.member("maxPerStageDescriptorUniformBuffers", "the maximum number of uniform buffers that <b>can</b> be accessible to a single shader stage in a pipeline layout. Descriptors with a type of #DESCRIPTOR_TYPE_UNIFORM_BUFFER or #DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC count against this limit. A descriptor is accessible to a shader stage when the {@code stageFlags} member of the ##VkDescriptorSetLayoutBinding structure has the bit for that shader stage set. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#descriptorsets-uniformbuffer\">the “Uniform Buffer” section</a> and <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#descriptorsets-uniformbufferdynamic\">the “Dynamic Uniform Buffer” section</a>.")
    uint32_t.member("maxPerStageDescriptorStorageBuffers", "the maximum number of storage buffers that <b>can</b> be accessible to a single shader stage in a pipeline layout. Descriptors with a type of #DESCRIPTOR_TYPE_STORAGE_BUFFER or #DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC count against this limit. A descriptor is accessible to a pipeline shader stage when the {@code stageFlags} member of the ##VkDescriptorSetLayoutBinding structure has the bit for that shader stage set. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#descriptorsets-storagebuffer\">the “Storage Buffer” section</a> and <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#descriptorsets-storagebufferdynamic\">the “Dynamic Storage Buffer” section</a>.")
    uint32_t.member("maxPerStageDescriptorSampledImages", "the maximum number of sampled images that <b>can</b> be accessible to a single shader stage in a pipeline layout. Descriptors with a type of #DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER, #DESCRIPTOR_TYPE_SAMPLED_IMAGE, or #DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER count against this limit. A descriptor is accessible to a pipeline shader stage when the {@code stageFlags} member of the ##VkDescriptorSetLayoutBinding structure has the bit for that shader stage set. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#descriptorsets-combinedimagesampler\">the “Combined Image Sampler” section</a>, <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#descriptorsets-sampledimage\">the “Sampled Image” section</a>, and <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#descriptorsets-uniformtexelbuffer\">the “Uniform Texel Buffer” section</a>.")
    uint32_t.member("maxPerStageDescriptorStorageImages", "the maximum number of storage images that <b>can</b> be accessible to a single shader stage in a pipeline layout. Descriptors with a type of #DESCRIPTOR_TYPE_STORAGE_IMAGE, or #DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER count against this limit. A descriptor is accessible to a pipeline shader stage when the {@code stageFlags} member of the ##VkDescriptorSetLayoutBinding structure has the bit for that shader stage set. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#descriptorsets-storageimage\">the “Storage Image” section</a>, and <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#descriptorsets-storagetexelbuffer\">the “Storage Texel Buffer” section</a>.")
    uint32_t.member("maxPerStageDescriptorInputAttachments", "the maximum number of input attachments that <b>can</b> be accessible to a single shader stage in a pipeline layout. Descriptors with a type of #DESCRIPTOR_TYPE_INPUT_ATTACHMENT count against this limit. A descriptor is accessible to a pipeline shader stage when the {@code stageFlags} member of the ##VkDescriptorSetLayoutBinding structure has the bit for that shader stage set. These are only supported for the fragment stage. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#descriptorsets-inputattachment\">the “Input Attachment” section</a>.")
    uint32_t.member("maxPerStageResources", "the maximum number of resources that <b>can</b> be accessible to a single shader stage in a pipeline layout. Descriptors with a type of #DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER, #DESCRIPTOR_TYPE_SAMPLED_IMAGE, #DESCRIPTOR_TYPE_STORAGE_IMAGE, #DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER, #DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER, #DESCRIPTOR_TYPE_UNIFORM_BUFFER, #DESCRIPTOR_TYPE_STORAGE_BUFFER, #DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC, #DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC, or #DESCRIPTOR_TYPE_INPUT_ATTACHMENT count against this limit. For the fragment shader stage the framebuffer color attachments also count against this limit.")
    uint32_t.member("maxDescriptorSetSamplers", "the maximum number of samplers that <b>can</b> be included in descriptor bindings in a pipeline layout across all pipeline shader stages and descriptor set numbers. Descriptors with a type of #DESCRIPTOR_TYPE_SAMPLER or #DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER count against this limit. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#descriptorsets-sampler\">the “Sampler” section</a> and <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#descriptorsets-combinedimagesampler\">the “Combined Image Sampler” section</a>.")
    uint32_t.member("maxDescriptorSetUniformBuffers", "the maximum number of uniform buffers that <b>can</b> be included in descriptor bindings in a pipeline layout across all pipeline shader stages and descriptor set numbers. Descriptors with a type of #DESCRIPTOR_TYPE_UNIFORM_BUFFER or #DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC count against this limit. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#descriptorsets-uniformbuffer\">the “Uniform Buffer” section</a> and <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#descriptorsets-uniformbufferdynamic\">the “Dynamic Uniform Buffer” section</a>.")
    uint32_t.member("maxDescriptorSetUniformBuffersDynamic", "the maximum number of dynamic uniform buffers that <b>can</b> be included in descriptor bindings in a pipeline layout across all pipeline shader stages and descriptor set numbers. Descriptors with a type of #DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC count against this limit. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#descriptorsets-uniformbufferdynamic\">the “Dynamic Uniform Buffer” section</a>.")
    uint32_t.member("maxDescriptorSetStorageBuffers", "the maximum number of storage buffers that <b>can</b> be included in descriptor bindings in a pipeline layout across all pipeline shader stages and descriptor set numbers. Descriptors with a type of #DESCRIPTOR_TYPE_STORAGE_BUFFER or #DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC count against this limit. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#descriptorsets-storagebuffer\">the “Storage Buffer” section</a> and <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#descriptorsets-storagebufferdynamic\">the “Dynamic Storage Buffer” section</a>.")
    uint32_t.member("maxDescriptorSetStorageBuffersDynamic", "the maximum number of dynamic storage buffers that <b>can</b> be included in descriptor bindings in a pipeline layout across all pipeline shader stages and descriptor set numbers. Descriptors with a type of #DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC count against this limit. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#descriptorsets-storagebufferdynamic\">the “Dynamic Storage Buffer” section</a>.")
    uint32_t.member("maxDescriptorSetSampledImages", "the maximum number of sampled images that <b>can</b> be included in descriptor bindings in a pipeline layout across all pipeline shader stages and descriptor set numbers. Descriptors with a type of #DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER, #DESCRIPTOR_TYPE_SAMPLED_IMAGE, or #DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER count against this limit. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#descriptorsets-combinedimagesampler\">the “Combined Image Sampler” section</a>, <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#descriptorsets-sampledimage\">the “Sampled Image” section</a>, and <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#descriptorsets-uniformtexelbuffer\">the “Uniform Texel Buffer” section</a>.")
    uint32_t.member("maxDescriptorSetStorageImages", "the maximum number of storage images that <b>can</b> be included in descriptor bindings in a pipeline layout across all pipeline shader stages and descriptor set numbers. Descriptors with a type of #DESCRIPTOR_TYPE_STORAGE_IMAGE, or #DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER count against this limit. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#descriptorsets-storageimage\">the “Storage Image” section</a>, and <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#descriptorsets-storagetexelbuffer\">the “Storage Texel Buffer” section</a>.")
    uint32_t.member("maxDescriptorSetInputAttachments", "the maximum number of input attachments that <b>can</b> be included in descriptor bindings in a pipeline layout across all pipeline shader stages and descriptor set numbers. Descriptors with a type of #DESCRIPTOR_TYPE_INPUT_ATTACHMENT count against this limit. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#descriptorsets-inputattachment\">the “Input Attachment” section</a>.")
    uint32_t.member("maxVertexInputAttributes", "the maximum number of vertex input attributes that <b>can</b> be specified for a graphics pipeline. These are described in the array of ##VkVertexInputAttributeDescription structures that are provided at graphics pipeline creation time via the {@code pVertexAttributeDescriptions} member of the ##VkPipelineVertexInputStateCreateInfo structure. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#fxvertex-attrib\">the “Vertex Attributes” section</a> and <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#fxvertex-input\">the “Vertex Input Description” section</a>.")
    uint32_t.member("maxVertexInputBindings", "the maximum number of vertex buffers that <b>can</b> be specified for providing vertex attributes to a graphics pipeline. These are described in the array of ##VkVertexInputBindingDescription structures that are provided at graphics pipeline creation time via the {@code pVertexBindingDescriptions} member of the ##VkPipelineVertexInputStateCreateInfo structure. The {@code binding} member of ##VkVertexInputBindingDescription <b>must</b> be less than this limit. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#fxvertex-input\">the “Vertex Input Description” section</a>.")
    uint32_t.member("maxVertexInputAttributeOffset", "the maximum vertex input attribute offset that <b>can</b> be added to the vertex input binding stride. The {@code offset} member of the ##VkVertexInputAttributeDescription structure <b>must</b> be less than or equal to this limit. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#fxvertex-input\">the “Vertex Input Description” section</a>.")
    uint32_t.member("maxVertexInputBindingStride", "the maximum vertex input binding stride that <b>can</b> be specified in a vertex input binding. The {@code stride} member of the ##VkVertexInputBindingDescription structure <b>must</b> be less than or equal to this limit. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#fxvertex-input\">the “Vertex Input Description” section</a>.")
    uint32_t.member("maxVertexOutputComponents", "the maximum number of components of output variables which <b>can</b> be output by a vertex shader. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#shaders-vertex\">the “Vertex Shaders” section</a>.")
    uint32_t.member("maxTessellationGenerationLevel", "the maximum tessellation generation level supported by the fixed-function tessellation primitive generator. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#tessellation\">the “Tessellation” chapter</a>.")
    uint32_t.member("maxTessellationPatchSize", "the maximum patch size, in vertices, of patches that <b>can</b> be processed by the tessellation control shader and tessellation primitive generator. The {@code patchControlPoints} member of the ##VkPipelineTessellationStateCreateInfo structure specified at pipeline creation time and the value provided in the {@code OutputVertices} execution mode of shader modules <b>must</b> be less than or equal to this limit. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#tessellation\">the “Tessellation” chapter</a>.")
    uint32_t.member("maxTessellationControlPerVertexInputComponents", "the maximum number of components of input variables which <b>can</b> be provided as per-vertex inputs to the tessellation control shader stage.")
    uint32_t.member("maxTessellationControlPerVertexOutputComponents", "the maximum number of components of per-vertex output variables which <b>can</b> be output from the tessellation control shader stage.")
    uint32_t.member("maxTessellationControlPerPatchOutputComponents", "the maximum number of components of per-patch output variables which <b>can</b> be output from the tessellation control shader stage.")
    uint32_t.member("maxTessellationControlTotalOutputComponents", "the maximum total number of components of per-vertex and per-patch output variables which <b>can</b> be output from the tessellation control shader stage.")
    uint32_t.member("maxTessellationEvaluationInputComponents", "the maximum number of components of input variables which <b>can</b> be provided as per-vertex inputs to the tessellation evaluation shader stage.")
    uint32_t.member("maxTessellationEvaluationOutputComponents", "the maximum number of components of per-vertex output variables which <b>can</b> be output from the tessellation evaluation shader stage.")
    uint32_t.member("maxGeometryShaderInvocations", "the maximum invocation count supported for instanced geometry shaders. The value provided in the {@code Invocations} execution mode of shader modules <b>must</b> be less than or equal to this limit. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#geometry\">the “Geometry Shading” chapter</a>.")
    uint32_t.member("maxGeometryInputComponents", "the maximum number of components of input variables which <b>can</b> be provided as inputs to the geometry shader stage.")
    uint32_t.member("maxGeometryOutputComponents", "the maximum number of components of output variables which <b>can</b> be output from the geometry shader stage.")
    uint32_t.member("maxGeometryOutputVertices", "the maximum number of vertices which <b>can</b> be emitted by any geometry shader.")
    uint32_t.member("maxGeometryTotalOutputComponents", "the maximum total number of components of output, across all emitted vertices, which <b>can</b> be output from the geometry shader stage.")
    uint32_t.member("maxFragmentInputComponents", "the maximum number of components of input variables which <b>can</b> be provided as inputs to the fragment shader stage.")
    uint32_t.member("maxFragmentOutputAttachments", "the maximum number of output attachments which <b>can</b> be written to by the fragment shader stage.")
    uint32_t.member("maxFragmentDualSrcAttachments", "the maximum number of output attachments which <b>can</b> be written to by the fragment shader stage when blending is enabled and one of the dual source blend modes is in use. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#framebuffer-dsb\">the “Dual-Source Blending” section</a> and <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#features-features-dualSrcBlend\">dualSrcBlend</a>.")
    uint32_t.member("maxFragmentCombinedOutputResources", "the total number of storage buffers, storage images, and output buffers which <b>can</b> be used in the fragment shader stage.")
    uint32_t.member("maxComputeSharedMemorySize", "the maximum total storage size, in bytes, of all variables declared with the {@code WorkgroupLocal} storage class in shader modules (or with the {@code shared} storage qualifier in GLSL) in the compute shader stage.")
    uint32_t.array("maxComputeWorkGroupCount", "the maximum number of local workgroups that <b>can</b> be dispatched by a single dispatch command. These three values represent the maximum number of local workgroups for the X, Y, and Z dimensions, respectively. The workgroup count parameters to the dispatch commands <b>must</b> be less than or equal to the corresponding limit. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#dispatch\">the “Dispatching Commands” chapter</a>.", size = 3)
    uint32_t.member("maxComputeWorkGroupInvocations", "the maximum total number of compute shader invocations in a single local workgroup. The product of the X, Y, and Z sizes as specified by the {@code LocalSize} execution mode in shader modules and by the object decorated by the {@code WorkgroupSize} decoration <b>must</b> be less than or equal to this limit.")
    uint32_t.array("maxComputeWorkGroupSize", "the maximum size of a local compute workgroup, per dimension. These three values represent the maximum local workgroup size in the X, Y, and Z dimensions, respectively. The {@code x}, {@code y}, and {@code z} sizes specified by the {@code LocalSize} execution mode and by the object decorated by the {@code WorkgroupSize} decoration in shader modules <b>must</b> be less than or equal to the corresponding limit.", size = 3)
    uint32_t.member("subPixelPrecisionBits", "the number of bits of subpixel precision in framebuffer coordinates <code>x<sub>f</sub></code> and <code>y<sub>f</sub></code>. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#primsrast\">the “Rasterization” chapter</a>.")
    uint32_t.member("subTexelPrecisionBits", "the number of bits of precision in the division along an axis of an image used for minification and magnification filters. <code>2<sup>subTexelPrecisionBits</sup></code> is the actual number of divisions along each axis of the image represented. The filtering hardware will snap to these locations when computing the filtered results.")
    uint32_t.member("mipmapPrecisionBits", """the number of bits of division that the LOD calculation for mipmap fetching get snapped to when determining the contribution from each mip level to the mip filtered results. <code>2<sup>mipmapPrecisionBits</sup></code> is the actual number of divisions.
<div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        For example, if this value is 2 bits then when linearly filtering between two levels, each level could: contribute: 0%, 33%, 66%, or 100% (this is just an example and the amount of contribution <b>should</b> be covered by different equations in the spec).
        </div>""")
    uint32_t.member("maxDrawIndexedIndexValue", "the maximum index value that <b>can</b> be used for indexed draw calls when using 32-bit indices. This excludes the primitive restart index value of 0xFFFFFFFF. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#features-features-fullDrawIndexUint32\">fullDrawIndexUint32</a>.")
    uint32_t.member("maxDrawIndirectCount", "the maximum draw count that is supported for indirect draw calls. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#features-features-multiDrawIndirect\">multiDrawIndirect</a>.")
    float.member("maxSamplerLodBias", "the maximum absolute sampler level of detail bias. The sum of the {@code mipLodBias} member of the ##VkSamplerCreateInfo structure and the {@code Bias} operand of image sampling operations in shader modules (or 0 if no {@code Bias} operand is provided to an image sampling operation) are clamped to the range <code>[-maxSamplerLodBias,+maxSamplerLodBias]</code>. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#samplers-mipLodBias\">samplers-mipLodBias</a>.")
    float.member("maxSamplerAnisotropy", "the maximum degree of sampler anisotropy. The maximum degree of anisotropic filtering used for an image sampling operation is the minimum of the {@code maxAnisotropy} member of the ##VkSamplerCreateInfo structure and this limit. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#samplers-maxAnisotropy\">samplers-maxAnisotropy</a>.")
    uint32_t.member("maxViewports", "the maximum number of active viewports. The {@code viewportCount} member of the ##VkPipelineViewportStateCreateInfo structure that is provided at pipeline creation <b>must</b> be less than or equal to this limit.")
    uint32_t.array("maxViewportDimensions", "are the maximum viewport dimensions in the X (width) and Y (height) dimensions, respectively. The maximum viewport dimensions <b>must</b> be greater than or equal to the largest image which <b>can</b> be created and used as a framebuffer attachment. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#vertexpostproc-viewport\">Controlling the Viewport</a>.", size = 2)
    float.array("viewportBoundsRange", """the <code>[minimum, maximum]</code> range that the corners of a viewport <b>must</b> be contained in. This range <b>must</b> be at least <code>[-2 × size, 2 × size - 1]</code>, where <code>size = max(maxViewportDimensions[0], maxViewportDimensions[1])</code>. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vertexpostproc-viewport">Controlling the Viewport</a>.
<div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The intent of the {@code viewportBoundsRange} limit is to allow a maximum sized viewport to be arbitrarily shifted relative to the output target as long as at least some portion intersects. This would give a bounds limit of <code>[-size {plus} 1, 2 {times} size - 1]</code> which would allow all possible non-empty-set intersections of the output target and the viewport. Since these numbers are typically powers of two, picking the signed number range using the smallest possible number of bits ends up with the specified range.
        </div>""", size = 2)
    uint32_t.member("viewportSubPixelBits", "the number of bits of subpixel precision for viewport bounds. The subpixel precision that floating-point viewport bounds are interpreted at is given by this limit.")
    size_t.member("minMemoryMapAlignment", "the minimum required: alignment, in bytes, of host visible memory allocations within the host address space. When mapping a memory allocation with #MapMemory(), subtracting {@code offset} bytes from the returned pointer will always produce an integer multiple of this limit. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-device-hostaccess\">the “Host Access to Device Memory Objects” section</a>.")
    VkDeviceSize.member("minTexelBufferOffsetAlignment", "the minimum required: alignment, in bytes, for the {@code offset} member of the ##VkBufferViewCreateInfo structure for texel buffers. When a buffer view is created for a buffer which was created with #BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT or #BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT set in the {@code usage} member of the ##VkBufferCreateInfo structure, the {@code offset} <b>must</b> be an integer multiple of this limit.")
    VkDeviceSize.member("minUniformBufferOffsetAlignment", "the minimum required: alignment, in bytes, for the {@code offset} member of the ##VkDescriptorBufferInfo structure for uniform buffers. When a descriptor of type #DESCRIPTOR_TYPE_UNIFORM_BUFFER or #DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC is updated, the {@code offset} <b>must</b> be an integer multiple of this limit. Similarly, dynamic offsets for uniform buffers <b>must</b> be multiples of this limit.")
    VkDeviceSize.member("minStorageBufferOffsetAlignment", "the minimum required: alignment, in bytes, for the {@code offset} member of the ##VkDescriptorBufferInfo structure for storage buffers. When a descriptor of type #DESCRIPTOR_TYPE_STORAGE_BUFFER or #DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC is updated, the {@code offset} <b>must</b> be an integer multiple of this limit. Similarly, dynamic offsets for storage buffers <b>must</b> be multiples of this limit.")
    int32_t.member("minTexelOffset", "the minimum offset value for the {@code ConstOffset} image operand of any of the {@code OpImageSample}* or {@code OpImageFetch}* image instructions.")
    uint32_t.member("maxTexelOffset", "the maximum offset value for the {@code ConstOffset} image operand of any of the {@code OpImageSample}* or {@code OpImageFetch}* image instructions.")
    int32_t.member("minTexelGatherOffset", "the minimum offset value for the {@code Offset} or {@code ConstOffsets} image operands of any of the {@code OpImage}*{@code Gather} image instructions.")
    uint32_t.member("maxTexelGatherOffset", "the maximum offset value for the {@code Offset} or {@code ConstOffsets} image operands of any of the {@code OpImage}*{@code Gather} image instructions.")
    float.member("minInterpolationOffset", "the minimum negative offset value for the {@code offset} operand of the {@code InterpolateAtOffset} extended instruction.")
    float.member("maxInterpolationOffset", "the maximum positive offset value for the {@code offset} operand of the {@code InterpolateAtOffset} extended instruction.")
    uint32_t.member("subPixelInterpolationOffsetBits", "the number of subpixel fractional bits that the {@code x} and {@code y} offsets to the {@code InterpolateAtOffset} extended instruction <b>may</b> be rounded to as fixed-point values.")
    uint32_t.member("maxFramebufferWidth", "the maximum width for a framebuffer. The {@code width} member of the ##VkFramebufferCreateInfo structure <b>must</b> be less than or equal to this limit.")
    uint32_t.member("maxFramebufferHeight", "the maximum height for a framebuffer. The {@code height} member of the ##VkFramebufferCreateInfo structure <b>must</b> be less than or equal to this limit.")
    uint32_t.member("maxFramebufferLayers", "the maximum layer count for a layered framebuffer. The {@code layers} member of the ##VkFramebufferCreateInfo structure <b>must</b> be less than or equal to this limit.")
    VkSampleCountFlags.member("framebufferColorSampleCounts", "a bitmask<sup>1</sup> of {@code VkSampleCountFlagBits} indicating the color sample counts that are supported for all framebuffer color attachments.")
    VkSampleCountFlags.member("framebufferDepthSampleCounts", "a bitmask<sup>1</sup> of {@code VkSampleCountFlagBits} indicating the supported depth sample counts for all framebuffer depth/stencil attachments, when the format includes a depth component.")
    VkSampleCountFlags.member("framebufferStencilSampleCounts", "a bitmask<sup>1</sup> of {@code VkSampleCountFlagBits} indicating the supported stencil sample counts for all framebuffer depth/stencil attachments, when the format includes a stencil component.")
    VkSampleCountFlags.member("framebufferNoAttachmentsSampleCounts", "a bitmask<sup>1</sup> of {@code VkSampleCountFlagBits} indicating the supported sample counts for a framebuffer with no attachments.")
    uint32_t.member("maxColorAttachments", "the maximum number of color attachments that <b>can</b> be used by a subpass in a render pass. The {@code colorAttachmentCount} member of the ##VkSubpassDescription structure <b>must</b> be less than or equal to this limit.")
    VkSampleCountFlags.member("sampledImageColorSampleCounts", "a bitmask<sup>1</sup> of {@code VkSampleCountFlagBits} indicating the sample counts supported for all 2D images created with #IMAGE_TILING_OPTIMAL, {@code usage} containing #IMAGE_USAGE_SAMPLED_BIT, and a non-integer color format.")
    VkSampleCountFlags.member("sampledImageIntegerSampleCounts", "a bitmask<sup>1</sup> of {@code VkSampleCountFlagBits} indicating the sample counts supported for all 2D images created with #IMAGE_TILING_OPTIMAL, {@code usage} containing #IMAGE_USAGE_SAMPLED_BIT, and an integer color format.")
    VkSampleCountFlags.member("sampledImageDepthSampleCounts", "a bitmask<sup>1</sup> of {@code VkSampleCountFlagBits} indicating the sample counts supported for all 2D images created with #IMAGE_TILING_OPTIMAL, {@code usage} containing #IMAGE_USAGE_SAMPLED_BIT, and a depth format.")
    VkSampleCountFlags.member("sampledImageStencilSampleCounts", "a bitmask<sup>1</sup> of {@code VkSampleCountFlagBits} indicating the sample supported for all 2D images created with #IMAGE_TILING_OPTIMAL, {@code usage} containing #IMAGE_USAGE_SAMPLED_BIT, and a stencil format.")
    VkSampleCountFlags.member("storageImageSampleCounts", "a bitmask<sup>1</sup> of {@code VkSampleCountFlagBits} indicating the sample counts supported for all 2D images created with #IMAGE_TILING_OPTIMAL, and {@code usage} containing #IMAGE_USAGE_STORAGE_BIT.")
    uint32_t.member("maxSampleMaskWords", "the maximum number of array elements of a variable decorated with the {@code SampleMask} built-in decoration.")
    VkBool32.member("timestampComputeAndGraphics", "indicates support for timestamps on all graphics and compute queues. If this limit is set to #TRUE, all queues that advertise the #QUEUE_GRAPHICS_BIT or #QUEUE_COMPUTE_BIT in the ##VkQueueFamilyProperties{@code ::queueFlags} support ##VkQueueFamilyProperties{@code ::timestampValidBits} of at least 36. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#queries-timestamps\">Timestamp Queries</a>.")
    float.member("timestampPeriod", "the number of nanoseconds required: for a timestamp query to be incremented by 1. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#queries-timestamps\">Timestamp Queries</a>.")
    uint32_t.member("maxClipDistances", "the maximum number of clip distances that <b>can</b> be used in a single shader stage. The size of any array declared with the {@code ClipDistance} built-in decoration in a shader module <b>must</b> be less than or equal to this limit.")
    uint32_t.member("maxCullDistances", "the maximum number of cull distances that <b>can</b> be used in a single shader stage. The size of any array declared with the {@code CullDistance} built-in decoration in a shader module <b>must</b> be less than or equal to this limit.")
    uint32_t.member("maxCombinedClipAndCullDistances", "the maximum combined number of clip and cull distances that <b>can</b> be used in a single shader stage. The sum of the sizes of any pair of arrays declared with the {@code ClipDistance} and {@code CullDistance} built-in decoration used by a single shader stage in a shader module <b>must</b> be less than or equal to this limit.")
    uint32_t.member("discreteQueuePriorities", "the number of discrete priorities that <b>can</b> be assigned to a queue based on the value of each member of ##VkDeviceQueueCreateInfo{@code ::pQueuePriorities}. This <b>must</b> be at least 2, and levels <b>must</b> be spread evenly over the range, with at least one level at 1.0, and another at 0.0. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#devsandqueues-priority\">the “Queue Priority” section</a>.")
    float.array("pointSizeRange", "the range <code>[minimum,maximum]</code> of supported sizes for points. Values written to variables decorated with the {@code PointSize} built-in decoration are clamped to this range.", size = 2)
    float.array("lineWidthRange", "the range <code>[minimum,maximum]</code> of supported widths for lines. Values specified by the {@code lineWidth} member of the ##VkPipelineRasterizationStateCreateInfo or the {@code lineWidth} parameter to #CmdSetLineWidth() are clamped to this range.", size = 2)
    float.member("pointSizeGranularity", "the granularity of supported point sizes. Not all point sizes in the range defined by {@code pointSizeRange} are supported. This limit specifies the granularity (or increment) between successive supported point sizes.")
    float.member("lineWidthGranularity", "the granularity of supported line widths. Not all line widths in the range defined by {@code lineWidthRange} are supported. This limit specifies the granularity (or increment) between successive supported line widths.")
    VkBool32.member("strictLines", "indicates whether lines are rasterized according to the preferred method of rasterization. If set to #FALSE, lines <b>may</b> be rasterized under a relaxed set of rules. If set to #TRUE, lines are rasterized as per the strict definition. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#primsrast-lines-basic\">Basic Line Segment Rasterization</a>.")
    VkBool32.member("standardSampleLocations", "indicates whether rasterization uses the standard sample locations as documented in <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#primsrast-multisampling\">Multisampling</a>. If set to #TRUE, the implementation uses the documented sample locations. If set to #FALSE, the implementation <b>may</b> use different sample locations.")
    VkDeviceSize.member("optimalBufferCopyOffsetAlignment", "the optimal buffer offset alignment in bytes for #CmdCopyBufferToImage() and #CmdCopyImageToBuffer(). The per texel alignment requirements are enforced, but applications <b>should</b> use the optimal alignment for optimal performance and power use.")
    VkDeviceSize.member("optimalBufferCopyRowPitchAlignment", "the optimal buffer row pitch alignment in bytes for #CmdCopyBufferToImage() and #CmdCopyImageToBuffer(). Row pitch is the number of bytes between texels with the same X coordinate in adjacent rows (Y coordinates differ by one). The per texel alignment requirements are enforced, but applications <b>should</b> use the optimal alignment for optimal performance and power use.")
    VkDeviceSize.member("nonCoherentAtomSize", "the size and alignment in bytes that bounds concurrent access to <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-device-hostaccess\">host-mapped device memory</a>.")
}

val VkPhysicalDeviceSparseProperties = struct(VULKAN_PACKAGE, "VkPhysicalDeviceSparseProperties", mutable = false) {
    documentation =
        """
        Structure specifying physical device sparse memory properties.
        """

    VkBool32.member("residencyStandard2DBlockShape", "#TRUE if the physical device will access all single-sample 2D sparse resources using the standard sparse image block shapes (based on image format), as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#sparsememory-sparseblockshapessingle\">Standard Sparse Image Block Shapes (Single Sample)</a> table. If this property is not supported the value returned in the {@code imageGranularity} member of the ##VkSparseImageFormatProperties structure for single-sample 2D images is not required: to match the standard sparse image block dimensions listed in the table.")
    VkBool32.member("residencyStandard2DMultisampleBlockShape", "#TRUE if the physical device will access all multisample 2D sparse resources using the standard sparse image block shapes (based on image format), as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#sparsememory-sparseblockshapesmsaa\">Standard Sparse Image Block Shapes (MSAA)</a> table. If this property is not supported, the value returned in the {@code imageGranularity} member of the ##VkSparseImageFormatProperties structure for multisample 2D images is not required: to match the standard sparse image block dimensions listed in the table.")
    VkBool32.member("residencyStandard3DBlockShape", "#TRUE if the physical device will access all 3D sparse resources using the standard sparse image block shapes (based on image format), as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#sparsememory-sparseblockshapessingle\">Standard Sparse Image Block Shapes (Single Sample)</a> table. If this property is not supported, the value returned in the {@code imageGranularity} member of the ##VkSparseImageFormatProperties structure for 3D images is not required: to match the standard sparse image block dimensions listed in the table.")
    VkBool32.member("residencyAlignedMipSize", "#TRUE if images with mip level dimensions that are not integer multiples of the corresponding dimensions of the sparse image block <b>may</b> be placed in the mip tail. If this property is not reported, only mip levels with dimensions smaller than the {@code imageGranularity} member of the ##VkSparseImageFormatProperties structure will be placed in the mip tail. If this property is reported the implementation is allowed to return #SPARSE_IMAGE_FORMAT_ALIGNED_MIP_SIZE_BIT in the {@code flags} member of ##VkSparseImageFormatProperties, indicating that mip level dimensions that are not integer multiples of the corresponding dimensions of the sparse image block will be placed in the mip tail.")
    VkBool32.member("residencyNonResidentStrict", "specifies whether the physical device <b>can</b> consistently access non-resident regions of a resource. If this property is #TRUE, access to non-resident regions of resources will be guaranteed to return values as if the resource were populated with 0; writes to non-resident regions will be discarded.")
}

val VkPhysicalDeviceProperties = struct(VULKAN_PACKAGE, "VkPhysicalDeviceProperties", mutable = false) {
    javaImport("static org.lwjgl.vulkan.VK10.*")
    documentation =
        """
        Structure specifying physical device properties.

        <h5>Description</h5>
        The {@code vendorID} and {@code deviceID} fields are provided to allow applications to adapt to device characteristics that are not adequately exposed by other Vulkan queries. These <b>may</b> include performance profiles, hardware errata, or other characteristics. In PCI-based implementations, the low sixteen bits of {@code vendorID} and {@code deviceID} <b>must</b> contain (respectively) the PCI vendor and device IDs associated with the hardware device, and the remaining bits <b>must</b> be set to zero. In non-PCI implementations, the choice of what values to return <b>may</b> be dictated by operating system or platform policies. It is otherwise at the discretion of the implementer, subject to the following constraints and guidelines:

        <ul>
            <li>For purposes of physical device identification, the <em>vendor</em> of a physical device is the entity responsible for the most salient characteristics of the hardware represented by the physical device handle. In the case of a discrete GPU, this <b>should</b> be the GPU chipset vendor. In the case of a GPU or other accelerator integrated into a system-on-chip (SoC), this <b>should</b> be the supplier of the silicon IP used to create the GPU or other accelerator.</li>
            <li>If the vendor of the physical device has a valid PCI vendor ID issued by <a target="_blank" href="https://pcisig.com/">PCI-SIG</a>, that ID <b>should</b> be used to construct {@code vendorID} as described above for PCI-based implementations. Implementations that do not return a PCI vendor ID in {@code vendorID} <b>must</b> return a valid Khronos vendor ID, obtained as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vulkan-styleguide">Vulkan Documentation and Extensions</a> document in the section “Registering a Vendor ID with Khronos”. Khronos vendor IDs are allocated starting at 0x10000, to distinguish them from the PCI vendor ID namespace.</li>
            <li>The vendor of the physical device is responsible for selecting {@code deviceID}. The value selected <b>should</b> uniquely identify both the device version and any major configuration options (for example, core count in the case of multicore devices). The same device ID <b>should</b> be used for all physical implementations of that device version and configuration. For example, all uses of a specific silicon IP GPU version and configuration <b>should</b> use the same device ID, even if those uses occur in different SoCs.</li>
        </ul>

        <h5>See Also</h5>
        ##VkPhysicalDeviceLimits, ##VkPhysicalDeviceProperties2KHR, ##VkPhysicalDeviceSparseProperties, #GetPhysicalDeviceProperties()
        """

    uint32_t.member("apiVersion", "the version of Vulkan supported by the device, encoded as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#fundamentals-versionnum\">API Version Numbers and Semantics</a> section.")
    uint32_t.member("driverVersion", "the vendor-specified version of the driver.")
    uint32_t.member("vendorID", "a unique identifier for the <em>vendor</em> (see below) of the physical device.")
    uint32_t.member("deviceID", "a unique identifier for the physical device among devices available from the vendor.")
    VkPhysicalDeviceType.member("deviceType", "a {@code VkPhysicalDeviceType} specifying the type of device.")
    charUTF8.array("deviceName", "a null-terminated UTF-8 string containing the name of the device.", size = "VK_MAX_PHYSICAL_DEVICE_NAME_SIZE")
    uint8_t.array("pipelineCacheUUID", "an array of size #UUID_SIZE, containing 8-bit values that represent a universally unique identifier for the device.", size = "VK_UUID_SIZE")
    VkPhysicalDeviceLimits.member("limits", "the ##VkPhysicalDeviceLimits structure which specifies device-specific limits of the physical device. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#features-limits\">Limits</a> for details.")
    VkPhysicalDeviceSparseProperties.member("sparseProperties", "the ##VkPhysicalDeviceSparseProperties structure which specifies various sparse related properties of the physical device. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#sparsememory-physicalprops\">Sparse Properties</a> for details.")
}

val VkQueueFamilyProperties = struct(VULKAN_PACKAGE, "VkQueueFamilyProperties", mutable = false) {
    documentation =
        """
        Structure providing information about a queue family.

        <h5>Description</h5>
        The value returned in {@code minImageTransferGranularity} has a unit of compressed texel blocks for images having a block-compressed format, and a unit of texels otherwise.

        Possible values of {@code minImageTransferGranularity} are:

        <ul>
            <li>
                <code>(0,0,0)</code> which indicates that only whole mip levels <b>must</b> be transferred using the image transfer operations on the corresponding queues. In this case, the following restrictions apply to all offset and extent parameters of image transfer operations:
                <ul>
                    <li>The {@code x}, {@code y}, and {@code z} members of a ##VkOffset3D parameter <b>must</b> always be zero.</li>
                    <li>The {@code width}, {@code height}, and {@code depth} members of a ##VkExtent3D parameter <b>must</b> always match the width, height, and depth of the image subresource corresponding to the parameter, respectively.</li>
                </ul>
            </li>
            <li>
                <code>(A<sub>x</sub>, A<sub>y</sub>, A<sub>z</sub>)</code> where <code>A<sub>x</sub></code>, <code>A<sub>y</sub></code>, and <code>A<sub>z</sub></code> are all integer powers of two. In this case the following restrictions apply to all image transfer operations:
                <ul>
                    <li>{@code x}, {@code y}, and {@code z} of a ##VkOffset3D parameter <b>must</b> be integer multiples of <code>A<sub>x</sub></code>, <code>A<sub>y</sub></code>, and <code>A<sub>z</sub></code>, respectively.</li>
                    <li>{@code width} of a ##VkExtent3D parameter <b>must</b> be an integer multiple of <code>A<sub>x</sub></code>, or else <code>x + width</code> <b>must</b> equal the width of the image subresource corresponding to the parameter.</li>
                    <li>{@code height} of a ##VkExtent3D parameter <b>must</b> be an integer multiple of <code>A<sub>y</sub></code>, or else <code>y + height</code> <b>must</b> equal the height of the image subresource corresponding to the parameter.</li>
                    <li>{@code depth} of a ##VkExtent3D parameter <b>must</b> be an integer multiple of <code>A<sub>z</sub></code>, or else <code>z + depth</code> <b>must</b> equal the depth of the image subresource corresponding to the parameter.</li>
                    <li>If the format of the image corresponding to the parameters is one of the block-compressed formats then for the purposes of the above calculations the granularity <b>must</b> be scaled up by the compressed texel block dimensions.</li>
                </ul>
            </li>
        </ul>

        Queues supporting graphics and/or compute operations <b>must</b> report <code>(1,1,1)</code> in {@code minImageTransferGranularity}, meaning that there are no additional restrictions on the granularity of image transfer operations for these queues. Other queues supporting image transfer operations are only required: to support whole mip level transfers, thus {@code minImageTransferGranularity} for queues belonging to such queue families <b>may</b> be <code>(0,0,0)</code>.

        The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#memory-device">Device Memory</a> section describes memory properties queried from the physical device.

        For physical device feature queries see the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features">Features</a> chapter.

        <h5>See Also</h5>
        ##VkExtent3D, ##VkQueueFamilyProperties2KHR, #GetPhysicalDeviceQueueFamilyProperties()
        """

    VkQueueFlags.member("queueFlags", "a bitmask of {@code VkQueueFlagBits} indicating capabilities of the queues in this queue family.")
    uint32_t.member("queueCount", "the unsigned integer count of queues in this queue family.")
    uint32_t.member("timestampValidBits", "the unsigned integer count of meaningful bits in the timestamps written via #CmdWriteTimestamp(). The valid range for the count is 36..64 bits, or a value of 0, indicating no support for timestamps. Bits outside the valid range are guaranteed to be zeros.")
    VkExtent3D.member("minImageTransferGranularity", "the minimum granularity supported for image transfer operations on the queues in this queue family.")
}

val VkMemoryType = struct(VULKAN_PACKAGE, "VkMemoryType", mutable = false) {
    documentation =
        """
        Structure specifying memory type.
        """

    VkMemoryPropertyFlags.member("propertyFlags", "a bitmask of {@code VkMemoryPropertyFlagBits} of properties for this memory type.")
    uint32_t.member("heapIndex", "describes which memory heap this memory type corresponds to, and <b>must</b> be less than {@code memoryHeapCount} from the ##VkPhysicalDeviceMemoryProperties structure.")
}

val VkMemoryHeap = struct(VULKAN_PACKAGE, "VkMemoryHeap", mutable = false) {
    documentation =
        """
        Structure specifying a memory heap.
        """

    VkDeviceSize.member("size", "the total memory size in bytes in the heap.")
    VkMemoryHeapFlags.member("flags", "a bitmask of {@code VkMemoryHeapFlagBits} specifying attribute flags for the heap.")
}

val VkPhysicalDeviceMemoryProperties = struct(VULKAN_PACKAGE, "VkPhysicalDeviceMemoryProperties", mutable = false) {
    javaImport("static org.lwjgl.vulkan.VK10.*")
    documentation =
        """
        Structure specifying physical device memory properties.

        <h5>Description</h5>
        The ##VkPhysicalDeviceMemoryProperties structure describes a number of <em>memory heaps</em> as well as a number of <em>memory types</em> that <b>can</b> be used to access memory allocated in those heaps. Each heap describes a memory resource of a particular size, and each memory type describes a set of memory properties (e.g. host cached vs uncached) that <b>can</b> be used with a given memory heap. Allocations using a particular memory type will consume resources from the heap indicated by that memory type's heap index. More than one memory type <b>may</b> share each heap, and the heaps and memory types provide a mechanism to advertise an accurate size of the physical memory resources while allowing the memory to be used with a variety of different properties.

        The number of memory heaps is given by {@code memoryHeapCount} and is less than or equal to #MAX_MEMORY_HEAPS. Each heap is described by an element of the {@code memoryHeaps} array, as a ##VkMemoryHeap structure. The number of memory types available across all memory heaps is given by {@code memoryTypeCount} and is less than or equal to #MAX_MEMORY_TYPES. Each memory type is described by an element of the {@code memoryTypes} array, as a ##VkMemoryType structure.

        At least one heap <b>must</b> include #MEMORY_HEAP_DEVICE_LOCAL_BIT in ##VkMemoryHeap{@code ::flags}. If there are multiple heaps that all have similar performance characteristics, they <b>may</b> all include #MEMORY_HEAP_DEVICE_LOCAL_BIT. In a unified memory architecture (UMA) system, there is often only a single memory heap which is considered to be equally "{@code local}" to the host and to the device, and such an implementation <b>must</b> advertise the heap as device-local.

        Each memory type returned by #GetPhysicalDeviceMemoryProperties() <b>must</b> have its {@code propertyFlags} set to one of the following values:

        <ul>
            <li>0</li>
            <li>#MEMORY_PROPERTY_HOST_VISIBLE_BIT | #MEMORY_PROPERTY_HOST_COHERENT_BIT</li>
            <li>#MEMORY_PROPERTY_HOST_VISIBLE_BIT | #MEMORY_PROPERTY_HOST_CACHED_BIT</li>
            <li>#MEMORY_PROPERTY_HOST_VISIBLE_BIT | #MEMORY_PROPERTY_HOST_CACHED_BIT | #MEMORY_PROPERTY_HOST_COHERENT_BIT</li>
            <li>#MEMORY_PROPERTY_DEVICE_LOCAL_BIT</li>
            <li>#MEMORY_PROPERTY_DEVICE_LOCAL_BIT | #MEMORY_PROPERTY_HOST_VISIBLE_BIT | #MEMORY_PROPERTY_HOST_COHERENT_BIT</li>
            <li>#MEMORY_PROPERTY_DEVICE_LOCAL_BIT | #MEMORY_PROPERTY_HOST_VISIBLE_BIT | #MEMORY_PROPERTY_HOST_CACHED_BIT</li>
            <li>#MEMORY_PROPERTY_DEVICE_LOCAL_BIT | #MEMORY_PROPERTY_HOST_VISIBLE_BIT | #MEMORY_PROPERTY_HOST_CACHED_BIT | #MEMORY_PROPERTY_HOST_COHERENT_BIT</li>
            <li>#MEMORY_PROPERTY_DEVICE_LOCAL_BIT | #MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT</li>
        </ul>

        There <b>must</b> be at least one memory type with both the #MEMORY_PROPERTY_HOST_VISIBLE_BIT and #MEMORY_PROPERTY_HOST_COHERENT_BIT bits set in its {@code propertyFlags}. There <b>must</b> be at least one memory type with the #MEMORY_PROPERTY_DEVICE_LOCAL_BIT bit set in its {@code propertyFlags}.

        The memory types are sorted according to a preorder which serves to aid in easily selecting an appropriate memory type. Given two memory types X and Y, the preorder defines <code>X {leq} Y</code> if:

        <ul>
            <li>the memory property bits set for X are a strict subset of the memory property bits set for Y. Or,</li>
            <li>the memory property bits set for X are the same as the memory property bits set for Y, and X uses a memory heap with greater or equal performance (as determined in an implementation-specific manner).</li>
        </ul>

        Memory types are ordered in the list such that X is assigned a lesser {@code memoryTypeIndex} than Y if <code>(X {leq} Y) {land} {lnot} (Y {leq} X)</code> according to the preorder. Note that the list of all allowed memory property flag combinations above satisfies this preorder, but other orders would as well. The goal of this ordering is to enable applications to use a simple search loop in selecting the proper memory type, along the lines of:

        <code><pre>
￿// Find a memory type in "memoryTypeBits" that includes all of "properties"
￿int32_t FindProperties(uint32_t memoryTypeBits, VkMemoryPropertyFlags properties)
￿{
￿    for (int32_t i = 0; i < memoryTypeCount; ++i)
￿    {
￿        if ((memoryTypeBits & (1 << i)) &&
￿            ((memoryTypes[i].propertyFlags & properties) == properties))
￿            return i;
￿    }
￿    return -1;
￿}
￿
￿// Try to find an optimal memory type, or if it does not exist
￿// find any compatible memory type
￿VkMemoryRequirements memoryRequirements;
￿vkGetImageMemoryRequirements(device, image, &memoryRequirements);
￿int32_t memoryType = FindProperties(memoryRequirements.memoryTypeBits, optimalProperties);
￿if (memoryType == -1)
￿    memoryType = FindProperties(memoryRequirements.memoryTypeBits, requiredProperties);</pre></code>

        The loop will find the first supported memory type that has all bits requested in {@code properties} set. If there is no exact match, it will find a closest match (i.e. a memory type with the fewest additional bits set), which has some additional bits set but which are not detrimental to the behaviors requested by {@code properties}. The application <b>can</b> first search for the optimal properties, e.g. a memory type that is device-local or supports coherent cached accesses, as appropriate for the intended usage, and if such a memory type is not present <b>can</b> fallback to searching for a less optimal but guaranteed set of properties such as "0" or "host-visible and coherent".

        <h5>See Also</h5>
        ##VkMemoryHeap, ##VkMemoryType, ##VkPhysicalDeviceMemoryProperties2KHR, #GetPhysicalDeviceMemoryProperties()
        """

    AutoSize("memoryTypes")..uint32_t.member("memoryTypeCount", "the number of valid elements in the {@code memoryTypes} array.")
    VkMemoryType.array("memoryTypes", "an array of ##VkMemoryType structures describing the <em>memory types</em> that <b>can</b> be used to access memory allocated from the heaps specified by {@code memoryHeaps}.", size = "VK_MAX_MEMORY_TYPES")
    AutoSize("memoryHeaps")..uint32_t.member("memoryHeapCount", "the number of valid elements in the {@code memoryHeaps} array.")
    VkMemoryHeap.array("memoryHeaps", "an array of ##VkMemoryHeap structures describing the <em>memory heaps</em> from which memory <b>can</b> be allocated.", size = "VK_MAX_MEMORY_HEAPS")
}

val VkDeviceQueueCreateInfo = struct(VULKAN_PACKAGE, "VkDeviceQueueCreateInfo") {
    documentation =
        """
        Structure specifying parameters of a newly created device queue.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code queueFamilyIndex} <b>must</b> be less than {@code pQueueFamilyPropertyCount} returned by #GetPhysicalDeviceQueueFamilyProperties()</li>
            <li>{@code queueCount} <b>must</b> be less than or equal to the {@code queueCount} member of the ##VkQueueFamilyProperties structure, as returned by #GetPhysicalDeviceQueueFamilyProperties() in the {@code pQueueFamilyProperties}[{@code queueFamilyIndex}]</li>
            <li>Each element of {@code pQueuePriorities} <b>must</b> be between {@code 0.0} and {@code 1.0} inclusive</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code flags} <b>must</b> be 0</li>
            <li>{@code pQueuePriorities} <b>must</b> be a pointer to an array of {@code queueCount} {@code float} values</li>
            <li>{@code queueCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##VkDeviceCreateInfo
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkDeviceQueueCreateFlags.member("flags", "reserved for future use.")
    uint32_t.member("queueFamilyIndex", "an unsigned integer indicating the index of the queue family to create on this device. This index corresponds to the index of an element of the {@code pQueueFamilyProperties} array that was returned by #GetPhysicalDeviceQueueFamilyProperties().")
    AutoSize("pQueuePriorities")..uint32_t.member("queueCount", "an unsigned integer specifying the number of queues to create in the queue family indicated by {@code queueFamilyIndex}.")
    const..float_p.member("pQueuePriorities", "an array of {@code queueCount} normalized floating point values, specifying priorities of work that will be submitted to each created queue. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#devsandqueues-priority\">Queue Priority</a> for more information.")
}

val VkDeviceCreateInfo = struct(VULKAN_PACKAGE, "VkDeviceCreateInfo") {
    documentation =
        """
        Structure specifying parameters of a newly created device.

        <h5>Valid Usage</h5>
        <ul>
            <li>The {@code queueFamilyIndex} member of any given element of {@code pQueueCreateInfos} <b>must</b> be unique within {@code pQueueCreateInfos}</li>
            <li>If the {@code pNext} chain includes a ##VkPhysicalDeviceFeatures2KHR structure, then {@code pEnabledFeatures} <b>must</b> be {@code NULL}</li>
            <li>{@code ppEnabledExtensionNames} <b>must</b> not contain both #KHR_maintenance1 and #AMD_negative_viewport_height</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DEVICE_CREATE_INFO</li>
            <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of ##VkPhysicalDeviceFeatures2KHR, ##VkPhysicalDeviceMultiviewFeaturesKHX, or ##VkDeviceGroupDeviceCreateInfoKHX</li>
            <li>Each {@code sType} member in the {@code pNext} chain <b>must</b> be unique</li>
            <li>{@code flags} <b>must</b> be 0</li>
            <li>{@code pQueueCreateInfos} <b>must</b> be a pointer to an array of {@code queueCreateInfoCount} valid ##VkDeviceQueueCreateInfo structures</li>
            <li>If {@code enabledLayerCount} is not 0, {@code ppEnabledLayerNames} <b>must</b> be a pointer to an array of {@code enabledLayerCount} null-terminated UTF-8 strings</li>
            <li>If {@code enabledExtensionCount} is not 0, {@code ppEnabledExtensionNames} <b>must</b> be a pointer to an array of {@code enabledExtensionCount} null-terminated UTF-8 strings</li>
            <li>If {@code pEnabledFeatures} is not {@code NULL}, {@code pEnabledFeatures} <b>must</b> be a pointer to a valid ##VkPhysicalDeviceFeatures structure</li>
            <li>{@code queueCreateInfoCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##VkDeviceQueueCreateInfo, ##VkPhysicalDeviceFeatures, #CreateDevice()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkDeviceCreateFlags.member("flags", "reserved for future use.")
    AutoSize("pQueueCreateInfos")..uint32_t.member("queueCreateInfoCount", "the unsigned integer size of the {@code pQueueCreateInfos} array. Refer to the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#devsandqueues-queue-creation\">Queue Creation</a> section below for further details.")
    const..VkDeviceQueueCreateInfo.p.buffer("pQueueCreateInfos", "a pointer to an array of ##VkDeviceQueueCreateInfo structures describing the queues that are requested to be created along with the logical device. Refer to the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#devsandqueues-queue-creation\">Queue Creation</a> section below for further details.")
    AutoSize("ppEnabledLayerNames", optional = true)..uint32_t.member("enabledLayerCount", "deprecated and ignored.")
    const..charUTF8_p_const_p.member("ppEnabledLayerNames", "deprecated and ignored. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#extended-functionality-device-layer-deprecation\">Device Layer Deprecation</a>.")
    AutoSize("ppEnabledExtensionNames", optional = true)..uint32_t.member("enabledExtensionCount", "the number of device extensions to enable.")
    const..charUTF8_p_const_p.member("ppEnabledExtensionNames", "a pointer to an array of {@code enabledExtensionCount} null-terminated UTF-8 strings containing the names of extensions to enable for the created device. See the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#extended-functionality-extensions\">Extensions</a> section for further details.")
    nullable..const..VkPhysicalDeviceFeatures.p.member("pEnabledFeatures", "{@code NULL} or a pointer to a ##VkPhysicalDeviceFeatures structure that contains boolean indicators of all the features to be enabled. Refer to the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#features-features\">Features</a> section for further details.")
}

val VkExtensionProperties = struct(VULKAN_PACKAGE, "VkExtensionProperties", mutable = false) {
    javaImport("static org.lwjgl.vulkan.VK10.*")
    documentation =
        """
        Structure specifying a extension properties.
        """

    charUTF8.array("extensionName", "a null-terminated string specifying the name of the extension.", size = "VK_MAX_EXTENSION_NAME_SIZE")
    uint32_t.member("specVersion", "the version of this extension. It is an integer, incremented with backward compatible changes.")
}

val VkLayerProperties = struct(VULKAN_PACKAGE, "VkLayerProperties", mutable = false) {
    javaImport("static org.lwjgl.vulkan.VK10.*")
    documentation =
        """
        Structure specifying layer properties.
        """

    charUTF8.array("layerName", "a null-terminated UTF-8 string specifying the name of the layer. Use this name in the {@code ppEnabledLayerNames} array passed in the ##VkInstanceCreateInfo structure to enable this layer for an instance.", size = "VK_MAX_EXTENSION_NAME_SIZE")
    uint32_t.member("specVersion", "the Vulkan version the layer was written to, encoded as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#fundamentals-versionnum\">API Version Numbers and Semantics</a> section.")
    uint32_t.member("implementationVersion", "the version of this layer. It is an integer, increasing with backward compatible changes.")
    charUTF8.array("description", "a null-terminated UTF-8 string providing additional details that <b>can</b> be used by the application to identify the layer.", size = "VK_MAX_DESCRIPTION_SIZE")
}

val VkSubmitInfo = struct(VULKAN_PACKAGE, "VkSubmitInfo") {
    documentation =
        """
        Structure specifying a queue submit operation.

        <h5>Description</h5>
        The order that command buffers appear in {@code pCommandBuffers} is used to determine <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-submission-order">submission order</a>, and thus all the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-implicit">implicit ordering guarantees</a> that respect it. Other than these implicit ordering guarantees and any <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization">explicit synchronization primitives</a>, these command buffers <b>may</b> overlap or otherwise execute out of order.

        <h5>Valid Usage</h5>
        <ul>
            <li>Any given element of {@code pCommandBuffers} <b>must</b> not have been allocated with #COMMAND_BUFFER_LEVEL_SECONDARY</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-geometryShader">geometry shaders</a> feature is not enabled, any given element of {@code pWaitDstStageMask} <b>must</b> not contain #PIPELINE_STAGE_GEOMETRY_SHADER_BIT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-tessellationShader">tessellation shaders</a> feature is not enabled, any given element of {@code pWaitDstStageMask} <b>must</b> not contain #PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT or #PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT</li>
            <li>Any given element of {@code pWaitDstStageMask} <b>must</b> not include #PIPELINE_STAGE_HOST_BIT.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_SUBMIT_INFO</li>
            <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of ##VkWin32KeyedMutexAcquireReleaseInfoNV, ##VkWin32KeyedMutexAcquireReleaseInfoKHX, ##VkD3D12FenceSubmitInfoKHX, or ##VkDeviceGroupSubmitInfoKHX</li>
            <li>Each {@code sType} member in the {@code pNext} chain <b>must</b> be unique</li>
            <li>If {@code waitSemaphoreCount} is not 0, {@code pWaitSemaphores} <b>must</b> be a pointer to an array of {@code waitSemaphoreCount} valid {@code VkSemaphore} handles</li>
            <li>If {@code waitSemaphoreCount} is not 0, {@code pWaitDstStageMask} <b>must</b> be a pointer to an array of {@code waitSemaphoreCount} valid combinations of {@code VkPipelineStageFlagBits} values</li>
            <li>Each element of {@code pWaitDstStageMask} <b>must</b> not be 0</li>
            <li>If {@code commandBufferCount} is not 0, {@code pCommandBuffers} <b>must</b> be a pointer to an array of {@code commandBufferCount} valid {@code VkCommandBuffer} handles</li>
            <li>If {@code signalSemaphoreCount} is not 0, {@code pSignalSemaphores} <b>must</b> be a pointer to an array of {@code signalSemaphoreCount} valid {@code VkSemaphore} handles</li>
            <li>Each of the elements of {@code pCommandBuffers}, the elements of {@code pSignalSemaphores}, and the elements of {@code pWaitSemaphores} that are valid handles <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>See Also</h5>
        #QueueSubmit()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    AutoSize("pWaitSemaphores", "pWaitDstStageMask", optional = true)..uint32_t.member("waitSemaphoreCount", "the number of semaphores upon which to wait before executing the command buffers for the batch.")
    const..VkSemaphore.p.member("pWaitSemaphores", "a pointer to an array of semaphores upon which to wait before the command buffers for this batch begin execution. If semaphores to wait on are provided, they define a <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#synchronization-semaphores-waiting\">semaphore wait operation</a>.")
    const..VkPipelineStageFlags.p.member("pWaitDstStageMask", "a pointer to an array of pipeline stages at which each corresponding semaphore wait will occur.")
    AutoSize("pCommandBuffers", optional = true)..uint32_t.member("commandBufferCount", "the number of command buffers to execute in the batch.")
    const..VkCommandBuffer.p.member("pCommandBuffers", "a pointer to an array of command buffers to execute in the batch.")
    AutoSize("pSignalSemaphores", optional = true)..uint32_t.member("signalSemaphoreCount", "the number of semaphores to be signaled once the commands specified in {@code pCommandBuffers} have completed execution.")
    const..VkSemaphore.p.member("pSignalSemaphores", "a pointer to an array of semaphores which will be signaled when the command buffers for this batch have completed execution. If semaphores to be signaled are provided, they define a <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#synchronization-semaphores-signaling\">semaphore signal operation</a>.")
}

val VkMemoryAllocateInfo = struct(VULKAN_PACKAGE, "VkMemoryAllocateInfo") {
    documentation =
        """
        Structure containing parameters of a memory allocation.

        <h5>Description</h5>
        If the {@code pNext} chain contains an instance of ##VkImportMemoryWin32HandleInfoKHX with a non-zero value for ##VkImportMemoryWin32HandleInfoKHX{@code ::handleType}, or ##VkImportMemoryFdInfoKHX with a non-zero value for ##VkImportMemoryFdInfoKHX{@code ::handleType}, the ##VkMemoryAllocateInfo instance defines a memory import operation. Importing memory <b>must</b> not modify the content of the memory. Implementations <b>must</b> ensure that importing memory does not enable the importing Vulkan instance to access any memory or resources in other Vulkan instances other than that corresponding to the memory object imported. Implementations <b>must</b> also ensure accessing imported memory which has not been initialized does not allow the importing Vulkan instance to obtain data from the exporting Vulkan instance or vice-versa.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        How exported and imported memory is isolated is left to the implementation, but applications should be aware that such isolation <b>may</b> prevent implementations from placing multiple exportable memory objects in the same physical or virtual page. Hence, applications <b>should</b> avoid creating many small external memory objects whenever possible.
        </div>

        When performing a memory import operation, it is the responsibility of the application to ensure the external handles meet all valid usage requirements. However, implementations <b>must</b> perform sufficient validation of external handles to ensure that the operation results in a valid memory object which will not cause program termination, device loss, queue stalls, or corruption of other resources when used as allowed according to its allocation parameters. If the external handle provided does not meet these requirements, the implementation <b>must</b> fail the memory import operation with the error code #ERROR_INVALID_EXTERNAL_HANDLE_KHX.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code allocationSize} <b>must</b> be less than or equal to the amount of memory available to the ##VkMemoryHeap specified by {@code memoryTypeIndex} and the calling command&#8217;s {@code VkDevice}</li>
            <li>{@code allocationSize} <b>must</b> be greater than 0</li>
            <li>If the {@code pNext} chain contains an instance of ##VkExportMemoryAllocateInfoKHX, and any of the handle types specified in ##VkExportMemoryAllocateInfoKHX{@code ::handleTypes} require a dedicated allocation, as reported by #GetPhysicalDeviceImageFormatProperties2KHR() in ##VkExternalImageFormatPropertiesKHX{@code ::externalMemoryProperties}{@code ::externalMemoryFeatures} or ##VkExternalBufferPropertiesKHX{@code ::externalMemoryProperties}{@code ::externalMemoryFeatures}, the {@code pNext} chain <b>must</b> contain an instance of ##VkDedicatedAllocationMemoryAllocateInfoNV with either its {@code image} or {@code buffer} field set to a value other than #NULL_HANDLE.</li>
            <li>If the {@code pNext} chain contains an instance of ##VkExportMemoryAllocateInfoKHX, it <b>must</b> not contain an instance of ##VkExportMemoryAllocateInfoNV or ##VkExportMemoryWin32HandleInfoNV.</li>
            <li>If the {@code pNext} chain contains an instance of ##VkImportMemoryWin32HandleInfoKHX, it <b>must</b> not contain an instance of ##VkImportMemoryWin32HandleInfoNV.</li>
            <li>If the parameters define an import operation and the external handle specified was created by the Vulkan API, the values of {@code allocationSize} and {@code memoryTypeIndex} <b>must</b> match those specified when the memory object being imported was created.</li>
            <li>If the parameters define an import operation and the external handle specified was created by the Vulkan API, the device mask specified by ##VkMemoryAllocateFlagsInfoKHX <b>must</b> match that specified when the memory object being imported was allocated.</li>
            <li>If the parameters define an import operation and the external handle specified was created by the Vulkan API, the list of physical devices that comprise the logical device passed to #AllocateMemory() <b>must</b> match the list of physical devices that comprise the logical device on which the memory was originally allocated.</li>
            <li>If the parameters define an import operation and the external handle is an NT handle or a global share handle created outside of the Vulkan API, the value of {@code memoryTypeIndex} <b>must</b> be one of those returned by {@code vkGetMemoryWin32HandlePropertiesKHX}.</li>
            <li>If the parameters define an import operation and the external handle type is #EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT_KHX, #EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT_KHX, or #EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT_KHX, {@code allocationSize} <b>must</b> match the size reported in the memory requirements of the {@code image} or {@code buffer} member of the instance of ##VkDedicatedAllocationMemoryAllocateInfoNV included in the {@code pNext} chain.</li>
            <li>If the parameters define an import operation and the external handle type is #EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT_KHX, {@code allocationSize} <b>must</b> match the size specified when creating the Direct3D 12 heap from which the external handle was extracted.</li>
            <li>If the parameters define an import operation and the external handle is a POSIX file descriptor created outside of the Vulkan API, the value of {@code memoryTypeIndex} <b>must</b> be one of those returned by {@code vkGetMemoryFdPropertiesKHX}.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO</li>
            <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of ##VkDedicatedAllocationMemoryAllocateInfoNV or ##VkMemoryAllocateFlagsInfoKHX</li>
            <li>Each {@code sType} member in the {@code pNext} chain <b>must</b> be unique</li>
        </ul>

        <h5>See Also</h5>
        #AllocateMemory()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkDeviceSize.member("allocationSize", "the size of the allocation in bytes")
    uint32_t.member("memoryTypeIndex", "the memory type index, which selects the properties of the memory to be allocated, as well as the heap the memory will come from.")
}

val VkMappedMemoryRange = struct(VULKAN_PACKAGE, "VkMappedMemoryRange") {
    documentation =
        """
        Structure specifying a mapped memory range.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code memory} <b>must</b> currently be mapped</li>
            <li>If {@code size} is not equal to #WHOLE_SIZE, {@code offset} and {@code size} <b>must</b> specify a range contained within the currently mapped range of {@code memory}</li>
            <li>If {@code size} is equal to #WHOLE_SIZE, {@code offset} <b>must</b> be within the currently mapped range of {@code memory}</li>
            <li>If {@code size} is equal to #WHOLE_SIZE, the end of the current mapping of {@code memory} <b>must</b> be a multiple of ##VkPhysicalDeviceLimits{@code ::nonCoherentAtomSize} bytes from the beginning of the memory object.</li>
            <li>{@code offset} <b>must</b> be a multiple of ##VkPhysicalDeviceLimits{@code ::nonCoherentAtomSize}</li>
            <li>If {@code size} is not equal to #WHOLE_SIZE, {@code size} <b>must</b> either be a multiple of ##VkPhysicalDeviceLimits{@code ::nonCoherentAtomSize}, or {@code offset} plus {@code size} <b>must</b> equal the size of {@code memory}.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_MAPPED_MEMORY_RANGE</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
        </ul>

        <h5>See Also</h5>
        #FlushMappedMemoryRanges(), #InvalidateMappedMemoryRanges()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkDeviceMemory.member("memory", "the memory object to which this range belongs.")
    VkDeviceSize.member("offset", "the zero-based byte offset from the beginning of the memory object.")
    VkDeviceSize.member("size", "either the size of range, or #WHOLE_SIZE to affect the range from {@code offset} to the end of the current mapping of the allocation.")
}

val VkMemoryRequirements = struct(VULKAN_PACKAGE, "VkMemoryRequirements", mutable = false) {
    documentation =
        """
        Structure specifying memory requirements.
        """

    VkDeviceSize.member("size", "the size, in bytes, of the memory allocation required: for the resource.")
    VkDeviceSize.member("alignment", "the alignment, in bytes, of the offset within the allocation required: for the resource.")
    uint32_t.member("memoryTypeBits", "a bitmask and contains one bit set for every supported memory type for the resource. Bit {@code i} is set if and only if the memory type {@code i} in the ##VkPhysicalDeviceMemoryProperties structure for the physical device is supported for the resource.")
}

val VkSparseImageFormatProperties = struct(VULKAN_PACKAGE, "VkSparseImageFormatProperties", mutable = false) {
    documentation =
        """
        Structure specifying sparse image format properties.
        """

    VkImageAspectFlags.member("aspectMask", "a bitmask {@code VkImageAspectFlagBits} specifying which aspects of the image the properties apply to.")
    VkExtent3D.member("imageGranularity", "the width, height, and depth of the sparse image block in texels or compressed texel blocks.")
    VkSparseImageFormatFlags.member("flags", "a bitmask of {@code VkSparseImageFormatFlagBits} specifying additional information about the sparse resource.")
}

val VkSparseImageMemoryRequirements = struct(VULKAN_PACKAGE, "VkSparseImageMemoryRequirements", mutable = false) {
    documentation =
        """
        Structure specifying sparse image memory requirements.
        """

    VkSparseImageFormatProperties.member("formatProperties", """{@code formatProperties.aspectMask} is the set of aspects of the image that this sparse memory requirement applies to. This will usually have a single aspect specified. However, depth/stencil images <b>may</b> have depth and stencil data interleaved in the same sparse block, in which case both #IMAGE_ASPECT_DEPTH_BIT and #IMAGE_ASPECT_STENCIL_BIT would be present.

        {@code formatProperties.imageGranularity} describes the dimensions of a single bindable sparse image block in pixel units. For aspect #IMAGE_ASPECT_METADATA_BIT, all dimensions will be zero pixels. All metadata is located in the mip tail region.

        {@code formatProperties.flags} is a bitmask of {@code VkSparseImageFormatFlagBits}:
<ul>
            <li>If #SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT is set the image uses a single mip tail region for all array layers.</li>
            <li>If #SPARSE_IMAGE_FORMAT_ALIGNED_MIP_SIZE_BIT is set the dimensions of mip levels <b>must</b> be integer multiples of the corresponding dimensions of the sparse image block for levels not located in the mip tail.</li>
            <li>If #SPARSE_IMAGE_FORMAT_NONSTANDARD_BLOCK_SIZE_BIT is set the image uses non-standard sparse image block dimensions. The {@code formatProperties.imageGranularity} values do not match the standard sparse image block dimension corresponding to the image&#8217;s pixel format.</li>
        </ul>""")
    uint32_t.member("imageMipTailFirstLod", "the first mip level at which image subresources are included in the mip tail region.")
    VkDeviceSize.member("imageMipTailSize", "the memory size (in bytes) of the mip tail region. If {@code formatProperties.flags} contains #SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT, this is the size of the whole mip tail, otherwise this is the size of the mip tail of a single array layer. This value is guaranteed to be a multiple of the sparse block size in bytes.")
    VkDeviceSize.member("imageMipTailOffset", "the opaque memory offset used with ##VkSparseImageOpaqueMemoryBindInfo to bind the mip tail region(s).")
    VkDeviceSize.member("imageMipTailStride", "the offset stride between each array-layer&#8217;s mip tail, if {@code formatProperties.flags} does not contain #SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT (otherwise the value is undefined).")
}

val VkSparseMemoryBind = struct(VULKAN_PACKAGE, "VkSparseMemoryBind") {
    documentation =
        """
        Structure specifying a sparse memory bind operation.

        <h5>Description</h5>
        The <em>binding range</em> <code>[resourceOffset, resourceOffset {plus} size)</code> has different constraints based on {@code flags}. If {@code flags} contains #SPARSE_MEMORY_BIND_METADATA_BIT, the binding range <b>must</b> be within the mip tail region of the metadata aspect. This metadata region is defined by:

        <dl>
            <dd><code>metadataRegion = [base, base + imageMipTailSize)</code></dd>

            <dd><code>base = imageMipTailOffset + imageMipTailStride × n</code></dd>
        </dl>

        and {@code imageMipTailOffset}, {@code imageMipTailSize}, and {@code imageMipTailStride} values are from the ##VkSparseImageMemoryRequirements corresponding to the metadata aspect of the image, and <code>n</code> is a valid array layer index for the image,

        {@code imageMipTailStride} is considered to be zero for aspects where ##VkSparseImageMemoryRequirements{@code ::formatProperties}.flags contains #SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT.

        If {@code flags} does not contain #SPARSE_MEMORY_BIND_METADATA_BIT, the binding range <b>must</b> be within the range <code>[0,##VkMemoryRequirements::size)</code>.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code memory} is not #NULL_HANDLE, {@code memory} and {@code memoryOffset} <b>must</b> match the memory requirements of the resource, as described in section <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#resources-association">the “Resource Memory Association” section</a></li>
            <li>If {@code memory} is not #NULL_HANDLE, {@code memory} <b>must</b> not have been created with a memory type that reports #MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT bit set</li>
            <li>{@code size} <b>must</b> be greater than 0</li>
            <li>{@code resourceOffset} <b>must</b> be less than the size of the resource</li>
            <li>{@code size} <b>must</b> be less than or equal to the size of the resource minus {@code resourceOffset}</li>
            <li>{@code memoryOffset} <b>must</b> be less than the size of {@code memory}</li>
            <li>{@code size} <b>must</b> be less than or equal to the size of {@code memory} minus {@code memoryOffset}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>If {@code memory} is not #NULL_HANDLE, {@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkSparseMemoryBindFlagBits} values</li>
        </ul>

        <h5>See Also</h5>
        ##VkSparseBufferMemoryBindInfo, ##VkSparseImageOpaqueMemoryBindInfo
        """

    VkDeviceSize.member("resourceOffset", "the offset into the resource.")
    VkDeviceSize.member("size", "the size of the memory region to be bound.")
    VkDeviceMemory.member("memory", "the {@code VkDeviceMemory} object that the range of the resource is bound to. If {@code memory} is #NULL_HANDLE, the range is unbound.")
    VkDeviceSize.member("memoryOffset", "the offset into the {@code VkDeviceMemory} object to bind the resource range to. If {@code memory} is #NULL_HANDLE, this value is ignored.")
    VkSparseMemoryBindFlags.member("flags", "a bitmask of {@code VkSparseMemoryBindFlagBits} specifying usage of the binding operation.")
}

val VkSparseBufferMemoryBindInfo = struct(VULKAN_PACKAGE, "VkSparseBufferMemoryBindInfo") {
    documentation =
        """
        Structure specifying a sparse buffer memory bind operation.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code pBinds} <b>must</b> be a pointer to an array of {@code bindCount} valid ##VkSparseMemoryBind structures</li>
            <li>{@code bindCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##VkBindSparseInfo, ##VkSparseMemoryBind
        """

    VkBuffer.member("buffer", "the {@code VkBuffer} object to be bound.")
    AutoSize("pBinds")..uint32_t.member("bindCount", "the number of ##VkSparseMemoryBind structures in the {@code pBinds} array.")
    const..VkSparseMemoryBind.p.buffer("pBinds", "a pointer to array of ##VkSparseMemoryBind structures.")
}

val VkSparseImageOpaqueMemoryBindInfo = struct(VULKAN_PACKAGE, "VkSparseImageOpaqueMemoryBindInfo") {
    documentation =
        """
        Structure specifying sparse image opaque memory bind info.

        <h5>Valid Usage</h5>
        <ul>
            <li>For any given element of {@code pBinds}, if the {@code flags} member of that element contains #SPARSE_MEMORY_BIND_METADATA_BIT, the binding range defined <b>must</b> be within the mip tail region of the metadata aspect of {@code image}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
            <li>{@code pBinds} <b>must</b> be a pointer to an array of {@code bindCount} valid ##VkSparseMemoryBind structures</li>
            <li>{@code bindCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##VkBindSparseInfo, ##VkSparseMemoryBind
        """

    VkImage.member("image", "the {@code VkImage} object to be bound.")
    AutoSize("pBinds")..uint32_t.member("bindCount", "the number of ##VkSparseMemoryBind structures in the {@code pBinds} array.")
    const..VkSparseMemoryBind.p.buffer("pBinds", "a pointer to array of ##VkSparseMemoryBind structures.")
}

val VkImageSubresource = struct(VULKAN_PACKAGE, "VkImageSubresource") {
    documentation =
        """
        Structure specifying a image subresource.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code mipLevel} <b>must</b> be less than the {@code mipLevels} specified in ##VkImageCreateInfo when the image was created</li>
            <li>{@code arrayLayer} <b>must</b> be less than the {@code arrayLayers} specified in ##VkImageCreateInfo when the image was created</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code aspectMask} <b>must</b> be a valid combination of {@code VkImageAspectFlagBits} values</li>
            <li>{@code aspectMask} <b>must</b> not be 0</li>
        </ul>

        <h5>See Also</h5>
        ##VkSparseImageMemoryBind, #GetImageSubresourceLayout()
        """

    VkImageAspectFlags.member("aspectMask", "a {@code VkImageAspectFlags} selecting the image <em>aspect</em>.")
    uint32_t.member("mipLevel", "selects the mipmap level.")
    uint32_t.member("arrayLayer", "selects the array layer.")
}

val VkOffset3D = struct(VULKAN_PACKAGE, "VkOffset3D") {
    documentation =
        """
        Structure specifying a three-dimensional offset.
        """

    int32_t.member("x", "")
    int32_t.member("y", "")
    int32_t.member("z", "")
}

val VkSparseImageMemoryBind = struct(VULKAN_PACKAGE, "VkSparseImageMemoryBind") {
    documentation =
        """
        Structure specifying sparse image memory bind.

        <h5>Valid Usage</h5>
        <ul>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-sparseResidencyAliased">sparse aliased residency</a> feature is not enabled, and if any other resources are bound to ranges of {@code memory}, the range of {@code memory} being bound <b>must</b> not overlap with those bound ranges</li>
            <li>{@code memory} and {@code memoryOffset} <b>must</b> match the memory requirements of the calling command&#8217;s {@code image}, as described in section <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#resources-association">the “Resource Memory Association” section</a></li>
            <li>{@code subresource} <b>must</b> be a valid image subresource for {@code image} (see <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#resources-image-views">the “Image Views” section</a>)</li>
            <li>{@code offset.x} <b>must</b> be a multiple of the sparse image block width (##VkSparseImageFormatProperties{@code ::imageGranularity}.width) of the image</li>
            <li>{@code extent.width} <b>must</b> either be a multiple of the sparse image block width of the image, or else <code>(extent.width offset.x)</code> <b>must</b> equal the width of the image subresource</li>
            <li>{@code offset.y} <b>must</b> be a multiple of the sparse image block height (##VkSparseImageFormatProperties{@code ::imageGranularity}.height) of the image</li>
            <li>{@code extent.height} <b>must</b> either be a multiple of the sparse image block height of the image, or else <code>(extent.height offset.y)</code> <b>must</b> equal the height of the image subresource</li>
            <li>{@code offset.z} <b>must</b> be a multiple of the sparse image block depth (##VkSparseImageFormatProperties{@code ::imageGranularity}.depth) of the image</li>
            <li>{@code extent.depth} <b>must</b> either be a multiple of the sparse image block depth of the image, or else <code>(extent.depth offset.z)</code> <b>must</b> equal the depth of the image subresource</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code subresource} <b>must</b> be a valid ##VkImageSubresource structure</li>
            <li>If {@code memory} is not #NULL_HANDLE, {@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkSparseMemoryBindFlagBits} values</li>
        </ul>

        <h5>See Also</h5>
        ##VkExtent3D, ##VkImageSubresource, ##VkOffset3D, ##VkSparseImageMemoryBindInfo
        """

    VkImageSubresource.member("subresource", "the aspectMask and region of interest in the image.")
    VkOffset3D.member("offset", "are the coordinates of the first texel within the image subresource to bind.")
    VkExtent3D.member("extent", "the size in texels of the region within the image subresource to bind. The extent <b>must</b> be a multiple of the sparse image block dimensions, except when binding sparse image blocks along the edge of an image subresource it <b>can</b> instead be such that any coordinate of <code>offset + extent</code> equals the corresponding dimensions of the image subresource.")
    VkDeviceMemory.member("memory", "the {@code VkDeviceMemory} object that the sparse image blocks of the image are bound to. If {@code memory} is #NULL_HANDLE, the sparse image blocks are unbound.")
    VkDeviceSize.member("memoryOffset", "an offset into {@code VkDeviceMemory} object. If {@code memory} is #NULL_HANDLE, this value is ignored.")
    VkSparseMemoryBindFlags.member("flags", "are sparse memory binding flags.")
}

val VkSparseImageMemoryBindInfo = struct(VULKAN_PACKAGE, "VkSparseImageMemoryBindInfo") {
    documentation =
        """
        Structure specifying sparse image memory bind info.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
            <li>{@code pBinds} <b>must</b> be a pointer to an array of {@code bindCount} valid ##VkSparseImageMemoryBind structures</li>
            <li>{@code bindCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##VkBindSparseInfo, ##VkSparseImageMemoryBind
        """

    VkImage.member("image", "the {@code VkImage} object to be bound")
    AutoSize("pBinds")..uint32_t.member("bindCount", "the number of ##VkSparseImageMemoryBind structures in pBinds array")
    const..VkSparseImageMemoryBind.p.buffer("pBinds", "a pointer to array of ##VkSparseImageMemoryBind structures")
}

val VkBindSparseInfo = struct(VULKAN_PACKAGE, "VkBindSparseInfo") {
    documentation =
        """
        Structure specifying a sparse binding operation.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_BIND_SPARSE_INFO</li>
            <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of ##VkDeviceGroupBindSparseInfoKHX</li>
            <li>If {@code waitSemaphoreCount} is not 0, {@code pWaitSemaphores} <b>must</b> be a pointer to an array of {@code waitSemaphoreCount} valid {@code VkSemaphore} handles</li>
            <li>If {@code bufferBindCount} is not 0, {@code pBufferBinds} <b>must</b> be a pointer to an array of {@code bufferBindCount} valid ##VkSparseBufferMemoryBindInfo structures</li>
            <li>If {@code imageOpaqueBindCount} is not 0, {@code pImageOpaqueBinds} <b>must</b> be a pointer to an array of {@code imageOpaqueBindCount} valid ##VkSparseImageOpaqueMemoryBindInfo structures</li>
            <li>If {@code imageBindCount} is not 0, {@code pImageBinds} <b>must</b> be a pointer to an array of {@code imageBindCount} valid ##VkSparseImageMemoryBindInfo structures</li>
            <li>If {@code signalSemaphoreCount} is not 0, {@code pSignalSemaphores} <b>must</b> be a pointer to an array of {@code signalSemaphoreCount} valid {@code VkSemaphore} handles</li>
            <li>Both of the elements of {@code pSignalSemaphores}, and the elements of {@code pWaitSemaphores} that are valid handles <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>See Also</h5>
        ##VkSparseBufferMemoryBindInfo, ##VkSparseImageMemoryBindInfo, ##VkSparseImageOpaqueMemoryBindInfo, #QueueBindSparse()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    AutoSize("pWaitSemaphores", optional = true)..uint32_t.member("waitSemaphoreCount", "the number of semaphores upon which to wait before executing the sparse binding operations for the batch.")
    const..VkSemaphore.p.member("pWaitSemaphores", "a pointer to an array of semaphores upon which to wait on before the sparse binding operations for this batch begin execution. If semaphores to wait on are provided, they define a <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#synchronization-semaphores-waiting\">semaphore wait operation</a>.")
    AutoSize("pBufferBinds", optional = true)..uint32_t.member("bufferBindCount", "the number of sparse buffer bindings to perform in the batch.")
    const..VkSparseBufferMemoryBindInfo.p.buffer("pBufferBinds", "a pointer to an array of ##VkSparseBufferMemoryBindInfo structures.")
    AutoSize("pImageOpaqueBinds", optional = true)..uint32_t.member("imageOpaqueBindCount", "the number of opaque sparse image bindings to perform.")
    const..VkSparseImageOpaqueMemoryBindInfo.p.buffer("pImageOpaqueBinds", "a pointer to an array of ##VkSparseImageOpaqueMemoryBindInfo structures, indicating opaque sparse image bindings to perform.")
    AutoSize("pImageBinds", optional = true)..uint32_t.member("imageBindCount", "the number of sparse image bindings to perform.")
    const..VkSparseImageMemoryBindInfo.p.buffer("pImageBinds", "a pointer to an array of ##VkSparseImageMemoryBindInfo structures, indicating sparse image bindings to perform.")
    AutoSize("pSignalSemaphores", optional = true)..uint32_t.member("signalSemaphoreCount", "the number of semaphores to be signaled once the sparse binding operations specified by the structure have completed execution.")
    const..VkSemaphore.p.member("pSignalSemaphores", "a pointer to an array of semaphores which will be signaled when the sparse binding operations for this batch have completed execution. If semaphores to be signaled are provided, they define a <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#synchronization-semaphores-signaling\">semaphore signal operation</a>.")
}

val VkFenceCreateInfo = struct(VULKAN_PACKAGE, "VkFenceCreateInfo") {
    documentation =
        """
        Structure specifying parameters of a newly created fence.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_FENCE_CREATE_INFO</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkFenceCreateFlagBits} values</li>
        </ul>

        <h5>See Also</h5>
        #CreateFence()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkFenceCreateFlags.member("flags", "a bitmask of {@code VkFenceCreateFlagBits} specifying the initial state and behavior of the fence.")
}

val VkSemaphoreCreateInfo = struct(VULKAN_PACKAGE, "VkSemaphoreCreateInfo") {
    documentation =
        """
        Structure specifying parameters of a newly created semaphore.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_SEMAPHORE_CREATE_INFO</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code flags} <b>must</b> be 0</li>
        </ul>

        <h5>See Also</h5>
        #CreateSemaphore()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkSemaphoreCreateFlags.member("flags", "reserved for future use.")
}

val VkEventCreateInfo = struct(VULKAN_PACKAGE, "VkEventCreateInfo") {
    documentation =
        """
        Structure specifying parameters of a newly created event.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_EVENT_CREATE_INFO</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code flags} <b>must</b> be 0</li>
        </ul>

        <h5>See Also</h5>
        #CreateEvent()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkEventCreateFlags.member("flags", "reserved for future use.")
}

val VkQueryPoolCreateInfo = struct(VULKAN_PACKAGE, "VkQueryPoolCreateInfo") {
    documentation =
        """
        Structure specifying parameters of a newly created query pool.

        <h5>Description</h5>
        {@code pipelineStatistics} is ignored if {@code queryType} is not #QUERY_TYPE_PIPELINE_STATISTICS.

        <h5>Valid Usage</h5>
        <ul>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-pipelineStatisticsQuery">pipeline statistics queries</a> feature is not enabled, {@code queryType} <b>must</b> not be #QUERY_TYPE_PIPELINE_STATISTICS</li>
            <li>If {@code queryType} is #QUERY_TYPE_PIPELINE_STATISTICS, {@code pipelineStatistics} <b>must</b> be a valid combination of {@code VkQueryPipelineStatisticFlagBits} values</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code flags} <b>must</b> be 0</li>
            <li>{@code queryType} <b>must</b> be a valid {@code VkQueryType} value</li>
        </ul>

        <h5>See Also</h5>
        #CreateQueryPool()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkQueryPoolCreateFlags.member("flags", "reserved for future use.")
    VkQueryType.member("queryType", "a {@code VkQueryType} value specifying the type of queries managed by the pool.")
    uint32_t.member("queryCount", "the number of queries managed by the pool.")
    VkQueryPipelineStatisticFlags.member("pipelineStatistics", "a bitmask of {@code VkQueryPipelineStatisticFlagBits} specifying which counters will be returned in queries on the new pool, as described below in <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#queries-pipestats\">the “Pipeline Statistics Queries” section</a>.")
}

val VkBufferCreateInfo = struct(VULKAN_PACKAGE, "VkBufferCreateInfo") {
    documentation =
        """
        Structure specifying the parameters of a newly created buffer object.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code size} <b>must</b> be greater than 0</li>
            <li>If {@code sharingMode} is #SHARING_MODE_CONCURRENT, {@code pQueueFamilyIndices} <b>must</b> be a pointer to an array of {@code queueFamilyIndexCount} {@code uint32_t} values</li>
            <li>If {@code sharingMode} is #SHARING_MODE_CONCURRENT, {@code queueFamilyIndexCount} <b>must</b> be greater than 1</li>
            <li>If {@code sharingMode} is #SHARING_MODE_CONCURRENT, each element of {@code pQueueFamilyIndices} <b>must</b> be unique and <b>must</b> be less than {@code pQueueFamilyPropertyCount} returned by either #GetPhysicalDeviceQueueFamilyProperties() or #GetPhysicalDeviceQueueFamilyProperties2KHR() for the {@code physicalDevice} that was used to create {@code device}</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-sparseBinding">sparse bindings</a> feature is not enabled, {@code flags} <b>must</b> not contain #BUFFER_CREATE_SPARSE_BINDING_BIT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-sparseResidencyBuffer">sparse buffer residency</a> feature is not enabled, {@code flags} <b>must</b> not contain #BUFFER_CREATE_SPARSE_RESIDENCY_BIT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-sparseResidencyAliased">sparse aliased residency</a> feature is not enabled, {@code flags} <b>must</b> not contain #BUFFER_CREATE_SPARSE_ALIASED_BIT</li>
            <li>If {@code flags} contains #BUFFER_CREATE_SPARSE_RESIDENCY_BIT or #BUFFER_CREATE_SPARSE_ALIASED_BIT, it <b>must</b> also contain #BUFFER_CREATE_SPARSE_BINDING_BIT</li>
            <li>If any of the handle types specified in ##VkExternalMemoryImageCreateInfoKHX{@code ::handleTypes} requires dedicated allocation, as reported by #GetPhysicalDeviceExternalBufferPropertiesKHX() in ##VkExternalBufferPropertiesKHX{@code ::externalMemoryProperties}{@code ::externalMemoryFeatures}, the {@code pNext} chain <b>must</b> contain an instance of ##VkDedicatedAllocationBufferCreateInfoNV with its {@code dedicatedAllocation} field set to #TRUE.</li>
            <li>If the {@code pNext} extension contains an instance of ##VkExternalMemoryBufferCreateInfoKHX, its {@code handleTypes} member <b>must</b> only contain bits that are also in ##VkExternalBufferPropertiesKHX{@code ::externalMemoryProperties}.{@code compatibleHandleTypes}, as returned by #GetPhysicalDeviceExternalBufferPropertiesKHX() with {@code pExternalBufferInfo}&#8594;{@code handleType} equal to any one of the handle types specified in ##VkExternalMemoryBufferCreateInfoKHX{@code ::handleTypes}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_BUFFER_CREATE_INFO</li>
            <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of ##VkDedicatedAllocationBufferCreateInfoNV</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkBufferCreateFlagBits} values</li>
            <li>{@code usage} <b>must</b> be a valid combination of {@code VkBufferUsageFlagBits} values</li>
            <li>{@code usage} <b>must</b> not be 0</li>
            <li>{@code sharingMode} <b>must</b> be a valid {@code VkSharingMode} value</li>
        </ul>

        <h5>See Also</h5>
        #CreateBuffer()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkBufferCreateFlags.member("flags", "a bitmask of {@code VkBufferCreateFlagBits} specifying additional parameters of the buffer.")
    VkDeviceSize.member("size", "the size in bytes of the buffer to be created.")
    VkBufferUsageFlags.member("usage", "a bitmask of {@code VkBufferUsageFlagBits} specifying allowed usages of the buffer. Any combination of bits <b>can</b> be specified for {@code usage}, but at least one of the bits <b>must</b> be set in order to create a valid buffer.")
    VkSharingMode.member("sharingMode", "a {@code VkSharingMode} value specifying the sharing mode of the buffer when it will be accessed by multiple queue families.")
    AutoSize("pQueueFamilyIndices", optional = true)..uint32_t.member("queueFamilyIndexCount", "the number of entries in the {@code pQueueFamilyIndices} array.")
    const..uint32_t_p.member("pQueueFamilyIndices", "a list of queue families that will access this buffer (ignored if {@code sharingMode} is not #SHARING_MODE_CONCURRENT).")
}

val VkBufferViewCreateInfo = struct(VULKAN_PACKAGE, "VkBufferViewCreateInfo") {
    documentation =
        """
        Structure specifying parameters of a newly created buffer view.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code offset} <b>must</b> be less than the size of {@code buffer}</li>
            <li>{@code offset} <b>must</b> be a multiple of ##VkPhysicalDeviceLimits{@code ::minTexelBufferOffsetAlignment}</li>
            <li>If {@code range} is not equal to #WHOLE_SIZE, {@code range} <b>must</b> be greater than 0</li>
            <li>If {@code range} is not equal to #WHOLE_SIZE, {@code range} <b>must</b> be a multiple of the element size of {@code format}</li>
            <li>If {@code range} is not equal to #WHOLE_SIZE, {@code range} divided by the element size of {@code format} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxTexelBufferElements}</li>
            <li>If {@code range} is not equal to #WHOLE_SIZE, the sum of {@code offset} and {@code range} <b>must</b> be less than or equal to the size of {@code buffer}</li>
            <li>{@code buffer} <b>must</b> have been created with a {@code usage} value containing at least one of #BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT or #BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT</li>
            <li>If {@code buffer} was created with {@code usage} containing #BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT, {@code format} <b>must</b> be supported for uniform texel buffers, as specified by the #FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT flag in ##VkFormatProperties{@code ::bufferFeatures} returned by #GetPhysicalDeviceFormatProperties()</li>
            <li>If {@code buffer} was created with {@code usage} containing #BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT, {@code format} <b>must</b> be supported for storage texel buffers, as specified by the #FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT flag in ##VkFormatProperties{@code ::bufferFeatures} returned by #GetPhysicalDeviceFormatProperties()</li>
            <li>If {@code buffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_BUFFER_VIEW_CREATE_INFO</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code flags} <b>must</b> be 0</li>
            <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
        </ul>

        <h5>See Also</h5>
        #CreateBufferView()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkBufferViewCreateFlags.member("flags", "reserved for future use.")
    VkBuffer.member("buffer", "a {@code VkBuffer} on which the view will be created.")
    VkFormat.member("format", "a {@code VkFormat} describing the format of the data elements in the buffer.")
    VkDeviceSize.member("offset", "an offset in bytes from the base address of the buffer. Accesses to the buffer view from shaders use addressing that is relative to this starting offset.")
    VkDeviceSize.member("range", "a size in bytes of the buffer view. If {@code range} is equal to #WHOLE_SIZE, the range from {@code offset} to the end of the buffer is used. If #WHOLE_SIZE is used and the remaining size of the buffer is not a multiple of the element size of {@code format}, then the nearest smaller multiple is used.")
}

val VkImageCreateInfo = struct(VULKAN_PACKAGE, "VkImageCreateInfo") {
    documentation =
        """
        Structure specifying the parameters of a newly created image object.

        <h5>Description</h5>
        Images created with {@code tiling} equal to #IMAGE_TILING_LINEAR have further restrictions on their limits and capabilities compared to images created with {@code tiling} equal to #IMAGE_TILING_OPTIMAL. Creation of images with tiling #IMAGE_TILING_LINEAR <b>may</b> not be supported unless other parameters meet all of the constraints:

        <ul>
            <li>{@code imageType} is #IMAGE_TYPE_2D</li>
            <li>{@code format} is not a depth/stencil format</li>
            <li>{@code mipLevels} is 1</li>
            <li>{@code arrayLayers} is 1</li>
            <li>{@code samples} is #SAMPLE_COUNT_1_BIT</li>
            <li>{@code usage} only includes #IMAGE_USAGE_TRANSFER_SRC_BIT and/or #IMAGE_USAGE_TRANSFER_DST_BIT</li>
        </ul>

        Implementations <b>may</b> support additional limits and capabilities beyond those listed above.

        To query an implementation's specific capabilities for a given combination of {@code format}, {@code type}, {@code tiling}, {@code usage}, ##VkExternalMemoryImageCreateInfoKHX{@code ::handleTypes} and {@code flags}, call #GetPhysicalDeviceImageFormatProperties2KHR(). The return value indicates whether that combination of image settings is supported. On success, the ##VkImageFormatProperties output parameter indicates the set of valid {@code samples} bits and the limits for {@code extent}, {@code mipLevels}, and {@code arrayLayers}.

        To determine the set of valid {@code usage} bits for a given format, call #GetPhysicalDeviceFormatProperties().

        <h5>Valid Usage</h5>
        <ul>
            <li>The combination of {@code format}, {@code type}, {@code tiling}, {@code usage}, and {@code flags} <b>must</b> be supported, as indicated by a #SUCCESS return value from #GetPhysicalDeviceImageFormatProperties() invoked with the same values passed to the corresponding parameters.</li>
            <li>If {@code sharingMode} is #SHARING_MODE_CONCURRENT, {@code pQueueFamilyIndices} <b>must</b> be a pointer to an array of {@code queueFamilyIndexCount} {@code uint32_t} values</li>
            <li>If {@code sharingMode} is #SHARING_MODE_CONCURRENT, {@code queueFamilyIndexCount} <b>must</b> be greater than 1</li>
            <li>If {@code sharingMode} is #SHARING_MODE_CONCURRENT, each element of {@code pQueueFamilyIndices} <b>must</b> be unique and <b>must</b> be less than {@code pQueueFamilyPropertyCount} returned by either #GetPhysicalDeviceQueueFamilyProperties() or #GetPhysicalDeviceQueueFamilyProperties2KHR() for the {@code physicalDevice} that was used to create {@code device}</li>
            <li>{@code format} <b>must</b> not be #FORMAT_UNDEFINED</li>
            <li>{@code extent}{@code ::width} <b>must</b> be greater than 0.</li>
            <li>{@code extent}{@code ::height} <b>must</b> be greater than 0.</li>
            <li>{@code extent}{@code ::depth} <b>must</b> be greater than 0.</li>
            <li>{@code mipLevels} <b>must</b> be greater than 0</li>
            <li>{@code arrayLayers} <b>must</b> be greater than 0</li>
            <li>If {@code flags} contains #IMAGE_CREATE_CUBE_COMPATIBLE_BIT, {@code imageType} <b>must</b> be #IMAGE_TYPE_2D</li>
            <li>If {@code flags} contains #IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT_KHR, {@code imageType} <b>must</b> be #IMAGE_TYPE_3D</li>
            <li>If {@code imageType} is #IMAGE_TYPE_1D, {@code extent.width} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxImageDimension1D}, or ##VkImageFormatProperties{@code ::maxExtent}.width (as returned by #GetPhysicalDeviceImageFormatProperties() with {@code format}, {@code type}, {@code tiling}, {@code usage}, and {@code flags} equal to those in this structure) - whichever is higher</li>
            <li>If {@code imageType} is #IMAGE_TYPE_2D and {@code flags} does not contain #IMAGE_CREATE_CUBE_COMPATIBLE_BIT, {@code extent.width} and {@code extent.height} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxImageDimension2D}, or ##VkImageFormatProperties{@code ::maxExtent}.width/height (as returned by #GetPhysicalDeviceImageFormatProperties() with {@code format}, {@code type}, {@code tiling}, {@code usage}, and {@code flags} equal to those in this structure) - whichever is higher</li>
            <li>If {@code imageType} is #IMAGE_TYPE_2D and {@code flags} contains #IMAGE_CREATE_CUBE_COMPATIBLE_BIT, {@code extent.width} and {@code extent.height} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxImageDimensionCube}, or ##VkImageFormatProperties{@code ::maxExtent}.width/height (as returned by #GetPhysicalDeviceImageFormatProperties() with {@code format}, {@code type}, {@code tiling}, {@code usage}, and {@code flags} equal to those in this structure) - whichever is higher</li>
            <li>If {@code imageType} is #IMAGE_TYPE_2D and {@code flags} contains #IMAGE_CREATE_CUBE_COMPATIBLE_BIT, {@code extent.width} and {@code extent.height} <b>must</b> be equal and {@code arrayLayers} <b>must</b> be greater than or equal to 6</li>
            <li>If {@code imageType} is #IMAGE_TYPE_3D, {@code extent.width}, {@code extent.height} and {@code extent.depth} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxImageDimension3D}, or ##VkImageFormatProperties{@code ::maxExtent}.width/height/depth (as returned by #GetPhysicalDeviceImageFormatProperties() with {@code format}, {@code type}, {@code tiling}, {@code usage}, and {@code flags} equal to those in this structure) - whichever is higher</li>
            <li>If {@code imageType} is #IMAGE_TYPE_1D, both {@code extent.height} and {@code extent.depth} <b>must</b> be 1</li>
            <li>If {@code imageType} is #IMAGE_TYPE_2D, {@code extent.depth} <b>must</b> be 1</li>
            <li>{@code mipLevels} <b>must</b> be less than or equal to <code>⌊log<sub>2</sub>(max(extent.width, extent.height, extent.depth))⌋ + 1</code>.</li>
            <li>If any of {@code extent.width}, {@code extent.height}, or {@code extent.depth} are greater than the equivalently named members of ##VkPhysicalDeviceLimits{@code ::maxImageDimension3D}, {@code mipLevels} <b>must</b> be less than or equal to ##VkImageFormatProperties{@code ::maxMipLevels} (as returned by #GetPhysicalDeviceImageFormatProperties() with {@code format}, {@code type}, {@code tiling}, {@code usage}, and {@code flags} equal to those in this structure)</li>
            <li>{@code arrayLayers} <b>must</b> be less than or equal to ##VkImageFormatProperties{@code ::maxArrayLayers} (as returned by #GetPhysicalDeviceImageFormatProperties() with {@code format}, {@code type}, {@code tiling}, {@code usage}, and {@code flags} equal to those in this structure)</li>
            <li>If {@code imageType} is #IMAGE_TYPE_3D, {@code arrayLayers} <b>must</b> be 1.</li>
            <li>If {@code samples} is not #SAMPLE_COUNT_1_BIT, {@code imageType} <b>must</b> be #IMAGE_TYPE_2D, {@code flags} <b>must</b> not contain #IMAGE_CREATE_CUBE_COMPATIBLE_BIT, {@code tiling} <b>must</b> be #IMAGE_TILING_OPTIMAL, and {@code mipLevels} <b>must</b> be equal to 1</li>
            <li>If {@code usage} includes #IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT, then bits other than #IMAGE_USAGE_COLOR_ATTACHMENT_BIT, #IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT, and #IMAGE_USAGE_INPUT_ATTACHMENT_BIT <b>must</b> not be set</li>
            <li>If {@code usage} includes #IMAGE_USAGE_COLOR_ATTACHMENT_BIT, #IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT, #IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT, or #IMAGE_USAGE_INPUT_ATTACHMENT_BIT, {@code extent.width} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxFramebufferWidth}</li>
            <li>If {@code usage} includes #IMAGE_USAGE_COLOR_ATTACHMENT_BIT, #IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT, #IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT, or #IMAGE_USAGE_INPUT_ATTACHMENT_BIT, {@code extent.height} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxFramebufferHeight}</li>
            <li>If {@code usage} includes #IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT, {@code usage} <b>must</b> also contain at least one of #IMAGE_USAGE_COLOR_ATTACHMENT_BIT, #IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT, or #IMAGE_USAGE_INPUT_ATTACHMENT_BIT.</li>
            <li>{@code samples} <b>must</b> be a bit value that is set in ##VkImageFormatProperties{@code ::sampleCounts} returned by #GetPhysicalDeviceImageFormatProperties() with {@code format}, {@code type}, {@code tiling}, {@code usage}, and {@code flags} equal to those in this structure</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-shaderStorageImageMultisample">multisampled storage images</a> feature is not enabled, and {@code usage} contains #IMAGE_USAGE_STORAGE_BIT, {@code samples} <b>must</b> be #SAMPLE_COUNT_1_BIT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-sparseBinding">sparse bindings</a> feature is not enabled, {@code flags} <b>must</b> not contain #IMAGE_CREATE_SPARSE_BINDING_BIT</li>
            <li>If {@code imageType} is #IMAGE_TYPE_1D, {@code flags} <b>must</b> not contain #IMAGE_CREATE_SPARSE_RESIDENCY_BIT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-sparseResidencyImage2D">sparse residency for 2D images</a> feature is not enabled, and {@code imageType} is #IMAGE_TYPE_2D, {@code flags} <b>must</b> not contain #IMAGE_CREATE_SPARSE_RESIDENCY_BIT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-sparseResidencyImage3D">sparse residency for 3D images</a> feature is not enabled, and {@code imageType} is #IMAGE_TYPE_3D, {@code flags} <b>must</b> not contain #IMAGE_CREATE_SPARSE_RESIDENCY_BIT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-sparseResidency2Samples">sparse residency for images with 2 samples</a> feature is not enabled, {@code imageType} is #IMAGE_TYPE_2D, and {@code samples} is #SAMPLE_COUNT_2_BIT, {@code flags} <b>must</b> not contain #IMAGE_CREATE_SPARSE_RESIDENCY_BIT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-sparseResidency4Samples">sparse residency for images with 4 samples</a> feature is not enabled, {@code imageType} is #IMAGE_TYPE_2D, and {@code samples} is #SAMPLE_COUNT_4_BIT, {@code flags} <b>must</b> not contain #IMAGE_CREATE_SPARSE_RESIDENCY_BIT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-sparseResidency8Samples">sparse residency for images with 8 samples</a> feature is not enabled, {@code imageType} is #IMAGE_TYPE_2D, and {@code samples} is #SAMPLE_COUNT_8_BIT, {@code flags} <b>must</b> not contain #IMAGE_CREATE_SPARSE_RESIDENCY_BIT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-sparseResidency16Samples">sparse residency for images with 16 samples</a> feature is not enabled, {@code imageType} is #IMAGE_TYPE_2D, and {@code samples} is #SAMPLE_COUNT_16_BIT, {@code flags} <b>must</b> not contain #IMAGE_CREATE_SPARSE_RESIDENCY_BIT</li>
            <li>If {@code tiling} is #IMAGE_TILING_LINEAR, {@code format} <b>must</b> be a format that has at least one supported feature bit present in the value of ##VkFormatProperties{@code ::linearTilingFeatures} returned by #GetPhysicalDeviceFormatProperties() with the same value of {@code format}</li>
            <li>If {@code tiling} is #IMAGE_TILING_LINEAR, and ##VkFormatProperties{@code ::linearTilingFeatures} (as returned by #GetPhysicalDeviceFormatProperties() with the same value of {@code format}) does not include #FORMAT_FEATURE_SAMPLED_IMAGE_BIT, {@code usage} <b>must</b> not contain #IMAGE_USAGE_SAMPLED_BIT</li>
            <li>If {@code tiling} is #IMAGE_TILING_LINEAR, and ##VkFormatProperties{@code ::linearTilingFeatures} (as returned by #GetPhysicalDeviceFormatProperties() with the same value of {@code format}) does not include #FORMAT_FEATURE_STORAGE_IMAGE_BIT, {@code usage} <b>must</b> not contain #IMAGE_USAGE_STORAGE_BIT</li>
            <li>If {@code tiling} is #IMAGE_TILING_LINEAR, and ##VkFormatProperties{@code ::linearTilingFeatures} (as returned by #GetPhysicalDeviceFormatProperties() with the same value of {@code format}) does not include #FORMAT_FEATURE_COLOR_ATTACHMENT_BIT, {@code usage} <b>must</b> not contain #IMAGE_USAGE_COLOR_ATTACHMENT_BIT</li>
            <li>If {@code tiling} is #IMAGE_TILING_LINEAR, and ##VkFormatProperties{@code ::linearTilingFeatures} (as returned by #GetPhysicalDeviceFormatProperties() with the same value of {@code format}) does not include #FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT, {@code usage} <b>must</b> not contain #IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT</li>
            <li>If {@code tiling} is #IMAGE_TILING_OPTIMAL, {@code format} <b>must</b> be a format that has at least one supported feature bit present in the value of ##VkFormatProperties{@code ::optimalTilingFeatures} returned by #GetPhysicalDeviceFormatProperties() with the same value of {@code format}</li>
            <li>If {@code tiling} is #IMAGE_TILING_OPTIMAL, and ##VkFormatProperties{@code ::optimalTilingFeatures} (as returned by #GetPhysicalDeviceFormatProperties() with the same value of {@code format}) does not include #FORMAT_FEATURE_SAMPLED_IMAGE_BIT, {@code usage} <b>must</b> not contain #IMAGE_USAGE_SAMPLED_BIT</li>
            <li>If {@code tiling} is #IMAGE_TILING_OPTIMAL, and ##VkFormatProperties{@code ::optimalTilingFeatures} (as returned by #GetPhysicalDeviceFormatProperties() with the same value of {@code format}) does not include #FORMAT_FEATURE_STORAGE_IMAGE_BIT, {@code usage} <b>must</b> not contain #IMAGE_USAGE_STORAGE_BIT</li>
            <li>If {@code tiling} is #IMAGE_TILING_OPTIMAL, and ##VkFormatProperties{@code ::optimalTilingFeatures} (as returned by #GetPhysicalDeviceFormatProperties() with the same value of {@code format}) does not include #FORMAT_FEATURE_COLOR_ATTACHMENT_BIT, {@code usage} <b>must</b> not contain #IMAGE_USAGE_COLOR_ATTACHMENT_BIT</li>
            <li>If {@code tiling} is #IMAGE_TILING_OPTIMAL, and ##VkFormatProperties{@code ::optimalTilingFeatures} (as returned by #GetPhysicalDeviceFormatProperties() with the same value of {@code format}) does not include #FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT, {@code usage} <b>must</b> not contain #IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT</li>
            <li>If {@code flags} contains #IMAGE_CREATE_SPARSE_RESIDENCY_BIT or #IMAGE_CREATE_SPARSE_ALIASED_BIT, it <b>must</b> also contain #IMAGE_CREATE_SPARSE_BINDING_BIT</li>
            <li>If the {@code pNext} chain contains an instance of ##VkExternalMemoryImageCreateInfoNV, it <b>must</b> not contain an instance of ##VkExternalMemoryImageCreateInfoKHX.</li>
            <li>If the {@code pNext} chain contains an instance of ##VkExternalMemoryImageCreateInfoKHX, and any of the handle types specified in ##VkExternalMemoryImageCreateInfoKHX{@code ::handleTypes} require a dedicated allocation, as reported by #GetPhysicalDeviceImageFormatProperties2KHR() in ##VkExternalImageFormatPropertiesKHX{@code ::externalMemoryProperties}{@code ::externalMemoryFeatures}, the {@code pNext} chain <b>must</b> contain an instance of ##VkDedicatedAllocationImageCreateInfoNV with its {@code dedicatedAllocation} field set to #TRUE.</li>
            <li>If the {@code pNext} chain contains an instance of ##VkExternalMemoryImageCreateInfoKHX, its {@code handleTypes} member <b>must</b> only contain bits that are also in ##VkExternalImageFormatPropertiesKHX{@code ::externalMemoryProperties}{@code ::compatibleHandleTypes}, as returned by #GetPhysicalDeviceImageFormatProperties2KHR() with {@code format}, {@code type}, {@code tiling}, {@code usage}, and {@code flags} equal to those in this structure, and with an instance of ##VkPhysicalDeviceExternalImageFormatInfoKHX in the {@code pNext} chain, with a {@code handleType} equal to any one of the handle types specified in ##VkExternalMemoryImageCreateInfoKHX{@code ::handleTypes}</li>
            <li>If the {@code pNext} chain contains an instance of ##VkExternalMemoryImageCreateInfoNV, its {@code handleTypes} member <b>must</b> only contain bits that are also in ##VkExternalImageFormatPropertiesNV{@code ::externalMemoryProperties}{@code ::compatibleHandleTypes}, as returned by #GetPhysicalDeviceExternalImageFormatPropertiesNV() with {@code format}, {@code type}, {@code tiling}, {@code usage}, and {@code flags} equal to those in this structure, and with {@code externalHandleType} equal to any one of the handle types specified in ##VkExternalMemoryImageCreateInfoNV{@code ::handleTypes}</li>
            <li>If {@code flags} contains #IMAGE_CREATE_BIND_SFR_BIT_KHX, then {@code mipLevels} <b>must</b> be one, {@code arrayLayers} <b>must</b> be one, {@code imageType} <b>must</b> be #IMAGE_TYPE_2D, and {@code tiling} <b>must</b> be #IMAGE_TILING_OPTIMAL.</li>
            <li>{@code initialLayout} <b>must</b> be #IMAGE_LAYOUT_UNDEFINED or #IMAGE_LAYOUT_PREINITIALIZED.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_IMAGE_CREATE_INFO</li>
            <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of ##VkDedicatedAllocationImageCreateInfoNV or ##VkImageSwapchainCreateInfoKHX</li>
            <li>Each {@code sType} member in the {@code pNext} chain <b>must</b> be unique</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkImageCreateFlagBits} values</li>
            <li>{@code imageType} <b>must</b> be a valid {@code VkImageType} value</li>
            <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
            <li>{@code samples} <b>must</b> be a valid {@code VkSampleCountFlagBits} value</li>
            <li>{@code tiling} <b>must</b> be a valid {@code VkImageTiling} value</li>
            <li>{@code usage} <b>must</b> be a valid combination of {@code VkImageUsageFlagBits} values</li>
            <li>{@code usage} <b>must</b> not be 0</li>
            <li>{@code sharingMode} <b>must</b> be a valid {@code VkSharingMode} value</li>
            <li>{@code initialLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
        </ul>

        <h5>See Also</h5>
        ##VkExtent3D, #CreateImage()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkImageCreateFlags.member("flags", "a bitmask of {@code VkImageCreateFlagBits} describing additional parameters of the image.")
    VkImageType.member("imageType", "a {@code VkImageType} value specifying the basic dimensionality of the image. Layers in array textures do not count as a dimension for the purposes of the image type.")
    VkFormat.member("format", "a {@code VkFormat} describing the format and type of the data elements that will be contained in the image.")
    VkExtent3D.member("extent", "a ##VkExtent3D describing the number of data elements in each dimension of the base level.")
    uint32_t.member("mipLevels", "describes the number of levels of detail available for minified sampling of the image.")
    uint32_t.member("arrayLayers", "the number of layers in the image.")
    VkSampleCountFlagBits.member("samples", "the number of sub-data element samples in the image as defined in {@code VkSampleCountFlagBits}. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#primsrast-multisampling\">Multisampling</a>.")
    VkImageTiling.member("tiling", "a {@code VkImageTiling} value specifying the tiling arrangement of the data elements in memory.")
    VkImageUsageFlags.member("usage", "a bitmask of {@code VkImageUsageFlagBits} describing the intended usage of the image.")
    VkSharingMode.member("sharingMode", "a {@code VkSharingMode} value specifying the sharing mode of the image when it will be accessed by multiple queue families.")
    AutoSize("pQueueFamilyIndices", optional = true)..uint32_t.member("queueFamilyIndexCount", "the number of entries in the {@code pQueueFamilyIndices} array.")
    const..uint32_t_p.member("pQueueFamilyIndices", "a list of queue families that will access this image (ignored if {@code sharingMode} is not #SHARING_MODE_CONCURRENT).")
    VkImageLayout.member("initialLayout", "a {@code VkImageLayout} value specifying the initial {@code VkImageLayout} state of all image subresources of the image. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#resources-image-layouts\">Image Layouts</a>.")
}

val VkSubresourceLayout = struct(VULKAN_PACKAGE, "VkSubresourceLayout", mutable = false) {
    documentation =
        """
        Structure specifying subresource layout.

        <h5>Description</h5>
        For images created with linear tiling, {@code rowPitch}, {@code arrayPitch} and {@code depthPitch} describe the layout of the image subresource in linear memory. For uncompressed formats, {@code rowPitch} is the number of bytes between texels with the same x coordinate in adjacent rows (y coordinates differ by one). {@code arrayPitch} is the number of bytes between texels with the same x and y coordinate in adjacent array layers of the image (array layer values differ by one). {@code depthPitch} is the number of bytes between texels with the same x and y coordinate in adjacent slices of a 3D image (z coordinates differ by one). Expressed as an addressing formula, the starting byte of a texel in the image subresource has address:

        <code><pre>
￿// (x,y,z,layer) are in texel coordinates
￿address(x,y,z,layer) = layer*arrayPitch + z*depthPitch + y*rowPitch + x*elementSize + offset</pre></code>

        For compressed formats, the {@code rowPitch} is the number of bytes between compressed texel blocks in adjacent rows. {@code arrayPitch} is the number of bytes between compressed texel blocks in adjacent array layers. {@code depthPitch} is the number of bytes between compressed texel blocks in adjacent slices of a 3D image.

        <code><pre>
￿// (x,y,z,layer) are in compressed texel block coordinates
￿address(x,y,z,layer) = layer*arrayPitch + z*depthPitch + y*rowPitch + x*compressedTexelBlockByteSize + offset;</pre></code>

        {@code arrayPitch} is undefined for images that were not created as arrays. {@code depthPitch} is defined only for 3D images.

        For color formats, the {@code aspectMask} member of ##VkImageSubresource <b>must</b> be #IMAGE_ASPECT_COLOR_BIT. For depth/stencil formats, {@code aspectMask} <b>must</b> be either #IMAGE_ASPECT_DEPTH_BIT or #IMAGE_ASPECT_STENCIL_BIT. On implementations that store depth and stencil aspects separately, querying each of these image subresource layouts will return a different {@code offset} and {@code size} representing the region of memory used for that aspect. On implementations that store depth and stencil aspects interleaved, the same {@code offset} and {@code size} are returned and represent the interleaved memory allocation.

        <h5>See Also</h5>
        #GetImageSubresourceLayout()
        """

    VkDeviceSize.member("offset", "the byte offset from the start of the image where the image subresource begins.")
    VkDeviceSize.member("size", "the size in bytes of the image subresource. {@code size} includes any extra memory that is required based on {@code rowPitch}.")
    VkDeviceSize.member("rowPitch", "describes the number of bytes between each row of texels in an image.")
    VkDeviceSize.member("arrayPitch", "describes the number of bytes between each array layer of an image.")
    VkDeviceSize.member("depthPitch", "describes the number of bytes between each slice of 3D image.")
}

val VkComponentMapping = struct(VULKAN_PACKAGE, "VkComponentMapping") {
    documentation =
        """
        Structure specifying a color component mapping.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code r} <b>must</b> be a valid {@code VkComponentSwizzle} value</li>
            <li>{@code g} <b>must</b> be a valid {@code VkComponentSwizzle} value</li>
            <li>{@code b} <b>must</b> be a valid {@code VkComponentSwizzle} value</li>
            <li>{@code a} <b>must</b> be a valid {@code VkComponentSwizzle} value</li>
        </ul>

        <h5>See Also</h5>
        ##VkImageViewCreateInfo
        """

    VkComponentSwizzle.member("r", "a {@code VkComponentSwizzle} specifying the component value placed in the R component of the output vector.")
    VkComponentSwizzle.member("g", "a {@code VkComponentSwizzle} specifying the component value placed in the G component of the output vector.")
    VkComponentSwizzle.member("b", "a {@code VkComponentSwizzle} specifying the component value placed in the B component of the output vector.")
    VkComponentSwizzle.member("a", "")
}

val VkImageSubresourceRange = struct(VULKAN_PACKAGE, "VkImageSubresourceRange") {
    documentation =
        """
        Structure specifying a image subresource range.

        <h5>Description</h5>
        The number of mipmap levels and array layers <b>must</b> be a subset of the image subresources in the image. If an application wants to use all mip levels or layers in an image after the {@code baseMipLevel} or {@code baseArrayLayer}, it <b>can</b> set {@code levelCount} and {@code layerCount} to the special values #REMAINING_MIP_LEVELS and #REMAINING_ARRAY_LAYERS without knowing the exact number of mip levels or layers.

        For cube and cube array image views, the layers of the image view starting at {@code baseArrayLayer} correspond to faces in the order +X, -X, +Y, -Y, +Z, -Z. For cube arrays, each set of six sequential layers is a single cube, so the number of cube maps in a cube map array view is <em>{@code layerCount} / 6</em>, and image array layer <code>(baseArrayLayer {plus} i)</code> is face index <code>(i mod 6)</code> of cube <em>i / 6</em>. If the number of layers in the view, whether set explicitly in {@code layerCount} or implied by #REMAINING_ARRAY_LAYERS, is not a multiple of 6, behavior when indexing the last cube is undefined.

        {@code aspectMask} <b>must</b> be only #IMAGE_ASPECT_COLOR_BIT, #IMAGE_ASPECT_DEPTH_BIT or #IMAGE_ASPECT_STENCIL_BIT if {@code format} is a color, depth-only or stencil-only format, respectively. If using a depth/stencil format with both depth and stencil components, {@code aspectMask} <b>must</b> include at least one of #IMAGE_ASPECT_DEPTH_BIT and #IMAGE_ASPECT_STENCIL_BIT, and <b>can</b> include both.

        When using an imageView of a depth/stencil image to populate a descriptor set (e.g. for sampling in the shader, or for use as an input attachment), the {@code aspectMask} <b>must</b> only include one bit and selects whether the imageView is used for depth reads (i.e. using a floating-point sampler or input attachment in the shader) or stencil reads (i.e. using an unsigned integer sampler or input attachment in the shader). When an imageView of a depth/stencil image is used as a depth/stencil framebuffer attachment, the {@code aspectMask} is ignored and both depth and stencil image subresources are used.

        The {@code components} member is of type ##VkComponentMapping, and describes a remapping from components of the image to components of the vector returned by shader image instructions. This remapping <b>must</b> be identity for storage image descriptors, input attachment descriptors, and framebuffer attachments.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code levelCount} is not #REMAINING_MIP_LEVELS, <code>levelCount</code> <b>must</b> be non-zero and <code>(baseMipLevel + levelCount)</code> <b>must</b> be less than or equal to the {@code mipLevels} specified in ##VkImageCreateInfo when the image was created</li>
            <li>If the {@code imageType} specified in ##VkImageCreateInfo when the image was created was #IMAGE_TYPE_3D and the image view is created with the {@code viewType} of ##VkImageViewCreateInfo set to #IMAGE_VIEW_TYPE_2D_ARRAY then {@code layerCount} <b>must</b> be #REMAINING_ARRAY_LAYERS, or <code>layerCount</code> <b>must</b> be non-zero and <code>(baseArrayLayer + layerCount)</code> <b>must</b> be less than or equal to the {@code extent.depth} specified in ##VkImageCreateInfo when the image was created</li>
            <li>If the {@code imageType} specified in ##VkImageCreateInfo when the image was created was not #IMAGE_TYPE_3D or the image view is not created with the {@code viewType} of ##VkImageViewCreateInfo set to #IMAGE_VIEW_TYPE_2D_ARRAY then {@code layerCount} <b>must</b> be #REMAINING_ARRAY_LAYERS, or <code>layerCount</code> <b>must</b> be non-zero and <code>(baseArrayLayer + layerCount)</code> <b>must</b> be less than or equal to the {@code arrayLayers} specified in ##VkImageCreateInfo when the image was created</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code aspectMask} <b>must</b> be a valid combination of {@code VkImageAspectFlagBits} values</li>
            <li>{@code aspectMask} <b>must</b> not be 0</li>
        </ul>

        <h5>See Also</h5>
        ##VkImageMemoryBarrier, ##VkImageViewCreateInfo, #CmdClearColorImage(), #CmdClearDepthStencilImage()
        """

    VkImageAspectFlags.member("aspectMask", "a bitmask of {@code VkImageAspectFlagBits} specifying which aspect(s) of the image are included in the view.")
    uint32_t.member("baseMipLevel", "the first mipmap level accessible to the view.")
    uint32_t.member("levelCount", "the number of mipmap levels (starting from {@code baseMipLevel}) accessible to the view.")
    uint32_t.member("baseArrayLayer", "the first array layer accessible to the view.")
    uint32_t.member("layerCount", "the number of array layers (starting from {@code baseArrayLayer}) accessible to the view.")
}

val VkImageViewCreateInfo = struct(VULKAN_PACKAGE, "VkImageViewCreateInfo") {
    documentation =
        """
        Structure specifying parameters of a newly created image view.

        <h5>Description</h5>
        If {@code image} was created with the #IMAGE_CREATE_MUTABLE_FORMAT_BIT flag, {@code format} <b>can</b> be different from the image's format, but if they are not equal they <b>must</b> be <em>compatible</em>. Image format compatibility is defined in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-formats-compatibility-classes">Format Compatibility Classes</a> section.

        <h6>Image and image view parameter compatibility requirements</h6>
        <table class="lwjgl">
            <thead><tr><th>Dim, Arrayed, MS</th><th>Image parameters</th><th>View parameters</th></tr></thead>
            <tbody>
                <tr><td></td><td>{@code imageType} = ci.{@code imageType} {@code width} = ci.{@code extent.width} {@code height} = ci.{@code extent.height} {@code depth} = ci.{@code extent.depth} {@code arrayLayers} = ci.{@code arrayLayers} {@code samples} = ci.{@code samples} {@code flags} = ci.{@code flags} where ci is the ##VkImageCreateInfo used to create {@code image}.</td><td>{@code baseArrayLayer}, {@code layerCount}, and {@code levelCount} are members of the {@code subresourceRange} member.</td></tr>
                <tr><td>1D, 0, 0</td><td>{@code imageType} = #IMAGE_TYPE_1D {@code width} ≥ 1 {@code height} = 1 {@code depth} = 1 {@code arrayLayers} ≥ 1 {@code samples} = 1</td><td>{@code viewType} = #IMAGE_VIEW_TYPE_1D {@code baseArrayLayer} ≥ 0 {@code layerCount} = 1</td></tr>
                <tr><td>1D, 1, 0</td><td>{@code imageType} = #IMAGE_TYPE_1D {@code width} ≥ 1 {@code height} = 1 {@code depth} = 1 {@code arrayLayers} ≥ 1 {@code samples} = 1</td><td>{@code viewType} = #IMAGE_VIEW_TYPE_1D_ARRAY {@code baseArrayLayer} ≥ 0 {@code layerCount} ≥ 1</td></tr>
                <tr><td>2D, 0, 0</td><td>{@code imageType} = #IMAGE_TYPE_2D {@code width} ≥ 1 {@code height} ≥ 1 {@code depth} = 1 {@code arrayLayers} ≥ 1 {@code samples} = 1</td><td>{@code viewType} = #IMAGE_VIEW_TYPE_2D {@code baseArrayLayer} ≥ 0 {@code layerCount} = 1</td></tr>
                <tr><td>2D, 1, 0</td><td>{@code imageType} = #IMAGE_TYPE_2D {@code width} ≥ 1 {@code height} ≥ 1 {@code depth} = 1 {@code arrayLayers} ≥ 1 {@code samples} = 1</td><td>{@code viewType} = #IMAGE_VIEW_TYPE_2D_ARRAY {@code baseArrayLayer} ≥ 0 {@code layerCount} ≥ 1</td></tr>
                <tr><td>2D, 0, 1</td><td>{@code imageType} = #IMAGE_TYPE_2D {@code width} ≥ 1 {@code height} ≥ 1 {@code depth} = 1 {@code arrayLayers} ≥ 1 {@code samples} &gt; 1</td><td>{@code viewType} = #IMAGE_VIEW_TYPE_2D {@code baseArrayLayer} ≥ 0 {@code layerCount} = 1</td></tr>
                <tr><td>2D, 1, 1</td><td>{@code imageType} = #IMAGE_TYPE_2D {@code width} ≥ 1 {@code height} ≥ 1 {@code depth} = 1 {@code arrayLayers} ≥ 1 {@code samples} &gt; 1</td><td>{@code viewType} = #IMAGE_VIEW_TYPE_2D_ARRAY {@code baseArrayLayer} ≥ 0 {@code layerCount} ≥ 1</td></tr>
                <tr><td>CUBE, 0, 0</td><td>{@code imageType} = #IMAGE_TYPE_2D {@code width} ≥ 1 {@code height} = {@code width} {@code depth} = 1 {@code arrayLayers} ≥ 6 {@code samples} = 1 {@code flags} includes #IMAGE_CREATE_CUBE_COMPATIBLE_BIT</td><td>{@code viewType} = #IMAGE_VIEW_TYPE_CUBE {@code baseArrayLayer} ≥ 0 {@code layerCount} = 6</td></tr>
                <tr><td>CUBE, 1, 0</td><td>{@code imageType} = #IMAGE_TYPE_2D {@code width} ≥ 1 {@code height} = width {@code depth} = 1 <em>N</em> ≥ 1 {@code arrayLayers} ≥ 6 × <em>N</em> {@code samples} = 1 {@code flags} includes #IMAGE_CREATE_CUBE_COMPATIBLE_BIT</td><td>{@code viewType} = #IMAGE_VIEW_TYPE_CUBE_ARRAY {@code baseArrayLayer} ≥ 0 {@code layerCount} = 6 × <em>N</em>, <em>N</em> ≥ 1</td></tr>
                <tr><td>3D, 0, 0</td><td>{@code imageType} = #IMAGE_TYPE_3D {@code width} ≥ 1 {@code height} ≥ 1 {@code depth} ≥ 1 {@code arrayLayers} = 1 {@code samples} = 1</td><td>{@code viewType} = #IMAGE_VIEW_TYPE_3D {@code baseArrayLayer} = 0 {@code layerCount} = 1</td></tr>
                <tr><td>3D, 0, 0</td><td>{@code imageType} = #IMAGE_TYPE_3D {@code width} ≥ 1 {@code height} ≥ 1 {@code depth} ≥ 1 {@code arrayLayers} = 1 {@code samples} = 1 {@code flags} includes #IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT {@code flags} does not include #IMAGE_CREATE_SPARSE_BINDING_BIT, #IMAGE_CREATE_SPARSE_RESIDENCY_BIT, and #IMAGE_CREATE_SPARSE_ALIASED_BIT</td><td>{@code viewType} = #IMAGE_VIEW_TYPE_2D {@code levelCount} = 1 {@code baseArrayLayer} ≥ 0 {@code layerCount} = 1</td></tr>
                <tr><td>3D, 0, 0</td><td>{@code imageType} = #IMAGE_TYPE_3D {@code width} ≥ 1 {@code height} ≥ 1 {@code depth} ≥ 1 {@code arrayLayers} = 1 {@code samples} = 1 {@code flags} includes #IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT {@code flags} does not include #IMAGE_CREATE_SPARSE_BINDING_BIT, #IMAGE_CREATE_SPARSE_RESIDENCY_BIT, and #IMAGE_CREATE_SPARSE_ALIASED_BIT</td><td>{@code viewType} = #IMAGE_VIEW_TYPE_2D_ARRAY {@code levelCount} = 1 {@code baseArrayLayer} ≥ 0 {@code layerCount} ≥ 1</td></tr>
            </tbody>
        </table>

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code image} was not created with #IMAGE_CREATE_CUBE_COMPATIBLE_BIT then {@code viewType} <b>must</b> not be #IMAGE_VIEW_TYPE_CUBE or #IMAGE_VIEW_TYPE_CUBE_ARRAY</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-imageCubeArray">image cubemap arrays</a> feature is not enabled, {@code viewType} <b>must</b> not be #IMAGE_VIEW_TYPE_CUBE_ARRAY</li>
            <li>If {@code image} was created with #IMAGE_TYPE_3D but without #IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT_KHR set then {@code viewType} <b>must</b> not be #IMAGE_VIEW_TYPE_2D or #IMAGE_VIEW_TYPE_2D_ARRAY</li>
            <li>If {@code image} was created with #IMAGE_TILING_LINEAR, {@code format} <b>must</b> be format that has at least one supported feature bit present in the value of ##VkFormatProperties{@code ::linearTilingFeatures} returned by #GetPhysicalDeviceFormatProperties() with the same value of {@code format}</li>
            <li>{@code image} <b>must</b> have been created with a {@code usage} value containing at least one of #IMAGE_USAGE_SAMPLED_BIT, #IMAGE_USAGE_STORAGE_BIT, #IMAGE_USAGE_COLOR_ATTACHMENT_BIT, #IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT, or #IMAGE_USAGE_INPUT_ATTACHMENT_BIT</li>
            <li>If {@code image} was created with #IMAGE_TILING_LINEAR and {@code usage} contains #IMAGE_USAGE_SAMPLED_BIT, {@code format} <b>must</b> be supported for sampled images, as specified by the #FORMAT_FEATURE_SAMPLED_IMAGE_BIT flag in ##VkFormatProperties{@code ::linearTilingFeatures} returned by #GetPhysicalDeviceFormatProperties() with the same value of {@code format}</li>
            <li>If {@code image} was created with #IMAGE_TILING_LINEAR and {@code usage} contains #IMAGE_USAGE_STORAGE_BIT, {@code format} <b>must</b> be supported for storage images, as specified by the #FORMAT_FEATURE_STORAGE_IMAGE_BIT flag in ##VkFormatProperties{@code ::linearTilingFeatures} returned by #GetPhysicalDeviceFormatProperties() with the same value of {@code format}</li>
            <li>If {@code image} was created with #IMAGE_TILING_LINEAR and {@code usage} contains #IMAGE_USAGE_COLOR_ATTACHMENT_BIT, {@code format} <b>must</b> be supported for color attachments, as specified by the #FORMAT_FEATURE_COLOR_ATTACHMENT_BIT flag in ##VkFormatProperties{@code ::linearTilingFeatures} returned by #GetPhysicalDeviceFormatProperties() with the same value of {@code format}</li>
            <li>If {@code image} was created with #IMAGE_TILING_LINEAR and {@code usage} containing #IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT, {@code format} <b>must</b> be supported for depth/stencil attachments, as specified by the #FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT flag in ##VkFormatProperties{@code ::linearTilingFeatures} returned by #GetPhysicalDeviceFormatProperties() with the same value of {@code format}</li>
            <li>If {@code image} was created with #IMAGE_TILING_OPTIMAL, {@code format} <b>must</b> be format that has at least one supported feature bit present in the value of ##VkFormatProperties{@code ::optimalTilingFeatures} returned by #GetPhysicalDeviceFormatProperties() with the same value of {@code format}</li>
            <li>If {@code image} was created with #IMAGE_TILING_OPTIMAL and {@code usage} contains #IMAGE_USAGE_SAMPLED_BIT, {@code format} <b>must</b> be supported for sampled images, as specified by the #FORMAT_FEATURE_SAMPLED_IMAGE_BIT flag in ##VkFormatProperties{@code ::optimalTilingFeatures} returned by #GetPhysicalDeviceFormatProperties() with the same value of {@code format}</li>
            <li>If {@code image} was created with #IMAGE_TILING_OPTIMAL and {@code usage} contains #IMAGE_USAGE_STORAGE_BIT, {@code format} <b>must</b> be supported for storage images, as specified by the #FORMAT_FEATURE_STORAGE_IMAGE_BIT flag in ##VkFormatProperties{@code ::optimalTilingFeatures} returned by #GetPhysicalDeviceFormatProperties() with the same value of {@code format}</li>
            <li>If {@code image} was created with #IMAGE_TILING_OPTIMAL and {@code usage} contains #IMAGE_USAGE_COLOR_ATTACHMENT_BIT, {@code format} <b>must</b> be supported for color attachments, as specified by the #FORMAT_FEATURE_COLOR_ATTACHMENT_BIT flag in ##VkFormatProperties{@code ::optimalTilingFeatures} returned by #GetPhysicalDeviceFormatProperties() with the same value of {@code format}</li>
            <li>If {@code image} was created with #IMAGE_TILING_OPTIMAL and {@code usage} containing #IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT, {@code format} <b>must</b> be supported for depth/stencil attachments, as specified by the #FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT flag in ##VkFormatProperties{@code ::optimalTilingFeatures} returned by #GetPhysicalDeviceFormatProperties() with the same value of {@code format}</li>
            <li>{@code subresourceRange} <b>must</b> be a valid image subresource range for {@code image} (see <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#resources-image-views">the “Image Views” section</a>)</li>
            <li>If {@code image} was created with the #IMAGE_CREATE_MUTABLE_FORMAT_BIT flag, {@code format} <b>must</b> be compatible with the {@code format} used to create {@code image}, as defined in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-formats-compatibility-classes">Format Compatibility Classes</a></li>
            <li>If {@code image} was not created with the #IMAGE_CREATE_MUTABLE_FORMAT_BIT flag, {@code format} <b>must</b> be identical to the {@code format} used to create {@code image}</li>
            <li>If {@code image} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code subresourceRange} and {@code viewType} <b>must</b> be compatible with the image, as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#resources-image-views-compatibility">compatibility table</a></li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code flags} <b>must</b> be 0</li>
            <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
            <li>{@code viewType} <b>must</b> be a valid {@code VkImageViewType} value</li>
            <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
            <li>{@code components} <b>must</b> be a valid ##VkComponentMapping structure</li>
            <li>{@code subresourceRange} <b>must</b> be a valid ##VkImageSubresourceRange structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkComponentMapping, ##VkImageSubresourceRange, #CreateImageView()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkImageViewCreateFlags.member("flags", "reserved for future use.")
    VkImage.member("image", "a {@code VkImage} on which the view will be created.")
    VkImageViewType.member("viewType", "an {@code VkImageViewType} value specifying the type of the image view.")
    VkFormat.member("format", "a {@code VkFormat} describing the format and type used to interpret data elements in the image.")
    VkComponentMapping.member("components", "a ##VkComponentMapping specifies a remapping of color components (or of depth or stencil components after they have been converted into color components).")
    VkImageSubresourceRange.member("subresourceRange", "a ##VkImageSubresourceRange selecting the set of mipmap levels and array layers to be accessible to the view.")
}

val VkShaderModuleCreateInfo = struct(VULKAN_PACKAGE, "VkShaderModuleCreateInfo") {
    documentation =
        """
        Structure specifying parameters of a newly created shader module.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code codeSize} <b>must</b> be greater than 0</li>
            <li>If {@code pCode} points to SPIR-V code, {@code codeSize} <b>must</b> be a multiple of 4</li>
            <li>{@code pCode} <b>must</b> point to either valid SPIR-V code, formatted and packed as described by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#spirv-spec">Khronos SPIR-V Specification</a> or valid GLSL code which <b>must</b> be written to the GL_KHR_vulkan_glsl extension specification</li>
            <li>If {@code pCode} points to SPIR-V code, that code <b>must</b> adhere to the validation rules described by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#spirvenv-module-validation">Validation Rules within a Module</a> section of the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#spirvenv-capabilities">SPIR-V Environment</a> appendix</li>
            <li>If {@code pCode} points to GLSL code, it <b>must</b> be valid GLSL code written to the GL_KHR_vulkan_glsl GLSL extension specification</li>
            <li>{@code pCode} <b>must</b> declare the {@code Shader} capability for SPIR-V code</li>
            <li>{@code pCode} <b>must</b> not declare any capability that is not supported by the API, as described by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#spirvenv-module-validation">Capabilities</a> section of the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#spirvenv-capabilities">SPIR-V Environment</a> appendix</li>
            <li>If {@code pCode} declares any of the capabilities that are listed as not required by the implementation, the relevant feature <b>must</b> be enabled, as listed in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#spirvenv-capabilities-table">SPIR-V Environment</a> appendix</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code flags} <b>must</b> be 0</li>
            <li>{@code pCode} <b>must</b> be a pointer to an array of <code><code><pre> ￿codeSize / 4</pre></code></code> {@code uint32_t} values</li>
        </ul>

        <h5>See Also</h5>
        #CreateShaderModule()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkShaderModuleCreateFlags.member("flags", "reserved for future use.")
    size_t.member("codeSize", "the size, in bytes, of the code pointed to by {@code pCode}.")
    const..uint32_t_p.member("pCode", "points to code that is used to create the shader module. The type and format of the code is determined from the content of the memory addressed by {@code pCode}.")
}

val VkPipelineCacheCreateInfo = struct(VULKAN_PACKAGE, "VkPipelineCacheCreateInfo") {
    documentation =
        """
        Structure specifying parameters of a newly created pipeline cache.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code initialDataSize} is not 0, it <b>must</b> be equal to the size of {@code pInitialData}, as returned by #GetPipelineCacheData() when {@code pInitialData} was originally retrieved</li>
            <li>If {@code initialDataSize} is not 0, {@code pInitialData} <b>must</b> have been retrieved from a previous call to #GetPipelineCacheData()</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PIPELINE_CACHE_CREATE_INFO</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code flags} <b>must</b> be 0</li>
            <li>If {@code initialDataSize} is not 0, {@code pInitialData} <b>must</b> be a pointer to an array of {@code initialDataSize} bytes</li>
        </ul>

        <h5>See Also</h5>
        #CreatePipelineCache()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkPipelineCacheCreateFlags.member("flags", "reserved for future use.")
    AutoSize("pInitialData", optional = true)..size_t.member("initialDataSize", "the number of bytes in {@code pInitialData}. If {@code initialDataSize} is zero, the pipeline cache will initially be empty.")
    const..void_p.member("pInitialData", "a pointer to previously retrieved pipeline cache data. If the pipeline cache data is incompatible (as defined below) with the device, the pipeline cache will be initially empty. If {@code initialDataSize} is zero, {@code pInitialData} is ignored.")
}

val VkSpecializationMapEntry = struct(VULKAN_PACKAGE, "VkSpecializationMapEntry") {
    documentation =
        """
        Structure specifying a specialization map entry.

        <h5>Description</h5>
        If a {@code constantID} value is not a specialization constant ID used in the shader, that map entry does not affect the behavior of the pipeline.

        <h5>Valid Usage</h5>
        <ul>
            <li>For a {@code constantID} specialization constant declared in a shader, {@code size} <b>must</b> match the byte size of the {@code constantID}. If the specialization constant is of type {@code boolean}, {@code size} <b>must</b> be the byte size of {@code VkBool32}</li>
        </ul>

        <h5>See Also</h5>
        ##VkSpecializationInfo
        """

    uint32_t.member("constantID", "the ID of the specialization constant in SPIR-V.")
    uint32_t.member("offset", "the byte offset of the specialization constant value within the supplied data buffer.")
    size_t.member("size", "the byte size of the specialization constant value within the supplied data buffer.")
}

val VkSpecializationInfo = struct(VULKAN_PACKAGE, "VkSpecializationInfo") {
    documentation =
        """
        Structure specifying specialization info.

        <h5>Description</h5>
        {@code pMapEntries} points to a structure of type ##VkSpecializationMapEntry.

        <h5>Valid Usage</h5>
        <ul>
            <li>The {@code offset} member of any given element of {@code pMapEntries} <b>must</b> be less than {@code dataSize}</li>
            <li>For any given element of {@code pMapEntries}, {@code size} <b>must</b> be less than or equal to {@code dataSize} minus {@code offset}</li>
            <li>If {@code mapEntryCount} is not 0, {@code pMapEntries} <b>must</b> be a pointer to an array of {@code mapEntryCount} valid ##VkSpecializationMapEntry structures</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>If {@code dataSize} is not 0, {@code pData} <b>must</b> be a pointer to an array of {@code dataSize} bytes</li>
        </ul>

        <h5>See Also</h5>
        ##VkPipelineShaderStageCreateInfo, ##VkSpecializationMapEntry
        """

    AutoSize("pMapEntries", optional = true)..uint32_t.member("mapEntryCount", "the number of entries in the {@code pMapEntries} array.")
    const..VkSpecializationMapEntry.p.buffer("pMapEntries", "a pointer to an array of ##VkSpecializationMapEntry which maps constant IDs to offsets in {@code pData}.")
    AutoSize("pData", optional = true)..size_t.member("dataSize", "the byte size of the {@code pData} buffer.")
    const..void_p.member("pData", "contains the actual constant values to specialize with.")
}

val VkPipelineShaderStageCreateInfo = struct(VULKAN_PACKAGE, "VkPipelineShaderStageCreateInfo") {
    documentation =
        """
        Structure specifying parameters of a newly created pipeline shader stage.

        <h5>Valid Usage</h5>
        <ul>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-geometryShader">geometry shaders</a> feature is not enabled, {@code stage} <b>must</b> not be #SHADER_STAGE_GEOMETRY_BIT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-tessellationShader">tessellation shaders</a> feature is not enabled, {@code stage} <b>must</b> not be #SHADER_STAGE_TESSELLATION_CONTROL_BIT or #SHADER_STAGE_TESSELLATION_EVALUATION_BIT</li>
            <li>{@code stage} <b>must</b> not be #SHADER_STAGE_ALL_GRAPHICS, or #SHADER_STAGE_ALL</li>
            <li>{@code pName} <b>must</b> be the name of an {@code OpEntryPoint} in {@code module} with an execution model that matches {@code stage}</li>
            <li>If the identified entry point includes any variable in its interface that is declared with the {@code ClipDistance} {@code BuiltIn} decoration, that variable <b>must</b> not have an array size greater than ##VkPhysicalDeviceLimits{@code ::maxClipDistances}</li>
            <li>If the identified entry point includes any variable in its interface that is declared with the {@code CullDistance} {@code BuiltIn} decoration, that variable <b>must</b> not have an array size greater than ##VkPhysicalDeviceLimits{@code ::maxCullDistances}</li>
            <li>If the identified entry point includes any variables in its interface that are declared with the {@code ClipDistance} or {@code CullDistance} {@code BuiltIn} decoration, those variables <b>must</b> not have array sizes which sum to more than ##VkPhysicalDeviceLimits{@code ::maxCombinedClipAndCullDistances}</li>
            <li>If the identified entry point includes any variable in its interface that is declared with the {@code SampleMask} {@code BuiltIn} decoration, that variable <b>must</b> not have an array size greater than ##VkPhysicalDeviceLimits{@code ::maxSampleMaskWords}</li>
            <li>If {@code stage} is #SHADER_STAGE_VERTEX_BIT, the identified entry point <b>must</b> not include any input variable in its interface that is decorated with {@code CullDistance}</li>
            <li>If {@code stage} is #SHADER_STAGE_TESSELLATION_CONTROL_BIT or #SHADER_STAGE_TESSELLATION_EVALUATION_BIT, and the identified entry point has an {@code OpExecutionMode} instruction that specifies a patch size with {@code OutputVertices}, the patch size <b>must</b> be greater than 0 and less than or equal to ##VkPhysicalDeviceLimits{@code ::maxTessellationPatchSize}</li>
            <li>If {@code stage} is #SHADER_STAGE_GEOMETRY_BIT, the identified entry point <b>must</b> have an {@code OpExecutionMode} instruction that specifies a maximum output vertex count that is greater than 0 and less than or equal to ##VkPhysicalDeviceLimits{@code ::maxGeometryOutputVertices}</li>
            <li>If {@code stage} is #SHADER_STAGE_GEOMETRY_BIT, the identified entry point <b>must</b> have an {@code OpExecutionMode} instruction that specifies an invocation count that is greater than 0 and less than or equal to ##VkPhysicalDeviceLimits{@code ::maxGeometryShaderInvocations}</li>
            <li>If {@code stage} is #SHADER_STAGE_GEOMETRY_BIT, and the identified entry point writes to {@code Layer} for any primitive, it <b>must</b> write the same value to {@code Layer} for all vertices of a given primitive</li>
            <li>If {@code stage} is #SHADER_STAGE_GEOMETRY_BIT, and the identified entry point writes to {@code ViewportIndex} for any primitive, it <b>must</b> write the same value to {@code ViewportIndex} for all vertices of a given primitive</li>
            <li>If {@code stage} is #SHADER_STAGE_FRAGMENT_BIT, the identified entry point <b>must</b> not include any output variables in its interface decorated with {@code CullDistance}</li>
            <li>If {@code stage} is #SHADER_STAGE_FRAGMENT_BIT, and the identified entry point writes to {@code FragDepth} in any execution path, it <b>must</b> write to {@code FragDepth} in all execution paths</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code flags} <b>must</b> be 0</li>
            <li>{@code stage} <b>must</b> be a valid {@code VkShaderStageFlagBits} value</li>
            <li>{@code module} <b>must</b> be a valid {@code VkShaderModule} handle</li>
            <li>{@code pName} <b>must</b> be a null-terminated UTF-8 string</li>
            <li>If {@code pSpecializationInfo} is not {@code NULL}, {@code pSpecializationInfo} <b>must</b> be a pointer to a valid ##VkSpecializationInfo structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkComputePipelineCreateInfo, ##VkGraphicsPipelineCreateInfo, ##VkSpecializationInfo
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkPipelineShaderStageCreateFlags.member("flags", "reserved for future use.")
    VkShaderStageFlagBits.member("stage", "a {@code VkShaderStageFlagBits} value specifying a single pipeline stage.")
    VkShaderModule.member("module", "a {@code VkShaderModule} object that contains the shader for this stage.")
    const..charUTF8_p.member("pName", "a pointer to a null-terminated UTF-8 string specifying the entry point name of the shader for this stage.")
    nullable..const..VkSpecializationInfo.p.member("pSpecializationInfo", "a pointer to ##VkSpecializationInfo, as described in <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#pipelines-specialization-constants\">Specialization Constants</a>, and <b>can</b> be {@code NULL}.")
}

val VkVertexInputBindingDescription = struct(VULKAN_PACKAGE, "VkVertexInputBindingDescription") {
    documentation =
        """
        Structure specifying vertex input binding description.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code binding} <b>must</b> be less than ##VkPhysicalDeviceLimits{@code ::maxVertexInputBindings}</li>
            <li>{@code stride} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxVertexInputBindingStride}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code inputRate} <b>must</b> be a valid {@code VkVertexInputRate} value</li>
        </ul>

        <h5>See Also</h5>
        ##VkPipelineVertexInputStateCreateInfo
        """

    uint32_t.member("binding", "the binding number that this structure describes.")
    uint32_t.member("stride", "the distance in bytes between two consecutive elements within the buffer.")
    VkVertexInputRate.member("inputRate", "a {@code VkVertexInputRate} value specifying whether vertex attribute addressing is a function of the vertex index or of the instance index.")
}

val VkVertexInputAttributeDescription = struct(VULKAN_PACKAGE, "VkVertexInputAttributeDescription") {
    documentation =
        """
        Structure specifying vertex input attribute description.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code location} <b>must</b> be less than ##VkPhysicalDeviceLimits{@code ::maxVertexInputAttributes}</li>
            <li>{@code binding} <b>must</b> be less than ##VkPhysicalDeviceLimits{@code ::maxVertexInputBindings}</li>
            <li>{@code offset} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxVertexInputAttributeOffset}</li>
            <li>{@code format} <b>must</b> be allowed as a vertex buffer format, as specified by the #FORMAT_FEATURE_VERTEX_BUFFER_BIT flag in ##VkFormatProperties{@code ::bufferFeatures} returned by #GetPhysicalDeviceFormatProperties()</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
        </ul>

        <h5>See Also</h5>
        ##VkPipelineVertexInputStateCreateInfo
        """

    uint32_t.member("location", "the shader binding location number for this attribute.")
    uint32_t.member("binding", "the binding number which this attribute takes its data from.")
    VkFormat.member("format", "the size and type of the vertex attribute data.")
    uint32_t.member("offset", "a byte offset of this attribute relative to the start of an element in the vertex input binding.")
}

val VkPipelineVertexInputStateCreateInfo = struct(VULKAN_PACKAGE, "VkPipelineVertexInputStateCreateInfo") {
    documentation =
        """
        Structure specifying parameters of a newly created pipeline vertex input state.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code vertexBindingDescriptionCount} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxVertexInputBindings}</li>
            <li>{@code vertexAttributeDescriptionCount} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxVertexInputAttributes}</li>
            <li>For every {@code binding} specified by any given element of {@code pVertexAttributeDescriptions}, a ##VkVertexInputBindingDescription <b>must</b> exist in {@code pVertexBindingDescriptions} with the same value of {@code binding}</li>
            <li>All elements of {@code pVertexBindingDescriptions} <b>must</b> describe distinct binding numbers</li>
            <li>All elements of {@code pVertexAttributeDescriptions} <b>must</b> describe distinct attribute locations</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code flags} <b>must</b> be 0</li>
            <li>If {@code vertexBindingDescriptionCount} is not 0, {@code pVertexBindingDescriptions} <b>must</b> be a pointer to an array of {@code vertexBindingDescriptionCount} valid ##VkVertexInputBindingDescription structures</li>
            <li>If {@code vertexAttributeDescriptionCount} is not 0, {@code pVertexAttributeDescriptions} <b>must</b> be a pointer to an array of {@code vertexAttributeDescriptionCount} valid ##VkVertexInputAttributeDescription structures</li>
        </ul>

        <h5>See Also</h5>
        ##VkGraphicsPipelineCreateInfo, ##VkVertexInputAttributeDescription, ##VkVertexInputBindingDescription
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkPipelineVertexInputStateCreateFlags.member("flags", "reserved for future use.")
    AutoSize("pVertexBindingDescriptions", optional = true)..uint32_t.member("vertexBindingDescriptionCount", "the number of vertex binding descriptions provided in {@code pVertexBindingDescriptions}.")
    const..VkVertexInputBindingDescription.p.buffer("pVertexBindingDescriptions", "a pointer to an array of ##VkVertexInputBindingDescription structures.")
    AutoSize("pVertexAttributeDescriptions", optional = true)..uint32_t.member("vertexAttributeDescriptionCount", "the number of vertex attribute descriptions provided in {@code pVertexAttributeDescriptions}.")
    const..VkVertexInputAttributeDescription.p.buffer("pVertexAttributeDescriptions", "a pointer to an array of ##VkVertexInputAttributeDescription structures.")
}

val VkPipelineInputAssemblyStateCreateInfo = struct(VULKAN_PACKAGE, "VkPipelineInputAssemblyStateCreateInfo") {
    documentation =
        """
        Structure specifying parameters of a newly created pipeline input assembly state.

        <h5>Description</h5>
        Restarting the assembly of primitives discards the most recent index values if those elements formed an incomplete primitive, and restarts the primitive assembly using the subsequent indices, but only assembling the immediately following element through the end of the originally specified elements. The primitive restart index value comparison is performed before adding the {@code vertexOffset} value to the index value.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code topology} is #PRIMITIVE_TOPOLOGY_POINT_LIST, #PRIMITIVE_TOPOLOGY_LINE_LIST, #PRIMITIVE_TOPOLOGY_TRIANGLE_LIST, #PRIMITIVE_TOPOLOGY_LINE_LIST_WITH_ADJACENCY, #PRIMITIVE_TOPOLOGY_TRIANGLE_LIST_WITH_ADJACENCY or #PRIMITIVE_TOPOLOGY_PATCH_LIST, {@code primitiveRestartEnable} <b>must</b> be #FALSE</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-geometryShader">geometry shaders</a> feature is not enabled, {@code topology} <b>must</b> not be any of #PRIMITIVE_TOPOLOGY_LINE_LIST_WITH_ADJACENCY, #PRIMITIVE_TOPOLOGY_LINE_STRIP_WITH_ADJACENCY, #PRIMITIVE_TOPOLOGY_TRIANGLE_LIST_WITH_ADJACENCY or #PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP_WITH_ADJACENCY</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-tessellationShader">tessellation shaders</a> feature is not enabled, {@code topology} <b>must</b> not be #PRIMITIVE_TOPOLOGY_PATCH_LIST</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code flags} <b>must</b> be 0</li>
            <li>{@code topology} <b>must</b> be a valid {@code VkPrimitiveTopology} value</li>
        </ul>

        <h5>See Also</h5>
        ##VkGraphicsPipelineCreateInfo
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkPipelineInputAssemblyStateCreateFlags.member("flags", "reserved for future use.")
    VkPrimitiveTopology.member("topology", "a {@code VkPrimitiveTopology} defining the primitive topology, as described below.")
    VkBool32.member("primitiveRestartEnable", "controls whether a special vertex index value is treated as restarting the assembly of primitives. This enable only applies to indexed draws (#CmdDrawIndexed() and #CmdDrawIndexedIndirect()), and the special index value is either 0xFFFFFFFF when the {@code indexType} parameter of #CmdBindIndexBuffer() is equal to #INDEX_TYPE_UINT32, or 0xFFFF when {@code indexType} is equal to #INDEX_TYPE_UINT16. Primitive restart is not allowed for “list” topologies.")
}

val VkPipelineTessellationStateCreateInfo = struct(VULKAN_PACKAGE, "VkPipelineTessellationStateCreateInfo") {
    documentation =
        """
        Structure specifying parameters of a newly created pipeline tessellation state.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code patchControlPoints} <b>must</b> be greater than zero and less than or equal to ##VkPhysicalDeviceLimits{@code ::maxTessellationPatchSize}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PIPELINE_TESSELLATION_STATE_CREATE_INFO</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code flags} <b>must</b> be 0</li>
        </ul>

        <h5>See Also</h5>
        ##VkGraphicsPipelineCreateInfo
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkPipelineTessellationStateCreateFlags.member("flags", "reserved for future use.")
    uint32_t.member("patchControlPoints", "number of control points per patch.")
}

val VkViewport = struct(VULKAN_PACKAGE, "VkViewport") {
    documentation =
        """
        Structure specifying a viewport.

        <h5>Description</h5>
        The framebuffer depth coordinate <code>z<sub>f</sub></code> <b>may</b> be represented using either a fixed-point or floating-point representation. However, a floating-point representation <b>must</b> be used if the depth/stencil attachment has a floating-point depth component. If an <code>m</code>-bit fixed-point representation is used, we assume that it represents each value <code><pre>
￿k / (2<sup>m</sup> - 1)</pre></code>, where <code>k {elem} { 0, 1, ..., 2<sup>m</sup>-1 }</code>, as <code>k</code> (e.g. 1.0 is represented in binary as a string of all ones).

        The viewport parameters shown in the above equations are found from these values as

        <dl>
            <dd><code>o<sub>x</sub> = x + width / 2</code></dd>

            <dd><code>o<sub>y</sub> = y + height / 2</code></dd>

            <dd><code>o<sub>z</sub> = minDepth</code></dd>

            <dd><code>p<sub>x</sub> = width</code></dd>

            <dd><code>p<sub>y</sub> = height</code></dd>

            <dd><code>p<sub>z</sub> = maxDepth - minDepth</code>.</dd>
        </dl>

        The application <b>can</b> specify a negative term for {@code height}, which has the effect of negating the y coordinate in clip space before performing the transform. When using a negative {@code height}, the application <b>should</b> also adjust the {@code y} value to point to the lower left corner of the viewport instead of the upper left corner. Using the negative {@code height} allows the application to avoid having to negate the y component of the {@code Position} output from the last vertex processing stage in shaders that also target other graphics APIs.

        The width and height of the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-limits-maxViewportDimensions">implementation-dependent maximum viewport dimensions</a> <b>must</b> be greater than or equal to the width and height of the largest image which <b>can</b> be created and attached to a framebuffer.

        The floating-point viewport bounds are represented with an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-limits-viewportSubPixelBits">implementation-dependent precision</a>.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code width} <b>must</b> be greater than {@code 0.0} and less than or equal to ##VkPhysicalDeviceLimits{@code ::maxViewportDimensions}[0]</li>
            <li>{@code height} <b>must</b> be greater than or equal to -##VkPhysicalDeviceLimits{@code ::maxViewportDimensions}[1] and less than or equal to ##VkPhysicalDeviceLimits{@code ::maxViewportDimensions}[1]</li>
            <li>If the VK_AMD_negative_viewport_height extension is enabled, {@code height} <b>can</b> also be negative.</li>
            <li>{@code x} and {@code y} <b>must</b> each be between {@code viewportBoundsRange}[0] and {@code viewportBoundsRange}[1], inclusive</li>
            <li><code>(x + width)</code> <b>must</b> be less than or equal to {@code viewportBoundsRange}[1]</li>
            <li><code>(y + height)</code> <b>must</b> be less than or equal to {@code viewportBoundsRange}[1]</li>
            <li>{@code minDepth} <b>must</b> be between {@code 0.0} and {@code 1.0}, inclusive</li>
            <li>{@code maxDepth} <b>must</b> be between {@code 0.0} and {@code 1.0}, inclusive</li>
        </ul>

        <h5>See Also</h5>
        ##VkPipelineViewportStateCreateInfo, #CmdSetViewport()
        """

    float.member("x", "{@code x} and {@code y} are the viewport&#8217;s upper left corner <code>(x,y)</code>.")
    float.member("y", "see {@code x}")
    float.member("width", "{@code width} and {@code height} are the viewport&#8217;s width and height, respectively.")
    float.member("height", "see {@code width}")
    float.member("minDepth", "{@code minDepth} and {@code maxDepth} are the depth range for the viewport. It is valid for {@code minDepth} to be greater than or equal to {@code maxDepth}.")
    float.member("maxDepth", "see {@code minDepth}")
}

val VkOffset2D = struct(VULKAN_PACKAGE, "VkOffset2D") {
    documentation =
        """
        Structure specifying a two-dimensional offset.
        """

    int32_t.member("x", "")
    int32_t.member("y", "")
}

val VkExtent2D = struct(VULKAN_PACKAGE, "VkExtent2D") {
    documentation =
        """
        Structure specifying a two-dimensional extent.
        """

    uint32_t.member("width", "")
    uint32_t.member("height", "")
}

val VkRect2D = struct(VULKAN_PACKAGE, "VkRect2D") {
    documentation =
        """
        Structure specifying a two-dimensional subregion.
        """

    VkOffset2D.member("offset", "")
    VkExtent2D.member("extent", "")
}

val VkPipelineViewportStateCreateInfo = struct(VULKAN_PACKAGE, "VkPipelineViewportStateCreateInfo") {
    documentation =
        """
        Structure specifying parameters of a newly created pipeline viewport state.

        <h5>Valid Usage</h5>
        <ul>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-multiViewport">multiple viewports</a> feature is not enabled, {@code viewportCount} <b>must</b> be 1</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-multiViewport">multiple viewports</a> feature is not enabled, {@code scissorCount} <b>must</b> be 1</li>
            <li>{@code viewportCount} <b>must</b> be between 1 and ##VkPhysicalDeviceLimits{@code ::maxViewports}, inclusive</li>
            <li>{@code scissorCount} <b>must</b> be between 1 and ##VkPhysicalDeviceLimits{@code ::maxViewports}, inclusive</li>
            <li>{@code scissorCount} and {@code viewportCount} <b>must</b> be identical</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO</li>
            <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of ##VkPipelineViewportWScalingStateCreateInfoNV</li>
            <li>{@code flags} <b>must</b> be 0</li>
            <li>{@code viewportCount} <b>must</b> be greater than 0</li>
            <li>{@code scissorCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##VkGraphicsPipelineCreateInfo, ##VkRect2D, ##VkViewport
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkPipelineViewportStateCreateFlags.member("flags", "reserved for future use.")
    AutoSize("pViewports", optional = true)..uint32_t.member("viewportCount", "the number of viewports used by the pipeline.")
    nullable..const..VkViewport.p.buffer("pViewports", "a pointer to an array of ##VkViewport structures, defining the viewport transforms. If the viewport state is dynamic, this member is ignored.")
    AutoSize("pScissors", optional = true)..uint32_t.member("scissorCount", "the number of <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#fragops-scissor\">scissors</a> and <b>must</b> match the number of viewports.")
    nullable..const..VkRect2D.p.buffer("pScissors", "a pointer to an array of ##VkRect2D structures which define the rectangular bounds of the scissor for the corresponding viewport. If the scissor state is dynamic, this member is ignored.")
}

val VkPipelineRasterizationStateCreateInfo = struct(VULKAN_PACKAGE, "VkPipelineRasterizationStateCreateInfo") {
    documentation =
        """
        Structure specifying parameters of a newly created pipeline rasterization state.

        <h5>Description</h5>
        The application <b>can</b> also add a ##VkPipelineRasterizationStateRasterizationOrderAMD structure to the {@code pNext} chain of a ##VkPipelineRasterizationStateCreateInfo structure. This structure enables selecting the rasterization order to use when rendering with the corresponding graphics pipeline as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#primrast-order">Rasterization Order</a>.

        <h5>Valid Usage</h5>
        <ul>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-depthClamp">depth clamping</a> feature is not enabled, {@code depthClampEnable} <b>must</b> be #FALSE</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-fillModeNonSolid">non-solid fill modes</a> feature is not enabled, {@code polygonMode} <b>must</b> be #POLYGON_MODE_FILL</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO</li>
            <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of ##VkPipelineRasterizationStateRasterizationOrderAMD</li>
            <li>{@code flags} <b>must</b> be 0</li>
            <li>{@code polygonMode} <b>must</b> be a valid {@code VkPolygonMode} value</li>
            <li>{@code cullMode} <b>must</b> be a valid combination of {@code VkCullModeFlagBits} values</li>
            <li>{@code frontFace} <b>must</b> be a valid {@code VkFrontFace} value</li>
        </ul>

        <h5>See Also</h5>
        ##VkGraphicsPipelineCreateInfo
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkPipelineRasterizationStateCreateFlags.member("flags", "reserved for future use.")
    VkBool32.member("depthClampEnable", "controls whether to clamp the fragment&#8217;s depth values instead of clipping primitives to the z planes of the frustum, as described in <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#vertexpostproc-clipping\">Primitive Clipping</a>.")
    VkBool32.member("rasterizerDiscardEnable", "controls whether primitives are discarded immediately before the rasterization stage.")
    VkPolygonMode.member("polygonMode", "the triangle rendering mode. See {@code VkPolygonMode}.")
    VkCullModeFlags.member("cullMode", "the triangle facing direction used for primitive culling. See {@code VkCullModeFlagBits}.")
    VkFrontFace.member("frontFace", "a {@code VkFrontFace} value specifying the front-facing triangle orientation to be used for culling.")
    VkBool32.member("depthBiasEnable", "controls whether to bias fragment depth values.")
    float.member("depthBiasConstantFactor", "a scalar factor controlling the constant depth value added to each fragment.")
    float.member("depthBiasClamp", "the maximum (or minimum) depth bias of a fragment.")
    float.member("depthBiasSlopeFactor", "a scalar factor applied to a fragment&#8217;s slope in depth bias calculations.")
    float.member("lineWidth", "the width of rasterized line segments.")
}

val VkPipelineMultisampleStateCreateInfo = struct(VULKAN_PACKAGE, "VkPipelineMultisampleStateCreateInfo") {
    documentation =
        """
        Structure specifying parameters of a newly created pipeline multisample state.

        <h5>Valid Usage</h5>
        <ul>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-sampleRateShading">sample rate shading</a> feature is not enabled, {@code sampleShadingEnable} <b>must</b> be #FALSE</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-alphaToOne">alpha to one</a> feature is not enabled, {@code alphaToOneEnable} <b>must</b> be #FALSE</li>
            <li>{@code minSampleShading} <b>must</b> be in the range <code>[0,1]</code></li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code flags} <b>must</b> be 0</li>
            <li>{@code rasterizationSamples} <b>must</b> be a valid {@code VkSampleCountFlagBits} value</li>
            <li>If {@code pSampleMask} is not {@code NULL}, {@code pSampleMask} <b>must</b> be a pointer to an array of <code><code><pre> ￿ceil(rasterizationSamples / 32)</pre></code></code> {@code VkSampleMask} values</li>
        </ul>

        <h5>See Also</h5>
        ##VkGraphicsPipelineCreateInfo
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkPipelineMultisampleStateCreateFlags.member("flags", "reserved for future use.")
    VkSampleCountFlagBits.member("rasterizationSamples", "a {@code VkSampleCountFlagBits} specifying the number of samples per pixel used in rasterization.")
    VkBool32.member("sampleShadingEnable", "specifies that fragment shading executes per-sample if #TRUE, or per-fragment if #FALSE, as described in <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#primsrast-sampleshading\">Sample Shading</a>.")
    float.member("minSampleShading", "the minimum fraction of sample shading, as described in <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#primsrast-sampleshading\">Sample Shading</a>.")
    nullable..const..VkSampleMask.p.member("pSampleMask", "a bitmask of static coverage information that is ANDed with the coverage information generated during rasterization, as described in <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#fragops-samplemask\">Sample Mask</a>.")
    VkBool32.member("alphaToCoverageEnable", "controls whether a temporary coverage value is generated based on the alpha component of the fragment&#8217;s first color output as specified in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#fragops-covg\">Multisample Coverage</a> section.")
    VkBool32.member("alphaToOneEnable", "controls whether the alpha component of the fragment&#8217;s first color output is replaced with one as described in <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#fragops-covg\">Multisample Coverage</a>.")
}

val VkStencilOpState = struct(VULKAN_PACKAGE, "VkStencilOpState") {
    documentation =
        """
        Structure specifying stencil operation state.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code failOp} <b>must</b> be a valid {@code VkStencilOp} value</li>
            <li>{@code passOp} <b>must</b> be a valid {@code VkStencilOp} value</li>
            <li>{@code depthFailOp} <b>must</b> be a valid {@code VkStencilOp} value</li>
            <li>{@code compareOp} <b>must</b> be a valid {@code VkCompareOp} value</li>
        </ul>

        <h5>See Also</h5>
        ##VkPipelineDepthStencilStateCreateInfo
        """

    VkStencilOp.member("failOp", "a {@code VkStencilOp} value specifying the action performed on samples that fail the stencil test.")
    VkStencilOp.member("passOp", "a {@code VkStencilOp} value specifying the action performed on samples that pass both the depth and stencil tests.")
    VkStencilOp.member("depthFailOp", "a {@code VkStencilOp} value specifying the action performed on samples that pass the stencil test and fail the depth test.")
    VkCompareOp.member("compareOp", "a {@code VkCompareOp} value specifying the comparison operator used in the stencil test.")
    uint32_t.member("compareMask", "selects the bits of the unsigned integer stencil values participating in the stencil test.")
    uint32_t.member("writeMask", "selects the bits of the unsigned integer stencil values updated by the stencil test in the stencil framebuffer attachment.")
    uint32_t.member("reference", "an integer reference value that is used in the unsigned stencil comparison.")
}

val VkPipelineDepthStencilStateCreateInfo = struct(VULKAN_PACKAGE, "VkPipelineDepthStencilStateCreateInfo") {
    documentation =
        """
        Structure specifying parameters of a newly created pipeline depth stencil state.

        <h5>Valid Usage</h5>
        <ul>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-depthBounds">depth bounds testing</a> feature is not enabled, {@code depthBoundsTestEnable} <b>must</b> be #FALSE</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code flags} <b>must</b> be 0</li>
            <li>{@code depthCompareOp} <b>must</b> be a valid {@code VkCompareOp} value</li>
            <li>{@code front} <b>must</b> be a valid ##VkStencilOpState structure</li>
            <li>{@code back} <b>must</b> be a valid ##VkStencilOpState structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkGraphicsPipelineCreateInfo, ##VkStencilOpState
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkPipelineDepthStencilStateCreateFlags.member("flags", "reserved for future use.")
    VkBool32.member("depthTestEnable", "controls whether <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#fragops-depth\">depth testing</a> is enabled.")
    VkBool32.member("depthWriteEnable", "controls whether <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#fragops-depth-write\">depth writes</a> are enabled when {@code depthTestEnable} is #TRUE. Depth writes are always disabled when {@code depthTestEnable} is #FALSE.")
    VkCompareOp.member("depthCompareOp", "the comparison operator used in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#fragops-depth\">depth test</a>.")
    VkBool32.member("depthBoundsTestEnable", "controls whether <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#fragops-dbt\">depth bounds testing</a> is enabled.")
    VkBool32.member("stencilTestEnable", "controls whether <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#fragops-stencil\">stencil testing</a> is enabled.")
    VkStencilOpState.member("front", "{@code front} and {@code back} control the parameters of the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#fragops-stencil\">stencil test</a>.")
    VkStencilOpState.member("back", "see {@code front}")
    float.member("minDepthBounds", "{@code minDepthBounds} and {@code maxDepthBounds} define the range of values used in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#fragops-dbt\">depth bounds test</a>.")
    float.member("maxDepthBounds", "see {@code minDepthBounds}")
}

val VkPipelineColorBlendAttachmentState = struct(VULKAN_PACKAGE, "VkPipelineColorBlendAttachmentState") {
    documentation =
        """
        Structure specifying a pipeline color blend attachment state.

        <h5>Valid Usage</h5>
        <ul>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-dualSrcBlend">dual source blending</a> feature is not enabled, {@code srcColorBlendFactor} <b>must</b> not be #BLEND_FACTOR_SRC1_COLOR, #BLEND_FACTOR_ONE_MINUS_SRC1_COLOR, #BLEND_FACTOR_SRC1_ALPHA, or #BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-dualSrcBlend">dual source blending</a> feature is not enabled, {@code dstColorBlendFactor} <b>must</b> not be #BLEND_FACTOR_SRC1_COLOR, #BLEND_FACTOR_ONE_MINUS_SRC1_COLOR, #BLEND_FACTOR_SRC1_ALPHA, or #BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-dualSrcBlend">dual source blending</a> feature is not enabled, {@code srcAlphaBlendFactor} <b>must</b> not be #BLEND_FACTOR_SRC1_COLOR, #BLEND_FACTOR_ONE_MINUS_SRC1_COLOR, #BLEND_FACTOR_SRC1_ALPHA, or #BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-dualSrcBlend">dual source blending</a> feature is not enabled, {@code dstAlphaBlendFactor} <b>must</b> not be #BLEND_FACTOR_SRC1_COLOR, #BLEND_FACTOR_ONE_MINUS_SRC1_COLOR, #BLEND_FACTOR_SRC1_ALPHA, or #BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code srcColorBlendFactor} <b>must</b> be a valid {@code VkBlendFactor} value</li>
            <li>{@code dstColorBlendFactor} <b>must</b> be a valid {@code VkBlendFactor} value</li>
            <li>{@code colorBlendOp} <b>must</b> be a valid {@code VkBlendOp} value</li>
            <li>{@code srcAlphaBlendFactor} <b>must</b> be a valid {@code VkBlendFactor} value</li>
            <li>{@code dstAlphaBlendFactor} <b>must</b> be a valid {@code VkBlendFactor} value</li>
            <li>{@code alphaBlendOp} <b>must</b> be a valid {@code VkBlendOp} value</li>
            <li>{@code colorWriteMask} <b>must</b> be a valid combination of {@code VkColorComponentFlagBits} values</li>
        </ul>

        <h5>See Also</h5>
        ##VkPipelineColorBlendStateCreateInfo
        """

    VkBool32.member("blendEnable", "controls whether blending is enabled for the corresponding color attachment. If blending is not enabled, the source fragment&#8217;s color for that attachment is passed through unmodified.")
    VkBlendFactor.member("srcColorBlendFactor", "selects which blend factor is used to determine the source factors <code>(S<sub>r</sub>,S<sub>g</sub>,S<sub>b</sub>)</code>.")
    VkBlendFactor.member("dstColorBlendFactor", "selects which blend factor is used to determine the destination factors <code>(D<sub>r</sub>,D<sub>g</sub>,D<sub>b</sub>)</code>.")
    VkBlendOp.member("colorBlendOp", "selects which blend operation is used to calculate the RGB values to write to the color attachment.")
    VkBlendFactor.member("srcAlphaBlendFactor", "selects which blend factor is used to determine the source factor <code>S<sub>a</sub></code>.")
    VkBlendFactor.member("dstAlphaBlendFactor", "selects which blend factor is used to determine the destination factor <code>D<sub>a</sub></code>.")
    VkBlendOp.member("alphaBlendOp", "selects which blend operation is use to calculate the alpha values to write to the color attachment.")
    VkColorComponentFlags.member("colorWriteMask", "a bitmask of {@code VkColorComponentFlagBits} specifying which of the R, G, B, and/or A components are enabled for writing, as described for the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#framebuffer-color-write-mask\">Color Write Mask</a>.")
}

val VkPipelineColorBlendStateCreateInfo = struct(VULKAN_PACKAGE, "VkPipelineColorBlendStateCreateInfo") {
    documentation =
        """
        Structure specifying parameters of a newly created pipeline color blend state.

        <h5>Description</h5>
        Each element of the {@code pAttachments} array is a ##VkPipelineColorBlendAttachmentState structure specifying per-target blending state for each individual color attachment. If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-independentBlend">independent blending</a> feature is not enabled on the device, all ##VkPipelineColorBlendAttachmentState elements in the {@code pAttachments} array <b>must</b> be identical.

        <h5>Valid Usage</h5>
        <ul>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-independentBlend">independent blending</a> feature is not enabled, all elements of {@code pAttachments} <b>must</b> be identical</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-logicOp">logic operations</a> feature is not enabled, {@code logicOpEnable} <b>must</b> be #FALSE</li>
            <li>If {@code logicOpEnable} is #TRUE, {@code logicOp} <b>must</b> be a valid {@code VkLogicOp} value</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code flags} <b>must</b> be 0</li>
            <li>If {@code attachmentCount} is not 0, {@code pAttachments} <b>must</b> be a pointer to an array of {@code attachmentCount} valid ##VkPipelineColorBlendAttachmentState structures</li>
        </ul>

        <h5>See Also</h5>
        ##VkGraphicsPipelineCreateInfo, ##VkPipelineColorBlendAttachmentState
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkPipelineColorBlendStateCreateFlags.member("flags", "reserved for future use.")
    VkBool32.member("logicOpEnable", "controls whether to apply <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#framebuffer-logicop\">Logical Operations</a>.")
    VkLogicOp.member("logicOp", "selects which logical operation to apply.")
    AutoSize("pAttachments", optional = true)..uint32_t.member("attachmentCount", "the number of ##VkPipelineColorBlendAttachmentState elements in {@code pAttachments}. This value <b>must</b> equal the {@code colorAttachmentCount} for the subpass in which this pipeline is used.")
    const..VkPipelineColorBlendAttachmentState.p.buffer("pAttachments", "a pointer to array of per target attachment states.")
    float.array("blendConstants", "an array of four values used as the R, G, B, and A components of the blend constant that are used in blending, depending on the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#framebuffer-blendfactors\">blend factor</a>.", size = 4)
}

val VkPipelineDynamicStateCreateInfo = struct(VULKAN_PACKAGE, "VkPipelineDynamicStateCreateInfo") {
    documentation =
        """
        Structure specifying parameters of a newly created pipeline dynamic state.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PIPELINE_DYNAMIC_STATE_CREATE_INFO</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code flags} <b>must</b> be 0</li>
            <li>{@code pDynamicStates} <b>must</b> be a pointer to an array of {@code dynamicStateCount} valid {@code VkDynamicState} values</li>
            <li>{@code dynamicStateCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##VkGraphicsPipelineCreateInfo
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkPipelineDynamicStateCreateFlags.member("flags", "reserved for future use.")
    AutoSize("pDynamicStates")..uint32_t.member("dynamicStateCount", "the number of elements in the {@code pDynamicStates} array.")
    const..VkDynamicState.p.member("pDynamicStates", "an array of {@code VkDynamicState} values specifying which pieces of pipeline state will use the values from dynamic state commands rather than from pipeline state creation info.")
}

val VkGraphicsPipelineCreateInfo = struct(VULKAN_PACKAGE, "VkGraphicsPipelineCreateInfo") {
    documentation =
        """
        Structure specifying parameters of a newly created graphics pipeline.

        <h5>Description</h5>
        The parameters {@code basePipelineHandle} and {@code basePipelineIndex} are described in more detail in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#pipelines-pipeline-derivatives">Pipeline Derivatives</a>.

        {@code pStages} points to an array of ##VkPipelineShaderStageCreateInfo structures, which were previously described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#pipelines-compute">Compute Pipelines</a>.

        {@code pDynamicState} points to a structure of type ##VkPipelineDynamicStateCreateInfo.

        If any shader stage fails to compile, the compile log will be reported back to the application, and #ERROR_INVALID_SHADER_NV will be generated.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code flags} contains the #PIPELINE_CREATE_DERIVATIVE_BIT flag, and {@code basePipelineIndex} is -1, {@code basePipelineHandle} <b>must</b> be a valid handle to a graphics {@code VkPipeline}</li>
            <li>If {@code flags} contains the #PIPELINE_CREATE_DERIVATIVE_BIT flag, and {@code basePipelineHandle} is #NULL_HANDLE, {@code basePipelineIndex} <b>must</b> be a valid index into the calling command&#8217;s {@code pCreateInfos} parameter</li>
            <li>If {@code flags} contains the #PIPELINE_CREATE_DERIVATIVE_BIT flag, and {@code basePipelineIndex} is not -1, {@code basePipelineHandle} <b>must</b> be #NULL_HANDLE</li>
            <li>If {@code flags} contains the #PIPELINE_CREATE_DERIVATIVE_BIT flag, and {@code basePipelineHandle} is not #NULL_HANDLE, {@code basePipelineIndex} <b>must</b> be -1</li>
            <li>The {@code stage} member of each element of {@code pStages} <b>must</b> be unique</li>
            <li>The {@code stage} member of one element of {@code pStages} <b>must</b> be #SHADER_STAGE_VERTEX_BIT</li>
            <li>The {@code stage} member of any given element of {@code pStages} <b>must</b> not be #SHADER_STAGE_COMPUTE_BIT</li>
            <li>If {@code pStages} includes a tessellation control shader stage, it <b>must</b> include a tessellation evaluation shader stage</li>
            <li>If {@code pStages} includes a tessellation evaluation shader stage, it <b>must</b> include a tessellation control shader stage</li>
            <li>If {@code pStages} includes a tessellation control shader stage and a tessellation evaluation shader stage, {@code pTessellationState} <b>must</b> be a pointer to a valid ##VkPipelineTessellationStateCreateInfo structure</li>
            <li>If {@code pStages} includes tessellation shader stages, the shader code of at least one stage <b>must</b> contain an {@code OpExecutionMode} instruction that specifies the type of subdivision in the pipeline</li>
            <li>If {@code pStages} includes tessellation shader stages, and the shader code of both stages contain an {@code OpExecutionMode} instruction that specifies the type of subdivision in the pipeline, they <b>must</b> both specify the same subdivision mode</li>
            <li>If {@code pStages} includes tessellation shader stages, the shader code of at least one stage <b>must</b> contain an {@code OpExecutionMode} instruction that specifies the output patch size in the pipeline</li>
            <li>If {@code pStages} includes tessellation shader stages, and the shader code of both contain an {@code OpExecutionMode} instruction that specifies the out patch size in the pipeline, they <b>must</b> both specify the same patch size</li>
            <li>If {@code pStages} includes tessellation shader stages, the {@code topology} member of {@code pInputAssembly} <b>must</b> be #PRIMITIVE_TOPOLOGY_PATCH_LIST</li>
            <li>If the {@code topology} member of {@code pInputAssembly} is #PRIMITIVE_TOPOLOGY_PATCH_LIST, {@code pStages} <b>must</b> include tessellation shader stages</li>
            <li>If {@code pStages} includes a geometry shader stage, and does not include any tessellation shader stages, its shader code <b>must</b> contain an {@code OpExecutionMode} instruction that specifies an input primitive type that is <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#shaders-geometry-execution">compatible</a> with the primitive topology specified in {@code pInputAssembly}</li>
            <li>If {@code pStages} includes a geometry shader stage, and also includes tessellation shader stages, its shader code <b>must</b> contain an {@code OpExecutionMode} instruction that specifies an input primitive type that is <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#shaders-geometry-execution">compatible</a> with the primitive topology that is output by the tessellation stages</li>
            <li>If {@code pStages} includes a fragment shader stage and a geometry shader stage, and the fragment shader code reads from an input variable that is decorated with {@code PrimitiveID}, then the geometry shader code <b>must</b> write to a matching output variable, decorated with {@code PrimitiveID}, in all execution paths</li>
            <li>If {@code pStages} includes a fragment shader stage, its shader code <b>must</b> not read from any input attachment that is defined as #ATTACHMENT_UNUSED in {@code subpass}</li>
            <li>The shader code for the entry points identified by {@code pStages}, and the rest of the state identified by this structure <b>must</b> adhere to the pipeline linking rules described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#interfaces">Shader Interfaces</a> chapter</li>
            <li>If rasterization is not disabled and {@code subpass} uses a depth/stencil attachment in {@code renderpass} that has a layout of #IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL in the ##VkAttachmentReference defined by {@code subpass}, the {@code depthWriteEnable} member of {@code pDepthStencilState} <b>must</b> be #FALSE</li>
            <li>If rasterization is not disabled and {@code subpass} uses a depth/stencil attachment in {@code renderpass} that has a layout of #IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL in the ##VkAttachmentReference defined by {@code subpass}, the {@code failOp}, {@code passOp} and {@code depthFailOp} members of each of the {@code front} and {@code back} members of {@code pDepthStencilState} <b>must</b> be #STENCIL_OP_KEEP</li>
            <li>If rasterization is not disabled and the subpass uses color attachments, then for each color attachment in the subpass the {@code blendEnable} member of the corresponding element of the {@code pAttachment} member of {@code pColorBlendState} <b>must</b> be #FALSE if the {@code format} of the attachment does not support color blend operations, as specified by the #FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT flag in ##VkFormatProperties{@code ::linearTilingFeatures} or ##VkFormatProperties{@code ::optimalTilingFeatures} returned by #GetPhysicalDeviceFormatProperties()</li>
            <li>If rasterization is not disabled and the subpass uses color attachments, the {@code attachmentCount} member of {@code pColorBlendState} <b>must</b> be equal to the {@code colorAttachmentCount} used to create {@code subpass}</li>
            <li>If no element of the {@code pDynamicStates} member of {@code pDynamicState} is #DYNAMIC_STATE_VIEWPORT, the {@code pViewports} member of {@code pViewportState} <b>must</b> be a pointer to an array of {@code pViewportState}{@code ::viewportCount} ##VkViewport structures</li>
            <li>If no element of the {@code pDynamicStates} member of {@code pDynamicState} is #DYNAMIC_STATE_SCISSOR, the {@code pScissors} member of {@code pViewportState} <b>must</b> be a pointer to an array of {@code pViewportState}{@code ::scissorCount} ##VkRect2D structures</li>
            <li>If the wide lines feature is not enabled, and no element of the {@code pDynamicStates} member of {@code pDynamicState} is #DYNAMIC_STATE_LINE_WIDTH, the {@code lineWidth} member of {@code pRasterizationState} <b>must</b> be {@code 1.0}</li>
            <li>If the {@code rasterizerDiscardEnable} member of {@code pRasterizationState} is #FALSE, {@code pViewportState} <b>must</b> be a pointer to a valid ##VkPipelineViewportStateCreateInfo structure</li>
            <li>If the {@code rasterizerDiscardEnable} member of {@code pRasterizationState} is #FALSE, {@code pMultisampleState} <b>must</b> be a pointer to a valid ##VkPipelineMultisampleStateCreateInfo structure</li>
            <li>If the {@code rasterizerDiscardEnable} member of {@code pRasterizationState} is #FALSE, and {@code subpass} uses a depth/stencil attachment, {@code pDepthStencilState} <b>must</b> be a pointer to a valid ##VkPipelineDepthStencilStateCreateInfo structure</li>
            <li>If the {@code rasterizerDiscardEnable} member of {@code pRasterizationState} is #FALSE, and {@code subpass} uses color attachments, {@code pColorBlendState} <b>must</b> be a pointer to a valid ##VkPipelineColorBlendStateCreateInfo structure</li>
            <li>If the depth bias clamping feature is not enabled, no element of the {@code pDynamicStates} member of {@code pDynamicState} is #DYNAMIC_STATE_DEPTH_BIAS, and the {@code depthBiasEnable} member of {@code pDepthStencil} is #TRUE, the {@code depthBiasClamp} member of {@code pDepthStencil} <b>must</b> be {@code 0.0}</li>
            <li>If no element of the {@code pDynamicStates} member of {@code pDynamicState} is #DYNAMIC_STATE_DEPTH_BOUNDS, and the {@code depthBoundsTestEnable} member of {@code pDepthStencil} is #TRUE, the {@code minDepthBounds} and {@code maxDepthBounds} members of {@code pDepthStencil} <b>must</b> be between {@code 0.0} and {@code 1.0}, inclusive</li>
            <li>{@code layout} <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#descriptorsets-pipelinelayout-consistency">consistent</a> with all shaders specified in {@code pStages}</li>
            <li>If {@code subpass} uses color and/or depth/stencil attachments, then the {@code rasterizationSamples} member of {@code pMultisampleState} <b>must</b> be the same as the sample count for those subpass attachments</li>
            <li>If {@code subpass} does not use any color and/or depth/stencil attachments, then the {@code rasterizationSamples} member of {@code pMultisampleState} <b>must</b> follow the rules for a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#renderpass-noattachments">zero-attachment subpass</a></li>
            <li>{@code subpass} <b>must</b> be a valid subpass within {@code renderpass}</li>
            <li>If the {@code renderPass} has multiview enabled and {@code subpass} has more than one bit set in the view mask and {@code multiviewTessellationShader} is not enabled, then {@code pStages} <b>must</b> not include tessellation shaders.</li>
            <li>If the {@code renderPass} has multiview enabled and {@code subpass} has more than one bit set in the view mask and {@code multiviewGeometryShader} is not enabled, then {@code pStages} <b>must</b> not include a geometry shader.</li>
            <li>If the {@code renderPass} has multiview enabled and {@code subpass} has more than one bit set in the view mask, shaders in the pipeline <b>must</b> not write to the {@code Layer} built-in output</li>
            <li>If the {@code renderPass} has multiview enabled, then all shaders <b>must</b> not include variables decorated with the {@code Layer} built-in decoration in their interfaces.</li>
            <li>{@code flags} <b>must</b> not contain the #PIPELINE_CREATE_DISPATCH_BASE_KHX flag.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkPipelineCreateFlagBits} values</li>
            <li>{@code pStages} <b>must</b> be a pointer to an array of {@code stageCount} valid ##VkPipelineShaderStageCreateInfo structures</li>
            <li>{@code pVertexInputState} <b>must</b> be a pointer to a valid ##VkPipelineVertexInputStateCreateInfo structure</li>
            <li>{@code pInputAssemblyState} <b>must</b> be a pointer to a valid ##VkPipelineInputAssemblyStateCreateInfo structure</li>
            <li>{@code pRasterizationState} <b>must</b> be a pointer to a valid ##VkPipelineRasterizationStateCreateInfo structure</li>
            <li>If {@code pDynamicState} is not {@code NULL}, {@code pDynamicState} <b>must</b> be a pointer to a valid ##VkPipelineDynamicStateCreateInfo structure</li>
            <li>{@code layout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
            <li>{@code renderPass} <b>must</b> be a valid {@code VkRenderPass} handle</li>
            <li>{@code stageCount} <b>must</b> be greater than 0</li>
            <li>Each of {@code basePipelineHandle}, {@code layout}, and {@code renderPass} that are valid handles <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>See Also</h5>
        ##VkPipelineColorBlendStateCreateInfo, ##VkPipelineDepthStencilStateCreateInfo, ##VkPipelineDynamicStateCreateInfo, ##VkPipelineInputAssemblyStateCreateInfo, ##VkPipelineMultisampleStateCreateInfo, ##VkPipelineRasterizationStateCreateInfo, ##VkPipelineShaderStageCreateInfo, ##VkPipelineTessellationStateCreateInfo, ##VkPipelineVertexInputStateCreateInfo, ##VkPipelineViewportStateCreateInfo, #CreateGraphicsPipelines()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkPipelineCreateFlags.member("flags", "a bitmask of {@code VkPipelineCreateFlagBits} specifying how the pipeline will be generated.")
    AutoSize("pStages")..uint32_t.member("stageCount", "the number of entries in the {@code pStages} array.")
    const..VkPipelineShaderStageCreateInfo.p.buffer("pStages", "an array of size {@code stageCount} structures of type ##VkPipelineShaderStageCreateInfo describing the set of the shader stages to be included in the graphics pipeline.")
    const..VkPipelineVertexInputStateCreateInfo.p.member("pVertexInputState", "a pointer to an instance of the ##VkPipelineVertexInputStateCreateInfo structure.")
    const..VkPipelineInputAssemblyStateCreateInfo.p.member("pInputAssemblyState", "a pointer to an instance of the ##VkPipelineInputAssemblyStateCreateInfo structure which determines input assembly behavior, as described in <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#drawing\">Drawing Commands</a>.")
    nullable..const..VkPipelineTessellationStateCreateInfo.p.member("pTessellationState", "a pointer to an instance of the ##VkPipelineTessellationStateCreateInfo structure, and is ignored if the pipeline does not include a tessellation control shader stage and tessellation evaluation shader stage.")
    nullable..const..VkPipelineViewportStateCreateInfo.p.member("pViewportState", "a pointer to an instance of the ##VkPipelineViewportStateCreateInfo structure, and is ignored if the pipeline has rasterization disabled.")
    const..VkPipelineRasterizationStateCreateInfo.p.member("pRasterizationState", "a pointer to an instance of the ##VkPipelineRasterizationStateCreateInfo structure.")
    nullable..const..VkPipelineMultisampleStateCreateInfo.p.member("pMultisampleState", "a pointer to an instance of the ##VkPipelineMultisampleStateCreateInfo, and is ignored if the pipeline has rasterization disabled.")
    nullable..const..VkPipelineDepthStencilStateCreateInfo.p.member("pDepthStencilState", "a pointer to an instance of the ##VkPipelineDepthStencilStateCreateInfo structure, and is ignored if the pipeline has rasterization disabled or if the subpass of the render pass the pipeline is created against does not use a depth/stencil attachment.")
    nullable..const..VkPipelineColorBlendStateCreateInfo.p.member("pColorBlendState", "a pointer to an instance of the ##VkPipelineColorBlendStateCreateInfo structure, and is ignored if the pipeline has rasterization disabled or if the subpass of the render pass the pipeline is created against does not use any color attachments.")
    nullable..const..VkPipelineDynamicStateCreateInfo.p.member("pDynamicState", "a pointer to ##VkPipelineDynamicStateCreateInfo and is used to indicate which properties of the pipeline state object are dynamic and <b>can</b> be changed independently of the pipeline state. This <b>can</b> be {@code NULL}, which means no state in the pipeline is considered dynamic.")
    VkPipelineLayout.member("layout", "the description of binding locations used by both the pipeline and descriptor sets used with the pipeline.")
    VkRenderPass.member("renderPass", "a handle to a render pass object describing the environment in which the pipeline will be used; the pipeline <b>must</b> only be used with an instance of any render pass compatible with the one provided. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#renderpass-compatibility\">Render Pass Compatibility</a> for more information.")
    uint32_t.member("subpass", "the index of the subpass in the render pass where this pipeline will be used.")
    VkPipeline.member("basePipelineHandle", "a pipeline to derive from.")
    int32_t.member("basePipelineIndex", "an index into the {@code pCreateInfos} parameter to use as a pipeline to derive from.")
}

val VkComputePipelineCreateInfo = struct(VULKAN_PACKAGE, "VkComputePipelineCreateInfo") {
    documentation =
        """
        Structure specifying parameters of a newly created compute pipeline.

        <h5>Description</h5>
        The parameters {@code basePipelineHandle} and {@code basePipelineIndex} are described in more detail in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#pipelines-pipeline-derivatives">Pipeline Derivatives</a>.

        {@code stage} points to a structure of type ##VkPipelineShaderStageCreateInfo.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code flags} contains the #PIPELINE_CREATE_DERIVATIVE_BIT flag, and {@code basePipelineIndex} is -1, {@code basePipelineHandle} <b>must</b> be a valid handle to a compute {@code VkPipeline}</li>
            <li>If {@code flags} contains the #PIPELINE_CREATE_DERIVATIVE_BIT flag, and {@code basePipelineHandle} is #NULL_HANDLE, {@code basePipelineIndex} <b>must</b> be a valid index into the calling command&#8217;s {@code pCreateInfos} parameter</li>
            <li>If {@code flags} contains the #PIPELINE_CREATE_DERIVATIVE_BIT flag, and {@code basePipelineIndex} is not -1, {@code basePipelineHandle} <b>must</b> be #NULL_HANDLE</li>
            <li>If {@code flags} contains the #PIPELINE_CREATE_DERIVATIVE_BIT flag, and {@code basePipelineHandle} is not #NULL_HANDLE, {@code basePipelineIndex} <b>must</b> be -1</li>
            <li>The {@code stage} member of {@code stage} <b>must</b> be #SHADER_STAGE_COMPUTE_BIT</li>
            <li>The shader code for the entry point identified by {@code stage} and the rest of the state identified by this structure <b>must</b> adhere to the pipeline linking rules described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#interfaces">Shader Interfaces</a> chapter</li>
            <li>{@code layout} <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#descriptorsets-pipelinelayout-consistency">consistent</a> with the layout of the compute shader specified in {@code stage}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_COMPUTE_PIPELINE_CREATE_INFO</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkPipelineCreateFlagBits} values</li>
            <li>{@code stage} <b>must</b> be a valid ##VkPipelineShaderStageCreateInfo structure</li>
            <li>{@code layout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
            <li>Both of {@code basePipelineHandle}, and {@code layout} that are valid handles <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>See Also</h5>
        ##VkPipelineShaderStageCreateInfo, #CreateComputePipelines()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkPipelineCreateFlags.member("flags", "a bitmask of {@code VkPipelineCreateFlagBits} specifying how the pipeline will be generated.")
    VkPipelineShaderStageCreateInfo.member("stage", "a ##VkPipelineShaderStageCreateInfo describing the compute shader.")
    VkPipelineLayout.member("layout", "the description of binding locations used by both the pipeline and descriptor sets used with the pipeline.")
    VkPipeline.member("basePipelineHandle", "a pipeline to derive from")
    int32_t.member("basePipelineIndex", "an index into the {@code pCreateInfos} parameter to use as a pipeline to derive from")
}

val VkPushConstantRange = struct(VULKAN_PACKAGE, "VkPushConstantRange") {
    documentation =
        """
        Structure specifying a push constant range.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code offset} <b>must</b> be less than ##VkPhysicalDeviceLimits{@code ::maxPushConstantsSize}</li>
            <li>{@code offset} <b>must</b> be a multiple of 4</li>
            <li>{@code size} <b>must</b> be greater than 0</li>
            <li>{@code size} <b>must</b> be a multiple of 4</li>
            <li>{@code size} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxPushConstantsSize} minus {@code offset}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code stageFlags} <b>must</b> be a valid combination of {@code VkShaderStageFlagBits} values</li>
            <li>{@code stageFlags} <b>must</b> not be 0</li>
        </ul>

        <h5>See Also</h5>
        ##VkPipelineLayoutCreateInfo
        """

    VkShaderStageFlags.member("stageFlags", "a set of stage flags describing the shader stages that will access a range of push constants. If a particular stage is not included in the range, then accessing members of that range of push constants from the corresponding shader stage will result in undefined data being read.")
    uint32_t.member("offset", "{@code offset} and {@code size} are the start offset and size, respectively, consumed by the range. Both {@code offset} and {@code size} are in units of bytes and <b>must</b> be a multiple of 4. The layout of the push constant variables is specified in the shader.")
    uint32_t.member("size", "see {@code offset}")
}

val VkPipelineLayoutCreateInfo = struct(VULKAN_PACKAGE, "VkPipelineLayoutCreateInfo") {
    documentation =
        """
        Structure specifying the parameters of a newly created pipeline layout object.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code setLayoutCount} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxBoundDescriptorSets}</li>
            <li>The total number of descriptors of the type #DESCRIPTOR_TYPE_SAMPLER and #DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER accessible to any given shader stage across all elements of {@code pSetLayouts} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxPerStageDescriptorSamplers}</li>
            <li>The total number of descriptors of the type #DESCRIPTOR_TYPE_UNIFORM_BUFFER and #DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC accessible to any given shader stage across all elements of {@code pSetLayouts} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxPerStageDescriptorUniformBuffers}</li>
            <li>The total number of descriptors of the type #DESCRIPTOR_TYPE_STORAGE_BUFFER and #DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC accessible to any given shader stage across all elements of {@code pSetLayouts} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxPerStageDescriptorStorageBuffers}</li>
            <li>The total number of descriptors of the type #DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER, #DESCRIPTOR_TYPE_SAMPLED_IMAGE, and #DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER accessible to any given shader stage across all elements of {@code pSetLayouts} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxPerStageDescriptorSampledImages}</li>
            <li>The total number of descriptors of the type #DESCRIPTOR_TYPE_STORAGE_IMAGE, and #DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER accessible to any given shader stage across all elements of {@code pSetLayouts} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxPerStageDescriptorStorageImages}</li>
            <li>Any two elements of {@code pPushConstantRanges} <b>must</b> not include the same stage in {@code stageFlags}</li>
            <li>{@code pSetLayouts} <b>must</b> not contain more than one descriptor set layout that was created with #DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR set</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code flags} <b>must</b> be 0</li>
            <li>If {@code setLayoutCount} is not 0, {@code pSetLayouts} <b>must</b> be a pointer to an array of {@code setLayoutCount} valid {@code VkDescriptorSetLayout} handles</li>
            <li>If {@code pushConstantRangeCount} is not 0, {@code pPushConstantRanges} <b>must</b> be a pointer to an array of {@code pushConstantRangeCount} valid ##VkPushConstantRange structures</li>
        </ul>

        <h5>See Also</h5>
        ##VkPushConstantRange, #CreatePipelineLayout()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkPipelineLayoutCreateFlags.member("flags", "reserved for future use.")
    AutoSize("pSetLayouts", optional = true)..uint32_t.member("setLayoutCount", "the number of descriptor sets included in the pipeline layout.")
    const..VkDescriptorSetLayout.p.member("pSetLayouts", "a pointer to an array of {@code VkDescriptorSetLayout} objects.")
    AutoSize("pPushConstantRanges", optional = true)..uint32_t.member("pushConstantRangeCount", "the number of push constant ranges included in the pipeline layout.")
    const..VkPushConstantRange.p.buffer("pPushConstantRanges", """a pointer to an array of ##VkPushConstantRange structures defining a set of push constant ranges for use in a single pipeline layout. In addition to descriptor set layouts, a pipeline layout also describes how many push constants <b>can</b> be accessed by each stage of the pipeline.
<div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Push constants represent a high speed path to modify constant data in pipelines that is expected to outperform memory-backed resource updates.
        </div>""")
}

val VkSamplerCreateInfo = struct(VULKAN_PACKAGE, "VkSamplerCreateInfo") {
    documentation =
        """
        Structure specifying parameters of a newly created sampler.

        <h5>Description</h5>
        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Mapping of OpenGL to Vulkan filter modes</h5>
        {@code magFilter} values of #FILTER_NEAREST and #FILTER_LINEAR directly correspond to {@code GL_NEAREST} and {@code GL_LINEAR} magnification filters. {@code minFilter} and {@code mipmapMode} combine to correspond to the similarly named OpenGL minification filter of {@code GL_minFilter_MIPMAP_mipmapMode} (e.g. {@code minFilter} of #FILTER_LINEAR and {@code mipmapMode} of #SAMPLER_MIPMAP_MODE_NEAREST correspond to {@code GL_LINEAR_MIPMAP_NEAREST}).

        There are no Vulkan filter modes that directly correspond to OpenGL minification filters of {@code GL_LINEAR} or {@code GL_NEAREST}, but they <b>can</b> be emulated using #SAMPLER_MIPMAP_MODE_NEAREST, {@code minLod} = 0, and {@code maxLod} = 0.25, and using {@code minFilter} = #FILTER_LINEAR or {@code minFilter} = #FILTER_NEAREST, respectively.

        Note that using a {@code maxLod} of zero would cause <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#textures-texel-filtering">magnification</a> to always be performed, and the {@code magFilter} to always be used. This is valid, just not an exact match for OpenGL behavior. Clamping the maximum LOD to 0.25 allows the <code>{lambda}</code> value to be non-zero and minification to be performed, while still always rounding down to the base level. If the {@code minFilter} and {@code magFilter} are equal, then using a {@code maxLod} of zero also works.
        </div>

        The maximum number of sampler objects which <b>can</b> be simultaneously created on a device is implementation-dependent and specified by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-limits-maxSamplerAllocationCount">{@code maxSamplerAllocationCount}</a> member of the ##VkPhysicalDeviceLimits structure. If {@code maxSamplerAllocationCount} is exceeded, #CreateSampler() will return #ERROR_TOO_MANY_OBJECTS.

        Since {@code VkSampler} is a non-dispatchable handle type, implementations <b>may</b> return the same handle for sampler state vectors that are identical. In such cases, all such objects would only count once against the {@code maxSamplerAllocationCount} limit.

        <h5>Valid Usage</h5>
        <ul>
            <li>The absolute value of {@code mipLodBias} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxSamplerLodBias}</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-samplerAnisotropy">anisotropic sampling</a> feature is not enabled, {@code anisotropyEnable} <b>must</b> be #FALSE</li>
            <li>If {@code anisotropyEnable} is #TRUE, {@code maxAnisotropy} <b>must</b> be between {@code 1.0} and ##VkPhysicalDeviceLimits{@code ::maxSamplerAnisotropy}, inclusive</li>
            <li>If {@code unnormalizedCoordinates} is #TRUE, {@code minFilter} and {@code magFilter} <b>must</b> be equal</li>
            <li>If {@code unnormalizedCoordinates} is #TRUE, {@code mipmapMode} <b>must</b> be #SAMPLER_MIPMAP_MODE_NEAREST</li>
            <li>If {@code unnormalizedCoordinates} is #TRUE, {@code minLod} and {@code maxLod} <b>must</b> be zero</li>
            <li>If {@code unnormalizedCoordinates} is #TRUE, {@code addressModeU} and {@code addressModeV} <b>must</b> each be either #SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE or #SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER</li>
            <li>If {@code unnormalizedCoordinates} is #TRUE, {@code anisotropyEnable} <b>must</b> be #FALSE</li>
            <li>If {@code unnormalizedCoordinates} is #TRUE, {@code compareEnable} <b>must</b> be #FALSE</li>
            <li>If any of {@code addressModeU}, {@code addressModeV} or {@code addressModeW} are #SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER, {@code borderColor} <b>must</b> be a valid {@code VkBorderColor} value</li>
            <li>If the VK_KHR_sampler_mirror_clamp_to_edge extension is not enabled, {@code addressModeU}, {@code addressModeV} and {@code addressModeW} <b>must</b> not be #SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE</li>
            <li>If {@code compareEnable} is #TRUE, {@code compareOp} <b>must</b> be a valid {@code VkCompareOp} value</li>
            <li>If either {@code magFilter} or {@code minFilter} is #FILTER_CUBIC_IMG, {@code anisotropyEnable} <b>must</b> be #FALSE</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_SAMPLER_CREATE_INFO</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code flags} <b>must</b> be 0</li>
            <li>{@code magFilter} <b>must</b> be a valid {@code VkFilter} value</li>
            <li>{@code minFilter} <b>must</b> be a valid {@code VkFilter} value</li>
            <li>{@code mipmapMode} <b>must</b> be a valid {@code VkSamplerMipmapMode} value</li>
            <li>{@code addressModeU} <b>must</b> be a valid {@code VkSamplerAddressMode} value</li>
            <li>{@code addressModeV} <b>must</b> be a valid {@code VkSamplerAddressMode} value</li>
            <li>{@code addressModeW} <b>must</b> be a valid {@code VkSamplerAddressMode} value</li>
        </ul>

        <h5>See Also</h5>
        #CreateSampler()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkSamplerCreateFlags.member("flags", "reserved for future use.")
    VkFilter.member("magFilter", "a {@code VkFilter} value specifying the magnification filter to apply to lookups.")
    VkFilter.member("minFilter", "a {@code VkFilter} value specifying the minification filter to apply to lookups.")
    VkSamplerMipmapMode.member("mipmapMode", "a {@code VkSamplerMipmapMode} value specifying the mipmap filter to apply to lookups.")
    VkSamplerAddressMode.member("addressModeU", "a {@code VkSamplerAddressMode} value specifying the addressing mode for outside [0..1] range for U coordinate.")
    VkSamplerAddressMode.member("addressModeV", "a {@code VkSamplerAddressMode} value specifying the addressing mode for outside [0..1] range for V coordinate.")
    VkSamplerAddressMode.member("addressModeW", "a {@code VkSamplerAddressMode} value specifying the addressing mode for outside [0..1] range for W coordinate.")
    float.member("mipLodBias", "the bias to be added to mipmap LOD calculation and bias provided by image sampling functions in SPIR-V, as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#textures-level-of-detail-operation\">Level-of-Detail Operation</a> section.")
    VkBool32.member("anisotropyEnable", "#TRUE to enable anisotropic filtering, as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#textures-texel-anisotropic-filtering\">Texel Anisotropic Filtering</a> section, or #FALSE otherwise.")
    float.member("maxAnisotropy", "the anisotropy value clamp.")
    VkBool32.member("compareEnable", """#TRUE to enable comparison against a reference value during lookups, or #FALSE otherwise.
<ul>
            <li>Note: Some implementations will default to shader state if this member does not match.</li>
        </ul>""")
    VkCompareOp.member("compareOp", "a {@code VkCompareOp} value specifying the comparison function to apply to fetched data before filtering as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#textures-depth-compare-operation\">Depth Compare Operation</a> section.")
    float.member("minLod", "{@code minLod} and {@code maxLod} are the values used to clamp the computed level-of-detail value, as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#textures-level-of-detail-operation\">Level-of-Detail Operation</a> section. {@code maxLod} <b>must</b> be greater than or equal to {@code minLod}.")
    float.member("maxLod", "see {@code minLod}")
    VkBorderColor.member("borderColor", "a {@code VkBorderColor} value specifying the predefined border color to use.")
    VkBool32.member("unnormalizedCoordinates", """controls whether to use unnormalized or normalized texel coordinates to address texels of the image. When set to #TRUE, the range of the image coordinates used to lookup the texel is in the range of zero to the image dimensions for x, y and z. When set to #FALSE the range of image coordinates is zero to one. When {@code unnormalizedCoordinates} is #TRUE, samplers have the following requirements:
<ul>
            <li>{@code minFilter} and {@code magFilter} <b>must</b> be equal.</li>
            <li>{@code mipmapMode} <b>must</b> be #SAMPLER_MIPMAP_MODE_NEAREST.</li>
            <li>{@code minLod} and {@code maxLod} <b>must</b> be zero.</li>
            <li>{@code addressModeU} and {@code addressModeV} <b>must</b> each be either #SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE or #SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER.</li>
            <li>{@code anisotropyEnable} <b>must</b> be #FALSE.</li>
            <li>{@code compareEnable} <b>must</b> be #FALSE.</li>
        </ul>

        When {@code unnormalizedCoordinates} is #TRUE, images the sampler is used with in the shader have the following requirements:
<ul>
            <li>The {@code viewType} <b>must</b> be either #IMAGE_VIEW_TYPE_1D or #IMAGE_VIEW_TYPE_2D.</li>
            <li>The image view <b>must</b> have a single layer and a single mip level.</li>
        </ul>

        When {@code unnormalizedCoordinates} is #TRUE, image built-in functions in the shader that use the sampler have the following requirements:
<ul>
            <li>The functions <b>must</b> not use projection.</li>
            <li>The functions <b>must</b> not use offsets.</li>
        </ul>""")
}

val VkDescriptorSetLayoutBinding = struct(VULKAN_PACKAGE, "VkDescriptorSetLayoutBinding") {
    documentation =
        """
        Structure specifying a descriptor set layout binding.

        <h5>Description</h5>
        The above layout definition allows the descriptor bindings to be specified sparsely such that not all binding numbers between 0 and the maximum binding number need to be specified in the {@code pBindings} array. Bindings that are not specified have a {@code descriptorCount} and {@code stageFlags} of zero, and the {@code descriptorType} is treated as undefined. However, all binding numbers between 0 and the maximum binding number in the ##VkDescriptorSetLayoutCreateInfo{@code ::pBindings} array <b>may</b> consume memory in the descriptor set layout even if not all descriptor bindings are used, though it <b>should</b> not consume additional memory from the descriptor pool.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The maximum binding number specified <b>should</b> be as compact as possible to avoid wasted memory.
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code descriptorType} is #DESCRIPTOR_TYPE_SAMPLER or #DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER, and {@code descriptorCount} is not 0 and {@code pImmutableSamplers} is not {@code NULL}, {@code pImmutableSamplers} <b>must</b> be a pointer to an array of {@code descriptorCount} valid {@code VkSampler} handles</li>
            <li>If {@code descriptorCount} is not 0, {@code stageFlags} <b>must</b> be a valid combination of {@code VkShaderStageFlagBits} values</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code descriptorType} <b>must</b> be a valid {@code VkDescriptorType} value</li>
        </ul>

        <h5>See Also</h5>
        ##VkDescriptorSetLayoutCreateInfo
        """

    uint32_t.member("binding", "the binding number of this entry and corresponds to a resource of the same binding number in the shader stages.")
    VkDescriptorType.member("descriptorType", "a {@code VkDescriptorType} specifying which type of resource descriptors are used for this binding.")
    AutoSize("pImmutableSamplers", optional = true)..uint32_t.member("descriptorCount", "the number of descriptors contained in the binding, accessed in a shader as an array. If {@code descriptorCount} is zero this binding entry is reserved and the resource <b>must</b> not be accessed from any stage via this binding within any pipeline using the set layout.")
    VkShaderStageFlags.member("stageFlags", """member is a bitmask of {@code VkShaderStageFlagBits} specifying which pipeline shader stages <b>can</b> access a resource for this binding. #SHADER_STAGE_ALL is a shorthand specifying that all defined shader stages, including any additional stages defined by extensions, <b>can</b> access the resource.
If a shader stage is not included in {@code stageFlags}, then a resource <b>must</b> not be accessed from that stage via this binding within any pipeline using the set layout. There are no limitations on what combinations of stages <b>can</b> be used by a descriptor binding, and in particular a binding <b>can</b> be used by both graphics stages and the compute stage.""")
    nullable..const..VkSampler.p.member("pImmutableSamplers", "affects initialization of samplers. If {@code descriptorType} specifies a #DESCRIPTOR_TYPE_SAMPLER or #DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER type descriptor, then {@code pImmutableSamplers} <b>can</b> be used to initialize a set of <em>immutable samplers</em>. Immutable samplers are permanently bound into the set layout; later binding a sampler into an immutable sampler slot in a descriptor set is not allowed. If {@code pImmutableSamplers} is not {@code NULL}, then it is considered to be a pointer to an array of sampler handles that will be consumed by the set layout and used for the corresponding binding. If {@code pImmutableSamplers} is {@code NULL}, then the sampler slots are dynamic and sampler handles <b>must</b> be bound into descriptor sets using this layout. If {@code descriptorType} is not one of these descriptor types, then {@code pImmutableSamplers} is ignored.")
}

val VkDescriptorSetLayoutCreateInfo = struct(VULKAN_PACKAGE, "VkDescriptorSetLayoutCreateInfo") {
    documentation =
        """
        Structure specifying parameters of a newly created descriptor set layout.

        <h5>Valid Usage</h5>
        <ul>
            <li>The ##VkDescriptorSetLayoutBinding{@code ::binding} members of the elements of the {@code pBindings} array <b>must</b> each have different values.</li>
            <li>If {@code flags} contains #DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR, then all elements of {@code pBindings} <b>must</b> not have a {@code descriptorType} of #DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC or #DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC</li>
            <li>If {@code flags} contains #DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR, then the total number of elements of all bindings <b>must</b> be less than or equal to ##VkPhysicalDevicePushDescriptorPropertiesKHR{@code ::maxPushDescriptors}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkDescriptorSetLayoutCreateFlagBits} values</li>
            <li>If {@code bindingCount} is not 0, {@code pBindings} <b>must</b> be a pointer to an array of {@code bindingCount} valid ##VkDescriptorSetLayoutBinding structures</li>
        </ul>

        <h5>See Also</h5>
        ##VkDescriptorSetLayoutBinding, #CreateDescriptorSetLayout()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkDescriptorSetLayoutCreateFlags.member("flags", "a bitmask of {@code VkDescriptorSetLayoutCreateFlags}. specifying options for descriptor set layout creation.")
    AutoSize("pBindings", optional = true)..uint32_t.member("bindingCount", "the number of elements in {@code pBindings}.")
    const..VkDescriptorSetLayoutBinding.p.buffer("pBindings", "a pointer to an array of ##VkDescriptorSetLayoutBinding structures.")
}

val VkDescriptorPoolSize = struct(VULKAN_PACKAGE, "VkDescriptorPoolSize") {
    documentation =
        """
        Structure specifying descriptor pool size.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code descriptorCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code type} <b>must</b> be a valid {@code VkDescriptorType} value</li>
        </ul>

        <h5>See Also</h5>
        ##VkDescriptorPoolCreateInfo
        """

    VkDescriptorType.member("type", "the type of descriptor.")
    uint32_t.member("descriptorCount", "the number of descriptors of that type to allocate.")
}

val VkDescriptorPoolCreateInfo = struct(VULKAN_PACKAGE, "VkDescriptorPoolCreateInfo") {
    documentation =
        """
        Structure specifying parameters of a newly created descriptor pool.

        <h5>Description</h5>
        If multiple ##VkDescriptorPoolSize structures appear in the {@code pPoolSizes} array then the pool will be created with enough storage for the total number of descriptors of each type.

        Fragmentation of a descriptor pool is possible and <b>may</b> lead to descriptor set allocation failures. A failure due to fragmentation is defined as failing a descriptor set allocation despite the sum of all outstanding descriptor set allocations from the pool plus the requested allocation requiring no more than the total number of descriptors requested at pool creation. Implementations provide certain guarantees of when fragmentation <b>must</b> not cause allocation failure, as described below.

        If a descriptor pool has not had any descriptor sets freed since it was created or most recently reset then fragmentation <b>must</b> not cause an allocation failure (note that this is always the case for a pool created without the #DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT bit set). Additionally, if all sets allocated from the pool since it was created or most recently reset use the same number of descriptors (of each type) and the requested allocation also uses that same number of descriptors (of each type), then fragmentation <b>must</b> not cause an allocation failure.

        If an allocation failure occurs due to fragmentation, an application <b>can</b> create an additional descriptor pool to perform further descriptor set allocations.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code maxSets} <b>must</b> be greater than 0</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkDescriptorPoolCreateFlagBits} values</li>
            <li>{@code pPoolSizes} <b>must</b> be a pointer to an array of {@code poolSizeCount} valid ##VkDescriptorPoolSize structures</li>
            <li>{@code poolSizeCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##VkDescriptorPoolSize, #CreateDescriptorPool()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkDescriptorPoolCreateFlags.member("flags", "a bitmask of {@code VkDescriptorPoolCreateFlagBits} specifying certain supported operations on the pool.")
    uint32_t.member("maxSets", "the maximum number of descriptor sets that <b>can</b> be allocated from the pool.")
    AutoSize("pPoolSizes")..uint32_t.member("poolSizeCount", "the number of elements in {@code pPoolSizes}.")
    const..VkDescriptorPoolSize.p.buffer("pPoolSizes", "a pointer to an array of ##VkDescriptorPoolSize structures, each containing a descriptor type and number of descriptors of that type to be allocated in the pool.")
}

val VkDescriptorSetAllocateInfo = struct(VULKAN_PACKAGE, "VkDescriptorSetAllocateInfo") {
    documentation =
        """
        Structure specifying the allocation parameters for descriptor sets.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_DESCRIPTOR_SET_ALLOCATE_INFO</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code descriptorPool} <b>must</b> be a valid {@code VkDescriptorPool} handle</li>
            <li>{@code pSetLayouts} <b>must</b> be a pointer to an array of {@code descriptorSetCount} valid {@code VkDescriptorSetLayout} handles</li>
            <li>{@code descriptorSetCount} <b>must</b> be greater than 0</li>
            <li>Both of {@code descriptorPool}, and the elements of {@code pSetLayouts} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>See Also</h5>
        #AllocateDescriptorSets()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkDescriptorPool.member("descriptorPool", "the pool which the sets will be allocated from.")
    AutoSize("pSetLayouts")..uint32_t.member("descriptorSetCount", "determines the number of descriptor sets to be allocated from the pool.")
    const..VkDescriptorSetLayout.p.member("pSetLayouts", "an array of descriptor set layouts, with each member specifying how the corresponding descriptor set is allocated.")
}

val VkDescriptorImageInfo = struct(VULKAN_PACKAGE, "VkDescriptorImageInfo") {
    documentation =
        """
        Structure specifying descriptor image info.

        <h5>Description</h5>
        Members of ##VkDescriptorImageInfo that are not used in an update (as described above) are ignored.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code imageView} <b>must</b> not be 2D or 2D array image view created from a 3D image</li>
            <li>{@code imageLayout} <b>must</b> match the actual {@code VkImageLayout} of each subresource accessible from {@code imageView} at the time this descriptor is accessed</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>Both of {@code imageView}, and {@code sampler} that are valid handles <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>See Also</h5>
        ##VkWriteDescriptorSet
        """

    VkSampler.member("sampler", "a sampler handle, and is used in descriptor updates for types #DESCRIPTOR_TYPE_SAMPLER and #DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER if the binding being updated does not use immutable samplers.")
    VkImageView.member("imageView", "an image view handle, and is used in descriptor updates for types #DESCRIPTOR_TYPE_SAMPLED_IMAGE, #DESCRIPTOR_TYPE_STORAGE_IMAGE, #DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER, and #DESCRIPTOR_TYPE_INPUT_ATTACHMENT.")
    VkImageLayout.member("imageLayout", "the layout that the image subresources accessible from {@code imageView} will be in at the time this descriptor is accessed. {@code imageLayout} is used in descriptor updates for types #DESCRIPTOR_TYPE_SAMPLED_IMAGE, #DESCRIPTOR_TYPE_STORAGE_IMAGE, #DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER, and #DESCRIPTOR_TYPE_INPUT_ATTACHMENT.")
}

val VkDescriptorBufferInfo = struct(VULKAN_PACKAGE, "VkDescriptorBufferInfo") {
    documentation =
        """
        Structure specifying descriptor buffer info.

        <h5>See Also</h5>
        {@code VkBuffer}, {@code VkDeviceSize}, ##VkWriteDescriptorSet
        """

    VkBuffer.member("buffer", "the buffer resource.")
    VkDeviceSize.member("offset", "the offset in bytes from the start of {@code buffer}. Access to buffer memory via this descriptor uses addressing that is relative to this starting offset.")
    VkDeviceSize.member("range", """the size in bytes that is used for this descriptor update, or #WHOLE_SIZE to use the range from {@code offset} to the end of the buffer.
<div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        When using #WHOLE_SIZE, the effective range <b>must</b> not be larger than the maximum range for the descriptor type (<a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-limits-maxUniformBufferRange">maxUniformBufferRange</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-limits-maxStorageBufferRange">maxStorageBufferRange</a>). This means that #WHOLE_SIZE is not typically useful in the common case where uniform buffer descriptors are suballocated from a buffer that is much larger than {@code maxUniformBufferRange}.
        </div>

        == Description

        For #DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC and #DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC descriptor types, {@code offset} is the base offset from which the dynamic offset is applied and {@code range} is the static size used for all dynamic offsets.""")
}

val VkWriteDescriptorSet = struct(VULKAN_PACKAGE, "VkWriteDescriptorSet") {
    documentation =
        """
        Structure specifying the parameters of a descriptor set write operation.

        <h5>Description</h5>
        Only one of {@code pImageInfo}, {@code pBufferInfo}, or {@code pTexelBufferView} members is used according to the descriptor type specified in the {@code descriptorType} member of the containing ##VkWriteDescriptorSet structure, as specified below.

        If the {@code dstBinding} has fewer than {@code descriptorCount} array elements remaining starting from {@code dstArrayElement}, then the remainder will be used to update the subsequent binding - {@code dstBinding}+1 starting at array element zero. If a binding has a {@code descriptorCount} of zero, it is skipped. This behavior applies recursively, with the update affecting consecutive bindings as needed to update all {@code descriptorCount} descriptors.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code dstBinding} <b>must</b> be less than or equal to the maximum value of {@code binding} of all ##VkDescriptorSetLayoutBinding structures specified when {@code dstSet}&#8217;s descriptor set layout was created</li>
            <li>{@code dstBinding} <b>must</b> be a binding with a non-zero {@code descriptorCount}</li>
            <li>All consecutive bindings updated via a single ##VkWriteDescriptorSet structure, except those with a {@code descriptorCount} of zero, <b>must</b> have identical {@code descriptorType} and {@code stageFlags}.</li>
            <li>All consecutive bindings updated via a single ##VkWriteDescriptorSet structure, except those with a {@code descriptorCount} of zero, <b>must</b> all either use immutable samplers or <b>must</b> all not use immutable samplers.</li>
            <li>{@code descriptorType} <b>must</b> match the type of {@code dstBinding} within {@code dstSet}</li>
            <li>{@code dstSet} <b>must</b> be a valid {@code VkDescriptorSet} handle</li>
            <li>The sum of {@code dstArrayElement} and {@code descriptorCount} <b>must</b> be less than or equal to the number of array elements in the descriptor set binding specified by {@code dstBinding}, and all applicable consecutive bindings, as described by <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#descriptorsets-updates-consecutive">the “consecutive binding updates” section</a></li>
            <li>If {@code descriptorType} is #DESCRIPTOR_TYPE_SAMPLER, #DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER, #DESCRIPTOR_TYPE_SAMPLED_IMAGE, #DESCRIPTOR_TYPE_STORAGE_IMAGE, or #DESCRIPTOR_TYPE_INPUT_ATTACHMENT, {@code pImageInfo} <b>must</b> be a pointer to an array of {@code descriptorCount} valid ##VkDescriptorImageInfo structures</li>
            <li>If {@code descriptorType} is #DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER or #DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER, {@code pTexelBufferView} <b>must</b> be a pointer to an array of {@code descriptorCount} valid {@code VkBufferView} handles</li>
            <li>If {@code descriptorType} is #DESCRIPTOR_TYPE_UNIFORM_BUFFER, #DESCRIPTOR_TYPE_STORAGE_BUFFER, #DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC, or #DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC, {@code pBufferInfo} <b>must</b> be a pointer to an array of {@code descriptorCount} valid ##VkDescriptorBufferInfo structures</li>
            <li>If {@code descriptorType} is #DESCRIPTOR_TYPE_SAMPLER or #DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER, and {@code dstSet} was not allocated with a layout that included immutable samplers for {@code dstBinding} with {@code descriptorType}, the {@code sampler} member of any given element of {@code pImageInfo} <b>must</b> be a valid {@code VkSampler} object</li>
            <li>If {@code descriptorType} is #DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER, #DESCRIPTOR_TYPE_SAMPLED_IMAGE, #DESCRIPTOR_TYPE_STORAGE_IMAGE, or #DESCRIPTOR_TYPE_INPUT_ATTACHMENT, the {@code imageView} and {@code imageLayout} members of any given element of {@code pImageInfo} <b>must</b> be a valid {@code VkImageView} and {@code VkImageLayout}, respectively</li>
            <li>If {@code descriptorType} is #DESCRIPTOR_TYPE_UNIFORM_BUFFER or #DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC, the {@code offset} member of any given element of {@code pBufferInfo} <b>must</b> be a multiple of ##VkPhysicalDeviceLimits{@code ::minUniformBufferOffsetAlignment}</li>
            <li>If {@code descriptorType} is #DESCRIPTOR_TYPE_STORAGE_BUFFER or #DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC, the {@code offset} member of any given element of {@code pBufferInfo} <b>must</b> be a multiple of ##VkPhysicalDeviceLimits{@code ::minStorageBufferOffsetAlignment}</li>
            <li>If {@code descriptorType} is #DESCRIPTOR_TYPE_UNIFORM_BUFFER, #DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC, #DESCRIPTOR_TYPE_STORAGE_BUFFER, or #DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC, the {@code buffer} member of any given element of {@code pBufferInfo} that is non-sparse <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>If {@code descriptorType} is #DESCRIPTOR_TYPE_UNIFORM_BUFFER or #DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC, the {@code buffer} member of any given element of {@code pBufferInfo} <b>must</b> have been created with #BUFFER_USAGE_UNIFORM_BUFFER_BIT set</li>
            <li>If {@code descriptorType} is #DESCRIPTOR_TYPE_STORAGE_BUFFER or #DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC, the {@code buffer} member of any given element of {@code pBufferInfo} <b>must</b> have been created with #BUFFER_USAGE_STORAGE_BUFFER_BIT set</li>
            <li>If {@code descriptorType} is #DESCRIPTOR_TYPE_UNIFORM_BUFFER or #DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC, the {@code range} member of any given element of {@code pBufferInfo}, or the effective range if {@code range} is #WHOLE_SIZE, <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxUniformBufferRange}</li>
            <li>If {@code descriptorType} is #DESCRIPTOR_TYPE_STORAGE_BUFFER or #DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC, the {@code range} member of any given element of {@code pBufferInfo}, or the effective range if {@code range} is #WHOLE_SIZE, <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxStorageBufferRange}</li>
            <li>If {@code descriptorType} is #DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER, the {@code VkBuffer} that any given element of {@code pTexelBufferView} was created from <b>must</b> have been created with #BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT set</li>
            <li>If {@code descriptorType} is #DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER, the {@code VkBuffer} that any given element of {@code pTexelBufferView} was created from <b>must</b> have been created with #BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT set</li>
            <li>If {@code descriptorType} is #DESCRIPTOR_TYPE_STORAGE_IMAGE or #DESCRIPTOR_TYPE_INPUT_ATTACHMENT, the {@code imageView} member of any given element of {@code pImageInfo} <b>must</b> have been created with the identity swizzle</li>
            <li>If {@code descriptorType} is #DESCRIPTOR_TYPE_SAMPLED_IMAGE or #DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER, the {@code imageView} member of any given element of {@code pImageInfo} <b>must</b> have been created with #IMAGE_USAGE_SAMPLED_BIT set</li>
            <li>If {@code descriptorType} is #DESCRIPTOR_TYPE_INPUT_ATTACHMENT, the {@code imageView} member of any given element of {@code pImageInfo} <b>must</b> have been created with #IMAGE_USAGE_INPUT_ATTACHMENT_BIT set</li>
            <li>If {@code descriptorType} is #DESCRIPTOR_TYPE_STORAGE_IMAGE, the {@code imageView} member of any given element of {@code pImageInfo} <b>must</b> have been created with #IMAGE_USAGE_STORAGE_BIT set</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code descriptorType} <b>must</b> be a valid {@code VkDescriptorType} value</li>
            <li>{@code descriptorCount} <b>must</b> be greater than 0</li>
            <li>Both of {@code dstSet}, and the elements of {@code pTexelBufferView} that are valid handles <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>See Also</h5>
        ##VkDescriptorBufferInfo, ##VkDescriptorImageInfo, #CmdPushDescriptorSetKHR(), #UpdateDescriptorSets()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkDescriptorSet.member("dstSet", "the destination descriptor set to update.")
    uint32_t.member("dstBinding", "the descriptor binding within that set.")
    uint32_t.member("dstArrayElement", "the starting element in that array.")
    AutoSize("pImageInfo", "pBufferInfo", "pTexelBufferView", atLeastOne = true)..uint32_t.member("descriptorCount", "the number of descriptors to update (the number of elements in {@code pImageInfo}, {@code pBufferInfo}, or {@code pTexelBufferView}).")
    VkDescriptorType.member("descriptorType", "a {@code VkDescriptorType} specifying the type of each descriptor in {@code pImageInfo}, {@code pBufferInfo}, or {@code pTexelBufferView}, as described below. It <b>must</b> be the same type as that specified in ##VkDescriptorSetLayoutBinding for {@code dstSet} at {@code dstBinding}. The type of the descriptor also controls which array the descriptors are taken from.")
    nullable..const..VkDescriptorImageInfo.p.buffer("pImageInfo", "points to an array of ##VkDescriptorImageInfo structures or is ignored, as described below.")
    nullable..const..VkDescriptorBufferInfo.p.buffer("pBufferInfo", "points to an array of ##VkDescriptorBufferInfo structures or is ignored, as described below.")
    nullable..const..VkBufferView.p.member("pTexelBufferView", "points to an array of {@code VkBufferView} handles as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#resources-buffer-views\">Buffer Views</a> section or is ignored, as described below.")
}

val VkCopyDescriptorSet = struct(VULKAN_PACKAGE, "VkCopyDescriptorSet") {
    documentation =
        """
        Structure specifying a copy descriptor set operation.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code srcBinding} <b>must</b> be a valid binding within {@code srcSet}</li>
            <li>The sum of {@code srcArrayElement} and {@code descriptorCount} <b>must</b> be less than or equal to the number of array elements in the descriptor set binding specified by {@code srcBinding}, and all applicable consecutive bindings, as described by <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#descriptorsets-updates-consecutive">the “consecutive binding updates” section</a></li>
            <li>{@code dstBinding} <b>must</b> be a valid binding within {@code dstSet}</li>
            <li>The sum of {@code dstArrayElement} and {@code descriptorCount} <b>must</b> be less than or equal to the number of array elements in the descriptor set binding specified by {@code dstBinding}, and all applicable consecutive bindings, as described by <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#descriptorsets-updates-consecutive">the “consecutive binding updates” section</a></li>
            <li>If {@code srcSet} is equal to {@code dstSet}, then the source and destination ranges of descriptors <b>must</b> not overlap, where the ranges <b>may</b> include array elements from consecutive bindings as described by <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#descriptorsets-updates-consecutive">the “consecutive binding updates” section</a></li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_COPY_DESCRIPTOR_SET</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code srcSet} <b>must</b> be a valid {@code VkDescriptorSet} handle</li>
            <li>{@code dstSet} <b>must</b> be a valid {@code VkDescriptorSet} handle</li>
            <li>Both of {@code dstSet}, and {@code srcSet} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>See Also</h5>
        #UpdateDescriptorSets()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkDescriptorSet.member("srcSet", "{@code srcSet}, {@code srcBinding}, and {@code srcArrayElement} are the source set, binding, and array element, respectively.")
    uint32_t.member("srcBinding", "see {@code srcSet}")
    uint32_t.member("srcArrayElement", "see {@code srcSet}")
    VkDescriptorSet.member("dstSet", "{@code dstSet}, {@code dstBinding}, and {@code dstArrayElement} are the destination set, binding, and array element, respectively.")
    uint32_t.member("dstBinding", "see {@code dstSet}")
    uint32_t.member("dstArrayElement", "see {@code dstSet}")
    uint32_t.member("descriptorCount", "the number of descriptors to copy from the source to destination. If {@code descriptorCount} is greater than the number of remaining array elements in the source or destination binding, those affect consecutive bindings in a manner similar to ##VkWriteDescriptorSet above.")
}

val VkFramebufferCreateInfo = struct(VULKAN_PACKAGE, "VkFramebufferCreateInfo") {
    documentation =
        """
        Structure specifying parameters of a newly created framebuffer.

        <h5>Description</h5>
        Image subresources used as attachments <b>must</b> not be used via any non-attachment usage for the duration of a render pass instance.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        This restriction means that the render pass has full knowledge of all uses of all of the attachments, so that the implementation is able to make correct decisions about when and how to perform layout transitions, when to overlap execution of subpasses, etc.
        </div>

        It is legal for a subpass to use no color or depth/stencil attachments, and rather use shader side effects such as image stores and atomics to produce an output. In this case, the subpass continues to use the {@code width}, {@code height}, and {@code layers} of the framebuffer to define the dimensions of the rendering area, and the {@code rasterizationSamples} from each pipeline's ##VkPipelineMultisampleStateCreateInfo to define the number of samples used in rasterization; however, if ##VkPhysicalDeviceFeatures{@code ::variableMultisampleRate} is #FALSE, then all pipelines to be bound with a given zero-attachment subpass <b>must</b> have the same value for ##VkPipelineMultisampleStateCreateInfo{@code ::rasterizationSamples}.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code attachmentCount} <b>must</b> be equal to the attachment count specified in {@code renderPass}</li>
            <li>Any given element of {@code pAttachments} that is used as a color attachment or resolve attachment by {@code renderPass} <b>must</b> have been created with a {@code usage} value including #IMAGE_USAGE_COLOR_ATTACHMENT_BIT</li>
            <li>Any given element of {@code pAttachments} that is used as a depth/stencil attachment by {@code renderPass} <b>must</b> have been created with a {@code usage} value including #IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT</li>
            <li>Any given element of {@code pAttachments} that is used as an input attachment by {@code renderPass} <b>must</b> have been created with a {@code usage} value including #IMAGE_USAGE_INPUT_ATTACHMENT_BIT</li>
            <li>Any given element of {@code pAttachments} <b>must</b> have been created with an {@code VkFormat} value that matches the {@code VkFormat} specified by the corresponding ##VkAttachmentDescription in {@code renderPass}</li>
            <li>Any given element of {@code pAttachments} <b>must</b> have been created with a {@code samples} value that matches the {@code samples} value specified by the corresponding ##VkAttachmentDescription in {@code renderPass}</li>
            <li>Any given element of {@code pAttachments} <b>must</b> have dimensions at least as large as the corresponding framebuffer dimension</li>
            <li>Any given element of {@code pAttachments} <b>must</b> only specify a single mip level</li>
            <li>Any given element of {@code pAttachments} <b>must</b> have been created with the identity swizzle</li>
            <li>{@code width} <b>must</b> be greater than 0.</li>
            <li>{@code width} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxFramebufferWidth}</li>
            <li>{@code height} <b>must</b> be greater than 0.</li>
            <li>{@code height} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxFramebufferHeight}</li>
            <li>{@code layers} <b>must</b> be greater than 0.</li>
            <li>{@code layers} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxFramebufferLayers}</li>
            <li>Any given element of {@code pAttachments} that is a 2D or 2D array image view taken from a 3D image <b>must</b> not be a depth/stencil format</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code flags} <b>must</b> be 0</li>
            <li>{@code renderPass} <b>must</b> be a valid {@code VkRenderPass} handle</li>
            <li>If {@code attachmentCount} is not 0, {@code pAttachments} <b>must</b> be a pointer to an array of {@code attachmentCount} valid {@code VkImageView} handles</li>
            <li>Both of {@code renderPass}, and the elements of {@code pAttachments} that are valid handles <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>See Also</h5>
        #CreateFramebuffer()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkFramebufferCreateFlags.member("flags", "reserved for future use.")
    VkRenderPass.member("renderPass", "a render pass that defines what render passes the framebuffer will be compatible with. See <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#renderpass-compatibility\">Render Pass Compatibility</a> for details.")
    AutoSize("pAttachments", optional = true)..uint32_t.member("attachmentCount", "the number of attachments.")
    const..VkImageView.p.member("pAttachments", "an array of {@code VkImageView} handles, each of which will be used as the corresponding attachment in a render pass instance.")
    uint32_t.member("width", "{@code width}, {@code height} and {@code layers} define the dimensions of the framebuffer. If the render pass uses multiview, then {@code layers} <b>must</b> be one and each attachment requires a number of layers that is greater than the maximum bit index set in the view mask in the subpasses in which it is used.")
    uint32_t.member("height", "see {@code width}")
    uint32_t.member("layers", "see {@code width}")
}

val VkAttachmentDescription = struct(VULKAN_PACKAGE, "VkAttachmentDescription") {
    documentation =
        """
        Structure specifying an attachment description.

        <h5>Description</h5>
        If the attachment uses a color format, then {@code loadOp} and {@code storeOp} are used, and {@code stencilLoadOp} and {@code stencilStoreOp} are ignored. If the format has depth and/or stencil components, {@code loadOp} and {@code storeOp} apply only to the depth data, while {@code stencilLoadOp} and {@code stencilStoreOp} define how the stencil data is handled. {@code loadOp} and {@code stencilLoadOp} define the <em>load operations</em> that execute as part of the first subpass that uses the attachment. {@code storeOp} and {@code stencilStoreOp} define the <em>store operations</em> that execute as part of the last subpass that uses the attachment.

        The load operation for each value in an attachment used by a subpass happens-before any command recorded into that subpass reads from that value. Load operations for attachments with a depth/stencil format execute in the #PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT pipeline stage. Load operations for attachments with a color format execute in the #PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT pipeline stage.

        Store operations for each value in an attachment used by a subpass happen-after any command recorded into that subpass writes to that value. Store operations for attachments with a depth/stencil format execute in the #PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT pipeline stage. Store operations for attachments with a color format execute in the #PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT pipeline stage.

        If an attachment is not used by any subpass, then {@code loadOp}, {@code storeOp}, {@code stencilStoreOp}, and {@code stencilLoadOp} are ignored, and the attachment's memory contents will not be modified by execution of a render pass instance.

        The load and store operations apply on the first and last use of each view in the render pass, respectively. If a view index of an attachment is not included in the view mask in any subpass that uses it, then the load and store operations are ignored, and the attachment's memory contents will not be modified by execution of a render pass instance.

        During a render pass instance, input/color attachments with color formats that have a component size of 8, 16, or 32 bits <b>must</b> be represented in the attachment's format throughout the instance. Attachments with other floating- or fixed-point color formats, or with depth components <b>may</b> be represented in a format with a precision higher than the attachment format, but <b>must</b> be represented with the same range. When such a component is loaded via the {@code loadOp}, it will be converted into an implementation-dependent format used by the render pass. Such components <b>must</b> be converted from the render pass format, to the format of the attachment, before they are resolved or stored at the end of a render pass instance via {@code storeOp}. Conversions occur as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#fundamentals-numerics">Numeric Representation and Computation</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#fundamentals-fixedconv">Fixed-Point Data Conversions</a>.

        If {@code flags} includes #ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT, then the attachment is treated as if it shares physical memory with another attachment in the same render pass. This information limits the ability of the implementation to reorder certain operations (like layout transitions and the {@code loadOp}) such that it is not improperly reordered against other uses of the same physical memory via a different attachment. This is described in more detail below.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code finalLayout} <b>must</b> not be #IMAGE_LAYOUT_UNDEFINED or #IMAGE_LAYOUT_PREINITIALIZED</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkAttachmentDescriptionFlagBits} values</li>
            <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
            <li>{@code samples} <b>must</b> be a valid {@code VkSampleCountFlagBits} value</li>
            <li>{@code loadOp} <b>must</b> be a valid {@code VkAttachmentLoadOp} value</li>
            <li>{@code storeOp} <b>must</b> be a valid {@code VkAttachmentStoreOp} value</li>
            <li>{@code stencilLoadOp} <b>must</b> be a valid {@code VkAttachmentLoadOp} value</li>
            <li>{@code stencilStoreOp} <b>must</b> be a valid {@code VkAttachmentStoreOp} value</li>
            <li>{@code initialLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
            <li>{@code finalLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
        </ul>

        <h5>See Also</h5>
        ##VkRenderPassCreateInfo
        """

    VkAttachmentDescriptionFlags.member("flags", "a bitmask of {@code VkAttachmentDescriptionFlagBits} specifying additional properties of the attachment.")
    VkFormat.member("format", "a {@code VkFormat} value specifying the format of the image that will be used for the attachment.")
    VkSampleCountFlagBits.member("samples", "the number of samples of the image as defined in {@code VkSampleCountFlagBits}.")
    VkAttachmentLoadOp.member("loadOp", "a {@code VkAttachmentLoadOp} value specifying how the contents of color and depth components of the attachment are treated at the beginning of the subpass where it is first used.")
    VkAttachmentStoreOp.member("storeOp", "a {@code VkAttachmentStoreOp} value specifying how the contents of color and depth components of the attachment are treated at the end of the subpass where it is last used.")
    VkAttachmentLoadOp.member("stencilLoadOp", "a {@code VkAttachmentLoadOp} value specifying how the contents of stencil components of the attachment are treated at the beginning of the subpass where it is first used.")
    VkAttachmentStoreOp.member("stencilStoreOp", "a {@code VkAttachmentStoreOp} value specifying how the contents of stencil components of the attachment are treated at the end of the last subpass where it is used.")
    VkImageLayout.member("initialLayout", "the layout the attachment image subresource will be in when a render pass instance begins.")
    VkImageLayout.member("finalLayout", "the layout the attachment image subresource will be transitioned to when a render pass instance ends. During a render pass instance, an attachment <b>can</b> use a different layout in each subpass, if desired.")
}

val VkAttachmentReference = struct(VULKAN_PACKAGE, "VkAttachmentReference") {
    documentation =
        """
        Structure specifying an attachment reference.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code layout} <b>must</b> not be #IMAGE_LAYOUT_UNDEFINED or #IMAGE_LAYOUT_PREINITIALIZED</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code layout} <b>must</b> be a valid {@code VkImageLayout} value</li>
        </ul>

        <h5>See Also</h5>
        ##VkSubpassDescription
        """

    uint32_t.member("attachment", "the index of the attachment of the render pass, and corresponds to the index of the corresponding element in the {@code pAttachments} array of the ##VkRenderPassCreateInfo structure. If any color or depth/stencil attachments are #ATTACHMENT_UNUSED, then no writes occur for those attachments.")
    VkImageLayout.member("layout", "a {@code VkImageLayout} value specifying the layout the attachment uses during the subpass.")
}

val VkSubpassDescription = struct(VULKAN_PACKAGE, "VkSubpassDescription") {
    documentation =
        """
        Structure specifying a subpass description.

        <h5>Description</h5>
        The contents of an attachment within the render area become undefined at the start of a subpass <b>S</b> if all of the following conditions are true:

        <ul>
            <li>The attachment is used as a color, depth/stencil, or resolve attachment in any subpass in the render pass.</li>
            <li>There is a subpass <b>S<sub>1</sub></b> that uses or preserves the attachment, and a subpass dependency from <b>S<sub>1</sub></b> to <b>S</b>.</li>
            <li>The attachment is not used or preserved in subpass <b>S</b>.</li>
        </ul>

        Once the contents of an attachment become undefined in subpass <b>S</b>, they remain undefined for subpasses in subpass dependency chains starting with subpass <b>S</b> until they are written again. However, they remain valid for subpasses in other subpass dependency chains starting with subpass <b>S<sub>1</sub></b> if those subpasses use or preserve the attachment.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code pipelineBindPoint} <b>must</b> be #PIPELINE_BIND_POINT_GRAPHICS</li>
            <li>{@code colorAttachmentCount} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxColorAttachments}</li>
            <li>If the first use of an attachment in this render pass is as an input attachment, and the attachment is not also used as a color or depth/stencil attachment in the same subpass, then {@code loadOp} <b>must</b> not be #ATTACHMENT_LOAD_OP_CLEAR</li>
            <li>If {@code pResolveAttachments} is not {@code NULL}, for each resolve attachment that does not have the value #ATTACHMENT_UNUSED, the corresponding color attachment <b>must</b> not have the value #ATTACHMENT_UNUSED</li>
            <li>If {@code pResolveAttachments} is not {@code NULL}, the sample count of each element of {@code pColorAttachments} <b>must</b> be anything other than #SAMPLE_COUNT_1_BIT</li>
            <li>Any given element of {@code pResolveAttachments} <b>must</b> have a sample count of #SAMPLE_COUNT_1_BIT</li>
            <li>Any given element of {@code pResolveAttachments} <b>must</b> have the same {@code VkFormat} as its corresponding color attachment</li>
            <li>All attachments in {@code pColorAttachments} and {@code pDepthStencilAttachment} that are not #ATTACHMENT_UNUSED <b>must</b> have the same sample count</li>
            <li>If any input attachments are #ATTACHMENT_UNUSED, then any pipelines bound during the subpass <b>must</b> not access those input attachments from the fragment shader</li>
            <li>The {@code attachment} member of any element of {@code pPreserveAttachments} <b>must</b> not be #ATTACHMENT_UNUSED</li>
            <li>Any given element of {@code pPreserveAttachments} <b>must</b> not also be an element of any other member of the subpass description</li>
            <li>If any attachment is used as both an input attachment and a color or depth/stencil attachment, then each use <b>must</b> use the same {@code layout}</li>
            <li>If {@code flags} includes #SUBPASS_DESCRIPTION_PER_VIEW_POSITION_X_ONLY_BIT_NVX, it <b>must</b> also include #SUBPASS_DESCRIPTION_PER_VIEW_ATTRIBUTES_BIT_NVX.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkSubpassDescriptionFlagBits} values</li>
            <li>{@code pipelineBindPoint} <b>must</b> be a valid {@code VkPipelineBindPoint} value</li>
            <li>If {@code inputAttachmentCount} is not 0, {@code pInputAttachments} <b>must</b> be a pointer to an array of {@code inputAttachmentCount} valid ##VkAttachmentReference structures</li>
            <li>If {@code colorAttachmentCount} is not 0, {@code pColorAttachments} <b>must</b> be a pointer to an array of {@code colorAttachmentCount} valid ##VkAttachmentReference structures</li>
            <li>If {@code colorAttachmentCount} is not 0, and {@code pResolveAttachments} is not {@code NULL}, {@code pResolveAttachments} <b>must</b> be a pointer to an array of {@code colorAttachmentCount} valid ##VkAttachmentReference structures</li>
            <li>If {@code pDepthStencilAttachment} is not {@code NULL}, {@code pDepthStencilAttachment} <b>must</b> be a pointer to a valid ##VkAttachmentReference structure</li>
            <li>If {@code preserveAttachmentCount} is not 0, {@code pPreserveAttachments} <b>must</b> be a pointer to an array of {@code preserveAttachmentCount} {@code uint32_t} values</li>
        </ul>

        <h5>See Also</h5>
        ##VkAttachmentReference, ##VkRenderPassCreateInfo
        """

    VkSubpassDescriptionFlags.member("flags", "a bitmask of {@code VkSubpassDescriptionFlagBits} specifying usage of the subpass.")
    VkPipelineBindPoint.member("pipelineBindPoint", "a {@code VkPipelineBindPoint} value specifying whether this is a compute or graphics subpass. Currently, only graphics subpasses are supported.")
    AutoSize("pInputAttachments", optional = true)..uint32_t.member("inputAttachmentCount", "the number of input attachments.")
    const..VkAttachmentReference.p.buffer("pInputAttachments", "an array of ##VkAttachmentReference structures (defined below) that lists which of the render pass&#8217;s attachments <b>can</b> be read in the shader during the subpass, and what layout each attachment will be in during the subpass. Each element of the array corresponds to an input attachment unit number in the shader, i.e. if the shader declares an input variable {@code layout(input_attachment_index=X, set=Y, binding=Z)} then it uses the attachment provided in {@code pInputAttachments}[X]. Input attachments <b>must</b> also be bound to the pipeline with a descriptor set, with the input attachment descriptor written in the location (set=Y, binding=Z).")
    AutoSize("pColorAttachments", "pResolveAttachments", optional = true)..uint32_t.member("colorAttachmentCount", "the number of color attachments.")
    const..VkAttachmentReference.p.buffer("pColorAttachments", "an array of {@code colorAttachmentCount} ##VkAttachmentReference structures that lists which of the render pass&#8217;s attachments will be used as color attachments in the subpass, and what layout each attachment will be in during the subpass. Each element of the array corresponds to a fragment shader output location, i.e. if the shader declared an output variable {@code layout(location=X)} then it uses the attachment provided in {@code pColorAttachments}[X].")
    nullable..const..VkAttachmentReference.p.buffer("pResolveAttachments", "{@code NULL} or an array of {@code colorAttachmentCount} ##VkAttachmentReference structures that lists which of the render pass&#8217;s attachments are resolved to at the end of the subpass, and what layout each attachment will be in during the multisample resolve operation. If {@code pResolveAttachments} is not {@code NULL}, each of its elements corresponds to a color attachment (the element in {@code pColorAttachments} at the same index), and a multisample resolve operation is defined for each attachment. At the end of each subpass, multisample resolve operations read the subpass&#8217;s color attachments, and resolve the samples for each pixel to the same pixel location in the corresponding resolve attachments, unless the resolve attachment index is #ATTACHMENT_UNUSED. If the first use of an attachment in a render pass is as a resolve attachment, then the {@code loadOp} is effectively ignored as the resolve is guaranteed to overwrite all pixels in the render area.")
    nullable..const..VkAttachmentReference.p.member("pDepthStencilAttachment", "a pointer to a ##VkAttachmentReference specifying which attachment will be used for depth/stencil data and the layout it will be in during the subpass. Setting the attachment index to #ATTACHMENT_UNUSED or leaving this pointer as {@code NULL} indicates that no depth/stencil attachment will be used in the subpass.")
    AutoSize("pPreserveAttachments", optional = true)..uint32_t.member("preserveAttachmentCount", "the number of preserved attachments.")
    const..uint32_t_p.member("pPreserveAttachments", "an array of {@code preserveAttachmentCount} render pass attachment indices describing the attachments that are not used by a subpass, but whose contents <b>must</b> be preserved throughout the subpass.")
}

val VkSubpassDependency = struct(VULKAN_PACKAGE, "VkSubpassDependency") {
    documentation =
        """
        Structure specifying a subpass dependency.

        <h5>Description</h5>
        If {@code srcSubpass} is equal to {@code dstSubpass} then the ##VkSubpassDependency describes a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-barriers-subpass-self-dependencies">subpass self-dependency</a>, and only constrains the pipeline barriers allowed within a subpass instance. Otherwise, when a render pass instance which includes a subpass dependency is submitted to a queue, it defines a memory dependency between the subpasses identified by {@code srcSubpass} and {@code dstSubpass}.

        If {@code srcSubpass} is equal to #SUBPASS_EXTERNAL, the first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a> includes commands submitted to the queue before the render pass instance began. Otherwise, the first set of commands includes all commands submitted as part of the subpass instance identified by {@code srcSubpass} and any load, store or multisample resolve operations on attachments used in {@code srcSubpass}. In either case, the first synchronization scope is limited to operations on the pipeline stages determined by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-masks">source stage mask</a> specified by {@code srcStageMask}.

        If {@code dstSubpass} is equal to #SUBPASS_EXTERNAL, the second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a> includes commands submitted after the render pass instance is ended. Otherwise, the second set of commands includes all commands submitted as part of the subpass instance identified by {@code dstSubpass} and any load, store or multisample resolve operations on attachments used in {@code dstSubpass}. In either case, the second synchronization scope is limited to operations on the pipeline stages determined by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-masks">destination stage mask</a> specified by {@code dstStageMask}.

        The first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-dependencies-access-scopes">access scope</a> is limited to access in the pipeline stages determined by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-masks">source stage mask</a> specified by {@code srcStageMask}. It is also limited to access types in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-access-masks">source access mask</a> specified by {@code srcAccessMask}.

        The second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-dependencies-access-scopes">access scope</a> is limited to access in the pipeline stages determined by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-masks">destination stage mask</a> specified by {@code dstStageMask}. It is also limited to access types in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-access-masks">destination access mask</a> specified by {@code dstAccessMask}.

        The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-dependencies-available-and-visible">availability and visibility operations</a> defined by a subpass dependency affect the execution of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#renderpass-layout-transitions">image layout transitions</a> within the render pass.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code srcSubpass} is not #SUBPASS_EXTERNAL, {@code srcStageMask} <b>must</b> not include #PIPELINE_STAGE_HOST_BIT</li>
            <li>If {@code dstSubpass} is not #SUBPASS_EXTERNAL, {@code dstStageMask} <b>must</b> not include #PIPELINE_STAGE_HOST_BIT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-geometryShader">geometry shaders</a> feature is not enabled, {@code srcStageMask} <b>must</b> not contain #PIPELINE_STAGE_GEOMETRY_SHADER_BIT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-geometryShader">geometry shaders</a> feature is not enabled, {@code dstStageMask} <b>must</b> not contain #PIPELINE_STAGE_GEOMETRY_SHADER_BIT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-tessellationShader">tessellation shaders</a> feature is not enabled, {@code srcStageMask} <b>must</b> not contain #PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT or #PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-tessellationShader">tessellation shaders</a> feature is not enabled, {@code dstStageMask} <b>must</b> not contain #PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT or #PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT</li>
            <li>{@code srcSubpass} <b>must</b> be less than or equal to {@code dstSubpass}, unless one of them is #SUBPASS_EXTERNAL, to avoid cyclic dependencies and ensure a valid execution order</li>
            <li>{@code srcSubpass} and {@code dstSubpass} <b>must</b> not both be equal to #SUBPASS_EXTERNAL</li>
            <li>If {@code srcSubpass} is equal to {@code dstSubpass}, {@code srcStageMask} and {@code dstStageMask} <b>must</b> only contain one of #PIPELINE_STAGE_TOP_OF_PIPE_BIT, #PIPELINE_STAGE_DRAW_INDIRECT_BIT, #PIPELINE_STAGE_VERTEX_INPUT_BIT, #PIPELINE_STAGE_VERTEX_SHADER_BIT, #PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT, #PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT, #PIPELINE_STAGE_GEOMETRY_SHADER_BIT, #PIPELINE_STAGE_FRAGMENT_SHADER_BIT, #PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT, #PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT, #PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT, #PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT, or #PIPELINE_STAGE_ALL_GRAPHICS_BIT</li>
            <li>If {@code srcSubpass} is equal to {@code dstSubpass} and not all of the stages in {@code srcStageMask} and {@code dstStageMask} are <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-framebuffer-regions">framebuffer-space stages</a>, the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-order">logically latest</a> pipeline stage in {@code srcStageMask} <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-order">logically earlier</a> than or equal to the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-order">logically earliest</a> pipeline stage in {@code dstStageMask}</li>
            <li>Any access flag included in {@code srcAccessMask} <b>must</b> be supported by one of the pipeline stages in {@code srcStageMask}, as specified in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-access-types-supported">table of supported access types</a>.</li>
            <li>Any access flag included in {@code dstAccessMask} <b>must</b> be supported by one of the pipeline stages in {@code dstStageMask}, as specified in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-access-types-supported">table of supported access types</a>.</li>
            <li>If {@code dependencyFlags} includes #DEPENDENCY_VIEW_LOCAL_BIT_KHX, then both {@code srcSubpass} and {@code dstSubpass} <b>must</b> not equal #SUBPASS_EXTERNAL</li>
            <li>If {@code dependencyFlags} includes #DEPENDENCY_VIEW_LOCAL_BIT_KHX, then the render pass <b>must</b> have multiview enabled</li>
            <li>If {@code srcSubpass} equals {@code dstSubpass} and that subpass has more than one bit set in the view mask, then {@code dependencyFlags} <b>must</b> include #DEPENDENCY_VIEW_LOCAL_BIT_KHX</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code srcStageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits} values</li>
            <li>{@code srcStageMask} <b>must</b> not be 0</li>
            <li>{@code dstStageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits} values</li>
            <li>{@code dstStageMask} <b>must</b> not be 0</li>
            <li>{@code srcAccessMask} <b>must</b> be a valid combination of {@code VkAccessFlagBits} values</li>
            <li>{@code dstAccessMask} <b>must</b> be a valid combination of {@code VkAccessFlagBits} values</li>
            <li>{@code dependencyFlags} <b>must</b> be a valid combination of {@code VkDependencyFlagBits} values</li>
        </ul>

        <h5>See Also</h5>
        ##VkRenderPassCreateInfo
        """

    uint32_t.member("srcSubpass", "the subpass index of the first subpass in the dependency, or #SUBPASS_EXTERNAL.")
    uint32_t.member("dstSubpass", "the subpass index of the second subpass in the dependency, or #SUBPASS_EXTERNAL.")
    VkPipelineStageFlags.member("srcStageMask", "a bitmask of {@code VkPipelineStageFlagBits} specifying the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#synchronization-pipeline-stages-masks\">source stage mask</a>.")
    VkPipelineStageFlags.member("dstStageMask", "a bitmask of {@code VkPipelineStageFlagBits} specifying the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#synchronization-pipeline-stages-masks\">destination stage mask</a>")
    VkAccessFlags.member("srcAccessMask", "a bitmask of {@code VkAccessFlagBits} specifying a <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#synchronization-access-masks\">source access mask</a>.")
    VkAccessFlags.member("dstAccessMask", "a bitmask of {@code VkAccessFlagBits} specifying a <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#synchronization-access-masks\">destination access mask</a>.")
    VkDependencyFlags.member("dependencyFlags", "a bitmask of {@code VkDependencyFlagBits}.")
}

val VkRenderPassCreateInfo = struct(VULKAN_PACKAGE, "VkRenderPassCreateInfo") {
    documentation =
        """
        Structure specifying parameters of a newly created render pass.

        <h5>Valid Usage</h5>
        <ul>
            <li>If any two subpasses operate on attachments with overlapping ranges of the same {@code VkDeviceMemory} object, and at least one subpass writes to that area of {@code VkDeviceMemory}, a subpass dependency <b>must</b> be included (either directly or via some intermediate subpasses) between them</li>
            <li>If the {@code attachment} member of any element of {@code pInputAttachments}, {@code pColorAttachments}, {@code pResolveAttachments} or {@code pDepthStencilAttachment}, or the attachment indexed by any element of {@code pPreserveAttachments} in any given element of {@code pSubpasses} is bound to a range of a {@code VkDeviceMemory} object that overlaps with any other attachment in any subpass (including the same subpass), the ##VkAttachmentDescription structures describing them <b>must</b> include #ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT in {@code flags}</li>
            <li>If the {@code attachment} member of any element of {@code pInputAttachments}, {@code pColorAttachments}, {@code pResolveAttachments} or {@code pDepthStencilAttachment}, or any element of {@code pPreserveAttachments} in any given element of {@code pSubpasses} is not #ATTACHMENT_UNUSED, it <b>must</b> be less than {@code attachmentCount}</li>
            <li>The value of any element of the {@code pPreserveAttachments} member in any given element of {@code pSubpasses} <b>must</b> not be #ATTACHMENT_UNUSED</li>
            <li>For any member of {@code pAttachments} with a {@code loadOp} equal to #ATTACHMENT_LOAD_OP_CLEAR, the first use of that attachment <b>must</b> not specify a {@code layout} equal to {@code VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL} or {@code VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL}.</li>
            <li>For any element of {@code pDependencies}, if the {@code srcSubpass} is not #SUBPASS_EXTERNAL, all stage flags included in the {@code srcStageMask} member of that dependency <b>must</b> be a pipeline stage supported by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">pipeline</a> identified by the {@code pipelineBindPoint} member of the source subpass.</li>
            <li>For any element of {@code pDependencies}, if the {@code dstSubpass} is not #SUBPASS_EXTERNAL, all stage flags included in the {@code dstStageMask} member of that dependency <b>must</b> be a pipeline stage supported by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">pipeline</a> identified by the {@code pipelineBindPoint} member of the source subpass.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code flags} <b>must</b> be 0</li>
            <li>If {@code attachmentCount} is not 0, {@code pAttachments} <b>must</b> be a pointer to an array of {@code attachmentCount} valid ##VkAttachmentDescription structures</li>
            <li>{@code pSubpasses} <b>must</b> be a pointer to an array of {@code subpassCount} valid ##VkSubpassDescription structures</li>
            <li>If {@code dependencyCount} is not 0, {@code pDependencies} <b>must</b> be a pointer to an array of {@code dependencyCount} valid ##VkSubpassDependency structures</li>
            <li>{@code subpassCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##VkAttachmentDescription, ##VkSubpassDependency, ##VkSubpassDescription, #CreateRenderPass()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkRenderPassCreateFlags.member("flags", "reserved for future use.")
    AutoSize("pAttachments", optional = true)..uint32_t.member("attachmentCount", "the number of attachments used by this render pass, or zero indicating no attachments. Attachments are referred to by zero-based indices in the range [0,{@code attachmentCount}).")
    const..VkAttachmentDescription.p.buffer("pAttachments", "points to an array of {@code attachmentCount} number of ##VkAttachmentDescription structures describing properties of the attachments, or {@code NULL} if {@code attachmentCount} is zero.")
    AutoSize("pSubpasses")..uint32_t.member("subpassCount", "the number of subpasses to create for this render pass. Subpasses are referred to by zero-based indices in the range [0,{@code subpassCount}). A render pass <b>must</b> have at least one subpass.")
    const..VkSubpassDescription.p.buffer("pSubpasses", "points to an array of {@code subpassCount} number of ##VkSubpassDescription structures describing properties of the subpasses.")
    AutoSize("pDependencies", optional = true)..uint32_t.member("dependencyCount", "the number of dependencies between pairs of subpasses, or zero indicating no dependencies.")
    const..VkSubpassDependency.p.buffer("pDependencies", "points to an array of {@code dependencyCount} number of ##VkSubpassDependency structures describing dependencies between pairs of subpasses, or {@code NULL} if {@code dependencyCount} is zero.")
}

val VkCommandPoolCreateInfo = struct(VULKAN_PACKAGE, "VkCommandPoolCreateInfo") {
    documentation =
        """
        Structure specifying parameters of a newly created command pool.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code queueFamilyIndex} <b>must</b> be the index of a queue family available in the calling command&#8217;s {@code device} parameter</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_COMMAND_POOL_CREATE_INFO</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkCommandPoolCreateFlagBits} values</li>
        </ul>

        <h5>See Also</h5>
        #CreateCommandPool()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkCommandPoolCreateFlags.member("flags", "a bitmask of {@code VkCommandPoolCreateFlagBits} indicating usage behavior for the pool and command buffers allocated from it.")
    uint32_t.member("queueFamilyIndex", "designates a queue family as described in section <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#devsandqueues-queueprops\">Queue Family Properties</a>. All command buffers allocated from this command pool <b>must</b> be submitted on queues from the same queue family.")
}

val VkCommandBufferAllocateInfo = struct(VULKAN_PACKAGE, "VkCommandBufferAllocateInfo") {
    documentation =
        """
        Structure specifying the allocation parameters for command buffer object.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code commandBufferCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code commandPool} <b>must</b> be a valid {@code VkCommandPool} handle</li>
            <li>{@code level} <b>must</b> be a valid {@code VkCommandBufferLevel} value</li>
        </ul>

        <h5>See Also</h5>
        #AllocateCommandBuffers()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkCommandPool.member("commandPool", "the command pool from which the command buffers are allocated.")
    VkCommandBufferLevel.member("level", "an {@code VkCommandBufferLevel} value specifying the command buffer level.")
    uint32_t.member("commandBufferCount", "the number of command buffers to allocate from the pool.")
}

val VkCommandBufferInheritanceInfo = struct(VULKAN_PACKAGE, "VkCommandBufferInheritanceInfo") {
    documentation =
        """
        Structure specifying command buffer inheritance info.

        <h5>Valid Usage</h5>
        <ul>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-inheritedQueries">inherited queries</a> feature is not enabled, {@code occlusionQueryEnable} <b>must</b> be #FALSE</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-inheritedQueries">inherited queries</a> feature is enabled, {@code queryFlags} <b>must</b> be a valid combination of {@code VkQueryControlFlagBits} values</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-pipelineStatisticsQuery">pipeline statistics queries</a> feature is not enabled, {@code pipelineStatistics} <b>must</b> be 0</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>Both of {@code framebuffer}, and {@code renderPass} that are valid handles <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>See Also</h5>
        ##VkCommandBufferBeginInfo
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkRenderPass.member("renderPass", "a {@code VkRenderPass} object defining which render passes the {@code VkCommandBuffer} will be <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#renderpass-compatibility\">compatible</a> with and <b>can</b> be executed within. If the {@code VkCommandBuffer} will not be executed within a render pass instance, {@code renderPass} is ignored.")
    uint32_t.member("subpass", "the index of the subpass within the render pass instance that the {@code VkCommandBuffer} will be executed within. If the {@code VkCommandBuffer} will not be executed within a render pass instance, {@code subpass} is ignored.")
    VkFramebuffer.member("framebuffer", """optionally refers to the {@code VkFramebuffer} object that the {@code VkCommandBuffer} will be rendering to if it is executed within a render pass instance. It <b>can</b> be #NULL_HANDLE if the framebuffer is not known, or if the {@code VkCommandBuffer} will not be executed within a render pass instance.
<div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Specifying the exact framebuffer that the secondary command buffer will be executed with <b>may</b> result in better performance at command buffer execution time.
        </div>""")
    VkBool32.member("occlusionQueryEnable", "indicates whether the command buffer <b>can</b> be executed while an occlusion query is active in the primary command buffer. If this is #TRUE, then this command buffer <b>can</b> be executed whether the primary command buffer has an occlusion query active or not. If this is #FALSE, then the primary command buffer <b>must</b> not have an occlusion query active.")
    VkQueryControlFlags.member("queryFlags", "indicates the query flags that <b>can</b> be used by an active occlusion query in the primary command buffer when this secondary command buffer is executed. If this value includes the #QUERY_CONTROL_PRECISE_BIT bit, then the active query <b>can</b> return boolean results or actual sample counts. If this bit is not set, then the active query <b>must</b> not use the #QUERY_CONTROL_PRECISE_BIT bit.")
    VkQueryPipelineStatisticFlags.member("pipelineStatistics", "a bitmask of {@code VkQueryPipelineStatisticFlagBits} specifying the set of pipeline statistics that <b>can</b> be counted by an active query in the primary command buffer when this secondary command buffer is executed. If this value includes a given bit, then this command buffer <b>can</b> be executed whether the primary command buffer has a pipeline statistics query active that includes this bit or not. If this value excludes a given bit, then the active pipeline statistics query <b>must</b> not be from a query pool that counts that statistic.")
}

val VkCommandBufferBeginInfo = struct(VULKAN_PACKAGE, "VkCommandBufferBeginInfo") {
    documentation =
        """
        Structure specifying a command buffer begin operation.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code flags} contains #COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT, the {@code renderPass} member of {@code pInheritanceInfo} <b>must</b> be a valid {@code VkRenderPass}</li>
            <li>If {@code flags} contains #COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT, the {@code subpass} member of {@code pInheritanceInfo} <b>must</b> be a valid subpass index within the {@code renderPass} member of {@code pInheritanceInfo}</li>
            <li>If {@code flags} contains #COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT, the {@code framebuffer} member of {@code pInheritanceInfo} <b>must</b> be either #NULL_HANDLE, or a valid {@code VkFramebuffer} that is compatible with the {@code renderPass} member of {@code pInheritanceInfo}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO</li>
            <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of ##VkDeviceGroupCommandBufferBeginInfoKHX</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkCommandBufferUsageFlagBits} values</li>
        </ul>

        <h5>See Also</h5>
        ##VkCommandBufferInheritanceInfo, #BeginCommandBuffer()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkCommandBufferUsageFlags.member("flags", "a bitmask of {@code VkCommandBufferUsageFlagBits} specifying usage behavior for the command buffer.")
    nullable..const..VkCommandBufferInheritanceInfo.p.member("pInheritanceInfo", "a pointer to a ##VkCommandBufferInheritanceInfo structure, which is used if {@code commandBuffer} is a secondary command buffer. If this is a primary command buffer, then this value is ignored.")
}

val VkBufferCopy = struct(VULKAN_PACKAGE, "VkBufferCopy") {
    documentation =
        """
        Structure specifying a buffer copy operation.
        """

    VkDeviceSize.member("srcOffset", "the starting offset in bytes from the start of {@code srcBuffer}.")
    VkDeviceSize.member("dstOffset", "the starting offset in bytes from the start of {@code dstBuffer}.")
    VkDeviceSize.member("size", "the number of bytes to copy.")
}

val VkImageSubresourceLayers = struct(VULKAN_PACKAGE, "VkImageSubresourceLayers") {
    documentation =
        """
        Structure specifying a image subresource layers.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code aspectMask} contains #IMAGE_ASPECT_COLOR_BIT, it <b>must</b> not contain either of #IMAGE_ASPECT_DEPTH_BIT or #IMAGE_ASPECT_STENCIL_BIT</li>
            <li>{@code aspectMask} <b>must</b> not contain #IMAGE_ASPECT_METADATA_BIT</li>
            <li>{@code mipLevel} <b>must</b> be less than the {@code mipLevels} specified in ##VkImageCreateInfo when the image was created</li>
            <li><code>(baseArrayLayer + layerCount)</code> <b>must</b> be less than or equal to the {@code arrayLayers} specified in ##VkImageCreateInfo when the image was created</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code aspectMask} <b>must</b> be a valid combination of {@code VkImageAspectFlagBits} values</li>
            <li>{@code aspectMask} <b>must</b> not be 0</li>
        </ul>

        <h5>See Also</h5>
        ##VkBufferImageCopy, ##VkImageBlit, ##VkImageCopy, ##VkImageResolve
        """

    VkImageAspectFlags.member("aspectMask", "a combination of {@code VkImageAspectFlagBits}, selecting the color, depth and/or stencil aspects to be copied.")
    uint32_t.member("mipLevel", "the mipmap level to copy from.")
    uint32_t.member("baseArrayLayer", "{@code baseArrayLayer} and {@code layerCount} are the starting layer and number of layers to copy.")
    uint32_t.member("layerCount", "see {@code baseArrayLayer}")
}

val VkImageCopy = struct(VULKAN_PACKAGE, "VkImageCopy") {
    documentation =
        """
        Structure specifying an image copy operation.

        <h5>Description</h5>
        For #IMAGE_TYPE_3D images, copies are performed slice by slice starting with the {@code z} member of the {@code srcOffset} or {@code dstOffset}, and copying {@code depth} slices. For images with multiple layers, copies are performed layer by layer starting with the {@code baseArrayLayer} member of the {@code srcSubresource} or {@code dstSubresource} and copying {@code layerCount} layers. Image data <b>can</b> be copied between images with different image types. If one image is #IMAGE_TYPE_3D and the other image is #IMAGE_TYPE_2D with multiple layers, then each slice is copied to or from a different layer.

        <h5>Valid Usage</h5>
        <ul>
            <li>The {@code aspectMask} member of {@code srcSubresource} and {@code dstSubresource} <b>must</b> match</li>
            <li>The number of slices of the {@code extent} (for 3D) or layers of the {@code srcSubresource} (for non-3D) <b>must</b> match the number of slices of the {@code extent} (for 3D) or layers of the {@code dstSubresource} (for non-3D)</li>
            <li>If either of the calling command&#8217;s {@code srcImage} or {@code dstImage} parameters are of {@code VkImageType} #IMAGE_TYPE_3D, the {@code baseArrayLayer} and {@code layerCount} members of the corresponding subresource <b>must</b> be 0 and 1, respectively</li>
            <li>The {@code aspectMask} member of {@code srcSubresource} <b>must</b> specify aspects present in the calling command&#8217;s {@code srcImage}</li>
            <li>The {@code aspectMask} member of {@code dstSubresource} <b>must</b> specify aspects present in the calling command&#8217;s {@code dstImage}</li>
            <li>{@code srcOffset.x} and <code>(extent.width srcOffset.x)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the source image subresource width</li>
            <li>{@code srcOffset.y} and <code>(extent.height srcOffset.y)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the source image subresource height</li>
            <li>If the calling command&#8217;s {@code srcImage} is of type #IMAGE_TYPE_1D, then {@code srcOffset.y} <b>must</b> be 0 and {@code extent.height} <b>must</b> be 1.</li>
            <li>{@code srcOffset.z} and <code>(extent.depth srcOffset.z)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the source image subresource depth</li>
            <li>If the calling command&#8217;s {@code srcImage} is of type #IMAGE_TYPE_1D or #IMAGE_TYPE_2D, then {@code srcOffset.z} <b>must</b> be 0 and {@code extent.depth} <b>must</b> be 1.</li>
            <li>{@code srcSubresource.baseArrayLayer} <b>must</b> be less than and <code>(srcSubresource.layerCount srcSubresource.baseArrayLayer)</code> <b>must</b> be less than or equal to the number of layers in the source image</li>
            <li>{@code dstOffset.x} and <code>(extent.width dstOffset.x)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the destination image subresource width</li>
            <li>{@code dstOffset.y} and <code>(extent.height dstOffset.y)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the destination image subresource height</li>
            <li>If the calling command&#8217;s {@code dstImage} is of type #IMAGE_TYPE_1D, then {@code dstOffset.y} <b>must</b> be 0 and {@code extent.height} <b>must</b> be 1.</li>
            <li>{@code dstOffset.z} and <code>(extent.depth dstOffset.z)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the destination image subresource depth</li>
            <li>If the calling command&#8217;s {@code dstImage} is of type #IMAGE_TYPE_1D or #IMAGE_TYPE_2D, then {@code dstOffset.z} <b>must</b> be 0 and {@code extent.depth} <b>must</b> be 1.</li>
            <li>{@code dstSubresource.baseArrayLayer} <b>must</b> be less than and <code>(dstSubresource.layerCount dstSubresource.baseArrayLayer)</code> <b>must</b> be less than or equal to the number of layers in the destination image</li>
            <li>If the calling command&#8217;s {@code srcImage} is a compressed format image, all members of {@code srcOffset} <b>must</b> be a multiple of the corresponding dimensions of the compressed texel block</li>
            <li>If the calling command&#8217;s {@code srcImage} is a compressed format image, {@code extent.width} <b>must</b> be a multiple of the compressed texel block width or <code>(extent.width + srcOffset.x)</code> <b>must</b> equal the source image subresource width</li>
            <li>If the calling command&#8217;s {@code srcImage} is a compressed format image, {@code extent.height} <b>must</b> be a multiple of the compressed texel block height or <code>(extent.height + srcOffset.y)</code> <b>must</b> equal the source image subresource height</li>
            <li>If the calling command&#8217;s {@code srcImage} is a compressed format image, {@code extent.depth} <b>must</b> be a multiple of the compressed texel block depth or <code>(extent.depth + srcOffset.z)</code> <b>must</b> equal the source image subresource depth</li>
            <li>If the calling command&#8217;s {@code dstImage} is a compressed format image, all members of {@code dstOffset} <b>must</b> be a multiple of the corresponding dimensions of the compressed texel block</li>
            <li>If the calling command&#8217;s {@code dstImage} is a compressed format image, {@code extent.width} <b>must</b> be a multiple of the compressed texel block width or <code>(extent.width + dstOffset.x)</code> <b>must</b> equal the destination image subresource width</li>
            <li>If the calling command&#8217;s {@code dstImage} is a compressed format image, {@code extent.height} <b>must</b> be a multiple of the compressed texel block height or <code>(extent.height + dstOffset.y)</code> <b>must</b> equal the destination image subresource height</li>
            <li>If the calling command&#8217;s {@code dstImage} is a compressed format image, {@code extent.depth} <b>must</b> be a multiple of the compressed texel block depth or <code>(extent.depth + dstOffset.z)</code> <b>must</b> equal the destination image subresource depth</li>
            <li>{@code srcOffset}, {@code dstOffset}, and {@code extent} <b>must</b> respect the image transfer granularity requirements of the queue family that it will be submitted against, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#devsandqueues-physical-device-enumeration">Physical Device Enumeration</a></li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code srcSubresource} <b>must</b> be a valid ##VkImageSubresourceLayers structure</li>
            <li>{@code dstSubresource} <b>must</b> be a valid ##VkImageSubresourceLayers structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkExtent3D, ##VkImageSubresourceLayers, ##VkOffset3D, #CmdCopyImage()
        """

    VkImageSubresourceLayers.member("srcSubresource", "{@code srcSubresource} and {@code dstSubresource} are ##VkImageSubresourceLayers structures specifying the image subresources of the images used for the source and destination image data, respectively.")
    VkOffset3D.member("srcOffset", "{@code srcOffset} and {@code dstOffset} select the initial x, y, and z offsets in texels of the sub-regions of the source and destination image data.")
    VkImageSubresourceLayers.member("dstSubresource", "see {@code srcSubresource}")
    VkOffset3D.member("dstOffset", "see {@code srcOffset}")
    VkExtent3D.member("extent", "the size in texels of the source image to copy in {@code width}, {@code height} and {@code depth}.")
}

val VkImageBlit = struct(VULKAN_PACKAGE, "VkImageBlit") {
    documentation =
        """
        Structure specifying an image blit operation.

        <h5>Description</h5>
        For each element of the {@code pRegions} array, a blit operation is performed the specified source and destination regions.

        <h5>Valid Usage</h5>
        <ul>
            <li>The {@code aspectMask} member of {@code srcSubresource} and {@code dstSubresource} <b>must</b> match</li>
            <li>The {@code layerCount} member of {@code srcSubresource} and {@code dstSubresource} <b>must</b> match</li>
            <li>If either of the calling command&#8217;s {@code srcImage} or {@code dstImage} parameters are of {@code VkImageType} #IMAGE_TYPE_3D, the {@code baseArrayLayer} and {@code layerCount} members of both {@code srcSubresource} and {@code dstSubresource} <b>must</b> be 0 and 1, respectively</li>
            <li>The {@code aspectMask} member of {@code srcSubresource} <b>must</b> specify aspects present in the calling command&#8217;s {@code srcImage}</li>
            <li>The {@code aspectMask} member of {@code dstSubresource} <b>must</b> specify aspects present in the calling command&#8217;s {@code dstImage}</li>
            <li>{@code srcOffset}[0].{@code x} and {@code srcOffset}[1].{@code x} <b>must</b> both be greater than or equal to 0 and less than or equal to the source image subresource width</li>
            <li>{@code srcOffset}[0].{@code y} and {@code srcOffset}[1].{@code y} <b>must</b> both be greater than or equal to 0 and less than or equal to the source image subresource height</li>
            <li>If the calling command&#8217;s {@code srcImage} is of type #IMAGE_TYPE_1D, then {@code srcOffset}[0].y <b>must</b> be 0 and {@code srcOffset}[1].y <b>must</b> be 1.</li>
            <li>{@code srcOffset}[0].{@code z} and {@code srcOffset}[1].{@code z} <b>must</b> both be greater than or equal to 0 and less than or equal to the source image subresource depth</li>
            <li>If the calling command&#8217;s {@code srcImage} is of type #IMAGE_TYPE_1D or #IMAGE_TYPE_2D, then {@code srcOffset}[0].z <b>must</b> be 0 and {@code srcOffset}[1].z <b>must</b> be 1.</li>
            <li>{@code dstOffset}[0].{@code x} and {@code dstOffset}[1].{@code x} <b>must</b> both be greater than or equal to 0 and less than or equal to the destination image subresource width</li>
            <li>{@code dstOffset}[0].{@code y} and {@code dstOffset}[1].{@code y} <b>must</b> both be greater than or equal to 0 and less than or equal to the destination image subresource height</li>
            <li>If the calling command&#8217;s {@code dstImage} is of type #IMAGE_TYPE_1D, then {@code dstOffset}[0].y <b>must</b> be 0 and {@code dstOffset}[1].y <b>must</b> be 1.</li>
            <li>{@code dstOffset}[0].{@code z} and {@code dstOffset}[1].{@code z} <b>must</b> both be greater than or equal to 0 and less than or equal to the destination image subresource depth</li>
            <li>If the calling command&#8217;s {@code dstImage} is of type #IMAGE_TYPE_1D or #IMAGE_TYPE_2D, then {@code dstOffset}[0].z <b>must</b> be 0 and {@code dstOffset}[1].z <b>must</b> be 1.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code srcSubresource} <b>must</b> be a valid ##VkImageSubresourceLayers structure</li>
            <li>{@code dstSubresource} <b>must</b> be a valid ##VkImageSubresourceLayers structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkImageSubresourceLayers, ##VkOffset3D, #CmdBlitImage()
        """

    VkImageSubresourceLayers.member("srcSubresource", "the subresource to blit from.")
    VkOffset3D.array("srcOffsets", "an array of two ##VkOffset3D structures specifying the bounds of the source region within {@code srcSubresource}.", size = 2)
    VkImageSubresourceLayers.member("dstSubresource", "the subresource to blit into.")
    VkOffset3D.array("dstOffsets", "an array of two ##VkOffset3D structures specifying the bounds of the destination region within {@code dstSubresource}.", size = 2)
}

val VkBufferImageCopy = struct(VULKAN_PACKAGE, "VkBufferImageCopy") {
    documentation =
        """
        Structure specifying a buffer image copy operation.

        <h5>Description</h5>
        When copying to or from a depth or stencil aspect, the data in buffer memory uses a layout that is a (mostly) tightly packed representation of the depth or stencil data. Specifically:

        <ul>
            <li>data copied to or from the stencil aspect of any depth/stencil format is tightly packed with one #FORMAT_S8_UINT value per texel.</li>
            <li>data copied to or from the depth aspect of a #FORMAT_D16_UNORM or #FORMAT_D16_UNORM_S8_UINT format is tightly packed with one #FORMAT_D16_UNORM value per texel.</li>
            <li>data copied to or from the depth aspect of a #FORMAT_D32_SFLOAT or #FORMAT_D32_SFLOAT_S8_UINT format is tightly packed with one #FORMAT_D32_SFLOAT value per texel.</li>
            <li>data copied to or from the depth aspect of a #FORMAT_X8_D24_UNORM_PACK32 or #FORMAT_D24_UNORM_S8_UINT format is packed with one 32-bit word per texel with the D24 value in the LSBs of the word, and undefined values in the eight MSBs.</li>
        </ul>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        To copy both the depth and stencil aspects of a depth/stencil format, two entries in {@code pRegions} <b>can</b> be used, where one specifies the depth aspect in {@code imageSubresource}, and the other specifies the stencil aspect.
        </div>

        Because depth or stencil aspect buffer to image copies <b>may</b> require format conversions on some implementations, they are not supported on queues that do not support graphics. When copying to a depth aspect, the data in buffer memory <b>must</b> be in the the range <code>[0,1]</code> or undefined results occur.

        Copies are done layer by layer starting with image layer {@code baseArrayLayer} member of {@code imageSubresource}. {@code layerCount} layers are copied from the source image or to the destination image.

        <h5>Valid Usage</h5>
        <ul>
            <li>If the the calling command&#8217;s {@code VkImage} parameter&#8217;s format is not a depth/stencil format, then {@code bufferOffset} <b>must</b> be a multiple of the format&#8217;s element size</li>
            <li>{@code bufferOffset} <b>must</b> be a multiple of 4</li>
            <li>{@code bufferRowLength} <b>must</b> be 0, or greater than or equal to the {@code width} member of {@code imageExtent}</li>
            <li>{@code bufferImageHeight} <b>must</b> be 0, or greater than or equal to the {@code height} member of {@code imageExtent}</li>
            <li>{@code imageOffset.x} and <code>(imageExtent.width imageOffset.x)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the image subresource width</li>
            <li>{@code imageOffset.y} and <code>(imageExtent.height imageOffset.y)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the image subresource height</li>
            <li>If the calling command&#8217;s {@code srcImage} (#CmdCopyImageToBuffer()) or {@code dstImage} (#CmdCopyBufferToImage()) is of type #IMAGE_TYPE_1D, then {@code imageOffset.y} <b>must</b> be 0 and {@code imageExtent.height} <b>must</b> be 1.</li>
            <li>{@code imageOffset.z} and <code>(imageExtent.depth imageOffset.z)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the image subresource depth</li>
            <li>If the calling command&#8217;s {@code srcImage} (#CmdCopyImageToBuffer()) or {@code dstImage} (#CmdCopyBufferToImage()) is of type #IMAGE_TYPE_1D or #IMAGE_TYPE_2D, then {@code imageOffset.z} <b>must</b> be 0 and {@code imageExtent.depth} <b>must</b> be 1.</li>
            <li>If the calling command&#8217;s {@code VkImage} parameter is a compressed format image, {@code bufferRowLength} <b>must</b> be a multiple of the compressed texel block width</li>
            <li>If the calling command&#8217;s {@code VkImage} parameter is a compressed format image, {@code bufferImageHeight} <b>must</b> be a multiple of the compressed texel block height</li>
            <li>If the calling command&#8217;s {@code VkImage} parameter is a compressed format image, all members of {@code imageOffset} <b>must</b> be a multiple of the corresponding dimensions of the compressed texel block</li>
            <li>If the calling command&#8217;s {@code VkImage} parameter is a compressed format image, {@code bufferOffset} <b>must</b> be a multiple of the compressed texel block size in bytes</li>
            <li>If the calling command&#8217;s {@code VkImage} parameter is a compressed format image, {@code imageExtent.width} <b>must</b> be a multiple of the compressed texel block width or <code>(imageExtent.width imageOffset.x)</code> <b>must</b> equal the image subresource width</li>
            <li>If the calling command&#8217;s {@code VkImage} parameter is a compressed format image, {@code imageExtent.height} <b>must</b> be a multiple of the compressed texel block height or <code>(imageExtent.height imageOffset.y)</code> <b>must</b> equal the image subresource height</li>
            <li>If the calling command&#8217;s {@code VkImage} parameter is a compressed format image, {@code imageExtent.depth} <b>must</b> be a multiple of the compressed texel block depth or <code>(imageExtent.depth imageOffset.z)</code> <b>must</b> equal the image subresource depth</li>
            <li>{@code bufferOffset}, {@code bufferRowLength}, {@code bufferImageHeight} and all members of {@code imageOffset} and {@code imageExtent} <b>must</b> respect the image transfer granularity requirements of the queue family that it will be submitted against, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#devsandqueues-physical-device-enumeration">Physical Device Enumeration</a></li>
            <li>The {@code aspectMask} member of {@code imageSubresource} <b>must</b> specify aspects present in the calling command&#8217;s {@code VkImage} parameter</li>
            <li>The {@code aspectMask} member of {@code imageSubresource} <b>must</b> only have a single bit set</li>
            <li>If the calling command&#8217;s {@code VkImage} parameter is of {@code VkImageType} #IMAGE_TYPE_3D, the {@code baseArrayLayer} and {@code layerCount} members of {@code imageSubresource} <b>must</b> be 0 and 1, respectively</li>
            <li>When copying to the depth aspect of an image subresource, the data in the source buffer <b>must</b> be in the range <code>[0,1]</code></li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code imageSubresource} <b>must</b> be a valid ##VkImageSubresourceLayers structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkExtent3D, ##VkImageSubresourceLayers, ##VkOffset3D, #CmdCopyBufferToImage(), #CmdCopyImageToBuffer()
        """

    VkDeviceSize.member("bufferOffset", "the offset in bytes from the start of the buffer object where the image data is copied from or to.")
    uint32_t.member("bufferRowLength", "{@code bufferRowLength} and {@code bufferImageHeight} specify the data in buffer memory as a subregion of a larger two- or three-dimensional image, and control the addressing calculations of data in buffer memory. If either of these values is zero, that aspect of the buffer memory is considered to be tightly packed according to the {@code imageExtent}.")
    uint32_t.member("bufferImageHeight", "see {@code bufferRowLength}")
    VkImageSubresourceLayers.member("imageSubresource", "a ##VkImageSubresourceLayers used to specify the specific image subresources of the image used for the source or destination image data.")
    VkOffset3D.member("imageOffset", "selects the initial x, y, z offsets in texels of the sub-region of the source or destination image data.")
    VkExtent3D.member("imageExtent", "the size in texels of the image to copy in {@code width}, {@code height} and {@code depth}.")
}

val VkClearColorValue = union(VULKAN_PACKAGE, "VkClearColorValue") {
    documentation =
        """
        Structure specifying a clear color value.

        <h5>Description</h5>
        The four array elements of the clear color map to R, G, B, and A components of image formats, in order.

        If the image has more than one sample, the same value is written to all samples for any pixels being cleared.

        <h5>See Also</h5>
        ##VkClearValue, #CmdClearColorImage()
        """

    float.array("float32", "are the color clear values when the format of the image or attachment is one of the formats in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#features-formats-numericformat\">Interpretation of Numeric Format</a> table other than signed integer (etext:SINT) or unsigned integer (etext:UINT). Floating point values are automatically converted to the format of the image, with the clear value being treated as linear if the image is sRGB.", size = 4)
    int32_t.array("int32", "are the color clear values when the format of the image or attachment is signed integer (etext:SINT). Signed integer values are converted to the format of the image by casting to the smaller type (with negative 32-bit values mapping to negative values in the smaller type). If the integer clear value is not representable in the target type (e.g. would overflow in conversion to that type), the clear value is undefined.", size = 4)
    uint32_t.array("uint32", "are the color clear values when the format of the image or attachment is unsigned integer (etext:UINT). Unsigned integer values are converted to the format of the image by casting to the integer type with fewer bits.", size = 4)
}

val VkClearDepthStencilValue = struct(VULKAN_PACKAGE, "VkClearDepthStencilValue") {
    documentation =
        """
        Structure specifying a clear depth stencil value.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code depth} <b>must</b> be between {@code 0.0} and {@code 1.0}, inclusive</li>
        </ul>

        <h5>See Also</h5>
        ##VkClearValue, #CmdClearDepthStencilImage()
        """

    float.member("depth", "the clear value for the depth aspect of the depth/stencil attachment. It is a floating-point value which is automatically converted to the attachment&#8217;s format.")
    uint32_t.member("stencil", "the clear value for the stencil aspect of the depth/stencil attachment. It is a 32-bit integer value which is converted to the attachment&#8217;s format by taking the appropriate number of LSBs.")
}

val VkClearValue = union(VULKAN_PACKAGE, "VkClearValue") {
    documentation =
        """
        Structure specifying a clear value.

        <h5>Description</h5>
        This union is used where part of the API requires either color or depth/stencil clear values, depending on the attachment, and defines the initial clear values in the ##VkRenderPassBeginInfo structure.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code depthStencil} <b>must</b> be a valid ##VkClearDepthStencilValue structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkClearAttachment, ##VkClearColorValue, ##VkClearDepthStencilValue, ##VkRenderPassBeginInfo
        """

    VkClearColorValue.member("color", "specifies the color image clear values to use when clearing a color image or attachment.")
    VkClearDepthStencilValue.member("depthStencil", "specifies the depth and stencil clear values to use when clearing a depth/stencil image or attachment.")
}

val VkClearAttachment = struct(VULKAN_PACKAGE, "VkClearAttachment") {
    documentation =
        """
        Structure specifying a clear attachment.

        <h5>Description</h5>
        No memory barriers are needed between #CmdClearAttachments() and preceding or subsequent draw or attachment clear commands in the same subpass.

        The #CmdClearAttachments() command is not affected by the bound pipeline state.

        Attachments <b>can</b> also be cleared at the beginning of a render pass instance by setting {@code loadOp} (or {@code stencilLoadOp}) of ##VkAttachmentDescription to #ATTACHMENT_LOAD_OP_CLEAR, as described for #CreateRenderPass().

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code aspectMask} includes #IMAGE_ASPECT_COLOR_BIT, it <b>must</b> not include #IMAGE_ASPECT_DEPTH_BIT or #IMAGE_ASPECT_STENCIL_BIT</li>
            <li>{@code aspectMask} <b>must</b> not include #IMAGE_ASPECT_METADATA_BIT</li>
            <li>{@code clearValue} <b>must</b> be a valid ##VkClearValue union</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code aspectMask} <b>must</b> be a valid combination of {@code VkImageAspectFlagBits} values</li>
            <li>{@code aspectMask} <b>must</b> not be 0</li>
        </ul>

        <h5>See Also</h5>
        ##VkClearValue, #CmdClearAttachments()
        """

    VkImageAspectFlags.member("aspectMask", "a mask selecting the color, depth and/or stencil aspects of the attachment to be cleared. {@code aspectMask} <b>can</b> include #IMAGE_ASPECT_COLOR_BIT for color attachments, #IMAGE_ASPECT_DEPTH_BIT for depth/stencil attachments with a depth component, and #IMAGE_ASPECT_STENCIL_BIT for depth/stencil attachments with a stencil component. If the subpass&#8217;s depth/stencil attachment is #ATTACHMENT_UNUSED, then the clear has no effect.")
    uint32_t.member("colorAttachment", "only meaningful if #IMAGE_ASPECT_COLOR_BIT is set in {@code aspectMask}, in which case it is an index to the {@code pColorAttachments} array in the ##VkSubpassDescription structure of the current subpass which selects the color attachment to clear. If {@code colorAttachment} is #ATTACHMENT_UNUSED then the clear has no effect.")
    VkClearValue.member("clearValue", "the color or depth/stencil value to clear the attachment to, as described in <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#clears-values\">Clear Values</a> below.")
}

val VkClearRect = struct(VULKAN_PACKAGE, "VkClearRect") {
    documentation =
        """
        Structure specifying a clear rectangle.

        <h5>Description</h5>
        The layers <code>[baseArrayLayer, baseArrayLayer {plus} layerCount)</code> counting from the base layer of the attachment image view are cleared.

        <h5>See Also</h5>
        ##VkRect2D, #CmdClearAttachments()
        """

    VkRect2D.member("rect", "the two-dimensional region to be cleared.")
    uint32_t.member("baseArrayLayer", "the first layer to be cleared.")
    uint32_t.member("layerCount", "the number of layers to clear.")
}

val VkImageResolve = struct(VULKAN_PACKAGE, "VkImageResolve") {
    documentation =
        """
        Structure specifying an image resolve operation.

        <h5>Valid Usage</h5>
        <ul>
            <li>The {@code aspectMask} member of {@code srcSubresource} and {@code dstSubresource} <b>must</b> only contain #IMAGE_ASPECT_COLOR_BIT</li>
            <li>The {@code layerCount} member of {@code srcSubresource} and {@code dstSubresource} <b>must</b> match</li>
            <li>If either of the calling command&#8217;s {@code srcImage} or {@code dstImage} parameters are of {@code VkImageType} #IMAGE_TYPE_3D, the {@code baseArrayLayer} and {@code layerCount} members of both {@code srcSubresource} and {@code dstSubresource} <b>must</b> be 0 and 1, respectively</li>
            <li>{@code srcOffset.x} and <code>(extent.width srcOffset.x)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the source image subresource width</li>
            <li>{@code srcOffset.y} and <code>(extent.height srcOffset.y)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the source image subresource height</li>
            <li>If the calling command&#8217;s {@code srcImage} is of type #IMAGE_TYPE_1D, then {@code srcOffset.y} <b>must</b> be 0 and {@code extent.height} <b>must</b> be 1.</li>
            <li>{@code srcOffset.z} and <code>(extent.depth srcOffset.z)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the source image subresource depth</li>
            <li>If the calling command&#8217;s {@code srcImage} is of type #IMAGE_TYPE_1D or #IMAGE_TYPE_2D, then {@code srcOffset.z} <b>must</b> be 0 and {@code extent.depth} <b>must</b> be 1.</li>
            <li>{@code dstOffset.x} and <code>(extent.width dstOffset.x)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the destination image subresource width</li>
            <li>{@code dstOffset.y} and <code>(extent.height dstOffset.y)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the destination image subresource height</li>
            <li>If the calling command&#8217;s {@code dstImage} is of type #IMAGE_TYPE_1D, then {@code dstOffset.y} <b>must</b> be 0 and {@code extent.height} <b>must</b> be 1.</li>
            <li>{@code dstOffset.z} and <code>(extent.depth dstOffset.z)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the destination image subresource depth</li>
            <li>If the calling command&#8217;s {@code dstImage} is of type #IMAGE_TYPE_1D or #IMAGE_TYPE_2D, then {@code dstOffset.z} <b>must</b> be 0 and {@code extent.depth} <b>must</b> be 1.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code srcSubresource} <b>must</b> be a valid ##VkImageSubresourceLayers structure</li>
            <li>{@code dstSubresource} <b>must</b> be a valid ##VkImageSubresourceLayers structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkExtent3D, ##VkImageSubresourceLayers, ##VkOffset3D, #CmdResolveImage()
        """

    VkImageSubresourceLayers.member("srcSubresource", "{@code srcSubresource} and {@code dstSubresource} are ##VkImageSubresourceLayers structures specifying the image subresources of the images used for the source and destination image data, respectively. Resolve of depth/stencil images is not supported.")
    VkOffset3D.member("srcOffset", "{@code srcOffset} and {@code dstOffset} select the initial x, y, and z offsets in texels of the sub-regions of the source and destination image data.")
    VkImageSubresourceLayers.member("dstSubresource", "see {@code srcSubresource}")
    VkOffset3D.member("dstOffset", "see {@code srcOffset}")
    VkExtent3D.member("extent", "the size in texels of the source image to resolve in {@code width}, {@code height} and {@code depth}.")
}

val VkMemoryBarrier = struct(VULKAN_PACKAGE, "VkMemoryBarrier") {
    documentation =
        """
        Structure specifying a global memory barrier.

        <h5>Description</h5>
        The first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-dependencies-access-scopes">access scope</a> is limited to access types in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-access-masks">source access mask</a> specified by {@code srcAccessMask}.

        The second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-dependencies-access-scopes">access scope</a> is limited to access types in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-access-masks">destination access mask</a> specified by {@code dstAccessMask}.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_MEMORY_BARRIER</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code srcAccessMask} <b>must</b> be a valid combination of {@code VkAccessFlagBits} values</li>
            <li>{@code dstAccessMask} <b>must</b> be a valid combination of {@code VkAccessFlagBits} values</li>
        </ul>

        <h5>See Also</h5>
        #CmdPipelineBarrier(), #CmdWaitEvents()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkAccessFlags.member("srcAccessMask", "a bitmask of {@code VkAccessFlagBits} specifying a <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#synchronization-access-masks\">source access mask</a>.")
    VkAccessFlags.member("dstAccessMask", "a bitmask of {@code VkAccessFlagBits} specifying a <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#synchronization-access-masks\">destination access mask</a>.")
}

val VkBufferMemoryBarrier = struct(VULKAN_PACKAGE, "VkBufferMemoryBarrier") {
    documentation =
        """
        Structure specifying a buffer memory barrier.

        <h5>Description</h5>
        The first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-dependencies-access-scopes">access scope</a> is limited to access to memory through the specified buffer range, via access types in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-access-masks">source access mask</a> specified by {@code srcAccessMask}. If {@code srcAccessMask} includes #ACCESS_HOST_WRITE_BIT, memory writes performed by that access type are also made visible, as that access type is not performed through a resource.

        The second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-dependencies-access-scopes">access scope</a> is limited to access to memory through the specified buffer range, via access types in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-access-masks">destination access mask</a>. specified by {@code dstAccessMask}. If {@code dstAccessMask} includes #ACCESS_HOST_WRITE_BIT or #ACCESS_HOST_READ_BIT, available memory writes are also made visible to accesses of those types, as those access types are not performed through a resource.

        If {@code srcQueueFamilyIndex} is not equal to {@code dstQueueFamilyIndex}, and {@code srcQueueFamilyIndex} is equal to the current queue family, then the memory barrier defines a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-queue-transfers-release">queue family release operation</a> for the specified buffer range, and the second access scope includes no access, as if {@code dstAccessMask} was 0.

        If {@code dstQueueFamilyIndex} is not equal to {@code srcQueueFamilyIndex}, and {@code dstQueueFamilyIndex} is equal to the current queue family, then the memory barrier defines a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-queue-transfers-acquire">queue family acquire operation</a> for the specified buffer range, and the first access scope includes no access, as if {@code srcAccessMask} was 0.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code offset} <b>must</b> be less than the size of {@code buffer}</li>
            <li>If {@code size} is not equal to #WHOLE_SIZE, {@code size} <b>must</b> be greater than 0</li>
            <li>If {@code size} is not equal to #WHOLE_SIZE, {@code size} <b>must</b> be less than or equal to than the size of {@code buffer} minus {@code offset}</li>
            <li>If {@code buffer} was created with a sharing mode of #SHARING_MODE_CONCURRENT, at least one of {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} <b>must</b> be #QUEUE_FAMILY_IGNORED</li>
            <li>If {@code buffer} was created with a sharing mode of #SHARING_MODE_CONCURRENT, and one of {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} is #QUEUE_FAMILY_IGNORED, the other <b>must</b> be #QUEUE_FAMILY_IGNORED or #QUEUE_FAMILY_EXTERNAL_KHX</li>
            <li>If {@code buffer} was created with a sharing mode of #SHARING_MODE_EXCLUSIVE and {@code srcQueueFamilyIndex} is #QUEUE_FAMILY_IGNORED, {@code dstQueueFamilyIndex} <b>must</b> also be #QUEUE_FAMILY_IGNORED</li>
            <li>If {@code buffer} was created with a sharing mode of #SHARING_MODE_EXCLUSIVE and {@code srcQueueFamilyIndex} is not #QUEUE_FAMILY_IGNORED, it <b>must</b> be a valid queue family or #QUEUE_FAMILY_EXTERNAL_KHX (see <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#devsandqueues-queueprops">the “Queue Family Properties” section</a>)</li>
            <li>If {@code buffer} was created with a sharing mode of #SHARING_MODE_EXCLUSIVE and {@code dstQueueFamilyIndex} is not #QUEUE_FAMILY_IGNORED, it <b>must</b> be a valid queue family or #QUEUE_FAMILY_EXTERNAL_KHX (see <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#devsandqueues-queueprops">the “Queue Family Properties” section</a>)</li>
            <li>If {@code buffer} was created with a sharing mode of #SHARING_MODE_EXCLUSIVE, and {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} are not #QUEUE_FAMILY_IGNORED, at least one of them <b>must</b> be the same as the family of the queue that will execute this barrier</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code srcAccessMask} <b>must</b> be a valid combination of {@code VkAccessFlagBits} values</li>
            <li>{@code dstAccessMask} <b>must</b> be a valid combination of {@code VkAccessFlagBits} values</li>
            <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
        </ul>

        <h5>See Also</h5>
        #CmdPipelineBarrier(), #CmdWaitEvents()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkAccessFlags.member("srcAccessMask", "a bitmask of {@code VkAccessFlagBits} specifying a <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#synchronization-access-masks\">source access mask</a>.")
    VkAccessFlags.member("dstAccessMask", "a bitmask of {@code VkAccessFlagBits} specifying a <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#synchronization-access-masks\">destination access mask</a>.")
    uint32_t.member("srcQueueFamilyIndex", "the source queue family for a <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#synchronization-queue-transfers\">queue family ownership transfer</a>.")
    uint32_t.member("dstQueueFamilyIndex", "the destination queue family for a <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#synchronization-queue-transfers\">queue family ownership transfer</a>.")
    VkBuffer.member("buffer", "a handle to the buffer whose backing memory is affected by the barrier.")
    VkDeviceSize.member("offset", "an offset in bytes into the backing memory for {@code buffer}; this is relative to the base offset as bound to the buffer (see #BindBufferMemory()).")
    VkDeviceSize.member("size", "a size in bytes of the affected area of backing memory for {@code buffer}, or #WHOLE_SIZE to use the range from {@code offset} to the end of the buffer.")
}

val VkImageMemoryBarrier = struct(VULKAN_PACKAGE, "VkImageMemoryBarrier") {
    documentation =
        """
        Structure specifying the parameters of an image memory barrier.

        <h5>Description</h5>
        The first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-dependencies-access-scopes">access scope</a> is limited to access to memory through the specified image subresource range, via access types in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-access-masks">source access mask</a> specified by {@code srcAccessMask}. If {@code srcAccessMask} includes #ACCESS_HOST_WRITE_BIT, memory writes performed by that access type are also made visible, as that access type is not performed through a resource.

        The second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-dependencies-access-scopes">access scope</a> is limited to access to memory through the specified image subresource range, via access types in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-access-masks">destination access mask</a> specified by {@code dstAccessMask}. If {@code dstAccessMask} includes #ACCESS_HOST_WRITE_BIT or #ACCESS_HOST_READ_BIT, available memory writes are also made visible to accesses of those types, as those access types are not performed through a resource.

        If {@code srcQueueFamilyIndex} is not equal to {@code dstQueueFamilyIndex}, and {@code srcQueueFamilyIndex} is equal to the current queue family, then the memory barrier defines a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-queue-transfers-release">queue family release operation</a> for the specified image subresource range, and the second access scope includes no access, as if {@code dstAccessMask} was 0.

        If {@code dstQueueFamilyIndex} is not equal to {@code srcQueueFamilyIndex}, and {@code dstQueueFamilyIndex} is equal to the current queue family, then the memory barrier defines a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-queue-transfers-acquire">queue family acquire operation</a> for the specified image subresource range, and the first access scope includes no access, as if {@code srcAccessMask} was 0.

        If {@code oldLayout} is not equal to {@code newLayout}, then the memory barrier defines an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-image-layout-transitions">image layout transition</a> for the specified image subresource range.

        Layout transitions that are performed via image memory barriers execute in their entirety in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-submission-order">submission order</a>, relative to other image layout transitions submitted to the same queue, including those performed by <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#renderpass">render passes</a>. In effect there is an implicit execution dependency from each such layout transition to all layout transitions previously submitted to the same queue.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code oldLayout} <b>must</b> be #IMAGE_LAYOUT_UNDEFINED or the current layout of the image subresources affected by the barrier</li>
            <li>{@code newLayout} <b>must</b> not be #IMAGE_LAYOUT_UNDEFINED or #IMAGE_LAYOUT_PREINITIALIZED</li>
            <li>If {@code image} was created with a sharing mode of #SHARING_MODE_CONCURRENT, at least one of {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} <b>must</b> be #QUEUE_FAMILY_IGNORED</li>
            <li>If {@code image} was created with a sharing mode of #SHARING_MODE_CONCURRENT, and one of {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} is #QUEUE_FAMILY_IGNORED, the other <b>must</b> be #QUEUE_FAMILY_IGNORED or #QUEUE_FAMILY_EXTERNAL_KHX</li>
            <li>If {@code image} was created with a sharing mode of #SHARING_MODE_EXCLUSIVE and {@code srcQueueFamilyIndex} is #QUEUE_FAMILY_IGNORED, {@code dstQueueFamilyIndex} <b>must</b> also be #QUEUE_FAMILY_IGNORED.</li>
            <li>If {@code image} was created with a sharing mode of #SHARING_MODE_EXCLUSIVE and {@code srcQueueFamilyIndex} is not #QUEUE_FAMILY_IGNORED, it <b>must</b> be a valid queue family or #QUEUE_FAMILY_EXTERNAL_KHX (see <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#devsandqueues-queueprops">the “Queue Family Properties” section</a>).</li>
            <li>If {@code image} was created with a sharing mode of #SHARING_MODE_EXCLUSIVE and {@code dstQueueFamilyIndex} is not #QUEUE_FAMILY_IGNORED, it <b>must</b> be a valid queue family or #QUEUE_FAMILY_EXTERNAL_KHX (see <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#devsandqueues-queueprops">the “Queue Family Properties” section</a>).</li>
            <li>If {@code image} was created with a sharing mode of #SHARING_MODE_EXCLUSIVE, and {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} are not #QUEUE_FAMILY_IGNORED, at least one of them <b>must</b> be the same as the family of the queue that will execute this barrier</li>
            <li>{@code subresourceRange} <b>must</b> be a valid image subresource range for the image (see <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#resources-image-views">the “Image Views” section</a>)</li>
            <li>If {@code image} has a depth/stencil format with both depth and stencil components, then {@code aspectMask} member of {@code subresourceRange} <b>must</b> include both #IMAGE_ASPECT_DEPTH_BIT and #IMAGE_ASPECT_STENCIL_BIT</li>
            <li>If either {@code oldLayout} or {@code newLayout} is #IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL then {@code image} <b>must</b> have been created with #IMAGE_USAGE_COLOR_ATTACHMENT_BIT set</li>
            <li>If either {@code oldLayout} or {@code newLayout} is #IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL then {@code image} <b>must</b> have been created with #IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT set</li>
            <li>If either {@code oldLayout} or {@code newLayout} is #IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL then {@code image} <b>must</b> have been created with #IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT set</li>
            <li>If either {@code oldLayout} or {@code newLayout} is #IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL then {@code image} <b>must</b> have been created with #IMAGE_USAGE_SAMPLED_BIT or #IMAGE_USAGE_INPUT_ATTACHMENT_BIT set</li>
            <li>If either {@code oldLayout} or {@code newLayout} is #IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL then {@code image} <b>must</b> have been created with #IMAGE_USAGE_TRANSFER_SRC_BIT set</li>
            <li>If either {@code oldLayout} or {@code newLayout} is #IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL then {@code image} <b>must</b> have been created with #IMAGE_USAGE_TRANSFER_DST_BIT set</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER</li>
            <li>{@code pNext} <b>must</b> be {@code NULL}</li>
            <li>{@code srcAccessMask} <b>must</b> be a valid combination of {@code VkAccessFlagBits} values</li>
            <li>{@code dstAccessMask} <b>must</b> be a valid combination of {@code VkAccessFlagBits} values</li>
            <li>{@code oldLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
            <li>{@code newLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
            <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
            <li>{@code subresourceRange} <b>must</b> be a valid ##VkImageSubresourceRange structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkImageSubresourceRange, #CmdPipelineBarrier(), #CmdWaitEvents()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkAccessFlags.member("srcAccessMask", "a bitmask of {@code VkAccessFlagBits} specifying a <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#synchronization-access-masks\">source access mask</a>.")
    VkAccessFlags.member("dstAccessMask", "a bitmask of {@code VkAccessFlagBits} specifying a <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#synchronization-access-masks\">destination access mask</a>.")
    VkImageLayout.member("oldLayout", "the old layout in an <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#synchronization-image-layout-transitions\">image layout transition</a>.")
    VkImageLayout.member("newLayout", "the new layout in an <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#synchronization-image-layout-transitions\">image layout transition</a>.")
    uint32_t.member("srcQueueFamilyIndex", "the source queue family for a <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#synchronization-queue-transfers\">queue family ownership transfer</a>.")
    uint32_t.member("dstQueueFamilyIndex", "the destination queue family for a <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#synchronization-queue-transfers\">queue family ownership transfer</a>.")
    VkImage.member("image", "a handle to the image affected by this barrier.")
    VkImageSubresourceRange.member("subresourceRange", "describes the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#resources-image-views\">image subresource range</a> within {@code image} that is affected by this barrier.")
}

val VkRenderPassBeginInfo = struct(VULKAN_PACKAGE, "VkRenderPassBeginInfo") {
    documentation =
        """
        Structure specifying render pass begin info.

        <h5>Description</h5>
        {@code renderArea} is the render area that is affected by the render pass instance. The effects of attachment load, store and multisample resolve operations are restricted to the pixels whose x and y coordinates fall within the render area on all attachments. The render area extends to all layers of {@code framebuffer}. The application <b>must</b> ensure (using scissor if necessary) that all rendering is contained within the render area, otherwise the pixels outside of the render area become undefined and shader side effects <b>may</b> occur for fragments outside the render area. The render area <b>must</b> be contained within the framebuffer dimensions.

        When multiview is enabled, the resolve operation at the end of a subpass applies to all views in the view mask.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        There <b>may</b> be a performance cost for using a render area smaller than the framebuffer, unless it matches the render area granularity for the render pass.
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code clearValueCount} <b>must</b> be greater than the largest attachment index in {@code renderPass} that specifies a {@code loadOp} (or {@code stencilLoadOp}, if the attachment has a depth/stencil format) of #ATTACHMENT_LOAD_OP_CLEAR</li>
            <li>If {@code clearValueCount} is not 0, {@code pClearValues} <b>must</b> be a pointer to an array of {@code clearValueCount} valid ##VkClearValue unions</li>
            <li>{@code renderPass} <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#renderpass-compatibility">compatible</a> with the {@code renderPass} member of the ##VkFramebufferCreateInfo structure specified when creating {@code framebuffer}.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code sType} <b>must</b> be #STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO</li>
            <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of ##VkDeviceGroupRenderPassBeginInfoKHX</li>
            <li>{@code renderPass} <b>must</b> be a valid {@code VkRenderPass} handle</li>
            <li>{@code framebuffer} <b>must</b> be a valid {@code VkFramebuffer} handle</li>
            <li>Both of {@code framebuffer}, and {@code renderPass} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>See Also</h5>
        ##VkClearValue, ##VkRect2D, #CmdBeginRenderPass()
        """

    VkStructureType.member("sType", "the type of this structure.")
    nullable..const..opaque_p.member("pNext", "{@code NULL} or a pointer to an extension-specific structure.")
    VkRenderPass.member("renderPass", "the render pass to begin an instance of.")
    VkFramebuffer.member("framebuffer", "the framebuffer containing the attachments that are used with the render pass.")
    VkRect2D.member("renderArea", "the render area that is affected by the render pass instance, and is described in more detail below.")
    AutoSize("pClearValues", optional = true)..uint32_t.member("clearValueCount", "the number of elements in {@code pClearValues}.")
    const..VkClearValue.p.buffer("pClearValues", "an array of ##VkClearValue structures that contains clear values for each attachment, if the attachment uses a {@code loadOp} value of #ATTACHMENT_LOAD_OP_CLEAR or if the attachment has a depth/stencil format and uses a {@code stencilLoadOp} value of #ATTACHMENT_LOAD_OP_CLEAR. The array is indexed by attachment number. Only elements corresponding to cleared attachments are used. Other elements of {@code pClearValues} are ignored.")
}

val VkDispatchIndirectCommand = struct(VULKAN_PACKAGE, "VkDispatchIndirectCommand") {
    documentation =
        """
        Structure specifying a dispatch indirect command.

        <h5>Description</h5>
        The members of ##VkDispatchIndirectCommand have the same meaning as the corresponding parameters of #CmdDispatch().

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code x} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxComputeWorkGroupCount}[0]</li>
            <li>{@code y} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxComputeWorkGroupCount}[1]</li>
            <li>{@code z} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxComputeWorkGroupCount}[2]</li>
        </ul>

        <h5>See Also</h5>
        #CmdDispatchIndirect()
        """

    uint32_t.member("x", "the number of local workgroups to dispatch in the X dimension.")
    uint32_t.member("y", "the number of local workgroups to dispatch in the Y dimension.")
    uint32_t.member("z", "the number of local workgroups to dispatch in the Z dimension.")
}

val VkDrawIndexedIndirectCommand = struct(VULKAN_PACKAGE, "VkDrawIndexedIndirectCommand") {
    documentation =
        """
        Structure specifying a draw indexed indirect command.

        <h5>Description</h5>
        The members of ##VkDrawIndexedIndirectCommand have the same meaning as the similarly named parameters of #CmdDrawIndexed().

        <h5>Valid Usage</h5>
        <ul>
            <li>For a given vertex buffer binding, any attribute data fetched <b>must</b> be entirely contained within the corresponding vertex buffer binding, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#fxvertex-input">the “Vertex Input Description” section</a></li>
            <li><code>(indexSize * (firstIndex + indexCount) + offset)</code> <b>must</b> be less than or equal to the size of the currently bound index buffer, with {@code indexSize} being based on the type specified by {@code indexType}, where the index buffer, {@code indexType}, and {@code offset} are specified via #CmdBindIndexBuffer()</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-drawIndirectFirstInstance">drawIndirectFirstInstance</a> feature is not enabled, {@code firstInstance} <b>must</b> be 0</li>
        </ul>

        <h5>See Also</h5>
        #CmdDrawIndexedIndirect()
        """

    uint32_t.member("indexCount", "the number of vertices to draw.")
    uint32_t.member("instanceCount", "the number of instances to draw.")
    uint32_t.member("firstIndex", "the base index within the index buffer.")
    int32_t.member("vertexOffset", "the value added to the vertex index before indexing into the vertex buffer.")
    uint32_t.member("firstInstance", "the instance ID of the first instance to draw.")
}

val VkDrawIndirectCommand = struct(VULKAN_PACKAGE, "VkDrawIndirectCommand") {
    documentation =
        """
        Structure specifying a draw indirect command.

        <h5>Description</h5>
        The members of ##VkDrawIndirectCommand have the same meaning as the similarly named parameters of #CmdDraw().

        <h5>Valid Usage</h5>
        <ul>
            <li>For a given vertex buffer binding, any attribute data fetched <b>must</b> be entirely contained within the corresponding vertex buffer binding, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#fxvertex-input">the “Vertex Input Description” section</a></li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-drawIndirectFirstInstance">drawIndirectFirstInstance</a> feature is not enabled, {@code firstInstance} <b>must</b> be 0</li>
        </ul>

        <h5>See Also</h5>
        #CmdDrawIndirect()
        """

    uint32_t.member("vertexCount", "the number of vertices to draw.")
    uint32_t.member("instanceCount", "the number of instances to draw.")
    uint32_t.member("firstVertex", "the index of the first vertex to draw.")
    uint32_t.member("firstInstance", "the instance ID of the first instance to draw.")
}