/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_client_sync = "EXTClientSync".nativeClassEGL("EXT_client_sync", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        The ${KHR_reusable_sync.link} extension defines an #SYNC_REUSABLE_KHR {@code EGLSync} type which is signaled and unsignaled by client events. The
        ${EXT_sync_reuse.link} extension allows all {@code EGLSyncs} to become reusable. The signaling behavior associated with {@code EGL_SYNC_REUSABLE_KHR}
        is still desirable, but the name becomes misleading if all {@code EGLSyncs} can be reused. This extension defines an {@code EGLSync} type with
        equivalent behavior, separating the signaling mechanism from the reusability.

        Requires ${EXT_sync_reuse.link}.
        """

    IntConstant(
        """
        Accepted by the {@code type} parameter of #CreateSync(), and returned in {@code value} when #GetSyncAttrib() is called with {@code attribute}
        #SYNC_TYPE.
        """,

        "SYNC_CLIENT_EXT"..0x3364
    )

    IntConstant(
        "Returned in {@code value} when #GetSyncAttrib() is called with attribute #SYNC_CONDITION.",

        "SYNC_CLIENT_SIGNAL_EXT"..0x3365
    )


    EGLBoolean(
        "ClientSignalSyncEXT",
        "",

        EGLDisplay("dpy", ""),
        EGLSync("sync", ""),
        nullable..noneTerminated..EGLAttrib.const.p("attrib_list", "")
    )
}