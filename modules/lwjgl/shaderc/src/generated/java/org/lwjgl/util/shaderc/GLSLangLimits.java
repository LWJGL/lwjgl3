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
 * struct glslang_limits_t {
 *     bool non_inductive_for_loops;
 *     bool while_loops;
 *     bool do_while_loops;
 *     bool general_uniform_indexing;
 *     bool general_attribute_matrix_vector_indexing;
 *     bool general_varying_indexing;
 *     bool general_sampler_indexing;
 *     bool general_variable_indexing;
 *     bool general_constant_matrix_vector_indexing;
 * }}</pre>
 */
@NativeType("struct glslang_limits_t")
public class GLSLangLimits extends Struct<GLSLangLimits> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NON_INDUCTIVE_FOR_LOOPS,
        WHILE_LOOPS,
        DO_WHILE_LOOPS,
        GENERAL_UNIFORM_INDEXING,
        GENERAL_ATTRIBUTE_MATRIX_VECTOR_INDEXING,
        GENERAL_VARYING_INDEXING,
        GENERAL_SAMPLER_INDEXING,
        GENERAL_VARIABLE_INDEXING,
        GENERAL_CONSTANT_MATRIX_VECTOR_INDEXING;

    static {
        Layout layout = __struct(
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NON_INDUCTIVE_FOR_LOOPS = layout.offsetof(0);
        WHILE_LOOPS = layout.offsetof(1);
        DO_WHILE_LOOPS = layout.offsetof(2);
        GENERAL_UNIFORM_INDEXING = layout.offsetof(3);
        GENERAL_ATTRIBUTE_MATRIX_VECTOR_INDEXING = layout.offsetof(4);
        GENERAL_VARYING_INDEXING = layout.offsetof(5);
        GENERAL_SAMPLER_INDEXING = layout.offsetof(6);
        GENERAL_VARIABLE_INDEXING = layout.offsetof(7);
        GENERAL_CONSTANT_MATRIX_VECTOR_INDEXING = layout.offsetof(8);
    }

    protected GLSLangLimits(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected GLSLangLimits create(long address, @Nullable ByteBuffer container) {
        return new GLSLangLimits(address, container);
    }

    /**
     * Creates a {@code GLSLangLimits} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public GLSLangLimits(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code non_inductive_for_loops} field. */
    @NativeType("bool")
    public boolean non_inductive_for_loops() { return nnon_inductive_for_loops(address()); }
    /** @return the value of the {@code while_loops} field. */
    @NativeType("bool")
    public boolean while_loops() { return nwhile_loops(address()); }
    /** @return the value of the {@code do_while_loops} field. */
    @NativeType("bool")
    public boolean do_while_loops() { return ndo_while_loops(address()); }
    /** @return the value of the {@code general_uniform_indexing} field. */
    @NativeType("bool")
    public boolean general_uniform_indexing() { return ngeneral_uniform_indexing(address()); }
    /** @return the value of the {@code general_attribute_matrix_vector_indexing} field. */
    @NativeType("bool")
    public boolean general_attribute_matrix_vector_indexing() { return ngeneral_attribute_matrix_vector_indexing(address()); }
    /** @return the value of the {@code general_varying_indexing} field. */
    @NativeType("bool")
    public boolean general_varying_indexing() { return ngeneral_varying_indexing(address()); }
    /** @return the value of the {@code general_sampler_indexing} field. */
    @NativeType("bool")
    public boolean general_sampler_indexing() { return ngeneral_sampler_indexing(address()); }
    /** @return the value of the {@code general_variable_indexing} field. */
    @NativeType("bool")
    public boolean general_variable_indexing() { return ngeneral_variable_indexing(address()); }
    /** @return the value of the {@code general_constant_matrix_vector_indexing} field. */
    @NativeType("bool")
    public boolean general_constant_matrix_vector_indexing() { return ngeneral_constant_matrix_vector_indexing(address()); }

    /** Sets the specified value to the {@code non_inductive_for_loops} field. */
    public GLSLangLimits non_inductive_for_loops(@NativeType("bool") boolean value) { nnon_inductive_for_loops(address(), value); return this; }
    /** Sets the specified value to the {@code while_loops} field. */
    public GLSLangLimits while_loops(@NativeType("bool") boolean value) { nwhile_loops(address(), value); return this; }
    /** Sets the specified value to the {@code do_while_loops} field. */
    public GLSLangLimits do_while_loops(@NativeType("bool") boolean value) { ndo_while_loops(address(), value); return this; }
    /** Sets the specified value to the {@code general_uniform_indexing} field. */
    public GLSLangLimits general_uniform_indexing(@NativeType("bool") boolean value) { ngeneral_uniform_indexing(address(), value); return this; }
    /** Sets the specified value to the {@code general_attribute_matrix_vector_indexing} field. */
    public GLSLangLimits general_attribute_matrix_vector_indexing(@NativeType("bool") boolean value) { ngeneral_attribute_matrix_vector_indexing(address(), value); return this; }
    /** Sets the specified value to the {@code general_varying_indexing} field. */
    public GLSLangLimits general_varying_indexing(@NativeType("bool") boolean value) { ngeneral_varying_indexing(address(), value); return this; }
    /** Sets the specified value to the {@code general_sampler_indexing} field. */
    public GLSLangLimits general_sampler_indexing(@NativeType("bool") boolean value) { ngeneral_sampler_indexing(address(), value); return this; }
    /** Sets the specified value to the {@code general_variable_indexing} field. */
    public GLSLangLimits general_variable_indexing(@NativeType("bool") boolean value) { ngeneral_variable_indexing(address(), value); return this; }
    /** Sets the specified value to the {@code general_constant_matrix_vector_indexing} field. */
    public GLSLangLimits general_constant_matrix_vector_indexing(@NativeType("bool") boolean value) { ngeneral_constant_matrix_vector_indexing(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public GLSLangLimits set(
        boolean non_inductive_for_loops,
        boolean while_loops,
        boolean do_while_loops,
        boolean general_uniform_indexing,
        boolean general_attribute_matrix_vector_indexing,
        boolean general_varying_indexing,
        boolean general_sampler_indexing,
        boolean general_variable_indexing,
        boolean general_constant_matrix_vector_indexing
    ) {
        non_inductive_for_loops(non_inductive_for_loops);
        while_loops(while_loops);
        do_while_loops(do_while_loops);
        general_uniform_indexing(general_uniform_indexing);
        general_attribute_matrix_vector_indexing(general_attribute_matrix_vector_indexing);
        general_varying_indexing(general_varying_indexing);
        general_sampler_indexing(general_sampler_indexing);
        general_variable_indexing(general_variable_indexing);
        general_constant_matrix_vector_indexing(general_constant_matrix_vector_indexing);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public GLSLangLimits set(GLSLangLimits src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code GLSLangLimits} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static GLSLangLimits malloc() {
        return new GLSLangLimits(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code GLSLangLimits} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static GLSLangLimits calloc() {
        return new GLSLangLimits(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code GLSLangLimits} instance allocated with {@link BufferUtils}. */
    public static GLSLangLimits create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new GLSLangLimits(memAddress(container), container);
    }

    /** Returns a new {@code GLSLangLimits} instance for the specified memory address. */
    public static GLSLangLimits create(long address) {
        return new GLSLangLimits(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable GLSLangLimits createSafe(long address) {
        return address == NULL ? null : new GLSLangLimits(address, null);
    }

    /**
     * Returns a new {@link GLSLangLimits.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static GLSLangLimits.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link GLSLangLimits.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static GLSLangLimits.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link GLSLangLimits.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static GLSLangLimits.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link GLSLangLimits.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static GLSLangLimits.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static GLSLangLimits.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code GLSLangLimits} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static GLSLangLimits malloc(MemoryStack stack) {
        return new GLSLangLimits(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code GLSLangLimits} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static GLSLangLimits calloc(MemoryStack stack) {
        return new GLSLangLimits(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link GLSLangLimits.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static GLSLangLimits.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link GLSLangLimits.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static GLSLangLimits.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #non_inductive_for_loops}. */
    public static boolean nnon_inductive_for_loops(long struct) { return memGetByte(struct + GLSLangLimits.NON_INDUCTIVE_FOR_LOOPS) != 0; }
    /** Unsafe version of {@link #while_loops}. */
    public static boolean nwhile_loops(long struct) { return memGetByte(struct + GLSLangLimits.WHILE_LOOPS) != 0; }
    /** Unsafe version of {@link #do_while_loops}. */
    public static boolean ndo_while_loops(long struct) { return memGetByte(struct + GLSLangLimits.DO_WHILE_LOOPS) != 0; }
    /** Unsafe version of {@link #general_uniform_indexing}. */
    public static boolean ngeneral_uniform_indexing(long struct) { return memGetByte(struct + GLSLangLimits.GENERAL_UNIFORM_INDEXING) != 0; }
    /** Unsafe version of {@link #general_attribute_matrix_vector_indexing}. */
    public static boolean ngeneral_attribute_matrix_vector_indexing(long struct) { return memGetByte(struct + GLSLangLimits.GENERAL_ATTRIBUTE_MATRIX_VECTOR_INDEXING) != 0; }
    /** Unsafe version of {@link #general_varying_indexing}. */
    public static boolean ngeneral_varying_indexing(long struct) { return memGetByte(struct + GLSLangLimits.GENERAL_VARYING_INDEXING) != 0; }
    /** Unsafe version of {@link #general_sampler_indexing}. */
    public static boolean ngeneral_sampler_indexing(long struct) { return memGetByte(struct + GLSLangLimits.GENERAL_SAMPLER_INDEXING) != 0; }
    /** Unsafe version of {@link #general_variable_indexing}. */
    public static boolean ngeneral_variable_indexing(long struct) { return memGetByte(struct + GLSLangLimits.GENERAL_VARIABLE_INDEXING) != 0; }
    /** Unsafe version of {@link #general_constant_matrix_vector_indexing}. */
    public static boolean ngeneral_constant_matrix_vector_indexing(long struct) { return memGetByte(struct + GLSLangLimits.GENERAL_CONSTANT_MATRIX_VECTOR_INDEXING) != 0; }

    /** Unsafe version of {@link #non_inductive_for_loops(boolean) non_inductive_for_loops}. */
    public static void nnon_inductive_for_loops(long struct, boolean value) { memPutByte(struct + GLSLangLimits.NON_INDUCTIVE_FOR_LOOPS, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #while_loops(boolean) while_loops}. */
    public static void nwhile_loops(long struct, boolean value) { memPutByte(struct + GLSLangLimits.WHILE_LOOPS, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #do_while_loops(boolean) do_while_loops}. */
    public static void ndo_while_loops(long struct, boolean value) { memPutByte(struct + GLSLangLimits.DO_WHILE_LOOPS, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #general_uniform_indexing(boolean) general_uniform_indexing}. */
    public static void ngeneral_uniform_indexing(long struct, boolean value) { memPutByte(struct + GLSLangLimits.GENERAL_UNIFORM_INDEXING, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #general_attribute_matrix_vector_indexing(boolean) general_attribute_matrix_vector_indexing}. */
    public static void ngeneral_attribute_matrix_vector_indexing(long struct, boolean value) { memPutByte(struct + GLSLangLimits.GENERAL_ATTRIBUTE_MATRIX_VECTOR_INDEXING, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #general_varying_indexing(boolean) general_varying_indexing}. */
    public static void ngeneral_varying_indexing(long struct, boolean value) { memPutByte(struct + GLSLangLimits.GENERAL_VARYING_INDEXING, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #general_sampler_indexing(boolean) general_sampler_indexing}. */
    public static void ngeneral_sampler_indexing(long struct, boolean value) { memPutByte(struct + GLSLangLimits.GENERAL_SAMPLER_INDEXING, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #general_variable_indexing(boolean) general_variable_indexing}. */
    public static void ngeneral_variable_indexing(long struct, boolean value) { memPutByte(struct + GLSLangLimits.GENERAL_VARIABLE_INDEXING, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #general_constant_matrix_vector_indexing(boolean) general_constant_matrix_vector_indexing}. */
    public static void ngeneral_constant_matrix_vector_indexing(long struct, boolean value) { memPutByte(struct + GLSLangLimits.GENERAL_CONSTANT_MATRIX_VECTOR_INDEXING, value ? (byte)1 : (byte)0); }

    // -----------------------------------

    /** An array of {@link GLSLangLimits} structs. */
    public static class Buffer extends StructBuffer<GLSLangLimits, Buffer> implements NativeResource {

        private static final GLSLangLimits ELEMENT_FACTORY = GLSLangLimits.create(-1L);

        /**
         * Creates a new {@code GLSLangLimits.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link GLSLangLimits#SIZEOF}, and its mark will be undefined.</p>
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
        protected GLSLangLimits getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code non_inductive_for_loops} field. */
        @NativeType("bool")
        public boolean non_inductive_for_loops() { return GLSLangLimits.nnon_inductive_for_loops(address()); }
        /** @return the value of the {@code while_loops} field. */
        @NativeType("bool")
        public boolean while_loops() { return GLSLangLimits.nwhile_loops(address()); }
        /** @return the value of the {@code do_while_loops} field. */
        @NativeType("bool")
        public boolean do_while_loops() { return GLSLangLimits.ndo_while_loops(address()); }
        /** @return the value of the {@code general_uniform_indexing} field. */
        @NativeType("bool")
        public boolean general_uniform_indexing() { return GLSLangLimits.ngeneral_uniform_indexing(address()); }
        /** @return the value of the {@code general_attribute_matrix_vector_indexing} field. */
        @NativeType("bool")
        public boolean general_attribute_matrix_vector_indexing() { return GLSLangLimits.ngeneral_attribute_matrix_vector_indexing(address()); }
        /** @return the value of the {@code general_varying_indexing} field. */
        @NativeType("bool")
        public boolean general_varying_indexing() { return GLSLangLimits.ngeneral_varying_indexing(address()); }
        /** @return the value of the {@code general_sampler_indexing} field. */
        @NativeType("bool")
        public boolean general_sampler_indexing() { return GLSLangLimits.ngeneral_sampler_indexing(address()); }
        /** @return the value of the {@code general_variable_indexing} field. */
        @NativeType("bool")
        public boolean general_variable_indexing() { return GLSLangLimits.ngeneral_variable_indexing(address()); }
        /** @return the value of the {@code general_constant_matrix_vector_indexing} field. */
        @NativeType("bool")
        public boolean general_constant_matrix_vector_indexing() { return GLSLangLimits.ngeneral_constant_matrix_vector_indexing(address()); }

        /** Sets the specified value to the {@code non_inductive_for_loops} field. */
        public GLSLangLimits.Buffer non_inductive_for_loops(@NativeType("bool") boolean value) { GLSLangLimits.nnon_inductive_for_loops(address(), value); return this; }
        /** Sets the specified value to the {@code while_loops} field. */
        public GLSLangLimits.Buffer while_loops(@NativeType("bool") boolean value) { GLSLangLimits.nwhile_loops(address(), value); return this; }
        /** Sets the specified value to the {@code do_while_loops} field. */
        public GLSLangLimits.Buffer do_while_loops(@NativeType("bool") boolean value) { GLSLangLimits.ndo_while_loops(address(), value); return this; }
        /** Sets the specified value to the {@code general_uniform_indexing} field. */
        public GLSLangLimits.Buffer general_uniform_indexing(@NativeType("bool") boolean value) { GLSLangLimits.ngeneral_uniform_indexing(address(), value); return this; }
        /** Sets the specified value to the {@code general_attribute_matrix_vector_indexing} field. */
        public GLSLangLimits.Buffer general_attribute_matrix_vector_indexing(@NativeType("bool") boolean value) { GLSLangLimits.ngeneral_attribute_matrix_vector_indexing(address(), value); return this; }
        /** Sets the specified value to the {@code general_varying_indexing} field. */
        public GLSLangLimits.Buffer general_varying_indexing(@NativeType("bool") boolean value) { GLSLangLimits.ngeneral_varying_indexing(address(), value); return this; }
        /** Sets the specified value to the {@code general_sampler_indexing} field. */
        public GLSLangLimits.Buffer general_sampler_indexing(@NativeType("bool") boolean value) { GLSLangLimits.ngeneral_sampler_indexing(address(), value); return this; }
        /** Sets the specified value to the {@code general_variable_indexing} field. */
        public GLSLangLimits.Buffer general_variable_indexing(@NativeType("bool") boolean value) { GLSLangLimits.ngeneral_variable_indexing(address(), value); return this; }
        /** Sets the specified value to the {@code general_constant_matrix_vector_indexing} field. */
        public GLSLangLimits.Buffer general_constant_matrix_vector_indexing(@NativeType("bool") boolean value) { GLSLangLimits.ngeneral_constant_matrix_vector_indexing(address(), value); return this; }

    }

}