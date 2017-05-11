/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_explicit_uniform_location = "ARBExplicitUniformLocation".nativeClassGL("ARB_explicit_uniform_location") {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides a method to pre-assign uniform locations to uniform variables in the default uniform block, including subroutine uniforms. This
        allows an application to modify the uniform values without requiring a GL query like #GetUniformLocation(), #GetSubroutineUniformLocation() and
        #GetSubroutineIndex().

        Requires ${GL33.core} or ${registryLinkTo("ARB", "explicit_attrib_location")}. ${GL43.promoted}
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev, and GetInteger64v.",

        "MAX_UNIFORM_LOCATIONS"..0x826E
    )
}