/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl;

import java.nio.*;

/** Interface version of PointerBuffer, used for compiling the Templates module before the Core module. */
public interface PointerBuffer extends Comparable<PointerBuffer> {
	long address0();
	int capacity();
	int position();
	PointerBuffer position(int newPosition);
	int limit();
	PointerBuffer limit(int newLimit);
	PointerBuffer mark();
	PointerBuffer reset();
	PointerBuffer clear();
	PointerBuffer flip();
	PointerBuffer rewind();
	int remaining();
	boolean hasRemaining();
	PointerBuffer slice();
	PointerBuffer duplicate();
	long get();
	PointerBuffer put(long p);
	long get(int index);
	PointerBuffer put(int index, long p);
	//PointerBuffer put(Pointer wrapper);
	//PointerBuffer put(int index, Pointer wrapper);
	PointerBuffer put(ByteBuffer buffer);
	PointerBuffer put(ShortBuffer buffer);
	PointerBuffer put(IntBuffer buffer);
	PointerBuffer put(LongBuffer buffer);
	PointerBuffer put(FloatBuffer buffer);
	PointerBuffer put(DoubleBuffer buffer);
	PointerBuffer putAddressOf(PointerBuffer buffer);
	PointerBuffer put(int index, ByteBuffer buffer);
	PointerBuffer put(int index, ShortBuffer buffer);
	PointerBuffer put(int index, IntBuffer buffer);
	PointerBuffer put(int index, LongBuffer buffer);
	PointerBuffer put(int index, FloatBuffer buffer);
	PointerBuffer put(int index, DoubleBuffer buffer);
	PointerBuffer putAddressOf(int index, PointerBuffer buffer);
	ByteBuffer getByteBuffer(int size);
	ShortBuffer getShortBuffer(int size);
	IntBuffer getIntBuffer(int size);
	LongBuffer getLongBuffer(int size);
	FloatBuffer getFloatBuffer(int size);
	DoubleBuffer getDoubleBuffer(int size);
	PointerBuffer getPointerBuffer(int size);
	ByteBuffer getByteBuffer(int index, int size);
	ShortBuffer getShortBuffer(int index, int size);
	IntBuffer getIntBuffer(int index, int size);
	LongBuffer getLongBuffer(int index, int size);
	FloatBuffer getFloatBuffer(int index, int size);
	DoubleBuffer getDoubleBuffer(int index, int size);
	PointerBuffer getPointerBuffer(int index, int size);
	PointerBuffer get(long[] dst, int offset, int length);
	PointerBuffer get(long[] dst);
	PointerBuffer put(PointerBuffer src);
	PointerBuffer put(long[] src);
	PointerBuffer put(long[] src, int offset, int length);
	PointerBuffer compact();
	ByteOrder order();
}