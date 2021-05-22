/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openxr;

public class XrActionSet extends DispatchableHandleSession {
    public XrActionSet(long handle, DispatchableHandleSession session) {
        super(handle, session.getCapabilities());
    }

    public XrActionSet(long handle, XRCapabilitiesSession capabilities) {
        super(handle, capabilities);
    }
}
