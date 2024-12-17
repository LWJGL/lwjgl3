/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val QCOM_driver_control = "QCOMDriverControl".nativeClassGLES("QCOM_driver_control", postfix = QCOM) {
    void(
        "GetDriverControlsQCOM",

        nullable..Check(1)..GLint.p("num"),
        AutoSize("driverControls")..GLsizei("size"),
        nullable..GLuint.p("driverControls")
    )

    void(
        "GetDriverControlStringQCOM",

        GLuint("driverControl"),
        AutoSize("driverControlString")..GLsizei("bufSize"),
        nullable..Check(1)..GLsizei.p("length"),
        Return("length")..nullable..GLcharASCII.p("driverControlString")
    )

    void(
        "EnableDriverControlQCOM",

        GLuint("driverControl")
    )

    void(
        "DisableDriverControlQCOM",

        GLuint("driverControl")
    )
}