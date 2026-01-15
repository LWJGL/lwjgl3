/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm.mapping;

import org.lwjgl.system.ffm.*;

import java.lang.foreign.*;

@SuppressWarnings("MethodMayBeStatic")
public interface Mapping<L extends MemoryLayout> {

    /**
     * Returns the layout associated with this mapping.
     *
     * @return the memory layout
     */
    L layout();

    /**
     * Creates a new instance of this mapping with the specified type name.
     *
     * @return the new mapping
     *
     */
    Mapping<L> typedef(String name);

    /**
     * Creates a new instance of this mapping with the C {@code const} qualifier
     *
     * @return the new mapping
     */
    Mapping<L> cconst();

    /**
     * Creates a pointer mapping that targets this mapping.
     *
     * @return the pointer mapping
     */
    default Pointer p() {
        return new Pointer(layout());
    }

    /**
     * Creates an opaque mapping with the specified name.
     *
     * @param name the type name
     *
     * @return the new mapping
     */
    static Opaque createOpaque(String name) {
        return new Opaque(name);
    }

    /**
     * Creates a boolean mapping with the specified name.
     *
     * @param name the type name
     *
     * @return the new mapping
     */
    static Boolean createBoolean(String name) { return PrimitiveMappings.create(ValueLayout.JAVA_BOOLEAN.withName(name)); }

    /**
     * Creates a byte mapping with the specified name.
     *
     * @param name the type name
     *
     * @return the new mapping
     */
    static Mapping.Byte createByte(String name, boolean signed) { return IntegerMappings.create(ValueLayout.JAVA_BYTE.withName(name), signed); }

    /**
     * Creates a char mapping with the specified name.
     *
     * @param name the type name
     *
     * @return the new mapping
     */
    static Mapping.Char createChar(String name) { return IntegerMappings.create(ValueLayout.JAVA_CHAR.withName(name)); }

    /**
     * Creates a short mapping with the specified name.
     *
     * @param name the type name
     *
     * @return the new mapping
     */
    static Mapping.Short createShort(String name, boolean signed) { return IntegerMappings.create(ValueLayout.JAVA_SHORT.withName(name), signed); }

    /**
     * Creates an int mapping with the specified name.
     *
     * @param name the type name
     *
     * @return the new mapping
     */
    static Mapping.Int createInt(String name, boolean signed) { return IntegerMappings.create(ValueLayout.JAVA_INT.withName(name), signed); }

    /**
     * Creates a long mapping with the specified name.
     *
     * @param name the type name
     *
     * @return the new mapping
     */
    static Mapping.Long createLong(String name, boolean signed) { return IntegerMappings.create(ValueLayout.JAVA_LONG.withName(name), signed); }

    /**
     * Creates a C long mapping with the specified name.
     *
     * @param name the type name
     *
     * @return the new mapping
     */
    static Mapping.CLong createCLong(String name, boolean signed) { return IntegerMappings.createCLong(name, signed); }

    /**
     * Creates a {@code size_t} integer mapping with the specified name.
     *
     * @param name the type name
     *
     * @return the new mapping
     */
    static Size createSize(String name, boolean signed) { return IntegerMappings.create(ValueLayout.ADDRESS.withName(name), signed); }

    /**
     * Creates a float mapping with the specified name.
     *
     * @param name the type name
     *
     * @return the new mapping
     */
    static Float createFloat(String name) { return PrimitiveMappings.create(ValueLayout.JAVA_FLOAT.withName(name)); }

    /**
     * Creates a double mapping with the specified name.
     *
     * @param name the type name
     *
     * @return the new mapping
     */
    static Double createDouble(String name) { return PrimitiveMappings.create(ValueLayout.JAVA_DOUBLE.withName(name)); }

    /** Mapping from {@link ValueLayout#JAVA_BOOLEAN} to C {@code bool}. */
    record Boolean(
        ValueLayout.OfBoolean layout,
        Pointer p
    ) implements PrimitiveMapping<ValueLayout.OfBoolean> {
        public Boolean {
            Mappings.check(layout);
        }
        private Boolean(ValueLayout.OfBoolean layout) {
            this(layout, new Pointer(layout));
        }

        public Boolean(String name) {
            this(ValueLayout.JAVA_BOOLEAN.withName(name));
        }

        @Override public Boolean withByteAlignment(long byteAlignment) { return new Boolean(layout.withByteAlignment(byteAlignment)); }
        @Override public Boolean typedef(String name)                  { return new Boolean(layout.withName(name)); }
        @Override public Mapping<ValueLayout.OfBoolean> cconst()       { return new Boolean(layout.withName(Mappings.nameConst(layout))); }

        public boolean get(MemorySegment segment, long offset)         { return segment.get(ValueLayout.JAVA_BOOLEAN, offset); }
        public boolean getAtIndex(MemorySegment segment, long index)   { return segment.getAtIndex(ValueLayout.JAVA_BOOLEAN, index); }

        public Boolean set(MemorySegment segment, long offset, boolean value) {
            segment.set(ValueLayout.JAVA_BOOLEAN, offset, value);
            return this;
        }

        public Boolean setAtIndex(MemorySegment segment, long index, boolean value) {
            segment.setAtIndex(ValueLayout.JAVA_BOOLEAN, index, value);
            return this;
        }
    }

    /** Mapping from {@link ValueLayout#JAVA_BYTE} to C {@code int8_t} or {@code uint8_t}. */
    sealed interface Byte extends IntegerMapping<ValueLayout.OfByte>
        permits IntegerMappings.ByteS, IntegerMappings.ByteU {

        @Override default Byte withByteAlignment(long byteAlignment) { return IntegerMappings.create(layout().withByteAlignment(byteAlignment), signed()); }
        @Override default Byte typedef(String name)                  { return IntegerMappings.create(layout().withName(name), signed()); }
        @Override default Byte cconst()                              { return IntegerMappings.create(layout().withName(Mappings.nameConst(layout())), signed()); }

        default byte get(MemorySegment segment, long offset)         { return segment.get(ValueLayout.JAVA_BYTE, offset); }
        default byte getAtIndex(MemorySegment segment, long index)   { return segment.getAtIndex(ValueLayout.JAVA_BYTE, index); }

        default Byte set(MemorySegment segment, long offset, byte value) {
            segment.set(ValueLayout.JAVA_BYTE, offset, value);
            return this;
        }
        default Byte setAtIndex(MemorySegment segment, long index, byte value) {
            segment.setAtIndex(ValueLayout.JAVA_BYTE, index, value);
            return this;
        }

        int toInt(byte value);
        byte fromInt(int value);

        default int get32(MemorySegment segment, long offset)                 { return toInt(get(segment, offset)); }
        default int get32AtIndex(MemorySegment segment, long index)           { return toInt(getAtIndex(segment, index)); }

        default Byte set(MemorySegment segment, long offset, int value)       { return set(segment, offset, fromInt(value)); }
        default Byte setAtIndex(MemorySegment segment, long index, int value) { return setAtIndex(segment, index, fromInt(value)); }
    }

    /** Mapping from {@link ValueLayout#JAVA_CHAR} to C {@code uint16_t}. */
    record Char(
        ValueLayout.OfChar layout,
        Pointer p
    ) implements IntegerMapping<ValueLayout.OfChar> {
        public Char {
            Mappings.check(layout);
        }

        @Override public boolean signed() {
            return false;
        }

        @Override public Char withByteAlignment(long byteAlignment)      { return IntegerMappings.create(layout.withByteAlignment(byteAlignment)); }
        @Override public Char typedef(String name)                       { return IntegerMappings.create(layout.withName(name)); }
        @Override public Char cconst()                                   { return IntegerMappings.create(layout.withName(Mappings.nameConst(layout))); }

        public char get(MemorySegment segment, long offset)              { return segment.get(ValueLayout.JAVA_CHAR_UNALIGNED, offset); }
        public char getAtIndex(MemorySegment segment, long index)        { return segment.getAtIndex(ValueLayout.JAVA_CHAR_UNALIGNED, index); }

        public char getAligned(MemorySegment segment, long offset)       { return segment.get(ValueLayout.JAVA_CHAR, offset); }
        public char getAtIndexAligned(MemorySegment segment, long index) { return segment.getAtIndex(ValueLayout.JAVA_CHAR, index); }

        public Char set(MemorySegment segment, long offset, char value) {
            segment.set(ValueLayout.JAVA_CHAR_UNALIGNED, offset, value);
            return this;
        }
        public Char setAtIndex(MemorySegment segment, long index, char value) {
            segment.setAtIndex(ValueLayout.JAVA_CHAR_UNALIGNED, index, value);
            return this;
        }

        public Char setAligned(MemorySegment segment, long offset, char value) {
            segment.set(ValueLayout.JAVA_CHAR, offset, value);
            return this;
        }
        public Char setAtIndexAligned(MemorySegment segment, long index, char value) {
            segment.setAtIndex(ValueLayout.JAVA_CHAR, index, value);
            return this;
        }
    }

    /** Mapping from {@link ValueLayout#JAVA_SHORT} to C {@code int16_t} or {@code uint16_t}. */
    sealed interface Short extends IntegerMapping<ValueLayout.OfShort>
        permits IntegerMappings.ShortS, IntegerMappings.ShortU {
        @Override default Short withByteAlignment(long byteAlignment)      { return IntegerMappings.create(layout().withByteAlignment(byteAlignment), signed()); }
        @Override default Short typedef(String name)                       { return IntegerMappings.create(layout().withName(name), signed()); }
        @Override default Short cconst()                                   { return IntegerMappings.create(layout().withName(Mappings.nameConst(layout())), signed()); }

        default short get(MemorySegment segment, long offset)              { return segment.get(ValueLayout.JAVA_SHORT_UNALIGNED, offset); }
        default short getAtIndex(MemorySegment segment, long index)        { return segment.getAtIndex(ValueLayout.JAVA_SHORT_UNALIGNED, index); }

        default short getAligned(MemorySegment segment, long offset)       { return segment.get(ValueLayout.JAVA_SHORT, offset); }
        default short getAtIndexAligned(MemorySegment segment, long index) { return segment.getAtIndex(ValueLayout.JAVA_SHORT, index); }

        default Short set(MemorySegment segment, long offset, short value) {
            segment.set(ValueLayout.JAVA_SHORT_UNALIGNED, offset, value);
            return this;
        }
        default Short setAtIndex(MemorySegment segment, long index, short value) {
            segment.setAtIndex(ValueLayout.JAVA_SHORT_UNALIGNED, index, value);
            return this;
        }

        default Short setAligned(MemorySegment segment, long offset, short value) {
            segment.set(ValueLayout.JAVA_SHORT, offset, value);
            return this;
        }
        default Short setAtIndexAligned(MemorySegment segment, long index, short value) {
            segment.setAtIndex(ValueLayout.JAVA_SHORT, index, value);
            return this;
        }

        int toInt(short value);
        short fromInt(int value);

        default int get32(MemorySegment segment, long offset)                         { return toInt(get(segment, offset)); }
        default int get32AtIndex(MemorySegment segment, long index)                   { return toInt(getAtIndex(segment, index)); }

        default Short set(MemorySegment segment, long offset, int value)              { return set(segment, offset, fromInt(value)); }
        default Short setAtIndex(MemorySegment segment, long index, int value)        { return setAtIndex(segment, index, fromInt(value)); }

        default int get32Aligned(MemorySegment segment, long offset)                  { return toInt(getAligned(segment, offset)); }
        default int get32AtIndexAligned(MemorySegment segment, long index)            { return toInt(getAtIndexAligned(segment, index)); }

        default Short setAligned(MemorySegment segment, long offset, int value)       { return setAligned(segment, offset, fromInt(value)); }
        default Short setAtIndexAligned(MemorySegment segment, long index, int value) { return setAtIndexAligned(segment, index, fromInt(value)); }
    }

    /** Mapping from {@link ValueLayout#JAVA_INT} to C {@code int32_t} or {@code uint32_t}. */
    sealed interface Int extends IntegerMapping<ValueLayout.OfInt>
        permits IntegerMappings.IntS, IntegerMappings.IntU {
        @Override default Int withByteAlignment(long byteAlignment)      { return IntegerMappings.create(layout().withByteAlignment(byteAlignment), signed()); }
        @Override default Int typedef(String name)                       { return IntegerMappings.create(layout().withName(name), signed()); }
        @Override default Int cconst()                                   { return IntegerMappings.create(layout().withName(Mappings.nameConst(layout())), signed()); }

        default int get(MemorySegment segment, long offset)              { return segment.get(ValueLayout.JAVA_INT_UNALIGNED, offset); }
        default int getAtIndex(MemorySegment segment, long index)        { return segment.getAtIndex(ValueLayout.JAVA_INT_UNALIGNED, index); }

        default int getAligned(MemorySegment segment, long offset)       { return segment.get(ValueLayout.JAVA_INT, offset); }
        default int getAtIndexAligned(MemorySegment segment, long index) { return segment.getAtIndex(ValueLayout.JAVA_INT, index); }

        default Int set(MemorySegment segment, long offset, int value) {
            segment.set(ValueLayout.JAVA_INT_UNALIGNED, offset, value);
            return this;
        }
        default Int setAtIndex(MemorySegment segment, long index, int value) {
            segment.setAtIndex(ValueLayout.JAVA_INT_UNALIGNED, index, value);
            return this;
        }

        default Int setAligned(MemorySegment segment, long offset, int value) {
            segment.set(ValueLayout.JAVA_INT, offset, value);
            return this;
        }
        default Int setAtIndexAligned(MemorySegment segment, long index, int value) {
            segment.setAtIndex(ValueLayout.JAVA_INT, index, value);
            return this;
        }

        long toLong(int value);
        int fromLong(long value);

        default long get64(MemorySegment segment, long offset)                       { return toLong(get(segment, offset)); }
        default long get64AtIndex(MemorySegment segment, long index)                 { return toLong(getAtIndex(segment, index)); }

        default Int set(MemorySegment segment, long offset, long value)              { return set(segment, offset, fromLong(value)); }
        default Int setAtIndex(MemorySegment segment, long index, long value)        { return setAtIndex(segment, index, fromLong(value)); }

        default long get64Aligned(MemorySegment segment, long offset)                { return toLong(getAligned(segment, offset)); }
        default long get64AtIndexAligned(MemorySegment segment, long index)          { return toLong(getAtIndexAligned(segment, index)); }

        default Int setAligned(MemorySegment segment, long offset, long value)       { return setAligned(segment, offset, fromLong(value)); }
        default Int setAtIndexAligned(MemorySegment segment, long index, long value) { return setAtIndexAligned(segment, index, fromLong(value)); }
    }

    /** Mapping from {@link ValueLayout#JAVA_LONG} to C {@code int64_t} or {@code uint64_t}. */
    sealed interface Long extends IntegerMapping<ValueLayout.OfLong>
        permits IntegerMappings.LongS, IntegerMappings.LongU {
        @Override default Long withByteAlignment(long byteAlignment)      { return IntegerMappings.create(layout().withByteAlignment(byteAlignment), signed()); }
        @Override default Long typedef(String name)                       { return IntegerMappings.create(layout().withName(name), signed()); }
        @Override default Long cconst()                                   { return IntegerMappings.create(layout().withName(Mappings.nameConst(layout())), signed()); }

        default long get(MemorySegment segment, long offset)              { return segment.get(ValueLayout.JAVA_LONG_UNALIGNED, offset); }
        default long getAtIndex(MemorySegment segment, long index)        { return segment.getAtIndex(ValueLayout.JAVA_LONG_UNALIGNED, index); }

        default long getAligned(MemorySegment segment, long offset)       { return segment.get(ValueLayout.JAVA_LONG, offset); }
        default long getAtIndexAligned(MemorySegment segment, long index) { return segment.getAtIndex(ValueLayout.JAVA_LONG, index); }

        default Long set(MemorySegment segment, long offset, long value) {
            segment.set(ValueLayout.JAVA_LONG_UNALIGNED, offset, value);
            return this;
        }
        default Long setAtIndex(MemorySegment segment, long index, long value) {
            segment.setAtIndex(ValueLayout.JAVA_LONG_UNALIGNED, index, value);
            return this;
        }

        default Long setAligned(MemorySegment segment, long offset, long value) {
            segment.set(ValueLayout.JAVA_LONG, offset, value);
            return this;
        }
        default Long setAtIndexAligned(MemorySegment segment, long index, long value) {
            segment.setAtIndex(ValueLayout.JAVA_LONG, index, value);
            return this;
        }
    }

    /** Mapping from either {@link ValueLayout#JAVA_INT} or {@link ValueLayout#JAVA_LONG} to C {@code long} or {@code unsigned long}. */
    sealed interface CLong extends IntegerMapping<ValueLayout>
        permits IntegerMappings.CLong32, IntegerMappings.CLong64 {
        @Override CLong withByteAlignment(long byteAlignment);
        @Override CLong typedef(String name);
        @Override CLong cconst();

        long get(MemorySegment segment, long offset);
        long getAtIndex(MemorySegment segment, long index);

        long getAligned(MemorySegment segment, long offset);
        long getAtIndexAligned(MemorySegment segment, long index);

        CLong set(MemorySegment segment, long offset, long value);
        CLong setAtIndex(MemorySegment segment, long index, long value);

        CLong setAligned(MemorySegment segment, long offset, long value);
        CLong setAtIndexAligned(MemorySegment segment, long index, long value);
    }

    /** Mapping from {@link ValueLayout#ADDRESS} to an integer of {@code sizeof(size_t)} bytes. */
    sealed interface Size extends IntegerMapping<AddressLayout>
        permits IntegerMappings.SizeS, IntegerMappings.SizeU {
        @Override default Size withByteAlignment(long byteAlignment)      { return IntegerMappings.create(layout().withByteAlignment(byteAlignment), signed()); }
        @Override default Size typedef(String name)                       { return IntegerMappings.create(layout().withName(name), signed()); }
        @Override default Size cconst()                                   { return IntegerMappings.create(layout().withName(Mappings.nameConst(layout())), signed()); }

        default long get(MemorySegment segment, long offset)              { return segment.get(ValueLayout.ADDRESS_UNALIGNED, offset).address(); }
        default long getAtIndex(MemorySegment segment, long index)        { return segment.getAtIndex(ValueLayout.ADDRESS_UNALIGNED, index).address(); }

        default long getAligned(MemorySegment segment, long offset)       { return segment.get(ValueLayout.ADDRESS, offset).address(); }
        default long getAtIndexAligned(MemorySegment segment, long index) { return segment.getAtIndex(ValueLayout.ADDRESS, index).address(); }

        default Size set(MemorySegment segment, long offset, long value) {
            segment.set(ValueLayout.ADDRESS_UNALIGNED, offset, MemorySegment.ofAddress(value));
            return this;
        }
        default Size setAtIndex(MemorySegment segment, long index, long value) {
            segment.setAtIndex(ValueLayout.ADDRESS_UNALIGNED, index, MemorySegment.ofAddress(value));
            return this;
        }

        default Size setAligned(MemorySegment segment, long offset, long value) {
            segment.set(ValueLayout.ADDRESS, offset, MemorySegment.ofAddress(value));
            return this;
        }
        default Size setAtIndexAligned(MemorySegment segment, long index, long value) {
            segment.setAtIndex(ValueLayout.ADDRESS, index, MemorySegment.ofAddress(value));
            return this;
        }
    }

    /** Mapping from {@link ValueLayout#JAVA_FLOAT} to C {@code float}. */
    record Float(
        ValueLayout.OfFloat layout,
        Pointer p
    ) implements PrimitiveMapping<ValueLayout.OfFloat> {
        public Float {
            Mappings.check(layout);
        }

        @Override public Float withByteAlignment(long byteAlignment)      { return PrimitiveMappings.create(layout.withByteAlignment(byteAlignment)); }
        @Override public Float typedef(String name)                       { return PrimitiveMappings.create(layout.withName(name)); }
        @Override public Float cconst()                                   { return PrimitiveMappings.create(layout.withName(Mappings.nameConst(layout))); }

        public float get(MemorySegment segment, long offset)              { return segment.get(ValueLayout.JAVA_FLOAT_UNALIGNED, offset); }
        public float getAligned(MemorySegment segment, long offset)       { return segment.get(ValueLayout.JAVA_FLOAT, offset); }

        public float getAtIndex(MemorySegment segment, long index)        { return segment.getAtIndex(ValueLayout.JAVA_FLOAT_UNALIGNED, index); }
        public float getAtIndexAligned(MemorySegment segment, long index) { return segment.getAtIndex(ValueLayout.JAVA_FLOAT, index); }

        public Float set(MemorySegment segment, long offset, float value) {
            segment.set(ValueLayout.JAVA_FLOAT_UNALIGNED, offset, value);
            return this;
        }

        public Float setAligned(MemorySegment segment, long offset, float value) {
            segment.set(ValueLayout.JAVA_FLOAT, offset, value);
            return this;
        }

        public Float setAtIndex(MemorySegment segment, long index, float value) {
            segment.setAtIndex(ValueLayout.JAVA_FLOAT_UNALIGNED, index, value);
            return this;
        }

        public Float setAtIndexAligned(MemorySegment segment, long index, float value) {
            segment.setAtIndex(ValueLayout.JAVA_FLOAT, index, value);
            return this;
        }
    }

    /** Mapping from {@link ValueLayout#JAVA_DOUBLE} to C {@code double}. */
    record Double(
        ValueLayout.OfDouble layout,
        Pointer p
    ) implements PrimitiveMapping<ValueLayout.OfDouble> {
        public Double {
            Mappings.check(layout);
        }

        @Override public Double withByteAlignment(long byteAlignment)      { return PrimitiveMappings.create(layout.withByteAlignment(byteAlignment)); }
        @Override public Double typedef(String name)                       { return PrimitiveMappings.create(layout.withName(name)); }
        @Override public Double cconst()                                   { return PrimitiveMappings.create(layout().withName(Mappings.nameConst(layout()))); }

        public double get(MemorySegment segment, long offset)              { return segment.get(ValueLayout.JAVA_DOUBLE_UNALIGNED, offset); }
        public double getAligned(MemorySegment segment, long offset)       { return segment.get(ValueLayout.JAVA_DOUBLE, offset); }

        public double getAtIndex(MemorySegment segment, long index)        { return segment.getAtIndex(ValueLayout.JAVA_DOUBLE_UNALIGNED, index); }
        public double getAtIndexAligned(MemorySegment segment, long index) { return segment.getAtIndex(ValueLayout.JAVA_DOUBLE, index); }

        public Double set(MemorySegment segment, long offset, double value) {
            segment.set(ValueLayout.JAVA_DOUBLE_UNALIGNED, offset, value);
            return this;
        }

        public Double setAligned(MemorySegment segment, long offset, double value) {
            segment.set(ValueLayout.JAVA_DOUBLE, offset, value);
            return this;
        }

        public Double setAtIndex(MemorySegment segment, long index, double value) {
            segment.setAtIndex(ValueLayout.JAVA_DOUBLE_UNALIGNED, index, value);
            return this;
        }

        public Double setAtIndexAligned(MemorySegment segment, long index, double value) {
            segment.setAtIndex(ValueLayout.JAVA_DOUBLE, index, value);
            return this;
        }
    }

    record Opaque(AddressLayout layout) implements Mapping<AddressLayout> {
        public Opaque {
            Mappings.check(layout);
        }

        Opaque(String name) {
            this(ValueLayout.ADDRESS.withName(name));
        }

        @Override public Opaque typedef(String name) { return new Opaque(name); }
        @Override public Opaque cconst()             { return new Opaque(layout().withName(Mappings.nameConst(layout()))); }
    }

    /** Mapping from {@link ValueLayout#ADDRESS} to a C pointer. */
    record Pointer(AddressLayout layout) implements DataMapping<AddressLayout> {
        public Pointer {
            Mappings.check(layout);
            if (layout.targetLayout().isEmpty()) {
                throw new IllegalArgumentException("Pointer layout must have a target layout");
            }
        }

        Pointer(MemoryLayout targetLayout) {
            var name = targetLayout.name().orElseThrow();
            this(name + (name.endsWith("*") ? "*" : " *"), targetLayout);
        }

        private Pointer(String name, MemoryLayout targetLayout) {
            this(ValueLayout.ADDRESS
                .withTargetLayout(targetLayout)
                .withName(name));
        }

        @Override public Pointer withByteAlignment(long byteAlignment) { return new Pointer(layout.withByteAlignment(byteAlignment)); }
        @Override public Pointer typedef(String name)                  { return new Pointer(layout.withName(name)); }
        @Override public Mapping<AddressLayout> cconst()               { return new Pointer(layout.withName(Mappings.nameConst(layout))); }
    }

    /** Mapping from {@link SequenceLayout} to a C array. */
    record Sequence(SequenceLayout layout) implements DataMapping<SequenceLayout> {
        public Sequence {
            Mappings.check(layout);
        }
        public Sequence(DataMapping<?> elementMapping, long elementCount) {
            var name = elementMapping.layout().name().orElseThrow();
            this(name + "[" + elementCount + "]", elementMapping, elementCount);
        }

        public Sequence(String name, DataMapping<?> elementMapping, long elementCount) {
            this(name, elementMapping.layout(), elementCount);
        }

        private Sequence(String name, MemoryLayout elementLayout, long elementCount) {
            this(MemoryLayout
                .sequenceLayout(elementCount, elementLayout)
                .withName(name)
            );
        }

        @Override public Sequence withByteAlignment(long byteAlignment) { return new Sequence(layout.withByteAlignment(byteAlignment)); }
        @Override public Sequence typedef(String name)                  { return new Sequence(layout.withName(name)); }
        @Override public Sequence cconst()                              { return new Sequence(layout.withName(Mappings.nameConst(layout))); }
    }

    /**
     * Mapping from {@link StructLayout} to a C struct.
     *
     * <p>Using a {@link StructBinder} directly is usually preferred over this mapping.</p>
     */
    record Struct(StructLayout layout) implements GroupMapping<StructLayout> {
        public Struct {
            Mappings.check(layout);
        }
        public Struct(String name, StructLayout layout) {
            this(layout.withName(name));
        }

        @Override public Struct withByteAlignment(long byteAlignment) { return new Struct(layout.withByteAlignment(byteAlignment)); }
        @Override public Struct typedef(String name)                  { return new Struct(layout.withName(name)); }
        @Override public Struct cconst()                              { return new Struct(layout.withName(Mappings.nameConst(layout))); }
    }

    /**
     * Mapping from {@link UnionLayout} to a C union.
     *
     * <p>Using a {@link UnionBinder} directly is usually preferred over this mapping.</p>
     *
     */
    record Union(UnionLayout layout) implements GroupMapping<UnionLayout> {
        public Union {
            Mappings.check(layout);
        }
        public Union(String name, UnionLayout layout) {
            this(layout.withName(name));
        }

        @Override public Union withByteAlignment(long byteAlignment) { return new Union(layout.withByteAlignment(byteAlignment)); }
        @Override public Union typedef(String name)                  { return new Union(layout.withName(name)); }
        @Override public Union cconst()                              { return new Union(layout.withName(Mappings.nameConst(layout))); }
    }

}