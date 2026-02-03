/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.libffi.LibFFI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class SDLGPU {

    /** Contains the function pointers loaded from {@code SDL.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GPUSupportsShaderFormats              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GPUSupportsShaderFormats"),
            GPUSupportsProperties                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GPUSupportsProperties"),
            CreateGPUDevice                       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateGPUDevice"),
            CreateGPUDeviceWithProperties         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateGPUDeviceWithProperties"),
            DestroyGPUDevice                      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_DestroyGPUDevice"),
            GetNumGPUDrivers                      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetNumGPUDrivers"),
            GetGPUDriver                          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGPUDriver"),
            GetGPUDeviceDriver                    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGPUDeviceDriver"),
            GetGPUShaderFormats                   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGPUShaderFormats"),
            GetGPUDeviceProperties                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGPUDeviceProperties"),
            CreateGPUComputePipeline              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateGPUComputePipeline"),
            CreateGPUGraphicsPipeline             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateGPUGraphicsPipeline"),
            CreateGPUSampler                      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateGPUSampler"),
            CreateGPUShader                       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateGPUShader"),
            CreateGPUTexture                      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateGPUTexture"),
            CreateGPUBuffer                       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateGPUBuffer"),
            CreateGPUTransferBuffer               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateGPUTransferBuffer"),
            SetGPUBufferName                      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetGPUBufferName"),
            SetGPUTextureName                     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetGPUTextureName"),
            InsertGPUDebugLabel                   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_InsertGPUDebugLabel"),
            PushGPUDebugGroup                     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_PushGPUDebugGroup"),
            PopGPUDebugGroup                      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_PopGPUDebugGroup"),
            ReleaseGPUTexture                     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReleaseGPUTexture"),
            ReleaseGPUSampler                     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReleaseGPUSampler"),
            ReleaseGPUBuffer                      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReleaseGPUBuffer"),
            ReleaseGPUTransferBuffer              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReleaseGPUTransferBuffer"),
            ReleaseGPUComputePipeline             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReleaseGPUComputePipeline"),
            ReleaseGPUShader                      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReleaseGPUShader"),
            ReleaseGPUGraphicsPipeline            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReleaseGPUGraphicsPipeline"),
            AcquireGPUCommandBuffer               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_AcquireGPUCommandBuffer"),
            PushGPUVertexUniformData              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_PushGPUVertexUniformData"),
            PushGPUFragmentUniformData            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_PushGPUFragmentUniformData"),
            PushGPUComputeUniformData             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_PushGPUComputeUniformData"),
            BeginGPURenderPass                    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_BeginGPURenderPass"),
            BindGPUGraphicsPipeline               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_BindGPUGraphicsPipeline"),
            SetGPUViewport                        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetGPUViewport"),
            SetGPUScissor                         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetGPUScissor"),
            SetGPUBlendConstants                  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetGPUBlendConstants"),
            SetGPUStencilReference                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetGPUStencilReference"),
            BindGPUVertexBuffers                  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_BindGPUVertexBuffers"),
            BindGPUIndexBuffer                    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_BindGPUIndexBuffer"),
            BindGPUVertexSamplers                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_BindGPUVertexSamplers"),
            BindGPUVertexStorageTextures          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_BindGPUVertexStorageTextures"),
            BindGPUVertexStorageBuffers           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_BindGPUVertexStorageBuffers"),
            BindGPUFragmentSamplers               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_BindGPUFragmentSamplers"),
            BindGPUFragmentStorageTextures        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_BindGPUFragmentStorageTextures"),
            BindGPUFragmentStorageBuffers         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_BindGPUFragmentStorageBuffers"),
            DrawGPUIndexedPrimitives              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_DrawGPUIndexedPrimitives"),
            DrawGPUPrimitives                     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_DrawGPUPrimitives"),
            DrawGPUPrimitivesIndirect             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_DrawGPUPrimitivesIndirect"),
            DrawGPUIndexedPrimitivesIndirect      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_DrawGPUIndexedPrimitivesIndirect"),
            EndGPURenderPass                      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_EndGPURenderPass"),
            BeginGPUComputePass                   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_BeginGPUComputePass"),
            BindGPUComputePipeline                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_BindGPUComputePipeline"),
            BindGPUComputeSamplers                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_BindGPUComputeSamplers"),
            BindGPUComputeStorageTextures         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_BindGPUComputeStorageTextures"),
            BindGPUComputeStorageBuffers          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_BindGPUComputeStorageBuffers"),
            DispatchGPUCompute                    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_DispatchGPUCompute"),
            DispatchGPUComputeIndirect            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_DispatchGPUComputeIndirect"),
            EndGPUComputePass                     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_EndGPUComputePass"),
            MapGPUTransferBuffer                  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_MapGPUTransferBuffer"),
            UnmapGPUTransferBuffer                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_UnmapGPUTransferBuffer"),
            BeginGPUCopyPass                      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_BeginGPUCopyPass"),
            UploadToGPUTexture                    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_UploadToGPUTexture"),
            UploadToGPUBuffer                     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_UploadToGPUBuffer"),
            CopyGPUTextureToTexture               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CopyGPUTextureToTexture"),
            CopyGPUBufferToBuffer                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CopyGPUBufferToBuffer"),
            DownloadFromGPUTexture                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_DownloadFromGPUTexture"),
            DownloadFromGPUBuffer                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_DownloadFromGPUBuffer"),
            EndGPUCopyPass                        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_EndGPUCopyPass"),
            GenerateMipmapsForGPUTexture          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GenerateMipmapsForGPUTexture"),
            BlitGPUTexture                        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_BlitGPUTexture"),
            WindowSupportsGPUSwapchainComposition = apiGetFunctionAddress(SDL.getLibrary(), "SDL_WindowSupportsGPUSwapchainComposition"),
            WindowSupportsGPUPresentMode          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_WindowSupportsGPUPresentMode"),
            ClaimWindowForGPUDevice               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ClaimWindowForGPUDevice"),
            ReleaseWindowFromGPUDevice            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReleaseWindowFromGPUDevice"),
            SetGPUSwapchainParameters             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetGPUSwapchainParameters"),
            SetGPUAllowedFramesInFlight           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetGPUAllowedFramesInFlight"),
            GetGPUSwapchainTextureFormat          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGPUSwapchainTextureFormat"),
            AcquireGPUSwapchainTexture            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_AcquireGPUSwapchainTexture"),
            WaitForGPUSwapchain                   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_WaitForGPUSwapchain"),
            WaitAndAcquireGPUSwapchainTexture     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_WaitAndAcquireGPUSwapchainTexture"),
            SubmitGPUCommandBuffer                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SubmitGPUCommandBuffer"),
            SubmitGPUCommandBufferAndAcquireFence = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SubmitGPUCommandBufferAndAcquireFence"),
            CancelGPUCommandBuffer                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CancelGPUCommandBuffer"),
            WaitForGPUIdle                        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_WaitForGPUIdle"),
            WaitForGPUFences                      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_WaitForGPUFences"),
            QueryGPUFence                         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_QueryGPUFence"),
            ReleaseGPUFence                       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReleaseGPUFence"),
            GPUTextureFormatTexelBlockSize        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GPUTextureFormatTexelBlockSize"),
            GPUTextureSupportsFormat              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GPUTextureSupportsFormat"),
            GPUTextureSupportsSampleCount         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GPUTextureSupportsSampleCount"),
            CalculateGPUTextureFormatSize         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CalculateGPUTextureFormatSize"),
            GetPixelFormatFromGPUTextureFormat    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetPixelFormatFromGPUTextureFormat"),
            GetGPUTextureFormatFromPixelFormat    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGPUTextureFormatFromPixelFormat");

    }

    public static final int
        SDL_GPU_PRIMITIVETYPE_TRIANGLELIST  = 0,
        SDL_GPU_PRIMITIVETYPE_TRIANGLESTRIP = 1,
        SDL_GPU_PRIMITIVETYPE_LINELIST      = 2,
        SDL_GPU_PRIMITIVETYPE_LINESTRIP     = 3,
        SDL_GPU_PRIMITIVETYPE_POINTLIST     = 4;

    public static final int
        SDL_GPU_LOADOP_LOAD      = 0,
        SDL_GPU_LOADOP_CLEAR     = 1,
        SDL_GPU_LOADOP_DONT_CARE = 2;

    public static final int
        SDL_GPU_STOREOP_STORE             = 0,
        SDL_GPU_STOREOP_DONT_CARE         = 1,
        SDL_GPU_STOREOP_RESOLVE           = 2,
        SDL_GPU_STOREOP_RESOLVE_AND_STORE = 3;

    public static final int
        SDL_GPU_INDEXELEMENTSIZE_16BIT = 0,
        SDL_GPU_INDEXELEMENTSIZE_32BIT = 1;

    public static final int
        SDL_GPU_TEXTUREFORMAT_INVALID               = 0,
        SDL_GPU_TEXTUREFORMAT_A8_UNORM              = 1,
        SDL_GPU_TEXTUREFORMAT_R8_UNORM              = 2,
        SDL_GPU_TEXTUREFORMAT_R8G8_UNORM            = 3,
        SDL_GPU_TEXTUREFORMAT_R8G8B8A8_UNORM        = 4,
        SDL_GPU_TEXTUREFORMAT_R16_UNORM             = 5,
        SDL_GPU_TEXTUREFORMAT_R16G16_UNORM          = 6,
        SDL_GPU_TEXTUREFORMAT_R16G16B16A16_UNORM    = 7,
        SDL_GPU_TEXTUREFORMAT_R10G10B10A2_UNORM     = 8,
        SDL_GPU_TEXTUREFORMAT_B5G6R5_UNORM          = 9,
        SDL_GPU_TEXTUREFORMAT_B5G5R5A1_UNORM        = 10,
        SDL_GPU_TEXTUREFORMAT_B4G4R4A4_UNORM        = 11,
        SDL_GPU_TEXTUREFORMAT_B8G8R8A8_UNORM        = 12,
        SDL_GPU_TEXTUREFORMAT_BC1_RGBA_UNORM        = 13,
        SDL_GPU_TEXTUREFORMAT_BC2_RGBA_UNORM        = 14,
        SDL_GPU_TEXTUREFORMAT_BC3_RGBA_UNORM        = 15,
        SDL_GPU_TEXTUREFORMAT_BC4_R_UNORM           = 16,
        SDL_GPU_TEXTUREFORMAT_BC5_RG_UNORM          = 17,
        SDL_GPU_TEXTUREFORMAT_BC7_RGBA_UNORM        = 18,
        SDL_GPU_TEXTUREFORMAT_BC6H_RGB_FLOAT        = 19,
        SDL_GPU_TEXTUREFORMAT_BC6H_RGB_UFLOAT       = 20,
        SDL_GPU_TEXTUREFORMAT_R8_SNORM              = 21,
        SDL_GPU_TEXTUREFORMAT_R8G8_SNORM            = 22,
        SDL_GPU_TEXTUREFORMAT_R8G8B8A8_SNORM        = 23,
        SDL_GPU_TEXTUREFORMAT_R16_SNORM             = 24,
        SDL_GPU_TEXTUREFORMAT_R16G16_SNORM          = 25,
        SDL_GPU_TEXTUREFORMAT_R16G16B16A16_SNORM    = 26,
        SDL_GPU_TEXTUREFORMAT_R16_FLOAT             = 27,
        SDL_GPU_TEXTUREFORMAT_R16G16_FLOAT          = 28,
        SDL_GPU_TEXTUREFORMAT_R16G16B16A16_FLOAT    = 29,
        SDL_GPU_TEXTUREFORMAT_R32_FLOAT             = 30,
        SDL_GPU_TEXTUREFORMAT_R32G32_FLOAT          = 31,
        SDL_GPU_TEXTUREFORMAT_R32G32B32A32_FLOAT    = 32,
        SDL_GPU_TEXTUREFORMAT_R11G11B10_UFLOAT      = 33,
        SDL_GPU_TEXTUREFORMAT_R8_UINT               = 34,
        SDL_GPU_TEXTUREFORMAT_R8G8_UINT             = 35,
        SDL_GPU_TEXTUREFORMAT_R8G8B8A8_UINT         = 36,
        SDL_GPU_TEXTUREFORMAT_R16_UINT              = 37,
        SDL_GPU_TEXTUREFORMAT_R16G16_UINT           = 38,
        SDL_GPU_TEXTUREFORMAT_R16G16B16A16_UINT     = 39,
        SDL_GPU_TEXTUREFORMAT_R32_UINT              = 40,
        SDL_GPU_TEXTUREFORMAT_R32G32_UINT           = 41,
        SDL_GPU_TEXTUREFORMAT_R32G32B32A32_UINT     = 42,
        SDL_GPU_TEXTUREFORMAT_R8_INT                = 43,
        SDL_GPU_TEXTUREFORMAT_R8G8_INT              = 44,
        SDL_GPU_TEXTUREFORMAT_R8G8B8A8_INT          = 45,
        SDL_GPU_TEXTUREFORMAT_R16_INT               = 46,
        SDL_GPU_TEXTUREFORMAT_R16G16_INT            = 47,
        SDL_GPU_TEXTUREFORMAT_R16G16B16A16_INT      = 48,
        SDL_GPU_TEXTUREFORMAT_R32_INT               = 49,
        SDL_GPU_TEXTUREFORMAT_R32G32_INT            = 50,
        SDL_GPU_TEXTUREFORMAT_R32G32B32A32_INT      = 51,
        SDL_GPU_TEXTUREFORMAT_R8G8B8A8_UNORM_SRGB   = 52,
        SDL_GPU_TEXTUREFORMAT_B8G8R8A8_UNORM_SRGB   = 53,
        SDL_GPU_TEXTUREFORMAT_BC1_RGBA_UNORM_SRGB   = 54,
        SDL_GPU_TEXTUREFORMAT_BC2_RGBA_UNORM_SRGB   = 55,
        SDL_GPU_TEXTUREFORMAT_BC3_RGBA_UNORM_SRGB   = 56,
        SDL_GPU_TEXTUREFORMAT_BC7_RGBA_UNORM_SRGB   = 57,
        SDL_GPU_TEXTUREFORMAT_D16_UNORM             = 58,
        SDL_GPU_TEXTUREFORMAT_D24_UNORM             = 59,
        SDL_GPU_TEXTUREFORMAT_D32_FLOAT             = 60,
        SDL_GPU_TEXTUREFORMAT_D24_UNORM_S8_UINT     = 61,
        SDL_GPU_TEXTUREFORMAT_D32_FLOAT_S8_UINT     = 62,
        SDL_GPU_TEXTUREFORMAT_ASTC_4x4_UNORM        = 63,
        SDL_GPU_TEXTUREFORMAT_ASTC_5x4_UNORM        = 64,
        SDL_GPU_TEXTUREFORMAT_ASTC_5x5_UNORM        = 65,
        SDL_GPU_TEXTUREFORMAT_ASTC_6x5_UNORM        = 66,
        SDL_GPU_TEXTUREFORMAT_ASTC_6x6_UNORM        = 67,
        SDL_GPU_TEXTUREFORMAT_ASTC_8x5_UNORM        = 68,
        SDL_GPU_TEXTUREFORMAT_ASTC_8x6_UNORM        = 69,
        SDL_GPU_TEXTUREFORMAT_ASTC_8x8_UNORM        = 70,
        SDL_GPU_TEXTUREFORMAT_ASTC_10x5_UNORM       = 71,
        SDL_GPU_TEXTUREFORMAT_ASTC_10x6_UNORM       = 72,
        SDL_GPU_TEXTUREFORMAT_ASTC_10x8_UNORM       = 73,
        SDL_GPU_TEXTUREFORMAT_ASTC_10x10_UNORM      = 74,
        SDL_GPU_TEXTUREFORMAT_ASTC_12x10_UNORM      = 75,
        SDL_GPU_TEXTUREFORMAT_ASTC_12x12_UNORM      = 76,
        SDL_GPU_TEXTUREFORMAT_ASTC_4x4_UNORM_SRGB   = 77,
        SDL_GPU_TEXTUREFORMAT_ASTC_5x4_UNORM_SRGB   = 78,
        SDL_GPU_TEXTUREFORMAT_ASTC_5x5_UNORM_SRGB   = 79,
        SDL_GPU_TEXTUREFORMAT_ASTC_6x5_UNORM_SRGB   = 80,
        SDL_GPU_TEXTUREFORMAT_ASTC_6x6_UNORM_SRGB   = 81,
        SDL_GPU_TEXTUREFORMAT_ASTC_8x5_UNORM_SRGB   = 82,
        SDL_GPU_TEXTUREFORMAT_ASTC_8x6_UNORM_SRGB   = 83,
        SDL_GPU_TEXTUREFORMAT_ASTC_8x8_UNORM_SRGB   = 84,
        SDL_GPU_TEXTUREFORMAT_ASTC_10x5_UNORM_SRGB  = 85,
        SDL_GPU_TEXTUREFORMAT_ASTC_10x6_UNORM_SRGB  = 86,
        SDL_GPU_TEXTUREFORMAT_ASTC_10x8_UNORM_SRGB  = 87,
        SDL_GPU_TEXTUREFORMAT_ASTC_10x10_UNORM_SRGB = 88,
        SDL_GPU_TEXTUREFORMAT_ASTC_12x10_UNORM_SRGB = 89,
        SDL_GPU_TEXTUREFORMAT_ASTC_12x12_UNORM_SRGB = 90,
        SDL_GPU_TEXTUREFORMAT_ASTC_4x4_FLOAT        = 91,
        SDL_GPU_TEXTUREFORMAT_ASTC_5x4_FLOAT        = 92,
        SDL_GPU_TEXTUREFORMAT_ASTC_5x5_FLOAT        = 93,
        SDL_GPU_TEXTUREFORMAT_ASTC_6x5_FLOAT        = 94,
        SDL_GPU_TEXTUREFORMAT_ASTC_6x6_FLOAT        = 95,
        SDL_GPU_TEXTUREFORMAT_ASTC_8x5_FLOAT        = 96,
        SDL_GPU_TEXTUREFORMAT_ASTC_8x6_FLOAT        = 97,
        SDL_GPU_TEXTUREFORMAT_ASTC_8x8_FLOAT        = 98,
        SDL_GPU_TEXTUREFORMAT_ASTC_10x5_FLOAT       = 99,
        SDL_GPU_TEXTUREFORMAT_ASTC_10x6_FLOAT       = 100,
        SDL_GPU_TEXTUREFORMAT_ASTC_10x8_FLOAT       = 101,
        SDL_GPU_TEXTUREFORMAT_ASTC_10x10_FLOAT      = 102,
        SDL_GPU_TEXTUREFORMAT_ASTC_12x10_FLOAT      = 103,
        SDL_GPU_TEXTUREFORMAT_ASTC_12x12_FLOAT      = 104;

    public static final int
        SDL_GPU_TEXTUREUSAGE_SAMPLER                                 = (1 << 0),
        SDL_GPU_TEXTUREUSAGE_COLOR_TARGET                            = (1 << 1),
        SDL_GPU_TEXTUREUSAGE_DEPTH_STENCIL_TARGET                    = (1 << 2),
        SDL_GPU_TEXTUREUSAGE_GRAPHICS_STORAGE_READ                   = (1 << 3),
        SDL_GPU_TEXTUREUSAGE_COMPUTE_STORAGE_READ                    = (1 << 4),
        SDL_GPU_TEXTUREUSAGE_COMPUTE_STORAGE_WRITE                   = (1 << 5),
        SDL_GPU_TEXTUREUSAGE_COMPUTE_STORAGE_SIMULTANEOUS_READ_WRITE = (1 << 6);

    public static final int
        SDL_GPU_TEXTURETYPE_2D         = 0,
        SDL_GPU_TEXTURETYPE_2D_ARRAY   = 1,
        SDL_GPU_TEXTURETYPE_3D         = 2,
        SDL_GPU_TEXTURETYPE_CUBE       = 3,
        SDL_GPU_TEXTURETYPE_CUBE_ARRAY = 4;

    public static final int
        SDL_GPU_SAMPLECOUNT_1 = 0,
        SDL_GPU_SAMPLECOUNT_2 = 1,
        SDL_GPU_SAMPLECOUNT_4 = 2,
        SDL_GPU_SAMPLECOUNT_8 = 3;

    public static final int
        SDL_GPU_CUBEMAPFACE_POSITIVEX = 0,
        SDL_GPU_CUBEMAPFACE_NEGATIVEX = 1,
        SDL_GPU_CUBEMAPFACE_POSITIVEY = 2,
        SDL_GPU_CUBEMAPFACE_NEGATIVEY = 3,
        SDL_GPU_CUBEMAPFACE_POSITIVEZ = 4,
        SDL_GPU_CUBEMAPFACE_NEGATIVEZ = 5;

    public static final int
        SDL_GPU_BUFFERUSAGE_VERTEX                = (1 << 0),
        SDL_GPU_BUFFERUSAGE_INDEX                 = (1 << 1),
        SDL_GPU_BUFFERUSAGE_INDIRECT              = (1 << 2),
        SDL_GPU_BUFFERUSAGE_GRAPHICS_STORAGE_READ = (1 << 3),
        SDL_GPU_BUFFERUSAGE_COMPUTE_STORAGE_READ  = (1 << 4),
        SDL_GPU_BUFFERUSAGE_COMPUTE_STORAGE_WRITE = (1 << 5);

    public static final int
        SDL_GPU_TRANSFERBUFFERUSAGE_UPLOAD   = 0,
        SDL_GPU_TRANSFERBUFFERUSAGE_DOWNLOAD = 1;

    public static final int
        SDL_GPU_SHADERSTAGE_VERTEX   = 0,
        SDL_GPU_SHADERSTAGE_FRAGMENT = 1;

    public static final int
        SDL_GPU_SHADERFORMAT_INVALID  = 0,
        SDL_GPU_SHADERFORMAT_PRIVATE  = (1 << 0),
        SDL_GPU_SHADERFORMAT_SPIRV    = (1 << 1),
        SDL_GPU_SHADERFORMAT_DXBC     = (1 << 2),
        SDL_GPU_SHADERFORMAT_DXIL     = (1 << 3),
        SDL_GPU_SHADERFORMAT_MSL      = (1 << 4),
        SDL_GPU_SHADERFORMAT_METALLIB = (1 << 5);

    public static final int
        SDL_GPU_VERTEXELEMENTFORMAT_INVALID      = 0,
        SDL_GPU_VERTEXELEMENTFORMAT_INT          = 1,
        SDL_GPU_VERTEXELEMENTFORMAT_INT2         = 2,
        SDL_GPU_VERTEXELEMENTFORMAT_INT3         = 3,
        SDL_GPU_VERTEXELEMENTFORMAT_INT4         = 4,
        SDL_GPU_VERTEXELEMENTFORMAT_UINT         = 5,
        SDL_GPU_VERTEXELEMENTFORMAT_UINT2        = 6,
        SDL_GPU_VERTEXELEMENTFORMAT_UINT3        = 7,
        SDL_GPU_VERTEXELEMENTFORMAT_UINT4        = 8,
        SDL_GPU_VERTEXELEMENTFORMAT_FLOAT        = 9,
        SDL_GPU_VERTEXELEMENTFORMAT_FLOAT2       = 10,
        SDL_GPU_VERTEXELEMENTFORMAT_FLOAT3       = 11,
        SDL_GPU_VERTEXELEMENTFORMAT_FLOAT4       = 12,
        SDL_GPU_VERTEXELEMENTFORMAT_BYTE2        = 13,
        SDL_GPU_VERTEXELEMENTFORMAT_BYTE4        = 14,
        SDL_GPU_VERTEXELEMENTFORMAT_UBYTE2       = 15,
        SDL_GPU_VERTEXELEMENTFORMAT_UBYTE4       = 16,
        SDL_GPU_VERTEXELEMENTFORMAT_BYTE2_NORM   = 17,
        SDL_GPU_VERTEXELEMENTFORMAT_BYTE4_NORM   = 18,
        SDL_GPU_VERTEXELEMENTFORMAT_UBYTE2_NORM  = 19,
        SDL_GPU_VERTEXELEMENTFORMAT_UBYTE4_NORM  = 20,
        SDL_GPU_VERTEXELEMENTFORMAT_SHORT2       = 21,
        SDL_GPU_VERTEXELEMENTFORMAT_SHORT4       = 22,
        SDL_GPU_VERTEXELEMENTFORMAT_USHORT2      = 23,
        SDL_GPU_VERTEXELEMENTFORMAT_USHORT4      = 24,
        SDL_GPU_VERTEXELEMENTFORMAT_SHORT2_NORM  = 25,
        SDL_GPU_VERTEXELEMENTFORMAT_SHORT4_NORM  = 26,
        SDL_GPU_VERTEXELEMENTFORMAT_USHORT2_NORM = 27,
        SDL_GPU_VERTEXELEMENTFORMAT_USHORT4_NORM = 28,
        SDL_GPU_VERTEXELEMENTFORMAT_HALF2        = 29,
        SDL_GPU_VERTEXELEMENTFORMAT_HALF4        = 30;

    public static final int
        SDL_GPU_VERTEXINPUTRATE_VERTEX   = 0,
        SDL_GPU_VERTEXINPUTRATE_INSTANCE = 1;

    public static final int
        SDL_GPU_FILLMODE_FILL = 0,
        SDL_GPU_FILLMODE_LINE = 1;

    public static final int
        SDL_GPU_CULLMODE_NONE  = 0,
        SDL_GPU_CULLMODE_FRONT = 1,
        SDL_GPU_CULLMODE_BACK  = 2;

    public static final int
        SDL_GPU_FRONTFACE_COUNTER_CLOCKWISE = 0,
        SDL_GPU_FRONTFACE_CLOCKWISE         = 1;

    public static final int
        SDL_GPU_COMPAREOP_INVALID          = 0,
        SDL_GPU_COMPAREOP_NEVER            = 1,
        SDL_GPU_COMPAREOP_LESS             = 2,
        SDL_GPU_COMPAREOP_EQUAL            = 3,
        SDL_GPU_COMPAREOP_LESS_OR_EQUAL    = 4,
        SDL_GPU_COMPAREOP_GREATER          = 5,
        SDL_GPU_COMPAREOP_NOT_EQUAL        = 6,
        SDL_GPU_COMPAREOP_GREATER_OR_EQUAL = 7,
        SDL_GPU_COMPAREOP_ALWAYS           = 8;

    public static final int
        SDL_GPU_STENCILOP_INVALID             = 0,
        SDL_GPU_STENCILOP_KEEP                = 1,
        SDL_GPU_STENCILOP_ZERO                = 2,
        SDL_GPU_STENCILOP_REPLACE             = 3,
        SDL_GPU_STENCILOP_INCREMENT_AND_CLAMP = 4,
        SDL_GPU_STENCILOP_DECREMENT_AND_CLAMP = 5,
        SDL_GPU_STENCILOP_INVERT              = 6,
        SDL_GPU_STENCILOP_INCREMENT_AND_WRAP  = 7,
        SDL_GPU_STENCILOP_DECREMENT_AND_WRAP  = 8;

    public static final int
        SDL_GPU_BLENDOP_INVALID          = 0,
        SDL_GPU_BLENDOP_ADD              = 1,
        SDL_GPU_BLENDOP_SUBTRACT         = 2,
        SDL_GPU_BLENDOP_REVERSE_SUBTRACT = 3,
        SDL_GPU_BLENDOP_MIN              = 4,
        SDL_GPU_BLENDOP_MAX              = 5;

    public static final int
        SDL_GPU_BLENDFACTOR_INVALID                  = 0,
        SDL_GPU_BLENDFACTOR_ZERO                     = 1,
        SDL_GPU_BLENDFACTOR_ONE                      = 2,
        SDL_GPU_BLENDFACTOR_SRC_COLOR                = 3,
        SDL_GPU_BLENDFACTOR_ONE_MINUS_SRC_COLOR      = 4,
        SDL_GPU_BLENDFACTOR_DST_COLOR                = 5,
        SDL_GPU_BLENDFACTOR_ONE_MINUS_DST_COLOR      = 6,
        SDL_GPU_BLENDFACTOR_SRC_ALPHA                = 7,
        SDL_GPU_BLENDFACTOR_ONE_MINUS_SRC_ALPHA      = 8,
        SDL_GPU_BLENDFACTOR_DST_ALPHA                = 9,
        SDL_GPU_BLENDFACTOR_ONE_MINUS_DST_ALPHA      = 10,
        SDL_GPU_BLENDFACTOR_CONSTANT_COLOR           = 11,
        SDL_GPU_BLENDFACTOR_ONE_MINUS_CONSTANT_COLOR = 12,
        SDL_GPU_BLENDFACTOR_SRC_ALPHA_SATURATE       = 13;

    public static final int
        SDL_GPU_COLORCOMPONENT_R = (1 << 0),
        SDL_GPU_COLORCOMPONENT_G = (1 << 1),
        SDL_GPU_COLORCOMPONENT_B = (1 << 2),
        SDL_GPU_COLORCOMPONENT_A = (1 << 3);

    public static final int
        SDL_GPU_FILTER_NEAREST = 0,
        SDL_GPU_FILTER_LINEAR  = 1;

    public static final int
        SDL_GPU_SAMPLERMIPMAPMODE_NEAREST = 0,
        SDL_GPU_SAMPLERMIPMAPMODE_LINEAR  = 1;

    public static final int
        SDL_GPU_SAMPLERADDRESSMODE_REPEAT          = 0,
        SDL_GPU_SAMPLERADDRESSMODE_MIRRORED_REPEAT = 1,
        SDL_GPU_SAMPLERADDRESSMODE_CLAMP_TO_EDGE   = 2;

    public static final int
        SDL_GPU_PRESENTMODE_VSYNC     = 0,
        SDL_GPU_PRESENTMODE_IMMEDIATE = 1,
        SDL_GPU_PRESENTMODE_MAILBOX   = 2;

    public static final int
        SDL_GPU_SWAPCHAINCOMPOSITION_SDR                 = 0,
        SDL_GPU_SWAPCHAINCOMPOSITION_SDR_LINEAR          = 1,
        SDL_GPU_SWAPCHAINCOMPOSITION_HDR_EXTENDED_LINEAR = 2,
        SDL_GPU_SWAPCHAINCOMPOSITION_HDR10_ST2084        = 3;

    public static final String
        SDL_PROP_GPU_DEVICE_CREATE_DEBUGMODE_BOOLEAN                            = "SDL.gpu.device.create.debugmode",
        SDL_PROP_GPU_DEVICE_CREATE_PREFERLOWPOWER_BOOLEAN                       = "SDL.gpu.device.create.preferlowpower",
        SDL_PROP_GPU_DEVICE_CREATE_VERBOSE_BOOLEAN                              = "SDL.gpu.device.create.verbose",
        SDL_PROP_GPU_DEVICE_CREATE_NAME_STRING                                  = "SDL.gpu.device.create.name",
        SDL_PROP_GPU_DEVICE_CREATE_FEATURE_CLIP_DISTANCE_BOOLEAN                = "SDL.gpu.device.create.feature.clip_distance",
        SDL_PROP_GPU_DEVICE_CREATE_FEATURE_DEPTH_CLAMPING_BOOLEAN               = "SDL.gpu.device.create.feature.depth_clamping",
        SDL_PROP_GPU_DEVICE_CREATE_FEATURE_INDIRECT_DRAW_FIRST_INSTANCE_BOOLEAN = "SDL.gpu.device.create.feature.indirect_draw_first_instance",
        SDL_PROP_GPU_DEVICE_CREATE_FEATURE_ANISOTROPY_BOOLEAN                   = "SDL.gpu.device.create.feature.anisotropy",
        SDL_PROP_GPU_DEVICE_CREATE_SHADERS_PRIVATE_BOOLEAN                      = "SDL.gpu.device.create.shaders.private",
        SDL_PROP_GPU_DEVICE_CREATE_SHADERS_SPIRV_BOOLEAN                        = "SDL.gpu.device.create.shaders.spirv",
        SDL_PROP_GPU_DEVICE_CREATE_SHADERS_DXBC_BOOLEAN                         = "SDL.gpu.device.create.shaders.dxbc",
        SDL_PROP_GPU_DEVICE_CREATE_SHADERS_DXIL_BOOLEAN                         = "SDL.gpu.device.create.shaders.dxil",
        SDL_PROP_GPU_DEVICE_CREATE_SHADERS_MSL_BOOLEAN                          = "SDL.gpu.device.create.shaders.msl",
        SDL_PROP_GPU_DEVICE_CREATE_SHADERS_METALLIB_BOOLEAN                     = "SDL.gpu.device.create.shaders.metallib",
        SDL_PROP_GPU_DEVICE_CREATE_D3D12_ALLOW_FEWER_RESOURCE_SLOTS_BOOLEAN     = "SDL.gpu.device.create.d3d12.allowtier1resourcebinding",
        SDL_PROP_GPU_DEVICE_CREATE_D3D12_SEMANTIC_NAME_STRING                   = "SDL.gpu.device.create.d3d12.semantic",
        SDL_PROP_GPU_DEVICE_CREATE_D3D12_AGILITY_SDK_VERSION_NUMBER             = "SDL.gpu.device.create.d3d12.agility_sdk_version",
        SDL_PROP_GPU_DEVICE_CREATE_D3D12_AGILITY_SDK_PATH_STRING                = "SDL.gpu.device.create.d3d12.agility_sdk_path",
        SDL_PROP_GPU_DEVICE_CREATE_VULKAN_REQUIRE_HARDWARE_ACCELERATION_BOOLEAN = "SDL.gpu.device.create.vulkan.requirehardwareacceleration",
        SDL_PROP_GPU_DEVICE_CREATE_VULKAN_OPTIONS_POINTER                       = "SDL.gpu.device.create.vulkan.options",
        SDL_PROP_GPU_DEVICE_CREATE_METAL_ALLOW_MACFAMILY1_BOOLEAN               = "SDL.gpu.device.create.metal.allowmacfamily1";

    public static final String
        SDL_PROP_GPU_TEXTURE_CREATE_D3D12_CLEAR_R_FLOAT        = "SDL.gpu.texture.create.d3d12.clear.r",
        SDL_PROP_GPU_TEXTURE_CREATE_D3D12_CLEAR_G_FLOAT        = "SDL.gpu.texture.create.d3d12.clear.g",
        SDL_PROP_GPU_TEXTURE_CREATE_D3D12_CLEAR_B_FLOAT        = "SDL.gpu.texture.create.d3d12.clear.b",
        SDL_PROP_GPU_TEXTURE_CREATE_D3D12_CLEAR_A_FLOAT        = "SDL.gpu.texture.create.d3d12.clear.a",
        SDL_PROP_GPU_TEXTURE_CREATE_D3D12_CLEAR_DEPTH_FLOAT    = "SDL.gpu.texture.create.d3d12.clear.depth",
        SDL_PROP_GPU_TEXTURE_CREATE_D3D12_CLEAR_STENCIL_NUMBER = "SDL.gpu.texture.create.d3d12.clear.stencil";

    public static final String
        SDL_PROP_GPU_DEVICE_NAME_STRING           = "SDL.gpu.device.name",
        SDL_PROP_GPU_DEVICE_DRIVER_NAME_STRING    = "SDL.gpu.device.driver_name",
        SDL_PROP_GPU_DEVICE_DRIVER_VERSION_STRING = "SDL.gpu.device.driver_version",
        SDL_PROP_GPU_DEVICE_DRIVER_INFO_STRING    = "SDL.gpu.device.driver_info";

    public static final String
        SDL_PROP_GPU_COMPUTEPIPELINE_CREATE_NAME_STRING  = "SDL.gpu.computepipeline.create.name",
        SDL_PROP_GPU_GRAPHICSPIPELINE_CREATE_NAME_STRING = "SDL.gpu.graphicspipeline.create.name",
        SDL_PROP_GPU_SAMPLER_CREATE_NAME_STRING          = "SDL.gpu.sampler.create.name",
        SDL_PROP_GPU_SHADER_CREATE_NAME_STRING           = "SDL.gpu.shader.create.name",
        SDL_PROP_GPU_TEXTURE_CREATE_NAME_STRING          = "SDL.gpu.texture.create.name",
        SDL_PROP_GPU_BUFFER_CREATE_NAME_STRING           = "SDL.gpu.buffer.create.name",
        SDL_PROP_GPU_TRANSFERBUFFER_CREATE_NAME_STRING   = "SDL.gpu.transferbuffer.create.name";

    protected SDLGPU() {
        throw new UnsupportedOperationException();
    }

    // --- [ SDL_GPUSupportsShaderFormats ] ---

    /** {@code bool SDL_GPUSupportsShaderFormats(SDL_GPUShaderFormat format_flags, char const * name)} */
    public static boolean nSDL_GPUSupportsShaderFormats(int format_flags, long name) {
        long __functionAddress = Functions.GPUSupportsShaderFormats;
        return invokePZ(format_flags, name, __functionAddress);
    }

    /** {@code bool SDL_GPUSupportsShaderFormats(SDL_GPUShaderFormat format_flags, char const * name)} */
    @NativeType("bool")
    public static boolean SDL_GPUSupportsShaderFormats(@NativeType("SDL_GPUShaderFormat") int format_flags, @NativeType("char const *") @Nullable ByteBuffer name) {
        if (CHECKS) {
            checkNT1Safe(name);
        }
        return nSDL_GPUSupportsShaderFormats(format_flags, memAddressSafe(name));
    }

    /** {@code bool SDL_GPUSupportsShaderFormats(SDL_GPUShaderFormat format_flags, char const * name)} */
    @NativeType("bool")
    public static boolean SDL_GPUSupportsShaderFormats(@NativeType("SDL_GPUShaderFormat") int format_flags, @NativeType("char const *") @Nullable CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(name, true);
            long nameEncoded = name == null ? NULL : stack.getPointerAddress();
            return nSDL_GPUSupportsShaderFormats(format_flags, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GPUSupportsProperties ] ---

    /** {@code bool SDL_GPUSupportsProperties(SDL_PropertiesID props)} */
    @NativeType("bool")
    public static boolean SDL_GPUSupportsProperties(@NativeType("SDL_PropertiesID") int props) {
        long __functionAddress = Functions.GPUSupportsProperties;
        return invokeZ(props, __functionAddress);
    }

    // --- [ SDL_CreateGPUDevice ] ---

    /** {@code SDL_GPUDevice * SDL_CreateGPUDevice(SDL_GPUShaderFormat format_flags, bool debug_mode, char const * name)} */
    public static long nSDL_CreateGPUDevice(int format_flags, boolean debug_mode, long name) {
        long __functionAddress = Functions.CreateGPUDevice;
        return invokePP(format_flags, debug_mode, name, __functionAddress);
    }

    /** {@code SDL_GPUDevice * SDL_CreateGPUDevice(SDL_GPUShaderFormat format_flags, bool debug_mode, char const * name)} */
    @NativeType("SDL_GPUDevice *")
    public static long SDL_CreateGPUDevice(@NativeType("SDL_GPUShaderFormat") int format_flags, @NativeType("bool") boolean debug_mode, @NativeType("char const *") @Nullable ByteBuffer name) {
        if (CHECKS) {
            checkNT1Safe(name);
        }
        return nSDL_CreateGPUDevice(format_flags, debug_mode, memAddressSafe(name));
    }

    /** {@code SDL_GPUDevice * SDL_CreateGPUDevice(SDL_GPUShaderFormat format_flags, bool debug_mode, char const * name)} */
    @NativeType("SDL_GPUDevice *")
    public static long SDL_CreateGPUDevice(@NativeType("SDL_GPUShaderFormat") int format_flags, @NativeType("bool") boolean debug_mode, @NativeType("char const *") @Nullable CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(name, true);
            long nameEncoded = name == null ? NULL : stack.getPointerAddress();
            return nSDL_CreateGPUDevice(format_flags, debug_mode, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_CreateGPUDeviceWithProperties ] ---

    /** {@code SDL_GPUDevice * SDL_CreateGPUDeviceWithProperties(SDL_PropertiesID props)} */
    @NativeType("SDL_GPUDevice *")
    public static long SDL_CreateGPUDeviceWithProperties(@NativeType("SDL_PropertiesID") int props) {
        long __functionAddress = Functions.CreateGPUDeviceWithProperties;
        return invokeP(props, __functionAddress);
    }

    // --- [ SDL_DestroyGPUDevice ] ---

    /** {@code void SDL_DestroyGPUDevice(SDL_GPUDevice * device)} */
    public static void SDL_DestroyGPUDevice(@NativeType("SDL_GPUDevice *") long device) {
        long __functionAddress = Functions.DestroyGPUDevice;
        if (CHECKS) {
            check(device);
        }
        invokePV(device, __functionAddress);
    }

    // --- [ SDL_GetNumGPUDrivers ] ---

    /** {@code int SDL_GetNumGPUDrivers(void)} */
    public static int SDL_GetNumGPUDrivers() {
        long __functionAddress = Functions.GetNumGPUDrivers;
        return invokeI(__functionAddress);
    }

    // --- [ SDL_GetGPUDriver ] ---

    /** {@code char const * SDL_GetGPUDriver(int index)} */
    public static long nSDL_GetGPUDriver(int index) {
        long __functionAddress = Functions.GetGPUDriver;
        return invokeP(index, __functionAddress);
    }

    /** {@code char const * SDL_GetGPUDriver(int index)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetGPUDriver(int index) {
        long __result = nSDL_GetGPUDriver(index);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetGPUDeviceDriver ] ---

    /** {@code char const * SDL_GetGPUDeviceDriver(SDL_GPUDevice * device)} */
    public static long nSDL_GetGPUDeviceDriver(long device) {
        long __functionAddress = Functions.GetGPUDeviceDriver;
        if (CHECKS) {
            check(device);
        }
        return invokePP(device, __functionAddress);
    }

    /** {@code char const * SDL_GetGPUDeviceDriver(SDL_GPUDevice * device)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetGPUDeviceDriver(@NativeType("SDL_GPUDevice *") long device) {
        long __result = nSDL_GetGPUDeviceDriver(device);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetGPUShaderFormats ] ---

    /** {@code SDL_GPUShaderFormat SDL_GetGPUShaderFormats(SDL_GPUDevice * device)} */
    @NativeType("SDL_GPUShaderFormat")
    public static int SDL_GetGPUShaderFormats(@NativeType("SDL_GPUDevice *") long device) {
        long __functionAddress = Functions.GetGPUShaderFormats;
        if (CHECKS) {
            check(device);
        }
        return invokePI(device, __functionAddress);
    }

    // --- [ SDL_GetGPUDeviceProperties ] ---

    /** {@code SDL_PropertiesID SDL_GetGPUDeviceProperties(SDL_GPUDevice * device)} */
    @NativeType("SDL_PropertiesID")
    public static int SDL_GetGPUDeviceProperties(@NativeType("SDL_GPUDevice *") long device) {
        long __functionAddress = Functions.GetGPUDeviceProperties;
        if (CHECKS) {
            check(device);
        }
        return invokePI(device, __functionAddress);
    }

    // --- [ SDL_CreateGPUComputePipeline ] ---

    /** {@code SDL_GPUComputePipeline * SDL_CreateGPUComputePipeline(SDL_GPUDevice * device, SDL_GPUComputePipelineCreateInfo const * createinfo)} */
    public static long nSDL_CreateGPUComputePipeline(long device, long createinfo) {
        long __functionAddress = Functions.CreateGPUComputePipeline;
        if (CHECKS) {
            check(device);
            SDL_GPUComputePipelineCreateInfo.validate(createinfo);
        }
        return invokePPP(device, createinfo, __functionAddress);
    }

    /** {@code SDL_GPUComputePipeline * SDL_CreateGPUComputePipeline(SDL_GPUDevice * device, SDL_GPUComputePipelineCreateInfo const * createinfo)} */
    @NativeType("SDL_GPUComputePipeline *")
    public static long SDL_CreateGPUComputePipeline(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUComputePipelineCreateInfo const *") SDL_GPUComputePipelineCreateInfo createinfo) {
        return nSDL_CreateGPUComputePipeline(device, createinfo.address());
    }

    // --- [ SDL_CreateGPUGraphicsPipeline ] ---

    /** {@code SDL_GPUGraphicsPipeline * SDL_CreateGPUGraphicsPipeline(SDL_GPUDevice * device, SDL_GPUGraphicsPipelineCreateInfo const * createinfo)} */
    public static long nSDL_CreateGPUGraphicsPipeline(long device, long createinfo) {
        long __functionAddress = Functions.CreateGPUGraphicsPipeline;
        if (CHECKS) {
            check(device);
        }
        return invokePPP(device, createinfo, __functionAddress);
    }

    /** {@code SDL_GPUGraphicsPipeline * SDL_CreateGPUGraphicsPipeline(SDL_GPUDevice * device, SDL_GPUGraphicsPipelineCreateInfo const * createinfo)} */
    @NativeType("SDL_GPUGraphicsPipeline *")
    public static long SDL_CreateGPUGraphicsPipeline(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUGraphicsPipelineCreateInfo const *") SDL_GPUGraphicsPipelineCreateInfo createinfo) {
        return nSDL_CreateGPUGraphicsPipeline(device, createinfo.address());
    }

    // --- [ SDL_CreateGPUSampler ] ---

    /** {@code SDL_GPUSampler * SDL_CreateGPUSampler(SDL_GPUDevice * device, SDL_GPUSamplerCreateInfo const * createinfo)} */
    public static long nSDL_CreateGPUSampler(long device, long createinfo) {
        long __functionAddress = Functions.CreateGPUSampler;
        if (CHECKS) {
            check(device);
        }
        return invokePPP(device, createinfo, __functionAddress);
    }

    /** {@code SDL_GPUSampler * SDL_CreateGPUSampler(SDL_GPUDevice * device, SDL_GPUSamplerCreateInfo const * createinfo)} */
    @NativeType("SDL_GPUSampler *")
    public static long SDL_CreateGPUSampler(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUSamplerCreateInfo const *") SDL_GPUSamplerCreateInfo createinfo) {
        return nSDL_CreateGPUSampler(device, createinfo.address());
    }

    // --- [ SDL_CreateGPUShader ] ---

    /** {@code SDL_GPUShader * SDL_CreateGPUShader(SDL_GPUDevice * device, SDL_GPUShaderCreateInfo const * createinfo)} */
    public static long nSDL_CreateGPUShader(long device, long createinfo) {
        long __functionAddress = Functions.CreateGPUShader;
        if (CHECKS) {
            check(device);
            SDL_GPUShaderCreateInfo.validate(createinfo);
        }
        return invokePPP(device, createinfo, __functionAddress);
    }

    /** {@code SDL_GPUShader * SDL_CreateGPUShader(SDL_GPUDevice * device, SDL_GPUShaderCreateInfo const * createinfo)} */
    @NativeType("SDL_GPUShader *")
    public static long SDL_CreateGPUShader(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUShaderCreateInfo const *") SDL_GPUShaderCreateInfo createinfo) {
        return nSDL_CreateGPUShader(device, createinfo.address());
    }

    // --- [ SDL_CreateGPUTexture ] ---

    /** {@code SDL_GPUTexture * SDL_CreateGPUTexture(SDL_GPUDevice * device, SDL_GPUTextureCreateInfo const * createinfo)} */
    public static long nSDL_CreateGPUTexture(long device, long createinfo) {
        long __functionAddress = Functions.CreateGPUTexture;
        if (CHECKS) {
            check(device);
        }
        return invokePPP(device, createinfo, __functionAddress);
    }

    /** {@code SDL_GPUTexture * SDL_CreateGPUTexture(SDL_GPUDevice * device, SDL_GPUTextureCreateInfo const * createinfo)} */
    @NativeType("SDL_GPUTexture *")
    public static long SDL_CreateGPUTexture(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUTextureCreateInfo const *") SDL_GPUTextureCreateInfo createinfo) {
        return nSDL_CreateGPUTexture(device, createinfo.address());
    }

    // --- [ SDL_CreateGPUBuffer ] ---

    /** {@code SDL_GPUBuffer * SDL_CreateGPUBuffer(SDL_GPUDevice * device, SDL_GPUBufferCreateInfo const * createinfo)} */
    public static long nSDL_CreateGPUBuffer(long device, long createinfo) {
        long __functionAddress = Functions.CreateGPUBuffer;
        if (CHECKS) {
            check(device);
        }
        return invokePPP(device, createinfo, __functionAddress);
    }

    /** {@code SDL_GPUBuffer * SDL_CreateGPUBuffer(SDL_GPUDevice * device, SDL_GPUBufferCreateInfo const * createinfo)} */
    @NativeType("SDL_GPUBuffer *")
    public static long SDL_CreateGPUBuffer(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUBufferCreateInfo const *") SDL_GPUBufferCreateInfo createinfo) {
        return nSDL_CreateGPUBuffer(device, createinfo.address());
    }

    // --- [ SDL_CreateGPUTransferBuffer ] ---

    /** {@code SDL_GPUTransferBuffer * SDL_CreateGPUTransferBuffer(SDL_GPUDevice * device, SDL_GPUTransferBufferCreateInfo const * createinfo)} */
    public static long nSDL_CreateGPUTransferBuffer(long device, long createinfo) {
        long __functionAddress = Functions.CreateGPUTransferBuffer;
        if (CHECKS) {
            check(device);
        }
        return invokePPP(device, createinfo, __functionAddress);
    }

    /** {@code SDL_GPUTransferBuffer * SDL_CreateGPUTransferBuffer(SDL_GPUDevice * device, SDL_GPUTransferBufferCreateInfo const * createinfo)} */
    @NativeType("SDL_GPUTransferBuffer *")
    public static long SDL_CreateGPUTransferBuffer(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUTransferBufferCreateInfo const *") SDL_GPUTransferBufferCreateInfo createinfo) {
        return nSDL_CreateGPUTransferBuffer(device, createinfo.address());
    }

    // --- [ SDL_SetGPUBufferName ] ---

    /** {@code void SDL_SetGPUBufferName(SDL_GPUDevice * device, SDL_GPUBuffer * buffer, char const * text)} */
    public static void nSDL_SetGPUBufferName(long device, long buffer, long text) {
        long __functionAddress = Functions.SetGPUBufferName;
        if (CHECKS) {
            check(device);
            check(buffer);
        }
        invokePPPV(device, buffer, text, __functionAddress);
    }

    /** {@code void SDL_SetGPUBufferName(SDL_GPUDevice * device, SDL_GPUBuffer * buffer, char const * text)} */
    public static void SDL_SetGPUBufferName(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUBuffer *") long buffer, @NativeType("char const *") ByteBuffer text) {
        if (CHECKS) {
            checkNT1(text);
        }
        nSDL_SetGPUBufferName(device, buffer, memAddress(text));
    }

    /** {@code void SDL_SetGPUBufferName(SDL_GPUDevice * device, SDL_GPUBuffer * buffer, char const * text)} */
    public static void SDL_SetGPUBufferName(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUBuffer *") long buffer, @NativeType("char const *") CharSequence text) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            nSDL_SetGPUBufferName(device, buffer, textEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_SetGPUTextureName ] ---

    /** {@code void SDL_SetGPUTextureName(SDL_GPUDevice * device, SDL_GPUTexture * texture, char const * text)} */
    public static void nSDL_SetGPUTextureName(long device, long texture, long text) {
        long __functionAddress = Functions.SetGPUTextureName;
        if (CHECKS) {
            check(device);
            check(texture);
        }
        invokePPPV(device, texture, text, __functionAddress);
    }

    /** {@code void SDL_SetGPUTextureName(SDL_GPUDevice * device, SDL_GPUTexture * texture, char const * text)} */
    public static void SDL_SetGPUTextureName(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUTexture *") long texture, @NativeType("char const *") ByteBuffer text) {
        if (CHECKS) {
            checkNT1(text);
        }
        nSDL_SetGPUTextureName(device, texture, memAddress(text));
    }

    /** {@code void SDL_SetGPUTextureName(SDL_GPUDevice * device, SDL_GPUTexture * texture, char const * text)} */
    public static void SDL_SetGPUTextureName(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUTexture *") long texture, @NativeType("char const *") CharSequence text) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            nSDL_SetGPUTextureName(device, texture, textEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_InsertGPUDebugLabel ] ---

    /** {@code void SDL_InsertGPUDebugLabel(SDL_GPUCommandBuffer * command_buffer, char const * text)} */
    public static void nSDL_InsertGPUDebugLabel(long command_buffer, long text) {
        long __functionAddress = Functions.InsertGPUDebugLabel;
        if (CHECKS) {
            check(command_buffer);
        }
        invokePPV(command_buffer, text, __functionAddress);
    }

    /** {@code void SDL_InsertGPUDebugLabel(SDL_GPUCommandBuffer * command_buffer, char const * text)} */
    public static void SDL_InsertGPUDebugLabel(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("char const *") ByteBuffer text) {
        if (CHECKS) {
            checkNT1(text);
        }
        nSDL_InsertGPUDebugLabel(command_buffer, memAddress(text));
    }

    /** {@code void SDL_InsertGPUDebugLabel(SDL_GPUCommandBuffer * command_buffer, char const * text)} */
    public static void SDL_InsertGPUDebugLabel(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("char const *") CharSequence text) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            nSDL_InsertGPUDebugLabel(command_buffer, textEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_PushGPUDebugGroup ] ---

    /** {@code void SDL_PushGPUDebugGroup(SDL_GPUCommandBuffer * command_buffer, char const * name)} */
    public static void nSDL_PushGPUDebugGroup(long command_buffer, long name) {
        long __functionAddress = Functions.PushGPUDebugGroup;
        if (CHECKS) {
            check(command_buffer);
        }
        invokePPV(command_buffer, name, __functionAddress);
    }

    /** {@code void SDL_PushGPUDebugGroup(SDL_GPUCommandBuffer * command_buffer, char const * name)} */
    public static void SDL_PushGPUDebugGroup(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        nSDL_PushGPUDebugGroup(command_buffer, memAddress(name));
    }

    /** {@code void SDL_PushGPUDebugGroup(SDL_GPUCommandBuffer * command_buffer, char const * name)} */
    public static void SDL_PushGPUDebugGroup(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            nSDL_PushGPUDebugGroup(command_buffer, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_PopGPUDebugGroup ] ---

    /** {@code void SDL_PopGPUDebugGroup(SDL_GPUCommandBuffer * command_buffer)} */
    public static void SDL_PopGPUDebugGroup(@NativeType("SDL_GPUCommandBuffer *") long command_buffer) {
        long __functionAddress = Functions.PopGPUDebugGroup;
        if (CHECKS) {
            check(command_buffer);
        }
        invokePV(command_buffer, __functionAddress);
    }

    // --- [ SDL_ReleaseGPUTexture ] ---

    /** {@code void SDL_ReleaseGPUTexture(SDL_GPUDevice * device, SDL_GPUTexture * texture)} */
    public static void SDL_ReleaseGPUTexture(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUTexture *") long texture) {
        long __functionAddress = Functions.ReleaseGPUTexture;
        if (CHECKS) {
            check(device);
            check(texture);
        }
        invokePPV(device, texture, __functionAddress);
    }

    // --- [ SDL_ReleaseGPUSampler ] ---

    /** {@code void SDL_ReleaseGPUSampler(SDL_GPUDevice * device, SDL_GPUSampler * sampler)} */
    public static void SDL_ReleaseGPUSampler(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUSampler *") long sampler) {
        long __functionAddress = Functions.ReleaseGPUSampler;
        if (CHECKS) {
            check(device);
            check(sampler);
        }
        invokePPV(device, sampler, __functionAddress);
    }

    // --- [ SDL_ReleaseGPUBuffer ] ---

    /** {@code void SDL_ReleaseGPUBuffer(SDL_GPUDevice * device, SDL_GPUBuffer * buffer)} */
    public static void SDL_ReleaseGPUBuffer(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUBuffer *") long buffer) {
        long __functionAddress = Functions.ReleaseGPUBuffer;
        if (CHECKS) {
            check(device);
            check(buffer);
        }
        invokePPV(device, buffer, __functionAddress);
    }

    // --- [ SDL_ReleaseGPUTransferBuffer ] ---

    /** {@code void SDL_ReleaseGPUTransferBuffer(SDL_GPUDevice * device, SDL_GPUTransferBuffer * transfer_buffer)} */
    public static void SDL_ReleaseGPUTransferBuffer(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUTransferBuffer *") long transfer_buffer) {
        long __functionAddress = Functions.ReleaseGPUTransferBuffer;
        if (CHECKS) {
            check(device);
            check(transfer_buffer);
        }
        invokePPV(device, transfer_buffer, __functionAddress);
    }

    // --- [ SDL_ReleaseGPUComputePipeline ] ---

    /** {@code void SDL_ReleaseGPUComputePipeline(SDL_GPUDevice * device, SDL_GPUComputePipeline * compute_pipeline)} */
    public static void SDL_ReleaseGPUComputePipeline(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUComputePipeline *") long compute_pipeline) {
        long __functionAddress = Functions.ReleaseGPUComputePipeline;
        if (CHECKS) {
            check(device);
            check(compute_pipeline);
        }
        invokePPV(device, compute_pipeline, __functionAddress);
    }

    // --- [ SDL_ReleaseGPUShader ] ---

    /** {@code void SDL_ReleaseGPUShader(SDL_GPUDevice * device, SDL_GPUShader * shader)} */
    public static void SDL_ReleaseGPUShader(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUShader *") long shader) {
        long __functionAddress = Functions.ReleaseGPUShader;
        if (CHECKS) {
            check(device);
            check(shader);
        }
        invokePPV(device, shader, __functionAddress);
    }

    // --- [ SDL_ReleaseGPUGraphicsPipeline ] ---

    /** {@code void SDL_ReleaseGPUGraphicsPipeline(SDL_GPUDevice * device, SDL_GPUGraphicsPipeline * graphics_pipeline)} */
    public static void SDL_ReleaseGPUGraphicsPipeline(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUGraphicsPipeline *") long graphics_pipeline) {
        long __functionAddress = Functions.ReleaseGPUGraphicsPipeline;
        if (CHECKS) {
            check(device);
            check(graphics_pipeline);
        }
        invokePPV(device, graphics_pipeline, __functionAddress);
    }

    // --- [ SDL_AcquireGPUCommandBuffer ] ---

    /** {@code SDL_GPUCommandBuffer * SDL_AcquireGPUCommandBuffer(SDL_GPUDevice * device)} */
    @NativeType("SDL_GPUCommandBuffer *")
    public static long SDL_AcquireGPUCommandBuffer(@NativeType("SDL_GPUDevice *") long device) {
        long __functionAddress = Functions.AcquireGPUCommandBuffer;
        if (CHECKS) {
            check(device);
        }
        return invokePP(device, __functionAddress);
    }

    // --- [ SDL_PushGPUVertexUniformData ] ---

    /** {@code void SDL_PushGPUVertexUniformData(SDL_GPUCommandBuffer * command_buffer, Uint32 slot_index, void const * data, Uint32 length)} */
    public static void nSDL_PushGPUVertexUniformData(long command_buffer, int slot_index, long data, int length) {
        long __functionAddress = Functions.PushGPUVertexUniformData;
        if (CHECKS) {
            check(command_buffer);
        }
        invokePPV(command_buffer, slot_index, data, length, __functionAddress);
    }

    /** {@code void SDL_PushGPUVertexUniformData(SDL_GPUCommandBuffer * command_buffer, Uint32 slot_index, void const * data, Uint32 length)} */
    public static void SDL_PushGPUVertexUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") ByteBuffer data) {
        nSDL_PushGPUVertexUniformData(command_buffer, slot_index, memAddress(data), data.remaining());
    }

    /** {@code void SDL_PushGPUVertexUniformData(SDL_GPUCommandBuffer * command_buffer, Uint32 slot_index, void const * data, Uint32 length)} */
    public static void SDL_PushGPUVertexUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") ShortBuffer data) {
        nSDL_PushGPUVertexUniformData(command_buffer, slot_index, memAddress(data), data.remaining() << 1);
    }

    /** {@code void SDL_PushGPUVertexUniformData(SDL_GPUCommandBuffer * command_buffer, Uint32 slot_index, void const * data, Uint32 length)} */
    public static void SDL_PushGPUVertexUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") IntBuffer data) {
        nSDL_PushGPUVertexUniformData(command_buffer, slot_index, memAddress(data), data.remaining() << 2);
    }

    /** {@code void SDL_PushGPUVertexUniformData(SDL_GPUCommandBuffer * command_buffer, Uint32 slot_index, void const * data, Uint32 length)} */
    public static void SDL_PushGPUVertexUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") LongBuffer data) {
        nSDL_PushGPUVertexUniformData(command_buffer, slot_index, memAddress(data), data.remaining() << 3);
    }

    /** {@code void SDL_PushGPUVertexUniformData(SDL_GPUCommandBuffer * command_buffer, Uint32 slot_index, void const * data, Uint32 length)} */
    public static void SDL_PushGPUVertexUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") FloatBuffer data) {
        nSDL_PushGPUVertexUniformData(command_buffer, slot_index, memAddress(data), data.remaining() << 2);
    }

    /** {@code void SDL_PushGPUVertexUniformData(SDL_GPUCommandBuffer * command_buffer, Uint32 slot_index, void const * data, Uint32 length)} */
    public static void SDL_PushGPUVertexUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") DoubleBuffer data) {
        nSDL_PushGPUVertexUniformData(command_buffer, slot_index, memAddress(data), data.remaining() << 3);
    }

    /** {@code void SDL_PushGPUVertexUniformData(SDL_GPUCommandBuffer * command_buffer, Uint32 slot_index, void const * data, Uint32 length)} */
    public static void SDL_PushGPUVertexUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") PointerBuffer data) {
        nSDL_PushGPUVertexUniformData(command_buffer, slot_index, memAddress(data), data.remaining() << POINTER_SHIFT);
    }

    // --- [ SDL_PushGPUFragmentUniformData ] ---

    /** {@code void SDL_PushGPUFragmentUniformData(SDL_GPUCommandBuffer * command_buffer, Uint32 slot_index, void const * data, Uint32 length)} */
    public static void nSDL_PushGPUFragmentUniformData(long command_buffer, int slot_index, long data, int length) {
        long __functionAddress = Functions.PushGPUFragmentUniformData;
        if (CHECKS) {
            check(command_buffer);
        }
        invokePPV(command_buffer, slot_index, data, length, __functionAddress);
    }

    /** {@code void SDL_PushGPUFragmentUniformData(SDL_GPUCommandBuffer * command_buffer, Uint32 slot_index, void const * data, Uint32 length)} */
    public static void SDL_PushGPUFragmentUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") ByteBuffer data) {
        nSDL_PushGPUFragmentUniformData(command_buffer, slot_index, memAddress(data), data.remaining());
    }

    /** {@code void SDL_PushGPUFragmentUniformData(SDL_GPUCommandBuffer * command_buffer, Uint32 slot_index, void const * data, Uint32 length)} */
    public static void SDL_PushGPUFragmentUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") ShortBuffer data) {
        nSDL_PushGPUFragmentUniformData(command_buffer, slot_index, memAddress(data), data.remaining() << 1);
    }

    /** {@code void SDL_PushGPUFragmentUniformData(SDL_GPUCommandBuffer * command_buffer, Uint32 slot_index, void const * data, Uint32 length)} */
    public static void SDL_PushGPUFragmentUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") IntBuffer data) {
        nSDL_PushGPUFragmentUniformData(command_buffer, slot_index, memAddress(data), data.remaining() << 2);
    }

    /** {@code void SDL_PushGPUFragmentUniformData(SDL_GPUCommandBuffer * command_buffer, Uint32 slot_index, void const * data, Uint32 length)} */
    public static void SDL_PushGPUFragmentUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") LongBuffer data) {
        nSDL_PushGPUFragmentUniformData(command_buffer, slot_index, memAddress(data), data.remaining() << 3);
    }

    /** {@code void SDL_PushGPUFragmentUniformData(SDL_GPUCommandBuffer * command_buffer, Uint32 slot_index, void const * data, Uint32 length)} */
    public static void SDL_PushGPUFragmentUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") FloatBuffer data) {
        nSDL_PushGPUFragmentUniformData(command_buffer, slot_index, memAddress(data), data.remaining() << 2);
    }

    /** {@code void SDL_PushGPUFragmentUniformData(SDL_GPUCommandBuffer * command_buffer, Uint32 slot_index, void const * data, Uint32 length)} */
    public static void SDL_PushGPUFragmentUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") DoubleBuffer data) {
        nSDL_PushGPUFragmentUniformData(command_buffer, slot_index, memAddress(data), data.remaining() << 3);
    }

    /** {@code void SDL_PushGPUFragmentUniformData(SDL_GPUCommandBuffer * command_buffer, Uint32 slot_index, void const * data, Uint32 length)} */
    public static void SDL_PushGPUFragmentUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") PointerBuffer data) {
        nSDL_PushGPUFragmentUniformData(command_buffer, slot_index, memAddress(data), data.remaining() << POINTER_SHIFT);
    }

    // --- [ SDL_PushGPUComputeUniformData ] ---

    /** {@code void SDL_PushGPUComputeUniformData(SDL_GPUCommandBuffer * command_buffer, Uint32 slot_index, void const * data, Uint32 length)} */
    public static void nSDL_PushGPUComputeUniformData(long command_buffer, int slot_index, long data, int length) {
        long __functionAddress = Functions.PushGPUComputeUniformData;
        if (CHECKS) {
            check(command_buffer);
        }
        invokePPV(command_buffer, slot_index, data, length, __functionAddress);
    }

    /** {@code void SDL_PushGPUComputeUniformData(SDL_GPUCommandBuffer * command_buffer, Uint32 slot_index, void const * data, Uint32 length)} */
    public static void SDL_PushGPUComputeUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") ByteBuffer data) {
        nSDL_PushGPUComputeUniformData(command_buffer, slot_index, memAddress(data), data.remaining());
    }

    /** {@code void SDL_PushGPUComputeUniformData(SDL_GPUCommandBuffer * command_buffer, Uint32 slot_index, void const * data, Uint32 length)} */
    public static void SDL_PushGPUComputeUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") ShortBuffer data) {
        nSDL_PushGPUComputeUniformData(command_buffer, slot_index, memAddress(data), data.remaining() << 1);
    }

    /** {@code void SDL_PushGPUComputeUniformData(SDL_GPUCommandBuffer * command_buffer, Uint32 slot_index, void const * data, Uint32 length)} */
    public static void SDL_PushGPUComputeUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") IntBuffer data) {
        nSDL_PushGPUComputeUniformData(command_buffer, slot_index, memAddress(data), data.remaining() << 2);
    }

    /** {@code void SDL_PushGPUComputeUniformData(SDL_GPUCommandBuffer * command_buffer, Uint32 slot_index, void const * data, Uint32 length)} */
    public static void SDL_PushGPUComputeUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") LongBuffer data) {
        nSDL_PushGPUComputeUniformData(command_buffer, slot_index, memAddress(data), data.remaining() << 3);
    }

    /** {@code void SDL_PushGPUComputeUniformData(SDL_GPUCommandBuffer * command_buffer, Uint32 slot_index, void const * data, Uint32 length)} */
    public static void SDL_PushGPUComputeUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") FloatBuffer data) {
        nSDL_PushGPUComputeUniformData(command_buffer, slot_index, memAddress(data), data.remaining() << 2);
    }

    /** {@code void SDL_PushGPUComputeUniformData(SDL_GPUCommandBuffer * command_buffer, Uint32 slot_index, void const * data, Uint32 length)} */
    public static void SDL_PushGPUComputeUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") DoubleBuffer data) {
        nSDL_PushGPUComputeUniformData(command_buffer, slot_index, memAddress(data), data.remaining() << 3);
    }

    /** {@code void SDL_PushGPUComputeUniformData(SDL_GPUCommandBuffer * command_buffer, Uint32 slot_index, void const * data, Uint32 length)} */
    public static void SDL_PushGPUComputeUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") PointerBuffer data) {
        nSDL_PushGPUComputeUniformData(command_buffer, slot_index, memAddress(data), data.remaining() << POINTER_SHIFT);
    }

    // --- [ SDL_BeginGPURenderPass ] ---

    /** {@code SDL_GPURenderPass * SDL_BeginGPURenderPass(SDL_GPUCommandBuffer * command_buffer, SDL_GPUColorTargetInfo const * color_target_infos, Uint32 num_color_targets, SDL_GPUDepthStencilTargetInfo const * depth_stencil_target_info)} */
    public static long nSDL_BeginGPURenderPass(long command_buffer, long color_target_infos, int num_color_targets, long depth_stencil_target_info) {
        long __functionAddress = Functions.BeginGPURenderPass;
        if (CHECKS) {
            check(command_buffer);
            if (color_target_infos != NULL) { Struct.validate(color_target_infos, num_color_targets, SDL_GPUColorTargetInfo.SIZEOF, SDL_GPUColorTargetInfo::validate); }
            if (depth_stencil_target_info != NULL) { SDL_GPUDepthStencilTargetInfo.validate(depth_stencil_target_info); }
        }
        return invokePPPP(command_buffer, color_target_infos, num_color_targets, depth_stencil_target_info, __functionAddress);
    }

    /** {@code SDL_GPURenderPass * SDL_BeginGPURenderPass(SDL_GPUCommandBuffer * command_buffer, SDL_GPUColorTargetInfo const * color_target_infos, Uint32 num_color_targets, SDL_GPUDepthStencilTargetInfo const * depth_stencil_target_info)} */
    @NativeType("SDL_GPURenderPass *")
    public static long SDL_BeginGPURenderPass(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("SDL_GPUColorTargetInfo const *") SDL_GPUColorTargetInfo.@Nullable Buffer color_target_infos, @NativeType("SDL_GPUDepthStencilTargetInfo const *") @Nullable SDL_GPUDepthStencilTargetInfo depth_stencil_target_info) {
        return nSDL_BeginGPURenderPass(command_buffer, memAddressSafe(color_target_infos), remainingSafe(color_target_infos), memAddressSafe(depth_stencil_target_info));
    }

    // --- [ SDL_BindGPUGraphicsPipeline ] ---

    /** {@code void SDL_BindGPUGraphicsPipeline(SDL_GPURenderPass * render_pass, SDL_GPUGraphicsPipeline * graphics_pipeline)} */
    public static void SDL_BindGPUGraphicsPipeline(@NativeType("SDL_GPURenderPass *") long render_pass, @NativeType("SDL_GPUGraphicsPipeline *") long graphics_pipeline) {
        long __functionAddress = Functions.BindGPUGraphicsPipeline;
        if (CHECKS) {
            check(render_pass);
            check(graphics_pipeline);
        }
        invokePPV(render_pass, graphics_pipeline, __functionAddress);
    }

    // --- [ SDL_SetGPUViewport ] ---

    /** {@code void SDL_SetGPUViewport(SDL_GPURenderPass * render_pass, SDL_GPUViewport const * viewport)} */
    public static void nSDL_SetGPUViewport(long render_pass, long viewport) {
        long __functionAddress = Functions.SetGPUViewport;
        if (CHECKS) {
            check(render_pass);
        }
        invokePPV(render_pass, viewport, __functionAddress);
    }

    /** {@code void SDL_SetGPUViewport(SDL_GPURenderPass * render_pass, SDL_GPUViewport const * viewport)} */
    public static void SDL_SetGPUViewport(@NativeType("SDL_GPURenderPass *") long render_pass, @NativeType("SDL_GPUViewport const *") SDL_GPUViewport viewport) {
        nSDL_SetGPUViewport(render_pass, viewport.address());
    }

    // --- [ SDL_SetGPUScissor ] ---

    /** {@code void SDL_SetGPUScissor(SDL_GPURenderPass * render_pass, SDL_Rect const * scissor)} */
    public static void nSDL_SetGPUScissor(long render_pass, long scissor) {
        long __functionAddress = Functions.SetGPUScissor;
        if (CHECKS) {
            check(render_pass);
        }
        invokePPV(render_pass, scissor, __functionAddress);
    }

    /** {@code void SDL_SetGPUScissor(SDL_GPURenderPass * render_pass, SDL_Rect const * scissor)} */
    public static void SDL_SetGPUScissor(@NativeType("SDL_GPURenderPass *") long render_pass, @NativeType("SDL_Rect const *") SDL_Rect scissor) {
        nSDL_SetGPUScissor(render_pass, scissor.address());
    }

    // --- [ SDL_SetGPUBlendConstants ] ---

    private static final FFICIF SDL_SetGPUBlendConstantsCIF = apiCreateCIF(
        ffi_type_void,
        ffi_type_pointer, apiCreateStruct(ffi_type_float, ffi_type_float, ffi_type_float, ffi_type_float)
    );

    /** {@code void SDL_SetGPUBlendConstants(SDL_GPURenderPass * render_pass, SDL_FColor blend_constants)} */
    public static void nSDL_SetGPUBlendConstants(long render_pass, long blend_constants) {
        long __functionAddress = Functions.SetGPUBlendConstants;
        if (CHECKS) {
            check(render_pass);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long arguments = stack.nmalloc(POINTER_SIZE, POINTER_SIZE * 2);
            memPutAddress(arguments, stack.npointer(render_pass));
            memPutAddress(arguments + POINTER_SIZE, blend_constants);

            nffi_call(SDL_SetGPUBlendConstantsCIF.address(), __functionAddress, NULL, arguments);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void SDL_SetGPUBlendConstants(SDL_GPURenderPass * render_pass, SDL_FColor blend_constants)} */
    public static void SDL_SetGPUBlendConstants(@NativeType("SDL_GPURenderPass *") long render_pass, SDL_FColor blend_constants) {
        nSDL_SetGPUBlendConstants(render_pass, blend_constants.address());
    }

    // --- [ SDL_SetGPUStencilReference ] ---

    /** {@code void SDL_SetGPUStencilReference(SDL_GPURenderPass * render_pass, Uint8 reference)} */
    public static void SDL_SetGPUStencilReference(@NativeType("SDL_GPURenderPass *") long render_pass, @NativeType("Uint8") byte reference) {
        long __functionAddress = Functions.SetGPUStencilReference;
        if (CHECKS) {
            check(render_pass);
        }
        invokePUV(render_pass, reference, __functionAddress);
    }

    // --- [ SDL_BindGPUVertexBuffers ] ---

    /** {@code void SDL_BindGPUVertexBuffers(SDL_GPURenderPass * render_pass, Uint32 first_slot, SDL_GPUBufferBinding const * bindings, Uint32 num_bindings)} */
    public static void nSDL_BindGPUVertexBuffers(long render_pass, int first_slot, long bindings, int num_bindings) {
        long __functionAddress = Functions.BindGPUVertexBuffers;
        if (CHECKS) {
            check(render_pass);
            if (bindings != NULL) { Struct.validate(bindings, num_bindings, SDL_GPUBufferBinding.SIZEOF, SDL_GPUBufferBinding::validate); }
        }
        invokePPV(render_pass, first_slot, bindings, num_bindings, __functionAddress);
    }

    /** {@code void SDL_BindGPUVertexBuffers(SDL_GPURenderPass * render_pass, Uint32 first_slot, SDL_GPUBufferBinding const * bindings, Uint32 num_bindings)} */
    public static void SDL_BindGPUVertexBuffers(@NativeType("SDL_GPURenderPass *") long render_pass, @NativeType("Uint32") int first_slot, @NativeType("SDL_GPUBufferBinding const *") SDL_GPUBufferBinding.@Nullable Buffer bindings) {
        nSDL_BindGPUVertexBuffers(render_pass, first_slot, memAddressSafe(bindings), remainingSafe(bindings));
    }

    // --- [ SDL_BindGPUIndexBuffer ] ---

    /** {@code void SDL_BindGPUIndexBuffer(SDL_GPURenderPass * render_pass, SDL_GPUBufferBinding const * binding, SDL_GPUIndexElementSize index_element_size)} */
    public static void nSDL_BindGPUIndexBuffer(long render_pass, long binding, int index_element_size) {
        long __functionAddress = Functions.BindGPUIndexBuffer;
        if (CHECKS) {
            check(render_pass);
            SDL_GPUBufferBinding.validate(binding);
        }
        invokePPV(render_pass, binding, index_element_size, __functionAddress);
    }

    /** {@code void SDL_BindGPUIndexBuffer(SDL_GPURenderPass * render_pass, SDL_GPUBufferBinding const * binding, SDL_GPUIndexElementSize index_element_size)} */
    public static void SDL_BindGPUIndexBuffer(@NativeType("SDL_GPURenderPass *") long render_pass, @NativeType("SDL_GPUBufferBinding const *") SDL_GPUBufferBinding binding, @NativeType("SDL_GPUIndexElementSize") int index_element_size) {
        nSDL_BindGPUIndexBuffer(render_pass, binding.address(), index_element_size);
    }

    // --- [ SDL_BindGPUVertexSamplers ] ---

    /** {@code void SDL_BindGPUVertexSamplers(SDL_GPURenderPass * render_pass, Uint32 first_slot, SDL_GPUTextureSamplerBinding const * texture_sampler_bindings, Uint32 num_bindings)} */
    public static void nSDL_BindGPUVertexSamplers(long render_pass, int first_slot, long texture_sampler_bindings, int num_bindings) {
        long __functionAddress = Functions.BindGPUVertexSamplers;
        if (CHECKS) {
            check(render_pass);
            if (texture_sampler_bindings != NULL) { Struct.validate(texture_sampler_bindings, num_bindings, SDL_GPUTextureSamplerBinding.SIZEOF, SDL_GPUTextureSamplerBinding::validate); }
        }
        invokePPV(render_pass, first_slot, texture_sampler_bindings, num_bindings, __functionAddress);
    }

    /** {@code void SDL_BindGPUVertexSamplers(SDL_GPURenderPass * render_pass, Uint32 first_slot, SDL_GPUTextureSamplerBinding const * texture_sampler_bindings, Uint32 num_bindings)} */
    public static void SDL_BindGPUVertexSamplers(@NativeType("SDL_GPURenderPass *") long render_pass, @NativeType("Uint32") int first_slot, @NativeType("SDL_GPUTextureSamplerBinding const *") SDL_GPUTextureSamplerBinding.@Nullable Buffer texture_sampler_bindings) {
        nSDL_BindGPUVertexSamplers(render_pass, first_slot, memAddressSafe(texture_sampler_bindings), remainingSafe(texture_sampler_bindings));
    }

    // --- [ SDL_BindGPUVertexStorageTextures ] ---

    /** {@code void SDL_BindGPUVertexStorageTextures(SDL_GPURenderPass * render_pass, Uint32 first_slot, SDL_GPUTexture * const * storage_textures, Uint32 num_bindings)} */
    public static void nSDL_BindGPUVertexStorageTextures(long render_pass, int first_slot, long storage_textures, int num_bindings) {
        long __functionAddress = Functions.BindGPUVertexStorageTextures;
        if (CHECKS) {
            check(render_pass);
        }
        invokePPV(render_pass, first_slot, storage_textures, num_bindings, __functionAddress);
    }

    /** {@code void SDL_BindGPUVertexStorageTextures(SDL_GPURenderPass * render_pass, Uint32 first_slot, SDL_GPUTexture * const * storage_textures, Uint32 num_bindings)} */
    public static void SDL_BindGPUVertexStorageTextures(@NativeType("SDL_GPURenderPass *") long render_pass, @NativeType("Uint32") int first_slot, @NativeType("SDL_GPUTexture * const *") @Nullable PointerBuffer storage_textures) {
        nSDL_BindGPUVertexStorageTextures(render_pass, first_slot, memAddressSafe(storage_textures), remainingSafe(storage_textures));
    }

    // --- [ SDL_BindGPUVertexStorageBuffers ] ---

    /** {@code void SDL_BindGPUVertexStorageBuffers(SDL_GPURenderPass * render_pass, Uint32 first_slot, SDL_GPUBuffer * const * storage_buffers, Uint32 num_bindings)} */
    public static void nSDL_BindGPUVertexStorageBuffers(long render_pass, int first_slot, long storage_buffers, int num_bindings) {
        long __functionAddress = Functions.BindGPUVertexStorageBuffers;
        if (CHECKS) {
            check(render_pass);
        }
        invokePPV(render_pass, first_slot, storage_buffers, num_bindings, __functionAddress);
    }

    /** {@code void SDL_BindGPUVertexStorageBuffers(SDL_GPURenderPass * render_pass, Uint32 first_slot, SDL_GPUBuffer * const * storage_buffers, Uint32 num_bindings)} */
    public static void SDL_BindGPUVertexStorageBuffers(@NativeType("SDL_GPURenderPass *") long render_pass, @NativeType("Uint32") int first_slot, @NativeType("SDL_GPUBuffer * const *") @Nullable PointerBuffer storage_buffers) {
        nSDL_BindGPUVertexStorageBuffers(render_pass, first_slot, memAddressSafe(storage_buffers), remainingSafe(storage_buffers));
    }

    // --- [ SDL_BindGPUFragmentSamplers ] ---

    /** {@code void SDL_BindGPUFragmentSamplers(SDL_GPURenderPass * render_pass, Uint32 first_slot, SDL_GPUTextureSamplerBinding const * texture_sampler_bindings, Uint32 num_bindings)} */
    public static void nSDL_BindGPUFragmentSamplers(long render_pass, int first_slot, long texture_sampler_bindings, int num_bindings) {
        long __functionAddress = Functions.BindGPUFragmentSamplers;
        if (CHECKS) {
            check(render_pass);
            if (texture_sampler_bindings != NULL) { Struct.validate(texture_sampler_bindings, num_bindings, SDL_GPUTextureSamplerBinding.SIZEOF, SDL_GPUTextureSamplerBinding::validate); }
        }
        invokePPV(render_pass, first_slot, texture_sampler_bindings, num_bindings, __functionAddress);
    }

    /** {@code void SDL_BindGPUFragmentSamplers(SDL_GPURenderPass * render_pass, Uint32 first_slot, SDL_GPUTextureSamplerBinding const * texture_sampler_bindings, Uint32 num_bindings)} */
    public static void SDL_BindGPUFragmentSamplers(@NativeType("SDL_GPURenderPass *") long render_pass, @NativeType("Uint32") int first_slot, @NativeType("SDL_GPUTextureSamplerBinding const *") SDL_GPUTextureSamplerBinding.@Nullable Buffer texture_sampler_bindings) {
        nSDL_BindGPUFragmentSamplers(render_pass, first_slot, memAddressSafe(texture_sampler_bindings), remainingSafe(texture_sampler_bindings));
    }

    // --- [ SDL_BindGPUFragmentStorageTextures ] ---

    /** {@code void SDL_BindGPUFragmentStorageTextures(SDL_GPURenderPass * render_pass, Uint32 first_slot, SDL_GPUTexture * const * storage_textures, Uint32 num_bindings)} */
    public static void nSDL_BindGPUFragmentStorageTextures(long render_pass, int first_slot, long storage_textures, int num_bindings) {
        long __functionAddress = Functions.BindGPUFragmentStorageTextures;
        if (CHECKS) {
            check(render_pass);
        }
        invokePPV(render_pass, first_slot, storage_textures, num_bindings, __functionAddress);
    }

    /** {@code void SDL_BindGPUFragmentStorageTextures(SDL_GPURenderPass * render_pass, Uint32 first_slot, SDL_GPUTexture * const * storage_textures, Uint32 num_bindings)} */
    public static void SDL_BindGPUFragmentStorageTextures(@NativeType("SDL_GPURenderPass *") long render_pass, @NativeType("Uint32") int first_slot, @NativeType("SDL_GPUTexture * const *") @Nullable PointerBuffer storage_textures) {
        nSDL_BindGPUFragmentStorageTextures(render_pass, first_slot, memAddressSafe(storage_textures), remainingSafe(storage_textures));
    }

    // --- [ SDL_BindGPUFragmentStorageBuffers ] ---

    /** {@code void SDL_BindGPUFragmentStorageBuffers(SDL_GPURenderPass * render_pass, Uint32 first_slot, SDL_GPUBuffer * const * storage_buffers, Uint32 num_bindings)} */
    public static void nSDL_BindGPUFragmentStorageBuffers(long render_pass, int first_slot, long storage_buffers, int num_bindings) {
        long __functionAddress = Functions.BindGPUFragmentStorageBuffers;
        if (CHECKS) {
            check(render_pass);
        }
        invokePPV(render_pass, first_slot, storage_buffers, num_bindings, __functionAddress);
    }

    /** {@code void SDL_BindGPUFragmentStorageBuffers(SDL_GPURenderPass * render_pass, Uint32 first_slot, SDL_GPUBuffer * const * storage_buffers, Uint32 num_bindings)} */
    public static void SDL_BindGPUFragmentStorageBuffers(@NativeType("SDL_GPURenderPass *") long render_pass, @NativeType("Uint32") int first_slot, @NativeType("SDL_GPUBuffer * const *") @Nullable PointerBuffer storage_buffers) {
        nSDL_BindGPUFragmentStorageBuffers(render_pass, first_slot, memAddressSafe(storage_buffers), remainingSafe(storage_buffers));
    }

    // --- [ SDL_DrawGPUIndexedPrimitives ] ---

    /** {@code void SDL_DrawGPUIndexedPrimitives(SDL_GPURenderPass * render_pass, Uint32 num_indices, Uint32 num_instances, Uint32 first_index, Sint32 vertex_offset, Uint32 first_instance)} */
    public static void SDL_DrawGPUIndexedPrimitives(@NativeType("SDL_GPURenderPass *") long render_pass, @NativeType("Uint32") int num_indices, @NativeType("Uint32") int num_instances, @NativeType("Uint32") int first_index, @NativeType("Sint32") int vertex_offset, @NativeType("Uint32") int first_instance) {
        long __functionAddress = Functions.DrawGPUIndexedPrimitives;
        if (CHECKS) {
            check(render_pass);
        }
        invokePV(render_pass, num_indices, num_instances, first_index, vertex_offset, first_instance, __functionAddress);
    }

    // --- [ SDL_DrawGPUPrimitives ] ---

    /** {@code void SDL_DrawGPUPrimitives(SDL_GPURenderPass * render_pass, Uint32 num_vertices, Uint32 num_instances, Uint32 first_vertex, Uint32 first_instance)} */
    public static void SDL_DrawGPUPrimitives(@NativeType("SDL_GPURenderPass *") long render_pass, @NativeType("Uint32") int num_vertices, @NativeType("Uint32") int num_instances, @NativeType("Uint32") int first_vertex, @NativeType("Uint32") int first_instance) {
        long __functionAddress = Functions.DrawGPUPrimitives;
        if (CHECKS) {
            check(render_pass);
        }
        invokePV(render_pass, num_vertices, num_instances, first_vertex, first_instance, __functionAddress);
    }

    // --- [ SDL_DrawGPUPrimitivesIndirect ] ---

    /** {@code void SDL_DrawGPUPrimitivesIndirect(SDL_GPURenderPass * render_pass, SDL_GPUBuffer * buffer, Uint32 offset, Uint32 draw_count)} */
    public static void SDL_DrawGPUPrimitivesIndirect(@NativeType("SDL_GPURenderPass *") long render_pass, @NativeType("SDL_GPUBuffer *") long buffer, @NativeType("Uint32") int offset, @NativeType("Uint32") int draw_count) {
        long __functionAddress = Functions.DrawGPUPrimitivesIndirect;
        if (CHECKS) {
            check(render_pass);
            check(buffer);
        }
        invokePPV(render_pass, buffer, offset, draw_count, __functionAddress);
    }

    // --- [ SDL_DrawGPUIndexedPrimitivesIndirect ] ---

    /** {@code void SDL_DrawGPUIndexedPrimitivesIndirect(SDL_GPURenderPass * render_pass, SDL_GPUBuffer * buffer, Uint32 offset, Uint32 draw_count)} */
    public static void SDL_DrawGPUIndexedPrimitivesIndirect(@NativeType("SDL_GPURenderPass *") long render_pass, @NativeType("SDL_GPUBuffer *") long buffer, @NativeType("Uint32") int offset, @NativeType("Uint32") int draw_count) {
        long __functionAddress = Functions.DrawGPUIndexedPrimitivesIndirect;
        if (CHECKS) {
            check(render_pass);
            check(buffer);
        }
        invokePPV(render_pass, buffer, offset, draw_count, __functionAddress);
    }

    // --- [ SDL_EndGPURenderPass ] ---

    /** {@code void SDL_EndGPURenderPass(SDL_GPURenderPass * render_pass)} */
    public static void SDL_EndGPURenderPass(@NativeType("SDL_GPURenderPass *") long render_pass) {
        long __functionAddress = Functions.EndGPURenderPass;
        if (CHECKS) {
            check(render_pass);
        }
        invokePV(render_pass, __functionAddress);
    }

    // --- [ SDL_BeginGPUComputePass ] ---

    /** {@code SDL_GPUComputePass * SDL_BeginGPUComputePass(SDL_GPUCommandBuffer * command_buffer, SDL_GPUStorageTextureReadWriteBinding const * storage_texture_bindings, Uint32 num_storage_texture_bindings, SDL_GPUStorageBufferReadWriteBinding const * storage_buffer_bindings, Uint32 num_storage_buffer_bindings)} */
    public static long nSDL_BeginGPUComputePass(long command_buffer, long storage_texture_bindings, int num_storage_texture_bindings, long storage_buffer_bindings, int num_storage_buffer_bindings) {
        long __functionAddress = Functions.BeginGPUComputePass;
        if (CHECKS) {
            check(command_buffer);
            if (storage_texture_bindings != NULL) { Struct.validate(storage_texture_bindings, num_storage_texture_bindings, SDL_GPUStorageTextureReadWriteBinding.SIZEOF, SDL_GPUStorageTextureReadWriteBinding::validate); }
            if (storage_buffer_bindings != NULL) { Struct.validate(storage_buffer_bindings, num_storage_buffer_bindings, SDL_GPUStorageBufferReadWriteBinding.SIZEOF, SDL_GPUStorageBufferReadWriteBinding::validate); }
        }
        return invokePPPP(command_buffer, storage_texture_bindings, num_storage_texture_bindings, storage_buffer_bindings, num_storage_buffer_bindings, __functionAddress);
    }

    /** {@code SDL_GPUComputePass * SDL_BeginGPUComputePass(SDL_GPUCommandBuffer * command_buffer, SDL_GPUStorageTextureReadWriteBinding const * storage_texture_bindings, Uint32 num_storage_texture_bindings, SDL_GPUStorageBufferReadWriteBinding const * storage_buffer_bindings, Uint32 num_storage_buffer_bindings)} */
    @NativeType("SDL_GPUComputePass *")
    public static long SDL_BeginGPUComputePass(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("SDL_GPUStorageTextureReadWriteBinding const *") SDL_GPUStorageTextureReadWriteBinding.@Nullable Buffer storage_texture_bindings, @NativeType("SDL_GPUStorageBufferReadWriteBinding const *") SDL_GPUStorageBufferReadWriteBinding.@Nullable Buffer storage_buffer_bindings) {
        return nSDL_BeginGPUComputePass(command_buffer, memAddressSafe(storage_texture_bindings), remainingSafe(storage_texture_bindings), memAddressSafe(storage_buffer_bindings), remainingSafe(storage_buffer_bindings));
    }

    // --- [ SDL_BindGPUComputePipeline ] ---

    /** {@code void SDL_BindGPUComputePipeline(SDL_GPUComputePass * compute_pass, SDL_GPUComputePipeline * compute_pipeline)} */
    public static void SDL_BindGPUComputePipeline(@NativeType("SDL_GPUComputePass *") long compute_pass, @NativeType("SDL_GPUComputePipeline *") long compute_pipeline) {
        long __functionAddress = Functions.BindGPUComputePipeline;
        if (CHECKS) {
            check(compute_pass);
            check(compute_pipeline);
        }
        invokePPV(compute_pass, compute_pipeline, __functionAddress);
    }

    // --- [ SDL_BindGPUComputeSamplers ] ---

    /** {@code void SDL_BindGPUComputeSamplers(SDL_GPUComputePass * compute_pass, Uint32 first_slot, SDL_GPUTextureSamplerBinding const * texture_sampler_bindings, Uint32 num_bindings)} */
    public static void nSDL_BindGPUComputeSamplers(long compute_pass, int first_slot, long texture_sampler_bindings, int num_bindings) {
        long __functionAddress = Functions.BindGPUComputeSamplers;
        if (CHECKS) {
            check(compute_pass);
            if (texture_sampler_bindings != NULL) { Struct.validate(texture_sampler_bindings, num_bindings, SDL_GPUTextureSamplerBinding.SIZEOF, SDL_GPUTextureSamplerBinding::validate); }
        }
        invokePPV(compute_pass, first_slot, texture_sampler_bindings, num_bindings, __functionAddress);
    }

    /** {@code void SDL_BindGPUComputeSamplers(SDL_GPUComputePass * compute_pass, Uint32 first_slot, SDL_GPUTextureSamplerBinding const * texture_sampler_bindings, Uint32 num_bindings)} */
    public static void SDL_BindGPUComputeSamplers(@NativeType("SDL_GPUComputePass *") long compute_pass, @NativeType("Uint32") int first_slot, @NativeType("SDL_GPUTextureSamplerBinding const *") SDL_GPUTextureSamplerBinding.@Nullable Buffer texture_sampler_bindings) {
        nSDL_BindGPUComputeSamplers(compute_pass, first_slot, memAddressSafe(texture_sampler_bindings), remainingSafe(texture_sampler_bindings));
    }

    // --- [ SDL_BindGPUComputeStorageTextures ] ---

    /** {@code void SDL_BindGPUComputeStorageTextures(SDL_GPUComputePass * compute_pass, Uint32 first_slot, SDL_GPUTexture * const * storage_textures, Uint32 num_bindings)} */
    public static void nSDL_BindGPUComputeStorageTextures(long compute_pass, int first_slot, long storage_textures, int num_bindings) {
        long __functionAddress = Functions.BindGPUComputeStorageTextures;
        if (CHECKS) {
            check(compute_pass);
        }
        invokePPV(compute_pass, first_slot, storage_textures, num_bindings, __functionAddress);
    }

    /** {@code void SDL_BindGPUComputeStorageTextures(SDL_GPUComputePass * compute_pass, Uint32 first_slot, SDL_GPUTexture * const * storage_textures, Uint32 num_bindings)} */
    public static void SDL_BindGPUComputeStorageTextures(@NativeType("SDL_GPUComputePass *") long compute_pass, @NativeType("Uint32") int first_slot, @NativeType("SDL_GPUTexture * const *") @Nullable PointerBuffer storage_textures) {
        nSDL_BindGPUComputeStorageTextures(compute_pass, first_slot, memAddressSafe(storage_textures), remainingSafe(storage_textures));
    }

    // --- [ SDL_BindGPUComputeStorageBuffers ] ---

    /** {@code void SDL_BindGPUComputeStorageBuffers(SDL_GPUComputePass * compute_pass, Uint32 first_slot, SDL_GPUBuffer * const * storage_buffers, Uint32 num_bindings)} */
    public static void nSDL_BindGPUComputeStorageBuffers(long compute_pass, int first_slot, long storage_buffers, int num_bindings) {
        long __functionAddress = Functions.BindGPUComputeStorageBuffers;
        if (CHECKS) {
            check(compute_pass);
        }
        invokePPV(compute_pass, first_slot, storage_buffers, num_bindings, __functionAddress);
    }

    /** {@code void SDL_BindGPUComputeStorageBuffers(SDL_GPUComputePass * compute_pass, Uint32 first_slot, SDL_GPUBuffer * const * storage_buffers, Uint32 num_bindings)} */
    public static void SDL_BindGPUComputeStorageBuffers(@NativeType("SDL_GPUComputePass *") long compute_pass, @NativeType("Uint32") int first_slot, @NativeType("SDL_GPUBuffer * const *") @Nullable PointerBuffer storage_buffers) {
        nSDL_BindGPUComputeStorageBuffers(compute_pass, first_slot, memAddressSafe(storage_buffers), remainingSafe(storage_buffers));
    }

    // --- [ SDL_DispatchGPUCompute ] ---

    /** {@code void SDL_DispatchGPUCompute(SDL_GPUComputePass * compute_pass, Uint32 groupcount_x, Uint32 groupcount_y, Uint32 groupcount_z)} */
    public static void SDL_DispatchGPUCompute(@NativeType("SDL_GPUComputePass *") long compute_pass, @NativeType("Uint32") int groupcount_x, @NativeType("Uint32") int groupcount_y, @NativeType("Uint32") int groupcount_z) {
        long __functionAddress = Functions.DispatchGPUCompute;
        if (CHECKS) {
            check(compute_pass);
        }
        invokePV(compute_pass, groupcount_x, groupcount_y, groupcount_z, __functionAddress);
    }

    // --- [ SDL_DispatchGPUComputeIndirect ] ---

    /** {@code void SDL_DispatchGPUComputeIndirect(SDL_GPUComputePass * compute_pass, SDL_GPUBuffer * buffer, Uint32 offset)} */
    public static void SDL_DispatchGPUComputeIndirect(@NativeType("SDL_GPUComputePass *") long compute_pass, @NativeType("SDL_GPUBuffer *") long buffer, @NativeType("Uint32") int offset) {
        long __functionAddress = Functions.DispatchGPUComputeIndirect;
        if (CHECKS) {
            check(compute_pass);
            check(buffer);
        }
        invokePPV(compute_pass, buffer, offset, __functionAddress);
    }

    // --- [ SDL_EndGPUComputePass ] ---

    /** {@code void SDL_EndGPUComputePass(SDL_GPUComputePass * compute_pass)} */
    public static void SDL_EndGPUComputePass(@NativeType("SDL_GPUComputePass *") long compute_pass) {
        long __functionAddress = Functions.EndGPUComputePass;
        if (CHECKS) {
            check(compute_pass);
        }
        invokePV(compute_pass, __functionAddress);
    }

    // --- [ SDL_MapGPUTransferBuffer ] ---

    /** {@code void * SDL_MapGPUTransferBuffer(SDL_GPUDevice * device, SDL_GPUTransferBuffer * transfer_buffer, bool cycle, size_t buffer_size)} */
    public static long nSDL_MapGPUTransferBuffer(long device, long transfer_buffer, boolean cycle) {
        long __functionAddress = Functions.MapGPUTransferBuffer;
        if (CHECKS) {
            check(device);
            check(transfer_buffer);
        }
        return invokePPP(device, transfer_buffer, cycle, __functionAddress);
    }

    /** {@code void * SDL_MapGPUTransferBuffer(SDL_GPUDevice * device, SDL_GPUTransferBuffer * transfer_buffer, bool cycle, size_t buffer_size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer SDL_MapGPUTransferBuffer(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUTransferBuffer *") long transfer_buffer, @NativeType("bool") boolean cycle, @NativeType("size_t") long buffer_size) {
        long __result = nSDL_MapGPUTransferBuffer(device, transfer_buffer, cycle);
        return memByteBufferSafe(__result, (int)buffer_size);
    }

    // --- [ SDL_UnmapGPUTransferBuffer ] ---

    /** {@code void SDL_UnmapGPUTransferBuffer(SDL_GPUDevice * device, SDL_GPUTransferBuffer * transfer_buffer)} */
    public static void SDL_UnmapGPUTransferBuffer(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUTransferBuffer *") long transfer_buffer) {
        long __functionAddress = Functions.UnmapGPUTransferBuffer;
        if (CHECKS) {
            check(device);
            check(transfer_buffer);
        }
        invokePPV(device, transfer_buffer, __functionAddress);
    }

    // --- [ SDL_BeginGPUCopyPass ] ---

    /** {@code SDL_GPUCopyPass * SDL_BeginGPUCopyPass(SDL_GPUCommandBuffer * command_buffer)} */
    @NativeType("SDL_GPUCopyPass *")
    public static long SDL_BeginGPUCopyPass(@NativeType("SDL_GPUCommandBuffer *") long command_buffer) {
        long __functionAddress = Functions.BeginGPUCopyPass;
        if (CHECKS) {
            check(command_buffer);
        }
        return invokePP(command_buffer, __functionAddress);
    }

    // --- [ SDL_UploadToGPUTexture ] ---

    /** {@code void SDL_UploadToGPUTexture(SDL_GPUCopyPass * copy_pass, SDL_GPUTextureTransferInfo const * source, SDL_GPUTextureRegion const * destination, bool cycle)} */
    public static void nSDL_UploadToGPUTexture(long copy_pass, long source, long destination, boolean cycle) {
        long __functionAddress = Functions.UploadToGPUTexture;
        if (CHECKS) {
            check(copy_pass);
            SDL_GPUTextureTransferInfo.validate(source);
            SDL_GPUTextureRegion.validate(destination);
        }
        invokePPPV(copy_pass, source, destination, cycle, __functionAddress);
    }

    /** {@code void SDL_UploadToGPUTexture(SDL_GPUCopyPass * copy_pass, SDL_GPUTextureTransferInfo const * source, SDL_GPUTextureRegion const * destination, bool cycle)} */
    public static void SDL_UploadToGPUTexture(@NativeType("SDL_GPUCopyPass *") long copy_pass, @NativeType("SDL_GPUTextureTransferInfo const *") SDL_GPUTextureTransferInfo source, @NativeType("SDL_GPUTextureRegion const *") SDL_GPUTextureRegion destination, @NativeType("bool") boolean cycle) {
        nSDL_UploadToGPUTexture(copy_pass, source.address(), destination.address(), cycle);
    }

    // --- [ SDL_UploadToGPUBuffer ] ---

    /** {@code void SDL_UploadToGPUBuffer(SDL_GPUCopyPass * copy_pass, SDL_GPUTransferBufferLocation const * source, SDL_GPUBufferRegion const * destination, bool cycle)} */
    public static void nSDL_UploadToGPUBuffer(long copy_pass, long source, long destination, boolean cycle) {
        long __functionAddress = Functions.UploadToGPUBuffer;
        if (CHECKS) {
            check(copy_pass);
            SDL_GPUTransferBufferLocation.validate(source);
            SDL_GPUBufferRegion.validate(destination);
        }
        invokePPPV(copy_pass, source, destination, cycle, __functionAddress);
    }

    /** {@code void SDL_UploadToGPUBuffer(SDL_GPUCopyPass * copy_pass, SDL_GPUTransferBufferLocation const * source, SDL_GPUBufferRegion const * destination, bool cycle)} */
    public static void SDL_UploadToGPUBuffer(@NativeType("SDL_GPUCopyPass *") long copy_pass, @NativeType("SDL_GPUTransferBufferLocation const *") SDL_GPUTransferBufferLocation source, @NativeType("SDL_GPUBufferRegion const *") SDL_GPUBufferRegion destination, @NativeType("bool") boolean cycle) {
        nSDL_UploadToGPUBuffer(copy_pass, source.address(), destination.address(), cycle);
    }

    // --- [ SDL_CopyGPUTextureToTexture ] ---

    /** {@code void SDL_CopyGPUTextureToTexture(SDL_GPUCopyPass * copy_pass, SDL_GPUTextureLocation const * source, SDL_GPUTextureLocation const * destination, Uint32 w, Uint32 h, Uint32 d, bool cycle)} */
    public static void nSDL_CopyGPUTextureToTexture(long copy_pass, long source, long destination, int w, int h, int d, boolean cycle) {
        long __functionAddress = Functions.CopyGPUTextureToTexture;
        if (CHECKS) {
            check(copy_pass);
            SDL_GPUTextureLocation.validate(source);
            SDL_GPUTextureLocation.validate(destination);
        }
        invokePPPV(copy_pass, source, destination, w, h, d, cycle, __functionAddress);
    }

    /** {@code void SDL_CopyGPUTextureToTexture(SDL_GPUCopyPass * copy_pass, SDL_GPUTextureLocation const * source, SDL_GPUTextureLocation const * destination, Uint32 w, Uint32 h, Uint32 d, bool cycle)} */
    public static void SDL_CopyGPUTextureToTexture(@NativeType("SDL_GPUCopyPass *") long copy_pass, @NativeType("SDL_GPUTextureLocation const *") SDL_GPUTextureLocation source, @NativeType("SDL_GPUTextureLocation const *") SDL_GPUTextureLocation destination, @NativeType("Uint32") int w, @NativeType("Uint32") int h, @NativeType("Uint32") int d, @NativeType("bool") boolean cycle) {
        nSDL_CopyGPUTextureToTexture(copy_pass, source.address(), destination.address(), w, h, d, cycle);
    }

    // --- [ SDL_CopyGPUBufferToBuffer ] ---

    /** {@code void SDL_CopyGPUBufferToBuffer(SDL_GPUCopyPass * copy_pass, SDL_GPUBufferLocation const * source, SDL_GPUBufferLocation const * destination, Uint32 size, bool cycle)} */
    public static void nSDL_CopyGPUBufferToBuffer(long copy_pass, long source, long destination, int size, boolean cycle) {
        long __functionAddress = Functions.CopyGPUBufferToBuffer;
        if (CHECKS) {
            check(copy_pass);
            SDL_GPUBufferLocation.validate(source);
            SDL_GPUBufferLocation.validate(destination);
        }
        invokePPPV(copy_pass, source, destination, size, cycle, __functionAddress);
    }

    /** {@code void SDL_CopyGPUBufferToBuffer(SDL_GPUCopyPass * copy_pass, SDL_GPUBufferLocation const * source, SDL_GPUBufferLocation const * destination, Uint32 size, bool cycle)} */
    public static void SDL_CopyGPUBufferToBuffer(@NativeType("SDL_GPUCopyPass *") long copy_pass, @NativeType("SDL_GPUBufferLocation const *") SDL_GPUBufferLocation source, @NativeType("SDL_GPUBufferLocation const *") SDL_GPUBufferLocation destination, @NativeType("Uint32") int size, @NativeType("bool") boolean cycle) {
        nSDL_CopyGPUBufferToBuffer(copy_pass, source.address(), destination.address(), size, cycle);
    }

    // --- [ SDL_DownloadFromGPUTexture ] ---

    /** {@code void SDL_DownloadFromGPUTexture(SDL_GPUCopyPass * copy_pass, SDL_GPUTextureRegion const * source, SDL_GPUTextureTransferInfo const * destination)} */
    public static void nSDL_DownloadFromGPUTexture(long copy_pass, long source, long destination) {
        long __functionAddress = Functions.DownloadFromGPUTexture;
        if (CHECKS) {
            check(copy_pass);
            SDL_GPUTextureRegion.validate(source);
            SDL_GPUTextureTransferInfo.validate(destination);
        }
        invokePPPV(copy_pass, source, destination, __functionAddress);
    }

    /** {@code void SDL_DownloadFromGPUTexture(SDL_GPUCopyPass * copy_pass, SDL_GPUTextureRegion const * source, SDL_GPUTextureTransferInfo const * destination)} */
    public static void SDL_DownloadFromGPUTexture(@NativeType("SDL_GPUCopyPass *") long copy_pass, @NativeType("SDL_GPUTextureRegion const *") SDL_GPUTextureRegion source, @NativeType("SDL_GPUTextureTransferInfo const *") SDL_GPUTextureTransferInfo destination) {
        nSDL_DownloadFromGPUTexture(copy_pass, source.address(), destination.address());
    }

    // --- [ SDL_DownloadFromGPUBuffer ] ---

    /** {@code void SDL_DownloadFromGPUBuffer(SDL_GPUCopyPass * copy_pass, SDL_GPUBufferRegion const * source, SDL_GPUTransferBufferLocation const * destination)} */
    public static void nSDL_DownloadFromGPUBuffer(long copy_pass, long source, long destination) {
        long __functionAddress = Functions.DownloadFromGPUBuffer;
        if (CHECKS) {
            check(copy_pass);
            SDL_GPUBufferRegion.validate(source);
            SDL_GPUTransferBufferLocation.validate(destination);
        }
        invokePPPV(copy_pass, source, destination, __functionAddress);
    }

    /** {@code void SDL_DownloadFromGPUBuffer(SDL_GPUCopyPass * copy_pass, SDL_GPUBufferRegion const * source, SDL_GPUTransferBufferLocation const * destination)} */
    public static void SDL_DownloadFromGPUBuffer(@NativeType("SDL_GPUCopyPass *") long copy_pass, @NativeType("SDL_GPUBufferRegion const *") SDL_GPUBufferRegion source, @NativeType("SDL_GPUTransferBufferLocation const *") SDL_GPUTransferBufferLocation destination) {
        nSDL_DownloadFromGPUBuffer(copy_pass, source.address(), destination.address());
    }

    // --- [ SDL_EndGPUCopyPass ] ---

    /** {@code void SDL_EndGPUCopyPass(SDL_GPUCopyPass * copy_pass)} */
    public static void SDL_EndGPUCopyPass(@NativeType("SDL_GPUCopyPass *") long copy_pass) {
        long __functionAddress = Functions.EndGPUCopyPass;
        if (CHECKS) {
            check(copy_pass);
        }
        invokePV(copy_pass, __functionAddress);
    }

    // --- [ SDL_GenerateMipmapsForGPUTexture ] ---

    /** {@code void SDL_GenerateMipmapsForGPUTexture(SDL_GPUCommandBuffer * command_buffer, SDL_GPUTexture * texture)} */
    public static void SDL_GenerateMipmapsForGPUTexture(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("SDL_GPUTexture *") long texture) {
        long __functionAddress = Functions.GenerateMipmapsForGPUTexture;
        if (CHECKS) {
            check(command_buffer);
            check(texture);
        }
        invokePPV(command_buffer, texture, __functionAddress);
    }

    // --- [ SDL_BlitGPUTexture ] ---

    /** {@code void SDL_BlitGPUTexture(SDL_GPUCommandBuffer * command_buffer, SDL_GPUBlitInfo const * info)} */
    public static void nSDL_BlitGPUTexture(long command_buffer, long info) {
        long __functionAddress = Functions.BlitGPUTexture;
        if (CHECKS) {
            check(command_buffer);
            SDL_GPUBlitInfo.validate(info);
        }
        invokePPV(command_buffer, info, __functionAddress);
    }

    /** {@code void SDL_BlitGPUTexture(SDL_GPUCommandBuffer * command_buffer, SDL_GPUBlitInfo const * info)} */
    public static void SDL_BlitGPUTexture(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("SDL_GPUBlitInfo const *") SDL_GPUBlitInfo info) {
        nSDL_BlitGPUTexture(command_buffer, info.address());
    }

    // --- [ SDL_WindowSupportsGPUSwapchainComposition ] ---

    /** {@code bool SDL_WindowSupportsGPUSwapchainComposition(SDL_GPUDevice * device, SDL_Window * window, SDL_GPUSwapchainComposition swapchain_composition)} */
    @NativeType("bool")
    public static boolean SDL_WindowSupportsGPUSwapchainComposition(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_Window *") long window, @NativeType("SDL_GPUSwapchainComposition") int swapchain_composition) {
        long __functionAddress = Functions.WindowSupportsGPUSwapchainComposition;
        if (CHECKS) {
            check(device);
            check(window);
        }
        return invokePPZ(device, window, swapchain_composition, __functionAddress);
    }

    // --- [ SDL_WindowSupportsGPUPresentMode ] ---

    /** {@code bool SDL_WindowSupportsGPUPresentMode(SDL_GPUDevice * device, SDL_Window * window, SDL_GPUPresentMode present_mode)} */
    @NativeType("bool")
    public static boolean SDL_WindowSupportsGPUPresentMode(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_Window *") long window, @NativeType("SDL_GPUPresentMode") int present_mode) {
        long __functionAddress = Functions.WindowSupportsGPUPresentMode;
        if (CHECKS) {
            check(device);
            check(window);
        }
        return invokePPZ(device, window, present_mode, __functionAddress);
    }

    // --- [ SDL_ClaimWindowForGPUDevice ] ---

    /** {@code bool SDL_ClaimWindowForGPUDevice(SDL_GPUDevice * device, SDL_Window * window)} */
    @NativeType("bool")
    public static boolean SDL_ClaimWindowForGPUDevice(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.ClaimWindowForGPUDevice;
        if (CHECKS) {
            check(device);
            check(window);
        }
        return invokePPZ(device, window, __functionAddress);
    }

    // --- [ SDL_ReleaseWindowFromGPUDevice ] ---

    /** {@code void SDL_ReleaseWindowFromGPUDevice(SDL_GPUDevice * device, SDL_Window * window)} */
    public static void SDL_ReleaseWindowFromGPUDevice(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.ReleaseWindowFromGPUDevice;
        if (CHECKS) {
            check(device);
            check(window);
        }
        invokePPV(device, window, __functionAddress);
    }

    // --- [ SDL_SetGPUSwapchainParameters ] ---

    /** {@code bool SDL_SetGPUSwapchainParameters(SDL_GPUDevice * device, SDL_Window * window, SDL_GPUSwapchainComposition swapchain_composition, SDL_GPUPresentMode present_mode)} */
    @NativeType("bool")
    public static boolean SDL_SetGPUSwapchainParameters(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_Window *") long window, @NativeType("SDL_GPUSwapchainComposition") int swapchain_composition, @NativeType("SDL_GPUPresentMode") int present_mode) {
        long __functionAddress = Functions.SetGPUSwapchainParameters;
        if (CHECKS) {
            check(device);
            check(window);
        }
        return invokePPZ(device, window, swapchain_composition, present_mode, __functionAddress);
    }

    // --- [ SDL_SetGPUAllowedFramesInFlight ] ---

    /** {@code bool SDL_SetGPUAllowedFramesInFlight(SDL_GPUDevice * device, Uint32 allowed_frames_in_flight)} */
    @NativeType("bool")
    public static boolean SDL_SetGPUAllowedFramesInFlight(@NativeType("SDL_GPUDevice *") long device, @NativeType("Uint32") int allowed_frames_in_flight) {
        long __functionAddress = Functions.SetGPUAllowedFramesInFlight;
        if (CHECKS) {
            check(device);
        }
        return invokePZ(device, allowed_frames_in_flight, __functionAddress);
    }

    // --- [ SDL_GetGPUSwapchainTextureFormat ] ---

    /** {@code SDL_GPUTextureFormat SDL_GetGPUSwapchainTextureFormat(SDL_GPUDevice * device, SDL_Window * window)} */
    @NativeType("SDL_GPUTextureFormat")
    public static int SDL_GetGPUSwapchainTextureFormat(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.GetGPUSwapchainTextureFormat;
        if (CHECKS) {
            check(device);
            check(window);
        }
        return invokePPI(device, window, __functionAddress);
    }

    // --- [ SDL_AcquireGPUSwapchainTexture ] ---

    /** {@code bool SDL_AcquireGPUSwapchainTexture(SDL_GPUCommandBuffer * command_buffer, SDL_Window * window, SDL_GPUTexture ** swapchain_texture, Uint32 * swapchain_texture_width, Uint32 * swapchain_texture_height)} */
    public static boolean nSDL_AcquireGPUSwapchainTexture(long command_buffer, long window, long swapchain_texture, long swapchain_texture_width, long swapchain_texture_height) {
        long __functionAddress = Functions.AcquireGPUSwapchainTexture;
        if (CHECKS) {
            check(command_buffer);
            check(window);
        }
        return invokePPPPPZ(command_buffer, window, swapchain_texture, swapchain_texture_width, swapchain_texture_height, __functionAddress);
    }

    /** {@code bool SDL_AcquireGPUSwapchainTexture(SDL_GPUCommandBuffer * command_buffer, SDL_Window * window, SDL_GPUTexture ** swapchain_texture, Uint32 * swapchain_texture_width, Uint32 * swapchain_texture_height)} */
    @NativeType("bool")
    public static boolean SDL_AcquireGPUSwapchainTexture(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("SDL_Window *") long window, @NativeType("SDL_GPUTexture **") PointerBuffer swapchain_texture, @NativeType("Uint32 *") @Nullable IntBuffer swapchain_texture_width, @NativeType("Uint32 *") @Nullable IntBuffer swapchain_texture_height) {
        if (CHECKS) {
            check(swapchain_texture, 1);
            checkSafe(swapchain_texture_width, 1);
            checkSafe(swapchain_texture_height, 1);
        }
        return nSDL_AcquireGPUSwapchainTexture(command_buffer, window, memAddress(swapchain_texture), memAddressSafe(swapchain_texture_width), memAddressSafe(swapchain_texture_height));
    }

    // --- [ SDL_WaitForGPUSwapchain ] ---

    /** {@code bool SDL_WaitForGPUSwapchain(SDL_GPUDevice * device, SDL_Window * window)} */
    @NativeType("bool")
    public static boolean SDL_WaitForGPUSwapchain(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.WaitForGPUSwapchain;
        if (CHECKS) {
            check(device);
            check(window);
        }
        return invokePPZ(device, window, __functionAddress);
    }

    // --- [ SDL_WaitAndAcquireGPUSwapchainTexture ] ---

    /** {@code bool SDL_WaitAndAcquireGPUSwapchainTexture(SDL_GPUCommandBuffer * command_buffer, SDL_Window * window, SDL_GPUTexture ** swapchain_texture, Uint32 * swapchain_texture_width, Uint32 * swapchain_texture_height)} */
    public static boolean nSDL_WaitAndAcquireGPUSwapchainTexture(long command_buffer, long window, long swapchain_texture, long swapchain_texture_width, long swapchain_texture_height) {
        long __functionAddress = Functions.WaitAndAcquireGPUSwapchainTexture;
        if (CHECKS) {
            check(command_buffer);
            check(window);
        }
        return invokePPPPPZ(command_buffer, window, swapchain_texture, swapchain_texture_width, swapchain_texture_height, __functionAddress);
    }

    /** {@code bool SDL_WaitAndAcquireGPUSwapchainTexture(SDL_GPUCommandBuffer * command_buffer, SDL_Window * window, SDL_GPUTexture ** swapchain_texture, Uint32 * swapchain_texture_width, Uint32 * swapchain_texture_height)} */
    @NativeType("bool")
    public static boolean SDL_WaitAndAcquireGPUSwapchainTexture(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("SDL_Window *") long window, @NativeType("SDL_GPUTexture **") PointerBuffer swapchain_texture, @NativeType("Uint32 *") @Nullable IntBuffer swapchain_texture_width, @NativeType("Uint32 *") @Nullable IntBuffer swapchain_texture_height) {
        if (CHECKS) {
            check(swapchain_texture, 1);
            checkSafe(swapchain_texture_width, 1);
            checkSafe(swapchain_texture_height, 1);
        }
        return nSDL_WaitAndAcquireGPUSwapchainTexture(command_buffer, window, memAddress(swapchain_texture), memAddressSafe(swapchain_texture_width), memAddressSafe(swapchain_texture_height));
    }

    // --- [ SDL_SubmitGPUCommandBuffer ] ---

    /** {@code bool SDL_SubmitGPUCommandBuffer(SDL_GPUCommandBuffer * command_buffer)} */
    @NativeType("bool")
    public static boolean SDL_SubmitGPUCommandBuffer(@NativeType("SDL_GPUCommandBuffer *") long command_buffer) {
        long __functionAddress = Functions.SubmitGPUCommandBuffer;
        if (CHECKS) {
            check(command_buffer);
        }
        return invokePZ(command_buffer, __functionAddress);
    }

    // --- [ SDL_SubmitGPUCommandBufferAndAcquireFence ] ---

    /** {@code SDL_GPUFence * SDL_SubmitGPUCommandBufferAndAcquireFence(SDL_GPUCommandBuffer * command_buffer)} */
    @NativeType("SDL_GPUFence *")
    public static long SDL_SubmitGPUCommandBufferAndAcquireFence(@NativeType("SDL_GPUCommandBuffer *") long command_buffer) {
        long __functionAddress = Functions.SubmitGPUCommandBufferAndAcquireFence;
        if (CHECKS) {
            check(command_buffer);
        }
        return invokePP(command_buffer, __functionAddress);
    }

    // --- [ SDL_CancelGPUCommandBuffer ] ---

    /** {@code bool SDL_CancelGPUCommandBuffer(SDL_GPUCommandBuffer * command_buffer)} */
    @NativeType("bool")
    public static boolean SDL_CancelGPUCommandBuffer(@NativeType("SDL_GPUCommandBuffer *") long command_buffer) {
        long __functionAddress = Functions.CancelGPUCommandBuffer;
        if (CHECKS) {
            check(command_buffer);
        }
        return invokePZ(command_buffer, __functionAddress);
    }

    // --- [ SDL_WaitForGPUIdle ] ---

    /** {@code bool SDL_WaitForGPUIdle(SDL_GPUDevice * device)} */
    @NativeType("bool")
    public static boolean SDL_WaitForGPUIdle(@NativeType("SDL_GPUDevice *") long device) {
        long __functionAddress = Functions.WaitForGPUIdle;
        if (CHECKS) {
            check(device);
        }
        return invokePZ(device, __functionAddress);
    }

    // --- [ SDL_WaitForGPUFences ] ---

    /** {@code bool SDL_WaitForGPUFences(SDL_GPUDevice * device, bool wait_all, SDL_GPUFence * const * fences, Uint32 num_fences)} */
    public static boolean nSDL_WaitForGPUFences(long device, boolean wait_all, long fences, int num_fences) {
        long __functionAddress = Functions.WaitForGPUFences;
        if (CHECKS) {
            check(device);
        }
        return invokePPZ(device, wait_all, fences, num_fences, __functionAddress);
    }

    /** {@code bool SDL_WaitForGPUFences(SDL_GPUDevice * device, bool wait_all, SDL_GPUFence * const * fences, Uint32 num_fences)} */
    @NativeType("bool")
    public static boolean SDL_WaitForGPUFences(@NativeType("SDL_GPUDevice *") long device, @NativeType("bool") boolean wait_all, @NativeType("SDL_GPUFence * const *") @Nullable PointerBuffer fences) {
        return nSDL_WaitForGPUFences(device, wait_all, memAddressSafe(fences), remainingSafe(fences));
    }

    // --- [ SDL_QueryGPUFence ] ---

    /** {@code bool SDL_QueryGPUFence(SDL_GPUDevice * device, SDL_GPUFence * fence)} */
    @NativeType("bool")
    public static boolean SDL_QueryGPUFence(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUFence *") long fence) {
        long __functionAddress = Functions.QueryGPUFence;
        if (CHECKS) {
            check(device);
            check(fence);
        }
        return invokePPZ(device, fence, __functionAddress);
    }

    // --- [ SDL_ReleaseGPUFence ] ---

    /** {@code void SDL_ReleaseGPUFence(SDL_GPUDevice * device, SDL_GPUFence * fence)} */
    public static void SDL_ReleaseGPUFence(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUFence *") long fence) {
        long __functionAddress = Functions.ReleaseGPUFence;
        if (CHECKS) {
            check(device);
            check(fence);
        }
        invokePPV(device, fence, __functionAddress);
    }

    // --- [ SDL_GPUTextureFormatTexelBlockSize ] ---

    /** {@code Uint32 SDL_GPUTextureFormatTexelBlockSize(SDL_GPUTextureFormat format)} */
    @NativeType("Uint32")
    public static int SDL_GPUTextureFormatTexelBlockSize(@NativeType("SDL_GPUTextureFormat") int format) {
        long __functionAddress = Functions.GPUTextureFormatTexelBlockSize;
        return invokeI(format, __functionAddress);
    }

    // --- [ SDL_GPUTextureSupportsFormat ] ---

    /** {@code bool SDL_GPUTextureSupportsFormat(SDL_GPUDevice * device, SDL_GPUTextureFormat format, SDL_GPUTextureType type, SDL_GPUTextureUsageFlags usage)} */
    @NativeType("bool")
    public static boolean SDL_GPUTextureSupportsFormat(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUTextureFormat") int format, @NativeType("SDL_GPUTextureType") int type, @NativeType("SDL_GPUTextureUsageFlags") int usage) {
        long __functionAddress = Functions.GPUTextureSupportsFormat;
        if (CHECKS) {
            check(device);
        }
        return invokePZ(device, format, type, usage, __functionAddress);
    }

    // --- [ SDL_GPUTextureSupportsSampleCount ] ---

    /** {@code bool SDL_GPUTextureSupportsSampleCount(SDL_GPUDevice * device, SDL_GPUTextureFormat format, SDL_GPUSampleCount sample_count)} */
    @NativeType("bool")
    public static boolean SDL_GPUTextureSupportsSampleCount(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUTextureFormat") int format, @NativeType("SDL_GPUSampleCount") int sample_count) {
        long __functionAddress = Functions.GPUTextureSupportsSampleCount;
        if (CHECKS) {
            check(device);
        }
        return invokePZ(device, format, sample_count, __functionAddress);
    }

    // --- [ SDL_CalculateGPUTextureFormatSize ] ---

    /** {@code Uint32 SDL_CalculateGPUTextureFormatSize(SDL_GPUTextureFormat format, Uint32 width, Uint32 height, Uint32 depth_or_layer_count)} */
    @NativeType("Uint32")
    public static int SDL_CalculateGPUTextureFormatSize(@NativeType("SDL_GPUTextureFormat") int format, @NativeType("Uint32") int width, @NativeType("Uint32") int height, @NativeType("Uint32") int depth_or_layer_count) {
        long __functionAddress = Functions.CalculateGPUTextureFormatSize;
        return invokeI(format, width, height, depth_or_layer_count, __functionAddress);
    }

    // --- [ SDL_GetPixelFormatFromGPUTextureFormat ] ---

    /** {@code SDL_PixelFormat SDL_GetPixelFormatFromGPUTextureFormat(SDL_GPUTextureFormat format)} */
    @NativeType("SDL_PixelFormat")
    public static int SDL_GetPixelFormatFromGPUTextureFormat(@NativeType("SDL_GPUTextureFormat") int format) {
        long __functionAddress = Functions.GetPixelFormatFromGPUTextureFormat;
        return invokeI(format, __functionAddress);
    }

    // --- [ SDL_GetGPUTextureFormatFromPixelFormat ] ---

    /** {@code SDL_GPUTextureFormat SDL_GetGPUTextureFormatFromPixelFormat(SDL_PixelFormat format)} */
    @NativeType("SDL_GPUTextureFormat")
    public static int SDL_GetGPUTextureFormatFromPixelFormat(@NativeType("SDL_PixelFormat") int format) {
        long __functionAddress = Functions.GetGPUTextureFormatFromPixelFormat;
        return invokeI(format, __functionAddress);
    }

}