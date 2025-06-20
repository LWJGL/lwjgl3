/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/** Wraps an {@code XrSpatialSnapshotEXT} handle. */
public class XrSpatialSnapshotEXT extends DispatchableHandle {

    private final XrSpatialContextEXT spatialContextEXT;

    /**
     * Creates an {@code XrSpatialSnapshotEXT} using the specified native handle and {@code XrSpatialContextEXT}.
     *
     * @param handle            the native {@code XrSpatialSnapshotEXT} handle
     * @param spatialContextEXT the {@code XrSpatialContextEXT} from which {@code handle} was created
     */
    public XrSpatialSnapshotEXT(long handle, XrSpatialContextEXT spatialContextEXT) {
        super(handle, spatialContextEXT.getCapabilities());
        this.spatialContextEXT = spatialContextEXT;
    }

    /** Returns the {@code XrSpatialContextEXT} from which this handle was created. */
    public XrSpatialContextEXT getSpatialContextEXT() {
        return spatialContextEXT;
    }

}
