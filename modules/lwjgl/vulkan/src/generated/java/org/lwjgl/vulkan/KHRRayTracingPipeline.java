/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Rasterization has been the dominant method to produce interactive graphics, but increasing performance of graphics hardware has made ray tracing a viable option for interactive rendering. Being able to integrate ray tracing with traditional rasterization makes it easier for applications to incrementally add ray traced effects to existing applications or to do hybrid approaches with rasterization for primary visibility and ray tracing for secondary queries.
 * 
 * <p>To enable ray tracing, this extension adds a few different categories of new functionality:</p>
 * 
 * <ul>
 * <li>A new ray tracing pipeline type with new shader domains: ray generation, intersection, any-hit, closest hit, miss, and callable</li>
 * <li>A shader binding indirection table to link shader groups with acceleration structure items</li>
 * <li>Ray tracing commands which initiate the ray pipeline traversal and invocation of the various new shader domains depending on which traversal conditions are met</li>
 * </ul>
 * 
 * <p>This extension adds support for the following SPIR-V extension in Vulkan:</p>
 * 
 * <ul>
 * <li>{@code SPV_KHR_ray_tracing}</li>
 * </ul>
 * 
 * <h5>Sample Code</h5>
 * 
 * <p>Example ray generation GLSL shader</p>
 * 
 * <pre><code>
 * #version 450 core
 * #extension GL_EXT_ray_tracing : require
 * layout(set = 0, binding = 0, rgba8) uniform image2D image;
 * layout(set = 0, binding = 1) uniform accelerationStructureEXT as;
 * layout(location = 0) rayPayloadEXT float payload;
 * 
 * void main()
 * {
 *    vec4 col = vec4(0, 0, 0, 1);
 * 
 *    vec3 origin = vec3(float(gl_LaunchIDEXT.x)/float(gl_LaunchSizeEXT.x), float(gl_LaunchIDEXT.y)/float(gl_LaunchSizeEXT.y), 1.0);
 *    vec3 dir = vec3(0.0, 0.0, -1.0);
 * 
 *    traceRayEXT(as, 0, 0xff, 0, 1, 0, origin, 0.0, dir, 1000.0, 0);
 * 
 *    col.y = payload;
 * 
 *    imageStore(image, ivec2(gl_LaunchIDEXT.xy), col);
 * }</code></pre>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_ray_tracing_pipeline}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>348</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRSpirv14 VK_KHR_spirv_1_4} and {@link KHRAccelerationStructure VK_KHR_acceleration_structure}</dd>
 * <dt><b>API Interactions</b></dt>
 * <dd><ul>
 * <li>Interacts with VK_KHR_ray_query</li>
 * </ul></dd>
 * <dt><b>SPIR-V Dependencies</b></dt>
 * <dd><ul>
 * <li><a href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/KHR/SPV_KHR_ray_tracing.html">SPV_KHR_ray_tracing</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Daniel Koch <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_ray_tracing_pipeline]%20@dgkoch%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_ray_tracing_pipeline%20extension*">dgkoch</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2020-11-12</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension provides API support for <a href="https://github.com/KhronosGroup/GLSL/blob/main/extensions/ext/GLSL_EXT_ray_tracing.txt">{@code GLSL_EXT_ray_tracing}</a></li>
 * <li>This extension interacts with <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#versions-1.2">Vulkan 1.2</a> and {@link KHRVulkanMemoryModel VK_KHR_vulkan_memory_model}, adding the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shader-call-related">shader-call-related</a> relation of invocations, <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shader-call-order">shader-call-order</a> partial order of dynamic instances of instructions, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-scope-shadercall">{@code ShaderCallKHR}</a> scope.</li>
 * <li>This extension interacts with {@link KHRPipelineLibrary VK_KHR_pipeline_library}, enabling pipeline libraries to be used with ray tracing pipelines and enabling usage of {@link VkRayTracingPipelineInterfaceCreateInfoKHR}.</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Matthäus Chajdas, AMD</li>
 * <li>Greg Grebe, AMD</li>
 * <li>Nicolai Hähnle, AMD</li>
 * <li>Tobias Hector, AMD</li>
 * <li>Dave Oldcorn, AMD</li>
 * <li>Skyler Saleh, AMD</li>
 * <li>Mathieu Robart, Arm</li>
 * <li>Marius Bjorge, Arm</li>
 * <li>Tom Olson, Arm</li>
 * <li>Sebastian Tafuri, EA</li>
 * <li>Henrik Rydgard, Embark</li>
 * <li>Juan Cañada, Epic Games</li>
 * <li>Patrick Kelly, Epic Games</li>
 * <li>Yuriy O’Donnell, Epic Games</li>
 * <li>Michael Doggett, Facebook/Oculus</li>
 * <li>Andrew Garrard, Imagination</li>
 * <li>Don Scorgie, Imagination</li>
 * <li>Dae Kim, Imagination</li>
 * <li>Joshua Barczak, Intel</li>
 * <li>Slawek Grajewski, Intel</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Pascal Gautron, NVIDIA</li>
 * <li>Daniel Koch, NVIDIA</li>
 * <li>Christoph Kubisch, NVIDIA</li>
 * <li>Ashwin Lele, NVIDIA</li>
 * <li>Robert Stepinski, NVIDIA</li>
 * <li>Martin Stich, NVIDIA</li>
 * <li>Nuno Subtil, NVIDIA</li>
 * <li>Eric Werness, NVIDIA</li>
 * <li>Jon Leech, Khronos</li>
 * <li>Jeroen van Schijndel, OTOY</li>
 * <li>Juul Joosten, OTOY</li>
 * <li>Alex Bourd, Qualcomm</li>
 * <li>Roman Larionov, Qualcomm</li>
 * <li>David McAllister, Qualcomm</li>
 * <li>Spencer Fricke, Samsung</li>
 * <li>Lewis Gordon, Samsung</li>
 * <li>Ralph Potter, Samsung</li>
 * <li>Jasper Bekkers, Traverse Research</li>
 * <li>Jesse Barker, Unity</li>
 * <li>Baldur Karlsson, Valve</li>
 * </ul></dd>
 * </dl>
 */
public class KHRRayTracingPipeline {

    /** The extension specification version. */
    public static final int VK_KHR_RAY_TRACING_PIPELINE_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_RAY_TRACING_PIPELINE_EXTENSION_NAME = "VK_KHR_ray_tracing_pipeline";

    /** VK_SHADER_UNUSED_KHR */
    public static final int VK_SHADER_UNUSED_KHR = (~0);

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_FEATURES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_PROPERTIES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_KHR STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_KHR STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_INTERFACE_CREATE_INFO_KHR STRUCTURE_TYPE_RAY_TRACING_PIPELINE_INTERFACE_CREATE_INFO_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_FEATURES_KHR   = 1000347000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_PROPERTIES_KHR = 1000347001,
        VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_KHR                = 1000150015,
        VK_STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_KHR            = 1000150016,
        VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_INTERFACE_CREATE_INFO_KHR      = 1000150018;

    /**
     * Extends {@code VkShaderStageFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_SHADER_STAGE_RAYGEN_BIT_KHR SHADER_STAGE_RAYGEN_BIT_KHR}</li>
     * <li>{@link #VK_SHADER_STAGE_ANY_HIT_BIT_KHR SHADER_STAGE_ANY_HIT_BIT_KHR}</li>
     * <li>{@link #VK_SHADER_STAGE_CLOSEST_HIT_BIT_KHR SHADER_STAGE_CLOSEST_HIT_BIT_KHR}</li>
     * <li>{@link #VK_SHADER_STAGE_MISS_BIT_KHR SHADER_STAGE_MISS_BIT_KHR}</li>
     * <li>{@link #VK_SHADER_STAGE_INTERSECTION_BIT_KHR SHADER_STAGE_INTERSECTION_BIT_KHR}</li>
     * <li>{@link #VK_SHADER_STAGE_CALLABLE_BIT_KHR SHADER_STAGE_CALLABLE_BIT_KHR}</li>
     * </ul>
     */
    public static final int
        VK_SHADER_STAGE_RAYGEN_BIT_KHR       = 0x100,
        VK_SHADER_STAGE_ANY_HIT_BIT_KHR      = 0x200,
        VK_SHADER_STAGE_CLOSEST_HIT_BIT_KHR  = 0x400,
        VK_SHADER_STAGE_MISS_BIT_KHR         = 0x800,
        VK_SHADER_STAGE_INTERSECTION_BIT_KHR = 0x1000,
        VK_SHADER_STAGE_CALLABLE_BIT_KHR     = 0x2000;

    /** Extends {@code VkPipelineStageFlagBits}. */
    public static final int VK_PIPELINE_STAGE_RAY_TRACING_SHADER_BIT_KHR = 0x200000;

    /** Extends {@code VkBufferUsageFlagBits}. */
    public static final int VK_BUFFER_USAGE_SHADER_BINDING_TABLE_BIT_KHR = 0x400;

    /** Extends {@code VkPipelineBindPoint}. */
    public static final int VK_PIPELINE_BIND_POINT_RAY_TRACING_KHR = 1000165000;

    /**
     * Extends {@code VkPipelineCreateFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS_BIT_KHR PIPELINE_CREATE_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR PIPELINE_CREATE_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_MISS_SHADERS_BIT_KHR PIPELINE_CREATE_RAY_TRACING_NO_NULL_MISS_SHADERS_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS_BIT_KHR PIPELINE_CREATE_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_CREATE_RAY_TRACING_SKIP_TRIANGLES_BIT_KHR PIPELINE_CREATE_RAY_TRACING_SKIP_TRIANGLES_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_CREATE_RAY_TRACING_SKIP_AABBS_BIT_KHR PIPELINE_CREATE_RAY_TRACING_SKIP_AABBS_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_CREATE_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_BIT_KHR PIPELINE_CREATE_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_BIT_KHR}</li>
     * </ul>
     */
    public static final int
        VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS_BIT_KHR            = 0x4000,
        VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR        = 0x8000,
        VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_MISS_SHADERS_BIT_KHR               = 0x10000,
        VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS_BIT_KHR       = 0x20000,
        VK_PIPELINE_CREATE_RAY_TRACING_SKIP_TRIANGLES_BIT_KHR                     = 0x1000,
        VK_PIPELINE_CREATE_RAY_TRACING_SKIP_AABBS_BIT_KHR                         = 0x2000,
        VK_PIPELINE_CREATE_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_BIT_KHR = 0x80000;

    /** Extends {@code VkDynamicState}. */
    public static final int VK_DYNAMIC_STATE_RAY_TRACING_PIPELINE_STACK_SIZE_KHR = 1000347000;

    /**
     * VkRayTracingShaderGroupTypeKHR - Shader group types
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_RAY_TRACING_SHADER_GROUP_TYPE_GENERAL_KHR RAY_TRACING_SHADER_GROUP_TYPE_GENERAL_KHR} indicates a shader group with a single {@link #VK_SHADER_STAGE_RAYGEN_BIT_KHR SHADER_STAGE_RAYGEN_BIT_KHR}, {@link #VK_SHADER_STAGE_MISS_BIT_KHR SHADER_STAGE_MISS_BIT_KHR}, or {@link #VK_SHADER_STAGE_CALLABLE_BIT_KHR SHADER_STAGE_CALLABLE_BIT_KHR} shader in it.</li>
     * <li>{@link #VK_RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_KHR RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_KHR} specifies a shader group that only hits triangles and <b>must</b> not contain an intersection shader, only closest hit and any-hit shaders.</li>
     * <li>{@link #VK_RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_KHR RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_KHR} specifies a shader group that only intersects with custom geometry and <b>must</b> contain an intersection shader and <b>may</b> contain closest hit and any-hit shaders.</li>
     * </ul>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>For current group types, the hit group type could be inferred from the presence or absence of the intersection shader, but we provide the type explicitly for future hit groups that do not have that property.</p>
     * </div>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkRayTracingShaderGroupCreateInfoKHR}, {@link VkRayTracingShaderGroupCreateInfoNV}</p>
     */
    public static final int
        VK_RAY_TRACING_SHADER_GROUP_TYPE_GENERAL_KHR              = 0,
        VK_RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_KHR  = 1,
        VK_RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_KHR = 2;

    /**
     * VkShaderGroupShaderKHR - Shader group shaders
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_SHADER_GROUP_SHADER_GENERAL_KHR SHADER_GROUP_SHADER_GENERAL_KHR} uses the shader specified in the group with {@link VkRayTracingShaderGroupCreateInfoKHR}{@code ::generalShader}</li>
     * <li>{@link #VK_SHADER_GROUP_SHADER_CLOSEST_HIT_KHR SHADER_GROUP_SHADER_CLOSEST_HIT_KHR} uses the shader specified in the group with {@link VkRayTracingShaderGroupCreateInfoKHR}{@code ::closestHitShader}</li>
     * <li>{@link #VK_SHADER_GROUP_SHADER_ANY_HIT_KHR SHADER_GROUP_SHADER_ANY_HIT_KHR} uses the shader specified in the group with {@link VkRayTracingShaderGroupCreateInfoKHR}{@code ::anyHitShader}</li>
     * <li>{@link #VK_SHADER_GROUP_SHADER_INTERSECTION_KHR SHADER_GROUP_SHADER_INTERSECTION_KHR} uses the shader specified in the group with {@link VkRayTracingShaderGroupCreateInfoKHR}{@code ::intersectionShader}</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #vkGetRayTracingShaderGroupStackSizeKHR GetRayTracingShaderGroupStackSizeKHR}</p>
     */
    public static final int
        VK_SHADER_GROUP_SHADER_GENERAL_KHR      = 0,
        VK_SHADER_GROUP_SHADER_CLOSEST_HIT_KHR  = 1,
        VK_SHADER_GROUP_SHADER_ANY_HIT_KHR      = 2,
        VK_SHADER_GROUP_SHADER_INTERSECTION_KHR = 3;

    protected KHRRayTracingPipeline() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdTraceRaysKHR ] ---

    /** Unsafe version of: {@link #vkCmdTraceRaysKHR CmdTraceRaysKHR} */
    public static void nvkCmdTraceRaysKHR(VkCommandBuffer commandBuffer, long pRaygenShaderBindingTable, long pMissShaderBindingTable, long pHitShaderBindingTable, long pCallableShaderBindingTable, int width, int height, int depth) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdTraceRaysKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPPPV(commandBuffer.address(), pRaygenShaderBindingTable, pMissShaderBindingTable, pHitShaderBindingTable, pCallableShaderBindingTable, width, height, depth, __functionAddress);
    }

    /**
     * Initialize a ray tracing dispatch.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To dispatch ray tracing use:</p>
     * 
     * <pre><code>
     * void vkCmdTraceRaysKHR(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkStridedDeviceAddressRegionKHR*      pRaygenShaderBindingTable,
     *     const VkStridedDeviceAddressRegionKHR*      pMissShaderBindingTable,
     *     const VkStridedDeviceAddressRegionKHR*      pHitShaderBindingTable,
     *     const VkStridedDeviceAddressRegionKHR*      pCallableShaderBindingTable,
     *     uint32_t                                    width,
     *     uint32_t                                    height,
     *     uint32_t                                    depth);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>When the command is executed, a ray generation group of <code>width × height × depth</code> rays is assembled.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If a {@code VkSampler} created with {@code magFilter} or {@code minFilter} equal to {@link VK10#VK_FILTER_LINEAR FILTER_LINEAR}, {@code reductionMode} equal to {@link VK12#VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE}, and {@code compareEnable} equal to {@link VK10#VK_FALSE FALSE} is used to sample a {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT}</li>
     * <li>If a {@code VkSampler} created with {@code magFilter} or {@code minFilter} equal to {@link VK10#VK_FILTER_LINEAR FILTER_LINEAR} and {@code reductionMode} equal to either {@link VK12#VK_SAMPLER_REDUCTION_MODE_MIN SAMPLER_REDUCTION_MODE_MIN} or {@link VK12#VK_SAMPLER_REDUCTION_MODE_MAX SAMPLER_REDUCTION_MODE_MAX} is used to sample a {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK12#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_MINMAX_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_MINMAX_BIT}</li>
     * <li>If a {@code VkSampler} created with {@code mipmapMode} equal to {@link VK10#VK_SAMPLER_MIPMAP_MODE_LINEAR SAMPLER_MIPMAP_MODE_LINEAR}, {@code reductionMode} equal to {@link VK12#VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE}, and {@code compareEnable} equal to {@link VK10#VK_FALSE FALSE} is used to sample a {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT}</li>
     * <li>If a {@code VkSampler} created with {@code mipmapMode} equal to {@link VK10#VK_SAMPLER_MIPMAP_MODE_LINEAR SAMPLER_MIPMAP_MODE_LINEAR} and {@code reductionMode} equal to either {@link VK12#VK_SAMPLER_REDUCTION_MODE_MIN SAMPLER_REDUCTION_MODE_MIN} or {@link VK12#VK_SAMPLER_REDUCTION_MODE_MAX SAMPLER_REDUCTION_MODE_MAX} is used to sample a {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK12#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_MINMAX_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_MINMAX_BIT}</li>
     * <li>If a {@code VkSampler} created with {@code unnormalizedCoordinates} equal to {@link VK10#VK_TRUE TRUE} is used to sample a {@code VkImageView} as a result of this command, then the image view’s {@code levelCount} and {@code layerCount} <b>must</b> be 1</li>
     * <li>If a {@code VkSampler} created with {@code unnormalizedCoordinates} equal to {@link VK10#VK_TRUE TRUE} is used to sample a {@code VkImageView} as a result of this command, then the image view’s {@code viewType} <b>must</b> be {@link VK10#VK_IMAGE_VIEW_TYPE_1D IMAGE_VIEW_TYPE_1D} or {@link VK10#VK_IMAGE_VIEW_TYPE_2D IMAGE_VIEW_TYPE_2D}</li>
     * <li>If a {@code VkImageView} is sampled with <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#textures-depth-compare-operation">depth comparison</a>, the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK13#VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_DEPTH_COMPARISON_BIT FORMAT_FEATURE_2_SAMPLED_IMAGE_DEPTH_COMPARISON_BIT}</li>
     * <li>If a {@code VkImageView} is accessed using atomic operations as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT}</li>
     * <li>If a {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER} descriptor is accessed using atomic operations as a result of this command, then the storage texel buffer’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-buffer-view-format-features">format features</a> <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT}</li>
     * <li>If a {@code VkImageView} is sampled with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link EXTFilterCubic#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT}</li>
     * <li>If the {@link EXTFilterCubic VK_EXT_filter_cubic} extension is not enabled and any {@code VkImageView} is sampled with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT} as a result of this command, it <b>must</b> not have a {@code VkImageViewType} of {@link VK10#VK_IMAGE_VIEW_TYPE_3D IMAGE_VIEW_TYPE_3D}, {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE}, or {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}</li>
     * <li>Any {@code VkImageView} being sampled with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT} as a result of this command <b>must</b> have a {@code VkImageViewType} and format that supports cubic filtering, as specified by {@link VkFilterCubicImageViewImageFormatPropertiesEXT}{@code ::filterCubic} returned by {@link VK11#vkGetPhysicalDeviceImageFormatProperties2 GetPhysicalDeviceImageFormatProperties2}</li>
     * <li>Any {@code VkImageView} being sampled with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT} with a reduction mode of either {@link VK12#VK_SAMPLER_REDUCTION_MODE_MIN SAMPLER_REDUCTION_MODE_MIN} or {@link VK12#VK_SAMPLER_REDUCTION_MODE_MAX SAMPLER_REDUCTION_MODE_MAX} as a result of this command <b>must</b> have a {@code VkImageViewType} and format that supports cubic filtering together with minmax filtering, as specified by {@link VkFilterCubicImageViewImageFormatPropertiesEXT}{@code ::filterCubicMinmax} returned by {@link VK11#vkGetPhysicalDeviceImageFormatProperties2 GetPhysicalDeviceImageFormatProperties2}</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-filter-cubic-range-clamp">{@code cubicRangeClamp}</a> feature is not enabled, then any {@code VkImageView} being sampled with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT} as a result of this command <b>must</b> not have a {@link VkSamplerReductionModeCreateInfo}{@code ::reductionMode} equal to {@link QCOMFilterCubicClamp#VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_RANGECLAMP_QCOM SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_RANGECLAMP_QCOM}</li>
     * <li>Any {@code VkImageView} being sampled with a {@link VkSamplerReductionModeCreateInfo}{@code ::reductionMode} equal to {@link QCOMFilterCubicClamp#VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_RANGECLAMP_QCOM SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_RANGECLAMP_QCOM} as a result of this command <b>must</b> sample with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT}</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-filter-cubic-weight-selection">{@code selectableCubicWeights}</a> feature is not enabled, then any {@code VkImageView} being sampled with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT} as a result of this command <b>must</b> have {@link VkSamplerCubicWeightsCreateInfoQCOM}{@code ::cubicWeights} equal to {@link QCOMFilterCubicWeights#VK_CUBIC_FILTER_WEIGHTS_CATMULL_ROM_QCOM CUBIC_FILTER_WEIGHTS_CATMULL_ROM_QCOM}</li>
     * <li>Any {@code VkImage} created with a {@link VkImageCreateInfo}{@code ::flags} containing {@link NVCornerSampledImage#VK_IMAGE_CREATE_CORNER_SAMPLED_BIT_NV IMAGE_CREATE_CORNER_SAMPLED_BIT_NV} sampled as a result of this command <b>must</b> only be sampled using a {@code VkSamplerAddressMode} of {@link VK10#VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE}</li>
     * <li>For any {@code VkImageView} being written as a storage image where the image format field of the {@code OpTypeImage} is {@code Unknown}, the view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK13#VK_FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT}</li>
     * <li>For any {@code VkImageView} being read as a storage image where the image format field of the {@code OpTypeImage} is {@code Unknown}, the view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK13#VK_FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT}</li>
     * <li>For any {@code VkBufferView} being written as a storage texel buffer where the image format field of the {@code OpTypeImage} is {@code Unknown}, the view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkFormatProperties3">buffer features</a> <b>must</b> contain {@link VK13#VK_FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT}</li>
     * <li>Any {@code VkBufferView} being read as a storage texel buffer where the image format field of the {@code OpTypeImage} is {@code Unknown} then the view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkFormatProperties3">buffer features</a> <b>must</b> contain {@link VK13#VK_FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT}</li>
     * <li>For each set <em>n</em> that is statically used by <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-binding">a bound shader</a>, a descriptor set <b>must</b> have been bound to <em>n</em> at the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for set <em>n</em>, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline} or the {@code VkDescriptorSetLayout} array used to create the current {@code VkShaderEXT} , as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
     * <li>For each push constant that is statically used by <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-binding">a bound shader</a>, a push constant value <b>must</b> have been set for the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for push constants, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline} or the {@code VkDescriptorSetLayout} array used to create the current {@code VkShaderEXT} , as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
     * <li>For each array of resources that is used by <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-binding">a bound shader</a>, the indices used to access members of the array <b>must</b> be less than the descriptor count for the identified binding in the descriptor sets used by this command</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-maintenance4">{@code maintenance4}</a> feature is not enabled, then for each push constant that is statically used by <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-binding">a bound shader</a>, a push constant value <b>must</b> have been set for the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for push constants, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline} or the {@code VkDescriptorSetLayout} and {@link VkPushConstantRange} arrays used to create the current {@code VkShaderEXT} , as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
     * <li>Descriptors in each bound descriptor set, specified via {@link VK10#vkCmdBindDescriptorSets CmdBindDescriptorSets}, <b>must</b> be valid as described by <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#descriptor-validity">descriptor validity</a> if they are statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command and the bound {@code VkPipeline} was not created with {@link EXTDescriptorBuffer#VK_PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT}</li>
     * <li>If the descriptors used by the {@code VkPipeline} bound to the pipeline bind point were specified via {@link VK10#vkCmdBindDescriptorSets CmdBindDescriptorSets}, the bound {@code VkPipeline} <b>must</b> have been created without {@link EXTDescriptorBuffer#VK_PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT}</li>
     * <li>Descriptors in bound descriptor buffers, specified via {@link EXTDescriptorBuffer#vkCmdSetDescriptorBufferOffsetsEXT CmdSetDescriptorBufferOffsetsEXT}, <b>must</b> be valid if they are dynamically used by the {@code VkPipeline} bound to the pipeline bind point used by this command and the bound {@code VkPipeline} was created with {@link EXTDescriptorBuffer#VK_PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT}</li>
     * <li>Descriptors in bound descriptor buffers, specified via {@link EXTDescriptorBuffer#vkCmdSetDescriptorBufferOffsetsEXT CmdSetDescriptorBufferOffsetsEXT}, <b>must</b> be valid if they are dynamically used by any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command</li>
     * <li>If the descriptors used by the {@code VkPipeline} bound to the pipeline bind point were specified via {@link EXTDescriptorBuffer#vkCmdSetDescriptorBufferOffsetsEXT CmdSetDescriptorBufferOffsetsEXT}, the bound {@code VkPipeline} <b>must</b> have been created with {@link EXTDescriptorBuffer#VK_PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT}</li>
     * <li>If a descriptor is dynamically used with a {@code VkPipeline} created with {@link EXTDescriptorBuffer#VK_PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT}, the descriptor memory <b>must</b> be resident</li>
     * <li>If a descriptor is dynamically used with a {@code VkShaderEXT} created with a {@code VkDescriptorSetLayout} that was created with {@link EXTDescriptorBuffer#VK_DESCRIPTOR_SET_LAYOUT_CREATE_DESCRIPTOR_BUFFER_BIT_EXT DESCRIPTOR_SET_LAYOUT_CREATE_DESCRIPTOR_BUFFER_BIT_EXT}, the descriptor memory <b>must</b> be resident</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature is not enabled, a valid pipeline <b>must</b> be bound to the pipeline bind point used by this command</li>
     * <li>If a pipeline is bound to the pipeline bind point used by this command, there <b>must</b> not have been any calls to dynamic state setting commands for any state specified statically in the {@code VkPipeline} object bound to the pipeline bind point used by this command, since that pipeline was bound</li>
     * <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command or any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used to sample from any {@code VkImage} with a {@code VkImageView} of the type {@link VK10#VK_IMAGE_VIEW_TYPE_3D IMAGE_VIEW_TYPE_3D}, {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE}, {@link VK10#VK_IMAGE_VIEW_TYPE_1D_ARRAY IMAGE_VIEW_TYPE_1D_ARRAY}, {@link VK10#VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY} or {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}, in any shader stage</li>
     * <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command or any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with {@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage</li>
     * <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command or any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that includes a LOD bias or any offset values, in any shader stage</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> is enabled, either a valid pipeline <b>must</b> be bound to the pipeline bind point used by this command, or a valid combination of valid and {@link VK10#VK_NULL_HANDLE NULL_HANDLE} shader objects <b>must</b> be bound to every supported shader stage corresponding to the pipeline bind point used by this command</li>
     * <li>If any stage of the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a uniform buffer, and that stage was created without enabling either {@link EXTPipelineRobustness#VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_EXT PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_EXT} or {@link EXTPipelineRobustness#VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2_EXT PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2_EXT} for {@code uniformBuffers}, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-robustBufferAccess">{@code robustBufferAccess}</a> feature is not enabled, that stage <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-robustBufferAccess">{@code robustBufferAccess}</a> feature is not enabled, and any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command accesses a uniform buffer, it <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
     * <li>If any stage of the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a storage buffer, and that stage was created without enabling either {@link EXTPipelineRobustness#VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_EXT PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_EXT} or {@link EXTPipelineRobustness#VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2_EXT PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2_EXT} for {@code storageBuffers}, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-robustBufferAccess">{@code robustBufferAccess}</a> feature is not enabled, that stage <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-robustBufferAccess">{@code robustBufferAccess}</a> feature is not enabled, and any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command accesses a storage buffer, it <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
     * <li>If {@code commandBuffer} is an unprotected command buffer and <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, any resource accessed by <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-binding">bound shaders</a> <b>must</b> not be a protected resource</li>
     * <li>If <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-binding">a bound shader</a> accesses a {@code VkSampler} or {@code VkImageView} object that enables <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a>, that object <b>must</b> only be used with {@code OpImageSample*} or {@code OpImageSparseSample*} instructions</li>
     * <li>If <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-binding">a bound shader</a> accesses a {@code VkSampler} or {@code VkImageView} object that enables <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a>, that object <b>must</b> not use the {@code ConstOffset} and {@code Offset} operands</li>
     * <li>If a {@code VkImageView} is accessed as a result of this command, then the image view’s {@code viewType} <b>must</b> match the {@code Dim} operand of the {@code OpTypeImage} as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#spirvenv-image-dimensions">Compatibility Between SPIR-V Image Dimensions and Vulkan ImageView Types</a></li>
     * <li>If a {@code VkImageView} is accessed as a result of this command, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-numericformat">numeric type</a> of the image view’s {@code format} and the {@code Sampled} {@code Type} operand of the {@code OpTypeImage} <b>must</b> match</li>
     * <li>If a {@code VkImageView} created with a format other than {@link KHRMaintenance5#VK_FORMAT_A8_UNORM_KHR FORMAT_A8_UNORM_KHR} is accessed using {@code OpImageWrite} as a result of this command, then the {@code Type} of the {@code Texel} operand of that instruction <b>must</b> have at least as many components as the image view’s format</li>
     * <li>If a {@code VkImageView} created with the format {@link KHRMaintenance5#VK_FORMAT_A8_UNORM_KHR FORMAT_A8_UNORM_KHR} is accessed using {@code OpImageWrite} as a result of this command, then the {@code Type} of the {@code Texel} operand of that instruction <b>must</b> have four components</li>
     * <li>If a {@code VkBufferView} is accessed using {@code OpImageWrite} as a result of this command, then the {@code Type} of the {@code Texel} operand of that instruction <b>must</b> have at least as many components as the buffer view’s format</li>
     * <li>If a {@code VkImageView} with a {@code VkFormat} that has a 64-bit component width is accessed as a result of this command, the {@code SampledType} of the {@code OpTypeImage} operand of that instruction <b>must</b> have a {@code Width} of 64</li>
     * <li>If a {@code VkImageView} with a {@code VkFormat} that has a component width less than 64-bit is accessed as a result of this command, the {@code SampledType} of the {@code OpTypeImage} operand of that instruction <b>must</b> have a {@code Width} of 32</li>
     * <li>If a {@code VkBufferView} with a {@code VkFormat} that has a 64-bit component width is accessed as a result of this command, the {@code SampledType} of the {@code OpTypeImage} operand of that instruction <b>must</b> have a {@code Width} of 64</li>
     * <li>If a {@code VkBufferView} with a {@code VkFormat} that has a component width less than 64-bit is accessed as a result of this command, the {@code SampledType} of the {@code OpTypeImage} operand of that instruction <b>must</b> have a {@code Width} of 32</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-sparseImageInt64Atomics">{@code sparseImageInt64Atomics}</a> feature is not enabled, {@code VkImage} objects created with the {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT} flag <b>must</b> not be accessed by atomic instructions through an {@code OpTypeImage} with a {@code SampledType} with a {@code Width} of 64 by this command</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-sparseImageInt64Atomics">{@code sparseImageInt64Atomics}</a> feature is not enabled, {@code VkBuffer} objects created with the {@link VK10#VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT BUFFER_CREATE_SPARSE_RESIDENCY_BIT} flag <b>must</b> not be accessed by atomic instructions through an {@code OpTypeImage} with a {@code SampledType} with a {@code Width} of 64 by this command</li>
     * <li>If {@code OpImageWeightedSampleQCOM} is used to sample a {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link QCOMImageProcessing#VK_FORMAT_FEATURE_2_WEIGHT_SAMPLED_IMAGE_BIT_QCOM FORMAT_FEATURE_2_WEIGHT_SAMPLED_IMAGE_BIT_QCOM}</li>
     * <li>If {@code OpImageWeightedSampleQCOM} uses a {@code VkImageView} as a sample weight image as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link QCOMImageProcessing#VK_FORMAT_FEATURE_2_WEIGHT_IMAGE_BIT_QCOM FORMAT_FEATURE_2_WEIGHT_IMAGE_BIT_QCOM}</li>
     * <li>If {@code OpImageBoxFilterQCOM} is used to sample a {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link QCOMImageProcessing#VK_FORMAT_FEATURE_2_BOX_FILTER_SAMPLED_BIT_QCOM FORMAT_FEATURE_2_BOX_FILTER_SAMPLED_BIT_QCOM}</li>
     * <li>If {@code OpImageBlockMatchSSDQCOM} is used to read from an {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link QCOMImageProcessing#VK_FORMAT_FEATURE_2_BLOCK_MATCHING_BIT_QCOM FORMAT_FEATURE_2_BLOCK_MATCHING_BIT_QCOM}</li>
     * <li>If {@code OpImageBlockMatchSADQCOM} is used to read from an {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link QCOMImageProcessing#VK_FORMAT_FEATURE_2_BLOCK_MATCHING_BIT_QCOM FORMAT_FEATURE_2_BLOCK_MATCHING_BIT_QCOM}</li>
     * <li>If {@code OpImageBlockMatchSADQCOM} or OpImageBlockMatchSSDQCOM is used to read from a reference image as result of this command, then the specified reference coordinates <b>must</b> not fail <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#textures-integer-coordinate-validation">integer texel coordinate validation</a></li>
     * <li>If {@code OpImageWeightedSampleQCOM}, {@code OpImageBoxFilterQCOM}, {@code OpImageBlockMatchWindowSSDQCOM}, {@code OpImageBlockMatchWindowSADQCOM}, {@code OpImageBlockMatchGatherSSDQCOM}, {@code OpImageBlockMatchGatherSADQCOM}, {@code OpImageBlockMatchSSDQCOM}, or {@code OpImageBlockMatchSADQCOM} uses a {@code VkSampler} as a result of this command, then the sampler <b>must</b> have been created with {@link QCOMImageProcessing#VK_SAMPLER_CREATE_IMAGE_PROCESSING_BIT_QCOM SAMPLER_CREATE_IMAGE_PROCESSING_BIT_QCOM}</li>
     * <li>If any command other than {@code OpImageWeightedSampleQCOM}, {@code OpImageBoxFilterQCOM}, {@code OpImageBlockMatchWindowSSDQCOM}, {@code OpImageBlockMatchWindowSADQCOM}, {@code OpImageBlockMatchGatherSSDQCOM}, {@code OpImageBlockMatchGatherSADQCOM}, {@code OpImageBlockMatchSSDQCOM}, or {@code OpImageBlockMatchSADQCOM} uses a {@code VkSampler} as a result of this command, then the sampler <b>must</b> not have been created with {@link QCOMImageProcessing#VK_SAMPLER_CREATE_IMAGE_PROCESSING_BIT_QCOM SAMPLER_CREATE_IMAGE_PROCESSING_BIT_QCOM}</li>
     * <li>If a {@code OpImageBlockMatchWindow*QCOM} or {@code OpImageBlockMatchGather*QCOM} instruction is used to read from an {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link QCOMImageProcessing#VK_FORMAT_FEATURE_2_BLOCK_MATCHING_BIT_QCOM FORMAT_FEATURE_2_BLOCK_MATCHING_BIT_QCOM}</li>
     * <li>If a {@code OpImageBlockMatchWindow*QCOM} or {@code OpImageBlockMatchGather*QCOM} instruction is used to read from an {@code VkImageView} as a result of this command, then the image view’s format <b>must</b> be a single-component format</li>
     * <li>If a {@code OpImageBlockMatchWindow*QCOM} or {@code OpImageBlockMatchGather*QCOM} read from a reference image as result of this command, then the specified reference coordinates <b>must</b> not fail <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#textures-integer-coordinate-validation">integer texel coordinate validation</a></li>
     * <li>Any shader invocation executed by this command <b>must</b> <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-termination">terminate</a></li>
     * <li>If a descriptor with type equal to any of {@link QCOMImageProcessing#VK_DESCRIPTOR_TYPE_SAMPLE_WEIGHT_IMAGE_QCOM DESCRIPTOR_TYPE_SAMPLE_WEIGHT_IMAGE_QCOM}, {@link QCOMImageProcessing#VK_DESCRIPTOR_TYPE_BLOCK_MATCH_IMAGE_QCOM DESCRIPTOR_TYPE_BLOCK_MATCH_IMAGE_QCOM}, {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE DESCRIPTOR_TYPE_SAMPLED_IMAGE}, {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE}, or {@link VK10#VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT DESCRIPTOR_TYPE_INPUT_ATTACHMENT} is accessed as a result of this command, the image subresource identified by that descriptor <b>must</b> be in the image layout identified when the descriptor was written</li>
     * <li>Any shader group handle referenced by this call <b>must</b> have been queried from the currently bound ray tracing pipeline</li>
     * <li>If the bound ray tracing pipeline state was created with the {@link #VK_DYNAMIC_STATE_RAY_TRACING_PIPELINE_STACK_SIZE_KHR DYNAMIC_STATE_RAY_TRACING_PIPELINE_STACK_SIZE_KHR} dynamic state enabled then {@link #vkCmdSetRayTracingPipelineStackSizeKHR CmdSetRayTracingPipelineStackSizeKHR} <b>must</b> have been called in the current command buffer prior to this trace command</li>
     * </ul>
     * 
     * <ul>
     * <li>This command <b>must</b> not cause a shader call instruction to be executed from a shader invocation with a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#ray-tracing-recursion-depth">recursion depth</a> greater than the value of {@code maxPipelineRayRecursionDepth} used to create the bound ray tracing pipeline</li>
     * <li>{@code commandBuffer} <b>must</b> not be a protected command buffer</li>
     * </ul>
     * 
     * <ul>
     * <li>The {@code size} member of {@code pRayGenShaderBindingTable} <b>must</b> be equal to its {@code stride} member</li>
     * </ul>
     * 
     * <ul>
     * <li>If the buffer from which {@code pRayGenShaderBindingTable}-&gt;deviceAddress was queried is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
     * <li>The buffer from which the {@code pRayGenShaderBindingTable}-&gt;deviceAddress is queried <b>must</b> have been created with the {@link #VK_BUFFER_USAGE_SHADER_BINDING_TABLE_BIT_KHR BUFFER_USAGE_SHADER_BINDING_TABLE_BIT_KHR} usage flag</li>
     * <li>{@code pRayGenShaderBindingTable}-&gt;deviceAddress <b>must</b> be a multiple of {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR}{@code ::shaderGroupBaseAlignment}</li>
     * <li>If the buffer from which {@code pMissShaderBindingTable}-&gt;deviceAddress was queried is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
     * <li>The buffer from which the {@code pMissShaderBindingTable}-&gt;deviceAddress is queried <b>must</b> have been created with the {@link #VK_BUFFER_USAGE_SHADER_BINDING_TABLE_BIT_KHR BUFFER_USAGE_SHADER_BINDING_TABLE_BIT_KHR} usage flag</li>
     * <li>{@code pMissShaderBindingTable}-&gt;deviceAddress <b>must</b> be a multiple of {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR}{@code ::shaderGroupBaseAlignment}</li>
     * <li>{@code pMissShaderBindingTable}-&gt;stride <b>must</b> be a multiple of {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR}{@code ::shaderGroupHandleAlignment}</li>
     * <li>{@code pMissShaderBindingTable}-&gt;stride <b>must</b> be less than or equal to {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR}{@code ::maxShaderGroupStride}</li>
     * <li>If the buffer from which {@code pHitShaderBindingTable}-&gt;deviceAddress was queried is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
     * <li>The buffer from which the {@code pHitShaderBindingTable}-&gt;deviceAddress is queried <b>must</b> have been created with the {@link #VK_BUFFER_USAGE_SHADER_BINDING_TABLE_BIT_KHR BUFFER_USAGE_SHADER_BINDING_TABLE_BIT_KHR} usage flag</li>
     * <li>{@code pHitShaderBindingTable}-&gt;deviceAddress <b>must</b> be a multiple of {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR}{@code ::shaderGroupBaseAlignment}</li>
     * <li>{@code pHitShaderBindingTable}-&gt;stride <b>must</b> be a multiple of {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR}{@code ::shaderGroupHandleAlignment}</li>
     * <li>{@code pHitShaderBindingTable}-&gt;stride <b>must</b> be less than or equal to {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR}{@code ::maxShaderGroupStride}</li>
     * <li>If the buffer from which {@code pCallableShaderBindingTable}-&gt;deviceAddress was queried is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
     * <li>The buffer from which the {@code pCallableShaderBindingTable}-&gt;deviceAddress is queried <b>must</b> have been created with the {@link #VK_BUFFER_USAGE_SHADER_BINDING_TABLE_BIT_KHR BUFFER_USAGE_SHADER_BINDING_TABLE_BIT_KHR} usage flag</li>
     * <li>{@code pCallableShaderBindingTable}-&gt;deviceAddress <b>must</b> be a multiple of {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR}{@code ::shaderGroupBaseAlignment}</li>
     * <li>{@code pCallableShaderBindingTable}-&gt;stride <b>must</b> be a multiple of {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR}{@code ::shaderGroupHandleAlignment}</li>
     * <li>{@code pCallableShaderBindingTable}-&gt;stride <b>must</b> be less than or equal to {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR}{@code ::maxShaderGroupStride}</li>
     * <li>If the currently bound ray tracing pipeline was created with {@code flags} that included {@link #VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR PIPELINE_CREATE_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR}, {@code pHitShaderBindingTable}-&gt;deviceAddress <b>must</b> not be zero</li>
     * <li>If the currently bound ray tracing pipeline was created with {@code flags} that included {@link #VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS_BIT_KHR PIPELINE_CREATE_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS_BIT_KHR}, {@code pHitShaderBindingTable}-&gt;deviceAddress <b>must</b> not be zero</li>
     * <li>If the currently bound ray tracing pipeline was created with {@code flags} that included {@link #VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_MISS_SHADERS_BIT_KHR PIPELINE_CREATE_RAY_TRACING_NO_NULL_MISS_SHADERS_BIT_KHR}, the shader group handle identified by {@code pMissShaderBindingTable}-&gt;deviceAddress <b>must</b> not be set to zero</li>
     * <li>If the currently bound ray tracing pipeline was created with {@code flags} that included {@link #VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS_BIT_KHR PIPELINE_CREATE_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS_BIT_KHR}, entries in the table identified by {@code pHitShaderBindingTable}-&gt;deviceAddress accessed as a result of this command in order to execute an any-hit shader <b>must</b> not be set to zero</li>
     * <li>If the currently bound ray tracing pipeline was created with {@code flags} that included {@link #VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR PIPELINE_CREATE_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR}, entries in the table identified by {@code pHitShaderBindingTable}-&gt;deviceAddress accessed as a result of this command in order to execute a closest hit shader <b>must</b> not be set to zero</li>
     * <li>If the currently bound ray tracing pipeline was created with {@code flags} that included {@link #VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS_BIT_KHR PIPELINE_CREATE_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS_BIT_KHR}, entries in the table identified by {@code pHitShaderBindingTable}-&gt;deviceAddress accessed as a result of this command in order to execute an intersection shader <b>must</b> not be set to zero</li>
     * <li>Any non-zero hit shader group entries in the table identified by {@code pHitShaderBindingTable}-&gt;deviceAddress accessed by this call from a geometry with a {@code geometryType} of {@link KHRAccelerationStructure#VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR} <b>must</b> have been created with {@link #VK_RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_KHR RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_KHR}</li>
     * <li>Any non-zero hit shader group entries in the table identified by {@code pHitShaderBindingTable}-&gt;deviceAddress accessed by this call from a geometry with a {@code geometryType} of {@link KHRAccelerationStructure#VK_GEOMETRY_TYPE_AABBS_KHR GEOMETRY_TYPE_AABBS_KHR} <b>must</b> have been created with {@link #VK_RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_KHR RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_KHR}</li>
     * </ul>
     * 
     * <ul>
     * <li>{@code width} <b>must</b> be less than or equal to <code>{@link VkPhysicalDeviceLimits}::maxComputeWorkGroupCount[0] × {@link VkPhysicalDeviceLimits}::maxComputeWorkGroupSize[0]</code></li>
     * <li>{@code height} <b>must</b> be less than or equal to <code>{@link VkPhysicalDeviceLimits}::maxComputeWorkGroupCount[1] × {@link VkPhysicalDeviceLimits}::maxComputeWorkGroupSize[1]</code></li>
     * <li>{@code depth} <b>must</b> be less than or equal to <code>{@link VkPhysicalDeviceLimits}::maxComputeWorkGroupCount[2] × {@link VkPhysicalDeviceLimits}::maxComputeWorkGroupSize[2]</code></li>
     * <li><code>width × height × depth</code> <b>must</b> be less than or equal to {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR}{@code ::maxRayDispatchInvocationCount}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pRaygenShaderBindingTable} <b>must</b> be a valid pointer to a valid {@link VkStridedDeviceAddressRegionKHR} structure</li>
     * <li>{@code pMissShaderBindingTable} <b>must</b> be a valid pointer to a valid {@link VkStridedDeviceAddressRegionKHR} structure</li>
     * <li>{@code pHitShaderBindingTable} <b>must</b> be a valid pointer to a valid {@link VkStridedDeviceAddressRegionKHR} structure</li>
     * <li>{@code pCallableShaderBindingTable} <b>must</b> be a valid pointer to a valid {@link VkStridedDeviceAddressRegionKHR} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
     * <li>This command <b>must</b> only be called outside of a render pass instance</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Outside</td><td>Compute</td><td>Action</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkStridedDeviceAddressRegionKHR}</p>
     *
     * @param commandBuffer               the command buffer into which the command will be recorded.
     * @param pRaygenShaderBindingTable   a {@link VkStridedDeviceAddressRegionKHR} that holds the shader binding table data for the ray generation shader stage.
     * @param pMissShaderBindingTable     a {@link VkStridedDeviceAddressRegionKHR} that holds the shader binding table data for the miss shader stage.
     * @param pHitShaderBindingTable      a {@link VkStridedDeviceAddressRegionKHR} that holds the shader binding table data for the hit shader stage.
     * @param pCallableShaderBindingTable a {@link VkStridedDeviceAddressRegionKHR} that holds the shader binding table data for the callable shader stage.
     * @param width                       the width of the ray trace query dimensions.
     * @param height                      height of the ray trace query dimensions.
     * @param depth                       depth of the ray trace query dimensions.
     */
    public static void vkCmdTraceRaysKHR(VkCommandBuffer commandBuffer, @NativeType("VkStridedDeviceAddressRegionKHR const *") VkStridedDeviceAddressRegionKHR pRaygenShaderBindingTable, @NativeType("VkStridedDeviceAddressRegionKHR const *") VkStridedDeviceAddressRegionKHR pMissShaderBindingTable, @NativeType("VkStridedDeviceAddressRegionKHR const *") VkStridedDeviceAddressRegionKHR pHitShaderBindingTable, @NativeType("VkStridedDeviceAddressRegionKHR const *") VkStridedDeviceAddressRegionKHR pCallableShaderBindingTable, @NativeType("uint32_t") int width, @NativeType("uint32_t") int height, @NativeType("uint32_t") int depth) {
        nvkCmdTraceRaysKHR(commandBuffer, pRaygenShaderBindingTable.address(), pMissShaderBindingTable.address(), pHitShaderBindingTable.address(), pCallableShaderBindingTable.address(), width, height, depth);
    }

    // --- [ vkCreateRayTracingPipelinesKHR ] ---

    /**
     * Unsafe version of: {@link #vkCreateRayTracingPipelinesKHR CreateRayTracingPipelinesKHR}
     *
     * @param createInfoCount the length of the {@code pCreateInfos} and {@code pPipelines} arrays.
     */
    public static int nvkCreateRayTracingPipelinesKHR(VkDevice device, long deferredOperation, long pipelineCache, int createInfoCount, long pCreateInfos, long pAllocator, long pPipelines) {
        long __functionAddress = device.getCapabilities().vkCreateRayTracingPipelinesKHR;
        if (CHECKS) {
            check(__functionAddress);
            Struct.validate(pCreateInfos, createInfoCount, VkRayTracingPipelineCreateInfoKHR.SIZEOF, VkRayTracingPipelineCreateInfoKHR::validate);
        }
        return callPJJPPPI(device.address(), deferredOperation, pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines, __functionAddress);
    }

    /**
     * Creates a new ray tracing pipeline object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To create ray tracing pipelines, call:</p>
     * 
     * <pre><code>
     * VkResult vkCreateRayTracingPipelinesKHR(
     *     VkDevice                                    device,
     *     VkDeferredOperationKHR                      deferredOperation,
     *     VkPipelineCache                             pipelineCache,
     *     uint32_t                                    createInfoCount,
     *     const VkRayTracingPipelineCreateInfoKHR*    pCreateInfos,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkPipeline*                                 pPipelines);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@link VK12#VK_ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS} error is returned if the implementation is unable to reuse the shader group handles provided in {@link VkRayTracingShaderGroupCreateInfoKHR}{@code ::pShaderGroupCaptureReplayHandle} when {@link VkPhysicalDeviceRayTracingPipelineFeaturesKHR}{@code ::rayTracingPipelineShaderGroupHandleCaptureReplay} is enabled.</p>
     * 
     * <p>Pipelines are created and returned as described for <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-multiple">Multiple Pipeline Creation</a>.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> support at least one queue family with the {@link VK10#VK_QUEUE_COMPUTE_BIT QUEUE_COMPUTE_BIT} capability</li>
     * <li>If the {@code flags} member of any element of {@code pCreateInfos} contains the {@link VK10#VK_PIPELINE_CREATE_DERIVATIVE_BIT PIPELINE_CREATE_DERIVATIVE_BIT} flag, and the {@code basePipelineIndex} member of that same element is not {@code -1}, {@code basePipelineIndex} <b>must</b> be less than the index into {@code pCreateInfos} that corresponds to that element</li>
     * <li>If the {@code flags} member of any element of {@code pCreateInfos} contains the {@link VK10#VK_PIPELINE_CREATE_DERIVATIVE_BIT PIPELINE_CREATE_DERIVATIVE_BIT} flag, the base pipeline <b>must</b> have been created with the {@link VK10#VK_PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT} flag set</li>
     * <li>{@code flags} <b>must</b> not contain the {@link VK11#VK_PIPELINE_CREATE_DISPATCH_BASE PIPELINE_CREATE_DISPATCH_BASE} flag</li>
     * <li>If {@code pipelineCache} was created with {@link VK13#VK_PIPELINE_CACHE_CREATE_EXTERNALLY_SYNCHRONIZED_BIT PIPELINE_CACHE_CREATE_EXTERNALLY_SYNCHRONIZED_BIT}, host access to {@code pipelineCache} <b>must</b> be <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-threadingbehavior">externally synchronized</a></li>
     * </ul>
     * 
     * <ul>
     * <li>Any previous deferred operation that was associated with {@code deferredOperation} <b>must</b> be complete</li>
     * </ul>
     * 
     * <ul>
     * <li>If {@link VkPipelineBinaryInfoKHR}{@code ::binaryCount} is not 0 for any element of {@code pCreateInfos}, {@code pipelineCache} <b>must</b> be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
     * <li>If a {@link VkPipelineCreateFlags2CreateInfoKHR} structure with the {@link KHRPipelineBinary#VK_PIPELINE_CREATE_2_CAPTURE_DATA_BIT_KHR PIPELINE_CREATE_2_CAPTURE_DATA_BIT_KHR} flag set is included in the {@code pNext} chain of any element of {@code pCreateInfos}, {@code pipelineCache} <b>must</b> be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
     * <li>If {@link VkPipelineBinaryInfoKHR}{@code ::binaryCount} is not 0 for any element of {@code pCreateInfos}, {@link VK13#VK_PIPELINE_CREATION_FEEDBACK_APPLICATION_PIPELINE_CACHE_HIT_BIT PIPELINE_CREATION_FEEDBACK_APPLICATION_PIPELINE_CACHE_HIT_BIT} <b>must</b> not be set in the {@code flags} of that element</li>
     * <li>If {@link VkPipelineBinaryInfoKHR}{@code ::binaryCount} is not 0 for any element of {@code pCreateInfos}, {@link VK13#VK_PIPELINE_CREATION_FEEDBACK_BASE_PIPELINE_ACCELERATION_BIT PIPELINE_CREATION_FEEDBACK_BASE_PIPELINE_ACCELERATION_BIT} <b>must</b> not be set in the {@code flags} of that element</li>
     * <li>If {@link VkPipelineBinaryInfoKHR}{@code ::binaryCount} is not 0 for any element of {@code pCreateInfos}, {@link EXTPipelineCreationCacheControl#VK_PIPELINE_CREATE_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT_EXT PIPELINE_CREATE_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT_EXT} <b>must</b> not be set in the {@code flags} of that element</li>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-rayTracingPipeline">{@code rayTracingPipeline}</a> feature <b>must</b> be enabled</li>
     * <li>If {@code deferredOperation} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the {@code flags} member of elements of {@code pCreateInfos} <b>must</b> not include {@link VK13#VK_PIPELINE_CREATE_EARLY_RETURN_ON_FAILURE_BIT PIPELINE_CREATE_EARLY_RETURN_ON_FAILURE_BIT}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>If {@code deferredOperation} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code deferredOperation} <b>must</b> be a valid {@code VkDeferredOperationKHR} handle</li>
     * <li>If {@code pipelineCache} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code pipelineCache} <b>must</b> be a valid {@code VkPipelineCache} handle</li>
     * <li>{@code pCreateInfos} <b>must</b> be a valid pointer to an array of {@code createInfoCount} valid {@link VkRayTracingPipelineCreateInfoKHR} structures</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code pPipelines} <b>must</b> be a valid pointer to an array of {@code createInfoCount} {@code VkPipeline} handles</li>
     * <li>{@code createInfoCount} <b>must</b> be greater than 0</li>
     * <li>If {@code deferredOperation} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * <li>If {@code pipelineCache} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * <li>{@link KHRDeferredHostOperations#VK_OPERATION_DEFERRED_KHR OPERATION_DEFERRED_KHR}</li>
     * <li>{@link KHRDeferredHostOperations#VK_OPERATION_NOT_DEFERRED_KHR OPERATION_NOT_DEFERRED_KHR}</li>
     * <li>{@link EXTPipelineCreationCacheControl#VK_PIPELINE_COMPILE_REQUIRED_EXT PIPELINE_COMPILE_REQUIRED_EXT}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * <li>{@link VK12#VK_ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}, {@link VkRayTracingPipelineCreateInfoKHR}</p>
     *
     * @param device            the logical device that creates the ray tracing pipelines.
     * @param deferredOperation {@link VK10#VK_NULL_HANDLE NULL_HANDLE} or the handle of a valid {@code VkDeferredOperationKHR} <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#deferred-host-operations-requesting">request deferral</a> object for this command.
     * @param pipelineCache     either {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, indicating that pipeline caching is disabled, or the handle of a valid <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-cache">pipeline cache</a> object, in which case use of that cache is enabled for the duration of the command.
     * @param pCreateInfos      a pointer to an array of {@link VkRayTracingPipelineCreateInfoKHR} structures.
     * @param pAllocator        controls host memory allocation as described in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     * @param pPipelines        a pointer to an array in which the resulting ray tracing pipeline objects are returned.
     */
    @NativeType("VkResult")
    public static int vkCreateRayTracingPipelinesKHR(VkDevice device, @NativeType("VkDeferredOperationKHR") long deferredOperation, @NativeType("VkPipelineCache") long pipelineCache, @NativeType("VkRayTracingPipelineCreateInfoKHR const *") VkRayTracingPipelineCreateInfoKHR.Buffer pCreateInfos, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkPipeline *") LongBuffer pPipelines) {
        if (CHECKS) {
            check(pPipelines, pCreateInfos.remaining());
        }
        return nvkCreateRayTracingPipelinesKHR(device, deferredOperation, pipelineCache, pCreateInfos.remaining(), pCreateInfos.address(), memAddressSafe(pAllocator), memAddress(pPipelines));
    }

    // --- [ vkGetRayTracingShaderGroupHandlesKHR ] ---

    /**
     * Unsafe version of: {@link #vkGetRayTracingShaderGroupHandlesKHR GetRayTracingShaderGroupHandlesKHR}
     *
     * @param dataSize the size in bytes of the buffer pointed to by {@code pData}.
     */
    public static int nvkGetRayTracingShaderGroupHandlesKHR(VkDevice device, long pipeline, int firstGroup, int groupCount, long dataSize, long pData) {
        long __functionAddress = device.getCapabilities().vkGetRayTracingShaderGroupHandlesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(device.address(), pipeline, firstGroup, groupCount, dataSize, pData, __functionAddress);
    }

    /**
     * Query ray tracing pipeline shader group handles.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query the opaque handles of shaders in the ray tracing pipeline, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetRayTracingShaderGroupHandlesKHR(
     *     VkDevice                                    device,
     *     VkPipeline                                  pipeline,
     *     uint32_t                                    firstGroup,
     *     uint32_t                                    groupCount,
     *     size_t                                      dataSize,
     *     void*                                       pData);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * VkResult vkGetRayTracingShaderGroupHandlesNV(
     *     VkDevice                                    device,
     *     VkPipeline                                  pipeline,
     *     uint32_t                                    firstGroup,
     *     uint32_t                                    groupCount,
     *     size_t                                      dataSize,
     *     void*                                       pData);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>On success, an array of {@code groupCount} shader handles will be written to {@code pData}, with each element being of size {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR}{@code ::shaderGroupHandleSize}.</p>
     * 
     * <p>If {@code pipeline} was created with {@link KHRPipelineLibrary#VK_PIPELINE_CREATE_LIBRARY_BIT_KHR PIPELINE_CREATE_LIBRARY_BIT_KHR} and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-pipelineLibraryGroupHandles">pipelineLibraryGroupHandles</a> feature is enabled applications <b>can</b> query group handles from that pipeline, even if the pipeline is a library and is never bound to a command buffer. These group handles remain bitwise identical for any {@code pipeline} which references the pipeline library. Group indices are assigned as-if the pipeline was created without {@link KHRPipelineLibrary#VK_PIPELINE_CREATE_LIBRARY_BIT_KHR PIPELINE_CREATE_LIBRARY_BIT_KHR}.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code pipeline} <b>must</b> be a ray tracing pipeline</li>
     * <li>{@code firstGroup} <b>must</b> be less than the number of shader groups in {@code pipeline}</li>
     * <li>The sum of {@code firstGroup} and {@code groupCount} <b>must</b> be less than or equal to the number of shader groups in {@code pipeline}</li>
     * <li>{@code dataSize} <b>must</b> be at least <code>{@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR}::shaderGroupHandleSize × groupCount</code></li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-pipelineLibraryGroupHandles">pipelineLibraryGroupHandles</a> feature is not enabled, {@code pipeline} <b>must</b> not have been created with {@link KHRPipelineLibrary#VK_PIPELINE_CREATE_LIBRARY_BIT_KHR PIPELINE_CREATE_LIBRARY_BIT_KHR}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pipeline} <b>must</b> be a valid {@code VkPipeline} handle</li>
     * <li>{@code pData} <b>must</b> be a valid pointer to an array of {@code dataSize} bytes</li>
     * <li>{@code dataSize} <b>must</b> be greater than 0</li>
     * <li>{@code pipeline} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * </ul></dd>
     * </dl>
     *
     * @param device     the logical device containing the ray tracing pipeline.
     * @param pipeline   the ray tracing pipeline object containing the shaders.
     * @param firstGroup the index of the first group to retrieve a handle for from the {@link VkRayTracingPipelineCreateInfoKHR}{@code ::pGroups} or {@link VkRayTracingPipelineCreateInfoNV}{@code ::pGroups} array.
     * @param groupCount the number of shader handles to retrieve.
     * @param pData      a pointer to an application-allocated buffer where the results will be written.
     */
    @NativeType("VkResult")
    public static int vkGetRayTracingShaderGroupHandlesKHR(VkDevice device, @NativeType("VkPipeline") long pipeline, @NativeType("uint32_t") int firstGroup, @NativeType("uint32_t") int groupCount, @NativeType("void *") ByteBuffer pData) {
        return nvkGetRayTracingShaderGroupHandlesKHR(device, pipeline, firstGroup, groupCount, pData.remaining(), memAddress(pData));
    }

    // --- [ vkGetRayTracingCaptureReplayShaderGroupHandlesKHR ] ---

    /**
     * Unsafe version of: {@link #vkGetRayTracingCaptureReplayShaderGroupHandlesKHR GetRayTracingCaptureReplayShaderGroupHandlesKHR}
     *
     * @param dataSize the size in bytes of the buffer pointed to by {@code pData}.
     */
    public static int nvkGetRayTracingCaptureReplayShaderGroupHandlesKHR(VkDevice device, long pipeline, int firstGroup, int groupCount, long dataSize, long pData) {
        long __functionAddress = device.getCapabilities().vkGetRayTracingCaptureReplayShaderGroupHandlesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(device.address(), pipeline, firstGroup, groupCount, dataSize, pData, __functionAddress);
    }

    /**
     * Query opaque capture replay data for pipeline shader group handles.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query the opaque capture data of shader groups in a ray tracing pipeline, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetRayTracingCaptureReplayShaderGroupHandlesKHR(
     *     VkDevice                                    device,
     *     VkPipeline                                  pipeline,
     *     uint32_t                                    firstGroup,
     *     uint32_t                                    groupCount,
     *     size_t                                      dataSize,
     *     void*                                       pData);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>On success, an array of {@code groupCount} shader handles will be written to {@code pData}, with each element being of size {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR}{@code ::shaderGroupHandleCaptureReplaySize}.</p>
     * 
     * <p>Once queried, this opaque data <b>can</b> be provided at pipeline creation time (in a subsequent execution), using {@link VkRayTracingShaderGroupCreateInfoKHR}{@code ::pShaderGroupCaptureReplayHandle}, as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#ray-tracing-capture-replay">Ray Tracing Capture Replay</a>.</p>
     * 
     * <p>If {@code pipeline} was created with {@link KHRPipelineLibrary#VK_PIPELINE_CREATE_LIBRARY_BIT_KHR PIPELINE_CREATE_LIBRARY_BIT_KHR} and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-pipelineLibraryGroupHandles">pipelineLibraryGroupHandles</a> feature is enabled applications <b>can</b> query capture replay group handles from that pipeline. The capture replay handle remains bitwise identical for any {@code pipeline} which references the pipeline library. Group indices are assigned as-if the pipeline was created without {@link KHRPipelineLibrary#VK_PIPELINE_CREATE_LIBRARY_BIT_KHR PIPELINE_CREATE_LIBRARY_BIT_KHR}.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code pipeline} <b>must</b> be a ray tracing pipeline</li>
     * <li>{@code firstGroup} <b>must</b> be less than the number of shader groups in {@code pipeline}</li>
     * <li>The sum of {@code firstGroup} and {@code groupCount} <b>must</b> be less than or equal to the number of shader groups in {@code pipeline}</li>
     * <li>{@code dataSize} <b>must</b> be at least <code>{@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR}::shaderGroupHandleCaptureReplaySize × groupCount</code></li>
     * <li>{@link VkPhysicalDeviceRayTracingPipelineFeaturesKHR}{@code ::rayTracingPipelineShaderGroupHandleCaptureReplay} <b>must</b> be enabled to call this function</li>
     * <li>{@code pipeline} <b>must</b> have been created with a {@code flags} that included {@link #VK_PIPELINE_CREATE_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_BIT_KHR PIPELINE_CREATE_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_BIT_KHR}</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-pipelineLibraryGroupHandles">pipelineLibraryGroupHandles</a> feature is not enabled, {@code pipeline} <b>must</b> not have been created with {@link KHRPipelineLibrary#VK_PIPELINE_CREATE_LIBRARY_BIT_KHR PIPELINE_CREATE_LIBRARY_BIT_KHR}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pipeline} <b>must</b> be a valid {@code VkPipeline} handle</li>
     * <li>{@code pData} <b>must</b> be a valid pointer to an array of {@code dataSize} bytes</li>
     * <li>{@code dataSize} <b>must</b> be greater than 0</li>
     * <li>{@code pipeline} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * </ul></dd>
     * </dl>
     *
     * @param device     the logical device containing the ray tracing pipeline.
     * @param pipeline   the ray tracing pipeline object containing the shaders.
     * @param firstGroup the index of the first group to retrieve a handle for from the {@link VkRayTracingPipelineCreateInfoKHR}{@code ::pGroups} array.
     * @param groupCount the number of shader handles to retrieve.
     * @param pData      a pointer to an application-allocated buffer where the results will be written.
     */
    @NativeType("VkResult")
    public static int vkGetRayTracingCaptureReplayShaderGroupHandlesKHR(VkDevice device, @NativeType("VkPipeline") long pipeline, @NativeType("uint32_t") int firstGroup, @NativeType("uint32_t") int groupCount, @NativeType("void *") ByteBuffer pData) {
        return nvkGetRayTracingCaptureReplayShaderGroupHandlesKHR(device, pipeline, firstGroup, groupCount, pData.remaining(), memAddress(pData));
    }

    // --- [ vkCmdTraceRaysIndirectKHR ] ---

    /** Unsafe version of: {@link #vkCmdTraceRaysIndirectKHR CmdTraceRaysIndirectKHR} */
    public static void nvkCmdTraceRaysIndirectKHR(VkCommandBuffer commandBuffer, long pRaygenShaderBindingTable, long pMissShaderBindingTable, long pHitShaderBindingTable, long pCallableShaderBindingTable, long indirectDeviceAddress) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdTraceRaysIndirectKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPPPJV(commandBuffer.address(), pRaygenShaderBindingTable, pMissShaderBindingTable, pHitShaderBindingTable, pCallableShaderBindingTable, indirectDeviceAddress, __functionAddress);
    }

    /**
     * Initialize an indirect ray tracing dispatch.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To dispatch ray tracing, with some parameters sourced on the device, use:</p>
     * 
     * <pre><code>
     * void vkCmdTraceRaysIndirectKHR(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkStridedDeviceAddressRegionKHR*      pRaygenShaderBindingTable,
     *     const VkStridedDeviceAddressRegionKHR*      pMissShaderBindingTable,
     *     const VkStridedDeviceAddressRegionKHR*      pHitShaderBindingTable,
     *     const VkStridedDeviceAddressRegionKHR*      pCallableShaderBindingTable,
     *     VkDeviceAddress                             indirectDeviceAddress);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@code vkCmdTraceRaysIndirectKHR} behaves similarly to {@link #vkCmdTraceRaysKHR CmdTraceRaysKHR} except that the ray trace query dimensions are read by the device from {@code indirectDeviceAddress} during execution.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If a {@code VkSampler} created with {@code magFilter} or {@code minFilter} equal to {@link VK10#VK_FILTER_LINEAR FILTER_LINEAR}, {@code reductionMode} equal to {@link VK12#VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE}, and {@code compareEnable} equal to {@link VK10#VK_FALSE FALSE} is used to sample a {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT}</li>
     * <li>If a {@code VkSampler} created with {@code magFilter} or {@code minFilter} equal to {@link VK10#VK_FILTER_LINEAR FILTER_LINEAR} and {@code reductionMode} equal to either {@link VK12#VK_SAMPLER_REDUCTION_MODE_MIN SAMPLER_REDUCTION_MODE_MIN} or {@link VK12#VK_SAMPLER_REDUCTION_MODE_MAX SAMPLER_REDUCTION_MODE_MAX} is used to sample a {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK12#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_MINMAX_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_MINMAX_BIT}</li>
     * <li>If a {@code VkSampler} created with {@code mipmapMode} equal to {@link VK10#VK_SAMPLER_MIPMAP_MODE_LINEAR SAMPLER_MIPMAP_MODE_LINEAR}, {@code reductionMode} equal to {@link VK12#VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE}, and {@code compareEnable} equal to {@link VK10#VK_FALSE FALSE} is used to sample a {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT}</li>
     * <li>If a {@code VkSampler} created with {@code mipmapMode} equal to {@link VK10#VK_SAMPLER_MIPMAP_MODE_LINEAR SAMPLER_MIPMAP_MODE_LINEAR} and {@code reductionMode} equal to either {@link VK12#VK_SAMPLER_REDUCTION_MODE_MIN SAMPLER_REDUCTION_MODE_MIN} or {@link VK12#VK_SAMPLER_REDUCTION_MODE_MAX SAMPLER_REDUCTION_MODE_MAX} is used to sample a {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK12#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_MINMAX_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_MINMAX_BIT}</li>
     * <li>If a {@code VkSampler} created with {@code unnormalizedCoordinates} equal to {@link VK10#VK_TRUE TRUE} is used to sample a {@code VkImageView} as a result of this command, then the image view’s {@code levelCount} and {@code layerCount} <b>must</b> be 1</li>
     * <li>If a {@code VkSampler} created with {@code unnormalizedCoordinates} equal to {@link VK10#VK_TRUE TRUE} is used to sample a {@code VkImageView} as a result of this command, then the image view’s {@code viewType} <b>must</b> be {@link VK10#VK_IMAGE_VIEW_TYPE_1D IMAGE_VIEW_TYPE_1D} or {@link VK10#VK_IMAGE_VIEW_TYPE_2D IMAGE_VIEW_TYPE_2D}</li>
     * <li>If a {@code VkImageView} is sampled with <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#textures-depth-compare-operation">depth comparison</a>, the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK13#VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_DEPTH_COMPARISON_BIT FORMAT_FEATURE_2_SAMPLED_IMAGE_DEPTH_COMPARISON_BIT}</li>
     * <li>If a {@code VkImageView} is accessed using atomic operations as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT}</li>
     * <li>If a {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER} descriptor is accessed using atomic operations as a result of this command, then the storage texel buffer’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-buffer-view-format-features">format features</a> <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT}</li>
     * <li>If a {@code VkImageView} is sampled with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link EXTFilterCubic#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT}</li>
     * <li>If the {@link EXTFilterCubic VK_EXT_filter_cubic} extension is not enabled and any {@code VkImageView} is sampled with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT} as a result of this command, it <b>must</b> not have a {@code VkImageViewType} of {@link VK10#VK_IMAGE_VIEW_TYPE_3D IMAGE_VIEW_TYPE_3D}, {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE}, or {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}</li>
     * <li>Any {@code VkImageView} being sampled with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT} as a result of this command <b>must</b> have a {@code VkImageViewType} and format that supports cubic filtering, as specified by {@link VkFilterCubicImageViewImageFormatPropertiesEXT}{@code ::filterCubic} returned by {@link VK11#vkGetPhysicalDeviceImageFormatProperties2 GetPhysicalDeviceImageFormatProperties2}</li>
     * <li>Any {@code VkImageView} being sampled with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT} with a reduction mode of either {@link VK12#VK_SAMPLER_REDUCTION_MODE_MIN SAMPLER_REDUCTION_MODE_MIN} or {@link VK12#VK_SAMPLER_REDUCTION_MODE_MAX SAMPLER_REDUCTION_MODE_MAX} as a result of this command <b>must</b> have a {@code VkImageViewType} and format that supports cubic filtering together with minmax filtering, as specified by {@link VkFilterCubicImageViewImageFormatPropertiesEXT}{@code ::filterCubicMinmax} returned by {@link VK11#vkGetPhysicalDeviceImageFormatProperties2 GetPhysicalDeviceImageFormatProperties2}</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-filter-cubic-range-clamp">{@code cubicRangeClamp}</a> feature is not enabled, then any {@code VkImageView} being sampled with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT} as a result of this command <b>must</b> not have a {@link VkSamplerReductionModeCreateInfo}{@code ::reductionMode} equal to {@link QCOMFilterCubicClamp#VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_RANGECLAMP_QCOM SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_RANGECLAMP_QCOM}</li>
     * <li>Any {@code VkImageView} being sampled with a {@link VkSamplerReductionModeCreateInfo}{@code ::reductionMode} equal to {@link QCOMFilterCubicClamp#VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_RANGECLAMP_QCOM SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_RANGECLAMP_QCOM} as a result of this command <b>must</b> sample with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT}</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-filter-cubic-weight-selection">{@code selectableCubicWeights}</a> feature is not enabled, then any {@code VkImageView} being sampled with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT} as a result of this command <b>must</b> have {@link VkSamplerCubicWeightsCreateInfoQCOM}{@code ::cubicWeights} equal to {@link QCOMFilterCubicWeights#VK_CUBIC_FILTER_WEIGHTS_CATMULL_ROM_QCOM CUBIC_FILTER_WEIGHTS_CATMULL_ROM_QCOM}</li>
     * <li>Any {@code VkImage} created with a {@link VkImageCreateInfo}{@code ::flags} containing {@link NVCornerSampledImage#VK_IMAGE_CREATE_CORNER_SAMPLED_BIT_NV IMAGE_CREATE_CORNER_SAMPLED_BIT_NV} sampled as a result of this command <b>must</b> only be sampled using a {@code VkSamplerAddressMode} of {@link VK10#VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE}</li>
     * <li>For any {@code VkImageView} being written as a storage image where the image format field of the {@code OpTypeImage} is {@code Unknown}, the view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK13#VK_FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT}</li>
     * <li>For any {@code VkImageView} being read as a storage image where the image format field of the {@code OpTypeImage} is {@code Unknown}, the view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK13#VK_FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT}</li>
     * <li>For any {@code VkBufferView} being written as a storage texel buffer where the image format field of the {@code OpTypeImage} is {@code Unknown}, the view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkFormatProperties3">buffer features</a> <b>must</b> contain {@link VK13#VK_FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT}</li>
     * <li>Any {@code VkBufferView} being read as a storage texel buffer where the image format field of the {@code OpTypeImage} is {@code Unknown} then the view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkFormatProperties3">buffer features</a> <b>must</b> contain {@link VK13#VK_FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT}</li>
     * <li>For each set <em>n</em> that is statically used by <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-binding">a bound shader</a>, a descriptor set <b>must</b> have been bound to <em>n</em> at the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for set <em>n</em>, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline} or the {@code VkDescriptorSetLayout} array used to create the current {@code VkShaderEXT} , as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
     * <li>For each push constant that is statically used by <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-binding">a bound shader</a>, a push constant value <b>must</b> have been set for the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for push constants, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline} or the {@code VkDescriptorSetLayout} array used to create the current {@code VkShaderEXT} , as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
     * <li>For each array of resources that is used by <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-binding">a bound shader</a>, the indices used to access members of the array <b>must</b> be less than the descriptor count for the identified binding in the descriptor sets used by this command</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-maintenance4">{@code maintenance4}</a> feature is not enabled, then for each push constant that is statically used by <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-binding">a bound shader</a>, a push constant value <b>must</b> have been set for the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for push constants, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline} or the {@code VkDescriptorSetLayout} and {@link VkPushConstantRange} arrays used to create the current {@code VkShaderEXT} , as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
     * <li>Descriptors in each bound descriptor set, specified via {@link VK10#vkCmdBindDescriptorSets CmdBindDescriptorSets}, <b>must</b> be valid as described by <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#descriptor-validity">descriptor validity</a> if they are statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command and the bound {@code VkPipeline} was not created with {@link EXTDescriptorBuffer#VK_PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT}</li>
     * <li>If the descriptors used by the {@code VkPipeline} bound to the pipeline bind point were specified via {@link VK10#vkCmdBindDescriptorSets CmdBindDescriptorSets}, the bound {@code VkPipeline} <b>must</b> have been created without {@link EXTDescriptorBuffer#VK_PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT}</li>
     * <li>Descriptors in bound descriptor buffers, specified via {@link EXTDescriptorBuffer#vkCmdSetDescriptorBufferOffsetsEXT CmdSetDescriptorBufferOffsetsEXT}, <b>must</b> be valid if they are dynamically used by the {@code VkPipeline} bound to the pipeline bind point used by this command and the bound {@code VkPipeline} was created with {@link EXTDescriptorBuffer#VK_PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT}</li>
     * <li>Descriptors in bound descriptor buffers, specified via {@link EXTDescriptorBuffer#vkCmdSetDescriptorBufferOffsetsEXT CmdSetDescriptorBufferOffsetsEXT}, <b>must</b> be valid if they are dynamically used by any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command</li>
     * <li>If the descriptors used by the {@code VkPipeline} bound to the pipeline bind point were specified via {@link EXTDescriptorBuffer#vkCmdSetDescriptorBufferOffsetsEXT CmdSetDescriptorBufferOffsetsEXT}, the bound {@code VkPipeline} <b>must</b> have been created with {@link EXTDescriptorBuffer#VK_PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT}</li>
     * <li>If a descriptor is dynamically used with a {@code VkPipeline} created with {@link EXTDescriptorBuffer#VK_PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT}, the descriptor memory <b>must</b> be resident</li>
     * <li>If a descriptor is dynamically used with a {@code VkShaderEXT} created with a {@code VkDescriptorSetLayout} that was created with {@link EXTDescriptorBuffer#VK_DESCRIPTOR_SET_LAYOUT_CREATE_DESCRIPTOR_BUFFER_BIT_EXT DESCRIPTOR_SET_LAYOUT_CREATE_DESCRIPTOR_BUFFER_BIT_EXT}, the descriptor memory <b>must</b> be resident</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature is not enabled, a valid pipeline <b>must</b> be bound to the pipeline bind point used by this command</li>
     * <li>If a pipeline is bound to the pipeline bind point used by this command, there <b>must</b> not have been any calls to dynamic state setting commands for any state specified statically in the {@code VkPipeline} object bound to the pipeline bind point used by this command, since that pipeline was bound</li>
     * <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command or any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used to sample from any {@code VkImage} with a {@code VkImageView} of the type {@link VK10#VK_IMAGE_VIEW_TYPE_3D IMAGE_VIEW_TYPE_3D}, {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE}, {@link VK10#VK_IMAGE_VIEW_TYPE_1D_ARRAY IMAGE_VIEW_TYPE_1D_ARRAY}, {@link VK10#VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY} or {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}, in any shader stage</li>
     * <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command or any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with {@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage</li>
     * <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command or any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that includes a LOD bias or any offset values, in any shader stage</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> is enabled, either a valid pipeline <b>must</b> be bound to the pipeline bind point used by this command, or a valid combination of valid and {@link VK10#VK_NULL_HANDLE NULL_HANDLE} shader objects <b>must</b> be bound to every supported shader stage corresponding to the pipeline bind point used by this command</li>
     * <li>If any stage of the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a uniform buffer, and that stage was created without enabling either {@link EXTPipelineRobustness#VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_EXT PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_EXT} or {@link EXTPipelineRobustness#VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2_EXT PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2_EXT} for {@code uniformBuffers}, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-robustBufferAccess">{@code robustBufferAccess}</a> feature is not enabled, that stage <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-robustBufferAccess">{@code robustBufferAccess}</a> feature is not enabled, and any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command accesses a uniform buffer, it <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
     * <li>If any stage of the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a storage buffer, and that stage was created without enabling either {@link EXTPipelineRobustness#VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_EXT PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_EXT} or {@link EXTPipelineRobustness#VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2_EXT PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2_EXT} for {@code storageBuffers}, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-robustBufferAccess">{@code robustBufferAccess}</a> feature is not enabled, that stage <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-robustBufferAccess">{@code robustBufferAccess}</a> feature is not enabled, and any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command accesses a storage buffer, it <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
     * <li>If {@code commandBuffer} is an unprotected command buffer and <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, any resource accessed by <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-binding">bound shaders</a> <b>must</b> not be a protected resource</li>
     * <li>If <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-binding">a bound shader</a> accesses a {@code VkSampler} or {@code VkImageView} object that enables <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a>, that object <b>must</b> only be used with {@code OpImageSample*} or {@code OpImageSparseSample*} instructions</li>
     * <li>If <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-binding">a bound shader</a> accesses a {@code VkSampler} or {@code VkImageView} object that enables <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a>, that object <b>must</b> not use the {@code ConstOffset} and {@code Offset} operands</li>
     * <li>If a {@code VkImageView} is accessed as a result of this command, then the image view’s {@code viewType} <b>must</b> match the {@code Dim} operand of the {@code OpTypeImage} as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#spirvenv-image-dimensions">Compatibility Between SPIR-V Image Dimensions and Vulkan ImageView Types</a></li>
     * <li>If a {@code VkImageView} is accessed as a result of this command, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-numericformat">numeric type</a> of the image view’s {@code format} and the {@code Sampled} {@code Type} operand of the {@code OpTypeImage} <b>must</b> match</li>
     * <li>If a {@code VkImageView} created with a format other than {@link KHRMaintenance5#VK_FORMAT_A8_UNORM_KHR FORMAT_A8_UNORM_KHR} is accessed using {@code OpImageWrite} as a result of this command, then the {@code Type} of the {@code Texel} operand of that instruction <b>must</b> have at least as many components as the image view’s format</li>
     * <li>If a {@code VkImageView} created with the format {@link KHRMaintenance5#VK_FORMAT_A8_UNORM_KHR FORMAT_A8_UNORM_KHR} is accessed using {@code OpImageWrite} as a result of this command, then the {@code Type} of the {@code Texel} operand of that instruction <b>must</b> have four components</li>
     * <li>If a {@code VkBufferView} is accessed using {@code OpImageWrite} as a result of this command, then the {@code Type} of the {@code Texel} operand of that instruction <b>must</b> have at least as many components as the buffer view’s format</li>
     * <li>If a {@code VkImageView} with a {@code VkFormat} that has a 64-bit component width is accessed as a result of this command, the {@code SampledType} of the {@code OpTypeImage} operand of that instruction <b>must</b> have a {@code Width} of 64</li>
     * <li>If a {@code VkImageView} with a {@code VkFormat} that has a component width less than 64-bit is accessed as a result of this command, the {@code SampledType} of the {@code OpTypeImage} operand of that instruction <b>must</b> have a {@code Width} of 32</li>
     * <li>If a {@code VkBufferView} with a {@code VkFormat} that has a 64-bit component width is accessed as a result of this command, the {@code SampledType} of the {@code OpTypeImage} operand of that instruction <b>must</b> have a {@code Width} of 64</li>
     * <li>If a {@code VkBufferView} with a {@code VkFormat} that has a component width less than 64-bit is accessed as a result of this command, the {@code SampledType} of the {@code OpTypeImage} operand of that instruction <b>must</b> have a {@code Width} of 32</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-sparseImageInt64Atomics">{@code sparseImageInt64Atomics}</a> feature is not enabled, {@code VkImage} objects created with the {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT} flag <b>must</b> not be accessed by atomic instructions through an {@code OpTypeImage} with a {@code SampledType} with a {@code Width} of 64 by this command</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-sparseImageInt64Atomics">{@code sparseImageInt64Atomics}</a> feature is not enabled, {@code VkBuffer} objects created with the {@link VK10#VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT BUFFER_CREATE_SPARSE_RESIDENCY_BIT} flag <b>must</b> not be accessed by atomic instructions through an {@code OpTypeImage} with a {@code SampledType} with a {@code Width} of 64 by this command</li>
     * <li>If {@code OpImageWeightedSampleQCOM} is used to sample a {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link QCOMImageProcessing#VK_FORMAT_FEATURE_2_WEIGHT_SAMPLED_IMAGE_BIT_QCOM FORMAT_FEATURE_2_WEIGHT_SAMPLED_IMAGE_BIT_QCOM}</li>
     * <li>If {@code OpImageWeightedSampleQCOM} uses a {@code VkImageView} as a sample weight image as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link QCOMImageProcessing#VK_FORMAT_FEATURE_2_WEIGHT_IMAGE_BIT_QCOM FORMAT_FEATURE_2_WEIGHT_IMAGE_BIT_QCOM}</li>
     * <li>If {@code OpImageBoxFilterQCOM} is used to sample a {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link QCOMImageProcessing#VK_FORMAT_FEATURE_2_BOX_FILTER_SAMPLED_BIT_QCOM FORMAT_FEATURE_2_BOX_FILTER_SAMPLED_BIT_QCOM}</li>
     * <li>If {@code OpImageBlockMatchSSDQCOM} is used to read from an {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link QCOMImageProcessing#VK_FORMAT_FEATURE_2_BLOCK_MATCHING_BIT_QCOM FORMAT_FEATURE_2_BLOCK_MATCHING_BIT_QCOM}</li>
     * <li>If {@code OpImageBlockMatchSADQCOM} is used to read from an {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link QCOMImageProcessing#VK_FORMAT_FEATURE_2_BLOCK_MATCHING_BIT_QCOM FORMAT_FEATURE_2_BLOCK_MATCHING_BIT_QCOM}</li>
     * <li>If {@code OpImageBlockMatchSADQCOM} or OpImageBlockMatchSSDQCOM is used to read from a reference image as result of this command, then the specified reference coordinates <b>must</b> not fail <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#textures-integer-coordinate-validation">integer texel coordinate validation</a></li>
     * <li>If {@code OpImageWeightedSampleQCOM}, {@code OpImageBoxFilterQCOM}, {@code OpImageBlockMatchWindowSSDQCOM}, {@code OpImageBlockMatchWindowSADQCOM}, {@code OpImageBlockMatchGatherSSDQCOM}, {@code OpImageBlockMatchGatherSADQCOM}, {@code OpImageBlockMatchSSDQCOM}, or {@code OpImageBlockMatchSADQCOM} uses a {@code VkSampler} as a result of this command, then the sampler <b>must</b> have been created with {@link QCOMImageProcessing#VK_SAMPLER_CREATE_IMAGE_PROCESSING_BIT_QCOM SAMPLER_CREATE_IMAGE_PROCESSING_BIT_QCOM}</li>
     * <li>If any command other than {@code OpImageWeightedSampleQCOM}, {@code OpImageBoxFilterQCOM}, {@code OpImageBlockMatchWindowSSDQCOM}, {@code OpImageBlockMatchWindowSADQCOM}, {@code OpImageBlockMatchGatherSSDQCOM}, {@code OpImageBlockMatchGatherSADQCOM}, {@code OpImageBlockMatchSSDQCOM}, or {@code OpImageBlockMatchSADQCOM} uses a {@code VkSampler} as a result of this command, then the sampler <b>must</b> not have been created with {@link QCOMImageProcessing#VK_SAMPLER_CREATE_IMAGE_PROCESSING_BIT_QCOM SAMPLER_CREATE_IMAGE_PROCESSING_BIT_QCOM}</li>
     * <li>If a {@code OpImageBlockMatchWindow*QCOM} or {@code OpImageBlockMatchGather*QCOM} instruction is used to read from an {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link QCOMImageProcessing#VK_FORMAT_FEATURE_2_BLOCK_MATCHING_BIT_QCOM FORMAT_FEATURE_2_BLOCK_MATCHING_BIT_QCOM}</li>
     * <li>If a {@code OpImageBlockMatchWindow*QCOM} or {@code OpImageBlockMatchGather*QCOM} instruction is used to read from an {@code VkImageView} as a result of this command, then the image view’s format <b>must</b> be a single-component format</li>
     * <li>If a {@code OpImageBlockMatchWindow*QCOM} or {@code OpImageBlockMatchGather*QCOM} read from a reference image as result of this command, then the specified reference coordinates <b>must</b> not fail <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#textures-integer-coordinate-validation">integer texel coordinate validation</a></li>
     * <li>Any shader invocation executed by this command <b>must</b> <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-termination">terminate</a></li>
     * <li>If a descriptor with type equal to any of {@link QCOMImageProcessing#VK_DESCRIPTOR_TYPE_SAMPLE_WEIGHT_IMAGE_QCOM DESCRIPTOR_TYPE_SAMPLE_WEIGHT_IMAGE_QCOM}, {@link QCOMImageProcessing#VK_DESCRIPTOR_TYPE_BLOCK_MATCH_IMAGE_QCOM DESCRIPTOR_TYPE_BLOCK_MATCH_IMAGE_QCOM}, {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE DESCRIPTOR_TYPE_SAMPLED_IMAGE}, {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE}, or {@link VK10#VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT DESCRIPTOR_TYPE_INPUT_ATTACHMENT} is accessed as a result of this command, the image subresource identified by that descriptor <b>must</b> be in the image layout identified when the descriptor was written</li>
     * <li>Any shader group handle referenced by this call <b>must</b> have been queried from the currently bound ray tracing pipeline</li>
     * <li>If the bound ray tracing pipeline state was created with the {@link #VK_DYNAMIC_STATE_RAY_TRACING_PIPELINE_STACK_SIZE_KHR DYNAMIC_STATE_RAY_TRACING_PIPELINE_STACK_SIZE_KHR} dynamic state enabled then {@link #vkCmdSetRayTracingPipelineStackSizeKHR CmdSetRayTracingPipelineStackSizeKHR} <b>must</b> have been called in the current command buffer prior to this trace command</li>
     * </ul>
     * 
     * <ul>
     * <li>This command <b>must</b> not cause a shader call instruction to be executed from a shader invocation with a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#ray-tracing-recursion-depth">recursion depth</a> greater than the value of {@code maxPipelineRayRecursionDepth} used to create the bound ray tracing pipeline</li>
     * <li>{@code commandBuffer} <b>must</b> not be a protected command buffer</li>
     * </ul>
     * 
     * <ul>
     * <li>The {@code size} member of {@code pRayGenShaderBindingTable} <b>must</b> be equal to its {@code stride} member</li>
     * </ul>
     * 
     * <ul>
     * <li>If the buffer from which {@code pRayGenShaderBindingTable}-&gt;deviceAddress was queried is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
     * <li>The buffer from which the {@code pRayGenShaderBindingTable}-&gt;deviceAddress is queried <b>must</b> have been created with the {@link #VK_BUFFER_USAGE_SHADER_BINDING_TABLE_BIT_KHR BUFFER_USAGE_SHADER_BINDING_TABLE_BIT_KHR} usage flag</li>
     * <li>{@code pRayGenShaderBindingTable}-&gt;deviceAddress <b>must</b> be a multiple of {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR}{@code ::shaderGroupBaseAlignment}</li>
     * <li>If the buffer from which {@code pMissShaderBindingTable}-&gt;deviceAddress was queried is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
     * <li>The buffer from which the {@code pMissShaderBindingTable}-&gt;deviceAddress is queried <b>must</b> have been created with the {@link #VK_BUFFER_USAGE_SHADER_BINDING_TABLE_BIT_KHR BUFFER_USAGE_SHADER_BINDING_TABLE_BIT_KHR} usage flag</li>
     * <li>{@code pMissShaderBindingTable}-&gt;deviceAddress <b>must</b> be a multiple of {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR}{@code ::shaderGroupBaseAlignment}</li>
     * <li>{@code pMissShaderBindingTable}-&gt;stride <b>must</b> be a multiple of {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR}{@code ::shaderGroupHandleAlignment}</li>
     * <li>{@code pMissShaderBindingTable}-&gt;stride <b>must</b> be less than or equal to {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR}{@code ::maxShaderGroupStride}</li>
     * <li>If the buffer from which {@code pHitShaderBindingTable}-&gt;deviceAddress was queried is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
     * <li>The buffer from which the {@code pHitShaderBindingTable}-&gt;deviceAddress is queried <b>must</b> have been created with the {@link #VK_BUFFER_USAGE_SHADER_BINDING_TABLE_BIT_KHR BUFFER_USAGE_SHADER_BINDING_TABLE_BIT_KHR} usage flag</li>
     * <li>{@code pHitShaderBindingTable}-&gt;deviceAddress <b>must</b> be a multiple of {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR}{@code ::shaderGroupBaseAlignment}</li>
     * <li>{@code pHitShaderBindingTable}-&gt;stride <b>must</b> be a multiple of {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR}{@code ::shaderGroupHandleAlignment}</li>
     * <li>{@code pHitShaderBindingTable}-&gt;stride <b>must</b> be less than or equal to {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR}{@code ::maxShaderGroupStride}</li>
     * <li>If the buffer from which {@code pCallableShaderBindingTable}-&gt;deviceAddress was queried is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
     * <li>The buffer from which the {@code pCallableShaderBindingTable}-&gt;deviceAddress is queried <b>must</b> have been created with the {@link #VK_BUFFER_USAGE_SHADER_BINDING_TABLE_BIT_KHR BUFFER_USAGE_SHADER_BINDING_TABLE_BIT_KHR} usage flag</li>
     * <li>{@code pCallableShaderBindingTable}-&gt;deviceAddress <b>must</b> be a multiple of {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR}{@code ::shaderGroupBaseAlignment}</li>
     * <li>{@code pCallableShaderBindingTable}-&gt;stride <b>must</b> be a multiple of {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR}{@code ::shaderGroupHandleAlignment}</li>
     * <li>{@code pCallableShaderBindingTable}-&gt;stride <b>must</b> be less than or equal to {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR}{@code ::maxShaderGroupStride}</li>
     * <li>If the currently bound ray tracing pipeline was created with {@code flags} that included {@link #VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR PIPELINE_CREATE_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR}, {@code pHitShaderBindingTable}-&gt;deviceAddress <b>must</b> not be zero</li>
     * <li>If the currently bound ray tracing pipeline was created with {@code flags} that included {@link #VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS_BIT_KHR PIPELINE_CREATE_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS_BIT_KHR}, {@code pHitShaderBindingTable}-&gt;deviceAddress <b>must</b> not be zero</li>
     * <li>If the currently bound ray tracing pipeline was created with {@code flags} that included {@link #VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_MISS_SHADERS_BIT_KHR PIPELINE_CREATE_RAY_TRACING_NO_NULL_MISS_SHADERS_BIT_KHR}, the shader group handle identified by {@code pMissShaderBindingTable}-&gt;deviceAddress <b>must</b> not be set to zero</li>
     * <li>If the currently bound ray tracing pipeline was created with {@code flags} that included {@link #VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS_BIT_KHR PIPELINE_CREATE_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS_BIT_KHR}, entries in the table identified by {@code pHitShaderBindingTable}-&gt;deviceAddress accessed as a result of this command in order to execute an any-hit shader <b>must</b> not be set to zero</li>
     * <li>If the currently bound ray tracing pipeline was created with {@code flags} that included {@link #VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR PIPELINE_CREATE_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR}, entries in the table identified by {@code pHitShaderBindingTable}-&gt;deviceAddress accessed as a result of this command in order to execute a closest hit shader <b>must</b> not be set to zero</li>
     * <li>If the currently bound ray tracing pipeline was created with {@code flags} that included {@link #VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS_BIT_KHR PIPELINE_CREATE_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS_BIT_KHR}, entries in the table identified by {@code pHitShaderBindingTable}-&gt;deviceAddress accessed as a result of this command in order to execute an intersection shader <b>must</b> not be set to zero</li>
     * <li>Any non-zero hit shader group entries in the table identified by {@code pHitShaderBindingTable}-&gt;deviceAddress accessed by this call from a geometry with a {@code geometryType} of {@link KHRAccelerationStructure#VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR} <b>must</b> have been created with {@link #VK_RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_KHR RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_KHR}</li>
     * <li>Any non-zero hit shader group entries in the table identified by {@code pHitShaderBindingTable}-&gt;deviceAddress accessed by this call from a geometry with a {@code geometryType} of {@link KHRAccelerationStructure#VK_GEOMETRY_TYPE_AABBS_KHR GEOMETRY_TYPE_AABBS_KHR} <b>must</b> have been created with {@link #VK_RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_KHR RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_KHR}</li>
     * </ul>
     * 
     * <ul>
     * <li>If the buffer from which {@code indirectDeviceAddress} was queried is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
     * <li>The buffer from which {@code indirectDeviceAddress} was queried <b>must</b> have been created with the {@link VK10#VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT BUFFER_USAGE_INDIRECT_BUFFER_BIT} bit set</li>
     * <li>{@code indirectDeviceAddress} <b>must</b> be a multiple of 4</li>
     * <li>All device addresses between {@code indirectDeviceAddress} and <code>indirectDeviceAddress + sizeof({@link VkTraceRaysIndirectCommandKHR}) - 1</code> <b>must</b> be in the buffer device address range of the same buffer</li>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-rayTracingPipelineTraceRaysIndirect">{@code rayTracingPipelineTraceRaysIndirect}</a> feature <b>must</b> be enabled</li>
     * <li>If the bound ray tracing pipeline was created with {@link NVRayTracingMotionBlur#VK_PIPELINE_CREATE_RAY_TRACING_ALLOW_MOTION_BIT_NV PIPELINE_CREATE_RAY_TRACING_ALLOW_MOTION_BIT_NV} {@link VkPhysicalDeviceRayTracingMotionBlurFeaturesNV}{@code ::rayTracingMotionBlurPipelineTraceRaysIndirect} feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pRaygenShaderBindingTable} <b>must</b> be a valid pointer to a valid {@link VkStridedDeviceAddressRegionKHR} structure</li>
     * <li>{@code pMissShaderBindingTable} <b>must</b> be a valid pointer to a valid {@link VkStridedDeviceAddressRegionKHR} structure</li>
     * <li>{@code pHitShaderBindingTable} <b>must</b> be a valid pointer to a valid {@link VkStridedDeviceAddressRegionKHR} structure</li>
     * <li>{@code pCallableShaderBindingTable} <b>must</b> be a valid pointer to a valid {@link VkStridedDeviceAddressRegionKHR} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
     * <li>This command <b>must</b> only be called outside of a render pass instance</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Outside</td><td>Compute</td><td>Action</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkStridedDeviceAddressRegionKHR}</p>
     *
     * @param commandBuffer               the command buffer into which the command will be recorded.
     * @param pRaygenShaderBindingTable   a {@link VkStridedDeviceAddressRegionKHR} that holds the shader binding table data for the ray generation shader stage.
     * @param pMissShaderBindingTable     a {@link VkStridedDeviceAddressRegionKHR} that holds the shader binding table data for the miss shader stage.
     * @param pHitShaderBindingTable      a {@link VkStridedDeviceAddressRegionKHR} that holds the shader binding table data for the hit shader stage.
     * @param pCallableShaderBindingTable a {@link VkStridedDeviceAddressRegionKHR} that holds the shader binding table data for the callable shader stage.
     * @param indirectDeviceAddress       a buffer device address which is a pointer to a {@link VkTraceRaysIndirectCommandKHR} structure containing the trace ray parameters.
     */
    public static void vkCmdTraceRaysIndirectKHR(VkCommandBuffer commandBuffer, @NativeType("VkStridedDeviceAddressRegionKHR const *") VkStridedDeviceAddressRegionKHR pRaygenShaderBindingTable, @NativeType("VkStridedDeviceAddressRegionKHR const *") VkStridedDeviceAddressRegionKHR pMissShaderBindingTable, @NativeType("VkStridedDeviceAddressRegionKHR const *") VkStridedDeviceAddressRegionKHR pHitShaderBindingTable, @NativeType("VkStridedDeviceAddressRegionKHR const *") VkStridedDeviceAddressRegionKHR pCallableShaderBindingTable, @NativeType("VkDeviceAddress") long indirectDeviceAddress) {
        nvkCmdTraceRaysIndirectKHR(commandBuffer, pRaygenShaderBindingTable.address(), pMissShaderBindingTable.address(), pHitShaderBindingTable.address(), pCallableShaderBindingTable.address(), indirectDeviceAddress);
    }

    // --- [ vkGetRayTracingShaderGroupStackSizeKHR ] ---

    /**
     * Query ray tracing pipeline shader group shader stack size.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query the pipeline stack size of shaders in a shader group in the ray tracing pipeline, call:</p>
     * 
     * <pre><code>
     * VkDeviceSize vkGetRayTracingShaderGroupStackSizeKHR(
     *     VkDevice                                    device,
     *     VkPipeline                                  pipeline,
     *     uint32_t                                    group,
     *     VkShaderGroupShaderKHR                      groupShader);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The return value is the ray tracing pipeline stack size in bytes for the specified shader as called from the specified shader group.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code pipeline} <b>must</b> be a ray tracing pipeline</li>
     * <li>The value of {@code group} <b>must</b> be less than the number of shader groups in {@code pipeline}</li>
     * <li>The shader identified by {@code groupShader} in {@code group} <b>must</b> not be {@link #VK_SHADER_UNUSED_KHR SHADER_UNUSED_KHR}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pipeline} <b>must</b> be a valid {@code VkPipeline} handle</li>
     * <li>{@code groupShader} <b>must</b> be a valid {@code VkShaderGroupShaderKHR} value</li>
     * <li>{@code pipeline} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     *
     * @param device      the logical device containing the ray tracing pipeline.
     * @param pipeline    the ray tracing pipeline object containing the shaders groups.
     * @param group       the index of the shader group to query.
     * @param groupShader the type of shader from the group to query.
     */
    @NativeType("VkDeviceSize")
    public static long vkGetRayTracingShaderGroupStackSizeKHR(VkDevice device, @NativeType("VkPipeline") long pipeline, @NativeType("uint32_t") int group, @NativeType("VkShaderGroupShaderKHR") int groupShader) {
        long __functionAddress = device.getCapabilities().vkGetRayTracingShaderGroupStackSizeKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJJ(device.address(), pipeline, group, groupShader, __functionAddress);
    }

    // --- [ vkCmdSetRayTracingPipelineStackSizeKHR ] ---

    /**
     * Set the stack size dynamically for a ray tracing pipeline.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the stack size for a ray tracing pipeline, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetRayTracingPipelineStackSizeKHR(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    pipelineStackSize);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the stack size for subsequent ray tracing commands when the ray tracing pipeline is created with {@link #VK_DYNAMIC_STATE_RAY_TRACING_PIPELINE_STACK_SIZE_KHR DYNAMIC_STATE_RAY_TRACING_PIPELINE_STACK_SIZE_KHR} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, the stack size is computed as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#ray-tracing-pipeline-stack">Ray Tracing Pipeline Stack</a>.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code pipelineStackSize} <b>must</b> be large enough for any dynamic execution through the shaders in the ray tracing pipeline used by a subsequent trace call</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
     * <li>This command <b>must</b> only be called outside of a render pass instance</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Outside</td><td>Compute</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer     the command buffer into which the command will be recorded.
     * @param pipelineStackSize the stack size to use for subsequent ray tracing trace commands.
     */
    public static void vkCmdSetRayTracingPipelineStackSizeKHR(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int pipelineStackSize) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetRayTracingPipelineStackSizeKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), pipelineStackSize, __functionAddress);
    }

    /** Array version of: {@link #vkCreateRayTracingPipelinesKHR CreateRayTracingPipelinesKHR} */
    @NativeType("VkResult")
    public static int vkCreateRayTracingPipelinesKHR(VkDevice device, @NativeType("VkDeferredOperationKHR") long deferredOperation, @NativeType("VkPipelineCache") long pipelineCache, @NativeType("VkRayTracingPipelineCreateInfoKHR const *") VkRayTracingPipelineCreateInfoKHR.Buffer pCreateInfos, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkPipeline *") long[] pPipelines) {
        long __functionAddress = device.getCapabilities().vkCreateRayTracingPipelinesKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pPipelines, pCreateInfos.remaining());
            Struct.validate(pCreateInfos.address(), pCreateInfos.remaining(), VkRayTracingPipelineCreateInfoKHR.SIZEOF, VkRayTracingPipelineCreateInfoKHR::validate);
        }
        return callPJJPPPI(device.address(), deferredOperation, pipelineCache, pCreateInfos.remaining(), pCreateInfos.address(), memAddressSafe(pAllocator), pPipelines, __functionAddress);
    }

}