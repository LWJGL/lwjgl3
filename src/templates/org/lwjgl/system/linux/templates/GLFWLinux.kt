/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.linux.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.system.glfw.*
import org.lwjgl.system.linux.*
import org.lwjgl.system.windows.WCHAR_p

val GLFWLinux = "GLFWLinux".nativeClass(packageName = LINUX_PACKAGE, prefix = "GLFW") {
	nativeDefine("GLFW_EXPOSE_NATIVE_X11")
	nativeDefine("GLFW_EXPOSE_NATIVE_GLX")

	nativeImport(
		"glfw3.h",
		"glfw3native.h"
	)

	documentation = "Native bindings to the GLFW library's Linux native access functions."

	RRCrtc.func(
		"GetX11Monitor",
		"Returns the {@code RRCrtc} of the specified monitor.",

		GLFWmonitor.IN("monitor", "the GLFW monitor")
	)

	Display_p.func(
		"GetX11Display",
	    "Returns the {@code Display} used by GLFW."
	)

	Window.func(
		"GetX11Window",
		"Returns the {@code Window} of the specified window.",

		GLFWwindow.IN("window", "a GLFW window")
	)

	GLXContext.func(
		"GetGLXContext",
		"Returns the {@code GLXContext} of the specified window.",

		GLFWwindow.IN("window", "a GLFW window")
	)

}