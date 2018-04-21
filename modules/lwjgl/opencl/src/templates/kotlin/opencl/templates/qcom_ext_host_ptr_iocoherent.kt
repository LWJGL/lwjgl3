/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val qcom_ext_host_ptr_iocoherent = "QCOMEXTHostPtrIOCoherent".nativeClassCL("qcom_ext_host_ptr_iocoherent", QCOM) {
    documentation =
        """
        Native bindings to the $extensionLink extension.

        This extension extends the functionality provided by {@code cl_qcom_ext_host_ptr} by adding a new host cache policy. It allows applications to specify
        a new value, #MEM_HOST_IOCOHERENT_QCOM, for {@code cl_mem_ext_host_ptr::host_cache_policy}. When the application selects this value for host cache
        policy, the imported allocation is mapped as io-coherent for the GPU. This in turn avoids the need for the OpenCL driver to explicitly issue CPU cache
        operation calls. Although GPU performance can be slower in some cases for io-coherent allocations, the overall performance can improve due to the
        elimination of explicit CPU cache operations.

        Requires ${CL11.link} and ${qcom_ext_host_ptr.link}.
        """

        IntConstant(
        "New accepted value for {@code cl_mem_ext_host_ptr::host_cache_policy}.",

        "MEM_HOST_IOCOHERENT_QCOM"..0x40A9
    )
}