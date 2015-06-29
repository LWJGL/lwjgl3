/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import org.lwjgl.LWJGLUtil;
import org.lwjgl.Pointer;

import static org.lwjgl.system.MemoryUtil.*;

/** An object wrapper around a native pointer address. */
public abstract class PointerWrapper implements Pointer {

	protected final long pointer;

	protected PointerWrapper(long pointer) {
		if ( LWJGLUtil.DEBUG && pointer == NULL )
			throw new NullPointerException();

		this.pointer = pointer;
	}

	@Override
	public final long getPointer() {
		return pointer;
	}

	public boolean equals(Object o) {
		if ( this == o ) return true;
		if ( !(o instanceof PointerWrapper) ) return false;

		PointerWrapper that = (PointerWrapper)o;

		return pointer == that.pointer;

	}

	public int hashCode() {
		return (int)(pointer ^ (pointer >>> 32));
	}

	public String toString() {
		return String.format("%s pointer [0x%X]", getClass().getSimpleName(), pointer);
	}

}