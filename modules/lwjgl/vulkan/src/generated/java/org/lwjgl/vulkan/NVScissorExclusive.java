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
 * This extension adds support for an exclusive scissor test to Vulkan. The exclusive scissor test behaves like the scissor test, except that the exclusive scissor test fails for pixels inside the corresponding rectangle and passes for pixels outside the rectangle. If the same rectangle is used for both the scissor and exclusive scissor tests, the exclusive scissor test will pass if and only if the scissor test fails.
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_NV_scissor_exclusive}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>206</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Pat Brown <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_NV_scissor_exclusive:%20&amp;body=@nvpbrown%20">nvpbrown</a></li>
 * </ul></dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2018-07-31</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd>None</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Pat Brown, NVIDIA</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Piers Daniell, NVIDIA</li>
 * <li>Daniel Koch, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public class NVScissorExclusive {

    /** The extension specification version. */
    public static final int VK_NV_SCISSOR_EXCLUSIVE_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_NV_SCISSOR_EXCLUSIVE_EXTENSION_NAME = "VK_NV_scissor_exclusive";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_EXCLUSIVE_SCISSOR_STATE_CREATE_INFO_NV STRUCTURE_TYPE_PIPELINE_VIEWPORT_EXCLUSIVE_SCISSOR_STATE_CREATE_INFO_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXCLUSIVE_SCISSOR_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_EXCLUSIVE_SCISSOR_FEATURES_NV}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_EXCLUSIVE_SCISSOR_STATE_CREATE_INFO_NV = 1000205000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXCLUSIVE_SCISSOR_FEATURES_NV            = 1000205002;

    /** Extends {@code VkDynamicState}. */
    public static final int VK_DYNAMIC_STATE_EXCLUSIVE_SCISSOR_NV = 1000205001;

    protected NVScissorExclusive() {
        throw new UnsupportedOperationException();
    }

    static boolean checkCapsDevice(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("VK_NV_scissor_exclusive") && VK.checkExtension("VK_NV_scissor_exclusive",
               VK.isSupported(provider, "vkCmdSetExclusiveScissorNV", caps)
        );
    }

    // --- [ vkCmdSetExclusiveScissorNV ] ---

    /**
     * Unsafe version of: {@link #vkCmdSetExclusiveScissorNV CmdSetExclusiveScissorNV}
     *
     * @param exclusiveScissorCount the number of exclusive scissor rectangles updated by the command.
     */
    public static void nvkCmdSetExclusiveScissorNV(VkCommandBuffer commandBuffer, int firstExclusiveScissor, int exclusiveScissorCount, long pExclusiveScissors) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetExclusiveScissorNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), firstExclusiveScissor, exclusiveScissorCount, pExclusiveScissors, __functionAddress);
    }

    /**
     * Set the dynamic exclusive scissor rectangles on a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>If the pipeline state object is created with {@link #VK_DYNAMIC_STATE_EXCLUSIVE_SCISSOR_NV DYNAMIC_STATE_EXCLUSIVE_SCISSOR_NV} enabled, then the exclusive scissor rectangles are set by:</p>
     * 
     * <pre><code>
     * void vkCmdSetExclusiveScissorNV(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    firstExclusiveScissor,
     *     uint32_t                                    exclusiveScissorCount,
     *     const VkRect2D*                             pExclusiveScissors);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The scissor rectangles taken from element <code>i</code> of {@code pExclusiveScissors} replace the current state for the scissor index <code>firstExclusiveScissor + i</code>, for <code>i</code> in <code>[0, exclusiveScissorCount)</code>.</p>
     * 
     * <p>Each scissor rectangle is described by a {@link VkRect2D} structure, with the {@code offset.x} and {@code offset.y} values determining the upper left corner of the scissor rectangle, and the {@code extent.width} and {@code extent.height} values determining the size in pixels.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#features-features-exclusiveScissor">exclusive scissor</a> feature <b>must</b> be enabled.</li>
     * <li>The bound graphics pipeline <b>must</b> have been created with the {@link #VK_DYNAMIC_STATE_EXCLUSIVE_SCISSOR_NV DYNAMIC_STATE_EXCLUSIVE_SCISSOR_NV} dynamic state enabled</li>
     * <li>{@code firstExclusiveScissor} <b>must</b> be less than {@link VkPhysicalDeviceLimits}{@code ::maxViewports}</li>
     * <li>The sum of {@code firstExclusiveScissor} and {@code exclusiveScissorCount} <b>must</b> be between 1 and {@link VkPhysicalDeviceLimits}{@code ::maxViewports}, inclusive</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#features-features-multiViewport">multiple viewports</a> feature is not enabled, {@code firstExclusiveScissor} <b>must</b> be 0</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#features-features-multiViewport">multiple viewports</a> feature is not enabled, {@code exclusiveScissorCount} <b>must</b> be 1</li>
     * <li>The {@code x} and {@code y} members of {@code offset} in each member of {@code pExclusiveScissors} <b>must</b> be greater than or equal to 0</li>
     * <li>Evaluation of <code>(offset.x + extent.width)</code> for each member of {@code pExclusiveScissors} <b>must</b> not cause a signed integer addition overflow</li>
     * <li>Evaluation of <code>(offset.y + extent.height)</code> for each member of {@code pExclusiveScissors} <b>must</b> not cause a signed integer addition overflow</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pExclusiveScissors} <b>must</b> be a valid pointer to an array of {@code exclusiveScissorCount} {@link VkRect2D} structures</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>{@code exclusiveScissorCount} <b>must</b> be greater than 0</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td><td></td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkRect2D}</p>
     *
     * @param commandBuffer         the command buffer into which the command will be recorded.
     * @param firstExclusiveScissor the index of the first exclusive scissor rectangle whose state is updated by the command.
     * @param pExclusiveScissors    a pointer to an array of {@link VkRect2D} structures defining exclusive scissor rectangles.
     */
    public static void vkCmdSetExclusiveScissorNV(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstExclusiveScissor, @NativeType("VkRect2D const *") VkRect2D.Buffer pExclusiveScissors) {
        nvkCmdSetExclusiveScissorNV(commandBuffer, firstExclusiveScissor, pExclusiveScissors.remaining(), pExclusiveScissors.address());
    }

}