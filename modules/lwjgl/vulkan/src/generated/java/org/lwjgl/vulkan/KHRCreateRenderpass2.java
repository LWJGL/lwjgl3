/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This extension provides a new entry point to create render passes in a way that can be easily extended by other extensions through the substructures of render pass creation. The Vulkan 1.0 render pass creation sub-structures do not include {@code sType}/{@code pNext} members. Additionally, the renderpass begin/next/end commands have been augmented with new extensible structures for passing additional subpass information.
 * 
 * <p>The {@link VkRenderPassMultiviewCreateInfo} and {@link VkInputAttachmentAspectReference} structures that extended the original {@link VkRenderPassCreateInfo} are not accepted into the new creation functions, and instead their parameters are folded into this extension as follows:</p>
 * 
 * <ul>
 * <li>Elements of {@link VkRenderPassMultiviewCreateInfo}{@code ::pViewMasks} are now specified in {@link VkSubpassDescription2KHR}{@code ::viewMask}.</li>
 * <li>Elements of {@link VkRenderPassMultiviewCreateInfo}{@code ::pViewOffsets} are now specified in {@link VkSubpassDependency2KHR}{@code ::viewOffset}.</li>
 * <li>{@link VkRenderPassMultiviewCreateInfo}{@code ::correlationMaskCount} and {@link VkRenderPassMultiviewCreateInfo}{@code ::pCorrelationMasks} are directly specified in {@link VkRenderPassCreateInfo2KHR}.</li>
 * <li>{@link VkInputAttachmentAspectReference}{@code ::aspectMask} is now specified in the relevant input attachment description in {@link VkAttachmentDescription2KHR}{@code ::aspectMask}</li>
 * </ul>
 * 
 * <p>The details of these mappings are explained fully in the new structures.</p>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_create_renderpass2}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>110</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRMultiview VK_KHR_multiview}</li>
 * <li>Requires {@link KHRMaintenance2 VK_KHR_maintenance2}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Tobias Hector <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_KHR_create_renderpass2:%20&amp;body=@tobias%20">tobias</a></li>
 * </ul></dd>
 * <dt>Last Modified Date</dt>
 * <dd>2018-02-07</dd>
 * <dt>Contributors</dt>
 * <dd><ul>
 * <li>Tobias Hector</li>
 * <li>Jeff Bolz</li>
 * </ul></dd>
 * </dl>
 */
public class KHRCreateRenderpass2 {

    /** The extension specification version. */
    public static final int VK_KHR_CREATE_RENDERPASS_2_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_CREATE_RENDERPASS_2_EXTENSION_NAME = "VK_KHR_create_renderpass2";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_2_KHR STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_2_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2_KHR STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2_KHR STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2_KHR STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2_KHR STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SUBPASS_BEGIN_INFO_KHR STRUCTURE_TYPE_SUBPASS_BEGIN_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SUBPASS_END_INFO_KHR STRUCTURE_TYPE_SUBPASS_END_INFO_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_2_KHR  = 1000109000,
        VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2_KHR    = 1000109001,
        VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2_KHR     = 1000109002,
        VK_STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2_KHR      = 1000109003,
        VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2_KHR = 1000109004,
        VK_STRUCTURE_TYPE_SUBPASS_BEGIN_INFO_KHR        = 1000109005,
        VK_STRUCTURE_TYPE_SUBPASS_END_INFO_KHR          = 1000109006;

    protected KHRCreateRenderpass2() {
        throw new UnsupportedOperationException();
    }

    static boolean checkCapsDevice(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("VK_KHR_create_renderpass2") && VK.checkExtension("VK_KHR_create_renderpass2",
               VK.isSupported(provider, "vkCreateRenderPass2KHR", caps)
            && VK.isSupported(provider, "vkCmdBeginRenderPass2KHR", caps)
            && VK.isSupported(provider, "vkCmdNextSubpass2KHR", caps)
            && VK.isSupported(provider, "vkCmdEndRenderPass2KHR", caps)
        );
    }

    // --- [ vkCreateRenderPass2KHR ] ---

    /** Unsafe version of: {@link #vkCreateRenderPass2KHR CreateRenderPass2KHR} */
    public static int nvkCreateRenderPass2KHR(VkDevice device, long pCreateInfo, long pAllocator, long pRenderPass) {
        long __functionAddress = device.getCapabilities().vkCreateRenderPass2KHR;
        if (CHECKS) {
            check(__functionAddress);
            VkRenderPassCreateInfo2KHR.validate(pCreateInfo);
            if (pAllocator != NULL) { VkAllocationCallbacks.validate(pAllocator); }
        }
        return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pRenderPass);
    }

    /**
     * Create a new render pass object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To create a render pass, call:</p>
     * 
     * <pre><code>
     * VkResult vkCreateRenderPass2KHR(
     *     VkDevice                                    device,
     *     const VkRenderPassCreateInfo2KHR*           pCreateInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkRenderPass*                               pRenderPass);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command is functionally identical to {@link VK10#vkCreateRenderPass CreateRenderPass}, but includes extensible sub-structures that include {@code sType} and {@code pNext} parameters, allowing them to be more easily extended.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid {@link VkRenderPassCreateInfo2KHR} structure</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code pRenderPass} <b>must</b> be a valid pointer to a {@code VkRenderPass} handle</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}, {@link VkRenderPassCreateInfo2KHR}</p>
     *
     * @param device      the logical device that creates the render pass.
     * @param pCreateInfo a pointer to an instance of the {@link VkRenderPassCreateInfo2KHR} structure that describes the parameters of the render pass.
     * @param pAllocator  controls host memory allocation as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     * @param pRenderPass points to a {@code VkRenderPass} handle in which the resulting render pass object is returned.
     */
    @NativeType("VkResult")
    public static int vkCreateRenderPass2KHR(VkDevice device, @NativeType("VkRenderPassCreateInfo2KHR const *") VkRenderPassCreateInfo2KHR pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkRenderPass *") LongBuffer pRenderPass) {
        if (CHECKS) {
            check(pRenderPass, 1);
        }
        return nvkCreateRenderPass2KHR(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pRenderPass));
    }

    // --- [ vkCmdBeginRenderPass2KHR ] ---

    /** Unsafe version of: {@link #vkCmdBeginRenderPass2KHR CmdBeginRenderPass2KHR} */
    public static void nvkCmdBeginRenderPass2KHR(VkCommandBuffer commandBuffer, long pRenderPassBegin, long pSubpassBeginInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBeginRenderPass2KHR;
        if (CHECKS) {
            check(__functionAddress);
            VkRenderPassBeginInfo.validate(pRenderPassBegin);
        }
        callPPPV(__functionAddress, commandBuffer.address(), pRenderPassBegin, pSubpassBeginInfo);
    }

    /**
     * Begin a new render pass.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Alternatively to begin a render pass, call:</p>
     * 
     * <pre><code>
     * void vkCmdBeginRenderPass2KHR(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkRenderPassBeginInfo*                pRenderPassBegin,
     *     const VkSubpassBeginInfoKHR*                pSubpassBeginInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>After beginning a render pass instance, the command buffer is ready to record the commands for the first subpass of that render pass.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If any of the {@code initialLayout} or {@code finalLayout} member of the {@link VkAttachmentDescription} structures or the {@code layout} member of the {@link VkAttachmentReference} structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin} is {@link VK10#VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL} then the corresponding attachment image view of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin} <b>must</b> have been created with a {@code usage} value including {@link VK10#VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT}</li>
     * <li>If any of the {@code initialLayout} or {@code finalLayout} member of the {@link VkAttachmentDescription} structures or the {@code layout} member of the {@link VkAttachmentReference} structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin} is {@link VK11#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL}, {@link VK11#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL}, {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL}, or {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL} then the corresponding attachment image view of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin} <b>must</b> have been created with a {@code usage} value including {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}</li>
     * <li>If any of the {@code initialLayout} or {@code finalLayout} member of the {@link VkAttachmentDescription} structures or the {@code layout} member of the {@link VkAttachmentReference} structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin} is {@link VK10#VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL} then the corresponding attachment image view of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin} <b>must</b> have been created with a {@code usage} value including {@link VK10#VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT} or {@link VK10#VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT}</li>
     * <li>If any of the {@code initialLayout} or {@code finalLayout} member of the {@link VkAttachmentDescription} structures or the {@code layout} member of the {@link VkAttachmentReference} structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin} is {@link VK10#VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL} then the corresponding attachment image view of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin} <b>must</b> have been created with a {@code usage} value including {@link VK10#VK_IMAGE_USAGE_TRANSFER_SRC_BIT IMAGE_USAGE_TRANSFER_SRC_BIT}</li>
     * <li>If any of the {@code initialLayout} or {@code finalLayout} member of the {@link VkAttachmentDescription} structures or the {@code layout} member of the {@link VkAttachmentReference} structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin} is {@link VK10#VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL} then the corresponding attachment image view of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin} <b>must</b> have been created with a {@code usage} value including {@link VK10#VK_IMAGE_USAGE_TRANSFER_DST_BIT IMAGE_USAGE_TRANSFER_DST_BIT}</li>
     * <li>If any of the {@code initialLayout} members of the {@link VkAttachmentDescription} structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin} is not {@link VK10#VK_IMAGE_LAYOUT_UNDEFINED IMAGE_LAYOUT_UNDEFINED}, then each such {@code initialLayout} <b>must</b> be equal to the current layout of the corresponding attachment image subresource of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin}</li>
     * <li>The {@code srcStageMask} and {@code dstStageMask} members of any element of the {@code pDependencies} member of {@link VkRenderPassCreateInfo} used to create {@code renderPass} <b>must</b> be supported by the capabilities of the queue family identified by the {@code queueFamilyIndex} member of the {@link VkCommandPoolCreateInfo} used to create the command pool which {@code commandBuffer} was allocated from</li>
     * <li>For any attachment in {@code framebuffer} that is used by {@code renderPass} and is bound to memory locations that are also bound to another attachment used by {@code renderPass}, and if at least one of those uses causes either attachment to be written to, both attachments <b>must</b> have had the {@link VK10#VK_ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT} set</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pRenderPassBegin} <b>must</b> be a valid pointer to a valid {@link VkRenderPassBeginInfo} structure</li>
     * <li>{@code pSubpassBeginInfo} <b>must</b> be a valid pointer to a valid {@link VkSubpassBeginInfoKHR} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a render pass instance</li>
     * <li>{@code commandBuffer} <b>must</b> be a primary {@code VkCommandBuffer}</li>
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
     * <tbody><tr><td>Primary</td><td>Outside</td><td>Graphics</td><td>Graphics</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkRenderPassBeginInfo}, {@link VkSubpassBeginInfoKHR}</p>
     *
     * @param commandBuffer     the command buffer in which to record the command.
     * @param pRenderPassBegin  a pointer to a {@link VkRenderPassBeginInfo} structure (defined below) which indicates the render pass to begin an instance of, and the framebuffer the instance uses.
     * @param pSubpassBeginInfo a pointer to a {@link VkSubpassBeginInfoKHR} structure which contains information about the subpass which is about to begin rendering.
     */
    public static void vkCmdBeginRenderPass2KHR(VkCommandBuffer commandBuffer, @NativeType("VkRenderPassBeginInfo const *") VkRenderPassBeginInfo pRenderPassBegin, @NativeType("VkSubpassBeginInfoKHR const *") VkSubpassBeginInfoKHR pSubpassBeginInfo) {
        nvkCmdBeginRenderPass2KHR(commandBuffer, pRenderPassBegin.address(), pSubpassBeginInfo.address());
    }

    // --- [ vkCmdNextSubpass2KHR ] ---

    /** Unsafe version of: {@link #vkCmdNextSubpass2KHR CmdNextSubpass2KHR} */
    public static void nvkCmdNextSubpass2KHR(VkCommandBuffer commandBuffer, long pSubpassBeginInfo, long pSubpassEndInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdNextSubpass2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(__functionAddress, commandBuffer.address(), pSubpassBeginInfo, pSubpassEndInfo);
    }

    /**
     * Transition to the next subpass of a render pass.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To transition to the next subpass in the render pass instance after recording the commands for a subpass, call:</p>
     * 
     * <pre><code>
     * void vkCmdNextSubpass2KHR(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkSubpassBeginInfoKHR*                pSubpassBeginInfo,
     *     const VkSubpassEndInfoKHR*                  pSubpassEndInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@code vkCmdNextSubpass2KHR} is semantically identical to {@link VK10#vkCmdNextSubpass CmdNextSubpass}, except that it is extensible, and that {@code contents} is provided as part of an extensible structure instead of as a flat parameter.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The current subpass index <b>must</b> be less than the number of subpasses in the render pass minus one</li>
     * <li>This command <b>must</b> not be recorded when transform feedback is active</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pSubpassBeginInfo} <b>must</b> be a valid pointer to a valid {@link VkSubpassBeginInfoKHR} structure</li>
     * <li>{@code pSubpassEndInfo} <b>must</b> be a valid pointer to a valid {@link VkSubpassEndInfoKHR} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called inside of a render pass instance</li>
     * <li>{@code commandBuffer} <b>must</b> be a primary {@code VkCommandBuffer}</li>
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
     * <tbody><tr><td>Primary</td><td>Inside</td><td>Graphics</td><td>Graphics</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkSubpassBeginInfoKHR}, {@link VkSubpassEndInfoKHR}</p>
     *
     * @param commandBuffer     the command buffer in which to record the command.
     * @param pSubpassBeginInfo a pointer to a {@link VkSubpassBeginInfoKHR} structure which contains information about the subpass which is about to begin rendering.
     * @param pSubpassEndInfo   a pointer to a {@link VkSubpassEndInfoKHR} structure which contains information about how the previous subpass will be ended.
     */
    public static void vkCmdNextSubpass2KHR(VkCommandBuffer commandBuffer, @NativeType("VkSubpassBeginInfoKHR const *") VkSubpassBeginInfoKHR pSubpassBeginInfo, @NativeType("VkSubpassEndInfoKHR const *") VkSubpassEndInfoKHR pSubpassEndInfo) {
        nvkCmdNextSubpass2KHR(commandBuffer, pSubpassBeginInfo.address(), pSubpassEndInfo.address());
    }

    // --- [ vkCmdEndRenderPass2KHR ] ---

    /** Unsafe version of: {@link #vkCmdEndRenderPass2KHR CmdEndRenderPass2KHR} */
    public static void nvkCmdEndRenderPass2KHR(VkCommandBuffer commandBuffer, long pSubpassEndInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdEndRenderPass2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(__functionAddress, commandBuffer.address(), pSubpassEndInfo);
    }

    /**
     * End the current render pass.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To record a command to end a render pass instance after recording the commands for the last subpass, call:</p>
     * 
     * <pre><code>
     * void vkCmdEndRenderPass2KHR(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkSubpassEndInfoKHR*                  pSubpassEndInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@code vkCmdEndRenderPass2KHR} is semantically identical to {@link VK10#vkCmdEndRenderPass CmdEndRenderPass}, except that it is extensible.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The current subpass index <b>must</b> be equal to the number of subpasses in the render pass minus one</li>
     * <li>This command <b>must</b> not be recorded when transform feedback is active</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pSubpassEndInfo} <b>must</b> be a valid pointer to a valid {@link VkSubpassEndInfoKHR} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called inside of a render pass instance</li>
     * <li>{@code commandBuffer} <b>must</b> be a primary {@code VkCommandBuffer}</li>
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
     * <tbody><tr><td>Primary</td><td>Inside</td><td>Graphics</td><td>Graphics</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkSubpassEndInfoKHR}</p>
     *
     * @param commandBuffer   the command buffer in which to end the current render pass instance.
     * @param pSubpassEndInfo a pointer to a {@link VkSubpassEndInfoKHR} structure which contains information about how the previous subpass will be ended.
     */
    public static void vkCmdEndRenderPass2KHR(VkCommandBuffer commandBuffer, @NativeType("VkSubpassEndInfoKHR const *") VkSubpassEndInfoKHR pSubpassEndInfo) {
        nvkCmdEndRenderPass2KHR(commandBuffer, pSubpassEndInfo.address());
    }

    /** Array version of: {@link #vkCreateRenderPass2KHR CreateRenderPass2KHR} */
    @NativeType("VkResult")
    public static int vkCreateRenderPass2KHR(VkDevice device, @NativeType("VkRenderPassCreateInfo2KHR const *") VkRenderPassCreateInfo2KHR pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkRenderPass *") long[] pRenderPass) {
        long __functionAddress = device.getCapabilities().vkCreateRenderPass2KHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pRenderPass, 1);
            VkRenderPassCreateInfo2KHR.validate(pCreateInfo.address());
            if (pAllocator != null) { VkAllocationCallbacks.validate(pAllocator.address()); }
        }
        return callPPPPI(__functionAddress, device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pRenderPass);
    }

}