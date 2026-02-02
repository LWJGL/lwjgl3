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

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class SDLRender {

    /** Contains the function pointers loaded from {@code SDL.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GetNumRenderDrivers               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetNumRenderDrivers"),
            GetRenderDriver                   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRenderDriver"),
            CreateWindowAndRenderer           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateWindowAndRenderer"),
            CreateRenderer                    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateRenderer"),
            CreateRendererWithProperties      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateRendererWithProperties"),
            CreateGPURenderer                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateGPURenderer"),
            GetGPURendererDevice              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGPURendererDevice"),
            CreateSoftwareRenderer            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateSoftwareRenderer"),
            GetRenderer                       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRenderer"),
            GetRenderWindow                   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRenderWindow"),
            GetRendererName                   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRendererName"),
            GetRendererProperties             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRendererProperties"),
            GetRenderOutputSize               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRenderOutputSize"),
            GetCurrentRenderOutputSize        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetCurrentRenderOutputSize"),
            CreateTexture                     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateTexture"),
            CreateTextureFromSurface          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateTextureFromSurface"),
            CreateTextureWithProperties       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateTextureWithProperties"),
            GetTextureProperties              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTextureProperties"),
            GetRendererFromTexture            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRendererFromTexture"),
            GetTextureSize                    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTextureSize"),
            SetTexturePalette                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetTexturePalette"),
            GetTexturePalette                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTexturePalette"),
            SetTextureColorMod                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetTextureColorMod"),
            SetTextureColorModFloat           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetTextureColorModFloat"),
            GetTextureColorMod                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTextureColorMod"),
            GetTextureColorModFloat           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTextureColorModFloat"),
            SetTextureAlphaMod                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetTextureAlphaMod"),
            SetTextureAlphaModFloat           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetTextureAlphaModFloat"),
            GetTextureAlphaMod                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTextureAlphaMod"),
            GetTextureAlphaModFloat           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTextureAlphaModFloat"),
            SetTextureBlendMode               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetTextureBlendMode"),
            GetTextureBlendMode               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTextureBlendMode"),
            SetTextureScaleMode               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetTextureScaleMode"),
            GetTextureScaleMode               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTextureScaleMode"),
            UpdateTexture                     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_UpdateTexture"),
            UpdateYUVTexture                  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_UpdateYUVTexture"),
            UpdateNVTexture                   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_UpdateNVTexture"),
            LockTexture                       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_LockTexture"),
            LockTextureToSurface              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_LockTextureToSurface"),
            UnlockTexture                     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_UnlockTexture"),
            SetRenderTarget                   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetRenderTarget"),
            GetRenderTarget                   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRenderTarget"),
            SetRenderLogicalPresentation      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetRenderLogicalPresentation"),
            GetRenderLogicalPresentation      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRenderLogicalPresentation"),
            GetRenderLogicalPresentationRect  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRenderLogicalPresentationRect"),
            RenderCoordinatesFromWindow       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenderCoordinatesFromWindow"),
            RenderCoordinatesToWindow         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenderCoordinatesToWindow"),
            ConvertEventToRenderCoordinates   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ConvertEventToRenderCoordinates"),
            SetRenderViewport                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetRenderViewport"),
            GetRenderViewport                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRenderViewport"),
            RenderViewportSet                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenderViewportSet"),
            GetRenderSafeArea                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRenderSafeArea"),
            SetRenderClipRect                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetRenderClipRect"),
            GetRenderClipRect                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRenderClipRect"),
            RenderClipEnabled                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenderClipEnabled"),
            SetRenderScale                    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetRenderScale"),
            GetRenderScale                    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRenderScale"),
            SetRenderDrawColor                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetRenderDrawColor"),
            SetRenderDrawColorFloat           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetRenderDrawColorFloat"),
            GetRenderDrawColor                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRenderDrawColor"),
            GetRenderDrawColorFloat           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRenderDrawColorFloat"),
            SetRenderColorScale               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetRenderColorScale"),
            GetRenderColorScale               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRenderColorScale"),
            SetRenderDrawBlendMode            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetRenderDrawBlendMode"),
            GetRenderDrawBlendMode            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRenderDrawBlendMode"),
            RenderClear                       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenderClear"),
            RenderPoint                       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenderPoint"),
            RenderPoints                      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenderPoints"),
            RenderLine                        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenderLine"),
            RenderLines                       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenderLines"),
            RenderRect                        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenderRect"),
            RenderRects                       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenderRects"),
            RenderFillRect                    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenderFillRect"),
            RenderFillRects                   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenderFillRects"),
            RenderTexture                     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenderTexture"),
            RenderTextureRotated              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenderTextureRotated"),
            RenderTextureAffine               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenderTextureAffine"),
            RenderTextureTiled                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenderTextureTiled"),
            RenderTexture9Grid                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenderTexture9Grid"),
            RenderTexture9GridTiled           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenderTexture9GridTiled"),
            RenderGeometry                    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenderGeometry"),
            RenderGeometryRaw                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenderGeometryRaw"),
            SetRenderTextureAddressMode       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetRenderTextureAddressMode"),
            GetRenderTextureAddressMode       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRenderTextureAddressMode"),
            RenderReadPixels                  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenderReadPixels"),
            RenderPresent                     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenderPresent"),
            DestroyTexture                    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_DestroyTexture"),
            DestroyRenderer                   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_DestroyRenderer"),
            FlushRenderer                     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_FlushRenderer"),
            GetRenderMetalLayer               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRenderMetalLayer"),
            GetRenderMetalCommandEncoder      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRenderMetalCommandEncoder"),
            AddVulkanRenderSemaphores         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_AddVulkanRenderSemaphores"),
            SetRenderVSync                    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetRenderVSync"),
            GetRenderVSync                    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRenderVSync"),
            RenderDebugText                   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenderDebugText"),
            RenderDebugTextFormat             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenderDebugTextFormat"),
            SetDefaultTextureScaleMode        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetDefaultTextureScaleMode"),
            GetDefaultTextureScaleMode        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetDefaultTextureScaleMode"),
            CreateGPURenderState              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateGPURenderState"),
            SetGPURenderStateFragmentUniforms = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetGPURenderStateFragmentUniforms"),
            SetGPURenderState                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetGPURenderState"),
            DestroyGPURenderState             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_DestroyGPURenderState");

    }

    public static final String
        SDL_SOFTWARE_RENDERER = "software",
        SDL_GPU_RENDERER      = "gpu";

    public static final int
        SDL_TEXTUREACCESS_STATIC    = 0,
        SDL_TEXTUREACCESS_STREAMING = 1,
        SDL_TEXTUREACCESS_TARGET    = 2;

    public static final int
        SDL_TEXTURE_ADDRESS_INVALID = -1,
        SDL_TEXTURE_ADDRESS_AUTO    = 0,
        SDL_TEXTURE_ADDRESS_CLAMP   = 1,
        SDL_TEXTURE_ADDRESS_WRAP    = 2;

    public static final int
        SDL_LOGICAL_PRESENTATION_DISABLED      = 0,
        SDL_LOGICAL_PRESENTATION_STRETCH       = 1,
        SDL_LOGICAL_PRESENTATION_LETTERBOX     = 2,
        SDL_LOGICAL_PRESENTATION_OVERSCAN      = 3,
        SDL_LOGICAL_PRESENTATION_INTEGER_SCALE = 4;

    public static final String
        SDL_PROP_RENDERER_CREATE_NAME_STRING                               = "SDL.renderer.create.name",
        SDL_PROP_RENDERER_CREATE_WINDOW_POINTER                            = "SDL.renderer.create.window",
        SDL_PROP_RENDERER_CREATE_SURFACE_POINTER                           = "SDL.renderer.create.surface",
        SDL_PROP_RENDERER_CREATE_OUTPUT_COLORSPACE_NUMBER                  = "SDL.renderer.create.output_colorspace",
        SDL_PROP_RENDERER_CREATE_PRESENT_VSYNC_NUMBER                      = "SDL.renderer.create.present_vsync",
        SDL_PROP_RENDERER_CREATE_GPU_DEVICE_POINTER                        = "SDL.renderer.create.gpu.device",
        SDL_PROP_RENDERER_CREATE_GPU_SHADERS_SPIRV_BOOLEAN                 = "SDL.renderer.create.gpu.shaders_spirv",
        SDL_PROP_RENDERER_CREATE_GPU_SHADERS_DXIL_BOOLEAN                  = "SDL.renderer.create.gpu.shaders_dxil",
        SDL_PROP_RENDERER_CREATE_GPU_SHADERS_MSL_BOOLEAN                   = "SDL.renderer.create.gpu.shaders_msl",
        SDL_PROP_RENDERER_CREATE_VULKAN_INSTANCE_POINTER                   = "SDL.renderer.create.vulkan.instance",
        SDL_PROP_RENDERER_CREATE_VULKAN_SURFACE_NUMBER                     = "SDL.renderer.create.vulkan.surface",
        SDL_PROP_RENDERER_CREATE_VULKAN_PHYSICAL_DEVICE_POINTER            = "SDL.renderer.create.vulkan.physical_device",
        SDL_PROP_RENDERER_CREATE_VULKAN_DEVICE_POINTER                     = "SDL.renderer.create.vulkan.device",
        SDL_PROP_RENDERER_CREATE_VULKAN_GRAPHICS_QUEUE_FAMILY_INDEX_NUMBER = "SDL.renderer.create.vulkan.graphics_queue_family_index",
        SDL_PROP_RENDERER_CREATE_VULKAN_PRESENT_QUEUE_FAMILY_INDEX_NUMBER  = "SDL.renderer.create.vulkan.present_queue_family_index";

    public static final String
        SDL_PROP_RENDERER_NAME_STRING                               = "SDL.renderer.name",
        SDL_PROP_RENDERER_WINDOW_POINTER                            = "SDL.renderer.window",
        SDL_PROP_RENDERER_SURFACE_POINTER                           = "SDL.renderer.surface",
        SDL_PROP_RENDERER_VSYNC_NUMBER                              = "SDL.renderer.vsync",
        SDL_PROP_RENDERER_MAX_TEXTURE_SIZE_NUMBER                   = "SDL.renderer.max_texture_size",
        SDL_PROP_RENDERER_TEXTURE_FORMATS_POINTER                   = "SDL.renderer.texture_formats",
        SDL_PROP_RENDERER_TEXTURE_WRAPPING_BOOLEAN                  = "SDL.renderer.texture_wrapping",
        SDL_PROP_RENDERER_OUTPUT_COLORSPACE_NUMBER                  = "SDL.renderer.output_colorspace",
        SDL_PROP_RENDERER_HDR_ENABLED_BOOLEAN                       = "SDL.renderer.HDR_enabled",
        SDL_PROP_RENDERER_SDR_WHITE_POINT_FLOAT                     = "SDL.renderer.SDR_white_point",
        SDL_PROP_RENDERER_HDR_HEADROOM_FLOAT                        = "SDL.renderer.HDR_headroom",
        SDL_PROP_RENDERER_D3D9_DEVICE_POINTER                       = "SDL.renderer.d3d9.device",
        SDL_PROP_RENDERER_D3D11_DEVICE_POINTER                      = "SDL.renderer.d3d11.device",
        SDL_PROP_RENDERER_D3D11_SWAPCHAIN_POINTER                   = "SDL.renderer.d3d11.swap_chain",
        SDL_PROP_RENDERER_D3D12_DEVICE_POINTER                      = "SDL.renderer.d3d12.device",
        SDL_PROP_RENDERER_D3D12_SWAPCHAIN_POINTER                   = "SDL.renderer.d3d12.swap_chain",
        SDL_PROP_RENDERER_D3D12_COMMAND_QUEUE_POINTER               = "SDL.renderer.d3d12.command_queue",
        SDL_PROP_RENDERER_VULKAN_INSTANCE_POINTER                   = "SDL.renderer.vulkan.instance",
        SDL_PROP_RENDERER_VULKAN_SURFACE_NUMBER                     = "SDL.renderer.vulkan.surface",
        SDL_PROP_RENDERER_VULKAN_PHYSICAL_DEVICE_POINTER            = "SDL.renderer.vulkan.physical_device",
        SDL_PROP_RENDERER_VULKAN_DEVICE_POINTER                     = "SDL.renderer.vulkan.device",
        SDL_PROP_RENDERER_VULKAN_GRAPHICS_QUEUE_FAMILY_INDEX_NUMBER = "SDL.renderer.vulkan.graphics_queue_family_index",
        SDL_PROP_RENDERER_VULKAN_PRESENT_QUEUE_FAMILY_INDEX_NUMBER  = "SDL.renderer.vulkan.present_queue_family_index",
        SDL_PROP_RENDERER_VULKAN_SWAPCHAIN_IMAGE_COUNT_NUMBER       = "SDL.renderer.vulkan.swapchain_image_count",
        SDL_PROP_RENDERER_GPU_DEVICE_POINTER                        = "SDL.renderer.gpu.device";

    public static final String
        SDL_PROP_TEXTURE_CREATE_COLORSPACE_NUMBER           = "SDL.texture.create.colorspace",
        SDL_PROP_TEXTURE_CREATE_FORMAT_NUMBER               = "SDL.texture.create.format",
        SDL_PROP_TEXTURE_CREATE_ACCESS_NUMBER               = "SDL.texture.create.access",
        SDL_PROP_TEXTURE_CREATE_WIDTH_NUMBER                = "SDL.texture.create.width",
        SDL_PROP_TEXTURE_CREATE_HEIGHT_NUMBER               = "SDL.texture.create.height",
        SDL_PROP_TEXTURE_CREATE_PALETTE_POINTER             = "SDL.texture.create.palette",
        SDL_PROP_TEXTURE_CREATE_SDR_WHITE_POINT_FLOAT       = "SDL.texture.create.SDR_white_point",
        SDL_PROP_TEXTURE_CREATE_HDR_HEADROOM_FLOAT          = "SDL.texture.create.HDR_headroom",
        SDL_PROP_TEXTURE_CREATE_D3D11_TEXTURE_POINTER       = "SDL.texture.create.d3d11.texture",
        SDL_PROP_TEXTURE_CREATE_D3D11_TEXTURE_U_POINTER     = "SDL.texture.create.d3d11.texture_u",
        SDL_PROP_TEXTURE_CREATE_D3D11_TEXTURE_V_POINTER     = "SDL.texture.create.d3d11.texture_v",
        SDL_PROP_TEXTURE_CREATE_D3D12_TEXTURE_POINTER       = "SDL.texture.create.d3d12.texture",
        SDL_PROP_TEXTURE_CREATE_D3D12_TEXTURE_U_POINTER     = "SDL.texture.create.d3d12.texture_u",
        SDL_PROP_TEXTURE_CREATE_D3D12_TEXTURE_V_POINTER     = "SDL.texture.create.d3d12.texture_v",
        SDL_PROP_TEXTURE_CREATE_METAL_PIXELBUFFER_POINTER   = "SDL.texture.create.metal.pixelbuffer",
        SDL_PROP_TEXTURE_CREATE_OPENGL_TEXTURE_NUMBER       = "SDL.texture.create.opengl.texture",
        SDL_PROP_TEXTURE_CREATE_OPENGL_TEXTURE_UV_NUMBER    = "SDL.texture.create.opengl.texture_uv",
        SDL_PROP_TEXTURE_CREATE_OPENGL_TEXTURE_U_NUMBER     = "SDL.texture.create.opengl.texture_u",
        SDL_PROP_TEXTURE_CREATE_OPENGL_TEXTURE_V_NUMBER     = "SDL.texture.create.opengl.texture_v",
        SDL_PROP_TEXTURE_CREATE_OPENGLES2_TEXTURE_NUMBER    = "SDL.texture.create.opengles2.texture",
        SDL_PROP_TEXTURE_CREATE_OPENGLES2_TEXTURE_UV_NUMBER = "SDL.texture.create.opengles2.texture_uv",
        SDL_PROP_TEXTURE_CREATE_OPENGLES2_TEXTURE_U_NUMBER  = "SDL.texture.create.opengles2.texture_u",
        SDL_PROP_TEXTURE_CREATE_OPENGLES2_TEXTURE_V_NUMBER  = "SDL.texture.create.opengles2.texture_v",
        SDL_PROP_TEXTURE_CREATE_VULKAN_TEXTURE_NUMBER       = "SDL.texture.create.vulkan.texture",
        SDL_PROP_TEXTURE_CREATE_VULKAN_LAYOUT_NUMBER        = "SDL.texture.create.vulkan.layout",
        SDL_PROP_TEXTURE_CREATE_GPU_TEXTURE_POINTER         = "SDL.texture.create.gpu.texture",
        SDL_PROP_TEXTURE_CREATE_GPU_TEXTURE_UV_POINTER      = "SDL.texture.create.gpu.texture_uv",
        SDL_PROP_TEXTURE_CREATE_GPU_TEXTURE_U_POINTER       = "SDL.texture.create.gpu.texture_u",
        SDL_PROP_TEXTURE_CREATE_GPU_TEXTURE_V_POINTER       = "SDL.texture.create.gpu.texture_v";

    public static final String
        SDL_PROP_TEXTURE_COLORSPACE_NUMBER               = "SDL.texture.colorspace",
        SDL_PROP_TEXTURE_FORMAT_NUMBER                   = "SDL.texture.format",
        SDL_PROP_TEXTURE_ACCESS_NUMBER                   = "SDL.texture.access",
        SDL_PROP_TEXTURE_WIDTH_NUMBER                    = "SDL.texture.width",
        SDL_PROP_TEXTURE_HEIGHT_NUMBER                   = "SDL.texture.height",
        SDL_PROP_TEXTURE_SDR_WHITE_POINT_FLOAT           = "SDL.texture.SDR_white_point",
        SDL_PROP_TEXTURE_HDR_HEADROOM_FLOAT              = "SDL.texture.HDR_headroom",
        SDL_PROP_TEXTURE_D3D11_TEXTURE_POINTER           = "SDL.texture.d3d11.texture",
        SDL_PROP_TEXTURE_D3D11_TEXTURE_U_POINTER         = "SDL.texture.d3d11.texture_u",
        SDL_PROP_TEXTURE_D3D11_TEXTURE_V_POINTER         = "SDL.texture.d3d11.texture_v",
        SDL_PROP_TEXTURE_D3D12_TEXTURE_POINTER           = "SDL.texture.d3d12.texture",
        SDL_PROP_TEXTURE_D3D12_TEXTURE_U_POINTER         = "SDL.texture.d3d12.texture_u",
        SDL_PROP_TEXTURE_D3D12_TEXTURE_V_POINTER         = "SDL.texture.d3d12.texture_v",
        SDL_PROP_TEXTURE_OPENGL_TEXTURE_NUMBER           = "SDL.texture.opengl.texture",
        SDL_PROP_TEXTURE_OPENGL_TEXTURE_UV_NUMBER        = "SDL.texture.opengl.texture_uv",
        SDL_PROP_TEXTURE_OPENGL_TEXTURE_U_NUMBER         = "SDL.texture.opengl.texture_u",
        SDL_PROP_TEXTURE_OPENGL_TEXTURE_V_NUMBER         = "SDL.texture.opengl.texture_v",
        SDL_PROP_TEXTURE_OPENGL_TEXTURE_TARGET_NUMBER    = "SDL.texture.opengl.target",
        SDL_PROP_TEXTURE_OPENGL_TEX_W_FLOAT              = "SDL.texture.opengl.tex_w",
        SDL_PROP_TEXTURE_OPENGL_TEX_H_FLOAT              = "SDL.texture.opengl.tex_h",
        SDL_PROP_TEXTURE_OPENGLES2_TEXTURE_NUMBER        = "SDL.texture.opengles2.texture",
        SDL_PROP_TEXTURE_OPENGLES2_TEXTURE_UV_NUMBER     = "SDL.texture.opengles2.texture_uv",
        SDL_PROP_TEXTURE_OPENGLES2_TEXTURE_U_NUMBER      = "SDL.texture.opengles2.texture_u",
        SDL_PROP_TEXTURE_OPENGLES2_TEXTURE_V_NUMBER      = "SDL.texture.opengles2.texture_v",
        SDL_PROP_TEXTURE_OPENGLES2_TEXTURE_TARGET_NUMBER = "SDL.texture.opengles2.target",
        SDL_PROP_TEXTURE_VULKAN_TEXTURE_NUMBER           = "SDL.texture.vulkan.texture",
        SDL_PROP_TEXTURE_GPU_TEXTURE_POINTER             = "SDL.texture.gpu.texture",
        SDL_PROP_TEXTURE_GPU_TEXTURE_UV_POINTER          = "SDL.texture.gpu.texture_uv",
        SDL_PROP_TEXTURE_GPU_TEXTURE_U_POINTER           = "SDL.texture.gpu.texture_u",
        SDL_PROP_TEXTURE_GPU_TEXTURE_V_POINTER           = "SDL.texture.gpu.texture_v";

    public static final int
        SDL_RENDERER_VSYNC_DISABLED = 0,
        SDL_RENDERER_VSYNC_ADAPTIVE = -1;

    public static final int SDL_DEBUG_TEXT_FONT_CHARACTER_SIZE = 8;

    protected SDLRender() {
        throw new UnsupportedOperationException();
    }

    // --- [ SDL_GetNumRenderDrivers ] ---

    /** {@code int SDL_GetNumRenderDrivers(void)} */
    public static int SDL_GetNumRenderDrivers() {
        long __functionAddress = Functions.GetNumRenderDrivers;
        return invokeI(__functionAddress);
    }

    // --- [ SDL_GetRenderDriver ] ---

    /** {@code char const * SDL_GetRenderDriver(int index)} */
    public static long nSDL_GetRenderDriver(int index) {
        long __functionAddress = Functions.GetRenderDriver;
        return invokeP(index, __functionAddress);
    }

    /** {@code char const * SDL_GetRenderDriver(int index)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetRenderDriver(int index) {
        long __result = nSDL_GetRenderDriver(index);
        return memASCIISafe(__result);
    }

    // --- [ SDL_CreateWindowAndRenderer ] ---

    /** {@code bool SDL_CreateWindowAndRenderer(char const * title, int width, int height, SDL_WindowFlags window_flags, SDL_Window ** window, SDL_Renderer ** renderer)} */
    public static boolean nSDL_CreateWindowAndRenderer(long title, int width, int height, long window_flags, long window, long renderer) {
        long __functionAddress = Functions.CreateWindowAndRenderer;
        return invokePJPPZ(title, width, height, window_flags, window, renderer, __functionAddress);
    }

    /** {@code bool SDL_CreateWindowAndRenderer(char const * title, int width, int height, SDL_WindowFlags window_flags, SDL_Window ** window, SDL_Renderer ** renderer)} */
    @NativeType("bool")
    public static boolean SDL_CreateWindowAndRenderer(@NativeType("char const *") ByteBuffer title, int width, int height, @NativeType("SDL_WindowFlags") long window_flags, @NativeType("SDL_Window **") PointerBuffer window, @NativeType("SDL_Renderer **") PointerBuffer renderer) {
        if (CHECKS) {
            checkNT1(title);
            check(window, 1);
            check(renderer, 1);
        }
        return nSDL_CreateWindowAndRenderer(memAddress(title), width, height, window_flags, memAddress(window), memAddress(renderer));
    }

    /** {@code bool SDL_CreateWindowAndRenderer(char const * title, int width, int height, SDL_WindowFlags window_flags, SDL_Window ** window, SDL_Renderer ** renderer)} */
    @NativeType("bool")
    public static boolean SDL_CreateWindowAndRenderer(@NativeType("char const *") CharSequence title, int width, int height, @NativeType("SDL_WindowFlags") long window_flags, @NativeType("SDL_Window **") PointerBuffer window, @NativeType("SDL_Renderer **") PointerBuffer renderer) {
        if (CHECKS) {
            check(window, 1);
            check(renderer, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nSDL_CreateWindowAndRenderer(titleEncoded, width, height, window_flags, memAddress(window), memAddress(renderer));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_CreateRenderer ] ---

    /** {@code SDL_Renderer * SDL_CreateRenderer(SDL_Window * window, char const * name)} */
    public static long nSDL_CreateRenderer(long window, long name) {
        long __functionAddress = Functions.CreateRenderer;
        if (CHECKS) {
            check(window);
        }
        return invokePPP(window, name, __functionAddress);
    }

    /** {@code SDL_Renderer * SDL_CreateRenderer(SDL_Window * window, char const * name)} */
    @NativeType("SDL_Renderer *")
    public static long SDL_CreateRenderer(@NativeType("SDL_Window *") long window, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nSDL_CreateRenderer(window, memAddress(name));
    }

    /** {@code SDL_Renderer * SDL_CreateRenderer(SDL_Window * window, char const * name)} */
    @NativeType("SDL_Renderer *")
    public static long SDL_CreateRenderer(@NativeType("SDL_Window *") long window, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nSDL_CreateRenderer(window, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_CreateRendererWithProperties ] ---

    /** {@code SDL_Renderer * SDL_CreateRendererWithProperties(SDL_PropertiesID props)} */
    @NativeType("SDL_Renderer *")
    public static long SDL_CreateRendererWithProperties(@NativeType("SDL_PropertiesID") int props) {
        long __functionAddress = Functions.CreateRendererWithProperties;
        return invokeP(props, __functionAddress);
    }

    // --- [ SDL_CreateGPURenderer ] ---

    /** {@code SDL_Renderer * SDL_CreateGPURenderer(SDL_GPUDevice * device, SDL_Window * window)} */
    @NativeType("SDL_Renderer *")
    public static long SDL_CreateGPURenderer(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.CreateGPURenderer;
        return invokePPP(device, window, __functionAddress);
    }

    // --- [ SDL_GetGPURendererDevice ] ---

    /** {@code SDL_GPUDevice * SDL_GetGPURendererDevice(SDL_Renderer * renderer)} */
    @NativeType("SDL_GPUDevice *")
    public static long SDL_GetGPURendererDevice(@NativeType("SDL_Renderer *") long renderer) {
        long __functionAddress = Functions.GetGPURendererDevice;
        if (CHECKS) {
            check(renderer);
        }
        return invokePP(renderer, __functionAddress);
    }

    // --- [ SDL_CreateSoftwareRenderer ] ---

    /** {@code SDL_Renderer * SDL_CreateSoftwareRenderer(SDL_Surface * surface)} */
    public static long nSDL_CreateSoftwareRenderer(long surface) {
        long __functionAddress = Functions.CreateSoftwareRenderer;
        return invokePP(surface, __functionAddress);
    }

    /** {@code SDL_Renderer * SDL_CreateSoftwareRenderer(SDL_Surface * surface)} */
    @NativeType("SDL_Renderer *")
    public static long SDL_CreateSoftwareRenderer(@NativeType("SDL_Surface *") SDL_Surface surface) {
        return nSDL_CreateSoftwareRenderer(surface.address());
    }

    // --- [ SDL_GetRenderer ] ---

    /** {@code SDL_Renderer * SDL_GetRenderer(SDL_Window * window)} */
    @NativeType("SDL_Renderer *")
    public static long SDL_GetRenderer(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.GetRenderer;
        if (CHECKS) {
            check(window);
        }
        return invokePP(window, __functionAddress);
    }

    // --- [ SDL_GetRenderWindow ] ---

    /** {@code SDL_Window * SDL_GetRenderWindow(SDL_Renderer * renderer)} */
    @NativeType("SDL_Window *")
    public static long SDL_GetRenderWindow(@NativeType("SDL_Renderer *") long renderer) {
        long __functionAddress = Functions.GetRenderWindow;
        if (CHECKS) {
            check(renderer);
        }
        return invokePP(renderer, __functionAddress);
    }

    // --- [ SDL_GetRendererName ] ---

    /** {@code char const * SDL_GetRendererName(SDL_Renderer * renderer)} */
    public static long nSDL_GetRendererName(long renderer) {
        long __functionAddress = Functions.GetRendererName;
        if (CHECKS) {
            check(renderer);
        }
        return invokePP(renderer, __functionAddress);
    }

    /** {@code char const * SDL_GetRendererName(SDL_Renderer * renderer)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetRendererName(@NativeType("SDL_Renderer *") long renderer) {
        long __result = nSDL_GetRendererName(renderer);
        return memASCIISafe(__result);
    }

    // --- [ SDL_GetRendererProperties ] ---

    /** {@code SDL_PropertiesID SDL_GetRendererProperties(SDL_Renderer * renderer)} */
    @NativeType("SDL_PropertiesID")
    public static int SDL_GetRendererProperties(@NativeType("SDL_Renderer *") long renderer) {
        long __functionAddress = Functions.GetRendererProperties;
        if (CHECKS) {
            check(renderer);
        }
        return invokePI(renderer, __functionAddress);
    }

    // --- [ SDL_GetRenderOutputSize ] ---

    /** {@code bool SDL_GetRenderOutputSize(SDL_Renderer * renderer, int * w, int * h)} */
    public static boolean nSDL_GetRenderOutputSize(long renderer, long w, long h) {
        long __functionAddress = Functions.GetRenderOutputSize;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPPZ(renderer, w, h, __functionAddress);
    }

    /** {@code bool SDL_GetRenderOutputSize(SDL_Renderer * renderer, int * w, int * h)} */
    @NativeType("bool")
    public static boolean SDL_GetRenderOutputSize(@NativeType("SDL_Renderer *") long renderer, @NativeType("int *") @Nullable IntBuffer w, @NativeType("int *") @Nullable IntBuffer h) {
        if (CHECKS) {
            checkSafe(w, 1);
            checkSafe(h, 1);
        }
        return nSDL_GetRenderOutputSize(renderer, memAddressSafe(w), memAddressSafe(h));
    }

    // --- [ SDL_GetCurrentRenderOutputSize ] ---

    /** {@code bool SDL_GetCurrentRenderOutputSize(SDL_Renderer * renderer, int * w, int * h)} */
    public static boolean nSDL_GetCurrentRenderOutputSize(long renderer, long w, long h) {
        long __functionAddress = Functions.GetCurrentRenderOutputSize;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPPZ(renderer, w, h, __functionAddress);
    }

    /** {@code bool SDL_GetCurrentRenderOutputSize(SDL_Renderer * renderer, int * w, int * h)} */
    @NativeType("bool")
    public static boolean SDL_GetCurrentRenderOutputSize(@NativeType("SDL_Renderer *") long renderer, @NativeType("int *") @Nullable IntBuffer w, @NativeType("int *") @Nullable IntBuffer h) {
        if (CHECKS) {
            checkSafe(w, 1);
            checkSafe(h, 1);
        }
        return nSDL_GetCurrentRenderOutputSize(renderer, memAddressSafe(w), memAddressSafe(h));
    }

    // --- [ SDL_CreateTexture ] ---

    /** {@code SDL_Texture * SDL_CreateTexture(SDL_Renderer * renderer, SDL_PixelFormat format, SDL_TextureAccess access, int w, int h)} */
    public static long nSDL_CreateTexture(long renderer, int format, int access, int w, int h) {
        long __functionAddress = Functions.CreateTexture;
        if (CHECKS) {
            check(renderer);
        }
        return invokePP(renderer, format, access, w, h, __functionAddress);
    }

    /** {@code SDL_Texture * SDL_CreateTexture(SDL_Renderer * renderer, SDL_PixelFormat format, SDL_TextureAccess access, int w, int h)} */
    @NativeType("SDL_Texture *")
    public static @Nullable SDL_Texture SDL_CreateTexture(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_PixelFormat") int format, @NativeType("SDL_TextureAccess") int access, int w, int h) {
        long __result = nSDL_CreateTexture(renderer, format, access, w, h);
        return SDL_Texture.createSafe(__result);
    }

    // --- [ SDL_CreateTextureFromSurface ] ---

    /** {@code SDL_Texture * SDL_CreateTextureFromSurface(SDL_Renderer * renderer, SDL_Surface * surface)} */
    public static long nSDL_CreateTextureFromSurface(long renderer, long surface) {
        long __functionAddress = Functions.CreateTextureFromSurface;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPP(renderer, surface, __functionAddress);
    }

    /** {@code SDL_Texture * SDL_CreateTextureFromSurface(SDL_Renderer * renderer, SDL_Surface * surface)} */
    @NativeType("SDL_Texture *")
    public static @Nullable SDL_Texture SDL_CreateTextureFromSurface(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Surface *") SDL_Surface surface) {
        long __result = nSDL_CreateTextureFromSurface(renderer, surface.address());
        return SDL_Texture.createSafe(__result);
    }

    // --- [ SDL_CreateTextureWithProperties ] ---

    /** {@code SDL_Texture * SDL_CreateTextureWithProperties(SDL_Renderer * renderer, SDL_PropertiesID props)} */
    public static long nSDL_CreateTextureWithProperties(long renderer, int props) {
        long __functionAddress = Functions.CreateTextureWithProperties;
        if (CHECKS) {
            check(renderer);
        }
        return invokePP(renderer, props, __functionAddress);
    }

    /** {@code SDL_Texture * SDL_CreateTextureWithProperties(SDL_Renderer * renderer, SDL_PropertiesID props)} */
    @NativeType("SDL_Texture *")
    public static @Nullable SDL_Texture SDL_CreateTextureWithProperties(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_PropertiesID") int props) {
        long __result = nSDL_CreateTextureWithProperties(renderer, props);
        return SDL_Texture.createSafe(__result);
    }

    // --- [ SDL_GetTextureProperties ] ---

    /** {@code SDL_PropertiesID SDL_GetTextureProperties(SDL_Texture * texture)} */
    public static int nSDL_GetTextureProperties(long texture) {
        long __functionAddress = Functions.GetTextureProperties;
        return invokePI(texture, __functionAddress);
    }

    /** {@code SDL_PropertiesID SDL_GetTextureProperties(SDL_Texture * texture)} */
    @NativeType("SDL_PropertiesID")
    public static int SDL_GetTextureProperties(@NativeType("SDL_Texture *") SDL_Texture texture) {
        return nSDL_GetTextureProperties(texture.address());
    }

    // --- [ SDL_GetRendererFromTexture ] ---

    /** {@code SDL_Renderer * SDL_GetRendererFromTexture(SDL_Texture * texture)} */
    public static long nSDL_GetRendererFromTexture(long texture) {
        long __functionAddress = Functions.GetRendererFromTexture;
        return invokePP(texture, __functionAddress);
    }

    /** {@code SDL_Renderer * SDL_GetRendererFromTexture(SDL_Texture * texture)} */
    @NativeType("SDL_Renderer *")
    public static long SDL_GetRendererFromTexture(@NativeType("SDL_Texture *") SDL_Texture texture) {
        return nSDL_GetRendererFromTexture(texture.address());
    }

    // --- [ SDL_GetTextureSize ] ---

    /** {@code bool SDL_GetTextureSize(SDL_Texture * texture, float * w, float * h)} */
    public static boolean nSDL_GetTextureSize(long texture, long w, long h) {
        long __functionAddress = Functions.GetTextureSize;
        return invokePPPZ(texture, w, h, __functionAddress);
    }

    /** {@code bool SDL_GetTextureSize(SDL_Texture * texture, float * w, float * h)} */
    @NativeType("bool")
    public static boolean SDL_GetTextureSize(@NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("float *") @Nullable FloatBuffer w, @NativeType("float *") @Nullable FloatBuffer h) {
        if (CHECKS) {
            checkSafe(w, 1);
            checkSafe(h, 1);
        }
        return nSDL_GetTextureSize(texture.address(), memAddressSafe(w), memAddressSafe(h));
    }

    // --- [ SDL_SetTexturePalette ] ---

    /** {@code bool SDL_SetTexturePalette(SDL_Texture * texture, SDL_Palette * palette)} */
    public static boolean nSDL_SetTexturePalette(long texture, long palette) {
        long __functionAddress = Functions.SetTexturePalette;
        return invokePPZ(texture, palette, __functionAddress);
    }

    /** {@code bool SDL_SetTexturePalette(SDL_Texture * texture, SDL_Palette * palette)} */
    @NativeType("bool")
    public static boolean SDL_SetTexturePalette(@NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("SDL_Palette *") SDL_Palette palette) {
        return nSDL_SetTexturePalette(texture.address(), palette.address());
    }

    // --- [ SDL_GetTexturePalette ] ---

    /** {@code SDL_Palette * SDL_GetTexturePalette(SDL_Texture * texture)} */
    public static long nSDL_GetTexturePalette(long texture) {
        long __functionAddress = Functions.GetTexturePalette;
        return invokePP(texture, __functionAddress);
    }

    /** {@code SDL_Palette * SDL_GetTexturePalette(SDL_Texture * texture)} */
    @NativeType("SDL_Palette *")
    public static @Nullable SDL_Palette SDL_GetTexturePalette(@NativeType("SDL_Texture *") SDL_Texture texture) {
        long __result = nSDL_GetTexturePalette(texture.address());
        return SDL_Palette.createSafe(__result);
    }

    // --- [ SDL_SetTextureColorMod ] ---

    /** {@code bool SDL_SetTextureColorMod(SDL_Texture * texture, Uint8 r, Uint8 g, Uint8 b)} */
    public static boolean nSDL_SetTextureColorMod(long texture, byte r, byte g, byte b) {
        long __functionAddress = Functions.SetTextureColorMod;
        return invokePUUUZ(texture, r, g, b, __functionAddress);
    }

    /** {@code bool SDL_SetTextureColorMod(SDL_Texture * texture, Uint8 r, Uint8 g, Uint8 b)} */
    @NativeType("bool")
    public static boolean SDL_SetTextureColorMod(@NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("Uint8") byte r, @NativeType("Uint8") byte g, @NativeType("Uint8") byte b) {
        return nSDL_SetTextureColorMod(texture.address(), r, g, b);
    }

    // --- [ SDL_SetTextureColorModFloat ] ---

    /** {@code bool SDL_SetTextureColorModFloat(SDL_Texture * texture, float r, float g, float b)} */
    public static boolean nSDL_SetTextureColorModFloat(long texture, float r, float g, float b) {
        long __functionAddress = Functions.SetTextureColorModFloat;
        return invokePZ(texture, r, g, b, __functionAddress);
    }

    /** {@code bool SDL_SetTextureColorModFloat(SDL_Texture * texture, float r, float g, float b)} */
    @NativeType("bool")
    public static boolean SDL_SetTextureColorModFloat(@NativeType("SDL_Texture *") SDL_Texture texture, float r, float g, float b) {
        return nSDL_SetTextureColorModFloat(texture.address(), r, g, b);
    }

    // --- [ SDL_GetTextureColorMod ] ---

    /** {@code bool SDL_GetTextureColorMod(SDL_Texture * texture, Uint8 * r, Uint8 * g, Uint8 * b)} */
    public static boolean nSDL_GetTextureColorMod(long texture, long r, long g, long b) {
        long __functionAddress = Functions.GetTextureColorMod;
        return invokePPPPZ(texture, r, g, b, __functionAddress);
    }

    /** {@code bool SDL_GetTextureColorMod(SDL_Texture * texture, Uint8 * r, Uint8 * g, Uint8 * b)} */
    @NativeType("bool")
    public static boolean SDL_GetTextureColorMod(@NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("Uint8 *") @Nullable ByteBuffer r, @NativeType("Uint8 *") @Nullable ByteBuffer g, @NativeType("Uint8 *") @Nullable ByteBuffer b) {
        if (CHECKS) {
            checkSafe(r, 1);
            checkSafe(g, 1);
            checkSafe(b, 1);
        }
        return nSDL_GetTextureColorMod(texture.address(), memAddressSafe(r), memAddressSafe(g), memAddressSafe(b));
    }

    // --- [ SDL_GetTextureColorModFloat ] ---

    /** {@code bool SDL_GetTextureColorModFloat(SDL_Texture * texture, float * r, float * g, float * b)} */
    public static boolean nSDL_GetTextureColorModFloat(long texture, long r, long g, long b) {
        long __functionAddress = Functions.GetTextureColorModFloat;
        return invokePPPPZ(texture, r, g, b, __functionAddress);
    }

    /** {@code bool SDL_GetTextureColorModFloat(SDL_Texture * texture, float * r, float * g, float * b)} */
    @NativeType("bool")
    public static boolean SDL_GetTextureColorModFloat(@NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("float *") @Nullable FloatBuffer r, @NativeType("float *") @Nullable FloatBuffer g, @NativeType("float *") @Nullable FloatBuffer b) {
        if (CHECKS) {
            checkSafe(r, 1);
            checkSafe(g, 1);
            checkSafe(b, 1);
        }
        return nSDL_GetTextureColorModFloat(texture.address(), memAddressSafe(r), memAddressSafe(g), memAddressSafe(b));
    }

    // --- [ SDL_SetTextureAlphaMod ] ---

    /** {@code bool SDL_SetTextureAlphaMod(SDL_Texture * texture, Uint8 alpha)} */
    public static boolean nSDL_SetTextureAlphaMod(long texture, byte alpha) {
        long __functionAddress = Functions.SetTextureAlphaMod;
        return invokePUZ(texture, alpha, __functionAddress);
    }

    /** {@code bool SDL_SetTextureAlphaMod(SDL_Texture * texture, Uint8 alpha)} */
    @NativeType("bool")
    public static boolean SDL_SetTextureAlphaMod(@NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("Uint8") byte alpha) {
        return nSDL_SetTextureAlphaMod(texture.address(), alpha);
    }

    // --- [ SDL_SetTextureAlphaModFloat ] ---

    /** {@code bool SDL_SetTextureAlphaModFloat(SDL_Texture * texture, float alpha)} */
    public static boolean nSDL_SetTextureAlphaModFloat(long texture, float alpha) {
        long __functionAddress = Functions.SetTextureAlphaModFloat;
        return invokePZ(texture, alpha, __functionAddress);
    }

    /** {@code bool SDL_SetTextureAlphaModFloat(SDL_Texture * texture, float alpha)} */
    @NativeType("bool")
    public static boolean SDL_SetTextureAlphaModFloat(@NativeType("SDL_Texture *") SDL_Texture texture, float alpha) {
        return nSDL_SetTextureAlphaModFloat(texture.address(), alpha);
    }

    // --- [ SDL_GetTextureAlphaMod ] ---

    /** {@code bool SDL_GetTextureAlphaMod(SDL_Texture * texture, Uint8 * alpha)} */
    public static boolean nSDL_GetTextureAlphaMod(long texture, long alpha) {
        long __functionAddress = Functions.GetTextureAlphaMod;
        return invokePPZ(texture, alpha, __functionAddress);
    }

    /** {@code bool SDL_GetTextureAlphaMod(SDL_Texture * texture, Uint8 * alpha)} */
    @NativeType("bool")
    public static boolean SDL_GetTextureAlphaMod(@NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("Uint8 *") ByteBuffer alpha) {
        if (CHECKS) {
            check(alpha, 1);
        }
        return nSDL_GetTextureAlphaMod(texture.address(), memAddress(alpha));
    }

    // --- [ SDL_GetTextureAlphaModFloat ] ---

    /** {@code bool SDL_GetTextureAlphaModFloat(SDL_Texture * texture, float * alpha)} */
    public static boolean nSDL_GetTextureAlphaModFloat(long texture, long alpha) {
        long __functionAddress = Functions.GetTextureAlphaModFloat;
        return invokePPZ(texture, alpha, __functionAddress);
    }

    /** {@code bool SDL_GetTextureAlphaModFloat(SDL_Texture * texture, float * alpha)} */
    @NativeType("bool")
    public static boolean SDL_GetTextureAlphaModFloat(@NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("float *") FloatBuffer alpha) {
        if (CHECKS) {
            check(alpha, 1);
        }
        return nSDL_GetTextureAlphaModFloat(texture.address(), memAddress(alpha));
    }

    // --- [ SDL_SetTextureBlendMode ] ---

    /** {@code bool SDL_SetTextureBlendMode(SDL_Texture * texture, SDL_BlendMode blendMode)} */
    public static boolean nSDL_SetTextureBlendMode(long texture, int blendMode) {
        long __functionAddress = Functions.SetTextureBlendMode;
        return invokePZ(texture, blendMode, __functionAddress);
    }

    /** {@code bool SDL_SetTextureBlendMode(SDL_Texture * texture, SDL_BlendMode blendMode)} */
    @NativeType("bool")
    public static boolean SDL_SetTextureBlendMode(@NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("SDL_BlendMode") int blendMode) {
        return nSDL_SetTextureBlendMode(texture.address(), blendMode);
    }

    // --- [ SDL_GetTextureBlendMode ] ---

    /** {@code bool SDL_GetTextureBlendMode(SDL_Texture * texture, SDL_BlendMode * blendMode)} */
    public static boolean nSDL_GetTextureBlendMode(long texture, long blendMode) {
        long __functionAddress = Functions.GetTextureBlendMode;
        return invokePPZ(texture, blendMode, __functionAddress);
    }

    /** {@code bool SDL_GetTextureBlendMode(SDL_Texture * texture, SDL_BlendMode * blendMode)} */
    @NativeType("bool")
    public static boolean SDL_GetTextureBlendMode(@NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("SDL_BlendMode *") IntBuffer blendMode) {
        if (CHECKS) {
            check(blendMode, 1);
        }
        return nSDL_GetTextureBlendMode(texture.address(), memAddress(blendMode));
    }

    // --- [ SDL_SetTextureScaleMode ] ---

    /** {@code bool SDL_SetTextureScaleMode(SDL_Texture * texture, SDL_ScaleMode scaleMode)} */
    public static boolean nSDL_SetTextureScaleMode(long texture, int scaleMode) {
        long __functionAddress = Functions.SetTextureScaleMode;
        return invokePZ(texture, scaleMode, __functionAddress);
    }

    /** {@code bool SDL_SetTextureScaleMode(SDL_Texture * texture, SDL_ScaleMode scaleMode)} */
    @NativeType("bool")
    public static boolean SDL_SetTextureScaleMode(@NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("SDL_ScaleMode") int scaleMode) {
        return nSDL_SetTextureScaleMode(texture.address(), scaleMode);
    }

    // --- [ SDL_GetTextureScaleMode ] ---

    /** {@code bool SDL_GetTextureScaleMode(SDL_Texture * texture, SDL_ScaleMode * scaleMode)} */
    public static boolean nSDL_GetTextureScaleMode(long texture, long scaleMode) {
        long __functionAddress = Functions.GetTextureScaleMode;
        return invokePPZ(texture, scaleMode, __functionAddress);
    }

    /** {@code bool SDL_GetTextureScaleMode(SDL_Texture * texture, SDL_ScaleMode * scaleMode)} */
    @NativeType("bool")
    public static boolean SDL_GetTextureScaleMode(@NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("SDL_ScaleMode *") IntBuffer scaleMode) {
        if (CHECKS) {
            check(scaleMode, 1);
        }
        return nSDL_GetTextureScaleMode(texture.address(), memAddress(scaleMode));
    }

    // --- [ SDL_UpdateTexture ] ---

    /** {@code bool SDL_UpdateTexture(SDL_Texture * texture, SDL_Rect const * rect, void const * pixels, int pitch)} */
    public static boolean nSDL_UpdateTexture(long texture, long rect, long pixels, int pitch) {
        long __functionAddress = Functions.UpdateTexture;
        return invokePPPZ(texture, rect, pixels, pitch, __functionAddress);
    }

    /** {@code bool SDL_UpdateTexture(SDL_Texture * texture, SDL_Rect const * rect, void const * pixels, int pitch)} */
    @NativeType("bool")
    public static boolean SDL_UpdateTexture(@NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("SDL_Rect const *") @Nullable SDL_Rect rect, @NativeType("void const *") ByteBuffer pixels, int pitch) {
        return nSDL_UpdateTexture(texture.address(), memAddressSafe(rect), memAddress(pixels), pitch);
    }

    // --- [ SDL_UpdateYUVTexture ] ---

    /** {@code bool SDL_UpdateYUVTexture(SDL_Texture * texture, SDL_Rect const * rect, Uint8 const * Yplane, int Ypitch, Uint8 const * Uplane, int Upitch, Uint8 const * Vplane, int Vpitch)} */
    public static boolean nSDL_UpdateYUVTexture(long texture, long rect, long Yplane, int Ypitch, long Uplane, int Upitch, long Vplane, int Vpitch) {
        long __functionAddress = Functions.UpdateYUVTexture;
        return invokePPPPPZ(texture, rect, Yplane, Ypitch, Uplane, Upitch, Vplane, Vpitch, __functionAddress);
    }

    /** {@code bool SDL_UpdateYUVTexture(SDL_Texture * texture, SDL_Rect const * rect, Uint8 const * Yplane, int Ypitch, Uint8 const * Uplane, int Upitch, Uint8 const * Vplane, int Vpitch)} */
    @NativeType("bool")
    public static boolean SDL_UpdateYUVTexture(@NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("SDL_Rect const *") @Nullable SDL_Rect rect, @NativeType("Uint8 const *") ByteBuffer Yplane, int Ypitch, @NativeType("Uint8 const *") ByteBuffer Uplane, int Upitch, @NativeType("Uint8 const *") ByteBuffer Vplane, int Vpitch) {
        return nSDL_UpdateYUVTexture(texture.address(), memAddressSafe(rect), memAddress(Yplane), Ypitch, memAddress(Uplane), Upitch, memAddress(Vplane), Vpitch);
    }

    // --- [ SDL_UpdateNVTexture ] ---

    /** {@code bool SDL_UpdateNVTexture(SDL_Texture * texture, SDL_Rect const * rect, Uint8 const * Yplane, int Ypitch, Uint8 const * UVplane, int UVpitch)} */
    public static boolean nSDL_UpdateNVTexture(long texture, long rect, long Yplane, int Ypitch, long UVplane, int UVpitch) {
        long __functionAddress = Functions.UpdateNVTexture;
        return invokePPPPZ(texture, rect, Yplane, Ypitch, UVplane, UVpitch, __functionAddress);
    }

    /** {@code bool SDL_UpdateNVTexture(SDL_Texture * texture, SDL_Rect const * rect, Uint8 const * Yplane, int Ypitch, Uint8 const * UVplane, int UVpitch)} */
    @NativeType("bool")
    public static boolean SDL_UpdateNVTexture(@NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("SDL_Rect const *") @Nullable SDL_Rect rect, @NativeType("Uint8 const *") ByteBuffer Yplane, int Ypitch, @NativeType("Uint8 const *") ByteBuffer UVplane, int UVpitch) {
        return nSDL_UpdateNVTexture(texture.address(), memAddressSafe(rect), memAddress(Yplane), Ypitch, memAddress(UVplane), UVpitch);
    }

    // --- [ SDL_LockTexture ] ---

    /** {@code bool SDL_LockTexture(SDL_Texture * texture, SDL_Rect const * rect, void ** pixels, int * pitch)} */
    public static boolean nSDL_LockTexture(long texture, long rect, long pixels, long pitch) {
        long __functionAddress = Functions.LockTexture;
        return invokePPPPZ(texture, rect, pixels, pitch, __functionAddress);
    }

    /** {@code bool SDL_LockTexture(SDL_Texture * texture, SDL_Rect const * rect, void ** pixels, int * pitch)} */
    @NativeType("bool")
    public static boolean SDL_LockTexture(@NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("SDL_Rect const *") @Nullable SDL_Rect rect, @NativeType("void **") PointerBuffer pixels, @NativeType("int *") IntBuffer pitch) {
        if (CHECKS) {
            check(pixels, 1);
            check(pitch, 1);
        }
        return nSDL_LockTexture(texture.address(), memAddressSafe(rect), memAddress(pixels), memAddress(pitch));
    }

    // --- [ SDL_LockTextureToSurface ] ---

    /** {@code bool SDL_LockTextureToSurface(SDL_Texture * texture, SDL_Rect const * rect, SDL_Surface ** surface)} */
    public static boolean nSDL_LockTextureToSurface(long texture, long rect, long surface) {
        long __functionAddress = Functions.LockTextureToSurface;
        return invokePPPZ(texture, rect, surface, __functionAddress);
    }

    /** {@code bool SDL_LockTextureToSurface(SDL_Texture * texture, SDL_Rect const * rect, SDL_Surface ** surface)} */
    @NativeType("bool")
    public static boolean SDL_LockTextureToSurface(@NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("SDL_Rect const *") @Nullable SDL_Rect rect, @NativeType("SDL_Surface **") PointerBuffer surface) {
        if (CHECKS) {
            check(surface, 1);
        }
        return nSDL_LockTextureToSurface(texture.address(), memAddressSafe(rect), memAddress(surface));
    }

    // --- [ SDL_UnlockTexture ] ---

    /** {@code void SDL_UnlockTexture(SDL_Texture * texture)} */
    public static void nSDL_UnlockTexture(long texture) {
        long __functionAddress = Functions.UnlockTexture;
        invokePV(texture, __functionAddress);
    }

    /** {@code void SDL_UnlockTexture(SDL_Texture * texture)} */
    public static void SDL_UnlockTexture(@NativeType("SDL_Texture *") SDL_Texture texture) {
        nSDL_UnlockTexture(texture.address());
    }

    // --- [ SDL_SetRenderTarget ] ---

    /** {@code bool SDL_SetRenderTarget(SDL_Renderer * renderer, SDL_Texture * texture)} */
    public static boolean nSDL_SetRenderTarget(long renderer, long texture) {
        long __functionAddress = Functions.SetRenderTarget;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPZ(renderer, texture, __functionAddress);
    }

    /** {@code bool SDL_SetRenderTarget(SDL_Renderer * renderer, SDL_Texture * texture)} */
    @NativeType("bool")
    public static boolean SDL_SetRenderTarget(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Texture *") @Nullable SDL_Texture texture) {
        return nSDL_SetRenderTarget(renderer, memAddressSafe(texture));
    }

    // --- [ SDL_GetRenderTarget ] ---

    /** {@code SDL_Texture * SDL_GetRenderTarget(SDL_Renderer * renderer)} */
    public static long nSDL_GetRenderTarget(long renderer) {
        long __functionAddress = Functions.GetRenderTarget;
        if (CHECKS) {
            check(renderer);
        }
        return invokePP(renderer, __functionAddress);
    }

    /** {@code SDL_Texture * SDL_GetRenderTarget(SDL_Renderer * renderer)} */
    @NativeType("SDL_Texture *")
    public static @Nullable SDL_Texture SDL_GetRenderTarget(@NativeType("SDL_Renderer *") long renderer) {
        long __result = nSDL_GetRenderTarget(renderer);
        return SDL_Texture.createSafe(__result);
    }

    // --- [ SDL_SetRenderLogicalPresentation ] ---

    /** {@code bool SDL_SetRenderLogicalPresentation(SDL_Renderer * renderer, int w, int h, SDL_RendererLogicalPresentation mode)} */
    @NativeType("bool")
    public static boolean SDL_SetRenderLogicalPresentation(@NativeType("SDL_Renderer *") long renderer, int w, int h, @NativeType("SDL_RendererLogicalPresentation") int mode) {
        long __functionAddress = Functions.SetRenderLogicalPresentation;
        if (CHECKS) {
            check(renderer);
        }
        return invokePZ(renderer, w, h, mode, __functionAddress);
    }

    // --- [ SDL_GetRenderLogicalPresentation ] ---

    /** {@code bool SDL_GetRenderLogicalPresentation(SDL_Renderer * renderer, int * w, int * h, SDL_RendererLogicalPresentation * mode)} */
    public static boolean nSDL_GetRenderLogicalPresentation(long renderer, long w, long h, long mode) {
        long __functionAddress = Functions.GetRenderLogicalPresentation;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPPPZ(renderer, w, h, mode, __functionAddress);
    }

    /** {@code bool SDL_GetRenderLogicalPresentation(SDL_Renderer * renderer, int * w, int * h, SDL_RendererLogicalPresentation * mode)} */
    @NativeType("bool")
    public static boolean SDL_GetRenderLogicalPresentation(@NativeType("SDL_Renderer *") long renderer, @NativeType("int *") @Nullable IntBuffer w, @NativeType("int *") @Nullable IntBuffer h, @NativeType("SDL_RendererLogicalPresentation *") @Nullable IntBuffer mode) {
        if (CHECKS) {
            checkSafe(w, 1);
            checkSafe(h, 1);
            checkSafe(mode, 1);
        }
        return nSDL_GetRenderLogicalPresentation(renderer, memAddressSafe(w), memAddressSafe(h), memAddressSafe(mode));
    }

    // --- [ SDL_GetRenderLogicalPresentationRect ] ---

    /** {@code bool SDL_GetRenderLogicalPresentationRect(SDL_Renderer * renderer, SDL_FRect * rect)} */
    public static boolean nSDL_GetRenderLogicalPresentationRect(long renderer, long rect) {
        long __functionAddress = Functions.GetRenderLogicalPresentationRect;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPZ(renderer, rect, __functionAddress);
    }

    /** {@code bool SDL_GetRenderLogicalPresentationRect(SDL_Renderer * renderer, SDL_FRect * rect)} */
    @NativeType("bool")
    public static boolean SDL_GetRenderLogicalPresentationRect(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_FRect *") SDL_FRect rect) {
        return nSDL_GetRenderLogicalPresentationRect(renderer, rect.address());
    }

    // --- [ SDL_RenderCoordinatesFromWindow ] ---

    /** {@code bool SDL_RenderCoordinatesFromWindow(SDL_Renderer * renderer, float window_x, float window_y, float * x, float * y)} */
    public static boolean nSDL_RenderCoordinatesFromWindow(long renderer, float window_x, float window_y, long x, long y) {
        long __functionAddress = Functions.RenderCoordinatesFromWindow;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPPZ(renderer, window_x, window_y, x, y, __functionAddress);
    }

    /** {@code bool SDL_RenderCoordinatesFromWindow(SDL_Renderer * renderer, float window_x, float window_y, float * x, float * y)} */
    @NativeType("bool")
    public static boolean SDL_RenderCoordinatesFromWindow(@NativeType("SDL_Renderer *") long renderer, float window_x, float window_y, @NativeType("float *") @Nullable FloatBuffer x, @NativeType("float *") @Nullable FloatBuffer y) {
        if (CHECKS) {
            checkSafe(x, 1);
            checkSafe(y, 1);
        }
        return nSDL_RenderCoordinatesFromWindow(renderer, window_x, window_y, memAddressSafe(x), memAddressSafe(y));
    }

    // --- [ SDL_RenderCoordinatesToWindow ] ---

    /** {@code bool SDL_RenderCoordinatesToWindow(SDL_Renderer * renderer, float x, float y, float * window_x, float * window_y)} */
    public static boolean nSDL_RenderCoordinatesToWindow(long renderer, float x, float y, long window_x, long window_y) {
        long __functionAddress = Functions.RenderCoordinatesToWindow;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPPZ(renderer, x, y, window_x, window_y, __functionAddress);
    }

    /** {@code bool SDL_RenderCoordinatesToWindow(SDL_Renderer * renderer, float x, float y, float * window_x, float * window_y)} */
    @NativeType("bool")
    public static boolean SDL_RenderCoordinatesToWindow(@NativeType("SDL_Renderer *") long renderer, float x, float y, @NativeType("float *") @Nullable FloatBuffer window_x, @NativeType("float *") @Nullable FloatBuffer window_y) {
        if (CHECKS) {
            checkSafe(window_x, 1);
            checkSafe(window_y, 1);
        }
        return nSDL_RenderCoordinatesToWindow(renderer, x, y, memAddressSafe(window_x), memAddressSafe(window_y));
    }

    // --- [ SDL_ConvertEventToRenderCoordinates ] ---

    /** {@code bool SDL_ConvertEventToRenderCoordinates(SDL_Renderer * renderer, SDL_Event * event)} */
    public static boolean nSDL_ConvertEventToRenderCoordinates(long renderer, long event) {
        long __functionAddress = Functions.ConvertEventToRenderCoordinates;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPZ(renderer, event, __functionAddress);
    }

    /** {@code bool SDL_ConvertEventToRenderCoordinates(SDL_Renderer * renderer, SDL_Event * event)} */
    @NativeType("bool")
    public static boolean SDL_ConvertEventToRenderCoordinates(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Event *") SDL_Event event) {
        return nSDL_ConvertEventToRenderCoordinates(renderer, event.address());
    }

    // --- [ SDL_SetRenderViewport ] ---

    /** {@code bool SDL_SetRenderViewport(SDL_Renderer * renderer, SDL_Rect const * rect)} */
    public static boolean nSDL_SetRenderViewport(long renderer, long rect) {
        long __functionAddress = Functions.SetRenderViewport;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPZ(renderer, rect, __functionAddress);
    }

    /** {@code bool SDL_SetRenderViewport(SDL_Renderer * renderer, SDL_Rect const * rect)} */
    @NativeType("bool")
    public static boolean SDL_SetRenderViewport(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Rect const *") @Nullable SDL_Rect rect) {
        return nSDL_SetRenderViewport(renderer, memAddressSafe(rect));
    }

    // --- [ SDL_GetRenderViewport ] ---

    /** {@code bool SDL_GetRenderViewport(SDL_Renderer * renderer, SDL_Rect * rect)} */
    public static boolean nSDL_GetRenderViewport(long renderer, long rect) {
        long __functionAddress = Functions.GetRenderViewport;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPZ(renderer, rect, __functionAddress);
    }

    /** {@code bool SDL_GetRenderViewport(SDL_Renderer * renderer, SDL_Rect * rect)} */
    @NativeType("bool")
    public static boolean SDL_GetRenderViewport(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Rect *") SDL_Rect rect) {
        return nSDL_GetRenderViewport(renderer, rect.address());
    }

    // --- [ SDL_RenderViewportSet ] ---

    /** {@code bool SDL_RenderViewportSet(SDL_Renderer * renderer)} */
    @NativeType("bool")
    public static boolean SDL_RenderViewportSet(@NativeType("SDL_Renderer *") long renderer) {
        long __functionAddress = Functions.RenderViewportSet;
        if (CHECKS) {
            check(renderer);
        }
        return invokePZ(renderer, __functionAddress);
    }

    // --- [ SDL_GetRenderSafeArea ] ---

    /** {@code bool SDL_GetRenderSafeArea(SDL_Renderer * renderer, SDL_Rect * rect)} */
    public static boolean nSDL_GetRenderSafeArea(long renderer, long rect) {
        long __functionAddress = Functions.GetRenderSafeArea;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPZ(renderer, rect, __functionAddress);
    }

    /** {@code bool SDL_GetRenderSafeArea(SDL_Renderer * renderer, SDL_Rect * rect)} */
    @NativeType("bool")
    public static boolean SDL_GetRenderSafeArea(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Rect *") SDL_Rect rect) {
        return nSDL_GetRenderSafeArea(renderer, rect.address());
    }

    // --- [ SDL_SetRenderClipRect ] ---

    /** {@code bool SDL_SetRenderClipRect(SDL_Renderer * renderer, SDL_Rect const * rect)} */
    public static boolean nSDL_SetRenderClipRect(long renderer, long rect) {
        long __functionAddress = Functions.SetRenderClipRect;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPZ(renderer, rect, __functionAddress);
    }

    /** {@code bool SDL_SetRenderClipRect(SDL_Renderer * renderer, SDL_Rect const * rect)} */
    @NativeType("bool")
    public static boolean SDL_SetRenderClipRect(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Rect const *") @Nullable SDL_Rect rect) {
        return nSDL_SetRenderClipRect(renderer, memAddressSafe(rect));
    }

    // --- [ SDL_GetRenderClipRect ] ---

    /** {@code bool SDL_GetRenderClipRect(SDL_Renderer * renderer, SDL_Rect * rect)} */
    public static boolean nSDL_GetRenderClipRect(long renderer, long rect) {
        long __functionAddress = Functions.GetRenderClipRect;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPZ(renderer, rect, __functionAddress);
    }

    /** {@code bool SDL_GetRenderClipRect(SDL_Renderer * renderer, SDL_Rect * rect)} */
    @NativeType("bool")
    public static boolean SDL_GetRenderClipRect(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Rect *") SDL_Rect rect) {
        return nSDL_GetRenderClipRect(renderer, rect.address());
    }

    // --- [ SDL_RenderClipEnabled ] ---

    /** {@code bool SDL_RenderClipEnabled(SDL_Renderer * renderer)} */
    @NativeType("bool")
    public static boolean SDL_RenderClipEnabled(@NativeType("SDL_Renderer *") long renderer) {
        long __functionAddress = Functions.RenderClipEnabled;
        if (CHECKS) {
            check(renderer);
        }
        return invokePZ(renderer, __functionAddress);
    }

    // --- [ SDL_SetRenderScale ] ---

    /** {@code bool SDL_SetRenderScale(SDL_Renderer * renderer, float scaleX, float scaleY)} */
    @NativeType("bool")
    public static boolean SDL_SetRenderScale(@NativeType("SDL_Renderer *") long renderer, float scaleX, float scaleY) {
        long __functionAddress = Functions.SetRenderScale;
        if (CHECKS) {
            check(renderer);
        }
        return invokePZ(renderer, scaleX, scaleY, __functionAddress);
    }

    // --- [ SDL_GetRenderScale ] ---

    /** {@code bool SDL_GetRenderScale(SDL_Renderer * renderer, float * scaleX, float * scaleY)} */
    public static boolean nSDL_GetRenderScale(long renderer, long scaleX, long scaleY) {
        long __functionAddress = Functions.GetRenderScale;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPPZ(renderer, scaleX, scaleY, __functionAddress);
    }

    /** {@code bool SDL_GetRenderScale(SDL_Renderer * renderer, float * scaleX, float * scaleY)} */
    @NativeType("bool")
    public static boolean SDL_GetRenderScale(@NativeType("SDL_Renderer *") long renderer, @NativeType("float *") @Nullable FloatBuffer scaleX, @NativeType("float *") @Nullable FloatBuffer scaleY) {
        if (CHECKS) {
            checkSafe(scaleX, 1);
            checkSafe(scaleY, 1);
        }
        return nSDL_GetRenderScale(renderer, memAddressSafe(scaleX), memAddressSafe(scaleY));
    }

    // --- [ SDL_SetRenderDrawColor ] ---

    /** {@code bool SDL_SetRenderDrawColor(SDL_Renderer * renderer, Uint8 r, Uint8 g, Uint8 b, Uint8 a)} */
    @NativeType("bool")
    public static boolean SDL_SetRenderDrawColor(@NativeType("SDL_Renderer *") long renderer, @NativeType("Uint8") byte r, @NativeType("Uint8") byte g, @NativeType("Uint8") byte b, @NativeType("Uint8") byte a) {
        long __functionAddress = Functions.SetRenderDrawColor;
        if (CHECKS) {
            check(renderer);
        }
        return invokePUUUUZ(renderer, r, g, b, a, __functionAddress);
    }

    // --- [ SDL_SetRenderDrawColorFloat ] ---

    /** {@code bool SDL_SetRenderDrawColorFloat(SDL_Renderer * renderer, float r, float g, float b, float a)} */
    @NativeType("bool")
    public static boolean SDL_SetRenderDrawColorFloat(@NativeType("SDL_Renderer *") long renderer, float r, float g, float b, float a) {
        long __functionAddress = Functions.SetRenderDrawColorFloat;
        if (CHECKS) {
            check(renderer);
        }
        return invokePZ(renderer, r, g, b, a, __functionAddress);
    }

    // --- [ SDL_GetRenderDrawColor ] ---

    /** {@code bool SDL_GetRenderDrawColor(SDL_Renderer * renderer, Uint8 * r, Uint8 * g, Uint8 * b, Uint8 * a)} */
    public static boolean nSDL_GetRenderDrawColor(long renderer, long r, long g, long b, long a) {
        long __functionAddress = Functions.GetRenderDrawColor;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPPPPZ(renderer, r, g, b, a, __functionAddress);
    }

    /** {@code bool SDL_GetRenderDrawColor(SDL_Renderer * renderer, Uint8 * r, Uint8 * g, Uint8 * b, Uint8 * a)} */
    @NativeType("bool")
    public static boolean SDL_GetRenderDrawColor(@NativeType("SDL_Renderer *") long renderer, @NativeType("Uint8 *") @Nullable ByteBuffer r, @NativeType("Uint8 *") @Nullable ByteBuffer g, @NativeType("Uint8 *") @Nullable ByteBuffer b, @NativeType("Uint8 *") @Nullable ByteBuffer a) {
        if (CHECKS) {
            checkSafe(r, 1);
            checkSafe(g, 1);
            checkSafe(b, 1);
            checkSafe(a, 1);
        }
        return nSDL_GetRenderDrawColor(renderer, memAddressSafe(r), memAddressSafe(g), memAddressSafe(b), memAddressSafe(a));
    }

    // --- [ SDL_GetRenderDrawColorFloat ] ---

    /** {@code bool SDL_GetRenderDrawColorFloat(SDL_Renderer * renderer, float * r, float * g, float * b, float * a)} */
    public static boolean nSDL_GetRenderDrawColorFloat(long renderer, long r, long g, long b, long a) {
        long __functionAddress = Functions.GetRenderDrawColorFloat;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPPPPZ(renderer, r, g, b, a, __functionAddress);
    }

    /** {@code bool SDL_GetRenderDrawColorFloat(SDL_Renderer * renderer, float * r, float * g, float * b, float * a)} */
    @NativeType("bool")
    public static boolean SDL_GetRenderDrawColorFloat(@NativeType("SDL_Renderer *") long renderer, @NativeType("float *") @Nullable FloatBuffer r, @NativeType("float *") @Nullable FloatBuffer g, @NativeType("float *") @Nullable FloatBuffer b, @NativeType("float *") @Nullable FloatBuffer a) {
        if (CHECKS) {
            checkSafe(r, 1);
            checkSafe(g, 1);
            checkSafe(b, 1);
            checkSafe(a, 1);
        }
        return nSDL_GetRenderDrawColorFloat(renderer, memAddressSafe(r), memAddressSafe(g), memAddressSafe(b), memAddressSafe(a));
    }

    // --- [ SDL_SetRenderColorScale ] ---

    /** {@code bool SDL_SetRenderColorScale(SDL_Renderer * renderer, float scale)} */
    @NativeType("bool")
    public static boolean SDL_SetRenderColorScale(@NativeType("SDL_Renderer *") long renderer, float scale) {
        long __functionAddress = Functions.SetRenderColorScale;
        if (CHECKS) {
            check(renderer);
        }
        return invokePZ(renderer, scale, __functionAddress);
    }

    // --- [ SDL_GetRenderColorScale ] ---

    /** {@code bool SDL_GetRenderColorScale(SDL_Renderer * renderer, float * scale)} */
    public static boolean nSDL_GetRenderColorScale(long renderer, long scale) {
        long __functionAddress = Functions.GetRenderColorScale;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPZ(renderer, scale, __functionAddress);
    }

    /** {@code bool SDL_GetRenderColorScale(SDL_Renderer * renderer, float * scale)} */
    @NativeType("bool")
    public static boolean SDL_GetRenderColorScale(@NativeType("SDL_Renderer *") long renderer, @NativeType("float *") FloatBuffer scale) {
        if (CHECKS) {
            check(scale, 1);
        }
        return nSDL_GetRenderColorScale(renderer, memAddress(scale));
    }

    // --- [ SDL_SetRenderDrawBlendMode ] ---

    /** {@code bool SDL_SetRenderDrawBlendMode(SDL_Renderer * renderer, SDL_BlendMode blendMode)} */
    @NativeType("bool")
    public static boolean SDL_SetRenderDrawBlendMode(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_BlendMode") int blendMode) {
        long __functionAddress = Functions.SetRenderDrawBlendMode;
        if (CHECKS) {
            check(renderer);
        }
        return invokePZ(renderer, blendMode, __functionAddress);
    }

    // --- [ SDL_GetRenderDrawBlendMode ] ---

    /** {@code bool SDL_GetRenderDrawBlendMode(SDL_Renderer * renderer, SDL_BlendMode * blendMode)} */
    public static boolean nSDL_GetRenderDrawBlendMode(long renderer, long blendMode) {
        long __functionAddress = Functions.GetRenderDrawBlendMode;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPZ(renderer, blendMode, __functionAddress);
    }

    /** {@code bool SDL_GetRenderDrawBlendMode(SDL_Renderer * renderer, SDL_BlendMode * blendMode)} */
    @NativeType("bool")
    public static boolean SDL_GetRenderDrawBlendMode(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_BlendMode *") IntBuffer blendMode) {
        if (CHECKS) {
            check(blendMode, 1);
        }
        return nSDL_GetRenderDrawBlendMode(renderer, memAddress(blendMode));
    }

    // --- [ SDL_RenderClear ] ---

    /** {@code bool SDL_RenderClear(SDL_Renderer * renderer)} */
    @NativeType("bool")
    public static boolean SDL_RenderClear(@NativeType("SDL_Renderer *") long renderer) {
        long __functionAddress = Functions.RenderClear;
        if (CHECKS) {
            check(renderer);
        }
        return invokePZ(renderer, __functionAddress);
    }

    // --- [ SDL_RenderPoint ] ---

    /** {@code bool SDL_RenderPoint(SDL_Renderer * renderer, float x, float y)} */
    @NativeType("bool")
    public static boolean SDL_RenderPoint(@NativeType("SDL_Renderer *") long renderer, float x, float y) {
        long __functionAddress = Functions.RenderPoint;
        if (CHECKS) {
            check(renderer);
        }
        return invokePZ(renderer, x, y, __functionAddress);
    }

    // --- [ SDL_RenderPoints ] ---

    /** {@code bool SDL_RenderPoints(SDL_Renderer * renderer, SDL_FPoint const * points, int count)} */
    public static boolean nSDL_RenderPoints(long renderer, long points, int count) {
        long __functionAddress = Functions.RenderPoints;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPZ(renderer, points, count, __functionAddress);
    }

    /** {@code bool SDL_RenderPoints(SDL_Renderer * renderer, SDL_FPoint const * points, int count)} */
    @NativeType("bool")
    public static boolean SDL_RenderPoints(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_FPoint const *") SDL_FPoint.Buffer points) {
        return nSDL_RenderPoints(renderer, points.address(), points.remaining());
    }

    // --- [ SDL_RenderLine ] ---

    /** {@code bool SDL_RenderLine(SDL_Renderer * renderer, float x1, float y1, float x2, float y2)} */
    @NativeType("bool")
    public static boolean SDL_RenderLine(@NativeType("SDL_Renderer *") long renderer, float x1, float y1, float x2, float y2) {
        long __functionAddress = Functions.RenderLine;
        if (CHECKS) {
            check(renderer);
        }
        return invokePZ(renderer, x1, y1, x2, y2, __functionAddress);
    }

    // --- [ SDL_RenderLines ] ---

    /** {@code bool SDL_RenderLines(SDL_Renderer * renderer, SDL_FPoint const * points, int count)} */
    public static boolean nSDL_RenderLines(long renderer, long points, int count) {
        long __functionAddress = Functions.RenderLines;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPZ(renderer, points, count, __functionAddress);
    }

    /** {@code bool SDL_RenderLines(SDL_Renderer * renderer, SDL_FPoint const * points, int count)} */
    @NativeType("bool")
    public static boolean SDL_RenderLines(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_FPoint const *") SDL_FPoint.Buffer points) {
        return nSDL_RenderLines(renderer, points.address(), points.remaining());
    }

    // --- [ SDL_RenderRect ] ---

    /** {@code bool SDL_RenderRect(SDL_Renderer * renderer, SDL_FRect const * rect)} */
    public static boolean nSDL_RenderRect(long renderer, long rect) {
        long __functionAddress = Functions.RenderRect;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPZ(renderer, rect, __functionAddress);
    }

    /** {@code bool SDL_RenderRect(SDL_Renderer * renderer, SDL_FRect const * rect)} */
    @NativeType("bool")
    public static boolean SDL_RenderRect(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_FRect const *") @Nullable SDL_FRect rect) {
        return nSDL_RenderRect(renderer, memAddressSafe(rect));
    }

    // --- [ SDL_RenderRects ] ---

    /** {@code bool SDL_RenderRects(SDL_Renderer * renderer, SDL_FRect const * rects, int count)} */
    public static boolean nSDL_RenderRects(long renderer, long rects, int count) {
        long __functionAddress = Functions.RenderRects;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPZ(renderer, rects, count, __functionAddress);
    }

    /** {@code bool SDL_RenderRects(SDL_Renderer * renderer, SDL_FRect const * rects, int count)} */
    @NativeType("bool")
    public static boolean SDL_RenderRects(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_FRect const *") SDL_FRect.Buffer rects) {
        return nSDL_RenderRects(renderer, rects.address(), rects.remaining());
    }

    // --- [ SDL_RenderFillRect ] ---

    /** {@code bool SDL_RenderFillRect(SDL_Renderer * renderer, SDL_FRect const * rect)} */
    public static boolean nSDL_RenderFillRect(long renderer, long rect) {
        long __functionAddress = Functions.RenderFillRect;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPZ(renderer, rect, __functionAddress);
    }

    /** {@code bool SDL_RenderFillRect(SDL_Renderer * renderer, SDL_FRect const * rect)} */
    @NativeType("bool")
    public static boolean SDL_RenderFillRect(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_FRect const *") @Nullable SDL_FRect rect) {
        return nSDL_RenderFillRect(renderer, memAddressSafe(rect));
    }

    // --- [ SDL_RenderFillRects ] ---

    /** {@code bool SDL_RenderFillRects(SDL_Renderer * renderer, SDL_FRect const * rects, int count)} */
    public static boolean nSDL_RenderFillRects(long renderer, long rects, int count) {
        long __functionAddress = Functions.RenderFillRects;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPZ(renderer, rects, count, __functionAddress);
    }

    /** {@code bool SDL_RenderFillRects(SDL_Renderer * renderer, SDL_FRect const * rects, int count)} */
    @NativeType("bool")
    public static boolean SDL_RenderFillRects(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_FRect const *") SDL_FRect.Buffer rects) {
        return nSDL_RenderFillRects(renderer, rects.address(), rects.remaining());
    }

    // --- [ SDL_RenderTexture ] ---

    /** {@code bool SDL_RenderTexture(SDL_Renderer * renderer, SDL_Texture * texture, SDL_FRect const * srcrect, SDL_FRect const * dstrect)} */
    public static boolean nSDL_RenderTexture(long renderer, long texture, long srcrect, long dstrect) {
        long __functionAddress = Functions.RenderTexture;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPPPZ(renderer, texture, srcrect, dstrect, __functionAddress);
    }

    /** {@code bool SDL_RenderTexture(SDL_Renderer * renderer, SDL_Texture * texture, SDL_FRect const * srcrect, SDL_FRect const * dstrect)} */
    @NativeType("bool")
    public static boolean SDL_RenderTexture(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("SDL_FRect const *") @Nullable SDL_FRect srcrect, @NativeType("SDL_FRect const *") @Nullable SDL_FRect dstrect) {
        return nSDL_RenderTexture(renderer, texture.address(), memAddressSafe(srcrect), memAddressSafe(dstrect));
    }

    // --- [ SDL_RenderTextureRotated ] ---

    /** {@code bool SDL_RenderTextureRotated(SDL_Renderer * renderer, SDL_Texture * texture, SDL_FRect const * srcrect, SDL_FRect const * dstrect, double angle, SDL_FPoint const * center, SDL_FlipMode flip)} */
    public static boolean nSDL_RenderTextureRotated(long renderer, long texture, long srcrect, long dstrect, double angle, long center, int flip) {
        long __functionAddress = Functions.RenderTextureRotated;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPPPPZ(renderer, texture, srcrect, dstrect, angle, center, flip, __functionAddress);
    }

    /** {@code bool SDL_RenderTextureRotated(SDL_Renderer * renderer, SDL_Texture * texture, SDL_FRect const * srcrect, SDL_FRect const * dstrect, double angle, SDL_FPoint const * center, SDL_FlipMode flip)} */
    @NativeType("bool")
    public static boolean SDL_RenderTextureRotated(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("SDL_FRect const *") @Nullable SDL_FRect srcrect, @NativeType("SDL_FRect const *") @Nullable SDL_FRect dstrect, double angle, @NativeType("SDL_FPoint const *") @Nullable SDL_FPoint center, @NativeType("SDL_FlipMode") int flip) {
        return nSDL_RenderTextureRotated(renderer, texture.address(), memAddressSafe(srcrect), memAddressSafe(dstrect), angle, memAddressSafe(center), flip);
    }

    // --- [ SDL_RenderTextureAffine ] ---

    /** {@code bool SDL_RenderTextureAffine(SDL_Renderer * renderer, SDL_Texture * texture, SDL_FRect const * srcrect, SDL_FPoint const * origin, SDL_FPoint const * right, SDL_FPoint const * down)} */
    public static boolean nSDL_RenderTextureAffine(long renderer, long texture, long srcrect, long origin, long right, long down) {
        long __functionAddress = Functions.RenderTextureAffine;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPPPPPZ(renderer, texture, srcrect, origin, right, down, __functionAddress);
    }

    /** {@code bool SDL_RenderTextureAffine(SDL_Renderer * renderer, SDL_Texture * texture, SDL_FRect const * srcrect, SDL_FPoint const * origin, SDL_FPoint const * right, SDL_FPoint const * down)} */
    @NativeType("bool")
    public static boolean SDL_RenderTextureAffine(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("SDL_FRect const *") @Nullable SDL_FRect srcrect, @NativeType("SDL_FPoint const *") @Nullable SDL_FPoint origin, @NativeType("SDL_FPoint const *") @Nullable SDL_FPoint right, @NativeType("SDL_FPoint const *") @Nullable SDL_FPoint down) {
        return nSDL_RenderTextureAffine(renderer, texture.address(), memAddressSafe(srcrect), memAddressSafe(origin), memAddressSafe(right), memAddressSafe(down));
    }

    // --- [ SDL_RenderTextureTiled ] ---

    /** {@code bool SDL_RenderTextureTiled(SDL_Renderer * renderer, SDL_Texture * texture, SDL_FRect const * srcrect, float scale, SDL_FRect const * dstrect)} */
    public static boolean nSDL_RenderTextureTiled(long renderer, long texture, long srcrect, float scale, long dstrect) {
        long __functionAddress = Functions.RenderTextureTiled;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPPPZ(renderer, texture, srcrect, scale, dstrect, __functionAddress);
    }

    /** {@code bool SDL_RenderTextureTiled(SDL_Renderer * renderer, SDL_Texture * texture, SDL_FRect const * srcrect, float scale, SDL_FRect const * dstrect)} */
    @NativeType("bool")
    public static boolean SDL_RenderTextureTiled(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("SDL_FRect const *") @Nullable SDL_FRect srcrect, float scale, @NativeType("SDL_FRect const *") @Nullable SDL_FRect dstrect) {
        return nSDL_RenderTextureTiled(renderer, texture.address(), memAddressSafe(srcrect), scale, memAddressSafe(dstrect));
    }

    // --- [ SDL_RenderTexture9Grid ] ---

    /** {@code bool SDL_RenderTexture9Grid(SDL_Renderer * renderer, SDL_Texture * texture, SDL_FRect const * srcrect, float left_width, float right_width, float top_height, float bottom_height, float scale, SDL_FRect const * dstrect)} */
    public static boolean nSDL_RenderTexture9Grid(long renderer, long texture, long srcrect, float left_width, float right_width, float top_height, float bottom_height, float scale, long dstrect) {
        long __functionAddress = Functions.RenderTexture9Grid;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPPPZ(renderer, texture, srcrect, left_width, right_width, top_height, bottom_height, scale, dstrect, __functionAddress);
    }

    /** {@code bool SDL_RenderTexture9Grid(SDL_Renderer * renderer, SDL_Texture * texture, SDL_FRect const * srcrect, float left_width, float right_width, float top_height, float bottom_height, float scale, SDL_FRect const * dstrect)} */
    @NativeType("bool")
    public static boolean SDL_RenderTexture9Grid(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("SDL_FRect const *") @Nullable SDL_FRect srcrect, float left_width, float right_width, float top_height, float bottom_height, float scale, @NativeType("SDL_FRect const *") @Nullable SDL_FRect dstrect) {
        return nSDL_RenderTexture9Grid(renderer, texture.address(), memAddressSafe(srcrect), left_width, right_width, top_height, bottom_height, scale, memAddressSafe(dstrect));
    }

    // --- [ SDL_RenderTexture9GridTiled ] ---

    /** {@code bool SDL_RenderTexture9GridTiled(SDL_Renderer * renderer, SDL_Texture * texture, SDL_FRect const * srcrect, float left_width, float right_width, float top_height, float bottom_height, float scale, SDL_FRect const * dstrect, float tileScale)} */
    public static boolean nSDL_RenderTexture9GridTiled(long renderer, long texture, long srcrect, float left_width, float right_width, float top_height, float bottom_height, float scale, long dstrect, float tileScale) {
        long __functionAddress = Functions.RenderTexture9GridTiled;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPPPZ(renderer, texture, srcrect, left_width, right_width, top_height, bottom_height, scale, dstrect, tileScale, __functionAddress);
    }

    /** {@code bool SDL_RenderTexture9GridTiled(SDL_Renderer * renderer, SDL_Texture * texture, SDL_FRect const * srcrect, float left_width, float right_width, float top_height, float bottom_height, float scale, SDL_FRect const * dstrect, float tileScale)} */
    @NativeType("bool")
    public static boolean SDL_RenderTexture9GridTiled(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("SDL_FRect const *") @Nullable SDL_FRect srcrect, float left_width, float right_width, float top_height, float bottom_height, float scale, @NativeType("SDL_FRect const *") @Nullable SDL_FRect dstrect, float tileScale) {
        return nSDL_RenderTexture9GridTiled(renderer, texture.address(), memAddressSafe(srcrect), left_width, right_width, top_height, bottom_height, scale, memAddressSafe(dstrect), tileScale);
    }

    // --- [ SDL_RenderGeometry ] ---

    /** {@code bool SDL_RenderGeometry(SDL_Renderer * renderer, SDL_Texture * texture, SDL_Vertex const * vertices, int num_vertices, int const * indices, int num_indices)} */
    public static boolean nSDL_RenderGeometry(long renderer, long texture, long vertices, int num_vertices, long indices, int num_indices) {
        long __functionAddress = Functions.RenderGeometry;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPPPZ(renderer, texture, vertices, num_vertices, indices, num_indices, __functionAddress);
    }

    /** {@code bool SDL_RenderGeometry(SDL_Renderer * renderer, SDL_Texture * texture, SDL_Vertex const * vertices, int num_vertices, int const * indices, int num_indices)} */
    @NativeType("bool")
    public static boolean SDL_RenderGeometry(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Texture *") @Nullable SDL_Texture texture, @NativeType("SDL_Vertex const *") SDL_Vertex.Buffer vertices, @NativeType("int const *") @Nullable IntBuffer indices) {
        return nSDL_RenderGeometry(renderer, memAddressSafe(texture), vertices.address(), vertices.remaining(), memAddressSafe(indices), remainingSafe(indices));
    }

    // --- [ SDL_RenderGeometryRaw ] ---

    /** {@code bool SDL_RenderGeometryRaw(SDL_Renderer * renderer, SDL_Texture * texture, float const * xy, int xy_stride, SDL_FColor const * color, int color_stride, float const * uv, int uv_stride, int num_vertices, void const * indices, int num_indices, int size_indices)} */
    public static boolean nSDL_RenderGeometryRaw(long renderer, long texture, long xy, int xy_stride, long color, int color_stride, long uv, int uv_stride, int num_vertices, long indices, int num_indices, int size_indices) {
        long __functionAddress = Functions.RenderGeometryRaw;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPPPPPZ(renderer, texture, xy, xy_stride, color, color_stride, uv, uv_stride, num_vertices, indices, num_indices, size_indices, __functionAddress);
    }

    /** {@code bool SDL_RenderGeometryRaw(SDL_Renderer * renderer, SDL_Texture * texture, float const * xy, int xy_stride, SDL_FColor const * color, int color_stride, float const * uv, int uv_stride, int num_vertices, void const * indices, int num_indices, int size_indices)} */
    @NativeType("bool")
    public static boolean SDL_RenderGeometryRaw(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Texture *") @Nullable SDL_Texture texture, @NativeType("float const *") FloatBuffer xy, int xy_stride, @NativeType("SDL_FColor const *") SDL_FColor.Buffer color, int color_stride, @NativeType("float const *") @Nullable FloatBuffer uv, int uv_stride, int num_vertices, @NativeType("void const *") @Nullable ByteBuffer indices, int num_indices, int size_indices) {
        if (CHECKS) {
            check(xy, (num_vertices * xy_stride) >> 2);
            check(color, (num_vertices * color_stride) / SDL_FColor.SIZEOF);
            checkSafe(uv, (num_vertices * uv_stride) >> 2);
            checkSafe(indices, num_indices * size_indices);
        }
        return nSDL_RenderGeometryRaw(renderer, memAddressSafe(texture), memAddress(xy), xy_stride, color.address(), color_stride, memAddressSafe(uv), uv_stride, num_vertices, memAddressSafe(indices), num_indices, size_indices);
    }

    /** {@code bool SDL_RenderGeometryRaw(SDL_Renderer * renderer, SDL_Texture * texture, float const * xy, int xy_stride, SDL_FColor const * color, int color_stride, float const * uv, int uv_stride, int num_vertices, void const * indices, int num_indices, int size_indices)} */
    @NativeType("bool")
    public static boolean SDL_RenderGeometryRaw(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Texture *") @Nullable SDL_Texture texture, @NativeType("float const *") FloatBuffer xy, int xy_stride, @NativeType("SDL_FColor const *") SDL_FColor.Buffer color, int color_stride, @NativeType("float const *") @Nullable FloatBuffer uv, int uv_stride, int num_vertices, @NativeType("void const *") @Nullable ShortBuffer indices, int num_indices, int size_indices) {
        if (CHECKS) {
            check(xy, (num_vertices * xy_stride) >> 2);
            check(color, (num_vertices * color_stride) / SDL_FColor.SIZEOF);
            checkSafe(uv, (num_vertices * uv_stride) >> 2);
            checkSafe(indices, (num_indices * size_indices) >> 1);
        }
        return nSDL_RenderGeometryRaw(renderer, memAddressSafe(texture), memAddress(xy), xy_stride, color.address(), color_stride, memAddressSafe(uv), uv_stride, num_vertices, memAddressSafe(indices), num_indices, size_indices);
    }

    /** {@code bool SDL_RenderGeometryRaw(SDL_Renderer * renderer, SDL_Texture * texture, float const * xy, int xy_stride, SDL_FColor const * color, int color_stride, float const * uv, int uv_stride, int num_vertices, void const * indices, int num_indices, int size_indices)} */
    @NativeType("bool")
    public static boolean SDL_RenderGeometryRaw(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Texture *") @Nullable SDL_Texture texture, @NativeType("float const *") FloatBuffer xy, int xy_stride, @NativeType("SDL_FColor const *") SDL_FColor.Buffer color, int color_stride, @NativeType("float const *") @Nullable FloatBuffer uv, int uv_stride, int num_vertices, @NativeType("void const *") @Nullable IntBuffer indices, int num_indices, int size_indices) {
        if (CHECKS) {
            check(xy, (num_vertices * xy_stride) >> 2);
            check(color, (num_vertices * color_stride) / SDL_FColor.SIZEOF);
            checkSafe(uv, (num_vertices * uv_stride) >> 2);
            checkSafe(indices, (num_indices * size_indices) >> 2);
        }
        return nSDL_RenderGeometryRaw(renderer, memAddressSafe(texture), memAddress(xy), xy_stride, color.address(), color_stride, memAddressSafe(uv), uv_stride, num_vertices, memAddressSafe(indices), num_indices, size_indices);
    }

    // --- [ SDL_SetRenderTextureAddressMode ] ---

    /** {@code bool SDL_SetRenderTextureAddressMode(SDL_Renderer * renderer, SDL_TextureAddressMode u_mode, SDL_TextureAddressMode v_mode)} */
    @NativeType("bool")
    public static boolean SDL_SetRenderTextureAddressMode(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_TextureAddressMode") int u_mode, @NativeType("SDL_TextureAddressMode") int v_mode) {
        long __functionAddress = Functions.SetRenderTextureAddressMode;
        if (CHECKS) {
            check(renderer);
        }
        return invokePZ(renderer, u_mode, v_mode, __functionAddress);
    }

    // --- [ SDL_GetRenderTextureAddressMode ] ---

    /** {@code bool SDL_GetRenderTextureAddressMode(SDL_Renderer * renderer, SDL_TextureAddressMode * u_mode, SDL_TextureAddressMode * v_mode)} */
    public static boolean nSDL_GetRenderTextureAddressMode(long renderer, long u_mode, long v_mode) {
        long __functionAddress = Functions.GetRenderTextureAddressMode;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPPZ(renderer, u_mode, v_mode, __functionAddress);
    }

    /** {@code bool SDL_GetRenderTextureAddressMode(SDL_Renderer * renderer, SDL_TextureAddressMode * u_mode, SDL_TextureAddressMode * v_mode)} */
    @NativeType("bool")
    public static boolean SDL_GetRenderTextureAddressMode(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_TextureAddressMode *") @Nullable IntBuffer u_mode, @NativeType("SDL_TextureAddressMode *") @Nullable IntBuffer v_mode) {
        if (CHECKS) {
            checkSafe(u_mode, 1);
            checkSafe(v_mode, 1);
        }
        return nSDL_GetRenderTextureAddressMode(renderer, memAddressSafe(u_mode), memAddressSafe(v_mode));
    }

    // --- [ SDL_RenderReadPixels ] ---

    /** {@code SDL_Surface * SDL_RenderReadPixels(SDL_Renderer * renderer, SDL_Rect const * rect)} */
    public static long nSDL_RenderReadPixels(long renderer, long rect) {
        long __functionAddress = Functions.RenderReadPixels;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPP(renderer, rect, __functionAddress);
    }

    /** {@code SDL_Surface * SDL_RenderReadPixels(SDL_Renderer * renderer, SDL_Rect const * rect)} */
    @NativeType("SDL_Surface *")
    public static @Nullable SDL_Surface SDL_RenderReadPixels(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Rect const *") @Nullable SDL_Rect rect) {
        long __result = nSDL_RenderReadPixels(renderer, memAddressSafe(rect));
        return SDL_Surface.createSafe(__result);
    }

    // --- [ SDL_RenderPresent ] ---

    /** {@code bool SDL_RenderPresent(SDL_Renderer * renderer)} */
    @NativeType("bool")
    public static boolean SDL_RenderPresent(@NativeType("SDL_Renderer *") long renderer) {
        long __functionAddress = Functions.RenderPresent;
        if (CHECKS) {
            check(renderer);
        }
        return invokePZ(renderer, __functionAddress);
    }

    // --- [ SDL_DestroyTexture ] ---

    /** {@code void SDL_DestroyTexture(SDL_Texture * texture)} */
    public static void nSDL_DestroyTexture(long texture) {
        long __functionAddress = Functions.DestroyTexture;
        invokePV(texture, __functionAddress);
    }

    /** {@code void SDL_DestroyTexture(SDL_Texture * texture)} */
    public static void SDL_DestroyTexture(@NativeType("SDL_Texture *") SDL_Texture texture) {
        nSDL_DestroyTexture(texture.address());
    }

    // --- [ SDL_DestroyRenderer ] ---

    /** {@code void SDL_DestroyRenderer(SDL_Renderer * renderer)} */
    public static void SDL_DestroyRenderer(@NativeType("SDL_Renderer *") long renderer) {
        long __functionAddress = Functions.DestroyRenderer;
        if (CHECKS) {
            check(renderer);
        }
        invokePV(renderer, __functionAddress);
    }

    // --- [ SDL_FlushRenderer ] ---

    /** {@code bool SDL_FlushRenderer(SDL_Renderer * renderer)} */
    @NativeType("bool")
    public static boolean SDL_FlushRenderer(@NativeType("SDL_Renderer *") long renderer) {
        long __functionAddress = Functions.FlushRenderer;
        if (CHECKS) {
            check(renderer);
        }
        return invokePZ(renderer, __functionAddress);
    }

    // --- [ SDL_GetRenderMetalLayer ] ---

    /** {@code void * SDL_GetRenderMetalLayer(SDL_Renderer * renderer)} */
    @NativeType("void *")
    public static long SDL_GetRenderMetalLayer(@NativeType("SDL_Renderer *") long renderer) {
        long __functionAddress = Functions.GetRenderMetalLayer;
        if (CHECKS) {
            check(renderer);
        }
        return invokePP(renderer, __functionAddress);
    }

    // --- [ SDL_GetRenderMetalCommandEncoder ] ---

    /** {@code void * SDL_GetRenderMetalCommandEncoder(SDL_Renderer * renderer)} */
    @NativeType("void *")
    public static long SDL_GetRenderMetalCommandEncoder(@NativeType("SDL_Renderer *") long renderer) {
        long __functionAddress = Functions.GetRenderMetalCommandEncoder;
        if (CHECKS) {
            check(renderer);
        }
        return invokePP(renderer, __functionAddress);
    }

    // --- [ SDL_AddVulkanRenderSemaphores ] ---

    /** {@code bool SDL_AddVulkanRenderSemaphores(SDL_Renderer * renderer, Uint32 wait_stage_mask, Sint64 wait_semaphore, Sint64 signal_semaphore)} */
    @NativeType("bool")
    public static boolean SDL_AddVulkanRenderSemaphores(@NativeType("SDL_Renderer *") long renderer, @NativeType("Uint32") int wait_stage_mask, @NativeType("Sint64") long wait_semaphore, @NativeType("Sint64") long signal_semaphore) {
        long __functionAddress = Functions.AddVulkanRenderSemaphores;
        if (CHECKS) {
            check(renderer);
        }
        return invokePJJZ(renderer, wait_stage_mask, wait_semaphore, signal_semaphore, __functionAddress);
    }

    // --- [ SDL_SetRenderVSync ] ---

    /** {@code bool SDL_SetRenderVSync(SDL_Renderer * renderer, int vsync)} */
    @NativeType("bool")
    public static boolean SDL_SetRenderVSync(@NativeType("SDL_Renderer *") long renderer, int vsync) {
        long __functionAddress = Functions.SetRenderVSync;
        if (CHECKS) {
            check(renderer);
        }
        return invokePZ(renderer, vsync, __functionAddress);
    }

    // --- [ SDL_GetRenderVSync ] ---

    /** {@code bool SDL_GetRenderVSync(SDL_Renderer * renderer, int * vsync)} */
    public static boolean nSDL_GetRenderVSync(long renderer, long vsync) {
        long __functionAddress = Functions.GetRenderVSync;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPZ(renderer, vsync, __functionAddress);
    }

    /** {@code bool SDL_GetRenderVSync(SDL_Renderer * renderer, int * vsync)} */
    @NativeType("bool")
    public static boolean SDL_GetRenderVSync(@NativeType("SDL_Renderer *") long renderer, @NativeType("int *") IntBuffer vsync) {
        if (CHECKS) {
            check(vsync, 1);
        }
        return nSDL_GetRenderVSync(renderer, memAddress(vsync));
    }

    // --- [ SDL_RenderDebugText ] ---

    /** {@code bool SDL_RenderDebugText(SDL_Renderer * renderer, float x, float y, char const * str)} */
    public static boolean nSDL_RenderDebugText(long renderer, float x, float y, long str) {
        long __functionAddress = Functions.RenderDebugText;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPZ(renderer, x, y, str, __functionAddress);
    }

    /** {@code bool SDL_RenderDebugText(SDL_Renderer * renderer, float x, float y, char const * str)} */
    @NativeType("bool")
    public static boolean SDL_RenderDebugText(@NativeType("SDL_Renderer *") long renderer, float x, float y, @NativeType("char const *") ByteBuffer str) {
        if (CHECKS) {
            checkNT1(str);
        }
        return nSDL_RenderDebugText(renderer, x, y, memAddress(str));
    }

    /** {@code bool SDL_RenderDebugText(SDL_Renderer * renderer, float x, float y, char const * str)} */
    @NativeType("bool")
    public static boolean SDL_RenderDebugText(@NativeType("SDL_Renderer *") long renderer, float x, float y, @NativeType("char const *") CharSequence str) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            return nSDL_RenderDebugText(renderer, x, y, strEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_RenderDebugTextFormat ] ---

    /** {@code bool SDL_RenderDebugTextFormat(SDL_Renderer * renderer, float x, float y, char const * fmt)} */
    public static boolean nSDL_RenderDebugTextFormat(long renderer, float x, float y, long fmt) {
        long __functionAddress = Functions.RenderDebugTextFormat;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPZ(renderer, x, y, fmt, __functionAddress);
    }

    /** {@code bool SDL_RenderDebugTextFormat(SDL_Renderer * renderer, float x, float y, char const * fmt)} */
    @NativeType("bool")
    public static boolean SDL_RenderDebugTextFormat(@NativeType("SDL_Renderer *") long renderer, float x, float y, @NativeType("char const *") ByteBuffer fmt) {
        if (CHECKS) {
            checkNT1(fmt);
        }
        return nSDL_RenderDebugTextFormat(renderer, x, y, memAddress(fmt));
    }

    /** {@code bool SDL_RenderDebugTextFormat(SDL_Renderer * renderer, float x, float y, char const * fmt)} */
    @NativeType("bool")
    public static boolean SDL_RenderDebugTextFormat(@NativeType("SDL_Renderer *") long renderer, float x, float y, @NativeType("char const *") CharSequence fmt) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(fmt, true);
            long fmtEncoded = stack.getPointerAddress();
            return nSDL_RenderDebugTextFormat(renderer, x, y, fmtEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_SetDefaultTextureScaleMode ] ---

    /** {@code bool SDL_SetDefaultTextureScaleMode(SDL_Renderer * renderer, SDL_ScaleMode scale_mode)} */
    @NativeType("bool")
    public static boolean SDL_SetDefaultTextureScaleMode(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_ScaleMode") int scale_mode) {
        long __functionAddress = Functions.SetDefaultTextureScaleMode;
        if (CHECKS) {
            check(renderer);
        }
        return invokePZ(renderer, scale_mode, __functionAddress);
    }

    // --- [ SDL_GetDefaultTextureScaleMode ] ---

    /** {@code bool SDL_GetDefaultTextureScaleMode(SDL_Renderer * renderer, SDL_ScaleMode * scale_mode)} */
    public static boolean nSDL_GetDefaultTextureScaleMode(long renderer, long scale_mode) {
        long __functionAddress = Functions.GetDefaultTextureScaleMode;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPZ(renderer, scale_mode, __functionAddress);
    }

    /** {@code bool SDL_GetDefaultTextureScaleMode(SDL_Renderer * renderer, SDL_ScaleMode * scale_mode)} */
    @NativeType("bool")
    public static boolean SDL_GetDefaultTextureScaleMode(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_ScaleMode *") @Nullable IntBuffer scale_mode) {
        if (CHECKS) {
            checkSafe(scale_mode, 1);
        }
        return nSDL_GetDefaultTextureScaleMode(renderer, memAddressSafe(scale_mode));
    }

    // --- [ SDL_CreateGPURenderState ] ---

    /** {@code SDL_GPURenderState * SDL_CreateGPURenderState(SDL_Renderer * renderer, SDL_GPURenderStateCreateInfo const * createinfo)} */
    public static long nSDL_CreateGPURenderState(long renderer, long createinfo) {
        long __functionAddress = Functions.CreateGPURenderState;
        if (CHECKS) {
            check(renderer);
            SDL_GPURenderStateCreateInfo.validate(createinfo);
        }
        return invokePPP(renderer, createinfo, __functionAddress);
    }

    /** {@code SDL_GPURenderState * SDL_CreateGPURenderState(SDL_Renderer * renderer, SDL_GPURenderStateCreateInfo const * createinfo)} */
    @NativeType("SDL_GPURenderState *")
    public static long SDL_CreateGPURenderState(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_GPURenderStateCreateInfo const *") SDL_GPURenderStateCreateInfo createinfo) {
        return nSDL_CreateGPURenderState(renderer, createinfo.address());
    }

    // --- [ SDL_SetGPURenderStateFragmentUniforms ] ---

    /** {@code bool SDL_SetGPURenderStateFragmentUniforms(SDL_GPURenderState * state, Uint32 slot_index, void const * data, Uint32 length)} */
    public static boolean nSDL_SetGPURenderStateFragmentUniforms(long state, int slot_index, long data, int length) {
        long __functionAddress = Functions.SetGPURenderStateFragmentUniforms;
        if (CHECKS) {
            check(state);
        }
        return invokePPZ(state, slot_index, data, length, __functionAddress);
    }

    /** {@code bool SDL_SetGPURenderStateFragmentUniforms(SDL_GPURenderState * state, Uint32 slot_index, void const * data, Uint32 length)} */
    @NativeType("bool")
    public static boolean SDL_SetGPURenderStateFragmentUniforms(@NativeType("SDL_GPURenderState *") long state, @NativeType("Uint32") int slot_index, @NativeType("void const *") ByteBuffer data) {
        return nSDL_SetGPURenderStateFragmentUniforms(state, slot_index, memAddress(data), data.remaining());
    }

    // --- [ SDL_SetGPURenderState ] ---

    /** {@code bool SDL_SetGPURenderState(SDL_Renderer * renderer, SDL_GPURenderState * state)} */
    @NativeType("bool")
    public static boolean SDL_SetGPURenderState(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_GPURenderState *") long state) {
        long __functionAddress = Functions.SetGPURenderState;
        if (CHECKS) {
            check(renderer);
            check(state);
        }
        return invokePPZ(renderer, state, __functionAddress);
    }

    // --- [ SDL_DestroyGPURenderState ] ---

    /** {@code void SDL_DestroyGPURenderState(SDL_GPURenderState * state)} */
    public static void SDL_DestroyGPURenderState(@NativeType("SDL_GPURenderState *") long state) {
        long __functionAddress = Functions.DestroyGPURenderState;
        if (CHECKS) {
            check(state);
        }
        invokePV(state, __functionAddress);
    }

}