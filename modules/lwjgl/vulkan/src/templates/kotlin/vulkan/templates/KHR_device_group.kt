/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_device_group = "KHRDeviceGroup".nativeClassVK("KHR_device_group", type = "device", postfix = "KHR") {
    documentation =
        """
        This extension provides functionality to use a logical device that consists of multiple physical devices, as created with the {@link KHRDeviceGroupCreation VK_KHR_device_group_creation} extension. A device group can allocate memory across the subdevices, bind memory from one subdevice to a resource on another subdevice, record command buffers where some work executes on an arbitrary subset of the subdevices, and potentially present a swapchain image from one or more subdevices.

        <h5>Promotion to Vulkan 1.1</h5>
        The following enums, types and commands are included as interactions with {@link KHRSwapchain VK_KHR_swapchain}:

        <ul>
            <li>#STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_CAPABILITIES_KHR</li>
            <li>#STRUCTURE_TYPE_IMAGE_SWAPCHAIN_CREATE_INFO_KHR</li>
            <li>#STRUCTURE_TYPE_BIND_IMAGE_MEMORY_SWAPCHAIN_INFO_KHR</li>
            <li>#STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHR</li>
            <li>#STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHR</li>
            <li>#STRUCTURE_TYPE_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO_KHR</li>
            <li>#SWAPCHAIN_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR</li>
            <li>{@code VkDeviceGroupPresentModeFlagBitsKHR}</li>
            <li>##VkDeviceGroupPresentCapabilitiesKHR</li>
            <li>##VkImageSwapchainCreateInfoKHR</li>
            <li>##VkBindImageMemorySwapchainInfoKHR</li>
            <li>##VkAcquireNextImageInfoKHR</li>
            <li>##VkDeviceGroupPresentInfoKHR</li>
            <li>##VkDeviceGroupSwapchainCreateInfoKHR</li>
            <li>#GetDeviceGroupPresentCapabilitiesKHR()</li>
            <li>#GetDeviceGroupSurfacePresentModesKHR()</li>
            <li>#GetPhysicalDevicePresentRectanglesKHR()</li>
            <li>#AcquireNextImage2KHR()</li>
        </ul>

        If Vulkan 1.1 and {@link KHRSwapchain VK_KHR_swapchain} are supported, these are included by {@code VK_KHR_swapchain}.

        The base functionality in this extension is included in core Vulkan 1.1, with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.

        <h5>VK_KHR_device_group</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_device_group}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>61</dd>

            <dt><b>Revision</b></dt>
            <dd>4</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRDeviceGroupCreation VK_KHR_device_group_creation}</li>
            </ul></dd>

            <dt><b>Deprecation state</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#versions-1.1-promotions">Vulkan 1.1</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jeff Bolz <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_device_group]%20@jeffbolznv%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_device_group%20extension%3E%3E">jeffbolznv</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2017-10-10</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>This extension requires <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/KHR/SPV_KHR_device_group.html">{@code SPV_KHR_device_group}</a></li>
                <li>Promoted to Vulkan 1.1 Core</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Tobias Hector, Imagination Technologies</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_DEVICE_GROUP_SPEC_VERSION".."4"
    )

    StringConstant(
        "The extension name.",

        "KHR_DEVICE_GROUP_EXTENSION_NAME".."VK_KHR_device_group"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO_KHR".."1000060000",
        "STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO_KHR".."1000060003",
        "STRUCTURE_TYPE_DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO_KHR".."1000060004",
        "STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO_KHR".."1000060005",
        "STRUCTURE_TYPE_DEVICE_GROUP_BIND_SPARSE_INFO_KHR".."1000060006"
    )

    EnumConstant(
        "Extends {@code VkPeerMemoryFeatureFlagBits}.",

        "PEER_MEMORY_FEATURE_COPY_SRC_BIT_KHR".enum(0x00000001),
        "PEER_MEMORY_FEATURE_COPY_DST_BIT_KHR".enum(0x00000002),
        "PEER_MEMORY_FEATURE_GENERIC_SRC_BIT_KHR".enum(0x00000004),
        "PEER_MEMORY_FEATURE_GENERIC_DST_BIT_KHR".enum(0x00000008)
    )

    EnumConstant(
        "Extends {@code VkMemoryAllocateFlagBits}.",

        "MEMORY_ALLOCATE_DEVICE_MASK_BIT_KHR".enum(0x00000001)
    )

    EnumConstant(
        "Extends {@code VkPipelineCreateFlagBits}.",

        "PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT_KHR".enum(0x00000008),
        "PIPELINE_CREATE_DISPATCH_BASE_KHR".enum(0x00000010)
    )

    EnumConstant(
        "Extends {@code VkDependencyFlagBits}.",

        "DEPENDENCY_DEVICE_GROUP_BIT_KHR".enum(0x00000004)
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO_KHR".."1000060013",
        "STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO_KHR".."1000060014"
    )

    EnumConstant(
        "Extends {@code VkImageCreateFlagBits}.",

        "IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR".enum(0x00000040)
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_CAPABILITIES_KHR".."1000060007"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_IMAGE_SWAPCHAIN_CREATE_INFO_KHR".."1000060008",
        "STRUCTURE_TYPE_BIND_IMAGE_MEMORY_SWAPCHAIN_INFO_KHR".."1000060009",
        "STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHR".."1000060010",
        "STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHR".."1000060011",
        "STRUCTURE_TYPE_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO_KHR".."1000060012"
    )

    EnumConstant(
        "Extends {@code VkSwapchainCreateFlagBitsKHR}.",

        "SWAPCHAIN_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR".enum(0x00000001)
    )

    void(
        "GetDeviceGroupPeerMemoryFeaturesKHR",
        "See #GetDeviceGroupPeerMemoryFeatures().",

        VkDevice("device", "the logical device that owns the memory."),
        uint32_t("heapIndex", "the index of the memory heap from which the memory is allocated."),
        uint32_t("localDeviceIndex", "the device index of the physical device that performs the memory access."),
        uint32_t("remoteDeviceIndex", "the device index of the physical device that the memory is allocated for."),
        Check(1)..VkPeerMemoryFeatureFlags.p("pPeerMemoryFeatures", "a pointer to a {@code VkPeerMemoryFeatureFlags} bitmask indicating which types of memory accesses are supported for the combination of heap, local, and remote devices.")
    )

    void(
        "CmdSetDeviceMaskKHR",
        "See #CmdSetDeviceMask().",

        VkCommandBuffer("commandBuffer", "command buffer whose current device mask is modified."),
        uint32_t("deviceMask", "the new value of the current device mask.")
    )

    void(
        "CmdDispatchBaseKHR",
        "See #CmdDispatchBase().",

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        uint32_t("baseGroupX", "the start value for the X component of {@code WorkgroupId}."),
        uint32_t("baseGroupY", "the start value for the Y component of {@code WorkgroupId}."),
        uint32_t("baseGroupZ", "the start value for the Z component of {@code WorkgroupId}."),
        uint32_t("groupCountX", "the number of local workgroups to dispatch in the X dimension."),
        uint32_t("groupCountY", "the number of local workgroups to dispatch in the Y dimension."),
        uint32_t("groupCountZ", "the number of local workgroups to dispatch in the Z dimension.")
    )

    DependsOn("VK_KHR_surface")..VkResult(
        "GetDeviceGroupPresentCapabilitiesKHR",
        """
        Query present capabilities from other physical devices.

        <h5>C Specification</h5>
        A logical device that represents multiple physical devices <b>may</b> support presenting from images on more than one physical device, or combining images from multiple physical devices.

        To query these capabilities, call:

        <pre><code>
￿VkResult vkGetDeviceGroupPresentCapabilitiesKHR(
￿    VkDevice                                    device,
￿    VkDeviceGroupPresentCapabilitiesKHR*        pDeviceGroupPresentCapabilities);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pDeviceGroupPresentCapabilities} <b>must</b> be a valid pointer to a ##VkDeviceGroupPresentCapabilitiesKHR structure</li>
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
        ##VkDeviceGroupPresentCapabilitiesKHR
        """,

        VkDevice("device", "the logical device."),
        VkDeviceGroupPresentCapabilitiesKHR.p("pDeviceGroupPresentCapabilities", "a pointer to a ##VkDeviceGroupPresentCapabilitiesKHR structure in which the device’s capabilities are returned.")
    )

    DependsOn("VK_KHR_surface")..VkResult(
        "GetDeviceGroupSurfacePresentModesKHR",
        """
        Query present capabilities for a surface.

        <h5>C Specification</h5>
        Some surfaces <b>may</b> not be capable of using all the device group present modes.

        To query the supported device group present modes for a particular surface, call:

        <pre><code>
￿VkResult vkGetDeviceGroupSurfacePresentModesKHR(
￿    VkDevice                                    device,
￿    VkSurfaceKHR                                surface,
￿    VkDeviceGroupPresentModeFlagsKHR*           pModes);</code></pre>

        <h5>Description</h5>
        The modes returned by this command are not invariant, and <b>may</b> change in response to the surface being moved, resized, or occluded. These modes <b>must</b> be a subset of the modes returned by #GetDeviceGroupPresentCapabilitiesKHR().

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code surface} <b>must</b> be supported by all physical devices associated with {@code device}, as reported by #GetPhysicalDeviceSurfaceSupportKHR() or an equivalent platform-specific mechanism</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
            <li>{@code pModes} <b>must</b> be a valid pointer to a {@code VkDeviceGroupPresentModeFlagsKHR} value</li>
            <li>Both of {@code device}, and {@code surface} <b>must</b> have been created, allocated, or retrieved from the same {@code VkInstance}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code surface} <b>must</b> be externally synchronized</li>
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
                <li>#ERROR_SURFACE_LOST_KHR</li>
            </ul></dd>
        </dl>
        """,

        VkDevice("device", "the logical device."),
        VkSurfaceKHR("surface", "the surface."),
        Check(1)..VkDeviceGroupPresentModeFlagsKHR.p("pModes", "a pointer to a {@code VkDeviceGroupPresentModeFlagsKHR} in which the supported device group present modes for the surface are returned.")
    )

    DependsOn("VK_KHR_surface")..VkResult(
        "GetPhysicalDevicePresentRectanglesKHR",
        """
        Query present rectangles for a surface on a physical device.

        <h5>C Specification</h5>
        When using #DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHR, the application <b>may</b> need to know which regions of the surface are used when presenting locally on each physical device. Presentation of swapchain images to this surface need only have valid contents in the regions returned by this command.

        To query a set of rectangles used in presentation on the physical device, call:

        <pre><code>
￿VkResult vkGetPhysicalDevicePresentRectanglesKHR(
￿    VkPhysicalDevice                            physicalDevice,
￿    VkSurfaceKHR                                surface,
￿    uint32_t*                                   pRectCount,
￿    VkRect2D*                                   pRects);</code></pre>

        <h5>Description</h5>
        If {@code pRects} is {@code NULL}, then the number of rectangles used when presenting the given {@code surface} is returned in {@code pRectCount}. Otherwise, {@code pRectCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pRects} array, and on return the variable is overwritten with the number of structures actually written to {@code pRects}. If the value of {@code pRectCount} is less than the number of rectangles, at most {@code pRectCount} structures will be written, and #INCOMPLETE will be returned instead of #SUCCESS, to indicate that not all the available rectangles were returned.

        The values returned by this command are not invariant, and <b>may</b> change in response to the surface being moved, resized, or occluded.

        The rectangles returned by this command <b>must</b> not overlap.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
            <li>{@code surface} <b>must</b> be supported by {@code physicalDevice}, as reported by #GetPhysicalDeviceSurfaceSupportKHR() or an equivalent platform-specific mechanism</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
            <li>{@code pRectCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pRectCount} is not 0, and {@code pRects} is not {@code NULL}, {@code pRects} <b>must</b> be a valid pointer to an array of {@code pRectCount} ##VkRect2D structures</li>
            <li>Both of {@code physicalDevice}, and {@code surface} <b>must</b> have been created, allocated, or retrieved from the same {@code VkInstance}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code surface} <b>must</b> be externally synchronized</li>
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
        ##VkRect2D
        """,

        VkPhysicalDevice("physicalDevice", "the physical device."),
        VkSurfaceKHR("surface", "the surface."),
        AutoSize("pRects")..Check(1)..uint32_t.p("pRectCount", "a pointer to an integer related to the number of rectangles available or queried, as described below."),
        nullable..VkRect2D.p("pRects", "either {@code NULL} or a pointer to an array of ##VkRect2D structures.")
    )

    DependsOn("VK_KHR_swapchain")..VkResult(
        "AcquireNextImage2KHR",
        """
        Retrieve the index of the next available presentable image.

        <h5>C Specification</h5>
        To acquire an available presentable image to use, and retrieve the index of that image, call:

        <pre><code>
￿VkResult vkAcquireNextImage2KHR(
￿    VkDevice                                    device,
￿    const VkAcquireNextImageInfoKHR*            pAcquireInfo,
￿    uint32_t*                                   pImageIndex);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>If the number of currently acquired images is greater than the difference between the number of images in the {@code swapchain} member of {@code pAcquireInfo} and the value of ##VkSurfaceCapabilitiesKHR{@code ::minImageCount} as returned by a call to #GetPhysicalDeviceSurfaceCapabilities2KHR() with the {@code surface} used to create {@code swapchain}, the {@code timeout} member of {@code pAcquireInfo} <b>must</b> not be {@code UINT64_MAX}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pAcquireInfo} <b>must</b> be a valid pointer to a valid ##VkAcquireNextImageInfoKHR structure</li>
            <li>{@code pImageIndex} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#TIMEOUT</li>
                <li>#NOT_READY</li>
                <li>#SUBOPTIMAL_KHR</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_DEVICE_LOST</li>
                <li>#ERROR_OUT_OF_DATE_KHR</li>
                <li>#ERROR_SURFACE_LOST_KHR</li>
                <li>#ERROR_FULL_SCREEN_EXCLUSIVE_MODE_LOST_EXT</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAcquireNextImageInfoKHR
        """,

        VkDevice("device", "the device associated with {@code swapchain}."),
        VkAcquireNextImageInfoKHR.const.p("pAcquireInfo", "a pointer to a ##VkAcquireNextImageInfoKHR structure containing parameters of the acquire."),
        Check(1)..uint32_t.p("pImageIndex", "a pointer to a {@code uint32_t} that is set to the index of the next image to use.")
    )
}