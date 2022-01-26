/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_acceleration_structure = "KHRAccelerationStructure".nativeClassVK("KHR_acceleration_structure", type = "device", postfix = "KHR") {
    documentation =
        """
        In order to be efficient, rendering techniques such as ray tracing need a quick way to identify which primitives may be intersected by a ray traversing the geometries. Acceleration structures are the most common way to represent the geometry spatially sorted, in order to quickly identify such potential intersections.

        This extension adds new functionalities:

        <ul>
            <li>Acceleration structure objects and build commands</li>
            <li>Structures to describe geometry inputs to acceleration structure builds</li>
            <li>Acceleration structure copy commands</li>
        </ul>

        <h5>VK_KHR_acceleration_structure</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_acceleration_structure}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>151</dd>

            <dt><b>Revision</b></dt>
            <dd>13</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.1</li>
                <li>Requires {@link EXTDescriptorIndexing VK_EXT_descriptor_indexing}</li>
                <li>Requires {@link KHRBufferDeviceAddress VK_KHR_buffer_device_address}</li>
                <li>Requires {@link KHRDeferredHostOperations VK_KHR_deferred_host_operations}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Daniel Koch <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_acceleration_structure]%20@dgkoch%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_acceleration_structure%20extension%3E%3E">dgkoch</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2021-09-30</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Samuel Bourasseau, Adobe</li>
                <li>Matthäus Chajdas, AMD</li>
                <li>Greg Grebe, AMD</li>
                <li>Nicolai Hähnle, AMD</li>
                <li>Tobias Hector, AMD</li>
                <li>Dave Oldcorn, AMD</li>
                <li>Skyler Saleh, AMD</li>
                <li>Mathieu Robart, Arm</li>
                <li>Marius Bjorge, Arm</li>
                <li>Tom Olson, Arm</li>
                <li>Sebastian Tafuri, EA</li>
                <li>Henrik Rydgard, Embark</li>
                <li>Juan Cañada, Epic Games</li>
                <li>Patrick Kelly, Epic Games</li>
                <li>Yuriy O’Donnell, Epic Games</li>
                <li>Michael Doggett, Facebook/Oculus</li>
                <li>Ricardo Garcia, Igalia</li>
                <li>Andrew Garrard, Imagination</li>
                <li>Don Scorgie, Imagination</li>
                <li>Dae Kim, Imagination</li>
                <li>Joshua Barczak, Intel</li>
                <li>Slawek Grajewski, Intel</li>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Pascal Gautron, NVIDIA</li>
                <li>Daniel Koch, NVIDIA</li>
                <li>Christoph Kubisch, NVIDIA</li>
                <li>Ashwin Lele, NVIDIA</li>
                <li>Robert Stepinski, NVIDIA</li>
                <li>Martin Stich, NVIDIA</li>
                <li>Nuno Subtil, NVIDIA</li>
                <li>Eric Werness, NVIDIA</li>
                <li>Jon Leech, Khronos</li>
                <li>Jeroen van Schijndel, OTOY</li>
                <li>Juul Joosten, OTOY</li>
                <li>Alex Bourd, Qualcomm</li>
                <li>Roman Larionov, Qualcomm</li>
                <li>David McAllister, Qualcomm</li>
                <li>Lewis Gordon, Samsung</li>
                <li>Ralph Potter, Samsung</li>
                <li>Jasper Bekkers, Traverse Research</li>
                <li>Jesse Barker, Unity</li>
                <li>Baldur Karlsson, Valve</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_ACCELERATION_STRUCTURE_SPEC_VERSION".."13"
    )

    StringConstant(
        "The extension name.",

        "KHR_ACCELERATION_STRUCTURE_EXTENSION_NAME".."VK_KHR_acceleration_structure"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_ACCELERATION_STRUCTURE_KHR".."1000150007",
        "STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_GEOMETRY_INFO_KHR".."1000150000",
        "STRUCTURE_TYPE_ACCELERATION_STRUCTURE_DEVICE_ADDRESS_INFO_KHR".."1000150002",
        "STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_AABBS_DATA_KHR".."1000150003",
        "STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_INSTANCES_DATA_KHR".."1000150004",
        "STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_TRIANGLES_DATA_KHR".."1000150005",
        "STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_KHR".."1000150006",
        "STRUCTURE_TYPE_ACCELERATION_STRUCTURE_VERSION_INFO_KHR".."1000150009",
        "STRUCTURE_TYPE_COPY_ACCELERATION_STRUCTURE_INFO_KHR".."1000150010",
        "STRUCTURE_TYPE_COPY_ACCELERATION_STRUCTURE_TO_MEMORY_INFO_KHR".."1000150011",
        "STRUCTURE_TYPE_COPY_MEMORY_TO_ACCELERATION_STRUCTURE_INFO_KHR".."1000150012",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_FEATURES_KHR".."1000150013",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_PROPERTIES_KHR".."1000150014",
        "STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_KHR".."1000150017",
        "STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_SIZES_INFO_KHR".."1000150020"
    )

    EnumConstant(
        "Extends {@code VkPipelineStageFlagBits}.",

        "PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_KHR".enum(0x02000000)
    )

    EnumConstant(
        "Extends {@code VkDescriptorType}.",

        "DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_KHR".."1000150000"
    )

    EnumConstant(
        "Extends {@code VkAccessFlagBits}.",

        "ACCESS_ACCELERATION_STRUCTURE_READ_BIT_KHR".enum(0x00200000),
        "ACCESS_ACCELERATION_STRUCTURE_WRITE_BIT_KHR".enum(0x00400000)
    )

    EnumConstant(
        "Extends {@code VkQueryType}.",

        "QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_KHR".."1000150000",
        "QUERY_TYPE_ACCELERATION_STRUCTURE_SERIALIZATION_SIZE_KHR".."1000150001"
    )

    EnumConstant(
        "Extends {@code VkObjectType}.",

        "OBJECT_TYPE_ACCELERATION_STRUCTURE_KHR".."1000150000"
    )

    EnumConstant(
        "Extends {@code VkDebugReportObjectTypeEXT}.",

        "DEBUG_REPORT_OBJECT_TYPE_ACCELERATION_STRUCTURE_KHR_EXT".."1000150000"
    )

    EnumConstant(
        "Extends {@code VkIndexType}.",

        "INDEX_TYPE_NONE_KHR".."1000165000"
    )

    EnumConstant(
        "Extends {@code VkFormatFeatureFlagBits}.",

        "FORMAT_FEATURE_ACCELERATION_STRUCTURE_VERTEX_BUFFER_BIT_KHR".enum(0x20000000)
    )

    EnumConstant(
        "Extends {@code VkBufferUsageFlagBits}.",

        "BUFFER_USAGE_ACCELERATION_STRUCTURE_BUILD_INPUT_READ_ONLY_BIT_KHR".enum(0x00080000),
        "BUFFER_USAGE_ACCELERATION_STRUCTURE_STORAGE_BIT_KHR".enum(0x00100000)
    )

    EnumConstantLong(
        "Extends {@code VkFormatFeatureFlagBits2}.",

        "FORMAT_FEATURE_2_ACCELERATION_STRUCTURE_VERTEX_BUFFER_BIT_KHR".enum(0x20000000L)
    )

    EnumConstant(
        """
        VkAccelerationStructureTypeKHR - Type of acceleration structure

        <h5>Description</h5>
        <ul>
            <li>#ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_KHR is a top-level acceleration structure containing instance data referring to bottom-level acceleration structures.</li>
            <li>#ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_KHR is a bottom-level acceleration structure containing the AABBs or geometry to be intersected.</li>
            <li>#ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR is an acceleration structure whose type is determined at build time used for special circumstances.</li>
        </ul>

        <h5>See Also</h5>
        ##VkAccelerationStructureBuildGeometryInfoKHR, ##VkAccelerationStructureCreateInfoKHR, ##VkAccelerationStructureInfoNV
        """,

        "ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_KHR".."0",
        "ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_KHR".."1",
        "ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR".."2"
    )

    EnumConstant(
        """
        VkBuildAccelerationStructureFlagBitsKHR - Bitmask specifying additional parameters for acceleration structure builds

        <h5>Description</h5>
        <ul>
            <li>#BUILD_ACCELERATION_STRUCTURE_ALLOW_UPDATE_BIT_KHR indicates that the specified acceleration structure <b>can</b> be updated with a {@code mode} of #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR in ##VkAccelerationStructureBuildGeometryInfoKHR or an {@code update} of #TRUE in #CmdBuildAccelerationStructureNV() .</li>
            <li>#BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_KHR indicates that the specified acceleration structure <b>can</b> act as the source for a copy acceleration structure command with {@code mode} of #COPY_ACCELERATION_STRUCTURE_MODE_COMPACT_KHR to produce a compacted acceleration structure.</li>
            <li>#BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_TRACE_BIT_KHR indicates that the given acceleration structure build <b>should</b> prioritize trace performance over build time.</li>
            <li>#BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_BUILD_BIT_KHR indicates that the given acceleration structure build <b>should</b> prioritize build time over trace performance.</li>
            <li>#BUILD_ACCELERATION_STRUCTURE_LOW_MEMORY_BIT_KHR indicates that this acceleration structure <b>should</b> minimize the size of the scratch memory and the final result acceleration structure, potentially at the expense of build time or trace performance.</li>
        </ul>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        #BUILD_ACCELERATION_STRUCTURE_ALLOW_UPDATE_BIT_KHR and #BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_KHR <b>may</b> take more time and memory than a normal build, and so <b>should</b> only be used when those features are needed.
        </div>
        """,

        "BUILD_ACCELERATION_STRUCTURE_ALLOW_UPDATE_BIT_KHR".enum(0x00000001),
        "BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_KHR".enum(0x00000002),
        "BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_TRACE_BIT_KHR".enum(0x00000004),
        "BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_BUILD_BIT_KHR".enum(0x00000008),
        "BUILD_ACCELERATION_STRUCTURE_LOW_MEMORY_BIT_KHR".enum(0x00000010)
    )

    EnumConstant(
        """
        VkBuildAccelerationStructureModeKHR - Enum specifying the type of build operation to perform

        <h5>Description</h5>
        <ul>
            <li>#BUILD_ACCELERATION_STRUCTURE_MODE_BUILD_KHR specifies that the destination acceleration structure will be built using the specified geometries.</li>
            <li>#BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR specifies that the destination acceleration structure will be built using data in a source acceleration structure, updated by the specified geometries.</li>
        </ul>

        <h5>See Also</h5>
        ##VkAccelerationStructureBuildGeometryInfoKHR
        """,

        "BUILD_ACCELERATION_STRUCTURE_MODE_BUILD_KHR".."0",
        "BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR".."1"
    )

    EnumConstant(
        """
        VkGeometryTypeKHR - Enum specifying which type of geometry is provided

        <h5>Description</h5>
        <ul>
            <li>#GEOMETRY_TYPE_TRIANGLES_KHR specifies a geometry type consisting of triangles.</li>
            <li>#GEOMETRY_TYPE_AABBS_KHR specifies a geometry type consisting of axis-aligned bounding boxes.</li>
            <li>#GEOMETRY_TYPE_INSTANCES_KHR specifies a geometry type consisting of acceleration structure instances.</li>
        </ul>

        <h5>See Also</h5>
        ##VkAccelerationStructureGeometryKHR, ##VkGeometryNV
        """,

        "GEOMETRY_TYPE_TRIANGLES_KHR".."0",
        "GEOMETRY_TYPE_AABBS_KHR".."1",
        "GEOMETRY_TYPE_INSTANCES_KHR".."2"
    )

    EnumConstant(
        """
        VkGeometryFlagBitsKHR - Bitmask specifying additional parameters for a geometry

        <h5>Description</h5>
        <ul>
            <li>#GEOMETRY_OPAQUE_BIT_KHR indicates that this geometry does not invoke the any-hit shaders even if present in a hit group.</li>
            <li>#GEOMETRY_NO_DUPLICATE_ANY_HIT_INVOCATION_BIT_KHR indicates that the implementation <b>must</b> only call the any-hit shader a single time for each primitive in this geometry. If this bit is absent an implementation <b>may</b> invoke the any-hit shader more than once for this geometry.</li>
        </ul>
        """,

        "GEOMETRY_OPAQUE_BIT_KHR".enum(0x00000001),
        "GEOMETRY_NO_DUPLICATE_ANY_HIT_INVOCATION_BIT_KHR".enum(0x00000002)
    )

    EnumConstant(
        """
        VkAccelerationStructureBuildTypeKHR - Acceleration structure build type

        <h5>Description</h5>
        <ul>
            <li>#ACCELERATION_STRUCTURE_BUILD_TYPE_HOST_KHR requests the memory requirement for operations performed by the host.</li>
            <li>#ACCELERATION_STRUCTURE_BUILD_TYPE_DEVICE_KHR requests the memory requirement for operations performed by the device.</li>
            <li>#ACCELERATION_STRUCTURE_BUILD_TYPE_HOST_OR_DEVICE_KHR requests the memory requirement for operations performed by either the host, or the device.</li>
        </ul>

        <h5>See Also</h5>
        #GetAccelerationStructureBuildSizesKHR()
        """,

        "ACCELERATION_STRUCTURE_BUILD_TYPE_HOST_KHR".."0",
        "ACCELERATION_STRUCTURE_BUILD_TYPE_DEVICE_KHR".."1",
        "ACCELERATION_STRUCTURE_BUILD_TYPE_HOST_OR_DEVICE_KHR".."2"
    )

    EnumConstant(
        """
        VkGeometryInstanceFlagBitsKHR - Instance flag bits

        <h5>Description</h5>
        <ul>
            <li>#GEOMETRY_INSTANCE_TRIANGLE_FACING_CULL_DISABLE_BIT_KHR disables face culling for this instance.</li>
            <li>#GEOMETRY_INSTANCE_TRIANGLE_FLIP_FACING_BIT_KHR indicates that the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#ray-traversal-culling-face">facing determination</a> for geometry in this instance is inverted. Because the facing is determined in object space, an instance transform does not change the winding, but a geometry transform does.</li>
            <li>#GEOMETRY_INSTANCE_FORCE_OPAQUE_BIT_KHR causes this instance to act as though #GEOMETRY_OPAQUE_BIT_KHR were specified on all geometries referenced by this instance. This behavior <b>can</b> be overridden by the SPIR-V {@code NoOpaqueKHR} ray flag.</li>
            <li>#GEOMETRY_INSTANCE_FORCE_NO_OPAQUE_BIT_KHR causes this instance to act as though #GEOMETRY_OPAQUE_BIT_KHR were not specified on all geometries referenced by this instance. This behavior <b>can</b> be overridden by the SPIR-V {@code OpaqueKHR} ray flag.</li>
        </ul>

        #GEOMETRY_INSTANCE_FORCE_NO_OPAQUE_BIT_KHR and #GEOMETRY_INSTANCE_FORCE_OPAQUE_BIT_KHR <b>must</b> not be used in the same flag.
        """,

        "GEOMETRY_INSTANCE_TRIANGLE_FACING_CULL_DISABLE_BIT_KHR".enum(0x00000001),
        "GEOMETRY_INSTANCE_TRIANGLE_FLIP_FACING_BIT_KHR".enum(0x00000002),
        "GEOMETRY_INSTANCE_FORCE_OPAQUE_BIT_KHR".enum(0x00000004),
        "GEOMETRY_INSTANCE_FORCE_NO_OPAQUE_BIT_KHR".enum(0x00000008),
        "GEOMETRY_INSTANCE_TRIANGLE_FRONT_COUNTERCLOCKWISE_BIT_KHR".enum(0x00000002)
    )

    EnumConstant(
        """
        VkAccelerationStructureCreateFlagBitsKHR - Bitmask specifying additional creation parameters for acceleration structure

        <h5>Description</h5>
        <ul>
            <li>#ACCELERATION_STRUCTURE_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_KHR specifies that the acceleration structure’s address <b>can</b> be saved and reused on a subsequent run.</li>
        </ul>
        """,

        "ACCELERATION_STRUCTURE_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_KHR".enum(0x00000001)
    )

    EnumConstant(
        """
        VkCopyAccelerationStructureModeKHR - Acceleration structure copy mode

        <h5>Description</h5>
        <ul>
            <li>#COPY_ACCELERATION_STRUCTURE_MODE_CLONE_KHR creates a direct copy of the acceleration structure specified in {@code src} into the one specified by {@code dst}. The {@code dst} acceleration structure <b>must</b> have been created with the same parameters as {@code src}. If {@code src} contains references to other acceleration structures, {@code dst} will reference the same acceleration structures.</li>
            <li>#COPY_ACCELERATION_STRUCTURE_MODE_COMPACT_KHR creates a more compact version of an acceleration structure {@code src} into {@code dst}. The acceleration structure {@code dst} <b>must</b> have been created with a size at least as large as that returned by #CmdWriteAccelerationStructuresPropertiesKHR() or #WriteAccelerationStructuresPropertiesKHR() after the build of the acceleration structure specified by {@code src}. If {@code src} contains references to other acceleration structures, {@code dst} will reference the same acceleration structures.</li>
            <li>#COPY_ACCELERATION_STRUCTURE_MODE_SERIALIZE_KHR serializes the acceleration structure to a semi-opaque format which can be reloaded on a compatible implementation.</li>
            <li>#COPY_ACCELERATION_STRUCTURE_MODE_DESERIALIZE_KHR deserializes the semi-opaque serialization format in the buffer to the acceleration structure.</li>
        </ul>

        <h5>See Also</h5>
        ##VkCopyAccelerationStructureInfoKHR, ##VkCopyAccelerationStructureToMemoryInfoKHR, ##VkCopyMemoryToAccelerationStructureInfoKHR, #CmdCopyAccelerationStructureNV()
        """,

        "COPY_ACCELERATION_STRUCTURE_MODE_CLONE_KHR".."0",
        "COPY_ACCELERATION_STRUCTURE_MODE_COMPACT_KHR".."1",
        "COPY_ACCELERATION_STRUCTURE_MODE_SERIALIZE_KHR".."2",
        "COPY_ACCELERATION_STRUCTURE_MODE_DESERIALIZE_KHR".."3"
    )

    EnumConstant(
        """
        VkAccelerationStructureCompatibilityKHR - Acceleration structure compatibility

        <h5>Description</h5>
        <ul>
            <li>#ACCELERATION_STRUCTURE_COMPATIBILITY_COMPATIBLE_KHR if the {@code pVersionData} version acceleration structure is compatible with {@code device}.</li>
            <li>#ACCELERATION_STRUCTURE_COMPATIBILITY_INCOMPATIBLE_KHR if the {@code pVersionData} version acceleration structure is not compatible with {@code device}.</li>
        </ul>

        <h5>See Also</h5>
        #GetDeviceAccelerationStructureCompatibilityKHR()
        """,

        "ACCELERATION_STRUCTURE_COMPATIBILITY_COMPATIBLE_KHR".."0",
        "ACCELERATION_STRUCTURE_COMPATIBILITY_INCOMPATIBLE_KHR".."1"
    )

    VkResult(
        "CreateAccelerationStructureKHR",
        """
        Create a new acceleration structure object.

        <h5>C Specification</h5>
        To create an acceleration structure, call:

        <pre><code>
￿VkResult vkCreateAccelerationStructureKHR(
￿    VkDevice                                    device,
￿    const VkAccelerationStructureCreateInfoKHR* pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkAccelerationStructureKHR*                 pAccelerationStructure);</code></pre>

        <h5>Description</h5>
        Similar to other objects in Vulkan, the acceleration structure creation merely creates an object with a specific “{@code shape}”. The type and quantity of geometry that can be built into an acceleration structure is determined by the parameters of ##VkAccelerationStructureCreateInfoKHR.

        Populating the data in the object after allocating and binding memory is done with commands such as #CmdBuildAccelerationStructuresKHR(), #BuildAccelerationStructuresKHR(), #CmdCopyAccelerationStructureKHR(), and #CopyAccelerationStructureKHR().

        The input buffers passed to acceleration structure build commands will be referenced by the implementation for the duration of the command. After the command completes, the acceleration structure <b>may</b> hold a reference to any acceleration structure specified by an active instance contained therein. Apart from this referencing, acceleration structures <b>must</b> be fully self-contained. The application <b>may</b> re-use or free any memory which was used by the command as an input or as scratch without affecting the results of ray traversal.

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-accelerationStructure">{@code accelerationStructure}</a> feature <b>must</b> be enabled</li>
            <li>If ##VkAccelerationStructureCreateInfoKHR{@code ::deviceAddress} is not zero, the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-accelerationStructureCaptureReplay">{@code accelerationStructureCaptureReplay}</a> feature <b>must</b> be enabled</li>
            <li>If {@code device} was created with multiple physical devices, then the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-bufferDeviceAddressMultiDevice">bufferDeviceAddressMultiDevice</a> feature <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkAccelerationStructureCreateInfoKHR structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pAccelerationStructure} <b>must</b> be a valid pointer to a {@code VkAccelerationStructureKHR} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS_KHR</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAccelerationStructureCreateInfoKHR, ##VkAllocationCallbacks
        """,

        VkDevice("device", "the logical device that creates the acceleration structure object."),
        VkAccelerationStructureCreateInfoKHR.const.p("pCreateInfo", "a pointer to a ##VkAccelerationStructureCreateInfoKHR structure containing parameters affecting creation of the acceleration structure."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkAccelerationStructureKHR.p("pAccelerationStructure", "a pointer to a {@code VkAccelerationStructureKHR} handle in which the resulting acceleration structure object is returned.")
    )

    void(
        "DestroyAccelerationStructureKHR",
        """
        Destroy an acceleration structure object.

        <h5>C Specification</h5>
        To destroy an acceleration structure, call:

        <pre><code>
￿void vkDestroyAccelerationStructureKHR(
￿    VkDevice                                    device,
￿    VkAccelerationStructureKHR                  accelerationStructure,
￿    const VkAllocationCallbacks*                pAllocator);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>All submitted commands that refer to {@code accelerationStructure} <b>must</b> have completed execution</li>
            <li>If ##VkAllocationCallbacks were provided when {@code accelerationStructure} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code accelerationStructure} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code accelerationStructure} is not #NULL_HANDLE, {@code accelerationStructure} <b>must</b> be a valid {@code VkAccelerationStructureKHR} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code accelerationStructure} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code accelerationStructure} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice("device", "the logical device that destroys the acceleration structure."),
        VkAccelerationStructureKHR("accelerationStructure", "the acceleration structure to destroy."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    void(
        "CmdBuildAccelerationStructuresKHR",
        """
        Build an acceleration structure.

        <h5>C Specification</h5>
        To build acceleration structures call:

        <pre><code>
￿void vkCmdBuildAccelerationStructuresKHR(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    infoCount,
￿    const VkAccelerationStructureBuildGeometryInfoKHR* pInfos,
￿    const VkAccelerationStructureBuildRangeInfoKHR* const* ppBuildRangeInfos);</code></pre>

        <h5>Description</h5>
        The {@code vkCmdBuildAccelerationStructuresKHR} command provides the ability to initiate multiple acceleration structures builds, however there is no ordering or synchronization implied between any of the individual acceleration structure builds.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        This means that an application <b>cannot</b> build a top-level acceleration structure in the same #CmdBuildAccelerationStructuresKHR() call as the associated bottom-level or instance acceleration structures are being built. There also <b>cannot</b> be any memory aliasing between any acceleration structure memories or scratch memories being used by any of the builds.
        </div>

        Accesses to the acceleration structure scratch buffers as identified by the ##VkAccelerationStructureBuildGeometryInfoKHR{@code ::scratchData} buffer device addresses <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-dependencies">synchronized</a> with the #PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_KHR <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-pipeline-stages">pipeline stage</a> and an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-access-types">access type</a> of #ACCESS_ACCELERATION_STRUCTURE_READ_BIT_KHR or #ACCESS_ACCELERATION_STRUCTURE_WRITE_BIT_KHR. Similarly for accesses to each ##VkAccelerationStructureBuildGeometryInfoKHR{@code ::srcAccelerationStructure} and ##VkAccelerationStructureBuildGeometryInfoKHR{@code ::dstAccelerationStructure}.

        Accesses to other input buffers as identified by any used values of ##VkAccelerationStructureGeometryMotionTrianglesDataNV{@code ::vertexData}, ##VkAccelerationStructureGeometryTrianglesDataKHR{@code ::vertexData}, ##VkAccelerationStructureGeometryTrianglesDataKHR{@code ::indexData}, ##VkAccelerationStructureGeometryTrianglesDataKHR{@code ::transformData}, ##VkAccelerationStructureGeometryAabbsDataKHR{@code ::data}, and ##VkAccelerationStructureGeometryInstancesDataKHR{@code ::data} <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-dependencies">synchronized</a> with the #PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_KHR <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-pipeline-stages">pipeline stage</a> and an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-access-types">access type</a> of #ACCESS_SHADER_READ_BIT.

        <h5>Valid Usage</h5>
        <ul>
            <li>The {@code mode} member of each element of {@code pInfos} <b>must</b> be a valid {@code VkBuildAccelerationStructureModeKHR} value</li>
            <li>If the {@code srcAccelerationStructure} member of any element of {@code pInfos} is not #NULL_HANDLE, the {@code srcAccelerationStructure} member <b>must</b> be a valid {@code VkAccelerationStructureKHR} handle</li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, its {@code srcAccelerationStructure} member <b>must</b> not be #NULL_HANDLE</li>
            <li>The {@code srcAccelerationStructure} member of any element of {@code pInfos} <b>must</b> not be the same acceleration structure as the {@code dstAccelerationStructure} member of any other element of {@code pInfos}</li>
            <li>The {@code dstAccelerationStructure} member of any element of {@code pInfos} <b>must</b> not be the same acceleration structure as the {@code dstAccelerationStructure} member of any other element of {@code pInfos}</li>
            <li>The {@code dstAccelerationStructure} member of any element of {@code pInfos} <b>must</b> be a valid {@code VkAccelerationStructureKHR} handle</li>
            <li>For each element of {@code pInfos}, if its {@code type} member is #ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_KHR, its {@code dstAccelerationStructure} member <b>must</b> have been created with a value of ##VkAccelerationStructureCreateInfoKHR{@code ::type} equal to either #ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_KHR or #ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR</li>
            <li>For each element of {@code pInfos}, if its {@code type} member is #ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_KHR, its {@code dstAccelerationStructure} member <b>must</b> have been created with a value of ##VkAccelerationStructureCreateInfoKHR{@code ::type} equal to either #ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_KHR or #ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR</li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#acceleration-structure-inactive-prims">inactive primitives</a> in its {@code srcAccelerationStructure} member <b>must</b> not be made active</li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, active primitives in its {@code srcAccelerationStructure} member <b>must</b> not be made <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#acceleration-structure-inactive-prims">inactive</a></li>
            <li>The {@code dstAccelerationStructure} member of any element of {@code pInfos} <b>must</b> not be referenced by the {@code geometry.instances.data} member of any element of {@code pGeometries} or {@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_INSTANCES_KHR in any other element of {@code pInfos}</li>
            <li>The range of memory backing the {@code dstAccelerationStructure} member of any element of {@code pInfos} that is accessed by this command <b>must</b> not overlap the memory backing the {@code srcAccelerationStructure} member of any other element of {@code pInfos} with a {@code mode} equal to #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, which is accessed by this command</li>
            <li>The range of memory backing the {@code dstAccelerationStructure} member of any element of {@code pInfos} that is accessed by this command <b>must</b> not overlap the memory backing the {@code dstAccelerationStructure} member of any other element of {@code pInfos}, which is accessed by this command</li>
            <li>The range of memory backing the {@code dstAccelerationStructure} member of any element of {@code pInfos} that is accessed by this command <b>must</b> not overlap the memory backing the {@code scratchData} member of any element of {@code pInfos} (including the same element), which is accessed by this command</li>
            <li>The range of memory backing the {@code scratchData} member of any element of {@code pInfos} that is accessed by this command <b>must</b> not overlap the memory backing the {@code scratchData} member of any other element of {@code pInfos}, which is accessed by this command</li>
            <li>The range of memory backing the {@code scratchData} member of any element of {@code pInfos} that is accessed by this command <b>must</b> not overlap the memory backing the {@code srcAccelerationStructure} member of any element of {@code pInfos} with a {@code mode} equal to #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR (including the same element), which is accessed by this command</li>
            <li>The range of memory backing the {@code dstAccelerationStructure} member of any element of {@code pInfos} that is accessed by this command <b>must</b> not overlap the memory backing any acceleration structure referenced by the {@code geometry.instances.data} member of any element of {@code pGeometries} or {@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_INSTANCES_KHR in any other element of {@code pInfos}, which is accessed by this command</li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, its {@code srcAccelerationStructure} member <b>must</b> have previously been constructed with #BUILD_ACCELERATION_STRUCTURE_ALLOW_UPDATE_BIT_KHR set in ##VkAccelerationStructureBuildGeometryInfoKHR{@code ::flags} in the build</li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, its {@code srcAccelerationStructure} and {@code dstAccelerationStructure} members <b>must</b> either be the same {@code VkAccelerationStructureKHR}, or not have any <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-memory-aliasing">memory aliasing</a></li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, its {@code geometryCount} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, its {@code flags} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, its {@code type} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, then for each ##VkAccelerationStructureGeometryKHR structure referred to by its {@code pGeometries} or {@code ppGeometries} members, its {@code geometryType} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, then for each ##VkAccelerationStructureGeometryKHR structure referred to by its {@code pGeometries} or {@code ppGeometries} members, its {@code flags} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, then for each ##VkAccelerationStructureGeometryKHR structure referred to by its {@code pGeometries} or {@code ppGeometries} members, if {@code geometryType} is #GEOMETRY_TYPE_TRIANGLES_KHR, its {@code geometry.triangles.vertexFormat} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, then for each ##VkAccelerationStructureGeometryKHR structure referred to by its {@code pGeometries} or {@code ppGeometries} members, if {@code geometryType} is #GEOMETRY_TYPE_TRIANGLES_KHR, its {@code geometry.triangles.maxVertex} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, then for each ##VkAccelerationStructureGeometryKHR structure referred to by its {@code pGeometries} or {@code ppGeometries} members, if {@code geometryType} is #GEOMETRY_TYPE_TRIANGLES_KHR, its {@code geometry.triangles.indexType} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, then for each ##VkAccelerationStructureGeometryKHR structure referred to by its {@code pGeometries} or {@code ppGeometries} members, if {@code geometryType} is #GEOMETRY_TYPE_TRIANGLES_KHR, if its {@code geometry.triangles.transformData} address was {@code NULL} when {@code srcAccelerationStructure} was last built, then it <b>must</b> be {@code NULL}</li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, then for each ##VkAccelerationStructureGeometryKHR structure referred to by its {@code pGeometries} or {@code ppGeometries} members, if {@code geometryType} is #GEOMETRY_TYPE_TRIANGLES_KHR, if its {@code geometry.triangles.transformData} address was not {@code NULL} when {@code srcAccelerationStructure} was last built, then it <b>must</b> not be {@code NULL}</li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, then for each ##VkAccelerationStructureGeometryKHR structure referred to by its {@code pGeometries} or {@code ppGeometries} members, if {@code geometryType} is #GEOMETRY_TYPE_TRIANGLES_KHR, and {@code geometry.triangles.indexType} is not #INDEX_TYPE_NONE_KHR, then the value of each index referenced <b>must</b> be the same as the corresponding index value when {@code srcAccelerationStructure} was last built</li>
            <li>For each ##VkAccelerationStructureBuildRangeInfoKHR referenced by this command, its {@code primitiveCount} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
            <li>For each ##VkAccelerationStructureBuildRangeInfoKHR referenced by this command, if the corresponding geometry uses indices, its {@code firstVertex} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
            <li>For each element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_INSTANCES_KHR, the corresponding {@code ppBuildRangeInfos}[i][j].{@code primitiveCount} <b>must</b> be less than or equal to ##VkPhysicalDeviceAccelerationStructurePropertiesKHR{@code ::maxInstanceCount}</li>
        </ul>

        <ul>
            <li>For each element of {@code pInfos}, the {@code buffer} used to create its {@code dstAccelerationStructure} member <b>must</b> be bound to device memory</li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR the {@code buffer} used to create its {@code srcAccelerationStructure} member <b>must</b> be bound to device memory</li>
            <li>For each element of {@code pInfos}, the {@code buffer} used to create each acceleration structure referenced by the {@code geometry.instances.data} member of any element of {@code pGeometries} or {@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_INSTANCES_KHR <b>must</b> be bound to device memory</li>
            <li>If {@code pInfos}[i].{@code mode} is #BUILD_ACCELERATION_STRUCTURE_MODE_BUILD_KHR, all addresses between {@code pInfos}[i].{@code scratchData.deviceAddress} and {@code pInfos}[i].{@code scratchData.deviceAddress} + N - 1 <b>must</b> be in the buffer device address range of the same buffer, where N is given by the {@code buildScratchSize} member of the ##VkAccelerationStructureBuildSizesInfoKHR structure returned from a call to #GetAccelerationStructureBuildSizesKHR() with an identical ##VkAccelerationStructureBuildGeometryInfoKHR structure and primitive count</li>
            <li>If {@code pInfos}[i].{@code mode} is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, all addresses between {@code pInfos}[i].{@code scratchData.deviceAddress} and {@code pInfos}[i].{@code scratchData.deviceAddress} + N - 1 <b>must</b> be in the buffer device address range of the same buffer, where N is given by the {@code updateScratchSize} member of the ##VkAccelerationStructureBuildSizesInfoKHR structure returned from a call to #GetAccelerationStructureBuildSizesKHR() with an identical ##VkAccelerationStructureBuildGeometryInfoKHR structure and primitive count</li>
            <li>The buffers from which the buffer device addresses for all of the {@code geometry.triangles.vertexData}, {@code geometry.triangles.indexData}, {@code geometry.triangles.transformData}, {@code geometry.aabbs.data}, and {@code geometry.instances.data} members of all {@code pInfos}[i].{@code pGeometries} and {@code pInfos}[i].{@code ppGeometries} are queried <b>must</b> have been created with the #BUFFER_USAGE_ACCELERATION_STRUCTURE_BUILD_INPUT_READ_ONLY_BIT_KHR usage flag</li>
            <li>The buffer from which the buffer device address {@code pInfos}[i].{@code scratchData.deviceAddress} is queried <b>must</b> have been created with #BUFFER_USAGE_STORAGE_BUFFER_BIT usage flag</li>
            <li>For each element of {@code pInfos}, its {@code scratchData.deviceAddress} member <b>must</b> be a valid device address obtained from #GetBufferDeviceAddress()</li>
            <li>For each element of {@code pInfos}, if {@code scratchData.deviceAddress} is the address of a non-sparse buffer then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>For each element of {@code pInfos}, its {@code scratchData.deviceAddress} member <b>must</b> be a multiple of ##VkPhysicalDeviceAccelerationStructurePropertiesKHR{@code ::minAccelerationStructureScratchOffsetAlignment}</li>
            <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_TRIANGLES_KHR, {@code geometry.triangles.vertexData.deviceAddress} <b>must</b> be a valid device address obtained from #GetBufferDeviceAddress()</li>
            <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_TRIANGLES_KHR, if {@code geometry.triangles.vertexData.deviceAddress} is the address of a non-sparse buffer then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_TRIANGLES_KHR, {@code geometry.triangles.vertexData.deviceAddress} <b>must</b> be aligned to the size in bytes of the smallest component of the format in {@code vertexFormat}</li>
            <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_TRIANGLES_KHR, if {@code geometry.triangles.indexType} is not #INDEX_TYPE_NONE_KHR, {@code geometry.triangles.indexData.deviceAddress} <b>must</b> be a valid device address obtained from #GetBufferDeviceAddress()</li>
            <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_TRIANGLES_KHR, if {@code geometry.triangles.indexType} is not #INDEX_TYPE_NONE_KHR, if {@code geometry.triangles.indexData.deviceAddress} is the address of a non-sparse buffer then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_TRIANGLES_KHR, and with {@code geometry.triangles.indexType} not equal to #INDEX_TYPE_NONE_KHR, {@code geometry.triangles.indexData.deviceAddress} <b>must</b> be aligned to the size in bytes of the type in {@code indexType}</li>
            <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_TRIANGLES_KHR, if {@code geometry.triangles.transformData.deviceAddress} is not 0, it <b>must</b> be a valid device address obtained from #GetBufferDeviceAddress()</li>
            <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_TRIANGLES_KHR, if {@code geometry.triangles.transformData.deviceAddress} is the address of a non-sparse buffer then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_TRIANGLES_KHR, if {@code geometry.triangles.transformData.deviceAddress} is not 0, it <b>must</b> be aligned to 16 bytes</li>
            <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_AABBS_KHR, {@code geometry.aabbs.data.deviceAddress} <b>must</b> be a valid device address obtained from #GetBufferDeviceAddress()</li>
            <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_AABBS_KHR, if {@code geometry.aabbs.data.deviceAddress} is the address of a non-sparse buffer then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_AABBS_KHR, {@code geometry.aabbs.data.deviceAddress} <b>must</b> be aligned to 8 bytes</li>
            <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_INSTANCES_KHR, if {@code geometry.arrayOfPointers} is #FALSE, {@code geometry.instances.data.deviceAddress} <b>must</b> be aligned to 16 bytes</li>
            <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_INSTANCES_KHR, if {@code geometry.arrayOfPointers} is #TRUE, {@code geometry.instances.data.deviceAddress} <b>must</b> be aligned to 8 bytes</li>
            <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_INSTANCES_KHR, if {@code geometry.arrayOfPointers} is #TRUE, each element of {@code geometry.instances.data.deviceAddress} in device memory <b>must</b> be aligned to 16 bytes</li>
            <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_INSTANCES_KHR, {@code geometry.instances.data.deviceAddress} <b>must</b> be a valid device address obtained from #GetBufferDeviceAddress()</li>
            <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_INSTANCES_KHR, if {@code geometry.instances.data.deviceAddress} is the address of a non-sparse buffer then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_INSTANCES_KHR, each ##VkAccelerationStructureInstanceKHR{@code ::accelerationStructureReference} value in {@code geometry.instances.data.deviceAddress} <b>must</b> be a valid device address containing a value obtained from #GetAccelerationStructureDeviceAddressKHR()</li>
        </ul>

        <ul>
            <li>For each {@code pInfos}[i], {@code dstAccelerationStructure} <b>must</b> have been created with a value of ##VkAccelerationStructureCreateInfoKHR{@code ::size} greater than or equal to the memory size required by the build operation, as returned by #GetAccelerationStructureBuildSizesKHR() with <code>pBuildInfo = pInfos[i]</code> and with each element of the {@code pMaxPrimitiveCounts} array greater than or equal to the equivalent {@code ppBuildRangeInfos}[i][j].{@code primitiveCount} values for {@code j} in <code>[0,pInfos[i].geometryCount)</code></li>
            <li>Each element of {@code ppBuildRangeInfos}[i] <b>must</b> be a valid pointer to an array of {@code pInfos}[i].{@code geometryCount} ##VkAccelerationStructureBuildRangeInfoKHR structures</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pInfos} <b>must</b> be a valid pointer to an array of {@code infoCount} valid ##VkAccelerationStructureBuildGeometryInfoKHR structures</li>
            <li>{@code ppBuildRangeInfos} <b>must</b> be a valid pointer to an array of {@code infoCount} ##VkAccelerationStructureBuildRangeInfoKHR structures</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>{@code infoCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Compute</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkAccelerationStructureBuildGeometryInfoKHR, ##VkAccelerationStructureBuildRangeInfoKHR
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        AutoSize("pInfos", "ppBuildRangeInfos")..uint32_t("infoCount", "the number of acceleration structures to build. It specifies the number of the {@code pInfos} structures and {@code ppBuildRangeInfos} pointers that <b>must</b> be provided."),
        VkAccelerationStructureBuildGeometryInfoKHR.const.p("pInfos", "a pointer to an array of {@code infoCount} ##VkAccelerationStructureBuildGeometryInfoKHR structures defining the geometry used to build each acceleration structure."),
        VkAccelerationStructureBuildRangeInfoKHR.const.p.const.p("ppBuildRangeInfos", "a pointer to an array of {@code infoCount} pointers to arrays of ##VkAccelerationStructureBuildRangeInfoKHR structures. Each {@code ppBuildRangeInfos}[i] is a pointer to an array of {@code pInfos}[i].{@code geometryCount} ##VkAccelerationStructureBuildRangeInfoKHR structures defining dynamic offsets to the addresses where geometry data is stored, as defined by {@code pInfos}[i].")
    )

    void(
        "CmdBuildAccelerationStructuresIndirectKHR",
        """
        Build an acceleration structure with some parameters provided on the device.

        <h5>C Specification</h5>
        To build acceleration structures with some parameters sourced on the device call:

        <pre><code>
￿void vkCmdBuildAccelerationStructuresIndirectKHR(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    infoCount,
￿    const VkAccelerationStructureBuildGeometryInfoKHR* pInfos,
￿    const VkDeviceAddress*                      pIndirectDeviceAddresses,
￿    const uint32_t*                             pIndirectStrides,
￿    const uint32_t* const*                      ppMaxPrimitiveCounts);</code></pre>

        <h5>Description</h5>
        Accesses to acceleration structures, scratch buffers, vertex buffers, index buffers, and instance buffers must be synchronized as with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#acceleration-structure-scratch">vkCmdBuildAccelerationStructuresKHR</a>.

        Accesses to any element of {@code pIndirectDeviceAddresses} <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-dependencies">synchronized</a> with the #PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_KHR <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-pipeline-stages">pipeline stage</a> and an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-access-types">access type</a> of #ACCESS_INDIRECT_COMMAND_READ_BIT.

        <h5>Valid Usage</h5>
        <ul>
            <li>The {@code mode} member of each element of {@code pInfos} <b>must</b> be a valid {@code VkBuildAccelerationStructureModeKHR} value</li>
            <li>If the {@code srcAccelerationStructure} member of any element of {@code pInfos} is not #NULL_HANDLE, the {@code srcAccelerationStructure} member <b>must</b> be a valid {@code VkAccelerationStructureKHR} handle</li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, its {@code srcAccelerationStructure} member <b>must</b> not be #NULL_HANDLE</li>
            <li>The {@code srcAccelerationStructure} member of any element of {@code pInfos} <b>must</b> not be the same acceleration structure as the {@code dstAccelerationStructure} member of any other element of {@code pInfos}</li>
            <li>The {@code dstAccelerationStructure} member of any element of {@code pInfos} <b>must</b> not be the same acceleration structure as the {@code dstAccelerationStructure} member of any other element of {@code pInfos}</li>
            <li>The {@code dstAccelerationStructure} member of any element of {@code pInfos} <b>must</b> be a valid {@code VkAccelerationStructureKHR} handle</li>
            <li>For each element of {@code pInfos}, if its {@code type} member is #ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_KHR, its {@code dstAccelerationStructure} member <b>must</b> have been created with a value of ##VkAccelerationStructureCreateInfoKHR{@code ::type} equal to either #ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_KHR or #ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR</li>
            <li>For each element of {@code pInfos}, if its {@code type} member is #ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_KHR, its {@code dstAccelerationStructure} member <b>must</b> have been created with a value of ##VkAccelerationStructureCreateInfoKHR{@code ::type} equal to either #ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_KHR or #ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR</li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#acceleration-structure-inactive-prims">inactive primitives</a> in its {@code srcAccelerationStructure} member <b>must</b> not be made active</li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, active primitives in its {@code srcAccelerationStructure} member <b>must</b> not be made <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#acceleration-structure-inactive-prims">inactive</a></li>
            <li>The {@code dstAccelerationStructure} member of any element of {@code pInfos} <b>must</b> not be referenced by the {@code geometry.instances.data} member of any element of {@code pGeometries} or {@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_INSTANCES_KHR in any other element of {@code pInfos}</li>
            <li>The range of memory backing the {@code dstAccelerationStructure} member of any element of {@code pInfos} that is accessed by this command <b>must</b> not overlap the memory backing the {@code srcAccelerationStructure} member of any other element of {@code pInfos} with a {@code mode} equal to #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, which is accessed by this command</li>
            <li>The range of memory backing the {@code dstAccelerationStructure} member of any element of {@code pInfos} that is accessed by this command <b>must</b> not overlap the memory backing the {@code dstAccelerationStructure} member of any other element of {@code pInfos}, which is accessed by this command</li>
            <li>The range of memory backing the {@code dstAccelerationStructure} member of any element of {@code pInfos} that is accessed by this command <b>must</b> not overlap the memory backing the {@code scratchData} member of any element of {@code pInfos} (including the same element), which is accessed by this command</li>
            <li>The range of memory backing the {@code scratchData} member of any element of {@code pInfos} that is accessed by this command <b>must</b> not overlap the memory backing the {@code scratchData} member of any other element of {@code pInfos}, which is accessed by this command</li>
            <li>The range of memory backing the {@code scratchData} member of any element of {@code pInfos} that is accessed by this command <b>must</b> not overlap the memory backing the {@code srcAccelerationStructure} member of any element of {@code pInfos} with a {@code mode} equal to #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR (including the same element), which is accessed by this command</li>
            <li>The range of memory backing the {@code dstAccelerationStructure} member of any element of {@code pInfos} that is accessed by this command <b>must</b> not overlap the memory backing any acceleration structure referenced by the {@code geometry.instances.data} member of any element of {@code pGeometries} or {@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_INSTANCES_KHR in any other element of {@code pInfos}, which is accessed by this command</li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, its {@code srcAccelerationStructure} member <b>must</b> have previously been constructed with #BUILD_ACCELERATION_STRUCTURE_ALLOW_UPDATE_BIT_KHR set in ##VkAccelerationStructureBuildGeometryInfoKHR{@code ::flags} in the build</li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, its {@code srcAccelerationStructure} and {@code dstAccelerationStructure} members <b>must</b> either be the same {@code VkAccelerationStructureKHR}, or not have any <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-memory-aliasing">memory aliasing</a></li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, its {@code geometryCount} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, its {@code flags} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, its {@code type} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, then for each ##VkAccelerationStructureGeometryKHR structure referred to by its {@code pGeometries} or {@code ppGeometries} members, its {@code geometryType} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, then for each ##VkAccelerationStructureGeometryKHR structure referred to by its {@code pGeometries} or {@code ppGeometries} members, its {@code flags} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, then for each ##VkAccelerationStructureGeometryKHR structure referred to by its {@code pGeometries} or {@code ppGeometries} members, if {@code geometryType} is #GEOMETRY_TYPE_TRIANGLES_KHR, its {@code geometry.triangles.vertexFormat} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, then for each ##VkAccelerationStructureGeometryKHR structure referred to by its {@code pGeometries} or {@code ppGeometries} members, if {@code geometryType} is #GEOMETRY_TYPE_TRIANGLES_KHR, its {@code geometry.triangles.maxVertex} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, then for each ##VkAccelerationStructureGeometryKHR structure referred to by its {@code pGeometries} or {@code ppGeometries} members, if {@code geometryType} is #GEOMETRY_TYPE_TRIANGLES_KHR, its {@code geometry.triangles.indexType} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, then for each ##VkAccelerationStructureGeometryKHR structure referred to by its {@code pGeometries} or {@code ppGeometries} members, if {@code geometryType} is #GEOMETRY_TYPE_TRIANGLES_KHR, if its {@code geometry.triangles.transformData} address was {@code NULL} when {@code srcAccelerationStructure} was last built, then it <b>must</b> be {@code NULL}</li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, then for each ##VkAccelerationStructureGeometryKHR structure referred to by its {@code pGeometries} or {@code ppGeometries} members, if {@code geometryType} is #GEOMETRY_TYPE_TRIANGLES_KHR, if its {@code geometry.triangles.transformData} address was not {@code NULL} when {@code srcAccelerationStructure} was last built, then it <b>must</b> not be {@code NULL}</li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, then for each ##VkAccelerationStructureGeometryKHR structure referred to by its {@code pGeometries} or {@code ppGeometries} members, if {@code geometryType} is #GEOMETRY_TYPE_TRIANGLES_KHR, and {@code geometry.triangles.indexType} is not #INDEX_TYPE_NONE_KHR, then the value of each index referenced <b>must</b> be the same as the corresponding index value when {@code srcAccelerationStructure} was last built</li>
            <li>For each ##VkAccelerationStructureBuildRangeInfoKHR referenced by this command, its {@code primitiveCount} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
            <li>For each ##VkAccelerationStructureBuildRangeInfoKHR referenced by this command, if the corresponding geometry uses indices, its {@code firstVertex} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
            <li>For each element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_INSTANCES_KHR, the corresponding {@code ppMaxPrimitiveCounts}[i][j] <b>must</b> be less than or equal to ##VkPhysicalDeviceAccelerationStructurePropertiesKHR{@code ::maxInstanceCount}</li>
        </ul>

        <ul>
            <li>For each element of {@code pInfos}, the {@code buffer} used to create its {@code dstAccelerationStructure} member <b>must</b> be bound to device memory</li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR the {@code buffer} used to create its {@code srcAccelerationStructure} member <b>must</b> be bound to device memory</li>
            <li>For each element of {@code pInfos}, the {@code buffer} used to create each acceleration structure referenced by the {@code geometry.instances.data} member of any element of {@code pGeometries} or {@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_INSTANCES_KHR <b>must</b> be bound to device memory</li>
            <li>If {@code pInfos}[i].{@code mode} is #BUILD_ACCELERATION_STRUCTURE_MODE_BUILD_KHR, all addresses between {@code pInfos}[i].{@code scratchData.deviceAddress} and {@code pInfos}[i].{@code scratchData.deviceAddress} + N - 1 <b>must</b> be in the buffer device address range of the same buffer, where N is given by the {@code buildScratchSize} member of the ##VkAccelerationStructureBuildSizesInfoKHR structure returned from a call to #GetAccelerationStructureBuildSizesKHR() with an identical ##VkAccelerationStructureBuildGeometryInfoKHR structure and primitive count</li>
            <li>If {@code pInfos}[i].{@code mode} is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, all addresses between {@code pInfos}[i].{@code scratchData.deviceAddress} and {@code pInfos}[i].{@code scratchData.deviceAddress} + N - 1 <b>must</b> be in the buffer device address range of the same buffer, where N is given by the {@code updateScratchSize} member of the ##VkAccelerationStructureBuildSizesInfoKHR structure returned from a call to #GetAccelerationStructureBuildSizesKHR() with an identical ##VkAccelerationStructureBuildGeometryInfoKHR structure and primitive count</li>
            <li>The buffers from which the buffer device addresses for all of the {@code geometry.triangles.vertexData}, {@code geometry.triangles.indexData}, {@code geometry.triangles.transformData}, {@code geometry.aabbs.data}, and {@code geometry.instances.data} members of all {@code pInfos}[i].{@code pGeometries} and {@code pInfos}[i].{@code ppGeometries} are queried <b>must</b> have been created with the #BUFFER_USAGE_ACCELERATION_STRUCTURE_BUILD_INPUT_READ_ONLY_BIT_KHR usage flag</li>
            <li>The buffer from which the buffer device address {@code pInfos}[i].{@code scratchData.deviceAddress} is queried <b>must</b> have been created with #BUFFER_USAGE_STORAGE_BUFFER_BIT usage flag</li>
            <li>For each element of {@code pInfos}, its {@code scratchData.deviceAddress} member <b>must</b> be a valid device address obtained from #GetBufferDeviceAddress()</li>
            <li>For each element of {@code pInfos}, if {@code scratchData.deviceAddress} is the address of a non-sparse buffer then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>For each element of {@code pInfos}, its {@code scratchData.deviceAddress} member <b>must</b> be a multiple of ##VkPhysicalDeviceAccelerationStructurePropertiesKHR{@code ::minAccelerationStructureScratchOffsetAlignment}</li>
            <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_TRIANGLES_KHR, {@code geometry.triangles.vertexData.deviceAddress} <b>must</b> be a valid device address obtained from #GetBufferDeviceAddress()</li>
            <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_TRIANGLES_KHR, if {@code geometry.triangles.vertexData.deviceAddress} is the address of a non-sparse buffer then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_TRIANGLES_KHR, {@code geometry.triangles.vertexData.deviceAddress} <b>must</b> be aligned to the size in bytes of the smallest component of the format in {@code vertexFormat}</li>
            <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_TRIANGLES_KHR, if {@code geometry.triangles.indexType} is not #INDEX_TYPE_NONE_KHR, {@code geometry.triangles.indexData.deviceAddress} <b>must</b> be a valid device address obtained from #GetBufferDeviceAddress()</li>
            <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_TRIANGLES_KHR, if {@code geometry.triangles.indexType} is not #INDEX_TYPE_NONE_KHR, if {@code geometry.triangles.indexData.deviceAddress} is the address of a non-sparse buffer then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_TRIANGLES_KHR, and with {@code geometry.triangles.indexType} not equal to #INDEX_TYPE_NONE_KHR, {@code geometry.triangles.indexData.deviceAddress} <b>must</b> be aligned to the size in bytes of the type in {@code indexType}</li>
            <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_TRIANGLES_KHR, if {@code geometry.triangles.transformData.deviceAddress} is not 0, it <b>must</b> be a valid device address obtained from #GetBufferDeviceAddress()</li>
            <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_TRIANGLES_KHR, if {@code geometry.triangles.transformData.deviceAddress} is the address of a non-sparse buffer then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_TRIANGLES_KHR, if {@code geometry.triangles.transformData.deviceAddress} is not 0, it <b>must</b> be aligned to 16 bytes</li>
            <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_AABBS_KHR, {@code geometry.aabbs.data.deviceAddress} <b>must</b> be a valid device address obtained from #GetBufferDeviceAddress()</li>
            <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_AABBS_KHR, if {@code geometry.aabbs.data.deviceAddress} is the address of a non-sparse buffer then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_AABBS_KHR, {@code geometry.aabbs.data.deviceAddress} <b>must</b> be aligned to 8 bytes</li>
            <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_INSTANCES_KHR, if {@code geometry.arrayOfPointers} is #FALSE, {@code geometry.instances.data.deviceAddress} <b>must</b> be aligned to 16 bytes</li>
            <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_INSTANCES_KHR, if {@code geometry.arrayOfPointers} is #TRUE, {@code geometry.instances.data.deviceAddress} <b>must</b> be aligned to 8 bytes</li>
            <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_INSTANCES_KHR, if {@code geometry.arrayOfPointers} is #TRUE, each element of {@code geometry.instances.data.deviceAddress} in device memory <b>must</b> be aligned to 16 bytes</li>
            <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_INSTANCES_KHR, {@code geometry.instances.data.deviceAddress} <b>must</b> be a valid device address obtained from #GetBufferDeviceAddress()</li>
            <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_INSTANCES_KHR, if {@code geometry.instances.data.deviceAddress} is the address of a non-sparse buffer then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_INSTANCES_KHR, each ##VkAccelerationStructureInstanceKHR{@code ::accelerationStructureReference} value in {@code geometry.instances.data.deviceAddress} <b>must</b> be a valid device address containing a value obtained from #GetAccelerationStructureDeviceAddressKHR()</li>
            <li>For any element of {@code pIndirectDeviceAddresses}, if the buffer from which it was queried is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>For any element of {@code pIndirectDeviceAddresses}[i], all device addresses between {@code pIndirectDeviceAddresses}[i] and <code>pIndirectDeviceAddresses[i] + (pInfos[i].geometryCount × pIndirectStrides[i]) - 1</code> <b>must</b> be in the buffer device address range of the same buffer</li>
            <li>For any element of {@code pIndirectDeviceAddresses}, the buffer from which it was queried <b>must</b> have been created with the #BUFFER_USAGE_INDIRECT_BUFFER_BIT bit set</li>
            <li>Each element of {@code pIndirectDeviceAddresses} <b>must</b> be a multiple of 4</li>
            <li>Each element of {@code pIndirectStrides} <b>must</b> be a multiple of 4</li>
            <li>{@code commandBuffer} <b>must</b> not be a protected command buffer</li>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-accelerationStructureIndirectBuild">##VkPhysicalDeviceAccelerationStructureFeaturesKHR{@code ::accelerationStructureIndirectBuild}</a> feature <b>must</b> be enabled</li>
            <li>Each ##VkAccelerationStructureBuildRangeInfoKHR structure referenced by any element of {@code pIndirectDeviceAddresses} <b>must</b> be a valid ##VkAccelerationStructureBuildRangeInfoKHR structure</li>
            <li>{@code pInfos}[i].{@code dstAccelerationStructure} <b>must</b> have been created with a value of ##VkAccelerationStructureCreateInfoKHR{@code ::size} greater than or equal to the memory size required by the build operation, as returned by #GetAccelerationStructureBuildSizesKHR() with <code>pBuildInfo = pInfos[i]</code> and <code>pMaxPrimitiveCounts = ppMaxPrimitiveCounts[i]</code></li>
            <li>Each {@code ppMaxPrimitiveCounts}[i][j] <b>must</b> be greater than or equal to the the {@code primitiveCount} value specified by the ##VkAccelerationStructureBuildRangeInfoKHR structure located at <code>pIndirectDeviceAddresses[i] + (j × pIndirectStrides[i])</code></li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pInfos} <b>must</b> be a valid pointer to an array of {@code infoCount} valid ##VkAccelerationStructureBuildGeometryInfoKHR structures</li>
            <li>{@code pIndirectDeviceAddresses} <b>must</b> be a valid pointer to an array of {@code infoCount} {@code VkDeviceAddress} values</li>
            <li>{@code pIndirectStrides} <b>must</b> be a valid pointer to an array of {@code infoCount} {@code uint32_t} values</li>
            <li>{@code ppMaxPrimitiveCounts} <b>must</b> be a valid pointer to an array of {@code infoCount} {@code uint32_t} values</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>{@code infoCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Compute</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkAccelerationStructureBuildGeometryInfoKHR
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        AutoSize("pInfos", "pIndirectDeviceAddresses", "pIndirectStrides", "ppMaxPrimitiveCounts")..uint32_t("infoCount", "the number of acceleration structures to build."),
        VkAccelerationStructureBuildGeometryInfoKHR.const.p("pInfos", "a pointer to an array of {@code infoCount} ##VkAccelerationStructureBuildGeometryInfoKHR structures defining the geometry used to build each acceleration structure."),
        VkDeviceAddress.const.p("pIndirectDeviceAddresses", "a pointer to an array of {@code infoCount} buffer device addresses which point to {@code pInfos}[i].{@code geometryCount} ##VkAccelerationStructureBuildRangeInfoKHR structures defining dynamic offsets to the addresses where geometry data is stored, as defined by {@code pInfos}[i]."),
        uint32_t.const.p("pIndirectStrides", "a pointer to an array of {@code infoCount} byte strides between elements of {@code pIndirectDeviceAddresses}."),
        uint32_t.const.p.const.p("ppMaxPrimitiveCounts", "a pointer to an array of {@code infoCount} pointers to arrays of {@code pInfos}[i].{@code geometryCount} values indicating the maximum number of primitives that will be built by this command for each geometry.")
    )

    VkResult(
        "BuildAccelerationStructuresKHR",
        """
        Build an acceleration structure on the host.

        <h5>C Specification</h5>
        To build acceleration structures on the host, call:

        <pre><code>
￿VkResult vkBuildAccelerationStructuresKHR(
￿    VkDevice                                    device,
￿    VkDeferredOperationKHR                      deferredOperation,
￿    uint32_t                                    infoCount,
￿    const VkAccelerationStructureBuildGeometryInfoKHR* pInfos,
￿    const VkAccelerationStructureBuildRangeInfoKHR* const* ppBuildRangeInfos);</code></pre>

        <h5>Description</h5>
        This command fulfills the same task as #CmdBuildAccelerationStructuresKHR() but is executed by the host.

        The {@code vkBuildAccelerationStructuresKHR} command provides the ability to initiate multiple acceleration structures builds, however there is no ordering or synchronization implied between any of the individual acceleration structure builds.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        This means that an application <b>cannot</b> build a top-level acceleration structure in the same #BuildAccelerationStructuresKHR() call as the associated bottom-level or instance acceleration structures are being built. There also <b>cannot</b> be any memory aliasing between any acceleration structure memories or scratch memories being used by any of the builds.
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>The {@code mode} member of each element of {@code pInfos} <b>must</b> be a valid {@code VkBuildAccelerationStructureModeKHR} value</li>
            <li>If the {@code srcAccelerationStructure} member of any element of {@code pInfos} is not #NULL_HANDLE, the {@code srcAccelerationStructure} member <b>must</b> be a valid {@code VkAccelerationStructureKHR} handle</li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, its {@code srcAccelerationStructure} member <b>must</b> not be #NULL_HANDLE</li>
            <li>The {@code srcAccelerationStructure} member of any element of {@code pInfos} <b>must</b> not be the same acceleration structure as the {@code dstAccelerationStructure} member of any other element of {@code pInfos}</li>
            <li>The {@code dstAccelerationStructure} member of any element of {@code pInfos} <b>must</b> not be the same acceleration structure as the {@code dstAccelerationStructure} member of any other element of {@code pInfos}</li>
            <li>The {@code dstAccelerationStructure} member of any element of {@code pInfos} <b>must</b> be a valid {@code VkAccelerationStructureKHR} handle</li>
            <li>For each element of {@code pInfos}, if its {@code type} member is #ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_KHR, its {@code dstAccelerationStructure} member <b>must</b> have been created with a value of ##VkAccelerationStructureCreateInfoKHR{@code ::type} equal to either #ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_KHR or #ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR</li>
            <li>For each element of {@code pInfos}, if its {@code type} member is #ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_KHR, its {@code dstAccelerationStructure} member <b>must</b> have been created with a value of ##VkAccelerationStructureCreateInfoKHR{@code ::type} equal to either #ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_KHR or #ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR</li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#acceleration-structure-inactive-prims">inactive primitives</a> in its {@code srcAccelerationStructure} member <b>must</b> not be made active</li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, active primitives in its {@code srcAccelerationStructure} member <b>must</b> not be made <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#acceleration-structure-inactive-prims">inactive</a></li>
            <li>The {@code dstAccelerationStructure} member of any element of {@code pInfos} <b>must</b> not be referenced by the {@code geometry.instances.data} member of any element of {@code pGeometries} or {@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_INSTANCES_KHR in any other element of {@code pInfos}</li>
            <li>The range of memory backing the {@code dstAccelerationStructure} member of any element of {@code pInfos} that is accessed by this command <b>must</b> not overlap the memory backing the {@code srcAccelerationStructure} member of any other element of {@code pInfos} with a {@code mode} equal to #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, which is accessed by this command</li>
            <li>The range of memory backing the {@code dstAccelerationStructure} member of any element of {@code pInfos} that is accessed by this command <b>must</b> not overlap the memory backing the {@code dstAccelerationStructure} member of any other element of {@code pInfos}, which is accessed by this command</li>
            <li>The range of memory backing the {@code dstAccelerationStructure} member of any element of {@code pInfos} that is accessed by this command <b>must</b> not overlap the memory backing the {@code scratchData} member of any element of {@code pInfos} (including the same element), which is accessed by this command</li>
            <li>The range of memory backing the {@code scratchData} member of any element of {@code pInfos} that is accessed by this command <b>must</b> not overlap the memory backing the {@code scratchData} member of any other element of {@code pInfos}, which is accessed by this command</li>
            <li>The range of memory backing the {@code scratchData} member of any element of {@code pInfos} that is accessed by this command <b>must</b> not overlap the memory backing the {@code srcAccelerationStructure} member of any element of {@code pInfos} with a {@code mode} equal to #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR (including the same element), which is accessed by this command</li>
            <li>The range of memory backing the {@code dstAccelerationStructure} member of any element of {@code pInfos} that is accessed by this command <b>must</b> not overlap the memory backing any acceleration structure referenced by the {@code geometry.instances.data} member of any element of {@code pGeometries} or {@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_INSTANCES_KHR in any other element of {@code pInfos}, which is accessed by this command</li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, its {@code srcAccelerationStructure} member <b>must</b> have previously been constructed with #BUILD_ACCELERATION_STRUCTURE_ALLOW_UPDATE_BIT_KHR set in ##VkAccelerationStructureBuildGeometryInfoKHR{@code ::flags} in the build</li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, its {@code srcAccelerationStructure} and {@code dstAccelerationStructure} members <b>must</b> either be the same {@code VkAccelerationStructureKHR}, or not have any <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-memory-aliasing">memory aliasing</a></li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, its {@code geometryCount} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, its {@code flags} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, its {@code type} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, then for each ##VkAccelerationStructureGeometryKHR structure referred to by its {@code pGeometries} or {@code ppGeometries} members, its {@code geometryType} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, then for each ##VkAccelerationStructureGeometryKHR structure referred to by its {@code pGeometries} or {@code ppGeometries} members, its {@code flags} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, then for each ##VkAccelerationStructureGeometryKHR structure referred to by its {@code pGeometries} or {@code ppGeometries} members, if {@code geometryType} is #GEOMETRY_TYPE_TRIANGLES_KHR, its {@code geometry.triangles.vertexFormat} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, then for each ##VkAccelerationStructureGeometryKHR structure referred to by its {@code pGeometries} or {@code ppGeometries} members, if {@code geometryType} is #GEOMETRY_TYPE_TRIANGLES_KHR, its {@code geometry.triangles.maxVertex} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, then for each ##VkAccelerationStructureGeometryKHR structure referred to by its {@code pGeometries} or {@code ppGeometries} members, if {@code geometryType} is #GEOMETRY_TYPE_TRIANGLES_KHR, its {@code geometry.triangles.indexType} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, then for each ##VkAccelerationStructureGeometryKHR structure referred to by its {@code pGeometries} or {@code ppGeometries} members, if {@code geometryType} is #GEOMETRY_TYPE_TRIANGLES_KHR, if its {@code geometry.triangles.transformData} address was {@code NULL} when {@code srcAccelerationStructure} was last built, then it <b>must</b> be {@code NULL}</li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, then for each ##VkAccelerationStructureGeometryKHR structure referred to by its {@code pGeometries} or {@code ppGeometries} members, if {@code geometryType} is #GEOMETRY_TYPE_TRIANGLES_KHR, if its {@code geometry.triangles.transformData} address was not {@code NULL} when {@code srcAccelerationStructure} was last built, then it <b>must</b> not be {@code NULL}</li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, then for each ##VkAccelerationStructureGeometryKHR structure referred to by its {@code pGeometries} or {@code ppGeometries} members, if {@code geometryType} is #GEOMETRY_TYPE_TRIANGLES_KHR, and {@code geometry.triangles.indexType} is not #INDEX_TYPE_NONE_KHR, then the value of each index referenced <b>must</b> be the same as the corresponding index value when {@code srcAccelerationStructure} was last built</li>
            <li>For each ##VkAccelerationStructureBuildRangeInfoKHR referenced by this command, its {@code primitiveCount} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
            <li>For each ##VkAccelerationStructureBuildRangeInfoKHR referenced by this command, if the corresponding geometry uses indices, its {@code firstVertex} member <b>must</b> have the same value which was specified when {@code srcAccelerationStructure} was last built</li>
            <li>For each element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_INSTANCES_KHR, the corresponding {@code ppBuildRangeInfos}[i][j].{@code primitiveCount} <b>must</b> be less than or equal to ##VkPhysicalDeviceAccelerationStructurePropertiesKHR{@code ::maxInstanceCount}</li>
        </ul>

        <ul>
            <li>For each {@code pInfos}[i], {@code dstAccelerationStructure} <b>must</b> have been created with a value of ##VkAccelerationStructureCreateInfoKHR{@code ::size} greater than or equal to the memory size required by the build operation, as returned by #GetAccelerationStructureBuildSizesKHR() with <code>pBuildInfo = pInfos[i]</code> and with each element of the {@code pMaxPrimitiveCounts} array greater than or equal to the equivalent {@code ppBuildRangeInfos}[i][j].{@code primitiveCount} values for {@code j} in <code>[0,pInfos[i].geometryCount)</code></li>
            <li>Each element of {@code ppBuildRangeInfos}[i] <b>must</b> be a valid pointer to an array of {@code pInfos}[i].{@code geometryCount} ##VkAccelerationStructureBuildRangeInfoKHR structures</li>
        </ul>

        <ul>
            <li>If {@code deferredOperation} is not #NULL_HANDLE, it <b>must</b> be a valid {@code VkDeferredOperationKHR} object</li>
            <li>Any previous deferred operation that was associated with {@code deferredOperation} <b>must</b> be complete</li>
            <li>For each element of {@code pInfos}, the {@code buffer} used to create its {@code dstAccelerationStructure} member <b>must</b> be bound to host-visible device memory</li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR the {@code buffer} used to create its {@code srcAccelerationStructure} member <b>must</b> be bound to host-visible device memory</li>
            <li>For each element of {@code pInfos}, the {@code buffer} used to create each acceleration structure referenced by the {@code geometry.instances.data} member of any element of {@code pGeometries} or {@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_INSTANCES_KHR <b>must</b> be bound to host-visible device memory</li>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-accelerationStructureHostCommands">##VkPhysicalDeviceAccelerationStructureFeaturesKHR{@code ::accelerationStructureHostCommands}</a> feature <b>must</b> be enabled</li>
            <li>If {@code pInfos}[i].{@code mode} is #BUILD_ACCELERATION_STRUCTURE_MODE_BUILD_KHR, all addresses between {@code pInfos}[i].{@code scratchData.hostAddress} and {@code pInfos}[i].{@code scratchData.hostAddress} + N - 1 <b>must</b> be valid host memory, where N is given by the {@code buildScratchSize} member of the ##VkAccelerationStructureBuildSizesInfoKHR structure returned from a call to #GetAccelerationStructureBuildSizesKHR() with an identical ##VkAccelerationStructureBuildGeometryInfoKHR structure and primitive count</li>
            <li>If {@code pInfos}[i].{@code mode} is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR, all addresses between {@code pInfos}[i].{@code scratchData.hostAddress} and {@code pInfos}[i].{@code scratchData.hostAddress} + N - 1 <b>must</b> be valid host memory, where N is given by the {@code updateScratchSize} member of the ##VkAccelerationStructureBuildSizesInfoKHR structure returned from a call to #GetAccelerationStructureBuildSizesKHR() with an identical ##VkAccelerationStructureBuildGeometryInfoKHR structure and primitive count</li>
            <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_TRIANGLES_KHR, {@code geometry.triangles.vertexData.hostAddress} <b>must</b> be a valid host address</li>
            <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_TRIANGLES_KHR, if {@code geometry.triangles.indexType} is not #INDEX_TYPE_NONE_KHR, {@code geometry.triangles.indexData.hostAddress} <b>must</b> be a valid host address</li>
            <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_TRIANGLES_KHR, if {@code geometry.triangles.transformData.hostAddress} is not 0, it <b>must</b> be a valid host address</li>
            <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_AABBS_KHR, {@code geometry.aabbs.data.hostAddress} <b>must</b> be a valid host address</li>
            <li>For each element of {@code pInfos}, the {@code buffer} used to create its {@code dstAccelerationStructure} member <b>must</b> be bound to memory that was not allocated with multiple instances</li>
            <li>For each element of {@code pInfos}, if its {@code mode} member is #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR the {@code buffer} used to create its {@code srcAccelerationStructure} member <b>must</b> be bound to memory that was not allocated with multiple instances</li>
            <li>For each element of {@code pInfos}, the {@code buffer} used to create each acceleration structure referenced by the {@code geometry.instances.data} member of any element of {@code pGeometries} or {@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_INSTANCES_KHR <b>must</b> be bound to memory that was not allocated with multiple instances</li>
            <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_INSTANCES_KHR, {@code geometry.instances.data.hostAddress} <b>must</b> be a valid host address</li>
            <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_INSTANCES_KHR, each ##VkAccelerationStructureInstanceKHR{@code ::accelerationStructureReference} value in {@code geometry.instances.data.hostAddress} must be a valid {@code VkAccelerationStructureKHR} object</li>
            <li>For any element of {@code pInfos}[i].{@code pGeometries} or {@code pInfos}[i].{@code ppGeometries} with a {@code geometryType} of #GEOMETRY_TYPE_INSTANCES_KHR with #BUILD_ACCELERATION_STRUCTURE_MOTION_BIT_NV set, each {@code accelerationStructureReference} in any structure in ##VkAccelerationStructureMotionInstanceNV value in {@code geometry.instances.data.hostAddress} must be a valid {@code VkAccelerationStructureKHR} object</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code deferredOperation} is not #NULL_HANDLE, {@code deferredOperation} <b>must</b> be a valid {@code VkDeferredOperationKHR} handle</li>
            <li>{@code pInfos} <b>must</b> be a valid pointer to an array of {@code infoCount} valid ##VkAccelerationStructureBuildGeometryInfoKHR structures</li>
            <li>{@code ppBuildRangeInfos} <b>must</b> be a valid pointer to an array of {@code infoCount} ##VkAccelerationStructureBuildRangeInfoKHR structures</li>
            <li>{@code infoCount} <b>must</b> be greater than 0</li>
            <li>If {@code deferredOperation} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#OPERATION_DEFERRED_KHR</li>
                <li>#OPERATION_NOT_DEFERRED_KHR</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAccelerationStructureBuildGeometryInfoKHR, ##VkAccelerationStructureBuildRangeInfoKHR
        """,

        VkDevice("device", "the {@code VkDevice} for which the acceleration structures are being built."),
        VkDeferredOperationKHR("deferredOperation", "an optional {@code VkDeferredOperationKHR} to <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\\#deferred-host-operations-requesting\">request deferral</a> for this command."),
        AutoSize("pInfos", "ppBuildRangeInfos")..uint32_t("infoCount", "the number of acceleration structures to build. It specifies the number of the {@code pInfos} structures and {@code ppBuildRangeInfos} pointers that <b>must</b> be provided."),
        VkAccelerationStructureBuildGeometryInfoKHR.const.p("pInfos", "a pointer to an array of {@code infoCount} ##VkAccelerationStructureBuildGeometryInfoKHR structures defining the geometry used to build each acceleration structure."),
        VkAccelerationStructureBuildRangeInfoKHR.const.p.const.p("ppBuildRangeInfos", "a pointer to an array of {@code infoCount} pointers to arrays of ##VkAccelerationStructureBuildRangeInfoKHR structures. Each {@code ppBuildRangeInfos}[i] is a pointer to an array of {@code pInfos}[i].{@code geometryCount} ##VkAccelerationStructureBuildRangeInfoKHR structures defining dynamic offsets to the addresses where geometry data is stored, as defined by {@code pInfos}[i].")
    )

    VkResult(
        "CopyAccelerationStructureKHR",
        """
        Copy an acceleration structure on the host.

        <h5>C Specification</h5>
        To copy or compact an acceleration structure on the host, call:

        <pre><code>
￿VkResult vkCopyAccelerationStructureKHR(
￿    VkDevice                                    device,
￿    VkDeferredOperationKHR                      deferredOperation,
￿    const VkCopyAccelerationStructureInfoKHR*   pInfo);</code></pre>

        <h5>Description</h5>
        This command fulfills the same task as #CmdCopyAccelerationStructureKHR() but is executed by the host.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code deferredOperation} is not #NULL_HANDLE, it <b>must</b> be a valid {@code VkDeferredOperationKHR} object</li>
            <li>Any previous deferred operation that was associated with {@code deferredOperation} <b>must</b> be complete</li>
            <li>The {@code buffer} used to create {@code pInfo→src} <b>must</b> be bound to host-visible device memory</li>
            <li>The {@code buffer} used to create {@code pInfo→dst} <b>must</b> be bound to host-visible device memory</li>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-accelerationStructureHostCommands">##VkPhysicalDeviceAccelerationStructureFeaturesKHR{@code ::accelerationStructureHostCommands}</a> feature <b>must</b> be enabled</li>
            <li>The {@code buffer} used to create {@code pInfo→src} <b>must</b> be bound to memory that was not allocated with multiple instances</li>
            <li>The {@code buffer} used to create {@code pInfo→dst} <b>must</b> be bound to memory that was not allocated with multiple instances</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code deferredOperation} is not #NULL_HANDLE, {@code deferredOperation} <b>must</b> be a valid {@code VkDeferredOperationKHR} handle</li>
            <li>{@code pInfo} <b>must</b> be a valid pointer to a valid ##VkCopyAccelerationStructureInfoKHR structure</li>
            <li>If {@code deferredOperation} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#OPERATION_DEFERRED_KHR</li>
                <li>#OPERATION_NOT_DEFERRED_KHR</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkCopyAccelerationStructureInfoKHR
        """,

        VkDevice("device", "the device which owns the acceleration structures."),
        VkDeferredOperationKHR("deferredOperation", "an optional {@code VkDeferredOperationKHR} to <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\\#deferred-host-operations-requesting\">request deferral</a> for this command."),
        VkCopyAccelerationStructureInfoKHR.const.p("pInfo", "a pointer to a ##VkCopyAccelerationStructureInfoKHR structure defining the copy operation.")
    )

    VkResult(
        "CopyAccelerationStructureToMemoryKHR",
        """
        Serialize an acceleration structure on the host.

        <h5>C Specification</h5>
        To copy an acceleration structure to host accessible memory, call:

        <pre><code>
￿VkResult vkCopyAccelerationStructureToMemoryKHR(
￿    VkDevice                                    device,
￿    VkDeferredOperationKHR                      deferredOperation,
￿    const VkCopyAccelerationStructureToMemoryInfoKHR* pInfo);</code></pre>

        <h5>Description</h5>
        This command fulfills the same task as #CmdCopyAccelerationStructureToMemoryKHR() but is executed by the host.

        This command produces the same results as #CmdCopyAccelerationStructureToMemoryKHR(), but writes its result directly to a host pointer, and is executed on the host rather than the device. The output <b>may</b> not necessarily be bit-for-bit identical, but it can be equally used by either #CmdCopyMemoryToAccelerationStructureKHR() or #CopyMemoryToAccelerationStructureKHR().

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code deferredOperation} is not #NULL_HANDLE, it <b>must</b> be a valid {@code VkDeferredOperationKHR} object</li>
            <li>Any previous deferred operation that was associated with {@code deferredOperation} <b>must</b> be complete</li>
            <li>The {@code buffer} used to create {@code pInfo→src} <b>must</b> be bound to host-visible device memory</li>
            <li>{@code pInfo→dst.hostAddress} <b>must</b> be a valid host pointer</li>
            <li>{@code pInfo→dst.hostAddress} <b>must</b> be aligned to 16 bytes</li>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-accelerationStructureHostCommands">##VkPhysicalDeviceAccelerationStructureFeaturesKHR{@code ::accelerationStructureHostCommands}</a> feature <b>must</b> be enabled</li>
            <li>The {@code buffer} used to create {@code pInfo→src} <b>must</b> be bound to memory that was not allocated with multiple instances</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code deferredOperation} is not #NULL_HANDLE, {@code deferredOperation} <b>must</b> be a valid {@code VkDeferredOperationKHR} handle</li>
            <li>{@code pInfo} <b>must</b> be a valid pointer to a valid ##VkCopyAccelerationStructureToMemoryInfoKHR structure</li>
            <li>If {@code deferredOperation} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#OPERATION_DEFERRED_KHR</li>
                <li>#OPERATION_NOT_DEFERRED_KHR</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkCopyAccelerationStructureToMemoryInfoKHR
        """,

        VkDevice("device", "the device which owns {@code pInfo→src}."),
        VkDeferredOperationKHR("deferredOperation", "an optional {@code VkDeferredOperationKHR} to <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\\#deferred-host-operations-requesting\">request deferral</a> for this command."),
        VkCopyAccelerationStructureToMemoryInfoKHR.const.p("pInfo", "a pointer to a ##VkCopyAccelerationStructureToMemoryInfoKHR structure defining the copy operation.")
    )

    VkResult(
        "CopyMemoryToAccelerationStructureKHR",
        """
        Deserialize an acceleration structure on the host.

        <h5>C Specification</h5>
        To copy host accessible memory to an acceleration structure, call:

        <pre><code>
￿VkResult vkCopyMemoryToAccelerationStructureKHR(
￿    VkDevice                                    device,
￿    VkDeferredOperationKHR                      deferredOperation,
￿    const VkCopyMemoryToAccelerationStructureInfoKHR* pInfo);</code></pre>

        <h5>Description</h5>
        This command fulfills the same task as #CmdCopyMemoryToAccelerationStructureKHR() but is executed by the host.

        This command can accept acceleration structures produced by either #CmdCopyAccelerationStructureToMemoryKHR() or #CopyAccelerationStructureToMemoryKHR().

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code deferredOperation} is not #NULL_HANDLE, it <b>must</b> be a valid {@code VkDeferredOperationKHR} object</li>
            <li>Any previous deferred operation that was associated with {@code deferredOperation} <b>must</b> be complete</li>
            <li>{@code pInfo→src.hostAddress} <b>must</b> be a valid host pointer</li>
            <li>{@code pInfo→src.hostAddress} <b>must</b> be aligned to 16 bytes</li>
            <li>The {@code buffer} used to create {@code pInfo→dst} <b>must</b> be bound to host-visible device memory</li>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-accelerationStructureHostCommands">##VkPhysicalDeviceAccelerationStructureFeaturesKHR{@code ::accelerationStructureHostCommands}</a> feature <b>must</b> be enabled</li>
            <li>The {@code buffer} used to create {@code pInfo→dst} <b>must</b> be bound to memory that was not allocated with multiple instances</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code deferredOperation} is not #NULL_HANDLE, {@code deferredOperation} <b>must</b> be a valid {@code VkDeferredOperationKHR} handle</li>
            <li>{@code pInfo} <b>must</b> be a valid pointer to a valid ##VkCopyMemoryToAccelerationStructureInfoKHR structure</li>
            <li>If {@code deferredOperation} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#OPERATION_DEFERRED_KHR</li>
                <li>#OPERATION_NOT_DEFERRED_KHR</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkCopyMemoryToAccelerationStructureInfoKHR
        """,

        VkDevice("device", "the device which owns {@code pInfo→dst}."),
        VkDeferredOperationKHR("deferredOperation", "an optional {@code VkDeferredOperationKHR} to <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\\#deferred-host-operations-requesting\">request deferral</a> for this command."),
        VkCopyMemoryToAccelerationStructureInfoKHR.const.p("pInfo", "a pointer to a ##VkCopyMemoryToAccelerationStructureInfoKHR structure defining the copy operation.")
    )

    VkResult(
        "WriteAccelerationStructuresPropertiesKHR",
        """
        Query acceleration structure meta-data on the host.

        <h5>C Specification</h5>
        To query acceleration structure size parameters on the host, call:

        <pre><code>
￿VkResult vkWriteAccelerationStructuresPropertiesKHR(
￿    VkDevice                                    device,
￿    uint32_t                                    accelerationStructureCount,
￿    const VkAccelerationStructureKHR*           pAccelerationStructures,
￿    VkQueryType                                 queryType,
￿    size_t                                      dataSize,
￿    void*                                       pData,
￿    size_t                                      stride);</code></pre>

        <h5>Description</h5>
        This command fulfills the same task as #CmdWriteAccelerationStructuresPropertiesKHR() but is executed by the host.

        <h5>Valid Usage</h5>
        <ul>
            <li>All acceleration structures in {@code pAccelerationStructures} <b>must</b> have been built prior to the execution of this command</li>
            <li>All acceleration structures in {@code pAccelerationStructures} <b>must</b> have been built with #BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_KHR if {@code queryType} is #QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_KHR</li>
            <li>{@code queryType} <b>must</b> be #QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_KHR or #QUERY_TYPE_ACCELERATION_STRUCTURE_SERIALIZATION_SIZE_KHR</li>
            <li>If {@code queryType} is #QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_KHR, then {@code stride} <b>must</b> be a multiple of the size of {@code VkDeviceSize}</li>
            <li>If {@code queryType} is #QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_KHR, then {@code data} <b>must</b> point to a {@code VkDeviceSize}</li>
            <li>If {@code queryType} is #QUERY_TYPE_ACCELERATION_STRUCTURE_SERIALIZATION_SIZE_KHR, then {@code stride} <b>must</b> be a multiple of the size of {@code VkDeviceSize}</li>
            <li>If {@code queryType} is #QUERY_TYPE_ACCELERATION_STRUCTURE_SERIALIZATION_SIZE_KHR, then {@code data} <b>must</b> point to a {@code VkDeviceSize}</li>
            <li>{@code dataSize} <b>must</b> be greater than or equal to <code>accelerationStructureCount*stride</code></li>
            <li>The {@code buffer} used to create each acceleration structure in {@code pAccelerationStructures} <b>must</b> be bound to host-visible device memory</li>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-accelerationStructureHostCommands">##VkPhysicalDeviceAccelerationStructureFeaturesKHR{@code ::accelerationStructureHostCommands}</a> feature <b>must</b> be enabled</li>
            <li>The {@code buffer} used to create each acceleration structure in {@code pAccelerationStructures} <b>must</b> be bound to memory that was not allocated with multiple instances</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pAccelerationStructures} <b>must</b> be a valid pointer to an array of {@code accelerationStructureCount} valid {@code VkAccelerationStructureKHR} handles</li>
            <li>{@code queryType} <b>must</b> be a valid {@code VkQueryType} value</li>
            <li>{@code pData} <b>must</b> be a valid pointer to an array of {@code dataSize} bytes</li>
            <li>{@code accelerationStructureCount} <b>must</b> be greater than 0</li>
            <li>{@code dataSize} <b>must</b> be greater than 0</li>
            <li>Each element of {@code pAccelerationStructures} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>
        """,

        VkDevice("device", "the device which owns the acceleration structures in {@code pAccelerationStructures}."),
        AutoSize("pAccelerationStructures")..uint32_t("accelerationStructureCount", "the count of acceleration structures for which to query the property."),
        VkAccelerationStructureKHR.const.p("pAccelerationStructures", "a pointer to an array of existing previously built acceleration structures."),
        VkQueryType("queryType", "a {@code VkQueryType} value specifying the property to be queried."),
        AutoSize("pData")..size_t("dataSize", "the size in bytes of the buffer pointed to by {@code pData}."),
        void.p("pData", "a pointer to a user-allocated buffer where the results will be written."),
        size_t("stride", "the stride in bytes between results for individual queries within {@code pData}.")
    )

    void(
        "CmdCopyAccelerationStructureKHR",
        """
        Copy an acceleration structure.

        <h5>C Specification</h5>
        To copy an acceleration structure call:

        <pre><code>
￿void vkCmdCopyAccelerationStructureKHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkCopyAccelerationStructureInfoKHR*   pInfo);</code></pre>

        <h5>Description</h5>
        This command copies the {@code pInfo→src} acceleration structure to the {@code pInfo→dst} acceleration structure in the manner specified by {@code pInfo→mode}.

        Accesses to {@code pInfo→src} and {@code pInfo→dst} <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-dependencies">synchronized</a> with the #PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_KHR <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-pipeline-stages">pipeline stage</a> and an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-access-types">access type</a> of #ACCESS_ACCELERATION_STRUCTURE_READ_BIT_KHR or #ACCESS_ACCELERATION_STRUCTURE_WRITE_BIT_KHR as appropriate.

        <h5>Valid Usage</h5>
        <ul>
            <li>The {@code buffer} used to create {@code pInfo→src} <b>must</b> be bound to device memory</li>
            <li>The {@code buffer} used to create {@code pInfo→dst} <b>must</b> be bound to device memory</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pInfo} <b>must</b> be a valid pointer to a valid ##VkCopyAccelerationStructureInfoKHR structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Compute</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkCopyAccelerationStructureInfoKHR
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkCopyAccelerationStructureInfoKHR.const.p("pInfo", "a pointer to a ##VkCopyAccelerationStructureInfoKHR structure defining the copy operation.")
    )

    void(
        "CmdCopyAccelerationStructureToMemoryKHR",
        """
        Copy an acceleration structure to device memory.

        <h5>C Specification</h5>
        To copy an acceleration structure to device memory call:

        <pre><code>
￿void vkCmdCopyAccelerationStructureToMemoryKHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkCopyAccelerationStructureToMemoryInfoKHR* pInfo);</code></pre>

        <h5>Description</h5>
        Accesses to {@code pInfo→src} <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-dependencies">synchronized</a> with the #PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_KHR <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-pipeline-stages">pipeline stage</a> and an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-access-types">access type</a> of #ACCESS_ACCELERATION_STRUCTURE_READ_BIT_KHR. Accesses to the buffer indicated by {@code pInfo→dst.deviceAddress} <b>must</b> be synchronized with the #PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_KHR pipeline stage and an access type of #ACCESS_TRANSFER_WRITE_BIT.

        This command produces the same results as #CopyAccelerationStructureToMemoryKHR(), but writes its result to a device address, and is executed on the device rather than the host. The output <b>may</b> not necessarily be bit-for-bit identical, but it can be equally used by either #CmdCopyMemoryToAccelerationStructureKHR() or #CopyMemoryToAccelerationStructureKHR().

        The defined header structure for the serialized data consists of:

        <ul>
            <li>#UUID_SIZE bytes of data matching ##VkPhysicalDeviceIDProperties{@code ::driverUUID}</li>
            <li>#UUID_SIZE bytes of data identifying the compatibility for comparison using #GetDeviceAccelerationStructureCompatibilityKHR()</li>
            <li>A 64-bit integer of the total size matching the value queried using #QUERY_TYPE_ACCELERATION_STRUCTURE_SERIALIZATION_SIZE_KHR</li>
            <li>A 64-bit integer of the deserialized size to be passed in to ##VkAccelerationStructureCreateInfoKHR{@code ::size}</li>
            <li>A 64-bit integer of the count of the number of acceleration structure handles following. This will be zero for a bottom-level acceleration structure. For top-level acceleration structures this number is implementation-dependent; the number of and ordering of the handles may not match the instance descriptions which were used to build the acceleration structure.</li>
        </ul>

        The corresponding handles matching the values returned by #GetAccelerationStructureDeviceAddressKHR() or #GetAccelerationStructureHandleNV() are tightly packed in the buffer following the count. The application is expected to store a mapping between those handles and the original application-generated bottom-level acceleration structures to provide when deserializing. The serialized data is written to the buffer (or read from the buffer) according to the host endianness.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code pInfo→dst.deviceAddress} <b>must</b> be a valid device address for a buffer bound to device memory</li>
            <li>{@code pInfo→dst.deviceAddress} <b>must</b> be aligned to 256 bytes</li>
            <li>If the buffer pointed to by {@code pInfo→dst.deviceAddress} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>The {@code buffer} used to create {@code pInfo→src} <b>must</b> be bound to device memory</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pInfo} <b>must</b> be a valid pointer to a valid ##VkCopyAccelerationStructureToMemoryInfoKHR structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Compute</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkCopyAccelerationStructureToMemoryInfoKHR
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkCopyAccelerationStructureToMemoryInfoKHR.const.p("pInfo", "an a pointer to a ##VkCopyAccelerationStructureToMemoryInfoKHR structure defining the copy operation.")
    )

    void(
        "CmdCopyMemoryToAccelerationStructureKHR",
        """
        Copy device memory to an acceleration structure.

        <h5>C Specification</h5>
        To copy device memory to an acceleration structure call:

        <pre><code>
￿void vkCmdCopyMemoryToAccelerationStructureKHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkCopyMemoryToAccelerationStructureInfoKHR* pInfo);</code></pre>

        <h5>Description</h5>
        Accesses to {@code pInfo→dst} <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-dependencies">synchronized</a> with the #PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_KHR <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-pipeline-stages">pipeline stage</a> and an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-access-types">access type</a> of #ACCESS_ACCELERATION_STRUCTURE_WRITE_BIT_KHR. Accesses to the buffer indicated by {@code pInfo→src.deviceAddress} <b>must</b> be synchronized with the #PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_KHR pipeline stage and an access type of #ACCESS_TRANSFER_READ_BIT.

        This command can accept acceleration structures produced by either #CmdCopyAccelerationStructureToMemoryKHR() or #CopyAccelerationStructureToMemoryKHR().

        The structure provided as input to deserialize is as described in #CmdCopyAccelerationStructureToMemoryKHR(), with any acceleration structure handles filled in with the newly-queried handles to bottom level acceleration structures created before deserialization. These do not need to be built at deserialize time, but <b>must</b> be created.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code pInfo→src.deviceAddress} <b>must</b> be a valid device address for a buffer bound to device memory</li>
            <li>{@code pInfo→src.deviceAddress} <b>must</b> be aligned to 256 bytes</li>
            <li>If the buffer pointed to by {@code pInfo→src.deviceAddress} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>The {@code buffer} used to create {@code pInfo→dst} <b>must</b> be bound to device memory</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pInfo} <b>must</b> be a valid pointer to a valid ##VkCopyMemoryToAccelerationStructureInfoKHR structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Compute</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkCopyMemoryToAccelerationStructureInfoKHR
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkCopyMemoryToAccelerationStructureInfoKHR.const.p("pInfo", "a pointer to a ##VkCopyMemoryToAccelerationStructureInfoKHR structure defining the copy operation.")
    )

    VkDeviceAddress(
        "GetAccelerationStructureDeviceAddressKHR",
        """
        Query an address of a acceleration structure.

        <h5>C Specification</h5>
        To query the 64-bit device address for an acceleration structure, call:

        <pre><code>
￿VkDeviceAddress vkGetAccelerationStructureDeviceAddressKHR(
￿    VkDevice                                    device,
￿    const VkAccelerationStructureDeviceAddressInfoKHR* pInfo);</code></pre>

        <h5>Description</h5>
        The 64-bit return value is an address of the acceleration structure, which can be used for device and shader operations that involve acceleration structures, such as ray traversal and acceleration structure building.

        If the acceleration structure was created with a non-zero value of ##VkAccelerationStructureCreateInfoKHR{@code ::deviceAddress}, the return value will be the same address.

        If the acceleration structure was created with a {@code type} of #ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR, the returned address <b>must</b> be consistent with the relative offset to other acceleration structures with {@code type} #ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR allocated with the same {@code VkBuffer}. That is, the difference in returned addresses between the two <b>must</b> be the same as the difference in offsets provided at acceleration structure creation.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The acceleration structure device address <b>may</b> be different from the buffer device address corresponding to the acceleration structure’s start offset in its storage buffer for acceleration structure types other than #ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR.
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code device} was created with multiple physical devices, then the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-bufferDeviceAddressMultiDevice">bufferDeviceAddressMultiDevice</a> feature <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pInfo} <b>must</b> be a valid pointer to a valid ##VkAccelerationStructureDeviceAddressInfoKHR structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkAccelerationStructureDeviceAddressInfoKHR
        """,

        VkDevice("device", "the logical device that the acceleration structure was created on."),
        VkAccelerationStructureDeviceAddressInfoKHR.const.p("pInfo", "a pointer to a ##VkAccelerationStructureDeviceAddressInfoKHR structure specifying the acceleration structure to retrieve an address for.")
    )

    void(
        "CmdWriteAccelerationStructuresPropertiesKHR",
        """
        Write acceleration structure result parameters to query results.

        <h5>C Specification</h5>
        To query acceleration structure size parameters call:

        <pre><code>
￿void vkCmdWriteAccelerationStructuresPropertiesKHR(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    accelerationStructureCount,
￿    const VkAccelerationStructureKHR*           pAccelerationStructures,
￿    VkQueryType                                 queryType,
￿    VkQueryPool                                 queryPool,
￿    uint32_t                                    firstQuery);</code></pre>

        <h5>Description</h5>
        Accesses to any of the acceleration structures listed in {@code pAccelerationStructures} <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-dependencies">synchronized</a> with the #PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_KHR <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-pipeline-stages">pipeline stage</a> and an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-access-types">access type</a> of #ACCESS_ACCELERATION_STRUCTURE_READ_BIT_KHR.

        <ul>
            <li>If {@code queryType} is #QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_KHR, then the value written out is the number of bytes required by a compacted acceleration structure.</li>
            <li>If {@code queryType} is #QUERY_TYPE_ACCELERATION_STRUCTURE_SERIALIZATION_SIZE_KHR, then the value written out is the number of bytes required by a serialized acceleration structure.</li>
        </ul>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code queryPool} <b>must</b> have been created with a {@code queryType} matching {@code queryType}</li>
            <li>The queries identified by {@code queryPool} and {@code firstQuery} <b>must</b> be <em>unavailable</em></li>
            <li>The {@code buffer} used to create each acceleration structure in {@code pAccelerationStructures} <b>must</b> be bound to device memory</li>
            <li>The sum of {@code query} plus {@code accelerationStructureCount} <b>must</b> be less than or equal to the number of queries in {@code queryPool}</li>
        </ul>

        <ul>
            <li>All acceleration structures in {@code pAccelerationStructures} <b>must</b> have been built prior to the execution of this command</li>
            <li>All acceleration structures in {@code pAccelerationStructures} <b>must</b> have been built with #BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_KHR if {@code queryType} is #QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_KHR</li>
            <li>{@code queryType} <b>must</b> be #QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_KHR or #QUERY_TYPE_ACCELERATION_STRUCTURE_SERIALIZATION_SIZE_KHR</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pAccelerationStructures} <b>must</b> be a valid pointer to an array of {@code accelerationStructureCount} valid {@code VkAccelerationStructureKHR} handles</li>
            <li>{@code queryType} <b>must</b> be a valid {@code VkQueryType} value</li>
            <li>{@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>{@code accelerationStructureCount} <b>must</b> be greater than 0</li>
            <li>Each of {@code commandBuffer}, {@code queryPool}, and the elements of {@code pAccelerationStructures} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Compute</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        AutoSize("pAccelerationStructures")..uint32_t("accelerationStructureCount", "the count of acceleration structures for which to query the property."),
        VkAccelerationStructureKHR.const.p("pAccelerationStructures", "a pointer to an array of existing previously built acceleration structures."),
        VkQueryType("queryType", "a {@code VkQueryType} value specifying the type of queries managed by the pool."),
        VkQueryPool("queryPool", "the query pool that will manage the results of the query."),
        uint32_t("firstQuery", "the first query index within the query pool that will contain the {@code accelerationStructureCount} number of results.")
    )

    void(
        "GetDeviceAccelerationStructureCompatibilityKHR",
        """
        Check if a serialized acceleration structure is compatible with the current device.

        <h5>C Specification</h5>
        To check if a serialized acceleration structure is compatible with the current device call:

        <pre><code>
￿void vkGetDeviceAccelerationStructureCompatibilityKHR(
￿    VkDevice                                    device,
￿    const VkAccelerationStructureVersionInfoKHR* pVersionInfo,
￿    VkAccelerationStructureCompatibilityKHR*    pCompatibility);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-rayTracingPipeline">{@code rayTracingPipeline}</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-rayQuery">{@code rayQuery}</a> feature <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pVersionInfo} <b>must</b> be a valid pointer to a valid ##VkAccelerationStructureVersionInfoKHR structure</li>
            <li>{@code pCompatibility} <b>must</b> be a valid pointer to a {@code VkAccelerationStructureCompatibilityKHR} value</li>
        </ul>

        <h5>See Also</h5>
        ##VkAccelerationStructureVersionInfoKHR
        """,

        VkDevice("device", "the device to check the version against."),
        VkAccelerationStructureVersionInfoKHR.const.p("pVersionInfo", "a pointer to a ##VkAccelerationStructureVersionInfoKHR structure specifying version information to check against the device."),
        Check(1)..VkAccelerationStructureCompatibilityKHR.p("pCompatibility", "a pointer to a {@code VkAccelerationStructureCompatibilityKHR} value in which compatibility information is returned.")
    )

    void(
        "GetAccelerationStructureBuildSizesKHR",
        """
        Retrieve the required size for an acceleration structure.

        <h5>C Specification</h5>
        To get the build sizes for an acceleration structure, call:

        <pre><code>
￿void vkGetAccelerationStructureBuildSizesKHR(
￿    VkDevice                                    device,
￿    VkAccelerationStructureBuildTypeKHR         buildType,
￿    const VkAccelerationStructureBuildGeometryInfoKHR* pBuildInfo,
￿    const uint32_t*                             pMaxPrimitiveCounts,
￿    VkAccelerationStructureBuildSizesInfoKHR*   pSizeInfo);</code></pre>

        <h5>Description</h5>
        The {@code srcAccelerationStructure}, {@code dstAccelerationStructure}, and {@code mode} members of {@code pBuildInfo} are ignored. Any ##VkDeviceOrHostAddressKHR members of {@code pBuildInfo} are ignored by this command, except that the {@code hostAddress} member of ##VkAccelerationStructureGeometryTrianglesDataKHR{@code ::transformData} will be examined to check if it is {@code NULL}.

        An acceleration structure created with the {@code accelerationStructureSize} returned by this command supports any build or update with a ##VkAccelerationStructureBuildGeometryInfoKHR structure and array of ##VkAccelerationStructureBuildRangeInfoKHR structures subject to the following properties:

        <ul>
            <li>The build command is a host build command, and {@code buildType} is #ACCELERATION_STRUCTURE_BUILD_TYPE_HOST_KHR or #ACCELERATION_STRUCTURE_BUILD_TYPE_HOST_OR_DEVICE_KHR</li>
            <li>The build command is a device build command, and {@code buildType} is #ACCELERATION_STRUCTURE_BUILD_TYPE_DEVICE_KHR or #ACCELERATION_STRUCTURE_BUILD_TYPE_HOST_OR_DEVICE_KHR</li>
            <li>
                For ##VkAccelerationStructureBuildGeometryInfoKHR:
                <ul>
                    <li>Its {@code type}, and {@code flags} members are equal to {@code pBuildInfo→type} and {@code pBuildInfo→flags}, respectively.</li>
                    <li>{@code geometryCount} is less than or equal to {@code pBuildInfo→geometryCount}.</li>
                    <li>For each element of either {@code pGeometries} or {@code ppGeometries} at a given index, its {@code geometryType} member is equal to {@code pBuildInfo→geometryType}.</li>
                    <li>For each element of either {@code pGeometries} or {@code ppGeometries} at a given index, with a {@code geometryType} member equal to #GEOMETRY_TYPE_TRIANGLES_KHR, the {@code vertexFormat} and {@code indexType} members of {@code geometry.triangles} are equal to the corresponding members of the same element in {@code pBuildInfo}.</li>
                    <li>For each element of either {@code pGeometries} or {@code ppGeometries} at a given index, with a {@code geometryType} member equal to #GEOMETRY_TYPE_TRIANGLES_KHR, the {@code maxVertex} member of {@code geometry.triangles} is less than or equal to the corresponding member of the same element in {@code pBuildInfo}.</li>
                    <li>For each element of either {@code pGeometries} or {@code ppGeometries} at a given index, with a {@code geometryType} member equal to #GEOMETRY_TYPE_TRIANGLES_KHR, if the applicable address in the {@code transformData} member of {@code geometry.triangles} is not {@code NULL}, the corresponding {@code transformData.hostAddress} parameter in {@code pBuildInfo} is not {@code NULL}.</li>
                </ul>
            </li>
            <li>
                For each ##VkAccelerationStructureBuildRangeInfoKHR corresponding to the ##VkAccelerationStructureBuildGeometryInfoKHR:
                <ul>
                    <li>Its {@code primitiveCount} member is less than or equal to the corresponding element of {@code pMaxPrimitiveCounts}.</li>
                </ul>
            </li>
        </ul>

        Similarly, the {@code updateScratchSize} value will support any build command specifying the #BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR {@code mode} under the above conditions, and the {@code buildScratchSize} value will support any build command specifying the #BUILD_ACCELERATION_STRUCTURE_MODE_BUILD_KHR {@code mode} under the above conditions.

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-rayTracingPipeline">{@code rayTracingPipeline}</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-rayQuery">{@code rayQuery}</a> feature <b>must</b> be enabled</li>
            <li>If {@code device} was created with multiple physical devices, then the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-bufferDeviceAddressMultiDevice">bufferDeviceAddressMultiDevice</a> feature <b>must</b> be enabled</li>
            <li>If {@code pBuildInfo→geometryCount} is not 0, {@code pMaxPrimitiveCounts} <b>must</b> be a valid pointer to an array of {@code pBuildInfo→geometryCount} {@code uint32_t} values</li>
            <li>If {@code pBuildInfo→pGeometries} or {@code pBuildInfo→ppGeometries} has a {@code geometryType} of #GEOMETRY_TYPE_INSTANCES_KHR, each {@code pMaxPrimitiveCounts}[i] <b>must</b> be less than or equal to ##VkPhysicalDeviceAccelerationStructurePropertiesKHR{@code ::maxInstanceCount}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code buildType} <b>must</b> be a valid {@code VkAccelerationStructureBuildTypeKHR} value</li>
            <li>{@code pBuildInfo} <b>must</b> be a valid pointer to a valid ##VkAccelerationStructureBuildGeometryInfoKHR structure</li>
            <li>If {@code pMaxPrimitiveCounts} is not {@code NULL}, {@code pMaxPrimitiveCounts} <b>must</b> be a valid pointer to an array of {@code pBuildInfo→geometryCount} {@code uint32_t} values</li>
            <li>{@code pSizeInfo} <b>must</b> be a valid pointer to a ##VkAccelerationStructureBuildSizesInfoKHR structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkAccelerationStructureBuildGeometryInfoKHR, ##VkAccelerationStructureBuildSizesInfoKHR
        """,

        VkDevice("device", "the logical device that will be used for creating the acceleration structure."),
        VkAccelerationStructureBuildTypeKHR("buildType", "defines whether host or device operations (or both) are being queried for."),
        VkAccelerationStructureBuildGeometryInfoKHR.const.p("pBuildInfo", "a pointer to a ##VkAccelerationStructureBuildGeometryInfoKHR structure describing parameters of a build operation."),
        Check("pBuildInfo.geometryCount()")..nullable..uint32_t.const.p("pMaxPrimitiveCounts", "a pointer to an array of {@code pBuildInfo→geometryCount} {@code uint32_t} values defining the number of primitives built into each geometry."),
        VkAccelerationStructureBuildSizesInfoKHR.p("pSizeInfo", "a pointer to a ##VkAccelerationStructureBuildSizesInfoKHR structure which returns the size required for an acceleration structure and the sizes required for the scratch buffers, given the build parameters.")
    )
}