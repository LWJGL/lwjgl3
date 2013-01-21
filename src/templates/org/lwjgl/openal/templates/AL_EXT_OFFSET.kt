/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

fun AL_EXT_OFFSET() = "EXTOffset".nativeClass(
    packageName = "org.lwjgl.openal",
    templateName = "EXT_OFFSET",
    prefix = "AL",
    prefixTemplate = "AL",
    functionProvider = FunctionProviderAL
)   {

	nativeImport (
		"OpenAL.h"
	)

	javaDoc("bindings to AL_EXT_OFFSET extension.")

	IntConstant.block(
    	"AL_EXT_OFFSET tokens.",

    	"SEC_OFFSET" _ 0x1024,
        "SAMPLE_OFFSET" _ 0x1025,
        "BYTE_OFFSET" _ 0x1026
    )
}