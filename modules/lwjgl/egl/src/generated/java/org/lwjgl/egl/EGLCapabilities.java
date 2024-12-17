/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.system.*;
import java.util.Set;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;

public class EGLCapabilities {

    public final long
        eglChooseConfig,
        eglCopyBuffers,
        eglCreateContext,
        eglCreatePbufferSurface,
        eglCreatePixmapSurface,
        eglCreateWindowSurface,
        eglDestroyContext,
        eglDestroySurface,
        eglGetConfigAttrib,
        eglGetConfigs,
        eglGetCurrentDisplay,
        eglGetCurrentSurface,
        eglGetDisplay,
        eglGetError,
        eglGetProcAddress,
        eglInitialize,
        eglMakeCurrent,
        eglQueryContext,
        eglQueryString,
        eglQuerySurface,
        eglSwapBuffers,
        eglTerminate,
        eglWaitGL,
        eglWaitNative,
        eglBindTexImage,
        eglReleaseTexImage,
        eglSurfaceAttrib,
        eglSwapInterval,
        eglBindAPI,
        eglQueryAPI,
        eglCreatePbufferFromClientBuffer,
        eglReleaseThread,
        eglWaitClient,
        eglGetCurrentContext,
        eglCreateSync,
        eglDestroySync,
        eglClientWaitSync,
        eglGetSyncAttrib,
        eglCreateImage,
        eglDestroyImage,
        eglGetPlatformDisplay,
        eglCreatePlatformWindowSurface,
        eglCreatePlatformPixmapSurface,
        eglWaitSync,
        eglSetBlobCacheFuncsANDROID,
        eglCreateNativeClientBufferANDROID,
        eglDupNativeFenceFDANDROID,
        eglPresentationTimeANDROID,
        eglQuerySurfacePointerANGLE,
        eglGetMscRateANGLE,
        eglClientSignalSyncEXT,
        eglCompositorSetContextListEXT,
        eglCompositorSetContextAttributesEXT,
        eglCompositorSetWindowListEXT,
        eglCompositorSetWindowAttributesEXT,
        eglCompositorBindTexWindowEXT,
        eglCompositorSetSizeEXT,
        eglCompositorSwapPolicyEXT,
        eglQueryDevicesEXT,
        eglQueryDeviceBinaryEXT,
        eglQueryDeviceAttribEXT,
        eglQueryDeviceStringEXT,
        eglQueryDisplayAttribEXT,
        eglDestroyDisplayEXT,
        eglQueryDmaBufFormatsEXT,
        eglQueryDmaBufModifiersEXT,
        eglGetOutputLayersEXT,
        eglGetOutputPortsEXT,
        eglOutputLayerAttribEXT,
        eglQueryOutputLayerAttribEXT,
        eglQueryOutputLayerStringEXT,
        eglOutputPortAttribEXT,
        eglQueryOutputPortAttribEXT,
        eglQueryOutputPortStringEXT,
        eglGetPlatformDisplayEXT,
        eglCreatePlatformWindowSurfaceEXT,
        eglCreatePlatformPixmapSurfaceEXT,
        eglStreamConsumerOutputEXT,
        eglQuerySupportedCompressionRatesEXT,
        eglSwapBuffersWithDamageEXT,
        eglUnsignalSyncEXT,
        eglCreatePixmapSurfaceHI,
        eglCreateSync64KHR,
        eglDebugMessageControlKHR,
        eglQueryDebugKHR,
        eglLabelObjectKHR,
        eglQueryDisplayAttribKHR,
        eglCreateImageKHR,
        eglDestroyImageKHR,
        eglLockSurfaceKHR,
        eglUnlockSurfaceKHR,
        eglQuerySurface64KHR,
        eglSetDamageRegionKHR,
        eglCreateSyncKHR,
        eglDestroySyncKHR,
        eglClientWaitSyncKHR,
        eglSignalSyncKHR,
        eglGetSyncAttribKHR,
        eglCreateStreamKHR,
        eglDestroyStreamKHR,
        eglStreamAttribKHR,
        eglQueryStreamKHR,
        eglQueryStreamu64KHR,
        eglCreateStreamAttribKHR,
        eglSetStreamAttribKHR,
        eglQueryStreamAttribKHR,
        eglStreamConsumerAcquireAttribKHR,
        eglStreamConsumerReleaseAttribKHR,
        eglStreamConsumerGLTextureExternalKHR,
        eglStreamConsumerAcquireKHR,
        eglStreamConsumerReleaseKHR,
        eglGetStreamFileDescriptorKHR,
        eglCreateStreamFromFileDescriptorKHR,
        eglQueryStreamTimeKHR,
        eglCreateStreamProducerSurfaceKHR,
        eglSwapBuffersWithDamageKHR,
        eglWaitSyncKHR,
        eglCreateDRMImageMESA,
        eglExportDRMImageMESA,
        eglExportDMABUFImageQueryMESA,
        eglExportDMABUFImageMESA,
        eglSwapBuffersRegion2NOK,
        eglQueryNativeDisplayNV,
        eglQueryNativeWindowNV,
        eglQueryNativePixmapNV,
        eglPostSubBufferNV,
        eglStreamImageConsumerConnectNV,
        eglQueryStreamConsumerEventNV,
        eglStreamAcquireImageNV,
        eglStreamReleaseImageNV,
        eglStreamConsumerGLTextureExternalAttribsNV,
        eglStreamFlushNV,
        eglQueryDisplayAttribNV,
        eglSetStreamMetadataNV,
        eglQueryStreamMetadataNV,
        eglResetStreamNV,
        eglCreateStreamSyncNV,
        eglCreateFenceSyncNV,
        eglDestroySyncNV,
        eglFenceNV,
        eglClientWaitSyncNV,
        eglSignalSyncNV,
        eglGetSyncAttribNV,
        eglGetSystemTimeFrequencyNV,
        eglGetSystemTimeNV,
        eglBindWaylandDisplayWL,
        eglUnbindWaylandDisplayWL,
        eglQueryWaylandBufferWL,
        eglCreateWaylandBufferFromImageWL;

    /** When true, {@code EGL10} is supported. */
    public final boolean EGL10;
    /** When true, {@code EGL11} is supported. */
    public final boolean EGL11;
    /** When true, {@code EGL12} is supported. */
    public final boolean EGL12;
    /** When true, {@code EGL13} is supported. */
    public final boolean EGL13;
    /** When true, {@code EGL14} is supported. */
    public final boolean EGL14;
    /** When true, {@code EGL15} is supported. */
    public final boolean EGL15;
    /** When true, {@code ANDROID_blob_cache} is supported. */
    public final boolean EGL_ANDROID_blob_cache;
    /** When true, {@code ANDROID_create_native_client_buffer} is supported. */
    public final boolean EGL_ANDROID_create_native_client_buffer;
    /** When true, {@code ANDROID_framebuffer_target} is supported. */
    public final boolean EGL_ANDROID_framebuffer_target;
    /** When true, {@code ANDROID_front_buffer_auto_refresh} is supported. */
    public final boolean EGL_ANDROID_front_buffer_auto_refresh;
    /** When true, {@code ANDROID_image_native_buffer} is supported. */
    public final boolean EGL_ANDROID_image_native_buffer;
    /** When true, {@code ANDROID_native_fence_sync} is supported. */
    public final boolean EGL_ANDROID_native_fence_sync;
    /** When true, {@code ANDROID_presentation_time} is supported. */
    public final boolean EGL_ANDROID_presentation_time;
    /** When true, {@code ANDROID_recordable} is supported. */
    public final boolean EGL_ANDROID_recordable;
    /** When true, {@code ANGLE_d3d_share_handle_client_buffer} is supported. */
    public final boolean EGL_ANGLE_d3d_share_handle_client_buffer;
    /** When true, {@code ANGLE_device_d3d} is supported. */
    public final boolean EGL_ANGLE_device_d3d;
    /** When true, {@code ANGLE_query_surface_pointer} is supported. */
    public final boolean EGL_ANGLE_query_surface_pointer;
    /** When true, {@code ANGLE_surface_d3d_texture_2d_share_handle} is supported. */
    public final boolean EGL_ANGLE_surface_d3d_texture_2d_share_handle;
    /** When true, {@code ANGLE_sync_control_rate} is supported. */
    public final boolean EGL_ANGLE_sync_control_rate;
    /** When true, {@code ANGLE_window_fixed_size} is supported. */
    public final boolean EGL_ANGLE_window_fixed_size;
    /** When true, {@code ARM_image_format} is supported. */
    public final boolean EGL_ARM_image_format;
    /** When true, {@code ARM_pixmap_multisample_discard} is supported. */
    public final boolean EGL_ARM_pixmap_multisample_discard;
    /** When true, {@code EXT_bind_to_front} is supported. */
    public final boolean EGL_EXT_bind_to_front;
    /** When true, {@code EXT_buffer_age} is supported. */
    public final boolean EGL_EXT_buffer_age;
    /** When true, {@code EXT_client_extensions} is supported. */
    public final boolean EGL_EXT_client_extensions;
    /** When true, {@code EXT_client_sync} is supported. */
    public final boolean EGL_EXT_client_sync;
    /** When true, {@code EXT_compositor} is supported. */
    public final boolean EGL_EXT_compositor;
    /** When true, {@code EXT_config_select_group} is supported. */
    public final boolean EGL_EXT_config_select_group;
    /** When true, {@code EXT_create_context_robustness} is supported. */
    public final boolean EGL_EXT_create_context_robustness;
    /** When true, {@code EXT_device_base} is supported. */
    public final boolean EGL_EXT_device_base;
    /** When true, {@code EXT_device_drm} is supported. */
    public final boolean EGL_EXT_device_drm;
    /** When true, {@code EXT_device_drm_render_node} is supported. */
    public final boolean EGL_EXT_device_drm_render_node;
    /** When true, {@code EXT_device_enumeration} is supported. */
    public final boolean EGL_EXT_device_enumeration;
    /** When true, {@code EXT_device_openwf} is supported. */
    public final boolean EGL_EXT_device_openwf;
    /** When true, {@code EXT_device_persistent_id} is supported. */
    public final boolean EGL_EXT_device_persistent_id;
    /** When true, {@code EXT_device_query} is supported. */
    public final boolean EGL_EXT_device_query;
    /** When true, {@code EXT_device_query_name} is supported. */
    public final boolean EGL_EXT_device_query_name;
    /** When true, {@code EXT_display_alloc} is supported. */
    public final boolean EGL_EXT_display_alloc;
    /** When true, {@code EXT_explicit_device} is supported. */
    public final boolean EGL_EXT_explicit_device;
    /** When true, {@code EXT_gl_colorspace_bt2020_hlg} is supported. */
    public final boolean EGL_EXT_gl_colorspace_bt2020_hlg;
    /** When true, {@code EXT_gl_colorspace_bt2020_linear} is supported. */
    public final boolean EGL_EXT_gl_colorspace_bt2020_linear;
    /** When true, {@code EXT_gl_colorspace_bt2020_pq} is supported. */
    public final boolean EGL_EXT_gl_colorspace_bt2020_pq;
    /** When true, {@code EXT_gl_colorspace_display_p3} is supported. */
    public final boolean EGL_EXT_gl_colorspace_display_p3;
    /** When true, {@code EXT_gl_colorspace_display_p3_linear} is supported. */
    public final boolean EGL_EXT_gl_colorspace_display_p3_linear;
    /** When true, {@code EXT_gl_colorspace_display_p3_passthrough} is supported. */
    public final boolean EGL_EXT_gl_colorspace_display_p3_passthrough;
    /** When true, {@code EXT_gl_colorspace_scrgb} is supported. */
    public final boolean EGL_EXT_gl_colorspace_scrgb;
    /** When true, {@code EXT_gl_colorspace_scrgb_linear} is supported. */
    public final boolean EGL_EXT_gl_colorspace_scrgb_linear;
    /** When true, {@code EXT_image_dma_buf_import} is supported. */
    public final boolean EGL_EXT_image_dma_buf_import;
    /** When true, {@code EXT_image_dma_buf_import_modifiers} is supported. */
    public final boolean EGL_EXT_image_dma_buf_import_modifiers;
    /** When true, {@code EXT_image_gl_colorspace} is supported. */
    public final boolean EGL_EXT_image_gl_colorspace;
    /** When true, {@code EXT_image_implicit_sync_control} is supported. */
    public final boolean EGL_EXT_image_implicit_sync_control;
    /** When true, {@code EXT_multiview_window} is supported. */
    public final boolean EGL_EXT_multiview_window;
    /** When true, {@code EXT_output_base} is supported. */
    public final boolean EGL_EXT_output_base;
    /** When true, {@code EXT_output_drm} is supported. */
    public final boolean EGL_EXT_output_drm;
    /** When true, {@code EXT_output_openwf} is supported. */
    public final boolean EGL_EXT_output_openwf;
    /** When true, {@code EXT_pixel_format_float} is supported. */
    public final boolean EGL_EXT_pixel_format_float;
    /** When true, {@code EXT_platform_base} is supported. */
    public final boolean EGL_EXT_platform_base;
    /** When true, {@code EXT_platform_device} is supported. */
    public final boolean EGL_EXT_platform_device;
    /** When true, {@code EXT_platform_wayland} is supported. */
    public final boolean EGL_EXT_platform_wayland;
    /** When true, {@code EXT_platform_x11} is supported. */
    public final boolean EGL_EXT_platform_x11;
    /** When true, {@code EXT_platform_xcb} is supported. */
    public final boolean EGL_EXT_platform_xcb;
    /** When true, {@code EXT_present_opaque} is supported. */
    public final boolean EGL_EXT_present_opaque;
    /** When true, {@code EXT_protected_content} is supported. */
    public final boolean EGL_EXT_protected_content;
    /** When true, {@code EXT_protected_surface} is supported. */
    public final boolean EGL_EXT_protected_surface;
    /** When true, {@code EXT_query_reset_notification_strategy} is supported. */
    public final boolean EGL_EXT_query_reset_notification_strategy;
    /** When true, {@code EXT_stream_consumer_egloutput} is supported. */
    public final boolean EGL_EXT_stream_consumer_egloutput;
    /** When true, {@code EXT_surface_compression} is supported. */
    public final boolean EGL_EXT_surface_compression;
    /** When true, {@code EXT_surface_CTA861_3_metadata} is supported. */
    public final boolean EGL_EXT_surface_CTA861_3_metadata;
    /** When true, {@code EXT_surface_SMPTE2086_metadata} is supported. */
    public final boolean EGL_EXT_surface_SMPTE2086_metadata;
    /** When true, {@code EXT_swap_buffers_with_damage} is supported. */
    public final boolean EGL_EXT_swap_buffers_with_damage;
    /** When true, {@code EXT_sync_reuse} is supported. */
    public final boolean EGL_EXT_sync_reuse;
    /** When true, {@code EXT_yuv_surface} is supported. */
    public final boolean EGL_EXT_yuv_surface;
    /** When true, {@code HI_clientpixmap} is supported. */
    public final boolean EGL_HI_clientpixmap;
    /** When true, {@code HI_colorformats} is supported. */
    public final boolean EGL_HI_colorformats;
    /** When true, {@code IMG_context_priority} is supported. */
    public final boolean EGL_IMG_context_priority;
    /** When true, {@code IMG_image_plane_attribs} is supported. */
    public final boolean EGL_IMG_image_plane_attribs;
    /** When true, {@code KHR_cl_event2} is supported. */
    public final boolean EGL_KHR_cl_event2;
    /** When true, {@code KHR_client_get_all_proc_addresses} is supported. */
    public final boolean EGL_KHR_client_get_all_proc_addresses;
    /** When true, {@code KHR_config_attribs} is supported. */
    public final boolean EGL_KHR_config_attribs;
    /** When true, {@code KHR_context_flush_control} is supported. */
    public final boolean EGL_KHR_context_flush_control;
    /** When true, {@code KHR_create_context} is supported. */
    public final boolean EGL_KHR_create_context;
    /** When true, {@code KHR_create_context_no_error} is supported. */
    public final boolean EGL_KHR_create_context_no_error;
    /** When true, {@code KHR_debug} is supported. */
    public final boolean EGL_KHR_debug;
    /** When true, {@code KHR_display_reference} is supported. */
    public final boolean EGL_KHR_display_reference;
    /** When true, {@code KHR_fence_sync} is supported. */
    public final boolean EGL_KHR_fence_sync;
    /** When true, {@code KHR_get_all_proc_addresses} is supported. */
    public final boolean EGL_KHR_get_all_proc_addresses;
    /** When true, {@code KHR_gl_colorspace} is supported. */
    public final boolean EGL_KHR_gl_colorspace;
    /** When true, {@code KHR_gl_renderbuffer_image} is supported. */
    public final boolean EGL_KHR_gl_renderbuffer_image;
    /** When true, {@code KHR_gl_texture_2D_image} is supported. */
    public final boolean EGL_KHR_gl_texture_2D_image;
    /** When true, {@code KHR_gl_texture_3D_image} is supported. */
    public final boolean EGL_KHR_gl_texture_3D_image;
    /** When true, {@code KHR_gl_texture_cubemap_image} is supported. */
    public final boolean EGL_KHR_gl_texture_cubemap_image;
    /** When true, {@code KHR_image} is supported. */
    public final boolean EGL_KHR_image;
    /** When true, {@code KHR_image_base} is supported. */
    public final boolean EGL_KHR_image_base;
    /** When true, {@code KHR_image_pixmap} is supported. */
    public final boolean EGL_KHR_image_pixmap;
    /** When true, {@code KHR_lock_surface3} is supported. */
    public final boolean EGL_KHR_lock_surface3;
    /** When true, {@code KHR_mutable_render_buffer} is supported. */
    public final boolean EGL_KHR_mutable_render_buffer;
    /** When true, {@code KHR_no_config_context} is supported. */
    public final boolean EGL_KHR_no_config_context;
    /** When true, {@code KHR_partial_update} is supported. */
    public final boolean EGL_KHR_partial_update;
    /** When true, {@code KHR_platform_android} is supported. */
    public final boolean EGL_KHR_platform_android;
    /** When true, {@code KHR_platform_gbm} is supported. */
    public final boolean EGL_KHR_platform_gbm;
    /** When true, {@code KHR_platform_wayland} is supported. */
    public final boolean EGL_KHR_platform_wayland;
    /** When true, {@code KHR_platform_x11} is supported. */
    public final boolean EGL_KHR_platform_x11;
    /** When true, {@code KHR_reusable_sync} is supported. */
    public final boolean EGL_KHR_reusable_sync;
    /** When true, {@code KHR_stream} is supported. */
    public final boolean EGL_KHR_stream;
    /** When true, {@code KHR_stream_attrib} is supported. */
    public final boolean EGL_KHR_stream_attrib;
    /** When true, {@code KHR_stream_consumer_gltexture} is supported. */
    public final boolean EGL_KHR_stream_consumer_gltexture;
    /** When true, {@code KHR_stream_cross_process_fd} is supported. */
    public final boolean EGL_KHR_stream_cross_process_fd;
    /** When true, {@code KHR_stream_fifo} is supported. */
    public final boolean EGL_KHR_stream_fifo;
    /** When true, {@code KHR_stream_producer_aldatalocator} is supported. */
    public final boolean EGL_KHR_stream_producer_aldatalocator;
    /** When true, {@code KHR_stream_producer_eglsurface} is supported. */
    public final boolean EGL_KHR_stream_producer_eglsurface;
    /** When true, {@code KHR_surfaceless_context} is supported. */
    public final boolean EGL_KHR_surfaceless_context;
    /** When true, {@code KHR_swap_buffers_with_damage} is supported. */
    public final boolean EGL_KHR_swap_buffers_with_damage;
    /** When true, {@code KHR_vg_parent_image} is supported. */
    public final boolean EGL_KHR_vg_parent_image;
    /** When true, {@code KHR_wait_sync} is supported. */
    public final boolean EGL_KHR_wait_sync;
    /** When true, {@code MESA_drm_image} is supported. */
    public final boolean EGL_MESA_drm_image;
    /** When true, {@code MESA_image_dma_buf_export} is supported. */
    public final boolean EGL_MESA_image_dma_buf_export;
    /** When true, {@code MESA_platform_gbm} is supported. */
    public final boolean EGL_MESA_platform_gbm;
    /** When true, {@code NOK_swap_region2} is supported. */
    public final boolean EGL_NOK_swap_region2;
    /** When true, {@code NOK_texture_from_pixmap} is supported. */
    public final boolean EGL_NOK_texture_from_pixmap;
    /** When true, {@code NV_3dvision_surface} is supported. */
    public final boolean EGL_NV_3dvision_surface;
    /** When true, {@code NV_context_priority_realtime} is supported. */
    public final boolean EGL_NV_context_priority_realtime;
    /** When true, {@code NV_coverage_sample} is supported. */
    public final boolean EGL_NV_coverage_sample;
    /** When true, {@code NV_coverage_sample_resolve} is supported. */
    public final boolean EGL_NV_coverage_sample_resolve;
    /** When true, {@code NV_cuda_event} is supported. */
    public final boolean EGL_NV_cuda_event;
    /** When true, {@code NV_depth_nonlinear} is supported. */
    public final boolean EGL_NV_depth_nonlinear;
    /** When true, {@code NV_device_cuda} is supported. */
    public final boolean EGL_NV_device_cuda;
    /** When true, {@code NV_native_query} is supported. */
    public final boolean EGL_NV_native_query;
    /** When true, {@code NV_post_convert_rounding} is supported. */
    public final boolean EGL_NV_post_convert_rounding;
    /** When true, {@code NV_post_sub_buffer} is supported. */
    public final boolean EGL_NV_post_sub_buffer;
    /** When true, {@code NV_quadruple_buffer} is supported. */
    public final boolean EGL_NV_quadruple_buffer;
    /** When true, {@code NV_robustness_video_memory_purge} is supported. */
    public final boolean EGL_NV_robustness_video_memory_purge;
    /** When true, {@code NV_stream_consumer_eglimage} is supported. */
    public final boolean EGL_NV_stream_consumer_eglimage;
    /** When true, {@code NV_stream_consumer_eglimage_use_scanout_attrib} is supported. */
    public final boolean EGL_NV_stream_consumer_eglimage_use_scanout_attrib;
    /** When true, {@code NV_stream_consumer_gltexture_yuv} is supported. */
    public final boolean EGL_NV_stream_consumer_gltexture_yuv;
    /** When true, {@code NV_stream_cross_display} is supported. */
    public final boolean EGL_NV_stream_cross_display;
    /** When true, {@code NV_stream_cross_object} is supported. */
    public final boolean EGL_NV_stream_cross_object;
    /** When true, {@code NV_stream_cross_partition} is supported. */
    public final boolean EGL_NV_stream_cross_partition;
    /** When true, {@code NV_stream_cross_process} is supported. */
    public final boolean EGL_NV_stream_cross_process;
    /** When true, {@code NV_stream_cross_system} is supported. */
    public final boolean EGL_NV_stream_cross_system;
    /** When true, {@code NV_stream_dma} is supported. */
    public final boolean EGL_NV_stream_dma;
    /** When true, {@code NV_stream_fifo_next} is supported. */
    public final boolean EGL_NV_stream_fifo_next;
    /** When true, {@code NV_stream_fifo_synchronous} is supported. */
    public final boolean EGL_NV_stream_fifo_synchronous;
    /** When true, {@code NV_stream_flush} is supported. */
    public final boolean EGL_NV_stream_flush;
    /** When true, {@code NV_stream_frame_limits} is supported. */
    public final boolean EGL_NV_stream_frame_limits;
    /** When true, {@code NV_stream_metadata} is supported. */
    public final boolean EGL_NV_stream_metadata;
    /** When true, {@code NV_stream_remote} is supported. */
    public final boolean EGL_NV_stream_remote;
    /** When true, {@code NV_stream_reset} is supported. */
    public final boolean EGL_NV_stream_reset;
    /** When true, {@code NV_stream_socket} is supported. */
    public final boolean EGL_NV_stream_socket;
    /** When true, {@code NV_stream_socket_inet} is supported. */
    public final boolean EGL_NV_stream_socket_inet;
    /** When true, {@code NV_stream_socket_unix} is supported. */
    public final boolean EGL_NV_stream_socket_unix;
    /** When true, {@code NV_stream_sync} is supported. */
    public final boolean EGL_NV_stream_sync;
    /** When true, {@code NV_sync} is supported. */
    public final boolean EGL_NV_sync;
    /** When true, {@code NV_system_time} is supported. */
    public final boolean EGL_NV_system_time;
    /** When true, {@code NV_triple_buffer} is supported. */
    public final boolean EGL_NV_triple_buffer;
    /** When true, {@code TIZEN_image_native_buffer} is supported. */
    public final boolean EGL_TIZEN_image_native_buffer;
    /** When true, {@code TIZEN_image_native_surface} is supported. */
    public final boolean EGL_TIZEN_image_native_surface;
    /** When true, {@code WL_bind_wayland_display} is supported. */
    public final boolean EGL_WL_bind_wayland_display;
    /** When true, {@code WL_create_wayland_buffer_from_image} is supported. */
    public final boolean EGL_WL_create_wayland_buffer_from_image;

    EGLCapabilities(FunctionProvider provider, Set<String> ext) {
        this(ext,
            provider.getFunctionAddress("eglChooseConfig"),
            provider.getFunctionAddress("eglCopyBuffers"),
            provider.getFunctionAddress("eglCreateContext"),
            provider.getFunctionAddress("eglCreatePbufferSurface"),
            provider.getFunctionAddress("eglCreatePixmapSurface"),
            provider.getFunctionAddress("eglCreateWindowSurface"),
            provider.getFunctionAddress("eglDestroyContext"),
            provider.getFunctionAddress("eglDestroySurface"),
            provider.getFunctionAddress("eglGetConfigAttrib"),
            provider.getFunctionAddress("eglGetConfigs"),
            provider.getFunctionAddress("eglGetCurrentDisplay"),
            provider.getFunctionAddress("eglGetCurrentSurface"),
            provider.getFunctionAddress("eglGetDisplay"),
            provider.getFunctionAddress("eglGetError"),
            provider.getFunctionAddress("eglGetProcAddress"),
            provider.getFunctionAddress("eglInitialize"),
            provider.getFunctionAddress("eglMakeCurrent"),
            provider.getFunctionAddress("eglQueryContext"),
            provider.getFunctionAddress("eglQueryString"),
            provider.getFunctionAddress("eglQuerySurface"),
            provider.getFunctionAddress("eglSwapBuffers"),
            provider.getFunctionAddress("eglTerminate"),
            provider.getFunctionAddress("eglWaitGL"),
            provider.getFunctionAddress("eglWaitNative"),
            provider.getFunctionAddress("eglBindTexImage"),
            provider.getFunctionAddress("eglReleaseTexImage"),
            provider.getFunctionAddress("eglSurfaceAttrib"),
            provider.getFunctionAddress("eglSwapInterval"),
            provider.getFunctionAddress("eglBindAPI"),
            provider.getFunctionAddress("eglQueryAPI"),
            provider.getFunctionAddress("eglCreatePbufferFromClientBuffer"),
            provider.getFunctionAddress("eglReleaseThread"),
            provider.getFunctionAddress("eglWaitClient"),
            provider.getFunctionAddress("eglGetCurrentContext"),
            provider.getFunctionAddress("eglCreateSync"),
            provider.getFunctionAddress("eglDestroySync"),
            provider.getFunctionAddress("eglClientWaitSync"),
            provider.getFunctionAddress("eglGetSyncAttrib"),
            provider.getFunctionAddress("eglCreateImage"),
            provider.getFunctionAddress("eglDestroyImage"),
            provider.getFunctionAddress("eglGetPlatformDisplay"),
            provider.getFunctionAddress("eglCreatePlatformWindowSurface"),
            provider.getFunctionAddress("eglCreatePlatformPixmapSurface"),
            provider.getFunctionAddress("eglWaitSync"),
            provider.getFunctionAddress("eglSetBlobCacheFuncsANDROID"),
            provider.getFunctionAddress("eglCreateNativeClientBufferANDROID"),
            provider.getFunctionAddress("eglDupNativeFenceFDANDROID"),
            provider.getFunctionAddress("eglPresentationTimeANDROID"),
            provider.getFunctionAddress("eglQuerySurfacePointerANGLE"),
            provider.getFunctionAddress("eglGetMscRateANGLE"),
            provider.getFunctionAddress("eglClientSignalSyncEXT"),
            provider.getFunctionAddress("eglCompositorSetContextListEXT"),
            provider.getFunctionAddress("eglCompositorSetContextAttributesEXT"),
            provider.getFunctionAddress("eglCompositorSetWindowListEXT"),
            provider.getFunctionAddress("eglCompositorSetWindowAttributesEXT"),
            provider.getFunctionAddress("eglCompositorBindTexWindowEXT"),
            provider.getFunctionAddress("eglCompositorSetSizeEXT"),
            provider.getFunctionAddress("eglCompositorSwapPolicyEXT"),
            provider.getFunctionAddress("eglQueryDevicesEXT"),
            provider.getFunctionAddress("eglQueryDeviceBinaryEXT"),
            provider.getFunctionAddress("eglQueryDeviceAttribEXT"),
            provider.getFunctionAddress("eglQueryDeviceStringEXT"),
            provider.getFunctionAddress("eglQueryDisplayAttribEXT"),
            provider.getFunctionAddress("eglDestroyDisplayEXT"),
            provider.getFunctionAddress("eglQueryDmaBufFormatsEXT"),
            provider.getFunctionAddress("eglQueryDmaBufModifiersEXT"),
            provider.getFunctionAddress("eglGetOutputLayersEXT"),
            provider.getFunctionAddress("eglGetOutputPortsEXT"),
            provider.getFunctionAddress("eglOutputLayerAttribEXT"),
            provider.getFunctionAddress("eglQueryOutputLayerAttribEXT"),
            provider.getFunctionAddress("eglQueryOutputLayerStringEXT"),
            provider.getFunctionAddress("eglOutputPortAttribEXT"),
            provider.getFunctionAddress("eglQueryOutputPortAttribEXT"),
            provider.getFunctionAddress("eglQueryOutputPortStringEXT"),
            provider.getFunctionAddress("eglGetPlatformDisplayEXT"),
            provider.getFunctionAddress("eglCreatePlatformWindowSurfaceEXT"),
            provider.getFunctionAddress("eglCreatePlatformPixmapSurfaceEXT"),
            provider.getFunctionAddress("eglStreamConsumerOutputEXT"),
            provider.getFunctionAddress("eglQuerySupportedCompressionRatesEXT"),
            provider.getFunctionAddress("eglSwapBuffersWithDamageEXT"),
            provider.getFunctionAddress("eglUnsignalSyncEXT"),
            provider.getFunctionAddress("eglCreatePixmapSurfaceHI"),
            provider.getFunctionAddress("eglCreateSync64KHR"),
            provider.getFunctionAddress("eglDebugMessageControlKHR"),
            provider.getFunctionAddress("eglQueryDebugKHR"),
            provider.getFunctionAddress("eglLabelObjectKHR"),
            provider.getFunctionAddress("eglQueryDisplayAttribKHR"),
            provider.getFunctionAddress("eglCreateImageKHR"),
            provider.getFunctionAddress("eglDestroyImageKHR"),
            provider.getFunctionAddress("eglLockSurfaceKHR"),
            provider.getFunctionAddress("eglUnlockSurfaceKHR"),
            provider.getFunctionAddress("eglQuerySurface64KHR"),
            provider.getFunctionAddress("eglSetDamageRegionKHR"),
            provider.getFunctionAddress("eglCreateSyncKHR"),
            provider.getFunctionAddress("eglDestroySyncKHR"),
            provider.getFunctionAddress("eglClientWaitSyncKHR"),
            provider.getFunctionAddress("eglSignalSyncKHR"),
            provider.getFunctionAddress("eglGetSyncAttribKHR"),
            provider.getFunctionAddress("eglCreateStreamKHR"),
            provider.getFunctionAddress("eglDestroyStreamKHR"),
            provider.getFunctionAddress("eglStreamAttribKHR"),
            provider.getFunctionAddress("eglQueryStreamKHR"),
            provider.getFunctionAddress("eglQueryStreamu64KHR"),
            provider.getFunctionAddress("eglCreateStreamAttribKHR"),
            provider.getFunctionAddress("eglSetStreamAttribKHR"),
            provider.getFunctionAddress("eglQueryStreamAttribKHR"),
            provider.getFunctionAddress("eglStreamConsumerAcquireAttribKHR"),
            provider.getFunctionAddress("eglStreamConsumerReleaseAttribKHR"),
            provider.getFunctionAddress("eglStreamConsumerGLTextureExternalKHR"),
            provider.getFunctionAddress("eglStreamConsumerAcquireKHR"),
            provider.getFunctionAddress("eglStreamConsumerReleaseKHR"),
            provider.getFunctionAddress("eglGetStreamFileDescriptorKHR"),
            provider.getFunctionAddress("eglCreateStreamFromFileDescriptorKHR"),
            provider.getFunctionAddress("eglQueryStreamTimeKHR"),
            provider.getFunctionAddress("eglCreateStreamProducerSurfaceKHR"),
            provider.getFunctionAddress("eglSwapBuffersWithDamageKHR"),
            provider.getFunctionAddress("eglWaitSyncKHR"),
            provider.getFunctionAddress("eglCreateDRMImageMESA"),
            provider.getFunctionAddress("eglExportDRMImageMESA"),
            provider.getFunctionAddress("eglExportDMABUFImageQueryMESA"),
            provider.getFunctionAddress("eglExportDMABUFImageMESA"),
            provider.getFunctionAddress("eglSwapBuffersRegion2NOK"),
            provider.getFunctionAddress("eglQueryNativeDisplayNV"),
            provider.getFunctionAddress("eglQueryNativeWindowNV"),
            provider.getFunctionAddress("eglQueryNativePixmapNV"),
            provider.getFunctionAddress("eglPostSubBufferNV"),
            provider.getFunctionAddress("eglStreamImageConsumerConnectNV"),
            provider.getFunctionAddress("eglQueryStreamConsumerEventNV"),
            provider.getFunctionAddress("eglStreamAcquireImageNV"),
            provider.getFunctionAddress("eglStreamReleaseImageNV"),
            provider.getFunctionAddress("eglStreamConsumerGLTextureExternalAttribsNV"),
            provider.getFunctionAddress("eglStreamFlushNV"),
            provider.getFunctionAddress("eglQueryDisplayAttribNV"),
            provider.getFunctionAddress("eglSetStreamMetadataNV"),
            provider.getFunctionAddress("eglQueryStreamMetadataNV"),
            provider.getFunctionAddress("eglResetStreamNV"),
            provider.getFunctionAddress("eglCreateStreamSyncNV"),
            provider.getFunctionAddress("eglCreateFenceSyncNV"),
            provider.getFunctionAddress("eglDestroySyncNV"),
            provider.getFunctionAddress("eglFenceNV"),
            provider.getFunctionAddress("eglClientWaitSyncNV"),
            provider.getFunctionAddress("eglSignalSyncNV"),
            provider.getFunctionAddress("eglGetSyncAttribNV"),
            provider.getFunctionAddress("eglGetSystemTimeFrequencyNV"),
            provider.getFunctionAddress("eglGetSystemTimeNV"),
            provider.getFunctionAddress("eglBindWaylandDisplayWL"),
            provider.getFunctionAddress("eglUnbindWaylandDisplayWL"),
            provider.getFunctionAddress("eglQueryWaylandBufferWL"),
            provider.getFunctionAddress("eglCreateWaylandBufferFromImageWL")
        );
    }

    EGLCapabilities(EGLCapabilities caps, Set<String> ext) {
        this(ext,
            caps.eglChooseConfig,
            caps.eglCopyBuffers,
            caps.eglCreateContext,
            caps.eglCreatePbufferSurface,
            caps.eglCreatePixmapSurface,
            caps.eglCreateWindowSurface,
            caps.eglDestroyContext,
            caps.eglDestroySurface,
            caps.eglGetConfigAttrib,
            caps.eglGetConfigs,
            caps.eglGetCurrentDisplay,
            caps.eglGetCurrentSurface,
            caps.eglGetDisplay,
            caps.eglGetError,
            caps.eglGetProcAddress,
            caps.eglInitialize,
            caps.eglMakeCurrent,
            caps.eglQueryContext,
            caps.eglQueryString,
            caps.eglQuerySurface,
            caps.eglSwapBuffers,
            caps.eglTerminate,
            caps.eglWaitGL,
            caps.eglWaitNative,
            caps.eglBindTexImage,
            caps.eglReleaseTexImage,
            caps.eglSurfaceAttrib,
            caps.eglSwapInterval,
            caps.eglBindAPI,
            caps.eglQueryAPI,
            caps.eglCreatePbufferFromClientBuffer,
            caps.eglReleaseThread,
            caps.eglWaitClient,
            caps.eglGetCurrentContext,
            caps.eglCreateSync,
            caps.eglDestroySync,
            caps.eglClientWaitSync,
            caps.eglGetSyncAttrib,
            caps.eglCreateImage,
            caps.eglDestroyImage,
            caps.eglGetPlatformDisplay,
            caps.eglCreatePlatformWindowSurface,
            caps.eglCreatePlatformPixmapSurface,
            caps.eglWaitSync,
            caps.eglSetBlobCacheFuncsANDROID,
            caps.eglCreateNativeClientBufferANDROID,
            caps.eglDupNativeFenceFDANDROID,
            caps.eglPresentationTimeANDROID,
            caps.eglQuerySurfacePointerANGLE,
            caps.eglGetMscRateANGLE,
            caps.eglClientSignalSyncEXT,
            caps.eglCompositorSetContextListEXT,
            caps.eglCompositorSetContextAttributesEXT,
            caps.eglCompositorSetWindowListEXT,
            caps.eglCompositorSetWindowAttributesEXT,
            caps.eglCompositorBindTexWindowEXT,
            caps.eglCompositorSetSizeEXT,
            caps.eglCompositorSwapPolicyEXT,
            caps.eglQueryDevicesEXT,
            caps.eglQueryDeviceBinaryEXT,
            caps.eglQueryDeviceAttribEXT,
            caps.eglQueryDeviceStringEXT,
            caps.eglQueryDisplayAttribEXT,
            caps.eglDestroyDisplayEXT,
            caps.eglQueryDmaBufFormatsEXT,
            caps.eglQueryDmaBufModifiersEXT,
            caps.eglGetOutputLayersEXT,
            caps.eglGetOutputPortsEXT,
            caps.eglOutputLayerAttribEXT,
            caps.eglQueryOutputLayerAttribEXT,
            caps.eglQueryOutputLayerStringEXT,
            caps.eglOutputPortAttribEXT,
            caps.eglQueryOutputPortAttribEXT,
            caps.eglQueryOutputPortStringEXT,
            caps.eglGetPlatformDisplayEXT,
            caps.eglCreatePlatformWindowSurfaceEXT,
            caps.eglCreatePlatformPixmapSurfaceEXT,
            caps.eglStreamConsumerOutputEXT,
            caps.eglQuerySupportedCompressionRatesEXT,
            caps.eglSwapBuffersWithDamageEXT,
            caps.eglUnsignalSyncEXT,
            caps.eglCreatePixmapSurfaceHI,
            caps.eglCreateSync64KHR,
            caps.eglDebugMessageControlKHR,
            caps.eglQueryDebugKHR,
            caps.eglLabelObjectKHR,
            caps.eglQueryDisplayAttribKHR,
            caps.eglCreateImageKHR,
            caps.eglDestroyImageKHR,
            caps.eglLockSurfaceKHR,
            caps.eglUnlockSurfaceKHR,
            caps.eglQuerySurface64KHR,
            caps.eglSetDamageRegionKHR,
            caps.eglCreateSyncKHR,
            caps.eglDestroySyncKHR,
            caps.eglClientWaitSyncKHR,
            caps.eglSignalSyncKHR,
            caps.eglGetSyncAttribKHR,
            caps.eglCreateStreamKHR,
            caps.eglDestroyStreamKHR,
            caps.eglStreamAttribKHR,
            caps.eglQueryStreamKHR,
            caps.eglQueryStreamu64KHR,
            caps.eglCreateStreamAttribKHR,
            caps.eglSetStreamAttribKHR,
            caps.eglQueryStreamAttribKHR,
            caps.eglStreamConsumerAcquireAttribKHR,
            caps.eglStreamConsumerReleaseAttribKHR,
            caps.eglStreamConsumerGLTextureExternalKHR,
            caps.eglStreamConsumerAcquireKHR,
            caps.eglStreamConsumerReleaseKHR,
            caps.eglGetStreamFileDescriptorKHR,
            caps.eglCreateStreamFromFileDescriptorKHR,
            caps.eglQueryStreamTimeKHR,
            caps.eglCreateStreamProducerSurfaceKHR,
            caps.eglSwapBuffersWithDamageKHR,
            caps.eglWaitSyncKHR,
            caps.eglCreateDRMImageMESA,
            caps.eglExportDRMImageMESA,
            caps.eglExportDMABUFImageQueryMESA,
            caps.eglExportDMABUFImageMESA,
            caps.eglSwapBuffersRegion2NOK,
            caps.eglQueryNativeDisplayNV,
            caps.eglQueryNativeWindowNV,
            caps.eglQueryNativePixmapNV,
            caps.eglPostSubBufferNV,
            caps.eglStreamImageConsumerConnectNV,
            caps.eglQueryStreamConsumerEventNV,
            caps.eglStreamAcquireImageNV,
            caps.eglStreamReleaseImageNV,
            caps.eglStreamConsumerGLTextureExternalAttribsNV,
            caps.eglStreamFlushNV,
            caps.eglQueryDisplayAttribNV,
            caps.eglSetStreamMetadataNV,
            caps.eglQueryStreamMetadataNV,
            caps.eglResetStreamNV,
            caps.eglCreateStreamSyncNV,
            caps.eglCreateFenceSyncNV,
            caps.eglDestroySyncNV,
            caps.eglFenceNV,
            caps.eglClientWaitSyncNV,
            caps.eglSignalSyncNV,
            caps.eglGetSyncAttribNV,
            caps.eglGetSystemTimeFrequencyNV,
            caps.eglGetSystemTimeNV,
            caps.eglBindWaylandDisplayWL,
            caps.eglUnbindWaylandDisplayWL,
            caps.eglQueryWaylandBufferWL,
            caps.eglCreateWaylandBufferFromImageWL
        );
    }

    private EGLCapabilities(Set<String> ext, long... functions) {
        eglChooseConfig = functions[0];
        eglCopyBuffers = functions[1];
        eglCreateContext = functions[2];
        eglCreatePbufferSurface = functions[3];
        eglCreatePixmapSurface = functions[4];
        eglCreateWindowSurface = functions[5];
        eglDestroyContext = functions[6];
        eglDestroySurface = functions[7];
        eglGetConfigAttrib = functions[8];
        eglGetConfigs = functions[9];
        eglGetCurrentDisplay = functions[10];
        eglGetCurrentSurface = functions[11];
        eglGetDisplay = functions[12];
        eglGetError = functions[13];
        eglGetProcAddress = functions[14];
        eglInitialize = functions[15];
        eglMakeCurrent = functions[16];
        eglQueryContext = functions[17];
        eglQueryString = functions[18];
        eglQuerySurface = functions[19];
        eglSwapBuffers = functions[20];
        eglTerminate = functions[21];
        eglWaitGL = functions[22];
        eglWaitNative = functions[23];
        eglBindTexImage = functions[24];
        eglReleaseTexImage = functions[25];
        eglSurfaceAttrib = functions[26];
        eglSwapInterval = functions[27];
        eglBindAPI = functions[28];
        eglQueryAPI = functions[29];
        eglCreatePbufferFromClientBuffer = functions[30];
        eglReleaseThread = functions[31];
        eglWaitClient = functions[32];
        eglGetCurrentContext = functions[33];
        eglCreateSync = functions[34];
        eglDestroySync = functions[35];
        eglClientWaitSync = functions[36];
        eglGetSyncAttrib = functions[37];
        eglCreateImage = functions[38];
        eglDestroyImage = functions[39];
        eglGetPlatformDisplay = functions[40];
        eglCreatePlatformWindowSurface = functions[41];
        eglCreatePlatformPixmapSurface = functions[42];
        eglWaitSync = functions[43];
        eglSetBlobCacheFuncsANDROID = functions[44];
        eglCreateNativeClientBufferANDROID = functions[45];
        eglDupNativeFenceFDANDROID = functions[46];
        eglPresentationTimeANDROID = functions[47];
        eglQuerySurfacePointerANGLE = functions[48];
        eglGetMscRateANGLE = functions[49];
        eglClientSignalSyncEXT = functions[50];
        eglCompositorSetContextListEXT = functions[51];
        eglCompositorSetContextAttributesEXT = functions[52];
        eglCompositorSetWindowListEXT = functions[53];
        eglCompositorSetWindowAttributesEXT = functions[54];
        eglCompositorBindTexWindowEXT = functions[55];
        eglCompositorSetSizeEXT = functions[56];
        eglCompositorSwapPolicyEXT = functions[57];
        eglQueryDevicesEXT = functions[58];
        eglQueryDeviceBinaryEXT = functions[59];
        eglQueryDeviceAttribEXT = functions[60];
        eglQueryDeviceStringEXT = functions[61];
        eglQueryDisplayAttribEXT = functions[62];
        eglDestroyDisplayEXT = functions[63];
        eglQueryDmaBufFormatsEXT = functions[64];
        eglQueryDmaBufModifiersEXT = functions[65];
        eglGetOutputLayersEXT = functions[66];
        eglGetOutputPortsEXT = functions[67];
        eglOutputLayerAttribEXT = functions[68];
        eglQueryOutputLayerAttribEXT = functions[69];
        eglQueryOutputLayerStringEXT = functions[70];
        eglOutputPortAttribEXT = functions[71];
        eglQueryOutputPortAttribEXT = functions[72];
        eglQueryOutputPortStringEXT = functions[73];
        eglGetPlatformDisplayEXT = functions[74];
        eglCreatePlatformWindowSurfaceEXT = functions[75];
        eglCreatePlatformPixmapSurfaceEXT = functions[76];
        eglStreamConsumerOutputEXT = functions[77];
        eglQuerySupportedCompressionRatesEXT = functions[78];
        eglSwapBuffersWithDamageEXT = functions[79];
        eglUnsignalSyncEXT = functions[80];
        eglCreatePixmapSurfaceHI = functions[81];
        eglCreateSync64KHR = functions[82];
        eglDebugMessageControlKHR = functions[83];
        eglQueryDebugKHR = functions[84];
        eglLabelObjectKHR = functions[85];
        eglQueryDisplayAttribKHR = functions[86];
        eglCreateImageKHR = functions[87];
        eglDestroyImageKHR = functions[88];
        eglLockSurfaceKHR = functions[89];
        eglUnlockSurfaceKHR = functions[90];
        eglQuerySurface64KHR = functions[91];
        eglSetDamageRegionKHR = functions[92];
        eglCreateSyncKHR = functions[93];
        eglDestroySyncKHR = functions[94];
        eglClientWaitSyncKHR = functions[95];
        eglSignalSyncKHR = functions[96];
        eglGetSyncAttribKHR = functions[97];
        eglCreateStreamKHR = functions[98];
        eglDestroyStreamKHR = functions[99];
        eglStreamAttribKHR = functions[100];
        eglQueryStreamKHR = functions[101];
        eglQueryStreamu64KHR = functions[102];
        eglCreateStreamAttribKHR = functions[103];
        eglSetStreamAttribKHR = functions[104];
        eglQueryStreamAttribKHR = functions[105];
        eglStreamConsumerAcquireAttribKHR = functions[106];
        eglStreamConsumerReleaseAttribKHR = functions[107];
        eglStreamConsumerGLTextureExternalKHR = functions[108];
        eglStreamConsumerAcquireKHR = functions[109];
        eglStreamConsumerReleaseKHR = functions[110];
        eglGetStreamFileDescriptorKHR = functions[111];
        eglCreateStreamFromFileDescriptorKHR = functions[112];
        eglQueryStreamTimeKHR = functions[113];
        eglCreateStreamProducerSurfaceKHR = functions[114];
        eglSwapBuffersWithDamageKHR = functions[115];
        eglWaitSyncKHR = functions[116];
        eglCreateDRMImageMESA = functions[117];
        eglExportDRMImageMESA = functions[118];
        eglExportDMABUFImageQueryMESA = functions[119];
        eglExportDMABUFImageMESA = functions[120];
        eglSwapBuffersRegion2NOK = functions[121];
        eglQueryNativeDisplayNV = functions[122];
        eglQueryNativeWindowNV = functions[123];
        eglQueryNativePixmapNV = functions[124];
        eglPostSubBufferNV = functions[125];
        eglStreamImageConsumerConnectNV = functions[126];
        eglQueryStreamConsumerEventNV = functions[127];
        eglStreamAcquireImageNV = functions[128];
        eglStreamReleaseImageNV = functions[129];
        eglStreamConsumerGLTextureExternalAttribsNV = functions[130];
        eglStreamFlushNV = functions[131];
        eglQueryDisplayAttribNV = functions[132];
        eglSetStreamMetadataNV = functions[133];
        eglQueryStreamMetadataNV = functions[134];
        eglResetStreamNV = functions[135];
        eglCreateStreamSyncNV = functions[136];
        eglCreateFenceSyncNV = functions[137];
        eglDestroySyncNV = functions[138];
        eglFenceNV = functions[139];
        eglClientWaitSyncNV = functions[140];
        eglSignalSyncNV = functions[141];
        eglGetSyncAttribNV = functions[142];
        eglGetSystemTimeFrequencyNV = functions[143];
        eglGetSystemTimeNV = functions[144];
        eglBindWaylandDisplayWL = functions[145];
        eglUnbindWaylandDisplayWL = functions[146];
        eglQueryWaylandBufferWL = functions[147];
        eglCreateWaylandBufferFromImageWL = functions[148];

        EGL10 = check_EGL10(ext);
        EGL11 = check_EGL11(ext);
        EGL12 = check_EGL12(ext);
        EGL13 = ext.contains("EGL13");
        EGL14 = check_EGL14(ext);
        EGL15 = check_EGL15(ext);
        EGL_ANDROID_blob_cache = check_ANDROID_blob_cache(ext);
        EGL_ANDROID_create_native_client_buffer = check_ANDROID_create_native_client_buffer(ext);
        EGL_ANDROID_framebuffer_target = ext.contains("EGL_ANDROID_framebuffer_target");
        EGL_ANDROID_front_buffer_auto_refresh = ext.contains("EGL_ANDROID_front_buffer_auto_refresh");
        EGL_ANDROID_image_native_buffer = ext.contains("EGL_ANDROID_image_native_buffer");
        EGL_ANDROID_native_fence_sync = check_ANDROID_native_fence_sync(ext);
        EGL_ANDROID_presentation_time = check_ANDROID_presentation_time(ext);
        EGL_ANDROID_recordable = ext.contains("EGL_ANDROID_recordable");
        EGL_ANGLE_d3d_share_handle_client_buffer = ext.contains("EGL_ANGLE_d3d_share_handle_client_buffer");
        EGL_ANGLE_device_d3d = ext.contains("EGL_ANGLE_device_d3d");
        EGL_ANGLE_query_surface_pointer = check_ANGLE_query_surface_pointer(ext);
        EGL_ANGLE_surface_d3d_texture_2d_share_handle = ext.contains("EGL_ANGLE_surface_d3d_texture_2d_share_handle");
        EGL_ANGLE_sync_control_rate = check_ANGLE_sync_control_rate(ext);
        EGL_ANGLE_window_fixed_size = ext.contains("EGL_ANGLE_window_fixed_size");
        EGL_ARM_image_format = ext.contains("EGL_ARM_image_format");
        EGL_ARM_pixmap_multisample_discard = ext.contains("EGL_ARM_pixmap_multisample_discard");
        EGL_EXT_bind_to_front = ext.contains("EGL_EXT_bind_to_front");
        EGL_EXT_buffer_age = ext.contains("EGL_EXT_buffer_age");
        EGL_EXT_client_extensions = ext.contains("EGL_EXT_client_extensions");
        EGL_EXT_client_sync = check_EXT_client_sync(ext);
        EGL_EXT_compositor = check_EXT_compositor(ext);
        EGL_EXT_config_select_group = ext.contains("EGL_EXT_config_select_group");
        EGL_EXT_create_context_robustness = ext.contains("EGL_EXT_create_context_robustness");
        EGL_EXT_device_base = check_EXT_device_base(ext);
        EGL_EXT_device_drm = ext.contains("EGL_EXT_device_drm");
        EGL_EXT_device_drm_render_node = ext.contains("EGL_EXT_device_drm_render_node");
        EGL_EXT_device_enumeration = check_EXT_device_enumeration(ext);
        EGL_EXT_device_openwf = ext.contains("EGL_EXT_device_openwf");
        EGL_EXT_device_persistent_id = check_EXT_device_persistent_id(ext);
        EGL_EXT_device_query = check_EXT_device_query(ext);
        EGL_EXT_device_query_name = ext.contains("EGL_EXT_device_query_name");
        EGL_EXT_display_alloc = check_EXT_display_alloc(ext);
        EGL_EXT_explicit_device = ext.contains("EGL_EXT_explicit_device");
        EGL_EXT_gl_colorspace_bt2020_hlg = ext.contains("EGL_EXT_gl_colorspace_bt2020_hlg");
        EGL_EXT_gl_colorspace_bt2020_linear = ext.contains("EGL_EXT_gl_colorspace_bt2020_linear");
        EGL_EXT_gl_colorspace_bt2020_pq = ext.contains("EGL_EXT_gl_colorspace_bt2020_pq");
        EGL_EXT_gl_colorspace_display_p3 = ext.contains("EGL_EXT_gl_colorspace_display_p3");
        EGL_EXT_gl_colorspace_display_p3_linear = ext.contains("EGL_EXT_gl_colorspace_display_p3_linear");
        EGL_EXT_gl_colorspace_display_p3_passthrough = ext.contains("EGL_EXT_gl_colorspace_display_p3_passthrough");
        EGL_EXT_gl_colorspace_scrgb = ext.contains("EGL_EXT_gl_colorspace_scrgb");
        EGL_EXT_gl_colorspace_scrgb_linear = ext.contains("EGL_EXT_gl_colorspace_scrgb_linear");
        EGL_EXT_image_dma_buf_import = ext.contains("EGL_EXT_image_dma_buf_import");
        EGL_EXT_image_dma_buf_import_modifiers = check_EXT_image_dma_buf_import_modifiers(ext);
        EGL_EXT_image_gl_colorspace = ext.contains("EGL_EXT_image_gl_colorspace");
        EGL_EXT_image_implicit_sync_control = ext.contains("EGL_EXT_image_implicit_sync_control");
        EGL_EXT_multiview_window = ext.contains("EGL_EXT_multiview_window");
        EGL_EXT_output_base = check_EXT_output_base(ext);
        EGL_EXT_output_drm = ext.contains("EGL_EXT_output_drm");
        EGL_EXT_output_openwf = ext.contains("EGL_EXT_output_openwf");
        EGL_EXT_pixel_format_float = ext.contains("EGL_EXT_pixel_format_float");
        EGL_EXT_platform_base = check_EXT_platform_base(ext);
        EGL_EXT_platform_device = ext.contains("EGL_EXT_platform_device");
        EGL_EXT_platform_wayland = ext.contains("EGL_EXT_platform_wayland");
        EGL_EXT_platform_x11 = ext.contains("EGL_EXT_platform_x11");
        EGL_EXT_platform_xcb = ext.contains("EGL_EXT_platform_xcb");
        EGL_EXT_present_opaque = ext.contains("EGL_EXT_present_opaque");
        EGL_EXT_protected_content = ext.contains("EGL_EXT_protected_content");
        EGL_EXT_protected_surface = ext.contains("EGL_EXT_protected_surface");
        EGL_EXT_query_reset_notification_strategy = ext.contains("EGL_EXT_query_reset_notification_strategy");
        EGL_EXT_stream_consumer_egloutput = check_EXT_stream_consumer_egloutput(ext);
        EGL_EXT_surface_compression = check_EXT_surface_compression(ext);
        EGL_EXT_surface_CTA861_3_metadata = ext.contains("EGL_EXT_surface_CTA861_3_metadata");
        EGL_EXT_surface_SMPTE2086_metadata = ext.contains("EGL_EXT_surface_SMPTE2086_metadata");
        EGL_EXT_swap_buffers_with_damage = check_EXT_swap_buffers_with_damage(ext);
        EGL_EXT_sync_reuse = check_EXT_sync_reuse(ext);
        EGL_EXT_yuv_surface = ext.contains("EGL_EXT_yuv_surface");
        EGL_HI_clientpixmap = check_HI_clientpixmap(ext);
        EGL_HI_colorformats = ext.contains("EGL_HI_colorformats");
        EGL_IMG_context_priority = ext.contains("EGL_IMG_context_priority");
        EGL_IMG_image_plane_attribs = ext.contains("EGL_IMG_image_plane_attribs");
        EGL_KHR_cl_event2 = check_KHR_cl_event2(ext);
        EGL_KHR_client_get_all_proc_addresses = ext.contains("EGL_KHR_client_get_all_proc_addresses");
        EGL_KHR_config_attribs = ext.contains("EGL_KHR_config_attribs");
        EGL_KHR_context_flush_control = ext.contains("EGL_KHR_context_flush_control");
        EGL_KHR_create_context = ext.contains("EGL_KHR_create_context");
        EGL_KHR_create_context_no_error = ext.contains("EGL_KHR_create_context_no_error");
        EGL_KHR_debug = check_KHR_debug(ext);
        EGL_KHR_display_reference = check_KHR_display_reference(ext);
        EGL_KHR_fence_sync = check_KHR_fence_sync(ext);
        EGL_KHR_get_all_proc_addresses = ext.contains("EGL_KHR_get_all_proc_addresses");
        EGL_KHR_gl_colorspace = ext.contains("EGL_KHR_gl_colorspace");
        EGL_KHR_gl_renderbuffer_image = ext.contains("EGL_KHR_gl_renderbuffer_image");
        EGL_KHR_gl_texture_2D_image = ext.contains("EGL_KHR_gl_texture_2D_image");
        EGL_KHR_gl_texture_3D_image = ext.contains("EGL_KHR_gl_texture_3D_image");
        EGL_KHR_gl_texture_cubemap_image = ext.contains("EGL_KHR_gl_texture_cubemap_image");
        EGL_KHR_image = check_KHR_image(ext);
        EGL_KHR_image_base = check_KHR_image_base(ext);
        EGL_KHR_image_pixmap = ext.contains("EGL_KHR_image_pixmap");
        EGL_KHR_lock_surface3 = check_KHR_lock_surface3(ext);
        EGL_KHR_mutable_render_buffer = ext.contains("EGL_KHR_mutable_render_buffer");
        EGL_KHR_no_config_context = ext.contains("EGL_KHR_no_config_context");
        EGL_KHR_partial_update = check_KHR_partial_update(ext);
        EGL_KHR_platform_android = ext.contains("EGL_KHR_platform_android");
        EGL_KHR_platform_gbm = ext.contains("EGL_KHR_platform_gbm");
        EGL_KHR_platform_wayland = ext.contains("EGL_KHR_platform_wayland");
        EGL_KHR_platform_x11 = ext.contains("EGL_KHR_platform_x11");
        EGL_KHR_reusable_sync = check_KHR_reusable_sync(ext);
        EGL_KHR_stream = check_KHR_stream(ext);
        EGL_KHR_stream_attrib = check_KHR_stream_attrib(ext);
        EGL_KHR_stream_consumer_gltexture = check_KHR_stream_consumer_gltexture(ext);
        EGL_KHR_stream_cross_process_fd = check_KHR_stream_cross_process_fd(ext);
        EGL_KHR_stream_fifo = check_KHR_stream_fifo(ext);
        EGL_KHR_stream_producer_aldatalocator = ext.contains("EGL_KHR_stream_producer_aldatalocator");
        EGL_KHR_stream_producer_eglsurface = check_KHR_stream_producer_eglsurface(ext);
        EGL_KHR_surfaceless_context = ext.contains("EGL_KHR_surfaceless_context");
        EGL_KHR_swap_buffers_with_damage = check_KHR_swap_buffers_with_damage(ext);
        EGL_KHR_vg_parent_image = ext.contains("EGL_KHR_vg_parent_image");
        EGL_KHR_wait_sync = check_KHR_wait_sync(ext);
        EGL_MESA_drm_image = check_MESA_drm_image(ext);
        EGL_MESA_image_dma_buf_export = check_MESA_image_dma_buf_export(ext);
        EGL_MESA_platform_gbm = ext.contains("EGL_MESA_platform_gbm");
        EGL_NOK_swap_region2 = check_NOK_swap_region2(ext);
        EGL_NOK_texture_from_pixmap = ext.contains("EGL_NOK_texture_from_pixmap");
        EGL_NV_3dvision_surface = ext.contains("EGL_NV_3dvision_surface");
        EGL_NV_context_priority_realtime = ext.contains("EGL_NV_context_priority_realtime");
        EGL_NV_coverage_sample = ext.contains("EGL_NV_coverage_sample");
        EGL_NV_coverage_sample_resolve = ext.contains("EGL_NV_coverage_sample_resolve");
        EGL_NV_cuda_event = ext.contains("EGL_NV_cuda_event");
        EGL_NV_depth_nonlinear = ext.contains("EGL_NV_depth_nonlinear");
        EGL_NV_device_cuda = ext.contains("EGL_NV_device_cuda");
        EGL_NV_native_query = check_NV_native_query(ext);
        EGL_NV_post_convert_rounding = ext.contains("EGL_NV_post_convert_rounding");
        EGL_NV_post_sub_buffer = check_NV_post_sub_buffer(ext);
        EGL_NV_quadruple_buffer = ext.contains("EGL_NV_quadruple_buffer");
        EGL_NV_robustness_video_memory_purge = ext.contains("EGL_NV_robustness_video_memory_purge");
        EGL_NV_stream_consumer_eglimage = check_NV_stream_consumer_eglimage(ext);
        EGL_NV_stream_consumer_eglimage_use_scanout_attrib = ext.contains("EGL_NV_stream_consumer_eglimage_use_scanout_attrib");
        EGL_NV_stream_consumer_gltexture_yuv = check_NV_stream_consumer_gltexture_yuv(ext);
        EGL_NV_stream_cross_display = ext.contains("EGL_NV_stream_cross_display");
        EGL_NV_stream_cross_object = ext.contains("EGL_NV_stream_cross_object");
        EGL_NV_stream_cross_partition = ext.contains("EGL_NV_stream_cross_partition");
        EGL_NV_stream_cross_process = ext.contains("EGL_NV_stream_cross_process");
        EGL_NV_stream_cross_system = ext.contains("EGL_NV_stream_cross_system");
        EGL_NV_stream_dma = ext.contains("EGL_NV_stream_dma");
        EGL_NV_stream_fifo_next = ext.contains("EGL_NV_stream_fifo_next");
        EGL_NV_stream_fifo_synchronous = ext.contains("EGL_NV_stream_fifo_synchronous");
        EGL_NV_stream_flush = check_NV_stream_flush(ext);
        EGL_NV_stream_frame_limits = ext.contains("EGL_NV_stream_frame_limits");
        EGL_NV_stream_metadata = check_NV_stream_metadata(ext);
        EGL_NV_stream_remote = ext.contains("EGL_NV_stream_remote");
        EGL_NV_stream_reset = check_NV_stream_reset(ext);
        EGL_NV_stream_socket = ext.contains("EGL_NV_stream_socket");
        EGL_NV_stream_socket_inet = ext.contains("EGL_NV_stream_socket_inet");
        EGL_NV_stream_socket_unix = ext.contains("EGL_NV_stream_socket_unix");
        EGL_NV_stream_sync = check_NV_stream_sync(ext);
        EGL_NV_sync = check_NV_sync(ext);
        EGL_NV_system_time = check_NV_system_time(ext);
        EGL_NV_triple_buffer = ext.contains("EGL_NV_triple_buffer");
        EGL_TIZEN_image_native_buffer = ext.contains("EGL_TIZEN_image_native_buffer");
        EGL_TIZEN_image_native_surface = ext.contains("EGL_TIZEN_image_native_surface");
        EGL_WL_bind_wayland_display = check_WL_bind_wayland_display(ext);
        EGL_WL_create_wayland_buffer_from_image = check_WL_create_wayland_buffer_from_image(ext);
    }

    private static boolean checkExtension(String extension, boolean supported) {
        if (supported) {
            return true;
        }

        apiLog("[EGL] " + extension + " was reported as available but an entry point is missing.");
        return false;
    }

    private boolean check_EGL10(Set<String> ext) {
        return ext.contains("EGL10") && checkExtension("EGL10", checkFunctions(
            eglChooseConfig, eglCopyBuffers, eglCreateContext, eglCreatePbufferSurface, eglCreatePixmapSurface, eglCreateWindowSurface, eglDestroyContext, 
            eglDestroySurface, eglGetConfigAttrib, eglGetConfigs, eglGetCurrentDisplay, eglGetCurrentSurface, eglGetDisplay, eglGetError, eglGetProcAddress, 
            eglInitialize, eglMakeCurrent, eglQueryContext, eglQueryString, eglQuerySurface, eglSwapBuffers, eglTerminate, eglWaitGL, eglWaitNative
        ));
    }

    private boolean check_EGL11(Set<String> ext) {
        return ext.contains("EGL11") && checkExtension("EGL11", checkFunctions(
            eglBindTexImage, eglReleaseTexImage, eglSurfaceAttrib, eglSwapInterval
        ));
    }

    private boolean check_EGL12(Set<String> ext) {
        return ext.contains("EGL12") && checkExtension("EGL12", checkFunctions(
            eglBindAPI, eglQueryAPI, eglCreatePbufferFromClientBuffer, eglReleaseThread, eglWaitClient
        ));
    }

    private boolean check_EGL14(Set<String> ext) {
        return ext.contains("EGL14") && checkExtension("EGL14", checkFunctions(
            eglGetCurrentContext
        ));
    }

    private boolean check_EGL15(Set<String> ext) {
        return ext.contains("EGL15") && checkExtension("EGL15", checkFunctions(
            eglCreateSync, eglDestroySync, eglClientWaitSync, eglGetSyncAttrib, eglCreateImage, eglDestroyImage, eglGetPlatformDisplay, 
            eglCreatePlatformWindowSurface, eglCreatePlatformPixmapSurface, eglWaitSync
        ));
    }

    private boolean check_ANDROID_blob_cache(Set<String> ext) {
        return ext.contains("EGL_ANDROID_blob_cache") && checkExtension("EGL_ANDROID_blob_cache", checkFunctions(
            eglSetBlobCacheFuncsANDROID
        ));
    }

    private boolean check_ANDROID_create_native_client_buffer(Set<String> ext) {
        return ext.contains("EGL_ANDROID_create_native_client_buffer") && checkExtension("EGL_ANDROID_create_native_client_buffer", checkFunctions(
            eglCreateNativeClientBufferANDROID
        ));
    }

    private boolean check_ANDROID_native_fence_sync(Set<String> ext) {
        return ext.contains("EGL_ANDROID_native_fence_sync") && checkExtension("EGL_ANDROID_native_fence_sync", checkFunctions(
            eglDupNativeFenceFDANDROID
        ));
    }

    private boolean check_ANDROID_presentation_time(Set<String> ext) {
        return ext.contains("EGL_ANDROID_presentation_time") && checkExtension("EGL_ANDROID_presentation_time", checkFunctions(
            eglPresentationTimeANDROID
        ));
    }

    private boolean check_ANGLE_query_surface_pointer(Set<String> ext) {
        return ext.contains("EGL_ANGLE_query_surface_pointer") && checkExtension("EGL_ANGLE_query_surface_pointer", checkFunctions(
            eglQuerySurfacePointerANGLE
        ));
    }

    private boolean check_ANGLE_sync_control_rate(Set<String> ext) {
        return ext.contains("EGL_ANGLE_sync_control_rate") && checkExtension("EGL_ANGLE_sync_control_rate", checkFunctions(
            eglGetMscRateANGLE
        ));
    }

    private boolean check_EXT_client_sync(Set<String> ext) {
        return ext.contains("EGL_EXT_client_sync") && checkExtension("EGL_EXT_client_sync", checkFunctions(
            eglClientSignalSyncEXT
        ));
    }

    private boolean check_EXT_compositor(Set<String> ext) {
        return ext.contains("EGL_EXT_compositor") && checkExtension("EGL_EXT_compositor", checkFunctions(
            eglCompositorSetContextListEXT, eglCompositorSetContextAttributesEXT, eglCompositorSetWindowListEXT, eglCompositorSetWindowAttributesEXT, 
            eglCompositorBindTexWindowEXT, eglCompositorSetSizeEXT, eglCompositorSwapPolicyEXT
        ));
    }

    private boolean check_EXT_device_base(Set<String> ext) {
        return ext.contains("EGL_EXT_device_base") && checkExtension("EGL_EXT_device_base", checkFunctions(
            eglQueryDeviceAttribEXT, eglQueryDeviceStringEXT, eglQueryDisplayAttribEXT, eglQueryDevicesEXT
        ));
    }

    private boolean check_EXT_device_enumeration(Set<String> ext) {
        return ext.contains("EGL_EXT_device_enumeration") && checkExtension("EGL_EXT_device_enumeration", checkFunctions(
            eglQueryDevicesEXT
        ));
    }

    private boolean check_EXT_device_persistent_id(Set<String> ext) {
        return ext.contains("EGL_EXT_device_persistent_id") && checkExtension("EGL_EXT_device_persistent_id", checkFunctions(
            eglQueryDeviceBinaryEXT
        ));
    }

    private boolean check_EXT_device_query(Set<String> ext) {
        return ext.contains("EGL_EXT_device_query") && checkExtension("EGL_EXT_device_query", checkFunctions(
            eglQueryDeviceAttribEXT, eglQueryDeviceStringEXT, eglQueryDisplayAttribEXT
        ));
    }

    private boolean check_EXT_display_alloc(Set<String> ext) {
        return ext.contains("EGL_EXT_display_alloc") && checkExtension("EGL_EXT_display_alloc", checkFunctions(
            eglDestroyDisplayEXT
        ));
    }

    private boolean check_EXT_image_dma_buf_import_modifiers(Set<String> ext) {
        return ext.contains("EGL_EXT_image_dma_buf_import_modifiers") && checkExtension("EGL_EXT_image_dma_buf_import_modifiers", checkFunctions(
            eglQueryDmaBufFormatsEXT, eglQueryDmaBufModifiersEXT
        ));
    }

    private boolean check_EXT_output_base(Set<String> ext) {
        return ext.contains("EGL_EXT_output_base") && checkExtension("EGL_EXT_output_base", checkFunctions(
            eglGetOutputLayersEXT, eglGetOutputPortsEXT, eglOutputLayerAttribEXT, eglQueryOutputLayerAttribEXT, eglQueryOutputLayerStringEXT, 
            eglOutputPortAttribEXT, eglQueryOutputPortAttribEXT, eglQueryOutputPortStringEXT
        ));
    }

    private boolean check_EXT_platform_base(Set<String> ext) {
        return ext.contains("EGL_EXT_platform_base") && checkExtension("EGL_EXT_platform_base", checkFunctions(
            eglGetPlatformDisplayEXT, eglCreatePlatformWindowSurfaceEXT, eglCreatePlatformPixmapSurfaceEXT
        ));
    }

    private boolean check_EXT_stream_consumer_egloutput(Set<String> ext) {
        return ext.contains("EGL_EXT_stream_consumer_egloutput") && checkExtension("EGL_EXT_stream_consumer_egloutput", checkFunctions(
            eglStreamConsumerOutputEXT
        ));
    }

    private boolean check_EXT_surface_compression(Set<String> ext) {
        return ext.contains("EGL_EXT_surface_compression") && checkExtension("EGL_EXT_surface_compression", checkFunctions(
            eglQuerySupportedCompressionRatesEXT
        ));
    }

    private boolean check_EXT_swap_buffers_with_damage(Set<String> ext) {
        return ext.contains("EGL_EXT_swap_buffers_with_damage") && checkExtension("EGL_EXT_swap_buffers_with_damage", checkFunctions(
            eglSwapBuffersWithDamageEXT
        ));
    }

    private boolean check_EXT_sync_reuse(Set<String> ext) {
        return ext.contains("EGL_EXT_sync_reuse") && checkExtension("EGL_EXT_sync_reuse", checkFunctions(
            eglUnsignalSyncEXT
        ));
    }

    private boolean check_HI_clientpixmap(Set<String> ext) {
        return ext.contains("EGL_HI_clientpixmap") && checkExtension("EGL_HI_clientpixmap", checkFunctions(
            eglCreatePixmapSurfaceHI
        ));
    }

    private boolean check_KHR_cl_event2(Set<String> ext) {
        return ext.contains("EGL_KHR_cl_event2") && checkExtension("EGL_KHR_cl_event2", checkFunctions(
            eglCreateSync64KHR
        ));
    }

    private boolean check_KHR_debug(Set<String> ext) {
        return ext.contains("EGL_KHR_debug") && checkExtension("EGL_KHR_debug", checkFunctions(
            eglDebugMessageControlKHR, eglQueryDebugKHR, eglLabelObjectKHR
        ));
    }

    private boolean check_KHR_display_reference(Set<String> ext) {
        return ext.contains("EGL_KHR_display_reference") && checkExtension("EGL_KHR_display_reference", checkFunctions(
            eglQueryDisplayAttribKHR
        ));
    }

    private boolean check_KHR_fence_sync(Set<String> ext) {
        return ext.contains("EGL_KHR_fence_sync") && checkExtension("EGL_KHR_fence_sync", checkFunctions(
            eglCreateSyncKHR, eglDestroySyncKHR, eglClientWaitSyncKHR, eglGetSyncAttribKHR
        ));
    }

    private boolean check_KHR_image(Set<String> ext) {
        return ext.contains("EGL_KHR_image") && checkExtension("EGL_KHR_image", checkFunctions(
            eglCreateImageKHR, eglDestroyImageKHR
        ));
    }

    private boolean check_KHR_image_base(Set<String> ext) {
        return ext.contains("EGL_KHR_image_base") && checkExtension("EGL_KHR_image_base", checkFunctions(
            eglCreateImageKHR, eglDestroyImageKHR
        ));
    }

    private boolean check_KHR_lock_surface3(Set<String> ext) {
        return ext.contains("EGL_KHR_lock_surface3") && checkExtension("EGL_KHR_lock_surface3", checkFunctions(
            eglLockSurfaceKHR, eglUnlockSurfaceKHR, eglQuerySurface64KHR
        ));
    }

    private boolean check_KHR_partial_update(Set<String> ext) {
        return ext.contains("EGL_KHR_partial_update") && checkExtension("EGL_KHR_partial_update", checkFunctions(
            eglSetDamageRegionKHR
        ));
    }

    private boolean check_KHR_reusable_sync(Set<String> ext) {
        return ext.contains("EGL_KHR_reusable_sync") && checkExtension("EGL_KHR_reusable_sync", checkFunctions(
            eglCreateSyncKHR, eglDestroySyncKHR, eglClientWaitSyncKHR, eglSignalSyncKHR, eglGetSyncAttribKHR
        ));
    }

    private boolean check_KHR_stream(Set<String> ext) {
        return ext.contains("EGL_KHR_stream") && checkExtension("EGL_KHR_stream", checkFunctions(
            eglCreateStreamKHR, eglDestroyStreamKHR, eglStreamAttribKHR, eglQueryStreamKHR, eglQueryStreamu64KHR
        ));
    }

    private boolean check_KHR_stream_attrib(Set<String> ext) {
        return ext.contains("EGL_KHR_stream_attrib") && checkExtension("EGL_KHR_stream_attrib", checkFunctions(
            eglCreateStreamAttribKHR, eglSetStreamAttribKHR, eglQueryStreamAttribKHR, eglStreamConsumerAcquireAttribKHR, eglStreamConsumerReleaseAttribKHR
        ));
    }

    private boolean check_KHR_stream_consumer_gltexture(Set<String> ext) {
        return ext.contains("EGL_KHR_stream_consumer_gltexture") && checkExtension("EGL_KHR_stream_consumer_gltexture", checkFunctions(
            eglStreamConsumerGLTextureExternalKHR, eglStreamConsumerAcquireKHR, eglStreamConsumerReleaseKHR
        ));
    }

    private boolean check_KHR_stream_cross_process_fd(Set<String> ext) {
        return ext.contains("EGL_KHR_stream_cross_process_fd") && checkExtension("EGL_KHR_stream_cross_process_fd", checkFunctions(
            eglGetStreamFileDescriptorKHR, eglCreateStreamFromFileDescriptorKHR
        ));
    }

    private boolean check_KHR_stream_fifo(Set<String> ext) {
        return ext.contains("EGL_KHR_stream_fifo") && checkExtension("EGL_KHR_stream_fifo", checkFunctions(
            eglQueryStreamTimeKHR
        ));
    }

    private boolean check_KHR_stream_producer_eglsurface(Set<String> ext) {
        return ext.contains("EGL_KHR_stream_producer_eglsurface") && checkExtension("EGL_KHR_stream_producer_eglsurface", checkFunctions(
            eglCreateStreamProducerSurfaceKHR
        ));
    }

    private boolean check_KHR_swap_buffers_with_damage(Set<String> ext) {
        return ext.contains("EGL_KHR_swap_buffers_with_damage") && checkExtension("EGL_KHR_swap_buffers_with_damage", checkFunctions(
            eglSwapBuffersWithDamageKHR
        ));
    }

    private boolean check_KHR_wait_sync(Set<String> ext) {
        return ext.contains("EGL_KHR_wait_sync") && checkExtension("EGL_KHR_wait_sync", checkFunctions(
            eglWaitSyncKHR
        ));
    }

    private boolean check_MESA_drm_image(Set<String> ext) {
        return ext.contains("EGL_MESA_drm_image") && checkExtension("EGL_MESA_drm_image", checkFunctions(
            eglCreateDRMImageMESA, eglExportDRMImageMESA
        ));
    }

    private boolean check_MESA_image_dma_buf_export(Set<String> ext) {
        return ext.contains("EGL_MESA_image_dma_buf_export") && checkExtension("EGL_MESA_image_dma_buf_export", checkFunctions(
            eglExportDMABUFImageQueryMESA, eglExportDMABUFImageMESA
        ));
    }

    private boolean check_NOK_swap_region2(Set<String> ext) {
        return ext.contains("EGL_NOK_swap_region2") && checkExtension("EGL_NOK_swap_region2", checkFunctions(
            eglSwapBuffersRegion2NOK
        ));
    }

    private boolean check_NV_native_query(Set<String> ext) {
        return ext.contains("EGL_NV_native_query") && checkExtension("EGL_NV_native_query", checkFunctions(
            eglQueryNativeDisplayNV, eglQueryNativeWindowNV, eglQueryNativePixmapNV
        ));
    }

    private boolean check_NV_post_sub_buffer(Set<String> ext) {
        return ext.contains("EGL_NV_post_sub_buffer") && checkExtension("EGL_NV_post_sub_buffer", checkFunctions(
            eglPostSubBufferNV
        ));
    }

    private boolean check_NV_stream_consumer_eglimage(Set<String> ext) {
        return ext.contains("EGL_NV_stream_consumer_eglimage") && checkExtension("EGL_NV_stream_consumer_eglimage", checkFunctions(
            eglStreamImageConsumerConnectNV, eglQueryStreamConsumerEventNV, eglStreamAcquireImageNV, eglStreamReleaseImageNV
        ));
    }

    private boolean check_NV_stream_consumer_gltexture_yuv(Set<String> ext) {
        return ext.contains("EGL_NV_stream_consumer_gltexture_yuv") && checkExtension("EGL_NV_stream_consumer_gltexture_yuv", checkFunctions(
            eglStreamConsumerGLTextureExternalAttribsNV
        ));
    }

    private boolean check_NV_stream_flush(Set<String> ext) {
        return ext.contains("EGL_NV_stream_flush") && checkExtension("EGL_NV_stream_flush", checkFunctions(
            eglStreamFlushNV
        ));
    }

    private boolean check_NV_stream_metadata(Set<String> ext) {
        return ext.contains("EGL_NV_stream_metadata") && checkExtension("EGL_NV_stream_metadata", checkFunctions(
            eglQueryDisplayAttribNV, eglSetStreamMetadataNV, eglQueryStreamMetadataNV
        ));
    }

    private boolean check_NV_stream_reset(Set<String> ext) {
        return ext.contains("EGL_NV_stream_reset") && checkExtension("EGL_NV_stream_reset", checkFunctions(
            eglResetStreamNV
        ));
    }

    private boolean check_NV_stream_sync(Set<String> ext) {
        return ext.contains("EGL_NV_stream_sync") && checkExtension("EGL_NV_stream_sync", checkFunctions(
            eglCreateStreamSyncNV
        ));
    }

    private boolean check_NV_sync(Set<String> ext) {
        return ext.contains("EGL_NV_sync") && checkExtension("EGL_NV_sync", checkFunctions(
            eglCreateFenceSyncNV, eglDestroySyncNV, eglFenceNV, eglClientWaitSyncNV, eglSignalSyncNV, eglGetSyncAttribNV
        ));
    }

    private boolean check_NV_system_time(Set<String> ext) {
        return ext.contains("EGL_NV_system_time") && checkExtension("EGL_NV_system_time", checkFunctions(
            eglGetSystemTimeFrequencyNV, eglGetSystemTimeNV
        ));
    }

    private boolean check_WL_bind_wayland_display(Set<String> ext) {
        return ext.contains("EGL_WL_bind_wayland_display") && checkExtension("EGL_WL_bind_wayland_display", checkFunctions(
            eglBindWaylandDisplayWL, eglUnbindWaylandDisplayWL, eglQueryWaylandBufferWL
        ));
    }

    private boolean check_WL_create_wayland_buffer_from_image(Set<String> ext) {
        return ext.contains("EGL_WL_create_wayland_buffer_from_image") && checkExtension("EGL_WL_create_wayland_buffer_from_image", checkFunctions(
            eglCreateWaylandBufferFromImageWL
        ));
    }

}
