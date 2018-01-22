/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val ANDROID_presentation_time = "ANDROIDPresentationTime".nativeClassEGL("ANDROID_presentation_time", postfix = ANDROID) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Often when rendering a sequence of images, there is some time at which each image is intended to be presented to the viewer. This extension allows this
        desired presentation time to be specified for each frame rendered to an {@code EGLSurface}, allowing the native window system to use it.
        """

    EGLBoolean(
        "PresentationTimeANDROID",
        """
        Specifies the time at which the current color buffer of {@code surface} should be presented to the viewer. The {@code time} parameter should be a time
        in nanoseconds, but the exact meaning of the time depends on the native window system's use of the presentation time. In situations where an absolute
        time is needed such as displaying the color buffer on a display device, the time should correspond to the system monotonic up-time clock. For situations
        in which an absolute time is not needed such as using the color buffer for video encoding, the presentation time of the first frame may be arbitrarily
        chosen and those of subsequent frames chosen relative to that of the first frame.

        The presentation time may be set multiple times, with each call to {@code eglPresentationTimeANDROID} overriding prior calls. Setting the presentation
        time alone does not cause the color buffer to be made visible, but if the color buffer is subsequently posted to a native window or copied to a native
        pixmap then the presentation time of the surface at that time may be passed along for the native window system to use.

        If the surface presentation time is successfully set, #TRUE is returned. Otherwise #FALSE is returned and an appropriate error is set. If {@code dpy}
        is not the name of a valid, initialized {@code EGLDisplay}, an #BAD_DISPLAY error is generated. If {@code surface} is not a valid {@code EGLSurface}
        then an #BAD_SURFACE error is generated.
        """,

        EGLDisplay.IN("dpy", "the {@code EGLDisplay}"),
        EGLSurface.IN("surface", "the {@code EGLSurface}"),
        EGLnsecsANDROID.IN("time", "the presentation time")
    )
}