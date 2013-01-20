/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

fun ALC_EXT_thread_local_context() = "EXTThreadLocalContext".nativeClass(
    packageName = "org.lwjgl.openal",
    templateName = "EXT_thread_local_context",
    prefix = "ALC",
    prefixTemplate = "ALC",
    functionProvider = FunctionProviderALC
)   {

	nativeImport (
		"OpenAL.h"
	)

	javaDoc("bindings to ALC_EXT_thread_local_context extension.")

	ALCboolean.func(
		"SetThreadContext",
		"""
		To make a Context current with respect to OpenAL operation on the current
        thread, alcSetThreadContext is used. The context parameter can be NULL or
        a valid context pointer. Using NULL results in no thread-specific context
        being current in the calling thread, which is useful when shutting OpenAL
        down.
		""",
		nullable _ ALCcontext_p.IN("context", "the context to process-wide")
	)

	ALCcontext_p.func(
		"GetThreadContext",
		"""
		To retrieve a handle to the thread-specific context of the calling thread,
        use alcGetThreadContext. This function will return NULL if no thread-
        specific context is set
        """
	)
}