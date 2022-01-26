/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * This extension allows an application to modify the locations of samples within a pixel used in rasterization. Additionally, it allows applications to specify different sample locations for each pixel in a group of adjacent pixels, which <b>can</b> increase antialiasing quality (particularly if a custom resolve shader is used that takes advantage of these different locations).
 * 
 * <p>It is common for implementations to optimize the storage of depth values by storing values that <b>can</b> be used to reconstruct depth at each sample location, rather than storing separate depth values for each sample. For example, the depth values from a single triangle <b>may</b> be represented using plane equations. When the depth value for a sample is needed, it is automatically evaluated at the sample location. Modifying the sample locations causes the reconstruction to no longer evaluate the same depth values as when the samples were originally generated, thus the depth aspect of a depth/stencil attachment <b>must</b> be cleared before rendering to it using different sample locations.</p>
 * 
 * <p>Some implementations <b>may</b> need to evaluate depth image values while performing image layout transitions. To accommodate this, instances of the {@link VkSampleLocationsInfoEXT} structure <b>can</b> be specified for each situation where an explicit or automatic layout transition has to take place. {@link VkSampleLocationsInfoEXT} <b>can</b> be chained from {@link VkImageMemoryBarrier} structures to provide sample locations for layout transitions performed by {@link VK10#vkCmdWaitEvents CmdWaitEvents} and {@link VK10#vkCmdPipelineBarrier CmdPipelineBarrier} calls, and {@link VkRenderPassSampleLocationsBeginInfoEXT} <b>can</b> be chained from {@link VkRenderPassBeginInfo} to provide sample locations for layout transitions performed implicitly by a render pass instance.</p>
 * 
 * <h5>VK_EXT_sample_locations</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_sample_locations}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>144</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Daniel Rakos <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_sample_locations]%20@drakos-amd%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_sample_locations%20extension%3E%3E">drakos-amd</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2017-08-02</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Mais Alnasser, AMD</li>
 * <li>Matthaeus G. Chajdas, AMD</li>
 * <li>Maciej Jesionowski, AMD</li>
 * <li>Daniel Rakos, AMD</li>
 * <li>Slawomir Grajewski, Intel</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Bill Licea-Kane, Qualcomm</li>
 * </ul></dd>
 * </dl>
 */
public class EXTSampleLocations {

    /** The extension specification version. */
    public static final int VK_EXT_SAMPLE_LOCATIONS_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_SAMPLE_LOCATIONS_EXTENSION_NAME = "VK_EXT_sample_locations";

    /** Extends {@code VkImageCreateFlagBits}. */
    public static final int VK_IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT = 0x1000;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_SAMPLE_LOCATIONS_INFO_EXT STRUCTURE_TYPE_SAMPLE_LOCATIONS_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_RENDER_PASS_SAMPLE_LOCATIONS_BEGIN_INFO_EXT STRUCTURE_TYPE_RENDER_PASS_SAMPLE_LOCATIONS_BEGIN_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_SAMPLE_LOCATIONS_STATE_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_SAMPLE_LOCATIONS_STATE_CREATE_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLE_LOCATIONS_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLE_LOCATIONS_PROPERTIES_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_MULTISAMPLE_PROPERTIES_EXT STRUCTURE_TYPE_MULTISAMPLE_PROPERTIES_EXT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_SAMPLE_LOCATIONS_INFO_EXT                       = 1000143000,
        VK_STRUCTURE_TYPE_RENDER_PASS_SAMPLE_LOCATIONS_BEGIN_INFO_EXT     = 1000143001,
        VK_STRUCTURE_TYPE_PIPELINE_SAMPLE_LOCATIONS_STATE_CREATE_INFO_EXT = 1000143002,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLE_LOCATIONS_PROPERTIES_EXT = 1000143003,
        VK_STRUCTURE_TYPE_MULTISAMPLE_PROPERTIES_EXT                      = 1000143004;

    /** Extends {@code VkDynamicState}. */
    public static final int VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT = 1000143000;

    protected EXTSampleLocations() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdSetSampleLocationsEXT ] ---

    /** Unsafe version of: {@link #vkCmdSetSampleLocationsEXT CmdSetSampleLocationsEXT} */
    public static void nvkCmdSetSampleLocationsEXT(VkCommandBuffer commandBuffer, long pSampleLocationsInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetSampleLocationsEXT;
        if (CHECKS) {
            check(__functionAddress);
            VkSampleLocationsInfoEXT.validate(pSampleLocationsInfo);
        }
        callPPV(commandBuffer.address(), pSampleLocationsInfo, __functionAddress);
    }

    /**
     * Set sample locations dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the sample locations used for rasterization, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetSampleLocationsEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkSampleLocationsInfoEXT*             pSampleLocationsInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the custom sample locations for subsequent drawing commands when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}, and when the {@link VkPipelineSampleLocationsStateCreateInfoEXT}{@code ::sampleLocationsEnable} property of the bound graphics pipeline is {@link VK10#VK_TRUE TRUE}. Otherwise, this state is specified by the {@link VkPipelineSampleLocationsStateCreateInfoEXT}{@code ::sampleLocationsInfo} values used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The {@code sampleLocationsPerPixel} member of {@code pSampleLocationsInfo} <b>must</b> equal the {@code rasterizationSamples} member of the {@link VkPipelineMultisampleStateCreateInfo} structure the bound graphics pipeline has been created with</li>
     * <li>If {@link VkPhysicalDeviceSampleLocationsPropertiesEXT}{@code ::variableSampleLocations} is {@link VK10#VK_FALSE FALSE} then the current render pass <b>must</b> have been begun by specifying a {@link VkRenderPassSampleLocationsBeginInfoEXT} structure whose {@code pPostSubpassSampleLocations} member contains an element with a {@code subpassIndex} matching the current subpass index and the {@code sampleLocationsInfo} member of that element <b>must</b> match the sample locations state pointed to by {@code pSampleLocationsInfo}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pSampleLocationsInfo} <b>must</b> be a valid pointer to a valid {@link VkSampleLocationsInfoEXT} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
     * <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Command Properties</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkSampleLocationsInfoEXT}</p>
     *
     * @param commandBuffer        the command buffer into which the command will be recorded.
     * @param pSampleLocationsInfo the sample locations state to set.
     */
    public static void vkCmdSetSampleLocationsEXT(VkCommandBuffer commandBuffer, @NativeType("VkSampleLocationsInfoEXT const *") VkSampleLocationsInfoEXT pSampleLocationsInfo) {
        nvkCmdSetSampleLocationsEXT(commandBuffer, pSampleLocationsInfo.address());
    }

    // --- [ vkGetPhysicalDeviceMultisamplePropertiesEXT ] ---

    /** Unsafe version of: {@link #vkGetPhysicalDeviceMultisamplePropertiesEXT GetPhysicalDeviceMultisamplePropertiesEXT} */
    public static void nvkGetPhysicalDeviceMultisamplePropertiesEXT(VkPhysicalDevice physicalDevice, int samples, long pMultisampleProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceMultisamplePropertiesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(physicalDevice.address(), samples, pMultisampleProperties, __functionAddress);
    }

    /**
     * Report sample count specific multisampling capabilities of a physical device.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query additional multisampling capabilities which <b>may</b> be supported for a specific sample count, beyond the minimum capabilities described for <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits">Limits</a> above, call:</p>
     * 
     * <pre><code>
     * void vkGetPhysicalDeviceMultisamplePropertiesEXT(
     *     VkPhysicalDevice                            physicalDevice,
     *     VkSampleCountFlagBits                       samples,
     *     VkMultisamplePropertiesEXT*                 pMultisampleProperties);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code samples} <b>must</b> be a valid {@code VkSampleCountFlagBits} value</li>
     * <li>{@code pMultisampleProperties} <b>must</b> be a valid pointer to a {@link VkMultisamplePropertiesEXT} structure</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkMultisamplePropertiesEXT}</p>
     *
     * @param physicalDevice         the physical device from which to query the additional multisampling capabilities.
     * @param samples                a {@code VkSampleCountFlagBits} value specifying the sample count to query capabilities for.
     * @param pMultisampleProperties a pointer to a {@link VkMultisamplePropertiesEXT} structure in which information about additional multisampling capabilities specific to the sample count is returned.
     */
    public static void vkGetPhysicalDeviceMultisamplePropertiesEXT(VkPhysicalDevice physicalDevice, @NativeType("VkSampleCountFlagBits") int samples, @NativeType("VkMultisamplePropertiesEXT *") VkMultisamplePropertiesEXT pMultisampleProperties) {
        nvkGetPhysicalDeviceMultisamplePropertiesEXT(physicalDevice, samples, pMultisampleProperties.address());
    }

}