/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val NV_transform_feedback2 = "NVTransformFeedback2".nativeClassGL("NV_transform_feedback2", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        The NV_transform_feedback and EXT_transform_feedback extensions allow applications to capture primitives to one or more buffer objects when transformed
        by the GL. This extension provides a few additional capabilities to these extensions, making transform feedback mode more useful.

        First, it provides transform feedback objects encapsulating transform feedback-related state, allowing applications to replace the entire transform
        feedback configuration in a single bind call. Second, it provides the ability to pause and resume transform feedback operations. When transform
        feedback is paused, applications may render without transform feedback or may use transform feedback with different state and a different transform
        feedback object. When transform feedback is resumed, additional primitives are captured and appended to previously captured primitives for the object.

        Additionally, this extension provides the ability to draw primitives captured in transform feedback mode without querying the captured primitive count.
        The command DrawTransformFeedbackNV() is equivalent to {@code glDrawArrays(<mode>, 0, <count>)}, where {@code count} is the number of vertices captured
        to buffer objects during the last transform feedback capture operation on the transform feedback object used. This draw operation only provides a
        vertex count -- it does not automatically set up vertex array state or vertex buffer object bindings, which must be done separately by the application.

        Requires ${GL15.core} and ${NV_transform_feedback.link} or ${EXT_transform_feedback.link}.
        """

    IntConstant(
        "Accepted by the {@code target} parameter of BindTransformFeedbackNV.",

        "TRANSFORM_FEEDBACK_NV"..0x8E22
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.",

        "TRANSFORM_FEEDBACK_BUFFER_PAUSED_NV"..0x8E23,
        "TRANSFORM_FEEDBACK_BUFFER_ACTIVE_NV"..0x8E24,
        "TRANSFORM_FEEDBACK_BINDING_NV"..0x8E25
    )

    void(
        "BindTransformFeedbackNV",
        "",

        GLenum.IN("target", ""),
        GLuint.IN("id", "")
    )

    void(
        "DeleteTransformFeedbacksNV",
        "",

        AutoSize("ids")..GLsizei.IN("n", ""),
        SingleValue("id")..const..GLuint_p.IN("ids", "")
    )

    void(
        "GenTransformFeedbacksNV",
        "",

        AutoSize("ids")..GLsizei.IN("n", ""),
        Check(1)..ReturnParam..GLuint_p.OUT("ids", "")
    )

    GLboolean(
        "IsTransformFeedbackNV",
        "",

        GLuint.IN("id", "")
    )

    void(
        "PauseTransformFeedbackNV",
        ""
    )

    void(
        "ResumeTransformFeedbackNV",
        ""
    )

    void(
        "DrawTransformFeedbackNV",
        "",

        GLenum.IN("mode", ""),
        GLuint.IN("id", "")
    )
}