/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CUDA_ARRAY_MEMORY_REQUIREMENTS {
 *     size_t size;
 *     size_t alignment;
 *     unsigned int reserved[4];
 * }</code></pre>
 */
public class CUDA_ARRAY_MEMORY_REQUIREMENTS extends Struct<CUDA_ARRAY_MEMORY_REQUIREMENTS> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SIZE,
        ALIGNMENT,
        RESERVED;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __array(4, 4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SIZE = layout.offsetof(0);
        ALIGNMENT = layout.offsetof(1);
        RESERVED = layout.offsetof(2);
    }

    protected CUDA_ARRAY_MEMORY_REQUIREMENTS(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CUDA_ARRAY_MEMORY_REQUIREMENTS create(long address, @Nullable ByteBuffer container) {
        return new CUDA_ARRAY_MEMORY_REQUIREMENTS(address, container);
    }

    /**
     * Creates a {@code CUDA_ARRAY_MEMORY_REQUIREMENTS} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUDA_ARRAY_MEMORY_REQUIREMENTS(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code size} field. */
    @NativeType("size_t")
    public long size() { return nsize(address()); }
    /** @return the value of the {@code alignment} field. */
    @NativeType("size_t")
    public long alignment() { return nalignment(address()); }
    /** @return a {@link IntBuffer} view of the {@code reserved} field. */
    @NativeType("unsigned int[4]")
    public IntBuffer reserved() { return nreserved(address()); }
    /** @return the value at the specified index of the {@code reserved} field. */
    @NativeType("unsigned int")
    public int reserved(int index) { return nreserved(address(), index); }

    // -----------------------------------

    /** Returns a new {@code CUDA_ARRAY_MEMORY_REQUIREMENTS} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUDA_ARRAY_MEMORY_REQUIREMENTS malloc() {
        return new CUDA_ARRAY_MEMORY_REQUIREMENTS(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CUDA_ARRAY_MEMORY_REQUIREMENTS} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUDA_ARRAY_MEMORY_REQUIREMENTS calloc() {
        return new CUDA_ARRAY_MEMORY_REQUIREMENTS(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CUDA_ARRAY_MEMORY_REQUIREMENTS} instance allocated with {@link BufferUtils}. */
    public static CUDA_ARRAY_MEMORY_REQUIREMENTS create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CUDA_ARRAY_MEMORY_REQUIREMENTS(memAddress(container), container);
    }

    /** Returns a new {@code CUDA_ARRAY_MEMORY_REQUIREMENTS} instance for the specified memory address. */
    public static CUDA_ARRAY_MEMORY_REQUIREMENTS create(long address) {
        return new CUDA_ARRAY_MEMORY_REQUIREMENTS(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUDA_ARRAY_MEMORY_REQUIREMENTS createSafe(long address) {
        return address == NULL ? null : new CUDA_ARRAY_MEMORY_REQUIREMENTS(address, null);
    }

    /**
     * Returns a new {@link CUDA_ARRAY_MEMORY_REQUIREMENTS.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_ARRAY_MEMORY_REQUIREMENTS.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUDA_ARRAY_MEMORY_REQUIREMENTS.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_ARRAY_MEMORY_REQUIREMENTS.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_ARRAY_MEMORY_REQUIREMENTS.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_ARRAY_MEMORY_REQUIREMENTS.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CUDA_ARRAY_MEMORY_REQUIREMENTS.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUDA_ARRAY_MEMORY_REQUIREMENTS.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUDA_ARRAY_MEMORY_REQUIREMENTS.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code CUDA_ARRAY_MEMORY_REQUIREMENTS} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_ARRAY_MEMORY_REQUIREMENTS malloc(MemoryStack stack) {
        return new CUDA_ARRAY_MEMORY_REQUIREMENTS(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CUDA_ARRAY_MEMORY_REQUIREMENTS} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_ARRAY_MEMORY_REQUIREMENTS calloc(MemoryStack stack) {
        return new CUDA_ARRAY_MEMORY_REQUIREMENTS(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CUDA_ARRAY_MEMORY_REQUIREMENTS.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_ARRAY_MEMORY_REQUIREMENTS.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_ARRAY_MEMORY_REQUIREMENTS.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_ARRAY_MEMORY_REQUIREMENTS.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return memGetAddress(struct + CUDA_ARRAY_MEMORY_REQUIREMENTS.SIZE); }
    /** Unsafe version of {@link #alignment}. */
    public static long nalignment(long struct) { return memGetAddress(struct + CUDA_ARRAY_MEMORY_REQUIREMENTS.ALIGNMENT); }
    /** Unsafe version of {@link #reserved}. */
    public static IntBuffer nreserved(long struct) { return memIntBuffer(struct + CUDA_ARRAY_MEMORY_REQUIREMENTS.RESERVED, 4); }
    /** Unsafe version of {@link #reserved(int) reserved}. */
    public static int nreserved(long struct, int index) {
        return UNSAFE.getInt(null, struct + CUDA_ARRAY_MEMORY_REQUIREMENTS.RESERVED + check(index, 4) * 4);
    }

    // -----------------------------------

    /** An array of {@link CUDA_ARRAY_MEMORY_REQUIREMENTS} structs. */
    public static class Buffer extends StructBuffer<CUDA_ARRAY_MEMORY_REQUIREMENTS, Buffer> implements NativeResource {

        private static final CUDA_ARRAY_MEMORY_REQUIREMENTS ELEMENT_FACTORY = CUDA_ARRAY_MEMORY_REQUIREMENTS.create(-1L);

        /**
         * Creates a new {@code CUDA_ARRAY_MEMORY_REQUIREMENTS.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUDA_ARRAY_MEMORY_REQUIREMENTS#SIZEOF}, and its mark will be undefined.</p>
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
        protected CUDA_ARRAY_MEMORY_REQUIREMENTS getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code size} field. */
        @NativeType("size_t")
        public long size() { return CUDA_ARRAY_MEMORY_REQUIREMENTS.nsize(address()); }
        /** @return the value of the {@code alignment} field. */
        @NativeType("size_t")
        public long alignment() { return CUDA_ARRAY_MEMORY_REQUIREMENTS.nalignment(address()); }
        /** @return a {@link IntBuffer} view of the {@code reserved} field. */
        @NativeType("unsigned int[4]")
        public IntBuffer reserved() { return CUDA_ARRAY_MEMORY_REQUIREMENTS.nreserved(address()); }
        /** @return the value at the specified index of the {@code reserved} field. */
        @NativeType("unsigned int")
        public int reserved(int index) { return CUDA_ARRAY_MEMORY_REQUIREMENTS.nreserved(address(), index); }

    }

}