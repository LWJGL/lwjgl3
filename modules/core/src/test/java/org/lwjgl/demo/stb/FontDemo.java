/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.demo.stb;

import org.lwjgl.glfw.*;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GLUtil;
import org.lwjgl.system.libffi.Closure;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Math.*;
import static org.lwjgl.demo.util.IOUtil.*;
import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.system.MemoryUtil.*;

/** STB Easy Font demo. */
abstract class FontDemo {

	protected final String text;
	private final   int    lineCount;

	private final GLFWErrorCallback           errorfun;
	private final GLFWWindowSizeCallback      windowSizefun;
	private final GLFWFramebufferSizeCallback framebufferSizefun;
	private final GLFWKeyCallback             keyfun;
	private final GLFWScrollCallback          scrollfun;

	private long window;
	private int ww = 800;
	private int wh = 600;

	private boolean ctrlDown;

	private int fontHeight;

	private int   scale;
	private int   lineOffset;
	private float lineHeight;

	private Closure debugProc;

	protected FontDemo(int fontHeight, String filePath) {
		this.fontHeight = fontHeight;
		this.lineHeight = fontHeight;

		String t;
		int lc;

		try {
			ByteBuffer source = ioResourceToByteBuffer(filePath, 4 * 1024);
			t = memUTF8(source).replaceAll("\t", "    "); // Replace tabs

			lc = 0;
			Matcher m = Pattern.compile("^.*$", Pattern.MULTILINE).matcher(t);
			while ( m.find() )
				lc++;
		} catch (IOException e) {
			e.printStackTrace();

			t = "Failed to load text.";
			lc = 1;
		}

		text = t;
		lineCount = lc;

		errorfun = GLFWErrorCallback.createPrint();

		windowSizefun = new GLFWWindowSizeCallback() {
			@Override
			public void invoke(long window, int width, int height) {
				FontDemo.this.ww = width;
				FontDemo.this.wh = height;

				glMatrixMode(GL_PROJECTION);
				glLoadIdentity();
				glOrtho(0.0, width, height, 0.0, -1.0, 1.0);
				glMatrixMode(GL_MODELVIEW);

				setLineOffset(lineOffset);
			}
		};

		framebufferSizefun = new GLFWFramebufferSizeCallback() {
			@Override
			public void invoke(long window, int width, int height) {
				glViewport(0, 0, width, height);
			}
		};

		keyfun = new GLFWKeyCallback() {
			@Override
			public void invoke(long window, int key, int scancode, int action, int mods) {
				ctrlDown = (mods & GLFW_MOD_CONTROL) != 0;
				if ( action == GLFW_RELEASE )
					return;

				switch ( key ) {
					case GLFW_KEY_ESCAPE:
						glfwSetWindowShouldClose(window, GLFW_TRUE);
						break;
					case GLFW_KEY_PAGE_UP:
						setLineOffset(lineOffset - wh / FontDemo.this.lineHeight);
						break;
					case GLFW_KEY_PAGE_DOWN:
						setLineOffset(lineOffset + wh / FontDemo.this.lineHeight);
						break;
					case GLFW_KEY_HOME:
						setLineOffset(0);
						break;
					case GLFW_KEY_END:
						setLineOffset(lineCount - wh / FontDemo.this.lineHeight);
						break;
					case GLFW_KEY_KP_ADD:
					case GLFW_KEY_EQUAL:
						setScale(scale + 1);
						break;
					case GLFW_KEY_KP_SUBTRACT:
					case GLFW_KEY_MINUS:
						setScale(scale - 1);
						break;
					case GLFW_KEY_0:
					case GLFW_KEY_KP_0:
						if ( ctrlDown )
							setScale(0);
						break;
				}
			}
		};

		scrollfun = new GLFWScrollCallback() {
			@Override
			public void invoke(long window, double xoffset, double yoffset) {
				if ( ctrlDown )
					setScale(scale + (int)yoffset);
				else
					setLineOffset(lineOffset - (int)yoffset * 3);
			}
		};
	}

	public String getText() {
		return text;
	}

	public long getWindow() {
		return window;
	}

	public int getFontHeight() {
		return fontHeight;
	}

	public int getScale() {
		return scale;
	}

	public int getLineOffset() {
		return lineOffset;
	}

	protected void run(String title) {
		try {
			init(title);

			loop();
		} finally {
			try {
				destroy();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private void init(String title) {
		errorfun.set();
		if ( glfwInit() != GLFW_TRUE )
			throw new IllegalStateException("Unable to initialize GLFW");

		glfwDefaultWindowHints();
		glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
		glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE);

		this.window = glfwCreateWindow(ww, wh, title, NULL, NULL);
		if ( window == NULL )
			throw new RuntimeException("Failed to create the GLFW window");

		windowSizefun.set(window);
		framebufferSizefun.set(window);
		keyfun.set(window);
		scrollfun.set(window);

		// Center window
		GLFWVidMode vidmode = glfwGetVideoMode(glfwGetPrimaryMonitor());

		glfwSetWindowPos(
			window,
			(vidmode.width() - ww) / 2,
			(vidmode.height() - wh) / 2
		);

		// Create context
		glfwMakeContextCurrent(window);
		GL.createCapabilities();
		debugProc = GLUtil.setupDebugMessageCallback();

		glfwSwapInterval(1);
		glfwShowWindow(window);
		glfwInvoke(window, windowSizefun, framebufferSizefun);
	}

	private void setScale(int scale) {
		this.scale = max(-3, scale);
		this.lineHeight = fontHeight * (1.0f + this.scale * 0.25f);
		setLineOffset(lineOffset);
	}

	private void setLineOffset(float offset) {
		setLineOffset(round(offset));
	}

	private void setLineOffset(int offset) {
		lineOffset = max(0, min(offset, lineCount - (int)(wh / lineHeight)));
	}

	protected abstract void loop();

	private void destroy() {
		if ( debugProc != null )
			debugProc.free();
		scrollfun.free();
		keyfun.free();
		framebufferSizefun.free();
		windowSizefun.free();
		glfwTerminate();
		errorfun.free();
	}

}