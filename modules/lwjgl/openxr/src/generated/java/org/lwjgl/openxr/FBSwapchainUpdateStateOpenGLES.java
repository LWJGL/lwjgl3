/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_FB_swapchain_update_state_opengl_es">XR_FB_swapchain_update_state_opengl_es</a> extension.
 * 
 * <p>This extension enables the application to modify and query OpenGL ES-specific mutable state associated with a swapchain, examples include:</p>
 * 
 * <ul>
 * <li>On platforms where composition runs in a separate process from the application, swapchains must be created in a cross-process friendly way. In such cases, the texture image memory may be shared between processes, but the texture state may not; and, an explicit mechanism to synchronize this texture state between the application and the compositor is required.</li>
 * </ul>
 * 
 * <p>In order to enable the functionality of this extension, the application <b>must</b> pass the name of the extension into {@link XR10#xrCreateInstance CreateInstance} via the {@link XrInstanceCreateInfo} {@code enabledExtensionNames} parameter as indicated in the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#extensions">extensions</a> section.</p>
 */
public final class FBSwapchainUpdateStateOpenGLES {

    /** The extension specification version. */
    public static final int XR_FB_swapchain_update_state_opengl_es_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_FB_SWAPCHAIN_UPDATE_STATE_OPENGL_ES_EXTENSION_NAME = "XR_FB_swapchain_update_state_opengl_es";

    /** Extends {@code XrStructureType}. */
    public static final int XR_TYPE_SWAPCHAIN_STATE_SAMPLER_OPENGL_ES_FB = 1000162000;

    private FBSwapchainUpdateStateOpenGLES() {}

}