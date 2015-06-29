/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.linux.templates

import org.lwjgl.generator.*
import org.lwjgl.system.linux.*

val Xrandr = "Xrandr".nativeClass(LINUX_PACKAGE) {
	nativeImport (
		"LinuxLWJGL.h",
		"<X11/extensions/Xrandr.h>"
	)

	documentation = "Native bindings to <X11/extensions/Xrandr.h>."

	IntConstant(
		"Event selection bits",

		"RRScreenChangeNotifyMask" expr "1 << 0",
		"RRCrtcChangeNotifyMask" expr "1 << 1",
		"RROutputChangeNotifyMask" expr "1 << 2",
		"RROutputPropertyNotifyMask" expr "1 << 3"
	)

	IntConstant(
		"Event codes",

		"RRScreenChangeNotify" _ 0,
		"RRNotify" _ 1
	)

	IntConstant(
		"RRNotify Subcodes",

		"RRNotify_CrtcChange" _ 0,
		"RRNotify_OutputChange" _ 1,
		"RRNotify_OutputProperty" _ 2
	)

	ShortConstant(
		"used in the rotation field; rotation and reflection in 0.1 proto.",

		"RR_Rotate_0" _ 1.s,
		"RR_Rotate_90" _ 2.s,
		"RR_Rotate_180" _ 4.s,
		"RR_Rotate_270" _ 8.s
	)

	ShortConstant(
		"new in 1.0 protocol, to allow reflection of screen",

		"RR_Reflect_X" _ 16.s,
		"RR_Reflect_Y" _ 32.s
	)

	IntConstant(
		"Config status",

		"RRSetConfigSuccess" _ 0,
		"RRSetConfigInvalidConfigTime" _ 1,
		"RRSetConfigInvalidTime" _ 2,
		"RRSetConfigFailed" _ 3
	)

	IntConstant(
		"Connection status",

		"RR_Connected" _ 0,
		"RR_Disconnected" _ 1,
		"RR_UnknownConnection" _ 2
	)

	IntConstant(
		"Error codes",

		"BadRROutput" _ 0,
		"BadRRCrtc" _ 1,
		"BadRRMode" _ 2
	)

	IntConstant(
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

	Bool(
		"XRRQueryExtension",
		"Returns the event and error base codes.",

		DISPLAY,
		Check(1) _ int_p.OUT("event_base_return", "the base event code"),
		Check(1) _ int_p.OUT("error_base_return", "the base error code")
	)

	Status(
		"XRRQueryVersion",
		"Returns the current version of the Xrandr extension.",

		DISPLAY,
		Check(1) _ int_p.OUT("major_version_return", "the major version"),
		Check(1) _ int_p.OUT("minor_version_return", "the minor version")
	)

	XRRScreenResources_p(
		"XRRGetScreenResources",
		"Returns a ##XRRScreenResources structure for the specified window.",

		DISPLAY,
		WINDOW
	)

	void(
		"XRRFreeScreenResources",
		"Frees the specified ##XRRScreenResources structure.",

		XRRScreenResources_p.IN("resources", "the ##XRRScreenResources structure to free")
	)

	RROutput(
		"XRRGetOutputPrimary",
		"Returns the primary output for the screen.",

		DISPLAY,
		WINDOW
	)

	XRRCrtcInfo_p(
		"XRRGetCrtcInfo",
		"Returns information about a screen in a ##XRRCrtcInfo structure.",

		DISPLAY,
		XRRScreenResources_p.OUT("resources", "a pointer to a ##XRRScreenResources structure"),
		RRCrtc.IN("crtc", "the screen to query")
	)

	void(
		"XRRFreeCrtcInfo",
		"Frees a ##XRRCrtcInfo structure.",

		XRRCrtcInfo_p.IN("crtcInfo", "the ##XRRCrtcInfo structure to free")
	)

	XRROutputInfo_p(
		"XRRGetOutputInfo",
		"Returns output information in a ##XRROutputInfo structure.",

		DISPLAY,
		XRRScreenResources_p.IN("resources", "a pointer to a ##XRRScreenResources structure"),
		RROutput.IN("output", "the output to query")
	)

	void(
		"XRRFreeOutputInfo",
		"Frees a ##XRROutputInfo structure.",

		XRROutputInfo_p.IN("outputInfo", "the ##XRROutputInfo structure to free")
	)

	void(
		"XRRSelectInput",
		"TODO: document",

		DISPLAY,
		WINDOW,
		int.IN("mask", "the mask")
	)

	Status(
		"XRRSetCrtcConfig",
		"",

		DISPLAY,
		XRRScreenResources_p.IN("resources", ""),
		RRCrtc.IN("crtc", ""),
		Time.IN("timestamp", ""),
		int.IN("x", ""),
		int.IN("y", ""),
		RRMode.IN("mode", ""),
		Rotation.IN("rotation", ""),
		RROutput_p.IN("outputs", ""),
		AutoSize("outputs") _ int.IN("noutputs", "")
	)

	int(
		"XRRUpdateConfiguration",
		"Intended to take RRScreenChangeNotify, or ConfigureNotify (on the root window) returns 1 if it is an event type it understands, 0 if not.",

		XEvent_p.IN("event", "the event")
	)

	int(
		"XRRGetCrtcGammaSize",
		"TODO: document",

		DISPLAY,
		RRCrtc.IN("crtc", "")
	)

	XRRCrtcGamma_p(
		"XRRGetCrtcGamma",
		"Returns the current display gamma values in a ##XRRCrtcGamma structure.",

		DISPLAY,
		RRCrtc.IN("crtc", "")
	)

	XRRCrtcGamma_p(
		"XRRAllocGamma",
		"Allocates a ##XRRCrtcGamma structure of the specified {@code size}.",

		int.IN("size", "the gamma size")
	)

	void(
		"XRRFreeGamma",
		"Frees the specified ##XRRCrtcGamma structure.",

		XRRCrtcGamma_p.IN("gamma", "the ##XRRCrtcGamma structure to free")
	)

	void(
		"XRRSetCrtcGamma",
		"Sets the gamma ramp",

		DISPLAY,
		RRCrtc.IN("crtc", ""),
		XRRCrtcGamma_p.IN("gamma", "a pointer to a ##XRRCrtcGamma structure that contains the gamma ramp")
	)

}