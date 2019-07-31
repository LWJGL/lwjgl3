/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;
import java.util.Set;

import static org.lwjgl.system.APIUtil.*;

/** Defines the WGL capabilities of an OpenGL device. */
public final class WGLCapabilities {

    public final long
        wglGetGPUIDsAMD,
        wglGetGPUInfoAMD,
        wglGetContextGPUIDAMD,
        wglCreateAssociatedContextAMD,
        wglCreateAssociatedContextAttribsAMD,
        wglDeleteAssociatedContextAMD,
        wglMakeAssociatedContextCurrentAMD,
        wglGetCurrentAssociatedContextAMD,
        wglBlitContextFramebufferAMD,
        wglCreateBufferRegionARB,
        wglDeleteBufferRegionARB,
        wglSaveBufferRegionARB,
        wglRestoreBufferRegionARB,
        wglCreateContextAttribsARB,
        wglGetExtensionsStringARB,
        wglMakeContextCurrentARB,
        wglGetCurrentReadDCARB,
        wglCreatePbufferARB,
        wglGetPbufferDCARB,
        wglReleasePbufferDCARB,
        wglDestroyPbufferARB,
        wglQueryPbufferARB,
        wglGetPixelFormatAttribivARB,
        wglGetPixelFormatAttribfvARB,
        wglChoosePixelFormatARB,
        wglBindTexImageARB,
        wglReleaseTexImageARB,
        wglSetPbufferAttribARB,
        wglGetExtensionsStringEXT,
        wglSwapIntervalEXT,
        wglGetSwapIntervalEXT,
        wglCopyImageSubDataNV,
        wglDelayBeforeSwapNV,
        wglDXSetResourceShareHandleNV,
        wglDXOpenDeviceNV,
        wglDXCloseDeviceNV,
        wglDXRegisterObjectNV,
        wglDXUnregisterObjectNV,
        wglDXObjectAccessNV,
        wglDXLockObjectsNV,
        wglDXUnlockObjectsNV,
        wglEnumGpusNV,
        wglEnumGpuDevicesNV,
        wglCreateAffinityDCNV,
        wglEnumGpusFromAffinityDCNV,
        wglDeleteDCNV,
        wglJoinSwapGroupNV,
        wglBindSwapBarrierNV,
        wglQuerySwapGroupNV,
        wglQueryMaxSwapGroupsNV,
        wglQueryFrameCountNV,
        wglResetFrameCountNV,
        wglAllocateMemoryNV,
        wglFreeMemoryNV;

    /** When true, {@link WGLAMDGPUAssociation} is supported. */
    public final boolean WGL_AMD_gpu_association;
    /** When true, {@link WGLARBBufferRegion} is supported. */
    public final boolean WGL_ARB_buffer_region;
    /** When true, {@link WGLARBContextFlushControl} is supported. */
    public final boolean WGL_ARB_context_flush_control;
    /** When true, {@link WGLARBCreateContext} is supported. */
    public final boolean WGL_ARB_create_context;
    /** When true, {@link WGLARBCreateContextNoError} is supported. */
    public final boolean WGL_ARB_create_context_no_error;
    /** When true, {@link WGLARBCreateContextProfile} is supported. */
    public final boolean WGL_ARB_create_context_profile;
    /** When true, {@link WGLARBCreateContextRobustness} is supported. */
    public final boolean WGL_ARB_create_context_robustness;
    /** When true, {@link WGLARBExtensionsString} is supported. */
    public final boolean WGL_ARB_extensions_string;
    /** When true, {@link WGLARBFramebufferSRGB} is supported. */
    public final boolean WGL_ARB_framebuffer_sRGB;
    /** When true, {@link WGLARBMakeCurrentRead} is supported. */
    public final boolean WGL_ARB_make_current_read;
    /** When true, {@link WGLARBMultisample} is supported. */
    public final boolean WGL_ARB_multisample;
    /** When true, {@link WGLARBPbuffer} is supported. */
    public final boolean WGL_ARB_pbuffer;
    /** When true, {@link WGLARBPixelFormat} is supported. */
    public final boolean WGL_ARB_pixel_format;
    /** When true, {@link WGLARBPixelFormatFloat} is supported. */
    public final boolean WGL_ARB_pixel_format_float;
    /** When true, {@link WGLARBRenderTexture} is supported. */
    public final boolean WGL_ARB_render_texture;
    /** When true, {@link WGLARBRobustnessApplicationIsolation} is supported. */
    public final boolean WGL_ARB_robustness_application_isolation;
    /**
     * Native bindings to the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/WGL_ARB_robustness_application_isolation.txt">WGL_ARB_robustness_share_group_isolation</a> extension.
     * 
     * <p>GL_ARB_robustness and WGL_ARB_create_context_robustness allow creating an OpenGL context supporting graphics reset notification behavior.
     * WGL_ARB_robustness_share_group_isolation provides stronger guarantees about the possible side-effects of a graphics reset.</p>
     * 
     * <p>If the graphics driver advertises the WGL_ARB_robustness_share_group_isolation extension string, then the driver guarantees that if a context in a
     * particular share group causes a graphics reset to occur:</p>
     * 
     * <ol>
     * <li>No other share group within the application is affected by the graphics reset. Additionally, no other application on the system is affected by the
     * graphics reset.</li>
     * <li>No other share group within the application receives any notification that the graphics reset occurred. Additionally, no other application on the
     * system receives any notification that the graphics reset occurred.</li>
     * </ol>
     * 
     * <p>Requires {@link WGLARBExtensionsString WGL_ARB_extensions_string} and {@link WGLARBCreateContextRobustness WGL_ARB_create_context_robustness}.</p>
     */
    public final boolean WGL_ARB_robustness_share_group_isolation;
    /** When true, {@link WGLATIPixelFormatFloat} is supported. */
    public final boolean WGL_ATI_pixel_format_float;
    /** When true, {@link WGLATIRenderTextureRectangle} is supported. */
    public final boolean WGL_ATI_render_texture_rectangle;
    /** When true, {@link WGLEXTColorspace} is supported. */
    public final boolean WGL_EXT_colorspace;
    /** When true, {@link WGLEXTCreateContextES2Profile} is supported. */
    public final boolean WGL_EXT_create_context_es2_profile;
    /** When true, {@link WGLEXTCreateContextESProfile} is supported. */
    public final boolean WGL_EXT_create_context_es_profile;
    /** When true, {@link WGLEXTDepthFloat} is supported. */
    public final boolean WGL_EXT_depth_float;
    /** When true, {@link WGLEXTExtensionsString} is supported. */
    public final boolean WGL_EXT_extensions_string;
    /** When true, {@link WGLEXTFramebufferSRGB} is supported. */
    public final boolean WGL_EXT_framebuffer_sRGB;
    /** When true, {@link WGLEXTPixelFormatPackedFloat} is supported. */
    public final boolean WGL_EXT_pixel_format_packed_float;
    /** When true, {@link WGLEXTSwapControl} is supported. */
    public final boolean WGL_EXT_swap_control;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/WGL_EXT_swap_control_tear.txt">WGL_EXT_swap_control_tear</a> extension is supported.
     * 
     * <p>This extension extends the existing {@link WGLEXTSwapControl WGL_EXT_swap_control} extension by allowing a negative {@code interval} parameter to
     * {@link WGLEXTSwapControl#wglSwapIntervalEXT SwapIntervalEXT}. The negative {@code interval} allows late swaps to occur without synchronization to the video frame. This
     * reduces the visual stutter on late frames and reduces the stall on subsequent frames.</p>
     */
    public final boolean WGL_EXT_swap_control_tear;
    /** When true, {@link WGLNVCopyImage} is supported. */
    public final boolean WGL_NV_copy_image;
    /** When true, {@link WGLNVDelayBeforeSwap} is supported. */
    public final boolean WGL_NV_delay_before_swap;
    /** When true, {@link WGLNVDXInterop} is supported. */
    public final boolean WGL_NV_DX_interop;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NV/WGL_NV_DX_interop2.txt">WGL_NV_DX_interop2</a> extension is supported.
     * 
     * <p>This extension expands on the specification of {@link WGLNVDXInterop WGL_NV_DX_interop} to add support for DirectX version 10, 10.1 and 11 resources.</p>
     * 
     * <p>Requires {@link GL20 OpenGL 2.0} and {@link WGLNVDXInterop WGL_NV_DX_interop}.</p>
     */
    public final boolean WGL_NV_DX_interop2;
    /** When true, {@link WGLNVFloatBuffer} is supported. */
    public final boolean WGL_NV_float_buffer;
    /** When true, {@link WGLNVGPUAffinity} is supported. */
    public final boolean WGL_NV_gpu_affinity;
    /** When true, {@link WGLNVMultigpuContext} is supported. */
    public final boolean WGL_NV_multigpu_context;
    /** When true, {@link WGLNVMultisampleCoverage} is supported. */
    public final boolean WGL_NV_multisample_coverage;
    /** When true, {@link WGLNVRenderDepthTexture} is supported. */
    public final boolean WGL_NV_render_depth_texture;
    /** When true, {@link WGLNVRenderTextureRectangle} is supported. */
    public final boolean WGL_NV_render_texture_rectangle;
    /** When true, {@link WGLNVSwapGroup} is supported. */
    public final boolean WGL_NV_swap_group;
    /** When true, {@code WGL_NV_vertex_array_range} is supported. */
    public final boolean WGL_NV_vertex_array_range;

    WGLCapabilities(FunctionProvider provider, Set<String> ext) {
        wglGetGPUIDsAMD = provider.getFunctionAddress("wglGetGPUIDsAMD");
        wglGetGPUInfoAMD = provider.getFunctionAddress("wglGetGPUInfoAMD");
        wglGetContextGPUIDAMD = provider.getFunctionAddress("wglGetContextGPUIDAMD");
        wglCreateAssociatedContextAMD = provider.getFunctionAddress("wglCreateAssociatedContextAMD");
        wglCreateAssociatedContextAttribsAMD = provider.getFunctionAddress("wglCreateAssociatedContextAttribsAMD");
        wglDeleteAssociatedContextAMD = provider.getFunctionAddress("wglDeleteAssociatedContextAMD");
        wglMakeAssociatedContextCurrentAMD = provider.getFunctionAddress("wglMakeAssociatedContextCurrentAMD");
        wglGetCurrentAssociatedContextAMD = provider.getFunctionAddress("wglGetCurrentAssociatedContextAMD");
        wglBlitContextFramebufferAMD = provider.getFunctionAddress("wglBlitContextFramebufferAMD");
        wglCreateBufferRegionARB = provider.getFunctionAddress("wglCreateBufferRegionARB");
        wglDeleteBufferRegionARB = provider.getFunctionAddress("wglDeleteBufferRegionARB");
        wglSaveBufferRegionARB = provider.getFunctionAddress("wglSaveBufferRegionARB");
        wglRestoreBufferRegionARB = provider.getFunctionAddress("wglRestoreBufferRegionARB");
        wglCreateContextAttribsARB = provider.getFunctionAddress("wglCreateContextAttribsARB");
        wglGetExtensionsStringARB = provider.getFunctionAddress("wglGetExtensionsStringARB");
        wglMakeContextCurrentARB = provider.getFunctionAddress("wglMakeContextCurrentARB");
        wglGetCurrentReadDCARB = provider.getFunctionAddress("wglGetCurrentReadDCARB");
        wglCreatePbufferARB = provider.getFunctionAddress("wglCreatePbufferARB");
        wglGetPbufferDCARB = provider.getFunctionAddress("wglGetPbufferDCARB");
        wglReleasePbufferDCARB = provider.getFunctionAddress("wglReleasePbufferDCARB");
        wglDestroyPbufferARB = provider.getFunctionAddress("wglDestroyPbufferARB");
        wglQueryPbufferARB = provider.getFunctionAddress("wglQueryPbufferARB");
        wglGetPixelFormatAttribivARB = provider.getFunctionAddress("wglGetPixelFormatAttribivARB");
        wglGetPixelFormatAttribfvARB = provider.getFunctionAddress("wglGetPixelFormatAttribfvARB");
        wglChoosePixelFormatARB = provider.getFunctionAddress("wglChoosePixelFormatARB");
        wglBindTexImageARB = provider.getFunctionAddress("wglBindTexImageARB");
        wglReleaseTexImageARB = provider.getFunctionAddress("wglReleaseTexImageARB");
        wglSetPbufferAttribARB = provider.getFunctionAddress("wglSetPbufferAttribARB");
        wglGetExtensionsStringEXT = provider.getFunctionAddress("wglGetExtensionsStringEXT");
        wglSwapIntervalEXT = provider.getFunctionAddress("wglSwapIntervalEXT");
        wglGetSwapIntervalEXT = provider.getFunctionAddress("wglGetSwapIntervalEXT");
        wglCopyImageSubDataNV = provider.getFunctionAddress("wglCopyImageSubDataNV");
        wglDelayBeforeSwapNV = provider.getFunctionAddress("wglDelayBeforeSwapNV");
        wglDXSetResourceShareHandleNV = provider.getFunctionAddress("wglDXSetResourceShareHandleNV");
        wglDXOpenDeviceNV = provider.getFunctionAddress("wglDXOpenDeviceNV");
        wglDXCloseDeviceNV = provider.getFunctionAddress("wglDXCloseDeviceNV");
        wglDXRegisterObjectNV = provider.getFunctionAddress("wglDXRegisterObjectNV");
        wglDXUnregisterObjectNV = provider.getFunctionAddress("wglDXUnregisterObjectNV");
        wglDXObjectAccessNV = provider.getFunctionAddress("wglDXObjectAccessNV");
        wglDXLockObjectsNV = provider.getFunctionAddress("wglDXLockObjectsNV");
        wglDXUnlockObjectsNV = provider.getFunctionAddress("wglDXUnlockObjectsNV");
        wglEnumGpusNV = provider.getFunctionAddress("wglEnumGpusNV");
        wglEnumGpuDevicesNV = provider.getFunctionAddress("wglEnumGpuDevicesNV");
        wglCreateAffinityDCNV = provider.getFunctionAddress("wglCreateAffinityDCNV");
        wglEnumGpusFromAffinityDCNV = provider.getFunctionAddress("wglEnumGpusFromAffinityDCNV");
        wglDeleteDCNV = provider.getFunctionAddress("wglDeleteDCNV");
        wglJoinSwapGroupNV = provider.getFunctionAddress("wglJoinSwapGroupNV");
        wglBindSwapBarrierNV = provider.getFunctionAddress("wglBindSwapBarrierNV");
        wglQuerySwapGroupNV = provider.getFunctionAddress("wglQuerySwapGroupNV");
        wglQueryMaxSwapGroupsNV = provider.getFunctionAddress("wglQueryMaxSwapGroupsNV");
        wglQueryFrameCountNV = provider.getFunctionAddress("wglQueryFrameCountNV");
        wglResetFrameCountNV = provider.getFunctionAddress("wglResetFrameCountNV");
        wglAllocateMemoryNV = provider.getFunctionAddress("wglAllocateMemoryNV");
        wglFreeMemoryNV = provider.getFunctionAddress("wglFreeMemoryNV");

        WGL_AMD_gpu_association = ext.contains("WGL_AMD_gpu_association") && checkExtension("WGL_AMD_gpu_association", WGLAMDGPUAssociation.isAvailable(this));
        WGL_ARB_buffer_region = ext.contains("WGL_ARB_buffer_region") && checkExtension("WGL_ARB_buffer_region", WGLARBBufferRegion.isAvailable(this));
        WGL_ARB_context_flush_control = ext.contains("WGL_ARB_context_flush_control");
        WGL_ARB_create_context = ext.contains("WGL_ARB_create_context") && checkExtension("WGL_ARB_create_context", WGLARBCreateContext.isAvailable(this));
        WGL_ARB_create_context_no_error = ext.contains("WGL_ARB_create_context_no_error");
        WGL_ARB_create_context_profile = ext.contains("WGL_ARB_create_context_profile");
        WGL_ARB_create_context_robustness = ext.contains("WGL_ARB_create_context_robustness");
        WGL_ARB_extensions_string = ext.contains("WGL_ARB_extensions_string") && checkExtension("WGL_ARB_extensions_string", WGLARBExtensionsString.isAvailable(this));
        WGL_ARB_framebuffer_sRGB = ext.contains("WGL_ARB_framebuffer_sRGB");
        WGL_ARB_make_current_read = ext.contains("WGL_ARB_make_current_read") && checkExtension("WGL_ARB_make_current_read", WGLARBMakeCurrentRead.isAvailable(this));
        WGL_ARB_multisample = ext.contains("WGL_ARB_multisample");
        WGL_ARB_pbuffer = ext.contains("WGL_ARB_pbuffer") && checkExtension("WGL_ARB_pbuffer", WGLARBPbuffer.isAvailable(this));
        WGL_ARB_pixel_format = ext.contains("WGL_ARB_pixel_format") && checkExtension("WGL_ARB_pixel_format", WGLARBPixelFormat.isAvailable(this));
        WGL_ARB_pixel_format_float = ext.contains("WGL_ARB_pixel_format_float");
        WGL_ARB_render_texture = ext.contains("WGL_ARB_render_texture") && checkExtension("WGL_ARB_render_texture", WGLARBRenderTexture.isAvailable(this));
        WGL_ARB_robustness_application_isolation = ext.contains("WGL_ARB_robustness_application_isolation");
        WGL_ARB_robustness_share_group_isolation = ext.contains("WGL_ARB_robustness_share_group_isolation");
        WGL_ATI_pixel_format_float = ext.contains("WGL_ATI_pixel_format_float");
        WGL_ATI_render_texture_rectangle = ext.contains("WGL_ATI_render_texture_rectangle");
        WGL_EXT_colorspace = ext.contains("WGL_EXT_colorspace");
        WGL_EXT_create_context_es2_profile = ext.contains("WGL_EXT_create_context_es2_profile");
        WGL_EXT_create_context_es_profile = ext.contains("WGL_EXT_create_context_es_profile");
        WGL_EXT_depth_float = ext.contains("WGL_EXT_depth_float");
        WGL_EXT_extensions_string = ext.contains("WGL_EXT_extensions_string") && checkExtension("WGL_EXT_extensions_string", WGLEXTExtensionsString.isAvailable(this));
        WGL_EXT_framebuffer_sRGB = ext.contains("WGL_EXT_framebuffer_sRGB");
        WGL_EXT_pixel_format_packed_float = ext.contains("WGL_EXT_pixel_format_packed_float");
        WGL_EXT_swap_control = ext.contains("WGL_EXT_swap_control") && checkExtension("WGL_EXT_swap_control", WGLEXTSwapControl.isAvailable(this));
        WGL_EXT_swap_control_tear = ext.contains("WGL_EXT_swap_control_tear");
        WGL_NV_copy_image = ext.contains("WGL_NV_copy_image") && checkExtension("WGL_NV_copy_image", WGLNVCopyImage.isAvailable(this));
        WGL_NV_delay_before_swap = ext.contains("WGL_NV_delay_before_swap") && checkExtension("WGL_NV_delay_before_swap", WGLNVDelayBeforeSwap.isAvailable(this));
        WGL_NV_DX_interop = ext.contains("WGL_NV_DX_interop") && checkExtension("WGL_NV_DX_interop", WGLNVDXInterop.isAvailable(this));
        WGL_NV_DX_interop2 = ext.contains("WGL_NV_DX_interop2");
        WGL_NV_float_buffer = ext.contains("WGL_NV_float_buffer");
        WGL_NV_gpu_affinity = ext.contains("WGL_NV_gpu_affinity") && checkExtension("WGL_NV_gpu_affinity", WGLNVGPUAffinity.isAvailable(this));
        WGL_NV_multigpu_context = ext.contains("WGL_NV_multigpu_context");
        WGL_NV_multisample_coverage = ext.contains("WGL_NV_multisample_coverage");
        WGL_NV_render_depth_texture = ext.contains("WGL_NV_render_depth_texture");
        WGL_NV_render_texture_rectangle = ext.contains("WGL_NV_render_texture_rectangle");
        WGL_NV_swap_group = ext.contains("WGL_NV_swap_group") && checkExtension("WGL_NV_swap_group", WGLNVSwapGroup.isAvailable(this));
        WGL_NV_vertex_array_range = ext.contains("WGL_NV_vertex_array_range") && checkExtension("WGL_NV_vertex_array_range", WGLNVVertexArrayRange.isAvailable(this));
    }

    private static boolean checkExtension(String extension, boolean supported) {
        if (supported) {
            return true;
        }

        apiLog("[WGL] " + extension + " was reported as available but an entry point is missing.");
        return false;
    }

}