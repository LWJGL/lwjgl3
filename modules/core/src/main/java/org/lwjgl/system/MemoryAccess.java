/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import org.lwjgl.LWJGLUtil;

import java.nio.*;

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
			// Depends on sun.nio.ch.DirectBuffer and sun.misc.Unsafe
			accessor = (MemoryAccessor)Class.forName("org.lwjgl.system.MemoryAccess$MemoryAccessorUnsafe").newInstance();
		} catch (Exception e0) {
			try {
				// Depends on sun.nio.ch.DirectBuffer and sun.reflect.FieldAccessor
				accessor = new MemoryAccessorReflect();
			} catch (Exception e1) {
				LWJGLUtil.log("[MemoryAccessor] Unsupported JVM detected, this will likely result in low performance. Please inform LWJGL developers.");
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

		abstract ShortBuffer memShortBuffer(long address, int capacity);

		abstract CharBuffer memCharBuffer(long address, int capacity);

		abstract IntBuffer memIntBuffer(long address, int capacity);

		abstract LongBuffer memLongBuffer(long address, int capacity);

		abstract FloatBuffer memFloatBuffer(long address, int capacity);

		abstract DoubleBuffer memDoubleBuffer(long address, int capacity);

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
		ShortBuffer memShortBuffer(long address, int capacity) {
			return memByteBuffer(address, capacity << 1).asShortBuffer();
		}

		@Override
		CharBuffer memCharBuffer(long address, int capacity) {
			return memByteBuffer(address, capacity << 1).asCharBuffer();
		}

		@Override
		IntBuffer memIntBuffer(long address, int capacity) {
			return memByteBuffer(address, capacity << 2).asIntBuffer();
		}

		@Override
		LongBuffer memLongBuffer(long address, int capacity) {
			return memByteBuffer(address, capacity << 3).asLongBuffer();
		}

		@Override
		FloatBuffer memFloatBuffer(long address, int capacity) {
			return memByteBuffer(address, capacity << 2).asFloatBuffer();
		}

		@Override
		DoubleBuffer memDoubleBuffer(long address, int capacity) {
			return memByteBuffer(address, capacity << 3).asDoubleBuffer();
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

		protected static final ByteBuffer BYTE_BUFFER = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

		// These are all aligned instances and should only be set to naturally aligned memory addresses
		protected static final ShortBuffer  SHORT_BUFFER  = BYTE_BUFFER.asShortBuffer();
		protected static final CharBuffer   CHAR_BUFFER   = BYTE_BUFFER.asCharBuffer();
		protected static final IntBuffer    INT_BUFFER    = BYTE_BUFFER.asIntBuffer();
		protected static final LongBuffer   LONG_BUFFER   = BYTE_BUFFER.asLongBuffer();
		protected static final FloatBuffer  FLOAT_BUFFER  = BYTE_BUFFER.asFloatBuffer();
		protected static final DoubleBuffer DOUBLE_BUFFER = BYTE_BUFFER.asDoubleBuffer();

		@Override
		ByteBuffer memByteBuffer(long address, int capacity) {
			return memSetupBuffer(BYTE_BUFFER.slice().order(ByteOrder.nativeOrder()), address, capacity);
		}

		@Override
		ShortBuffer memShortBuffer(long address, int capacity) {
			return memSetupBuffer(SHORT_BUFFER.slice(), address, capacity);
		}

		@Override
		CharBuffer memCharBuffer(long address, int capacity) {
			return memSetupBuffer(CHAR_BUFFER.slice(), address, capacity);
		}

		@Override
		IntBuffer memIntBuffer(long address, int capacity) {
			return memSetupBuffer(INT_BUFFER.slice(), address, capacity);
		}

		@Override
		LongBuffer memLongBuffer(long address, int capacity) {
			return memSetupBuffer(LONG_BUFFER.slice(), address, capacity);
		}

		@Override
		FloatBuffer memFloatBuffer(long address, int capacity) {
			return memSetupBuffer(FLOAT_BUFFER.slice(), address, capacity);
		}

		@Override
		DoubleBuffer memDoubleBuffer(long address, int capacity) {
			return memSetupBuffer(DOUBLE_BUFFER.slice(), address, capacity);
		}

	}

	/** Implementation using reflection. */
	private static final class MemoryAccessorReflect extends MemoryAccessorJava {

		private static final sun.reflect.FieldAccessor ADDRESS;
		private static final sun.reflect.FieldAccessor CAPACITY;

		private static final sun.reflect.FieldAccessor
			PARENT_BYTE,
			PARENT_SHORT,
			PARENT_CHAR,
			PARENT_INT,
			PARENT_LONG,
			PARENT_FLOAT,
			PARENT_DOUBLE;

		static {
			ByteBuffer parent = BYTE_BUFFER;
			if ( !(parent instanceof sun.nio.ch.DirectBuffer) )
				throw new UnsupportedOperationException();

			try {
				ADDRESS = getFieldAccessor(getDeclaredField(Buffer.class, "address"));
				CAPACITY = getFieldAccessor(getDeclaredField(Buffer.class, "capacity"));

				PARENT_BYTE = getFieldAccessor(getField(parent.slice(), parent));
				PARENT_SHORT = getFieldAccessor(getField(SHORT_BUFFER, parent));
				PARENT_CHAR = getFieldAccessor(getField(CHAR_BUFFER, parent));
				PARENT_INT = getFieldAccessor(getField(INT_BUFFER, parent));
				PARENT_LONG = getFieldAccessor(getField(LONG_BUFFER, parent));
				PARENT_FLOAT = getFieldAccessor(getField(FLOAT_BUFFER, parent));
				PARENT_DOUBLE = getFieldAccessor(getField(DOUBLE_BUFFER, parent));
			} catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}

		MemoryAccessorReflect() {
		}

		@Override
		public long memAddress0(Buffer buffer) {
			return ((sun.nio.ch.DirectBuffer)buffer).address();
		}

		private static <T extends Buffer> T setup(T buffer, long address, int capacity, sun.reflect.FieldAccessor parentField) {
			try {
				ADDRESS.setLong(buffer, address);
				CAPACITY.setInt(buffer, capacity);

				parentField.set(buffer, null);
			} catch (IllegalAccessException e) {
				throw new UnsupportedOperationException(e);
			}

			buffer.clear();
			return buffer;
		}

		@Override
		ByteBuffer memSetupBuffer(ByteBuffer buffer, long address, int capacity) {
			// If we allowed this, the ByteBuffer's malloc'ed memory might never be freed.
			if ( LWJGLUtil.DEBUG && ((sun.nio.ch.DirectBuffer)buffer).cleaner() != null )
				throw new IllegalArgumentException("Instances created through ByteBuffer.allocateDirect cannot be modified.");

			return setup(buffer, address, capacity, PARENT_BYTE);
		}

		@Override
		ShortBuffer memSetupBuffer(ShortBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, PARENT_SHORT);
		}

		@Override
		CharBuffer memSetupBuffer(CharBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, PARENT_CHAR);
		}

		@Override
		IntBuffer memSetupBuffer(IntBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, PARENT_INT);
		}

		@Override
		LongBuffer memSetupBuffer(LongBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, PARENT_LONG);
		}

		@Override
		FloatBuffer memSetupBuffer(FloatBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, PARENT_FLOAT);
		}

		@Override
		DoubleBuffer memSetupBuffer(DoubleBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, PARENT_DOUBLE);
		}

	}

	/** Implementation using sun.misc.Unsafe. */
	private static final class MemoryAccessorUnsafe extends MemoryAccessorJava {

		/**
		 * Limits the number of bytes to affect per call to Unsafe's bulk memory operations (copy & set). A limit is imposed to allow for safepoint polling
		 * during a large operation. This limit is equivalent to {@link java.nio.Bits#UNSAFE_COPY_THRESHOLD}.
		 */
		private static final long BULK_OP_THRESHOLD = 0x100000; // 1 MB

		private static final sun.misc.Unsafe UNSAFE;

		private static final long ADDRESS;
		private static final long CAPACITY;

		private static final long
			PARENT_BYTE,
			PARENT_SHORT,
			PARENT_CHAR,
			PARENT_INT,
			PARENT_LONG,
			PARENT_FLOAT,
			PARENT_DOUBLE;

		static {
			ByteBuffer parent = BYTE_BUFFER;
			if ( !(parent instanceof sun.nio.ch.DirectBuffer) )
				throw new UnsupportedOperationException();

			try {
				UNSAFE = getUnsafeInstance();

				ADDRESS = UNSAFE.objectFieldOffset(getDeclaredField(Buffer.class, "address"));
				CAPACITY = UNSAFE.objectFieldOffset(getDeclaredField(Buffer.class, "capacity"));

				PARENT_BYTE = UNSAFE.objectFieldOffset(getField(BYTE_BUFFER.slice(), parent));
				PARENT_SHORT = UNSAFE.objectFieldOffset(getField(SHORT_BUFFER, parent));
				PARENT_CHAR = UNSAFE.objectFieldOffset(getField(CHAR_BUFFER, parent));
				PARENT_INT = UNSAFE.objectFieldOffset(getField(INT_BUFFER, parent));
				PARENT_LONG = UNSAFE.objectFieldOffset(getField(LONG_BUFFER, parent));
				PARENT_FLOAT = UNSAFE.objectFieldOffset(getField(FLOAT_BUFFER, parent));
				PARENT_DOUBLE = UNSAFE.objectFieldOffset(getField(DOUBLE_BUFFER, parent));
			} catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}

		MemoryAccessorUnsafe() {
		}

		@Override
		int getPageSize() {
			return UNSAFE.pageSize();
		}

		@Override
		public long memAddress0(Buffer buffer) {
			return UNSAFE.getLong(buffer, ADDRESS);
		}

		@Override
		ByteBuffer memByteBuffer(long address, int capacity) {
			try {
				ByteBuffer buffer = (ByteBuffer)UNSAFE.allocateInstance(BYTE_BUFFER.getClass());
				buffer.order(ByteOrder.nativeOrder());
				return memSetupBuffer(buffer, address, capacity);
			} catch (InstantiationException e) {
				throw new UnsupportedOperationException(e);
			}
		}

		@Override
		ShortBuffer memShortBuffer(long address, int capacity) {
			try {
				return memSetupBuffer((ShortBuffer)UNSAFE.allocateInstance(SHORT_BUFFER.getClass()), address, capacity);
			} catch (InstantiationException e) {
				throw new UnsupportedOperationException(e);
			}
		}

		@Override
		CharBuffer memCharBuffer(long address, int capacity) {
			try {
				return memSetupBuffer((CharBuffer)UNSAFE.allocateInstance(CHAR_BUFFER.getClass()), address, capacity);
			} catch (InstantiationException e) {
				throw new UnsupportedOperationException(e);
			}
		}

		@Override
		IntBuffer memIntBuffer(long address, int capacity) {
			try {
				return memSetupBuffer((IntBuffer)UNSAFE.allocateInstance(INT_BUFFER.getClass()), address, capacity);
			} catch (InstantiationException e) {
				throw new UnsupportedOperationException(e);
			}
		}

		@Override
		LongBuffer memLongBuffer(long address, int capacity) {
			try {
				return memSetupBuffer((LongBuffer)UNSAFE.allocateInstance(LONG_BUFFER.getClass()), address, capacity);
			} catch (InstantiationException e) {
				throw new UnsupportedOperationException(e);
			}
		}

		@Override
		FloatBuffer memFloatBuffer(long address, int capacity) {
			try {
				return memSetupBuffer((FloatBuffer)UNSAFE.allocateInstance(FLOAT_BUFFER.getClass()), address, capacity);
			} catch (InstantiationException e) {
				throw new UnsupportedOperationException(e);
			}
		}

		@Override
		DoubleBuffer memDoubleBuffer(long address, int capacity) {
			try {
				return memSetupBuffer((DoubleBuffer)UNSAFE.allocateInstance(DOUBLE_BUFFER.getClass()), address, capacity);
			} catch (InstantiationException e) {
				throw new UnsupportedOperationException(e);
			}
		}

		private static <T extends Buffer> T setup(T buffer, long address, int capacity, long parentField) {
			UNSAFE.putLong(buffer, ADDRESS, address);
			UNSAFE.putInt(buffer, CAPACITY, capacity);

			UNSAFE.putObject(buffer, parentField, null);

			buffer.clear();
			return buffer;
		}

		@Override
		public ByteBuffer memSetupBuffer(ByteBuffer buffer, long address, int capacity) {
			// If we allowed this, the ByteBuffer's malloc'ed memory might never be freed.
			if ( LWJGLUtil.DEBUG && ((sun.nio.ch.DirectBuffer)buffer).cleaner() != null )
				throw new IllegalArgumentException("Instances created through ByteBuffer.allocateDirect cannot be modified.");

			return setup(buffer, address, capacity, PARENT_BYTE);
		}

		@Override
		ShortBuffer memSetupBuffer(ShortBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, PARENT_SHORT);
		}

		@Override
		CharBuffer memSetupBuffer(CharBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, PARENT_CHAR);
		}

		@Override
		IntBuffer memSetupBuffer(IntBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, PARENT_INT);
		}

		@Override
		LongBuffer memSetupBuffer(LongBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, PARENT_LONG);
		}

		@Override
		FloatBuffer memSetupBuffer(FloatBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, PARENT_FLOAT);
		}

		@Override
		DoubleBuffer memSetupBuffer(DoubleBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, PARENT_DOUBLE);
		}

		@Override
		void memSet(long dst, int value, int bytes) {
			// Do the memset in BULK_OP_THRESHOLD sized batches to keep TTSP low.
			while ( true ) {
				long batchSize = BULK_OP_THRESHOLD < bytes ? BULK_OP_THRESHOLD : bytes;
				UNSAFE.setMemory(dst, batchSize, (byte)(value & 0xFF));

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
				UNSAFE.copyMemory(src, dst, batchSize);

				bytes -= BULK_OP_THRESHOLD;
				if ( bytes < 0 )
					break;

				src += BULK_OP_THRESHOLD;
				dst += BULK_OP_THRESHOLD;
			}
		}

		@Override
		byte memGetByte(long ptr) {
			return UNSAFE.getByte(ptr);
		}

		@Override
		short memGetShort(long ptr) {
			return UNSAFE.getShort(ptr);
		}

		@Override
		int memGetInt(long ptr) {
			return UNSAFE.getInt(ptr);
		}

		@Override
		long memGetLong(long ptr) {
			return UNSAFE.getLong(ptr);
		}

		@Override
		float memGetFloat(long ptr) {
			return UNSAFE.getFloat(ptr);
		}

		@Override
		double memGetDouble(long ptr) {
			return UNSAFE.getDouble(ptr);
		}

		@Override
		long memGetAddress(long ptr) {
			return UNSAFE.getAddress(ptr);
		}

		@Override
		void memPutByte(long ptr, byte value) {
			UNSAFE.putByte(ptr, value);
		}

		@Override
		void memPutShort(long ptr, short value) {
			UNSAFE.putShort(ptr, value);
		}

		@Override
		void memPutInt(long ptr, int value) {
			UNSAFE.putInt(ptr, value);
		}

		@Override
		void memPutLong(long ptr, long value) {
			UNSAFE.putLong(ptr, value);
		}

		@Override
		void memPutFloat(long ptr, float value) {
			UNSAFE.putFloat(ptr, value);
		}

		@Override
		void memPutDouble(long ptr, double value) {
			UNSAFE.putDouble(ptr, value);
		}

		@Override
		void memPutAddress(long ptr, long value) {
			UNSAFE.putAddress(ptr, value);
		}

		private static sun.misc.Unsafe getUnsafeInstance() {
			java.lang.reflect.Field[] fields = sun.misc.Unsafe.class.getDeclaredFields();

			/*
			Different runtimes use different names for the Unsafe singleton,
			so we cannot use .getDeclaredField and we scan instead. For example:

			Oracle: theUnsafe
			PERC : m_unsafe_instance
			Android: THE_ONE
			*/
			for ( java.lang.reflect.Field field : fields ) {
				if ( !field.getType().equals(sun.misc.Unsafe.class) )
					continue;

				int modifiers = field.getModifiers();
				if ( !(java.lang.reflect.Modifier.isStatic(modifiers) && java.lang.reflect.Modifier.isFinal(modifiers)) )
					continue;

				field.setAccessible(true);
				try {
					return (sun.misc.Unsafe)field.get(null);
				} catch (IllegalAccessException e) {
					// ignore
				}
				break;
			}

			throw new UnsupportedOperationException();
		}
	}

	static java.lang.reflect.Field getDeclaredField(Class<?> root, String fieldName) throws NoSuchFieldException {
		Class<?> type = root;

		do {
			try {
				java.lang.reflect.Field field = type.getDeclaredField(fieldName);
				field.setAccessible(true);
				return field;
			} catch (NoSuchFieldException e) {
				type = type.getSuperclass();
			}
		} while ( type != null );

		throw new NoSuchFieldException(fieldName + " does not exist in " + root.getSimpleName() + " or any of its superclasses.");
	}

	static java.lang.reflect.Field getField(Buffer buffer, Object value) throws NoSuchFieldException {
		Class<?> type = buffer.getClass();

		do {
			for ( java.lang.reflect.Field field : type.getDeclaredFields() ) {
				if ( java.lang.reflect.Modifier.isStatic(field.getModifiers()) )
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

	static sun.reflect.FieldAccessor getFieldAccessor(java.lang.reflect.Field field) {
		try {
			java.lang.reflect.Method getFieldAccessor = java.lang.reflect.Field.class.getDeclaredMethod("getFieldAccessor", Object.class);
			getFieldAccessor.setAccessible(true);
			return (sun.reflect.FieldAccessor)getFieldAccessor.invoke(field, (Object)null);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}