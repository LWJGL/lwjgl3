/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.windows.templates

import org.lwjgl.generator.*
import org.lwjgl.system.windows.*

fun WinUser() = "WinUser".nativeClass(WINDOWS_PACKAGE) {
	nativeImport (
		"WindowsLWJGL.h"
	)

	javaDoc("Native bindings to WinUser.h.")

	IntConstant.block(
		"Window Styles",
		"WS_OVERLAPPED" _ 0x00000000,
		"WS_POPUP" _ 0x80000000.toInt(), // TODO: Kotlin bug, fix
		"WS_CHILD" _ 0x40000000,
		"WS_MINIMIZE" _ 0x20000000,
		"WS_VISIBLE" _ 0x10000000,
		"WS_DISABLED" _ 0x08000000,
		"WS_CLIPSIBLINGS" _ 0x04000000,
		"WS_CLIPCHILDREN" _ 0x02000000,
		"WS_MAXIMIZE" _ 0x01000000,
		"WS_CAPTION" _ 0x00C00000, /* WS_BORDER | WS_DLGFRAME  */
		"WS_BORDER" _ 0x00800000,
		"WS_DLGFRAME" _ 0x00400000,
		"WS_VSCROLL" _ 0x00200000,
		"WS_HSCROLL" _ 0x00100000,
		"WS_SYSMENU" _ 0x00080000,
		"WS_THICKFRAME" _ 0x00040000,
		"WS_GROUP" _ 0x00020000,
		"WS_TABSTOP" _ 0x00010000,

		"WS_MINIMIZEBOX" _ 0x00020000,
		"WS_MAXIMIZEBOX" _ 0x00010000,

		// Common Window Styles
		"WS_OVERLAPPEDWINDOW".expr<Int>("WS_OVERLAPPED | WS_CAPTION | WS_SYSMENU | WS_THICKFRAME | WS_MINIMIZEBOX | WS_MAXIMIZEBOX"),
		"WS_POPUPWINDOW".expr<Int>("WS_POPUP | WS_BORDER | WS_SYSMENU"),
		"WS_CHILDWINDOW".expr<Int>("WS_CHILD"),

		"WS_TILED".expr<Int>("WS_OVERLAPPED"),
		"WS_ICONIC".expr<Int>("WS_MINIMIZE"),
		"WS_SIZEBOX".expr<Int>("WS_THICKFRAME"),
		"WS_TILEDWINDOW".expr<Int>("WS_OVERLAPPEDWINDOW")
	)

	IntConstant.block(
		"Windows messages.",
		"WM_NULL" _ 0x0000,
		"WM_CREATE" _ 0x0001,
		"WM_DESTROY" _ 0x0002,
		"WM_MOVE" _ 0x0003,
		"WM_SIZE" _ 0x0005,
		"WM_ACTIVATE" _ 0x0006,
		"WM_SETFOCUS" _ 0x0007,
		"WM_KILLFOCUS" _ 0x0008,
		"WM_ENABLE" _ 0x000A,
		"WM_SETREDRAW" _ 0x000B,
		"WM_SETTEXT" _ 0x000C,
		"WM_GETTEXT" _ 0x000D,
		"WM_GETTEXTLENGTH" _ 0x000E,
		"WM_PAINT" _ 0x000F,
		"WM_CLOSE" _ 0x0010,
		"WM_QUERYENDSESSION" _ 0x0011,
		"WM_QUERYOPEN" _ 0x0013,
		"WM_ENDSESSION" _ 0x0016,
		"WM_QUIT" _ 0x0012,
		"WM_ERASEBKGND" _ 0x0014,
		"WM_SYSCOLORCHANGE" _ 0x0015,
		"WM_SHOWWINDOW" _ 0x0018,
		"WM_WININICHANGE" _ 0x001A,
		"WM_SETTINGCHANGE".expr<Int>("WM_WININICHANGE"),
		"WM_DEVMODECHANGE" _ 0x001B,
		"WM_ACTIVATEAPP" _ 0x001C,
		"WM_FONTCHANGE" _ 0x001D,
		"WM_TIMECHANGE" _ 0x001E,
		"WM_CANCELMODE" _ 0x001F,
		"WM_SETCURSOR" _ 0x0020,
		"WM_MOUSEACTIVATE" _ 0x0021,
		"WM_CHILDACTIVATE" _ 0x0022,
		"WM_QUEUESYNC" _ 0x0023,
		"WM_GETMINMAXINFO" _ 0x0024,
		"WM_PAINTICON" _ 0x0026,
		"WM_ICONERASEBKGND" _ 0x0027,
		"WM_NEXTDLGCTL" _ 0x0028,
		"WM_SPOOLERSTATUS" _ 0x002A,
		"WM_DRAWITEM" _ 0x002B,
		"WM_MEASUREITEM" _ 0x002C,
		"WM_DELETEITEM" _ 0x002D,
		"WM_VKEYTOITEM" _ 0x002E,
		"WM_CHARTOITEM" _ 0x002F,
		"WM_SETFONT" _ 0x0030,
		"WM_GETFONT" _ 0x0031,
		"WM_SETHOTKEY" _ 0x0032,
		"WM_GETHOTKEY" _ 0x0033,
		"WM_QUERYDRAGICON" _ 0x0037,
		"WM_COMPAREITEM" _ 0x0039,
		"WM_GETOBJECT" _ 0x003D,
		"WM_COMPACTING" _ 0x0041,
		"WM_COMMNOTIFY" _ 0x0044,
		"WM_WINDOWPOSCHANGING" _ 0x0046,
		"WM_WINDOWPOSCHANGED" _ 0x0047,
		"WM_POWER" _ 0x0048,
		"WM_COPYDATA" _ 0x004A,
		"WM_CANCELJOURNAL" _ 0x004B,
		"WM_NOTIFY" _ 0x004E,
		"WM_INPUTLANGCHANGEREQUEST" _ 0x0050,
		"WM_INPUTLANGCHANGE" _ 0x0051,
		"WM_TCARD" _ 0x0052,
		"WM_HELP" _ 0x0053,
		"WM_USERCHANGED" _ 0x0054,
		"WM_NOTIFYFORMAT" _ 0x0055,
		"WM_CONTEXTMENU" _ 0x007B,
		"WM_STYLECHANGING" _ 0x007C,
		"WM_STYLECHANGED" _ 0x007D,
		"WM_DISPLAYCHANGE" _ 0x007E,
		"WM_GETICON" _ 0x007F,
		"WM_SETICON" _ 0x0080,
		"WM_NCCREATE" _ 0x0081,
		"WM_NCDESTROY" _ 0x0082,
		"WM_NCCALCSIZE" _ 0x0083,
		"WM_NCHITTEST" _ 0x0084,
		"WM_NCPAINT" _ 0x0085,
		"WM_NCACTIVATE" _ 0x0086,
		"WM_GETDLGCODE" _ 0x0087,
		"WM_SYNCPAINT" _ 0x0088,
		"WM_NCMOUSEMOVE" _ 0x00A0,
		"WM_NCLBUTTONDOWN" _ 0x00A1,
		"WM_NCLBUTTONUP" _ 0x00A2,
		"WM_NCLBUTTONDBLCLK" _ 0x00A3,
		"WM_NCRBUTTONDOWN" _ 0x00A4,
		"WM_NCRBUTTONUP" _ 0x00A5,
		"WM_NCRBUTTONDBLCLK" _ 0x00A6,
		"WM_NCMBUTTONDOWN" _ 0x00A7,
		"WM_NCMBUTTONUP" _ 0x00A8,
		"WM_NCMBUTTONDBLCLK" _ 0x00A9,
		"WM_NCXBUTTONDOWN" _ 0x00AB,
		"WM_NCXBUTTONUP" _ 0x00AC,
		"WM_NCXBUTTONDBLCLK" _ 0x00AD,

		// _WIN32_WINNT >= 0x0501
		"WM_INPUT_DEVICE_CHANGE" _ 0x00FE,
		"WM_INPUT" _ 0x00FF,

		"WM_KEYFIRST" _ 0x0100,
		"WM_KEYDOWN" _ 0x0100,
		"WM_KEYUP" _ 0x0101,
		"WM_CHAR" _ 0x0102,
		"WM_DEADCHAR" _ 0x0103,
		"WM_SYSKEYDOWN" _ 0x0104,
		"WM_SYSKEYUP" _ 0x0105,
		"WM_SYSCHAR" _ 0x0106,
		"WM_SYSDEADCHAR" _ 0x0107,

		// _WIN32_WINNT >= 0x0501
		"WM_UNICHAR" _ 0x0109,
		"UNICODE_NOCHAR" _ 0xFFFF,

		"WM_IME_STARTCOMPOSITION" _ 0x010D,
		"WM_IME_ENDCOMPOSITION" _ 0x010E,
		"WM_IME_COMPOSITION" _ 0x010F,
		"WM_IME_KEYLAST" _ 0x010F,
		"WM_INITDIALOG" _ 0x0110,
		"WM_COMMAND" _ 0x0111,
		"WM_SYSCOMMAND" _ 0x0112,
		"WM_TIMER" _ 0x0113,
		"WM_HSCROLL" _ 0x0114,
		"WM_VSCROLL" _ 0x0115,
		"WM_INITMENU" _ 0x0116,
		"WM_INITMENUPOPUP" _ 0x0117,

		// WINVER >= 0x0601
		"WM_GESTURE" _ 0x0119,
		"WM_GESTURENOTIFY" _ 0x011A,

		"WM_MENUSELECT" _ 0x011F,
		"WM_MENUCHAR" _ 0x0120,
		"WM_ENTERIDLE" _ 0x0121,
		"WM_MENURBUTTONUP" _ 0x0122,
		"WM_MENUDRAG" _ 0x0123,
		"WM_MENUGETOBJECT" _ 0x0124,
		"WM_UNINITMENUPOPUP" _ 0x0125,
		"WM_MENUCOMMAND" _ 0x0126,
		"WM_CHANGEUISTATE" _ 0x0127,
		"WM_UPDATEUISTATE" _ 0x0128,
		"WM_QUERYUISTATE" _ 0x0129,
		"WM_CTLCOLORMSGBOX" _ 0x0132,
		"WM_CTLCOLOREDIT" _ 0x0133,
		"WM_CTLCOLORLISTBOX" _ 0x0134,
		"WM_CTLCOLORBTN" _ 0x0135,
		"WM_CTLCOLORDLG" _ 0x0136,
		"WM_CTLCOLORSCROLLBAR" _ 0x0137,
		"WM_CTLCOLORSTATIC" _ 0x0138,
		"MN_GETHMENU" _ 0x01E1,
		"WM_MOUSEFIRST" _ 0x0200,
		"WM_MOUSEMOVE" _ 0x0200,
		"WM_LBUTTONDOWN" _ 0x0201,
		"WM_LBUTTONUP" _ 0x0202,
		"WM_LBUTTONDBLCLK" _ 0x0203,
		"WM_RBUTTONDOWN" _ 0x0204,
		"WM_RBUTTONUP" _ 0x0205,
		"WM_RBUTTONDBLCLK" _ 0x0206,
		"WM_MBUTTONDOWN" _ 0x0207,
		"WM_MBUTTONUP" _ 0x0208,
		"WM_MBUTTONDBLCLK" _ 0x0209,
		"WM_MOUSEWHEEL" _ 0x020A,
		"WM_XBUTTONDOWN" _ 0x020B,
		"WM_XBUTTONUP" _ 0x020C,
		"WM_XBUTTONDBLCLK" _ 0x020D,

		// _WIN32_WINNT >= 0x0600
		"WM_MOUSEHWHEEL" _ 0x020E,

		// TODO: Add support for multi-expressions
		/*
		#if (_WIN32_WINNT >= 0x0600)
		"WM_MOUSELAST" _ 0x020E,
		#elif (_WIN32_WINNT >= 0x0500)
		"WM_MOUSELAST" _ 0x020D,
		#elif (_WIN32_WINNT >= 0x0400) || (_WIN32_WINDOWS > 0x0400)
		"WM_MOUSELAST" _ 0x020A,
		#else
		"WM_MOUSELAST" _ 0x0209,
		#endif
		*/

		"WM_PARENTNOTIFY" _ 0x0210,
		"WM_ENTERMENULOOP" _ 0x0211,
		"WM_EXITMENULOOP" _ 0x0212,
		"WM_NEXTMENU" _ 0x0213,
		"WM_SIZING" _ 0x0214,
		"WM_CAPTURECHANGED" _ 0x0215,
		"WM_MOVING" _ 0x0216,
		"WM_POWERBROADCAST" _ 0x0218,
		"WM_DEVICECHANGE" _ 0x0219,
		"WM_MDICREATE" _ 0x0220,
		"WM_MDIDESTROY" _ 0x0221,
		"WM_MDIACTIVATE" _ 0x0222,
		"WM_MDIRESTORE" _ 0x0223,
		"WM_MDINEXT" _ 0x0224,
		"WM_MDIMAXIMIZE" _ 0x0225,
		"WM_MDITILE" _ 0x0226,
		"WM_MDICASCADE" _ 0x0227,
		"WM_MDIICONARRANGE" _ 0x0228,
		"WM_MDIGETACTIVE" _ 0x0229,
		"WM_MDISETMENU" _ 0x0230,
		"WM_ENTERSIZEMOVE" _ 0x0231,
		"WM_EXITSIZEMOVE" _ 0x0232,
		"WM_DROPFILES" _ 0x0233,
		"WM_MDIREFRESHMENU" _ 0x0234,

		// WINVER >= 0x0601
		"WM_TOUCH" _ 0x0240,

		"WM_IME_SETCONTEXT" _ 0x0281,
		"WM_IME_NOTIFY" _ 0x0282,
		"WM_IME_CONTROL" _ 0x0283,
		"WM_IME_COMPOSITIONFULL" _ 0x0284,
		"WM_IME_SELECT" _ 0x0285,
		"WM_IME_CHAR" _ 0x0286,
		"WM_IME_REQUEST" _ 0x0288,
		"WM_IME_KEYDOWN" _ 0x0290,
		"WM_IME_KEYUP" _ 0x0291,
		"WM_MOUSEHOVER" _ 0x02A1,
		"WM_MOUSELEAVE" _ 0x02A3,
		"WM_NCMOUSEHOVER" _ 0x02A0,
		"WM_NCMOUSELEAVE" _ 0x02A2,

		// _WIN32_WINNT >= 0x0501
		"WM_WTSSESSION_CHANGE" _ 0x02B1,
		"WM_TABLET_FIRST" _ 0x02c0,
		"WM_TABLET_LAST" _ 0x02df,

		"WM_CUT" _ 0x0300,
		"WM_COPY" _ 0x0301,
		"WM_PASTE" _ 0x0302,
		"WM_CLEAR" _ 0x0303,
		"WM_UNDO" _ 0x0304,
		"WM_RENDERFORMAT" _ 0x0305,
		"WM_RENDERALLFORMATS" _ 0x0306,
		"WM_DESTROYCLIPBOARD" _ 0x0307,
		"WM_DRAWCLIPBOARD" _ 0x0308,
		"WM_PAINTCLIPBOARD" _ 0x0309,
		"WM_VSCROLLCLIPBOARD" _ 0x030A,
		"WM_SIZECLIPBOARD" _ 0x030B,
		"WM_ASKCBFORMATNAME" _ 0x030C,
		"WM_CHANGECBCHAIN" _ 0x030D,
		"WM_HSCROLLCLIPBOARD" _ 0x030E,
		"WM_QUERYNEWPALETTE" _ 0x030F,
		"WM_PALETTEISCHANGING" _ 0x0310,
		"WM_PALETTECHANGED" _ 0x0311,
		"WM_HOTKEY" _ 0x0312,
		"WM_PRINT" _ 0x0317,
		"WM_PRINTCLIENT" _ 0x0318,
		"WM_APPCOMMAND" _ 0x0319,

		// _WIN32_WINNT >= 0x0501
		"WM_THEMECHANGED" _ 0x031A,
		"WM_CLIPBOARDUPDATE" _ 0x031D,

		// _WIN32_WINNT >= 0x0600
		"WM_DWMCOMPOSITIONCHANGED" _ 0x031E,
		"WM_DWMNCRENDERINGCHANGED" _ 0x031F,
		"WM_DWMCOLORIZATIONCOLORCHANGED" _ 0x0320,
		"WM_DWMWINDOWMAXIMIZEDCHANGE" _ 0x0321,
		"WM_DWMSENDICONICTHUMBNAIL" _ 0x0323,
		"WM_DWMSENDICONICLIVEPREVIEWBITMAP" _ 0x0326,
		"WM_GETTITLEBARINFOEX" _ 0x033F,

		"WM_HANDHELDFIRST" _ 0x0358,
		"WM_HANDHELDLAST" _ 0x035F,

		"WM_AFXFIRST" _ 0x0360,
		"WM_AFXLAST" _ 0x037F,
		"WM_PENWINFIRST" _ 0x0380,
		"WM_PENWINLAST" _ 0x038F,
		"WM_APP" _ 0x8000,

		"WM_USER" _ 0x0400
	)

	IntConstant.block(
		"WM_ACTIVATE message wParam values.",
		"WA_ACTIVE" _ 1,
		"WA_CLICKACTIVE" _ 2,
		"WA_INACTIVE" _ 0
	)

	IntConstant.block(
		"WM_SIZE message wParam values.",
		"SIZE_RESTORED" _ 0,
		"SIZE_MINIMIZED" _ 1,
		"SIZE_MAXIMIZED" _ 2,
		"SIZE_MAXSHOW" _ 3,
		"SIZE_MAXHIDE" _ 4
	)

	IntConstant.block(
		"System menu command values.",
		"SC_SIZE" _ 0xF000,
		"SC_MOVE" _ 0xF010,
		"SC_MINIMIZE" _ 0xF020,
		"SC_MAXIMIZE" _ 0xF030,
		"SC_NEXTWINDOW" _ 0xF040,
		"SC_PREVWINDOW" _ 0xF050,
		"SC_CLOSE" _ 0xF060,
		"SC_VSCROLL" _ 0xF070,
		"SC_HSCROLL" _ 0xF080,
		"SC_MOUSEMENU" _ 0xF090,
		"SC_KEYMENU" _ 0xF100,
		"SC_ARRANGE" _ 0xF110,
		"SC_RESTORE" _ 0xF120,
		"SC_TASKLIST" _ 0xF130,
		"SC_SCREENSAVE" _ 0xF140,
		"SC_HOTKEY" _ 0xF150,
		"SC_DEFAULT" _ 0xF160,
		"SC_MONITORPOWER" _ 0xF170,
		"SC_CONTEXTHELP" _ 0xF180,
		"SC_SEPARATOR" _ 0xF00F
	)

	IntConstant.block(
		"{@link #GetSystemMetrics} codes.",
		"SM_CXSCREEN" _ 0,
		"SM_CYSCREEN" _ 1,
		"SM_CXVSCROLL" _ 2,
		"SM_CYHSCROLL" _ 3,
		"SM_CYCAPTION" _ 4,
		"SM_CXBORDER" _ 5,
		"SM_CYBORDER" _ 6,
		"SM_CXDLGFRAME" _ 7,
		"SM_CYDLGFRAME" _ 8,
		"SM_CYVTHUMB" _ 9,
		"SM_CXHTHUMB" _ 10,
		"SM_CXICON" _ 11,
		"SM_CYICON" _ 12,
		"SM_CXCURSOR" _ 13,
		"SM_CYCURSOR" _ 14,
		"SM_CYMENU" _ 15,
		"SM_CXFULLSCREEN" _ 16,
		"SM_CYFULLSCREEN" _ 17,
		"SM_CYKANJIWINDOW" _ 18,
		"SM_MOUSEPRESENT" _ 19,
		"SM_CYVSCROLL" _ 20,
		"SM_CXHSCROLL" _ 21,
		"SM_DEBUG" _ 22,
		"SM_SWAPBUTTON" _ 23,
		"SM_RESERVED1" _ 24,
		"SM_RESERVED2" _ 25,
		"SM_RESERVED3" _ 26,
		"SM_RESERVED4" _ 27,
		"SM_CXMIN" _ 28,
		"SM_CYMIN" _ 29,
		"SM_CXSIZE" _ 30,
		"SM_CYSIZE" _ 31,
		"SM_CXFRAME" _ 32,
		"SM_CYFRAME" _ 33,
		"SM_CXMINTRACK" _ 34,
		"SM_CYMINTRACK" _ 35,
		"SM_CXDOUBLECLK" _ 36,
		"SM_CYDOUBLECLK" _ 37,
		"SM_CXICONSPACING" _ 38,
		"SM_CYICONSPACING" _ 39,
		"SM_MENUDROPALIGNMENT" _ 40,
		"SM_PENWINDOWS" _ 41,
		"SM_DBCSENABLED" _ 42,
		"SM_CMOUSEBUTTONS" _ 43,

		"SM_CXFIXEDFRAME".expr<Int>("SM_CXDLGFRAME"),
		"SM_CYFIXEDFRAME".expr<Int>("SM_CYDLGFRAME"),
		"SM_CXSIZEFRAME".expr<Int>("SM_CXFRAME"),
		"SM_CYSIZEFRAME".expr<Int>("SM_CYFRAME"),

		"SM_SECURE" _ 44,
		"SM_CXEDGE" _ 45,
		"SM_CYEDGE" _ 46,
		"SM_CXMINSPACING" _ 47,
		"SM_CYMINSPACING" _ 48,
		"SM_CXSMICON" _ 49,
		"SM_CYSMICON" _ 50,
		"SM_CYSMCAPTION" _ 51,
		"SM_CXSMSIZE" _ 52,
		"SM_CYSMSIZE" _ 53,
		"SM_CXMENUSIZE" _ 54,
		"SM_CYMENUSIZE" _ 55,
		"SM_ARRANGE" _ 56,
		"SM_CXMINIMIZED" _ 57,
		"SM_CYMINIMIZED" _ 58,
		"SM_CXMAXTRACK" _ 59,
		"SM_CYMAXTRACK" _ 60,
		"SM_CXMAXIMIZED" _ 61,
		"SM_CYMAXIMIZED" _ 62,
		"SM_NETWORK" _ 63,
		"SM_CLEANBOOT" _ 67,
		"SM_CXDRAG" _ 68,
		"SM_CYDRAG" _ 69,
		"SM_SHOWSOUNDS" _ 70,
		"SM_CXMENUCHECK" _ 71,
		"SM_CYMENUCHECK" _ 72,
		"SM_SLOWMACHINE" _ 73,
		"SM_MIDEASTENABLED" _ 74,

		"SM_MOUSEWHEELPRESENT" _ 75,
		"SM_XVIRTUALSCREEN" _ 76,
		"SM_YVIRTUALSCREEN" _ 77,
		"SM_CXVIRTUALSCREEN" _ 78,
		"SM_CYVIRTUALSCREEN" _ 79,
		"SM_CMONITORS" _ 80,
		"SM_SAMEDISPLAYFORMAT" _ 81,
		"SM_IMMENABLED" _ 82,

		"SM_REMOTESESSION" _ 0x1000,

		// _WIN32_WINNT >= 0x0501

		"SM_SHUTTINGDOWN" _ 0x2000,
		"SM_REMOTECONTROL" _ 0x2001,
		"SM_CARETBLINKINGENABLED" _ 0x2002,

		"SM_CXFOCUSBORDER" _ 83,
		"SM_CYFOCUSBORDER" _ 84,

		"SM_TABLETPC" _ 86,
		"SM_MEDIACENTER" _ 87,
		"SM_STARTER" _ 88,
		"SM_SERVERR2" _ 89,

		// _WIN32_WINNT >= 0x0600

		"SM_MOUSEHORIZONTALWHEELPRESENT" _ 91,
		"SM_CXPADDEDBORDER" _ 92,

		// WINVER >= 0x0601

		"SM_DIGITIZER" _ 94,
		"SM_MAXIMUMTOUCHES" _ 95
	)

	IntConstant.block(
		"Extended Window Styles",
		"WS_EX_DLGMODALFRAME" _ 0x00000001,
		"WS_EX_NOPARENTNOTIFY" _ 0x00000004,
		"WS_EX_TOPMOST" _ 0x00000008,
		"WS_EX_ACCEPTFILES" _ 0x00000010,
		"WS_EX_TRANSPARENT" _ 0x00000020,
		"WS_EX_MDICHILD" _ 0x00000040,
		"WS_EX_TOOLWINDOW" _ 0x00000080,
		"WS_EX_WINDOWEDGE" _ 0x00000100,
		"WS_EX_CLIENTEDGE" _ 0x00000200,
		"WS_EX_CONTEXTHELP" _ 0x00000400,

		"WS_EX_RIGHT" _ 0x00001000,
		"WS_EX_LEFT" _ 0x00000000,
		"WS_EX_RTLREADING" _ 0x00002000,
		"WS_EX_LTRREADING" _ 0x00000000,
		"WS_EX_LEFTSCROLLBAR" _ 0x00004000,
		"WS_EX_RIGHTSCROLLBAR" _ 0x00000000,

		"WS_EX_CONTROLPARENT" _ 0x00010000,
		"WS_EX_STATICEDGE" _ 0x00020000,
		"WS_EX_APPWINDOW" _ 0x00040000,

		"WS_EX_OVERLAPPEDWINDOW".expr<Int>("WS_EX_WINDOWEDGE | WS_EX_CLIENTEDGE"),
		"WS_EX_PALETTEWINDOW".expr<Int>("WS_EX_WINDOWEDGE | WS_EX_TOOLWINDOW | WS_EX_TOPMOST"),

		"WS_EX_LAYERED" _ 0x00080000,

		"WS_EX_NOINHERITLAYOUT" _ 0x00100000, // Disable inheritence of mirroring by children
		"WS_EX_LAYOUTRTL" _ 0x00400000, // Right to left mirroring

		"WS_EX_COMPOSITED" _ 0x02000000, // WIN32_WINNT >= 0x0501

		"WS_EX_NOACTIVATE" _ 0x08000000
	)

	IntConstant.block(
		"May be used in {@link #CreateWindowEx} for the x, y, width, height parameters.",
		"CW_USEDEFAULT" _ 0x80000000.toInt()
	)

	IntConstant.block(
		"Key state masks for mouse messages.",
		"MK_LBUTTON" _ 0x0001,
		"MK_RBUTTON" _ 0x0002,
		"MK_SHIFT" _ 0x0004,
		"MK_CONTROL" _ 0x0008,
		"MK_MBUTTON" _ 0x0010,
		"MK_XBUTTON1" _ 0x0020,
		"MK_XBUTTON2" _ 0x0040
	)

	IntConstant.block(
		"Mouse position codes.",
		"HTERROR" _ -2,
		"HTTRANSPARENT" _ -1,
		"HTNOWHERE" _ 0,
		"HTCLIENT" _ 1,
		"HTCAPTION" _ 2,
		"HTSYSMENU" _ 3,
		"HTGROWBOX" _ 4,
		"HTSIZE".expr<Int>("HTGROWBOX"),
		"HTMENU" _ 5,
		"HTHSCROLL" _ 6,
		"HTVSCROLL" _ 7,
		"HTMINBUTTON" _ 8,
		"HTMAXBUTTON" _ 9,
		"HTLEFT" _ 10,
		"HTRIGHT" _ 11,
		"HTTOP" _ 12,
		"HTTOPLEFT" _ 13,
		"HTTOPRIGHT" _ 14,
		"HTBOTTOM" _ 15,
		"HTBOTTOMLEFT" _ 16,
		"HTBOTTOMRIGHT" _ 17,
		"HTBORDER" _ 18,
		"HTREDUCE".expr<Int>("HTMINBUTTON"),
		"HTZOOM".expr<Int>("HTMAXBUTTON"),
		"HTSIZEFIRST".expr<Int>("HTLEFT"),
		"HTSIZELAST".expr<Int>("HTBOTTOMRIGHT"),
		"HTOBJECT" _ 19,
		"HTCLOSE" _ 20,
		"HTHELP" _ 21
	)

	IntConstant.block(
		"Class styles",
		"CS_VREDRAW" _ 0x0001,
		"CS_HREDRAW" _ 0x0002,
		"CS_DBLCLKS" _ 0x0008,
		"CS_OWNDC" _ 0x0020,
		"CS_CLASSDC" _ 0x0040,
		"CS_PARENTDC" _ 0x0080,
		"CS_NOCLOSE" _ 0x0200,
		"CS_SAVEBITS" _ 0x0800,
		"CS_BYTEALIGNCLIENT" _ 0x1000,
		"CS_BYTEALIGNWINDOW" _ 0x2000,
		"CS_GLOBALCLASS" _ 0x4000,

		"CS_IME" _ 0x00010000,
		"CS_DROPSHADOW" _ 0x00020000 // _WIN32_WINNT >=" _ 0x0501,
	)

	IntConstant.block(
		"Window field offsets for {@link #GetWindowLong}.",
		"GWL_WNDPROC" _ -4,
		"GWL_HINSTANCE" _ -6,
		"GWL_HWNDPARENT" _ -8,
		"GWL_STYLE" _ -16,
		"GWL_EXSTYLE" _ -20,
		"GWL_USERDATA" _ -21,
		"GWL_ID" _ -12
	)

	IntConstant.block(
		"{@link #ShowWindow} commands.",
		"SW_HIDE" _ 0,
		"SW_SHOWNORMAL" _ 1,
		"SW_NORMAL" _ 1,
		"SW_SHOWMINIMIZED" _ 2,
		"SW_SHOWMAXIMIZED" _ 3,
		"SW_MAXIMIZE" _ 3,
		"SW_SHOWNOACTIVATE" _ 4,
		"SW_SHOW" _ 5,
		"SW_MINIMIZE" _ 6,
		"SW_SHOWMINNOACTIVE" _ 7,
		"SW_SHOWNA" _ 8,
		"SW_RESTORE" _ 9,
		"SW_SHOWDEFAULT" _ 10,
		"SW_FORCEMINIMIZE" _ 11,
		"SW_MAX" _ 11
	)

	LongConstant.block(
		"Virtual window handles used by the {@link #SetWindowPos} insertAfter argument.",
		"HWND_TOP" _ 0.L,
		"HWND_BOTTOM" _ 1.L,
		"HWND_TOPMOST" _ -1.L,
		"HWND_NOTOPMOST" _ -2.L
	)

	IntConstant.block(
		"Window sizing and positiong flags used by the {@link #SetWindowPos} flags argument.",
		"SWP_NOSIZE" _ 0x0001,
		"SWP_NOMOVE" _ 0x0002,
		"SWP_NOZORDER" _ 0x0004,
		"SWP_NOREDRAW" _ 0x0008,
		"SWP_NOACTIVATE" _ 0x0010,
		"SWP_FRAMECHANGED" _ 0x0020, // The frame changed: send WM_NCCALCSIZE
		"SWP_SHOWWINDOW" _ 0x0040,
		"SWP_HIDEWINDOW" _ 0x0080,
		"SWP_NOCOPYBITS" _ 0x0100,
		"SWP_NOOWNERZORDER" _ 0x0200, // Don't do owner Z ordering
		"SWP_NOSENDCHANGING" _ 0x0400, // Don't send WM_WINDOWPOSCHANGING

		"SWP_DRAWFRAME".expr<Int>("SWP_FRAMECHANGED"),
		"SWP_NOREPOSITION".expr<Int>("SWP_NOOWNERZORDER"),

		"SWP_DEFERERASE" _ 0x2000,
		"SWP_ASYNCWINDOWPOS" _ 0x4000
	)

	IntConstant.block(
		"Standard Icon IDs. Use with {@link #nLoadIcon(long, long)}.",
		"IDI_APPLICATION" _ 32512,
		"IDI_HAND" _ 32513,
		"IDI_QUESTION" _ 32514,
		"IDI_EXCLAMATION" _ 32515,
		"IDI_ASTERISK" _ 32516,
		"IDI_WINLOGO" _ 32517,
		"IDI_SHIELD" _ 32518, // WINVER >= 0x0600
		"IDI_WARNING".expr<Int>("IDI_EXCLAMATION"),
		"IDI_ERROR".expr<Int>("IDI_HAND"),
		"IDI_INFORMATION".expr<Int>("IDI_ASTERISK")
	)

	IntConstant.block(
		"Standard Cursor IDs. Use with {@link #nLoadCursor(long, long)}.",
		"IDC_ARROW" _ 32512,
		"IDC_IBEAM" _ 32513,
		"IDC_WAIT" _ 32514,
		"IDC_CROSS" _ 32515,
		"IDC_UPARROW" _ 32516,
		"IDC_SIZE" _ 32640,
		"IDC_ICON" _ 32641,
		"IDC_SIZENWSE" _ 32642,
		"IDC_SIZENESW" _ 32643,
		"IDC_SIZEWE" _ 32644,
		"IDC_SIZENS" _ 32645,
		"IDC_SIZEALL" _ 32646,
		"IDC_NO" _ 32648,
		"IDC_HAND" _ 32649,
		"IDC_APPSTARTING" _ 32650,
		"IDC_HELP" _ 32651
	)

	IntConstant.block(
		"Class field offsets for {@link #GetClassLong}.",
		"GCL_MENUNAME" _ -8,
		"GCL_HBRBACKGROUND" _ -10,
		"GCL_HCURSOR" _ -12,
		"GCL_HICON" _ -14,
		"GCL_HMODULE" _ -16,
		"GCL_CBWNDEXTRA" _ -18,
		"GCL_CBCLSEXTRA" _ -20,
		"GCL_WNDPROC" _ -24,
		"GCL_STYLE" _ -26,
		"GCW_ATOM" _ -32,
		"GCL_HICONSM" _ -34
	)

	IntConstant.block(
		"Queue status flags for {@link #GetQueueStatus} and {@link #MsgWaitForMultipleObjects}",
		"QS_KEY" _ 0x0001,
		"QS_MOUSEMOVE" _ 0x0002,
		"QS_MOUSEBUTTON" _ 0x0004,
		"QS_POSTMESSAGE" _ 0x0008,
		"QS_TIMER" _ 0x0010,
		"QS_PAINT" _ 0x0020,
		"QS_SENDMESSAGE" _ 0x0040,
		"QS_HOTKEY" _ 0x0080,
		"QS_ALLPOSTMESSAGE" _ 0x0100,
		"QS_RAWINPUT" _ 0x0400, // _WIN32_WINNT >= 0x0501
		"QS_MOUSE".expr<Int>("QS_MOUSEMOVE | QS_MOUSEBUTTON"),
		"QS_INPUT".expr<Int>("QS_MOUSE | QS_KEY"), // TODO: Add | QS_RAWINPUT if _WIN32_WINNT >= 0x0501
		"QS_ALLEVENTS".expr<Int>("QS_INPUT | QS_POSTMESSAGE | QS_TIMER | QS_PAINT | QS_HOTKEY"),
		"QS_ALLINPUT".expr<Int>("QS_INPUT | QS_POSTMESSAGE | QS_TIMER | QS_PAINT | QS_HOTKEY | QS_SENDMESSAGE")
	)

	IntConstant.block(
		"Remove message flags for {@link #PeekMessage}.",
		"PM_NOREMOVE" _ 0x0000,
		"PM_REMOVE" _ 0x0001,
		"PM_NOYIELD" _ 0x0002,
		"PM_QS_INPUT".expr<Int>("QS_INPUT << 16"),
		"PM_QS_POSTMESSAGE".expr<Int>("(QS_POSTMESSAGE | QS_HOTKEY | QS_TIMER) << 16"),
		"PM_QS_PAINT".expr<Int>("QS_PAINT << 16"),
		"PM_QS_SENDMESSAGE".expr<Int>("QS_SENDMESSAGE << 16")
	)

	IntConstant.block(
		"Flags for {@link #ChangeDisplaySettings}.",
		"CDS_UPDATEREGISTRY" _ 0x00000001,
		"CDS_TEST" _ 0x00000002,
		"CDS_FULLSCREEN" _ 0x00000004,
		"CDS_GLOBAL" _ 0x00000008,
		"CDS_SET_PRIMARY" _ 0x00000010,
		"CDS_VIDEOPARAMETERS" _ 0x00000020,

		"CDS_ENABLE_UNSAFE_MODES" _ 0x00000100, // WINVER >= 0x0600
		"CDS_DISABLE_UNSAFE_MODES" _ 0x00000200, // WINVER >= 0x0600

		"CDS_RESET" _ 0x40000000,
		"CDS_RESET_EX" _ 0x20000000,
		"CDS_NORESET" _ 0x10000000
	)

	IntConstant.block(
		"Return values for {@link #ChangeDisplaySettings}.",
		"DISP_CHANGE_SUCCESSFUL" _ 0,
		"DISP_CHANGE_RESTART" _ 1,
		"DISP_CHANGE_FAILED" _ -1,
		"DISP_CHANGE_BADMODE" _ -2,
		"DISP_CHANGE_NOTUPDATED" _ -3,
		"DISP_CHANGE_BADFLAGS" _ -4,
		"DISP_CHANGE_BADPARAM" _ -5,

		"DISP_CHANGE_BADDUALVIEW" _ -6 // _WIN32_WINNT >= 0x0501
	)

	IntConstant.block(
		"Device state flags.",
		"DISPLAY_DEVICE_ATTACHED_TO_DESKTOP" _ 0x00000001,
		"DISPLAY_DEVICE_MULTI_DRIVER" _ 0x00000002,
		"DISPLAY_DEVICE_PRIMARY_DEVICE" _ 0x00000004,
		"DISPLAY_DEVICE_MIRRORING_DRIVER" _ 0x00000008,
		"DISPLAY_DEVICE_VGA_COMPATIBLE" _ 0x00000010,
		"DISPLAY_DEVICE_REMOVABLE" _ 0x00000020,
		"DISPLAY_DEVICE_MODESPRUNED" _ 0x08000000,
		"DISPLAY_DEVICE_REMOTE" _ 0x04000000,
		"DISPLAY_DEVICE_DISCONNECT" _ 0x02000000,
		"DISPLAY_DEVICE_TS_COMPATIBLE" _ 0x00200000,
		"DISPLAY_DEVICE_UNSAFE_MODES_ON" _ 0x00080000, // _WIN32_WINNT >= _WIN32_WINNT_LONGHORN

		/* Child device state */
		"DISPLAY_DEVICE_ACTIVE" _ 0x00000001,
		"DISPLAY_DEVICE_ATTACHED" _ 0x00000002
	)

	IntConstant.block(
		"Flags for {@link #EnumDisplaySettingsEx}.",
		"EDS_RAWMODE" _ 0x00000002,
		"EDS_ROTATEDMODE" _ 0x00000004
	)

	ATOM.func(
		"RegisterClassEx",
		"Registers a window class for subsequent use in calls to the {@link #CreateWindowEx} function.",

		const _ WNDCLASSEX.IN(
			"wndClassEx",
			"a {@link WNDCLASSEX} structure. You must fill the structure with the appropriate class attributes before passing it to the function."
		)
	)

	BOOL.func(
		"UnregisterClass",
		"Unregisters a window class, freeing the memory required for the class.",

		LPCTSTR.IN(
			"className",
		    """
		    a null-terminated string or a class atom. If {@code className} is a string, it specifies the window class name. This class name must have been
		    registered by a previous call to the {@link #RegisterClass} or {@link #RegisterClassEx} function. System classes, such as dialog box controls,
		    cannot be unregistered. If this parameter is an atom, it must be a class atom created by a previous call to the {@link #RegisterClass} or
		    {@link #RegisterClassEx} function. The atom must be in the low-order word of {@code className}; the high-order word must be zero.
		    """
		),
		HINSTANCE.IN("instance", "a handle to the instance of the module that created the class")
	)

	BOOL.func(
		"GetClassInfoEx",
		"Retrieves information about a window class, including a handle to the small icon associated with the window class.",

		HINSTANCE.IN(
			"instance",
			"""a handle to the instance of the application that created the class. To retrieve information about classes defined by the system (such as buttons
			or list boxes), set this parameter to NULL.
			"""
		),
		LPCTSTR.IN(
			"className",
		    """
		    the class name. The name must be that of a preregistered class or a class registered by a previous call to the {@link #RegisterClass} or
		    {@link #RegisterClassEx} function. Alternatively, this parameter can be a class atom created by a previous call to {@link #RegisterClass} or
		    {@link #RegisterClassEx}. The atom must be in the low-order word of {@code className}; the high-order word must be zero.
		    """
		),
		LPWNDCLASSEX.OUT("classEx", "a {@link WNDCLASSEX} structure that receives the information about the class.")
	)

	DWORD.func(
		"GetClassLong",
		"Retrieves the specified value from the WNDCLASSEX structure associated with the specified window.",

		HWND.IN("window", "a handle to the window and, indirectly, the class to which the window belongs"),
		int.IN("index", "the value to be retrieved")
	)

	DWORD.func(
		"SetClassLong",
		"""
		Replaces the specified value at the specified offset into the extra class memory or the WNDCLASSEX structure for the class to which the specified window
		belongs.
		""",

		HWND.IN("window", "a handle to the window and, indirectly, the class to which the window belongs"),
		int.IN("index", "the value to be replaced"),
		LONG.IN("newLong", "the replacement value")
	)

	HICON.func(
		"LoadIcon",
		"Loads the specified icon resource from the executable (.exe) file associated with an application instance.",

		HINSTANCE.IN(
			"instance",
			"""
			a handle to an instance of the module whose executable file contains the icon to be loaded. This parameter must be NULL when a standard icon is
			being loaded.
			"""
		),
		LPCTSTR.IN("iconName", "the name of the icon resource to be loaded")
	)

	HCURSOR.func(
		"LoadCursor",
		"Loads the specified cursor resource from the executable (.EXE) file associated with an application instance.",

		HINSTANCE.IN("instance", "a handle to an instance of the module whose executable file contains the cursor to be loaded."),
		LPCTSTR.IN("cursorName", "the name of the cursor resource to be loaded")
	)

	int.func(
		"GetSystemMetrics",
		"Retrieves the specified system metric or system configuration setting.",

		int.IN("index", "the system metric or configuration setting to be retrieved")
	)

	HWND.func(
		"CreateWindowEx",
		"Creates an overlapped, pop-up, or child window with an extended window style; otherwise, this function is identical to the CreateWindow function.",

		DWORD.IN("exStyle", "the extended window style of the window being created"),
		LPCTSTR.IN("className", "a null-terminated string or a class atom created by a previous call to the {@link #RegisterClass} or {@link #RegisterClassEx} function."),
		LPCTSTR.IN("windowName", "the window name. If the window style specifies a title bar, the window title pointed to by {@code windowName} is displayed in the title bar."),
		DWORD.IN("style", "the style of the window being created"),
		int.IN("x", "the initial horizontal position of the window"),
		int.IN("y", "the initial vertical position of the window"),
		int.IN("width", "the width, in device units, of the window"),
		int.IN("height", "the height, in device units, of the window"),
		nullable _ HWND.IN("parent", "a handle to the parent or owner window of the window being created. To create a child window or an owned window, supply a valid window handle."),
		nullable _ HMENU.IN("menu", "a handle to a menu, or specifies a child-window identifier, depending on the window style"),
		HINSTANCE.IN("instance", "a handle to the instance of the module to be associated with the window"),
		nullable _ LPVOID.IN("param", "a value to be passed to the window through the {@link CREATESTRUCT} structure ({@code createParams} member) pointed to by the {@code lParam} param of the WM_CREATE message.")
	)

	BOOL.func(
		"DestroyWindow",
		"""
		Destroys the specified window. The function sends WM_DESTROY and WM_NCDESTROY messages to the window to deactivate it and remove the keyboard focus from
		it. The function also destroys the window's menu, flushes the thread message queue, destroys timers, removes clipboard ownership, and breaks the
		clipboard viewer chain (if the window is at the top of the viewer chain).

		If the specified window is a parent or owner window, DestroyWindow automatically destroys the associated child or owned windows when it destroys the
		parent or owner window. The function first destroys child or owned windows, and then it destroys the parent or owner window.
		""",

		HWND.IN("window", "a handle to the window to be destroyed")
	)

	BOOL.func(
		"ShowWindow",
		"Sets the specified window's show state.",

		HWND.IN("window", "a handle to the window"),
		int.IN("cmdShow", "controls how the window is to be shown")
	)

	BOOL.func(
		"UpdateWindow",
		"""
		Updates the client area of the specified window by sending a WM_PAINT message to the window if the window's update region is not empty. The function
		sends a WM_PAINT message directly to the window procedure of the specified window, bypassing the application queue. If the update region is empty, no
		message is sent.
		""",

		HWND.IN("window", "handle to the window to be updated")
	)

	BOOL.func(
		"SetWindowPos",
		"""
		Changes the size, position, and Z order of a child, pop-up, or top-level window. These windows are ordered according to their appearance on the screen.
		The topmost window receives the highest rank and is the first window in the Z order.
		""",

		HWND.IN("window", "a handle to the window"),
		HWND.IN("insertAfter", "a handle to the window to precede the positioned window in the Z order"),
		int.IN("x", "the new position of the left side of the window, in client coordinates"),
		int.IN("y", "the new position of the top of the window, in client coordinates"),
		int.IN("width", "the new width of the window, in pixels"),
		int.IN("height", "the new height of the window, in pixels"),
		UINT.IN("flags", "the window sizing and positioning flags")
	)

	BOOL.func(
		"GetMessage",
		"""
		Retrieves a message from the calling thread's message queue. The function dispatches incoming sent messages until a posted message is available for
		retrieval. Unlike GetMessage, the {@link #PeekMessage} function does not wait for a message to be posted before returning.
		""",

		LPMSG.OUT("msg", "an {@link MSG} structure that receives message information from the thread's message queue"),
		nullable _ HWND.IN("window", "a handle to the window whose messages are to be retrieved. The window must belong to the current thread."),
		UINT.IN("msgFilterMin", "the integer value of the lowest message value to be retrieved"),
		UINT.IN("msgFilterMax", "the integer value of the highest message value to be retrieved")
	)

	BOOL.func(
		"PeekMessage",
		"Dispatches incoming sent messages, checks the thread message queue for a posted message, and retrieves the message (if any exist).",

		LPMSG.OUT("msg", "an {@link MSG} structure that receives message information"),
		nullable _ HWND.IN("window", "a handle to the window whose messages are to be retrieved. The window must belong to the current thread."),
		UINT.IN("msgFilterMin", "the value of the first message in the range of messages to be examined"),
		UINT.IN("msgFilterMax", "the value of the last message in the range of messages to be examined"),
		UINT.IN("removeMsg", "specifies how messages are to be handled: One of", "#PM_NOREMOVE #PM_REMOVE #PM_NOYIELD")
	)

	BOOL.func(
		"TranslateMessage",
		"""
		Translates virtual-key messages into character messages. The character messages are posted to the calling thread's message queue, to be read the next
		time the thread calls the {@link #GetMessage} or @{link #PeekMessage} function.
		""",

		const _ MSG.IN(
			"msg",
			"""
			an {@link MSG} structure that contains message information retrieved from the calling thread's message queue by using the
			{@link #GetMessage} or {@link #PeekMessage} function.
			"""
		)
	)

	LRESULT.func(
		"DispatchMessage",
		"Dispatches a message to a window procedure. It is typically used to dispatch a message retrieved by the {@link #GetMessage} function.",

		const _ MSG.IN("msg", "a structure that contains the message")
	)

	DWORD.func(
		"GetQueueStatus",
		"Retrieves the type of messages found in the calling thread's message queue.",

		UINT.IN("flags", "the types of messages for which to check")
	)

	LONG.func(
		"GetMessageTime",
		"""
		Retrieves the message time for the last message retrieved by the GetMessage function. The time is a long integer that specifies the elapsed time, in
		milliseconds, from the time the system was started to the time the message was created (that is, placed in the thread's message queue).
		"""
	)

	LRESULT.func(
		"DefWindowProc",
		"""
		Calls the default window procedure to provide default processing for any window messages that an application does not process. This function ensures
		that every message is processed. DefWindowProc is called with the same parameters received by the window procedure.
		""",

		HWND.IN("window", "a handle to the window that received the message"),
		UINT.IN("msg", "the message"),
		WPARAM.IN("wParam", "additional message information. The content of this parameter depends on the value of the {@code msg} parameter."),
		LPARAM.IN("lParam", "additional message information. The content of this parameter depends on the value of the {@code msg} parameter.")
	)

	HDC.func(
		"GetDC",
		"""
		Retrieves a handle to a device context (DC) for the client area of a specified window or for the entire screen. You can use the returned handle in
		subsequent GDI functions to draw in the DC. The device context is an opaque data structure, whose values are used internally by GDI.
		""",

		// TODO: Add nullable
		HWND.IN("window", "a handle to the window whose DC is to be retrieved. If this value is NULL, {@code GetDC} retrieves the DC for the entire screen.")
	)

	int.func(
		"ReleaseDC",
		"""
		Releases a device context (DC), freeing it for use by other applications. The effect of the ReleaseDC function depends on the type of DC. It frees only
		common and window DCs. It has no effect on class or private DCs.
		""",

		HWND.IN("window", "a handle to the window whose DC is to be released"),
		HDC.IN("dc", "a handle to the DC to be released")
	)

	BOOL.func(
		"EnumDisplayDevices",
		"Obtains information about the display devices in the current session.",

		LPCTSTR.IN("device", "the device name. If NULL, function returns information for the display adapter(s) on the machine, based on {@code devNum}."),
		DWORD.IN(
			"devNum",
		    """
		    an index value that specifies the display device of interest. The operating system identifies each display device in the current session with an
		    index value. The index values are consecutive integers, starting at 0. If the current session has three display devices, for example, they are
		    specified by the index values 0, 1, and 2.
		    """
		),
		PDISPLAY_DEVICE.OUT(
			"displayDevice",
		    """
		    a {@link DISPLAY_DEVICE} structure that receives information about the display device specified by {@code devNum}. Before calling
		    {@code EnumDisplayDevices}, you must initialize the cb member of {@code DISPLAY_DEVICE} to the size, in bytes, of {@code DISPLAY_DEVICE}.
		    """
		),
		DWORD.IN("flags", "set this flag to EDD_GET_DEVICE_INTERFACE_NAME (0x00000001) to retrieve the device interface name for GUID_DEVINTERFACE_MONITOR, which is registered by the operating system on a per monitor basis")
	)

	BOOL.func(
		"EnumDisplaySettings",
		"""
		Retrieves information about one of the graphics modes for a display device. To retrieve information for all the graphics modes of a display device, make
		a series of calls to this function.
		""",

		// TODO: Add nullable
		LPCTSTR.IN(
			"deviceName",
			"""
			a null-terminated string that specifies the display device about whose graphics mode the function will obtain information. This parameter is either
			NULL or a DISPLAY_DEVICE.DeviceName returned from {@link #EnumDisplayDevices}. A NULL value specifies the current display device on the computer on
			which the calling thread is running.
			"""
		),
		DWORD.IN("modeNum", "the type of information to be retrieved. This value can be a graphics mode index or one of:", "#ENUM_CURRENT_SETTINGS #ENUM_REGISTRY_SETTINGS"),
		DEVMODE.OUT("devMode", "a {@link DEVMODE} structure into which the function stores information about the specified graphics mode")
	)

	BOOL.func(
		"EnumDisplaySettingsEx",
		"""
		Retrieves information about one of the graphics modes for a display device. To retrieve information for all the graphics modes for a display device,
		make a series of calls to this function. This function differs from {@link #EnumDisplaySettings} in that there is a {@code flags} parameter.
		""",

		LPCTSTR.IN("deviceName", "a null-terminated string that specifies the display device about which graphics mode the function will obtain information"),
		DWORD.IN("modeNum", "the type of information to be retrieved. This value can be a graphics mode index or one of:", "#ENUM_CURRENT_SETTINGS #ENUM_REGISTRY_SETTINGS"),
		DEVMODE.OUT("devMode", "a {@link DEVMODE} structure into which the function stores information about the specified graphics mode"),
		DWORD.IN("flags", "One of:", "#EDS_RAWMODE #EDS_ROTATEDMODE")
	)

	LONG.func(
		"ChangeDisplaySettings",
		"Changes the settings of the default display device to the specified graphics mode.",

		DEVMODE.IN(
			"devMode",
		    """
		    a {@link DEVMODE} structure that describes the new graphics mode. If {@code devMode} is NULL, all the values currently in the registry will be used
		    for the display setting. Passing NULL for the {@code devMode} parameter and 0 for the {@code flagS} parameter is the easiest way to return to the
		    default mode after a dynamic mode change.
		    """
		),
		DWORD.IN("flags", "indicates how the graphics mode should be changed")
	)

	LONG.func(
		"ChangeDisplaySettingsEx",
		"Changes the settings of the specified display device to the specified graphics mode.",

		LPCTSTR.IN("deviceName", "a null-terminated string that specifies the display device whose graphics mode will change"),
		DEVMODE.IN(
			"devMode",
			"""
		    a {@link DEVMODE} structure that describes the new graphics mode. If {@code devMode} is NULL, all the values currently in the registry will be used
		    for the display setting. Passing NULL for the {@code devMode} parameter and 0 for the {@code flagS} parameter is the easiest way to return to the
		    default mode after a dynamic mode change.
		    """
		),
		HWND.IN("window", "reserved; must be NULL"),
		DWORD.IN("flags", "indicates how the graphics mode should be changed"),
		LPVOID.IN("param", "if {@code flags} is {@link #CDS_VIDEOPARAMETERS}, {@code param} is a pointer to a {@link VIDEOPARAMETERS} structure. Otherwise {@code param} must be NULL.")
	)

}