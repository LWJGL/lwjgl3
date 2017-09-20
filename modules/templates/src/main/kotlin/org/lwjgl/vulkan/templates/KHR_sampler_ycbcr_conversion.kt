/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val KHR_sampler_ycbcr_conversion = "KHRSamplerYcbcrConversion".nativeClassVK("KHR_sampler_ycbcr_conversion", type = "device", postfix = KHR) {
    documentation =
        """
        This extension provides the ability to perform specified color space conversions during texture sampling operations. It also adds a selection of multi-planar formats, including the ability to bind memory to the planes of an image collectively or separately.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_sampler_ycbcr_conversion}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>157</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VK_KHR_maintenance1">{@code VK_KHR_maintenance1}</a></li>
                <li>Requires <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VK_KHR_bind_memory2">{@code VK_KHR_bind_memory2}</a></li>
                <li>Requires <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VK_KHR_get_memory_requirements2">{@code VK_KHR_get_memory_requirements2}</a></li>
                <li>Requires <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VK_KHR_get_physical_device_properties2">{@code VK_KHR_get_physical_device_properties2}</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Andrew Garrard @fluppeteer</li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2017-08-11</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>This extension interacts with VK_EXT_debug_report</li>
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

        "KHR_SAMPLER_YCBCR_CONVERSION_SPEC_VERSION".."1"
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
        """
        VkSamplerYcbcrModelConversionKHR - Color model component of a color space

        <h5>Description</h5>
        <ul>
            <li>#SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY_KHR specifies that the input values to the conversion are unmodified.</li>
            <li>#SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY_KHR specifies no model conversion but the inputs are range expanded as for Y&#8217;C<sub>B</sub>C<sub>R</sub>.</li>
            <li>#SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_709_KHR specifies the color model conversion from Y&#8217;C<sub>B</sub>C<sub>R</sub> to R&#8217;G&#8217;B' defined in BT.709 and described in the “BT.709 Y’C<sub>B</sub>C<sub>R</sub> conversion” section of the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#data-format">Khronos Data Format Specification</a>.</li>
            <li>#SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_601_KHR specifies the color model conversion from Y&#8217;C<sub>B</sub>C<sub>R</sub> to R&#8217;G&#8217;B' defined in BT.601 and described in the “BT.601 Y’C<sub>B</sub>C<sub>R</sub> conversion” section of the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#data-format">Khronos Data Format Specification</a>.</li>
            <li>#SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_2020_KHR specifies the color model conversion from Y&#8217;C<sub>B</sub>C<sub>R</sub> to R&#8217;G&#8217;B' defined in BT.2020 and described in the “BT.2020 Y’C<sub>B</sub>C<sub>R</sub> conversion” section of the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#data-format">Khronos Data Format Specification</a>.</li>
        </ul>

        In the etext:VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_*_KHR color models, for the input to the sampler Y'C<sub>B</sub>C<sub>R</sub> range expansion and model conversion:

        <ul>
            <li>the Y (Y' luma) channel corresponds to the G channel of an RGB image.</li>
            <li>the CB (C<sub>B</sub> or “U” blue color difference) channel corresponds to the B channel of an RGB image.</li>
            <li>the CR (C<sub>R</sub> or “V” red color difference) channel corresponds to the R channel of an RGB image.</li>
            <li>the alpha channel, if present, is not modified by color model conversion.</li>
        </ul>

        These rules reflect the mapping of channels after the channel swizzle operation (controlled by ##VkSamplerYcbcrConversionCreateInfoKHR{@code ::components}).

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        For example, an "YUVA" 32-bit format comprising four 8-bit channels can be implemented as #FORMAT_R8G8B8A8_UNORM with a component mapping:

        <ul>
            <li>{@code components.a} = #COMPONENT_SWIZZLE_IDENTITY</li>
            <li>{@code components.r} = #COMPONENT_SWIZZLE_B</li>
            <li>{@code components.g} = #COMPONENT_SWIZZLE_R</li>
            <li>{@code components.b} = #COMPONENT_SWIZZLE_G</li>
        </ul>
        </div>

        <h5>See Also</h5>
        ##VkSamplerYcbcrConversionCreateInfoKHR
        """,

        "SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY_KHR".."0",
        "SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY_KHR".."1",
        "SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_709_KHR".."2",
        "SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_601_KHR".."3",
        "SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_2020_KHR".."4"
    )

    EnumConstant(
        """
        VkSamplerYcbcrRangeKHR - Range of encoded values in a color space

        <h5>Description</h5>
        <ul>
            <li>#SAMPLER_YCBCR_RANGE_ITU_FULL_KHR indicates that the full range of the encoded values are valid and interpreted according to the ITU “full range” quantization rules.</li>
            <li>#SAMPLER_YCBCR_RANGE_ITU_NARROW_KHR indicates that headroom and foot room are reserved in the numerical range of encoded values, and the remaining values are expanded according to the ITU “narrow range” quantization rules.</li>
        </ul>

        The formulae for these conversions is described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#textures-sampler-YCbCr-conversion-rangeexpand">Sampler Y'C<sub>B</sub>C<sub>R</sub> Range Expansion</a> section of the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#textures">Image Operations</a> chapter.

        No range modification takes place if {@code ycbcrModel} is #SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY_KHR; the {@code ycbcrRange} field of ##VkSamplerYcbcrConversionCreateInfoKHR is ignored in this case.

        <h5>See Also</h5>
        ##VkSamplerYcbcrConversionCreateInfoKHR
        """,

        "SAMPLER_YCBCR_RANGE_ITU_FULL_KHR".."0",
        "SAMPLER_YCBCR_RANGE_ITU_NARROW_KHR".."1"
    )

    EnumConstant(
        """
        VkChromaLocationKHR - Position of downsampled chroma samples

        <h5>Description</h5>
        <ul>
            <li>#CHROMA_LOCATION_COSITED_EVEN_KHR indicates that downsampled chroma samples are aligned with luma samples with even coordinates.</li>
            <li>#CHROMA_LOCATION_MIDPOINT_KHR indicates that downsampled chroma samples are located half way between each even luma sample and the nearest higher odd luma sample.</li>
        </ul>

        <h5>See Also</h5>
        ##VkSamplerYcbcrConversionCreateInfoKHR
        """,

        "CHROMA_LOCATION_COSITED_EVEN_KHR".."0",
        "CHROMA_LOCATION_MIDPOINT_KHR".."1"
    )

    VkResult(
        "CreateSamplerYcbcrConversionKHR",
        """
        Create a new Ycbcr conversion.

        <h5>C Specification</h5>
        To create a {@code VkSamplerYcbcrConversionKHR}, call:

        <code><pre>
￿VkResult vkCreateSamplerYcbcrConversionKHR(
￿    VkDevice                                    device,
￿    const VkSamplerYcbcrConversionCreateInfoKHR* pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkSamplerYcbcrConversionKHR*                pYcbcrConversion);</pre></code>

        <h5>Description</h5>
        The interpretation of the configured sampler Y'C<sub>B</sub>C<sub>R</sub> conversion is described in more detail in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#textures-sampler-YCbCr-conversion">the description of sampler Y'C<sub>B</sub>C<sub>R</sub> conversion</a> in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#textures">Image Operations</a> chapter.

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-sampler-YCbCr-conversion">sampler Y&#8217;C<sub>B</sub>C<sub>R</sub> conversion feature</a> <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid ##VkSamplerYcbcrConversionCreateInfoKHR structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pYcbcrConversion} <b>must</b> be a pointer to a {@code VkSamplerYcbcrConversionKHR} handle</li>
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
        ##VkAllocationCallbacks, ##VkSamplerYcbcrConversionCreateInfoKHR
        """,

        VkDevice.IN("device", "the logical device that creates the sampler Y&#8217;C<sub>B</sub>C<sub>R</sub> conversion."),
        const..VkSamplerYcbcrConversionCreateInfoKHR.p.IN("pCreateInfo", "a pointer to an instance of the ##VkSamplerYcbcrConversionCreateInfoKHR specifying the requested sampler Y&#8217;C<sub>B</sub>C<sub>R</sub> conversion."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkSamplerYcbcrConversionKHR.p.OUT("pYcbcrConversion", "points to a {@code VkSamplerYcbcrConversionKHR} handle in which the resulting sampler Y&#8217;C<sub>B</sub>C<sub>R</sub> conversion is returned.")
    )

    void(
        "DestroySamplerYcbcrConversionKHR",
        """
        Destroy a created Y'CbCr conversion.

        <h5>C Specification</h5>
        To destroy a sampler Y'C<sub>B</sub>C<sub>R</sub> conversion, call:

        <code><pre>
￿void vkDestroySamplerYcbcrConversionKHR(
￿    VkDevice                                    device,
￿    VkSamplerYcbcrConversionKHR                 ycbcrConversion,
￿    const VkAllocationCallbacks*                pAllocator);</pre></code>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code ycbcrConversion} is not #NULL_HANDLE, {@code ycbcrConversion} <b>must</b> be a valid {@code VkSamplerYcbcrConversionKHR} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
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
        VkSamplerYcbcrConversionKHR.IN("ycbcrConversion", "the conversion to destroy."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )
}