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

import static java.lang.Math.*;
import static org.lwjgl.demo.util.IOUtil.*;
import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.stb.STBImage.*;
import static org.lwjgl.system.MemoryUtil.*;

/** STB Image demo. */
public final class Image {

	private final ByteBuffer image;

	private final int w;
	private final int h;
	private final int comp;

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

	private int scale;

	private Closure debugProc;

	private Image(String imagePath) {
		ByteBuffer imageBuffer;
		try {
			imageBuffer = ioResourceToByteBuffer(imagePath, 8 * 1024);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		IntBuffer w = BufferUtils.createIntBuffer(1);
		IntBuffer h = BufferUtils.createIntBuffer(1);
		IntBuffer comp = BufferUtils.createIntBuffer(1);

		// Use info to read image metadata without decoding the entire image.
		// We don't need this for this demo, just testing the API.
		if ( stbi_info_from_memory(imageBuffer, w, h, comp) == 0 )
			throw new RuntimeException("Failed to read image information: " + stbi_failure_reason());

		System.out.println("Image width: " + w.get(0));
		System.out.println("Image height: " + h.get(0));
		System.out.println("Image components: " + comp.get(0));
		System.out.println("Image HDR: " + (stbi_is_hdr_from_memory(imageBuffer) == 1));

		// Decode the image
		image = stbi_load_from_memory(imageBuffer, w, h, comp, 0);
		if ( image == null )
			throw new RuntimeException("Failed to load image: " + stbi_failure_reason());

		this.w = w.get(0);
		this.h = h.get(0);
		this.comp = comp.get(0);

		errorfun = errorCallbackPrint(System.err);

		windowSizefun = new GLFWWindowSizeCallback() {
			@Override
			public void invoke(long window, int width, int height) {
				Image.this.ww = width;
				Image.this.wh = height;
			}
		};

		framebufferSizefun = new GLFWFramebufferSizeCallback() {
			@Override
			public void invoke(long window, int width, int height) {
				Image.this.fbw = width;
				Image.this.fbh = height;

				updateViewport();
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
			}
		};
	}

	public static void main(String[] args) {
		String imagePath;
		if ( args.length == 0 ) {
			System.out.println("Use 'ant demo -Dclass=org.lwjgl.demo.stb.Image -Dargs=<path>' to load a different image.\n");
			imagePath = "lwjgl32.png";
		} else
			imagePath = args[0];
		new Image(imagePath).run();
	}

	private void run() {
		try {
			init();
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

	private void init() {
		glfwSetErrorCallback(errorfun);
		if ( glfwInit() != GL11.GL_TRUE )
			throw new IllegalStateException("Unable to initialize GLFW");

		glfwDefaultWindowHints();
		glfwWindowHint(GLFW_VISIBLE, GL_FALSE);
		glfwWindowHint(GLFW_RESIZABLE, GL_TRUE);
		glfwWindowHint(GLFW_CONTEXT_VERSION_MAJOR, 2);
		glfwWindowHint(GLFW_CONTEXT_VERSION_MINOR, 1);

		this.window = glfwCreateWindow(ww, wh, "STB Image Demo", NULL, NULL);
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

		IntBuffer framebufferSize = BufferUtils.createIntBuffer(2);
		nglfwGetFramebufferSize(window, memAddress(framebufferSize), memAddress(framebufferSize) + 4);
		framebufferSizefun.invoke(window, framebufferSize.get(0), framebufferSize.get(1));
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
	}

	private void loop() {
		int texID = glGenTextures();

		glBindTexture(GL_TEXTURE_2D, texID);
		if ( comp == 3 )
			glTexImage2D(GL_TEXTURE_2D, 0, GL_RGB, w, h, 0, GL_RGB, GL_UNSIGNED_BYTE, image);
		else {
			glTexImage2D(GL_TEXTURE_2D, 0, GL_RGBA, w, h, 0, GL_RGBA, GL_UNSIGNED_BYTE, image);

			glEnable(GL_BLEND);
			glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
		}

		glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_LINEAR);
		glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_LINEAR);

		glEnable(GL_TEXTURE_2D);

		while ( glfwWindowShouldClose(window) == GL_FALSE ) {
			glfwPollEvents();

			glClear(GL_COLOR_BUFFER_BIT);

			float scaleFactor = 1.0f + scale * 0.25f;

			glPushMatrix();
			glScalef(scaleFactor, scaleFactor, 1f);

			glBegin(GL_QUADS);
			{
				glTexCoord2f(0.0f, 0.0f);
				glVertex2f(0.0f, 0.0f);

				glTexCoord2f(1.0f, 0.0f);
				glVertex2f(w, 0.0f);

				glTexCoord2f(1.0f, 1.0f);
				glVertex2f(w, h);

				glTexCoord2f(0.0f, 1.0f);
				glVertex2f(0.0f, h);
			}
			glEnd();

			glPopMatrix();

			glfwSwapBuffers(window);
		}

		glDisable(GL_TEXTURE_2D);

		glfwDestroyWindow(window);
	}

	private void destroy() {
		stbi_image_free(image);

		if ( debugProc != null )
			debugProc.release();
		scrollfun.release();
		framebufferSizefun.release();
		keyfun.release();
		glfwTerminate();
		errorfun.release();
	}

}