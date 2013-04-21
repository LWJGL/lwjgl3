/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.demo.jglfw;

import org.lwjgl.BufferUtils;
import org.lwjgl.LWJGLUtil;
import org.lwjgl.system.jglfw.*;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.List;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.system.jglfw.JGLFW.*;

public final class JGLFWTest {

	private JGLFWTest() {
	}

	public static void main(String[] args) {
		glfwSetErrorCallback(new GLFWerrorfun() {
			@Override
			public void invoke(int error, String description) {
				System.err.println("[JGLFW] " + description + " [" + LWJGLUtil.toHexString(error) + "]");
			}
		});

		glfwInit();

		int joystickIndex = -1;
		float[] joystickAxesState = null;
		int[] joystickButtonsState = null;
		FloatBuffer joystickAxesBuffer = null;
		ByteBuffer joystickButtonsBuffer = null;
		for ( int i = 0; i < GLFW_JOYSTICK_LAST; i++ ) {
			int present = glfwGetJoystickParam(i, GLFW_PRESENT);
			if ( present == 1 ) {
				joystickIndex = i;
				int joystickAxes = glfwGetJoystickParam(i, GLFW_AXES);
				joystickAxesState = new float[joystickAxes];
				joystickAxesBuffer = BufferUtils.createFloatBuffer(joystickAxes);

				int joystickButtons = glfwGetJoystickParam(i, GLFW_BUTTONS);
				joystickButtonsState = new int[joystickButtons];
				joystickButtonsBuffer = BufferUtils.createByteBuffer(joystickButtons);
				System.out.println("Joystick[" + i + "] is present: " + glfwGetJoystickName(i) + " with " + joystickAxes + " axes and " + joystickButtons + " buttons");
				break;
			}
		}

		if ( joystickIndex == -1 ) {
			System.out.println("No joystick connected");
		}

		List<GLFWmonitor> monitors = glfwGetMonitors();

		for ( GLFWmonitor monitor : monitors ) {
			System.out.println(monitor);
			List<GLFWvidmode> vidmodes = glfwGetVideoModes(monitor);
			for ( GLFWvidmode vidmode : vidmodes ) {
				System.out.println('\t' + vidmode.toString());
			}

			//glfwSetGamma(monitor, monitor.getName().endsWith("1") ? 2.0f : 0.5f);
			glfwSetGamma(monitor, 1.0f);
		}

		glfwDefaultWindowHints();
		glfwWindowHint(GLFW_VISIBLE, GL_FALSE);
		//glfwWindowHint(GLFW_DECORATED, GL_FALSE);

		GLFWwindow window = glfwCreateWindow(640, 480, "JGLFW Test", null, null);

		glfwShowWindow(window);
		glfwSetWindowPos(window, 256, 256);

		System.out.println("Window opened.");

		glfwSetMonitorCallback(new GLFWmonitorfun() {
			@Override
			public void invoke(GLFWmonitor monitor, int event) {
				System.out.println("Monitor " + monitor.getName() + " was " + (event == 0x00061000 ? "connected" : "disconnected"));
			}
		});

		glfwSetWindowRefreshCallback(window, new GLFWwindowrefreshfun() {
			@Override
			public void invoke(GLFWwindow window) {
				printEvent(window, "refreshed");
			}
		});

		glfwSetWindowCloseCallback(window, new GLFWwindowclosefun() {
			@Override
			public void invoke(GLFWwindow window) {
				printEvent(window, "closed");
			}
		});

		glfwSetWindowFocusCallback(window, new GLFWwindowfocusfun() {
			@Override
			public void invoke(GLFWwindow window, boolean focused) {
				printEvent(window, focused ? "gained focus" : "lost focus");
			}
		});

		glfwSetWindowIconifyCallback(window, new GLFWwindowiconifyfun() {
			@Override
			public void invoke(GLFWwindow window, boolean iconified) {
				printEvent(window, iconified ? "iconified" : "restored");
			}
		});

		glfwSetKeyCallback(window, new GLFWkeyfun() {
			@Override
			public void invoke(GLFWwindow window, int key, int action) {
				String state;
				switch ( action ) {
					case GLFW_PRESS:
						state = "pressed";
						break;
					case GLFW_RELEASE:
						state = "released";
						break;
					case GLFW_REPEAT:
						state = "repeated";
						break;
					default:
						throw new IllegalArgumentException();
				}

				printEvent(window, "key [%d] was %s", key, state);

				if ( key == GLFW_KEY_ESCAPE && action == GLFW_RELEASE )
					glfwSetWindowShouldClose(window, true);
			}
		});

		glfwSetCharCallback(window, new GLFWcharfun() {
			@Override
			public void invoke(GLFWwindow window, int character) {
				printEvent(window, "character %s", Character.toString((char)character));
			}
		});

		glfwSetMouseButtonCallback(window, new GLFWmousebuttonfun() {
			@Override
			public void invoke(GLFWwindow window, int button, int action) {
				String state;
				switch ( action ) {
					case GLFW_PRESS:
						state = "pressed";
						break;
					case GLFW_RELEASE:
						state = "released";
						break;
					default:
						throw new IllegalArgumentException();
				}
				printEvent(window, "mouse button [%d] was %s", button, state);
			}
		});

		glfwSetCursorPosCallback(window, new GLFWcursorposfun() {
			@Override
			public void invoke(GLFWwindow window, double xpos, double ypos) {
				printEvent(window, "cursor moved to %f, %f", xpos, ypos);
			}
		});

		glfwSetCursorEnterCallback(window, new GLFWcursorenterfun() {
			@Override
			public void invoke(GLFWwindow window, boolean entered) {
				printEvent(window, "cursor %s", entered ? "entered" : "left");
			}
		});

		glfwSetScrollCallback(window, new GLFWscrollfun() {
			@Override
			public void invoke(GLFWwindow window, double xpos, double ypos) {
				printEvent(window, "scroll by %f, %f", xpos, ypos);
			}
		});

		glfwMakeContextCurrent(window);
		glfwSwapInterval(1);

		glClearColor(1.0f, 1.0f, 1.0f, 1.0f);

		// Repaint while resizing
		glfwSetWindowSizeCallback(window, new GLFWwindowsizefun() {
			@Override
			public void invoke(GLFWwindow window, int width, int height) {
				printEvent(window, "resized to %d x %d", width, height);
				render(window);
			}
		});

		// Repaint while moving
		glfwSetWindowPosCallback(window, new GLFWwindowposfun() {
			@Override
			public void invoke(GLFWwindow window, int xpos, int ypos) {
				printEvent(window, "moved to %d, %d", xpos, ypos);
				render(window);
			}
		});

		glfwSetClipboardString(window, "LWJGL - JGLFW");
		if ( !"LWJGL - JGLFW".equals(glfwGetClipboardString(window)) )
			System.err.println("CLIPBOARD FAILED!");

		while ( true ) {
			glfwPollEvents();
			readJoystickInput(joystickIndex, joystickAxesBuffer, joystickAxesState, joystickButtonsBuffer, joystickButtonsState);

			if ( glfwWindowShouldClose(window) )
				break;

			render(window);
		}

		glfwTerminate();
	}

	private static void readJoystickInput(int joystickIndex, FloatBuffer joystickAxesBuffer, float[] joystickAxesState, ByteBuffer joystickButtonsBuffer, int[] joystickButtonsState) {
		if ( joystickAxesBuffer != null ) {
			int numAxes = glfwGetJoystickAxes(joystickIndex, joystickAxesBuffer);
			for ( int i = 0; i < numAxes; i++ ) {
				float value = joystickAxesBuffer.get(i);
				if ( value != joystickAxesState[i] ) {
					joystickAxesState[i] = value;
					System.out.println(String.format("axis[%d] changed value to: %f", i, value));
				}
			}
		}

		if ( joystickButtonsBuffer != null ) {
			int numButtons = glfwGetJoystickButtons(joystickIndex, joystickButtonsBuffer);
			for ( int i = 0; i < numButtons; i++ ) {
				int state = joystickButtonsBuffer.get(i);
				if ( state != joystickButtonsState[i] ) {
					joystickButtonsState[i] = state;
					System.out.println(String.format("button[%d] changed state to: %d", i, state));
				}
			}
		}
	}

	private static void render(GLFWwindow window) {
		float v = (float)Math.abs(Math.sin(glfwGetTime() * 2.0));
		glClearColor(1.0f * v, 0.0f * v, 0.0f * v, 0f);

		glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
		glfwSwapBuffers(window);
	}

	private static void printEvent(GLFWwindow window, String format, Object... args) {
		Object[] formatArgs = new Object[2 + args.length];

		formatArgs[0] = glfwGetTime();
		formatArgs[1] = window.getTitle();
		System.arraycopy(args, 0, formatArgs, 2, args.length);

		System.out.format("%.3f: Window [%s] " + format + "%n", formatArgs);
	}

}