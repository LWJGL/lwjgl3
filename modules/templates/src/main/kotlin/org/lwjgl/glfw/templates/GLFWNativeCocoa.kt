/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.glfw.templates

import org.lwjgl.generator.*
import org.lwjgl.glfw.*
import org.lwjgl.system.macosx.*

val GLFWMacOSX = "GLFWMacOSX".nativeClass(packageName = GLFW_PACKAGE, nativeSubPath = "macosx", prefix = "GLFW") {
	documentation = "Native bindings to the GLFW library's MacOS X native access functions."

	CGDirectDisplayID(
		"GetCocoaMonitor",
	    """
	    Returns the ${code("CGDirectDisplayID")} of the specified monitor.

	    Note: This function may be called from any thread. Access is not synchronized.
	    """,

	    GLFWmonitor.IN("monitor", "the GLFW monitor"),
	    // TODO: kCGNullDirectDisplay
	    returnDoc = "The ${code("CGDirectDisplayID")} of the specified monitor, or kCGNullDirectDisplay` if an error occurred.",
	    since = "GLFW 3.1"
	)

	id(
		"GetCocoaWindow",
		"""
		Returns the ${code("NSWindow")} of the specified GLFW window.

		Note: This function may be called from any thread. Access is not synchronized.
		""",

		GLFWwindow.IN("window", "the GLFW window"),
		returnDoc = "The ${code("NSWindow")} of the specified window, or nil if an error occurred.",
		since = "GLFW 3.0"
	)
}