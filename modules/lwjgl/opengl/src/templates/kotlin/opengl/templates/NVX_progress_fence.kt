/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NVX_progress_fence = "NVXProgressFence".nativeClassGL("NVX_progress_fence", postfix = NVX) {
    GLuint(
        "CreateProgressFenceNVX",

        void()
    )

    void(
        "SignalSemaphoreui64NVX",

        GLuint("signalGpu"),
        AutoSize("semaphoreArray", "fenceValueArray")..GLsizei("fenceObjectCount"),
        GLuint.const.p("semaphoreArray"),
        GLuint64.const.p("fenceValueArray")
    )

    void(
        "WaitSemaphoreui64NVX",

        GLuint("waitGpu"),
        AutoSize("semaphoreArray", "fenceValueArray")..GLsizei("fenceObjectCount"),
        GLuint.const.p("semaphoreArray"),
        GLuint64.const.p("fenceValueArray")
    )

    void(
        "ClientWaitSemaphoreui64NVX",

        AutoSize("semaphoreArray", "fenceValueArray")..GLsizei("fenceObjectCount"),
        GLuint.const.p("semaphoreArray"),
        GLuint64.const.p("fenceValueArray")
    )
}
