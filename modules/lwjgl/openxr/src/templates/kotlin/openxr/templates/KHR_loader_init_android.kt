/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val KHR_loader_init_android = "KHRLoaderInitAndroid".nativeClassXR("KHR_loader_init_android", type = "instance", postfix = KHR) {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "KHR_loader_init_android_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_LOADER_INIT_ANDROID_EXTENSION_NAME".."XR_KHR_loader_init_android"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_LOADER_INIT_INFO_ANDROID_KHR".."1000089000"
    )
}