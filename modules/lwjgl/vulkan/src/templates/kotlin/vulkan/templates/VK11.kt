/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val VK11 = "VK11".nativeClass(Module.VULKAN, "VK11", prefix = "VK", binding = VK_BINDING_INSTANCE) {
    extends = VK10
    documentation =
        """
        The core Vulkan 1.1 functionality.
        """

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_PROPERTIES".."1000094000"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO".."1000157000",
        "STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO".."1000157001"
    )

    EnumConstant(
        "Extends {@code VkImageCreateFlagBits}.",

        "IMAGE_CREATE_ALIAS_BIT".enum(0x00000400)
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_16BIT_STORAGE_FEATURES".."1000083000"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_MEMORY_DEDICATED_REQUIREMENTS".."1000127000",
        "STRUCTURE_TYPE_MEMORY_DEDICATED_ALLOCATE_INFO".."1000127001"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO".."1000060000",
        "STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO".."1000060003",
        "STRUCTURE_TYPE_DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO".."1000060004",
        "STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO".."1000060005",
        "STRUCTURE_TYPE_DEVICE_GROUP_BIND_SPARSE_INFO".."1000060006"
    )

    EnumConstant(
        "Extends {@code VkPipelineCreateFlagBits}.",

        "PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT".enum(0x00000008),
        "PIPELINE_CREATE_DISPATCH_BASE".enum(0x00000010)
    )

    EnumConstant(
        "Extends {@code VkDependencyFlagBits}.",

        "DEPENDENCY_DEVICE_GROUP_BIT".enum(0x00000004)
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO".."1000060013",
        "STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO".."1000060014"
    )

    EnumConstant(
        "Extends {@code VkImageCreateFlagBits}.",

        "IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT".enum(0x00000040)
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_GROUP_PROPERTIES".."1000070000",
        "STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO".."1000070001"
    )

    EnumConstant(
        "Extends {@code VkMemoryHeapFlagBits}.",

        "MEMORY_HEAP_MULTI_INSTANCE_BIT".enum(0x00000002)
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_BUFFER_MEMORY_REQUIREMENTS_INFO_2".."1000146000",
        "STRUCTURE_TYPE_IMAGE_MEMORY_REQUIREMENTS_INFO_2".."1000146001",
        "STRUCTURE_TYPE_IMAGE_SPARSE_MEMORY_REQUIREMENTS_INFO_2".."1000146002",
        "STRUCTURE_TYPE_MEMORY_REQUIREMENTS_2".."1000146003",
        "STRUCTURE_TYPE_SPARSE_IMAGE_MEMORY_REQUIREMENTS_2".."1000146004"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2".."1000059000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PROPERTIES_2".."1000059001",
        "STRUCTURE_TYPE_FORMAT_PROPERTIES_2".."1000059002",
        "STRUCTURE_TYPE_IMAGE_FORMAT_PROPERTIES_2".."1000059003",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2".."1000059004",
        "STRUCTURE_TYPE_QUEUE_FAMILY_PROPERTIES_2".."1000059005",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PROPERTIES_2".."1000059006",
        "STRUCTURE_TYPE_SPARSE_IMAGE_FORMAT_PROPERTIES_2".."1000059007",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2".."1000059008"
    )

    EnumConstant(
        "Extends {@code VkResult}.",

        "ERROR_OUT_OF_POOL_MEMORY".."-1000069000"
    )

    EnumConstant(
        "Extends {@code VkFormatFeatureFlagBits}.",

        "FORMAT_FEATURE_TRANSFER_SRC_BIT".enum(0x00004000),
        "FORMAT_FEATURE_TRANSFER_DST_BIT".enum(0x00008000)
    )

    EnumConstant(
        "Extends {@code VkImageCreateFlagBits}.",

        "IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT".enum(0x00000020)
    )

    EnumConstant(
        "Extends {@code VkImageCreateFlagBits}.",

        "IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT".enum(0x00000080),
        "IMAGE_CREATE_EXTENDED_USAGE_BIT".enum(0x00000100)
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_POINT_CLIPPING_PROPERTIES".."1000117000",
        "STRUCTURE_TYPE_RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO".."1000117001",
        "STRUCTURE_TYPE_IMAGE_VIEW_USAGE_CREATE_INFO".."1000117002",
        "STRUCTURE_TYPE_PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO".."1000117003"
    )

    EnumConstant(
        "Extends {@code VkImageLayout}.",

        "IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL".."1000117000",
        "IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL".."1000117001"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_RENDER_PASS_MULTIVIEW_CREATE_INFO".."1000053000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_FEATURES".."1000053001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PROPERTIES".."1000053002"
    )

    EnumConstant(
        "Extends {@code VkDependencyFlagBits}.",

        "DEPENDENCY_VIEW_LOCAL_BIT".enum(0x00000002)
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VARIABLE_POINTER_FEATURES".."1000120000"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PROTECTED_SUBMIT_INFO".."1000145000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PROTECTED_MEMORY_FEATURES".."1000145001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PROTECTED_MEMORY_PROPERTIES".."1000145002",
        "STRUCTURE_TYPE_DEVICE_QUEUE_INFO_2".."1000145003"
    )

    EnumConstant(
        "Extends {@code VkQueueFlagBits}.",

        "QUEUE_PROTECTED_BIT".enum(0x00000010)
    )

    EnumConstant(
        "Extends {@code VkDeviceQueueCreateFlagBits}.",

        "DEVICE_QUEUE_CREATE_PROTECTED_BIT".enum(0x00000001)
    )

    EnumConstant(
        "Extends {@code VkMemoryPropertyFlagBits}.",

        "MEMORY_PROPERTY_PROTECTED_BIT".enum(0x00000020)
    )

    EnumConstant(
        "Extends {@code VkBufferCreateFlagBits}.",

        "BUFFER_CREATE_PROTECTED_BIT".enum(0x00000008)
    )

    EnumConstant(
        "Extends {@code VkImageCreateFlagBits}.",

        "IMAGE_CREATE_PROTECTED_BIT".enum(0x00000800)
    )

    EnumConstant(
        "Extends {@code VkCommandPoolCreateFlagBits}.",

        "COMMAND_POOL_CREATE_PROTECTED_BIT".enum(0x00000004)
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_CREATE_INFO".."1000156000",
        "STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_INFO".."1000156001",
        "STRUCTURE_TYPE_BIND_IMAGE_PLANE_MEMORY_INFO".."1000156002",
        "STRUCTURE_TYPE_IMAGE_PLANE_MEMORY_REQUIREMENTS_INFO".."1000156003",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_YCBCR_CONVERSION_FEATURES".."1000156004",
        "STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_IMAGE_FORMAT_PROPERTIES".."1000156005"
    )

    EnumConstant(
        "Extends {@code VkObjectType}.",

        "OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION".."1000156000"
    )

    EnumConstant(
        "Extends {@code VkFormat}.",

        "FORMAT_G8B8G8R8_422_UNORM".."1000156000",
        "FORMAT_B8G8R8G8_422_UNORM".."1000156001",
        "FORMAT_G8_B8_R8_3PLANE_420_UNORM".."1000156002",
        "FORMAT_G8_B8R8_2PLANE_420_UNORM".."1000156003",
        "FORMAT_G8_B8_R8_3PLANE_422_UNORM".."1000156004",
        "FORMAT_G8_B8R8_2PLANE_422_UNORM".."1000156005",
        "FORMAT_G8_B8_R8_3PLANE_444_UNORM".."1000156006",
        "FORMAT_R10X6_UNORM_PACK16".."1000156007",
        "FORMAT_R10X6G10X6_UNORM_2PACK16".."1000156008",
        "FORMAT_R10X6G10X6B10X6A10X6_UNORM_4PACK16".."1000156009",
        "FORMAT_G10X6B10X6G10X6R10X6_422_UNORM_4PACK16".."1000156010",
        "FORMAT_B10X6G10X6R10X6G10X6_422_UNORM_4PACK16".."1000156011",
        "FORMAT_G10X6_B10X6_R10X6_3PLANE_420_UNORM_3PACK16".."1000156012",
        "FORMAT_G10X6_B10X6R10X6_2PLANE_420_UNORM_3PACK16".."1000156013",
        "FORMAT_G10X6_B10X6_R10X6_3PLANE_422_UNORM_3PACK16".."1000156014",
        "FORMAT_G10X6_B10X6R10X6_2PLANE_422_UNORM_3PACK16".."1000156015",
        "FORMAT_G10X6_B10X6_R10X6_3PLANE_444_UNORM_3PACK16".."1000156016",
        "FORMAT_R12X4_UNORM_PACK16".."1000156017",
        "FORMAT_R12X4G12X4_UNORM_2PACK16".."1000156018",
        "FORMAT_R12X4G12X4B12X4A12X4_UNORM_4PACK16".."1000156019",
        "FORMAT_G12X4B12X4G12X4R12X4_422_UNORM_4PACK16".."1000156020",
        "FORMAT_B12X4G12X4R12X4G12X4_422_UNORM_4PACK16".."1000156021",
        "FORMAT_G12X4_B12X4_R12X4_3PLANE_420_UNORM_3PACK16".."1000156022",
        "FORMAT_G12X4_B12X4R12X4_2PLANE_420_UNORM_3PACK16".."1000156023",
        "FORMAT_G12X4_B12X4_R12X4_3PLANE_422_UNORM_3PACK16".."1000156024",
        "FORMAT_G12X4_B12X4R12X4_2PLANE_422_UNORM_3PACK16".."1000156025",
        "FORMAT_G12X4_B12X4_R12X4_3PLANE_444_UNORM_3PACK16".."1000156026",
        "FORMAT_G16B16G16R16_422_UNORM".."1000156027",
        "FORMAT_B16G16R16G16_422_UNORM".."1000156028",
        "FORMAT_G16_B16_R16_3PLANE_420_UNORM".."1000156029",
        "FORMAT_G16_B16R16_2PLANE_420_UNORM".."1000156030",
        "FORMAT_G16_B16_R16_3PLANE_422_UNORM".."1000156031",
        "FORMAT_G16_B16R16_2PLANE_422_UNORM".."1000156032",
        "FORMAT_G16_B16_R16_3PLANE_444_UNORM".."1000156033"
    )

    EnumConstant(
        "Extends {@code VkImageAspectFlagBits}.",

        "IMAGE_ASPECT_PLANE_0_BIT".enum(0x00000010),
        "IMAGE_ASPECT_PLANE_1_BIT".enum(0x00000020),
        "IMAGE_ASPECT_PLANE_2_BIT".enum(0x00000040)
    )

    EnumConstant(
        "Extends {@code VkImageCreateFlagBits}.",

        "IMAGE_CREATE_DISJOINT_BIT".enum(0x00000200)
    )

    EnumConstant(
        "Extends {@code VkFormatFeatureFlagBits}.",

        "FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT".enum(0x00020000),
        "FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT".enum(0x00040000),
        "FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT".enum(0x00080000),
        "FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT".enum(0x00100000),
        "FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT".enum(0x00200000),
        "FORMAT_FEATURE_DISJOINT_BIT".enum(0x00400000),
        "FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT".enum(0x00800000)
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO".."1000085000"
    )

    EnumConstant(
        "Extends {@code VkObjectType}.",

        "OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE".."1000085000"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_IMAGE_FORMAT_INFO".."1000071000",
        "STRUCTURE_TYPE_EXTERNAL_IMAGE_FORMAT_PROPERTIES".."1000071001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO".."1000071002",
        "STRUCTURE_TYPE_EXTERNAL_BUFFER_PROPERTIES".."1000071003",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES".."1000071004"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_EXTERNAL_MEMORY_BUFFER_CREATE_INFO".."1000072000",
        "STRUCTURE_TYPE_EXTERNAL_MEMORY_IMAGE_CREATE_INFO".."1000072001",
        "STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO".."1000072002"
    )

    EnumConstant(
        "Extends {@code VkResult}.",

        "ERROR_INVALID_EXTERNAL_HANDLE".."-1000072003"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FENCE_INFO".."1000112000",
        "STRUCTURE_TYPE_EXTERNAL_FENCE_PROPERTIES".."1000112001"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_EXPORT_FENCE_CREATE_INFO".."1000113000"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_EXPORT_SEMAPHORE_CREATE_INFO".."1000077000"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_SEMAPHORE_INFO".."1000076000",
        "STRUCTURE_TYPE_EXTERNAL_SEMAPHORE_PROPERTIES".."1000076001"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES".."1000168000",
        "STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_SUPPORT".."1000168001"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DRAW_PARAMETER_FEATURES".."1000063000"
    )

    EnumConstant(
        """
        VkSubgroupFeatureFlagBits - Enum describing what subgroup operations are supported

        <h5>Description</h5>
        <ul>
            <li>#SUBGROUP_FEATURE_BASIC_BIT specifies the device will accept SPIR-V shader modules that contain the {@code GroupNonUniform} capability.</li>
            <li>#SUBGROUP_FEATURE_VOTE_BIT specifies the device will accept SPIR-V shader modules that contain the {@code GroupNonUniformVote} capability.</li>
            <li>#SUBGROUP_FEATURE_ARITHMETIC_BIT specifies the device will accept SPIR-V shader modules that contain the {@code GroupNonUniformArithmetic} capability.</li>
            <li>#SUBGROUP_FEATURE_BALLOT_BIT specifies the device will accept SPIR-V shader modules that contain the {@code GroupNonUniformBallot} capability.</li>
            <li>#SUBGROUP_FEATURE_SHUFFLE_BIT specifies the device will accept SPIR-V shader modules that contain the {@code GroupNonUniformShuffle} capability.</li>
            <li>#SUBGROUP_FEATURE_SHUFFLE_RELATIVE_BIT specifies the device will accept SPIR-V shader modules that contain the {@code GroupNonUniformShuffleRelative} capability.</li>
            <li>#SUBGROUP_FEATURE_CLUSTERED_BIT specifies the device will accept SPIR-V shader modules that contain the {@code GroupNonUniformClustered} capability.</li>
            <li>#SUBGROUP_FEATURE_QUAD_BIT specifies the device will accept SPIR-V shader modules that contain the {@code GroupNonUniformQuad} capability.</li>
            <li>#SUBGROUP_FEATURE_PARTITIONED_BIT_NV specifies the device will accept SPIR-V shader modules that contain the {@code GroupNonUniformPartitionedNV} capability.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkSubgroupFeatureFlags}
        """,

        "SUBGROUP_FEATURE_BASIC_BIT".enum(0x00000001),
        "SUBGROUP_FEATURE_VOTE_BIT".enum(0x00000002),
        "SUBGROUP_FEATURE_ARITHMETIC_BIT".enum(0x00000004),
        "SUBGROUP_FEATURE_BALLOT_BIT".enum(0x00000008),
        "SUBGROUP_FEATURE_SHUFFLE_BIT".enum(0x00000010),
        "SUBGROUP_FEATURE_SHUFFLE_RELATIVE_BIT".enum(0x00000020),
        "SUBGROUP_FEATURE_CLUSTERED_BIT".enum(0x00000040),
        "SUBGROUP_FEATURE_QUAD_BIT".enum(0x00000080)
    )

    EnumConstant(
        """
        VkPeerMemoryFeatureFlagBits - Bitmask specifying supported peer memory features

        <h5>Description</h5>
        <ul>
            <li>#PEER_MEMORY_FEATURE_COPY_SRC_BIT specifies that the memory <b>can</b> be accessed as the source of a ftext:vkCmdCopyBuffer, ftext:vkCmdCopyImage, ftext:vkCmdCopyBufferToImage, or ftext:vkCmdCopyImageToBuffer command.</li>
            <li>#PEER_MEMORY_FEATURE_COPY_DST_BIT specifies that the memory <b>can</b> be accessed as the destination of a ftext:vkCmdCopyBuffer, ftext:vkCmdCopyImage, ftext:vkCmdCopyBufferToImage, or ftext:vkCmdCopyImageToBuffer command.</li>
            <li>#PEER_MEMORY_FEATURE_GENERIC_SRC_BIT specifies that the memory <b>can</b> be read as any memory access type.</li>
            <li>#PEER_MEMORY_FEATURE_GENERIC_DST_BIT specifies that the memory <b>can</b> be written as any memory access type. Shader atomics are considered to be writes.</li>
        </ul>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The peer memory features of a memory heap also apply to any accesses that <b>may</b> be performed during <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#synchronization-image-layout-transitions">image layout transitions</a>.
        </div>

        #PEER_MEMORY_FEATURE_COPY_DST_BIT <b>must</b> be supported for all host local heaps and for at least one device local heap.

        If a device does not support a peer memory feature, it is still valid to use a resource that includes both local and peer memory bindings with the corresponding access type as long as only the local bindings are actually accessed. For example, an application doing split-frame rendering would use framebuffer attachments that include both local and peer memory bindings, but would scissor the rendering to only update local memory.

        <h5>See Also</h5>
        {@code VkPeerMemoryFeatureFlags}
        """,

        "PEER_MEMORY_FEATURE_COPY_SRC_BIT".enum(0x00000001),
        "PEER_MEMORY_FEATURE_COPY_DST_BIT".enum(0x00000002),
        "PEER_MEMORY_FEATURE_GENERIC_SRC_BIT".enum(0x00000004),
        "PEER_MEMORY_FEATURE_GENERIC_DST_BIT".enum(0x00000008)
    )

    EnumConstant(
        """
        VkMemoryAllocateFlagBits - Bitmask specifying flags for a device memory allocation

        <h5>Description</h5>
        <ul>
            <li>#MEMORY_ALLOCATE_DEVICE_MASK_BIT specifies that memory will be allocated for the devices in ##VkMemoryAllocateFlagsInfo{@code ::deviceMask}.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkMemoryAllocateFlags}
        """,

        "MEMORY_ALLOCATE_DEVICE_MASK_BIT".enum(0x00000001)
    )

    EnumConstant(
        """
        VkPointClippingBehavior - Enum specifying the point clipping behaviour

        <h5>Description</h5>
        <ul>
            <li>#POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES specifies that the primitive is discarded if the vertex lies outside any clip plane, including the planes bounding the view volume.</li>
            <li>#POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY specifies that the primitive is discarded only if the vertex lies outside any user clip plane.</li>
        </ul>

        <h5>See Also</h5>
        ##VkPhysicalDevicePointClippingProperties
        """,

        "POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES".."0",
        "POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY".."1"
    )

    EnumConstant(
        """
        VkTessellationDomainOrigin - Enum describing tessellation domain origin

        <h5>Description</h5>
        <ul>
            <li>#TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT specifies that the origin of the domain space is in the upper left corner, as shown in figure <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#img-tessellation-topology-ul">Domain parameterization for tessellation primitive modes (upper-left origin)</a>.</li>
            <li>#TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT specifies that the origin of the domain space is in the lower left corner, as shown in figure <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#img-tessellation-topology-ll">Domain parameterization for tessellation primitive modes (lower-left origin)</a>.</li>
        </ul>

        This enum affects how the {@code VertexOrderCw} and {@code VertexOrderCcw} tessellation execution modes are interpreted, since the winding is defined relative to the orientation of the domain.

        <h5>See Also</h5>
        ##VkPipelineTessellationDomainOriginStateCreateInfo
        """,

        "TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT".."0",
        "TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT".."1"
    )

    EnumConstant(
        """
        VkSamplerYcbcrModelConversion - Color model component of a color space

        <h5>Description</h5>
        <ul>
            <li>#SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY specifies that the input values to the conversion are unmodified.</li>
            <li>#SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY specifies no model conversion but the inputs are range expanded as for Y&#8217;C<sub>B</sub>C<sub>R</sub>.</li>
            <li>#SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_709 specifies the color model conversion from Y&#8217;C<sub>B</sub>C<sub>R</sub> to R&#8217;G&#8217;B' defined in BT.709 and described in the “BT.709 Y’C<sub>B</sub>C<sub>R</sub> conversion” section of the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#data-format">Khronos Data Format Specification</a>.</li>
            <li>#SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_601 specifies the color model conversion from Y&#8217;C<sub>B</sub>C<sub>R</sub> to R&#8217;G&#8217;B' defined in BT.601 and described in the “BT.601 Y’C<sub>B</sub>C<sub>R</sub> conversion” section of the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#data-format">Khronos Data Format Specification</a>.</li>
            <li>#SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_2020 specifies the color model conversion from Y&#8217;C<sub>B</sub>C<sub>R</sub> to R&#8217;G&#8217;B' defined in BT.2020 and described in the “BT.2020 Y’C<sub>B</sub>C<sub>R</sub> conversion” section of the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#data-format">Khronos Data Format Specification</a>.</li>
        </ul>

        In the {@code VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_*} color models, for the input to the sampler Y'C<sub>B</sub>C<sub>R</sub> range expansion and model conversion:

        <ul>
            <li>the Y (Y' luma) channel corresponds to the G channel of an RGB image.</li>
            <li>the CB (C<sub>B</sub> or “U” blue color difference) channel corresponds to the B channel of an RGB image.</li>
            <li>the CR (C<sub>R</sub> or “V” red color difference) channel corresponds to the R channel of an RGB image.</li>
            <li>the alpha channel, if present, is not modified by color model conversion.</li>
        </ul>

        These rules reflect the mapping of channels after the channel swizzle operation (controlled by ##VkSamplerYcbcrConversionCreateInfo{@code ::components}).

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        For example, an "{@code YUVA}" 32-bit format comprising four 8-bit channels can be implemented as #FORMAT_R8G8B8A8_UNORM with a component mapping:

        <ul>
            <li>{@code components.a} = #COMPONENT_SWIZZLE_IDENTITY</li>
            <li>{@code components.r} = #COMPONENT_SWIZZLE_B</li>
            <li>{@code components.g} = #COMPONENT_SWIZZLE_R</li>
            <li>{@code components.b} = #COMPONENT_SWIZZLE_G</li>
        </ul>
        </div>

        <h5>See Also</h5>
        ##VkSamplerYcbcrConversionCreateInfo
        """,

        "SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY".."0",
        "SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY".."1",
        "SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_709".."2",
        "SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_601".."3",
        "SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_2020".."4"
    )

    EnumConstant(
        """
        VkSamplerYcbcrRange - Range of encoded values in a color space

        <h5>Description</h5>
        <ul>
            <li>#SAMPLER_YCBCR_RANGE_ITU_FULL specifies that the full range of the encoded values are valid and interpreted according to the ITU “full range” quantization rules.</li>
            <li>#SAMPLER_YCBCR_RANGE_ITU_NARROW specifies that headroom and foot room are reserved in the numerical range of encoded values, and the remaining values are expanded according to the ITU “narrow range” quantization rules.</li>
        </ul>

        The formulae for these conversions is described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#textures-sampler-YCbCr-conversion-rangeexpand">Sampler Y'C<sub>B</sub>C<sub>R</sub> Range Expansion</a> section of the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#textures">Image Operations</a> chapter.

        No range modification takes place if {@code ycbcrModel} is #SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY; the {@code ycbcrRange} field of ##VkSamplerYcbcrConversionCreateInfo is ignored in this case.

        <h5>See Also</h5>
        ##VkSamplerYcbcrConversionCreateInfo
        """,

        "SAMPLER_YCBCR_RANGE_ITU_FULL".."0",
        "SAMPLER_YCBCR_RANGE_ITU_NARROW".."1"
    )

    EnumConstant(
        """
        VkChromaLocation - Position of downsampled chroma samples

        <h5>Description</h5>
        <ul>
            <li>#CHROMA_LOCATION_COSITED_EVEN specifies that downsampled chroma samples are aligned with luma samples with even coordinates.</li>
            <li>#CHROMA_LOCATION_MIDPOINT specifies that downsampled chroma samples are located half way between each even luma sample and the nearest higher odd luma sample.</li>
        </ul>

        <h5>See Also</h5>
        ##VkSamplerYcbcrConversionCreateInfo
        """,

        "CHROMA_LOCATION_COSITED_EVEN".."0",
        "CHROMA_LOCATION_MIDPOINT".."1"
    )

    EnumConstant(
        """
        VkDescriptorUpdateTemplateType - Indicates the valid usage of the descriptor update template

        <h5>Description</h5>
        <ul>
            <li>#DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET specifies that the descriptor update template will be used for descriptor set updates only.</li>
            <li>#DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR specifies that the descriptor update template will be used for push descriptor updates only.</li>
        </ul>

        <h5>See Also</h5>
        ##VkDescriptorUpdateTemplateCreateInfo
        """,

        "DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET".."0"
    )

    EnumConstant(
        """
        VkExternalMemoryHandleTypeFlagBits - Bit specifying external memory handle types

        <h5>Description</h5>
        <ul>
            <li>#EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT specifies a POSIX file descriptor handle that has only limited valid usage outside of Vulkan and other compatible APIs. It <b>must</b> be compatible with the POSIX system calls ftext:dup, ftext:dup2, ftext:close, and the non-standard system call ftext:dup3. Additionally, it <b>must</b> be transportable over a socket using an {@code SCM_RIGHTS} control message. It owns a reference to the underlying memory resource represented by its Vulkan memory object.</li>
            <li>#EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT specifies an NT handle that has only limited valid usage outside of Vulkan and other compatible APIs. It <b>must</b> be compatible with the functions ftext:DuplicateHandle, ftext:CloseHandle, ftext:CompareObjectHandles, ftext:GetHandleInformation, and ftext:SetHandleInformation. It owns a reference to the underlying memory resource represented by its Vulkan memory object.</li>
            <li>#EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT specifies a global share handle that has only limited valid usage outside of Vulkan and other compatible APIs. It is not compatible with any native APIs. It does not own a reference to the underlying memory resource represented its Vulkan memory object, and will therefore become invalid when all Vulkan memory objects associated with it are destroyed.</li>
            <li>#EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT specifies an NT handle returned by {@code IDXGIResource1}::{@code CreateSharedHandle} referring to a Direct3D 10 or 11 texture resource. It owns a reference to the memory used by the Direct3D resource.</li>
            <li>#EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT specifies a global share handle returned by {@code IDXGIResource}::{@code GetSharedHandle} referring to a Direct3D 10 or 11 texture resource. It does not own a reference to the underlying Direct3D resource, and will therefore become invalid when all Vulkan memory objects and Direct3D resources associated with it are destroyed.</li>
            <li>#EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT specifies an NT handle returned by {@code ID3D12Device}::{@code CreateSharedHandle} referring to a Direct3D 12 heap resource. It owns a reference to the resources used by the Direct3D heap.</li>
            <li>#EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT specifies an NT handle returned by {@code ID3D12Device}::{@code CreateSharedHandle} referring to a Direct3D 12 committed resource. It owns a reference to the memory used by the Direct3D resource.</li>
            <li>#EXTERNAL_MEMORY_HANDLE_TYPE_HOST_ALLOCATION_BIT_EXT specifies a host pointer returned by a host memory allocation command. It does not own a reference to the underlying memory resource, and will therefore become invalid if the host memory is freed.</li>
            <li>#EXTERNAL_MEMORY_HANDLE_TYPE_HOST_MAPPED_FOREIGN_MEMORY_BIT_EXT specifies a host pointer to <em>host mapped foreign memory</em>. It does not own a reference to the underlying memory resource, and will therefore become invalid if the foreign memory is unmapped or otherwise becomes no longer available.</li>
            <li>#EXTERNAL_MEMORY_HANDLE_TYPE_DMA_BUF_BIT_EXT is a file descriptor for a Linux dma_buf. It owns a reference to the underlying memory resource represented by its Vulkan memory object.</li>
        </ul>

        

        Some external memory handle types can only be shared within the same underlying physical device and/or the same driver version, as defined in the following table:

        <h6>External memory handle types compatibility</h6>
        <table class="lwjgl">
            <tbody>
                <tr><td>Handle type</td><td>##VkPhysicalDeviceIDProperties{@code ::driverUUID}</td><td>##VkPhysicalDeviceIDProperties{@code ::deviceUUID}</td></tr>
                <tr><td>#EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT</td><td>Must match</td><td>Must match</td></tr>
                <tr><td>#EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT</td><td>Must match</td><td>Must match</td></tr>
                <tr><td>#EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT</td><td>Must match</td><td>Must match</td></tr>
                <tr><td>#EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT</td><td>Must match</td><td>Must match</td></tr>
                <tr><td>#EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT</td><td>Must match</td><td>Must match</td></tr>
                <tr><td>#EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT</td><td>Must match</td><td>Must match</td></tr>
                <tr><td>#EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT</td><td>Must match</td><td>Must match</td></tr>
                <tr><td>#EXTERNAL_MEMORY_HANDLE_TYPE_HOST_ALLOCATION_BIT_EXT</td><td>No restriction</td><td>No restriction</td></tr>
                <tr><td>#EXTERNAL_MEMORY_HANDLE_TYPE_HOST_MAPPED_FOREIGN_MEMORY_BIT_EXT</td><td>No restriction</td><td>No restriction</td></tr>
                <tr><td>#EXTERNAL_MEMORY_HANDLE_TYPE_DMA_BUF_BIT_EXT</td><td>No restriction</td><td>No restriction</td></tr>
            </tbody>
        </table>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The above table does not restrict the drivers and devices with which #EXTERNAL_MEMORY_HANDLE_TYPE_HOST_ALLOCATION_BIT_EXT and #EXTERNAL_MEMORY_HANDLE_TYPE_HOST_MAPPED_FOREIGN_MEMORY_BIT_EXT <b>may</b> be shared, as these handle types inherently mean memory that does not come from the same device, as they import memory from the host or a foreign device, respectively.
        </div>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Even though the above table does not restrict the drivers and devices with which #EXTERNAL_MEMORY_HANDLE_TYPE_DMA_BUF_BIT_EXT <b>may</b> be shared, query mechanisms exist in the Vulkan API that prevent the import of incompatible dma-bufs (such as #GetMemoryFdPropertiesKHR()) and that prevent incompatible usage of dma-bufs (such as ##VkPhysicalDeviceExternalBufferInfoKHR and ##VkPhysicalDeviceExternalImageFormatInfoKHR).
        </div>

        <h5>See Also</h5>
        {@code VkExternalMemoryHandleTypeFlags}, ##VkImportMemoryFdInfoKHR, ##VkImportMemoryHostPointerInfoEXT, ##VkImportMemoryWin32HandleInfoKHR, ##VkMemoryGetFdInfoKHR, ##VkMemoryGetWin32HandleInfoKHR, ##VkPhysicalDeviceExternalBufferInfo, ##VkPhysicalDeviceExternalImageFormatInfo, #GetMemoryFdPropertiesKHR(), #GetMemoryHostPointerPropertiesEXT(), #GetMemoryWin32HandlePropertiesKHR()
        """,

        "EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT".enum(0x00000001),
        "EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT".enum(0x00000002),
        "EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT".enum(0x00000004),
        "EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT".enum(0x00000008),
        "EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT".enum(0x00000010),
        "EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT".enum(0x00000020),
        "EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT".enum(0x00000040)
    )

    EnumConstant(
        """
        VkExternalMemoryFeatureFlagBits - Bitmask specifying features of an external memory handle type

        <h5>Description</h5>
        <ul>
            <li>#EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT specifies that images or buffers created with the specified parameters and handle type <b>must</b> use the mechanisms defined in the {@link NVDedicatedAllocation VK_NV_dedicated_allocation} extension to create (or import) a dedicated allocation for the image or buffer.</li>
            <li>#EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT specifies that handles of this type <b>can</b> be exported from Vulkan memory objects.</li>
            <li>#EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT specifies that handles of this type <b>can</b> be imported as Vulkan memory objects.</li>
        </ul>

        Because their semantics in external APIs roughly align with that of an image or buffer with a dedicated allocation in Vulkan, implementations are required: to report #EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT for the following external handle types:

        <ul>
            <li>#EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT</li>
            <li>#EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT</li>
            <li>#EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT</li>
        </ul>

        <h5>See Also</h5>
        {@code VkExternalMemoryFeatureFlags}
        """,

        "EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT".enum(0x00000001),
        "EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT".enum(0x00000002),
        "EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT".enum(0x00000004)
    )

    EnumConstant(
        """
        VkExternalFenceHandleTypeFlagBits - Bitmask of valid external fence handle types

        <h5>Description</h5>
        <ul>
            <li>#EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT specifies a POSIX file descriptor handle that has only limited valid usage outside of Vulkan and other compatible APIs. It <b>must</b> be compatible with the POSIX system calls {@code dup}, {@code dup2}, {@code close}, and the non-standard system call {@code dup3}. Additionally, it <b>must</b> be transportable over a socket using an {@code SCM_RIGHTS} control message. It owns a reference to the underlying synchronization primitive represented by its Vulkan fence object.</li>
            <li>#EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT specifies an NT handle that has only limited valid usage outside of Vulkan and other compatible APIs. It <b>must</b> be compatible with the functions {@code DuplicateHandle}, {@code CloseHandle}, {@code CompareObjectHandles}, {@code GetHandleInformation}, and {@code SetHandleInformation}. It owns a reference to the underlying synchronization primitive represented by its Vulkan fence object.</li>
            <li>#EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT specifies a global share handle that has only limited valid usage outside of Vulkan and other compatible APIs. It is not compatible with any native APIs. It does not own a reference to the underlying synchronization primitive represented by its Vulkan fence object, and will therefore become invalid when all Vulkan fence objects associated with it are destroyed.</li>
            <li>#EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT specifies a POSIX file descriptor handle to a Linux Sync File or Android Fence. It can be used with any native API accepting a valid sync file or fence as input. It owns a reference to the underlying synchronization primitive associated with the file descriptor. Implementations which support importing this handle type <b>must</b> accept any type of sync or fence FD supported by the native system they are running on.</li>
        </ul>

        

        Some external fence handle types can only be shared within the same underlying physical device and/or the same driver version, as defined in the following table:

        <h6>External fence handle types compatibility</h6>
        <table class="lwjgl">
            <tbody>
                <tr><td>Handle type</td><td>##VkPhysicalDeviceIDProperties{@code ::driverUUID}</td><td>##VkPhysicalDeviceIDProperties{@code ::deviceUUID}</td></tr>
                <tr><td>#EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT</td><td>Must match</td><td>Must match</td></tr>
                <tr><td>#EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT</td><td>Must match</td><td>Must match</td></tr>
                <tr><td>#EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT</td><td>Must match</td><td>Must match</td></tr>
                <tr><td>#EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT</td><td>No restriction</td><td>No restriction</td></tr>
            </tbody>
        </table>

        <h5>See Also</h5>
        {@code VkExternalFenceHandleTypeFlags}, ##VkFenceGetFdInfoKHR, ##VkFenceGetWin32HandleInfoKHR, ##VkImportFenceFdInfoKHR, ##VkImportFenceWin32HandleInfoKHR, ##VkPhysicalDeviceExternalFenceInfo
        """,

        "EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT".enum(0x00000001),
        "EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT".enum(0x00000002),
        "EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT".enum(0x00000004),
        "EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT".enum(0x00000008)
    )

    EnumConstant(
        """
        VkExternalFenceFeatureFlagBits - Bitfield describing features of an external fence handle type

        <h5>Description</h5>
        <ul>
            <li>#EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT specifies handles of this type <b>can</b> be exported from Vulkan fence objects.</li>
            <li>#EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT specifies handles of this type <b>can</b> be imported to Vulkan fence objects.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkExternalFenceFeatureFlags}
        """,

        "EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT".enum(0x00000001),
        "EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT".enum(0x00000002)
    )

    EnumConstant(
        """
        VkFenceImportFlagBits - Bitmask specifying additional parameters of fence payload import

        <h5>Description</h5>
        <ul>
            <li>#FENCE_IMPORT_TEMPORARY_BIT specifies that the fence payload will be imported only temporarily, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#synchronization-fences-importing">Importing Fence Payloads</a>, regardless of the permanence of {@code handleType}.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkFenceImportFlags}
        """,

        "FENCE_IMPORT_TEMPORARY_BIT".enum(0x00000001)
    )

    EnumConstant(
        """
        VkSemaphoreImportFlagBits - Bitmask specifying additional parameters of semaphore payload import

        <h5>Description</h5>
        These bits have the following meanings:

        <ul>
            <li>#SEMAPHORE_IMPORT_TEMPORARY_BIT specifies that the semaphore payload will be imported only temporarily, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#synchronization-semaphores-importing">Importing Semaphore Payloads</a>, regardless of the permanence of {@code handleType}.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkSemaphoreImportFlags}
        """,

        "SEMAPHORE_IMPORT_TEMPORARY_BIT".enum(0x00000001)
    )

    EnumConstant(
        """
        VkExternalSemaphoreHandleTypeFlagBits - Bitmask of valid external semaphore handle types

        <h5>Description</h5>
        <ul>
            <li>#EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT specifies a POSIX file descriptor handle that has only limited valid usage outside of Vulkan and other compatible APIs. It <b>must</b> be compatible with the POSIX system calls {@code dup}, {@code dup2}, {@code close}, and the non-standard system call {@code dup3}. Additionally, it <b>must</b> be transportable over a socket using an {@code SCM_RIGHTS} control message. It owns a reference to the underlying synchronization primitive represented by its Vulkan semaphore object.</li>
            <li>#EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT specifies an NT handle that has only limited valid usage outside of Vulkan and other compatible APIs. It <b>must</b> be compatible with the functions {@code DuplicateHandle}, {@code CloseHandle}, {@code CompareObjectHandles}, {@code GetHandleInformation}, and {@code SetHandleInformation}. It owns a reference to the underlying synchronization primitive represented by its Vulkan semaphore object.</li>
            <li>#EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT specifies a global share handle that has only limited valid usage outside of Vulkan and other compatible APIs. It is not compatible with any native APIs. It does not own a reference to the underlying synchronization primitive represented its Vulkan semaphore object, and will therefore become invalid when all Vulkan semaphore objects associated with it are destroyed.</li>
            <li>#EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT specifies an NT handle returned by {@code ID3D12Device}::{@code CreateSharedHandle} referring to a Direct3D 12 fence. It owns a reference to the underlying synchronization primitive associated with the Direct3D fence.</li>
            <li>#EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT specifies a POSIX file descriptor handle to a Linux Sync File or Android Fence object. It can be used with any native API accepting a valid sync file or fence as input. It owns a reference to the underlying synchronization primitive associated with the file descriptor. Implementations which support importing this handle type <b>must</b> accept any type of sync or fence FD supported by the native system they are running on.</li>
        </ul>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Handles of type #EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT generated by the implementation may represent either Linux Sync Files or Android Fences at the implementation's discretion. Applications <b>should</b> only use operations defined for both types of file descriptors, unless they know via means external to Vulkan the type of the file descriptor, or are prepared to deal with the system-defined operation failures resulting from using the wrong type.
        </div>

        

        Some external semaphore handle types can only be shared within the same underlying physical device and/or the same driver version, as defined in the following table:

        <h6>External semaphore handle types compatibility</h6>
        <table class="lwjgl">
            <tbody>
                <tr><td>Handle type</td><td>##VkPhysicalDeviceIDProperties{@code ::driverUUID}</td><td>##VkPhysicalDeviceIDProperties{@code ::deviceUUID}</td></tr>
                <tr><td>#EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT</td><td>Must match</td><td>Must match</td></tr>
                <tr><td>#EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT</td><td>Must match</td><td>Must match</td></tr>
                <tr><td>#EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT</td><td>Must match</td><td>Must match</td></tr>
                <tr><td>#EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT</td><td>Must match</td><td>Must match</td></tr>
                <tr><td>#EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT</td><td>No restriction</td><td>No restriction</td></tr>
            </tbody>
        </table>

        <h5>See Also</h5>
        {@code VkExternalSemaphoreHandleTypeFlags}, ##VkImportSemaphoreFdInfoKHR, ##VkImportSemaphoreWin32HandleInfoKHR, ##VkPhysicalDeviceExternalSemaphoreInfo, ##VkSemaphoreGetFdInfoKHR, ##VkSemaphoreGetWin32HandleInfoKHR
        """,

        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT".enum(0x00000001),
        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT".enum(0x00000002),
        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT".enum(0x00000004),
        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT".enum(0x00000008),
        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT".enum(0x00000010)
    )

    EnumConstant(
        """
        VkExternalSemaphoreFeatureFlagBits - Bitfield describing features of an external semaphore handle type

        <h5>Description</h5>
        <ul>
            <li>#EXTERNAL_SEMAPHORE_FEATURE_EXPORTABLE_BIT specifies that handles of this type <b>can</b> be exported from Vulkan semaphore objects.</li>
            <li>#EXTERNAL_SEMAPHORE_FEATURE_IMPORTABLE_BIT specifies that handles of this type <b>can</b> be imported as Vulkan semaphore objects.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkExternalSemaphoreFeatureFlags}
        """,

        "EXTERNAL_SEMAPHORE_FEATURE_EXPORTABLE_BIT".enum(0x00000001),
        "EXTERNAL_SEMAPHORE_FEATURE_IMPORTABLE_BIT".enum(0x00000002)
    )

    // Device Initialization

    GlobalCommand..VkResult(
        "EnumerateInstanceVersion",
        """
        Query instance-level version before instance creation.

        <h5>C Specification</h5>
        The version of Vulkan that is supported by an instance <b>may</b> be different than the version of Vulkan supported by a device or physical device. To query properties that <b>can</b> be used in creating an instance, call:

        <pre><code>
￿VkResult vkEnumerateInstanceVersion(
￿    uint32_t*                                   pApiVersion);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code pApiVersion} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>
        </dl>
        """,

        Check(1)..uint32_t.p.OUT("pApiVersion", "points to a {@code uint32_t}, which is the version of Vulkan supported by instance-level functionality, encoded as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#fundamentals-versionnum\">API Version Numbers and Semantics</a> section.")
    )

    // Promoted from VK_KHR_bind_memory2

    VkResult(
        "BindBufferMemory2",
        """
        Bind device memory to buffer objects.

        <h5>C Specification</h5>
        To attach memory to buffer objects for one or more buffers at a time, call:

        <pre><code>
￿VkResult vkBindBufferMemory2(
￿    VkDevice                                    device,
￿    uint32_t                                    bindInfoCount,
￿    const VkBindBufferMemoryInfo*               pBindInfos);</code></pre>

        or the equivalent command

        <pre><code>
￿VkResult vkBindBufferMemory2KHR(
￿    VkDevice                                    device,
￿    uint32_t                                    bindInfoCount,
￿    const VkBindBufferMemoryInfo*               pBindInfos);</code></pre>

        <h5>Description</h5>
        On some implementations, it <b>may</b> be more efficient to batch memory bindings into a single command.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pBindInfos} <b>must</b> be a valid pointer to an array of {@code bindInfoCount} valid ##VkBindBufferMemoryInfo structures</li>
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
        ##VkBindBufferMemoryInfo
        """,

        VkDevice.IN("device", "the logical device that owns the buffers and memory."),
        AutoSize("pBindInfos")..uint32_t.IN("bindInfoCount", "the number of elements in {@code pBindInfos}."),
        VkBindBufferMemoryInfo.const.p.IN("pBindInfos", "a pointer to an array of structures of type ##VkBindBufferMemoryInfo, describing buffers and memory to bind.")
    )

    VkResult(
        "BindImageMemory2",
        """
        Bind device memory to image objects.

        <h5>C Specification</h5>
        To attach memory to image objects for one or more images at a time, call:

        <pre><code>
￿VkResult vkBindImageMemory2(
￿    VkDevice                                    device,
￿    uint32_t                                    bindInfoCount,
￿    const VkBindImageMemoryInfo*                pBindInfos);</code></pre>

        or the equivalent command

        <pre><code>
￿VkResult vkBindImageMemory2KHR(
￿    VkDevice                                    device,
￿    uint32_t                                    bindInfoCount,
￿    const VkBindImageMemoryInfo*                pBindInfos);</code></pre>

        <h5>Description</h5>
        On some implementations, it <b>may</b> be more efficient to batch memory bindings into a single command.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pBindInfos} <b>must</b> be a valid pointer to an array of {@code bindInfoCount} valid ##VkBindImageMemoryInfo structures</li>
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
        ##VkBindImageMemoryInfo
        """,

        VkDevice.IN("device", "the logical device that owns the images and memory."),
        AutoSize("pBindInfos")..uint32_t.IN("bindInfoCount", "the number of elements in {@code pBindInfos}."),
        VkBindImageMemoryInfo.const.p.IN("pBindInfos", "a pointer to an array of structures of type ##VkBindImageMemoryInfo, describing images and memory to bind.")
    )

    // Promoted from VK_KHR_device_group

    void(
        "GetDeviceGroupPeerMemoryFeatures",
        """
        Query supported peer memory features of a device.

        <h5>C Specification</h5>
        <em>Peer memory</em> is memory that is allocated for a given physical device and then bound to a resource and accessed by a different physical device, in a logical device that represents multiple physical devices. Some ways of reading and writing peer memory <b>may</b> not be supported by a device.

        To determine how peer memory <b>can</b> be accessed, call:

        <pre><code>
￿void vkGetDeviceGroupPeerMemoryFeatures(
￿    VkDevice                                    device,
￿    uint32_t                                    heapIndex,
￿    uint32_t                                    localDeviceIndex,
￿    uint32_t                                    remoteDeviceIndex,
￿    VkPeerMemoryFeatureFlags*                   pPeerMemoryFeatures);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkGetDeviceGroupPeerMemoryFeaturesKHR(
￿    VkDevice                                    device,
￿    uint32_t                                    heapIndex,
￿    uint32_t                                    localDeviceIndex,
￿    uint32_t                                    remoteDeviceIndex,
￿    VkPeerMemoryFeatureFlags*                   pPeerMemoryFeatures);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code heapIndex} <b>must</b> be less than {@code memoryHeapCount}</li>
            <li>{@code localDeviceIndex} <b>must</b> be a valid device index</li>
            <li>{@code remoteDeviceIndex} <b>must</b> be a valid device index</li>
            <li>{@code localDeviceIndex} <b>must</b> not equal remoteDeviceIndex</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pPeerMemoryFeatures} <b>must</b> be a valid pointer to a {@code VkPeerMemoryFeatureFlags} value</li>
            <li>{@code pPeerMemoryFeatures} <b>must</b> not be 0</li>
        </ul>
        """,

        VkDevice.IN("device", "the logical device that owns the memory."),
        uint32_t.IN("heapIndex", "the index of the memory heap from which the memory is allocated."),
        uint32_t.IN("localDeviceIndex", "the device index of the physical device that performs the memory access."),
        uint32_t.IN("remoteDeviceIndex", "the device index of the physical device that the memory is allocated for."),
        Check(1)..VkPeerMemoryFeatureFlags.p.OUT("pPeerMemoryFeatures", "a pointer to a bitmask of {@code VkPeerMemoryFeatureFlagBits} indicating which types of memory accesses are supported for the combination of heap, local, and remote devices.")
    )

    void(
        "CmdSetDeviceMask",
        """
        Modify device mask of a command buffer.

        <h5>C Specification</h5>
        To update the current device mask of a command buffer, call:

        <pre><code>
￿void vkCmdSetDeviceMask(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    deviceMask);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkCmdSetDeviceMaskKHR(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    deviceMask);</code></pre>

        <h5>Description</h5>
        {@code deviceMask} is used to filter out subsequent commands from executing on all physical devices whose bit indices are not set in the mask.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code deviceMask} <b>must</b> be a valid device mask value</li>
            <li>{@code deviceMask} <b>must</b> not be zero</li>
            <li>{@code deviceMask} <b>must</b> not include any set bits that were not in the ##VkDeviceGroupCommandBufferBeginInfo{@code ::deviceMask} value when the command buffer began recording.</li>
            <li>If #CmdSetDeviceMask() is called inside a render pass instance, {@code deviceMask} <b>must</b> not include any set bits that were not in the ##VkDeviceGroupRenderPassBeginInfo{@code ::deviceMask} value when the render pass instance began recording.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, compute, or transfer operations</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics Compute Transfer</td><td></td></tr></tbody>
        </table>
        """,

        VkCommandBuffer.IN("commandBuffer", "command buffer whose current device mask is modified."),
        uint32_t.IN("deviceMask", "the new value of the current device mask.")
    )

    void(
        "CmdDispatchBase",
        """
        Dispatch compute work items.

        <h5>C Specification</h5>
        To record a dispatch using non-zero base values for the components of {@code WorkgroupId}, call:

        <pre><code>
￿void vkCmdDispatchBase(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    baseGroupX,
￿    uint32_t                                    baseGroupY,
￿    uint32_t                                    baseGroupZ,
￿    uint32_t                                    groupCountX,
￿    uint32_t                                    groupCountY,
￿    uint32_t                                    groupCountZ);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkCmdDispatchBaseKHR(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    baseGroupX,
￿    uint32_t                                    baseGroupY,
￿    uint32_t                                    baseGroupZ,
￿    uint32_t                                    groupCountX,
￿    uint32_t                                    groupCountY,
￿    uint32_t                                    groupCountZ);</code></pre>

        <h5>Description</h5>
        When the command is executed, a global workgroup consisting of <code>groupCountX × groupCountY × groupCountZ</code> local workgroups is assembled, with {@code WorkgroupId} values ranging from <code>[baseGroup, baseGroup + groupCount)</code> in each component. #CmdDispatch() is equivalent to vkCmdDispatchBase(0,0,0,groupCountX,groupCountY,groupCountZ).

        <h5>Valid Usage</h5>
        <ul>
            <li>All valid usage rules from #CmdDispatch() apply</li>
            <li>{@code baseGroupX} <b>must</b> be less than ##VkPhysicalDeviceLimits{@code ::maxComputeWorkGroupCount}[0]</li>
            <li>{@code baseGroupX} <b>must</b> be less than ##VkPhysicalDeviceLimits{@code ::maxComputeWorkGroupCount}[1]</li>
            <li>{@code baseGroupZ} <b>must</b> be less than ##VkPhysicalDeviceLimits{@code ::maxComputeWorkGroupCount}[2]</li>
            <li>{@code groupCountX} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxComputeWorkGroupCount}[0] minus {@code baseGroupX}</li>
            <li>{@code groupCountY} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxComputeWorkGroupCount}[1] minus {@code baseGroupY}</li>
            <li>{@code groupCountZ} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxComputeWorkGroupCount}[2] minus {@code baseGroupZ}</li>
            <li>If any of {@code baseGroupX}, {@code baseGroupY}, or {@code baseGroupZ} are not zero, then the bound compute pipeline <b>must</b> have been created with the #PIPELINE_CREATE_DISPATCH_BASE flag.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
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
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Compute</td><td></td></tr></tbody>
        </table>
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command will be recorded."),
        uint32_t.IN("baseGroupX", "the start value for the X component of {@code WorkgroupId}."),
        uint32_t.IN("baseGroupY", "the start value for the Y component of {@code WorkgroupId}."),
        uint32_t.IN("baseGroupZ", "the start value for the Z component of {@code WorkgroupId}."),
        uint32_t.IN("groupCountX", "the number of local workgroups to dispatch in the X dimension."),
        uint32_t.IN("groupCountY", "the number of local workgroups to dispatch in the Y dimension."),
        uint32_t.IN("groupCountZ", "the number of local workgroups to dispatch in the Z dimension.")
    )

    // Promoted from VK_KHR_device_group_creation

    VkResult(
        "EnumeratePhysicalDeviceGroups",
        """
        Enumerates groups of physical devices that can be used to create a single logical device.

        <h5>C Specification</h5>
        To retrieve a list of the device groups present in the system, call:

        <pre><code>
￿VkResult vkEnumeratePhysicalDeviceGroups(
￿    VkInstance                                  instance,
￿    uint32_t*                                   pPhysicalDeviceGroupCount,
￿    VkPhysicalDeviceGroupProperties*            pPhysicalDeviceGroupProperties);</code></pre>

        or the equivalent command

        <pre><code>
￿VkResult vkEnumeratePhysicalDeviceGroupsKHR(
￿    VkInstance                                  instance,
￿    uint32_t*                                   pPhysicalDeviceGroupCount,
￿    VkPhysicalDeviceGroupProperties*            pPhysicalDeviceGroupProperties);</code></pre>

        <h5>Description</h5>
        If {@code pPhysicalDeviceGroupProperties} is {@code NULL}, then the number of device groups available is returned in {@code pPhysicalDeviceGroupCount}. Otherwise, {@code pPhysicalDeviceGroupCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pPhysicalDeviceGroupProperties} array, and on return the variable is overwritten with the number of structures actually written to {@code pPhysicalDeviceGroupProperties}. If {@code pPhysicalDeviceGroupCount} is less than the number of device groups available, at most {@code pPhysicalDeviceGroupCount} structures will be written. If {@code pPhysicalDeviceGroupCount} is smaller than the number of device groups available, #INCOMPLETE will be returned instead of #SUCCESS, to indicate that not all the available device groups were returned.

        Every physical device <b>must</b> be in exactly one device group.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
            <li>{@code pPhysicalDeviceGroupCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pPhysicalDeviceGroupCount} is not 0, and {@code pPhysicalDeviceGroupProperties} is not {@code NULL}, {@code pPhysicalDeviceGroupProperties} <b>must</b> be a valid pointer to an array of {@code pPhysicalDeviceGroupCount} ##VkPhysicalDeviceGroupProperties structures</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#INCOMPLETE</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_INITIALIZATION_FAILED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkPhysicalDeviceGroupProperties
        """,

        VkInstance.IN("instance", "a handle to a Vulkan instance previously created with #CreateInstance()."),
        AutoSize("pPhysicalDeviceGroupProperties")..Check(1)..uint32_t.p.INOUT("pPhysicalDeviceGroupCount", "a pointer to an integer related to the number of device groups available or queried, as described below."),
        nullable..VkPhysicalDeviceGroupProperties.p.OUT("pPhysicalDeviceGroupProperties", "either {@code NULL} or a pointer to an array of ##VkPhysicalDeviceGroupProperties structures.")
    )

    // Promoted from VK_KHR_get_memory_requirements2

    void(
        "GetImageMemoryRequirements2",
        """
        Returns the memory requirements for specified Vulkan object.

        <h5>C Specification</h5>
        To determine the memory requirements for an image resource, call:

        <pre><code>
￿void vkGetImageMemoryRequirements2(
￿    VkDevice                                    device,
￿    const VkImageMemoryRequirementsInfo2*       pInfo,
￿    VkMemoryRequirements2*                      pMemoryRequirements);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkGetImageMemoryRequirements2KHR(
￿    VkDevice                                    device,
￿    const VkImageMemoryRequirementsInfo2*       pInfo,
￿    VkMemoryRequirements2*                      pMemoryRequirements);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pInfo} <b>must</b> be a valid pointer to a valid ##VkImageMemoryRequirementsInfo2 structure</li>
            <li>{@code pMemoryRequirements} <b>must</b> be a valid pointer to a ##VkMemoryRequirements2 structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkImageMemoryRequirementsInfo2, ##VkMemoryRequirements2
        """,

        VkDevice.IN("device", "the logical device that owns the image."),
        VkImageMemoryRequirementsInfo2.const.p.IN("pInfo", "a pointer to an instance of the ##VkImageMemoryRequirementsInfo2 structure containing parameters required for the memory requirements query."),
        VkMemoryRequirements2.p.OUT("pMemoryRequirements", "points to an instance of the ##VkMemoryRequirements2 structure in which the memory requirements of the image object are returned.")
    )

    void(
        "GetBufferMemoryRequirements2",
        """
        Returns the memory requirements for specified Vulkan object.

        <h5>C Specification</h5>
        To determine the memory requirements for a buffer resource, call:

        <pre><code>
￿void vkGetBufferMemoryRequirements2(
￿    VkDevice                                    device,
￿    const VkBufferMemoryRequirementsInfo2*      pInfo,
￿    VkMemoryRequirements2*                      pMemoryRequirements);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkGetBufferMemoryRequirements2KHR(
￿    VkDevice                                    device,
￿    const VkBufferMemoryRequirementsInfo2*      pInfo,
￿    VkMemoryRequirements2*                      pMemoryRequirements);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pInfo} <b>must</b> be a valid pointer to a valid ##VkBufferMemoryRequirementsInfo2 structure</li>
            <li>{@code pMemoryRequirements} <b>must</b> be a valid pointer to a ##VkMemoryRequirements2 structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkBufferMemoryRequirementsInfo2, ##VkMemoryRequirements2
        """,

        VkDevice.IN("device", "the logical device that owns the buffer."),
        VkBufferMemoryRequirementsInfo2.const.p.IN("pInfo", "a pointer to an instance of the ##VkBufferMemoryRequirementsInfo2 structure containing parameters required for the memory requirements query."),
        VkMemoryRequirements2.p.OUT("pMemoryRequirements", "points to an instance of the ##VkMemoryRequirements2 structure in which the memory requirements of the buffer object are returned.")
    )

    void(
        "GetImageSparseMemoryRequirements2",
        """
        Query the memory requirements for a sparse image.

        <h5>C Specification</h5>
        To query sparse memory requirements for an image, call:

        <pre><code>
￿void vkGetImageSparseMemoryRequirements2(
￿    VkDevice                                    device,
￿    const VkImageSparseMemoryRequirementsInfo2* pInfo,
￿    uint32_t*                                   pSparseMemoryRequirementCount,
￿    VkSparseImageMemoryRequirements2*           pSparseMemoryRequirements);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkGetImageSparseMemoryRequirements2KHR(
￿    VkDevice                                    device,
￿    const VkImageSparseMemoryRequirementsInfo2* pInfo,
￿    uint32_t*                                   pSparseMemoryRequirementCount,
￿    VkSparseImageMemoryRequirements2*           pSparseMemoryRequirements);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pInfo} <b>must</b> be a valid pointer to a valid ##VkImageSparseMemoryRequirementsInfo2 structure</li>
            <li>{@code pSparseMemoryRequirementCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pSparseMemoryRequirementCount} is not 0, and {@code pSparseMemoryRequirements} is not {@code NULL}, {@code pSparseMemoryRequirements} <b>must</b> be a valid pointer to an array of {@code pSparseMemoryRequirementCount} ##VkSparseImageMemoryRequirements2 structures</li>
        </ul>

        <h5>See Also</h5>
        ##VkImageSparseMemoryRequirementsInfo2, ##VkSparseImageMemoryRequirements2
        """,

        VkDevice.IN("device", "the logical device that owns the image."),
        VkImageSparseMemoryRequirementsInfo2.const.p.IN("pInfo", "a pointer to an instance of the ##VkImageSparseMemoryRequirementsInfo2 structure containing parameters required for the memory requirements query."),
        AutoSize("pSparseMemoryRequirements")..Check(1)..uint32_t.p.INOUT("pSparseMemoryRequirementCount", "a pointer to an integer related to the number of sparse memory requirements available or queried, as described below."),
        nullable..VkSparseImageMemoryRequirements2.p.OUT("pSparseMemoryRequirements", "either {@code NULL} or a pointer to an array of ##VkSparseImageMemoryRequirements2 structures.")
    )

    // Promoted from VK_KHR_get_physical_device_properties2

    void(
        "GetPhysicalDeviceFeatures2",
        """
        Reports capabilities of a physical device.

        <h5>C Specification</h5>
        To query supported features defined by the core or extensions, call:

        <pre><code>
￿void vkGetPhysicalDeviceFeatures2(
￿    VkPhysicalDevice                            physicalDevice,
￿    VkPhysicalDeviceFeatures2*                  pFeatures);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkGetPhysicalDeviceFeatures2KHR(
￿    VkPhysicalDevice                            physicalDevice,
￿    VkPhysicalDeviceFeatures2*                  pFeatures);</code></pre>

        <h5>Description</h5>
        Each structure in {@code pFeatures} and its {@code pNext} chain contain members corresponding to fine-grained features. #GetPhysicalDeviceFeatures2() writes each member to a boolean value indicating whether that feature is supported.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pFeatures} <b>must</b> be a valid pointer to a ##VkPhysicalDeviceFeatures2 structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkPhysicalDeviceFeatures2
        """,

        VkPhysicalDevice.IN("physicalDevice", "the physical device from which to query the supported features."),
        VkPhysicalDeviceFeatures2.p.OUT("pFeatures", "a pointer to a ##VkPhysicalDeviceFeatures2 structure in which the physical device features are returned.")
    )

    void(
        "GetPhysicalDeviceProperties2",
        """
        Returns properties of a physical device.

        <h5>C Specification</h5>
        To query general properties of physical devices once enumerated, call:

        <pre><code>
￿void vkGetPhysicalDeviceProperties2(
￿    VkPhysicalDevice                            physicalDevice,
￿    VkPhysicalDeviceProperties2*                pProperties);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkGetPhysicalDeviceProperties2KHR(
￿    VkPhysicalDevice                            physicalDevice,
￿    VkPhysicalDeviceProperties2*                pProperties);</code></pre>

        <h5>Description</h5>
        Each structure in {@code pProperties} and its {@code pNext} chain contain members corresponding to properties or implementation-dependent limits. #GetPhysicalDeviceProperties2() writes each member to a value indicating the value of that property or limit.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pProperties} <b>must</b> be a valid pointer to a ##VkPhysicalDeviceProperties2 structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkPhysicalDeviceProperties2
        """,

        VkPhysicalDevice.IN("physicalDevice", "the handle to the physical device whose properties will be queried."),
        VkPhysicalDeviceProperties2.p.OUT("pProperties", "points to an instance of the ##VkPhysicalDeviceProperties2 structure, that will be filled with returned information.")
    )

    void(
        "GetPhysicalDeviceFormatProperties2",
        """
        Lists physical device's format capabilities.

        <h5>C Specification</h5>
        To query supported format features which are properties of the physical device, call:

        <pre><code>
￿void vkGetPhysicalDeviceFormatProperties2(
￿    VkPhysicalDevice                            physicalDevice,
￿    VkFormat                                    format,
￿    VkFormatProperties2*                        pFormatProperties);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkGetPhysicalDeviceFormatProperties2KHR(
￿    VkPhysicalDevice                            physicalDevice,
￿    VkFormat                                    format,
￿    VkFormatProperties2*                        pFormatProperties);</code></pre>

        <h5>Description</h5>
        #GetPhysicalDeviceFormatProperties2() behaves similarly to #GetPhysicalDeviceFormatProperties(), with the ability to return extended information in a {@code pNext} chain of output structures.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
            <li>{@code pFormatProperties} <b>must</b> be a valid pointer to a ##VkFormatProperties2 structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkFormatProperties2
        """,

        VkPhysicalDevice.IN("physicalDevice", "the physical device from which to query the format properties."),
        VkFormat.IN("format", "the format whose properties are queried."),
        VkFormatProperties2.p.OUT("pFormatProperties", "a pointer to a ##VkFormatProperties2 structure in which physical device properties for {@code format} are returned.")
    )

    VkResult(
        "GetPhysicalDeviceImageFormatProperties2",
        """
        Lists physical device's image format capabilities.

        <h5>C Specification</h5>
        To query additional capabilities specific to image types, call:

        <pre><code>
￿VkResult vkGetPhysicalDeviceImageFormatProperties2(
￿    VkPhysicalDevice                            physicalDevice,
￿    const VkPhysicalDeviceImageFormatInfo2*     pImageFormatInfo,
￿    VkImageFormatProperties2*                   pImageFormatProperties);</code></pre>

        or the equivalent command

        <pre><code>
￿VkResult vkGetPhysicalDeviceImageFormatProperties2KHR(
￿    VkPhysicalDevice                            physicalDevice,
￿    const VkPhysicalDeviceImageFormatInfo2*     pImageFormatInfo,
￿    VkImageFormatProperties2*                   pImageFormatProperties);</code></pre>

        <h5>Description</h5>
        #GetPhysicalDeviceImageFormatProperties2() behaves similarly to #GetPhysicalDeviceImageFormatProperties(), with the ability to return extended information in a {@code pNext} chain of output structures.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pImageFormatInfo} <b>must</b> be a valid pointer to a valid ##VkPhysicalDeviceImageFormatInfo2 structure</li>
            <li>{@code pImageFormatProperties} <b>must</b> be a valid pointer to a ##VkImageFormatProperties2 structure</li>
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
                <li>#ERROR_FORMAT_NOT_SUPPORTED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkImageFormatProperties2, ##VkPhysicalDeviceImageFormatInfo2
        """,

        VkPhysicalDevice.IN("physicalDevice", "the physical device from which to query the image capabilities."),
        VkPhysicalDeviceImageFormatInfo2.const.p.IN("pImageFormatInfo", "points to an instance of the ##VkPhysicalDeviceImageFormatInfo2 structure, describing the parameters that would be consumed by #CreateImage()."),
        VkImageFormatProperties2.p.OUT("pImageFormatProperties", "points to an instance of the ##VkImageFormatProperties2 structure in which capabilities are returned.")
    )

    void(
        "GetPhysicalDeviceQueueFamilyProperties2",
        """
        Reports properties of the queues of the specified physical device.

        <h5>C Specification</h5>
        To query properties of queues available on a physical device, call:

        <pre><code>
￿void vkGetPhysicalDeviceQueueFamilyProperties2(
￿    VkPhysicalDevice                            physicalDevice,
￿    uint32_t*                                   pQueueFamilyPropertyCount,
￿    VkQueueFamilyProperties2*                   pQueueFamilyProperties);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkGetPhysicalDeviceQueueFamilyProperties2KHR(
￿    VkPhysicalDevice                            physicalDevice,
￿    uint32_t*                                   pQueueFamilyPropertyCount,
￿    VkQueueFamilyProperties2*                   pQueueFamilyProperties);</code></pre>

        <h5>Description</h5>
        #GetPhysicalDeviceQueueFamilyProperties2() behaves similarly to #GetPhysicalDeviceQueueFamilyProperties(), with the ability to return extended information in a {@code pNext} chain of output structures.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pQueueFamilyPropertyCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pQueueFamilyPropertyCount} is not 0, and {@code pQueueFamilyProperties} is not {@code NULL}, {@code pQueueFamilyProperties} <b>must</b> be a valid pointer to an array of {@code pQueueFamilyPropertyCount} ##VkQueueFamilyProperties2 structures</li>
        </ul>

        <h5>See Also</h5>
        ##VkQueueFamilyProperties2
        """,

        VkPhysicalDevice.IN("physicalDevice", "the handle to the physical device whose properties will be queried."),
        AutoSize("pQueueFamilyProperties")..Check(1)..uint32_t.p.INOUT("pQueueFamilyPropertyCount", "a pointer to an integer related to the number of queue families available or queried, as described in #GetPhysicalDeviceQueueFamilyProperties()."),
        nullable..VkQueueFamilyProperties2.p.OUT("pQueueFamilyProperties", "either {@code NULL} or a pointer to an array of ##VkQueueFamilyProperties2 structures.")
    )

    void(
        "GetPhysicalDeviceMemoryProperties2",
        """
        Reports memory information for the specified physical device.

        <h5>C Specification</h5>
        To query memory properties, call:

        <pre><code>
￿void vkGetPhysicalDeviceMemoryProperties2(
￿    VkPhysicalDevice                            physicalDevice,
￿    VkPhysicalDeviceMemoryProperties2*          pMemoryProperties);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkGetPhysicalDeviceMemoryProperties2KHR(
￿    VkPhysicalDevice                            physicalDevice,
￿    VkPhysicalDeviceMemoryProperties2*          pMemoryProperties);</code></pre>

        <h5>Description</h5>
        #GetPhysicalDeviceMemoryProperties2() behaves similarly to #GetPhysicalDeviceMemoryProperties(), with the ability to return extended information in a {@code pNext} chain of output structures.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pMemoryProperties} <b>must</b> be a valid pointer to a ##VkPhysicalDeviceMemoryProperties2 structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkPhysicalDeviceMemoryProperties2
        """,

        VkPhysicalDevice.IN("physicalDevice", "the handle to the device to query."),
        VkPhysicalDeviceMemoryProperties2.p.OUT("pMemoryProperties", "points to an instance of ##VkPhysicalDeviceMemoryProperties2 structure in which the properties are returned.")
    )

    void(
        "GetPhysicalDeviceSparseImageFormatProperties2",
        """
        Retrieve properties of an image format applied to sparse images.

        <h5>C Specification</h5>
        #GetPhysicalDeviceSparseImageFormatProperties2() returns an array of ##VkSparseImageFormatProperties2. Each element will describe properties for one set of image aspects that are bound simultaneously in the image. This is usually one element for each aspect in the image, but for interleaved depth/stencil images there is only one element describing the combined aspects.

        <pre><code>
￿void vkGetPhysicalDeviceSparseImageFormatProperties2(
￿    VkPhysicalDevice                            physicalDevice,
￿    const VkPhysicalDeviceSparseImageFormatInfo2* pFormatInfo,
￿    uint32_t*                                   pPropertyCount,
￿    VkSparseImageFormatProperties2*             pProperties);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkGetPhysicalDeviceSparseImageFormatProperties2KHR(
￿    VkPhysicalDevice                            physicalDevice,
￿    const VkPhysicalDeviceSparseImageFormatInfo2* pFormatInfo,
￿    uint32_t*                                   pPropertyCount,
￿    VkSparseImageFormatProperties2*             pProperties);</code></pre>

        <h5>Description</h5>
        #GetPhysicalDeviceSparseImageFormatProperties2() behaves identically to #GetPhysicalDeviceSparseImageFormatProperties(), with the ability to return extended information by adding extension structures to the {@code pNext} chain of its {@code pProperties} parameter.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pFormatInfo} <b>must</b> be a valid pointer to a valid ##VkPhysicalDeviceSparseImageFormatInfo2 structure</li>
            <li>{@code pPropertyCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a valid pointer to an array of {@code pPropertyCount} ##VkSparseImageFormatProperties2 structures</li>
        </ul>

        <h5>See Also</h5>
        ##VkPhysicalDeviceSparseImageFormatInfo2, ##VkSparseImageFormatProperties2
        """,

        VkPhysicalDevice.IN("physicalDevice", "the physical device from which to query the sparse image capabilities."),
        VkPhysicalDeviceSparseImageFormatInfo2.const.p.IN("pFormatInfo", "a pointer to a structure of type ##VkPhysicalDeviceSparseImageFormatInfo2 containing input parameters to the command."),
        AutoSize("pProperties")..Check(1)..uint32_t.p.INOUT("pPropertyCount", "a pointer to an integer related to the number of sparse format properties available or queried, as described below."),
        nullable..VkSparseImageFormatProperties2.p.OUT("pProperties", "either {@code NULL} or a pointer to an array of ##VkSparseImageFormatProperties2 structures.")
    )

    // Promoted from VK_KHR_maintenance1

    void(
        "TrimCommandPool",
        """
        Trim a command pool.

        <h5>C Specification</h5>
        To trim a command pool, call:

        <pre><code>
￿void vkTrimCommandPool(
￿    VkDevice                                    device,
￿    VkCommandPool                               commandPool,
￿    VkCommandPoolTrimFlags                      flags);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkTrimCommandPoolKHR(
￿    VkDevice                                    device,
￿    VkCommandPool                               commandPool,
￿    VkCommandPoolTrimFlags                      flags);</code></pre>

        <h5>Description</h5>
        Trimming a command pool recycles unused memory from the command pool back to the system. Command buffers allocated from the pool are not affected by the command.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        This command provides applications with some control over the internal memory allocations used by command pools.

        Unused memory normally arises from command buffers that have been recorded and later reset, such that they are no longer using the memory. On reset, a command buffer can return memory to its command pool, but the only way to release memory from a command pool to the system requires calling #ResetCommandPool(), which cannot be executed while any command buffers from that pool are still in use. Subsequent recording operations into command buffers will re-use this memory but since total memory requirements fluctuate over time, unused memory can accumulate.

        In this situation, trimming a command pool <b>may</b> be useful to return unused memory back to the system, returning the total outstanding memory allocated by the pool back to a more "{@code average}" value.

        Implementations utilize many internal allocation strategies that make it impossible to guarantee that all unused memory is released back to the system. For instance, an implementation of a command pool <b>may</b> involve allocating memory in bulk from the system and sub-allocating from that memory. In such an implementation any live command buffer that holds a reference to a bulk allocation would prevent that allocation from being freed, even if only a small proportion of the bulk allocation is in use.

        In most cases trimming will result in a reduction in allocated but unused memory, but it does not guarantee the "{@code ideal}" behaviour.

        Trimming <b>may</b> be an expensive operation, and <b>should</b> not be called frequently. Trimming <b>should</b> be treated as a way to relieve memory pressure after application-known points when there exists enough unused memory that the cost of trimming is "{@code worth}" it.
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
        VkCommandPoolTrimFlags.IN("flags", "reserved for future use.")
    )

    // Originally based on VK_KHR_protected_memory (extension 146), which was never published; thus the mystifying large value= numbers below. These are not aliased since they weren't actually promoted from an extension.

    void(
        "GetDeviceQueue2",
        """
        Get a queue handle from a device.

        <h5>C Specification</h5>
        To retrieve a handle to a VkQueue object with specific {@code VkDeviceQueueCreateFlags} creation flags, call:

        <pre><code>
￿void vkGetDeviceQueue2(
￿    VkDevice                                    device,
￿    const VkDeviceQueueInfo2*                   pQueueInfo,
￿    VkQueue*                                    pQueue);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pQueueInfo} <b>must</b> be a valid pointer to a valid ##VkDeviceQueueInfo2 structure</li>
            <li>{@code pQueue} <b>must</b> be a valid pointer to a {@code VkQueue} handle</li>
        </ul>

        <h5>See Also</h5>
        ##VkDeviceQueueInfo2
        """,

        VkDevice.IN("device", "the logical device that owns the queue."),
        VkDeviceQueueInfo2.const.p.IN("pQueueInfo", "points to an instance of the ##VkDeviceQueueInfo2 structure, describing the parameters used to create the device queue."),
        Check(1)..VkQueue.p.OUT("pQueue", "a pointer to a {@code VkQueue} object that will be filled with the handle for the requested queue.")
    )

    // Promoted from VK_KHR_sampler_ycbcr_conversion

    VkResult(
        "CreateSamplerYcbcrConversion",
        """
        Create a new Ycbcr conversion.

        <h5>C Specification</h5>
        To create a {@code VkSamplerYcbcrConversion}, call:

        <pre><code>
￿VkResult vkCreateSamplerYcbcrConversion(
￿    VkDevice                                    device,
￿    const VkSamplerYcbcrConversionCreateInfo*   pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkSamplerYcbcrConversion*                   pYcbcrConversion);</code></pre>

        or the equivalent command

        <pre><code>
￿VkResult vkCreateSamplerYcbcrConversionKHR(
￿    VkDevice                                    device,
￿    const VkSamplerYcbcrConversionCreateInfo*   pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkSamplerYcbcrConversion*                   pYcbcrConversion);</code></pre>

        <h5>Description</h5>
        The interpretation of the configured sampler Y'C<sub>B</sub>C<sub>R</sub> conversion is described in more detail in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#textures-sampler-YCbCr-conversion">the description of sampler Y'C<sub>B</sub>C<sub>R</sub> conversion</a> in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#textures">Image Operations</a> chapter.

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#features-features-sampler-YCbCr-conversion">sampler Y&#8217;C<sub>B</sub>C<sub>R</sub> conversion feature</a> <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkSamplerYcbcrConversionCreateInfo structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pYcbcrConversion} <b>must</b> be a valid pointer to a {@code VkSamplerYcbcrConversion} handle</li>
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
        ##VkAllocationCallbacks, ##VkSamplerYcbcrConversionCreateInfo
        """,

        VkDevice.IN("device", "the logical device that creates the sampler Y&#8217;C<sub>B</sub>C<sub>R</sub> conversion."),
        VkSamplerYcbcrConversionCreateInfo.const.p.IN("pCreateInfo", "a pointer to an instance of the ##VkSamplerYcbcrConversionCreateInfo specifying the requested sampler Y&#8217;C<sub>B</sub>C<sub>R</sub> conversion."),
        nullable..VkAllocationCallbacks.const.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkSamplerYcbcrConversion.p.OUT("pYcbcrConversion", "points to a {@code VkSamplerYcbcrConversion} handle in which the resulting sampler Y&#8217;C<sub>B</sub>C<sub>R</sub> conversion is returned.")
    )

    void(
        "DestroySamplerYcbcrConversion",
        """
        Destroy a created Y'CbCr conversion.

        <h5>C Specification</h5>
        To destroy a sampler Y'C<sub>B</sub>C<sub>R</sub> conversion, call:

        <pre><code>
￿void vkDestroySamplerYcbcrConversion(
￿    VkDevice                                    device,
￿    VkSamplerYcbcrConversion                    ycbcrConversion,
￿    const VkAllocationCallbacks*                pAllocator);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkDestroySamplerYcbcrConversionKHR(
￿    VkDevice                                    device,
￿    VkSamplerYcbcrConversion                    ycbcrConversion,
￿    const VkAllocationCallbacks*                pAllocator);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code ycbcrConversion} is not #NULL_HANDLE, {@code ycbcrConversion} <b>must</b> be a valid {@code VkSamplerYcbcrConversion} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code ycbcrConversion} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code ycbcrConversion} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice.IN("device", "the logical device that destroys the Y&#8217;C<sub>B</sub>C<sub>R</sub> conversion."),
        VkSamplerYcbcrConversion.IN("ycbcrConversion", "the conversion to destroy."),
        nullable..VkAllocationCallbacks.const.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    // Promoted from VK_KHR_descriptor_update_template

    VkResult(
        "CreateDescriptorUpdateTemplate",
        """
        Create a new descriptor update template.

        <h5>C Specification</h5>
        Updating a large {@code VkDescriptorSet} array <b>can</b> be an expensive operation since an application <b>must</b> specify one ##VkWriteDescriptorSet structure for each descriptor or descriptor array to update, each of which re-specifies the same state when updating the same descriptor in multiple descriptor sets. For cases when an application wishes to update the same set of descriptors in multiple descriptor sets allocated using the same {@code VkDescriptorSetLayout}, #UpdateDescriptorSetWithTemplate() <b>can</b> be used as a replacement for #UpdateDescriptorSets().

        {@code VkDescriptorUpdateTemplate} allows implementations to convert a set of descriptor update operations on a single descriptor set to an internal format that, in conjunction with #UpdateDescriptorSetWithTemplate() or #CmdPushDescriptorSetWithTemplateKHR() , <b>can</b> be more efficient compared to calling #UpdateDescriptorSets() or #CmdPushDescriptorSetKHR() . The descriptors themselves are not specified in the {@code VkDescriptorUpdateTemplate}, rather, offsets into an application provided pointer to host memory are specified, which are combined with a pointer passed to #UpdateDescriptorSetWithTemplate() or #CmdPushDescriptorSetWithTemplateKHR() . This allows large batches of updates to be executed without having to convert application data structures into a strictly-defined Vulkan data structure.

        To create a descriptor update template, call:

        <pre><code>
￿VkResult vkCreateDescriptorUpdateTemplate(
￿    VkDevice                                    device,
￿    const VkDescriptorUpdateTemplateCreateInfo* pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkDescriptorUpdateTemplate*                 pDescriptorUpdateTemplate);</code></pre>

        or the equivalent command

        <pre><code>
￿VkResult vkCreateDescriptorUpdateTemplateKHR(
￿    VkDevice                                    device,
￿    const VkDescriptorUpdateTemplateCreateInfo* pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkDescriptorUpdateTemplate*                 pDescriptorUpdateTemplate);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkDescriptorUpdateTemplateCreateInfo structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pDescriptorUpdateTemplate} <b>must</b> be a valid pointer to a {@code VkDescriptorUpdateTemplate} handle</li>
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
        ##VkAllocationCallbacks, ##VkDescriptorUpdateTemplateCreateInfo
        """,

        VkDevice.IN("device", "the logical device that creates the descriptor update template."),
        VkDescriptorUpdateTemplateCreateInfo.const.p.IN("pCreateInfo", "a pointer to an instance of the ##VkDescriptorUpdateTemplateCreateInfo structure specifying the set of descriptors to update with a single call to #CmdPushDescriptorSetWithTemplateKHR() or #UpdateDescriptorSetWithTemplate()."),
        nullable..VkAllocationCallbacks.const.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkDescriptorUpdateTemplate.p.OUT("pDescriptorUpdateTemplate", "points to a {@code VkDescriptorUpdateTemplate} handle in which the resulting descriptor update template object is returned.")
    )

    void(
        "DestroyDescriptorUpdateTemplate",
        """
        Destroy a descriptor update template object.

        <h5>C Specification</h5>
        To destroy a descriptor update template, call:

        <pre><code>
￿void vkDestroyDescriptorUpdateTemplate(
￿    VkDevice                                    device,
￿    VkDescriptorUpdateTemplate                  descriptorUpdateTemplate,
￿    const VkAllocationCallbacks*                pAllocator);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkDestroyDescriptorUpdateTemplateKHR(
￿    VkDevice                                    device,
￿    VkDescriptorUpdateTemplate                  descriptorUpdateTemplate,
￿    const VkAllocationCallbacks*                pAllocator);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>If ##VkAllocationCallbacks were provided when {@code descriptorSetLayout} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code descriptorSetLayout} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code descriptorUpdateTemplate} is not #NULL_HANDLE, {@code descriptorUpdateTemplate} <b>must</b> be a valid {@code VkDescriptorUpdateTemplate} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code descriptorUpdateTemplate} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code descriptorUpdateTemplate} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice.IN("device", "the logical device that has been used to create the descriptor update template"),
        VkDescriptorUpdateTemplate.IN("descriptorUpdateTemplate", "the descriptor update template to destroy."),
        nullable..VkAllocationCallbacks.const.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    void(
        "UpdateDescriptorSetWithTemplate",
        """
        Update the contents of a descriptor set object using an update template.

        <h5>C Specification</h5>
        Once a {@code VkDescriptorUpdateTemplate} has been created, descriptor sets <b>can</b> be updated by calling:

        <pre><code>
￿void vkUpdateDescriptorSetWithTemplate(
￿    VkDevice                                    device,
￿    VkDescriptorSet                             descriptorSet,
￿    VkDescriptorUpdateTemplate                  descriptorUpdateTemplate,
￿    const void*                                 pData);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkUpdateDescriptorSetWithTemplateKHR(
￿    VkDevice                                    device,
￿    VkDescriptorSet                             descriptorSet,
￿    VkDescriptorUpdateTemplate                  descriptorUpdateTemplate,
￿    const void*                                 pData);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code pData} <b>must</b> be a valid pointer to a memory that contains one or more valid instances of ##VkDescriptorImageInfo, ##VkDescriptorBufferInfo, or {@code VkBufferView} in a layout defined by {@code descriptorUpdateTemplate} when it was created with #CreateDescriptorUpdateTemplate()</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code descriptorSet} <b>must</b> be a valid {@code VkDescriptorSet} handle</li>
            <li>{@code descriptorUpdateTemplate} <b>must</b> be a valid {@code VkDescriptorUpdateTemplate} handle</li>
            <li>{@code descriptorUpdateTemplate} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code descriptorSet} <b>must</b> be externally synchronized</li>
        </ul>

        <pre><code>
￿struct AppBufferView {
￿    VkBufferView bufferView;
￿    uint32_t     applicationRelatedInformation;
￿};
￿
￿struct AppDataStructure
￿{
￿    VkDescriptorImageInfo  imageInfo;          // a single image info
￿    VkDescriptorBufferInfo bufferInfoArray[3]; // 3 buffer infos in an array
￿    AppBufferView          bufferView[2];      // An application defined structure containing a bufferView
￿    // ... some more application related data
￿};
￿
￿const VkDescriptorUpdateTemplateEntry descriptorUpdateTemplateEntries[] =
￿{
￿    // binding to a single image descriptor
￿    {
￿        0,                                           // binding
￿        0,                                           // dstArrayElement
￿        1,                                           // descriptorCount
￿        VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER,   // descriptorType
￿        offsetof(AppDataStructure, imageInfo),       // offset
￿        0                                            // stride is not required if descriptorCount is 1.
￿    },
￿
￿    // binding to an array of buffer descriptors
￿    {
￿        0,                                           // binding
￿        0,                                           // dstArrayElement
￿        3,                                           // descriptorCount
￿        VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER,           // descriptorType
￿        offsetof(AppDataStructure, bufferInfoArray), // offset
￿        sizeof(VkDescriptorBufferInfo)               // stride, descriptor buffer infos are compact
￿    },
￿
￿    // binding to an array of buffer views
￿    {
￿        0,                                           // binding
￿        3,                                           // dstArrayElement
￿        1,                                           // descriptorCount
￿        VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER,     // descriptorType
￿        offsetof(AppDataStructure, bufferView),      // offset
￿        sizeof(AppBufferView)                        // stride, bufferViews do not have to be compact
￿    },
￿};
￿
￿// create an descriptor update template for descriptor set updates
￿const VkDescriptorUpdateTemplateCreateInfo createInfo =
￿{
￿    VK_STRUCTURE_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO,  // sType
￿    NULL,                                                          // pNext
￿    0,                                                             // flags
￿    3,                                                             // descriptorUpdateEntryCount
￿    descriptorUpdateTemplateEntries,                               // pDescriptorUpdateEntries
￿    VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET,         // templateType
￿    myLayout,                                                      // descriptorSetLayout
￿    0,                                                             // pipelineBindPoint, ignored by given templateType
￿    0,                                                             // pipelineLayout, ignored by given templateType
￿    0,                                                             // set, ignored by given templateType
￿};
￿
￿VkDescriptorUpdateTemplate myDescriptorUpdateTemplate;
￿myResult = vkCreateDescriptorUpdateTemplate(
￿    myDevice,
￿    &amp;createInfo,
￿    NULL,
￿    &amp;myDescriptorUpdateTemplate);
￿}
￿
￿
￿AppDataStructure appData;
￿
￿// fill appData here or cache it in your engine
￿vkUpdateDescriptorSetWithTemplate(myDevice, myDescriptorSet, myDescriptorUpdateTemplate, &amp;appData);</code></pre>
        """,

        VkDevice.IN("device", "the logical device that updates the descriptor sets."),
        VkDescriptorSet.IN("descriptorSet", "the descriptor set to update"),
        VkDescriptorUpdateTemplate.IN("descriptorUpdateTemplate", "the {@code VkDescriptorUpdateTemplate} which specifies the update mapping between {@code pData} and the descriptor set to update."),
        opaque_const_p.IN("pData", "a pointer to memory which contains one or more structures of ##VkDescriptorImageInfo, ##VkDescriptorBufferInfo, or {@code VkBufferView} used to write the descriptors.")
    )

    // Promoted from VK_KHR_external_memory_capabilities

    void(
        "GetPhysicalDeviceExternalBufferProperties",
        """
        Query external handle types supported by buffers.

        <h5>C Specification</h5>
        To query the external handle types supported by buffers, call:

        <pre><code>
￿void vkGetPhysicalDeviceExternalBufferProperties(
￿    VkPhysicalDevice                            physicalDevice,
￿    const VkPhysicalDeviceExternalBufferInfo*   pExternalBufferInfo,
￿    VkExternalBufferProperties*                 pExternalBufferProperties);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkGetPhysicalDeviceExternalBufferPropertiesKHR(
￿    VkPhysicalDevice                            physicalDevice,
￿    const VkPhysicalDeviceExternalBufferInfo*   pExternalBufferInfo,
￿    VkExternalBufferProperties*                 pExternalBufferProperties);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pExternalBufferInfo} <b>must</b> be a valid pointer to a valid ##VkPhysicalDeviceExternalBufferInfo structure</li>
            <li>{@code pExternalBufferProperties} <b>must</b> be a valid pointer to a ##VkExternalBufferProperties structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkExternalBufferProperties, ##VkPhysicalDeviceExternalBufferInfo
        """,

        VkPhysicalDevice.IN("physicalDevice", "the physical device from which to query the buffer capabilities."),
        VkPhysicalDeviceExternalBufferInfo.const.p.IN("pExternalBufferInfo", "points to an instance of the ##VkPhysicalDeviceExternalBufferInfo structure, describing the parameters that would be consumed by #CreateBuffer()."),
        VkExternalBufferProperties.p.OUT("pExternalBufferProperties", "points to an instance of the ##VkExternalBufferProperties structure in which capabilities are returned.")
    )

    // Promoted from VK_KHR_external_fence_capabilities

    void(
        "GetPhysicalDeviceExternalFenceProperties",
        """
        Function for querying external fence handle capabilities.

        <h5>C Specification</h5>
        Fences <b>may</b> support import and export of their <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#synchronization-fences-payloads">payload</a> to external handles. To query the external handle types supported by fences, call:

        <pre><code>
￿void vkGetPhysicalDeviceExternalFenceProperties(
￿    VkPhysicalDevice                            physicalDevice,
￿    const VkPhysicalDeviceExternalFenceInfo*    pExternalFenceInfo,
￿    VkExternalFenceProperties*                  pExternalFenceProperties);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkGetPhysicalDeviceExternalFencePropertiesKHR(
￿    VkPhysicalDevice                            physicalDevice,
￿    const VkPhysicalDeviceExternalFenceInfo*    pExternalFenceInfo,
￿    VkExternalFenceProperties*                  pExternalFenceProperties);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pExternalFenceInfo} <b>must</b> be a valid pointer to a valid ##VkPhysicalDeviceExternalFenceInfo structure</li>
            <li>{@code pExternalFenceProperties} <b>must</b> be a valid pointer to a ##VkExternalFenceProperties structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkExternalFenceProperties, ##VkPhysicalDeviceExternalFenceInfo
        """,

        VkPhysicalDevice.IN("physicalDevice", "the physical device from which to query the fence capabilities."),
        VkPhysicalDeviceExternalFenceInfo.const.p.IN("pExternalFenceInfo", "points to an instance of the ##VkPhysicalDeviceExternalFenceInfo structure, describing the parameters that would be consumed by #CreateFence()."),
        VkExternalFenceProperties.p.OUT("pExternalFenceProperties", "points to an instance of the ##VkExternalFenceProperties structure in which capabilities are returned.")
    )

    // Promoted from VK_KHR_external_semaphore_capabilities

    void(
        "GetPhysicalDeviceExternalSemaphoreProperties",
        """
        Function for querying external semaphore handle capabilities.

        <h5>C Specification</h5>
        Semaphores <b>may</b> support import and export of their <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#synchronization-semaphores-payloads">payload</a> to external handles. To query the external handle types supported by semaphores, call:

        <pre><code>
￿void vkGetPhysicalDeviceExternalSemaphoreProperties(
￿    VkPhysicalDevice                            physicalDevice,
￿    const VkPhysicalDeviceExternalSemaphoreInfo* pExternalSemaphoreInfo,
￿    VkExternalSemaphoreProperties*              pExternalSemaphoreProperties);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkGetPhysicalDeviceExternalSemaphorePropertiesKHR(
￿    VkPhysicalDevice                            physicalDevice,
￿    const VkPhysicalDeviceExternalSemaphoreInfo* pExternalSemaphoreInfo,
￿    VkExternalSemaphoreProperties*              pExternalSemaphoreProperties);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pExternalSemaphoreInfo} <b>must</b> be a valid pointer to a valid ##VkPhysicalDeviceExternalSemaphoreInfo structure</li>
            <li>{@code pExternalSemaphoreProperties} <b>must</b> be a valid pointer to a ##VkExternalSemaphoreProperties structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkExternalSemaphoreProperties, ##VkPhysicalDeviceExternalSemaphoreInfo
        """,

        VkPhysicalDevice.IN("physicalDevice", "the physical device from which to query the semaphore capabilities."),
        VkPhysicalDeviceExternalSemaphoreInfo.const.p.IN("pExternalSemaphoreInfo", "points to an instance of the ##VkPhysicalDeviceExternalSemaphoreInfo structure, describing the parameters that would be consumed by #CreateSemaphore()."),
        VkExternalSemaphoreProperties.p.OUT("pExternalSemaphoreProperties", "points to an instance of the ##VkExternalSemaphoreProperties structure in which capabilities are returned.")
    )

    // Promoted from VK_KHR_maintenance3

    void(
        "GetDescriptorSetLayoutSupport",
        """
        Query whether a descriptor set layout can be created.

        <h5>C Specification</h5>
        To query information about whether a descriptor set layout <b>can</b> be created, call:

        <pre><code>
￿void vkGetDescriptorSetLayoutSupport(
￿    VkDevice                                    device,
￿    const VkDescriptorSetLayoutCreateInfo*      pCreateInfo,
￿    VkDescriptorSetLayoutSupport*               pSupport);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkGetDescriptorSetLayoutSupportKHR(
￿    VkDevice                                    device,
￿    const VkDescriptorSetLayoutCreateInfo*      pCreateInfo,
￿    VkDescriptorSetLayoutSupport*               pSupport);</code></pre>

        <h5>Description</h5>
        Some implementations have limitations on what fits in a descriptor set which are not easily expressible in terms of existing limits like {@code maxDescriptorSet}*, for example if all descriptor types share a limited space in memory but each descriptor is a different size or alignment. This command returns information about whether a descriptor set satisfies this limit. If the descriptor set layout satisfies the ##VkPhysicalDeviceMaintenance3Properties{@code ::maxPerSetDescriptors} limit, this command is guaranteed to return #TRUE in ##VkDescriptorSetLayoutSupport{@code ::supported}. If the descriptor set layout exceeds the ##VkPhysicalDeviceMaintenance3Properties{@code ::maxPerSetDescriptors} limit, whether the descriptor set layout is supported is implementation-dependent and <b>may</b> depend on whether the descriptor sizes and alignments cause the layout to exceed an internal limit.

        This command does not consider other limits such as {@code maxPerStageDescriptor}*, and so a descriptor set layout that is supported according to this command <b>must</b> still satisfy the pipeline layout limits such as {@code maxPerStageDescriptor}* in order to be used in a pipeline layout.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        This is a {@code VkDevice} query rather than {@code VkPhysicalDevice} because the answer <b>may</b> depend on enabled features.
        </div>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkDescriptorSetLayoutCreateInfo structure</li>
            <li>{@code pSupport} <b>must</b> be a valid pointer to a ##VkDescriptorSetLayoutSupport structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkDescriptorSetLayoutCreateInfo, ##VkDescriptorSetLayoutSupport
        """,

        VkDevice.IN("device", "the logical device that would create the descriptor set layout."),
        VkDescriptorSetLayoutCreateInfo.const.p.IN("pCreateInfo", "a pointer to an instance of the ##VkDescriptorSetLayoutCreateInfo structure specifying the state of the descriptor set layout object."),
        VkDescriptorSetLayoutSupport.p.OUT("pSupport", "points to a ##VkDescriptorSetLayoutSupport structure in which information about support for the descriptor set layout object is returned.")
    )

}