/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct nk_memory_status {
 *     void * memory;
 *     unsigned int type;
 *     nk_size size;
 *     nk_size allocated;
 *     nk_size needed;
 *     nk_size calls;
 * }</pre></code>
 */
@NativeType("struct nk_memory_status")
public class NkMemoryStatus extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MEMORY,
        TYPE,
        SIZE,
        ALLOCATED,
        NEEDED,
        CALLS;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MEMORY = layout.offsetof(0);
        TYPE = layout.offsetof(1);
        SIZE = layout.offsetof(2);
        ALLOCATED = layout.offsetof(3);
        NEEDED = layout.offsetof(4);
        CALLS = layout.offsetof(5);
    }

    NkMemoryStatus(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link NkMemoryStatus} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkMemoryStatus(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link ByteBuffer} view of the data pointed to by the {@code memory} field. */
    @NativeType("void *")
    public ByteBuffer memory() { return nmemory(address()); }
    /** Returns the value of the {@code type} field. */
    @NativeType("unsigned int")
    public int type() { return ntype(address()); }
    /** Returns the value of the {@code size} field. */
    @NativeType("nk_size")
    public long size() { return nsize(address()); }
    /** Returns the value of the {@code allocated} field. */
    @NativeType("nk_size")
    public long allocated() { return nallocated(address()); }
    /** Returns the value of the {@code needed} field. */
    @NativeType("nk_size")
    public long needed() { return nneeded(address()); }
    /** Returns the value of the {@code calls} field. */
    @NativeType("nk_size")
    public long calls() { return ncalls(address()); }

    // -----------------------------------

    /** Returns a new {@link NkMemoryStatus} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NkMemoryStatus malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link NkMemoryStatus} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NkMemoryStatus calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link NkMemoryStatus} instance allocated with {@link BufferUtils}. */
    public static NkMemoryStatus create() {
        return new NkMemoryStatus(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link NkMemoryStatus} instance for the specified memory address. */
    public static NkMemoryStatus create(long address) {
        return new NkMemoryStatus(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkMemoryStatus createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link NkMemoryStatus.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkMemoryStatus.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkMemoryStatus.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkMemoryStatus.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkMemoryStatus.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NkMemoryStatus.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link NkMemoryStatus.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkMemoryStatus.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkMemoryStatus.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link NkMemoryStatus} instance allocated on the thread-local {@link MemoryStack}. */
    public static NkMemoryStatus mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link NkMemoryStatus} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static NkMemoryStatus callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link NkMemoryStatus} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NkMemoryStatus mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link NkMemoryStatus} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NkMemoryStatus callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link NkMemoryStatus.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static NkMemoryStatus.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NkMemoryStatus.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static NkMemoryStatus.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NkMemoryStatus.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkMemoryStatus.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkMemoryStatus.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkMemoryStatus.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #memory() memory}. */
    public static ByteBuffer nmemory(long struct) { return memByteBuffer(memGetAddress(struct + NkMemoryStatus.MEMORY), (int)nsize(struct)); }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + NkMemoryStatus.TYPE); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return memGetAddress(struct + NkMemoryStatus.SIZE); }
    /** Unsafe version of {@link #allocated}. */
    public static long nallocated(long struct) { return memGetAddress(struct + NkMemoryStatus.ALLOCATED); }
    /** Unsafe version of {@link #needed}. */
    public static long nneeded(long struct) { return memGetAddress(struct + NkMemoryStatus.NEEDED); }
    /** Unsafe version of {@link #calls}. */
    public static long ncalls(long struct) { return memGetAddress(struct + NkMemoryStatus.CALLS); }

    // -----------------------------------

    /** An array of {@link NkMemoryStatus} structs. */
    public static class Buffer extends StructBuffer<NkMemoryStatus, Buffer> implements NativeResource {

        /**
         * Creates a new {@link NkMemoryStatus.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkMemoryStatus#SIZEOF}, and its mark will be undefined.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected NkMemoryStatus newInstance(long address) {
            return new NkMemoryStatus(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link ByteBuffer} view of the data pointed to by the {@code memory} field. */
        @NativeType("void *")
        public ByteBuffer memory() { return NkMemoryStatus.nmemory(address()); }
        /** Returns the value of the {@code type} field. */
        @NativeType("unsigned int")
        public int type() { return NkMemoryStatus.ntype(address()); }
        /** Returns the value of the {@code size} field. */
        @NativeType("nk_size")
        public long size() { return NkMemoryStatus.nsize(address()); }
        /** Returns the value of the {@code allocated} field. */
        @NativeType("nk_size")
        public long allocated() { return NkMemoryStatus.nallocated(address()); }
        /** Returns the value of the {@code needed} field. */
        @NativeType("nk_size")
        public long needed() { return NkMemoryStatus.nneeded(address()); }
        /** Returns the value of the {@code calls} field. */
        @NativeType("nk_size")
        public long calls() { return NkMemoryStatus.ncalls(address()); }

    }

}