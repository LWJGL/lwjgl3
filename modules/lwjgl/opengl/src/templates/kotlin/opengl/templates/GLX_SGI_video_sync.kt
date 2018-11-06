/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GLX_SGI_video_sync = "GLXSGIVideoSync".nativeClassGLX("GLX_SGI_video_sync", SGI) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides a means for synchronization with the video frame rate of a monitor.
        """

    GLint(
        "GetVideoSyncSGI",
        "Returns the value of the video sync counter in {@code count}. Zero is returned if the call is successful.",

        Check(1)..unsigned_int.p("count", "the video sync counter value")
    )

    GLint(
        "WaitVideoSyncSGI",
        """
        Puts the calling process to sleep until

        {@code (C mod D) = R}

        where {@code C} is the video sync counter, {@code D} is specified by the {@code divisor} parameter of {@code glXWaitVideoSyncSGI}, and {@code R} is
        specified by the {@code remainder} parameter of {@code glXWaitVideoSyncSGI}. {@code glXWaitVideoSyncSGI} returns the current video sync counter value in
        {@code count}. Zero is returned by {@code glXWaitVideoSyncSGI} if it is successful.
        """,

        int("divisor", "the divisor value"),
        int("remainder", "the remainder value"),
        Check(1)..unsigned_int.p("count", "the video sync counter value")
    )

}