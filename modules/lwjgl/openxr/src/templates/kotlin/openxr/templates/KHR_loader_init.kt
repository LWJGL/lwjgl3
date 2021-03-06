/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*
import openxr.KHR as KHR_

val KHR_loader_init = "KHRLoaderInit".nativeClassXR("KHR_loader_init", type = "instance", postfix = KHR_) {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "KHR_loader_init_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_LOADER_INIT_EXTENSION_NAME".."XR_KHR_loader_init"
    )

    GlobalCommand..XrResult(
        "InitializeLoaderKHR",
        "",

        XrLoaderInitInfoBaseHeaderKHR.const.p("loaderInitInfo", "")
    )
}