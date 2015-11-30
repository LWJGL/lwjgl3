/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal;

import org.lwjgl.system.Pointer;

import java.nio.IntBuffer;

import static org.lwjgl.openal.ALC10.*;
import static org.lwjgl.openal.EXTThreadLocalContext.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This class represents an OpenAL context within an OpenAL device. It wraps an {@link ALDevice} instance, an {@code ALCcontext} pointer and an
 * {@link ALCapabilities} instance that exposes the context capabilities.
 *
 * <p>Calling OpenAL functions requires that an OpenAL context is made current, either process-wide or in the current thread. The methods
 * {@link #makeCurrent()} and {@link #makeCurrentThread()} can be used for that purpose.</p>
 *
 * @see ALDevice
 * @see AL
 */
public class ALContext extends Pointer.Default {

	private final ALDevice device;

	private final ALCapabilities capabilities;

	/**
	 * Creates an {@link ALContext} instance using the specified handles.
	 *
	 * @param device  an {@code ALCdevice} pointer
	 * @param context an {@code ALCcontext} pointer
	 */
	public ALContext(long device, long context) {
		this(new ALDevice(device), context);
	}

	/**
	 * Creates an {@link ALContext} instance using the specified device and context handle.
	 *
	 * @param device  an {@code ALDevice} instance
	 * @param context an {@code ALCcontext} pointer
	 */
	public ALContext(ALDevice device, long context) {
		super(context);

		if ( device.address() != alcGetContextsDevice(context) )
			throw new IllegalArgumentException("The specified device does not match with the context device.");

		this.device = device;
		this.capabilities = AL.createCapabilities(device.getCapabilities());
	}

	/** Returns the {@link ALDevice} instance associated with this OpenAL context. */
	public ALDevice getDevice() {
		return device;
	}

	/** Returns the {@link ALCapabilities} instance associated with this OpenAL context. */
	public ALCapabilities getCapabilities() {
		return capabilities;
	}

	/** Makes this context the current process-wide OpenAL context. See {@link AL#setCurrentProcess}. */
	public void makeCurrent() {
		if ( !alcMakeContextCurrent(address()) )
			throw new RuntimeException("Failed to make AL context current in process.");

		AL.setCurrentProcess(this);
	}

	/**
	 * Makes this context the current OpenAL context in the current thread. See {@link AL#setCurrentThread}.
	 *
	 * <p>This method should only be used if the OpenAL implementation supports the {@link EXTThreadLocalContext ALC_EXT_thread_local_context} extension.
	 * <em>OpenAL Soft</em>, the implementation that LWJGL ships with, supports this extension.</p>
	 */
	public void makeCurrentThread() {
		if ( !alcSetThreadContext(address()) )
			throw new RuntimeException("Failed to make AL context current in thread.");

		AL.setCurrentThread(this);
	}

	/** Returns true if OpenAL methods called in the current thread would use this OpenAL context. */
	public boolean isCurrent() {
		if ( device.getCapabilities().ALC_EXT_thread_local_context ) {
			long current = alcGetThreadContext();
			if ( current != NULL )
				return current == address();
		}

		return alcGetCurrentContext() == address();
	}

	/**
	 * Destroys this OpenAL context by calling {@link ALC10#alcDestroyContext alcDestroyContext}.
	 *
	 * <p>If this OpenAL context is current when this method is called, {@link AL#setCurrentThread} and {@link AL#setCurrentProcess} will be called as
	 * necessary to clear the current context.</p>
	 *
	 * <p>The OpenAL device associated with this context is <b>not</b> closed after a call to this method.</p>
	 */
	public void destroy() {
		if ( device.getCapabilities().ALC_EXT_thread_local_context ) {
			long current = alcGetThreadContext();
			if ( current == address() )
				AL.setCurrentThread(null);
		}

		if ( alcGetCurrentContext() == address() )
			AL.setCurrentProcess(null);

		alcDestroyContext(address());
	}

	/**
	 * Creates an asynchronous ALContext, using the default device and default attributes.
	 *
	 * <p>The created OpenAL context will be made the current process-wide context.</p>
	 *
	 * @return the new ALContext
	 */
	public static ALContext create() {
		return create(ALDevice.create(), 0, 0, false);
	}

	/**
	 * Creates an asynchronous ALContext, using the specified device and default attributes.
	 *
	 * <p>The created OpenAL context will be made the current process-wide context.</p>
	 *
	 * @return the new ALContext
	 */
	public static ALContext create(ALDevice device) {
		return create(device, 0, 0, false);
	}

	/**
	 * Creates an ALContext, using the specified device and attributes.
	 *
	 * <p>The created OpenAL context will be made the current process-wide context.</p>
	 *
	 * @param device    the device
	 * @param frequency the frequency for mixing output buffer, in units of Hz. Set to 0 to use the default.
	 * @param refresh   the refresh intervals, in units of Hz. Set to 0 to use the default.
	 * @param sync      a flag, indicating a synchronous context
	 *
	 * @return the new ALContext
	 */
	public static ALContext create(ALDevice device, int frequency, int refresh, boolean sync) {
		IntBuffer attribs = memAllocInt(8);

		try {
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
		} finally {
			memFree(attribs);
		}
	}

	/**
	 * Creates an {@link ALContext}, using the specified device and attributes.
	 *
	 * <p>The created OpenAL context will be made the current process-wide context.</p>
	 *
	 * @param device     an OpenAL device
	 * @param attributes null or a zero terminated list of integer pairs composed of valid ALC attribute tokens and requested values
	 *
	 * @return the new ALContext
	 */
	public static ALContext create(ALDevice device, IntBuffer attributes) {
		long handle = alcCreateContext(device.address(), attributes);

		if ( handle == NULL )
			ALUtil.checkALCError(NULL);

		if ( !alcMakeContextCurrent(handle) )
			ALUtil.checkALCError(NULL);

		try {
			ALContext context = new ALContext(device, handle);
			AL.setCurrentProcess(context);

			return context;
		} catch (RuntimeException e) {
			alcMakeContextCurrent(NULL);
			alcDestroyContext(handle);

			throw e;
		}
	}

}