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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre><code>
 * struct spv_parsed_instruction_t {
 *     uint32_t const * words;
 *     uint16_t num_words;
 *     uint16_t opcode;
 *     spv_ext_inst_type_t ext_inst_type;
 *     uint32_t type_id;
 *     uint32_t result_id;
 *     {@link SPVParsedOperand spv_parsed_operand_t} const * operands;
 *     uint16_t num_operands;
 * }</code></pre>
 */
@NativeType("struct spv_parsed_instruction_t")
public class SPVParsedInstruction extends Struct<SPVParsedInstruction> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        WORDS,
        NUM_WORDS,
        OPCODE,
        EXT_INST_TYPE,
        TYPE_ID,
        RESULT_ID,
        OPERANDS,
        NUM_OPERANDS;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(2),
            __member(2),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        WORDS = layout.offsetof(0);
        NUM_WORDS = layout.offsetof(1);
        OPCODE = layout.offsetof(2);
        EXT_INST_TYPE = layout.offsetof(3);
        TYPE_ID = layout.offsetof(4);
        RESULT_ID = layout.offsetof(5);
        OPERANDS = layout.offsetof(6);
        NUM_OPERANDS = layout.offsetof(7);
    }

    protected SPVParsedInstruction(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SPVParsedInstruction create(long address, @Nullable ByteBuffer container) {
        return new SPVParsedInstruction(address, container);
    }

    /**
     * Creates a {@code SPVParsedInstruction} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SPVParsedInstruction(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link IntBuffer} view of the data pointed to by the {@code words} field. */
    @NativeType("uint32_t const *")
    public IntBuffer words() { return nwords(address()); }
    /** @return the value of the {@code num_words} field. */
    @NativeType("uint16_t")
    public short num_words() { return nnum_words(address()); }
    /** @return the value of the {@code opcode} field. */
    @NativeType("uint16_t")
    public short opcode() { return nopcode(address()); }
    /** @return the value of the {@code ext_inst_type} field. */
    @NativeType("spv_ext_inst_type_t")
    public int ext_inst_type() { return next_inst_type(address()); }
    /** @return the value of the {@code type_id} field. */
    @NativeType("uint32_t")
    public int type_id() { return ntype_id(address()); }
    /** @return the value of the {@code result_id} field. */
    @NativeType("uint32_t")
    public int result_id() { return nresult_id(address()); }
    /** @return a {@link SPVParsedOperand.Buffer} view of the struct array pointed to by the {@code operands} field. */
    @NativeType("spv_parsed_operand_t const *")
    public SPVParsedOperand.Buffer operands() { return noperands(address()); }
    /** @return the value of the {@code num_operands} field. */
    @NativeType("uint16_t")
    public short num_operands() { return nnum_operands(address()); }

    /** Sets the address of the specified {@link IntBuffer} to the {@code words} field. */
    public SPVParsedInstruction words(@NativeType("uint32_t const *") IntBuffer value) { nwords(address(), value); return this; }
    /** Sets the specified value to the {@code opcode} field. */
    public SPVParsedInstruction opcode(@NativeType("uint16_t") short value) { nopcode(address(), value); return this; }
    /** Sets the specified value to the {@code ext_inst_type} field. */
    public SPVParsedInstruction ext_inst_type(@NativeType("spv_ext_inst_type_t") int value) { next_inst_type(address(), value); return this; }
    /** Sets the specified value to the {@code type_id} field. */
    public SPVParsedInstruction type_id(@NativeType("uint32_t") int value) { ntype_id(address(), value); return this; }
    /** Sets the specified value to the {@code result_id} field. */
    public SPVParsedInstruction result_id(@NativeType("uint32_t") int value) { nresult_id(address(), value); return this; }
    /** Sets the address of the specified {@link SPVParsedOperand.Buffer} to the {@code operands} field. */
    public SPVParsedInstruction operands(@NativeType("spv_parsed_operand_t const *") SPVParsedOperand.Buffer value) { noperands(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SPVParsedInstruction set(
        IntBuffer words,
        short opcode,
        int ext_inst_type,
        int type_id,
        int result_id,
        SPVParsedOperand.Buffer operands
    ) {
        words(words);
        opcode(opcode);
        ext_inst_type(ext_inst_type);
        type_id(type_id);
        result_id(result_id);
        operands(operands);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SPVParsedInstruction set(SPVParsedInstruction src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SPVParsedInstruction} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SPVParsedInstruction malloc() {
        return new SPVParsedInstruction(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SPVParsedInstruction} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SPVParsedInstruction calloc() {
        return new SPVParsedInstruction(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SPVParsedInstruction} instance allocated with {@link BufferUtils}. */
    public static SPVParsedInstruction create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SPVParsedInstruction(memAddress(container), container);
    }

    /** Returns a new {@code SPVParsedInstruction} instance for the specified memory address. */
    public static SPVParsedInstruction create(long address) {
        return new SPVParsedInstruction(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SPVParsedInstruction createSafe(long address) {
        return address == NULL ? null : new SPVParsedInstruction(address, null);
    }

    /**
     * Returns a new {@link SPVParsedInstruction.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SPVParsedInstruction.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SPVParsedInstruction.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SPVParsedInstruction.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SPVParsedInstruction.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SPVParsedInstruction.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SPVParsedInstruction.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SPVParsedInstruction.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SPVParsedInstruction.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SPVParsedInstruction} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SPVParsedInstruction malloc(MemoryStack stack) {
        return new SPVParsedInstruction(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SPVParsedInstruction} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SPVParsedInstruction calloc(MemoryStack stack) {
        return new SPVParsedInstruction(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SPVParsedInstruction.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SPVParsedInstruction.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SPVParsedInstruction.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SPVParsedInstruction.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #words() words}. */
    public static IntBuffer nwords(long struct) { return memIntBuffer(memGetAddress(struct + SPVParsedInstruction.WORDS), Short.toUnsignedInt(nnum_words(struct))); }
    /** Unsafe version of {@link #num_words}. */
    public static short nnum_words(long struct) { return memGetShort(struct + SPVParsedInstruction.NUM_WORDS); }
    /** Unsafe version of {@link #opcode}. */
    public static short nopcode(long struct) { return memGetShort(struct + SPVParsedInstruction.OPCODE); }
    /** Unsafe version of {@link #ext_inst_type}. */
    public static int next_inst_type(long struct) { return memGetInt(struct + SPVParsedInstruction.EXT_INST_TYPE); }
    /** Unsafe version of {@link #type_id}. */
    public static int ntype_id(long struct) { return memGetInt(struct + SPVParsedInstruction.TYPE_ID); }
    /** Unsafe version of {@link #result_id}. */
    public static int nresult_id(long struct) { return memGetInt(struct + SPVParsedInstruction.RESULT_ID); }
    /** Unsafe version of {@link #operands}. */
    public static SPVParsedOperand.Buffer noperands(long struct) { return SPVParsedOperand.create(memGetAddress(struct + SPVParsedInstruction.OPERANDS), Short.toUnsignedInt(nnum_operands(struct))); }
    /** Unsafe version of {@link #num_operands}. */
    public static short nnum_operands(long struct) { return memGetShort(struct + SPVParsedInstruction.NUM_OPERANDS); }

    /** Unsafe version of {@link #words(IntBuffer) words}. */
    public static void nwords(long struct, IntBuffer value) { memPutAddress(struct + SPVParsedInstruction.WORDS, memAddress(value)); nnum_words(struct, (short)value.remaining()); }
    /** Sets the specified value to the {@code num_words} field of the specified {@code struct}. */
    public static void nnum_words(long struct, short value) { memPutShort(struct + SPVParsedInstruction.NUM_WORDS, value); }
    /** Unsafe version of {@link #opcode(short) opcode}. */
    public static void nopcode(long struct, short value) { memPutShort(struct + SPVParsedInstruction.OPCODE, value); }
    /** Unsafe version of {@link #ext_inst_type(int) ext_inst_type}. */
    public static void next_inst_type(long struct, int value) { memPutInt(struct + SPVParsedInstruction.EXT_INST_TYPE, value); }
    /** Unsafe version of {@link #type_id(int) type_id}. */
    public static void ntype_id(long struct, int value) { memPutInt(struct + SPVParsedInstruction.TYPE_ID, value); }
    /** Unsafe version of {@link #result_id(int) result_id}. */
    public static void nresult_id(long struct, int value) { memPutInt(struct + SPVParsedInstruction.RESULT_ID, value); }
    /** Unsafe version of {@link #operands(SPVParsedOperand.Buffer) operands}. */
    public static void noperands(long struct, SPVParsedOperand.Buffer value) { memPutAddress(struct + SPVParsedInstruction.OPERANDS, value.address()); nnum_operands(struct, (short)value.remaining()); }
    /** Sets the specified value to the {@code num_operands} field of the specified {@code struct}. */
    public static void nnum_operands(long struct, short value) { memPutShort(struct + SPVParsedInstruction.NUM_OPERANDS, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + SPVParsedInstruction.WORDS));
        check(memGetAddress(struct + SPVParsedInstruction.OPERANDS));
    }

    // -----------------------------------

    /** An array of {@link SPVParsedInstruction} structs. */
    public static class Buffer extends StructBuffer<SPVParsedInstruction, Buffer> implements NativeResource {

        private static final SPVParsedInstruction ELEMENT_FACTORY = SPVParsedInstruction.create(-1L);

        /**
         * Creates a new {@code SPVParsedInstruction.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SPVParsedInstruction#SIZEOF}, and its mark will be undefined.</p>
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
        protected SPVParsedInstruction getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link IntBuffer} view of the data pointed to by the {@code words} field. */
        @NativeType("uint32_t const *")
        public IntBuffer words() { return SPVParsedInstruction.nwords(address()); }
        /** @return the value of the {@code num_words} field. */
        @NativeType("uint16_t")
        public short num_words() { return SPVParsedInstruction.nnum_words(address()); }
        /** @return the value of the {@code opcode} field. */
        @NativeType("uint16_t")
        public short opcode() { return SPVParsedInstruction.nopcode(address()); }
        /** @return the value of the {@code ext_inst_type} field. */
        @NativeType("spv_ext_inst_type_t")
        public int ext_inst_type() { return SPVParsedInstruction.next_inst_type(address()); }
        /** @return the value of the {@code type_id} field. */
        @NativeType("uint32_t")
        public int type_id() { return SPVParsedInstruction.ntype_id(address()); }
        /** @return the value of the {@code result_id} field. */
        @NativeType("uint32_t")
        public int result_id() { return SPVParsedInstruction.nresult_id(address()); }
        /** @return a {@link SPVParsedOperand.Buffer} view of the struct array pointed to by the {@code operands} field. */
        @NativeType("spv_parsed_operand_t const *")
        public SPVParsedOperand.Buffer operands() { return SPVParsedInstruction.noperands(address()); }
        /** @return the value of the {@code num_operands} field. */
        @NativeType("uint16_t")
        public short num_operands() { return SPVParsedInstruction.nnum_operands(address()); }

        /** Sets the address of the specified {@link IntBuffer} to the {@code words} field. */
        public SPVParsedInstruction.Buffer words(@NativeType("uint32_t const *") IntBuffer value) { SPVParsedInstruction.nwords(address(), value); return this; }
        /** Sets the specified value to the {@code opcode} field. */
        public SPVParsedInstruction.Buffer opcode(@NativeType("uint16_t") short value) { SPVParsedInstruction.nopcode(address(), value); return this; }
        /** Sets the specified value to the {@code ext_inst_type} field. */
        public SPVParsedInstruction.Buffer ext_inst_type(@NativeType("spv_ext_inst_type_t") int value) { SPVParsedInstruction.next_inst_type(address(), value); return this; }
        /** Sets the specified value to the {@code type_id} field. */
        public SPVParsedInstruction.Buffer type_id(@NativeType("uint32_t") int value) { SPVParsedInstruction.ntype_id(address(), value); return this; }
        /** Sets the specified value to the {@code result_id} field. */
        public SPVParsedInstruction.Buffer result_id(@NativeType("uint32_t") int value) { SPVParsedInstruction.nresult_id(address(), value); return this; }
        /** Sets the address of the specified {@link SPVParsedOperand.Buffer} to the {@code operands} field. */
        public SPVParsedInstruction.Buffer operands(@NativeType("spv_parsed_operand_t const *") SPVParsedOperand.Buffer value) { SPVParsedInstruction.noperands(address(), value); return this; }

    }

}