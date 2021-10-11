/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_format_feature_flags2 = "KHRFormatFeatureFlags2".nativeClassVK("KHR_format_feature_flags2", type = "device", postfix = KHR) {
    documentation =
        """
        This extension adds a new {@code VkFormatFeatureFlagBits2KHR} 64bits format feature flag type to extend the existing {@code VkFormatFeatureFlagBits} which is limited to 31 flags. At the time of this writing 29 bits of {@code VkFormatFeatureFlagBits} are already used.

        Because ##VkFormatProperties2 is already defined to extend the Vulkan 1.0 #GetPhysicalDeviceFormatProperties() entry point, this extension defines a new ##VkFormatProperties3KHR to extend the ##VkFormatProperties.

        On top of replicating all the bits from {@code VkFormatFeatureFlagBits}, {@code VkFormatFeatureFlagBits2KHR} adds the following bits :

        <ul>
            <li>#FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT_KHR and #FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT_KHR indicate that an implementation supports respectively reading and writing a given {@code VkFormat} through storage operations without specifying the format in the shader.</li>
            <li>#FORMAT_FEATURE_2_SAMPLED_IMAGE_DEPTH_COMPARISON_BIT_KHR indicates that an implementation supports depth comparison performed by {@code OpImage*Dref} instructions on a given {@code VkFormat}. Previously the result of executing a {@code OpImage*Dref*} instruction on an image view, where the {@code format} was not one of the depth/stencil formats with a depth component, was undefined. This bit clarifies on which formats such instructions can be used.</li>
        </ul>

        <h5>VK_KHR_format_feature_flags2</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_format_feature_flags2}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>361</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Lionel Landwerlin <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_format_feature_flags2]%20@llandwerlin%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_format_feature_flags2%20extension%3E%3E">llandwerlin</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2021-07-01</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Lionel Landwerlin, Intel</li>
                <li>Jason Ekstrand, Intel</li>
                <li>Tobias Hector, AMD</li>
                <li>Spencer Fricke, Samsung Electronics</li>
                <li>Graeme Leese, Broadcom</li>
                <li>Jan-Harald Fredriksen, ARM</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_FORMAT_FEATURE_FLAGS_2_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_FORMAT_FEATURE_FLAGS_2_EXTENSION_NAME".."VK_KHR_format_feature_flags2"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_FORMAT_PROPERTIES_3_KHR".."1000360000"
    )

    EnumConstantLong(
        """
        VkFormatFeatureFlagBits2KHR - Bitmask specifying features supported by a buffer

        <h5>Description</h5>
        The following bits <b>may</b> be set in {@code linearTilingFeatures} and {@code optimalTilingFeatures}, specifying that the features are supported by images ({@code VkImage}) or image views ({@code VkImageView}) or sampler Y′C<sub>B</sub>C<sub>R</sub> conversion objects ({@code VkSamplerYcbcrConversion}) created with the queried #GetPhysicalDeviceFormatProperties2(){@code ::format}:

        <ul>
            <li>#FORMAT_FEATURE_2_SAMPLED_IMAGE_BIT_KHR specifies that an image view <b>can</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-sampledimage">sampled from</a>.</li>
            <li>#FORMAT_FEATURE_2_STORAGE_IMAGE_BIT_KHR specifies that an image view <b>can</b> be used as a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-storageimage">storage image</a>.</li>
            <li>#FORMAT_FEATURE_2_STORAGE_IMAGE_ATOMIC_BIT_KHR specifies that an image view <b>can</b> be used as storage image that supports atomic operations.</li>
            <li>#FORMAT_FEATURE_2_COLOR_ATTACHMENT_BIT_KHR specifies that an image view <b>can</b> be used as a framebuffer color attachment and as an input attachment.</li>
            <li>#FORMAT_FEATURE_2_COLOR_ATTACHMENT_BLEND_BIT_KHR specifies that an image view <b>can</b> be used as a framebuffer color attachment that supports blending and as an input attachment.</li>
            <li>#FORMAT_FEATURE_2_DEPTH_STENCIL_ATTACHMENT_BIT_KHR specifies that an image view <b>can</b> be used as a framebuffer depth/stencil attachment and as an input attachment.</li>
            <li>#FORMAT_FEATURE_2_BLIT_SRC_BIT_KHR specifies that an image <b>can</b> be used as {@code srcImage} for the {@code vkCmdBlitImage2KHR} and {@code vkCmdBlitImage} commands.</li>
            <li>#FORMAT_FEATURE_2_BLIT_DST_BIT_KHR specifies that an image <b>can</b> be used as {@code dstImage} for the {@code vkCmdBlitImage2KHR} and {@code vkCmdBlitImage} commands.</li>
            <li>
                #FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_LINEAR_BIT_KHR specifies that if #FORMAT_FEATURE_2_SAMPLED_IMAGE_BIT_KHR is also set, an image view <b>can</b> be used with a sampler that has either of {@code magFilter} or {@code minFilter} set to #FILTER_LINEAR, or {@code mipmapMode} set to #SAMPLER_MIPMAP_MODE_LINEAR. If #FORMAT_FEATURE_2_BLIT_SRC_BIT_KHR is also set, an image can be used as the {@code srcImage} to {@code vkCmdBlitImage2KHR} and {@code vkCmdBlitImage} with a {@code filter} of #FILTER_LINEAR. This bit <b>must</b> only be exposed for formats that also support the #FORMAT_FEATURE_2_SAMPLED_IMAGE_BIT_KHR or #FORMAT_FEATURE_2_BLIT_SRC_BIT_KHR.
                If the format being queried is a depth/stencil format, this bit only specifies that the depth aspect (not the stencil aspect) of an image of this format supports linear filtering. Where depth comparison is supported it <b>may</b> be linear filtered whether this bit is present or not, but where this bit is not present the filtered value <b>may</b> be computed in an implementation-dependent manner which differs from the normal rules of linear filtering. The resulting value <b>must</b> be in the range <code>[0,1]</code> and <b>should</b> be proportional to, or a weighted average of, the number of comparison passes or failures.
            </li>
            <li>#FORMAT_FEATURE_2_TRANSFER_SRC_BIT_KHR specifies that an image <b>can</b> be used as a source image for <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#copies">copy commands</a>.</li>
            <li>#FORMAT_FEATURE_2_TRANSFER_DST_BIT_KHR specifies that an image <b>can</b> be used as a destination image for <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#copies">copy commands</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#clears">clear commands</a>.</li>
            <li>#FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_MINMAX_BIT_KHR specifies {@code VkImage} <b>can</b> be used as a sampled image with a min or max {@code VkSamplerReductionMode}. This bit <b>must</b> only be exposed for formats that also support the #FORMAT_FEATURE_2_SAMPLED_IMAGE_BIT_KHR.</li>
            <li>#FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT specifies that {@code VkImage} <b>can</b> be used with a sampler that has either of {@code magFilter} or {@code minFilter} set to #FILTER_CUBIC_EXT, or be the source image for a blit with {@code filter} set to #FILTER_CUBIC_EXT. This bit <b>must</b> only be exposed for formats that also support the #FORMAT_FEATURE_2_SAMPLED_IMAGE_BIT_KHR. If the format being queried is a depth/stencil format, this only specifies that the depth aspect is cubic filterable.</li>
            <li>#FORMAT_FEATURE_2_MIDPOINT_CHROMA_SAMPLES_BIT_KHR specifies that an application <b>can</b> define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a> using this format as a source, and that an image of this format <b>can</b> be used with a ##VkSamplerYcbcrConversionCreateInfo {@code xChromaOffset} and/or {@code yChromaOffset} of #CHROMA_LOCATION_MIDPOINT. Otherwise both {@code xChromaOffset} and {@code yChromaOffset} <b>must</b> be #CHROMA_LOCATION_COSITED_EVEN. If a format does not incorporate chroma downsampling (it is not a “422” or “420” format) but the implementation supports sampler Y′C<sub>B</sub>C<sub>R</sub> conversion for this format, the implementation <b>must</b> set #FORMAT_FEATURE_2_MIDPOINT_CHROMA_SAMPLES_BIT_KHR.</li>
            <li>#FORMAT_FEATURE_2_COSITED_CHROMA_SAMPLES_BIT_KHR specifies that an application <b>can</b> define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a> using this format as a source, and that an image of this format <b>can</b> be used with a ##VkSamplerYcbcrConversionCreateInfo {@code xChromaOffset} and/or {@code yChromaOffset} of #CHROMA_LOCATION_COSITED_EVEN. Otherwise both {@code xChromaOffset} and {@code yChromaOffset} <b>must</b> be #CHROMA_LOCATION_MIDPOINT. If neither #FORMAT_FEATURE_2_COSITED_CHROMA_SAMPLES_BIT_KHR nor #FORMAT_FEATURE_2_MIDPOINT_CHROMA_SAMPLES_BIT_KHR is set, the application <b>must</b> not define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a> using this format as a source.</li>
            <li>#FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT_KHR specifies that an application <b>can</b> define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a> using this format as a source with {@code chromaFilter} set to #FILTER_LINEAR.</li>
            <li>#FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT_KHR specifies that the format can have different chroma, min, and mag filters.</li>
            <li>#FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT_KHR specifies that reconstruction is explicit, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#textures-chroma-reconstruction">Chroma Reconstruction</a>. If this bit is not present, reconstruction is implicit by default.</li>
            <li>#FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT_KHR specifies that reconstruction <b>can</b> be forcibly made explicit by setting ##VkSamplerYcbcrConversionCreateInfo{@code ::forceExplicitReconstruction} to #TRUE. If the format being queried supports #FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT_KHR it <b>must</b> also support #FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT_KHR.</li>
            <li>#FORMAT_FEATURE_2_DISJOINT_BIT_KHR specifies that a multi-planar image <b>can</b> have the #IMAGE_CREATE_DISJOINT_BIT set during image creation. An implementation <b>must</b> not set #FORMAT_FEATURE_2_DISJOINT_BIT_KHR for <em>single-plane formats</em>.</li>
            <li>#FORMAT_FEATURE_2_FRAGMENT_DENSITY_MAP_BIT_EXT specifies that an image view <b>can</b> be used as a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#renderpass-fragmentdensitymapattachment">fragment density map attachment</a>.</li>
            <li>#FORMAT_FEATURE_2_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR specifies that an image view <b>can</b> be used as a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#primsrast-fragment-shading-rate-attachment">fragment shading rate attachment</a>. An implementation <b>must</b> not set this feature for formats with numeric type other than {@code *UINT}, or set it as a buffer feature.</li>
            <li>#FORMAT_FEATURE_2_VIDEO_DECODE_OUTPUT_BIT_KHR specifies that an image view with this format <b>can</b> be used as an output for <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#video-decode-operations">video decode operations</a></li>
            <li>#FORMAT_FEATURE_2_VIDEO_DECODE_DPB_BIT_KHR specifies that an image view with this format <b>can</b> be used as a DPB for <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#video-decode-operations">video decode operations</a></li>
            <li>#FORMAT_FEATURE_2_VIDEO_ENCODE_INPUT_BIT_KHR specifies that an image view with this format <b>can</b> be used as an input to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#video-encode-operations">video encode operations</a></li>
            <li>#FORMAT_FEATURE_2_VIDEO_ENCODE_DPB_BIT_KHR specifies that an image view with this format <b>can</b> be used as a DPB for <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#video-encode-operations">video encode operations</a></li>
            <li>#FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT_KHR specifies that image views created with this format <b>can</b> be used as <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-storageimage">storage images</a> for read operations without specifying a format.</li>
            <li>#FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT_KHR specifies that image views created with this format <b>can</b> be used as <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-storageimage">storage images</a> for write operations without specifying a format.</li>
            <li>#FORMAT_FEATURE_2_SAMPLED_IMAGE_DEPTH_COMPARISON_BIT_KHR specifies that image views created with this format <b>can</b> be used for depth comparison performed by {@code OpImage*Dref} instructions.</li>
        </ul>

        The following bits <b>may</b> be set in {@code bufferFeatures}, specifying that the features are supported by buffers ({@code VkBuffer}) or buffer views ({@code VkBufferView}) created with the queried #GetPhysicalDeviceFormatProperties2(){@code ::format}:

        <ul>
            <li>#FORMAT_FEATURE_2_UNIFORM_TEXEL_BUFFER_BIT_KHR specifies that the format <b>can</b> be used to create a buffer view that <b>can</b> be bound to a #DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER descriptor.</li>
            <li>#FORMAT_FEATURE_2_STORAGE_TEXEL_BUFFER_BIT_KHR specifies that the format <b>can</b> be used to create a buffer view that <b>can</b> be bound to a #DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER descriptor.</li>
            <li>#FORMAT_FEATURE_2_STORAGE_TEXEL_BUFFER_ATOMIC_BIT_KHR specifies that atomic operations are supported on #DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER with this format.</li>
            <li>#FORMAT_FEATURE_2_VERTEX_BUFFER_BIT_KHR specifies that the format <b>can</b> be used as a vertex attribute format (##VkVertexInputAttributeDescription{@code ::format}).</li>
            <li>#FORMAT_FEATURE_2_ACCELERATION_STRUCTURE_VERTEX_BUFFER_BIT_KHR specifies that the format <b>can</b> be used as the vertex format when creating an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#acceleration-structure">acceleration structure</a> (##VkAccelerationStructureGeometryTrianglesDataKHR{@code ::vertexFormat}). This format <b>can</b> also be used as the vertex format in host memory when doing <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#host-acceleration-structure">host acceleration structure</a> builds.</li>
        </ul>
        """,

        "FORMAT_FEATURE_2_SAMPLED_IMAGE_BIT_KHR".enum(0x00000001L),
        "FORMAT_FEATURE_2_STORAGE_IMAGE_BIT_KHR".enum(0x00000002L),
        "FORMAT_FEATURE_2_STORAGE_IMAGE_ATOMIC_BIT_KHR".enum(0x00000004L),
        "FORMAT_FEATURE_2_UNIFORM_TEXEL_BUFFER_BIT_KHR".enum(0x00000008L),
        "FORMAT_FEATURE_2_STORAGE_TEXEL_BUFFER_BIT_KHR".enum(0x00000010L),
        "FORMAT_FEATURE_2_STORAGE_TEXEL_BUFFER_ATOMIC_BIT_KHR".enum(0x00000020L),
        "FORMAT_FEATURE_2_VERTEX_BUFFER_BIT_KHR".enum(0x00000040L),
        "FORMAT_FEATURE_2_COLOR_ATTACHMENT_BIT_KHR".enum(0x00000080L),
        "FORMAT_FEATURE_2_COLOR_ATTACHMENT_BLEND_BIT_KHR".enum(0x00000100L),
        "FORMAT_FEATURE_2_DEPTH_STENCIL_ATTACHMENT_BIT_KHR".enum(0x00000200L),
        "FORMAT_FEATURE_2_BLIT_SRC_BIT_KHR".enum(0x00000400L),
        "FORMAT_FEATURE_2_BLIT_DST_BIT_KHR".enum(0x00000800L),
        "FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_LINEAR_BIT_KHR".enum(0x00001000L),
        "FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT".enum(0x00002000L),
        "FORMAT_FEATURE_2_TRANSFER_SRC_BIT_KHR".enum(0x00004000L),
        "FORMAT_FEATURE_2_TRANSFER_DST_BIT_KHR".enum(0x00008000L),
        "FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_MINMAX_BIT_KHR".enum(0x00010000L),
        "FORMAT_FEATURE_2_MIDPOINT_CHROMA_SAMPLES_BIT_KHR".enum(0x00020000L),
        "FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT_KHR".enum(0x00040000L),
        "FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT_KHR".enum(0x00080000L),
        "FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT_KHR".enum(0x00100000L),
        "FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT_KHR".enum(0x00200000L),
        "FORMAT_FEATURE_2_DISJOINT_BIT_KHR".enum(0x00400000L),
        "FORMAT_FEATURE_2_COSITED_CHROMA_SAMPLES_BIT_KHR".enum(0x00800000L),
        "FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT_KHR".enum(0x80000000L),
        "FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT_KHR".enum(0x100000000L),
        "FORMAT_FEATURE_2_SAMPLED_IMAGE_DEPTH_COMPARISON_BIT_KHR".enum(0x200000000L)
    )
}