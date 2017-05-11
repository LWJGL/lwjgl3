/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val ANGLE_query_surface_pointer = "ANGLEQuerySurfacePointer".nativeClassEGL("ANGLE_query_surface_pointer", postfix = ANGLE) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension allows querying pointer-sized surface attributes, thus avoiding problems with coercing 64-bit pointers into a 32-bit integer.
        """

    EGLBoolean(
        "QuerySurfacePointerANGLE",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLSurface.IN("surface", ""),
        EGLint.IN("attribute", ""),
        Check(1)..void_pp.OUT("value", "")
    )
}