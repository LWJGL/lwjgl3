/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val KHR_display_reference = "KHRDisplayReference".nativeClassEGL("KHR_display_reference", postfix = KHR) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        The existing semantics of {@code EGLDisplay} object lifetimes work well for applications in which one module manages all EGL usage, and in which EGL
        displays are expected to remain available until application termination once they are instantiated. However, EGL does not provide reasonable semantics
        in the case where applications rely on toolkit libraries which use EGL independently from the application itself.

        This issue can be solved by adding a per-{@code EGLDisplay} reference counter which is incremented by #Initialize() calls. Resource destruction can
        then be deferred until a corresponding number of #Terminate() calls is made. However, switching to this behavior universally could cause backwards
        incompatibility problems with existing applications that assume a single {@code eglTerminate} will immediately free resources regardless of how many
        times the display has been initialized.

        We therefore must support both behaviors. A new attribute specified when the {@code EGLDisplay} is obtained will indicate whether or not reference
        counting is enabled. If an application requests the {@code EGLDisplay} multiple times with different values for this attribute, two separate displays
        will be returned. The one potential drawaback is that these displays will have independent resource spaces, so objects allocated from one cannot be
        used by the other. However, the goal here is to support modules that access EGL independently. In such a use case, they are not likely to need to share
        resources with another module, particularly one that uses a different method for accessing the display.

        Requires ${EXT_platform_base.link} or ${EGL15.core}
        """

    IntConstant(
        "Accepted as an attribute in the {@code attrib_list} parameter of #GetPlatformDisplay() and the {@code name} parameter of #QueryDisplayAttribKHR().",

        "TRACK_REFERENCES_KHR"..0x3352
    )

    EGLBoolean(
        "QueryDisplayAttribKHR",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLint.IN("name", ""),
        Check(1)..EGLAttrib_p.OUT("value", "")
    )
}