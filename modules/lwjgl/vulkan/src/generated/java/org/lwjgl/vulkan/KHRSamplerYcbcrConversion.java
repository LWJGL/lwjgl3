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
 * The use of Y′C<sub>B</sub>C<sub>R</sub> sampler conversion is an area in 3D graphics not used by most Vulkan developers. It is mainly used for processing inputs from video decoders and cameras. The use of the extension assumes basic knowledge of Y′C<sub>B</sub>C<sub>R</sub> concepts.
 * 
 * <p>This extension provides the ability to perform specified color space conversions during texture sampling operations for the Y′C<sub>B</sub>C<sub>R</sub> color space natively. It also adds a selection of multi-planar formats, image aspect plane, and the ability to bind memory to the planes of an image collectively or separately.</p>
 * 
 * <h5>Promotion to Vulkan 1.1</h5>
 * 
 * <p>All functionality in this extension is included in core Vulkan 1.1, with the KHR suffix omitted. However, if Vulkan 1.1 is supported and this extension is not, the {@code samplerYcbcrConversion} capability is optional. The original type, enum and command names are still available as aliases of the core functionality.</p>
 * 
 * <h5>VK_KHR_sampler_ycbcr_conversion</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_sampler_ycbcr_conversion}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>157</dd>
 * <dt><b>Revision</b></dt>
 * <dd>14</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRMaintenance1 VK_KHR_maintenance1}</li>
 * <li>Requires {@link KHRBindMemory2 VK_KHR_bind_memory2}</li>
 * <li>Requires {@link KHRGetMemoryRequirements2 VK_KHR_get_memory_requirements2}</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * </ul></dd>
 * <dt><b>Deprecation state</b></dt>
 * <dd><ul>
 * <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#versions-1.1-promotions">Vulkan 1.1</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Andrew Garrard <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_sampler_ycbcr_conversion]%20@fluppeteer%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_sampler_ycbcr_conversion%20extension%3E%3E">fluppeteer</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2017-08-11</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>Promoted to Vulkan 1.1 Core</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Andrew Garrard, Samsung Electronics</li>
 * <li>Tobias Hector, Imagination Technologies</li>
 * <li>James Jones, NVIDIA</li>
 * <li>Daniel Koch, NVIDIA</li>
 * <li>Daniel Rakos, AMD</li>
 * <li>Romain Guy, Google</li>
 * <li>Jesse Hall, Google</li>
 * <li>Tom Cooksey, ARM Ltd</li>
 * <li>Jeff Leger, Qualcomm Technologies, Inc</li>
 * <li>Jan-Harald Fredriksen, ARM Ltd</li>
 * <li>Jan Outters, Samsung Electronics</li>
 * <li>Alon Or-bach, Samsung Electronics</li>
 * <li>Michael Worcester, Imagination Technologies</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Tony Zlatinski, NVIDIA</li>
 * <li>Matthew Netsch, Qualcomm Technologies, Inc</li>
 * </ul></dd>
 * </dl>
 */
public class KHRSamplerYcbcrConversion {

    /** The extension specification version. */
    public static final int VK_KHR_SAMPLER_YCBCR_CONVERSION_SPEC_VERSION = 14;

    /** The extension name. */
    public static final String VK_KHR_SAMPLER_YCBCR_CONVERSION_EXTENSION_NAME = "VK_KHR_sampler_ycbcr_conversion";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_CREATE_INFO_KHR STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_CREATE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_INFO_KHR STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_BIND_IMAGE_PLANE_MEMORY_INFO_KHR STRUCTURE_TYPE_BIND_IMAGE_PLANE_MEMORY_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_IMAGE_PLANE_MEMORY_REQUIREMENTS_INFO_KHR STRUCTURE_TYPE_IMAGE_PLANE_MEMORY_REQUIREMENTS_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_YCBCR_CONVERSION_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_YCBCR_CONVERSION_FEATURES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_IMAGE_FORMAT_PROPERTIES_KHR STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_IMAGE_FORMAT_PROPERTIES_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_CREATE_INFO_KHR              = 1000156000,
        VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_INFO_KHR                     = 1000156001,
        VK_STRUCTURE_TYPE_BIND_IMAGE_PLANE_MEMORY_INFO_KHR                      = 1000156002,
        VK_STRUCTURE_TYPE_IMAGE_PLANE_MEMORY_REQUIREMENTS_INFO_KHR              = 1000156003,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_YCBCR_CONVERSION_FEATURES_KHR = 1000156004,
        VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_IMAGE_FORMAT_PROPERTIES_KHR  = 1000156005;

    /** Extends {@code VkDebugReportObjectTypeEXT}. */
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_KHR_EXT = 1000156000;

    /** Extends {@code VkObjectType}. */
    public static final int VK_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_KHR = 1000156000;

    /**
     * Extends {@code VkFormat}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_FORMAT_G8B8G8R8_422_UNORM_KHR FORMAT_G8B8G8R8_422_UNORM_KHR}</li>
     * <li>{@link #VK_FORMAT_B8G8R8G8_422_UNORM_KHR FORMAT_B8G8R8G8_422_UNORM_KHR}</li>
     * <li>{@link #VK_FORMAT_G8_B8_R8_3PLANE_420_UNORM_KHR FORMAT_G8_B8_R8_3PLANE_420_UNORM_KHR}</li>
     * <li>{@link #VK_FORMAT_G8_B8R8_2PLANE_420_UNORM_KHR FORMAT_G8_B8R8_2PLANE_420_UNORM_KHR}</li>
     * <li>{@link #VK_FORMAT_G8_B8_R8_3PLANE_422_UNORM_KHR FORMAT_G8_B8_R8_3PLANE_422_UNORM_KHR}</li>
     * <li>{@link #VK_FORMAT_G8_B8R8_2PLANE_422_UNORM_KHR FORMAT_G8_B8R8_2PLANE_422_UNORM_KHR}</li>
     * <li>{@link #VK_FORMAT_G8_B8_R8_3PLANE_444_UNORM_KHR FORMAT_G8_B8_R8_3PLANE_444_UNORM_KHR}</li>
     * <li>{@link #VK_FORMAT_R10X6_UNORM_PACK16_KHR FORMAT_R10X6_UNORM_PACK16_KHR}</li>
     * <li>{@link #VK_FORMAT_R10X6G10X6_UNORM_2PACK16_KHR FORMAT_R10X6G10X6_UNORM_2PACK16_KHR}</li>
     * <li>{@link #VK_FORMAT_R10X6G10X6B10X6A10X6_UNORM_4PACK16_KHR FORMAT_R10X6G10X6B10X6A10X6_UNORM_4PACK16_KHR}</li>
     * <li>{@link #VK_FORMAT_G10X6B10X6G10X6R10X6_422_UNORM_4PACK16_KHR FORMAT_G10X6B10X6G10X6R10X6_422_UNORM_4PACK16_KHR}</li>
     * <li>{@link #VK_FORMAT_B10X6G10X6R10X6G10X6_422_UNORM_4PACK16_KHR FORMAT_B10X6G10X6R10X6G10X6_422_UNORM_4PACK16_KHR}</li>
     * <li>{@link #VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_420_UNORM_3PACK16_KHR FORMAT_G10X6_B10X6_R10X6_3PLANE_420_UNORM_3PACK16_KHR}</li>
     * <li>{@link #VK_FORMAT_G10X6_B10X6R10X6_2PLANE_420_UNORM_3PACK16_KHR FORMAT_G10X6_B10X6R10X6_2PLANE_420_UNORM_3PACK16_KHR}</li>
     * <li>{@link #VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_422_UNORM_3PACK16_KHR FORMAT_G10X6_B10X6_R10X6_3PLANE_422_UNORM_3PACK16_KHR}</li>
     * <li>{@link #VK_FORMAT_G10X6_B10X6R10X6_2PLANE_422_UNORM_3PACK16_KHR FORMAT_G10X6_B10X6R10X6_2PLANE_422_UNORM_3PACK16_KHR}</li>
     * <li>{@link #VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_444_UNORM_3PACK16_KHR FORMAT_G10X6_B10X6_R10X6_3PLANE_444_UNORM_3PACK16_KHR}</li>
     * <li>{@link #VK_FORMAT_R12X4_UNORM_PACK16_KHR FORMAT_R12X4_UNORM_PACK16_KHR}</li>
     * <li>{@link #VK_FORMAT_R12X4G12X4_UNORM_2PACK16_KHR FORMAT_R12X4G12X4_UNORM_2PACK16_KHR}</li>
     * <li>{@link #VK_FORMAT_R12X4G12X4B12X4A12X4_UNORM_4PACK16_KHR FORMAT_R12X4G12X4B12X4A12X4_UNORM_4PACK16_KHR}</li>
     * <li>{@link #VK_FORMAT_G12X4B12X4G12X4R12X4_422_UNORM_4PACK16_KHR FORMAT_G12X4B12X4G12X4R12X4_422_UNORM_4PACK16_KHR}</li>
     * <li>{@link #VK_FORMAT_B12X4G12X4R12X4G12X4_422_UNORM_4PACK16_KHR FORMAT_B12X4G12X4R12X4G12X4_422_UNORM_4PACK16_KHR}</li>
     * <li>{@link #VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_420_UNORM_3PACK16_KHR FORMAT_G12X4_B12X4_R12X4_3PLANE_420_UNORM_3PACK16_KHR}</li>
     * <li>{@link #VK_FORMAT_G12X4_B12X4R12X4_2PLANE_420_UNORM_3PACK16_KHR FORMAT_G12X4_B12X4R12X4_2PLANE_420_UNORM_3PACK16_KHR}</li>
     * <li>{@link #VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_422_UNORM_3PACK16_KHR FORMAT_G12X4_B12X4_R12X4_3PLANE_422_UNORM_3PACK16_KHR}</li>
     * <li>{@link #VK_FORMAT_G12X4_B12X4R12X4_2PLANE_422_UNORM_3PACK16_KHR FORMAT_G12X4_B12X4R12X4_2PLANE_422_UNORM_3PACK16_KHR}</li>
     * <li>{@link #VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_444_UNORM_3PACK16_KHR FORMAT_G12X4_B12X4_R12X4_3PLANE_444_UNORM_3PACK16_KHR}</li>
     * <li>{@link #VK_FORMAT_G16B16G16R16_422_UNORM_KHR FORMAT_G16B16G16R16_422_UNORM_KHR}</li>
     * <li>{@link #VK_FORMAT_B16G16R16G16_422_UNORM_KHR FORMAT_B16G16R16G16_422_UNORM_KHR}</li>
     * <li>{@link #VK_FORMAT_G16_B16_R16_3PLANE_420_UNORM_KHR FORMAT_G16_B16_R16_3PLANE_420_UNORM_KHR}</li>
     * <li>{@link #VK_FORMAT_G16_B16R16_2PLANE_420_UNORM_KHR FORMAT_G16_B16R16_2PLANE_420_UNORM_KHR}</li>
     * <li>{@link #VK_FORMAT_G16_B16_R16_3PLANE_422_UNORM_KHR FORMAT_G16_B16_R16_3PLANE_422_UNORM_KHR}</li>
     * <li>{@link #VK_FORMAT_G16_B16R16_2PLANE_422_UNORM_KHR FORMAT_G16_B16R16_2PLANE_422_UNORM_KHR}</li>
     * <li>{@link #VK_FORMAT_G16_B16_R16_3PLANE_444_UNORM_KHR FORMAT_G16_B16_R16_3PLANE_444_UNORM_KHR}</li>
     * </ul>
     */
    public static final int
        VK_FORMAT_G8B8G8R8_422_UNORM_KHR                         = 1000156000,
        VK_FORMAT_B8G8R8G8_422_UNORM_KHR                         = 1000156001,
        VK_FORMAT_G8_B8_R8_3PLANE_420_UNORM_KHR                  = 1000156002,
        VK_FORMAT_G8_B8R8_2PLANE_420_UNORM_KHR                   = 1000156003,
        VK_FORMAT_G8_B8_R8_3PLANE_422_UNORM_KHR                  = 1000156004,
        VK_FORMAT_G8_B8R8_2PLANE_422_UNORM_KHR                   = 1000156005,
        VK_FORMAT_G8_B8_R8_3PLANE_444_UNORM_KHR                  = 1000156006,
        VK_FORMAT_R10X6_UNORM_PACK16_KHR                         = 1000156007,
        VK_FORMAT_R10X6G10X6_UNORM_2PACK16_KHR                   = 1000156008,
        VK_FORMAT_R10X6G10X6B10X6A10X6_UNORM_4PACK16_KHR         = 1000156009,
        VK_FORMAT_G10X6B10X6G10X6R10X6_422_UNORM_4PACK16_KHR     = 1000156010,
        VK_FORMAT_B10X6G10X6R10X6G10X6_422_UNORM_4PACK16_KHR     = 1000156011,
        VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_420_UNORM_3PACK16_KHR = 1000156012,
        VK_FORMAT_G10X6_B10X6R10X6_2PLANE_420_UNORM_3PACK16_KHR  = 1000156013,
        VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_422_UNORM_3PACK16_KHR = 1000156014,
        VK_FORMAT_G10X6_B10X6R10X6_2PLANE_422_UNORM_3PACK16_KHR  = 1000156015,
        VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_444_UNORM_3PACK16_KHR = 1000156016,
        VK_FORMAT_R12X4_UNORM_PACK16_KHR                         = 1000156017,
        VK_FORMAT_R12X4G12X4_UNORM_2PACK16_KHR                   = 1000156018,
        VK_FORMAT_R12X4G12X4B12X4A12X4_UNORM_4PACK16_KHR         = 1000156019,
        VK_FORMAT_G12X4B12X4G12X4R12X4_422_UNORM_4PACK16_KHR     = 1000156020,
        VK_FORMAT_B12X4G12X4R12X4G12X4_422_UNORM_4PACK16_KHR     = 1000156021,
        VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_420_UNORM_3PACK16_KHR = 1000156022,
        VK_FORMAT_G12X4_B12X4R12X4_2PLANE_420_UNORM_3PACK16_KHR  = 1000156023,
        VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_422_UNORM_3PACK16_KHR = 1000156024,
        VK_FORMAT_G12X4_B12X4R12X4_2PLANE_422_UNORM_3PACK16_KHR  = 1000156025,
        VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_444_UNORM_3PACK16_KHR = 1000156026,
        VK_FORMAT_G16B16G16R16_422_UNORM_KHR                     = 1000156027,
        VK_FORMAT_B16G16R16G16_422_UNORM_KHR                     = 1000156028,
        VK_FORMAT_G16_B16_R16_3PLANE_420_UNORM_KHR               = 1000156029,
        VK_FORMAT_G16_B16R16_2PLANE_420_UNORM_KHR                = 1000156030,
        VK_FORMAT_G16_B16_R16_3PLANE_422_UNORM_KHR               = 1000156031,
        VK_FORMAT_G16_B16R16_2PLANE_422_UNORM_KHR                = 1000156032,
        VK_FORMAT_G16_B16_R16_3PLANE_444_UNORM_KHR               = 1000156033;

    /**
     * Extends {@code VkImageAspectFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_IMAGE_ASPECT_PLANE_0_BIT_KHR IMAGE_ASPECT_PLANE_0_BIT_KHR}</li>
     * <li>{@link #VK_IMAGE_ASPECT_PLANE_1_BIT_KHR IMAGE_ASPECT_PLANE_1_BIT_KHR}</li>
     * <li>{@link #VK_IMAGE_ASPECT_PLANE_2_BIT_KHR IMAGE_ASPECT_PLANE_2_BIT_KHR}</li>
     * </ul>
     */
    public static final int
        VK_IMAGE_ASPECT_PLANE_0_BIT_KHR = 0x10,
        VK_IMAGE_ASPECT_PLANE_1_BIT_KHR = 0x20,
        VK_IMAGE_ASPECT_PLANE_2_BIT_KHR = 0x40;

    /** Extends {@code VkImageCreateFlagBits}. */
    public static final int VK_IMAGE_CREATE_DISJOINT_BIT_KHR = 0x200;

    /**
     * Extends {@code VkFormatFeatureFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT_KHR FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT_KHR}</li>
     * <li>{@link #VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT_KHR FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT_KHR}</li>
     * <li>{@link #VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT_KHR FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT_KHR}</li>
     * <li>{@link #VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT_KHR FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT_KHR}</li>
     * <li>{@link #VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT_KHR FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT_KHR}</li>
     * <li>{@link #VK_FORMAT_FEATURE_DISJOINT_BIT_KHR FORMAT_FEATURE_DISJOINT_BIT_KHR}</li>
     * <li>{@link #VK_FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT_KHR FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT_KHR}</li>
     * </ul>
     */
    public static final int
        VK_FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT_KHR                                                 = 0x20000,
        VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT_KHR                            = 0x40000,
        VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT_KHR           = 0x80000,
        VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT_KHR           = 0x100000,
        VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT_KHR = 0x200000,
        VK_FORMAT_FEATURE_DISJOINT_BIT_KHR                                                                = 0x400000,
        VK_FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT_KHR                                                  = 0x800000;

    /**
     * Extends {@code VkSamplerYcbcrModelConversion}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY_KHR SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY_KHR}</li>
     * <li>{@link #VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY_KHR SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY_KHR}</li>
     * <li>{@link #VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_709_KHR SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_709_KHR}</li>
     * <li>{@link #VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_601_KHR SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_601_KHR}</li>
     * <li>{@link #VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_2020_KHR SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_2020_KHR}</li>
     * </ul>
     */
    public static final int
        VK_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY_KHR   = 0,
        VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY_KHR = 1,
        VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_709_KHR      = 2,
        VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_601_KHR      = 3,
        VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_2020_KHR     = 4;

    /**
     * Extends {@code VkSamplerYcbcrRange}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_SAMPLER_YCBCR_RANGE_ITU_FULL_KHR SAMPLER_YCBCR_RANGE_ITU_FULL_KHR}</li>
     * <li>{@link #VK_SAMPLER_YCBCR_RANGE_ITU_NARROW_KHR SAMPLER_YCBCR_RANGE_ITU_NARROW_KHR}</li>
     * </ul>
     */
    public static final int
        VK_SAMPLER_YCBCR_RANGE_ITU_FULL_KHR   = 0,
        VK_SAMPLER_YCBCR_RANGE_ITU_NARROW_KHR = 1;

    /**
     * Extends {@code VkChromaLocation}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_CHROMA_LOCATION_COSITED_EVEN_KHR CHROMA_LOCATION_COSITED_EVEN_KHR}</li>
     * <li>{@link #VK_CHROMA_LOCATION_MIDPOINT_KHR CHROMA_LOCATION_MIDPOINT_KHR}</li>
     * </ul>
     */
    public static final int
        VK_CHROMA_LOCATION_COSITED_EVEN_KHR = 0,
        VK_CHROMA_LOCATION_MIDPOINT_KHR     = 1;

    /** Extends {@code VkDebugReportObjectTypeEXT}. */
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_EXT = 1000156000;

    protected KHRSamplerYcbcrConversion() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCreateSamplerYcbcrConversionKHR ] ---

    /** Unsafe version of: {@link #vkCreateSamplerYcbcrConversionKHR CreateSamplerYcbcrConversionKHR} */
    public static int nvkCreateSamplerYcbcrConversionKHR(VkDevice device, long pCreateInfo, long pAllocator, long pYcbcrConversion) {
        long __functionAddress = device.getCapabilities().vkCreateSamplerYcbcrConversionKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pYcbcrConversion, __functionAddress);
    }

    /**
     * See {@link VK11#vkCreateSamplerYcbcrConversion CreateSamplerYcbcrConversion}.
     *
     * @param device           the logical device that creates the sampler Y′C<sub>B</sub>C<sub>R</sub> conversion.
     * @param pCreateInfo      a pointer to a {@link VkSamplerYcbcrConversionCreateInfo} structure specifying the requested sampler Y′C<sub>B</sub>C<sub>R</sub> conversion.
     * @param pAllocator       controls host memory allocation as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     * @param pYcbcrConversion a pointer to a {@code VkSamplerYcbcrConversion} handle in which the resulting sampler Y′C<sub>B</sub>C<sub>R</sub> conversion is returned.
     */
    @NativeType("VkResult")
    public static int vkCreateSamplerYcbcrConversionKHR(VkDevice device, @NativeType("VkSamplerYcbcrConversionCreateInfo const *") VkSamplerYcbcrConversionCreateInfo pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkSamplerYcbcrConversion *") LongBuffer pYcbcrConversion) {
        if (CHECKS) {
            check(pYcbcrConversion, 1);
        }
        return nvkCreateSamplerYcbcrConversionKHR(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pYcbcrConversion));
    }

    // --- [ vkDestroySamplerYcbcrConversionKHR ] ---

    /** Unsafe version of: {@link #vkDestroySamplerYcbcrConversionKHR DestroySamplerYcbcrConversionKHR} */
    public static void nvkDestroySamplerYcbcrConversionKHR(VkDevice device, long ycbcrConversion, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroySamplerYcbcrConversionKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), ycbcrConversion, pAllocator, __functionAddress);
    }

    /**
     * See {@link VK11#vkDestroySamplerYcbcrConversion DestroySamplerYcbcrConversion}.
     *
     * @param device          the logical device that destroys the Y′C<sub>B</sub>C<sub>R</sub> conversion.
     * @param ycbcrConversion the conversion to destroy.
     * @param pAllocator      controls host memory allocation as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     */
    public static void vkDestroySamplerYcbcrConversionKHR(VkDevice device, @NativeType("VkSamplerYcbcrConversion") long ycbcrConversion, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroySamplerYcbcrConversionKHR(device, ycbcrConversion, memAddressSafe(pAllocator));
    }

    /** Array version of: {@link #vkCreateSamplerYcbcrConversionKHR CreateSamplerYcbcrConversionKHR} */
    @NativeType("VkResult")
    public static int vkCreateSamplerYcbcrConversionKHR(VkDevice device, @NativeType("VkSamplerYcbcrConversionCreateInfo const *") VkSamplerYcbcrConversionCreateInfo pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkSamplerYcbcrConversion *") long[] pYcbcrConversion) {
        long __functionAddress = device.getCapabilities().vkCreateSamplerYcbcrConversionKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pYcbcrConversion, 1);
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pYcbcrConversion, __functionAddress);
    }

}