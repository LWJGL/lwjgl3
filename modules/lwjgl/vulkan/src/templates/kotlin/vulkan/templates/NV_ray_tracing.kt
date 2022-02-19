/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_ray_tracing = "NVRayTracing".nativeClassVK("NV_ray_tracing", type = "device", postfix = "NV") {
    documentation =
        """
        Rasterization has been the dominant method to produce interactive graphics, but increasing performance of graphics hardware has made ray tracing a viable option for interactive rendering. Being able to integrate ray tracing with traditional rasterization makes it easier for applications to incrementally add ray traced effects to existing applications or to do hybrid approaches with rasterization for primary visibility and ray tracing for secondary queries.

        To enable ray tracing, this extension adds a few different categories of new functionality:

        <ul>
            <li>Acceleration structure objects and build commands</li>
            <li>A new pipeline type with new shader domains</li>
            <li>An indirection table to link shader groups with acceleration structure items</li>
        </ul>

        This extension adds support for the following SPIR-V extension in Vulkan:

        <ul>
            <li>{@code SPV_NV_ray_tracing}</li>
        </ul>

        <h5>Sample Code</h5>
        Example ray generation GLSL shader

        <pre><code>
￿\#version 450 core
￿\#extension GL_NV_ray_tracing : require
￿layout(set = 0, binding = 0, rgba8) uniform image2D image;
￿layout(set = 0, binding = 1) uniform accelerationStructureNV as;
￿layout(location = 0) rayPayloadNV float payload;
￿
￿void main()
￿{
￿   vec4 col = vec4(0, 0, 0, 1);
￿
￿   vec3 origin = vec3(float(gl_LaunchIDNV.x)/float(gl_LaunchSizeNV.x), float(gl_LaunchIDNV.y)/float(gl_LaunchSizeNV.y), 1.0);
￿   vec3 dir = vec3(0.0, 0.0, -1.0);
￿
￿   traceNV(as, 0, 0xff, 0, 1, 0, origin, 0.0, dir, 1000.0, 0);
￿
￿   col.y = payload;
￿
￿   imageStore(image, ivec2(gl_LaunchIDNV.xy), col);
￿}</code></pre>

        <h5>VK_NV_ray_tracing</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_NV_ray_tracing}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>166</dd>

            <dt><b>Revision</b></dt>
            <dd>3</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
                <li>Requires {@link KHRGetMemoryRequirements2 VK_KHR_get_memory_requirements2}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Eric Werness <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_ray_tracing]%20@ewerness-nv%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_ray_tracing%20extension%3E%3E">ewerness-nv</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2018-11-20</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>This extension requires <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/NV/SPV_NV_ray_tracing.html">{@code SPV_NV_ray_tracing}</a></li>
                <li>This extension provides API support for <a target="_blank" href="https://github.com/KhronosGroup/GLSL/blob/master/extensions/nv/GLSL_NV_ray_tracing.txt">{@code GL_NV_ray_tracing}</a></li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Eric Werness, NVIDIA</li>
                <li>Ashwin Lele, NVIDIA</li>
                <li>Robert Stepinski, NVIDIA</li>
                <li>Nuno Subtil, NVIDIA</li>
                <li>Christoph Kubisch, NVIDIA</li>
                <li>Martin Stich, NVIDIA</li>
                <li>Daniel Koch, NVIDIA</li>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Joshua Barczak, Intel</li>
                <li>Tobias Hector, AMD</li>
                <li>Henrik Rydgard, NVIDIA</li>
                <li>Pascal Gautron, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "NV_RAY_TRACING_SPEC_VERSION".."3"
    )

    StringConstant(
        "The extension name.",

        "NV_RAY_TRACING_EXTENSION_NAME".."VK_NV_ray_tracing"
    )

    EnumConstant(
        "VK_SHADER_UNUSED_NV",

        "SHADER_UNUSED_NV".."(~0)"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_NV".."1000165000",
        "STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_NV".."1000165001",
        "STRUCTURE_TYPE_GEOMETRY_NV".."1000165003",
        "STRUCTURE_TYPE_GEOMETRY_TRIANGLES_NV".."1000165004",
        "STRUCTURE_TYPE_GEOMETRY_AABB_NV".."1000165005",
        "STRUCTURE_TYPE_BIND_ACCELERATION_STRUCTURE_MEMORY_INFO_NV".."1000165006",
        "STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_ACCELERATION_STRUCTURE_NV".."1000165007",
        "STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_INFO_NV".."1000165008",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PROPERTIES_NV".."1000165009",
        "STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_NV".."1000165011",
        "STRUCTURE_TYPE_ACCELERATION_STRUCTURE_INFO_NV".."1000165012"
    )

    EnumConstant(
        "Extends {@code VkShaderStageFlagBits}.",

        "SHADER_STAGE_RAYGEN_BIT_NV".enum(0x00000100),
        "SHADER_STAGE_ANY_HIT_BIT_NV".enum(0x00000200),
        "SHADER_STAGE_CLOSEST_HIT_BIT_NV".enum(0x00000400),
        "SHADER_STAGE_MISS_BIT_NV".enum(0x00000800),
        "SHADER_STAGE_INTERSECTION_BIT_NV".enum(0x00001000),
        "SHADER_STAGE_CALLABLE_BIT_NV".enum(0x00002000)
    )

    EnumConstant(
        "Extends {@code VkPipelineStageFlagBits}.",

        "PIPELINE_STAGE_RAY_TRACING_SHADER_BIT_NV".enum(0x00200000),
        "PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_NV".enum(0x02000000)
    )

    EnumConstant(
        "Extends {@code VkBufferUsageFlagBits}.",

        "BUFFER_USAGE_RAY_TRACING_BIT_NV".enum(0x00000400)
    )

    EnumConstant(
        "Extends {@code VkPipelineBindPoint}.",

        "PIPELINE_BIND_POINT_RAY_TRACING_NV".."1000165000"
    )

    EnumConstant(
        "Extends {@code VkDescriptorType}.",

        "DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_NV".."1000165000"
    )

    EnumConstant(
        "Extends {@code VkAccessFlagBits}.",

        "ACCESS_ACCELERATION_STRUCTURE_READ_BIT_NV".enum(0x00200000),
        "ACCESS_ACCELERATION_STRUCTURE_WRITE_BIT_NV".enum(0x00400000)
    )

    EnumConstant(
        "Extends {@code VkQueryType}.",

        "QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_NV".."1000165000"
    )

    EnumConstant(
        "Extends {@code VkPipelineCreateFlagBits}.",

        "PIPELINE_CREATE_DEFER_COMPILE_BIT_NV".enum(0x00000020)
    )

    EnumConstant(
        "Extends {@code VkObjectType}.",

        "OBJECT_TYPE_ACCELERATION_STRUCTURE_NV".."1000165000"
    )

    EnumConstant(
        "Extends {@code VkDebugReportObjectTypeEXT}.",

        "DEBUG_REPORT_OBJECT_TYPE_ACCELERATION_STRUCTURE_NV_EXT".."1000165000"
    )

    EnumConstant(
        "Extends {@code VkIndexType}.",

        "INDEX_TYPE_NONE_NV".."1000165000"
    )

    EnumConstant(
        "Extends {@code VkRayTracingShaderGroupTypeKHR}.",

        "RAY_TRACING_SHADER_GROUP_TYPE_GENERAL_NV".."0",
        "RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_NV".."1",
        "RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_NV".."2"
    )

    EnumConstant(
        "Extends {@code VkGeometryTypeKHR}.",

        "GEOMETRY_TYPE_TRIANGLES_NV".."0",
        "GEOMETRY_TYPE_AABBS_NV".."1"
    )

    EnumConstant(
        "Extends {@code VkAccelerationStructureTypeKHR}.",

        "ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_NV".."0",
        "ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_NV".."1"
    )

    EnumConstant(
        "Extends {@code VkGeometryFlagBitsKHR}.",

        "GEOMETRY_OPAQUE_BIT_NV".enum(0x00000001),
        "GEOMETRY_NO_DUPLICATE_ANY_HIT_INVOCATION_BIT_NV".enum(0x00000002)
    )

    EnumConstant(
        "Extends {@code VkGeometryInstanceFlagBitsKHR}.",

        "GEOMETRY_INSTANCE_TRIANGLE_CULL_DISABLE_BIT_NV".enum(0x00000001),
        "GEOMETRY_INSTANCE_TRIANGLE_FRONT_COUNTERCLOCKWISE_BIT_NV".enum(0x00000002),
        "GEOMETRY_INSTANCE_FORCE_OPAQUE_BIT_NV".enum(0x00000004),
        "GEOMETRY_INSTANCE_FORCE_NO_OPAQUE_BIT_NV".enum(0x00000008)
    )

    EnumConstant(
        "Extends {@code VkBuildAccelerationStructureFlagBitsKHR}.",

        "BUILD_ACCELERATION_STRUCTURE_ALLOW_UPDATE_BIT_NV".enum(0x00000001),
        "BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_NV".enum(0x00000002),
        "BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_TRACE_BIT_NV".enum(0x00000004),
        "BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_BUILD_BIT_NV".enum(0x00000008),
        "BUILD_ACCELERATION_STRUCTURE_LOW_MEMORY_BIT_NV".enum(0x00000010)
    )

    EnumConstant(
        "Extends {@code VkCopyAccelerationStructureModeKHR}.",

        "COPY_ACCELERATION_STRUCTURE_MODE_CLONE_NV".."0",
        "COPY_ACCELERATION_STRUCTURE_MODE_COMPACT_NV".."1"
    )

    EnumConstant(
        """
        VkAccelerationStructureMemoryRequirementsTypeNV - Acceleration structure memory requirement type

        <h5>Description</h5>
        <ul>
            <li>#ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_OBJECT_NV requests the memory requirement for the {@code VkAccelerationStructureNV} backing store.</li>
            <li>#ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_BUILD_SCRATCH_NV requests the memory requirement for scratch space during the initial build.</li>
            <li>#ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_UPDATE_SCRATCH_NV requests the memory requirement for scratch space during an update.</li>
        </ul>

        <h5>See Also</h5>
        ##VkAccelerationStructureMemoryRequirementsInfoNV
        """,

        "ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_OBJECT_NV".."0",
        "ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_BUILD_SCRATCH_NV".."1",
        "ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_UPDATE_SCRATCH_NV".."2"
    )

    VkResult(
        "CreateAccelerationStructureNV",
        """
        Create a new acceleration structure object.

        <h5>C Specification</h5>
        To create acceleration structures, call:

        <pre><code>
￿VkResult vkCreateAccelerationStructureNV(
￿    VkDevice                                    device,
￿    const VkAccelerationStructureCreateInfoNV*  pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkAccelerationStructureNV*                  pAccelerationStructure);</code></pre>

        <h5>Description</h5>
        Similarly to other objects in Vulkan, the acceleration structure creation merely creates an object with a specific “{@code shape}” as specified by the information in ##VkAccelerationStructureInfoNV and {@code compactedSize} in {@code pCreateInfo}. Populating the data in the object after allocating and binding memory is done with #CmdBuildAccelerationStructureNV() and #CmdCopyAccelerationStructureNV().

        Acceleration structure creation uses the count and type information from the geometries, but does not use the data references in the structures.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkAccelerationStructureCreateInfoNV structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pAccelerationStructure} <b>must</b> be a valid pointer to a {@code VkAccelerationStructureNV} handle</li>
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
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAccelerationStructureCreateInfoNV, ##VkAllocationCallbacks
        """,

        VkDevice("device", "the logical device that creates the buffer object."),
        VkAccelerationStructureCreateInfoNV.const.p("pCreateInfo", "a pointer to a ##VkAccelerationStructureCreateInfoNV structure containing parameters affecting creation of the acceleration structure."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkAccelerationStructureNV.p("pAccelerationStructure", "a pointer to a {@code VkAccelerationStructureNV} handle in which the resulting acceleration structure object is returned.")
    )

    void(
        "DestroyAccelerationStructureNV",
        """
        Destroy an acceleration structure object.

        <h5>C Specification</h5>
        To destroy an acceleration structure, call:

        <pre><code>
￿void vkDestroyAccelerationStructureNV(
￿    VkDevice                                    device,
￿    VkAccelerationStructureNV                   accelerationStructure,
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
            <li>If {@code accelerationStructure} is not #NULL_HANDLE, {@code accelerationStructure} <b>must</b> be a valid {@code VkAccelerationStructureNV} handle</li>
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

        VkDevice("device", "the logical device that destroys the buffer."),
        VkAccelerationStructureNV("accelerationStructure", "the acceleration structure to destroy."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    void(
        "GetAccelerationStructureMemoryRequirementsNV",
        """
        Get acceleration structure memory requirements.

        <h5>C Specification</h5>
        An acceleration structure has memory requirements for the structure object itself, scratch space for the build, and scratch space for the update.

        Scratch space is allocated as a {@code VkBuffer}, so for #ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_BUILD_SCRATCH_NV and #ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_UPDATE_SCRATCH_NV the {@code pMemoryRequirements→alignment} and {@code pMemoryRequirements→memoryTypeBits} values returned by this call <b>must</b> be filled with zero, and <b>should</b> be ignored by the application.

        To query the memory requirements, call:

        <pre><code>
￿void vkGetAccelerationStructureMemoryRequirementsNV(
￿    VkDevice                                    device,
￿    const VkAccelerationStructureMemoryRequirementsInfoNV* pInfo,
￿    VkMemoryRequirements2KHR*                   pMemoryRequirements);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pInfo} <b>must</b> be a valid pointer to a valid ##VkAccelerationStructureMemoryRequirementsInfoNV structure</li>
            <li>{@code pMemoryRequirements} <b>must</b> be a valid pointer to a ##VkMemoryRequirements2KHR structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkAccelerationStructureMemoryRequirementsInfoNV, ##VkMemoryRequirements2KHR
        """,

        VkDevice("device", "the logical device on which the acceleration structure was created."),
        VkAccelerationStructureMemoryRequirementsInfoNV.const.p("pInfo", "a pointer to a ##VkAccelerationStructureMemoryRequirementsInfoNV structure specifying the acceleration structure to get memory requirements for."),
        VkMemoryRequirements2KHR.p("pMemoryRequirements", "a pointer to a ##VkMemoryRequirements2KHR structure in which the requested acceleration structure memory requirements are returned.")
    )

    VkResult(
        "BindAccelerationStructureMemoryNV",
        """
        Bind acceleration structure memory.

        <h5>C Specification</h5>
        To attach memory to one or more acceleration structures at a time, call:

        <pre><code>
￿VkResult vkBindAccelerationStructureMemoryNV(
￿    VkDevice                                    device,
￿    uint32_t                                    bindInfoCount,
￿    const VkBindAccelerationStructureMemoryInfoNV* pBindInfos);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pBindInfos} <b>must</b> be a valid pointer to an array of {@code bindInfoCount} valid ##VkBindAccelerationStructureMemoryInfoNV structures</li>
            <li>{@code bindInfoCount} <b>must</b> be greater than 0</li>
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

        <h5>See Also</h5>
        ##VkBindAccelerationStructureMemoryInfoNV
        """,

        VkDevice("device", "the logical device that owns the acceleration structures and memory."),
        AutoSize("pBindInfos")..uint32_t("bindInfoCount", "the number of elements in {@code pBindInfos}."),
        VkBindAccelerationStructureMemoryInfoNV.const.p("pBindInfos", "a pointer to an array of ##VkBindAccelerationStructureMemoryInfoNV structures describing acceleration structures and memory to bind.")
    )

    void(
        "CmdBuildAccelerationStructureNV",
        """
        Build an acceleration structure.

        <h5>C Specification</h5>
        To build an acceleration structure call:

        <pre><code>
￿void vkCmdBuildAccelerationStructureNV(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkAccelerationStructureInfoNV*        pInfo,
￿    VkBuffer                                    instanceData,
￿    VkDeviceSize                                instanceOffset,
￿    VkBool32                                    update,
￿    VkAccelerationStructureNV                   dst,
￿    VkAccelerationStructureNV                   src,
￿    VkBuffer                                    scratch,
￿    VkDeviceSize                                scratchOffset);</code></pre>

        <h5>Description</h5>
        Accesses to {@code dst}, {@code src}, and {@code scratch} <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-dependencies">synchronized</a> with the #PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_KHR <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-pipeline-stages">pipeline stage</a> and an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-access-types">access type</a> of #ACCESS_ACCELERATION_STRUCTURE_READ_BIT_KHR or #ACCESS_ACCELERATION_STRUCTURE_WRITE_BIT_KHR.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code geometryCount} <b>must</b> be less than or equal to ##VkPhysicalDeviceRayTracingPropertiesNV{@code ::maxGeometryCount}</li>
            <li>{@code dst} <b>must</b> have been created with compatible ##VkAccelerationStructureInfoNV where ##VkAccelerationStructureInfoNV{@code ::type} and ##VkAccelerationStructureInfoNV{@code ::flags} are identical, ##VkAccelerationStructureInfoNV{@code ::instanceCount} and ##VkAccelerationStructureInfoNV{@code ::geometryCount} for {@code dst} are greater than or equal to the build size and each geometry in ##VkAccelerationStructureInfoNV{@code ::pGeometries} for {@code dst} has greater than or equal to the number of vertices, indices, and AABBs</li>
            <li>If {@code update} is #TRUE, {@code src} <b>must</b> not be #NULL_HANDLE</li>
            <li>If {@code update} is #TRUE, {@code src} <b>must</b> have previously been constructed with #BUILD_ACCELERATION_STRUCTURE_ALLOW_UPDATE_BIT_NV set in ##VkAccelerationStructureInfoNV{@code ::flags} in the original build</li>
            <li>If {@code update} is #FALSE, the {@code size} member of the ##VkMemoryRequirements structure returned from a call to #GetAccelerationStructureMemoryRequirementsNV() with ##VkAccelerationStructureMemoryRequirementsInfoNV{@code ::accelerationStructure} set to {@code dst} and ##VkAccelerationStructureMemoryRequirementsInfoNV{@code ::type} set to #ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_BUILD_SCRATCH_NV <b>must</b> be less than or equal to the size of {@code scratch} minus {@code scratchOffset}</li>
            <li>If {@code update} is #TRUE, the {@code size} member of the ##VkMemoryRequirements structure returned from a call to #GetAccelerationStructureMemoryRequirementsNV() with ##VkAccelerationStructureMemoryRequirementsInfoNV{@code ::accelerationStructure} set to {@code dst} and ##VkAccelerationStructureMemoryRequirementsInfoNV{@code ::type} set to #ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_UPDATE_SCRATCH_NV <b>must</b> be less than or equal to the size of {@code scratch} minus {@code scratchOffset}</li>
            <li>{@code scratch} <b>must</b> have been created with #BUFFER_USAGE_RAY_TRACING_BIT_NV usage flag</li>
            <li>If {@code instanceData} is not #NULL_HANDLE, {@code instanceData} <b>must</b> have been created with #BUFFER_USAGE_RAY_TRACING_BIT_NV usage flag</li>
            <li>Each ##VkAccelerationStructureInstanceKHR{@code ::accelerationStructureReference} value in {@code instanceData} <b>must</b> be a valid device address containing a value obtained from #GetAccelerationStructureHandleNV()</li>
            <li>If {@code update} is #TRUE, then objects that were previously active <b>must</b> not be made inactive as per <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#acceleration-structure-inactive-prims">Inactive Primitives and Instances</a></li>
            <li>If {@code update} is #TRUE, then objects that were previously inactive <b>must</b> not be made active as per <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#acceleration-structure-inactive-prims">Inactive Primitives and Instances</a></li>
            <li>If {@code update} is #TRUE, the {@code src} and {@code dst} objects <b>must</b> either be the same object or not have any <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-memory-aliasing">memory aliasing</a></li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pInfo} <b>must</b> be a valid pointer to a valid ##VkAccelerationStructureInfoNV structure</li>
            <li>If {@code instanceData} is not #NULL_HANDLE, {@code instanceData} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code dst} <b>must</b> be a valid {@code VkAccelerationStructureNV} handle</li>
            <li>If {@code src} is not #NULL_HANDLE, {@code src} <b>must</b> be a valid {@code VkAccelerationStructureNV} handle</li>
            <li>{@code scratch} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>Each of {@code commandBuffer}, {@code dst}, {@code instanceData}, {@code scratch}, and {@code src} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
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
        ##VkAccelerationStructureInfoNV
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkAccelerationStructureInfoNV.const.p("pInfo", "contains the shared information for the acceleration structure’s structure."),
        VkBuffer("instanceData", "the buffer containing an array of ##VkAccelerationStructureInstanceKHR structures defining acceleration structures. This parameter <b>must</b> be {@code NULL} for bottom level acceleration structures."),
        VkDeviceSize("instanceOffset", "the offset in bytes (relative to the start of {@code instanceData}) at which the instance data is located."),
        VkBool32("update", "specifies whether to update the {@code dst} acceleration structure with the data in {@code src}."),
        VkAccelerationStructureNV("dst", "a pointer to the target acceleration structure for the build."),
        VkAccelerationStructureNV("src", "a pointer to an existing acceleration structure that is to be used to update the {@code dst} acceleration structure."),
        VkBuffer("scratch", "the {@code VkBuffer} that will be used as scratch memory for the build."),
        VkDeviceSize("scratchOffset", "the offset in bytes relative to the start of {@code scratch} that will be used as a scratch memory.")
    )

    void(
        "CmdCopyAccelerationStructureNV",
        """
        Copy an acceleration structure.

        <h5>C Specification</h5>
        To copy an acceleration structure call:

        <pre><code>
￿void vkCmdCopyAccelerationStructureNV(
￿    VkCommandBuffer                             commandBuffer,
￿    VkAccelerationStructureNV                   dst,
￿    VkAccelerationStructureNV                   src,
￿    VkCopyAccelerationStructureModeKHR          mode);</code></pre>

        <h5>Description</h5>
        Accesses to {@code src} and {@code dst} <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-dependencies">synchronized</a> with the #PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_KHR <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-pipeline-stages">pipeline stage</a> and an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-access-types">access type</a> of #ACCESS_ACCELERATION_STRUCTURE_READ_BIT_KHR or #ACCESS_ACCELERATION_STRUCTURE_WRITE_BIT_KHR as appropriate.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code mode} <b>must</b> be #COPY_ACCELERATION_STRUCTURE_MODE_COMPACT_KHR or #COPY_ACCELERATION_STRUCTURE_MODE_CLONE_KHR</li>
            <li>The source acceleration structure {@code src} <b>must</b> have been constructed prior to the execution of this command</li>
            <li>If {@code mode} is #COPY_ACCELERATION_STRUCTURE_MODE_COMPACT_KHR, {@code src} <b>must</b> have been constructed with #BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_KHR in the build</li>
            <li>The {@code buffer} used to create {@code src} <b>must</b> be bound to device memory</li>
            <li>The {@code buffer} used to create {@code dst} <b>must</b> be bound to device memory</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code dst} <b>must</b> be a valid {@code VkAccelerationStructureNV} handle</li>
            <li>{@code src} <b>must</b> be a valid {@code VkAccelerationStructureNV} handle</li>
            <li>{@code mode} <b>must</b> be a valid {@code VkCopyAccelerationStructureModeKHR} value</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>Each of {@code commandBuffer}, {@code dst}, and {@code src} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
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
        VkAccelerationStructureNV("dst", "the target acceleration structure for the copy."),
        VkAccelerationStructureNV("src", "the source acceleration structure for the copy."),
        VkCopyAccelerationStructureModeKHR("mode", "a {@code VkCopyAccelerationStructureModeKHR} value specifying additional operations to perform during the copy.")
    )

    void(
        "CmdTraceRaysNV",
        """
        Initialize a ray tracing dispatch.

        <h5>C Specification</h5>
        To dispatch ray tracing use:

        <pre><code>
￿void vkCmdTraceRaysNV(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBuffer                                    raygenShaderBindingTableBuffer,
￿    VkDeviceSize                                raygenShaderBindingOffset,
￿    VkBuffer                                    missShaderBindingTableBuffer,
￿    VkDeviceSize                                missShaderBindingOffset,
￿    VkDeviceSize                                missShaderBindingStride,
￿    VkBuffer                                    hitShaderBindingTableBuffer,
￿    VkDeviceSize                                hitShaderBindingOffset,
￿    VkDeviceSize                                hitShaderBindingStride,
￿    VkBuffer                                    callableShaderBindingTableBuffer,
￿    VkDeviceSize                                callableShaderBindingOffset,
￿    VkDeviceSize                                callableShaderBindingStride,
￿    uint32_t                                    width,
￿    uint32_t                                    height,
￿    uint32_t                                    depth);</code></pre>

        <h5>Description</h5>
        When the command is executed, a ray generation group of <code>width × height × depth</code> rays is assembled.

        <h5>Valid Usage</h5>
        <ul>
            <li>If a {@code VkSampler} created with {@code magFilter} or {@code minFilter} equal to #FILTER_LINEAR and {@code compareEnable} equal to #FALSE is used to sample a {@code VkImageView} as a result of this command, then the image view’s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT</li>
            <li>If a {@code VkSampler} created with {@code mipmapMode} equal to #SAMPLER_MIPMAP_MODE_LINEAR and {@code compareEnable} equal to #FALSE is used to sample a {@code VkImageView} as a result of this command, then the image view’s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT</li>
            <li>If a {@code VkImageView} is sampled with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#textures-depth-compare-operation">depth comparison</a>, the image view’s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_2_SAMPLED_IMAGE_DEPTH_COMPARISON_BIT</li>
            <li>If a {@code VkImageView} is accessed using atomic operations as a result of this command, then the image view’s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT</li>
            <li>If a {@code VkImageView} is sampled with #FILTER_CUBIC_EXT as a result of this command, then the image view’s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT</li>
            <li>Any {@code VkImageView} being sampled with #FILTER_CUBIC_EXT as a result of this command <b>must</b> have a {@code VkImageViewType} and format that supports cubic filtering, as specified by ##VkFilterCubicImageViewImageFormatPropertiesEXT{@code ::filterCubic} returned by {@code vkGetPhysicalDeviceImageFormatProperties2}</li>
            <li>Any {@code VkImageView} being sampled with #FILTER_CUBIC_EXT with a reduction mode of either #SAMPLER_REDUCTION_MODE_MIN or #SAMPLER_REDUCTION_MODE_MAX as a result of this command <b>must</b> have a {@code VkImageViewType} and format that supports cubic filtering together with minmax filtering, as specified by ##VkFilterCubicImageViewImageFormatPropertiesEXT{@code ::filterCubicMinmax} returned by {@code vkGetPhysicalDeviceImageFormatProperties2}</li>
            <li>Any {@code VkImage} created with a ##VkImageCreateInfo{@code ::flags} containing #IMAGE_CREATE_CORNER_SAMPLED_BIT_NV sampled as a result of this command <b>must</b> only be sampled using a {@code VkSamplerAddressMode} of #SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE</li>
            <li>Any {@code VkImageView} or {@code VkBufferView} being written as a storage image or storage texel buffer where the image format field of the {@code OpTypeImage} is {@code Unknown} then the view’s format feature <b>must</b> contain #FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT</li>
            <li>Any {@code VkImageView} or {@code VkBufferView} being read as a storage image or storage texel buffer where the image format field of the {@code OpTypeImage} is {@code Unknown} then the view’s format feature <b>must</b> contain #FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT</li>
            <li>For each set <em>n</em> that is statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command, a descriptor set <b>must</b> have been bound to <em>n</em> at the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for set <em>n</em>, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-maintenance4">{@code maintenance4}</a> feature is not enabled, then for each push constant that is statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command, a push constant value <b>must</b> have been set for the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for push constants, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
            <li>Descriptors in each bound descriptor set, specified via {@code vkCmdBindDescriptorSets}, <b>must</b> be valid if they are statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command</li>
            <li>A valid pipeline <b>must</b> be bound to the pipeline bind point used by this command</li>
            <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command requires any dynamic state, that state <b>must</b> have been set or inherited (if the {@link NVInheritedViewportScissor VK_NV_inherited_viewport_scissor} extension is enabled) for {@code commandBuffer}, and done so after any previously bound pipeline with the corresponding state not specified as dynamic</li>
            <li>There <b>must</b> not have been any calls to dynamic state setting commands for any state not specified as dynamic in the {@code VkPipeline} object bound to the pipeline bind point used by this command, since that pipeline was bound</li>
            <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used to sample from any {@code VkImage} with a {@code VkImageView} of the type #IMAGE_VIEW_TYPE_3D, #IMAGE_VIEW_TYPE_CUBE, #IMAGE_VIEW_TYPE_1D_ARRAY, #IMAGE_VIEW_TYPE_2D_ARRAY or #IMAGE_VIEW_TYPE_CUBE_ARRAY, in any shader stage</li>
            <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with {@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage</li>
            <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that includes a LOD bias or any offset values, in any shader stage</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-robustBufferAccess">robust buffer access</a> feature is not enabled, and if the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a uniform buffer, it <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-robustBufferAccess">robust buffer access</a> feature is not enabled, and if the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a storage buffer, it <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
            <li>If {@code commandBuffer} is an unprotected command buffer and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, any resource accessed by the {@code VkPipeline} object bound to the pipeline bind point used by this command <b>must</b> not be a protected resource</li>
            <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a {@code VkSampler} or {@code VkImageView} object that enables <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a>, that object <b>must</b> only be used with {@code OpImageSample*} or {@code OpImageSparseSample*} instructions</li>
            <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a {@code VkSampler} or {@code VkImageView} object that enables <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a>, that object <b>must</b> not use the {@code ConstOffset} and {@code Offset} operands</li>
            <li>If a {@code VkImageView} is accessed using {@code OpImageWrite} as a result of this command, then the {@code Type} of the {@code Texel} operand of that instruction <b>must</b> have at least as many components as the image view’s format</li>
            <li>If a {@code VkBufferView} is accessed using {@code OpImageWrite} as a result of this command, then the {@code Type} of the {@code Texel} operand of that instruction <b>must</b> have at least as many components as the buffer view’s format</li>
            <li>If a {@code VkImageView} with a {@code VkFormat} that has a 64-bit component width is accessed as a result of this command, the {@code SampledType} of the {@code OpTypeImage} operand of that instruction <b>must</b> have a {@code Width} of 64</li>
            <li>If a {@code VkImageView} with a {@code VkFormat} that has a component width less than 64-bit is accessed as a result of this command, the {@code SampledType} of the {@code OpTypeImage} operand of that instruction <b>must</b> have a {@code Width} of 32</li>
            <li>If a {@code VkBufferView} with a {@code VkFormat} that has a 64-bit component width is accessed as a result of this command, the {@code SampledType} of the {@code OpTypeImage} operand of that instruction <b>must</b> have a {@code Width} of 64</li>
            <li>If a {@code VkBufferView} with a {@code VkFormat} that has a component width less than 64-bit is accessed as a result of this command, the {@code SampledType} of the {@code OpTypeImage} operand of that instruction <b>must</b> have a {@code Width} of 32</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-sparseImageInt64Atomics">{@code sparseImageInt64Atomics}</a> feature is not enabled, {@code VkImage} objects created with the #IMAGE_CREATE_SPARSE_RESIDENCY_BIT flag <b>must</b> not be accessed by atomic instructions through an {@code OpTypeImage} with a {@code SampledType} with a {@code Width} of 64 by this command</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-sparseImageInt64Atomics">{@code sparseImageInt64Atomics}</a> feature is not enabled, {@code VkBuffer} objects created with the #BUFFER_CREATE_SPARSE_RESIDENCY_BIT flag <b>must</b> not be accessed by atomic instructions through an {@code OpTypeImage} with a {@code SampledType} with a {@code Width} of 64 by this command</li>
            <li>Any shader group handle referenced by this call <b>must</b> have been queried from the currently bound ray tracing pipeline</li>
        </ul>

        <ul>
            <li>{@code commandBuffer} <b>must</b> not be a protected command buffer</li>
            <li>This command <b>must</b> not cause a pipeline trace ray instruction to be executed from a shader invocation with a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#ray-tracing-recursion-depth">recursion depth</a> greater than the value of {@code maxRecursionDepth} used to create the bound ray tracing pipeline</li>
            <li>If {@code raygenShaderBindingTableBuffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code raygenShaderBindingOffset} <b>must</b> be less than the size of {@code raygenShaderBindingTableBuffer}</li>
            <li>{@code raygenShaderBindingOffset} <b>must</b> be a multiple of ##VkPhysicalDeviceRayTracingPropertiesNV{@code ::shaderGroupBaseAlignment}</li>
            <li>If {@code missShaderBindingTableBuffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code missShaderBindingOffset} <b>must</b> be less than the size of {@code missShaderBindingTableBuffer}</li>
            <li>{@code missShaderBindingOffset} <b>must</b> be a multiple of ##VkPhysicalDeviceRayTracingPropertiesNV{@code ::shaderGroupBaseAlignment}</li>
            <li>If {@code hitShaderBindingTableBuffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code hitShaderBindingOffset} <b>must</b> be less than the size of {@code hitShaderBindingTableBuffer}</li>
            <li>{@code hitShaderBindingOffset} <b>must</b> be a multiple of ##VkPhysicalDeviceRayTracingPropertiesNV{@code ::shaderGroupBaseAlignment}</li>
            <li>If {@code callableShaderBindingTableBuffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code callableShaderBindingOffset} <b>must</b> be less than the size of {@code callableShaderBindingTableBuffer}</li>
            <li>{@code callableShaderBindingOffset} <b>must</b> be a multiple of ##VkPhysicalDeviceRayTracingPropertiesNV{@code ::shaderGroupBaseAlignment}</li>
            <li>{@code missShaderBindingStride} <b>must</b> be a multiple of ##VkPhysicalDeviceRayTracingPropertiesNV{@code ::shaderGroupHandleSize}</li>
            <li>{@code hitShaderBindingStride} <b>must</b> be a multiple of ##VkPhysicalDeviceRayTracingPropertiesNV{@code ::shaderGroupHandleSize}</li>
            <li>{@code callableShaderBindingStride} <b>must</b> be a multiple of ##VkPhysicalDeviceRayTracingPropertiesNV{@code ::shaderGroupHandleSize}</li>
            <li>{@code missShaderBindingStride} <b>must</b> be less than or equal to ##VkPhysicalDeviceRayTracingPropertiesNV{@code ::maxShaderGroupStride}</li>
            <li>{@code hitShaderBindingStride} <b>must</b> be less than or equal to ##VkPhysicalDeviceRayTracingPropertiesNV{@code ::maxShaderGroupStride}</li>
            <li>{@code callableShaderBindingStride} <b>must</b> be less than or equal to ##VkPhysicalDeviceRayTracingPropertiesNV{@code ::maxShaderGroupStride}</li>
            <li>{@code width} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxComputeWorkGroupCount}[0]</li>
            <li>{@code height} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxComputeWorkGroupCount}[1]</li>
            <li>{@code depth} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxComputeWorkGroupCount}[2]</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code raygenShaderBindingTableBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>If {@code missShaderBindingTableBuffer} is not #NULL_HANDLE, {@code missShaderBindingTableBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>If {@code hitShaderBindingTableBuffer} is not #NULL_HANDLE, {@code hitShaderBindingTableBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>If {@code callableShaderBindingTableBuffer} is not #NULL_HANDLE, {@code callableShaderBindingTableBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>Each of {@code callableShaderBindingTableBuffer}, {@code commandBuffer}, {@code hitShaderBindingTableBuffer}, {@code missShaderBindingTableBuffer}, and {@code raygenShaderBindingTableBuffer} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
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
        VkBuffer("raygenShaderBindingTableBuffer", "the buffer object that holds the shader binding table data for the ray generation shader stage."),
        VkDeviceSize("raygenShaderBindingOffset", "the offset in bytes (relative to {@code raygenShaderBindingTableBuffer}) of the ray generation shader being used for the trace."),
        VkBuffer("missShaderBindingTableBuffer", "the buffer object that holds the shader binding table data for the miss shader stage."),
        VkDeviceSize("missShaderBindingOffset", "the offset in bytes (relative to {@code missShaderBindingTableBuffer}) of the miss shader being used for the trace."),
        VkDeviceSize("missShaderBindingStride", "the size in bytes of each shader binding table record in {@code missShaderBindingTableBuffer}."),
        VkBuffer("hitShaderBindingTableBuffer", "the buffer object that holds the shader binding table data for the hit shader stages."),
        VkDeviceSize("hitShaderBindingOffset", "the offset in bytes (relative to {@code hitShaderBindingTableBuffer}) of the hit shader group being used for the trace."),
        VkDeviceSize("hitShaderBindingStride", "the size in bytes of each shader binding table record in {@code hitShaderBindingTableBuffer}."),
        VkBuffer("callableShaderBindingTableBuffer", "the buffer object that holds the shader binding table data for the callable shader stage."),
        VkDeviceSize("callableShaderBindingOffset", "the offset in bytes (relative to {@code callableShaderBindingTableBuffer}) of the callable shader being used for the trace."),
        VkDeviceSize("callableShaderBindingStride", "the size in bytes of each shader binding table record in {@code callableShaderBindingTableBuffer}."),
        uint32_t("width", "the width of the ray trace query dimensions."),
        uint32_t("height", "height of the ray trace query dimensions."),
        uint32_t("depth", "depth of the ray trace query dimensions.")
    )

    VkResult(
        "CreateRayTracingPipelinesNV",
        """
        Creates a new ray tracing pipeline object.

        <h5>C Specification</h5>
        To create ray tracing pipelines, call:

        <pre><code>
￿VkResult vkCreateRayTracingPipelinesNV(
￿    VkDevice                                    device,
￿    VkPipelineCache                             pipelineCache,
￿    uint32_t                                    createInfoCount,
￿    const VkRayTracingPipelineCreateInfoNV*     pCreateInfos,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkPipeline*                                 pPipelines);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>If the {@code flags} member of any element of {@code pCreateInfos} contains the #PIPELINE_CREATE_DERIVATIVE_BIT flag, and the {@code basePipelineIndex} member of that same element is not {@code -1}, {@code basePipelineIndex} <b>must</b> be less than the index into {@code pCreateInfos} that corresponds to that element</li>
            <li>If the {@code flags} member of any element of {@code pCreateInfos} contains the #PIPELINE_CREATE_DERIVATIVE_BIT flag, the base pipeline <b>must</b> have been created with the #PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT flag set</li>
            <li>{@code flags} <b>must</b> not contain the #PIPELINE_CREATE_DISPATCH_BASE flag</li>
            <li>If {@code pipelineCache} was created with #PIPELINE_CACHE_CREATE_EXTERNALLY_SYNCHRONIZED_BIT, host access to {@code pipelineCache} <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#fundamentals-threadingbehavior">externally synchronized</a></li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code pipelineCache} is not #NULL_HANDLE, {@code pipelineCache} <b>must</b> be a valid {@code VkPipelineCache} handle</li>
            <li>{@code pCreateInfos} <b>must</b> be a valid pointer to an array of {@code createInfoCount} valid ##VkRayTracingPipelineCreateInfoNV structures</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pPipelines} <b>must</b> be a valid pointer to an array of {@code createInfoCount} {@code VkPipeline} handles</li>
            <li>{@code createInfoCount} <b>must</b> be greater than 0</li>
            <li>If {@code pipelineCache} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#PIPELINE_COMPILE_REQUIRED_EXT</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_INVALID_SHADER_NV</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkRayTracingPipelineCreateInfoNV
        """,

        VkDevice("device", "the logical device that creates the ray tracing pipelines."),
        VkPipelineCache("pipelineCache", "either #NULL_HANDLE, indicating that pipeline caching is disabled, or the handle of a valid <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\\#pipelines-cache\">pipeline cache</a> object, in which case use of that cache is enabled for the duration of the command."),
        AutoSize("pCreateInfos", "pPipelines")..uint32_t("createInfoCount", "the length of the {@code pCreateInfos} and {@code pPipelines} arrays."),
        VkRayTracingPipelineCreateInfoNV.const.p("pCreateInfos", "a pointer to an array of ##VkRayTracingPipelineCreateInfoNV structures."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        VkPipeline.p("pPipelines", "a pointer to an array in which the resulting ray tracing pipeline objects are returned.")
    )

    VkResult(
        "GetRayTracingShaderGroupHandlesNV",
        "See #GetRayTracingShaderGroupHandlesKHR().",

        VkDevice("device", "the logical device containing the ray tracing pipeline."),
        VkPipeline("pipeline", "the ray tracing pipeline object containing the shaders."),
        uint32_t("firstGroup", "the index of the first group to retrieve a handle for from the ##VkRayTracingPipelineCreateInfoKHR{@code ::pGroups} or ##VkRayTracingPipelineCreateInfoNV{@code ::pGroups} array."),
        uint32_t("groupCount", "the number of shader handles to retrieve."),
        AutoSize("pData")..size_t("dataSize", "the size in bytes of the buffer pointed to by {@code pData}."),
        void.p("pData", "a pointer to a user-allocated buffer where the results will be written.")
    )

    VkResult(
        "GetAccelerationStructureHandleNV",
        """
        Get opaque acceleration structure handle.

        <h5>C Specification</h5>
        To allow constructing geometry instances with device code if desired, we need to be able to query a opaque handle for an acceleration structure. This handle is a value of 8 bytes. To get this handle, call:

        <pre><code>
￿VkResult vkGetAccelerationStructureHandleNV(
￿    VkDevice                                    device,
￿    VkAccelerationStructureNV                   accelerationStructure,
￿    size_t                                      dataSize,
￿    void*                                       pData);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code dataSize} <b>must</b> be large enough to contain the result of the query, as described above</li>
            <li>{@code accelerationStructure} <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object via #BindAccelerationStructureMemoryNV()</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code accelerationStructure} <b>must</b> be a valid {@code VkAccelerationStructureNV} handle</li>
            <li>{@code pData} <b>must</b> be a valid pointer to an array of {@code dataSize} bytes</li>
            <li>{@code dataSize} <b>must</b> be greater than 0</li>
            <li>{@code accelerationStructure} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
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

        VkDevice("device", "the logical device that owns the acceleration structures."),
        VkAccelerationStructureNV("accelerationStructure", "the acceleration structure."),
        AutoSize("pData")..size_t("dataSize", "the size in bytes of the buffer pointed to by {@code pData}."),
        void.p("pData", "a pointer to a user-allocated buffer where the results will be written.")
    )

    void(
        "CmdWriteAccelerationStructuresPropertiesNV",
        """
        Write acceleration structure result parameters to query results.

        <h5>C Specification</h5>
        To query acceleration structure size parameters call:

        <pre><code>
￿void vkCmdWriteAccelerationStructuresPropertiesNV(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    accelerationStructureCount,
￿    const VkAccelerationStructureNV*            pAccelerationStructures,
￿    VkQueryType                                 queryType,
￿    VkQueryPool                                 queryPool,
￿    uint32_t                                    firstQuery);</code></pre>

        <h5>Description</h5>
        Accesses to any of the acceleration structures listed in {@code pAccelerationStructures} <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-dependencies">synchronized</a> with the #PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_KHR <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-pipeline-stages">pipeline stage</a> and an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-access-types">access type</a> of #ACCESS_ACCELERATION_STRUCTURE_READ_BIT_KHR.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code queryPool} <b>must</b> have been created with a {@code queryType} matching {@code queryType}</li>
            <li>The queries identified by {@code queryPool} and {@code firstQuery} <b>must</b> be <em>unavailable</em></li>
            <li>{@code accelerationStructure} <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object via #BindAccelerationStructureMemoryNV()</li>
            <li>All acceleration structures in {@code pAccelerationStructures} <b>must</b> have been built prior to the execution of this command</li>
            <li>All acceleration structures in {@code pAccelerationStructures} <b>must</b> have been built with #BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_KHR if {@code queryType} is #QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_NV</li>
            <li>{@code queryType} <b>must</b> be #QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_NV</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pAccelerationStructures} <b>must</b> be a valid pointer to an array of {@code accelerationStructureCount} valid {@code VkAccelerationStructureNV} handles</li>
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
        VkAccelerationStructureNV.const.p("pAccelerationStructures", "a pointer to an array of existing previously built acceleration structures."),
        VkQueryType("queryType", "a {@code VkQueryType} value specifying the type of queries managed by the pool."),
        VkQueryPool("queryPool", "the query pool that will manage the results of the query."),
        uint32_t("firstQuery", "the first query index within the query pool that will contain the {@code accelerationStructureCount} number of results.")
    )

    VkResult(
        "CompileDeferredNV",
        """
        Deferred compilation of shaders.

        <h5>C Specification</h5>
        To compile a deferred shader in a pipeline call:

        <pre><code>
￿VkResult vkCompileDeferredNV(
￿    VkDevice                                    device,
￿    VkPipeline                                  pipeline,
￿    uint32_t                                    shader);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code pipeline} <b>must</b> be a ray tracing pipeline</li>
            <li>{@code pipeline} <b>must</b> have been created with #PIPELINE_CREATE_DEFER_COMPILE_BIT_NV</li>
            <li>{@code shader} <b>must</b> not have been called as a deferred compile before</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pipeline} <b>must</b> be a valid {@code VkPipeline} handle</li>
            <li>{@code pipeline} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
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

        VkDevice("device", "the logical device containing the ray tracing pipeline."),
        VkPipeline("pipeline", "the ray tracing pipeline object containing the shaders."),
        uint32_t("shader", "the index of the shader to compile.")
    )
}