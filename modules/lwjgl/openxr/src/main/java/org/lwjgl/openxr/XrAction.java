/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openxr;

public class XrAction extends DispatchableHandleSession {
    public XrAction(long handle, DispatchableHandleSession session) {
        super(handle, session.getCapabilities());
    }

    public XrAction(long handle, XRCapabilitiesSession capabilities) {
        super(handle, capabilities);
    }
}
