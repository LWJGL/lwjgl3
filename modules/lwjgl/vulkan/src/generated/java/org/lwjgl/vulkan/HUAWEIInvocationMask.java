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
 * The rays to trace may be sparse in some use cases. For example, the scene only have a few regions to reflect. Providing an invocation mask image to the ray tracing commands could potentially give the hardware the hint to do certain optimization without invoking an additional pass to compact the ray buffer.
 * 
 * <h5>Examples</h5>
 * 
 * <p>RT mask is updated before each traceRay.</p>
 * 
 * <p>Step 1. Generate InvocationMask.</p>
 * 
 * <pre><code>
 * //the rt mask image bind as color attachment in the fragment shader
 * Layout(location = 2) out vec4 outRTmask
 * vec4 mask = vec4(x,x,x,x);
 * outRTmask = mask;</code></pre>
 * 
 * <p>Step 2. traceRay with InvocationMask</p>
 * 
 * <pre><code>
 * vkCmdBindPipeline(
 *     commandBuffers[imageIndex],
 *     VK_PIPELINE_BIND_POINT_RAY_TRACING_KHR, m_rtPipeline);
 *     vkCmdBindDescriptorSets(commandBuffers[imageIndex],
 *     VK_PIPELINE_BIND_POINT_RAY_TRACING_NV,
 *     m_rtPipelineLayout, 0, 1, &amp;m_rtDescriptorSet,
 *     0, nullptr);
 * 
 * vkCmdBindInvocationMaskHUAWEI(
 *     commandBuffers[imageIndex],
 *     InvocationMaskimageView,
 *     InvocationMaskimageLayout);
 *     vkCmdTraceRaysKHR(commandBuffers[imageIndex],
 *     pRaygenShaderBindingTable,
 *     pMissShaderBindingTable,
 *     swapChainExtent.width,
 *     swapChainExtent.height, 1);</code></pre>
 * 
 * <h5>VK_HUAWEI_invocation_mask</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_HUAWEI_invocation_mask}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>371</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRRayTracingPipeline VK_KHR_ray_tracing_pipeline}</li>
 * <li>Requires {@link KHRSynchronization2 VK_KHR_synchronization2}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Yunpeng Zhu <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_HUAWEI_invocation_mask]%20@yunxingzhu%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_HUAWEI_invocation_mask%20extension%3E%3E">yunxingzhu</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_HUAWEI_invocation_mask.asciidoc">VK_HUAWEI_invocation_mask</a></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2021-05-27</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension requires {@link KHRRayTracingPipeline VK_KHR_ray_tracing_pipeline}, which allow to bind an invocation mask image before the ray tracing command</li>
 * <li>This extension requires {@link KHRSynchronization2 VK_KHR_synchronization2}, which allows new pipeline stage for the invocation mask image</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Yunpeng Zhu, HuaWei</li>
 * </ul></dd>
 * </dl>
 */
public class HUAWEIInvocationMask {

    /** The extension specification version. */
    public static final int VK_HUAWEI_INVOCATION_MASK_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_HUAWEI_INVOCATION_MASK_EXTENSION_NAME = "VK_HUAWEI_invocation_mask";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INVOCATION_MASK_FEATURES_HUAWEI = 1000370000;

    /** Extends {@code VkAccessFlagBits2}. */
    public static final long VK_ACCESS_2_INVOCATION_MASK_READ_BIT_HUAWEI = 0x8000000000L;

    /** Extends {@code VkImageUsageFlagBits}. */
    public static final int VK_IMAGE_USAGE_INVOCATION_MASK_BIT_HUAWEI = 0x40000;

    /** Extends {@code VkPipelineStageFlagBits2}. */
    public static final long VK_PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI = 0x10000000000L;

    protected HUAWEIInvocationMask() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdBindInvocationMaskHUAWEI ] ---

    /**
     * Bind an invocation mask image on a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>When invocation mask image usage is enabled in the bound ray tracing pipeline, the pipeline uses an invocation mask image specified by the command:</p>
     * 
     * <pre><code>
     * void vkCmdBindInvocationMaskHUAWEI(
     *     VkCommandBuffer                             commandBuffer,
     *     VkImageView                                 imageView,
     *     VkImageLayout                               imageLayout);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-invocationMask">invocation mask image</a> feature <b>must</b> be enabled</li>
     * <li>If {@code imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, it <b>must</b> be a valid {@code VkImageView} handle of type {@link VK10#VK_IMAGE_VIEW_TYPE_2D IMAGE_VIEW_TYPE_2D}</li>
     * <li>If {@code imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, it <b>must</b> have a format of {@link VK10#VK_FORMAT_R8_UINT FORMAT_R8_UINT}</li>
     * <li>If {@code imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, it <b>must</b> have been created with {@link #VK_IMAGE_USAGE_INVOCATION_MASK_BIT_HUAWEI IMAGE_USAGE_INVOCATION_MASK_BIT_HUAWEI} set</li>
     * <li>If {@code imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code imageLayout} <b>must</b> be {@link VK10#VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</li>
     * <li>Thread mask image resolution must match the {@code width} and {@code height} in {@link KHRRayTracingPipeline#vkCmdTraceRaysKHR CmdTraceRaysKHR}</li>
     * <li>Each element in the invocation mask image <b>must</b> have the value 0 or 1. The value 1 means the invocation is active</li>
     * <li>{@code width} in {@link KHRRayTracingPipeline#vkCmdTraceRaysKHR CmdTraceRaysKHR} should be 1</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>If {@code imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code imageView} <b>must</b> be a valid {@code VkImageView} handle</li>
     * <li>{@code imageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
     * <li>This command <b>must</b> only be called outside of a render pass instance</li>
     * <li>Both of {@code commandBuffer}, and {@code imageView} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Compute</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer the command buffer into which the command will be recorded
     * @param imageView     an image view handle specifying the invocation mask image {@code imageView} <b>may</b> be set to {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, which is equivalent to specifying a view of an image filled with ones value.
     * @param imageLayout   the layout that the image subresources accessible from {@code imageView} will be in when the invocation mask image is accessed
     */
    public static void vkCmdBindInvocationMaskHUAWEI(VkCommandBuffer commandBuffer, @NativeType("VkImageView") long imageView, @NativeType("VkImageLayout") int imageLayout) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindInvocationMaskHUAWEI;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJV(commandBuffer.address(), imageView, imageLayout, __functionAddress);
    }

}