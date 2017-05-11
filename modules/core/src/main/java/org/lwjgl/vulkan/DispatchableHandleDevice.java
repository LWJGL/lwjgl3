/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

abstract class DispatchableHandleDevice extends Pointer.Default {

    private final VKCapabilitiesDevice capabilities;

    DispatchableHandleDevice(long handle, VKCapabilitiesDevice capabilities) {
        super(handle);
        this.capabilities = capabilities;
    }

    /** Returns the {@link VKCapabilitiesInstance} instance associated with this dispatchable handle. */
    public VKCapabilitiesDevice getCapabilities() {
        return capabilities;
    }

}