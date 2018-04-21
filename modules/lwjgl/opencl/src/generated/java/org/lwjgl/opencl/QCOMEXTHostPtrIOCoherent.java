/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/**
 * Native bindings to the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/qcom/cl_qcom_ext_host_ptr_iocoherent.txt">qcom_ext_host_ptr_iocoherent</a> extension.
 * 
 * <p>This extension extends the functionality provided by {@code cl_qcom_ext_host_ptr} by adding a new host cache policy. It allows applications to specify
 * a new value, {@link #CL_MEM_HOST_IOCOHERENT_QCOM MEM_HOST_IOCOHERENT_QCOM}, for {@code cl_mem_ext_host_ptr::host_cache_policy}. When the application selects this value for host cache
 * policy, the imported allocation is mapped as io-coherent for the GPU. This in turn avoids the need for the OpenCL driver to explicitly issue CPU cache
 * operation calls. Although GPU performance can be slower in some cases for io-coherent allocations, the overall performance can improve due to the
 * elimination of explicit CPU cache operations.</p>
 * 
 * <p>Requires {@link CL11 CL11} and {@link QCOMEXTHostPtr qcom_ext_host_ptr}.</p>
 */
public final class QCOMEXTHostPtrIOCoherent {

    /** New accepted value for {@code cl_mem_ext_host_ptr::host_cache_policy}. */
    public static final int CL_MEM_HOST_IOCOHERENT_QCOM = 0x40A9;

    private QCOMEXTHostPtrIOCoherent() {}

}