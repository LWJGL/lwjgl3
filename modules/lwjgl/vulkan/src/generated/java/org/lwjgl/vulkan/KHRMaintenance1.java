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
 * {@code VK_KHR_maintenance1} adds a collection of minor features that were intentionally left out or overlooked from the original Vulkan 1.0 release.
 * 
 * <p>The new features are as follows:</p>
 * 
 * <ul>
 * <li>Allow 2D and 2D array image views to be created from 3D images, which can then be used as color framebuffer attachments. This allows applications to render to slices of a 3D image.</li>
 * <li>Support {@link VK10#vkCmdCopyImage CmdCopyImage} between 2D array layers and 3D slices. This extension allows copying from layers of a 2D array image to slices of a 3D image and vice versa.</li>
 * <li>Allow negative height to be specified in the {@link VkViewport}{@code ::height} field to perform y-inversion of the clip-space to framebuffer-space transform. This allows apps to avoid having to use {@code gl_Position.y = -gl_Position.y} in shaders also targeting other APIs.</li>
 * <li>Allow implementations to express support for doing just transfers and clears of image formats that they otherwise support no other format features for. This is done by adding new format feature flags {@link #VK_FORMAT_FEATURE_TRANSFER_SRC_BIT_KHR FORMAT_FEATURE_TRANSFER_SRC_BIT_KHR} and {@link #VK_FORMAT_FEATURE_TRANSFER_DST_BIT_KHR FORMAT_FEATURE_TRANSFER_DST_BIT_KHR}.</li>
 * <li>Support {@link VK10#vkCmdFillBuffer CmdFillBuffer} on transfer-only queues. Previously {@link VK10#vkCmdFillBuffer CmdFillBuffer} was defined to only work on command buffers allocated from command pools which support graphics or compute queues. It is now allowed on queues that just support transfer operations.</li>
 * <li>Fix the inconsistency of how error conditions are returned between the {@link VK10#vkCreateGraphicsPipelines CreateGraphicsPipelines} and {@link VK10#vkCreateComputePipelines CreateComputePipelines} functions and the {@link VK10#vkAllocateDescriptorSets AllocateDescriptorSets} and {@link VK10#vkAllocateCommandBuffers AllocateCommandBuffers} functions.</li>
 * <li>Add new {@link #VK_ERROR_OUT_OF_POOL_MEMORY_KHR ERROR_OUT_OF_POOL_MEMORY_KHR} error so implementations can give a more precise reason for {@link VK10#vkAllocateDescriptorSets AllocateDescriptorSets} failures.</li>
 * <li>Add a new command {@link #vkTrimCommandPoolKHR TrimCommandPoolKHR} which gives the implementation an opportunity to release any unused command pool memory back to the system.</li>
 * </ul>
 * 
 * <h5>Promotion to Vulkan 1.1</h5>
 * 
 * <p>All functionality in this extension is included in core Vulkan 1.1, with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.</p>
 * 
 * <h5>VK_KHR_maintenance1</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_maintenance1}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>70</dd>
 * <dt><b>Revision</b></dt>
 * <dd>2</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * </ul></dd>
 * <dt><b>Deprecation state</b></dt>
 * <dd><ul>
 * <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#versions-1.1-promotions">Vulkan 1.1</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Piers Daniell <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_maintenance1]%20@pdaniell-nv%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_maintenance1%20extension%3E%3E">pdaniell-nv</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2018-03-13</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>Promoted to Vulkan 1.1 Core</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Dan Ginsburg, Valve</li>
 * <li>Daniel Koch, NVIDIA</li>
 * <li>Daniel Rakos, AMD</li>
 * <li>Jan-Harald Fredriksen, ARM</li>
 * <li>Jason Ekstrand, Intel</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Jesse Hall, Google</li>
 * <li>John Kessenich, Google</li>
 * <li>Michael Worcester, Imagination Technologies</li>
 * <li>Neil Henning, Codeplay Software Ltd.</li>
 * <li>Piers Daniell, NVIDIA</li>
 * <li>Slawomir Grajewski, Intel</li>
 * <li>Tobias Hector, Imagination Technologies</li>
 * <li>Tom Olson, ARM</li>
 * </ul></dd>
 * </dl>
 */
public class KHRMaintenance1 {

    /** The extension specification version. */
    public static final int VK_KHR_MAINTENANCE_1_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String VK_KHR_MAINTENANCE_1_EXTENSION_NAME = "VK_KHR_maintenance1";

    /** The extension specification version. */
    public static final int VK_KHR_MAINTENANCE1_SPEC_VERSION = VK_KHR_MAINTENANCE_1_SPEC_VERSION;

    /** The extension name. */
    public static final String VK_KHR_MAINTENANCE1_EXTENSION_NAME = VK_KHR_MAINTENANCE_1_EXTENSION_NAME;

    /** Extends {@code VkResult}. */
    public static final int VK_ERROR_OUT_OF_POOL_MEMORY_KHR = -1000069000;

    /**
     * Extends {@code VkFormatFeatureFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_FORMAT_FEATURE_TRANSFER_SRC_BIT_KHR FORMAT_FEATURE_TRANSFER_SRC_BIT_KHR}</li>
     * <li>{@link #VK_FORMAT_FEATURE_TRANSFER_DST_BIT_KHR FORMAT_FEATURE_TRANSFER_DST_BIT_KHR}</li>
     * </ul>
     */
    public static final int
        VK_FORMAT_FEATURE_TRANSFER_SRC_BIT_KHR = 0x4000,
        VK_FORMAT_FEATURE_TRANSFER_DST_BIT_KHR = 0x8000;

    /** Extends {@code VkImageCreateFlagBits}. */
    public static final int VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT_KHR = 0x20;

    protected KHRMaintenance1() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkTrimCommandPoolKHR ] ---

    /**
     * See {@link VK11#vkTrimCommandPool TrimCommandPool}.
     *
     * @param device      the logical device that owns the command pool.
     * @param commandPool the command pool to trim.
     * @param flags       reserved for future use.
     */
    public static void vkTrimCommandPoolKHR(VkDevice device, @NativeType("VkCommandPool") long commandPool, @NativeType("VkCommandPoolTrimFlags") int flags) {
        long __functionAddress = device.getCapabilities().vkTrimCommandPoolKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJV(device.address(), commandPool, flags, __functionAddress);
    }

}