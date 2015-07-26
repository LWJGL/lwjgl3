/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.egl.templates

import org.lwjgl.generator.*
import org.lwjgl.egl.*

val EXT_output_base = "EXTOutputBase".nativeClassEGL("EXT_output_base", postfix = EXT) {
	includeEGLEXT()

	documentation =
		"""
		Native bindings to the $registryLink extension.

		Increasingly, EGL and its client APIs are being used in place of "native" rendering APIs to implement the basic graphics functionality of native
		windowing systems. This creates demand for a method to initialize EGL displays and surfaces directly on top of native GPU or device objects rather than
		native window system objects. The mechanics of enumerating the underlying native devices and constructing EGL displays and surfaces from them have been
		solved in various platform and implementation- specific ways. The EGL device family of extensions offers a standardized framework for bootstrapping EGL
		without the use of any underlying "native" APIs or functionality.

		This extension defines new EGL resource types for referencing display control hardware associated with an EGL device. Its purpose is to allow rendering
		to be directed to a screen in the absence of (or bypassing) a window system. Because the use models for these resources are potentially diverse, only
		the objects themselves and basic functions to acquire and query them are defined here. More detailed functions and enumerants required to operate on
		outputs are provided by separate extensions.

		Requires ${EXT_device_base.link}.
		"""

	IntConstant(
		"",

		"BAD_OUTPUT_LAYER_EXT" _ 0x322D,
		"BAD_OUTPUT_PORT_EXT" _ 0x322E,
		"SWAP_INTERVAL_EXT" _ 0x322F
	)

	LongConstant(
		"",

		"NO_OUTPUT_LAYER_EXT" _ 0L,
		"NO_OUTPUT_PORT_EXT" _ 0L
	)

	EGLBoolean(
		"GetOutputLayersEXT",
		"",

		EGLDisplay.IN("dpy", ""),
		nullable _ noneTerminated _ const _ EGLAttrib_p.IN("attrib_list", ""),
		nullable _ EGLOutputLayerEXT_p.OUT("layers", ""),
		AutoSize("layers") _ EGLint.IN("max_layers", ""),
		Check(1) _ EGLint_p.OUT("num_layers", "")
	)

	EGLBoolean(
		"GetOutputPortsEXT",
		"",

		EGLDisplay.IN("dpy", ""),
		nullable _ noneTerminated _ const _ EGLAttrib_p.IN("attrib_list", ""),
		nullable _ EGLOutputPortEXT_p.OUT("ports", ""),
		AutoSize("ports") _ EGLint.IN("max_ports", ""),
		Check(1) _ EGLint_p.OUT("num_ports", "")
	)

	EGLBoolean(
		"OutputLayerAttribEXT",
		"",

		EGLDisplay.IN("dpy", ""),
		EGLOutputLayerEXT.IN("layer", ""),
		EGLint.IN("attribute", ""),
		EGLAttrib.IN("value", "")
	)

	EGLBoolean(
		"QueryOutputLayerAttribEXT",
		"",

		EGLDisplay.IN("dpy", ""),
		EGLOutputLayerEXT.IN("layer", ""),
		EGLint.IN("attribute", ""),
		Check(1) _ EGLAttrib_p.OUT("value", "")
	)

	charASCII_p(
		"QueryOutputLayerStringEXT",
		"",

		EGLDisplay.IN("dpy", ""),
		EGLOutputLayerEXT.IN("layer", ""),
		EGLint.IN("name", "")
	)

	EGLBoolean(
		"OutputPortAttribEXT",
		"",

		EGLDisplay.IN("dpy", ""),
		EGLOutputPortEXT.IN("port", ""),
		EGLint.IN("attribute", ""),
		EGLAttrib.IN("value", "")
	)

	EGLBoolean(
		"QueryOutputPortAttribEXT",
		"",

		EGLDisplay.IN("dpy", ""),
		EGLOutputPortEXT.IN("port", ""),
		EGLint.IN("attribute", ""),
		Check(1) _ EGLAttrib_p.OUT("value", "")
	)

	charASCII_p(
		"QueryOutputPortStringEXT",
		"",

		EGLDisplay.IN("dpy", ""),
		EGLOutputPortEXT.IN("port", ""),
		EGLint.IN("name", "")
	)
}