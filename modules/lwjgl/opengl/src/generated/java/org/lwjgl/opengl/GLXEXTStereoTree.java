/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/GLX_EXT_stereo_tree.txt">GLX_EXT_stereo_tree</a> extension.
 * 
 * <p>When using stereoscopic rendering with the X composite extension, a stereo-aware GLX composite manager can be used to composite both the left and right
 * buffers of a window's backing pixmap to the left and right buffers of the root or composite overlay window to preserve the stereo effect of a
 * redirected window or any of its child windows. However, to do this, the composite manager needs a method to determine which windows have both left and
 * right buffers available without needing to walk entire window trees or be aware of other clients' GLX drawables.</p>
 * 
 * <p>This extension provides a new drawable tree query, which can be used by the composite manager when it begins tracking a window, and an event, which can
 * be used to listen for updates to a tracked window. This query and event provide the composite manager with a boolean value representing the stereo
 * status of an entire redirected window tree. With this information, the composite manager is able to properly choose between a stereoscopic or
 * monoscopic format when creating a GLXPixmap for a given window tree's backing pixmap.</p>
 */
public final class GLXEXTStereoTree {

    /** Accepted by the {@code attribute} parameter of glXQueryDrawable and glXQueryGLXPbufferSGIX. */
    public static final int GLX_STEREO_TREE_EXT = 0x20F5;

    /**
     * Accepted in the {@code event_mask} parameter of glXSelectEvent and glXSelectEventSGIX, and returned in the {@code event_mask} parameter of
     * glXGetSelectedEvent and glXGetSelectedEventSGIX.
     */
    public static final int GLX_STEREO_NOTIFY_MASK_EXT = 0x1;

    /** Returned in the {@code evtype} field of XGenericEventCookie events. */
    public static final int GLX_STEREO_NOTIFY_EXT = 0x0;

    private GLXEXTStereoTree() {}

}