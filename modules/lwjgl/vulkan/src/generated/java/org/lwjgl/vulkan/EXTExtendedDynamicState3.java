/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This extension adds almost all of the remaining pipeline state as dynamic state to help applications further reduce the number of monolithic pipelines they need to create and bind.
 * 
 * <h5>VK_EXT_extended_dynamic_state3</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_extended_dynamic_state3}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>456</dd>
 * <dt><b>Revision</b></dt>
 * <dd>2</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Piers Daniell <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_extended_dynamic_state3]%20@pdaniell-nv%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_extended_dynamic_state3%20extension*">pdaniell-nv</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_EXT_extended_dynamic_state3.adoc">VK_EXT_extended_dynamic_state3</a></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2022-09-02</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Daniel Story, Nintendo</li>
 * <li>Jamie Madill, Google</li>
 * <li>Jan-Harald Fredriksen, Arm</li>
 * <li>Faith Ekstrand, Collabora</li>
 * <li>Mike Blumenkrantz, Valve</li>
 * <li>Ricardo Garcia, Igalia</li>
 * <li>Samuel Pitoiset, Valve</li>
 * <li>Shahbaz Youssefi, Google</li>
 * <li>Stu Smith, AMD</li>
 * <li>Tapani Pälli, Intel</li>
 * </ul></dd>
 * </dl>
 */
public class EXTExtendedDynamicState3 {

    /** The extension specification version. */
    public static final int VK_EXT_EXTENDED_DYNAMIC_STATE_3_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String VK_EXT_EXTENDED_DYNAMIC_STATE_3_EXTENSION_NAME = "VK_EXT_extended_dynamic_state3";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_3_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_3_FEATURES_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_3_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_3_PROPERTIES_EXT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_3_FEATURES_EXT   = 1000455000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_3_PROPERTIES_EXT = 1000455001;

    /**
     * Extends {@code VkDynamicState}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_DYNAMIC_STATE_TESSELLATION_DOMAIN_ORIGIN_EXT DYNAMIC_STATE_TESSELLATION_DOMAIN_ORIGIN_EXT}</li>
     * <li>{@link #VK_DYNAMIC_STATE_DEPTH_CLAMP_ENABLE_EXT DYNAMIC_STATE_DEPTH_CLAMP_ENABLE_EXT}</li>
     * <li>{@link #VK_DYNAMIC_STATE_POLYGON_MODE_EXT DYNAMIC_STATE_POLYGON_MODE_EXT}</li>
     * <li>{@link #VK_DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT}</li>
     * <li>{@link #VK_DYNAMIC_STATE_SAMPLE_MASK_EXT DYNAMIC_STATE_SAMPLE_MASK_EXT}</li>
     * <li>{@link #VK_DYNAMIC_STATE_ALPHA_TO_COVERAGE_ENABLE_EXT DYNAMIC_STATE_ALPHA_TO_COVERAGE_ENABLE_EXT}</li>
     * <li>{@link #VK_DYNAMIC_STATE_ALPHA_TO_ONE_ENABLE_EXT DYNAMIC_STATE_ALPHA_TO_ONE_ENABLE_EXT}</li>
     * <li>{@link #VK_DYNAMIC_STATE_LOGIC_OP_ENABLE_EXT DYNAMIC_STATE_LOGIC_OP_ENABLE_EXT}</li>
     * <li>{@link #VK_DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT}</li>
     * <li>{@link #VK_DYNAMIC_STATE_COLOR_BLEND_EQUATION_EXT DYNAMIC_STATE_COLOR_BLEND_EQUATION_EXT}</li>
     * <li>{@link #VK_DYNAMIC_STATE_COLOR_WRITE_MASK_EXT DYNAMIC_STATE_COLOR_WRITE_MASK_EXT}</li>
     * <li>{@link #VK_DYNAMIC_STATE_RASTERIZATION_STREAM_EXT DYNAMIC_STATE_RASTERIZATION_STREAM_EXT}</li>
     * <li>{@link #VK_DYNAMIC_STATE_CONSERVATIVE_RASTERIZATION_MODE_EXT DYNAMIC_STATE_CONSERVATIVE_RASTERIZATION_MODE_EXT}</li>
     * <li>{@link #VK_DYNAMIC_STATE_EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_EXT DYNAMIC_STATE_EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_EXT}</li>
     * <li>{@link #VK_DYNAMIC_STATE_DEPTH_CLIP_ENABLE_EXT DYNAMIC_STATE_DEPTH_CLIP_ENABLE_EXT}</li>
     * <li>{@link #VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT}</li>
     * <li>{@link #VK_DYNAMIC_STATE_COLOR_BLEND_ADVANCED_EXT DYNAMIC_STATE_COLOR_BLEND_ADVANCED_EXT}</li>
     * <li>{@link #VK_DYNAMIC_STATE_PROVOKING_VERTEX_MODE_EXT DYNAMIC_STATE_PROVOKING_VERTEX_MODE_EXT}</li>
     * <li>{@link #VK_DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT}</li>
     * <li>{@link #VK_DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT}</li>
     * <li>{@link #VK_DYNAMIC_STATE_DEPTH_CLIP_NEGATIVE_ONE_TO_ONE_EXT DYNAMIC_STATE_DEPTH_CLIP_NEGATIVE_ONE_TO_ONE_EXT}</li>
     * </ul>
     */
    public static final int
        VK_DYNAMIC_STATE_TESSELLATION_DOMAIN_ORIGIN_EXT          = 1000455002,
        VK_DYNAMIC_STATE_DEPTH_CLAMP_ENABLE_EXT                  = 1000455003,
        VK_DYNAMIC_STATE_POLYGON_MODE_EXT                        = 1000455004,
        VK_DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT               = 1000455005,
        VK_DYNAMIC_STATE_SAMPLE_MASK_EXT                         = 1000455006,
        VK_DYNAMIC_STATE_ALPHA_TO_COVERAGE_ENABLE_EXT            = 1000455007,
        VK_DYNAMIC_STATE_ALPHA_TO_ONE_ENABLE_EXT                 = 1000455008,
        VK_DYNAMIC_STATE_LOGIC_OP_ENABLE_EXT                     = 1000455009,
        VK_DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT                  = 1000455010,
        VK_DYNAMIC_STATE_COLOR_BLEND_EQUATION_EXT                = 1000455011,
        VK_DYNAMIC_STATE_COLOR_WRITE_MASK_EXT                    = 1000455012,
        VK_DYNAMIC_STATE_RASTERIZATION_STREAM_EXT                = 1000455013,
        VK_DYNAMIC_STATE_CONSERVATIVE_RASTERIZATION_MODE_EXT     = 1000455014,
        VK_DYNAMIC_STATE_EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_EXT = 1000455015,
        VK_DYNAMIC_STATE_DEPTH_CLIP_ENABLE_EXT                   = 1000455016,
        VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT             = 1000455017,
        VK_DYNAMIC_STATE_COLOR_BLEND_ADVANCED_EXT                = 1000455018,
        VK_DYNAMIC_STATE_PROVOKING_VERTEX_MODE_EXT               = 1000455019,
        VK_DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT             = 1000455020,
        VK_DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT                 = 1000455021,
        VK_DYNAMIC_STATE_DEPTH_CLIP_NEGATIVE_ONE_TO_ONE_EXT      = 1000455022;

    /** Extends {@code VkDynamicState}. */
    public static final int VK_DYNAMIC_STATE_VIEWPORT_W_SCALING_ENABLE_NV = 1000455023;

    /** Extends {@code VkDynamicState}. */
    public static final int VK_DYNAMIC_STATE_VIEWPORT_SWIZZLE_NV = 1000455024;

    /**
     * Extends {@code VkDynamicState}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_DYNAMIC_STATE_COVERAGE_TO_COLOR_ENABLE_NV DYNAMIC_STATE_COVERAGE_TO_COLOR_ENABLE_NV}</li>
     * <li>{@link #VK_DYNAMIC_STATE_COVERAGE_TO_COLOR_LOCATION_NV DYNAMIC_STATE_COVERAGE_TO_COLOR_LOCATION_NV}</li>
     * </ul>
     */
    public static final int
        VK_DYNAMIC_STATE_COVERAGE_TO_COLOR_ENABLE_NV   = 1000455025,
        VK_DYNAMIC_STATE_COVERAGE_TO_COLOR_LOCATION_NV = 1000455026;

    /**
     * Extends {@code VkDynamicState}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_DYNAMIC_STATE_COVERAGE_MODULATION_MODE_NV DYNAMIC_STATE_COVERAGE_MODULATION_MODE_NV}</li>
     * <li>{@link #VK_DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_ENABLE_NV DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_ENABLE_NV}</li>
     * <li>{@link #VK_DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_NV DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_NV}</li>
     * </ul>
     */
    public static final int
        VK_DYNAMIC_STATE_COVERAGE_MODULATION_MODE_NV         = 1000455027,
        VK_DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_ENABLE_NV = 1000455028,
        VK_DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_NV        = 1000455029;

    /** Extends {@code VkDynamicState}. */
    public static final int VK_DYNAMIC_STATE_SHADING_RATE_IMAGE_ENABLE_NV = 1000455030;

    /** Extends {@code VkDynamicState}. */
    public static final int VK_DYNAMIC_STATE_REPRESENTATIVE_FRAGMENT_TEST_ENABLE_NV = 1000455031;

    /** Extends {@code VkDynamicState}. */
    public static final int VK_DYNAMIC_STATE_COVERAGE_REDUCTION_MODE_NV = 1000455032;

    protected EXTExtendedDynamicState3() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdSetTessellationDomainOriginEXT ] ---

    /**
     * Specify the origin of the tessellation domain space dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the origin of the tessellation domain space, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetTessellationDomainOriginEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkTessellationDomainOrigin                  domainOrigin);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the origin of the tessellation domain space for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_TESSELLATION_DOMAIN_ORIGIN_EXT DYNAMIC_STATE_TESSELLATION_DOMAIN_ORIGIN_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineTessellationDomainOriginStateCreateInfo}{@code ::domainOrigin} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3TessellationDomainOrigin">{@code extendedDynamicState3TessellationDomainOrigin}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code domainOrigin} <b>must</b> be a valid {@code VkTessellationDomainOrigin} value</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param domainOrigin  specifies the origin of the tessellation domain space.
     */
    public static void vkCmdSetTessellationDomainOriginEXT(VkCommandBuffer commandBuffer, @NativeType("VkTessellationDomainOrigin") int domainOrigin) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetTessellationDomainOriginEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), domainOrigin, __functionAddress);
    }

    // --- [ vkCmdSetDepthClampEnableEXT ] ---

    /**
     * Specify dynamically whether depth clamping is enabled in the command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> enable or disable depth clamping, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetDepthClampEnableEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBool32                                    depthClampEnable);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets whether depth clamping is enabled or disabled for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_DEPTH_CLAMP_ENABLE_EXT DYNAMIC_STATE_DEPTH_CLAMP_ENABLE_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineRasterizationStateCreateInfo}{@code ::depthClampEnable} value used to create the currently active pipeline.</p>
     * 
     * <p>If the depth clamping state is changed dynamically, and the pipeline was not created with {@link #VK_DYNAMIC_STATE_DEPTH_CLIP_ENABLE_EXT DYNAMIC_STATE_DEPTH_CLIP_ENABLE_EXT} enabled, then depth clipping is enabled when depth clamping is disabled and vice versa.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3DepthClampEnable">{@code extendedDynamicState3DepthClampEnable}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-depthClamp">{@code depthClamp}</a> feature is not enabled, {@code depthClampEnable} must be {@link VK10#VK_FALSE FALSE}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer    the command buffer into which the command will be recorded.
     * @param depthClampEnable specifies whether depth clamping is enabled.
     */
    public static void vkCmdSetDepthClampEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean depthClampEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthClampEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), depthClampEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetPolygonModeEXT ] ---

    /**
     * Specify polygon mode dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the polygon mode, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetPolygonModeEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkPolygonMode                               polygonMode);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the polygon mode for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_POLYGON_MODE_EXT DYNAMIC_STATE_POLYGON_MODE_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineRasterizationStateCreateInfo}{@code ::polygonMode} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3PolygonMode">{@code extendedDynamicState3PolygonMode}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-fillModeNonSolid">{@code fillModeNonSolid}</a> feature is not enabled, {@code polygonMode} <b>must</b> be {@link VK10#VK_POLYGON_MODE_FILL POLYGON_MODE_FILL} or {@link NVFillRectangle#VK_POLYGON_MODE_FILL_RECTANGLE_NV POLYGON_MODE_FILL_RECTANGLE_NV}</li>
     * <li>If the {@link NVFillRectangle VK_NV_fill_rectangle} extension is not enabled, {@code polygonMode} <b>must</b> not be {@link NVFillRectangle#VK_POLYGON_MODE_FILL_RECTANGLE_NV POLYGON_MODE_FILL_RECTANGLE_NV}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code polygonMode} <b>must</b> be a valid {@code VkPolygonMode} value</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param polygonMode   specifies polygon mode.
     */
    public static void vkCmdSetPolygonModeEXT(VkCommandBuffer commandBuffer, @NativeType("VkPolygonMode") int polygonMode) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetPolygonModeEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), polygonMode, __functionAddress);
    }

    // --- [ vkCmdSetRasterizationSamplesEXT ] ---

    /**
     * Specify the rasterization samples dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the {@code rasterizationSamples}, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetRasterizationSamplesEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkSampleCountFlagBits                       rasterizationSamples);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the {@code rasterizationSamples} for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineMultisampleStateCreateInfo}{@code ::rasterizationSamples} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3RasterizationSamples">{@code extendedDynamicState3RasterizationSamples}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code rasterizationSamples} <b>must</b> be a valid {@code VkSampleCountFlagBits} value</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer        the command buffer into which the command will be recorded.
     * @param rasterizationSamples specifies {@code rasterizationSamples}.
     */
    public static void vkCmdSetRasterizationSamplesEXT(VkCommandBuffer commandBuffer, @NativeType("VkSampleCountFlagBits") int rasterizationSamples) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetRasterizationSamplesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), rasterizationSamples, __functionAddress);
    }

    // --- [ vkCmdSetSampleMaskEXT ] ---

    /** Unsafe version of: {@link #vkCmdSetSampleMaskEXT CmdSetSampleMaskEXT} */
    public static void nvkCmdSetSampleMaskEXT(VkCommandBuffer commandBuffer, int samples, long pSampleMask) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetSampleMaskEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), samples, pSampleMask, __functionAddress);
    }

    /**
     * Specify the sample mask dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the sample mask, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetSampleMaskEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkSampleCountFlagBits                       samples,
     *     const VkSampleMask*                         pSampleMask);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the sample mask for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_SAMPLE_MASK_EXT DYNAMIC_STATE_SAMPLE_MASK_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineMultisampleStateCreateInfo}{@code ::pSampleMask} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3SampleMask">{@code extendedDynamicState3SampleMask}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code samples} <b>must</b> be a valid {@code VkSampleCountFlagBits} value</li>
     * <li>{@code pSampleMask} <b>must</b> be a valid pointer to an array of \lceil{\mathit{samples} \over 32}\rceil {@code VkSampleMask} values</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param samples       specifies the number of sample bits in the {@code pSampleMask}.
     * @param pSampleMask   a pointer to an array of {@code VkSampleMask} values, where the array size is based on the {@code samples} parameter.
     */
    public static void vkCmdSetSampleMaskEXT(VkCommandBuffer commandBuffer, @NativeType("VkSampleCountFlagBits") int samples, @NativeType("VkSampleMask const *") IntBuffer pSampleMask) {
        nvkCmdSetSampleMaskEXT(commandBuffer, samples, memAddress(pSampleMask));
    }

    // --- [ vkCmdSetAlphaToCoverageEnableEXT ] ---

    /**
     * Specify the alpha to coverage enable state dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the {@code alphaToCoverageEnable} state, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetAlphaToCoverageEnableEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBool32                                    alphaToCoverageEnable);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the {@code alphaToCoverageEnable} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_ALPHA_TO_COVERAGE_ENABLE_EXT DYNAMIC_STATE_ALPHA_TO_COVERAGE_ENABLE_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineMultisampleStateCreateInfo}{@code ::alphaToCoverageEnable} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3AlphaToCoverageEnable">{@code extendedDynamicState3AlphaToCoverageEnable}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer         the command buffer into which the command will be recorded.
     * @param alphaToCoverageEnable specifies the {@code alphaToCoverageEnable} state.
     */
    public static void vkCmdSetAlphaToCoverageEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean alphaToCoverageEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetAlphaToCoverageEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), alphaToCoverageEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetAlphaToOneEnableEXT ] ---

    /**
     * Specify the alpha to one enable state dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the {@code alphaToOneEnable} state, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetAlphaToOneEnableEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBool32                                    alphaToOneEnable);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the {@code alphaToOneEnable} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_ALPHA_TO_ONE_ENABLE_EXT DYNAMIC_STATE_ALPHA_TO_ONE_ENABLE_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineMultisampleStateCreateInfo}{@code ::alphaToOneEnable} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3AlphaToOneEnable">{@code extendedDynamicState3AlphaToOneEnable}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-alphaToOne">{@code alphaToOne}</a> feature is not enabled, {@code alphaToOneEnable} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer    the command buffer into which the command will be recorded.
     * @param alphaToOneEnable specifies the {@code alphaToOneEnable} state.
     */
    public static void vkCmdSetAlphaToOneEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean alphaToOneEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetAlphaToOneEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), alphaToOneEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetLogicOpEnableEXT ] ---

    /**
     * Specify dynamically whether logical operations are enabled for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> whether logical operations are enabled, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetLogicOpEnableEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBool32                                    logicOpEnable);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets whether logical operations are enabled for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_LOGIC_OP_ENABLE_EXT DYNAMIC_STATE_LOGIC_OP_ENABLE_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineColorBlendStateCreateInfo}{@code ::logicOpEnable} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3LogicOpEnable">{@code extendedDynamicState3LogicOpEnable}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-logicOp">{@code logicOp}</a> feature is not enabled, {@code logicOpEnable} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param logicOpEnable specifies whether logical operations are enabled.
     */
    public static void vkCmdSetLogicOpEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean logicOpEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetLogicOpEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), logicOpEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetColorBlendEnableEXT ] ---

    /**
     * Unsafe version of: {@link #vkCmdSetColorBlendEnableEXT CmdSetColorBlendEnableEXT}
     *
     * @param attachmentCount the number of color blending enables in the {@code pColorBlendEnables} array.
     */
    public static void nvkCmdSetColorBlendEnableEXT(VkCommandBuffer commandBuffer, int firstAttachment, int attachmentCount, long pColorBlendEnables) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetColorBlendEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), firstAttachment, attachmentCount, pColorBlendEnables, __functionAddress);
    }

    /**
     * Specify the {@code blendEnable} for each attachment dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> {@code blendEnable}, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetColorBlendEnableEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    firstAttachment,
     *     uint32_t                                    attachmentCount,
     *     const VkBool32*                             pColorBlendEnables);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the color blending enable of the specified color attachments for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineColorBlendAttachmentState}{@code ::blendEnable} values used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3ColorBlendEnable">{@code extendedDynamicState3ColorBlendEnable}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pColorBlendEnables} <b>must</b> be a valid pointer to an array of {@code attachmentCount} {@code VkBool32} values</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
     * <li>{@code attachmentCount} <b>must</b> be greater than 0</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer      the command buffer into which the command will be recorded.
     * @param firstAttachment    the first color attachment the color blending enable applies.
     * @param pColorBlendEnables an array of booleans to indicate whether color blending is enabled for the corresponding attachment.
     */
    public static void vkCmdSetColorBlendEnableEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstAttachment, @NativeType("VkBool32 const *") IntBuffer pColorBlendEnables) {
        nvkCmdSetColorBlendEnableEXT(commandBuffer, firstAttachment, pColorBlendEnables.remaining(), memAddress(pColorBlendEnables));
    }

    // --- [ vkCmdSetColorBlendEquationEXT ] ---

    /**
     * Unsafe version of: {@link #vkCmdSetColorBlendEquationEXT CmdSetColorBlendEquationEXT}
     *
     * @param attachmentCount the number of {@link VkColorBlendEquationEXT} elements in the {@code pColorBlendEquations} array.
     */
    public static void nvkCmdSetColorBlendEquationEXT(VkCommandBuffer commandBuffer, int firstAttachment, int attachmentCount, long pColorBlendEquations) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetColorBlendEquationEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), firstAttachment, attachmentCount, pColorBlendEquations, __functionAddress);
    }

    /**
     * Specify the blend factors and operations dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> color blend factors and operations, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetColorBlendEquationEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    firstAttachment,
     *     uint32_t                                    attachmentCount,
     *     const VkColorBlendEquationEXT*              pColorBlendEquations);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the color blending factors and operations of the specified attachments for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_COLOR_BLEND_EQUATION_EXT DYNAMIC_STATE_COLOR_BLEND_EQUATION_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineColorBlendAttachmentState}{@code ::srcColorBlendFactor}, {@link VkPipelineColorBlendAttachmentState}{@code ::dstColorBlendFactor}, {@link VkPipelineColorBlendAttachmentState}{@code ::colorBlendOp}, {@link VkPipelineColorBlendAttachmentState}{@code ::srcAlphaBlendFactor}, {@link VkPipelineColorBlendAttachmentState}{@code ::dstAlphaBlendFactor}, and {@link VkPipelineColorBlendAttachmentState}{@code ::alphaBlendOp} values used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3ColorBlendEquation">{@code extendedDynamicState3ColorBlendEquation}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pColorBlendEquations} <b>must</b> be a valid pointer to an array of {@code attachmentCount} valid {@link VkColorBlendEquationEXT} structures</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
     * <li>{@code attachmentCount} <b>must</b> be greater than 0</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkColorBlendEquationEXT}</p>
     *
     * @param commandBuffer        the command buffer into which the command will be recorded.
     * @param firstAttachment      the first color attachment the color blend factors and operations apply to.
     * @param pColorBlendEquations an array of {@link VkColorBlendEquationEXT} structs that specify the color blend factors and operations for the corresponding attachments.
     */
    public static void vkCmdSetColorBlendEquationEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstAttachment, @NativeType("VkColorBlendEquationEXT const *") VkColorBlendEquationEXT.Buffer pColorBlendEquations) {
        nvkCmdSetColorBlendEquationEXT(commandBuffer, firstAttachment, pColorBlendEquations.remaining(), pColorBlendEquations.address());
    }

    // --- [ vkCmdSetColorWriteMaskEXT ] ---

    /**
     * Unsafe version of: {@link #vkCmdSetColorWriteMaskEXT CmdSetColorWriteMaskEXT}
     *
     * @param attachmentCount the number of {@code VkColorComponentFlags} values in the {@code pColorWriteMasks} array.
     */
    public static void nvkCmdSetColorWriteMaskEXT(VkCommandBuffer commandBuffer, int firstAttachment, int attachmentCount, long pColorWriteMasks) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetColorWriteMaskEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), firstAttachment, attachmentCount, pColorWriteMasks, __functionAddress);
    }

    /**
     * Specify the color write masks for each attachment dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the color write masks, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetColorWriteMaskEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    firstAttachment,
     *     uint32_t                                    attachmentCount,
     *     const VkColorComponentFlags*                pColorWriteMasks);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the color write masks of the specified attachments for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_COLOR_WRITE_MASK_EXT DYNAMIC_STATE_COLOR_WRITE_MASK_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineColorBlendAttachmentState}{@code ::colorWriteMask} values used to create the currently active pipeline.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Formats with bits that are shared between components specified by {@code VkColorComponentFlagBits}, such as {@link VK10#VK_FORMAT_E5B9G9R9_UFLOAT_PACK32 FORMAT_E5B9G9R9_UFLOAT_PACK32}, cannot have their channels individually masked by this functionality; either all components that share bits have to be enabled, or none of them.</p>
     * </div>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3ColorWriteMask">{@code extendedDynamicState3ColorWriteMask}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pColorWriteMasks} <b>must</b> be a valid pointer to an array of {@code attachmentCount} valid combinations of {@code VkColorComponentFlagBits} values</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
     * <li>{@code attachmentCount} <b>must</b> be greater than 0</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer    the command buffer into which the command will be recorded.
     * @param firstAttachment  the first color attachment the color write masks apply to.
     * @param pColorWriteMasks an array of {@code VkColorComponentFlags} values that specify the color write masks of the corresponding attachments.
     */
    public static void vkCmdSetColorWriteMaskEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstAttachment, @NativeType("VkColorComponentFlags const *") IntBuffer pColorWriteMasks) {
        nvkCmdSetColorWriteMaskEXT(commandBuffer, firstAttachment, pColorWriteMasks.remaining(), memAddress(pColorWriteMasks));
    }

    // --- [ vkCmdSetRasterizationStreamEXT ] ---

    /**
     * Specify the rasterization stream dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the {@code rasterizationStream} state, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetRasterizationStreamEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    rasterizationStream);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the {@code rasterizationStream} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_RASTERIZATION_STREAM_EXT DYNAMIC_STATE_RASTERIZATION_STREAM_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineRasterizationStateStreamCreateInfoEXT}{@code ::rasterizationStream} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3RasterizationStream">{@code extendedDynamicState3RasterizationStream}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-transformFeedback">{@code transformFeedback}</a> feature <b>must</b> be enabled</li>
     * <li>{@code rasterizationStream} <b>must</b> be less than {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT}{@code ::maxTransformFeedbackStreams}</li>
     * <li>{@code rasterizationStream} <b>must</b> be zero if {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT}{@code ::transformFeedbackRasterizationStreamSelect} is {@link VK10#VK_FALSE FALSE}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer       the command buffer into which the command will be recorded.
     * @param rasterizationStream specifies the {@code rasterizationStream} state.
     */
    public static void vkCmdSetRasterizationStreamEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int rasterizationStream) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetRasterizationStreamEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), rasterizationStream, __functionAddress);
    }

    // --- [ vkCmdSetConservativeRasterizationModeEXT ] ---

    /**
     * Specify the conservative rasterization mode dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the {@code conservativeRasterizationMode}, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetConservativeRasterizationModeEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkConservativeRasterizationModeEXT          conservativeRasterizationMode);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the {@code conservativeRasterizationMode} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_CONSERVATIVE_RASTERIZATION_MODE_EXT DYNAMIC_STATE_CONSERVATIVE_RASTERIZATION_MODE_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineRasterizationConservativeStateCreateInfoEXT}{@code ::conservativeRasterizationMode} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3ConservativeRasterizationMode">{@code extendedDynamicState3ConservativeRasterizationMode}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code conservativeRasterizationMode} <b>must</b> be a valid {@code VkConservativeRasterizationModeEXT} value</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer                 the command buffer into which the command will be recorded.
     * @param conservativeRasterizationMode specifies the {@code conservativeRasterizationMode} state.
     */
    public static void vkCmdSetConservativeRasterizationModeEXT(VkCommandBuffer commandBuffer, @NativeType("VkConservativeRasterizationModeEXT") int conservativeRasterizationMode) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetConservativeRasterizationModeEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), conservativeRasterizationMode, __functionAddress);
    }

    // --- [ vkCmdSetExtraPrimitiveOverestimationSizeEXT ] ---

    /**
     * Specify the conservative rasterization extra primitive overestimation size dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the {@code extraPrimitiveOverestimationSize}, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetExtraPrimitiveOverestimationSizeEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     float                                       extraPrimitiveOverestimationSize);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the {@code extraPrimitiveOverestimationSize} for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_EXT DYNAMIC_STATE_EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineRasterizationConservativeStateCreateInfoEXT}{@code ::extraPrimitiveOverestimationSize} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3ExtraPrimitiveOverestimationSize">{@code extendedDynamicState3ExtraPrimitiveOverestimationSize}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * <li>{@code extraPrimitiveOverestimationSize} <b>must</b> be in the range of {@code 0.0} to {@link VkPhysicalDeviceConservativeRasterizationPropertiesEXT}{@code ::maxExtraPrimitiveOverestimationSize} inclusive</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer                    the command buffer into which the command will be recorded.
     * @param extraPrimitiveOverestimationSize specifies the {@code extraPrimitiveOverestimationSize}.
     */
    public static void vkCmdSetExtraPrimitiveOverestimationSizeEXT(VkCommandBuffer commandBuffer, float extraPrimitiveOverestimationSize) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetExtraPrimitiveOverestimationSizeEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), extraPrimitiveOverestimationSize, __functionAddress);
    }

    // --- [ vkCmdSetDepthClipEnableEXT ] ---

    /**
     * Specify dynamically whether depth clipping is enabled in the command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> enable or disable depth clipping, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetDepthClipEnableEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBool32                                    depthClipEnable);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets whether depth clipping is enabled or disabled for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_DEPTH_CLIP_ENABLE_EXT DYNAMIC_STATE_DEPTH_CLIP_ENABLE_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineRasterizationDepthClipStateCreateInfoEXT}{@code ::depthClipEnable} value used to create the currently active pipeline, or is set to the inverse of {@link VkPipelineRasterizationStateCreateInfo}{@code ::depthClampEnable} if {@link VkPipelineRasterizationDepthClipStateCreateInfoEXT} is not specified.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3DepthClipEnable">{@code extendedDynamicState3DepthClipEnable}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-depthClipEnable">{@code depthClipEnable}</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer   the command buffer into which the command will be recorded.
     * @param depthClipEnable specifies whether depth clipping is enabled.
     */
    public static void vkCmdSetDepthClipEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean depthClipEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthClipEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), depthClipEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetSampleLocationsEnableEXT ] ---

    /**
     * Specify the samples locations enable state dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the {@code sampleLocationsEnable} state, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetSampleLocationsEnableEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBool32                                    sampleLocationsEnable);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the {@code sampleLocationsEnable} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineSampleLocationsStateCreateInfoEXT}{@code ::sampleLocationsEnable} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3SampleLocationsEnable">{@code extendedDynamicState3SampleLocationsEnable}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer         the command buffer into which the command will be recorded.
     * @param sampleLocationsEnable specifies the {@code sampleLocationsEnable} state.
     */
    public static void vkCmdSetSampleLocationsEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean sampleLocationsEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetSampleLocationsEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), sampleLocationsEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetColorBlendAdvancedEXT ] ---

    /**
     * Unsafe version of: {@link #vkCmdSetColorBlendAdvancedEXT CmdSetColorBlendAdvancedEXT}
     *
     * @param attachmentCount the number of {@link VkColorBlendAdvancedEXT} elements in the {@code pColorBlendAdvanced} array.
     */
    public static void nvkCmdSetColorBlendAdvancedEXT(VkCommandBuffer commandBuffer, int firstAttachment, int attachmentCount, long pColorBlendAdvanced) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetColorBlendAdvancedEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), firstAttachment, attachmentCount, pColorBlendAdvanced, __functionAddress);
    }

    /**
     * Specify the advanced color blend state dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the advanced blend state, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetColorBlendAdvancedEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    firstAttachment,
     *     uint32_t                                    attachmentCount,
     *     const VkColorBlendAdvancedEXT*              pColorBlendAdvanced);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the advanced blend operation parameters of the specified attachments for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_COLOR_BLEND_ADVANCED_EXT DYNAMIC_STATE_COLOR_BLEND_ADVANCED_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT}{@code ::srcPremultiplied}, {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT}{@code ::dstPremultiplied}, and {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT}{@code ::blendOverlap} values used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3ColorBlendAdvanced">{@code extendedDynamicState3ColorBlendAdvanced}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pColorBlendAdvanced} <b>must</b> be a valid pointer to an array of {@code attachmentCount} valid {@link VkColorBlendAdvancedEXT} structures</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
     * <li>{@code attachmentCount} <b>must</b> be greater than 0</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkColorBlendAdvancedEXT}</p>
     *
     * @param commandBuffer       the command buffer into which the command will be recorded.
     * @param firstAttachment     the first color attachment the advanced blend parameters apply to.
     * @param pColorBlendAdvanced an array of {@link VkColorBlendAdvancedEXT} structs that specify the advanced color blend parameters for the corresponding attachments.
     */
    public static void vkCmdSetColorBlendAdvancedEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstAttachment, @NativeType("VkColorBlendAdvancedEXT const *") VkColorBlendAdvancedEXT.Buffer pColorBlendAdvanced) {
        nvkCmdSetColorBlendAdvancedEXT(commandBuffer, firstAttachment, pColorBlendAdvanced.remaining(), pColorBlendAdvanced.address());
    }

    // --- [ vkCmdSetProvokingVertexModeEXT ] ---

    /**
     * Specify the provoking vertex mode dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the {@code provokingVertexMode} state, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetProvokingVertexModeEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkProvokingVertexModeEXT                    provokingVertexMode);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the {@code provokingVertexMode} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_PROVOKING_VERTEX_MODE_EXT DYNAMIC_STATE_PROVOKING_VERTEX_MODE_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineRasterizationProvokingVertexStateCreateInfoEXT}{@code ::provokingVertexMode} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3ProvokingVertexMode">{@code extendedDynamicState3ProvokingVertexMode}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * <li>If {@code provokingVertexMode} is {@link EXTProvokingVertex#VK_PROVOKING_VERTEX_MODE_LAST_VERTEX_EXT PROVOKING_VERTEX_MODE_LAST_VERTEX_EXT}, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-provokingVertexLast">{@code provokingVertexLast}</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code provokingVertexMode} <b>must</b> be a valid {@code VkProvokingVertexModeEXT} value</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer       the command buffer into which the command will be recorded.
     * @param provokingVertexMode specifies the {@code provokingVertexMode} state.
     */
    public static void vkCmdSetProvokingVertexModeEXT(VkCommandBuffer commandBuffer, @NativeType("VkProvokingVertexModeEXT") int provokingVertexMode) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetProvokingVertexModeEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), provokingVertexMode, __functionAddress);
    }

    // --- [ vkCmdSetLineRasterizationModeEXT ] ---

    /**
     * Specify the line rasterization mode dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the {@code lineRasterizationMode} state, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetLineRasterizationModeEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkLineRasterizationModeEXT                  lineRasterizationMode);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the {@code lineRasterizationMode} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineRasterizationLineStateCreateInfoEXT}{@code ::lineRasterizationMode} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3LineRasterizationMode">{@code extendedDynamicState3LineRasterizationMode}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * <li>If {@code lineRasterizationMode} is {@link EXTLineRasterization#VK_LINE_RASTERIZATION_MODE_RECTANGULAR_EXT LINE_RASTERIZATION_MODE_RECTANGULAR_EXT}, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-rectangularLines">{@code rectangularLines}</a> feature <b>must</b> be enabled</li>
     * <li>If {@code lineRasterizationMode} is {@link EXTLineRasterization#VK_LINE_RASTERIZATION_MODE_BRESENHAM_EXT LINE_RASTERIZATION_MODE_BRESENHAM_EXT}, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-bresenhamLines">{@code bresenhamLines}</a> feature <b>must</b> be enabled</li>
     * <li>If {@code lineRasterizationMode} is {@link EXTLineRasterization#VK_LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_EXT LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_EXT}, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-smoothLines">{@code smoothLines}</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code lineRasterizationMode} <b>must</b> be a valid {@code VkLineRasterizationModeEXT} value</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer         the command buffer into which the command will be recorded.
     * @param lineRasterizationMode specifies the {@code lineRasterizationMode} state.
     */
    public static void vkCmdSetLineRasterizationModeEXT(VkCommandBuffer commandBuffer, @NativeType("VkLineRasterizationModeEXT") int lineRasterizationMode) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetLineRasterizationModeEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), lineRasterizationMode, __functionAddress);
    }

    // --- [ vkCmdSetLineStippleEnableEXT ] ---

    /**
     * Specify the line stipple enable dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the {@code stippledLineEnable} state, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetLineStippleEnableEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBool32                                    stippledLineEnable);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the {@code stippledLineEnable} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineRasterizationLineStateCreateInfoEXT}{@code ::stippledLineEnable} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3LineStippleEnable">{@code extendedDynamicState3LineStippleEnable}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer      the command buffer into which the command will be recorded.
     * @param stippledLineEnable specifies the {@code stippledLineEnable} state.
     */
    public static void vkCmdSetLineStippleEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean stippledLineEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetLineStippleEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), stippledLineEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetDepthClipNegativeOneToOneEXT ] ---

    /**
     * Specify the negative one to one depth clip mode dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> {@code negativeOneToOne}, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetDepthClipNegativeOneToOneEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBool32                                    negativeOneToOne);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the {@code negativeOneToOne} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_DEPTH_CLIP_NEGATIVE_ONE_TO_ONE_EXT DYNAMIC_STATE_DEPTH_CLIP_NEGATIVE_ONE_TO_ONE_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineViewportDepthClipControlCreateInfoEXT}{@code ::negativeOneToOne} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3DepthClipNegativeOneToOne">{@code extendedDynamicState3DepthClipNegativeOneToOne}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-depthClipControl">{@code depthClipControl}</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer    the command buffer into which the command will be recorded.
     * @param negativeOneToOne specifies the {@code negativeOneToOne} state.
     */
    public static void vkCmdSetDepthClipNegativeOneToOneEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean negativeOneToOne) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthClipNegativeOneToOneEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), negativeOneToOne ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetViewportWScalingEnableNV ] ---

    /**
     * Specify the viewport W scaling enable state dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the {@code viewportWScalingEnable} state, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetViewportWScalingEnableNV(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBool32                                    viewportWScalingEnable);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the {@code viewportWScalingEnable} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_VIEWPORT_W_SCALING_ENABLE_NV DYNAMIC_STATE_VIEWPORT_W_SCALING_ENABLE_NV} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineViewportWScalingStateCreateInfoNV}{@code ::viewportWScalingEnable} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3ViewportWScalingEnable">{@code extendedDynamicState3ViewportWScalingEnable}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer          the command buffer into which the command will be recorded.
     * @param viewportWScalingEnable specifies the {@code viewportWScalingEnable} state.
     */
    public static void vkCmdSetViewportWScalingEnableNV(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean viewportWScalingEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetViewportWScalingEnableNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), viewportWScalingEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetViewportSwizzleNV ] ---

    /**
     * Unsafe version of: {@link #vkCmdSetViewportSwizzleNV CmdSetViewportSwizzleNV}
     *
     * @param viewportCount the number of viewports whose parameters are updated by the command.
     */
    public static void nvkCmdSetViewportSwizzleNV(VkCommandBuffer commandBuffer, int firstViewport, int viewportCount, long pViewportSwizzles) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetViewportSwizzleNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), firstViewport, viewportCount, pViewportSwizzles, __functionAddress);
    }

    /**
     * Specify the viewport swizzle state dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the viewport swizzle state, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetViewportSwizzleNV(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    firstViewport,
     *     uint32_t                                    viewportCount,
     *     const VkViewportSwizzleNV*                  pViewportSwizzles);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the viewport swizzle state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_VIEWPORT_SWIZZLE_NV DYNAMIC_STATE_VIEWPORT_SWIZZLE_NV} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineViewportSwizzleStateCreateInfoNV}{@code ::viewportCount}, and {@link VkPipelineViewportSwizzleStateCreateInfoNV}{@code ::pViewportSwizzles} values used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3ViewportSwizzle">{@code extendedDynamicState3ViewportSwizzle}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pViewportSwizzles} <b>must</b> be a valid pointer to an array of {@code viewportCount} valid {@link VkViewportSwizzleNV} structures</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkViewportSwizzleNV}</p>
     *
     * @param commandBuffer     the command buffer into which the command will be recorded.
     * @param firstViewport     the index of the first viewport whose parameters are updated by the command.
     * @param pViewportSwizzles a pointer to an array of {@link VkViewportSwizzleNV} structures specifying viewport swizzles.
     */
    public static void vkCmdSetViewportSwizzleNV(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstViewport, @NativeType("VkViewportSwizzleNV const *") VkViewportSwizzleNV.Buffer pViewportSwizzles) {
        nvkCmdSetViewportSwizzleNV(commandBuffer, firstViewport, pViewportSwizzles.remaining(), pViewportSwizzles.address());
    }

    // --- [ vkCmdSetCoverageToColorEnableNV ] ---

    /**
     * Specify the coverage to color enable state dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the {@code coverageToColorEnable} state, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetCoverageToColorEnableNV(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBool32                                    coverageToColorEnable);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the {@code coverageToColorEnable} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_COVERAGE_TO_COLOR_ENABLE_NV DYNAMIC_STATE_COVERAGE_TO_COLOR_ENABLE_NV} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineCoverageToColorStateCreateInfoNV}{@code ::coverageToColorEnable} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3CoverageToColorEnable">{@code extendedDynamicState3CoverageToColorEnable}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer         the command buffer into which the command will be recorded.
     * @param coverageToColorEnable specifies the {@code coverageToColorEnable} state.
     */
    public static void vkCmdSetCoverageToColorEnableNV(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean coverageToColorEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetCoverageToColorEnableNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), coverageToColorEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetCoverageToColorLocationNV ] ---

    /**
     * Specify the coverage to color location dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the {@code coverageToColorLocation} state, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetCoverageToColorLocationNV(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    coverageToColorLocation);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the {@code coverageToColorLocation} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_COVERAGE_TO_COLOR_LOCATION_NV DYNAMIC_STATE_COVERAGE_TO_COLOR_LOCATION_NV} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineCoverageToColorStateCreateInfoNV}{@code ::coverageToColorLocation} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3CoverageToColorLocation">{@code extendedDynamicState3CoverageToColorLocation}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer           the command buffer into which the command will be recorded.
     * @param coverageToColorLocation specifies the {@code coverageToColorLocation} state.
     */
    public static void vkCmdSetCoverageToColorLocationNV(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int coverageToColorLocation) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetCoverageToColorLocationNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), coverageToColorLocation, __functionAddress);
    }

    // --- [ vkCmdSetCoverageModulationModeNV ] ---

    /**
     * Specify the coverage modulation mode dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the {@code coverageModulationMode} state, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetCoverageModulationModeNV(
     *     VkCommandBuffer                             commandBuffer,
     *     VkCoverageModulationModeNV                  coverageModulationMode);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the {@code coverageModulationMode} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_COVERAGE_MODULATION_MODE_NV DYNAMIC_STATE_COVERAGE_MODULATION_MODE_NV} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineCoverageModulationStateCreateInfoNV}{@code ::coverageModulationMode} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3CoverageModulationMode">{@code extendedDynamicState3CoverageModulationMode}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code coverageModulationMode} <b>must</b> be a valid {@code VkCoverageModulationModeNV} value</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer          the command buffer into which the command will be recorded.
     * @param coverageModulationMode specifies the {@code coverageModulationMode} state.
     */
    public static void vkCmdSetCoverageModulationModeNV(VkCommandBuffer commandBuffer, @NativeType("VkCoverageModulationModeNV") int coverageModulationMode) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetCoverageModulationModeNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), coverageModulationMode, __functionAddress);
    }

    // --- [ vkCmdSetCoverageModulationTableEnableNV ] ---

    /**
     * Specify the coverage modulation table enable state dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the {@code coverageModulationTableEnable} state, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetCoverageModulationTableEnableNV(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBool32                                    coverageModulationTableEnable);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the {@code coverageModulationTableEnable} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_ENABLE_NV DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_ENABLE_NV} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineCoverageModulationStateCreateInfoNV}{@code ::coverageModulationTableEnable} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3CoverageModulationTableEnable">{@code extendedDynamicState3CoverageModulationTableEnable}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer                 the command buffer into which the command will be recorded.
     * @param coverageModulationTableEnable specifies the {@code coverageModulationTableEnable} state.
     */
    public static void vkCmdSetCoverageModulationTableEnableNV(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean coverageModulationTableEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetCoverageModulationTableEnableNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), coverageModulationTableEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetCoverageModulationTableNV ] ---

    /**
     * Unsafe version of: {@link #vkCmdSetCoverageModulationTableNV CmdSetCoverageModulationTableNV}
     *
     * @param coverageModulationTableCount specifies the number of elements in {@code pCoverageModulationTable}.
     */
    public static void nvkCmdSetCoverageModulationTableNV(VkCommandBuffer commandBuffer, int coverageModulationTableCount, long pCoverageModulationTable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetCoverageModulationTableNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), coverageModulationTableCount, pCoverageModulationTable, __functionAddress);
    }

    /**
     * Specify the coverage modulation table dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the {@code pCoverageModulationTable} state, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetCoverageModulationTableNV(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    coverageModulationTableCount,
     *     const float*                                pCoverageModulationTable);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the table of modulation factors for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_NV DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_NV} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineCoverageModulationStateCreateInfoNV}{@code ::coverageModulationTableCount}, and {@link VkPipelineCoverageModulationStateCreateInfoNV}{@code ::pCoverageModulationTable} values used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3CoverageModulationTable">{@code extendedDynamicState3CoverageModulationTable}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pCoverageModulationTable} <b>must</b> be a valid pointer to an array of {@code coverageModulationTableCount} {@code float} values</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
     * <li>{@code coverageModulationTableCount} <b>must</b> be greater than 0</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer            the command buffer into which the command will be recorded.
     * @param pCoverageModulationTable specifies the table of modulation factors containing a value for each number of covered samples.
     */
    public static void vkCmdSetCoverageModulationTableNV(VkCommandBuffer commandBuffer, @NativeType("float const *") FloatBuffer pCoverageModulationTable) {
        nvkCmdSetCoverageModulationTableNV(commandBuffer, pCoverageModulationTable.remaining(), memAddress(pCoverageModulationTable));
    }

    // --- [ vkCmdSetShadingRateImageEnableNV ] ---

    /**
     * Specify the shading rate image enable state dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the {@code shadingRateImageEnable} state, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetShadingRateImageEnableNV(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBool32                                    shadingRateImageEnable);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the {@code shadingRateImageEnable} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_SHADING_RATE_IMAGE_ENABLE_NV DYNAMIC_STATE_SHADING_RATE_IMAGE_ENABLE_NV} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineViewportShadingRateImageStateCreateInfoNV}{@code ::shadingRateImageEnable} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3ShadingRateImageEnable">{@code extendedDynamicState3ShadingRateImageEnable}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer          the command buffer into which the command will be recorded.
     * @param shadingRateImageEnable specifies the {@code shadingRateImageEnable} state.
     */
    public static void vkCmdSetShadingRateImageEnableNV(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean shadingRateImageEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetShadingRateImageEnableNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), shadingRateImageEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetRepresentativeFragmentTestEnableNV ] ---

    /**
     * Specify the representative fragment test enable dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the {@code representativeFragmentTestEnable} state, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetRepresentativeFragmentTestEnableNV(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBool32                                    representativeFragmentTestEnable);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the {@code representativeFragmentTestEnable} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_REPRESENTATIVE_FRAGMENT_TEST_ENABLE_NV DYNAMIC_STATE_REPRESENTATIVE_FRAGMENT_TEST_ENABLE_NV} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineRepresentativeFragmentTestStateCreateInfoNV}{@code ::representativeFragmentTestEnable} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3RepresentativeFragmentTestEnable">{@code extendedDynamicState3RepresentativeFragmentTestEnable}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer                    the command buffer into which the command will be recorded.
     * @param representativeFragmentTestEnable specifies the {@code representativeFragmentTestEnable} state.
     */
    public static void vkCmdSetRepresentativeFragmentTestEnableNV(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean representativeFragmentTestEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetRepresentativeFragmentTestEnableNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), representativeFragmentTestEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetCoverageReductionModeNV ] ---

    /**
     * Specify the coverage reduction mode dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the {@code coverageReductionMode} state, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetCoverageReductionModeNV(
     *     VkCommandBuffer                             commandBuffer,
     *     VkCoverageReductionModeNV                   coverageReductionMode);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the {@code coverageReductionMode} state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_COVERAGE_REDUCTION_MODE_NV DYNAMIC_STATE_COVERAGE_REDUCTION_MODE_NV} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineCoverageReductionStateCreateInfoNV}{@code ::coverageReductionMode} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedDynamicState3CoverageReductionMode">{@code extendedDynamicState3CoverageReductionMode}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code coverageReductionMode} <b>must</b> be a valid {@code VkCoverageReductionModeNV} value</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer         the command buffer into which the command will be recorded.
     * @param coverageReductionMode specifies the {@code coverageReductionMode} state.
     */
    public static void vkCmdSetCoverageReductionModeNV(VkCommandBuffer commandBuffer, @NativeType("VkCoverageReductionModeNV") int coverageReductionMode) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetCoverageReductionModeNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), coverageReductionMode, __functionAddress);
    }

    /** Array version of: {@link #vkCmdSetSampleMaskEXT CmdSetSampleMaskEXT} */
    public static void vkCmdSetSampleMaskEXT(VkCommandBuffer commandBuffer, @NativeType("VkSampleCountFlagBits") int samples, @NativeType("VkSampleMask const *") int[] pSampleMask) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetSampleMaskEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), samples, pSampleMask, __functionAddress);
    }

    /** Array version of: {@link #vkCmdSetColorBlendEnableEXT CmdSetColorBlendEnableEXT} */
    public static void vkCmdSetColorBlendEnableEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstAttachment, @NativeType("VkBool32 const *") int[] pColorBlendEnables) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetColorBlendEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), firstAttachment, pColorBlendEnables.length, pColorBlendEnables, __functionAddress);
    }

    /** Array version of: {@link #vkCmdSetColorWriteMaskEXT CmdSetColorWriteMaskEXT} */
    public static void vkCmdSetColorWriteMaskEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstAttachment, @NativeType("VkColorComponentFlags const *") int[] pColorWriteMasks) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetColorWriteMaskEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), firstAttachment, pColorWriteMasks.length, pColorWriteMasks, __functionAddress);
    }

    /** Array version of: {@link #vkCmdSetCoverageModulationTableNV CmdSetCoverageModulationTableNV} */
    public static void vkCmdSetCoverageModulationTableNV(VkCommandBuffer commandBuffer, @NativeType("float const *") float[] pCoverageModulationTable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetCoverageModulationTableNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pCoverageModulationTable.length, pCoverageModulationTable, __functionAddress);
    }

}