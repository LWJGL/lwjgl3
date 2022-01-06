/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val KHR_binding_modification = "KHRBindingModification".nativeClassXR("KHR_binding_modification", type = "instance", postfix = "KHR") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "KHR_binding_modification_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_BINDING_MODIFICATION_EXTENSION_NAME".."XR_KHR_binding_modification"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_BINDING_MODIFICATIONS_KHR".."1000120000"
    )
}