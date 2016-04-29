/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.demo.system.gamepad;

import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.glfw.GLFWVidMode;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GLUtil;
import org.lwjgl.system.Callback;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.gamepad.GamepadDevice;

import java.nio.ByteBuffer;

import static org.lwjgl.demo.glfw.GLFWUtil.*;
import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.stb.STBEasyFont.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.gamepad.Gamepad.*;

/** LWJGL port of <a href="https://github.com/ThemsAllTook/libstem_gamepad/blob/master/source/testharness/TestHarness_main.c">TestHarness_main.c</a> */
public class GamepadDemo {

	private static final boolean VERBOSE = true;

	private static final int POLL_ITERATION_INTERVAL = 30;

	private Callback debugProc;

	private long window;

	private int windowWidth;
	private int windowHeight;

	private static void onButtonDown(long device, int buttonID, double timestamp, long context) {
		if ( VERBOSE ) {
			System.out.format("Button %d down on device %d at %f\n", buttonID, GamepadDevice.create(device).deviceID(), timestamp);
		}
	}

	private static void onButtonUp(long device, int buttonID, double timestamp, long context) {
		if ( VERBOSE ) {
			System.out.format("Button %d up on device %d at %f\n", buttonID, GamepadDevice.create(device).deviceID(), timestamp);
		}
	}

	private static void onAxisMoved(long device, int axisID, float value, float lastValue, double timestamp, long context) {
		if ( false && VERBOSE ) {
			System.out.format(
				"Axis %d moved from %f to %f on device %d at %f\n",
				axisID,
				lastValue,
				value,
				GamepadDevice.create(device).deviceID(),
				timestamp,
				context
			);
		}
	}

	private static void onDeviceAttached(long device, long context) {
		if ( VERBOSE ) {
			GamepadDevice dev = GamepadDevice.create(device);
			System.out.format(
				"Device ID %d attached (description = %s, vendor = 0x%X; product = 0x%X)\n",
				dev.deviceID(),
				dev.descriptionString(),
				dev.vendorID(),
				dev.productID()
			);
		}
	}

	private static void onDeviceRemoved(long device, long context) {
		if ( VERBOSE ) {
			System.out.format("Device ID %d removed\n", GamepadDevice.create(device).deviceID());
		}
	}

	private static void initGamepad() {
		Gamepad_deviceAttachFunc(GamepadDemo::onDeviceAttached, 0x1L);
		Gamepad_deviceRemoveFunc(GamepadDemo::onDeviceRemoved, 0x2L);
		Gamepad_buttonDownFunc(GamepadDemo::onButtonDown, 0x3L);
		Gamepad_buttonUpFunc(GamepadDemo::onButtonUp, 0x4L);
		Gamepad_axisMoveFunc(GamepadDemo::onAxisMoved, 0x5L);
		Gamepad_init();
	}

	private void mainLoop() {
		int iterationsToNextPoll = POLL_ITERATION_INTERVAL;
		while ( !glfwWindowShouldClose(window) ) {
			glfwPollEvents();

			iterationsToNextPoll--;
			if ( iterationsToNextPoll == 0 ) {
				Gamepad_detectDevices();
				iterationsToNextPoll = POLL_ITERATION_INTERVAL;
			}
			Gamepad_processEvents();

			displayFunc();

			glfwSwapBuffers(window);
		}
	}

	private static void drawString(int rasterPosX, int rasterPosY, String string) {
		try ( MemoryStack stack = stackPush() ) {
			ByteBuffer charBuffer = stack.malloc(string.length() * 384);

			int quads = stb_easy_font_print(rasterPosX, rasterPosY - 12, string, null, charBuffer);

			glVertexPointer(2, GL_FLOAT, 16, charBuffer);
			glDrawArrays(GL_QUADS, 0, quads * 4);
		}
	}

	private void displayFunc() {
		int axesPerRow = (windowWidth - 10) / 60;
		int buttonsPerRow = (windowWidth - 10) / 30;

		glClear(GL_COLOR_BUFFER_BIT);
		glLoadIdentity();
		glTranslatef(5.0f, 20.0f, 0.0f);

		int gamepadIndex;
		for ( gamepadIndex = 0; gamepadIndex < Gamepad_numDevices(); gamepadIndex++ ) {
			GamepadDevice device = Gamepad_deviceAtIndex(gamepadIndex);

			glColor3f(0.0f, 0.0f, 0.0f);
			drawString(0, 0, String.format("%s (0x%X 0x%X %d)", device.descriptionString(), device.vendorID(), device.productID(), device.deviceID()));

			for ( int axisRowIndex = 0; axisRowIndex <= device.numAxes() / axesPerRow; axisRowIndex++ ) {
				glPushMatrix();
				for ( int axisIndex = axisRowIndex * axesPerRow; axisIndex < (axisRowIndex + 1) * axesPerRow && axisIndex < device.numAxes(); axisIndex++ ) {
					float axisState = device.axisStates().get(axisIndex);

					glColor3f(0.0f, 0.0f, 0.0f);
					drawString(2, 28, String.format("a%d", axisIndex));

					glBegin(GL_QUADS);
					glVertex2f(2.0f, 5.0f);
					glVertex2f(58.0f, 5.0f);
					glVertex2f(58.0f, 15.0f);
					glVertex2f(2.0f, 15.0f);
					glColor3f(0.5f, 1.0f, 0.5f);
					glVertex2f(29.0f + axisState * 26, 6.0f);
					glVertex2f(31.0f + axisState * 26, 6.0f);
					glVertex2f(31.0f + axisState * 26, 14.0f);
					glVertex2f(29.0f + axisState * 26, 14.0f);
					glEnd();
					glTranslatef(60.0f, 0.0f, 0.0f);
				}
				glPopMatrix();
				glTranslatef(0.0f, 32.0f, 0.0f);
			}

			for ( int buttonRowIndex = 0; buttonRowIndex <= device.numButtons() / buttonsPerRow; buttonRowIndex++ ) {
				glPushMatrix();
				for ( int buttonIndex = buttonRowIndex * buttonsPerRow; buttonIndex < (buttonRowIndex + 1) * buttonsPerRow && buttonIndex < device.numButtons
					(); buttonIndex++ ) {
					glColor3f(0.0f, 0.0f, 0.0f);
					drawString(2, 32, String.format("b%d", buttonIndex));

					glBegin(GL_QUADS);
					glColor3f(0.0f, 0.0f, 0.0f);
					glVertex2f(2.0f, 2.0f);
					glVertex2f(28.0f, 2.0f);
					glVertex2f(28.0f, 18.0f);
					glVertex2f(2.0f, 18.0f);
					if ( device.buttonStates().get(buttonIndex) != 0 ) {
						glColor3f(0.5f, 1.0f, 0.5f);
						glVertex2f(3.0f, 3.0f);
						glVertex2f(27.0f, 3.0f);
						glVertex2f(27.0f, 17.0f);
						glVertex2f(3.0f, 17.0f);
					}
					glEnd();
					glTranslatef(30.0f, 0.0f, 0.0f);
				}
				glPopMatrix();
				glTranslatef(0.0f, 38.0f, 0.0f);
			}
			glTranslatef(0.0f, 40.0f, 0.0f);
		}

		if ( gamepadIndex == 0 ) {
			glLoadIdentity();
			glTranslatef(5.0f, 20.0f, 0.0f);
			glColor3f(0.0f, 0.0f, 0.0f);
			drawString(0, 0, "No devices found; plug in a USB gamepad and it will be detected automatically");
		}
	}

	private void destroy() {
		if ( debugProc != null )
			debugProc.free();

		if ( window != NULL ) {
			glfwFreeCallbacks(window);
			glfwDestroyWindow(window);
		}

		glfwTerminate();
		glfwSetErrorCallback(null).free();
	}

	private static void keyDownFunc(long windowHnd, int key, int scancode, int action, int mods) {
		if ( action != GLFW_RELEASE )
			return;

		switch ( key ) {
			case GLFW_KEY_R:
				System.out.println("Resetting...");
				Gamepad_shutdown();
				Gamepad_init();
				break;
			case GLFW_KEY_ESCAPE:
				glfwSetWindowShouldClose(windowHnd, true);
				break;
		}
	}

	private static void reshapeFunc(long window, int width, int height) {
		glViewport(0, 0, width, height);
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		glOrtho(0.0f, width, height, 0.0f, -1.0f, 1.0f);
		glMatrixMode(GL_MODELVIEW);
	}

	private void init() {
		GLFWErrorCallback.createPrint().set();
		if ( !glfwInit() )
			throw new IllegalStateException("Unable to initialize glfw");

		glfwDefaultWindowHints();
		glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
		glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE);
		glfwWindowHint(GLFW_OPENGL_DEBUG_CONTEXT, GLFW_TRUE);

		int WIDTH = 800;
		int HEIGHT = 600;

		long window = glfwCreateWindow(WIDTH, HEIGHT, "Gamepad Demo", NULL, NULL);
		if ( window == NULL )
			throw new RuntimeException("Failed to create the GLFW window");

		long monitor = glfwGetPrimaryMonitor();
		GLFWVidMode vidmode = glfwGetVideoMode(monitor);

		// Center window
		glfwSetWindowPos(
			window,
			(vidmode.width() - WIDTH) / 2,
			(vidmode.height() - HEIGHT) / 2
		);

		glfwSetKeyCallback(window, GamepadDemo::keyDownFunc);
		glfwSetFramebufferSizeCallback(window, GamepadDemo::reshapeFunc);
		glfwSetWindowSizeCallback(window, (windowHnd, width, height) -> {
			this.windowWidth = width;
			this.windowHeight = height;
		});

		glfwSetWindowRefreshCallback(window, windowHnd -> {
			displayFunc();
			glfwSwapBuffers(windowHnd);
		});

		glfwMakeContextCurrent(window);
		GL.createCapabilities();
		debugProc = GLUtil.setupDebugMessageCallback();

		glClearColor(1.0f, 1.0f, 1.0f, 0.0f);
		glEnableClientState(GL_VERTEX_ARRAY);

		glfwSwapInterval(1);
		glfwShowWindow(window);

		glfwInvoke(window, null, GamepadDemo::reshapeFunc);

		this.window = window;
	}

	private void run() {
		try {
			init();
			initGamepad();

			mainLoop();
		} finally {
			try {
				destroy();
			} catch (Throwable t) {
				t.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new GamepadDemo().run();
	}

}