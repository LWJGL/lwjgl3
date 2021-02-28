/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openxr;

public class XrSwapchain extends DispatchableHandleDevice {
    XrSwapchain(long handle, XRCapabilitiesDevice capabilities) {
        super(handle, capabilities);
    }
}
