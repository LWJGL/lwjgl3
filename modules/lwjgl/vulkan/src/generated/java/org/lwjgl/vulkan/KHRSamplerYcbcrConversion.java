/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class KHRSamplerYcbcrConversion {

    public static final int VK_KHR_SAMPLER_YCBCR_CONVERSION_SPEC_VERSION = 14;

    public static final String VK_KHR_SAMPLER_YCBCR_CONVERSION_EXTENSION_NAME = "VK_KHR_sampler_ycbcr_conversion";

    public static final int
        VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_CREATE_INFO_KHR              = 1000156000,
        VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_INFO_KHR                     = 1000156001,
        VK_STRUCTURE_TYPE_BIND_IMAGE_PLANE_MEMORY_INFO_KHR                      = 1000156002,
        VK_STRUCTURE_TYPE_IMAGE_PLANE_MEMORY_REQUIREMENTS_INFO_KHR              = 1000156003,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_YCBCR_CONVERSION_FEATURES_KHR = 1000156004,
        VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_IMAGE_FORMAT_PROPERTIES_KHR  = 1000156005;

    public static final int VK_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_KHR = 1000156000;

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

    public static final int
        VK_IMAGE_ASPECT_PLANE_0_BIT_KHR = 0x10,
        VK_IMAGE_ASPECT_PLANE_1_BIT_KHR = 0x20,
        VK_IMAGE_ASPECT_PLANE_2_BIT_KHR = 0x40;

    public static final int VK_IMAGE_CREATE_DISJOINT_BIT_KHR = 0x200;

    public static final int
        VK_FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT_KHR                                                 = 0x20000,
        VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT_KHR                            = 0x40000,
        VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT_KHR           = 0x80000,
        VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT_KHR           = 0x100000,
        VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT_KHR = 0x200000,
        VK_FORMAT_FEATURE_DISJOINT_BIT_KHR                                                                = 0x400000,
        VK_FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT_KHR                                                  = 0x800000;

    public static final int
        VK_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY_KHR   = 0,
        VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY_KHR = 1,
        VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_709_KHR      = 2,
        VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_601_KHR      = 3,
        VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_2020_KHR     = 4;

    public static final int
        VK_SAMPLER_YCBCR_RANGE_ITU_FULL_KHR   = 0,
        VK_SAMPLER_YCBCR_RANGE_ITU_NARROW_KHR = 1;

    public static final int
        VK_CHROMA_LOCATION_COSITED_EVEN_KHR = 0,
        VK_CHROMA_LOCATION_MIDPOINT_KHR     = 1;

    public static final int
        VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_EXT     = 1000156000,
        VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_KHR_EXT = 1000156000;

    protected KHRSamplerYcbcrConversion() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCreateSamplerYcbcrConversionKHR ] ---

    /** {@code VkResult vkCreateSamplerYcbcrConversionKHR(VkDevice device, VkSamplerYcbcrConversionCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkSamplerYcbcrConversion * pYcbcrConversion)} */
    public static int nvkCreateSamplerYcbcrConversionKHR(VkDevice device, long pCreateInfo, long pAllocator, long pYcbcrConversion) {
        long __functionAddress = device.getCapabilities().vkCreateSamplerYcbcrConversionKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pYcbcrConversion, __functionAddress);
    }

    /** {@code VkResult vkCreateSamplerYcbcrConversionKHR(VkDevice device, VkSamplerYcbcrConversionCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkSamplerYcbcrConversion * pYcbcrConversion)} */
    @NativeType("VkResult")
    public static int vkCreateSamplerYcbcrConversionKHR(VkDevice device, @NativeType("VkSamplerYcbcrConversionCreateInfo const *") VkSamplerYcbcrConversionCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkSamplerYcbcrConversion *") LongBuffer pYcbcrConversion) {
        if (CHECKS) {
            check(pYcbcrConversion, 1);
        }
        return nvkCreateSamplerYcbcrConversionKHR(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pYcbcrConversion));
    }

    // --- [ vkDestroySamplerYcbcrConversionKHR ] ---

    /** {@code void vkDestroySamplerYcbcrConversionKHR(VkDevice device, VkSamplerYcbcrConversion ycbcrConversion, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroySamplerYcbcrConversionKHR(VkDevice device, long ycbcrConversion, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroySamplerYcbcrConversionKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), ycbcrConversion, pAllocator, __functionAddress);
    }

    /** {@code void vkDestroySamplerYcbcrConversionKHR(VkDevice device, VkSamplerYcbcrConversion ycbcrConversion, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroySamplerYcbcrConversionKHR(VkDevice device, @NativeType("VkSamplerYcbcrConversion") long ycbcrConversion, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroySamplerYcbcrConversionKHR(device, ycbcrConversion, memAddressSafe(pAllocator));
    }

    /** {@code VkResult vkCreateSamplerYcbcrConversionKHR(VkDevice device, VkSamplerYcbcrConversionCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkSamplerYcbcrConversion * pYcbcrConversion)} */
    @NativeType("VkResult")
    public static int vkCreateSamplerYcbcrConversionKHR(VkDevice device, @NativeType("VkSamplerYcbcrConversionCreateInfo const *") VkSamplerYcbcrConversionCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkSamplerYcbcrConversion *") long[] pYcbcrConversion) {
        long __functionAddress = device.getCapabilities().vkCreateSamplerYcbcrConversionKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pYcbcrConversion, 1);
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pYcbcrConversion, __functionAddress);
    }

}