/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal;

import org.lwjgl.LWJGLUtil;

import java.nio.ByteBuffer;

import static org.lwjgl.openal.ALC10.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

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

	/**
	 * Creates an ALCContext from the default device.
	 *
	 * @return the created ALCContext
	 */
	public static ALCContext create() {
		return create(null);
	}

	/**
	 * Creates an ALCContext from the specified device. The device name may be null,
	 * in which case the default device will be used.
	 *
	 * @param deviceName the device to open
	 *
	 * @return the created ALCContext on the specified device
	 */
	public static ALCContext create(String deviceName) {
		long alcOpenDevice = ALC.getFunctionProvider().getFunctionAddress("alcOpenDevice");
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(alcOpenDevice);

		ByteBuffer nameBuffer = deviceName == null ? null : memEncodeUTF8(deviceName);
		long device = nalcOpenDevice(memAddressSafe(nameBuffer), alcOpenDevice);
		if ( device == NULL )
			throw new RuntimeException("Failed to open the device.");

		return new ALCContext(device);
	}

}