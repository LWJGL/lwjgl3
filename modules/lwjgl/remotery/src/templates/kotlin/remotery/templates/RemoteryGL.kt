/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package remotery.templates

import org.lwjgl.generator.*
import remotery.*

val RemoteryGL = "RemoteryGL".nativeClass(Module.REMOTERY, prefix = "RMT_") {
    remoteryIncludes("h")

    documentation =
        "Remotery profiling for OpenGL."

    void(
        "BindOpenGL",
        ""
    )

    void(
        "UnbindOpenGL",
        ""
    )

    Code(
        nativeCall = "${t}_rmt_BeginOpenGLSample(name, hash_cache);"
    )..void(
        "BeginOpenGLSample",
        "",

        rmtPStr("name", ""),
        Check(1)..nullable..rmtU32.p("hash_cache", "")
    )

    void(
        "EndOpenGLSample",
        ""
    )
}