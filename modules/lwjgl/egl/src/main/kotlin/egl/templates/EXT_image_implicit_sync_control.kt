/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_image_implicit_sync_control = "EXTImageImplicitSyncControl".nativeClassEGL("EXT_image_implicit_sync_control", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension allows a client to selectively use implicit or explicit synchronization mechanisms when addressing externally-imported
        {@code EGLImages}. A new token is added to {@code EGLImage} creation which allows the client to select whether a platform's implicit synchronization
        will be in use for a buffer imported into {@code EGLImage}.

        Heterogeneous systems (supporting multiple APIs, mixed legacy/updated clients, etc) already supporting implicit synchronization, may not be able to
        change to explict synchronization in a single switch. This extension allows synchronization to be controlled on a per-buffer basis, so explicit
        synchronization can be enabled for a complete pipeline which supports it, or implicit synchronization used otherwise.

        Requires ${EGL12.core}, ${KHR_image_base.link} and ${EXT_image_dma_buf_import.link}.
        """

    IntConstant(
        "Accepted as an attribute in the {@code attrib_list} parameter of #CreateImageKHR().",

        "IMPORT_SYNC_TYPE_EXT"..0x3470
    )

    IntConstant(
        "Accepted as the value for the #IMPORT_SYNC_TYPE_EXT attribute.",

        "IMPORT_IMPLICIT_SYNC_EXT"..0x3471,
        "IMPORT_EXPLICIT_SYNC_EXT"..0x3472
    )
}