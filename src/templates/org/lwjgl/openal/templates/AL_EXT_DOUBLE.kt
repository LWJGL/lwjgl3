/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

fun AL_EXT_DOUBLE() = "EXTDouble".nativeClass(
    packageName = "org.lwjgl.openal",
    templateName = "EXT_DOUBLE",
    prefix = "AL",
    prefixTemplate = "AL",
    functionProvider = FunctionProviderAL
)   {

	nativeImport (
		"OpenAL.h"
	)

	javaDoc("bindings to AL_EXT_DOUBLE extension.")

	IntConstant.block(
    	"AL_EXT_DOUBLE tokens.",

    	"FORMAT_MONO_DOUBLE_EXT" _ 0x10012,
        "FORMAT_STEREO_DOUBLE_EXT" _ 0x10013
    )
}