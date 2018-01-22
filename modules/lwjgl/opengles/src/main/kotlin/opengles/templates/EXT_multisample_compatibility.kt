/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val EXT_multisample_compatibility = "EXTMultisampleCompatibility".nativeClassGLES("EXT_multisample_compatibility", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension allows disabling and enabling of multisampling.

        OpenGL ES 2.x/3.x both support multisampling but provide no way to disable multisampling for drawables with multiple samples.

        This introduces the MULTISAMPLE and SAMPLE_ALPHA_TO_ONE enables (though EXT suffixed) that operate identically to the OpenGL 4.5 core profile (as they
        have existed in OpenGL since OpenGL 1.3 and earlier with the ARB_multisample, EXT_multisample, and SGIS_multisample extensions).
        """

    IntConstant(
        """
        Accepted by the {@code cap} parameter to Enable, Disable, and IsEnabled and the {@code pname} parameter to GetBooleanv, GetIntegerv, GetFloatv, and
        GetInteger64v.
        """,

        "MULTISAMPLE_EXT"..0x809D,
        "SAMPLE_ALPHA_TO_ONE_EXT"..0x809F
    )
}