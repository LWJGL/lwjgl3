/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal;

import org.lwjgl.BufferUtils;
import org.lwjgl.system.PointerWrapper;

import java.nio.IntBuffer;

import static org.lwjgl.openal.ALC10.*;
import static org.lwjgl.openal.EXTThreadLocalContext.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This class is a wrapper around an AL Context handle. Within the scope of AL the ALC is implied - it is not visible as a handle or function parameter. Only
 * one AL Context per process can be current at a time. Applications maintaining multiple AL Contexts, whether threaded or not, have to set the current context
 * accordingly. Applications can have multiple threads that share one more or contexts. In other words, AL and ALC are threadsafe.
 */
public class ALContext extends PointerWrapper {

	private final ALDevice device;

	private final ALCapabilities capabilities;

	public ALContext(ALDevice device, long handle) {
		super(handle);

		this.device = device;

		makeCurrent();

		if ( device.getPointer() != alcGetContextsDevice(handle) )
			throw new IllegalArgumentException("The specified device does not match with the context device.");

		this.capabilities = AL.createCapabilities(device.getPointer());
	}

	public ALDevice getDevice() {
		return device;
	}

	public ALCapabilities getCapabilities() {
		return capabilities;
	}

	/**
	 * Makes this context the current process-wide OpenAL context.
	 */
	public void makeCurrent() {
		if ( !alcMakeContextCurrent(getPointer()) )
			throw new RuntimeException("Failed to make AL context current in process.");

		AL.setCurrentProcess(this);
	}

	/**
	 * Makes this context the current thread-local OpenAL context.
	 */
	public void makeCurrentThread() {
		if ( !alcSetThreadContext(getPointer()) )
			throw new RuntimeException("Failed to make AL context current in thread.");

		AL.setCurrentThread(this);
	}

	public boolean isCurrent() {
		if ( device.getCapabilities().ALC_EXT_thread_local_context ) {
			if ( alcGetThreadContext() == getPointer() )
				return true;
		}

		return alcGetCurrentContext() == getPointer();
	}

	public void destroy() {
		if ( isCurrent() )
			alcMakeContextCurrent(NULL);

		alcDestroyContext(getPointer());
	}

	/**
	 * Creates an asynchronous ALContext, using the default device and default attributes.
	 *
	 * @return the new ALContext
	 */
	public static ALContext create() {
		return create(ALDevice.create(null), 0, 0, false);
	}

	/**
	 * Creates an asynchronous ALContext, using the specified device and default attributes.
	 *
	 * @return the new ALContext
	 */
	public static ALContext create(ALDevice device) {
		return create(device, 0, 0, false);
	}

	/**
	 * Creates an ALContext, using the specified device and attributes.
	 *
	 * @param device    the device
	 * @param frequency the frequency for mixing output buffer, in units of Hz. Set to 0 to use the default.
	 * @param refresh   the refresh intervals, in units of Hz. Set to 0 to use the default.
	 * @param sync      a flag, indicating a synchronous context
	 *
	 * @return the new ALContext
	 */
	public static ALContext create(ALDevice device, int frequency, int refresh, boolean sync) {
		IntBuffer attribs = BufferUtils.createIntBuffer(8);

		if ( frequency != 0 ) {
			attribs.put(ALC_FREQUENCY);
			attribs.put(frequency);
		}

		if ( refresh != 0 ) {
			attribs.put(ALC_REFRESH);
			attribs.put(refresh);
		}

		attribs.put(ALC_SYNC);
		attribs.put(sync ? ALC10.ALC_TRUE : ALC10.ALC_FALSE);

		attribs.put(0);
		attribs.flip();

		return ALContext.create(device, attribs);
	}

	/**
	 * Creates an ALContext, using the specified device and attributes.
	 *
	 * @param device     the device
	 * @param attributes null or a zero terminated list of integer pairs composed of valid ALC attribute tokens and requested values
	 *
	 * @return the new ALContext
	 */
	public static ALContext create(ALDevice device, IntBuffer attributes) {
		long contextHandle = alcCreateContext(device.getPointer(), attributes);
		return new ALContext(device, contextHandle);
	}

}