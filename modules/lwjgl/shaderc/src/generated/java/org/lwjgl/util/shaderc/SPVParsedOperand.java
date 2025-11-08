/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.shaderc;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct spv_parsed_operand_t {
 *     uint16_t offset;
 *     uint16_t num_words;
 *     spv_operand_type_t type;
 *     spv_number_kind_t number_kind;
 *     uint32_t number_bit_width;
 *     spv_fp_encoding_t fp_encoding;
 * }}</pre>
 */
@NativeType("struct spv_parsed_operand_t")
public class SPVParsedOperand extends Struct<SPVParsedOperand> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        OFFSET,
        NUM_WORDS,
        TYPE,
        NUMBER_KIND,
        NUMBER_BIT_WIDTH,
        FP_ENCODING;

    static {
        Layout layout = __struct(
            __member(2),
            __member(2),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        OFFSET = layout.offsetof(0);
        NUM_WORDS = layout.offsetof(1);
        TYPE = layout.offsetof(2);
        NUMBER_KIND = layout.offsetof(3);
        NUMBER_BIT_WIDTH = layout.offsetof(4);
        FP_ENCODING = layout.offsetof(5);
    }

    protected SPVParsedOperand(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SPVParsedOperand create(long address, @Nullable ByteBuffer container) {
        return new SPVParsedOperand(address, container);
    }

    /**
     * Creates a {@code SPVParsedOperand} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SPVParsedOperand(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code offset} field. */
    @NativeType("uint16_t")
    public short offset() { return noffset(address()); }
    /** @return the value of the {@code num_words} field. */
    @NativeType("uint16_t")
    public short num_words() { return nnum_words(address()); }
    /** @return the value of the {@code type} field. */
    @NativeType("spv_operand_type_t")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code number_kind} field. */
    @NativeType("spv_number_kind_t")
    public int number_kind() { return nnumber_kind(address()); }
    /** @return the value of the {@code number_bit_width} field. */
    @NativeType("uint32_t")
    public int number_bit_width() { return nnumber_bit_width(address()); }
    /** @return the value of the {@code fp_encoding} field. */
    @NativeType("spv_fp_encoding_t")
    public int fp_encoding() { return nfp_encoding(address()); }

    /** Sets the specified value to the {@code offset} field. */
    public SPVParsedOperand offset(@NativeType("uint16_t") short value) { noffset(address(), value); return this; }
    /** Sets the specified value to the {@code num_words} field. */
    public SPVParsedOperand num_words(@NativeType("uint16_t") short value) { nnum_words(address(), value); return this; }
    /** Sets the specified value to the {@code type} field. */
    public SPVParsedOperand type(@NativeType("spv_operand_type_t") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code number_kind} field. */
    public SPVParsedOperand number_kind(@NativeType("spv_number_kind_t") int value) { nnumber_kind(address(), value); return this; }
    /** Sets the specified value to the {@code number_bit_width} field. */
    public SPVParsedOperand number_bit_width(@NativeType("uint32_t") int value) { nnumber_bit_width(address(), value); return this; }
    /** Sets the specified value to the {@code fp_encoding} field. */
    public SPVParsedOperand fp_encoding(@NativeType("spv_fp_encoding_t") int value) { nfp_encoding(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SPVParsedOperand set(
        short offset,
        short num_words,
        int type,
        int number_kind,
        int number_bit_width,
        int fp_encoding
    ) {
        offset(offset);
        num_words(num_words);
        type(type);
        number_kind(number_kind);
        number_bit_width(number_bit_width);
        fp_encoding(fp_encoding);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SPVParsedOperand set(SPVParsedOperand src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SPVParsedOperand} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SPVParsedOperand malloc() {
        return new SPVParsedOperand(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SPVParsedOperand} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SPVParsedOperand calloc() {
        return new SPVParsedOperand(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SPVParsedOperand} instance allocated with {@link BufferUtils}. */
    public static SPVParsedOperand create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SPVParsedOperand(memAddress(container), container);
    }

    /** Returns a new {@code SPVParsedOperand} instance for the specified memory address. */
    public static SPVParsedOperand create(long address) {
        return new SPVParsedOperand(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SPVParsedOperand createSafe(long address) {
        return address == NULL ? null : new SPVParsedOperand(address, null);
    }

    /**
     * Returns a new {@link SPVParsedOperand.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SPVParsedOperand.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SPVParsedOperand.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SPVParsedOperand.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SPVParsedOperand.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SPVParsedOperand.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SPVParsedOperand.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SPVParsedOperand.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SPVParsedOperand.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SPVParsedOperand} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SPVParsedOperand malloc(MemoryStack stack) {
        return new SPVParsedOperand(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SPVParsedOperand} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SPVParsedOperand calloc(MemoryStack stack) {
        return new SPVParsedOperand(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SPVParsedOperand.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SPVParsedOperand.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SPVParsedOperand.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SPVParsedOperand.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #offset}. */
    public static short noffset(long struct) { return memGetShort(struct + SPVParsedOperand.OFFSET); }
    /** Unsafe version of {@link #num_words}. */
    public static short nnum_words(long struct) { return memGetShort(struct + SPVParsedOperand.NUM_WORDS); }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + SPVParsedOperand.TYPE); }
    /** Unsafe version of {@link #number_kind}. */
    public static int nnumber_kind(long struct) { return memGetInt(struct + SPVParsedOperand.NUMBER_KIND); }
    /** Unsafe version of {@link #number_bit_width}. */
    public static int nnumber_bit_width(long struct) { return memGetInt(struct + SPVParsedOperand.NUMBER_BIT_WIDTH); }
    /** Unsafe version of {@link #fp_encoding}. */
    public static int nfp_encoding(long struct) { return memGetInt(struct + SPVParsedOperand.FP_ENCODING); }

    /** Unsafe version of {@link #offset(short) offset}. */
    public static void noffset(long struct, short value) { memPutShort(struct + SPVParsedOperand.OFFSET, value); }
    /** Unsafe version of {@link #num_words(short) num_words}. */
    public static void nnum_words(long struct, short value) { memPutShort(struct + SPVParsedOperand.NUM_WORDS, value); }
    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + SPVParsedOperand.TYPE, value); }
    /** Unsafe version of {@link #number_kind(int) number_kind}. */
    public static void nnumber_kind(long struct, int value) { memPutInt(struct + SPVParsedOperand.NUMBER_KIND, value); }
    /** Unsafe version of {@link #number_bit_width(int) number_bit_width}. */
    public static void nnumber_bit_width(long struct, int value) { memPutInt(struct + SPVParsedOperand.NUMBER_BIT_WIDTH, value); }
    /** Unsafe version of {@link #fp_encoding(int) fp_encoding}. */
    public static void nfp_encoding(long struct, int value) { memPutInt(struct + SPVParsedOperand.FP_ENCODING, value); }

    // -----------------------------------

    /** An array of {@link SPVParsedOperand} structs. */
    public static class Buffer extends StructBuffer<SPVParsedOperand, Buffer> implements NativeResource {

        private static final SPVParsedOperand ELEMENT_FACTORY = SPVParsedOperand.create(-1L);

        /**
         * Creates a new {@code SPVParsedOperand.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SPVParsedOperand#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected SPVParsedOperand getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code offset} field. */
        @NativeType("uint16_t")
        public short offset() { return SPVParsedOperand.noffset(address()); }
        /** @return the value of the {@code num_words} field. */
        @NativeType("uint16_t")
        public short num_words() { return SPVParsedOperand.nnum_words(address()); }
        /** @return the value of the {@code type} field. */
        @NativeType("spv_operand_type_t")
        public int type() { return SPVParsedOperand.ntype(address()); }
        /** @return the value of the {@code number_kind} field. */
        @NativeType("spv_number_kind_t")
        public int number_kind() { return SPVParsedOperand.nnumber_kind(address()); }
        /** @return the value of the {@code number_bit_width} field. */
        @NativeType("uint32_t")
        public int number_bit_width() { return SPVParsedOperand.nnumber_bit_width(address()); }
        /** @return the value of the {@code fp_encoding} field. */
        @NativeType("spv_fp_encoding_t")
        public int fp_encoding() { return SPVParsedOperand.nfp_encoding(address()); }

        /** Sets the specified value to the {@code offset} field. */
        public SPVParsedOperand.Buffer offset(@NativeType("uint16_t") short value) { SPVParsedOperand.noffset(address(), value); return this; }
        /** Sets the specified value to the {@code num_words} field. */
        public SPVParsedOperand.Buffer num_words(@NativeType("uint16_t") short value) { SPVParsedOperand.nnum_words(address(), value); return this; }
        /** Sets the specified value to the {@code type} field. */
        public SPVParsedOperand.Buffer type(@NativeType("spv_operand_type_t") int value) { SPVParsedOperand.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code number_kind} field. */
        public SPVParsedOperand.Buffer number_kind(@NativeType("spv_number_kind_t") int value) { SPVParsedOperand.nnumber_kind(address(), value); return this; }
        /** Sets the specified value to the {@code number_bit_width} field. */
        public SPVParsedOperand.Buffer number_bit_width(@NativeType("uint32_t") int value) { SPVParsedOperand.nnumber_bit_width(address(), value); return this; }
        /** Sets the specified value to the {@code fp_encoding} field. */
        public SPVParsedOperand.Buffer fp_encoding(@NativeType("spv_fp_encoding_t") int value) { SPVParsedOperand.nfp_encoding(address(), value); return this; }

    }

}