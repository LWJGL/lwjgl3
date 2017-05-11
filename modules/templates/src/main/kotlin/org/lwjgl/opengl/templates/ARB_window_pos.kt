/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_window_pos = "ARBWindowPos".nativeClassGL("ARB_window_pos", postfix = ARB) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        In order to set the current raster position to a specific window coordinate with the #RasterPos2i() command, the modelview matrix, projection matrix
        and viewport must be set very carefully. Furthermore, if the desired window coordinate is outside of the window's bounds one must rely on a subtle
        side-effect of the #Bitmap() command in order to avoid frustum clipping.

        This extension provides a set of functions to directly set the current raster position in window coordinates, bypassing the modelview matrix, the
        projection matrix and the viewport-to-window mapping. Furthermore, clip testing is not performed, so that the current raster position is always valid.

        This greatly simplifies the process of setting the current raster position to a specific window coordinate prior to calling #DrawPixels(),
        #CopyPixels() or #Bitmap(). Many matrix operations can be avoided when mixing 2D and 3D rendering.

        ${GL14.promoted}
        """

    void(
        "WindowPos2iARB",
        "Alternate way to set the current raster position. {@code z} is implictly set to 0.",

        GLint.IN("x", "the x value"),
        GLint.IN("y", "the y value")
    )

    void("WindowPos2sARB", "Short version of #WindowPos2iARB().", GLshort.IN("x", "the x value"), GLshort.IN("y", "the y value"))
    void("WindowPos2fARB", "Float version of #WindowPos2iARB().", GLfloat.IN("x", "the x value"), GLfloat.IN("y", "the y value"))
    void("WindowPos2dARB", "Double version of #WindowPos2iARB().", GLdouble.IN("x", "the x value"), GLdouble.IN("y", "the y value"))

    void("WindowPos2ivARB", "Pointer version of #WindowPos2iARB().", Check(2)..const..GLint_p.IN("p", "the position value"))
    void("WindowPos2svARB", "Pointer version of #WindowPos2sARB().", Check(2)..const..GLshort_p.IN("p", "the position value"))
    void("WindowPos2fvARB", "Pointer version of #WindowPos2fARB().", Check(2)..const..GLfloat_p.IN("p", "the position value"))
    void("WindowPos2dvARB", "Pointer version of #WindowPos2dARB().", Check(2)..const..GLdouble_p.IN("p", "the position value"))

    void(
        "WindowPos3iARB",
        "Alternate way to set the current raster position.",

        GLint.IN("x", "the x value"),
        GLint.IN("y", "the y value"),
        GLint.IN("z", "the z value")
    )

    void("WindowPos3sARB", "Short version of #WindowPos3iARB().", GLshort.IN("x", "the x value"), GLshort.IN("y", "the y value"), GLshort.IN("z", "the z value"))
    void("WindowPos3fARB", "Float version of #WindowPos3iARB().", GLfloat.IN("x", "the x value"), GLfloat.IN("y", "the y value"), GLfloat.IN("z", "the z value"))
    void("WindowPos3dARB", "Double version of #WindowPos3iARB().", GLdouble.IN("x", "the x value"), GLdouble.IN("y", "the y value"), GLdouble.IN("z", "the z value"))

    void("WindowPos3ivARB", "Pointer version of #WindowPos3iARB().", Check(3)..const..GLint_p.IN("p", "the position value"))
    void("WindowPos3svARB", "Pointer version of #WindowPos3sARB().", Check(3)..const..GLshort_p.IN("p", "the position value"))
    void("WindowPos3fvARB", "Pointer version of #WindowPos3fARB().", Check(3)..const..GLfloat_p.IN("p", "the position value"))
    void("WindowPos3dvARB", "Pointer version of #WindowPos3dARB().", Check(3)..const..GLdouble_p.IN("p", "the position value"))
}