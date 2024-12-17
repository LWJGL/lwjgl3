/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_transform_feedback3 = "ARBTransformFeedback3".nativeClassGL("ARB_transform_feedback3") {
    IntConstant(
        "MAX_TRANSFORM_FEEDBACK_BUFFERS"..0x8E70,
        "MAX_VERTEX_STREAMS"..0x8E71
    )

    reuse(GL40C, "DrawTransformFeedbackStream")
    reuse(GL40C, "BeginQueryIndexed")
    reuse(GL40C, "EndQueryIndexed")
    reuse(GL40C, "GetQueryIndexediv")
}