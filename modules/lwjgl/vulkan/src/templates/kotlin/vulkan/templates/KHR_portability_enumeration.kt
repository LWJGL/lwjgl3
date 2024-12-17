/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_portability_enumeration = "KHRPortabilityEnumeration".nativeClassVK("KHR_portability_enumeration", type = "instance", postfix = "KHR") {
    IntConstant(
        "KHR_PORTABILITY_ENUMERATION_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_PORTABILITY_ENUMERATION_EXTENSION_NAME".."VK_KHR_portability_enumeration"
    )

    EnumConstant(
        "INSTANCE_CREATE_ENUMERATE_PORTABILITY_BIT_KHR".enum(0x00000001)
    )
}