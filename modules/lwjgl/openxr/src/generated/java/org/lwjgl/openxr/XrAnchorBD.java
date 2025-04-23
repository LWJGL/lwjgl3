/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/** Wraps an {@code XrAnchorBD} handle. */
public class XrAnchorBD extends DispatchableHandle {

    private final XrSenseDataProviderBD senseDataProviderBD;

    /**
     * Creates an {@code XrAnchorBD} using the specified native handle and {@code XrSenseDataProviderBD}.
     *
     * @param handle              the native {@code XrAnchorBD} handle
     * @param senseDataProviderBD the {@code XrSenseDataProviderBD} from which {@code handle} was created
     */
    public XrAnchorBD(long handle, XrSenseDataProviderBD senseDataProviderBD) {
        super(handle, senseDataProviderBD.getCapabilities());
        this.senseDataProviderBD = senseDataProviderBD;
    }

    /** Returns the {@code XrSenseDataProviderBD} from which this handle was created. */
    public XrSenseDataProviderBD getSenseDataProviderBD() {
        return senseDataProviderBD;
    }

}
