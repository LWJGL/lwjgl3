/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val MSFT_first_person_observer = "MSFTFirstPersonObserver".nativeClassXR("MSFT_first_person_observer", type = "instance", postfix = "MSFT") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "MSFT_first_person_observer_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "MSFT_FIRST_PERSON_OBSERVER_EXTENSION_NAME".."XR_MSFT_first_person_observer"
    )

    EnumConstant(
        "Extends {@code XrViewConfigurationType}.",

        "VIEW_CONFIGURATION_TYPE_SECONDARY_MONO_FIRST_PERSON_OBSERVER_MSFT".."1000054000"
    )
}