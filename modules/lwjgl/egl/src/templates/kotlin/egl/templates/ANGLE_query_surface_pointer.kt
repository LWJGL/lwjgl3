/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val ANGLE_query_surface_pointer = "ANGLEQuerySurfacePointer".nativeClassEGL("ANGLE_query_surface_pointer", postfix = ANGLE) {
    EGLBoolean(
        "QuerySurfacePointerANGLE",

        EGLDisplay("dpy"),
        EGLSurface("surface"),
        EGLint("attribute"),
        Check(1)..void.p.p("value")
    )
}