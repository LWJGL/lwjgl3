/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/** Wraps an {@code XrPassthroughColorLutMETA} handle. */
public class XrPassthroughColorLutMETA extends DispatchableHandle {

    private final XrPassthroughFB passthroughFB;

    /**
     * Creates an {@code XrPassthroughColorLutMETA} using the specified native handle and {@code XrPassthroughFB}.
     *
     * @param handle        the native {@code XrPassthroughColorLutMETA} handle
     * @param passthroughFB the {@code XrPassthroughFB} from which {@code handle} was created
     */
    public XrPassthroughColorLutMETA(long handle, XrPassthroughFB passthroughFB) {
        super(handle, passthroughFB.getCapabilities());
        this.passthroughFB = passthroughFB;
    }

    /** Returns the {@code XrPassthroughFB} from which this handle was created. */
    public XrPassthroughFB getPassthroughFB() {
        return passthroughFB;
    }

}
