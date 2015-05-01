/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.demo.opengl;

import java.nio.FloatBuffer;

import org.lwjgl.demo.util.Vector3f;

/**
 * Utility methods for most of the ray tracing demos.
 * 
 * @author Kai Burjack
 */
public class DemoUtils {

	/**
	 * Write the vertices (position and normal) of an axis-aligned unit box into
	 * the provided {@link FloatBuffer}.
	 * 
	 * @param fv
	 *            the {@link FloatBuffer} receiving the vertex position and
	 *            normal
	 */
	public static void triangulateUnitBox(FloatBuffer fv) {
		triangulateBox(new Vector3f(-1.0f, -1.0f, -1.0f), new Vector3f(1.0f, 1.0f, 1.0f), fv);
	}

	/**
	 * Write the vertices (position and normal) of an axis-aligned box with the
	 * given corner coordinates into the provided {@link FloatBuffer}.
	 * 
	 * @param min
	 *            the min corner
	 * @param max
	 *            the max corner
	 * @param fv
	 *            the {@link FloatBuffer} receiving the vertex position and
	 *            normal
	 */
	public static void triangulateBox(Vector3f min, Vector3f max, FloatBuffer fv) {
		/* Front face */
		fv.put(min.x).put(min.y).put(max.z).put(0.0f).put(0.0f).put(1.0f);
		fv.put(max.x).put(min.y).put(max.z).put(0.0f).put(0.0f).put(1.0f);
		fv.put(max.x).put(max.y).put(max.z).put(0.0f).put(0.0f).put(1.0f);
		fv.put(max.x).put(max.y).put(max.z).put(0.0f).put(0.0f).put(1.0f);
		fv.put(min.x).put(max.y).put(max.z).put(0.0f).put(0.0f).put(1.0f);
		fv.put(min.x).put(min.y).put(max.z).put(0.0f).put(0.0f).put(1.0f);
		/* Back face */
		fv.put(max.x).put(min.y).put(min.z).put(0.0f).put(0.0f).put(-1.0f);
		fv.put(min.x).put(min.y).put(min.z).put(0.0f).put(0.0f).put(-1.0f);
		fv.put(min.x).put(max.y).put(min.z).put(0.0f).put(0.0f).put(-1.0f);
		fv.put(min.x).put(max.y).put(min.z).put(0.0f).put(0.0f).put(-1.0f);
		fv.put(max.x).put(max.y).put(min.z).put(0.0f).put(0.0f).put(-1.0f);
		fv.put(max.x).put(min.y).put(min.z).put(0.0f).put(0.0f).put(-1.0f);
		/* Left face */
		fv.put(min.x).put(min.y).put(min.z).put(-1.0f).put(0.0f).put(0.0f);
		fv.put(min.x).put(min.y).put(max.z).put(-1.0f).put(0.0f).put(0.0f);
		fv.put(min.x).put(max.y).put(max.z).put(-1.0f).put(0.0f).put(0.0f);
		fv.put(min.x).put(max.y).put(max.z).put(-1.0f).put(0.0f).put(0.0f);
		fv.put(min.x).put(max.y).put(min.z).put(-1.0f).put(0.0f).put(0.0f);
		fv.put(min.x).put(min.y).put(min.z).put(-1.0f).put(0.0f).put(0.0f);
		/* Right face */
		fv.put(max.x).put(min.y).put(max.z).put(1.0f).put(0.0f).put(0.0f);
		fv.put(max.x).put(min.y).put(min.z).put(1.0f).put(0.0f).put(0.0f);
		fv.put(max.x).put(max.y).put(min.z).put(1.0f).put(0.0f).put(0.0f);
		fv.put(max.x).put(max.y).put(min.z).put(1.0f).put(0.0f).put(0.0f);
		fv.put(max.x).put(max.y).put(max.z).put(1.0f).put(0.0f).put(0.0f);
		fv.put(max.x).put(min.y).put(max.z).put(1.0f).put(0.0f).put(0.0f);
		/* Top face */
		fv.put(min.x).put(max.y).put(max.z).put(0.0f).put(1.0f).put(0.0f);
		fv.put(max.x).put(max.y).put(max.z).put(0.0f).put(1.0f).put(0.0f);
		fv.put(max.x).put(max.y).put(min.z).put(0.0f).put(1.0f).put(0.0f);
		fv.put(max.x).put(max.y).put(min.z).put(0.0f).put(1.0f).put(0.0f);
		fv.put(min.x).put(max.y).put(min.z).put(0.0f).put(1.0f).put(0.0f);
		fv.put(min.x).put(max.y).put(max.z).put(0.0f).put(1.0f).put(0.0f);
		/* Bottom face */
		fv.put(min.x).put(min.y).put(min.z).put(0.0f).put(-1.0f).put(0.0f);
		fv.put(max.x).put(min.y).put(min.z).put(0.0f).put(-1.0f).put(0.0f);
		fv.put(max.x).put(min.y).put(max.z).put(0.0f).put(-1.0f).put(0.0f);
		fv.put(max.x).put(min.y).put(max.z).put(0.0f).put(-1.0f).put(0.0f);
		fv.put(min.x).put(min.y).put(max.z).put(0.0f).put(-1.0f).put(0.0f);
		fv.put(min.x).put(min.y).put(min.z).put(0.0f).put(-1.0f).put(0.0f);
	}

}
