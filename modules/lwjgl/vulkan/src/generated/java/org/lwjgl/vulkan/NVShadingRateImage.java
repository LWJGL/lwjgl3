/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This extension allows applications to use a variable shading rate when processing fragments of rasterized primitives. By default, Vulkan will spawn one fragment shader for each pixel covered by a primitive. In this extension, applications can bind a <em>shading rate image</em> that can be used to vary the number of fragment shader invocations across the framebuffer. Some portions of the screen may be configured to spawn up to 16 fragment shaders for each pixel, while other portions may use a single fragment shader invocation for a 4x4 block of pixels. This can be useful for use cases like eye tracking, where the portion of the framebuffer that the user is looking at directly can be processed at high frequency, while distant corners of the image can be processed at lower frequency. Each texel in the shading rate image represents a fixed-size rectangle in the framebuffer, covering 16x16 pixels in the initial implementation of this extension. When rasterizing a primitive covering one of these rectangles, the Vulkan implementation reads a texel in the bound shading rate image and looks up the fetched value in a palette to determine a base shading rate.
 * 
 * <p>In addition to the API support controlling rasterization, this extension also adds Vulkan support for the <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/NV/SPV_NV_shading_rate.html">{@code SPV_NV_shading_rate}</a> extension to SPIR-V. That extension provides two fragment shader variable decorations that allow fragment shaders to determine the shading rate used for processing the fragment:</p>
 * 
 * <ul>
 * <li>{@code FragmentSizeNV}, which indicates the width and height of the set of pixels processed by the fragment shader.</li>
 * <li>{@code InvocationsPerPixel}, which indicates the maximum number of fragment shader invocations that could be spawned for the pixel(s) covered by the fragment.</li>
 * </ul>
 * 
 * <p>When using SPIR-V in conjunction with the OpenGL Shading Language (GLSL), the fragment shader capabilities are provided by the {@code GL_NV_shading_rate_image} language extension and correspond to the built-in variables {@code gl_FragmentSizeNV} and {@code gl_InvocationsPerPixelNV}, respectively.</p>
 * 
 * <h5>VK_NV_shading_rate_image</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_NV_shading_rate_image}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>165</dd>
 * <dt><b>Revision</b></dt>
 * <dd>3</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Pat Brown <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_shading_rate_image]%20@nvpbrown%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_shading_rate_image%20extension%3E%3E">nvpbrown</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2019-07-18</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension requires <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/NV/SPV_NV_shading_rate.html">{@code SPV_NV_shading_rate}</a></li>
 * <li>This extension provides API support for <a target="_blank" href="https://github.com/KhronosGroup/GLSL/blob/master/extensions/nv/GLSL_NV_shading_rate_image.txt">{@code GL_NV_shading_rate_image}</a></li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Pat Brown, NVIDIA</li>
 * <li>Carsten Rohde, NVIDIA</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Daniel Koch, NVIDIA</li>
 * <li>Mathias Schott, NVIDIA</li>
 * <li>Matthew Netsch, Qualcomm Technologies, Inc.</li>
 * </ul></dd>
 * </dl>
 */
public class NVShadingRateImage {

    /** The extension specification version. */
    public static final int VK_NV_SHADING_RATE_IMAGE_SPEC_VERSION = 3;

    /** The extension name. */
    public static final String VK_NV_SHADING_RATE_IMAGE_EXTENSION_NAME = "VK_NV_shading_rate_image";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_SHADING_RATE_IMAGE_STATE_CREATE_INFO_NV STRUCTURE_TYPE_PIPELINE_VIEWPORT_SHADING_RATE_IMAGE_STATE_CREATE_INFO_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_FEATURES_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_PROPERTIES_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_COARSE_SAMPLE_ORDER_STATE_CREATE_INFO_NV STRUCTURE_TYPE_PIPELINE_VIEWPORT_COARSE_SAMPLE_ORDER_STATE_CREATE_INFO_NV}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_SHADING_RATE_IMAGE_STATE_CREATE_INFO_NV  = 1000164000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_FEATURES_NV             = 1000164001,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_PROPERTIES_NV           = 1000164002,
        VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_COARSE_SAMPLE_ORDER_STATE_CREATE_INFO_NV = 1000164005;

    /** Extends {@code VkImageLayout}. */
    public static final int VK_IMAGE_LAYOUT_SHADING_RATE_OPTIMAL_NV = 1000164003;

    /**
     * Extends {@code VkDynamicState}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV}</li>
     * <li>{@link #VK_DYNAMIC_STATE_VIEWPORT_COARSE_SAMPLE_ORDER_NV DYNAMIC_STATE_VIEWPORT_COARSE_SAMPLE_ORDER_NV}</li>
     * </ul>
     */
    public static final int
        VK_DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV = 1000164004,
        VK_DYNAMIC_STATE_VIEWPORT_COARSE_SAMPLE_ORDER_NV  = 1000164006;

    /** Extends {@code VkAccessFlagBits}. */
    public static final int VK_ACCESS_SHADING_RATE_IMAGE_READ_BIT_NV = 0x800000;

    /** Extends {@code VkImageUsageFlagBits}. */
    public static final int VK_IMAGE_USAGE_SHADING_RATE_IMAGE_BIT_NV = 0x100;

    /** Extends {@code VkPipelineStageFlagBits}. */
    public static final int VK_PIPELINE_STAGE_SHADING_RATE_IMAGE_BIT_NV = 0x400000;

    /**
     * VkShadingRatePaletteEntryNV - Shading rate image palette entry types
     * 
     * <h5>Description</h5>
     * 
     * <p>The following table indicates the width and height (in pixels) of each fragment generated using the indicated shading rate, as well as the maximum number of fragment shader invocations launched for each fragment. When processing regions of a primitive that have a shading rate of {@link #VK_SHADING_RATE_PALETTE_ENTRY_NO_INVOCATIONS_NV SHADING_RATE_PALETTE_ENTRY_NO_INVOCATIONS_NV}, no fragments will be generated in that region.</p>
     * 
     * <table class="lwjgl">
     * <thead><tr><th>Shading Rate</th><th>Width</th><th>Height</th><th>Invocations</th></tr></thead>
     * <tbody>
     * <tr><td>{@link #VK_SHADING_RATE_PALETTE_ENTRY_NO_INVOCATIONS_NV SHADING_RATE_PALETTE_ENTRY_NO_INVOCATIONS_NV}</td><td>0</td><td>0</td><td>0</td></tr>
     * <tr><td>{@link #VK_SHADING_RATE_PALETTE_ENTRY_16_INVOCATIONS_PER_PIXEL_NV SHADING_RATE_PALETTE_ENTRY_16_INVOCATIONS_PER_PIXEL_NV}</td><td>1</td><td>1</td><td>16</td></tr>
     * <tr><td>{@link #VK_SHADING_RATE_PALETTE_ENTRY_8_INVOCATIONS_PER_PIXEL_NV SHADING_RATE_PALETTE_ENTRY_8_INVOCATIONS_PER_PIXEL_NV}</td><td>1</td><td>1</td><td>8</td></tr>
     * <tr><td>{@link #VK_SHADING_RATE_PALETTE_ENTRY_4_INVOCATIONS_PER_PIXEL_NV SHADING_RATE_PALETTE_ENTRY_4_INVOCATIONS_PER_PIXEL_NV}</td><td>1</td><td>1</td><td>4</td></tr>
     * <tr><td>{@link #VK_SHADING_RATE_PALETTE_ENTRY_2_INVOCATIONS_PER_PIXEL_NV SHADING_RATE_PALETTE_ENTRY_2_INVOCATIONS_PER_PIXEL_NV}</td><td>1</td><td>1</td><td>2</td></tr>
     * <tr><td>{@link #VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_PIXEL_NV SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_PIXEL_NV}</td><td>1</td><td>1</td><td>1</td></tr>
     * <tr><td>{@link #VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_2X1_PIXELS_NV SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_2X1_PIXELS_NV}</td><td>2</td><td>1</td><td>1</td></tr>
     * <tr><td>{@link #VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_1X2_PIXELS_NV SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_1X2_PIXELS_NV}</td><td>1</td><td>2</td><td>1</td></tr>
     * <tr><td>{@link #VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_2X2_PIXELS_NV SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_2X2_PIXELS_NV}</td><td>2</td><td>2</td><td>1</td></tr>
     * <tr><td>{@link #VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_4X2_PIXELS_NV SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_4X2_PIXELS_NV}</td><td>4</td><td>2</td><td>1</td></tr>
     * <tr><td>{@link #VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_2X4_PIXELS_NV SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_2X4_PIXELS_NV}</td><td>2</td><td>4</td><td>1</td></tr>
     * <tr><td>{@link #VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_4X4_PIXELS_NV SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_4X4_PIXELS_NV}</td><td>4</td><td>4</td><td>1</td></tr>
     * </tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkCoarseSampleOrderCustomNV}, {@link VkShadingRatePaletteNV}</p>
     */
    public static final int
        VK_SHADING_RATE_PALETTE_ENTRY_NO_INVOCATIONS_NV              = 0,
        VK_SHADING_RATE_PALETTE_ENTRY_16_INVOCATIONS_PER_PIXEL_NV    = 1,
        VK_SHADING_RATE_PALETTE_ENTRY_8_INVOCATIONS_PER_PIXEL_NV     = 2,
        VK_SHADING_RATE_PALETTE_ENTRY_4_INVOCATIONS_PER_PIXEL_NV     = 3,
        VK_SHADING_RATE_PALETTE_ENTRY_2_INVOCATIONS_PER_PIXEL_NV     = 4,
        VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_PIXEL_NV      = 5,
        VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_2X1_PIXELS_NV = 6,
        VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_1X2_PIXELS_NV = 7,
        VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_2X2_PIXELS_NV = 8,
        VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_4X2_PIXELS_NV = 9,
        VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_2X4_PIXELS_NV = 10,
        VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_4X4_PIXELS_NV = 11;

    /**
     * VkCoarseSampleOrderTypeNV - Shading rate image sample ordering types
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_COARSE_SAMPLE_ORDER_TYPE_DEFAULT_NV COARSE_SAMPLE_ORDER_TYPE_DEFAULT_NV} specifies that coverage samples will be ordered in an implementation-dependent manner.</li>
     * <li>{@link #VK_COARSE_SAMPLE_ORDER_TYPE_CUSTOM_NV COARSE_SAMPLE_ORDER_TYPE_CUSTOM_NV} specifies that coverage samples will be ordered according to the array of custom orderings provided in either the {@code pCustomSampleOrders} member of {@link VkPipelineViewportCoarseSampleOrderStateCreateInfoNV} or the {@code pCustomSampleOrders} member of {@link #vkCmdSetCoarseSampleOrderNV CmdSetCoarseSampleOrderNV}.</li>
     * <li>{@link #VK_COARSE_SAMPLE_ORDER_TYPE_PIXEL_MAJOR_NV COARSE_SAMPLE_ORDER_TYPE_PIXEL_MAJOR_NV} specifies that coverage samples will be ordered sequentially, sorted first by pixel coordinate (in row-major order) and then by <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-multisampling-coverage-mask">sample index</a>.</li>
     * <li>{@link #VK_COARSE_SAMPLE_ORDER_TYPE_SAMPLE_MAJOR_NV COARSE_SAMPLE_ORDER_TYPE_SAMPLE_MAJOR_NV} specifies that coverage samples will be ordered sequentially, sorted first by <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-multisampling-coverage-mask">sample index</a> and then by pixel coordinate (in row-major order).</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPipelineViewportCoarseSampleOrderStateCreateInfoNV}, {@link #vkCmdSetCoarseSampleOrderNV CmdSetCoarseSampleOrderNV}</p>
     */
    public static final int
        VK_COARSE_SAMPLE_ORDER_TYPE_DEFAULT_NV      = 0,
        VK_COARSE_SAMPLE_ORDER_TYPE_CUSTOM_NV       = 1,
        VK_COARSE_SAMPLE_ORDER_TYPE_PIXEL_MAJOR_NV  = 2,
        VK_COARSE_SAMPLE_ORDER_TYPE_SAMPLE_MAJOR_NV = 3;

    protected NVShadingRateImage() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdBindShadingRateImageNV ] ---

    /**
     * Bind a shading rate image on a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>When shading rate image usage is enabled in the bound pipeline, the pipeline uses a shading rate image specified by the command:</p>
     * 
     * <pre><code>
     * void vkCmdBindShadingRateImageNV(
     *     VkCommandBuffer                             commandBuffer,
     *     VkImageView                                 imageView,
     *     VkImageLayout                               imageLayout);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-shadingRateImage">shading rate image</a> feature <b>must</b> be enabled</li>
     * <li>If {@code imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, it <b>must</b> be a valid {@code VkImageView} handle of type {@link VK10#VK_IMAGE_VIEW_TYPE_2D IMAGE_VIEW_TYPE_2D} or {@link VK10#VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY}</li>
     * <li>If {@code imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, it <b>must</b> have a format of {@link VK10#VK_FORMAT_R8_UINT FORMAT_R8_UINT}</li>
     * <li>If {@code imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, it <b>must</b> have been created with a {@code usage} value including {@link #VK_IMAGE_USAGE_SHADING_RATE_IMAGE_BIT_NV IMAGE_USAGE_SHADING_RATE_IMAGE_BIT_NV}</li>
     * <li>If {@code imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code imageLayout} <b>must</b> match the actual {@code VkImageLayout} of each subresource accessible from {@code imageView} at the time the subresource is accessed</li>
     * <li>If {@code imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code imageLayout} <b>must</b> be {@link #VK_IMAGE_LAYOUT_SHADING_RATE_OPTIMAL_NV IMAGE_LAYOUT_SHADING_RATE_OPTIMAL_NV} or {@link VK10#VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>If {@code imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code imageView} <b>must</b> be a valid {@code VkImageView} handle</li>
     * <li>{@code imageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>Both of {@code commandBuffer}, and {@code imageView} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param imageView     an image view handle specifying the shading rate image. {@code imageView} <b>may</b> be set to {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, which is equivalent to specifying a view of an image filled with zero values.
     * @param imageLayout   the layout that the image subresources accessible from {@code imageView} will be in when the shading rate image is accessed.
     */
    public static void vkCmdBindShadingRateImageNV(VkCommandBuffer commandBuffer, @NativeType("VkImageView") long imageView, @NativeType("VkImageLayout") int imageLayout) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindShadingRateImageNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJV(commandBuffer.address(), imageView, imageLayout, __functionAddress);
    }

    // --- [ vkCmdSetViewportShadingRatePaletteNV ] ---

    /**
     * Unsafe version of: {@link #vkCmdSetViewportShadingRatePaletteNV CmdSetViewportShadingRatePaletteNV}
     *
     * @param viewportCount the number of viewports whose shading rate palettes are updated by the command.
     */
    public static void nvkCmdSetViewportShadingRatePaletteNV(VkCommandBuffer commandBuffer, int firstViewport, int viewportCount, long pShadingRatePalettes) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetViewportShadingRatePaletteNV;
        if (CHECKS) {
            check(__functionAddress);
            Struct.validate(pShadingRatePalettes, viewportCount, VkShadingRatePaletteNV.SIZEOF, VkShadingRatePaletteNV::validate);
        }
        callPPV(commandBuffer.address(), firstViewport, viewportCount, pShadingRatePalettes, __functionAddress);
    }

    /**
     * Set shading rate image palettes dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the per-viewport shading rate image palettes, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetViewportShadingRatePaletteNV(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    firstViewport,
     *     uint32_t                                    viewportCount,
     *     const VkShadingRatePaletteNV*               pShadingRatePalettes);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the per-viewport shading rate image palettes for subsequent drawing commands when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineViewportShadingRateImageStateCreateInfoNV}{@code ::pShadingRatePalettes} values used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-shadingRateImage">shading rate image</a> feature <b>must</b> be enabled</li>
     * <li>The sum of {@code firstViewport} and {@code viewportCount} <b>must</b> be between 1 and {@link VkPhysicalDeviceLimits}{@code ::maxViewports}, inclusive</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-multiViewport">multiple viewports</a> feature is not enabled, {@code firstViewport} <b>must</b> be 0</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-multiViewport">multiple viewports</a> feature is not enabled, {@code viewportCount} <b>must</b> be 1</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pShadingRatePalettes} <b>must</b> be a valid pointer to an array of {@code viewportCount} valid {@link VkShadingRatePaletteNV} structures</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>{@code viewportCount} <b>must</b> be greater than 0</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkShadingRatePaletteNV}</p>
     *
     * @param commandBuffer        the command buffer into which the command will be recorded.
     * @param firstViewport        the index of the first viewport whose shading rate palette is updated by the command.
     * @param pShadingRatePalettes a pointer to an array of {@link VkShadingRatePaletteNV} structures defining the palette for each viewport.
     */
    public static void vkCmdSetViewportShadingRatePaletteNV(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstViewport, @NativeType("VkShadingRatePaletteNV const *") VkShadingRatePaletteNV.Buffer pShadingRatePalettes) {
        nvkCmdSetViewportShadingRatePaletteNV(commandBuffer, firstViewport, pShadingRatePalettes.remaining(), pShadingRatePalettes.address());
    }

    // --- [ vkCmdSetCoarseSampleOrderNV ] ---

    /**
     * Unsafe version of: {@link #vkCmdSetCoarseSampleOrderNV CmdSetCoarseSampleOrderNV}
     *
     * @param customSampleOrderCount specifies the number of custom sample orderings to use when ordering coverage samples.
     */
    public static void nvkCmdSetCoarseSampleOrderNV(VkCommandBuffer commandBuffer, int sampleOrderType, int customSampleOrderCount, long pCustomSampleOrders) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetCoarseSampleOrderNV;
        if (CHECKS) {
            check(__functionAddress);
            if (pCustomSampleOrders != NULL) { Struct.validate(pCustomSampleOrders, customSampleOrderCount, VkCoarseSampleOrderCustomNV.SIZEOF, VkCoarseSampleOrderCustomNV::validate); }
        }
        callPPV(commandBuffer.address(), sampleOrderType, customSampleOrderCount, pCustomSampleOrders, __functionAddress);
    }

    /**
     * Set order of coverage samples for coarse fragments dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the order of coverage samples in fragments larger than one pixel, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetCoarseSampleOrderNV(
     *     VkCommandBuffer                             commandBuffer,
     *     VkCoarseSampleOrderTypeNV                   sampleOrderType,
     *     uint32_t                                    customSampleOrderCount,
     *     const VkCoarseSampleOrderCustomNV*          pCustomSampleOrders);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If {@code sampleOrderType} is {@link #VK_COARSE_SAMPLE_ORDER_TYPE_CUSTOM_NV COARSE_SAMPLE_ORDER_TYPE_CUSTOM_NV}, the coverage sample order used for any combination of fragment area and coverage sample count not enumerated in {@code pCustomSampleOrders} will be identical to that used for {@link #VK_COARSE_SAMPLE_ORDER_TYPE_DEFAULT_NV COARSE_SAMPLE_ORDER_TYPE_DEFAULT_NV}.</p>
     * 
     * <p>This command sets the order of coverage samples for subsequent drawing commands when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_VIEWPORT_COARSE_SAMPLE_ORDER_NV DYNAMIC_STATE_VIEWPORT_COARSE_SAMPLE_ORDER_NV} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineViewportCoarseSampleOrderStateCreateInfoNV} values used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If {@code sampleOrderType} is not {@link #VK_COARSE_SAMPLE_ORDER_TYPE_CUSTOM_NV COARSE_SAMPLE_ORDER_TYPE_CUSTOM_NV}, {@code customSamplerOrderCount} <b>must</b> be 0</li>
     * <li>The array {@code pCustomSampleOrders} <b>must</b> not contain two structures with matching values for both the {@code shadingRate} and {@code sampleCount} members</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code sampleOrderType} <b>must</b> be a valid {@code VkCoarseSampleOrderTypeNV} value</li>
     * <li>If {@code customSampleOrderCount} is not 0, {@code pCustomSampleOrders} <b>must</b> be a valid pointer to an array of {@code customSampleOrderCount} valid {@link VkCoarseSampleOrderCustomNV} structures</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkCoarseSampleOrderCustomNV}</p>
     *
     * @param commandBuffer       the command buffer into which the command will be recorded.
     * @param sampleOrderType     specifies the mechanism used to order coverage samples in fragments larger than one pixel.
     * @param pCustomSampleOrders a pointer to an array of {@link VkCoarseSampleOrderCustomNV} structures, each structure specifying the coverage sample order for a single combination of fragment area and coverage sample count.
     */
    public static void vkCmdSetCoarseSampleOrderNV(VkCommandBuffer commandBuffer, @NativeType("VkCoarseSampleOrderTypeNV") int sampleOrderType, @Nullable @NativeType("VkCoarseSampleOrderCustomNV const *") VkCoarseSampleOrderCustomNV.Buffer pCustomSampleOrders) {
        nvkCmdSetCoarseSampleOrderNV(commandBuffer, sampleOrderType, remainingSafe(pCustomSampleOrders), memAddressSafe(pCustomSampleOrders));
    }

}