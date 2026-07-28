/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import org.testng.annotations.*;

import java.nio.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.testng.Assert.*;

@Test
public class StringCodecTest {

    public void testAllocatedEncoding() {
        // ASCII
        assertAllocated(memASCII("", true), new byte[] {0});
        assertAllocated(memASCII("", false), new byte[0]);
        assertAllocated(memASCII("LWJGL", true), new byte[] {'L', 'W', 'J', 'G', 'L', 0});
        assertAllocated(memASCII("\u007F\u00E9\u0100\u1234", false), new byte[] {0x7F, (byte)0xE9, 0x00, 0x34});
        assertAllocated(memASCII("\u0100", true), new byte[] {0x00, 0x00});
        assertAllocated(memASCII(new StringBuilder("\u007F\u00E9\u0100\u1234"), false), new byte[] {0x7F, (byte)0xE9, 0x00, 0x34});

        // UTF-8
        assertAllocated(memUTF8("", true), new byte[] {0});
        assertAllocated(memUTF8("", false), new byte[0]);
        assertAllocated(memUTF8("\u00E9\u00FF", false), new byte[] {(byte)0xC3, (byte)0xA9, (byte)0xC3, (byte)0xBF});
        assertAllocated(memUTF8(new StringBuilder("\u00E9\u00FF"), false), new byte[] {(byte)0xC3, (byte)0xA9, (byte)0xC3, (byte)0xBF});
        assertAllocated(memUTF8(utf8Text(), true), new byte[] {'A', (byte)0xC3, (byte)0xA9, (byte)0xE2, (byte)0x82, (byte)0xAC, (byte)0xF0, (byte)0x9F, (byte)0x98, (byte)0x80, 0});

        // UTF-16
        assertAllocated(memUTF16("", true), utf16Bytes("", true));
        assertAllocated(memUTF16("", false), new byte[0]);
        assertAllocated(memUTF16(utf16Text(), true), utf16Bytes(utf16Text(), true));
        assertAllocated(memUTF16(new StringBuilder(utf16Text()), false), utf16Bytes(utf16Text(), false));
    }

    public void testTargetEncoding() {
        // ASCII
        assertTargetEncoding("LWJGL", true, new byte[] {'L', 'W', 'J', 'G', 'L', 0}, 1, MemoryUtil::memASCII, MemoryUtil::memASCII);
        assertTargetEncoding("\u007F\u00E9\u0100\u1234", false, new byte[] {0x7F, (byte)0xE9, 0x00, 0x34}, 1, MemoryUtil::memASCII, MemoryUtil::memASCII);
        assertTargetEncoding("\u0100", true, new byte[] {0x00, 0x00}, 1, MemoryUtil::memASCII, MemoryUtil::memASCII);
        assertTargetEncoding(new StringBuilder("\u007F\u00E9\u0100\u1234"), false, new byte[] {0x7F, (byte)0xE9, 0x00, 0x34}, 1, MemoryUtil::memASCII, MemoryUtil::memASCII);

        // UTF-8
        assertTargetEncoding("abc\u00E9\u20AC", true, new byte[] {'a', 'b', 'c', (byte)0xC3, (byte)0xA9, (byte)0xE2, (byte)0x82, (byte)0xAC, 0}, 1, MemoryUtil::memUTF8, MemoryUtil::memUTF8);
        assertTargetEncoding("\u00E9\u00FF", false, new byte[] {(byte)0xC3, (byte)0xA9, (byte)0xC3, (byte)0xBF}, 1, MemoryUtil::memUTF8, MemoryUtil::memUTF8);
        assertTargetEncoding(new StringBuilder("\u00E9\u00FF"), false, new byte[] {(byte)0xC3, (byte)0xA9, (byte)0xC3, (byte)0xBF}, 1, MemoryUtil::memUTF8, MemoryUtil::memUTF8);

        // UTF-16
        assertTargetEncoding(utf16Text(), true, utf16Bytes(utf16Text(), true), 2, MemoryUtil::memUTF16, MemoryUtil::memUTF16);
        assertTargetEncoding(new StringBuilder(utf16Text()), false, utf16Bytes(utf16Text(), false), 2, MemoryUtil::memUTF16, MemoryUtil::memUTF16);
    }

    public void testTargetEncodingOverflow() {
        // ASCII
        assertOverflow("LWJGL", true, memLengthASCII("LWJGL", true), MemoryUtil::memASCII, MemoryUtil::memASCII);
        assertOverflow("", true, memLengthASCII("", true), MemoryUtil::memASCII, MemoryUtil::memASCII);

        // UTF-8
        assertOverflow("abc\u00E9\u20AC", true, memLengthUTF8("abc\u00E9\u20AC", true), MemoryUtil::memUTF8, MemoryUtil::memUTF8);
        assertOverflow(new StringBuilder("abc\u00E9\u20AC"), true, memLengthUTF8(new StringBuilder("abc\u00E9\u20AC"), true), MemoryUtil::memUTF8, MemoryUtil::memUTF8);
        assertOverflow("", true, memLengthUTF8("", true), MemoryUtil::memUTF8, MemoryUtil::memUTF8);

        // UTF-16
        assertOverflow(utf16Text(), true, memLengthUTF16(utf16Text(), true), MemoryUtil::memUTF16, MemoryUtil::memUTF16);
        assertOverflow("", true, memLengthUTF16("", true), MemoryUtil::memUTF16, MemoryUtil::memUTF16);
    }

    public void testDecoding() {
        // ASCII
        assertDecoding(
            new byte[] {'o', 'n', 'e', ' ', (byte)0xE9},
            "one \u00E9",
            1,
            MemoryUtil::memASCII,
            MemoryUtil::memASCII,
            MemoryUtil::memASCII,
            MemoryUtil::memASCII,
            MemoryUtil::memASCII,
            MemoryUtil::memLengthNT1,
            MemoryUtil::memByteBufferNT1
        );

        // UTF-8
        assertDecoding(
            new byte[] {'A', (byte)0xC3, (byte)0xA9, (byte)0xE2, (byte)0x82, (byte)0xAC, (byte)0xF0, (byte)0x9F, (byte)0x98, (byte)0x80},
            utf8Text(),
            1,
            MemoryUtil::memUTF8,
            MemoryUtil::memUTF8,
            MemoryUtil::memUTF8,
            MemoryUtil::memUTF8,
            MemoryUtil::memUTF8,
            MemoryUtil::memLengthNT1,
            MemoryUtil::memByteBufferNT1
        );

        // UTF-16
        assertDecoding(
            utf16Bytes(utf16Text(), false),
            utf16Text(),
            2,
            MemoryUtil::memUTF16,
            MemoryUtil::memUTF16,
            MemoryUtil::memUTF16,
            MemoryUtil::memUTF16,
            MemoryUtil::memUTF16,
            MemoryUtil::memLengthNT2,
            MemoryUtil::memByteBufferNT2
        );
    }

    public void testSafeNulls() {
        // ASCII
        assertNull(memASCIISafe((CharSequence)null));
        assertNull(memASCIISafe(null, false));
        assertNull(memASCIISafe(NULL));
        assertNull(memASCIISafe(NULL, 0));
        assertNull(memASCIISafe((ByteBuffer)null));

        // UTF-8
        assertNull(memUTF8Safe((CharSequence)null));
        assertNull(memUTF8Safe(null, false));
        assertNull(memUTF8Safe(NULL));
        assertNull(memUTF8Safe(NULL, 0));
        assertNull(memUTF8Safe((ByteBuffer)null));

        // UTF-16
        assertNull(memUTF16Safe((CharSequence)null));
        assertNull(memUTF16Safe(null, false));
        assertNull(memUTF16Safe(NULL));
        assertNull(memUTF16Safe(NULL, 0));
        assertNull(memUTF16Safe((ByteBuffer)null));
    }

    public void testLengthCalculations() {
        // ASCII
        assertEquals(memLengthASCII("", false), 0);
        assertEquals(memLengthASCII("", true), 1);
        assertEquals(memLengthASCII("\u007F\u00E9\u0100\u1234", false), 4);
        assertEquals(memLengthASCII(new StringBuilder("\u007F\u00E9\u0100\u1234"), true), 5);

        // UTF-8
        assertEquals(memLengthUTF8("\u007F", false), 1);
        assertEquals(memLengthUTF8("\u0080", false), 2);
        assertEquals(memLengthUTF8("\u0800", false), 3);
        assertEquals(memLengthUTF8(new String(Character.toChars(0x1F600)), false), 4);
        assertEquals(memLengthUTF8(utf8Text(), true), 11);
        assertEquals(memLengthUTF8(new StringBuilder(utf8Text()), false), 10);

        // UTF-16
        assertEquals(memLengthUTF16("", false), 0);
        assertEquals(memLengthUTF16("", true), 2);
        assertEquals(memLengthUTF16(utf16Text(), false), utf16Text().length() * Character.BYTES);
        assertEquals(memLengthUTF16(new StringBuilder(utf16Text()), true), (utf16Text().length() + 1) * Character.BYTES);
    }

    @FunctionalInterface
    private interface TextWriter {
        int apply(CharSequence text, boolean nullTerminated, ByteBuffer target);
    }

    @FunctionalInterface
    private interface TextWriterOffset {
        int apply(CharSequence text, boolean nullTerminated, ByteBuffer target, int offset);
    }

    @FunctionalInterface
    private interface AddressDecoder {
        String apply(long address, int length);
    }

    @FunctionalInterface
    private interface AddressNTDecoder {
        String apply(long address);
    }

    @FunctionalInterface
    private interface BufferDecoder {
        String apply(ByteBuffer buffer);
    }

    @FunctionalInterface
    private interface BufferLengthDecoder {
        String apply(ByteBuffer buffer, int length);
    }

    @FunctionalInterface
    private interface BufferOffsetDecoder {
        String apply(ByteBuffer buffer, int length, int offset);
    }

    @FunctionalInterface
    private interface NTLength {
        int apply(ByteBuffer buffer);
    }

    @FunctionalInterface
    private interface NTBuffer {
        ByteBuffer apply(long address);
    }

    private static void assertAllocated(ByteBuffer encoded, byte[] expected) {
        try {
            assertEquals(encoded.order(), ByteOrder.nativeOrder());
            assertBytes(encoded, expected);
        } finally {
            memFree(encoded);
        }
    }

    private static void assertTargetEncoding(CharSequence text, boolean nullTerminated, byte[] expected, int offset, TextWriter writer, TextWriterOffset writerOffset) {
        ByteBuffer target = memAlloc(expected.length + offset + 1);
        try {
            memSet(target, 0x55);
            target.position(offset);
            target.limit(offset + expected.length);

            int written = writer.apply(text, nullTerminated, target);

            assertEquals(written, expected.length);
            assertEquals(target.position(), offset);
            assertEquals(target.limit(), offset + expected.length);
            assertSentinel(target, 0, offset);
            assertBytes(target, offset, expected);
            ByteBuffer view = target.duplicate();
            view.clear();
            assertEquals(view.get(offset + expected.length), (byte)0x55);
        } finally {
            memFree(target);
        }

        target = memAlloc(expected.length + offset + 1);
        try {
            memSet(target, 0x55);

            int written = writerOffset.apply(text, nullTerminated, target, offset);

            assertEquals(written, expected.length);
            assertEquals(target.position(), 0);
            assertEquals(target.limit(), target.capacity());
            assertSentinel(target, 0, offset);
            assertBytes(target, offset, expected);
            assertEquals(target.get(offset + expected.length), (byte)0x55);
        } finally {
            memFree(target);
        }
    }

    private static void assertOverflow(CharSequence text, boolean nullTerminated, int required, TextWriter writer, TextWriterOffset writerOffset) {
        ByteBuffer target = memAlloc(required - 1);
        try {
            ByteBuffer finalTarget = target;
            expectThrows(BufferOverflowException.class, () -> writer.apply(text, nullTerminated, finalTarget));
        } finally {
            memFree(target);
        }

        target = memAlloc(required);
        try {
            ByteBuffer finalTarget = target;
            expectThrows(BufferOverflowException.class, () -> writerOffset.apply(text, nullTerminated, finalTarget, 1));
        } finally {
            memFree(target);
        }
    }

    private static void assertDecoding(
        byte[] encoded,
        String expected,
        int bytesPerLengthUnit,
        AddressDecoder addressDecoder,
        AddressNTDecoder addressNTDecoder,
        BufferDecoder bufferDecoder,
        BufferLengthDecoder bufferLengthDecoder,
        BufferOffsetDecoder bufferOffsetDecoder,
        NTLength ntLength,
        NTBuffer ntBuffer
    ) {
        int length = bytesPerLengthUnit == 1 ? encoded.length : encoded.length >>> 1;

        int offset = bytesPerLengthUnit;

        ByteBuffer buffer = memAlloc(encoded.length + bytesPerLengthUnit + offset + 1);
        try {
            memSet(buffer, 0x7F);
            for (int i = 0; i < encoded.length; i++) {
                buffer.put(offset + i, encoded[i]);
            }
            for (int i = 0; i < bytesPerLengthUnit; i++) {
                buffer.put(offset + encoded.length + i, (byte)0);
            }

            buffer.position(offset);
            buffer.limit(offset + encoded.length);
            assertEquals(bufferDecoder.apply(buffer), expected);
            assertEquals(bufferLengthDecoder.apply(buffer, length), expected);
            assertEquals(buffer.position(), offset);
            assertEquals(buffer.limit(), offset + encoded.length);

            buffer.limit(offset + encoded.length + bytesPerLengthUnit);
            assertEquals(ntLength.apply(buffer), encoded.length);

            buffer.clear();
            assertEquals(bufferOffsetDecoder.apply(buffer, length, offset), expected);

            long address = memAddress(buffer, offset);
            assertEquals(addressDecoder.apply(address, length), expected);
            assertEquals(addressNTDecoder.apply(address), expected);
            assertBytes(ntBuffer.apply(address), encoded);
        } finally {
            memFree(buffer);
        }
    }

    private static void assertBytes(ByteBuffer buffer, byte[] expected) {
        assertEquals(buffer.position(), 0);
        assertEquals(buffer.remaining(), expected.length);
        assertBytes(buffer, 0, expected);
    }

    private static void assertBytes(ByteBuffer buffer, int offset, byte[] expected) {
        for (int i = 0; i < expected.length; i++) {
            assertEquals(buffer.get(offset + i), expected[i]);
        }
    }

    private static void assertSentinel(ByteBuffer buffer, int from, int to) {
        for (int i = from; i < to; i++) {
            assertEquals(buffer.get(i), (byte)0x55);
        }
    }

    private static byte[] utf16Bytes(String text, boolean nullTerminated) {
        ByteBuffer buffer = ByteBuffer
            .allocate((text.length() + (nullTerminated ? 1 : 0)) * Character.BYTES)
            .order(ByteOrder.nativeOrder());

        for (int i = 0; i < text.length(); i++) {
            buffer.putChar(text.charAt(i));
        }
        if (nullTerminated) {
            buffer.putChar('\0');
        }

        return buffer.array();
    }

    private static String utf8Text() {
        return "A\u00E9\u20AC" + new String(Character.toChars(0x1F600));
    }

    private static String utf16Text() {
        return "A\u0100\u1234" + new String(Character.toChars(0x1F600));
    }

}
