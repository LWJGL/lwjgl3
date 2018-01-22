/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val intel_driver_diagnostics = "INTELDriverDiagnostics".nativeClassCL("intel_driver_diagnostics", INTEL) {
    documentation =
        """
        Native bindings to the $extensionLink extension.

        The OpenCL specification allows registering a callback function during OpenCL context creation that will be called whenever there is an error. This
        extension extends this mechanism by allowing the driver to pass additional strings containing diagnostic information. The diagnostic messages can help
        to understand how the driver works and can provide guidance to modify an application to improve performance.

        Requires ${CL12.link}.
        """

    IntConstant(
        "Accepted as a property name in the {@code properties} parameter of #CreateContext() and #CreateContextFromType().",

        "CONTEXT_SHOW_DIAGNOSTICS_INTEL"..0x4106
    )

    EnumConstant(
        """
        The value for the property #CONTEXT_SHOW_DIAGNOSTICS_INTEL is a bitfield of type {@code cl_diagnostic_verbose_level_intel} that controls the types of
        diagnostic messages that are reported.
        """,

        "CONTEXT_DIAGNOSTICS_LEVEL_GOOD_INTEL".enum(
            "Messages under good verbose level report good use cases to verify that the driver is used properly and optimally.",
            0x1
        ),
        "CONTEXT_DIAGNOSTICS_LEVEL_BAD_INTEL".enum(
            "Messages under bad verbose level report cases that may result in degraded performance.",
            0x2
        ),
        "CONTEXT_DIAGNOSTICS_LEVEL_NEUTRAL_INTEL".enum(
            """
            Messages under neutral verbose level report cases that may or may not have performance implications. Additionally, neutral diagnostic messages may
            inform developers about specific internal driver properties.
            """,
            0x4
        )
    )
}