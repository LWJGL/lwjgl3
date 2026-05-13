/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct cl_kernel_allocation_info_intel {
 *     void * base;
 *     size_t size;
 *     cl_unified_shared_memory_type_intel type;
 *     cl_int arg_index;
 * }}</pre>
 */
@NativeType("struct cl_kernel_allocation_info_intel")
public class CLKernelAllocationInfoINTEL extends Struct<CLKernelAllocationInfoINTEL> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BASE,
        SIZE,
        TYPE,
        ARG_INDEX;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BASE = layout.offsetof(0);
        SIZE = layout.offsetof(1);
        TYPE = layout.offsetof(2);
        ARG_INDEX = layout.offsetof(3);
    }

    protected CLKernelAllocationInfoINTEL(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CLKernelAllocationInfoINTEL create(long address, @Nullable ByteBuffer container) {
        return new CLKernelAllocationInfoINTEL(address, container);
    }

    /**
     * Creates a {@code CLKernelAllocationInfoINTEL} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CLKernelAllocationInfoINTEL(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code base} field. */
    @NativeType("void *")
    public ByteBuffer base() { return nbase(address()); }
    /** @return the value of the {@code size} field. */
    @NativeType("size_t")
    public long size() { return nsize(address()); }
    /** @return the value of the {@code type} field. */
    @NativeType("cl_unified_shared_memory_type_intel")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code arg_index} field. */
    @NativeType("cl_int")
    public int arg_index() { return narg_index(address()); }

    /** Sets the address of the specified {@link ByteBuffer} to the {@code base} field. */
    public CLKernelAllocationInfoINTEL base(@NativeType("void *") ByteBuffer value) { nbase(address(), value); return this; }
    /** Sets the specified value to the {@code type} field. */
    public CLKernelAllocationInfoINTEL type(@NativeType("cl_unified_shared_memory_type_intel") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code arg_index} field. */
    public CLKernelAllocationInfoINTEL arg_index(@NativeType("cl_int") int value) { narg_index(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public CLKernelAllocationInfoINTEL set(
        ByteBuffer base,
        int type,
        int arg_index
    ) {
        base(base);
        type(type);
        arg_index(arg_index);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CLKernelAllocationInfoINTEL set(CLKernelAllocationInfoINTEL src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CLKernelAllocationInfoINTEL} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CLKernelAllocationInfoINTEL malloc() {
        return new CLKernelAllocationInfoINTEL(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CLKernelAllocationInfoINTEL} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CLKernelAllocationInfoINTEL calloc() {
        return new CLKernelAllocationInfoINTEL(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CLKernelAllocationInfoINTEL} instance allocated with {@link BufferUtils}. */
    public static CLKernelAllocationInfoINTEL create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CLKernelAllocationInfoINTEL(memAddress(container), container);
    }

    /** Returns a new {@code CLKernelAllocationInfoINTEL} instance for the specified memory address. */
    public static CLKernelAllocationInfoINTEL create(long address) {
        return new CLKernelAllocationInfoINTEL(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable CLKernelAllocationInfoINTEL createSafe(long address) {
        return address == NULL ? null : new CLKernelAllocationInfoINTEL(address, null);
    }

    /**
     * Returns a new {@link CLKernelAllocationInfoINTEL.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CLKernelAllocationInfoINTEL.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CLKernelAllocationInfoINTEL.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CLKernelAllocationInfoINTEL.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CLKernelAllocationInfoINTEL.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CLKernelAllocationInfoINTEL.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CLKernelAllocationInfoINTEL.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CLKernelAllocationInfoINTEL.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static CLKernelAllocationInfoINTEL.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code CLKernelAllocationInfoINTEL} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CLKernelAllocationInfoINTEL malloc(MemoryStack stack) {
        return new CLKernelAllocationInfoINTEL(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CLKernelAllocationInfoINTEL} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CLKernelAllocationInfoINTEL calloc(MemoryStack stack) {
        return new CLKernelAllocationInfoINTEL(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CLKernelAllocationInfoINTEL.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CLKernelAllocationInfoINTEL.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CLKernelAllocationInfoINTEL.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CLKernelAllocationInfoINTEL.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #base() base}. */
    public static ByteBuffer nbase(long struct) { return memByteBuffer(memGetAddress(struct + CLKernelAllocationInfoINTEL.BASE), (int)nsize(struct)); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return memGetAddress(struct + CLKernelAllocationInfoINTEL.SIZE); }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + CLKernelAllocationInfoINTEL.TYPE); }
    /** Unsafe version of {@link #arg_index}. */
    public static int narg_index(long struct) { return memGetInt(struct + CLKernelAllocationInfoINTEL.ARG_INDEX); }

    /** Unsafe version of {@link #base(ByteBuffer) base}. */
    public static void nbase(long struct, ByteBuffer value) { memPutAddress(struct + CLKernelAllocationInfoINTEL.BASE, memAddress(value)); nsize(struct, value.remaining()); }
    /** Sets the specified value to the {@code size} field of the specified {@code struct}. */
    public static void nsize(long struct, long value) { memPutAddress(struct + CLKernelAllocationInfoINTEL.SIZE, value); }
    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + CLKernelAllocationInfoINTEL.TYPE, value); }
    /** Unsafe version of {@link #arg_index(int) arg_index}. */
    public static void narg_index(long struct, int value) { memPutInt(struct + CLKernelAllocationInfoINTEL.ARG_INDEX, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + CLKernelAllocationInfoINTEL.BASE));
    }

    // -----------------------------------

    /** An array of {@link CLKernelAllocationInfoINTEL} structs. */
    public static class Buffer extends StructBuffer<CLKernelAllocationInfoINTEL, Buffer> implements NativeResource {

        private static final CLKernelAllocationInfoINTEL ELEMENT_FACTORY = CLKernelAllocationInfoINTEL.create(-1L);

        /**
         * Creates a new {@code CLKernelAllocationInfoINTEL.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CLKernelAllocationInfoINTEL#SIZEOF}, and its mark will be undefined.</p>
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
        protected CLKernelAllocationInfoINTEL getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code base} field. */
        @NativeType("void *")
        public ByteBuffer base() { return CLKernelAllocationInfoINTEL.nbase(address()); }
        /** @return the value of the {@code size} field. */
        @NativeType("size_t")
        public long size() { return CLKernelAllocationInfoINTEL.nsize(address()); }
        /** @return the value of the {@code type} field. */
        @NativeType("cl_unified_shared_memory_type_intel")
        public int type() { return CLKernelAllocationInfoINTEL.ntype(address()); }
        /** @return the value of the {@code arg_index} field. */
        @NativeType("cl_int")
        public int arg_index() { return CLKernelAllocationInfoINTEL.narg_index(address()); }

        /** Sets the address of the specified {@link ByteBuffer} to the {@code base} field. */
        public CLKernelAllocationInfoINTEL.Buffer base(@NativeType("void *") ByteBuffer value) { CLKernelAllocationInfoINTEL.nbase(address(), value); return this; }
        /** Sets the specified value to the {@code type} field. */
        public CLKernelAllocationInfoINTEL.Buffer type(@NativeType("cl_unified_shared_memory_type_intel") int value) { CLKernelAllocationInfoINTEL.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code arg_index} field. */
        public CLKernelAllocationInfoINTEL.Buffer arg_index(@NativeType("cl_int") int value) { CLKernelAllocationInfoINTEL.narg_index(address(), value); return this; }

    }

}