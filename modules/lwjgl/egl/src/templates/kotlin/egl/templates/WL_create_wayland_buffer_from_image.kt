/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val WL_create_wayland_buffer_from_image = "WLCreateWaylandBufferFromImage".nativeClassEGL("WL_create_wayland_buffer_from_image", postfix = WL) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides an entry point to create a {@code wl_buffer} which shares its contents with a given {@code EGLImage}. The expected use case for
        this is in a nested Wayland compositor which is using subsurfaces to present buffers from its clients. Using this extension it can attach the client
        buffers directly to the subsurface without having to blit the contents into an intermediate buffer. The compositing can then be done in the parent
        compositor.

        The nested compositor can create an {@code EGLImage} from a client buffer resource using the existing ${WL_bind_wayland_display.link} extension. It
        should also be possible to create buffers using other types of images although there is no expected use case for that.

        Requires ${EGL14.core} and ${KHR_image_base.link}.
        """

    "struct wl_buffer".opaque.p(
        "CreateWaylandBufferFromImageWL",
        "",

        EGLDisplay("dpy", ""),
        EGLImageKHR("image", "")
    )
}