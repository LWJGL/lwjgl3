/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.util.remotery.templates

import org.lwjgl.generator.*
import org.lwjgl.util.remotery.*

val RemoteryMetal = "RemoteryMetal".nativeClass(packageName = REMOTERY_PACKAGE, prefix = "RMT_", library = REMOTERY_LIBRARY) {
    remoteryIncludes("h")

    documentation =
        "Remotery profiling for OpenGL."

    void(
        "BindMetal",
        "",

        id.IN("command_buffer", "")
    )

    void(
        "UnbindMetal",
        ""
    )

    Code(
        nativeCall = "${t}_rmt_BeginMetalSample(name, hash_cache);"
    )..void(
        "BeginMetalSample",
        "",

        rmtPStr.IN("name", ""),
        Check(1)..nullable..rmtU32.p.INOUT("hash_cache", "")
    )

    void(
        "EndMetalSample",
        ""
    )
}