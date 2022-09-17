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
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_KHR_binding_modification">XR_KHR_binding_modification</a> extension.

        This extension adds an optional structure that can be included on the ##XrInteractionProfileSuggestedBinding{@code ::next} chain passed to #SuggestInteractionProfileBindings() to specify additional information to modify default binding behavior.

        This extension does not define any actual modification structs, but includes the list of modifications and the ##XrBindingModificationBaseHeaderKHR structure to allow other extensions to provide specific modifications.
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