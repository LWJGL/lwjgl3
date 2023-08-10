/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/EXT/EGL_EXT_surface_SMPTE2086_metadata.txt">EXT_surface_SMPTE2086_metadata</a> extension.
 * 
 * <p>This extension adds a new set of EGL surface attributes for the metadata defined by the SMPTE (the Society of Motion Picture and Television Engineers)
 * ST 2086 standard. The SMPTE 2086 metadata includes the color primaries, white point and luminance range of the mastering display, which all together
 * define the color volume that contains all the possible colors the mastering display can produce. The mastering display is the display where creative
 * work is done and creative intent is established. To preserve such creative intent as much as possible and achieve consistent color reproduction on
 * different viewing displays, it is useful for the display pipeline to know the color volume of the original mastering display where content is created
 * or tuned. This avoids performing unnecessary mapping of colors that are not displayable on the original mastering display.</p>
 * 
 * <p>This extension adds the ability to pass the SMPTE 2086 metadata via EGL, from which the color volume can be derived. While the general purpose of the
 * metadata is to assist in the transformation between different color volumes of different displays and help achieve better color reproduction, it is not
 * in the scope of this extension to define how exactly the metadata should be used in such a process. It is up to the implementation to determine how to
 * make use of the metadata.</p>
 * 
 * <p>Requires {@link EGL14 EGL 1.4}.</p>
 */
public final class EXTSurfaceSMPTE2086Metadata {

    /** Accepted as attribute by {@link EGL11#eglSurfaceAttrib SurfaceAttrib} and {@link EGL10#eglQuerySurface QuerySurface}. */
    public static final int
        EGL_SMPTE2086_DISPLAY_PRIMARY_RX_EXT = 0x3341,
        EGL_SMPTE2086_DISPLAY_PRIMARY_RY_EXT = 0x3342,
        EGL_SMPTE2086_DISPLAY_PRIMARY_GX_EXT = 0x3343,
        EGL_SMPTE2086_DISPLAY_PRIMARY_GY_EXT = 0x3344,
        EGL_SMPTE2086_DISPLAY_PRIMARY_BX_EXT = 0x3345,
        EGL_SMPTE2086_DISPLAY_PRIMARY_BY_EXT = 0x3346,
        EGL_SMPTE2086_WHITE_POINT_X_EXT      = 0x3347,
        EGL_SMPTE2086_WHITE_POINT_Y_EXT      = 0x3348,
        EGL_SMPTE2086_MAX_LUMINANCE_EXT      = 0x3349,
        EGL_SMPTE2086_MIN_LUMINANCE_EXT      = 0x334A;

    private EXTSurfaceSMPTE2086Metadata() {}

}