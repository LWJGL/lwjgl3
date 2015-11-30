/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal;

import org.lwjgl.system.Pointer;

import static org.lwjgl.openal.ALC10.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This class represents an open connection to an OpenAL device. It wraps an {@code ALCdevice} pointer and an {@link ALCCapabilities} instance that exposes the
 * device capabilities.
 *
 * <p>Connections to OpenAL devices can be opened with {@link ALC10#alcOpenDevice alcOpenDevice} or
 * {@link SOFTLoopback#alcLoopbackOpenDeviceSOFT alcLoopbackOpenDeviceSOFT}.</p>
 *
 * <p>Calling OpenAL functions requires an OpenAL context for the device, that can be created with the {@link ALContext} class.</p>
 *
 * @see AL
 * @see ALC
 */
public class ALDevice extends Pointer.Default {

	private final ALCCapabilities capabilities;

	/**
	 * Creates an {@link ALDevice} for the specified OpenAL device handle
	 *
	 * @param device a handle to an OpenAL device
	 */
	public ALDevice(long device) {
		super(device);

		this.capabilities = ALC.createCapabilities(device);
	}

	/** Returns the {@link ALCCapabilities} instance associated with this OpenAL device. */
	public ALCCapabilities getCapabilities() {
		return capabilities;
	}

	/** Closes the device with {@link ALC10#alcCloseDevice alcCloseDevice}. */
	public void close() {
		alcCloseDevice(address());
	}

	/**
	 * Opens the default device.
	 *
	 * @return the created device or null if no sound driver/device has been found
	 */
	public static ALDevice create() {
		return create(null);
	}

	/**
	 * Opens a device.
	 *
	 * @param deviceSpecifier the name of a certain device or device configuration to open. It may be null, in which case the implementation will provide an
	 *                        implementation specific default.
	 *
	 * @return the created device or null if no sound driver/device has been found
	 */
	public static ALDevice create(String deviceSpecifier) {
		long device = alcOpenDevice(deviceSpecifier);
		return device == NULL ? null : new ALDevice(device);
	}

}