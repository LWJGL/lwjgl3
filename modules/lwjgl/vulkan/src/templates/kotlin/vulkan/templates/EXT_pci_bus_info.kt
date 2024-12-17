/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_pci_bus_info = "EXTPciBusInfo".nativeClassVK("EXT_pci_bus_info", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_PCI_BUS_INFO_SPEC_VERSION".."2"
    )

    StringConstant(
        "EXT_PCI_BUS_INFO_EXTENSION_NAME".."VK_EXT_pci_bus_info"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PCI_BUS_INFO_PROPERTIES_EXT".."1000212000"
    )
}