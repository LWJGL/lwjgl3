/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/** Wraps an {@code XrSpatialEntityEXT} handle. */
public class XrSpatialEntityEXT extends DispatchableHandle {

    private final XrSpatialContextEXT spatialContextEXT;

    /**
     * Creates an {@code XrSpatialEntityEXT} using the specified native handle and {@code XrSpatialContextEXT}.
     *
     * @param handle            the native {@code XrSpatialEntityEXT} handle
     * @param spatialContextEXT the {@code XrSpatialContextEXT} from which {@code handle} was created
     */
    public XrSpatialEntityEXT(long handle, XrSpatialContextEXT spatialContextEXT) {
        super(handle, spatialContextEXT.getCapabilities());
        this.spatialContextEXT = spatialContextEXT;
    }

    /** Returns the {@code XrSpatialContextEXT} from which this handle was created. */
    public XrSpatialContextEXT getSpatialContextEXT() {
        return spatialContextEXT;
    }

}
