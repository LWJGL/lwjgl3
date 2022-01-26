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
 * This extension provides a new entry point to create render passes in a way that can be easily extended by other extensions through the substructures of render pass creation. The Vulkan 1.0 render pass creation sub-structures do not include {@code sType}/{@code pNext} members. Additionally, the render pass begin/next/end commands have been augmented with new extensible structures for passing additional subpass information.
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
 * <h5>Promotion to Vulkan 1.2</h5>
 * 
 * <p>All functionality in this extension is included in core Vulkan 1.2, with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.</p>
 * 
 * <h5>VK_KHR_create_renderpass2</h5>
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
 * <dt><b>Deprecation state</b></dt>
 * <dd><ul>
 * <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#versions-1.2-promotions">Vulkan 1.2</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Tobias Hector <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_create_renderpass2]%20@tobias%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_create_renderpass2%20extension%3E%3E">tobias</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2018-02-07</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>Promoted to Vulkan 1.2 Core</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
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

    // --- [ vkCreateRenderPass2KHR ] ---

    /** Unsafe version of: {@link #vkCreateRenderPass2KHR CreateRenderPass2KHR} */
    public static int nvkCreateRenderPass2KHR(VkDevice device, long pCreateInfo, long pAllocator, long pRenderPass) {
        long __functionAddress = device.getCapabilities().vkCreateRenderPass2KHR;
        if (CHECKS) {
            check(__functionAddress);
            VkRenderPassCreateInfo2.validate(pCreateInfo);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pRenderPass, __functionAddress);
    }

    /**
     * See {@link VK12#vkCreateRenderPass2 CreateRenderPass2}.
     *
     * @param device      the logical device that creates the render pass.
     * @param pCreateInfo a pointer to a {@link VkRenderPassCreateInfo2} structure describing the parameters of the render pass.
     * @param pAllocator  controls host memory allocation as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     * @param pRenderPass a pointer to a {@code VkRenderPass} handle in which the resulting render pass object is returned.
     */
    @NativeType("VkResult")
    public static int vkCreateRenderPass2KHR(VkDevice device, @NativeType("VkRenderPassCreateInfo2 const *") VkRenderPassCreateInfo2 pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkRenderPass *") LongBuffer pRenderPass) {
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
        }
        callPPPV(commandBuffer.address(), pRenderPassBegin, pSubpassBeginInfo, __functionAddress);
    }

    /**
     * See {@link VK12#vkCmdBeginRenderPass2 CmdBeginRenderPass2}.
     *
     * @param commandBuffer     the command buffer in which to record the command.
     * @param pRenderPassBegin  a pointer to a {@link VkRenderPassBeginInfo} structure specifying the render pass to begin an instance of, and the framebuffer the instance uses.
     * @param pSubpassBeginInfo a pointer to a {@link VkSubpassBeginInfo} structure containing information about the subpass which is about to begin rendering.
     */
    public static void vkCmdBeginRenderPass2KHR(VkCommandBuffer commandBuffer, @NativeType("VkRenderPassBeginInfo const *") VkRenderPassBeginInfo pRenderPassBegin, @NativeType("VkSubpassBeginInfo const *") VkSubpassBeginInfo pSubpassBeginInfo) {
        nvkCmdBeginRenderPass2KHR(commandBuffer, pRenderPassBegin.address(), pSubpassBeginInfo.address());
    }

    // --- [ vkCmdNextSubpass2KHR ] ---

    /** Unsafe version of: {@link #vkCmdNextSubpass2KHR CmdNextSubpass2KHR} */
    public static void nvkCmdNextSubpass2KHR(VkCommandBuffer commandBuffer, long pSubpassBeginInfo, long pSubpassEndInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdNextSubpass2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(commandBuffer.address(), pSubpassBeginInfo, pSubpassEndInfo, __functionAddress);
    }

    /**
     * See {@link VK12#vkCmdNextSubpass2 CmdNextSubpass2}.
     *
     * @param commandBuffer     the command buffer in which to record the command.
     * @param pSubpassBeginInfo a pointer to a {@link VkSubpassBeginInfo} structure containing information about the subpass which is about to begin rendering.
     * @param pSubpassEndInfo   a pointer to a {@link VkSubpassEndInfo} structure containing information about how the previous subpass will be ended.
     */
    public static void vkCmdNextSubpass2KHR(VkCommandBuffer commandBuffer, @NativeType("VkSubpassBeginInfo const *") VkSubpassBeginInfo pSubpassBeginInfo, @NativeType("VkSubpassEndInfo const *") VkSubpassEndInfo pSubpassEndInfo) {
        nvkCmdNextSubpass2KHR(commandBuffer, pSubpassBeginInfo.address(), pSubpassEndInfo.address());
    }

    // --- [ vkCmdEndRenderPass2KHR ] ---

    /** Unsafe version of: {@link #vkCmdEndRenderPass2KHR CmdEndRenderPass2KHR} */
    public static void nvkCmdEndRenderPass2KHR(VkCommandBuffer commandBuffer, long pSubpassEndInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdEndRenderPass2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pSubpassEndInfo, __functionAddress);
    }

    /**
     * See {@link VK12#vkCmdEndRenderPass2 CmdEndRenderPass2}.
     *
     * @param commandBuffer   the command buffer in which to end the current render pass instance.
     * @param pSubpassEndInfo a pointer to a {@link VkSubpassEndInfo} structure containing information about how the previous subpass will be ended.
     */
    public static void vkCmdEndRenderPass2KHR(VkCommandBuffer commandBuffer, @NativeType("VkSubpassEndInfo const *") VkSubpassEndInfo pSubpassEndInfo) {
        nvkCmdEndRenderPass2KHR(commandBuffer, pSubpassEndInfo.address());
    }

    /** Array version of: {@link #vkCreateRenderPass2KHR CreateRenderPass2KHR} */
    @NativeType("VkResult")
    public static int vkCreateRenderPass2KHR(VkDevice device, @NativeType("VkRenderPassCreateInfo2 const *") VkRenderPassCreateInfo2 pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkRenderPass *") long[] pRenderPass) {
        long __functionAddress = device.getCapabilities().vkCreateRenderPass2KHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pRenderPass, 1);
            VkRenderPassCreateInfo2.validate(pCreateInfo.address());
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pRenderPass, __functionAddress);
    }

}