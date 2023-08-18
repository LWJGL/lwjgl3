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

/** Defines the capabilities of an EGLDisplay or the EGL client library. */
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
        eglStreamFlush,
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

    /** When true, {@link EGL10} is supported. */
    public final boolean EGL10;
    /** When true, {@link EGL11} is supported. */
    public final boolean EGL11;
    /** When true, {@link EGL12} is supported. */
    public final boolean EGL12;
    /** When true, {@link EGL13} is supported. */
    public final boolean EGL13;
    /** When true, {@link EGL14} is supported. */
    public final boolean EGL14;
    /** When true, {@link EGL15} is supported. */
    public final boolean EGL15;
    /** When true, {@link ANDROIDBlobCache} is supported. */
    public final boolean EGL_ANDROID_blob_cache;
    /** When true, {@link ANDROIDCreateNativeClientBuffer} is supported. */
    public final boolean EGL_ANDROID_create_native_client_buffer;
    /** When true, {@link ANDROIDFramebufferTarget} is supported. */
    public final boolean EGL_ANDROID_framebuffer_target;
    /** When true, {@link ANDROIDFrontBufferAutoRefresh} is supported. */
    public final boolean EGL_ANDROID_front_buffer_auto_refresh;
    /** When true, {@link ANDROIDImageNativeBuffer} is supported. */
    public final boolean EGL_ANDROID_image_native_buffer;
    /** When true, {@link ANDROIDNativeFenceSync} is supported. */
    public final boolean EGL_ANDROID_native_fence_sync;
    /** When true, {@link ANDROIDPresentationTime} is supported. */
    public final boolean EGL_ANDROID_presentation_time;
    /** When true, {@link ANDROIDRecordable} is supported. */
    public final boolean EGL_ANDROID_recordable;
    /** When true, {@link ANGLED3DShareHandleClientBuffer} is supported. */
    public final boolean EGL_ANGLE_d3d_share_handle_client_buffer;
    /** When true, {@link ANGLEDeviceD3D} is supported. */
    public final boolean EGL_ANGLE_device_d3d;
    /** When true, {@link ANGLEQuerySurfacePointer} is supported. */
    public final boolean EGL_ANGLE_query_surface_pointer;
    /** When true, {@link ANGLESurfaceD3DTexture2DShareHandle} is supported. */
    public final boolean EGL_ANGLE_surface_d3d_texture_2d_share_handle;
    /** When true, {@link ANGLESyncControlRate} is supported. */
    public final boolean EGL_ANGLE_sync_control_rate;
    /** When true, {@link ANGLEWindowFixedSize} is supported. */
    public final boolean EGL_ANGLE_window_fixed_size;
    /** When true, {@link ARMImageFormat} is supported. */
    public final boolean EGL_ARM_image_format;
    /** When true, {@link ARMPixmapMultisampleDiscard} is supported. */
    public final boolean EGL_ARM_pixmap_multisample_discard;
    /** When true, {@link EXTBindToFront} is supported. */
    public final boolean EGL_EXT_bind_to_front;
    /** When true, {@link EXTBufferAge} is supported. */
    public final boolean EGL_EXT_buffer_age;
    /**
     * When true, the <a href="https://www.khronos.org/registry/EGL/extensions/EXT/EGL_EXT_client_extensions.txt">EXT_client_extensions</a> extension is supported.
     * 
     * <p>This extension introduces the concept of *extension type*, requires that each EGL extension belong to exactly one type, and defines two types: display
     * and client. It also provides a method to query, without initializing a display, the set of supported client extensions.</p>
     * 
     * <p>A display extension adds functionality to an individual EGLDisplay. This type of extension has always existed but, until EGL_EXT_client_extensions,
     * lacked an identifying name.</p>
     * 
     * <p>A client extension adds functionality that is independent of any display. In other words, it adds functionality to the EGL client library itself. This
     * is a new type of extension defined by EGL_EXT_client_extensions. EGL_EXT_client_extensions is itself a client extension.</p>
     * 
     * <p>We suggest that each future extension clearly state its type by including the following toplevel section in its extension specification, preceding the
     * Dependencies section. For client extensions, this suggestion is a requirement.</p>
     * 
     * <pre><code>
     *         Extension Type
     * 
     *             &lt;Either "EGL display extension" or "EGL client extension" or
     *              a future extension type.&gt;</code></pre>
     * 
     * <p>By cleanly separating display extensions from client extensions, EGL_EXT_client_extensions solves a bootstrap problem for future EGL extensions that
     * will modify display initialization. To query for such extensions without EGL_EXT_client_extensions, an EGL client would need to initialize a throw-away
     * EGLDisplay solely to query its extension string. Initialization of the throw-away display may have undesired side-effects (discussed in the issues
     * section below) for EGL clients that wish to use the new methods of display initialization.</p>
     */
    public final boolean EGL_EXT_client_extensions;
    /** When true, {@link EXTClientSync} is supported. */
    public final boolean EGL_EXT_client_sync;
    /** When true, {@link EXTCompositor} is supported. */
    public final boolean EGL_EXT_compositor;
    /** When true, {@link EXTConfigSelectGroup} is supported. */
    public final boolean EGL_EXT_config_select_group;
    /** When true, {@link EXTCreateContextRobustness} is supported. */
    public final boolean EGL_EXT_create_context_robustness;
    /** When true, {@link EXTDeviceBase} is supported. */
    public final boolean EGL_EXT_device_base;
    /** When true, {@link EXTDeviceDRM} is supported. */
    public final boolean EGL_EXT_device_drm;
    /** When true, {@link EXTDeviceDRMRenderNode} is supported. */
    public final boolean EGL_EXT_device_drm_render_node;
    /** When true, {@link EXTDeviceEnumeration} is supported. */
    public final boolean EGL_EXT_device_enumeration;
    /** When true, {@link EXTDeviceOpenWF} is supported. */
    public final boolean EGL_EXT_device_openwf;
    /** When true, {@link EXTDevicePersistentID} is supported. */
    public final boolean EGL_EXT_device_persistent_id;
    /** When true, {@link EXTDeviceQuery} is supported. */
    public final boolean EGL_EXT_device_query;
    /** When true, {@link EXTDeviceQueryName} is supported. */
    public final boolean EGL_EXT_device_query_name;
    /**
     * When true, the <a href="https://www.khronos.org/registry/EGL/extensions/EXT/EGL_EXT_explicit_device.txt">EXT_explicit_device</a> extension is supported.
     * 
     * <p>A system may support rendering with multiple devices for the same windowing system. In that case, an EGL implementation must select a default device
     * based on the native display.</p>
     * 
     * <p>This extension allows an application to explicitly request a device to use for rendering instead of the implementation's default.</p>
     * 
     * <p>This differs from {@link EXTPlatformDevice EXT_platform_device} in that {@code EGL_EXT_platform_device} uses an {@code EGLDeviceEXT} instead of a native display. Thus,
     * {@code EGL_EXT_platform_device} allows offscreen rendering to a pbuffer or FBO, but it does not require or use a windowing system, and thus does not
     * allow pixmap or window surfaces.</p>
     * 
     * <p>Using {@code EGL_EXT_explicit_device} with {@code EGL_MESA_platform_surfaceless} is functionally identical to {@code EGL_EXT_platform_device}.</p>
     */
    public final boolean EGL_EXT_explicit_device;
    /** When true, {@link EXTGLColorspaceBT2020HLG} is supported. */
    public final boolean EGL_EXT_gl_colorspace_bt2020_hlg;
    /** When true, {@link EXTGLColorspaceBT2020Linear} is supported. */
    public final boolean EGL_EXT_gl_colorspace_bt2020_linear;
    /** When true, {@link EXTGLColorspaceBT2020PQ} is supported. */
    public final boolean EGL_EXT_gl_colorspace_bt2020_pq;
    /** When true, {@link EXTGLColorspaceDisplayP3} is supported. */
    public final boolean EGL_EXT_gl_colorspace_display_p3;
    /** When true, {@link EXTGLColorspaceDisplayP3Linear} is supported. */
    public final boolean EGL_EXT_gl_colorspace_display_p3_linear;
    /** When true, {@link EXTGLColorspaceDisplayP3Passthrough} is supported. */
    public final boolean EGL_EXT_gl_colorspace_display_p3_passthrough;
    /** When true, {@link EXTGLColorspaceSCRGB} is supported. */
    public final boolean EGL_EXT_gl_colorspace_scrgb;
    /** When true, {@link EXTGLColorspaceSCRGBLinear} is supported. */
    public final boolean EGL_EXT_gl_colorspace_scrgb_linear;
    /** When true, {@link EXTImageDMABufImport} is supported. */
    public final boolean EGL_EXT_image_dma_buf_import;
    /** When true, {@link EXTImageDMABufImportModifiers} is supported. */
    public final boolean EGL_EXT_image_dma_buf_import_modifiers;
    /** When true, {@link EXTImageGLColorspace} is supported. */
    public final boolean EGL_EXT_image_gl_colorspace;
    /** When true, {@link EXTImageImplicitSyncControl} is supported. */
    public final boolean EGL_EXT_image_implicit_sync_control;
    /** When true, {@link EXTMultiviewWindow} is supported. */
    public final boolean EGL_EXT_multiview_window;
    /** When true, {@link EXTOutputBase} is supported. */
    public final boolean EGL_EXT_output_base;
    /** When true, {@link EXTOutputDRM} is supported. */
    public final boolean EGL_EXT_output_drm;
    /** When true, {@link EXTOutputOpenWF} is supported. */
    public final boolean EGL_EXT_output_openwf;
    /** When true, {@link EXTPixelFormatFloat} is supported. */
    public final boolean EGL_EXT_pixel_format_float;
    /** When true, {@link EXTPlatformBase} is supported. */
    public final boolean EGL_EXT_platform_base;
    /** When true, {@link EXTPlatformDevice} is supported. */
    public final boolean EGL_EXT_platform_device;
    /** When true, {@link EXTPlatformWayland} is supported. */
    public final boolean EGL_EXT_platform_wayland;
    /** When true, {@link EXTPlatformX11} is supported. */
    public final boolean EGL_EXT_platform_x11;
    /** When true, {@link EXTPlatformXCB} is supported. */
    public final boolean EGL_EXT_platform_xcb;
    /** When true, {@link EXTPresentOpaque} is supported. */
    public final boolean EGL_EXT_present_opaque;
    /** When true, {@link EXTProtectedContent} is supported. */
    public final boolean EGL_EXT_protected_content;
    /** When true, {@link EXTProtectedSurface} is supported. */
    public final boolean EGL_EXT_protected_surface;
    /** When true, {@link EXTStreamConsumerEGLOutput} is supported. */
    public final boolean EGL_EXT_stream_consumer_egloutput;
    /** When true, {@link EXTSurfaceCompression} is supported. */
    public final boolean EGL_EXT_surface_compression;
    /** When true, {@link EXTSurfaceCTA861_3Metadata} is supported. */
    public final boolean EGL_EXT_surface_CTA861_3_metadata;
    /** When true, {@link EXTSurfaceSMPTE2086Metadata} is supported. */
    public final boolean EGL_EXT_surface_SMPTE2086_metadata;
    /** When true, {@link EXTSwapBuffersWithDamage} is supported. */
    public final boolean EGL_EXT_swap_buffers_with_damage;
    /** When true, {@link EXTSyncReuse} is supported. */
    public final boolean EGL_EXT_sync_reuse;
    /** When true, {@link EXTYUVSurface} is supported. */
    public final boolean EGL_EXT_yuv_surface;
    /** When true, {@link HIClientpixmap} is supported. */
    public final boolean EGL_HI_clientpixmap;
    /** When true, {@link HIColorformats} is supported. */
    public final boolean EGL_HI_colorformats;
    /** When true, {@link IMGContextPriority} is supported. */
    public final boolean EGL_IMG_context_priority;
    /** When true, {@link IMGImagePlaneAttribs} is supported. */
    public final boolean EGL_IMG_image_plane_attribs;
    /** When true, {@link KHRCLEvent2} is supported. */
    public final boolean EGL_KHR_cl_event2;
    /**
     * When true, the <a href="https://www.khronos.org/registry/EGL/extensions/KHR/EGL_KHR_get_all_proc_addresses.txt">KHR_client_get_all_proc_addresses</a> extension is supported.
     * 
     * <p>eglGetProcAddress is currently defined to not support the querying of non-extension EGL or client API functions. Non-extension functions are expected
     * to be exposed as library symbols that can be resolved statically at link time, or dynamically at run time using OS-specific runtime linking mechanisms.</p>
     * 
     * <p>With the addition of OpenGL and OpenGL ES 3 support to EGL, the definition of a non-extension function becomes less clear. It is common for one OpenGL
     * library to implement many versions of OpenGL. The suggested library name for OpenGL ES 3 is the same as that of OpenGL ES 2. If OpenGL ES 3
     * applications linked statically to OpenGL ES 3 functions are run on a system with only OpenGL ES 2 support, they may fail to load. Similar problems
     * would be encountered by an application linking statically to various OpenGL functions.</p>
     * 
     * <p>To avoid requiring applications to fall back to OS-specific dynamic linking mechanisms, this extension drops the requirement that eglGetProcAddress
     * return only non-extension functions. If the extension string is present, applications can query all EGL and client API functions using
     * eglGetProcAddress.</p>
     * 
     * <p>To allow users to query this extension before initializing a display, and to also allow vendors to ship this extension without
     * EGL_EXT_client_extensions, two names are assigned to this extension: one a display extension and the other a client extension. Identical functionality
     * is exposed by each name, but users query each name using different methods. Users query EGL_KHR_get_all_proc_addresses in the usual way; that is, by
     * calling eglQueryString(dpy, EGL_EXTENSIONS) on an initialized display. To query EGL_KHR_client_get_all_proc_addresses, users must use a different
     * method which is described below in the section concerning EGL_EXT_client_extensions.</p>
     * 
     * <p>Requires {@link EGL12 EGL 1.2}.</p>
     */
    public final boolean EGL_KHR_client_get_all_proc_addresses;
    /** When true, {@link KHRConfigAttribs} is supported. */
    public final boolean EGL_KHR_config_attribs;
    /** When true, {@link KHRContextFlushControl} is supported. */
    public final boolean EGL_KHR_context_flush_control;
    /** When true, {@link KHRCreateContext} is supported. */
    public final boolean EGL_KHR_create_context;
    /** When true, {@link KHRCreateContextNoError} is supported. */
    public final boolean EGL_KHR_create_context_no_error;
    /** When true, {@link KHRDebug} is supported. */
    public final boolean EGL_KHR_debug;
    /** When true, {@link KHRDisplayReference} is supported. */
    public final boolean EGL_KHR_display_reference;
    /** When true, {@link KHRFenceSync} is supported. */
    public final boolean EGL_KHR_fence_sync;
    /**
     * When true, the <a href="https://www.khronos.org/registry/EGL/extensions/KHR/EGL_KHR_get_all_proc_addresses.txt">KHR_get_all_proc_addresses</a> extension is supported.
     * 
     * <p>eglGetProcAddress is currently defined to not support the querying of non-extension EGL or client API functions. Non-extension functions are expected
     * to be exposed as library symbols that can be resolved statically at link time, or dynamically at run time using OS-specific runtime linking mechanisms.</p>
     * 
     * <p>With the addition of OpenGL and OpenGL ES 3 support to EGL, the definition of a non-extension function becomes less clear. It is common for one OpenGL
     * library to implement many versions of OpenGL. The suggested library name for OpenGL ES 3 is the same as that of OpenGL ES 2. If OpenGL ES 3
     * applications linked statically to OpenGL ES 3 functions are run on a system with only OpenGL ES 2 support, they may fail to load. Similar problems
     * would be encountered by an application linking statically to various OpenGL functions.</p>
     * 
     * <p>To avoid requiring applications to fall back to OS-specific dynamic linking mechanisms, this extension drops the requirement that eglGetProcAddress
     * return only non-extension functions. If the extension string is present, applications can query all EGL and client API functions using
     * eglGetProcAddress.</p>
     * 
     * <p>To allow users to query this extension before initializing a display, and to also allow vendors to ship this extension without
     * EGL_EXT_client_extensions, two names are assigned to this extension: one a display extension and the other a client extension. Identical functionality
     * is exposed by each name, but users query each name using different methods. Users query EGL_KHR_get_all_proc_addresses in the usual way; that is, by
     * calling eglQueryString(dpy, EGL_EXTENSIONS) on an initialized display. To query EGL_KHR_client_get_all_proc_addresses, users must use a different
     * method which is described below in the section concerning EGL_EXT_client_extensions.</p>
     * 
     * <p>Requires {@link EGL12 EGL 1.2}.</p>
     */
    public final boolean EGL_KHR_get_all_proc_addresses;
    /** When true, {@link KHRGLColorspace} is supported. */
    public final boolean EGL_KHR_gl_colorspace;
    /** When true, {@link KHRGLRenderbufferImage} is supported. */
    public final boolean EGL_KHR_gl_renderbuffer_image;
    /** When true, {@link KHRGLTexture2DImage} is supported. */
    public final boolean EGL_KHR_gl_texture_2D_image;
    /** When true, {@link KHRGLTexture3DImage} is supported. */
    public final boolean EGL_KHR_gl_texture_3D_image;
    /** When true, {@link KHRGLTextureCubemapImage} is supported. */
    public final boolean EGL_KHR_gl_texture_cubemap_image;
    /** When true, {@link KHRImage} is supported. */
    public final boolean EGL_KHR_image;
    /** When true, {@link KHRImageBase} is supported. */
    public final boolean EGL_KHR_image_base;
    /** When true, {@link KHRImagePixmap} is supported. */
    public final boolean EGL_KHR_image_pixmap;
    /** When true, {@link KHRLockSurface3} is supported. */
    public final boolean EGL_KHR_lock_surface3;
    /** When true, {@link KHRMutableRenderBuffer} is supported. */
    public final boolean EGL_KHR_mutable_render_buffer;
    /** When true, {@link KHRNoConfigContext} is supported. */
    public final boolean EGL_KHR_no_config_context;
    /** When true, {@link KHRPartialUpdate} is supported. */
    public final boolean EGL_KHR_partial_update;
    /** When true, {@link KHRPlatformAndroid} is supported. */
    public final boolean EGL_KHR_platform_android;
    /** When true, {@link KHRPlatformGBM} is supported. */
    public final boolean EGL_KHR_platform_gbm;
    /** When true, {@link KHRPlatformWayland} is supported. */
    public final boolean EGL_KHR_platform_wayland;
    /** When true, {@link KHRPlatformX11} is supported. */
    public final boolean EGL_KHR_platform_x11;
    /** When true, {@link KHRReusableSync} is supported. */
    public final boolean EGL_KHR_reusable_sync;
    /** When true, {@link KHRStream} is supported. */
    public final boolean EGL_KHR_stream;
    /** When true, {@link KHRStreamAttrib} is supported. */
    public final boolean EGL_KHR_stream_attrib;
    /** When true, {@link KHRStreamConsumerGLTexture} is supported. */
    public final boolean EGL_KHR_stream_consumer_gltexture;
    /** When true, {@link KHRStreamCrossProcessFD} is supported. */
    public final boolean EGL_KHR_stream_cross_process_fd;
    /** When true, {@link KHRStreamFIFO} is supported. */
    public final boolean EGL_KHR_stream_fifo;
    /**
     * When true, the <a href="https://www.khronos.org/registry/EGL/extensions/KHR/EGL_KHR_stream_producer_aldatalocator.txt">KHR_stream_producer_aldatalocator</a> extension is supported.
     * 
     * <p>This extension (in conjunction with the OpenMAX_AL_EGLStream_DataLocator extension to OpenMAX AL) allows an OpenMAX AL MediaPlayer object to be
     * connected as the producer of an EGLStream.</p>
     * 
     * <p>After the EGLStream is created and connected to a consumer, the OpenMAX AL MediaPlayer object is created by calling &lt;pEngine&gt;'s
     * CreateMediaPlayer() method. The &lt;pImageVideoSnk&gt; argument points to an XADataLocator_EGLStream containing the EGLStreamKHR handle of the stream.
     * The CreateMediaPlayer() method creates a MediaPlayer object and connects it as the producer of the EGLStream. (Note that the pFormat member of the
     * XADataSink structure is ignored in this case and may be {@code NULL}.)</p>
     * 
     * <p>Once connected the MediaPlayer inserts image frames into the EGLStream.</p>
     * 
     * <p>Requires {@link EGL12 EGL 1.2} and {@link KHRStream KHR_stream}. Requires OpenMAX AL 1.1 and OpenMAX_AL_EGLStream_DataLocator.</p>
     */
    public final boolean EGL_KHR_stream_producer_aldatalocator;
    /** When true, {@link KHRStreamProducerEGLSurface} is supported. */
    public final boolean EGL_KHR_stream_producer_eglsurface;
    /**
     * When true, the <a href="https://www.khronos.org/registry/EGL/extensions/KHR/EGL_KHR_surfaceless_context.txt">KHR_surfaceless_context</a> extension is supported.
     * 
     * <p>These extensions allows an application to make a context current by passing EGL_NO_SURFACE for the write and read surface in the call to
     * eglMakeCurrent. The motivation is that applications that only want to render to client API targets (such as OpenGL framebuffer objects) should not need
     * to create a throw-away EGL surface just to get a current context.</p>
     * 
     * <p>The state of an OpenGL ES context with no default framebuffer provided by EGL is the same as a context with an incomplete framebuffer object bound.</p>
     */
    public final boolean EGL_KHR_surfaceless_context;
    /** When true, {@link KHRSwapBuffersWithDamage} is supported. */
    public final boolean EGL_KHR_swap_buffers_with_damage;
    /** When true, {@link KHRVGParentImage} is supported. */
    public final boolean EGL_KHR_vg_parent_image;
    /** When true, {@link KHRWaitSync} is supported. */
    public final boolean EGL_KHR_wait_sync;
    /** When true, {@link MESADRMImage} is supported. */
    public final boolean EGL_MESA_drm_image;
    /** When true, {@link MESAImageDMABufExport} is supported. */
    public final boolean EGL_MESA_image_dma_buf_export;
    /** When true, {@link MESAPlatformGBM} is supported. */
    public final boolean EGL_MESA_platform_gbm;
    /** When true, {@link NOKSwapRegion2} is supported. */
    public final boolean EGL_NOK_swap_region2;
    /** When true, {@link NOKTextureFromPixmap} is supported. */
    public final boolean EGL_NOK_texture_from_pixmap;
    /** When true, {@link NV3dvisionSurface} is supported. */
    public final boolean EGL_NV_3dvision_surface;
    /** When true, {@link NVContextPriorityRealtime} is supported. */
    public final boolean EGL_NV_context_priority_realtime;
    /** When true, {@link NVCoverageSample} is supported. */
    public final boolean EGL_NV_coverage_sample;
    /** When true, {@link NVCoverageSampleResolve} is supported. */
    public final boolean EGL_NV_coverage_sample_resolve;
    /** When true, {@link NVCUDAEvent} is supported. */
    public final boolean EGL_NV_cuda_event;
    /** When true, {@link NVDepthNonlinear} is supported. */
    public final boolean EGL_NV_depth_nonlinear;
    /** When true, {@link NVDeviceCUDA} is supported. */
    public final boolean EGL_NV_device_cuda;
    /** When true, {@link NVNativeQuery} is supported. */
    public final boolean EGL_NV_native_query;
    /**
     * When true, the <a href="https://www.khronos.org/registry/EGL/extensions/NV/EGL_NV_post_convert_rounding.txt">NV_post_convert_rounding</a> extension is supported.
     * 
     * <p>This extension defines the conversions for posting operations when the destination's number of components or component sizes do not match the color
     * buffer. This extension supports posting a 24 bit (888) color buffer to a 16 bit (565) destination buffer, posting a 16 bit (565) color buffer to a 24
     * bit (888) destination buffer, and posting a component that is present in the source buffer, but not present in the destination buffer.</p>
     */
    public final boolean EGL_NV_post_convert_rounding;
    /** When true, {@link NVPostSubBuffer} is supported. */
    public final boolean EGL_NV_post_sub_buffer;
    /** When true, {@link NVQuadrupleBuffer} is supported. */
    public final boolean EGL_NV_quadruple_buffer;
    /** When true, {@link NVRobustnessVideoMemoryPurge} is supported. */
    public final boolean EGL_NV_robustness_video_memory_purge;
    /** When true, {@link NVStreamConsumerEGLImage} is supported. */
    public final boolean EGL_NV_stream_consumer_eglimage;
    /** When true, {@link NVStreamConsumerEGLImageUseScanoutAttrib} is supported. */
    public final boolean EGL_NV_stream_consumer_eglimage_use_scanout_attrib;
    /** When true, {@link NVStreamConsumerGLTextureYUV} is supported. */
    public final boolean EGL_NV_stream_consumer_gltexture_yuv;
    /** See {@link NVStreamRemote NV_stream_remote}. */
    public final boolean EGL_NV_stream_cross_display;
    /** See {@link NVStreamRemote NV_stream_remote}. */
    public final boolean EGL_NV_stream_cross_object;
    /** See {@link NVStreamRemote NV_stream_remote}. */
    public final boolean EGL_NV_stream_cross_partition;
    /** See {@link NVStreamRemote NV_stream_remote}. */
    public final boolean EGL_NV_stream_cross_process;
    /** See {@link NVStreamRemote NV_stream_remote}. */
    public final boolean EGL_NV_stream_cross_system;
    /** When true, {@link NVStreamDMA} is supported. */
    public final boolean EGL_NV_stream_dma;
    /** When true, {@link NVStreamFIFONext} is supported. */
    public final boolean EGL_NV_stream_fifo_next;
    /** When true, {@link NVStreamFIFOSynchronous} is supported. */
    public final boolean EGL_NV_stream_fifo_synchronous;
    /** When true, {@link NVStreamFlush} is supported. */
    public final boolean EGL_NV_stream_flush;
    /** When true, {@link NVStreamFrameLimits} is supported. */
    public final boolean EGL_NV_stream_frame_limits;
    /** When true, {@link NVStreamMetadata} is supported. */
    public final boolean EGL_NV_stream_metadata;
    /** When true, {@link NVStreamRemote} is supported. */
    public final boolean EGL_NV_stream_remote;
    /** When true, {@link NVStreamReset} is supported. */
    public final boolean EGL_NV_stream_reset;
    /** When true, {@link NVStreamSocket} is supported. */
    public final boolean EGL_NV_stream_socket;
    /** When true, {@link NVStreamSocketINet} is supported. */
    public final boolean EGL_NV_stream_socket_inet;
    /** When true, {@link NVStreamSocketUnix} is supported. */
    public final boolean EGL_NV_stream_socket_unix;
    /** When true, {@link NVStreamSync} is supported. */
    public final boolean EGL_NV_stream_sync;
    /** When true, {@link NVSync} is supported. */
    public final boolean EGL_NV_sync;
    /** When true, {@link NVSystemTime} is supported. */
    public final boolean EGL_NV_system_time;
    /** When true, {@link NVTripleBuffer} is supported. */
    public final boolean EGL_NV_triple_buffer;
    /** When true, {@link TIZENImageNativeBuffer} is supported. */
    public final boolean EGL_TIZEN_image_native_buffer;
    /** When true, {@link TIZENImageNativeSurface} is supported. */
    public final boolean EGL_TIZEN_image_native_surface;
    /** When true, {@link WLBindWaylandDisplay} is supported. */
    public final boolean EGL_WL_bind_wayland_display;
    /** When true, {@link WLCreateWaylandBufferFromImage} is supported. */
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
            provider.getFunctionAddress("eglStreamFlush"),
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
            caps.eglStreamFlush,
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
        eglQueryDmaBufFormatsEXT = functions[63];
        eglQueryDmaBufModifiersEXT = functions[64];
        eglGetOutputLayersEXT = functions[65];
        eglGetOutputPortsEXT = functions[66];
        eglOutputLayerAttribEXT = functions[67];
        eglQueryOutputLayerAttribEXT = functions[68];
        eglQueryOutputLayerStringEXT = functions[69];
        eglOutputPortAttribEXT = functions[70];
        eglQueryOutputPortAttribEXT = functions[71];
        eglQueryOutputPortStringEXT = functions[72];
        eglGetPlatformDisplayEXT = functions[73];
        eglCreatePlatformWindowSurfaceEXT = functions[74];
        eglCreatePlatformPixmapSurfaceEXT = functions[75];
        eglStreamConsumerOutputEXT = functions[76];
        eglQuerySupportedCompressionRatesEXT = functions[77];
        eglSwapBuffersWithDamageEXT = functions[78];
        eglUnsignalSyncEXT = functions[79];
        eglCreatePixmapSurfaceHI = functions[80];
        eglCreateSync64KHR = functions[81];
        eglDebugMessageControlKHR = functions[82];
        eglQueryDebugKHR = functions[83];
        eglLabelObjectKHR = functions[84];
        eglQueryDisplayAttribKHR = functions[85];
        eglCreateImageKHR = functions[86];
        eglDestroyImageKHR = functions[87];
        eglLockSurfaceKHR = functions[88];
        eglUnlockSurfaceKHR = functions[89];
        eglQuerySurface64KHR = functions[90];
        eglSetDamageRegionKHR = functions[91];
        eglCreateSyncKHR = functions[92];
        eglDestroySyncKHR = functions[93];
        eglClientWaitSyncKHR = functions[94];
        eglSignalSyncKHR = functions[95];
        eglGetSyncAttribKHR = functions[96];
        eglCreateStreamKHR = functions[97];
        eglDestroyStreamKHR = functions[98];
        eglStreamAttribKHR = functions[99];
        eglQueryStreamKHR = functions[100];
        eglQueryStreamu64KHR = functions[101];
        eglCreateStreamAttribKHR = functions[102];
        eglSetStreamAttribKHR = functions[103];
        eglQueryStreamAttribKHR = functions[104];
        eglStreamConsumerAcquireAttribKHR = functions[105];
        eglStreamConsumerReleaseAttribKHR = functions[106];
        eglStreamConsumerGLTextureExternalKHR = functions[107];
        eglStreamConsumerAcquireKHR = functions[108];
        eglStreamConsumerReleaseKHR = functions[109];
        eglGetStreamFileDescriptorKHR = functions[110];
        eglCreateStreamFromFileDescriptorKHR = functions[111];
        eglQueryStreamTimeKHR = functions[112];
        eglCreateStreamProducerSurfaceKHR = functions[113];
        eglSwapBuffersWithDamageKHR = functions[114];
        eglWaitSyncKHR = functions[115];
        eglCreateDRMImageMESA = functions[116];
        eglExportDRMImageMESA = functions[117];
        eglExportDMABUFImageQueryMESA = functions[118];
        eglExportDMABUFImageMESA = functions[119];
        eglSwapBuffersRegion2NOK = functions[120];
        eglQueryNativeDisplayNV = functions[121];
        eglQueryNativeWindowNV = functions[122];
        eglQueryNativePixmapNV = functions[123];
        eglPostSubBufferNV = functions[124];
        eglStreamImageConsumerConnectNV = functions[125];
        eglQueryStreamConsumerEventNV = functions[126];
        eglStreamAcquireImageNV = functions[127];
        eglStreamReleaseImageNV = functions[128];
        eglStreamConsumerGLTextureExternalAttribsNV = functions[129];
        eglStreamFlush = functions[130];
        eglQueryDisplayAttribNV = functions[131];
        eglSetStreamMetadataNV = functions[132];
        eglQueryStreamMetadataNV = functions[133];
        eglResetStreamNV = functions[134];
        eglCreateStreamSyncNV = functions[135];
        eglCreateFenceSyncNV = functions[136];
        eglDestroySyncNV = functions[137];
        eglFenceNV = functions[138];
        eglClientWaitSyncNV = functions[139];
        eglSignalSyncNV = functions[140];
        eglGetSyncAttribNV = functions[141];
        eglGetSystemTimeFrequencyNV = functions[142];
        eglGetSystemTimeNV = functions[143];
        eglBindWaylandDisplayWL = functions[144];
        eglUnbindWaylandDisplayWL = functions[145];
        eglQueryWaylandBufferWL = functions[146];
        eglCreateWaylandBufferFromImageWL = functions[147];

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
            eglStreamFlush
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
