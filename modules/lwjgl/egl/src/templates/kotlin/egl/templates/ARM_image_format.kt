/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val ARM_image_format = "ARMImageFormat".nativeClassEGL("ARM_image_format", postfix = ARM) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        When an {@code EGLImage} is created from an existing image resource the implementation will deduce the format of the image data from that resource. In
        some cases, however, the implementation may not know how to map the existing image resource to a known format. This extension extends the list of
        attributes accepted by #CreateImageKHR() such that applications can tell the implementation how to interpret the data.
        """

    IntConstant(
        "Accepted as an attribute name in the {@code attrib_list} argument of #CreateImageKHR().",

        "COLOR_COMPONENT_TYPE_EXT"..0x3339
    )

    IntConstant(
        "Accepted as attribute values for the #COLOR_COMPONENT_TYPE_EXT attribute of #CreateImageKHR().",

        "COLOR_COMPONENT_TYPE_FIXED_EXT"..0x333A,
        "COLOR_COMPONENT_TYPE_FLOAT_EXT"..0x333B,
        "COLOR_COMPONENT_TYPE_UNSIGNED_INTEGER_ARM"..0x3287,
        "COLOR_COMPONENT_TYPE_INTEGER_ARM"..0x3288
    )
}