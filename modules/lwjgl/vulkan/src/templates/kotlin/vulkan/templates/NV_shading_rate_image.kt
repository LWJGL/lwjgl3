/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_shading_rate_image = "NVShadingRateImage".nativeClassVK("NV_shading_rate_image", type = "device", postfix = "NV") {
    documentation =
        """
        This extension allows applications to use a variable shading rate when processing fragments of rasterized primitives. By default, Vulkan will spawn one fragment shader for each pixel covered by a primitive. In this extension, applications can bind a <em>shading rate image</em> that can be used to vary the number of fragment shader invocations across the framebuffer. Some portions of the screen may be configured to spawn up to 16 fragment shaders for each pixel, while other portions may use a single fragment shader invocation for a 4x4 block of pixels. This can be useful for use cases like eye tracking, where the portion of the framebuffer that the user is looking at directly can be processed at high frequency, while distant corners of the image can be processed at lower frequency. Each texel in the shading rate image represents a fixed-size rectangle in the framebuffer, covering 16x16 pixels in the initial implementation of this extension. When rasterizing a primitive covering one of these rectangles, the Vulkan implementation reads a texel in the bound shading rate image and looks up the fetched value in a palette to determine a base shading rate.

        In addition to the API support controlling rasterization, this extension also adds Vulkan support for the <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/NV/SPV_NV_shading_rate.html">{@code SPV_NV_shading_rate}</a> extension to SPIR-V. That extension provides two fragment shader variable decorations that allow fragment shaders to determine the shading rate used for processing the fragment:

        <ul>
            <li>{@code FragmentSizeNV}, which indicates the width and height of the set of pixels processed by the fragment shader.</li>
            <li>{@code InvocationsPerPixel}, which indicates the maximum number of fragment shader invocations that could be spawned for the pixel(s) covered by the fragment.</li>
        </ul>

        When using SPIR-V in conjunction with the OpenGL Shading Language (GLSL), the fragment shader capabilities are provided by the {@code GL_NV_shading_rate_image} language extension and correspond to the built-in variables {@code gl_FragmentSizeNV} and {@code gl_InvocationsPerPixelNV}, respectively.

        <h5>VK_NV_shading_rate_image</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_NV_shading_rate_image}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>165</dd>

            <dt><b>Revision</b></dt>
            <dd>3</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Pat Brown <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_shading_rate_image]%20@nvpbrown%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_shading_rate_image%20extension%3E%3E">nvpbrown</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2019-07-18</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>This extension requires <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/NV/SPV_NV_shading_rate.html">{@code SPV_NV_shading_rate}</a></li>
                <li>This extension provides API support for <a target="_blank" href="https://github.com/KhronosGroup/GLSL/blob/master/extensions/nv/GLSL_NV_shading_rate_image.txt">{@code GL_NV_shading_rate_image}</a></li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Pat Brown, NVIDIA</li>
                <li>Carsten Rohde, NVIDIA</li>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Daniel Koch, NVIDIA</li>
                <li>Mathias Schott, NVIDIA</li>
                <li>Matthew Netsch, Qualcomm Technologies, Inc.</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "NV_SHADING_RATE_IMAGE_SPEC_VERSION".."3"
    )

    StringConstant(
        "The extension name.",

        "NV_SHADING_RATE_IMAGE_EXTENSION_NAME".."VK_NV_shading_rate_image"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PIPELINE_VIEWPORT_SHADING_RATE_IMAGE_STATE_CREATE_INFO_NV".."1000164000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_FEATURES_NV".."1000164001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_PROPERTIES_NV".."1000164002",
        "STRUCTURE_TYPE_PIPELINE_VIEWPORT_COARSE_SAMPLE_ORDER_STATE_CREATE_INFO_NV".."1000164005"
    )

    EnumConstant(
        "Extends {@code VkImageLayout}.",

        "IMAGE_LAYOUT_SHADING_RATE_OPTIMAL_NV".."1000164003"
    )

    EnumConstant(
        "Extends {@code VkDynamicState}.",

        "DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV".."1000164004",
        "DYNAMIC_STATE_VIEWPORT_COARSE_SAMPLE_ORDER_NV".."1000164006"
    )

    EnumConstant(
        "Extends {@code VkAccessFlagBits}.",

        "ACCESS_SHADING_RATE_IMAGE_READ_BIT_NV".enum(0x00800000)
    )

    EnumConstant(
        "Extends {@code VkImageUsageFlagBits}.",

        "IMAGE_USAGE_SHADING_RATE_IMAGE_BIT_NV".enum(0x00000100)
    )

    EnumConstant(
        "Extends {@code VkPipelineStageFlagBits}.",

        "PIPELINE_STAGE_SHADING_RATE_IMAGE_BIT_NV".enum(0x00400000)
    )

    EnumConstant(
        """
        VkShadingRatePaletteEntryNV - Shading rate image palette entry types

        <h5>Description</h5>
        The following table indicates the width and height (in pixels) of each fragment generated using the indicated shading rate, as well as the maximum number of fragment shader invocations launched for each fragment. When processing regions of a primitive that have a shading rate of #SHADING_RATE_PALETTE_ENTRY_NO_INVOCATIONS_NV, no fragments will be generated in that region.

        <table class="lwjgl">
            <thead><tr><th>Shading Rate</th><th>Width</th><th>Height</th><th>Invocations</th></tr></thead>
            <tbody>
                <tr><td>#SHADING_RATE_PALETTE_ENTRY_NO_INVOCATIONS_NV</td><td>0</td><td>0</td><td>0</td></tr>
                <tr><td>#SHADING_RATE_PALETTE_ENTRY_16_INVOCATIONS_PER_PIXEL_NV</td><td>1</td><td>1</td><td>16</td></tr>
                <tr><td>#SHADING_RATE_PALETTE_ENTRY_8_INVOCATIONS_PER_PIXEL_NV</td><td>1</td><td>1</td><td>8</td></tr>
                <tr><td>#SHADING_RATE_PALETTE_ENTRY_4_INVOCATIONS_PER_PIXEL_NV</td><td>1</td><td>1</td><td>4</td></tr>
                <tr><td>#SHADING_RATE_PALETTE_ENTRY_2_INVOCATIONS_PER_PIXEL_NV</td><td>1</td><td>1</td><td>2</td></tr>
                <tr><td>#SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_PIXEL_NV</td><td>1</td><td>1</td><td>1</td></tr>
                <tr><td>#SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_2X1_PIXELS_NV</td><td>2</td><td>1</td><td>1</td></tr>
                <tr><td>#SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_1X2_PIXELS_NV</td><td>1</td><td>2</td><td>1</td></tr>
                <tr><td>#SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_2X2_PIXELS_NV</td><td>2</td><td>2</td><td>1</td></tr>
                <tr><td>#SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_4X2_PIXELS_NV</td><td>4</td><td>2</td><td>1</td></tr>
                <tr><td>#SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_2X4_PIXELS_NV</td><td>2</td><td>4</td><td>1</td></tr>
                <tr><td>#SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_4X4_PIXELS_NV</td><td>4</td><td>4</td><td>1</td></tr>
            </tbody>
        </table>

        <h5>See Also</h5>
        ##VkCoarseSampleOrderCustomNV, ##VkShadingRatePaletteNV
        """,

        "SHADING_RATE_PALETTE_ENTRY_NO_INVOCATIONS_NV".."0",
        "SHADING_RATE_PALETTE_ENTRY_16_INVOCATIONS_PER_PIXEL_NV".."1",
        "SHADING_RATE_PALETTE_ENTRY_8_INVOCATIONS_PER_PIXEL_NV".."2",
        "SHADING_RATE_PALETTE_ENTRY_4_INVOCATIONS_PER_PIXEL_NV".."3",
        "SHADING_RATE_PALETTE_ENTRY_2_INVOCATIONS_PER_PIXEL_NV".."4",
        "SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_PIXEL_NV".."5",
        "SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_2X1_PIXELS_NV".."6",
        "SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_1X2_PIXELS_NV".."7",
        "SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_2X2_PIXELS_NV".."8",
        "SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_4X2_PIXELS_NV".."9",
        "SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_2X4_PIXELS_NV".."10",
        "SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_4X4_PIXELS_NV".."11"
    )

    EnumConstant(
        """
        VkCoarseSampleOrderTypeNV - Shading rate image sample ordering types

        <h5>Description</h5>
        <ul>
            <li>#COARSE_SAMPLE_ORDER_TYPE_DEFAULT_NV specifies that coverage samples will be ordered in an implementation-dependent manner.</li>
            <li>#COARSE_SAMPLE_ORDER_TYPE_CUSTOM_NV specifies that coverage samples will be ordered according to the array of custom orderings provided in either the {@code pCustomSampleOrders} member of ##VkPipelineViewportCoarseSampleOrderStateCreateInfoNV or the {@code pCustomSampleOrders} member of #CmdSetCoarseSampleOrderNV().</li>
            <li>#COARSE_SAMPLE_ORDER_TYPE_PIXEL_MAJOR_NV specifies that coverage samples will be ordered sequentially, sorted first by pixel coordinate (in row-major order) and then by <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#primsrast-multisampling-coverage-mask">sample index</a>.</li>
            <li>#COARSE_SAMPLE_ORDER_TYPE_SAMPLE_MAJOR_NV specifies that coverage samples will be ordered sequentially, sorted first by <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#primsrast-multisampling-coverage-mask">sample index</a> and then by pixel coordinate (in row-major order).</li>
        </ul>

        <h5>See Also</h5>
        ##VkPipelineViewportCoarseSampleOrderStateCreateInfoNV, #CmdSetCoarseSampleOrderNV()
        """,

        "COARSE_SAMPLE_ORDER_TYPE_DEFAULT_NV".."0",
        "COARSE_SAMPLE_ORDER_TYPE_CUSTOM_NV".."1",
        "COARSE_SAMPLE_ORDER_TYPE_PIXEL_MAJOR_NV".."2",
        "COARSE_SAMPLE_ORDER_TYPE_SAMPLE_MAJOR_NV".."3"
    )

    void(
        "CmdBindShadingRateImageNV",
        """
        Bind a shading rate image on a command buffer.

        <h5>C Specification</h5>
        When shading rate image usage is enabled in the bound pipeline, the pipeline uses a shading rate image specified by the command:

        <pre><code>
￿void vkCmdBindShadingRateImageNV(
￿    VkCommandBuffer                             commandBuffer,
￿    VkImageView                                 imageView,
￿    VkImageLayout                               imageLayout);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shadingRateImage">shading rate image</a> feature <b>must</b> be enabled</li>
            <li>If {@code imageView} is not #NULL_HANDLE, it <b>must</b> be a valid {@code VkImageView} handle of type #IMAGE_VIEW_TYPE_2D or #IMAGE_VIEW_TYPE_2D_ARRAY</li>
            <li>If {@code imageView} is not #NULL_HANDLE, it <b>must</b> have a format of #FORMAT_R8_UINT</li>
            <li>If {@code imageView} is not #NULL_HANDLE, it <b>must</b> have been created with a {@code usage} value including #IMAGE_USAGE_SHADING_RATE_IMAGE_BIT_NV</li>
            <li>If {@code imageView} is not #NULL_HANDLE, {@code imageLayout} <b>must</b> match the actual {@code VkImageLayout} of each subresource accessible from {@code imageView} at the time the subresource is accessed</li>
            <li>If {@code imageView} is not #NULL_HANDLE, {@code imageLayout} <b>must</b> be #IMAGE_LAYOUT_SHADING_RATE_OPTIMAL_NV or #IMAGE_LAYOUT_GENERAL</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>If {@code imageView} is not #NULL_HANDLE, {@code imageView} <b>must</b> be a valid {@code VkImageView} handle</li>
            <li>{@code imageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>Both of {@code commandBuffer}, and {@code imageView} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkImageView("imageView", "an image view handle specifying the shading rate image. {@code imageView} <b>may</b> be set to #NULL_HANDLE, which is equivalent to specifying a view of an image filled with zero values."),
        VkImageLayout("imageLayout", "the layout that the image subresources accessible from {@code imageView} will be in when the shading rate image is accessed.")
    )

    void(
        "CmdSetViewportShadingRatePaletteNV",
        """
        Set shading rate image palettes dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> the per-viewport shading rate image palettes, call:

        <pre><code>
￿void vkCmdSetViewportShadingRatePaletteNV(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    firstViewport,
￿    uint32_t                                    viewportCount,
￿    const VkShadingRatePaletteNV*               pShadingRatePalettes);</code></pre>

        <h5>Description</h5>
        This command sets the per-viewport shading rate image palettes for subsequent drawing commands when the graphics pipeline is created with #DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineViewportShadingRateImageStateCreateInfoNV{@code ::pShadingRatePalettes} values used to create the currently active pipeline.

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shadingRateImage">shading rate image</a> feature <b>must</b> be enabled</li>
            <li>The sum of {@code firstViewport} and {@code viewportCount} <b>must</b> be between 1 and ##VkPhysicalDeviceLimits{@code ::maxViewports}, inclusive</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-multiViewport">multiple viewports</a> feature is not enabled, {@code firstViewport} <b>must</b> be 0</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-multiViewport">multiple viewports</a> feature is not enabled, {@code viewportCount} <b>must</b> be 1</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pShadingRatePalettes} <b>must</b> be a valid pointer to an array of {@code viewportCount} valid ##VkShadingRatePaletteNV structures</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>{@code viewportCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkShadingRatePaletteNV
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        uint32_t("firstViewport", "the index of the first viewport whose shading rate palette is updated by the command."),
        AutoSize("pShadingRatePalettes")..uint32_t("viewportCount", "the number of viewports whose shading rate palettes are updated by the command."),
        VkShadingRatePaletteNV.const.p("pShadingRatePalettes", "a pointer to an array of ##VkShadingRatePaletteNV structures defining the palette for each viewport.")
    )

    void(
        "CmdSetCoarseSampleOrderNV",
        """
        Set order of coverage samples for coarse fragments dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> the order of coverage samples in fragments larger than one pixel, call:

        <pre><code>
￿void vkCmdSetCoarseSampleOrderNV(
￿    VkCommandBuffer                             commandBuffer,
￿    VkCoarseSampleOrderTypeNV                   sampleOrderType,
￿    uint32_t                                    customSampleOrderCount,
￿    const VkCoarseSampleOrderCustomNV*          pCustomSampleOrders);</code></pre>

        <h5>Description</h5>
        If {@code sampleOrderType} is #COARSE_SAMPLE_ORDER_TYPE_CUSTOM_NV, the coverage sample order used for any combination of fragment area and coverage sample count not enumerated in {@code pCustomSampleOrders} will be identical to that used for #COARSE_SAMPLE_ORDER_TYPE_DEFAULT_NV.

        This command sets the order of coverage samples for subsequent drawing commands when the graphics pipeline is created with #DYNAMIC_STATE_VIEWPORT_COARSE_SAMPLE_ORDER_NV set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineViewportCoarseSampleOrderStateCreateInfoNV values used to create the currently active pipeline.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code sampleOrderType} is not #COARSE_SAMPLE_ORDER_TYPE_CUSTOM_NV, {@code customSamplerOrderCount} <b>must</b> be 0</li>
            <li>The array {@code pCustomSampleOrders} <b>must</b> not contain two structures with matching values for both the {@code shadingRate} and {@code sampleCount} members</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code sampleOrderType} <b>must</b> be a valid {@code VkCoarseSampleOrderTypeNV} value</li>
            <li>If {@code customSampleOrderCount} is not 0, {@code pCustomSampleOrders} <b>must</b> be a valid pointer to an array of {@code customSampleOrderCount} valid ##VkCoarseSampleOrderCustomNV structures</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkCoarseSampleOrderCustomNV
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkCoarseSampleOrderTypeNV("sampleOrderType", "specifies the mechanism used to order coverage samples in fragments larger than one pixel."),
        AutoSize("pCustomSampleOrders")..uint32_t("customSampleOrderCount", "specifies the number of custom sample orderings to use when ordering coverage samples."),
        nullable..VkCoarseSampleOrderCustomNV.const.p("pCustomSampleOrders", "a pointer to an array of ##VkCoarseSampleOrderCustomNV structures, each structure specifying the coverage sample order for a single combination of fragment area and coverage sample count.")
    )
}