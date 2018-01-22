/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val EXT_stream_consumer_egloutput = "EXTStreamConsumerEGLOutput".nativeClassEGL("EXT_stream_consumer_egloutput", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Increasingly, EGL and its client APIs are being used in place of "native" rendering APIs to implement the basic graphics functionality of native
        windowing systems. This creates demand for a method to initialize EGL displays and surfaces directly on top of native GPU or device objects rather than
        native window system objects. The mechanics of enumerating the underlying native devices and constructing EGL displays and surfaces from them have been
        solved in various platform and implementation- specific ways. The EGL device family of extensions offers a standardized framework for bootstrapping EGL
        without the use of any underlying "native" APIs or functionality.

        This extension describes how to bind EGLOutputLayerEXTs as stream consumers to send rendering directly to a display device without an intervening
        window system.

         Requires ${KHR_stream.link} and ${EXT_output_base.link}.
        """

    EGLBoolean(
        "StreamConsumerOutputEXT",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLStreamKHR.IN("stream", ""),
        EGLOutputLayerEXT.IN("layer", "")
    )
}