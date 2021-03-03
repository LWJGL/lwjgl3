/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openxr;

public class XrAction extends DispatchableHandleDevice {
    XrAction(long handle, XRCapabilitiesSession capabilities) {
        super(handle, capabilities);
    }
}
