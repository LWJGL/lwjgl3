/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import java.nio.*;

import static java.lang.Character.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Provides 3 {@link MemoryAccessor} implementations. The most efficient available will be used by {@link MemoryUtil}.
 *
 * <p>Unsafe should be the most efficient implementation, even on non-Oracle VMs. In the absence of Unsafe, performance will depend on how reflection and JNI
 * are implemented. For now we'll go with what we see on the Oracle VM (that is, we'll prefer reflection over JNI).</p>
 */
final class MemoryAccess {

	static {
		Library.initialize();
	}

	private MemoryAccess() {
	}

	static MemoryAccessor getInstance() {
		MemoryAccessor accessor;
		try {
			// Depends on sun.nio.ch.DirectBuffer and sun.misc.Unsafe
			accessor = new MemoryAccessorUnsafe();
		} catch (Throwable t0) {
			try {
				// Depends on sun.nio.ch.DirectBuffer and sun.reflect.FieldAccessor
				accessor = new MemoryAccessorReflect();
			} catch (Throwable t1) {
				apiLog("[MemoryAccessor] Unsupported JVM detected, this will likely result in low performance. Please inform LWJGL developers.");
				accessor = new MemoryAccessorJNI();
			}
		}

		return accessor;
	}

	// Pointers to the explicit memory management functions used internally by LWJGL bindings

	static native long malloc();

	static native long calloc();

	static native long realloc();

	static native long free();

	static native long aligned_alloc();

	static native long aligned_free();

	// -----------

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

	// Returns the {@code sizeof(void *)}.
	static native int getPointerSize();

	// Returns the buffer memory address
	static native long getDirectBufferAddress(Buffer buffer);

	// Returns a new direct ByteBuffer instance
	static native ByteBuffer newDirectByteBuffer(long address, int capacity);

	/** Implements functionality for {@link MemoryUtil}. */
	interface MemoryAccessor {

		default int getPageSize() {
			// TODO: Can we do better?
			return 4096;
		}

		default int getCacheLineSize() {
			// TODO: Can we do better?
			return 64;
		}

		default long memAddress0(Buffer buffer) {
			return getDirectBufferAddress(buffer);
		}

		default ByteBuffer memByteBuffer(long address, int capacity) {
			return newDirectByteBuffer(address, capacity).order(ByteOrder.nativeOrder());
		}

		default ShortBuffer memShortBuffer(long address, int capacity) {
			return memByteBuffer(address, capacity << 1).asShortBuffer();
		}

		default CharBuffer memCharBuffer(long address, int capacity) {
			return memByteBuffer(address, capacity << 1).asCharBuffer();
		}

		default IntBuffer memIntBuffer(long address, int capacity) {
			return memByteBuffer(address, capacity << 2).asIntBuffer();
		}

		default LongBuffer memLongBuffer(long address, int capacity) {
			return memByteBuffer(address, capacity << 3).asLongBuffer();
		}

		default FloatBuffer memFloatBuffer(long address, int capacity) {
			return memByteBuffer(address, capacity << 2).asFloatBuffer();
		}

		default DoubleBuffer memDoubleBuffer(long address, int capacity) {
			return memByteBuffer(address, capacity << 3).asDoubleBuffer();
		}

		default ByteBuffer memSetupBuffer(ByteBuffer buffer, long address, int capacity) { return memByteBuffer(address, capacity); }

		default ShortBuffer memSetupBuffer(ShortBuffer buffer, long address, int capacity) { return memShortBuffer(address, capacity); }

		default CharBuffer memSetupBuffer(CharBuffer buffer, long address, int capacity) { return memCharBuffer(address, capacity); }

		default IntBuffer memSetupBuffer(IntBuffer buffer, long address, int capacity) { return memIntBuffer(address, capacity); }

		default LongBuffer memSetupBuffer(LongBuffer buffer, long address, int capacity) { return memLongBuffer(address, capacity); }

		default FloatBuffer memSetupBuffer(FloatBuffer buffer, long address, int capacity) { return memFloatBuffer(address, capacity); }

		default DoubleBuffer memSetupBuffer(DoubleBuffer buffer, long address, int capacity) { return memDoubleBuffer(address, capacity); }

		default void memSet(long dst, int value, int bytes) { memset(dst, value, bytes); }

		default void memCopy(long src, long dst, int bytes) {
			memcpy(dst, src, bytes); // Note the swapped src & dst
		}

		default byte memGetByte(long ptr) { return getByte(ptr); }

		default short memGetShort(long ptr) { return getShort(ptr); }

		default int memGetInt(long ptr) { return getInt(ptr); }

		default long memGetLong(long ptr) { return getLong(ptr); }

		default float memGetFloat(long ptr) { return getFloat(ptr); }

		default double memGetDouble(long ptr) { return getDouble(ptr); }

		default long memGetAddress(long ptr) { return getAddress(ptr); }

		default void memPutByte(long ptr, byte value) { putByte(ptr, value); }

		default void memPutShort(long ptr, short value) { putShort(ptr, value); }

		default void memPutInt(long ptr, int value) { putInt(ptr, value); }

		default void memPutLong(long ptr, long value) { putLong(ptr, value); }

		default void memPutFloat(long ptr, float value) { putFloat(ptr, value); }

		default void memPutDouble(long ptr, double value) { putDouble(ptr, value); }

		default void memPutAddress(long ptr, long value) { putAddress(ptr, value); }

		default MemoryTextUtil getTextUtil() {
			return new MemoryTextUtil();
		}

	}

	private static final class MemoryAccessorJNI implements MemoryAccessor {
	}

	abstract static class MemoryAccessorJava implements MemoryAccessor {

		protected static final ByteBuffer BYTE_BUFFER = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

		// These are all aligned instances and should only be set to naturally aligned memory addresses
		protected static final ShortBuffer  SHORT_BUFFER  = BYTE_BUFFER.asShortBuffer();
		protected static final CharBuffer   CHAR_BUFFER   = BYTE_BUFFER.asCharBuffer();
		protected static final IntBuffer    INT_BUFFER    = BYTE_BUFFER.asIntBuffer();
		protected static final LongBuffer   LONG_BUFFER   = BYTE_BUFFER.asLongBuffer();
		protected static final FloatBuffer  FLOAT_BUFFER  = BYTE_BUFFER.asFloatBuffer();
		protected static final DoubleBuffer DOUBLE_BUFFER = BYTE_BUFFER.asDoubleBuffer();

		@Override
		public ByteBuffer memByteBuffer(long address, int capacity) {
			return memSetupBuffer(BYTE_BUFFER.slice().order(ByteOrder.nativeOrder()), address, capacity);
		}

		@Override
		public ShortBuffer memShortBuffer(long address, int capacity) {
			return memSetupBuffer(SHORT_BUFFER.slice(), address, capacity);
		}

		@Override
		public CharBuffer memCharBuffer(long address, int capacity) {
			return memSetupBuffer(CHAR_BUFFER.slice(), address, capacity);
		}

		@Override
		public IntBuffer memIntBuffer(long address, int capacity) {
			return memSetupBuffer(INT_BUFFER.slice(), address, capacity);
		}

		@Override
		public LongBuffer memLongBuffer(long address, int capacity) {
			return memSetupBuffer(LONG_BUFFER.slice(), address, capacity);
		}

		@Override
		public FloatBuffer memFloatBuffer(long address, int capacity) {
			return memSetupBuffer(FLOAT_BUFFER.slice(), address, capacity);
		}

		@Override
		public DoubleBuffer memDoubleBuffer(long address, int capacity) {
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
		public ByteBuffer memSetupBuffer(ByteBuffer buffer, long address, int capacity) {
			// If we allowed this, the ByteBuffer's malloc'ed memory might never be freed.
			if ( Checks.DEBUG && ((sun.nio.ch.DirectBuffer)buffer).cleaner() != null )
				throw new IllegalArgumentException("Instances created through ByteBuffer.allocateDirect cannot be modified.");

			return setup(buffer, address, capacity, PARENT_BYTE);
		}

		@Override
		public ShortBuffer memSetupBuffer(ShortBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, PARENT_SHORT);
		}

		@Override
		public CharBuffer memSetupBuffer(CharBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, PARENT_CHAR);
		}

		@Override
		public IntBuffer memSetupBuffer(IntBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, PARENT_INT);
		}

		@Override
		public LongBuffer memSetupBuffer(LongBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, PARENT_LONG);
		}

		@Override
		public FloatBuffer memSetupBuffer(FloatBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, PARENT_FLOAT);
		}

		@Override
		public DoubleBuffer memSetupBuffer(DoubleBuffer buffer, long address, int capacity) {
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
		public int getPageSize() {
			return UNSAFE.pageSize();
		}

		@Override
		public long memAddress0(Buffer buffer) {
			return UNSAFE.getLong(buffer, ADDRESS);
		}

		@Override
		public ByteBuffer memByteBuffer(long address, int capacity) {
			try {
				ByteBuffer buffer = (ByteBuffer)UNSAFE.allocateInstance(BYTE_BUFFER.getClass());
				buffer.order(ByteOrder.nativeOrder());
				return memSetupBuffer(buffer, address, capacity);
			} catch (InstantiationException e) {
				throw new UnsupportedOperationException(e);
			}
		}

		@Override
		public ShortBuffer memShortBuffer(long address, int capacity) {
			try {
				return memSetupBuffer((ShortBuffer)UNSAFE.allocateInstance(SHORT_BUFFER.getClass()), address, capacity);
			} catch (InstantiationException e) {
				throw new UnsupportedOperationException(e);
			}
		}

		@Override
		public CharBuffer memCharBuffer(long address, int capacity) {
			try {
				return memSetupBuffer((CharBuffer)UNSAFE.allocateInstance(CHAR_BUFFER.getClass()), address, capacity);
			} catch (InstantiationException e) {
				throw new UnsupportedOperationException(e);
			}
		}

		@Override
		public IntBuffer memIntBuffer(long address, int capacity) {
			try {
				return memSetupBuffer((IntBuffer)UNSAFE.allocateInstance(INT_BUFFER.getClass()), address, capacity);
			} catch (InstantiationException e) {
				throw new UnsupportedOperationException(e);
			}
		}

		@Override
		public LongBuffer memLongBuffer(long address, int capacity) {
			try {
				return memSetupBuffer((LongBuffer)UNSAFE.allocateInstance(LONG_BUFFER.getClass()), address, capacity);
			} catch (InstantiationException e) {
				throw new UnsupportedOperationException(e);
			}
		}

		@Override
		public FloatBuffer memFloatBuffer(long address, int capacity) {
			try {
				return memSetupBuffer((FloatBuffer)UNSAFE.allocateInstance(FLOAT_BUFFER.getClass()), address, capacity);
			} catch (InstantiationException e) {
				throw new UnsupportedOperationException(e);
			}
		}

		@Override
		public DoubleBuffer memDoubleBuffer(long address, int capacity) {
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
			if ( Checks.DEBUG && ((sun.nio.ch.DirectBuffer)buffer).cleaner() != null )
				throw new IllegalArgumentException("Instances created through ByteBuffer.allocateDirect cannot be modified.");

			return setup(buffer, address, capacity, PARENT_BYTE);
		}

		@Override
		public ShortBuffer memSetupBuffer(ShortBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, PARENT_SHORT);
		}

		@Override
		public CharBuffer memSetupBuffer(CharBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, PARENT_CHAR);
		}

		@Override
		public IntBuffer memSetupBuffer(IntBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, PARENT_INT);
		}

		@Override
		public LongBuffer memSetupBuffer(LongBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, PARENT_LONG);
		}

		@Override
		public FloatBuffer memSetupBuffer(FloatBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, PARENT_FLOAT);
		}

		@Override
		public DoubleBuffer memSetupBuffer(DoubleBuffer buffer, long address, int capacity) {
			return setup(buffer, address, capacity, PARENT_DOUBLE);
		}

		@Override
		public void memSet(long dst, int value, int bytes) {
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
		public void memCopy(long src, long dst, int bytes) {
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
		public byte memGetByte(long ptr) {
			return UNSAFE.getByte(ptr);
		}

		@Override
		public short memGetShort(long ptr) {
			return UNSAFE.getShort(ptr);
		}

		@Override
		public int memGetInt(long ptr) {
			return UNSAFE.getInt(ptr);
		}

		@Override
		public long memGetLong(long ptr) {
			return UNSAFE.getLong(ptr);
		}

		@Override
		public float memGetFloat(long ptr) {
			return UNSAFE.getFloat(ptr);
		}

		@Override
		public double memGetDouble(long ptr) {
			return UNSAFE.getDouble(ptr);
		}

		@Override
		public long memGetAddress(long ptr) {
			return UNSAFE.getAddress(ptr);
		}

		@Override
		public void memPutByte(long ptr, byte value) {
			UNSAFE.putByte(ptr, value);
		}

		@Override
		public void memPutShort(long ptr, short value) {
			UNSAFE.putShort(ptr, value);
		}

		@Override
		public void memPutInt(long ptr, int value) {
			UNSAFE.putInt(ptr, value);
		}

		@Override
		public void memPutLong(long ptr, long value) {
			UNSAFE.putLong(ptr, value);
		}

		@Override
		public void memPutFloat(long ptr, float value) {
			UNSAFE.putFloat(ptr, value);
		}

		@Override
		public void memPutDouble(long ptr, double value) {
			UNSAFE.putDouble(ptr, value);
		}

		@Override
		public void memPutAddress(long ptr, long value) {
			UNSAFE.putAddress(ptr, value);
		}

		@Override
		public MemoryTextUtil getTextUtil() {
			// This implementation uses Unsafe to write directly to the buffer's memory. We can do this because the original code specifies that the target
			// buffer is assumed to have enough space for the encoded string. This by itself isn't very useful.

			// The benefit comes from extracting the implementation to a separate method that only receives a raw pointer. This enables inlining of the base
			// method and, in many cases, elimination of the ByteBuffer allocation via escape analysis.
			return new MemoryTextUtil() {
				@Override
				int encodeASCII(CharSequence text, boolean nullTerminated, ByteBuffer target, int offset) {
					return encodeASCII(text, nullTerminated, memAddress(target) + offset);
				}

				private int encodeASCII(CharSequence text, boolean nullTerminated, long target) {
					int p = 0, len = text.length();

					for ( ; p < len; p++ )
						memPutByte(target + p, (byte)text.charAt(p));

					if ( nullTerminated )
						memPutByte(target + p++, (byte)0);

					return p;
				}

				@Override
				int encodeUTF8(CharSequence text, boolean nullTerminated, ByteBuffer target, int offset) {
					return encodeUTF8(text, nullTerminated, memAddress(target) + offset);
				}

				private int encodeUTF8(CharSequence text, boolean nullTerminated, long target) {
					int i = 0, len = text.length(), p = 0;

					char c;

					// ASCII fast path
					while ( i < len && (c = text.charAt(i)) < 0x80 ) {
						memPutByte(target + p++, (byte)c);
						i++;
					}

					// Slow path
					while ( i < len ) {
						c = text.charAt(i++);
						if ( c < 0x80 ) {
							memPutByte(target + p++, (byte)c);
						} else {
							int cp = c;
							if ( c < 0x800 ) {
								memPutByte(target + p++, (byte)(0xC0 | cp >> 6));
							} else {
								if ( !isHighSurrogate(c) ) {
									memPutByte(target + p++, (byte)(0xE0 | cp >> 12));
								} else {
									cp = toCodePoint(c, text.charAt(i++));

									memPutByte(target + p++, (byte)(0xF0 | cp >> 18));
									memPutByte(target + p++, (byte)(0x80 | cp >> 12 & 0x3F));
								}
								memPutByte(target + p++, (byte)(0x80 | cp >> 6 & 0x3F));
							}
							memPutByte(target + p++, (byte)(0x80 | cp & 0x3F));
						}
					}

					if ( nullTerminated )
						memPutByte(target + p, (byte)0);

					return p;
				}

				@Override
				int encodeUTF16(CharSequence text, boolean nullTerminated, ByteBuffer target, int offset) {
					return encodeUTF16(text, nullTerminated, memAddress(target) + offset);
				}

				private int encodeUTF16(CharSequence text, boolean nullTerminated, long target) {
					int p = 0, len = text.length();

					for ( int i = 0; i < len; i++, p += 2 )
						memPutShort(target + p, (short)text.charAt(i));

					if ( nullTerminated ) {
						memPutShort(target + p, (short)0);
						p += 2;
					}

					return p;
				}
			};
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

	static sun.misc.Unsafe getUnsafeInstance() {
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