/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.demo.opengl.raytracing;

import org.lwjgl.demo.util.Vector3f;

public interface Scene {

	Vector3f[] boxes = {
			/* Walls */
			new Vector3f(-5.0f, -0.1f, -5.0f), new Vector3f(5.0f, 0.0f, 5.0f),
			new Vector3f(-0.5f, 0.0f, -0.5f), new Vector3f(0.5f, 1.0f, 0.5f),
			new Vector3f(-5.1f, 0.0f, -5.0f), new Vector3f(-5.0f, 5.0f, 5.0f),
			new Vector3f(5.0f, 0.0f, -5.0f), new Vector3f(5.1f, 5.0f, 5.0f),
			new Vector3f(-5.0f, 0.0f, -5.1f), new Vector3f(5.0f, 5.0f, -5.0f),
			new Vector3f(-5.0f, 0.0f, 5.0f), new Vector3f(5.0f, 5.0f, 5.1f),
			new Vector3f(-5.0f, 5.0f, -5.0f), new Vector3f(5.0f, 5.1f, 5.0f),
			
			/* Boxes */
			new Vector3f(-2.5f, 0.0f, -1.5f), new Vector3f(-1.5f, 1.0f, -0.5f),
			new Vector3f(-2.5f, 0.0f, 1.5f), new Vector3f(-1.5f, 1.0f, 2.5f),
			new Vector3f(1.5f, 0.0f, 1.5f), new Vector3f(2.5f, 1.0f, 2.5f),
			new Vector3f(1.5f, 0.0f, -2.5f), new Vector3f(2.5f, 1.0f, -1.5f)
	};

	Vector3f[] boxes2 = {
			new Vector3f(-5.0f, -0.1f, -5.0f), new Vector3f(5.0f, 0.0f, 5.0f),
			new Vector3f(-0.5f, 0.0f, -0.5f), new Vector3f(0.5f, 1.0f, 0.5f), 
			new Vector3f(-2.5f, 0.0f, -1.5f), new Vector3f(-1.5f, 1.0f, -0.5f), 
			new Vector3f(-2.5f, 0.0f, 1.5f), new Vector3f(-1.5f, 1.0f, 2.5f),
			new Vector3f(1.5f, 0.0f, 1.5f), new Vector3f(2.5f, 1.0f, 2.5f),
			new Vector3f(1.5f, 0.0f, -2.5f), new Vector3f(2.5f, 1.0f, -1.5f)
	};

}
