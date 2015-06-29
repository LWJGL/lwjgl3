/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal;

import static org.lwjgl.openal.AL10.*;
import static org.lwjgl.openal.ALC10.*;

/** Simple OpenAL utility class. */
public final class Util {

	private Util() {
	}

	public static void checkALCError(ALDevice device) {
		int err = alcGetError(device.getPointer());
		if ( err != ALC_NO_ERROR )
			throw new OpenALException(alcGetString(device.getPointer(), err));
	}

	public static void checkALError() {
		int err = alGetError();
		if ( err != AL_NO_ERROR )
			throw new OpenALException(alGetString(err));
	}

}
