/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import org.lwjgl.LWJGLUtil;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Provides 4 MemoryAccessor implementations. The fastest available one will be used by MemoryUtil.
 * <p/>
 * BENCHMARK RESULTS - Oracle Server VM:
 * <p/>
 * Unsafe: 4ns
 * ReflectFast: 8ns
 * Reflect: 10ns
 * JNI: 82ns
 * <p/>
 * BENCHMARK RESULTS - Oracle Client VM:
 * <p/>
 * Unsafe: 5ns
 * ReflectFast: 81ns
 * Reflect: 85ns
 * JNI: 87ns
 * <p/>
 * On non-Oracle VMs, Unsafe should be the fastest implementation as well. In the absence
 * of Unsafe, performance will depend on how reflection and JNI are implemented. For now
 * we'll go with what we see on the Oracle VM (that is, we'll prefer reflection over JNI).
 */
final class MemoryAccess {

	private MemoryAccess() {
	}

	static MemoryAccessor getInstance() {
		MemoryAccessor accessor;
		try {
			// Depends on java.nio.Buffer#address and sun.misc.Unsafe
			accessor = loadAccessor("org.lwjgl.system.MemoryAccessSun$MemoryAccessorUnsafe");
		} catch (Exception e0) {
			try {
				// Depends on java.nio.Buffer#address and sun.reflect.FieldAccessor
				accessor = loadAccessor("org.lwjgl.system.MemoryAccessSun$MemoryAccessorReflectFast");
			} catch (Exception e1) {
				try {
					// Depends on java.nio.Buffer#address
					accessor = new MemoryAccessorReflect();
				} catch (Exception e2) {
					LWJGLUtil.log("Unsupported JVM detected, this will likely result in low performance. Please inform LWJGL developers.");
					accessor = new MemoryAccessorJNI();
				}
			}
		}

		return accessor;
	}

	private static MemoryAccessor loadAccessor(String className) throws Exception {
		return (MemoryAccessor)Class.forName(className).newInstance();
	}

	abstract static class MemoryAccessor {

		int getPageSize() {
			// TODO: Can we do better?
			return 4096;
		}

		int getCacheLineSize() {
			// TODO: Can we do better?
			return 64;
		}

		abstract long getAddress(Buffer buffer);

		abstract ByteBuffer newByteBuffer(long address, int capacity);

		abstract ShortBuffer newShortBuffer(long address, int capacity);

		abstract CharBuffer newCharBuffer(long address, int capacity);

		abstract IntBuffer newIntBuffer(long address, int capacity);

		abstract LongBuffer newLongBuffer(long address, int capacity);

		abstract FloatBuffer newFloatBuffer(long address, int capacity);

		abstract DoubleBuffer newDoubleBuffer(long address, int capacity);

		abstract ByteBuffer setupBuffer(ByteBuffer buffer, long address, int capacity);

		abstract ShortBuffer setupBuffer(ShortBuffer buffer, long address, int capacity);

		abstract CharBuffer setupBuffer(CharBuffer buffer, long address, int capacity);

		abstract IntBuffer setupBuffer(IntBuffer buffer, long address, int capacity);

		abstract LongBuffer setupBuffer(LongBuffer buffer, long address, int capacity);

		abstract FloatBuffer setupBuffer(FloatBuffer buffer, long address, int capacity);

		abstract DoubleBuffer setupBuffer(DoubleBuffer buffer, long address, int capacity);

		void memSet(long dst, int value, int bytes) { nMemSet(dst, value, bytes); }

		void memCopy(long src, long dst, int bytes) {
			nMemCopy(dst, src, bytes); // Note the swapped src & dst
		}

		byte memGetByte(long ptr) { return nMemGetByte(ptr); }

		short memGetShort(long ptr) { return nMemGetShort(ptr); }

		int memGetInt(long ptr) { return nMemGetInt(ptr); }

		long memGetLong(long ptr) { return nMemGetLong(ptr); }

		float memGetFloat(long ptr) { return nMemGetFloat(ptr); }

		double memGetDouble(long ptr) { return nMemGetDouble(ptr); }

		long memGetAddress(long ptr) { return nMemGetAddress(ptr); }

		void memPutByte(long ptr, byte value) { nMemPutByte(ptr, value); }

		void memPutShort(long ptr, short value) { nMemPutShort(ptr, value); }

		void memPutInt(long ptr, int value) { nMemPutInt(ptr, value); }

		void memPutLong(long ptr, long value) { nMemPutLong(ptr, value); }

		void memPutFloat(long ptr, float value) { nMemPutFloat(ptr, value); }

		void memPutDouble(long ptr, double value) { nMemPutDouble(ptr, value); }

		void memPutAddress(long ptr, long value) { nMemPutAddress(ptr, value); }

	}

	/** Default implementation. */
	private static class MemoryAccessorJNI extends MemoryAccessor {

		@Override
		long getAddress(Buffer buffer) {
			return nGetAddress(buffer);
		}

		@Override
		ByteBuffer newByteBuffer(long address, int capacity) {
			return nNewBuffer(address, capacity).order(ByteOrder.nativeOrder());
		}

		@Override
		ShortBuffer newShortBuffer(long address, int capacity) { return newByteBuffer(address, capacity << 1).asShortBuffer(); }

		@Override
		CharBuffer newCharBuffer(long address, int capacity) { return newByteBuffer(address, capacity << 1).asCharBuffer(); }

		@Override
		IntBuffer newIntBuffer(long address, int capacity) { return newByteBuffer(address, capacity << 2).asIntBuffer(); }

		@Override
		LongBuffer newLongBuffer(long address, int capacity) { return newByteBuffer(address, capacity << 3).asLongBuffer(); }

		@Override
		FloatBuffer newFloatBuffer(long address, int capacity) { return newByteBuffer(address, capacity << 2).asFloatBuffer(); }

		@Override
		DoubleBuffer newDoubleBuffer(long address, int capacity) { return newByteBuffer(address, capacity << 3).asDoubleBuffer(); }

		@Override
		ByteBuffer setupBuffer(ByteBuffer buffer, long address, int capacity) { return newByteBuffer(address, capacity); }

		@Override
		ShortBuffer setupBuffer(ShortBuffer buffer, long address, int capacity) { return newShortBuffer(address, capacity); }

		@Override
		CharBuffer setupBuffer(CharBuffer buffer, long address, int capacity) { return newCharBuffer(address, capacity); }

		@Override
		IntBuffer setupBuffer(IntBuffer buffer, long address, int capacity) { return newIntBuffer(address, capacity); }

		@Override
		LongBuffer setupBuffer(LongBuffer buffer, long address, int capacity) { return newLongBuffer(address, capacity); }

		@Override
		FloatBuffer setupBuffer(FloatBuffer buffer, long address, int capacity) { return newFloatBuffer(address, capacity); }

		@Override
		DoubleBuffer setupBuffer(DoubleBuffer buffer, long address, int capacity) { return newDoubleBuffer(address, capacity); }

	}

	abstract static class MemoryAccessorJava extends MemoryAccessor {

		private final ByteBuffer globalBuffer = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

		@Override
		final ByteBuffer newByteBuffer(long address, int capacity) {
			return setupBuffer(
				globalBuffer.duplicate().order(ByteOrder.nativeOrder()),
				address,
				capacity
			);
		}

		@Override
		final ShortBuffer newShortBuffer(long address, int capacity) { return setupBuffer(globalBuffer.asShortBuffer(), address, capacity); }

		@Override
		final CharBuffer newCharBuffer(long address, int capacity) { return setupBuffer(globalBuffer.asCharBuffer(), address, capacity); }

		@Override
		final IntBuffer newIntBuffer(long address, int capacity) { return setupBuffer(globalBuffer.asIntBuffer(), address, capacity); }

		@Override
		final LongBuffer newLongBuffer(long address, int capacity) { return setupBuffer(globalBuffer.asLongBuffer(), address, capacity); }

		@Override
		final FloatBuffer newFloatBuffer(long address, int capacity) { return setupBuffer(globalBuffer.asFloatBuffer(), address, capacity); }

		@Override
		final DoubleBuffer newDoubleBuffer(long address, int capacity) { return setupBuffer(globalBuffer.asDoubleBuffer(), address, capacity); }

	}

	/** Implementation using reflection. */
	private static class MemoryAccessorReflect extends MemoryAccessorJava {

		private final Field address;
		private final Field capacity;

		private final Field cleaner;

		private final Field byteBufferParent;
		private final Field shortBufferParent;
		private final Field charBufferParent;
		private final Field intBufferParent;
		private final Field longBufferParent;
		private final Field floatBufferParent;
		private final Field doubleBufferParent;

		MemoryAccessorReflect() {
			try {
				address = getDeclaredField(Buffer.class, "address");
				capacity = getDeclaredField(Buffer.class, "capacity");

				// The byte order is important; it changes the subclass created by the asXXBuffer() methods.
				ByteBuffer buffer = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

				cleaner = getDeclaredField(buffer.getClass(), "cleaner");

				byteBufferParent = getField(buffer.slice(), buffer);
				shortBufferParent = getField(buffer.asShortBuffer(), buffer);
				charBufferParent = getField(buffer.asCharBuffer(), buffer);
				intBufferParent = getField(buffer.asIntBuffer(), buffer);
				longBufferParent = getField(buffer.asLongBuffer(), buffer);
				floatBufferParent = getField(buffer.asFloatBuffer(), buffer);
				doubleBufferParent = getField(buffer.asDoubleBuffer(), buffer);
			} catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}

		@Override
		public long getAddress(Buffer buffer) {
			try {
				return address.getLong(buffer);
			} catch (IllegalAccessException e) {
				throw new UnsupportedOperationException(e);
			}
		}

		private <T extends Buffer> T setup(T buffer, long address, int capacity, Field parentField) {
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

		@Override
		ByteBuffer setupBuffer(ByteBuffer buffer, long address, int capacity) {
			if ( LWJGLUtil.DEBUG ) {
				try {
					// If we allowed this, the ByteBuffer's malloc'ed memory might never be freed.
					if ( cleaner.get(buffer) != null )
						throw new IllegalArgumentException("Instances created through ByteBuffer.allocateDirect cannot be modified.");
				} catch (IllegalAccessException e) {
					throw new UnsupportedOperationException(e);
				}
			}

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

	}

	static Field getDeclaredField(Class<?> root, String fieldName) throws NoSuchFieldException {
		Class<?> type = root;

		do {
			try {
				Field field = type.getDeclaredField(fieldName);
				field.setAccessible(true);
				return field;
			} catch (NoSuchFieldException e) {
				type = type.getSuperclass();
			}
		} while ( type != null );

		throw new NoSuchFieldException(fieldName + " does not exist in " + root.getSimpleName() + " or any of its superclasses.");
	}

	static Field getField(Buffer buffer, Object value) throws NoSuchFieldException {
		Class<?> type = buffer.getClass();

		do {
			for ( Field field : type.getDeclaredFields() ) {
				if ( Modifier.isStatic(field.getModifiers()) )
					continue;

				if ( !field.getType().isAssignableFrom(value.getClass()) )
					continue;

				field.setAccessible(true);
				try {
					Object fieldValue = field.get(buffer);
					if ( fieldValue == value )
						return field;
				} catch (IllegalAccessException e) {
					// ignore
				}
			}

			type = type.getSuperclass();
		} while ( type != null );

		throw new NoSuchFieldException("The specified value does not exist as a field in " + buffer.getClass().getSimpleName() + " or any of its superclasses.");
	}

}