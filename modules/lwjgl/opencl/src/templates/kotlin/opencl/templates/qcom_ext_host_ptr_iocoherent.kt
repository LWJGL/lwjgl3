/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val qcom_ext_host_ptr_iocoherent = "QCOMEXTHostPtrIOCoherent".nativeClassCL("qcom_ext_host_ptr_iocoherent", QCOM) {
    IntConstant(
        "MEM_HOST_IOCOHERENT_QCOM"..0x40A9
    )
}