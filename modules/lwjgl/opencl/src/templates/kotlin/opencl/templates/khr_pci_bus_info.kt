/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val khr_pci_bus_info = "KHRPCIBusInfo".nativeClassCL("khr_pci_bus_info", KHR) {
    IntConstant(
        "DEVICE_PCI_BUS_INFO_KHR"..0x410F
    )
}