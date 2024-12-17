/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val MSFT_layered_driver = "MSFTLayeredDriver".nativeClassVK("MSFT_layered_driver", type = "device", postfix = "MSFT") {
    IntConstant(
        "MSFT_LAYERED_DRIVER_SPEC_VERSION".."1"
    )

    StringConstant(
        "MSFT_LAYERED_DRIVER_EXTENSION_NAME".."VK_MSFT_layered_driver"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_DRIVER_PROPERTIES_MSFT".."1000530000"
    )

    EnumConstant(
        "LAYERED_DRIVER_UNDERLYING_API_NONE_MSFT".."0",
        "LAYERED_DRIVER_UNDERLYING_API_D3D12_MSFT".."1"
    )
}