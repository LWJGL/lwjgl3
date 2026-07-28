/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

val SDL_render = "SDLRender".nativeClassSDL("SDL_render") {
    StringConstant(
        "SOFTWARE_RENDERER".."software",
        "GPU_RENDERER".."gpu"
    )

    EnumConstant(
        "TEXTUREACCESS_STATIC".enum("0"),
        "TEXTUREACCESS_STREAMING".enum,
        "TEXTUREACCESS_TARGET".enum
    )

    EnumConstant(
        "TEXTURE_ADDRESS_INVALID".enum("-1"),
        "TEXTURE_ADDRESS_AUTO".enum,
        "TEXTURE_ADDRESS_CLAMP".enum,
        "TEXTURE_ADDRESS_WRAP".enum
    )

    EnumConstant(
        "LOGICAL_PRESENTATION_DISABLED".enum("0"),
        "LOGICAL_PRESENTATION_STRETCH".enum,
        "LOGICAL_PRESENTATION_LETTERBOX".enum,
        "LOGICAL_PRESENTATION_OVERSCAN".enum,
        "LOGICAL_PRESENTATION_INTEGER_SCALE".enum
    )

    StringConstant(
        "PROP_RENDERER_CREATE_NAME_STRING".."SDL.renderer.create.name",
        "PROP_RENDERER_CREATE_WINDOW_POINTER".."SDL.renderer.create.window",
        "PROP_RENDERER_CREATE_SURFACE_POINTER".."SDL.renderer.create.surface",
        "PROP_RENDERER_CREATE_OUTPUT_COLORSPACE_NUMBER".."SDL.renderer.create.output_colorspace",
        "PROP_RENDERER_CREATE_PRESENT_VSYNC_NUMBER".."SDL.renderer.create.present_vsync",
        "PROP_RENDERER_CREATE_GPU_DEVICE_POINTER".."SDL.renderer.create.gpu.device",
        "PROP_RENDERER_CREATE_GPU_SHADERS_SPIRV_BOOLEAN".."SDL.renderer.create.gpu.shaders_spirv",
        "PROP_RENDERER_CREATE_GPU_SHADERS_DXIL_BOOLEAN".."SDL.renderer.create.gpu.shaders_dxil",
        "PROP_RENDERER_CREATE_GPU_SHADERS_MSL_BOOLEAN".."SDL.renderer.create.gpu.shaders_msl",
        "PROP_RENDERER_CREATE_VULKAN_INSTANCE_POINTER".."SDL.renderer.create.vulkan.instance",
        "PROP_RENDERER_CREATE_VULKAN_SURFACE_NUMBER".."SDL.renderer.create.vulkan.surface",
        "PROP_RENDERER_CREATE_VULKAN_PHYSICAL_DEVICE_POINTER".."SDL.renderer.create.vulkan.physical_device",
        "PROP_RENDERER_CREATE_VULKAN_DEVICE_POINTER".."SDL.renderer.create.vulkan.device",
        "PROP_RENDERER_CREATE_VULKAN_GRAPHICS_QUEUE_FAMILY_INDEX_NUMBER".."SDL.renderer.create.vulkan.graphics_queue_family_index",
        "PROP_RENDERER_CREATE_VULKAN_PRESENT_QUEUE_FAMILY_INDEX_NUMBER".."SDL.renderer.create.vulkan.present_queue_family_index"
    )

    StringConstant(
        "PROP_RENDERER_NAME_STRING".."SDL.renderer.name",
        "PROP_RENDERER_WINDOW_POINTER".."SDL.renderer.window",
        "PROP_RENDERER_SURFACE_POINTER".."SDL.renderer.surface",
        "PROP_RENDERER_VSYNC_NUMBER".."SDL.renderer.vsync",
        "PROP_RENDERER_MAX_TEXTURE_SIZE_NUMBER".."SDL.renderer.max_texture_size",
        "PROP_RENDERER_TEXTURE_FORMATS_POINTER".."SDL.renderer.texture_formats",
        "PROP_RENDERER_TEXTURE_WRAPPING_BOOLEAN".."SDL.renderer.texture_wrapping",
        "PROP_RENDERER_OUTPUT_COLORSPACE_NUMBER".."SDL.renderer.output_colorspace",
        "PROP_RENDERER_HDR_ENABLED_BOOLEAN".."SDL.renderer.HDR_enabled",
        "PROP_RENDERER_SDR_WHITE_POINT_FLOAT".."SDL.renderer.SDR_white_point",
        "PROP_RENDERER_HDR_HEADROOM_FLOAT".."SDL.renderer.HDR_headroom",
        "PROP_RENDERER_D3D9_DEVICE_POINTER".."SDL.renderer.d3d9.device",
        "PROP_RENDERER_D3D11_DEVICE_POINTER".."SDL.renderer.d3d11.device",
        "PROP_RENDERER_D3D11_SWAPCHAIN_POINTER".."SDL.renderer.d3d11.swap_chain",
        "PROP_RENDERER_D3D12_DEVICE_POINTER".."SDL.renderer.d3d12.device",
        "PROP_RENDERER_D3D12_SWAPCHAIN_POINTER".."SDL.renderer.d3d12.swap_chain",
        "PROP_RENDERER_D3D12_COMMAND_QUEUE_POINTER".."SDL.renderer.d3d12.command_queue",
        "PROP_RENDERER_VULKAN_INSTANCE_POINTER".."SDL.renderer.vulkan.instance",
        "PROP_RENDERER_VULKAN_SURFACE_NUMBER".."SDL.renderer.vulkan.surface",
        "PROP_RENDERER_VULKAN_PHYSICAL_DEVICE_POINTER".."SDL.renderer.vulkan.physical_device",
        "PROP_RENDERER_VULKAN_DEVICE_POINTER".."SDL.renderer.vulkan.device",
        "PROP_RENDERER_VULKAN_GRAPHICS_QUEUE_FAMILY_INDEX_NUMBER".."SDL.renderer.vulkan.graphics_queue_family_index",
        "PROP_RENDERER_VULKAN_PRESENT_QUEUE_FAMILY_INDEX_NUMBER".."SDL.renderer.vulkan.present_queue_family_index",
        "PROP_RENDERER_VULKAN_SWAPCHAIN_IMAGE_COUNT_NUMBER".."SDL.renderer.vulkan.swapchain_image_count",
        "PROP_RENDERER_GPU_DEVICE_POINTER".."SDL.renderer.gpu.device",
    )

    StringConstant(
        "PROP_TEXTURE_CREATE_COLORSPACE_NUMBER".."SDL.texture.create.colorspace",
        "PROP_TEXTURE_CREATE_FORMAT_NUMBER".."SDL.texture.create.format",
        "PROP_TEXTURE_CREATE_ACCESS_NUMBER".."SDL.texture.create.access",
        "PROP_TEXTURE_CREATE_WIDTH_NUMBER".."SDL.texture.create.width",
        "PROP_TEXTURE_CREATE_HEIGHT_NUMBER".."SDL.texture.create.height",
        "PROP_TEXTURE_CREATE_PALETTE_POINTER".."SDL.texture.create.palette",
        "PROP_TEXTURE_CREATE_SDR_WHITE_POINT_FLOAT".."SDL.texture.create.SDR_white_point",
        "PROP_TEXTURE_CREATE_HDR_HEADROOM_FLOAT".."SDL.texture.create.HDR_headroom",
        "PROP_TEXTURE_CREATE_D3D11_TEXTURE_POINTER".."SDL.texture.create.d3d11.texture",
        "PROP_TEXTURE_CREATE_D3D11_TEXTURE_U_POINTER".."SDL.texture.create.d3d11.texture_u",
        "PROP_TEXTURE_CREATE_D3D11_TEXTURE_V_POINTER".."SDL.texture.create.d3d11.texture_v",
        "PROP_TEXTURE_CREATE_D3D12_TEXTURE_POINTER".."SDL.texture.create.d3d12.texture",
        "PROP_TEXTURE_CREATE_D3D12_TEXTURE_U_POINTER".."SDL.texture.create.d3d12.texture_u",
        "PROP_TEXTURE_CREATE_D3D12_TEXTURE_V_POINTER".."SDL.texture.create.d3d12.texture_v",
        "PROP_TEXTURE_CREATE_METAL_PIXELBUFFER_POINTER".."SDL.texture.create.metal.pixelbuffer",
        "PROP_TEXTURE_CREATE_OPENGL_TEXTURE_NUMBER".."SDL.texture.create.opengl.texture",
        "PROP_TEXTURE_CREATE_OPENGL_TEXTURE_UV_NUMBER".."SDL.texture.create.opengl.texture_uv",
        "PROP_TEXTURE_CREATE_OPENGL_TEXTURE_U_NUMBER".."SDL.texture.create.opengl.texture_u",
        "PROP_TEXTURE_CREATE_OPENGL_TEXTURE_V_NUMBER".."SDL.texture.create.opengl.texture_v",
        "PROP_TEXTURE_CREATE_OPENGLES2_TEXTURE_NUMBER".."SDL.texture.create.opengles2.texture",
        "PROP_TEXTURE_CREATE_OPENGLES2_TEXTURE_UV_NUMBER".."SDL.texture.create.opengles2.texture_uv",
        "PROP_TEXTURE_CREATE_OPENGLES2_TEXTURE_U_NUMBER".."SDL.texture.create.opengles2.texture_u",
        "PROP_TEXTURE_CREATE_OPENGLES2_TEXTURE_V_NUMBER".."SDL.texture.create.opengles2.texture_v",
        "PROP_TEXTURE_CREATE_VULKAN_TEXTURE_NUMBER".."SDL.texture.create.vulkan.texture",
        "PROP_TEXTURE_CREATE_VULKAN_LAYOUT_NUMBER".."SDL.texture.create.vulkan.layout",
        "PROP_TEXTURE_CREATE_GPU_TEXTURE_POINTER".."SDL.texture.create.gpu.texture",
        "PROP_TEXTURE_CREATE_GPU_TEXTURE_UV_POINTER".."SDL.texture.create.gpu.texture_uv",
        "PROP_TEXTURE_CREATE_GPU_TEXTURE_U_POINTER".."SDL.texture.create.gpu.texture_u",
        "PROP_TEXTURE_CREATE_GPU_TEXTURE_V_POINTER".."SDL.texture.create.gpu.texture_v"
    )

    StringConstant(
        "PROP_TEXTURE_COLORSPACE_NUMBER".."SDL.texture.colorspace",
        "PROP_TEXTURE_FORMAT_NUMBER".."SDL.texture.format",
        "PROP_TEXTURE_ACCESS_NUMBER".."SDL.texture.access",
        "PROP_TEXTURE_WIDTH_NUMBER".."SDL.texture.width",
        "PROP_TEXTURE_HEIGHT_NUMBER".."SDL.texture.height",
        "PROP_TEXTURE_SDR_WHITE_POINT_FLOAT".."SDL.texture.SDR_white_point",
        "PROP_TEXTURE_HDR_HEADROOM_FLOAT".."SDL.texture.HDR_headroom",
        "PROP_TEXTURE_D3D11_TEXTURE_POINTER".."SDL.texture.d3d11.texture",
        "PROP_TEXTURE_D3D11_TEXTURE_U_POINTER".."SDL.texture.d3d11.texture_u",
        "PROP_TEXTURE_D3D11_TEXTURE_V_POINTER".."SDL.texture.d3d11.texture_v",
        "PROP_TEXTURE_D3D12_TEXTURE_POINTER".."SDL.texture.d3d12.texture",
        "PROP_TEXTURE_D3D12_TEXTURE_U_POINTER".."SDL.texture.d3d12.texture_u",
        "PROP_TEXTURE_D3D12_TEXTURE_V_POINTER".."SDL.texture.d3d12.texture_v",
        "PROP_TEXTURE_OPENGL_TEXTURE_NUMBER".."SDL.texture.opengl.texture",
        "PROP_TEXTURE_OPENGL_TEXTURE_UV_NUMBER".."SDL.texture.opengl.texture_uv",
        "PROP_TEXTURE_OPENGL_TEXTURE_U_NUMBER".."SDL.texture.opengl.texture_u",
        "PROP_TEXTURE_OPENGL_TEXTURE_V_NUMBER".."SDL.texture.opengl.texture_v",
        "PROP_TEXTURE_OPENGL_TEXTURE_TARGET_NUMBER".."SDL.texture.opengl.target",
        "PROP_TEXTURE_OPENGL_TEX_W_FLOAT".."SDL.texture.opengl.tex_w",
        "PROP_TEXTURE_OPENGL_TEX_H_FLOAT".."SDL.texture.opengl.tex_h",
        "PROP_TEXTURE_OPENGLES2_TEXTURE_NUMBER".."SDL.texture.opengles2.texture",
        "PROP_TEXTURE_OPENGLES2_TEXTURE_UV_NUMBER".."SDL.texture.opengles2.texture_uv",
        "PROP_TEXTURE_OPENGLES2_TEXTURE_U_NUMBER".."SDL.texture.opengles2.texture_u",
        "PROP_TEXTURE_OPENGLES2_TEXTURE_V_NUMBER".."SDL.texture.opengles2.texture_v",
        "PROP_TEXTURE_OPENGLES2_TEXTURE_TARGET_NUMBER".."SDL.texture.opengles2.target",
        "PROP_TEXTURE_VULKAN_TEXTURE_NUMBER".."SDL.texture.vulkan.texture",
        "PROP_TEXTURE_GPU_TEXTURE_POINTER".."SDL.texture.gpu.texture",
        "PROP_TEXTURE_GPU_TEXTURE_UV_POINTER".."SDL.texture.gpu.texture_uv",
        "PROP_TEXTURE_GPU_TEXTURE_U_POINTER".."SDL.texture.gpu.texture_u",
        "PROP_TEXTURE_GPU_TEXTURE_V_POINTER".."SDL.texture.gpu.texture_v"
    )

    IntConstant(
        "RENDERER_VSYNC_DISABLED".."0",
        "RENDERER_VSYNC_ADAPTIVE".."-1"
    )

    IntConstant("DEBUG_TEXT_FONT_CHARACTER_SIZE".."8")

    int("GetNumRenderDrivers", void())

    charASCII.const.p(
        "GetRenderDriver",

        int("index")
    )

    bool(
        "CreateWindowAndRenderer",

        charUTF8.const.p("title"),
        int("width"),
        int("height"),
        SDL_WindowFlags("window_flags"),
        Check(1)..SDL_Window.p.p("window"),
        Check(1)..SDL_Renderer.p.p("renderer")
    )

    SDL_Renderer.p(
        "CreateRenderer",

        SDL_Window.p("window"),
        charASCII.const.p("name")
    )

    SDL_Renderer.p(
        "CreateRendererWithProperties",

        SDL_PropertiesID("props")
    )

    SDL_Renderer.p(
        "CreateGPURenderer",

        nullable..SDL_GPUDevice.p("device"),
        nullable..SDL_Window.p("window")
    )

    SDL_GPUDevice.p(
        "GetGPURendererDevice",

        SDL_Renderer.p("renderer")
    )

    SDL_Renderer.p(
        "CreateSoftwareRenderer",

        SDL_Surface.p("surface")
    )

    SDL_Renderer.p("GetRenderer", SDL_Window.p("window"))
    SDL_Window.p("GetRenderWindow", SDL_Renderer.p("renderer"))

    charASCII.const.p(
        "GetRendererName",

        SDL_Renderer.p("renderer")
    )

    SDL_PropertiesID(
        "GetRendererProperties",

        SDL_Renderer.p("renderer")
    )

    bool(
        "GetRenderOutputSize",

        SDL_Renderer.p("renderer"),
        Check(1)..nullable..int.p("w"),
        Check(1)..nullable..int.p("h")
    )

    bool(
        "GetCurrentRenderOutputSize",

        SDL_Renderer.p("renderer"),
        Check(1)..nullable..int.p("w"),
        Check(1)..nullable..int.p("h")
    )

    SDL_Texture.p(
        "CreateTexture",

        SDL_Renderer.p("renderer"),
        SDL_PixelFormat("format"),
        SDL_TextureAccess("access"),
        int("w"),
        int("h")
    )

    SDL_Texture.p(
        "CreateTextureFromSurface",

        SDL_Renderer.p("renderer"),
        SDL_Surface.p("surface")
    )

    SDL_Texture.p(
        "CreateTextureWithProperties",

        SDL_Renderer.p("renderer"),
        SDL_PropertiesID("props")
    )

    SDL_PropertiesID(
        "GetTextureProperties",

        SDL_Texture.p("texture")
    )

    SDL_Renderer.p(
        "GetRendererFromTexture",

        SDL_Texture.p("texture")
    )

    bool(
        "GetTextureSize",

        SDL_Texture.p("texture"),
        Check(1)..nullable..float.p("w"),
        Check(1)..nullable..float.p("h")
    )

    bool(
        "SetTexturePalette",

        SDL_Texture.p("texture"),
        SDL_Palette.p("palette")
    )

    SDL_Palette.p(
        "GetTexturePalette",

        SDL_Texture.p("texture")
    )

    bool(
        "SetTextureColorMod",

        SDL_Texture.p("texture"),
        Uint8("r"),
        Uint8("g"),
        Uint8("b")
    )

    bool(
        "SetTextureColorModFloat",

        SDL_Texture.p("texture"),
        float("r"),
        float("g"),
        float("b")
    )

    bool(
        "GetTextureColorMod",

        SDL_Texture.p("texture"),
        Check(1)..nullable..Uint8.p("r"),
        Check(1)..nullable..Uint8.p("g"),
        Check(1)..nullable..Uint8.p("b")
    )

    bool(
        "GetTextureColorModFloat",

        SDL_Texture.p("texture"),
        Check(1)..nullable..float.p("r"),
        Check(1)..nullable..float.p("g"),
        Check(1)..nullable..float.p("b")
    )

    bool(
        "SetTextureAlphaMod",

        SDL_Texture.p("texture"),
        Uint8("alpha")
    )

    bool(
        "SetTextureAlphaModFloat",

        SDL_Texture.p("texture"),
        float("alpha")
    )

    bool(
        "GetTextureAlphaMod",

        SDL_Texture.p("texture"),
        Check(1)..Uint8.p("alpha")
    )

    bool(
        "GetTextureAlphaModFloat",

        SDL_Texture.p("texture"),
        Check(1)..float.p("alpha")
    )

    bool(
        "SetTextureBlendMode",

        SDL_Texture.p("texture"),
        SDL_BlendMode("blendMode")
    )

    bool(
        "GetTextureBlendMode",

        SDL_Texture.p("texture"),
        Check(1)..SDL_BlendMode.p("blendMode")
    )

    bool(
        "SetTextureScaleMode",

        SDL_Texture.p("texture"),
        SDL_ScaleMode("scaleMode")
    )

    bool(
        "GetTextureScaleMode",

        SDL_Texture.p("texture"),
        Check(1)..SDL_ScaleMode.p("scaleMode")
    )

    bool(
        "UpdateTexture",

        SDL_Texture.p("texture"),
        nullable..SDL_Rect.const.p("rect"),
        Unsafe..void.const.p("pixels"),
        int("pitch")
    )

    bool(
        "UpdateYUVTexture",

        SDL_Texture.p("texture"),
        nullable..SDL_Rect.const.p("rect"),
        Unsafe..Uint8.const.p("Yplane"),
        int("Ypitch"),
        Unsafe..Uint8.const.p("Uplane"),
        int("Upitch"),
        Unsafe..Uint8.const.p("Vplane"),
        int("Vpitch")
    )

    bool(
        "UpdateNVTexture",

        SDL_Texture.p("texture"),
        nullable..SDL_Rect.const.p("rect"),
        Unsafe..Uint8.const.p("Yplane"),
        int("Ypitch"),
        Unsafe..Uint8.const.p("UVplane"),
        int("UVpitch")
    )

    bool(
        "LockTexture",

        SDL_Texture.p("texture"),
        nullable..SDL_Rect.const.p("rect"),
        Check(1)..void.p.p("pixels"),
        Check(1)..int.p("pitch")
    )

    bool(
        "LockTextureToSurface",

        SDL_Texture.p("texture"),
        nullable..SDL_Rect.const.p("rect"),
        Check(1)..SDL_Surface.p.p("surface")
    )

    void(
        "UnlockTexture",

        SDL_Texture.p("texture")
    )

    bool(
        "SetRenderTarget",

        SDL_Renderer.p("renderer"),
        nullable..SDL_Texture.p("texture")
    )

    SDL_Texture.p(
        "GetRenderTarget",

        SDL_Renderer.p("renderer")
    )

    bool(
        "SetRenderLogicalPresentation",

        SDL_Renderer.p("renderer"),
        int("w"),
        int("h"),
        SDL_RendererLogicalPresentation("mode")
    )

    bool(
        "GetRenderLogicalPresentation",

        SDL_Renderer.p("renderer"),
        Check(1)..nullable..int.p("w"),
        Check(1)..nullable..int.p("h"),
        Check(1)..nullable..SDL_RendererLogicalPresentation.p("mode")
    )

    bool(
        "GetRenderLogicalPresentationRect",

        SDL_Renderer.p("renderer"),
        SDL_FRect.p("rect")
    )

    bool(
        "RenderCoordinatesFromWindow",

        SDL_Renderer.p("renderer"),
        float("window_x"),
        float("window_y"),
        Check(1)..nullable..float.p("x"),
        Check(1)..nullable..float.p("y")
    )

    bool(
        "RenderCoordinatesToWindow",

        SDL_Renderer.p("renderer"),
        float("x"),
        float("y"),
        Check(1)..nullable..float.p("window_x"),
        Check(1)..nullable..float.p("window_y")
    )

    bool(
        "ConvertEventToRenderCoordinates",

        SDL_Renderer.p("renderer"),
        SDL_Event.p("event")
    )

    bool(
        "SetRenderViewport",

        SDL_Renderer.p("renderer"),
        nullable..SDL_Rect.const.p("rect")
    )

    bool(
        "GetRenderViewport",

        SDL_Renderer.p("renderer"),
        SDL_Rect.p("rect")
    )

    bool(
        "RenderViewportSet",

        SDL_Renderer.p("renderer")
    )

    bool(
        "GetRenderSafeArea",

        SDL_Renderer.p("renderer"),
        SDL_Rect.p("rect")
    )

    bool(
        "SetRenderClipRect",

        SDL_Renderer.p("renderer"),
        nullable..SDL_Rect.const.p("rect")
    )

    bool(
        "GetRenderClipRect",

        SDL_Renderer.p("renderer"),
        SDL_Rect.p("rect")
    )

    bool(
        "RenderClipEnabled",

        SDL_Renderer.p("renderer")
    )

    bool(
        "SetRenderScale",

        SDL_Renderer.p("renderer"),
        float("scaleX"),
        float("scaleY")
    )

    bool(
        "GetRenderScale",

        SDL_Renderer.p("renderer"),
        Check(1)..nullable..float.p("scaleX"),
        Check(1)..nullable..float.p("scaleY")
    )

    bool(
        "SetRenderDrawColor",

        SDL_Renderer.p("renderer"),
        Uint8("r"),
        Uint8("g"),
        Uint8("b"),
        Uint8("a")
    )

    bool(
        "SetRenderDrawColorFloat",

        SDL_Renderer.p("renderer"),
        float("r"),
        float("g"),
        float("b"),
        float("a")
    )

    bool(
        "GetRenderDrawColor",

        SDL_Renderer.p("renderer"),
        Check(1)..nullable..Uint8.p("r"),
        Check(1)..nullable..Uint8.p("g"),
        Check(1)..nullable..Uint8.p("b"),
        Check(1)..nullable..Uint8.p("a")
    )

    bool(
        "GetRenderDrawColorFloat",

        SDL_Renderer.p("renderer"),
        Check(1)..nullable..float.p("r"),
        Check(1)..nullable..float.p("g"),
        Check(1)..nullable..float.p("b"),
        Check(1)..nullable..float.p("a")
    )

    bool(
        "SetRenderColorScale",

        SDL_Renderer.p("renderer"),
        float("scale")
    )

    bool(
        "GetRenderColorScale",

        SDL_Renderer.p("renderer"),
        Check(1)..float.p("scale")
    )

    bool(
        "SetRenderDrawBlendMode",

        SDL_Renderer.p("renderer"),
        SDL_BlendMode("blendMode")
    )

    bool(
        "GetRenderDrawBlendMode",

        SDL_Renderer.p("renderer"),
        Check(1)..SDL_BlendMode.p("blendMode")
    )

    bool(
        "RenderClear",

        SDL_Renderer.p("renderer")
    )

    bool(
        "RenderPoint",

        SDL_Renderer.p("renderer"),
        float("x"),
        float("y")
    )

    bool(
        "RenderPoints",

        SDL_Renderer.p("renderer"),
        SDL_FPoint.const.p("points"),
        AutoSize("points")..int("count")
    )

    bool(
        "RenderLine",

        SDL_Renderer.p("renderer"),
        float("x1"),
        float("y1"),
        float("x2"),
        float("y2")
    )

    bool(
        "RenderLines",

        SDL_Renderer.p("renderer"),
        SDL_FPoint.const.p("points"),
        AutoSize("points")..int("count")
    )

    bool(
        "RenderRect",

        SDL_Renderer.p("renderer"),
        nullable..SDL_FRect.const.p("rect")
    )

    bool(
        "RenderRects",

        SDL_Renderer.p("renderer"),
        SDL_FRect.const.p("rects"),
        AutoSize("rects")..int("count")
    )

    bool(
        "RenderFillRect",

        SDL_Renderer.p("renderer"),
        nullable..SDL_FRect.const.p("rect")
    )

    bool(
        "RenderFillRects",

        SDL_Renderer.p("renderer"),
        SDL_FRect.const.p("rects"),
        AutoSize("rects")..int("count")
    )

    bool(
        "RenderTexture",

        SDL_Renderer.p("renderer"),
        SDL_Texture.p("texture"),
        nullable..SDL_FRect.const.p("srcrect"),
        nullable..SDL_FRect.const.p("dstrect")
    )

    bool(
        "RenderTextureRotated",

        SDL_Renderer.p("renderer"),
        SDL_Texture.p("texture"),
        nullable..SDL_FRect.const.p("srcrect"),
        nullable..SDL_FRect.const.p("dstrect"),
        double("angle"),
        nullable..SDL_FPoint.const.p("center"),
        SDL_FlipMode("flip")
    )

    bool(
        "RenderTextureAffine",

        SDL_Renderer.p("renderer"),
        SDL_Texture.p("texture"),
        nullable..SDL_FRect.const.p("srcrect"),
        nullable..SDL_FPoint.const.p("origin"),
        nullable..SDL_FPoint.const.p("right"),
        nullable..SDL_FPoint.const.p("down")
    )

    bool(
        "RenderTextureTiled",

        SDL_Renderer.p("renderer"),
        SDL_Texture.p("texture"),
        nullable..SDL_FRect.const.p("srcrect"),
        float("scale"),
        nullable..SDL_FRect.const.p("dstrect")
    )

    bool(
        "RenderTexture9Grid",

        SDL_Renderer.p("renderer"),
        SDL_Texture.p("texture"),
        nullable..SDL_FRect.const.p("srcrect"),
        float("left_width"),
        float("right_width"),
        float("top_height"),
        float("bottom_height"),
        float("scale"),
        nullable..SDL_FRect.const.p("dstrect")
    )

    bool(
        "RenderTexture9GridTiled",

        SDL_Renderer.p("renderer"),
        SDL_Texture.p("texture"),
        nullable..SDL_FRect.const.p("srcrect"),
        float("left_width"),
        float("right_width"),
        float("top_height"),
        float("bottom_height"),
        float("scale"),
        nullable..SDL_FRect.const.p("dstrect"),
        float("tileScale")
    )

    bool(
        "RenderGeometry",

        SDL_Renderer.p("renderer"),
        nullable..SDL_Texture.p("texture"),
        SDL_Vertex.const.p("vertices"),
        AutoSize("vertices")..int("num_vertices"),
        nullable..int.const.p("indices"),
        AutoSize("indices")..int("num_indices")
    )

    bool(
        "RenderGeometryRaw",

        SDL_Renderer.p("renderer"),
        nullable..SDL_Texture.p("texture"),
        Check("(num_vertices * xy_stride) >> 2")..float.const.p("xy"),
        int("xy_stride"),
        Check("(num_vertices * color_stride) / SDL_FColor.SIZEOF")..SDL_FColor.const.p("color"),
        int("color_stride"),
        Check("(num_vertices * uv_stride) >> 2")..nullable..float.const.p("uv"),
        int("uv_stride"),
        int("num_vertices"),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT
        )..Check("num_indices * size_indices")..nullable..void.const.p("indices"),
        int("num_indices"),
        int("size_indices")
    )

    bool(
        "SetRenderTextureAddressMode",

        SDL_Renderer.p("renderer"),
        SDL_TextureAddressMode("u_mode"),
        SDL_TextureAddressMode("v_mode")
    )

    bool(
        "GetRenderTextureAddressMode",

        SDL_Renderer.p("renderer"),
        Check(1)..nullable..SDL_TextureAddressMode.p("u_mode"),
        Check(1)..nullable..SDL_TextureAddressMode.p("v_mode")
    )

    SDL_Surface.p(
        "RenderReadPixels",

        SDL_Renderer.p("renderer"),
        nullable..SDL_Rect.const.p("rect")
    )

    bool(
        "RenderPresent",

        SDL_Renderer.p("renderer")
    )

    void("DestroyTexture", SDL_Texture.p("texture"))
    void("DestroyRenderer", SDL_Renderer.p("renderer"))

    bool(
        "FlushRenderer",

        SDL_Renderer.p("renderer")
    )

    opaque_p("GetRenderMetalLayer", SDL_Renderer.p("renderer"))
    opaque_p("GetRenderMetalCommandEncoder", SDL_Renderer.p("renderer"))

    bool(
        "AddVulkanRenderSemaphores",

        SDL_Renderer.p("renderer"),
        Uint32("wait_stage_mask"),
        Sint64("wait_semaphore"),
        Sint64("signal_semaphore")
    )

    bool(
        "SetRenderVSync",

        SDL_Renderer.p("renderer"),
        int("vsync")
    )

    bool(
        "GetRenderVSync",

        SDL_Renderer.p("renderer"),
        Check(1)..int.p("vsync")
    )

    bool(
        "RenderDebugText",

        SDL_Renderer.p("renderer"),
        float("x"),
        float("y"),
        charUTF8.const.p("str")
    )

    bool(
        "RenderDebugTextFormat",

        SDL_Renderer.p("renderer"),
        float("x"),
        float("y"),
        charUTF8.const.p("fmt")
    )

    bool(
        "SetDefaultTextureScaleMode",

        SDL_Renderer.p("renderer"),
        SDL_ScaleMode("scale_mode")
    )

    bool(
        "GetDefaultTextureScaleMode",

        SDL_Renderer.p("renderer"),
        Check(1)..nullable..SDL_ScaleMode.p("scale_mode")
    )

    SDL_GPURenderState.p(
        "CreateGPURenderState",

        SDL_Renderer.p("renderer"),
        SDL_GPURenderStateCreateInfo.const.p("createinfo")
    )

    bool(
        "SetGPURenderStateFragmentUniforms",

        SDL_GPURenderState.p("state"),
        Uint32("slot_index"),
        void.const.p("data"),
        AutoSize("data")..Uint32("length")
    )

    bool(
        "SetGPURenderState",

        SDL_Renderer.p("renderer"),
        SDL_GPURenderState.p("state")
    )

    void(
        "DestroyGPURenderState",

        SDL_GPURenderState.p("state")
    )
}