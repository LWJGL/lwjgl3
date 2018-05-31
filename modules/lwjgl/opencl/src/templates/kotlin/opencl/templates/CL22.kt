/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val CL22 = "CL22".nativeClassCL("CL22") {
    extends = CL21
    documentation = "The core OpenCL 2.2 functionality."

    IntConstant(
        "OpenCL Version.",

        "VERSION_2_2".."1"
    )

    IntConstant(
        "Error Codes",

        "INVALID_SPEC_ID".."-71",
        "MAX_SIZE_RESTRICTION_EXCEEDED".."-72"
    )

    IntConstant(
        "cl_program_info",

        "PROGRAM_SCOPE_GLOBAL_CTORS_PRESENT"..0x116A,
        "PROGRAM_SCOPE_GLOBAL_DTORS_PRESENT"..0x116B
    )

    cl_int(
        "SetProgramReleaseCallback",
        """
        Registers a user callback function with a program object.

        Each call to {@code clSetProgramReleaseCallback} registers the specified user callback function on a callback stack associated with program. The
        registered user callback functions are called in the reverse order in which they were registered. The user callback functions are called after
        destructors (if any) for program scope global variables (if any) are called and before the program is released. This provides a mechanism for the
        application (and libraries) to be notified when destructors are complete.
        """,

        cl_program.IN("program", "a valid program object"),
        cl_program_release_callback.IN(
            "pfn_notify",
            """
            the callback function that can be registered by the application. This callback function may be called asynchronously by the OpenCL implementation.
            It is the applications responsibility to ensure that the callback function is thread safe.
            """
        ),
        nullable..opaque_p.IN(
            "user_data",
            """
            a pointer to user supplied data. {@code user_data} will be passed as the {@code user_data} argument when {@code pfn_notify} is called.
            {@code user_data} can be #NULL.
            """
        )
    )

    cl_int(
        "SetProgramSpecializationConstant",
        """
        Sets the values of a SPIR-V specialization constants.

            Calling this function multiple times for the same specialization constant shall cause the last provided value to override any previously specified
            value. The values are used by a subsequent #BuildProgram() call for the program.

        Application is not required to provide values for every specialization constant contained in SPIR-V module. SPIR-V provides default values for all
        specialization constants.
        """,

        cl_program.IN("program", "must be a valid OpenCL program created from a SPIR-V module"),
        cl_uint.IN("spec_id", "identifies the SPIR-V specialization constant whose value will be set"),
        AutoSize("spec_value")..size_t.IN(
            "spec_size",
            """
            specifies the size in bytes of the data pointed to by {@code spec_value}. This should be 1 for boolean constants. For all other constant types this
            should match the size of the specialization constant in the SPIR-V module.
            """
        ),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_LONG,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE
        )..void.const.p.IN(
            "spec_value",
            """
            a pointer to the memory location that contains the value of the specialization constant. The data pointed to by {@code spec_value} are copied and
            can be safely reused by the application after {@code clSetProgramSpecializationConstant} returns. This specialization value will be used by
            subsequent calls to #BuildProgram() until another call to {@code clSetProgramSpecializationConstant} changes it. If a specialization constant is a
            boolean constant, {@code spec_value} should be a pointer to a {@code cl_uchar} value. A value of zero will set the specialization constant to
            false; any other value will set it to true.
            """
        ),

        returnDoc =
        """
        #SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
        ${ul(
            "#INVALID_PROGRAM if {@code program} is not a valid program object created from a SPIR-V module.",
            "#INVALID_SPEC_ID if {@code spec_id} is not a valid specialization constant ID",
            """
            #INVALID_VALUE if {@code spec_size} does not match the size of the specialization constant in the SPIR-V module, or if {@code spec_value} is
            #NULL.
            """,
            OORE,
            OOHME
        )}
        """
    )
}