/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

/** Base class for Vulkan dispatchable handles. */
abstract class DispatchableHandleInstance extends Pointer.Default {

    private final VKCapabilitiesInstance capabilities;

    DispatchableHandleInstance(long handle, VKCapabilitiesInstance capabilities) {
        super(handle);
        this.capabilities = capabilities;
    }

    /** Returns the {@link VKCapabilitiesInstance} instance associated with this dispatchable handle. */
    public VKCapabilitiesInstance getCapabilities() {
        return capabilities;
    }

}