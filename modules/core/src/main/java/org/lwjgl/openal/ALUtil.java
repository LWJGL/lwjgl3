/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

import static org.lwjgl.openal.AL10.*;
import static org.lwjgl.openal.ALC10.*;
import static org.lwjgl.system.MemoryUtil.*;

/** OpenAL utilities. */
public final class ALUtil {

	private ALUtil() {
	}

	/**
	 * Checks for ALC errors in the specified device.
	 *
	 * @param device an OpenAL device handle, or {@code NULL}
	 *
	 * @throws OpenALException if {@link ALC10#alcGetError GetError} returns anything other than {@link ALC10#ALC_NO_ERROR NO_ERROR}
	 */
	public static void checkALCError(long device) {
		int err = alcGetError(device);
		if ( err != ALC_NO_ERROR )
			throw new OpenALException(alcGetString(device, err));
	}

	/**
	 * Checks for Open AL errors.
	 *
	 * @throws OpenALException if {@link AL10#alGetError GetError} returns anything other than {@link AL10#AL_NO_ERROR NO_ERROR}
	 */
	public static void checkALError() {
		int err = alGetError();
		if ( err != AL_NO_ERROR )
			throw new OpenALException(alGetString(err));
	}

	/**
	 * Obtains string values from ALC. This is a custom implementation for those tokens that return a list of strings instead of a single string.
	 *
	 * @param deviceHandle the device to query
	 * @param token        the information to query. One of:<br>{@link ALC11#ALC_ALL_DEVICES_SPECIFIER}, {@link ALC11#ALC_CAPTURE_DEVICE_SPECIFIER}
	 */
	public static List<String> getStringList(long deviceHandle, int token) {
		long __result = nalcGetString(deviceHandle, token);
		if ( __result == NULL )
			return null;

		ByteBuffer buffer = memByteBuffer(__result, Integer.MAX_VALUE);

		List<String> strings = new ArrayList<>();

		int offset = 0;
		while ( true ) {
			if ( buffer.get() == 0 ) {
				int limit = buffer.position() - 1;
				if ( limit == offset ) // Previous char was also a \0 == end of list.
					break;

				strings.add(memUTF8(buffer, limit - offset, offset));
				offset = buffer.position();
			}
		}

		return strings;
	}

}
