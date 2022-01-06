/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EXT_win32_appcontainer_compatible = "EXTWin32AppcontainerCompatible".nativeClassXR("EXT_win32_appcontainer_compatible", type = "instance", postfix = "EXT") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "EXT_win32_appcontainer_compatible_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_WIN32_APPCONTAINER_COMPATIBLE_EXTENSION_NAME".."XR_EXT_win32_appcontainer_compatible"
    )
}