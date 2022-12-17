/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val META_headset_id = "METAHeadsetId".nativeClassXR("META_headset_id", type = "instance", postfix = "META") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#META_headset_id">META_headset_id</a> extension.
        """

    IntConstant(
        "The extension specification version.",

        "META_headset_id_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "META_HEADSET_ID_EXTENSION_NAME".."XR_META_headset_id"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_SYSTEM_HEADSET_ID_PROPERTIES_META".."1000245000"
    )
}