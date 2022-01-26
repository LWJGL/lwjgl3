/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_sampler_ycbcr_conversion = "KHRSamplerYcbcrConversion".nativeClassVK("KHR_sampler_ycbcr_conversion", type = "device", postfix = "KHR") {
    documentation =
        """
        The use of Y′C<sub>B</sub>C<sub>R</sub> sampler conversion is an area in 3D graphics not used by most Vulkan developers. It is mainly used for processing inputs from video decoders and cameras. The use of the extension assumes basic knowledge of Y′C<sub>B</sub>C<sub>R</sub> concepts.

        This extension provides the ability to perform specified color space conversions during texture sampling operations for the Y′C<sub>B</sub>C<sub>R</sub> color space natively. It also adds a selection of multi-planar formats, image aspect plane, and the ability to bind memory to the planes of an image collectively or separately.

        <h5>Promotion to Vulkan 1.1</h5>
        All functionality in this extension is included in core Vulkan 1.1, with the KHR suffix omitted. However, if Vulkan 1.1 is supported and this extension is not, the {@code samplerYcbcrConversion} capability is optional. The original type, enum and command names are still available as aliases of the core functionality.

        <h5>VK_KHR_sampler_ycbcr_conversion</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_sampler_ycbcr_conversion}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>157</dd>

            <dt><b>Revision</b></dt>
            <dd>14</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRMaintenance1 VK_KHR_maintenance1}</li>
                <li>Requires {@link KHRBindMemory2 VK_KHR_bind_memory2}</li>
                <li>Requires {@link KHRGetMemoryRequirements2 VK_KHR_get_memory_requirements2}</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
            </ul></dd>

            <dt><b>Deprecation state</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#versions-1.1-promotions">Vulkan 1.1</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Andrew Garrard <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_sampler_ycbcr_conversion]%20@fluppeteer%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_sampler_ycbcr_conversion%20extension%3E%3E">fluppeteer</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2017-08-11</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Promoted to Vulkan 1.1 Core</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Andrew Garrard, Samsung Electronics</li>
                <li>Tobias Hector, Imagination Technologies</li>
                <li>James Jones, NVIDIA</li>
                <li>Daniel Koch, NVIDIA</li>
                <li>Daniel Rakos, AMD</li>
                <li>Romain Guy, Google</li>
                <li>Jesse Hall, Google</li>
                <li>Tom Cooksey, ARM Ltd</li>
                <li>Jeff Leger, Qualcomm Technologies, Inc</li>
                <li>Jan-Harald Fredriksen, ARM Ltd</li>
                <li>Jan Outters, Samsung Electronics</li>
                <li>Alon Or-bach, Samsung Electronics</li>
                <li>Michael Worcester, Imagination Technologies</li>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Tony Zlatinski, NVIDIA</li>
                <li>Matthew Netsch, Qualcomm Technologies, Inc</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_SAMPLER_YCBCR_CONVERSION_SPEC_VERSION".."14"
    )

    StringConstant(
        "The extension name.",

        "KHR_SAMPLER_YCBCR_CONVERSION_EXTENSION_NAME".."VK_KHR_sampler_ycbcr_conversion"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_CREATE_INFO_KHR".."1000156000",
        "STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_INFO_KHR".."1000156001",
        "STRUCTURE_TYPE_BIND_IMAGE_PLANE_MEMORY_INFO_KHR".."1000156002",
        "STRUCTURE_TYPE_IMAGE_PLANE_MEMORY_REQUIREMENTS_INFO_KHR".."1000156003",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_YCBCR_CONVERSION_FEATURES_KHR".."1000156004",
        "STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_IMAGE_FORMAT_PROPERTIES_KHR".."1000156005"
    )

    EnumConstant(
        "Extends {@code VkDebugReportObjectTypeEXT}.",

        "DEBUG_REPORT_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_KHR_EXT".."1000156000"
    )

    EnumConstant(
        "Extends {@code VkObjectType}.",

        "OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_KHR".."1000156000"
    )

    EnumConstant(
        "Extends {@code VkFormat}.",

        "FORMAT_G8B8G8R8_422_UNORM_KHR".."1000156000",
        "FORMAT_B8G8R8G8_422_UNORM_KHR".."1000156001",
        "FORMAT_G8_B8_R8_3PLANE_420_UNORM_KHR".."1000156002",
        "FORMAT_G8_B8R8_2PLANE_420_UNORM_KHR".."1000156003",
        "FORMAT_G8_B8_R8_3PLANE_422_UNORM_KHR".."1000156004",
        "FORMAT_G8_B8R8_2PLANE_422_UNORM_KHR".."1000156005",
        "FORMAT_G8_B8_R8_3PLANE_444_UNORM_KHR".."1000156006",
        "FORMAT_R10X6_UNORM_PACK16_KHR".."1000156007",
        "FORMAT_R10X6G10X6_UNORM_2PACK16_KHR".."1000156008",
        "FORMAT_R10X6G10X6B10X6A10X6_UNORM_4PACK16_KHR".."1000156009",
        "FORMAT_G10X6B10X6G10X6R10X6_422_UNORM_4PACK16_KHR".."1000156010",
        "FORMAT_B10X6G10X6R10X6G10X6_422_UNORM_4PACK16_KHR".."1000156011",
        "FORMAT_G10X6_B10X6_R10X6_3PLANE_420_UNORM_3PACK16_KHR".."1000156012",
        "FORMAT_G10X6_B10X6R10X6_2PLANE_420_UNORM_3PACK16_KHR".."1000156013",
        "FORMAT_G10X6_B10X6_R10X6_3PLANE_422_UNORM_3PACK16_KHR".."1000156014",
        "FORMAT_G10X6_B10X6R10X6_2PLANE_422_UNORM_3PACK16_KHR".."1000156015",
        "FORMAT_G10X6_B10X6_R10X6_3PLANE_444_UNORM_3PACK16_KHR".."1000156016",
        "FORMAT_R12X4_UNORM_PACK16_KHR".."1000156017",
        "FORMAT_R12X4G12X4_UNORM_2PACK16_KHR".."1000156018",
        "FORMAT_R12X4G12X4B12X4A12X4_UNORM_4PACK16_KHR".."1000156019",
        "FORMAT_G12X4B12X4G12X4R12X4_422_UNORM_4PACK16_KHR".."1000156020",
        "FORMAT_B12X4G12X4R12X4G12X4_422_UNORM_4PACK16_KHR".."1000156021",
        "FORMAT_G12X4_B12X4_R12X4_3PLANE_420_UNORM_3PACK16_KHR".."1000156022",
        "FORMAT_G12X4_B12X4R12X4_2PLANE_420_UNORM_3PACK16_KHR".."1000156023",
        "FORMAT_G12X4_B12X4_R12X4_3PLANE_422_UNORM_3PACK16_KHR".."1000156024",
        "FORMAT_G12X4_B12X4R12X4_2PLANE_422_UNORM_3PACK16_KHR".."1000156025",
        "FORMAT_G12X4_B12X4_R12X4_3PLANE_444_UNORM_3PACK16_KHR".."1000156026",
        "FORMAT_G16B16G16R16_422_UNORM_KHR".."1000156027",
        "FORMAT_B16G16R16G16_422_UNORM_KHR".."1000156028",
        "FORMAT_G16_B16_R16_3PLANE_420_UNORM_KHR".."1000156029",
        "FORMAT_G16_B16R16_2PLANE_420_UNORM_KHR".."1000156030",
        "FORMAT_G16_B16_R16_3PLANE_422_UNORM_KHR".."1000156031",
        "FORMAT_G16_B16R16_2PLANE_422_UNORM_KHR".."1000156032",
        "FORMAT_G16_B16_R16_3PLANE_444_UNORM_KHR".."1000156033"
    )

    EnumConstant(
        "Extends {@code VkImageAspectFlagBits}.",

        "IMAGE_ASPECT_PLANE_0_BIT_KHR".enum(0x00000010),
        "IMAGE_ASPECT_PLANE_1_BIT_KHR".enum(0x00000020),
        "IMAGE_ASPECT_PLANE_2_BIT_KHR".enum(0x00000040)
    )

    EnumConstant(
        "Extends {@code VkImageCreateFlagBits}.",

        "IMAGE_CREATE_DISJOINT_BIT_KHR".enum(0x00000200)
    )

    EnumConstant(
        "Extends {@code VkFormatFeatureFlagBits}.",

        "FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT_KHR".enum(0x00020000),
        "FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT_KHR".enum(0x00040000),
        "FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT_KHR".enum(0x00080000),
        "FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT_KHR".enum(0x00100000),
        "FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT_KHR".enum(0x00200000),
        "FORMAT_FEATURE_DISJOINT_BIT_KHR".enum(0x00400000),
        "FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT_KHR".enum(0x00800000)
    )

    EnumConstant(
        "Extends {@code VkSamplerYcbcrModelConversion}.",

        "SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY_KHR".."0",
        "SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY_KHR".."1",
        "SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_709_KHR".."2",
        "SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_601_KHR".."3",
        "SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_2020_KHR".."4"
    )

    EnumConstant(
        "Extends {@code VkSamplerYcbcrRange}.",

        "SAMPLER_YCBCR_RANGE_ITU_FULL_KHR".."0",
        "SAMPLER_YCBCR_RANGE_ITU_NARROW_KHR".."1"
    )

    EnumConstant(
        "Extends {@code VkChromaLocation}.",

        "CHROMA_LOCATION_COSITED_EVEN_KHR".."0",
        "CHROMA_LOCATION_MIDPOINT_KHR".."1"
    )

    EnumConstant(
        "Extends {@code VkDebugReportObjectTypeEXT}.",

        "DEBUG_REPORT_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_EXT".."1000156000"
    )

    VkResult(
        "CreateSamplerYcbcrConversionKHR",
        "See #CreateSamplerYcbcrConversion().",

        VkDevice("device", "the logical device that creates the sampler Y′C<sub>B</sub>C<sub>R</sub> conversion."),
        VkSamplerYcbcrConversionCreateInfo.const.p("pCreateInfo", "a pointer to a ##VkSamplerYcbcrConversionCreateInfo structure specifying the requested sampler Y′C<sub>B</sub>C<sub>R</sub> conversion."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkSamplerYcbcrConversion.p("pYcbcrConversion", "a pointer to a {@code VkSamplerYcbcrConversion} handle in which the resulting sampler Y′C<sub>B</sub>C<sub>R</sub> conversion is returned.")
    )

    void(
        "DestroySamplerYcbcrConversionKHR",
        "See #DestroySamplerYcbcrConversion().",

        VkDevice("device", "the logical device that destroys the Y′C<sub>B</sub>C<sub>R</sub> conversion."),
        VkSamplerYcbcrConversion("ycbcrConversion", "the conversion to destroy."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )
}