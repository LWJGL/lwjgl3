/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm.mapping;

import java.lang.foreign.*;

final class IntegerMappings {

    private IntegerMappings() { }

    static Mapping.Byte create(ValueLayout.OfByte layout, boolean signed) {
        var p = new Mapping.Pointer(layout);
        return signed
            ? new ByteS(layout, p)
            : new ByteU(layout, p);
    }
    record ByteS(ValueLayout.OfByte layout, Pointer p) implements Mapping.Byte {
        @Override public boolean signed()        { return true; }
        @Override public int toInt(byte value)   { return value; }
        @Override public byte fromInt(int value) { return (byte)value; }
    }
    record ByteU(ValueLayout.OfByte layout, Pointer p) implements Mapping.Byte {
        @Override public boolean signed()        { return false; }
        @Override public int toInt(byte value)   { return java.lang.Byte.toUnsignedInt(value); }
        @Override public byte fromInt(int value) { return (byte)(value & 0xFF); }
    }

    static Mapping.Char create(ValueLayout.OfChar layout) {
        return new Mapping.Char(layout, new Mapping.Pointer(layout));
    }

    static Mapping.Short create(ValueLayout.OfShort layout, boolean signed) {
        var p = new Mapping.Pointer(layout);
        return signed
            ? new ShortS(layout, p)
            : new ShortU(layout, p);
    }
    record ShortS(ValueLayout.OfShort layout, Pointer p) implements Mapping.Short {
        @Override public boolean signed()         { return true; }
        @Override public int toInt(short value)   { return value; }
        @Override public short fromInt(int value) { return (short)value; }
    }
    record ShortU(ValueLayout.OfShort layout, Pointer p) implements Mapping.Short {
        @Override public boolean signed()         { return false; }
        @Override public int toInt(short value)   { return java.lang.Short.toUnsignedInt(value); }
        @Override public short fromInt(int value) { return (short)(value & 0xFFFF); }
    }

    static Mapping.Int create(ValueLayout.OfInt layout, boolean signed) {
        var p = new Mapping.Pointer(layout);
        return signed
            ? new IntS(layout, p)
            : new IntU(layout, p);
    }
    record IntS(ValueLayout.OfInt layout, Pointer p) implements Mapping.Int {
        @Override public boolean signed()         { return true; }
        @Override public long toLong(int value)   { return value; }
        @Override public int fromLong(long value) { return (int)value; }
    }
    record IntU(ValueLayout.OfInt layout, Pointer p) implements Mapping.Int {
        @Override public boolean signed()         { return false; }
        @Override public long toLong(int value)   { return Integer.toUnsignedLong(value); }
        @Override public int fromLong(long value) { return (int)(value & 0xFFFF_FFFFL); }
    }

    static Mapping.Long create(ValueLayout.OfLong layout, boolean signed) {
        var p = new Mapping.Pointer(layout);
        return signed
            ? new LongS(layout, p)
            : new LongU(layout, p);
    }
    record LongS(ValueLayout.OfLong layout, Pointer p) implements Mapping.Long {
        @Override public boolean signed() { return true; }
    }
    record LongU(ValueLayout.OfLong layout, Pointer p) implements Mapping.Long {
        @Override public boolean signed() { return false; }
    }

    static Mapping.CLong createCLong(String name, boolean signed) {
        if (org.lwjgl.system.Pointer.CLONG_SIZE == 4) {
            var layout = ValueLayout.JAVA_INT.withName(name);
            var p      = new Mapping.Pointer(layout);
            return signed
                ? new CLong32S(layout, p)
                : new CLong32U(layout, p);
        } else {
            var layout = ValueLayout.JAVA_LONG.withName(name);
            var p      = new Mapping.Pointer(layout);
            return new CLong64Impl(layout, p, signed);
        }
    }

    sealed interface CLong32 extends Mapping.CLong permits CLong32S, CLong32U {
        static CLong create(ValueLayout.OfInt layout, boolean signed) {
            var p = new Mapping.Pointer(layout);
            return signed
                ? new CLong32S(layout, p)
                : new CLong32U(layout, p);
        }
    }
    sealed interface CLong64 extends Mapping.CLong permits CLong64Impl {
        static Mapping.CLong create(ValueLayout.OfLong layout, boolean signed) {
            return new CLong64Impl(layout, new Mapping.Pointer(layout), signed);
        }
    }

    record CLong32S(ValueLayout.OfInt layout, Pointer p) implements CLong32 {
        @Override public boolean signed()                                          { return true; }

        @Override public CLong withByteAlignment(long byteAlignment)               { return CLong32.create(layout.withByteAlignment(byteAlignment), true); }
        @Override public CLong typedef(String name)                                { return CLong32.create(layout.withName(name), true); }
        @Override public CLong cconst()                                            { return CLong32.create(layout.withName(Mappings.nameConst(layout)), true); }

        @Override public long get(MemorySegment segment, long offset)              { return segment.get(ValueLayout.JAVA_INT_UNALIGNED, offset); }
        @Override public long getAtIndex(MemorySegment segment, long index)        { return segment.getAtIndex(ValueLayout.JAVA_INT_UNALIGNED, index); }

        @Override public long getAligned(MemorySegment segment, long offset)       { return segment.get(ValueLayout.JAVA_INT, offset); }
        @Override public long getAtIndexAligned(MemorySegment segment, long index) { return segment.getAtIndex(ValueLayout.JAVA_INT, index); }

        @Override public CLong set(MemorySegment segment, long offset, long value) {
            segment.set(ValueLayout.JAVA_INT_UNALIGNED, offset, (int)value);
            return this;
        }

        @Override public CLong setAtIndex(MemorySegment segment, long index, long value) {
            segment.setAtIndex(ValueLayout.JAVA_INT_UNALIGNED, index, (int)value);
            return this;
        }

        @Override public CLong setAligned(MemorySegment segment, long offset, long value) {
            segment.set(ValueLayout.JAVA_INT, offset, (int)value);
            return this;
        }

        @Override public CLong setAtIndexAligned(MemorySegment segment, long index, long value) {
            segment.setAtIndex(ValueLayout.JAVA_INT, index, (int)value);
            return this;
        }
    }
    record CLong32U(ValueLayout.OfInt layout, Pointer p) implements CLong32 {
        @Override public boolean signed()                                          { return false; }

        @Override public CLong withByteAlignment(long byteAlignment)               { return CLong32.create(layout.withByteAlignment(byteAlignment), false); }
        @Override public CLong typedef(String name)                                { return CLong32.create(layout.withName(name), false); }
        @Override public CLong cconst()                                            { return CLong32.create(layout.withName(Mappings.nameConst(layout)), false); }

        @Override public long get(MemorySegment segment, long offset)              { return Integer.toUnsignedLong(segment.get(ValueLayout.JAVA_INT_UNALIGNED, offset)); }
        @Override public long getAtIndex(MemorySegment segment, long index)        { return Integer.toUnsignedLong(segment.getAtIndex(ValueLayout.JAVA_INT_UNALIGNED, index)); }

        @Override public long getAligned(MemorySegment segment, long offset)       { return Integer.toUnsignedLong(segment.get(ValueLayout.JAVA_INT, offset)); }
        @Override public long getAtIndexAligned(MemorySegment segment, long index) { return Integer.toUnsignedLong(segment.getAtIndex(ValueLayout.JAVA_INT, index)); }

        @Override public CLong set(MemorySegment segment, long offset, long value) {
            segment.set(ValueLayout.JAVA_INT_UNALIGNED, offset, (int)(value & 0xFFFF_FFFFL));
            return this;
        }

        @Override public CLong setAtIndex(MemorySegment segment, long index, long value) {
            segment.setAtIndex(ValueLayout.JAVA_INT_UNALIGNED, index, (int)(value & 0xFFFF_FFFFL));
            return this;
        }

        @Override public CLong setAligned(MemorySegment segment, long offset, long value) {
            segment.set(ValueLayout.JAVA_INT, offset, (int)(value & 0xFFFF_FFFFL));
            return this;
        }

        @Override public CLong setAtIndexAligned(MemorySegment segment, long index, long value) {
            segment.setAtIndex(ValueLayout.JAVA_INT, index, (int)(value & 0xFFFF_FFFFL));
            return this;
        }
    }

    record CLong64Impl(ValueLayout.OfLong layout, Pointer p, boolean signed) implements CLong64 {
        @Override public CLong withByteAlignment(long byteAlignment)               { return CLong64.create(layout.withByteAlignment(byteAlignment), signed); }
        @Override public CLong typedef(String name)                                { return CLong64.create(layout.withName(name), signed); }
        @Override public CLong cconst()                                            { return CLong64.create(layout.withName(Mappings.nameConst(layout)), signed); }

        @Override public long get(MemorySegment segment, long offset)              { return segment.get(ValueLayout.JAVA_LONG_UNALIGNED, offset); }
        @Override public long getAtIndex(MemorySegment segment, long index)        { return segment.getAtIndex(ValueLayout.JAVA_LONG_UNALIGNED, index); }

        @Override public long getAligned(MemorySegment segment, long offset)       { return segment.get(ValueLayout.JAVA_LONG, offset); }
        @Override public long getAtIndexAligned(MemorySegment segment, long index) { return segment.getAtIndex(ValueLayout.JAVA_LONG, index); }

        @Override public CLong set(MemorySegment segment, long offset, long value) {
            segment.set(ValueLayout.JAVA_LONG_UNALIGNED, offset, value);
            return this;
        }

        @Override public CLong setAtIndex(MemorySegment segment, long index, long value) {
            segment.setAtIndex(ValueLayout.JAVA_LONG_UNALIGNED, index, value);
            return this;
        }

        @Override public CLong setAligned(MemorySegment segment, long offset, long value) {
            segment.set(ValueLayout.JAVA_LONG, offset, value);
            return this;
        }

        @Override public CLong setAtIndexAligned(MemorySegment segment, long index, long value) {
            segment.setAtIndex(ValueLayout.JAVA_LONG, index, value);
            return this;
        }
    }

    static Mapping.Size create(AddressLayout layout, boolean signed) {
        var p = new Mapping.Pointer((MemoryLayout)layout);
        return signed
            ? new SizeS(layout, p)
            : new SizeU(layout, p);
    }
    record SizeS(AddressLayout layout, Pointer p) implements Mapping.Size {
        @Override public boolean signed() { return true; }
    }
    record SizeU(AddressLayout layout, Pointer p) implements Mapping.Size {
        @Override public boolean signed() { return false; }
    }

}
