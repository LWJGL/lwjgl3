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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code marker[2]} &ndash; buffer marker to free a buffer to a certain offset</li>
 * <li>{@code pool} &ndash; allocator callback for dynamic buffers</li>
 * <li>{@code type} &ndash; memory management type</li>
 * <li>{@code memory} &ndash; memory and size of the current memory block</li>
 * <li>{@code grow_factor} &ndash; growing factor for dynamic memory management</li>
 * <li>{@code allocated} &ndash; total amount of memory allocated</li>
 * <li>{@code needed} &ndash; totally consumed memory given that enough memory is present</li>
 * <li>{@code calls} &ndash; number of allocation calls</li>
 * <li>{@code size} &ndash; current size of the buffer</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct nk_buffer {
 *     {@link NkBufferMarker struct nk_buffer_marker} marker[2];
 *     {@link NkAllocator struct nk_allocator} pool;
 *     enum nk_allocation_type type;
 *     {@link NkMemory struct nk_memory} memory;
 *     float grow_factor;
 *     nk_size allocated;
 *     nk_size needed;
 *     nk_size calls;
 *     nk_size size;
 * }</code></pre>
 */
@NativeType("struct nk_buffer")
public class NkBuffer extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MARKER,
        POOL,
        TYPE,
        MEMORY,
        GROW_FACTOR,
        ALLOCATED,
        NEEDED,
        CALLS,
        SIZE;

    static {
        Layout layout = __struct(
            __array(NkBufferMarker.SIZEOF, NkBufferMarker.ALIGNOF, 2),
            __member(NkAllocator.SIZEOF, NkAllocator.ALIGNOF),
            __member(4),
            __member(NkMemory.SIZEOF, NkMemory.ALIGNOF),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MARKER = layout.offsetof(0);
        POOL = layout.offsetof(1);
        TYPE = layout.offsetof(2);
        MEMORY = layout.offsetof(3);
        GROW_FACTOR = layout.offsetof(4);
        ALLOCATED = layout.offsetof(5);
        NEEDED = layout.offsetof(6);
        CALLS = layout.offsetof(7);
        SIZE = layout.offsetof(8);
    }

    /**
     * Creates a {@code NkBuffer} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkBuffer(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link NkBufferMarker}.Buffer view of the {@code marker} field. */
    @NativeType("struct nk_buffer_marker[2]")
    public NkBufferMarker.Buffer marker() { return nmarker(address()); }
    /** Returns a {@link NkBufferMarker} view of the struct at the specified index of the {@code marker} field. */
    @NativeType("struct nk_buffer_marker")
    public NkBufferMarker marker(int index) { return nmarker(address(), index); }
    /** Returns a {@link NkAllocator} view of the {@code pool} field. */
    @NativeType("struct nk_allocator")
    public NkAllocator pool() { return npool(address()); }
    /** Returns the value of the {@code type} field. */
    @NativeType("enum nk_allocation_type")
    public int type() { return ntype(address()); }
    /** Returns a {@link NkMemory} view of the {@code memory} field. */
    @NativeType("struct nk_memory")
    public NkMemory memory() { return nmemory(address()); }
    /** Returns the value of the {@code grow_factor} field. */
    public float grow_factor() { return ngrow_factor(address()); }
    /** Returns the value of the {@code allocated} field. */
    @NativeType("nk_size")
    public long allocated() { return nallocated(address()); }
    /** Returns the value of the {@code needed} field. */
    @NativeType("nk_size")
    public long needed() { return nneeded(address()); }
    /** Returns the value of the {@code calls} field. */
    @NativeType("nk_size")
    public long calls() { return ncalls(address()); }
    /** Returns the value of the {@code size} field. */
    @NativeType("nk_size")
    public long size() { return nsize(address()); }

    // -----------------------------------

    /** Returns a new {@code NkBuffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NkBuffer malloc() {
        return wrap(NkBuffer.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code NkBuffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NkBuffer calloc() {
        return wrap(NkBuffer.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code NkBuffer} instance allocated with {@link BufferUtils}. */
    public static NkBuffer create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(NkBuffer.class, memAddress(container), container);
    }

    /** Returns a new {@code NkBuffer} instance for the specified memory address. */
    public static NkBuffer create(long address) {
        return wrap(NkBuffer.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkBuffer createSafe(long address) {
        return address == NULL ? null : wrap(NkBuffer.class, address);
    }

    /**
     * Returns a new {@link NkBuffer.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkBuffer.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link NkBuffer.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkBuffer.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkBuffer.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NkBuffer.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link NkBuffer.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkBuffer.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkBuffer.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code NkBuffer} instance allocated on the thread-local {@link MemoryStack}. */
    public static NkBuffer mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code NkBuffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static NkBuffer callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code NkBuffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NkBuffer mallocStack(MemoryStack stack) {
        return wrap(NkBuffer.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code NkBuffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NkBuffer callocStack(MemoryStack stack) {
        return wrap(NkBuffer.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link NkBuffer.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static NkBuffer.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NkBuffer.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static NkBuffer.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NkBuffer.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkBuffer.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkBuffer.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkBuffer.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #marker}. */
    public static NkBufferMarker.Buffer nmarker(long struct) { return NkBufferMarker.create(struct + NkBuffer.MARKER, 2); }
    /** Unsafe version of {@link #marker(int) marker}. */
    public static NkBufferMarker nmarker(long struct, int index) {
        return NkBufferMarker.create(struct + NkBuffer.MARKER + check(index, 2) * NkBufferMarker.SIZEOF);
    }
    /** Unsafe version of {@link #pool}. */
    public static NkAllocator npool(long struct) { return NkAllocator.create(struct + NkBuffer.POOL); }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + NkBuffer.TYPE); }
    /** Unsafe version of {@link #memory}. */
    public static NkMemory nmemory(long struct) { return NkMemory.create(struct + NkBuffer.MEMORY); }
    /** Unsafe version of {@link #grow_factor}. */
    public static float ngrow_factor(long struct) { return UNSAFE.getFloat(null, struct + NkBuffer.GROW_FACTOR); }
    /** Unsafe version of {@link #allocated}. */
    public static long nallocated(long struct) { return memGetAddress(struct + NkBuffer.ALLOCATED); }
    /** Unsafe version of {@link #needed}. */
    public static long nneeded(long struct) { return memGetAddress(struct + NkBuffer.NEEDED); }
    /** Unsafe version of {@link #calls}. */
    public static long ncalls(long struct) { return memGetAddress(struct + NkBuffer.CALLS); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return memGetAddress(struct + NkBuffer.SIZE); }

    // -----------------------------------

    /** An array of {@link NkBuffer} structs. */
    public static class Buffer extends StructBuffer<NkBuffer, Buffer> implements NativeResource {

        private static final NkBuffer ELEMENT_FACTORY = NkBuffer.create(-1L);

        /**
         * Creates a new {@code NkBuffer.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkBuffer#SIZEOF}, and its mark will be undefined.
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
        protected NkBuffer getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link NkBufferMarker}.Buffer view of the {@code marker} field. */
        @NativeType("struct nk_buffer_marker[2]")
        public NkBufferMarker.Buffer marker() { return NkBuffer.nmarker(address()); }
        /** Returns a {@link NkBufferMarker} view of the struct at the specified index of the {@code marker} field. */
        @NativeType("struct nk_buffer_marker")
        public NkBufferMarker marker(int index) { return NkBuffer.nmarker(address(), index); }
        /** Returns a {@link NkAllocator} view of the {@code pool} field. */
        @NativeType("struct nk_allocator")
        public NkAllocator pool() { return NkBuffer.npool(address()); }
        /** Returns the value of the {@code type} field. */
        @NativeType("enum nk_allocation_type")
        public int type() { return NkBuffer.ntype(address()); }
        /** Returns a {@link NkMemory} view of the {@code memory} field. */
        @NativeType("struct nk_memory")
        public NkMemory memory() { return NkBuffer.nmemory(address()); }
        /** Returns the value of the {@code grow_factor} field. */
        public float grow_factor() { return NkBuffer.ngrow_factor(address()); }
        /** Returns the value of the {@code allocated} field. */
        @NativeType("nk_size")
        public long allocated() { return NkBuffer.nallocated(address()); }
        /** Returns the value of the {@code needed} field. */
        @NativeType("nk_size")
        public long needed() { return NkBuffer.nneeded(address()); }
        /** Returns the value of the {@code calls} field. */
        @NativeType("nk_size")
        public long calls() { return NkBuffer.ncalls(address()); }
        /** Returns the value of the {@code size} field. */
        @NativeType("nk_size")
        public long size() { return NkBuffer.nsize(address()); }

    }

}