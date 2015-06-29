/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import org.lwjgl.LWJGLUtil;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.*;

import sun.misc.Unsafe;
import sun.nio.ch.DirectBuffer;

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
	private static final class MemoryAccessorUnsafe extends MemoryAccessorJava {

		/**
		 * Limits the number of bytes to affect per call to Unsafe's bulk memory operations (copy & set). A limit is imposed to allow for safepoint polling
		 * during a large operation. This limit is equivalent to {@link java.nio.Bits#UNSAFE_COPY_THRESHOLD}.
		 */
		private static final long BULK_OP_THRESHOLD = 0x100000; // 1 MB

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

				ByteBuffer buffer = globalBuffer;

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

		@Override
		int getPageSize() {
			return unsafe.pageSize();
		}

		@Override
		public long getAddress(Buffer buffer) {
			return ((DirectBuffer)buffer).address();
		}

		@Override
		ByteBuffer newByteBuffer(long address, int capacity) {
			ByteBuffer buffer = newByteBuffer();

			unsafe.putLong(buffer, this.address, address);
			unsafe.putInt(buffer, this.capacity, capacity);

			// Optimization:
			// This method is similar to setup below, except we don't clear the parent field. This is ok because we don't need to ever release
			// MemoryAccessorJava#globalBuffer.

			buffer.clear();
			return buffer;
		}

		private <T extends Buffer> T setup(T buffer, long address, int capacity, long parentField) {
			unsafe.putLong(buffer, this.address, address);
			unsafe.putInt(buffer, this.capacity, capacity);

			unsafe.putObject(buffer, parentField, null);

			buffer.clear();
			return buffer;
		}

		@Override
		public ByteBuffer setupBuffer(ByteBuffer buffer, long address, int capacity) {
			// If we allowed this, the ByteBuffer's malloc'ed memory might never be freed.
			if ( LWJGLUtil.DEBUG && unsafe.getObject(buffer, cleaner) != null )
				throw new IllegalArgumentException("Instances created through ByteBuffer.allocateDirect cannot be modified.");

			return setup(buffer, address, capacity, byteBufferParent);
		}

		@Override
		ShortBuffer setupBuffer(ShortBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, shortBufferParent);
		}

		@Override
		CharBuffer setupBuffer(CharBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, charBufferParent);
		}

		@Override
		IntBuffer setupBuffer(IntBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, intBufferParent);
		}

		@Override
		LongBuffer setupBuffer(LongBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, longBufferParent);
		}

		@Override
		FloatBuffer setupBuffer(FloatBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, floatBufferParent);
		}

		@Override
		DoubleBuffer setupBuffer(DoubleBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, doubleBufferParent);
		}

		@Override
		void memSet(long dst, int value, int bytes) {
			// Do the memset in BULK_OP_THRESHOLD sized batches to keep TTSP low.
			while ( true ) {
				long batchSize = BULK_OP_THRESHOLD < bytes ? BULK_OP_THRESHOLD : bytes;
				unsafe.setMemory(dst, batchSize, (byte)(value & 0xFF));

				bytes -= BULK_OP_THRESHOLD;
				if ( bytes < 0 )
					break;

				dst += BULK_OP_THRESHOLD;
			}
		}

		@Override
		void memCopy(long src, long dst, int bytes) {
			// Do the memcpy in BULK_OP_THRESHOLD sized batches to keep TTSP low.

			while ( true ) {
				long batchSize = BULK_OP_THRESHOLD < bytes ? BULK_OP_THRESHOLD : bytes;
				unsafe.copyMemory(src, dst, batchSize);

				bytes -= BULK_OP_THRESHOLD;
				if ( bytes < 0 )
					break;

				src += BULK_OP_THRESHOLD;
				dst += BULK_OP_THRESHOLD;
			}
		}

		@Override
		byte memGetByte(long ptr) {
			return unsafe.getByte(ptr);
		}

		@Override
		short memGetShort(long ptr) {
			return unsafe.getShort(ptr);
		}

		@Override
		int memGetInt(long ptr) {
			return unsafe.getInt(ptr);
		}

		@Override
		long memGetLong(long ptr) {
			return unsafe.getLong(ptr);
		}

		@Override
		float memGetFloat(long ptr) {
			return unsafe.getFloat(ptr);
		}

		@Override
		double memGetDouble(long ptr) {
			return unsafe.getDouble(ptr);
		}

		@Override
		long memGetAddress(long ptr) {
			return unsafe.getAddress(ptr);
		}

		@Override
		void memPutByte(long ptr, byte value) {
			unsafe.putByte(ptr, value);
		}

		@Override
		void memPutShort(long ptr, short value) {
			unsafe.putShort(ptr, value);
		}

		@Override
		void memPutInt(long ptr, int value) {
			unsafe.putInt(ptr, value);
		}

		@Override
		void memPutLong(long ptr, long value) {
			unsafe.putLong(ptr, value);
		}

		@Override
		void memPutFloat(long ptr, float value) {
			unsafe.putFloat(ptr, value);
		}

		@Override
		void memPutDouble(long ptr, double value) {
			unsafe.putDouble(ptr, value);
		}

		@Override
		void memPutAddress(long ptr, long value) {
			unsafe.putAddress(ptr, value);
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

}