/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.demo.stb;

import org.lwjgl.BufferUtils;

import java.nio.ByteBuffer;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.stb.STBEasyFont.*;

/** STB Easy Font demo. */
public final class EasyFont extends FontDemo {

	private static final int BASE_HEIGHT = 12;

	private EasyFont(String filePath) {
		super(BASE_HEIGHT, filePath);
	}

	public static void main(String[] args) {
		String filePath;
		if ( args.length == 0 ) {
			System.out.println("Use 'ant demo -Dclass=org.lwjgl.demo.stb.EasyFont -Dargs=<path>' to load a different text file (must be UTF8-encoded).\n");
			filePath = "demo/raytracing/hybrid.glsl";
		} else
			filePath = args[0];

		new EasyFont(filePath).run("STB Easy Font Demo");
	}

	@Override
	protected void loop() {
		ByteBuffer charBuffer = BufferUtils.createByteBuffer(text.length() * 270);
		int quads = stb_easy_font_print(0, 0, getText(), null, charBuffer);

		glEnableClientState(GL_VERTEX_ARRAY);
		glVertexPointer(2, GL_FLOAT, 16, charBuffer);

		glClearColor(43f / 255f, 43f / 255f, 43f / 255f, 0f); // BG color
		glColor3f(169f / 255f, 183f / 255f, 198f / 255f); // Text color

		while ( glfwWindowShouldClose(getWindow()) == GL_FALSE ) {
			glfwPollEvents();

			glClear(GL_COLOR_BUFFER_BIT);

			float scaleFactor = 1.0f + getScale() * 0.25f;

			glPushMatrix();
			// Zoom
			glScalef(scaleFactor, scaleFactor, 1f);
			// Scroll
			glTranslatef(4.0f, 4.0f - getLineOffset() * getFontHeight(), 0f);

			glDrawArrays(GL_QUADS, 0, quads * 4);

			glPopMatrix();

			glfwSwapBuffers(getWindow());
		}

		glDisableClientState(GL_VERTEX_ARRAY);

		glfwDestroyWindow(getWindow());
	}

}