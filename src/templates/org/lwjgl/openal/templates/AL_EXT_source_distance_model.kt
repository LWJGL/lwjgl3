/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

fun AL_EXT_source_distance_model() = "EXTSourceDistanceModel".nativeClass(
    packageName = "org.lwjgl.openal",
    templateName = "EXT_source_distance_model",
    prefix = "AL",
    prefixTemplate = "AL",
    functionProvider = FunctionProviderAL
)   {

	nativeImport (
		"OpenAL.h"
	)

	javaDoc("bindings to AL_EXT_source_distance_model extension.")

	IntConstant.block(
    	"AL_EXT_source_distance_model tokens.",

    	"SOURCE_DISTANCE_MODEL" _ 0x200
    )
}