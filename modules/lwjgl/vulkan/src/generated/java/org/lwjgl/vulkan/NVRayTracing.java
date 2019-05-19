/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

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
 * <li>Acceleration structure objects and build commands</li>
 * <li>A new pipeline type with new shader domains</li>
 * <li>An indirection table to link shader groups with acceleration structure items</li>
 * </ul>
 * 
 * <p>This extension adds support for the following SPIR-V extension in Vulkan:</p>
 * 
 * <ul>
 * <li>{@code SPV_NV_ray_tracing}</li>
 * </ul>
 * 
 * <h5>Sample Code</h5>
 * 
 * <p>Example ray generation GLSL shader</p>
 * 
 * <pre><code>
 * #version 450 core
 * #extension GL_NV_ray_tracing : require
 * layout(set = 0, binding = 0, rgba8) uniform image2D image;
 * layout(set = 0, binding = 1) uniform accelerationStructureNV as;
 * layout(location = 0) rayPayloadNV float payload;
 * 
 * void main()
 * {
 *    vec4 col = vec4(0, 0, 0, 1);
 * 
 *    vec3 origin = vec3(float(gl_LaunchIDNV.x)/float(gl_LaunchSizeNV.x), float(gl_LaunchIDNV.y)/float(gl_LaunchSizeNV.y), 1.0);
 *    vec3 dir = vec3(0.0, 0.0, -1.0);
 * 
 *    traceNV(as, 0, 0xff, 0, 1, 0, origin, 0.0, dir, 1000.0, 0);
 * 
 *    col.y = payload;
 * 
 *    imageStore(image, ivec2(gl_LaunchIDNV.xy), col);
 * }</code></pre>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_NV_ray_tracing}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>166</dd>
 * <dt><b>Revision</b></dt>
 * <dd>3</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * <li>Requires {@link KHRGetMemoryRequirements2 VK_KHR_get_memory_requirements2}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Eric Werness <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_NV_ray_tracing:%20&amp;body=@ewerness%20">ewerness</a></li>
 * </ul></dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2018-11-20</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension requires the <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/NV/SPV_NV_ray_tracing.html">{@code SPV_NV_ray_tracing}</a> SPIR-V extension.</li>
 * <li>This extension requires the <a target="_blank" href="https://github.com/KhronosGroup/GLSL/blob/master/extensions/nv/GLSL_NV_ray_tracing.txt">{@code GL_NV_ray_tracing}</a> extension for GLSL source languages.</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Eric Werness, NVIDIA</li>
 * <li>Ashwin Lele, NVIDIA</li>
 * <li>Robert Stepinski, NVIDIA</li>
 * <li>Nuno Subtil, NVIDIA</li>
 * <li>Christoph Kubisch, NVIDIA</li>
 * <li>Martin Stich, NVIDIA</li>
 * <li>Daniel Koch, NVIDIA</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Joshua Barczak, Intel</li>
 * <li>Tobias Hector, AMD</li>
 * <li>Henrik Rydgard, NVIDIA</li>
 * <li>Pascal Gautron, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public class NVRayTracing {

    /** The extension specification version. */
    public static final int VK_NV_RAY_TRACING_SPEC_VERSION = 3;

    /** The extension name. */
    public static final String VK_NV_RAY_TRACING_EXTENSION_NAME = "VK_NV_ray_tracing";

    /** VK_SHADER_UNUSED_NV */
    public static final int VK_SHADER_UNUSED_NV = (~0);

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_NV STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_NV STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_GEOMETRY_NV STRUCTURE_TYPE_GEOMETRY_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_GEOMETRY_TRIANGLES_NV STRUCTURE_TYPE_GEOMETRY_TRIANGLES_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_GEOMETRY_AABB_NV STRUCTURE_TYPE_GEOMETRY_AABB_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_BIND_ACCELERATION_STRUCTURE_MEMORY_INFO_NV STRUCTURE_TYPE_BIND_ACCELERATION_STRUCTURE_MEMORY_INFO_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_ACCELERATION_STRUCTURE_NV STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_ACCELERATION_STRUCTURE_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_INFO_NV STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_INFO_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PROPERTIES_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_NV STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_INFO_NV STRUCTURE_TYPE_ACCELERATION_STRUCTURE_INFO_NV}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_NV                = 1000165000,
        VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_NV              = 1000165001,
        VK_STRUCTURE_TYPE_GEOMETRY_NV                                        = 1000165003,
        VK_STRUCTURE_TYPE_GEOMETRY_TRIANGLES_NV                              = 1000165004,
        VK_STRUCTURE_TYPE_GEOMETRY_AABB_NV                                   = 1000165005,
        VK_STRUCTURE_TYPE_BIND_ACCELERATION_STRUCTURE_MEMORY_INFO_NV         = 1000165006,
        VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_ACCELERATION_STRUCTURE_NV     = 1000165007,
        VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_INFO_NV = 1000165008,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PROPERTIES_NV          = 1000165009,
        VK_STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_NV            = 1000165011,
        VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_INFO_NV                     = 1000165012;

    /**
     * Extends {@code VkShaderStageFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_SHADER_STAGE_RAYGEN_BIT_NV SHADER_STAGE_RAYGEN_BIT_NV}</li>
     * <li>{@link #VK_SHADER_STAGE_ANY_HIT_BIT_NV SHADER_STAGE_ANY_HIT_BIT_NV}</li>
     * <li>{@link #VK_SHADER_STAGE_CLOSEST_HIT_BIT_NV SHADER_STAGE_CLOSEST_HIT_BIT_NV}</li>
     * <li>{@link #VK_SHADER_STAGE_MISS_BIT_NV SHADER_STAGE_MISS_BIT_NV}</li>
     * <li>{@link #VK_SHADER_STAGE_INTERSECTION_BIT_NV SHADER_STAGE_INTERSECTION_BIT_NV}</li>
     * <li>{@link #VK_SHADER_STAGE_CALLABLE_BIT_NV SHADER_STAGE_CALLABLE_BIT_NV}</li>
     * </ul>
     */
    public static final int
        VK_SHADER_STAGE_RAYGEN_BIT_NV       = 0x100,
        VK_SHADER_STAGE_ANY_HIT_BIT_NV      = 0x200,
        VK_SHADER_STAGE_CLOSEST_HIT_BIT_NV  = 0x400,
        VK_SHADER_STAGE_MISS_BIT_NV         = 0x800,
        VK_SHADER_STAGE_INTERSECTION_BIT_NV = 0x1000,
        VK_SHADER_STAGE_CALLABLE_BIT_NV     = 0x2000;

    /**
     * Extends {@code VkPipelineStageFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_PIPELINE_STAGE_RAY_TRACING_SHADER_BIT_NV PIPELINE_STAGE_RAY_TRACING_SHADER_BIT_NV}</li>
     * <li>{@link #VK_PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_NV PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_NV}</li>
     * </ul>
     */
    public static final int
        VK_PIPELINE_STAGE_RAY_TRACING_SHADER_BIT_NV           = 0x200000,
        VK_PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_NV = 0x2000000;

    /** Extends {@code VkBufferUsageFlagBits}. */
    public static final int VK_BUFFER_USAGE_RAY_TRACING_BIT_NV = 0x400;

    /** Extends {@code VkPipelineBindPoint}. */
    public static final int VK_PIPELINE_BIND_POINT_RAY_TRACING_NV = 1000165000;

    /** Extends {@code VkDescriptorType}. */
    public static final int VK_DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_NV = 1000165000;

    /**
     * Extends {@code VkAccessFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_ACCESS_ACCELERATION_STRUCTURE_READ_BIT_NV ACCESS_ACCELERATION_STRUCTURE_READ_BIT_NV}</li>
     * <li>{@link #VK_ACCESS_ACCELERATION_STRUCTURE_WRITE_BIT_NV ACCESS_ACCELERATION_STRUCTURE_WRITE_BIT_NV}</li>
     * </ul>
     */
    public static final int
        VK_ACCESS_ACCELERATION_STRUCTURE_READ_BIT_NV  = 0x200000,
        VK_ACCESS_ACCELERATION_STRUCTURE_WRITE_BIT_NV = 0x400000;

    /** Extends {@code VkQueryType}. */
    public static final int VK_QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_NV = 1000165000;

    /** Extends {@code VkPipelineCreateFlagBits}. */
    public static final int VK_PIPELINE_CREATE_DEFER_COMPILE_BIT_NV = 0x20;

    /** Extends {@code VkObjectType}. */
    public static final int VK_OBJECT_TYPE_ACCELERATION_STRUCTURE_NV = 1000165000;

    /** Extends {@code VkDebugReportObjectTypeEXT}. */
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_ACCELERATION_STRUCTURE_NV_EXT = 1000165000;

    /** Extends {@code VkIndexType}. */
    public static final int VK_INDEX_TYPE_NONE_NV = 1000165000;

    /**
     * VkRayTracingShaderGroupTypeNV - Shader group types
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_RAY_TRACING_SHADER_GROUP_TYPE_GENERAL_NV RAY_TRACING_SHADER_GROUP_TYPE_GENERAL_NV} indicates a shader group with a single {@link #VK_SHADER_STAGE_RAYGEN_BIT_NV SHADER_STAGE_RAYGEN_BIT_NV}, {@link #VK_SHADER_STAGE_MISS_BIT_NV SHADER_STAGE_MISS_BIT_NV}, or {@link #VK_SHADER_STAGE_CALLABLE_BIT_NV SHADER_STAGE_CALLABLE_BIT_NV} shader in it.</li>
     * <li>{@link #VK_RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_NV RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_NV} specifies a shader group that only hits triangles and <b>must</b> not contain an intersection shader, only closest hit and any-hit.</li>
     * <li>{@link #VK_RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_NV RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_NV} specifies a shader group that only intersects with custom geometry and <b>must</b> contain an intersection shader and <b>may</b> contain closest hit and any-hit shaders.</li>
     * </ul>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>For current group types, the hit group type could be inferred from the presence or absence of the intersection shader, but we provide the type explicitly for future hit groups that do not have that property.</p>
     * </div>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkRayTracingShaderGroupCreateInfoNV}</p>
     */
    public static final int
        VK_RAY_TRACING_SHADER_GROUP_TYPE_GENERAL_NV              = 0,
        VK_RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_NV  = 1,
        VK_RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_NV = 2;

    /**
     * VkGeometryTypeNV - Enum specifying which type of geometry is provided
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_GEOMETRY_TYPE_TRIANGLES_NV GEOMETRY_TYPE_TRIANGLES_NV} indicates that the {@code triangles} of {@link VkGeometryDataNV} contains valid data.</li>
     * <li>{@link #VK_GEOMETRY_TYPE_AABBS_NV GEOMETRY_TYPE_AABBS_NV} indicates that the {@code aabbs} of {@link VkGeometryDataNV} contains valid data.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkGeometryNV}</p>
     */
    public static final int
        VK_GEOMETRY_TYPE_TRIANGLES_NV = 0,
        VK_GEOMETRY_TYPE_AABBS_NV     = 1;

    /**
     * VkGeometryFlagBitsNV - Bitmask specifying additional parameters for a geometry
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_GEOMETRY_OPAQUE_BIT_NV GEOMETRY_OPAQUE_BIT_NV} indicates that this geometry does not invoke the any-hit shaders even if present in a hit group.</li>
     * <li>{@link #VK_GEOMETRY_NO_DUPLICATE_ANY_HIT_INVOCATION_BIT_NV GEOMETRY_NO_DUPLICATE_ANY_HIT_INVOCATION_BIT_NV} indicates that the implementation <b>must</b> only call the any-hit shader a single time for each primitive in this geometry. If this bit is absent an implementation <b>may</b> invoke the any-hit shader more than once for this geometry.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@code VkGeometryFlagsNV}</p>
     */
    public static final int
        VK_GEOMETRY_OPAQUE_BIT_NV                          = 0x1,
        VK_GEOMETRY_NO_DUPLICATE_ANY_HIT_INVOCATION_BIT_NV = 0x2;

    /**
     * VkGeometryInstanceFlagBitsNV - Instance flag bits
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_GEOMETRY_INSTANCE_TRIANGLE_CULL_DISABLE_BIT_NV GEOMETRY_INSTANCE_TRIANGLE_CULL_DISABLE_BIT_NV} disables face culling for this instance.</li>
     * <li>{@link #VK_GEOMETRY_INSTANCE_TRIANGLE_FRONT_COUNTERCLOCKWISE_BIT_NV GEOMETRY_INSTANCE_TRIANGLE_FRONT_COUNTERCLOCKWISE_BIT_NV} indicates that the front face of the triangle for culling purposes is the face that is counter clockwise in object space relative to the ray origin. Because the facing is determined in object space, an instance transform matrix does not change the winding, but a geometry transform does.</li>
     * <li>{@link #VK_GEOMETRY_INSTANCE_FORCE_OPAQUE_BIT_NV GEOMETRY_INSTANCE_FORCE_OPAQUE_BIT_NV} causes this instance to act as though {@link #VK_GEOMETRY_OPAQUE_BIT_NV GEOMETRY_OPAQUE_BIT_NV} were specified on all geometries referenced by this instance. This behavior <b>can</b> be overridden by the ray flag {@code gl_RayFlagsNoOpaqueNV}.</li>
     * <li>{@link #VK_GEOMETRY_INSTANCE_FORCE_NO_OPAQUE_BIT_NV GEOMETRY_INSTANCE_FORCE_NO_OPAQUE_BIT_NV} causes this instance to act as though {@link #VK_GEOMETRY_OPAQUE_BIT_NV GEOMETRY_OPAQUE_BIT_NV} were not specified on all geometries referenced by this instance. This behavior <b>can</b> be overridden by the ray flag {@code gl_RayFlagsOpaqueNV}.</li>
     * </ul>
     * 
     * <p>{@link #VK_GEOMETRY_INSTANCE_FORCE_NO_OPAQUE_BIT_NV GEOMETRY_INSTANCE_FORCE_NO_OPAQUE_BIT_NV} and {@link #VK_GEOMETRY_INSTANCE_FORCE_OPAQUE_BIT_NV GEOMETRY_INSTANCE_FORCE_OPAQUE_BIT_NV} <b>must</b> not be used in the same flag.</p>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@code VkGeometryInstanceFlagsNV}</p>
     */
    public static final int
        VK_GEOMETRY_INSTANCE_TRIANGLE_CULL_DISABLE_BIT_NV           = 0x1,
        VK_GEOMETRY_INSTANCE_TRIANGLE_FRONT_COUNTERCLOCKWISE_BIT_NV = 0x2,
        VK_GEOMETRY_INSTANCE_FORCE_OPAQUE_BIT_NV                    = 0x4,
        VK_GEOMETRY_INSTANCE_FORCE_NO_OPAQUE_BIT_NV                 = 0x8;

    /**
     * VkAccelerationStructureTypeNV - Type of acceleration structure
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_NV ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_NV} is a top-level acceleration structure containing instance data referring to bottom-level level acceleration structures.</li>
     * <li>{@link #VK_ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_NV ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_NV} is a bottom-level acceleration structure containing the AABBs or geometry to be intersected.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAccelerationStructureInfoNV}</p>
     */
    public static final int
        VK_ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_NV    = 0,
        VK_ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_NV = 1;

    /**
     * VkBuildAccelerationStructureFlagBitsNV - Bitmask specifying additional parameters for acceleration structure builds
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_UPDATE_BIT_NV BUILD_ACCELERATION_STRUCTURE_ALLOW_UPDATE_BIT_NV} indicates that the specified acceleration structure <b>can</b> be updated with {@code update} of {@link VK10#VK_TRUE TRUE} in {@link #vkCmdBuildAccelerationStructureNV CmdBuildAccelerationStructureNV}.</li>
     * <li>{@link #VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_NV BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_NV} indicates that the specified acceleration structure <b>can</b> act as the source for {@link #vkCmdCopyAccelerationStructureNV CmdCopyAccelerationStructureNV} with {@code mode} of {@link #VK_COPY_ACCELERATION_STRUCTURE_MODE_COMPACT_NV COPY_ACCELERATION_STRUCTURE_MODE_COMPACT_NV} to produce a compacted acceleration structure.</li>
     * <li>{@link #VK_BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_TRACE_BIT_NV BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_TRACE_BIT_NV} indicates that the given acceleration structure build <b>should</b> prioritize trace performance over build time.</li>
     * <li>{@link #VK_BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_BUILD_BIT_NV BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_BUILD_BIT_NV} indicates that the given acceleration structure build <b>should</b> prioritize build time over trace performance.</li>
     * <li>{@link #VK_BUILD_ACCELERATION_STRUCTURE_LOW_MEMORY_BIT_NV BUILD_ACCELERATION_STRUCTURE_LOW_MEMORY_BIT_NV} indicates that this acceleration structure <b>should</b> minimize the size of the scratch memory and the final result build, potentially at the expense of build time or trace performance.</li>
     * </ul>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>{@link #VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_UPDATE_BIT_NV BUILD_ACCELERATION_STRUCTURE_ALLOW_UPDATE_BIT_NV} and {@link #VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_NV BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_NV} <b>may</b> take more time and memory than a normal build, and so <b>should</b> only be used when those features are used.</p>
     * </div>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@code VkBuildAccelerationStructureFlagsNV}</p>
     */
    public static final int
        VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_UPDATE_BIT_NV      = 0x1,
        VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_NV  = 0x2,
        VK_BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_TRACE_BIT_NV = 0x4,
        VK_BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_BUILD_BIT_NV = 0x8,
        VK_BUILD_ACCELERATION_STRUCTURE_LOW_MEMORY_BIT_NV        = 0x10;

    /**
     * VkCopyAccelerationStructureModeNV - Acceleration structure copy mode
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_COPY_ACCELERATION_STRUCTURE_MODE_CLONE_NV COPY_ACCELERATION_STRUCTURE_MODE_CLONE_NV} creates a direct copy of the acceleration structure specified in {@code src} into the one specified by {@code dst}. The {@code dst} acceleration structure <b>must</b> have been created with the same parameters as {@code src}.</li>
     * <li>{@link #VK_COPY_ACCELERATION_STRUCTURE_MODE_COMPACT_NV COPY_ACCELERATION_STRUCTURE_MODE_COMPACT_NV} creates a more compact version of an acceleration structure {@code src} into {@code dst}. The acceleration structure {@code dst} <b>must</b> have been created with a {@code compactedSize} corresponding to the one returned by {@link #vkCmdWriteAccelerationStructuresPropertiesNV CmdWriteAccelerationStructuresPropertiesNV} after the build of the acceleration structure specified by {@code src}.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #vkCmdCopyAccelerationStructureNV CmdCopyAccelerationStructureNV}</p>
     */
    public static final int
        VK_COPY_ACCELERATION_STRUCTURE_MODE_CLONE_NV   = 0,
        VK_COPY_ACCELERATION_STRUCTURE_MODE_COMPACT_NV = 1;

    /**
     * VkAccelerationStructureMemoryRequirementsTypeNV - Acceleration structure memory requirement type
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_OBJECT_NV ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_OBJECT_NV} requests the memory requirement for the {@code VkAccelerationStructureNV} backing store.</li>
     * <li>{@link #VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_BUILD_SCRATCH_NV ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_BUILD_SCRATCH_NV} requests the memory requirement for scratch space during the initial build.</li>
     * <li>{@link #VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_UPDATE_SCRATCH_NV ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_UPDATE_SCRATCH_NV} requests the memory requirement for scratch space during an update.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAccelerationStructureMemoryRequirementsInfoNV}</p>
     */
    public static final int
        VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_OBJECT_NV         = 0,
        VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_BUILD_SCRATCH_NV  = 1,
        VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_UPDATE_SCRATCH_NV = 2;

    protected NVRayTracing() {
        throw new UnsupportedOperationException();
    }

    static boolean checkCapsDevice(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("VK_NV_ray_tracing") && VK.checkExtension("VK_NV_ray_tracing",
               VK.isSupported(provider, "vkCreateAccelerationStructureNV", caps)
            && VK.isSupported(provider, "vkDestroyAccelerationStructureNV", caps)
            && VK.isSupported(provider, "vkGetAccelerationStructureMemoryRequirementsNV", caps)
            && VK.isSupported(provider, "vkBindAccelerationStructureMemoryNV", caps)
            && VK.isSupported(provider, "vkCmdBuildAccelerationStructureNV", caps)
            && VK.isSupported(provider, "vkCmdCopyAccelerationStructureNV", caps)
            && VK.isSupported(provider, "vkCmdTraceRaysNV", caps)
            && VK.isSupported(provider, "vkCreateRayTracingPipelinesNV", caps)
            && VK.isSupported(provider, "vkGetRayTracingShaderGroupHandlesNV", caps)
            && VK.isSupported(provider, "vkGetAccelerationStructureHandleNV", caps)
            && VK.isSupported(provider, "vkCmdWriteAccelerationStructuresPropertiesNV", caps)
            && VK.isSupported(provider, "vkCompileDeferredNV", caps)
        );
    }

    // --- [ vkCreateAccelerationStructureNV ] ---

    /** Unsafe version of: {@link #vkCreateAccelerationStructureNV CreateAccelerationStructureNV} */
    public static int nvkCreateAccelerationStructureNV(VkDevice device, long pCreateInfo, long pAllocator, long pAccelerationStructure) {
        long __functionAddress = device.getCapabilities().vkCreateAccelerationStructureNV;
        if (CHECKS) {
            check(__functionAddress);
            VkAccelerationStructureCreateInfoNV.validate(pCreateInfo);
            if (pAllocator != NULL) { VkAllocationCallbacks.validate(pAllocator); }
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pAccelerationStructure, __functionAddress);
    }

    /**
     * Create a new acceleration structure object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To create acceleration structures, call:</p>
     * 
     * <pre><code>
     * VkResult vkCreateAccelerationStructureNV(
     *     VkDevice                                    device,
     *     const VkAccelerationStructureCreateInfoNV*  pCreateInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkAccelerationStructureNV*                  pAccelerationStructure);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Similar to other objects in Vulkan, the acceleration structure creation merely creates an object with a specific "{@code shape}" as specified by the information in {@link VkAccelerationStructureInfoNV} and {@code compactedSize} in {@code pCreateInfo}. Populating the data in the object after allocating and binding memory is done with {@link #vkCmdBuildAccelerationStructureNV CmdBuildAccelerationStructureNV} and {@link #vkCmdCopyAccelerationStructureNV CmdCopyAccelerationStructureNV}.</p>
     * 
     * <p>Acceleration structure creation uses the count and type information from the geometries, but does not use the data references in the structures.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid {@link VkAccelerationStructureCreateInfoNV} structure</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code pAccelerationStructure} <b>must</b> be a valid pointer to a {@code VkAccelerationStructureNV} handle</li>
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
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAccelerationStructureCreateInfoNV}, {@link VkAllocationCallbacks}</p>
     *
     * @param device                 the logical device that creates the buffer object.
     * @param pCreateInfo            a pointer to an instance of the {@link VkAccelerationStructureCreateInfoNV} structure containing parameters affecting creation of the acceleration structure.
     * @param pAllocator             controls host memory allocation as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     * @param pAccelerationStructure points to a {@code VkAccelerationStructureNV} handle in which the resulting acceleration structure object is returned.
     */
    @NativeType("VkResult")
    public static int vkCreateAccelerationStructureNV(VkDevice device, @NativeType("VkAccelerationStructureCreateInfoNV const *") VkAccelerationStructureCreateInfoNV pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkAccelerationStructureNV *") LongBuffer pAccelerationStructure) {
        if (CHECKS) {
            check(pAccelerationStructure, 1);
        }
        return nvkCreateAccelerationStructureNV(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pAccelerationStructure));
    }

    // --- [ vkDestroyAccelerationStructureNV ] ---

    /** Unsafe version of: {@link #vkDestroyAccelerationStructureNV DestroyAccelerationStructureNV} */
    public static void nvkDestroyAccelerationStructureNV(VkDevice device, long accelerationStructure, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyAccelerationStructureNV;
        if (CHECKS) {
            check(__functionAddress);
            if (pAllocator != NULL) { VkAllocationCallbacks.validate(pAllocator); }
        }
        callPJPV(device.address(), accelerationStructure, pAllocator, __functionAddress);
    }

    /**
     * Destroy an acceleration structure object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To destroy an acceleration structure, call:</p>
     * 
     * <pre><code>
     * void vkDestroyAccelerationStructureNV(
     *     VkDevice                                    device,
     *     VkAccelerationStructureNV                   accelerationStructure,
     *     const VkAllocationCallbacks*                pAllocator);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>All submitted commands that refer to {@code accelerationStructure} <b>must</b> have completed execution</li>
     * <li>If {@link VkAllocationCallbacks} were provided when {@code accelerationStructure} was created, a compatible set of callbacks <b>must</b> be provided here</li>
     * <li>If no {@link VkAllocationCallbacks} were provided when {@code accelerationStructure} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code accelerationStructure} <b>must</b> be a valid {@code VkAccelerationStructureNV} handle</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code accelerationStructure} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}</p>
     *
     * @param device                the logical device that destroys the buffer.
     * @param accelerationStructure the acceleration structure to destroy.
     * @param pAllocator            controls host memory allocation as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     */
    public static void vkDestroyAccelerationStructureNV(VkDevice device, @NativeType("VkAccelerationStructureNV") long accelerationStructure, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyAccelerationStructureNV(device, accelerationStructure, memAddressSafe(pAllocator));
    }

    // --- [ vkGetAccelerationStructureMemoryRequirementsNV ] ---

    /** Unsafe version of: {@link #vkGetAccelerationStructureMemoryRequirementsNV GetAccelerationStructureMemoryRequirementsNV} */
    public static void nvkGetAccelerationStructureMemoryRequirementsNV(VkDevice device, long pInfo, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetAccelerationStructureMemoryRequirementsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(device.address(), pInfo, pMemoryRequirements, __functionAddress);
    }

    /**
     * Get acceleration structure memory requirements.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>An acceleration structure has memory requirements for the structure object itself, scratch space for the build, and scratch space for the update.</p>
     * 
     * <p>To query the memory requirements call:</p>
     * 
     * <pre><code>
     * void vkGetAccelerationStructureMemoryRequirementsNV(
     *     VkDevice                                    device,
     *     const VkAccelerationStructureMemoryRequirementsInfoNV* pInfo,
     *     VkMemoryRequirements2KHR*                   pMemoryRequirements);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pInfo} <b>must</b> be a valid pointer to a valid {@link VkAccelerationStructureMemoryRequirementsInfoNV} structure</li>
     * <li>{@code pMemoryRequirements} <b>must</b> be a valid pointer to a {@link VkMemoryRequirements2KHR} structure</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAccelerationStructureMemoryRequirementsInfoNV}, {@link VkMemoryRequirements2KHR}</p>
     *
     * @param device              the logical device on which the acceleration structure was created.
     * @param pInfo               specifies the acceleration structure to get memory requirements for.
     * @param pMemoryRequirements returns the requested acceleration structure memory requirements.
     */
    public static void vkGetAccelerationStructureMemoryRequirementsNV(VkDevice device, @NativeType("VkAccelerationStructureMemoryRequirementsInfoNV const *") VkAccelerationStructureMemoryRequirementsInfoNV pInfo, @NativeType("VkMemoryRequirements2KHR *") VkMemoryRequirements2KHR pMemoryRequirements) {
        nvkGetAccelerationStructureMemoryRequirementsNV(device, pInfo.address(), pMemoryRequirements.address());
    }

    // --- [ vkBindAccelerationStructureMemoryNV ] ---

    /**
     * Unsafe version of: {@link #vkBindAccelerationStructureMemoryNV BindAccelerationStructureMemoryNV}
     *
     * @param bindInfoCount the number of elements in {@code pBindInfos}.
     */
    public static int nvkBindAccelerationStructureMemoryNV(VkDevice device, int bindInfoCount, long pBindInfos) {
        long __functionAddress = device.getCapabilities().vkBindAccelerationStructureMemoryNV;
        if (CHECKS) {
            check(__functionAddress);
            VkBindAccelerationStructureMemoryInfoNV.validate(pBindInfos, bindInfoCount);
        }
        return callPPI(device.address(), bindInfoCount, pBindInfos, __functionAddress);
    }

    /**
     * Bind acceleration structure memory.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To attach memory to one or more acceleration structures at a time, call:</p>
     * 
     * <pre><code>
     * VkResult vkBindAccelerationStructureMemoryNV(
     *     VkDevice                                    device,
     *     uint32_t                                    bindInfoCount,
     *     const VkBindAccelerationStructureMemoryInfoNV* pBindInfos);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pBindInfos} <b>must</b> be a valid pointer to an array of {@code bindInfoCount} valid {@link VkBindAccelerationStructureMemoryInfoNV} structures</li>
     * <li>{@code bindInfoCount} <b>must</b> be greater than 0</li>
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
     * <h5>See Also</h5>
     * 
     * <p>{@link VkBindAccelerationStructureMemoryInfoNV}</p>
     *
     * @param device     the logical device that owns the acceleration structures and memory.
     * @param pBindInfos a pointer to an array of structures of type {@link VkBindAccelerationStructureMemoryInfoNV}, describing images and memory to bind.
     */
    @NativeType("VkResult")
    public static int vkBindAccelerationStructureMemoryNV(VkDevice device, @NativeType("VkBindAccelerationStructureMemoryInfoNV const *") VkBindAccelerationStructureMemoryInfoNV.Buffer pBindInfos) {
        return nvkBindAccelerationStructureMemoryNV(device, pBindInfos.remaining(), pBindInfos.address());
    }

    // --- [ vkCmdBuildAccelerationStructureNV ] ---

    /** Unsafe version of: {@link #vkCmdBuildAccelerationStructureNV CmdBuildAccelerationStructureNV} */
    public static void nvkCmdBuildAccelerationStructureNV(VkCommandBuffer commandBuffer, long pInfo, long instanceData, long instanceOffset, int update, long dst, long src, long scratch, long scratchOffset) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBuildAccelerationStructureNV;
        if (CHECKS) {
            check(__functionAddress);
            VkAccelerationStructureInfoNV.validate(pInfo);
        }
        callPPJJJJJJV(commandBuffer.address(), pInfo, instanceData, instanceOffset, update, dst, src, scratch, scratchOffset, __functionAddress);
    }

    /**
     * Build an acceleration structure.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To build an acceleration structure call:</p>
     * 
     * <pre><code>
     * void vkCmdBuildAccelerationStructureNV(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkAccelerationStructureInfoNV*        pInfo,
     *     VkBuffer                                    instanceData,
     *     VkDeviceSize                                instanceOffset,
     *     VkBool32                                    update,
     *     VkAccelerationStructureNV                   dst,
     *     VkAccelerationStructureNV                   src,
     *     VkBuffer                                    scratch,
     *     VkDeviceSize                                scratchOffset);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code geometryCount} <b>must</b> be less than or equal to {@link VkPhysicalDeviceRayTracingPropertiesNV}{@code ::maxGeometryCount}</li>
     * <li>{@code dst} <b>must</b> have been created with compatible {@link VkAccelerationStructureInfoNV} where {@link VkAccelerationStructureInfoNV}{@code ::type} and {@link VkAccelerationStructureInfoNV}{@code ::flags} are identical, {@link VkAccelerationStructureInfoNV}{@code ::instanceCount} and {@link VkAccelerationStructureInfoNV}{@code ::geometryCount} for {@code dst} are greater than or equal to the build size and each geometry in {@link VkAccelerationStructureInfoNV}{@code ::pGeometries} for {@code dst} has greater than or equal to the number of vertices, indices, and AABBs.</li>
     * <li>If {@code update} is {@link VK10#VK_TRUE TRUE}, {@code src} <b>must</b> not be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
     * <li>If {@code update} is {@link VK10#VK_TRUE TRUE}, {@code src} <b>must</b> have been built before with {@link #VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_UPDATE_BIT_NV BUILD_ACCELERATION_STRUCTURE_ALLOW_UPDATE_BIT_NV} set in {@link VkAccelerationStructureInfoNV}{@code ::flags}</li>
     * <li>If {@code update} is {@link VK10#VK_FALSE FALSE}, The {@code size} member of the {@link VkMemoryRequirements} structure returned from a call to {@link #vkGetAccelerationStructureMemoryRequirementsNV GetAccelerationStructureMemoryRequirementsNV} with {@link VkAccelerationStructureMemoryRequirementsInfoNV}{@code ::accelerationStructure} set to {@code dst} and {@link VkAccelerationStructureMemoryRequirementsInfoNV}{@code ::type} set to {@link #VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_BUILD_SCRATCH_NV ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_BUILD_SCRATCH_NV} <b>must</b> be less than or equal to the size of {@code scratch} minus {@code scratchOffset}</li>
     * <li>If {@code update} is {@link VK10#VK_TRUE TRUE}, The {@code size} member of the {@link VkMemoryRequirements} structure returned from a call to {@link #vkGetAccelerationStructureMemoryRequirementsNV GetAccelerationStructureMemoryRequirementsNV} with {@link VkAccelerationStructureMemoryRequirementsInfoNV}{@code ::accelerationStructure} set to {@code dst} and {@link VkAccelerationStructureMemoryRequirementsInfoNV}{@code ::type} set to {@link #VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_UPDATE_SCRATCH_NV ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_UPDATE_SCRATCH_NV} <b>must</b> be less than or equal to the size of {@code scratch} minus {@code scratchOffset}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pInfo} <b>must</b> be a valid pointer to a valid {@link VkAccelerationStructureInfoNV} structure</li>
     * <li>If {@code instanceData} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code instanceData} <b>must</b> be a valid {@code VkBuffer} handle</li>
     * <li>{@code dst} <b>must</b> be a valid {@code VkAccelerationStructureNV} handle</li>
     * <li>If {@code src} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code src} <b>must</b> be a valid {@code VkAccelerationStructureNV} handle</li>
     * <li>{@code scratch} <b>must</b> be a valid {@code VkBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
     * <li>Each of {@code commandBuffer}, {@code dst}, {@code instanceData}, {@code scratch}, and {@code src} that are valid handles <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Command Properties</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Compute</td><td></td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAccelerationStructureInfoNV}</p>
     *
     * @param commandBuffer  the command buffer into which the command will be recorded.
     * @param pInfo          contains the shared information for the acceleration structure&#8217;s structure.
     * @param instanceData   the buffer containing instance data that will be used to build the acceleration structure as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#acceleration-structure-instance">Accelerator structure instances.</a> This parameter <b>must</b> be {@code NULL} for bottom level acceleration structures.
     * @param instanceOffset the offset in bytes (relative to the start of {@code instanceData}) at which the instance data is located.
     * @param update         specifies whether to update the {@code dst} acceleration structure with the data in {@code src}.
     * @param dst            points to the target acceleration structure for the build.
     * @param src            points to an existing acceleration structure that is to be used to update the {@code dst} acceleration structure.
     * @param scratch        the {@code VkBuffer} that will be used as scratch memory for the build.
     * @param scratchOffset  the offset in bytes relative to the start of {@code scratch} that will be used as a scratch memory.
     */
    public static void vkCmdBuildAccelerationStructureNV(VkCommandBuffer commandBuffer, @NativeType("VkAccelerationStructureInfoNV const *") VkAccelerationStructureInfoNV pInfo, @NativeType("VkBuffer") long instanceData, @NativeType("VkDeviceSize") long instanceOffset, @NativeType("VkBool32") boolean update, @NativeType("VkAccelerationStructureNV") long dst, @NativeType("VkAccelerationStructureNV") long src, @NativeType("VkBuffer") long scratch, @NativeType("VkDeviceSize") long scratchOffset) {
        nvkCmdBuildAccelerationStructureNV(commandBuffer, pInfo.address(), instanceData, instanceOffset, update ? 1 : 0, dst, src, scratch, scratchOffset);
    }

    // --- [ vkCmdCopyAccelerationStructureNV ] ---

    /**
     * Copy an acceleration structure.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To copy an acceleration structure call:</p>
     * 
     * <pre><code>
     * void vkCmdCopyAccelerationStructureNV(
     *     VkCommandBuffer                             commandBuffer,
     *     VkAccelerationStructureNV                   dst,
     *     VkAccelerationStructureNV                   src,
     *     VkCopyAccelerationStructureModeNV           mode);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code mode} <b>must</b> be {@link #VK_COPY_ACCELERATION_STRUCTURE_MODE_COMPACT_NV COPY_ACCELERATION_STRUCTURE_MODE_COMPACT_NV} or {@link #VK_COPY_ACCELERATION_STRUCTURE_MODE_CLONE_NV COPY_ACCELERATION_STRUCTURE_MODE_CLONE_NV}</li>
     * <li>{@code src} <b>must</b> have been built with {@link #VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_NV BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_NV} if {@code mode} is {@link #VK_COPY_ACCELERATION_STRUCTURE_MODE_COMPACT_NV COPY_ACCELERATION_STRUCTURE_MODE_COMPACT_NV}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code dst} <b>must</b> be a valid {@code VkAccelerationStructureNV} handle</li>
     * <li>{@code src} <b>must</b> be a valid {@code VkAccelerationStructureNV} handle</li>
     * <li>{@code mode} <b>must</b> be a valid {@code VkCopyAccelerationStructureModeNV} value</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
     * <li>Each of {@code commandBuffer}, {@code dst}, and {@code src} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Command Properties</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Compute</td><td></td></tr></tbody>
     * </table>
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param dst           points to the target acceleration structure for the copy.
     * @param src           points to the source acceleration structure for the copy.
     * @param mode          a {@code VkCopyAccelerationStructureModeNV} value that specifies additional operations to perform during the copy.
     */
    public static void vkCmdCopyAccelerationStructureNV(VkCommandBuffer commandBuffer, @NativeType("VkAccelerationStructureNV") long dst, @NativeType("VkAccelerationStructureNV") long src, @NativeType("VkCopyAccelerationStructureModeNV") int mode) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyAccelerationStructureNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJV(commandBuffer.address(), dst, src, mode, __functionAddress);
    }

    // --- [ vkCmdTraceRaysNV ] ---

    /**
     * Initialize a ray tracing dispatch.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To dispatch a ray tracing call use:</p>
     * 
     * <pre><code>
     * void vkCmdTraceRaysNV(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBuffer                                    raygenShaderBindingTableBuffer,
     *     VkDeviceSize                                raygenShaderBindingOffset,
     *     VkBuffer                                    missShaderBindingTableBuffer,
     *     VkDeviceSize                                missShaderBindingOffset,
     *     VkDeviceSize                                missShaderBindingStride,
     *     VkBuffer                                    hitShaderBindingTableBuffer,
     *     VkDeviceSize                                hitShaderBindingOffset,
     *     VkDeviceSize                                hitShaderBindingStride,
     *     VkBuffer                                    callableShaderBindingTableBuffer,
     *     VkDeviceSize                                callableShaderBindingOffset,
     *     VkDeviceSize                                callableShaderBindingStride,
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
     * <li>If a {@code VkImageView} is sampled with {@link VK10#VK_FILTER_LINEAR FILTER_LINEAR} as a result of this command, then the image view&#8217;s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT}</li>
     * <li>If a {@code VkImageView} is accessed using atomic operations as a result of this command, then the image view&#8217;s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT}</li>
     * <li>If a {@code VkImageView} is sampled with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT} as a result of this command, then the image view&#8217;s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link EXTFilterCubic#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT}</li>
     * <li>Any {@code VkImageView} being sampled with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT} as a result of this command <b>must</b> have a {@code VkImageViewType} and format that supports cubic filtering, as specified by {@link VkFilterCubicImageViewImageFormatPropertiesEXT}{@code ::filterCubic} returned by {@code vkGetPhysicalDeviceImageFormatProperties2}</li>
     * <li>Any {@code VkImageView} being sampled with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT} with a reduction mode of either {@link EXTSamplerFilterMinmax#VK_SAMPLER_REDUCTION_MODE_MIN_EXT SAMPLER_REDUCTION_MODE_MIN_EXT} or {@link EXTSamplerFilterMinmax#VK_SAMPLER_REDUCTION_MODE_MAX_EXT SAMPLER_REDUCTION_MODE_MAX_EXT} as a result of this command <b>must</b> have a {@code VkImageViewType} and format that supports cubic filtering together with minmax filtering, as specified by {@link VkFilterCubicImageViewImageFormatPropertiesEXT}{@code ::filterCubicMinmax} returned by {@code vkGetPhysicalDeviceImageFormatProperties2}</li>
     * <li>Any {@code VkImage} created with a {@link VkImageCreateInfo}{@code ::flags} containing {@link NVCornerSampledImage#VK_IMAGE_CREATE_CORNER_SAMPLED_BIT_NV IMAGE_CREATE_CORNER_SAMPLED_BIT_NV} sampled as a result of this command <b>must</b> only be sampled using a {@code VkSamplerAddressMode} of {@link VK10#VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE}.</li>
     * <li>For each set <em>n</em> that is statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command, a descriptor set <b>must</b> have been bound to <em>n</em> at the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for set <em>n</em>, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
     * <li>For each push constant that is statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command, a push constant value <b>must</b> have been set for the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for push constants, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
     * <li>Descriptors in each bound descriptor set, specified via {@code vkCmdBindDescriptorSets}, <b>must</b> be valid if they are statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command</li>
     * <li>A valid pipeline <b>must</b> be bound to the pipeline bind point used by this command</li>
     * <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command requires any dynamic state, that state <b>must</b> have been set for {@code commandBuffer}</li>
     * <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used to sample from any {@code VkImage} with a {@code VkImageView} of the type {@link VK10#VK_IMAGE_VIEW_TYPE_3D IMAGE_VIEW_TYPE_3D}, {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE}, {@link VK10#VK_IMAGE_VIEW_TYPE_1D_ARRAY IMAGE_VIEW_TYPE_1D_ARRAY}, {@link VK10#VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY} or {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}, in any shader stage</li>
     * <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with {@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage</li>
     * <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that includes a LOD bias or any offset values, in any shader stage</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#features-robustBufferAccess">robust buffer access</a> feature is not enabled, and if the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a uniform buffer, it <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#features-robustBufferAccess">robust buffer access</a> feature is not enabled, and if the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a storage buffer, it <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
     * <li>If {@code commandBuffer} is an unprotected command buffer, any resource accessed by the {@code VkPipeline} object bound to the pipeline bind point used by this command <b>must</b> not be a protected resource</li>
     * <li>If {@code commandBuffer} is a protected command buffer, any resource written to by the {@code VkPipeline} object bound to the pipeline bind point used by this command <b>must</b> not be an unprotected resource</li>
     * <li>If {@code commandBuffer} is a protected command buffer, pipeline stages other than the framebuffer-space and compute stages in the {@code VkPipeline} object bound to the pipeline bind point <b>must</b> not write to any resource</li>
     * <li>{@code raygenShaderBindingOffset} <b>must</b> be less than the size of {@code raygenShaderBindingTableBuffer}</li>
     * <li>{@code raygenShaderBindingOffset} <b>must</b> be a multiple of {@link VkPhysicalDeviceRayTracingPropertiesNV}{@code ::shaderGroupBaseAlignment}</li>
     * <li>{@code missShaderBindingOffset} <b>must</b> be less than the size of {@code missShaderBindingTableBuffer}</li>
     * <li>{@code missShaderBindingOffset} <b>must</b> be a multiple of {@link VkPhysicalDeviceRayTracingPropertiesNV}{@code ::shaderGroupBaseAlignment}</li>
     * <li>{@code hitShaderBindingOffset} <b>must</b> be less than the size of {@code hitShaderBindingTableBuffer}</li>
     * <li>{@code hitShaderBindingOffset} <b>must</b> be a multiple of {@link VkPhysicalDeviceRayTracingPropertiesNV}{@code ::shaderGroupBaseAlignment}</li>
     * <li>{@code callableShaderBindingOffset} <b>must</b> be less than the size of {@code callableShaderBindingTableBuffer}</li>
     * <li>{@code callableShaderBindingOffset} <b>must</b> be a multiple of {@link VkPhysicalDeviceRayTracingPropertiesNV}{@code ::shaderGroupBaseAlignment}</li>
     * <li>{@code missShaderBindingStride} <b>must</b> be a multiple of {@link VkPhysicalDeviceRayTracingPropertiesNV}{@code ::shaderGroupHandleSize}</li>
     * <li>{@code hitShaderBindingStride} <b>must</b> be a multiple of {@link VkPhysicalDeviceRayTracingPropertiesNV}{@code ::shaderGroupHandleSize}</li>
     * <li>{@code callableShaderBindingStride} <b>must</b> be a multiple of {@link VkPhysicalDeviceRayTracingPropertiesNV}{@code ::shaderGroupHandleSize}</li>
     * <li>{@code missShaderBindingStride} <b>must</b> be a less than or equal to {@link VkPhysicalDeviceRayTracingPropertiesNV}{@code ::maxShaderGroupStride}</li>
     * <li>{@code hitShaderBindingStride} <b>must</b> be a less than or equal to {@link VkPhysicalDeviceRayTracingPropertiesNV}{@code ::maxShaderGroupStride}</li>
     * <li>{@code callableShaderBindingStride} <b>must</b> be a less than or equal to {@link VkPhysicalDeviceRayTracingPropertiesNV}{@code ::maxShaderGroupStride}</li>
     * <li>{@code width} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxComputeWorkGroupCount}[0]</li>
     * <li>{@code height} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxComputeWorkGroupCount}[1]</li>
     * <li>{@code depth} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxComputeWorkGroupCount}[2]</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code raygenShaderBindingTableBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
     * <li>If {@code missShaderBindingTableBuffer} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code missShaderBindingTableBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
     * <li>If {@code hitShaderBindingTableBuffer} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code hitShaderBindingTableBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
     * <li>If {@code callableShaderBindingTableBuffer} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code callableShaderBindingTableBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
     * <li>Each of {@code callableShaderBindingTableBuffer}, {@code commandBuffer}, {@code hitShaderBindingTableBuffer}, {@code missShaderBindingTableBuffer}, and {@code raygenShaderBindingTableBuffer} that are valid handles <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Command Properties</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Compute</td><td></td></tr></tbody>
     * </table>
     *
     * @param commandBuffer                    the command buffer into which the command will be recorded.
     * @param raygenShaderBindingTableBuffer   the buffer object that holds the shader binding table data for the ray generation shader stage.
     * @param raygenShaderBindingOffset        the offset in bytes (relative to {@code raygenShaderBindingTableBuffer}) of the ray generation shader being used for the trace.
     * @param missShaderBindingTableBuffer     the buffer object that holds the shader binding table data for the miss shader stage.
     * @param missShaderBindingOffset          the offset in bytes (relative to {@code missShaderBindingTableBuffer}) of the miss shader being used for the trace.
     * @param missShaderBindingStride          the size in bytes of each shader binding table record in {@code missShaderBindingTableBuffer}.
     * @param hitShaderBindingTableBuffer      the buffer object that holds the shader binding table data for the hit shader stages.
     * @param hitShaderBindingOffset           the offset in bytes (relative to {@code hitShaderBindingTableBuffer}) of the hit shader group being used for the trace.
     * @param hitShaderBindingStride           the size in bytes of each shader binding table record in {@code hitShaderBindingTableBuffer}.
     * @param callableShaderBindingTableBuffer the buffer object that holds the shader binding table data for the callable shader stage.
     * @param callableShaderBindingOffset      the offset in bytes (relative to {@code callableShaderBindingTableBuffer}) of the callable shader being used for the trace.
     * @param callableShaderBindingStride      the size in bytes of each shader binding table record in {@code callableShaderBindingTableBuffer}.
     * @param width                            the width of the ray trace query dimensions.
     * @param height                           height of the ray trace query dimensions.
     * @param depth                            depth of the ray trace query dimensions.
     */
    public static void vkCmdTraceRaysNV(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long raygenShaderBindingTableBuffer, @NativeType("VkDeviceSize") long raygenShaderBindingOffset, @NativeType("VkBuffer") long missShaderBindingTableBuffer, @NativeType("VkDeviceSize") long missShaderBindingOffset, @NativeType("VkDeviceSize") long missShaderBindingStride, @NativeType("VkBuffer") long hitShaderBindingTableBuffer, @NativeType("VkDeviceSize") long hitShaderBindingOffset, @NativeType("VkDeviceSize") long hitShaderBindingStride, @NativeType("VkBuffer") long callableShaderBindingTableBuffer, @NativeType("VkDeviceSize") long callableShaderBindingOffset, @NativeType("VkDeviceSize") long callableShaderBindingStride, @NativeType("uint32_t") int width, @NativeType("uint32_t") int height, @NativeType("uint32_t") int depth) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdTraceRaysNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJJJJJJJJJJV(commandBuffer.address(), raygenShaderBindingTableBuffer, raygenShaderBindingOffset, missShaderBindingTableBuffer, missShaderBindingOffset, missShaderBindingStride, hitShaderBindingTableBuffer, hitShaderBindingOffset, hitShaderBindingStride, callableShaderBindingTableBuffer, callableShaderBindingOffset, callableShaderBindingStride, width, height, depth, __functionAddress);
    }

    // --- [ vkCreateRayTracingPipelinesNV ] ---

    /**
     * Unsafe version of: {@link #vkCreateRayTracingPipelinesNV CreateRayTracingPipelinesNV}
     *
     * @param createInfoCount the length of the {@code pCreateInfos} and {@code pPipelines} arrays.
     */
    public static int nvkCreateRayTracingPipelinesNV(VkDevice device, long pipelineCache, int createInfoCount, long pCreateInfos, long pAllocator, long pPipelines) {
        long __functionAddress = device.getCapabilities().vkCreateRayTracingPipelinesNV;
        if (CHECKS) {
            check(__functionAddress);
            VkRayTracingPipelineCreateInfoNV.validate(pCreateInfos, createInfoCount);
            if (pAllocator != NULL) { VkAllocationCallbacks.validate(pAllocator); }
        }
        return callPJPPPI(device.address(), pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines, __functionAddress);
    }

    /**
     * Creates a new ray tracing pipeline object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To create ray tracing pipelines, call:</p>
     * 
     * <pre><code>
     * VkResult vkCreateRayTracingPipelinesNV(
     *     VkDevice                                    device,
     *     VkPipelineCache                             pipelineCache,
     *     uint32_t                                    createInfoCount,
     *     const VkRayTracingPipelineCreateInfoNV*     pCreateInfos,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkPipeline*                                 pPipelines);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If the {@code flags} member of any element of {@code pCreateInfos} contains the {@link VK10#VK_PIPELINE_CREATE_DERIVATIVE_BIT PIPELINE_CREATE_DERIVATIVE_BIT} flag, and the {@code basePipelineIndex} member of that same element is not {@code -1}, {@code basePipelineIndex} <b>must</b> be less than the index into {@code pCreateInfos} that corresponds to that element</li>
     * <li>If the {@code flags} member of any element of {@code pCreateInfos} contains the {@link VK10#VK_PIPELINE_CREATE_DERIVATIVE_BIT PIPELINE_CREATE_DERIVATIVE_BIT} flag, the base pipeline <b>must</b> have been created with the {@link VK10#VK_PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT} flag set</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>If {@code pipelineCache} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code pipelineCache} <b>must</b> be a valid {@code VkPipelineCache} handle</li>
     * <li>{@code pCreateInfos} <b>must</b> be a valid pointer to an array of {@code createInfoCount} valid {@link VkRayTracingPipelineCreateInfoNV} structures</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code pPipelines} <b>must</b> be a valid pointer to an array of {@code createInfoCount} {@code VkPipeline} handles</li>
     * <li>{@code createInfoCount} <b>must</b> be greater than 0</li>
     * <li>If {@code pipelineCache} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
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
     * <li>{@link NVGLSLShader#VK_ERROR_INVALID_SHADER_NV ERROR_INVALID_SHADER_NV}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}, {@link VkRayTracingPipelineCreateInfoNV}</p>
     *
     * @param device        the logical device that creates the ray tracing pipelines.
     * @param pipelineCache either {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, indicating that pipeline caching is disabled, or the handle of a valid <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#pipelines-cache">pipeline cache</a> object, in which case use of that cache is enabled for the duration of the command.
     * @param pCreateInfos  an array of {@link VkRayTracingPipelineCreateInfoNV} structures.
     * @param pAllocator    controls host memory allocation as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     * @param pPipelines    a pointer to an array in which the resulting ray tracing pipeline objects are returned.
     */
    @NativeType("VkResult")
    public static int vkCreateRayTracingPipelinesNV(VkDevice device, @NativeType("VkPipelineCache") long pipelineCache, @NativeType("VkRayTracingPipelineCreateInfoNV const *") VkRayTracingPipelineCreateInfoNV.Buffer pCreateInfos, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkPipeline *") LongBuffer pPipelines) {
        if (CHECKS) {
            check(pPipelines, pCreateInfos.remaining());
        }
        return nvkCreateRayTracingPipelinesNV(device, pipelineCache, pCreateInfos.remaining(), pCreateInfos.address(), memAddressSafe(pAllocator), memAddress(pPipelines));
    }

    // --- [ vkGetRayTracingShaderGroupHandlesNV ] ---

    /**
     * Unsafe version of: {@link #vkGetRayTracingShaderGroupHandlesNV GetRayTracingShaderGroupHandlesNV}
     *
     * @param dataSize the size in bytes of the buffer pointed to by {@code pData}.
     */
    public static int nvkGetRayTracingShaderGroupHandlesNV(VkDevice device, long pipeline, int firstGroup, int groupCount, long dataSize, long pData) {
        long __functionAddress = device.getCapabilities().vkGetRayTracingShaderGroupHandlesNV;
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
     * VkResult vkGetRayTracingShaderGroupHandlesNV(
     *     VkDevice                                    device,
     *     VkPipeline                                  pipeline,
     *     uint32_t                                    firstGroup,
     *     uint32_t                                    groupCount,
     *     size_t                                      dataSize,
     *     void*                                       pData);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The sum of {@code firstGroup} and {@code groupCount} <b>must</b> be less than the number of shader groups in {@code pipeline}.</li>
     * <li>{@code dataSize} <b>must</b> be at least <code>{@link VkPhysicalDeviceRayTracingPropertiesNV}::shaderGroupHandleSize × groupCount</code></li>
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
     * @param device     the logical device that contains the ray tracing pipeline.
     * @param pipeline   the ray tracing pipeline object that contains the shaders.
     * @param firstGroup the index of the first group to retrieve a handle for from the {@link VkRayTracingShaderGroupCreateInfoNV}{@code ::pGroups} array.
     * @param groupCount the number of shader handles to retrieve.
     * @param pData      a pointer to a user-allocated buffer where the results will be written.
     */
    @NativeType("VkResult")
    public static int vkGetRayTracingShaderGroupHandlesNV(VkDevice device, @NativeType("VkPipeline") long pipeline, @NativeType("uint32_t") int firstGroup, @NativeType("uint32_t") int groupCount, @NativeType("void *") ByteBuffer pData) {
        return nvkGetRayTracingShaderGroupHandlesNV(device, pipeline, firstGroup, groupCount, pData.remaining(), memAddress(pData));
    }

    // --- [ vkGetAccelerationStructureHandleNV ] ---

    /**
     * Unsafe version of: {@link #vkGetAccelerationStructureHandleNV GetAccelerationStructureHandleNV}
     *
     * @param dataSize the size in bytes of the buffer pointed to by {@code pData}.
     */
    public static int nvkGetAccelerationStructureHandleNV(VkDevice device, long accelerationStructure, long dataSize, long pData) {
        long __functionAddress = device.getCapabilities().vkGetAccelerationStructureHandleNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(device.address(), accelerationStructure, dataSize, pData, __functionAddress);
    }

    /**
     * Get opaque acceleration structure handle.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To allow constructing geometry instances with device code if desired, we need to be able to query a opaque handle for an acceleration structure. This handle is a value of 8 bytes. To get this handle, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetAccelerationStructureHandleNV(
     *     VkDevice                                    device,
     *     VkAccelerationStructureNV                   accelerationStructure,
     *     size_t                                      dataSize,
     *     void*                                       pData);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code dataSize} <b>must</b> be large enough to contain the result of the query, as described above</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code accelerationStructure} <b>must</b> be a valid {@code VkAccelerationStructureNV} handle</li>
     * <li>{@code pData} <b>must</b> be a valid pointer to an array of {@code dataSize} bytes</li>
     * <li>{@code dataSize} <b>must</b> be greater than 0</li>
     * <li>{@code accelerationStructure} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
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
     * @param device                the logical device that owns the acceleration structures.
     * @param accelerationStructure the acceleration structure.
     * @param pData                 a pointer to a user-allocated buffer where the results will be written.
     */
    @NativeType("VkResult")
    public static int vkGetAccelerationStructureHandleNV(VkDevice device, @NativeType("VkAccelerationStructureNV") long accelerationStructure, @NativeType("void *") ByteBuffer pData) {
        return nvkGetAccelerationStructureHandleNV(device, accelerationStructure, pData.remaining(), memAddress(pData));
    }

    /**
     * Get opaque acceleration structure handle.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To allow constructing geometry instances with device code if desired, we need to be able to query a opaque handle for an acceleration structure. This handle is a value of 8 bytes. To get this handle, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetAccelerationStructureHandleNV(
     *     VkDevice                                    device,
     *     VkAccelerationStructureNV                   accelerationStructure,
     *     size_t                                      dataSize,
     *     void*                                       pData);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code dataSize} <b>must</b> be large enough to contain the result of the query, as described above</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code accelerationStructure} <b>must</b> be a valid {@code VkAccelerationStructureNV} handle</li>
     * <li>{@code pData} <b>must</b> be a valid pointer to an array of {@code dataSize} bytes</li>
     * <li>{@code dataSize} <b>must</b> be greater than 0</li>
     * <li>{@code accelerationStructure} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
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
     * @param device                the logical device that owns the acceleration structures.
     * @param accelerationStructure the acceleration structure.
     * @param pData                 a pointer to a user-allocated buffer where the results will be written.
     */
    @NativeType("VkResult")
    public static int vkGetAccelerationStructureHandleNV(VkDevice device, @NativeType("VkAccelerationStructureNV") long accelerationStructure, @NativeType("void *") LongBuffer pData) {
        return nvkGetAccelerationStructureHandleNV(device, accelerationStructure, Integer.toUnsignedLong(pData.remaining()) << 3, memAddress(pData));
    }

    // --- [ vkCmdWriteAccelerationStructuresPropertiesNV ] ---

    /**
     * Unsafe version of: {@link #vkCmdWriteAccelerationStructuresPropertiesNV CmdWriteAccelerationStructuresPropertiesNV}
     *
     * @param accelerationStructureCount the count of acceleration structures for which to query the property.
     */
    public static void nvkCmdWriteAccelerationStructuresPropertiesNV(VkCommandBuffer commandBuffer, int accelerationStructureCount, long pAccelerationStructures, int queryType, long queryPool, int firstQuery) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdWriteAccelerationStructuresPropertiesNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPJV(commandBuffer.address(), accelerationStructureCount, pAccelerationStructures, queryType, queryPool, firstQuery, __functionAddress);
    }

    /**
     * Write acceleration structure result parameters to query results.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query acceleration structure size parameters call:</p>
     * 
     * <pre><code>
     * void vkCmdWriteAccelerationStructuresPropertiesNV(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    accelerationStructureCount,
     *     const VkAccelerationStructureNV*            pAccelerationStructures,
     *     VkQueryType                                 queryType,
     *     VkQueryPool                                 queryPool,
     *     uint32_t                                    firstQuery);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code queryType} <b>must</b> be {@link #VK_QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_NV QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_NV}</li>
     * <li>{@code queryPool} <b>must</b> have been created with a {@code queryType} matching {@code queryType}</li>
     * <li>The queries identified by {@code queryPool} and {@code firstQuery} <b>must</b> be <em>unavailable</em></li>
     * <li>All acceleration structures in {@code accelerationStructures} <b>must</b> have been built with {@link #VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_NV BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_NV} if {@code queryType} is {@link #VK_QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_NV QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_NV}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pAccelerationStructures} <b>must</b> be a valid pointer to an array of {@code accelerationStructureCount} valid {@code VkAccelerationStructureNV} handles</li>
     * <li>{@code queryType} <b>must</b> be a valid {@code VkQueryType} value</li>
     * <li>{@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
     * <li>{@code accelerationStructureCount} <b>must</b> be greater than 0</li>
     * <li>Each of {@code commandBuffer}, {@code queryPool}, and the elements of {@code pAccelerationStructures} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Command Properties</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Compute</td><td></td></tr></tbody>
     * </table>
     *
     * @param commandBuffer           the command buffer into which the command will be recorded.
     * @param pAccelerationStructures points to an array of existing previously built acceleration structures.
     * @param queryType               a {@code VkQueryType} value specifying the type of queries managed by the pool.
     * @param queryPool               the query pool that will manage the results of the query.
     * @param firstQuery              the first query index within the query pool that will contain the {@code accelerationStructureCount} number of results.
     */
    public static void vkCmdWriteAccelerationStructuresPropertiesNV(VkCommandBuffer commandBuffer, @NativeType("VkAccelerationStructureNV const *") LongBuffer pAccelerationStructures, @NativeType("VkQueryType") int queryType, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int firstQuery) {
        nvkCmdWriteAccelerationStructuresPropertiesNV(commandBuffer, pAccelerationStructures.remaining(), memAddress(pAccelerationStructures), queryType, queryPool, firstQuery);
    }

    // --- [ vkCompileDeferredNV ] ---

    /**
     * Deferred compilation of shaders.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To compile a deferred shader in a pipeline call:</p>
     * 
     * <pre><code>
     * VkResult vkCompileDeferredNV(
     *     VkDevice                                    device,
     *     VkPipeline                                  pipeline,
     *     uint32_t                                    shader);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code pipeline} <b>must</b> have been created with {@link #VK_PIPELINE_CREATE_DEFER_COMPILE_BIT_NV PIPELINE_CREATE_DEFER_COMPILE_BIT_NV}</li>
     * <li>{@code shader} <b>must</b> not have been called as a deferred compile before</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pipeline} <b>must</b> be a valid {@code VkPipeline} handle</li>
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
     * @param device   the logical device that contains the ray tracing pipeline.
     * @param pipeline the ray tracing pipeline object that contains the shaders.
     * @param shader   the index of the shader to compile.
     */
    @NativeType("VkResult")
    public static int vkCompileDeferredNV(VkDevice device, @NativeType("VkPipeline") long pipeline, @NativeType("uint32_t") int shader) {
        long __functionAddress = device.getCapabilities().vkCompileDeferredNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJI(device.address(), pipeline, shader, __functionAddress);
    }

    /** Array version of: {@link #vkCreateAccelerationStructureNV CreateAccelerationStructureNV} */
    @NativeType("VkResult")
    public static int vkCreateAccelerationStructureNV(VkDevice device, @NativeType("VkAccelerationStructureCreateInfoNV const *") VkAccelerationStructureCreateInfoNV pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkAccelerationStructureNV *") long[] pAccelerationStructure) {
        long __functionAddress = device.getCapabilities().vkCreateAccelerationStructureNV;
        if (CHECKS) {
            check(__functionAddress);
            check(pAccelerationStructure, 1);
            VkAccelerationStructureCreateInfoNV.validate(pCreateInfo.address());
            if (pAllocator != null) { VkAllocationCallbacks.validate(pAllocator.address()); }
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pAccelerationStructure, __functionAddress);
    }

    /** Array version of: {@link #vkCreateRayTracingPipelinesNV CreateRayTracingPipelinesNV} */
    @NativeType("VkResult")
    public static int vkCreateRayTracingPipelinesNV(VkDevice device, @NativeType("VkPipelineCache") long pipelineCache, @NativeType("VkRayTracingPipelineCreateInfoNV const *") VkRayTracingPipelineCreateInfoNV.Buffer pCreateInfos, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkPipeline *") long[] pPipelines) {
        long __functionAddress = device.getCapabilities().vkCreateRayTracingPipelinesNV;
        if (CHECKS) {
            check(__functionAddress);
            check(pPipelines, pCreateInfos.remaining());
            VkRayTracingPipelineCreateInfoNV.validate(pCreateInfos.address(), pCreateInfos.remaining());
            if (pAllocator != null) { VkAllocationCallbacks.validate(pAllocator.address()); }
        }
        return callPJPPPI(device.address(), pipelineCache, pCreateInfos.remaining(), pCreateInfos.address(), memAddressSafe(pAllocator), pPipelines, __functionAddress);
    }

    /** Array version of: {@link #vkGetAccelerationStructureHandleNV GetAccelerationStructureHandleNV} */
    @NativeType("VkResult")
    public static int vkGetAccelerationStructureHandleNV(VkDevice device, @NativeType("VkAccelerationStructureNV") long accelerationStructure, @NativeType("void *") long[] pData) {
        long __functionAddress = device.getCapabilities().vkGetAccelerationStructureHandleNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(device.address(), accelerationStructure, Integer.toUnsignedLong(pData.length) << 3, pData, __functionAddress);
    }

    /** Array version of: {@link #vkCmdWriteAccelerationStructuresPropertiesNV CmdWriteAccelerationStructuresPropertiesNV} */
    public static void vkCmdWriteAccelerationStructuresPropertiesNV(VkCommandBuffer commandBuffer, @NativeType("VkAccelerationStructureNV const *") long[] pAccelerationStructures, @NativeType("VkQueryType") int queryType, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int firstQuery) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdWriteAccelerationStructuresPropertiesNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPJV(commandBuffer.address(), pAccelerationStructures.length, pAccelerationStructures, queryType, queryPool, firstQuery, __functionAddress);
    }

}