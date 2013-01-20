/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

fun ALC_ENUMERATE_ALL_EXT() = "EnumerateAllExt".nativeClass(
    packageName = "org.lwjgl.openal",
    templateName = "ENUMERATE_ALL_EXT",
    prefix = "ALC",
    prefixTemplate = "ALC",
    functionProvider = FunctionProviderALC
)   {

	nativeImport (
		"OpenAL.h"
	)

	javaDoc("bindings to ALC_ENUMERATE_ALL_EXT extension.")

	IntConstant.block(
    	"ENUMERATE_ALL_EXT tokens.",

    	"DEFAULT_ALL_DEVICES_SPECIFIER" _ 0x1012,
    	"ALL_DEVICES_SPECIFIER" _ 0x1013
    )
}