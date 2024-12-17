/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_indirect_parameters = "ARBIndirectParameters".nativeClassGL("ARB_indirect_parameters", postfix = ARB) {
    IntConstant(
        "PARAMETER_BUFFER_ARB"..0x80EE
    )

    IntConstant(
        "PARAMETER_BUFFER_BINDING_ARB"..0x80EF
    )

    var src = GL43["MultiDrawArraysIndirect"]
    void(
        "MultiDrawArraysIndirectCountARB",

        src["mode"],
        Check("maxdrawcount * (stride == 0 ? (4 * 4) : stride)")..MultiType(
            PointerMapping.DATA_INT
        )..RawPointer..void.const.p("indirect"),
        GLintptr("drawcount"),
        GLsizei("maxdrawcount"),
        src["stride"]
    )

    src = GL43["MultiDrawElementsIndirect"]
    void(
        "MultiDrawElementsIndirectCountARB",

        src["mode"],
        src["type"],
        Check("maxdrawcount * (stride == 0 ? (5 * 4) : stride)")..MultiType(
            PointerMapping.DATA_INT
        )..RawPointer..void.const.p("indirect"),
        GLintptr("drawcount"),
        GLsizei("maxdrawcount"),
        src["stride"]
    )
}