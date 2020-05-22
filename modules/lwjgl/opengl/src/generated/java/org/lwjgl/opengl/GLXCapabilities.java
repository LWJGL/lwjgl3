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

/** Defines the GLX capabilities of a connection. */
public final class GLXCapabilities {

    public final long
        glXQueryExtensionsString,
        glXGetClientString,
        glXQueryServerString,
        glXGetCurrentDisplay,
        glXGetFBConfigs,
        glXChooseFBConfig,
        glXGetFBConfigAttrib,
        glXGetVisualFromFBConfig,
        glXCreateWindow,
        glXCreatePixmap,
        glXDestroyPixmap,
        glXCreatePbuffer,
        glXDestroyPbuffer,
        glXQueryDrawable,
        glXCreateNewContext,
        glXMakeContextCurrent,
        glXGetCurrentReadDrawable,
        glXQueryContext,
        glXSelectEvent,
        glXGetSelectedEvent,
        glXGetProcAddress,
        glXBlitContextFramebufferAMD,
        glXCreateAssociatedContextAMD,
        glXCreateAssociatedContextAttribsAMD,
        glXDeleteAssociatedContextAMD,
        glXGetContextGPUIDAMD,
        glXGetCurrentAssociatedContextAMD,
        glXGetGPUIDsAMD,
        glXGetGPUInfoAMD,
        glXMakeAssociatedContextCurrentAMD,
        glXCreateContextAttribsARB,
        glXGetProcAddressARB,
        glXGetCurrentDisplayEXT,
        glXQueryContextInfoEXT,
        glXGetContextIDEXT,
        glXImportContextEXT,
        glXFreeContextEXT,
        glXSwapIntervalEXT,
        glXBindTexImageEXT,
        glXReleaseTexImageEXT,
        glXCopyBufferSubDataNV,
        glXNamedCopyBufferSubDataNV,
        glXCopyImageSubDataNV,
        glXDelayBeforeSwapNV,
        glXJoinSwapGroupNV,
        glXBindSwapBarrierNV,
        glXQuerySwapGroupNV,
        glXQueryMaxSwapGroupsNV,
        glXQueryFrameCountNV,
        glXResetFrameCountNV,
        glXMakeCurrentReadSGI,
        glXGetCurrentReadDrawableSGI,
        glXSwapIntervalSGI,
        glXGetVideoSyncSGI,
        glXWaitVideoSyncSGI,
        glXGetFBConfigAttribSGIX,
        glXChooseFBConfigSGIX,
        glXCreateGLXPixmapWithConfigSGIX,
        glXCreateContextWithConfigSGIX,
        glXGetVisualFromFBConfigSGIX,
        glXGetFBConfigFromVisualSGIX,
        glXCreateGLXPbufferSGIX,
        glXDestroyGLXPbufferSGIX,
        glXQueryGLXPbufferSGIX,
        glXSelectEventSGIX,
        glXGetSelectedEventSGIX,
        glXBindSwapBarrierSGIX,
        glXQueryMaxSwapBarriersSGIX,
        glXJoinSwapGroupSGIX;

    /** When true, {@link GLX11} is supported. */
    public final boolean GLX11;
    /** When true, {@link GLX12} is supported. */
    public final boolean GLX12;
    /** When true, {@link GLX13} is supported. */
    public final boolean GLX13;
    /** When true, {@link GLX14} is supported. */
    public final boolean GLX14;
    /** When true, {@link GLXAMDGPUAssociation} is supported. */
    public final boolean GLX_AMD_gpu_association;
    /** When true, {@link GLXARBContextFlushControl} is supported. */
    public final boolean GLX_ARB_context_flush_control;
    /** When true, {@link GLXARBCreateContext} is supported. */
    public final boolean GLX_ARB_create_context;
    /** When true, {@link GLXARBCreateContextNoError} is supported. */
    public final boolean GLX_ARB_create_context_no_error;
    /** When true, {@link GLXARBCreateContextProfile} is supported. */
    public final boolean GLX_ARB_create_context_profile;
    /** When true, {@link GLXARBCreateContextRobustness} is supported. */
    public final boolean GLX_ARB_create_context_robustness;
    /** When true, {@link GLXARBFBConfigFloat} is supported. */
    public final boolean GLX_ARB_fbconfig_float;
    /** When true, {@link GLXARBFramebufferSRGB} is supported. */
    public final boolean GLX_ARB_framebuffer_sRGB;
    /** When true, {@link GLXARBGetProcAddress} is supported. */
    public final boolean GLX_ARB_get_proc_address;
    /** When true, {@link GLXARBMultisample} is supported. */
    public final boolean GLX_ARB_multisample;
    /** When true, {@link GLXARBRobustnessApplicationIsolation} is supported. */
    public final boolean GLX_ARB_robustness_application_isolation;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/GLX_ARB_robustness_application_isolation.txt">GLX_ARB_robustness_share_group_isolation</a> extension is supported.
     * 
     * <p>GL_ARB_robustness and GLX_ARB_create_context_robustness allow creating an OpenGL context supporting graphics reset notification behavior.
     * GLX_ARB_robustness_share_group_isolation provides stronger guarantees about the possible side-effects of a graphics reset.</p>
     * 
     * <p>If the graphics driver advertises the GLX_ARB_robustness_share_group_isolation extension string, then the driver guarantees that if a context in a
     * particular share group causes a graphics reset to occur:</p>
     * 
     * <ol>
     * <li>No other share group within the application, nor any other application on the system, is affected by the graphics reset.</li>
     * <li>No other share group within the application, nor any other application on the system, receives any notification that the graphics reset occurred.</li>
     * </ol>
     * 
     * <p>Requires {@link GLX14 GLX 1.4} and {@link GLXARBCreateContextRobustness GLX_ARB_create_context_robustness}.</p>
     */
    public final boolean GLX_ARB_robustness_share_group_isolation;
    /** When true, {@link GLXARBVertexBufferObject} is supported. */
    public final boolean GLX_ARB_vertex_buffer_object;
    /** When true, {@link GLXEXTBufferAge} is supported. */
    public final boolean GLX_EXT_buffer_age;
    /** When true, {@link GLXEXTContextPriority} is supported. */
    public final boolean GLX_EXT_context_priority;
    /** When true, {@link GLXEXTCreateContextES2Profile} is supported. */
    public final boolean GLX_EXT_create_context_es2_profile;
    /** When true, {@link GLXEXTCreateContextESProfile} is supported. */
    public final boolean GLX_EXT_create_context_es_profile;
    /** When true, {@link GLXEXTFBConfigPackedFloat} is supported. */
    public final boolean GLX_EXT_fbconfig_packed_float;
    /** When true, {@link GLXEXTFramebufferSRGB} is supported. */
    public final boolean GLX_EXT_framebuffer_sRGB;
    /** When true, {@link GLXEXTImportContext} is supported. */
    public final boolean GLX_EXT_import_context;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/GLX_EXT_no_config_context.txt">GLX_EXT_no_config_context</a> extension is supported.
     * 
     * <p>Modern GPUs allow contexts to render to almost any combination of supported color and auxiliary buffer formats. Traditionally GLX context creation is
     * done with respect to a GLXFBConfig specifying buffer formats, and constrains contexts to only work with drawables created with a "compatible" config.</p>
     * 
     * <p>This extension allows creation of GL &amp; ES contexts without specifying a {@code GLXFBConfig}.</p>
     */
    public final boolean GLX_EXT_no_config_context;
    /** When true, {@link GLXEXTStereoTree} is supported. */
    public final boolean GLX_EXT_stereo_tree;
    /** When true, {@link GLXEXTSwapControl} is supported. */
    public final boolean GLX_EXT_swap_control;
    /** When true, {@link GLXEXTSwapControlTear} is supported. */
    public final boolean GLX_EXT_swap_control_tear;
    /** When true, {@link GLXEXTTextureFromPixmap} is supported. */
    public final boolean GLX_EXT_texture_from_pixmap;
    /** When true, {@link GLXEXTVisualInfo} is supported. */
    public final boolean GLX_EXT_visual_info;
    /** When true, {@link GLXEXTVisualRating} is supported. */
    public final boolean GLX_EXT_visual_rating;
    /** When true, {@link GLXINTELSwapEvent} is supported. */
    public final boolean GLX_INTEL_swap_event;
    /** When true, {@link GLXNVCopyBuffer} is supported. */
    public final boolean GLX_NV_copy_buffer;
    /** When true, {@link GLXNVCopyImage} is supported. */
    public final boolean GLX_NV_copy_image;
    /** When true, {@link GLXNVDelayBeforeSwap} is supported. */
    public final boolean GLX_NV_delay_before_swap;
    /** When true, {@link GLXNVFloatBuffer} is supported. */
    public final boolean GLX_NV_float_buffer;
    /** When true, {@link GLXNVMultiGPUContext} is supported. */
    public final boolean GLX_NV_multigpu_context;
    /** When true, {@link GLXNVMultisampleCoverage} is supported. */
    public final boolean GLX_NV_multisample_coverage;
    /** When true, {@link GLXNVRobustnessVideoMemoryPurge} is supported. */
    public final boolean GLX_NV_robustness_video_memory_purge;
    /** When true, {@link GLXNVSwapGroup} is supported. */
    public final boolean GLX_NV_swap_group;
    /** When true, {@link GLXSGIMakeCurrentRead} is supported. */
    public final boolean GLX_SGI_make_current_read;
    /** When true, {@link GLXSGISwapControl} is supported. */
    public final boolean GLX_SGI_swap_control;
    /** When true, {@link GLXSGIVideoSync} is supported. */
    public final boolean GLX_SGI_video_sync;
    /** When true, {@link GLXSGIXFBConfig} is supported. */
    public final boolean GLX_SGIX_fbconfig;
    /** When true, {@link GLXSGIXPbuffer} is supported. */
    public final boolean GLX_SGIX_pbuffer;
    /** When true, {@link GLXSGIXSwapBarrier} is supported. */
    public final boolean GLX_SGIX_swap_barrier;
    /** When true, {@link GLXSGIXSwapGroup} is supported. */
    public final boolean GLX_SGIX_swap_group;

    GLXCapabilities(FunctionProvider provider, Set<String> ext) {
        glXQueryExtensionsString = provider.getFunctionAddress("glXQueryExtensionsString");
        glXGetClientString = provider.getFunctionAddress("glXGetClientString");
        glXQueryServerString = provider.getFunctionAddress("glXQueryServerString");
        glXGetCurrentDisplay = provider.getFunctionAddress("glXGetCurrentDisplay");
        glXGetFBConfigs = provider.getFunctionAddress("glXGetFBConfigs");
        glXChooseFBConfig = provider.getFunctionAddress("glXChooseFBConfig");
        glXGetFBConfigAttrib = provider.getFunctionAddress("glXGetFBConfigAttrib");
        glXGetVisualFromFBConfig = provider.getFunctionAddress("glXGetVisualFromFBConfig");
        glXCreateWindow = provider.getFunctionAddress("glXCreateWindow");
        glXCreatePixmap = provider.getFunctionAddress("glXCreatePixmap");
        glXDestroyPixmap = provider.getFunctionAddress("glXDestroyPixmap");
        glXCreatePbuffer = provider.getFunctionAddress("glXCreatePbuffer");
        glXDestroyPbuffer = provider.getFunctionAddress("glXDestroyPbuffer");
        glXQueryDrawable = provider.getFunctionAddress("glXQueryDrawable");
        glXCreateNewContext = provider.getFunctionAddress("glXCreateNewContext");
        glXMakeContextCurrent = provider.getFunctionAddress("glXMakeContextCurrent");
        glXGetCurrentReadDrawable = provider.getFunctionAddress("glXGetCurrentReadDrawable");
        glXQueryContext = provider.getFunctionAddress("glXQueryContext");
        glXSelectEvent = provider.getFunctionAddress("glXSelectEvent");
        glXGetSelectedEvent = provider.getFunctionAddress("glXGetSelectedEvent");
        glXGetProcAddress = provider.getFunctionAddress("glXGetProcAddress");
        glXBlitContextFramebufferAMD = provider.getFunctionAddress("glXBlitContextFramebufferAMD");
        glXCreateAssociatedContextAMD = provider.getFunctionAddress("glXCreateAssociatedContextAMD");
        glXCreateAssociatedContextAttribsAMD = provider.getFunctionAddress("glXCreateAssociatedContextAttribsAMD");
        glXDeleteAssociatedContextAMD = provider.getFunctionAddress("glXDeleteAssociatedContextAMD");
        glXGetContextGPUIDAMD = provider.getFunctionAddress("glXGetContextGPUIDAMD");
        glXGetCurrentAssociatedContextAMD = provider.getFunctionAddress("glXGetCurrentAssociatedContextAMD");
        glXGetGPUIDsAMD = provider.getFunctionAddress("glXGetGPUIDsAMD");
        glXGetGPUInfoAMD = provider.getFunctionAddress("glXGetGPUInfoAMD");
        glXMakeAssociatedContextCurrentAMD = provider.getFunctionAddress("glXMakeAssociatedContextCurrentAMD");
        glXCreateContextAttribsARB = provider.getFunctionAddress("glXCreateContextAttribsARB");
        glXGetProcAddressARB = provider.getFunctionAddress("glXGetProcAddressARB");
        glXGetCurrentDisplayEXT = provider.getFunctionAddress("glXGetCurrentDisplayEXT");
        glXQueryContextInfoEXT = provider.getFunctionAddress("glXQueryContextInfoEXT");
        glXGetContextIDEXT = provider.getFunctionAddress("glXGetContextIDEXT");
        glXImportContextEXT = provider.getFunctionAddress("glXImportContextEXT");
        glXFreeContextEXT = provider.getFunctionAddress("glXFreeContextEXT");
        glXSwapIntervalEXT = provider.getFunctionAddress("glXSwapIntervalEXT");
        glXBindTexImageEXT = provider.getFunctionAddress("glXBindTexImageEXT");
        glXReleaseTexImageEXT = provider.getFunctionAddress("glXReleaseTexImageEXT");
        glXCopyBufferSubDataNV = provider.getFunctionAddress("glXCopyBufferSubDataNV");
        glXNamedCopyBufferSubDataNV = provider.getFunctionAddress("glXNamedCopyBufferSubDataNV");
        glXCopyImageSubDataNV = provider.getFunctionAddress("glXCopyImageSubDataNV");
        glXDelayBeforeSwapNV = provider.getFunctionAddress("glXDelayBeforeSwapNV");
        glXJoinSwapGroupNV = provider.getFunctionAddress("glXJoinSwapGroupNV");
        glXBindSwapBarrierNV = provider.getFunctionAddress("glXBindSwapBarrierNV");
        glXQuerySwapGroupNV = provider.getFunctionAddress("glXQuerySwapGroupNV");
        glXQueryMaxSwapGroupsNV = provider.getFunctionAddress("glXQueryMaxSwapGroupsNV");
        glXQueryFrameCountNV = provider.getFunctionAddress("glXQueryFrameCountNV");
        glXResetFrameCountNV = provider.getFunctionAddress("glXResetFrameCountNV");
        glXMakeCurrentReadSGI = provider.getFunctionAddress("glXMakeCurrentReadSGI");
        glXGetCurrentReadDrawableSGI = provider.getFunctionAddress("glXGetCurrentReadDrawableSGI");
        glXSwapIntervalSGI = provider.getFunctionAddress("glXSwapIntervalSGI");
        glXGetVideoSyncSGI = provider.getFunctionAddress("glXGetVideoSyncSGI");
        glXWaitVideoSyncSGI = provider.getFunctionAddress("glXWaitVideoSyncSGI");
        glXGetFBConfigAttribSGIX = provider.getFunctionAddress("glXGetFBConfigAttribSGIX");
        glXChooseFBConfigSGIX = provider.getFunctionAddress("glXChooseFBConfigSGIX");
        glXCreateGLXPixmapWithConfigSGIX = provider.getFunctionAddress("glXCreateGLXPixmapWithConfigSGIX");
        glXCreateContextWithConfigSGIX = provider.getFunctionAddress("glXCreateContextWithConfigSGIX");
        glXGetVisualFromFBConfigSGIX = provider.getFunctionAddress("glXGetVisualFromFBConfigSGIX");
        glXGetFBConfigFromVisualSGIX = provider.getFunctionAddress("glXGetFBConfigFromVisualSGIX");
        glXCreateGLXPbufferSGIX = provider.getFunctionAddress("glXCreateGLXPbufferSGIX");
        glXDestroyGLXPbufferSGIX = provider.getFunctionAddress("glXDestroyGLXPbufferSGIX");
        glXQueryGLXPbufferSGIX = provider.getFunctionAddress("glXQueryGLXPbufferSGIX");
        glXSelectEventSGIX = provider.getFunctionAddress("glXSelectEventSGIX");
        glXGetSelectedEventSGIX = provider.getFunctionAddress("glXGetSelectedEventSGIX");
        glXBindSwapBarrierSGIX = provider.getFunctionAddress("glXBindSwapBarrierSGIX");
        glXQueryMaxSwapBarriersSGIX = provider.getFunctionAddress("glXQueryMaxSwapBarriersSGIX");
        glXJoinSwapGroupSGIX = provider.getFunctionAddress("glXJoinSwapGroupSGIX");

        GLX11 = check_GLX11(ext);
        GLX12 = check_GLX12(ext);
        GLX13 = check_GLX13(ext);
        GLX14 = check_GLX14(ext);
        GLX_AMD_gpu_association = check_GLX_AMD_gpu_association(ext);
        GLX_ARB_context_flush_control = ext.contains("GLX_ARB_context_flush_control");
        GLX_ARB_create_context = check_GLX_ARB_create_context(ext);
        GLX_ARB_create_context_no_error = ext.contains("GLX_ARB_create_context_no_error");
        GLX_ARB_create_context_profile = ext.contains("GLX_ARB_create_context_profile");
        GLX_ARB_create_context_robustness = ext.contains("GLX_ARB_create_context_robustness");
        GLX_ARB_fbconfig_float = ext.contains("GLX_ARB_fbconfig_float");
        GLX_ARB_framebuffer_sRGB = ext.contains("GLX_ARB_framebuffer_sRGB");
        GLX_ARB_get_proc_address = check_GLX_ARB_get_proc_address(ext);
        GLX_ARB_multisample = ext.contains("GLX_ARB_multisample");
        GLX_ARB_robustness_application_isolation = ext.contains("GLX_ARB_robustness_application_isolation");
        GLX_ARB_robustness_share_group_isolation = ext.contains("GLX_ARB_robustness_share_group_isolation");
        GLX_ARB_vertex_buffer_object = ext.contains("GLX_ARB_vertex_buffer_object");
        GLX_EXT_buffer_age = ext.contains("GLX_EXT_buffer_age");
        GLX_EXT_context_priority = ext.contains("GLX_EXT_context_priority");
        GLX_EXT_create_context_es2_profile = ext.contains("GLX_EXT_create_context_es2_profile");
        GLX_EXT_create_context_es_profile = ext.contains("GLX_EXT_create_context_es_profile");
        GLX_EXT_fbconfig_packed_float = ext.contains("GLX_EXT_fbconfig_packed_float");
        GLX_EXT_framebuffer_sRGB = ext.contains("GLX_EXT_framebuffer_sRGB");
        GLX_EXT_import_context = check_GLX_EXT_import_context(ext);
        GLX_EXT_no_config_context = ext.contains("GLX_EXT_no_config_context");
        GLX_EXT_stereo_tree = ext.contains("GLX_EXT_stereo_tree");
        GLX_EXT_swap_control = check_GLX_EXT_swap_control(ext);
        GLX_EXT_swap_control_tear = ext.contains("GLX_EXT_swap_control_tear");
        GLX_EXT_texture_from_pixmap = check_GLX_EXT_texture_from_pixmap(ext);
        GLX_EXT_visual_info = ext.contains("GLX_EXT_visual_info");
        GLX_EXT_visual_rating = ext.contains("GLX_EXT_visual_rating");
        GLX_INTEL_swap_event = ext.contains("GLX_INTEL_swap_event");
        GLX_NV_copy_buffer = check_GLX_NV_copy_buffer(ext);
        GLX_NV_copy_image = check_GLX_NV_copy_image(ext);
        GLX_NV_delay_before_swap = check_GLX_NV_delay_before_swap(ext);
        GLX_NV_float_buffer = ext.contains("GLX_NV_float_buffer");
        GLX_NV_multigpu_context = ext.contains("GLX_NV_multigpu_context");
        GLX_NV_multisample_coverage = ext.contains("GLX_NV_multisample_coverage");
        GLX_NV_robustness_video_memory_purge = ext.contains("GLX_NV_robustness_video_memory_purge");
        GLX_NV_swap_group = check_GLX_NV_swap_group(ext);
        GLX_SGI_make_current_read = check_GLX_SGI_make_current_read(ext);
        GLX_SGI_swap_control = check_GLX_SGI_swap_control(ext);
        GLX_SGI_video_sync = check_GLX_SGI_video_sync(ext);
        GLX_SGIX_fbconfig = check_GLX_SGIX_fbconfig(ext);
        GLX_SGIX_pbuffer = check_GLX_SGIX_pbuffer(ext);
        GLX_SGIX_swap_barrier = check_GLX_SGIX_swap_barrier(ext);
        GLX_SGIX_swap_group = check_GLX_SGIX_swap_group(ext);
    }

    private static boolean checkExtension(String extension, boolean supported) {
        if (supported) {
            return true;
        }

        apiLog("[GLX] " + extension + " was reported as available but an entry point is missing.");
        return false;
    }

    private boolean check_GLX11(java.util.Set<String> ext) {
        return ext.contains("GLX11") && checkExtension("GLX11", checkFunctions(
            glXQueryExtensionsString, glXGetClientString, glXQueryServerString
        ));
    }

    private boolean check_GLX12(java.util.Set<String> ext) {
        return ext.contains("GLX12") && checkExtension("GLX12", checkFunctions(
            glXGetCurrentDisplay
        ));
    }

    private boolean check_GLX13(java.util.Set<String> ext) {
        return ext.contains("GLX13") && checkExtension("GLX13", checkFunctions(
            glXGetFBConfigs, glXChooseFBConfig, glXGetFBConfigAttrib, glXGetVisualFromFBConfig, glXCreateWindow, glXCreatePixmap, glXDestroyPixmap, 
            glXCreatePbuffer, glXDestroyPbuffer, glXQueryDrawable, glXCreateNewContext, glXMakeContextCurrent, glXGetCurrentReadDrawable, glXQueryContext, 
            glXSelectEvent, glXGetSelectedEvent
        ));
    }

    private boolean check_GLX14(java.util.Set<String> ext) {
        return ext.contains("GLX14") && checkExtension("GLX14", checkFunctions(
            glXGetProcAddress
        ));
    }

    private boolean check_GLX_AMD_gpu_association(java.util.Set<String> ext) {
        return ext.contains("GLX_AMD_gpu_association") && checkExtension("GLX_AMD_gpu_association", checkFunctions(
            glXBlitContextFramebufferAMD, glXCreateAssociatedContextAMD, glXCreateAssociatedContextAttribsAMD, glXDeleteAssociatedContextAMD, 
            glXGetContextGPUIDAMD, glXGetCurrentAssociatedContextAMD, glXGetGPUIDsAMD, glXGetGPUInfoAMD, glXMakeAssociatedContextCurrentAMD
        ));
    }

    private boolean check_GLX_ARB_create_context(java.util.Set<String> ext) {
        return ext.contains("GLX_ARB_create_context") && checkExtension("GLX_ARB_create_context", checkFunctions(
            glXCreateContextAttribsARB
        ));
    }

    private boolean check_GLX_ARB_get_proc_address(java.util.Set<String> ext) {
        return ext.contains("GLX_ARB_get_proc_address") && checkExtension("GLX_ARB_get_proc_address", checkFunctions(
            glXGetProcAddressARB
        ));
    }

    private boolean check_GLX_EXT_import_context(java.util.Set<String> ext) {
        return ext.contains("GLX_EXT_import_context") && checkExtension("GLX_EXT_import_context", checkFunctions(
            glXGetCurrentDisplayEXT, glXQueryContextInfoEXT, glXGetContextIDEXT, glXImportContextEXT, glXFreeContextEXT
        ));
    }

    private boolean check_GLX_EXT_swap_control(java.util.Set<String> ext) {
        return ext.contains("GLX_EXT_swap_control") && checkExtension("GLX_EXT_swap_control", checkFunctions(
            glXSwapIntervalEXT
        ));
    }

    private boolean check_GLX_EXT_texture_from_pixmap(java.util.Set<String> ext) {
        return ext.contains("GLX_EXT_texture_from_pixmap") && checkExtension("GLX_EXT_texture_from_pixmap", checkFunctions(
            glXBindTexImageEXT, glXReleaseTexImageEXT
        ));
    }

    private boolean check_GLX_NV_copy_buffer(java.util.Set<String> ext) {
        return ext.contains("GLX_NV_copy_buffer") && checkExtension("GLX_NV_copy_buffer", checkFunctions(
            glXCopyBufferSubDataNV, glXNamedCopyBufferSubDataNV
        ));
    }

    private boolean check_GLX_NV_copy_image(java.util.Set<String> ext) {
        return ext.contains("GLX_NV_copy_image") && checkExtension("GLX_NV_copy_image", checkFunctions(
            glXCopyImageSubDataNV
        ));
    }

    private boolean check_GLX_NV_delay_before_swap(java.util.Set<String> ext) {
        return ext.contains("GLX_NV_delay_before_swap") && checkExtension("GLX_NV_delay_before_swap", checkFunctions(
            glXDelayBeforeSwapNV
        ));
    }

    private boolean check_GLX_NV_swap_group(java.util.Set<String> ext) {
        return ext.contains("GLX_NV_swap_group") && checkExtension("GLX_NV_swap_group", checkFunctions(
            glXJoinSwapGroupNV, glXBindSwapBarrierNV, glXQuerySwapGroupNV, glXQueryMaxSwapGroupsNV, glXQueryFrameCountNV, glXResetFrameCountNV
        ));
    }

    private boolean check_GLX_SGI_make_current_read(java.util.Set<String> ext) {
        return ext.contains("GLX_SGI_make_current_read") && checkExtension("GLX_SGI_make_current_read", checkFunctions(
            glXMakeCurrentReadSGI, glXGetCurrentReadDrawableSGI
        ));
    }

    private boolean check_GLX_SGI_swap_control(java.util.Set<String> ext) {
        return ext.contains("GLX_SGI_swap_control") && checkExtension("GLX_SGI_swap_control", checkFunctions(
            glXSwapIntervalSGI
        ));
    }

    private boolean check_GLX_SGI_video_sync(java.util.Set<String> ext) {
        return ext.contains("GLX_SGI_video_sync") && checkExtension("GLX_SGI_video_sync", checkFunctions(
            glXGetVideoSyncSGI, glXWaitVideoSyncSGI
        ));
    }

    private boolean check_GLX_SGIX_fbconfig(java.util.Set<String> ext) {
        return ext.contains("GLX_SGIX_fbconfig") && checkExtension("GLX_SGIX_fbconfig", checkFunctions(
            glXGetFBConfigAttribSGIX, glXChooseFBConfigSGIX, glXCreateGLXPixmapWithConfigSGIX, glXCreateContextWithConfigSGIX, glXGetVisualFromFBConfigSGIX, 
            glXGetFBConfigFromVisualSGIX
        ));
    }

    private boolean check_GLX_SGIX_pbuffer(java.util.Set<String> ext) {
        return ext.contains("GLX_SGIX_pbuffer") && checkExtension("GLX_SGIX_pbuffer", checkFunctions(
            glXCreateGLXPbufferSGIX, glXDestroyGLXPbufferSGIX, glXQueryGLXPbufferSGIX, glXSelectEventSGIX, glXGetSelectedEventSGIX
        ));
    }

    private boolean check_GLX_SGIX_swap_barrier(java.util.Set<String> ext) {
        return ext.contains("GLX_SGIX_swap_barrier") && checkExtension("GLX_SGIX_swap_barrier", checkFunctions(
            glXBindSwapBarrierSGIX, glXQueryMaxSwapBarriersSGIX
        ));
    }

    private boolean check_GLX_SGIX_swap_group(java.util.Set<String> ext) {
        return ext.contains("GLX_SGIX_swap_group") && checkExtension("GLX_SGIX_swap_group", checkFunctions(
            glXJoinSwapGroupSGIX
        ));
    }

}
