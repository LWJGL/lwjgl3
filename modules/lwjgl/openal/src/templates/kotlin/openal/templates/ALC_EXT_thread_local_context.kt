/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val ALC_EXT_thread_local_context = "EXTThreadLocalContext".nativeClassALC("EXT_thread_local_context") {
    ALCboolean(
        "SetThreadContext",

        nullable..ALCcontext.p("context")
    )

    ALCcontext.p(
        "GetThreadContext",
        void()
    )
}