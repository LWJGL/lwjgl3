/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.windows.templates

import org.lwjgl.generator.*
import org.lwjgl.system.windows.*

val Kernel32 = "Kernel32".nativeClassWin {
	nativeImport(
		"WindowsLWJGL.h"
	)

	documentation =
		"""
		Optional functionality loaded dynamically from <strong>kernel32.dll</strong>.

		$DLL_WARNING
		"""

	DLL_FUNC _ DWORD_PTR(
		"SetThreadAffinityMask",
		"""
		Sets a processor affinity mask for the specified thread.

		A thread affinity mask is a bit vector in which each bit represents a logical processor that a thread is allowed to run on. A thread affinity mask must
		be a subset of the process affinity mask for the containing process of a thread. A thread can only run on the processors its process can run on.
		Therefore, the thread affinity mask cannot specify a 1 bit for a processor when the process affinity mask specifies a 0 bit for that processor.

		Setting an affinity mask for a process or thread can result in threads receiving less processor time, as the system is restricted from running the
		threads on certain processors. In most cases, it is better to let the system select an available processor.

		If the new thread affinity mask does not specify the processor that is currently running the thread, the thread is rescheduled on one of the allowable
		processors.
		""",

		HANDLE.IN("thread", "a handle to the thread whose affinity mask is to be set"),
		DWORD_PTR.IN("threadAffinityMask", "the affinity mask for the thread"),
		DLL_ADDRESS
	)

}