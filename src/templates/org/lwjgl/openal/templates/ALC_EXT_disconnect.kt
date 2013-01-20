/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

fun ALC_EXT_disconnect() = "EXTDisconnect".nativeClass(
    packageName = "org.lwjgl.openal",
    templateName = "EXT_disconnect",
    prefix = "ALC",
    prefixTemplate = "ALC",
    functionProvider = FunctionProviderALC
)   {

	nativeImport (
		"OpenAL.h"
	)

	javaDoc("bindings to ALC_EXT_disconnect extension.")

	IntConstant.block(
    	"ALC_EXT_disconnect tokens.",

    	"CONNECTED " _ 0x313
    )
}