/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openxr;

public class XrActionSet extends DispatchableHandleDevice {
    XrActionSet(long handle, XRCapabilitiesDevice capabilities) {
        super(handle, capabilities);
    }
}
