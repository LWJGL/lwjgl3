/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

val SDL_gpu = "SDLGPU".nativeClassSDL("SDL_gpu") {
    EnumConstant(
        "GPU_PRIMITIVETYPE_TRIANGLELIST".enum("0"),
        "GPU_PRIMITIVETYPE_TRIANGLESTRIP".enum,
        "GPU_PRIMITIVETYPE_LINELIST".enum,
        "GPU_PRIMITIVETYPE_LINESTRIP".enum,
        "GPU_PRIMITIVETYPE_POINTLIST".enum
    )

    EnumConstant(
        "GPU_LOADOP_LOAD".enum("0"),
        "GPU_LOADOP_CLEAR".enum,
        "GPU_LOADOP_DONT_CARE".enum
    )

    EnumConstant(
        "GPU_STOREOP_STORE".enum("0"),
        "GPU_STOREOP_DONT_CARE".enum,
        "GPU_STOREOP_RESOLVE".enum,
        "GPU_STOREOP_RESOLVE_AND_STORE".enum
    )

    EnumConstant(
        "GPU_INDEXELEMENTSIZE_16BIT".enum("0"),
        "GPU_INDEXELEMENTSIZE_32BIT".enum
    )

    EnumConstant(
        "GPU_TEXTUREFORMAT_INVALID".enum("0"),
        "GPU_TEXTUREFORMAT_A8_UNORM".enum,
        "GPU_TEXTUREFORMAT_R8_UNORM".enum,
        "GPU_TEXTUREFORMAT_R8G8_UNORM".enum,
        "GPU_TEXTUREFORMAT_R8G8B8A8_UNORM".enum,
        "GPU_TEXTUREFORMAT_R16_UNORM".enum,
        "GPU_TEXTUREFORMAT_R16G16_UNORM".enum,
        "GPU_TEXTUREFORMAT_R16G16B16A16_UNORM".enum,
        "GPU_TEXTUREFORMAT_R10G10B10A2_UNORM".enum,
        "GPU_TEXTUREFORMAT_B5G6R5_UNORM".enum,
        "GPU_TEXTUREFORMAT_B5G5R5A1_UNORM".enum,
        "GPU_TEXTUREFORMAT_B4G4R4A4_UNORM".enum,
        "GPU_TEXTUREFORMAT_B8G8R8A8_UNORM".enum,
        "GPU_TEXTUREFORMAT_BC1_RGBA_UNORM".enum,
        "GPU_TEXTUREFORMAT_BC2_RGBA_UNORM".enum,
        "GPU_TEXTUREFORMAT_BC3_RGBA_UNORM".enum,
        "GPU_TEXTUREFORMAT_BC4_R_UNORM".enum,
        "GPU_TEXTUREFORMAT_BC5_RG_UNORM".enum,
        "GPU_TEXTUREFORMAT_BC7_RGBA_UNORM".enum,
        "GPU_TEXTUREFORMAT_BC6H_RGB_FLOAT".enum,
        "GPU_TEXTUREFORMAT_BC6H_RGB_UFLOAT".enum,
        "GPU_TEXTUREFORMAT_R8_SNORM".enum,
        "GPU_TEXTUREFORMAT_R8G8_SNORM".enum,
        "GPU_TEXTUREFORMAT_R8G8B8A8_SNORM".enum,
        "GPU_TEXTUREFORMAT_R16_SNORM".enum,
        "GPU_TEXTUREFORMAT_R16G16_SNORM".enum,
        "GPU_TEXTUREFORMAT_R16G16B16A16_SNORM".enum,
        "GPU_TEXTUREFORMAT_R16_FLOAT".enum,
        "GPU_TEXTUREFORMAT_R16G16_FLOAT".enum,
        "GPU_TEXTUREFORMAT_R16G16B16A16_FLOAT".enum,
        "GPU_TEXTUREFORMAT_R32_FLOAT".enum,
        "GPU_TEXTUREFORMAT_R32G32_FLOAT".enum,
        "GPU_TEXTUREFORMAT_R32G32B32A32_FLOAT".enum,
        "GPU_TEXTUREFORMAT_R11G11B10_UFLOAT".enum,
        "GPU_TEXTUREFORMAT_R8_UINT".enum,
        "GPU_TEXTUREFORMAT_R8G8_UINT".enum,
        "GPU_TEXTUREFORMAT_R8G8B8A8_UINT".enum,
        "GPU_TEXTUREFORMAT_R16_UINT".enum,
        "GPU_TEXTUREFORMAT_R16G16_UINT".enum,
        "GPU_TEXTUREFORMAT_R16G16B16A16_UINT".enum,
        "GPU_TEXTUREFORMAT_R32_UINT".enum,
        "GPU_TEXTUREFORMAT_R32G32_UINT".enum,
        "GPU_TEXTUREFORMAT_R32G32B32A32_UINT".enum,
        "GPU_TEXTUREFORMAT_R8_INT".enum,
        "GPU_TEXTUREFORMAT_R8G8_INT".enum,
        "GPU_TEXTUREFORMAT_R8G8B8A8_INT".enum,
        "GPU_TEXTUREFORMAT_R16_INT".enum,
        "GPU_TEXTUREFORMAT_R16G16_INT".enum,
        "GPU_TEXTUREFORMAT_R16G16B16A16_INT".enum,
        "GPU_TEXTUREFORMAT_R32_INT".enum,
        "GPU_TEXTUREFORMAT_R32G32_INT".enum,
        "GPU_TEXTUREFORMAT_R32G32B32A32_INT".enum,
        "GPU_TEXTUREFORMAT_R8G8B8A8_UNORM_SRGB".enum,
        "GPU_TEXTUREFORMAT_B8G8R8A8_UNORM_SRGB".enum,
        "GPU_TEXTUREFORMAT_BC1_RGBA_UNORM_SRGB".enum,
        "GPU_TEXTUREFORMAT_BC2_RGBA_UNORM_SRGB".enum,
        "GPU_TEXTUREFORMAT_BC3_RGBA_UNORM_SRGB".enum,
        "GPU_TEXTUREFORMAT_BC7_RGBA_UNORM_SRGB".enum,
        "GPU_TEXTUREFORMAT_D16_UNORM".enum,
        "GPU_TEXTUREFORMAT_D24_UNORM".enum,
        "GPU_TEXTUREFORMAT_D32_FLOAT".enum,
        "GPU_TEXTUREFORMAT_D24_UNORM_S8_UINT".enum,
        "GPU_TEXTUREFORMAT_D32_FLOAT_S8_UINT".enum,
        "GPU_TEXTUREFORMAT_ASTC_4x4_UNORM".enum,
        "GPU_TEXTUREFORMAT_ASTC_5x4_UNORM".enum,
        "GPU_TEXTUREFORMAT_ASTC_5x5_UNORM".enum,
        "GPU_TEXTUREFORMAT_ASTC_6x5_UNORM".enum,
        "GPU_TEXTUREFORMAT_ASTC_6x6_UNORM".enum,
        "GPU_TEXTUREFORMAT_ASTC_8x5_UNORM".enum,
        "GPU_TEXTUREFORMAT_ASTC_8x6_UNORM".enum,
        "GPU_TEXTUREFORMAT_ASTC_8x8_UNORM".enum,
        "GPU_TEXTUREFORMAT_ASTC_10x5_UNORM".enum,
        "GPU_TEXTUREFORMAT_ASTC_10x6_UNORM".enum,
        "GPU_TEXTUREFORMAT_ASTC_10x8_UNORM".enum,
        "GPU_TEXTUREFORMAT_ASTC_10x10_UNORM".enum,
        "GPU_TEXTUREFORMAT_ASTC_12x10_UNORM".enum,
        "GPU_TEXTUREFORMAT_ASTC_12x12_UNORM".enum,
        "GPU_TEXTUREFORMAT_ASTC_4x4_UNORM_SRGB".enum,
        "GPU_TEXTUREFORMAT_ASTC_5x4_UNORM_SRGB".enum,
        "GPU_TEXTUREFORMAT_ASTC_5x5_UNORM_SRGB".enum,
        "GPU_TEXTUREFORMAT_ASTC_6x5_UNORM_SRGB".enum,
        "GPU_TEXTUREFORMAT_ASTC_6x6_UNORM_SRGB".enum,
        "GPU_TEXTUREFORMAT_ASTC_8x5_UNORM_SRGB".enum,
        "GPU_TEXTUREFORMAT_ASTC_8x6_UNORM_SRGB".enum,
        "GPU_TEXTUREFORMAT_ASTC_8x8_UNORM_SRGB".enum,
        "GPU_TEXTUREFORMAT_ASTC_10x5_UNORM_SRGB".enum,
        "GPU_TEXTUREFORMAT_ASTC_10x6_UNORM_SRGB".enum,
        "GPU_TEXTUREFORMAT_ASTC_10x8_UNORM_SRGB".enum,
        "GPU_TEXTUREFORMAT_ASTC_10x10_UNORM_SRGB".enum,
        "GPU_TEXTUREFORMAT_ASTC_12x10_UNORM_SRGB".enum,
        "GPU_TEXTUREFORMAT_ASTC_12x12_UNORM_SRGB".enum,
        "GPU_TEXTUREFORMAT_ASTC_4x4_FLOAT".enum,
        "GPU_TEXTUREFORMAT_ASTC_5x4_FLOAT".enum,
        "GPU_TEXTUREFORMAT_ASTC_5x5_FLOAT".enum,
        "GPU_TEXTUREFORMAT_ASTC_6x5_FLOAT".enum,
        "GPU_TEXTUREFORMAT_ASTC_6x6_FLOAT".enum,
        "GPU_TEXTUREFORMAT_ASTC_8x5_FLOAT".enum,
        "GPU_TEXTUREFORMAT_ASTC_8x6_FLOAT".enum,
        "GPU_TEXTUREFORMAT_ASTC_8x8_FLOAT".enum,
        "GPU_TEXTUREFORMAT_ASTC_10x5_FLOAT".enum,
        "GPU_TEXTUREFORMAT_ASTC_10x6_FLOAT".enum,
        "GPU_TEXTUREFORMAT_ASTC_10x8_FLOAT".enum,
        "GPU_TEXTUREFORMAT_ASTC_10x10_FLOAT".enum,
        "GPU_TEXTUREFORMAT_ASTC_12x10_FLOAT".enum,
        "GPU_TEXTUREFORMAT_ASTC_12x12_FLOAT".enum
    )

    IntConstant(
        "GPU_TEXTUREUSAGE_SAMPLER".."(1 << 0)",
        "GPU_TEXTUREUSAGE_COLOR_TARGET".."(1 << 1)",
        "GPU_TEXTUREUSAGE_DEPTH_STENCIL_TARGET".."(1 << 2)",
        "GPU_TEXTUREUSAGE_GRAPHICS_STORAGE_READ".."(1 << 3)",
        "GPU_TEXTUREUSAGE_COMPUTE_STORAGE_READ".."(1 << 4)",
        "GPU_TEXTUREUSAGE_COMPUTE_STORAGE_WRITE".."(1 << 5)",
        "GPU_TEXTUREUSAGE_COMPUTE_STORAGE_SIMULTANEOUS_READ_WRITE".."(1 << 6)"
    )

    EnumConstant(
        "GPU_TEXTURETYPE_2D".enum("0"),
        "GPU_TEXTURETYPE_2D_ARRAY".enum,
        "GPU_TEXTURETYPE_3D".enum,
        "GPU_TEXTURETYPE_CUBE".enum,
        "GPU_TEXTURETYPE_CUBE_ARRAY".enum
    )

    EnumConstant(
        "GPU_SAMPLECOUNT_1".enum("0"),
        "GPU_SAMPLECOUNT_2".enum,
        "GPU_SAMPLECOUNT_4".enum,
        "GPU_SAMPLECOUNT_8".enum
    )

    EnumConstant(
        "GPU_CUBEMAPFACE_POSITIVEX".enum("0"),
        "GPU_CUBEMAPFACE_NEGATIVEX".enum,
        "GPU_CUBEMAPFACE_POSITIVEY".enum,
        "GPU_CUBEMAPFACE_NEGATIVEY".enum,
        "GPU_CUBEMAPFACE_POSITIVEZ".enum,
        "GPU_CUBEMAPFACE_NEGATIVEZ".enum
    )

    IntConstant(
        "GPU_BUFFERUSAGE_VERTEX".."(1 << 0)",
        "GPU_BUFFERUSAGE_INDEX".."(1 << 1)",
        "GPU_BUFFERUSAGE_INDIRECT".."(1 << 2)",
        "GPU_BUFFERUSAGE_GRAPHICS_STORAGE_READ".."(1 << 3)",
        "GPU_BUFFERUSAGE_COMPUTE_STORAGE_READ".."(1 << 4)",
        "GPU_BUFFERUSAGE_COMPUTE_STORAGE_WRITE".."(1 << 5)"
    )

    EnumConstant(
        "GPU_TRANSFERBUFFERUSAGE_UPLOAD".enum("0"),
        "GPU_TRANSFERBUFFERUSAGE_DOWNLOAD".enum
    )

    EnumConstant(
        "GPU_SHADERSTAGE_VERTEX".enum("0"),
        "GPU_SHADERSTAGE_FRAGMENT".enum
    )

    IntConstant(
        "GPU_SHADERFORMAT_INVALID".."0",
        "GPU_SHADERFORMAT_PRIVATE".."(1 << 0)",
        "GPU_SHADERFORMAT_SPIRV".."(1 << 1)",
        "GPU_SHADERFORMAT_DXBC".."(1 << 2)",
        "GPU_SHADERFORMAT_DXIL".."(1 << 3)",
        "GPU_SHADERFORMAT_MSL".."(1 << 4)",
        "GPU_SHADERFORMAT_METALLIB".."(1 << 5)"
    )

    EnumConstant(
        "GPU_VERTEXELEMENTFORMAT_INVALID".enum("0"),
        "GPU_VERTEXELEMENTFORMAT_INT".enum,
        "GPU_VERTEXELEMENTFORMAT_INT2".enum,
        "GPU_VERTEXELEMENTFORMAT_INT3".enum,
        "GPU_VERTEXELEMENTFORMAT_INT4".enum,
        "GPU_VERTEXELEMENTFORMAT_UINT".enum,
        "GPU_VERTEXELEMENTFORMAT_UINT2".enum,
        "GPU_VERTEXELEMENTFORMAT_UINT3".enum,
        "GPU_VERTEXELEMENTFORMAT_UINT4".enum,
        "GPU_VERTEXELEMENTFORMAT_FLOAT".enum,
        "GPU_VERTEXELEMENTFORMAT_FLOAT2".enum,
        "GPU_VERTEXELEMENTFORMAT_FLOAT3".enum,
        "GPU_VERTEXELEMENTFORMAT_FLOAT4".enum,
        "GPU_VERTEXELEMENTFORMAT_BYTE2".enum,
        "GPU_VERTEXELEMENTFORMAT_BYTE4".enum,
        "GPU_VERTEXELEMENTFORMAT_UBYTE2".enum,
        "GPU_VERTEXELEMENTFORMAT_UBYTE4".enum,
        "GPU_VERTEXELEMENTFORMAT_BYTE2_NORM".enum,
        "GPU_VERTEXELEMENTFORMAT_BYTE4_NORM".enum,
        "GPU_VERTEXELEMENTFORMAT_UBYTE2_NORM".enum,
        "GPU_VERTEXELEMENTFORMAT_UBYTE4_NORM".enum,
        "GPU_VERTEXELEMENTFORMAT_SHORT2".enum,
        "GPU_VERTEXELEMENTFORMAT_SHORT4".enum,
        "GPU_VERTEXELEMENTFORMAT_USHORT2".enum,
        "GPU_VERTEXELEMENTFORMAT_USHORT4".enum,
        "GPU_VERTEXELEMENTFORMAT_SHORT2_NORM".enum,
        "GPU_VERTEXELEMENTFORMAT_SHORT4_NORM".enum,
        "GPU_VERTEXELEMENTFORMAT_USHORT2_NORM".enum,
        "GPU_VERTEXELEMENTFORMAT_USHORT4_NORM".enum,
        "GPU_VERTEXELEMENTFORMAT_HALF2".enum,
        "GPU_VERTEXELEMENTFORMAT_HALF4".enum
    )

    EnumConstant(
        "GPU_VERTEXINPUTRATE_VERTEX".enum("0"),
        "GPU_VERTEXINPUTRATE_INSTANCE".enum
    )

    EnumConstant(
        "GPU_FILLMODE_FILL".enum("0"),
        "GPU_FILLMODE_LINE".enum
    )

    EnumConstant(
        "GPU_CULLMODE_NONE".enum("0"),
        "GPU_CULLMODE_FRONT".enum,
        "GPU_CULLMODE_BACK".enum
    )

    EnumConstant(
        "GPU_FRONTFACE_COUNTER_CLOCKWISE".enum("0"),
        "GPU_FRONTFACE_CLOCKWISE".enum
    )

    EnumConstant(
        "GPU_COMPAREOP_INVALID".enum("0"),
        "GPU_COMPAREOP_NEVER".enum,
        "GPU_COMPAREOP_LESS".enum,
        "GPU_COMPAREOP_EQUAL".enum,
        "GPU_COMPAREOP_LESS_OR_EQUAL".enum,
        "GPU_COMPAREOP_GREATER".enum,
        "GPU_COMPAREOP_NOT_EQUAL".enum,
        "GPU_COMPAREOP_GREATER_OR_EQUAL".enum,
        "GPU_COMPAREOP_ALWAYS".enum
    )

    EnumConstant(
        "GPU_STENCILOP_INVALID".enum("0"),
        "GPU_STENCILOP_KEEP".enum,
        "GPU_STENCILOP_ZERO".enum,
        "GPU_STENCILOP_REPLACE".enum,
        "GPU_STENCILOP_INCREMENT_AND_CLAMP".enum,
        "GPU_STENCILOP_DECREMENT_AND_CLAMP".enum,
        "GPU_STENCILOP_INVERT".enum,
        "GPU_STENCILOP_INCREMENT_AND_WRAP".enum,
        "GPU_STENCILOP_DECREMENT_AND_WRAP".enum
    )

    EnumConstant(
        "GPU_BLENDOP_INVALID".enum("0"),
        "GPU_BLENDOP_ADD".enum,
        "GPU_BLENDOP_SUBTRACT".enum,
        "GPU_BLENDOP_REVERSE_SUBTRACT".enum,
        "GPU_BLENDOP_MIN".enum,
        "GPU_BLENDOP_MAX".enum
    )

    EnumConstant(
        "GPU_BLENDFACTOR_INVALID".enum("0"),
        "GPU_BLENDFACTOR_ZERO".enum,
        "GPU_BLENDFACTOR_ONE".enum,
        "GPU_BLENDFACTOR_SRC_COLOR".enum,
        "GPU_BLENDFACTOR_ONE_MINUS_SRC_COLOR".enum,
        "GPU_BLENDFACTOR_DST_COLOR".enum,
        "GPU_BLENDFACTOR_ONE_MINUS_DST_COLOR".enum,
        "GPU_BLENDFACTOR_SRC_ALPHA".enum,
        "GPU_BLENDFACTOR_ONE_MINUS_SRC_ALPHA".enum,
        "GPU_BLENDFACTOR_DST_ALPHA".enum,
        "GPU_BLENDFACTOR_ONE_MINUS_DST_ALPHA".enum,
        "GPU_BLENDFACTOR_CONSTANT_COLOR".enum,
        "GPU_BLENDFACTOR_ONE_MINUS_CONSTANT_COLOR".enum,
        "GPU_BLENDFACTOR_SRC_ALPHA_SATURATE".enum
    )

    IntConstant(
        "GPU_COLORCOMPONENT_R".."(1 << 0)",
        "GPU_COLORCOMPONENT_G".."(1 << 1)",
        "GPU_COLORCOMPONENT_B".."(1 << 2)",
        "GPU_COLORCOMPONENT_A".."(1 << 3)"
    )

    EnumConstant(
        "GPU_FILTER_NEAREST".enum("0"),
        "GPU_FILTER_LINEAR".enum
    )

    EnumConstant(
        "GPU_SAMPLERMIPMAPMODE_NEAREST".enum("0"),
        "GPU_SAMPLERMIPMAPMODE_LINEAR".enum
    )

    EnumConstant(
        "GPU_SAMPLERADDRESSMODE_REPEAT".enum("0"),
        "GPU_SAMPLERADDRESSMODE_MIRRORED_REPEAT".enum,
        "GPU_SAMPLERADDRESSMODE_CLAMP_TO_EDGE".enum
    )

    EnumConstant(
        "GPU_PRESENTMODE_VSYNC".enum("0"),
        "GPU_PRESENTMODE_IMMEDIATE".enum,
        "GPU_PRESENTMODE_MAILBOX".enum
    )

    EnumConstant(
        "GPU_SWAPCHAINCOMPOSITION_SDR".enum("0"),
        "GPU_SWAPCHAINCOMPOSITION_SDR_LINEAR".enum,
        "GPU_SWAPCHAINCOMPOSITION_HDR_EXTENDED_LINEAR".enum,
        "GPU_SWAPCHAINCOMPOSITION_HDR10_ST2084".enum
    )

    StringConstant(
        "PROP_GPU_DEVICE_CREATE_DEBUGMODE_BOOLEAN".."SDL.gpu.device.create.debugmode",
        "PROP_GPU_DEVICE_CREATE_PREFERLOWPOWER_BOOLEAN".."SDL.gpu.device.create.preferlowpower",
        "PROP_GPU_DEVICE_CREATE_VERBOSE_BOOLEAN".."SDL.gpu.device.create.verbose",
        "PROP_GPU_DEVICE_CREATE_NAME_STRING".."SDL.gpu.device.create.name",
        "PROP_GPU_DEVICE_CREATE_FEATURE_CLIP_DISTANCE_BOOLEAN".."SDL.gpu.device.create.feature.clip_distance",
        "PROP_GPU_DEVICE_CREATE_FEATURE_DEPTH_CLAMPING_BOOLEAN".."SDL.gpu.device.create.feature.depth_clamping",
        "PROP_GPU_DEVICE_CREATE_FEATURE_INDIRECT_DRAW_FIRST_INSTANCE_BOOLEAN".."SDL.gpu.device.create.feature.indirect_draw_first_instance",
        "PROP_GPU_DEVICE_CREATE_FEATURE_ANISOTROPY_BOOLEAN".."SDL.gpu.device.create.feature.anisotropy",
        "PROP_GPU_DEVICE_CREATE_SHADERS_PRIVATE_BOOLEAN".."SDL.gpu.device.create.shaders.private",
        "PROP_GPU_DEVICE_CREATE_SHADERS_SPIRV_BOOLEAN".."SDL.gpu.device.create.shaders.spirv",
        "PROP_GPU_DEVICE_CREATE_SHADERS_DXBC_BOOLEAN".."SDL.gpu.device.create.shaders.dxbc",
        "PROP_GPU_DEVICE_CREATE_SHADERS_DXIL_BOOLEAN".."SDL.gpu.device.create.shaders.dxil",
        "PROP_GPU_DEVICE_CREATE_SHADERS_MSL_BOOLEAN".."SDL.gpu.device.create.shaders.msl",
        "PROP_GPU_DEVICE_CREATE_SHADERS_METALLIB_BOOLEAN".."SDL.gpu.device.create.shaders.metallib",
        "PROP_GPU_DEVICE_CREATE_D3D12_ALLOW_FEWER_RESOURCE_SLOTS_BOOLEAN".."SDL.gpu.device.create.d3d12.allowtier1resourcebinding",
        "PROP_GPU_DEVICE_CREATE_D3D12_SEMANTIC_NAME_STRING".."SDL.gpu.device.create.d3d12.semantic",
        "PROP_GPU_DEVICE_CREATE_D3D12_AGILITY_SDK_VERSION_NUMBER".."SDL.gpu.device.create.d3d12.agility_sdk_version",
        "PROP_GPU_DEVICE_CREATE_D3D12_AGILITY_SDK_PATH_STRING".."SDL.gpu.device.create.d3d12.agility_sdk_path",
        "PROP_GPU_DEVICE_CREATE_VULKAN_REQUIRE_HARDWARE_ACCELERATION_BOOLEAN".."SDL.gpu.device.create.vulkan.requirehardwareacceleration",
        "PROP_GPU_DEVICE_CREATE_VULKAN_OPTIONS_POINTER".."SDL.gpu.device.create.vulkan.options",
        "PROP_GPU_DEVICE_CREATE_METAL_ALLOW_MACFAMILY1_BOOLEAN".."SDL.gpu.device.create.metal.allowmacfamily1"
    )

    StringConstant(
        "PROP_GPU_TEXTURE_CREATE_D3D12_CLEAR_R_FLOAT".."SDL.gpu.texture.create.d3d12.clear.r",
        "PROP_GPU_TEXTURE_CREATE_D3D12_CLEAR_G_FLOAT".."SDL.gpu.texture.create.d3d12.clear.g",
        "PROP_GPU_TEXTURE_CREATE_D3D12_CLEAR_B_FLOAT".."SDL.gpu.texture.create.d3d12.clear.b",
        "PROP_GPU_TEXTURE_CREATE_D3D12_CLEAR_A_FLOAT".."SDL.gpu.texture.create.d3d12.clear.a",
        "PROP_GPU_TEXTURE_CREATE_D3D12_CLEAR_DEPTH_FLOAT".."SDL.gpu.texture.create.d3d12.clear.depth",
        "PROP_GPU_TEXTURE_CREATE_D3D12_CLEAR_STENCIL_NUMBER".."SDL.gpu.texture.create.d3d12.clear.stencil"
    )

    StringConstant(
        "PROP_GPU_DEVICE_NAME_STRING".."SDL.gpu.device.name",
        "PROP_GPU_DEVICE_DRIVER_NAME_STRING".."SDL.gpu.device.driver_name",
        "PROP_GPU_DEVICE_DRIVER_VERSION_STRING".."SDL.gpu.device.driver_version",
        "PROP_GPU_DEVICE_DRIVER_INFO_STRING".."SDL.gpu.device.driver_info"
    )

    StringConstant(
        "PROP_GPU_COMPUTEPIPELINE_CREATE_NAME_STRING".."SDL.gpu.computepipeline.create.name",
        "PROP_GPU_GRAPHICSPIPELINE_CREATE_NAME_STRING".."SDL.gpu.graphicspipeline.create.name",
        "PROP_GPU_SAMPLER_CREATE_NAME_STRING".."SDL.gpu.sampler.create.name",
        "PROP_GPU_SHADER_CREATE_NAME_STRING".."SDL.gpu.shader.create.name",
        "PROP_GPU_TEXTURE_CREATE_NAME_STRING".."SDL.gpu.texture.create.name",
        "PROP_GPU_BUFFER_CREATE_NAME_STRING".."SDL.gpu.buffer.create.name",
        "PROP_GPU_TRANSFERBUFFER_CREATE_NAME_STRING".."SDL.gpu.transferbuffer.create.name"
    )

    bool(
        "GPUSupportsShaderFormats",

        SDL_GPUShaderFormat("format_flags"),
        nullable..charUTF8.const.p("name")
    )

    bool(
        "GPUSupportsProperties",

        SDL_PropertiesID("props")
    )

    SDL_GPUDevice.p(
        "CreateGPUDevice",

        SDL_GPUShaderFormat("format_flags"),
        bool("debug_mode"),
        nullable..charUTF8.const.p("name")
    )

    SDL_GPUDevice.p(
        "CreateGPUDeviceWithProperties",

        SDL_PropertiesID("props")
    )

    void(
        "DestroyGPUDevice",

        SDL_GPUDevice.p("device")
    )

    int(
        "GetNumGPUDrivers",

        void()
    )

    charUTF8.const.p(
        "GetGPUDriver",

        int("index")
    )

    charUTF8.const.p(
        "GetGPUDeviceDriver",

        SDL_GPUDevice.p("device")
    )

    SDL_GPUShaderFormat(
        "GetGPUShaderFormats",

        SDL_GPUDevice.p("device")
    )

    SDL_PropertiesID(
        "GetGPUDeviceProperties",

        SDL_GPUDevice.p("device")
    )

    SDL_GPUComputePipeline.p(
        "CreateGPUComputePipeline",

        SDL_GPUDevice.p("device"),
        SDL_GPUComputePipelineCreateInfo.const.p("createinfo")
    )

    SDL_GPUGraphicsPipeline.p(
        "CreateGPUGraphicsPipeline",

        SDL_GPUDevice.p("device"),
        SDL_GPUGraphicsPipelineCreateInfo.const.p("createinfo")
    )

    SDL_GPUSampler.p(
        "CreateGPUSampler",

        SDL_GPUDevice.p("device"),
        SDL_GPUSamplerCreateInfo.const.p("createinfo")
    )

    SDL_GPUShader.p(
        "CreateGPUShader",

        SDL_GPUDevice.p("device"),
        SDL_GPUShaderCreateInfo.const.p("createinfo")
    )

    SDL_GPUTexture.p(
        "CreateGPUTexture",

        SDL_GPUDevice.p("device"),
        SDL_GPUTextureCreateInfo.const.p("createinfo")
    )

    SDL_GPUBuffer.p(
        "CreateGPUBuffer",

        SDL_GPUDevice.p("device"),
        SDL_GPUBufferCreateInfo.const.p("createinfo")
    )

    SDL_GPUTransferBuffer.p(
        "CreateGPUTransferBuffer",

        SDL_GPUDevice.p("device"),
        SDL_GPUTransferBufferCreateInfo.const.p("createinfo")
    )

    void(
        "SetGPUBufferName",

        SDL_GPUDevice.p("device"),
        SDL_GPUBuffer.p("buffer"),
        charUTF8.const.p("text")
    )

    void(
        "SetGPUTextureName",

        SDL_GPUDevice.p("device"),
        SDL_GPUTexture.p("texture"),
        charUTF8.const.p("text")
    )

    void(
        "InsertGPUDebugLabel",

        SDL_GPUCommandBuffer.p("command_buffer"),
        charUTF8.const.p("text")
    )

    void(
        "PushGPUDebugGroup",

        SDL_GPUCommandBuffer.p("command_buffer"),
        charUTF8.const.p("name")
    )

    void(
        "PopGPUDebugGroup",

        SDL_GPUCommandBuffer.p("command_buffer")
    )

    void(
        "ReleaseGPUTexture",

        SDL_GPUDevice.p("device"),
        SDL_GPUTexture.p("texture")
    )

    void(
        "ReleaseGPUSampler",

        SDL_GPUDevice.p("device"),
        SDL_GPUSampler.p("sampler")
    )

    void(
        "ReleaseGPUBuffer",

        SDL_GPUDevice.p("device"),
        SDL_GPUBuffer.p("buffer")
    )

    void(
        "ReleaseGPUTransferBuffer",

        SDL_GPUDevice.p("device"),
        SDL_GPUTransferBuffer.p("transfer_buffer")
    )

    void(
        "ReleaseGPUComputePipeline",

        SDL_GPUDevice.p("device"),
        SDL_GPUComputePipeline.p("compute_pipeline")
    )

    void(
        "ReleaseGPUShader",

        SDL_GPUDevice.p("device"),
        SDL_GPUShader.p("shader")
    )

    void(
        "ReleaseGPUGraphicsPipeline",

        SDL_GPUDevice.p("device"),
        SDL_GPUGraphicsPipeline.p("graphics_pipeline")
    )

    SDL_GPUCommandBuffer.p(
        "AcquireGPUCommandBuffer",

        SDL_GPUDevice.p("device")
    )

    void(
        "PushGPUVertexUniformData",

        SDL_GPUCommandBuffer.p("command_buffer"),
        Uint32("slot_index"),
        MultiTypeAll..void.const.p("data"),
        AutoSize("data")..Uint32("length")
    )

    void(
        "PushGPUFragmentUniformData",

        SDL_GPUCommandBuffer.p("command_buffer"),
        Uint32("slot_index"),
        MultiTypeAll..void.const.p("data"),
        AutoSize("data")..Uint32("length")
    )

    void(
        "PushGPUComputeUniformData",

        SDL_GPUCommandBuffer.p("command_buffer"),
        Uint32("slot_index"),
        MultiTypeAll..void.const.p("data"),
        AutoSize("data")..Uint32("length")
    )

    SDL_GPURenderPass.p(
        "BeginGPURenderPass",

        SDL_GPUCommandBuffer.p("command_buffer"),
        nullable..SDL_GPUColorTargetInfo.const.p("color_target_infos"),
        AutoSize("color_target_infos")..Uint32("num_color_targets"),
        nullable..SDL_GPUDepthStencilTargetInfo.const.p("depth_stencil_target_info")
    )

    void(
        "BindGPUGraphicsPipeline",

        SDL_GPURenderPass.p("render_pass"),
        SDL_GPUGraphicsPipeline.p("graphics_pipeline")
    )

    void(
        "SetGPUViewport",

        SDL_GPURenderPass.p("render_pass"),
        SDL_GPUViewport.const.p("viewport")
    )

    void(
        "SetGPUScissor",

        SDL_GPURenderPass.p("render_pass"),
        SDL_Rect.const.p("scissor")
    )

    void(
        "SetGPUBlendConstants",

        SDL_GPURenderPass.p("render_pass"),
        SDL_FColor("blend_constants")
    )

    void(
        "SetGPUStencilReference",

        SDL_GPURenderPass.p("render_pass"),
        Uint8("reference")
    )

    void(
        "BindGPUVertexBuffers",

        SDL_GPURenderPass.p("render_pass"),
        Uint32("first_slot"),
        nullable..SDL_GPUBufferBinding.const.p("bindings"),
        AutoSize("bindings")..Uint32("num_bindings")
    )

    void(
        "BindGPUIndexBuffer",

        SDL_GPURenderPass.p("render_pass"),
        SDL_GPUBufferBinding.const.p("binding"),
        SDL_GPUIndexElementSize("index_element_size")
    )

    void(
        "BindGPUVertexSamplers",

        SDL_GPURenderPass.p("render_pass"),
        Uint32("first_slot"),
        nullable..SDL_GPUTextureSamplerBinding.const.p("texture_sampler_bindings"),
        AutoSize("texture_sampler_bindings")..Uint32("num_bindings")
    )

    void(
        "BindGPUVertexStorageTextures",

        SDL_GPURenderPass.p("render_pass"),
        Uint32("first_slot"),
        nullable..SDL_GPUTexture.p.const.p("storage_textures"),
        AutoSize("storage_textures")..Uint32("num_bindings")
    )

    void(
        "BindGPUVertexStorageBuffers",

        SDL_GPURenderPass.p("render_pass"),
        Uint32("first_slot"),
        nullable..SDL_GPUBuffer.p.const.p("storage_buffers"),
        AutoSize("storage_buffers")..Uint32("num_bindings")
    )

    void(
        "BindGPUFragmentSamplers",

        SDL_GPURenderPass.p("render_pass"),
        Uint32("first_slot"),
        nullable..SDL_GPUTextureSamplerBinding.const.p("texture_sampler_bindings"),
        AutoSize("texture_sampler_bindings")..Uint32("num_bindings")
    )

    void(
        "BindGPUFragmentStorageTextures",

        SDL_GPURenderPass.p("render_pass"),
        Uint32("first_slot"),
        nullable..SDL_GPUTexture.p.const.p("storage_textures"),
        AutoSize("storage_textures")..Uint32("num_bindings")
    )

    void(
        "BindGPUFragmentStorageBuffers",

        SDL_GPURenderPass.p("render_pass"),
        Uint32("first_slot"),
        nullable..SDL_GPUBuffer.p.const.p("storage_buffers"),
        AutoSize("storage_buffers")..Uint32("num_bindings")
    )

    void(
        "DrawGPUIndexedPrimitives",

        SDL_GPURenderPass.p("render_pass"),
        Uint32("num_indices"),
        Uint32("num_instances"),
        Uint32("first_index"),
        Sint32("vertex_offset"),
        Uint32("first_instance")
    )

    void(
        "DrawGPUPrimitives",

        SDL_GPURenderPass.p("render_pass"),
        Uint32("num_vertices"),
        Uint32("num_instances"),
        Uint32("first_vertex"),
        Uint32("first_instance")
    )

    void(
        "DrawGPUPrimitivesIndirect",

        SDL_GPURenderPass.p("render_pass"),
        SDL_GPUBuffer.p("buffer"),
        Uint32("offset"),
        Uint32("draw_count")
    )

    void(
        "DrawGPUIndexedPrimitivesIndirect",

        SDL_GPURenderPass.p("render_pass"),
        SDL_GPUBuffer.p("buffer"),
        Uint32("offset"),
        Uint32("draw_count")
    )

    void(
        "EndGPURenderPass",

        SDL_GPURenderPass.p("render_pass")
    )

    SDL_GPUComputePass.p(
        "BeginGPUComputePass",

        SDL_GPUCommandBuffer.p("command_buffer"),
        nullable..SDL_GPUStorageTextureReadWriteBinding.const.p("storage_texture_bindings"),
        AutoSize("storage_texture_bindings")..Uint32("num_storage_texture_bindings"),
        nullable..SDL_GPUStorageBufferReadWriteBinding.const.p("storage_buffer_bindings"),
        AutoSize("storage_buffer_bindings")..Uint32("num_storage_buffer_bindings")
    )

    void(
        "BindGPUComputePipeline",

        SDL_GPUComputePass.p("compute_pass"),
        SDL_GPUComputePipeline.p("compute_pipeline")
    )

    void(
        "BindGPUComputeSamplers",

        SDL_GPUComputePass.p("compute_pass"),
        Uint32("first_slot"),
        nullable..SDL_GPUTextureSamplerBinding.const.p("texture_sampler_bindings"),
        AutoSize("texture_sampler_bindings")..Uint32("num_bindings")
    )

    void(
        "BindGPUComputeStorageTextures",

        SDL_GPUComputePass.p("compute_pass"),
        Uint32("first_slot"),
        nullable..SDL_GPUTexture.p.const.p("storage_textures"),
        AutoSize("storage_textures")..Uint32("num_bindings")
    )

    void(
        "BindGPUComputeStorageBuffers",

        SDL_GPUComputePass.p("compute_pass"),
        Uint32("first_slot"),
        nullable..SDL_GPUBuffer.p.const.p("storage_buffers"),
        AutoSize("storage_buffers")..Uint32("num_bindings")
    )

    void(
        "DispatchGPUCompute",

        SDL_GPUComputePass.p("compute_pass"),
        Uint32("groupcount_x"),
        Uint32("groupcount_y"),
        Uint32("groupcount_z")
    )

    void(
        "DispatchGPUComputeIndirect",

        SDL_GPUComputePass.p("compute_pass"),
        SDL_GPUBuffer.p("buffer"),
        Uint32("offset")
    )

    void(
        "EndGPUComputePass",

        SDL_GPUComputePass.p("compute_pass")
    )

    void.p(
        "MapGPUTransferBuffer",

        SDL_GPUDevice.p("device"),
        SDL_GPUTransferBuffer.p("transfer_buffer"),
        bool("cycle"),
        AutoSizeResult..Virtual..size_t("buffer_size")
    )

    void(
        "UnmapGPUTransferBuffer",

        SDL_GPUDevice.p("device"),
        SDL_GPUTransferBuffer.p("transfer_buffer")
    )

    SDL_GPUCopyPass.p(
        "BeginGPUCopyPass",

        SDL_GPUCommandBuffer.p("command_buffer")
    )

    void(
        "UploadToGPUTexture",

        SDL_GPUCopyPass.p("copy_pass"),
        SDL_GPUTextureTransferInfo.const.p("source"),
        SDL_GPUTextureRegion.const.p("destination"),
        bool("cycle")
    )

    void(
        "UploadToGPUBuffer",

        SDL_GPUCopyPass.p("copy_pass"),
        SDL_GPUTransferBufferLocation.const.p("source"),
        SDL_GPUBufferRegion.const.p("destination"),
        bool("cycle")
    )

    void(
        "CopyGPUTextureToTexture",

        SDL_GPUCopyPass.p("copy_pass"),
        SDL_GPUTextureLocation.const.p("source"),
        SDL_GPUTextureLocation.const.p("destination"),
        Uint32("w"),
        Uint32("h"),
        Uint32("d"),
        bool("cycle")
    )

    void(
        "CopyGPUBufferToBuffer",

        SDL_GPUCopyPass.p("copy_pass"),
        SDL_GPUBufferLocation.const.p("source"),
        SDL_GPUBufferLocation.const.p("destination"),
        Uint32("size"),
        bool("cycle")
    )

    void(
        "DownloadFromGPUTexture",

        SDL_GPUCopyPass.p("copy_pass"),
        SDL_GPUTextureRegion.const.p("source"),
        SDL_GPUTextureTransferInfo.const.p("destination")
    )

    void(
        "DownloadFromGPUBuffer",

        SDL_GPUCopyPass.p("copy_pass"),
        SDL_GPUBufferRegion.const.p("source"),
        SDL_GPUTransferBufferLocation.const.p("destination")
    )

    void(
        "EndGPUCopyPass",

        SDL_GPUCopyPass.p("copy_pass")
    )

    void(
        "GenerateMipmapsForGPUTexture",

        SDL_GPUCommandBuffer.p("command_buffer"),
        SDL_GPUTexture.p("texture")
    )

    void(
        "BlitGPUTexture",

        SDL_GPUCommandBuffer.p("command_buffer"),
        SDL_GPUBlitInfo.const.p("info")
    )

    bool(
        "WindowSupportsGPUSwapchainComposition",

        SDL_GPUDevice.p("device"),
        SDL_Window.p("window"),
        SDL_GPUSwapchainComposition("swapchain_composition")
    )

    bool(
        "WindowSupportsGPUPresentMode",

        SDL_GPUDevice.p("device"),
        SDL_Window.p("window"),
        SDL_GPUPresentMode("present_mode")
    )

    bool(
        "ClaimWindowForGPUDevice",

        SDL_GPUDevice.p("device"),
        SDL_Window.p("window")
    )

    void(
        "ReleaseWindowFromGPUDevice",

        SDL_GPUDevice.p("device"),
        SDL_Window.p("window")
    )

    bool(
        "SetGPUSwapchainParameters",

        SDL_GPUDevice.p("device"),
        SDL_Window.p("window"),
        SDL_GPUSwapchainComposition("swapchain_composition"),
        SDL_GPUPresentMode("present_mode")
    )

    bool(
        "SetGPUAllowedFramesInFlight",

        SDL_GPUDevice.p("device"),
        Uint32("allowed_frames_in_flight")
    )

    SDL_GPUTextureFormat(
        "GetGPUSwapchainTextureFormat",

        SDL_GPUDevice.p("device"),
        SDL_Window.p("window")
    )

    bool(
        "AcquireGPUSwapchainTexture",

        SDL_GPUCommandBuffer.p("command_buffer"),
        SDL_Window.p("window"),
        Check(1)..SDL_GPUTexture.p.p("swapchain_texture"),
        Check(1)..nullable..Uint32.p("swapchain_texture_width"),
        Check(1)..nullable..Uint32.p("swapchain_texture_height")
    )

    bool(
        "WaitForGPUSwapchain",

        SDL_GPUDevice.p("device"),
        SDL_Window.p("window")
    )

    bool(
        "WaitAndAcquireGPUSwapchainTexture",

        SDL_GPUCommandBuffer.p("command_buffer"),
        SDL_Window.p("window"),
        Check(1)..SDL_GPUTexture.p.p("swapchain_texture"),
        Check(1)..nullable..Uint32.p("swapchain_texture_width"),
        Check(1)..nullable..Uint32.p("swapchain_texture_height")
    )

    bool(
        "SubmitGPUCommandBuffer",

        SDL_GPUCommandBuffer.p("command_buffer")
    )

    SDL_GPUFence.p(
        "SubmitGPUCommandBufferAndAcquireFence",

        SDL_GPUCommandBuffer.p("command_buffer")
    )

    bool(
        "CancelGPUCommandBuffer",

        SDL_GPUCommandBuffer.p("command_buffer")
    )

    bool(
        "WaitForGPUIdle",

        SDL_GPUDevice.p("device")
    )

    bool(
        "WaitForGPUFences",

        SDL_GPUDevice.p("device"),
        bool("wait_all"),
        nullable..SDL_GPUFence.p.const.p("fences"),
        AutoSize("fences")..Uint32("num_fences")
    )

    bool(
        "QueryGPUFence",

        SDL_GPUDevice.p("device"),
        SDL_GPUFence.p("fence")
    )

    void(
        "ReleaseGPUFence",

        SDL_GPUDevice.p("device"),
        SDL_GPUFence.p("fence")
    )

    Uint32(
        "GPUTextureFormatTexelBlockSize",

        SDL_GPUTextureFormat("format")
    )

    bool(
        "GPUTextureSupportsFormat",

        SDL_GPUDevice.p("device"),
        SDL_GPUTextureFormat("format"),
        SDL_GPUTextureType("type"),
        SDL_GPUTextureUsageFlags("usage")
    )

    bool(
        "GPUTextureSupportsSampleCount",

        SDL_GPUDevice.p("device"),
        SDL_GPUTextureFormat("format"),
        SDL_GPUSampleCount("sample_count")
    )

    Uint32(
        "CalculateGPUTextureFormatSize",

        SDL_GPUTextureFormat("format"),
        Uint32("width"),
        Uint32("height"),
        Uint32("depth_or_layer_count")
    )

    SDL_PixelFormat(
        "GetPixelFormatFromGPUTextureFormat",

        SDL_GPUTextureFormat("format")
    )

    SDL_GPUTextureFormat(
        "GetGPUTextureFormatFromPixelFormat",

        SDL_PixelFormat("format")
    )
}