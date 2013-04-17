/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * The source in this file is ported from GLFW. License terms: http://www.glfw.org/license.html
 */
package org.lwjgl.system.jglfw;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.jglfw.JGLFW.*;
import static org.lwjgl.system.windows.Mmsystem.*;

final class JoystickWin {

	private JoystickWin() {
	}

	static boolean isJoystickPresent(int joy) {
		// Is it a valid stick ID (Windows don't support more than 16 sticks)?
		if ( joy < GLFW_JOYSTICK_1 || joy > GLFW_JOYSTICK_16 )
			return false;

		// Is the joystick present?
		return joyGetPos(joy - GLFW_JOYSTICK_1, apiBuffer().buffer()) == JOYERR_NOERROR;

	}

	static float calcJoystickPos(int pos, int min, int max) {
		float fpos = (float)pos;
		float fmin = (float)min;
		float fmax = (float)max;

		return (2.f * (fpos - fmin) / (fmax - fmin)) - 1.f;
	}

}