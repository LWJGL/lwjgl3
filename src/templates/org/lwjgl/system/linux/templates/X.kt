/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.linux.templates

import org.lwjgl.generator.*
import org.lwjgl.system.linux.*

val None = "X#None"

val X = "X".nativeClass(LINUX_PACKAGE) {

	documentation = "Native bindings to X.h."

	IntConstant(
		"RESERVED RESOURCE AND CONSTANT DEFINITIONS",

		"None" _ 0,
		"ParentRelative" _ 1,
		"CopyFromParent" _ 0,
		"PointerWindow" _ 0,
		"InputFocus" _ 1,
		"PointerRoot" _ 1,
		"AnyPropertyType" _ 0,
		"AnyKey" _ 0,
		"AnyButton" _ 0,
		"AllTemporary" _ 0,
		"CurrentTime" _ 0,
		"NoSymbol" _ 0
	)

	IntConstant(
		"ERROR CODES",

		"Success" _ 0,
		"BadRequest" _ 1,
		"BadValue" _ 2,
		"BadWindow" _ 3,
		"BadPixmap" _ 4,
		"BadAtom" _ 5,
		"BadCursor" _ 6,
		"BadFont" _ 7,
		"BadMatch" _ 8,
		"BadDrawable" _ 9,
		"BadAccess" _ 10,
		"BadAlloc" _ 11,
		"BadColor" _ 12,
		"BadGC" _ 13,
		"BadIDChoice" _ 14,
		"BadName" _ 15,
		"BadLength" _ 16,
		"BadImplementation" _ 17
	)

	IntConstant(
		"Window attributes for CreateWindow and ChangeWindowAttributes",

		"CWBackPixmap" expr "1 << 0",
		"CWBackPixel" expr "1 << 1",
		"CWBorderPixmap" expr "1 << 2",
		"CWBorderPixel" expr "1 << 3",
		"CWBitGravity" expr "1 << 4",
		"CWWinGravity" expr "1 << 5",
		"CWBackingStore" expr "1 << 6",
		"CWBackingPlanes" expr "1 << 7",
		"CWBackingPixel" expr "1 << 8",
		"CWOverrideRedirect" expr "1 << 9",
		"CWSaveUnder" expr "1 << 10",
		"CWEventMask" expr "1 << 11",
		"CWDontPropagate" expr "1 << 12",
		"CWColormap" expr "1 << 13",
		"CWCursor" expr "1 << 14"
	)

	IntConstant(
		"Input Event Masks. Used as event-mask window attribute and as arguments to Grab requests. Not to be confused with event names.",

		"NoEventMask" _ 0,
		"KeyPressMask" expr "1 << 0",
		"KeyReleaseMask" expr "1 << 1",
		"ButtonPressMask" expr "1 << 2",
		"ButtonReleaseMask" expr "1 << 3",
		"EnterWindowMask" expr "1 << 4",
		"LeaveWindowMask" expr "1 << 5",
		"PointerMotionMask" expr "1 << 6",
		"PointerMotionHintMask" expr "1 << 7",
		"Button1MotionMask" expr "1 << 8",
		"Button2MotionMask" expr "1 << 9",
		"Button3MotionMask" expr "1 << 10",
		"Button4MotionMask" expr "1 << 11",
		"Button5MotionMask" expr "1 << 12",
		"ButtonMotionMask" expr "1 << 13",
		"KeymapStateMask" expr "1 << 14",
		"ExposureMask" expr "1 << 15",
		"VisibilityChangeMask" expr "1 << 16",
		"StructureNotifyMask" expr "1 << 17",
		"ResizeRedirectMask" expr "1 << 18",
		"SubstructureNotifyMask" expr "1 << 19",
		"SubstructureRedirectMask" expr "1 << 20",
		"FocusChangeMask" expr "1 << 21",
		"PropertyChangeMask" expr "1 << 22",
		"ColormapChangeMask" expr "1 << 23",
		"OwnerGrabButtonMask" expr "1 << 24"
	)

	IntConstant(
		"""
		Event names. Used in "type" field in ##XEvent structures. Not to be confused with event masks above. They start from 2 because 0 and 1 are
		reserved in the protocol for errors and replies.
		""",

		"KeyPress" _ 2,
		"KeyRelease" _ 3,
		"ButtonPress" _ 4,
		"ButtonRelease" _ 5,
		"MotionNotify" _ 6,
		"EnterNotify" _ 7,
		"LeaveNotify" _ 8,
		"FocusIn" _ 9,
		"FocusOut" _ 10,
		"KeymapNotify" _ 11,
		"Expose" _ 12,
		"GraphicsExpose" _ 13,
		"NoExpose" _ 14,
		"VisibilityNotify" _ 15,
		"CreateNotify" _ 16,
		"DestroyNotify" _ 17,
		"UnmapNotify" _ 18,
		"MapNotify" _ 19,
		"MapRequest" _ 20,
		"ReparentNotify" _ 21,
		"ConfigureNotify" _ 22,
		"ConfigureRequest" _ 23,
		"GravityNotify" _ 24,
		"ResizeRequest" _ 25,
		"CirculateNotify" _ 26,
		"CirculateRequest" _ 27,
		"PropertyNotify" _ 28,
		"SelectionClear" _ 29,
		"SelectionRequest" _ 30,
		"SelectionNotify" _ 31,
		"ColormapNotify" _ 32,
		"ClientMessage" _ 33,
		"MappingNotify" _ 34,
		"GenericEvent" _ 35,
		"LASTEvent" _ 36
	)

	IntConstant(
		"Key masks. Used as modifiers to GrabButton and GrabKey, results of QueryPointer, state in various key-, mouse-, and button-related events.",

		"ShiftMask" expr "1<<0",
		"LockMask" expr "1<<1",
		"ControlMask" expr "1<<2",
		"Mod1Mask" expr "1<<3",
		"Mod2Mask" expr "1<<4",
		"Mod3Mask" expr "1<<5",
		"Mod4Mask" expr "1<<6",
		"Mod5Mask" expr "1<<7"
	)

	IntConstant(
		"modifier names. Used to build a SetModifierMapping request or to read a GetModifierMapping request. These correspond to the masks defined above.",

		"ShiftMapIndex" _ 0,
		"LockMapIndex" _ 1,
		"ControlMapIndex" _ 2,
		"Mod1MapIndex" _ 3,
		"Mod2MapIndex" _ 4,
		"Mod3MapIndex" _ 5,
		"Mod4MapIndex" _ 6,
		"Mod5MapIndex" _ 7
	)

	IntConstant(
		"button masks. Used in same manner as Key masks above. Not to be confused with button names below.",

		"Button1Mask" expr "1<<8",
		"Button2Mask" expr "1<<9",
		"Button3Mask" expr "1<<10",
		"Button4Mask" expr "1<<11",
		"Button5Mask" expr "1<<12",
		"AnyModifier" expr "1<<15"
	)

	IntConstant(
		"""
		button names. Used as arguments to GrabButton and as detail in ButtonPress and ButtonRelease events. Not to be confused with button masks above. Note
		that 0 is already defined above as "AnyButton".
		""",

		"Button1" _ 1,
		"Button2" _ 2,
		"Button3" _ 3,
		"Button4" _ 4,
		"Button5" _ 5
	)

	IntConstant(
		"Notify modes",

		"NotifyNormal" _ 0,
		"NotifyGrab" _ 1,
		"NotifyUngrab" _ 2,
		"NotifyWhileGrabbed" _ 3,
		"NotifyHint" _ 1
	)

	IntConstant(
		"Notify detail",

		"NotifyAncestor" _ 0,
		"NotifyVirtual" _ 1,
		"NotifyInferior" _ 2,
		"NotifyNonlinear" _ 3,
		"NotifyNonlinearVirtual" _ 4,
		"NotifyPointer" _ 5,
		"NotifyPointerRoot" _ 6,
		"NotifyDetailNone" _ 7
	)

	IntConstant(
		"Visibility notify",

		"VisibilityUnobscured" _ 0,
		"VisibilityPartiallyObscured" _ 1,
		"VisibilityFullyObscured" _ 2
	)

	IntConstant(
		"Circulation request",

		"PlaceOnTop" _ 0,
		"PlaceOnBottom" _ 1
	)

	IntConstant(
		"Property notification",

		"PropertyNewValue" _ 0,
		"PropertyDelete" _ 1
	)

	IntConstant(
		"Color Map notification",

		"ColormapUninstalled" _ 0,
		"ColormapInstalled" _ 1
	)

	IntConstant(
		"GrabPointer, GrabButton, GrabKeyboard, GrabKey Modes",

		"GrabModeSync" _ 0,
		"GrabModeAsync" _ 1
	)

	IntConstant(
		"GrabPointer, GrabKeyboard reply status",

		"GrabSuccess" _ 0,
		"AlreadyGrabbed" _ 1,
		"GrabInvalidTime" _ 2,
		"GrabNotViewable" _ 3,
		"GrabFrozen" _ 4
	)

	IntConstant(
		"AllowEvents modes",

		"AsyncPointer" _ 0,
		"SyncPointer" _ 1,
		"ReplayPointer" _ 2,
		"AsyncKeyboard" _ 3,
		"SyncKeyboard" _ 4,
		"ReplayKeyboard" _ 5,
		"AsyncBoth" _ 6,
		"SyncBoth" _ 7
	)

	IntConstant(
		"For Xlib#XCreateColormap().",

		"AllocNone" _ 0,
		"AllocAll" _ 1
	)

	IntConstant(
		"Used in Xlib#XSetInputFocus(), Xlib#XGetInputFocus().",

		"RevertToNone" expr "None",
		"RevertToPointerRoot" expr "PointerRoot",
		"RevertToParent" _ 2
	)

	IntConstant(
		"Window classes used by Xlib#XCreateWindow().",

		"InputOutput" _ 1,
		"InputOnly" _ 2
	)

	IntConstant(
		"SCREEN SAVER STUFF",

		"DontPreferBlanking" _ 0,
		"PreferBlanking" _ 1,
		"DefaultBlanking" _ 2,
		"DisableScreenSaver" _ 0,
		"DisableScreenInterval" _ 0,
		"DontAllowExposures" _ 0,
		"AllowExposures" _ 1,
		"DefaultExposures" _ 2,
		"ScreenSaverReset" _ 0,
		"ScreenSaverActive" _ 1
	)

	IntConstant(
		"Property modes",

		"PropModeReplace" _ 0,
		"PropModePrepend" _ 1,
		"PropModeAppend" _ 2
	)

	IntConstant(
		"graphics functions, as in GC.alu",

		"GXclear" _ 0x0,
		"GXand" _ 0x1,
		"GXandReverse" _ 0x2,
		"GXcopy" _ 0x3,
		"GXandInverted" _ 0x4,
		"GXnoop" _ 0x5,
		"GXxor" _ 0x6,
		"GXor" _ 0x7,
		"GXnor" _ 0x8,
		"GXequiv" _ 0x9,
		"GXinvert" _ 0xa,
		"GXorReverse" _ 0xb,
		"GXcopyInverted" _ 0xc,
		"GXorInverted" _ 0xd,
		"GXnand" _ 0xe,
		"GXset" _ 0xf
	)

	IntConstant(
		"LineStyle",

		"LineSolid" _ 0,
		"LineOnOffDash" _ 1,
		"LineDoubleDash" _ 2
	)

	IntConstant(
		"capStyle",

		"CapNotLast" _ 0,
		"CapButt" _ 1,
		"CapRound" _ 2,
		"CapProjecting" _ 3
	)

	IntConstant(
		"joinStyle",

		"JoinMiter" _ 0,
		"JoinRound" _ 1,
		"JoinBevel" _ 2
	)

	IntConstant(
		"fillStyle",

		"FillSolid" _ 0,
		"FillTiled" _ 1,
		"FillStippled" _ 2,
		"FillOpaqueStippled" _ 3
	)

	IntConstant(
		"fillRule",

		"EvenOddRule" _ 0,
		"WindingRule" _ 1
	)

	IntConstant(
		"subwindow mode",

		"ClipByChildren" _ 0,
		"IncludeInferiors" _ 1
	)

	IntConstant(
		"SetClipRectangles ordering",

		"Unsorted" _ 0,
		"YSorted" _ 1,
		"YXSorted" _ 2,
		"YXBanded" _ 3
	)

	IntConstant(
		"CoordinateMode for drawing routines",

		"CoordModeOrigin" _ 0,
		"CoordModePrevious" _ 1
	)

	IntConstant(
		"Polygon shapes",

		"Complex" _ 0,
		"Nonconvex" _ 1,
		"Convex" _ 2
	)

	IntConstant(
		"Arc modes for PolyFillArc",

		"ArcChord" _ 0,
		"ArcPieSlice" _ 1
	)

	IntConstant(
		"GC components: masks used in CreateGC, CopyGC, ChangeGC, OR'ed into GC.stateChanges",

		"GCFunction" expr "1<<0",
		"GCPlaneMask" expr "1<<1",
		"GCForeground" expr "1<<2",
		"GCBackground" expr "1<<3",
		"GCLineWidth" expr "1<<4",
		"GCLineStyle" expr "1<<5",
		"GCCapStyle" expr "1<<6",
		"GCJoinStyle" expr "1<<7",
		"GCFillStyle" expr "1<<8",
		"GCFillRule" expr "1<<9",
		"GCTile" expr "1<<10",
		"GCStipple" expr "1<<11",
		"GCTileStipXOrigin" expr "1<<12",
		"GCTileStipYOrigin" expr "1<<13",
		"GCFont" expr "1<<14",
		"GCSubwindowMode" expr "1<<15",
		"GCGraphicsExposures" expr "1<<16",
		"GCClipXOrigin" expr "1<<17",
		"GCClipYOrigin" expr "1<<18",
		"GCClipMask" expr "1<<19",
		"GCDashOffset" expr "1<<20",
		"GCDashList" expr "1<<21",
		"GCArcMode" expr "1<<22",
		"GCLastBit" _ 22
	)

}