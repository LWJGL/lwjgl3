/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.demo.stb;

import org.lwjgl.BufferUtils;
import org.lwjgl.glfw.*;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.stb.STBTTAlignedQuad;
import org.lwjgl.stb.STBTTPackContext;
import org.lwjgl.stb.STBTTPackedchar;
import org.lwjgl.system.libffi.Closure;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

import static org.lwjgl.demo.util.IOUtil.*;
import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL30.*;
import static org.lwjgl.stb.STBTruetype.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * STB Truetype oversampling demo.
 *
 * <p>This is a Java port of <a href="https://github.com/nothings/stb/blob/master/tests/oversample/main.c">https://github
 * .com/nothings/stb/blob/master/tests/oversample/main.c</a>.</p>
 */
public final class TruetypeOversample {

	private static final int BITMAP_W = 512;
	private static final int BITMAP_H = 512;

	private static final float[] scale = {
		24.0f,
		14.0f
	};

	private static final int[] sf = {
		0, 1, 2,
		0, 1, 2,
	};

	// ----

	private static final STBTTAlignedQuad q  = new STBTTAlignedQuad();
	private static final FloatBuffer      xb = BufferUtils.createFloatBuffer(1);
	private static final FloatBuffer      yb = BufferUtils.createFloatBuffer(1);

	private final GLFWErrorCallback           errorfun;
	private final GLFWWindowSizeCallback      windowSizefun;
	private final GLFWFramebufferSizeCallback framebufferSizefun;
	private final GLFWKeyCallback             keyfun;

	private long window;

	private Closure debugProc;

	// ----

	private int ww = 1024;
	private int wh = 768;

	private int fbw = ww;
	private int fbh = wh;

	private int font_tex;

	private ByteBuffer chardata;

	private int font = 3;

	private boolean black_on_white;
	private boolean integer_align;
	private boolean translating;
	private boolean rotating;

	private boolean supportsSRGB;
	private boolean srgb;

	private float rotate_t, translate_t;

	private boolean show_tex;

	private TruetypeOversample() {
		errorfun = errorCallbackPrint(System.err);

		windowSizefun = new GLFWWindowSizeCallback() {
			@Override
			public void invoke(long window, int width, int height) {
				TruetypeOversample.this.ww = width;
				TruetypeOversample.this.wh = height;
			}
		};

		framebufferSizefun = new GLFWFramebufferSizeCallback() {
			@Override
			public void invoke(long window, int width, int height) {
				TruetypeOversample.this.fbw = width;
				TruetypeOversample.this.fbh = height;
			}
		};

		keyfun = new GLFWKeyCallback() {
			@Override
			public void invoke(long window, int key, int scancode, int action, int mods) {
				if ( action == GLFW_RELEASE )
					return;

				switch ( key ) {
					case GLFW_KEY_ESCAPE:
						glfwSetWindowShouldClose(window, GL_TRUE);
						break;
					case GLFW_KEY_O:
						font = (font + 1) % 3 + (font / 3) * 3;
						break;
					case GLFW_KEY_S:
						font = (font + 3) % 6;
						break;
					case GLFW_KEY_T:
						translating = !translating;
						translate_t = 0.0f;
						break;
					case GLFW_KEY_R:
						rotating = !rotating;
						rotate_t = 0.0f;
						break;
					case GLFW_KEY_P:
						integer_align = !integer_align;
						break;
					case GLFW_KEY_G:
						if ( !supportsSRGB )
							break;

						srgb = !srgb;
						if ( srgb )
							glEnable(GL_FRAMEBUFFER_SRGB);
						else
							glDisable(GL_FRAMEBUFFER_SRGB);
						break;
					case GLFW_KEY_V:
						show_tex = !show_tex;
						break;
					case GLFW_KEY_B:
						black_on_white = !black_on_white;
						break;
				}
			}
		};
	}

	public static void main(String[] args) {
		new TruetypeOversample().run("STB Truetype Oversample Demo");
	}

	private void load_fonts() {
		font_tex = glGenTextures();
		chardata = BufferUtils.createByteBuffer(6 * 128 * STBTTPackedchar.SIZEOF);

		try {
			ByteBuffer ttf = ioResourceToByteBuffer("demo/FiraSans.ttf", 160 * 1024);

			ByteBuffer bitmap = BufferUtils.createByteBuffer(BITMAP_W * BITMAP_H);

			ByteBuffer pc = BufferUtils.createByteBuffer(STBTTPackContext.SIZEOF);
			stbtt_PackBegin(pc, bitmap, BITMAP_W, BITMAP_H, 0, 1, null);
			for ( int i = 0; i < 2; i++ ) {
				chardata.position(((i * 3 + 0) * 128 + 32) * STBTTPackedchar.SIZEOF);
				stbtt_PackSetOversampling(pc, 1, 1);
				stbtt_PackFontRange(pc, ttf, 0, scale[i], 32, 95, chardata);

				chardata.position(((i * 3 + 1) * 128 + 32) * STBTTPackedchar.SIZEOF);
				stbtt_PackSetOversampling(pc, 2, 2);
				stbtt_PackFontRange(pc, ttf, 0, scale[i], 32, 95, chardata);

				chardata.position(((i * 3 + 2) * 128 + 32) * STBTTPackedchar.SIZEOF);
				stbtt_PackSetOversampling(pc, 3, 1);
				stbtt_PackFontRange(pc, ttf, 0, scale[i], 32, 95, chardata);
			}
			stbtt_PackEnd(pc);

			glBindTexture(GL_TEXTURE_2D, font_tex);
			glTexImage2D(GL_TEXTURE_2D, 0, GL_ALPHA, BITMAP_W, BITMAP_H, 0, GL_ALPHA, GL_UNSIGNED_BYTE, bitmap);
			glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_LINEAR);
			glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_LINEAR);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	private void draw_init() {
		glDisable(GL_CULL_FACE);
		glDisable(GL_TEXTURE_2D);
		glDisable(GL_LIGHTING);
		glDisable(GL_DEPTH_TEST);

		glViewport(0, 0, fbw, fbh);
		if ( black_on_white )
			glClearColor(255, 255, 255, 0);
		else
			glClearColor(0, 0, 0, 0);
		glClear(GL_COLOR_BUFFER_BIT);

		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		glOrtho(0.0, ww, wh, 0.0, -1.0, 1.0);
		glMatrixMode(GL_MODELVIEW);
		glLoadIdentity();
	}

	private static void drawBoxTC(float x0, float y0, float x1, float y1, float s0, float t0, float s1, float t1) {
		glTexCoord2f(s0, t0);
		glVertex2f(x0, y0);
		glTexCoord2f(s1, t0);
		glVertex2f(x1, y0);
		glTexCoord2f(s1, t1);
		glVertex2f(x1, y1);
		glTexCoord2f(s0, t1);
		glVertex2f(x0, y1);
	}

	private void print(float x, float y, int font, String text) {
		xb.put(0, x);
		yb.put(0, y);

		chardata.position(font * 128 * STBTTPackedchar.SIZEOF);

		glEnable(GL_TEXTURE_2D);
		glBindTexture(GL_TEXTURE_2D, font_tex);

		glBegin(GL_QUADS);
		for ( int i = 0; i < text.length(); i++ ) {
			stbtt_GetPackedQuad(chardata, BITMAP_W, BITMAP_H, text.charAt(i), xb, yb, q.buffer(), font == 0 && integer_align ? 1 : 0);
			drawBoxTC(
				q.getX0(), q.getY0(), q.getX1(), q.getY1(),
				q.getS0(), q.getT0(), q.getS1(), q.getT1()
			);
		}
		glEnd();
	}

	private void draw_world() {
		int sfont = sf[font];
		float x = 20;
		glEnable(GL_BLEND);
		glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);

		if ( black_on_white )
			glColor3f(0, 0, 0);
		else
			glColor3f(1, 1, 1);

		print(80, 30, sfont, "Controls:");
		print(100, 60, sfont, "S: toggle font size");
		print(100, 85, sfont, "O: toggle oversampling");
		print(100, 110, sfont, "T: toggle translation");
		print(100, 135, sfont, "R: toggle rotation");
		print(100, 160, sfont, "P: toggle pixel-snap (only non-oversampled)");
		if ( supportsSRGB )
			print(100, 185, sfont, "G: toggle srgb gamma-correction");
		if ( black_on_white )
			print(100, 210, sfont, "B: toggle to white-on-black");
		else
			print(100, 210, sfont, "B: toggle to black-on-white");
		print(100, 235, sfont, "V: view font texture");

		print(80, 300, sfont, "Current font:");

		if ( !show_tex ) {
			if ( font < 3 )
				print(100, 350, sfont, "Font height: 24 pixels");
			else
				print(100, 350, sfont, "Font height: 14 pixels");
		}

		if ( font % 3 == 1 )
			print(100, 325, sfont, "2x2 oversampled text at 1:1");
		else if ( font % 3 == 2 )
			print(100, 325, sfont, "3x1 oversampled text at 1:1");
		else if ( integer_align )
			print(100, 325, sfont, "1:1 text, one texel = one pixel, snapped to integer coordinates");
		else
			print(100, 325, sfont, "1:1 text, one texel = one pixel");

		if ( show_tex ) {
			glBegin(GL_QUADS);
			drawBoxTC(200, 400, 200 + BITMAP_W, 300 + BITMAP_H, 0, 0, 1, 1);
			glEnd();
		} else {
			glMatrixMode(GL_MODELVIEW);
			glTranslatef(200, 350, 0);

			if ( translating )
				x += translate_t * 8 % 30;

			if ( rotating ) {
				glTranslatef(100, 150, 0);
				glRotatef(rotate_t * 2, 0, 0, 1);
				glTranslatef(-100, -150, 0);
			}
			print(x, 100, font, "This is a test");
			print(x, 130, font, "Now is the time for all good men to come to the aid of their country.");
			print(x, 160, font, "The quick brown fox jumps over the lazy dog.");
			print(x, 190, font, "0123456789");
		}
	}

	private void draw() {
		draw_init();
		draw_world();
		glfwSwapBuffers(window);
	}

	private void loopmode(float dt) {
		if ( dt > 0.25f ) dt = 0.25f;
		if ( dt < 0.01f ) dt = 0.01f;

		rotate_t += dt;
		translate_t += dt;

		draw();
	}

	private void createWindow(String title) {
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

		// Detect sRGB support
		ContextCapabilities caps = GL.getCapabilities();
		supportsSRGB = caps.OpenGL30 || caps.GL_ARB_framebuffer_sRGB || caps.GL_EXT_framebuffer_sRGB;
	}

	private void run(String title) {
		try {
			createWindow(title);
			load_fonts();

			long time = System.nanoTime();
			while ( glfwWindowShouldClose(window) == GL_FALSE ) {
				glfwPollEvents();

				long t = System.nanoTime();
				float dt = (float)((t - time) / 1000000000.0);
				time = t;

				loopmode(dt);
			}
		} finally {
			try {
				destroy();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private void destroy() {
		if ( debugProc != null )
			debugProc.release();
		keyfun.release();
		framebufferSizefun.release();
		windowSizefun.release();
		glfwTerminate();
		errorfun.release();
	}
}