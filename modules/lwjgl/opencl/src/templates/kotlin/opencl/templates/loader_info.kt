/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val loader_info = "LOADERInfo".nativeClassCL("loader_info") {
    IntConstant(
        "ICDL_OCL_VERSION".."1",
        "ICDL_VERSION".."2",
        "ICDL_NAME".."3",
        "ICDL_VENDOR".."4",
    )

    cl_int(
        "GetICDLoaderInfoOCLICD",

        cl_icdl_info("param_name"),
        PARAM_VALUE_SIZE,
        MultiType(
            PointerMapping.DATA_INT,
            PointerMapping.DATA_POINTER
        )..nullable..void.p("param_value"),
        PARAM_VALUE_SIZE_RET
    )
}
