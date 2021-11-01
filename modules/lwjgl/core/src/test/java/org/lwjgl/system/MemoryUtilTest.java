/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import org.lwjgl.*;
import org.testng.*;
import org.testng.annotations.*;

import java.nio.*;
import java.nio.charset.*;
import java.util.*;
import java.util.function.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.jni.JNINativeInterface.*;
import static org.testng.Assert.*;

@Test
public class MemoryUtilTest {

    public void testZeroAllocation() {
        if (!CHECKS) {
            throw new SkipException("This test may not run with checks disabled.");
        }

        long address = nmemAllocChecked(0);
        assertNotEquals(address, NULL);
        nmemFree(address);

        address = nmemCallocChecked(0, 0);
        assertNotEquals(address, NULL);
        nmemFree(address);

        address = nmemCallocChecked(1, 0);
        assertNotEquals(address, NULL);
        nmemFree(address);

        address = nmemCallocChecked(0, 8);
        assertNotEquals(address, NULL);
        nmemFree(address);

        address = nmemAlignedAllocChecked(16, 0);
        assertNotEquals(address, NULL);
        nmemAlignedFree(address);

        address = nmemReallocChecked(NULL, 0);
        assertNotEquals(address, NULL);
        address = nmemReallocChecked(address, 8);
        assertNotEquals(address, NULL);
        address = nmemReallocChecked(address, 0);
        assertNotEquals(address, NULL);
        nmemFree(address);
    }

    public void testOOME() {
        if (!CHECKS) {
            throw new SkipException("This test may not run with checks disabled.");
        }

        expectThrows(OutOfMemoryError.class, () -> nmemAllocChecked(-1L));
        expectThrows(OutOfMemoryError.class, () -> nmemCallocChecked(1, -1L));
    }

    public void testMemSet() {
        for (int size = 2; size <= (1 << 16); size <<= 1) {
            for (int offset = -1; offset <= 1; offset++) {
                ByteBuffer buffer = memAlloc(size + offset);
                for (int i = 0; i < buffer.capacity(); i++) {
                    buffer.put(i, (byte)0);
                }
                memSet(memAddress(buffer), 0x7F, buffer.capacity());
                for (int i = 0; i < buffer.capacity(); i++) {
                    assertEquals(buffer.get(i), 0x7F);
                }
                memFree(buffer);
            }

            for (int misalignment = 1; misalignment < 8; misalignment++) {
                ByteBuffer aligned = memAlloc(size + 8);
                for (int i = 0; i < aligned.capacity(); i++) {
                    aligned.put(i, (byte)0);
                }

                ByteBuffer buffer = memSlice(aligned, misalignment, size);
                memSet(memAddress(buffer), 0x7F, buffer.capacity());
                assertEquals(aligned.get(misalignment - 1), 0);
                for (int i = 0; i < buffer.capacity(); i++) {
                    assertEquals(buffer.get(i), 0x7F);
                }
                assertEquals(aligned.get(misalignment + size), 0);

                memFree(aligned);
            }
        }
    }

    public void testMemSetMisaligned() {
        long ref = nmemAlloc(16);
        long mem = nmemAlloc(16);
        for (int i = 0; i < 16; i++) {
            for (int j = 1; j <= (16 - i); j++) {
                // cannot trust the memSet in nmemCalloc yet
                memSetReference(ref, 0, 16);
                memSetReference(mem, 0, 16);

                // test misaligned memsets
                memSetReference(ref + i, 0xFF, j);
                memSet(mem + i, 0xFF, j);

                for (int k = 0; k < 16; k++) {
                    assertEquals(memGetByte(mem + k), memGetByte(ref + k));
                }
            }
        }
        nmemFree(mem);
        nmemFree(ref);
    }

    private static void memSetReference(long m, int value, int bytes) {
        for (int i = 0; i < bytes; i++) {
            memPutByte(m + i, (byte)(value & 0xFF));
        }
    }

    public void testMemCopy() {
        ByteBuffer src = BufferUtils.createByteBuffer(32);
        ByteBuffer dst = BufferUtils.createByteBuffer(32);

        for (int i = 0; i < src.capacity(); i++) {
            src.put(i, (byte)i);
        }

        memCopy(src, dst);

        for (int i = 0; i < src.capacity(); i++) {
            assertEquals(src.get(i), dst.get(i));
        }
    }

    public void testMemCopyMisaligned() {
        long src = nmemCalloc(1, 16);
        for (int i = 0; i < 16; i++) {
            memPutByte(src + i, (byte)i);
        }

        for (int i = 0; i < 16; i++) {
            for (int j = 0; j <= (16 - i); j++) {
                long ref = nmemCalloc(1, 16);
                long mem = nmemCalloc(1, 16);

                // test misaligned memcpys
                memCopyReference(src + i, ref + i, j);
                memCopy(src + i, mem + i, j);

                for (int k = 0; k < 16; k++) {
                    assertEquals(memGetByte(mem + k), memGetByte(ref + k));
                }

                nmemFree(mem);
                nmemFree(ref);
            }
        }

        nmemFree(src);
    }

    private static void memCopyReference(long src, long dst, int bytes) {
        for (int i = 0; i < bytes; i++) {
            memPutByte(dst + i, memGetByte(src + i));
        }
    }

    public void testJNINewBuffer() {
        ByteBuffer buffer = BufferUtils.createByteBuffer(32);
        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put(i, (byte)i);
        }

        long address = GetDirectBufferAddress(buffer);
        assertTrue(address != NULL);

        ByteBuffer view = Objects.requireNonNull(NewDirectByteBuffer(address + 8, 16));
        assertEquals(view.order(), ByteOrder.BIG_ENDIAN);
        for (int i = 0; i < view.capacity(); i++) {
            assertEquals(view.get(i), buffer.get(i + 8));
        }
    }

    public void testAddress() {
        ByteBuffer buffer = BufferUtils.createByteBuffer(32);
        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put(i, (byte)i);
        }

        long address = memAddress(buffer);
        assertTrue(address != NULL);

        buffer.position(8);
        buffer.limit(8 + 16);

        FloatBuffer floatView = memSlice(buffer).asFloatBuffer();

        assertEquals(address + 8, memAddress(floatView));
    }

    public void testDirectAccess() {
        ByteBuffer buffer = BufferUtils.createByteBuffer(40);

        long address = memAddress(buffer);

        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put(i, (byte)i);
        }

        for (int i = 0; i < buffer.capacity(); i++) {
            assertEquals(memGetByte(address + i), buffer.get(i));
        }

        for (int i = 0; i < buffer.capacity(); i++) {
            memPutByte(address + i, (byte)-i);
        }

        for (int i = 0; i < buffer.capacity(); i++) {
            assertEquals(-i, buffer.get(i));
        }

        memPutAddress(address, address);
        memPutDouble(address + 8, Math.PI);
        memPutLong(address + 16, Integer.MAX_VALUE * 2L);
        memPutFloat(address + 24, (float)Math.PI);
        memPutInt(address + 28, Short.MAX_VALUE * 2);
        memPutShort(address + 32, (short)(Byte.MAX_VALUE * 2));
        memPutByte(address + 34, (byte)127);

        assertEquals(memGetAddress(address), address);
        assertEquals(memGetDouble(address + 8), Math.PI);
        assertEquals(memGetLong(address + 16), Integer.MAX_VALUE * 2L);
        assertEquals(memGetFloat(address + 24), (float)Math.PI);
        assertEquals(memGetInt(address + 28), Short.MAX_VALUE * 2);
        assertEquals(memGetShort(address + 32), (short)(Byte.MAX_VALUE * 2));
        assertEquals(memGetByte(address + 34), (byte)127);
    }

    public void testNewBuffer() {
        ByteBuffer buffer = BufferUtils.createByteBuffer(32);
        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put(i, (byte)i);
        }

        long address = memAddress(buffer);
        assertTrue(address != NULL);

        ByteBuffer view = memByteBuffer(address + 8, 16);
        assertEquals(view.order(), ByteOrder.nativeOrder());
        for (int i = 0; i < view.capacity(); i++) {
            assertEquals(view.get(i), buffer.get(i + 8));
        }

        ShortBuffer sb = memShortBuffer(address, 16);
        assertEquals(sb.capacity(), 16);
        for (int i = 0; i < sb.capacity(); i++) {
            assertEquals(buffer.getShort(i << 1), sb.get(i));
        }

        IntBuffer ib = memIntBuffer(address, 8);
        assertEquals(ib.capacity(), 8);
        for (int i = 0; i < ib.capacity(); i++) {
            assertEquals(buffer.getInt(i << 2), ib.get(i));
        }

        LongBuffer lb = memLongBuffer(address, 4);
        assertEquals(lb.capacity(), 4);
        for (int i = 0; i < lb.capacity(); i++) {
            assertEquals(buffer.getLong(i << 3), lb.get(i));
        }

        FloatBuffer fb = memFloatBuffer(address, 8);
        assertEquals(fb.capacity(), 8);
        for (int i = 0; i < fb.capacity(); i++) {
            assertEquals(buffer.getFloat(i << 2), fb.get(i));
        }

        DoubleBuffer db = memDoubleBuffer(address, 4);
        assertEquals(db.capacity(), 4);
        for (int i = 0; i < db.capacity(); i++) {
            assertEquals(buffer.getDouble(i << 3), db.get(i));
        }
    }

    public void testViewBuffer() {
        IntBuffer ib = BufferUtils.createIntBuffer(10);
        ib.position(2);
        ib.limit(8);

        ByteBuffer bb = memByteBuffer(ib);
        assertEquals(bb.position(), 0);
        assertEquals(bb.limit(), 6 * Integer.BYTES);
        assertEquals(bb.remaining(), ib.remaining() * Integer.BYTES);

        for (int i = 0; i < ib.remaining(); i++) {
            assertEquals(bb.getInt(i * Integer.BYTES), 0);
        }
        memSet(ib, 0xFFFFFFFF);
        for (int i = 0; i < ib.remaining(); i++) {
            assertEquals(bb.getInt(i * Integer.BYTES), 0xFFFFFFFF);
        }
        memSet(bb, 0x0);
        for (int i = 0; i < ib.remaining(); i++) {
            assertEquals(ib.get(2 + i), 0x0);
        }

        DoubleBuffer db = memDoubleBuffer(memAddress(ib), Integer.MAX_VALUE);
        assertThrows(IllegalArgumentException.class, () -> memByteBuffer(db));

        db.limit(Integer.MAX_VALUE >> 3);
        assertEquals(memByteBuffer(db).remaining(), (Integer.MAX_VALUE >> 3) << 3);
    }

    @FunctionalInterface
    private interface BufferAddressGetter<T extends Buffer> {
        long apply(T buffer);
    }

    public void testDuplicateBuffer() {
        testDuplicateBuffer(memAlloc(32), it -> it.duplicate().order(it.order()), MemoryUtil::memDuplicate, ByteBuffer::order, MemoryUtil::memAddress);
        testDuplicateBuffer(memAllocShort(32), ShortBuffer::duplicate, MemoryUtil::memDuplicate, ShortBuffer::order, MemoryUtil::memAddress);
        testDuplicateBuffer(memAllocInt(32), IntBuffer::duplicate, MemoryUtil::memDuplicate, IntBuffer::order, MemoryUtil::memAddress);
        testDuplicateBuffer(memAllocLong(32), LongBuffer::duplicate, MemoryUtil::memDuplicate, LongBuffer::order, MemoryUtil::memAddress);
        testDuplicateBuffer(memAllocFloat(32), FloatBuffer::duplicate, MemoryUtil::memDuplicate, FloatBuffer::order, MemoryUtil::memAddress);
        testDuplicateBuffer(memAllocDouble(32), DoubleBuffer::duplicate, MemoryUtil::memDuplicate, DoubleBuffer::order, MemoryUtil::memAddress);
    }

    private static <T extends Buffer> void testDuplicateBuffer(
        T buffer,
        Function<T, T> duplicate,
        Function<T, T> memDuplicate,
        Function<T, ByteOrder> order,
        BufferAddressGetter<T> memAddress
    ) {
        buffer.mark();
        buffer.position(8);
        buffer.limit(16);

        T ref = duplicate.apply(buffer);
        T dup = memDuplicate.apply(buffer);

        assertEquals(order.apply(dup), order.apply(ref));
        assertEquals(memAddress.apply(dup), memAddress.apply(ref));
        assertEquals(dup.capacity(), ref.capacity());
        assertEquals(dup, ref);

        dup.reset();
        ref.reset();
        assertEquals(dup.position(), ref.position());

        memFree(buffer);
    }

    public void testSliceBuffer() {
        testSliceBuffer(memAlloc(32), it -> it.slice().order(it.order()), MemoryUtil::memSlice, ByteBuffer::order, MemoryUtil::memAddress);
        testSliceBuffer(memAllocShort(32), ShortBuffer::slice, MemoryUtil::memSlice, ShortBuffer::order, MemoryUtil::memAddress);
        testSliceBuffer(memAllocInt(32), IntBuffer::slice, MemoryUtil::memSlice, IntBuffer::order, MemoryUtil::memAddress);
        testSliceBuffer(memAllocLong(32), LongBuffer::slice, MemoryUtil::memSlice, LongBuffer::order, MemoryUtil::memAddress);
        testSliceBuffer(memAllocFloat(32), FloatBuffer::slice, MemoryUtil::memSlice, FloatBuffer::order, MemoryUtil::memAddress);
        testSliceBuffer(memAllocDouble(32), DoubleBuffer::slice, MemoryUtil::memSlice, DoubleBuffer::order, MemoryUtil::memAddress);
    }

    private static <T extends Buffer> void testSliceBuffer(
        T buffer,
        Function<T, T> slice,
        Function<T, T> memSlice,
        Function<T, ByteOrder> order,
        BufferAddressGetter<T> memAddress
    ) {
        buffer.position(8);
        buffer.limit(16);

        T ref = slice.apply(buffer);
        T dup = memSlice.apply(buffer);

        assertEquals(order.apply(dup), order.apply(ref));
        assertEquals(memAddress.apply(dup), memAddress.apply(ref));
        assertEquals(dup.capacity(), ref.capacity());
        assertEquals(dup, ref);

        memFree(buffer);
    }

    public void testSliceBufferAbs() {
        testSliceBufferAbs(
            memAlloc(32),
            it -> it.duplicate().order(it.order()),
            it -> it.slice().order(it.order()),
            MemoryUtil::memSlice,
            ByteBuffer::order,
            MemoryUtil::memAddress
        );
        testSliceBufferAbs(memAllocShort(32), ShortBuffer::duplicate, ShortBuffer::slice, MemoryUtil::memSlice, ShortBuffer::order, MemoryUtil::memAddress);
        testSliceBufferAbs(memAllocInt(32), IntBuffer::duplicate, IntBuffer::slice, MemoryUtil::memSlice, IntBuffer::order, MemoryUtil::memAddress);
        testSliceBufferAbs(memAllocLong(32), LongBuffer::duplicate, LongBuffer::slice, MemoryUtil::memSlice, LongBuffer::order, MemoryUtil::memAddress);
        testSliceBufferAbs(memAllocFloat(32), FloatBuffer::duplicate, FloatBuffer::slice, MemoryUtil::memSlice, FloatBuffer::order, MemoryUtil::memAddress);
        testSliceBufferAbs(memAllocDouble(32), DoubleBuffer::duplicate, DoubleBuffer::slice, MemoryUtil::memSlice, DoubleBuffer::order, MemoryUtil::memAddress);
    }

    @FunctionalInterface
    private interface AbsoluteSlicer<T extends Buffer> {
        T apply(T buffer, int offset, int capacity);
    }

    private static <T extends Buffer> void testSliceBufferAbs(
        T buffer,
        Function<T, T> duplicate,
        Function<T, T> slice,
        AbsoluteSlicer<T> memSlice,
        Function<T, ByteOrder> order,
        BufferAddressGetter<T> memAddress
    ) {
        buffer.position(4);

        T ref = sliceRef(buffer, 4, 12, duplicate, slice);
        T dup = memSlice.apply(buffer, 4, 12);

        assertEquals(order.apply(dup), order.apply(ref));
        assertEquals(memAddress.apply(dup), memAddress.apply(ref));
        assertEquals(dup.capacity(), ref.capacity());
        assertEquals(dup, ref);

        memFree(buffer);
    }

    private static <T extends Buffer> T sliceRef(T buffer, int offset, int capacity, Function<T, T> duplicate, Function<T, T> slice) {
        T copy = duplicate.apply(buffer);

        int position = buffer.position() + offset;
        copy.limit(position + capacity);
        copy.position(position);

        return slice.apply(copy);
    }

    public void testTextDecoding() {
        testTextDecoding(MemoryUtil::memASCII, MemoryUtil::memASCII, MemoryUtil::memASCII, 1);
        testTextDecoding(MemoryUtil::memUTF8, MemoryUtil::memUTF8, MemoryUtil::memUTF8, 1);
        testTextDecoding(MemoryUtil::memUTF16, MemoryUtil::memUTF16, MemoryUtil::memUTF16, 2);
    }

    @FunctionalInterface
    private interface TextEncoder {
        ByteBuffer apply(CharSequence text, boolean nullTerminated);
    }

    @FunctionalInterface
    private interface TextDecoder {
        String apply(ByteBuffer buffer, int length, int offset);
    }

    private static void testTextDecoding(TextEncoder encoder, Function<ByteBuffer, String> decoder, TextDecoder decoderUnsafe, int bpc) {
        ByteBuffer encoded = encoder.apply("one two three", true);

        assertEquals(encoded.position(), 0);
        assertEquals(encoded.remaining(), 14 * bpc);

        encoded.limit(13 * bpc);
        encoded.position(0 * bpc);
        assertEquals(decoder.apply(encoded), "one two three");

        encoded.limit(3 * bpc);
        encoded.position(0 * bpc);
        assertEquals(decoder.apply(encoded), "one");

        encoded.limit(7 * bpc);
        encoded.position(4 * bpc);
        assertEquals(decoder.apply(encoded), "two");

        encoded.limit(13 * bpc);
        encoded.position(8 * bpc);
        assertEquals(decoder.apply(encoded), "three");

        encoded.clear();

        assertEquals(decoderUnsafe.apply(encoded, 13, 0 * bpc), "one two three");
        assertEquals(decoderUnsafe.apply(encoded, 3, 0 * bpc), "one");
        assertEquals(decoderUnsafe.apply(encoded, 3, 4 * bpc), "two");
        assertEquals(decoderUnsafe.apply(encoded, 5, 8 * bpc), "three");

        memFree(encoded);
    }

    public void testUTF8() {
        // null-termination
        ByteBuffer bytes = memUTF8("");
        try {
            assertNotNull(bytes);
            assertEquals(bytes.remaining(), 1);
        } finally {
            memFree(bytes);
        }

        // no null-termination
        bytes = memUTF8("", false);
        try {
            assertNotNull(bytes);
            assertEquals(bytes.remaining(), 0);
        } finally {
            memFree(bytes);
        }

        // encode null returns null
        assertNull(memUTF8Safe((String)null));
        assertNull(memUTF8Safe(null, false));

        // decode null/NULL returns null
        assertNull(memUTF8Safe(NULL));
        assertNull(memUTF8Safe((ByteBuffer)null));

        // decode null/NULL with specific length/offset throws NPE
        try {
            //noinspection ConstantConditions
            memUTF8(null, 0);
            fail();
        } catch (NullPointerException ignored) {
        }

        try {
            //noinspection ConstantConditions
            memUTF8(null, 0, 0);
            fail();
        } catch (NullPointerException ignored) {
        }

        // decode non-null/NULL with length 0 returns empty string
        bytes = BufferUtils.createByteBuffer(4);
        bytes.limit(0);

        assertEquals(memUTF8(memAddress(bytes)), "");
        assertEquals(memUTF8(bytes, 0), "");
        assertEquals(memUTF8(bytes, 0, 0), "");

        // test boundary conditions

        CharBuffer chars = BufferUtils.createCharBuffer(2);

        testUTF8(bytes, chars, Character.MIN_CODE_POINT, 1);
        testUTF8(bytes, chars, 0x00000080, 2);
        testUTF8(bytes, chars, 0x00000800, 3);
        testUTF8(bytes, chars, 0x00010000, 4);

        testUTF8(bytes, chars, 0x0000007F, 1);
        testUTF8(bytes, chars, 0x000007FF, 2);
        testUTF8(bytes, chars, 0x0000FFFF, 3);
        testUTF8(bytes, chars, Character.MAX_CODE_POINT, 4);

        bytes.clear();

        memUTF8(new String(Character.toChars(0x0000D7FF)), false, bytes);
        assertEquals(bytes.get(0) & 0xFF, 0xED);
        assertEquals(bytes.get(1) & 0xFF, 0x9F);
        assertEquals(bytes.get(2) & 0xFF, 0xBF);

        memUTF8(new String(Character.toChars(0x0000E000)), false, bytes);
        assertEquals(bytes.get(0) & 0xFF, 0xEE);
        assertEquals(bytes.get(1) & 0xFF, 0x80);
        assertEquals(bytes.get(2) & 0xFF, 0x80);

        memUTF8(new String(Character.toChars(0x0000FFFD)), false, bytes);
        assertEquals(bytes.get(0) & 0xFF, 0xEF);
        assertEquals(bytes.get(1) & 0xFF, 0xBF);
        assertEquals(bytes.get(2) & 0xFF, 0xBD);

        memUTF8(new String(Character.toChars(0x0010FFFF)), false, bytes);
        assertEquals(bytes.get(0) & 0xFF, 0xF4);
        assertEquals(bytes.get(1) & 0xFF, 0x8F);
        assertEquals(bytes.get(2) & 0xFF, 0xBF);
        assertEquals(bytes.get(2) & 0xFF, 0xBF);
    }

    private static void testUTF8(ByteBuffer buffer, CharBuffer chars, int cp, int bytes) {
        char[] cpChars = Character.toChars(cp);

        chars.clear();
        chars.put(cpChars);
        chars.flip();

        buffer.clear();
        StandardCharsets.UTF_8
            .newEncoder()
            .encode(chars, buffer, true);
        buffer.flip();

        // test decoding
        assertEquals(buffer.remaining(), bytes);
        assertEquals(
            memUTF8(buffer, bytes),
            new String(cpChars)
        );

        ByteBuffer encoded = memUTF8(new String(cpChars), false);
        try {
            // test encoding
            assertEquals(encoded.remaining(), bytes);
            for (int i = 0; i < encoded.remaining(); i++) {
                assertEquals(
                    encoded.get(i),
                    buffer.get(i)
                );
            }
        } finally {
            memFree(encoded);
        }
    }

}