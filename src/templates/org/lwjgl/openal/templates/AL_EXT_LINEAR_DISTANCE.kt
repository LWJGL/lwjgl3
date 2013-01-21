/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

fun AL_EXT_LINEAR_DISTANCE() = "EXTLinearDistance".nativeClass(
    packageName = "org.lwjgl.openal",
    templateName = "EXT_LINEAR_DISTANCE",
    prefix = "AL",
    prefixTemplate = "AL",
    functionProvider = FunctionProviderAL
)   {

	nativeImport (
		"OpenAL.h"
	)

	javaDoc("bindings to AL_EXT_LINEAR_DISTANCE extension.")

	IntConstant.block(
    	"AL_EXT_EXPONENT_DISTANCE tokens.",

    	"LINEAR_DISTANCE" _ 0xd003,
        "LINEAR_DISTANCE_CLAMPED" _ 0xd004
    )
}