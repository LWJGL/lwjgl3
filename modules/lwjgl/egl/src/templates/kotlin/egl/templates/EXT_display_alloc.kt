/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_display_alloc = "EXTDisplayAlloc".nativeClassEGL("EXT_display_alloc", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        The existing semantics of {@code EGLDisplay} object lifetimes work well for applications in which one module manages all EGL usage, and in which EGL
        displays and the underlying native displays are expected to remain available until application termination once they are instantiated. However, EGL
        does not provide reasonable semantics for the following use cases:
        ${ol(
            "Applications that rely on toolkit libraries which use EGL independently from the application itself.",
            """
            Applications that use multiple native display objects with EGL and wish to completely release resources associated with EGLDisplay objects they no
            longer need.
            """,
            """
            Platforms where the native display connection can be closed, such as X11 or Wayland. If the native display is closed, then there's no possible
            reasonable behavior for an EGLDisplay.
            """
        )}

        This extension solves these problems by adding the ability to create multiple unique, unshared {@code EGLDisplay} objects from the same native display,
        and to destroy those {@code EGLDisplay} objects when the caller no longer needs them.
        """

    IntConstant(
        "Accepted as an attribute in the {@code attrib_list} parameter of #GetPlatformDisplay() and the {@code name} parameter of #QueryDisplayAttribEXT().",

        "ALLOC_NEW_DISPLAY_EXT"..0x3379
    )

    EGLBoolean(
        "DestroyDisplayEXT",
        """
        Destroys an {@code EGLDisplay} handle.

        If {@code dpy} is initialized, or if it is current to one or more threads, then is is marked for deletion, and it will be destroyed when it is
        terminated and no longer current.

        After {@code dpy} is destroyed, it is not valid to pass to any EGL function. Subsequent calls to #GetPlatformDisplay() may re-use the EGLDisplay handle
        value for new displays.

        If {@code dpy} was not created with the #ALLOC_NEW_DISPLAY_EXT attribute set to #TRUE, then an #BAD_ACCESS error is generated.
        """,

        EGLDisplay("dpy", "")
    )
}