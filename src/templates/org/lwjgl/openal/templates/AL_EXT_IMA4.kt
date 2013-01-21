/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

fun AL_EXT_IMA4() = "EXTIma4".nativeClass(
    packageName = "org.lwjgl.openal",
    templateName = "EXT_IMA4",
    prefix = "AL",
    prefixTemplate = "AL",
    functionProvider = FunctionProviderAL
)   {

	nativeImport (
		"OpenAL.h"
	)

	javaDoc("bindings to AL_EXT_IMA4 extension.")

	IntConstant.block(
    	"AL_EXT_IMA4 tokens.",

    	"FORMAT_MONO_IMA4" _ 0x1300,
        "FORMAT_STEREO_IMA4" _ 0x1301
    )
}