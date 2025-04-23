/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val ext_buffer_device_address = "EXTBufferDeviceAddress".nativeClassCL("ext_buffer_device_address", EXT) {
    IntConstant(
        "MEM_DEVICE_PRIVATE_ADDRESS_EXT"..0x5000,
        "MEM_DEVICE_ADDRESS_EXT"..0x5001,
        "KERNEL_EXEC_INFO_DEVICE_PTRS_EXT"..0x5002
    )

    cl_int(
        "SetKernelArgDevicePointerEXT",

        cl_kernel("kernel"),
        cl_uint("arg_index"),
        cl_mem_device_address_ext("arg_value")
    )
}