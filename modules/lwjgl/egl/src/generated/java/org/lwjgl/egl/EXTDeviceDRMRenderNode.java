/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/EXT/EGL_EXT_device_drm_render_node.txt">EXT_device_drm_render_node</a> extension.
 * 
 * <p>The {@code EGL_EXT_device_drm} extension provided a method for applications to query the DRM device node file associated with a given
 * {@code EGLDeviceEXT} object. However, it was not clear whether it referred to the primary or render device node. This extension adds an enum to refer
 * explicitly to the render device node and defines the existing {@link EXTDeviceDRM#EGL_DRM_DEVICE_FILE_EXT DRM_DEVICE_FILE_EXT} as explicitly refering to the primary device node.</p>
 * 
 * <p>Requires {@link EXTDeviceQuery EXT_device_query}.</p>
 */
public final class EXTDeviceDRMRenderNode {

    /** Accepted as the {@code name} parameter of {@link EXTDeviceQuery#eglQueryDeviceStringEXT QueryDeviceStringEXT}. */
    public static final int EGL_DRM_RENDER_NODE_FILE_EXT = 0x3377;

    private EXTDeviceDRMRenderNode() {}

}