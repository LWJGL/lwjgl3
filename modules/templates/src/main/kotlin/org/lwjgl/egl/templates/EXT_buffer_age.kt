/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val EXT_buffer_age = "EXTBufferAge".nativeClassEGL("EXT_buffer_age", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        The aim of this extension is to expose enough information to applications about how the driver manages the set of front and back buffers associated
        with a given surface to allow applications to re-use the contents of old frames and minimize how much must be redrawn for the next frame.

        There are lots of different ways for a driver to manage these buffers, from double buffering, different styles of triple buffering and even n-buffering
        or simply single buffer rendering. We also need to consider that power management events or memory pressure events might also result in some of the
        buffers not currently in-use being freed.

        This extension lets applications query the age of the back buffer contents for an EGL surface as the number of frames elapsed since the contents were
        most recently defined. The back buffer can either be reported as invalid (has an age of 0) or it may be reported to contain the contents from n frames
        prior to the current frame.

        Once the application has queried the buffer age, the age of contents remains valid until the end of the frame for all pixels that continue to pass the
        pixel ownership test.

        For many use-cases this extension can provide an efficient alternative to using the EGL_BUFFER_PRESERVED swap behaviour. The EGL_BUFFER_PRESERVED swap
        behaviour adds a direct dependency for any frame n on frame n - 1 which can affect the pipelining of multiple frames but also implies a costly
        copy-back of data to initialize the back-buffer at the start of each frame.

        For example if you consider a double buffered application drawing a small spinning icon, but everything else in the scene is static. If we know that 2
        buffers are continuously being recycled each time eglSwapBuffers is called then even though 100s of frames may need to be drawn to animate the icon it
        can be seen that the two buffers are remaining unchanged except within the bounds of the icon. In this scenario ideally the application would simply
        perform an incremental update of the old buffer instead of redundantly redrawing all the static parts of the scene. The problem up until now though has
        been that EGL doesn't report how buffers may be recycled so it wasn't safe for applications to try and reuse their contents. Now applications can keep
        track of all the regions that have changed over the last n frames and by knowing the age of the buffer they know how to efficiently repair buffers that
        are re-cycled instead of redrawing the entire scene.

        Requires ${EGL14.core}.
        """

    IntConstant(
        "",

        "BUFFER_AGE_EXT"..0x313D
    )
}