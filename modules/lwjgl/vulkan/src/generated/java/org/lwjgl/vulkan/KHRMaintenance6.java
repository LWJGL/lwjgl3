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
 * {@link KHRMaintenance6 VK_KHR_maintenance6} adds a collection of minor features, none of which would warrant an entire extension of their own.
 * 
 * <p>The new features are as follows:</p>
 * 
 * <ul>
 * <li>{@link VkBindMemoryStatusKHR} may be included in the {@code pNext} chain of {@link VkBindBufferMemoryInfo} and {@link VkBindImageMemoryInfo}, allowing applications to identify individual resources for which memory binding failed during calls to {@link VK11#vkBindBufferMemory2 BindBufferMemory2} and {@link VK11#vkBindImageMemory2 BindImageMemory2}.</li>
 * <li>A new property {@code fragmentShadingRateClampCombinerInputs} to indicate if an implementation clamps the inputs to fragment shading rate combiner operations.</li>
 * <li>{@link VK10#VK_NULL_HANDLE NULL_HANDLE} is allowed to be used when binding an index buffer, instead of a valid {@code VkBuffer} handle. When the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-nullDescriptor">{@code nullDescriptor}</a> feature is enabled, every index fetched results in a value of zero.</li>
 * <li>A new property {@code maxCombinedImageSamplerDescriptorCount} to indicate the maximum number of descriptors needed for any of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">formats that require a sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a> supported by the implementation.</li>
 * <li>A new property {@code blockTexelViewCompatibleMultipleLayers} indicating whether {@link VK11#VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT} is allowed to be used with {@code layerCount} &gt; 1</li>
 * <li>{@code pNext} extensible *2 versions of all descriptor binding commands.</li>
 * </ul>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_maintenance6}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>546</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#versions-1.1">Version 1.1</a></dd>
 * <dt><b>API Interactions</b></dt>
 * <dd><ul>
 * <li>Interacts with VK_EXT_descriptor_buffer</li>
 * <li>Interacts with VK_KHR_push_descriptor</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Jon Leech <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_maintenance6]%20@oddhack%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_maintenance6%20extension*">oddhack</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_KHR_maintenance6.adoc">VK_KHR_maintenance6</a></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2023-08-03</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>Interacts with {@link EXTRobustness2 VK_EXT_robustness2}</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jon Leech, Khronos</li>
 * <li>Stu Smith, AMD</li>
 * <li>Mike Blumenkrantz, Valve</li>
 * <li>Ralph Potter, Samsung</li>
 * <li>James Fitzpatrick, Imagination Technologies</li>
 * <li>Piers Daniell, NVIDIA</li>
 * <li>Daniel Story, Nintendo</li>
 * </ul></dd>
 * </dl>
 */
public class KHRMaintenance6 {

    /** The extension specification version. */
    public static final int VK_KHR_MAINTENANCE_6_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_MAINTENANCE_6_EXTENSION_NAME = "VK_KHR_maintenance6";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_FEATURES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_PROPERTIES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_BIND_MEMORY_STATUS_KHR STRUCTURE_TYPE_BIND_MEMORY_STATUS_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_BIND_DESCRIPTOR_SETS_INFO_KHR STRUCTURE_TYPE_BIND_DESCRIPTOR_SETS_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PUSH_CONSTANTS_INFO_KHR STRUCTURE_TYPE_PUSH_CONSTANTS_INFO_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_FEATURES_KHR   = 1000545000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_PROPERTIES_KHR = 1000545001,
        VK_STRUCTURE_TYPE_BIND_MEMORY_STATUS_KHR                       = 1000545002,
        VK_STRUCTURE_TYPE_BIND_DESCRIPTOR_SETS_INFO_KHR                = 1000545003,
        VK_STRUCTURE_TYPE_PUSH_CONSTANTS_INFO_KHR                      = 1000545004;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_INFO_KHR STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE_INFO_KHR STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE_INFO_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_INFO_KHR               = 1000545005,
        VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE_INFO_KHR = 1000545006;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_SET_DESCRIPTOR_BUFFER_OFFSETS_INFO_EXT STRUCTURE_TYPE_SET_DESCRIPTOR_BUFFER_OFFSETS_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_BIND_DESCRIPTOR_BUFFER_EMBEDDED_SAMPLERS_INFO_EXT STRUCTURE_TYPE_BIND_DESCRIPTOR_BUFFER_EMBEDDED_SAMPLERS_INFO_EXT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_SET_DESCRIPTOR_BUFFER_OFFSETS_INFO_EXT            = 1000545007,
        VK_STRUCTURE_TYPE_BIND_DESCRIPTOR_BUFFER_EMBEDDED_SAMPLERS_INFO_EXT = 1000545008;

    protected KHRMaintenance6() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdBindDescriptorSets2KHR ] ---

    /** Unsafe version of: {@link #vkCmdBindDescriptorSets2KHR CmdBindDescriptorSets2KHR} */
    public static void nvkCmdBindDescriptorSets2KHR(VkCommandBuffer commandBuffer, long pBindDescriptorSetsInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindDescriptorSets2KHR;
        if (CHECKS) {
            check(__functionAddress);
            VkBindDescriptorSetsInfoKHR.validate(pBindDescriptorSetsInfo);
        }
        callPPV(commandBuffer.address(), pBindDescriptorSetsInfo, __functionAddress);
    }

    /**
     * Binds descriptor sets to a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Alternatively, to bind one or more descriptor sets to a command buffer, call:</p>
     * 
     * <pre><code>
     * void vkCmdBindDescriptorSets2KHR(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkBindDescriptorSetsInfoKHR*          pBindDescriptorSetsInfo);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Each bit in {@code pBindDescriptorSetsInfo→stageFlags} <b>must</b> be a stage supported by the {@code commandBuffer}’s parent {@code VkCommandPool}’s queue family</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pBindDescriptorSetsInfo} <b>must</b> be a valid pointer to a valid {@link VkBindDescriptorSetsInfoKHR} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics Compute</td><td>State</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkBindDescriptorSetsInfoKHR}</p>
     *
     * @param commandBuffer           the command buffer that the descriptor sets will be bound to.
     * @param pBindDescriptorSetsInfo a pointer to a {@link VkBindDescriptorSetsInfoKHR} structure.
     */
    public static void vkCmdBindDescriptorSets2KHR(VkCommandBuffer commandBuffer, @NativeType("VkBindDescriptorSetsInfoKHR const *") VkBindDescriptorSetsInfoKHR pBindDescriptorSetsInfo) {
        nvkCmdBindDescriptorSets2KHR(commandBuffer, pBindDescriptorSetsInfo.address());
    }

    // --- [ vkCmdPushConstants2KHR ] ---

    /** Unsafe version of: {@link #vkCmdPushConstants2KHR CmdPushConstants2KHR} */
    public static void nvkCmdPushConstants2KHR(VkCommandBuffer commandBuffer, long pPushConstantsInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPushConstants2KHR;
        if (CHECKS) {
            check(__functionAddress);
            VkPushConstantsInfoKHR.validate(pPushConstantsInfo);
        }
        callPPV(commandBuffer.address(), pPushConstantsInfo, __functionAddress);
    }

    /**
     * Update the values of push constants.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Alternatively, to update push constants, call:</p>
     * 
     * <pre><code>
     * void vkCmdPushConstants2KHR(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkPushConstantsInfoKHR*               pPushConstantsInfo);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pPushConstantsInfo} <b>must</b> be a valid pointer to a valid {@link VkPushConstantsInfoKHR} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics Compute</td><td>State</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPushConstantsInfoKHR}</p>
     *
     * @param commandBuffer      the command buffer in which the push constant update will be recorded.
     * @param pPushConstantsInfo a pointer to a {@link VkPushConstantsInfoKHR} structure.
     */
    public static void vkCmdPushConstants2KHR(VkCommandBuffer commandBuffer, @NativeType("VkPushConstantsInfoKHR const *") VkPushConstantsInfoKHR pPushConstantsInfo) {
        nvkCmdPushConstants2KHR(commandBuffer, pPushConstantsInfo.address());
    }

    // --- [ vkCmdPushDescriptorSet2KHR ] ---

    /** Unsafe version of: {@link #vkCmdPushDescriptorSet2KHR CmdPushDescriptorSet2KHR} */
    public static void nvkCmdPushDescriptorSet2KHR(VkCommandBuffer commandBuffer, long pPushDescriptorSetInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPushDescriptorSet2KHR;
        if (CHECKS) {
            check(__functionAddress);
            VkPushDescriptorSetInfoKHR.validate(pPushDescriptorSetInfo);
        }
        callPPV(commandBuffer.address(), pPushDescriptorSetInfo, __functionAddress);
    }

    /**
     * Pushes descriptor updates into a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Alternatively, to push descriptor updates into a command buffer, call:</p>
     * 
     * <pre><code>
     * void vkCmdPushDescriptorSet2KHR(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkPushDescriptorSetInfoKHR*           pPushDescriptorSetInfo);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Each bit in {@code pPushDescriptorSetInfo→stageFlags} <b>must</b> be a stage supported by the {@code commandBuffer}’s parent {@code VkCommandPool}’s queue family</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pPushDescriptorSetInfo} <b>must</b> be a valid pointer to a valid {@link VkPushDescriptorSetInfoKHR} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics Compute</td><td>State</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPushDescriptorSetInfoKHR}</p>
     *
     * @param commandBuffer          the command buffer that the descriptors will be recorded in.
     * @param pPushDescriptorSetInfo a pointer to a {@link VkPushDescriptorSetInfoKHR} structure.
     */
    public static void vkCmdPushDescriptorSet2KHR(VkCommandBuffer commandBuffer, @NativeType("VkPushDescriptorSetInfoKHR const *") VkPushDescriptorSetInfoKHR pPushDescriptorSetInfo) {
        nvkCmdPushDescriptorSet2KHR(commandBuffer, pPushDescriptorSetInfo.address());
    }

    // --- [ vkCmdPushDescriptorSetWithTemplate2KHR ] ---

    /** Unsafe version of: {@link #vkCmdPushDescriptorSetWithTemplate2KHR CmdPushDescriptorSetWithTemplate2KHR} */
    public static void nvkCmdPushDescriptorSetWithTemplate2KHR(VkCommandBuffer commandBuffer, long pPushDescriptorSetWithTemplateInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPushDescriptorSetWithTemplate2KHR;
        if (CHECKS) {
            check(__functionAddress);
            VkPushDescriptorSetWithTemplateInfoKHR.validate(pPushDescriptorSetWithTemplateInfo);
        }
        callPPV(commandBuffer.address(), pPushDescriptorSetWithTemplateInfo, __functionAddress);
    }

    /**
     * Pushes descriptor updates into a command buffer using a descriptor update template.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Alternatively, to use a descriptor update template to specify the push descriptors to update, call:</p>
     * 
     * <pre><code>
     * void vkCmdPushDescriptorSetWithTemplate2KHR(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkPushDescriptorSetWithTemplateInfoKHR* pPushDescriptorSetWithTemplateInfo);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pPushDescriptorSetWithTemplateInfo} <b>must</b> be a valid pointer to a valid {@link VkPushDescriptorSetWithTemplateInfoKHR} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics Compute</td><td>State</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPushDescriptorSetWithTemplateInfoKHR}</p>
     *
     * @param commandBuffer                      the command buffer that the descriptors will be recorded in.
     * @param pPushDescriptorSetWithTemplateInfo a pointer to a {@link VkPushDescriptorSetWithTemplateInfoKHR} structure.
     */
    public static void vkCmdPushDescriptorSetWithTemplate2KHR(VkCommandBuffer commandBuffer, @NativeType("VkPushDescriptorSetWithTemplateInfoKHR const *") VkPushDescriptorSetWithTemplateInfoKHR pPushDescriptorSetWithTemplateInfo) {
        nvkCmdPushDescriptorSetWithTemplate2KHR(commandBuffer, pPushDescriptorSetWithTemplateInfo.address());
    }

    // --- [ vkCmdSetDescriptorBufferOffsets2EXT ] ---

    /** Unsafe version of: {@link #vkCmdSetDescriptorBufferOffsets2EXT CmdSetDescriptorBufferOffsets2EXT} */
    public static void nvkCmdSetDescriptorBufferOffsets2EXT(VkCommandBuffer commandBuffer, long pSetDescriptorBufferOffsetsInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDescriptorBufferOffsets2EXT;
        if (CHECKS) {
            check(__functionAddress);
            VkSetDescriptorBufferOffsetsInfoEXT.validate(pSetDescriptorBufferOffsetsInfo);
        }
        callPPV(commandBuffer.address(), pSetDescriptorBufferOffsetsInfo, __functionAddress);
    }

    /**
     * Setting descriptor buffer offsets in a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Alternatively, to set descriptor buffer offsets in a command buffer, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetDescriptorBufferOffsets2EXT(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkSetDescriptorBufferOffsetsInfoEXT*  pSetDescriptorBufferOffsetsInfo);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-descriptorBuffer">{@code descriptorBuffer}</a> feature <b>must</b> be enabled</li>
     * <li>Each bit in {@code pSetDescriptorBufferOffsetsInfo→stageFlags} <b>must</b> be a stage supported by the {@code commandBuffer}’s parent {@code VkCommandPool}’s queue family</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pSetDescriptorBufferOffsetsInfo} <b>must</b> be a valid pointer to a valid {@link VkSetDescriptorBufferOffsetsInfoEXT} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics Compute</td><td>State</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkSetDescriptorBufferOffsetsInfoEXT}</p>
     *
     * @param commandBuffer                   the command buffer in which the descriptor buffer offsets will be set.
     * @param pSetDescriptorBufferOffsetsInfo a pointer to a {@link VkSetDescriptorBufferOffsetsInfoEXT} structure.
     */
    public static void vkCmdSetDescriptorBufferOffsets2EXT(VkCommandBuffer commandBuffer, @NativeType("VkSetDescriptorBufferOffsetsInfoEXT const *") VkSetDescriptorBufferOffsetsInfoEXT pSetDescriptorBufferOffsetsInfo) {
        nvkCmdSetDescriptorBufferOffsets2EXT(commandBuffer, pSetDescriptorBufferOffsetsInfo.address());
    }

    // --- [ vkCmdBindDescriptorBufferEmbeddedSamplers2EXT ] ---

    /** Unsafe version of: {@link #vkCmdBindDescriptorBufferEmbeddedSamplers2EXT CmdBindDescriptorBufferEmbeddedSamplers2EXT} */
    public static void nvkCmdBindDescriptorBufferEmbeddedSamplers2EXT(VkCommandBuffer commandBuffer, long pBindDescriptorBufferEmbeddedSamplersInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindDescriptorBufferEmbeddedSamplers2EXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pBindDescriptorBufferEmbeddedSamplersInfo, __functionAddress);
    }

    /**
     * Setting embedded immutable samplers offsets in a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Alternatively, to bind an embedded immutable sampler set to a command buffer, call:</p>
     * 
     * <pre><code>
     * void vkCmdBindDescriptorBufferEmbeddedSamplers2EXT(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkBindDescriptorBufferEmbeddedSamplersInfoEXT* pBindDescriptorBufferEmbeddedSamplersInfo);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-descriptorBuffer">{@code descriptorBuffer}</a> feature <b>must</b> be enabled</li>
     * <li>Each bit in {@code pBindDescriptorBufferEmbeddedSamplersInfo→stageFlags} <b>must</b> be a stage supported by the {@code commandBuffer}’s parent {@code VkCommandPool}’s queue family</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pBindDescriptorBufferEmbeddedSamplersInfo} <b>must</b> be a valid pointer to a valid {@link VkBindDescriptorBufferEmbeddedSamplersInfoEXT} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics Compute</td><td>State</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkBindDescriptorBufferEmbeddedSamplersInfoEXT}</p>
     *
     * @param commandBuffer                             the command buffer that the embedded immutable samplers will be bound to.
     * @param pBindDescriptorBufferEmbeddedSamplersInfo a pointer to a {@link VkBindDescriptorBufferEmbeddedSamplersInfoEXT} structure.
     */
    public static void vkCmdBindDescriptorBufferEmbeddedSamplers2EXT(VkCommandBuffer commandBuffer, @NativeType("VkBindDescriptorBufferEmbeddedSamplersInfoEXT const *") VkBindDescriptorBufferEmbeddedSamplersInfoEXT pBindDescriptorBufferEmbeddedSamplersInfo) {
        nvkCmdBindDescriptorBufferEmbeddedSamplers2EXT(commandBuffer, pBindDescriptorBufferEmbeddedSamplersInfo.address());
    }

}