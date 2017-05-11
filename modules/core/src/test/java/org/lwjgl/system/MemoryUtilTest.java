/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import org.lwjgl.*;
import org.testng.annotations.*;

import java.nio.*;
import java.nio.charset.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.jni.JNINativeInterface.*;
import static org.testng.Assert.*;

@Test
public class MemoryUtilTest {

    public void testMemSet() {
        ByteBuffer buffer = BufferUtils.createByteBuffer(32);
        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put(i, (byte)i);
        }

        memSet(memAddress(buffer), 0x7F, buffer.capacity());

        for (int i = 0; i < buffer.capacity(); i++) {
            assertEquals(buffer.get(i), 0x7F);
        }
    }

    public void testMemSet2() {
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j <= (16 - i); j++) {
                long ref = nmemCalloc(1, 16);
                long mem = nmemCalloc(1, 16);

                // test misaligned memsets
                memSetReference(ref + i, (byte)0xFF, j);
                memSet(mem + i, (byte)0xFF, j);

                for (int k = 0; k < 16; k++) {
                    assertEquals(memGetByte(mem + k), memGetByte(ref + k));
                }

                nmemFree(mem);
                nmemFree(ref);
            }
        }
    }

    private static void memSetReference(long m, byte value, int bytes) {
        for (int i = 0; i < bytes; i++) {
            memPutByte(m + i, value);
        }
    }

    public void testMemCopy() {
        ByteBuffer src = BufferUtils.createByteBuffer(32);
        ByteBuffer dst = BufferUtils.createByteBuffer(32);

        for (int i = 0; i < src.capacity(); i++) {
            src.put(i, (byte)i);
        }

        memCopy(memAddress(src), memAddress(dst), src.capacity());

        for (int i = 0; i < src.capacity(); i++) {
            assertEquals(src.get(i), dst.get(i));
        }
    }

    public void testJNINewBuffer() {
        ByteBuffer buffer = BufferUtils.createByteBuffer(32);
        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put(i, (byte)i);
        }

        long address = GetDirectBufferAddress(buffer);
        assertTrue(address != NULL);

        ByteBuffer view = NewDirectByteBuffer(address + 8, 16);
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
        assertNull(memUTF8((String)null));
        assertNull(memUTF8(null, false));

        // decode null/NULL returns null
        assertNull(memUTF8(NULL));
        assertNull(memUTF8((ByteBuffer)null));

        // decode null/NULL with specific length/offset throws NPE
        try {
            memUTF8(null, 0);
            fail();
        } catch (NullPointerException ignored) {
        }

        try {
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