/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal;

import static org.lwjgl.openal.ALC10.*;
import static org.lwjgl.system.MemoryUtil.*;

public class ALContext {

	private final ALCContext deviceContext;

	private final long handle;

	private final ALCapabilities capabilities;

	public ALContext(ALCContext deviceContext, long handle) {
		this.deviceContext = deviceContext;
		this.handle = handle;

		makeCurrent();

		if ( deviceContext.getDevice() != alcGetContextsDevice(handle) )
			throw new IllegalArgumentException("The context device and the ALC context device do not match.");

		this.capabilities = AL.createCapabilities(deviceContext.getDevice());
	}

	public ALCContext getDeviceContext() {
		return deviceContext;
	}

	public long getHandle() {
		return handle;
	}

	public ALCapabilities getCapabilities() {
		return capabilities;
	}

	public void makeCurrent() {
		if ( !alcMakeContextCurrent(handle) )
			throw new RuntimeException("Failed to make AL context current.");

		AL.setCurrent(this);
	}

	public boolean isCurrent() {
		return alcGetCurrentContext() == handle;
	}

	public void destroy() {
		if ( isCurrent() )
			alcMakeContextCurrent(NULL);

		alcDestroyContext(handle);
	}

}