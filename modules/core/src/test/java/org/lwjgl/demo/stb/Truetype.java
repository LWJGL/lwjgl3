/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.demo.stb;

import org.lwjgl.BufferUtils;
import org.lwjgl.stb.STBTTAlignedQuad;
import org.lwjgl.stb.STBTTBakedChar;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

import static org.lwjgl.demo.util.IOUtil.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.stb.STBTruetype.*;

/** STB Truetype demo. */
public final class Truetype extends FontDemo {

	private Truetype(String filePath) {
		super(24, filePath);
	}

	public static void main(String[] args) {
		String filePath;
		if ( args.length == 0 ) {
			System.out.println("Use 'ant demo -Dclass=org.lwjgl.demo.stb.Truetype -Dargs=<path>' to load a different text file (must be UTF8-encoded).\n");
			filePath = "demo/raytracing/hybrid.glsl";
		} else
			filePath = args[0];

		new Truetype(filePath).run("STB Truetype Demo");
	}

	@Override
	protected void loop() {
		int BITMAP_W = 512;
		int BITMAP_H = 512;

		int texID = glGenTextures();
		ByteBuffer cdata = BufferUtils.createByteBuffer(96 * STBTTBakedChar.SIZEOF);

		try {
			ByteBuffer ttf = ioResourceToByteBuffer("demo/FiraSans.ttf", 160 * 1024);

			ByteBuffer bitmap = BufferUtils.createByteBuffer(BITMAP_W * BITMAP_H);
			stbtt_BakeFontBitmap(ttf, getFontHeight(), bitmap, BITMAP_W, BITMAP_H, 32, cdata);

			glBindTexture(GL_TEXTURE_2D, texID);
			glTexImage2D(GL_TEXTURE_2D, 0, GL_ALPHA, BITMAP_W, BITMAP_H, 0, GL_ALPHA, GL_UNSIGNED_BYTE, bitmap);
			glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_LINEAR);
			glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_LINEAR);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		glClearColor(43f / 255f, 43f / 255f, 43f / 255f, 0f); // BG color
		glColor3f(169f / 255f, 183f / 255f, 198f / 255f); // Text color

		glEnable(GL_TEXTURE_2D);
		glEnable(GL_BLEND);
		glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);

		FloatBuffer x = BufferUtils.createFloatBuffer(1);
		FloatBuffer y = BufferUtils.createFloatBuffer(1);
		STBTTAlignedQuad q = new STBTTAlignedQuad();

		while ( glfwWindowShouldClose(getWindow()) == GL_FALSE ) {
			glfwPollEvents();

			glClear(GL_COLOR_BUFFER_BIT);

			float scaleFactor = 1.0f + getScale() * 0.25f;

			glPushMatrix();
			// Zoom
			glScalef(scaleFactor, scaleFactor, 1f);
			// Scroll
			glTranslatef(4.0f, getFontHeight() * 0.5f + 4.0f - getLineOffset() * getFontHeight(), 0f);

			x.put(0, 0.0f);
			y.put(0, 0.0f);
			glBegin(GL_QUADS);
			for ( int i = 0; i < text.length(); i++ ) {
				char c = text.charAt(i);
				if ( c == '\n' ) {
					y.put(0, y.get(0) + getFontHeight());
					x.put(0, 0.0f);
					continue;
				} else if ( c < 32 || 128 <= c )
					continue;

				stbtt_GetBakedQuad(cdata, BITMAP_W, BITMAP_H, c - 32, x, y, q.buffer(), 1);

				glTexCoord2f(q.getS0(), q.getT0());
				glVertex2f(q.getX0(), q.getY0());

				glTexCoord2f(q.getS1(), q.getT0());
				glVertex2f(q.getX1(), q.getY0());

				glTexCoord2f(q.getS1(), q.getT1());
				glVertex2f(q.getX1(), q.getY1());

				glTexCoord2f(q.getS0(), q.getT1());
				glVertex2f(q.getX0(), q.getY1());
			}
			glEnd();

			glPopMatrix();

			glfwSwapBuffers(getWindow());
		}

		glfwDestroyWindow(getWindow());
	}

}