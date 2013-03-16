/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

fun AL_SOFT_direct_channels() = "SOFTDirectChannels".nativeClass(
    packageName = "org.lwjgl.openal",
    templateName = "SOFT_direct_channels",
    prefix = "AL",
    prefixTemplate = "AL",
    functionProvider = FunctionProviderAL
)   {

	nativeImport (
		"OpenAL.h"
	)

	javaDoc("bindings to AL_SOFT_direct_channels extension.")

    IntConstant.block(
    	"Accepted by the @{code paramName} parameter of alSourcei, alSourceiv, alGetSourcei, and alGetSourceiv.",

        "DIRECT_CHANNELS_SOFT" _ 0x1033
    )
}