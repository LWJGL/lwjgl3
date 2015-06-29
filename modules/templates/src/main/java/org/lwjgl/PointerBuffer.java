/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl;

import java.nio.*;

/** Interface version of PointerBuffer, used for compiling the Templates module before the Core module. */
public interface PointerBuffer extends Comparable<PointerBuffer> {
	ByteBuffer getBuffer();
	int capacity();
	int position();
	int positionByte();
	PointerBuffer position(int newPosition);
	int limit();
	PointerBuffer limit(int newLimit);
	PointerBuffer mark();
	PointerBuffer reset();
	PointerBuffer clear();
	PointerBuffer flip();
	PointerBuffer rewind();
	int remaining();
	int remainingByte();
	boolean hasRemaining();
	PointerBuffer slice();
	PointerBuffer duplicate();
	PointerBuffer asReadOnlyBuffer();
	boolean isReadOnly();
	long get();
	PointerBuffer put(long l);
	long get(int index);
	PointerBuffer put(int index, long l);
	//PointerBuffer put(Pointer wrapper);
	//PointerBuffer put(int index, Pointer wrapper);
	PointerBuffer put(ByteBuffer buffer);
	PointerBuffer put(ShortBuffer buffer);
	PointerBuffer put(IntBuffer buffer);
	PointerBuffer put(LongBuffer buffer);
	PointerBuffer put(FloatBuffer buffer);
	PointerBuffer put(DoubleBuffer buffer);
	PointerBuffer putAddressOf(PointerBuffer buffer);
	void put(int index, ByteBuffer buffer);
	void put(int index, ShortBuffer buffer);
	void put(int index, IntBuffer buffer);
	void put(int index, LongBuffer buffer);
	void put(int index, FloatBuffer buffer);
	void put(int index, DoubleBuffer buffer);
	void putAddressOf(int index, PointerBuffer buffer);
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
	PointerBuffer put(long[] src, int offset, int length);
	PointerBuffer put(long[] src);
	PointerBuffer compact();
	ByteOrder order();
}