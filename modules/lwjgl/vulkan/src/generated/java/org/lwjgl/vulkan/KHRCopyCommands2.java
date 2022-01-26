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
 * This extension provides extensible versions of the Vulkan buffer and image copy commands. The new commands are functionally identical to the core commands, except that their copy parameters are specified using extensible structures that can be used to pass extension-specific information.
 * 
 * <p>The following extensible copy commands are introduced with this extension: {@link #vkCmdCopyBuffer2KHR CmdCopyBuffer2KHR}, {@link #vkCmdCopyImage2KHR CmdCopyImage2KHR}, {@link #vkCmdCopyBufferToImage2KHR CmdCopyBufferToImage2KHR}, {@link #vkCmdCopyImageToBuffer2KHR CmdCopyImageToBuffer2KHR}, {@link #vkCmdBlitImage2KHR CmdBlitImage2KHR}, and {@link #vkCmdResolveImage2KHR CmdResolveImage2KHR}. Each command contains an stext:*Info2KHR structure parameter that includes {@code sType}/{@code pNext} members. Lower level structures describing each region to be copied are also extended with {@code sType}/{@code pNext} members.</p>
 * 
 * <h5>Promotion to Vulkan 1.3</h5>
 * 
 * <p>Functionality in this extension is included in core Vulkan 1.3, with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.</p>
 * 
 * <h5>VK_KHR_copy_commands2</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_copy_commands2}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>338</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * </ul></dd>
 * <dt><b>Deprecation state</b></dt>
 * <dd><ul>
 * <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#versions-1.3-promotions">Vulkan 1.3</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Jeff Leger <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_copy_commands2]%20@jackohound%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_copy_commands2%20extension%3E%3E">jackohound</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2020-07-06</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>Promoted to Vulkan 1.3 Core</li>
 * </ul></dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>None</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jeff Leger, Qualcomm</li>
 * <li>Tobias Hector, AMD</li>
 * <li>Jan-Harald Fredriksen, ARM</li>
 * <li>Tom Olson, ARM</li>
 * </ul></dd>
 * </dl>
 */
public class KHRCopyCommands2 {

    /** The extension specification version. */
    public static final int VK_KHR_COPY_COMMANDS_2_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_COPY_COMMANDS_2_EXTENSION_NAME = "VK_KHR_copy_commands2";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_COPY_BUFFER_INFO_2_KHR STRUCTURE_TYPE_COPY_BUFFER_INFO_2_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_COPY_IMAGE_INFO_2_KHR STRUCTURE_TYPE_COPY_IMAGE_INFO_2_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_COPY_BUFFER_TO_IMAGE_INFO_2_KHR STRUCTURE_TYPE_COPY_BUFFER_TO_IMAGE_INFO_2_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_COPY_IMAGE_TO_BUFFER_INFO_2_KHR STRUCTURE_TYPE_COPY_IMAGE_TO_BUFFER_INFO_2_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_BLIT_IMAGE_INFO_2_KHR STRUCTURE_TYPE_BLIT_IMAGE_INFO_2_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_RESOLVE_IMAGE_INFO_2_KHR STRUCTURE_TYPE_RESOLVE_IMAGE_INFO_2_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_BUFFER_COPY_2_KHR STRUCTURE_TYPE_BUFFER_COPY_2_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_IMAGE_COPY_2_KHR STRUCTURE_TYPE_IMAGE_COPY_2_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_IMAGE_BLIT_2_KHR STRUCTURE_TYPE_IMAGE_BLIT_2_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_BUFFER_IMAGE_COPY_2_KHR STRUCTURE_TYPE_BUFFER_IMAGE_COPY_2_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_IMAGE_RESOLVE_2_KHR STRUCTURE_TYPE_IMAGE_RESOLVE_2_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_COPY_BUFFER_INFO_2_KHR          = 1000337000,
        VK_STRUCTURE_TYPE_COPY_IMAGE_INFO_2_KHR           = 1000337001,
        VK_STRUCTURE_TYPE_COPY_BUFFER_TO_IMAGE_INFO_2_KHR = 1000337002,
        VK_STRUCTURE_TYPE_COPY_IMAGE_TO_BUFFER_INFO_2_KHR = 1000337003,
        VK_STRUCTURE_TYPE_BLIT_IMAGE_INFO_2_KHR           = 1000337004,
        VK_STRUCTURE_TYPE_RESOLVE_IMAGE_INFO_2_KHR        = 1000337005,
        VK_STRUCTURE_TYPE_BUFFER_COPY_2_KHR               = 1000337006,
        VK_STRUCTURE_TYPE_IMAGE_COPY_2_KHR                = 1000337007,
        VK_STRUCTURE_TYPE_IMAGE_BLIT_2_KHR                = 1000337008,
        VK_STRUCTURE_TYPE_BUFFER_IMAGE_COPY_2_KHR         = 1000337009,
        VK_STRUCTURE_TYPE_IMAGE_RESOLVE_2_KHR             = 1000337010;

    protected KHRCopyCommands2() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdCopyBuffer2KHR ] ---

    /** Unsafe version of: {@link #vkCmdCopyBuffer2KHR CmdCopyBuffer2KHR} */
    public static void nvkCmdCopyBuffer2KHR(VkCommandBuffer commandBuffer, long pCopyBufferInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyBuffer2KHR;
        if (CHECKS) {
            check(__functionAddress);
            VkCopyBufferInfo2.validate(pCopyBufferInfo);
        }
        callPPV(commandBuffer.address(), pCopyBufferInfo, __functionAddress);
    }

    /**
     * See {@link VK13#vkCmdCopyBuffer2 CmdCopyBuffer2}.
     *
     * @param commandBuffer   the command buffer into which the command will be recorded.
     * @param pCopyBufferInfo a pointer to a {@link VkCopyBufferInfo2} structure describing the copy parameters.
     */
    public static void vkCmdCopyBuffer2KHR(VkCommandBuffer commandBuffer, @NativeType("VkCopyBufferInfo2 const *") VkCopyBufferInfo2 pCopyBufferInfo) {
        nvkCmdCopyBuffer2KHR(commandBuffer, pCopyBufferInfo.address());
    }

    // --- [ vkCmdCopyImage2KHR ] ---

    /** Unsafe version of: {@link #vkCmdCopyImage2KHR CmdCopyImage2KHR} */
    public static void nvkCmdCopyImage2KHR(VkCommandBuffer commandBuffer, long pCopyImageInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyImage2KHR;
        if (CHECKS) {
            check(__functionAddress);
            VkCopyImageInfo2.validate(pCopyImageInfo);
        }
        callPPV(commandBuffer.address(), pCopyImageInfo, __functionAddress);
    }

    /**
     * See {@link VK13#vkCmdCopyImage2 CmdCopyImage2}.
     *
     * @param commandBuffer  the command buffer into which the command will be recorded.
     * @param pCopyImageInfo a pointer to a {@link VkCopyImageInfo2} structure describing the copy parameters.
     */
    public static void vkCmdCopyImage2KHR(VkCommandBuffer commandBuffer, @NativeType("VkCopyImageInfo2 const *") VkCopyImageInfo2 pCopyImageInfo) {
        nvkCmdCopyImage2KHR(commandBuffer, pCopyImageInfo.address());
    }

    // --- [ vkCmdCopyBufferToImage2KHR ] ---

    /** Unsafe version of: {@link #vkCmdCopyBufferToImage2KHR CmdCopyBufferToImage2KHR} */
    public static void nvkCmdCopyBufferToImage2KHR(VkCommandBuffer commandBuffer, long pCopyBufferToImageInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyBufferToImage2KHR;
        if (CHECKS) {
            check(__functionAddress);
            VkCopyBufferToImageInfo2.validate(pCopyBufferToImageInfo);
        }
        callPPV(commandBuffer.address(), pCopyBufferToImageInfo, __functionAddress);
    }

    /**
     * See {@link VK13#vkCmdCopyBufferToImage2 CmdCopyBufferToImage2}.
     *
     * @param commandBuffer          the command buffer into which the command will be recorded.
     * @param pCopyBufferToImageInfo a pointer to a {@link VkCopyBufferToImageInfo2} structure describing the copy parameters.
     */
    public static void vkCmdCopyBufferToImage2KHR(VkCommandBuffer commandBuffer, @NativeType("VkCopyBufferToImageInfo2 const *") VkCopyBufferToImageInfo2 pCopyBufferToImageInfo) {
        nvkCmdCopyBufferToImage2KHR(commandBuffer, pCopyBufferToImageInfo.address());
    }

    // --- [ vkCmdCopyImageToBuffer2KHR ] ---

    /** Unsafe version of: {@link #vkCmdCopyImageToBuffer2KHR CmdCopyImageToBuffer2KHR} */
    public static void nvkCmdCopyImageToBuffer2KHR(VkCommandBuffer commandBuffer, long pCopyImageToBufferInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyImageToBuffer2KHR;
        if (CHECKS) {
            check(__functionAddress);
            VkCopyImageToBufferInfo2.validate(pCopyImageToBufferInfo);
        }
        callPPV(commandBuffer.address(), pCopyImageToBufferInfo, __functionAddress);
    }

    /**
     * See {@link VK13#vkCmdCopyImageToBuffer2 CmdCopyImageToBuffer2}.
     *
     * @param commandBuffer          the command buffer into which the command will be recorded.
     * @param pCopyImageToBufferInfo a pointer to a {@link VkCopyImageToBufferInfo2} structure describing the copy parameters.
     */
    public static void vkCmdCopyImageToBuffer2KHR(VkCommandBuffer commandBuffer, @NativeType("VkCopyImageToBufferInfo2 const *") VkCopyImageToBufferInfo2 pCopyImageToBufferInfo) {
        nvkCmdCopyImageToBuffer2KHR(commandBuffer, pCopyImageToBufferInfo.address());
    }

    // --- [ vkCmdBlitImage2KHR ] ---

    /** Unsafe version of: {@link #vkCmdBlitImage2KHR CmdBlitImage2KHR} */
    public static void nvkCmdBlitImage2KHR(VkCommandBuffer commandBuffer, long pBlitImageInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBlitImage2KHR;
        if (CHECKS) {
            check(__functionAddress);
            VkBlitImageInfo2.validate(pBlitImageInfo);
        }
        callPPV(commandBuffer.address(), pBlitImageInfo, __functionAddress);
    }

    /**
     * See {@link VK13#vkCmdBlitImage2 CmdBlitImage2}.
     *
     * @param commandBuffer  the command buffer into which the command will be recorded.
     * @param pBlitImageInfo a pointer to a {@link VkBlitImageInfo2} structure describing the blit parameters.
     */
    public static void vkCmdBlitImage2KHR(VkCommandBuffer commandBuffer, @NativeType("VkBlitImageInfo2 const *") VkBlitImageInfo2 pBlitImageInfo) {
        nvkCmdBlitImage2KHR(commandBuffer, pBlitImageInfo.address());
    }

    // --- [ vkCmdResolveImage2KHR ] ---

    /** Unsafe version of: {@link #vkCmdResolveImage2KHR CmdResolveImage2KHR} */
    public static void nvkCmdResolveImage2KHR(VkCommandBuffer commandBuffer, long pResolveImageInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdResolveImage2KHR;
        if (CHECKS) {
            check(__functionAddress);
            VkResolveImageInfo2.validate(pResolveImageInfo);
        }
        callPPV(commandBuffer.address(), pResolveImageInfo, __functionAddress);
    }

    /**
     * See {@link VK13#vkCmdResolveImage2 CmdResolveImage2}.
     *
     * @param commandBuffer     the command buffer into which the command will be recorded.
     * @param pResolveImageInfo a pointer to a {@link VkResolveImageInfo2} structure describing the resolve parameters.
     */
    public static void vkCmdResolveImage2KHR(VkCommandBuffer commandBuffer, @NativeType("VkResolveImageInfo2 const *") VkResolveImageInfo2 pResolveImageInfo) {
        nvkCmdResolveImage2KHR(commandBuffer, pResolveImageInfo.address());
    }

}