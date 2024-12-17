/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val intel_create_buffer_with_properties = "INTELCreateBufferWithProperties".nativeClassCL("intel_create_buffer_with_properties", INTEL) {
    cl_mem(
        "CreateBufferWithPropertiesINTEL",

        cl_context("context"),
        nullable..NullTerminated..cl_mem_properties_intel.const.p("properties"),
        cl_mem_flags("flags"),
        AutoSize("host_ptr")..size_t("size"),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE
        )..optional..void.p("host_ptr"),
        ERROR_RET
    )
}
