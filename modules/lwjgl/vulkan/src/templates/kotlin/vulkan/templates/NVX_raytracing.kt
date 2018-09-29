/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NVX_raytracing = "NVXRaytracing".nativeClassVK("NVX_raytracing", type = "device", postfix = NVX) {
    documentation =
        """
        Rasterization has been the dominant method to produce interactive graphics, but increasing performance of graphics hardware has made raytracing a viable option for interactive rendering. Being able to integrate raytracing with traditional rasterization makes it easier for applications to incrementally add raytraced effects to existing applications or to do hybrid approaches with rasterization for primary visibility and raytracing for secondary queries.

        To enable raytracing, this extension adds a few different categories of new functionality:

        <ul>
            <li>Acceleration structure objects and build commands</li>
            <li>A new pipeline type with new shader domains</li>
            <li>An indirection table to link shader groups with acceleration structure items</li>
        </ul>

        This extension adds support for the following SPIR-V extension in Vulkan:

        <ul>
            <li>SPV_NVX_raytracing</li>
        </ul>

        <h5>Sample Code</h5>
        Example ray generation GLSL shader

        <pre><code>
￿\#version 450 core
￿\#extension GL_NVX_raytracing : require
￿layout(set = 0, binding = 0, rgba8) uniform image2D image;
￿layout(set = 0, binding = 1) uniform accelerationStructureNVX as;
￿layout(location = 0) rayPayloadNVX float payload;
￿
￿void main()
￿{
￿   vec4 col = vec4(0, 0, 0, 1);
￿
￿   vec3 origin = vec3(float(gl_LaunchIDNVX.x)/float(gl_LaunchSizeNVX.x), float(gl_LaunchIDNVX.y)/float(gl_LaunchSizeNVX.y), 1.0);
￿   vec3 dir = vec3(0.0, 0.0, -1.0);
￿
￿   traceNVX(as, 0, 0xff, 0, 1, 0, origin, 0.0, dir, 1000.0, 0);
￿
￿   col.y = payload;
￿
￿   imageStore(image, ivec2(gl_LaunchIDNVX.xy), col);
￿}</code></pre>

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_NVX_raytracing}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>166</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
                <li>Requires {@link KHRGetMemoryRequirements2 VK_KHR_get_memory_requirements2}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Eric Werness <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_NVX_raytracing:%20&amp;body=@ewerness%20">ewerness</a></li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2018-09-11</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>This extension requires the <a target="_blank" href="https://www.khronos.org/registry/spir-v/extensions/NVX/SPV_NVX_raytracing.html">SPV_NVX_raytracing</a> SPIR-V extension.</li>
                <li>This extension requires the <a target="_blank" href="https://github.com/KhronosGroup/GLSL/tree/master/extensions/NVX/GL_NVX_raytracing.txt">GL_NVX_raytracing</a> extension for GLSL source languages.</li>
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
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "NVX_RAYTRACING_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "NVX_RAYTRACING_EXTENSION_NAME".."VK_NVX_raytracing"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_RAYTRACING_PIPELINE_CREATE_INFO_NVX".."1000165000",
        "STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_NVX".."1000165001",
        "STRUCTURE_TYPE_GEOMETRY_INSTANCE_NVX".."1000165002",
        "STRUCTURE_TYPE_GEOMETRY_NVX".."1000165003",
        "STRUCTURE_TYPE_GEOMETRY_TRIANGLES_NVX".."1000165004",
        "STRUCTURE_TYPE_GEOMETRY_AABB_NVX".."1000165005",
        "STRUCTURE_TYPE_BIND_ACCELERATION_STRUCTURE_MEMORY_INFO_NVX".."1000165006",
        "STRUCTURE_TYPE_DESCRIPTOR_ACCELERATION_STRUCTURE_INFO_NVX".."1000165007",
        "STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_INFO_NVX".."1000165008",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_RAYTRACING_PROPERTIES_NVX".."1000165009",
        "STRUCTURE_TYPE_HIT_SHADER_MODULE_CREATE_INFO_NVX".."1000165010"
    )

    EnumConstant(
        "Extends {@code VkShaderStageFlagBits}.",

        "SHADER_STAGE_RAYGEN_BIT_NVX".enum(0x00000100),
        "SHADER_STAGE_ANY_HIT_BIT_NVX".enum(0x00000200),
        "SHADER_STAGE_CLOSEST_HIT_BIT_NVX".enum(0x00000400),
        "SHADER_STAGE_MISS_BIT_NVX".enum(0x00000800),
        "SHADER_STAGE_INTERSECTION_BIT_NVX".enum(0x00001000),
        "SHADER_STAGE_CALLABLE_BIT_NVX".enum(0x00002000)
    )

    EnumConstant(
        "Extends {@code VkPipelineStageFlagBits}.",

        "PIPELINE_STAGE_RAYTRACING_BIT_NVX".enum(0x00200000)
    )

    EnumConstant(
        "Extends {@code VkBufferUsageFlagBits}.",

        "BUFFER_USAGE_RAYTRACING_BIT_NVX".enum(0x00000400)
    )

    EnumConstant(
        "Extends {@code VkPipelineBindPoint}.",

        "PIPELINE_BIND_POINT_RAYTRACING_NVX".."1000165000"
    )

    EnumConstant(
        "Extends {@code VkDescriptorType}.",

        "DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_NVX".."1000165000"
    )

    EnumConstant(
        "Extends {@code VkAccessFlagBits}.",

        "ACCESS_ACCELERATION_STRUCTURE_READ_BIT_NVX".enum(0x00200000),
        "ACCESS_ACCELERATION_STRUCTURE_WRITE_BIT_NVX".enum(0x00400000)
    )

    EnumConstant(
        "Extends {@code VkQueryType}.",

        "QUERY_TYPE_COMPACTED_SIZE_NVX".."1000165000"
    )

    EnumConstant(
        "Extends {@code VkPipelineCreateFlagBits}.",

        "PIPELINE_CREATE_DEFER_COMPILE_BIT_NVX".enum(0x00000020)
    )

    EnumConstant(
        "Extends {@code VkObjectType}.",

        "OBJECT_TYPE_ACCELERATION_STRUCTURE_NVX".."1000165000"
    )

    EnumConstant(
        "Extends {@code VkDebugReportObjectTypeEXT}.",

        "DEBUG_REPORT_OBJECT_TYPE_ACCELERATION_STRUCTURE_NVX_EXT".."1000165000"
    )

    EnumConstant(
        """
        VkGeometryTypeNVX - Enum specifying which type of geometry is provided

        <h5>Description</h5>
        <pre><code>
￿typedef enum VkGeometryTypeNVX {
￿    VK_GEOMETRY_TYPE_TRIANGLES_NVX = 0,
￿    VK_GEOMETRY_TYPE_AABBS_NVX = 1,
￿} VkGeometryTypeNVX;</code></pre>

        <h5>See Also</h5>
        ##VkGeometryNVX
        """,

        "GEOMETRY_TYPE_TRIANGLES_NVX".."0",
        "GEOMETRY_TYPE_AABBS_NVX".."1"
    )

    EnumConstant(
        """
        VkGeometryFlagBitsNVX - Bitmask specifying additional parameters for a geometry

        <h5>See Also</h5>
        {@code VkGeometryFlagsNVX}
        """,

        "GEOMETRY_OPAQUE_BIT_NVX".enum(0x00000001),
        "GEOMETRY_NO_DUPLICATE_ANY_HIT_INVOCATION_BIT_NVX".enum(0x00000002)
    )

    EnumConstant(
        "VkGeometryInstanceFlagBitsNVX",

        "GEOMETRY_INSTANCE_TRIANGLE_CULL_DISABLE_BIT_NVX".enum(0x00000001),
        "GEOMETRY_INSTANCE_TRIANGLE_CULL_FLIP_WINDING_BIT_NVX".enum(0x00000002),
        "GEOMETRY_INSTANCE_FORCE_OPAQUE_BIT_NVX".enum(0x00000004),
        "GEOMETRY_INSTANCE_FORCE_NO_OPAQUE_BIT_NVX".enum(0x00000008)
    )

    EnumConstant(
        "VkAccelerationStructureTypeNVX",

        "ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_NVX".."0",
        "ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_NVX".."1"
    )

    EnumConstant(
        """
        VkBuildAccelerationStructureFlagBitsNVX - Bitmask specifying additional parameters for acceleration structure builds

        <h5>See Also</h5>
        {@code VkBuildAccelerationStructureFlagsNVX}
        """,

        "BUILD_ACCELERATION_STRUCTURE_ALLOW_UPDATE_BIT_NVX".enum(0x00000001),
        "BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_NVX".enum(0x00000002),
        "BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_TRACE_BIT_NVX".enum(0x00000004),
        "BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_BUILD_BIT_NVX".enum(0x00000008),
        "BUILD_ACCELERATION_STRUCTURE_LOW_MEMORY_BIT_NVX".enum(0x00000010)
    )

    EnumConstant(
        """
        VkCopyAccelerationStructureModeNVX - Acceleration structure copy mode

        <h5>Description</h5>
        <ul>
            <li>#COPY_ACCELERATION_STRUCTURE_MODE_CLONE_NVX creates a direct copy of the acceleration structure specified in {@code src} into the one specified by {@code dst}. The {@code dst} acceleration structure <b>must</b> have been created with the same parameters as {@code src}.</li>
            <li>#COPY_ACCELERATION_STRUCTURE_MODE_COMPACT_NVX creates a more compact version of an acceleration structure {@code src} into {@code dst}. The acceleration structure {@code dst} <b>must</b> have been created with a {@code compactedSize} corresponding to the one returned by {@code vkCmdWriteAccelerationStructurePropertiesNVX} after the build of the acceleration structure specified by {@code src}.</li>
        </ul>

        <h5>See Also</h5>
        #CmdCopyAccelerationStructureNVX()
        """,

        "COPY_ACCELERATION_STRUCTURE_MODE_CLONE_NVX".."0",
        "COPY_ACCELERATION_STRUCTURE_MODE_COMPACT_NVX".."1"
    )

    VkResult(
        "CreateAccelerationStructureNVX",
        """
        Create a new acceleration structure object.

        <h5>C Specification</h5>
        To create acceleration structures, call:

        <pre><code>
￿VkResult vkCreateAccelerationStructureNVX(
￿    VkDevice                                    device,
￿    const VkAccelerationStructureCreateInfoNVX* pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkAccelerationStructureNVX*                 pAccelerationStructure);</code></pre>

        <h5>Description</h5>
        

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkAccelerationStructureCreateInfoNVX structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pAccelerationStructure} <b>must</b> be a valid pointer to a {@code VkAccelerationStructureNVX} handle</li>
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
        ##VkAccelerationStructureCreateInfoNVX, ##VkAllocationCallbacks
        """,

        VkDevice.IN("device", "the logical device that creates the buffer object."),
        VkAccelerationStructureCreateInfoNVX.const.p.IN("pCreateInfo", "a pointer to an instance of the ##VkAccelerationStructureCreateInfoNVX structure containing parameters affecting creation of the acceleration structure."),
        nullable..VkAllocationCallbacks.const.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkAccelerationStructureNVX.p.OUT("pAccelerationStructure", "points to a {@code VkAccelerationStructureNVX} handle in which the resulting acceleration structure object is returned.")
    )

    void(
        "DestroyAccelerationStructureNVX",
        """
        Destroy an acceleration structure object.

        <h5>C Specification</h5>
        To destroy an acceleration structure, call:

        <pre><code>
￿void vkDestroyAccelerationStructureNVX(
￿    VkDevice                                    device,
￿    VkAccelerationStructureNVX                  accelerationStructure,
￿    const VkAllocationCallbacks*                pAllocator);</code></pre>

        <h5>Description</h5>
        

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code accelerationStructure} <b>must</b> be a valid {@code VkAccelerationStructureNVX} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code accelerationStructure} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice.IN("device", "the logical device that destroys the buffer."),
        VkAccelerationStructureNVX.IN("accelerationStructure", "the acceleration structure to destroy."),
        nullable..VkAllocationCallbacks.const.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    void(
        "GetAccelerationStructureMemoryRequirementsNVX",
        """
        Get acceleration structure memory requirements.

        <h5>C Specification</h5>
        An acceleration structure has both its own memory use and the scratch memory use required when building it.

        To query the basic memory requirements call:

        <pre><code>
￿void vkGetAccelerationStructureMemoryRequirementsNVX(
￿    VkDevice                                    device,
￿    const VkAccelerationStructureMemoryRequirementsInfoNVX* pInfo,
￿    VkMemoryRequirements2KHR*                   pMemoryRequirements);</code></pre>

        <h5>Description</h5>
        

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pInfo} <b>must</b> be a valid pointer to a valid ##VkAccelerationStructureMemoryRequirementsInfoNVX structure</li>
            <li>{@code pMemoryRequirements} <b>must</b> be a valid pointer to a ##VkMemoryRequirements2KHR structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkAccelerationStructureMemoryRequirementsInfoNVX, ##VkMemoryRequirements2KHR
        """,

        VkDevice.IN("device", "the logical device on which the acceleration structure was created."),
        VkAccelerationStructureMemoryRequirementsInfoNVX.const.p.IN("pInfo", "specifies the acceleration structure to get memory requirements for."),
        VkMemoryRequirements2KHR.p.OUT("pMemoryRequirements", "returns the memory requirements.")
    )

    void(
        "GetAccelerationStructureScratchMemoryRequirementsNVX",
        """
        Get acceleration structure scratch memory requirements.

        <h5>C Specification</h5>
        To query the scratch memory requirements call:

        <pre><code>
￿void vkGetAccelerationStructureScratchMemoryRequirementsNVX(
￿    VkDevice                                    device,
￿    const VkAccelerationStructureMemoryRequirementsInfoNVX* pInfo,
￿    VkMemoryRequirements2KHR*                   pMemoryRequirements);</code></pre>

        <h5>Description</h5>
        

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pInfo} <b>must</b> be a valid pointer to a valid ##VkAccelerationStructureMemoryRequirementsInfoNVX structure</li>
            <li>{@code pMemoryRequirements} <b>must</b> be a valid pointer to a ##VkMemoryRequirements2KHR structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkAccelerationStructureMemoryRequirementsInfoNVX, ##VkMemoryRequirements2KHR
        """,

        VkDevice.IN("device", "the logical device on which the acceleration structure was created."),
        VkAccelerationStructureMemoryRequirementsInfoNVX.const.p.IN("pInfo", "specifies the acceleration structure to get scratch memory requirements for."),
        VkMemoryRequirements2KHR.p.OUT("pMemoryRequirements", "returns the memory requirements.")
    )

    VkResult(
        "BindAccelerationStructureMemoryNVX",
        """
        Bind acceleration structure memory.

        <h5>C Specification</h5>
        To attach memory to one or more acceleration structures at a time, call:

        <pre><code>
￿VkResult vkBindAccelerationStructureMemoryNVX(
￿    VkDevice                                    device,
￿    uint32_t                                    bindInfoCount,
￿    const VkBindAccelerationStructureMemoryInfoNVX* pBindInfos);</code></pre>

        <h5>Description</h5>
        

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pBindInfos} <b>must</b> be a valid pointer to an array of {@code bindInfoCount} valid ##VkBindAccelerationStructureMemoryInfoNVX structures</li>
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
        ##VkBindAccelerationStructureMemoryInfoNVX
        """,

        VkDevice.IN("device", "the logical device that owns the acceleration structures and memory."),
        AutoSize("pBindInfos")..uint32_t.IN("bindInfoCount", "the number of elements in pBindInfos."),
        VkBindAccelerationStructureMemoryInfoNVX.const.p.IN("pBindInfos", "a pointer to an array of structures of type ##VkBindAccelerationStructureMemoryInfoNVX, describing images and memory to bind.")
    )

    void(
        "CmdBuildAccelerationStructureNVX",
        """
        Build an acceleration structure.

        <h5>C Specification</h5>
        To build an acceleration structure call:

        <pre><code>
￿void vkCmdBuildAccelerationStructureNVX(
￿    VkCommandBuffer                             commandBuffer,
￿    VkAccelerationStructureTypeNVX              type,
￿    uint32_t                                    instanceCount,
￿    VkBuffer                                    instanceData,
￿    VkDeviceSize                                instanceOffset,
￿    uint32_t                                    geometryCount,
￿    const VkGeometryNVX*                        pGeometries,
￿    VkBuildAccelerationStructureFlagsNVX        flags,
￿    VkBool32                                    update,
￿    VkAccelerationStructureNVX                  dst,
￿    VkAccelerationStructureNVX                  src,
￿    VkBuffer                                    scratch,
￿    VkDeviceSize                                scratchOffset);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code geometryCount} <b>must</b> be less than or equal to ##VkPhysicalDeviceRaytracingPropertiesNVX{@code ::maxGeometryCount}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code type} <b>must</b> be a valid {@code VkAccelerationStructureTypeNVX} value</li>
            <li>If {@code instanceData} is not #NULL_HANDLE, {@code instanceData} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>If {@code geometryCount} is not 0, {@code pGeometries} <b>must</b> be a valid pointer to an array of {@code geometryCount} valid ##VkGeometryNVX structures</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkBuildAccelerationStructureFlagBitsNVX} values</li>
            <li>{@code dst} <b>must</b> be a valid {@code VkAccelerationStructureNVX} handle</li>
            <li>If {@code src} is not #NULL_HANDLE, {@code src} <b>must</b> be a valid {@code VkAccelerationStructureNVX} handle</li>
            <li>{@code scratch} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
            <li>Each of {@code commandBuffer}, {@code dst}, {@code instanceData}, {@code scratch}, and {@code src} that are valid handles <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics Compute</td><td></td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkGeometryNVX
        """,

        VkCommandBuffer.IN("commandBuffer", ""),
        VkAccelerationStructureTypeNVX.IN("type", "the type of acceleration structure that is being built"),
        uint32_t.IN("instanceCount", "the number of instances in the acceleration structure. This parameter <b>must</b> be 0 for bottom level acceleration structures."),
        VkBuffer.IN("instanceData", "the buffer containing instance data that will be used to build the acceleration structure. This parameter <b>must</b> be NULL for bottom level acceleration structures."),
        VkDeviceSize.IN("instanceOffset", "the offset (relative to the start of {@code instanceData}) at which the instance data is located."),
        AutoSize("pGeometries")..uint32_t.IN("geometryCount", "the number of geometries in the acceleration structure. This parameter <b>must</b> be 0 for top level acceleration structures."),
        nullable..VkGeometryNVX.const.p.IN("pGeometries", "a pointer to an array of geometries used by bottom level acceleration structures. This parameter <b>must</b> be NULL for top level acceleration structures."),
        VkBuildAccelerationStructureFlagsNVX.IN("flags", "a {@code vkBuildAccelerationStructureFlagBitsNVX} value that specifies additional parameters for the acceleration structure build."),
        VkBool32.IN("update", "specifies whether to update the {@code dst} acceleration structure with the data in {@code src}."),
        VkAccelerationStructureNVX.IN("dst", "points to the target acceleration structure for the build."),
        VkAccelerationStructureNVX.IN("src", "points to an existing acceleration structure that can be used to update the {@code dst} acceleration structure."),
        VkBuffer.IN("scratch", "the {@code VkBuffer} that will be used as scratch memory for the build."),
        VkDeviceSize.IN("scratchOffset", "the offset relative to the start of {@code scratch} that will be used as scratch memory")
    )

    void(
        "CmdCopyAccelerationStructureNVX",
        """
        Copy an acceleration structure.

        <h5>C Specification</h5>
        To copy an acceleration structure call:

        <pre><code>
￿void vkCmdCopyAccelerationStructureNVX(
￿    VkCommandBuffer                             commandBuffer,
￿    VkAccelerationStructureNVX                  dst,
￿    VkAccelerationStructureNVX                  src,
￿    VkCopyAccelerationStructureModeNVX          mode);</code></pre>

        <h5>Description</h5>
        

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code dst} <b>must</b> be a valid {@code VkAccelerationStructureNVX} handle</li>
            <li>{@code src} <b>must</b> be a valid {@code VkAccelerationStructureNVX} handle</li>
            <li>{@code mode} <b>must</b> be a valid {@code VkCopyAccelerationStructureModeNVX} value</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
            <li>Each of {@code commandBuffer}, {@code dst}, and {@code src} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics Compute</td><td></td></tr></tbody>
        </table>
        """,

        VkCommandBuffer.IN("commandBuffer", ""),
        VkAccelerationStructureNVX.IN("dst", "points to the target acceleration structure for the build"),
        VkAccelerationStructureNVX.IN("src", "points to an existing acceleration structure that can be used to update the {@code dst} acceleration structure"),
        VkCopyAccelerationStructureModeNVX.IN("mode", "a {@code VkCopyAccelerationStructureModeNVX} value that specifies additional operations to perform during the copy.")
    )

    void(
        "CmdTraceRaysNVX",
        """
        Initialize a raytracing dispatch.

        <h5>C Specification</h5>
        To dispatch a raytracing call use:

        <pre><code>
￿void vkCmdTraceRaysNVX(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBuffer                                    raygenShaderBindingTableBuffer,
￿    VkDeviceSize                                raygenShaderBindingOffset,
￿    VkBuffer                                    missShaderBindingTableBuffer,
￿    VkDeviceSize                                missShaderBindingOffset,
￿    VkDeviceSize                                missShaderBindingStride,
￿    VkBuffer                                    hitShaderBindingTableBuffer,
￿    VkDeviceSize                                hitShaderBindingOffset,
￿    VkDeviceSize                                hitShaderBindingStride,
￿    uint32_t                                    width,
￿    uint32_t                                    height);</code></pre>

        <h5>Description</h5>
        When the command is executed, a ray query of <code>width × height</code> rays is assembled.

        

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code raygenShaderBindingTableBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code missShaderBindingTableBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code hitShaderBindingTableBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
            <li>Each of {@code commandBuffer}, {@code hitShaderBindingTableBuffer}, {@code missShaderBindingTableBuffer}, and {@code raygenShaderBindingTableBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics Compute</td><td></td></tr></tbody>
        </table>
        """,

        VkCommandBuffer.IN("commandBuffer", ""),
        VkBuffer.IN("raygenShaderBindingTableBuffer", "the buffer object that holds the shader binding table data for the ray generation shader stage."),
        VkDeviceSize.IN("raygenShaderBindingOffset", "the offset (relative to {@code raygenShaderBindingTableBuffer}) of the ray generation shader being used for the trace."),
        VkBuffer.IN("missShaderBindingTableBuffer", "the buffer object that holds the shader binding table data for the miss shader stage."),
        VkDeviceSize.IN("missShaderBindingOffset", "the offset (relative to {@code missShaderBindingTableBuffer}) of the miss shader being used for the trace."),
        VkDeviceSize.IN("missShaderBindingStride", "the size of each shader binding table record in {@code missShaderBindingTableBuffer}"),
        VkBuffer.IN("hitShaderBindingTableBuffer", "the buffer object that holds the shader binding table data for the hit shader stages."),
        VkDeviceSize.IN("hitShaderBindingOffset", "the offset (relative to {@code hitShaderBindingTableBuffer}) of the hit shader group being used for the trace."),
        VkDeviceSize.IN("hitShaderBindingStride", "the size of each shader binding table record in {@code hitShaderBindingTableBuffer}"),
        uint32_t.IN("width", "the width of the ray trace query dimensions."),
        uint32_t.IN("height", "height of the ray trace query dimensions.")
    )

    VkResult(
        "CreateRaytracingPipelinesNVX",
        """
        Creates a new raytracing pipeline object.

        <h5>C Specification</h5>
        To create raytracing pipelines, call:

        <pre><code>
￿VkResult vkCreateRaytracingPipelinesNVX(
￿    VkDevice                                    device,
￿    VkPipelineCache                             pipelineCache,
￿    uint32_t                                    createInfoCount,
￿    const VkRaytracingPipelineCreateInfoNVX*    pCreateInfos,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkPipeline*                                 pPipelines);</code></pre>

        <h5>Description</h5>
        

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code pipelineCache} is not #NULL_HANDLE, {@code pipelineCache} <b>must</b> be a valid {@code VkPipelineCache} handle</li>
            <li>{@code pCreateInfos} <b>must</b> be a valid pointer to an array of {@code createInfoCount} valid ##VkRaytracingPipelineCreateInfoNVX structures</li>
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
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_INVALID_SHADER_NV</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkRaytracingPipelineCreateInfoNVX
        """,

        VkDevice.IN("device", "the logical device that creates the raytracing pipelines."),
        VkPipelineCache.IN("pipelineCache", "either #NULL_HANDLE, indicating that pipeline caching is disabled; or the handle of a valid <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#pipelines-cache\">pipeline cache</a> object, in which case use of that cache is enabled for the duration of the command."),
        AutoSize("pCreateInfos", "pPipelines")..uint32_t.IN("createInfoCount", "the length of the {@code pCreateInfos} and {@code pPipelines} arrays."),
        VkRaytracingPipelineCreateInfoNVX.const.p.IN("pCreateInfos", "an array of ##VkRaytracingPipelineCreateInfoNVX structures."),
        nullable..VkAllocationCallbacks.const.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        VkPipeline.p.OUT("pPipelines", "a pointer to an array in which the resulting compute pipeline objects are returned.")
    )

    VkResult(
        "GetRaytracingShaderHandlesNVX",
        """
        Query raytracing pipeline shader handles.

        <h5>C Specification</h5>
        To query the opaque handles of shaders in the raytracing pipeline, call:

        <pre><code>
￿VkResult vkGetRaytracingShaderHandlesNVX(
￿    VkDevice                                    device,
￿    VkPipeline                                  pipeline,
￿    uint32_t                                    firstGroup,
￿    uint32_t                                    groupCount,
￿    size_t                                      dataSize,
￿    void*                                       pData);</code></pre>

        <h5>Description</h5>
        

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pipeline} <b>must</b> be a valid {@code VkPipeline} handle</li>
            <li>{@code pData} <b>must</b> be a valid pointer to an array of {@code dataSize} bytes</li>
            <li>{@code dataSize} <b>must</b> be greater than 0</li>
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

        VkDevice.IN("device", "the logical device that contains the raytracing pipeline."),
        VkPipeline.IN("pipeline", "the raytracing pipeline object that contains the shaders."),
        uint32_t.IN("firstGroup", ""),
        uint32_t.IN("groupCount", ""),
        AutoSize("pData")..size_t.IN("dataSize", "the size in bytes of the buffer pointed to by pData."),
        void.p.OUT("pData", "a pointer to a user-allocated buffer where the results will be written.")
    )

    VkResult(
        "GetAccelerationStructureHandleNVX",
        """
        Get opaque acceleration structure handle.

        <h5>C Specification</h5>
        To allow constructing geometry instances with device code if desired, we need to be able to query a opaque handle for an acceleration structure. This handle is a value of 8 bytes. To get this handle, call:

        <pre><code>
￿VkResult vkGetAccelerationStructureHandleNVX(
￿    VkDevice                                    device,
￿    VkAccelerationStructureNVX                  accelerationStructure,
￿    size_t                                      dataSize,
￿    void*                                       pData);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code dataSize} <b>must</b> be large enough to contain the result of the query, as described above</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code accelerationStructure} <b>must</b> be a valid {@code VkAccelerationStructureNVX} handle</li>
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

        VkDevice.IN("device", "the logical device that owns the acceleration structures."),
        VkAccelerationStructureNVX.IN("accelerationStructure", "the acceleration structur."),
        AutoSize("pData")..size_t.IN("dataSize", "the size in bytes of the buffer pointed to by {@code pData}."),
        void.p.OUT("pData", "a pointer to a user-allocated buffer where the results will be written")
    )

    void(
        "CmdWriteAccelerationStructurePropertiesNVX",
        """
        Write acceleration structure result parameters to query results.

        <h5>C Specification</h5>
        To query acceleration structure size parameters call:

        <pre><code>
￿void vkCmdWriteAccelerationStructurePropertiesNVX(
￿    VkCommandBuffer                             commandBuffer,
￿    VkAccelerationStructureNVX                  accelerationStructure,
￿    VkQueryType                                 queryType,
￿    VkQueryPool                                 queryPool,
￿    uint32_t                                    query);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code queryType} <b>must</b> be VK_QUERY_TYPE_COMPACTED_SIZE_NVX</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code accelerationStructure} <b>must</b> be a valid {@code VkAccelerationStructureNVX} handle</li>
            <li>{@code queryType} <b>must</b> be a valid {@code VkQueryType} value</li>
            <li>{@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
            <li>Each of {@code accelerationStructure}, {@code commandBuffer}, and {@code queryPool} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics Compute</td><td></td></tr></tbody>
        </table>
        """,

        VkCommandBuffer.IN("commandBuffer", ""),
        VkAccelerationStructureNVX.IN("accelerationStructure", "points to an existing acceleration structure which has been built."),
        VkQueryType.IN("queryType", "a {@code VkQueryType} value specifying the type of queries managed by the pool."),
        VkQueryPool.IN("queryPool", "the query pool that will manage the results of the query."),
        uint32_t.IN("query", "the query index within the query pool that will contain the results.")
    )

    VkResult(
        "CompileDeferredNVX",
        """
        Deferred compilation of shaders.

        <h5>C Specification</h5>
        To compile a deferred shader in a pipeline call:

        <pre><code>
￿VkResult vkCompileDeferredNVX(
￿    VkDevice                                    device,
￿    VkPipeline                                  pipeline,
￿    uint32_t                                    shader);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code pipeline} <b>must</b> have been created with VK_PIPELINE_CREATE_DEFER_COMPILE_BIT_NVX.</li>
            <li>{@code shader} <b>must</b> not have been called as a deferred compile before.</li>
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

        VkDevice.IN("device", "the logical device that contains the raytracing pipeline."),
        VkPipeline.IN("pipeline", "the raytracing pipeline object that contains the shaders."),
        uint32_t.IN("shader", "the index of the shader to compile.")
    )
}