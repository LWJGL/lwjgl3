/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EXT_uuid = "EXTUUIUD".nativeClassXR("EXT_uuid", type = "instance", postfix = "EXT") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_EXT_uuid">XR_EXT_uuid</a> extension.

        This extension defines a Universally Unique Identifier that follows <a href="https://www.rfc-editor.org/rfc/rfc4122.html">RFC 4122</a>.
        """

    IntConstant(
        "The extension specification version.",

        "EXT_uuid_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_UUID_EXTENSION_NAME".."XR_EXT_uuid"
    )

    EnumConstant(
        "XR_UUID_SIZE_EXT",

        "UUID_SIZE_EXT".."16"
    )
}