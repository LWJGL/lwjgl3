/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.Pointer;

/** Base class for Vulkan dispatchable handles. */
public abstract class DispatchableHandle extends Pointer.Default {

	private final VKCapabilities capabilities;

	protected DispatchableHandle(long handle, VKCapabilities capabilities) {
		super(handle);
		this.capabilities = capabilities;
	}

	/** Returns the {@link VKCapabilities} instance associated with this dispatchable handle. */
	public VKCapabilities getCapabilities() {
		return capabilities;
	}

}