/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.libc.templates

import org.lwjgl.generator.*

val errno = "Errno".nativeClass(packageName = "org.lwjgl.system.libc") {
	nativeImport (
		"<errno.h>"
	)

	documentation = "Native bindings to errno.h."

	macro _ int(
		"errno",
		"""
		Returns the integer variable {@code errno}, which is set by system calls and some library functions in the event of an error to indicate what went
		wrong. Its value is significant only when the return value of the call indicated an error (i.e., -1 from most system calls; -1 or $NULL from most
		library functions); a function that succeeds is allowed to change errno.

		<b>LWJGL note</b>: This function cannot be used after another JNI call to a Windows function, because the last error resets before that call returns.
		For this reason, LWJGL stores the last error in thread-local storage, you can use #getErrno() to access it.
		"""
	)

	int(
		"getErrno",
		"""
		Returns the integer variable {@code errno}, which is set by system calls and some library functions in the event of an error to indicate what went
		wrong. Its value is significant only when the return value of the call indicated an error (i.e., -1 from most system calls; -1 or $NULL from most
		library functions); a function that succeeds is allowed to change errno.

		<b>LWJGL note</b>: This method has a meaningful value only after another LWJGL JNI call. It does not return {@code errno} from errno.h, but the
		thread-local error code stored by a previous JNI call.
		"""
	)

}