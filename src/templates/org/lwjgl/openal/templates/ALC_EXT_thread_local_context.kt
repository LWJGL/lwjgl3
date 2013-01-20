/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

fun ALC_EXT_thread_local_context() = "EXTThreadLocalContext".nativeClassALC("EXT_thread_local_context") {
	nativeImport (
		"OpenAL.h"
	)

	javaDoc("Native bindings to the EXT_thread_local_context ALC extension.")

	ALCboolean.func(
		"SetThreadContext",
		"""
		Makes a context current with respect to OpenAL operation on the current thread. The context parameter can be NULL or a valid context pointer. Using NULL
		results in no thread-specific context being current in the calling thread, which is useful when shutting OpenAL down.
		""",

		ALCcontext_p.IN("context", "the context to make current")
	)

	ALCcontext_p.func(
		"GetThreadContext",
		"""
		Returns a handle for the context that is currently affecting the thread. This will return a handle to the current thread-specific context if it is not
		NULL, otherwise it will return the last set process-wide context.
		"""
	)

}