/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_transform_feedback2 = "ARBTransformFeedback2".nativeClassGL("ARB_transform_feedback2") {
    IntConstant(
        "TRANSFORM_FEEDBACK"..0x8E22
    )

    IntConstant(
        "TRANSFORM_FEEDBACK_BUFFER_PAUSED"..0x8E23,
        "TRANSFORM_FEEDBACK_BUFFER_ACTIVE"..0x8E24,
        "TRANSFORM_FEEDBACK_BINDING"..0x8E25
    )

    reuse(GL40C, "BindTransformFeedback")
    reuse(GL40C, "DeleteTransformFeedbacks")
    reuse(GL40C, "GenTransformFeedbacks")
    reuse(GL40C, "IsTransformFeedback")

    reuse(GL40C, "PauseTransformFeedback")
    reuse(GL40C, "ResumeTransformFeedback")

    reuse(GL40C, "DrawTransformFeedback")
}