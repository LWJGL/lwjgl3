/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val altera_compiler_mode = "ALTERACompilerMode".nativeClassCL("altera_compiler_mode", ALTERA) {
    IntConstant(
        "CONTEXT_COMPILER_MODE_ALTERA"..0x40F0,
        "CONTEXT_PROGRAM_EXE_LIBRARY_ROOT_ALTERA"..0x40F1,
        "CONTEXT_OFFLINE_DEVICE_ALTERA"..0x40F2
    )

    IntConstant(
        "CONTEXT_COMPILER_MODE_OFFLINE_ALTERA".."0",
        "CONTEXT_COMPILER_MODE_OFFLINE_CREATE_EXE_LIBRARY_ALTERA".."1",
        "CONTEXT_COMPILER_MODE_OFFLINE_USE_EXE_LIBRARY_ALTERA".."2",
        "CONTEXT_COMPILER_MODE_PRELOADED_BINARY_ONLY_ALTERA".."3"
    )
}