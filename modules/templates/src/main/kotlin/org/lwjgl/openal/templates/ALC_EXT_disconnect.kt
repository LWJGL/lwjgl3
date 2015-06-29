/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val ALC_EXT_disconnect = "EXTDisconnect".nativeClassALC("EXT_disconnect") {
	documentation = "bindings to ALC_EXT_disconnect extension."

	IntConstant(
		"ALC_EXT_disconnect tokens.",

		"CONNECTED " _ 0x313
	)
}