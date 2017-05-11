/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val GLX_EXT_stereo_tree = "GLXEXTStereoTree".nativeClassGLX("GLX_EXT_stereo_tree", EXT) {
    documentation =
        """
        Native bindings to the ${registryLink("EXT", "glx_stereo_tree")} extension.

        When using stereoscopic rendering with the X composite extension, a stereo-aware GLX composite manager can be used to composite both the left and right
        buffers of a window's backing pixmap to the left and right buffers of the root or composite overlay window to preserve the stereo effect of a
        redirected window or any of its child windows. However, to do this, the composite manager needs a method to determine which windows have both left and
        right buffers available without needing to walk entire window trees or be aware of other clients' GLX drawables.

        This extension provides a new drawable tree query, which can be used by the composite manager when it begins tracking a window, and an event, which can
        be used to listen for updates to a tracked window. This query and event provide the composite manager with a boolean value representing the stereo
        status of an entire redirected window tree. With this information, the composite manager is able to properly choose between a stereoscopic or
        monoscopic format when creating a GLXPixmap for a given window tree's backing pixmap.
        """

    IntConstant(
        "Accepted by the {@code attribute} parameter of glXQueryDrawable and glXQueryGLXPbufferSGIX.",

        "STEREO_TREE_EXT"..0x20F5
    )

    IntConstant(
        """
        Accepted in the {@code event_mask} parameter of glXSelectEvent and glXSelectEventSGIX, and returned in the {@code event_mask} parameter of
        glXGetSelectedEvent and glXGetSelectedEventSGIX.
        """,

        "STEREO_NOTIFY_MASK_EXT"..0x00000001
    )

    IntConstant(
        "Returned in the {@code evtype} field of XGenericEventCookie events.",

        "STEREO_NOTIFY_EXT"..0x00000000
    )
}