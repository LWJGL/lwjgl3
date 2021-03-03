/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openxr;

public class XrSwapchain extends DispatchableHandleDevice {
    public XrSwapchain(long handle, XRCapabilitiesSession capabilities) {
        super(handle, capabilities);
    }

    public XrSwapchain(long handle, XrSession session) {
        super(handle, session.getCapabilities());
    }
}
