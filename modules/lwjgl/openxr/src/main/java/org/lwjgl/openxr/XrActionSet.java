/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openxr;

public class XrActionSet extends DispatchableHandleSession {
    public XrActionSet(long handle, XRCapabilitiesSession capabilities) {
        super(handle, capabilities);
    }
}
