/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.windows.templates

import org.lwjgl.generator.*
import org.lwjgl.system.windows.*

fun WinBase() = "WinBase".nativeClass(WINDOWS_PACKAGE) {
	nativeImport (
		"WindowsLWJGL.h"
	)

	javaDoc("Native bindings to WinBase.h.")

	IntConstant.block(
		"BOOL return values.",
		"FALSE" _ 0,
		"TRUE" _ 1
	)

	BOOL.func(
		"GetVersionEx",
		"Retrieves information about the current operating system.",

		LPOSVERSIONINFO.INOUT(
			"versionInfo",
		    """
		    an {@link OSVERSIONINFOEX} structure that receives the operating system information. Before calling the {@code GetVersionEx} function, set the
		    {@code OSVersionInfoSize} member of the structure as appropriate to indicate which data structure is being passed to this function.
		    """
		)
	)

	DWORD.func(
		"GetLastError",
		"""
		Retrieves the calling thread's last-error code value. The last-error code is maintained on a per-thread basis. Multiple threads do not overwrite each
		other's last-error code.
		"""
	)

	HMODULE.func(
		"GetModuleHandle",
		"Retrieves a module handle for the specified module. The module must have been loaded by the calling process.",

		nullable _ LPCTSTR.IN(
			"moduleName",
		    """
		    the name of the loaded module (either a .dll or .exe file). If the file name extension is omitted, the default library extension .dll is appended.
		    The file name string can include a trailing point character (.) to indicate that the module name has no extension. The string does not have to
		    specify a path. When specifying a path, be sure to use backslashes (\), not forward slashes (/). The name is compared (case independently) to the
		    names of modules currently mapped into the address space of the calling process.

			If this parameter is $NULL, {@code GetModuleHandle} returns a handle to the file used to create the calling process (.exe file).
		    """
		)
	)

	HMODULE.func(
		"LoadLibrary",
		"Loads the specified module into the address space of the calling process. The specified module may cause other modules to be loaded.",

		LPCTSTR.IN(
			"name",
		    """
		    the name of the module. This can be either a library module (a .dll file) or an executable module (an .exe file). The name specified is the file
		    name of the module and is not related to the name stored in the library module itself, as specified by the LIBRARY keyword in the module-definition
		    (.def) file.

		    If the string specifies a full path, the function searches only that path for the module.

		    If the string specifies a relative path or a module name without a path, the function uses a standard search strategy to find the module.

		    If the function cannot find the module, the function fails. When specifying a path, be sure to use backslashes (\), not forward slashes (/).

		    If the string specifies a module name without a path and the file name extension is omitted, the function appends the default library extension .dll
		    to the module name. To prevent the function from appending.dll to the module name, include a trailing point character (.) in the module name string.
		    """
		)
	)

	FARPROC.func(
		"GetProcAddress",
		"Retrieves the address of an exported function or variable from the specified dynamic-link library (DLL).",

		HMODULE.IN("handle", "a handle to the DLL module that contains the function or variable"),
		LPCSTR.IN(
			"name",
			"""
			the function or variable name, or the function's ordinal value. If this parameter is an ordinal value, it must be in the low-order word; the
			high-order word must be zero.
			"""
		)
	)

	BOOL.func(
		"FreeLibrary",
		"""
		Frees the loaded dynamic-link library (DLL) module and, if necessary, decrements its reference count. When the reference count reaches zero, the module
		is unloaded from the address space of the calling process and the handle is no longer valid.
		""",

		HMODULE.IN("handle", "a handle to the loaded library module")
	)

	BOOL.func(
		"QueryPerformanceFrequency",
	    "Retrieves the frequency of the high-resolution performance counter, if one exists. The frequency cannot change while the system is running.",

	    LARGE_INTEGER_p.OUT(
		    "frequency",
		    """
		    a pointer to a variable that receives the current performance-counter frequency, in counts per second. If the installed hardware does not support a
		    high-resolution performance counter, this parameter can be zero.
		    """
	    )
	)

	BOOL.func(
		"QueryPerformanceCounter",
		"""
		Retrieves the current value of the high-resolution performance counter.

		On a multiprocessor computer, it should not matter which processor is called. However, you can get different results on different processors due to bugs
		in the basic input/output system (BIOS) or the hardware abstraction layer (HAL). To specify processor affinity for a thread, use the
		{@link Kernel32#SetThreadAffinityMask} function.
		""",

		LARGE_INTEGER_p.OUT(
			"frequency",
			"a pointer to a variable that receives the current performance-counter value, in counts."
		)
	)

}