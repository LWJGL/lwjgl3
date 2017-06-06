/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val VK10 = "VK10".nativeClass(VULKAN_PACKAGE, "VK10", prefix = "VK", binding = VK_BINDING_INSTANCE) {
    documentation =
        """
        The core Vulkan 1.0 functionality.
        """

    IntConstant(
        "API Constants",

        "MAX_PHYSICAL_DEVICE_NAME_SIZE".."256",
        "UUID_SIZE".."16",
        "MAX_EXTENSION_NAME_SIZE".."256",
        "MAX_DESCRIPTION_SIZE".."256",
        "MAX_MEMORY_TYPES".."32",
        "MAX_MEMORY_HEAPS".."16",
        "REMAINING_MIP_LEVELS".."(~0)",
        "REMAINING_ARRAY_LAYERS".."(~0)",
        "ATTACHMENT_UNUSED".."(~0)",
        "TRUE".."1",
        "FALSE".."0",
        "QUEUE_FAMILY_IGNORED".."(~0)",
        "SUBPASS_EXTERNAL".."(~0)"
    )

    FloatConstant(
        "API Constants",

        "LOD_CLAMP_NONE".."1000.0f"
    )

    LongConstant(
        "API Constants",

        "WHOLE_SIZE".."(~0L)"
    )

    EnumConstant(
        """
        VkPipelineCacheHeaderVersion - Encode pipeline cache version

        <h5>Description</h5>
        A consumer of the pipeline cache <b>should</b> use the cache version to interpret the remainder of the cache header.

        <h5>See Also</h5>
        #CreatePipelineCache(), #GetPipelineCacheData()
        """,

        "PIPELINE_CACHE_HEADER_VERSION_ONE".."1"
    )

    EnumConstant(
        """
        VkResult - Vulkan command return codes

        <h5>Description</h5>
        <ul>
            <li>#SUCCESS Command successfully completed</li>
            <li>#NOT_READY A fence or query has not yet completed</li>
            <li>#TIMEOUT A wait operation has not completed in the specified time</li>
            <li>#EVENT_SET An event is signaled</li>
            <li>#EVENT_RESET An event is unsignaled</li>
            <li>#INCOMPLETE A return array was too small for the result</li>
            <li>#SUBOPTIMAL_KHR A swapchain no longer matches the surface properties exactly, but <b>can</b> still be used to present to the surface successfully.</li>
        </ul>

        <ul>
            <li>#ERROR_OUT_OF_HOST_MEMORY A host memory allocation has failed.</li>
            <li>#ERROR_OUT_OF_DEVICE_MEMORY A device memory allocation has failed.</li>
            <li>#ERROR_INITIALIZATION_FAILED Initialization of an object could not be completed for implementation-specific reasons.</li>
            <li>#ERROR_DEVICE_LOST The logical or physical device has been lost. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#devsandqueues-lost-device">Lost Device</a></li>
            <li>#ERROR_MEMORY_MAP_FAILED Mapping of a memory object has failed.</li>
            <li>#ERROR_LAYER_NOT_PRESENT A requested layer is not present or could not be loaded.</li>
            <li>#ERROR_EXTENSION_NOT_PRESENT A requested extension is not supported.</li>
            <li>#ERROR_FEATURE_NOT_PRESENT A requested feature is not supported.</li>
            <li>#ERROR_INCOMPATIBLE_DRIVER The requested version of Vulkan is not supported by the driver or is otherwise incompatible for implementation-specific reasons.</li>
            <li>#ERROR_TOO_MANY_OBJECTS Too many objects of the type have already been created.</li>
            <li>#ERROR_FORMAT_NOT_SUPPORTED A requested format is not supported on this device.</li>
            <li>#ERROR_FRAGMENTED_POOL A pool allocation has failed due to fragmentation of the pool&#8217;s memory. This <b>must</b> only be returned if no attempt to allocate host or device memory was made to accomodate the new allocation. This <b>should</b> be returned in preference to #ERROR_OUT_OF_POOL_MEMORY_KHR, but only if the implementation is certain that the pool allocation failure was due to fragmentation.</li>
            <li>#ERROR_SURFACE_LOST_KHR A surface is no longer available.</li>
            <li>#ERROR_NATIVE_WINDOW_IN_USE_KHR The requested window is already in use by Vulkan or another API in a manner which prevents it from being used again.</li>
            <li>#ERROR_OUT_OF_DATE_KHR A surface has changed in such a way that it is no longer compatible with the swapchain, and further presentation requests using the swapchain will fail. Applications <b>must</b> query the new surface properties and recreate their swapchain if they wish to continue presenting to the surface.</li>
            <li>#ERROR_INCOMPATIBLE_DISPLAY_KHR The display used by a swapchain does not use the same presentable image layout, or is incompatible in a way that prevents sharing an image.</li>
            <li>#ERROR_INVALID_SHADER_NV One or more shaders failed to compile or link. More details are reported back to the application via VK_EXT_debug_report if enabled.</li>
            <li>#ERROR_OUT_OF_POOL_MEMORY_KHR A pool memory allocation has failed. This <b>must</b> only be returned if no attempt to allocate host or device memory was made to accomodate the new allocation. If the failure was definitely due to fragmentation of the pool, #ERROR_FRAGMENTED_POOL <b>should</b> be returned instead.</li>
            <li>#ERROR_INVALID_EXTERNAL_HANDLE_KHX An external handle is not a valid handle of the specified type.</li>
        </ul>

        If a command returns a run time error, it will leave any result pointers unmodified, unless other behavior is explicitly defined in the specification.

        Out of memory errors do not damage any currently existing Vulkan objects. Objects that have already been successfully created <b>can</b> still be used by the application.

        Performance-critical commands generally do not have return codes. If a run time error occurs in such commands, the implementation will defer reporting the error until a specified point. For commands that record into command buffers (ftext:vkCmd*) run time errors are reported by #EndCommandBuffer().

        <h5>See Also</h5>
        No cross-references are available, ##VkPresentInfoKHR
        """,

        "SUCCESS".."0",
        "NOT_READY".."1",
        "TIMEOUT".."2",
        "EVENT_SET".."3",
        "EVENT_RESET".."4",
        "INCOMPLETE".."5",
        "ERROR_OUT_OF_HOST_MEMORY".."-1",
        "ERROR_OUT_OF_DEVICE_MEMORY".."-2",
        "ERROR_INITIALIZATION_FAILED".."-3",
        "ERROR_DEVICE_LOST".."-4",
        "ERROR_MEMORY_MAP_FAILED".."-5",
        "ERROR_LAYER_NOT_PRESENT".."-6",
        "ERROR_EXTENSION_NOT_PRESENT".."-7",
        "ERROR_FEATURE_NOT_PRESENT".."-8",
        "ERROR_INCOMPATIBLE_DRIVER".."-9",
        "ERROR_TOO_MANY_OBJECTS".."-10",
        "ERROR_FORMAT_NOT_SUPPORTED".."-11",
        "ERROR_FRAGMENTED_POOL".."-12"
    )

    EnumConstant(
        """
        VkStructureType - Vulkan structure types ({@code stype})

        <h5>See Also</h5>
        ##VkAcquireNextImageInfoKHX, ##VkAndroidSurfaceCreateInfoKHR, ##VkApplicationInfo, ##VkBindBufferMemoryInfoKHX, ##VkBindImageMemoryInfoKHX, ##VkBindImageMemorySwapchainInfoKHX, ##VkBindSparseInfo, ##VkBufferCreateInfo, ##VkBufferMemoryBarrier, ##VkBufferViewCreateInfo, ##VkCmdProcessCommandsInfoNVX, ##VkCmdReserveSpaceForCommandsInfoNVX, ##VkCommandBufferAllocateInfo, ##VkCommandBufferBeginInfo, ##VkCommandBufferInheritanceInfo, ##VkCommandPoolCreateInfo, ##VkComputePipelineCreateInfo, ##VkCopyDescriptorSet, ##VkD3D12FenceSubmitInfoKHX, ##VkDebugMarkerMarkerInfoEXT, ##VkDebugMarkerObjectNameInfoEXT, ##VkDebugMarkerObjectTagInfoEXT, ##VkDebugReportCallbackCreateInfoEXT, ##VkDedicatedAllocationBufferCreateInfoNV, ##VkDedicatedAllocationImageCreateInfoNV, ##VkDedicatedAllocationMemoryAllocateInfoNV, ##VkDescriptorPoolCreateInfo, ##VkDescriptorSetAllocateInfo, ##VkDescriptorSetLayoutCreateInfo, ##VkDescriptorUpdateTemplateCreateInfoKHR, ##VkDeviceCreateInfo, ##VkDeviceEventInfoEXT, ##VkDeviceGeneratedCommandsFeaturesNVX, ##VkDeviceGeneratedCommandsLimitsNVX, ##VkDeviceGroupBindSparseInfoKHX, ##VkDeviceGroupCommandBufferBeginInfoKHX, ##VkDeviceGroupDeviceCreateInfoKHX, ##VkDeviceGroupPresentCapabilitiesKHX, ##VkDeviceGroupPresentInfoKHX, ##VkDeviceGroupRenderPassBeginInfoKHX, ##VkDeviceGroupSubmitInfoKHX, ##VkDeviceGroupSwapchainCreateInfoKHX, ##VkDeviceQueueCreateInfo, ##VkDisplayEventInfoEXT, ##VkDisplayModeCreateInfoKHR, ##VkDisplayPowerInfoEXT, ##VkDisplayPresentInfoKHR, ##VkDisplaySurfaceCreateInfoKHR, ##VkEventCreateInfo, ##VkExportMemoryAllocateInfoKHX, ##VkExportMemoryAllocateInfoNV, ##VkExportMemoryWin32HandleInfoKHX, ##VkExportMemoryWin32HandleInfoNV, ##VkExportSemaphoreCreateInfoKHX, ##VkExportSemaphoreWin32HandleInfoKHX, ##VkExternalBufferPropertiesKHX, ##VkExternalImageFormatPropertiesKHX, ##VkExternalMemoryBufferCreateInfoKHX, ##VkExternalMemoryImageCreateInfoKHX, ##VkExternalMemoryImageCreateInfoNV, ##VkExternalSemaphorePropertiesKHX, ##VkFenceCreateInfo, ##VkFormatProperties2KHR, ##VkFramebufferCreateInfo, ##VkGraphicsPipelineCreateInfo, ##VkHdrMetadataEXT, ##VkIOSSurfaceCreateInfoMVK, ##VkImageCreateInfo, ##VkImageFormatProperties2KHR, ##VkImageMemoryBarrier, ##VkImageSwapchainCreateInfoKHX, ##VkImageViewCreateInfo, ##VkImportMemoryFdInfoKHX, ##VkImportMemoryWin32HandleInfoKHX, ##VkImportMemoryWin32HandleInfoNV, ##VkImportSemaphoreFdInfoKHX, ##VkImportSemaphoreWin32HandleInfoKHX, ##VkIndirectCommandsLayoutCreateInfoNVX, ##VkInstanceCreateInfo, ##VkMacOSSurfaceCreateInfoMVK, ##VkMappedMemoryRange, ##VkMemoryAllocateFlagsInfoKHX, ##VkMemoryAllocateInfo, ##VkMemoryBarrier, ##VkMemoryFdPropertiesKHX, ##VkMemoryWin32HandlePropertiesKHX, ##VkMirSurfaceCreateInfoKHR, ##VkObjectTableCreateInfoNVX, ##VkPhysicalDeviceDiscardRectanglePropertiesEXT, ##VkPhysicalDeviceExternalBufferInfoKHX, ##VkPhysicalDeviceExternalImageFormatInfoKHX, ##VkPhysicalDeviceExternalSemaphoreInfoKHX, ##VkPhysicalDeviceFeatures2KHR, ##VkPhysicalDeviceGroupPropertiesKHX, ##VkPhysicalDeviceIDPropertiesKHX, ##VkPhysicalDeviceImageFormatInfo2KHR, ##VkPhysicalDeviceMemoryProperties2KHR, ##VkPhysicalDeviceMultiviewFeaturesKHX, ##VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX, ##VkPhysicalDeviceMultiviewPropertiesKHX, ##VkPhysicalDeviceProperties2KHR, ##VkPhysicalDevicePushDescriptorPropertiesKHR, ##VkPhysicalDeviceSparseImageFormatInfo2KHR, ##VkPhysicalDeviceSurfaceInfo2KHR, ##VkPipelineCacheCreateInfo, ##VkPipelineColorBlendStateCreateInfo, ##VkPipelineDepthStencilStateCreateInfo, ##VkPipelineDiscardRectangleStateCreateInfoEXT, ##VkPipelineDynamicStateCreateInfo, ##VkPipelineInputAssemblyStateCreateInfo, ##VkPipelineLayoutCreateInfo, ##VkPipelineMultisampleStateCreateInfo, ##VkPipelineRasterizationStateCreateInfo, ##VkPipelineRasterizationStateRasterizationOrderAMD, ##VkPipelineShaderStageCreateInfo, ##VkPipelineTessellationStateCreateInfo, ##VkPipelineVertexInputStateCreateInfo, ##VkPipelineViewportStateCreateInfo, ##VkPipelineViewportSwizzleStateCreateInfoNV, ##VkPipelineViewportWScalingStateCreateInfoNV, ##VkPresentInfoKHR, ##VkPresentRegionsKHR, ##VkPresentTimesInfoGOOGLE, ##VkQueryPoolCreateInfo, ##VkQueueFamilyProperties2KHR, ##VkRenderPassBeginInfo, ##VkRenderPassCreateInfo, ##VkRenderPassMultiviewCreateInfoKHX, ##VkSamplerCreateInfo, ##VkSemaphoreCreateInfo, ##VkShaderModuleCreateInfo, ##VkSharedPresentSurfaceCapabilitiesKHR, ##VkSparseImageFormatProperties2KHR, ##VkSubmitInfo, ##VkSurfaceCapabilities2EXT, ##VkSurfaceCapabilities2KHR, ##VkSurfaceFormat2KHR, ##VkSwapchainCounterCreateInfoEXT, ##VkSwapchainCreateInfoKHR, ##VkTextureLODGatherFormatPropertiesAMD, ##VkValidationFlagsEXT, ##VkViSurfaceCreateInfoNN, ##VkWaylandSurfaceCreateInfoKHR, ##VkWin32KeyedMutexAcquireReleaseInfoKHX, ##VkWin32KeyedMutexAcquireReleaseInfoNV, ##VkWin32SurfaceCreateInfoKHR, ##VkWriteDescriptorSet, ##VkXcbSurfaceCreateInfoKHR, ##VkXlibSurfaceCreateInfoKHR
        """,

        "STRUCTURE_TYPE_APPLICATION_INFO".."0",
        "STRUCTURE_TYPE_INSTANCE_CREATE_INFO".."1",
        "STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO".."2",
        "STRUCTURE_TYPE_DEVICE_CREATE_INFO".."3",
        "STRUCTURE_TYPE_SUBMIT_INFO".."4",
        "STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO".."5",
        "STRUCTURE_TYPE_MAPPED_MEMORY_RANGE".."6",
        "STRUCTURE_TYPE_BIND_SPARSE_INFO".."7",
        "STRUCTURE_TYPE_FENCE_CREATE_INFO".."8",
        "STRUCTURE_TYPE_SEMAPHORE_CREATE_INFO".."9",
        "STRUCTURE_TYPE_EVENT_CREATE_INFO".."10",
        "STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO".."11",
        "STRUCTURE_TYPE_BUFFER_CREATE_INFO".."12",
        "STRUCTURE_TYPE_BUFFER_VIEW_CREATE_INFO".."13",
        "STRUCTURE_TYPE_IMAGE_CREATE_INFO".."14",
        "STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO".."15",
        "STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO".."16",
        "STRUCTURE_TYPE_PIPELINE_CACHE_CREATE_INFO".."17",
        "STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO".."18",
        "STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO".."19",
        "STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO".."20",
        "STRUCTURE_TYPE_PIPELINE_TESSELLATION_STATE_CREATE_INFO".."21",
        "STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO".."22",
        "STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO".."23",
        "STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO".."24",
        "STRUCTURE_TYPE_PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO".."25",
        "STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO".."26",
        "STRUCTURE_TYPE_PIPELINE_DYNAMIC_STATE_CREATE_INFO".."27",
        "STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO".."28",
        "STRUCTURE_TYPE_COMPUTE_PIPELINE_CREATE_INFO".."29",
        "STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO".."30",
        "STRUCTURE_TYPE_SAMPLER_CREATE_INFO".."31",
        "STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO".."32",
        "STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO".."33",
        "STRUCTURE_TYPE_DESCRIPTOR_SET_ALLOCATE_INFO".."34",
        "STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET".."35",
        "STRUCTURE_TYPE_COPY_DESCRIPTOR_SET".."36",
        "STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO".."37",
        "STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO".."38",
        "STRUCTURE_TYPE_COMMAND_POOL_CREATE_INFO".."39",
        "STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO".."40",
        "STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO".."41",
        "STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO".."42",
        "STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO".."43",
        "STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER".."44",
        "STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER".."45",
        "STRUCTURE_TYPE_MEMORY_BARRIER".."46",
        "STRUCTURE_TYPE_LOADER_INSTANCE_CREATE_INFO".."47",
        "STRUCTURE_TYPE_LOADER_DEVICE_CREATE_INFO".."48"
    )

    EnumConstant(
        """
        VkSystemAllocationScope - Allocation scope

        <h5>Description</h5>
        <ul>
            <li>#SYSTEM_ALLOCATION_SCOPE_COMMAND specifies that the allocation is scoped to the duration of the Vulkan command.</li>
            <li>#SYSTEM_ALLOCATION_SCOPE_OBJECT specifies that the allocation is scoped to the lifetime of the Vulkan object that is being created or used.</li>
            <li>#SYSTEM_ALLOCATION_SCOPE_CACHE specifies that the allocation is scoped to the lifetime of a {@code VkPipelineCache} object.</li>
            <li>#SYSTEM_ALLOCATION_SCOPE_DEVICE specifies that the allocation is scoped to the lifetime of the Vulkan device.</li>
            <li>#SYSTEM_ALLOCATION_SCOPE_INSTANCE specifies that the allocation is scoped to the lifetime of the Vulkan instance.</li>
        </ul>

        Most Vulkan commands operate on a single object, or there is a sole object that is being created or manipulated. When an allocation uses an allocation scope of #SYSTEM_ALLOCATION_SCOPE_OBJECT or #SYSTEM_ALLOCATION_SCOPE_CACHE, the allocation is scoped to the object being created or manipulated.

        When an implementation requires host memory, it will make callbacks to the application using the most specific allocator and allocation scope available:

        <ul>
            <li>If an allocation is scoped to the duration of a command, the allocator will use the #SYSTEM_ALLOCATION_SCOPE_COMMAND allocation scope. The most specific allocator available is used: if the object being created or manipulated has an allocator, that object&#8217;s allocator will be used, else if the parent {@code VkDevice} has an allocator it will be used, else if the parent {@code VkInstance} has an allocator it will be used. Else,</li>
            <li>If an allocation is associated with an object of type {@code VkPipelineCache}, the allocator will use the #SYSTEM_ALLOCATION_SCOPE_CACHE allocation scope. The most specific allocator available is used (pipeline cache, else device, else instance). Else,</li>
            <li>If an allocation is scoped to the lifetime of an object, that object is being created or manipulated by the command, and that object&#8217;s type is not {@code VkDevice} or {@code VkInstance}, the allocator will use an allocation scope of #SYSTEM_ALLOCATION_SCOPE_OBJECT. The most specific allocator available is used (object, else device, else instance). Else,</li>
            <li>If an allocation is scoped to the lifetime of a device, the allocator will use an allocation scope of #SYSTEM_ALLOCATION_SCOPE_DEVICE. The most specific allocator available is used (device, else instance). Else,</li>
            <li>If the allocation is scoped to the lifetime of an instance and the instance has an allocator, its allocator will be used with an allocation scope of #SYSTEM_ALLOCATION_SCOPE_INSTANCE.</li>
            <li>Otherwise an implementation will allocate memory through an alternative mechanism that is unspecified.</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        "SYSTEM_ALLOCATION_SCOPE_COMMAND".."0",
        "SYSTEM_ALLOCATION_SCOPE_OBJECT".."1",
        "SYSTEM_ALLOCATION_SCOPE_CACHE".."2",
        "SYSTEM_ALLOCATION_SCOPE_DEVICE".."3",
        "SYSTEM_ALLOCATION_SCOPE_INSTANCE".."4"
    )

    EnumConstant(
        """
        VkInternalAllocationType - Allocation type

        <h5>Description</h5>
        <ul>
            <li>#INTERNAL_ALLOCATION_TYPE_EXECUTABLE specifies that the allocation is intended for execution by the host.</li>
        </ul>

        <h5>See Also</h5>
        ##VkInternalAllocationNotification, ##VkInternalFreeNotification
        """,

        "INTERNAL_ALLOCATION_TYPE_EXECUTABLE".."0"
    )

    EnumConstant(
        """
        VkFormat - Available image formats

        <h5>Description</h5>
        <ul>
            <li>#FORMAT_UNDEFINED indicates that the format is not specified.</li>
            <li>#FORMAT_R4G4_UNORM_PACK8 specifies a two-component, 8-bit packed unsigned normalized format that has a 4-bit R component in bits 4..7, and a 4-bit G component in bits 0..3.</li>
            <li>#FORMAT_R4G4B4A4_UNORM_PACK16 specifies a four-component, 16-bit packed unsigned normalized format that has a 4-bit R component in bits 12..15, a 4-bit G component in bits 8..11, a 4-bit B component in bits 4..7, and a 4-bit A component in bits 0..3.</li>
            <li>#FORMAT_B4G4R4A4_UNORM_PACK16 specifies a four-component, 16-bit packed unsigned normalized format that has a 4-bit B component in bits 12..15, a 4-bit G component in bits 8..11, a 4-bit R component in bits 4..7, and a 4-bit A component in bits 0..3.</li>
            <li>#FORMAT_R5G6B5_UNORM_PACK16 specifies a three-component, 16-bit packed unsigned normalized format that has a 5-bit R component in bits 11..15, a 6-bit G component in bits 5..10, and a 5-bit B component in bits 0..4.</li>
            <li>#FORMAT_B5G6R5_UNORM_PACK16 specifies a three-component, 16-bit packed unsigned normalized format that has a 5-bit B component in bits 11..15, a 6-bit G component in bits 5..10, and a 5-bit R component in bits 0..4.</li>
            <li>#FORMAT_R5G5B5A1_UNORM_PACK16 specifies a four-component, 16-bit packed unsigned normalized format that has a 5-bit R component in bits 11..15, a 5-bit G component in bits 6..10, a 5-bit B component in bits 1..5, and a 1-bit A component in bit 0.</li>
            <li>#FORMAT_B5G5R5A1_UNORM_PACK16 specifies a four-component, 16-bit packed unsigned normalized format that has a 5-bit B component in bits 11..15, a 5-bit G component in bits 6..10, a 5-bit R component in bits 1..5, and a 1-bit A component in bit 0.</li>
            <li>#FORMAT_A1R5G5B5_UNORM_PACK16 specifies a four-component, 16-bit packed unsigned normalized format that has a 1-bit A component in bit 15, a 5-bit R component in bits 10..14, a 5-bit G component in bits 5..9, and a 5-bit B component in bits 0..4.</li>
            <li>#FORMAT_R8_UNORM specifies a one-component, 8-bit unsigned normalized format that has a single 8-bit R component.</li>
            <li>#FORMAT_R8_SNORM specifies a one-component, 8-bit signed normalized format that has a single 8-bit R component.</li>
            <li>#FORMAT_R8_USCALED specifies a one-component, 8-bit unsigned scaled integer format that has a single 8-bit R component.</li>
            <li>#FORMAT_R8_SSCALED specifies a one-component, 8-bit signed scaled integer format that has a single 8-bit R component.</li>
            <li>#FORMAT_R8_UINT specifies a one-component, 8-bit unsigned integer format that has a single 8-bit R component.</li>
            <li>#FORMAT_R8_SINT specifies a one-component, 8-bit signed integer format that has a single 8-bit R component.</li>
            <li>#FORMAT_R8_SRGB specifies a one-component, 8-bit unsigned normalized format that has a single 8-bit R component stored with sRGB nonlinear encoding.</li>
            <li>#FORMAT_R8G8_UNORM specifies a two-component, 16-bit unsigned normalized format that has an 8-bit R component in byte 0, and an 8-bit G component in byte 1.</li>
            <li>#FORMAT_R8G8_SNORM specifies a two-component, 16-bit signed normalized format that has an 8-bit R component in byte 0, and an 8-bit G component in byte 1.</li>
            <li>#FORMAT_R8G8_USCALED specifies a two-component, 16-bit unsigned scaled integer format that has an 8-bit R component in byte 0, and an 8-bit G component in byte 1.</li>
            <li>#FORMAT_R8G8_SSCALED specifies a two-component, 16-bit signed scaled integer format that has an 8-bit R component in byte 0, and an 8-bit G component in byte 1.</li>
            <li>#FORMAT_R8G8_UINT specifies a two-component, 16-bit unsigned integer format that has an 8-bit R component in byte 0, and an 8-bit G component in byte 1.</li>
            <li>#FORMAT_R8G8_SINT specifies a two-component, 16-bit signed integer format that has an 8-bit R component in byte 0, and an 8-bit G component in byte 1.</li>
            <li>#FORMAT_R8G8_SRGB specifies a two-component, 16-bit unsigned normalized format that has an 8-bit R component stored with sRGB nonlinear encoding in byte 0, and an 8-bit G component stored with sRGB nonlinear encoding in byte 1.</li>
            <li>#FORMAT_R8G8B8_UNORM specifies a three-component, 24-bit unsigned normalized format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, and an 8-bit B component in byte 2.</li>
            <li>#FORMAT_R8G8B8_SNORM specifies a three-component, 24-bit signed normalized format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, and an 8-bit B component in byte 2.</li>
            <li>#FORMAT_R8G8B8_USCALED specifies a three-component, 24-bit unsigned scaled format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, and an 8-bit B component in byte 2.</li>
            <li>#FORMAT_R8G8B8_SSCALED specifies a three-component, 24-bit signed scaled format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, and an 8-bit B component in byte 2.</li>
            <li>#FORMAT_R8G8B8_UINT specifies a three-component, 24-bit unsigned integer format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, and an 8-bit B component in byte 2.</li>
            <li>#FORMAT_R8G8B8_SINT specifies a three-component, 24-bit signed integer format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, and an 8-bit B component in byte 2.</li>
            <li>#FORMAT_R8G8B8_SRGB specifies a three-component, 24-bit unsigned normalized format that has an 8-bit R component stored with sRGB nonlinear encoding in byte 0, an 8-bit G component stored with sRGB nonlinear encoding in byte 1, and an 8-bit B component stored with sRGB nonlinear encoding in byte 2.</li>
            <li>#FORMAT_B8G8R8_UNORM specifies a three-component, 24-bit unsigned normalized format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, and an 8-bit R component in byte 2.</li>
            <li>#FORMAT_B8G8R8_SNORM specifies a three-component, 24-bit signed normalized format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, and an 8-bit R component in byte 2.</li>
            <li>#FORMAT_B8G8R8_USCALED specifies a three-component, 24-bit unsigned scaled format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, and an 8-bit R component in byte 2.</li>
            <li>#FORMAT_B8G8R8_SSCALED specifies a three-component, 24-bit signed scaled format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, and an 8-bit R component in byte 2.</li>
            <li>#FORMAT_B8G8R8_UINT specifies a three-component, 24-bit unsigned integer format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, and an 8-bit R component in byte 2.</li>
            <li>#FORMAT_B8G8R8_SINT specifies a three-component, 24-bit signed integer format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, and an 8-bit R component in byte 2.</li>
            <li>#FORMAT_B8G8R8_SRGB specifies a three-component, 24-bit unsigned normalized format that has an 8-bit B component stored with sRGB nonlinear encoding in byte 0, an 8-bit G component stored with sRGB nonlinear encoding in byte 1, and an 8-bit R component stored with sRGB nonlinear encoding in byte 2.</li>
            <li>#FORMAT_R8G8B8A8_UNORM specifies a four-component, 32-bit unsigned normalized format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, an 8-bit B component in byte 2, and an 8-bit A component in byte 3.</li>
            <li>#FORMAT_R8G8B8A8_SNORM specifies a four-component, 32-bit signed normalized format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, an 8-bit B component in byte 2, and an 8-bit A component in byte 3.</li>
            <li>#FORMAT_R8G8B8A8_USCALED specifies a four-component, 32-bit unsigned scaled format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, an 8-bit B component in byte 2, and an 8-bit A component in byte 3.</li>
            <li>#FORMAT_R8G8B8A8_SSCALED specifies a four-component, 32-bit signed scaled format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, an 8-bit B component in byte 2, and an 8-bit A component in byte 3.</li>
            <li>#FORMAT_R8G8B8A8_UINT specifies a four-component, 32-bit unsigned integer format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, an 8-bit B component in byte 2, and an 8-bit A component in byte 3.</li>
            <li>#FORMAT_R8G8B8A8_SINT specifies a four-component, 32-bit signed integer format that has an 8-bit R component in byte 0, an 8-bit G component in byte 1, an 8-bit B component in byte 2, and an 8-bit A component in byte 3.</li>
            <li>#FORMAT_R8G8B8A8_SRGB specifies a four-component, 32-bit unsigned normalized format that has an 8-bit R component stored with sRGB nonlinear encoding in byte 0, an 8-bit G component stored with sRGB nonlinear encoding in byte 1, an 8-bit B component stored with sRGB nonlinear encoding in byte 2, and an 8-bit A component in byte 3.</li>
            <li>#FORMAT_B8G8R8A8_UNORM specifies a four-component, 32-bit unsigned normalized format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, an 8-bit R component in byte 2, and an 8-bit A component in byte 3.</li>
            <li>#FORMAT_B8G8R8A8_SNORM specifies a four-component, 32-bit signed normalized format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, an 8-bit R component in byte 2, and an 8-bit A component in byte 3.</li>
            <li>#FORMAT_B8G8R8A8_USCALED specifies a four-component, 32-bit unsigned scaled format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, an 8-bit R component in byte 2, and an 8-bit A component in byte 3.</li>
            <li>#FORMAT_B8G8R8A8_SSCALED specifies a four-component, 32-bit signed scaled format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, an 8-bit R component in byte 2, and an 8-bit A component in byte 3.</li>
            <li>#FORMAT_B8G8R8A8_UINT specifies a four-component, 32-bit unsigned integer format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, an 8-bit R component in byte 2, and an 8-bit A component in byte 3.</li>
            <li>#FORMAT_B8G8R8A8_SINT specifies a four-component, 32-bit signed integer format that has an 8-bit B component in byte 0, an 8-bit G component in byte 1, an 8-bit R component in byte 2, and an 8-bit A component in byte 3.</li>
            <li>#FORMAT_B8G8R8A8_SRGB specifies a four-component, 32-bit unsigned normalized format that has an 8-bit B component stored with sRGB nonlinear encoding in byte 0, an 8-bit G component stored with sRGB nonlinear encoding in byte 1, an 8-bit R component stored with sRGB nonlinear encoding in byte 2, and an 8-bit A component in byte 3.</li>
            <li>#FORMAT_A8B8G8R8_UNORM_PACK32 specifies a four-component, 32-bit packed unsigned normalized format that has an 8-bit A component in bits 24..31, an 8-bit B component in bits 16..23, an 8-bit G component in bits 8..15, and an 8-bit R component in bits 0..7.</li>
            <li>#FORMAT_A8B8G8R8_SNORM_PACK32 specifies a four-component, 32-bit packed signed normalized format that has an 8-bit A component in bits 24..31, an 8-bit B component in bits 16..23, an 8-bit G component in bits 8..15, and an 8-bit R component in bits 0..7.</li>
            <li>#FORMAT_A8B8G8R8_USCALED_PACK32 specifies a four-component, 32-bit packed unsigned scaled integer format that has an 8-bit A component in bits 24..31, an 8-bit B component in bits 16..23, an 8-bit G component in bits 8..15, and an 8-bit R component in bits 0..7.</li>
            <li>#FORMAT_A8B8G8R8_SSCALED_PACK32 specifies a four-component, 32-bit packed signed scaled integer format that has an 8-bit A component in bits 24..31, an 8-bit B component in bits 16..23, an 8-bit G component in bits 8..15, and an 8-bit R component in bits 0..7.</li>
            <li>#FORMAT_A8B8G8R8_UINT_PACK32 specifies a four-component, 32-bit packed unsigned integer format that has an 8-bit A component in bits 24..31, an 8-bit B component in bits 16..23, an 8-bit G component in bits 8..15, and an 8-bit R component in bits 0..7.</li>
            <li>#FORMAT_A8B8G8R8_SINT_PACK32 specifies a four-component, 32-bit packed signed integer format that has an 8-bit A component in bits 24..31, an 8-bit B component in bits 16..23, an 8-bit G component in bits 8..15, and an 8-bit R component in bits 0..7.</li>
            <li>#FORMAT_A8B8G8R8_SRGB_PACK32 specifies a four-component, 32-bit packed unsigned normalized format that has an 8-bit A component in bits 24..31, an 8-bit B component stored with sRGB nonlinear encoding in bits 16..23, an 8-bit G component stored with sRGB nonlinear encoding in bits 8..15, and an 8-bit R component stored with sRGB nonlinear encoding in bits 0..7.</li>
            <li>#FORMAT_A2R10G10B10_UNORM_PACK32 specifies a four-component, 32-bit packed unsigned normalized format that has a 2-bit A component in bits 30..31, a 10-bit R component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit B component in bits 0..9.</li>
            <li>#FORMAT_A2R10G10B10_SNORM_PACK32 specifies a four-component, 32-bit packed signed normalized format that has a 2-bit A component in bits 30..31, a 10-bit R component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit B component in bits 0..9.</li>
            <li>#FORMAT_A2R10G10B10_USCALED_PACK32 specifies a four-component, 32-bit packed unsigned scaled integer format that has a 2-bit A component in bits 30..31, a 10-bit R component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit B component in bits 0..9.</li>
            <li>#FORMAT_A2R10G10B10_SSCALED_PACK32 specifies a four-component, 32-bit packed signed scaled integer format that has a 2-bit A component in bits 30..31, a 10-bit R component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit B component in bits 0..9.</li>
            <li>#FORMAT_A2R10G10B10_UINT_PACK32 specifies a four-component, 32-bit packed unsigned integer format that has a 2-bit A component in bits 30..31, a 10-bit R component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit B component in bits 0..9.</li>
            <li>#FORMAT_A2R10G10B10_SINT_PACK32 specifies a four-component, 32-bit packed signed integer format that has a 2-bit A component in bits 30..31, a 10-bit R component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit B component in bits 0..9.</li>
            <li>#FORMAT_A2B10G10R10_UNORM_PACK32 specifies a four-component, 32-bit packed unsigned normalized format that has a 2-bit A component in bits 30..31, a 10-bit B component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit R component in bits 0..9.</li>
            <li>#FORMAT_A2B10G10R10_SNORM_PACK32 specifies a four-component, 32-bit packed signed normalized format that has a 2-bit A component in bits 30..31, a 10-bit B component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit R component in bits 0..9.</li>
            <li>#FORMAT_A2B10G10R10_USCALED_PACK32 specifies a four-component, 32-bit packed unsigned scaled integer format that has a 2-bit A component in bits 30..31, a 10-bit B component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit R component in bits 0..9.</li>
            <li>#FORMAT_A2B10G10R10_SSCALED_PACK32 specifies a four-component, 32-bit packed signed scaled integer format that has a 2-bit A component in bits 30..31, a 10-bit B component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit R component in bits 0..9.</li>
            <li>#FORMAT_A2B10G10R10_UINT_PACK32 specifies a four-component, 32-bit packed unsigned integer format that has a 2-bit A component in bits 30..31, a 10-bit B component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit R component in bits 0..9.</li>
            <li>#FORMAT_A2B10G10R10_SINT_PACK32 specifies a four-component, 32-bit packed signed integer format that has a 2-bit A component in bits 30..31, a 10-bit B component in bits 20..29, a 10-bit G component in bits 10..19, and a 10-bit R component in bits 0..9.</li>
            <li>#FORMAT_R16_UNORM specifies a one-component, 16-bit unsigned normalized format that has a single 16-bit R component.</li>
            <li>#FORMAT_R16_SNORM specifies a one-component, 16-bit signed normalized format that has a single 16-bit R component.</li>
            <li>#FORMAT_R16_USCALED specifies a one-component, 16-bit unsigned scaled integer format that has a single 16-bit R component.</li>
            <li>#FORMAT_R16_SSCALED specifies a one-component, 16-bit signed scaled integer format that has a single 16-bit R component.</li>
            <li>#FORMAT_R16_UINT specifies a one-component, 16-bit unsigned integer format that has a single 16-bit R component.</li>
            <li>#FORMAT_R16_SINT specifies a one-component, 16-bit signed integer format that has a single 16-bit R component.</li>
            <li>#FORMAT_R16_SFLOAT specifies a one-component, 16-bit signed floating-point format that has a single 16-bit R component.</li>
            <li>#FORMAT_R16G16_UNORM specifies a two-component, 32-bit unsigned normalized format that has a 16-bit R component in bytes 0..1, and a 16-bit G component in bytes 2..3.</li>
            <li>#FORMAT_R16G16_SNORM specifies a two-component, 32-bit signed normalized format that has a 16-bit R component in bytes 0..1, and a 16-bit G component in bytes 2..3.</li>
            <li>#FORMAT_R16G16_USCALED specifies a two-component, 32-bit unsigned scaled integer format that has a 16-bit R component in bytes 0..1, and a 16-bit G component in bytes 2..3.</li>
            <li>#FORMAT_R16G16_SSCALED specifies a two-component, 32-bit signed scaled integer format that has a 16-bit R component in bytes 0..1, and a 16-bit G component in bytes 2..3.</li>
            <li>#FORMAT_R16G16_UINT specifies a two-component, 32-bit unsigned integer format that has a 16-bit R component in bytes 0..1, and a 16-bit G component in bytes 2..3.</li>
            <li>#FORMAT_R16G16_SINT specifies a two-component, 32-bit signed integer format that has a 16-bit R component in bytes 0..1, and a 16-bit G component in bytes 2..3.</li>
            <li>#FORMAT_R16G16_SFLOAT specifies a two-component, 32-bit signed floating-point format that has a 16-bit R component in bytes 0..1, and a 16-bit G component in bytes 2..3.</li>
            <li>#FORMAT_R16G16B16_UNORM specifies a three-component, 48-bit unsigned normalized format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, and a 16-bit B component in bytes 4..5.</li>
            <li>#FORMAT_R16G16B16_SNORM specifies a three-component, 48-bit signed normalized format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, and a 16-bit B component in bytes 4..5.</li>
            <li>#FORMAT_R16G16B16_USCALED specifies a three-component, 48-bit unsigned scaled integer format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, and a 16-bit B component in bytes 4..5.</li>
            <li>#FORMAT_R16G16B16_SSCALED specifies a three-component, 48-bit signed scaled integer format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, and a 16-bit B component in bytes 4..5.</li>
            <li>#FORMAT_R16G16B16_UINT specifies a three-component, 48-bit unsigned integer format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, and a 16-bit B component in bytes 4..5.</li>
            <li>#FORMAT_R16G16B16_SINT specifies a three-component, 48-bit signed integer format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, and a 16-bit B component in bytes 4..5.</li>
            <li>#FORMAT_R16G16B16_SFLOAT specifies a three-component, 48-bit signed floating-point format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, and a 16-bit B component in bytes 4..5.</li>
            <li>#FORMAT_R16G16B16A16_UNORM specifies a four-component, 64-bit unsigned normalized format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, a 16-bit B component in bytes 4..5, and a 16-bit A component in bytes 6..7.</li>
            <li>#FORMAT_R16G16B16A16_SNORM specifies a four-component, 64-bit signed normalized format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, a 16-bit B component in bytes 4..5, and a 16-bit A component in bytes 6..7.</li>
            <li>#FORMAT_R16G16B16A16_USCALED specifies a four-component, 64-bit unsigned scaled integer format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, a 16-bit B component in bytes 4..5, and a 16-bit A component in bytes 6..7.</li>
            <li>#FORMAT_R16G16B16A16_SSCALED specifies a four-component, 64-bit signed scaled integer format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, a 16-bit B component in bytes 4..5, and a 16-bit A component in bytes 6..7.</li>
            <li>#FORMAT_R16G16B16A16_UINT specifies a four-component, 64-bit unsigned integer format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, a 16-bit B component in bytes 4..5, and a 16-bit A component in bytes 6..7.</li>
            <li>#FORMAT_R16G16B16A16_SINT specifies a four-component, 64-bit signed integer format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, a 16-bit B component in bytes 4..5, and a 16-bit A component in bytes 6..7.</li>
            <li>#FORMAT_R16G16B16A16_SFLOAT specifies a four-component, 64-bit signed floating-point format that has a 16-bit R component in bytes 0..1, a 16-bit G component in bytes 2..3, a 16-bit B component in bytes 4..5, and a 16-bit A component in bytes 6..7.</li>
            <li>#FORMAT_R32_UINT specifies a one-component, 32-bit unsigned integer format that has a single 32-bit R component.</li>
            <li>#FORMAT_R32_SINT specifies a one-component, 32-bit signed integer format that has a single 32-bit R component.</li>
            <li>#FORMAT_R32_SFLOAT specifies a one-component, 32-bit signed floating-point format that has a single 32-bit R component.</li>
            <li>#FORMAT_R32G32_UINT specifies a two-component, 64-bit unsigned integer format that has a 32-bit R component in bytes 0..3, and a 32-bit G component in bytes 4..7.</li>
            <li>#FORMAT_R32G32_SINT specifies a two-component, 64-bit signed integer format that has a 32-bit R component in bytes 0..3, and a 32-bit G component in bytes 4..7.</li>
            <li>#FORMAT_R32G32_SFLOAT specifies a two-component, 64-bit signed floating-point format that has a 32-bit R component in bytes 0..3, and a 32-bit G component in bytes 4..7.</li>
            <li>#FORMAT_R32G32B32_UINT specifies a three-component, 96-bit unsigned integer format that has a 32-bit R component in bytes 0..3, a 32-bit G component in bytes 4..7, and a 32-bit B component in bytes 8..11.</li>
            <li>#FORMAT_R32G32B32_SINT specifies a three-component, 96-bit signed integer format that has a 32-bit R component in bytes 0..3, a 32-bit G component in bytes 4..7, and a 32-bit B component in bytes 8..11.</li>
            <li>#FORMAT_R32G32B32_SFLOAT specifies a three-component, 96-bit signed floating-point format that has a 32-bit R component in bytes 0..3, a 32-bit G component in bytes 4..7, and a 32-bit B component in bytes 8..11.</li>
            <li>#FORMAT_R32G32B32A32_UINT specifies a four-component, 128-bit unsigned integer format that has a 32-bit R component in bytes 0..3, a 32-bit G component in bytes 4..7, a 32-bit B component in bytes 8..11, and a 32-bit A component in bytes 12..15.</li>
            <li>#FORMAT_R32G32B32A32_SINT specifies a four-component, 128-bit signed integer format that has a 32-bit R component in bytes 0..3, a 32-bit G component in bytes 4..7, a 32-bit B component in bytes 8..11, and a 32-bit A component in bytes 12..15.</li>
            <li>#FORMAT_R32G32B32A32_SFLOAT specifies a four-component, 128-bit signed floating-point format that has a 32-bit R component in bytes 0..3, a 32-bit G component in bytes 4..7, a 32-bit B component in bytes 8..11, and a 32-bit A component in bytes 12..15.</li>
            <li>#FORMAT_R64_UINT specifies a one-component, 64-bit unsigned integer format that has a single 64-bit R component.</li>
            <li>#FORMAT_R64_SINT specifies a one-component, 64-bit signed integer format that has a single 64-bit R component.</li>
            <li>#FORMAT_R64_SFLOAT specifies a one-component, 64-bit signed floating-point format that has a single 64-bit R component.</li>
            <li>#FORMAT_R64G64_UINT specifies a two-component, 128-bit unsigned integer format that has a 64-bit R component in bytes 0..7, and a 64-bit G component in bytes 8..15.</li>
            <li>#FORMAT_R64G64_SINT specifies a two-component, 128-bit signed integer format that has a 64-bit R component in bytes 0..7, and a 64-bit G component in bytes 8..15.</li>
            <li>#FORMAT_R64G64_SFLOAT specifies a two-component, 128-bit signed floating-point format that has a 64-bit R component in bytes 0..7, and a 64-bit G component in bytes 8..15.</li>
            <li>#FORMAT_R64G64B64_UINT specifies a three-component, 192-bit unsigned integer format that has a 64-bit R component in bytes 0..7, a 64-bit G component in bytes 8..15, and a 64-bit B component in bytes 16..23.</li>
            <li>#FORMAT_R64G64B64_SINT specifies a three-component, 192-bit signed integer format that has a 64-bit R component in bytes 0..7, a 64-bit G component in bytes 8..15, and a 64-bit B component in bytes 16..23.</li>
            <li>#FORMAT_R64G64B64_SFLOAT specifies a three-component, 192-bit signed floating-point format that has a 64-bit R component in bytes 0..7, a 64-bit G component in bytes 8..15, and a 64-bit B component in bytes 16..23.</li>
            <li>#FORMAT_R64G64B64A64_UINT specifies a four-component, 256-bit unsigned integer format that has a 64-bit R component in bytes 0..7, a 64-bit G component in bytes 8..15, a 64-bit B component in bytes 16..23, and a 64-bit A component in bytes 24..31.</li>
            <li>#FORMAT_R64G64B64A64_SINT specifies a four-component, 256-bit signed integer format that has a 64-bit R component in bytes 0..7, a 64-bit G component in bytes 8..15, a 64-bit B component in bytes 16..23, and a 64-bit A component in bytes 24..31.</li>
            <li>#FORMAT_R64G64B64A64_SFLOAT specifies a four-component, 256-bit signed floating-point format that has a 64-bit R component in bytes 0..7, a 64-bit G component in bytes 8..15, a 64-bit B component in bytes 16..23, and a 64-bit A component in bytes 24..31.</li>
            <li>#FORMAT_B10G11R11_UFLOAT_PACK32 specifies a three-component, 32-bit packed unsigned floating-point format that has a 10-bit B component in bits 22..31, an 11-bit G component in bits 11..21, an 11-bit R component in bits 0..10. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#fundamentals-fp10">the “Unsigned 10-Bit Floating-Point Numbers” section</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#fundamentals-fp11">the “Unsigned 11-Bit Floating-Point Numbers” section</a>.</li>
            <li>#FORMAT_E5B9G9R9_UFLOAT_PACK32 specifies a three-component, 32-bit packed unsigned floating-point format that has a 5-bit shared exponent in bits 27..31, a 9-bit B component mantissa in bits 18..26, a 9-bit G component mantissa in bits 9..17, and a 9-bit R component mantissa in bits 0..8.</li>
            <li>#FORMAT_D16_UNORM specifies a one-component, 16-bit unsigned normalized format that has a single 16-bit depth component.</li>
            <li>#FORMAT_X8_D24_UNORM_PACK32 specifies a two-component, 32-bit format that has 24 unsigned normalized bits in the depth component and, optionally:, 8 bits that are unused.</li>
            <li>#FORMAT_D32_SFLOAT specifies a one-component, 32-bit signed floating-point format that has 32-bits in the depth component.</li>
            <li>#FORMAT_S8_UINT specifies a one-component, 8-bit unsigned integer format that has 8-bits in the stencil component.</li>
            <li>#FORMAT_D16_UNORM_S8_UINT specifies a two-component, 24-bit format that has 16 unsigned normalized bits in the depth component and 8 unsigned integer bits in the stencil component.</li>
            <li>#FORMAT_D24_UNORM_S8_UINT specifies a two-component, 32-bit packed format that has 8 unsigned integer bits in the stencil component, and 24 unsigned normalized bits in the depth component.</li>
            <li>#FORMAT_D32_SFLOAT_S8_UINT specifies a two-component format that has 32 signed float bits in the depth component and 8 unsigned integer bits in the stencil component. There are optionally: 24-bits that are unused.</li>
            <li>#FORMAT_BC1_RGB_UNORM_BLOCK specifies a three-component, block-compressed format where each 64-bit compressed texel block encodes a 4x4 rectangle of unsigned normalized RGB texel data. This format has no alpha and is considered opaque.</li>
            <li>#FORMAT_BC1_RGB_SRGB_BLOCK specifies a three-component, block-compressed format where each 64-bit compressed texel block encodes a 4x4 rectangle of unsigned normalized RGB texel data with sRGB nonlinear encoding. This format has no alpha and is considered opaque.</li>
            <li>#FORMAT_BC1_RGBA_UNORM_BLOCK specifies a four-component, block-compressed format where each 64-bit compressed texel block encodes a 4x4 rectangle of unsigned normalized RGB texel data, and provides 1 bit of alpha.</li>
            <li>#FORMAT_BC1_RGBA_SRGB_BLOCK specifies a four-component, block-compressed format where each 64-bit compressed texel block encodes a 4x4 rectangle of unsigned normalized RGB texel data with sRGB nonlinear encoding, and provides 1 bit of alpha.</li>
            <li>#FORMAT_BC2_UNORM_BLOCK specifies a four-component, block-compressed format where each 128-bit compressed texel block encodes a 4x4 rectangle of unsigned normalized RGBA texel data with the first 64 bits encoding alpha values followed by 64 bits encoding RGB values.</li>
            <li>#FORMAT_BC2_SRGB_BLOCK specifies a four-component, block-compressed format where each 128-bit compressed texel block encodes a 4x4 rectangle of unsigned normalized RGBA texel data with the first 64 bits encoding alpha values followed by 64 bits encoding RGB values with sRGB nonlinear encoding.</li>
            <li>#FORMAT_BC3_UNORM_BLOCK specifies a four-component, block-compressed format where each 128-bit compressed texel block encodes a 4x4 rectangle of unsigned normalized RGBA texel data with the first 64 bits encoding alpha values followed by 64 bits encoding RGB values.</li>
            <li>#FORMAT_BC3_SRGB_BLOCK specifies a four-component, block-compressed format where each 128-bit compressed texel block encodes a 4x4 rectangle of unsigned normalized RGBA texel data with the first 64 bits encoding alpha values followed by 64 bits encoding RGB values with sRGB nonlinear encoding.</li>
            <li>#FORMAT_BC4_UNORM_BLOCK specifies a one-component, block-compressed format where each 64-bit compressed texel block encodes a 4x4 rectangle of unsigned normalized red texel data.</li>
            <li>#FORMAT_BC4_SNORM_BLOCK specifies a one-component, block-compressed format where each 64-bit compressed texel block encodes a 4x4 rectangle of signed normalized red texel data.</li>
            <li>#FORMAT_BC5_UNORM_BLOCK specifies a two-component, block-compressed format where each 128-bit compressed texel block encodes a 4x4 rectangle of unsigned normalized RG texel data with the first 64 bits encoding red values followed by 64 bits encoding green values.</li>
            <li>#FORMAT_BC5_SNORM_BLOCK specifies a two-component, block-compressed format where each 128-bit compressed texel block encodes a 4x4 rectangle of signed normalized RG texel data with the first 64 bits encoding red values followed by 64 bits encoding green values.</li>
            <li>#FORMAT_BC6H_UFLOAT_BLOCK specifies a three-component, block-compressed format where each 128-bit compressed texel block encodes a 4x4 rectangle of unsigned floating-point RGB texel data.</li>
            <li>#FORMAT_BC6H_SFLOAT_BLOCK specifies a three-component, block-compressed format where each 128-bit compressed texel block encodes a 4x4 rectangle of signed floating-point RGB texel data.</li>
            <li>#FORMAT_BC7_UNORM_BLOCK specifies a four-component, block-compressed format where each 128-bit compressed texel block encodes a 4x4 rectangle of unsigned normalized RGBA texel data.</li>
            <li>#FORMAT_BC7_SRGB_BLOCK specifies a four-component, block-compressed format where each 128-bit compressed texel block encodes a 4x4 rectangle of unsigned normalized RGBA texel data with sRGB nonlinear encoding applied to the RGB components.</li>
            <li>#FORMAT_ETC2_R8G8B8_UNORM_BLOCK specifies a three-component, ETC2 compressed format where each 64-bit compressed texel block encodes a 4x4 rectangle of unsigned normalized RGB texel data. This format has no alpha and is considered opaque.</li>
            <li>#FORMAT_ETC2_R8G8B8_SRGB_BLOCK specifies a three-component, ETC2 compressed format where each 64-bit compressed texel block encodes a 4x4 rectangle of unsigned normalized RGB texel data with sRGB nonlinear encoding. This format has no alpha and is considered opaque.</li>
            <li>#FORMAT_ETC2_R8G8B8A1_UNORM_BLOCK specifies a four-component, ETC2 compressed format where each 64-bit compressed texel block encodes a 4x4 rectangle of unsigned normalized RGB texel data, and provides 1 bit of alpha.</li>
            <li>#FORMAT_ETC2_R8G8B8A1_SRGB_BLOCK specifies a four-component, ETC2 compressed format where each 64-bit compressed texel block encodes a 4x4 rectangle of unsigned normalized RGB texel data with sRGB nonlinear encoding, and provides 1 bit of alpha.</li>
            <li>#FORMAT_ETC2_R8G8B8A8_UNORM_BLOCK specifies a four-component, ETC2 compressed format where each 128-bit compressed texel block encodes a 4x4 rectangle of unsigned normalized RGBA texel data with the first 64 bits encoding alpha values followed by 64 bits encoding RGB values.</li>
            <li>#FORMAT_ETC2_R8G8B8A8_SRGB_BLOCK specifies a four-component, ETC2 compressed format where each 64-bit compressed texel block encodes a 4x4 rectangle of unsigned normalized RGBA texel data with the first 64 bits encoding alpha values followed by 64 bits encoding RGB values with sRGB nonlinear encoding applied.</li>
            <li>#FORMAT_EAC_R11_UNORM_BLOCK specifies a one-component, ETC2 compressed format where each 64-bit compressed texel block encodes a 4x4 rectangle of unsigned normalized red texel data.</li>
            <li>#FORMAT_EAC_R11_SNORM_BLOCK specifies a one-component, ETC2 compressed format where each 64-bit compressed texel block encodes a 4x4 rectangle of signed normalized red texel data.</li>
            <li>#FORMAT_EAC_R11G11_UNORM_BLOCK specifies a two-component, ETC2 compressed format where each 128-bit compressed texel block encodes a 4x4 rectangle of unsigned normalized RG texel data with the first 64 bits encoding red values followed by 64 bits encoding green values.</li>
            <li>#FORMAT_EAC_R11G11_SNORM_BLOCK specifies a two-component, ETC2 compressed format where each 128-bit compressed texel block encodes a 4x4 rectangle of signed normalized RG texel data with the first 64 bits encoding red values followed by 64 bits encoding green values.</li>
            <li>#FORMAT_ASTC_4x4_UNORM_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 4x4 rectangle of unsigned normalized RGBA texel data.</li>
            <li>#FORMAT_ASTC_4x4_SRGB_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 4x4 rectangle of unsigned normalized RGBA texel data with sRGB nonlinear encoding applied to the RGB components.</li>
            <li>#FORMAT_ASTC_5x4_UNORM_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 5x4 rectangle of unsigned normalized RGBA texel data.</li>
            <li>#FORMAT_ASTC_5x4_SRGB_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 5x4 rectangle of unsigned normalized RGBA texel data with sRGB nonlinear encoding applied to the RGB components.</li>
            <li>#FORMAT_ASTC_5x5_UNORM_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 5x5 rectangle of unsigned normalized RGBA texel data.</li>
            <li>#FORMAT_ASTC_5x5_SRGB_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 5x5 rectangle of unsigned normalized RGBA texel data with sRGB nonlinear encoding applied to the RGB components.</li>
            <li>#FORMAT_ASTC_6x5_UNORM_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 6x5 rectangle of unsigned normalized RGBA texel data.</li>
            <li>#FORMAT_ASTC_6x5_SRGB_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 6x5 rectangle of unsigned normalized RGBA texel data with sRGB nonlinear encoding applied to the RGB components.</li>
            <li>#FORMAT_ASTC_6x6_UNORM_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 6x6 rectangle of unsigned normalized RGBA texel data.</li>
            <li>#FORMAT_ASTC_6x6_SRGB_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 6x6 rectangle of unsigned normalized RGBA texel data with sRGB nonlinear encoding applied to the RGB components.</li>
            <li>#FORMAT_ASTC_8x5_UNORM_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes an 8x5 rectangle of unsigned normalized RGBA texel data.</li>
            <li>#FORMAT_ASTC_8x5_SRGB_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes an 8x5 rectangle of unsigned normalized RGBA texel data with sRGB nonlinear encoding applied to the RGB components.</li>
            <li>#FORMAT_ASTC_8x6_UNORM_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes an 8x6 rectangle of unsigned normalized RGBA texel data.</li>
            <li>#FORMAT_ASTC_8x6_SRGB_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes an 8x6 rectangle of unsigned normalized RGBA texel data with sRGB nonlinear encoding applied to the RGB components.</li>
            <li>#FORMAT_ASTC_8x8_UNORM_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes an 8x8 rectangle of unsigned normalized RGBA texel data.</li>
            <li>#FORMAT_ASTC_8x8_SRGB_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes an 8x8 rectangle of unsigned normalized RGBA texel data with sRGB nonlinear encoding applied to the RGB components.</li>
            <li>#FORMAT_ASTC_10x5_UNORM_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 10x5 rectangle of unsigned normalized RGBA texel data.</li>
            <li>#FORMAT_ASTC_10x5_SRGB_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 10x5 rectangle of unsigned normalized RGBA texel data with sRGB nonlinear encoding applied to the RGB components.</li>
            <li>#FORMAT_ASTC_10x6_UNORM_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 10x6 rectangle of unsigned normalized RGBA texel data.</li>
            <li>#FORMAT_ASTC_10x6_SRGB_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 10x6 rectangle of unsigned normalized RGBA texel data with sRGB nonlinear encoding applied to the RGB components.</li>
            <li>#FORMAT_ASTC_10x8_UNORM_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 10x8 rectangle of unsigned normalized RGBA texel data.</li>
            <li>#FORMAT_ASTC_10x8_SRGB_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 10x8 rectangle of unsigned normalized RGBA texel data with sRGB nonlinear encoding applied to the RGB components.</li>
            <li>#FORMAT_ASTC_10x10_UNORM_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 10x10 rectangle of unsigned normalized RGBA texel data.</li>
            <li>#FORMAT_ASTC_10x10_SRGB_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 10x10 rectangle of unsigned normalized RGBA texel data with sRGB nonlinear encoding applied to the RGB components.</li>
            <li>#FORMAT_ASTC_12x10_UNORM_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 12x10 rectangle of unsigned normalized RGBA texel data.</li>
            <li>#FORMAT_ASTC_12x10_SRGB_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 12x10 rectangle of unsigned normalized RGBA texel data with sRGB nonlinear encoding applied to the RGB components.</li>
            <li>#FORMAT_ASTC_12x12_UNORM_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 12x12 rectangle of unsigned normalized RGBA texel data.</li>
            <li>#FORMAT_ASTC_12x12_SRGB_BLOCK specifies a four-component, ASTC compressed format where each 128-bit compressed texel block encodes a 12x12 rectangle of unsigned normalized RGBA texel data with sRGB nonlinear encoding applied to the RGB components.</li>
        </ul>

        <h5>See Also</h5>
        ##VkAttachmentDescription, ##VkBufferViewCreateInfo, ##VkImageCreateInfo, ##VkImageViewCreateInfo, ##VkPhysicalDeviceImageFormatInfo2KHR, ##VkPhysicalDeviceSparseImageFormatInfo2KHR, ##VkSurfaceFormatKHR, ##VkSwapchainCreateInfoKHR, ##VkVertexInputAttributeDescription, #GetPhysicalDeviceExternalImageFormatPropertiesNV(), #GetPhysicalDeviceFormatProperties(), #GetPhysicalDeviceFormatProperties2KHR(), #GetPhysicalDeviceImageFormatProperties(), #GetPhysicalDeviceSparseImageFormatProperties()
        """,

        "FORMAT_UNDEFINED".."0",
        "FORMAT_R4G4_UNORM_PACK8".."1",
        "FORMAT_R4G4B4A4_UNORM_PACK16".."2",
        "FORMAT_B4G4R4A4_UNORM_PACK16".."3",
        "FORMAT_R5G6B5_UNORM_PACK16".."4",
        "FORMAT_B5G6R5_UNORM_PACK16".."5",
        "FORMAT_R5G5B5A1_UNORM_PACK16".."6",
        "FORMAT_B5G5R5A1_UNORM_PACK16".."7",
        "FORMAT_A1R5G5B5_UNORM_PACK16".."8",
        "FORMAT_R8_UNORM".."9",
        "FORMAT_R8_SNORM".."10",
        "FORMAT_R8_USCALED".."11",
        "FORMAT_R8_SSCALED".."12",
        "FORMAT_R8_UINT".."13",
        "FORMAT_R8_SINT".."14",
        "FORMAT_R8_SRGB".."15",
        "FORMAT_R8G8_UNORM".."16",
        "FORMAT_R8G8_SNORM".."17",
        "FORMAT_R8G8_USCALED".."18",
        "FORMAT_R8G8_SSCALED".."19",
        "FORMAT_R8G8_UINT".."20",
        "FORMAT_R8G8_SINT".."21",
        "FORMAT_R8G8_SRGB".."22",
        "FORMAT_R8G8B8_UNORM".."23",
        "FORMAT_R8G8B8_SNORM".."24",
        "FORMAT_R8G8B8_USCALED".."25",
        "FORMAT_R8G8B8_SSCALED".."26",
        "FORMAT_R8G8B8_UINT".."27",
        "FORMAT_R8G8B8_SINT".."28",
        "FORMAT_R8G8B8_SRGB".."29",
        "FORMAT_B8G8R8_UNORM".."30",
        "FORMAT_B8G8R8_SNORM".."31",
        "FORMAT_B8G8R8_USCALED".."32",
        "FORMAT_B8G8R8_SSCALED".."33",
        "FORMAT_B8G8R8_UINT".."34",
        "FORMAT_B8G8R8_SINT".."35",
        "FORMAT_B8G8R8_SRGB".."36",
        "FORMAT_R8G8B8A8_UNORM".."37",
        "FORMAT_R8G8B8A8_SNORM".."38",
        "FORMAT_R8G8B8A8_USCALED".."39",
        "FORMAT_R8G8B8A8_SSCALED".."40",
        "FORMAT_R8G8B8A8_UINT".."41",
        "FORMAT_R8G8B8A8_SINT".."42",
        "FORMAT_R8G8B8A8_SRGB".."43",
        "FORMAT_B8G8R8A8_UNORM".."44",
        "FORMAT_B8G8R8A8_SNORM".."45",
        "FORMAT_B8G8R8A8_USCALED".."46",
        "FORMAT_B8G8R8A8_SSCALED".."47",
        "FORMAT_B8G8R8A8_UINT".."48",
        "FORMAT_B8G8R8A8_SINT".."49",
        "FORMAT_B8G8R8A8_SRGB".."50",
        "FORMAT_A8B8G8R8_UNORM_PACK32".."51",
        "FORMAT_A8B8G8R8_SNORM_PACK32".."52",
        "FORMAT_A8B8G8R8_USCALED_PACK32".."53",
        "FORMAT_A8B8G8R8_SSCALED_PACK32".."54",
        "FORMAT_A8B8G8R8_UINT_PACK32".."55",
        "FORMAT_A8B8G8R8_SINT_PACK32".."56",
        "FORMAT_A8B8G8R8_SRGB_PACK32".."57",
        "FORMAT_A2R10G10B10_UNORM_PACK32".."58",
        "FORMAT_A2R10G10B10_SNORM_PACK32".."59",
        "FORMAT_A2R10G10B10_USCALED_PACK32".."60",
        "FORMAT_A2R10G10B10_SSCALED_PACK32".."61",
        "FORMAT_A2R10G10B10_UINT_PACK32".."62",
        "FORMAT_A2R10G10B10_SINT_PACK32".."63",
        "FORMAT_A2B10G10R10_UNORM_PACK32".."64",
        "FORMAT_A2B10G10R10_SNORM_PACK32".."65",
        "FORMAT_A2B10G10R10_USCALED_PACK32".."66",
        "FORMAT_A2B10G10R10_SSCALED_PACK32".."67",
        "FORMAT_A2B10G10R10_UINT_PACK32".."68",
        "FORMAT_A2B10G10R10_SINT_PACK32".."69",
        "FORMAT_R16_UNORM".."70",
        "FORMAT_R16_SNORM".."71",
        "FORMAT_R16_USCALED".."72",
        "FORMAT_R16_SSCALED".."73",
        "FORMAT_R16_UINT".."74",
        "FORMAT_R16_SINT".."75",
        "FORMAT_R16_SFLOAT".."76",
        "FORMAT_R16G16_UNORM".."77",
        "FORMAT_R16G16_SNORM".."78",
        "FORMAT_R16G16_USCALED".."79",
        "FORMAT_R16G16_SSCALED".."80",
        "FORMAT_R16G16_UINT".."81",
        "FORMAT_R16G16_SINT".."82",
        "FORMAT_R16G16_SFLOAT".."83",
        "FORMAT_R16G16B16_UNORM".."84",
        "FORMAT_R16G16B16_SNORM".."85",
        "FORMAT_R16G16B16_USCALED".."86",
        "FORMAT_R16G16B16_SSCALED".."87",
        "FORMAT_R16G16B16_UINT".."88",
        "FORMAT_R16G16B16_SINT".."89",
        "FORMAT_R16G16B16_SFLOAT".."90",
        "FORMAT_R16G16B16A16_UNORM".."91",
        "FORMAT_R16G16B16A16_SNORM".."92",
        "FORMAT_R16G16B16A16_USCALED".."93",
        "FORMAT_R16G16B16A16_SSCALED".."94",
        "FORMAT_R16G16B16A16_UINT".."95",
        "FORMAT_R16G16B16A16_SINT".."96",
        "FORMAT_R16G16B16A16_SFLOAT".."97",
        "FORMAT_R32_UINT".."98",
        "FORMAT_R32_SINT".."99",
        "FORMAT_R32_SFLOAT".."100",
        "FORMAT_R32G32_UINT".."101",
        "FORMAT_R32G32_SINT".."102",
        "FORMAT_R32G32_SFLOAT".."103",
        "FORMAT_R32G32B32_UINT".."104",
        "FORMAT_R32G32B32_SINT".."105",
        "FORMAT_R32G32B32_SFLOAT".."106",
        "FORMAT_R32G32B32A32_UINT".."107",
        "FORMAT_R32G32B32A32_SINT".."108",
        "FORMAT_R32G32B32A32_SFLOAT".."109",
        "FORMAT_R64_UINT".."110",
        "FORMAT_R64_SINT".."111",
        "FORMAT_R64_SFLOAT".."112",
        "FORMAT_R64G64_UINT".."113",
        "FORMAT_R64G64_SINT".."114",
        "FORMAT_R64G64_SFLOAT".."115",
        "FORMAT_R64G64B64_UINT".."116",
        "FORMAT_R64G64B64_SINT".."117",
        "FORMAT_R64G64B64_SFLOAT".."118",
        "FORMAT_R64G64B64A64_UINT".."119",
        "FORMAT_R64G64B64A64_SINT".."120",
        "FORMAT_R64G64B64A64_SFLOAT".."121",
        "FORMAT_B10G11R11_UFLOAT_PACK32".."122",
        "FORMAT_E5B9G9R9_UFLOAT_PACK32".."123",
        "FORMAT_D16_UNORM".."124",
        "FORMAT_X8_D24_UNORM_PACK32".."125",
        "FORMAT_D32_SFLOAT".."126",
        "FORMAT_S8_UINT".."127",
        "FORMAT_D16_UNORM_S8_UINT".."128",
        "FORMAT_D24_UNORM_S8_UINT".."129",
        "FORMAT_D32_SFLOAT_S8_UINT".."130",
        "FORMAT_BC1_RGB_UNORM_BLOCK".."131",
        "FORMAT_BC1_RGB_SRGB_BLOCK".."132",
        "FORMAT_BC1_RGBA_UNORM_BLOCK".."133",
        "FORMAT_BC1_RGBA_SRGB_BLOCK".."134",
        "FORMAT_BC2_UNORM_BLOCK".."135",
        "FORMAT_BC2_SRGB_BLOCK".."136",
        "FORMAT_BC3_UNORM_BLOCK".."137",
        "FORMAT_BC3_SRGB_BLOCK".."138",
        "FORMAT_BC4_UNORM_BLOCK".."139",
        "FORMAT_BC4_SNORM_BLOCK".."140",
        "FORMAT_BC5_UNORM_BLOCK".."141",
        "FORMAT_BC5_SNORM_BLOCK".."142",
        "FORMAT_BC6H_UFLOAT_BLOCK".."143",
        "FORMAT_BC6H_SFLOAT_BLOCK".."144",
        "FORMAT_BC7_UNORM_BLOCK".."145",
        "FORMAT_BC7_SRGB_BLOCK".."146",
        "FORMAT_ETC2_R8G8B8_UNORM_BLOCK".."147",
        "FORMAT_ETC2_R8G8B8_SRGB_BLOCK".."148",
        "FORMAT_ETC2_R8G8B8A1_UNORM_BLOCK".."149",
        "FORMAT_ETC2_R8G8B8A1_SRGB_BLOCK".."150",
        "FORMAT_ETC2_R8G8B8A8_UNORM_BLOCK".."151",
        "FORMAT_ETC2_R8G8B8A8_SRGB_BLOCK".."152",
        "FORMAT_EAC_R11_UNORM_BLOCK".."153",
        "FORMAT_EAC_R11_SNORM_BLOCK".."154",
        "FORMAT_EAC_R11G11_UNORM_BLOCK".."155",
        "FORMAT_EAC_R11G11_SNORM_BLOCK".."156",
        "FORMAT_ASTC_4x4_UNORM_BLOCK".."157",
        "FORMAT_ASTC_4x4_SRGB_BLOCK".."158",
        "FORMAT_ASTC_5x4_UNORM_BLOCK".."159",
        "FORMAT_ASTC_5x4_SRGB_BLOCK".."160",
        "FORMAT_ASTC_5x5_UNORM_BLOCK".."161",
        "FORMAT_ASTC_5x5_SRGB_BLOCK".."162",
        "FORMAT_ASTC_6x5_UNORM_BLOCK".."163",
        "FORMAT_ASTC_6x5_SRGB_BLOCK".."164",
        "FORMAT_ASTC_6x6_UNORM_BLOCK".."165",
        "FORMAT_ASTC_6x6_SRGB_BLOCK".."166",
        "FORMAT_ASTC_8x5_UNORM_BLOCK".."167",
        "FORMAT_ASTC_8x5_SRGB_BLOCK".."168",
        "FORMAT_ASTC_8x6_UNORM_BLOCK".."169",
        "FORMAT_ASTC_8x6_SRGB_BLOCK".."170",
        "FORMAT_ASTC_8x8_UNORM_BLOCK".."171",
        "FORMAT_ASTC_8x8_SRGB_BLOCK".."172",
        "FORMAT_ASTC_10x5_UNORM_BLOCK".."173",
        "FORMAT_ASTC_10x5_SRGB_BLOCK".."174",
        "FORMAT_ASTC_10x6_UNORM_BLOCK".."175",
        "FORMAT_ASTC_10x6_SRGB_BLOCK".."176",
        "FORMAT_ASTC_10x8_UNORM_BLOCK".."177",
        "FORMAT_ASTC_10x8_SRGB_BLOCK".."178",
        "FORMAT_ASTC_10x10_UNORM_BLOCK".."179",
        "FORMAT_ASTC_10x10_SRGB_BLOCK".."180",
        "FORMAT_ASTC_12x10_UNORM_BLOCK".."181",
        "FORMAT_ASTC_12x10_SRGB_BLOCK".."182",
        "FORMAT_ASTC_12x12_UNORM_BLOCK".."183",
        "FORMAT_ASTC_12x12_SRGB_BLOCK".."184"
    )

    EnumConstant(
        """
        VkFormatFeatureFlagBits - Bitmask specifying features supported by a buffer

        <h5>Description</h5>
        The following bits <b>may</b> be set in {@code linearTilingFeatures} and {@code optimalTilingFeatures}, specifying that the features are supported by <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkImage">images</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkImageView">image views</a> created with the queried #GetPhysicalDeviceFormatProperties(){@code ::format}:

        <ul>
            <li>#FORMAT_FEATURE_SAMPLED_IMAGE_BIT specifies that an image view <b>can</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#descriptorsets-sampledimage">sampled from</a>.</li>
            <li>#FORMAT_FEATURE_STORAGE_IMAGE_BIT specifies that an image view <b>can</b> be used as a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#descriptorsets-storageimage">storage images</a>.</li>
            <li>#FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT specifies that an image view <b>can</b> be used as storage image that supports atomic operations.</li>
            <li>#FORMAT_FEATURE_COLOR_ATTACHMENT_BIT specifies that an image view <b>can</b> be used as a framebuffer color attachment and as an input attachment.</li>
            <li>#FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT specifies that an image view <b>can</b> be used as a framebuffer color attachment that supports blending and as an input attachment.</li>
            <li>#FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT specifies that an image view <b>can</b> be used as a framebuffer depth/stencil attachment and as an input attachment.</li>
            <li>#FORMAT_FEATURE_BLIT_SRC_BIT specifies that an image <b>can</b> be used as {@code srcImage} for the #CmdBlitImage() command.</li>
            <li>#FORMAT_FEATURE_BLIT_DST_BIT specifies that an image <b>can</b> be used as {@code dstImage} for the #CmdBlitImage() command.</li>
            <li>
                #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT specifies that if #FORMAT_FEATURE_SAMPLED_IMAGE_BIT is also set, an image view <b>can</b> be used with a sampler that has either of {@code magFilter} or {@code minFilter} set to #FILTER_LINEAR, or {@code mipmapMode} set to #SAMPLER_MIPMAP_MODE_LINEAR. If #FORMAT_FEATURE_BLIT_SRC_BIT is also set, an image can be used as the {@code srcImage} to #CmdBlitImage() with a {@code filter} of #FILTER_LINEAR. This bit <b>must</b> only be exposed for formats that also support the #FORMAT_FEATURE_SAMPLED_IMAGE_BIT or #FORMAT_FEATURE_BLIT_SRC_BIT.
                If the format being queried is a depth/stencil format, this bit only indicates that the depth aspect (not the stencil aspect) of an image of this format supports linear filtering, and that linear filtering of the depth aspect is supported whether depth compare is enabled in the sampler or not. If this bit is not present, linear filtering with depth compare disabled is unsupported and linear filtering with depth compare enabled is supported, but <b>may</b> compute the filtered value in an implementation-dependent manner which differs from the normal rules of linear filtering. The resulting value <b>must</b> be in the range <code>[0,1]</code> and <b>should</b> be proportional to, or a weighted average of, the number of comparison passes or failures.
            </li>
            <li>#FORMAT_FEATURE_TRANSFER_SRC_BIT_KHR specifies that an image <b>can</b> be used as a source image for <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#copies">copy commands</a>.</li>
            <li>
                #FORMAT_FEATURE_TRANSFER_DST_BIT_KHR specifies that an image <b>can</b> be used as a destination image for <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#copies">copy commands</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#clears">clear commands</a>.
                <dl>
            <dt>#FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG</dt>
                    <dd>{@code VkImage} <b>can</b> be used with a sampler that has either of {@code magFilter} or {@code minFilter} set to #FILTER_CUBIC_IMG, or be the source image for a blit with {@code filter} set to #FILTER_CUBIC_IMG. This bit <b>must</b> only be exposed for formats that also support the #FORMAT_FEATURE_SAMPLED_IMAGE_BIT. If the format being queried is a depth/stencil format, this only indicates that the depth aspect is cubic filterable.</dd>
                </dl>
            </li>
        </ul>

        The following bits <b>may</b> be set in {@code bufferFeatures}, specifying that the features are supported by <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkBuffer">buffers</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkBufferView">buffer views</a> created with the queried #GetPhysicalDeviceProperties(){@code ::format}:

        <ul>
            <li>#FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT specifies that the format <b>can</b> be used to create a buffer view that <b>can</b> be bound to a #DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER descriptor.</li>
            <li>#FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT specifies that the format <b>can</b> be used to create a buffer view that <b>can</b> be bound to a #DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER descriptor.</li>
            <li>#FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT specifies that atomic operations are supported on #DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER with this format.</li>
            <li>#FORMAT_FEATURE_VERTEX_BUFFER_BIT specifies that the format <b>can</b> be used as a vertex attribute format (##VkVertexInputAttributeDescription{@code ::format}).</li>
        </ul>

        <h5>See Also</h5>
        {@code VkFormatFeatureFlags}
        """,

        "FORMAT_FEATURE_SAMPLED_IMAGE_BIT".enum(0x00000001),
        "FORMAT_FEATURE_STORAGE_IMAGE_BIT".enum(0x00000002),
        "FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT".enum(0x00000004),
        "FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT".enum(0x00000008),
        "FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT".enum(0x00000010),
        "FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT".enum(0x00000020),
        "FORMAT_FEATURE_VERTEX_BUFFER_BIT".enum(0x00000040),
        "FORMAT_FEATURE_COLOR_ATTACHMENT_BIT".enum(0x00000080),
        "FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT".enum(0x00000100),
        "FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT".enum(0x00000200),
        "FORMAT_FEATURE_BLIT_SRC_BIT".enum(0x00000400),
        "FORMAT_FEATURE_BLIT_DST_BIT".enum(0x00000800),
        "FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT".enum(0x00001000)
    )

    EnumConstant(
        """
        VkImageType - Specifies the type of an image object

        <h5>Description</h5>
        <ul>
            <li>#IMAGE_TYPE_1D specifies a one-dimensional image.</li>
            <li>#IMAGE_TYPE_2D specifies a two-dimensional image.</li>
            <li>#IMAGE_TYPE_3D specifies a three-dimensional image.</li>
        </ul>

        <h5>See Also</h5>
        ##VkImageCreateInfo, ##VkPhysicalDeviceImageFormatInfo2KHR, ##VkPhysicalDeviceSparseImageFormatInfo2KHR, #GetPhysicalDeviceExternalImageFormatPropertiesNV(), #GetPhysicalDeviceImageFormatProperties(), #GetPhysicalDeviceSparseImageFormatProperties()
        """,

        "IMAGE_TYPE_1D".."0",
        "IMAGE_TYPE_2D".."1",
        "IMAGE_TYPE_3D".."2"
    )

    EnumConstant(
        """
        VkImageTiling - Specifies the tiling arrangement of data in an image

        <h5>Description</h5>
        <ul>
            <li>#IMAGE_TILING_OPTIMAL specifies optimal tiling (texels are laid out in an implementation-dependent arrangement, for more optimal memory access).</li>
            <li>#IMAGE_TILING_LINEAR specifies linear tiling (texels are laid out in memory in row-major order, possibly with some padding on each row).</li>
        </ul>

        <h5>See Also</h5>
        ##VkImageCreateInfo, ##VkPhysicalDeviceImageFormatInfo2KHR, ##VkPhysicalDeviceSparseImageFormatInfo2KHR, #GetPhysicalDeviceExternalImageFormatPropertiesNV(), #GetPhysicalDeviceImageFormatProperties(), #GetPhysicalDeviceSparseImageFormatProperties()
        """,

        "IMAGE_TILING_OPTIMAL".."0",
        "IMAGE_TILING_LINEAR".."1"
    )

    EnumConstant(
        """
        VkImageUsageFlagBits - Bitmask specifying intended usage of an image

        <h5>Description</h5>
        <ul>
            <li>#IMAGE_USAGE_TRANSFER_SRC_BIT specifies that the image <b>can</b> be used as the source of a transfer command.</li>
            <li>#IMAGE_USAGE_TRANSFER_DST_BIT specifies that the image <b>can</b> be used as the destination of a transfer command.</li>
            <li>#IMAGE_USAGE_SAMPLED_BIT specifies that the image <b>can</b> be used to create a {@code VkImageView} suitable for occupying a {@code VkDescriptorSet} slot either of type #DESCRIPTOR_TYPE_SAMPLED_IMAGE or #DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER, and be sampled by a shader.</li>
            <li>#IMAGE_USAGE_STORAGE_BIT specifies that the image <b>can</b> be used to create a {@code VkImageView} suitable for occupying a {@code VkDescriptorSet} slot of type #DESCRIPTOR_TYPE_STORAGE_IMAGE.</li>
            <li>#IMAGE_USAGE_COLOR_ATTACHMENT_BIT specifies that the image <b>can</b> be used to create a {@code VkImageView} suitable for use as a color or resolve attachment in a {@code VkFramebuffer}.</li>
            <li>#IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT specifies that the image <b>can</b> be used to create a {@code VkImageView} suitable for use as a depth/stencil attachment in a {@code VkFramebuffer}.</li>
            <li>#IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT specifies that the memory bound to this image will have been allocated with the #MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT (see <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#memory">the “Memory Allocation” chapter</a> for more detail). This bit <b>can</b> be set for any image that <b>can</b> be used to create a {@code VkImageView} suitable for use as a color, resolve, depth/stencil, or input attachment.</li>
            <li>#IMAGE_USAGE_INPUT_ATTACHMENT_BIT specifies that the image <b>can</b> be used to create a {@code VkImageView} suitable for occupying {@code VkDescriptorSet} slot of type #DESCRIPTOR_TYPE_INPUT_ATTACHMENT; be read from a shader as an input attachment; and be used as an input attachment in a framebuffer.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkImageUsageFlags}
        """,

        "IMAGE_USAGE_TRANSFER_SRC_BIT".enum(0x00000001),
        "IMAGE_USAGE_TRANSFER_DST_BIT".enum(0x00000002),
        "IMAGE_USAGE_SAMPLED_BIT".enum(0x00000004),
        "IMAGE_USAGE_STORAGE_BIT".enum(0x00000008),
        "IMAGE_USAGE_COLOR_ATTACHMENT_BIT".enum(0x00000010),
        "IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT".enum(0x00000020),
        "IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT".enum(0x00000040),
        "IMAGE_USAGE_INPUT_ATTACHMENT_BIT".enum(0x00000080)
    )

    EnumConstant(
        """
        VkImageCreateFlagBits - Bitmask specifying additional parameters of an image

        <h5>Description</h5>
        <ul>
            <li>#IMAGE_CREATE_SPARSE_BINDING_BIT specifies that the image will be backed using sparse memory binding.</li>
            <li>#IMAGE_CREATE_SPARSE_RESIDENCY_BIT specifies that the image <b>can</b> be partially backed using sparse memory binding. Images created with this flag <b>must</b> also be created with the #IMAGE_CREATE_SPARSE_BINDING_BIT flag.</li>
            <li>#IMAGE_CREATE_SPARSE_ALIASED_BIT specifies that the image will be backed using sparse memory binding with memory ranges that might also simultaneously be backing another image (or another portion of the same image). Images created with this flag <b>must</b> also be created with the #IMAGE_CREATE_SPARSE_BINDING_BIT flag</li>
            <li>#IMAGE_CREATE_MUTABLE_FORMAT_BIT specifies that the image <b>can</b> be used to create a {@code VkImageView} with a different format from the image.</li>
            <li>#IMAGE_CREATE_CUBE_COMPATIBLE_BIT specifies that the image <b>can</b> be used to create a {@code VkImageView} of type #IMAGE_VIEW_TYPE_CUBE or #IMAGE_VIEW_TYPE_CUBE_ARRAY.</li>
            <li>#IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT_KHR specifies that the image <b>can</b> be used to create a {@code VkImageView} of type #IMAGE_VIEW_TYPE_2D or #IMAGE_VIEW_TYPE_2D_ARRAY.</li>
            <li>#IMAGE_CREATE_BIND_SFR_BIT_KHX specifies that the image <b>can</b> be used with a non-zero value of the {@code SFRRectCount} member of the ##VkBindImageMemoryInfoKHX structure passed into #BindImageMemory2KHX(). This flag also has the effect of making the image use the standard sparse image block dimensions.</li>
        </ul>

        If any of the bits #IMAGE_CREATE_SPARSE_BINDING_BIT, #IMAGE_CREATE_SPARSE_RESIDENCY_BIT, or #IMAGE_CREATE_SPARSE_ALIASED_BIT are set, #IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT <b>must</b> not also be set.

        See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#sparsememory-sparseresourcefeatures">Sparse Resource Features</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#sparsememory-physicalfeatures">Sparse Physical Device Features</a> for more details.

        <h5>See Also</h5>
        {@code VkImageCreateFlags}
        """,

        "IMAGE_CREATE_SPARSE_BINDING_BIT".enum(0x00000001),
        "IMAGE_CREATE_SPARSE_RESIDENCY_BIT".enum(0x00000002),
        "IMAGE_CREATE_SPARSE_ALIASED_BIT".enum(0x00000004),
        "IMAGE_CREATE_MUTABLE_FORMAT_BIT".enum(0x00000008),
        "IMAGE_CREATE_CUBE_COMPATIBLE_BIT".enum(0x00000010)
    )

    EnumConstant(
        """
        VkSampleCountFlagBits - Bitmask specifying sample counts supported for an image used for storage operations

        <h5>Description</h5>
        <ul>
            <li>#SAMPLE_COUNT_1_BIT specifies an image with one sample per pixel.</li>
            <li>#SAMPLE_COUNT_2_BIT specifies an image with 2 samples per pixel.</li>
            <li>#SAMPLE_COUNT_4_BIT specifies an image with 4 samples per pixel.</li>
            <li>#SAMPLE_COUNT_8_BIT specifies an image with 8 samples per pixel.</li>
            <li>#SAMPLE_COUNT_16_BIT specifies an image with 16 samples per pixel.</li>
            <li>#SAMPLE_COUNT_32_BIT specifies an image with 32 samples per pixel.</li>
            <li>#SAMPLE_COUNT_64_BIT specifies an image with 64 samples per pixel.</li>
        </ul>

        <h5>See Also</h5>
        ##VkAttachmentDescription, ##VkImageCreateInfo, ##VkPhysicalDeviceSparseImageFormatInfo2KHR, ##VkPipelineMultisampleStateCreateInfo, {@code VkSampleCountFlags}, #GetPhysicalDeviceSparseImageFormatProperties()
        """,

        "SAMPLE_COUNT_1_BIT".enum(0x00000001),
        "SAMPLE_COUNT_2_BIT".enum(0x00000002),
        "SAMPLE_COUNT_4_BIT".enum(0x00000004),
        "SAMPLE_COUNT_8_BIT".enum(0x00000008),
        "SAMPLE_COUNT_16_BIT".enum(0x00000010),
        "SAMPLE_COUNT_32_BIT".enum(0x00000020),
        "SAMPLE_COUNT_64_BIT".enum(0x00000040)
    )

    EnumConstant(
        """
        VkPhysicalDeviceType - Supported physical device types

        <h5>Description</h5>
        <ul>
            <li>#PHYSICAL_DEVICE_TYPE_OTHER - the device does not match any other available types.</li>
            <li>#PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU - the device is typically one embedded in or tightly coupled with the host.</li>
            <li>#PHYSICAL_DEVICE_TYPE_DISCRETE_GPU - the device is typically a separate processor connected to the host via an interlink.</li>
            <li>#PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU - the device is typically a virtual node in a virtualization environment.</li>
            <li>#PHYSICAL_DEVICE_TYPE_CPU - the device is typically running on the same processors as the host.</li>
        </ul>

        The physical device type is advertised for informational purposes only, and does not directly affect the operation of the system. However, the device type <b>may</b> correlate with other advertised properties or capabilities of the system, such as how many memory heaps there are.

        <h5>See Also</h5>
        ##VkPhysicalDeviceProperties
        """,

        "PHYSICAL_DEVICE_TYPE_OTHER".."0",
        "PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU".."1",
        "PHYSICAL_DEVICE_TYPE_DISCRETE_GPU".."2",
        "PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU".."3",
        "PHYSICAL_DEVICE_TYPE_CPU".."4"
    )

    EnumConstant(
        """
        VkQueueFlagBits - Bitmask specifying capabilities of queues in a queue family

        <h5>Description</h5>
        <ul>
            <li>#QUEUE_GRAPHICS_BIT indicates that queues in this queue family support graphics operations.</li>
            <li>#QUEUE_COMPUTE_BIT indicates that queues in this queue family support compute operations.</li>
            <li>#QUEUE_TRANSFER_BIT indicates that queues in this queue family support transfer operations.</li>
            <li>#QUEUE_SPARSE_BINDING_BIT indicates that queues in this queue family support sparse memory management operations (see <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#sparsememory">Sparse Resources</a>). If any of the sparse resource features are enabled, then at least one queue family <b>must</b> support this bit.</li>
        </ul>

        If an implementation exposes any queue family that supports graphics operations, at least one queue family of at least one physical device exposed by the implementation <b>must</b> support both graphics and compute operations.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        All commands that are allowed on a queue that supports transfer operations are also allowed on a queue that supports either graphics or compute operations. Thus, if the capabilities of a queue family include #QUEUE_GRAPHICS_BIT or #QUEUE_COMPUTE_BIT, then reporting the #QUEUE_TRANSFER_BIT capability separately for that queue family is optional:.
        </div>

        For further details see <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#devsandqueues-queues">Queues</a>.

        <h5>See Also</h5>
        {@code VkQueueFlags}
        """,

        "QUEUE_GRAPHICS_BIT".enum(0x00000001),
        "QUEUE_COMPUTE_BIT".enum(0x00000002),
        "QUEUE_TRANSFER_BIT".enum(0x00000004),
        "QUEUE_SPARSE_BINDING_BIT".enum(0x00000008)
    )

    EnumConstant(
        """
        VkMemoryPropertyFlagBits - Bitmask specifying properties for a memory type

        <h5>Description</h5>
        <ul>
            <li>#MEMORY_PROPERTY_DEVICE_LOCAL_BIT bit indicates that memory allocated with this type is the most efficient for device access. This property will only be set for memory types belonging to heaps with the #MEMORY_HEAP_DEVICE_LOCAL_BIT set.</li>
            <li>#MEMORY_PROPERTY_HOST_VISIBLE_BIT bit indicates that memory allocated with this type <b>can</b> be mapped for host access using #MapMemory().</li>
            <li>#MEMORY_PROPERTY_HOST_COHERENT_BIT bit indicates that the host cache management commands #FlushMappedMemoryRanges() and #InvalidateMappedMemoryRanges() are not needed to flush host writes to the device or make device writes visible to the host, respectively.</li>
            <li>#MEMORY_PROPERTY_HOST_CACHED_BIT bit indicates that memory allocated with this type is cached on the host. Host memory accesses to uncached memory are slower than to cached memory, however uncached memory is always host coherent.</li>
            <li>#MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT bit indicates that the memory type only allows device access to the memory. Memory types <b>must</b> not have both #MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT and #MEMORY_PROPERTY_HOST_VISIBLE_BIT set. Additionally, the object&#8217;s backing memory <b>may</b> be provided by the implementation lazily as specified in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#memory-device-lazy_allocation">Lazily Allocated Memory</a>.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkMemoryPropertyFlags}
        """,

        "MEMORY_PROPERTY_DEVICE_LOCAL_BIT".enum(0x00000001),
        "MEMORY_PROPERTY_HOST_VISIBLE_BIT".enum(0x00000002),
        "MEMORY_PROPERTY_HOST_COHERENT_BIT".enum(0x00000004),
        "MEMORY_PROPERTY_HOST_CACHED_BIT".enum(0x00000008),
        "MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT".enum(0x00000010)
    )

    EnumConstant(
        """
        VkMemoryHeapFlagBits - Bitmask specifying attribute flags for a heap

        <h5>Description</h5>
        <ul>
            <li>#MEMORY_HEAP_DEVICE_LOCAL_BIT indicates that the heap corresponds to device local memory. Device local memory <b>may</b> have different performance characteristics than host local memory, and <b>may</b> support different memory property flags.</li>
            <li>#MEMORY_HEAP_MULTI_INSTANCE_BIT_KHX indicates that in a logical device representing more than one physical device, there is a per-physical device instance of the heap memory. By default, an allocation from such a heap will be replicated to each physical device&#8217;s instance of the heap.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkMemoryHeapFlags}
        """,

        "MEMORY_HEAP_DEVICE_LOCAL_BIT".enum(0x00000001)
    )

    EnumConstant(
        """
        VkPipelineStageFlagBits - Bitmask specifying pipeline stages

        <h5>Description</h5>
        <ul>
            <li>#PIPELINE_STAGE_TOP_OF_PIPE_BIT specifies the stage of the pipeline where any commands are initially received by the queue.</li>
            <li>#PIPELINE_STAGE_COMMAND_PROCESS_BIT_NVX specifies the stage of the pipeline where device-side generation of commands via #CmdProcessCommandsNVX() is handled.</li>
            <li>#PIPELINE_STAGE_DRAW_INDIRECT_BIT specifies the stage of the pipeline where Draw/DispatchIndirect data structures are consumed. This stage also includes reading commands written by #CmdProcessCommandsNVX().</li>
            <li>#PIPELINE_STAGE_VERTEX_INPUT_BIT specifies the stage of the pipeline where vertex and index buffers are consumed.</li>
            <li>#PIPELINE_STAGE_VERTEX_SHADER_BIT specifies the vertex shader stage.</li>
            <li>#PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT specifies the tessellation control shader stage.</li>
            <li>#PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT specifies the tessellation evaluation shader stage.</li>
            <li>#PIPELINE_STAGE_GEOMETRY_SHADER_BIT specifies the geometry shader stage.</li>
            <li>#PIPELINE_STAGE_FRAGMENT_SHADER_BIT specifies the fragment shader stage.</li>
            <li>#PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT specifies the stage of the pipeline where early fragment tests (depth and stencil tests before fragment shading) are performed. This stage also includes <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#renderpass-load-store-ops">subpass load operations</a> for framebuffer attachments with a depth/stencil format.</li>
            <li>#PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT specifies the stage of the pipeline where late fragment tests (depth and stencil tests after fragment shading) are performed. This stage also includes <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#renderpass-load-store-ops">subpass store operations</a> for framebuffer attachments with a depth/stencil format.</li>
            <li>#PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT specifies the stage of the pipeline after blending where the final color values are output from the pipeline. This stage also includes <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#renderpass-load-store-ops">subpass load and store operations</a> and multisample resolve operations for framebuffer attachments with a color format.</li>
            <li>#PIPELINE_STAGE_TRANSFER_BIT specifies the execution of copy commands. This includes the operations resulting from all <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#copies">copy commands</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#clears">clear commands</a> (with the exception of #CmdClearAttachments()), and #CmdCopyQueryPoolResults().</li>
            <li>#PIPELINE_STAGE_COMPUTE_SHADER_BIT specifies the execution of a compute shader.</li>
            <li>#PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT specifies the final stage in the pipeline where operations generated by all commands complete execution.</li>
            <li>#PIPELINE_STAGE_HOST_BIT specifies a pseudo-stage indicating execution on the host of reads/writes of device memory. This stage is not invoked by any commands recorded in a command buffer.</li>
            <li>
                #PIPELINE_STAGE_ALL_GRAPHICS_BIT specifies the execution of all graphics pipeline stages, and is equivalent to the logical OR of:
                <ul>
                    <li>#PIPELINE_STAGE_TOP_OF_PIPE_BIT</li>
                    <li>#PIPELINE_STAGE_DRAW_INDIRECT_BIT</li>
                    <li>#PIPELINE_STAGE_VERTEX_INPUT_BIT</li>
                    <li>#PIPELINE_STAGE_VERTEX_SHADER_BIT</li>
                    <li>#PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT</li>
                    <li>#PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT</li>
                    <li>#PIPELINE_STAGE_GEOMETRY_SHADER_BIT</li>
                    <li>#PIPELINE_STAGE_FRAGMENT_SHADER_BIT</li>
                    <li>#PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT</li>
                    <li>#PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT</li>
                    <li>#PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT</li>
                    <li>#PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT</li>
                </ul>
            </li>
            <li>#PIPELINE_STAGE_ALL_COMMANDS_BIT is equivalent to the logical OR of every other pipeline stage flag that is supported on the queue it is used with.</li>
        </ul>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        An execution dependency with only #PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT in the destination stage mask will only prevent that stage from executing in subsequently submitted commands. As this stage does not perform any actual execution, this is not observable - in effect, it does not delay processing of subsequent commands. Similarly an execution dependency with only #PIPELINE_STAGE_TOP_OF_PIPE_BIT in the source stage mask will effectively not wait for any prior commands to complete.

        When defining a memory dependency, using only #PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT or #PIPELINE_STAGE_TOP_OF_PIPE_BIT would never make any accesses available and/or visible because these stages do not access memory.

        #PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT and #PIPELINE_STAGE_TOP_OF_PIPE_BIT are useful for accomplishing layout transitions and queue ownership operations when the required execution dependency is satisfied by other means - for example, semaphore operations between queues.
        </div>

        <h5>See Also</h5>
        {@code VkPipelineStageFlags}, #CmdWriteTimestamp()
        """,

        "PIPELINE_STAGE_TOP_OF_PIPE_BIT".enum(0x00000001),
        "PIPELINE_STAGE_DRAW_INDIRECT_BIT".enum(0x00000002),
        "PIPELINE_STAGE_VERTEX_INPUT_BIT".enum(0x00000004),
        "PIPELINE_STAGE_VERTEX_SHADER_BIT".enum(0x00000008),
        "PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT".enum(0x00000010),
        "PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT".enum(0x00000020),
        "PIPELINE_STAGE_GEOMETRY_SHADER_BIT".enum(0x00000040),
        "PIPELINE_STAGE_FRAGMENT_SHADER_BIT".enum(0x00000080),
        "PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT".enum(0x00000100),
        "PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT".enum(0x00000200),
        "PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT".enum(0x00000400),
        "PIPELINE_STAGE_COMPUTE_SHADER_BIT".enum(0x00000800),
        "PIPELINE_STAGE_TRANSFER_BIT".enum(0x00001000),
        "PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT".enum(0x00002000),
        "PIPELINE_STAGE_HOST_BIT".enum(0x00004000),
        "PIPELINE_STAGE_ALL_GRAPHICS_BIT".enum(0x00008000),
        "PIPELINE_STAGE_ALL_COMMANDS_BIT".enum(0x00010000)
    )

    EnumConstant(
        """
        VkImageAspectFlagBits - Bitmask specifying which aspects of an image are included in a view

        <h5>Description</h5>
        <ul>
            <li>#IMAGE_ASPECT_COLOR_BIT specifies the color aspect.</li>
            <li>#IMAGE_ASPECT_DEPTH_BIT specifies the depth aspect.</li>
            <li>#IMAGE_ASPECT_STENCIL_BIT specifies the stencil aspect.</li>
            <li>#IMAGE_ASPECT_METADATA_BIT specifies the metadata aspect, used for sparse <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#sparsememory">sparse resource</a> operations.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkImageAspectFlags}
        """,

        "IMAGE_ASPECT_COLOR_BIT".enum(0x00000001),
        "IMAGE_ASPECT_DEPTH_BIT".enum(0x00000002),
        "IMAGE_ASPECT_STENCIL_BIT".enum(0x00000004),
        "IMAGE_ASPECT_METADATA_BIT".enum(0x00000008)
    )

    EnumConstant(
        """
        VkSparseImageFormatFlagBits - Bitmask specifying additional information about a sparse image resource

        <h5>Description</h5>
        <ul>
            <li>#SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT specifies that the image uses a single mip tail region for all array layers.</li>
            <li>#SPARSE_IMAGE_FORMAT_ALIGNED_MIP_SIZE_BIT specifies that the first mip level whose dimensions are not integer multiples of the corresponding dimensions of the sparse image block begins the mip tail region.</li>
            <li>#SPARSE_IMAGE_FORMAT_NONSTANDARD_BLOCK_SIZE_BIT specifies that the image uses non-standard sparse image block dimensions, and the {@code imageGranularity} values do not match the standard sparse image block dimensions for the given pixel format.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkSparseImageFormatFlags}
        """,

        "SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT".enum(0x00000001),
        "SPARSE_IMAGE_FORMAT_ALIGNED_MIP_SIZE_BIT".enum(0x00000002),
        "SPARSE_IMAGE_FORMAT_NONSTANDARD_BLOCK_SIZE_BIT".enum(0x00000004)
    )

    EnumConstant(
        """
        VkSparseMemoryBindFlagBits - Bitmask specifying usage of a sparse memory binding operation

        <h5>Description</h5>
        <ul>
            <li>#SPARSE_MEMORY_BIND_METADATA_BIT specifies that the memory being bound is only for the metadata aspect.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkSparseMemoryBindFlags}
        """,

        "SPARSE_MEMORY_BIND_METADATA_BIT".enum(0x00000001)
    )

    EnumConstant(
        """
        VkFenceCreateFlagBits - Bitmask specifying initial state and behavior of a fence

        <h5>Description</h5>
        <ul>
            <li>#FENCE_CREATE_SIGNALED_BIT specifies that the fence object is created in the signaled state. Otherwise, it is created in the unsignaled state.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkFenceCreateFlags}
        """,

        "FENCE_CREATE_SIGNALED_BIT".enum(0x00000001)
    )

    EnumConstant(
        """
        VkQueryType - Specify the type of queries managed by a query pool

        <h5>Description</h5>
        <ul>
            <li>#QUERY_TYPE_OCCLUSION specifies an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#queries-occlusion">occlusion query</a>.</li>
            <li>#QUERY_TYPE_PIPELINE_STATISTICS specifies a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#queries-pipestats">pipeline statistics query</a>.</li>
            <li>#QUERY_TYPE_TIMESTAMP specifies a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#queries-timestamps">timestamp query</a>.</li>
        </ul>

        <h5>See Also</h5>
        ##VkQueryPoolCreateInfo
        """,

        "QUERY_TYPE_OCCLUSION".."0",
        "QUERY_TYPE_PIPELINE_STATISTICS".."1",
        "QUERY_TYPE_TIMESTAMP".."2"
    )

    EnumConstant(
        """
        VkQueryPipelineStatisticFlagBits - Bitmask specifying queried pipeline statistics

        <h5>Description</h5>
        <ul>
            <li>#QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_VERTICES_BIT specifies that queries managed by the pool will count the number of vertices processed by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#drawing">input assembly</a> stage. Vertices corresponding to incomplete primitives <b>may</b> contribute to the count.</li>
            <li>#QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_PRIMITIVES_BIT specifies that queries managed by the pool will count the number of primitives processed by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#drawing">input assembly</a> stage. If primitive restart is enabled, restarting the primitive topology has no effect on the count. Incomplete primitives <b>may</b> be counted.</li>
            <li>#QUERY_PIPELINE_STATISTIC_VERTEX_SHADER_INVOCATIONS_BIT specifies that queries managed by the pool will count the number of vertex shader invocations. This counter&#8217;s value is incremented each time a vertex shader is <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#shaders-vertex-execution">invoked</a>.</li>
            <li>#QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_INVOCATIONS_BIT specifies that queries managed by the pool will count the number of geometry shader invocations. This counter&#8217;s value is incremented each time a geometry shader is <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#shaders-geometry-execution">invoked</a>. In the case of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#geometry-invocations">instanced geometry shaders</a>, the geometry shader invocations count is incremented for each separate instanced invocation.</li>
            <li>#QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_PRIMITIVES_BIT specifies that queries managed by the pool will count the number of primitives generated by geometry shader invocations. The counter&#8217;s value is incremented each time the geometry shader emits a primitive. Restarting primitive topology using the SPIR-V instructions {@code OpEndPrimitive} or {@code OpEndStreamPrimitive} has no effect on the geometry shader output primitives count.</li>
            <li>#QUERY_PIPELINE_STATISTIC_CLIPPING_INVOCATIONS_BIT specifies that queries managed by the pool will count the number of primitives processed by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vertexpostproc-clipping">Primitive Clipping</a> stage of the pipeline. The counter&#8217;s value is incremented each time a primitive reaches the primitive clipping stage.</li>
            <li>
                #QUERY_PIPELINE_STATISTIC_CLIPPING_PRIMITIVES_BIT specifies that queries managed by the pool will count the number of primitives output by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vertexpostproc-clipping">Primitive Clipping</a> stage of the pipeline. The counter&#8217;s value is incremented each time a primitive passes the primitive clipping stage. The actual number of primitives output by the primitive clipping stage for a particular input primitive is implementation-dependent but <b>must</b> satisfy the following conditions:
                <ul>
                    <li>If at least one vertex of the input primitive lies inside the clipping volume, the counter is incremented by one or more.</li>
                    <li>Otherwise, the counter is incremented by zero or more.</li>
                </ul>
            </li>
            <li>#QUERY_PIPELINE_STATISTIC_FRAGMENT_SHADER_INVOCATIONS_BIT specifies that queries managed by the pool will count the number of fragment shader invocations. The counter&#8217;s value is incremented each time the fragment shader is <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#shaders-fragment-execution">invoked</a>.</li>
            <li>#QUERY_PIPELINE_STATISTIC_TESSELLATION_CONTROL_SHADER_PATCHES_BIT specifies that queries managed by the pool will count the number of patches processed by the tessellation control shader. The counter&#8217;s value is incremented once for each patch for which a tessellation control shader is <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#shaders-tessellation-control-execution">invoked</a>.</li>
            <li>#QUERY_PIPELINE_STATISTIC_TESSELLATION_EVALUATION_SHADER_INVOCATIONS_BIT specifies that queries managed by the pool will count the number of invocations of the tessellation evaluation shader. The counter&#8217;s value is incremented each time the tessellation evaluation shader is <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#shaders-tessellation-evaluation-execution">invoked</a>.</li>
            <li>#QUERY_PIPELINE_STATISTIC_COMPUTE_SHADER_INVOCATIONS_BIT specifies that queries managed by the pool will count the number of compute shader invocations. The counter&#8217;s value is incremented every time the compute shader is invoked. Implementations <b>may</b> skip the execution of certain compute shader invocations or execute additional compute shader invocations for implementation-dependent reasons as long as the results of rendering otherwise remain unchanged.</li>
        </ul>

        These values are intended to measure relative statistics on one implementation. Various device architectures will count these values differently. Any or all counters <b>may</b> be affected by the issues described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#queries-operation-undefined">Query Operation</a>.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        For example, tile-based rendering devices <b>may</b> need to replay the scene multiple times, affecting some of the counts.
        </div>

        If a pipeline has {@code rasterizerDiscardEnable} enabled, implementations <b>may</b> discard primitives after the final vertex processing stage. As a result, if {@code rasterizerDiscardEnable} is enabled, the clipping input and output primitives counters <b>may</b> not be incremented.

        When a pipeline statistics query finishes, the result for that query is marked as available. The application <b>can</b> copy the result to a buffer (via #CmdCopyQueryPoolResults()), or request it be put into host memory (via #GetQueryPoolResults()).

        <h5>See Also</h5>
        {@code VkQueryPipelineStatisticFlags}
        """,

        "QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_VERTICES_BIT".enum(0x00000001),
        "QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_PRIMITIVES_BIT".enum(0x00000002),
        "QUERY_PIPELINE_STATISTIC_VERTEX_SHADER_INVOCATIONS_BIT".enum(0x00000004),
        "QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_INVOCATIONS_BIT".enum(0x00000008),
        "QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_PRIMITIVES_BIT".enum(0x00000010),
        "QUERY_PIPELINE_STATISTIC_CLIPPING_INVOCATIONS_BIT".enum(0x00000020),
        "QUERY_PIPELINE_STATISTIC_CLIPPING_PRIMITIVES_BIT".enum(0x00000040),
        "QUERY_PIPELINE_STATISTIC_FRAGMENT_SHADER_INVOCATIONS_BIT".enum(0x00000080),
        "QUERY_PIPELINE_STATISTIC_TESSELLATION_CONTROL_SHADER_PATCHES_BIT".enum(0x00000100),
        "QUERY_PIPELINE_STATISTIC_TESSELLATION_EVALUATION_SHADER_INVOCATIONS_BIT".enum(0x00000200),
        "QUERY_PIPELINE_STATISTIC_COMPUTE_SHADER_INVOCATIONS_BIT".enum(0x00000400)
    )

    EnumConstant(
        """
        VkQueryResultFlagBits - Bitmask specifying how and when query results are returned

        <h5>Description</h5>
        <ul>
            <li>#QUERY_RESULT_64_BIT specifies the results will be written as an array of 64-bit unsigned integer values. If this bit is not set, the results will be written as an array of 32-bit unsigned integer values.</li>
            <li>#QUERY_RESULT_WAIT_BIT specifies that Vulkan will wait for each query&#8217;s status to become available before retrieving its results.</li>
            <li>#QUERY_RESULT_WITH_AVAILABILITY_BIT specifies that the availability status accompanies the results.</li>
            <li>#QUERY_RESULT_PARTIAL_BIT specifies that returning partial results is acceptable.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkQueryResultFlags}
        """,

        "QUERY_RESULT_64_BIT".enum(0x00000001),
        "QUERY_RESULT_WAIT_BIT".enum(0x00000002),
        "QUERY_RESULT_WITH_AVAILABILITY_BIT".enum(0x00000004),
        "QUERY_RESULT_PARTIAL_BIT".enum(0x00000008)
    )

    EnumConstant(
        """
        VkBufferCreateFlagBits - Bitmask specifying additional parameters of a buffer

        <h5>Description</h5>
        <ul>
            <li>#BUFFER_CREATE_SPARSE_BINDING_BIT specifies that the buffer will be backed using sparse memory binding.</li>
            <li>#BUFFER_CREATE_SPARSE_RESIDENCY_BIT specifies that the buffer <b>can</b> be partially backed using sparse memory binding. Buffers created with this flag <b>must</b> also be created with the #BUFFER_CREATE_SPARSE_BINDING_BIT flag.</li>
            <li>#BUFFER_CREATE_SPARSE_ALIASED_BIT specifies that the buffer will be backed using sparse memory binding with memory ranges that might also simultaneously be backing another buffer (or another portion of the same buffer). Buffers created with this flag <b>must</b> also be created with the #BUFFER_CREATE_SPARSE_BINDING_BIT flag.</li>
        </ul>

        See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#sparsememory-sparseresourcefeatures">Sparse Resource Features</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features">Physical Device Features</a> for details of the sparse memory features supported on a device.

        <h5>See Also</h5>
        {@code VkBufferCreateFlags}
        """,

        "BUFFER_CREATE_SPARSE_BINDING_BIT".enum(0x00000001),
        "BUFFER_CREATE_SPARSE_RESIDENCY_BIT".enum(0x00000002),
        "BUFFER_CREATE_SPARSE_ALIASED_BIT".enum(0x00000004)
    )

    EnumConstant(
        """
        VkBufferUsageFlagBits - Bitmask specifying allowed usage of a buffer

        <h5>Description</h5>
        <ul>
            <li>#BUFFER_USAGE_TRANSFER_SRC_BIT specifies that the buffer <b>can</b> be used as the source of a <em>transfer command</em> (see the definition of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-transfer">#PIPELINE_STAGE_TRANSFER_BIT</a>).</li>
            <li>#BUFFER_USAGE_TRANSFER_DST_BIT specifies that the buffer <b>can</b> be used as the destination of a transfer command.</li>
            <li>#BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT specifies that the buffer <b>can</b> be used to create a {@code VkBufferView} suitable for occupying a {@code VkDescriptorSet} slot of type #DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER.</li>
            <li>#BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT specifies that the buffer <b>can</b> be used to create a {@code VkBufferView} suitable for occupying a {@code VkDescriptorSet} slot of type #DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER.</li>
            <li>#BUFFER_USAGE_UNIFORM_BUFFER_BIT specifies that the buffer <b>can</b> be used in a ##VkDescriptorBufferInfo suitable for occupying a {@code VkDescriptorSet} slot either of type #DESCRIPTOR_TYPE_UNIFORM_BUFFER or #DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC.</li>
            <li>#BUFFER_USAGE_STORAGE_BUFFER_BIT specifies that the buffer <b>can</b> be used in a ##VkDescriptorBufferInfo suitable for occupying a {@code VkDescriptorSet} slot either of type #DESCRIPTOR_TYPE_STORAGE_BUFFER or #DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC.</li>
            <li>#BUFFER_USAGE_INDEX_BUFFER_BIT specifies that the buffer is suitable for passing as the {@code buffer} parameter to #CmdBindIndexBuffer().</li>
            <li>#BUFFER_USAGE_VERTEX_BUFFER_BIT specifies that the buffer is suitable for passing as an element of the {@code pBuffers} array to #CmdBindVertexBuffers().</li>
            <li>#BUFFER_USAGE_INDIRECT_BUFFER_BIT specifies that the buffer is suitable for passing as the {@code buffer} parameter to #CmdDrawIndirect(), #CmdDrawIndexedIndirect(), or #CmdDispatchIndirect(). It is also suitable for passing as the {@code buffer} member of ##VkIndirectCommandsTokenNVX, or {@code sequencesCountBuffer} or {@code sequencesIndexBuffer} member of ##VkCmdProcessCommandsInfoNVX</li>
        </ul>

        <h5>See Also</h5>
        {@code VkBufferUsageFlags}
        """,

        "BUFFER_USAGE_TRANSFER_SRC_BIT".enum(0x00000001),
        "BUFFER_USAGE_TRANSFER_DST_BIT".enum(0x00000002),
        "BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT".enum(0x00000004),
        "BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT".enum(0x00000008),
        "BUFFER_USAGE_UNIFORM_BUFFER_BIT".enum(0x00000010),
        "BUFFER_USAGE_STORAGE_BUFFER_BIT".enum(0x00000020),
        "BUFFER_USAGE_INDEX_BUFFER_BIT".enum(0x00000040),
        "BUFFER_USAGE_VERTEX_BUFFER_BIT".enum(0x00000080),
        "BUFFER_USAGE_INDIRECT_BUFFER_BIT".enum(0x00000100)
    )

    EnumConstant(
        """
        VkSharingMode - Buffer and image sharing modes

        <h5>Description</h5>
        <ul>
            <li>#SHARING_MODE_EXCLUSIVE specifies that access to any range or image subresource of the object will be exclusive to a single queue family at a time.</li>
            <li>#SHARING_MODE_CONCURRENT specifies that concurrent access to any range or image subresource of the object from multiple queue families is supported.</li>
        </ul>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        #SHARING_MODE_CONCURRENT <b>may</b> result in lower performance access to the buffer or image than #SHARING_MODE_EXCLUSIVE.
        </div>

        Ranges of buffers and image subresources of image objects created using #SHARING_MODE_EXCLUSIVE <b>must</b> only be accessed by queues in the same queue family at any given time. In order for a different queue family to be able to interpret the memory contents of a range or image subresource, the application <b>must</b> perform a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-queue-transfers">queue family ownership transfer</a>.

        Upon creation, resources using #SHARING_MODE_EXCLUSIVE are not owned by any queue family. A buffer or image memory barrier is not required to acquire <em>ownership</em> when no queue family owns the resource - it is implicitly acquired upon first use within a queue.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Images still require a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#resources-image-layouts">layout transition</a> from #IMAGE_LAYOUT_UNDEFINED or #IMAGE_LAYOUT_PREINITIALIZED before being used on the first queue.
        </div>

        A queue family <b>can</b> take ownership of an image subresource or buffer range of a resource created with #SHARING_MODE_EXCLUSIVE, without an ownership transfer, in the same way as for a resource that was just created; however, taking ownership in this way has the effect that the contents of the image subresource or buffer range are undefined.

        Ranges of buffers and image subresources of image objects created using #SHARING_MODE_CONCURRENT <b>must</b> only be accessed by queues from the queue families specified through the {@code queueFamilyIndexCount} and {@code pQueueFamilyIndices} members of the corresponding create info structures.

        <h5>See Also</h5>
        ##VkBufferCreateInfo, ##VkImageCreateInfo, ##VkSwapchainCreateInfoKHR
        """,

        "SHARING_MODE_EXCLUSIVE".."0",
        "SHARING_MODE_CONCURRENT".."1"
    )

    EnumConstant(
        """
        VkImageLayout - Layout of image and image subresources

        <h5>Description</h5>
        The type(s) of device access supported by each layout are:

        <ul>
            <li>#IMAGE_LAYOUT_UNDEFINED does not support device access. This layout <b>must</b> only be used as the {@code initialLayout} member of ##VkImageCreateInfo or ##VkAttachmentDescription, or as the {@code oldLayout} in an image transition. When transitioning out of this layout, the contents of the memory are not guaranteed to be preserved.</li>
            <li>#IMAGE_LAYOUT_PREINITIALIZED does not support device access. This layout <b>must</b> only be used as the {@code initialLayout} member of ##VkImageCreateInfo or ##VkAttachmentDescription, or as the {@code oldLayout} in an image transition. When transitioning out of this layout, the contents of the memory are preserved. This layout is intended to be used as the initial layout for an image whose contents are written by the host, and hence the data <b>can</b> be written to memory immediately, without first executing a layout transition. Currently, #IMAGE_LAYOUT_PREINITIALIZED is only useful with #IMAGE_TILING_LINEAR images because there is not a standard layout defined for #IMAGE_TILING_OPTIMAL images.</li>
            <li>#IMAGE_LAYOUT_GENERAL supports all types of device access.</li>
            <li>#IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL <b>must</b> only be used as a color or resolve attachment in a {@code VkFramebuffer}. This layout is valid only for image subresources of images created with the #IMAGE_USAGE_COLOR_ATTACHMENT_BIT usage bit enabled.</li>
            <li>#IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL <b>must</b> only be used as a depth/stencil attachment in a {@code VkFramebuffer}. This layout is valid only for image subresources of images created with the #IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT usage bit enabled.</li>
            <li>#IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL <b>must</b> only be used as a read-only depth/stencil attachment in a {@code VkFramebuffer} and/or as a read-only image in a shader (which <b>can</b> be read as a sampled image, combined image/sampler and/or input attachment). This layout is valid only for image subresources of images created with the #IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT usage bit enabled. Only image subresources of images created with #IMAGE_USAGE_SAMPLED_BIT <b>can</b> be used as sampled image or combined image/sampler in a shader. Similarly, only image subresources of images created with #IMAGE_USAGE_INPUT_ATTACHMENT_BIT <b>can</b> be used as input attachments.</li>
            <li>#IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL <b>must</b> only be used as a read-only image in a shader (which <b>can</b> be read as a sampled image, combined image/sampler and/or input attachment). This layout is valid only for image subresources of images created with the #IMAGE_USAGE_SAMPLED_BIT or #IMAGE_USAGE_INPUT_ATTACHMENT_BIT usage bit enabled.</li>
            <li>#IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL <b>must</b> only be used as a source image of a transfer command (see the definition of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-transfer">#PIPELINE_STAGE_TRANSFER_BIT</a>). This layout is valid only for image subresources of images created with the #IMAGE_USAGE_TRANSFER_SRC_BIT usage bit enabled.</li>
            <li>#IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL <b>must</b> only be used as a destination image of a transfer command. This layout is valid only for image subresources of images created with the #IMAGE_USAGE_TRANSFER_DST_BIT usage bit enabled.</li>
            <li>#IMAGE_LAYOUT_PRESENT_SRC_KHR <b>must</b> only be used for presenting a presentable image for display. A swapchain&#8217;s image <b>must</b> be transitioned to this layout before calling #QueuePresentKHR(), and <b>must</b> be transitioned away from this layout after calling #AcquireNextImageKHR().</li>
            <li>#IMAGE_LAYOUT_SHARED_PRESENT_KHR is valid only for shared presentable images, and <b>must</b> be used for any usage the image supports.</li>
        </ul>

        For each mechanism of accessing an image in the API, there is a parameter or structure member that controls the image layout used to access the image. For transfer commands, this is a parameter to the command (see <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#clears">the “Clear Commands” section</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#copies">the “Copy Commands” section</a>). For use as a framebuffer attachment, this is a member in the substructures of the ##VkRenderPassCreateInfo (see <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#renderpass">Render Pass</a>). For use in a descriptor set, this is a member in the ##VkDescriptorImageInfo structure (see <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#descriptorsets-updates">the “Descriptor Set Updates” section</a>). At the time that any command buffer command accessing an image executes on any queue, the layouts of the image subresources that are accessed <b>must</b> all match the layout specified via the API controlling those accesses.

        The image layout of each image subresource <b>must</b> be well-defined at each point in the image subresource's lifetime. This means that when performing a layout transition on the image subresource, the old layout value <b>must</b> either equal the current layout of the image subresource (at the time the transition executes), or else be #IMAGE_LAYOUT_UNDEFINED (implying that the contents of the image subresource need not be preserved). The new layout used in a transition <b>must</b> not be #IMAGE_LAYOUT_UNDEFINED or #IMAGE_LAYOUT_PREINITIALIZED.

        <h5>See Also</h5>
        ##VkAttachmentDescription, ##VkAttachmentReference, ##VkDescriptorImageInfo, ##VkImageCreateInfo, ##VkImageMemoryBarrier, #CmdBlitImage(), #CmdClearColorImage(), #CmdClearDepthStencilImage(), #CmdCopyBufferToImage(), #CmdCopyImage(), #CmdCopyImageToBuffer(), #CmdResolveImage()
        """,

        "IMAGE_LAYOUT_UNDEFINED".."0",
        "IMAGE_LAYOUT_GENERAL".."1",
        "IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL".."2",
        "IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL".."3",
        "IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL".."4",
        "IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL".."5",
        "IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL".."6",
        "IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL".."7",
        "IMAGE_LAYOUT_PREINITIALIZED".."8"
    )

    EnumConstant(
        """
        VkImageViewType - Image view types

        <h5>Description</h5>
        The exact image view type is partially implicit, based on the image's type and sample count, as well as the view creation parameters as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#resources-image-views-compatibility">image view compatibility table</a> for #CreateImageView(). This table also shows which SPIR-V {@code OpTypeImage} {@code Dim} and {@code Arrayed} parameters correspond to each image view type.

        <h5>See Also</h5>
        ##VkImageViewCreateInfo
        """,

        "IMAGE_VIEW_TYPE_1D".."0",
        "IMAGE_VIEW_TYPE_2D".."1",
        "IMAGE_VIEW_TYPE_3D".."2",
        "IMAGE_VIEW_TYPE_CUBE".."3",
        "IMAGE_VIEW_TYPE_1D_ARRAY".."4",
        "IMAGE_VIEW_TYPE_2D_ARRAY".."5",
        "IMAGE_VIEW_TYPE_CUBE_ARRAY".."6"
    )

    EnumConstant(
        """
        VkComponentSwizzle - Specify how a component is swizzled

        <h5>Description</h5>
        <ul>
            <li>#COMPONENT_SWIZZLE_IDENTITY specifies that the component is set to the identity swizzle.</li>
            <li>#COMPONENT_SWIZZLE_ZERO specifies that the component is set to zero.</li>
            <li>#COMPONENT_SWIZZLE_ONE specifies that the component is set to either 1 or 1.0, depending on whether the type of the image view format is integer or floating-point respectively, as determined by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-formats-definition">Format Definition</a> section for each {@code VkFormat}.</li>
            <li>#COMPONENT_SWIZZLE_R specifies that the component is set to the value of the R component of the image.</li>
            <li>#COMPONENT_SWIZZLE_G specifies that the component is set to the value of the G component of the image.</li>
            <li>#COMPONENT_SWIZZLE_B specifies that the component is set to the value of the B component of the image.</li>
            <li>#COMPONENT_SWIZZLE_A specifies that the component is set to the value of the A component of the image.</li>
        </ul>

        Setting the identity swizzle on a component is equivalent to setting the identity mapping on that component. That is:

        <h6>Component Mappings Equivalent To ename:VK_COMPONENT_SWIZZLE_IDENTITY</h6>
        <table class="lwjgl">
            <thead><tr><th>Component</th><th>Identity Mapping</th></tr></thead>
            <tbody>
                <tr><td>{@code components.r}</td><td>#COMPONENT_SWIZZLE_R</td></tr>
                <tr><td>{@code components.g}</td><td>#COMPONENT_SWIZZLE_G</td></tr>
                <tr><td>{@code components.b}</td><td>#COMPONENT_SWIZZLE_B</td></tr>
                <tr><td>{@code components.a}</td><td>#COMPONENT_SWIZZLE_A</td></tr>
            </tbody>
        </table>

        <h5>See Also</h5>
        ##VkComponentMapping
        """,

        "COMPONENT_SWIZZLE_IDENTITY".."0",
        "COMPONENT_SWIZZLE_ZERO".."1",
        "COMPONENT_SWIZZLE_ONE".."2",
        "COMPONENT_SWIZZLE_R".."3",
        "COMPONENT_SWIZZLE_G".."4",
        "COMPONENT_SWIZZLE_B".."5",
        "COMPONENT_SWIZZLE_A".."6"
    )

    EnumConstant(
        """
        VkPipelineCreateFlagBits - Bitmask controlling how a pipeline is created

        <h5>Description</h5>
        <ul>
            <li>#PIPELINE_CREATE_DISABLE_OPTIMIZATION_BIT specifies that the created pipeline will not be optimized. Using this flag <b>may</b> reduce the time taken to create the pipeline.</li>
            <li>#PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT specifies that the pipeline to be created is allowed to be the parent of a pipeline that will be created in a subsequent call to #CreateGraphicsPipelines().</li>
            <li>#PIPELINE_CREATE_DERIVATIVE_BIT specifies that the pipeline to be created will be a child of a previously created parent pipeline.</li>
            <li>#PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT_KHX specifies that any shader input variables decorated as {@code DeviceIndex} will be assigned values as if they were decorated as {@code ViewIndex}.</li>
            <li>#PIPELINE_CREATE_DISPATCH_BASE_KHX specifies that a compute pipeline <b>can</b> be used with #CmdDispatchBaseKHX() with a non-zero base workgroup.</li>
        </ul>

        It is valid to set both #PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT and #PIPELINE_CREATE_DERIVATIVE_BIT. This allows a pipeline to be both a parent and possibly a child in a pipeline hierarchy. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#pipelines-pipeline-derivatives">Pipeline Derivatives</a> for more information.

        <h5>See Also</h5>
        {@code VkPipelineCreateFlags}
        """,

        "PIPELINE_CREATE_DISABLE_OPTIMIZATION_BIT".enum(0x00000001),
        "PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT".enum(0x00000002),
        "PIPELINE_CREATE_DERIVATIVE_BIT".enum(0x00000004)
    )

    EnumConstant(
        """
        VkShaderStageFlagBits - Bitmask specifying a pipeline stage

        <h5>Description</h5>
        <ul>
            <li>#SHADER_STAGE_VERTEX_BIT specifies the vertex stage.</li>
            <li>#SHADER_STAGE_TESSELLATION_CONTROL_BIT specifies the tessellation control stage.</li>
            <li>#SHADER_STAGE_TESSELLATION_EVALUATION_BIT specifies the tessellation evaluation stage.</li>
            <li>#SHADER_STAGE_GEOMETRY_BIT specifies the geometry stage.</li>
            <li>#SHADER_STAGE_FRAGMENT_BIT specifies the fragment stage.</li>
            <li>#SHADER_STAGE_COMPUTE_BIT specifies the compute stage.</li>
            <li>#SHADER_STAGE_ALL_GRAPHICS is a combination of bits used as shorthand to specify all graphics stages defined above (excluding the compute stage).</li>
            <li>#SHADER_STAGE_ALL is a combination of bits used as shorthand to specify all shader stages supported by the device, including all additional stages which are introduced by extensions.</li>
        </ul>

        <h5>See Also</h5>
        ##VkPipelineShaderStageCreateInfo, {@code VkShaderStageFlags}
        """,

        "SHADER_STAGE_VERTEX_BIT".enum(0x00000001),
        "SHADER_STAGE_TESSELLATION_CONTROL_BIT".enum(0x00000002),
        "SHADER_STAGE_TESSELLATION_EVALUATION_BIT".enum(0x00000004),
        "SHADER_STAGE_GEOMETRY_BIT".enum(0x00000008),
        "SHADER_STAGE_FRAGMENT_BIT".enum(0x00000010),
        "SHADER_STAGE_COMPUTE_BIT".enum(0x00000020),
        "SHADER_STAGE_ALL_GRAPHICS".."0x0000001F",
        "SHADER_STAGE_ALL".."0x7FFFFFFF"
    )

    EnumConstant(
        """
        VkVertexInputRate - Specify rate at which vertex attributes are pulled from buffers

        <h5>Description</h5>
        <ul>
            <li>#VERTEX_INPUT_RATE_VERTEX specifies that vertex attribute addressing is a function of the vertex index.</li>
            <li>#VERTEX_INPUT_RATE_INSTANCE specifies that vertex attribute addressing is a function of the instance index.</li>
        </ul>

        <h5>See Also</h5>
        ##VkVertexInputBindingDescription
        """,

        "VERTEX_INPUT_RATE_VERTEX".."0",
        "VERTEX_INPUT_RATE_INSTANCE".."1"
    )

    EnumConstant(
        """
        VkPrimitiveTopology - Supported primitive topologies

        <h5>See Also</h5>
        ##VkPipelineInputAssemblyStateCreateInfo
        """,

        "PRIMITIVE_TOPOLOGY_POINT_LIST".."0",
        "PRIMITIVE_TOPOLOGY_LINE_LIST".."1",
        "PRIMITIVE_TOPOLOGY_LINE_STRIP".."2",
        "PRIMITIVE_TOPOLOGY_TRIANGLE_LIST".."3",
        "PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP".."4",
        "PRIMITIVE_TOPOLOGY_TRIANGLE_FAN".."5",
        "PRIMITIVE_TOPOLOGY_LINE_LIST_WITH_ADJACENCY".."6",
        "PRIMITIVE_TOPOLOGY_LINE_STRIP_WITH_ADJACENCY".."7",
        "PRIMITIVE_TOPOLOGY_TRIANGLE_LIST_WITH_ADJACENCY".."8",
        "PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP_WITH_ADJACENCY".."9",
        "PRIMITIVE_TOPOLOGY_PATCH_LIST".."10"
    )

    EnumConstant(
        """
        VkPolygonMode - Control polygon rasterization mode

        <h5>Description</h5>
        <ul>
            <li>#POLYGON_MODE_POINT specifies that polygon vertices are drawn as points.</li>
            <li>#POLYGON_MODE_LINE specifies that polygon edges are drawn as line segments.</li>
            <li>#POLYGON_MODE_FILL specifies that polygons are rendered using the polygon rasterization rules in this section.</li>
        </ul>

        These modes affect only the final rasterization of polygons: in particular, a polygon's vertices are shaded and the polygon is clipped and possibly culled before these modes are applied.

        <h5>See Also</h5>
        ##VkPipelineRasterizationStateCreateInfo
        """,

        "POLYGON_MODE_FILL".."0",
        "POLYGON_MODE_LINE".."1",
        "POLYGON_MODE_POINT".."2"
    )

    EnumConstant(
        """
        VkCullModeFlagBits - Bitmask controlling triangle culling

        <h5>Description</h5>
        <ul>
            <li>#CULL_MODE_NONE specifies that no triangles are discarded</li>
            <li>#CULL_MODE_FRONT_BIT specifies that front-facing triangles are discarded</li>
            <li>#CULL_MODE_BACK_BIT specifies that back-facing triangles are discarded</li>
            <li>#CULL_MODE_FRONT_AND_BACK specifies that all triangles are discarded.</li>
        </ul>

        Following culling, fragments are produced for any triangles which have not been discarded.

        <h5>See Also</h5>
        {@code VkCullModeFlags}
        """,

        "CULL_MODE_NONE".."0",
        "CULL_MODE_FRONT_BIT".enum(0x00000001),
        "CULL_MODE_BACK_BIT".enum(0x00000002),
        "CULL_MODE_FRONT_AND_BACK".."0x00000003"
    )

    EnumConstant(
        """
        VkFrontFace - Interpret polygon front-facing orientation

        <h5>Description</h5>
        <ul>
            <li>#FRONT_FACE_COUNTER_CLOCKWISE specifies that a triangle with positive area is considered front-facing.</li>
            <li>#FRONT_FACE_CLOCKWISE specifies that a triangle with negative area is considered front-facing.</li>
        </ul>

        Any triangle which is not front-facing is back-facing, including zero-area triangles.

        <h5>See Also</h5>
        ##VkPipelineRasterizationStateCreateInfo
        """,

        "FRONT_FACE_COUNTER_CLOCKWISE".."0",
        "FRONT_FACE_CLOCKWISE".."1"
    )

    EnumConstant(
        """
        VkCompareOp - Stencil comparison function

        <h5>Description</h5>
        <ul>
            <li>#COMPARE_OP_NEVER specifies that the test never passes.</li>
            <li>#COMPARE_OP_LESS specifies that the test passes when <code>R &lt; S</code>.</li>
            <li>#COMPARE_OP_EQUAL specifies that the test passes when <code>R = S</code>.</li>
            <li>#COMPARE_OP_LESS_OR_EQUAL specifies that the test passes when <code>R ≤ S</code>.</li>
            <li>#COMPARE_OP_GREATER specifies that the test passes when <code>R &gt; S</code>.</li>
            <li>#COMPARE_OP_NOT_EQUAL specifies that the test passes when <code>R ≠ S</code>.</li>
            <li>#COMPARE_OP_GREATER_OR_EQUAL specifies that the test passes when <code>R ≥ S</code>.</li>
            <li>#COMPARE_OP_ALWAYS specifies that the test always passes.</li>
        </ul>

        <h5>See Also</h5>
        ##VkPipelineDepthStencilStateCreateInfo, ##VkSamplerCreateInfo, ##VkStencilOpState
        """,

        "COMPARE_OP_NEVER".."0",
        "COMPARE_OP_LESS".."1",
        "COMPARE_OP_EQUAL".."2",
        "COMPARE_OP_LESS_OR_EQUAL".."3",
        "COMPARE_OP_GREATER".."4",
        "COMPARE_OP_NOT_EQUAL".."5",
        "COMPARE_OP_GREATER_OR_EQUAL".."6",
        "COMPARE_OP_ALWAYS".."7"
    )

    EnumConstant(
        """
        VkStencilOp - Stencil comparison function

        <h5>Description</h5>
        <ul>
            <li>#STENCIL_OP_KEEP keeps the current value.</li>
            <li>#STENCIL_OP_ZERO sets the value to 0.</li>
            <li>#STENCIL_OP_REPLACE sets the value to {@code reference}.</li>
            <li>#STENCIL_OP_INCREMENT_AND_CLAMP increments the current value and clamps to the maximum representable unsigned value.</li>
            <li>#STENCIL_OP_DECREMENT_AND_CLAMP decrements the current value and clamps to 0.</li>
            <li>#STENCIL_OP_INVERT bitwise-inverts the current value.</li>
            <li>#STENCIL_OP_INCREMENT_AND_WRAP increments the current value and wraps to 0 when the maximum value would have been exceeded.</li>
            <li>#STENCIL_OP_DECREMENT_AND_WRAP decrements the current value and wraps to the maximum possible value when the value would go below 0.</li>
        </ul>

        For purposes of increment and decrement, the stencil bits are considered as an unsigned integer.

        If the stencil test fails, the sample's coverage bit is cleared in the fragment. If there is no stencil framebuffer attachment, stencil modification <b>cannot</b> occur, and it is as if the stencil tests always pass.

        If the stencil test passes, the {@code writeMask} member of the ##VkStencilOpState structures controls how the updated stencil value is written to the stencil framebuffer attachment.

        The least significant <code>s</code> bits of {@code writeMask}, where <code>s</code> is the number of bits in the stencil framebuffer attachment, specify an integer mask. Where a <code>1</code> appears in this mask, the corresponding bit in the stencil value in the depth/stencil attachment is written; where a <code>0</code> appears, the bit is not written. The {@code writeMask} value uses either the front-facing or back-facing state based on the facingness of the fragment. Fragments generated by front-facing primitives use the front mask and fragments generated by back-facing primitives use the back mask.

        <h5>See Also</h5>
        ##VkStencilOpState
        """,

        "STENCIL_OP_KEEP".."0",
        "STENCIL_OP_ZERO".."1",
        "STENCIL_OP_REPLACE".."2",
        "STENCIL_OP_INCREMENT_AND_CLAMP".."3",
        "STENCIL_OP_DECREMENT_AND_CLAMP".."4",
        "STENCIL_OP_INVERT".."5",
        "STENCIL_OP_INCREMENT_AND_WRAP".."6",
        "STENCIL_OP_DECREMENT_AND_WRAP".."7"
    )

    EnumConstant(
        """
        VkLogicOp - Framebuffer logical operations

        <h5>Description</h5>
        

        The logical operations supported by Vulkan are summarized in the following table in which

        <ul>
            <li><code>¬</code> is bitwise invert,</li>
            <li><code>∧</code> is bitwise and,</li>
            <li><code>∨</code> is bitwise or,</li>
            <li><code>⊕</code> is bitwise exclusive or,</li>
            <li><code>s</code> is the fragment&#8217;s <code>R<sub>s0</sub>, G<sub>s0</sub>, B<sub>s0</sub></code> or <code>A<sub>s0</sub></code> component value for the fragment output corresponding to the color attachment being updated, and</li>
            <li><code>d</code> is the color attachment&#8217;s <code>R, G, B</code> or <code>A</code> component value:</li>
        </ul>

        <h6>Logical Operations</h6>
        <table class="lwjgl">
            <thead><tr><th>Mode</th><th>Operation</th></tr></thead>
            <tbody>
                <tr><td>#LOGIC_OP_CLEAR</td><td><code>0</code></td></tr>
                <tr><td>#LOGIC_OP_AND</td><td><code>s ∧ d</code></td></tr>
                <tr><td>#LOGIC_OP_AND_REVERSE</td><td><code>s ∧ ¬ d</code></td></tr>
                <tr><td>#LOGIC_OP_COPY</td><td><code>s</code></td></tr>
                <tr><td>#LOGIC_OP_AND_INVERTED</td><td><code>¬ s ∧ d</code></td></tr>
                <tr><td>#LOGIC_OP_NO_OP</td><td><code>d</code></td></tr>
                <tr><td>#LOGIC_OP_XOR</td><td><code>s ⊕ d</code></td></tr>
                <tr><td>#LOGIC_OP_OR</td><td><code>s ∨ d</code></td></tr>
                <tr><td>#LOGIC_OP_NOR</td><td><code>¬ (s ∨ d)</code></td></tr>
                <tr><td>#LOGIC_OP_EQUIVALENT</td><td><code>¬ (s ⊕ d)</code></td></tr>
                <tr><td>#LOGIC_OP_INVERT</td><td><code>¬ d</code></td></tr>
                <tr><td>#LOGIC_OP_OR_REVERSE</td><td><code>s ∨ ¬ d</code></td></tr>
                <tr><td>#LOGIC_OP_COPY_INVERTED</td><td><code>¬ s</code></td></tr>
                <tr><td>#LOGIC_OP_OR_INVERTED</td><td><code>¬ s ∨ d</code></td></tr>
                <tr><td>#LOGIC_OP_NAND</td><td><code>¬ (s ∧ d)</code></td></tr>
                <tr><td>#LOGIC_OP_SET</td><td>all 1s</td></tr>
            </tbody>
        </table>

        The result of the logical operation is then written to the color attachment as controlled by the component write mask, described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#framebuffer-blendoperations">Blend Operations</a>.

        <h5>See Also</h5>
        ##VkPipelineColorBlendStateCreateInfo
        """,

        "LOGIC_OP_CLEAR".."0",
        "LOGIC_OP_AND".."1",
        "LOGIC_OP_AND_REVERSE".."2",
        "LOGIC_OP_COPY".."3",
        "LOGIC_OP_AND_INVERTED".."4",
        "LOGIC_OP_NO_OP".."5",
        "LOGIC_OP_XOR".."6",
        "LOGIC_OP_OR".."7",
        "LOGIC_OP_NOR".."8",
        "LOGIC_OP_EQUIVALENT".."9",
        "LOGIC_OP_INVERT".."10",
        "LOGIC_OP_OR_REVERSE".."11",
        "LOGIC_OP_COPY_INVERTED".."12",
        "LOGIC_OP_OR_INVERTED".."13",
        "LOGIC_OP_NAND".."14",
        "LOGIC_OP_SET".."15"
    )

    EnumConstant(
        """
        VkBlendFactor - Framebuffer blending factors

        <h5>Description</h5>
        The semantics of each enum value is described in the table below:

        <h6>Blend Factors</h6>
        <table class="lwjgl">
            <thead><tr><th>VkBlendFactor</th><th>RGB Blend Factors <code>(S<sub>r</sub>,S<sub>g</sub>,S<sub>b</sub>)</code> or <code>(D<sub>r</sub>,D<sub>g</sub>,D<sub>b</sub>)</code></th><th>Alpha Blend Factor (<code>S<sub>a</sub></code> or <code>D<sub>a</sub></code>)</th></tr></thead>
            <tbody>
                <tr><td>#BLEND_FACTOR_ZERO</td><td><code>(0,0,0)</code></td><td><code>0</code></td></tr>
                <tr><td>#BLEND_FACTOR_ONE</td><td><code>(1,1,1)</code></td><td><code>1</code></td></tr>
                <tr><td>#BLEND_FACTOR_SRC_COLOR</td><td><code>(R<sub>s0</sub>,G<sub>s0</sub>,B<sub>s0</sub>)</code></td><td><code>A<sub>s0</sub></code></td></tr>
                <tr><td>#BLEND_FACTOR_ONE_MINUS_SRC_COLOR</td><td><code>(1-R<sub>s0</sub>,1-G<sub>s0</sub>,1-B<sub>s0</sub>)</code></td><td><code>1-A<sub>s0</sub></code></td></tr>
                <tr><td>#BLEND_FACTOR_DST_COLOR</td><td><code>(R<sub>d</sub>,G<sub>d</sub>,B<sub>d</sub>)</code></td><td><code>A<sub>d</sub></code></td></tr>
                <tr><td>#BLEND_FACTOR_ONE_MINUS_DST_COLOR</td><td><code>(1-R<sub>d</sub>,1-G<sub>d</sub>,1-B<sub>d</sub>)</code></td><td><code>1-A<sub>d</sub></code></td></tr>
                <tr><td>#BLEND_FACTOR_SRC_ALPHA</td><td><code>(A<sub>s0</sub>,A<sub>s0</sub>,A<sub>s0</sub>)</code></td><td><code>A<sub>s0</sub></code></td></tr>
                <tr><td>#BLEND_FACTOR_ONE_MINUS_SRC_ALPHA</td><td><code>(1-A<sub>s0</sub>,1-A<sub>s0</sub>,1-A<sub>s0</sub>)</code></td><td><code>1-A<sub>s0</sub></code></td></tr>
                <tr><td>#BLEND_FACTOR_DST_ALPHA</td><td><code>(A<sub>d</sub>,A<sub>d</sub>,A<sub>d</sub>)</code></td><td><code>A<sub>d</sub></code></td></tr>
                <tr><td>#BLEND_FACTOR_ONE_MINUS_DST_ALPHA</td><td><code>(1-A<sub>d</sub>,1-A<sub>d</sub>,1-A<sub>d</sub>)</code></td><td><code>1-A<sub>d</sub></code></td></tr>
                <tr><td>#BLEND_FACTOR_CONSTANT_COLOR</td><td><code>(R<sub>c</sub>,G<sub>c</sub>,B<sub>c</sub>)</code></td><td><code>A<sub>c</sub></code></td></tr>
                <tr><td>#BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR</td><td><code>(1-R<sub>c</sub>,1-G<sub>c</sub>,1-B<sub>c</sub>)</code></td><td><code>1-A<sub>c</sub></code></td></tr>
                <tr><td>#BLEND_FACTOR_CONSTANT_ALPHA</td><td><code>(A<sub>c</sub>,A<sub>c</sub>,A<sub>c</sub>)</code></td><td><code>A<sub>c</sub></code></td></tr>
                <tr><td>#BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA</td><td><code>(1-A<sub>c</sub>,1-A<sub>c</sub>,1-A<sub>c</sub>)</code></td><td><code>1-A<sub>c</sub></code></td></tr>
                <tr><td>#BLEND_FACTOR_SRC_ALPHA_SATURATE</td><td><code>(f,f,f)</code>; <code>f = min(A<sub>s0</sub>,1-A<sub>d</sub>)</code></td><td><code>1</code></td></tr>
                <tr><td>#BLEND_FACTOR_SRC1_COLOR</td><td><code>(R<sub>s1</sub>,G<sub>s1</sub>,B<sub>s1</sub>)</code></td><td><code>A<sub>s1</sub></code></td></tr>
                <tr><td>#BLEND_FACTOR_ONE_MINUS_SRC1_COLOR</td><td><code>(1-R<sub>s1</sub>,1-G<sub>s1</sub>,1-B<sub>s1</sub>)</code></td><td><code>1-A<sub>s1</sub></code></td></tr>
                <tr><td>#BLEND_FACTOR_SRC1_ALPHA</td><td><code>(A<sub>s1</sub>,A<sub>s1</sub>,A<sub>s1</sub>)</code></td><td><code>A<sub>s1</sub></code></td></tr>
                <tr><td>#BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA</td><td><code>(1-A<sub>s1</sub>,1-A<sub>s1</sub>,1-A<sub>s1</sub>)</code></td><td><code>1-A<sub>s1</sub></code></td></tr>
            </tbody>
        </table>

        In this table, the following conventions are used:

        <ul>
            <li><code>R<sub>s0</sub>,G<sub>s0</sub>,B<sub>s0</sub></code> and <code>A<sub>s0</sub></code> represent the first source color R, G, B, and A components, respectively, for the fragment output location corresponding to the color attachment being blended.</li>
            <li><code>R<sub>s1</sub>,G<sub>s1</sub>,B<sub>s1</sub></code> and <code>A<sub>s1</sub></code> represent the second source color R, G, B, and A components, respectively, used in dual source blending modes, for the fragment output location corresponding to the color attachment being blended.</li>
            <li><code>R<sub>d</sub>,G<sub>d</sub>,B<sub>d</sub></code> and <code>A<sub>d</sub></code> represent the R, G, B, and A components of the destination color. That is, the color currently in the corresponding color attachment for this fragment/sample.</li>
            <li><code>R<sub>c</sub>,G<sub>c</sub>,B<sub>c</sub></code> and <code>A<sub>c</sub></code> represent the blend constant R, G, B, and A components, respectively.</li>
        </ul>

        <h5>See Also</h5>
        ##VkPipelineColorBlendAttachmentState
        """,

        "BLEND_FACTOR_ZERO".."0",
        "BLEND_FACTOR_ONE".."1",
        "BLEND_FACTOR_SRC_COLOR".."2",
        "BLEND_FACTOR_ONE_MINUS_SRC_COLOR".."3",
        "BLEND_FACTOR_DST_COLOR".."4",
        "BLEND_FACTOR_ONE_MINUS_DST_COLOR".."5",
        "BLEND_FACTOR_SRC_ALPHA".."6",
        "BLEND_FACTOR_ONE_MINUS_SRC_ALPHA".."7",
        "BLEND_FACTOR_DST_ALPHA".."8",
        "BLEND_FACTOR_ONE_MINUS_DST_ALPHA".."9",
        "BLEND_FACTOR_CONSTANT_COLOR".."10",
        "BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR".."11",
        "BLEND_FACTOR_CONSTANT_ALPHA".."12",
        "BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA".."13",
        "BLEND_FACTOR_SRC_ALPHA_SATURATE".."14",
        "BLEND_FACTOR_SRC1_COLOR".."15",
        "BLEND_FACTOR_ONE_MINUS_SRC1_COLOR".."16",
        "BLEND_FACTOR_SRC1_ALPHA".."17",
        "BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA".."18"
    )

    EnumConstant(
        """
        VkBlendOp - Framebuffer blending operations

        <h5>Description</h5>
        

        The semantics of each enum value is described in the table below:

        <h6>Blend Operations</h6>
        <table class="lwjgl">
            <thead><tr><th>VkBlendOp</th><th>RGB Components</th><th>Alpha Component</th></tr></thead>
            <tbody>
                <tr><td>#BLEND_OP_ADD</td><td><code>R = R<sub>s0</sub> × S<sub>r</sub> + R<sub>d</sub> × D<sub>r</sub></code> <code>G = G<sub>s0</sub> × S<sub>g</sub> + G<sub>d</sub> × D<sub>g</sub></code> <code>B = B<sub>s0</sub> × S<sub>b</sub> + B<sub>d</sub> × D<sub>b</sub></code></td><td><code>A = A<sub>s0</sub> × S<sub>a</sub> + A<sub>d</sub> × D<sub>a</sub></code></td></tr>
                <tr><td>#BLEND_OP_SUBTRACT</td><td><code>R = R<sub>s0</sub> × S<sub>r</sub> - R<sub>d</sub> × D<sub>r</sub></code> <code>G = G<sub>s0</sub> × S<sub>g</sub> - G<sub>d</sub> × D<sub>g</sub></code> <code>B = B<sub>s0</sub> × S<sub>b</sub> - B<sub>d</sub> × D<sub>b</sub></code></td><td><code>A = A<sub>s0</sub> × S<sub>a</sub> - A<sub>d</sub> × D<sub>a</sub></code></td></tr>
                <tr><td>#BLEND_OP_REVERSE_SUBTRACT</td><td><code>R = R<sub>d</sub> × D<sub>r</sub> - R<sub>s0</sub> × S<sub>r</sub></code> <code>G = G<sub>d</sub> × D<sub>g</sub> - G<sub>s0</sub> × S<sub>g</sub></code> <code>B = B<sub>d</sub> × D<sub>b</sub> - B<sub>s0</sub> × S<sub>b</sub></code></td><td><code>A = A<sub>d</sub> × D<sub>a</sub> - A<sub>s0</sub> × S<sub>a</sub></code></td></tr>
                <tr><td>#BLEND_OP_MIN</td><td><code>R = min(R<sub>s0</sub>,R<sub>d</sub>)</code> <code>G = min(G<sub>s0</sub>,G<sub>d</sub>)</code> <code>B = min(B<sub>s0</sub>,B<sub>d</sub>)</code></td><td><code>A = min(A<sub>s0</sub>,A<sub>d</sub>)</code></td></tr>
                <tr><td>#BLEND_OP_MAX</td><td><code>R = max(R<sub>s0</sub>,R<sub>d</sub>)</code> <code>G = max(G<sub>s0</sub>,G<sub>d</sub>)</code> <code>B = max(B<sub>s0</sub>,B<sub>d</sub>)</code></td><td><code>A = max(A<sub>s0</sub>,A<sub>d</sub>)</code></td></tr>
            </tbody>
        </table>

        In this table, the following conventions are used:

        <ul>
            <li><code>R<sub>s0</sub>, G<sub>s0</sub>, B<sub>s0</sub></code> and <code>A<sub>s0</sub></code> represent the first source color R, G, B, and A components, respectively.</li>
            <li><code>R<sub>d</sub>, G<sub>d</sub>, B<sub>d</sub></code> and <code>A<sub>d</sub></code> represent the R, G, B, and A components of the destination color. That is, the color currently in the corresponding color attachment for this fragment/sample.</li>
            <li><code>S<sub>r</sub>, S<sub>g</sub>, S<sub>b</sub></code> and <code>S<sub>a</sub></code> represent the source blend factor R, G, B, and A components, respectively.</li>
            <li><code>D<sub>r</sub>, D<sub>g</sub>, D<sub>b</sub></code> and <code>D<sub>a</sub></code> represent the destination blend factor R, G, B, and A components, respectively.</li>
        </ul>

        The blending operation produces a new set of values <code>R, G, B</code> and <code>A</code>, which are written to the framebuffer attachment. If blending is not enabled for this attachment, then <code>R, G, B</code> and <code>A</code> are assigned <code>R<sub>s0</sub>, G<sub>s0</sub>, B<sub>s0</sub></code> and <code>A<sub>s0</sub></code>, respectively.

        If the color attachment is fixed-point, the components of the source and destination values and blend factors are each clamped to <code>[0,1]</code> or <code>[-1,1]</code> respectively for an unsigned normalized or signed normalized color attachment prior to evaluating the blend operations. If the color attachment is floating-point, no clamping occurs.

        <h5>See Also</h5>
        ##VkPipelineColorBlendAttachmentState
        """,

        "BLEND_OP_ADD".."0",
        "BLEND_OP_SUBTRACT".."1",
        "BLEND_OP_REVERSE_SUBTRACT".."2",
        "BLEND_OP_MIN".."3",
        "BLEND_OP_MAX".."4"
    )

    EnumConstant(
        """
        VkColorComponentFlagBits - Bitmask controlling which components are written to the framebuffer

        <h5>Description</h5>
        <ul>
            <li>#COLOR_COMPONENT_R_BIT specifies that the <code>R</code> value is written to the color attachment for the appropriate sample. Otherwise, the value in memory is unmodified.</li>
            <li>#COLOR_COMPONENT_G_BIT specifies that the <code>G</code> value is written to the color attachment for the appropriate sample. Otherwise, the value in memory is unmodified.</li>
            <li>#COLOR_COMPONENT_B_BIT specifies that the <code>B</code> value is written to the color attachment for the appropriate sample. Otherwise, the value in memory is unmodified.</li>
            <li>#COLOR_COMPONENT_A_BIT specifies that the <code>A</code> value is written to the color attachment for the appropriate sample. Otherwise, the value in memory is unmodified.</li>
        </ul>

        The color write mask operation is applied regardless of whether blending is enabled.

        <h5>See Also</h5>
        {@code VkColorComponentFlags}
        """,

        "COLOR_COMPONENT_R_BIT".enum(0x00000001),
        "COLOR_COMPONENT_G_BIT".enum(0x00000002),
        "COLOR_COMPONENT_B_BIT".enum(0x00000004),
        "COLOR_COMPONENT_A_BIT".enum(0x00000008)
    )

    EnumConstant(
        """
        VkDynamicState - Indicate which dynamic state is taken from dynamic state commands

        <h5>Description</h5>
        <ul>
            <li>#DYNAMIC_STATE_VIEWPORT specifies that the {@code pViewports} state in ##VkPipelineViewportStateCreateInfo will be ignored and <b>must</b> be set dynamically with #CmdSetViewport() before any draw commands. The number of viewports used by a pipeline is still specified by the {@code viewportCount} member of ##VkPipelineViewportStateCreateInfo.</li>
            <li>#DYNAMIC_STATE_SCISSOR specifies that the {@code pScissors} state in ##VkPipelineViewportStateCreateInfo will be ignored and <b>must</b> be set dynamically with #CmdSetScissor() before any draw commands. The number of scissor rectangles used by a pipeline is still specified by the {@code scissorCount} member of ##VkPipelineViewportStateCreateInfo.</li>
            <li>#DYNAMIC_STATE_LINE_WIDTH specifies that the {@code lineWidth} state in ##VkPipelineRasterizationStateCreateInfo will be ignored and <b>must</b> be set dynamically with #CmdSetLineWidth() before any draw commands that generate line primitives for the rasterizer.</li>
            <li>#DYNAMIC_STATE_DEPTH_BIAS specifies that the {@code depthBiasConstantFactor}, {@code depthBiasClamp} and {@code depthBiasSlopeFactor} states in ##VkPipelineRasterizationStateCreateInfo will be ignored and <b>must</b> be set dynamically with #CmdSetDepthBias() before any draws are performed with {@code depthBiasEnable} in ##VkPipelineRasterizationStateCreateInfo set to #TRUE.</li>
            <li>#DYNAMIC_STATE_BLEND_CONSTANTS specifies that the {@code blendConstants} state in ##VkPipelineColorBlendStateCreateInfo will be ignored and <b>must</b> be set dynamically with #CmdSetBlendConstants() before any draws are performed with a pipeline state with ##VkPipelineColorBlendAttachmentState member {@code blendEnable} set to #TRUE and any of the blend functions using a constant blend color.</li>
            <li>#DYNAMIC_STATE_DEPTH_BOUNDS specifies that the {@code minDepthBounds} and {@code maxDepthBounds} states of ##VkPipelineDepthStencilStateCreateInfo will be ignored and <b>must</b> be set dynamically with #CmdSetDepthBounds() before any draws are performed with a pipeline state with ##VkPipelineDepthStencilStateCreateInfo member {@code depthBoundsTestEnable} set to #TRUE.</li>
            <li>#DYNAMIC_STATE_STENCIL_COMPARE_MASK specifies that the {@code compareMask} state in ##VkPipelineDepthStencilStateCreateInfo for both {@code front} and {@code back} will be ignored and <b>must</b> be set dynamically with #CmdSetStencilCompareMask() before any draws are performed with a pipeline state with ##VkPipelineDepthStencilStateCreateInfo member {@code stencilTestEnable} set to #TRUE</li>
            <li>#DYNAMIC_STATE_STENCIL_WRITE_MASK specifies that the {@code writeMask} state in ##VkPipelineDepthStencilStateCreateInfo for both {@code front} and {@code back} will be ignored and <b>must</b> be set dynamically with #CmdSetStencilWriteMask() before any draws are performed with a pipeline state with ##VkPipelineDepthStencilStateCreateInfo member {@code stencilTestEnable} set to #TRUE</li>
            <li>#DYNAMIC_STATE_STENCIL_REFERENCE specifies that the {@code reference} state in ##VkPipelineDepthStencilStateCreateInfo for both {@code front} and {@code back} will be ignored and <b>must</b> be set dynamically with #CmdSetStencilReference() before any draws are performed with a pipeline state with ##VkPipelineDepthStencilStateCreateInfo member {@code stencilTestEnable} set to #TRUE</li>
            <li>#DYNAMIC_STATE_VIEWPORT_W_SCALING_NV specifies that the {@code pViewportScalings} state in ##VkPipelineViewportWScalingStateCreateInfoNV will be ignored and <b>must</b> be set dynamically with #CmdSetViewportWScalingNV() before any draws are performed with a pipeline state with {@code VkPipelineViewportWScalingStateCreateInfo} member {@code viewportScalingEnable} set to #TRUE</li>
            <li>#DYNAMIC_STATE_DISCARD_RECTANGLES_EXT specifies that the {@code pDiscardRectangles} state in ##VkPipelineDiscardRectangleStateCreateInfoEXT will be ignored and <b>must</b> be set dynamically with #CmdSetDiscardRectangleEXT() before any draw or clear commands. The {@code VkDiscardRectangleModeEXT} and the number of active discard rectangles is still specified by the {@code discardRectangleMode} and {@code discardRectangleCount} members of ##VkPipelineDiscardRectangleStateCreateInfoEXT.</li>
        </ul>

        <h5>See Also</h5>
        ##VkPipelineDynamicStateCreateInfo
        """,

        "DYNAMIC_STATE_VIEWPORT".."0",
        "DYNAMIC_STATE_SCISSOR".."1",
        "DYNAMIC_STATE_LINE_WIDTH".."2",
        "DYNAMIC_STATE_DEPTH_BIAS".."3",
        "DYNAMIC_STATE_BLEND_CONSTANTS".."4",
        "DYNAMIC_STATE_DEPTH_BOUNDS".."5",
        "DYNAMIC_STATE_STENCIL_COMPARE_MASK".."6",
        "DYNAMIC_STATE_STENCIL_WRITE_MASK".."7",
        "DYNAMIC_STATE_STENCIL_REFERENCE".."8"
    )

    EnumConstant(
        """
        VkFilter - Specify filters used for texture lookups

        <h5>Description</h5>
        <ul>
            <li>#FILTER_NEAREST specifies nearest filtering.</li>
            <li>#FILTER_LINEAR specifies linear filtering.</li>
        </ul>

        These filters are described in detail in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#textures-texel-filtering">Texel Filtering</a>.

        <h5>See Also</h5>
        ##VkSamplerCreateInfo, #CmdBlitImage()
        """,

        "FILTER_NEAREST".."0",
        "FILTER_LINEAR".."1"
    )

    EnumConstant(
        """
        VkSamplerMipmapMode - Specify mipmap mode used for texture lookups

        <h5>Description</h5>
        <ul>
            <li>#SAMPLER_MIPMAP_MODE_NEAREST specifies nearest filtering.</li>
            <li>#SAMPLER_MIPMAP_MODE_LINEAR specifies linear filtering.</li>
        </ul>

        These modes are described in detail in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#textures-texel-filtering">Texel Filtering</a>.

        <h5>See Also</h5>
        ##VkSamplerCreateInfo
        """,

        "SAMPLER_MIPMAP_MODE_NEAREST".."0",
        "SAMPLER_MIPMAP_MODE_LINEAR".."1"
    )

    EnumConstant(
        """
        VkSamplerAddressMode - Specify behavior of sampling with texture coordinates outside an image

        <h5>Description</h5>
        <ul>
            <li>#SAMPLER_ADDRESS_MODE_REPEAT specifies that the repeat wrap mode will be used.</li>
            <li>#SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT specifies that the mirrored repeat wrap mode will be used.</li>
            <li>#SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE specifies that the clamp to edge wrap mode will be used.</li>
            <li>#SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER specifies that the clamp to border wrap mode will be used.</li>
            <li>#SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE specifies that the mirror clamp to edge wrap mode will be used. This is only valid if the VK_KHR_mirror_clamp_to_edge extension is enabled.</li>
        </ul>

        <h5>See Also</h5>
        ##VkSamplerCreateInfo
        """,

        "SAMPLER_ADDRESS_MODE_REPEAT".."0",
        "SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT".."1",
        "SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE".."2",
        "SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER".."3"
    )

    EnumConstant(
        """
        VkBorderColor - Specify border color used for texture lookups

        <h5>Description</h5>
        <ul>
            <li>#BORDER_COLOR_FLOAT_TRANSPARENT_BLACK specifies a transparent, floating-point format, black color.</li>
            <li>#BORDER_COLOR_INT_TRANSPARENT_BLACK specifies a transparent, integer format, black color.</li>
            <li>#BORDER_COLOR_FLOAT_OPAQUE_BLACK specifies an opaque, floating-point format, black color.</li>
            <li>#BORDER_COLOR_INT_OPAQUE_BLACK specifies an opaque, integer format, black color.</li>
            <li>#BORDER_COLOR_FLOAT_OPAQUE_WHITE specifies an opaque, floating-point format, white color.</li>
            <li>#BORDER_COLOR_INT_OPAQUE_WHITE specifies an opaque, integer format, white color.</li>
        </ul>

        These colors are described in detail in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#textures-texel-replacement">Texel Replacement</a>.

        <h5>See Also</h5>
        ##VkSamplerCreateInfo
        """,

        "BORDER_COLOR_FLOAT_TRANSPARENT_BLACK".."0",
        "BORDER_COLOR_INT_TRANSPARENT_BLACK".."1",
        "BORDER_COLOR_FLOAT_OPAQUE_BLACK".."2",
        "BORDER_COLOR_INT_OPAQUE_BLACK".."3",
        "BORDER_COLOR_FLOAT_OPAQUE_WHITE".."4",
        "BORDER_COLOR_INT_OPAQUE_WHITE".."5"
    )

    EnumConstant(
        """
        VkDescriptorType - Specifies the type of a descriptor in a descriptor set

        <h5>Description</h5>
        <ul>
            <li>#DESCRIPTOR_TYPE_UNIFORM_BUFFER, #DESCRIPTOR_TYPE_STORAGE_BUFFER, #DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC, or #DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC specify that the elements of the ##VkWriteDescriptorSet{@code ::pBufferInfo} array of ##VkDescriptorBufferInfo structures will be used to update the descriptors, and other arrays will be ignored.</li>
            <li>#DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER or #DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER specify that the ##VkWriteDescriptorSet{@code ::pTexelBufferView} array will be used to update the descriptors, and other arrays will be ignored.</li>
            <li>#DESCRIPTOR_TYPE_SAMPLER, #DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER, #DESCRIPTOR_TYPE_SAMPLED_IMAGE, #DESCRIPTOR_TYPE_STORAGE_IMAGE, or #DESCRIPTOR_TYPE_INPUT_ATTACHMENT specify that the elements of the ##VkWriteDescriptorSet{@code ::pImageInfo} array of ##VkDescriptorImageInfo structures will be used to update the descriptors, and other arrays will be ignored.</li>
        </ul>

        <h5>See Also</h5>
        ##VkDescriptorPoolSize, ##VkDescriptorSetLayoutBinding, ##VkDescriptorUpdateTemplateEntryKHR, ##VkWriteDescriptorSet
        """,

        "DESCRIPTOR_TYPE_SAMPLER".."0",
        "DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER".."1",
        "DESCRIPTOR_TYPE_SAMPLED_IMAGE".."2",
        "DESCRIPTOR_TYPE_STORAGE_IMAGE".."3",
        "DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER".."4",
        "DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER".."5",
        "DESCRIPTOR_TYPE_UNIFORM_BUFFER".."6",
        "DESCRIPTOR_TYPE_STORAGE_BUFFER".."7",
        "DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC".."8",
        "DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC".."9",
        "DESCRIPTOR_TYPE_INPUT_ATTACHMENT".."10"
    )

    EnumConstant(
        """
        VkDescriptorPoolCreateFlagBits - Bitmask specifying certain supported operations on a descriptor pool

        <h5>Description</h5>
        <ul>
            <li>#DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT specifies that descriptor sets <b>can</b> return their individual allocations to the pool, i.e. all of #AllocateDescriptorSets(), #FreeDescriptorSets(), and #ResetDescriptorPool() are allowed. Otherwise, descriptor sets allocated from the pool <b>must</b> not be individually freed back to the pool, i.e. only #AllocateDescriptorSets() and #ResetDescriptorPool() are allowed.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkDescriptorPoolCreateFlags}
        """,

        "DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT".enum(0x00000001)
    )

    EnumConstant(
        """
        VkAttachmentDescriptionFlagBits - Bitmask specifying additional properties of an attachment

        <h5>Description</h5>
        <ul>
            <li>#ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT specifies that the attachment aliases the same device memory as other attachments.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkAttachmentDescriptionFlags}
        """,

        "ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT".enum(0x00000001)
    )

    EnumConstant(
        """
        VkAttachmentLoadOp - Specify how contents of an attachment are treated at the beginning of a subpass

        <h5>Description</h5>
        <ul>
            <li>#ATTACHMENT_LOAD_OP_LOAD specifies that the previous contents of the image within the render area will be preserved. For attachments with a depth/stencil format, this uses the access type #ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT. For attachments with a color format, this uses the access type #ACCESS_COLOR_ATTACHMENT_READ_BIT.</li>
            <li>#ATTACHMENT_LOAD_OP_CLEAR specifies that the contents within the render area will be cleared to a uniform value, which is specified when a render pass instance is begun. For attachments with a depth/stencil format, this uses the access type #ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT. For attachments with a color format, this uses the access type #ACCESS_COLOR_ATTACHMENT_WRITE_BIT.</li>
            <li>#ATTACHMENT_LOAD_OP_DONT_CARE specifies that the previous contents within the area need not be preserved; the contents of the attachment will be undefined inside the render area. For attachments with a depth/stencil format, this uses the access type #ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT. For attachments with a color format, this uses the access type #ACCESS_COLOR_ATTACHMENT_WRITE_BIT.</li>
        </ul>

        <h5>See Also</h5>
        ##VkAttachmentDescription
        """,

        "ATTACHMENT_LOAD_OP_LOAD".."0",
        "ATTACHMENT_LOAD_OP_CLEAR".."1",
        "ATTACHMENT_LOAD_OP_DONT_CARE".."2"
    )

    EnumConstant(
        """
        VkAttachmentStoreOp - Specify how contents of an attachment are treated at the end of a subpass

        <h5>Description</h5>
        <ul>
            <li>#ATTACHMENT_STORE_OP_STORE specifies the contents generated during the render pass and within the render area are written to memory. For attachments with a depth/stencil format, this uses the access type #ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT. For attachments with a color format, this uses the access type #ACCESS_COLOR_ATTACHMENT_WRITE_BIT.</li>
            <li>#ATTACHMENT_STORE_OP_DONT_CARE specifies the contents within the render area are not needed after rendering, and <b>may</b> be discarded; the contents of the attachment will be undefined inside the render area. For attachments with a depth/stencil format, this uses the access type #ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT. For attachments with a color format, this uses the access type #ACCESS_COLOR_ATTACHMENT_WRITE_BIT.</li>
        </ul>

        <h5>See Also</h5>
        ##VkAttachmentDescription
        """,

        "ATTACHMENT_STORE_OP_STORE".."0",
        "ATTACHMENT_STORE_OP_DONT_CARE".."1"
    )

    EnumConstant(
        """
        VkPipelineBindPoint - Specify the bind point of a pipeline object to a command buffer

        <h5>Description</h5>
        <ul>
            <li>#PIPELINE_BIND_POINT_COMPUTE specifies binding as a compute pipeline.</li>
            <li>#PIPELINE_BIND_POINT_GRAPHICS specifies binding as a graphics pipeline.</li>
        </ul>

        <h5>See Also</h5>
        ##VkDescriptorUpdateTemplateCreateInfoKHR, ##VkIndirectCommandsLayoutCreateInfoNVX, ##VkSubpassDescription, #CmdBindDescriptorSets(), #CmdBindPipeline(), #CmdPushDescriptorSetKHR()
        """,

        "PIPELINE_BIND_POINT_GRAPHICS".."0",
        "PIPELINE_BIND_POINT_COMPUTE".."1"
    )

    EnumConstant(
        """
        VkAccessFlagBits - Bitmask specifying memory access types that will participate in a memory dependency

        <h5>Description</h5>
        <ul>
            <li>#ACCESS_INDIRECT_COMMAND_READ_BIT specifies read access to an indirect command structure read as part of an indirect drawing or dispatch command.</li>
            <li>#ACCESS_INDEX_READ_BIT specifies read access to an index buffer as part of an indexed drawing command, bound by #CmdBindIndexBuffer().</li>
            <li>#ACCESS_VERTEX_ATTRIBUTE_READ_BIT specifies read access to a vertex buffer as part of a drawing command, bound by #CmdBindVertexBuffers().</li>
            <li>#ACCESS_UNIFORM_READ_BIT specifies read access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#descriptorsets-uniformbuffer">uniform buffer</a>.</li>
            <li>#ACCESS_INPUT_ATTACHMENT_READ_BIT specifies read access to an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#renderpass">input attachment</a> within a renderpass during fragment shading.</li>
            <li>#ACCESS_SHADER_READ_BIT specifies read access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#descriptorsets-storagebuffer">storage buffer</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#descriptorsets-uniformtexelbuffer">uniform texel buffer</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#descriptorsets-storagetexelbuffer">storage texel buffer</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#descriptorsets-sampledimage">sampled image</a>, or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#descriptorsets-storageimage">storage image</a>.</li>
            <li>#ACCESS_SHADER_WRITE_BIT specifies write access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#descriptorsets-storagebuffer">storage buffer</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#descriptorsets-storagetexelbuffer">storage texel buffer</a>, or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#descriptorsets-storageimage">storage image</a>.</li>
            <li>#ACCESS_COLOR_ATTACHMENT_READ_BIT specifies read access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#renderpass">color attachment</a>, such as via <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#framebuffer-blending">blending</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#framebuffer-logicop">logic operations</a>, or via certain <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#renderpass-load-store-ops">subpass load operations</a>.</li>
            <li>#ACCESS_COLOR_ATTACHMENT_WRITE_BIT specifies write access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#renderpass">color or resolve attachment</a> during a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#renderpass">render pass</a> or via certain <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#renderpass-load-store-ops">subpass load and store operations</a>.</li>
            <li>#ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT specifies read access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#renderpass">depth/stencil attachment</a>, via <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#fragops-ds-state">depth or stencil operations</a> or via certain <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#renderpass-load-store-ops">subpass load operations</a>.</li>
            <li>#ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT specifies write access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#renderpass">depth/stencil attachment</a>, via <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#fragops-ds-state">depth or stencil operations</a> or via certain <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#renderpass-load-store-ops">subpass load and store operations</a>.</li>
            <li>#ACCESS_TRANSFER_READ_BIT specifies read access to an image or buffer in a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#copies">copy</a> operation.</li>
            <li>#ACCESS_TRANSFER_WRITE_BIT specifies write access to an image or buffer in a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#clears">clear</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#copies">copy</a> operation.</li>
            <li>#ACCESS_HOST_READ_BIT specifies read access by a host operation. Accesses of this type are not performed through a resource, but directly on memory.</li>
            <li>#ACCESS_HOST_WRITE_BIT specifies write access by a host operation. Accesses of this type are not performed through a resource, but directly on memory.</li>
            <li>#ACCESS_MEMORY_READ_BIT specifies read access via non-specific entities. These entities include the Vulkan device and host, but <b>may</b> also include entities external to the Vulkan device or otherwise not part of the core Vulkan pipeline. When included in a destination access mask, makes all available writes visible to all future read accesses on entities known to the Vulkan device.</li>
            <li>#ACCESS_MEMORY_WRITE_BIT specifies write access via non-specific entities. These entities include the Vulkan device and host, but <b>may</b> also include entities external to the Vulkan device or otherwise not part of the core Vulkan pipeline. When included in a source access mask, all writes that are performed by entities known to the Vulkan device are made available. When included in a destination access mask, makes all available writes visible to all future write accesses on entities known to the Vulkan device.</li>
            <li>#ACCESS_COMMAND_PROCESS_READ_BIT_NVX specifies reads from {@code VkBuffer} inputs to #CmdProcessCommandsNVX().</li>
            <li>#ACCESS_COMMAND_PROCESS_WRITE_BIT_NVX specifies writes to the target command buffer in #CmdProcessCommandsNVX().</li>
        </ul>

        Certain access types are only performed by a subset of pipeline stages. Any synchronization command that takes both stage masks and access masks uses both to define the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-dependencies-access-scopes">access scopes</a> - only the specified access types performed by the specified stages are included in the access scope. An application <b>must</b> not specify an access flag in a synchronization command if it does not include a pipeline stage in the corresponding stage mask that is able to perform accesses of that type. The following table lists, for each access flag, which pipeline stages <b>can</b> perform that type of access.

        <h6>Supported access types</h6>
        <table class="lwjgl">
            <thead><tr><th>Access flag</th><th>Supported pipeline stages</th></tr></thead>
            <tbody>
                <tr><td>#ACCESS_INDIRECT_COMMAND_READ_BIT</td><td>#PIPELINE_STAGE_DRAW_INDIRECT_BIT</td></tr>
                <tr><td>#ACCESS_INDEX_READ_BIT</td><td>#PIPELINE_STAGE_VERTEX_INPUT_BIT</td></tr>
                <tr><td>#ACCESS_VERTEX_ATTRIBUTE_READ_BIT</td><td>#PIPELINE_STAGE_VERTEX_INPUT_BIT</td></tr>
                <tr><td>#ACCESS_UNIFORM_READ_BIT</td><td>#PIPELINE_STAGE_VERTEX_SHADER_BIT, #PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT, #PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT, #PIPELINE_STAGE_GEOMETRY_SHADER_BIT, #PIPELINE_STAGE_FRAGMENT_SHADER_BIT, or #PIPELINE_STAGE_COMPUTE_SHADER_BIT</td></tr>
                <tr><td>#ACCESS_INPUT_ATTACHMENT_READ_BIT</td><td>#PIPELINE_STAGE_FRAGMENT_SHADER_BIT</td></tr>
                <tr><td>#ACCESS_SHADER_READ_BIT</td><td>#PIPELINE_STAGE_VERTEX_SHADER_BIT, #PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT, #PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT, #PIPELINE_STAGE_GEOMETRY_SHADER_BIT, #PIPELINE_STAGE_FRAGMENT_SHADER_BIT, or #PIPELINE_STAGE_COMPUTE_SHADER_BIT</td></tr>
                <tr><td>#ACCESS_SHADER_WRITE_BIT</td><td>#PIPELINE_STAGE_VERTEX_SHADER_BIT, #PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT, #PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT, #PIPELINE_STAGE_GEOMETRY_SHADER_BIT, #PIPELINE_STAGE_FRAGMENT_SHADER_BIT, or #PIPELINE_STAGE_COMPUTE_SHADER_BIT</td></tr>
                <tr><td>#ACCESS_COLOR_ATTACHMENT_READ_BIT</td><td>#PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT</td></tr>
                <tr><td>#ACCESS_COLOR_ATTACHMENT_WRITE_BIT</td><td>#PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT</td></tr>
                <tr><td>#ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT</td><td>#PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT, or #PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT</td></tr>
                <tr><td>#ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT</td><td>#PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT, or #PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT</td></tr>
                <tr><td>#ACCESS_TRANSFER_READ_BIT</td><td>#PIPELINE_STAGE_TRANSFER_BIT</td></tr>
                <tr><td>#ACCESS_TRANSFER_WRITE_BIT</td><td>#PIPELINE_STAGE_TRANSFER_BIT</td></tr>
                <tr><td>#ACCESS_HOST_READ_BIT</td><td>#PIPELINE_STAGE_HOST_BIT</td></tr>
                <tr><td>#ACCESS_HOST_WRITE_BIT</td><td>#PIPELINE_STAGE_HOST_BIT</td></tr>
                <tr><td>#ACCESS_MEMORY_READ_BIT</td><td>N/A</td></tr>
                <tr><td>#ACCESS_MEMORY_WRITE_BIT</td><td>N/A</td></tr>
                <tr><td>#ACCESS_COMMAND_PROCESS_READ_BIT_NVX</td><td>#PIPELINE_STAGE_COMMAND_PROCESS_BIT_NVX</td></tr>
                <tr><td>#ACCESS_COMMAND_PROCESS_WRITE_BIT_NVX</td><td>#PIPELINE_STAGE_COMMAND_PROCESS_BIT_NVX</td></tr>
            </tbody>
        </table>

        If a memory object does not have the #MEMORY_PROPERTY_HOST_COHERENT_BIT property, then #FlushMappedMemoryRanges() <b>must</b> be called in order to guarantee that writes to the memory object from the host are made visible to the #ACCESS_HOST_WRITE_BIT <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-access-types">access type</a>, where it <b>can</b> be further made available to the device by <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization">synchronization commands</a>. Similarly, #InvalidateMappedMemoryRanges() <b>must</b> be called to guarantee that writes which are visible to the #ACCESS_HOST_READ_BIT <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-access-types">access type</a> are made visible to host operations.

        If the memory object does have the #MEMORY_PROPERTY_HOST_COHERENT_BIT property flag, writes to the memory object from the host are automatically made visible to the #ACCESS_HOST_WRITE_BIT <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-access-types">access type</a>. Similarly, writes made visible to the #ACCESS_HOST_READ_BIT <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-access-types">access type</a> are automatically made visible to the host.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The #QueueSubmit() command <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-submission-host-writes">automatically guarantees that host writes flushed to #ACCESS_HOST_WRITE_BIT are made available</a> if they were flushed before the command executed, so in most cases an explicit memory barrier is not needed for this case. In the few circumstances where a submit does not occur between the host write and the device read access, writes <b>can</b> be made available by using an explicit memory barrier.
        </div>

        <h5>See Also</h5>
        {@code VkAccessFlags}
        """,

        "ACCESS_INDIRECT_COMMAND_READ_BIT".enum(0x00000001),
        "ACCESS_INDEX_READ_BIT".enum(0x00000002),
        "ACCESS_VERTEX_ATTRIBUTE_READ_BIT".enum(0x00000004),
        "ACCESS_UNIFORM_READ_BIT".enum(0x00000008),
        "ACCESS_INPUT_ATTACHMENT_READ_BIT".enum(0x00000010),
        "ACCESS_SHADER_READ_BIT".enum(0x00000020),
        "ACCESS_SHADER_WRITE_BIT".enum(0x00000040),
        "ACCESS_COLOR_ATTACHMENT_READ_BIT".enum(0x00000080),
        "ACCESS_COLOR_ATTACHMENT_WRITE_BIT".enum(0x00000100),
        "ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT".enum(0x00000200),
        "ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT".enum(0x00000400),
        "ACCESS_TRANSFER_READ_BIT".enum(0x00000800),
        "ACCESS_TRANSFER_WRITE_BIT".enum(0x00001000),
        "ACCESS_HOST_READ_BIT".enum(0x00002000),
        "ACCESS_HOST_WRITE_BIT".enum(0x00004000),
        "ACCESS_MEMORY_READ_BIT".enum(0x00008000),
        "ACCESS_MEMORY_WRITE_BIT".enum(0x00010000)
    )

    EnumConstant(
        """
        VkDependencyFlagBits - Bitmask specifying how execution and memory dependencies are formed

        <h5>Description</h5>
        <ul>
            <li>#DEPENDENCY_BY_REGION_BIT specifies that dependencies will be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-framebuffer-regions">framebuffer-local</a>.</li>
            <li>#DEPENDENCY_VIEW_LOCAL_BIT_KHX specifies that a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-barriers-subpass-self-dependencies">subpass has more than one view</a>.</li>
            <li>#DEPENDENCY_DEVICE_GROUP_BIT_KHX specifies that dependencies are <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-device-local-dependencies">non-device-local dependency</a>.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkDependencyFlags}
        """,

        "DEPENDENCY_BY_REGION_BIT".enum(0x00000001)
    )

    EnumConstant(
        """
        VkCommandPoolCreateFlagBits - Bitmask specifying usage behavior for a command pool

        <h5>Description</h5>
        <ul>
            <li>#COMMAND_POOL_CREATE_TRANSIENT_BIT indicates that command buffers allocated from the pool will be short-lived, meaning that they will be reset or freed in a relatively short timeframe. This flag <b>may</b> be used by the implementation to control memory allocation behavior within the pool.</li>
            <li>#COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT allows any command buffer allocated from a pool to be individually reset to the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">initial state</a>; either by calling #ResetCommandBuffer(), or via the implicit reset when calling #BeginCommandBuffer(). If this flag is not set on a pool, then #ResetCommandBuffer() <b>must</b> not be called for any command buffer allocated from that pool.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkCommandPoolCreateFlags}
        """,

        "COMMAND_POOL_CREATE_TRANSIENT_BIT".enum(0x00000001),
        "COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT".enum(0x00000002)
    )

    EnumConstant(
        """
        VkCommandPoolResetFlagBits - Bitmask controlling behavior of a command pool reset

        <h5>Description</h5>
        <ul>
            <li>#COMMAND_POOL_RESET_RELEASE_RESOURCES_BIT specifies that resetting a command pool recycles all of the resources from the command pool back to the system.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkCommandPoolResetFlags}
        """,

        "COMMAND_POOL_RESET_RELEASE_RESOURCES_BIT".enum(0x00000001)
    )

    EnumConstant(
        """
        VkCommandBufferLevel - Enumerant specifying a command buffer level

        <h5>Description</h5>
        <ul>
            <li>#COMMAND_BUFFER_LEVEL_PRIMARY specifies a primary command buffer.</li>
            <li>#COMMAND_BUFFER_LEVEL_SECONDARY specifies a secondary command buffer.</li>
        </ul>

        <h5>See Also</h5>
        ##VkCommandBufferAllocateInfo
        """,

        "COMMAND_BUFFER_LEVEL_PRIMARY".."0",
        "COMMAND_BUFFER_LEVEL_SECONDARY".."1"
    )

    EnumConstant(
        """
        VkCommandBufferUsageFlagBits - Bitmask specifying usage behavior for command buffer

        <h5>Description</h5>
        <ul>
            <li>#COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT specifies that each recording of the command buffer will only be submitted once, and the command buffer will be reset and recorded again between each submission.</li>
            <li>#COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT specifies that a secondary command buffer is considered to be entirely inside a render pass. If this is a primary command buffer, then this bit is ignored.</li>
            <li>#COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT specifies that a command buffer <b>can</b> be resubmitted to a queue while it is in the <em>pending state</em>, and recorded into multiple primary command buffers.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkCommandBufferUsageFlags}
        """,

        "COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT".enum(0x00000001),
        "COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT".enum(0x00000002),
        "COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT".enum(0x00000004)
    )

    EnumConstant(
        """
        VkQueryControlFlagBits - Bitmask specifying constraints on a query

        <h5>Description</h5>
        <ul>
            <li>#QUERY_CONTROL_PRECISE_BIT specifies the precision of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#queries-occlusion">occlusion queries</a>.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkQueryControlFlags}
        """,

        "QUERY_CONTROL_PRECISE_BIT".enum(0x00000001)
    )

    EnumConstant(
        """
        VkCommandBufferResetFlagBits - Bitmask controlling behavior of a command buffer reset

        <h5>Description</h5>
        <ul>
            <li>#COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT specifies that most or all memory resources currently owned by the command buffer <b>should</b> be returned to the parent command pool. If this flag is not set, then the command buffer <b>may</b> hold onto memory resources and reuse them when recording commands. {@code commandBuffer} is moved to the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">initial state</a>.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkCommandBufferResetFlags}
        """,

        "COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT".enum(0x00000001)
    )

    EnumConstant(
        """
        VkStencilFaceFlagBits - Bitmask specifying sets of stencil state for which to update the compare mask

        <h5>Description</h5>
        <ul>
            <li>#STENCIL_FACE_FRONT_BIT specifies that only the front set of stencil state is updated.</li>
            <li>#STENCIL_FACE_BACK_BIT specifies that only the back set of stencil state is updated.</li>
            <li>#STENCIL_FRONT_AND_BACK is the combination of #STENCIL_FACE_FRONT_BIT and #STENCIL_FACE_BACK_BIT, and specifies that both sets of stencil state are updated.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkStencilFaceFlags}
        """,

        "STENCIL_FACE_FRONT_BIT".enum(0x00000001),
        "STENCIL_FACE_BACK_BIT".enum(0x00000002),
        "STENCIL_FRONT_AND_BACK".."0x00000003"
    )

    EnumConstant(
        """
        VkIndexType - Type of index buffer indices

        <h5>Description</h5>
        <ul>
            <li>#INDEX_TYPE_UINT16 specifies that indices are 16-bit unsigned integer values.</li>
            <li>#INDEX_TYPE_UINT32 specifies that indices are 32-bit unsigned integer values.</li>
        </ul>

        <h5>See Also</h5>
        UNKNOWN:Type, ##VkObjectTableIndexBufferEntryNVX, UNKNOWN:buffer, UNKNOWN:index, UNKNOWN:indices, UNKNOWN:of, #CmdBindIndexBuffer()
        """,

        "INDEX_TYPE_UINT16".."0",
        "INDEX_TYPE_UINT32".."1"
    )

    EnumConstant(
        """
        VkSubpassContents - Specify how commands in the first subpass of a render pass are provided

        <h5>Description</h5>
        <ul>
            <li>#SUBPASS_CONTENTS_INLINE specifies that the contents of the subpass will be recorded inline in the primary command buffer, and secondary command buffers <b>must</b> not be executed within the subpass.</li>
            <li>#SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS specifies that the contents are recorded in secondary command buffers that will be called from the primary command buffer, and #CmdExecuteCommands() is the only valid command on the command buffer until #CmdNextSubpass() or #CmdEndRenderPass().</li>
        </ul>

        <h5>See Also</h5>
        #CmdBeginRenderPass(), #CmdNextSubpass()
        """,

        "SUBPASS_CONTENTS_INLINE".."0",
        "SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS".."1"
    )

    EnumConstant(
        """
        VkObjectType - Specify an enumeration to track object handle types

        <h5>See Also</h5>
        No cross-references are available
        """,

        "OBJECT_TYPE_UNKNOWN".."0",
        "OBJECT_TYPE_INSTANCE".."1",
        "OBJECT_TYPE_PHYSICAL_DEVICE".."2",
        "OBJECT_TYPE_DEVICE".."3",
        "OBJECT_TYPE_QUEUE".."4",
        "OBJECT_TYPE_SEMAPHORE".."5",
        "OBJECT_TYPE_COMMAND_BUFFER".."6",
        "OBJECT_TYPE_FENCE".."7",
        "OBJECT_TYPE_DEVICE_MEMORY".."8",
        "OBJECT_TYPE_BUFFER".."9",
        "OBJECT_TYPE_IMAGE".."10",
        "OBJECT_TYPE_EVENT".."11",
        "OBJECT_TYPE_QUERY_POOL".."12",
        "OBJECT_TYPE_BUFFER_VIEW".."13",
        "OBJECT_TYPE_IMAGE_VIEW".."14",
        "OBJECT_TYPE_SHADER_MODULE".."15",
        "OBJECT_TYPE_PIPELINE_CACHE".."16",
        "OBJECT_TYPE_PIPELINE_LAYOUT".."17",
        "OBJECT_TYPE_RENDER_PASS".."18",
        "OBJECT_TYPE_PIPELINE".."19",
        "OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT".."20",
        "OBJECT_TYPE_SAMPLER".."21",
        "OBJECT_TYPE_DESCRIPTOR_POOL".."22",
        "OBJECT_TYPE_DESCRIPTOR_SET".."23",
        "OBJECT_TYPE_FRAMEBUFFER".."24",
        "OBJECT_TYPE_COMMAND_POOL".."25"
    )

    // Device initialization

    GlobalCommand..VkResult(
        "CreateInstance",
        """
        Create a new Vulkan instance.

        <h5>C Specification</h5>
        To create an instance object, call:

        <code><pre>
￿VkResult vkCreateInstance(
￿    const VkInstanceCreateInfo*                 pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkInstance*                                 pInstance);</pre></code>

        <h5>Description</h5>
        #CreateInstance() verifies that the requested layers exist. If not, #CreateInstance() will return #ERROR_LAYER_NOT_PRESENT. Next #CreateInstance() verifies that the requested extensions are supported (e.g. in the implementation or in any enabled instance layer) and if any requested extension is not supported, #CreateInstance() <b>must</b> return #ERROR_EXTENSION_NOT_PRESENT. After verifying and enabling the instance layers and extensions the {@code VkInstance} object is created and returned to the application. If a requested extension is only supported by a layer, both the layer and the extension need to be specified at #CreateInstance() time for the creation to succeed.

        <h5>Valid Usage</h5>
        <ul>
            <li>All <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#extended-functionality-extensions-dependencies">required extensions</a> for each extension in the ##VkInstanceCreateInfo{@code ::ppEnabledExtensionNames} list <b>must</b> also be present in that list.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid ##VkInstanceCreateInfo structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pInstance} <b>must</b> be a pointer to a {@code VkInstance} handle</li>
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
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_INITIALIZATION_FAILED</li>
                <li>#ERROR_LAYER_NOT_PRESENT</li>
                <li>#ERROR_EXTENSION_NOT_PRESENT</li>
                <li>#ERROR_INCOMPATIBLE_DRIVER</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkInstanceCreateInfo
        """,

        const..VkInstanceCreateInfo.p.IN("pCreateInfo", "points to an instance of ##VkInstanceCreateInfo controlling creation of the instance."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkInstance.p.OUT("pInstance", "points a {@code VkInstance} handle in which the resulting instance is returned.")
    )

    void(
        "DestroyInstance",
        """
        Destroy an instance of Vulkan.

        <h5>C Specification</h5>
        To destroy an instance, call:

        <code><pre>
￿void vkDestroyInstance(
￿    VkInstance                                  instance,
￿    const VkAllocationCallbacks*                pAllocator);</pre></code>

        <h5>Valid Usage</h5>
        <ul>
            <li>All child objects created using {@code instance} <b>must</b> have been destroyed prior to destroying {@code instance}</li>
            <li>If ##VkAllocationCallbacks were provided when {@code instance} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code instance} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>If {@code instance} is not {@code NULL}, {@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code instance} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkInstance.IN("instance", "the handle of the instance to destroy."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    VkResult(
        "EnumeratePhysicalDevices",
        """
        Enumerates the physical devices accessible to a Vulkan instance.

        <h5>C Specification</h5>
        To retrieve a list of physical device objects representing the physical devices installed in the system, call:

        <code><pre>
￿VkResult vkEnumeratePhysicalDevices(
￿    VkInstance                                  instance,
￿    uint32_t*                                   pPhysicalDeviceCount,
￿    VkPhysicalDevice*                           pPhysicalDevices);</pre></code>

        <h5>Description</h5>
        If {@code pPhysicalDevices} is {@code NULL}, then the number of physical devices available is returned in {@code pPhysicalDeviceCount}. Otherwise, {@code pPhysicalDeviceCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pPhysicalDevices} array, and on return the variable is overwritten with the number of handles actually written to {@code pPhysicalDevices}. If {@code pPhysicalDeviceCount} is less than the number of physical devices available, at most {@code pPhysicalDeviceCount} structures will be written. If {@code pPhysicalDeviceCount} is smaller than the number of physical devices available, #INCOMPLETE will be returned instead of #SUCCESS, to indicate that not all the available physical devices were returned.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
            <li>{@code pPhysicalDeviceCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pPhysicalDeviceCount} is not 0, and {@code pPhysicalDevices} is not {@code NULL}, {@code pPhysicalDevices} <b>must</b> be a pointer to an array of {@code pPhysicalDeviceCount} {@code VkPhysicalDevice} handles</li>
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
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_INITIALIZATION_FAILED</li>
            </ul></dd>
        </dl>
        """,

        VkInstance.IN("instance", "a handle to a Vulkan instance previously created with #CreateInstance()."),
        AutoSize("pPhysicalDevices")..Check(1)..uint32_t_p.INOUT("pPhysicalDeviceCount", "a pointer to an integer related to the number of physical devices available or queried, as described below."),
        nullable..VkPhysicalDevice.p.OUT("pPhysicalDevices", "either {@code NULL} or a pointer to an array of {@code VkPhysicalDevice} handles.")
    )

    void(
        "GetPhysicalDeviceFeatures",
        """
        Reports capabilities of a physical device.

        <h5>C Specification</h5>
        To query supported features, call:

        <code><pre>
￿void vkGetPhysicalDeviceFeatures(
￿    VkPhysicalDevice                            physicalDevice,
￿    VkPhysicalDeviceFeatures*                   pFeatures);</pre></code>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pFeatures} <b>must</b> be a pointer to a ##VkPhysicalDeviceFeatures structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkPhysicalDeviceFeatures
        """,

        VkPhysicalDevice.IN("physicalDevice", "the physical device from which to query the supported features."),
        VkPhysicalDeviceFeatures.p.OUT("pFeatures", "a pointer to a ##VkPhysicalDeviceFeatures structure in which the physical device features are returned. For each feature, a value of #TRUE indicates that the feature is supported on this physical device, and #FALSE indicates that the feature is not supported.")
    )

    void(
        "GetPhysicalDeviceFormatProperties",
        """
        Lists physical device's format capabilities.

        <h5>C Specification</h5>
        To query supported format features which are properties of the physical device, call:

        <code><pre>
￿void vkGetPhysicalDeviceFormatProperties(
￿    VkPhysicalDevice                            physicalDevice,
￿    VkFormat                                    format,
￿    VkFormatProperties*                         pFormatProperties);</pre></code>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
            <li>{@code pFormatProperties} <b>must</b> be a pointer to a ##VkFormatProperties structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkFormatProperties
        """,

        VkPhysicalDevice.IN("physicalDevice", "the physical device from which to query the format properties."),
        VkFormat.IN("format", "the format whose properties are queried."),
        VkFormatProperties.p.OUT("pFormatProperties", "a pointer to a ##VkFormatProperties structure in which physical device properties for {@code format} are returned.")
    )

    VkResult(
        "GetPhysicalDeviceImageFormatProperties",
        """
        Lists physical device's image format capabilities.

        <h5>C Specification</h5>
        To query additional capabilities specific to image types, call:

        <code><pre>
￿VkResult vkGetPhysicalDeviceImageFormatProperties(
￿    VkPhysicalDevice                            physicalDevice,
￿    VkFormat                                    format,
￿    VkImageType                                 type,
￿    VkImageTiling                               tiling,
￿    VkImageUsageFlags                           usage,
￿    VkImageCreateFlags                          flags,
￿    VkImageFormatProperties*                    pImageFormatProperties);</pre></code>

        <h5>Description</h5>
        The {@code format}, {@code type}, {@code tiling}, {@code usage}, and {@code flags} parameters correspond to parameters that would be consumed by #CreateImage() (as members of ##VkImageCreateInfo).

        If {@code format} is not a supported image format, or if the combination of {@code format}, {@code type}, {@code tiling}, {@code usage}, and {@code flags} is not supported for images, then #GetPhysicalDeviceImageFormatProperties() returns #ERROR_FORMAT_NOT_SUPPORTED.

        The limitations on an image format that are reported by #GetPhysicalDeviceImageFormatProperties() have the following property: if {@code usage1} and {@code usage2} of type {@code VkImageUsageFlags} are such that the bits set in {@code usage1} are a subset of the bits set in {@code usage2}, and {@code flags1} and {@code flags2} of type {@code VkImageCreateFlags} are such that the bits set in {@code flags1} are a subset of the bits set in {@code flags2}, then the limitations for {@code usage1} and {@code flags1} <b>must</b> be no more strict than the limitations for {@code usage2} and {@code flags2}, for all values of {@code format}, {@code type}, and {@code tiling}.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
            <li>{@code type} <b>must</b> be a valid {@code VkImageType} value</li>
            <li>{@code tiling} <b>must</b> be a valid {@code VkImageTiling} value</li>
            <li>{@code usage} <b>must</b> be a valid combination of {@code VkImageUsageFlagBits} values</li>
            <li>{@code usage} <b>must</b> not be 0</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkImageCreateFlagBits} values</li>
            <li>{@code pImageFormatProperties} <b>must</b> be a pointer to a ##VkImageFormatProperties structure</li>
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
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_FORMAT_NOT_SUPPORTED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkImageFormatProperties
        """,

        VkPhysicalDevice.IN("physicalDevice", "the physical device from which to query the image capabilities."),
        VkFormat.IN("format", "a {@code VkFormat} value specifying the image format, corresponding to ##VkImageCreateInfo{@code ::format}."),
        VkImageType.IN("type", "a {@code VkImageType} value specifying the image type, corresponding to ##VkImageCreateInfo{@code ::imageType}."),
        VkImageTiling.IN("tiling", "a {@code VkImageTiling} value specifying the image tiling, corresponding to ##VkImageCreateInfo{@code ::tiling}."),
        VkImageUsageFlags.IN("usage", "a bitmask of {@code VkImageUsageFlagBits} specifying the intended usage of the image, corresponding to ##VkImageCreateInfo{@code ::usage}."),
        VkImageCreateFlags.IN("flags", "a bitmask of {@code VkImageCreateFlagBits} specifying additional parameters of the image, corresponding to ##VkImageCreateInfo{@code ::flags}."),
        VkImageFormatProperties.p.OUT("pImageFormatProperties", "points to an instance of the ##VkImageFormatProperties structure in which capabilities are returned.")
    )

    void(
        "GetPhysicalDeviceProperties",
        """
        Returns properties of a physical device.

        <h5>C Specification</h5>
        To query general properties of physical devices once enumerated, call:

        <code><pre>
￿void vkGetPhysicalDeviceProperties(
￿    VkPhysicalDevice                            physicalDevice,
￿    VkPhysicalDeviceProperties*                 pProperties);</pre></code>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pProperties} <b>must</b> be a pointer to a ##VkPhysicalDeviceProperties structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkPhysicalDeviceProperties
        """,

        VkPhysicalDevice.IN("physicalDevice", "the handle to the physical device whose properties will be queried."),
        VkPhysicalDeviceProperties.p.OUT("pProperties", "points to an instance of the ##VkPhysicalDeviceProperties structure, that will be filled with returned information.")
    )

    void(
        "GetPhysicalDeviceQueueFamilyProperties",
        """
        Reports properties of the queues of the specified physical device.

        <h5>C Specification</h5>
        To query properties of queues available on a physical device, call:

        <code><pre>
￿void vkGetPhysicalDeviceQueueFamilyProperties(
￿    VkPhysicalDevice                            physicalDevice,
￿    uint32_t*                                   pQueueFamilyPropertyCount,
￿    VkQueueFamilyProperties*                    pQueueFamilyProperties);</pre></code>

        <h5>Description</h5>
        If {@code pQueueFamilyProperties} is {@code NULL}, then the number of queue families available is returned in {@code pQueueFamilyPropertyCount}. Otherwise, {@code pQueueFamilyPropertyCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pQueueFamilyProperties} array, and on return the variable is overwritten with the number of structures actually written to {@code pQueueFamilyProperties}. If {@code pQueueFamilyPropertyCount} is less than the number of queue families available, at most {@code pQueueFamilyPropertyCount} structures will be written.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pQueueFamilyPropertyCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pQueueFamilyPropertyCount} is not 0, and {@code pQueueFamilyProperties} is not {@code NULL}, {@code pQueueFamilyProperties} <b>must</b> be a pointer to an array of {@code pQueueFamilyPropertyCount} ##VkQueueFamilyProperties structures</li>
        </ul>

        <h5>See Also</h5>
        ##VkQueueFamilyProperties
        """,

        VkPhysicalDevice.IN("physicalDevice", "the handle to the physical device whose properties will be queried."),
        AutoSize("pQueueFamilyProperties")..Check(1)..uint32_t_p.INOUT("pQueueFamilyPropertyCount", "a pointer to an integer related to the number of queue families available or queried, as described below."),
        nullable..VkQueueFamilyProperties.p.OUT("pQueueFamilyProperties", "either {@code NULL} or a pointer to an array of ##VkQueueFamilyProperties structures.")
    )

    void(
        "GetPhysicalDeviceMemoryProperties",
        """
        Reports memory information for the specified physical device.

        <h5>C Specification</h5>
        To query memory properties, call:

        <code><pre>
￿void vkGetPhysicalDeviceMemoryProperties(
￿    VkPhysicalDevice                            physicalDevice,
￿    VkPhysicalDeviceMemoryProperties*           pMemoryProperties);</pre></code>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pMemoryProperties} <b>must</b> be a pointer to a ##VkPhysicalDeviceMemoryProperties structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkPhysicalDeviceMemoryProperties
        """,

        VkPhysicalDevice.IN("physicalDevice", "the handle to the device to query."),
        VkPhysicalDeviceMemoryProperties.p.OUT("pMemoryProperties", "points to an instance of ##VkPhysicalDeviceMemoryProperties structure in which the properties are returned.")
    )

    GlobalCommand..PFN_vkVoidFunction(
        "GetInstanceProcAddr",
        """
        Return a function pointer for a command.

        <h5>C Specification</h5>
        Vulkan commands are not necessarily exposed statically on a platform. Function pointers for all Vulkan commands <b>can</b> be obtained with the command:

        <code><pre>
￿PFN_vkVoidFunction vkGetInstanceProcAddr(
￿    VkInstance                                  instance,
￿    const char*                                 pName);</pre></code>

        <h5>Description</h5>
        #GetInstanceProcAddr() itself is obtained in a platform- and loader- specific manner. Typically, the loader library will export this command as a function symbol, so applications <b>can</b> link against the loader library, or load it dynamically and look up the symbol using platform-specific APIs. Loaders are encouraged to export function symbols for all other core Vulkan commands as well; if this is done, then applications that use only the core Vulkan commands have no need to use #GetInstanceProcAddr().

        The table below defines the various use cases for #GetInstanceProcAddr() and expected return value ("fp" is function pointer) for each case.

        The returned function pointer is of type {@code PFN_vkVoidFunction}, and must be cast to the type of the command being queried.

        <h6>vkGetInstanceProcAddr behavior</h6>
        <table class="lwjgl">
            <thead><tr><th>{@code instance}</th><th>{@code pName}</th><th>return value</th></tr></thead>
            <tbody>
                <tr><td>*</td><td>{@code NULL}</td><td>undefined</td></tr>
                <tr><td>invalid instance</td><td>*</td><td>undefined</td></tr>
                <tr><td>{@code NULL}</td><td>#EnumerateInstanceExtensionProperties()</td><td>fp</td></tr>
                <tr><td>{@code NULL}</td><td>#EnumerateInstanceLayerProperties()</td><td>fp</td></tr>
                <tr><td>{@code NULL}</td><td>#CreateInstance()</td><td>fp</td></tr>
                <tr><td>{@code NULL}</td><td>* (any {@code pName} not covered above)</td><td>{@code NULL}</td></tr>
                <tr><td>instance</td><td>core Vulkan command</td><td>fp<sup>1</sup></td></tr>
                <tr><td>instance</td><td>enabled instance extension commands for {@code instance}</td><td>fp<sup>1</sup></td></tr>
                <tr><td>instance</td><td>available device extension<sup>2</sup> commands for {@code instance}</td><td>fp<sup>1</sup></td></tr>
                <tr><td>instance</td><td>* (any {@code pName} not covered above)</td><td>{@code NULL}</td></tr>
            </tbody>
        </table>

        <dl>
            <dt>1</dt>
            <dd>The returned function pointer <b>must</b> only be called with a dispatchable object (the first parameter) that is {@code instance} or a child of {@code instance}. e.g. {@code VkInstance}, {@code VkPhysicalDevice}, {@code VkDevice}, {@code VkQueue}, or {@code VkCommandBuffer}.</dd>

            <dt>2</dt>
            <dd>An “available extension” is an extension function supported by any of the loader, driver or layer.</dd>
        </dl>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>If {@code instance} is not {@code NULL}, {@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
            <li>{@code pName} <b>must</b> be a null-terminated UTF-8 string</li>
        </ul>

        <h5>See Also</h5>
        {@code PFN_vkVoidFunction}
        """,

        VkInstance.IN("instance", "the instance that the function pointer will be compatible with, or {@code NULL} for commands not dependent on any instance."),
        const..charASCII_p.IN("pName", "the name of the command to obtain.")
    )

    PFN_vkVoidFunction(
        "GetDeviceProcAddr",
        """
        Return a function pointer for a command.

        <h5>C Specification</h5>
        In order to support systems with multiple Vulkan implementations comprising heterogeneous collections of hardware and software, the function pointers returned by #GetInstanceProcAddr() <b>may</b> point to dispatch code, which calls a different real implementation for different {@code VkDevice} objects (and objects created from them). The overhead of this internal dispatch <b>can</b> be avoided by obtaining device-specific function pointers for any commands that use a device or device-child object as their dispatchable object. Such function pointers <b>can</b> be obtained with the command:

        <code><pre>
￿PFN_vkVoidFunction vkGetDeviceProcAddr(
￿    VkDevice                                    device,
￿    const char*                                 pName);</pre></code>

        <h5>Description</h5>
        The returned function pointer is of type {@code PFN_vkVoidFunction}, and must be cast to the type of the command being queried.

        <h6>vkGetDeviceProcAddr behavior</h6>
        <table class="lwjgl">
            <thead><tr><th>{@code device}</th><th>{@code pName}</th><th>return value</th></tr></thead>
            <tbody>
                <tr><td>{@code NULL}</td><td>*</td><td>undefined</td></tr>
                <tr><td>invalid device</td><td>*</td><td>undefined</td></tr>
                <tr><td>device</td><td>{@code NULL}</td><td>undefined</td></tr>
                <tr><td>device</td><td>core Vulkan command</td><td>fp<sup>1</sup></td></tr>
                <tr><td>device</td><td>enabled extension commands</td><td>fp<sup>1</sup></td></tr>
                <tr><td>device</td><td>* (any {@code pName} not covered above)</td><td>{@code NULL}</td></tr>
            </tbody>
        </table>

        <dl>
            <dt>1</dt>
            <dd>The returned function pointer <b>must</b> only be called with a dispatchable object (the first parameter) that is {@code device} or a child of {@code device}. e.g. {@code VkDevice}, {@code VkQueue}, or {@code VkCommandBuffer}.</dd>
        </dl>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pName} <b>must</b> be a null-terminated UTF-8 string</li>
        </ul>

        <h5>See Also</h5>
        {@code PFN_vkVoidFunction}
        """,

        VkDevice.IN("device", ""),
        const..charASCII_p.IN("pName", "")
    )

    // Device commands

    VkResult(
        "CreateDevice",
        """
        Create a new device instance.

        <h5>C Specification</h5>
        A logical device is created as a <em>connection</em> to a physical device. To create a logical device, call:

        <code><pre>
￿VkResult vkCreateDevice(
￿    VkPhysicalDevice                            physicalDevice,
￿    const VkDeviceCreateInfo*                   pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkDevice*                                   pDevice);</pre></code>

        <h5>Description</h5>
        #CreateDevice() verifies that extensions and features requested in the {@code ppEnabledExtensionNames} and {@code pEnabledFeatures} members of {@code pCreateInfo}, respectively, are supported by the implementation. If any requested extension is not supported, #CreateDevice() <b>must</b> return #ERROR_EXTENSION_NOT_PRESENT. If any requested feature is not supported, #CreateDevice() <b>must</b> return #ERROR_FEATURE_NOT_PRESENT. Support for extensions <b>can</b> be checked before creating a device by querying #EnumerateDeviceExtensionProperties(). Support for features <b>can</b> similarly be checked by querying #GetPhysicalDeviceFeatures().

        After verifying and enabling the extensions the {@code VkDevice} object is created and returned to the application. If a requested extension is only supported by a layer, both the layer and the extension need to be specified at #CreateInstance() time for the creation to succeed.

        Multiple logical devices <b>can</b> be created from the same physical device. Logical device creation <b>may</b> fail due to lack of device-specific resources (in addition to the other errors). If that occurs, #CreateDevice() will return #ERROR_TOO_MANY_OBJECTS.

        <h5>Valid Usage</h5>
        <ul>
            <li>All <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#extended-functionality-extensions-dependencies">required extensions</a> for each extension in the ##VkDeviceCreateInfo{@code ::ppEnabledExtensionNames} list <b>must</b> also be present in that list.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid ##VkDeviceCreateInfo structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pDevice} <b>must</b> be a pointer to a {@code VkDevice} handle</li>
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
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_INITIALIZATION_FAILED</li>
                <li>#ERROR_EXTENSION_NOT_PRESENT</li>
                <li>#ERROR_FEATURE_NOT_PRESENT</li>
                <li>#ERROR_TOO_MANY_OBJECTS</li>
                <li>#ERROR_DEVICE_LOST</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkDeviceCreateInfo
        """,

        VkPhysicalDevice.IN("physicalDevice", "<b>must</b> be one of the device handles returned from a call to #EnumeratePhysicalDevices() (see <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#devsandqueues-physical-device-enumeration\">Physical Device Enumeration</a>)."),
        const..VkDeviceCreateInfo.p.IN("pCreateInfo", "a pointer to a ##VkDeviceCreateInfo structure containing information about how to create the device."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkDevice.p.OUT("pDevice", "points to a handle in which the created {@code VkDevice} is returned.")
    )

    void(
        "DestroyDevice",
        """
        Destroy a logical device.

        <h5>C Specification</h5>
        To destroy a device, call:

        <code><pre>
￿void vkDestroyDevice(
￿    VkDevice                                    device,
￿    const VkAllocationCallbacks*                pAllocator);</pre></code>

        <h5>Description</h5>
        To ensure that no work is active on the device, #DeviceWaitIdle() <b>can</b> be used to gate the destruction of the device. Prior to destroying a device, an application is responsible for destroying/freeing any Vulkan objects that were created using that device as the first parameter of the corresponding ftext:vkCreate* or ftext:vkAllocate* command.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The lifetime of each of these objects is bound by the lifetime of the {@code VkDevice} object. Therefore, to avoid resource leaks, it is critical that an application explicitly free all of these resources prior to calling #DestroyDevice().
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>All child objects created on {@code device} <b>must</b> have been destroyed prior to destroying {@code device}</li>
            <li>If ##VkAllocationCallbacks were provided when {@code device} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code device} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>If {@code device} is not {@code NULL}, {@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code device} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice.IN("device", "the logical device to destroy."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    // Extension discovery commands

    GlobalCommand..VkResult(
        "EnumerateInstanceExtensionProperties",
        """
        Returns up to requested number of global extension properties.

        <h5>C Specification</h5>
        To query the available instance extensions, call:

        <code><pre>
￿VkResult vkEnumerateInstanceExtensionProperties(
￿    const char*                                 pLayerName,
￿    uint32_t*                                   pPropertyCount,
￿    VkExtensionProperties*                      pProperties);</pre></code>

        <h5>Description</h5>
        When {@code pLayerName} parameter is NULL, only extensions provided by the Vulkan implementation or by implicitly enabled layers are returned. When {@code pLayerName} is the name of a layer, the instance extensions provided by that layer are returned.

        If {@code pProperties} is {@code NULL}, then the number of extensions properties available is returned in {@code pPropertyCount}. Otherwise, {@code pPropertyCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pProperties} array, and on return the variable is overwritten with the number of structures actually written to {@code pProperties}. If {@code pPropertyCount} is less than the number of extension properties available, at most {@code pPropertyCount} structures will be written. If {@code pPropertyCount} is smaller than the number of extensions available, #INCOMPLETE will be returned instead of #SUCCESS, to indicate that not all the available properties were returned.

        Because the list of available layers may change externally between calls to {@code vkEnumerateInstanceExtensionProperties}, two calls may retrieve different results if a {@code pLayerName} is available in one call but not in another. The extensions supported by a layer may also change between two calls, e.g. if the layer implementation is replaced by a different version between those calls.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>If {@code pLayerName} is not {@code NULL}, {@code pLayerName} <b>must</b> be a null-terminated UTF-8 string</li>
            <li>{@code pPropertyCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a pointer to an array of {@code pPropertyCount} ##VkExtensionProperties structures</li>
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
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_LAYER_NOT_PRESENT</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkExtensionProperties
        """,

        nullable..const..charUTF8_p.IN("pLayerName", "either {@code NULL} or a pointer to a null-terminated UTF-8 string naming the layer to retrieve extensions from."),
        AutoSize("pProperties")..Check(1)..uint32_t_p.INOUT("pPropertyCount", "a pointer to an integer related to the number of extension properties available or queried, as described below."),
        nullable..VkExtensionProperties.p.OUT("pProperties", "either {@code NULL} or a pointer to an array of ##VkExtensionProperties structures.")
    )

    VkResult(
        "EnumerateDeviceExtensionProperties",
        """
        Returns properties of available physical device extensions.

        <h5>C Specification</h5>
        To query the extensions available to a given physical device, call:

        <code><pre>
￿VkResult vkEnumerateDeviceExtensionProperties(
￿    VkPhysicalDevice                            physicalDevice,
￿    const char*                                 pLayerName,
￿    uint32_t*                                   pPropertyCount,
￿    VkExtensionProperties*                      pProperties);</pre></code>

        <h5>Description</h5>
        When {@code pLayerName} parameter is NULL, only extensions provided by the Vulkan implementation or by implicitly enabled layers are returned. When {@code pLayerName} is the name of a layer, the device extensions provided by that layer are returned.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>If {@code pLayerName} is not {@code NULL}, {@code pLayerName} <b>must</b> be a null-terminated UTF-8 string</li>
            <li>{@code pPropertyCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a pointer to an array of {@code pPropertyCount} ##VkExtensionProperties structures</li>
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
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_LAYER_NOT_PRESENT</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkExtensionProperties
        """,

        VkPhysicalDevice.IN("physicalDevice", "the physical device that will be queried."),
        nullable..const..charUTF8_p.IN("pLayerName", "either {@code NULL} or a pointer to a null-terminated UTF-8 string naming the layer to retrieve extensions from."),
        AutoSize("pProperties")..Check(1)..uint32_t_p.INOUT("pPropertyCount", "a pointer to an integer related to the number of extension properties available or queried, and is treated in the same fashion as the #EnumerateInstanceExtensionProperties(){@code ::pPropertyCount} parameter."),
        nullable..VkExtensionProperties.p.OUT("pProperties", "either {@code NULL} or a pointer to an array of ##VkExtensionProperties structures.")
    )

    // Layer discovery commands

    GlobalCommand..VkResult(
        "EnumerateInstanceLayerProperties",
        """
        Returns up to requested number of global layer properties.

        <h5>C Specification</h5>
        To query the available layers, call:

        <code><pre>
￿VkResult vkEnumerateInstanceLayerProperties(
￿    uint32_t*                                   pPropertyCount,
￿    VkLayerProperties*                          pProperties);</pre></code>

        <h5>Description</h5>
        If {@code pProperties} is {@code NULL}, then the number of layer properties available is returned in {@code pPropertyCount}. Otherwise, {@code pPropertyCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pProperties} array, and on return the variable is overwritten with the number of structures actually written to {@code pProperties}. If {@code pPropertyCount} is less than the number of layer properties available, at most {@code pPropertyCount} structures will be written. If {@code pPropertyCount} is smaller than the number of layers available, #INCOMPLETE will be returned instead of #SUCCESS, to indicate that not all the available layer properties were returned.

        The list of available layers may change at any time due to actions outside of the Vulkan implementation, so two calls to #EnumerateInstanceLayerProperties() with the same parameters <b>may</b> return different results, or retrieve different {@code pPropertyCount} values or {@code pProperties} contents. Once an instance has been created, the layers enabled for that instance will continue to be enabled and valid for the lifetime of that instance, even if some of them become unavailable for future instances.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code pPropertyCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a pointer to an array of {@code pPropertyCount} ##VkLayerProperties structures</li>
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
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkLayerProperties
        """,

        AutoSize("pProperties")..Check(1)..uint32_t_p.INOUT("pPropertyCount", "a pointer to an integer related to the number of layer properties available or queried, as described below."),
        nullable..VkLayerProperties.p.OUT("pProperties", "either {@code NULL} or a pointer to an array of ##VkLayerProperties structures.")
    )

    VkResult(
        "EnumerateDeviceLayerProperties",
        """
        Returns properties of available physical device layers.

        <h5>C Specification</h5>
        To enumerate device layers, call:

        <code><pre>
￿VkResult vkEnumerateDeviceLayerProperties(
￿    VkPhysicalDevice                            physicalDevice,
￿    uint32_t*                                   pPropertyCount,
￿    VkLayerProperties*                          pProperties);</pre></code>

        <h5>Description</h5>
        If {@code pProperties} is {@code NULL}, then the number of layer properties available is returned in {@code pPropertyCount}. Otherwise, {@code pPropertyCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pProperties} array, and on return the variable is overwritten with the number of structures actually written to {@code pProperties}. If {@code pPropertyCount} is less than the number of layer properties available, at most {@code pPropertyCount} structures will be written. If {@code pPropertyCount} is smaller than the number of layers available, #INCOMPLETE will be returned instead of #SUCCESS, to indicate that not all the available layer properties were returned.

        The list of layers enumerated by #EnumerateDeviceLayerProperties() <b>must</b> be exactly the sequence of layers enabled for the instance. The members of ##VkLayerProperties for each enumerated layer <b>must</b> be the same as the properties when the layer was enumerated by #EnumerateInstanceLayerProperties().

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pPropertyCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a pointer to an array of {@code pPropertyCount} ##VkLayerProperties structures</li>
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
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkLayerProperties
        """,

        VkPhysicalDevice.IN("physicalDevice", ""),
        AutoSize("pProperties")..Check(1)..uint32_t_p.INOUT("pPropertyCount", "a pointer to an integer related to the number of layer properties available or queried."),
        nullable..VkLayerProperties.p.OUT("pProperties", "either {@code NULL} or a pointer to an array of ##VkLayerProperties structures.")
    )

    // queue commands

    void(
        "GetDeviceQueue",
        """
        Get a queue handle from a device.

        <h5>C Specification</h5>
        To retrieve a handle to a VkQueue object, call:

        <code><pre>
￿void vkGetDeviceQueue(
￿    VkDevice                                    device,
￿    uint32_t                                    queueFamilyIndex,
￿    uint32_t                                    queueIndex,
￿    VkQueue*                                    pQueue);</pre></code>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code queueFamilyIndex} <b>must</b> be one of the queue family indices specified when {@code device} was created, via the ##VkDeviceQueueCreateInfo structure</li>
            <li>{@code queueIndex} <b>must</b> be less than the number of queues created for the specified queue family index when {@code device} was created, via the {@code queueCount} member of the ##VkDeviceQueueCreateInfo structure</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pQueue} <b>must</b> be a pointer to a {@code VkQueue} handle</li>
        </ul>
        """,

        VkDevice.IN("device", "the logical device that owns the queue."),
        uint32_t.IN("queueFamilyIndex", "the index of the queue family to which the queue belongs."),
        uint32_t.IN("queueIndex", "the index within this queue family of the queue to retrieve."),
        Check(1)..VkQueue.p.OUT("pQueue", "a pointer to a {@code VkQueue} object that will be filled with the handle for the requested queue.")
    )

    VkResult(
        "QueueSubmit",
        """
        Submits a sequence of semaphores or command buffers to a queue.

        <h5>C Specification</h5>
        To submit command buffers to a queue, call:

        <code><pre>
￿VkResult vkQueueSubmit(
￿    VkQueue                                     queue,
￿    uint32_t                                    submitCount,
￿    const VkSubmitInfo*                         pSubmits,
￿    VkFence                                     fence);</pre></code>

        <h5>Description</h5>
        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Submission can be a high overhead operation, and applications <b>should</b> attempt to batch work together into as few calls to #QueueSubmit() as possible.
        </div>

        #QueueSubmit() is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#devsandqueues-submission">queue submission command</a>, with each batch defined by an element of {@code pSubmits} as an instance of the ##VkSubmitInfo structure. Batches begin execution in the order they appear in {@code pSubmits}, but <b>may</b> complete out of order.

        Fence and semaphore operations submitted with #QueueSubmit() have additional ordering constraints compared to other submission commands, with dependencies involving previous and subsequent queue operations. Information about these additional constraints can be found in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-semaphores">semaphore</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-fences">fence</a> sections of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization">the synchronization chapter</a>.

        Details on the interaction of {@code pWaitDstStageMask} with synchronization are described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-semaphores-waiting">semaphore wait operation</a> section of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization">the synchronization chapter</a>.

        The order that batches appear in {@code pSubmits} is used to determine <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-submission-order">submission order</a>, and thus all the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-implicit">implicit ordering guarantees</a> that respect it. Other than these implicit ordering guarantees and any <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization">explicit synchronization primitives</a>, these batches <b>may</b> overlap or otherwise execute out of order.

        If any command buffer submitted to this queue is in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">executable state</a>, it is moved to the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">pending state</a>. Once execution of all submissions of a command buffer complete, it moves from the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">pending state</a>, back to the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">executable state</a>. If a command buffer was recorded with the #COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT flag, it instead moves back to the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">invalid state</a>.

        If #QueueSubmit() fails, it <b>may</b> return #ERROR_OUT_OF_HOST_MEMORY or #ERROR_OUT_OF_DEVICE_MEMORY. If it does, the implementation <b>must</b> ensure that the state and contents of any resources or synchronization primitives referenced by the submitted command buffers and any semaphores referenced by {@code pSubmits} is unaffected by the call or its failure. If #QueueSubmit() fails in such a way that the implementation <b>can</b> not make that guarantee, the implementation <b>must</b> return #ERROR_DEVICE_LOST. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#devsandqueues-lost-device">Lost Device</a>.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code fence} is not #NULL_HANDLE, {@code fence} <b>must</b> be unsignaled</li>
            <li>If {@code fence} is not #NULL_HANDLE, {@code fence} <b>must</b> not be associated with any other queue command that has not yet completed execution on that queue</li>
            <li>Any calls to #CmdSetEvent(), #CmdResetEvent() or #CmdWaitEvents() that have been recorded into any of the command buffer elements of the {@code pCommandBuffers} member of any element of {@code pSubmits}, <b>must</b> not reference any {@code VkEvent} that is referenced by any of those commands in a command buffer that has been submitted to another queue and is still in the <em>pending state</em>.</li>
            <li>Any stage flag included in any element of the {@code pWaitDstStageMask} member of any element of {@code pSubmits} <b>must</b> be a pipeline stage supported by one of the capabilities of {@code queue}, as specified in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-supported">table of supported pipeline stages</a>.</li>
            <li>Any given element of the {@code pSignalSemaphores} member of any element of {@code pSubmits} <b>must</b> be unsignaled when the semaphore signal operation it defines is executed on the device</li>
            <li>When a semaphore unsignal operation defined by any element of the {@code pWaitSemaphores} member of any element of {@code pSubmits} executes on {@code queue}, no other queue <b>must</b> be waiting on the same semaphore.</li>
            <li>All elements of the {@code pWaitSemaphores} member of all elements of {@code pSubmits} <b>must</b> be semaphores that are signaled, or have <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-semaphores-signaling">semaphore signal operations</a> previously submitted for execution.</li>
            <li>Any given element of the {@code pCommandBuffers} member of any element of {@code pSubmits} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">pending or executable state</a>.</li>
            <li>If any given element of the {@code pCommandBuffers} member of any element of {@code pSubmits} was not recorded with the #COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT, it <b>must</b> not be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">pending state</a>.</li>
            <li>Any <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-secondary">secondary command buffers recorded</a> into any given element of the {@code pCommandBuffers} member of any element of {@code pSubmits} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">pending or executable state</a>.</li>
            <li>If any <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-secondary">secondary command buffers recorded</a> into any given element of the {@code pCommandBuffers} member of any element of {@code pSubmits} was not recorded with the #COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT, it <b>must</b> not be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">pending state</a>.</li>
            <li>Any given element of the {@code pCommandBuffers} member of any element of {@code pSubmits} <b>must</b> have been allocated from a {@code VkCommandPool} that was created for the same queue family {@code queue} belongs to.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code queue} <b>must</b> be a valid {@code VkQueue} handle</li>
            <li>If {@code submitCount} is not 0, {@code pSubmits} <b>must</b> be a pointer to an array of {@code submitCount} valid ##VkSubmitInfo structures</li>
            <li>If {@code fence} is not #NULL_HANDLE, {@code fence} <b>must</b> be a valid {@code VkFence} handle</li>
            <li>Both of {@code fence}, and {@code queue} that are valid handles <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code queue} <b>must</b> be externally synchronized</li>
            <li>Host access to {@code pSubmits}[].pWaitSemaphores[] <b>must</b> be externally synchronized</li>
            <li>Host access to {@code pSubmits}[].pSignalSemaphores[] <b>must</b> be externally synchronized</li>
            <li>Host access to {@code fence} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>-</td><td>-</td><td>Any</td><td>-</td></tr></tbody>
        </table>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_DEVICE_LOST</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkSubmitInfo
        """,

        VkQueue.IN("queue", "the queue that the command buffers will be submitted to."),
        AutoSize("pSubmits")..uint32_t.IN("submitCount", "the number of elements in the {@code pSubmits} array."),
        nullable..const..VkSubmitInfo.p.IN("pSubmits", "a pointer to an array of ##VkSubmitInfo structures, each specifying a command buffer submission batch."),
        VkFence.IN("fence", "an optional handle to a fence to be signaled. If {@code fence} is not #NULL_HANDLE, it defines a <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#synchronization-fences-signaling\">fence signal operation</a>.")
    )

    VkResult(
        "QueueWaitIdle",
        """
        Wait for a queue to become idle.

        <h5>C Specification</h5>
        To wait on the host for the completion of outstanding queue operations for a given queue, call:

        <code><pre>
￿VkResult vkQueueWaitIdle(
￿    VkQueue                                     queue);</pre></code>

        <h5>Description</h5>
        #QueueWaitIdle() is equivalent to submitting a fence to a queue and waiting with an infinite timeout for that fence to signal.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code queue} <b>must</b> be a valid {@code VkQueue} handle</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>-</td><td>-</td><td>Any</td><td>-</td></tr></tbody>
        </table>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_DEVICE_LOST</li>
            </ul></dd>
        </dl>
        """,

        VkQueue.IN("queue", "the queue on which to wait.")
    )

    VkResult(
        "DeviceWaitIdle",
        """
        Wait for a device to become idle.

        <h5>C Specification</h5>
        To wait on the host for the completion of outstanding queue operations for all queues on a given logical device, call:

        <code><pre>
￿VkResult vkDeviceWaitIdle(
￿    VkDevice                                    device);</pre></code>

        <h5>Description</h5>
        #DeviceWaitIdle() is equivalent to calling #QueueWaitIdle() for all queues owned by {@code device}.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to all {@code VkQueue} objects created from {@code device} <b>must</b> be externally synchronized</li>
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
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_DEVICE_LOST</li>
            </ul></dd>
        </dl>
        """,

        VkDevice.IN("device", "the logical device to idle.")
    )

    // Memory commands

    VkResult(
        "AllocateMemory",
        """
        Allocate GPU memory.

        <h5>C Specification</h5>
        To allocate memory objects, call:

        <code><pre>
￿VkResult vkAllocateMemory(
￿    VkDevice                                    device,
￿    const VkMemoryAllocateInfo*                 pAllocateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkDeviceMemory*                             pMemory);</pre></code>

        <h5>Description</h5>
        Allocations returned by #AllocateMemory() are guaranteed to meet any alignment requirement by the implementation. For example, if an implementation requires 128 byte alignment for images and 64 byte alignment for buffers, the device memory returned through this mechanism would be 128-byte aligned. This ensures that applications <b>can</b> correctly suballocate objects of different types (with potentially different alignment requirements) in the same memory object.

        When memory is allocated, its contents are undefined.

        There is an implementation-dependent maximum number of memory allocations which <b>can</b> be simultaneously created on a device. This is specified by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-limits-maxMemoryAllocationCount">{@code maxMemoryAllocationCount}</a> member of the ##VkPhysicalDeviceLimits structure. If {@code maxMemoryAllocationCount} is exceeded, #AllocateMemory() will return #ERROR_TOO_MANY_OBJECTS.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Some platforms <b>may</b> have a limit on the maximum size of a single allocation. For example, certain systems <b>may</b> fail to create allocations with a size greater than or equal to 4GB. Such a limit is implementation-dependent, and if such a failure occurs then the error #ERROR_OUT_OF_DEVICE_MEMORY <b>should</b> be returned.
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>The number of currently valid memory objects, allocated from {@code device}, <b>must</b> be less than ##VkPhysicalDeviceLimits{@code ::maxMemoryAllocationCount}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pAllocateInfo} <b>must</b> be a pointer to a valid ##VkMemoryAllocateInfo structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pMemory} <b>must</b> be a pointer to a {@code VkDeviceMemory} handle</li>
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
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_TOO_MANY_OBJECTS</li>
                <li>#ERROR_INVALID_EXTERNAL_HANDLE_KHX</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkMemoryAllocateInfo
        """,

        VkDevice.IN("device", "the logical device that owns the memory."),
        const..VkMemoryAllocateInfo.p.IN("pAllocateInfo", "a pointer to an instance of the ##VkMemoryAllocateInfo structure describing parameters of the allocation. A successful returned allocation <b>must</b> use the requested parameters&#8201;&#8212;&#8201;no substitution is permitted by the implementation."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkDeviceMemory.p.OUT("pMemory", "a pointer to a {@code VkDeviceMemory} handle in which information about the allocated memory is returned.")
    )

    void(
        "FreeMemory",
        """
        Free GPU memory.

        <h5>C Specification</h5>
        To free a memory object, call:

        <code><pre>
￿void vkFreeMemory(
￿    VkDevice                                    device,
￿    VkDeviceMemory                              memory,
￿    const VkAllocationCallbacks*                pAllocator);</pre></code>

        <h5>Description</h5>
        Before freeing a memory object, an application <b>must</b> ensure the memory object is no longer in use by the device--for example by command buffers queued for execution. The memory <b>can</b> remain bound to images or buffers at the time the memory object is freed, but any further use of them (on host or device) for anything other than destroying those objects will result in undefined behavior. If there are still any bound images or buffers, the memory <b>may</b> not be immediately released by the implementation, but <b>must</b> be released by the time all bound images and buffers have been destroyed. Once memory is released, it is returned to the heap from which it was allocated.

        How memory objects are bound to Images and Buffers is described in detail in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#resources-association">Resource Memory Association</a> section.

        If a memory object is mapped at the time it is freed, it is implicitly unmapped.

        <h5>Valid Usage</h5>
        <ul>
            <li>All submitted commands that refer to {@code memory} (via images or buffers) <b>must</b> have completed execution</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code memory} is not #NULL_HANDLE, {@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code memory} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code memory} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice.IN("device", "the logical device that owns the memory."),
        VkDeviceMemory.IN("memory", "the {@code VkDeviceMemory} object to be freed."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    VkResult(
        "MapMemory",
        """
        Map a memory object into application address space.

        <h5>C Specification</h5>
        To retrieve a host virtual address pointer to a region of a mappable memory object, call:

        <code><pre>
￿VkResult vkMapMemory(
￿    VkDevice                                    device,
￿    VkDeviceMemory                              memory,
￿    VkDeviceSize                                offset,
￿    VkDeviceSize                                size,
￿    VkMemoryMapFlags                            flags,
￿    void**                                      ppData);</pre></code>

        <h5>Description</h5>
        It is an application error to call #MapMemory() on a memory object that is already mapped.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        #MapMemory() will fail if the implementation is unable to allocate an appropriately sized contiguous virtual address range, e.g. due to virtual address space fragmentation or platform limits. In such cases, #MapMemory() <b>must</b> return #ERROR_MEMORY_MAP_FAILED. The application <b>can</b> improve the likelihood of success by reducing the size of the mapped range and/or removing unneeded mappings using fname:VkUnmapMemory.
        </div>

        #MapMemory() does not check whether the device memory is currently in use before returning the host-accessible pointer. The application <b>must</b> guarantee that any previously submitted command that writes to this range has completed before the host reads from or writes to that range, and that any previously submitted command that reads from that range has completed before the host writes to that region (see <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-submission-host-writes">here</a> for details on fulfilling such a guarantee). If the device memory was allocated without the #MEMORY_PROPERTY_HOST_COHERENT_BIT set, these guarantees <b>must</b> be made for an extended range: the application <b>must</b> round down the start of the range to the nearest multiple of ##VkPhysicalDeviceLimits{@code ::nonCoherentAtomSize}, and round the end of the range up to the nearest multiple of ##VkPhysicalDeviceLimits{@code ::nonCoherentAtomSize}.

        While a range of device memory is mapped for host access, the application is responsible for synchronizing both device and host access to that memory range.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        It is important for the application developer to become meticulously familiar with all of the mechanisms described in the chapter on <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization">Synchronization and Cache Control</a> as they are crucial to maintaining memory access ordering.
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code memory} <b>must</b> not currently be mapped</li>
            <li>{@code offset} <b>must</b> be less than the size of {@code memory}</li>
            <li>If {@code size} is not equal to #WHOLE_SIZE, {@code size} <b>must</b> be greater than 0</li>
            <li>If {@code size} is not equal to #WHOLE_SIZE, {@code size} <b>must</b> be less than or equal to the size of the {@code memory} minus {@code offset}</li>
            <li>{@code memory} <b>must</b> have been created with a memory type that reports #MEMORY_PROPERTY_HOST_VISIBLE_BIT</li>
            <li>{@code memory} <b>must</b> not have been allocated with multiple instances.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
            <li>{@code flags} <b>must</b> be 0</li>
            <li>{@code ppData} <b>must</b> be a pointer to a pointer</li>
            <li>{@code memory} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code memory} <b>must</b> be externally synchronized</li>
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
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_MEMORY_MAP_FAILED</li>
            </ul></dd>
        </dl>
        """,

        VkDevice.IN("device", "the logical device that owns the memory."),
        VkDeviceMemory.IN("memory", "the {@code VkDeviceMemory} object to be mapped."),
        VkDeviceSize.IN("offset", "a zero-based byte offset from the beginning of the memory object."),
        VkDeviceSize.IN("size", "the size of the memory range to map, or #WHOLE_SIZE to map from {@code offset} to the end of the allocation."),
        VkMemoryMapFlags.IN("flags", "reserved for future use."),
        Check(1)..void_pp.OUT("ppData", "points to a pointer in which is returned a host-accessible pointer to the beginning of the mapped range. This pointer minus {@code offset} <b>must</b> be aligned to at least ##VkPhysicalDeviceLimits{@code ::minMemoryMapAlignment}.")
    )

    void(
        "UnmapMemory",
        """
        Unmap a previously mapped memory object.

        <h5>C Specification</h5>
        To unmap a memory object once host access to it is no longer needed by the application, call:

        <code><pre>
￿void vkUnmapMemory(
￿    VkDevice                                    device,
￿    VkDeviceMemory                              memory);</pre></code>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code memory} <b>must</b> currently be mapped</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
            <li>{@code memory} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code memory} <b>must</b> be externally synchronized</li>
        </ul>
        """,

        VkDevice.IN("device", "the logical device that owns the memory."),
        VkDeviceMemory.IN("memory", "the memory object to be unmapped.")
    )

    VkResult(
        "FlushMappedMemoryRanges",
        """
        Flush mapped memory ranges.

        <h5>C Specification</h5>
        To flush ranges of non-coherent memory from the host caches, call:

        <code><pre>
￿VkResult vkFlushMappedMemoryRanges(
￿    VkDevice                                    device,
￿    uint32_t                                    memoryRangeCount,
￿    const VkMappedMemoryRange*                  pMemoryRanges);</pre></code>

        <h5>Description</h5>
        #FlushMappedMemoryRanges() guarantees that host writes to the memory ranges described by {@code pMemoryRanges} <b>can</b> be made available to device access, via <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-dependencies-available-and-visible">availability operations</a> from the #ACCESS_HOST_WRITE_BIT <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-access-types">access type</a>.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Unmapping non-coherent memory does not implicitly flush the mapped memory, and host writes that have not been flushed <b>may</b> not ever be visible to the device.
        </div>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pMemoryRanges} <b>must</b> be a pointer to an array of {@code memoryRangeCount} valid ##VkMappedMemoryRange structures</li>
            <li>{@code memoryRangeCount} <b>must</b> be greater than 0</li>
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
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkMappedMemoryRange
        """,

        VkDevice.IN("device", "the logical device that owns the memory ranges."),
        AutoSize("pMemoryRanges")..uint32_t.IN("memoryRangeCount", "the length of the {@code pMemoryRanges} array."),
        const..VkMappedMemoryRange.p.IN("pMemoryRanges", "a pointer to an array of ##VkMappedMemoryRange structures describing the memory ranges to flush.")
    )

    VkResult(
        "InvalidateMappedMemoryRanges",
        """
        Invalidate ranges of mapped memory objects.

        <h5>C Specification</h5>
        To invalidate ranges of non-coherent memory from the host caches, call:

        <code><pre>
￿VkResult vkInvalidateMappedMemoryRanges(
￿    VkDevice                                    device,
￿    uint32_t                                    memoryRangeCount,
￿    const VkMappedMemoryRange*                  pMemoryRanges);</pre></code>

        <h5>Description</h5>
        #InvalidateMappedMemoryRanges() guarantees that device writes to the memory ranges described by {@code pMemoryRanges}, which have been made visible to the #ACCESS_HOST_WRITE_BIT and #ACCESS_HOST_READ_BIT <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-access-types">access types</a>, are made visible to the host. If a range of non-coherent memory is written by the host and then invalidated without first being flushed, its contents are undefined.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Mapping non-coherent memory does not implicitly invalidate the mapped memory, and device writes that have not been invalidated <b>must</b> be made visible before the host reads or overwrites them.
        </div>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pMemoryRanges} <b>must</b> be a pointer to an array of {@code memoryRangeCount} valid ##VkMappedMemoryRange structures</li>
            <li>{@code memoryRangeCount} <b>must</b> be greater than 0</li>
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
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkMappedMemoryRange
        """,

        VkDevice.IN("device", "the logical device that owns the memory ranges."),
        AutoSize("pMemoryRanges")..uint32_t.IN("memoryRangeCount", "the length of the {@code pMemoryRanges} array."),
        const..VkMappedMemoryRange.p.IN("pMemoryRanges", "a pointer to an array of ##VkMappedMemoryRange structures describing the memory ranges to invalidate.")
    )

    void(
        "GetDeviceMemoryCommitment",
        """
        Query the current commitment for a VkDeviceMemory.

        <h5>C Specification</h5>
        To determine the amount of lazily-allocated memory that is currently committed for a memory object, call:

        <code><pre>
￿void vkGetDeviceMemoryCommitment(
￿    VkDevice                                    device,
￿    VkDeviceMemory                              memory,
￿    VkDeviceSize*                               pCommittedMemoryInBytes);</pre></code>

        <h5>Description</h5>
        The implementation <b>may</b> update the commitment at any time, and the value returned by this query <b>may</b> be out of date.

        The implementation guarantees to allocate any committed memory from the heapIndex indicated by the memory type that the memory object was created with.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code memory} <b>must</b> have been created with a memory type that reports #MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
            <li>{@code pCommittedMemoryInBytes} <b>must</b> be a pointer to a {@code VkDeviceSize} value</li>
            <li>{@code memory} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>
        """,

        VkDevice.IN("device", "the logical device that owns the memory."),
        VkDeviceMemory.IN("memory", "the memory object being queried."),
        Check(1)..VkDeviceSize.p.OUT("pCommittedMemoryInBytes", "a pointer to a {@code VkDeviceSize} value in which the number of bytes currently committed is returned, on success.")
    )

    // Memory management API commands

    VkResult(
        "BindBufferMemory",
        """
        Bind device memory to a buffer object.

        <h5>C Specification</h5>
        To attach memory to a buffer object, call:

        <code><pre>
￿VkResult vkBindBufferMemory(
￿    VkDevice                                    device,
￿    VkBuffer                                    buffer,
￿    VkDeviceMemory                              memory,
￿    VkDeviceSize                                memoryOffset);</pre></code>

        <h5>Description</h5>
        #BindBufferMemory() is equivalent to passing the same parameters through ##VkBindBufferMemoryInfoKHX to #BindBufferMemory2KHX(), with {@code deviceIndexCount} equal to zero.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code buffer} <b>must</b> not already be backed by a memory object</li>
            <li>{@code buffer} <b>must</b> not have been created with any sparse memory binding flags</li>
            <li>{@code memoryOffset} <b>must</b> be less than the size of {@code memory}</li>
            <li>If {@code buffer} was created with the #BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT or #BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT, {@code memoryOffset} <b>must</b> be a multiple of ##VkPhysicalDeviceLimits{@code ::minTexelBufferOffsetAlignment}</li>
            <li>If {@code buffer} was created with the #BUFFER_USAGE_UNIFORM_BUFFER_BIT, {@code memoryOffset} <b>must</b> be a multiple of ##VkPhysicalDeviceLimits{@code ::minUniformBufferOffsetAlignment}</li>
            <li>If {@code buffer} was created with the #BUFFER_USAGE_STORAGE_BUFFER_BIT, {@code memoryOffset} <b>must</b> be a multiple of ##VkPhysicalDeviceLimits{@code ::minStorageBufferOffsetAlignment}</li>
            <li>{@code memory} <b>must</b> have been allocated using one of the memory types allowed in the {@code memoryTypeBits} member of the ##VkMemoryRequirements structure returned from a call to #GetBufferMemoryRequirements() with {@code buffer}</li>
            <li>{@code memoryOffset} <b>must</b> be an integer multiple of the {@code alignment} member of the ##VkMemoryRequirements structure returned from a call to #GetBufferMemoryRequirements() with {@code buffer}</li>
            <li>The {@code size} member of the ##VkMemoryRequirements structure returned from a call to #GetBufferMemoryRequirements() with {@code buffer} <b>must</b> be less than or equal to the size of {@code memory} minus {@code memoryOffset}</li>
            <li>If {@code buffer} was created with ##VkDedicatedAllocationBufferCreateInfoNV{@code ::dedicatedAllocation} equal to #TRUE, {@code memory} <b>must</b> have been created with ##VkDedicatedAllocationMemoryAllocateInfoNV{@code ::buffer} equal to {@code buffer} and {@code memoryOffset} <b>must</b> be zero</li>
            <li>If {@code buffer} was not created with ##VkDedicatedAllocationBufferCreateInfoNV{@code ::dedicatedAllocation} equal to #TRUE, {@code memory} <b>must</b> not have been allocated dedicated for a specific buffer or image</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
            <li>{@code buffer} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
            <li>{@code memory} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code buffer} <b>must</b> be externally synchronized</li>
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
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>
        """,

        VkDevice.IN("device", "the logical device that owns the buffer and memory."),
        VkBuffer.IN("buffer", "the buffer to be attached to memory."),
        VkDeviceMemory.IN("memory", "a {@code VkDeviceMemory} object describing the device memory to attach."),
        VkDeviceSize.IN("memoryOffset", "the start offset of the region of {@code memory} which is to be bound to the buffer. The number of bytes returned in the ##VkMemoryRequirements{@code ::size} member in {@code memory}, starting from {@code memoryOffset} bytes, will be bound to the specified buffer.")
    )

    VkResult(
        "BindImageMemory",
        """
        Bind device memory to an image object.

        <h5>C Specification</h5>
        To attach memory to an image object, call:

        <code><pre>
￿VkResult vkBindImageMemory(
￿    VkDevice                                    device,
￿    VkImage                                     image,
￿    VkDeviceMemory                              memory,
￿    VkDeviceSize                                memoryOffset);</pre></code>

        <h5>Description</h5>
        #BindImageMemory() is equivalent to passing the same parameters through ##VkBindImageMemoryInfoKHX to #BindImageMemory2KHX(), with {@code deviceIndexCount} and {@code SFRRectCount} equal to zero.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code image} <b>must</b> not already be backed by a memory object</li>
            <li>{@code image} <b>must</b> not have been created with any sparse memory binding flags</li>
            <li>{@code memoryOffset} <b>must</b> be less than the size of {@code memory}</li>
            <li>{@code memory} <b>must</b> have been allocated using one of the memory types allowed in the {@code memoryTypeBits} member of the ##VkMemoryRequirements structure returned from a call to #GetImageMemoryRequirements() with {@code image}</li>
            <li>{@code memoryOffset} <b>must</b> be an integer multiple of the {@code alignment} member of the ##VkMemoryRequirements structure returned from a call to #GetImageMemoryRequirements() with {@code image}</li>
            <li>The {@code size} member of the ##VkMemoryRequirements structure returned from a call to #GetImageMemoryRequirements() with {@code image} <b>must</b> be less than or equal to the size of {@code memory} minus {@code memoryOffset}</li>
            <li>If {@code image} was created with ##VkDedicatedAllocationImageCreateInfoNV{@code ::dedicatedAllocation} equal to #TRUE, {@code memory} <b>must</b> have been created with ##VkDedicatedAllocationMemoryAllocateInfoNV{@code ::image} equal to {@code image} and {@code memoryOffset} <b>must</b> be zero</li>
            <li>If {@code image} was not created with ##VkDedicatedAllocationImageCreateInfoNV{@code ::dedicatedAllocation} equal to #TRUE, {@code memory} <b>must</b> not have been allocated dedicated for a specific buffer or image</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
            <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
            <li>{@code image} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
            <li>{@code memory} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code image} <b>must</b> be externally synchronized</li>
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
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>
        """,

        VkDevice.IN("device", "the logical device that owns the image and memory."),
        VkImage.IN("image", "the image."),
        VkDeviceMemory.IN("memory", "the {@code VkDeviceMemory} object describing the device memory to attach."),
        VkDeviceSize.IN("memoryOffset", "the start offset of the region of {@code memory} which is to be bound to the image. The number of bytes returned in the ##VkMemoryRequirements{@code ::size} member in {@code memory}, starting from {@code memoryOffset} bytes, will be bound to the specified image.")
    )

    void(
        "GetBufferMemoryRequirements",
        """
        Returns the memory requirements for specified Vulkan object.

        <h5>C Specification</h5>
        To determine the memory requirements for a buffer resource, call:

        <code><pre>
￿void vkGetBufferMemoryRequirements(
￿    VkDevice                                    device,
￿    VkBuffer                                    buffer,
￿    VkMemoryRequirements*                       pMemoryRequirements);</pre></code>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code pMemoryRequirements} <b>must</b> be a pointer to a ##VkMemoryRequirements structure</li>
            <li>{@code buffer} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>See Also</h5>
        ##VkMemoryRequirements
        """,

        VkDevice.IN("device", "the logical device that owns the buffer."),
        VkBuffer.IN("buffer", "the buffer to query."),
        VkMemoryRequirements.p.OUT("pMemoryRequirements", "points to an instance of the ##VkMemoryRequirements structure in which the memory requirements of the buffer object are returned.")
    )

    void(
        "GetImageMemoryRequirements",
        """
        Returns the memory requirements for specified Vulkan object.

        <h5>C Specification</h5>
        To determine the memory requirements for an image resource, call:

        <code><pre>
￿void vkGetImageMemoryRequirements(
￿    VkDevice                                    device,
￿    VkImage                                     image,
￿    VkMemoryRequirements*                       pMemoryRequirements);</pre></code>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
            <li>{@code pMemoryRequirements} <b>must</b> be a pointer to a ##VkMemoryRequirements structure</li>
            <li>{@code image} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>See Also</h5>
        ##VkMemoryRequirements
        """,

        VkDevice.IN("device", "the logical device that owns the image."),
        VkImage.IN("image", "the image to query."),
        VkMemoryRequirements.p.OUT("pMemoryRequirements", "points to an instance of the ##VkMemoryRequirements structure in which the memory requirements of the image object are returned.")
    )

    // Sparse resource memory management API commands

    void(
        "GetImageSparseMemoryRequirements",
        """
        Query the memory requirements for a sparse image.

        <h5>C Specification</h5>
        To query sparse memory requirements for an image, call:

        <code><pre>
￿void vkGetImageSparseMemoryRequirements(
￿    VkDevice                                    device,
￿    VkImage                                     image,
￿    uint32_t*                                   pSparseMemoryRequirementCount,
￿    VkSparseImageMemoryRequirements*            pSparseMemoryRequirements);</pre></code>

        <h5>Description</h5>
        If {@code pSparseMemoryRequirements} is {@code NULL}, then the number of sparse memory requirements available is returned in {@code pSparseMemoryRequirementCount}. Otherwise, {@code pSparseMemoryRequirementCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pSparseMemoryRequirements} array, and on return the variable is overwritten with the number of structures actually written to {@code pSparseMemoryRequirements}. If {@code pSparseMemoryRequirementCount} is less than the number of sparse memory requirements available, at most {@code pSparseMemoryRequirementCount} structures will be written.

        If the image was not created with #IMAGE_CREATE_SPARSE_RESIDENCY_BIT then {@code pSparseMemoryRequirementCount} will be set to zero and {@code pSparseMemoryRequirements} will not be written to.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        It is legal for an implementation to report a larger value in ##VkMemoryRequirements{@code ::size} than would be obtained by adding together memory sizes for all ##VkSparseImageMemoryRequirements returned by #GetImageSparseMemoryRequirements(). This <b>may</b> occur when the hardware requires unused padding in the address range describing the resource.
        </div>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
            <li>{@code pSparseMemoryRequirementCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pSparseMemoryRequirementCount} is not 0, and {@code pSparseMemoryRequirements} is not {@code NULL}, {@code pSparseMemoryRequirements} <b>must</b> be a pointer to an array of {@code pSparseMemoryRequirementCount} ##VkSparseImageMemoryRequirements structures</li>
            <li>{@code image} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>See Also</h5>
        ##VkSparseImageMemoryRequirements
        """,

        VkDevice.IN("device", "the logical device that owns the image."),
        VkImage.IN("image", "the {@code VkImage} object to get the memory requirements for."),
        AutoSize("pSparseMemoryRequirements")..Check(1)..uint32_t_p.INOUT("pSparseMemoryRequirementCount", "a pointer to an integer related to the number of sparse memory requirements available or queried, as described below."),
        nullable..VkSparseImageMemoryRequirements.p.OUT("pSparseMemoryRequirements", "either {@code NULL} or a pointer to an array of ##VkSparseImageMemoryRequirements structures.")
    )

    void(
        "GetPhysicalDeviceSparseImageFormatProperties",
        """
        Retrieve properties of an image format applied to sparse images.

        <h5>C Specification</h5>
        #GetPhysicalDeviceSparseImageFormatProperties() returns an array of ##VkSparseImageFormatProperties. Each element will describe properties for one set of image aspects that are bound simultaneously in the image. This is usually one element for each aspect in the image, but for interleaved depth/stencil images there is only one element describing the combined aspects.

        <code><pre>
￿void vkGetPhysicalDeviceSparseImageFormatProperties(
￿    VkPhysicalDevice                            physicalDevice,
￿    VkFormat                                    format,
￿    VkImageType                                 type,
￿    VkSampleCountFlagBits                       samples,
￿    VkImageUsageFlags                           usage,
￿    VkImageTiling                               tiling,
￿    uint32_t*                                   pPropertyCount,
￿    VkSparseImageFormatProperties*              pProperties);</pre></code>

        <h5>Description</h5>
        If {@code pProperties} is {@code NULL}, then the number of sparse format properties available is returned in {@code pPropertyCount}. Otherwise, {@code pPropertyCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pProperties} array, and on return the variable is overwritten with the number of structures actually written to {@code pProperties}. If {@code pPropertyCount} is less than the number of sparse format properties available, at most {@code pPropertyCount} structures will be written.

        If #IMAGE_CREATE_SPARSE_RESIDENCY_BIT is not supported for the given arguments, {@code pPropertyCount} will be set to zero upon return, and no data will be written to {@code pProperties}.

        Multiple aspects are returned for depth/stencil images that are implemented as separate planes by the implementation. The depth and stencil data planes each have unique ##VkSparseImageFormatProperties data.

        Depth/stencil images with depth and stencil data interleaved into a single plane will return a single ##VkSparseImageFormatProperties structure with the {@code aspectMask} set to #IMAGE_ASPECT_DEPTH_BIT | #IMAGE_ASPECT_STENCIL_BIT.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code samples} <b>must</b> be a bit value that is set in ##VkImageFormatProperties{@code ::sampleCounts} returned by #GetPhysicalDeviceImageFormatProperties() with {@code format}, {@code type}, {@code tiling}, and {@code usage} equal to those in this command and {@code flags} equal to the value that is set in ##VkImageCreateInfo{@code ::flags} when the image is created</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
            <li>{@code type} <b>must</b> be a valid {@code VkImageType} value</li>
            <li>{@code samples} <b>must</b> be a valid {@code VkSampleCountFlagBits} value</li>
            <li>{@code usage} <b>must</b> be a valid combination of {@code VkImageUsageFlagBits} values</li>
            <li>{@code usage} <b>must</b> not be 0</li>
            <li>{@code tiling} <b>must</b> be a valid {@code VkImageTiling} value</li>
            <li>{@code pPropertyCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a pointer to an array of {@code pPropertyCount} ##VkSparseImageFormatProperties structures</li>
        </ul>

        <h5>See Also</h5>
        ##VkSparseImageFormatProperties
        """,

        VkPhysicalDevice.IN("physicalDevice", "the physical device from which to query the sparse image capabilities."),
        VkFormat.IN("format", "the image format."),
        VkImageType.IN("type", "the dimensionality of image."),
        VkSampleCountFlagBits.IN("samples", "the number of samples per pixel as defined in {@code VkSampleCountFlagBits}."),
        VkImageUsageFlags.IN("usage", "a bitmask describing the intended usage of the image."),
        VkImageTiling.IN("tiling", "the tiling arrangement of the data elements in memory."),
        AutoSize("pProperties")..Check(1)..uint32_t_p.INOUT("pPropertyCount", "a pointer to an integer related to the number of sparse format properties available or queried, as described below."),
        nullable..VkSparseImageFormatProperties.p.OUT("pProperties", "either {@code NULL} or a pointer to an array of ##VkSparseImageFormatProperties structures.")
    )

    VkResult(
        "QueueBindSparse",
        """
        Bind device memory to a sparse resource object.

        <h5>C Specification</h5>
        To submit sparse binding operations to a queue, call:

        <code><pre>
￿VkResult vkQueueBindSparse(
￿    VkQueue                                     queue,
￿    uint32_t                                    bindInfoCount,
￿    const VkBindSparseInfo*                     pBindInfo,
￿    VkFence                                     fence);</pre></code>

        <h5>Description</h5>
        #QueueBindSparse() is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#devsandqueues-submission">queue submission command</a>, with each batch defined by an element of {@code pBindInfo} as an instance of the ##VkBindSparseInfo structure. Batches begin execution in the order they appear in {@code pBindInfo}, but <b>may</b> complete out of order.

        Within a batch, a given range of a resource <b>must</b> not be bound more than once. Across batches, if a range is to be bound to one allocation and offset and then to another allocation and offset, then the application <b>must</b> guarantee (usually using semaphores) that the binding operations are executed in the correct order, as well as to order binding operations against the execution of command buffer submissions.

        As no operation to #QueueBindSparse() causes any pipeline stage to access memory, synchronization primitives used in this command effectively only define execution dependencies.

        Additional information about fence and semaphore operation is described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization">the synchronization chapter</a>.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code fence} is not #NULL_HANDLE, {@code fence} <b>must</b> be unsignaled</li>
            <li>If {@code fence} is not #NULL_HANDLE, {@code fence} <b>must</b> not be associated with any other queue command that has not yet completed execution on that queue</li>
            <li>Any given element of the {@code pSignalSemaphores} member of any element of {@code pBindInfo} <b>must</b> be unsignaled when the semaphore signal operation it defines is executed on the device</li>
            <li>When a semaphore unsignal operation defined by any element of the {@code pWaitSemaphores} member of any element of {@code pBindInfo} executes on {@code queue}, no other queue <b>must</b> be waiting on the same semaphore.</li>
            <li>All elements of the {@code pWaitSemaphores} member of all elements of {@code pBindInfo} <b>must</b> be semaphores that are signaled, or have <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-semaphores-signaling">semaphore signal operations</a> previously submitted for execution.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code queue} <b>must</b> be a valid {@code VkQueue} handle</li>
            <li>If {@code bindInfoCount} is not 0, {@code pBindInfo} <b>must</b> be a pointer to an array of {@code bindInfoCount} valid ##VkBindSparseInfo structures</li>
            <li>If {@code fence} is not #NULL_HANDLE, {@code fence} <b>must</b> be a valid {@code VkFence} handle</li>
            <li>The {@code queue} <b>must</b> support sparse binding operations</li>
            <li>Both of {@code fence}, and {@code queue} that are valid handles <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code queue} <b>must</b> be externally synchronized</li>
            <li>Host access to {@code pBindInfo}[].pWaitSemaphores[] <b>must</b> be externally synchronized</li>
            <li>Host access to {@code pBindInfo}[].pSignalSemaphores[] <b>must</b> be externally synchronized</li>
            <li>Host access to {@code pBindInfo}[].pBufferBinds[].buffer <b>must</b> be externally synchronized</li>
            <li>Host access to {@code pBindInfo}[].pImageOpaqueBinds[].image <b>must</b> be externally synchronized</li>
            <li>Host access to {@code pBindInfo}[].pImageBinds[].image <b>must</b> be externally synchronized</li>
            <li>Host access to {@code fence} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>-</td><td>-</td><td>SPARSE_BINDING</td><td>-</td></tr></tbody>
        </table>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_DEVICE_LOST</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkBindSparseInfo
        """,

        VkQueue.IN("queue", "the queue that the sparse binding operations will be submitted to."),
        AutoSize("pBindInfo")..uint32_t.IN("bindInfoCount", "the number of elements in the {@code pBindInfo} array."),
        nullable..const..VkBindSparseInfo.p.IN("pBindInfo", "an array of ##VkBindSparseInfo structures, each specifying a sparse binding submission batch."),
        VkFence.IN("fence", "an optional handle to a fence to be signaled. If {@code fence} is not #NULL_HANDLE, it defines a <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#synchronization-fences-signaling\">fence signal operation</a>.")
    )

    // Fence commands

    VkResult(
        "CreateFence",
        """
        Create a new fence object.

        <h5>C Specification</h5>
        To create a fence, call:

        <code><pre>
￿VkResult vkCreateFence(
￿    VkDevice                                    device,
￿    const VkFenceCreateInfo*                    pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkFence*                                    pFence);</pre></code>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid ##VkFenceCreateInfo structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pFence} <b>must</b> be a pointer to a {@code VkFence} handle</li>
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
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkFenceCreateInfo
        """,

        VkDevice.IN("device", "the logical device that creates the fence."),
        const..VkFenceCreateInfo.p.IN("pCreateInfo", "a pointer to an instance of the ##VkFenceCreateInfo structure which contains information about how the fence is to be created."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkFence.p.OUT("pFence", "points to a handle in which the resulting fence object is returned.")
    )

    void(
        "DestroyFence",
        """
        Destroy a fence object.

        <h5>C Specification</h5>
        To destroy a fence, call:

        <code><pre>
￿void vkDestroyFence(
￿    VkDevice                                    device,
￿    VkFence                                     fence,
￿    const VkAllocationCallbacks*                pAllocator);</pre></code>

        <h5>Valid Usage</h5>
        <ul>
            <li>All <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#devsandqueues-submission">queue submission</a> commands that refer to {@code fence} <b>must</b> have completed execution</li>
            <li>If ##VkAllocationCallbacks were provided when {@code fence} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code fence} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code fence} is not #NULL_HANDLE, {@code fence} <b>must</b> be a valid {@code VkFence} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code fence} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code fence} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice.IN("device", "the logical device that destroys the fence."),
        VkFence.IN("fence", "the handle of the fence to destroy."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    VkResult(
        "ResetFences",
        """
        Resets one or more fence objects.

        <h5>C Specification</h5>
        To set the state of fences to unsignaled from the host, call:

        <code><pre>
￿VkResult vkResetFences(
￿    VkDevice                                    device,
￿    uint32_t                                    fenceCount,
￿    const VkFence*                              pFences);</pre></code>

        <h5>Description</h5>
        When #ResetFences() is executed on the host, it defines a <em>fence unsignal operation</em> for each fence, which resets the fence to the unsignaled state.

        If any member of {@code pFences} is already in the unsignaled state when #ResetFences() is executed, then #ResetFences() has no effect on that fence.

        <h5>Valid Usage</h5>
        <ul>
            <li>Any given element of {@code pFences} <b>must</b> not currently be associated with any queue command that has not yet completed execution on that queue</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pFences} <b>must</b> be a pointer to an array of {@code fenceCount} valid {@code VkFence} handles</li>
            <li>{@code fenceCount} <b>must</b> be greater than 0</li>
            <li>Each element of {@code pFences} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to each member of {@code pFences} <b>must</b> be externally synchronized</li>
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
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>
        """,

        VkDevice.IN("device", "the logical device that owns the fences."),
        AutoSize("pFences")..uint32_t.IN("fenceCount", "the number of fences to reset."),
        const..VkFence.p.IN("pFences", "a pointer to an array of fence handles to reset.")
    )

    VkResult(
        "GetFenceStatus",
        """
        Return the status of a fence.

        <h5>C Specification</h5>
        To query the status of a fence from the host, call:

        <code><pre>
￿VkResult vkGetFenceStatus(
￿    VkDevice                                    device,
￿    VkFence                                     fence);</pre></code>

        <h5>Description</h5>
        Upon success, #GetFenceStatus() returns the status of the fence object, with the following return codes:

        <h6>Fence Object Status Codes</h6>
        <table class="lwjgl">
            <thead><tr><th>Status</th><th>Meaning</th></tr></thead>
            <tbody>
                <tr><td>#SUCCESS</td><td>The fence specified by {@code fence} is signaled.</td></tr>
                <tr><td>#NOT_READY</td><td>The fence specified by {@code fence} is unsignaled.</td></tr>
                <tr><td>#DEVICE_LOST</td><td>The device has been lost.  See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#devsandqueues-lost-device">Lost Device</a>.</td></tr>
            </tbody>
        </table>

        If a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#devsandqueues-submission">queue submission</a> command is pending execution, then the value returned by this command <b>may</b> immediately be out of date.

        If the device has been lost (see <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#devsandqueues-lost-device">Lost Device</a>), #GetFenceStatus() <b>may</b> return any of the above status codes. If the device has been lost and #GetFenceStatus() is called repeatedly, it will eventually return either #SUCCESS or #DEVICE_LOST.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code fence} <b>must</b> be a valid {@code VkFence} handle</li>
            <li>{@code fence} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#NOT_READY</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_DEVICE_LOST</li>
            </ul></dd>
        </dl>
        """,

        VkDevice.IN("device", "the logical device that owns the fence."),
        VkFence.IN("fence", "the handle of the fence to query.")
    )

    VkResult(
        "WaitForFences",
        """
        Wait for one or more fences to become signaled.

        <h5>C Specification</h5>
        To wait for one or more fences to enter the signaled state on the host, call:

        <code><pre>
￿VkResult vkWaitForFences(
￿    VkDevice                                    device,
￿    uint32_t                                    fenceCount,
￿    const VkFence*                              pFences,
￿    VkBool32                                    waitAll,
￿    uint64_t                                    timeout);</pre></code>

        <h5>Description</h5>
        If the condition is satisfied when #WaitForFences() is called, then #WaitForFences() returns immediately. If the condition is not satisfied at the time #WaitForFences() is called, then #WaitForFences() will block and wait up to {@code timeout} nanoseconds for the condition to become satisfied.

        If {@code timeout} is zero, then #WaitForFences() does not wait, but simply returns the current state of the fences. #TIMEOUT will be returned in this case if the condition is not satisfied, even though no actual wait was performed.

        If the specified timeout period expires before the condition is satisfied, #WaitForFences() returns #TIMEOUT. If the condition is satisfied before {@code timeout} nanoseconds has expired, #WaitForFences() returns #SUCCESS.

        If device loss occurs (see <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#devsandqueues-lost-device">Lost Device</a>) before the timeout has expired, #WaitForFences() <b>must</b> return in finite time with either #SUCCESS or #DEVICE_LOST.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        While we guarantee that #WaitForFences() <b>must</b> return in finite time, no guarantees are made that it returns immediately upon device loss. However, the client can reasonably expect that the delay will be on the order of seconds and that calling #WaitForFences() will not result in a permanently (or seemingly permanently) dead process.
        </div>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pFences} <b>must</b> be a pointer to an array of {@code fenceCount} valid {@code VkFence} handles</li>
            <li>{@code fenceCount} <b>must</b> be greater than 0</li>
            <li>Each element of {@code pFences} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#TIMEOUT</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_DEVICE_LOST</li>
            </ul></dd>
        </dl>
        """,

        VkDevice.IN("device", "the logical device that owns the fences."),
        AutoSize("pFences")..uint32_t.IN("fenceCount", "the number of fences to wait on."),
        const..VkFence.p.IN("pFences", "a pointer to an array of {@code fenceCount} fence handles."),
        VkBool32.IN("waitAll", "the condition that <b>must</b> be satisfied to successfully unblock the wait. If {@code waitAll} is #TRUE, then the condition is that all fences in {@code pFences} are signaled. Otherwise, the condition is that at least one fence in {@code pFences} is signaled."),
        uint64_t.IN("timeout", "the timeout period in units of nanoseconds. {@code timeout} is adjusted to the closest value allowed by the implementation-dependent timeout accuracy, which <b>may</b> be substantially longer than one nanosecond, and <b>may</b> be longer than the requested period.")
    )

    // Queue semaphore commands

    VkResult(
        "CreateSemaphore",
        """
        Create a new queue semaphore object.

        <h5>C Specification</h5>
        To create a semaphore, call:

        <code><pre>
￿VkResult vkCreateSemaphore(
￿    VkDevice                                    device,
￿    const VkSemaphoreCreateInfo*                pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkSemaphore*                                pSemaphore);</pre></code>

        <h5>Description</h5>
        When created, the semaphore is in the unsignaled state.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid ##VkSemaphoreCreateInfo structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pSemaphore} <b>must</b> be a pointer to a {@code VkSemaphore} handle</li>
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
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkSemaphoreCreateInfo
        """,

        VkDevice.IN("device", "the logical device that creates the semaphore."),
        const..VkSemaphoreCreateInfo.p.IN("pCreateInfo", "a pointer to an instance of the ##VkSemaphoreCreateInfo structure which contains information about how the semaphore is to be created."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkSemaphore.p.OUT("pSemaphore", "points to a handle in which the resulting semaphore object is returned.")
    )

    void(
        "DestroySemaphore",
        """
        Destroy a semaphore object.

        <h5>C Specification</h5>
        To destroy a semaphore, call:

        <code><pre>
￿void vkDestroySemaphore(
￿    VkDevice                                    device,
￿    VkSemaphore                                 semaphore,
￿    const VkAllocationCallbacks*                pAllocator);</pre></code>

        <h5>Valid Usage</h5>
        <ul>
            <li>All submitted batches that refer to {@code semaphore} <b>must</b> have completed execution</li>
            <li>If ##VkAllocationCallbacks were provided when {@code semaphore} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code semaphore} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code semaphore} is not #NULL_HANDLE, {@code semaphore} <b>must</b> be a valid {@code VkSemaphore} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code semaphore} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code semaphore} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice.IN("device", "the logical device that destroys the semaphore."),
        VkSemaphore.IN("semaphore", "the handle of the semaphore to destroy."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    // Event commands

    VkResult(
        "CreateEvent",
        """
        Create a new event object.

        <h5>C Specification</h5>
        To create an event, call:

        <code><pre>
￿VkResult vkCreateEvent(
￿    VkDevice                                    device,
￿    const VkEventCreateInfo*                    pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkEvent*                                    pEvent);</pre></code>

        <h5>Description</h5>
        When created, the event object is in the unsignaled state.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid ##VkEventCreateInfo structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pEvent} <b>must</b> be a pointer to a {@code VkEvent} handle</li>
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
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkEventCreateInfo
        """,

        VkDevice.IN("device", "the logical device that creates the event."),
        const..VkEventCreateInfo.p.IN("pCreateInfo", "a pointer to an instance of the ##VkEventCreateInfo structure which contains information about how the event is to be created."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkEvent.p.OUT("pEvent", "points to a handle in which the resulting event object is returned.")
    )

    void(
        "DestroyEvent",
        """
        Destroy an event object.

        <h5>C Specification</h5>
        To destroy an event, call:

        <code><pre>
￿void vkDestroyEvent(
￿    VkDevice                                    device,
￿    VkEvent                                     event,
￿    const VkAllocationCallbacks*                pAllocator);</pre></code>

        <h5>Valid Usage</h5>
        <ul>
            <li>All submitted commands that refer to {@code event} <b>must</b> have completed execution</li>
            <li>If ##VkAllocationCallbacks were provided when {@code event} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code event} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code event} is not #NULL_HANDLE, {@code event} <b>must</b> be a valid {@code VkEvent} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code event} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code event} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice.IN("device", "the logical device that destroys the event."),
        VkEvent.IN("event", "the handle of the event to destroy."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    VkResult(
        "GetEventStatus",
        """
        Retrieve the status of an event object.

        <h5>C Specification</h5>
        To query the state of an event from the host, call:

        <code><pre>
￿VkResult vkGetEventStatus(
￿    VkDevice                                    device,
￿    VkEvent                                     event);</pre></code>

        <h5>Description</h5>
        Upon success, #GetEventStatus() returns the state of the event object with the following return codes:

        <h6>Event Object Status Codes</h6>
        <table class="lwjgl">
            <thead><tr><th>Status</th><th>Meaning</th></tr></thead>
            <tbody>
                <tr><td>#EVENT_SET</td><td>The event specified by {@code event} is signaled.</td></tr>
                <tr><td>#EVENT_RESET</td><td>The event specified by {@code event} is unsignaled.</td></tr>
            </tbody>
        </table>

        If a #CmdSetEvent() or #CmdResetEvent() command is in a command buffer that is in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">pending state</a>, then the value returned by this command <b>may</b> immediately be out of date.

        The state of an event <b>can</b> be updated by the host. The state of the event is immediately changed, and subsequent calls to #GetEventStatus() will return the new state. If an event is already in the requested state, then updating it to the same state has no effect.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code event} <b>must</b> be a valid {@code VkEvent} handle</li>
            <li>{@code event} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#EVENT_SET</li>
                <li>#EVENT_RESET</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_DEVICE_LOST</li>
            </ul></dd>
        </dl>
        """,

        VkDevice.IN("device", "the logical device that owns the event."),
        VkEvent.IN("event", "the handle of the event to query.")
    )

    VkResult(
        "SetEvent",
        """
        Set an event to signaled state.

        <h5>C Specification</h5>
        To set the state of an event to signaled from the host, call:

        <code><pre>
￿VkResult vkSetEvent(
￿    VkDevice                                    device,
￿    VkEvent                                     event);</pre></code>

        <h5>Description</h5>
        When #SetEvent() is executed on the host, it defines an <em>event signal operation</em> which sets the event to the signaled state.

        If {@code event} is already in the signaled state when #SetEvent() is executed, then #SetEvent() has no effect, and no event signal operation occurs.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code event} <b>must</b> be a valid {@code VkEvent} handle</li>
            <li>{@code event} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code event} <b>must</b> be externally synchronized</li>
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
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>
        """,

        VkDevice.IN("device", "the logical device that owns the event."),
        VkEvent.IN("event", "the event to set.")
    )

    VkResult(
        "ResetEvent",
        """
        Reset an event to non-signaled state.

        <h5>C Specification</h5>
        To set the state of an event to unsignaled from the host, call:

        <code><pre>
￿VkResult vkResetEvent(
￿    VkDevice                                    device,
￿    VkEvent                                     event);</pre></code>

        <h5>Description</h5>
        When #ResetEvent() is executed on the host, it defines an <em>event unsignal operation</em> which resets the event to the unsignaled state.

        If {@code event} is already in the unsignaled state when #ResetEvent() is executed, then #ResetEvent() has no effect, and no event unsignal operation occurs.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code event} <b>must</b> not be waited on by a #CmdWaitEvents() command that is currently executing</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code event} <b>must</b> be a valid {@code VkEvent} handle</li>
            <li>{@code event} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code event} <b>must</b> be externally synchronized</li>
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
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>
        """,

        VkDevice.IN("device", "the logical device that owns the event."),
        VkEvent.IN("event", "the event to reset.")
    )

    // Query commands

    VkResult(
        "CreateQueryPool",
        """
        Create a new query pool object.

        <h5>C Specification</h5>
        To create a query pool, call:

        <code><pre>
￿VkResult vkCreateQueryPool(
￿    VkDevice                                    device,
￿    const VkQueryPoolCreateInfo*                pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkQueryPool*                                pQueryPool);</pre></code>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid ##VkQueryPoolCreateInfo structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pQueryPool} <b>must</b> be a pointer to a {@code VkQueryPool} handle</li>
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
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkQueryPoolCreateInfo
        """,

        VkDevice.IN("device", "the logical device that creates the query pool."),
        const..VkQueryPoolCreateInfo.p.IN("pCreateInfo", "a pointer to an instance of the ##VkQueryPoolCreateInfo structure containing the number and type of queries to be managed by the pool."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkQueryPool.p.OUT("pQueryPool", "a pointer to a {@code VkQueryPool} handle in which the resulting query pool object is returned.")
    )

    void(
        "DestroyQueryPool",
        """
        Destroy a query pool object.

        <h5>C Specification</h5>
        To destroy a query pool, call:

        <code><pre>
￿void vkDestroyQueryPool(
￿    VkDevice                                    device,
￿    VkQueryPool                                 queryPool,
￿    const VkAllocationCallbacks*                pAllocator);</pre></code>

        <h5>Valid Usage</h5>
        <ul>
            <li>All submitted commands that refer to {@code queryPool} <b>must</b> have completed execution</li>
            <li>If ##VkAllocationCallbacks were provided when {@code queryPool} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code queryPool} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code queryPool} is not #NULL_HANDLE, {@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code queryPool} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code queryPool} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice.IN("device", "the logical device that destroys the query pool."),
        VkQueryPool.IN("queryPool", "the query pool to destroy."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    VkResult(
        "GetQueryPoolResults",
        """
        Copy results of queries in a query pool to a host memory region.

        <h5>C Specification</h5>
        To retrieve status and results for a set of queries, call:

        <code><pre>
￿VkResult vkGetQueryPoolResults(
￿    VkDevice                                    device,
￿    VkQueryPool                                 queryPool,
￿    uint32_t                                    firstQuery,
￿    uint32_t                                    queryCount,
￿    size_t                                      dataSize,
￿    void*                                       pData,
￿    VkDeviceSize                                stride,
￿    VkQueryResultFlags                          flags);</pre></code>

        <h5>Description</h5>
        If no bits are set in {@code flags}, and all requested queries are in the available state, results are written as an array of 32-bit unsigned integer values. The behavior when not all queries are available, is described <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#queries-wait-bit-not-set">below</a>.

        If #QUERY_RESULT_64_BIT is not set and the result overflows a 32-bit value, the value <b>may</b> either wrap or saturate. Similarly, if #QUERY_RESULT_64_BIT is set and the result overflows a 64-bit value, the value <b>may</b> either wrap or saturate.

        If #QUERY_RESULT_WAIT_BIT is set, Vulkan will wait for each query to be in the available state before retrieving the numerical results for that query. In this case, #GetQueryPoolResults() is guaranteed to succeed and return #SUCCESS if the queries become available in a finite time (i.e. if they have been issued and not reset). If queries will never finish (e.g. due to being reset but not issued), then #GetQueryPoolResults() <b>may</b> not return in finite time.

        If #QUERY_RESULT_WAIT_BIT and #QUERY_RESULT_PARTIAL_BIT are both not set then no result values are written to {@code pData} for queries that are in the unavailable state at the time of the call, and #GetQueryPoolResults() returns #NOT_READY. However, availability state is still written to {@code pData} for those queries if #QUERY_RESULT_WITH_AVAILABILITY_BIT is set.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Applications <b>must</b> take care to ensure that use of the #QUERY_RESULT_WAIT_BIT bit has the desired effect.

        For example, if a query has been used previously and a command buffer records the commands #CmdResetQueryPool(), #CmdBeginQuery(), and #CmdEndQuery() for that query, then the query will remain in the available state until the #CmdResetQueryPool() command executes on a queue. Applications <b>can</b> use fences or events to ensure that a query has already been reset before checking for its results or availability status. Otherwise, a stale value could be returned from a previous use of the query.

        The above also applies when #QUERY_RESULT_WAIT_BIT is used in combination with #QUERY_RESULT_WITH_AVAILABILITY_BIT. In this case, the returned availability status <b>may</b> reflect the result of a previous use of the query unless the #CmdResetQueryPool() command has been executed since the last use of the query.
        </div>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Applications <b>can</b> double-buffer query pool usage, with a pool per frame, and reset queries at the end of the frame in which they are read.
        </div>

        If #QUERY_RESULT_PARTIAL_BIT is set, #QUERY_RESULT_WAIT_BIT is not set, and the query's status is unavailable, an intermediate result value between zero and the final result value is written to {@code pData} for that query.

        #QUERY_RESULT_PARTIAL_BIT <b>must</b> not be used if the pool's {@code queryType} is #QUERY_TYPE_TIMESTAMP.

        If #QUERY_RESULT_WITH_AVAILABILITY_BIT is set, the final integer value written for each query is non-zero if the query's status was available or zero if the status was unavailable. When #QUERY_RESULT_WITH_AVAILABILITY_BIT is used, implementations <b>must</b> guarantee that if they return a non-zero availability value then the numerical results <b>must</b> be valid, assuming the results are not reset by a subsequent command.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Satisfying this guarantee <b>may</b> require careful ordering by the application, e.g. to read the availability status before reading the results.
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code firstQuery} <b>must</b> be less than the number of queries in {@code queryPool}</li>
            <li>If #QUERY_RESULT_64_BIT is not set in {@code flags} then {@code pData} and {@code stride} <b>must</b> be multiples of 4</li>
            <li>If #QUERY_RESULT_64_BIT is set in {@code flags} then {@code pData} and {@code stride} <b>must</b> be multiples of 8</li>
            <li>The sum of {@code firstQuery} and {@code queryCount} <b>must</b> be less than or equal to the number of queries in {@code queryPool}</li>
            <li>{@code dataSize} <b>must</b> be large enough to contain the result of each query, as described <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#queries-operation-memorylayout">here</a></li>
            <li>If the {@code queryType} used to create {@code queryPool} was #QUERY_TYPE_TIMESTAMP, {@code flags} <b>must</b> not contain #QUERY_RESULT_PARTIAL_BIT</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
            <li>{@code pData} <b>must</b> be a pointer to an array of {@code dataSize} bytes</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkQueryResultFlagBits} values</li>
            <li>{@code dataSize} <b>must</b> be greater than 0</li>
            <li>{@code queryPool} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#NOT_READY</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_DEVICE_LOST</li>
            </ul></dd>
        </dl>
        """,

        VkDevice.IN("device", "the logical device that owns the query pool."),
        VkQueryPool.IN("queryPool", "the query pool managing the queries containing the desired results."),
        uint32_t.IN("firstQuery", "the initial query index."),
        uint32_t.IN("queryCount", "the number of queries. {@code firstQuery} and {@code queryCount} together define a range of queries. For pipeline statistics queries, each query index in the pool contains one integer value for each bit that is enabled in ##VkQueryPoolCreateInfo{@code ::pipelineStatistics} when the pool is created."),
        AutoSize("pData")..size_t.IN("dataSize", "the size in bytes of the buffer pointed to by {@code pData}."),
        void_p.OUT("pData", "a pointer to a user-allocated buffer where the results will be written"),
        VkDeviceSize.IN("stride", "the stride in bytes between results for individual queries within {@code pData}."),
        VkQueryResultFlags.IN("flags", "a bitmask of {@code VkQueryResultFlagBits} specifying how and when results are returned.")
    )

    // Buffer commands

    VkResult(
        "CreateBuffer",
        """
        Create a new buffer object.

        <h5>C Specification</h5>
        To create buffers, call:

        <code><pre>
￿VkResult vkCreateBuffer(
￿    VkDevice                                    device,
￿    const VkBufferCreateInfo*                   pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkBuffer*                                   pBuffer);</pre></code>

        <h5>Valid Usage</h5>
        <ul>
            <li>If the {@code flags} member of {@code pCreateInfo} includes #BUFFER_CREATE_SPARSE_BINDING_BIT, creating this {@code VkBuffer} <b>must</b> not cause the total required sparse memory for all currently valid sparse resources on the device to exceed ##VkPhysicalDeviceLimits{@code ::sparseAddressSpaceSize}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid ##VkBufferCreateInfo structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pBuffer} <b>must</b> be a pointer to a {@code VkBuffer} handle</li>
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
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkBufferCreateInfo
        """,

        VkDevice.IN("device", "the logical device that creates the buffer object."),
        const..VkBufferCreateInfo.p.IN("pCreateInfo", "a pointer to an instance of the ##VkBufferCreateInfo structure containing parameters affecting creation of the buffer."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkBuffer.p.OUT("pBuffer", "points to a {@code VkBuffer} handle in which the resulting buffer object is returned.")
    )

    void(
        "DestroyBuffer",
        """
        Destroy a buffer object.

        <h5>C Specification</h5>
        To destroy a buffer, call:

        <code><pre>
￿void vkDestroyBuffer(
￿    VkDevice                                    device,
￿    VkBuffer                                    buffer,
￿    const VkAllocationCallbacks*                pAllocator);</pre></code>

        <h5>Valid Usage</h5>
        <ul>
            <li>All submitted commands that refer to {@code buffer}, either directly or via a {@code VkBufferView}, <b>must</b> have completed execution</li>
            <li>If ##VkAllocationCallbacks were provided when {@code buffer} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code buffer} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code buffer} is not #NULL_HANDLE, {@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code buffer} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code buffer} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice.IN("device", "the logical device that destroys the buffer."),
        VkBuffer.IN("buffer", "the buffer to destroy."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    // Buffer view commands

    VkResult(
        "CreateBufferView",
        """
        Create a new buffer view object.

        <h5>C Specification</h5>
        To create a buffer view, call:

        <code><pre>
￿VkResult vkCreateBufferView(
￿    VkDevice                                    device,
￿    const VkBufferViewCreateInfo*               pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkBufferView*                               pView);</pre></code>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid ##VkBufferViewCreateInfo structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pView} <b>must</b> be a pointer to a {@code VkBufferView} handle</li>
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
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkBufferViewCreateInfo
        """,

        VkDevice.IN("device", "the logical device that creates the buffer view."),
        const..VkBufferViewCreateInfo.p.IN("pCreateInfo", "a pointer to an instance of the ##VkBufferViewCreateInfo structure containing parameters to be used to create the buffer."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkBufferView.p.OUT("pView", "points to a {@code VkBufferView} handle in which the resulting buffer view object is returned.")
    )

    void(
        "DestroyBufferView",
        """
        Destroy a buffer view object.

        <h5>C Specification</h5>
        To destroy a buffer view, call:

        <code><pre>
￿void vkDestroyBufferView(
￿    VkDevice                                    device,
￿    VkBufferView                                bufferView,
￿    const VkAllocationCallbacks*                pAllocator);</pre></code>

        <h5>Valid Usage</h5>
        <ul>
            <li>All submitted commands that refer to {@code bufferView} <b>must</b> have completed execution</li>
            <li>If ##VkAllocationCallbacks were provided when {@code bufferView} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code bufferView} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code bufferView} is not #NULL_HANDLE, {@code bufferView} <b>must</b> be a valid {@code VkBufferView} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code bufferView} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code bufferView} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice.IN("device", "the logical device that destroys the buffer view."),
        VkBufferView.IN("bufferView", "the buffer view to destroy."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    // Image commands

    VkResult(
        "CreateImage",
        """
        Create a new image object.

        <h5>C Specification</h5>
        To create images, call:

        <code><pre>
￿VkResult vkCreateImage(
￿    VkDevice                                    device,
￿    const VkImageCreateInfo*                    pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkImage*                                    pImage);</pre></code>

        <h5>Valid Usage</h5>
        <ul>
            <li>If the {@code flags} member of {@code pCreateInfo} includes #IMAGE_CREATE_SPARSE_BINDING_BIT, creating this {@code VkImage} <b>must</b> not cause the total required sparse memory for all currently valid sparse resources on the device to exceed ##VkPhysicalDeviceLimits{@code ::sparseAddressSpaceSize}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid ##VkImageCreateInfo structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pImage} <b>must</b> be a pointer to a {@code VkImage} handle</li>
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
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkImageCreateInfo
        """,

        VkDevice.IN("device", "the logical device that creates the image."),
        const..VkImageCreateInfo.p.IN("pCreateInfo", "a pointer to an instance of the ##VkImageCreateInfo structure containing parameters to be used to create the image."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkImage.p.OUT("pImage", "points to a {@code VkImage} handle in which the resulting image object is returned.")
    )

    void(
        "DestroyImage",
        """
        Destroy an image object.

        <h5>C Specification</h5>
        To destroy an image, call:

        <code><pre>
￿void vkDestroyImage(
￿    VkDevice                                    device,
￿    VkImage                                     image,
￿    const VkAllocationCallbacks*                pAllocator);</pre></code>

        <h5>Valid Usage</h5>
        <ul>
            <li>All submitted commands that refer to {@code image}, either directly or via a {@code VkImageView}, <b>must</b> have completed execution</li>
            <li>If ##VkAllocationCallbacks were provided when {@code image} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code image} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code image} is not #NULL_HANDLE, {@code image} <b>must</b> be a valid {@code VkImage} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code image} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code image} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice.IN("device", "the logical device that destroys the image."),
        VkImage.IN("image", "the image to destroy."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    void(
        "GetImageSubresourceLayout",
        """
        Retrieve information about an image subresource.

        <h5>C Specification</h5>
        To query the host access layout of an image subresource, for an image created with linear tiling, call:

        <code><pre>
￿void vkGetImageSubresourceLayout(
￿    VkDevice                                    device,
￿    VkImage                                     image,
￿    const VkImageSubresource*                   pSubresource,
￿    VkSubresourceLayout*                        pLayout);</pre></code>

        <h5>Description</h5>
        #GetImageSubresourceLayout() is invariant for the lifetime of a single image.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code image} <b>must</b> have been created with {@code tiling} equal to #IMAGE_TILING_LINEAR</li>
            <li>The {@code aspectMask} member of {@code pSubresource} <b>must</b> only have a single bit set</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
            <li>{@code pSubresource} <b>must</b> be a pointer to a valid ##VkImageSubresource structure</li>
            <li>{@code pLayout} <b>must</b> be a pointer to a ##VkSubresourceLayout structure</li>
            <li>{@code image} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>See Also</h5>
        ##VkImageSubresource, ##VkSubresourceLayout
        """,

        VkDevice.IN("device", "the logical device that owns the image."),
        VkImage.IN("image", "the image whose layout is being queried."),
        const..VkImageSubresource.p.IN("pSubresource", "a pointer to a ##VkImageSubresource structure selecting a specific image for the image subresource."),
        VkSubresourceLayout.p.OUT("pLayout", "points to a ##VkSubresourceLayout structure in which the layout is returned.")
    )

    // Image view commands

    VkResult(
        "CreateImageView",
        """
        Create an image view from an existing image.

        <h5>C Specification</h5>
        To create an image view, call:

        <code><pre>
￿VkResult vkCreateImageView(
￿    VkDevice                                    device,
￿    const VkImageViewCreateInfo*                pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkImageView*                                pView);</pre></code>

        <h5>Description</h5>
        Some of the image creation parameters are inherited by the view. The remaining parameters are contained in the {@code pCreateInfo}.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid ##VkImageViewCreateInfo structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pView} <b>must</b> be a pointer to a {@code VkImageView} handle</li>
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
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkImageViewCreateInfo
        """,

        VkDevice.IN("device", "the logical device that creates the image view."),
        const..VkImageViewCreateInfo.p.IN("pCreateInfo", "a pointer to an instance of the ##VkImageViewCreateInfo structure containing parameters to be used to create the image view."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkImageView.p.OUT("pView", "points to a {@code VkImageView} handle in which the resulting image view object is returned.")
    )

    void(
        "DestroyImageView",
        """
        Destroy an image view object.

        <h5>C Specification</h5>
        To destroy an image view, call:

        <code><pre>
￿void vkDestroyImageView(
￿    VkDevice                                    device,
￿    VkImageView                                 imageView,
￿    const VkAllocationCallbacks*                pAllocator);</pre></code>

        <h5>Valid Usage</h5>
        <ul>
            <li>All submitted commands that refer to {@code imageView} <b>must</b> have completed execution</li>
            <li>If ##VkAllocationCallbacks were provided when {@code imageView} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code imageView} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code imageView} is not #NULL_HANDLE, {@code imageView} <b>must</b> be a valid {@code VkImageView} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code imageView} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code imageView} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice.IN("device", "the logical device that destroys the image view."),
        VkImageView.IN("imageView", "the image view to destroy."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    // Shader commands

    VkResult(
        "CreateShaderModule",
        """
        Creates a new shader module object.

        <h5>C Specification</h5>
        To create a shader module, call:

        <code><pre>
￿VkResult vkCreateShaderModule(
￿    VkDevice                                    device,
￿    const VkShaderModuleCreateInfo*             pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkShaderModule*                             pShaderModule);</pre></code>

        <h5>Description</h5>
        Once a shader module has been created, any entry points it contains <b>can</b> be used in pipeline shader stages as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#pipelines-compute">Compute Pipelines</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#pipelines-graphics">Graphics Pipelines</a>.

        If the shader stage fails to compile #ERROR_INVALID_SHADER_NV will be generated and the compile log will be reported back to the application by {@code VK_EXT_debug_report} if enabled.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid ##VkShaderModuleCreateInfo structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pShaderModule} <b>must</b> be a pointer to a {@code VkShaderModule} handle</li>
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
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_INVALID_SHADER_NV</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkShaderModuleCreateInfo
        """,

        VkDevice.IN("device", "the logical device that creates the shader module."),
        const..VkShaderModuleCreateInfo.p.IN("pCreateInfo", "parameter is a pointer to an instance of the ##VkShaderModuleCreateInfo structure."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkShaderModule.p.OUT("pShaderModule", "points to a {@code VkShaderModule} handle in which the resulting shader module object is returned.")
    )

    void(
        "DestroyShaderModule",
        """
        Destroy a shader module module.

        <h5>C Specification</h5>
        To destroy a shader module, call:

        <code><pre>
￿void vkDestroyShaderModule(
￿    VkDevice                                    device,
￿    VkShaderModule                              shaderModule,
￿    const VkAllocationCallbacks*                pAllocator);</pre></code>

        <h5>Description</h5>
        A shader module <b>can</b> be destroyed while pipelines created using its shaders are still in use.

        <h5>Valid Usage</h5>
        <ul>
            <li>If ##VkAllocationCallbacks were provided when {@code shaderModule} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code shaderModule} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code shaderModule} is not #NULL_HANDLE, {@code shaderModule} <b>must</b> be a valid {@code VkShaderModule} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code shaderModule} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code shaderModule} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice.IN("device", "the logical device that destroys the shader module."),
        VkShaderModule.IN("shaderModule", "the handle of the shader module to destroy."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    // Pipeline Cache commands

    VkResult(
        "CreatePipelineCache",
        """
        Creates a new pipeline cache.

        <h5>C Specification</h5>
        To create pipeline cache objects, call:

        <code><pre>
￿VkResult vkCreatePipelineCache(
￿    VkDevice                                    device,
￿    const VkPipelineCacheCreateInfo*            pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkPipelineCache*                            pPipelineCache);</pre></code>

        <h5>Description</h5>
        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Applications <b>can</b> track and manage the total host memory size of a pipeline cache object using the {@code pAllocator}. Applications <b>can</b> limit the amount of data retrieved from a pipeline cache object in #GetPipelineCacheData(). Implementations <b>should</b> not internally limit the total number of entries added to a pipeline cache object or the total host memory consumed.
        </div>

        Once created, a pipeline cache <b>can</b> be passed to the #CreateGraphicsPipelines() and #CreateComputePipelines() commands. If the pipeline cache passed into these commands is not #NULL_HANDLE, the implementation will query it for possible reuse opportunities and update it with new content. The use of the pipeline cache object in these commands is internally synchronized, and the same pipeline cache object <b>can</b> be used in multiple threads simultaneously.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Implementations <b>should</b> make every effort to limit any critical sections to the actual accesses to the cache, which is expected to be significantly shorter than the duration of the #CreateGraphicsPipelines() and #CreateComputePipelines() commands.
        </div>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid ##VkPipelineCacheCreateInfo structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pPipelineCache} <b>must</b> be a pointer to a {@code VkPipelineCache} handle</li>
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
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkPipelineCacheCreateInfo
        """,

        VkDevice.IN("device", "the logical device that creates the pipeline cache object."),
        const..VkPipelineCacheCreateInfo.p.IN("pCreateInfo", "a pointer to a ##VkPipelineCacheCreateInfo structure that contains the initial parameters for the pipeline cache object."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkPipelineCache.p.OUT("pPipelineCache", "a pointer to a {@code VkPipelineCache} handle in which the resulting pipeline cache object is returned.")
    )

    void(
        "DestroyPipelineCache",
        """
        Destroy a pipeline cache object.

        <h5>C Specification</h5>
        To destroy a pipeline cache, call:

        <code><pre>
￿void vkDestroyPipelineCache(
￿    VkDevice                                    device,
￿    VkPipelineCache                             pipelineCache,
￿    const VkAllocationCallbacks*                pAllocator);</pre></code>

        <h5>Valid Usage</h5>
        <ul>
            <li>If ##VkAllocationCallbacks were provided when {@code pipelineCache} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code pipelineCache} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code pipelineCache} is not #NULL_HANDLE, {@code pipelineCache} <b>must</b> be a valid {@code VkPipelineCache} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code pipelineCache} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code pipelineCache} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice.IN("device", "the logical device that destroys the pipeline cache object."),
        VkPipelineCache.IN("pipelineCache", "the handle of the pipeline cache to destroy."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    VkResult(
        "GetPipelineCacheData",
        """
        Get the data store from a pipeline cache.

        <h5>C Specification</h5>
        Data <b>can</b> be retrieved from a pipeline cache object using the command:

        <code><pre>
￿VkResult vkGetPipelineCacheData(
￿    VkDevice                                    device,
￿    VkPipelineCache                             pipelineCache,
￿    size_t*                                     pDataSize,
￿    void*                                       pData);</pre></code>

        <h5>Description</h5>
        If {@code pData} is {@code NULL}, then the maximum size of the data that <b>can</b> be retrieved from the pipeline cache, in bytes, is returned in {@code pDataSize}. Otherwise, {@code pDataSize} <b>must</b> point to a variable set by the user to the size of the buffer, in bytes, pointed to by {@code pData}, and on return the variable is overwritten with the amount of data actually written to {@code pData}.

        If {@code pDataSize} is less than the maximum size that <b>can</b> be retrieved by the pipeline cache, at most {@code pDataSize} bytes will be written to {@code pData}, and #GetPipelineCacheData() will return #INCOMPLETE. Any data written to {@code pData} is valid and <b>can</b> be provided as the {@code pInitialData} member of the ##VkPipelineCacheCreateInfo structure passed to #CreatePipelineCache().

        Two calls to #GetPipelineCacheData() with the same parameters <b>must</b> retrieve the same data unless a command that modifies the contents of the cache is called between them.

        Applications <b>can</b> store the data retrieved from the pipeline cache, and use these data, possibly in a future run of the application, to populate new pipeline cache objects. The results of pipeline compiles, however, <b>may</b> depend on the vendor ID, device ID, driver version, and other details of the device. To enable applications to detect when previously retrieved data is incompatible with the device, the initial bytes written to {@code pData} <b>must</b> be a header consisting of the following members:

        <h6>Layout for pipeline cache header version ename:VK_PIPELINE_CACHE_HEADER_VERSION_ONE</h6>
        <table class="lwjgl">
            <thead><tr><th>Offset</th><th>Size</th><th>Meaning</th></tr></thead>
            <tbody>
                <tr><td>0</td><td>4</td><td>length in bytes of the entire pipeline cache header written as a stream of bytes, with the least significant byte first</td></tr>
                <tr><td>4</td><td>4</td><td>a {@code VkPipelineCacheHeaderVersion} value written as a stream of bytes, with the least significant byte first</td></tr>
                <tr><td>8</td><td>4</td><td>a vendor ID equal to ##VkPhysicalDeviceProperties{@code ::vendorID} written as a stream of bytes, with the least significant byte first</td></tr>
                <tr><td>12</td><td>4</td><td>a device ID equal to ##VkPhysicalDeviceProperties{@code ::deviceID} written as a stream of bytes, with the least significant byte first</td></tr>
                <tr><td>16</td><td>#UUID_SIZE</td><td>a pipeline cache ID equal to ##VkPhysicalDeviceProperties{@code ::pipelineCacheUUID}</td></tr>
            </tbody>
        </table>

        The first four bytes encode the length of the entire pipeline header, in bytes. This value includes all fields in the header including the pipeline cache version field and the size of the length field.

        The next four bytes in the header returned by #GetPipelineCacheData() encode the pipeline cache version. This field is interpreted as a {@code VkPipelineCacheHeaderVersion} value, and <b>must</b> have one of the following values:

        <code><pre>
￿typedef enum VkPipelineCacheHeaderVersion {
￿    VK_PIPELINE_CACHE_HEADER_VERSION_ONE = 1,
￿} VkPipelineCacheHeaderVersion;</pre></code>

        A consumer of the pipeline cache <b>should</b> use the cache version to interpret the remainder of the cache header.

        If {@code pDataSize} is less than what is necessary to store this header, nothing will be written to {@code pData} and zero will be written to {@code pDataSize}.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pipelineCache} <b>must</b> be a valid {@code VkPipelineCache} handle</li>
            <li>{@code pDataSize} <b>must</b> be a pointer to a {@code size_t} value</li>
            <li>If the value referenced by {@code pDataSize} is not 0, and {@code pData} is not {@code NULL}, {@code pData} <b>must</b> be a pointer to an array of {@code pDataSize} bytes</li>
            <li>{@code pipelineCache} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
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
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>
        """,

        VkDevice.IN("device", "the logical device that owns the pipeline cache."),
        VkPipelineCache.IN("pipelineCache", "the pipeline cache to retrieve data from."),
        AutoSize("pData")..Check(1)..size_t_p.INOUT("pDataSize", "a pointer to a value related to the amount of data in the pipeline cache, as described below."),
        nullable..void_p.OUT("pData", "either {@code NULL} or a pointer to a buffer.")
    )

    VkResult(
        "MergePipelineCaches",
        """
        Combine the data stores of pipeline caches.

        <h5>C Specification</h5>
        Pipeline cache objects <b>can</b> be merged using the command:

        <code><pre>
￿VkResult vkMergePipelineCaches(
￿    VkDevice                                    device,
￿    VkPipelineCache                             dstCache,
￿    uint32_t                                    srcCacheCount,
￿    const VkPipelineCache*                      pSrcCaches);</pre></code>

        <h5>Description</h5>
        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The details of the merge operation are implementation dependent, but implementations <b>should</b> merge the contents of the specified pipelines and prune duplicate entries.
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code dstCache} <b>must</b> not appear in the list of source caches</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code dstCache} <b>must</b> be a valid {@code VkPipelineCache} handle</li>
            <li>{@code pSrcCaches} <b>must</b> be a pointer to an array of {@code srcCacheCount} valid {@code VkPipelineCache} handles</li>
            <li>{@code srcCacheCount} <b>must</b> be greater than 0</li>
            <li>{@code dstCache} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
            <li>Each element of {@code pSrcCaches} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code dstCache} <b>must</b> be externally synchronized</li>
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
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>
        """,

        VkDevice.IN("device", "the logical device that owns the pipeline cache objects."),
        VkPipelineCache.IN("dstCache", "the handle of the pipeline cache to merge results into."),
        AutoSize("pSrcCaches")..uint32_t.IN("srcCacheCount", "the length of the {@code pSrcCaches} array."),
        const..VkPipelineCache.p.IN("pSrcCaches", "an array of pipeline cache handles, which will be merged into {@code dstCache}. The previous contents of {@code dstCache} are included after the merge.")
    )

    // Pipeline commands

    VkResult(
        "CreateGraphicsPipelines",
        """
        Create graphics pipelines.

        <h5>C Specification</h5>
        To create graphics pipelines, call:

        <code><pre>
￿VkResult vkCreateGraphicsPipelines(
￿    VkDevice                                    device,
￿    VkPipelineCache                             pipelineCache,
￿    uint32_t                                    createInfoCount,
￿    const VkGraphicsPipelineCreateInfo*         pCreateInfos,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkPipeline*                                 pPipelines);</pre></code>

        <h5>Description</h5>
        The ##VkGraphicsPipelineCreateInfo structure includes an array of shader create info structures containing all the desired active shader stages, as well as creation info to define all relevant fixed-function stages, and a pipeline layout.

        <h5>Valid Usage</h5>
        <ul>
            <li>If the {@code flags} member of any given element of {@code pCreateInfos} contains the #PIPELINE_CREATE_DERIVATIVE_BIT flag, and the {@code basePipelineIndex} member of that same element is not {@code -1}, {@code basePipelineIndex} <b>must</b> be less than the index into {@code pCreateInfos} that corresponds to that element</li>
            <li>If the {@code flags} member of any given element of {@code pCreateInfos} contains the #PIPELINE_CREATE_DERIVATIVE_BIT flag, the base pipeline <b>must</b> have been created with the #PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT flag set</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code pipelineCache} is not #NULL_HANDLE, {@code pipelineCache} <b>must</b> be a valid {@code VkPipelineCache} handle</li>
            <li>{@code pCreateInfos} <b>must</b> be a pointer to an array of {@code createInfoCount} valid ##VkGraphicsPipelineCreateInfo structures</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pPipelines} <b>must</b> be a pointer to an array of {@code createInfoCount} {@code VkPipeline} handles</li>
            <li>{@code createInfoCount} <b>must</b> be greater than 0</li>
            <li>If {@code pipelineCache} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
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
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_INVALID_SHADER_NV</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkGraphicsPipelineCreateInfo
        """,

        VkDevice.IN("device", "the logical device that creates the graphics pipelines."),
        VkPipelineCache.IN("pipelineCache", "either #NULL_HANDLE, indicating that pipeline caching is disabled; or the handle of a valid <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#pipelines-cache\">pipeline cache</a> object, in which case use of that cache is enabled for the duration of the command."),
        AutoSize("pCreateInfos", "pPipelines")..uint32_t.IN("createInfoCount", "the length of the {@code pCreateInfos} and {@code pPipelines} arrays."),
        const..VkGraphicsPipelineCreateInfo.p.IN("pCreateInfos", "an array of ##VkGraphicsPipelineCreateInfo structures."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        VkPipeline.p.OUT("pPipelines", "a pointer to an array in which the resulting graphics pipeline objects are returned.")
    )

    VkResult(
        "CreateComputePipelines",
        """
        Creates a new compute pipeline object.

        <h5>C Specification</h5>
        To create compute pipelines, call:

        <code><pre>
￿VkResult vkCreateComputePipelines(
￿    VkDevice                                    device,
￿    VkPipelineCache                             pipelineCache,
￿    uint32_t                                    createInfoCount,
￿    const VkComputePipelineCreateInfo*          pCreateInfos,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkPipeline*                                 pPipelines);</pre></code>

        <h5>Valid Usage</h5>
        <ul>
            <li>If the {@code flags} member of any given element of {@code pCreateInfos} contains the #PIPELINE_CREATE_DERIVATIVE_BIT flag, and the {@code basePipelineIndex} member of that same element is not {@code -1}, {@code basePipelineIndex} <b>must</b> be less than the index into {@code pCreateInfos} that corresponds to that element</li>
            <li>If the {@code flags} member of any given element of {@code pCreateInfos} contains the #PIPELINE_CREATE_DERIVATIVE_BIT flag, the base pipeline <b>must</b> have been created with the #PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT flag set</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code pipelineCache} is not #NULL_HANDLE, {@code pipelineCache} <b>must</b> be a valid {@code VkPipelineCache} handle</li>
            <li>{@code pCreateInfos} <b>must</b> be a pointer to an array of {@code createInfoCount} valid ##VkComputePipelineCreateInfo structures</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pPipelines} <b>must</b> be a pointer to an array of {@code createInfoCount} {@code VkPipeline} handles</li>
            <li>{@code createInfoCount} <b>must</b> be greater than 0</li>
            <li>If {@code pipelineCache} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
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
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_INVALID_SHADER_NV</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkComputePipelineCreateInfo
        """,

        VkDevice.IN("device", "the logical device that creates the compute pipelines."),
        VkPipelineCache.IN("pipelineCache", "either #NULL_HANDLE, indicating that pipeline caching is disabled; or the handle of a valid <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#pipelines-cache\">pipeline cache</a> object, in which case use of that cache is enabled for the duration of the command."),
        AutoSize("pCreateInfos", "pPipelines")..uint32_t.IN("createInfoCount", "the length of the {@code pCreateInfos} and {@code pPipelines} arrays."),
        const..VkComputePipelineCreateInfo.p.IN("pCreateInfos", "an array of ##VkComputePipelineCreateInfo structures."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        VkPipeline.p.OUT("pPipelines", """a pointer to an array in which the resulting compute pipeline objects are returned.
""")
    )

    void(
        "DestroyPipeline",
        """
        Destroy a pipeline object.

        <h5>C Specification</h5>
        To destroy a graphics or compute pipeline, call:

        <code><pre>
￿void vkDestroyPipeline(
￿    VkDevice                                    device,
￿    VkPipeline                                  pipeline,
￿    const VkAllocationCallbacks*                pAllocator);</pre></code>

        <h5>Valid Usage</h5>
        <ul>
            <li>All submitted commands that refer to {@code pipeline} <b>must</b> have completed execution</li>
            <li>If ##VkAllocationCallbacks were provided when {@code pipeline} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code pipeline} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code pipeline} is not #NULL_HANDLE, {@code pipeline} <b>must</b> be a valid {@code VkPipeline} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code pipeline} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code pipeline} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice.IN("device", "the logical device that destroys the pipeline."),
        VkPipeline.IN("pipeline", "the handle of the pipeline to destroy."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    // Pipeline layout commands

    VkResult(
        "CreatePipelineLayout",
        """
        Creates a new pipeline layout object.

        <h5>C Specification</h5>
        To create a pipeline layout, call:

        <code><pre>
￿VkResult vkCreatePipelineLayout(
￿    VkDevice                                    device,
￿    const VkPipelineLayoutCreateInfo*           pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkPipelineLayout*                           pPipelineLayout);</pre></code>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid ##VkPipelineLayoutCreateInfo structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pPipelineLayout} <b>must</b> be a pointer to a {@code VkPipelineLayout} handle</li>
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
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkPipelineLayoutCreateInfo
        """,

        VkDevice.IN("device", "the logical device that creates the pipeline layout."),
        const..VkPipelineLayoutCreateInfo.p.IN("pCreateInfo", "a pointer to an instance of the ##VkPipelineLayoutCreateInfo structure specifying the state of the pipeline layout object."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkPipelineLayout.p.OUT("pPipelineLayout", "points to a {@code VkPipelineLayout} handle in which the resulting pipeline layout object is returned.")
    )

    void(
        "DestroyPipelineLayout",
        """
        Destroy a pipeline layout object.

        <h5>C Specification</h5>
        To destroy a pipeline layout, call:

        <code><pre>
￿void vkDestroyPipelineLayout(
￿    VkDevice                                    device,
￿    VkPipelineLayout                            pipelineLayout,
￿    const VkAllocationCallbacks*                pAllocator);</pre></code>

        <h5>Valid Usage</h5>
        <ul>
            <li>If ##VkAllocationCallbacks were provided when {@code pipelineLayout} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code pipelineLayout} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code pipelineLayout} is not #NULL_HANDLE, {@code pipelineLayout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code pipelineLayout} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code pipelineLayout} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice.IN("device", "the logical device that destroys the pipeline layout."),
        VkPipelineLayout.IN("pipelineLayout", "the pipeline layout to destroy."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    // Sampler commands

    VkResult(
        "CreateSampler",
        """
        Create a new sampler object.

        <h5>C Specification</h5>
        To create a sampler object, call:

        <code><pre>
￿VkResult vkCreateSampler(
￿    VkDevice                                    device,
￿    const VkSamplerCreateInfo*                  pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkSampler*                                  pSampler);</pre></code>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid ##VkSamplerCreateInfo structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pSampler} <b>must</b> be a pointer to a {@code VkSampler} handle</li>
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
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_TOO_MANY_OBJECTS</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkSamplerCreateInfo
        """,

        VkDevice.IN("device", "the logical device that creates the sampler."),
        const..VkSamplerCreateInfo.p.IN("pCreateInfo", "a pointer to an instance of the ##VkSamplerCreateInfo structure specifying the state of the sampler object."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkSampler.p.OUT("pSampler", "points to a {@code VkSampler} handle in which the resulting sampler object is returned.")
    )

    void(
        "DestroySampler",
        """
        Destroy a sampler object.

        <h5>C Specification</h5>
        To destroy a sampler, call:

        <code><pre>
￿void vkDestroySampler(
￿    VkDevice                                    device,
￿    VkSampler                                   sampler,
￿    const VkAllocationCallbacks*                pAllocator);</pre></code>

        <h5>Valid Usage</h5>
        <ul>
            <li>All submitted commands that refer to {@code sampler} <b>must</b> have completed execution</li>
            <li>If ##VkAllocationCallbacks were provided when {@code sampler} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code sampler} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code sampler} is not #NULL_HANDLE, {@code sampler} <b>must</b> be a valid {@code VkSampler} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code sampler} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code sampler} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice.IN("device", "the logical device that destroys the sampler."),
        VkSampler.IN("sampler", "the sampler to destroy."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    // Descriptor set commands

    VkResult(
        "CreateDescriptorSetLayout",
        """
        Create a new descriptor set layout.

        <h5>C Specification</h5>
        To create descriptor set layout objects, call:

        <code><pre>
￿VkResult vkCreateDescriptorSetLayout(
￿    VkDevice                                    device,
￿    const VkDescriptorSetLayoutCreateInfo*      pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkDescriptorSetLayout*                      pSetLayout);</pre></code>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid ##VkDescriptorSetLayoutCreateInfo structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pSetLayout} <b>must</b> be a pointer to a {@code VkDescriptorSetLayout} handle</li>
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
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkDescriptorSetLayoutCreateInfo
        """,

        VkDevice.IN("device", "the logical device that creates the descriptor set layout."),
        const..VkDescriptorSetLayoutCreateInfo.p.IN("pCreateInfo", "a pointer to an instance of the ##VkDescriptorSetLayoutCreateInfo structure specifying the state of the descriptor set layout object."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkDescriptorSetLayout.p.OUT("pSetLayout", "points to a {@code VkDescriptorSetLayout} handle in which the resulting descriptor set layout object is returned.")
    )

    void(
        "DestroyDescriptorSetLayout",
        """
        Destroy a descriptor set layout object.

        <h5>C Specification</h5>
        To destroy a descriptor set layout, call:

        <code><pre>
￿void vkDestroyDescriptorSetLayout(
￿    VkDevice                                    device,
￿    VkDescriptorSetLayout                       descriptorSetLayout,
￿    const VkAllocationCallbacks*                pAllocator);</pre></code>

        <h5>Valid Usage</h5>
        <ul>
            <li>If ##VkAllocationCallbacks were provided when {@code descriptorSetLayout} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code descriptorSetLayout} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code descriptorSetLayout} is not #NULL_HANDLE, {@code descriptorSetLayout} <b>must</b> be a valid {@code VkDescriptorSetLayout} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code descriptorSetLayout} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code descriptorSetLayout} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice.IN("device", "the logical device that destroys the descriptor set layout."),
        VkDescriptorSetLayout.IN("descriptorSetLayout", "the descriptor set layout to destroy."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    VkResult(
        "CreateDescriptorPool",
        """
        Creates a descriptor pool object.

        <h5>C Specification</h5>
        To create a descriptor pool object, call:

        <code><pre>
￿VkResult vkCreateDescriptorPool(
￿    VkDevice                                    device,
￿    const VkDescriptorPoolCreateInfo*           pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkDescriptorPool*                           pDescriptorPool);</pre></code>

        <h5>Description</h5>
        {@code pAllocator} controls host memory allocation as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#memory-allocation">Memory Allocation</a> chapter.

        The created descriptor pool is returned in {@code pDescriptorPool}.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid ##VkDescriptorPoolCreateInfo structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pDescriptorPool} <b>must</b> be a pointer to a {@code VkDescriptorPool} handle</li>
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
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkDescriptorPoolCreateInfo
        """,

        VkDevice.IN("device", "the logical device that creates the descriptor pool."),
        const..VkDescriptorPoolCreateInfo.p.IN("pCreateInfo", "a pointer to an instance of the ##VkDescriptorPoolCreateInfo structure specifying the state of the descriptor pool object."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkDescriptorPool.p.OUT("pDescriptorPool", "points to a {@code VkDescriptorPool} handle in which the resulting descriptor pool object is returned.")
    )

    void(
        "DestroyDescriptorPool",
        """
        Destroy a descriptor pool object.

        <h5>C Specification</h5>
        To destroy a descriptor pool, call:

        <code><pre>
￿void vkDestroyDescriptorPool(
￿    VkDevice                                    device,
￿    VkDescriptorPool                            descriptorPool,
￿    const VkAllocationCallbacks*                pAllocator);</pre></code>

        <h5>Description</h5>
        When a pool is destroyed, all descriptor sets allocated from the pool are implicitly freed and become invalid. Descriptor sets allocated from a given pool do not need to be freed before destroying that descriptor pool.

        <h5>Valid Usage</h5>
        <ul>
            <li>All submitted commands that refer to {@code descriptorPool} (via any allocated descriptor sets) <b>must</b> have completed execution</li>
            <li>If ##VkAllocationCallbacks were provided when {@code descriptorPool} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code descriptorPool} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code descriptorPool} is not #NULL_HANDLE, {@code descriptorPool} <b>must</b> be a valid {@code VkDescriptorPool} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code descriptorPool} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code descriptorPool} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice.IN("device", "the logical device that destroys the descriptor pool."),
        VkDescriptorPool.IN("descriptorPool", "the descriptor pool to destroy."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    VkResult(
        "ResetDescriptorPool",
        """
        Resets a descriptor pool object.

        <h5>C Specification</h5>
        To return all descriptor sets allocated from a given pool to the pool, rather than freeing individual descriptor sets, call:

        <code><pre>
￿VkResult vkResetDescriptorPool(
￿    VkDevice                                    device,
￿    VkDescriptorPool                            descriptorPool,
￿    VkDescriptorPoolResetFlags                  flags);</pre></code>

        <h5>Description</h5>
        Resetting a descriptor pool recycles all of the resources from all of the descriptor sets allocated from the descriptor pool back to the descriptor pool, and the descriptor sets are implicitly freed.

        <h5>Valid Usage</h5>
        <ul>
            <li>All uses of {@code descriptorPool} (via any allocated descriptor sets) <b>must</b> have completed execution</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code descriptorPool} <b>must</b> be a valid {@code VkDescriptorPool} handle</li>
            <li>{@code flags} <b>must</b> be 0</li>
            <li>{@code descriptorPool} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code descriptorPool} <b>must</b> be externally synchronized</li>
            <li>Host access to any {@code VkDescriptorSet} objects allocated from {@code descriptorPool} <b>must</b> be externally synchronized</li>
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
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>
        """,

        VkDevice.IN("device", "the logical device that owns the descriptor pool."),
        VkDescriptorPool.IN("descriptorPool", "the descriptor pool to be reset."),
        VkDescriptorPoolResetFlags.IN("flags", "reserved for future use.")
    )

    VkResult(
        "AllocateDescriptorSets",
        """
        Allocate one or more descriptor sets.

        <h5>C Specification</h5>
        To allocate descriptor sets from a descriptor pool, call:

        <code><pre>
￿VkResult vkAllocateDescriptorSets(
￿    VkDevice                                    device,
￿    const VkDescriptorSetAllocateInfo*          pAllocateInfo,
￿    VkDescriptorSet*                            pDescriptorSets);</pre></code>

        <h5>Description</h5>
        The allocated descriptor sets are returned in {@code pDescriptorSets}.

        When a descriptor set is allocated, the initial state is largely uninitialized and all descriptors are undefined. However, the descriptor set <b>can</b> be bound in a command buffer without causing errors or exceptions. All entries that are statically used by a pipeline in a drawing or dispatching command <b>must</b> have been populated before the descriptor set is bound for use by that command. Entries that are not statically used by a pipeline <b>can</b> have uninitialized descriptors or descriptors of resources that have been destroyed, and executing a draw or dispatch with such a descriptor set bound does not cause undefined behavior. This means applications need not populate unused entries with dummy descriptors.

        If an allocation fails due to fragmentation, an indeterminate error is returned with an unspecified error code. Any returned error other than #ERROR_OUT_OF_POOL_MEMORY_KHR or #ERROR_FRAGMENTED_POOL does not imply its usual meaning: applications <b>should</b> assume that the allocation failed due to fragmentation, and create a new descriptor pool.

        #AllocateDescriptorSets() <b>can</b> be used to create multiple descriptor sets. If the creation of any of those descriptor sets fails, then the implementation <b>must</b> destroy all successfully created descriptor set objects from this command, set all entries of the {@code pDescriptorSets} array to #NULL_HANDLE and return the error.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Applications <b>should</b> check for a negative return value when allocating new descriptor sets, assume that any error other than #ERROR_OUT_OF_POOL_MEMORY_KHR effectively means #ERROR_FRAGMENTED_POOL, and try to create a new descriptor pool. If #ERROR_FRAGMENTED_POOL is the actual return value, it adds certainty to that decision.

        The reason for this is that #ERROR_FRAGMENTED_POOL was only added in a later revision of the 1.0 specification, and so drivers <b>may</b> return other errors if they were written against earlier revisions. To ensure full compatibility with earlier patch revisions, these other errors are allowed.
        </div>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pAllocateInfo} <b>must</b> be a pointer to a valid ##VkDescriptorSetAllocateInfo structure</li>
            <li>{@code pDescriptorSets} <b>must</b> be a pointer to an array of {@code pAllocateInfo}::descriptorSetCount {@code VkDescriptorSet} handles</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code pAllocateInfo}::descriptorPool <b>must</b> be externally synchronized</li>
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
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_FRAGMENTED_POOL</li>
                <li>#ERROR_OUT_OF_POOL_MEMORY_KHR</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkDescriptorSetAllocateInfo
        """,

        VkDevice.IN("device", "the logical device that owns the descriptor pool."),
        const..VkDescriptorSetAllocateInfo.p.IN("pAllocateInfo", "a pointer to an instance of the ##VkDescriptorSetAllocateInfo structure describing parameters of the allocation."),
        Check("pAllocateInfo.descriptorSetCount()")..VkDescriptorSet.p.OUT("pDescriptorSets", "a pointer to an array of {@code VkDescriptorSet} handles in which the resulting descriptor set objects are returned. The array <b>must</b> be at least the length specified by the {@code descriptorSetCount} member of {@code pAllocateInfo}.")
    )

    VkResult(
        "FreeDescriptorSets",
        """
        Free one or more descriptor sets.

        <h5>C Specification</h5>
        To free allocated descriptor sets, call:

        <code><pre>
￿VkResult vkFreeDescriptorSets(
￿    VkDevice                                    device,
￿    VkDescriptorPool                            descriptorPool,
￿    uint32_t                                    descriptorSetCount,
￿    const VkDescriptorSet*                      pDescriptorSets);</pre></code>

        <h5>Description</h5>
        After a successful call to #FreeDescriptorSets(), all descriptor sets in {@code pDescriptorSets} are invalid.

        <h5>Valid Usage</h5>
        <ul>
            <li>All submitted commands that refer to any element of {@code pDescriptorSets} <b>must</b> have completed execution</li>
            <li>{@code pDescriptorSets} <b>must</b> be a pointer to an array of {@code descriptorSetCount} {@code VkDescriptorSet} handles, each element of which <b>must</b> either be a valid handle or #NULL_HANDLE</li>
            <li>Each valid handle in {@code pDescriptorSets} <b>must</b> have been allocated from {@code descriptorPool}</li>
            <li>{@code descriptorPool} <b>must</b> have been created with the #DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT flag</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code descriptorPool} <b>must</b> be a valid {@code VkDescriptorPool} handle</li>
            <li>{@code descriptorSetCount} <b>must</b> be greater than 0</li>
            <li>{@code descriptorPool} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
            <li>Each element of {@code pDescriptorSets} that is a valid handle <b>must</b> have been created, allocated, or retrieved from {@code descriptorPool}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code descriptorPool} <b>must</b> be externally synchronized</li>
            <li>Host access to each member of {@code pDescriptorSets} <b>must</b> be externally synchronized</li>
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
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>
        """,

        VkDevice.IN("device", "the logical device that owns the descriptor pool."),
        VkDescriptorPool.IN("descriptorPool", "the descriptor pool from which the descriptor sets were allocated."),
        AutoSize("pDescriptorSets")..uint32_t.IN("descriptorSetCount", "the number of elements in the {@code pDescriptorSets} array."),
        const..VkDescriptorSet.p.IN("pDescriptorSets", "an array of handles to {@code VkDescriptorSet} objects.")
    )

    void(
        "UpdateDescriptorSets",
        """
        Update the contents of a descriptor set object.

        <h5>C Specification</h5>
        Once allocated, descriptor sets <b>can</b> be updated with a combination of write and copy operations. To update descriptor sets, call:

        <code><pre>
￿void vkUpdateDescriptorSets(
￿    VkDevice                                    device,
￿    uint32_t                                    descriptorWriteCount,
￿    const VkWriteDescriptorSet*                 pDescriptorWrites,
￿    uint32_t                                    descriptorCopyCount,
￿    const VkCopyDescriptorSet*                  pDescriptorCopies);</pre></code>

        <h5>Description</h5>
        The operations described by {@code pDescriptorWrites} are performed first, followed by the operations described by {@code pDescriptorCopies}. Within each array, the operations are performed in the order they appear in the array.

        Each element in the {@code pDescriptorWrites} array describes an operation updating the descriptor set using descriptors for resources specified in the structure.

        Each element in the {@code pDescriptorCopies} array is a ##VkCopyDescriptorSet structure describing an operation copying descriptors between sets.

        If the {@code dstSet} member of any given element of {@code pDescriptorWrites} or {@code pDescriptorCopies} is bound, accessed, or modified by any command that was recorded to a command buffer which is currently in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording or executable state</a>, that command buffer becomes <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">invalid</a>.

        <h5>Valid Usage</h5>
        <ul>
            <li>The {@code dstSet} member of any given element of {@code pDescriptorWrites} or {@code pDescriptorCopies} <b>must</b> not be used by any command that was recorded to a command buffer which is in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">pending state</a>.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code descriptorWriteCount} is not 0, {@code pDescriptorWrites} <b>must</b> be a pointer to an array of {@code descriptorWriteCount} valid ##VkWriteDescriptorSet structures</li>
            <li>If {@code descriptorCopyCount} is not 0, {@code pDescriptorCopies} <b>must</b> be a pointer to an array of {@code descriptorCopyCount} valid ##VkCopyDescriptorSet structures</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code pDescriptorWrites}[].dstSet <b>must</b> be externally synchronized</li>
            <li>Host access to {@code pDescriptorCopies}[].dstSet <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkCopyDescriptorSet, ##VkWriteDescriptorSet
        """,

        VkDevice.IN("device", "the logical device that updates the descriptor sets."),
        AutoSize("pDescriptorWrites")..uint32_t.IN("descriptorWriteCount", "the number of elements in the {@code pDescriptorWrites} array."),
        nullable..const..VkWriteDescriptorSet.p.IN("pDescriptorWrites", "a pointer to an array of ##VkWriteDescriptorSet structures describing the descriptor sets to write to."),
        AutoSize("pDescriptorCopies")..uint32_t.IN("descriptorCopyCount", "the number of elements in the {@code pDescriptorCopies} array."),
        nullable..const..VkCopyDescriptorSet.p.IN("pDescriptorCopies", "a pointer to an array of ##VkCopyDescriptorSet structures describing the descriptor sets to copy between.")
    )

    // Pass commands

    VkResult(
        "CreateFramebuffer",
        """
        Create a new framebuffer object.

        <h5>C Specification</h5>
        To create a framebuffer, call:

        <code><pre>
￿VkResult vkCreateFramebuffer(
￿    VkDevice                                    device,
￿    const VkFramebufferCreateInfo*              pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkFramebuffer*                              pFramebuffer);</pre></code>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid ##VkFramebufferCreateInfo structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pFramebuffer} <b>must</b> be a pointer to a {@code VkFramebuffer} handle</li>
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
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkFramebufferCreateInfo
        """,

        VkDevice.IN("device", "the logical device that creates the framebuffer."),
        const..VkFramebufferCreateInfo.p.IN("pCreateInfo", "points to a ##VkFramebufferCreateInfo structure which describes additional information about framebuffer creation."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkFramebuffer.p.OUT("pFramebuffer", "points to a {@code VkFramebuffer} handle in which the resulting framebuffer object is returned.")
    )

    void(
        "DestroyFramebuffer",
        """
        Destroy a framebuffer object.

        <h5>C Specification</h5>
        To destroy a framebuffer, call:

        <code><pre>
￿void vkDestroyFramebuffer(
￿    VkDevice                                    device,
￿    VkFramebuffer                               framebuffer,
￿    const VkAllocationCallbacks*                pAllocator);</pre></code>

        <h5>Valid Usage</h5>
        <ul>
            <li>All submitted commands that refer to {@code framebuffer} <b>must</b> have completed execution</li>
            <li>If ##VkAllocationCallbacks were provided when {@code framebuffer} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code framebuffer} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code framebuffer} is not #NULL_HANDLE, {@code framebuffer} <b>must</b> be a valid {@code VkFramebuffer} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code framebuffer} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code framebuffer} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice.IN("device", "the logical device that destroys the framebuffer."),
        VkFramebuffer.IN("framebuffer", "the handle of the framebuffer to destroy."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    VkResult(
        "CreateRenderPass",
        """
        Create a new render pass object.

        <h5>C Specification</h5>
        To create a render pass, call:

        <code><pre>
￿VkResult vkCreateRenderPass(
￿    VkDevice                                    device,
￿    const VkRenderPassCreateInfo*               pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkRenderPass*                               pRenderPass);</pre></code>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid ##VkRenderPassCreateInfo structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pRenderPass} <b>must</b> be a pointer to a {@code VkRenderPass} handle</li>
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
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkRenderPassCreateInfo
        """,

        VkDevice.IN("device", "the logical device that creates the render pass."),
        const..VkRenderPassCreateInfo.p.IN("pCreateInfo", "a pointer to an instance of the ##VkRenderPassCreateInfo structure that describes the parameters of the render pass."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkRenderPass.p.OUT("pRenderPass", "points to a {@code VkRenderPass} handle in which the resulting render pass object is returned.")
    )

    void(
        "DestroyRenderPass",
        """
        Destroy a render pass object.

        <h5>C Specification</h5>
        To destroy a render pass, call:

        <code><pre>
￿void vkDestroyRenderPass(
￿    VkDevice                                    device,
￿    VkRenderPass                                renderPass,
￿    const VkAllocationCallbacks*                pAllocator);</pre></code>

        <h5>Valid Usage</h5>
        <ul>
            <li>All submitted commands that refer to {@code renderPass} <b>must</b> have completed execution</li>
            <li>If ##VkAllocationCallbacks were provided when {@code renderPass} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code renderPass} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code renderPass} is not #NULL_HANDLE, {@code renderPass} <b>must</b> be a valid {@code VkRenderPass} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code renderPass} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code renderPass} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice.IN("device", "the logical device that destroys the render pass."),
        VkRenderPass.IN("renderPass", "the handle of the render pass to destroy."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    void(
        "GetRenderAreaGranularity",
        """
        Returns the granularity for optimal render area.

        <h5>C Specification</h5>
        To query the render area granularity, call:

        <code><pre>
￿void vkGetRenderAreaGranularity(
￿    VkDevice                                    device,
￿    VkRenderPass                                renderPass,
￿    VkExtent2D*                                 pGranularity);</pre></code>

        <h5>Description</h5>
        The conditions leading to an optimal {@code renderArea} are:

        <ul>
            <li>the {@code offset.x} member in {@code renderArea} is a multiple of the {@code width} member of the returned ##VkExtent2D (the horizontal granularity).</li>
            <li>the {@code offset.y} member in {@code renderArea} is a multiple of the {@code height} of the returned ##VkExtent2D (the vertical granularity).</li>
            <li>either the {@code offset.width} member in {@code renderArea} is a multiple of the horizontal granularity or {@code offset.x}+{@code offset.width} is equal to the {@code width} of the {@code framebuffer} in the ##VkRenderPassBeginInfo.</li>
            <li>either the {@code offset.height} member in {@code renderArea} is a multiple of the vertical granularity or {@code offset.y}+{@code offset.height} is equal to the {@code height} of the {@code framebuffer} in the ##VkRenderPassBeginInfo.</li>
        </ul>

        Subpass dependencies are not affected by the render area, and apply to the entire image subresources attached to the framebuffer. Similarly, pipeline barriers are valid even if their effect extends outside the render area.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code renderPass} <b>must</b> be a valid {@code VkRenderPass} handle</li>
            <li>{@code pGranularity} <b>must</b> be a pointer to a ##VkExtent2D structure</li>
            <li>{@code renderPass} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>See Also</h5>
        ##VkExtent2D
        """,

        VkDevice.IN("device", "the logical device that owns the render pass."),
        VkRenderPass.IN("renderPass", "a handle to a render pass."),
        VkExtent2D.p.OUT("pGranularity", "points to a ##VkExtent2D structure in which the granularity is returned.")
    )

    // Command pool commands

    VkResult(
        "CreateCommandPool",
        """
        Create a new command pool object.

        <h5>C Specification</h5>
        To create a command pool, call:

        <code><pre>
￿VkResult vkCreateCommandPool(
￿    VkDevice                                    device,
￿    const VkCommandPoolCreateInfo*              pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkCommandPool*                              pCommandPool);</pre></code>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid ##VkCommandPoolCreateInfo structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pCommandPool} <b>must</b> be a pointer to a {@code VkCommandPool} handle</li>
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
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkCommandPoolCreateInfo
        """,

        VkDevice.IN("device", "the logical device that creates the command pool."),
        const..VkCommandPoolCreateInfo.p.IN("pCreateInfo", "contains information used to create the command pool."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkCommandPool.p.OUT("pCommandPool", "points to a {@code VkCommandPool} handle in which the created pool is returned.")
    )

    void(
        "DestroyCommandPool",
        """
        Destroy a command pool object.

        <h5>C Specification</h5>
        To destroy a command pool, call:

        <code><pre>
￿void vkDestroyCommandPool(
￿    VkDevice                                    device,
￿    VkCommandPool                               commandPool,
￿    const VkAllocationCallbacks*                pAllocator);</pre></code>

        <h5>Description</h5>
        When a pool is destroyed, all command buffers allocated from the pool are <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkFreeCommandBuffers">freed</a>.

        Any primary command buffer allocated from another {@code VkCommandPool} that is in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording or executable state</a> and has a secondary command buffer allocated from {@code commandPool} recorded into it, becomes <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">invalid</a>.

        <h5>Valid Usage</h5>
        <ul>
            <li>All {@code VkCommandBuffer} objects allocated from {@code commandPool} <b>must</b> not be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">pending state</a>.</li>
            <li>If ##VkAllocationCallbacks were provided when {@code commandPool} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code commandPool} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code commandPool} is not #NULL_HANDLE, {@code commandPool} <b>must</b> be a valid {@code VkCommandPool} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code commandPool} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandPool} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice.IN("device", "the logical device that destroys the command pool."),
        VkCommandPool.IN("commandPool", "the handle of the command pool to destroy."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    VkResult(
        "ResetCommandPool",
        """
        Reset a command pool.

        <h5>C Specification</h5>
        To reset a command pool, call:

        <code><pre>
￿VkResult vkResetCommandPool(
￿    VkDevice                                    device,
￿    VkCommandPool                               commandPool,
￿    VkCommandPoolResetFlags                     flags);</pre></code>

        <h5>Description</h5>
        Resetting a command pool recycles all of the resources from all of the command buffers allocated from the command pool back to the command pool. All command buffers that have been allocated from the command pool are put in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">initial state</a>.

        Any primary command buffer allocated from another {@code VkCommandPool} that is in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording or executable state</a> and has a secondary command buffer allocated from {@code commandPool} recorded into it, becomes <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">invalid</a>.

        <h5>Valid Usage</h5>
        <ul>
            <li>All {@code VkCommandBuffer} objects allocated from {@code commandPool} <b>must</b> not be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">pending state</a></li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code commandPool} <b>must</b> be a valid {@code VkCommandPool} handle</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkCommandPoolResetFlagBits} values</li>
            <li>{@code commandPool} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandPool} <b>must</b> be externally synchronized</li>
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
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>
        """,

        VkDevice.IN("device", "the logical device that owns the command pool."),
        VkCommandPool.IN("commandPool", "the command pool to reset."),
        VkCommandPoolResetFlags.IN("flags", "a bitmask of {@code VkCommandPoolResetFlagBits} controlling the reset operation.")
    )

    // Command buffer commands

    VkResult(
        "AllocateCommandBuffers",
        """
        Allocate command buffers from an existing command pool.

        <h5>C Specification</h5>
        To allocate command buffers, call:

        <code><pre>
￿VkResult vkAllocateCommandBuffers(
￿    VkDevice                                    device,
￿    const VkCommandBufferAllocateInfo*          pAllocateInfo,
￿    VkCommandBuffer*                            pCommandBuffers);</pre></code>

        <h5>Description</h5>
        #AllocateCommandBuffers() <b>can</b> be used to create multiple command buffers. If the creation of any of those command buffers fails, the implementation <b>must</b> destroy all successfully created command buffer objects from this command, set all entries of the {@code pCommandBuffers} array to {@code NULL} and return the error.

        When command buffers are first allocated, they are in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">initial state</a>.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pAllocateInfo} <b>must</b> be a pointer to a valid ##VkCommandBufferAllocateInfo structure</li>
            <li>{@code pCommandBuffers} <b>must</b> be a pointer to an array of {@code pAllocateInfo}::commandBufferCount {@code VkCommandBuffer} handles</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code pAllocateInfo}::commandPool <b>must</b> be externally synchronized</li>
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
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkCommandBufferAllocateInfo
        """,

        VkDevice.IN("device", "the logical device that owns the command pool."),
        const..VkCommandBufferAllocateInfo.p.IN("pAllocateInfo", "a pointer to an instance of the ##VkCommandBufferAllocateInfo structure describing parameters of the allocation."),
        Check("pAllocateInfo.commandBufferCount()")..VkCommandBuffer.p.OUT("pCommandBuffers", "a pointer to an array of {@code VkCommandBuffer} handles in which the resulting command buffer objects are returned. The array <b>must</b> be at least the length specified by the {@code commandBufferCount} member of {@code pAllocateInfo}. Each allocated command buffer begins in the initial state.")
    )

    void(
        "FreeCommandBuffers",
        """
        Free command buffers.

        <h5>C Specification</h5>
        To free command buffers, call:

        <code><pre>
￿void vkFreeCommandBuffers(
￿    VkDevice                                    device,
￿    VkCommandPool                               commandPool,
￿    uint32_t                                    commandBufferCount,
￿    const VkCommandBuffer*                      pCommandBuffers);</pre></code>

        <h5>Description</h5>
        Any primary command buffer that is in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording or executable state</a> and has any element of {@code pCommandBuffers} recorded into it, becomes <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">invalid</a>.

        <h5>Valid Usage</h5>
        <ul>
            <li>All elements of {@code pCommandBuffers} <b>must</b> not be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">pending state</a></li>
            <li>{@code pCommandBuffers} <b>must</b> be a pointer to an array of {@code commandBufferCount} {@code VkCommandBuffer} handles, each element of which <b>must</b> either be a valid handle or {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code commandPool} <b>must</b> be a valid {@code VkCommandPool} handle</li>
            <li>{@code commandBufferCount} <b>must</b> be greater than 0</li>
            <li>{@code commandPool} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
            <li>Each element of {@code pCommandBuffers} that is a valid handle <b>must</b> have been created, allocated, or retrieved from {@code commandPool}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandPool} <b>must</b> be externally synchronized</li>
            <li>Host access to each member of {@code pCommandBuffers} <b>must</b> be externally synchronized</li>
        </ul>
        """,

        VkDevice.IN("device", "the logical device that owns the command pool."),
        VkCommandPool.IN("commandPool", "the command pool from which the command buffers were allocated."),
        AutoSize("pCommandBuffers")..uint32_t.IN("commandBufferCount", "the length of the {@code pCommandBuffers} array."),
        const..VkCommandBuffer.p.IN("pCommandBuffers", "an array of handles of command buffers to free.")
    )

    VkResult(
        "BeginCommandBuffer",
        """
        Start recording a command buffer.

        <h5>C Specification</h5>
        To begin recording a command buffer, call:

        <code><pre>
￿VkResult vkBeginCommandBuffer(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkCommandBufferBeginInfo*             pBeginInfo);</pre></code>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> not be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording or pending state</a>.</li>
            <li>If {@code commandBuffer} was allocated from a {@code VkCommandPool} which did not have the #COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT flag set, {@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">initial state</a>.</li>
            <li>If {@code commandBuffer} is a secondary command buffer, the {@code pInheritanceInfo} member of {@code pBeginInfo} <b>must</b> be a valid ##VkCommandBufferInheritanceInfo structure</li>
            <li>If {@code commandBuffer} is a secondary command buffer and either the {@code occlusionQueryEnable} member of the {@code pInheritanceInfo} member of {@code pBeginInfo} is #FALSE, or the precise occlusion queries feature is not enabled, the {@code queryFlags} member of the {@code pInheritanceInfo} member {@code pBeginInfo} <b>must</b> not contain #QUERY_CONTROL_PRECISE_BIT</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pBeginInfo} <b>must</b> be a pointer to a valid ##VkCommandBufferBeginInfo structure</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
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
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkCommandBufferBeginInfo
        """,

        VkCommandBuffer.IN("commandBuffer", "the handle of the command buffer which is to be put in the recording state."),
        const..VkCommandBufferBeginInfo.p.IN("pBeginInfo", "an instance of the ##VkCommandBufferBeginInfo structure, which defines additional information about how the command buffer begins recording.")
    )

    VkResult(
        "EndCommandBuffer",
        """
        Finish recording a command buffer.

        <h5>C Specification</h5>
        To complete recording of a command buffer, call:

        <code><pre>
￿VkResult vkEndCommandBuffer(
￿    VkCommandBuffer                             commandBuffer);</pre></code>

        <h5>Description</h5>
        If there was an error during recording, the application will be notified by an unsuccessful return code returned by #EndCommandBuffer(). If the application wishes to further use the command buffer, the command buffer <b>must</b> be reset. The command buffer <b>must</b> have been in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a>, and is moved to the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">executable state</a>.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a>.</li>
            <li>If {@code commandBuffer} is a primary command buffer, there <b>must</b> not be an active render pass instance</li>
            <li>All queries made <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#queries-operation-active">active</a> during the recording of {@code commandBuffer} <b>must</b> have been made inactive</li>
            <li>If {@code commandBuffer} is a secondary command buffer, there <b>must</b> not be an outstanding #CmdDebugMarkerBeginEXT() command recorded to {@code commandBuffer} that has not previously been ended by a call to #CmdDebugMarkerEndEXT().</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
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
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer to complete recording.")
    )

    VkResult(
        "ResetCommandBuffer",
        """
        Reset a command buffer to the initial state.

        <h5>C Specification</h5>
        To reset command buffers, call:

        <code><pre>
￿VkResult vkResetCommandBuffer(
￿    VkCommandBuffer                             commandBuffer,
￿    VkCommandBufferResetFlags                   flags);</pre></code>

        <h5>Description</h5>
        Any primary command buffer that is in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording or executable state</a> and has {@code commandBuffer} recorded into it, becomes <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">invalid</a>.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> not be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">pending state</a></li>
            <li>{@code commandBuffer} <b>must</b> have been allocated from a pool that was created with the #COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkCommandBufferResetFlagBits} values</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
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
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer to reset. The command buffer <b>can</b> be in any state other than <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#commandbuffers-lifecycle\">pending</a>, and is moved into the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#commandbuffers-lifecycle\">initial state</a>."),
        VkCommandBufferResetFlags.IN("flags", "a bitmask of {@code VkCommandBufferResetFlagBits} controlling the reset operation.")
    )

    // Command buffer building commands

    void(
        "CmdBindPipeline",
        """
        Bind a pipeline object to a command buffer.

        <h5>C Specification</h5>
        Once a pipeline has been created, it <b>can</b> be bound to the command buffer using the command:

        <code><pre>
￿void vkCmdBindPipeline(
￿    VkCommandBuffer                             commandBuffer,
￿    VkPipelineBindPoint                         pipelineBindPoint,
￿    VkPipeline                                  pipeline);</pre></code>

        <h5>Description</h5>
        Once bound, a pipeline binding affects subsequent graphics or compute commands in the command buffer until a different pipeline is bound to the bind point. The pipeline bound to #PIPELINE_BIND_POINT_COMPUTE controls the behavior of #CmdDispatch() and #CmdDispatchIndirect(). The pipeline bound to #PIPELINE_BIND_POINT_GRAPHICS controls the behavior of #CmdDraw(), #CmdDrawIndexed(), #CmdDrawIndirect(), and #CmdDrawIndexedIndirect(). No other commands are affected by the pipeline state.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code pipelineBindPoint} is #PIPELINE_BIND_POINT_COMPUTE, the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
            <li>If {@code pipelineBindPoint} is #PIPELINE_BIND_POINT_GRAPHICS, the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>If {@code pipelineBindPoint} is #PIPELINE_BIND_POINT_COMPUTE, {@code pipeline} <b>must</b> be a compute pipeline</li>
            <li>If {@code pipelineBindPoint} is #PIPELINE_BIND_POINT_GRAPHICS, {@code pipeline} <b>must</b> be a graphics pipeline</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-variableMultisampleRate">variable multisample rate</a> feature is not supported, {@code pipeline} is a graphics pipeline, the current subpass has no attachments, and this is not the first call to this function with a graphics pipeline after transitioning to the current subpass, then the sample count specified by this pipeline <b>must</b> match that set in the previous pipeline</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pipelineBindPoint} <b>must</b> be a valid {@code VkPipelineBindPoint} value</li>
            <li>{@code pipeline} <b>must</b> be a valid {@code VkPipeline} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
            <li>Both of {@code commandBuffer}, and {@code pipeline} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics compute</td><td></td></tr></tbody>
        </table>
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer that the pipeline will be bound to."),
        VkPipelineBindPoint.IN("pipelineBindPoint", "a {@code VkPipelineBindPoint} value specifying whether to bind to the compute or graphics bind point. Binding one does not disturb the other."),
        VkPipeline.IN("pipeline", "the pipeline to be bound.")
    )

    void(
        "CmdSetViewport",
        """
        Set the viewport on a command buffer.

        <h5>C Specification</h5>
        If the bound pipeline state object was not created with the #DYNAMIC_STATE_VIEWPORT dynamic state enabled, viewport transformation parameters are specified using the {@code pViewports} member of ##VkPipelineViewportStateCreateInfo in the pipeline state object. If the pipeline state object was created with the #DYNAMIC_STATE_VIEWPORT dynamic state enabled, the viewport transformation parameters are dynamically set and changed with the command:

        <code><pre>
￿void vkCmdSetViewport(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    firstViewport,
￿    uint32_t                                    viewportCount,
￿    const VkViewport*                           pViewports);</pre></code>

        <h5>Description</h5>
        The viewport parameters taken from element <code>i</code> of {@code pViewports} replace the current state for the viewport index <code>firstViewport {plus} i</code>, for <code>i</code> in <code>[0, viewportCount)</code>.

        <h5>Valid Usage</h5>
        <ul>
            <li>The currently bound graphics pipeline <b>must</b> have been created with the #DYNAMIC_STATE_VIEWPORT dynamic state enabled</li>
            <li>{@code firstViewport} <b>must</b> be less than ##VkPhysicalDeviceLimits{@code ::maxViewports}</li>
            <li>The sum of {@code firstViewport} and {@code viewportCount} <b>must</b> be between 1 and ##VkPhysicalDeviceLimits{@code ::maxViewports}, inclusive</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-multiViewport">multiple viewports</a> feature is not enabled, {@code firstViewport} <b>must</b> be 0</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-multiViewport">multiple viewports</a> feature is not enabled, {@code viewportCount} <b>must</b> be 1</li>
            <li>{@code pViewports} <b>must</b> be a pointer to an array of {@code viewportCount} valid ##VkViewport structures</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>{@code viewportCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td><td></td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkViewport
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command will be recorded."),
        uint32_t.IN("firstViewport", "the index of the first viewport whose parameters are updated by the command."),
        AutoSize("pViewports")..uint32_t.IN("viewportCount", "the number of viewports whose parameters are updated by the command."),
        const..VkViewport.p.IN("pViewports", "a pointer to an array of ##VkViewport structures specifying viewport parameters.")
    )

    void(
        "CmdSetScissor",
        """
        Set the dynamic scissor rectangles on a command buffer.

        <h5>C Specification</h5>
        The scissor test determines if a fragment's framebuffer coordinates <code>(x<sub>f</sub>,y<sub>f</sub>)</code> lie within the scissor rectangle corresponding to the viewport index (see <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vertexpostproc-viewport">Controlling the Viewport</a>) used by the primitive that generated the fragment. If the pipeline state object is created without #DYNAMIC_STATE_SCISSOR enabled then the scissor rectangles are set by the ##VkPipelineViewportStateCreateInfo state of the pipeline state object. Otherwise, to dynamically set the scissor rectangles call:

        <code><pre>
￿void vkCmdSetScissor(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    firstScissor,
￿    uint32_t                                    scissorCount,
￿    const VkRect2D*                             pScissors);</pre></code>

        <h5>Description</h5>
        The scissor rectangles taken from element <code>i</code> of {@code pScissors} replace the current state for the scissor index <code>firstScissor {plus} i</code>, for <code>i</code> in <code>[0, scissorCount)</code>.

        Each scissor rectangle is described by a ##VkRect2D structure, with the {@code offset.x} and {@code offset.y} values determining the upper left corner of the scissor rectangle, and the {@code extent.width} and {@code extent.height} values determining the size in pixels.

        <h5>Valid Usage</h5>
        <ul>
            <li>The currently bound graphics pipeline <b>must</b> have been created with the #DYNAMIC_STATE_SCISSOR dynamic state enabled</li>
            <li>{@code firstScissor} <b>must</b> be less than ##VkPhysicalDeviceLimits{@code ::maxViewports}</li>
            <li>The sum of {@code firstScissor} and {@code scissorCount} <b>must</b> be between 1 and ##VkPhysicalDeviceLimits{@code ::maxViewports}, inclusive</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-multiViewport">multiple viewports</a> feature is not enabled, {@code firstScissor} <b>must</b> be 0</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-multiViewport">multiple viewports</a> feature is not enabled, {@code scissorCount} <b>must</b> be 1</li>
            <li>The {@code x} and {@code y} members of {@code offset} <b>must</b> be greater than or equal to 0</li>
            <li>Evaluation of <code>(offset.x + extent.width)</code> <b>must</b> not cause a signed integer addition overflow</li>
            <li>Evaluation of <code>(offset.y + extent.height)</code> <b>must</b> not cause a signed integer addition overflow</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pScissors} <b>must</b> be a pointer to an array of {@code scissorCount} ##VkRect2D structures</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>{@code scissorCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td><td></td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkRect2D
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command will be recorded."),
        uint32_t.IN("firstScissor", "the index of the first scissor whose state is updated by the command."),
        AutoSize("pScissors")..uint32_t.IN("scissorCount", "the number of scissors whose rectangles are updated by the command."),
        const..VkRect2D.p.IN("pScissors", "a pointer to an array of ##VkRect2D structures defining scissor rectangles.")
    )

    void(
        "CmdSetLineWidth",
        """
        Set the dynamic line width state.

        <h5>C Specification</h5>
        The line width is specified by the ##VkPipelineRasterizationStateCreateInfo{@code ::lineWidth} property of the currently active pipeline, if the pipeline was not created with #DYNAMIC_STATE_LINE_WIDTH enabled.

        Otherwise, the line width is set by calling #CmdSetLineWidth():

        <code><pre>
￿void vkCmdSetLineWidth(
￿    VkCommandBuffer                             commandBuffer,
￿    float                                       lineWidth);</pre></code>

        <h5>Valid Usage</h5>
        <ul>
            <li>The currently bound graphics pipeline <b>must</b> have been created with the #DYNAMIC_STATE_LINE_WIDTH dynamic state enabled</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-wideLines">wide lines</a> feature is not enabled, {@code lineWidth} <b>must</b> be {@code 1.0}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td><td></td></tr></tbody>
        </table>
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command will be recorded."),
        float.IN("lineWidth", "the width of rasterized line segments.")
    )

    void(
        "CmdSetDepthBias",
        """
        Set the depth bias dynamic state.

        <h5>C Specification</h5>
        The depth values of all fragments generated by the rasterization of a polygon <b>can</b> be offset by a single value that is computed for that polygon. This behavior is controlled by the {@code depthBiasEnable}, {@code depthBiasConstantFactor}, {@code depthBiasClamp}, and {@code depthBiasSlopeFactor} members of ##VkPipelineRasterizationStateCreateInfo, or by the corresponding parameters to the #CmdSetDepthBias() command if depth bias state is dynamic.

        <code><pre>
￿void vkCmdSetDepthBias(
￿    VkCommandBuffer                             commandBuffer,
￿    float                                       depthBiasConstantFactor,
￿    float                                       depthBiasClamp,
￿    float                                       depthBiasSlopeFactor);</pre></code>

        <h5>Description</h5>
        If {@code depthBiasEnable} is #FALSE, no depth bias is applied and the fragment's depth values are unchanged.

        {@code depthBiasSlopeFactor} scales the maximum depth slope of the polygon, and {@code depthBiasConstantFactor} scales an implementation-dependent constant that relates to the usable resolution of the depth buffer. The resulting values are summed to produce the depth bias value which is then clamped to a minimum or maximum value specified by {@code depthBiasClamp}. {@code depthBiasSlopeFactor}, {@code depthBiasConstantFactor}, and {@code depthBiasClamp} <b>can</b> each be positive, negative, or zero.

        The maximum depth slope <code>m</code> of a triangle is

        <code><pre>
￿      m = sqrt((&part;z<sub>f</sub> / &part;x<sub>f</sub>)<sup>2</sup> + (&part;z<sub>f</sub> / &part;y<sub>f</sub>)<sup>2</sup>)</pre></code>

        where <code>(x<sub>f</sub>, y<sub>f</sub>, z<sub>f</sub>)</code> is a point on the triangle. <code>m</code> <b>may</b> be approximated as

        <code><pre>
￿      m = max(abs(&part;z<sub>f</sub> / &part;x<sub>f</sub>), abs(&part;z<sub>f</sub> / &part;y<sub>f</sub>))</pre></code>

        The minimum resolvable difference <code>r</code> is an implementation-dependent parameter that depends on the depth buffer representation. It is the smallest difference in framebuffer coordinate <code>z</code> values that is guaranteed to remain distinct throughout polygon rasterization and in the depth buffer. All pairs of fragments generated by the rasterization of two polygons with otherwise identical vertices, but <code>z<sub>f</sub></code> values that differ by <code>r</code>, will have distinct depth values.

        For fixed-point depth buffer representations, <code>r</code> is constant throughout the range of the entire depth buffer. For floating-point depth buffers, there is no single minimum resolvable difference. In this case, the minimum resolvable difference for a given polygon is dependent on the maximum exponent, <code>e</code>, in the range of <code>z</code> values spanned by the primitive. If <code>n</code> is the number of bits in the floating-point mantissa, the minimum resolvable difference, <code>r</code>, for the given primitive is defined as

        <dl>
            <dd><code>r = 2<sup>e-n</sup></code></dd>
        </dl>

        If no depth buffer is present, <code>r</code> is undefined.

        The bias value <code>o</code> for a polygon is

        <code><pre>
￿        m &times; depthBiasSlopeFactor + r &times; depthBiasConstantFactor                     depthBiasClamp = 0 or NaN
￿o = min(m &times; depthBiasSlopeFactor + r &times; depthBiasConstantFactor, depthBiasClamp)    depthBiasClamp &gt; 0
￿    max(m &times; depthBiasSlopeFactor + r &times; depthBiasConstantFactor, depthBiasClamp)    depthBiasClamp &lt; 0</pre></code>

        <code>m</code> is computed as described above. If the depth buffer uses a fixed-point representation, <code>m</code> is a function of depth values in the range <code>[0,1]</code>, and <code>o</code> is applied to depth values in the same range.

        For fixed-point depth buffers, fragment depth values are always limited to the range <code>[0,1]</code> by clamping after depth bias addition is performed. Fragment depth values are clamped even when the depth buffer uses a floating-point representation.

        <h5>Valid Usage</h5>
        <ul>
            <li>The currently bound graphics pipeline <b>must</b> have been created with the #DYNAMIC_STATE_DEPTH_BIAS dynamic state enabled</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-depthBiasClamp">depth bias clamping</a> feature is not enabled, {@code depthBiasClamp} <b>must</b> be {@code 0.0}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td><td></td></tr></tbody>
        </table>
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command will be recorded."),
        float.IN("depthBiasConstantFactor", "a scalar factor controlling the constant depth value added to each fragment."),
        float.IN("depthBiasClamp", "the maximum (or minimum) depth bias of a fragment."),
        float.IN("depthBiasSlopeFactor", "a scalar factor applied to a fragment&#8217;s slope in depth bias calculations.")
    )

    void(
        "CmdSetBlendConstants",
        """
        Set the values of blend constants.

        <h5>C Specification</h5>
        Otherwise, to dynamically set and change the blend constant, call:

        <code><pre>
￿void vkCmdSetBlendConstants(
￿    VkCommandBuffer                             commandBuffer,
￿    const float                                 blendConstants[4]);</pre></code>

        <h5>Valid Usage</h5>
        <ul>
            <li>The currently bound graphics pipeline <b>must</b> have been created with the #DYNAMIC_STATE_BLEND_CONSTANTS dynamic state enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td><td></td></tr></tbody>
        </table>
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command will be recorded."),
        Check(4)..const..float_p.IN("blendConstants", "an array of four values specifying the R, G, B, and A components of the blend constant color used in blending, depending on the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#framebuffer-blendfactors\">blend factor</a>.")
    )

    void(
        "CmdSetDepthBounds",
        """
        Set the depth bounds test values for a command buffer.

        <h5>C Specification</h5>
        The depth bounds test conditionally disables coverage of a sample based on the outcome of a comparison between the value <code>z<sub>a</sub></code> in the depth attachment at location <code>(x<sub>f</sub>,y<sub>f</sub>)</code> (for the appropriate sample) and a range of values. The test is enabled or disabled by the {@code depthBoundsTestEnable} member of ##VkPipelineDepthStencilStateCreateInfo: If the pipeline state object is created without the #DYNAMIC_STATE_DEPTH_BOUNDS dynamic state enabled then the range of values used in the depth bounds test are defined by the {@code minDepthBounds} and {@code maxDepthBounds} members of the ##VkPipelineDepthStencilStateCreateInfo structure. Otherwise, to dynamically set the depth bounds range values call:

        <code><pre>
￿void vkCmdSetDepthBounds(
￿    VkCommandBuffer                             commandBuffer,
￿    float                                       minDepthBounds,
￿    float                                       maxDepthBounds);</pre></code>

        <h5>Valid Usage</h5>
        <ul>
            <li>The currently bound graphics pipeline <b>must</b> have been created with the #DYNAMIC_STATE_DEPTH_BOUNDS dynamic state enabled</li>
            <li>{@code minDepthBounds} <b>must</b> be between {@code 0.0} and {@code 1.0}, inclusive</li>
            <li>{@code maxDepthBounds} <b>must</b> be between {@code 0.0} and {@code 1.0}, inclusive</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td><td></td></tr></tbody>
        </table>
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command will be recorded."),
        float.IN("minDepthBounds", "the lower bound of the range of depth values used in the depth bounds test."),
        float.IN("maxDepthBounds", "the upper bound of the range.")
    )

    void(
        "CmdSetStencilCompareMask",
        """
        Set the stencil compare mask dynamic state.

        <h5>C Specification</h5>
        If the pipeline state object is created with the #DYNAMIC_STATE_STENCIL_COMPARE_MASK dynamic state enabled, then to dynamically set the stencil compare mask call:

        <code><pre>
￿void vkCmdSetStencilCompareMask(
￿    VkCommandBuffer                             commandBuffer,
￿    VkStencilFaceFlags                          faceMask,
￿    uint32_t                                    compareMask);</pre></code>

        <h5>Valid Usage</h5>
        <ul>
            <li>The currently bound graphics pipeline <b>must</b> have been created with the #DYNAMIC_STATE_STENCIL_COMPARE_MASK dynamic state enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code faceMask} <b>must</b> be a valid combination of {@code VkStencilFaceFlagBits} values</li>
            <li>{@code faceMask} <b>must</b> not be 0</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td><td></td></tr></tbody>
        </table>
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command will be recorded."),
        VkStencilFaceFlags.IN("faceMask", "a bitmask of {@code VkStencilFaceFlagBits} specifying the set of stencil state for which to update the compare mask."),
        uint32_t.IN("compareMask", "the new value to use as the stencil compare mask.")
    )

    void(
        "CmdSetStencilWriteMask",
        """
        Set the stencil write mask dynamic state.

        <h5>C Specification</h5>
        If the pipeline state object is created with the #DYNAMIC_STATE_STENCIL_WRITE_MASK dynamic state enabled, then to dynamically set the stencil write mask call:

        <code><pre>
￿void vkCmdSetStencilWriteMask(
￿    VkCommandBuffer                             commandBuffer,
￿    VkStencilFaceFlags                          faceMask,
￿    uint32_t                                    writeMask);</pre></code>

        <h5>Valid Usage</h5>
        <ul>
            <li>The currently bound graphics pipeline <b>must</b> have been created with the #DYNAMIC_STATE_STENCIL_WRITE_MASK dynamic state enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code faceMask} <b>must</b> be a valid combination of {@code VkStencilFaceFlagBits} values</li>
            <li>{@code faceMask} <b>must</b> not be 0</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td><td></td></tr></tbody>
        </table>
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command will be recorded."),
        VkStencilFaceFlags.IN("faceMask", "a bitmask of {@code VkStencilFaceFlagBits} specifying the set of stencil state for which to update the write mask, as described above for #CmdSetStencilCompareMask()."),
        uint32_t.IN("writeMask", "the new value to use as the stencil write mask.")
    )

    void(
        "CmdSetStencilReference",
        """
        Set the stencil reference dynamic state.

        <h5>C Specification</h5>
        If the pipeline state object is created with the #DYNAMIC_STATE_STENCIL_REFERENCE dynamic state enabled, then to dynamically set the stencil reference value call:

        <code><pre>
￿void vkCmdSetStencilReference(
￿    VkCommandBuffer                             commandBuffer,
￿    VkStencilFaceFlags                          faceMask,
￿    uint32_t                                    reference);</pre></code>

        <h5>Valid Usage</h5>
        <ul>
            <li>The currently bound graphics pipeline <b>must</b> have been created with the #DYNAMIC_STATE_STENCIL_REFERENCE dynamic state enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code faceMask} <b>must</b> be a valid combination of {@code VkStencilFaceFlagBits} values</li>
            <li>{@code faceMask} <b>must</b> not be 0</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td><td></td></tr></tbody>
        </table>
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command will be recorded."),
        VkStencilFaceFlags.IN("faceMask", "a bitmask of {@code VkStencilFaceFlagBits} specifying the set of stencil state for which to update the reference value, as described above for #CmdSetStencilCompareMask()."),
        uint32_t.IN("reference", "the new value to use as the stencil reference value.")
    )

    void(
        "CmdBindDescriptorSets",
        """
        Binds descriptor sets to a command buffer.

        <h5>C Specification</h5>
        To bind one or more descriptor sets to a command buffer, call:

        <code><pre>
￿void vkCmdBindDescriptorSets(
￿    VkCommandBuffer                             commandBuffer,
￿    VkPipelineBindPoint                         pipelineBindPoint,
￿    VkPipelineLayout                            layout,
￿    uint32_t                                    firstSet,
￿    uint32_t                                    descriptorSetCount,
￿    const VkDescriptorSet*                      pDescriptorSets,
￿    uint32_t                                    dynamicOffsetCount,
￿    const uint32_t*                             pDynamicOffsets);</pre></code>

        <h5>Description</h5>
        #CmdBindDescriptorSets() causes the sets numbered [{@code firstSet}.. {@code firstSet}+{@code descriptorSetCount}-1] to use the bindings stored in {@code pDescriptorSets}[0..{@code descriptorSetCount}-1] for subsequent rendering commands (either compute or graphics, according to the {@code pipelineBindPoint}). Any bindings that were previously applied via these sets are no longer valid.

        Once bound, a descriptor set affects rendering of subsequent graphics or compute commands in the command buffer until a different set is bound to the same set number, or else until the set is disturbed as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#descriptorsets-compatibility">Pipeline Layout Compatibility</a>.

        A compatible descriptor set <b>must</b> be bound for all set numbers that any shaders in a pipeline access, at the time that a draw or dispatch command is recorded to execute using that pipeline. However, if none of the shaders in a pipeline statically use any bindings with a particular set number, then no descriptor set need be bound for that set number, even if the pipeline layout includes a non-trivial descriptor set layout for that set number.

        If any of the sets being bound include dynamic uniform or storage buffers, then {@code pDynamicOffsets} includes one element for each array element in each dynamic descriptor type binding in each set. Values are taken from {@code pDynamicOffsets} in an order such that all entries for set N come before set N+1; within a set, entries are ordered by the binding numbers in the descriptor set layouts; and within a binding array, elements are in order. {@code dynamicOffsetCount} <b>must</b> equal the total number of dynamic descriptors in the sets being bound.

        The effective offset used for dynamic uniform and storage buffer bindings is the sum of the relative offset taken from {@code pDynamicOffsets}, and the base address of the buffer plus base offset in the descriptor set. The length of the dynamic uniform and storage buffer bindings is the buffer range as specified in the descriptor set.

        Each of the {@code pDescriptorSets} <b>must</b> be compatible with the pipeline layout specified by {@code layout}. The layout used to program the bindings <b>must</b> also be compatible with the pipeline used in subsequent graphics or compute commands, as defined in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#descriptorsets-compatibility">Pipeline Layout Compatibility</a> section.

        The descriptor set contents bound by a call to #CmdBindDescriptorSets() <b>may</b> be consumed during host execution of the command, or during shader execution of the resulting draws, or any time in between. Thus, the contents <b>must</b> not be altered (overwritten by an update command, or freed) between when the command is recorded and when the command completes executing on the queue. The contents of {@code pDynamicOffsets} are consumed immediately during execution of #CmdBindDescriptorSets(). Once all pending uses have completed, it is legal to update and reuse a descriptor set.

        <h5>Valid Usage</h5>
        <ul>
            <li>Any given element of {@code pDescriptorSets} <b>must</b> have been allocated with a {@code VkDescriptorSetLayout} that matches (is the same as, or identically defined as) the {@code VkDescriptorSetLayout} at set <em>n</em> in {@code layout}, where <em>n</em> is the sum of {@code firstSet} and the index into {@code pDescriptorSets}</li>
            <li>{@code dynamicOffsetCount} <b>must</b> be equal to the total number of dynamic descriptors in {@code pDescriptorSets}</li>
            <li>The sum of {@code firstSet} and {@code descriptorSetCount} <b>must</b> be less than or equal to ##VkPipelineLayoutCreateInfo{@code ::setLayoutCount} provided when {@code layout} was created</li>
            <li>{@code pipelineBindPoint} <b>must</b> be supported by the {@code commandBuffer}&#8217;s parent {@code VkCommandPool}&#8217;s queue family</li>
            <li>Any given element of {@code pDynamicOffsets} <b>must</b> satisfy the required alignment for the corresponding descriptor binding&#8217;s descriptor type</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pipelineBindPoint} <b>must</b> be a valid {@code VkPipelineBindPoint} value</li>
            <li>{@code layout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
            <li>{@code pDescriptorSets} <b>must</b> be a pointer to an array of {@code descriptorSetCount} valid {@code VkDescriptorSet} handles</li>
            <li>If {@code dynamicOffsetCount} is not 0, {@code pDynamicOffsets} <b>must</b> be a pointer to an array of {@code dynamicOffsetCount} {@code uint32_t} values</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
            <li>{@code descriptorSetCount} <b>must</b> be greater than 0</li>
            <li>Each of {@code commandBuffer}, {@code layout}, and the elements of {@code pDescriptorSets} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics compute</td><td></td></tr></tbody>
        </table>
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer that the descriptor sets will be bound to."),
        VkPipelineBindPoint.IN("pipelineBindPoint", "a {@code VkPipelineBindPoint} indicating whether the descriptors will be used by graphics pipelines or compute pipelines. There is a separate set of bind points for each of graphics and compute, so binding one does not disturb the other."),
        VkPipelineLayout.IN("layout", "a {@code VkPipelineLayout} object used to program the bindings."),
        uint32_t.IN("firstSet", "the set number of the first descriptor set to be bound."),
        AutoSize("pDescriptorSets")..uint32_t.IN("descriptorSetCount", "the number of elements in the {@code pDescriptorSets} array."),
        const..VkDescriptorSet.p.IN("pDescriptorSets", "an array of handles to {@code VkDescriptorSet} objects describing the descriptor sets to write to."),
        AutoSize("pDynamicOffsets")..uint32_t.IN("dynamicOffsetCount", "the number of dynamic offsets in the {@code pDynamicOffsets} array."),
        nullable..const..uint32_t_p.IN("pDynamicOffsets", "a pointer to an array of {@code uint32_t} values specifying dynamic offsets.")
    )

    void(
        "CmdBindIndexBuffer",
        """
        Bind an index buffer to a command buffer.

        <h5>C Specification</h5>
        To bind an index buffer to a command buffer, call:

        <code><pre>
￿void vkCmdBindIndexBuffer(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBuffer                                    buffer,
￿    VkDeviceSize                                offset,
￿    VkIndexType                                 indexType);</pre></code>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code offset} <b>must</b> be less than the size of {@code buffer}</li>
            <li>The sum of {@code offset} and the address of the range of {@code VkDeviceMemory} object that is backing {@code buffer}, <b>must</b> be a multiple of the type indicated by {@code indexType}</li>
            <li>{@code buffer} <b>must</b> have been created with the #BUFFER_USAGE_INDEX_BUFFER_BIT flag</li>
            <li>If {@code buffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code indexType} <b>must</b> be a valid {@code VkIndexType} value</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>Both of {@code buffer}, and {@code commandBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td><td></td></tr></tbody>
        </table>
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command is recorded."),
        VkBuffer.IN("buffer", "the buffer being bound."),
        VkDeviceSize.IN("offset", "the starting offset in bytes within {@code buffer} used in index buffer address calculations."),
        VkIndexType.IN("indexType", "a {@code VkIndexType} value specifying whether indices are treated as 16 bits or 32 bits.")
    )

    void(
        "CmdBindVertexBuffers",
        """
        Bind vertex buffers to a command buffer.

        <h5>C Specification</h5>
        To bind vertex buffers to a command buffer for use in subsequent draw commands, call:

        <code><pre>
￿void vkCmdBindVertexBuffers(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    firstBinding,
￿    uint32_t                                    bindingCount,
￿    const VkBuffer*                             pBuffers,
￿    const VkDeviceSize*                         pOffsets);</pre></code>

        <h5>Description</h5>
        The values taken from elements <code>i</code> of {@code pBuffers} and {@code pOffsets} replace the current state for the vertex input binding <code>firstBinding {plus} i</code>, for <code>i</code> in <code>[0, bindingCount)</code>. The vertex input binding is updated to start at the offset indicated by {@code pOffsets}[i] from the start of the buffer {@code pBuffers}[i]. All vertex input attributes that use each of these bindings will use these updated addresses in their address calculations for subsequent draw commands.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code firstBinding} <b>must</b> be less than ##VkPhysicalDeviceLimits{@code ::maxVertexInputBindings}</li>
            <li>The sum of {@code firstBinding} and {@code bindingCount} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxVertexInputBindings}</li>
            <li>All elements of {@code pOffsets} <b>must</b> be less than the size of the corresponding element in {@code pBuffers}</li>
            <li>All elements of {@code pBuffers} <b>must</b> have been created with the #BUFFER_USAGE_VERTEX_BUFFER_BIT flag</li>
            <li>Each element of {@code pBuffers} that is non-sparse <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pBuffers} <b>must</b> be a pointer to an array of {@code bindingCount} valid {@code VkBuffer} handles</li>
            <li>{@code pOffsets} <b>must</b> be a pointer to an array of {@code bindingCount} {@code VkDeviceSize} values</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>{@code bindingCount} <b>must</b> be greater than 0</li>
            <li>Both of {@code commandBuffer}, and the elements of {@code pBuffers} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td><td></td></tr></tbody>
        </table>
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command is recorded."),
        uint32_t.IN("firstBinding", "the index of the first vertex input binding whose state is updated by the command."),
        AutoSize("pBuffers", "pOffsets")..uint32_t.IN("bindingCount", "the number of vertex input bindings whose state is updated by the command."),
        const..VkBuffer.p.IN("pBuffers", "a pointer to an array of buffer handles."),
        const..VkDeviceSize.p.IN("pOffsets", "a pointer to an array of buffer offsets.")
    )

    void(
        "CmdDraw",
        """
        Draw primitives.

        <h5>C Specification</h5>
        To record a non-indexed draw, call:

        <code><pre>
￿void vkCmdDraw(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    vertexCount,
￿    uint32_t                                    instanceCount,
￿    uint32_t                                    firstVertex,
￿    uint32_t                                    firstInstance);</pre></code>

        <h5>Description</h5>
        When the command is executed, primitives are assembled using the current primitive topology and {@code vertexCount} consecutive vertex indices with the first {@code vertexIndex} value equal to {@code firstVertex}. The primitives are drawn {@code instanceCount} times with {@code instanceIndex} starting with {@code firstInstance} and increasing sequentially for each instance. The assembled primitives execute the currently bound graphics pipeline.

        <h5>Valid Usage</h5>
        <ul>
            <li>The current render pass <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#renderpass-compatibility">compatible</a> with the {@code renderPass} member of the ##VkGraphicsPipelineCreateInfo structure specified when creating the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS.</li>
            <li>The subpass index of the current render pass <b>must</b> be equal to the {@code subpass} member of the ##VkGraphicsPipelineCreateInfo structure specified when creating the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS.</li>
            <li>For each set <em>n</em> that is statically used by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS, a descriptor set <b>must</b> have been bound to <em>n</em> at #PIPELINE_BIND_POINT_GRAPHICS, with a {@code VkPipelineLayout} that is compatible for set <em>n</em>, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#descriptorsets-compatibility">the “Pipeline Layout Compatibility” section</a></li>
            <li>For each push constant that is statically used by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS, a push constant value <b>must</b> have been set for #PIPELINE_BIND_POINT_GRAPHICS, with a {@code VkPipelineLayout} that is compatible for push constants, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#descriptorsets-compatibility">the “Pipeline Layout Compatibility” section</a></li>
            <li>Descriptors in each bound descriptor set, specified via #CmdBindDescriptorSets(), <b>must</b> be valid if they are statically used by the currently bound {@code VkPipeline} object, specified via #CmdBindPipeline()</li>
            <li>All vertex input bindings accessed via vertex input variables declared in the vertex shader entry point&#8217;s interface <b>must</b> have valid buffers bound</li>
            <li>For a given vertex buffer binding, any attribute data fetched <b>must</b> be entirely contained within the corresponding vertex buffer binding, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#fxvertex-input">the “Vertex Input Description” section</a></li>
            <li>A valid graphics pipeline <b>must</b> be bound to the current command buffer with #PIPELINE_BIND_POINT_GRAPHICS</li>
            <li>If the {@code VkPipeline} object currently bound to #PIPELINE_BIND_POINT_GRAPHICS requires any dynamic state, that state <b>must</b> have been set on the current command buffer</li>
            <li>Every input attachment used by the current subpass <b>must</b> be bound to the pipeline via a descriptor set</li>
            <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS uses unnormalized coordinates, it <b>must</b> not be used to sample from any {@code VkImage} with a {@code VkImageView} of the type #IMAGE_VIEW_TYPE_3D, #IMAGE_VIEW_TYPE_CUBE, #IMAGE_VIEW_TYPE_1D_ARRAY, #IMAGE_VIEW_TYPE_2D_ARRAY or #IMAGE_VIEW_TYPE_CUBE_ARRAY, in any shader stage</li>
            <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS uses unnormalized coordinates, it <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with {@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage</li>
            <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS uses unnormalized coordinates, it <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that includes a LOD bias or any offset values, in any shader stage</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-robustBufferAccess">robust buffer access</a> feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to #PIPELINE_BIND_POINT_GRAPHICS accesses a uniform buffer, it <b>must</b> not access values outside of the range of that buffer specified in the currently bound descriptor set</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-robustBufferAccess">robust buffer access</a> feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to #PIPELINE_BIND_POINT_GRAPHICS accesses a storage buffer, it <b>must</b> not access values outside of the range of that buffer specified in the currently bound descriptor set</li>
            <li>Any {@code VkImageView} being sampled with #FILTER_LINEAR as a result of this command <b>must</b> be of a format which supports linear filtering, as specified by the #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT flag in ##VkFormatProperties{@code ::linearTilingFeatures} (for a linear image) or ##VkFormatProperties{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by #GetPhysicalDeviceFormatProperties()</li>
            <li>Any {@code VkImageView} being sampled with #FILTER_CUBIC_IMG as a result of this command <b>must</b> be of a format which supports cubic filtering, as specified by the #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG flag in ##VkFormatProperties{@code ::linearTilingFeatures} (for a linear image) or ##VkFormatProperties{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by #GetPhysicalDeviceFormatProperties()</li>
            <li>Any {@code VkImageView} being sampled with #FILTER_CUBIC_IMG as a result of this command <b>must</b> not have a {@code VkImageViewType} of #IMAGE_VIEW_TYPE_3D, #IMAGE_VIEW_TYPE_CUBE, or #IMAGE_VIEW_TYPE_CUBE_ARRAY</li>
            <li>If the draw is recorded in a render pass instance with multiview enabled, the maximum instance index <b>must</b> be less than or equal to ##VkPhysicalDeviceMultiviewPropertiesKHX{@code ::maxMultiviewInstanceIndex}.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called inside of a render pass instance</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Inside</td><td>Graphics</td><td>Graphics</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command is recorded."),
        uint32_t.IN("vertexCount", "the number of vertices to draw."),
        uint32_t.IN("instanceCount", "the number of instances to draw."),
        uint32_t.IN("firstVertex", "the index of the first vertex to draw."),
        uint32_t.IN("firstInstance", "the instance ID of the first instance to draw.")
    )

    void(
        "CmdDrawIndexed",
        """
        Issue an indexed draw into a command buffer.

        <h5>C Specification</h5>
        To record an indexed draw, call:

        <code><pre>
￿void vkCmdDrawIndexed(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    indexCount,
￿    uint32_t                                    instanceCount,
￿    uint32_t                                    firstIndex,
￿    int32_t                                     vertexOffset,
￿    uint32_t                                    firstInstance);</pre></code>

        <h5>Description</h5>
        When the command is executed, primitives are assembled using the current primitive topology and {@code indexCount} vertices whose indices are retrieved from the index buffer. The index buffer is treated as an array of tightly packed unsigned integers of size defined by the #CmdBindIndexBuffer(){@code ::indexType} parameter with which the buffer was bound.

        The first vertex index is at an offset of {@code firstIndex} * {@code indexSize} + {@code offset} within the currently bound index buffer, where {@code offset} is the offset specified by #CmdBindIndexBuffer() and {@code indexSize} is the byte size of the type specified by {@code indexType}. Subsequent index values are retrieved from consecutive locations in the index buffer. Indices are first compared to the primitive restart value, then zero extended to 32 bits (if the {@code indexType} is #INDEX_TYPE_UINT16) and have {@code vertexOffset} added to them, before being supplied as the {@code vertexIndex} value.

        The primitives are drawn {@code instanceCount} times with {@code instanceIndex} starting with {@code firstInstance} and increasing sequentially for each instance. The assembled primitives execute the currently bound graphics pipeline.

        <h5>Valid Usage</h5>
        <ul>
            <li>The current render pass <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#renderpass-compatibility">compatible</a> with the {@code renderPass} member of the ##VkGraphicsPipelineCreateInfo structure specified when creating the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS.</li>
            <li>The subpass index of the current render pass <b>must</b> be equal to the {@code subpass} member of the ##VkGraphicsPipelineCreateInfo structure specified when creating the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS.</li>
            <li>For each set <em>n</em> that is statically used by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS, a descriptor set <b>must</b> have been bound to <em>n</em> at #PIPELINE_BIND_POINT_GRAPHICS, with a {@code VkPipelineLayout} that is compatible for set <em>n</em>, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#descriptorsets-compatibility">the “Pipeline Layout Compatibility” section</a></li>
            <li>For each push constant that is statically used by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS, a push constant value <b>must</b> have been set for #PIPELINE_BIND_POINT_GRAPHICS, with a {@code VkPipelineLayout} that is compatible for push constants, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#descriptorsets-compatibility">the “Pipeline Layout Compatibility” section</a></li>
            <li>Descriptors in each bound descriptor set, specified via #CmdBindDescriptorSets(), <b>must</b> be valid if they are statically used by the currently bound {@code VkPipeline} object, specified via #CmdBindPipeline()</li>
            <li>All vertex input bindings accessed via vertex input variables declared in the vertex shader entry point&#8217;s interface <b>must</b> have valid buffers bound</li>
            <li>For a given vertex buffer binding, any attribute data fetched <b>must</b> be entirely contained within the corresponding vertex buffer binding, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#fxvertex-input">the “Vertex Input Description” section</a></li>
            <li>A valid graphics pipeline <b>must</b> be bound to the current command buffer with #PIPELINE_BIND_POINT_GRAPHICS</li>
            <li>If the {@code VkPipeline} object currently bound to #PIPELINE_BIND_POINT_GRAPHICS requires any dynamic state, that state <b>must</b> have been set on the current command buffer</li>
            <li><code>(indexSize * (firstIndex + indexCount) + offset)</code> <b>must</b> be less than or equal to the size of the currently bound index buffer, with indexSize being based on the type specified by {@code indexType}, where the index buffer, {@code indexType}, and {@code offset} are specified via #CmdBindIndexBuffer()</li>
            <li>Every input attachment used by the current subpass <b>must</b> be bound to the pipeline via a descriptor set</li>
            <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS uses unnormalized coordinates, it <b>must</b> not be used to sample from any {@code VkImage} with a {@code VkImageView} of the type #IMAGE_VIEW_TYPE_3D, #IMAGE_VIEW_TYPE_CUBE, #IMAGE_VIEW_TYPE_1D_ARRAY, #IMAGE_VIEW_TYPE_2D_ARRAY or #IMAGE_VIEW_TYPE_CUBE_ARRAY, in any shader stage</li>
            <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS uses unnormalized coordinates, it <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with {@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage</li>
            <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS uses unnormalized coordinates, it <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that includes a LOD bias or any offset values, in any shader stage</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-robustBufferAccess">robust buffer access</a> feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to #PIPELINE_BIND_POINT_GRAPHICS accesses a uniform buffer, it <b>must</b> not access values outside of the range of that buffer specified in the currently bound descriptor set</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-robustBufferAccess">robust buffer access</a> feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to #PIPELINE_BIND_POINT_GRAPHICS accesses a storage buffer, it <b>must</b> not access values outside of the range of that buffer specified in the currently bound descriptor set</li>
            <li>Any {@code VkImageView} being sampled with #FILTER_LINEAR as a result of this command <b>must</b> be of a format which supports linear filtering, as specified by the #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT flag in ##VkFormatProperties{@code ::linearTilingFeatures} (for a linear image) or ##VkFormatProperties{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by #GetPhysicalDeviceFormatProperties()</li>
            <li>Any {@code VkImageView} being sampled with #FILTER_CUBIC_IMG as a result of this command <b>must</b> be of a format which supports cubic filtering, as specified by the #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG flag in ##VkFormatProperties{@code ::linearTilingFeatures} (for a linear image) or ##VkFormatProperties{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by #GetPhysicalDeviceFormatProperties()</li>
            <li>Any {@code VkImageView} being sampled with #FILTER_CUBIC_IMG as a result of this command <b>must</b> not have a {@code VkImageViewType} of #IMAGE_VIEW_TYPE_3D, #IMAGE_VIEW_TYPE_CUBE, or #IMAGE_VIEW_TYPE_CUBE_ARRAY</li>
            <li>If the draw is recorded in a render pass instance with multiview enabled, the maximum instance index <b>must</b> be less than or equal to ##VkPhysicalDeviceMultiviewPropertiesKHX{@code ::maxMultiviewInstanceIndex}.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called inside of a render pass instance</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Inside</td><td>Graphics</td><td>Graphics</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command is recorded."),
        uint32_t.IN("indexCount", "the number of vertices to draw."),
        uint32_t.IN("instanceCount", "the number of instances to draw."),
        uint32_t.IN("firstIndex", "the base index within the index buffer."),
        int32_t.IN("vertexOffset", "the value added to the vertex index before indexing into the vertex buffer."),
        uint32_t.IN("firstInstance", "the instance ID of the first instance to draw.")
    )

    void(
        "CmdDrawIndirect",
        """
        Issue an indirect draw into a command buffer.

        <h5>C Specification</h5>
        To record a non-indexed indirect draw, call:

        <code><pre>
￿void vkCmdDrawIndirect(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBuffer                                    buffer,
￿    VkDeviceSize                                offset,
￿    uint32_t                                    drawCount,
￿    uint32_t                                    stride);</pre></code>

        <h5>Description</h5>
        #CmdDrawIndirect() behaves similarly to #CmdDraw() except that the parameters are read by the device from a buffer during execution. {@code drawCount} draws are executed by the command, with parameters taken from {@code buffer} starting at {@code offset} and increasing by {@code stride} bytes for each successive draw. The parameters of each draw are encoded in an array of ##VkDrawIndirectCommand structures. If {@code drawCount} is less than or equal to one, {@code stride} is ignored.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code buffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code offset} <b>must</b> be a multiple of 4</li>
            <li>If {@code drawCount} is greater than 1, {@code stride} <b>must</b> be a multiple of 4 and <b>must</b> be greater than or equal to sizeof(##VkDrawIndirectCommand)</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-multiDrawIndirect">multi-draw indirect</a> feature is not enabled, {@code drawCount} <b>must</b> be 0 or 1</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-drawIndirectFirstInstance">drawIndirectFirstInstance</a> feature is not enabled, all the {@code firstInstance} members of the ##VkDrawIndirectCommand structures accessed by this command <b>must</b> be 0</li>
            <li>The current render pass <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#renderpass-compatibility">compatible</a> with the {@code renderPass} member of the ##VkGraphicsPipelineCreateInfo structure specified when creating the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS.</li>
            <li>The subpass index of the current render pass <b>must</b> be equal to the {@code subpass} member of the ##VkGraphicsPipelineCreateInfo structure specified when creating the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS.</li>
            <li>For each set <em>n</em> that is statically used by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS, a descriptor set <b>must</b> have been bound to <em>n</em> at #PIPELINE_BIND_POINT_GRAPHICS, with a {@code VkPipelineLayout} that is compatible for set <em>n</em>, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#descriptorsets-compatibility">the “Pipeline Layout Compatibility” section</a></li>
            <li>For each push constant that is statically used by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS, a push constant value <b>must</b> have been set for #PIPELINE_BIND_POINT_GRAPHICS, with a {@code VkPipelineLayout} that is compatible for push constants, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#descriptorsets-compatibility">the “Pipeline Layout Compatibility” section</a></li>
            <li>Descriptors in each bound descriptor set, specified via #CmdBindDescriptorSets(), <b>must</b> be valid if they are statically used by the currently bound {@code VkPipeline} object, specified via #CmdBindPipeline()</li>
            <li>All vertex input bindings accessed via vertex input variables declared in the vertex shader entry point&#8217;s interface <b>must</b> have valid buffers bound</li>
            <li>A valid graphics pipeline <b>must</b> be bound to the current command buffer with #PIPELINE_BIND_POINT_GRAPHICS</li>
            <li>If the {@code VkPipeline} object currently bound to #PIPELINE_BIND_POINT_GRAPHICS requires any dynamic state, that state <b>must</b> have been set on the current command buffer</li>
            <li>If {@code drawCount} is equal to 1, <code>(offset sizeof(##VkDrawIndirectCommand))</code> <b>must</b> be less than or equal to the size of {@code buffer}</li>
            <li>If {@code drawCount} is greater than 1, <code>(stride × (drawCount - 1) + offset sizeof(##VkDrawIndirectCommand))</code> <b>must</b> be less than or equal to the size of {@code buffer}</li>
            <li>{@code drawCount} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxDrawIndirectCount}</li>
            <li>Every input attachment used by the current subpass <b>must</b> be bound to the pipeline via a descriptor set</li>
            <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS uses unnormalized coordinates, it <b>must</b> not be used to sample from any {@code VkImage} with a {@code VkImageView} of the type #IMAGE_VIEW_TYPE_3D, #IMAGE_VIEW_TYPE_CUBE, #IMAGE_VIEW_TYPE_1D_ARRAY, #IMAGE_VIEW_TYPE_2D_ARRAY or #IMAGE_VIEW_TYPE_CUBE_ARRAY, in any shader stage</li>
            <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS uses unnormalized coordinates, it <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with {@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage</li>
            <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS uses unnormalized coordinates, it <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that includes a LOD bias or any offset values, in any shader stage</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-robustBufferAccess">robust buffer access</a> feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to #PIPELINE_BIND_POINT_GRAPHICS accesses a uniform buffer, it <b>must</b> not access values outside of the range of that buffer specified in the currently bound descriptor set</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-robustBufferAccess">robust buffer access</a> feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to #PIPELINE_BIND_POINT_GRAPHICS accesses a storage buffer, it <b>must</b> not access values outside of the range of that buffer specified in the currently bound descriptor set</li>
            <li>Any {@code VkImageView} being sampled with #FILTER_LINEAR as a result of this command <b>must</b> be of a format which supports linear filtering, as specified by the #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT flag in ##VkFormatProperties{@code ::linearTilingFeatures} (for a linear image) or ##VkFormatProperties{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by #GetPhysicalDeviceFormatProperties()</li>
            <li>Any {@code VkImageView} being sampled with #FILTER_CUBIC_IMG as a result of this command <b>must</b> be of a format which supports cubic filtering, as specified by the #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG flag in ##VkFormatProperties{@code ::linearTilingFeatures} (for a linear image) or ##VkFormatProperties{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by #GetPhysicalDeviceFormatProperties()</li>
            <li>Any {@code VkImageView} being sampled with #FILTER_CUBIC_IMG as a result of this command <b>must</b> not have a {@code VkImageViewType} of #IMAGE_VIEW_TYPE_3D, #IMAGE_VIEW_TYPE_CUBE, or #IMAGE_VIEW_TYPE_CUBE_ARRAY</li>
            <li>If the draw is recorded in a render pass instance with multiview enabled, the maximum instance index <b>must</b> be less than or equal to ##VkPhysicalDeviceMultiviewPropertiesKHX{@code ::maxMultiviewInstanceIndex}.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called inside of a render pass instance</li>
            <li>Both of {@code buffer}, and {@code commandBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Inside</td><td>Graphics</td><td>Graphics</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command is recorded."),
        VkBuffer.IN("buffer", "the buffer containing draw parameters."),
        VkDeviceSize.IN("offset", "the byte offset into {@code buffer} where parameters begin."),
        uint32_t.IN("drawCount", "the number of draws to execute, and <b>can</b> be zero."),
        uint32_t.IN("stride", "the byte stride between successive sets of draw parameters.")
    )

    void(
        "CmdDrawIndexedIndirect",
        """
        Perform an indexed indirect draw.

        <h5>C Specification</h5>
        To record an indexed indirect draw, call:

        <code><pre>
￿void vkCmdDrawIndexedIndirect(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBuffer                                    buffer,
￿    VkDeviceSize                                offset,
￿    uint32_t                                    drawCount,
￿    uint32_t                                    stride);</pre></code>

        <h5>Description</h5>
        #CmdDrawIndexedIndirect() behaves similarly to #CmdDrawIndexed() except that the parameters are read by the device from a buffer during execution. {@code drawCount} draws are executed by the command, with parameters taken from {@code buffer} starting at {@code offset} and increasing by {@code stride} bytes for each successive draw. The parameters of each draw are encoded in an array of ##VkDrawIndexedIndirectCommand structures. If {@code drawCount} is less than or equal to one, {@code stride} is ignored.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code buffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code offset} <b>must</b> be a multiple of 4</li>
            <li>If {@code drawCount} is greater than 1, {@code stride} <b>must</b> be a multiple of 4 and <b>must</b> be greater than or equal to sizeof(##VkDrawIndexedIndirectCommand)</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-multiDrawIndirect">multi-draw indirect</a> feature is not enabled, {@code drawCount} <b>must</b> be 0 or 1</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-drawIndirectFirstInstance">drawIndirectFirstInstance</a> feature is not enabled, all the {@code firstInstance} members of the ##VkDrawIndexedIndirectCommand structures accessed by this command <b>must</b> be 0</li>
            <li>The current render pass <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#renderpass-compatibility">compatible</a> with the {@code renderPass} member of the ##VkGraphicsPipelineCreateInfo structure specified when creating the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS.</li>
            <li>The subpass index of the current render pass <b>must</b> be equal to the {@code subpass} member of the ##VkGraphicsPipelineCreateInfo structure specified when creating the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS.</li>
            <li>For each set <em>n</em> that is statically used by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS, a descriptor set <b>must</b> have been bound to <em>n</em> at #PIPELINE_BIND_POINT_GRAPHICS, with a {@code VkPipelineLayout} that is compatible for set <em>n</em>, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#descriptorsets-compatibility">the “Pipeline Layout Compatibility” section</a></li>
            <li>For each push constant that is statically used by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS, a push constant value <b>must</b> have been set for #PIPELINE_BIND_POINT_GRAPHICS, with a {@code VkPipelineLayout} that is compatible for push constants, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#descriptorsets-compatibility">the “Pipeline Layout Compatibility” section</a></li>
            <li>Descriptors in each bound descriptor set, specified via #CmdBindDescriptorSets(), <b>must</b> be valid if they are statically used by the currently bound {@code VkPipeline} object, specified via #CmdBindPipeline()</li>
            <li>All vertex input bindings accessed via vertex input variables declared in the vertex shader entry point&#8217;s interface <b>must</b> have valid buffers bound</li>
            <li>A valid graphics pipeline <b>must</b> be bound to the current command buffer with #PIPELINE_BIND_POINT_GRAPHICS</li>
            <li>If the {@code VkPipeline} object currently bound to #PIPELINE_BIND_POINT_GRAPHICS requires any dynamic state, that state <b>must</b> have been set on the current command buffer</li>
            <li>If {@code drawCount} is equal to 1, <code>(offset sizeof(##VkDrawIndexedIndirectCommand))</code> <b>must</b> be less than or equal to the size of {@code buffer}</li>
            <li>If {@code drawCount} is greater than 1, <code>(stride × (drawCount - 1) + offset sizeof(##VkDrawIndexedIndirectCommand))</code> <b>must</b> be less than or equal to the size of {@code buffer}</li>
            <li>{@code drawCount} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxDrawIndirectCount}</li>
            <li>Every input attachment used by the current subpass <b>must</b> be bound to the pipeline via a descriptor set</li>
            <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS uses unnormalized coordinates, it <b>must</b> not be used to sample from any {@code VkImage} with a {@code VkImageView} of the type #IMAGE_VIEW_TYPE_3D, #IMAGE_VIEW_TYPE_CUBE, #IMAGE_VIEW_TYPE_1D_ARRAY, #IMAGE_VIEW_TYPE_2D_ARRAY or #IMAGE_VIEW_TYPE_CUBE_ARRAY, in any shader stage</li>
            <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS uses unnormalized coordinates, it <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with {@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage</li>
            <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS uses unnormalized coordinates, it <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that includes a LOD bias or any offset values, in any shader stage</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-robustBufferAccess">robust buffer access</a> feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to #PIPELINE_BIND_POINT_GRAPHICS accesses a uniform buffer, it <b>must</b> not access values outside of the range of that buffer specified in the currently bound descriptor set</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-robustBufferAccess">robust buffer access</a> feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to #PIPELINE_BIND_POINT_GRAPHICS accesses a storage buffer, it <b>must</b> not access values outside of the range of that buffer specified in the currently bound descriptor set</li>
            <li>Any {@code VkImageView} being sampled with #FILTER_LINEAR as a result of this command <b>must</b> be of a format which supports linear filtering, as specified by the #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT flag in ##VkFormatProperties{@code ::linearTilingFeatures} (for a linear image) or ##VkFormatProperties{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by #GetPhysicalDeviceFormatProperties()</li>
            <li>Any {@code VkImageView} being sampled with #FILTER_CUBIC_IMG as a result of this command <b>must</b> be of a format which supports cubic filtering, as specified by the #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG flag in ##VkFormatProperties{@code ::linearTilingFeatures} (for a linear image) or ##VkFormatProperties{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by #GetPhysicalDeviceFormatProperties()</li>
            <li>Any {@code VkImageView} being sampled with #FILTER_CUBIC_IMG as a result of this command <b>must</b> not have a {@code VkImageViewType} of #IMAGE_VIEW_TYPE_3D, #IMAGE_VIEW_TYPE_CUBE, or #IMAGE_VIEW_TYPE_CUBE_ARRAY</li>
            <li>If the draw is recorded in a render pass instance with multiview enabled, the maximum instance index <b>must</b> be less than or equal to ##VkPhysicalDeviceMultiviewPropertiesKHX{@code ::maxMultiviewInstanceIndex}.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called inside of a render pass instance</li>
            <li>Both of {@code buffer}, and {@code commandBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Inside</td><td>Graphics</td><td>Graphics</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command is recorded."),
        VkBuffer.IN("buffer", "the buffer containing draw parameters."),
        VkDeviceSize.IN("offset", "the byte offset into {@code buffer} where parameters begin."),
        uint32_t.IN("drawCount", "the number of draws to execute, and <b>can</b> be zero."),
        uint32_t.IN("stride", "the byte stride between successive sets of draw parameters.")
    )

    void(
        "CmdDispatch",
        """
        Dispatch compute work items.

        <h5>C Specification</h5>
        To record a dispatch, call:

        <code><pre>
￿void vkCmdDispatch(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    groupCountX,
￿    uint32_t                                    groupCountY,
￿    uint32_t                                    groupCountZ);</pre></code>

        <h5>Description</h5>
        When the command is executed, a global workgroup consisting of <code>groupCountX {times} groupCountY {times} groupCountZ</code> local workgroups is assembled.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code groupCountX} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxComputeWorkGroupCount}[0]</li>
            <li>{@code groupCountY} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxComputeWorkGroupCount}[1]</li>
            <li>{@code groupCountZ} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxComputeWorkGroupCount}[2]</li>
            <li>For each set <em>n</em> that is statically used by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_COMPUTE, a descriptor set <b>must</b> have been bound to <em>n</em> at #PIPELINE_BIND_POINT_COMPUTE, with a {@code VkPipelineLayout} that is compatible for set <em>n</em>, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#descriptorsets-compatibility">the “Pipeline Layout Compatibility” section</a></li>
            <li>Descriptors in each bound descriptor set, specified via #CmdBindDescriptorSets(), <b>must</b> be valid if they are statically used by the currently bound {@code VkPipeline} object, specified via #CmdBindPipeline()</li>
            <li>A valid compute pipeline <b>must</b> be bound to the current command buffer with #PIPELINE_BIND_POINT_COMPUTE</li>
            <li>For each push constant that is statically used by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_COMPUTE, a push constant value <b>must</b> have been set for #PIPELINE_BIND_POINT_COMPUTE, with a {@code VkPipelineLayout} that is compatible for push constants with the one used to create the current {@code VkPipeline}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#descriptorsets-compatibility">the “Pipeline Layout Compatibility” section</a></li>
            <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_COMPUTE uses unnormalized coordinates, it <b>must</b> not be used to sample from any {@code VkImage} with a {@code VkImageView} of the type #IMAGE_VIEW_TYPE_3D, #IMAGE_VIEW_TYPE_CUBE, #IMAGE_VIEW_TYPE_1D_ARRAY, #IMAGE_VIEW_TYPE_2D_ARRAY or #IMAGE_VIEW_TYPE_CUBE_ARRAY, in any shader stage</li>
            <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_COMPUTE uses unnormalized coordinates, it <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with {@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage</li>
            <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_COMPUTE uses unnormalized coordinates, it <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that includes a LOD bias or any offset values, in any shader stage</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-robustBufferAccess">robust buffer access</a> feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to #PIPELINE_BIND_POINT_COMPUTE accesses a uniform buffer, it <b>must</b> not access values outside of the range of that buffer specified in the currently bound descriptor set</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-robustBufferAccess">robust buffer access</a> feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to #PIPELINE_BIND_POINT_COMPUTE accesses a storage buffer, it <b>must</b> not access values outside of the range of that buffer specified in the currently bound descriptor set</li>
            <li>Any {@code VkImageView} being sampled with #FILTER_LINEAR as a result of this command <b>must</b> be of a format which supports linear filtering, as specified by the #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT flag in ##VkFormatProperties{@code ::linearTilingFeatures} (for a linear image) or ##VkFormatProperties{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by #GetPhysicalDeviceFormatProperties()</li>
            <li>Any {@code VkImageView} being sampled with #FILTER_CUBIC_IMG as a result of this command <b>must</b> be of a format which supports cubic filtering, as specified by the #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG flag in ##VkFormatProperties{@code ::linearTilingFeatures} (for a linear image) or ##VkFormatProperties{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by #GetPhysicalDeviceFormatProperties()</li>
            <li>Any {@code VkImageView} being sampled with #FILTER_CUBIC_IMG as a result of this command <b>must</b> not have a {@code VkImageViewType} of #IMAGE_VIEW_TYPE_3D, #IMAGE_VIEW_TYPE_CUBE, or #IMAGE_VIEW_TYPE_CUBE_ARRAY</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Compute</td><td>Compute</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command will be recorded."),
        uint32_t.IN("groupCountX", "the number of local workgroups to dispatch in the X dimension."),
        uint32_t.IN("groupCountY", "the number of local workgroups to dispatch in the Y dimension."),
        uint32_t.IN("groupCountZ", "the number of local workgroups to dispatch in the Z dimension.")
    )

    void(
        "CmdDispatchIndirect",
        """
        Dispatch compute work items using indirect parameters.

        <h5>C Specification</h5>
        To record an indirect command dispatch, call:

        <code><pre>
￿void vkCmdDispatchIndirect(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBuffer                                    buffer,
￿    VkDeviceSize                                offset);</pre></code>

        <h5>Description</h5>
        #CmdDispatchIndirect() behaves similarly to #CmdDispatch() except that the parameters are read by the device from a buffer during execution. The parameters of the dispatch are encoded in a ##VkDispatchIndirectCommand structure taken from {@code buffer} starting at {@code offset}.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code buffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>For each set <em>n</em> that is statically used by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_COMPUTE, a descriptor set <b>must</b> have been bound to <em>n</em> at #PIPELINE_BIND_POINT_COMPUTE, with a {@code VkPipelineLayout} that is compatible for set <em>n</em>, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#descriptorsets-compatibility">the “Pipeline Layout Compatibility” section</a></li>
            <li>Descriptors in each bound descriptor set, specified via #CmdBindDescriptorSets(), <b>must</b> be valid if they are statically used by the currently bound {@code VkPipeline} object, specified via #CmdBindPipeline()</li>
            <li>A valid compute pipeline <b>must</b> be bound to the current command buffer with #PIPELINE_BIND_POINT_COMPUTE</li>
            <li>{@code buffer} <b>must</b> have been created with the #BUFFER_USAGE_INDIRECT_BUFFER_BIT bit set</li>
            <li>{@code offset} <b>must</b> be a multiple of 4</li>
            <li>The sum of {@code offset} and the size of ##VkDispatchIndirectCommand <b>must</b> be less than or equal to the size of {@code buffer}</li>
            <li>For each push constant that is statically used by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_COMPUTE, a push constant value <b>must</b> have been set for #PIPELINE_BIND_POINT_COMPUTE, with a {@code VkPipelineLayout} that is compatible for push constants with the one used to create the current {@code VkPipeline}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#descriptorsets-compatibility">the “Pipeline Layout Compatibility” section</a></li>
            <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_COMPUTE uses unnormalized coordinates, it <b>must</b> not be used to sample from any {@code VkImage} with a {@code VkImageView} of the type #IMAGE_VIEW_TYPE_3D, #IMAGE_VIEW_TYPE_CUBE, #IMAGE_VIEW_TYPE_1D_ARRAY, #IMAGE_VIEW_TYPE_2D_ARRAY or #IMAGE_VIEW_TYPE_CUBE_ARRAY, in any shader stage</li>
            <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_COMPUTE uses unnormalized coordinates, it <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with {@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage</li>
            <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_COMPUTE uses unnormalized coordinates, it <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that includes a LOD bias or any offset values, in any shader stage</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-robustBufferAccess">robust buffer access</a> feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to #PIPELINE_BIND_POINT_COMPUTE accesses a uniform buffer, it <b>must</b> not access values outside of the range of that buffer specified in the currently bound descriptor set</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-robustBufferAccess">robust buffer access</a> feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to #PIPELINE_BIND_POINT_COMPUTE accesses a storage buffer, it <b>must</b> not access values outside of the range of that buffer specified in the currently bound descriptor set</li>
            <li>Any {@code VkImageView} being sampled with #FILTER_LINEAR as a result of this command <b>must</b> be of a format which supports linear filtering, as specified by the #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT flag in ##VkFormatProperties{@code ::linearTilingFeatures} (for a linear image) or ##VkFormatProperties{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by #GetPhysicalDeviceFormatProperties()</li>
            <li>Any {@code VkImageView} being sampled with #FILTER_CUBIC_IMG as a result of this command <b>must</b> be of a format which supports cubic filtering, as specified by the #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG flag in ##VkFormatProperties{@code ::linearTilingFeatures} (for a linear image) or ##VkFormatProperties{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by #GetPhysicalDeviceFormatProperties()</li>
            <li>Any {@code VkImageView} being sampled with #FILTER_CUBIC_IMG as a result of this command <b>must</b> not have a {@code VkImageViewType} of #IMAGE_VIEW_TYPE_3D, #IMAGE_VIEW_TYPE_CUBE, or #IMAGE_VIEW_TYPE_CUBE_ARRAY</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>Both of {@code buffer}, and {@code commandBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Compute</td><td>Compute</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBuffer.IN("buffer", "the buffer containing dispatch parameters."),
        VkDeviceSize.IN("offset", "the byte offset into {@code buffer} where parameters begin.")
    )

    void(
        "CmdCopyBuffer",
        """
        Copy data between buffer regions.

        <h5>C Specification</h5>
        To copy data between buffer objects, call:

        <code><pre>
￿void vkCmdCopyBuffer(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBuffer                                    srcBuffer,
￿    VkBuffer                                    dstBuffer,
￿    uint32_t                                    regionCount,
￿    const VkBufferCopy*                         pRegions);</pre></code>

        <h5>Description</h5>
        Each region in {@code pRegions} is copied from the source buffer to the same region of the destination buffer. {@code srcBuffer} and {@code dstBuffer} <b>can</b> be the same buffer or alias the same memory, but the result is undefined if the copy regions overlap in memory.

        <h5>Valid Usage</h5>
        <ul>
            <li>The {@code size} member of a given element of {@code pRegions} <b>must</b> be greater than 0</li>
            <li>The {@code srcOffset} member of a given element of {@code pRegions} <b>must</b> be less than the size of {@code srcBuffer}</li>
            <li>The {@code dstOffset} member of a given element of {@code pRegions} <b>must</b> be less than the size of {@code dstBuffer}</li>
            <li>The {@code size} member of a given element of {@code pRegions} <b>must</b> be less than or equal to the size of {@code srcBuffer} minus {@code srcOffset}</li>
            <li>The {@code size} member of a given element of {@code pRegions} <b>must</b> be less than or equal to the size of {@code dstBuffer} minus {@code dstOffset}</li>
            <li>The union of the source regions, and the union of the destination regions, specified by the elements of {@code pRegions}, <b>must</b> not overlap in memory</li>
            <li>{@code srcBuffer} <b>must</b> have been created with #BUFFER_USAGE_TRANSFER_SRC_BIT usage flag</li>
            <li>If {@code srcBuffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code dstBuffer} <b>must</b> have been created with #BUFFER_USAGE_TRANSFER_DST_BIT usage flag</li>
            <li>If {@code dstBuffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code srcBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code dstBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code pRegions} <b>must</b> be a pointer to an array of {@code regionCount} ##VkBufferCopy structures</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>{@code regionCount} <b>must</b> be greater than 0</li>
            <li>Each of {@code commandBuffer}, {@code dstBuffer}, and {@code srcBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Transfer graphics compute</td><td>Transfer</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkBufferCopy
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBuffer.IN("srcBuffer", "the source buffer."),
        VkBuffer.IN("dstBuffer", "the destination buffer."),
        AutoSize("pRegions")..uint32_t.IN("regionCount", "the number of regions to copy."),
        const..VkBufferCopy.p.IN("pRegions", "a pointer to an array of ##VkBufferCopy structures specifying the regions to copy.")
    )

    void(
        "CmdCopyImage",
        """
        Copy data between images.

        <h5>C Specification</h5>
        To copy data between image objects, call:

        <code><pre>
￿void vkCmdCopyImage(
￿    VkCommandBuffer                             commandBuffer,
￿    VkImage                                     srcImage,
￿    VkImageLayout                               srcImageLayout,
￿    VkImage                                     dstImage,
￿    VkImageLayout                               dstImageLayout,
￿    uint32_t                                    regionCount,
￿    const VkImageCopy*                          pRegions);</pre></code>

        <h5>Description</h5>
        Each region in {@code pRegions} is copied from the source image to the same region of the destination image. {@code srcImage} and {@code dstImage} <b>can</b> be the same image or alias the same memory.

        The formats of {@code srcImage} and {@code dstImage} <b>must</b> be compatible. Formats are considered compatible if their element size is the same between both formats. For example, #FORMAT_R8G8B8A8_UNORM is compatible with #FORMAT_R32_UINT because both texels are 4 bytes in size. Depth/stencil formats <b>must</b> match exactly.

        #CmdCopyImage() allows copying between size-compatible compressed and uncompressed internal formats. Formats are size-compatible if the element size of the uncompressed format is equal to the element size (compressed texel block size) of the compressed format. Such a copy does not perform on-the-fly compression or decompression. When copying from an uncompressed format to a compressed format, each texel of uncompressed data of the source image is copied as a raw value to the corresponding compressed texel block of the destination image. When copying from a compressed format to an uncompressed format, each compressed texel block of the source image is copied as a raw value to the corresponding texel of uncompressed data in the destination image. Thus, for example, it is legal to copy between a 128-bit uncompressed format and a compressed format which has a 128-bit sized compressed texel block representing 4x4 texels (using 8 bits per texel), or between a 64-bit uncompressed format and a compressed format which has a 64-bit sized compressed texel block representing 4x4 texels (using 4 bits per texel).

        When copying between compressed and uncompressed formats the {@code extent} members represent the texel dimensions of the source image and not the destination. When copying from a compressed image to an uncompressed image the image texel dimensions written to the uncompressed image will be source extent divided by the compressed texel block dimensions. When copying from an uncompressed image to a compressed image the image texel dimensions written to the compressed image will be the source extent multiplied by the compressed texel block dimensions. In both cases the number of bytes read and the number of bytes written will be identical.

        Copying to or from block-compressed images is typically done in multiples of the compressed texel block size. For this reason the {@code extent} <b>must</b> be a multiple of the compressed texel block dimension. There is one exception to this rule which is required: to handle compressed images created with dimensions that are not a multiple of the compressed texel block dimensions: if the {@code srcImage} is compressed, then:

        <ul>
            <li>If {@code extent.width} is not a multiple of the compressed texel block width, then <code>(extent.width + srcOffset.x)</code> <b>must</b> equal the image subresource width.</li>
            <li>If {@code extent.height} is not a multiple of the compressed texel block height, then <code>(extent.height + srcOffset.y)</code> <b>must</b> equal the image subresource height.</li>
            <li>If {@code extent.depth} is not a multiple of the compressed texel block depth, then <code>(extent.depth + srcOffset.z)</code> <b>must</b> equal the image subresource depth.</li>
        </ul>

        Similarly, if the {@code dstImage} is compressed, then:

        <ul>
            <li>If {@code extent.width} is not a multiple of the compressed texel block width, then <code>(extent.width + dstOffset.x)</code> <b>must</b> equal the image subresource width.</li>
            <li>If {@code extent.height} is not a multiple of the compressed texel block height, then <code>(extent.height + dstOffset.y)</code> <b>must</b> equal the image subresource height.</li>
            <li>If {@code extent.depth} is not a multiple of the compressed texel block depth, then <code>(extent.depth + dstOffset.z)</code> <b>must</b> equal the image subresource depth.</li>
        </ul>

        This allows the last compressed texel block of the image in each non-multiple dimension to be included as a source or destination of the copy.

        #CmdCopyImage() <b>can</b> be used to copy image data between multisample images, but both images <b>must</b> have the same number of samples.

        <h5>Valid Usage</h5>
        <ul>
            <li>The source region specified by a given element of {@code pRegions} <b>must</b> be a region that is contained within {@code srcImage}</li>
            <li>The destination region specified by a given element of {@code pRegions} <b>must</b> be a region that is contained within {@code dstImage}</li>
            <li>The union of all source regions, and the union of all destination regions, specified by the elements of {@code pRegions}, <b>must</b> not overlap in memory</li>
            <li>{@code srcImage} <b>must</b> use a format that supports #FORMAT_FEATURE_TRANSFER_SRC_BIT_KHR, which is indicated by ##VkFormatProperties{@code ::linearTilingFeatures} (for linearly tiled images) or ##VkFormatProperties{@code ::optimalTilingFeatures} (for optimally tiled images) - as returned by #GetPhysicalDeviceFormatProperties()</li>
            <li>{@code srcImage} <b>must</b> have been created with #IMAGE_USAGE_TRANSFER_SRC_BIT usage flag</li>
            <li>If {@code srcImage} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code srcImageLayout} <b>must</b> specify the layout of the image subresources of {@code srcImage} specified in {@code pRegions} at the time this command is executed on a {@code VkDevice}</li>
            <li>{@code srcImageLayout} <b>must</b> be #IMAGE_LAYOUT_SHARED_PRESENT_KHR, #IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL or #IMAGE_LAYOUT_GENERAL</li>
            <li>{@code dstImage} <b>must</b> use a format that supports #FORMAT_FEATURE_TRANSFER_DST_BIT_KHR, which is indicated by ##VkFormatProperties{@code ::linearTilingFeatures} (for linearly tiled images) or ##VkFormatProperties{@code ::optimalTilingFeatures} (for optimally tiled images) - as returned by #GetPhysicalDeviceFormatProperties()</li>
            <li>{@code dstImage} <b>must</b> have been created with #IMAGE_USAGE_TRANSFER_DST_BIT usage flag</li>
            <li>If {@code dstImage} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code dstImageLayout} <b>must</b> specify the layout of the image subresources of {@code dstImage} specified in {@code pRegions} at the time this command is executed on a {@code VkDevice}</li>
            <li>{@code dstImageLayout} <b>must</b> be #IMAGE_LAYOUT_SHARED_PRESENT_KHR, #IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL or #IMAGE_LAYOUT_GENERAL</li>
            <li>The {@code VkFormat} of each of {@code srcImage} and {@code dstImage} <b>must</b> be compatible, as defined <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#copies-images-format-compatibility">below</a></li>
            <li>The sample count of {@code srcImage} and {@code dstImage} <b>must</b> match</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code srcImage} <b>must</b> be a valid {@code VkImage} handle</li>
            <li>{@code srcImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
            <li>{@code dstImage} <b>must</b> be a valid {@code VkImage} handle</li>
            <li>{@code dstImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
            <li>{@code pRegions} <b>must</b> be a pointer to an array of {@code regionCount} valid ##VkImageCopy structures</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>{@code regionCount} <b>must</b> be greater than 0</li>
            <li>Each of {@code commandBuffer}, {@code dstImage}, and {@code srcImage} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Transfer graphics compute</td><td>Transfer</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkImageCopy
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command will be recorded."),
        VkImage.IN("srcImage", "the source image."),
        VkImageLayout.IN("srcImageLayout", "the current layout of the source image subresource."),
        VkImage.IN("dstImage", "the destination image."),
        VkImageLayout.IN("dstImageLayout", "the current layout of the destination image subresource."),
        AutoSize("pRegions")..uint32_t.IN("regionCount", "the number of regions to copy."),
        const..VkImageCopy.p.IN("pRegions", "a pointer to an array of ##VkImageCopy structures specifying the regions to copy.")
    )

    void(
        "CmdBlitImage",
        """
        Copy regions of an image, potentially performing format conversion,.

        <h5>C Specification</h5>
        To copy regions of a source image into a destination image, potentially performing format conversion, arbitrary scaling, and filtering, call:

        <code><pre>
￿void vkCmdBlitImage(
￿    VkCommandBuffer                             commandBuffer,
￿    VkImage                                     srcImage,
￿    VkImageLayout                               srcImageLayout,
￿    VkImage                                     dstImage,
￿    VkImageLayout                               dstImageLayout,
￿    uint32_t                                    regionCount,
￿    const VkImageBlit*                          pRegions,
￿    VkFilter                                    filter);</pre></code>

        <h5>Description</h5>
        #CmdBlitImage() <b>must</b> not be used for multisampled source or destination images. Use #CmdResolveImage() for this purpose.

        As the sizes of the source and destination extents <b>can</b> differ in any dimension, texels in the source extent are scaled and filtered to the destination extent. Scaling occurs via the following operations:

        <ul>
            <li>
                For each destination texel, the integer coordinate of that texel is converted to an unnormalized texture coordinate, using the effective inverse of the equations described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#textures-unnormalized-to-integer">unnormalized to integer conversion</a>:
                <dl>
            <dd><code>u<sub>base</sub> = i + ½</code></dd>

                    <dd><code>v<sub>base</sub> = j + ½</code></dd>

                    <dd><code>w<sub>base</sub> = k + ½</code></dd>
                </dl>
            </li>
            <li>
                These base coordinates are then offset by the first destination offset:
                <dl>
            <dd><code>u<sub>offset</sub> = u<sub>base</sub> - x<sub>dst0</sub></code></dd>

                    <dd><code>v<sub>offset</sub> = v<sub>base</sub> - y<sub>dst0</sub></code></dd>

                    <dd><code>w<sub>offset</sub> = w<sub>base</sub> - z<sub>dst0</sub></code></dd>

                    <dd><code>a<sub>offset</sub> = a - baseArrayCount<sub>dst</sub></code></dd>
                </dl>
            </li>
            <li>
                The scale is determined from the source and destination regions, and applied to the offset coordinates:
                <dl>
            <dd><code>scale_u = (x<sub>src1</sub> - x<sub>src0</sub>) / (x<sub>dst1</sub> - x<sub>dst0</sub>)</code></dd>

                    <dd><code>scale_v = (y<sub>src1</sub> - y<sub>src0</sub>) / (y<sub>dst1</sub> - y<sub>dst0</sub>)</code></dd>

                    <dd><code>scale_w = (z<sub>src1</sub> - z<sub>src0</sub>) / (z<sub>dst1</sub> - z<sub>dst0</sub>)</code></dd>

                    <dd><code>u<sub>scaled</sub> = u<sub>offset</sub> * scale<sub>u</sub></code></dd>

                    <dd><code>v<sub>scaled</sub> = v<sub>offset</sub> * scale<sub>v</sub></code></dd>

                    <dd><code>w<sub>scaled</sub> = w<sub>offset</sub> * scale<sub>w</sub></code></dd>
                </dl>
            </li>
            <li>
                Finally the source offset is added to the scaled coordinates, to determine the final unnormalized coordinates used to sample from {@code srcImage}:
                <dl>
            <dd><code>u = u<sub>scaled</sub> + x<sub>src0</sub></code></dd>

                    <dd><code>v = v<sub>scaled</sub> + y<sub>src0</sub></code></dd>

                    <dd><code>w = w<sub>scaled</sub> + z<sub>src0</sub></code></dd>

                    <dd><code>q = mipLevel</code></dd>

                    <dd><code>a = a<sub>offset</sub> + baseArrayCount<sub>src</sub></code></dd>
                </dl>
            </li>
        </ul>

        These coordinates are used to sample from the source image, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#textures">Image Operations chapter</a>, with the filter mode equal to that of {@code filter}, a mipmap mode of #SAMPLER_MIPMAP_MODE_NEAREST and an address mode of #SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE. Implementations <b>must</b> clamp at the edge of the source image, and <b>may</b> additionally clamp to the edge of the source region.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Due to allowable rounding errors in the generation of the source texture coordinates, it is not always possible to guarantee exactly which source texels will be sampled for a given blit. As rounding errors are implementation dependent, the exact results of a blitting operation are also implementation dependent.
        </div>

        Blits are done layer by layer starting with the {@code baseArrayLayer} member of {@code srcSubresource} for the source and {@code dstSubresource} for the destination. {@code layerCount} layers are blitted to the destination image.

        3D textures are blitted slice by slice. Slices in the source region bounded by {@code srcOffsets}[0].{@code z} and {@code srcOffsets}[1].{@code z} are copied to slices in the destination region bounded by {@code dstOffsets}[0].{@code z} and {@code dstOffsets}[1].{@code z}. For each destination slice, a source z coordinate is linearly interpolated between {@code srcOffsets}[0].{@code z} and {@code srcOffsets}[1].{@code z}. If the {@code filter} parameter is #FILTER_LINEAR then the value sampled from the source image is taken by doing linear filtering using the interpolated z coordinate. If {@code filter} parameter is #FILTER_NEAREST then value sampled from the source image is taken from the single nearest slice (with undefined rounding mode).

        The following filtering and conversion rules apply:

        <ul>
            <li>Integer formats <b>can</b> only be converted to other integer formats with the same signedness.</li>
            <li>No format conversion is supported between depth/stencil images. The formats <b>must</b> match.</li>
            <li>Format conversions on unorm, snorm, unscaled and packed float formats of the copied aspect of the image are performed by first converting the pixels to float values.</li>
            <li>For sRGB source formats, nonlinear RGB values are converted to linear representation prior to filtering.</li>
            <li>After filtering, the float values are first clamped and then cast to the destination image format. In case of sRGB destination format, linear RGB values are converted to nonlinear representation before writing the pixel to the image.</li>
        </ul>

        Signed and unsigned integers are converted by first clamping to the representable range of the destination format, then casting the value.

        <h5>Valid Usage</h5>
        <ul>
            <li>The source region specified by a given element of {@code pRegions} <b>must</b> be a region that is contained within {@code srcImage}</li>
            <li>The destination region specified by a given element of {@code pRegions} <b>must</b> be a region that is contained within {@code dstImage}</li>
            <li>The union of all destination regions, specified by the elements of {@code pRegions}, <b>must</b> not overlap in memory with any texel that <b>may</b> be sampled during the blit operation</li>
            <li>{@code srcImage} <b>must</b> use a format that supports #FORMAT_FEATURE_BLIT_SRC_BIT, which is indicated by ##VkFormatProperties{@code ::linearTilingFeatures} (for linearly tiled images) or ##VkFormatProperties{@code ::optimalTilingFeatures} (for optimally tiled images) - as returned by #GetPhysicalDeviceFormatProperties()</li>
            <li>{@code srcImage} <b>must</b> have been created with #IMAGE_USAGE_TRANSFER_SRC_BIT usage flag</li>
            <li>If {@code srcImage} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code srcImageLayout} <b>must</b> specify the layout of the image subresources of {@code srcImage} specified in {@code pRegions} at the time this command is executed on a {@code VkDevice}</li>
            <li>{@code srcImageLayout} <b>must</b> be #IMAGE_LAYOUT_SHARED_PRESENT_KHR, #IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL or #IMAGE_LAYOUT_GENERAL</li>
            <li>{@code dstImage} <b>must</b> use a format that supports #FORMAT_FEATURE_BLIT_DST_BIT, which is indicated by ##VkFormatProperties{@code ::linearTilingFeatures} (for linearly tiled images) or ##VkFormatProperties{@code ::optimalTilingFeatures} (for optimally tiled images) - as returned by #GetPhysicalDeviceFormatProperties()</li>
            <li>{@code dstImage} <b>must</b> have been created with #IMAGE_USAGE_TRANSFER_DST_BIT usage flag</li>
            <li>If {@code dstImage} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code dstImageLayout} <b>must</b> specify the layout of the image subresources of {@code dstImage} specified in {@code pRegions} at the time this command is executed on a {@code VkDevice}</li>
            <li>{@code dstImageLayout} <b>must</b> be #IMAGE_LAYOUT_SHARED_PRESENT_KHR, #IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL or #IMAGE_LAYOUT_GENERAL</li>
            <li>The sample count of {@code srcImage} and {@code dstImage} <b>must</b> both be equal to #SAMPLE_COUNT_1_BIT</li>
            <li>If either of {@code srcImage} or {@code dstImage} was created with a signed integer {@code VkFormat}, the other <b>must</b> also have been created with a signed integer {@code VkFormat}</li>
            <li>If either of {@code srcImage} or {@code dstImage} was created with an unsigned integer {@code VkFormat}, the other <b>must</b> also have been created with an unsigned integer {@code VkFormat}</li>
            <li>If either of {@code srcImage} or {@code dstImage} was created with a depth/stencil format, the other <b>must</b> have exactly the same format</li>
            <li>If {@code srcImage} was created with a depth/stencil format, {@code filter} <b>must</b> be #FILTER_NEAREST</li>
            <li>{@code srcImage} <b>must</b> have been created with a {@code samples} value of #SAMPLE_COUNT_1_BIT</li>
            <li>{@code dstImage} <b>must</b> have been created with a {@code samples} value of #SAMPLE_COUNT_1_BIT</li>
            <li>If {@code filter} is #FILTER_LINEAR, {@code srcImage} <b>must</b> be of a format which supports linear filtering, as specified by the #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT flag in ##VkFormatProperties{@code ::linearTilingFeatures} (for a linear image) or ##VkFormatProperties{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by #GetPhysicalDeviceFormatProperties()</li>
            <li>If {@code filter} is #FILTER_CUBIC_IMG, {@code srcImage} <b>must</b> be of a format which supports cubic filtering, as specified by the #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG flag in ##VkFormatProperties{@code ::linearTilingFeatures} (for a linear image) or ##VkFormatProperties{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by #GetPhysicalDeviceFormatProperties()</li>
            <li>If {@code filter} is #FILTER_CUBIC_IMG, {@code srcImage} <b>must</b> have a {@code VkImageType} of #IMAGE_TYPE_3D</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code srcImage} <b>must</b> be a valid {@code VkImage} handle</li>
            <li>{@code srcImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
            <li>{@code dstImage} <b>must</b> be a valid {@code VkImage} handle</li>
            <li>{@code dstImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
            <li>{@code pRegions} <b>must</b> be a pointer to an array of {@code regionCount} valid ##VkImageBlit structures</li>
            <li>{@code filter} <b>must</b> be a valid {@code VkFilter} value</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>{@code regionCount} <b>must</b> be greater than 0</li>
            <li>Each of {@code commandBuffer}, {@code dstImage}, and {@code srcImage} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Graphics</td><td>Transfer</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkImageBlit
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command will be recorded."),
        VkImage.IN("srcImage", "the source image."),
        VkImageLayout.IN("srcImageLayout", "the layout of the source image subresources for the blit."),
        VkImage.IN("dstImage", "the destination image."),
        VkImageLayout.IN("dstImageLayout", "the layout of the destination image subresources for the blit."),
        AutoSize("pRegions")..uint32_t.IN("regionCount", "the number of regions to blit."),
        const..VkImageBlit.p.IN("pRegions", "a pointer to an array of ##VkImageBlit structures specifying the regions to blit."),
        VkFilter.IN("filter", "a {@code VkFilter} specifying the filter to apply if the blits require scaling.")
    )

    void(
        "CmdCopyBufferToImage",
        """
        Copy data from a buffer into an image.

        <h5>C Specification</h5>
        To copy data from a buffer object to an image object, call:

        <code><pre>
￿void vkCmdCopyBufferToImage(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBuffer                                    srcBuffer,
￿    VkImage                                     dstImage,
￿    VkImageLayout                               dstImageLayout,
￿    uint32_t                                    regionCount,
￿    const VkBufferImageCopy*                    pRegions);</pre></code>

        <h5>Description</h5>
        Each region in {@code pRegions} is copied from the specified region of the source buffer to the specified region of the destination image.

        <h5>Valid Usage</h5>
        <ul>
            <li>The buffer region specified by a given element of {@code pRegions} <b>must</b> be a region that is contained within {@code srcBuffer}</li>
            <li>The image region specified by a given element of {@code pRegions} <b>must</b> be a region that is contained within {@code dstImage}</li>
            <li>The union of all source regions, and the union of all destination regions, specified by the elements of {@code pRegions}, <b>must</b> not overlap in memory</li>
            <li>{@code srcBuffer} <b>must</b> have been created with #BUFFER_USAGE_TRANSFER_SRC_BIT usage flag</li>
            <li>{@code dstImage} <b>must</b> use a format that supports #FORMAT_FEATURE_TRANSFER_DST_BIT_KHR, which is indicated by ##VkFormatProperties{@code ::linearTilingFeatures} (for linearly tiled images) or ##VkFormatProperties{@code ::optimalTilingFeatures} (for optimally tiled images) - as returned by #GetPhysicalDeviceFormatProperties()</li>
            <li>If {@code srcBuffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code dstImage} <b>must</b> have been created with #IMAGE_USAGE_TRANSFER_DST_BIT usage flag</li>
            <li>If {@code dstImage} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code dstImage} <b>must</b> have a sample count equal to #SAMPLE_COUNT_1_BIT</li>
            <li>{@code dstImageLayout} <b>must</b> specify the layout of the image subresources of {@code dstImage} specified in {@code pRegions} at the time this command is executed on a {@code VkDevice}</li>
            <li>{@code dstImageLayout} <b>must</b> be #IMAGE_LAYOUT_SHARED_PRESENT_KHR, #IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL or #IMAGE_LAYOUT_GENERAL</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code srcBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code dstImage} <b>must</b> be a valid {@code VkImage} handle</li>
            <li>{@code dstImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
            <li>{@code pRegions} <b>must</b> be a pointer to an array of {@code regionCount} valid ##VkBufferImageCopy structures</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>{@code regionCount} <b>must</b> be greater than 0</li>
            <li>Each of {@code commandBuffer}, {@code dstImage}, and {@code srcBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Transfer graphics compute</td><td>Transfer</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkBufferImageCopy
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBuffer.IN("srcBuffer", "the source buffer."),
        VkImage.IN("dstImage", "the destination image."),
        VkImageLayout.IN("dstImageLayout", "the layout of the destination image subresources for the copy."),
        AutoSize("pRegions")..uint32_t.IN("regionCount", "the number of regions to copy."),
        const..VkBufferImageCopy.p.IN("pRegions", "a pointer to an array of ##VkBufferImageCopy structures specifying the regions to copy.")
    )

    void(
        "CmdCopyImageToBuffer",
        """
        Copy image data into a buffer.

        <h5>C Specification</h5>
        To copy data from an image object to a buffer object, call:

        <code><pre>
￿void vkCmdCopyImageToBuffer(
￿    VkCommandBuffer                             commandBuffer,
￿    VkImage                                     srcImage,
￿    VkImageLayout                               srcImageLayout,
￿    VkBuffer                                    dstBuffer,
￿    uint32_t                                    regionCount,
￿    const VkBufferImageCopy*                    pRegions);</pre></code>

        <h5>Description</h5>
        Each region in {@code pRegions} is copied from the specified region of the source image to the specified region of the destination buffer.

        <h5>Valid Usage</h5>
        <ul>
            <li>The image region specified by a given element of {@code pRegions} <b>must</b> be a region that is contained within {@code srcImage}</li>
            <li>The buffer region specified by a given element of {@code pRegions} <b>must</b> be a region that is contained within {@code dstBuffer}</li>
            <li>The union of all source regions, and the union of all destination regions, specified by the elements of {@code pRegions}, <b>must</b> not overlap in memory</li>
            <li>{@code srcImage} <b>must</b> use a format that supports #FORMAT_FEATURE_TRANSFER_SRC_BIT_KHR, which is indicated by ##VkFormatProperties{@code ::linearTilingFeatures} (for linearly tiled images) or ##VkFormatProperties{@code ::optimalTilingFeatures} (for optimally tiled images) - as returned by #GetPhysicalDeviceFormatProperties()</li>
            <li>{@code srcImage} <b>must</b> have been created with #IMAGE_USAGE_TRANSFER_SRC_BIT usage flag</li>
            <li>If {@code srcImage} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code srcImage} <b>must</b> have a sample count equal to #SAMPLE_COUNT_1_BIT</li>
            <li>{@code srcImageLayout} <b>must</b> specify the layout of the image subresources of {@code srcImage} specified in {@code pRegions} at the time this command is executed on a {@code VkDevice}</li>
            <li>{@code srcImageLayout} <b>must</b> be #IMAGE_LAYOUT_SHARED_PRESENT_KHR, #IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL or #IMAGE_LAYOUT_GENERAL</li>
            <li>{@code dstBuffer} <b>must</b> have been created with #BUFFER_USAGE_TRANSFER_DST_BIT usage flag</li>
            <li>If {@code dstBuffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code srcImage} <b>must</b> be a valid {@code VkImage} handle</li>
            <li>{@code srcImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
            <li>{@code dstBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code pRegions} <b>must</b> be a pointer to an array of {@code regionCount} valid ##VkBufferImageCopy structures</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>{@code regionCount} <b>must</b> be greater than 0</li>
            <li>Each of {@code commandBuffer}, {@code dstBuffer}, and {@code srcImage} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Transfer graphics compute</td><td>Transfer</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkBufferImageCopy
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command will be recorded."),
        VkImage.IN("srcImage", "the source image."),
        VkImageLayout.IN("srcImageLayout", "the layout of the source image subresources for the copy."),
        VkBuffer.IN("dstBuffer", "the destination buffer."),
        AutoSize("pRegions")..uint32_t.IN("regionCount", "the number of regions to copy."),
        const..VkBufferImageCopy.p.IN("pRegions", "a pointer to an array of ##VkBufferImageCopy structures specifying the regions to copy.")
    )

    void(
        "CmdUpdateBuffer",
        """
        Update a buffer's contents from host memory.

        <h5>C Specification</h5>
        To update buffer data inline in a command buffer, call:

        <code><pre>
￿void vkCmdUpdateBuffer(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBuffer                                    dstBuffer,
￿    VkDeviceSize                                dstOffset,
￿    VkDeviceSize                                dataSize,
￿    const void*                                 pData);</pre></code>

        <h5>Description</h5>
        {@code dataSize} <b>must</b> be less than or equal to 65536 bytes. For larger updates, applications <b>can</b> use buffer to buffer <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#copies-buffers">copies</a>.

        The source data is copied from the user pointer to the command buffer when the command is called.

        #CmdUpdateBuffer() is only allowed outside of a render pass. This command is treated as "{@code transfer}" operation, for the purposes of synchronization barriers. The #BUFFER_USAGE_TRANSFER_DST_BIT <b>must</b> be specified in {@code usage} of ##VkBufferCreateInfo in order for the buffer to be compatible with #CmdUpdateBuffer().

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code dstOffset} <b>must</b> be less than the size of {@code dstBuffer}</li>
            <li>{@code dataSize} <b>must</b> be less than or equal to the size of {@code dstBuffer} minus {@code dstOffset}</li>
            <li>{@code dstBuffer} <b>must</b> have been created with #BUFFER_USAGE_TRANSFER_DST_BIT usage flag</li>
            <li>If {@code dstBuffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code dstOffset} <b>must</b> be a multiple of 4</li>
            <li>{@code dataSize} <b>must</b> be less than or equal to 65536</li>
            <li>{@code dataSize} <b>must</b> be a multiple of 4</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code dstBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code pData} <b>must</b> be a pointer to an array of {@code dataSize} bytes</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>{@code dataSize} <b>must</b> be greater than 0</li>
            <li>Both of {@code commandBuffer}, and {@code dstBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Transfer graphics compute</td><td>Transfer</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBuffer.IN("dstBuffer", "a handle to the buffer to be updated."),
        VkDeviceSize.IN("dstOffset", "the byte offset into the buffer to start updating, and <b>must</b> be a multiple of 4."),
        AutoSize("pData")..VkDeviceSize.IN("dataSize", "the number of bytes to update, and <b>must</b> be a multiple of 4."),
        const..void_p.IN("pData", "a pointer to the source data for the buffer update, and <b>must</b> be at least {@code dataSize} bytes in size.")
    )

    void(
        "CmdFillBuffer",
        """
        Fill a region of a buffer with a fixed value.

        <h5>C Specification</h5>
        To clear buffer data, call:

        <code><pre>
￿void vkCmdFillBuffer(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBuffer                                    dstBuffer,
￿    VkDeviceSize                                dstOffset,
￿    VkDeviceSize                                size,
￿    uint32_t                                    data);</pre></code>

        <h5>Description</h5>
        #CmdFillBuffer() is treated as "{@code transfer}" operation for the purposes of synchronization barriers. The #BUFFER_USAGE_TRANSFER_DST_BIT <b>must</b> be specified in {@code usage} of ##VkBufferCreateInfo in order for the buffer to be compatible with #CmdFillBuffer().

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code dstOffset} <b>must</b> be less than the size of {@code dstBuffer}</li>
            <li>{@code dstOffset} <b>must</b> be a multiple of 4</li>
            <li>If {@code size} is not equal to #WHOLE_SIZE, {@code size} <b>must</b> be greater than 0</li>
            <li>If {@code size} is not equal to #WHOLE_SIZE, {@code size} <b>must</b> be less than or equal to the size of {@code dstBuffer} minus {@code dstOffset}</li>
            <li>If {@code size} is not equal to #WHOLE_SIZE, {@code size} <b>must</b> be a multiple of 4</li>
            <li>{@code dstBuffer} <b>must</b> have been created with #BUFFER_USAGE_TRANSFER_DST_BIT usage flag</li>
            <li>If {@code dstBuffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code dstBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>Both of {@code commandBuffer}, and {@code dstBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Transfer graphics compute</td><td>Transfer</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBuffer.IN("dstBuffer", "the buffer to be filled."),
        VkDeviceSize.IN("dstOffset", "the byte offset into the buffer at which to start filling, and <b>must</b> be a multiple of 4."),
        VkDeviceSize.IN("size", "the number of bytes to fill, and <b>must</b> be either a multiple of 4, or #WHOLE_SIZE to fill the range from {@code offset} to the end of the buffer. If #WHOLE_SIZE is used and the remaining size of the buffer is not a multiple of 4, then the nearest smaller multiple is used."),
        uint32_t.IN("data", "the 4-byte word written repeatedly to the buffer to fill {@code size} bytes of data. The data word is written to memory according to the host endianness.")
    )

    void(
        "CmdClearColorImage",
        """
        Clear regions of a color image.

        <h5>C Specification</h5>
        To clear one or more subranges of a color image, call:

        <code><pre>
￿void vkCmdClearColorImage(
￿    VkCommandBuffer                             commandBuffer,
￿    VkImage                                     image,
￿    VkImageLayout                               imageLayout,
￿    const VkClearColorValue*                    pColor,
￿    uint32_t                                    rangeCount,
￿    const VkImageSubresourceRange*              pRanges);</pre></code>

        <h5>Description</h5>
        Each specified range in {@code pRanges} is cleared to the value specified by {@code pColor}.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code image} <b>must</b> use a format that supports #FORMAT_FEATURE_TRANSFER_DST_BIT_KHR, which is indicated by ##VkFormatProperties{@code ::linearTilingFeatures} (for linearly tiled images) or ##VkFormatProperties{@code ::optimalTilingFeatures} (for optimally tiled images) - as returned by #GetPhysicalDeviceFormatProperties()</li>
            <li>{@code image} <b>must</b> have been created with #IMAGE_USAGE_TRANSFER_DST_BIT usage flag</li>
            <li>If {@code image} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code imageLayout} <b>must</b> specify the layout of the image subresource ranges of {@code image} specified in {@code pRanges} at the time this command is executed on a {@code VkDevice}</li>
            <li>{@code imageLayout} <b>must</b> be #IMAGE_LAYOUT_SHARED_PRESENT_KHR, #IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL or #IMAGE_LAYOUT_GENERAL</li>
            <li>The image range of any given element of {@code pRanges} <b>must</b> be an image subresource range that is contained within {@code image}</li>
            <li>{@code image} <b>must</b> not have a compressed or depth/stencil format</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
            <li>{@code imageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
            <li>{@code pColor} <b>must</b> be a pointer to a valid ##VkClearColorValue union</li>
            <li>{@code pRanges} <b>must</b> be a pointer to an array of {@code rangeCount} valid ##VkImageSubresourceRange structures</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>{@code rangeCount} <b>must</b> be greater than 0</li>
            <li>Both of {@code commandBuffer}, and {@code image} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Graphics compute</td><td>Transfer</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkClearColorValue, ##VkImageSubresourceRange
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command will be recorded."),
        VkImage.IN("image", "the image to be cleared."),
        VkImageLayout.IN("imageLayout", "specifies the current layout of the image subresource ranges to be cleared, and <b>must</b> be #IMAGE_LAYOUT_SHARED_PRESENT_KHR, #IMAGE_LAYOUT_GENERAL or #IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL."),
        const..VkClearColorValue.p.IN("pColor", "a pointer to a ##VkClearColorValue structure that contains the values the image subresource ranges will be cleared to (see <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#clears-values\">the “Clear Values” section</a> below)."),
        AutoSize("pRanges")..uint32_t.IN("rangeCount", "the number of image subresource range structures in {@code pRanges}."),
        const..VkImageSubresourceRange.p.IN("pRanges", "points to an array of ##VkImageSubresourceRange structures that describe a range of mipmap levels, array layers, and aspects to be cleared, as described in <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#resources-image-views\">Image Views</a>. The {@code aspectMask} of all image subresource ranges <b>must</b> only include #IMAGE_ASPECT_COLOR_BIT.")
    )

    void(
        "CmdClearDepthStencilImage",
        """
        Fill regions of a combined depth/stencil image.

        <h5>C Specification</h5>
        To clear one or more subranges of a depth/stencil image, call:

        <code><pre>
￿void vkCmdClearDepthStencilImage(
￿    VkCommandBuffer                             commandBuffer,
￿    VkImage                                     image,
￿    VkImageLayout                               imageLayout,
￿    const VkClearDepthStencilValue*             pDepthStencil,
￿    uint32_t                                    rangeCount,
￿    const VkImageSubresourceRange*              pRanges);</pre></code>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code image} <b>must</b> use a format that supports #FORMAT_FEATURE_TRANSFER_DST_BIT_KHR, which is indicated by ##VkFormatProperties{@code ::linearTilingFeatures} (for linearly tiled images) or ##VkFormatProperties{@code ::optimalTilingFeatures} (for optimally tiled images) - as returned by #GetPhysicalDeviceFormatProperties()</li>
            <li>{@code image} <b>must</b> have been created with #IMAGE_USAGE_TRANSFER_DST_BIT usage flag</li>
            <li>If {@code image} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code imageLayout} <b>must</b> specify the layout of the image subresource ranges of {@code image} specified in {@code pRanges} at the time this command is executed on a {@code VkDevice}</li>
            <li>{@code imageLayout} <b>must</b> be either of #IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL or #IMAGE_LAYOUT_GENERAL</li>
            <li>The image range of any given element of {@code pRanges} <b>must</b> be an image subresource range that is contained within {@code image}</li>
            <li>{@code image} <b>must</b> have a depth/stencil format</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
            <li>{@code imageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
            <li>{@code pDepthStencil} <b>must</b> be a pointer to a valid ##VkClearDepthStencilValue structure</li>
            <li>{@code pRanges} <b>must</b> be a pointer to an array of {@code rangeCount} valid ##VkImageSubresourceRange structures</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>{@code rangeCount} <b>must</b> be greater than 0</li>
            <li>Both of {@code commandBuffer}, and {@code image} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Graphics</td><td>Transfer</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkClearDepthStencilValue, ##VkImageSubresourceRange
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command will be recorded."),
        VkImage.IN("image", "the image to be cleared."),
        VkImageLayout.IN("imageLayout", "specifies the current layout of the image subresource ranges to be cleared, and <b>must</b> be #IMAGE_LAYOUT_GENERAL or #IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL."),
        const..VkClearDepthStencilValue.p.IN("pDepthStencil", "a pointer to a ##VkClearDepthStencilValue structure that contains the values the depth and stencil image subresource ranges will be cleared to (see <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#clears-values\">the “Clear Values” section</a> below)."),
        AutoSize("pRanges")..uint32_t.IN("rangeCount", "the number of image subresource range structures in {@code pRanges}."),
        const..VkImageSubresourceRange.p.IN("pRanges", "points to an array of ##VkImageSubresourceRange structures that describe a range of mipmap levels, array layers, and aspects to be cleared, as described in <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#resources-image-views\">Image Views</a>. The {@code aspectMask} of each image subresource range in {@code pRanges} <b>can</b> include #IMAGE_ASPECT_DEPTH_BIT if the image format has a depth component, and #IMAGE_ASPECT_STENCIL_BIT if the image format has a stencil component. {@code pDepthStencil} is a pointer to a ##VkClearDepthStencilValue structure that contains the values the image subresource ranges will be cleared to (see <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#clears-values\">the “Clear Values” section</a> below).")
    )

    void(
        "CmdClearAttachments",
        """
        Clear regions within currently bound framebuffer attachments.

        <h5>C Specification</h5>
        To clear one or more regions of color and depth/stencil attachments inside a render pass instance, call:

        <code><pre>
￿void vkCmdClearAttachments(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    attachmentCount,
￿    const VkClearAttachment*                    pAttachments,
￿    uint32_t                                    rectCount,
￿    const VkClearRect*                          pRects);</pre></code>

        <h5>Description</h5>
        #CmdClearAttachments() <b>can</b> clear multiple regions of each attachment used in the current subpass of a render pass instance. This command <b>must</b> be called only inside a render pass instance, and implicitly selects the images to clear based on the current framebuffer attachments and the command parameters.

        <h5>Valid Usage</h5>
        <ul>
            <li>If the {@code aspectMask} member of any given element of {@code pAttachments} contains #IMAGE_ASPECT_COLOR_BIT, the {@code colorAttachment} member of those elements <b>must</b> refer to a valid color attachment in the current subpass</li>
            <li>The rectangular region specified by a given element of {@code pRects} <b>must</b> be contained within the render area of the current render pass instance</li>
            <li>The layers specified by a given element of {@code pRects} <b>must</b> be contained within every attachment that {@code pAttachments} refers to</li>
            <li>If the render pass instance this is recorded in uses multiview, then {@code baseArrayLayer} <b>must</b> be zero and {@code layerCount} <b>must</b> be one.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pAttachments} <b>must</b> be a pointer to an array of {@code attachmentCount} valid ##VkClearAttachment structures</li>
            <li>{@code pRects} <b>must</b> be a pointer to an array of {@code rectCount} ##VkClearRect structures</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called inside of a render pass instance</li>
            <li>{@code attachmentCount} <b>must</b> be greater than 0</li>
            <li>{@code rectCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Inside</td><td>Graphics</td><td>Graphics</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkClearAttachment, ##VkClearRect
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command will be recorded."),
        AutoSize("pAttachments")..uint32_t.IN("attachmentCount", "the number of entries in the {@code pAttachments} array."),
        const..VkClearAttachment.p.IN("pAttachments", "a pointer to an array of ##VkClearAttachment structures defining the attachments to clear and the clear values to use."),
        AutoSize("pRects")..uint32_t.IN("rectCount", "the number of entries in the {@code pRects} array."),
        const..VkClearRect.p.IN("pRects", "points to an array of ##VkClearRect structures defining regions within each selected attachment to clear.")
    )

    void(
        "CmdResolveImage",
        """
        Resolve regions of an image.

        <h5>C Specification</h5>
        To resolve a multisample image to a non-multisample image, call:

        <code><pre>
￿void vkCmdResolveImage(
￿    VkCommandBuffer                             commandBuffer,
￿    VkImage                                     srcImage,
￿    VkImageLayout                               srcImageLayout,
￿    VkImage                                     dstImage,
￿    VkImageLayout                               dstImageLayout,
￿    uint32_t                                    regionCount,
￿    const VkImageResolve*                       pRegions);</pre></code>

        <h5>Description</h5>
        During the resolve the samples corresponding to each pixel location in the source are converted to a single sample before being written to the destination. If the source formats are floating-point or normalized types, the sample values for each pixel are resolved in an implementation-dependent manner. If the source formats are integer types, a single sample's value is selected for each pixel.

        {@code srcOffset} and {@code dstOffset} select the initial x, y, and z offsets in texels of the sub-regions of the source and destination image data. {@code extent} is the size in texels of the source image to resolve in {@code width}, {@code height} and {@code depth}.

        Resolves are done layer by layer starting with {@code baseArrayLayer} member of {@code srcSubresource} for the source and {@code dstSubresource} for the destination. {@code layerCount} layers are resolved to the destination image.

        <h5>Valid Usage</h5>
        <ul>
            <li>The source region specified by a given element of {@code pRegions} <b>must</b> be a region that is contained within {@code srcImage}</li>
            <li>The destination region specified by a given element of {@code pRegions} <b>must</b> be a region that is contained within {@code dstImage}</li>
            <li>The union of all source regions, and the union of all destination regions, specified by the elements of {@code pRegions}, <b>must</b> not overlap in memory</li>
            <li>If {@code srcImage} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code srcImage} <b>must</b> have a sample count equal to any valid sample count value other than #SAMPLE_COUNT_1_BIT</li>
            <li>If {@code dstImage} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code dstImage} <b>must</b> have a sample count equal to #SAMPLE_COUNT_1_BIT</li>
            <li>{@code srcImageLayout} <b>must</b> specify the layout of the image subresources of {@code srcImage} specified in {@code pRegions} at the time this command is executed on a {@code VkDevice}</li>
            <li>{@code srcImageLayout} <b>must</b> be #IMAGE_LAYOUT_SHARED_PRESENT_KHR, #IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL or #IMAGE_LAYOUT_GENERAL</li>
            <li>{@code dstImageLayout} <b>must</b> specify the layout of the image subresources of {@code dstImage} specified in {@code pRegions} at the time this command is executed on a {@code VkDevice}</li>
            <li>{@code dstImageLayout} <b>must</b> be #IMAGE_LAYOUT_SHARED_PRESENT_KHR, #IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL or #IMAGE_LAYOUT_GENERAL</li>
            <li>If {@code dstImage} was created with {@code tiling} equal to #IMAGE_TILING_LINEAR, {@code dstImage} <b>must</b> have been created with a {@code format} that supports being a color attachment, as specified by the #FORMAT_FEATURE_COLOR_ATTACHMENT_BIT flag in ##VkFormatProperties{@code ::linearTilingFeatures} returned by #GetPhysicalDeviceFormatProperties()</li>
            <li>If {@code dstImage} was created with {@code tiling} equal to #IMAGE_TILING_OPTIMAL, {@code dstImage} <b>must</b> have been created with a {@code format} that supports being a color attachment, as specified by the #FORMAT_FEATURE_COLOR_ATTACHMENT_BIT flag in ##VkFormatProperties{@code ::optimalTilingFeatures} returned by #GetPhysicalDeviceFormatProperties()</li>
            <li>{@code srcImage} and {@code dstImage} <b>must</b> have been created with the same image format</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code srcImage} <b>must</b> be a valid {@code VkImage} handle</li>
            <li>{@code srcImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
            <li>{@code dstImage} <b>must</b> be a valid {@code VkImage} handle</li>
            <li>{@code dstImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
            <li>{@code pRegions} <b>must</b> be a pointer to an array of {@code regionCount} valid ##VkImageResolve structures</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>{@code regionCount} <b>must</b> be greater than 0</li>
            <li>Each of {@code commandBuffer}, {@code dstImage}, and {@code srcImage} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Graphics</td><td>Transfer</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkImageResolve
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command will be recorded."),
        VkImage.IN("srcImage", "the source image."),
        VkImageLayout.IN("srcImageLayout", "the layout of the source image subresources for the resolve."),
        VkImage.IN("dstImage", "the destination image."),
        VkImageLayout.IN("dstImageLayout", "the layout of the destination image subresources for the resolve."),
        AutoSize("pRegions")..uint32_t.IN("regionCount", "the number of regions to resolve."),
        const..VkImageResolve.p.IN("pRegions", "a pointer to an array of ##VkImageResolve structures specifying the regions to resolve.")
    )

    void(
        "CmdSetEvent",
        """
        Set an event object to signaled state.

        <h5>C Specification</h5>
        To set the state of an event to signaled from a device, call:

        <code><pre>
￿void vkCmdSetEvent(
￿    VkCommandBuffer                             commandBuffer,
￿    VkEvent                                     event,
￿    VkPipelineStageFlags                        stageMask);</pre></code>

        <h5>Description</h5>
        When #CmdSetEvent() is submitted to a queue, it defines an execution dependency on commands that were submitted before it, and defines an event signal operation which sets the event to the signaled state.

        The first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a> includes every command previously submitted to the same queue, including those in the same command buffer and batch. The synchronization scope is limited to operations on the pipeline stages determined by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-masks">source stage mask</a> specified by {@code stageMask}.

        The second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a> includes only the event signal operation.

        If {@code event} is already in the signaled state when #CmdSetEvent() is executed on the device, then #CmdSetEvent() has no effect, no event signal operation occurs, and no execution dependency is generated.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code stageMask} <b>must</b> not include #PIPELINE_STAGE_HOST_BIT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-geometryShader">geometry shaders</a> feature is not enabled, {@code stageMask} <b>must</b> not contain #PIPELINE_STAGE_GEOMETRY_SHADER_BIT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-tessellationShader">tessellation shaders</a> feature is not enabled, {@code stageMask} <b>must</b> not contain #PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT or #PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT</li>
            <li>{@code commandBuffer}&#8217;s current device mask <b>must</b> include exactly one physical device.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code event} <b>must</b> be a valid {@code VkEvent} handle</li>
            <li>{@code stageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits} values</li>
            <li>{@code stageMask} <b>must</b> not be 0</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>Both of {@code commandBuffer}, and {@code event} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Graphics compute</td><td></td></tr></tbody>
        </table>
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command is recorded."),
        VkEvent.IN("event", "the event that will be signaled."),
        VkPipelineStageFlags.IN("stageMask", "specifies the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#synchronization-pipeline-stages\">source stage mask</a> used to determine when the {@code event} is signaled.")
    )

    void(
        "CmdResetEvent",
        """
        Reset an event object to non-signaled state.

        <h5>C Specification</h5>
        To set the state of an event to unsignaled from a device, call:

        <code><pre>
￿void vkCmdResetEvent(
￿    VkCommandBuffer                             commandBuffer,
￿    VkEvent                                     event,
￿    VkPipelineStageFlags                        stageMask);</pre></code>

        <h5>Description</h5>
        When #CmdResetEvent() is submitted to a queue, it defines an execution dependency on commands that were submitted before it, and defines an event unsignal operation which resets the event to the unsignaled state.

        The first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a> includes every command previously submitted to the same queue, including those in the same command buffer and batch. The synchronization scope is limited to operations on the pipeline stages determined by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-masks">source stage mask</a> specified by {@code stageMask}.

        The second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a> includes only the event unsignal operation.

        If {@code event} is already in the unsignaled state when #CmdResetEvent() is executed on the device, then #CmdResetEvent() has no effect, no event unsignal operation occurs, and no execution dependency is generated.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code stageMask} <b>must</b> not include #PIPELINE_STAGE_HOST_BIT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-geometryShader">geometry shaders</a> feature is not enabled, {@code stageMask} <b>must</b> not contain #PIPELINE_STAGE_GEOMETRY_SHADER_BIT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-tessellationShader">tessellation shaders</a> feature is not enabled, {@code stageMask} <b>must</b> not contain #PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT or #PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT</li>
            <li>When this command executes, {@code event} <b>must</b> not be waited on by a #CmdWaitEvents() command that is currently executing</li>
            <li>{@code commandBuffer}&#8217;s current device mask <b>must</b> include exactly one physical device.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code event} <b>must</b> be a valid {@code VkEvent} handle</li>
            <li>{@code stageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits} values</li>
            <li>{@code stageMask} <b>must</b> not be 0</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>Both of {@code commandBuffer}, and {@code event} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Graphics compute</td><td></td></tr></tbody>
        </table>
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command is recorded."),
        VkEvent.IN("event", "the event that will be unsignaled."),
        VkPipelineStageFlags.IN("stageMask", "a bitmask of {@code VkPipelineStageFlagBits} specifying the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#synchronization-pipeline-stages\">source stage mask</a> used to determine when the {@code event} is unsignaled.")
    )

    void(
        "CmdWaitEvents",
        """
        Wait for one or more events and insert a set of memory.

        <h5>C Specification</h5>
        To wait for one or more events to enter the signaled state on a device, call:

        <code><pre>
￿void vkCmdWaitEvents(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    eventCount,
￿    const VkEvent*                              pEvents,
￿    VkPipelineStageFlags                        srcStageMask,
￿    VkPipelineStageFlags                        dstStageMask,
￿    uint32_t                                    memoryBarrierCount,
￿    const VkMemoryBarrier*                      pMemoryBarriers,
￿    uint32_t                                    bufferMemoryBarrierCount,
￿    const VkBufferMemoryBarrier*                pBufferMemoryBarriers,
￿    uint32_t                                    imageMemoryBarrierCount,
￿    const VkImageMemoryBarrier*                 pImageMemoryBarriers);</pre></code>

        <h5>Description</h5>
        When #CmdWaitEvents() is submitted to a queue, it defines a memory dependency between prior event signal operations, and subsequent commands.

        The first synchronization scope only includes event signal operations that operate on members of {@code pEvents}, and the operations that happened-before the event signal operations. Event signal operations performed by #CmdSetEvent() that were previously submitted to the same queue are included in the first synchronization scope, if the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-order">logically latest</a> pipeline stage in their {@code stageMask} parameter is <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-order">logically earlier</a> than or equal to the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-order">logically latest</a> pipeline stage in {@code srcStageMask}. Event signal operations performed by #SetEvent() are only included in the first synchronization scope if #PIPELINE_STAGE_HOST_BIT is included in {@code srcStageMask}.

        The second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a> includes commands subsequently submitted to the same queue, including those in the same command buffer and batch. The second synchronization scope is limited to operations on the pipeline stages determined by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-masks">destination stage mask</a> specified by {@code dstStageMask}.

        The first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-dependencies-access-scopes">access scope</a> is limited to access in the pipeline stages determined by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-masks">source stage mask</a> specified by {@code srcStageMask}. Within that, the first access scope only includes the first access scopes defined by elements of the {@code pMemoryBarriers}, {@code pBufferMemoryBarriers} and {@code pImageMemoryBarriers} arrays, which each define a set of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-memory-barriers">memory barriers</a>. If no memory barriers are specified, then the first access scope includes no accesses.

        The second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-dependencies-access-scopes">access scope</a> is limited to access in the pipeline stages determined by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-masks">destination stage mask</a> specified by {@code dstStageMask}. Within that, the second access scope only includes the second access scopes defined by elements of the {@code pMemoryBarriers}, {@code pBufferMemoryBarriers} and {@code pImageMemoryBarriers} arrays, which each define a set of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-memory-barriers">memory barriers</a>. If no memory barriers are specified, then the second access scope includes no accesses.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        #CmdWaitEvents() is used with #CmdSetEvent() to define a memory dependency between two sets of action commands, roughly in the same way as pipeline barriers, but split into two commands such that work between the two <b>may</b> execute unhindered.
        </div>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Applications <b>should</b> be careful to avoid race conditions when using events. There is no direct ordering guarantee between a #CmdResetEvent() command and a #CmdWaitEvents() command submitted after it, so some other execution dependency <b>must</b> be included between these commands (e.g. a semaphore).
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code srcStageMask} <b>must</b> be the bitwise OR of the {@code stageMask} parameter used in previous calls to #CmdSetEvent() with any of the members of {@code pEvents} and #PIPELINE_STAGE_HOST_BIT if any of the members of {@code pEvents} was set using #SetEvent()</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-geometryShader">geometry shaders</a> feature is not enabled, {@code srcStageMask} <b>must</b> not contain #PIPELINE_STAGE_GEOMETRY_SHADER_BIT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-geometryShader">geometry shaders</a> feature is not enabled, {@code dstStageMask} <b>must</b> not contain #PIPELINE_STAGE_GEOMETRY_SHADER_BIT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-tessellationShader">tessellation shaders</a> feature is not enabled, {@code srcStageMask} <b>must</b> not contain #PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT or #PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-tessellationShader">tessellation shaders</a> feature is not enabled, {@code dstStageMask} <b>must</b> not contain #PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT or #PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT</li>
            <li>If {@code pEvents} includes one or more events that will be signaled by #SetEvent() after {@code commandBuffer} has been submitted to a queue, then #CmdWaitEvents() <b>must</b> not be called inside a render pass instance</li>
            <li>Any pipeline stage included in {@code srcStageMask} or {@code dstStageMask} <b>must</b> be supported by the capabilities of the queue family specified by the {@code queueFamilyIndex} member of the ##VkCommandPoolCreateInfo structure that was used to create the {@code VkCommandPool} that {@code commandBuffer} was allocated from, as specified in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-supported">table of supported pipeline stages</a>.</li>
            <li>Any given element of {@code pMemoryBarriers}, {@code pBufferMemoryBarriers} or {@code pImageMemoryBarriers} <b>must</b> not have any access flag included in its {@code srcAccessMask} member if that bit is not supported by any of the pipeline stages in {@code srcStageMask}, as specified in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-access-types-supported">table of supported access types</a>.</li>
            <li>Any given element of {@code pMemoryBarriers}, {@code pBufferMemoryBarriers} or {@code pImageMemoryBarriers} <b>must</b> not have any access flag included in its {@code dstAccessMask} member if that bit is not supported by any of the pipeline stages in {@code dstStageMask}, as specified in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-access-types-supported">table of supported access types</a>.</li>
            <li>{@code commandBuffer}&#8217;s current device mask <b>must</b> include exactly one physical device.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pEvents} <b>must</b> be a pointer to an array of {@code eventCount} valid {@code VkEvent} handles</li>
            <li>{@code srcStageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits} values</li>
            <li>{@code srcStageMask} <b>must</b> not be 0</li>
            <li>{@code dstStageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits} values</li>
            <li>{@code dstStageMask} <b>must</b> not be 0</li>
            <li>If {@code memoryBarrierCount} is not 0, {@code pMemoryBarriers} <b>must</b> be a pointer to an array of {@code memoryBarrierCount} valid ##VkMemoryBarrier structures</li>
            <li>If {@code bufferMemoryBarrierCount} is not 0, {@code pBufferMemoryBarriers} <b>must</b> be a pointer to an array of {@code bufferMemoryBarrierCount} valid ##VkBufferMemoryBarrier structures</li>
            <li>If {@code imageMemoryBarrierCount} is not 0, {@code pImageMemoryBarriers} <b>must</b> be a pointer to an array of {@code imageMemoryBarrierCount} valid ##VkImageMemoryBarrier structures</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
            <li>{@code eventCount} <b>must</b> be greater than 0</li>
            <li>Both of {@code commandBuffer}, and the elements of {@code pEvents} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics compute</td><td></td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkBufferMemoryBarrier, ##VkImageMemoryBarrier, ##VkMemoryBarrier
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command is recorded."),
        AutoSize("pEvents")..uint32_t.IN("eventCount", "the length of the {@code pEvents} array."),
        const..VkEvent.p.IN("pEvents", "an array of event object handles to wait on."),
        VkPipelineStageFlags.IN("srcStageMask", "a bitmask of {@code VkPipelineStageFlagBits} specifying the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#synchronization-pipeline-stages\">source stage mask</a>."),
        VkPipelineStageFlags.IN("dstStageMask", "a bitmask of {@code VkPipelineStageFlagBits} specifying the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#synchronization-pipeline-stages\">destination stage mask</a>."),
        AutoSize("pMemoryBarriers")..uint32_t.IN("memoryBarrierCount", "the length of the {@code pMemoryBarriers} array."),
        nullable..const..VkMemoryBarrier.p.IN("pMemoryBarriers", "a pointer to an array of ##VkMemoryBarrier structures."),
        AutoSize("pBufferMemoryBarriers")..uint32_t.IN("bufferMemoryBarrierCount", "the length of the {@code pBufferMemoryBarriers} array."),
        nullable..const..VkBufferMemoryBarrier.p.IN("pBufferMemoryBarriers", "a pointer to an array of ##VkBufferMemoryBarrier structures."),
        AutoSize("pImageMemoryBarriers")..uint32_t.IN("imageMemoryBarrierCount", "the length of the {@code pImageMemoryBarriers} array."),
        nullable..const..VkImageMemoryBarrier.p.IN("pImageMemoryBarriers", "a pointer to an array of ##VkImageMemoryBarrier structures.")
    )

    void(
        "CmdPipelineBarrier",
        """
        Insert a memory dependency.

        <h5>C Specification</h5>
        To record a pipeline barrier, call:

        <code><pre>
￿void vkCmdPipelineBarrier(
￿    VkCommandBuffer                             commandBuffer,
￿    VkPipelineStageFlags                        srcStageMask,
￿    VkPipelineStageFlags                        dstStageMask,
￿    VkDependencyFlags                           dependencyFlags,
￿    uint32_t                                    memoryBarrierCount,
￿    const VkMemoryBarrier*                      pMemoryBarriers,
￿    uint32_t                                    bufferMemoryBarrierCount,
￿    const VkBufferMemoryBarrier*                pBufferMemoryBarriers,
￿    uint32_t                                    imageMemoryBarrierCount,
￿    const VkImageMemoryBarrier*                 pImageMemoryBarriers);</pre></code>

        <h5>Description</h5>
        When #CmdPipelineBarrier() is submitted to a queue, it defines a memory dependency between commands that were submitted before it, and those submitted after it.

        If #CmdPipelineBarrier() was recorded outside a render pass instance, the first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a> includes every command submitted to the same queue before it, including those in the same command buffer and batch. If #CmdPipelineBarrier() was recorded inside a render pass instance, the first synchronization scope includes only commands submitted before it within the same subpass. In either case, the first synchronization scope is limited to operations on the pipeline stages determined by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-masks">source stage mask</a> specified by {@code srcStageMask}.

        If #CmdPipelineBarrier() was recorded outside a render pass instance, the second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a> includes every command submitted to the same queue after it, including those in the same command buffer and batch. If #CmdPipelineBarrier() was recorded inside a render pass instance, the second synchronization scope includes only commands submitted after it within the same subpass. In either case, the second synchronization scope is limited to operations on the pipeline stages determined by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-masks">destination stage mask</a> specified by {@code dstStageMask}.

        The first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-dependencies-access-scopes">access scope</a> is limited to access in the pipeline stages determined by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-masks">source stage mask</a> specified by {@code srcStageMask}. Within that, the first access scope only includes the first access scopes defined by elements of the {@code pMemoryBarriers}, {@code pBufferMemoryBarriers} and {@code pImageMemoryBarriers} arrays, which each define a set of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-memory-barriers">memory barriers</a>. If no memory barriers are specified, then the first access scope includes no accesses.

        The second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-dependencies-access-scopes">access scope</a> is limited to access in the pipeline stages determined by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-masks">destination stage mask</a> specified by {@code dstStageMask}. Within that, the second access scope only includes the second access scopes defined by elements of the {@code pMemoryBarriers}, {@code pBufferMemoryBarriers} and {@code pImageMemoryBarriers} arrays, which each define a set of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-memory-barriers">memory barriers</a>. If no memory barriers are specified, then the second access scope includes no accesses.

        If {@code dependencyFlags} includes #DEPENDENCY_BY_REGION_BIT, then any dependency between <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-framebuffer-regions">framebuffer-space</a> pipeline stages is <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-framebuffer-regions">framebuffer-local</a> - otherwise it is <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-framebuffer-regions">framebuffer-global</a>.

        <h5>Valid Usage</h5>
        <ul>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-geometryShader">geometry shaders</a> feature is not enabled, {@code srcStageMask} <b>must</b> not contain #PIPELINE_STAGE_GEOMETRY_SHADER_BIT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-geometryShader">geometry shaders</a> feature is not enabled, {@code dstStageMask} <b>must</b> not contain #PIPELINE_STAGE_GEOMETRY_SHADER_BIT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-tessellationShader">tessellation shaders</a> feature is not enabled, {@code srcStageMask} <b>must</b> not contain #PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT or #PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-tessellationShader">tessellation shaders</a> feature is not enabled, {@code dstStageMask} <b>must</b> not contain #PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT or #PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT</li>
            <li>If #CmdPipelineBarrier() is called within a render pass instance, the render pass <b>must</b> have been created with a ##VkSubpassDependency instance in {@code pDependencies} that expresses a dependency from the current subpass to itself.</li>
            <li>If #CmdPipelineBarrier() is called within a render pass instance, {@code srcStageMask} <b>must</b> contain a subset of the bit values in the {@code srcStageMask} member of that instance of ##VkSubpassDependency</li>
            <li>If #CmdPipelineBarrier() is called within a render pass instance, {@code dstStageMask} <b>must</b> contain a subset of the bit values in the {@code dstStageMask} member of that instance of ##VkSubpassDependency</li>
            <li>If #CmdPipelineBarrier() is called within a render pass instance, the {@code srcAccessMask} of any element of {@code pMemoryBarriers} or {@code pImageMemoryBarriers} <b>must</b> contain a subset of the bit values the {@code srcAccessMask} member of that instance of ##VkSubpassDependency</li>
            <li>If #CmdPipelineBarrier() is called within a render pass instance, the {@code dstAccessMask} of any element of {@code pMemoryBarriers} or {@code pImageMemoryBarriers} <b>must</b> contain a subset of the bit values the {@code dstAccessMask} member of that instance of ##VkSubpassDependency</li>
            <li>If #CmdPipelineBarrier() is called within a render pass instance, {@code dependencyFlags} <b>must</b> be equal to the {@code dependencyFlags} member of that instance of ##VkSubpassDependency</li>
            <li>If #CmdPipelineBarrier() is called within a render pass instance, {@code bufferMemoryBarrierCount} <b>must</b> be 0</li>
            <li>If #CmdPipelineBarrier() is called within a render pass instance, the {@code image} member of any element of {@code pImageMemoryBarriers} <b>must</b> be equal to one of the elements of {@code pAttachments} that the current {@code framebuffer} was created with, that is also referred to by one of the elements of the {@code pColorAttachments}, {@code pResolveAttachments} or {@code pDepthStencilAttachment} members of the ##VkSubpassDescription instance that the current subpass was created with</li>
            <li>If #CmdPipelineBarrier() is called within a render pass instance, the {@code oldLayout} and {@code newLayout} members of any element of {@code pImageMemoryBarriers} <b>must</b> be equal to the {@code layout} member of an element of the {@code pColorAttachments}, {@code pResolveAttachments} or {@code pDepthStencilAttachment} members of the ##VkSubpassDescription instance that the current subpass was created with, that refers to the same {@code image}</li>
            <li>If #CmdPipelineBarrier() is called within a render pass instance, the {@code oldLayout} and {@code newLayout} members of an element of {@code pImageMemoryBarriers} <b>must</b> be equal</li>
            <li>If #CmdPipelineBarrier() is called within a render pass instance, the {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} members of any element of {@code pImageMemoryBarriers} <b>must</b> be #QUEUE_FAMILY_IGNORED</li>
            <li>Any pipeline stage included in {@code srcStageMask} or {@code dstStageMask} <b>must</b> be supported by the capabilities of the queue family specified by the {@code queueFamilyIndex} member of the ##VkCommandPoolCreateInfo structure that was used to create the {@code VkCommandPool} that {@code commandBuffer} was allocated from, as specified in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-supported">table of supported pipeline stages</a>.</li>
            <li>Any given element of {@code pMemoryBarriers}, {@code pBufferMemoryBarriers} or {@code pImageMemoryBarriers} <b>must</b> not have any access flag included in its {@code srcAccessMask} member if that bit is not supported by any of the pipeline stages in {@code srcStageMask}, as specified in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-access-types-supported">table of supported access types</a>.</li>
            <li>Any given element of {@code pMemoryBarriers}, {@code pBufferMemoryBarriers} or {@code pImageMemoryBarriers} <b>must</b> not have any access flag included in its {@code dstAccessMask} member if that bit is not supported by any of the pipeline stages in {@code dstStageMask}, as specified in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-access-types-supported">table of supported access types</a>.</li>
            <li>If #CmdPipelineBarrier() is called outside of a render pass instance, {@code dependencyFlags} <b>must</b> not include #DEPENDENCY_VIEW_LOCAL_BIT_KHX</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code srcStageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits} values</li>
            <li>{@code srcStageMask} <b>must</b> not be 0</li>
            <li>{@code dstStageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits} values</li>
            <li>{@code dstStageMask} <b>must</b> not be 0</li>
            <li>{@code dependencyFlags} <b>must</b> be a valid combination of {@code VkDependencyFlagBits} values</li>
            <li>If {@code memoryBarrierCount} is not 0, {@code pMemoryBarriers} <b>must</b> be a pointer to an array of {@code memoryBarrierCount} valid ##VkMemoryBarrier structures</li>
            <li>If {@code bufferMemoryBarrierCount} is not 0, {@code pBufferMemoryBarriers} <b>must</b> be a pointer to an array of {@code bufferMemoryBarrierCount} valid ##VkBufferMemoryBarrier structures</li>
            <li>If {@code imageMemoryBarrierCount} is not 0, {@code pImageMemoryBarriers} <b>must</b> be a pointer to an array of {@code imageMemoryBarrierCount} valid ##VkImageMemoryBarrier structures</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Transfer graphics compute</td><td></td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkBufferMemoryBarrier, ##VkImageMemoryBarrier, ##VkMemoryBarrier
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command is recorded."),
        VkPipelineStageFlags.IN("srcStageMask", "a bitmask of {@code VkPipelineStageFlagBits} specifying the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#synchronization-pipeline-stages-masks\">source stage mask</a>."),
        VkPipelineStageFlags.IN("dstStageMask", "a bitmask of {@code VkPipelineStageFlagBits} specifying the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#synchronization-pipeline-stages-masks\">destination stage mask</a>."),
        VkDependencyFlags.IN("dependencyFlags", "a bitmask of {@code VkDependencyFlagBits} specifying how execution and memory dependencies are formed."),
        AutoSize("pMemoryBarriers")..uint32_t.IN("memoryBarrierCount", "the length of the {@code pMemoryBarriers} array."),
        nullable..const..VkMemoryBarrier.p.IN("pMemoryBarriers", "a pointer to an array of ##VkMemoryBarrier structures."),
        AutoSize("pBufferMemoryBarriers")..uint32_t.IN("bufferMemoryBarrierCount", "the length of the {@code pBufferMemoryBarriers} array."),
        nullable..const..VkBufferMemoryBarrier.p.IN("pBufferMemoryBarriers", "a pointer to an array of ##VkBufferMemoryBarrier structures."),
        AutoSize("pImageMemoryBarriers")..uint32_t.IN("imageMemoryBarrierCount", "the length of the {@code pImageMemoryBarriers} array."),
        nullable..const..VkImageMemoryBarrier.p.IN("pImageMemoryBarriers", "a pointer to an array of ##VkImageMemoryBarrier structures.")
    )

    void(
        "CmdBeginQuery",
        """
        Begin a query.

        <h5>C Specification</h5>
        To begin a query, call:

        <code><pre>
￿void vkCmdBeginQuery(
￿    VkCommandBuffer                             commandBuffer,
￿    VkQueryPool                                 queryPool,
￿    uint32_t                                    query,
￿    VkQueryControlFlags                         flags);</pre></code>

        <h5>Description</h5>
        If the {@code queryType} of the pool is #QUERY_TYPE_OCCLUSION and {@code flags} contains #QUERY_CONTROL_PRECISE_BIT, an implementation <b>must</b> return a result that matches the actual number of samples passed. This is described in more detail in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#queries-occlusion">Occlusion Queries</a>.

        After beginning a query, that query is considered <em>active</em> within the command buffer it was called in until that same query is ended. Queries active in a primary command buffer when secondary command buffers are executed are considered active for those secondary command buffers.

        <h5>Valid Usage</h5>
        <ul>
            <li>The query identified by {@code queryPool} and {@code query} <b>must</b> currently not be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#queries-operation-active">active</a></li>
            <li>The query identified by {@code queryPool} and {@code query} <b>must</b> be unavailable</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-occlusionQueryPrecise">precise occlusion queries</a> feature is not enabled, or the {@code queryType} used to create {@code queryPool} was not #QUERY_TYPE_OCCLUSION, {@code flags} <b>must</b> not contain #QUERY_CONTROL_PRECISE_BIT</li>
            <li>{@code queryPool} <b>must</b> have been created with a {@code queryType} that differs from that of any other queries that have been made <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#queries-operation-active">active</a>, and are currently still active within {@code commandBuffer}</li>
            <li>{@code query} <b>must</b> be less than the number of queries in {@code queryPool}</li>
            <li>If the {@code queryType} used to create {@code queryPool} was #QUERY_TYPE_OCCLUSION, the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>If the {@code queryType} used to create {@code queryPool} was #QUERY_TYPE_PIPELINE_STATISTICS and any of the {@code pipelineStatistics} indicate graphics operations, the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>If the {@code queryType} used to create {@code queryPool} was #QUERY_TYPE_PIPELINE_STATISTICS and any of the {@code pipelineStatistics} indicate compute operations, the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
            <li>All queries used by the command <b>must</b> not be active</li>
            <li>All queries used by the command <b>must</b> be unavailable</li>
            <li>If #CmdBeginQuery() is called within a render pass instance, the sum of {@code query} and the number of bits set in the current subpass&#8217;s view mask <b>must</b> be less than or equal to the number of queries in {@code queryPool}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkQueryControlFlagBits} values</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
            <li>Both of {@code commandBuffer}, and {@code queryPool} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics compute</td><td></td></tr></tbody>
        </table>
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer into which this command will be recorded."),
        VkQueryPool.IN("queryPool", "the query pool that will manage the results of the query."),
        uint32_t.IN("query", "the query index within the query pool that will contain the results."),
        VkQueryControlFlags.IN("flags", "a bitmask of {@code VkQueryControlFlagBits} specifying constraints on the types of queries that <b>can</b> be performed.")
    )

    void(
        "CmdEndQuery",
        """
        Ends a query.

        <h5>C Specification</h5>
        To end a query after the set of desired draw or dispatch commands is executed, call:

        <code><pre>
￿void vkCmdEndQuery(
￿    VkCommandBuffer                             commandBuffer,
￿    VkQueryPool                                 queryPool,
￿    uint32_t                                    query);</pre></code>

        <h5>Description</h5>
        As queries operate asynchronously, ending a query does not immediately set the query's status to available. A query is considered <em>finished</em> when the final results of the query are ready to be retrieved by #GetQueryPoolResults() and #CmdCopyQueryPoolResults(), and this is when the query's status is set to available.

        Once a query is ended the query <b>must</b> finish in finite time, unless the state of the query is changed using other commands, e.g. by issuing a reset of the query.

        <h5>Valid Usage</h5>
        <ul>
            <li>The query identified by {@code queryPool} and {@code query} <b>must</b> currently be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#queries-operation-active">active</a></li>
            <li>{@code query} <b>must</b> be less than the number of queries in {@code queryPool}</li>
            <li>All queries used by the command <b>must</b> be active</li>
            <li>If #CmdEndQuery() is called within a render pass instance, the sum of {@code query} and the number of bits set in the current subpass&#8217;s view mask <b>must</b> be less than or equal to the number of queries in {@code queryPool}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
            <li>Both of {@code commandBuffer}, and {@code queryPool} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics compute</td><td></td></tr></tbody>
        </table>
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer into which this command will be recorded."),
        VkQueryPool.IN("queryPool", "the query pool that is managing the results of the query."),
        uint32_t.IN("query", "the query index within the query pool where the result is stored.")
    )

    void(
        "CmdResetQueryPool",
        """
        Reset queries in a query pool.

        <h5>C Specification</h5>
        To reset a range of queries in a query pool, call:

        <code><pre>
￿void vkCmdResetQueryPool(
￿    VkCommandBuffer                             commandBuffer,
￿    VkQueryPool                                 queryPool,
￿    uint32_t                                    firstQuery,
￿    uint32_t                                    queryCount);</pre></code>

        <h5>Description</h5>
        When executed on a queue, this command sets the status of query indices <code>[firstQuery, firstQuery {plus} queryCount - 1]</code> to unavailable.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code firstQuery} <b>must</b> be less than the number of queries in {@code queryPool}</li>
            <li>The sum of {@code firstQuery} and {@code queryCount} <b>must</b> be less than or equal to the number of queries in {@code queryPool}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>Both of {@code commandBuffer}, and {@code queryPool} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Graphics compute</td><td></td></tr></tbody>
        </table>
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer into which this command will be recorded."),
        VkQueryPool.IN("queryPool", "the handle of the query pool managing the queries being reset."),
        uint32_t.IN("firstQuery", "the initial query index to reset."),
        uint32_t.IN("queryCount", "the number of queries to reset.")
    )

    void(
        "CmdWriteTimestamp",
        """
        Write a device timestamp into a query object.

        <h5>C Specification</h5>
        To request a timestamp, call:

        <code><pre>
￿void vkCmdWriteTimestamp(
￿    VkCommandBuffer                             commandBuffer,
￿    VkPipelineStageFlagBits                     pipelineStage,
￿    VkQueryPool                                 queryPool,
￿    uint32_t                                    query);</pre></code>

        <h5>Description</h5>
        #CmdWriteTimestamp() latches the value of the timer when all previous commands have completed executing as far as the specified pipeline stage, and writes the timestamp value to memory. When the timestamp value is written, the availability status of the query is set to available.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        If an implementation is unable to detect completion and latch the timer at any specific stage of the pipeline, it <b>may</b> instead do so at any logically later stage.
        </div>

        #CmdCopyQueryPoolResults() <b>can</b> then be called to copy the timestamp value from the query pool into buffer memory, with ordering and synchronization behavior equivalent to how other queries operate. Timestamp values <b>can</b> also be retrieved from the query pool using #GetQueryPoolResults(). As with other queries, the query <b>must</b> be reset using #CmdResetQueryPool() before requesting the timestamp value be written to it.

        While #CmdWriteTimestamp() <b>can</b> be called inside or outside of a render pass instance, #CmdCopyQueryPoolResults() <b>must</b> only be called outside of a render pass instance.

        If #CmdWriteTimestamp() is called while executing a render pass instance that has multiview enabled, the timestamp uses <code>N</code> consecutive query indices in the query pool (starting at {@code query}) where <code>N</code> is the number of bits set in the view mask of the subpass the command is executed in. The resulting query values are determined by an implementation-dependent choice of one of the following behaviors:

        <ul>
            <li>The first query is a timestamp value and (if more than one bit is set in the view mask) zero is written to the remaining queries. If two timestamps are written in the same subpass, the sum of the execution time of all views between those commands is the difference between the first query written by each command.</li>
            <li>All <code>N</code> queries are timestamp values. If two timestamps are written in the same subpass, the sum of the execution time of all views between those commands is the sum of the difference between corresponding queries written by each command. The difference between corresponding queries <b>may</b> be the execution time of a single view.</li>
        </ul>

        In either case, the application <b>can</b> sum the differences between all <code>N</code> queries to determine the total execution time.

        <h5>Valid Usage</h5>
        <ul>
            <li>The query identified by {@code queryPool} and {@code query} <b>must</b> be <em>unavailable</em></li>
            <li>The command pool&#8217;s queue family <b>must</b> support a non-zero {@code timestampValidBits}</li>
            <li>All queries used by the command <b>must</b> be unavailable</li>
            <li>If #CmdWriteTimestamp() is called within a render pass instance, the sum of {@code query} and the number of bits set in the current subpass&#8217;s view mask <b>must</b> be less than or equal to the number of queries in {@code queryPool}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pipelineStage} <b>must</b> be a valid {@code VkPipelineStageFlagBits} value</li>
            <li>{@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
            <li>Both of {@code commandBuffer}, and {@code queryPool} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics compute</td><td>Transfer</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command will be recorded."),
        VkPipelineStageFlagBits.IN("pipelineStage", "one of the {@code VkPipelineStageFlagBits}, specifying a stage of the pipeline."),
        VkQueryPool.IN("queryPool", "the query pool that will manage the timestamp."),
        uint32_t.IN("query", "the query within the query pool that will contain the timestamp.")
    )

    void(
        "CmdCopyQueryPoolResults",
        """
        Copy the results of queries in a query pool to a buffer object.

        <h5>C Specification</h5>
        To copy query statuses and numerical results directly to buffer memory, call:

        <code><pre>
￿void vkCmdCopyQueryPoolResults(
￿    VkCommandBuffer                             commandBuffer,
￿    VkQueryPool                                 queryPool,
￿    uint32_t                                    firstQuery,
￿    uint32_t                                    queryCount,
￿    VkBuffer                                    dstBuffer,
￿    VkDeviceSize                                dstOffset,
￿    VkDeviceSize                                stride,
￿    VkQueryResultFlags                          flags);</pre></code>

        <h5>Description</h5>
        #CmdCopyQueryPoolResults() is guaranteed to see the effect of previous uses of #CmdResetQueryPool() in the same queue, without any additional synchronization. Thus, the results will always reflect the most recent use of the query.

        {@code flags} has the same possible values described above for the {@code flags} parameter of #GetQueryPoolResults(), but the different style of execution causes some subtle behavioral differences. Because #CmdCopyQueryPoolResults() executes in order with respect to other query commands, there is less ambiguity about which use of a query is being requested.

        If no bits are set in {@code flags}, results for all requested queries in the available state are written as 32-bit unsigned integer values, and nothing is written for queries in the unavailable state.

        If #QUERY_RESULT_64_BIT is set, the results are written as an array of 64-bit unsigned integer values as described for #GetQueryPoolResults().

        If #QUERY_RESULT_WAIT_BIT is set, the implementation will wait for each query's status to be in the available state before retrieving the numerical results for that query. This is guaranteed to reflect the most recent use of the query on the same queue, assuming that the query is not being simultaneously used by other queues. If the query does not become available in a finite amount of time (e.g. due to not issuing a query since the last reset), a #ERROR_DEVICE_LOST error <b>may</b> occur.

        Similarly, if #QUERY_RESULT_WITH_AVAILABILITY_BIT is set and #QUERY_RESULT_WAIT_BIT is not set, the availability is guaranteed to reflect the most recent use of the query on the same queue, assuming that the query is not being simultaneously used by other queues. As with #GetQueryPoolResults(), implementations <b>must</b> guarantee that if they return a non-zero availability value, then the numerical results are valid.

        If #QUERY_RESULT_PARTIAL_BIT is set, #QUERY_RESULT_WAIT_BIT is not set, and the query's status is unavailable, an intermediate result value between zero and the final result value is written for that query.

        #QUERY_RESULT_PARTIAL_BIT <b>must</b> not be used if the pool's {@code queryType} is #QUERY_TYPE_TIMESTAMP.

        #CmdCopyQueryPoolResults() is considered to be a transfer operation, and its writes to buffer memory <b>must</b> be synchronized using #PIPELINE_STAGE_TRANSFER_BIT and #ACCESS_TRANSFER_WRITE_BIT before using the results.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code dstOffset} <b>must</b> be less than the size of {@code dstBuffer}</li>
            <li>{@code firstQuery} <b>must</b> be less than the number of queries in {@code queryPool}</li>
            <li>The sum of {@code firstQuery} and {@code queryCount} <b>must</b> be less than or equal to the number of queries in {@code queryPool}</li>
            <li>If #QUERY_RESULT_64_BIT is not set in {@code flags} then {@code dstOffset} and {@code stride} <b>must</b> be multiples of 4</li>
            <li>If #QUERY_RESULT_64_BIT is set in {@code flags} then {@code dstOffset} and {@code stride} <b>must</b> be multiples of 8</li>
            <li>{@code dstBuffer} <b>must</b> have enough storage, from {@code dstOffset}, to contain the result of each query, as described <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#queries-operation-memorylayout">here</a></li>
            <li>{@code dstBuffer} <b>must</b> have been created with #BUFFER_USAGE_TRANSFER_DST_BIT usage flag</li>
            <li>If {@code dstBuffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>If the {@code queryType} used to create {@code queryPool} was #QUERY_TYPE_TIMESTAMP, {@code flags} <b>must</b> not contain #QUERY_RESULT_PARTIAL_BIT</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
            <li>{@code dstBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkQueryResultFlagBits} values</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>Each of {@code commandBuffer}, {@code dstBuffer}, and {@code queryPool} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Graphics compute</td><td>Transfer</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer into which this command will be recorded."),
        VkQueryPool.IN("queryPool", "the query pool managing the queries containing the desired results."),
        uint32_t.IN("firstQuery", "the initial query index."),
        uint32_t.IN("queryCount", "the number of queries. {@code firstQuery} and {@code queryCount} together define a range of queries."),
        VkBuffer.IN("dstBuffer", "a {@code VkBuffer} object that will receive the results of the copy command."),
        VkDeviceSize.IN("dstOffset", "an offset into {@code dstBuffer}."),
        VkDeviceSize.IN("stride", "the stride in bytes between results for individual queries within {@code dstBuffer}. The required size of the backing memory for {@code dstBuffer} is determined as described above for #GetQueryPoolResults()."),
        VkQueryResultFlags.IN("flags", "a bitmask of {@code VkQueryResultFlagBits} specifying how and when results are returned.")
    )

    void(
        "CmdPushConstants",
        """
        Update the values of push constants.

        <h5>C Specification</h5>
        To update push constants, call:

        <code><pre>
￿void vkCmdPushConstants(
￿    VkCommandBuffer                             commandBuffer,
￿    VkPipelineLayout                            layout,
￿    VkShaderStageFlags                          stageFlags,
￿    uint32_t                                    offset,
￿    uint32_t                                    size,
￿    const void*                                 pValues);</pre></code>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code stageFlags} <b>must</b> match exactly the shader stages used in {@code layout} for the range specified by {@code offset} and {@code size}</li>
            <li>{@code offset} <b>must</b> be a multiple of 4</li>
            <li>{@code size} <b>must</b> be a multiple of 4</li>
            <li>{@code offset} <b>must</b> be less than ##VkPhysicalDeviceLimits{@code ::maxPushConstantsSize}</li>
            <li>{@code size} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxPushConstantsSize} minus {@code offset}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code layout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
            <li>{@code stageFlags} <b>must</b> be a valid combination of {@code VkShaderStageFlagBits} values</li>
            <li>{@code stageFlags} <b>must</b> not be 0</li>
            <li>{@code pValues} <b>must</b> be a pointer to an array of {@code size} bytes</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
            <li>{@code size} <b>must</b> be greater than 0</li>
            <li>Both of {@code commandBuffer}, and {@code layout} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics compute</td><td></td></tr></tbody>
        </table>
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer in which the push constant update will be recorded."),
        VkPipelineLayout.IN("layout", "the pipeline layout used to program the push constant updates."),
        VkShaderStageFlags.IN("stageFlags", "a bitmask of {@code VkShaderStageFlagBits} specifying the shader stages that will use the push constants in the updated range."),
        uint32_t.IN("offset", "the start offset of the push constant range to update, in units of bytes."),
        AutoSize("pValues")..uint32_t.IN("size", "the size of the push constant range to update, in units of bytes."),
        const..void_p.IN("pValues", "an array of {@code size} bytes containing the new push constant values.")
    )

    void(
        "CmdBeginRenderPass",
        """
        Begin a new render pass.

        <h5>C Specification</h5>
        To begin a render pass instance, call:

        <code><pre>
￿void vkCmdBeginRenderPass(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkRenderPassBeginInfo*                pRenderPassBegin,
￿    VkSubpassContents                           contents);</pre></code>

        <h5>Description</h5>
        After beginning a render pass instance, the command buffer is ready to record the commands for the first subpass of that render pass.

        <h5>Valid Usage</h5>
        <ul>
            <li>If any of the {@code initialLayout} or {@code finalLayout} member of the ##VkAttachmentDescription structures or the {@code layout} member of the ##VkAttachmentReference structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin} is #IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL then the corresponding attachment image subresource of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin} <b>must</b> have been created with #IMAGE_USAGE_COLOR_ATTACHMENT_BIT set</li>
            <li>If any of the {@code initialLayout} or {@code finalLayout} member of the ##VkAttachmentDescription structures or the {@code layout} member of the ##VkAttachmentReference structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin} is #IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL or #IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL then the corresponding attachment image subresource of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin} <b>must</b> have been created with #IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT set</li>
            <li>If any of the {@code initialLayout} or {@code finalLayout} member of the ##VkAttachmentDescription structures or the {@code layout} member of the ##VkAttachmentReference structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin} is #IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL then the corresponding attachment image subresource of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin} <b>must</b> have been created with #IMAGE_USAGE_SAMPLED_BIT or #IMAGE_USAGE_INPUT_ATTACHMENT_BIT set</li>
            <li>If any of the {@code initialLayout} or {@code finalLayout} member of the ##VkAttachmentDescription structures or the {@code layout} member of the ##VkAttachmentReference structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin} is #IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL then the corresponding attachment image subresource of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin} <b>must</b> have been created with #IMAGE_USAGE_TRANSFER_SRC_BIT set</li>
            <li>If any of the {@code initialLayout} or {@code finalLayout} member of the ##VkAttachmentDescription structures or the {@code layout} member of the ##VkAttachmentReference structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin} is #IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL then the corresponding attachment image subresource of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin} <b>must</b> have been created with #IMAGE_USAGE_TRANSFER_DST_BIT set</li>
            <li>If any of the {@code initialLayout} members of the ##VkAttachmentDescription structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin} is not #IMAGE_LAYOUT_UNDEFINED, then each such {@code initialLayout} <b>must</b> be equal to the current layout of the corresponding attachment image subresource of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin}</li>
            <li>The {@code srcStageMask} and {@code dstStageMask} members of any element of the {@code pDependencies} member of ##VkRenderPassCreateInfo used to create {@code renderpass} <b>must</b> be supported by the capabilities of the queue family identified by the {@code queueFamilyIndex} member of the ##VkCommandPoolCreateInfo used to create the command pool which {@code commandBuffer} was allocated from.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pRenderPassBegin} <b>must</b> be a pointer to a valid ##VkRenderPassBeginInfo structure</li>
            <li>{@code contents} <b>must</b> be a valid {@code VkSubpassContents} value</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>{@code commandBuffer} <b>must</b> be a primary {@code VkCommandBuffer}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary</td><td>Outside</td><td>Graphics</td><td>Graphics</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkRenderPassBeginInfo
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer in which to record the command."),
        const..VkRenderPassBeginInfo.p.IN("pRenderPassBegin", "a pointer to a ##VkRenderPassBeginInfo structure (defined below) which indicates the render pass to begin an instance of, and the framebuffer the instance uses."),
        VkSubpassContents.IN("contents", "a {@code VkSubpassContents} value specifying how the commands in the first subpass will be provided.")
    )

    void(
        "CmdNextSubpass",
        """
        Transition to the next subpass of a render pass.

        <h5>C Specification</h5>
        To transition to the next subpass in the render pass instance after recording the commands for a subpass, call:

        <code><pre>
￿void vkCmdNextSubpass(
￿    VkCommandBuffer                             commandBuffer,
￿    VkSubpassContents                           contents);</pre></code>

        <h5>Description</h5>
        The subpass index for a render pass begins at zero when #CmdBeginRenderPass() is recorded, and increments each time #CmdNextSubpass() is recorded.

        Moving to the next subpass automatically performs any multisample resolve operations in the subpass being ended. End-of-subpass multisample resolves are treated as color attachment writes for the purposes of synchronization. That is, they are considered to execute in the #PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT pipeline stage and their writes are synchronized with #ACCESS_COLOR_ATTACHMENT_WRITE_BIT. Synchronization between rendering within a subpass and any resolve operations at the end of the subpass occurs automatically, without need for explicit dependencies or pipeline barriers. However, if the resolve attachment is also used in a different subpass, an explicit dependency is needed.

        After transitioning to the next subpass, the application <b>can</b> record the commands for that subpass.

        <h5>Valid Usage</h5>
        <ul>
            <li>The current subpass index <b>must</b> be less than the number of subpasses in the render pass minus one</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code contents} <b>must</b> be a valid {@code VkSubpassContents} value</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called inside of a render pass instance</li>
            <li>{@code commandBuffer} <b>must</b> be a primary {@code VkCommandBuffer}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary</td><td>Inside</td><td>Graphics</td><td>Graphics</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer in which to record the command."),
        VkSubpassContents.IN("contents", "specifies how the commands in the next subpass will be provided, in the same fashion as the corresponding parameter of #CmdBeginRenderPass().")
    )

    void(
        "CmdEndRenderPass",
        """
        End the current render pass.

        <h5>C Specification</h5>
        To record a command to end a render pass instance after recording the commands for the last subpass, call:

        <code><pre>
￿void vkCmdEndRenderPass(
￿    VkCommandBuffer                             commandBuffer);</pre></code>

        <h5>Description</h5>
        Ending a render pass instance performs any multisample resolve operations on the final subpass.

        <h5>Valid Usage</h5>
        <ul>
            <li>The current subpass index <b>must</b> be equal to the number of subpasses in the render pass minus one</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called inside of a render pass instance</li>
            <li>{@code commandBuffer} <b>must</b> be a primary {@code VkCommandBuffer}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary</td><td>Inside</td><td>Graphics</td><td>Graphics</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer in which to end the current render pass instance.")
    )

    void(
        "CmdExecuteCommands",
        """
        Execute a secondary command buffer from a primary command buffer.

        <h5>C Specification</h5>
        A secondary command buffer <b>must</b> not be directly submitted to a queue. Instead, secondary command buffers are recorded to execute as part of a primary command buffer with the command:

        <code><pre>
￿void vkCmdExecuteCommands(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    commandBufferCount,
￿    const VkCommandBuffer*                      pCommandBuffers);</pre></code>

        <h5>Description</h5>
        If any element of {@code pCommandBuffers} was not recorded with the #COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT flag, and it was recorded into any other primary command buffer which is currently in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">executable or recording state</a>, that primary command buffer becomes <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">invalid</a>.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> have been allocated with a {@code level} of #COMMAND_BUFFER_LEVEL_PRIMARY</li>
            <li>Any given element of {@code pCommandBuffers} <b>must</b> have been allocated with a {@code level} of #COMMAND_BUFFER_LEVEL_SECONDARY</li>
            <li>Any given element of {@code pCommandBuffers} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">pending or executable state</a>.</li>
            <li>If any element of {@code pCommandBuffers} was not recorded with the #COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT flag, and it was recorded into any other primary command buffer, that primary command buffer <b>must</b> not be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">pending state</a></li>
            <li>If any given element of {@code pCommandBuffers} was not recorded with the #COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT flag, it <b>must</b> not be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">pending state</a>.</li>
            <li>If any given element of {@code pCommandBuffers} was not recorded with the #COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT flag, it <b>must</b> not have already been recorded to {@code commandBuffer}.</li>
            <li>If any given element of {@code pCommandBuffers} was not recorded with the #COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT flag, it <b>must</b> not appear more than once in {@code pCommandBuffers}.</li>
            <li>Any given element of {@code pCommandBuffers} <b>must</b> have been allocated from a {@code VkCommandPool} that was created for the same queue family as the {@code VkCommandPool} from which {@code commandBuffer} was allocated</li>
            <li>If #CmdExecuteCommands() is being called within a render pass instance, that render pass instance <b>must</b> have been begun with the {@code contents} parameter of #CmdBeginRenderPass() set to #SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS</li>
            <li>If #CmdExecuteCommands() is being called within a render pass instance, any given element of {@code pCommandBuffers} <b>must</b> have been recorded with the #COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT</li>
            <li>If #CmdExecuteCommands() is being called within a render pass instance, any given element of {@code pCommandBuffers} <b>must</b> have been recorded with ##VkCommandBufferInheritanceInfo{@code ::subpass} set to the index of the subpass which the given command buffer will be executed in</li>
            <li>If #CmdExecuteCommands() is being called within a render pass instance, the render passes specified in the pname::pBeginInfo{@code ::pInheritanceInfo}{@code ::renderPass} members of the #BeginCommandBuffer() commands used to begin recording each element of {@code pCommandBuffers} <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#renderpass-compatibility">compatible</a> with the current render pass.</li>
            <li>If #CmdExecuteCommands() is being called within a render pass instance, and any given element of {@code pCommandBuffers} was recorded with ##VkCommandBufferInheritanceInfo{@code ::framebuffer} not equal to #NULL_HANDLE, that {@code VkFramebuffer} <b>must</b> match the {@code VkFramebuffer} used in the current render pass instance</li>
            <li>If #CmdExecuteCommands() is not being called within a render pass instance, any given element of {@code pCommandBuffers} <b>must</b> not have been recorded with the #COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-inheritedQueries">inherited queries</a> feature is not enabled, {@code commandBuffer} <b>must</b> not have any queries <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#queries-operation-active">active</a></li>
            <li>If {@code commandBuffer} has a #QUERY_TYPE_OCCLUSION query <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#queries-operation-active">active</a>, then each element of {@code pCommandBuffers} <b>must</b> have been recorded with ##VkCommandBufferInheritanceInfo{@code ::occlusionQueryEnable} set to #TRUE</li>
            <li>If {@code commandBuffer} has a #QUERY_TYPE_OCCLUSION query <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#queries-operation-active">active</a>, then each element of {@code pCommandBuffers} <b>must</b> have been recorded with ##VkCommandBufferInheritanceInfo{@code ::queryFlags} having all bits set that are set for the query</li>
            <li>If {@code commandBuffer} has a #QUERY_TYPE_PIPELINE_STATISTICS query <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#queries-operation-active">active</a>, then each element of {@code pCommandBuffers} <b>must</b> have been recorded with ##VkCommandBufferInheritanceInfo{@code ::pipelineStatistics} having all bits set that are set in the {@code VkQueryPool} the query uses</li>
            <li>Any given element of {@code pCommandBuffers} <b>must</b> not begin any query types that are <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#queries-operation-active">active</a> in {@code commandBuffer}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pCommandBuffers} <b>must</b> be a pointer to an array of {@code commandBufferCount} valid {@code VkCommandBuffer} handles</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
            <li>{@code commandBuffer} <b>must</b> be a primary {@code VkCommandBuffer}</li>
            <li>{@code commandBufferCount} <b>must</b> be greater than 0</li>
            <li>Both of {@code commandBuffer}, and the elements of {@code pCommandBuffers} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary</td><td>Both</td><td>Transfer graphics compute</td><td></td></tr></tbody>
        </table>
        """,

        VkCommandBuffer.IN("commandBuffer", "a handle to a primary command buffer that the secondary command buffers are executed in."),
        AutoSize("pCommandBuffers")..uint32_t.IN("commandBufferCount", "the length of the {@code pCommandBuffers} array."),
        const..VkCommandBuffer.p.IN("pCommandBuffers", "an array of secondary command buffer handles, which are recorded to execute in the primary command buffer in the order they are listed in the array.")
    )

}