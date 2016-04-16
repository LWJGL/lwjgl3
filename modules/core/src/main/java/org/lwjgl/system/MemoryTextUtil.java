/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import java.nio.ByteBuffer;

import static java.lang.Character.*;

/**
 * This class serves two purposes:
 * <ul>
 * <li>Keep the {@link MemoryUtil} class free of implementation details.</li>
 * <li>Enable elimination of {@link ByteBuffer} allocations (via escape analysis) with the Unsafe implementation.</li>
 * </ul>
 */
class MemoryTextUtil {

	protected MemoryTextUtil() {
	}

	/** @see MemoryUtil#memASCII(CharSequence, boolean, ByteBuffer, int) */
	int encodeASCII(CharSequence text, boolean nullTerminated, ByteBuffer target, int offset) {
		int p = offset;

		for ( int i = 0; i < text.length(); i++, p++ )
			target.put(p, (byte)text.charAt(i));

		if ( nullTerminated )
			target.put(p++, (byte)0);

		return p - offset;
	}

	/** @see MemoryUtil#memASCII(ByteBuffer, int, int) */
	static String decodeASCII(ByteBuffer buffer, int length, int offset) {
		char[] chars = new char[length];

		for ( int i = 0; i < length; i++ )
			chars[i] = (char)buffer.get(offset + i);

		return new String(chars);
	}

	// ---------------------------------------------------------------------------------------------------------------------

	/** @see MemoryUtil#memUTF8(CharSequence, boolean, ByteBuffer, int) */
	int encodeUTF8(CharSequence text, boolean nullTerminated, ByteBuffer target, int offset) {
		int i = 0, len = text.length(), p = offset;

		char c;

		// ASCII fast path
		while ( i < len && (c = text.charAt(i)) < 0x80 ) {
			target.put(p++, (byte)c);
			i++;
		}

		// Slow path
		while ( i < len ) {
			c = text.charAt(i++);
			if ( c < 0x80 ) {
				target.put(p++, (byte)c);
			} else {
				int cp = c;
				if ( c < 0x800 ) {
					target.put(p++, (byte)(0xC0 | cp >> 6));
				} else {
					if ( !isHighSurrogate(c) ) {
						target.put(p++, (byte)(0xE0 | cp >> 12));
					} else {
						cp = toCodePoint(c, text.charAt(i++));

						target.put(p++, (byte)(0xF0 | cp >> 18));
						target.put(p++, (byte)(0x80 | cp >> 12 & 0x3F));
					}
					target.put(p++, (byte)(0x80 | cp >> 6 & 0x3F));
				}
				target.put(p++, (byte)(0x80 | cp & 0x3F));
			}
		}

		if ( nullTerminated )
			target.put(p++, (byte)0);

		return p - offset;
	}

	/** @see MemoryUtil#memLengthUTF8 */
	static int encodeUTF8Length(CharSequence value) {
		int i, len = value.length(), bytes = len; // start with 1:1

		// ASCII fast path
		for ( i = 0; i < len; i++ ) {
			if ( 0x80 <= value.charAt(i) )
				break;
		}

		// 1 or 2 bytes fast path
		for ( ; i < len; i++ ) {
			char c = value.charAt(i);

			// fallback to slow path
			if ( 0x800 <= c ) {
				bytes += encodeUTF8LengthSlow(value, i, len);
				break;
			}

			// c <= 127: 0
			// c >= 128: 1
			bytes += (0x7F - c) >>> 31;
		}

		return bytes;
	}

	private static int encodeUTF8LengthSlow(CharSequence value, int offset, int len) {
		int bytes = 0;

		for ( int i = offset; i < len; i++ ) {
			char c = value.charAt(i);
			if ( c < 0x800 )
				bytes += (0x7F - c) >>> 31;
			else if ( c < MIN_SURROGATE || MAX_SURROGATE < c )
				bytes += 2;
			else {
				if ( Checks.DEBUG )
					checkSurrogatePair(value, i, len);

				bytes += 2; // the byte count already includes 2 bytes for the surrogate pair, add 2 more
				i++;
			}
		}

		return bytes;
	}

	private static void checkSurrogatePair(CharSequence value, int offset, int len) {
		char hi = value.charAt(offset);
		if ( len <= offset )
			throw new RuntimeException(String.format("Character sequence ends with single surrogate character: 0x%X", hi));

		char lo = value.charAt(offset + 1);
		if ( !Character.isSurrogatePair(hi, lo) )
			throw new RuntimeException(String.format("Malformed surrogate pair: 0x%X - 0x%X", hi, lo));
	}

	/** @see MemoryUtil#memUTF8(ByteBuffer, int, int) */
	static String decodeUTF8(ByteBuffer buffer, int length, int offset) {
		char[] string = new char[length];

		int i = 0, position = offset, limit = offset + length;

		// fast path
		while ( position < limit ) {
			int c = buffer.get(position);
			if ( c < 0 )
				break;

			string[i++] = (char)c;
			position++;
		}

		// slow path
		while ( position < limit ) {
			int b0 = buffer.get(position++);
			if ( 0 <= b0 ) {
				string[i++] = (char)b0;
			} else if ( (b0 >> 5) == -2 && (b0 & 0x1E) != 0 ) {
				int b1 = buffer.get(position++);
				if ( Checks.DEBUG && (b1 & 0xC0) != 0x80 )
					throw new RuntimeException("Malformed character sequence");

				string[i++] = (char)(((b0 << 6) ^ b1) ^ (((byte)0xC0 << 6) ^ ((byte)0x80 << 0)));
			} else if ( (b0 >> 4) == -2 ) {
				int b1 = buffer.get(position++);
				int b2 = buffer.get(position++);
				if ( Checks.DEBUG && isMalformed3(b0, b1, b2) )
					throw new RuntimeException("Malformed character sequence");

				char c = (char)((b0 << 12) ^ (b1 << 6) ^ (b2 ^ (((byte)0xE0 << 12) ^ ((byte)0x80 << 6) ^ ((byte)0x80 << 0))));
				if ( Checks.DEBUG && MIN_SURROGATE <= c && c <= MAX_SURROGATE )
					throw new RuntimeException("Malformed character sequence");

				string[i++] = c;
			} else if ( (b0 >> 3) == -2 ) {
				int b1 = buffer.get(position++);
				int b2 = buffer.get(position++);
				int b3 = buffer.get(position++);
				int cp = ((b0 << 18) ^ (b1 << 12) ^ (b2 << 6) ^ (b3 ^ ((byte)0xF0 << 18 ^ ((byte)0x80 << 12) ^ ((byte)0x80 << 6) ^ ((byte)0x80 << 0))));
				if ( Checks.DEBUG && (isMalformed4(b1, b2, b3) || !isSupplementaryCodePoint(cp)) )
					throw new RuntimeException("Malformed character sequence");

				string[i++] = (char)((cp >>> 10) + MIN_HIGH_SURROGATE - (MIN_SUPPLEMENTARY_CODE_POINT >>> 10));
				string[i++] = (char)((cp & 0x3FF) + MIN_LOW_SURROGATE);
			} else if ( Checks.DEBUG )
				throw new RuntimeException("Malformed character sequence");
		}

		return new String(string, 0, i);
	}

	private static boolean isMalformed3(int b1, int b2, int b3) {
		return (b1 == (byte)0xE0 && (b2 & 0xE0) == 0x80) || (b2 & 0xC0) != 0x80 || (b3 & 0xC0) != 0x80;
	}

	private static boolean isMalformed4(int b2, int b3, int b4) {
		return (b2 & 0xC0) != 0x80 || (b3 & 0xC0) != 0x80 || (b4 & 0xC0) != 0x80;
	}

	// ---------------------------------------------------------------------------------------------------------------------

	/** @see MemoryUtil#memUTF16(CharSequence, boolean, ByteBuffer, int) */
	int encodeUTF16(CharSequence text, boolean nullTerminated, ByteBuffer target, int offset) {
		int p = offset;
		for ( int i = 0; i < text.length(); i++, p += 2 )
			target.putChar(p, text.charAt(i));

		if ( nullTerminated ) {
			target.putChar(p, '\0');
			p += 2;
		}

		return p - offset;
	}

	/** @see MemoryUtil#memUTF16(ByteBuffer, int, int) */
	static String decodeUTF16(ByteBuffer buffer, int length, int offset) {
		char[] chars = new char[length];

		for ( int i = 0; i < chars.length; i++ )
			chars[i] = buffer.getChar(offset + (i << 1));

		return new String(chars);
	}

}