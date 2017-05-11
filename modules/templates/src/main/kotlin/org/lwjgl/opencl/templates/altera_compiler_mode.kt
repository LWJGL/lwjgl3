/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val altera_compiler_mode = "ALTERACompilerMode".nativeClassCL("altera_compiler_mode", ALTERA) {
    documentation =
        """
        Native bindings to the $extensionName extension.

        This extension specifies alternative device code compilation flows for OpenCL.

        In standard OpenCL, there are two methods for preparing code for execution on an OpenCL device. The first is to compile OpenCL C code from source text
        using an online compiler. The second is to load a precompiled device binary.

        This extension specifies mechanisms to enable alternative workflows for compiling and loading device code. They enable simplified or optimized support
        for the following development and deployment scenarios:
        ${ul(
            "The target OpenCL device is not available in the development environment.",
            """
            The platform does not provide an online compiler for the target OpenCL device, or full online compilation is not desirable during host application
            development.
            """,
            "The application only requires one device program, and does not need read access to the device binary."
        )}
        The development and deployment of a particular application may involve more than one of these scenarios.
        """

    IntConstant(
        "New context properties to be used in the {@code properties} array supplied to to #CreateContext() or #CreateContextFromType().",

        "CONTEXT_COMPILER_MODE_ALTERA"..0x40F0,
        "CONTEXT_PROGRAM_EXE_LIBRARY_ROOT_ALTERA"..0x40F1,
        "CONTEXT_OFFLINE_DEVICE_ALTERA"..0x40F2
    )

    IntConstant(
        "Values to be supplied for context property #CONTEXT_COMPILER_MODE_ALTERA.",

        "CONTEXT_COMPILER_MODE_OFFLINE_ALTERA".."0",
        "CONTEXT_COMPILER_MODE_OFFLINE_CREATE_EXE_LIBRARY_ALTERA".."1",
        "CONTEXT_COMPILER_MODE_OFFLINE_USE_EXE_LIBRARY_ALTERA".."2",
        "CONTEXT_COMPILER_MODE_PRELOADED_BINARY_ONLY_ALTERA".."3"
    )
}