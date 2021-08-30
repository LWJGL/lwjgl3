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
 * <p>The following extensible copy commands are introduced with this extension: {@link #vkCmdCopyBuffer2KHR CmdCopyBuffer2KHR}, {@link #vkCmdCopyImage2KHR CmdCopyImage2KHR}, {@link #vkCmdCopyBufferToImage2KHR CmdCopyBufferToImage2KHR}, {@link #vkCmdCopyImageToBuffer2KHR CmdCopyImageToBuffer2KHR}, {@link #vkCmdBlitImage2KHR CmdBlitImage2KHR}, and {@link #vkCmdResolveImage2KHR CmdResolveImage2KHR}. Each command contains an stext:*Info2KHR structure parameter that includes {@code sType}/{@code pNext} members. Lower level structures that describe each region to be copied are also extended with {@code sType}/{@code pNext} members.</p>
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
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Jeff Leger <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_KHR_copy_commands2:%20&amp;body=@jackohound%20">jackohound</a></li>
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
            VkCopyBufferInfo2KHR.validate(pCopyBufferInfo);
        }
        callPPV(commandBuffer.address(), pCopyBufferInfo, __functionAddress);
    }

    /**
     * Copy data between buffer regions.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To copy data between buffer objects, call:</p>
     * 
     * <pre><code>
     * void vkCmdCopyBuffer2KHR(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkCopyBufferInfo2KHR*                 pCopyBufferInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command is functionally identical to {@link VK10#vkCmdCopyBuffer CmdCopyBuffer}, but includes extensible sub-structures that include {@code sType} and {@code pNext} parameters, allowing them to be more easily extended.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If {@code commandBuffer} is an unprotected command buffer, then {@code srcBuffer} <b>must</b> not be a protected buffer</li>
     * <li>If {@code commandBuffer} is an unprotected command buffer, then {@code dstBuffer} <b>must</b> not be a protected buffer</li>
     * <li>If {@code commandBuffer} is a protected command buffer, then {@code dstBuffer} <b>must</b> not be an unprotected buffer</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pCopyBufferInfo} <b>must</b> be a valid pointer to a valid {@link VkCopyBufferInfo2KHR} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
     * <li>This command <b>must</b> only be called outside of a render pass instance</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Transfer Graphics Compute</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkCopyBufferInfo2KHR}</p>
     *
     * @param commandBuffer   the command buffer into which the command will be recorded.
     * @param pCopyBufferInfo a pointer to a {@link VkCopyBufferInfo2KHR} structure describing the copy parameters.
     */
    public static void vkCmdCopyBuffer2KHR(VkCommandBuffer commandBuffer, @NativeType("VkCopyBufferInfo2KHR const *") VkCopyBufferInfo2KHR pCopyBufferInfo) {
        nvkCmdCopyBuffer2KHR(commandBuffer, pCopyBufferInfo.address());
    }

    // --- [ vkCmdCopyImage2KHR ] ---

    /** Unsafe version of: {@link #vkCmdCopyImage2KHR CmdCopyImage2KHR} */
    public static void nvkCmdCopyImage2KHR(VkCommandBuffer commandBuffer, long pCopyImageInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyImage2KHR;
        if (CHECKS) {
            check(__functionAddress);
            VkCopyImageInfo2KHR.validate(pCopyImageInfo);
        }
        callPPV(commandBuffer.address(), pCopyImageInfo, __functionAddress);
    }

    /**
     * Copy data between images.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To copy data between image objects, call:</p>
     * 
     * <pre><code>
     * void vkCmdCopyImage2KHR(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkCopyImageInfo2KHR*                  pCopyImageInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command is functionally identical to {@link VK10#vkCmdCopyImage CmdCopyImage}, but includes extensible sub-structures that include {@code sType} and {@code pNext} parameters, allowing them to be more easily extended.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If {@code commandBuffer} is an unprotected command buffer, then {@code srcImage} <b>must</b> not be a protected image</li>
     * <li>If {@code commandBuffer} is an unprotected command buffer, then {@code dstImage} <b>must</b> not be a protected image</li>
     * <li>If {@code commandBuffer} is a protected command buffer, then {@code dstImage} <b>must</b> not be an unprotected image</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pCopyImageInfo} <b>must</b> be a valid pointer to a valid {@link VkCopyImageInfo2KHR} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
     * <li>This command <b>must</b> only be called outside of a render pass instance</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Transfer Graphics Compute</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkCopyImageInfo2KHR}</p>
     *
     * @param commandBuffer  the command buffer into which the command will be recorded.
     * @param pCopyImageInfo a pointer to a {@link VkCopyImageInfo2KHR} structure describing the copy parameters.
     */
    public static void vkCmdCopyImage2KHR(VkCommandBuffer commandBuffer, @NativeType("VkCopyImageInfo2KHR const *") VkCopyImageInfo2KHR pCopyImageInfo) {
        nvkCmdCopyImage2KHR(commandBuffer, pCopyImageInfo.address());
    }

    // --- [ vkCmdCopyBufferToImage2KHR ] ---

    /** Unsafe version of: {@link #vkCmdCopyBufferToImage2KHR CmdCopyBufferToImage2KHR} */
    public static void nvkCmdCopyBufferToImage2KHR(VkCommandBuffer commandBuffer, long pCopyBufferToImageInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyBufferToImage2KHR;
        if (CHECKS) {
            check(__functionAddress);
            VkCopyBufferToImageInfo2KHR.validate(pCopyBufferToImageInfo);
        }
        callPPV(commandBuffer.address(), pCopyBufferToImageInfo, __functionAddress);
    }

    /**
     * Copy data from a buffer into an image.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To copy data from a buffer object to an image object, call:</p>
     * 
     * <pre><code>
     * void vkCmdCopyBufferToImage2KHR(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkCopyBufferToImageInfo2KHR*          pCopyBufferToImageInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command is functionally identical to {@link VK10#vkCmdCopyBufferToImage CmdCopyBufferToImage}, but includes extensible sub-structures that include {@code sType} and {@code pNext} parameters, allowing them to be more easily extended.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If {@code commandBuffer} is an unprotected command buffer, then {@code srcBuffer} <b>must</b> not be a protected buffer</li>
     * <li>If {@code commandBuffer} is an unprotected command buffer, then {@code dstImage} <b>must</b> not be a protected image</li>
     * <li>If {@code commandBuffer} is a protected command buffer, then {@code dstImage} <b>must</b> not be an unprotected image</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pCopyBufferToImageInfo} <b>must</b> be a valid pointer to a valid {@link VkCopyBufferToImageInfo2KHR} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
     * <li>This command <b>must</b> only be called outside of a render pass instance</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Transfer Graphics Compute</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkCopyBufferToImageInfo2KHR}</p>
     *
     * @param commandBuffer          the command buffer into which the command will be recorded.
     * @param pCopyBufferToImageInfo a pointer to a {@link VkCopyBufferToImageInfo2KHR} structure describing the copy parameters.
     */
    public static void vkCmdCopyBufferToImage2KHR(VkCommandBuffer commandBuffer, @NativeType("VkCopyBufferToImageInfo2KHR const *") VkCopyBufferToImageInfo2KHR pCopyBufferToImageInfo) {
        nvkCmdCopyBufferToImage2KHR(commandBuffer, pCopyBufferToImageInfo.address());
    }

    // --- [ vkCmdCopyImageToBuffer2KHR ] ---

    /** Unsafe version of: {@link #vkCmdCopyImageToBuffer2KHR CmdCopyImageToBuffer2KHR} */
    public static void nvkCmdCopyImageToBuffer2KHR(VkCommandBuffer commandBuffer, long pCopyImageToBufferInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyImageToBuffer2KHR;
        if (CHECKS) {
            check(__functionAddress);
            VkCopyImageToBufferInfo2KHR.validate(pCopyImageToBufferInfo);
        }
        callPPV(commandBuffer.address(), pCopyImageToBufferInfo, __functionAddress);
    }

    /**
     * Copy image data into a buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To copy data from an image object to a buffer object, call:</p>
     * 
     * <pre><code>
     * void vkCmdCopyImageToBuffer2KHR(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkCopyImageToBufferInfo2KHR*          pCopyImageToBufferInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command is functionally identical to {@link VK10#vkCmdCopyImageToBuffer CmdCopyImageToBuffer}, but includes extensible sub-structures that include {@code sType} and {@code pNext} parameters, allowing them to be more easily extended.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If {@code commandBuffer} is an unprotected command buffer, then {@code srcImage} <b>must</b> not be a protected image</li>
     * <li>If {@code commandBuffer} is an unprotected command buffer, then {@code dstBuffer} <b>must</b> not be a protected buffer</li>
     * <li>If {@code commandBuffer} is a protected command buffer, then {@code dstBuffer} <b>must</b> not be an unprotected buffer</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pCopyImageToBufferInfo} <b>must</b> be a valid pointer to a valid {@link VkCopyImageToBufferInfo2KHR} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
     * <li>This command <b>must</b> only be called outside of a render pass instance</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Transfer Graphics Compute</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkCopyImageToBufferInfo2KHR}</p>
     *
     * @param commandBuffer          the command buffer into which the command will be recorded.
     * @param pCopyImageToBufferInfo a pointer to a {@link VkCopyImageToBufferInfo2KHR} structure describing the copy parameters.
     */
    public static void vkCmdCopyImageToBuffer2KHR(VkCommandBuffer commandBuffer, @NativeType("VkCopyImageToBufferInfo2KHR const *") VkCopyImageToBufferInfo2KHR pCopyImageToBufferInfo) {
        nvkCmdCopyImageToBuffer2KHR(commandBuffer, pCopyImageToBufferInfo.address());
    }

    // --- [ vkCmdBlitImage2KHR ] ---

    /** Unsafe version of: {@link #vkCmdBlitImage2KHR CmdBlitImage2KHR} */
    public static void nvkCmdBlitImage2KHR(VkCommandBuffer commandBuffer, long pBlitImageInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBlitImage2KHR;
        if (CHECKS) {
            check(__functionAddress);
            VkBlitImageInfo2KHR.validate(pBlitImageInfo);
        }
        callPPV(commandBuffer.address(), pBlitImageInfo, __functionAddress);
    }

    /**
     * Copy regions of an image, potentially performing format conversion,.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To copy regions of a source image into a destination image, potentially performing format conversion, arbitrary scaling, and filtering, call:</p>
     * 
     * <pre><code>
     * void vkCmdBlitImage2KHR(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkBlitImageInfo2KHR*                  pBlitImageInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command is functionally identical to {@link VK10#vkCmdBlitImage CmdBlitImage}, but includes extensible sub-structures that include {@code sType} and {@code pNext} parameters, allowing them to be more easily extended.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If {@code commandBuffer} is an unprotected command buffer, then {@code srcImage} <b>must</b> not be a protected image</li>
     * <li>If {@code commandBuffer} is an unprotected command buffer, then {@code dstImage} <b>must</b> not be a protected image</li>
     * <li>If {@code commandBuffer} is a protected command buffer, then {@code dstImage} <b>must</b> not be an unprotected image</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pBlitImageInfo} <b>must</b> be a valid pointer to a valid {@link VkBlitImageInfo2KHR} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a render pass instance</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Graphics</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkBlitImageInfo2KHR}</p>
     *
     * @param commandBuffer  the command buffer into which the command will be recorded.
     * @param pBlitImageInfo a pointer to a {@link VkBlitImageInfo2KHR} structure describing the blit parameters.
     */
    public static void vkCmdBlitImage2KHR(VkCommandBuffer commandBuffer, @NativeType("VkBlitImageInfo2KHR const *") VkBlitImageInfo2KHR pBlitImageInfo) {
        nvkCmdBlitImage2KHR(commandBuffer, pBlitImageInfo.address());
    }

    // --- [ vkCmdResolveImage2KHR ] ---

    /** Unsafe version of: {@link #vkCmdResolveImage2KHR CmdResolveImage2KHR} */
    public static void nvkCmdResolveImage2KHR(VkCommandBuffer commandBuffer, long pResolveImageInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdResolveImage2KHR;
        if (CHECKS) {
            check(__functionAddress);
            VkResolveImageInfo2KHR.validate(pResolveImageInfo);
        }
        callPPV(commandBuffer.address(), pResolveImageInfo, __functionAddress);
    }

    /**
     * Resolve regions of an image.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To resolve a multisample image to a non-multisample image, call:</p>
     * 
     * <pre><code>
     * void vkCmdResolveImage2KHR(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkResolveImageInfo2KHR*               pResolveImageInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command is functionally identical to {@link VK10#vkCmdResolveImage CmdResolveImage}, but includes extensible sub-structures that include {@code sType} and {@code pNext} parameters, allowing them to be more easily extended.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If {@code commandBuffer} is an unprotected command buffer, then {@code srcImage} <b>must</b> not be a protected image</li>
     * <li>If {@code commandBuffer} is an unprotected command buffer, then {@code dstImage} <b>must</b> not be a protected image</li>
     * <li>If {@code commandBuffer} is a protected command buffer, then {@code dstImage} <b>must</b> not be an unprotected image</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pResolveImageInfo} <b>must</b> be a valid pointer to a valid {@link VkResolveImageInfo2KHR} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a render pass instance</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Graphics</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkResolveImageInfo2KHR}</p>
     *
     * @param commandBuffer     the command buffer into which the command will be recorded.
     * @param pResolveImageInfo a pointer to a {@link VkResolveImageInfo2KHR} structure describing the resolve parameters.
     */
    public static void vkCmdResolveImage2KHR(VkCommandBuffer commandBuffer, @NativeType("VkResolveImageInfo2KHR const *") VkResolveImageInfo2KHR pResolveImageInfo) {
        nvkCmdResolveImage2KHR(commandBuffer, pResolveImageInfo.address());
    }

}