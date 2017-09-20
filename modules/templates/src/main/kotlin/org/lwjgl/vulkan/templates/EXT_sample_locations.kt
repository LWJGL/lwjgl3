/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val EXT_sample_locations = "EXTSampleLocations".nativeClassVK("EXT_sample_locations", type = "device", postfix = EXT) {
    documentation =
        """
        This extension allows an application to modify the locations of samples within a pixel used in rasterization. Additionally, it allows applications to specify different sample locations for each pixel in a group of adjacent pixels, which <b>can</b> increase antialiasing quality (particularly if a custom resolve shader is used that takes advantage of these different locations).

        It is common for implementations to optimize the storage of depth values by storing values that <b>can</b> be used to reconstruct depth at each sample location, rather than storing separate depth values for each sample. For example, the depth values from a single triangle <b>may</b> be represented using plane equations. When the depth value for a sample is needed, it is automatically evaluated at the sample location. Modifying the sample locations causes the reconstruction to no longer evaluate the same depth values as when the samples were originally generated, thus the depth aspect of a depth/stencil attachment <b>must</b> be cleared before rendering to it using different sample locations.

        Some implementations <b>may</b> need to evaluate depth image values while performing image layout transitions. To accommodate this, instances of the ##VkSampleLocationsInfoEXT structure <b>can</b> be specified for each situation where an explicit or automatic layout transition has to take place. ##VkSampleLocationsInfoEXT <b>can</b> be chained from ##VkImageMemoryBarrier structures to provide sample locations for layout transitions performed by #CmdWaitEvents() and flink:VkCmdPipelineBarrier calls, and ##VkRenderPassSampleLocationsBeginInfoEXT <b>can</b> be chained from ##VkRenderPassBeginInfo to provide sample locations for layout transitions performed implicitly by a render pass instance.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_sample_locations}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>144</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Daniel Rakos @aqnuep</li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2017-08-02</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Mais Alnasser, AMD</li>
                <li>Matthaeus G. Chajdas, AMD</li>
                <li>Maciej Jesionowski, AMD</li>
                <li>Daniel Rakos, AMD</li>
                <li>Slawomir Grajewski, Intel</li>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Bill Licea-Kane, Qualcomm</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_SAMPLE_LOCATIONS_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_SAMPLE_LOCATIONS_EXTENSION_NAME".."VK_EXT_sample_locations"
    )

    EnumConstant(
        "Extends {@code VkImageCreateFlagBits}.",

        "IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT".enum(0x00001000)
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_SAMPLE_LOCATIONS_INFO_EXT".."1000143000",
        "STRUCTURE_TYPE_RENDER_PASS_SAMPLE_LOCATIONS_BEGIN_INFO_EXT".."1000143001",
        "STRUCTURE_TYPE_PIPELINE_SAMPLE_LOCATIONS_STATE_CREATE_INFO_EXT".."1000143002",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLE_LOCATIONS_PROPERTIES_EXT".."1000143003",
        "STRUCTURE_TYPE_MULTISAMPLE_PROPERTIES_EXT".."1000143004"
    )

    EnumConstant(
        "Extends {@code VkDynamicState}.",

        "DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT".."1000143000"
    )

    void(
        "CmdSetSampleLocationsEXT",
        """
        Set the dynamic sample locations state.

        <h5>C Specification</h5>
        The custom sample locations used for rasterization when ##VkPipelineSampleLocationsStateCreateInfoEXT{@code ::sampleLocationsEnable} is #TRUE are specified by the ##VkPipelineSampleLocationsStateCreateInfoEXT{@code ::sampleLocationsInfo} property of the currently bound graphics pipeline, if the pipeline was not created with #DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT enabled.

        Otherwise, the sample locations used for rasterization are set by calling #CmdSetSampleLocationsEXT():

        <code><pre>
￿void vkCmdSetSampleLocationsEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkSampleLocationsInfoEXT*             pSampleLocationsInfo);</pre></code>

        <h5>Valid Usage</h5>
        <ul>
            <li>The currently bound graphics pipeline <b>must</b> have been created with the #DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT dynamic state enabled</li>
            <li>The {@code sampleLocationsPerPixel} member of {@code pSampleLocationsInfo} <b>must</b> equal the {@code rasterizationSamples} member of the ##VkPipelineMultisampleStateCreateInfo structure the currently bound graphics pipeline has been created with</li>
            <li>If ##VkPhysicalDeviceSampleLocationsPropertiesEXT{@code ::variableSampleLocations} is #FALSE then the current render pass <b>must</b> have been begun by specifying a ##VkRenderPassSampleLocationsBeginInfoEXT structure whose {@code pPostSubpassSampleLocations} member contains an element with a {@code subpassIndex} matching the current subpass index and the {@code sampleLocationsInfo} member of that element <b>must</b> match the sample locations state pointed to by {@code pSampleLocationsInfo}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pSampleLocationsInfo} <b>must</b> be a pointer to a valid ##VkSampleLocationsInfoEXT structure</li>
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

        <h5>See Also</h5>
        ##VkSampleLocationsInfoEXT
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command will be recorded."),
        const..VkSampleLocationsInfoEXT.p.IN("pSampleLocationsInfo", "the sample locations state to set.")
    )

    void(
        "GetPhysicalDeviceMultisamplePropertiesEXT",
        """
        Report sample count specific multisampling capabilities of a physical device.

        <h5>C Specification</h5>
        In addition to the minimum capabilities described in the previous section (<a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-limits">Limits</a>), implementations <b>may</b> support additional multisampling capabilities specific to a particular sample count.

        To query additional sample count specific multisampling capabilities, call:

        <code><pre>
￿void vkGetPhysicalDeviceMultisamplePropertiesEXT(
￿    VkPhysicalDevice                            physicalDevice,
￿    VkSampleCountFlagBits                       samples,
￿    VkMultisamplePropertiesEXT*                 pMultisampleProperties);</pre></code>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code samples} <b>must</b> be a valid {@code VkSampleCountFlagBits} value</li>
            <li>{@code pMultisampleProperties} <b>must</b> be a pointer to a ##VkMultisamplePropertiesEXT structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkMultisamplePropertiesEXT
        """,

        VkPhysicalDevice.IN("physicalDevice", "the physical device from which to query the additional multisampling capabilities."),
        VkSampleCountFlagBits.IN("samples", "the sample count to query the capabilities for."),
        VkMultisamplePropertiesEXT.p.OUT("pMultisampleProperties", "a pointer to a structure of type ##VkMultisamplePropertiesEXT, in which information about the additional multisampling capabilities specific to the sample count is returned.")
    )
}