/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val EXT_stencil_wrap = "EXTStencilWrap".nativeClassGL("EXT_stencil_wrap", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Various algorithms use the stencil buffer to "count" the number of surfaces that a ray passes through. As the ray passes into an object, the stencil
        buffer is incremented. As the ray passes out of an object, the stencil buffer is decremented.

        GL requires that the stencil increment operation clamps to its maximum value. For algorithms that depend on the difference between the sum of the
        increments and the sum of the decrements, clamping causes an erroneous result.

        This extension provides an enable for both maximum and minimum wrapping of stencil values. Instead, the stencil value wraps in both directions.

        Two additional stencil operations are specified. These new operations are similiar to the existing INCR and DECR operations, but they wrap their result
        instead of saturating it. This functionality matches the new stencil operations introduced by DirectX 6.

        ${GL14.promoted}
        """

    IntConstant(
        "Accepted by the {@code sfail}, {@code dpfail}, and {@code dppass} parameter of StencilOp.",

        "INCR_WRAP_EXT"..0x8507,
        "DECR_WRAP_EXT"..0x8508
    )
}