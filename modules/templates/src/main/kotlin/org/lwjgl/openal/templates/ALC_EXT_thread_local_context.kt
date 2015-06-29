/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val ALC_EXT_thread_local_context = "EXTThreadLocalContext".nativeClassALC("EXT_thread_local_context") {
	nativeImport (
		"OpenAL.h"
	)

	documentation =
		"""
		Native bindings to the $specLinkOpenALSoft extension.

		This extension introduces the concept of a current thread-local context, with each thread able to have its own current context. The current context is
		what the al- functions work on, effectively allowing multiple threads to independently drive separate OpenAL playback contexts.
		"""

	ALCboolean(
		"SetThreadContext",
		"""
		Makes a context current with respect to OpenAL operation on the current thread. The context parameter can be $NULL or a valid context pointer. Using
		$NULL results in no thread-specific context being current in the calling thread, which is useful when shutting OpenAL down.
		""",

		ALCcontext_p.IN("context", "the context to make current")
	)

	ALCcontext_p(
		"GetThreadContext",
		"Retrieve a handle to the thread-specific context of the calling thread. This function will return $NULL if no thread- specific context is set."
	)
}