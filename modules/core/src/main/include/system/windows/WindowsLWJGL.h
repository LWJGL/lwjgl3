/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#ifndef _WINDOWS_LWJGL_INCLUDED
	#define _WINDOWS_LWJGL_INCLUDED

	#ifndef VC_EXTRALEAN
		#define VC_EXTRALEAN
	#endif

	#ifndef WIN32_LEAN_AND_MEAN
		#define WIN32_LEAN_AND_MEAN
	#endif

	#ifndef _WIN32_WINDOWS
		#define _WIN32_WINDOWS 0x0500
	#endif

	#ifndef WINVER
		#define WINVER 0x0500
	#endif

	#ifndef _WIN32_WINNT
		#define _WIN32_WINNT 0x0500
	#endif

	#ifndef UNICODE
		#define UNICODE
	#endif

	#ifndef _UNICODE
		#define _UNICODE
	#endif

	// Disable optional features we don't need.

	#define NOGDICAPMASKS // CC_*, LC_*, PC_*, CP_*, TC_*, RC_
	#define NOVIRTUALKEYCODES // VK_*
	//#define NOWINMESSAGES // WM_*, EM_*, LB_*, CB_*
	#define NOWINSTYLES // WS_*, CS_*, ES_*, LBS_*, SBS_*, CBS_*
	//#define NOSYSMETRICS // SM_*
	#define NOMENUS // MF_*
	#define NOICONS // IDI_*
	#define NOKEYSTATES // MK_*
	#define NOSYSCOMMANDS // SC_*
	#define NORASTEROPS // Binary and Tertiary raster ops
	#define NOSHOWWINDOW // SW_*
	#define OEMRESOURCE // OEM Resource values
	#define NOATOM // Atom Manager routines
	//#define NOCLIPBOARD // Clipboard routines
	#define NOCOLOR // Screen colors
	#define NOCTLMGR // Control and Dialog routines
	#define NODRAWTEXT // DrawText() and DT_*
	//#define NOGDI // All GDI defines and routines
	#define NOKERNEL // All KERNEL defines and routines
	//#define NOUSER // All USER defines and routines
	#define NONLS // All NLS defines and routines
	#define NOMB // MB_* and MessageBox()
	#define NOMEMMGR // GMEM_*, LMEM_*, GHND, LHND, associated routines
	#define NOMETAFILE // typedef METAFILEPICT
	#define NOMINMAX // Macros min(a,b) and max(a,b)
	//#define NOMSG // typedef MSG and associated routines
	#define NOOPENFILE // OpenFile(), OemToAnsi, AnsiToOem, and OF_*
	#define NOSCROLL // SB_* and scrolling routines
	#define NOSERVICE // All Service Controller routines, SERVICE_ equates, etc.
	#define NOSOUND // Sound driver routines
	#define NOTEXTMETRIC // typedef TEXTMETRIC and associated routines
	#define NOWH // SetWindowsHook and WH_*
	//#define NOWINOFFSETS // GWL_*, GCL_*, associated routines
	#define NOCOMM // COMM driver routines
	#define NOKANJI // Kanji support stuff.
	#define NOHELP // Help engine interface.
	#define NOPROFILER // Profiler interface.
	#define NODEFERWINDOWPOS // DeferWindowPos routines
	#define NOMCX // Modem Configuration Extensions

    #define STRICT

    DISABLE_WARNINGS()
	#include <windows.h>
	#include <mmsystem.h>
	ENABLE_WARNINGS()
#endif /* _WINDOWS_LWJGL_INCLUDED */
