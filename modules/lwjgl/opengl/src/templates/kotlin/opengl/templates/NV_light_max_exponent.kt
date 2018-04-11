/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_light_max_exponent = "NVLightMaxExponent".nativeClassGL("NV_light_max_exponent", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Default OpenGL does not permit a shininess or spot exponent over 128.0.  This extension permits implementations to support and advertise a maximum
        shininess and spot exponent beyond 128.0.
        """

    IntConstant(
        "Accepted by the {@code pname} parameters of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev",

        "MAX_SHININESS_NV"..0x8504,
        "MAX_SPOT_EXPONENT_NV"..0x8505
    )
}