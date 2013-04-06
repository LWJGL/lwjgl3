/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * The source in this file is ported from GLFW. License terms: http://www.glfw.org/license.html
 */
package org.lwjgl.system.jglfw;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.List;

interface Platform<T extends GLFWwindow> {

	boolean init();

	void terminate();

	List<GLFWmonitor> getMonitors();

	String getVersionString();

	void getMonitorPos(GLFWmonitor monitor, IntBuffer xpos, IntBuffer ypos);

	List<GLFWvidmode> getVideoModes(GLFWmonitor monitor);

	GLFWvidmode getVideoMode(GLFWmonitor monitor);

	void getGammaRamp(GLFWmonitor monitor, ByteBuffer ramp);

	void setGammaRamp(GLFWmonitor monitor, ByteBuffer ramp);

	T createWindowInstance();

	boolean createWindow(T window, GLFWwndconfig wndconfig, GLFWfbconfig fbconfig);

	void showWindow(T window);

	void hideWindow(T window);

	T getCurrentContext();

	void makeContextCurrent(T window);

	void swapBuffers(T window);

	void swapInterval(int interval);

	void destroyWindow(T window);

	void setWindowTitle(T window, CharSequence title);

	void getWindowPos(T window, IntBuffer xpos, IntBuffer ypos);

	void setWindowPos(T window, int xpos, int ypos);

	void getWindowSize(T window, IntBuffer width, IntBuffer height);

	void setWindowSize(T window, int width, int height);

	void iconifyWindow(T window);

	void restoreWindow(T window);

	void pollEvents();

	void waitEvents();

	void setCursorPos(T window, double centerPosX, double centerPosY);

	void setCursorMode(T window, int newMode);

	int getJoystickParam(int joy, int param);

	int getJoystickAxes(int joy, FloatBuffer axes);

	int getJoystickButtons(int joy, ByteBuffer buttons);

	String getJoystickName(int joy);

	void setClipboardString(T window, CharSequence string);

	String getClipboardString(T window);

	double getTime();

	void setTime(double time);
}