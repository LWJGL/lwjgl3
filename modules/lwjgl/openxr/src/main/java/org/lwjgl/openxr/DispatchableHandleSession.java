/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

abstract class DispatchableHandleSession extends Pointer.Default {

    private final XRCapabilitiesSession capabilities;

    DispatchableHandleSession(long handle, XRCapabilitiesSession capabilities) {
        super(handle);
        this.capabilities = capabilities;
    }

    /** Returns the {@link XRCapabilitiesSession} instance associated with this dispatchable handle. */
    public XRCapabilitiesSession getCapabilities() {
        return capabilities;
    }

}