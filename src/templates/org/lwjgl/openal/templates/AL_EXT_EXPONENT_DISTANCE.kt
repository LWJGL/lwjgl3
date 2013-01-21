/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

fun AL_EXT_EXPONENT_DISTANCE() = "EXTExponentDistance".nativeClass(
    packageName = "org.lwjgl.openal",
    templateName = "EXT_EXPONENT_DISTANCE",
    prefix = "AL",
    prefixTemplate = "AL",
    functionProvider = FunctionProviderAL
)   {

	nativeImport (
		"OpenAL.h"
	)

	javaDoc("bindings to AL_EXT_EXPONENT_DISTANCE extension.")

	IntConstant.block(
    	"AL_EXT_EXPONENT_DISTANCE tokens.",

    	"EXPONENT_DISTANCE" _ 0xd005,
        "EXPONENT_DISTANCE_CLAMPED" _ 0xd006
    )
}