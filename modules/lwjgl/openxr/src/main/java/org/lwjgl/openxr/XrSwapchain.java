/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openxr;

public class XrSwapchain extends DispatchableHandleSession {
    public XrSwapchain(long handle, DispatchableHandleSession session) {
        super(handle, session.getCapabilities());
    }

    public XrSwapchain(long handle, XRCapabilitiesSession capabilities) {
        super(handle, capabilities);
    }
}
