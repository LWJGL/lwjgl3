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
 * This extension enables reads from attachments and resources written by previous fragment shaders within a dynamic render pass.
 * 
 * <h5>Promotion to Vulkan 1.4</h5>
 * 
 * <p>Functionality in this extension is included in core Vulkan 1.4, with the KHR suffix omitted. However, Vulkan 1.4 implementations only have to support local read for storage resources and single sampled color attachments.</p>
 * 
 * <p>Support for reading depth/stencil attachments and multi-sampled attachments are respectively gated behind the new boolean {@code dynamicRenderingLocalReadDepthStencilAttachments} and {@code dynamicRenderingLocalReadMultisampledAttachments} properties, as described in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#versions-1.4">Version 1.4</a> appendix.</p>
 * 
 * <p>The original type, enum, and command names are still available as aliases of the core functionality.</p>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_dynamic_rendering_local_read}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>233</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRDynamicRendering VK_KHR_dynamic_rendering} or <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#versions-1.3">Version 1.3</a></dd>
 * <dt><b>Deprecation State</b></dt>
 * <dd><ul>
 * <li><em>Promoted</em> to Vulkan 1.4</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Tobias Hector <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_dynamic_rendering_local_read]%20@tobski%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_dynamic_rendering_local_read%20extension*">tobski</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_KHR_dynamic_rendering_local_read.adoc">VK_KHR_dynamic_rendering_local_read</a></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2023-11-03</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Tobias Hector, AMD</li>
 * <li>Hans-Kristian Arntzen, Valve</li>
 * <li>Connor Abbott, Valve</li>
 * <li>Pan Gao, Huawei</li>
 * <li>Lionel Landwerlin, Intel</li>
 * <li>Shahbaz Youssefi, Google</li>
 * <li>Alyssa Rosenzweig, Valve</li>
 * <li>Jan-Harald Fredriksen, Arm</li>
 * <li>Mike Blumenkrantz, Valve</li>
 * <li>Graeme Leese, Broadcom</li>
 * <li>Piers Daniell, Nvidia</li>
 * <li>Stuart Smith, AMD</li>
 * <li>Daniel Story, Nintendo</li>
 * <li>James Fitzpatrick, Imagination</li>
 * <li>Piotr Byszewski, Mobica</li>
 * <li>Spencer Fricke, LunarG</li>
 * <li>Tom Olson, Arm</li>
 * <li>Michal Pietrasiuk, Intel</li>
 * <li>Matthew Netsch, Qualcomm</li>
 * <li>Marty Johnson, Khronos</li>
 * <li>Wyvern Wang, Huawei</li>
 * <li>Jeff Bolz, Nvidia</li>
 * <li>Samuel (Sheng-Wen) Huang, MediaTek</li>
 * </ul></dd>
 * </dl>
 */
public class KHRDynamicRenderingLocalRead {

    /** The extension specification version. */
    public static final int VK_KHR_DYNAMIC_RENDERING_LOCAL_READ_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_DYNAMIC_RENDERING_LOCAL_READ_EXTENSION_NAME = "VK_KHR_dynamic_rendering_local_read";

    /** Extends {@code VkImageLayout}. */
    public static final int VK_IMAGE_LAYOUT_RENDERING_LOCAL_READ_KHR = 1000232000;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_LOCAL_READ_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_LOCAL_READ_FEATURES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_LOCATION_INFO_KHR STRUCTURE_TYPE_RENDERING_ATTACHMENT_LOCATION_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_RENDERING_INPUT_ATTACHMENT_INDEX_INFO_KHR STRUCTURE_TYPE_RENDERING_INPUT_ATTACHMENT_INDEX_INFO_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_LOCAL_READ_FEATURES_KHR = 1000232000,
        VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_LOCATION_INFO_KHR                    = 1000232001,
        VK_STRUCTURE_TYPE_RENDERING_INPUT_ATTACHMENT_INDEX_INFO_KHR                 = 1000232002;

    protected KHRDynamicRenderingLocalRead() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdSetRenderingAttachmentLocationsKHR ] ---

    /** Unsafe version of: {@link #vkCmdSetRenderingAttachmentLocationsKHR CmdSetRenderingAttachmentLocationsKHR} */
    public static void nvkCmdSetRenderingAttachmentLocationsKHR(VkCommandBuffer commandBuffer, long pLocationInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetRenderingAttachmentLocationsKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pLocationInfo, __functionAddress);
    }

    /**
     * See {@link VK14#vkCmdSetRenderingAttachmentLocations CmdSetRenderingAttachmentLocations}.
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param pLocationInfo a {@link VkRenderingAttachmentLocationInfo} structure indicating the new mappings.
     */
    public static void vkCmdSetRenderingAttachmentLocationsKHR(VkCommandBuffer commandBuffer, @NativeType("VkRenderingAttachmentLocationInfo const *") VkRenderingAttachmentLocationInfo pLocationInfo) {
        nvkCmdSetRenderingAttachmentLocationsKHR(commandBuffer, pLocationInfo.address());
    }

    // --- [ vkCmdSetRenderingInputAttachmentIndicesKHR ] ---

    /** Unsafe version of: {@link #vkCmdSetRenderingInputAttachmentIndicesKHR CmdSetRenderingInputAttachmentIndicesKHR} */
    public static void nvkCmdSetRenderingInputAttachmentIndicesKHR(VkCommandBuffer commandBuffer, long pInputAttachmentIndexInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetRenderingInputAttachmentIndicesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pInputAttachmentIndexInfo, __functionAddress);
    }

    /**
     * See {@link VK14#vkCmdSetRenderingInputAttachmentIndices CmdSetRenderingInputAttachmentIndices}.
     *
     * @param commandBuffer             the command buffer into which the command will be recorded.
     * @param pInputAttachmentIndexInfo a {@link VkRenderingInputAttachmentIndexInfo} structure indicating the new mappings.
     */
    public static void vkCmdSetRenderingInputAttachmentIndicesKHR(VkCommandBuffer commandBuffer, @NativeType("VkRenderingInputAttachmentIndexInfo const *") VkRenderingInputAttachmentIndexInfo pInputAttachmentIndexInfo) {
        nvkCmdSetRenderingInputAttachmentIndicesKHR(commandBuffer, pInputAttachmentIndexInfo.address());
    }

}