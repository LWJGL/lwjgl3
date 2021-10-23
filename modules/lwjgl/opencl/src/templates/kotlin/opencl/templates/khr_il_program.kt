/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val khr_il_program = "KHRILProgram".nativeClassCL("khr_il_program", KHR) {
    documentation =
        """
        Native bindings to the $extensionName extension.

        This extension adds the ability to create programs with intermediate language (IL), usually SPIR-V. Further information about the format and contents
        of SPIR-V may be found in the SPIR-V Specification. Information about how SPIR-V modules behave in the OpenCL environment may be found in the OpenCL
        SPIR-V Environment Specification.

        This functionality described by this extension is a core feature in OpenCL 2.1.
        """

    IntConstant(
        """
        Accepted as a new {@code param_name} argument to #GetDeviceInfo(). ({@code char[]})
        
        The intermediate languages that are be supported by #CreateProgramWithILKHR() for this device.

        Returns a space separated list of IL version strings of the form:
        ${codeBlock("""
<IL_Prefix>_<Major_version>.<Minor_version>""")}

        A device that supports the {@code cl_khr_il_program} extension must support the “SPIR-V” IL prefix.
        """,

        "DEVICE_IL_VERSION_KHR"..0x105B
    )

    IntConstant(
        """
        Accepted as a new {@code param_name} argument to #GetProgramInfo(). ({@code unsigned char[]})
        
        Returns the program IL for programs created with #CreateProgramWithILKHR().

        If program is created with #CreateProgramWithSource(), #CreateProgramWithBinary(), or #CreateProgramWithBuiltInKernels(), the memory pointed to by
        {@code param_value} will be unchanged and {@code param_value_size_ret} will be set to zero.
        """,

        "PROGRAM_IL_KHR"..0x1169
    )

    cl_program(
        "CreateProgramWithILKHR",
        "Creates a new program object for context using the {@code length} bytes of intermediate language pointed to by {@code il}.",

        cl_context("context", "must be a valid OpenCL context"),
        void.const.p("il", "a pointer to a {@code length}-byte block of memory containing intermediate language"),
        AutoSize("il")..size_t("length", "the length of the block of memory pointed to by {@code il}"),
        ERROR_RET
    )
}