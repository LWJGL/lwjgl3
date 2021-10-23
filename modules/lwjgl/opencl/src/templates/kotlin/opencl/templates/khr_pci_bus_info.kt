/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val khr_pci_bus_info = "KHRPCIBusInfo".nativeClassCL("khr_pci_bus_info", KHR) {
    documentation =
        """
        Native bindings to the $extensionName extension.
        
        This extension adds a new query to obtain PCI bus information about an OpenCL device.

        Not all OpenCL devices have PCI bus information, either due to the device not being connected to the system through a PCI interface or due to platform
        specific restrictions and policies. Thus this extension is only expected to be supported by OpenCL devices which can provide the information.

        As a consequence, applications should always check for the presence of the extension string for each individual OpenCL device for which they intend to
        issue the new query for and should not have any assumptions about the availability of the extension on any given platform.
        """

    IntConstant(
        "Accepted value for the {@code param_name} parameter to #GetDeviceInfo().",

        "DEVICE_PCI_BUS_INFO_KHR"..0x410F
    )
}