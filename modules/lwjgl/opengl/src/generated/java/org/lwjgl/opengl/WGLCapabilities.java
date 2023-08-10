/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;
import java.util.Set;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;

/** Defines the WGL capabilities of an OpenGL device. */
public final class WGLCapabilities {

    // WGL_AMD_gpu_association
    public final long
        wglGetGPUIDsAMD,
        wglGetGPUInfoAMD,
        wglGetContextGPUIDAMD,
        wglCreateAssociatedContextAMD,
        wglCreateAssociatedContextAttribsAMD,
        wglDeleteAssociatedContextAMD,
        wglMakeAssociatedContextCurrentAMD,
        wglGetCurrentAssociatedContextAMD,
        wglBlitContextFramebufferAMD;

    // WGL_ARB_buffer_region
    public final long
        wglCreateBufferRegionARB,
        wglDeleteBufferRegionARB,
        wglSaveBufferRegionARB,
        wglRestoreBufferRegionARB;

    // WGL_ARB_create_context
    public final long
        wglCreateContextAttribsARB;

    // WGL_ARB_extensions_string
    public final long
        wglGetExtensionsStringARB;

    // WGL_ARB_make_current_read
    public final long
        wglMakeContextCurrentARB,
        wglGetCurrentReadDCARB;

    // WGL_ARB_pbuffer
    public final long
        wglCreatePbufferARB,
        wglGetPbufferDCARB,
        wglReleasePbufferDCARB,
        wglDestroyPbufferARB,
        wglQueryPbufferARB;

    // WGL_ARB_pixel_format
    public final long
        wglGetPixelFormatAttribivARB,
        wglGetPixelFormatAttribfvARB,
        wglChoosePixelFormatARB;

    // WGL_ARB_render_texture
    public final long
        wglBindTexImageARB,
        wglReleaseTexImageARB,
        wglSetPbufferAttribARB;

    // WGL_EXT_extensions_string
    public final long
        wglGetExtensionsStringEXT;

    // WGL_EXT_swap_control
    public final long
        wglSwapIntervalEXT,
        wglGetSwapIntervalEXT;

    // WGL_NV_copy_image
    public final long
        wglCopyImageSubDataNV;

    // WGL_NV_delay_before_swap
    public final long
        wglDelayBeforeSwapNV;

    // WGL_NV_DX_interop
    public final long
        wglDXSetResourceShareHandleNV,
        wglDXOpenDeviceNV,
        wglDXCloseDeviceNV,
        wglDXRegisterObjectNV,
        wglDXUnregisterObjectNV,
        wglDXObjectAccessNV,
        wglDXLockObjectsNV,
        wglDXUnlockObjectsNV;

    // WGL_NV_gpu_affinity
    public final long
        wglEnumGpusNV,
        wglEnumGpuDevicesNV,
        wglCreateAffinityDCNV,
        wglEnumGpusFromAffinityDCNV,
        wglDeleteDCNV;

    // WGL_NV_swap_group
    public final long
        wglJoinSwapGroupNV,
        wglBindSwapBarrierNV,
        wglQuerySwapGroupNV,
        wglQueryMaxSwapGroupsNV,
        wglQueryFrameCountNV,
        wglResetFrameCountNV;

    // WGL_NV_vertex_array_range
    public final long
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
     * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/WGL_ARB_robustness_application_isolation.txt">WGL_ARB_robustness_share_group_isolation</a> extension.
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
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/WGL_EXT_swap_control_tear.txt">WGL_EXT_swap_control_tear</a> extension is supported.
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
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/WGL_NV_DX_interop2.txt">WGL_NV_DX_interop2</a> extension is supported.
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
        long[] caps = new long[54];

        WGL_AMD_gpu_association = check_WGL_AMD_gpu_association(provider, caps, ext);
        WGL_ARB_buffer_region = check_WGL_ARB_buffer_region(provider, caps, ext);
        WGL_ARB_context_flush_control = ext.contains("WGL_ARB_context_flush_control");
        WGL_ARB_create_context = check_WGL_ARB_create_context(provider, caps, ext);
        WGL_ARB_create_context_no_error = ext.contains("WGL_ARB_create_context_no_error");
        WGL_ARB_create_context_profile = ext.contains("WGL_ARB_create_context_profile");
        WGL_ARB_create_context_robustness = ext.contains("WGL_ARB_create_context_robustness");
        WGL_ARB_extensions_string = check_WGL_ARB_extensions_string(provider, caps, ext);
        WGL_ARB_framebuffer_sRGB = ext.contains("WGL_ARB_framebuffer_sRGB");
        WGL_ARB_make_current_read = check_WGL_ARB_make_current_read(provider, caps, ext);
        WGL_ARB_multisample = ext.contains("WGL_ARB_multisample");
        WGL_ARB_pbuffer = check_WGL_ARB_pbuffer(provider, caps, ext);
        WGL_ARB_pixel_format = check_WGL_ARB_pixel_format(provider, caps, ext);
        WGL_ARB_pixel_format_float = ext.contains("WGL_ARB_pixel_format_float");
        WGL_ARB_render_texture = check_WGL_ARB_render_texture(provider, caps, ext);
        WGL_ARB_robustness_application_isolation = ext.contains("WGL_ARB_robustness_application_isolation");
        WGL_ARB_robustness_share_group_isolation = ext.contains("WGL_ARB_robustness_share_group_isolation");
        WGL_ATI_pixel_format_float = ext.contains("WGL_ATI_pixel_format_float");
        WGL_ATI_render_texture_rectangle = ext.contains("WGL_ATI_render_texture_rectangle");
        WGL_EXT_colorspace = ext.contains("WGL_EXT_colorspace");
        WGL_EXT_create_context_es2_profile = ext.contains("WGL_EXT_create_context_es2_profile");
        WGL_EXT_create_context_es_profile = ext.contains("WGL_EXT_create_context_es_profile");
        WGL_EXT_depth_float = ext.contains("WGL_EXT_depth_float");
        WGL_EXT_extensions_string = check_WGL_EXT_extensions_string(provider, caps, ext);
        WGL_EXT_framebuffer_sRGB = ext.contains("WGL_EXT_framebuffer_sRGB");
        WGL_EXT_pixel_format_packed_float = ext.contains("WGL_EXT_pixel_format_packed_float");
        WGL_EXT_swap_control = check_WGL_EXT_swap_control(provider, caps, ext);
        WGL_EXT_swap_control_tear = ext.contains("WGL_EXT_swap_control_tear");
        WGL_NV_copy_image = check_WGL_NV_copy_image(provider, caps, ext);
        WGL_NV_delay_before_swap = check_WGL_NV_delay_before_swap(provider, caps, ext);
        WGL_NV_DX_interop = check_WGL_NV_DX_interop(provider, caps, ext);
        WGL_NV_DX_interop2 = ext.contains("WGL_NV_DX_interop2");
        WGL_NV_float_buffer = ext.contains("WGL_NV_float_buffer");
        WGL_NV_gpu_affinity = check_WGL_NV_gpu_affinity(provider, caps, ext);
        WGL_NV_multigpu_context = ext.contains("WGL_NV_multigpu_context");
        WGL_NV_multisample_coverage = ext.contains("WGL_NV_multisample_coverage");
        WGL_NV_render_depth_texture = ext.contains("WGL_NV_render_depth_texture");
        WGL_NV_render_texture_rectangle = ext.contains("WGL_NV_render_texture_rectangle");
        WGL_NV_swap_group = check_WGL_NV_swap_group(provider, caps, ext);
        WGL_NV_vertex_array_range = check_WGL_NV_vertex_array_range(provider, caps, ext);

        wglGetGPUIDsAMD = caps[0];
        wglGetGPUInfoAMD = caps[1];
        wglGetContextGPUIDAMD = caps[2];
        wglCreateAssociatedContextAMD = caps[3];
        wglCreateAssociatedContextAttribsAMD = caps[4];
        wglDeleteAssociatedContextAMD = caps[5];
        wglMakeAssociatedContextCurrentAMD = caps[6];
        wglGetCurrentAssociatedContextAMD = caps[7];
        wglBlitContextFramebufferAMD = caps[8];
        wglCreateBufferRegionARB = caps[9];
        wglDeleteBufferRegionARB = caps[10];
        wglSaveBufferRegionARB = caps[11];
        wglRestoreBufferRegionARB = caps[12];
        wglCreateContextAttribsARB = caps[13];
        wglGetExtensionsStringARB = caps[14];
        wglMakeContextCurrentARB = caps[15];
        wglGetCurrentReadDCARB = caps[16];
        wglCreatePbufferARB = caps[17];
        wglGetPbufferDCARB = caps[18];
        wglReleasePbufferDCARB = caps[19];
        wglDestroyPbufferARB = caps[20];
        wglQueryPbufferARB = caps[21];
        wglGetPixelFormatAttribivARB = caps[22];
        wglGetPixelFormatAttribfvARB = caps[23];
        wglChoosePixelFormatARB = caps[24];
        wglBindTexImageARB = caps[25];
        wglReleaseTexImageARB = caps[26];
        wglSetPbufferAttribARB = caps[27];
        wglGetExtensionsStringEXT = caps[28];
        wglSwapIntervalEXT = caps[29];
        wglGetSwapIntervalEXT = caps[30];
        wglCopyImageSubDataNV = caps[31];
        wglDelayBeforeSwapNV = caps[32];
        wglDXSetResourceShareHandleNV = caps[33];
        wglDXOpenDeviceNV = caps[34];
        wglDXCloseDeviceNV = caps[35];
        wglDXRegisterObjectNV = caps[36];
        wglDXUnregisterObjectNV = caps[37];
        wglDXObjectAccessNV = caps[38];
        wglDXLockObjectsNV = caps[39];
        wglDXUnlockObjectsNV = caps[40];
        wglEnumGpusNV = caps[41];
        wglEnumGpuDevicesNV = caps[42];
        wglCreateAffinityDCNV = caps[43];
        wglEnumGpusFromAffinityDCNV = caps[44];
        wglDeleteDCNV = caps[45];
        wglJoinSwapGroupNV = caps[46];
        wglBindSwapBarrierNV = caps[47];
        wglQuerySwapGroupNV = caps[48];
        wglQueryMaxSwapGroupsNV = caps[49];
        wglQueryFrameCountNV = caps[50];
        wglResetFrameCountNV = caps[51];
        wglAllocateMemoryNV = caps[52];
        wglFreeMemoryNV = caps[53];
    }

    private static boolean check_WGL_AMD_gpu_association(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("WGL_AMD_gpu_association")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            0, 1, 2, 3, 4, 5, 6, 7
        },
            "wglGetGPUIDsAMD", "wglGetGPUInfoAMD", "wglGetContextGPUIDAMD", "wglCreateAssociatedContextAMD", "wglCreateAssociatedContextAttribsAMD", 
            "wglDeleteAssociatedContextAMD", "wglMakeAssociatedContextCurrentAMD", "wglGetCurrentAssociatedContextAMD"
        ) || reportMissing("WGL", "WGL_AMD_gpu_association");
    }

    private static boolean check_WGL_ARB_buffer_region(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("WGL_ARB_buffer_region")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            9, 10, 11, 12
        },
            "wglCreateBufferRegionARB", "wglDeleteBufferRegionARB", "wglSaveBufferRegionARB", "wglRestoreBufferRegionARB"
        ) || reportMissing("WGL", "WGL_ARB_buffer_region");
    }

    private static boolean check_WGL_ARB_create_context(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("WGL_ARB_create_context")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            13
        },
            "wglCreateContextAttribsARB"
        ) || reportMissing("WGL", "WGL_ARB_create_context");
    }

    private static boolean check_WGL_ARB_extensions_string(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("WGL_ARB_extensions_string")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            14
        },
            "wglGetExtensionsStringARB"
        ) || reportMissing("WGL", "WGL_ARB_extensions_string");
    }

    private static boolean check_WGL_ARB_make_current_read(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("WGL_ARB_make_current_read")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            15, 16
        },
            "wglMakeContextCurrentARB", "wglGetCurrentReadDCARB"
        ) || reportMissing("WGL", "WGL_ARB_make_current_read");
    }

    private static boolean check_WGL_ARB_pbuffer(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("WGL_ARB_pbuffer")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            17, 18, 19, 20, 21
        },
            "wglCreatePbufferARB", "wglGetPbufferDCARB", "wglReleasePbufferDCARB", "wglDestroyPbufferARB", "wglQueryPbufferARB"
        ) || reportMissing("WGL", "WGL_ARB_pbuffer");
    }

    private static boolean check_WGL_ARB_pixel_format(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("WGL_ARB_pixel_format")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            22, 23, 24
        },
            "wglGetPixelFormatAttribivARB", "wglGetPixelFormatAttribfvARB", "wglChoosePixelFormatARB"
        ) || reportMissing("WGL", "WGL_ARB_pixel_format");
    }

    private static boolean check_WGL_ARB_render_texture(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("WGL_ARB_render_texture")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            25, 26, 27
        },
            "wglBindTexImageARB", "wglReleaseTexImageARB", "wglSetPbufferAttribARB"
        ) || reportMissing("WGL", "WGL_ARB_render_texture");
    }

    private static boolean check_WGL_EXT_extensions_string(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("WGL_EXT_extensions_string")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            28
        },
            "wglGetExtensionsStringEXT"
        ) || reportMissing("WGL", "WGL_EXT_extensions_string");
    }

    private static boolean check_WGL_EXT_swap_control(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("WGL_EXT_swap_control")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            29, 30
        },
            "wglSwapIntervalEXT", "wglGetSwapIntervalEXT"
        ) || reportMissing("WGL", "WGL_EXT_swap_control");
    }

    private static boolean check_WGL_NV_copy_image(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("WGL_NV_copy_image")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            31
        },
            "wglCopyImageSubDataNV"
        ) || reportMissing("WGL", "WGL_NV_copy_image");
    }

    private static boolean check_WGL_NV_delay_before_swap(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("WGL_NV_delay_before_swap")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            32
        },
            "wglDelayBeforeSwapNV"
        ) || reportMissing("WGL", "WGL_NV_delay_before_swap");
    }

    private static boolean check_WGL_NV_DX_interop(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("WGL_NV_DX_interop")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            33, 34, 35, 36, 37, 38, 39, 40
        },
            "wglDXSetResourceShareHandleNV", "wglDXOpenDeviceNV", "wglDXCloseDeviceNV", "wglDXRegisterObjectNV", "wglDXUnregisterObjectNV", 
            "wglDXObjectAccessNV", "wglDXLockObjectsNV", "wglDXUnlockObjectsNV"
        ) || reportMissing("WGL", "WGL_NV_DX_interop");
    }

    private static boolean check_WGL_NV_gpu_affinity(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("WGL_NV_gpu_affinity")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            41, 42, 43, 44, 45
        },
            "wglEnumGpusNV", "wglEnumGpuDevicesNV", "wglCreateAffinityDCNV", "wglEnumGpusFromAffinityDCNV", "wglDeleteDCNV"
        ) || reportMissing("WGL", "WGL_NV_gpu_affinity");
    }

    private static boolean check_WGL_NV_swap_group(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("WGL_NV_swap_group")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            46, 47, 48, 49, 50, 51
        },
            "wglJoinSwapGroupNV", "wglBindSwapBarrierNV", "wglQuerySwapGroupNV", "wglQueryMaxSwapGroupsNV", "wglQueryFrameCountNV", "wglResetFrameCountNV"
        ) || reportMissing("WGL", "WGL_NV_swap_group");
    }

    private static boolean check_WGL_NV_vertex_array_range(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("WGL_NV_vertex_array_range")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            52, 53
        },
            "wglAllocateMemoryNV", "wglFreeMemoryNV"
        ) || reportMissing("WGL", "WGL_NV_vertex_array_range");
    }

}
