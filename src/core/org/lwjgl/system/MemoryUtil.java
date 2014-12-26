/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import org.lwjgl.BufferUtils;
import org.lwjgl.LWJGLUtil;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryAccess.MemoryAccessor;

import java.nio.*;
import java.nio.charset.*;

import static org.lwjgl.Pointer.*;

/**
 * This class provides functionality for managing native memory.
 * <p/>
 * All methods in this class will make use of {@link sun.misc.Unsafe} if it's available,
 * for performance. If Unsafe is not available, the fallback implementations make use
 * of reflection and, in the worst-case, JNI.
 * <p/>
 * Method names in this class are prefixed with {@code mem} to avoid ambiguities when used with static imports.
 */
public final class MemoryUtil {

	/** Alias for the null pointer address. */
	public static final long NULL = 0L;

	//private static final Charset ASCII;
	private static final Charset UTF8;
	//private static final Charset UTF16;

	private static final MemoryAccessor ACCESSOR;

	/** The memory page size, in bytes. This value is always a power-of-two. */
	public static final int PAGE_SIZE;

	static {
		LWJGLUtil.initialize();

		//ASCII = Charset.forName("ISO-8859-1");
		UTF8 = Charset.forName("UTF-8");
		//UTF16 = Charset.forName(ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN ? "UTF-16BE" : "UTF-16LE");

		ACCESSOR = MemoryAccess.getInstance();
		PAGE_SIZE = ACCESSOR.getPageSize();

		LWJGLUtil.log("MemoryUtil MemoryAccessor: " + ACCESSOR.getClass().getSimpleName());
	}

	private MemoryUtil() {
	}

	/**
	 * Returns the memory address of the specified buffer. [INTERNAL USE ONLY]
	 *
	 * @param buffer the buffer
	 *
	 * @return the memory address
	 */
	public static long memAddress0(Buffer buffer) { return ACCESSOR.getAddress(buffer); }

	/** Null-safe version of {@link #memAddress0(Buffer)}. Returns {@link #NULL} if the specified buffer is null. */
	public static long memAddress0Safe(Buffer buffer) { return buffer == null ? NULL : ACCESSOR.getAddress(buffer); }

	/** PointerBuffer version of {@link #memAddress0(Buffer)}. */
	public static long memAddress0(PointerBuffer buffer) { return ACCESSOR.getAddress(buffer.getBuffer()); }

	/** PointerBuffer version of {@link #memAddress0Safe(Buffer)}. */
	public static long memAddress0Safe(PointerBuffer buffer) { return buffer == null ? NULL : ACCESSOR.getAddress(buffer.getBuffer()); }

	// --- [ Buffer address utilities ] ---

	/**
	 * Returns the memory address at the current position of the specified buffer. This is effectively a pointer value that can be used in native function
	 * calls.
	 * <p/>
	 * <b>WARNING</b>: Direct use of pointer values is inherently unsafe. In addition to the dangers of pointer arithmetic, the user must also ensure that the
	 * memory backing the specified buffer is not deallocated before the returned address is used. For example, this code may lead to a crash:
	 * <pre><code>
	 * nativeFunction(memAddress(memEncodeASCII("test"));</code></pre>
	 * because a GC execution between <code>memAddress</code> and <code>nativeFunction</code> might deallocate the ByteBuffer returned by
	 * <code>memEncodeASCII</code>. On the other hand, this code is safe on current JVMs:
	 * <pre><code>
	 * ByteBuffer encoded = memEncodeASCII("test");
	 * nativeFunction(memAddress(encoded));</code><pre>
	 *
	 * @param buffer the buffer
	 *
	 * @return the memory address
	 */
	public static long memAddress(ByteBuffer buffer) { return memAddress(buffer, buffer.position()); }

	/**
	 * Returns the memory address at the specified position of the specified buffer.
	 *
	 * @param buffer   the buffer
	 * @param position the buffer position
	 *
	 * @return the memory address
	 *
	 * @see #memAddress(ByteBuffer)
	 */
	public static long memAddress(ByteBuffer buffer, int position) { return memAddress0(buffer) + position; }

	/** ShortBuffer version of {@link #memAddress(ByteBuffer)}. */
	public static long memAddress(ShortBuffer buffer) { return memAddress(buffer, buffer.position()); }

	/** ShortBuffer version of {@link #memAddress(ByteBuffer, int)}. */
	public static long memAddress(ShortBuffer buffer, int position) { return memAddress0(buffer) + (position << 1); }

	/** CharBuffer version of {@link #memAddress(ByteBuffer)}. */
	public static long memAddress(CharBuffer buffer) { return memAddress(buffer, buffer.position()); }

	/** CharBuffer version of {@link #memAddress(ByteBuffer, int)}. */
	public static long memAddress(CharBuffer buffer, int position) { return memAddress0(buffer) + (position << 1); }

	/** IntBuffer version of {@link #memAddress(ByteBuffer)}. */
	public static long memAddress(IntBuffer buffer) { return memAddress(buffer, buffer.position()); }

	/** IntBuffer version of {@link #memAddress(ByteBuffer, int)}. */
	public static long memAddress(IntBuffer buffer, int position) { return memAddress0(buffer) + (position << 2); }

	/** FloatBuffer version of {@link #memAddress(ByteBuffer)}. */
	public static long memAddress(FloatBuffer buffer) { return memAddress(buffer, buffer.position()); }

	/** FloatBuffer version of {@link #memAddress(ByteBuffer, int)}. */
	public static long memAddress(FloatBuffer buffer, int position) { return memAddress0(buffer) + (position << 2); }

	/** LongBuffer version of {@link #memAddress(ByteBuffer)}. */
	public static long memAddress(LongBuffer buffer) { return memAddress(buffer, buffer.position()); }

	/** LongBuffer version of {@link #memAddress(ByteBuffer, int)}. */
	public static long memAddress(LongBuffer buffer, int position) { return memAddress0(buffer) + (position << 3); }

	/** DoubleBuffer version of {@link #memAddress(ByteBuffer)}. */
	public static long memAddress(DoubleBuffer buffer) { return memAddress(buffer, buffer.position()); }

	/** DoubleBuffer version of {@link #memAddress(ByteBuffer, int)}. */
	public static long memAddress(DoubleBuffer buffer, int position) { return memAddress0(buffer) + (position << 3); }

	/** PointerBuffer version of {@link #memAddress(ByteBuffer)}. */
	public static long memAddress(PointerBuffer buffer) { return memAddress(buffer, buffer.position()); }

	/** PointerBuffer version of {@link #memAddress(ByteBuffer, int)}. */
	public static long memAddress(PointerBuffer buffer, int position) { return memAddress0(buffer) + (position * POINTER_SIZE); }

	// --- [ Buffer address utilities - Safe ] ---

	/** Null-safe version of {@link #memAddress(ByteBuffer)}. Returns {@link #NULL} if the specified buffer is null. */
	public static long memAddressSafe(ByteBuffer buffer) { return buffer == null ? NULL : memAddress(buffer); }

	/** Null-safe version of {@link #memAddress(ByteBuffer, int)}. Returns {@link #NULL} if the specified buffer is null. */
	public static long memAddressSafe(ByteBuffer buffer, int position) { return buffer == null ? NULL : memAddress(buffer, position); }

	/** ShortBuffer version of {@link #memAddressSafe(ByteBuffer)}. */
	public static long memAddressSafe(ShortBuffer buffer) { return buffer == null ? NULL : memAddress(buffer); }

	/** ShortBuffer version of {@link #memAddressSafe(ByteBuffer, int)}. */
	public static long memAddressSafe(ShortBuffer buffer, int position) { return buffer == null ? NULL : memAddress(buffer, position); }

	/** CharBuffer version of {@link #memAddressSafe(ByteBuffer)}. */
	public static long memAddressSafe(CharBuffer buffer) { return buffer == null ? NULL : memAddress(buffer); }

	/** CharBuffer version of {@link #memAddressSafe(ByteBuffer, int)}. */
	public static long memAddressSafe(CharBuffer buffer, int position) { return buffer == null ? NULL : memAddress(buffer, position); }

	/** IntBuffer version of {@link #memAddressSafe(ByteBuffer)}. */
	public static long memAddressSafe(IntBuffer buffer) { return buffer == null ? NULL : memAddress(buffer); }

	/** IntBuffer version of {@link #memAddressSafe(ByteBuffer, int)}. */
	public static long memAddressSafe(IntBuffer buffer, int position) { return buffer == null ? NULL : memAddress(buffer, position); }

	/** FloatBuffer version of {@link #memAddressSafe(ByteBuffer)}. */
	public static long memAddressSafe(FloatBuffer buffer) { return buffer == null ? NULL : memAddress(buffer); }

	/** FloatBuffer version of {@link #memAddressSafe(ByteBuffer, int)}. */
	public static long memAddressSafe(FloatBuffer buffer, int position) { return buffer == null ? NULL : memAddress(buffer, position); }

	/** LongBuffer version of {@link #memAddressSafe(ByteBuffer)}. */
	public static long memAddressSafe(LongBuffer buffer) { return buffer == null ? NULL : memAddress(buffer); }

	/** LongBuffer version of {@link #memAddressSafe(ByteBuffer, int)}. */
	public static long memAddressSafe(LongBuffer buffer, int position) { return buffer == null ? NULL : memAddress(buffer, position); }

	/** DoubleBuffer version of {@link #memAddressSafe(ByteBuffer)}. */
	public static long memAddressSafe(DoubleBuffer buffer) { return buffer == null ? NULL : memAddress(buffer); }

	/** DoubleBuffer version of {@link #memAddressSafe(ByteBuffer, int)}. */
	public static long memAddressSafe(DoubleBuffer buffer, int position) { return buffer == null ? NULL : memAddress(buffer, position); }

	/** PointerBuffer version of {@link #memAddressSafe(ByteBuffer)}. */
	public static long memAddressSafe(PointerBuffer buffer) { return buffer == null ? NULL : memAddress(buffer); }

	/** PointerBuffer version of {@link #memAddressSafe(ByteBuffer, int)}. */
	public static long memAddressSafe(PointerBuffer buffer, int position) { return buffer == null ? NULL : memAddress(buffer, position); }

	// --- [ Buffer allocation utilities ] ---

	/**
	 * Creates a new direct ByteBuffer that starts at the specified memory
	 * address and has the specified capacity. The returned ByteBuffer instance
	 * will be set to the native ByteOrder.
	 *
	 * @param address  the starting memory address
	 * @param capacity the buffer capacity
	 *
	 * @return the new ByteBuffer
	 */
	public static ByteBuffer memByteBuffer(long address, int capacity) {
		if ( LWJGLUtil.DEBUG && (address == NULL || capacity < 0) )
			throw new IllegalArgumentException();

		return ACCESSOR.newByteBuffer(address, capacity);
	}

	/**
	 * Overloads {@link #memByteBuffer(long, int)} with a long capacity parameter. This
	 * is used by the auto-generated code, for simplicity.
	 *
	 * @param address  the starting memory address
	 * @param capacity the buffer capacity. Will be cast to an integer.
	 *
	 * @return the new ByteBuffer
	 */
	public static ByteBuffer memByteBuffer(long address, long capacity) {
		return memByteBuffer(address, (int)capacity);
	}

	/**
	 * Creates a new direct ByteBuffer that starts at the specified memory
	 * address and has capacity equal to the null-terminated string
	 * starting at that address. A single \0 character will terminate
	 * the string. The returned buffer will NOT include the \0 byte.
	 * <p/>
	 * This method is useful for reading ASCII and UTF8 encoded text.
	 *
	 * @param address the starting memory address
	 *
	 * @return the new ByteBuffer
	 */
	public static ByteBuffer memByteBufferNT1(long address) {
		if ( address == NULL )
			return null;

		ByteBuffer infPointer = ACCESSOR.newByteBuffer(address, Integer.MAX_VALUE);

		return memSetupBuffer(infPointer, address, memStrLen1(infPointer, 0));
	}

	/**
	 * Creates a new direct ByteBuffer that starts at the specified memory
	 * address and has capacity equal to the null-terminated string
	 * starting at that address. Two \0 characters will terminate
	 * the string. The returned buffer will NOT include the \0 bytes.
	 * <p/>
	 * This method is useful for reading UTF16 encoded text.
	 *
	 * @param address the starting memory address
	 *
	 * @return the new ByteBuffer
	 */
	public static ByteBuffer memByteBufferNT2(long address) {
		if ( address == NULL )
			return null;

		ByteBuffer infPointer = ACCESSOR.newByteBuffer(address, Integer.MAX_VALUE);

		return memSetupBuffer(infPointer, address, memStrLen2(infPointer, 0));
	}

	/**
	 * Creates a new direct ShortBuffer that starts at the specified memory address and has the specified capacity.
	 *
	 * @param address  the starting memory address
	 * @param capacity the buffer capacity
	 *
	 * @return the new ShortBuffer
	 */
	public static ShortBuffer memShortBuffer(long address, int capacity) {
		if ( LWJGLUtil.DEBUG && (address == NULL || capacity < 0) )
			throw new IllegalArgumentException();

		return ACCESSOR.newShortBuffer(address, capacity);
	}

	/**
	 * Creates a new direct CharBuffer that starts at the specified memory address and has the specified capacity.
	 *
	 * @param address  the starting memory address
	 * @param capacity the buffer capacity
	 *
	 * @return the new CharBuffer
	 */
	public static CharBuffer memCharBuffer(long address, int capacity) {
		if ( LWJGLUtil.DEBUG && (address == NULL || capacity < 0) )
			throw new IllegalArgumentException();

		return ACCESSOR.newCharBuffer(address, capacity);
	}

	/**
	 * Creates a new direct IntBuffer that starts at the specified memory address and has the specified capacity.
	 *
	 * @param address  the starting memory address
	 * @param capacity the buffer capacity
	 *
	 * @return the new IntBuffer
	 */
	public static IntBuffer memIntBuffer(long address, int capacity) {
		if ( LWJGLUtil.DEBUG && (address == NULL || capacity < 0) )
			throw new IllegalArgumentException();

		return ACCESSOR.newIntBuffer(address, capacity);
	}

	/**
	 * Creates a new direct LongBuffer that starts at the specified memory address and has the specified capacity.
	 *
	 * @param address  the starting memory address
	 * @param capacity the buffer capacity
	 *
	 * @return the new LongBuffer
	 */
	public static LongBuffer memLongBuffer(long address, int capacity) {
		if ( LWJGLUtil.DEBUG && (address == NULL || capacity < 0) )
			throw new IllegalArgumentException();

		return ACCESSOR.newLongBuffer(address, capacity);
	}

	/**
	 * Creates a new direct FloatBuffer that starts at the specified memory address and has the specified capacity.
	 *
	 * @param address  the starting memory address
	 * @param capacity the buffer capacity
	 *
	 * @return the new FloatBuffer
	 */
	public static FloatBuffer memFloatBuffer(long address, int capacity) {
		if ( LWJGLUtil.DEBUG && (address == NULL || capacity < 0) )
			throw new IllegalArgumentException();

		return ACCESSOR.newFloatBuffer(address, capacity);
	}

	/**
	 * Creates a new direct DoubleBuffer that starts at the specified memory address and has the specified capacity.
	 *
	 * @param address  the starting memory address
	 * @param capacity the buffer capacity
	 *
	 * @return the new DoubleBuffer
	 */
	public static DoubleBuffer memDoubleBuffer(long address, int capacity) {
		if ( LWJGLUtil.DEBUG && (address == NULL || capacity < 0) )
			throw new IllegalArgumentException();

		return ACCESSOR.newDoubleBuffer(address, capacity);
	}

	/**
	 * Creates a new PointerBuffer that starts at the specified memory address and has the specified capacity.
	 *
	 * @param address  the starting memory address
	 * @param capacity the buffer capacity
	 *
	 * @return the new PointerBuffer
	 */
	public static PointerBuffer memPointerBuffer(long address, int capacity) {
		return new PointerBuffer(address, capacity);
	}

	/**
	 * This method is an alternative to {@link #memByteBuffer} that allows the reuse of an existing direct ByteBuffer instance.
	 * It modifies that instance so that it starts at the specified memory address and has the specified capacity. The instance passed
	 * to this method should not own native memory, i.e. it should not be an instance created using {@link ByteBuffer#allocateDirect}.
	 * Using such an instance will cause an exception to be thrown. Other instances are allowed and their parent reference will be
	 * cleared before this method returns.
	 * <p/>
	 * ByteBuffer instance modification might not be possible. In that case this method behaves exactly like {@link #memByteBuffer},
	 * so the returned instance should always replace the input one.
	 *
	 * @param buffer   the ByteBuffer to modify
	 * @param address  the starting memory address
	 * @param capacity the buffer capacity
	 *
	 * @return the modified ByteBuffer
	 */
	public static ByteBuffer memSetupBuffer(ByteBuffer buffer, long address, int capacity) {
		if ( LWJGLUtil.DEBUG && (address == NULL || capacity < 0) )
			throw new IllegalArgumentException();

		return ACCESSOR.setupBuffer(buffer, address, capacity);
	}

	/** ShortBuffer version of: {@link #memSetupBuffer(java.nio.ByteBuffer, long, int)} */
	public static ShortBuffer memSetupBuffer(ShortBuffer buffer, long address, int capacity) {
		if ( LWJGLUtil.DEBUG && (address == NULL || capacity < 0) )
			throw new IllegalArgumentException();

		return ACCESSOR.setupBuffer(buffer, address, capacity);
	}

	/** CharBuffer version of: {@link #memSetupBuffer(java.nio.ByteBuffer, long, int)} */
	public static CharBuffer memSetupBuffer(CharBuffer buffer, long address, int capacity) {
		if ( LWJGLUtil.DEBUG && (address == NULL || capacity < 0) )
			throw new IllegalArgumentException();

		return ACCESSOR.setupBuffer(buffer, address, capacity);
	}

	/** IntBuffer version of: {@link #memSetupBuffer(java.nio.ByteBuffer, long, int)} */
	public static IntBuffer memSetupBuffer(IntBuffer buffer, long address, int capacity) {
		if ( LWJGLUtil.DEBUG && (address == NULL || capacity < 0) )
			throw new IllegalArgumentException();

		return ACCESSOR.setupBuffer(buffer, address, capacity);
	}

	/** LongBuffer version of: {@link #memSetupBuffer(java.nio.ByteBuffer, long, int)} */
	public static LongBuffer memSetupBuffer(LongBuffer buffer, long address, int capacity) {
		if ( LWJGLUtil.DEBUG && (address == NULL || capacity < 0) )
			throw new IllegalArgumentException();

		return ACCESSOR.setupBuffer(buffer, address, capacity);
	}

	/** FloatBuffer version of: {@link #memSetupBuffer(java.nio.ByteBuffer, long, int)} */
	public static FloatBuffer memSetupBuffer(FloatBuffer buffer, long address, int capacity) {
		if ( LWJGLUtil.DEBUG && (address == NULL || capacity < 0) )
			throw new IllegalArgumentException();

		return ACCESSOR.setupBuffer(buffer, address, capacity);
	}

	/** DoubleBuffer version of: {@link #memSetupBuffer(java.nio.ByteBuffer, long, int)} */
	public static DoubleBuffer memSetupBuffer(DoubleBuffer buffer, long address, int capacity) {
		if ( LWJGLUtil.DEBUG && (address == NULL || capacity < 0) )
			throw new IllegalArgumentException();

		return ACCESSOR.setupBuffer(buffer, address, capacity);
	}

	// --- [ Direct memory access ] ---

	/**
	 * Sets all bytes in a specified block of memory to a fixed value (usually zero).
	 *
	 * @param ptr   the starting memory address
	 * @param value the value to set (memSet will convert it to unsigned byte)
	 * @param bytes the number of bytes to set
	 */
	public static void memSet(long ptr, int value, int bytes) {
		if ( LWJGLUtil.DEBUG && ptr == NULL )
			throw new IllegalArgumentException();

		ACCESSOR.memSet(ptr, value, bytes);
	}

	/**
	 * Sets all bytes in a specified block of memory to a copy of another block.
	 *
	 * @param src   the source memory address
	 * @param dst   the destination memory address
	 * @param bytes the number of bytes to copy
	 */
	public static void memCopy(long src, long dst, int bytes) {
		if ( LWJGLUtil.DEBUG && (src == NULL || dst == NULL || bytes < 0) )
			throw new IllegalArgumentException();

		ACCESSOR.memCopy(src, dst, bytes);
	}

	public static byte memGetByte(long ptr) {
		return ACCESSOR.memGetByte(ptr);
	}

	public static short memGetShort(long ptr) {
		return ACCESSOR.memGetShort(ptr);
	}

	public static int memGetInt(long ptr) {
		return ACCESSOR.memGetInt(ptr);
	}

	public static long memGetLong(long ptr) {
		return ACCESSOR.memGetLong(ptr);
	}

	public static float memGetFloat(long ptr) {
		return ACCESSOR.memGetFloat(ptr);
	}

	public static double memGetDouble(long ptr) {
		return ACCESSOR.memGetDouble(ptr);
	}

	public static long memGetAddress(long ptr) {
		return ACCESSOR.memGetAddress(ptr);
	}

	public static void memPutByte(long ptr, byte value) {
		ACCESSOR.memPutByte(ptr, value);
	}

	public static void memPutShort(long ptr, short value) {
		ACCESSOR.memPutShort(ptr, value);
	}

	public static void memPutInt(long ptr, int value) {
		ACCESSOR.memPutInt(ptr, value);
	}

	public static void memPutLong(long ptr, long value) {
		ACCESSOR.memPutLong(ptr, value);
	}

	public static void memPutFloat(long ptr, float value) {
		ACCESSOR.memPutFloat(ptr, value);
	}

	public static void memPutDouble(long ptr, double value) {
		ACCESSOR.memPutDouble(ptr, value);
	}

	public static void memPutAddress(long ptr, long value) {
		ACCESSOR.memPutAddress(ptr, value);
	}

	// --- [ JNI utilities ] ---

	/**
	 * Returns the pointer size in bytes for the process that loaded LWJGL.
	 * <p/>
	 * This call is expensive, use {@link org.lwjgl.Pointer#POINTER_SIZE} instead.
	 *
	 * @return the process pointer size in bytes.
	 */
	public static native int memPointerSize();

	/**
	 * Returns the object that the specified global reference points to.
	 *
	 * @param globalRef the global reference
	 * @param <T>       the object type
	 *
	 * @return the object pointed to by {@code globalRef}
	 */
	public static native <T> T memGlobalRefToObject(long globalRef);

	/**
	 * Creates a new global reference to the specified object. This method is a simpler wrapper over the JNI {@code NewGlobalRef} function.
	 *
	 * @param obj the object
	 *
	 * @return the global reference memory address
	 */
	public static native long memNewGlobalRef(Object obj);

	/**
	 * Deletes a global reference. This method is a simpler wrapper over the JNI {@code DeleteGlobalRef} function.
	 *
	 * @param globalRef the memory address of the global reference to delete
	 */
	public static native void memDeleteGlobalRef(long globalRef);

	/**
	 * Creates a new weak global reference to the specified object. This method is a simpler wrapper over the JNI {@code NewWeakGlobalRef} function.
	 *
	 * @param obj the object
	 *
	 * @return the weak global reference memory address
	 */
	public static native long memNewWeakGlobalRef(Object obj);

	/**
	 * Deletes a weak global reference. This method is a simpler wrapper over the JNI {@code DeleteWeakGlobalRef} function.
	 *
	 * @param globalRef the memory address of the weak global reference to delete
	 */
	public static native void memDeleteWeakGlobalRef(long globalRef);

	// The standard C memset function
	static native void nMemSet(long ptr, int value, long bytes);

	// The standard C memcpy function
	static native void nMemCopy(long dst, long src, long bytes);

	// Primitive getters

	static native byte nMemGetByte(long ptr);

	static native short nMemGetShort(long ptr);

	static native int nMemGetInt(long ptr);

	static native long nMemGetLong(long ptr);

	static native float nMemGetFloat(long ptr);

	static native double nMemGetDouble(long ptr);

	static native long nMemGetAddress(long ptr);

	// Primitive setters

	static native void nMemPutByte(long ptr, byte value);

	static native void nMemPutShort(long ptr, short value);

	static native void nMemPutInt(long ptr, int value);

	static native void nMemPutLong(long ptr, long value);

	static native void nMemPutFloat(long ptr, float value);

	static native void nMemPutDouble(long ptr, double value);

	static native void nMemPutAddress(long ptr, long value);

	// Returns the buffer memory address
	static native long nGetAddress(Buffer buffer);

	// Returns a new direct ByteBuffer instance
	static native ByteBuffer nNewBuffer(long address, int capacity);

	// --- [ String utilities ] ---

	/**
	 * Returns a ByteBuffer containing the specified text ASCII encoded and null-terminated.
	 * If text is null, null is returned.
	 *
	 * @param text the text to encode
	 *
	 * @return the encoded text or null
	 */
	public static ByteBuffer memEncodeASCII(CharSequence text) {
		return memEncodeASCII(text, true);
	}

	/**
	 * Returns a ByteBuffer containing the specified text ASCII encoded and optionally null-terminated.
	 * If text is null, null is returned.
	 *
	 * @param text           the text to encode
	 * @param nullTerminated if true, the text will be terminated with a '\0'.
	 *
	 * @return the encoded text or null
	 */
	public static ByteBuffer memEncodeASCII(CharSequence text, boolean nullTerminated) {
		if ( text == null )
			return null;

		ByteBuffer buffer = BufferUtils.createByteBuffer(text.length() + (nullTerminated ? 1 : 0));

		for ( int i = 0; i < text.length(); i++ )
			buffer.put(i, (byte)text.charAt(i));

		if ( nullTerminated )
			buffer.put(text.length(), (byte)0);

		return buffer;
	}

	/**
	 * Returns a ByteBuffer containing the specified text UTF-8 encoded and null-terminated.
	 * If text is null, null is returned.
	 *
	 * @param text the text to encode
	 *
	 * @return the encoded text or null
	 */
	public static ByteBuffer memEncodeUTF8(CharSequence text) {
		return memEncodeUTF8(text, true);
	}

	/**
	 * Returns a ByteBuffer containing the specified text UTF-8 encoded and optionally null-terminated.
	 * If text is null, null is returned.
	 *
	 * @param text           the text to encode
	 * @param nullTerminated if true, the text will be terminated with a '\0'.
	 *
	 * @return the encoded text or null
	 */
	public static ByteBuffer memEncodeUTF8(CharSequence text, boolean nullTerminated) {
		return memEncode(text, UTF8, nullTerminated);
	}

	/**
	 * Returns a ByteBuffer containing the specified text UTF-16 encoded and null-terminated.
	 * If text is null, null is returned.
	 *
	 * @param text the text to encode
	 *
	 * @return the encoded text
	 */
	public static ByteBuffer memEncodeUTF16(CharSequence text) {
		return memEncodeUTF16(text, true);
	}

	/**
	 * Returns a ByteBuffer containing the specified text UTF-16 encoded and optionally null-terminated.
	 * If text is null, null is returned.
	 *
	 * @param text           the text to encode
	 * @param nullTerminated if true, the text will be terminated with a '\0'.
	 *
	 * @return the encoded text
	 */
	public static ByteBuffer memEncodeUTF16(CharSequence text, boolean nullTerminated) {
		if ( text == null )
			return null;

		ByteBuffer buffer = BufferUtils.createByteBuffer((text.length() + (nullTerminated ? 1 : 0)) << 1);

		memEncodeUTF16(text, nullTerminated, buffer);

		return buffer;
	}

	/**
	 * Encodes and optionally null-terminates the specified text using UTF-16 encoding. The encoded text is stored in the specified {@link ByteBuffer}. The
	 * {@code target} buffer is assumed to have enough remaining space to store the encoded text.
	 *
	 * @param text           the text to encode
	 * @param nullTerminated if true, the text will be terminated with a '\0'.
	 * @param target         the buffer in which to store the encoded text
	 */
	public static void memEncodeUTF16(CharSequence text, boolean nullTerminated, ByteBuffer target) {
		for ( int i = 0; i < text.length(); i++ )
			target.putChar(i << 1, text.charAt(i));

		if ( nullTerminated )
			target.putChar(target.capacity() - 2, '\0');
	}

	/**
	 * Wraps the specified text in a CharBuffer and encodes it using the specified Charset and null-terminated.
	 *
	 * @param text    the text to encode
	 * @param charset the charset to use for encoding
	 *
	 * @return the encoded text
	 */
	public static ByteBuffer memEncode(CharSequence text, Charset charset) {
		return memEncode(text, charset, true);
	}

	/**
	 * Wraps the specified text in an optionally null-terminated CharBuffer and encodes it using the specified Charset.
	 *
	 * @param text           the text to encode
	 * @param charset        the charset to use for encoding
	 * @param nullTerminated if true, the text will be terminated with a '\0'.
	 *
	 * @return the encoded text
	 */
	public static ByteBuffer memEncode(CharSequence text, Charset charset, boolean nullTerminated) {
		if ( text == null )
			return null;

		return encode(CharBuffer.wrap(nullTerminated ? new CharSequenceNT(text) : text), charset);
	}

	/**
	 * A {@link java.nio.charset.CharsetEncoder#encode(java.nio.CharBuffer)} implementation that uses {@link org.lwjgl.BufferUtils#createByteBuffer(int)}
	 * instead of {@link java.nio.ByteBuffer#allocate(int)}.
	 *
	 * @see java.nio.charset.CharsetEncoder#encode(java.nio.CharBuffer)
	 */
	private static ByteBuffer encode(CharBuffer in, Charset charset) {
		CharsetEncoder encoder = charset.newEncoder(); // encoders are not thread-safe, create a new one on every call

		int n = (int)(in.remaining() * encoder.averageBytesPerChar());
		ByteBuffer out = BufferUtils.createByteBuffer(n);

		if ( n == 0 && in.remaining() == 0 )
			return out;

		encoder.reset();
		while ( true ) {
			CoderResult cr = in.hasRemaining() ? encoder.encode(in, out, true) : CoderResult.UNDERFLOW;
			if ( cr.isUnderflow() )
				cr = encoder.flush(out);

			if ( cr.isUnderflow() )
				break;

			if ( cr.isOverflow() ) {
				n = 2 * n + 1;    // Ensure progress; n might be 0!
				ByteBuffer o = BufferUtils.createByteBuffer(n);
				out.flip();
				o.put(out);
				out = o;
				continue;
			}

			try {
				cr.throwException();
			} catch (CharacterCodingException e) {
				throw new RuntimeException(e);
			}
		}
		out.flip();
		return out;
	}

	/**
	 * Calculates the length of the null-terminated string in {@code buffer} that starts at the current {@code buffer} position. The null-terminator is assumed
	 * to be a single {@code \0} character.
	 *
	 * @param buffer the {@link ByteBuffer} that contains the string
	 *
	 * @return the string length, <strong>in bytes</strong>
	 */
	public static int memStrLen1(ByteBuffer buffer) {
		return memStrLen1(buffer, buffer.position());
	}

	/**
	 * Calculates the length of the null-terminated string in {@code buffer} that starts at index {@code from}. The null-terminator is assumed to be a single
	 * {@code \0} character.
	 *
	 * @param buffer the {@link ByteBuffer} that contains the string
	 * @param from   the index at which to start the search
	 *
	 * @return the string length, <strong>in bytes</strong>
	 */
	public static int memStrLen1(ByteBuffer buffer, int from) {
		int to = from;
		while ( to < buffer.remaining() ) {
			if ( buffer.get(to) == 0 )
				break;
			to++;
		}
		return to - from;
	}

	/**
	 * Calculates the length of the null-terminated string in {@code buffer} that starts at the current {@code buffer} position. The null-terminator is assumed
	 * to be 2 consecutive {@code \0} characters.
	 *
	 * @param buffer the {@link ByteBuffer} that contains the string
	 *
	 * @return the string length, <strong>in bytes</strong>
	 */
	public static int memStrLen2(ByteBuffer buffer) {
		return memStrLen2(buffer, buffer.position());
	}

	/**
	 * Calculates the length of the null-terminated string in {@code buffer} that starts at index {@code from}. The null-terminator is assumed to be 2
	 * consecutive {@code \0} characters.
	 *
	 * @param buffer the {@link ByteBuffer} that contains the string
	 * @param from   the index at which to start the search
	 *
	 * @return the string length, <strong>in bytes</strong>
	 */
	public static int memStrLen2(ByteBuffer buffer, int from) {
		int to = from;
		while ( to < buffer.remaining() ) {
			if ( buffer.getChar(to) == 0 )
				break;
			to += 2;
		}
		return to - from;
	}

	/**
	 * Converts the null-terminated ASCII encoded string at the specified memory address to a {@link String}.
	 *
	 * @param address the string memory address
	 *
	 * @return the decode {@link String} or null if the specified {@code address} is null
	 */
	public static String memDecodeASCII(long address) {
		return memDecodeASCII(memByteBufferNT1(address));
	}

	/**
	 * Decodes the bytes with index {@code [position(), position()+remaining()}) in {@code buffer}, as an ASCII string.
	 * <p/>
	 * The current {@code position} and {@code limit} of the specified {@code buffer} are not affected by this operation.
	 *
	 * @param buffer the {@link ByteBuffer} to decode, or null
	 *
	 * @return the decoded {@link String} or null if the specified {@code buffer} is null
	 */
	public static String memDecodeASCII(ByteBuffer buffer) {
		if ( buffer == null )
			return null;

		return memDecodeASCII(buffer, buffer.remaining());
	}

	/**
	 * Decodes the bytes with index {@code [position(), position()+length}) in {@code buffer}, as an ASCII string.
	 * <p/>
	 * The current {@code position} and {@code limit} of the specified {@code buffer} are not affected by this operation.
	 *
	 * @param buffer the {@link ByteBuffer} to decode
	 * @param length the number of bytes to decode
	 *
	 * @return the decoded {@link String}
	 */
	public static String memDecodeASCII(ByteBuffer buffer, int length) {
		return memDecodeASCII(buffer, length, buffer.position());
	}

	/**
	 * Decodes the bytes with index {@code [offset, offset+length}) in {@code buffer}, as an ASCII string.
	 * <p/>
	 * The current {@code position} and {@code limit} of the specified {@code buffer} are not affected by this operation.
	 *
	 * @param buffer the {@link ByteBuffer} to decode
	 * @param length the number of bytes to decode
	 * @param offset the offset at which to start decoding.
	 *
	 * @return the decoded {@link String}
	 */
	public static String memDecodeASCII(ByteBuffer buffer, int length, int offset) {
		char[] chars = new char[length];

		for ( int i = 0; i < length; i++ )
			chars[i] = (char)buffer.get(offset + i);

		return new String(chars);
	}

	/**
	 * Converts the null-terminated UTF-8 encoded string at the specified memory address to a {@link String}.
	 *
	 * @param address the string memory address
	 *
	 * @return the decode {@link String} or null if the specified {@code address} is null
	 */
	public static String memDecodeUTF8(long address) {
		return memDecodeUTF8(memByteBufferNT1(address));
	}

	/**
	 * Decodes the bytes with index {@code [position(), position()+remaining()}) in {@code buffer}, as a UTF-8 string.
	 * <p/>
	 * The current {@code position} and {@code limit} of the specified {@code buffer} are not affected by this operation.
	 *
	 * @param buffer the {@link ByteBuffer} to decode, or null
	 *
	 * @return the decoded {@link String} or null if the specified {@code buffer} is null
	 */
	public static String memDecodeUTF8(ByteBuffer buffer) {
		return memDecode(buffer, UTF8);
	}

	/**
	 * Decodes the bytes with index {@code [position(), position()+length}) in {@code buffer}, as a UTF-8 string.
	 * <p/>
	 * The current {@code position} and {@code limit} of the specified {@code buffer} are not affected by this operation.
	 *
	 * @param buffer the {@link ByteBuffer} to decode
	 * @param length the number of bytes to decode
	 *
	 * @return the decoded {@link String}
	 */
	public static String memDecodeUTF8(ByteBuffer buffer, int length) {
		return memDecode(buffer, UTF8, length);
	}

	/**
	 * Decodes the bytes with index {@code [offset, offset+length}) in {@code buffer}, as a UTF-8 string.
	 * <p/>
	 * The current {@code position} and {@code limit} of the specified {@code buffer} are not affected by this operation.
	 *
	 * @param buffer the {@link ByteBuffer} to decode
	 * @param length the number of bytes to decode
	 * @param offset the offset at which to start decoding.
	 *
	 * @return the decoded {@link String}
	 */
	public static String memDecodeUTF8(ByteBuffer buffer, int length, int offset) {
		return memDecode(buffer, UTF8, length, offset);
	}

	/**
	 * Converts the null-terminated UTF-16 encoded string at the specified memory address to a {@link String}.
	 *
	 * @param address the string memory address
	 *
	 * @return the decode {@link String} or null if the specified {@code address} is null
	 */
	public static String memDecodeUTF16(long address) {
		return memDecodeUTF16(memByteBufferNT2(address));
	}

	/**
	 * Decodes the bytes with index {@code [position(), position()+remaining()}) in {@code buffer}, as a UTF-16 string.
	 * <p/>
	 * The current {@code position} and {@code limit} of the specified {@code buffer} are not affected by this operation.
	 *
	 * @param buffer the {@link ByteBuffer} to decode, or null
	 *
	 * @return the decoded {@link String} or null if the specified {@code } is null
	 */
	public static String memDecodeUTF16(ByteBuffer buffer) {
		if ( buffer == null )
			return null;

		return memDecodeUTF16(buffer, buffer.remaining());
	}

	/**
	 * Decodes the bytes with index {@code [position(), position()+length}) in {@code buffer}, as a UTF-16 string.
	 * <p/>
	 * The current {@code position} and {@code limit} of the specified {@code buffer} are not affected by this operation.
	 *
	 * @param buffer the {@link ByteBuffer} to decode
	 * @param length the number of bytes to decode
	 *
	 * @return the decoded {@link String}
	 */
	public static String memDecodeUTF16(ByteBuffer buffer, int length) {
		return memDecodeUTF16(buffer, length, buffer.position());
	}

	/**
	 * Decodes the bytes with index {@code [offset, offset+length}) in {@code buffer}, as a UTF-16 string.
	 * <p/>
	 * The current {@code position} and {@code limit} of the specified {@code buffer} are not affected by this operation.
	 *
	 * @param buffer the {@link ByteBuffer} to decode
	 * @param length the number of bytes to decode
	 * @param offset the offset at which to start decoding.
	 *
	 * @return the decoded {@link String}
	 */
	public static String memDecodeUTF16(ByteBuffer buffer, int length, int offset) {
		char[] chars = new char[length >> 1];

		for ( int i = 0; i < chars.length; i++ ) {
			chars[i] = buffer.getChar(offset + (i << 1));
		}

		return new String(chars);
	}

	/**
	 * Decodes the bytes with index {@code [position(), position()+remaining()}) in {@code buffer}, using the specified {@code charset}.
	 * <p/>
	 * The current {@code position} and {@code limit} of the specified {@code buffer} are not affected by this operation.
	 *
	 * @param buffer  the {@link ByteBuffer} to decode, or null
	 * @param charset the {@link Charset} to use for decoding
	 *
	 * @return the decoded {@link String} or null if the specified {@code buffer} is null
	 */
	public static String memDecode(ByteBuffer buffer, Charset charset) {
		if ( buffer == null )
			return null;

		return memDecode(buffer, charset, buffer.remaining());
	}

	/**
	 * Decodes the bytes with index {@code [position(), position()+length}) in {@code buffer}, using the specified {@code charset}.
	 * <p/>
	 * The current {@code position} and {@code limit} of the specified {@code buffer} are not affected by this operation.
	 *
	 * @param buffer  the {@link ByteBuffer} to decode
	 * @param length  the number of bytes to decode
	 * @param charset the {@link Charset} to use for decoding
	 *
	 * @return the decoded {@link String}
	 */
	public static String memDecode(ByteBuffer buffer, Charset charset, int length) {
		return memDecode(buffer, charset, length, buffer.position());
	}

	/**
	 * Decodes the bytes with index {@code [offset, offset+length}) in {@code buffer}, using the specified {@code charset}.
	 * <p/>
	 * The current {@code position} and {@code limit} of the specified {@code buffer} are not affected by this operation.
	 *
	 * @param buffer  the {@link ByteBuffer} to decode
	 * @param length  the number of bytes to decode
	 * @param offset  the offset at which to start decoding. It must be &#x2264; the current limit of {@code buffer}.
	 * @param charset the {@link Charset} to use for decoding
	 *
	 * @return the decoded {@link String}
	 */
	public static String memDecode(ByteBuffer buffer, Charset charset, int length, int offset) {
		int position = buffer.position();
		int limit = buffer.limit();
		try {
			buffer.position(offset);
			buffer.limit(offset + length);

			return decodeImpl(buffer, charset);
		} finally {
			buffer.limit(limit);
			buffer.position(position);
		}
	}

	private static String decodeImpl(ByteBuffer in, Charset charset) {
		CharsetDecoder decoder = charset.newDecoder(); // decoders are not thread-safe, create a new one on every call

		int n = (int)(in.remaining() * decoder.averageCharsPerByte());
		CharBuffer out = BufferUtils.createCharBuffer(n);

		if ( (n == 0) && (in.remaining() == 0) )
			return "";

		decoder.reset();
		for (; ; ) {
			CoderResult cr = in.hasRemaining() ? decoder.decode(in, out, true) : CoderResult.UNDERFLOW;
			if ( cr.isUnderflow() )
				cr = decoder.flush(out);

			if ( cr.isUnderflow() )
				break;
			if ( cr.isOverflow() ) {
				n = 2 * n + 1;    // Ensure progress; n might be 0!
				CharBuffer o = BufferUtils.createCharBuffer(n);
				out.flip();
				o.put(out);
				out = o;
				continue;
			}
			try {
				cr.throwException();
			} catch (CharacterCodingException e) {
				throw new RuntimeException(e);
			}
		}
		out.flip();
		return out.toString();
	}

}