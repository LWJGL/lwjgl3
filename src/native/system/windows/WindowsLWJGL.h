/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#ifndef _WINDOWS_LWJGL_INCLUDED
	#define _WINDOWS_LWJGL_INCLUDED

	#define WIN32_LEAN_AND_MEAN

	#ifndef _WIN32_WINDOWS
		#define _WIN32_WINDOWS 0x0500
	#endif

	#ifndef WINVER
		#define WINVER 0x0500
	#endif

	#ifndef _WIN32_WINNT
		#define _WIN32_WINNT 0x0500
	#endif

	#define UNICODE
	#define _UNICODE
	//#include <tchar.h>

	#include <windows.h>
#endif /* _WINDOWS_LWJGL_INCLUDED */
