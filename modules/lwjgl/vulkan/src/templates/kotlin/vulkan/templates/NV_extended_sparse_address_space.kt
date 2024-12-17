/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_extended_sparse_address_space = "NVExtendedSparseAddressSpace".nativeClassVK("NV_extended_sparse_address_space", type = "device", postfix = "NV") {
    IntConstant(
        "NV_EXTENDED_SPARSE_ADDRESS_SPACE_SPEC_VERSION".."1"
    )

    StringConstant(
        "NV_EXTENDED_SPARSE_ADDRESS_SPACE_EXTENSION_NAME".."VK_NV_extended_sparse_address_space"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_SPARSE_ADDRESS_SPACE_FEATURES_NV".."1000492000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_SPARSE_ADDRESS_SPACE_PROPERTIES_NV".."1000492001"
    )
}