/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/NV/EGL_NV_3dvision_surface.txt">NV_3dvision_surface</a> extension.
 * 
 * <p>NVIDIA 3D Vision provides stereoscopic 3d rendering without requiring applications to change their rendering methods. However there are cases where
 * applications can benefit from adjusting 3D vision parameters directly to experiment with this functionality in applications not yet known to 3D Vision,
 * to assist 3D Vision in setting parameters correctly for unusual situations, or to present application-specific user-accessible controls for 3D Vision
 * parameters.</p>
 * 
 * <p>This extension provides the ability to explicitly create a surface with 3D Vision support regardless of application detection.</p>
 * 
 * <p>Requires {@link EGL14 EGL 1.4}.</p>
 */
public final class NV3dvisionSurface {

    public static final int EGL_AUTO_STEREO_NV = 0x3136;

    private NV3dvisionSurface() {}

}