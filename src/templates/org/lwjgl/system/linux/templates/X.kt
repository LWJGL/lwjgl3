/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.linux.templates

import org.lwjgl.generator.*
import org.lwjgl.system.linux.*

fun X() = "X".nativeClass(LINUX_PACKAGE) {

	javaDoc("Native bindings to X.h.")

	IntConstant.block(
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

	IntConstant.block(
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

	IntConstant.block(
		"Window attributes for CreateWindow and ChangeWindowAttributes",

		"CWBackPixmap".expr<Int>("1 << 0"),
		"CWBackPixel".expr<Int>("1 << 1"),
		"CWBorderPixmap".expr<Int>("1 << 2"),
		"CWBorderPixel".expr<Int>("1 << 3"),
		"CWBitGravity".expr<Int>("1 << 4"),
		"CWWinGravity".expr<Int>("1 << 5"),
		"CWBackingStore".expr<Int>("1 << 6"),
		"CWBackingPlanes".expr<Int>("1 << 7"),
		"CWBackingPixel".expr<Int>("1 << 8"),
		"CWOverrideRedirect".expr<Int>("1 << 9"),
		"CWSaveUnder".expr<Int>("1 << 10"),
		"CWEventMask".expr<Int>("1 << 11"),
		"CWDontPropagate".expr<Int>("1 << 12"),
		"CWColormap".expr<Int>("1 << 13"),
		"CWCursor".expr<Int>("1 << 14")
	)

	IntConstant.block(
		"Input Event Masks. Used as event-mask window attribute and as arguments to Grab requests. Not to be confused with event names.",

		"NoEventMask" _ 0,
		"KeyPressMask".expr<Int>("1 << 0"),
		"KeyReleaseMask".expr<Int>("1 << 1"),
		"ButtonPressMask".expr<Int>("1 << 2"),
		"ButtonReleaseMask".expr<Int>("1 << 3"),
		"EnterWindowMask".expr<Int>("1 << 4"),
		"LeaveWindowMask".expr<Int>("1 << 5"),
		"PointerMotionMask".expr<Int>("1 << 6"),
		"PointerMotionHintMask".expr<Int>("1 << 7"),
		"Button1MotionMask".expr<Int>("1 << 8"),
		"Button2MotionMask".expr<Int>("1 << 9"),
		"Button3MotionMask".expr<Int>("1 << 10"),
		"Button4MotionMask".expr<Int>("1 << 11"),
		"Button5MotionMask".expr<Int>("1 << 12"),
		"ButtonMotionMask".expr<Int>("1 << 13"),
		"KeymapStateMask".expr<Int>("1 << 14"),
		"ExposureMask".expr<Int>("1 << 15"),
		"VisibilityChangeMask".expr<Int>("1 << 16"),
		"StructureNotifyMask".expr<Int>("1 << 17"),
		"ResizeRedirectMask".expr<Int>("1 << 18"),
		"SubstructureNotifyMask".expr<Int>("1 << 19"),
		"SubstructureRedirectMask".expr<Int>("1 << 20"),
		"FocusChangeMask".expr<Int>("1 << 21"),
		"PropertyChangeMask".expr<Int>("1 << 22"),
		"ColormapChangeMask".expr<Int>("1 << 23"),
		"OwnerGrabButtonMask".expr<Int>("1 << 24")
	)

	IntConstant.block(
		"""
		Event names. Used in "type" field in {@link XEvent} structures. Not to be confused with event masks above. They start from 2 because 0 and 1 are
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

	IntConstant.block(
		"Key masks. Used as modifiers to GrabButton and GrabKey, results of QueryPointer, state in various key-, mouse-, and button-related events.",

		"ShiftMask".expr<Int>("1<<0"),
		"LockMask".expr<Int>("1<<1"),
		"ControlMask".expr<Int>("1<<2"),
		"Mod1Mask".expr<Int>("1<<3"),
		"Mod2Mask".expr<Int>("1<<4"),
		"Mod3Mask".expr<Int>("1<<5"),
		"Mod4Mask".expr<Int>("1<<6"),
		"Mod5Mask".expr<Int>("1<<7")
	)

	IntConstant.block(
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

	IntConstant.block(
		"button masks. Used in same manner as Key masks above. Not to be confused with button names below.",

		"Button1Mask".expr<Int>("1<<8"),
		"Button2Mask".expr<Int>("1<<9"),
		"Button3Mask".expr<Int>("1<<10"),
		"Button4Mask".expr<Int>("1<<11"),
		"Button5Mask".expr<Int>("1<<12"),
		"AnyModifier".expr<Int>("1<<15")
	)

	IntConstant.block(
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

	IntConstant.block(
		"Notify modes",

		"NotifyNormal" _ 0,
		"NotifyGrab" _ 1,
		"NotifyUngrab" _ 2,
		"NotifyWhileGrabbed" _ 3,
		"NotifyHint" _ 1
	)

	IntConstant.block(
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

	IntConstant.block(
		"Visibility notify",

		"VisibilityUnobscured" _ 0,
		"VisibilityPartiallyObscured" _ 1,
		"VisibilityFullyObscured" _ 2
	)

	IntConstant.block(
		"Circulation request",

		"PlaceOnTop" _ 0,
		"PlaceOnBottom" _ 1
	)

		IntConstant.block(
		"Property notification",

		"PropertyNewValue" _ 0,
		"PropertyDelete" _ 1
	)

	IntConstant.block(
		"Color Map notification",

		"ColormapUninstalled" _ 0,
		"ColormapInstalled" _ 1
	)

	IntConstant.block(
		"GrabPointer, GrabButton, GrabKeyboard, GrabKey Modes",

		"GrabModeSync" _ 0,
		"GrabModeAsync" _ 1
	)

	IntConstant.block(
		"GrabPointer, GrabKeyboard reply status",

		"GrabSuccess" _ 0,
		"AlreadyGrabbed" _ 1,
		"GrabInvalidTime" _ 2,
		"GrabNotViewable" _ 3,
		"GrabFrozen" _ 4
	)

	IntConstant.block(
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

	IntConstant.block(
		"For {@link Xlib#XCreateColormap}.",

		"AllocNone" _ 0,
		"AllocAll" _ 1
	)

	IntConstant.block(
		"Used in {@link Xlib#XSetInputFocus}, {@link Xlib#XGetInputFocus}.",

		"RevertToNone".expr<Int>("None"),
		"RevertToPointerRoot".expr<Int>("PointerRoot"),
		"RevertToParent" _ 2
	)

	IntConstant.block(
		"Window classes used by {@link Xlib#XCreateWindow}.",

		"InputOutput" _ 1,
		"InputOnly" _ 2
	)

	IntConstant.block(
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

	IntConstant.block(
		"Property modes",

		"PropModeReplace" _ 0,
		"PropModePrepend" _ 1,
		"PropModeAppend" _ 2
	)

	IntConstant.block(
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

	IntConstant.block(
		"LineStyle",

		"LineSolid" _ 0,
		"LineOnOffDash" _ 1,
		"LineDoubleDash" _ 2
	)

	IntConstant.block(
		"capStyle",

		"CapNotLast" _ 0,
		"CapButt" _ 1,
		"CapRound" _ 2,
		"CapProjecting" _ 3
	)

	IntConstant.block(
		"joinStyle",

		"JoinMiter" _ 0,
		"JoinRound" _ 1,
		"JoinBevel" _ 2
	)

	IntConstant.block(
		"fillStyle",

		"FillSolid" _ 0,
		"FillTiled" _ 1,
		"FillStippled" _ 2,
		"FillOpaqueStippled" _ 3
	)

	IntConstant.block(
		"fillRule",

		"EvenOddRule" _ 0,
		"WindingRule" _ 1
	)

	IntConstant.block(
		"subwindow mode",

		"ClipByChildren" _ 0,
		"IncludeInferiors" _ 1
	)

	IntConstant.block(
		"SetClipRectangles ordering",

		"Unsorted" _ 0,
		"YSorted" _ 1,
		"YXSorted" _ 2,
		"YXBanded" _ 3
	)

	IntConstant.block(
		"CoordinateMode for drawing routines",

		"CoordModeOrigin" _ 0,
		"CoordModePrevious" _ 1
	)

	IntConstant.block(
		"Polygon shapes",

		"Complex" _ 0,
		"Nonconvex" _ 1,
		"Convex" _ 2
	)

	IntConstant.block(
		"Arc modes for PolyFillArc",

		"ArcChord" _ 0,
		"ArcPieSlice" _ 1
	)

	IntConstant.block(
		"GC components: masks used in CreateGC, CopyGC, ChangeGC, OR'ed into GC.stateChanges",

		"GCFunction".expr<Int>("1<<0"),
		"GCPlaneMask".expr<Int>("1<<1"),
		"GCForeground".expr<Int>("1<<2"),
		"GCBackground".expr<Int>("1<<3"),
		"GCLineWidth".expr<Int>("1<<4"),
		"GCLineStyle".expr<Int>("1<<5"),
		"GCCapStyle".expr<Int>("1<<6"),
		"GCJoinStyle".expr<Int>("1<<7"),
		"GCFillStyle".expr<Int>("1<<8"),
		"GCFillRule".expr<Int>("1<<9"),
		"GCTile".expr<Int>("1<<10"),
		"GCStipple".expr<Int>("1<<11"),
		"GCTileStipXOrigin".expr<Int>("1<<12"),
		"GCTileStipYOrigin".expr<Int>("1<<13"),
		"GCFont".expr<Int>("1<<14"),
		"GCSubwindowMode".expr<Int>("1<<15"),
		"GCGraphicsExposures".expr<Int>("1<<16"),
		"GCClipXOrigin".expr<Int>("1<<17"),
		"GCClipYOrigin".expr<Int>("1<<18"),
		"GCClipMask".expr<Int>("1<<19"),
		"GCDashOffset".expr<Int>("1<<20"),
		"GCDashList".expr<Int>("1<<21"),
		"GCArcMode".expr<Int>("1<<22"),
		"GCLastBit" _ 22
	)

}