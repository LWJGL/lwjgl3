/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import org.lwjgl.BufferUtils;
import org.testng.annotations.Test;

import java.nio.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.testng.Assert.*;

@Test
public class MemoryUtilTest {

	public void testMemSet() {
		ByteBuffer buffer = BufferUtils.createByteBuffer(32);
		for ( int i = 0; i < buffer.capacity(); i++ )
			buffer.put(i, (byte)i);

		memSet(nGetAddress(buffer), 0x7F, buffer.capacity());

		for ( int i = 0; i < buffer.capacity(); i++ )
			assertEquals(buffer.get(i), 0x7F);
	}

	public void testMemCopy() {
		ByteBuffer src = BufferUtils.createByteBuffer(32);
		ByteBuffer dst = BufferUtils.createByteBuffer(32);

		for ( int i = 0; i < src.capacity(); i++ )
			src.put(i, (byte)i);

		memCopy(memAddress(src), memAddress(dst), src.capacity());

		for ( int i = 0; i < src.capacity(); i++ )
			assertEquals(src.get(i), dst.get(i));
	}

	public void testJNINewBuffer() {
		ByteBuffer buffer = BufferUtils.createByteBuffer(32);
		for ( int i = 0; i < buffer.capacity(); i++ )
			buffer.put(i, (byte)i);

		long address = nGetAddress(buffer);
		assertTrue(address != 0L);

		ByteBuffer view = nNewBuffer(address + 8, 16);
		assertEquals(view.order(), ByteOrder.BIG_ENDIAN);
		for ( int i = 0; i < view.capacity(); i++ )
			assertEquals(view.get(i), buffer.get(i + 8));
	}

	public void testAddress() {
		ByteBuffer buffer = BufferUtils.createByteBuffer(32);
		for ( int i = 0; i < buffer.capacity(); i++ )
			buffer.put(i, (byte)i);

		long address = memAddress(buffer);
		assertTrue(address != 0L);

		buffer.position(8);
		buffer.limit(8 + 16);

		FloatBuffer floatView = buffer.slice().order(ByteOrder.nativeOrder()).asFloatBuffer();

		assertEquals(address + 8, memAddress(floatView));
	}

	public void testDirectAccess() {
		ByteBuffer buffer = BufferUtils.createByteBuffer(40);
		long address = memAddress(buffer);

		for ( int i = 0; i < buffer.capacity(); i++ )
			buffer.put(i, (byte)i);

		for ( int i = 0; i < buffer.capacity(); i++ )
			assertEquals(memGetByte(address + i), buffer.get(i));

		for ( int i = 0; i < buffer.capacity(); i++ )
			memPutByte(address + i, (byte)-i);

		for ( int i = 0; i < buffer.capacity(); i++ )
			assertEquals(-i, buffer.get(i));

		memPutAddress(address, address);
		memPutDouble(address + 8, Math.PI);
		memPutLong(address + 16, Integer.MAX_VALUE * 2L);
		memPutFloat(address + 24, (float)Math.PI);
		memPutInt(address + 28, Short.MAX_VALUE * 2);
		memPutShort(address + 32, (short)(Byte.MAX_VALUE * 2));
		memPutByte(address + 34, (byte)127);

		assertEquals(memGetAddress(address), address);
		assertEquals(memGetDouble(address + 8), Math.PI);
		assertEquals(memGetLong(address + 16), Integer.MAX_VALUE * 2L);
		assertEquals(memGetFloat(address + 24), (float)Math.PI);
		assertEquals(memGetInt(address + 28), Short.MAX_VALUE * 2);
		assertEquals(memGetShort(address + 32), (short)(Byte.MAX_VALUE * 2));
		assertEquals(memGetByte(address + 34), (byte)127);
	}

	public void testNewBuffer() {
		ByteBuffer buffer = BufferUtils.createByteBuffer(32);
		for ( int i = 0; i < buffer.capacity(); i++ )
			buffer.put(i, (byte)i);

		long address = memAddress(buffer);
		assertTrue(address != 0L);

		ByteBuffer view = memByteBuffer(address + 8, 16);
		assertEquals(view.order(), ByteOrder.nativeOrder());
		for ( int i = 0; i < view.capacity(); i++ )
			assertEquals(view.get(i), buffer.get(i + 8));

		ShortBuffer sb = memShortBuffer(address, 16);
		assertEquals(sb.capacity(), 16);
		for ( int i = 0; i < sb.capacity(); i++ )
			assertEquals(buffer.getShort(i << 1), sb.get(i));

		IntBuffer ib = memIntBuffer(address, 8);
		assertEquals(ib.capacity(), 8);
		for ( int i = 0; i < ib.capacity(); i++ )
			assertEquals(buffer.getInt(i << 2), ib.get(i));

		LongBuffer lb = memLongBuffer(address, 4);
		assertEquals(lb.capacity(), 4);
		for ( int i = 0; i < lb.capacity(); i++ )
			assertEquals(buffer.getLong(i << 3), lb.get(i));

		FloatBuffer fb = memFloatBuffer(address, 8);
		assertEquals(fb.capacity(), 8);
		for ( int i = 0; i < fb.capacity(); i++ )
			assertEquals(buffer.getFloat(i << 2), fb.get(i));

		DoubleBuffer db = memDoubleBuffer(address, 4);
		assertEquals(db.capacity(), 4);
		for ( int i = 0; i < db.capacity(); i++ )
			assertEquals(buffer.getDouble(i << 3), db.get(i));
	}

}