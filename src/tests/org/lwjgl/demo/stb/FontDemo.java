/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.demo.stb;

import org.lwjgl.BufferUtils;
import org.lwjgl.glfw.*;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.system.libffi.Closure;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
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

	private int fbw = ww;
	private int fbh = wh;

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
			t = memDecodeUTF8(source).replaceAll("\t", "    "); // Replace tabs

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

		errorfun = errorCallbackPrint(System.err);

		windowSizefun = new GLFWWindowSizeCallback() {
			@Override
			public void invoke(long window, int width, int height) {
				FontDemo.this.ww = width;
				FontDemo.this.wh = height;
			}
		};

		framebufferSizefun = new GLFWFramebufferSizeCallback() {
			@Override
			public void invoke(long window, int width, int height) {
				FontDemo.this.fbw = width;
				FontDemo.this.fbh = height;

				updateViewport();
				setLineOffset(0);
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
						glfwSetWindowShouldClose(window, GL_TRUE);
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
			updateViewport();

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
		glfwSetErrorCallback(errorfun);
		if ( glfwInit() != GL11.GL_TRUE )
			throw new IllegalStateException("Unable to initialize GLFW");

		glfwDefaultWindowHints();
		glfwWindowHint(GLFW_VISIBLE, GL_FALSE);
		glfwWindowHint(GLFW_RESIZABLE, GL_TRUE);

		this.window = glfwCreateWindow(ww, wh, title, NULL, NULL);
		if ( window == NULL )
			throw new RuntimeException("Failed to create the GLFW window");

		glfwSetKeyCallback(window, keyfun);
		glfwSetFramebufferSizeCallback(window, framebufferSizefun);
		glfwSetScrollCallback(window, scrollfun);

		// Center window
		GLFWvidmode vidmode = new GLFWvidmode(glfwGetVideoMode(glfwGetPrimaryMonitor()));

		glfwSetWindowPos(
			window,
			(vidmode.getWidth() - ww) / 2,
			(vidmode.getHeight() - wh) / 2
		);

		// Create context
		glfwMakeContextCurrent(window);
		debugProc = GLContext.createFromCurrent().setupDebugMessageCallback();

		glfwSwapInterval(1);
		glfwShowWindow(window);

		// Handle HiDPI displays
		IntBuffer w = BufferUtils.createIntBuffer(1);
		IntBuffer h = BufferUtils.createIntBuffer(1);
		glfwGetFramebufferSize(window, w, h);

		framebufferSizefun.invoke(window, w.get(0), h.get(0));
	}

	private void updateViewport() {
		if ( fbw == 0 || fbh == 0 )
			return;

		glViewport(0, 0, fbw, fbh);

		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		glOrtho(0.0, ww, wh, 0.0, -1.0, 1.0);

		glMatrixMode(GL_MODELVIEW);
		glLoadIdentity();
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
			debugProc.release();
		scrollfun.release();
		framebufferSizefun.release();
		keyfun.release();
		glfwTerminate();
		errorfun.release();
	}

}