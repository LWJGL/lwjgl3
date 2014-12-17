/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.demo.util;

public class Vector4f {

	public float x;
	public float y;
	public float z;
	public float w;

	public Vector4f() {
	}

	public final void set(Vector4f v) {
		x = v.x;
		y = v.y;
		z = v.z;
		w = v.w;
	}

	public final void set(float x, float y, float z, float w) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
	}

	public void scale(float s) {
		x *= s;
		y *= s;
		z *= s;
		w *= s;
	}

}