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

		LWJGLUtil.log("MemoryUtil MemoryAccessor: " + accessor.getClass().getSimpleName());
		return accessor;
	}

	private static MemoryAccessor loadAccessor(final String className) throws Exception {
		return (MemoryAccessor)Class.forName(className).newInstance();
	}

	abstract static class MemoryAccessor {

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

		public void memSet(final long dst, final int value, final int bytes) {
			nMemSet(dst, value, bytes);
		}

		public void memCopy(final long src, final long dst, final int bytes) {
			nMemCopy(dst, src, bytes); // Note the swapped src & dst
		}

	}

	/** Default implementation. */
	private static class MemoryAccessorJNI extends MemoryAccessor {

		long getAddress(final Buffer buffer) {
			return nGetAddress(buffer);
		}

		ByteBuffer newByteBuffer(final long address, final int capacity) {
			return nNewBuffer(address, capacity).order(ByteOrder.nativeOrder());
		}

		ShortBuffer newShortBuffer(final long address, final int capacity) { return newByteBuffer(address, capacity << 1).asShortBuffer(); }

		CharBuffer newCharBuffer(final long address, final int capacity) { return newByteBuffer(address, capacity << 1).asCharBuffer(); }

		IntBuffer newIntBuffer(final long address, final int capacity) { return newByteBuffer(address, capacity << 2).asIntBuffer(); }

		LongBuffer newLongBuffer(final long address, final int capacity) { return newByteBuffer(address, capacity << 3).asLongBuffer(); }

		FloatBuffer newFloatBuffer(final long address, final int capacity) { return newByteBuffer(address, capacity << 2).asFloatBuffer(); }

		DoubleBuffer newDoubleBuffer(final long address, final int capacity) { return newByteBuffer(address, capacity << 3).asDoubleBuffer(); }

		ByteBuffer setupBuffer(final ByteBuffer buffer, final long address, final int capacity) { return newByteBuffer(address, capacity); }

		ShortBuffer setupBuffer(final ShortBuffer buffer, final long address, final int capacity) { return newShortBuffer(address, capacity); }

		CharBuffer setupBuffer(final CharBuffer buffer, final long address, final int capacity) { return newCharBuffer(address, capacity); }

		IntBuffer setupBuffer(final IntBuffer buffer, final long address, final int capacity) { return newIntBuffer(address, capacity); }

		LongBuffer setupBuffer(final LongBuffer buffer, final long address, final int capacity) { return newLongBuffer(address, capacity); }

		FloatBuffer setupBuffer(final FloatBuffer buffer, final long address, final int capacity) { return newFloatBuffer(address, capacity); }

		DoubleBuffer setupBuffer(final DoubleBuffer buffer, final long address, final int capacity) { return newDoubleBuffer(address, capacity); }

	}

	abstract static class MemoryAccessorJava extends MemoryAccessor {

		private final ByteBuffer globalBuffer = ByteBuffer.allocateDirect(0);

		final ByteBuffer newByteBuffer(final long address, final int capacity) {
			return setupBuffer(
				globalBuffer.duplicate().order(ByteOrder.nativeOrder()),
				address,
				capacity
			);
		}

		final ShortBuffer newShortBuffer(final long address, final int capacity) { return setupBuffer(globalBuffer.asShortBuffer(), address, capacity); }

		final CharBuffer newCharBuffer(final long address, final int capacity) { return setupBuffer(globalBuffer.asCharBuffer(), address, capacity); }

		final IntBuffer newIntBuffer(final long address, final int capacity) { return setupBuffer(globalBuffer.asIntBuffer(), address, capacity); }

		final LongBuffer newLongBuffer(final long address, final int capacity) { return setupBuffer(globalBuffer.asLongBuffer(), address, capacity); }

		final FloatBuffer newFloatBuffer(final long address, final int capacity) { return setupBuffer(globalBuffer.asFloatBuffer(), address, capacity); }

		final DoubleBuffer newDoubleBuffer(final long address, final int capacity) { return setupBuffer(globalBuffer.asDoubleBuffer(), address, capacity); }

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

				final ByteBuffer buffer = ByteBuffer.allocateDirect(0);

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

		public long getAddress(final Buffer buffer) {
			try {
				return address.getLong(buffer);
			} catch (IllegalAccessException e) {
				throw new UnsupportedOperationException(e);
			}
		}

		private void setup(final Buffer buffer, final long address, final int capacity, final Field parentField) {
			try {
				this.address.setLong(buffer, address);
				this.capacity.setInt(buffer, capacity);

				parentField.set(buffer, null);
			} catch (IllegalAccessException e) {
				throw new UnsupportedOperationException(e);
			}

			buffer.clear();
		}

		ByteBuffer setupBuffer(final ByteBuffer buffer, final long address, final int capacity) {
			if ( LWJGLUtil.DEBUG ) {
				try {
					// If we allowed this, the ByteBuffer's malloc'ed memory might never be freed.
					if ( cleaner.get(buffer) != null )
						throw new IllegalArgumentException("Instances created through ByteBuffer.allocateDirect cannot be modified.");
				} catch (IllegalAccessException e) {
					throw new UnsupportedOperationException(e);
				}
			}

			setup(buffer, address, capacity, byteBufferParent);
			return buffer;
		}

		ShortBuffer setupBuffer(final ShortBuffer buffer, final long address, final int capacity) {
			setup(buffer, address, capacity << 1, shortBufferParent);
			return buffer;
		}

		CharBuffer setupBuffer(final CharBuffer buffer, final long address, final int capacity) {
			setup(buffer, address, capacity << 1, charBufferParent);
			return buffer;
		}

		IntBuffer setupBuffer(final IntBuffer buffer, final long address, final int capacity) {
			setup(buffer, address, capacity << 2, intBufferParent);
			return buffer;
		}

		LongBuffer setupBuffer(final LongBuffer buffer, final long address, final int capacity) {
			setup(buffer, address, capacity << 3, longBufferParent);
			return buffer;
		}

		FloatBuffer setupBuffer(final FloatBuffer buffer, final long address, final int capacity) {
			setup(buffer, address, capacity << 2, floatBufferParent);
			return buffer;
		}

		DoubleBuffer setupBuffer(final DoubleBuffer buffer, final long address, final int capacity) {
			setup(buffer, address, capacity << 3, doubleBufferParent);
			return buffer;
		}

	}

	static Field getDeclaredField(final Class<?> root, final String fieldName) throws NoSuchFieldException {
		Class<?> type = root;

		do {
			try {
				final Field field = type.getDeclaredField(fieldName);
				field.setAccessible(true);
				return field;
			} catch (NoSuchFieldException e) {
				type = type.getSuperclass();
			}
		} while ( type != null );

		throw new NoSuchFieldException(fieldName + " does not exist in " + root.getSimpleName() + " or any of its superclasses.");
	}

	static Field getField(final Buffer buffer, final Object value) throws NoSuchFieldException {
		Class<?> type = buffer.getClass();

		do {
			for ( final Field field : type.getDeclaredFields() ) {
				if ( Modifier.isStatic(field.getModifiers()) )
					continue;

				if ( !field.getType().isAssignableFrom(value.getClass()) )
					continue;

				field.setAccessible(true);
				try {
					final Object fieldValue = field.get(buffer);
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