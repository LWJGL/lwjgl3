/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm;

import org.jspecify.annotations.*;
import org.lwjgl.system.ffm.mapping.*;
import org.testng.annotations.*;

import java.lang.foreign.*;

import static org.lwjgl.system.SegmentStack.*;
import static org.lwjgl.system.ffm.FFM.*;
import static org.testng.Assert.*;

@NullMarked
@Test
public class MappingTest {

    public void testSignedness() {
        assertTrue(jbyte.signed());
        assertTrue(jshort.signed());
        assertTrue(jint.signed());
        assertTrue(jlong.signed());
        assertTrue(int8_t.signed());
        assertTrue(int16_t.signed());
        assertTrue(int32_t.signed());
        assertTrue(int64_t.signed());

        assertTrue(ptrdiff_t.signed());
        assertTrue(intptr_t.signed());
        assertTrue(cchar.signed());
        assertTrue(cint.signed());
        assertTrue(clong.signed());
        assertTrue(long_long.signed());

        assertFalse(jchar.signed());
        assertFalse(uint8_t.signed());
        assertFalse(uint16_t.signed());
        assertFalse(uint32_t.signed());
        assertFalse(uint64_t.signed());

        assertFalse(size_t.signed());
        assertFalse(uintptr_t.signed());
        assertFalse(unsigned_char.signed());
        assertFalse(unsigned_int.signed());
        assertFalse(unsigned_long.signed());
        assertFalse(unsigned_long_long.signed());
    }

    public void testPointerNames() {
        check(cint, "int");
        check(cint.p(), "int *");
        check(cint.p().p(), "int **");
    }

    public void testArrayNames() {
        check(cint, "int");
        check(cint.array(10), "int[10]");
        check(cint.array(10).p(), "int[10] *");
        check(cint.array(10).array(20), "int[10][20]");
        check(cint.array(10).p().array(20).p(), "int[10] *[20] *");
    }

    public void testConstNames() {
        check(cint, "int");
        check(cint.cconst(), "int const");
        check(cint.cconst().p(), "int const *");
        check(cint.cconst().p().cconst(), "int const * const");
        check(cint.cconst().p().cconst().p(), "int const * const *");
    }

    private static <L extends MemoryLayout> void check(Mapping<L> actual, String expected) {
        assertEquals(actual.layout().name().orElseThrow(), expected);
    }

    public void testByteUnsignedMappings() {
        try (var stack = stackPush()) {
            var segment = uint8_t.allocateSegment(stack);

            assertEquals(int8_t.get(segment, 0L), (byte)0);
            assertEquals(uint8_t.get(segment, 0L), (byte)0);

            int8_t.set(segment, 0, Byte.MIN_VALUE);

            assertEquals(segment.get(ValueLayout.JAVA_BYTE, 0), Byte.MIN_VALUE);
            assertEquals(int8_t.get(segment, 0), Byte.MIN_VALUE);
            assertEquals(int8_t.get32(segment, 0), -128);

            uint8_t.set(segment, 0, Byte.MIN_VALUE);

            assertEquals(segment.get(ValueLayout.JAVA_BYTE, 0), Byte.MIN_VALUE);
            assertEquals(uint8_t.get(segment, 0), Byte.MIN_VALUE);
            assertEquals(uint8_t.get32(segment, 0), 128);

            int8_t.set(segment, 0, Byte.MAX_VALUE);

            assertEquals(segment.get(ValueLayout.JAVA_BYTE, 0), Byte.MAX_VALUE);
            assertEquals(int8_t.get(segment, 0), Byte.MAX_VALUE);
            assertEquals(int8_t.get32(segment, 0), 127);

            uint8_t.set(segment, 0, Byte.MAX_VALUE);

            assertEquals(segment.get(ValueLayout.JAVA_BYTE, 0), Byte.MAX_VALUE);
            assertEquals(uint8_t.get(segment, 0), Byte.MAX_VALUE);
            assertEquals(uint8_t.get32(segment, 0), 127);

            int8_t.set(segment, 0, (byte)0xFF);

            assertEquals(segment.get(ValueLayout.JAVA_BYTE, 0), -1);
            assertEquals(int8_t.get(segment, 0), -1);
            assertEquals(int8_t.get32(segment, 0), -1);

            uint8_t.set(segment, 0, (byte)0xFF);

            assertEquals(segment.get(ValueLayout.JAVA_BYTE, 0), -1);
            assertEquals(uint8_t.get(segment, 0), -1);
            assertEquals(uint8_t.get32(segment, 0), 0xFF);

            int8_t.set(segment, 0, 0xFF);

            assertEquals(segment.get(ValueLayout.JAVA_BYTE, 0), -1);
            assertEquals(int8_t.get(segment, 0), -1);
            assertEquals(int8_t.get32(segment, 0), -1);

            uint8_t.set(segment, 0, 0xFF);

            assertEquals(segment.get(ValueLayout.JAVA_BYTE, 0), -1);
            assertEquals(uint8_t.get(segment, 0), -1);
            assertEquals(uint8_t.get32(segment, 0), 0xFF);
        }
    }

    public void testShortUnsignedMappings() {
        try (var stack = stackPush()) {
            var segment = uint16_t.allocateSegment(stack);

            assertEquals(int16_t.get(segment, 0L), (short)0);
            assertEquals(uint16_t.get(segment, 0L), (short)0);

            int16_t.set(segment, 0, Short.MIN_VALUE);

            assertEquals(segment.get(ValueLayout.JAVA_SHORT, 0), Short.MIN_VALUE);
            assertEquals(int16_t.get(segment, 0), Short.MIN_VALUE);
            assertEquals(int16_t.get32(segment, 0), -32768);

            uint16_t.set(segment, 0, Short.MIN_VALUE);

            assertEquals(segment.get(ValueLayout.JAVA_SHORT, 0), Short.MIN_VALUE);
            assertEquals(uint16_t.get(segment, 0), Short.MIN_VALUE);
            assertEquals(uint16_t.get32(segment, 0), 32768);

            int16_t.set(segment, 0, Short.MAX_VALUE);

            assertEquals(segment.get(ValueLayout.JAVA_SHORT, 0), Short.MAX_VALUE);
            assertEquals(int16_t.get(segment, 0), Short.MAX_VALUE);
            assertEquals(int16_t.get32(segment, 0), 32767);

            uint16_t.set(segment, 0, Short.MAX_VALUE);

            assertEquals(segment.get(ValueLayout.JAVA_SHORT, 0), Short.MAX_VALUE);
            assertEquals(uint16_t.get(segment, 0), Short.MAX_VALUE);
            assertEquals(uint16_t.get32(segment, 0), 32767);

            int16_t.set(segment, 0, (short)0xFFFF);

            assertEquals(segment.get(ValueLayout.JAVA_SHORT, 0), -1);
            assertEquals(int16_t.get(segment, 0), -1);
            assertEquals(int16_t.get32(segment, 0), -1);

            uint16_t.set(segment, 0, (short)0xFFFF);

            assertEquals(segment.get(ValueLayout.JAVA_SHORT, 0), -1);
            assertEquals(uint16_t.get(segment, 0), -1);
            assertEquals(uint16_t.get32(segment, 0), 0xFFFF);

            int16_t.set(segment, 0, 0xFFFF);

            assertEquals(segment.get(ValueLayout.JAVA_SHORT, 0), -1);
            assertEquals(int16_t.get(segment, 0), -1);
            assertEquals(int16_t.get32(segment, 0), -1);

            uint16_t.set(segment, 0, 0xFFFF);

            assertEquals(segment.get(ValueLayout.JAVA_SHORT, 0), -1);
            assertEquals(uint16_t.get(segment, 0), -1);
            assertEquals(uint16_t.get32(segment, 0), 0xFFFF);
        }
    }

    public void testIntUnsignedMappings() {
        try (var stack = stackPush()) {
            var segment = uint32_t.allocateSegment(stack);

            assertEquals(int32_t.get(segment, 0L), (byte)0);
            assertEquals(uint32_t.get(segment, 0L), (byte)0);

            int32_t.set(segment, 0, Integer.MIN_VALUE);

            assertEquals(segment.get(ValueLayout.JAVA_INT, 0), Integer.MIN_VALUE);
            assertEquals(int32_t.get(segment, 0), Integer.MIN_VALUE);
            assertEquals(int32_t.get64(segment, 0), -2147483648L);

            uint32_t.set(segment, 0, Integer.MIN_VALUE);

            assertEquals(segment.get(ValueLayout.JAVA_INT, 0), Integer.MIN_VALUE);
            assertEquals(uint32_t.get(segment, 0), Integer.MIN_VALUE);
            assertEquals(uint32_t.get64(segment, 0), 2147483648L);

            int32_t.set(segment, 0, Integer.MAX_VALUE);

            assertEquals(segment.get(ValueLayout.JAVA_INT, 0), Integer.MAX_VALUE);
            assertEquals(int32_t.get(segment, 0), Integer.MAX_VALUE);
            assertEquals(int32_t.get64(segment, 0), 2147483647L);

            uint32_t.set(segment, 0, Integer.MAX_VALUE);

            assertEquals(segment.get(ValueLayout.JAVA_INT, 0), Integer.MAX_VALUE);
            assertEquals(uint32_t.get(segment, 0), Integer.MAX_VALUE);
            assertEquals(uint32_t.get64(segment, 0), 2147483647L);

            int32_t.set(segment, 0, (int)0xFFFF_FFFFL);

            assertEquals(segment.get(ValueLayout.JAVA_INT, 0), -1);
            assertEquals(int32_t.get(segment, 0), -1);
            assertEquals(int32_t.get64(segment, 0), -1L);

            uint32_t.set(segment, 0, (int)0xFFFF_FFFFL);

            assertEquals(segment.get(ValueLayout.JAVA_INT, 0), -1);
            assertEquals(uint32_t.get(segment, 0), -1);
            assertEquals(uint32_t.get64(segment, 0), 0xFFFF_FFFFL);

            int32_t.set(segment, 0, 0xFFFF_FFFFL);

            assertEquals(segment.get(ValueLayout.JAVA_INT, 0), -1);
            assertEquals(int32_t.get(segment, 0), -1);
            assertEquals(int32_t.get64(segment, 0), -1L);

            uint32_t.set(segment, 0, 0xFFFF_FFFFL);

            assertEquals(segment.get(ValueLayout.JAVA_INT, 0), -1);
            assertEquals(uint32_t.get(segment, 0), -1);
            assertEquals(uint32_t.get64(segment, 0), 0xFFFF_FFFFL);
        }
    }


}
