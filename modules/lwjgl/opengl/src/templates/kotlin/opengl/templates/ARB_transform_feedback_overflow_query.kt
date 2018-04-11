/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_transform_feedback_overflow_query = "ARBTransformFeedbackOverflowQuery".nativeClassGL("ARB_transform_feedback_overflow_query", postfix = ARB) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension adds new query types which can be used to detect overflow of transform feedback buffers. The new query types are also accepted by
        conditional rendering commands.

        Requires ${GL30.core}.
        """

    IntConstant(
        """
        Accepted by the {@code target} parameter of #BeginQuery(), #EndQuery(), #GetQueryiv(),
        #BeginQueryIndexed(), #EndQueryIndexed() and #GetQueryIndexediv().
        """,

        "TRANSFORM_FEEDBACK_OVERFLOW_ARB"..0x82EC,
        "TRANSFORM_FEEDBACK_STREAM_OVERFLOW_ARB"..0x82ED
    )
}