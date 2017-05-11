/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val KHR_no_error = "KHRNoError".nativeClassGLES("KHR_no_error", postfix = KHR) {
    documentation =
        """
        Native bindings to the ${registryLink("KHR", "no_error")} extension.

        With this extension enabled any behavior that generates a GL error will have undefined behavior. The reason this extension exists is performance can be
        increased and power usage decreased. When this mode is used, a GL driver can have undefined behavior where it would have generated a GL error without
        this extension. This could include application termination. In general this extension should be used after you have verified all the GL errors are
        removed, and an application is not the kind that would check for GL errors and adjust behavior based on those errors.

        Requires ${GLES20.core}.
        """

    IntConstant(
        "",

        "CONTEXT_FLAG_NO_ERROR_BIT_KHR"..0x00000008
    )
}