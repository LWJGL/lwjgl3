/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import java.nio.*;

import static java.lang.Character.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Provides {@link MemoryAccessor} implementations. The most efficient available will be used by {@link MemoryUtil}. */
final class MemoryAccess {

	static {
		Library.initialize();
	}

	private MemoryAccess() {
	}

	static MemoryAccessor getInstance() {
		MemoryAccessor accessor;
		try {
			// Depends on sun.misc.Unsafe
			accessor = new MemoryAccessorUnsafe();
		} catch (Throwable t) {
			DEBUG_STREAM
				.println("[LWJGL] [MemoryAccessor] Unsupported JVM detected, this will likely result in low performance. Please inform LWJGL developers.");
			accessor = new MemoryAccessorJNI();
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

	/** Implementation using sun.misc.Unsafe. */
	private static final class MemoryAccessorUnsafe implements MemoryAccessor {

		private static final Class<? extends ByteBuffer>   BYTE_BUFFER;
		private static final Class<? extends ShortBuffer>  SHORT_BUFFER;
		private static final Class<? extends CharBuffer>   CHAR_BUFFER;
		private static final Class<? extends IntBuffer>    INT_BUFFER;
		private static final Class<? extends LongBuffer>   LONG_BUFFER;
		private static final Class<? extends FloatBuffer>  FLOAT_BUFFER;
		private static final Class<? extends DoubleBuffer> DOUBLE_BUFFER;

		private static final sun.misc.Unsafe UNSAFE;

		private static final long ADDRESS;
		private static final long CAPACITY;

		private static final long CLEANER;

		private static final long
			PARENT_BYTE,
			PARENT_SHORT,
			PARENT_CHAR,
			PARENT_INT,
			PARENT_LONG,
			PARENT_FLOAT,
			PARENT_DOUBLE;

		static {
			// These are all aligned instances and should only be set to naturally aligned memory addresses
			ByteBuffer bb = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
			ShortBuffer sb = bb.asShortBuffer();
			CharBuffer cb = bb.asCharBuffer();
			IntBuffer ib = bb.asIntBuffer();
			LongBuffer lb = bb.asLongBuffer();
			FloatBuffer fb = bb.asFloatBuffer();
			DoubleBuffer db = bb.asDoubleBuffer();

			BYTE_BUFFER = bb.getClass();
			SHORT_BUFFER = sb.getClass();
			CHAR_BUFFER = cb.getClass();
			INT_BUFFER = ib.getClass();
			LONG_BUFFER = lb.getClass();
			FLOAT_BUFFER = fb.getClass();
			DOUBLE_BUFFER = db.getClass();

			try {
				UNSAFE = getUnsafeInstance();

				ADDRESS = UNSAFE.objectFieldOffset(getDeclaredField(Buffer.class, "address"));
				CAPACITY = UNSAFE.objectFieldOffset(getDeclaredField(Buffer.class, "capacity"));

				CLEANER = UNSAFE.objectFieldOffset(getDeclaredField(BYTE_BUFFER, "cleaner"));

				PARENT_BYTE = UNSAFE.objectFieldOffset(getField(bb.slice(), bb));
				PARENT_SHORT = UNSAFE.objectFieldOffset(getField(sb, bb));
				PARENT_CHAR = UNSAFE.objectFieldOffset(getField(cb, bb));
				PARENT_INT = UNSAFE.objectFieldOffset(getField(ib, bb));
				PARENT_LONG = UNSAFE.objectFieldOffset(getField(lb, bb));
				PARENT_FLOAT = UNSAFE.objectFieldOffset(getField(fb, bb));
				PARENT_DOUBLE = UNSAFE.objectFieldOffset(getField(db, bb));
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
				ByteBuffer buffer = (ByteBuffer)UNSAFE.allocateInstance(BYTE_BUFFER);
				buffer.order(ByteOrder.nativeOrder());
				return memSetupBuffer(buffer, address, capacity);
			} catch (InstantiationException e) {
				throw new UnsupportedOperationException(e);
			}
		}

		@Override
		public ShortBuffer memShortBuffer(long address, int capacity) {
			try {
				return memSetupBuffer((ShortBuffer)UNSAFE.allocateInstance(SHORT_BUFFER), address, capacity);
			} catch (InstantiationException e) {
				throw new UnsupportedOperationException(e);
			}
		}

		@Override
		public CharBuffer memCharBuffer(long address, int capacity) {
			try {
				return memSetupBuffer((CharBuffer)UNSAFE.allocateInstance(CHAR_BUFFER), address, capacity);
			} catch (InstantiationException e) {
				throw new UnsupportedOperationException(e);
			}
		}

		@Override
		public IntBuffer memIntBuffer(long address, int capacity) {
			try {
				return memSetupBuffer((IntBuffer)UNSAFE.allocateInstance(INT_BUFFER), address, capacity);
			} catch (InstantiationException e) {
				throw new UnsupportedOperationException(e);
			}
		}

		@Override
		public LongBuffer memLongBuffer(long address, int capacity) {
			try {
				return memSetupBuffer((LongBuffer)UNSAFE.allocateInstance(LONG_BUFFER), address, capacity);
			} catch (InstantiationException e) {
				throw new UnsupportedOperationException(e);
			}
		}

		@Override
		public FloatBuffer memFloatBuffer(long address, int capacity) {
			try {
				return memSetupBuffer((FloatBuffer)UNSAFE.allocateInstance(FLOAT_BUFFER), address, capacity);
			} catch (InstantiationException e) {
				throw new UnsupportedOperationException(e);
			}
		}

		@Override
		public DoubleBuffer memDoubleBuffer(long address, int capacity) {
			try {
				return memSetupBuffer((DoubleBuffer)UNSAFE.allocateInstance(DOUBLE_BUFFER), address, capacity);
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
			if ( Checks.DEBUG && (UNSAFE.getObject(buffer, CLEANER)) != null )
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
			/*
			- Unsafe.setMemory is very slow.
			- A custom Java loop is fastest at small sizes, approximately up to 256 bytes.
			- The native memset becomes fastest at bigger sizes, when the JNI overhead becomes negligible.
			 */

			//UNSAFE.setMemory(dst, bytes, (byte)(value & 0xFF));
			if ( bytes < 256 )
				memSetLoop(dst, (byte)(value & 0xFF), bytes);
			else
				memset(dst, value, bytes);
		}

		private void memSetLoop(long dst, byte value, int bytes) {
			int i = 0;

			if ( 8 <= bytes ) {
				int misalignment = (int)dst & 7;
				if ( misalignment != 0 ) {
					// Align to 8 bytes
					for ( int len = 8 - misalignment; i < len; i++ )
						memPutByte(dst + i, value);
				}

				// Aligned longs for performance
				long fill = fill(value);
				do {
					memPutLong(dst + i, fill);
					i += 8;
				} while ( i <= bytes - 8 );
			}

			// Tail
			for ( ; i < bytes; i++ )
				memPutByte(dst + i, value);
		}

		private static long fill(byte value) {
			long fill = value;

			if ( value != 0 ) {
				fill += fill << 8;
				fill += fill << 16;
				fill += fill << 32;
			}

			return fill;
		}

		@Override
		public void memCopy(long src, long dst, int bytes) {
			/*
			- A custom Java loop is fastest at small sizes, approximately up to 64 bytes.
			- Unsafe.copyMemory is fastest at moderate sizes, approximately up to 384 bytes.
			- The native memcpy becomes fastest at bigger sizes, when the JNI overhead becomes negligible.
			 */

			if ( bytes < 64 && ((int)src & 7) == 0 && ((int)dst & 7) == 0 ) // both src and dst must be aligned to 8 bytes
				memCopyAligned(src, dst, bytes);
			else if ( bytes < 384 )
				UNSAFE.copyMemory(src, dst, bytes);
			else
				MemoryAccess.memcpy(dst, src, bytes);
		}

		private void memCopyAligned(long src, long dst, int bytes) {
			int i = 0;

			// Aligned longs for performance
			while ( i <= bytes - 8 ) {
				memPutLong(dst + i, memGetLong(src + i));
				i += 8;
			}

			// Tail
			for ( ; i < bytes; i++ )
				memPutByte(dst + i, memGetByte(src + i));
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