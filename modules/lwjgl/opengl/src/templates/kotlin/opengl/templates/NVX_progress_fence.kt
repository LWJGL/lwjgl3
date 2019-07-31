/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NVX_progress_fence = "NVXProgressFence".nativeClassGL("NVX_progress_fence", postfix = NVX) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension uses the concept of GL semaphores as defined in ${EXT_semaphore.link} to better coordinate operations between multiple GPU command
        streams. A semaphore type called "progress fence" is derived from the GL semaphore. The progress fence semaphore is created by
        #CreateProgressFenceNVX()) returning the name of a newly created semaphore object. Like other semaphores, these are signaled by the GL server. Each
        signal operation is queued in the GPU command stream with an associated fence value that is written to the semaphore at the completion of a signal
        operation. 

        A GL server wait can be added to the command stream using #WaitSemaphoreui64NVX(). This blocks the GPU until the progress fence semaphore reaches or
        exceeds the specified fence value.

        A GL client wait can be initiated using #ClientWaitSemaphoreui64NVX(). This blocks the CPU until the specified fence value is reached.    
    
        Requires {@code EXT_external_objects} and {@code EXT_external_objects_win32}.
        """

    GLuint(
        "CreateProgressFenceNVX",
        "",

        void()
    )

    void(
        "SignalSemaphoreui64NVX",
        "",

        GLuint("signalGpu", ""),
        AutoSize("semaphoreArray", "fenceValueArray")..GLsizei("fenceObjectCount", ""),
        GLuint.const.p("semaphoreArray", ""),
        GLuint64.const.p("fenceValueArray", "")
    )

    void(
        "WaitSemaphoreui64NVX",
        "",

        GLuint("waitGpu", ""),
        AutoSize("semaphoreArray", "fenceValueArray")..GLsizei("fenceObjectCount", ""),
        GLuint.const.p("semaphoreArray", ""),
        GLuint64.const.p("fenceValueArray", "")
    )

    void(
        "ClientWaitSemaphoreui64NVX",
        "",

        AutoSize("semaphoreArray", "fenceValueArray")..GLsizei("fenceObjectCount", ""),
        GLuint.const.p("semaphoreArray", ""),
        GLuint64.const.p("fenceValueArray", "")
    )
}
