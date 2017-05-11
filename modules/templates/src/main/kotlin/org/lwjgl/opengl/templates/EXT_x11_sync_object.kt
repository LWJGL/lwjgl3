/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val EXT_x11_sync_object = "EXTX11SyncObject".nativeClassGL("EXT_x11_sync_object", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Synchronization objects added the ability to better coordinate operations between multiple GL command streams. However, it is desirable to have the
        same level of coordination between GL command streams and external rendering APIs. This extension introduces two new concepts to build upon the
        synchronization infrastructure provided by ${ARB_sync.link}:
        ${ol(
            "A means to import an X Synchronization Fence object into the GL and use it as a sync object.",
            "The concept of a reusable sync object."
        )}
        The latter is necessary because the import operation is expensive and performing it every time a synchronization point was reached would make the
        synchronization prohibitively slow.

        This extension stops short of allowing the GL to change the state of imported/reusable sync objects, but does not add any language that would prohibit
        such functionality from being added in a subsequent extension.

        Requires ${GL32.core} or ${ARB_sync.link}.
        """

    IntConstant(
        "Accepted by the {@code external_sync_type} parameter of ImportSyncEXT.",

        "SYNC_X11_FENCE_EXT"..0x90E1
    )

    GLsync(
        "ImportSyncEXT",
        "Creates a GL sync object of the type {@code external_sync_type} based on the object referred to by {@code external_sync}.",

        GLenum.IN("external_sync_type", "the external sync object type", "#SYNC_X11_FENCE_EXT"),
        GLintptr.IN("external_sync", "the external sync object. Must be the XID of a valid X11 Synchronization Fence object"),
        GLbitfield.IN("flags", "Must be 0.")
    )
}