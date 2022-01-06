/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/** Wraps an {@code XrSpatialAnchorMSFT} handle. */
public class XrSpatialAnchorMSFT extends DispatchableHandle {

    private final XrSession session;

    /**
     * Creates an {@code XrSpatialAnchorMSFT} using the specified native handle and {@code XrSession}.
     *
     * @param handle  the native {@code XrSpatialAnchorMSFT} handle
     * @param session the {@code XrSession} from which {@code handle} was created
     */
    public XrSpatialAnchorMSFT(long handle, XrSession session) {
        super(handle, session.getCapabilities());
        this.session = session;
    }

    /** Returns the {@code XrSession} from which this handle was created. */
    public XrSession getSession() {
        return session;
    }

}
