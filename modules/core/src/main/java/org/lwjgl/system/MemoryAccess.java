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

/**
 * Provides 3 {@link MemoryAccessor} implementations. The most efficient available will be used by {@link MemoryUtil}.
 * <p/>
 * Unsafe should be the most efficient implementation, even on non-Oracle VMs. In the absence of Unsafe, performance will depend on how reflection and JNI are
 * implemented. For now we'll go with what we see on the Oracle VM (that is, we'll prefer reflection over JNI).
 */
final class MemoryAccess {

	private MemoryAccess() {
	}

	static MemoryAccessor getInstance() {
		MemoryAccessor accessor;
		try {
			// Depends on java.nio.Buffer#address and sun.misc.Unsafe
			accessor = (MemoryAccessor)Class.forName("org.lwjgl.system.MemoryAccess$MemoryAccessorUnsafe").newInstance();
		} catch (Exception e0) {
			try {
				// Depends on java.nio.Buffer#address
				accessor = new MemoryAccessorReflect();
			} catch (Exception e1) {
				LWJGLUtil.log("Unsupported JVM detected, this will likely result in low performance. Please inform LWJGL developers.");
				accessor = new MemoryAccessorJNI();
			}
		}

		return accessor;
	}

	// The standard C memset function
	private static native void memset(long ptr, int value, long bytes);

	// The standard C memcpy function
	private static native void memcpy(long dst, long src, long bytes);

	// Primitive getters

	private static native byte getByte(long ptr);

	private static native short getShort(long ptr);

	private static native int getInt(long ptr);

	private static native long getLong(long ptr);

	private static native float getFloat(long ptr);

	private static native double getDouble(long ptr);

	private static native long getAddress(long ptr);

	// Primitive setters

	private static native void putByte(long ptr, byte value);

	private static native void putShort(long ptr, short value);

	private static native void putInt(long ptr, int value);

	private static native void putLong(long ptr, long value);

	private static native void putFloat(long ptr, float value);

	private static native void putDouble(long ptr, double value);

	private static native void putAddress(long ptr, long value);

	// Returns the buffer memory address
	static native long getDirectBufferAddress(Buffer buffer);

	// Returns a new direct ByteBuffer instance
	static native ByteBuffer newDirectByteBuffer(long address, int capacity);

	/** Implements functionality for {@link MemoryUtil}. */
	abstract static class MemoryAccessor {

		int getPageSize() {
			// TODO: Can we do better?
			return 4096;
		}

		int getCacheLineSize() {
			// TODO: Can we do better?
			return 64;
		}

		abstract long memAddress0(Buffer buffer);

		abstract ByteBuffer memByteBuffer(long address, int capacity);

		final ShortBuffer memShortBuffer(long address, int capacity) { return memByteBuffer(address, capacity << 1).asShortBuffer(); }

		final CharBuffer memCharBuffer(long address, int capacity) { return memByteBuffer(address, capacity << 1).asCharBuffer(); }

		final IntBuffer memIntBuffer(long address, int capacity) { return memByteBuffer(address, capacity << 2).asIntBuffer(); }

		final LongBuffer memLongBuffer(long address, int capacity) { return memByteBuffer(address, capacity << 3).asLongBuffer(); }

		final FloatBuffer memFloatBuffer(long address, int capacity) { return memByteBuffer(address, capacity << 2).asFloatBuffer(); }

		final DoubleBuffer memDoubleBuffer(long address, int capacity) { return memByteBuffer(address, capacity << 3).asDoubleBuffer(); }

		abstract ByteBuffer memSetupBuffer(ByteBuffer buffer, long address, int capacity);

		abstract ShortBuffer memSetupBuffer(ShortBuffer buffer, long address, int capacity);

		abstract CharBuffer memSetupBuffer(CharBuffer buffer, long address, int capacity);

		abstract IntBuffer memSetupBuffer(IntBuffer buffer, long address, int capacity);

		abstract LongBuffer memSetupBuffer(LongBuffer buffer, long address, int capacity);

		abstract FloatBuffer memSetupBuffer(FloatBuffer buffer, long address, int capacity);

		abstract DoubleBuffer memSetupBuffer(DoubleBuffer buffer, long address, int capacity);

		void memSet(long dst, int value, int bytes) { memset(dst, value, bytes); }

		void memCopy(long src, long dst, int bytes) {
			memcpy(dst, src, bytes); // Note the swapped src & dst
		}

		byte memGetByte(long ptr) { return getByte(ptr); }

		short memGetShort(long ptr) { return getShort(ptr); }

		int memGetInt(long ptr) { return getInt(ptr); }

		long memGetLong(long ptr) { return getLong(ptr); }

		float memGetFloat(long ptr) { return getFloat(ptr); }

		double memGetDouble(long ptr) { return getDouble(ptr); }

		long memGetAddress(long ptr) { return getAddress(ptr); }

		void memPutByte(long ptr, byte value) { putByte(ptr, value); }

		void memPutShort(long ptr, short value) { putShort(ptr, value); }

		void memPutInt(long ptr, int value) { putInt(ptr, value); }

		void memPutLong(long ptr, long value) { putLong(ptr, value); }

		void memPutFloat(long ptr, float value) { putFloat(ptr, value); }

		void memPutDouble(long ptr, double value) { putDouble(ptr, value); }

		void memPutAddress(long ptr, long value) { putAddress(ptr, value); }

	}

	/** Default implementation, using JNI. */
	private static final class MemoryAccessorJNI extends MemoryAccessor {

		@Override
		long memAddress0(Buffer buffer) {
			return getDirectBufferAddress(buffer);
		}

		@Override
		ByteBuffer memByteBuffer(long address, int capacity) {
			return newDirectByteBuffer(address, capacity).order(ByteOrder.nativeOrder());
		}

		@Override
		ByteBuffer memSetupBuffer(ByteBuffer buffer, long address, int capacity) { return memByteBuffer(address, capacity); }

		@Override
		ShortBuffer memSetupBuffer(ShortBuffer buffer, long address, int capacity) { return memShortBuffer(address, capacity); }

		@Override
		CharBuffer memSetupBuffer(CharBuffer buffer, long address, int capacity) { return memCharBuffer(address, capacity); }

		@Override
		IntBuffer memSetupBuffer(IntBuffer buffer, long address, int capacity) { return memIntBuffer(address, capacity); }

		@Override
		LongBuffer memSetupBuffer(LongBuffer buffer, long address, int capacity) { return memLongBuffer(address, capacity); }

		@Override
		FloatBuffer memSetupBuffer(FloatBuffer buffer, long address, int capacity) { return memFloatBuffer(address, capacity); }

		@Override
		DoubleBuffer memSetupBuffer(DoubleBuffer buffer, long address, int capacity) { return memDoubleBuffer(address, capacity); }

	}

	abstract static class MemoryAccessorJava extends MemoryAccessor {

		protected final ByteBuffer globalBuffer = ByteBuffer.allocateDirect(0);

		protected ByteBuffer newByteBuffer() {
			return globalBuffer.duplicate().order(ByteOrder.nativeOrder());
		}

	}

	/** Implementation using reflection. */
	private static final class MemoryAccessorReflect extends MemoryAccessorJava {

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
		public long memAddress0(Buffer buffer) {
			try {
				return address.getLong(buffer);
			} catch (IllegalAccessException e) {
				throw new UnsupportedOperationException(e);
			}
		}

		@Override
		ByteBuffer memByteBuffer(long address, int capacity) {
			ByteBuffer buffer = newByteBuffer();

			try {
				this.address.setLong(buffer, address);
				this.capacity.setInt(buffer, capacity);

				// Optimization:
				// This method is similar to setup below, except we don't clear the parent field. Doing so requires an expensive volatile write. This is ok
				// because we don't need to ever release MemoryAccessorJava#globalBuffer.
			} catch (IllegalAccessException e) {
				throw new UnsupportedOperationException(e);
			}

			buffer.clear();
			return buffer;
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
		ByteBuffer memSetupBuffer(ByteBuffer buffer, long address, int capacity) {
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
		ShortBuffer memSetupBuffer(ShortBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, shortBufferParent);
		}

		@Override
		CharBuffer memSetupBuffer(CharBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, charBufferParent);
		}

		@Override
		IntBuffer memSetupBuffer(IntBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, intBufferParent);
		}

		@Override
		LongBuffer memSetupBuffer(LongBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, longBufferParent);
		}

		@Override
		FloatBuffer memSetupBuffer(FloatBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, floatBufferParent);
		}

		@Override
		DoubleBuffer memSetupBuffer(DoubleBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, doubleBufferParent);
		}

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
		public long memAddress0(Buffer buffer) {
			return ((DirectBuffer)buffer).address();
		}

		@Override
		ByteBuffer memByteBuffer(long address, int capacity) {
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
		public ByteBuffer memSetupBuffer(ByteBuffer buffer, long address, int capacity) {
			// If we allowed this, the ByteBuffer's malloc'ed memory might never be freed.
			if ( LWJGLUtil.DEBUG && unsafe.getObject(buffer, cleaner) != null )
				throw new IllegalArgumentException("Instances created through ByteBuffer.allocateDirect cannot be modified.");

			return setup(buffer, address, capacity, byteBufferParent);
		}

		@Override
		ShortBuffer memSetupBuffer(ShortBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, shortBufferParent);
		}

		@Override
		CharBuffer memSetupBuffer(CharBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, charBufferParent);
		}

		@Override
		IntBuffer memSetupBuffer(IntBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, intBufferParent);
		}

		@Override
		LongBuffer memSetupBuffer(LongBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, longBufferParent);
		}

		@Override
		FloatBuffer memSetupBuffer(FloatBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, floatBufferParent);
		}

		@Override
		DoubleBuffer memSetupBuffer(DoubleBuffer buffer, long address, int capacity) {
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

		throw new NoSuchFieldException(String.format(
			"The specified value does not exist as a field in %s or any of its superclasses.",
			buffer.getClass().getSimpleName()
		));
	}

}