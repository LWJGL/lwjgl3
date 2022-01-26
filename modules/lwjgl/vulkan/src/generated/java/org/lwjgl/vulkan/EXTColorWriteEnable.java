/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This extension allows for selectively enabling and disabling writes to output color attachments via a pipeline dynamic state.
 * 
 * <p>The intended use cases for this new state are mostly identical to those of colorWriteMask, such as selectively disabling writes to avoid feedback loops between subpasses or bandwidth savings for unused outputs. By making the state dynamic, one additional benefit is the ability to reduce pipeline counts and pipeline switching via shaders that write a superset of the desired data of which subsets are selected dynamically. The reason for a new state, colorWriteEnable, rather than making colorWriteMask dynamic is that, on many implementations, the more flexible per-component semantics of the colorWriteMask state cannot be made dynamic in a performant manner.</p>
 * 
 * <h5>VK_EXT_color_write_enable</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_color_write_enable}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>382</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Sharif Elcott <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_color_write_enable]%20@selcott%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_color_write_enable%20extension%3E%3E">selcott</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2020-02-25</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Sharif Elcott, Google</li>
 * <li>Tobias Hector, AMD</li>
 * <li>Piers Daniell, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public class EXTColorWriteEnable {

    /** The extension specification version. */
    public static final int VK_EXT_COLOR_WRITE_ENABLE_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_COLOR_WRITE_ENABLE_EXTENSION_NAME = "VK_EXT_color_write_enable";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COLOR_WRITE_ENABLE_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_COLOR_WRITE_ENABLE_FEATURES_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_COLOR_WRITE_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_COLOR_WRITE_CREATE_INFO_EXT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COLOR_WRITE_ENABLE_FEATURES_EXT = 1000381000,
        VK_STRUCTURE_TYPE_PIPELINE_COLOR_WRITE_CREATE_INFO_EXT            = 1000381001;

    /** Extends {@code VkDynamicState}. */
    public static final int VK_DYNAMIC_STATE_COLOR_WRITE_ENABLE_EXT = 1000381000;

    protected EXTColorWriteEnable() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdSetColorWriteEnableEXT ] ---

    /**
     * Unsafe version of: {@link #vkCmdSetColorWriteEnableEXT CmdSetColorWriteEnableEXT}
     *
     * @param attachmentCount the number of {@code VkBool32} elements in {@code pColorWriteEnables}.
     */
    public static void nvkCmdSetColorWriteEnableEXT(VkCommandBuffer commandBuffer, int attachmentCount, long pColorWriteEnables) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetColorWriteEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), attachmentCount, pColorWriteEnables, __functionAddress);
    }

    /**
     * Enable or disable writes to a color attachment dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically enable or disable</a> writes to a color attachment, call:</p>
     * 
     * <pre><code>
     * void                                    vkCmdSetColorWriteEnableEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    attachmentCount,
     *     const VkBool32*                             pColorWriteEnables);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the color write enables for subsequent drawing commands when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_COLOR_WRITE_ENABLE_EXT DYNAMIC_STATE_COLOR_WRITE_ENABLE_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineColorWriteCreateInfoEXT}{@code ::pColorWriteEnables} values used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-colorWriteEnable">colorWriteEnable</a> feature <b>must</b> be enabled</li>
     * <li>{@code attachmentCount} <b>must</b> be equal to the {@code attachmentCount} member of the {@link VkPipelineColorBlendStateCreateInfo} structure specified during pipeline creation</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pColorWriteEnables} <b>must</b> be a valid pointer to an array of {@code attachmentCount} {@code VkBool32} values</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>{@code attachmentCount} <b>must</b> be greater than 0</li>
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
     * @param commandBuffer      the command buffer into which the command will be recorded.
     * @param pColorWriteEnables a pointer to an array of per target attachment boolean values specifying whether color writes are enabled for the given attachment.
     */
    public static void vkCmdSetColorWriteEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32 const *") IntBuffer pColorWriteEnables) {
        nvkCmdSetColorWriteEnableEXT(commandBuffer, pColorWriteEnables.remaining(), memAddress(pColorWriteEnables));
    }

    /** Array version of: {@link #vkCmdSetColorWriteEnableEXT CmdSetColorWriteEnableEXT} */
    public static void vkCmdSetColorWriteEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32 const *") int[] pColorWriteEnables) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetColorWriteEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pColorWriteEnables.length, pColorWriteEnables, __functionAddress);
    }

}