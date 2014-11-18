/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal;

import org.lwjgl.BufferUtils;

import java.nio.IntBuffer;

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

	public static ALContext create() {
		return create(null, 44100, 60, false);
	}

	/**
	 * Creates an ALContext.
	 *
	 * @param deviceName the device name. May be null, in which case the default device will be used.
	 * @param frequency  the frequency for mixing output buffer, in Hz
	 * @param refresh    the refresh intervals, in Hz
	 * @param sync       a flag, indicating a synchronous context
	 *
	 * @return
	 */
	public static ALContext create(String deviceName, int frequency, int refresh, boolean sync) {
		ALCContext deviceContext = ALCContext.create(deviceName);
		IntBuffer attribs = BufferUtils.createIntBuffer(16);

		attribs.put(ALC_FREQUENCY);
		attribs.put(frequency);

		attribs.put(ALC_REFRESH);
		attribs.put(refresh);

		attribs.put(ALC_SYNC);
		attribs.put(sync ? ALC10.ALC_TRUE : ALC10.ALC_FALSE);

		attribs.put(0);
		attribs.flip();

		long contextHandle = alcCreateContext(deviceContext.getDevice(), attribs);
		return new ALContext(deviceContext, contextHandle);
	}

}