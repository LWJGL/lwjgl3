/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val EXT_draw_transform_feedback = "EXTDrawTransformFeedback".nativeClassGLES("EXT_draw_transform_feedback", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension adds the {@code DrawTransformFeedback} commands. These were omitted from OpenGL ES 3.0 because the number of vertices captured by
        transform feedback could never be different than the number drawn during capture. The addition of geometry shaders in OpenGL ES 3.2 broke that
        assumption but, due to an oversight, {@code DrawTransformFeedback} et al were not reinstated. The {@code DrawTransformFeedback} commands unlock the
        full potential of geometry shaders.

        Requires ${GLES32.core}.
        """

    void(
        "DrawTransformFeedbackEXT",
        "",

        GLenum.IN("mode", ""),
        GLuint.IN("id", "")
    )

    void(
        "DrawTransformFeedbackInstancedEXT",
        "",

        GLenum.IN("mode", ""),
        GLuint.IN("id", ""),
        GLsizei.IN("instancecount", "")
    )
}