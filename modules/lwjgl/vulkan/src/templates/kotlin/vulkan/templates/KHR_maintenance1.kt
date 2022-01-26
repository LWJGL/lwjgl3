/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_maintenance1 = "KHRMaintenance1".nativeClassVK("KHR_maintenance1", type = "device", postfix = "KHR") {
    documentation =
        """
        {@code VK_KHR_maintenance1} adds a collection of minor features that were intentionally left out or overlooked from the original Vulkan 1.0 release.

        The new features are as follows:

        <ul>
            <li>Allow 2D and 2D array image views to be created from 3D images, which can then be used as color framebuffer attachments. This allows applications to render to slices of a 3D image.</li>
            <li>Support #CmdCopyImage() between 2D array layers and 3D slices. This extension allows copying from layers of a 2D array image to slices of a 3D image and vice versa.</li>
            <li>Allow negative height to be specified in the ##VkViewport{@code ::height} field to perform y-inversion of the clip-space to framebuffer-space transform. This allows apps to avoid having to use {@code gl_Position.y = -gl_Position.y} in shaders also targeting other APIs.</li>
            <li>Allow implementations to express support for doing just transfers and clears of image formats that they otherwise support no other format features for. This is done by adding new format feature flags #FORMAT_FEATURE_TRANSFER_SRC_BIT_KHR and #FORMAT_FEATURE_TRANSFER_DST_BIT_KHR.</li>
            <li>Support #CmdFillBuffer() on transfer-only queues. Previously #CmdFillBuffer() was defined to only work on command buffers allocated from command pools which support graphics or compute queues. It is now allowed on queues that just support transfer operations.</li>
            <li>Fix the inconsistency of how error conditions are returned between the #CreateGraphicsPipelines() and #CreateComputePipelines() functions and the #AllocateDescriptorSets() and #AllocateCommandBuffers() functions.</li>
            <li>Add new #ERROR_OUT_OF_POOL_MEMORY_KHR error so implementations can give a more precise reason for #AllocateDescriptorSets() failures.</li>
            <li>Add a new command #TrimCommandPoolKHR() which gives the implementation an opportunity to release any unused command pool memory back to the system.</li>
        </ul>

        <h5>Promotion to Vulkan 1.1</h5>
        All functionality in this extension is included in core Vulkan 1.1, with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.

        <h5>VK_KHR_maintenance1</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_maintenance1}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>70</dd>

            <dt><b>Revision</b></dt>
            <dd>2</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Deprecation state</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#versions-1.1-promotions">Vulkan 1.1</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Piers Daniell <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_maintenance1]%20@pdaniell-nv%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_maintenance1%20extension%3E%3E">pdaniell-nv</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2018-03-13</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Promoted to Vulkan 1.1 Core</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Dan Ginsburg, Valve</li>
                <li>Daniel Koch, NVIDIA</li>
                <li>Daniel Rakos, AMD</li>
                <li>Jan-Harald Fredriksen, ARM</li>
                <li>Jason Ekstrand, Intel</li>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Jesse Hall, Google</li>
                <li>John Kessenich, Google</li>
                <li>Michael Worcester, Imagination Technologies</li>
                <li>Neil Henning, Codeplay Software Ltd.</li>
                <li>Piers Daniell, NVIDIA</li>
                <li>Slawomir Grajewski, Intel</li>
                <li>Tobias Hector, Imagination Technologies</li>
                <li>Tom Olson, ARM</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_MAINTENANCE_1_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "KHR_MAINTENANCE_1_EXTENSION_NAME".."VK_KHR_maintenance1"
    )

    IntConstant(
        "The extension specification version.",

        "KHR_MAINTENANCE1_SPEC_VERSION".."VK_KHR_MAINTENANCE_1_SPEC_VERSION"
    )

    StringConstant(
        "The extension name.",

        "KHR_MAINTENANCE1_EXTENSION_NAME".expr("VK_KHR_MAINTENANCE_1_EXTENSION_NAME")
    )

    EnumConstant(
        "Extends {@code VkResult}.",

        "ERROR_OUT_OF_POOL_MEMORY_KHR".."-1000069000"
    )

    EnumConstant(
        "Extends {@code VkFormatFeatureFlagBits}.",

        "FORMAT_FEATURE_TRANSFER_SRC_BIT_KHR".enum(0x00004000),
        "FORMAT_FEATURE_TRANSFER_DST_BIT_KHR".enum(0x00008000)
    )

    EnumConstant(
        "Extends {@code VkImageCreateFlagBits}.",

        "IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT_KHR".enum(0x00000020)
    )

    void(
        "TrimCommandPoolKHR",
        "See #TrimCommandPool().",

        VkDevice("device", "the logical device that owns the command pool."),
        VkCommandPool("commandPool", "the command pool to trim."),
        VkCommandPoolTrimFlags("flags", "reserved for future use.")
    )
}