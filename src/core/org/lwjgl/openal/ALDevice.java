/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal;

import org.lwjgl.LWJGLUtil;
import org.lwjgl.system.PointerWrapper;

import java.nio.ByteBuffer;

import static org.lwjgl.openal.ALC10.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This class is a wrapper around an ALC Device handle. A Device can be, depending on the implementation, a hardware device, or a daemon/OS service/actual
 * server. This mechanism also permits different drivers (and hardware) to coexist within the same system, as well as allowing several applications to share
 * system resources for audio, including a single hardware output device. The details are left to the implementation, which has to map the available backends to
 * unique device specifiers.
 */
public class ALDevice extends PointerWrapper {

	/*
	 * When calling ALC functions, we want to use the device associated with the current AL context.
	 * The problem is that an ALDevice is created before the ALContext, so we need a way to bootstrap
	 * the current device during init.
	 */
	static ALDevice lastDevice; // TODO: Evaluate this hack and explore other possible solutions

	private final ALCCapabilities capabilities;

	public ALDevice(long device) {
		super(device);

		this.capabilities = ALC.createCapabilities(device);
		lastDevice = this;
	}

	public static ALDevice getLastDevice() {
		return lastDevice;
	}

	public ALCCapabilities getCapabilities() {
		return capabilities;
	}

	public void destroy() {
		alcCloseDevice(getPointer());
		if ( lastDevice == this )
			lastDevice = null;
	}

	/**
	 * Creates the default device.
	 *
	 * @return the created device
	 */
	public static ALDevice create() {
		return create(null);
	}

	/**
	 * Creates a device.
	 *
	 * @param deviceName the name of the device to open. It may be null, in which case the default device will be used.
	 *
	 * @return the created device
	 */
	public static ALDevice create(String deviceName) {
		long alcOpenDevice = ALC.getFunctionProvider().getFunctionAddress("alcOpenDevice");
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(alcOpenDevice);

		ByteBuffer nameBuffer = deviceName == null ? null : memEncodeUTF8(deviceName);
		long device = nalcOpenDevice(memAddressSafe(nameBuffer), alcOpenDevice);
		if ( device == NULL )
			throw new RuntimeException("Failed to open the device.");

		return new ALDevice(device);
	}

}