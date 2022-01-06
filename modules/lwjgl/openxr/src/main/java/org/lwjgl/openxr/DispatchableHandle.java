/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

/** Base class for OpenXR dispatchable handles. */
abstract class DispatchableHandle extends Pointer.Default {

    private final XRCapabilities capabilities;

    DispatchableHandle(long handle, XRCapabilities capabilities) {
        super(handle);
        this.capabilities = capabilities;
    }

    /** Returns the {@link XRCapabilities} instance associated with this dispatchable handle. */
    public XRCapabilities getCapabilities() {
        return capabilities;
    }

}