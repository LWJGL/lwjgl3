/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.glfw

import org.lwjgl.generator.*

val GLFW_PACKAGE = "org.lwjgl.glfw"

val GLFWmonitor = PointerType("GLFWmonitor")
val GLFWmonitor_p = PointerType(GLFWmonitor)

val GLFWwindow = PointerType("GLFWwindow")

val GLFWvidmode = struct(GLFW_PACKAGE, "GLFWvidmode") {
	documentation = "Video mode."
	nativeImport("glfw3.h")
	int.member("width")
	int.member("height")
	int.member("redBits")
	int.member("greenBits")
	int.member("blueBits")
	int.member("refreshRate")
}.nativeType
val GLFWvidmode_p = StructType(GLFWvidmode)

val GLFWgammaramp = struct(GLFW_PACKAGE, "GLFWgammaramp") {
	documentation = "Gamma ramp."
	nativeImport("glfw3.h")
	unsigned_short_p.member("red")
	unsigned_short_p.member("green")
	unsigned_short_p.member("blue")
	unsigned_int.member("size")
}.nativeType
val GLFWgammaramp_p = StructType(GLFWgammaramp)

val GLFWcursor = PointerType("GLFWcursor")

val GLFWimage = struct(GLFW_PACKAGE, "GLFWimage") {
	documentation = "Image data."
	nativeImport("glfw3.h")
	int.member("width")
	int.member("height")
	unsigned_char_p.member("pixels")
}.nativeType
val GLFWimage_p = StructType(GLFWimage)

// callback functions

val GLFWerrorfun = callback(
	GLFW_PACKAGE, void, "GLFWerrorfun",
	"Will be called with an error code and a human-readable description when a GLFW error occurs.",
	int.IN("error", "the error code"),
	charUTF8_p.IN("description", "a pointer to a UTF-8 encoded string describing the error"),
    samConstructor = "GLFW"
) {
	documentation = "Instances of this interface may be passed to the GLFW##glfwSetErrorCallback() method."
}.nativeType

val GLFWmonitorfun = callback(
	GLFW_PACKAGE, void, "GLFWmonitorfun",
	"Will be called when a monitor is connected to or disconnected from the system.",
	GLFWmonitor.IN("monitor", "the monitor that was connected or disconnected"),
	int.IN("event", "one of {@link GLFW##GLFW_CONNECTED} or {@link GLFW##GLFW_DISCONNECTED}"),
	samConstructor = "GLFW"
) {
	documentation = "Instances of this interface may be passed to the GLFW##glfwSetMonitorCallback() method."
}.nativeType

val GLFWwindowposfun = callback(
	GLFW_PACKAGE, void, "GLFWwindowposfun",
	"Will be called when the specified window moves.",
	GLFWwindow.IN("window", "the window that was moved"),
	int.IN("xpos", "the new x-coordinate, in pixels, of the upper-left corner of the client area of the window"),
	int.IN("ypos", "the new y-coordinate, in pixels, of the upper-left corner of the client area of the window"),
	samConstructor = "GLFW"
) {
	documentation = "Instances of this interface may be passed to the GLFW##glfwSetWindowPosCallback() method."
}.nativeType


val GLFWwindowsizefun = callback(
	GLFW_PACKAGE, void, "GLFWwindowsizefun",
	"Will be called when the specified window is resized.",
	GLFWwindow.IN("window", "the window that was resized"),
	int.IN("width", "the new width, in pixels, of the window"),
	int.IN("height", "the new height, in pixels, of the window"),
	samConstructor = "GLFW"
) {
	documentation = "Instances of this interface may be passed to the GLFW##glfwSetWindowSizeCallback() method."
}.nativeType

val GLFWwindowclosefun = callback(
	GLFW_PACKAGE, void, "GLFWwindowclosefun",
	"Will be called when the user attempts to close the specified window, for example by clicking the close widget in the title bar.",
	GLFWwindow.IN("window", "the window that the user attempted to close"),
	samConstructor = "GLFW"
) {
	documentation = "Instances of this interface may be passed to the GLFW##glfwSetWindowCloseCallback() method."
}.nativeType

val GLFWwindowrefreshfun = callback(
	GLFW_PACKAGE, void, "GLFWwindowrefreshfun",
	"""
	Will be called when the client area of the specified window needs to be redrawn, for example if the window has been exposed after having been covered by
	another window.
	""",
	GLFWwindow.IN("window", "the window whose content needs to be refreshed"),
	samConstructor = "GLFW"
) {
	documentation = "Instances of this interface may be passed to the GLFW##glfwSetWindowRefreshCallback() method."
}.nativeType

val GLFWwindowfocusfun = callback(
	GLFW_PACKAGE, void, "GLFWwindowfocusfun",
	"Will be called when the specified window gains or loses focus.",
	GLFWwindow.IN("window", "the window that was focused or defocused"),
	int.IN("focused", "GL11##GL_TRUE if the window was focused, or GL11##GL_FALSE if it was defocused"),
	samConstructor = "GLFW"
) {
	javaImport("org.lwjgl.opengl.GL11")
	documentation = "Instances of this interface may be passed to the GLFW##glfwSetWindowFocusCallback() method."
}.nativeType

val GLFWwindowiconifyfun = callback(
	GLFW_PACKAGE, void, "GLFWwindowiconifyfun",
	"Will be called when the specified window is iconified or restored.",
	GLFWwindow.IN("window", "the window that was iconified or restored."),
	int.IN("iconified", "{@link GL11#GL_TRUE} if the window was iconified, or {@link GL11#GL_FALSE} if it was restored"),
	samConstructor = "GLFW"
) {
	javaImport("org.lwjgl.opengl.GL11")
	documentation = "Instances of this interface may be passed to the GLFW##glfwSetWindowIconifyCallback() method."
}.nativeType

val GLFWframebuffersizefun = callback(
	GLFW_PACKAGE, void, "GLFWframebuffersizefun",
	"Will be called when the framebuffer of the specified window is resized.",
	GLFWwindow.IN("window", "the window whose framebuffer was resized"),
	int.IN("width", "the new width, in pixels, of the framebuffer"),
	int.IN("height", "the new height, in pixels, of the framebuffer"),
	samConstructor = "GLFW"
) {
	documentation = "Instances of this interface may be passed to the GLFW##glfwSetFramebufferSizeCallback() method."
}.nativeType

val GLFWkeyfun = callback(
	GLFW_PACKAGE, void, "GLFWkeyfun",
	"Will be called when a key is pressed, repeated or released.",
	GLFWwindow.IN("window", "the window that received the event"),
	int.IN("key", "the keyboard key that was pressed or released"),
	int.IN("scancode", "the system-specific scancode of the key"),
	int.IN("action", "the key action", "GLFW##GLFW_PRESS GLFW##GLFW_RELEASE GLFW##GLFW_REPEAT"),
	int.IN("mods", "bitfield describing which modifiers keys were held down"),
	samConstructor = "GLFW"
) {
	documentation = "Instances of this interface may be passed to the GLFW##glfwSetKeyCallback() method."
}.nativeType

val GLFWcharfun = callback(
	GLFW_PACKAGE, void, "GLFWcharfun",
	"Will be called when a Unicode character is input.",
	GLFWwindow.IN("window", "the window that received the event"),
	unsigned_int.IN("codepoint", "the Unicode code point of the character"),
	samConstructor = "GLFW"
) {
	documentation = "Instances of this interface may be passed to the GLFW##glfwSetCharCallback() method."
}.nativeType

val GLFWcharmodsfun = callback(
	GLFW_PACKAGE, void, "GLFWcharmodsfun",
	"Will be called when a Unicode character is input regardless of what modifier keys are used.",
	GLFWwindow.IN("window", "the window that received the event"),
	unsigned_int.IN("codepoint", "the Unicode code point of the character"),
	int.IN("mods", "bitfield describing which modifier keys were held down"),
	samConstructor = "GLFW"
) {
	documentation = "Instances of this interface may be passed to the GLFW##glfwSetCharModsCallback() method."
}.nativeType

val GLFWmousebuttonfun = callback(
	GLFW_PACKAGE, void, "GLFWmousebuttonfun",
	"Will be called when a mouse button is pressed or released.",
	GLFWwindow.IN("window", "the window that received the event"),
	int.IN("button", "the mouse button that was pressed or released"),
	int.IN("action", "the button action", "GLFW##GLFW_PRESS GLFW##GLFW_RELEASE GLFW##GLFW_REPEAT"),
	int.IN("mods", "bitfield describing which modifiers keys were held down"),
	samConstructor = "GLFW"
) {
	documentation = "Instances of this interface may be passed to the GLFW##glfwSetMouseButtonCallback() method."
}.nativeType

val GLFWcursorposfun = callback(
	GLFW_PACKAGE, void, "GLFWcursorposfun",
	"Will be called when the cursor is moved.",
	GLFWwindow.IN("window", "the window that received the event"),
	double.IN("xpos", "the new x-coordinate, in screen coordinates of the cursor"),
	double.IN("ypos", "the new y-coordinate, in screen coordinates of the cursor"),
	samConstructor = "GLFW"
) {
	documentation = "Instances of this interface may be passed to the GLFW##glfwSetCursorPosCallback() method."
}.nativeType

val GLFWcursorenterfun = callback(
	GLFW_PACKAGE, void, "GLFWcursorenterfun",
	"Will be called when the cursor enters or leaves the client area of the window.",
	GLFWwindow.IN("window", "the window that received the event"),
	int.IN("entered", "GL11##GL_TRUE if the cursor entered the window's client area, or GL11##GL_FALSE if it left it"),
	samConstructor = "GLFW"
) {
	javaImport("org.lwjgl.opengl.GL11")
	documentation = "Instances of this interface may be passed to the GLFW##glfwSetCursorEnterCallback() method."
}.nativeType

val GLFWscrollfun = callback(
	GLFW_PACKAGE, void, "GLFWscrollfun",
	"Will be called when a scrolling device is used, such as a mouse wheel or scrolling area of a touchpad.",
	GLFWwindow.IN("window", "the window that received the event"),
	double.IN("xoffset", "the scroll offset along the x-axis"),
	double.IN("yoffset", "the scroll offset along the y-axis"),
	samConstructor = "GLFW"
) {
	documentation = "Instances of this interface may be passed to the GLFW##glfwSetScrollCallback() method."
}.nativeType

val GLFWdropfun = callback(
	GLFW_PACKAGE, void, "GLFWdropfun",
	"Will be called when one or more dragged files are dropped on the window.",
	GLFWwindow.IN("window", "the window that received the event"),
	int.IN("count", "the number of dropped files"),
	const _ char_pp.IN("names", "pointer to the array of UTF-8 encoded path names of the dropped files"),
	samConstructor = "GLFW"
) {
	documentation = "Instances of this interface may be passed to the GLFW##glfwSetDropCallback() method."
}.nativeType

// OpenGL

val GLFWglproc = PointerType("GLFWglproc")