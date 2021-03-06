/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

abstract class DispatchableHandleInstance extends Pointer.Default {

    private final XRCapabilitiesInstance capabilities;

    DispatchableHandleInstance(long handle, XRCapabilitiesInstance capabilities) {
        super(handle);
        this.capabilities = capabilities;
    }

    /** Returns the {@link XRCapabilitiesInstance} instance associated with this dispatchable handle. */
    public XRCapabilitiesInstance getCapabilities() {
        return capabilities;
    }
}