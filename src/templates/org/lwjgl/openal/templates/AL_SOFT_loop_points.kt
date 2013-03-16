/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

fun AL_SOFT_loop_points() = "SOFTLoopPoints".nativeClass(
    packageName = "org.lwjgl.openal",
    templateName = "SOFT_loop_points",
    prefix = "AL",
    prefixTemplate = "AL",
    functionProvider = FunctionProviderAL
)   {

	nativeImport (
		"OpenAL.h"
	)

	javaDoc("bindings to AL_SOFT_loop_points extension.")

    IntConstant.block(
    	"Accepted by the @{code paramName} parameter of alBufferiv and alGetBufferiv.",

        "LOOP_POINTS_SOFT" _ 0x2015
    )
}