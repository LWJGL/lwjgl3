/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val GEMERY_string_marker = "GREMEDYStringMarker".nativeClassGL("GREMEDY_string_marker", postfix = GREMEDY) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension defines a mechanism to insert textual markers into the OpenGL stream. 

        When debugging or profiling an OpenGL application some of the most important tools are stream loggers, which just output a list of the
        called OpenGL commands, and profilers, which show at which points the pipeline is bottlenecked for a given part of the frame.
        The problem in using these is that there is a definite loss of information between the application and the used debugger/profiler.

        This extension is really only useful for these debuggers and profilers, and not for actual drivers.
        """

    void(
        "StringMarkerGREMEDY",
        "",

        AutoSize("string")..GLsizei.IN("len", ""),
        const..GLcharUTF8_p.IN("string", "")
    )
}