/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val KHX_device_group = "KHXDeviceGroup".nativeClassVK("KHX_device_group", type = "device", postfix = KHX) {
    documentation =
        """
        This extension provides functionality to use a logical device that consists of multiple physical devices, as created with the {@code VK_KHX_device_group_creation} extension. A device group can allocate memory across the subdevices, bind memory from one subdevice to a resource on another subdevice, record command buffers where some work executes on an arbitrary subset of the subdevices, and potentially present a swapchain image from one or more subdevices.

        <h5>Examples</h5>
        TODO

        <dl>
            <dt><b>Name String</b></dt>
            <dd>VK_KHX_device_group</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>61</dd>

            <dt><b>Status</b></dt>
            <dd>Draft.</dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2016-10-19</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Dependencies</b></dt>
            <dd><ul>
                <li>This extension is written against version 1.0 of the Vulkan API.</li>
                <li>Requires VK_KHR_swapchain revision 68.</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Bolz, NVIDIA</li>
            </ul></dd>

            <dt><b>Contacts</b></dt>
            <dd><ul>
                <li>Jeff Bolz (jbolz 'at' nvidia.com)</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHX_DEVICE_GROUP_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHX_DEVICE_GROUP_EXTENSION_NAME".."VK_KHX_device_group"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO_KHX".."1000060000",
        "STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO_KHX".."1000060001",
        "STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO_KHX".."1000060002",
        "STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO_KHX".."1000060003",
        "STRUCTURE_TYPE_DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO_KHX".."1000060004",
        "STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO_KHX".."1000060005",
        "STRUCTURE_TYPE_DEVICE_GROUP_BIND_SPARSE_INFO_KHX".."1000060006",
        "STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_CAPABILITIES_KHX".."1000060007",
        "STRUCTURE_TYPE_IMAGE_SWAPCHAIN_CREATE_INFO_KHX".."1000060008",
        "STRUCTURE_TYPE_BIND_IMAGE_MEMORY_SWAPCHAIN_INFO_KHX".."1000060009",
        "STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHX".."1000060010",
        "STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHX".."1000060011",
        "STRUCTURE_TYPE_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO_KHX".."1000060012"
    )

    EnumConstant(
        "Extends {@code VkImageCreateFlagBits}.",

        "IMAGE_CREATE_BIND_SFR_BIT_KHX".enum(0x00000040)
    )

    EnumConstant(
        "Extends {@code VkPipelineCreateFlagBits}.",

        "PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT_KHX".enum(0x00000008),
        "PIPELINE_CREATE_DISPATCH_BASE_KHX".enum(0x00000010)
    )

    EnumConstant(
        "Extends {@code VkDependencyFlagBits}.",

        "DEPENDENCY_DEVICE_GROUP_BIT_KHX".enum(0x00000004)
    )

    EnumConstant(
        "Extends {@code VkSwapchainCreateFlagBitsKHR}.",

        "SWAPCHAIN_CREATE_BIND_SFR_BIT_KHX".enum(0x00000001)
    )

    EnumConstant(
        """
        VkPeerMemoryFeatureFlagBitsKHX - Bitmask specifying supported peer memory features

        <h5>Description</h5>
        <ul>
            <li>#PEER_MEMORY_FEATURE_COPY_SRC_BIT_KHX indicates that the memory <b>can</b> be accessed as the source of a ftext:vkCmdCopy* command.</li>
            <li>#PEER_MEMORY_FEATURE_COPY_DST_BIT_KHX indicates that the memory <b>can</b> be accessed as the destination of a ftext:vkCmdCopy* command.</li>
            <li>#PEER_MEMORY_FEATURE_GENERIC_SRC_BIT_KHX indicates that the memory <b>can</b> be read as any other memory access type.</li>
            <li>#PEER_MEMORY_FEATURE_GENERIC_DST_BIT_KHX indicates that the memory <b>can</b> be written as any other memory access type. Shader atomics are considered to be writes.</li>
        </ul>

        #PEER_MEMORY_FEATURE_COPY_DST_BIT_KHX <b>must</b> be supported for all heaps.

        If a device does not support a peer memory feature, it is still valid to use a resource that includes both local and peer memory bindings with the corresponding access type as long as only the local bindings are actually accessed. For example, an application doing split-frame rendering would use framebuffer attachments that include both local and peer memory bindings, but would scissor the rendering to only update local memory.

        <h5>See Also</h5>
        {@code VkPeerMemoryFeatureFlagsKHX}
        """,

        "PEER_MEMORY_FEATURE_COPY_SRC_BIT_KHX".enum(0x00000001),
        "PEER_MEMORY_FEATURE_COPY_DST_BIT_KHX".enum(0x00000002),
        "PEER_MEMORY_FEATURE_GENERIC_SRC_BIT_KHX".enum(0x00000004),
        "PEER_MEMORY_FEATURE_GENERIC_DST_BIT_KHX".enum(0x00000008)
    )

    EnumConstant(
        """
        VkMemoryAllocateFlagBitsKHX - Bitmask specifying flags for a device memory allocation

        <h5>Description</h5>
        <ul>
            <li>#MEMORY_ALLOCATE_DEVICE_MASK_BIT_KHX specifies that memory will be allocated for the devices in ##VkMemoryAllocateFlagsInfoKHX{@code ::deviceMask}.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkMemoryAllocateFlagsKHX}
        """,

        "MEMORY_ALLOCATE_DEVICE_MASK_BIT_KHX".enum(0x00000001)
    )

    EnumConstant(
        """
        VkDeviceGroupPresentModeFlagBitsKHX - Bitmask specifying supported device group present modes

        <h5>Description</h5>
        <ul>
            <li>#DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHX indicates that any physical device with a presentation engine <b>can</b> present its own swapchain images.</li>
            <li>#DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHX indicates that any physical device with a presentation engine <b>can</b> present swapchain images from any physical device in its {@code presentMask}.</li>
            <li>#DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHX indicates that any physical device with a presentation engine <b>can</b> present the sum of swapchain images from any physical devices in its {@code presentMask}.</li>
            <li>#DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHX indicates that multiple physical devices with a presentation engine <b>can</b> each present their own swapchain images.</li>
        </ul>

        <h5>See Also</h5>
        ##VkDeviceGroupPresentInfoKHX, {@code VkDeviceGroupPresentModeFlagsKHX}
        """,

        "DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHX".enum(0x00000001),
        "DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHX".enum(0x00000002),
        "DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHX".enum(0x00000004),
        "DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHX".enum(0x00000008)
    )

    void(
        "GetDeviceGroupPeerMemoryFeaturesKHX",
        """
        Query supported peer memory features of a device.

        <h5>C Specification</h5>
        <em>Peer memory</em> is memory that is allocated for a given physical device and then bound to a resource and accessed by a different physical device, in a logical device that represents multiple physical devices. Some ways of reading and writing peer memory <b>may</b> not be supported by a device.

        To determine how peer memory <b>can</b> be accessed, call:

        <code><pre>
￿void vkGetDeviceGroupPeerMemoryFeaturesKHX(
￿    VkDevice                                    device,
￿    uint32_t                                    heapIndex,
￿    uint32_t                                    localDeviceIndex,
￿    uint32_t                                    remoteDeviceIndex,
￿    VkPeerMemoryFeatureFlagsKHX*                pPeerMemoryFeatures);</pre></code>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code heapIndex} <b>must</b> be less than {@code memoryHeapCount}</li>
            <li>{@code localDeviceIndex} <b>must</b> be a valid device index</li>
            <li>{@code remoteDeviceIndex} <b>must</b> be a valid device index</li>
            <li>{@code localDeviceIndex} <b>must</b> not equal remoteDeviceIndex</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pPeerMemoryFeatures} <b>must</b> be a pointer to a combination of {@code VkPeerMemoryFeatureFlagBitsKHX} values</li>
            <li>{@code pPeerMemoryFeatures} <b>must</b> not be 0</li>
        </ul>
        """,

        VkDevice.IN("device", "the logical device that owns the memory."),
        uint32_t.IN("heapIndex", "the index of the memory heap from which the memory is allocated."),
        uint32_t.IN("localDeviceIndex", "the device index of the physical device that performs the memory access."),
        uint32_t.IN("remoteDeviceIndex", "the device index of the physical device that the memory is allocated for."),
        Check(1)..VkPeerMemoryFeatureFlagsKHX.p.OUT("pPeerMemoryFeatures", "a pointer to a bitmask of {@code VkPeerMemoryFeatureFlagBitsKHX} indicating which types of memory accesses are supported for the combination of heap, local, and remote devices.")
    )

    VkResult(
        "BindBufferMemory2KHX",
        """
        Bind device memory to buffer objects.

        <h5>C Specification</h5>
        To attach memory to buffer objects for one or more buffers at a time, call:

        <code><pre>
￿VkResult vkBindBufferMemory2KHX(
￿    VkDevice                                    device,
￿    uint32_t                                    bindInfoCount,
￿    const VkBindBufferMemoryInfoKHX*            pBindInfos);</pre></code>

        <h5>Description</h5>
        On some implementations, it <b>may</b> be more efficient to batch memory bindings into a single command.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pBindInfos} <b>must</b> be a pointer to an array of {@code bindInfoCount} valid ##VkBindBufferMemoryInfoKHX structures</li>
            <li>{@code bindInfoCount} <b>must</b> be greater than 0</li>
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
        ##VkBindBufferMemoryInfoKHX
        """,

        VkDevice.IN("device", "the logical device that owns the buffers and memory."),
        AutoSize("pBindInfos")..uint32_t.IN("bindInfoCount", "the number of elements in {@code pBindInfos}."),
        const..VkBindBufferMemoryInfoKHX.p.IN("pBindInfos", "a pointer to an array of structures of type ##VkBindBufferMemoryInfoKHX, describing buffers and memory to bind.")
    )

    VkResult(
        "BindImageMemory2KHX",
        """
        Bind device memory to image objects.

        <h5>C Specification</h5>
        To attach memory to image objects for one or more images at a time, call:

        <code><pre>
￿VkResult vkBindImageMemory2KHX(
￿    VkDevice                                    device,
￿    uint32_t                                    bindInfoCount,
￿    const VkBindImageMemoryInfoKHX*             pBindInfos);</pre></code>

        <h5>Description</h5>
        On some implementations, it <b>may</b> be more efficient to batch memory bindings into a single command.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pBindInfos} <b>must</b> be a pointer to an array of {@code bindInfoCount} valid ##VkBindImageMemoryInfoKHX structures</li>
            <li>{@code bindInfoCount} <b>must</b> be greater than 0</li>
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
        ##VkBindImageMemoryInfoKHX
        """,

        VkDevice.IN("device", "the logical device that owns the images and memory."),
        AutoSize("pBindInfos")..uint32_t.IN("bindInfoCount", "the number of elements in {@code pBindInfos}."),
        const..VkBindImageMemoryInfoKHX.p.IN("pBindInfos", "a pointer to an array of structures of type ##VkBindImageMemoryInfoKHX, describing images and memory to bind.")
    )

    void(
        "CmdSetDeviceMaskKHX",
        """
        Modify device mask of a command buffer.

        <h5>C Specification</h5>
        To update the current device mask of a command buffer, call:

        <code><pre>
￿void vkCmdSetDeviceMaskKHX(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    deviceMask);</pre></code>

        <h5>Description</h5>
        {@code deviceMask} is used to filter out subsequent commands from executing on all physical devices whose bit indices are not set in the mask.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code deviceMask} <b>must</b> be a valid device mask value</li>
            <li>{@code deviceMask} <b>must</b> not be zero</li>
            <li>{@code deviceMask} <b>must</b> not include any set bits that were not in the ##VkDeviceGroupCommandBufferBeginInfoKHX{@code ::deviceMask} value when the command buffer began recording.</li>
            <li>If #CmdSetDeviceMaskKHX() is called inside a render pass instance, {@code deviceMask} <b>must</b> not include any set bits that were not in the ##VkDeviceGroupRenderPassBeginInfoKHX{@code ::deviceMask} value when the render pass instance began recording.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, compute, or transfer operations</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics compute transfer</td><td></td></tr></tbody>
        </table>
        """,

        VkCommandBuffer.IN("commandBuffer", "command buffer whose current device mask is modified."),
        uint32_t.IN("deviceMask", "the new value of the current device mask.")
    )

    VkResult(
        "GetDeviceGroupPresentCapabilitiesKHX",
        """
        Query present capabilities from other physical devices.

        <h5>C Specification</h5>
        A logical device that represents multiple physical devices <b>may</b> support presenting from images on more than one physical device, or combining images from multiple physical devices.

        To query these capabilities, call:

        <code><pre>
￿VkResult vkGetDeviceGroupPresentCapabilitiesKHX(
￿    VkDevice                                    device,
￿    VkDeviceGroupPresentCapabilitiesKHX*        pDeviceGroupPresentCapabilities);</pre></code>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pDeviceGroupPresentCapabilities} <b>must</b> be a pointer to a ##VkDeviceGroupPresentCapabilitiesKHX structure</li>
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
        ##VkDeviceGroupPresentCapabilitiesKHX
        """,

        VkDevice.IN("device", "the logical device."),
        VkDeviceGroupPresentCapabilitiesKHX.p.OUT("pDeviceGroupPresentCapabilities", "a pointer to a structure of type ##VkDeviceGroupPresentCapabilitiesKHX that is filled with the logical device&#8217;s capabilities.")
    )

    VkResult(
        "GetDeviceGroupSurfacePresentModesKHX",
        """
        Query present capabilities for a surface.

        <h5>C Specification</h5>
        Some surfaces <b>may</b> not be capable of using all the device group present modes.

        To query the supported device group present modes for a particular surface, call:

        <code><pre>
￿VkResult vkGetDeviceGroupSurfacePresentModesKHX(
￿    VkDevice                                    device,
￿    VkSurfaceKHR                                surface,
￿    VkDeviceGroupPresentModeFlagsKHX*           pModes);</pre></code>

        <h5>Description</h5>
        The modes returned by this command are not invariant, and <b>may</b> change in response to the surface being moved, resized, or occluded. These modes <b>must</b> be a subset of the modes returned by #GetDeviceGroupPresentCapabilitiesKHX().

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
            <li>{@code pModes} <b>must</b> be a pointer to a combination of {@code VkDeviceGroupPresentModeFlagBitsKHX} values</li>
            <li>{@code pModes} <b>must</b> not be 0</li>
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

        VkDevice.IN("device", "the logical device."),
        VkSurfaceKHR.IN("surface", "the surface."),
        Check(1)..VkDeviceGroupPresentModeFlagsKHX.p.OUT("pModes", "a pointer to a value of type {@code VkDeviceGroupPresentModeFlagsKHX} that is filled with the supported device group present modes for the surface.")
    )

    VkResult(
        "AcquireNextImage2KHX",
        """
        Retrieve the index of the next available presentable image.

        <h5>C Specification</h5>
        To acquire an available presentable image to use, and retrieve the index of that image, call:

        <code><pre>
￿VkResult vkAcquireNextImage2KHX(
￿    VkDevice                                    device,
￿    const VkAcquireNextImageInfoKHX*            pAcquireInfo,
￿    uint32_t*                                   pImageIndex);</pre></code>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pAcquireInfo} <b>must</b> be a pointer to a valid ##VkAcquireNextImageInfoKHX structure</li>
            <li>{@code pImageIndex} <b>must</b> be a pointer to a {@code uint32_t} value</li>
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
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAcquireNextImageInfoKHX
        """,

        VkDevice.IN("device", "the device associated with {@code swapchain}."),
        const..VkAcquireNextImageInfoKHX.p.IN("pAcquireInfo", "a pointer to a structure of type ##VkAcquireNextImageInfoKHX containing parameters of the acquire."),
        Check(1)..uint32_t_p.OUT("pImageIndex", "a pointer to a {@code uint32_t} that is set to the index of the next image to use.")
    )

    void(
        "CmdDispatchBaseKHX",
        """
        Dispatch compute work items.

        <h5>C Specification</h5>
        To record a dispatch using non-zero base values for the components of {@code WorkgroupId}, call:

        <code><pre>
￿void vkCmdDispatchBaseKHX(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    baseGroupX,
￿    uint32_t                                    baseGroupY,
￿    uint32_t                                    baseGroupZ,
￿    uint32_t                                    groupCountX,
￿    uint32_t                                    groupCountY,
￿    uint32_t                                    groupCountZ);</pre></code>

        <h5>Description</h5>
        When the command is executed, a global workgroup consisting of <code>groupCountX {times} groupCountY {times} groupCountZ</code> local workgroups is assembled, with {@code WorkgroupId} values ranging from <code>[baseGroup, baseGroup {plus} groupCount)</code> in each component. #CmdDispatch() is equivalent to vkCmdDispatchBaseKHX(0,0,0,groupCountX,groupCountY,groupCountZ).

        <h5>Valid Usage</h5>
        <ul>
            <li>All valid usage rules from #CmdDispatch() apply</li>
            <li>{@code baseGroupX} <b>must</b> be less than ##VkPhysicalDeviceLimits{@code ::maxComputeWorkGroupCount}[0]</li>
            <li>{@code baseGroupX} <b>must</b> be less than {@code VkPhysicaYDeviceLimits}{@code ::maxComputeWorkGroupCount}[1]</li>
            <li>{@code baseGroupZ} <b>must</b> be less than ##VkPhysicalDeviceLimits{@code ::maxComputeWorkGroupCount}[2]</li>
            <li>{@code groupCountX} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxComputeWorkGroupCount}[0] minus {@code baseGroupX}</li>
            <li>{@code groupCountY} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxComputeWorkGroupCount}[1] minus {@code baseGroupY}</li>
            <li>{@code groupCountZ} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxComputeWorkGroupCount}[2] minus {@code baseGroupZ}</li>
            <li>If any of {@code baseGroupX}, {@code baseGroupY}, or {@code baseGroupZ} are not zero, then the currently bound compute pipeline <b>must</b> have been created with the #PIPELINE_CREATE_DISPATCH_BASE_KHX flag.</li>
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
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Compute</td><td></td></tr></tbody>
        </table>
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command will be recorded."),
        uint32_t.IN("baseGroupX", "the start value for the X component of {@code WorkgroupId}."),
        uint32_t.IN("baseGroupY", "the start value for the Y component of {@code WorkgroupId}."),
        uint32_t.IN("baseGroupZ", "the start value for the Z component of {@code WorkgroupId}."),
        uint32_t.IN("groupCountX", "the number of local workgroups to dispatch in the X dimension."),
        uint32_t.IN("groupCountY", "the number of local workgroups to dispatch in the Y dimension."),
        uint32_t.IN("groupCountZ", "the number of local workgroups to dispatch in the Z dimension.")
    )

    VkResult(
        "GetPhysicalDevicePresentRectanglesKHX",
        """
        Query present rectangles for a surface on a physical device.

        <h5>C Specification</h5>
        When using #DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHX, the application <b>may</b> need to know which regions of the surface are used when presenting locally on each physical device. Presentation of swapchain images to this surface need only have valid contents in the regions returned by this command.

        To query a set of rectangles used in presentation on the physical device, call:

        <code><pre>
￿VkResult vkGetPhysicalDevicePresentRectanglesKHX(
￿    VkPhysicalDevice                            physicalDevice,
￿    VkSurfaceKHR                                surface,
￿    uint32_t*                                   pRectCount,
￿    VkRect2D*                                   pRects);</pre></code>

        <h5>Description</h5>
        If {@code pRects} is {@code NULL}, then the number of rectangles used when presenting the given {@code surface} is returned in {@code pRectCount}. Otherwise, {@code pRectCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pRects} array, and on return the variable is overwritten with the number of structures actually written to {@code pRects}. If the value of {@code pRectCount} is less than the number of rectangles, at most {@code pRectCount} structures will be written. If {@code pRectCount} is smaller than the number of rectangles used for the given {@code surface}, #INCOMPLETE will be returned instead of #SUCCESS to indicate that not all the available values were returned.

        The values returned by this command are not invariant, and <b>may</b> change in response to the surface being moved, resized, or occluded.

        The rectangles returned by this command <b>must</b> not overlap.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
            <li>{@code pRectCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pRectCount} is not 0, and {@code pRects} is not {@code NULL}, {@code pRects} <b>must</b> be a pointer to an array of {@code pRectCount} ##VkRect2D structures</li>
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

        VkPhysicalDevice.IN("physicalDevice", "the physical device."),
        VkSurfaceKHR.IN("surface", "the surface."),
        AutoSize("pRects")..Check(1)..uint32_t_p.INOUT("pRectCount", "a pointer to an integer related to the number of rectangles available or queried, as described below."),
        nullable..VkRect2D.p.OUT("pRects", "either {@code NULL} or a pointer to an array of ##VkRect2D structures.")
    )
}