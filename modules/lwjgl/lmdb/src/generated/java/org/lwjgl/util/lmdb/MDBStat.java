/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.lmdb;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Statistics for a database in the environment.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code ms_psize} &ndash; Size of a database page. This is currently the same for all databases.</li>
 * <li>{@code ms_depth} &ndash; Depth (height) of the B-tree.</li>
 * <li>{@code ms_branch_pages} &ndash; Number of internal (non-leaf) pages.</li>
 * <li>{@code ms_leaf_pages} &ndash; Number of leaf pages.</li>
 * <li>{@code ms_overflow_pages} &ndash; Number of overflow pages.</li>
 * <li>{@code ms_entries} &ndash; Number of data items.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct MDB_stat {
 *     unsigned int ms_psize;
 *     unsigned int ms_depth;
 *     size_t ms_branch_pages;
 *     size_t ms_leaf_pages;
 *     size_t ms_overflow_pages;
 *     size_t ms_entries;
 * }</code></pre>
 */
@NativeType("struct MDB_stat")
public class MDBStat extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MS_PSIZE,
        MS_DEPTH,
        MS_BRANCH_PAGES,
        MS_LEAF_PAGES,
        MS_OVERFLOW_PAGES,
        MS_ENTRIES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MS_PSIZE = layout.offsetof(0);
        MS_DEPTH = layout.offsetof(1);
        MS_BRANCH_PAGES = layout.offsetof(2);
        MS_LEAF_PAGES = layout.offsetof(3);
        MS_OVERFLOW_PAGES = layout.offsetof(4);
        MS_ENTRIES = layout.offsetof(5);
    }

    /**
     * Creates a {@code MDBStat} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public MDBStat(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code ms_psize} field. */
    @NativeType("unsigned int")
    public int ms_psize() { return nms_psize(address()); }
    /** Returns the value of the {@code ms_depth} field. */
    @NativeType("unsigned int")
    public int ms_depth() { return nms_depth(address()); }
    /** Returns the value of the {@code ms_branch_pages} field. */
    @NativeType("size_t")
    public long ms_branch_pages() { return nms_branch_pages(address()); }
    /** Returns the value of the {@code ms_leaf_pages} field. */
    @NativeType("size_t")
    public long ms_leaf_pages() { return nms_leaf_pages(address()); }
    /** Returns the value of the {@code ms_overflow_pages} field. */
    @NativeType("size_t")
    public long ms_overflow_pages() { return nms_overflow_pages(address()); }
    /** Returns the value of the {@code ms_entries} field. */
    @NativeType("size_t")
    public long ms_entries() { return nms_entries(address()); }

    // -----------------------------------

    /** Returns a new {@code MDBStat} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static MDBStat malloc() {
        return wrap(MDBStat.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code MDBStat} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static MDBStat calloc() {
        return wrap(MDBStat.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code MDBStat} instance allocated with {@link BufferUtils}. */
    public static MDBStat create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(MDBStat.class, memAddress(container), container);
    }

    /** Returns a new {@code MDBStat} instance for the specified memory address. */
    public static MDBStat create(long address) {
        return wrap(MDBStat.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static MDBStat createSafe(long address) {
        return address == NULL ? null : wrap(MDBStat.class, address);
    }

    /**
     * Returns a new {@link MDBStat.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MDBStat.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link MDBStat.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MDBStat.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MDBStat.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static MDBStat.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link MDBStat.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static MDBStat.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static MDBStat.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code MDBStat} instance allocated on the thread-local {@link MemoryStack}. */
    public static MDBStat mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code MDBStat} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static MDBStat callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code MDBStat} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static MDBStat mallocStack(MemoryStack stack) {
        return wrap(MDBStat.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code MDBStat} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static MDBStat callocStack(MemoryStack stack) {
        return wrap(MDBStat.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link MDBStat.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static MDBStat.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link MDBStat.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static MDBStat.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link MDBStat.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MDBStat.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MDBStat.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MDBStat.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #ms_psize}. */
    public static int nms_psize(long struct) { return UNSAFE.getInt(null, struct + MDBStat.MS_PSIZE); }
    /** Unsafe version of {@link #ms_depth}. */
    public static int nms_depth(long struct) { return UNSAFE.getInt(null, struct + MDBStat.MS_DEPTH); }
    /** Unsafe version of {@link #ms_branch_pages}. */
    public static long nms_branch_pages(long struct) { return memGetAddress(struct + MDBStat.MS_BRANCH_PAGES); }
    /** Unsafe version of {@link #ms_leaf_pages}. */
    public static long nms_leaf_pages(long struct) { return memGetAddress(struct + MDBStat.MS_LEAF_PAGES); }
    /** Unsafe version of {@link #ms_overflow_pages}. */
    public static long nms_overflow_pages(long struct) { return memGetAddress(struct + MDBStat.MS_OVERFLOW_PAGES); }
    /** Unsafe version of {@link #ms_entries}. */
    public static long nms_entries(long struct) { return memGetAddress(struct + MDBStat.MS_ENTRIES); }

    // -----------------------------------

    /** An array of {@link MDBStat} structs. */
    public static class Buffer extends StructBuffer<MDBStat, Buffer> implements NativeResource {

        private static final MDBStat ELEMENT_FACTORY = MDBStat.create(-1L);

        /**
         * Creates a new {@code MDBStat.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link MDBStat#SIZEOF}, and its mark will be undefined.
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
        protected MDBStat getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code ms_psize} field. */
        @NativeType("unsigned int")
        public int ms_psize() { return MDBStat.nms_psize(address()); }
        /** Returns the value of the {@code ms_depth} field. */
        @NativeType("unsigned int")
        public int ms_depth() { return MDBStat.nms_depth(address()); }
        /** Returns the value of the {@code ms_branch_pages} field. */
        @NativeType("size_t")
        public long ms_branch_pages() { return MDBStat.nms_branch_pages(address()); }
        /** Returns the value of the {@code ms_leaf_pages} field. */
        @NativeType("size_t")
        public long ms_leaf_pages() { return MDBStat.nms_leaf_pages(address()); }
        /** Returns the value of the {@code ms_overflow_pages} field. */
        @NativeType("size_t")
        public long ms_overflow_pages() { return MDBStat.nms_overflow_pages(address()); }
        /** Returns the value of the {@code ms_entries} field. */
        @NativeType("size_t")
        public long ms_entries() { return MDBStat.nms_entries(address()); }

    }

}