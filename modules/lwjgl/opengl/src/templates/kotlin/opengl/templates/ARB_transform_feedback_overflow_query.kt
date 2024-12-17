/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_transform_feedback_overflow_query = "ARBTransformFeedbackOverflowQuery".nativeClassGL("ARB_transform_feedback_overflow_query", postfix = ARB) {
    IntConstant(
        "TRANSFORM_FEEDBACK_OVERFLOW_ARB"..0x82EC,
        "TRANSFORM_FEEDBACK_STREAM_OVERFLOW_ARB"..0x82ED
    )
}