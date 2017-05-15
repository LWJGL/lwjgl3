/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val KHR_maintenance1 = "KHRMaintenance1".nativeClassVK("KHR_maintenance1", type = "device", postfix = KHR) {
    documentation =
        """
        {@code VK_KHR_maintenance1} adds a collection of minor features that were intentionally left out or overlooked from the original Vulkan 1.0 release.

        The new features are as follows:

        <ul>
            <li>Allow 2D and 2D array image views to be created from 3D images, which can then be used as color framebuffer attachments. This allows applications to render to slices of a 3D image.</li>
            <li>Support #CmdCopyImage() between 2D array layers and 3D slices. This extension allows copying from layers of a 2D array image to slices of a 3D image and vice versa.</li>
            <li>Allow negative height to be specified in the slink::VkViewport{@code ::height} field to perform y-inversion of the clip-space to framebuffer-space transform. This allows apps to avoid having to use gl_Position.y = -gl_Position.y in shaders also targeting other APIs.</li>
            <li>Allow implementations to express support for doing just transfers and clears of image formats that they otherwise support no other format features for. This is done by adding new format feature flags #FORMAT_FEATURE_TRANSFER_SRC_BIT_KHR and #FORMAT_FEATURE_TRANSFER_DST_BIT_KHR.</li>
            <li>Support #CmdFillBuffer() on transfer-only queues. Previously #CmdFillBuffer() was defined to only work on command buffers allocated from command pools which support graphics or compute queues. It is now allowed on queues that just support transfer operations.</li>
            <li>Fix the inconsistency of how error conditions are returned between the #CreateGraphicsPipelines() and #CreateComputePipelines() functions and the #AllocateDescriptorSets() and #AllocateCommandBuffers() functions.</li>
            <li>Add new #ERROR_OUT_OF_POOL_MEMORY_KHR error so implementations can give a more precise reason for #AllocateDescriptorSets() failures.</li>
            <li>Add a new command #TrimCommandPoolKHR() which gives the implementation an opportunity to release any unused command pool memory back to the system.</li>
        </ul>

        <dl>
            <dt><b>Name String</b></dt>
            <dd>VK_KHR_maintenance1</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>70</dd>

            <dt><b>Status</b></dt>
            <dd>Draft</dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2016-10-26</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Dependencies</b></dt>
            <dd><ul>
                <li>This extension is written against version 1.0 of the Vulkan API.</li>
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

            <dt><b>Contacts</b></dt>
            <dd><ul>
                <li>Piers Daniell (pdaniell 'at' nvidia.com)</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_MAINTENANCE1_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_MAINTENANCE1_EXTENSION_NAME".."VK_KHR_maintenance1"
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
        """
        Trim a command pool.

        <h5>C Specification</h5>
        To trim a command pool, call:

        <code><pre>
￿void vkTrimCommandPoolKHR(
￿    VkDevice                                    device,
￿    VkCommandPool                               commandPool,
￿    VkCommandPoolTrimFlagsKHR                   flags);</pre></code>

        <h5>Description</h5>
        Trimming a command pool recycles unused memory from the command pool back to the system. Command buffers allocated from the pool are not affected by the command.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        This command provides applications with some control over the internal memory allocations used by command pools.

        Unused memory normally arises from command buffers that have been recorded and later reset, such that they are no longer using the memory. On reset, a command buffer can return memory to its command pool, but the only way to release memory from a command pool to the system requires calling #ResetCommandPool(), which cannot be executed while any command buffers from that pool are still in use. Subsequent recording operations into command buffers will re-use this memory but since total memory requirements fluctuate over time, unused memory can accumulate.

        In this situation, trimming a command pool <b>may</b> be useful to return unused memory back to the system, returning the total outstanding memory allocated by the pool back to a more "average" value.

        Implementations utilize many internal allocation strategies that make it impossible to guarantee that all unused memory is released back to the system. For instance, an implementation of a command pool <b>may</b> involve allocating memory in bulk from the system and sub-allocating from that memory. In such an implementation any live command buffer that holds a reference to a bulk allocation would prevent that allocation from being freed, even if only a small proportion of the bulk allocation is in use.

        In most cases trimming will result in a reduction in allocated but unused memory, but it does not guarantee the "ideal" behaviour.

        Trimming <b>may</b> be an expensive operation, and <b>should</b> not be called frequently. Trimming <b>should</b> be treated as a way to relieve memory pressure after application-known points when there exists enough unused memory that the cost of trimming is "worth" it.
        </div>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code commandPool} <b>must</b> be a valid {@code VkCommandPool} handle</li>
            <li>{@code flags} <b>must</b> be 0</li>
            <li>{@code commandPool} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandPool} <b>must</b> be externally synchronized</li>
        </ul>
        """,

        VkDevice.IN("device", "the logical device that owns the command pool."),
        VkCommandPool.IN("commandPool", "the command pool to trim."),
        VkCommandPoolTrimFlagsKHR.IN("flags", "reserved for future use.")
    )
}