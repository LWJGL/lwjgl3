/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val AL = "AL"
val ALC = "ALC"

val ALC_ENUMERATION_EXT = EXT_FLAG.nativeClassALC("ENUMERATION_EXT") {
	documentation =
		"""
		An OpenAL 1.1 implementation will always support the $extensionName extension. This extension provides for enumeration of the available OpenAL devices
		through ALC10#GetString(). An ALC10#GetString() query of ALC10#DEVICE_SPECIFIER with a $NULL device passed in will return a list of devices. Each
		device name will be separated by a single $NULL character and the list will be terminated with two $NULL characters.
		"""
}