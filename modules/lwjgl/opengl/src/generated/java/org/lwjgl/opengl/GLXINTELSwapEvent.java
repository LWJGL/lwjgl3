/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/INTEL/GLX_INTEL_swap_event.txt">GLX_INTEL_swap_event</a> extension.
 * 
 * <p>This extension adds a new event type, {@link #GLX_BUFFER_SWAP_COMPLETE_INTEL_MASK BUFFER_SWAP_COMPLETE_INTEL_MASK}, which is sent to the client via the X11 event stream and
 * selected/consumed by the normal GLX event mask mechanisms, to indicate when a previously queued swap has completed.</p>
 * 
 * <p>Requires {@link GLX13 GLX 1.3}.</p>
 */
public final class GLXINTELSwapEvent {

    /** Accepted by the {@code mask} parameter of {@link GLX13#glXSelectEvent SelectEvent} and returned in the {@code mask} parameter of {@link GLX13#glXGetSelectedEvent GetSelectedEvent}. */
    public static final int GLX_BUFFER_SWAP_COMPLETE_INTEL_MASK = 0x4000000;

    /** Returned in the {@code event_type} field of a "swap complete" event. */
    public static final int
        GLX_EXCHANGE_COMPLETE_INTEL = 0x8180,
        GLX_COPY_COMPLETE_INTEL     = 0x8181,
        GLX_FLIP_COMPLETE_INTEL     = 0x8182;

    private GLXINTELSwapEvent() {}

}