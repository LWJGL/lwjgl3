/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * In order to be efficient, rendering techniques such as ray tracing need a quick way to identify which primitives may be intersected by a ray traversing the geometries. Acceleration structures are the most common way to represent the geometry spatially sorted, in order to quickly identify such potential intersections.
 * 
 * <p>This extension adds new functionalities:</p>
 * 
 * <ul>
 * <li>Acceleration structure objects and build commands</li>
 * <li>Structures to describe geometry inputs to acceleration structure builds</li>
 * <li>Acceleration structure copy commands</li>
 * </ul>
 * 
 * <h5>VK_KHR_acceleration_structure</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_acceleration_structure}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>151</dd>
 * <dt><b>Revision</b></dt>
 * <dd>13</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.1</li>
 * <li>Requires {@link EXTDescriptorIndexing VK_EXT_descriptor_indexing}</li>
 * <li>Requires {@link KHRBufferDeviceAddress VK_KHR_buffer_device_address}</li>
 * <li>Requires {@link KHRDeferredHostOperations VK_KHR_deferred_host_operations}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Daniel Koch <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_acceleration_structure]%20@dgkoch%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_acceleration_structure%20extension%3E%3E">dgkoch</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2021-09-30</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Samuel Bourasseau, Adobe</li>
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
 * <li>Ricardo Garcia, Igalia</li>
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
 * <li>Lewis Gordon, Samsung</li>
 * <li>Ralph Potter, Samsung</li>
 * <li>Jasper Bekkers, Traverse Research</li>
 * <li>Jesse Barker, Unity</li>
 * <li>Baldur Karlsson, Valve</li>
 * </ul></dd>
 * </dl>
 */
public class KHRAccelerationStructure {

    /** The extension specification version. */
    public static final int VK_KHR_ACCELERATION_STRUCTURE_SPEC_VERSION = 13;

    /** The extension name. */
    public static final String VK_KHR_ACCELERATION_STRUCTURE_EXTENSION_NAME = "VK_KHR_acceleration_structure";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_ACCELERATION_STRUCTURE_KHR STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_ACCELERATION_STRUCTURE_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_GEOMETRY_INFO_KHR STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_GEOMETRY_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_DEVICE_ADDRESS_INFO_KHR STRUCTURE_TYPE_ACCELERATION_STRUCTURE_DEVICE_ADDRESS_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_AABBS_DATA_KHR STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_AABBS_DATA_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_INSTANCES_DATA_KHR STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_INSTANCES_DATA_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_TRIANGLES_DATA_KHR STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_TRIANGLES_DATA_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_KHR STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_VERSION_INFO_KHR STRUCTURE_TYPE_ACCELERATION_STRUCTURE_VERSION_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_COPY_ACCELERATION_STRUCTURE_INFO_KHR STRUCTURE_TYPE_COPY_ACCELERATION_STRUCTURE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_COPY_ACCELERATION_STRUCTURE_TO_MEMORY_INFO_KHR STRUCTURE_TYPE_COPY_ACCELERATION_STRUCTURE_TO_MEMORY_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_COPY_MEMORY_TO_ACCELERATION_STRUCTURE_INFO_KHR STRUCTURE_TYPE_COPY_MEMORY_TO_ACCELERATION_STRUCTURE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_FEATURES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_PROPERTIES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_KHR STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_SIZES_INFO_KHR STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_SIZES_INFO_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_ACCELERATION_STRUCTURE_KHR       = 1000150007,
        VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_GEOMETRY_INFO_KHR        = 1000150000,
        VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_DEVICE_ADDRESS_INFO_KHR        = 1000150002,
        VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_AABBS_DATA_KHR        = 1000150003,
        VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_INSTANCES_DATA_KHR    = 1000150004,
        VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_TRIANGLES_DATA_KHR    = 1000150005,
        VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_KHR                   = 1000150006,
        VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_VERSION_INFO_KHR               = 1000150009,
        VK_STRUCTURE_TYPE_COPY_ACCELERATION_STRUCTURE_INFO_KHR                  = 1000150010,
        VK_STRUCTURE_TYPE_COPY_ACCELERATION_STRUCTURE_TO_MEMORY_INFO_KHR        = 1000150011,
        VK_STRUCTURE_TYPE_COPY_MEMORY_TO_ACCELERATION_STRUCTURE_INFO_KHR        = 1000150012,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_FEATURES_KHR   = 1000150013,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_PROPERTIES_KHR = 1000150014,
        VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_KHR                = 1000150017,
        VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_SIZES_INFO_KHR           = 1000150020;

    /** Extends {@code VkPipelineStageFlagBits}. */
    public static final int VK_PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_KHR = 0x2000000;

    /** Extends {@code VkDescriptorType}. */
    public static final int VK_DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_KHR = 1000150000;

    /**
     * Extends {@code VkAccessFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_ACCESS_ACCELERATION_STRUCTURE_READ_BIT_KHR ACCESS_ACCELERATION_STRUCTURE_READ_BIT_KHR}</li>
     * <li>{@link #VK_ACCESS_ACCELERATION_STRUCTURE_WRITE_BIT_KHR ACCESS_ACCELERATION_STRUCTURE_WRITE_BIT_KHR}</li>
     * </ul>
     */
    public static final int
        VK_ACCESS_ACCELERATION_STRUCTURE_READ_BIT_KHR  = 0x200000,
        VK_ACCESS_ACCELERATION_STRUCTURE_WRITE_BIT_KHR = 0x400000;

    /**
     * Extends {@code VkQueryType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_KHR QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_KHR}</li>
     * <li>{@link #VK_QUERY_TYPE_ACCELERATION_STRUCTURE_SERIALIZATION_SIZE_KHR QUERY_TYPE_ACCELERATION_STRUCTURE_SERIALIZATION_SIZE_KHR}</li>
     * </ul>
     */
    public static final int
        VK_QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_KHR     = 1000150000,
        VK_QUERY_TYPE_ACCELERATION_STRUCTURE_SERIALIZATION_SIZE_KHR = 1000150001;

    /** Extends {@code VkObjectType}. */
    public static final int VK_OBJECT_TYPE_ACCELERATION_STRUCTURE_KHR = 1000150000;

    /** Extends {@code VkDebugReportObjectTypeEXT}. */
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_ACCELERATION_STRUCTURE_KHR_EXT = 1000150000;

    /** Extends {@code VkIndexType}. */
    public static final int VK_INDEX_TYPE_NONE_KHR = 1000165000;

    /** Extends {@code VkFormatFeatureFlagBits}. */
    public static final int VK_FORMAT_FEATURE_ACCELERATION_STRUCTURE_VERTEX_BUFFER_BIT_KHR = 0x20000000;

    /**
     * Extends {@code VkBufferUsageFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_BUFFER_USAGE_ACCELERATION_STRUCTURE_BUILD_INPUT_READ_ONLY_BIT_KHR BUFFER_USAGE_ACCELERATION_STRUCTURE_BUILD_INPUT_READ_ONLY_BIT_KHR}</li>
     * <li>{@link #VK_BUFFER_USAGE_ACCELERATION_STRUCTURE_STORAGE_BIT_KHR BUFFER_USAGE_ACCELERATION_STRUCTURE_STORAGE_BIT_KHR}</li>
     * </ul>
     */
    public static final int
        VK_BUFFER_USAGE_ACCELERATION_STRUCTURE_BUILD_INPUT_READ_ONLY_BIT_KHR = 0x80000,
        VK_BUFFER_USAGE_ACCELERATION_STRUCTURE_STORAGE_BIT_KHR               = 0x100000;

    /** Extends {@code VkFormatFeatureFlagBits2}. */
    public static final long VK_FORMAT_FEATURE_2_ACCELERATION_STRUCTURE_VERTEX_BUFFER_BIT_KHR = 0x20000000L;

    /**
     * VkAccelerationStructureTypeKHR - Type of acceleration structure
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_KHR ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_KHR} is a top-level acceleration structure containing instance data referring to bottom-level acceleration structures.</li>
     * <li>{@link #VK_ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_KHR ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_KHR} is a bottom-level acceleration structure containing the AABBs or geometry to be intersected.</li>
     * <li>{@link #VK_ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR} is an acceleration structure whose type is determined at build time used for special circumstances.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAccelerationStructureBuildGeometryInfoKHR}, {@link VkAccelerationStructureCreateInfoKHR}, {@link VkAccelerationStructureInfoNV}</p>
     */
    public static final int
        VK_ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_KHR    = 0,
        VK_ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_KHR = 1,
        VK_ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR      = 2;

    /**
     * VkBuildAccelerationStructureFlagBitsKHR - Bitmask specifying additional parameters for acceleration structure builds
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_UPDATE_BIT_KHR BUILD_ACCELERATION_STRUCTURE_ALLOW_UPDATE_BIT_KHR} indicates that the specified acceleration structure <b>can</b> be updated with a {@code mode} of {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR} in {@link VkAccelerationStructureBuildGeometryInfoKHR} or an {@code update} of {@link VK10#VK_TRUE TRUE} in {@link NVRayTracing#vkCmdBuildAccelerationStructureNV CmdBuildAccelerationStructureNV} .</li>
     * <li>{@link #VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_KHR BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_KHR} indicates that the specified acceleration structure <b>can</b> act as the source for a copy acceleration structure command with {@code mode} of {@link #VK_COPY_ACCELERATION_STRUCTURE_MODE_COMPACT_KHR COPY_ACCELERATION_STRUCTURE_MODE_COMPACT_KHR} to produce a compacted acceleration structure.</li>
     * <li>{@link #VK_BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_TRACE_BIT_KHR BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_TRACE_BIT_KHR} indicates that the given acceleration structure build <b>should</b> prioritize trace performance over build time.</li>
     * <li>{@link #VK_BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_BUILD_BIT_KHR BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_BUILD_BIT_KHR} indicates that the given acceleration structure build <b>should</b> prioritize build time over trace performance.</li>
     * <li>{@link #VK_BUILD_ACCELERATION_STRUCTURE_LOW_MEMORY_BIT_KHR BUILD_ACCELERATION_STRUCTURE_LOW_MEMORY_BIT_KHR} indicates that this acceleration structure <b>should</b> minimize the size of the scratch memory and the final result acceleration structure, potentially at the expense of build time or trace performance.</li>
     * </ul>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>{@link #VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_UPDATE_BIT_KHR BUILD_ACCELERATION_STRUCTURE_ALLOW_UPDATE_BIT_KHR} and {@link #VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_KHR BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_KHR} <b>may</b> take more time and memory than a normal build, and so <b>should</b> only be used when those features are needed.</p>
     * </div>
     */
    public static final int
        VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_UPDATE_BIT_KHR      = 0x1,
        VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_KHR  = 0x2,
        VK_BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_TRACE_BIT_KHR = 0x4,
        VK_BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_BUILD_BIT_KHR = 0x8,
        VK_BUILD_ACCELERATION_STRUCTURE_LOW_MEMORY_BIT_KHR        = 0x10;

    /**
     * VkBuildAccelerationStructureModeKHR - Enum specifying the type of build operation to perform
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_BUILD_KHR BUILD_ACCELERATION_STRUCTURE_MODE_BUILD_KHR} specifies that the destination acceleration structure will be built using the specified geometries.</li>
     * <li>{@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR} specifies that the destination acceleration structure will be built using data in a source acceleration structure, updated by the specified geometries.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAccelerationStructureBuildGeometryInfoKHR}</p>
     */
    public static final int
        VK_BUILD_ACCELERATION_STRUCTURE_MODE_BUILD_KHR  = 0,
        VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR = 1;

    /**
     * VkGeometryTypeKHR - Enum specifying which type of geometry is provided
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR} specifies a geometry type consisting of triangles.</li>
     * <li>{@link #VK_GEOMETRY_TYPE_AABBS_KHR GEOMETRY_TYPE_AABBS_KHR} specifies a geometry type consisting of axis-aligned bounding boxes.</li>
     * <li>{@link #VK_GEOMETRY_TYPE_INSTANCES_KHR GEOMETRY_TYPE_INSTANCES_KHR} specifies a geometry type consisting of acceleration structure instances.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAccelerationStructureGeometryKHR}, {@link VkGeometryNV}</p>
     */
    public static final int
        VK_GEOMETRY_TYPE_TRIANGLES_KHR = 0,
        VK_GEOMETRY_TYPE_AABBS_KHR     = 1,
        VK_GEOMETRY_TYPE_INSTANCES_KHR = 2;

    /**
     * VkGeometryFlagBitsKHR - Bitmask specifying additional parameters for a geometry
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_GEOMETRY_OPAQUE_BIT_KHR GEOMETRY_OPAQUE_BIT_KHR} indicates that this geometry does not invoke the any-hit shaders even if present in a hit group.</li>
     * <li>{@link #VK_GEOMETRY_NO_DUPLICATE_ANY_HIT_INVOCATION_BIT_KHR GEOMETRY_NO_DUPLICATE_ANY_HIT_INVOCATION_BIT_KHR} indicates that the implementation <b>must</b> only call the any-hit shader a single time for each primitive in this geometry. If this bit is absent an implementation <b>may</b> invoke the any-hit shader more than once for this geometry.</li>
     * </ul>
     */
    public static final int
        VK_GEOMETRY_OPAQUE_BIT_KHR                          = 0x1,
        VK_GEOMETRY_NO_DUPLICATE_ANY_HIT_INVOCATION_BIT_KHR = 0x2;

    /**
     * VkAccelerationStructureBuildTypeKHR - Acceleration structure build type
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_ACCELERATION_STRUCTURE_BUILD_TYPE_HOST_KHR ACCELERATION_STRUCTURE_BUILD_TYPE_HOST_KHR} requests the memory requirement for operations performed by the host.</li>
     * <li>{@link #VK_ACCELERATION_STRUCTURE_BUILD_TYPE_DEVICE_KHR ACCELERATION_STRUCTURE_BUILD_TYPE_DEVICE_KHR} requests the memory requirement for operations performed by the device.</li>
     * <li>{@link #VK_ACCELERATION_STRUCTURE_BUILD_TYPE_HOST_OR_DEVICE_KHR ACCELERATION_STRUCTURE_BUILD_TYPE_HOST_OR_DEVICE_KHR} requests the memory requirement for operations performed by either the host, or the device.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #vkGetAccelerationStructureBuildSizesKHR GetAccelerationStructureBuildSizesKHR}</p>
     */
    public static final int
        VK_ACCELERATION_STRUCTURE_BUILD_TYPE_HOST_KHR           = 0,
        VK_ACCELERATION_STRUCTURE_BUILD_TYPE_DEVICE_KHR         = 1,
        VK_ACCELERATION_STRUCTURE_BUILD_TYPE_HOST_OR_DEVICE_KHR = 2;

    /**
     * VkGeometryInstanceFlagBitsKHR - Instance flag bits
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_GEOMETRY_INSTANCE_TRIANGLE_FACING_CULL_DISABLE_BIT_KHR GEOMETRY_INSTANCE_TRIANGLE_FACING_CULL_DISABLE_BIT_KHR} disables face culling for this instance.</li>
     * <li>{@link #VK_GEOMETRY_INSTANCE_TRIANGLE_FLIP_FACING_BIT_KHR GEOMETRY_INSTANCE_TRIANGLE_FLIP_FACING_BIT_KHR} indicates that the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#ray-traversal-culling-face">facing determination</a> for geometry in this instance is inverted. Because the facing is determined in object space, an instance transform does not change the winding, but a geometry transform does.</li>
     * <li>{@link #VK_GEOMETRY_INSTANCE_FORCE_OPAQUE_BIT_KHR GEOMETRY_INSTANCE_FORCE_OPAQUE_BIT_KHR} causes this instance to act as though {@link #VK_GEOMETRY_OPAQUE_BIT_KHR GEOMETRY_OPAQUE_BIT_KHR} were specified on all geometries referenced by this instance. This behavior <b>can</b> be overridden by the SPIR-V {@code NoOpaqueKHR} ray flag.</li>
     * <li>{@link #VK_GEOMETRY_INSTANCE_FORCE_NO_OPAQUE_BIT_KHR GEOMETRY_INSTANCE_FORCE_NO_OPAQUE_BIT_KHR} causes this instance to act as though {@link #VK_GEOMETRY_OPAQUE_BIT_KHR GEOMETRY_OPAQUE_BIT_KHR} were not specified on all geometries referenced by this instance. This behavior <b>can</b> be overridden by the SPIR-V {@code OpaqueKHR} ray flag.</li>
     * </ul>
     * 
     * <p>{@link #VK_GEOMETRY_INSTANCE_FORCE_NO_OPAQUE_BIT_KHR GEOMETRY_INSTANCE_FORCE_NO_OPAQUE_BIT_KHR} and {@link #VK_GEOMETRY_INSTANCE_FORCE_OPAQUE_BIT_KHR GEOMETRY_INSTANCE_FORCE_OPAQUE_BIT_KHR} <b>must</b> not be used in the same flag.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_GEOMETRY_INSTANCE_TRIANGLE_FRONT_COUNTERCLOCKWISE_BIT_KHR GEOMETRY_INSTANCE_TRIANGLE_FRONT_COUNTERCLOCKWISE_BIT_KHR}</li>
     * </ul>
     */
    public static final int
        VK_GEOMETRY_INSTANCE_TRIANGLE_FACING_CULL_DISABLE_BIT_KHR    = 0x1,
        VK_GEOMETRY_INSTANCE_TRIANGLE_FLIP_FACING_BIT_KHR            = 0x2,
        VK_GEOMETRY_INSTANCE_FORCE_OPAQUE_BIT_KHR                    = 0x4,
        VK_GEOMETRY_INSTANCE_FORCE_NO_OPAQUE_BIT_KHR                 = 0x8,
        VK_GEOMETRY_INSTANCE_TRIANGLE_FRONT_COUNTERCLOCKWISE_BIT_KHR = 0x2;

    /**
     * VkAccelerationStructureCreateFlagBitsKHR - Bitmask specifying additional creation parameters for acceleration structure
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_ACCELERATION_STRUCTURE_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_KHR ACCELERATION_STRUCTURE_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_KHR} specifies that the acceleration structure’s address <b>can</b> be saved and reused on a subsequent run.</li>
     * </ul>
     */
    public static final int VK_ACCELERATION_STRUCTURE_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_KHR = 0x1;

    /**
     * VkCopyAccelerationStructureModeKHR - Acceleration structure copy mode
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_COPY_ACCELERATION_STRUCTURE_MODE_CLONE_KHR COPY_ACCELERATION_STRUCTURE_MODE_CLONE_KHR} creates a direct copy of the acceleration structure specified in {@code src} into the one specified by {@code dst}. The {@code dst} acceleration structure <b>must</b> have been created with the same parameters as {@code src}. If {@code src} contains references to other acceleration structures, {@code dst} will reference the same acceleration structures.</li>
     * <li>{@link #VK_COPY_ACCELERATION_STRUCTURE_MODE_COMPACT_KHR COPY_ACCELERATION_STRUCTURE_MODE_COMPACT_KHR} creates a more compact version of an acceleration structure {@code src} into {@code dst}. The acceleration structure {@code dst} <b>must</b> have been created with a size at least as large as that returned by {@link #vkCmdWriteAccelerationStructuresPropertiesKHR CmdWriteAccelerationStructuresPropertiesKHR} or {@link #vkWriteAccelerationStructuresPropertiesKHR WriteAccelerationStructuresPropertiesKHR} after the build of the acceleration structure specified by {@code src}. If {@code src} contains references to other acceleration structures, {@code dst} will reference the same acceleration structures.</li>
     * <li>{@link #VK_COPY_ACCELERATION_STRUCTURE_MODE_SERIALIZE_KHR COPY_ACCELERATION_STRUCTURE_MODE_SERIALIZE_KHR} serializes the acceleration structure to a semi-opaque format which can be reloaded on a compatible implementation.</li>
     * <li>{@link #VK_COPY_ACCELERATION_STRUCTURE_MODE_DESERIALIZE_KHR COPY_ACCELERATION_STRUCTURE_MODE_DESERIALIZE_KHR} deserializes the semi-opaque serialization format in the buffer to the acceleration structure.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkCopyAccelerationStructureInfoKHR}, {@link VkCopyAccelerationStructureToMemoryInfoKHR}, {@link VkCopyMemoryToAccelerationStructureInfoKHR}, {@link NVRayTracing#vkCmdCopyAccelerationStructureNV CmdCopyAccelerationStructureNV}</p>
     */
    public static final int
        VK_COPY_ACCELERATION_STRUCTURE_MODE_CLONE_KHR       = 0,
        VK_COPY_ACCELERATION_STRUCTURE_MODE_COMPACT_KHR     = 1,
        VK_COPY_ACCELERATION_STRUCTURE_MODE_SERIALIZE_KHR   = 2,
        VK_COPY_ACCELERATION_STRUCTURE_MODE_DESERIALIZE_KHR = 3;

    /**
     * VkAccelerationStructureCompatibilityKHR - Acceleration structure compatibility
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_ACCELERATION_STRUCTURE_COMPATIBILITY_COMPATIBLE_KHR ACCELERATION_STRUCTURE_COMPATIBILITY_COMPATIBLE_KHR} if the {@code pVersionData} version acceleration structure is compatible with {@code device}.</li>
     * <li>{@link #VK_ACCELERATION_STRUCTURE_COMPATIBILITY_INCOMPATIBLE_KHR ACCELERATION_STRUCTURE_COMPATIBILITY_INCOMPATIBLE_KHR} if the {@code pVersionData} version acceleration structure is not compatible with {@code device}.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #vkGetDeviceAccelerationStructureCompatibilityKHR GetDeviceAccelerationStructureCompatibilityKHR}</p>
     */
    public static final int
        VK_ACCELERATION_STRUCTURE_COMPATIBILITY_COMPATIBLE_KHR   = 0,
        VK_ACCELERATION_STRUCTURE_COMPATIBILITY_INCOMPATIBLE_KHR = 1;

    protected KHRAccelerationStructure() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCreateAccelerationStructureKHR ] ---

    /** Unsafe version of: {@link #vkCreateAccelerationStructureKHR CreateAccelerationStructureKHR} */
    public static int nvkCreateAccelerationStructureKHR(VkDevice device, long pCreateInfo, long pAllocator, long pAccelerationStructure) {
        long __functionAddress = device.getCapabilities().vkCreateAccelerationStructureKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pAccelerationStructure, __functionAddress);
    }

    /**
     * Create a new acceleration structure object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To create an acceleration structure, call:</p>
     * 
     * <pre><code>
     * VkResult vkCreateAccelerationStructureKHR(
     *     VkDevice                                    device,
     *     const VkAccelerationStructureCreateInfoKHR* pCreateInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkAccelerationStructureKHR*                 pAccelerationStructure);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Similar to other objects in Vulkan, the acceleration structure creation merely creates an object with a specific “{@code shape}”. The type and quantity of geometry that can be built into an acceleration structure is determined by the parameters of {@link VkAccelerationStructureCreateInfoKHR}.</p>
     * 
     * <p>Populating the data in the object after allocating and binding memory is done with commands such as {@link #vkCmdBuildAccelerationStructuresKHR CmdBuildAccelerationStructuresKHR}, {@link #vkBuildAccelerationStructuresKHR BuildAccelerationStructuresKHR}, {@link #vkCmdCopyAccelerationStructureKHR CmdCopyAccelerationStructureKHR}, and {@link #vkCopyAccelerationStructureKHR CopyAccelerationStructureKHR}.</p>
     * 
     * <p>The input buffers passed to acceleration structure build commands will be referenced by the implementation for the duration of the command. After the command completes, the acceleration structure <b>may</b> hold a reference to any acceleration structure specified by an active instance contained therein. Apart from this referencing, acceleration structures <b>must</b> be fully self-contained. The application <b>may</b> re-use or free any memory which was used by the command as an input or as scratch without affecting the results of ray traversal.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-accelerationStructure">{@code accelerationStructure}</a> feature <b>must</b> be enabled</li>
     * <li>If {@link VkAccelerationStructureCreateInfoKHR}{@code ::deviceAddress} is not zero, the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-accelerationStructureCaptureReplay">{@code accelerationStructureCaptureReplay}</a> feature <b>must</b> be enabled</li>
     * <li>If {@code device} was created with multiple physical devices, then the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-bufferDeviceAddressMultiDevice">bufferDeviceAddressMultiDevice</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid {@link VkAccelerationStructureCreateInfoKHR} structure</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code pAccelerationStructure} <b>must</b> be a valid pointer to a {@code VkAccelerationStructureKHR} handle</li>
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
     * <li>{@link KHRBufferDeviceAddress#VK_ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS_KHR ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS_KHR}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAccelerationStructureCreateInfoKHR}, {@link VkAllocationCallbacks}</p>
     *
     * @param device                 the logical device that creates the acceleration structure object.
     * @param pCreateInfo            a pointer to a {@link VkAccelerationStructureCreateInfoKHR} structure containing parameters affecting creation of the acceleration structure.
     * @param pAllocator             controls host memory allocation as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     * @param pAccelerationStructure a pointer to a {@code VkAccelerationStructureKHR} handle in which the resulting acceleration structure object is returned.
     */
    @NativeType("VkResult")
    public static int vkCreateAccelerationStructureKHR(VkDevice device, @NativeType("VkAccelerationStructureCreateInfoKHR const *") VkAccelerationStructureCreateInfoKHR pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkAccelerationStructureKHR *") LongBuffer pAccelerationStructure) {
        if (CHECKS) {
            check(pAccelerationStructure, 1);
        }
        return nvkCreateAccelerationStructureKHR(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pAccelerationStructure));
    }

    // --- [ vkDestroyAccelerationStructureKHR ] ---

    /** Unsafe version of: {@link #vkDestroyAccelerationStructureKHR DestroyAccelerationStructureKHR} */
    public static void nvkDestroyAccelerationStructureKHR(VkDevice device, long accelerationStructure, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyAccelerationStructureKHR;
        if (CHECKS) {
            check(__functionAddress);
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
     * void vkDestroyAccelerationStructureKHR(
     *     VkDevice                                    device,
     *     VkAccelerationStructureKHR                  accelerationStructure,
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
     * <li>If {@code accelerationStructure} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code accelerationStructure} <b>must</b> be a valid {@code VkAccelerationStructureKHR} handle</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>If {@code accelerationStructure} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code accelerationStructure} <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}</p>
     *
     * @param device                the logical device that destroys the acceleration structure.
     * @param accelerationStructure the acceleration structure to destroy.
     * @param pAllocator            controls host memory allocation as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     */
    public static void vkDestroyAccelerationStructureKHR(VkDevice device, @NativeType("VkAccelerationStructureKHR") long accelerationStructure, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyAccelerationStructureKHR(device, accelerationStructure, memAddressSafe(pAllocator));
    }

    // --- [ vkCmdBuildAccelerationStructuresKHR ] ---

    /**
     * Unsafe version of: {@link #vkCmdBuildAccelerationStructuresKHR CmdBuildAccelerationStructuresKHR}
     *
     * @param infoCount the number of acceleration structures to build. It specifies the number of the {@code pInfos} structures and {@code ppBuildRangeInfos} pointers that <b>must</b> be provided.
     */
    public static void nvkCmdBuildAccelerationStructuresKHR(VkCommandBuffer commandBuffer, int infoCount, long pInfos, long ppBuildRangeInfos) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBuildAccelerationStructuresKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(commandBuffer.address(), infoCount, pInfos, ppBuildRangeInfos, __functionAddress);
    }

    /**
     * Build an acceleration structure.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To build acceleration structures call:</p>
     * 
     * <pre><code>
     * void vkCmdBuildAccelerationStructuresKHR(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    infoCount,
     *     const VkAccelerationStructureBuildGeometryInfoKHR* pInfos,
     *     const VkAccelerationStructureBuildRangeInfoKHR* const* ppBuildRangeInfos);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@code vkCmdBuildAccelerationStructuresKHR} command provides the ability to initiate multiple acceleration structures builds, however there is no ordering or synchronization implied between any of the individual acceleration structure builds.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>This means that an application <b>cannot</b> build a top-level acceleration structure in the same {@link #vkCmdBuildAccelerationStructuresKHR CmdBuildAccelerationStructuresKHR} call as the associated bottom-level or instance acceleration structures are being built. There also <b>cannot</b> be any memory aliasing between any acceleration structure memories or scratch memories being used by any of the builds.</p>
     * </div>
     * 
     * <p>Accesses to the acceleration structure scratch buffers as identified by the {@link VkAccelerationStructureBuildGeometryInfoKHR}{@code ::scratchData} buffer device addresses <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies">synchronized</a> with the {@link #VK_PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_KHR PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_KHR} <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-pipeline-stages">pipeline stage</a> and an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-access-types">access type</a> of {@link #VK_ACCESS_ACCELERATION_STRUCTURE_READ_BIT_KHR ACCESS_ACCELERATION_STRUCTURE_READ_BIT_KHR} or {@link #VK_ACCESS_ACCELERATION_STRUCTURE_WRITE_BIT_KHR ACCESS_ACCELERATION_STRUCTURE_WRITE_BIT_KHR}. Similarly for accesses to each {@link VkAccelerationStructureBuildGeometryInfoKHR}{@code ::srcAccelerationStructure} and {@link VkAccelerationStructureBuildGeometryInfoKHR}{@code ::dstAccelerationStructure}.</p>
     * 
     * <p>Accesses to other input buffers as identified by any used values of {@link VkAccelerationStructureGeometryMotionTrianglesDataNV}{@code ::vertexData}, {@link VkAccelerationStructureGeometryTrianglesDataKHR}{@code ::vertexData}, {@link VkAccelerationStructureGeometryTrianglesDataKHR}{@code ::indexData}, {@link VkAccelerationStructureGeometryTrianglesDataKHR}{@code ::transformData}, {@link VkAccelerationStructureGeometryAabbsDataKHR}{@code ::data}, and {@link VkAccelerationStructureGeometryInstancesDataKHR}{@code ::data} <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies">synchronized</a> with the {@link #VK_PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_KHR PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_KHR} <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-pipeline-stages">pipeline stage</a> and an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-access-types">access type</a> of {@link VK10#VK_ACCESS_SHADER_READ_BIT ACCESS_SHADER_READ_BIT}.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The {@code mode} member of each element of {@code pInfos} <b>must</b> be a valid {@code VkBuildAccelerationStructureModeKHR} value</li>
     * <li>If the {@code srcAccelerationStructure} member of any element of {@code pInfos} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the {@code srcAccelerationStructure} member <b>must</b> be a valid {@code VkAccelerationStructureKHR} handle</li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, its {@code srcAccelerationStructure} member <b>must</b> not be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
     * <li>The {@code srcAccelerationStructure} member of any element of {@code pInfos} <b>must</b> not be the same acceleration structure as the {@code dstAccelerationStructure} member of any other element of {@code pInfos}</li>
     * <li>The {@code dstAccelerationStructure} member of any element of {@code pInfos} <b>must</b> not be the same acceleration structure as the {@code dstAccelerationStructure} member of any other element of {@code pInfos}</li>
     * <li>The {@code dstAccelerationStructure} member of any element of {@code pInfos} <b>must</b> be a valid {@code VkAccelerationStructureKHR} handle</li>
     * <li>For each element of {@code pInfos}, if its {@code type} member is {@link #VK_ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_KHR ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_KHR}, its {@code dstAccelerationStructure} member <b>must</b> have been created with a value of {@link VkAccelerationStructureCreateInfoKHR}{@code ::type} equal to either {@link #VK_ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_KHR ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_KHR} or {@link #VK_ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR}</li>
     * <li>For each element of {@code pInfos}, if its {@code type} member is {@link #VK_ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_KHR ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_KHR}, its {@code dstAccelerationStructure} member <b>must</b> have been created with a value of {@link VkAccelerationStructureCreateInfoKHR}{@code ::type} equal to either {@link #VK_ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_KHR ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_KHR} or {@link #VK_ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR}</li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#acceleration-structure-inactive-prims">inactive primitives</a> in its {@code srcAccelerationStructure} member <b>must</b> not be made active</li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, active primitives in its {@code srcAccelerationStructure} member <b>must</b> not be made <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#acceleration-structure-inactive-prims">inactive</a></li>
     * <li>The {@code dstAccelerationStructure} member of any element of {@code pInfos} <b>must</b> not be referenced by the {@code geometry.instances.data} member of any element of {@code pGeometries} or {@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_INSTANCES_KHR GEOMETRY_TYPE_INSTANCES_KHR} in any other element of {@code pInfos}</li>
     * <li>The range of memory backing the {@code dstAccelerationStructure} member of any element of {@code pInfos} that is accessed by this command <b>must</b> not overlap the memory backing the {@code srcAccelerationStructure} member of any other element of {@code pInfos} with a {@code mode} equal to {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, which is accessed by this command</li>
     * <li>The range of memory backing the {@code dstAccelerationStructure} member of any element of {@code pInfos} that is accessed by this command <b>must</b> not overlap the memory backing the {@code dstAccelerationStructure} member of any other element of {@code pInfos}, which is accessed by this command</li>
     * <li>The range of memory backing the {@code dstAccelerationStructure} member of any element of {@code pInfos} that is accessed by this command <b>must</b> not overlap the memory backing the {@code scratchData} member of any element of {@code pInfos} (including the same element), which is accessed by this command</li>
     * <li>The range of memory backing the {@code scratchData} member of any element of {@code pInfos} that is accessed by this command <b>must</b> not overlap the memory backing the {@code scratchData} member of any other element of {@code pInfos}, which is accessed by this command</li>
     * <li>The range of memory backing the {@code scratchData} member of any element of {@code pInfos} that is accessed by this command <b>must</b> not overlap the memory backing the {@code srcAccelerationStructure} member of any element of {@code pInfos} with a {@code mode} equal to {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR} (including the same element), which is accessed by this command</li>
     * <li>The range of memory backing the {@code dstAccelerationStructure} member of any element of {@code pInfos} that is accessed by this command <b>must</b> not overlap the memory backing any acceleration structure referenced by the {@code geometry.instances.data} member of any element of {@code pGeometries} or {@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_INSTANCES_KHR GEOMETRY_TYPE_INSTANCES_KHR} in any other element of {@code pInfos}, which is accessed by this command</li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, its {@code srcAccelerationStructure} member <b>must</b> have previously been constructed with {@link #VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_UPDATE_BIT_KHR BUILD_ACCELERATION_STRUCTURE_ALLOW_UPDATE_BIT_KHR} set in {@link VkAccelerationStructureBuildGeometryInfoKHR}{@code ::flags} in the build</li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, its {@code srcAccelerationStructure} and {@code dstAccelerationStructure} members <b>must</b> either be the same {@code VkAccelerationStructureKHR}, or not have any <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-memory-aliasing">memory aliasing</a></li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, its {@code geometryCount} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, its {@code flags} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, its {@code type} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, then for each {@link VkAccelerationStructureGeometryKHR} structure referred to by its {@code pGeometries} or {@code ppGeometries} members, its {@code geometryType} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, then for each {@link VkAccelerationStructureGeometryKHR} structure referred to by its {@code pGeometries} or {@code ppGeometries} members, its {@code flags} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, then for each {@link VkAccelerationStructureGeometryKHR} structure referred to by its {@code pGeometries} or {@code ppGeometries} members, if {@code geometryType} is {@link #VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR}, its {@code geometry.triangles.vertexFormat} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, then for each {@link VkAccelerationStructureGeometryKHR} structure referred to by its {@code pGeometries} or {@code ppGeometries} members, if {@code geometryType} is {@link #VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR}, its {@code geometry.triangles.maxVertex} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, then for each {@link VkAccelerationStructureGeometryKHR} structure referred to by its {@code pGeometries} or {@code ppGeometries} members, if {@code geometryType} is {@link #VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR}, its {@code geometry.triangles.indexType} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, then for each {@link VkAccelerationStructureGeometryKHR} structure referred to by its {@code pGeometries} or {@code ppGeometries} members, if {@code geometryType} is {@link #VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR}, if its {@code geometry.triangles.transformData} address was {@code NULL} when {@code srcAccelerationStructure} was last built, then it <b>must</b> be {@code NULL}</li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, then for each {@link VkAccelerationStructureGeometryKHR} structure referred to by its {@code pGeometries} or {@code ppGeometries} members, if {@code geometryType} is {@link #VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR}, if its {@code geometry.triangles.transformData} address was not {@code NULL} when {@code srcAccelerationStructure} was last built, then it <b>must</b> not be {@code NULL}</li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, then for each {@link VkAccelerationStructureGeometryKHR} structure referred to by its {@code pGeometries} or {@code ppGeometries} members, if {@code geometryType} is {@link #VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR}, and {@code geometry.triangles.indexType} is not {@link #VK_INDEX_TYPE_NONE_KHR INDEX_TYPE_NONE_KHR}, then the value of each index referenced <b>must</b> be the same as the corresponding index value when {@code srcAccelerationStructure} was last built</li>
     * <li>For each {@link VkAccelerationStructureBuildRangeInfoKHR} referenced by this command, its {@code primitiveCount} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
     * <li>For each {@link VkAccelerationStructureBuildRangeInfoKHR} referenced by this command, if the corresponding geometry uses indices, its {@code firstVertex} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
     * <li>For each element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_INSTANCES_KHR GEOMETRY_TYPE_INSTANCES_KHR}, the corresponding {@code ppBuildRangeInfos}[i][j].{@code primitiveCount} <b>must</b> be less than or equal to {@link VkPhysicalDeviceAccelerationStructurePropertiesKHR}{@code ::maxInstanceCount}</li>
     * </ul>
     * 
     * <ul>
     * <li>For each element of {@code pInfos}, the {@code buffer} used to create its {@code dstAccelerationStructure} member <b>must</b> be bound to device memory</li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR} the {@code buffer} used to create its {@code srcAccelerationStructure} member <b>must</b> be bound to device memory</li>
     * <li>For each element of {@code pInfos}, the {@code buffer} used to create each acceleration structure referenced by the {@code geometry.instances.data} member of any element of {@code pGeometries} or {@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_INSTANCES_KHR GEOMETRY_TYPE_INSTANCES_KHR} <b>must</b> be bound to device memory</li>
     * <li>If {@code pInfos}[i].{@code mode} is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_BUILD_KHR BUILD_ACCELERATION_STRUCTURE_MODE_BUILD_KHR}, all addresses between {@code pInfos}[i].{@code scratchData.deviceAddress} and {@code pInfos}[i].{@code scratchData.deviceAddress} + N - 1 <b>must</b> be in the buffer device address range of the same buffer, where N is given by the {@code buildScratchSize} member of the {@link VkAccelerationStructureBuildSizesInfoKHR} structure returned from a call to {@link #vkGetAccelerationStructureBuildSizesKHR GetAccelerationStructureBuildSizesKHR} with an identical {@link VkAccelerationStructureBuildGeometryInfoKHR} structure and primitive count</li>
     * <li>If {@code pInfos}[i].{@code mode} is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, all addresses between {@code pInfos}[i].{@code scratchData.deviceAddress} and {@code pInfos}[i].{@code scratchData.deviceAddress} + N - 1 <b>must</b> be in the buffer device address range of the same buffer, where N is given by the {@code updateScratchSize} member of the {@link VkAccelerationStructureBuildSizesInfoKHR} structure returned from a call to {@link #vkGetAccelerationStructureBuildSizesKHR GetAccelerationStructureBuildSizesKHR} with an identical {@link VkAccelerationStructureBuildGeometryInfoKHR} structure and primitive count</li>
     * <li>The buffers from which the buffer device addresses for all of the {@code geometry.triangles.vertexData}, {@code geometry.triangles.indexData}, {@code geometry.triangles.transformData}, {@code geometry.aabbs.data}, and {@code geometry.instances.data} members of all {@code pInfos}[i].{@code pGeometries} and {@code pInfos}[i].{@code ppGeometries} are queried <b>must</b> have been created with the {@link #VK_BUFFER_USAGE_ACCELERATION_STRUCTURE_BUILD_INPUT_READ_ONLY_BIT_KHR BUFFER_USAGE_ACCELERATION_STRUCTURE_BUILD_INPUT_READ_ONLY_BIT_KHR} usage flag</li>
     * <li>The buffer from which the buffer device address {@code pInfos}[i].{@code scratchData.deviceAddress} is queried <b>must</b> have been created with {@link VK10#VK_BUFFER_USAGE_STORAGE_BUFFER_BIT BUFFER_USAGE_STORAGE_BUFFER_BIT} usage flag</li>
     * <li>For each element of {@code pInfos}, its {@code scratchData.deviceAddress} member <b>must</b> be a valid device address obtained from {@link VK12#vkGetBufferDeviceAddress GetBufferDeviceAddress}</li>
     * <li>For each element of {@code pInfos}, if {@code scratchData.deviceAddress} is the address of a non-sparse buffer then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
     * <li>For each element of {@code pInfos}, its {@code scratchData.deviceAddress} member <b>must</b> be a multiple of {@link VkPhysicalDeviceAccelerationStructurePropertiesKHR}{@code ::minAccelerationStructureScratchOffsetAlignment}</li>
     * <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR}, {@code geometry.triangles.vertexData.deviceAddress} <b>must</b> be a valid device address obtained from {@link VK12#vkGetBufferDeviceAddress GetBufferDeviceAddress}</li>
     * <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR}, if {@code geometry.triangles.vertexData.deviceAddress} is the address of a non-sparse buffer then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
     * <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR}, {@code geometry.triangles.vertexData.deviceAddress} <b>must</b> be aligned to the size in bytes of the smallest component of the format in {@code vertexFormat}</li>
     * <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR}, if {@code geometry.triangles.indexType} is not {@link #VK_INDEX_TYPE_NONE_KHR INDEX_TYPE_NONE_KHR}, {@code geometry.triangles.indexData.deviceAddress} <b>must</b> be a valid device address obtained from {@link VK12#vkGetBufferDeviceAddress GetBufferDeviceAddress}</li>
     * <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR}, if {@code geometry.triangles.indexType} is not {@link #VK_INDEX_TYPE_NONE_KHR INDEX_TYPE_NONE_KHR}, if {@code geometry.triangles.indexData.deviceAddress} is the address of a non-sparse buffer then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
     * <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR}, and with {@code geometry.triangles.indexType} not equal to {@link #VK_INDEX_TYPE_NONE_KHR INDEX_TYPE_NONE_KHR}, {@code geometry.triangles.indexData.deviceAddress} <b>must</b> be aligned to the size in bytes of the type in {@code indexType}</li>
     * <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR}, if {@code geometry.triangles.transformData.deviceAddress} is not 0, it <b>must</b> be a valid device address obtained from {@link VK12#vkGetBufferDeviceAddress GetBufferDeviceAddress}</li>
     * <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR}, if {@code geometry.triangles.transformData.deviceAddress} is the address of a non-sparse buffer then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
     * <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR}, if {@code geometry.triangles.transformData.deviceAddress} is not 0, it <b>must</b> be aligned to 16 bytes</li>
     * <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_AABBS_KHR GEOMETRY_TYPE_AABBS_KHR}, {@code geometry.aabbs.data.deviceAddress} <b>must</b> be a valid device address obtained from {@link VK12#vkGetBufferDeviceAddress GetBufferDeviceAddress}</li>
     * <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_AABBS_KHR GEOMETRY_TYPE_AABBS_KHR}, if {@code geometry.aabbs.data.deviceAddress} is the address of a non-sparse buffer then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
     * <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_AABBS_KHR GEOMETRY_TYPE_AABBS_KHR}, {@code geometry.aabbs.data.deviceAddress} <b>must</b> be aligned to 8 bytes</li>
     * <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_INSTANCES_KHR GEOMETRY_TYPE_INSTANCES_KHR}, if {@code geometry.arrayOfPointers} is {@link VK10#VK_FALSE FALSE}, {@code geometry.instances.data.deviceAddress} <b>must</b> be aligned to 16 bytes</li>
     * <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_INSTANCES_KHR GEOMETRY_TYPE_INSTANCES_KHR}, if {@code geometry.arrayOfPointers} is {@link VK10#VK_TRUE TRUE}, {@code geometry.instances.data.deviceAddress} <b>must</b> be aligned to 8 bytes</li>
     * <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_INSTANCES_KHR GEOMETRY_TYPE_INSTANCES_KHR}, if {@code geometry.arrayOfPointers} is {@link VK10#VK_TRUE TRUE}, each element of {@code geometry.instances.data.deviceAddress} in device memory <b>must</b> be aligned to 16 bytes</li>
     * <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_INSTANCES_KHR GEOMETRY_TYPE_INSTANCES_KHR}, {@code geometry.instances.data.deviceAddress} <b>must</b> be a valid device address obtained from {@link VK12#vkGetBufferDeviceAddress GetBufferDeviceAddress}</li>
     * <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_INSTANCES_KHR GEOMETRY_TYPE_INSTANCES_KHR}, if {@code geometry.instances.data.deviceAddress} is the address of a non-sparse buffer then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
     * <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_INSTANCES_KHR GEOMETRY_TYPE_INSTANCES_KHR}, each {@link VkAccelerationStructureInstanceKHR}{@code ::accelerationStructureReference} value in {@code geometry.instances.data.deviceAddress} <b>must</b> be a valid device address containing a value obtained from {@link #vkGetAccelerationStructureDeviceAddressKHR GetAccelerationStructureDeviceAddressKHR}</li>
     * </ul>
     * 
     * <ul>
     * <li>For each {@code pInfos}[i], {@code dstAccelerationStructure} <b>must</b> have been created with a value of {@link VkAccelerationStructureCreateInfoKHR}{@code ::size} greater than or equal to the memory size required by the build operation, as returned by {@link #vkGetAccelerationStructureBuildSizesKHR GetAccelerationStructureBuildSizesKHR} with <code>pBuildInfo = pInfos[i]</code> and with each element of the {@code pMaxPrimitiveCounts} array greater than or equal to the equivalent {@code ppBuildRangeInfos}[i][j].{@code primitiveCount} values for {@code j} in <code>[0,pInfos[i].geometryCount)</code></li>
     * <li>Each element of {@code ppBuildRangeInfos}[i] <b>must</b> be a valid pointer to an array of {@code pInfos}[i].{@code geometryCount} {@link VkAccelerationStructureBuildRangeInfoKHR} structures</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pInfos} <b>must</b> be a valid pointer to an array of {@code infoCount} valid {@link VkAccelerationStructureBuildGeometryInfoKHR} structures</li>
     * <li>{@code ppBuildRangeInfos} <b>must</b> be a valid pointer to an array of {@code infoCount} {@link VkAccelerationStructureBuildRangeInfoKHR} structures</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
     * <li>This command <b>must</b> only be called outside of a render pass instance</li>
     * <li>{@code infoCount} <b>must</b> be greater than 0</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Compute</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAccelerationStructureBuildGeometryInfoKHR}, {@link VkAccelerationStructureBuildRangeInfoKHR}</p>
     *
     * @param commandBuffer     the command buffer into which the command will be recorded.
     * @param pInfos            a pointer to an array of {@code infoCount} {@link VkAccelerationStructureBuildGeometryInfoKHR} structures defining the geometry used to build each acceleration structure.
     * @param ppBuildRangeInfos a pointer to an array of {@code infoCount} pointers to arrays of {@link VkAccelerationStructureBuildRangeInfoKHR} structures. Each {@code ppBuildRangeInfos}[i] is a pointer to an array of {@code pInfos}[i].{@code geometryCount} {@link VkAccelerationStructureBuildRangeInfoKHR} structures defining dynamic offsets to the addresses where geometry data is stored, as defined by {@code pInfos}[i].
     */
    public static void vkCmdBuildAccelerationStructuresKHR(VkCommandBuffer commandBuffer, @NativeType("VkAccelerationStructureBuildGeometryInfoKHR const *") VkAccelerationStructureBuildGeometryInfoKHR.Buffer pInfos, @NativeType("VkAccelerationStructureBuildRangeInfoKHR const * const *") PointerBuffer ppBuildRangeInfos) {
        if (CHECKS) {
            check(ppBuildRangeInfos, pInfos.remaining());
        }
        nvkCmdBuildAccelerationStructuresKHR(commandBuffer, pInfos.remaining(), pInfos.address(), memAddress(ppBuildRangeInfos));
    }

    // --- [ vkCmdBuildAccelerationStructuresIndirectKHR ] ---

    /**
     * Unsafe version of: {@link #vkCmdBuildAccelerationStructuresIndirectKHR CmdBuildAccelerationStructuresIndirectKHR}
     *
     * @param infoCount the number of acceleration structures to build.
     */
    public static void nvkCmdBuildAccelerationStructuresIndirectKHR(VkCommandBuffer commandBuffer, int infoCount, long pInfos, long pIndirectDeviceAddresses, long pIndirectStrides, long ppMaxPrimitiveCounts) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBuildAccelerationStructuresIndirectKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPPPV(commandBuffer.address(), infoCount, pInfos, pIndirectDeviceAddresses, pIndirectStrides, ppMaxPrimitiveCounts, __functionAddress);
    }

    /**
     * Build an acceleration structure with some parameters provided on the device.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To build acceleration structures with some parameters sourced on the device call:</p>
     * 
     * <pre><code>
     * void vkCmdBuildAccelerationStructuresIndirectKHR(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    infoCount,
     *     const VkAccelerationStructureBuildGeometryInfoKHR* pInfos,
     *     const VkDeviceAddress*                      pIndirectDeviceAddresses,
     *     const uint32_t*                             pIndirectStrides,
     *     const uint32_t* const*                      ppMaxPrimitiveCounts);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Accesses to acceleration structures, scratch buffers, vertex buffers, index buffers, and instance buffers must be synchronized as with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#acceleration-structure-scratch">vkCmdBuildAccelerationStructuresKHR</a>.</p>
     * 
     * <p>Accesses to any element of {@code pIndirectDeviceAddresses} <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies">synchronized</a> with the {@link #VK_PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_KHR PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_KHR} <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-pipeline-stages">pipeline stage</a> and an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-access-types">access type</a> of {@link VK10#VK_ACCESS_INDIRECT_COMMAND_READ_BIT ACCESS_INDIRECT_COMMAND_READ_BIT}.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The {@code mode} member of each element of {@code pInfos} <b>must</b> be a valid {@code VkBuildAccelerationStructureModeKHR} value</li>
     * <li>If the {@code srcAccelerationStructure} member of any element of {@code pInfos} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the {@code srcAccelerationStructure} member <b>must</b> be a valid {@code VkAccelerationStructureKHR} handle</li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, its {@code srcAccelerationStructure} member <b>must</b> not be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
     * <li>The {@code srcAccelerationStructure} member of any element of {@code pInfos} <b>must</b> not be the same acceleration structure as the {@code dstAccelerationStructure} member of any other element of {@code pInfos}</li>
     * <li>The {@code dstAccelerationStructure} member of any element of {@code pInfos} <b>must</b> not be the same acceleration structure as the {@code dstAccelerationStructure} member of any other element of {@code pInfos}</li>
     * <li>The {@code dstAccelerationStructure} member of any element of {@code pInfos} <b>must</b> be a valid {@code VkAccelerationStructureKHR} handle</li>
     * <li>For each element of {@code pInfos}, if its {@code type} member is {@link #VK_ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_KHR ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_KHR}, its {@code dstAccelerationStructure} member <b>must</b> have been created with a value of {@link VkAccelerationStructureCreateInfoKHR}{@code ::type} equal to either {@link #VK_ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_KHR ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_KHR} or {@link #VK_ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR}</li>
     * <li>For each element of {@code pInfos}, if its {@code type} member is {@link #VK_ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_KHR ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_KHR}, its {@code dstAccelerationStructure} member <b>must</b> have been created with a value of {@link VkAccelerationStructureCreateInfoKHR}{@code ::type} equal to either {@link #VK_ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_KHR ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_KHR} or {@link #VK_ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR}</li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#acceleration-structure-inactive-prims">inactive primitives</a> in its {@code srcAccelerationStructure} member <b>must</b> not be made active</li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, active primitives in its {@code srcAccelerationStructure} member <b>must</b> not be made <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#acceleration-structure-inactive-prims">inactive</a></li>
     * <li>The {@code dstAccelerationStructure} member of any element of {@code pInfos} <b>must</b> not be referenced by the {@code geometry.instances.data} member of any element of {@code pGeometries} or {@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_INSTANCES_KHR GEOMETRY_TYPE_INSTANCES_KHR} in any other element of {@code pInfos}</li>
     * <li>The range of memory backing the {@code dstAccelerationStructure} member of any element of {@code pInfos} that is accessed by this command <b>must</b> not overlap the memory backing the {@code srcAccelerationStructure} member of any other element of {@code pInfos} with a {@code mode} equal to {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, which is accessed by this command</li>
     * <li>The range of memory backing the {@code dstAccelerationStructure} member of any element of {@code pInfos} that is accessed by this command <b>must</b> not overlap the memory backing the {@code dstAccelerationStructure} member of any other element of {@code pInfos}, which is accessed by this command</li>
     * <li>The range of memory backing the {@code dstAccelerationStructure} member of any element of {@code pInfos} that is accessed by this command <b>must</b> not overlap the memory backing the {@code scratchData} member of any element of {@code pInfos} (including the same element), which is accessed by this command</li>
     * <li>The range of memory backing the {@code scratchData} member of any element of {@code pInfos} that is accessed by this command <b>must</b> not overlap the memory backing the {@code scratchData} member of any other element of {@code pInfos}, which is accessed by this command</li>
     * <li>The range of memory backing the {@code scratchData} member of any element of {@code pInfos} that is accessed by this command <b>must</b> not overlap the memory backing the {@code srcAccelerationStructure} member of any element of {@code pInfos} with a {@code mode} equal to {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR} (including the same element), which is accessed by this command</li>
     * <li>The range of memory backing the {@code dstAccelerationStructure} member of any element of {@code pInfos} that is accessed by this command <b>must</b> not overlap the memory backing any acceleration structure referenced by the {@code geometry.instances.data} member of any element of {@code pGeometries} or {@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_INSTANCES_KHR GEOMETRY_TYPE_INSTANCES_KHR} in any other element of {@code pInfos}, which is accessed by this command</li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, its {@code srcAccelerationStructure} member <b>must</b> have previously been constructed with {@link #VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_UPDATE_BIT_KHR BUILD_ACCELERATION_STRUCTURE_ALLOW_UPDATE_BIT_KHR} set in {@link VkAccelerationStructureBuildGeometryInfoKHR}{@code ::flags} in the build</li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, its {@code srcAccelerationStructure} and {@code dstAccelerationStructure} members <b>must</b> either be the same {@code VkAccelerationStructureKHR}, or not have any <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-memory-aliasing">memory aliasing</a></li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, its {@code geometryCount} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, its {@code flags} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, its {@code type} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, then for each {@link VkAccelerationStructureGeometryKHR} structure referred to by its {@code pGeometries} or {@code ppGeometries} members, its {@code geometryType} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, then for each {@link VkAccelerationStructureGeometryKHR} structure referred to by its {@code pGeometries} or {@code ppGeometries} members, its {@code flags} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, then for each {@link VkAccelerationStructureGeometryKHR} structure referred to by its {@code pGeometries} or {@code ppGeometries} members, if {@code geometryType} is {@link #VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR}, its {@code geometry.triangles.vertexFormat} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, then for each {@link VkAccelerationStructureGeometryKHR} structure referred to by its {@code pGeometries} or {@code ppGeometries} members, if {@code geometryType} is {@link #VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR}, its {@code geometry.triangles.maxVertex} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, then for each {@link VkAccelerationStructureGeometryKHR} structure referred to by its {@code pGeometries} or {@code ppGeometries} members, if {@code geometryType} is {@link #VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR}, its {@code geometry.triangles.indexType} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, then for each {@link VkAccelerationStructureGeometryKHR} structure referred to by its {@code pGeometries} or {@code ppGeometries} members, if {@code geometryType} is {@link #VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR}, if its {@code geometry.triangles.transformData} address was {@code NULL} when {@code srcAccelerationStructure} was last built, then it <b>must</b> be {@code NULL}</li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, then for each {@link VkAccelerationStructureGeometryKHR} structure referred to by its {@code pGeometries} or {@code ppGeometries} members, if {@code geometryType} is {@link #VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR}, if its {@code geometry.triangles.transformData} address was not {@code NULL} when {@code srcAccelerationStructure} was last built, then it <b>must</b> not be {@code NULL}</li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, then for each {@link VkAccelerationStructureGeometryKHR} structure referred to by its {@code pGeometries} or {@code ppGeometries} members, if {@code geometryType} is {@link #VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR}, and {@code geometry.triangles.indexType} is not {@link #VK_INDEX_TYPE_NONE_KHR INDEX_TYPE_NONE_KHR}, then the value of each index referenced <b>must</b> be the same as the corresponding index value when {@code srcAccelerationStructure} was last built</li>
     * <li>For each {@link VkAccelerationStructureBuildRangeInfoKHR} referenced by this command, its {@code primitiveCount} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
     * <li>For each {@link VkAccelerationStructureBuildRangeInfoKHR} referenced by this command, if the corresponding geometry uses indices, its {@code firstVertex} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
     * <li>For each element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_INSTANCES_KHR GEOMETRY_TYPE_INSTANCES_KHR}, the corresponding {@code ppMaxPrimitiveCounts}[i][j] <b>must</b> be less than or equal to {@link VkPhysicalDeviceAccelerationStructurePropertiesKHR}{@code ::maxInstanceCount}</li>
     * </ul>
     * 
     * <ul>
     * <li>For each element of {@code pInfos}, the {@code buffer} used to create its {@code dstAccelerationStructure} member <b>must</b> be bound to device memory</li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR} the {@code buffer} used to create its {@code srcAccelerationStructure} member <b>must</b> be bound to device memory</li>
     * <li>For each element of {@code pInfos}, the {@code buffer} used to create each acceleration structure referenced by the {@code geometry.instances.data} member of any element of {@code pGeometries} or {@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_INSTANCES_KHR GEOMETRY_TYPE_INSTANCES_KHR} <b>must</b> be bound to device memory</li>
     * <li>If {@code pInfos}[i].{@code mode} is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_BUILD_KHR BUILD_ACCELERATION_STRUCTURE_MODE_BUILD_KHR}, all addresses between {@code pInfos}[i].{@code scratchData.deviceAddress} and {@code pInfos}[i].{@code scratchData.deviceAddress} + N - 1 <b>must</b> be in the buffer device address range of the same buffer, where N is given by the {@code buildScratchSize} member of the {@link VkAccelerationStructureBuildSizesInfoKHR} structure returned from a call to {@link #vkGetAccelerationStructureBuildSizesKHR GetAccelerationStructureBuildSizesKHR} with an identical {@link VkAccelerationStructureBuildGeometryInfoKHR} structure and primitive count</li>
     * <li>If {@code pInfos}[i].{@code mode} is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, all addresses between {@code pInfos}[i].{@code scratchData.deviceAddress} and {@code pInfos}[i].{@code scratchData.deviceAddress} + N - 1 <b>must</b> be in the buffer device address range of the same buffer, where N is given by the {@code updateScratchSize} member of the {@link VkAccelerationStructureBuildSizesInfoKHR} structure returned from a call to {@link #vkGetAccelerationStructureBuildSizesKHR GetAccelerationStructureBuildSizesKHR} with an identical {@link VkAccelerationStructureBuildGeometryInfoKHR} structure and primitive count</li>
     * <li>The buffers from which the buffer device addresses for all of the {@code geometry.triangles.vertexData}, {@code geometry.triangles.indexData}, {@code geometry.triangles.transformData}, {@code geometry.aabbs.data}, and {@code geometry.instances.data} members of all {@code pInfos}[i].{@code pGeometries} and {@code pInfos}[i].{@code ppGeometries} are queried <b>must</b> have been created with the {@link #VK_BUFFER_USAGE_ACCELERATION_STRUCTURE_BUILD_INPUT_READ_ONLY_BIT_KHR BUFFER_USAGE_ACCELERATION_STRUCTURE_BUILD_INPUT_READ_ONLY_BIT_KHR} usage flag</li>
     * <li>The buffer from which the buffer device address {@code pInfos}[i].{@code scratchData.deviceAddress} is queried <b>must</b> have been created with {@link VK10#VK_BUFFER_USAGE_STORAGE_BUFFER_BIT BUFFER_USAGE_STORAGE_BUFFER_BIT} usage flag</li>
     * <li>For each element of {@code pInfos}, its {@code scratchData.deviceAddress} member <b>must</b> be a valid device address obtained from {@link VK12#vkGetBufferDeviceAddress GetBufferDeviceAddress}</li>
     * <li>For each element of {@code pInfos}, if {@code scratchData.deviceAddress} is the address of a non-sparse buffer then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
     * <li>For each element of {@code pInfos}, its {@code scratchData.deviceAddress} member <b>must</b> be a multiple of {@link VkPhysicalDeviceAccelerationStructurePropertiesKHR}{@code ::minAccelerationStructureScratchOffsetAlignment}</li>
     * <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR}, {@code geometry.triangles.vertexData.deviceAddress} <b>must</b> be a valid device address obtained from {@link VK12#vkGetBufferDeviceAddress GetBufferDeviceAddress}</li>
     * <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR}, if {@code geometry.triangles.vertexData.deviceAddress} is the address of a non-sparse buffer then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
     * <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR}, {@code geometry.triangles.vertexData.deviceAddress} <b>must</b> be aligned to the size in bytes of the smallest component of the format in {@code vertexFormat}</li>
     * <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR}, if {@code geometry.triangles.indexType} is not {@link #VK_INDEX_TYPE_NONE_KHR INDEX_TYPE_NONE_KHR}, {@code geometry.triangles.indexData.deviceAddress} <b>must</b> be a valid device address obtained from {@link VK12#vkGetBufferDeviceAddress GetBufferDeviceAddress}</li>
     * <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR}, if {@code geometry.triangles.indexType} is not {@link #VK_INDEX_TYPE_NONE_KHR INDEX_TYPE_NONE_KHR}, if {@code geometry.triangles.indexData.deviceAddress} is the address of a non-sparse buffer then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
     * <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR}, and with {@code geometry.triangles.indexType} not equal to {@link #VK_INDEX_TYPE_NONE_KHR INDEX_TYPE_NONE_KHR}, {@code geometry.triangles.indexData.deviceAddress} <b>must</b> be aligned to the size in bytes of the type in {@code indexType}</li>
     * <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR}, if {@code geometry.triangles.transformData.deviceAddress} is not 0, it <b>must</b> be a valid device address obtained from {@link VK12#vkGetBufferDeviceAddress GetBufferDeviceAddress}</li>
     * <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR}, if {@code geometry.triangles.transformData.deviceAddress} is the address of a non-sparse buffer then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
     * <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR}, if {@code geometry.triangles.transformData.deviceAddress} is not 0, it <b>must</b> be aligned to 16 bytes</li>
     * <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_AABBS_KHR GEOMETRY_TYPE_AABBS_KHR}, {@code geometry.aabbs.data.deviceAddress} <b>must</b> be a valid device address obtained from {@link VK12#vkGetBufferDeviceAddress GetBufferDeviceAddress}</li>
     * <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_AABBS_KHR GEOMETRY_TYPE_AABBS_KHR}, if {@code geometry.aabbs.data.deviceAddress} is the address of a non-sparse buffer then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
     * <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_AABBS_KHR GEOMETRY_TYPE_AABBS_KHR}, {@code geometry.aabbs.data.deviceAddress} <b>must</b> be aligned to 8 bytes</li>
     * <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_INSTANCES_KHR GEOMETRY_TYPE_INSTANCES_KHR}, if {@code geometry.arrayOfPointers} is {@link VK10#VK_FALSE FALSE}, {@code geometry.instances.data.deviceAddress} <b>must</b> be aligned to 16 bytes</li>
     * <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_INSTANCES_KHR GEOMETRY_TYPE_INSTANCES_KHR}, if {@code geometry.arrayOfPointers} is {@link VK10#VK_TRUE TRUE}, {@code geometry.instances.data.deviceAddress} <b>must</b> be aligned to 8 bytes</li>
     * <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_INSTANCES_KHR GEOMETRY_TYPE_INSTANCES_KHR}, if {@code geometry.arrayOfPointers} is {@link VK10#VK_TRUE TRUE}, each element of {@code geometry.instances.data.deviceAddress} in device memory <b>must</b> be aligned to 16 bytes</li>
     * <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_INSTANCES_KHR GEOMETRY_TYPE_INSTANCES_KHR}, {@code geometry.instances.data.deviceAddress} <b>must</b> be a valid device address obtained from {@link VK12#vkGetBufferDeviceAddress GetBufferDeviceAddress}</li>
     * <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_INSTANCES_KHR GEOMETRY_TYPE_INSTANCES_KHR}, if {@code geometry.instances.data.deviceAddress} is the address of a non-sparse buffer then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
     * <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_INSTANCES_KHR GEOMETRY_TYPE_INSTANCES_KHR}, each {@link VkAccelerationStructureInstanceKHR}{@code ::accelerationStructureReference} value in {@code geometry.instances.data.deviceAddress} <b>must</b> be a valid device address containing a value obtained from {@link #vkGetAccelerationStructureDeviceAddressKHR GetAccelerationStructureDeviceAddressKHR}</li>
     * <li>For any element of {@code pIndirectDeviceAddresses}, if the buffer from which it was queried is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
     * <li>For any element of {@code pIndirectDeviceAddresses}[i], all device addresses between {@code pIndirectDeviceAddresses}[i] and <code>pIndirectDeviceAddresses[i] + (pInfos[i].geometryCount × pIndirectStrides[i]) - 1</code> <b>must</b> be in the buffer device address range of the same buffer</li>
     * <li>For any element of {@code pIndirectDeviceAddresses}, the buffer from which it was queried <b>must</b> have been created with the {@link VK10#VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT BUFFER_USAGE_INDIRECT_BUFFER_BIT} bit set</li>
     * <li>Each element of {@code pIndirectDeviceAddresses} <b>must</b> be a multiple of 4</li>
     * <li>Each element of {@code pIndirectStrides} <b>must</b> be a multiple of 4</li>
     * <li>{@code commandBuffer} <b>must</b> not be a protected command buffer</li>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-accelerationStructureIndirectBuild">{@link VkPhysicalDeviceAccelerationStructureFeaturesKHR}{@code ::accelerationStructureIndirectBuild}</a> feature <b>must</b> be enabled</li>
     * <li>Each {@link VkAccelerationStructureBuildRangeInfoKHR} structure referenced by any element of {@code pIndirectDeviceAddresses} <b>must</b> be a valid {@link VkAccelerationStructureBuildRangeInfoKHR} structure</li>
     * <li>{@code pInfos}[i].{@code dstAccelerationStructure} <b>must</b> have been created with a value of {@link VkAccelerationStructureCreateInfoKHR}{@code ::size} greater than or equal to the memory size required by the build operation, as returned by {@link #vkGetAccelerationStructureBuildSizesKHR GetAccelerationStructureBuildSizesKHR} with <code>pBuildInfo = pInfos[i]</code> and <code>pMaxPrimitiveCounts = ppMaxPrimitiveCounts[i]</code></li>
     * <li>Each {@code ppMaxPrimitiveCounts}[i][j] <b>must</b> be greater than or equal to the the {@code primitiveCount} value specified by the {@link VkAccelerationStructureBuildRangeInfoKHR} structure located at <code>pIndirectDeviceAddresses[i] + (j × pIndirectStrides[i])</code></li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pInfos} <b>must</b> be a valid pointer to an array of {@code infoCount} valid {@link VkAccelerationStructureBuildGeometryInfoKHR} structures</li>
     * <li>{@code pIndirectDeviceAddresses} <b>must</b> be a valid pointer to an array of {@code infoCount} {@code VkDeviceAddress} values</li>
     * <li>{@code pIndirectStrides} <b>must</b> be a valid pointer to an array of {@code infoCount} {@code uint32_t} values</li>
     * <li>{@code ppMaxPrimitiveCounts} <b>must</b> be a valid pointer to an array of {@code infoCount} {@code uint32_t} values</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
     * <li>This command <b>must</b> only be called outside of a render pass instance</li>
     * <li>{@code infoCount} <b>must</b> be greater than 0</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Compute</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAccelerationStructureBuildGeometryInfoKHR}</p>
     *
     * @param commandBuffer            the command buffer into which the command will be recorded.
     * @param pInfos                   a pointer to an array of {@code infoCount} {@link VkAccelerationStructureBuildGeometryInfoKHR} structures defining the geometry used to build each acceleration structure.
     * @param pIndirectDeviceAddresses a pointer to an array of {@code infoCount} buffer device addresses which point to {@code pInfos}[i].{@code geometryCount} {@link VkAccelerationStructureBuildRangeInfoKHR} structures defining dynamic offsets to the addresses where geometry data is stored, as defined by {@code pInfos}[i].
     * @param pIndirectStrides         a pointer to an array of {@code infoCount} byte strides between elements of {@code pIndirectDeviceAddresses}.
     * @param ppMaxPrimitiveCounts     a pointer to an array of {@code infoCount} pointers to arrays of {@code pInfos}[i].{@code geometryCount} values indicating the maximum number of primitives that will be built by this command for each geometry.
     */
    public static void vkCmdBuildAccelerationStructuresIndirectKHR(VkCommandBuffer commandBuffer, @NativeType("VkAccelerationStructureBuildGeometryInfoKHR const *") VkAccelerationStructureBuildGeometryInfoKHR.Buffer pInfos, @NativeType("VkDeviceAddress const *") LongBuffer pIndirectDeviceAddresses, @NativeType("uint32_t const *") IntBuffer pIndirectStrides, @NativeType("uint32_t const * const *") PointerBuffer ppMaxPrimitiveCounts) {
        if (CHECKS) {
            check(pIndirectDeviceAddresses, pInfos.remaining());
            check(pIndirectStrides, pInfos.remaining());
            check(ppMaxPrimitiveCounts, pInfos.remaining());
        }
        nvkCmdBuildAccelerationStructuresIndirectKHR(commandBuffer, pInfos.remaining(), pInfos.address(), memAddress(pIndirectDeviceAddresses), memAddress(pIndirectStrides), memAddress(ppMaxPrimitiveCounts));
    }

    // --- [ vkBuildAccelerationStructuresKHR ] ---

    /**
     * Unsafe version of: {@link #vkBuildAccelerationStructuresKHR BuildAccelerationStructuresKHR}
     *
     * @param infoCount the number of acceleration structures to build. It specifies the number of the {@code pInfos} structures and {@code ppBuildRangeInfos} pointers that <b>must</b> be provided.
     */
    public static int nvkBuildAccelerationStructuresKHR(VkDevice device, long deferredOperation, int infoCount, long pInfos, long ppBuildRangeInfos) {
        long __functionAddress = device.getCapabilities().vkBuildAccelerationStructuresKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(device.address(), deferredOperation, infoCount, pInfos, ppBuildRangeInfos, __functionAddress);
    }

    /**
     * Build an acceleration structure on the host.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To build acceleration structures on the host, call:</p>
     * 
     * <pre><code>
     * VkResult vkBuildAccelerationStructuresKHR(
     *     VkDevice                                    device,
     *     VkDeferredOperationKHR                      deferredOperation,
     *     uint32_t                                    infoCount,
     *     const VkAccelerationStructureBuildGeometryInfoKHR* pInfos,
     *     const VkAccelerationStructureBuildRangeInfoKHR* const* ppBuildRangeInfos);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command fulfills the same task as {@link #vkCmdBuildAccelerationStructuresKHR CmdBuildAccelerationStructuresKHR} but is executed by the host.</p>
     * 
     * <p>The {@code vkBuildAccelerationStructuresKHR} command provides the ability to initiate multiple acceleration structures builds, however there is no ordering or synchronization implied between any of the individual acceleration structure builds.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>This means that an application <b>cannot</b> build a top-level acceleration structure in the same {@link #vkBuildAccelerationStructuresKHR BuildAccelerationStructuresKHR} call as the associated bottom-level or instance acceleration structures are being built. There also <b>cannot</b> be any memory aliasing between any acceleration structure memories or scratch memories being used by any of the builds.</p>
     * </div>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The {@code mode} member of each element of {@code pInfos} <b>must</b> be a valid {@code VkBuildAccelerationStructureModeKHR} value</li>
     * <li>If the {@code srcAccelerationStructure} member of any element of {@code pInfos} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the {@code srcAccelerationStructure} member <b>must</b> be a valid {@code VkAccelerationStructureKHR} handle</li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, its {@code srcAccelerationStructure} member <b>must</b> not be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
     * <li>The {@code srcAccelerationStructure} member of any element of {@code pInfos} <b>must</b> not be the same acceleration structure as the {@code dstAccelerationStructure} member of any other element of {@code pInfos}</li>
     * <li>The {@code dstAccelerationStructure} member of any element of {@code pInfos} <b>must</b> not be the same acceleration structure as the {@code dstAccelerationStructure} member of any other element of {@code pInfos}</li>
     * <li>The {@code dstAccelerationStructure} member of any element of {@code pInfos} <b>must</b> be a valid {@code VkAccelerationStructureKHR} handle</li>
     * <li>For each element of {@code pInfos}, if its {@code type} member is {@link #VK_ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_KHR ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_KHR}, its {@code dstAccelerationStructure} member <b>must</b> have been created with a value of {@link VkAccelerationStructureCreateInfoKHR}{@code ::type} equal to either {@link #VK_ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_KHR ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_KHR} or {@link #VK_ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR}</li>
     * <li>For each element of {@code pInfos}, if its {@code type} member is {@link #VK_ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_KHR ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_KHR}, its {@code dstAccelerationStructure} member <b>must</b> have been created with a value of {@link VkAccelerationStructureCreateInfoKHR}{@code ::type} equal to either {@link #VK_ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_KHR ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_KHR} or {@link #VK_ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR}</li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#acceleration-structure-inactive-prims">inactive primitives</a> in its {@code srcAccelerationStructure} member <b>must</b> not be made active</li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, active primitives in its {@code srcAccelerationStructure} member <b>must</b> not be made <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#acceleration-structure-inactive-prims">inactive</a></li>
     * <li>The {@code dstAccelerationStructure} member of any element of {@code pInfos} <b>must</b> not be referenced by the {@code geometry.instances.data} member of any element of {@code pGeometries} or {@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_INSTANCES_KHR GEOMETRY_TYPE_INSTANCES_KHR} in any other element of {@code pInfos}</li>
     * <li>The range of memory backing the {@code dstAccelerationStructure} member of any element of {@code pInfos} that is accessed by this command <b>must</b> not overlap the memory backing the {@code srcAccelerationStructure} member of any other element of {@code pInfos} with a {@code mode} equal to {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, which is accessed by this command</li>
     * <li>The range of memory backing the {@code dstAccelerationStructure} member of any element of {@code pInfos} that is accessed by this command <b>must</b> not overlap the memory backing the {@code dstAccelerationStructure} member of any other element of {@code pInfos}, which is accessed by this command</li>
     * <li>The range of memory backing the {@code dstAccelerationStructure} member of any element of {@code pInfos} that is accessed by this command <b>must</b> not overlap the memory backing the {@code scratchData} member of any element of {@code pInfos} (including the same element), which is accessed by this command</li>
     * <li>The range of memory backing the {@code scratchData} member of any element of {@code pInfos} that is accessed by this command <b>must</b> not overlap the memory backing the {@code scratchData} member of any other element of {@code pInfos}, which is accessed by this command</li>
     * <li>The range of memory backing the {@code scratchData} member of any element of {@code pInfos} that is accessed by this command <b>must</b> not overlap the memory backing the {@code srcAccelerationStructure} member of any element of {@code pInfos} with a {@code mode} equal to {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR} (including the same element), which is accessed by this command</li>
     * <li>The range of memory backing the {@code dstAccelerationStructure} member of any element of {@code pInfos} that is accessed by this command <b>must</b> not overlap the memory backing any acceleration structure referenced by the {@code geometry.instances.data} member of any element of {@code pGeometries} or {@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_INSTANCES_KHR GEOMETRY_TYPE_INSTANCES_KHR} in any other element of {@code pInfos}, which is accessed by this command</li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, its {@code srcAccelerationStructure} member <b>must</b> have previously been constructed with {@link #VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_UPDATE_BIT_KHR BUILD_ACCELERATION_STRUCTURE_ALLOW_UPDATE_BIT_KHR} set in {@link VkAccelerationStructureBuildGeometryInfoKHR}{@code ::flags} in the build</li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, its {@code srcAccelerationStructure} and {@code dstAccelerationStructure} members <b>must</b> either be the same {@code VkAccelerationStructureKHR}, or not have any <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-memory-aliasing">memory aliasing</a></li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, its {@code geometryCount} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, its {@code flags} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, its {@code type} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, then for each {@link VkAccelerationStructureGeometryKHR} structure referred to by its {@code pGeometries} or {@code ppGeometries} members, its {@code geometryType} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, then for each {@link VkAccelerationStructureGeometryKHR} structure referred to by its {@code pGeometries} or {@code ppGeometries} members, its {@code flags} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, then for each {@link VkAccelerationStructureGeometryKHR} structure referred to by its {@code pGeometries} or {@code ppGeometries} members, if {@code geometryType} is {@link #VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR}, its {@code geometry.triangles.vertexFormat} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, then for each {@link VkAccelerationStructureGeometryKHR} structure referred to by its {@code pGeometries} or {@code ppGeometries} members, if {@code geometryType} is {@link #VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR}, its {@code geometry.triangles.maxVertex} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, then for each {@link VkAccelerationStructureGeometryKHR} structure referred to by its {@code pGeometries} or {@code ppGeometries} members, if {@code geometryType} is {@link #VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR}, its {@code geometry.triangles.indexType} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, then for each {@link VkAccelerationStructureGeometryKHR} structure referred to by its {@code pGeometries} or {@code ppGeometries} members, if {@code geometryType} is {@link #VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR}, if its {@code geometry.triangles.transformData} address was {@code NULL} when {@code srcAccelerationStructure} was last built, then it <b>must</b> be {@code NULL}</li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, then for each {@link VkAccelerationStructureGeometryKHR} structure referred to by its {@code pGeometries} or {@code ppGeometries} members, if {@code geometryType} is {@link #VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR}, if its {@code geometry.triangles.transformData} address was not {@code NULL} when {@code srcAccelerationStructure} was last built, then it <b>must</b> not be {@code NULL}</li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, then for each {@link VkAccelerationStructureGeometryKHR} structure referred to by its {@code pGeometries} or {@code ppGeometries} members, if {@code geometryType} is {@link #VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR}, and {@code geometry.triangles.indexType} is not {@link #VK_INDEX_TYPE_NONE_KHR INDEX_TYPE_NONE_KHR}, then the value of each index referenced <b>must</b> be the same as the corresponding index value when {@code srcAccelerationStructure} was last built</li>
     * <li>For each {@link VkAccelerationStructureBuildRangeInfoKHR} referenced by this command, its {@code primitiveCount} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
     * <li>For each {@link VkAccelerationStructureBuildRangeInfoKHR} referenced by this command, if the corresponding geometry uses indices, its {@code firstVertex} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
     * <li>For each element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_INSTANCES_KHR GEOMETRY_TYPE_INSTANCES_KHR}, the corresponding {@code ppBuildRangeInfos}[i][j].{@code primitiveCount} <b>must</b> be less than or equal to {@link VkPhysicalDeviceAccelerationStructurePropertiesKHR}{@code ::maxInstanceCount}</li>
     * </ul>
     * 
     * <ul>
     * <li>For each {@code pInfos}[i], {@code dstAccelerationStructure} <b>must</b> have been created with a value of {@link VkAccelerationStructureCreateInfoKHR}{@code ::size} greater than or equal to the memory size required by the build operation, as returned by {@link #vkGetAccelerationStructureBuildSizesKHR GetAccelerationStructureBuildSizesKHR} with <code>pBuildInfo = pInfos[i]</code> and with each element of the {@code pMaxPrimitiveCounts} array greater than or equal to the equivalent {@code ppBuildRangeInfos}[i][j].{@code primitiveCount} values for {@code j} in <code>[0,pInfos[i].geometryCount)</code></li>
     * <li>Each element of {@code ppBuildRangeInfos}[i] <b>must</b> be a valid pointer to an array of {@code pInfos}[i].{@code geometryCount} {@link VkAccelerationStructureBuildRangeInfoKHR} structures</li>
     * </ul>
     * 
     * <ul>
     * <li>If {@code deferredOperation} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, it <b>must</b> be a valid {@code VkDeferredOperationKHR} object</li>
     * <li>Any previous deferred operation that was associated with {@code deferredOperation} <b>must</b> be complete</li>
     * <li>For each element of {@code pInfos}, the {@code buffer} used to create its {@code dstAccelerationStructure} member <b>must</b> be bound to host-visible device memory</li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR} the {@code buffer} used to create its {@code srcAccelerationStructure} member <b>must</b> be bound to host-visible device memory</li>
     * <li>For each element of {@code pInfos}, the {@code buffer} used to create each acceleration structure referenced by the {@code geometry.instances.data} member of any element of {@code pGeometries} or {@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_INSTANCES_KHR GEOMETRY_TYPE_INSTANCES_KHR} <b>must</b> be bound to host-visible device memory</li>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-accelerationStructureHostCommands">{@link VkPhysicalDeviceAccelerationStructureFeaturesKHR}{@code ::accelerationStructureHostCommands}</a> feature <b>must</b> be enabled</li>
     * <li>If {@code pInfos}[i].{@code mode} is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_BUILD_KHR BUILD_ACCELERATION_STRUCTURE_MODE_BUILD_KHR}, all addresses between {@code pInfos}[i].{@code scratchData.hostAddress} and {@code pInfos}[i].{@code scratchData.hostAddress} + N - 1 <b>must</b> be valid host memory, where N is given by the {@code buildScratchSize} member of the {@link VkAccelerationStructureBuildSizesInfoKHR} structure returned from a call to {@link #vkGetAccelerationStructureBuildSizesKHR GetAccelerationStructureBuildSizesKHR} with an identical {@link VkAccelerationStructureBuildGeometryInfoKHR} structure and primitive count</li>
     * <li>If {@code pInfos}[i].{@code mode} is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR}, all addresses between {@code pInfos}[i].{@code scratchData.hostAddress} and {@code pInfos}[i].{@code scratchData.hostAddress} + N - 1 <b>must</b> be valid host memory, where N is given by the {@code updateScratchSize} member of the {@link VkAccelerationStructureBuildSizesInfoKHR} structure returned from a call to {@link #vkGetAccelerationStructureBuildSizesKHR GetAccelerationStructureBuildSizesKHR} with an identical {@link VkAccelerationStructureBuildGeometryInfoKHR} structure and primitive count</li>
     * <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR}, {@code geometry.triangles.vertexData.hostAddress} <b>must</b> be a valid host address</li>
     * <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR}, if {@code geometry.triangles.indexType} is not {@link #VK_INDEX_TYPE_NONE_KHR INDEX_TYPE_NONE_KHR}, {@code geometry.triangles.indexData.hostAddress} <b>must</b> be a valid host address</li>
     * <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR}, if {@code geometry.triangles.transformData.hostAddress} is not 0, it <b>must</b> be a valid host address</li>
     * <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_AABBS_KHR GEOMETRY_TYPE_AABBS_KHR}, {@code geometry.aabbs.data.hostAddress} <b>must</b> be a valid host address</li>
     * <li>For each element of {@code pInfos}, the {@code buffer} used to create its {@code dstAccelerationStructure} member <b>must</b> be bound to memory that was not allocated with multiple instances</li>
     * <li>For each element of {@code pInfos}, if its {@code mode} member is {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR} the {@code buffer} used to create its {@code srcAccelerationStructure} member <b>must</b> be bound to memory that was not allocated with multiple instances</li>
     * <li>For each element of {@code pInfos}, the {@code buffer} used to create each acceleration structure referenced by the {@code geometry.instances.data} member of any element of {@code pGeometries} or {@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_INSTANCES_KHR GEOMETRY_TYPE_INSTANCES_KHR} <b>must</b> be bound to memory that was not allocated with multiple instances</li>
     * <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_INSTANCES_KHR GEOMETRY_TYPE_INSTANCES_KHR}, {@code geometry.instances.data.hostAddress} <b>must</b> be a valid host address</li>
     * <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_INSTANCES_KHR GEOMETRY_TYPE_INSTANCES_KHR}, each {@link VkAccelerationStructureInstanceKHR}{@code ::accelerationStructureReference} value in {@code geometry.instances.data.hostAddress} must be a valid {@code VkAccelerationStructureKHR} object</li>
     * <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_INSTANCES_KHR GEOMETRY_TYPE_INSTANCES_KHR} with {@link NVRayTracingMotionBlur#VK_BUILD_ACCELERATION_STRUCTURE_MOTION_BIT_NV BUILD_ACCELERATION_STRUCTURE_MOTION_BIT_NV} set, each {@code accelerationStructureReference} in any structure in {@link VkAccelerationStructureMotionInstanceNV} value in {@code geometry.instances.data.hostAddress} must be a valid {@code VkAccelerationStructureKHR} object</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>If {@code deferredOperation} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code deferredOperation} <b>must</b> be a valid {@code VkDeferredOperationKHR} handle</li>
     * <li>{@code pInfos} <b>must</b> be a valid pointer to an array of {@code infoCount} valid {@link VkAccelerationStructureBuildGeometryInfoKHR} structures</li>
     * <li>{@code ppBuildRangeInfos} <b>must</b> be a valid pointer to an array of {@code infoCount} {@link VkAccelerationStructureBuildRangeInfoKHR} structures</li>
     * <li>{@code infoCount} <b>must</b> be greater than 0</li>
     * <li>If {@code deferredOperation} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
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
     * <p>{@link VkAccelerationStructureBuildGeometryInfoKHR}, {@link VkAccelerationStructureBuildRangeInfoKHR}</p>
     *
     * @param device            the {@code VkDevice} for which the acceleration structures are being built.
     * @param deferredOperation an optional {@code VkDeferredOperationKHR} to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#deferred-host-operations-requesting">request deferral</a> for this command.
     * @param pInfos            a pointer to an array of {@code infoCount} {@link VkAccelerationStructureBuildGeometryInfoKHR} structures defining the geometry used to build each acceleration structure.
     * @param ppBuildRangeInfos a pointer to an array of {@code infoCount} pointers to arrays of {@link VkAccelerationStructureBuildRangeInfoKHR} structures. Each {@code ppBuildRangeInfos}[i] is a pointer to an array of {@code pInfos}[i].{@code geometryCount} {@link VkAccelerationStructureBuildRangeInfoKHR} structures defining dynamic offsets to the addresses where geometry data is stored, as defined by {@code pInfos}[i].
     */
    @NativeType("VkResult")
    public static int vkBuildAccelerationStructuresKHR(VkDevice device, @NativeType("VkDeferredOperationKHR") long deferredOperation, @NativeType("VkAccelerationStructureBuildGeometryInfoKHR const *") VkAccelerationStructureBuildGeometryInfoKHR.Buffer pInfos, @NativeType("VkAccelerationStructureBuildRangeInfoKHR const * const *") PointerBuffer ppBuildRangeInfos) {
        if (CHECKS) {
            check(ppBuildRangeInfos, pInfos.remaining());
        }
        return nvkBuildAccelerationStructuresKHR(device, deferredOperation, pInfos.remaining(), pInfos.address(), memAddress(ppBuildRangeInfos));
    }

    // --- [ vkCopyAccelerationStructureKHR ] ---

    /** Unsafe version of: {@link #vkCopyAccelerationStructureKHR CopyAccelerationStructureKHR} */
    public static int nvkCopyAccelerationStructureKHR(VkDevice device, long deferredOperation, long pInfo) {
        long __functionAddress = device.getCapabilities().vkCopyAccelerationStructureKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(device.address(), deferredOperation, pInfo, __functionAddress);
    }

    /**
     * Copy an acceleration structure on the host.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To copy or compact an acceleration structure on the host, call:</p>
     * 
     * <pre><code>
     * VkResult vkCopyAccelerationStructureKHR(
     *     VkDevice                                    device,
     *     VkDeferredOperationKHR                      deferredOperation,
     *     const VkCopyAccelerationStructureInfoKHR*   pInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command fulfills the same task as {@link #vkCmdCopyAccelerationStructureKHR CmdCopyAccelerationStructureKHR} but is executed by the host.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If {@code deferredOperation} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, it <b>must</b> be a valid {@code VkDeferredOperationKHR} object</li>
     * <li>Any previous deferred operation that was associated with {@code deferredOperation} <b>must</b> be complete</li>
     * <li>The {@code buffer} used to create {@code pInfo→src} <b>must</b> be bound to host-visible device memory</li>
     * <li>The {@code buffer} used to create {@code pInfo→dst} <b>must</b> be bound to host-visible device memory</li>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-accelerationStructureHostCommands">{@link VkPhysicalDeviceAccelerationStructureFeaturesKHR}{@code ::accelerationStructureHostCommands}</a> feature <b>must</b> be enabled</li>
     * <li>The {@code buffer} used to create {@code pInfo→src} <b>must</b> be bound to memory that was not allocated with multiple instances</li>
     * <li>The {@code buffer} used to create {@code pInfo→dst} <b>must</b> be bound to memory that was not allocated with multiple instances</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>If {@code deferredOperation} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code deferredOperation} <b>must</b> be a valid {@code VkDeferredOperationKHR} handle</li>
     * <li>{@code pInfo} <b>must</b> be a valid pointer to a valid {@link VkCopyAccelerationStructureInfoKHR} structure</li>
     * <li>If {@code deferredOperation} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
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
     * <p>{@link VkCopyAccelerationStructureInfoKHR}</p>
     *
     * @param device            the device which owns the acceleration structures.
     * @param deferredOperation an optional {@code VkDeferredOperationKHR} to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#deferred-host-operations-requesting">request deferral</a> for this command.
     * @param pInfo             a pointer to a {@link VkCopyAccelerationStructureInfoKHR} structure defining the copy operation.
     */
    @NativeType("VkResult")
    public static int vkCopyAccelerationStructureKHR(VkDevice device, @NativeType("VkDeferredOperationKHR") long deferredOperation, @NativeType("VkCopyAccelerationStructureInfoKHR const *") VkCopyAccelerationStructureInfoKHR pInfo) {
        return nvkCopyAccelerationStructureKHR(device, deferredOperation, pInfo.address());
    }

    // --- [ vkCopyAccelerationStructureToMemoryKHR ] ---

    /** Unsafe version of: {@link #vkCopyAccelerationStructureToMemoryKHR CopyAccelerationStructureToMemoryKHR} */
    public static int nvkCopyAccelerationStructureToMemoryKHR(VkDevice device, long deferredOperation, long pInfo) {
        long __functionAddress = device.getCapabilities().vkCopyAccelerationStructureToMemoryKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(device.address(), deferredOperation, pInfo, __functionAddress);
    }

    /**
     * Serialize an acceleration structure on the host.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To copy an acceleration structure to host accessible memory, call:</p>
     * 
     * <pre><code>
     * VkResult vkCopyAccelerationStructureToMemoryKHR(
     *     VkDevice                                    device,
     *     VkDeferredOperationKHR                      deferredOperation,
     *     const VkCopyAccelerationStructureToMemoryInfoKHR* pInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command fulfills the same task as {@link #vkCmdCopyAccelerationStructureToMemoryKHR CmdCopyAccelerationStructureToMemoryKHR} but is executed by the host.</p>
     * 
     * <p>This command produces the same results as {@link #vkCmdCopyAccelerationStructureToMemoryKHR CmdCopyAccelerationStructureToMemoryKHR}, but writes its result directly to a host pointer, and is executed on the host rather than the device. The output <b>may</b> not necessarily be bit-for-bit identical, but it can be equally used by either {@link #vkCmdCopyMemoryToAccelerationStructureKHR CmdCopyMemoryToAccelerationStructureKHR} or {@link #vkCopyMemoryToAccelerationStructureKHR CopyMemoryToAccelerationStructureKHR}.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If {@code deferredOperation} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, it <b>must</b> be a valid {@code VkDeferredOperationKHR} object</li>
     * <li>Any previous deferred operation that was associated with {@code deferredOperation} <b>must</b> be complete</li>
     * <li>The {@code buffer} used to create {@code pInfo→src} <b>must</b> be bound to host-visible device memory</li>
     * <li>{@code pInfo→dst.hostAddress} <b>must</b> be a valid host pointer</li>
     * <li>{@code pInfo→dst.hostAddress} <b>must</b> be aligned to 16 bytes</li>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-accelerationStructureHostCommands">{@link VkPhysicalDeviceAccelerationStructureFeaturesKHR}{@code ::accelerationStructureHostCommands}</a> feature <b>must</b> be enabled</li>
     * <li>The {@code buffer} used to create {@code pInfo→src} <b>must</b> be bound to memory that was not allocated with multiple instances</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>If {@code deferredOperation} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code deferredOperation} <b>must</b> be a valid {@code VkDeferredOperationKHR} handle</li>
     * <li>{@code pInfo} <b>must</b> be a valid pointer to a valid {@link VkCopyAccelerationStructureToMemoryInfoKHR} structure</li>
     * <li>If {@code deferredOperation} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
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
     * <p>{@link VkCopyAccelerationStructureToMemoryInfoKHR}</p>
     *
     * @param device            the device which owns {@code pInfo→src}.
     * @param deferredOperation an optional {@code VkDeferredOperationKHR} to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#deferred-host-operations-requesting">request deferral</a> for this command.
     * @param pInfo             a pointer to a {@link VkCopyAccelerationStructureToMemoryInfoKHR} structure defining the copy operation.
     */
    @NativeType("VkResult")
    public static int vkCopyAccelerationStructureToMemoryKHR(VkDevice device, @NativeType("VkDeferredOperationKHR") long deferredOperation, @NativeType("VkCopyAccelerationStructureToMemoryInfoKHR const *") VkCopyAccelerationStructureToMemoryInfoKHR pInfo) {
        return nvkCopyAccelerationStructureToMemoryKHR(device, deferredOperation, pInfo.address());
    }

    // --- [ vkCopyMemoryToAccelerationStructureKHR ] ---

    /** Unsafe version of: {@link #vkCopyMemoryToAccelerationStructureKHR CopyMemoryToAccelerationStructureKHR} */
    public static int nvkCopyMemoryToAccelerationStructureKHR(VkDevice device, long deferredOperation, long pInfo) {
        long __functionAddress = device.getCapabilities().vkCopyMemoryToAccelerationStructureKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(device.address(), deferredOperation, pInfo, __functionAddress);
    }

    /**
     * Deserialize an acceleration structure on the host.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To copy host accessible memory to an acceleration structure, call:</p>
     * 
     * <pre><code>
     * VkResult vkCopyMemoryToAccelerationStructureKHR(
     *     VkDevice                                    device,
     *     VkDeferredOperationKHR                      deferredOperation,
     *     const VkCopyMemoryToAccelerationStructureInfoKHR* pInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command fulfills the same task as {@link #vkCmdCopyMemoryToAccelerationStructureKHR CmdCopyMemoryToAccelerationStructureKHR} but is executed by the host.</p>
     * 
     * <p>This command can accept acceleration structures produced by either {@link #vkCmdCopyAccelerationStructureToMemoryKHR CmdCopyAccelerationStructureToMemoryKHR} or {@link #vkCopyAccelerationStructureToMemoryKHR CopyAccelerationStructureToMemoryKHR}.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If {@code deferredOperation} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, it <b>must</b> be a valid {@code VkDeferredOperationKHR} object</li>
     * <li>Any previous deferred operation that was associated with {@code deferredOperation} <b>must</b> be complete</li>
     * <li>{@code pInfo→src.hostAddress} <b>must</b> be a valid host pointer</li>
     * <li>{@code pInfo→src.hostAddress} <b>must</b> be aligned to 16 bytes</li>
     * <li>The {@code buffer} used to create {@code pInfo→dst} <b>must</b> be bound to host-visible device memory</li>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-accelerationStructureHostCommands">{@link VkPhysicalDeviceAccelerationStructureFeaturesKHR}{@code ::accelerationStructureHostCommands}</a> feature <b>must</b> be enabled</li>
     * <li>The {@code buffer} used to create {@code pInfo→dst} <b>must</b> be bound to memory that was not allocated with multiple instances</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>If {@code deferredOperation} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code deferredOperation} <b>must</b> be a valid {@code VkDeferredOperationKHR} handle</li>
     * <li>{@code pInfo} <b>must</b> be a valid pointer to a valid {@link VkCopyMemoryToAccelerationStructureInfoKHR} structure</li>
     * <li>If {@code deferredOperation} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
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
     * <p>{@link VkCopyMemoryToAccelerationStructureInfoKHR}</p>
     *
     * @param device            the device which owns {@code pInfo→dst}.
     * @param deferredOperation an optional {@code VkDeferredOperationKHR} to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#deferred-host-operations-requesting">request deferral</a> for this command.
     * @param pInfo             a pointer to a {@link VkCopyMemoryToAccelerationStructureInfoKHR} structure defining the copy operation.
     */
    @NativeType("VkResult")
    public static int vkCopyMemoryToAccelerationStructureKHR(VkDevice device, @NativeType("VkDeferredOperationKHR") long deferredOperation, @NativeType("VkCopyMemoryToAccelerationStructureInfoKHR const *") VkCopyMemoryToAccelerationStructureInfoKHR pInfo) {
        return nvkCopyMemoryToAccelerationStructureKHR(device, deferredOperation, pInfo.address());
    }

    // --- [ vkWriteAccelerationStructuresPropertiesKHR ] ---

    /**
     * Unsafe version of: {@link #vkWriteAccelerationStructuresPropertiesKHR WriteAccelerationStructuresPropertiesKHR}
     *
     * @param accelerationStructureCount the count of acceleration structures for which to query the property.
     * @param dataSize                   the size in bytes of the buffer pointed to by {@code pData}.
     */
    public static int nvkWriteAccelerationStructuresPropertiesKHR(VkDevice device, int accelerationStructureCount, long pAccelerationStructures, int queryType, long dataSize, long pData, long stride) {
        long __functionAddress = device.getCapabilities().vkWriteAccelerationStructuresPropertiesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPPI(device.address(), accelerationStructureCount, pAccelerationStructures, queryType, dataSize, pData, stride, __functionAddress);
    }

    /**
     * Query acceleration structure meta-data on the host.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query acceleration structure size parameters on the host, call:</p>
     * 
     * <pre><code>
     * VkResult vkWriteAccelerationStructuresPropertiesKHR(
     *     VkDevice                                    device,
     *     uint32_t                                    accelerationStructureCount,
     *     const VkAccelerationStructureKHR*           pAccelerationStructures,
     *     VkQueryType                                 queryType,
     *     size_t                                      dataSize,
     *     void*                                       pData,
     *     size_t                                      stride);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command fulfills the same task as {@link #vkCmdWriteAccelerationStructuresPropertiesKHR CmdWriteAccelerationStructuresPropertiesKHR} but is executed by the host.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>All acceleration structures in {@code pAccelerationStructures} <b>must</b> have been built prior to the execution of this command</li>
     * <li>All acceleration structures in {@code pAccelerationStructures} <b>must</b> have been built with {@link #VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_KHR BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_KHR} if {@code queryType} is {@link #VK_QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_KHR QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_KHR}</li>
     * <li>{@code queryType} <b>must</b> be {@link #VK_QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_KHR QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_KHR} or {@link #VK_QUERY_TYPE_ACCELERATION_STRUCTURE_SERIALIZATION_SIZE_KHR QUERY_TYPE_ACCELERATION_STRUCTURE_SERIALIZATION_SIZE_KHR}</li>
     * <li>If {@code queryType} is {@link #VK_QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_KHR QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_KHR}, then {@code stride} <b>must</b> be a multiple of the size of {@code VkDeviceSize}</li>
     * <li>If {@code queryType} is {@link #VK_QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_KHR QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_KHR}, then {@code data} <b>must</b> point to a {@code VkDeviceSize}</li>
     * <li>If {@code queryType} is {@link #VK_QUERY_TYPE_ACCELERATION_STRUCTURE_SERIALIZATION_SIZE_KHR QUERY_TYPE_ACCELERATION_STRUCTURE_SERIALIZATION_SIZE_KHR}, then {@code stride} <b>must</b> be a multiple of the size of {@code VkDeviceSize}</li>
     * <li>If {@code queryType} is {@link #VK_QUERY_TYPE_ACCELERATION_STRUCTURE_SERIALIZATION_SIZE_KHR QUERY_TYPE_ACCELERATION_STRUCTURE_SERIALIZATION_SIZE_KHR}, then {@code data} <b>must</b> point to a {@code VkDeviceSize}</li>
     * <li>{@code dataSize} <b>must</b> be greater than or equal to <code>accelerationStructureCount*stride</code></li>
     * <li>The {@code buffer} used to create each acceleration structure in {@code pAccelerationStructures} <b>must</b> be bound to host-visible device memory</li>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-accelerationStructureHostCommands">{@link VkPhysicalDeviceAccelerationStructureFeaturesKHR}{@code ::accelerationStructureHostCommands}</a> feature <b>must</b> be enabled</li>
     * <li>The {@code buffer} used to create each acceleration structure in {@code pAccelerationStructures} <b>must</b> be bound to memory that was not allocated with multiple instances</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pAccelerationStructures} <b>must</b> be a valid pointer to an array of {@code accelerationStructureCount} valid {@code VkAccelerationStructureKHR} handles</li>
     * <li>{@code queryType} <b>must</b> be a valid {@code VkQueryType} value</li>
     * <li>{@code pData} <b>must</b> be a valid pointer to an array of {@code dataSize} bytes</li>
     * <li>{@code accelerationStructureCount} <b>must</b> be greater than 0</li>
     * <li>{@code dataSize} <b>must</b> be greater than 0</li>
     * <li>Each element of {@code pAccelerationStructures} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
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
     * @param device                  the device which owns the acceleration structures in {@code pAccelerationStructures}.
     * @param pAccelerationStructures a pointer to an array of existing previously built acceleration structures.
     * @param queryType               a {@code VkQueryType} value specifying the property to be queried.
     * @param pData                   a pointer to a user-allocated buffer where the results will be written.
     * @param stride                  the stride in bytes between results for individual queries within {@code pData}.
     */
    @NativeType("VkResult")
    public static int vkWriteAccelerationStructuresPropertiesKHR(VkDevice device, @NativeType("VkAccelerationStructureKHR const *") LongBuffer pAccelerationStructures, @NativeType("VkQueryType") int queryType, @NativeType("void *") ByteBuffer pData, @NativeType("size_t") long stride) {
        return nvkWriteAccelerationStructuresPropertiesKHR(device, pAccelerationStructures.remaining(), memAddress(pAccelerationStructures), queryType, pData.remaining(), memAddress(pData), stride);
    }

    // --- [ vkCmdCopyAccelerationStructureKHR ] ---

    /** Unsafe version of: {@link #vkCmdCopyAccelerationStructureKHR CmdCopyAccelerationStructureKHR} */
    public static void nvkCmdCopyAccelerationStructureKHR(VkCommandBuffer commandBuffer, long pInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyAccelerationStructureKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pInfo, __functionAddress);
    }

    /**
     * Copy an acceleration structure.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To copy an acceleration structure call:</p>
     * 
     * <pre><code>
     * void vkCmdCopyAccelerationStructureKHR(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkCopyAccelerationStructureInfoKHR*   pInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command copies the {@code pInfo→src} acceleration structure to the {@code pInfo→dst} acceleration structure in the manner specified by {@code pInfo→mode}.</p>
     * 
     * <p>Accesses to {@code pInfo→src} and {@code pInfo→dst} <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies">synchronized</a> with the {@link #VK_PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_KHR PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_KHR} <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-pipeline-stages">pipeline stage</a> and an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-access-types">access type</a> of {@link #VK_ACCESS_ACCELERATION_STRUCTURE_READ_BIT_KHR ACCESS_ACCELERATION_STRUCTURE_READ_BIT_KHR} or {@link #VK_ACCESS_ACCELERATION_STRUCTURE_WRITE_BIT_KHR ACCESS_ACCELERATION_STRUCTURE_WRITE_BIT_KHR} as appropriate.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The {@code buffer} used to create {@code pInfo→src} <b>must</b> be bound to device memory</li>
     * <li>The {@code buffer} used to create {@code pInfo→dst} <b>must</b> be bound to device memory</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pInfo} <b>must</b> be a valid pointer to a valid {@link VkCopyAccelerationStructureInfoKHR} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Compute</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkCopyAccelerationStructureInfoKHR}</p>
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param pInfo         a pointer to a {@link VkCopyAccelerationStructureInfoKHR} structure defining the copy operation.
     */
    public static void vkCmdCopyAccelerationStructureKHR(VkCommandBuffer commandBuffer, @NativeType("VkCopyAccelerationStructureInfoKHR const *") VkCopyAccelerationStructureInfoKHR pInfo) {
        nvkCmdCopyAccelerationStructureKHR(commandBuffer, pInfo.address());
    }

    // --- [ vkCmdCopyAccelerationStructureToMemoryKHR ] ---

    /** Unsafe version of: {@link #vkCmdCopyAccelerationStructureToMemoryKHR CmdCopyAccelerationStructureToMemoryKHR} */
    public static void nvkCmdCopyAccelerationStructureToMemoryKHR(VkCommandBuffer commandBuffer, long pInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyAccelerationStructureToMemoryKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pInfo, __functionAddress);
    }

    /**
     * Copy an acceleration structure to device memory.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To copy an acceleration structure to device memory call:</p>
     * 
     * <pre><code>
     * void vkCmdCopyAccelerationStructureToMemoryKHR(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkCopyAccelerationStructureToMemoryInfoKHR* pInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Accesses to {@code pInfo→src} <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies">synchronized</a> with the {@link #VK_PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_KHR PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_KHR} <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-pipeline-stages">pipeline stage</a> and an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-access-types">access type</a> of {@link #VK_ACCESS_ACCELERATION_STRUCTURE_READ_BIT_KHR ACCESS_ACCELERATION_STRUCTURE_READ_BIT_KHR}. Accesses to the buffer indicated by {@code pInfo→dst.deviceAddress} <b>must</b> be synchronized with the {@link #VK_PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_KHR PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_KHR} pipeline stage and an access type of {@link VK10#VK_ACCESS_TRANSFER_WRITE_BIT ACCESS_TRANSFER_WRITE_BIT}.</p>
     * 
     * <p>This command produces the same results as {@link #vkCopyAccelerationStructureToMemoryKHR CopyAccelerationStructureToMemoryKHR}, but writes its result to a device address, and is executed on the device rather than the host. The output <b>may</b> not necessarily be bit-for-bit identical, but it can be equally used by either {@link #vkCmdCopyMemoryToAccelerationStructureKHR CmdCopyMemoryToAccelerationStructureKHR} or {@link #vkCopyMemoryToAccelerationStructureKHR CopyMemoryToAccelerationStructureKHR}.</p>
     * 
     * <p>The defined header structure for the serialized data consists of:</p>
     * 
     * <ul>
     * <li>{@link VK10#VK_UUID_SIZE UUID_SIZE} bytes of data matching {@link VkPhysicalDeviceIDProperties}{@code ::driverUUID}</li>
     * <li>{@link VK10#VK_UUID_SIZE UUID_SIZE} bytes of data identifying the compatibility for comparison using {@link #vkGetDeviceAccelerationStructureCompatibilityKHR GetDeviceAccelerationStructureCompatibilityKHR}</li>
     * <li>A 64-bit integer of the total size matching the value queried using {@link #VK_QUERY_TYPE_ACCELERATION_STRUCTURE_SERIALIZATION_SIZE_KHR QUERY_TYPE_ACCELERATION_STRUCTURE_SERIALIZATION_SIZE_KHR}</li>
     * <li>A 64-bit integer of the deserialized size to be passed in to {@link VkAccelerationStructureCreateInfoKHR}{@code ::size}</li>
     * <li>A 64-bit integer of the count of the number of acceleration structure handles following. This will be zero for a bottom-level acceleration structure. For top-level acceleration structures this number is implementation-dependent; the number of and ordering of the handles may not match the instance descriptions which were used to build the acceleration structure.</li>
     * </ul>
     * 
     * <p>The corresponding handles matching the values returned by {@link #vkGetAccelerationStructureDeviceAddressKHR GetAccelerationStructureDeviceAddressKHR} or {@link NVRayTracing#vkGetAccelerationStructureHandleNV GetAccelerationStructureHandleNV} are tightly packed in the buffer following the count. The application is expected to store a mapping between those handles and the original application-generated bottom-level acceleration structures to provide when deserializing. The serialized data is written to the buffer (or read from the buffer) according to the host endianness.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code pInfo→dst.deviceAddress} <b>must</b> be a valid device address for a buffer bound to device memory</li>
     * <li>{@code pInfo→dst.deviceAddress} <b>must</b> be aligned to 256 bytes</li>
     * <li>If the buffer pointed to by {@code pInfo→dst.deviceAddress} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
     * <li>The {@code buffer} used to create {@code pInfo→src} <b>must</b> be bound to device memory</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pInfo} <b>must</b> be a valid pointer to a valid {@link VkCopyAccelerationStructureToMemoryInfoKHR} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Compute</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkCopyAccelerationStructureToMemoryInfoKHR}</p>
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param pInfo         an a pointer to a {@link VkCopyAccelerationStructureToMemoryInfoKHR} structure defining the copy operation.
     */
    public static void vkCmdCopyAccelerationStructureToMemoryKHR(VkCommandBuffer commandBuffer, @NativeType("VkCopyAccelerationStructureToMemoryInfoKHR const *") VkCopyAccelerationStructureToMemoryInfoKHR pInfo) {
        nvkCmdCopyAccelerationStructureToMemoryKHR(commandBuffer, pInfo.address());
    }

    // --- [ vkCmdCopyMemoryToAccelerationStructureKHR ] ---

    /** Unsafe version of: {@link #vkCmdCopyMemoryToAccelerationStructureKHR CmdCopyMemoryToAccelerationStructureKHR} */
    public static void nvkCmdCopyMemoryToAccelerationStructureKHR(VkCommandBuffer commandBuffer, long pInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyMemoryToAccelerationStructureKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pInfo, __functionAddress);
    }

    /**
     * Copy device memory to an acceleration structure.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To copy device memory to an acceleration structure call:</p>
     * 
     * <pre><code>
     * void vkCmdCopyMemoryToAccelerationStructureKHR(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkCopyMemoryToAccelerationStructureInfoKHR* pInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Accesses to {@code pInfo→dst} <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies">synchronized</a> with the {@link #VK_PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_KHR PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_KHR} <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-pipeline-stages">pipeline stage</a> and an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-access-types">access type</a> of {@link #VK_ACCESS_ACCELERATION_STRUCTURE_WRITE_BIT_KHR ACCESS_ACCELERATION_STRUCTURE_WRITE_BIT_KHR}. Accesses to the buffer indicated by {@code pInfo→src.deviceAddress} <b>must</b> be synchronized with the {@link #VK_PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_KHR PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_KHR} pipeline stage and an access type of {@link VK10#VK_ACCESS_TRANSFER_READ_BIT ACCESS_TRANSFER_READ_BIT}.</p>
     * 
     * <p>This command can accept acceleration structures produced by either {@link #vkCmdCopyAccelerationStructureToMemoryKHR CmdCopyAccelerationStructureToMemoryKHR} or {@link #vkCopyAccelerationStructureToMemoryKHR CopyAccelerationStructureToMemoryKHR}.</p>
     * 
     * <p>The structure provided as input to deserialize is as described in {@link #vkCmdCopyAccelerationStructureToMemoryKHR CmdCopyAccelerationStructureToMemoryKHR}, with any acceleration structure handles filled in with the newly-queried handles to bottom level acceleration structures created before deserialization. These do not need to be built at deserialize time, but <b>must</b> be created.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code pInfo→src.deviceAddress} <b>must</b> be a valid device address for a buffer bound to device memory</li>
     * <li>{@code pInfo→src.deviceAddress} <b>must</b> be aligned to 256 bytes</li>
     * <li>If the buffer pointed to by {@code pInfo→src.deviceAddress} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
     * <li>The {@code buffer} used to create {@code pInfo→dst} <b>must</b> be bound to device memory</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pInfo} <b>must</b> be a valid pointer to a valid {@link VkCopyMemoryToAccelerationStructureInfoKHR} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Compute</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkCopyMemoryToAccelerationStructureInfoKHR}</p>
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param pInfo         a pointer to a {@link VkCopyMemoryToAccelerationStructureInfoKHR} structure defining the copy operation.
     */
    public static void vkCmdCopyMemoryToAccelerationStructureKHR(VkCommandBuffer commandBuffer, @NativeType("VkCopyMemoryToAccelerationStructureInfoKHR const *") VkCopyMemoryToAccelerationStructureInfoKHR pInfo) {
        nvkCmdCopyMemoryToAccelerationStructureKHR(commandBuffer, pInfo.address());
    }

    // --- [ vkGetAccelerationStructureDeviceAddressKHR ] ---

    /** Unsafe version of: {@link #vkGetAccelerationStructureDeviceAddressKHR GetAccelerationStructureDeviceAddressKHR} */
    public static long nvkGetAccelerationStructureDeviceAddressKHR(VkDevice device, long pInfo) {
        long __functionAddress = device.getCapabilities().vkGetAccelerationStructureDeviceAddressKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPJ(device.address(), pInfo, __functionAddress);
    }

    /**
     * Query an address of a acceleration structure.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query the 64-bit device address for an acceleration structure, call:</p>
     * 
     * <pre><code>
     * VkDeviceAddress vkGetAccelerationStructureDeviceAddressKHR(
     *     VkDevice                                    device,
     *     const VkAccelerationStructureDeviceAddressInfoKHR* pInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The 64-bit return value is an address of the acceleration structure, which can be used for device and shader operations that involve acceleration structures, such as ray traversal and acceleration structure building.</p>
     * 
     * <p>If the acceleration structure was created with a non-zero value of {@link VkAccelerationStructureCreateInfoKHR}{@code ::deviceAddress}, the return value will be the same address.</p>
     * 
     * <p>If the acceleration structure was created with a {@code type} of {@link #VK_ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR}, the returned address <b>must</b> be consistent with the relative offset to other acceleration structures with {@code type} {@link #VK_ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR} allocated with the same {@code VkBuffer}. That is, the difference in returned addresses between the two <b>must</b> be the same as the difference in offsets provided at acceleration structure creation.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>The acceleration structure device address <b>may</b> be different from the buffer device address corresponding to the acceleration structure’s start offset in its storage buffer for acceleration structure types other than {@link #VK_ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR}.</p>
     * </div>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If {@code device} was created with multiple physical devices, then the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-bufferDeviceAddressMultiDevice">bufferDeviceAddressMultiDevice</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pInfo} <b>must</b> be a valid pointer to a valid {@link VkAccelerationStructureDeviceAddressInfoKHR} structure</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAccelerationStructureDeviceAddressInfoKHR}</p>
     *
     * @param device the logical device that the acceleration structure was created on.
     * @param pInfo  a pointer to a {@link VkAccelerationStructureDeviceAddressInfoKHR} structure specifying the acceleration structure to retrieve an address for.
     */
    @NativeType("VkDeviceAddress")
    public static long vkGetAccelerationStructureDeviceAddressKHR(VkDevice device, @NativeType("VkAccelerationStructureDeviceAddressInfoKHR const *") VkAccelerationStructureDeviceAddressInfoKHR pInfo) {
        return nvkGetAccelerationStructureDeviceAddressKHR(device, pInfo.address());
    }

    // --- [ vkCmdWriteAccelerationStructuresPropertiesKHR ] ---

    /**
     * Unsafe version of: {@link #vkCmdWriteAccelerationStructuresPropertiesKHR CmdWriteAccelerationStructuresPropertiesKHR}
     *
     * @param accelerationStructureCount the count of acceleration structures for which to query the property.
     */
    public static void nvkCmdWriteAccelerationStructuresPropertiesKHR(VkCommandBuffer commandBuffer, int accelerationStructureCount, long pAccelerationStructures, int queryType, long queryPool, int firstQuery) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdWriteAccelerationStructuresPropertiesKHR;
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
     * void vkCmdWriteAccelerationStructuresPropertiesKHR(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    accelerationStructureCount,
     *     const VkAccelerationStructureKHR*           pAccelerationStructures,
     *     VkQueryType                                 queryType,
     *     VkQueryPool                                 queryPool,
     *     uint32_t                                    firstQuery);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Accesses to any of the acceleration structures listed in {@code pAccelerationStructures} <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies">synchronized</a> with the {@link #VK_PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_KHR PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_KHR} <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-pipeline-stages">pipeline stage</a> and an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-access-types">access type</a> of {@link #VK_ACCESS_ACCELERATION_STRUCTURE_READ_BIT_KHR ACCESS_ACCELERATION_STRUCTURE_READ_BIT_KHR}.</p>
     * 
     * <ul>
     * <li>If {@code queryType} is {@link #VK_QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_KHR QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_KHR}, then the value written out is the number of bytes required by a compacted acceleration structure.</li>
     * <li>If {@code queryType} is {@link #VK_QUERY_TYPE_ACCELERATION_STRUCTURE_SERIALIZATION_SIZE_KHR QUERY_TYPE_ACCELERATION_STRUCTURE_SERIALIZATION_SIZE_KHR}, then the value written out is the number of bytes required by a serialized acceleration structure.</li>
     * </ul>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code queryPool} <b>must</b> have been created with a {@code queryType} matching {@code queryType}</li>
     * <li>The queries identified by {@code queryPool} and {@code firstQuery} <b>must</b> be <em>unavailable</em></li>
     * <li>The {@code buffer} used to create each acceleration structure in {@code pAccelerationStructures} <b>must</b> be bound to device memory</li>
     * <li>The sum of {@code query} plus {@code accelerationStructureCount} <b>must</b> be less than or equal to the number of queries in {@code queryPool}</li>
     * </ul>
     * 
     * <ul>
     * <li>All acceleration structures in {@code pAccelerationStructures} <b>must</b> have been built prior to the execution of this command</li>
     * <li>All acceleration structures in {@code pAccelerationStructures} <b>must</b> have been built with {@link #VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_KHR BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_KHR} if {@code queryType} is {@link #VK_QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_KHR QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_KHR}</li>
     * <li>{@code queryType} <b>must</b> be {@link #VK_QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_KHR QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_KHR} or {@link #VK_QUERY_TYPE_ACCELERATION_STRUCTURE_SERIALIZATION_SIZE_KHR QUERY_TYPE_ACCELERATION_STRUCTURE_SERIALIZATION_SIZE_KHR}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pAccelerationStructures} <b>must</b> be a valid pointer to an array of {@code accelerationStructureCount} valid {@code VkAccelerationStructureKHR} handles</li>
     * <li>{@code queryType} <b>must</b> be a valid {@code VkQueryType} value</li>
     * <li>{@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
     * <li>This command <b>must</b> only be called outside of a render pass instance</li>
     * <li>{@code accelerationStructureCount} <b>must</b> be greater than 0</li>
     * <li>Each of {@code commandBuffer}, {@code queryPool}, and the elements of {@code pAccelerationStructures} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Compute</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer           the command buffer into which the command will be recorded.
     * @param pAccelerationStructures a pointer to an array of existing previously built acceleration structures.
     * @param queryType               a {@code VkQueryType} value specifying the type of queries managed by the pool.
     * @param queryPool               the query pool that will manage the results of the query.
     * @param firstQuery              the first query index within the query pool that will contain the {@code accelerationStructureCount} number of results.
     */
    public static void vkCmdWriteAccelerationStructuresPropertiesKHR(VkCommandBuffer commandBuffer, @NativeType("VkAccelerationStructureKHR const *") LongBuffer pAccelerationStructures, @NativeType("VkQueryType") int queryType, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int firstQuery) {
        nvkCmdWriteAccelerationStructuresPropertiesKHR(commandBuffer, pAccelerationStructures.remaining(), memAddress(pAccelerationStructures), queryType, queryPool, firstQuery);
    }

    // --- [ vkGetDeviceAccelerationStructureCompatibilityKHR ] ---

    /** Unsafe version of: {@link #vkGetDeviceAccelerationStructureCompatibilityKHR GetDeviceAccelerationStructureCompatibilityKHR} */
    public static void nvkGetDeviceAccelerationStructureCompatibilityKHR(VkDevice device, long pVersionInfo, long pCompatibility) {
        long __functionAddress = device.getCapabilities().vkGetDeviceAccelerationStructureCompatibilityKHR;
        if (CHECKS) {
            check(__functionAddress);
            VkAccelerationStructureVersionInfoKHR.validate(pVersionInfo);
        }
        callPPPV(device.address(), pVersionInfo, pCompatibility, __functionAddress);
    }

    /**
     * Check if a serialized acceleration structure is compatible with the current device.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To check if a serialized acceleration structure is compatible with the current device call:</p>
     * 
     * <pre><code>
     * void vkGetDeviceAccelerationStructureCompatibilityKHR(
     *     VkDevice                                    device,
     *     const VkAccelerationStructureVersionInfoKHR* pVersionInfo,
     *     VkAccelerationStructureCompatibilityKHR*    pCompatibility);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-rayTracingPipeline">{@code rayTracingPipeline}</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-rayQuery">{@code rayQuery}</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pVersionInfo} <b>must</b> be a valid pointer to a valid {@link VkAccelerationStructureVersionInfoKHR} structure</li>
     * <li>{@code pCompatibility} <b>must</b> be a valid pointer to a {@code VkAccelerationStructureCompatibilityKHR} value</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAccelerationStructureVersionInfoKHR}</p>
     *
     * @param device         the device to check the version against.
     * @param pVersionInfo   a pointer to a {@link VkAccelerationStructureVersionInfoKHR} structure specifying version information to check against the device.
     * @param pCompatibility a pointer to a {@code VkAccelerationStructureCompatibilityKHR} value in which compatibility information is returned.
     */
    public static void vkGetDeviceAccelerationStructureCompatibilityKHR(VkDevice device, @NativeType("VkAccelerationStructureVersionInfoKHR const *") VkAccelerationStructureVersionInfoKHR pVersionInfo, @NativeType("VkAccelerationStructureCompatibilityKHR *") IntBuffer pCompatibility) {
        if (CHECKS) {
            check(pCompatibility, 1);
        }
        nvkGetDeviceAccelerationStructureCompatibilityKHR(device, pVersionInfo.address(), memAddress(pCompatibility));
    }

    // --- [ vkGetAccelerationStructureBuildSizesKHR ] ---

    /** Unsafe version of: {@link #vkGetAccelerationStructureBuildSizesKHR GetAccelerationStructureBuildSizesKHR} */
    public static void nvkGetAccelerationStructureBuildSizesKHR(VkDevice device, int buildType, long pBuildInfo, long pMaxPrimitiveCounts, long pSizeInfo) {
        long __functionAddress = device.getCapabilities().vkGetAccelerationStructureBuildSizesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPPV(device.address(), buildType, pBuildInfo, pMaxPrimitiveCounts, pSizeInfo, __functionAddress);
    }

    /**
     * Retrieve the required size for an acceleration structure.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To get the build sizes for an acceleration structure, call:</p>
     * 
     * <pre><code>
     * void vkGetAccelerationStructureBuildSizesKHR(
     *     VkDevice                                    device,
     *     VkAccelerationStructureBuildTypeKHR         buildType,
     *     const VkAccelerationStructureBuildGeometryInfoKHR* pBuildInfo,
     *     const uint32_t*                             pMaxPrimitiveCounts,
     *     VkAccelerationStructureBuildSizesInfoKHR*   pSizeInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@code srcAccelerationStructure}, {@code dstAccelerationStructure}, and {@code mode} members of {@code pBuildInfo} are ignored. Any {@link VkDeviceOrHostAddressKHR} members of {@code pBuildInfo} are ignored by this command, except that the {@code hostAddress} member of {@link VkAccelerationStructureGeometryTrianglesDataKHR}{@code ::transformData} will be examined to check if it is {@code NULL}.</p>
     * 
     * <p>An acceleration structure created with the {@code accelerationStructureSize} returned by this command supports any build or update with a {@link VkAccelerationStructureBuildGeometryInfoKHR} structure and array of {@link VkAccelerationStructureBuildRangeInfoKHR} structures subject to the following properties:</p>
     * 
     * <ul>
     * <li>The build command is a host build command, and {@code buildType} is {@link #VK_ACCELERATION_STRUCTURE_BUILD_TYPE_HOST_KHR ACCELERATION_STRUCTURE_BUILD_TYPE_HOST_KHR} or {@link #VK_ACCELERATION_STRUCTURE_BUILD_TYPE_HOST_OR_DEVICE_KHR ACCELERATION_STRUCTURE_BUILD_TYPE_HOST_OR_DEVICE_KHR}</li>
     * <li>The build command is a device build command, and {@code buildType} is {@link #VK_ACCELERATION_STRUCTURE_BUILD_TYPE_DEVICE_KHR ACCELERATION_STRUCTURE_BUILD_TYPE_DEVICE_KHR} or {@link #VK_ACCELERATION_STRUCTURE_BUILD_TYPE_HOST_OR_DEVICE_KHR ACCELERATION_STRUCTURE_BUILD_TYPE_HOST_OR_DEVICE_KHR}</li>
     * <li>For {@link VkAccelerationStructureBuildGeometryInfoKHR}:
     * 
     * <ul>
     * <li>Its {@code type}, and {@code flags} members are equal to {@code pBuildInfo→type} and {@code pBuildInfo→flags}, respectively.</li>
     * <li>{@code geometryCount} is less than or equal to {@code pBuildInfo→geometryCount}.</li>
     * <li>For each element of either {@code pGeometries} or {@code ppGeometries} at a given index, its {@code geometryType} member is equal to {@code pBuildInfo→geometryType}.</li>
     * <li>For each element of either {@code pGeometries} or {@code ppGeometries} at a given index, with a {@code geometryType} member equal to {@link #VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR}, the {@code vertexFormat} and {@code indexType} members of {@code geometry.triangles} are equal to the corresponding members of the same element in {@code pBuildInfo}.</li>
     * <li>For each element of either {@code pGeometries} or {@code ppGeometries} at a given index, with a {@code geometryType} member equal to {@link #VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR}, the {@code maxVertex} member of {@code geometry.triangles} is less than or equal to the corresponding member of the same element in {@code pBuildInfo}.</li>
     * <li>For each element of either {@code pGeometries} or {@code ppGeometries} at a given index, with a {@code geometryType} member equal to {@link #VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR}, if the applicable address in the {@code transformData} member of {@code geometry.triangles} is not {@code NULL}, the corresponding {@code transformData.hostAddress} parameter in {@code pBuildInfo} is not {@code NULL}.</li>
     * </ul>
     * </li>
     * <li>For each {@link VkAccelerationStructureBuildRangeInfoKHR} corresponding to the {@link VkAccelerationStructureBuildGeometryInfoKHR}:
     * 
     * <ul>
     * <li>Its {@code primitiveCount} member is less than or equal to the corresponding element of {@code pMaxPrimitiveCounts}.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <p>Similarly, the {@code updateScratchSize} value will support any build command specifying the {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR} {@code mode} under the above conditions, and the {@code buildScratchSize} value will support any build command specifying the {@link #VK_BUILD_ACCELERATION_STRUCTURE_MODE_BUILD_KHR BUILD_ACCELERATION_STRUCTURE_MODE_BUILD_KHR} {@code mode} under the above conditions.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-rayTracingPipeline">{@code rayTracingPipeline}</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-rayQuery">{@code rayQuery}</a> feature <b>must</b> be enabled</li>
     * <li>If {@code device} was created with multiple physical devices, then the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-bufferDeviceAddressMultiDevice">bufferDeviceAddressMultiDevice</a> feature <b>must</b> be enabled</li>
     * <li>If {@code pBuildInfo→geometryCount} is not 0, {@code pMaxPrimitiveCounts} <b>must</b> be a valid pointer to an array of {@code pBuildInfo→geometryCount} {@code uint32_t} values</li>
     * <li>If {@code pBuildInfo→pGeometries} or {@code pBuildInfo→ppGeometries} has a {@code geometryType} of {@link #VK_GEOMETRY_TYPE_INSTANCES_KHR GEOMETRY_TYPE_INSTANCES_KHR}, each {@code pMaxPrimitiveCounts}[i] <b>must</b> be less than or equal to {@link VkPhysicalDeviceAccelerationStructurePropertiesKHR}{@code ::maxInstanceCount}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code buildType} <b>must</b> be a valid {@code VkAccelerationStructureBuildTypeKHR} value</li>
     * <li>{@code pBuildInfo} <b>must</b> be a valid pointer to a valid {@link VkAccelerationStructureBuildGeometryInfoKHR} structure</li>
     * <li>If {@code pMaxPrimitiveCounts} is not {@code NULL}, {@code pMaxPrimitiveCounts} <b>must</b> be a valid pointer to an array of {@code pBuildInfo→geometryCount} {@code uint32_t} values</li>
     * <li>{@code pSizeInfo} <b>must</b> be a valid pointer to a {@link VkAccelerationStructureBuildSizesInfoKHR} structure</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAccelerationStructureBuildGeometryInfoKHR}, {@link VkAccelerationStructureBuildSizesInfoKHR}</p>
     *
     * @param device              the logical device that will be used for creating the acceleration structure.
     * @param buildType           defines whether host or device operations (or both) are being queried for.
     * @param pBuildInfo          a pointer to a {@link VkAccelerationStructureBuildGeometryInfoKHR} structure describing parameters of a build operation.
     * @param pMaxPrimitiveCounts a pointer to an array of {@code pBuildInfo→geometryCount} {@code uint32_t} values defining the number of primitives built into each geometry.
     * @param pSizeInfo           a pointer to a {@link VkAccelerationStructureBuildSizesInfoKHR} structure which returns the size required for an acceleration structure and the sizes required for the scratch buffers, given the build parameters.
     */
    public static void vkGetAccelerationStructureBuildSizesKHR(VkDevice device, @NativeType("VkAccelerationStructureBuildTypeKHR") int buildType, @NativeType("VkAccelerationStructureBuildGeometryInfoKHR const *") VkAccelerationStructureBuildGeometryInfoKHR pBuildInfo, @Nullable @NativeType("uint32_t const *") IntBuffer pMaxPrimitiveCounts, @NativeType("VkAccelerationStructureBuildSizesInfoKHR *") VkAccelerationStructureBuildSizesInfoKHR pSizeInfo) {
        if (CHECKS) {
            checkSafe(pMaxPrimitiveCounts, pBuildInfo.geometryCount());
        }
        nvkGetAccelerationStructureBuildSizesKHR(device, buildType, pBuildInfo.address(), memAddressSafe(pMaxPrimitiveCounts), pSizeInfo.address());
    }

    /** Array version of: {@link #vkCreateAccelerationStructureKHR CreateAccelerationStructureKHR} */
    @NativeType("VkResult")
    public static int vkCreateAccelerationStructureKHR(VkDevice device, @NativeType("VkAccelerationStructureCreateInfoKHR const *") VkAccelerationStructureCreateInfoKHR pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkAccelerationStructureKHR *") long[] pAccelerationStructure) {
        long __functionAddress = device.getCapabilities().vkCreateAccelerationStructureKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pAccelerationStructure, 1);
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pAccelerationStructure, __functionAddress);
    }

    /** Array version of: {@link #vkCmdBuildAccelerationStructuresIndirectKHR CmdBuildAccelerationStructuresIndirectKHR} */
    public static void vkCmdBuildAccelerationStructuresIndirectKHR(VkCommandBuffer commandBuffer, @NativeType("VkAccelerationStructureBuildGeometryInfoKHR const *") VkAccelerationStructureBuildGeometryInfoKHR.Buffer pInfos, @NativeType("VkDeviceAddress const *") long[] pIndirectDeviceAddresses, @NativeType("uint32_t const *") int[] pIndirectStrides, @NativeType("uint32_t const * const *") PointerBuffer ppMaxPrimitiveCounts) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBuildAccelerationStructuresIndirectKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pIndirectDeviceAddresses, pInfos.remaining());
            check(pIndirectStrides, pInfos.remaining());
            check(ppMaxPrimitiveCounts, pInfos.remaining());
        }
        callPPPPPV(commandBuffer.address(), pInfos.remaining(), pInfos.address(), pIndirectDeviceAddresses, pIndirectStrides, memAddress(ppMaxPrimitiveCounts), __functionAddress);
    }

    /** Array version of: {@link #vkWriteAccelerationStructuresPropertiesKHR WriteAccelerationStructuresPropertiesKHR} */
    @NativeType("VkResult")
    public static int vkWriteAccelerationStructuresPropertiesKHR(VkDevice device, @NativeType("VkAccelerationStructureKHR const *") long[] pAccelerationStructures, @NativeType("VkQueryType") int queryType, @NativeType("void *") ByteBuffer pData, @NativeType("size_t") long stride) {
        long __functionAddress = device.getCapabilities().vkWriteAccelerationStructuresPropertiesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPPI(device.address(), pAccelerationStructures.length, pAccelerationStructures, queryType, (long)pData.remaining(), memAddress(pData), stride, __functionAddress);
    }

    /** Array version of: {@link #vkCmdWriteAccelerationStructuresPropertiesKHR CmdWriteAccelerationStructuresPropertiesKHR} */
    public static void vkCmdWriteAccelerationStructuresPropertiesKHR(VkCommandBuffer commandBuffer, @NativeType("VkAccelerationStructureKHR const *") long[] pAccelerationStructures, @NativeType("VkQueryType") int queryType, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int firstQuery) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdWriteAccelerationStructuresPropertiesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPJV(commandBuffer.address(), pAccelerationStructures.length, pAccelerationStructures, queryType, queryPool, firstQuery, __functionAddress);
    }

    /** Array version of: {@link #vkGetDeviceAccelerationStructureCompatibilityKHR GetDeviceAccelerationStructureCompatibilityKHR} */
    public static void vkGetDeviceAccelerationStructureCompatibilityKHR(VkDevice device, @NativeType("VkAccelerationStructureVersionInfoKHR const *") VkAccelerationStructureVersionInfoKHR pVersionInfo, @NativeType("VkAccelerationStructureCompatibilityKHR *") int[] pCompatibility) {
        long __functionAddress = device.getCapabilities().vkGetDeviceAccelerationStructureCompatibilityKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pCompatibility, 1);
            VkAccelerationStructureVersionInfoKHR.validate(pVersionInfo.address());
        }
        callPPPV(device.address(), pVersionInfo.address(), pCompatibility, __functionAddress);
    }

    /** Array version of: {@link #vkGetAccelerationStructureBuildSizesKHR GetAccelerationStructureBuildSizesKHR} */
    public static void vkGetAccelerationStructureBuildSizesKHR(VkDevice device, @NativeType("VkAccelerationStructureBuildTypeKHR") int buildType, @NativeType("VkAccelerationStructureBuildGeometryInfoKHR const *") VkAccelerationStructureBuildGeometryInfoKHR pBuildInfo, @Nullable @NativeType("uint32_t const *") int[] pMaxPrimitiveCounts, @NativeType("VkAccelerationStructureBuildSizesInfoKHR *") VkAccelerationStructureBuildSizesInfoKHR pSizeInfo) {
        long __functionAddress = device.getCapabilities().vkGetAccelerationStructureBuildSizesKHR;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(pMaxPrimitiveCounts, pBuildInfo.geometryCount());
        }
        callPPPPV(device.address(), buildType, pBuildInfo.address(), pMaxPrimitiveCounts, pSizeInfo.address(), __functionAddress);
    }

}