/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_bind_to_front = "EXTBindToFront".nativeClassEGL("EXT_bind_to_front", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension allows for using double buffered Pbuffers for rendering to textures, by allowing a new enumeration to be used in #BindTexImage().
        #FRONT_BUFFER_EXT is used to denote reading the textures data from the front buffer of a double buffered Pbuffer.

        Requires ${EGL12.core}.
        """

    IntConstant(
        "Used to denote reading the textures data from the front buffer of a double buffered Pbuffer.",

        "FRONT_BUFFER_EXT"..0x3464
    )
}