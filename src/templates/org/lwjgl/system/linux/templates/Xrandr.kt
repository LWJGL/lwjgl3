/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.linux.templates

import org.lwjgl.generator.*
import org.lwjgl.system.linux.*

fun Xrandr() = "Xrandr".nativeClass(LINUX_PACKAGE) {
	nativeImport (
		"LinuxLWJGL.h"
	)

	javaDoc("Native bindings to Xrandr.h.")

	IntConstant.block(
		"Event selection bits",

		"RRScreenChangeNotifyMask".expr<Int>("1 << 0"),
		"RRCrtcChangeNotifyMask".expr<Int>("1 << 1"),
		"RROutputChangeNotifyMask".expr<Int>("1 << 2"),
		"RROutputPropertyNotifyMask".expr<Int>("1 << 3")
	)

	IntConstant.block(
		"Event codes",

		"RRScreenChangeNotify" _ 0,
		"RRNotify" _ 1
	)

	IntConstant.block(
		"RRNotify Subcodes",

		"RRNotify_CrtcChange" _ 0,
		"RRNotify_OutputChange" _ 1,
		"RRNotify_OutputProperty" _ 2
	)

	ShortConstant.block(
		"used in the rotation field; rotation and reflection in 0.1 proto.",

		"RR_Rotate_0" _ 1.s,
		"RR_Rotate_90" _ 2.s,
		"RR_Rotate_180" _ 4.s,
		"RR_Rotate_270" _ 8.s
	)

	ShortConstant.block(
		"new in 1.0 protocol, to allow reflection of screen",

		"RR_Reflect_X" _ 16.s,
		"RR_Reflect_Y" _ 32.s
	)

	IntConstant.block(
		"Config status",

		"RRSetConfigSuccess" _ 0,
		"RRSetConfigInvalidConfigTime" _ 1,
		"RRSetConfigInvalidTime" _ 2,
		"RRSetConfigFailed" _ 3
	)

	IntConstant.block(
		"Connection status",

		"RR_Connected" _ 0,
		"RR_Disconnected" _ 1,
		"RR_UnknownConnection" _ 2
	)

	IntConstant.block(
		"Error codes",

		"BadRROutput" _ 0,
		"BadRRCrtc" _ 1,
		"BadRRMode" _ 2
	)

	IntConstant.block(
		"new in 1.2 protocol",

		"RR_HSyncPositive" _ 0x00000001,
		"RR_HSyncNegative" _ 0x00000002,
		"RR_VSyncPositive" _ 0x00000004,
		"RR_VSyncNegative" _ 0x00000008,
		"RR_Interlace" _ 0x00000010,
		"RR_DoubleScan" _ 0x00000020,
		"RR_CSync" _ 0x00000040,
		"RR_CSyncPositive" _ 0x00000080,
		"RR_CSyncNegative" _ 0x00000100,
		"RR_HSkewPresent" _ 0x00000200,
		"RR_BCast" _ 0x00000400,
		"RR_PixelMultiplex" _ 0x00000800,
		"RR_DoubleClock" _ 0x00001000,
		"RR_ClockDivideBy2" _ 0x00002000
	)

	// ----------------------------------

	Bool.func(
		"XRRQueryExtension",
		"Returns the event and error base codes.",

		DISPLAY,
		Check(1) _ int_p.OUT("event_base_return", "the base event code"),
		Check(1) _ int_p.OUT("error_base_return", "the base error code")
	)

	Status.func(
		"XRRQueryVersion",
		"Returns the current version of the Xrandr extension.",

		DISPLAY,
		Check(1) _ int_p.OUT("major_version_return", "the major version"),
		Check(1) _ int_p.OUT("minor_version_return", "the minor version")
	)

	XRRScreenResources_p.func(
		"XRRGetScreenResources",
		"Returns a {@link XRRScreenResources} structure for the given window.",

		DISPLAY,
		WINDOW
	)

	void.func(
		"XRRFreeScreenResources",
		"Frees the given {@link XRRScreenResources} structure.",

		XRRScreenResources_p.IN("resources", "the {@link XRRScreenResources} structure to free")
	)

	XRRCrtcInfo_p.func(
		"XRRGetCrtcInfo",
		"Returns information about a screen in a {@link XRRCrtcInfo} structure.",

		DISPLAY,
		XRRScreenResources_p.OUT("resources", "a pointer to a {@link XRRScreenResources} structure"),
		RRCrtc.IN("crtc", "the screen to query")
	)

	void.func(
		"XRRFreeCrtcInfo",
		"Frees a {@link XRRCrtcInfo} structure.",

		XRRCrtcInfo_p.IN("crtcInfo", "the {@link XRRCrtcInfo} structure to free")
	)

	XRROutputInfo_p.func(
		"XRRGetOutputInfo",
		"Returns output information in a {@link XRROutputInfo} structure.",

		DISPLAY,
		XRRScreenResources_p.IN("resources", "a pointer to a {@link XRRScreenResources} structure"),
		RROutput.IN("output", "the output to query")
	)

	void.func(
		"XRRFreeOutputInfo",
		"Frees a {@link XRROutputInfo} structure.",

		XRROutputInfo_p.IN("outputInfo", "the {@link XRROutputInfo} structure to free")
	)

	void.func(
		"XRRSelectInput",
	    "TODO: document",

	    DISPLAY,
	    WINDOW,
	    int.IN("mask", "the mask")
	)

	int.func(
		"XRRUpdateConfiguration",
	    "Intended to take RRScreenChangeNotify, or ConfigureNotify (on the root window) returns 1 if it is an event type it understands, 0 if not.",

	    XEvent_p.IN("event", "the event")
	)

	int.func(
		"XRRGetCrtcGammaSize",
		"TODO: document",

		DISPLAY,
		RRCrtc.IN("crtc", "")
	)

	XRRCrtcGamma_p.func(
		"XRRGetCrtcGamma",
		"Returns the current display gamma values in a {@link XRRCrtcGamma} structure.",

		DISPLAY,
		RRCrtc.IN("crtc", "")
	)

	XRRCrtcGamma_p.func(
		"XRRAllocGamma",
		"Allocates a {@link XRRCrtcGamma} structure of the given {@code size}.",

		int.IN("size", "the gamma size")
	)

	void.func(
		"XRRFreeGamma",
		"Frees the given {@link XRRCrtcGamma} structure.",

		XRRCrtcGamma_p.IN("gamma", "the {@link XRRCrtcGamma} structure to free")
	)

	void.func(
		"XRRSetCrtcGamma",
		"Sets the gamma ramp",

		DISPLAY,
		RRCrtc.IN("crtc", ""),
		XRRCrtcGamma_p.IN("gamma", "a pointer to a {@link XRRCrtcGamma} structure that contains the gamma ramp")
	)

}