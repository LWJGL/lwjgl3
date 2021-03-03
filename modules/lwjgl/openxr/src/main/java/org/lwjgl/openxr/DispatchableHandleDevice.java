/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

//TODO come up with a better name for OpenXR's equivalent for 'Device' maybe 'Session?'
abstract class DispatchableHandleDevice extends Pointer.Default {

    private final XRCapabilitiesSession capabilities;

    DispatchableHandleDevice(long handle, XRCapabilitiesSession capabilities) {
        super(handle);
        this.capabilities = capabilities;
    }

    /** Returns the {@link VKCapabilitiesInstance} instance associated with this dispatchable handle. */
    public XRCapabilitiesSession getCapabilities() {
        return capabilities;
    }

}