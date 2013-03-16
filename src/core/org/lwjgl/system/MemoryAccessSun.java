/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import org.lwjgl.LWJGLUtil;
import org.lwjgl.system.MemoryAccess.*;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.*;

import sun.misc.Unsafe;
import sun.reflect.FieldAccessor;

import static org.lwjgl.system.MemoryAccess.*;

/**
 * MemoryAccessor implementations that depend on sun.misc.
 * We use reflection to grab these, so that we can compile on JDKs
 * that do not support sun.misc.
 */
final class MemoryAccessSun {

	private MemoryAccessSun() {
	}

	/** Implementation using sun.misc.Unsafe. */
	private static class MemoryAccessorUnsafe extends MemoryAccessorJava {

		private final Unsafe unsafe;

		private final long address;
		private final long capacity;

		private final long cleaner;

		private final long byteBufferParent;
		private final long shortBufferParent;
		private final long charBufferParent;
		private final long intBufferParent;
		private final long longBufferParent;
		private final long floatBufferParent;
		private final long doubleBufferParent;

		MemoryAccessorUnsafe() {
			try {
				unsafe = getUnsafeInstance();
				address = unsafe.objectFieldOffset(getDeclaredField(Buffer.class, "address"));
				capacity = unsafe.objectFieldOffset(getDeclaredField(Buffer.class, "capacity"));

				ByteBuffer buffer = ByteBuffer.allocateDirect(0);

				cleaner = unsafe.objectFieldOffset(getDeclaredField(buffer.getClass(), "cleaner"));

				byteBufferParent = unsafe.objectFieldOffset(getField(buffer.slice(), buffer));
				shortBufferParent = unsafe.objectFieldOffset(getField(buffer.asShortBuffer(), buffer));
				charBufferParent = unsafe.objectFieldOffset(getField(buffer.asCharBuffer(), buffer));
				intBufferParent = unsafe.objectFieldOffset(getField(buffer.asIntBuffer(), buffer));
				longBufferParent = unsafe.objectFieldOffset(getField(buffer.asLongBuffer(), buffer));
				floatBufferParent = unsafe.objectFieldOffset(getField(buffer.asFloatBuffer(), buffer));
				doubleBufferParent = unsafe.objectFieldOffset(getField(buffer.asDoubleBuffer(), buffer));
			} catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}

		int getPageSize() {
			return unsafe.pageSize();
		}

		public long getAddress(Buffer buffer) {
			return unsafe.getLong(buffer, address);
		}

		private <T extends Buffer> T setup(T buffer, long address, int capacity, long parentField) {
			unsafe.putLong(buffer, this.address, address);
			unsafe.putInt(buffer, this.capacity, capacity);

			unsafe.putObject(buffer, parentField, null);

			buffer.clear();
			return buffer;
		}

		public ByteBuffer setupBuffer(ByteBuffer buffer, long address, int capacity) {
			// If we allowed this, the ByteBuffer's malloc'ed memory might never be freed.
			if ( LWJGLUtil.DEBUG && unsafe.getObject(buffer, cleaner) != null )
				throw new IllegalArgumentException("Instances created through ByteBuffer.allocateDirect cannot be modified.");

			return setup(buffer, address, capacity, byteBufferParent);
		}

		ShortBuffer setupBuffer(ShortBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, shortBufferParent);
		}

		CharBuffer setupBuffer(CharBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, charBufferParent);
		}

		IntBuffer setupBuffer(IntBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, intBufferParent);
		}

		LongBuffer setupBuffer(LongBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, longBufferParent);
		}

		FloatBuffer setupBuffer(FloatBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, floatBufferParent);
		}

		DoubleBuffer setupBuffer(DoubleBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, doubleBufferParent);
		}

		public void memSet(long dst, int value, int bytes) {
			unsafe.setMemory(dst, bytes, (byte)(value & 0xFF));
		}

		public void memCopy(long src, long dst, int bytes) {
			unsafe.copyMemory(src, dst, bytes);
		}

		private static Unsafe getUnsafeInstance() {
			Field[] fields = Unsafe.class.getDeclaredFields();

			/*
			Different runtimes use different names for the Unsafe singleton,
			so we cannot use .getDeclaredField and we scan instead. For example:

			Oracle: theUnsafe
			PERC : m_unsafe_instance
			Android: THE_ONE
			*/
			for ( Field field : fields ) {
				if ( !field.getType().equals(Unsafe.class) )
					continue;

				int modifiers = field.getModifiers();
				if ( !(Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers)) )
					continue;

				field.setAccessible(true);
				try {
					return (Unsafe)field.get(null);
				} catch (IllegalAccessException e) {
					// ignore
				}
				break;
			}

			throw new UnsupportedOperationException();
		}

	}

	/** Implementation using reflection on ByteBuffer, FieldAccessor is used directly. */
	private static class MemoryAccessorReflectFast extends MemoryAccessorJava {

		private final FieldAccessor address;
		private final FieldAccessor capacity;

		private final FieldAccessor cleaner;

		private final FieldAccessor byteBufferParent;
		private final FieldAccessor shortBufferParent;
		private final FieldAccessor charBufferParent;
		private final FieldAccessor intBufferParent;
		private final FieldAccessor longBufferParent;
		private final FieldAccessor floatBufferParent;
		private final FieldAccessor doubleBufferParent;

		MemoryAccessorReflectFast() {
			try {
				Method m = Field.class.getDeclaredMethod("acquireFieldAccessor", boolean.class);
				m.setAccessible(true);

				address = (FieldAccessor)m.invoke(getDeclaredField(Buffer.class, "address"));
				capacity = (FieldAccessor)m.invoke(getDeclaredField(Buffer.class, "capacity"));

				ByteBuffer buffer = ByteBuffer.allocateDirect(0);

				cleaner = (FieldAccessor)m.invoke(getDeclaredField(buffer.getClass(), "cleaner"));

				byteBufferParent = (FieldAccessor)m.invoke(getField(buffer.slice(), buffer));
				shortBufferParent = (FieldAccessor)m.invoke(getField(buffer.asShortBuffer(), buffer));
				charBufferParent = (FieldAccessor)m.invoke(getField(buffer.asCharBuffer(), buffer));
				intBufferParent = (FieldAccessor)m.invoke(getField(buffer.asIntBuffer(), buffer));
				longBufferParent = (FieldAccessor)m.invoke(getField(buffer.asLongBuffer(), buffer));
				floatBufferParent = (FieldAccessor)m.invoke(getField(buffer.asFloatBuffer(), buffer));
				doubleBufferParent = (FieldAccessor)m.invoke(getField(buffer.asDoubleBuffer(), buffer));
			} catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}

		public long getAddress(Buffer buffer) {
			return address.getLong(buffer);
		}

		private <T extends Buffer> T setup(T buffer, long address, int capacity, FieldAccessor parentField) {
			try {
				this.address.setLong(buffer, address);
				this.capacity.setInt(buffer, capacity);

				parentField.set(buffer, null);
			} catch (IllegalAccessException e) {
				throw new UnsupportedOperationException(e);
			}

			buffer.clear();
			return buffer;
		}

		ByteBuffer setupBuffer(ByteBuffer buffer, long address, int capacity) {
			// If we allowed this, the ByteBuffer's malloc'ed memory might never be freed.
			if ( LWJGLUtil.DEBUG && cleaner.get(buffer) != null )
				throw new IllegalArgumentException("Instances created through ByteBuffer.allocateDirect cannot be modified.");

			return setup(buffer, address, capacity, byteBufferParent);
		}

		ShortBuffer setupBuffer(ShortBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, shortBufferParent);
		}

		CharBuffer setupBuffer(CharBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, charBufferParent);
		}

		IntBuffer setupBuffer(IntBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, intBufferParent);
		}

		LongBuffer setupBuffer(LongBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, longBufferParent);
		}

		FloatBuffer setupBuffer(FloatBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, floatBufferParent);
		}

		DoubleBuffer setupBuffer(DoubleBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, doubleBufferParent);
		}

	}

}