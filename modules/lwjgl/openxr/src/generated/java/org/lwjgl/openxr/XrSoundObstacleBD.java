/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/** Wraps an {@code XrSoundObstacleBD} handle. */
public class XrSoundObstacleBD extends DispatchableHandle {

    private final XrSpatialAudioRendererBD spatialAudioRendererBD;

    /**
     * Creates an {@code XrSoundObstacleBD} using the specified native handle and {@code XrSpatialAudioRendererBD}.
     *
     * @param handle                 the native {@code XrSoundObstacleBD} handle
     * @param spatialAudioRendererBD the {@code XrSpatialAudioRendererBD} from which {@code handle} was created
     */
    public XrSoundObstacleBD(long handle, XrSpatialAudioRendererBD spatialAudioRendererBD) {
        super(handle, spatialAudioRendererBD.getCapabilities());
        this.spatialAudioRendererBD = spatialAudioRendererBD;
    }

    /** Returns the {@code XrSpatialAudioRendererBD} from which this handle was created. */
    public XrSpatialAudioRendererBD getSpatialAudioRendererBD() {
        return spatialAudioRendererBD;
    }

}
