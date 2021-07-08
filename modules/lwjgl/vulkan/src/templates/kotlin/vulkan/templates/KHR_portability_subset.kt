/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_portability_subset = "KHRPortabilitySubset".nativeClassVK("KHR_portability_subset", type = "device", postfix = KHR) {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "KHR_PORTABILITY_SUBSET_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_PORTABILITY_SUBSET_EXTENSION_NAME".."VK_KHR_portability_subset"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PORTABILITY_SUBSET_FEATURES_KHR".."1000163000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PORTABILITY_SUBSET_PROPERTIES_KHR".."1000163001"
    )
}