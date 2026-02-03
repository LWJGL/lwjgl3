/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class VK10 {

    public static final int
        VK_SUCCESS                     = 0,
        VK_NOT_READY                   = 1,
        VK_TIMEOUT                     = 2,
        VK_EVENT_SET                   = 3,
        VK_EVENT_RESET                 = 4,
        VK_INCOMPLETE                  = 5,
        VK_ERROR_OUT_OF_HOST_MEMORY    = -1,
        VK_ERROR_OUT_OF_DEVICE_MEMORY  = -2,
        VK_ERROR_INITIALIZATION_FAILED = -3,
        VK_ERROR_DEVICE_LOST           = -4,
        VK_ERROR_MEMORY_MAP_FAILED     = -5,
        VK_ERROR_LAYER_NOT_PRESENT     = -6,
        VK_ERROR_EXTENSION_NOT_PRESENT = -7,
        VK_ERROR_FEATURE_NOT_PRESENT   = -8,
        VK_ERROR_INCOMPATIBLE_DRIVER   = -9,
        VK_ERROR_TOO_MANY_OBJECTS      = -10,
        VK_ERROR_FORMAT_NOT_SUPPORTED  = -11,
        VK_ERROR_FRAGMENTED_POOL       = -12,
        VK_ERROR_UNKNOWN               = -13,
        VK_ERROR_VALIDATION_FAILED     = -1000011001;

    public static final int
        VK_STRUCTURE_TYPE_APPLICATION_INFO                          = 0,
        VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO                      = 1,
        VK_STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO                  = 2,
        VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO                        = 3,
        VK_STRUCTURE_TYPE_SUBMIT_INFO                               = 4,
        VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO                      = 5,
        VK_STRUCTURE_TYPE_MAPPED_MEMORY_RANGE                       = 6,
        VK_STRUCTURE_TYPE_BIND_SPARSE_INFO                          = 7,
        VK_STRUCTURE_TYPE_FENCE_CREATE_INFO                         = 8,
        VK_STRUCTURE_TYPE_SEMAPHORE_CREATE_INFO                     = 9,
        VK_STRUCTURE_TYPE_EVENT_CREATE_INFO                         = 10,
        VK_STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO                    = 11,
        VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO                        = 12,
        VK_STRUCTURE_TYPE_BUFFER_VIEW_CREATE_INFO                   = 13,
        VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO                         = 14,
        VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO                    = 15,
        VK_STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO                 = 16,
        VK_STRUCTURE_TYPE_PIPELINE_CACHE_CREATE_INFO                = 17,
        VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO         = 18,
        VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO   = 19,
        VK_STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO = 20,
        VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_STATE_CREATE_INFO   = 21,
        VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO       = 22,
        VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO  = 23,
        VK_STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO    = 24,
        VK_STRUCTURE_TYPE_PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO  = 25,
        VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO    = 26,
        VK_STRUCTURE_TYPE_PIPELINE_DYNAMIC_STATE_CREATE_INFO        = 27,
        VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO             = 28,
        VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_CREATE_INFO              = 29,
        VK_STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO               = 30,
        VK_STRUCTURE_TYPE_SAMPLER_CREATE_INFO                       = 31,
        VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO         = 32,
        VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO               = 33,
        VK_STRUCTURE_TYPE_DESCRIPTOR_SET_ALLOCATE_INFO              = 34,
        VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET                      = 35,
        VK_STRUCTURE_TYPE_COPY_DESCRIPTOR_SET                       = 36,
        VK_STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO                   = 37,
        VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO                   = 38,
        VK_STRUCTURE_TYPE_COMMAND_POOL_CREATE_INFO                  = 39,
        VK_STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO              = 40,
        VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO           = 41,
        VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO                 = 42,
        VK_STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO                    = 43,
        VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER                     = 44,
        VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER                      = 45,
        VK_STRUCTURE_TYPE_MEMORY_BARRIER                            = 46,
        VK_STRUCTURE_TYPE_LOADER_INSTANCE_CREATE_INFO               = 47,
        VK_STRUCTURE_TYPE_LOADER_DEVICE_CREATE_INFO                 = 48;

    public static final int
        VK_ACCESS_INDIRECT_COMMAND_READ_BIT          = 0x1,
        VK_ACCESS_INDEX_READ_BIT                     = 0x2,
        VK_ACCESS_VERTEX_ATTRIBUTE_READ_BIT          = 0x4,
        VK_ACCESS_UNIFORM_READ_BIT                   = 0x8,
        VK_ACCESS_INPUT_ATTACHMENT_READ_BIT          = 0x10,
        VK_ACCESS_SHADER_READ_BIT                    = 0x20,
        VK_ACCESS_SHADER_WRITE_BIT                   = 0x40,
        VK_ACCESS_COLOR_ATTACHMENT_READ_BIT          = 0x80,
        VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT         = 0x100,
        VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT  = 0x200,
        VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT = 0x400,
        VK_ACCESS_TRANSFER_READ_BIT                  = 0x800,
        VK_ACCESS_TRANSFER_WRITE_BIT                 = 0x1000,
        VK_ACCESS_HOST_READ_BIT                      = 0x2000,
        VK_ACCESS_HOST_WRITE_BIT                     = 0x4000,
        VK_ACCESS_MEMORY_READ_BIT                    = 0x8000,
        VK_ACCESS_MEMORY_WRITE_BIT                   = 0x10000;

    public static final int
        VK_IMAGE_LAYOUT_UNDEFINED                        = 0,
        VK_IMAGE_LAYOUT_GENERAL                          = 1,
        VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL         = 2,
        VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL = 3,
        VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL  = 4,
        VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL         = 5,
        VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL             = 6,
        VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL             = 7,
        VK_IMAGE_LAYOUT_PREINITIALIZED                   = 8;

    public static final int
        VK_IMAGE_ASPECT_COLOR_BIT    = 0x1,
        VK_IMAGE_ASPECT_DEPTH_BIT    = 0x2,
        VK_IMAGE_ASPECT_STENCIL_BIT  = 0x4,
        VK_IMAGE_ASPECT_METADATA_BIT = 0x8;

    public static final int
        VK_OBJECT_TYPE_UNKNOWN               = 0,
        VK_OBJECT_TYPE_INSTANCE              = 1,
        VK_OBJECT_TYPE_PHYSICAL_DEVICE       = 2,
        VK_OBJECT_TYPE_DEVICE                = 3,
        VK_OBJECT_TYPE_QUEUE                 = 4,
        VK_OBJECT_TYPE_SEMAPHORE             = 5,
        VK_OBJECT_TYPE_COMMAND_BUFFER        = 6,
        VK_OBJECT_TYPE_FENCE                 = 7,
        VK_OBJECT_TYPE_DEVICE_MEMORY         = 8,
        VK_OBJECT_TYPE_BUFFER                = 9,
        VK_OBJECT_TYPE_IMAGE                 = 10,
        VK_OBJECT_TYPE_EVENT                 = 11,
        VK_OBJECT_TYPE_QUERY_POOL            = 12,
        VK_OBJECT_TYPE_BUFFER_VIEW           = 13,
        VK_OBJECT_TYPE_IMAGE_VIEW            = 14,
        VK_OBJECT_TYPE_SHADER_MODULE         = 15,
        VK_OBJECT_TYPE_PIPELINE_CACHE        = 16,
        VK_OBJECT_TYPE_PIPELINE_LAYOUT       = 17,
        VK_OBJECT_TYPE_RENDER_PASS           = 18,
        VK_OBJECT_TYPE_PIPELINE              = 19,
        VK_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT = 20,
        VK_OBJECT_TYPE_SAMPLER               = 21,
        VK_OBJECT_TYPE_DESCRIPTOR_POOL       = 22,
        VK_OBJECT_TYPE_DESCRIPTOR_SET        = 23,
        VK_OBJECT_TYPE_FRAMEBUFFER           = 24,
        VK_OBJECT_TYPE_COMMAND_POOL          = 25;

    public static final int
        VK_VENDOR_ID_KHRONOS  = 0x10000,
        VK_VENDOR_ID_VIV      = 0x10001,
        VK_VENDOR_ID_VSI      = 0x10002,
        VK_VENDOR_ID_KAZAN    = 0x10003,
        VK_VENDOR_ID_CODEPLAY = 0x10004,
        VK_VENDOR_ID_MESA     = 0x10005,
        VK_VENDOR_ID_POCL     = 0x10006,
        VK_VENDOR_ID_MOBILEYE = 0x10007;

    public static final int
        VK_SYSTEM_ALLOCATION_SCOPE_COMMAND  = 0,
        VK_SYSTEM_ALLOCATION_SCOPE_OBJECT   = 1,
        VK_SYSTEM_ALLOCATION_SCOPE_CACHE    = 2,
        VK_SYSTEM_ALLOCATION_SCOPE_DEVICE   = 3,
        VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE = 4;

    public static final int VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE = 0;

    public static final int
        VK_FORMAT_UNDEFINED                  = 0,
        VK_FORMAT_R4G4_UNORM_PACK8           = 1,
        VK_FORMAT_R4G4B4A4_UNORM_PACK16      = 2,
        VK_FORMAT_B4G4R4A4_UNORM_PACK16      = 3,
        VK_FORMAT_R5G6B5_UNORM_PACK16        = 4,
        VK_FORMAT_B5G6R5_UNORM_PACK16        = 5,
        VK_FORMAT_R5G5B5A1_UNORM_PACK16      = 6,
        VK_FORMAT_B5G5R5A1_UNORM_PACK16      = 7,
        VK_FORMAT_A1R5G5B5_UNORM_PACK16      = 8,
        VK_FORMAT_R8_UNORM                   = 9,
        VK_FORMAT_R8_SNORM                   = 10,
        VK_FORMAT_R8_USCALED                 = 11,
        VK_FORMAT_R8_SSCALED                 = 12,
        VK_FORMAT_R8_UINT                    = 13,
        VK_FORMAT_R8_SINT                    = 14,
        VK_FORMAT_R8_SRGB                    = 15,
        VK_FORMAT_R8G8_UNORM                 = 16,
        VK_FORMAT_R8G8_SNORM                 = 17,
        VK_FORMAT_R8G8_USCALED               = 18,
        VK_FORMAT_R8G8_SSCALED               = 19,
        VK_FORMAT_R8G8_UINT                  = 20,
        VK_FORMAT_R8G8_SINT                  = 21,
        VK_FORMAT_R8G8_SRGB                  = 22,
        VK_FORMAT_R8G8B8_UNORM               = 23,
        VK_FORMAT_R8G8B8_SNORM               = 24,
        VK_FORMAT_R8G8B8_USCALED             = 25,
        VK_FORMAT_R8G8B8_SSCALED             = 26,
        VK_FORMAT_R8G8B8_UINT                = 27,
        VK_FORMAT_R8G8B8_SINT                = 28,
        VK_FORMAT_R8G8B8_SRGB                = 29,
        VK_FORMAT_B8G8R8_UNORM               = 30,
        VK_FORMAT_B8G8R8_SNORM               = 31,
        VK_FORMAT_B8G8R8_USCALED             = 32,
        VK_FORMAT_B8G8R8_SSCALED             = 33,
        VK_FORMAT_B8G8R8_UINT                = 34,
        VK_FORMAT_B8G8R8_SINT                = 35,
        VK_FORMAT_B8G8R8_SRGB                = 36,
        VK_FORMAT_R8G8B8A8_UNORM             = 37,
        VK_FORMAT_R8G8B8A8_SNORM             = 38,
        VK_FORMAT_R8G8B8A8_USCALED           = 39,
        VK_FORMAT_R8G8B8A8_SSCALED           = 40,
        VK_FORMAT_R8G8B8A8_UINT              = 41,
        VK_FORMAT_R8G8B8A8_SINT              = 42,
        VK_FORMAT_R8G8B8A8_SRGB              = 43,
        VK_FORMAT_B8G8R8A8_UNORM             = 44,
        VK_FORMAT_B8G8R8A8_SNORM             = 45,
        VK_FORMAT_B8G8R8A8_USCALED           = 46,
        VK_FORMAT_B8G8R8A8_SSCALED           = 47,
        VK_FORMAT_B8G8R8A8_UINT              = 48,
        VK_FORMAT_B8G8R8A8_SINT              = 49,
        VK_FORMAT_B8G8R8A8_SRGB              = 50,
        VK_FORMAT_A8B8G8R8_UNORM_PACK32      = 51,
        VK_FORMAT_A8B8G8R8_SNORM_PACK32      = 52,
        VK_FORMAT_A8B8G8R8_USCALED_PACK32    = 53,
        VK_FORMAT_A8B8G8R8_SSCALED_PACK32    = 54,
        VK_FORMAT_A8B8G8R8_UINT_PACK32       = 55,
        VK_FORMAT_A8B8G8R8_SINT_PACK32       = 56,
        VK_FORMAT_A8B8G8R8_SRGB_PACK32       = 57,
        VK_FORMAT_A2R10G10B10_UNORM_PACK32   = 58,
        VK_FORMAT_A2R10G10B10_SNORM_PACK32   = 59,
        VK_FORMAT_A2R10G10B10_USCALED_PACK32 = 60,
        VK_FORMAT_A2R10G10B10_SSCALED_PACK32 = 61,
        VK_FORMAT_A2R10G10B10_UINT_PACK32    = 62,
        VK_FORMAT_A2R10G10B10_SINT_PACK32    = 63,
        VK_FORMAT_A2B10G10R10_UNORM_PACK32   = 64,
        VK_FORMAT_A2B10G10R10_SNORM_PACK32   = 65,
        VK_FORMAT_A2B10G10R10_USCALED_PACK32 = 66,
        VK_FORMAT_A2B10G10R10_SSCALED_PACK32 = 67,
        VK_FORMAT_A2B10G10R10_UINT_PACK32    = 68,
        VK_FORMAT_A2B10G10R10_SINT_PACK32    = 69,
        VK_FORMAT_R16_UNORM                  = 70,
        VK_FORMAT_R16_SNORM                  = 71,
        VK_FORMAT_R16_USCALED                = 72,
        VK_FORMAT_R16_SSCALED                = 73,
        VK_FORMAT_R16_UINT                   = 74,
        VK_FORMAT_R16_SINT                   = 75,
        VK_FORMAT_R16_SFLOAT                 = 76,
        VK_FORMAT_R16G16_UNORM               = 77,
        VK_FORMAT_R16G16_SNORM               = 78,
        VK_FORMAT_R16G16_USCALED             = 79,
        VK_FORMAT_R16G16_SSCALED             = 80,
        VK_FORMAT_R16G16_UINT                = 81,
        VK_FORMAT_R16G16_SINT                = 82,
        VK_FORMAT_R16G16_SFLOAT              = 83,
        VK_FORMAT_R16G16B16_UNORM            = 84,
        VK_FORMAT_R16G16B16_SNORM            = 85,
        VK_FORMAT_R16G16B16_USCALED          = 86,
        VK_FORMAT_R16G16B16_SSCALED          = 87,
        VK_FORMAT_R16G16B16_UINT             = 88,
        VK_FORMAT_R16G16B16_SINT             = 89,
        VK_FORMAT_R16G16B16_SFLOAT           = 90,
        VK_FORMAT_R16G16B16A16_UNORM         = 91,
        VK_FORMAT_R16G16B16A16_SNORM         = 92,
        VK_FORMAT_R16G16B16A16_USCALED       = 93,
        VK_FORMAT_R16G16B16A16_SSCALED       = 94,
        VK_FORMAT_R16G16B16A16_UINT          = 95,
        VK_FORMAT_R16G16B16A16_SINT          = 96,
        VK_FORMAT_R16G16B16A16_SFLOAT        = 97,
        VK_FORMAT_R32_UINT                   = 98,
        VK_FORMAT_R32_SINT                   = 99,
        VK_FORMAT_R32_SFLOAT                 = 100,
        VK_FORMAT_R32G32_UINT                = 101,
        VK_FORMAT_R32G32_SINT                = 102,
        VK_FORMAT_R32G32_SFLOAT              = 103,
        VK_FORMAT_R32G32B32_UINT             = 104,
        VK_FORMAT_R32G32B32_SINT             = 105,
        VK_FORMAT_R32G32B32_SFLOAT           = 106,
        VK_FORMAT_R32G32B32A32_UINT          = 107,
        VK_FORMAT_R32G32B32A32_SINT          = 108,
        VK_FORMAT_R32G32B32A32_SFLOAT        = 109,
        VK_FORMAT_R64_UINT                   = 110,
        VK_FORMAT_R64_SINT                   = 111,
        VK_FORMAT_R64_SFLOAT                 = 112,
        VK_FORMAT_R64G64_UINT                = 113,
        VK_FORMAT_R64G64_SINT                = 114,
        VK_FORMAT_R64G64_SFLOAT              = 115,
        VK_FORMAT_R64G64B64_UINT             = 116,
        VK_FORMAT_R64G64B64_SINT             = 117,
        VK_FORMAT_R64G64B64_SFLOAT           = 118,
        VK_FORMAT_R64G64B64A64_UINT          = 119,
        VK_FORMAT_R64G64B64A64_SINT          = 120,
        VK_FORMAT_R64G64B64A64_SFLOAT        = 121,
        VK_FORMAT_B10G11R11_UFLOAT_PACK32    = 122,
        VK_FORMAT_E5B9G9R9_UFLOAT_PACK32     = 123,
        VK_FORMAT_D16_UNORM                  = 124,
        VK_FORMAT_X8_D24_UNORM_PACK32        = 125,
        VK_FORMAT_D32_SFLOAT                 = 126,
        VK_FORMAT_S8_UINT                    = 127,
        VK_FORMAT_D16_UNORM_S8_UINT          = 128,
        VK_FORMAT_D24_UNORM_S8_UINT          = 129,
        VK_FORMAT_D32_SFLOAT_S8_UINT         = 130,
        VK_FORMAT_BC1_RGB_UNORM_BLOCK        = 131,
        VK_FORMAT_BC1_RGB_SRGB_BLOCK         = 132,
        VK_FORMAT_BC1_RGBA_UNORM_BLOCK       = 133,
        VK_FORMAT_BC1_RGBA_SRGB_BLOCK        = 134,
        VK_FORMAT_BC2_UNORM_BLOCK            = 135,
        VK_FORMAT_BC2_SRGB_BLOCK             = 136,
        VK_FORMAT_BC3_UNORM_BLOCK            = 137,
        VK_FORMAT_BC3_SRGB_BLOCK             = 138,
        VK_FORMAT_BC4_UNORM_BLOCK            = 139,
        VK_FORMAT_BC4_SNORM_BLOCK            = 140,
        VK_FORMAT_BC5_UNORM_BLOCK            = 141,
        VK_FORMAT_BC5_SNORM_BLOCK            = 142,
        VK_FORMAT_BC6H_UFLOAT_BLOCK          = 143,
        VK_FORMAT_BC6H_SFLOAT_BLOCK          = 144,
        VK_FORMAT_BC7_UNORM_BLOCK            = 145,
        VK_FORMAT_BC7_SRGB_BLOCK             = 146,
        VK_FORMAT_ETC2_R8G8B8_UNORM_BLOCK    = 147,
        VK_FORMAT_ETC2_R8G8B8_SRGB_BLOCK     = 148,
        VK_FORMAT_ETC2_R8G8B8A1_UNORM_BLOCK  = 149,
        VK_FORMAT_ETC2_R8G8B8A1_SRGB_BLOCK   = 150,
        VK_FORMAT_ETC2_R8G8B8A8_UNORM_BLOCK  = 151,
        VK_FORMAT_ETC2_R8G8B8A8_SRGB_BLOCK   = 152,
        VK_FORMAT_EAC_R11_UNORM_BLOCK        = 153,
        VK_FORMAT_EAC_R11_SNORM_BLOCK        = 154,
        VK_FORMAT_EAC_R11G11_UNORM_BLOCK     = 155,
        VK_FORMAT_EAC_R11G11_SNORM_BLOCK     = 156,
        VK_FORMAT_ASTC_4x4_UNORM_BLOCK       = 157,
        VK_FORMAT_ASTC_4x4_SRGB_BLOCK        = 158,
        VK_FORMAT_ASTC_5x4_UNORM_BLOCK       = 159,
        VK_FORMAT_ASTC_5x4_SRGB_BLOCK        = 160,
        VK_FORMAT_ASTC_5x5_UNORM_BLOCK       = 161,
        VK_FORMAT_ASTC_5x5_SRGB_BLOCK        = 162,
        VK_FORMAT_ASTC_6x5_UNORM_BLOCK       = 163,
        VK_FORMAT_ASTC_6x5_SRGB_BLOCK        = 164,
        VK_FORMAT_ASTC_6x6_UNORM_BLOCK       = 165,
        VK_FORMAT_ASTC_6x6_SRGB_BLOCK        = 166,
        VK_FORMAT_ASTC_8x5_UNORM_BLOCK       = 167,
        VK_FORMAT_ASTC_8x5_SRGB_BLOCK        = 168,
        VK_FORMAT_ASTC_8x6_UNORM_BLOCK       = 169,
        VK_FORMAT_ASTC_8x6_SRGB_BLOCK        = 170,
        VK_FORMAT_ASTC_8x8_UNORM_BLOCK       = 171,
        VK_FORMAT_ASTC_8x8_SRGB_BLOCK        = 172,
        VK_FORMAT_ASTC_10x5_UNORM_BLOCK      = 173,
        VK_FORMAT_ASTC_10x5_SRGB_BLOCK       = 174,
        VK_FORMAT_ASTC_10x6_UNORM_BLOCK      = 175,
        VK_FORMAT_ASTC_10x6_SRGB_BLOCK       = 176,
        VK_FORMAT_ASTC_10x8_UNORM_BLOCK      = 177,
        VK_FORMAT_ASTC_10x8_SRGB_BLOCK       = 178,
        VK_FORMAT_ASTC_10x10_UNORM_BLOCK     = 179,
        VK_FORMAT_ASTC_10x10_SRGB_BLOCK      = 180,
        VK_FORMAT_ASTC_12x10_UNORM_BLOCK     = 181,
        VK_FORMAT_ASTC_12x10_SRGB_BLOCK      = 182,
        VK_FORMAT_ASTC_12x12_UNORM_BLOCK     = 183,
        VK_FORMAT_ASTC_12x12_SRGB_BLOCK      = 184;

    public static final int
        VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT               = 0x1,
        VK_FORMAT_FEATURE_STORAGE_IMAGE_BIT               = 0x2,
        VK_FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT        = 0x4,
        VK_FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT        = 0x8,
        VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT        = 0x10,
        VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT = 0x20,
        VK_FORMAT_FEATURE_VERTEX_BUFFER_BIT               = 0x40,
        VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT            = 0x80,
        VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT      = 0x100,
        VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT    = 0x200,
        VK_FORMAT_FEATURE_BLIT_SRC_BIT                    = 0x400,
        VK_FORMAT_FEATURE_BLIT_DST_BIT                    = 0x800,
        VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT = 0x1000;

    public static final int
        VK_IMAGE_CREATE_SPARSE_BINDING_BIT   = 0x1,
        VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT = 0x2,
        VK_IMAGE_CREATE_SPARSE_ALIASED_BIT   = 0x4,
        VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT   = 0x8,
        VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT  = 0x10;

    public static final int
        VK_SAMPLE_COUNT_1_BIT  = 0x1,
        VK_SAMPLE_COUNT_2_BIT  = 0x2,
        VK_SAMPLE_COUNT_4_BIT  = 0x4,
        VK_SAMPLE_COUNT_8_BIT  = 0x8,
        VK_SAMPLE_COUNT_16_BIT = 0x10,
        VK_SAMPLE_COUNT_32_BIT = 0x20,
        VK_SAMPLE_COUNT_64_BIT = 0x40;

    public static final int
        VK_IMAGE_TILING_OPTIMAL = 0,
        VK_IMAGE_TILING_LINEAR  = 1;

    public static final int
        VK_IMAGE_TYPE_1D = 0,
        VK_IMAGE_TYPE_2D = 1,
        VK_IMAGE_TYPE_3D = 2;

    public static final int
        VK_IMAGE_USAGE_TRANSFER_SRC_BIT             = 0x1,
        VK_IMAGE_USAGE_TRANSFER_DST_BIT             = 0x2,
        VK_IMAGE_USAGE_SAMPLED_BIT                  = 0x4,
        VK_IMAGE_USAGE_STORAGE_BIT                  = 0x8,
        VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT         = 0x10,
        VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT = 0x20,
        VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT     = 0x40,
        VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT         = 0x80;

    public static final int VK_MEMORY_HEAP_DEVICE_LOCAL_BIT = 0x1;

    public static final int
        VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT     = 0x1,
        VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT     = 0x2,
        VK_MEMORY_PROPERTY_HOST_COHERENT_BIT    = 0x4,
        VK_MEMORY_PROPERTY_HOST_CACHED_BIT      = 0x8,
        VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT = 0x10;

    public static final int
        VK_PHYSICAL_DEVICE_TYPE_OTHER          = 0,
        VK_PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU = 1,
        VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU   = 2,
        VK_PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU    = 3,
        VK_PHYSICAL_DEVICE_TYPE_CPU            = 4;

    public static final int
        VK_QUEUE_GRAPHICS_BIT       = 0x1,
        VK_QUEUE_COMPUTE_BIT        = 0x2,
        VK_QUEUE_TRANSFER_BIT       = 0x4,
        VK_QUEUE_SPARSE_BINDING_BIT = 0x8;

    public static final int
        VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT                    = 0x1,
        VK_PIPELINE_STAGE_DRAW_INDIRECT_BIT                  = 0x2,
        VK_PIPELINE_STAGE_VERTEX_INPUT_BIT                   = 0x4,
        VK_PIPELINE_STAGE_VERTEX_SHADER_BIT                  = 0x8,
        VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT    = 0x10,
        VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT = 0x20,
        VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT                = 0x40,
        VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT                = 0x80,
        VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT           = 0x100,
        VK_PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT            = 0x200,
        VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT        = 0x400,
        VK_PIPELINE_STAGE_COMPUTE_SHADER_BIT                 = 0x800,
        VK_PIPELINE_STAGE_TRANSFER_BIT                       = 0x1000,
        VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT                 = 0x2000,
        VK_PIPELINE_STAGE_HOST_BIT                           = 0x4000,
        VK_PIPELINE_STAGE_ALL_GRAPHICS_BIT                   = 0x8000,
        VK_PIPELINE_STAGE_ALL_COMMANDS_BIT                   = 0x10000;

    public static final int VK_SPARSE_MEMORY_BIND_METADATA_BIT = 0x1;

    public static final int
        VK_SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT         = 0x1,
        VK_SPARSE_IMAGE_FORMAT_ALIGNED_MIP_SIZE_BIT       = 0x2,
        VK_SPARSE_IMAGE_FORMAT_NONSTANDARD_BLOCK_SIZE_BIT = 0x4;

    public static final int VK_FENCE_CREATE_SIGNALED_BIT = 0x1;

    public static final int
        VK_QUERY_TYPE_OCCLUSION           = 0,
        VK_QUERY_TYPE_PIPELINE_STATISTICS = 1,
        VK_QUERY_TYPE_TIMESTAMP           = 2;

    public static final int
        VK_QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_VERTICES_BIT                    = 0x1,
        VK_QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_PRIMITIVES_BIT                  = 0x2,
        VK_QUERY_PIPELINE_STATISTIC_VERTEX_SHADER_INVOCATIONS_BIT                  = 0x4,
        VK_QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_INVOCATIONS_BIT                = 0x8,
        VK_QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_PRIMITIVES_BIT                 = 0x10,
        VK_QUERY_PIPELINE_STATISTIC_CLIPPING_INVOCATIONS_BIT                       = 0x20,
        VK_QUERY_PIPELINE_STATISTIC_CLIPPING_PRIMITIVES_BIT                        = 0x40,
        VK_QUERY_PIPELINE_STATISTIC_FRAGMENT_SHADER_INVOCATIONS_BIT                = 0x80,
        VK_QUERY_PIPELINE_STATISTIC_TESSELLATION_CONTROL_SHADER_PATCHES_BIT        = 0x100,
        VK_QUERY_PIPELINE_STATISTIC_TESSELLATION_EVALUATION_SHADER_INVOCATIONS_BIT = 0x200,
        VK_QUERY_PIPELINE_STATISTIC_COMPUTE_SHADER_INVOCATIONS_BIT                 = 0x400;

    public static final int
        VK_QUERY_RESULT_64_BIT                = 0x1,
        VK_QUERY_RESULT_WAIT_BIT              = 0x2,
        VK_QUERY_RESULT_WITH_AVAILABILITY_BIT = 0x4,
        VK_QUERY_RESULT_PARTIAL_BIT           = 0x8;

    public static final int
        VK_BUFFER_CREATE_SPARSE_BINDING_BIT   = 0x1,
        VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT = 0x2,
        VK_BUFFER_CREATE_SPARSE_ALIASED_BIT   = 0x4;

    public static final int
        VK_BUFFER_USAGE_TRANSFER_SRC_BIT         = 0x1,
        VK_BUFFER_USAGE_TRANSFER_DST_BIT         = 0x2,
        VK_BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT = 0x4,
        VK_BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT = 0x8,
        VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT       = 0x10,
        VK_BUFFER_USAGE_STORAGE_BUFFER_BIT       = 0x20,
        VK_BUFFER_USAGE_INDEX_BUFFER_BIT         = 0x40,
        VK_BUFFER_USAGE_VERTEX_BUFFER_BIT        = 0x80,
        VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT      = 0x100;

    public static final int
        VK_SHARING_MODE_EXCLUSIVE  = 0,
        VK_SHARING_MODE_CONCURRENT = 1;

    public static final int
        VK_COMPONENT_SWIZZLE_IDENTITY = 0,
        VK_COMPONENT_SWIZZLE_ZERO     = 1,
        VK_COMPONENT_SWIZZLE_ONE      = 2,
        VK_COMPONENT_SWIZZLE_R        = 3,
        VK_COMPONENT_SWIZZLE_G        = 4,
        VK_COMPONENT_SWIZZLE_B        = 5,
        VK_COMPONENT_SWIZZLE_A        = 6;

    public static final int
        VK_IMAGE_VIEW_TYPE_1D         = 0,
        VK_IMAGE_VIEW_TYPE_2D         = 1,
        VK_IMAGE_VIEW_TYPE_3D         = 2,
        VK_IMAGE_VIEW_TYPE_CUBE       = 3,
        VK_IMAGE_VIEW_TYPE_1D_ARRAY   = 4,
        VK_IMAGE_VIEW_TYPE_2D_ARRAY   = 5,
        VK_IMAGE_VIEW_TYPE_CUBE_ARRAY = 6;

    public static final int VK_DEPENDENCY_BY_REGION_BIT = 0x1;

    public static final int
        VK_COMMAND_POOL_CREATE_TRANSIENT_BIT            = 0x1,
        VK_COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT = 0x2;

    public static final int VK_COMMAND_POOL_RESET_RELEASE_RESOURCES_BIT = 0x1;

    public static final int
        VK_COMMAND_BUFFER_LEVEL_PRIMARY   = 0,
        VK_COMMAND_BUFFER_LEVEL_SECONDARY = 1;

    public static final int
        VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT      = 0x1,
        VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT = 0x2,
        VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT     = 0x4;

    public static final int VK_QUERY_CONTROL_PRECISE_BIT = 0x1;

    public static final int VK_COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT = 0x1;

    public static final int
        VK_INDEX_TYPE_UINT16 = 0,
        VK_INDEX_TYPE_UINT32 = 1;

    public static final int VK_PIPELINE_CACHE_HEADER_VERSION_ONE = 1;

    public static final int
        VK_PIPELINE_CREATE_DISABLE_OPTIMIZATION_BIT = 0x1,
        VK_PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT    = 0x2,
        VK_PIPELINE_CREATE_DERIVATIVE_BIT           = 0x4;

    public static final int
        VK_SHADER_STAGE_VERTEX_BIT                  = 0x1,
        VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT    = 0x2,
        VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT = 0x4,
        VK_SHADER_STAGE_GEOMETRY_BIT                = 0x8,
        VK_SHADER_STAGE_FRAGMENT_BIT                = 0x10,
        VK_SHADER_STAGE_ALL_GRAPHICS                = 0x0000001F,
        VK_SHADER_STAGE_COMPUTE_BIT                 = 0x20,
        VK_SHADER_STAGE_ALL                         = 0x7FFFFFFF;

    public static final int
        VK_BORDER_COLOR_FLOAT_TRANSPARENT_BLACK = 0,
        VK_BORDER_COLOR_INT_TRANSPARENT_BLACK   = 1,
        VK_BORDER_COLOR_FLOAT_OPAQUE_BLACK      = 2,
        VK_BORDER_COLOR_INT_OPAQUE_BLACK        = 3,
        VK_BORDER_COLOR_FLOAT_OPAQUE_WHITE      = 4,
        VK_BORDER_COLOR_INT_OPAQUE_WHITE        = 5;

    public static final int
        VK_FILTER_NEAREST = 0,
        VK_FILTER_LINEAR  = 1;

    public static final int
        VK_SAMPLER_ADDRESS_MODE_REPEAT          = 0,
        VK_SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT = 1,
        VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE   = 2,
        VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER = 3;

    public static final int
        VK_SAMPLER_MIPMAP_MODE_NEAREST = 0,
        VK_SAMPLER_MIPMAP_MODE_LINEAR  = 1;

    public static final int
        VK_COMPARE_OP_NEVER            = 0,
        VK_COMPARE_OP_LESS             = 1,
        VK_COMPARE_OP_EQUAL            = 2,
        VK_COMPARE_OP_LESS_OR_EQUAL    = 3,
        VK_COMPARE_OP_GREATER          = 4,
        VK_COMPARE_OP_NOT_EQUAL        = 5,
        VK_COMPARE_OP_GREATER_OR_EQUAL = 6,
        VK_COMPARE_OP_ALWAYS           = 7;

    public static final int VK_DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT = 0x1;

    public static final int
        VK_DESCRIPTOR_TYPE_SAMPLER                = 0,
        VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER = 1,
        VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE          = 2,
        VK_DESCRIPTOR_TYPE_STORAGE_IMAGE          = 3,
        VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER   = 4,
        VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER   = 5,
        VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER         = 6,
        VK_DESCRIPTOR_TYPE_STORAGE_BUFFER         = 7,
        VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC = 8,
        VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC = 9,
        VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT       = 10;

    public static final int
        VK_PIPELINE_BIND_POINT_GRAPHICS = 0,
        VK_PIPELINE_BIND_POINT_COMPUTE  = 1;

    public static final int
        VK_BLEND_FACTOR_ZERO                     = 0,
        VK_BLEND_FACTOR_ONE                      = 1,
        VK_BLEND_FACTOR_SRC_COLOR                = 2,
        VK_BLEND_FACTOR_ONE_MINUS_SRC_COLOR      = 3,
        VK_BLEND_FACTOR_DST_COLOR                = 4,
        VK_BLEND_FACTOR_ONE_MINUS_DST_COLOR      = 5,
        VK_BLEND_FACTOR_SRC_ALPHA                = 6,
        VK_BLEND_FACTOR_ONE_MINUS_SRC_ALPHA      = 7,
        VK_BLEND_FACTOR_DST_ALPHA                = 8,
        VK_BLEND_FACTOR_ONE_MINUS_DST_ALPHA      = 9,
        VK_BLEND_FACTOR_CONSTANT_COLOR           = 10,
        VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR = 11,
        VK_BLEND_FACTOR_CONSTANT_ALPHA           = 12,
        VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA = 13,
        VK_BLEND_FACTOR_SRC_ALPHA_SATURATE       = 14,
        VK_BLEND_FACTOR_SRC1_COLOR               = 15,
        VK_BLEND_FACTOR_ONE_MINUS_SRC1_COLOR     = 16,
        VK_BLEND_FACTOR_SRC1_ALPHA               = 17,
        VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA     = 18;

    public static final int
        VK_BLEND_OP_ADD              = 0,
        VK_BLEND_OP_SUBTRACT         = 1,
        VK_BLEND_OP_REVERSE_SUBTRACT = 2,
        VK_BLEND_OP_MIN              = 3,
        VK_BLEND_OP_MAX              = 4;

    public static final int
        VK_COLOR_COMPONENT_R_BIT = 0x1,
        VK_COLOR_COMPONENT_G_BIT = 0x2,
        VK_COLOR_COMPONENT_B_BIT = 0x4,
        VK_COLOR_COMPONENT_A_BIT = 0x8;

    public static final int
        VK_CULL_MODE_NONE           = 0,
        VK_CULL_MODE_FRONT_BIT      = 0x1,
        VK_CULL_MODE_BACK_BIT       = 0x2,
        VK_CULL_MODE_FRONT_AND_BACK = 0x00000003;

    public static final int
        VK_DYNAMIC_STATE_VIEWPORT             = 0,
        VK_DYNAMIC_STATE_SCISSOR              = 1,
        VK_DYNAMIC_STATE_LINE_WIDTH           = 2,
        VK_DYNAMIC_STATE_DEPTH_BIAS           = 3,
        VK_DYNAMIC_STATE_BLEND_CONSTANTS      = 4,
        VK_DYNAMIC_STATE_DEPTH_BOUNDS         = 5,
        VK_DYNAMIC_STATE_STENCIL_COMPARE_MASK = 6,
        VK_DYNAMIC_STATE_STENCIL_WRITE_MASK   = 7,
        VK_DYNAMIC_STATE_STENCIL_REFERENCE    = 8;

    public static final int
        VK_FRONT_FACE_COUNTER_CLOCKWISE = 0,
        VK_FRONT_FACE_CLOCKWISE         = 1;

    public static final int
        VK_VERTEX_INPUT_RATE_VERTEX   = 0,
        VK_VERTEX_INPUT_RATE_INSTANCE = 1;

    public static final int
        VK_PRIMITIVE_TOPOLOGY_POINT_LIST                    = 0,
        VK_PRIMITIVE_TOPOLOGY_LINE_LIST                     = 1,
        VK_PRIMITIVE_TOPOLOGY_LINE_STRIP                    = 2,
        VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST                 = 3,
        VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP                = 4,
        VK_PRIMITIVE_TOPOLOGY_TRIANGLE_FAN                  = 5,
        VK_PRIMITIVE_TOPOLOGY_LINE_LIST_WITH_ADJACENCY      = 6,
        VK_PRIMITIVE_TOPOLOGY_LINE_STRIP_WITH_ADJACENCY     = 7,
        VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST_WITH_ADJACENCY  = 8,
        VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP_WITH_ADJACENCY = 9,
        VK_PRIMITIVE_TOPOLOGY_PATCH_LIST                    = 10;

    public static final int
        VK_POLYGON_MODE_FILL  = 0,
        VK_POLYGON_MODE_LINE  = 1,
        VK_POLYGON_MODE_POINT = 2;

    public static final int
        VK_STENCIL_OP_KEEP                = 0,
        VK_STENCIL_OP_ZERO                = 1,
        VK_STENCIL_OP_REPLACE             = 2,
        VK_STENCIL_OP_INCREMENT_AND_CLAMP = 3,
        VK_STENCIL_OP_DECREMENT_AND_CLAMP = 4,
        VK_STENCIL_OP_INVERT              = 5,
        VK_STENCIL_OP_INCREMENT_AND_WRAP  = 6,
        VK_STENCIL_OP_DECREMENT_AND_WRAP  = 7;

    public static final int
        VK_LOGIC_OP_CLEAR         = 0,
        VK_LOGIC_OP_AND           = 1,
        VK_LOGIC_OP_AND_REVERSE   = 2,
        VK_LOGIC_OP_COPY          = 3,
        VK_LOGIC_OP_AND_INVERTED  = 4,
        VK_LOGIC_OP_NO_OP         = 5,
        VK_LOGIC_OP_XOR           = 6,
        VK_LOGIC_OP_OR            = 7,
        VK_LOGIC_OP_NOR           = 8,
        VK_LOGIC_OP_EQUIVALENT    = 9,
        VK_LOGIC_OP_INVERT        = 10,
        VK_LOGIC_OP_OR_REVERSE    = 11,
        VK_LOGIC_OP_COPY_INVERTED = 12,
        VK_LOGIC_OP_OR_INVERTED   = 13,
        VK_LOGIC_OP_NAND          = 14,
        VK_LOGIC_OP_SET           = 15;

    public static final int VK_ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT = 0x1;

    public static final int
        VK_ATTACHMENT_LOAD_OP_LOAD      = 0,
        VK_ATTACHMENT_LOAD_OP_CLEAR     = 1,
        VK_ATTACHMENT_LOAD_OP_DONT_CARE = 2;

    public static final int
        VK_ATTACHMENT_STORE_OP_STORE     = 0,
        VK_ATTACHMENT_STORE_OP_DONT_CARE = 1;

    public static final int
        VK_STENCIL_FACE_FRONT_BIT      = 0x1,
        VK_STENCIL_FACE_BACK_BIT       = 0x2,
        VK_STENCIL_FACE_FRONT_AND_BACK = 0x00000003,
        VK_STENCIL_FRONT_AND_BACK      = 0x00000003;

    public static final int
        VK_SUBPASS_CONTENTS_INLINE                    = 0,
        VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS = 1;

    public static final int VK_API_VERSION_1_0 = VK_MAKE_API_VERSION(0, 1, 0, 0);

    public static final int VK_HEADER_VERSION = 342;

    public static final long VK_NULL_HANDLE = 0x0L;

    public static final int
        VK_MAX_PHYSICAL_DEVICE_NAME_SIZE = 256,
        VK_UUID_SIZE                     = 16,
        VK_MAX_EXTENSION_NAME_SIZE       = 256,
        VK_MAX_DESCRIPTION_SIZE          = 256,
        VK_MAX_MEMORY_TYPES              = 32,
        VK_MAX_MEMORY_HEAPS              = 16,
        VK_REMAINING_MIP_LEVELS          = (~0),
        VK_REMAINING_ARRAY_LAYERS        = (~0),
        VK_ATTACHMENT_UNUSED             = (~0),
        VK_TRUE                          = 1,
        VK_FALSE                         = 0,
        VK_QUEUE_FAMILY_IGNORED          = (~0),
        VK_SUBPASS_EXTERNAL              = (~0);

    public static final float VK_LOD_CLAMP_NONE = 1000.0f;

    public static final long VK_WHOLE_SIZE = (~0L);

    protected VK10() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCreateInstance ] ---

    /** {@code VkResult vkCreateInstance(VkInstanceCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkInstance * pInstance)} */
    public static int nvkCreateInstance(long pCreateInfo, long pAllocator, long pInstance) {
        long __functionAddress = VK.getGlobalCommands().vkCreateInstance;
        if (CHECKS) {
            VkInstanceCreateInfo.validate(pCreateInfo);
        }
        return callPPPI(pCreateInfo, pAllocator, pInstance, __functionAddress);
    }

    /** {@code VkResult vkCreateInstance(VkInstanceCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkInstance * pInstance)} */
    @NativeType("VkResult")
    public static int vkCreateInstance(@NativeType("VkInstanceCreateInfo const *") VkInstanceCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkInstance *") PointerBuffer pInstance) {
        if (CHECKS) {
            check(pInstance, 1);
        }
        return nvkCreateInstance(pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pInstance));
    }

    // --- [ vkDestroyInstance ] ---

    /** {@code void vkDestroyInstance(VkInstance instance, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroyInstance(VkInstance instance, long pAllocator) {
        long __functionAddress = instance.getCapabilities().vkDestroyInstance;
        callPPV(instance.address(), pAllocator, __functionAddress);
    }

    /** {@code void vkDestroyInstance(VkInstance instance, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroyInstance(VkInstance instance, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyInstance(instance, memAddressSafe(pAllocator));
    }

    // --- [ vkEnumeratePhysicalDevices ] ---

    /** {@code VkResult vkEnumeratePhysicalDevices(VkInstance instance, uint32_t * pPhysicalDeviceCount, VkPhysicalDevice * pPhysicalDevices)} */
    public static int nvkEnumeratePhysicalDevices(VkInstance instance, long pPhysicalDeviceCount, long pPhysicalDevices) {
        long __functionAddress = instance.getCapabilities().vkEnumeratePhysicalDevices;
        return callPPPI(instance.address(), pPhysicalDeviceCount, pPhysicalDevices, __functionAddress);
    }

    /** {@code VkResult vkEnumeratePhysicalDevices(VkInstance instance, uint32_t * pPhysicalDeviceCount, VkPhysicalDevice * pPhysicalDevices)} */
    @NativeType("VkResult")
    public static int vkEnumeratePhysicalDevices(VkInstance instance, @NativeType("uint32_t *") IntBuffer pPhysicalDeviceCount, @NativeType("VkPhysicalDevice *") @Nullable PointerBuffer pPhysicalDevices) {
        if (CHECKS) {
            check(pPhysicalDeviceCount, 1);
            checkSafe(pPhysicalDevices, pPhysicalDeviceCount.get(pPhysicalDeviceCount.position()));
        }
        return nvkEnumeratePhysicalDevices(instance, memAddress(pPhysicalDeviceCount), memAddressSafe(pPhysicalDevices));
    }

    // --- [ vkGetPhysicalDeviceFeatures ] ---

    /** {@code void vkGetPhysicalDeviceFeatures(VkPhysicalDevice physicalDevice, VkPhysicalDeviceFeatures * pFeatures)} */
    public static void nvkGetPhysicalDeviceFeatures(VkPhysicalDevice physicalDevice, long pFeatures) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceFeatures;
        callPPV(physicalDevice.address(), pFeatures, __functionAddress);
    }

    /** {@code void vkGetPhysicalDeviceFeatures(VkPhysicalDevice physicalDevice, VkPhysicalDeviceFeatures * pFeatures)} */
    public static void vkGetPhysicalDeviceFeatures(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceFeatures *") VkPhysicalDeviceFeatures pFeatures) {
        nvkGetPhysicalDeviceFeatures(physicalDevice, pFeatures.address());
    }

    // --- [ vkGetPhysicalDeviceFormatProperties ] ---

    /** {@code void vkGetPhysicalDeviceFormatProperties(VkPhysicalDevice physicalDevice, VkFormat format, VkFormatProperties * pFormatProperties)} */
    public static void nvkGetPhysicalDeviceFormatProperties(VkPhysicalDevice physicalDevice, int format, long pFormatProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceFormatProperties;
        callPPV(physicalDevice.address(), format, pFormatProperties, __functionAddress);
    }

    /** {@code void vkGetPhysicalDeviceFormatProperties(VkPhysicalDevice physicalDevice, VkFormat format, VkFormatProperties * pFormatProperties)} */
    public static void vkGetPhysicalDeviceFormatProperties(VkPhysicalDevice physicalDevice, @NativeType("VkFormat") int format, @NativeType("VkFormatProperties *") VkFormatProperties pFormatProperties) {
        nvkGetPhysicalDeviceFormatProperties(physicalDevice, format, pFormatProperties.address());
    }

    // --- [ vkGetPhysicalDeviceImageFormatProperties ] ---

    /** {@code VkResult vkGetPhysicalDeviceImageFormatProperties(VkPhysicalDevice physicalDevice, VkFormat format, VkImageType type, VkImageTiling tiling, VkImageUsageFlags usage, VkImageCreateFlags flags, VkImageFormatProperties * pImageFormatProperties)} */
    public static int nvkGetPhysicalDeviceImageFormatProperties(VkPhysicalDevice physicalDevice, int format, int type, int tiling, int usage, int flags, long pImageFormatProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceImageFormatProperties;
        return callPPI(physicalDevice.address(), format, type, tiling, usage, flags, pImageFormatProperties, __functionAddress);
    }

    /** {@code VkResult vkGetPhysicalDeviceImageFormatProperties(VkPhysicalDevice physicalDevice, VkFormat format, VkImageType type, VkImageTiling tiling, VkImageUsageFlags usage, VkImageCreateFlags flags, VkImageFormatProperties * pImageFormatProperties)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceImageFormatProperties(VkPhysicalDevice physicalDevice, @NativeType("VkFormat") int format, @NativeType("VkImageType") int type, @NativeType("VkImageTiling") int tiling, @NativeType("VkImageUsageFlags") int usage, @NativeType("VkImageCreateFlags") int flags, @NativeType("VkImageFormatProperties *") VkImageFormatProperties pImageFormatProperties) {
        return nvkGetPhysicalDeviceImageFormatProperties(physicalDevice, format, type, tiling, usage, flags, pImageFormatProperties.address());
    }

    // --- [ vkGetPhysicalDeviceProperties ] ---

    /** {@code void vkGetPhysicalDeviceProperties(VkPhysicalDevice physicalDevice, VkPhysicalDeviceProperties * pProperties)} */
    public static void nvkGetPhysicalDeviceProperties(VkPhysicalDevice physicalDevice, long pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceProperties;
        callPPV(physicalDevice.address(), pProperties, __functionAddress);
    }

    /** {@code void vkGetPhysicalDeviceProperties(VkPhysicalDevice physicalDevice, VkPhysicalDeviceProperties * pProperties)} */
    public static void vkGetPhysicalDeviceProperties(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceProperties *") VkPhysicalDeviceProperties pProperties) {
        nvkGetPhysicalDeviceProperties(physicalDevice, pProperties.address());
    }

    // --- [ vkGetPhysicalDeviceQueueFamilyProperties ] ---

    /** {@code void vkGetPhysicalDeviceQueueFamilyProperties(VkPhysicalDevice physicalDevice, uint32_t * pQueueFamilyPropertyCount, VkQueueFamilyProperties * pQueueFamilyProperties)} */
    public static void nvkGetPhysicalDeviceQueueFamilyProperties(VkPhysicalDevice physicalDevice, long pQueueFamilyPropertyCount, long pQueueFamilyProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceQueueFamilyProperties;
        callPPPV(physicalDevice.address(), pQueueFamilyPropertyCount, pQueueFamilyProperties, __functionAddress);
    }

    /** {@code void vkGetPhysicalDeviceQueueFamilyProperties(VkPhysicalDevice physicalDevice, uint32_t * pQueueFamilyPropertyCount, VkQueueFamilyProperties * pQueueFamilyProperties)} */
    public static void vkGetPhysicalDeviceQueueFamilyProperties(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") IntBuffer pQueueFamilyPropertyCount, @NativeType("VkQueueFamilyProperties *") VkQueueFamilyProperties.@Nullable Buffer pQueueFamilyProperties) {
        if (CHECKS) {
            check(pQueueFamilyPropertyCount, 1);
            checkSafe(pQueueFamilyProperties, pQueueFamilyPropertyCount.get(pQueueFamilyPropertyCount.position()));
        }
        nvkGetPhysicalDeviceQueueFamilyProperties(physicalDevice, memAddress(pQueueFamilyPropertyCount), memAddressSafe(pQueueFamilyProperties));
    }

    // --- [ vkGetPhysicalDeviceMemoryProperties ] ---

    /** {@code void vkGetPhysicalDeviceMemoryProperties(VkPhysicalDevice physicalDevice, VkPhysicalDeviceMemoryProperties * pMemoryProperties)} */
    public static void nvkGetPhysicalDeviceMemoryProperties(VkPhysicalDevice physicalDevice, long pMemoryProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceMemoryProperties;
        callPPV(physicalDevice.address(), pMemoryProperties, __functionAddress);
    }

    /** {@code void vkGetPhysicalDeviceMemoryProperties(VkPhysicalDevice physicalDevice, VkPhysicalDeviceMemoryProperties * pMemoryProperties)} */
    public static void vkGetPhysicalDeviceMemoryProperties(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceMemoryProperties *") VkPhysicalDeviceMemoryProperties pMemoryProperties) {
        nvkGetPhysicalDeviceMemoryProperties(physicalDevice, pMemoryProperties.address());
    }

    // --- [ vkGetInstanceProcAddr ] ---

    /** {@code PFN_vkVoidFunction vkGetInstanceProcAddr(VkInstance instance, char const * pName)} */
    public static long nvkGetInstanceProcAddr(long instance, long pName) {
        long __functionAddress = VK.getGlobalCommands().vkGetInstanceProcAddr;
        return callPPP(instance, pName, __functionAddress);
    }

    /** {@code PFN_vkVoidFunction vkGetInstanceProcAddr(VkInstance instance, char const * pName)} */
    @NativeType("PFN_vkVoidFunction")
    public static long vkGetInstanceProcAddr(@NativeType("VkInstance") @Nullable VkInstance instance, @NativeType("char const *") ByteBuffer pName) {
        if (CHECKS) {
            checkNT1(pName);
        }
        return nvkGetInstanceProcAddr(memAddressSafe(instance), memAddress(pName));
    }

    /** {@code PFN_vkVoidFunction vkGetInstanceProcAddr(VkInstance instance, char const * pName)} */
    @NativeType("PFN_vkVoidFunction")
    public static long vkGetInstanceProcAddr(@NativeType("VkInstance") @Nullable VkInstance instance, @NativeType("char const *") CharSequence pName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pName, true);
            long pNameEncoded = stack.getPointerAddress();
            return nvkGetInstanceProcAddr(memAddressSafe(instance), pNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ vkGetDeviceProcAddr ] ---

    /** {@code PFN_vkVoidFunction vkGetDeviceProcAddr(VkDevice device, char const * pName)} */
    public static long nvkGetDeviceProcAddr(VkDevice device, long pName) {
        long __functionAddress = device.getCapabilities().vkGetDeviceProcAddr;
        return callPPP(device.address(), pName, __functionAddress);
    }

    /** {@code PFN_vkVoidFunction vkGetDeviceProcAddr(VkDevice device, char const * pName)} */
    @NativeType("PFN_vkVoidFunction")
    public static long vkGetDeviceProcAddr(VkDevice device, @NativeType("char const *") ByteBuffer pName) {
        if (CHECKS) {
            checkNT1(pName);
        }
        return nvkGetDeviceProcAddr(device, memAddress(pName));
    }

    /** {@code PFN_vkVoidFunction vkGetDeviceProcAddr(VkDevice device, char const * pName)} */
    @NativeType("PFN_vkVoidFunction")
    public static long vkGetDeviceProcAddr(VkDevice device, @NativeType("char const *") CharSequence pName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pName, true);
            long pNameEncoded = stack.getPointerAddress();
            return nvkGetDeviceProcAddr(device, pNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ vkCreateDevice ] ---

    /** {@code VkResult vkCreateDevice(VkPhysicalDevice physicalDevice, VkDeviceCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkDevice * pDevice)} */
    public static int nvkCreateDevice(VkPhysicalDevice physicalDevice, long pCreateInfo, long pAllocator, long pDevice) {
        long __functionAddress = physicalDevice.getCapabilities().vkCreateDevice;
        if (CHECKS) {
            VkDeviceCreateInfo.validate(pCreateInfo);
        }
        return callPPPPI(physicalDevice.address(), pCreateInfo, pAllocator, pDevice, __functionAddress);
    }

    /** {@code VkResult vkCreateDevice(VkPhysicalDevice physicalDevice, VkDeviceCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkDevice * pDevice)} */
    @NativeType("VkResult")
    public static int vkCreateDevice(VkPhysicalDevice physicalDevice, @NativeType("VkDeviceCreateInfo const *") VkDeviceCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkDevice *") PointerBuffer pDevice) {
        if (CHECKS) {
            check(pDevice, 1);
        }
        return nvkCreateDevice(physicalDevice, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pDevice));
    }

    // --- [ vkDestroyDevice ] ---

    /** {@code void vkDestroyDevice(VkDevice device, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroyDevice(VkDevice device, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyDevice;
        callPPV(device.address(), pAllocator, __functionAddress);
    }

    /** {@code void vkDestroyDevice(VkDevice device, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroyDevice(VkDevice device, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyDevice(device, memAddressSafe(pAllocator));
    }

    // --- [ vkEnumerateInstanceExtensionProperties ] ---

    /** {@code VkResult vkEnumerateInstanceExtensionProperties(char const * pLayerName, uint32_t * pPropertyCount, VkExtensionProperties * pProperties)} */
    public static int nvkEnumerateInstanceExtensionProperties(long pLayerName, long pPropertyCount, long pProperties) {
        long __functionAddress = VK.getGlobalCommands().vkEnumerateInstanceExtensionProperties;
        return callPPPI(pLayerName, pPropertyCount, pProperties, __functionAddress);
    }

    /** {@code VkResult vkEnumerateInstanceExtensionProperties(char const * pLayerName, uint32_t * pPropertyCount, VkExtensionProperties * pProperties)} */
    @NativeType("VkResult")
    public static int vkEnumerateInstanceExtensionProperties(@NativeType("char const *") @Nullable ByteBuffer pLayerName, @NativeType("uint32_t *") IntBuffer pPropertyCount, @NativeType("VkExtensionProperties *") VkExtensionProperties.@Nullable Buffer pProperties) {
        if (CHECKS) {
            checkNT1Safe(pLayerName);
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount.get(pPropertyCount.position()));
        }
        return nvkEnumerateInstanceExtensionProperties(memAddressSafe(pLayerName), memAddress(pPropertyCount), memAddressSafe(pProperties));
    }

    /** {@code VkResult vkEnumerateInstanceExtensionProperties(char const * pLayerName, uint32_t * pPropertyCount, VkExtensionProperties * pProperties)} */
    @NativeType("VkResult")
    public static int vkEnumerateInstanceExtensionProperties(@NativeType("char const *") @Nullable CharSequence pLayerName, @NativeType("uint32_t *") IntBuffer pPropertyCount, @NativeType("VkExtensionProperties *") VkExtensionProperties.@Nullable Buffer pProperties) {
        if (CHECKS) {
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount.get(pPropertyCount.position()));
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(pLayerName, true);
            long pLayerNameEncoded = pLayerName == null ? NULL : stack.getPointerAddress();
            return nvkEnumerateInstanceExtensionProperties(pLayerNameEncoded, memAddress(pPropertyCount), memAddressSafe(pProperties));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ vkEnumerateDeviceExtensionProperties ] ---

    /** {@code VkResult vkEnumerateDeviceExtensionProperties(VkPhysicalDevice physicalDevice, char const * pLayerName, uint32_t * pPropertyCount, VkExtensionProperties * pProperties)} */
    public static int nvkEnumerateDeviceExtensionProperties(VkPhysicalDevice physicalDevice, long pLayerName, long pPropertyCount, long pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkEnumerateDeviceExtensionProperties;
        return callPPPPI(physicalDevice.address(), pLayerName, pPropertyCount, pProperties, __functionAddress);
    }

    /** {@code VkResult vkEnumerateDeviceExtensionProperties(VkPhysicalDevice physicalDevice, char const * pLayerName, uint32_t * pPropertyCount, VkExtensionProperties * pProperties)} */
    @NativeType("VkResult")
    public static int vkEnumerateDeviceExtensionProperties(VkPhysicalDevice physicalDevice, @NativeType("char const *") @Nullable ByteBuffer pLayerName, @NativeType("uint32_t *") IntBuffer pPropertyCount, @NativeType("VkExtensionProperties *") VkExtensionProperties.@Nullable Buffer pProperties) {
        if (CHECKS) {
            checkNT1Safe(pLayerName);
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount.get(pPropertyCount.position()));
        }
        return nvkEnumerateDeviceExtensionProperties(physicalDevice, memAddressSafe(pLayerName), memAddress(pPropertyCount), memAddressSafe(pProperties));
    }

    /** {@code VkResult vkEnumerateDeviceExtensionProperties(VkPhysicalDevice physicalDevice, char const * pLayerName, uint32_t * pPropertyCount, VkExtensionProperties * pProperties)} */
    @NativeType("VkResult")
    public static int vkEnumerateDeviceExtensionProperties(VkPhysicalDevice physicalDevice, @NativeType("char const *") @Nullable CharSequence pLayerName, @NativeType("uint32_t *") IntBuffer pPropertyCount, @NativeType("VkExtensionProperties *") VkExtensionProperties.@Nullable Buffer pProperties) {
        if (CHECKS) {
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount.get(pPropertyCount.position()));
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(pLayerName, true);
            long pLayerNameEncoded = pLayerName == null ? NULL : stack.getPointerAddress();
            return nvkEnumerateDeviceExtensionProperties(physicalDevice, pLayerNameEncoded, memAddress(pPropertyCount), memAddressSafe(pProperties));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ vkEnumerateInstanceLayerProperties ] ---

    /** {@code VkResult vkEnumerateInstanceLayerProperties(uint32_t * pPropertyCount, VkLayerProperties * pProperties)} */
    public static int nvkEnumerateInstanceLayerProperties(long pPropertyCount, long pProperties) {
        long __functionAddress = VK.getGlobalCommands().vkEnumerateInstanceLayerProperties;
        return callPPI(pPropertyCount, pProperties, __functionAddress);
    }

    /** {@code VkResult vkEnumerateInstanceLayerProperties(uint32_t * pPropertyCount, VkLayerProperties * pProperties)} */
    @NativeType("VkResult")
    public static int vkEnumerateInstanceLayerProperties(@NativeType("uint32_t *") IntBuffer pPropertyCount, @NativeType("VkLayerProperties *") VkLayerProperties.@Nullable Buffer pProperties) {
        if (CHECKS) {
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount.get(pPropertyCount.position()));
        }
        return nvkEnumerateInstanceLayerProperties(memAddress(pPropertyCount), memAddressSafe(pProperties));
    }

    // --- [ vkEnumerateDeviceLayerProperties ] ---

    /** {@code VkResult vkEnumerateDeviceLayerProperties(VkPhysicalDevice physicalDevice, uint32_t * pPropertyCount, VkLayerProperties * pProperties)} */
    public static int nvkEnumerateDeviceLayerProperties(VkPhysicalDevice physicalDevice, long pPropertyCount, long pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkEnumerateDeviceLayerProperties;
        return callPPPI(physicalDevice.address(), pPropertyCount, pProperties, __functionAddress);
    }

    /** {@code VkResult vkEnumerateDeviceLayerProperties(VkPhysicalDevice physicalDevice, uint32_t * pPropertyCount, VkLayerProperties * pProperties)} */
    @NativeType("VkResult")
    public static int vkEnumerateDeviceLayerProperties(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") IntBuffer pPropertyCount, @NativeType("VkLayerProperties *") VkLayerProperties.@Nullable Buffer pProperties) {
        if (CHECKS) {
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount.get(pPropertyCount.position()));
        }
        return nvkEnumerateDeviceLayerProperties(physicalDevice, memAddress(pPropertyCount), memAddressSafe(pProperties));
    }

    // --- [ vkGetDeviceQueue ] ---

    /** {@code void vkGetDeviceQueue(VkDevice device, uint32_t queueFamilyIndex, uint32_t queueIndex, VkQueue * pQueue)} */
    public static void nvkGetDeviceQueue(VkDevice device, int queueFamilyIndex, int queueIndex, long pQueue) {
        long __functionAddress = device.getCapabilities().vkGetDeviceQueue;
        callPPV(device.address(), queueFamilyIndex, queueIndex, pQueue, __functionAddress);
    }

    /** {@code void vkGetDeviceQueue(VkDevice device, uint32_t queueFamilyIndex, uint32_t queueIndex, VkQueue * pQueue)} */
    public static void vkGetDeviceQueue(VkDevice device, @NativeType("uint32_t") int queueFamilyIndex, @NativeType("uint32_t") int queueIndex, @NativeType("VkQueue *") PointerBuffer pQueue) {
        if (CHECKS) {
            check(pQueue, 1);
        }
        nvkGetDeviceQueue(device, queueFamilyIndex, queueIndex, memAddress(pQueue));
    }

    // --- [ vkQueueSubmit ] ---

    /** {@code VkResult vkQueueSubmit(VkQueue queue, uint32_t submitCount, VkSubmitInfo const * pSubmits, VkFence fence)} */
    public static int nvkQueueSubmit(VkQueue queue, int submitCount, long pSubmits, long fence) {
        long __functionAddress = queue.getCapabilities().vkQueueSubmit;
        if (CHECKS) {
            if (pSubmits != NULL) { Struct.validate(pSubmits, submitCount, VkSubmitInfo.SIZEOF, VkSubmitInfo::validate); }
        }
        return callPPJI(queue.address(), submitCount, pSubmits, fence, __functionAddress);
    }

    /** {@code VkResult vkQueueSubmit(VkQueue queue, uint32_t submitCount, VkSubmitInfo const * pSubmits, VkFence fence)} */
    @NativeType("VkResult")
    public static int vkQueueSubmit(VkQueue queue, @NativeType("VkSubmitInfo const *") VkSubmitInfo.@Nullable Buffer pSubmits, @NativeType("VkFence") long fence) {
        return nvkQueueSubmit(queue, remainingSafe(pSubmits), memAddressSafe(pSubmits), fence);
    }

    /** {@code VkResult vkQueueSubmit(VkQueue queue, uint32_t submitCount, VkSubmitInfo const * pSubmits, VkFence fence)} */
    @NativeType("VkResult")
    public static int vkQueueSubmit(VkQueue queue, @NativeType("VkSubmitInfo const *") VkSubmitInfo pSubmit, @NativeType("VkFence") long fence) {
        return nvkQueueSubmit(queue, 1, pSubmit.address(), fence);
    }

    // --- [ vkQueueWaitIdle ] ---

    /** {@code VkResult vkQueueWaitIdle(VkQueue queue)} */
    @NativeType("VkResult")
    public static int vkQueueWaitIdle(VkQueue queue) {
        long __functionAddress = queue.getCapabilities().vkQueueWaitIdle;
        return callPI(queue.address(), __functionAddress);
    }

    // --- [ vkDeviceWaitIdle ] ---

    /** {@code VkResult vkDeviceWaitIdle(VkDevice device)} */
    @NativeType("VkResult")
    public static int vkDeviceWaitIdle(VkDevice device) {
        long __functionAddress = device.getCapabilities().vkDeviceWaitIdle;
        return callPI(device.address(), __functionAddress);
    }

    // --- [ vkAllocateMemory ] ---

    /** {@code VkResult vkAllocateMemory(VkDevice device, VkMemoryAllocateInfo const * pAllocateInfo, VkAllocationCallbacks const * pAllocator, VkDeviceMemory * pMemory)} */
    public static int nvkAllocateMemory(VkDevice device, long pAllocateInfo, long pAllocator, long pMemory) {
        long __functionAddress = device.getCapabilities().vkAllocateMemory;
        return callPPPPI(device.address(), pAllocateInfo, pAllocator, pMemory, __functionAddress);
    }

    /** {@code VkResult vkAllocateMemory(VkDevice device, VkMemoryAllocateInfo const * pAllocateInfo, VkAllocationCallbacks const * pAllocator, VkDeviceMemory * pMemory)} */
    @NativeType("VkResult")
    public static int vkAllocateMemory(VkDevice device, @NativeType("VkMemoryAllocateInfo const *") VkMemoryAllocateInfo pAllocateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkDeviceMemory *") LongBuffer pMemory) {
        if (CHECKS) {
            check(pMemory, 1);
        }
        return nvkAllocateMemory(device, pAllocateInfo.address(), memAddressSafe(pAllocator), memAddress(pMemory));
    }

    // --- [ vkFreeMemory ] ---

    /** {@code void vkFreeMemory(VkDevice device, VkDeviceMemory memory, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkFreeMemory(VkDevice device, long memory, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkFreeMemory;
        callPJPV(device.address(), memory, pAllocator, __functionAddress);
    }

    /** {@code void vkFreeMemory(VkDevice device, VkDeviceMemory memory, VkAllocationCallbacks const * pAllocator)} */
    public static void vkFreeMemory(VkDevice device, @NativeType("VkDeviceMemory") long memory, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkFreeMemory(device, memory, memAddressSafe(pAllocator));
    }

    // --- [ vkMapMemory ] ---

    /** {@code VkResult vkMapMemory(VkDevice device, VkDeviceMemory memory, VkDeviceSize offset, VkDeviceSize size, VkMemoryMapFlags flags, void ** ppData)} */
    public static int nvkMapMemory(VkDevice device, long memory, long offset, long size, int flags, long ppData) {
        long __functionAddress = device.getCapabilities().vkMapMemory;
        return callPJJJPI(device.address(), memory, offset, size, flags, ppData, __functionAddress);
    }

    /** {@code VkResult vkMapMemory(VkDevice device, VkDeviceMemory memory, VkDeviceSize offset, VkDeviceSize size, VkMemoryMapFlags flags, void ** ppData)} */
    @NativeType("VkResult")
    public static int vkMapMemory(VkDevice device, @NativeType("VkDeviceMemory") long memory, @NativeType("VkDeviceSize") long offset, @NativeType("VkDeviceSize") long size, @NativeType("VkMemoryMapFlags") int flags, @NativeType("void **") PointerBuffer ppData) {
        if (CHECKS) {
            check(ppData, 1);
        }
        return nvkMapMemory(device, memory, offset, size, flags, memAddress(ppData));
    }

    // --- [ vkUnmapMemory ] ---

    /** {@code void vkUnmapMemory(VkDevice device, VkDeviceMemory memory)} */
    public static void vkUnmapMemory(VkDevice device, @NativeType("VkDeviceMemory") long memory) {
        long __functionAddress = device.getCapabilities().vkUnmapMemory;
        callPJV(device.address(), memory, __functionAddress);
    }

    // --- [ vkFlushMappedMemoryRanges ] ---

    /** {@code VkResult vkFlushMappedMemoryRanges(VkDevice device, uint32_t memoryRangeCount, VkMappedMemoryRange const * pMemoryRanges)} */
    public static int nvkFlushMappedMemoryRanges(VkDevice device, int memoryRangeCount, long pMemoryRanges) {
        long __functionAddress = device.getCapabilities().vkFlushMappedMemoryRanges;
        return callPPI(device.address(), memoryRangeCount, pMemoryRanges, __functionAddress);
    }

    /** {@code VkResult vkFlushMappedMemoryRanges(VkDevice device, uint32_t memoryRangeCount, VkMappedMemoryRange const * pMemoryRanges)} */
    @NativeType("VkResult")
    public static int vkFlushMappedMemoryRanges(VkDevice device, @NativeType("VkMappedMemoryRange const *") VkMappedMemoryRange.Buffer pMemoryRanges) {
        return nvkFlushMappedMemoryRanges(device, pMemoryRanges.remaining(), pMemoryRanges.address());
    }

    /** {@code VkResult vkFlushMappedMemoryRanges(VkDevice device, uint32_t memoryRangeCount, VkMappedMemoryRange const * pMemoryRanges)} */
    @NativeType("VkResult")
    public static int vkFlushMappedMemoryRanges(VkDevice device, @NativeType("VkMappedMemoryRange const *") VkMappedMemoryRange pMemoryRange) {
        return nvkFlushMappedMemoryRanges(device, 1, pMemoryRange.address());
    }

    // --- [ vkInvalidateMappedMemoryRanges ] ---

    /** {@code VkResult vkInvalidateMappedMemoryRanges(VkDevice device, uint32_t memoryRangeCount, VkMappedMemoryRange const * pMemoryRanges)} */
    public static int nvkInvalidateMappedMemoryRanges(VkDevice device, int memoryRangeCount, long pMemoryRanges) {
        long __functionAddress = device.getCapabilities().vkInvalidateMappedMemoryRanges;
        return callPPI(device.address(), memoryRangeCount, pMemoryRanges, __functionAddress);
    }

    /** {@code VkResult vkInvalidateMappedMemoryRanges(VkDevice device, uint32_t memoryRangeCount, VkMappedMemoryRange const * pMemoryRanges)} */
    @NativeType("VkResult")
    public static int vkInvalidateMappedMemoryRanges(VkDevice device, @NativeType("VkMappedMemoryRange const *") VkMappedMemoryRange.Buffer pMemoryRanges) {
        return nvkInvalidateMappedMemoryRanges(device, pMemoryRanges.remaining(), pMemoryRanges.address());
    }

    /** {@code VkResult vkInvalidateMappedMemoryRanges(VkDevice device, uint32_t memoryRangeCount, VkMappedMemoryRange const * pMemoryRanges)} */
    @NativeType("VkResult")
    public static int vkInvalidateMappedMemoryRanges(VkDevice device, @NativeType("VkMappedMemoryRange const *") VkMappedMemoryRange pMemoryRange) {
        return nvkInvalidateMappedMemoryRanges(device, 1, pMemoryRange.address());
    }

    // --- [ vkGetDeviceMemoryCommitment ] ---

    /** {@code void vkGetDeviceMemoryCommitment(VkDevice device, VkDeviceMemory memory, VkDeviceSize * pCommittedMemoryInBytes)} */
    public static void nvkGetDeviceMemoryCommitment(VkDevice device, long memory, long pCommittedMemoryInBytes) {
        long __functionAddress = device.getCapabilities().vkGetDeviceMemoryCommitment;
        callPJPV(device.address(), memory, pCommittedMemoryInBytes, __functionAddress);
    }

    /** {@code void vkGetDeviceMemoryCommitment(VkDevice device, VkDeviceMemory memory, VkDeviceSize * pCommittedMemoryInBytes)} */
    public static void vkGetDeviceMemoryCommitment(VkDevice device, @NativeType("VkDeviceMemory") long memory, @NativeType("VkDeviceSize *") LongBuffer pCommittedMemoryInBytes) {
        if (CHECKS) {
            check(pCommittedMemoryInBytes, 1);
        }
        nvkGetDeviceMemoryCommitment(device, memory, memAddress(pCommittedMemoryInBytes));
    }

    // --- [ vkBindBufferMemory ] ---

    /** {@code VkResult vkBindBufferMemory(VkDevice device, VkBuffer buffer, VkDeviceMemory memory, VkDeviceSize memoryOffset)} */
    @NativeType("VkResult")
    public static int vkBindBufferMemory(VkDevice device, @NativeType("VkBuffer") long buffer, @NativeType("VkDeviceMemory") long memory, @NativeType("VkDeviceSize") long memoryOffset) {
        long __functionAddress = device.getCapabilities().vkBindBufferMemory;
        return callPJJJI(device.address(), buffer, memory, memoryOffset, __functionAddress);
    }

    // --- [ vkBindImageMemory ] ---

    /** {@code VkResult vkBindImageMemory(VkDevice device, VkImage image, VkDeviceMemory memory, VkDeviceSize memoryOffset)} */
    @NativeType("VkResult")
    public static int vkBindImageMemory(VkDevice device, @NativeType("VkImage") long image, @NativeType("VkDeviceMemory") long memory, @NativeType("VkDeviceSize") long memoryOffset) {
        long __functionAddress = device.getCapabilities().vkBindImageMemory;
        return callPJJJI(device.address(), image, memory, memoryOffset, __functionAddress);
    }

    // --- [ vkGetBufferMemoryRequirements ] ---

    /** {@code void vkGetBufferMemoryRequirements(VkDevice device, VkBuffer buffer, VkMemoryRequirements * pMemoryRequirements)} */
    public static void nvkGetBufferMemoryRequirements(VkDevice device, long buffer, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetBufferMemoryRequirements;
        callPJPV(device.address(), buffer, pMemoryRequirements, __functionAddress);
    }

    /** {@code void vkGetBufferMemoryRequirements(VkDevice device, VkBuffer buffer, VkMemoryRequirements * pMemoryRequirements)} */
    public static void vkGetBufferMemoryRequirements(VkDevice device, @NativeType("VkBuffer") long buffer, @NativeType("VkMemoryRequirements *") VkMemoryRequirements pMemoryRequirements) {
        nvkGetBufferMemoryRequirements(device, buffer, pMemoryRequirements.address());
    }

    // --- [ vkGetImageMemoryRequirements ] ---

    /** {@code void vkGetImageMemoryRequirements(VkDevice device, VkImage image, VkMemoryRequirements * pMemoryRequirements)} */
    public static void nvkGetImageMemoryRequirements(VkDevice device, long image, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetImageMemoryRequirements;
        callPJPV(device.address(), image, pMemoryRequirements, __functionAddress);
    }

    /** {@code void vkGetImageMemoryRequirements(VkDevice device, VkImage image, VkMemoryRequirements * pMemoryRequirements)} */
    public static void vkGetImageMemoryRequirements(VkDevice device, @NativeType("VkImage") long image, @NativeType("VkMemoryRequirements *") VkMemoryRequirements pMemoryRequirements) {
        nvkGetImageMemoryRequirements(device, image, pMemoryRequirements.address());
    }

    // --- [ vkGetImageSparseMemoryRequirements ] ---

    /** {@code void vkGetImageSparseMemoryRequirements(VkDevice device, VkImage image, uint32_t * pSparseMemoryRequirementCount, VkSparseImageMemoryRequirements * pSparseMemoryRequirements)} */
    public static void nvkGetImageSparseMemoryRequirements(VkDevice device, long image, long pSparseMemoryRequirementCount, long pSparseMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetImageSparseMemoryRequirements;
        callPJPPV(device.address(), image, pSparseMemoryRequirementCount, pSparseMemoryRequirements, __functionAddress);
    }

    /** {@code void vkGetImageSparseMemoryRequirements(VkDevice device, VkImage image, uint32_t * pSparseMemoryRequirementCount, VkSparseImageMemoryRequirements * pSparseMemoryRequirements)} */
    public static void vkGetImageSparseMemoryRequirements(VkDevice device, @NativeType("VkImage") long image, @NativeType("uint32_t *") IntBuffer pSparseMemoryRequirementCount, @NativeType("VkSparseImageMemoryRequirements *") VkSparseImageMemoryRequirements.@Nullable Buffer pSparseMemoryRequirements) {
        if (CHECKS) {
            check(pSparseMemoryRequirementCount, 1);
            checkSafe(pSparseMemoryRequirements, pSparseMemoryRequirementCount.get(pSparseMemoryRequirementCount.position()));
        }
        nvkGetImageSparseMemoryRequirements(device, image, memAddress(pSparseMemoryRequirementCount), memAddressSafe(pSparseMemoryRequirements));
    }

    // --- [ vkGetPhysicalDeviceSparseImageFormatProperties ] ---

    /** {@code void vkGetPhysicalDeviceSparseImageFormatProperties(VkPhysicalDevice physicalDevice, VkFormat format, VkImageType type, VkSampleCountFlagBits samples, VkImageUsageFlags usage, VkImageTiling tiling, uint32_t * pPropertyCount, VkSparseImageFormatProperties * pProperties)} */
    public static void nvkGetPhysicalDeviceSparseImageFormatProperties(VkPhysicalDevice physicalDevice, int format, int type, int samples, int usage, int tiling, long pPropertyCount, long pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSparseImageFormatProperties;
        callPPPV(physicalDevice.address(), format, type, samples, usage, tiling, pPropertyCount, pProperties, __functionAddress);
    }

    /** {@code void vkGetPhysicalDeviceSparseImageFormatProperties(VkPhysicalDevice physicalDevice, VkFormat format, VkImageType type, VkSampleCountFlagBits samples, VkImageUsageFlags usage, VkImageTiling tiling, uint32_t * pPropertyCount, VkSparseImageFormatProperties * pProperties)} */
    public static void vkGetPhysicalDeviceSparseImageFormatProperties(VkPhysicalDevice physicalDevice, @NativeType("VkFormat") int format, @NativeType("VkImageType") int type, @NativeType("VkSampleCountFlagBits") int samples, @NativeType("VkImageUsageFlags") int usage, @NativeType("VkImageTiling") int tiling, @NativeType("uint32_t *") IntBuffer pPropertyCount, @NativeType("VkSparseImageFormatProperties *") VkSparseImageFormatProperties.@Nullable Buffer pProperties) {
        if (CHECKS) {
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount.get(pPropertyCount.position()));
        }
        nvkGetPhysicalDeviceSparseImageFormatProperties(physicalDevice, format, type, samples, usage, tiling, memAddress(pPropertyCount), memAddressSafe(pProperties));
    }

    // --- [ vkQueueBindSparse ] ---

    /** {@code VkResult vkQueueBindSparse(VkQueue queue, uint32_t bindInfoCount, VkBindSparseInfo const * pBindInfo, VkFence fence)} */
    public static int nvkQueueBindSparse(VkQueue queue, int bindInfoCount, long pBindInfo, long fence) {
        long __functionAddress = queue.getCapabilities().vkQueueBindSparse;
        if (CHECKS) {
            if (pBindInfo != NULL) { Struct.validate(pBindInfo, bindInfoCount, VkBindSparseInfo.SIZEOF, VkBindSparseInfo::validate); }
        }
        return callPPJI(queue.address(), bindInfoCount, pBindInfo, fence, __functionAddress);
    }

    /** {@code VkResult vkQueueBindSparse(VkQueue queue, uint32_t bindInfoCount, VkBindSparseInfo const * pBindInfo, VkFence fence)} */
    @NativeType("VkResult")
    public static int vkQueueBindSparse(VkQueue queue, @NativeType("VkBindSparseInfo const *") VkBindSparseInfo.@Nullable Buffer pBindInfo, @NativeType("VkFence") long fence) {
        return nvkQueueBindSparse(queue, remainingSafe(pBindInfo), memAddressSafe(pBindInfo), fence);
    }

    /** {@code VkResult vkQueueBindSparse(VkQueue queue, uint32_t bindInfoCount, VkBindSparseInfo const * pBindInfo, VkFence fence)} */
    @NativeType("VkResult")
    public static int vkQueueBindSparse(VkQueue queue, @NativeType("VkBindSparseInfo const *") VkBindSparseInfo pBindInfo, @NativeType("VkFence") long fence) {
        return nvkQueueBindSparse(queue, 1, pBindInfo.address(), fence);
    }

    // --- [ vkCreateFence ] ---

    /** {@code VkResult vkCreateFence(VkDevice device, VkFenceCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkFence * pFence)} */
    public static int nvkCreateFence(VkDevice device, long pCreateInfo, long pAllocator, long pFence) {
        long __functionAddress = device.getCapabilities().vkCreateFence;
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pFence, __functionAddress);
    }

    /** {@code VkResult vkCreateFence(VkDevice device, VkFenceCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkFence * pFence)} */
    @NativeType("VkResult")
    public static int vkCreateFence(VkDevice device, @NativeType("VkFenceCreateInfo const *") VkFenceCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkFence *") LongBuffer pFence) {
        if (CHECKS) {
            check(pFence, 1);
        }
        return nvkCreateFence(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pFence));
    }

    // --- [ vkDestroyFence ] ---

    /** {@code void vkDestroyFence(VkDevice device, VkFence fence, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroyFence(VkDevice device, long fence, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyFence;
        callPJPV(device.address(), fence, pAllocator, __functionAddress);
    }

    /** {@code void vkDestroyFence(VkDevice device, VkFence fence, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroyFence(VkDevice device, @NativeType("VkFence") long fence, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyFence(device, fence, memAddressSafe(pAllocator));
    }

    // --- [ vkResetFences ] ---

    /** {@code VkResult vkResetFences(VkDevice device, uint32_t fenceCount, VkFence const * pFences)} */
    public static int nvkResetFences(VkDevice device, int fenceCount, long pFences) {
        long __functionAddress = device.getCapabilities().vkResetFences;
        return callPPI(device.address(), fenceCount, pFences, __functionAddress);
    }

    /** {@code VkResult vkResetFences(VkDevice device, uint32_t fenceCount, VkFence const * pFences)} */
    @NativeType("VkResult")
    public static int vkResetFences(VkDevice device, @NativeType("VkFence const *") LongBuffer pFences) {
        return nvkResetFences(device, pFences.remaining(), memAddress(pFences));
    }

    /** {@code VkResult vkResetFences(VkDevice device, uint32_t fenceCount, VkFence const * pFences)} */
    @NativeType("VkResult")
    public static int vkResetFences(VkDevice device, @NativeType("VkFence const *") long pFence) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer pFences = stack.longs(pFence);
            return nvkResetFences(device, 1, memAddress(pFences));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ vkGetFenceStatus ] ---

    /** {@code VkResult vkGetFenceStatus(VkDevice device, VkFence fence)} */
    @NativeType("VkResult")
    public static int vkGetFenceStatus(VkDevice device, @NativeType("VkFence") long fence) {
        long __functionAddress = device.getCapabilities().vkGetFenceStatus;
        return callPJI(device.address(), fence, __functionAddress);
    }

    // --- [ vkWaitForFences ] ---

    /** {@code VkResult vkWaitForFences(VkDevice device, uint32_t fenceCount, VkFence const * pFences, VkBool32 waitAll, uint64_t timeout)} */
    public static int nvkWaitForFences(VkDevice device, int fenceCount, long pFences, int waitAll, long timeout) {
        long __functionAddress = device.getCapabilities().vkWaitForFences;
        return callPPJI(device.address(), fenceCount, pFences, waitAll, timeout, __functionAddress);
    }

    /** {@code VkResult vkWaitForFences(VkDevice device, uint32_t fenceCount, VkFence const * pFences, VkBool32 waitAll, uint64_t timeout)} */
    @NativeType("VkResult")
    public static int vkWaitForFences(VkDevice device, @NativeType("VkFence const *") LongBuffer pFences, @NativeType("VkBool32") boolean waitAll, @NativeType("uint64_t") long timeout) {
        return nvkWaitForFences(device, pFences.remaining(), memAddress(pFences), waitAll ? 1 : 0, timeout);
    }

    /** {@code VkResult vkWaitForFences(VkDevice device, uint32_t fenceCount, VkFence const * pFences, VkBool32 waitAll, uint64_t timeout)} */
    @NativeType("VkResult")
    public static int vkWaitForFences(VkDevice device, @NativeType("VkFence const *") long pFence, @NativeType("VkBool32") boolean waitAll, @NativeType("uint64_t") long timeout) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer pFences = stack.longs(pFence);
            return nvkWaitForFences(device, 1, memAddress(pFences), waitAll ? 1 : 0, timeout);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ vkCreateSemaphore ] ---

    /** {@code VkResult vkCreateSemaphore(VkDevice device, VkSemaphoreCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkSemaphore * pSemaphore)} */
    public static int nvkCreateSemaphore(VkDevice device, long pCreateInfo, long pAllocator, long pSemaphore) {
        long __functionAddress = device.getCapabilities().vkCreateSemaphore;
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pSemaphore, __functionAddress);
    }

    /** {@code VkResult vkCreateSemaphore(VkDevice device, VkSemaphoreCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkSemaphore * pSemaphore)} */
    @NativeType("VkResult")
    public static int vkCreateSemaphore(VkDevice device, @NativeType("VkSemaphoreCreateInfo const *") VkSemaphoreCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkSemaphore *") LongBuffer pSemaphore) {
        if (CHECKS) {
            check(pSemaphore, 1);
        }
        return nvkCreateSemaphore(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pSemaphore));
    }

    // --- [ vkDestroySemaphore ] ---

    /** {@code void vkDestroySemaphore(VkDevice device, VkSemaphore semaphore, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroySemaphore(VkDevice device, long semaphore, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroySemaphore;
        callPJPV(device.address(), semaphore, pAllocator, __functionAddress);
    }

    /** {@code void vkDestroySemaphore(VkDevice device, VkSemaphore semaphore, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroySemaphore(VkDevice device, @NativeType("VkSemaphore") long semaphore, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroySemaphore(device, semaphore, memAddressSafe(pAllocator));
    }

    // --- [ vkCreateQueryPool ] ---

    /** {@code VkResult vkCreateQueryPool(VkDevice device, VkQueryPoolCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkQueryPool * pQueryPool)} */
    public static int nvkCreateQueryPool(VkDevice device, long pCreateInfo, long pAllocator, long pQueryPool) {
        long __functionAddress = device.getCapabilities().vkCreateQueryPool;
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pQueryPool, __functionAddress);
    }

    /** {@code VkResult vkCreateQueryPool(VkDevice device, VkQueryPoolCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkQueryPool * pQueryPool)} */
    @NativeType("VkResult")
    public static int vkCreateQueryPool(VkDevice device, @NativeType("VkQueryPoolCreateInfo const *") VkQueryPoolCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkQueryPool *") LongBuffer pQueryPool) {
        if (CHECKS) {
            check(pQueryPool, 1);
        }
        return nvkCreateQueryPool(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pQueryPool));
    }

    // --- [ vkDestroyQueryPool ] ---

    /** {@code void vkDestroyQueryPool(VkDevice device, VkQueryPool queryPool, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroyQueryPool(VkDevice device, long queryPool, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyQueryPool;
        callPJPV(device.address(), queryPool, pAllocator, __functionAddress);
    }

    /** {@code void vkDestroyQueryPool(VkDevice device, VkQueryPool queryPool, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroyQueryPool(VkDevice device, @NativeType("VkQueryPool") long queryPool, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyQueryPool(device, queryPool, memAddressSafe(pAllocator));
    }

    // --- [ vkGetQueryPoolResults ] ---

    /** {@code VkResult vkGetQueryPoolResults(VkDevice device, VkQueryPool queryPool, uint32_t firstQuery, uint32_t queryCount, size_t dataSize, void * pData, VkDeviceSize stride, VkQueryResultFlags flags)} */
    public static int nvkGetQueryPoolResults(VkDevice device, long queryPool, int firstQuery, int queryCount, long dataSize, long pData, long stride, int flags) {
        long __functionAddress = device.getCapabilities().vkGetQueryPoolResults;
        return callPJPPJI(device.address(), queryPool, firstQuery, queryCount, dataSize, pData, stride, flags, __functionAddress);
    }

    /** {@code VkResult vkGetQueryPoolResults(VkDevice device, VkQueryPool queryPool, uint32_t firstQuery, uint32_t queryCount, size_t dataSize, void * pData, VkDeviceSize stride, VkQueryResultFlags flags)} */
    @NativeType("VkResult")
    public static int vkGetQueryPoolResults(VkDevice device, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int firstQuery, @NativeType("uint32_t") int queryCount, @NativeType("void *") ByteBuffer pData, @NativeType("VkDeviceSize") long stride, @NativeType("VkQueryResultFlags") int flags) {
        return nvkGetQueryPoolResults(device, queryPool, firstQuery, queryCount, pData.remaining(), memAddress(pData), stride, flags);
    }

    /** {@code VkResult vkGetQueryPoolResults(VkDevice device, VkQueryPool queryPool, uint32_t firstQuery, uint32_t queryCount, size_t dataSize, void * pData, VkDeviceSize stride, VkQueryResultFlags flags)} */
    @NativeType("VkResult")
    public static int vkGetQueryPoolResults(VkDevice device, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int firstQuery, @NativeType("uint32_t") int queryCount, @NativeType("void *") IntBuffer pData, @NativeType("VkDeviceSize") long stride, @NativeType("VkQueryResultFlags") int flags) {
        return nvkGetQueryPoolResults(device, queryPool, firstQuery, queryCount, Integer.toUnsignedLong(pData.remaining()) << 2, memAddress(pData), stride, flags);
    }

    /** {@code VkResult vkGetQueryPoolResults(VkDevice device, VkQueryPool queryPool, uint32_t firstQuery, uint32_t queryCount, size_t dataSize, void * pData, VkDeviceSize stride, VkQueryResultFlags flags)} */
    @NativeType("VkResult")
    public static int vkGetQueryPoolResults(VkDevice device, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int firstQuery, @NativeType("uint32_t") int queryCount, @NativeType("void *") LongBuffer pData, @NativeType("VkDeviceSize") long stride, @NativeType("VkQueryResultFlags") int flags) {
        return nvkGetQueryPoolResults(device, queryPool, firstQuery, queryCount, Integer.toUnsignedLong(pData.remaining()) << 3, memAddress(pData), stride, flags);
    }

    // --- [ vkCreateBuffer ] ---

    /** {@code VkResult vkCreateBuffer(VkDevice device, VkBufferCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkBuffer * pBuffer)} */
    public static int nvkCreateBuffer(VkDevice device, long pCreateInfo, long pAllocator, long pBuffer) {
        long __functionAddress = device.getCapabilities().vkCreateBuffer;
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pBuffer, __functionAddress);
    }

    /** {@code VkResult vkCreateBuffer(VkDevice device, VkBufferCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkBuffer * pBuffer)} */
    @NativeType("VkResult")
    public static int vkCreateBuffer(VkDevice device, @NativeType("VkBufferCreateInfo const *") VkBufferCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkBuffer *") LongBuffer pBuffer) {
        if (CHECKS) {
            check(pBuffer, 1);
        }
        return nvkCreateBuffer(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pBuffer));
    }

    // --- [ vkDestroyBuffer ] ---

    /** {@code void vkDestroyBuffer(VkDevice device, VkBuffer buffer, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroyBuffer(VkDevice device, long buffer, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyBuffer;
        callPJPV(device.address(), buffer, pAllocator, __functionAddress);
    }

    /** {@code void vkDestroyBuffer(VkDevice device, VkBuffer buffer, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroyBuffer(VkDevice device, @NativeType("VkBuffer") long buffer, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyBuffer(device, buffer, memAddressSafe(pAllocator));
    }

    // --- [ vkCreateImage ] ---

    /** {@code VkResult vkCreateImage(VkDevice device, VkImageCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkImage * pImage)} */
    public static int nvkCreateImage(VkDevice device, long pCreateInfo, long pAllocator, long pImage) {
        long __functionAddress = device.getCapabilities().vkCreateImage;
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pImage, __functionAddress);
    }

    /** {@code VkResult vkCreateImage(VkDevice device, VkImageCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkImage * pImage)} */
    @NativeType("VkResult")
    public static int vkCreateImage(VkDevice device, @NativeType("VkImageCreateInfo const *") VkImageCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkImage *") LongBuffer pImage) {
        if (CHECKS) {
            check(pImage, 1);
        }
        return nvkCreateImage(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pImage));
    }

    // --- [ vkDestroyImage ] ---

    /** {@code void vkDestroyImage(VkDevice device, VkImage image, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroyImage(VkDevice device, long image, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyImage;
        callPJPV(device.address(), image, pAllocator, __functionAddress);
    }

    /** {@code void vkDestroyImage(VkDevice device, VkImage image, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroyImage(VkDevice device, @NativeType("VkImage") long image, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyImage(device, image, memAddressSafe(pAllocator));
    }

    // --- [ vkGetImageSubresourceLayout ] ---

    /** {@code void vkGetImageSubresourceLayout(VkDevice device, VkImage image, VkImageSubresource const * pSubresource, VkSubresourceLayout * pLayout)} */
    public static void nvkGetImageSubresourceLayout(VkDevice device, long image, long pSubresource, long pLayout) {
        long __functionAddress = device.getCapabilities().vkGetImageSubresourceLayout;
        callPJPPV(device.address(), image, pSubresource, pLayout, __functionAddress);
    }

    /** {@code void vkGetImageSubresourceLayout(VkDevice device, VkImage image, VkImageSubresource const * pSubresource, VkSubresourceLayout * pLayout)} */
    public static void vkGetImageSubresourceLayout(VkDevice device, @NativeType("VkImage") long image, @NativeType("VkImageSubresource const *") VkImageSubresource pSubresource, @NativeType("VkSubresourceLayout *") VkSubresourceLayout pLayout) {
        nvkGetImageSubresourceLayout(device, image, pSubresource.address(), pLayout.address());
    }

    // --- [ vkCreateImageView ] ---

    /** {@code VkResult vkCreateImageView(VkDevice device, VkImageViewCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkImageView * pView)} */
    public static int nvkCreateImageView(VkDevice device, long pCreateInfo, long pAllocator, long pView) {
        long __functionAddress = device.getCapabilities().vkCreateImageView;
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pView, __functionAddress);
    }

    /** {@code VkResult vkCreateImageView(VkDevice device, VkImageViewCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkImageView * pView)} */
    @NativeType("VkResult")
    public static int vkCreateImageView(VkDevice device, @NativeType("VkImageViewCreateInfo const *") VkImageViewCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkImageView *") LongBuffer pView) {
        if (CHECKS) {
            check(pView, 1);
        }
        return nvkCreateImageView(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pView));
    }

    // --- [ vkDestroyImageView ] ---

    /** {@code void vkDestroyImageView(VkDevice device, VkImageView imageView, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroyImageView(VkDevice device, long imageView, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyImageView;
        callPJPV(device.address(), imageView, pAllocator, __functionAddress);
    }

    /** {@code void vkDestroyImageView(VkDevice device, VkImageView imageView, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroyImageView(VkDevice device, @NativeType("VkImageView") long imageView, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyImageView(device, imageView, memAddressSafe(pAllocator));
    }

    // --- [ vkCreateCommandPool ] ---

    /** {@code VkResult vkCreateCommandPool(VkDevice device, VkCommandPoolCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkCommandPool * pCommandPool)} */
    public static int nvkCreateCommandPool(VkDevice device, long pCreateInfo, long pAllocator, long pCommandPool) {
        long __functionAddress = device.getCapabilities().vkCreateCommandPool;
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pCommandPool, __functionAddress);
    }

    /** {@code VkResult vkCreateCommandPool(VkDevice device, VkCommandPoolCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkCommandPool * pCommandPool)} */
    @NativeType("VkResult")
    public static int vkCreateCommandPool(VkDevice device, @NativeType("VkCommandPoolCreateInfo const *") VkCommandPoolCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkCommandPool *") LongBuffer pCommandPool) {
        if (CHECKS) {
            check(pCommandPool, 1);
        }
        return nvkCreateCommandPool(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pCommandPool));
    }

    // --- [ vkDestroyCommandPool ] ---

    /** {@code void vkDestroyCommandPool(VkDevice device, VkCommandPool commandPool, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroyCommandPool(VkDevice device, long commandPool, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyCommandPool;
        callPJPV(device.address(), commandPool, pAllocator, __functionAddress);
    }

    /** {@code void vkDestroyCommandPool(VkDevice device, VkCommandPool commandPool, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroyCommandPool(VkDevice device, @NativeType("VkCommandPool") long commandPool, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyCommandPool(device, commandPool, memAddressSafe(pAllocator));
    }

    // --- [ vkResetCommandPool ] ---

    /** {@code VkResult vkResetCommandPool(VkDevice device, VkCommandPool commandPool, VkCommandPoolResetFlags flags)} */
    @NativeType("VkResult")
    public static int vkResetCommandPool(VkDevice device, @NativeType("VkCommandPool") long commandPool, @NativeType("VkCommandPoolResetFlags") int flags) {
        long __functionAddress = device.getCapabilities().vkResetCommandPool;
        return callPJI(device.address(), commandPool, flags, __functionAddress);
    }

    // --- [ vkAllocateCommandBuffers ] ---

    /** {@code VkResult vkAllocateCommandBuffers(VkDevice device, VkCommandBufferAllocateInfo const * pAllocateInfo, VkCommandBuffer * pCommandBuffers)} */
    public static int nvkAllocateCommandBuffers(VkDevice device, long pAllocateInfo, long pCommandBuffers) {
        long __functionAddress = device.getCapabilities().vkAllocateCommandBuffers;
        return callPPPI(device.address(), pAllocateInfo, pCommandBuffers, __functionAddress);
    }

    /** {@code VkResult vkAllocateCommandBuffers(VkDevice device, VkCommandBufferAllocateInfo const * pAllocateInfo, VkCommandBuffer * pCommandBuffers)} */
    @NativeType("VkResult")
    public static int vkAllocateCommandBuffers(VkDevice device, @NativeType("VkCommandBufferAllocateInfo const *") VkCommandBufferAllocateInfo pAllocateInfo, @NativeType("VkCommandBuffer *") PointerBuffer pCommandBuffers) {
        if (CHECKS) {
            check(pCommandBuffers, pAllocateInfo.commandBufferCount());
        }
        return nvkAllocateCommandBuffers(device, pAllocateInfo.address(), memAddress(pCommandBuffers));
    }

    // --- [ vkFreeCommandBuffers ] ---

    /** {@code void vkFreeCommandBuffers(VkDevice device, VkCommandPool commandPool, uint32_t commandBufferCount, VkCommandBuffer const * pCommandBuffers)} */
    public static void nvkFreeCommandBuffers(VkDevice device, long commandPool, int commandBufferCount, long pCommandBuffers) {
        long __functionAddress = device.getCapabilities().vkFreeCommandBuffers;
        callPJPV(device.address(), commandPool, commandBufferCount, pCommandBuffers, __functionAddress);
    }

    /** {@code void vkFreeCommandBuffers(VkDevice device, VkCommandPool commandPool, uint32_t commandBufferCount, VkCommandBuffer const * pCommandBuffers)} */
    public static void vkFreeCommandBuffers(VkDevice device, @NativeType("VkCommandPool") long commandPool, @NativeType("VkCommandBuffer const *") @Nullable PointerBuffer pCommandBuffers) {
        nvkFreeCommandBuffers(device, commandPool, remainingSafe(pCommandBuffers), memAddressSafe(pCommandBuffers));
    }

    /** {@code void vkFreeCommandBuffers(VkDevice device, VkCommandPool commandPool, uint32_t commandBufferCount, VkCommandBuffer const * pCommandBuffers)} */
    public static void vkFreeCommandBuffers(VkDevice device, @NativeType("VkCommandPool") long commandPool, @NativeType("VkCommandBuffer const *") VkCommandBuffer pCommandBuffer) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer pCommandBuffers = stack.pointers(pCommandBuffer);
            nvkFreeCommandBuffers(device, commandPool, 1, memAddress(pCommandBuffers));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ vkBeginCommandBuffer ] ---

    /** {@code VkResult vkBeginCommandBuffer(VkCommandBuffer commandBuffer, VkCommandBufferBeginInfo const * pBeginInfo)} */
    public static int nvkBeginCommandBuffer(VkCommandBuffer commandBuffer, long pBeginInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkBeginCommandBuffer;
        return callPPI(commandBuffer.address(), pBeginInfo, __functionAddress);
    }

    /** {@code VkResult vkBeginCommandBuffer(VkCommandBuffer commandBuffer, VkCommandBufferBeginInfo const * pBeginInfo)} */
    @NativeType("VkResult")
    public static int vkBeginCommandBuffer(VkCommandBuffer commandBuffer, @NativeType("VkCommandBufferBeginInfo const *") VkCommandBufferBeginInfo pBeginInfo) {
        return nvkBeginCommandBuffer(commandBuffer, pBeginInfo.address());
    }

    // --- [ vkEndCommandBuffer ] ---

    /** {@code VkResult vkEndCommandBuffer(VkCommandBuffer commandBuffer)} */
    @NativeType("VkResult")
    public static int vkEndCommandBuffer(VkCommandBuffer commandBuffer) {
        long __functionAddress = commandBuffer.getCapabilities().vkEndCommandBuffer;
        return callPI(commandBuffer.address(), __functionAddress);
    }

    // --- [ vkResetCommandBuffer ] ---

    /** {@code VkResult vkResetCommandBuffer(VkCommandBuffer commandBuffer, VkCommandBufferResetFlags flags)} */
    @NativeType("VkResult")
    public static int vkResetCommandBuffer(VkCommandBuffer commandBuffer, @NativeType("VkCommandBufferResetFlags") int flags) {
        long __functionAddress = commandBuffer.getCapabilities().vkResetCommandBuffer;
        return callPI(commandBuffer.address(), flags, __functionAddress);
    }

    // --- [ vkCmdCopyBuffer ] ---

    /** {@code void vkCmdCopyBuffer(VkCommandBuffer commandBuffer, VkBuffer srcBuffer, VkBuffer dstBuffer, uint32_t regionCount, VkBufferCopy const * pRegions)} */
    public static void nvkCmdCopyBuffer(VkCommandBuffer commandBuffer, long srcBuffer, long dstBuffer, int regionCount, long pRegions) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyBuffer;
        callPJJPV(commandBuffer.address(), srcBuffer, dstBuffer, regionCount, pRegions, __functionAddress);
    }

    /** {@code void vkCmdCopyBuffer(VkCommandBuffer commandBuffer, VkBuffer srcBuffer, VkBuffer dstBuffer, uint32_t regionCount, VkBufferCopy const * pRegions)} */
    public static void vkCmdCopyBuffer(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long srcBuffer, @NativeType("VkBuffer") long dstBuffer, @NativeType("VkBufferCopy const *") VkBufferCopy.Buffer pRegions) {
        nvkCmdCopyBuffer(commandBuffer, srcBuffer, dstBuffer, pRegions.remaining(), pRegions.address());
    }

    // --- [ vkCmdCopyImage ] ---

    /** {@code void vkCmdCopyImage(VkCommandBuffer commandBuffer, VkImage srcImage, VkImageLayout srcImageLayout, VkImage dstImage, VkImageLayout dstImageLayout, uint32_t regionCount, VkImageCopy const * pRegions)} */
    public static void nvkCmdCopyImage(VkCommandBuffer commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, int regionCount, long pRegions) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyImage;
        callPJJPV(commandBuffer.address(), srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions, __functionAddress);
    }

    /** {@code void vkCmdCopyImage(VkCommandBuffer commandBuffer, VkImage srcImage, VkImageLayout srcImageLayout, VkImage dstImage, VkImageLayout dstImageLayout, uint32_t regionCount, VkImageCopy const * pRegions)} */
    public static void vkCmdCopyImage(VkCommandBuffer commandBuffer, @NativeType("VkImage") long srcImage, @NativeType("VkImageLayout") int srcImageLayout, @NativeType("VkImage") long dstImage, @NativeType("VkImageLayout") int dstImageLayout, @NativeType("VkImageCopy const *") VkImageCopy.Buffer pRegions) {
        nvkCmdCopyImage(commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, pRegions.remaining(), pRegions.address());
    }

    // --- [ vkCmdCopyBufferToImage ] ---

    /** {@code void vkCmdCopyBufferToImage(VkCommandBuffer commandBuffer, VkBuffer srcBuffer, VkImage dstImage, VkImageLayout dstImageLayout, uint32_t regionCount, VkBufferImageCopy const * pRegions)} */
    public static void nvkCmdCopyBufferToImage(VkCommandBuffer commandBuffer, long srcBuffer, long dstImage, int dstImageLayout, int regionCount, long pRegions) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyBufferToImage;
        callPJJPV(commandBuffer.address(), srcBuffer, dstImage, dstImageLayout, regionCount, pRegions, __functionAddress);
    }

    /** {@code void vkCmdCopyBufferToImage(VkCommandBuffer commandBuffer, VkBuffer srcBuffer, VkImage dstImage, VkImageLayout dstImageLayout, uint32_t regionCount, VkBufferImageCopy const * pRegions)} */
    public static void vkCmdCopyBufferToImage(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long srcBuffer, @NativeType("VkImage") long dstImage, @NativeType("VkImageLayout") int dstImageLayout, @NativeType("VkBufferImageCopy const *") VkBufferImageCopy.Buffer pRegions) {
        nvkCmdCopyBufferToImage(commandBuffer, srcBuffer, dstImage, dstImageLayout, pRegions.remaining(), pRegions.address());
    }

    // --- [ vkCmdCopyImageToBuffer ] ---

    /** {@code void vkCmdCopyImageToBuffer(VkCommandBuffer commandBuffer, VkImage srcImage, VkImageLayout srcImageLayout, VkBuffer dstBuffer, uint32_t regionCount, VkBufferImageCopy const * pRegions)} */
    public static void nvkCmdCopyImageToBuffer(VkCommandBuffer commandBuffer, long srcImage, int srcImageLayout, long dstBuffer, int regionCount, long pRegions) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyImageToBuffer;
        callPJJPV(commandBuffer.address(), srcImage, srcImageLayout, dstBuffer, regionCount, pRegions, __functionAddress);
    }

    /** {@code void vkCmdCopyImageToBuffer(VkCommandBuffer commandBuffer, VkImage srcImage, VkImageLayout srcImageLayout, VkBuffer dstBuffer, uint32_t regionCount, VkBufferImageCopy const * pRegions)} */
    public static void vkCmdCopyImageToBuffer(VkCommandBuffer commandBuffer, @NativeType("VkImage") long srcImage, @NativeType("VkImageLayout") int srcImageLayout, @NativeType("VkBuffer") long dstBuffer, @NativeType("VkBufferImageCopy const *") VkBufferImageCopy.Buffer pRegions) {
        nvkCmdCopyImageToBuffer(commandBuffer, srcImage, srcImageLayout, dstBuffer, pRegions.remaining(), pRegions.address());
    }

    // --- [ vkCmdUpdateBuffer ] ---

    /** {@code void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, VkBuffer dstBuffer, VkDeviceSize dstOffset, VkDeviceSize dataSize, void const * pData)} */
    public static void nvkCmdUpdateBuffer(VkCommandBuffer commandBuffer, long dstBuffer, long dstOffset, long dataSize, long pData) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdUpdateBuffer;
        callPJJJPV(commandBuffer.address(), dstBuffer, dstOffset, dataSize, pData, __functionAddress);
    }

    /** {@code void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, VkBuffer dstBuffer, VkDeviceSize dstOffset, VkDeviceSize dataSize, void const * pData)} */
    public static void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long dstBuffer, @NativeType("VkDeviceSize") long dstOffset, @NativeType("void const *") ByteBuffer pData) {
        nvkCmdUpdateBuffer(commandBuffer, dstBuffer, dstOffset, pData.remaining(), memAddress(pData));
    }

    /** {@code void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, VkBuffer dstBuffer, VkDeviceSize dstOffset, VkDeviceSize dataSize, void const * pData)} */
    public static void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long dstBuffer, @NativeType("VkDeviceSize") long dstOffset, @NativeType("void const *") ShortBuffer pData) {
        nvkCmdUpdateBuffer(commandBuffer, dstBuffer, dstOffset, Integer.toUnsignedLong(pData.remaining()) << 1, memAddress(pData));
    }

    /** {@code void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, VkBuffer dstBuffer, VkDeviceSize dstOffset, VkDeviceSize dataSize, void const * pData)} */
    public static void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long dstBuffer, @NativeType("VkDeviceSize") long dstOffset, @NativeType("void const *") IntBuffer pData) {
        nvkCmdUpdateBuffer(commandBuffer, dstBuffer, dstOffset, Integer.toUnsignedLong(pData.remaining()) << 2, memAddress(pData));
    }

    /** {@code void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, VkBuffer dstBuffer, VkDeviceSize dstOffset, VkDeviceSize dataSize, void const * pData)} */
    public static void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long dstBuffer, @NativeType("VkDeviceSize") long dstOffset, @NativeType("void const *") LongBuffer pData) {
        nvkCmdUpdateBuffer(commandBuffer, dstBuffer, dstOffset, Integer.toUnsignedLong(pData.remaining()) << 3, memAddress(pData));
    }

    /** {@code void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, VkBuffer dstBuffer, VkDeviceSize dstOffset, VkDeviceSize dataSize, void const * pData)} */
    public static void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long dstBuffer, @NativeType("VkDeviceSize") long dstOffset, @NativeType("void const *") FloatBuffer pData) {
        nvkCmdUpdateBuffer(commandBuffer, dstBuffer, dstOffset, Integer.toUnsignedLong(pData.remaining()) << 2, memAddress(pData));
    }

    /** {@code void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, VkBuffer dstBuffer, VkDeviceSize dstOffset, VkDeviceSize dataSize, void const * pData)} */
    public static void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long dstBuffer, @NativeType("VkDeviceSize") long dstOffset, @NativeType("void const *") DoubleBuffer pData) {
        nvkCmdUpdateBuffer(commandBuffer, dstBuffer, dstOffset, Integer.toUnsignedLong(pData.remaining()) << 3, memAddress(pData));
    }

    // --- [ vkCmdFillBuffer ] ---

    /** {@code void vkCmdFillBuffer(VkCommandBuffer commandBuffer, VkBuffer dstBuffer, VkDeviceSize dstOffset, VkDeviceSize size, uint32_t data)} */
    public static void vkCmdFillBuffer(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long dstBuffer, @NativeType("VkDeviceSize") long dstOffset, @NativeType("VkDeviceSize") long size, @NativeType("uint32_t") int data) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdFillBuffer;
        callPJJJV(commandBuffer.address(), dstBuffer, dstOffset, size, data, __functionAddress);
    }

    // --- [ vkCmdPipelineBarrier ] ---

    /** {@code void vkCmdPipelineBarrier(VkCommandBuffer commandBuffer, VkPipelineStageFlags srcStageMask, VkPipelineStageFlags dstStageMask, VkDependencyFlags dependencyFlags, uint32_t memoryBarrierCount, VkMemoryBarrier const * pMemoryBarriers, uint32_t bufferMemoryBarrierCount, VkBufferMemoryBarrier const * pBufferMemoryBarriers, uint32_t imageMemoryBarrierCount, VkImageMemoryBarrier const * pImageMemoryBarriers)} */
    public static void nvkCmdPipelineBarrier(VkCommandBuffer commandBuffer, int srcStageMask, int dstStageMask, int dependencyFlags, int memoryBarrierCount, long pMemoryBarriers, int bufferMemoryBarrierCount, long pBufferMemoryBarriers, int imageMemoryBarrierCount, long pImageMemoryBarriers) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPipelineBarrier;
        callPPPPV(commandBuffer.address(), srcStageMask, dstStageMask, dependencyFlags, memoryBarrierCount, pMemoryBarriers, bufferMemoryBarrierCount, pBufferMemoryBarriers, imageMemoryBarrierCount, pImageMemoryBarriers, __functionAddress);
    }

    /** {@code void vkCmdPipelineBarrier(VkCommandBuffer commandBuffer, VkPipelineStageFlags srcStageMask, VkPipelineStageFlags dstStageMask, VkDependencyFlags dependencyFlags, uint32_t memoryBarrierCount, VkMemoryBarrier const * pMemoryBarriers, uint32_t bufferMemoryBarrierCount, VkBufferMemoryBarrier const * pBufferMemoryBarriers, uint32_t imageMemoryBarrierCount, VkImageMemoryBarrier const * pImageMemoryBarriers)} */
    public static void vkCmdPipelineBarrier(VkCommandBuffer commandBuffer, @NativeType("VkPipelineStageFlags") int srcStageMask, @NativeType("VkPipelineStageFlags") int dstStageMask, @NativeType("VkDependencyFlags") int dependencyFlags, @NativeType("VkMemoryBarrier const *") VkMemoryBarrier.@Nullable Buffer pMemoryBarriers, @NativeType("VkBufferMemoryBarrier const *") VkBufferMemoryBarrier.@Nullable Buffer pBufferMemoryBarriers, @NativeType("VkImageMemoryBarrier const *") VkImageMemoryBarrier.@Nullable Buffer pImageMemoryBarriers) {
        nvkCmdPipelineBarrier(commandBuffer, srcStageMask, dstStageMask, dependencyFlags, remainingSafe(pMemoryBarriers), memAddressSafe(pMemoryBarriers), remainingSafe(pBufferMemoryBarriers), memAddressSafe(pBufferMemoryBarriers), remainingSafe(pImageMemoryBarriers), memAddressSafe(pImageMemoryBarriers));
    }

    // --- [ vkCmdBeginQuery ] ---

    /** {@code void vkCmdBeginQuery(VkCommandBuffer commandBuffer, VkQueryPool queryPool, uint32_t query, VkQueryControlFlags flags)} */
    public static void vkCmdBeginQuery(VkCommandBuffer commandBuffer, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int query, @NativeType("VkQueryControlFlags") int flags) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBeginQuery;
        callPJV(commandBuffer.address(), queryPool, query, flags, __functionAddress);
    }

    // --- [ vkCmdEndQuery ] ---

    /** {@code void vkCmdEndQuery(VkCommandBuffer commandBuffer, VkQueryPool queryPool, uint32_t query)} */
    public static void vkCmdEndQuery(VkCommandBuffer commandBuffer, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int query) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdEndQuery;
        callPJV(commandBuffer.address(), queryPool, query, __functionAddress);
    }

    // --- [ vkCmdResetQueryPool ] ---

    /** {@code void vkCmdResetQueryPool(VkCommandBuffer commandBuffer, VkQueryPool queryPool, uint32_t firstQuery, uint32_t queryCount)} */
    public static void vkCmdResetQueryPool(VkCommandBuffer commandBuffer, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int firstQuery, @NativeType("uint32_t") int queryCount) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdResetQueryPool;
        callPJV(commandBuffer.address(), queryPool, firstQuery, queryCount, __functionAddress);
    }

    // --- [ vkCmdWriteTimestamp ] ---

    /** {@code void vkCmdWriteTimestamp(VkCommandBuffer commandBuffer, VkPipelineStageFlagBits pipelineStage, VkQueryPool queryPool, uint32_t query)} */
    public static void vkCmdWriteTimestamp(VkCommandBuffer commandBuffer, @NativeType("VkPipelineStageFlagBits") int pipelineStage, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int query) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdWriteTimestamp;
        callPJV(commandBuffer.address(), pipelineStage, queryPool, query, __functionAddress);
    }

    // --- [ vkCmdCopyQueryPoolResults ] ---

    /** {@code void vkCmdCopyQueryPoolResults(VkCommandBuffer commandBuffer, VkQueryPool queryPool, uint32_t firstQuery, uint32_t queryCount, VkBuffer dstBuffer, VkDeviceSize dstOffset, VkDeviceSize stride, VkQueryResultFlags flags)} */
    public static void vkCmdCopyQueryPoolResults(VkCommandBuffer commandBuffer, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int firstQuery, @NativeType("uint32_t") int queryCount, @NativeType("VkBuffer") long dstBuffer, @NativeType("VkDeviceSize") long dstOffset, @NativeType("VkDeviceSize") long stride, @NativeType("VkQueryResultFlags") int flags) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyQueryPoolResults;
        callPJJJJV(commandBuffer.address(), queryPool, firstQuery, queryCount, dstBuffer, dstOffset, stride, flags, __functionAddress);
    }

    // --- [ vkCmdExecuteCommands ] ---

    /** {@code void vkCmdExecuteCommands(VkCommandBuffer commandBuffer, uint32_t commandBufferCount, VkCommandBuffer const * pCommandBuffers)} */
    public static void nvkCmdExecuteCommands(VkCommandBuffer commandBuffer, int commandBufferCount, long pCommandBuffers) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdExecuteCommands;
        callPPV(commandBuffer.address(), commandBufferCount, pCommandBuffers, __functionAddress);
    }

    /** {@code void vkCmdExecuteCommands(VkCommandBuffer commandBuffer, uint32_t commandBufferCount, VkCommandBuffer const * pCommandBuffers)} */
    public static void vkCmdExecuteCommands(VkCommandBuffer commandBuffer, @NativeType("VkCommandBuffer const *") PointerBuffer pCommandBuffers) {
        nvkCmdExecuteCommands(commandBuffer, pCommandBuffers.remaining(), memAddress(pCommandBuffers));
    }

    /** {@code void vkCmdExecuteCommands(VkCommandBuffer commandBuffer, uint32_t commandBufferCount, VkCommandBuffer const * pCommandBuffers)} */
    public static void vkCmdExecuteCommands(VkCommandBuffer commandBuffer, @NativeType("VkCommandBuffer const *") VkCommandBuffer pCommandBuffer) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer pCommandBuffers = stack.pointers(pCommandBuffer);
            nvkCmdExecuteCommands(commandBuffer, 1, memAddress(pCommandBuffers));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ vkCreateEvent ] ---

    /** {@code VkResult vkCreateEvent(VkDevice device, VkEventCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkEvent * pEvent)} */
    public static int nvkCreateEvent(VkDevice device, long pCreateInfo, long pAllocator, long pEvent) {
        long __functionAddress = device.getCapabilities().vkCreateEvent;
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pEvent, __functionAddress);
    }

    /** {@code VkResult vkCreateEvent(VkDevice device, VkEventCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkEvent * pEvent)} */
    @NativeType("VkResult")
    public static int vkCreateEvent(VkDevice device, @NativeType("VkEventCreateInfo const *") VkEventCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkEvent *") LongBuffer pEvent) {
        if (CHECKS) {
            check(pEvent, 1);
        }
        return nvkCreateEvent(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pEvent));
    }

    // --- [ vkDestroyEvent ] ---

    /** {@code void vkDestroyEvent(VkDevice device, VkEvent event, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroyEvent(VkDevice device, long event, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyEvent;
        callPJPV(device.address(), event, pAllocator, __functionAddress);
    }

    /** {@code void vkDestroyEvent(VkDevice device, VkEvent event, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroyEvent(VkDevice device, @NativeType("VkEvent") long event, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyEvent(device, event, memAddressSafe(pAllocator));
    }

    // --- [ vkGetEventStatus ] ---

    /** {@code VkResult vkGetEventStatus(VkDevice device, VkEvent event)} */
    @NativeType("VkResult")
    public static int vkGetEventStatus(VkDevice device, @NativeType("VkEvent") long event) {
        long __functionAddress = device.getCapabilities().vkGetEventStatus;
        return callPJI(device.address(), event, __functionAddress);
    }

    // --- [ vkSetEvent ] ---

    /** {@code VkResult vkSetEvent(VkDevice device, VkEvent event)} */
    @NativeType("VkResult")
    public static int vkSetEvent(VkDevice device, @NativeType("VkEvent") long event) {
        long __functionAddress = device.getCapabilities().vkSetEvent;
        return callPJI(device.address(), event, __functionAddress);
    }

    // --- [ vkResetEvent ] ---

    /** {@code VkResult vkResetEvent(VkDevice device, VkEvent event)} */
    @NativeType("VkResult")
    public static int vkResetEvent(VkDevice device, @NativeType("VkEvent") long event) {
        long __functionAddress = device.getCapabilities().vkResetEvent;
        return callPJI(device.address(), event, __functionAddress);
    }

    // --- [ vkCreateBufferView ] ---

    /** {@code VkResult vkCreateBufferView(VkDevice device, VkBufferViewCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkBufferView * pView)} */
    public static int nvkCreateBufferView(VkDevice device, long pCreateInfo, long pAllocator, long pView) {
        long __functionAddress = device.getCapabilities().vkCreateBufferView;
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pView, __functionAddress);
    }

    /** {@code VkResult vkCreateBufferView(VkDevice device, VkBufferViewCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkBufferView * pView)} */
    @NativeType("VkResult")
    public static int vkCreateBufferView(VkDevice device, @NativeType("VkBufferViewCreateInfo const *") VkBufferViewCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkBufferView *") LongBuffer pView) {
        if (CHECKS) {
            check(pView, 1);
        }
        return nvkCreateBufferView(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pView));
    }

    // --- [ vkDestroyBufferView ] ---

    /** {@code void vkDestroyBufferView(VkDevice device, VkBufferView bufferView, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroyBufferView(VkDevice device, long bufferView, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyBufferView;
        callPJPV(device.address(), bufferView, pAllocator, __functionAddress);
    }

    /** {@code void vkDestroyBufferView(VkDevice device, VkBufferView bufferView, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroyBufferView(VkDevice device, @NativeType("VkBufferView") long bufferView, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyBufferView(device, bufferView, memAddressSafe(pAllocator));
    }

    // --- [ vkCreateShaderModule ] ---

    /** {@code VkResult vkCreateShaderModule(VkDevice device, VkShaderModuleCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkShaderModule * pShaderModule)} */
    public static int nvkCreateShaderModule(VkDevice device, long pCreateInfo, long pAllocator, long pShaderModule) {
        long __functionAddress = device.getCapabilities().vkCreateShaderModule;
        if (CHECKS) {
            VkShaderModuleCreateInfo.validate(pCreateInfo);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pShaderModule, __functionAddress);
    }

    /** {@code VkResult vkCreateShaderModule(VkDevice device, VkShaderModuleCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkShaderModule * pShaderModule)} */
    @NativeType("VkResult")
    public static int vkCreateShaderModule(VkDevice device, @NativeType("VkShaderModuleCreateInfo const *") VkShaderModuleCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkShaderModule *") LongBuffer pShaderModule) {
        if (CHECKS) {
            check(pShaderModule, 1);
        }
        return nvkCreateShaderModule(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pShaderModule));
    }

    // --- [ vkDestroyShaderModule ] ---

    /** {@code void vkDestroyShaderModule(VkDevice device, VkShaderModule shaderModule, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroyShaderModule(VkDevice device, long shaderModule, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyShaderModule;
        callPJPV(device.address(), shaderModule, pAllocator, __functionAddress);
    }

    /** {@code void vkDestroyShaderModule(VkDevice device, VkShaderModule shaderModule, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroyShaderModule(VkDevice device, @NativeType("VkShaderModule") long shaderModule, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyShaderModule(device, shaderModule, memAddressSafe(pAllocator));
    }

    // --- [ vkCreatePipelineCache ] ---

    /** {@code VkResult vkCreatePipelineCache(VkDevice device, VkPipelineCacheCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkPipelineCache * pPipelineCache)} */
    public static int nvkCreatePipelineCache(VkDevice device, long pCreateInfo, long pAllocator, long pPipelineCache) {
        long __functionAddress = device.getCapabilities().vkCreatePipelineCache;
        if (CHECKS) {
            VkPipelineCacheCreateInfo.validate(pCreateInfo);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pPipelineCache, __functionAddress);
    }

    /** {@code VkResult vkCreatePipelineCache(VkDevice device, VkPipelineCacheCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkPipelineCache * pPipelineCache)} */
    @NativeType("VkResult")
    public static int vkCreatePipelineCache(VkDevice device, @NativeType("VkPipelineCacheCreateInfo const *") VkPipelineCacheCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkPipelineCache *") LongBuffer pPipelineCache) {
        if (CHECKS) {
            check(pPipelineCache, 1);
        }
        return nvkCreatePipelineCache(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pPipelineCache));
    }

    // --- [ vkDestroyPipelineCache ] ---

    /** {@code void vkDestroyPipelineCache(VkDevice device, VkPipelineCache pipelineCache, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroyPipelineCache(VkDevice device, long pipelineCache, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyPipelineCache;
        callPJPV(device.address(), pipelineCache, pAllocator, __functionAddress);
    }

    /** {@code void vkDestroyPipelineCache(VkDevice device, VkPipelineCache pipelineCache, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroyPipelineCache(VkDevice device, @NativeType("VkPipelineCache") long pipelineCache, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyPipelineCache(device, pipelineCache, memAddressSafe(pAllocator));
    }

    // --- [ vkGetPipelineCacheData ] ---

    /** {@code VkResult vkGetPipelineCacheData(VkDevice device, VkPipelineCache pipelineCache, size_t * pDataSize, void * pData)} */
    public static int nvkGetPipelineCacheData(VkDevice device, long pipelineCache, long pDataSize, long pData) {
        long __functionAddress = device.getCapabilities().vkGetPipelineCacheData;
        return callPJPPI(device.address(), pipelineCache, pDataSize, pData, __functionAddress);
    }

    /** {@code VkResult vkGetPipelineCacheData(VkDevice device, VkPipelineCache pipelineCache, size_t * pDataSize, void * pData)} */
    @NativeType("VkResult")
    public static int vkGetPipelineCacheData(VkDevice device, @NativeType("VkPipelineCache") long pipelineCache, @NativeType("size_t *") PointerBuffer pDataSize, @NativeType("void *") @Nullable ByteBuffer pData) {
        if (CHECKS) {
            check(pDataSize, 1);
            checkSafe(pData, pDataSize.get(pDataSize.position()));
        }
        return nvkGetPipelineCacheData(device, pipelineCache, memAddress(pDataSize), memAddressSafe(pData));
    }

    // --- [ vkMergePipelineCaches ] ---

    /** {@code VkResult vkMergePipelineCaches(VkDevice device, VkPipelineCache dstCache, uint32_t srcCacheCount, VkPipelineCache const * pSrcCaches)} */
    public static int nvkMergePipelineCaches(VkDevice device, long dstCache, int srcCacheCount, long pSrcCaches) {
        long __functionAddress = device.getCapabilities().vkMergePipelineCaches;
        return callPJPI(device.address(), dstCache, srcCacheCount, pSrcCaches, __functionAddress);
    }

    /** {@code VkResult vkMergePipelineCaches(VkDevice device, VkPipelineCache dstCache, uint32_t srcCacheCount, VkPipelineCache const * pSrcCaches)} */
    @NativeType("VkResult")
    public static int vkMergePipelineCaches(VkDevice device, @NativeType("VkPipelineCache") long dstCache, @NativeType("VkPipelineCache const *") LongBuffer pSrcCaches) {
        return nvkMergePipelineCaches(device, dstCache, pSrcCaches.remaining(), memAddress(pSrcCaches));
    }

    // --- [ vkCreateComputePipelines ] ---

    /** {@code VkResult vkCreateComputePipelines(VkDevice device, VkPipelineCache pipelineCache, uint32_t createInfoCount, VkComputePipelineCreateInfo const * pCreateInfos, VkAllocationCallbacks const * pAllocator, VkPipeline * pPipelines)} */
    public static int nvkCreateComputePipelines(VkDevice device, long pipelineCache, int createInfoCount, long pCreateInfos, long pAllocator, long pPipelines) {
        long __functionAddress = device.getCapabilities().vkCreateComputePipelines;
        if (CHECKS) {
            Struct.validate(pCreateInfos, createInfoCount, VkComputePipelineCreateInfo.SIZEOF, VkComputePipelineCreateInfo::validate);
        }
        return callPJPPPI(device.address(), pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines, __functionAddress);
    }

    /** {@code VkResult vkCreateComputePipelines(VkDevice device, VkPipelineCache pipelineCache, uint32_t createInfoCount, VkComputePipelineCreateInfo const * pCreateInfos, VkAllocationCallbacks const * pAllocator, VkPipeline * pPipelines)} */
    @NativeType("VkResult")
    public static int vkCreateComputePipelines(VkDevice device, @NativeType("VkPipelineCache") long pipelineCache, @NativeType("VkComputePipelineCreateInfo const *") VkComputePipelineCreateInfo.Buffer pCreateInfos, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkPipeline *") LongBuffer pPipelines) {
        if (CHECKS) {
            check(pPipelines, pCreateInfos.remaining());
        }
        return nvkCreateComputePipelines(device, pipelineCache, pCreateInfos.remaining(), pCreateInfos.address(), memAddressSafe(pAllocator), memAddress(pPipelines));
    }

    // --- [ vkDestroyPipeline ] ---

    /** {@code void vkDestroyPipeline(VkDevice device, VkPipeline pipeline, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroyPipeline(VkDevice device, long pipeline, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyPipeline;
        callPJPV(device.address(), pipeline, pAllocator, __functionAddress);
    }

    /** {@code void vkDestroyPipeline(VkDevice device, VkPipeline pipeline, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroyPipeline(VkDevice device, @NativeType("VkPipeline") long pipeline, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyPipeline(device, pipeline, memAddressSafe(pAllocator));
    }

    // --- [ vkCreatePipelineLayout ] ---

    /** {@code VkResult vkCreatePipelineLayout(VkDevice device, VkPipelineLayoutCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkPipelineLayout * pPipelineLayout)} */
    public static int nvkCreatePipelineLayout(VkDevice device, long pCreateInfo, long pAllocator, long pPipelineLayout) {
        long __functionAddress = device.getCapabilities().vkCreatePipelineLayout;
        if (CHECKS) {
            VkPipelineLayoutCreateInfo.validate(pCreateInfo);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pPipelineLayout, __functionAddress);
    }

    /** {@code VkResult vkCreatePipelineLayout(VkDevice device, VkPipelineLayoutCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkPipelineLayout * pPipelineLayout)} */
    @NativeType("VkResult")
    public static int vkCreatePipelineLayout(VkDevice device, @NativeType("VkPipelineLayoutCreateInfo const *") VkPipelineLayoutCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkPipelineLayout *") LongBuffer pPipelineLayout) {
        if (CHECKS) {
            check(pPipelineLayout, 1);
        }
        return nvkCreatePipelineLayout(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pPipelineLayout));
    }

    // --- [ vkDestroyPipelineLayout ] ---

    /** {@code void vkDestroyPipelineLayout(VkDevice device, VkPipelineLayout pipelineLayout, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroyPipelineLayout(VkDevice device, long pipelineLayout, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyPipelineLayout;
        callPJPV(device.address(), pipelineLayout, pAllocator, __functionAddress);
    }

    /** {@code void vkDestroyPipelineLayout(VkDevice device, VkPipelineLayout pipelineLayout, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroyPipelineLayout(VkDevice device, @NativeType("VkPipelineLayout") long pipelineLayout, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyPipelineLayout(device, pipelineLayout, memAddressSafe(pAllocator));
    }

    // --- [ vkCreateSampler ] ---

    /** {@code VkResult vkCreateSampler(VkDevice device, VkSamplerCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkSampler * pSampler)} */
    public static int nvkCreateSampler(VkDevice device, long pCreateInfo, long pAllocator, long pSampler) {
        long __functionAddress = device.getCapabilities().vkCreateSampler;
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pSampler, __functionAddress);
    }

    /** {@code VkResult vkCreateSampler(VkDevice device, VkSamplerCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkSampler * pSampler)} */
    @NativeType("VkResult")
    public static int vkCreateSampler(VkDevice device, @NativeType("VkSamplerCreateInfo const *") VkSamplerCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkSampler *") LongBuffer pSampler) {
        if (CHECKS) {
            check(pSampler, 1);
        }
        return nvkCreateSampler(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pSampler));
    }

    // --- [ vkDestroySampler ] ---

    /** {@code void vkDestroySampler(VkDevice device, VkSampler sampler, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroySampler(VkDevice device, long sampler, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroySampler;
        callPJPV(device.address(), sampler, pAllocator, __functionAddress);
    }

    /** {@code void vkDestroySampler(VkDevice device, VkSampler sampler, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroySampler(VkDevice device, @NativeType("VkSampler") long sampler, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroySampler(device, sampler, memAddressSafe(pAllocator));
    }

    // --- [ vkCreateDescriptorSetLayout ] ---

    /** {@code VkResult vkCreateDescriptorSetLayout(VkDevice device, VkDescriptorSetLayoutCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkDescriptorSetLayout * pSetLayout)} */
    public static int nvkCreateDescriptorSetLayout(VkDevice device, long pCreateInfo, long pAllocator, long pSetLayout) {
        long __functionAddress = device.getCapabilities().vkCreateDescriptorSetLayout;
        if (CHECKS) {
            VkDescriptorSetLayoutCreateInfo.validate(pCreateInfo);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pSetLayout, __functionAddress);
    }

    /** {@code VkResult vkCreateDescriptorSetLayout(VkDevice device, VkDescriptorSetLayoutCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkDescriptorSetLayout * pSetLayout)} */
    @NativeType("VkResult")
    public static int vkCreateDescriptorSetLayout(VkDevice device, @NativeType("VkDescriptorSetLayoutCreateInfo const *") VkDescriptorSetLayoutCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkDescriptorSetLayout *") LongBuffer pSetLayout) {
        if (CHECKS) {
            check(pSetLayout, 1);
        }
        return nvkCreateDescriptorSetLayout(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pSetLayout));
    }

    // --- [ vkDestroyDescriptorSetLayout ] ---

    /** {@code void vkDestroyDescriptorSetLayout(VkDevice device, VkDescriptorSetLayout descriptorSetLayout, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroyDescriptorSetLayout(VkDevice device, long descriptorSetLayout, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyDescriptorSetLayout;
        callPJPV(device.address(), descriptorSetLayout, pAllocator, __functionAddress);
    }

    /** {@code void vkDestroyDescriptorSetLayout(VkDevice device, VkDescriptorSetLayout descriptorSetLayout, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroyDescriptorSetLayout(VkDevice device, @NativeType("VkDescriptorSetLayout") long descriptorSetLayout, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyDescriptorSetLayout(device, descriptorSetLayout, memAddressSafe(pAllocator));
    }

    // --- [ vkCreateDescriptorPool ] ---

    /** {@code VkResult vkCreateDescriptorPool(VkDevice device, VkDescriptorPoolCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkDescriptorPool * pDescriptorPool)} */
    public static int nvkCreateDescriptorPool(VkDevice device, long pCreateInfo, long pAllocator, long pDescriptorPool) {
        long __functionAddress = device.getCapabilities().vkCreateDescriptorPool;
        if (CHECKS) {
            VkDescriptorPoolCreateInfo.validate(pCreateInfo);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pDescriptorPool, __functionAddress);
    }

    /** {@code VkResult vkCreateDescriptorPool(VkDevice device, VkDescriptorPoolCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkDescriptorPool * pDescriptorPool)} */
    @NativeType("VkResult")
    public static int vkCreateDescriptorPool(VkDevice device, @NativeType("VkDescriptorPoolCreateInfo const *") VkDescriptorPoolCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkDescriptorPool *") LongBuffer pDescriptorPool) {
        if (CHECKS) {
            check(pDescriptorPool, 1);
        }
        return nvkCreateDescriptorPool(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pDescriptorPool));
    }

    // --- [ vkDestroyDescriptorPool ] ---

    /** {@code void vkDestroyDescriptorPool(VkDevice device, VkDescriptorPool descriptorPool, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroyDescriptorPool(VkDevice device, long descriptorPool, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyDescriptorPool;
        callPJPV(device.address(), descriptorPool, pAllocator, __functionAddress);
    }

    /** {@code void vkDestroyDescriptorPool(VkDevice device, VkDescriptorPool descriptorPool, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroyDescriptorPool(VkDevice device, @NativeType("VkDescriptorPool") long descriptorPool, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyDescriptorPool(device, descriptorPool, memAddressSafe(pAllocator));
    }

    // --- [ vkResetDescriptorPool ] ---

    /** {@code VkResult vkResetDescriptorPool(VkDevice device, VkDescriptorPool descriptorPool, VkDescriptorPoolResetFlags flags)} */
    @NativeType("VkResult")
    public static int vkResetDescriptorPool(VkDevice device, @NativeType("VkDescriptorPool") long descriptorPool, @NativeType("VkDescriptorPoolResetFlags") int flags) {
        long __functionAddress = device.getCapabilities().vkResetDescriptorPool;
        return callPJI(device.address(), descriptorPool, flags, __functionAddress);
    }

    // --- [ vkAllocateDescriptorSets ] ---

    /** {@code VkResult vkAllocateDescriptorSets(VkDevice device, VkDescriptorSetAllocateInfo const * pAllocateInfo, VkDescriptorSet * pDescriptorSets)} */
    public static int nvkAllocateDescriptorSets(VkDevice device, long pAllocateInfo, long pDescriptorSets) {
        long __functionAddress = device.getCapabilities().vkAllocateDescriptorSets;
        if (CHECKS) {
            VkDescriptorSetAllocateInfo.validate(pAllocateInfo);
        }
        return callPPPI(device.address(), pAllocateInfo, pDescriptorSets, __functionAddress);
    }

    /** {@code VkResult vkAllocateDescriptorSets(VkDevice device, VkDescriptorSetAllocateInfo const * pAllocateInfo, VkDescriptorSet * pDescriptorSets)} */
    @NativeType("VkResult")
    public static int vkAllocateDescriptorSets(VkDevice device, @NativeType("VkDescriptorSetAllocateInfo const *") VkDescriptorSetAllocateInfo pAllocateInfo, @NativeType("VkDescriptorSet *") LongBuffer pDescriptorSets) {
        if (CHECKS) {
            check(pDescriptorSets, pAllocateInfo.descriptorSetCount());
        }
        return nvkAllocateDescriptorSets(device, pAllocateInfo.address(), memAddress(pDescriptorSets));
    }

    // --- [ vkFreeDescriptorSets ] ---

    /** {@code VkResult vkFreeDescriptorSets(VkDevice device, VkDescriptorPool descriptorPool, uint32_t descriptorSetCount, VkDescriptorSet const * pDescriptorSets)} */
    public static int nvkFreeDescriptorSets(VkDevice device, long descriptorPool, int descriptorSetCount, long pDescriptorSets) {
        long __functionAddress = device.getCapabilities().vkFreeDescriptorSets;
        return callPJPI(device.address(), descriptorPool, descriptorSetCount, pDescriptorSets, __functionAddress);
    }

    /** {@code VkResult vkFreeDescriptorSets(VkDevice device, VkDescriptorPool descriptorPool, uint32_t descriptorSetCount, VkDescriptorSet const * pDescriptorSets)} */
    @NativeType("VkResult")
    public static int vkFreeDescriptorSets(VkDevice device, @NativeType("VkDescriptorPool") long descriptorPool, @NativeType("VkDescriptorSet const *") @Nullable LongBuffer pDescriptorSets) {
        return nvkFreeDescriptorSets(device, descriptorPool, remainingSafe(pDescriptorSets), memAddressSafe(pDescriptorSets));
    }

    /** {@code VkResult vkFreeDescriptorSets(VkDevice device, VkDescriptorPool descriptorPool, uint32_t descriptorSetCount, VkDescriptorSet const * pDescriptorSets)} */
    @NativeType("VkResult")
    public static int vkFreeDescriptorSets(VkDevice device, @NativeType("VkDescriptorPool") long descriptorPool, @NativeType("VkDescriptorSet const *") long pDescriptorSet) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer pDescriptorSets = stack.longs(pDescriptorSet);
            return nvkFreeDescriptorSets(device, descriptorPool, 1, memAddress(pDescriptorSets));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ vkUpdateDescriptorSets ] ---

    /** {@code void vkUpdateDescriptorSets(VkDevice device, uint32_t descriptorWriteCount, VkWriteDescriptorSet const * pDescriptorWrites, uint32_t descriptorCopyCount, VkCopyDescriptorSet const * pDescriptorCopies)} */
    public static void nvkUpdateDescriptorSets(VkDevice device, int descriptorWriteCount, long pDescriptorWrites, int descriptorCopyCount, long pDescriptorCopies) {
        long __functionAddress = device.getCapabilities().vkUpdateDescriptorSets;
        callPPPV(device.address(), descriptorWriteCount, pDescriptorWrites, descriptorCopyCount, pDescriptorCopies, __functionAddress);
    }

    /** {@code void vkUpdateDescriptorSets(VkDevice device, uint32_t descriptorWriteCount, VkWriteDescriptorSet const * pDescriptorWrites, uint32_t descriptorCopyCount, VkCopyDescriptorSet const * pDescriptorCopies)} */
    public static void vkUpdateDescriptorSets(VkDevice device, @NativeType("VkWriteDescriptorSet const *") VkWriteDescriptorSet.@Nullable Buffer pDescriptorWrites, @NativeType("VkCopyDescriptorSet const *") VkCopyDescriptorSet.@Nullable Buffer pDescriptorCopies) {
        nvkUpdateDescriptorSets(device, remainingSafe(pDescriptorWrites), memAddressSafe(pDescriptorWrites), remainingSafe(pDescriptorCopies), memAddressSafe(pDescriptorCopies));
    }

    // --- [ vkCmdBindPipeline ] ---

    /** {@code void vkCmdBindPipeline(VkCommandBuffer commandBuffer, VkPipelineBindPoint pipelineBindPoint, VkPipeline pipeline)} */
    public static void vkCmdBindPipeline(VkCommandBuffer commandBuffer, @NativeType("VkPipelineBindPoint") int pipelineBindPoint, @NativeType("VkPipeline") long pipeline) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindPipeline;
        callPJV(commandBuffer.address(), pipelineBindPoint, pipeline, __functionAddress);
    }

    // --- [ vkCmdBindDescriptorSets ] ---

    /** {@code void vkCmdBindDescriptorSets(VkCommandBuffer commandBuffer, VkPipelineBindPoint pipelineBindPoint, VkPipelineLayout layout, uint32_t firstSet, uint32_t descriptorSetCount, VkDescriptorSet const * pDescriptorSets, uint32_t dynamicOffsetCount, uint32_t const * pDynamicOffsets)} */
    public static void nvkCmdBindDescriptorSets(VkCommandBuffer commandBuffer, int pipelineBindPoint, long layout, int firstSet, int descriptorSetCount, long pDescriptorSets, int dynamicOffsetCount, long pDynamicOffsets) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindDescriptorSets;
        callPJPPV(commandBuffer.address(), pipelineBindPoint, layout, firstSet, descriptorSetCount, pDescriptorSets, dynamicOffsetCount, pDynamicOffsets, __functionAddress);
    }

    /** {@code void vkCmdBindDescriptorSets(VkCommandBuffer commandBuffer, VkPipelineBindPoint pipelineBindPoint, VkPipelineLayout layout, uint32_t firstSet, uint32_t descriptorSetCount, VkDescriptorSet const * pDescriptorSets, uint32_t dynamicOffsetCount, uint32_t const * pDynamicOffsets)} */
    public static void vkCmdBindDescriptorSets(VkCommandBuffer commandBuffer, @NativeType("VkPipelineBindPoint") int pipelineBindPoint, @NativeType("VkPipelineLayout") long layout, @NativeType("uint32_t") int firstSet, @NativeType("VkDescriptorSet const *") LongBuffer pDescriptorSets, @NativeType("uint32_t const *") @Nullable IntBuffer pDynamicOffsets) {
        nvkCmdBindDescriptorSets(commandBuffer, pipelineBindPoint, layout, firstSet, pDescriptorSets.remaining(), memAddress(pDescriptorSets), remainingSafe(pDynamicOffsets), memAddressSafe(pDynamicOffsets));
    }

    // --- [ vkCmdClearColorImage ] ---

    /** {@code void vkCmdClearColorImage(VkCommandBuffer commandBuffer, VkImage image, VkImageLayout imageLayout, VkClearColorValue const * pColor, uint32_t rangeCount, VkImageSubresourceRange const * pRanges)} */
    public static void nvkCmdClearColorImage(VkCommandBuffer commandBuffer, long image, int imageLayout, long pColor, int rangeCount, long pRanges) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdClearColorImage;
        callPJPPV(commandBuffer.address(), image, imageLayout, pColor, rangeCount, pRanges, __functionAddress);
    }

    /** {@code void vkCmdClearColorImage(VkCommandBuffer commandBuffer, VkImage image, VkImageLayout imageLayout, VkClearColorValue const * pColor, uint32_t rangeCount, VkImageSubresourceRange const * pRanges)} */
    public static void vkCmdClearColorImage(VkCommandBuffer commandBuffer, @NativeType("VkImage") long image, @NativeType("VkImageLayout") int imageLayout, @NativeType("VkClearColorValue const *") @Nullable VkClearColorValue pColor, @NativeType("VkImageSubresourceRange const *") VkImageSubresourceRange.Buffer pRanges) {
        nvkCmdClearColorImage(commandBuffer, image, imageLayout, memAddressSafe(pColor), pRanges.remaining(), pRanges.address());
    }

    /** {@code void vkCmdClearColorImage(VkCommandBuffer commandBuffer, VkImage image, VkImageLayout imageLayout, VkClearColorValue const * pColor, uint32_t rangeCount, VkImageSubresourceRange const * pRanges)} */
    public static void vkCmdClearColorImage(VkCommandBuffer commandBuffer, @NativeType("VkImage") long image, @NativeType("VkImageLayout") int imageLayout, @NativeType("VkClearColorValue const *") @Nullable VkClearColorValue pColor, @NativeType("VkImageSubresourceRange const *") VkImageSubresourceRange pRange) {
        nvkCmdClearColorImage(commandBuffer, image, imageLayout, memAddressSafe(pColor), 1, pRange.address());
    }

    // --- [ vkCmdDispatch ] ---

    /** {@code void vkCmdDispatch(VkCommandBuffer commandBuffer, uint32_t groupCountX, uint32_t groupCountY, uint32_t groupCountZ)} */
    public static void vkCmdDispatch(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int groupCountX, @NativeType("uint32_t") int groupCountY, @NativeType("uint32_t") int groupCountZ) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDispatch;
        callPV(commandBuffer.address(), groupCountX, groupCountY, groupCountZ, __functionAddress);
    }

    // --- [ vkCmdDispatchIndirect ] ---

    /** {@code void vkCmdDispatchIndirect(VkCommandBuffer commandBuffer, VkBuffer buffer, VkDeviceSize offset)} */
    public static void vkCmdDispatchIndirect(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long buffer, @NativeType("VkDeviceSize") long offset) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDispatchIndirect;
        callPJJV(commandBuffer.address(), buffer, offset, __functionAddress);
    }

    // --- [ vkCmdSetEvent ] ---

    /** {@code void vkCmdSetEvent(VkCommandBuffer commandBuffer, VkEvent event, VkPipelineStageFlags stageMask)} */
    public static void vkCmdSetEvent(VkCommandBuffer commandBuffer, @NativeType("VkEvent") long event, @NativeType("VkPipelineStageFlags") int stageMask) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetEvent;
        callPJV(commandBuffer.address(), event, stageMask, __functionAddress);
    }

    // --- [ vkCmdResetEvent ] ---

    /** {@code void vkCmdResetEvent(VkCommandBuffer commandBuffer, VkEvent event, VkPipelineStageFlags stageMask)} */
    public static void vkCmdResetEvent(VkCommandBuffer commandBuffer, @NativeType("VkEvent") long event, @NativeType("VkPipelineStageFlags") int stageMask) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdResetEvent;
        callPJV(commandBuffer.address(), event, stageMask, __functionAddress);
    }

    // --- [ vkCmdWaitEvents ] ---

    /** {@code void vkCmdWaitEvents(VkCommandBuffer commandBuffer, uint32_t eventCount, VkEvent const * pEvents, VkPipelineStageFlags srcStageMask, VkPipelineStageFlags dstStageMask, uint32_t memoryBarrierCount, VkMemoryBarrier const * pMemoryBarriers, uint32_t bufferMemoryBarrierCount, VkBufferMemoryBarrier const * pBufferMemoryBarriers, uint32_t imageMemoryBarrierCount, VkImageMemoryBarrier const * pImageMemoryBarriers)} */
    public static void nvkCmdWaitEvents(VkCommandBuffer commandBuffer, int eventCount, long pEvents, int srcStageMask, int dstStageMask, int memoryBarrierCount, long pMemoryBarriers, int bufferMemoryBarrierCount, long pBufferMemoryBarriers, int imageMemoryBarrierCount, long pImageMemoryBarriers) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdWaitEvents;
        callPPPPPV(commandBuffer.address(), eventCount, pEvents, srcStageMask, dstStageMask, memoryBarrierCount, pMemoryBarriers, bufferMemoryBarrierCount, pBufferMemoryBarriers, imageMemoryBarrierCount, pImageMemoryBarriers, __functionAddress);
    }

    /** {@code void vkCmdWaitEvents(VkCommandBuffer commandBuffer, uint32_t eventCount, VkEvent const * pEvents, VkPipelineStageFlags srcStageMask, VkPipelineStageFlags dstStageMask, uint32_t memoryBarrierCount, VkMemoryBarrier const * pMemoryBarriers, uint32_t bufferMemoryBarrierCount, VkBufferMemoryBarrier const * pBufferMemoryBarriers, uint32_t imageMemoryBarrierCount, VkImageMemoryBarrier const * pImageMemoryBarriers)} */
    public static void vkCmdWaitEvents(VkCommandBuffer commandBuffer, @NativeType("VkEvent const *") LongBuffer pEvents, @NativeType("VkPipelineStageFlags") int srcStageMask, @NativeType("VkPipelineStageFlags") int dstStageMask, @NativeType("VkMemoryBarrier const *") VkMemoryBarrier.@Nullable Buffer pMemoryBarriers, @NativeType("VkBufferMemoryBarrier const *") VkBufferMemoryBarrier.@Nullable Buffer pBufferMemoryBarriers, @NativeType("VkImageMemoryBarrier const *") VkImageMemoryBarrier.@Nullable Buffer pImageMemoryBarriers) {
        nvkCmdWaitEvents(commandBuffer, pEvents.remaining(), memAddress(pEvents), srcStageMask, dstStageMask, remainingSafe(pMemoryBarriers), memAddressSafe(pMemoryBarriers), remainingSafe(pBufferMemoryBarriers), memAddressSafe(pBufferMemoryBarriers), remainingSafe(pImageMemoryBarriers), memAddressSafe(pImageMemoryBarriers));
    }

    // --- [ vkCmdPushConstants ] ---

    /** {@code void vkCmdPushConstants(VkCommandBuffer commandBuffer, VkPipelineLayout layout, VkShaderStageFlags stageFlags, uint32_t offset, uint32_t size, void const * pValues)} */
    public static void nvkCmdPushConstants(VkCommandBuffer commandBuffer, long layout, int stageFlags, int offset, int size, long pValues) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPushConstants;
        callPJPV(commandBuffer.address(), layout, stageFlags, offset, size, pValues, __functionAddress);
    }

    /** {@code void vkCmdPushConstants(VkCommandBuffer commandBuffer, VkPipelineLayout layout, VkShaderStageFlags stageFlags, uint32_t offset, uint32_t size, void const * pValues)} */
    public static void vkCmdPushConstants(VkCommandBuffer commandBuffer, @NativeType("VkPipelineLayout") long layout, @NativeType("VkShaderStageFlags") int stageFlags, @NativeType("uint32_t") int offset, @NativeType("void const *") ByteBuffer pValues) {
        nvkCmdPushConstants(commandBuffer, layout, stageFlags, offset, pValues.remaining(), memAddress(pValues));
    }

    /** {@code void vkCmdPushConstants(VkCommandBuffer commandBuffer, VkPipelineLayout layout, VkShaderStageFlags stageFlags, uint32_t offset, uint32_t size, void const * pValues)} */
    public static void vkCmdPushConstants(VkCommandBuffer commandBuffer, @NativeType("VkPipelineLayout") long layout, @NativeType("VkShaderStageFlags") int stageFlags, @NativeType("uint32_t") int offset, @NativeType("void const *") ShortBuffer pValues) {
        nvkCmdPushConstants(commandBuffer, layout, stageFlags, offset, pValues.remaining() << 1, memAddress(pValues));
    }

    /** {@code void vkCmdPushConstants(VkCommandBuffer commandBuffer, VkPipelineLayout layout, VkShaderStageFlags stageFlags, uint32_t offset, uint32_t size, void const * pValues)} */
    public static void vkCmdPushConstants(VkCommandBuffer commandBuffer, @NativeType("VkPipelineLayout") long layout, @NativeType("VkShaderStageFlags") int stageFlags, @NativeType("uint32_t") int offset, @NativeType("void const *") IntBuffer pValues) {
        nvkCmdPushConstants(commandBuffer, layout, stageFlags, offset, pValues.remaining() << 2, memAddress(pValues));
    }

    /** {@code void vkCmdPushConstants(VkCommandBuffer commandBuffer, VkPipelineLayout layout, VkShaderStageFlags stageFlags, uint32_t offset, uint32_t size, void const * pValues)} */
    public static void vkCmdPushConstants(VkCommandBuffer commandBuffer, @NativeType("VkPipelineLayout") long layout, @NativeType("VkShaderStageFlags") int stageFlags, @NativeType("uint32_t") int offset, @NativeType("void const *") LongBuffer pValues) {
        nvkCmdPushConstants(commandBuffer, layout, stageFlags, offset, pValues.remaining() << 3, memAddress(pValues));
    }

    /** {@code void vkCmdPushConstants(VkCommandBuffer commandBuffer, VkPipelineLayout layout, VkShaderStageFlags stageFlags, uint32_t offset, uint32_t size, void const * pValues)} */
    public static void vkCmdPushConstants(VkCommandBuffer commandBuffer, @NativeType("VkPipelineLayout") long layout, @NativeType("VkShaderStageFlags") int stageFlags, @NativeType("uint32_t") int offset, @NativeType("void const *") FloatBuffer pValues) {
        nvkCmdPushConstants(commandBuffer, layout, stageFlags, offset, pValues.remaining() << 2, memAddress(pValues));
    }

    /** {@code void vkCmdPushConstants(VkCommandBuffer commandBuffer, VkPipelineLayout layout, VkShaderStageFlags stageFlags, uint32_t offset, uint32_t size, void const * pValues)} */
    public static void vkCmdPushConstants(VkCommandBuffer commandBuffer, @NativeType("VkPipelineLayout") long layout, @NativeType("VkShaderStageFlags") int stageFlags, @NativeType("uint32_t") int offset, @NativeType("void const *") DoubleBuffer pValues) {
        nvkCmdPushConstants(commandBuffer, layout, stageFlags, offset, pValues.remaining() << 3, memAddress(pValues));
    }

    // --- [ vkCreateGraphicsPipelines ] ---

    /** {@code VkResult vkCreateGraphicsPipelines(VkDevice device, VkPipelineCache pipelineCache, uint32_t createInfoCount, VkGraphicsPipelineCreateInfo const * pCreateInfos, VkAllocationCallbacks const * pAllocator, VkPipeline * pPipelines)} */
    public static int nvkCreateGraphicsPipelines(VkDevice device, long pipelineCache, int createInfoCount, long pCreateInfos, long pAllocator, long pPipelines) {
        long __functionAddress = device.getCapabilities().vkCreateGraphicsPipelines;
        if (CHECKS) {
            Struct.validate(pCreateInfos, createInfoCount, VkGraphicsPipelineCreateInfo.SIZEOF, VkGraphicsPipelineCreateInfo::validate);
        }
        return callPJPPPI(device.address(), pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines, __functionAddress);
    }

    /** {@code VkResult vkCreateGraphicsPipelines(VkDevice device, VkPipelineCache pipelineCache, uint32_t createInfoCount, VkGraphicsPipelineCreateInfo const * pCreateInfos, VkAllocationCallbacks const * pAllocator, VkPipeline * pPipelines)} */
    @NativeType("VkResult")
    public static int vkCreateGraphicsPipelines(VkDevice device, @NativeType("VkPipelineCache") long pipelineCache, @NativeType("VkGraphicsPipelineCreateInfo const *") VkGraphicsPipelineCreateInfo.Buffer pCreateInfos, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkPipeline *") LongBuffer pPipelines) {
        if (CHECKS) {
            check(pPipelines, pCreateInfos.remaining());
        }
        return nvkCreateGraphicsPipelines(device, pipelineCache, pCreateInfos.remaining(), pCreateInfos.address(), memAddressSafe(pAllocator), memAddress(pPipelines));
    }

    // --- [ vkCreateFramebuffer ] ---

    /** {@code VkResult vkCreateFramebuffer(VkDevice device, VkFramebufferCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkFramebuffer * pFramebuffer)} */
    public static int nvkCreateFramebuffer(VkDevice device, long pCreateInfo, long pAllocator, long pFramebuffer) {
        long __functionAddress = device.getCapabilities().vkCreateFramebuffer;
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pFramebuffer, __functionAddress);
    }

    /** {@code VkResult vkCreateFramebuffer(VkDevice device, VkFramebufferCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkFramebuffer * pFramebuffer)} */
    @NativeType("VkResult")
    public static int vkCreateFramebuffer(VkDevice device, @NativeType("VkFramebufferCreateInfo const *") VkFramebufferCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkFramebuffer *") LongBuffer pFramebuffer) {
        if (CHECKS) {
            check(pFramebuffer, 1);
        }
        return nvkCreateFramebuffer(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pFramebuffer));
    }

    // --- [ vkDestroyFramebuffer ] ---

    /** {@code void vkDestroyFramebuffer(VkDevice device, VkFramebuffer framebuffer, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroyFramebuffer(VkDevice device, long framebuffer, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyFramebuffer;
        callPJPV(device.address(), framebuffer, pAllocator, __functionAddress);
    }

    /** {@code void vkDestroyFramebuffer(VkDevice device, VkFramebuffer framebuffer, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroyFramebuffer(VkDevice device, @NativeType("VkFramebuffer") long framebuffer, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyFramebuffer(device, framebuffer, memAddressSafe(pAllocator));
    }

    // --- [ vkCreateRenderPass ] ---

    /** {@code VkResult vkCreateRenderPass(VkDevice device, VkRenderPassCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkRenderPass * pRenderPass)} */
    public static int nvkCreateRenderPass(VkDevice device, long pCreateInfo, long pAllocator, long pRenderPass) {
        long __functionAddress = device.getCapabilities().vkCreateRenderPass;
        if (CHECKS) {
            VkRenderPassCreateInfo.validate(pCreateInfo);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pRenderPass, __functionAddress);
    }

    /** {@code VkResult vkCreateRenderPass(VkDevice device, VkRenderPassCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkRenderPass * pRenderPass)} */
    @NativeType("VkResult")
    public static int vkCreateRenderPass(VkDevice device, @NativeType("VkRenderPassCreateInfo const *") VkRenderPassCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkRenderPass *") LongBuffer pRenderPass) {
        if (CHECKS) {
            check(pRenderPass, 1);
        }
        return nvkCreateRenderPass(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pRenderPass));
    }

    // --- [ vkDestroyRenderPass ] ---

    /** {@code void vkDestroyRenderPass(VkDevice device, VkRenderPass renderPass, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroyRenderPass(VkDevice device, long renderPass, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyRenderPass;
        callPJPV(device.address(), renderPass, pAllocator, __functionAddress);
    }

    /** {@code void vkDestroyRenderPass(VkDevice device, VkRenderPass renderPass, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroyRenderPass(VkDevice device, @NativeType("VkRenderPass") long renderPass, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyRenderPass(device, renderPass, memAddressSafe(pAllocator));
    }

    // --- [ vkGetRenderAreaGranularity ] ---

    /** {@code void vkGetRenderAreaGranularity(VkDevice device, VkRenderPass renderPass, VkExtent2D * pGranularity)} */
    public static void nvkGetRenderAreaGranularity(VkDevice device, long renderPass, long pGranularity) {
        long __functionAddress = device.getCapabilities().vkGetRenderAreaGranularity;
        callPJPV(device.address(), renderPass, pGranularity, __functionAddress);
    }

    /** {@code void vkGetRenderAreaGranularity(VkDevice device, VkRenderPass renderPass, VkExtent2D * pGranularity)} */
    public static void vkGetRenderAreaGranularity(VkDevice device, @NativeType("VkRenderPass") long renderPass, @NativeType("VkExtent2D *") VkExtent2D pGranularity) {
        nvkGetRenderAreaGranularity(device, renderPass, pGranularity.address());
    }

    // --- [ vkCmdSetViewport ] ---

    /** {@code void vkCmdSetViewport(VkCommandBuffer commandBuffer, uint32_t firstViewport, uint32_t viewportCount, VkViewport const * pViewports)} */
    public static void nvkCmdSetViewport(VkCommandBuffer commandBuffer, int firstViewport, int viewportCount, long pViewports) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetViewport;
        callPPV(commandBuffer.address(), firstViewport, viewportCount, pViewports, __functionAddress);
    }

    /** {@code void vkCmdSetViewport(VkCommandBuffer commandBuffer, uint32_t firstViewport, uint32_t viewportCount, VkViewport const * pViewports)} */
    public static void vkCmdSetViewport(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstViewport, @NativeType("VkViewport const *") VkViewport.Buffer pViewports) {
        nvkCmdSetViewport(commandBuffer, firstViewport, pViewports.remaining(), pViewports.address());
    }

    // --- [ vkCmdSetScissor ] ---

    /** {@code void vkCmdSetScissor(VkCommandBuffer commandBuffer, uint32_t firstScissor, uint32_t scissorCount, VkRect2D const * pScissors)} */
    public static void nvkCmdSetScissor(VkCommandBuffer commandBuffer, int firstScissor, int scissorCount, long pScissors) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetScissor;
        callPPV(commandBuffer.address(), firstScissor, scissorCount, pScissors, __functionAddress);
    }

    /** {@code void vkCmdSetScissor(VkCommandBuffer commandBuffer, uint32_t firstScissor, uint32_t scissorCount, VkRect2D const * pScissors)} */
    public static void vkCmdSetScissor(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstScissor, @NativeType("VkRect2D const *") VkRect2D.Buffer pScissors) {
        nvkCmdSetScissor(commandBuffer, firstScissor, pScissors.remaining(), pScissors.address());
    }

    // --- [ vkCmdSetLineWidth ] ---

    /** {@code void vkCmdSetLineWidth(VkCommandBuffer commandBuffer, float lineWidth)} */
    public static void vkCmdSetLineWidth(VkCommandBuffer commandBuffer, float lineWidth) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetLineWidth;
        callPV(commandBuffer.address(), lineWidth, __functionAddress);
    }

    // --- [ vkCmdSetDepthBias ] ---

    /** {@code void vkCmdSetDepthBias(VkCommandBuffer commandBuffer, float depthBiasConstantFactor, float depthBiasClamp, float depthBiasSlopeFactor)} */
    public static void vkCmdSetDepthBias(VkCommandBuffer commandBuffer, float depthBiasConstantFactor, float depthBiasClamp, float depthBiasSlopeFactor) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthBias;
        callPV(commandBuffer.address(), depthBiasConstantFactor, depthBiasClamp, depthBiasSlopeFactor, __functionAddress);
    }

    // --- [ vkCmdSetBlendConstants ] ---

    /** {@code void vkCmdSetBlendConstants(VkCommandBuffer commandBuffer, float const * blendConstants)} */
    public static void nvkCmdSetBlendConstants(VkCommandBuffer commandBuffer, long blendConstants) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetBlendConstants;
        callPPV(commandBuffer.address(), blendConstants, __functionAddress);
    }

    /** {@code void vkCmdSetBlendConstants(VkCommandBuffer commandBuffer, float const * blendConstants)} */
    public static void vkCmdSetBlendConstants(VkCommandBuffer commandBuffer, @NativeType("float const *") FloatBuffer blendConstants) {
        if (CHECKS) {
            check(blendConstants, 4);
        }
        nvkCmdSetBlendConstants(commandBuffer, memAddress(blendConstants));
    }

    // --- [ vkCmdSetDepthBounds ] ---

    /** {@code void vkCmdSetDepthBounds(VkCommandBuffer commandBuffer, float minDepthBounds, float maxDepthBounds)} */
    public static void vkCmdSetDepthBounds(VkCommandBuffer commandBuffer, float minDepthBounds, float maxDepthBounds) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthBounds;
        callPV(commandBuffer.address(), minDepthBounds, maxDepthBounds, __functionAddress);
    }

    // --- [ vkCmdSetStencilCompareMask ] ---

    /** {@code void vkCmdSetStencilCompareMask(VkCommandBuffer commandBuffer, VkStencilFaceFlags faceMask, uint32_t compareMask)} */
    public static void vkCmdSetStencilCompareMask(VkCommandBuffer commandBuffer, @NativeType("VkStencilFaceFlags") int faceMask, @NativeType("uint32_t") int compareMask) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetStencilCompareMask;
        callPV(commandBuffer.address(), faceMask, compareMask, __functionAddress);
    }

    // --- [ vkCmdSetStencilWriteMask ] ---

    /** {@code void vkCmdSetStencilWriteMask(VkCommandBuffer commandBuffer, VkStencilFaceFlags faceMask, uint32_t writeMask)} */
    public static void vkCmdSetStencilWriteMask(VkCommandBuffer commandBuffer, @NativeType("VkStencilFaceFlags") int faceMask, @NativeType("uint32_t") int writeMask) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetStencilWriteMask;
        callPV(commandBuffer.address(), faceMask, writeMask, __functionAddress);
    }

    // --- [ vkCmdSetStencilReference ] ---

    /** {@code void vkCmdSetStencilReference(VkCommandBuffer commandBuffer, VkStencilFaceFlags faceMask, uint32_t reference)} */
    public static void vkCmdSetStencilReference(VkCommandBuffer commandBuffer, @NativeType("VkStencilFaceFlags") int faceMask, @NativeType("uint32_t") int reference) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetStencilReference;
        callPV(commandBuffer.address(), faceMask, reference, __functionAddress);
    }

    // --- [ vkCmdBindIndexBuffer ] ---

    /** {@code void vkCmdBindIndexBuffer(VkCommandBuffer commandBuffer, VkBuffer buffer, VkDeviceSize offset, VkIndexType indexType)} */
    public static void vkCmdBindIndexBuffer(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long buffer, @NativeType("VkDeviceSize") long offset, @NativeType("VkIndexType") int indexType) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindIndexBuffer;
        callPJJV(commandBuffer.address(), buffer, offset, indexType, __functionAddress);
    }

    // --- [ vkCmdBindVertexBuffers ] ---

    /** {@code void vkCmdBindVertexBuffers(VkCommandBuffer commandBuffer, uint32_t firstBinding, uint32_t bindingCount, VkBuffer const * pBuffers, VkDeviceSize const * pOffsets)} */
    public static void nvkCmdBindVertexBuffers(VkCommandBuffer commandBuffer, int firstBinding, int bindingCount, long pBuffers, long pOffsets) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindVertexBuffers;
        callPPPV(commandBuffer.address(), firstBinding, bindingCount, pBuffers, pOffsets, __functionAddress);
    }

    /** {@code void vkCmdBindVertexBuffers(VkCommandBuffer commandBuffer, uint32_t firstBinding, uint32_t bindingCount, VkBuffer const * pBuffers, VkDeviceSize const * pOffsets)} */
    public static void vkCmdBindVertexBuffers(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstBinding, @NativeType("VkBuffer const *") LongBuffer pBuffers, @NativeType("VkDeviceSize const *") LongBuffer pOffsets) {
        if (CHECKS) {
            check(pOffsets, pBuffers.remaining());
        }
        nvkCmdBindVertexBuffers(commandBuffer, firstBinding, pBuffers.remaining(), memAddress(pBuffers), memAddress(pOffsets));
    }

    // --- [ vkCmdDraw ] ---

    /** {@code void vkCmdDraw(VkCommandBuffer commandBuffer, uint32_t vertexCount, uint32_t instanceCount, uint32_t firstVertex, uint32_t firstInstance)} */
    public static void vkCmdDraw(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int vertexCount, @NativeType("uint32_t") int instanceCount, @NativeType("uint32_t") int firstVertex, @NativeType("uint32_t") int firstInstance) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDraw;
        callPV(commandBuffer.address(), vertexCount, instanceCount, firstVertex, firstInstance, __functionAddress);
    }

    // --- [ vkCmdDrawIndexed ] ---

    /** {@code void vkCmdDrawIndexed(VkCommandBuffer commandBuffer, uint32_t indexCount, uint32_t instanceCount, uint32_t firstIndex, int32_t vertexOffset, uint32_t firstInstance)} */
    public static void vkCmdDrawIndexed(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int indexCount, @NativeType("uint32_t") int instanceCount, @NativeType("uint32_t") int firstIndex, @NativeType("int32_t") int vertexOffset, @NativeType("uint32_t") int firstInstance) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDrawIndexed;
        callPV(commandBuffer.address(), indexCount, instanceCount, firstIndex, vertexOffset, firstInstance, __functionAddress);
    }

    // --- [ vkCmdDrawIndirect ] ---

    /** {@code void vkCmdDrawIndirect(VkCommandBuffer commandBuffer, VkBuffer buffer, VkDeviceSize offset, uint32_t drawCount, uint32_t stride)} */
    public static void vkCmdDrawIndirect(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long buffer, @NativeType("VkDeviceSize") long offset, @NativeType("uint32_t") int drawCount, @NativeType("uint32_t") int stride) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDrawIndirect;
        callPJJV(commandBuffer.address(), buffer, offset, drawCount, stride, __functionAddress);
    }

    // --- [ vkCmdDrawIndexedIndirect ] ---

    /** {@code void vkCmdDrawIndexedIndirect(VkCommandBuffer commandBuffer, VkBuffer buffer, VkDeviceSize offset, uint32_t drawCount, uint32_t stride)} */
    public static void vkCmdDrawIndexedIndirect(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long buffer, @NativeType("VkDeviceSize") long offset, @NativeType("uint32_t") int drawCount, @NativeType("uint32_t") int stride) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDrawIndexedIndirect;
        callPJJV(commandBuffer.address(), buffer, offset, drawCount, stride, __functionAddress);
    }

    // --- [ vkCmdBlitImage ] ---

    /** {@code void vkCmdBlitImage(VkCommandBuffer commandBuffer, VkImage srcImage, VkImageLayout srcImageLayout, VkImage dstImage, VkImageLayout dstImageLayout, uint32_t regionCount, VkImageBlit const * pRegions, VkFilter filter)} */
    public static void nvkCmdBlitImage(VkCommandBuffer commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, int regionCount, long pRegions, int filter) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBlitImage;
        callPJJPV(commandBuffer.address(), srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions, filter, __functionAddress);
    }

    /** {@code void vkCmdBlitImage(VkCommandBuffer commandBuffer, VkImage srcImage, VkImageLayout srcImageLayout, VkImage dstImage, VkImageLayout dstImageLayout, uint32_t regionCount, VkImageBlit const * pRegions, VkFilter filter)} */
    public static void vkCmdBlitImage(VkCommandBuffer commandBuffer, @NativeType("VkImage") long srcImage, @NativeType("VkImageLayout") int srcImageLayout, @NativeType("VkImage") long dstImage, @NativeType("VkImageLayout") int dstImageLayout, @NativeType("VkImageBlit const *") VkImageBlit.Buffer pRegions, @NativeType("VkFilter") int filter) {
        nvkCmdBlitImage(commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, pRegions.remaining(), pRegions.address(), filter);
    }

    // --- [ vkCmdClearDepthStencilImage ] ---

    /** {@code void vkCmdClearDepthStencilImage(VkCommandBuffer commandBuffer, VkImage image, VkImageLayout imageLayout, VkClearDepthStencilValue const * pDepthStencil, uint32_t rangeCount, VkImageSubresourceRange const * pRanges)} */
    public static void nvkCmdClearDepthStencilImage(VkCommandBuffer commandBuffer, long image, int imageLayout, long pDepthStencil, int rangeCount, long pRanges) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdClearDepthStencilImage;
        callPJPPV(commandBuffer.address(), image, imageLayout, pDepthStencil, rangeCount, pRanges, __functionAddress);
    }

    /** {@code void vkCmdClearDepthStencilImage(VkCommandBuffer commandBuffer, VkImage image, VkImageLayout imageLayout, VkClearDepthStencilValue const * pDepthStencil, uint32_t rangeCount, VkImageSubresourceRange const * pRanges)} */
    public static void vkCmdClearDepthStencilImage(VkCommandBuffer commandBuffer, @NativeType("VkImage") long image, @NativeType("VkImageLayout") int imageLayout, @NativeType("VkClearDepthStencilValue const *") VkClearDepthStencilValue pDepthStencil, @NativeType("VkImageSubresourceRange const *") VkImageSubresourceRange.Buffer pRanges) {
        nvkCmdClearDepthStencilImage(commandBuffer, image, imageLayout, pDepthStencil.address(), pRanges.remaining(), pRanges.address());
    }

    /** {@code void vkCmdClearDepthStencilImage(VkCommandBuffer commandBuffer, VkImage image, VkImageLayout imageLayout, VkClearDepthStencilValue const * pDepthStencil, uint32_t rangeCount, VkImageSubresourceRange const * pRanges)} */
    public static void vkCmdClearDepthStencilImage(VkCommandBuffer commandBuffer, @NativeType("VkImage") long image, @NativeType("VkImageLayout") int imageLayout, @NativeType("VkClearDepthStencilValue const *") VkClearDepthStencilValue pDepthStencil, @NativeType("VkImageSubresourceRange const *") VkImageSubresourceRange pRange) {
        nvkCmdClearDepthStencilImage(commandBuffer, image, imageLayout, pDepthStencil.address(), 1, pRange.address());
    }

    // --- [ vkCmdClearAttachments ] ---

    /** {@code void vkCmdClearAttachments(VkCommandBuffer commandBuffer, uint32_t attachmentCount, VkClearAttachment const * pAttachments, uint32_t rectCount, VkClearRect const * pRects)} */
    public static void nvkCmdClearAttachments(VkCommandBuffer commandBuffer, int attachmentCount, long pAttachments, int rectCount, long pRects) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdClearAttachments;
        callPPPV(commandBuffer.address(), attachmentCount, pAttachments, rectCount, pRects, __functionAddress);
    }

    /** {@code void vkCmdClearAttachments(VkCommandBuffer commandBuffer, uint32_t attachmentCount, VkClearAttachment const * pAttachments, uint32_t rectCount, VkClearRect const * pRects)} */
    public static void vkCmdClearAttachments(VkCommandBuffer commandBuffer, @NativeType("VkClearAttachment const *") VkClearAttachment.Buffer pAttachments, @NativeType("VkClearRect const *") VkClearRect.Buffer pRects) {
        nvkCmdClearAttachments(commandBuffer, pAttachments.remaining(), pAttachments.address(), pRects.remaining(), pRects.address());
    }

    // --- [ vkCmdResolveImage ] ---

    /** {@code void vkCmdResolveImage(VkCommandBuffer commandBuffer, VkImage srcImage, VkImageLayout srcImageLayout, VkImage dstImage, VkImageLayout dstImageLayout, uint32_t regionCount, VkImageResolve const * pRegions)} */
    public static void nvkCmdResolveImage(VkCommandBuffer commandBuffer, long srcImage, int srcImageLayout, long dstImage, int dstImageLayout, int regionCount, long pRegions) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdResolveImage;
        callPJJPV(commandBuffer.address(), srcImage, srcImageLayout, dstImage, dstImageLayout, regionCount, pRegions, __functionAddress);
    }

    /** {@code void vkCmdResolveImage(VkCommandBuffer commandBuffer, VkImage srcImage, VkImageLayout srcImageLayout, VkImage dstImage, VkImageLayout dstImageLayout, uint32_t regionCount, VkImageResolve const * pRegions)} */
    public static void vkCmdResolveImage(VkCommandBuffer commandBuffer, @NativeType("VkImage") long srcImage, @NativeType("VkImageLayout") int srcImageLayout, @NativeType("VkImage") long dstImage, @NativeType("VkImageLayout") int dstImageLayout, @NativeType("VkImageResolve const *") VkImageResolve.Buffer pRegions) {
        nvkCmdResolveImage(commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, pRegions.remaining(), pRegions.address());
    }

    /** {@code void vkCmdResolveImage(VkCommandBuffer commandBuffer, VkImage srcImage, VkImageLayout srcImageLayout, VkImage dstImage, VkImageLayout dstImageLayout, uint32_t regionCount, VkImageResolve const * pRegions)} */
    public static void vkCmdResolveImage(VkCommandBuffer commandBuffer, @NativeType("VkImage") long srcImage, @NativeType("VkImageLayout") int srcImageLayout, @NativeType("VkImage") long dstImage, @NativeType("VkImageLayout") int dstImageLayout, @NativeType("VkImageResolve const *") VkImageResolve pRegion) {
        nvkCmdResolveImage(commandBuffer, srcImage, srcImageLayout, dstImage, dstImageLayout, 1, pRegion.address());
    }

    // --- [ vkCmdBeginRenderPass ] ---

    /** {@code void vkCmdBeginRenderPass(VkCommandBuffer commandBuffer, VkRenderPassBeginInfo const * pRenderPassBegin, VkSubpassContents contents)} */
    public static void nvkCmdBeginRenderPass(VkCommandBuffer commandBuffer, long pRenderPassBegin, int contents) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBeginRenderPass;
        callPPV(commandBuffer.address(), pRenderPassBegin, contents, __functionAddress);
    }

    /** {@code void vkCmdBeginRenderPass(VkCommandBuffer commandBuffer, VkRenderPassBeginInfo const * pRenderPassBegin, VkSubpassContents contents)} */
    public static void vkCmdBeginRenderPass(VkCommandBuffer commandBuffer, @NativeType("VkRenderPassBeginInfo const *") VkRenderPassBeginInfo pRenderPassBegin, @NativeType("VkSubpassContents") int contents) {
        nvkCmdBeginRenderPass(commandBuffer, pRenderPassBegin.address(), contents);
    }

    // --- [ vkCmdNextSubpass ] ---

    /** {@code void vkCmdNextSubpass(VkCommandBuffer commandBuffer, VkSubpassContents contents)} */
    public static void vkCmdNextSubpass(VkCommandBuffer commandBuffer, @NativeType("VkSubpassContents") int contents) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdNextSubpass;
        callPV(commandBuffer.address(), contents, __functionAddress);
    }

    // --- [ vkCmdEndRenderPass ] ---

    /** {@code void vkCmdEndRenderPass(VkCommandBuffer commandBuffer)} */
    public static void vkCmdEndRenderPass(VkCommandBuffer commandBuffer) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdEndRenderPass;
        callPV(commandBuffer.address(), __functionAddress);
    }

    // --- [ VK_MAKE_API_VERSION ] ---

    /** {@code uint32_t VK_MAKE_API_VERSION(uint32_t variant, uint32_t major, uint32_t minor, uint32_t patch)} */
    @NativeType("uint32_t")
    public static int VK_MAKE_API_VERSION(@NativeType("uint32_t") int variant, @NativeType("uint32_t") int major, @NativeType("uint32_t") int minor, @NativeType("uint32_t") int patch) {
        return (variant << 29) | (major << 22) | (minor << 12) | patch;
    }

    // --- [ VK_API_VERSION_VARIANT ] ---

    /** {@code uint32_t VK_API_VERSION_VARIANT(uint32_t version)} */
    @NativeType("uint32_t")
    public static int VK_API_VERSION_VARIANT(@NativeType("uint32_t") int version) {
        return version >>> 29;
    }

    // --- [ VK_API_VERSION_MAJOR ] ---

    /** {@code uint32_t VK_API_VERSION_MAJOR(uint32_t version)} */
    @NativeType("uint32_t")
    public static int VK_API_VERSION_MAJOR(@NativeType("uint32_t") int version) {
        return (version >>> 22) & 0x7F;
    }

    // --- [ VK_API_VERSION_MINOR ] ---

    /** {@code uint32_t VK_API_VERSION_MINOR(uint32_t version)} */
    @NativeType("uint32_t")
    public static int VK_API_VERSION_MINOR(@NativeType("uint32_t") int version) {
        return (version >>> 12) & 0x3FF;
    }

    // --- [ VK_API_VERSION_PATCH ] ---

    /** {@code uint32_t VK_API_VERSION_PATCH(uint32_t version)} */
    @NativeType("uint32_t")
    public static int VK_API_VERSION_PATCH(@NativeType("uint32_t") int version) {
        return version & 0xFFF;
    }

    // --- [ VK_MAKE_VERSION ] ---

    /** {@code uint32_t VK_MAKE_VERSION(uint32_t major, uint32_t minor, uint32_t patch)} */
    @NativeType("uint32_t")
    public static int VK_MAKE_VERSION(@NativeType("uint32_t") int major, @NativeType("uint32_t") int minor, @NativeType("uint32_t") int patch) {
        return (major << 22) | (minor << 12) | patch;
    }

    // --- [ VK_VERSION_MAJOR ] ---

    /** {@code uint32_t VK_VERSION_MAJOR(uint32_t version)} */
    @NativeType("uint32_t")
    public static int VK_VERSION_MAJOR(@NativeType("uint32_t") int version) {
        return version >>> 22;
    }

    // --- [ VK_VERSION_MINOR ] ---

    /** {@code uint32_t VK_VERSION_MINOR(uint32_t version)} */
    @NativeType("uint32_t")
    public static int VK_VERSION_MINOR(@NativeType("uint32_t") int version) {
        return (version >>> 12) & 0x3FF;
    }

    // --- [ VK_VERSION_PATCH ] ---

    /** {@code uint32_t VK_VERSION_PATCH(uint32_t version)} */
    @NativeType("uint32_t")
    public static int VK_VERSION_PATCH(@NativeType("uint32_t") int version) {
        return version & 0xFFF;
    }

    /** {@code VkResult vkEnumeratePhysicalDevices(VkInstance instance, uint32_t * pPhysicalDeviceCount, VkPhysicalDevice * pPhysicalDevices)} */
    @NativeType("VkResult")
    public static int vkEnumeratePhysicalDevices(VkInstance instance, @NativeType("uint32_t *") int[] pPhysicalDeviceCount, @NativeType("VkPhysicalDevice *") @Nullable PointerBuffer pPhysicalDevices) {
        long __functionAddress = instance.getCapabilities().vkEnumeratePhysicalDevices;
        if (CHECKS) {
            check(pPhysicalDeviceCount, 1);
            checkSafe(pPhysicalDevices, pPhysicalDeviceCount[0]);
        }
        return callPPPI(instance.address(), pPhysicalDeviceCount, memAddressSafe(pPhysicalDevices), __functionAddress);
    }

    /** {@code void vkGetPhysicalDeviceQueueFamilyProperties(VkPhysicalDevice physicalDevice, uint32_t * pQueueFamilyPropertyCount, VkQueueFamilyProperties * pQueueFamilyProperties)} */
    public static void vkGetPhysicalDeviceQueueFamilyProperties(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") int[] pQueueFamilyPropertyCount, @NativeType("VkQueueFamilyProperties *") VkQueueFamilyProperties.@Nullable Buffer pQueueFamilyProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceQueueFamilyProperties;
        if (CHECKS) {
            check(pQueueFamilyPropertyCount, 1);
            checkSafe(pQueueFamilyProperties, pQueueFamilyPropertyCount[0]);
        }
        callPPPV(physicalDevice.address(), pQueueFamilyPropertyCount, memAddressSafe(pQueueFamilyProperties), __functionAddress);
    }

    /** {@code VkResult vkEnumerateInstanceExtensionProperties(char const * pLayerName, uint32_t * pPropertyCount, VkExtensionProperties * pProperties)} */
    @NativeType("VkResult")
    public static int vkEnumerateInstanceExtensionProperties(@NativeType("char const *") @Nullable ByteBuffer pLayerName, @NativeType("uint32_t *") int[] pPropertyCount, @NativeType("VkExtensionProperties *") VkExtensionProperties.@Nullable Buffer pProperties) {
        long __functionAddress = VK.getGlobalCommands().vkEnumerateInstanceExtensionProperties;
        if (CHECKS) {
            checkNT1Safe(pLayerName);
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount[0]);
        }
        return callPPPI(memAddressSafe(pLayerName), pPropertyCount, memAddressSafe(pProperties), __functionAddress);
    }

    /** {@code VkResult vkEnumerateInstanceExtensionProperties(char const * pLayerName, uint32_t * pPropertyCount, VkExtensionProperties * pProperties)} */
    @NativeType("VkResult")
    public static int vkEnumerateInstanceExtensionProperties(@NativeType("char const *") @Nullable CharSequence pLayerName, @NativeType("uint32_t *") int[] pPropertyCount, @NativeType("VkExtensionProperties *") VkExtensionProperties.@Nullable Buffer pProperties) {
        long __functionAddress = VK.getGlobalCommands().vkEnumerateInstanceExtensionProperties;
        if (CHECKS) {
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount[0]);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(pLayerName, true);
            long pLayerNameEncoded = pLayerName == null ? NULL : stack.getPointerAddress();
            return callPPPI(pLayerNameEncoded, pPropertyCount, memAddressSafe(pProperties), __functionAddress);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code VkResult vkEnumerateDeviceExtensionProperties(VkPhysicalDevice physicalDevice, char const * pLayerName, uint32_t * pPropertyCount, VkExtensionProperties * pProperties)} */
    @NativeType("VkResult")
    public static int vkEnumerateDeviceExtensionProperties(VkPhysicalDevice physicalDevice, @NativeType("char const *") @Nullable ByteBuffer pLayerName, @NativeType("uint32_t *") int[] pPropertyCount, @NativeType("VkExtensionProperties *") VkExtensionProperties.@Nullable Buffer pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkEnumerateDeviceExtensionProperties;
        if (CHECKS) {
            checkNT1Safe(pLayerName);
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount[0]);
        }
        return callPPPPI(physicalDevice.address(), memAddressSafe(pLayerName), pPropertyCount, memAddressSafe(pProperties), __functionAddress);
    }

    /** {@code VkResult vkEnumerateDeviceExtensionProperties(VkPhysicalDevice physicalDevice, char const * pLayerName, uint32_t * pPropertyCount, VkExtensionProperties * pProperties)} */
    @NativeType("VkResult")
    public static int vkEnumerateDeviceExtensionProperties(VkPhysicalDevice physicalDevice, @NativeType("char const *") @Nullable CharSequence pLayerName, @NativeType("uint32_t *") int[] pPropertyCount, @NativeType("VkExtensionProperties *") VkExtensionProperties.@Nullable Buffer pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkEnumerateDeviceExtensionProperties;
        if (CHECKS) {
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount[0]);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(pLayerName, true);
            long pLayerNameEncoded = pLayerName == null ? NULL : stack.getPointerAddress();
            return callPPPPI(physicalDevice.address(), pLayerNameEncoded, pPropertyCount, memAddressSafe(pProperties), __functionAddress);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code VkResult vkEnumerateInstanceLayerProperties(uint32_t * pPropertyCount, VkLayerProperties * pProperties)} */
    @NativeType("VkResult")
    public static int vkEnumerateInstanceLayerProperties(@NativeType("uint32_t *") int[] pPropertyCount, @NativeType("VkLayerProperties *") VkLayerProperties.@Nullable Buffer pProperties) {
        long __functionAddress = VK.getGlobalCommands().vkEnumerateInstanceLayerProperties;
        if (CHECKS) {
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount[0]);
        }
        return callPPI(pPropertyCount, memAddressSafe(pProperties), __functionAddress);
    }

    /** {@code VkResult vkEnumerateDeviceLayerProperties(VkPhysicalDevice physicalDevice, uint32_t * pPropertyCount, VkLayerProperties * pProperties)} */
    @NativeType("VkResult")
    public static int vkEnumerateDeviceLayerProperties(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") int[] pPropertyCount, @NativeType("VkLayerProperties *") VkLayerProperties.@Nullable Buffer pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkEnumerateDeviceLayerProperties;
        if (CHECKS) {
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount[0]);
        }
        return callPPPI(physicalDevice.address(), pPropertyCount, memAddressSafe(pProperties), __functionAddress);
    }

    /** {@code VkResult vkAllocateMemory(VkDevice device, VkMemoryAllocateInfo const * pAllocateInfo, VkAllocationCallbacks const * pAllocator, VkDeviceMemory * pMemory)} */
    @NativeType("VkResult")
    public static int vkAllocateMemory(VkDevice device, @NativeType("VkMemoryAllocateInfo const *") VkMemoryAllocateInfo pAllocateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkDeviceMemory *") long[] pMemory) {
        long __functionAddress = device.getCapabilities().vkAllocateMemory;
        if (CHECKS) {
            check(pMemory, 1);
        }
        return callPPPPI(device.address(), pAllocateInfo.address(), memAddressSafe(pAllocator), pMemory, __functionAddress);
    }

    /** {@code void vkGetDeviceMemoryCommitment(VkDevice device, VkDeviceMemory memory, VkDeviceSize * pCommittedMemoryInBytes)} */
    public static void vkGetDeviceMemoryCommitment(VkDevice device, @NativeType("VkDeviceMemory") long memory, @NativeType("VkDeviceSize *") long[] pCommittedMemoryInBytes) {
        long __functionAddress = device.getCapabilities().vkGetDeviceMemoryCommitment;
        if (CHECKS) {
            check(pCommittedMemoryInBytes, 1);
        }
        callPJPV(device.address(), memory, pCommittedMemoryInBytes, __functionAddress);
    }

    /** {@code void vkGetImageSparseMemoryRequirements(VkDevice device, VkImage image, uint32_t * pSparseMemoryRequirementCount, VkSparseImageMemoryRequirements * pSparseMemoryRequirements)} */
    public static void vkGetImageSparseMemoryRequirements(VkDevice device, @NativeType("VkImage") long image, @NativeType("uint32_t *") int[] pSparseMemoryRequirementCount, @NativeType("VkSparseImageMemoryRequirements *") VkSparseImageMemoryRequirements.@Nullable Buffer pSparseMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetImageSparseMemoryRequirements;
        if (CHECKS) {
            check(pSparseMemoryRequirementCount, 1);
            checkSafe(pSparseMemoryRequirements, pSparseMemoryRequirementCount[0]);
        }
        callPJPPV(device.address(), image, pSparseMemoryRequirementCount, memAddressSafe(pSparseMemoryRequirements), __functionAddress);
    }

    /** {@code void vkGetPhysicalDeviceSparseImageFormatProperties(VkPhysicalDevice physicalDevice, VkFormat format, VkImageType type, VkSampleCountFlagBits samples, VkImageUsageFlags usage, VkImageTiling tiling, uint32_t * pPropertyCount, VkSparseImageFormatProperties * pProperties)} */
    public static void vkGetPhysicalDeviceSparseImageFormatProperties(VkPhysicalDevice physicalDevice, @NativeType("VkFormat") int format, @NativeType("VkImageType") int type, @NativeType("VkSampleCountFlagBits") int samples, @NativeType("VkImageUsageFlags") int usage, @NativeType("VkImageTiling") int tiling, @NativeType("uint32_t *") int[] pPropertyCount, @NativeType("VkSparseImageFormatProperties *") VkSparseImageFormatProperties.@Nullable Buffer pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSparseImageFormatProperties;
        if (CHECKS) {
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount[0]);
        }
        callPPPV(physicalDevice.address(), format, type, samples, usage, tiling, pPropertyCount, memAddressSafe(pProperties), __functionAddress);
    }

    /** {@code VkResult vkCreateFence(VkDevice device, VkFenceCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkFence * pFence)} */
    @NativeType("VkResult")
    public static int vkCreateFence(VkDevice device, @NativeType("VkFenceCreateInfo const *") VkFenceCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkFence *") long[] pFence) {
        long __functionAddress = device.getCapabilities().vkCreateFence;
        if (CHECKS) {
            check(pFence, 1);
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pFence, __functionAddress);
    }

    /** {@code VkResult vkResetFences(VkDevice device, uint32_t fenceCount, VkFence const * pFences)} */
    @NativeType("VkResult")
    public static int vkResetFences(VkDevice device, @NativeType("VkFence const *") long[] pFences) {
        long __functionAddress = device.getCapabilities().vkResetFences;
        return callPPI(device.address(), pFences.length, pFences, __functionAddress);
    }

    /** {@code VkResult vkWaitForFences(VkDevice device, uint32_t fenceCount, VkFence const * pFences, VkBool32 waitAll, uint64_t timeout)} */
    @NativeType("VkResult")
    public static int vkWaitForFences(VkDevice device, @NativeType("VkFence const *") long[] pFences, @NativeType("VkBool32") boolean waitAll, @NativeType("uint64_t") long timeout) {
        long __functionAddress = device.getCapabilities().vkWaitForFences;
        return callPPJI(device.address(), pFences.length, pFences, waitAll ? 1 : 0, timeout, __functionAddress);
    }

    /** {@code VkResult vkCreateSemaphore(VkDevice device, VkSemaphoreCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkSemaphore * pSemaphore)} */
    @NativeType("VkResult")
    public static int vkCreateSemaphore(VkDevice device, @NativeType("VkSemaphoreCreateInfo const *") VkSemaphoreCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkSemaphore *") long[] pSemaphore) {
        long __functionAddress = device.getCapabilities().vkCreateSemaphore;
        if (CHECKS) {
            check(pSemaphore, 1);
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pSemaphore, __functionAddress);
    }

    /** {@code VkResult vkCreateQueryPool(VkDevice device, VkQueryPoolCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkQueryPool * pQueryPool)} */
    @NativeType("VkResult")
    public static int vkCreateQueryPool(VkDevice device, @NativeType("VkQueryPoolCreateInfo const *") VkQueryPoolCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkQueryPool *") long[] pQueryPool) {
        long __functionAddress = device.getCapabilities().vkCreateQueryPool;
        if (CHECKS) {
            check(pQueryPool, 1);
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pQueryPool, __functionAddress);
    }

    /** {@code VkResult vkGetQueryPoolResults(VkDevice device, VkQueryPool queryPool, uint32_t firstQuery, uint32_t queryCount, size_t dataSize, void * pData, VkDeviceSize stride, VkQueryResultFlags flags)} */
    @NativeType("VkResult")
    public static int vkGetQueryPoolResults(VkDevice device, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int firstQuery, @NativeType("uint32_t") int queryCount, @NativeType("void *") int[] pData, @NativeType("VkDeviceSize") long stride, @NativeType("VkQueryResultFlags") int flags) {
        long __functionAddress = device.getCapabilities().vkGetQueryPoolResults;
        return callPJPPJI(device.address(), queryPool, firstQuery, queryCount, Integer.toUnsignedLong(pData.length) << 2, pData, stride, flags, __functionAddress);
    }

    /** {@code VkResult vkGetQueryPoolResults(VkDevice device, VkQueryPool queryPool, uint32_t firstQuery, uint32_t queryCount, size_t dataSize, void * pData, VkDeviceSize stride, VkQueryResultFlags flags)} */
    @NativeType("VkResult")
    public static int vkGetQueryPoolResults(VkDevice device, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int firstQuery, @NativeType("uint32_t") int queryCount, @NativeType("void *") long[] pData, @NativeType("VkDeviceSize") long stride, @NativeType("VkQueryResultFlags") int flags) {
        long __functionAddress = device.getCapabilities().vkGetQueryPoolResults;
        return callPJPPJI(device.address(), queryPool, firstQuery, queryCount, Integer.toUnsignedLong(pData.length) << 3, pData, stride, flags, __functionAddress);
    }

    /** {@code VkResult vkCreateBuffer(VkDevice device, VkBufferCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkBuffer * pBuffer)} */
    @NativeType("VkResult")
    public static int vkCreateBuffer(VkDevice device, @NativeType("VkBufferCreateInfo const *") VkBufferCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkBuffer *") long[] pBuffer) {
        long __functionAddress = device.getCapabilities().vkCreateBuffer;
        if (CHECKS) {
            check(pBuffer, 1);
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pBuffer, __functionAddress);
    }

    /** {@code VkResult vkCreateImage(VkDevice device, VkImageCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkImage * pImage)} */
    @NativeType("VkResult")
    public static int vkCreateImage(VkDevice device, @NativeType("VkImageCreateInfo const *") VkImageCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkImage *") long[] pImage) {
        long __functionAddress = device.getCapabilities().vkCreateImage;
        if (CHECKS) {
            check(pImage, 1);
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pImage, __functionAddress);
    }

    /** {@code VkResult vkCreateImageView(VkDevice device, VkImageViewCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkImageView * pView)} */
    @NativeType("VkResult")
    public static int vkCreateImageView(VkDevice device, @NativeType("VkImageViewCreateInfo const *") VkImageViewCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkImageView *") long[] pView) {
        long __functionAddress = device.getCapabilities().vkCreateImageView;
        if (CHECKS) {
            check(pView, 1);
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pView, __functionAddress);
    }

    /** {@code VkResult vkCreateCommandPool(VkDevice device, VkCommandPoolCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkCommandPool * pCommandPool)} */
    @NativeType("VkResult")
    public static int vkCreateCommandPool(VkDevice device, @NativeType("VkCommandPoolCreateInfo const *") VkCommandPoolCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkCommandPool *") long[] pCommandPool) {
        long __functionAddress = device.getCapabilities().vkCreateCommandPool;
        if (CHECKS) {
            check(pCommandPool, 1);
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pCommandPool, __functionAddress);
    }

    /** {@code void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, VkBuffer dstBuffer, VkDeviceSize dstOffset, VkDeviceSize dataSize, void const * pData)} */
    public static void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long dstBuffer, @NativeType("VkDeviceSize") long dstOffset, @NativeType("void const *") short[] pData) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdUpdateBuffer;
        callPJJJPV(commandBuffer.address(), dstBuffer, dstOffset, Integer.toUnsignedLong(pData.length) << 1, pData, __functionAddress);
    }

    /** {@code void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, VkBuffer dstBuffer, VkDeviceSize dstOffset, VkDeviceSize dataSize, void const * pData)} */
    public static void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long dstBuffer, @NativeType("VkDeviceSize") long dstOffset, @NativeType("void const *") int[] pData) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdUpdateBuffer;
        callPJJJPV(commandBuffer.address(), dstBuffer, dstOffset, Integer.toUnsignedLong(pData.length) << 2, pData, __functionAddress);
    }

    /** {@code void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, VkBuffer dstBuffer, VkDeviceSize dstOffset, VkDeviceSize dataSize, void const * pData)} */
    public static void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long dstBuffer, @NativeType("VkDeviceSize") long dstOffset, @NativeType("void const *") long[] pData) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdUpdateBuffer;
        callPJJJPV(commandBuffer.address(), dstBuffer, dstOffset, Integer.toUnsignedLong(pData.length) << 3, pData, __functionAddress);
    }

    /** {@code void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, VkBuffer dstBuffer, VkDeviceSize dstOffset, VkDeviceSize dataSize, void const * pData)} */
    public static void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long dstBuffer, @NativeType("VkDeviceSize") long dstOffset, @NativeType("void const *") float[] pData) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdUpdateBuffer;
        callPJJJPV(commandBuffer.address(), dstBuffer, dstOffset, Integer.toUnsignedLong(pData.length) << 2, pData, __functionAddress);
    }

    /** {@code void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, VkBuffer dstBuffer, VkDeviceSize dstOffset, VkDeviceSize dataSize, void const * pData)} */
    public static void vkCmdUpdateBuffer(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long dstBuffer, @NativeType("VkDeviceSize") long dstOffset, @NativeType("void const *") double[] pData) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdUpdateBuffer;
        callPJJJPV(commandBuffer.address(), dstBuffer, dstOffset, Integer.toUnsignedLong(pData.length) << 3, pData, __functionAddress);
    }

    /** {@code VkResult vkCreateEvent(VkDevice device, VkEventCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkEvent * pEvent)} */
    @NativeType("VkResult")
    public static int vkCreateEvent(VkDevice device, @NativeType("VkEventCreateInfo const *") VkEventCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkEvent *") long[] pEvent) {
        long __functionAddress = device.getCapabilities().vkCreateEvent;
        if (CHECKS) {
            check(pEvent, 1);
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pEvent, __functionAddress);
    }

    /** {@code VkResult vkCreateBufferView(VkDevice device, VkBufferViewCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkBufferView * pView)} */
    @NativeType("VkResult")
    public static int vkCreateBufferView(VkDevice device, @NativeType("VkBufferViewCreateInfo const *") VkBufferViewCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkBufferView *") long[] pView) {
        long __functionAddress = device.getCapabilities().vkCreateBufferView;
        if (CHECKS) {
            check(pView, 1);
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pView, __functionAddress);
    }

    /** {@code VkResult vkCreateShaderModule(VkDevice device, VkShaderModuleCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkShaderModule * pShaderModule)} */
    @NativeType("VkResult")
    public static int vkCreateShaderModule(VkDevice device, @NativeType("VkShaderModuleCreateInfo const *") VkShaderModuleCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkShaderModule *") long[] pShaderModule) {
        long __functionAddress = device.getCapabilities().vkCreateShaderModule;
        if (CHECKS) {
            check(pShaderModule, 1);
            VkShaderModuleCreateInfo.validate(pCreateInfo.address());
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pShaderModule, __functionAddress);
    }

    /** {@code VkResult vkCreatePipelineCache(VkDevice device, VkPipelineCacheCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkPipelineCache * pPipelineCache)} */
    @NativeType("VkResult")
    public static int vkCreatePipelineCache(VkDevice device, @NativeType("VkPipelineCacheCreateInfo const *") VkPipelineCacheCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkPipelineCache *") long[] pPipelineCache) {
        long __functionAddress = device.getCapabilities().vkCreatePipelineCache;
        if (CHECKS) {
            check(pPipelineCache, 1);
            VkPipelineCacheCreateInfo.validate(pCreateInfo.address());
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pPipelineCache, __functionAddress);
    }

    /** {@code VkResult vkMergePipelineCaches(VkDevice device, VkPipelineCache dstCache, uint32_t srcCacheCount, VkPipelineCache const * pSrcCaches)} */
    @NativeType("VkResult")
    public static int vkMergePipelineCaches(VkDevice device, @NativeType("VkPipelineCache") long dstCache, @NativeType("VkPipelineCache const *") long[] pSrcCaches) {
        long __functionAddress = device.getCapabilities().vkMergePipelineCaches;
        return callPJPI(device.address(), dstCache, pSrcCaches.length, pSrcCaches, __functionAddress);
    }

    /** {@code VkResult vkCreateComputePipelines(VkDevice device, VkPipelineCache pipelineCache, uint32_t createInfoCount, VkComputePipelineCreateInfo const * pCreateInfos, VkAllocationCallbacks const * pAllocator, VkPipeline * pPipelines)} */
    @NativeType("VkResult")
    public static int vkCreateComputePipelines(VkDevice device, @NativeType("VkPipelineCache") long pipelineCache, @NativeType("VkComputePipelineCreateInfo const *") VkComputePipelineCreateInfo.Buffer pCreateInfos, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkPipeline *") long[] pPipelines) {
        long __functionAddress = device.getCapabilities().vkCreateComputePipelines;
        if (CHECKS) {
            check(pPipelines, pCreateInfos.remaining());
            Struct.validate(pCreateInfos.address(), pCreateInfos.remaining(), VkComputePipelineCreateInfo.SIZEOF, VkComputePipelineCreateInfo::validate);
        }
        return callPJPPPI(device.address(), pipelineCache, pCreateInfos.remaining(), pCreateInfos.address(), memAddressSafe(pAllocator), pPipelines, __functionAddress);
    }

    /** {@code VkResult vkCreatePipelineLayout(VkDevice device, VkPipelineLayoutCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkPipelineLayout * pPipelineLayout)} */
    @NativeType("VkResult")
    public static int vkCreatePipelineLayout(VkDevice device, @NativeType("VkPipelineLayoutCreateInfo const *") VkPipelineLayoutCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkPipelineLayout *") long[] pPipelineLayout) {
        long __functionAddress = device.getCapabilities().vkCreatePipelineLayout;
        if (CHECKS) {
            check(pPipelineLayout, 1);
            VkPipelineLayoutCreateInfo.validate(pCreateInfo.address());
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pPipelineLayout, __functionAddress);
    }

    /** {@code VkResult vkCreateSampler(VkDevice device, VkSamplerCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkSampler * pSampler)} */
    @NativeType("VkResult")
    public static int vkCreateSampler(VkDevice device, @NativeType("VkSamplerCreateInfo const *") VkSamplerCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkSampler *") long[] pSampler) {
        long __functionAddress = device.getCapabilities().vkCreateSampler;
        if (CHECKS) {
            check(pSampler, 1);
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pSampler, __functionAddress);
    }

    /** {@code VkResult vkCreateDescriptorSetLayout(VkDevice device, VkDescriptorSetLayoutCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkDescriptorSetLayout * pSetLayout)} */
    @NativeType("VkResult")
    public static int vkCreateDescriptorSetLayout(VkDevice device, @NativeType("VkDescriptorSetLayoutCreateInfo const *") VkDescriptorSetLayoutCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkDescriptorSetLayout *") long[] pSetLayout) {
        long __functionAddress = device.getCapabilities().vkCreateDescriptorSetLayout;
        if (CHECKS) {
            check(pSetLayout, 1);
            VkDescriptorSetLayoutCreateInfo.validate(pCreateInfo.address());
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pSetLayout, __functionAddress);
    }

    /** {@code VkResult vkCreateDescriptorPool(VkDevice device, VkDescriptorPoolCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkDescriptorPool * pDescriptorPool)} */
    @NativeType("VkResult")
    public static int vkCreateDescriptorPool(VkDevice device, @NativeType("VkDescriptorPoolCreateInfo const *") VkDescriptorPoolCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkDescriptorPool *") long[] pDescriptorPool) {
        long __functionAddress = device.getCapabilities().vkCreateDescriptorPool;
        if (CHECKS) {
            check(pDescriptorPool, 1);
            VkDescriptorPoolCreateInfo.validate(pCreateInfo.address());
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pDescriptorPool, __functionAddress);
    }

    /** {@code VkResult vkAllocateDescriptorSets(VkDevice device, VkDescriptorSetAllocateInfo const * pAllocateInfo, VkDescriptorSet * pDescriptorSets)} */
    @NativeType("VkResult")
    public static int vkAllocateDescriptorSets(VkDevice device, @NativeType("VkDescriptorSetAllocateInfo const *") VkDescriptorSetAllocateInfo pAllocateInfo, @NativeType("VkDescriptorSet *") long[] pDescriptorSets) {
        long __functionAddress = device.getCapabilities().vkAllocateDescriptorSets;
        if (CHECKS) {
            check(pDescriptorSets, pAllocateInfo.descriptorSetCount());
            VkDescriptorSetAllocateInfo.validate(pAllocateInfo.address());
        }
        return callPPPI(device.address(), pAllocateInfo.address(), pDescriptorSets, __functionAddress);
    }

    /** {@code VkResult vkFreeDescriptorSets(VkDevice device, VkDescriptorPool descriptorPool, uint32_t descriptorSetCount, VkDescriptorSet const * pDescriptorSets)} */
    @NativeType("VkResult")
    public static int vkFreeDescriptorSets(VkDevice device, @NativeType("VkDescriptorPool") long descriptorPool, @NativeType("VkDescriptorSet const *") long @Nullable [] pDescriptorSets) {
        long __functionAddress = device.getCapabilities().vkFreeDescriptorSets;
        return callPJPI(device.address(), descriptorPool, lengthSafe(pDescriptorSets), pDescriptorSets, __functionAddress);
    }

    /** {@code void vkCmdBindDescriptorSets(VkCommandBuffer commandBuffer, VkPipelineBindPoint pipelineBindPoint, VkPipelineLayout layout, uint32_t firstSet, uint32_t descriptorSetCount, VkDescriptorSet const * pDescriptorSets, uint32_t dynamicOffsetCount, uint32_t const * pDynamicOffsets)} */
    public static void vkCmdBindDescriptorSets(VkCommandBuffer commandBuffer, @NativeType("VkPipelineBindPoint") int pipelineBindPoint, @NativeType("VkPipelineLayout") long layout, @NativeType("uint32_t") int firstSet, @NativeType("VkDescriptorSet const *") long[] pDescriptorSets, @NativeType("uint32_t const *") int @Nullable [] pDynamicOffsets) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindDescriptorSets;
        callPJPPV(commandBuffer.address(), pipelineBindPoint, layout, firstSet, pDescriptorSets.length, pDescriptorSets, lengthSafe(pDynamicOffsets), pDynamicOffsets, __functionAddress);
    }

    /** {@code void vkCmdWaitEvents(VkCommandBuffer commandBuffer, uint32_t eventCount, VkEvent const * pEvents, VkPipelineStageFlags srcStageMask, VkPipelineStageFlags dstStageMask, uint32_t memoryBarrierCount, VkMemoryBarrier const * pMemoryBarriers, uint32_t bufferMemoryBarrierCount, VkBufferMemoryBarrier const * pBufferMemoryBarriers, uint32_t imageMemoryBarrierCount, VkImageMemoryBarrier const * pImageMemoryBarriers)} */
    public static void vkCmdWaitEvents(VkCommandBuffer commandBuffer, @NativeType("VkEvent const *") long[] pEvents, @NativeType("VkPipelineStageFlags") int srcStageMask, @NativeType("VkPipelineStageFlags") int dstStageMask, @NativeType("VkMemoryBarrier const *") VkMemoryBarrier.@Nullable Buffer pMemoryBarriers, @NativeType("VkBufferMemoryBarrier const *") VkBufferMemoryBarrier.@Nullable Buffer pBufferMemoryBarriers, @NativeType("VkImageMemoryBarrier const *") VkImageMemoryBarrier.@Nullable Buffer pImageMemoryBarriers) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdWaitEvents;
        callPPPPPV(commandBuffer.address(), pEvents.length, pEvents, srcStageMask, dstStageMask, remainingSafe(pMemoryBarriers), memAddressSafe(pMemoryBarriers), remainingSafe(pBufferMemoryBarriers), memAddressSafe(pBufferMemoryBarriers), remainingSafe(pImageMemoryBarriers), memAddressSafe(pImageMemoryBarriers), __functionAddress);
    }

    /** {@code void vkCmdPushConstants(VkCommandBuffer commandBuffer, VkPipelineLayout layout, VkShaderStageFlags stageFlags, uint32_t offset, uint32_t size, void const * pValues)} */
    public static void vkCmdPushConstants(VkCommandBuffer commandBuffer, @NativeType("VkPipelineLayout") long layout, @NativeType("VkShaderStageFlags") int stageFlags, @NativeType("uint32_t") int offset, @NativeType("void const *") short[] pValues) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPushConstants;
        callPJPV(commandBuffer.address(), layout, stageFlags, offset, pValues.length << 1, pValues, __functionAddress);
    }

    /** {@code void vkCmdPushConstants(VkCommandBuffer commandBuffer, VkPipelineLayout layout, VkShaderStageFlags stageFlags, uint32_t offset, uint32_t size, void const * pValues)} */
    public static void vkCmdPushConstants(VkCommandBuffer commandBuffer, @NativeType("VkPipelineLayout") long layout, @NativeType("VkShaderStageFlags") int stageFlags, @NativeType("uint32_t") int offset, @NativeType("void const *") int[] pValues) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPushConstants;
        callPJPV(commandBuffer.address(), layout, stageFlags, offset, pValues.length << 2, pValues, __functionAddress);
    }

    /** {@code void vkCmdPushConstants(VkCommandBuffer commandBuffer, VkPipelineLayout layout, VkShaderStageFlags stageFlags, uint32_t offset, uint32_t size, void const * pValues)} */
    public static void vkCmdPushConstants(VkCommandBuffer commandBuffer, @NativeType("VkPipelineLayout") long layout, @NativeType("VkShaderStageFlags") int stageFlags, @NativeType("uint32_t") int offset, @NativeType("void const *") long[] pValues) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPushConstants;
        callPJPV(commandBuffer.address(), layout, stageFlags, offset, pValues.length << 3, pValues, __functionAddress);
    }

    /** {@code void vkCmdPushConstants(VkCommandBuffer commandBuffer, VkPipelineLayout layout, VkShaderStageFlags stageFlags, uint32_t offset, uint32_t size, void const * pValues)} */
    public static void vkCmdPushConstants(VkCommandBuffer commandBuffer, @NativeType("VkPipelineLayout") long layout, @NativeType("VkShaderStageFlags") int stageFlags, @NativeType("uint32_t") int offset, @NativeType("void const *") float[] pValues) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPushConstants;
        callPJPV(commandBuffer.address(), layout, stageFlags, offset, pValues.length << 2, pValues, __functionAddress);
    }

    /** {@code void vkCmdPushConstants(VkCommandBuffer commandBuffer, VkPipelineLayout layout, VkShaderStageFlags stageFlags, uint32_t offset, uint32_t size, void const * pValues)} */
    public static void vkCmdPushConstants(VkCommandBuffer commandBuffer, @NativeType("VkPipelineLayout") long layout, @NativeType("VkShaderStageFlags") int stageFlags, @NativeType("uint32_t") int offset, @NativeType("void const *") double[] pValues) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPushConstants;
        callPJPV(commandBuffer.address(), layout, stageFlags, offset, pValues.length << 3, pValues, __functionAddress);
    }

    /** {@code VkResult vkCreateGraphicsPipelines(VkDevice device, VkPipelineCache pipelineCache, uint32_t createInfoCount, VkGraphicsPipelineCreateInfo const * pCreateInfos, VkAllocationCallbacks const * pAllocator, VkPipeline * pPipelines)} */
    @NativeType("VkResult")
    public static int vkCreateGraphicsPipelines(VkDevice device, @NativeType("VkPipelineCache") long pipelineCache, @NativeType("VkGraphicsPipelineCreateInfo const *") VkGraphicsPipelineCreateInfo.Buffer pCreateInfos, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkPipeline *") long[] pPipelines) {
        long __functionAddress = device.getCapabilities().vkCreateGraphicsPipelines;
        if (CHECKS) {
            check(pPipelines, pCreateInfos.remaining());
            Struct.validate(pCreateInfos.address(), pCreateInfos.remaining(), VkGraphicsPipelineCreateInfo.SIZEOF, VkGraphicsPipelineCreateInfo::validate);
        }
        return callPJPPPI(device.address(), pipelineCache, pCreateInfos.remaining(), pCreateInfos.address(), memAddressSafe(pAllocator), pPipelines, __functionAddress);
    }

    /** {@code VkResult vkCreateFramebuffer(VkDevice device, VkFramebufferCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkFramebuffer * pFramebuffer)} */
    @NativeType("VkResult")
    public static int vkCreateFramebuffer(VkDevice device, @NativeType("VkFramebufferCreateInfo const *") VkFramebufferCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkFramebuffer *") long[] pFramebuffer) {
        long __functionAddress = device.getCapabilities().vkCreateFramebuffer;
        if (CHECKS) {
            check(pFramebuffer, 1);
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pFramebuffer, __functionAddress);
    }

    /** {@code VkResult vkCreateRenderPass(VkDevice device, VkRenderPassCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkRenderPass * pRenderPass)} */
    @NativeType("VkResult")
    public static int vkCreateRenderPass(VkDevice device, @NativeType("VkRenderPassCreateInfo const *") VkRenderPassCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkRenderPass *") long[] pRenderPass) {
        long __functionAddress = device.getCapabilities().vkCreateRenderPass;
        if (CHECKS) {
            check(pRenderPass, 1);
            VkRenderPassCreateInfo.validate(pCreateInfo.address());
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pRenderPass, __functionAddress);
    }

    /** {@code void vkCmdSetBlendConstants(VkCommandBuffer commandBuffer, float const * blendConstants)} */
    public static void vkCmdSetBlendConstants(VkCommandBuffer commandBuffer, @NativeType("float const *") float[] blendConstants) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetBlendConstants;
        if (CHECKS) {
            check(blendConstants, 4);
        }
        callPPV(commandBuffer.address(), blendConstants, __functionAddress);
    }

    /** {@code void vkCmdBindVertexBuffers(VkCommandBuffer commandBuffer, uint32_t firstBinding, uint32_t bindingCount, VkBuffer const * pBuffers, VkDeviceSize const * pOffsets)} */
    public static void vkCmdBindVertexBuffers(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstBinding, @NativeType("VkBuffer const *") long[] pBuffers, @NativeType("VkDeviceSize const *") long[] pOffsets) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindVertexBuffers;
        if (CHECKS) {
            check(pOffsets, pBuffers.length);
        }
        callPPPV(commandBuffer.address(), firstBinding, pBuffers.length, pBuffers, pOffsets, __functionAddress);
    }

}