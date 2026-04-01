/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/** Wraps an {@code XrSceneMeshSnapshotANDROID} handle. */
public class XrSceneMeshSnapshotANDROID extends DispatchableHandle {

    private final XrSceneMeshingTrackerANDROID sceneMeshingTrackerANDROID;

    /**
     * Creates an {@code XrSceneMeshSnapshotANDROID} using the specified native handle and {@code XrSceneMeshingTrackerANDROID}.
     *
     * @param handle                     the native {@code XrSceneMeshSnapshotANDROID} handle
     * @param sceneMeshingTrackerANDROID the {@code XrSceneMeshingTrackerANDROID} from which {@code handle} was created
     */
    public XrSceneMeshSnapshotANDROID(long handle, XrSceneMeshingTrackerANDROID sceneMeshingTrackerANDROID) {
        super(handle, sceneMeshingTrackerANDROID.getCapabilities());
        this.sceneMeshingTrackerANDROID = sceneMeshingTrackerANDROID;
    }

    /** Returns the {@code XrSceneMeshingTrackerANDROID} from which this handle was created. */
    public XrSceneMeshingTrackerANDROID getSceneMeshingTrackerANDROID() {
        return sceneMeshingTrackerANDROID;
    }

}
