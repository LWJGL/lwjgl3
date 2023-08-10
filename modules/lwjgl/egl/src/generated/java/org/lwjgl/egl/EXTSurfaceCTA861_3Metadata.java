/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/EXT/EGL_EXT_surface_CTA861_3_metadata.txt">EXT_surface_CTA861_3_metadata</a> extension.
 * 
 * <p>This extension adds additional EGL surface attributes for the metadata defined by the CTA (Consumer Technology Association) 861.3 standard. This
 * metadata, in addition to the SMPTE 2086 metadata, is used to define the color volume of the mastering display as well as the content (CTA-861.3), The
 * mastering display is the display where creative work is done and creative intent is established. To preserve such creative intent as much as possible
 * and achieve consistent color reproduction on different viewing displays, it is useful for the display pipeline to know the color volume of the original
 * mastering display where content is created or tuned. This avoids performing unnecessary mapping of colors that are not displayable on the original
 * mastering display.</p>
 * 
 * <p>This extension adds the ability to pass the CTA-861.3 metadata via EGL, from which the color volume can be derived. While the general purpose of the
 * metadata is to assist in the transformation between different color volumes of different displays and help achieve better color reproduction, it is not
 * in the scope of this extension to define how exactly the metadata should be used in such a process. It is up to the implementation to determine how to
 * make use of the metadata.</p>
 * 
 * <p>Requires {@link EGL15 EGL 1.5} and {@link EXTSurfaceSMPTE2086Metadata EXT_surface_SMPTE2086_metadata}.</p>
 */
public final class EXTSurfaceCTA861_3Metadata {

    /** Accepted as attribute by {@link EGL11#eglSurfaceAttrib SurfaceAttrib} and {@link EGL10#eglQuerySurface QuerySurface}. */
    public static final int
        EGL_CTA861_3_MAX_CONTENT_LIGHT_LEVEL_EXT = 0x3360,
        EGL_CTA861_3_MAX_FRAME_AVERAGE_LEVEL_EXT = 0x3361;

    private EXTSurfaceCTA861_3Metadata() {}

}