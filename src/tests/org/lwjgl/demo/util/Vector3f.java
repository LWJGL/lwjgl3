/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.demo.util;

public class Vector3f {

	public float x;
	public float y;
	public float z;

	public Vector3f() {
	}

	public Vector3f(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public void set(Vector3f v) {
		x = v.x;
		y = v.y;
		z = v.z;
	}

	public void set(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public void add(Vector3f v) {
		x += v.x;
		y += v.y;
		z += v.z;
	}

	public void sub(Vector3f v) {
		x -= v.x;
		y -= v.y;
		z -= v.z;
	}

	public float lengthSquared() {
		return x * x + y * y + z * z;
	}

	public float length() {
		return (float) Math.sqrt(lengthSquared());
	}

	public void normalize() {
		float d = length();
		x /= d;
		y /= d;
		z /= d;
	}

	public void cross(Vector3f v1, Vector3f v2) {
		set(v1.y * v2.z - v1.z * v2.y, v1.z * v2.x - v1.x * v2.z, v1.x * v2.y - v1.y * v2.x);
	}

	public String toString() {
		return "(" + x + ", " + y + ", " + z + ")";
	}

	public void negate() {
		x = -x;
		y = -y;
		z = -z;
	}

	public void min(Vector3f v) {
		x = Math.min(x, v.x);
		y = Math.min(y, v.y);
		z = Math.min(z, v.z);
	}

	public void max(Vector3f v) {
		x = Math.max(x, v.x);
		y = Math.max(y, v.y);
		z = Math.max(z, v.z);
	}

}