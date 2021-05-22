/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openxr;

public class XrDebugUtilsMessengerEXT extends DispatchableHandleSession {
    public XrDebugUtilsMessengerEXT(long handle, DispatchableHandleSession session) {
        super(handle, session.getCapabilities());
    }

    public XrDebugUtilsMessengerEXT(long handle, XRCapabilitiesSession capabilities) {
        super(handle, capabilities);
    }
}
