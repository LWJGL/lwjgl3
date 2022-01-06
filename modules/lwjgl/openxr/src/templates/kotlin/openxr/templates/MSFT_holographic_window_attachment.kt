/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val MSFT_holographic_window_attachment = "MSFTHolographicWindowAttachment".nativeClassXR("MSFT_holographic_window_attachment", type = "instance", postfix = "MSFT") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "MSFT_holographic_window_attachment_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "MSFT_HOLOGRAPHIC_WINDOW_ATTACHMENT_EXTENSION_NAME".."XR_MSFT_holographic_window_attachment"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_HOLOGRAPHIC_WINDOW_ATTACHMENT_MSFT".."1000063000"
    )
}