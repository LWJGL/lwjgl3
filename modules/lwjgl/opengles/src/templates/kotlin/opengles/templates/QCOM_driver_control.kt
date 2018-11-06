/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val QCOM_driver_control = "QCOMDriverControl".nativeClassGLES("QCOM_driver_control", postfix = QCOM) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension exposes special control features in a driver to a developer. A use of these controls would be to override state or implement special
        modes of operation. One common example might be an IFH or infinitely fast hardware mode. In this mode none of draw commands would be sent to the GPU so
        no image would be displayed, but all the driver software overhead would still happen thus enabling developers to analyze driver overhead separate from
        GPU performance. Some uses of this extension could invalidate future rendering and thus should only be used by developers for debugging and performance
        profiling purposes.

        The extension is general enough to allow the implementation to choose which controls to expose and to provide a textual description of those controls
        to developers.
        """

    void(
        "GetDriverControlsQCOM",
        "",

        nullable..Check(1)..GLint.p("num", ""),
        AutoSize("driverControls")..GLsizei("size", ""),
        nullable..GLuint.p("driverControls", "")
    )

    void(
        "GetDriverControlStringQCOM",
        "",

        GLuint("driverControl", ""),
        AutoSize("driverControlString")..GLsizei("bufSize", ""),
        nullable..Check(1)..GLsizei.p("length", ""),
        Return("length")..nullable..GLcharASCII.p("driverControlString", "")
    )

    void(
        "EnableDriverControlQCOM",
        "",

        GLuint("driverControl", "")
    )

    void(
        "DisableDriverControlQCOM",
        "",

        GLuint("driverControl", "")
    )
}