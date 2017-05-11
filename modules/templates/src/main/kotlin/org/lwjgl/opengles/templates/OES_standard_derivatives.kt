/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val OES_standard_derivatives = "OESStandardDerivatives".nativeClassGLES("OES_standard_derivatives", postfix = OES) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        The standard derivative built-in functions and semantics from OpenGL 2.0 are optional for OpenGL ES 2.0. When this extension is available, these
        built-in functions are also available, as is a hint controlling the quality/performance trade off.

        Requires ${GLES20.core}.
        """

    IntConstant(
        "Accepted by the {@code target} parameter of Hint and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "FRAGMENT_SHADER_DERIVATIVE_HINT_OES"..0x8B8B
    )
}