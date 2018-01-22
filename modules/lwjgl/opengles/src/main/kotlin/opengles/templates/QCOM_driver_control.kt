/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

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

        nullable..Check(1)..GLint_p.OUT("num", ""),
        AutoSize("driverControls")..GLsizei.IN("size", ""),
        nullable..GLuint_p.OUT("driverControls", "")
    )

    void(
        "GetDriverControlStringQCOM",
        "",

        GLuint.IN("driverControl", ""),
        AutoSize("driverControlString")..GLsizei.IN("bufSize", ""),
        nullable..Check(1)..GLsizei_p.OUT("length", ""),
        Return("length")..nullable..GLcharASCII_p.OUT("driverControlString", "")
    )

    void(
        "EnableDriverControlQCOM",
        "",

        GLuint.IN("driverControl", "")
    )

    void(
        "DisableDriverControlQCOM",
        "",

        GLuint.IN("driverControl", "")
    )
}