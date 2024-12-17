/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_representative_fragment_test = "NVRepresentativeFragmentTest".nativeClassVK("NV_representative_fragment_test", type = "device", postfix = "NV") {
    IntConstant(
        "NV_REPRESENTATIVE_FRAGMENT_TEST_SPEC_VERSION".."2"
    )

    StringConstant(
        "NV_REPRESENTATIVE_FRAGMENT_TEST_EXTENSION_NAME".."VK_NV_representative_fragment_test"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_REPRESENTATIVE_FRAGMENT_TEST_FEATURES_NV".."1000166000",
        "STRUCTURE_TYPE_PIPELINE_REPRESENTATIVE_FRAGMENT_TEST_STATE_CREATE_INFO_NV".."1000166001"
    )
}