/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal;

import static org.lwjgl.openal.ALC10.*;

public class ALCContext {

	private final long device;

	private final ALCCapabilities capabilities;

	public ALCContext(long device) {
		this.device = device;

		this.capabilities = ALC.createCapabilities(device);
		ALC.setCurrent(this);
	}

	public long getDevice() {
		return device;
	}

	public ALCCapabilities getCapabilities() {
		return capabilities;
	}

	public void destroy() {
		alcCloseDevice(device);
	}

}