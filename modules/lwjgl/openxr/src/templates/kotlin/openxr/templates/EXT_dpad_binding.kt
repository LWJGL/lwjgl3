/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EXT_dpad_binding = "EXTDpadBinding".nativeClassXR("EXT_dpad_binding", type = "instance", postfix = "EXT") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_EXT_dpad_binding">XR_EXT_dpad_binding</a> extension.

        This extension allows the application to bind one or more digital actions to a trackpad or thumbstick as though it were a dpad by defining additional component paths to suggest bindings for. The behavior of this dpad-like mapping may be customized using ##XrInteractionProfileDpadBindingEXT.

        Applications <b>must</b> also enable the {@link KHRBindingModification XR_KHR_binding_modification} extension that this builds on top of.
        """

    IntConstant(
        "The extension specification version.",

        "EXT_dpad_binding_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_DPAD_BINDING_EXTENSION_NAME".."XR_EXT_dpad_binding"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_INTERACTION_PROFILE_DPAD_BINDING_EXT".."1000078000"
    )
}