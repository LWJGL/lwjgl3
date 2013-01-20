/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

fun ALC_ENUMERATION_EXT() = "EnumerationExt".nativeClass(
    packageName = "org.lwjgl.openal",
    templateName = "ENUMERATION_EXT",
    prefix = "AL",
    prefixTemplate = "ALC",
    functionProvider = FunctionProviderALC
)   {

	nativeImport (
		"OpenAL.h"
	)

	javaDoc("bindings to ALC_ENUMERATION_EXT extension.")
}