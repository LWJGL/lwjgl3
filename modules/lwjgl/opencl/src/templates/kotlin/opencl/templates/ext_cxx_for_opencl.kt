/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val ext_cxx_for_opencl = "EXTCXXForOpencl".nativeClassCL("ext_cxx_for_opencl", EXT) {
    documentation =
        """
        Native bindings to the $extensionLink extension.

        This extension adds support for building programs written using the C++ for OpenCL kernel language. It also enables applications to query the version
        of the language supported by the device compiler.
        
        This extension requires OpenCL 3.0 with OpenCL C 2.0 support or OpenCL 2.x and cl_khr_extended_versioning.
        """ // TODO

    IntConstant(
        "Accepted value for the {@code param_name} parameter to #GetDeviceInfo().",

        "DEVICE_CXX_FOR_OPENCL_NUMERIC_VERSION_EXT"..0x4230
    )
}
