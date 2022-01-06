/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/** Wraps an {@code XrSceneMSFT} handle. */
public class XrSceneMSFT extends DispatchableHandle {

    private final XrSceneObserverMSFT sceneObserverMSFT;

    /**
     * Creates an {@code XrSceneMSFT} using the specified native handle and {@code XrSceneObserverMSFT}.
     *
     * @param handle            the native {@code XrSceneMSFT} handle
     * @param sceneObserverMSFT the {@code XrSceneObserverMSFT} from which {@code handle} was created
     */
    public XrSceneMSFT(long handle, XrSceneObserverMSFT sceneObserverMSFT) {
        super(handle, sceneObserverMSFT.getCapabilities());
        this.sceneObserverMSFT = sceneObserverMSFT;
    }

    /** Returns the {@code XrSceneObserverMSFT} from which this handle was created. */
    public XrSceneObserverMSFT getSceneObserverMSFT() {
        return sceneObserverMSFT;
    }

}
