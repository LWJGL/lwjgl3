/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * The source in this file is ported from GLFW. License terms: http://www.glfw.org/license.html
 */
package org.lwjgl.system.jglfw;

public class GLFWvidmode implements Comparable<GLFWvidmode> {

	int width;
	int height;

	final int redBits;
	final int greenBits;
	final int blueBits;

	public GLFWvidmode(int width, int height, int bpp) {
		this.width = width;
		this.height = height;

		int delta;

		// We assume that by 32 the user really meant 24
		if ( bpp == 32 )
			bpp = 24;

		// Convert "bits per pixel" to red, green & blue sizes
		int red = bpp / 3;
		int green = red;
		int blue = red;

		delta = bpp - (red * 3);

		if ( delta >= 1 )
			green += 1;

		if ( delta == 2 )
			red += 1;

		this.redBits = red;
		this.greenBits = green;
		this.blueBits = blue;
	}

	public GLFWvidmode(int width, int height, int redBits, int greenBits, int blueBits) {
		this.width = width;
		this.height = height;
		this.redBits = redBits;
		this.greenBits = greenBits;
		this.blueBits = blueBits;
	}

	@Override
	public boolean equals(Object o) {
		if ( this == o ) return true;
		if ( o == null || getClass() != o.getClass() ) return false;

		GLFWvidmode that = (GLFWvidmode)o;

		return
			this.width == that.width &&
			this.height == that.height &&
			this.redBits == that.redBits &&
			this.greenBits == that.greenBits &&
			this.blueBits == that.blueBits;
	}

	@Override
	public int compareTo(GLFWvidmode that) {
		int BEFORE = -1;
		int EQUAL = 0;
		int AFTER = 1;

		if ( this == that ) return EQUAL;

		// First sort on color bits per pixel

		int thisBPP = this.redBits + this.greenBits + this.blueBits;
		int thatBPP = that.redBits + that.greenBits + that.blueBits;

		if ( thisBPP < thatBPP ) return BEFORE;
		if ( thatBPP < thisBPP ) return AFTER;

		// Then sort on screen area, in pixels

		int thisArea = this.width * this.height;
		int thatArea = that.width * that.height;

		if ( thisArea < thatArea ) return BEFORE;
		if ( thatArea < thisArea ) return AFTER;

		return EQUAL;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("GLFWvidmode{");
		sb.append("width=").append(width);
		sb.append(", height=").append(height);
		sb.append(", redBits=").append(redBits);
		sb.append(", greenBits=").append(greenBits);
		sb.append(", blueBits=").append(blueBits);
		sb.append('}');
		return sb.toString();
	}

}