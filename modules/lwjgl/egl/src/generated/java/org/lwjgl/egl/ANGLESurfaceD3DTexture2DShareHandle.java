/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/ANGLE/EGL_ANGLE_surface_d3d_texture_2d_share_handle.txt">ANGLE_surface_d3d_texture_2d_share_handle</a> extension.
 * 
 * <p>Some EGL implementations generate EGLSurface handles that are backed by Direct3D 2D textures. For such surfaces, a D3D share handle can be generated,
 * allowing access to the same surface from the Direct3D API.</p>
 * 
 * <p>Requires {@link ANGLEQuerySurfacePointer ANGLE_query_surface_pointer}.</p>
 */
public final class ANGLESurfaceD3DTexture2DShareHandle {

    public static final int EGL_D3D_TEXTURE_2D_SHARE_HANDLE_ANGLE = 0x3200;

    private ANGLESurfaceD3DTexture2DShareHandle() {}

}