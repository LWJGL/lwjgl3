/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class EXTBufferDeviceAddress {

    public static final int
        CL_MEM_DEVICE_PRIVATE_ADDRESS_EXT   = 0x5000,
        CL_MEM_DEVICE_ADDRESS_EXT           = 0x5001,
        CL_KERNEL_EXEC_INFO_DEVICE_PTRS_EXT = 0x5002;

    protected EXTBufferDeviceAddress() {
        throw new UnsupportedOperationException();
    }

    // --- [ clSetKernelArgDevicePointerEXT ] ---

    /** {@code cl_int clSetKernelArgDevicePointerEXT(cl_kernel kernel, cl_uint arg_index, cl_mem_device_address_ext arg_value)} */
    @NativeType("cl_int")
    public static int clSetKernelArgDevicePointerEXT(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("cl_mem_device_address_ext") long arg_value) {
        long __functionAddress = CL.getICD().clSetKernelArgDevicePointerEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(kernel);
        }
        return callPJI(kernel, arg_index, arg_value, __functionAddress);
    }

}