/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openxr;

public class XrInstance extends DispatchableHandleInstance {
    XrInstance(long handle, XRCapabilitiesInstance capabilities) {
        super(handle, capabilities);
    }
}
