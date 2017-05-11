/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val AMD_sample_positions = "AMDSamplePositions".nativeClassGL("AMD_sample_positions", postfix = AMD) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides a mechanism to explicitly set sample positions for a FBO with multi-sampled attachments. The FBO will use identical sample
        locations for all pixels in each attachment. This forces TEXTURE_FIXED_SAMPLE_LOCATIONS to TRUE if a multi-sampled texture is specified using
        TexImage2DMultisample or TexImage3DMultisample. That is, using GetTexLevelParameter to query TEXTURE_FIXED_SAMPLE_LOCATIONS will always return TRUE if
        the mechanism is explicitly used to set the sample positions.

        Requires ${GL32.core} or ${EXT_framebuffer_multisample.link}.
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of GetFloatv.",

        "SUBSAMPLE_DISTANCE_AMD"..0x883F
    )

    void(
        "SetMultisamplefvAMD",
        "",

        GLenum.IN("pname", ""),
        GLuint.IN("index", ""),
        Check(2)..const..GLfloat_p.IN("val", "")
    )
}