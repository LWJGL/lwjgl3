/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/** Wraps an {@code XrEnvironmentDepthSwapchainMETA} handle. */
public class XrEnvironmentDepthSwapchainMETA extends DispatchableHandle {

    private final XrEnvironmentDepthProviderMETA environmentDepthProviderMETA;

    /**
     * Creates an {@code XrEnvironmentDepthSwapchainMETA} using the specified native handle and {@code XrEnvironmentDepthProviderMETA}.
     *
     * @param handle                       the native {@code XrEnvironmentDepthSwapchainMETA} handle
     * @param environmentDepthProviderMETA the {@code XrEnvironmentDepthProviderMETA} from which {@code handle} was created
     */
    public XrEnvironmentDepthSwapchainMETA(long handle, XrEnvironmentDepthProviderMETA environmentDepthProviderMETA) {
        super(handle, environmentDepthProviderMETA.getCapabilities());
        this.environmentDepthProviderMETA = environmentDepthProviderMETA;
    }

    /** Returns the {@code XrEnvironmentDepthProviderMETA} from which this handle was created. */
    public XrEnvironmentDepthProviderMETA getEnvironmentDepthProviderMETA() {
        return environmentDepthProviderMETA;
    }

}
