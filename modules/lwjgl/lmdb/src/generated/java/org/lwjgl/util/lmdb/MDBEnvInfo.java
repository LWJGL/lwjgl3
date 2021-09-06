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
 * Information about the environment.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct MDB_envinfo {
 *     void * {@link #me_mapaddr};
 *     size_t {@link #me_mapsize};
 *     size_t {@link #me_last_pgno};
 *     size_t {@link #me_last_txnid};
 *     unsigned int {@link #me_maxreaders};
 *     unsigned int {@link #me_numreaders};
 * }</code></pre>
 */
@NativeType("struct MDB_envinfo")
public class MDBEnvInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ME_MAPADDR,
        ME_MAPSIZE,
        ME_LAST_PGNO,
        ME_LAST_TXNID,
        ME_MAXREADERS,
        ME_NUMREADERS;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ME_MAPADDR = layout.offsetof(0);
        ME_MAPSIZE = layout.offsetof(1);
        ME_LAST_PGNO = layout.offsetof(2);
        ME_LAST_TXNID = layout.offsetof(3);
        ME_MAXREADERS = layout.offsetof(4);
        ME_NUMREADERS = layout.offsetof(5);
    }

    /**
     * Creates a {@code MDBEnvInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public MDBEnvInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Address of map, if fixed. */
    @NativeType("void *")
    public long me_mapaddr() { return nme_mapaddr(address()); }
    /** Size of the data memory map. */
    @NativeType("size_t")
    public long me_mapsize() { return nme_mapsize(address()); }
    /** ID of the last used page. */
    @NativeType("size_t")
    public long me_last_pgno() { return nme_last_pgno(address()); }
    /** ID of the last committed transaction. */
    @NativeType("size_t")
    public long me_last_txnid() { return nme_last_txnid(address()); }
    /** Max reader slots in the environment. */
    @NativeType("unsigned int")
    public int me_maxreaders() { return nme_maxreaders(address()); }
    /** Max reader slots used in the environment. */
    @NativeType("unsigned int")
    public int me_numreaders() { return nme_numreaders(address()); }

    // -----------------------------------

    /** Returns a new {@code MDBEnvInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static MDBEnvInfo malloc() {
        return wrap(MDBEnvInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code MDBEnvInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static MDBEnvInfo calloc() {
        return wrap(MDBEnvInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code MDBEnvInfo} instance allocated with {@link BufferUtils}. */
    public static MDBEnvInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(MDBEnvInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code MDBEnvInfo} instance for the specified memory address. */
    public static MDBEnvInfo create(long address) {
        return wrap(MDBEnvInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static MDBEnvInfo createSafe(long address) {
        return address == NULL ? null : wrap(MDBEnvInfo.class, address);
    }

    /**
     * Returns a new {@link MDBEnvInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MDBEnvInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link MDBEnvInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MDBEnvInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MDBEnvInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static MDBEnvInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link MDBEnvInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static MDBEnvInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static MDBEnvInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static MDBEnvInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static MDBEnvInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static MDBEnvInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static MDBEnvInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static MDBEnvInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static MDBEnvInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static MDBEnvInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static MDBEnvInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code MDBEnvInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static MDBEnvInfo malloc(MemoryStack stack) {
        return wrap(MDBEnvInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code MDBEnvInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static MDBEnvInfo calloc(MemoryStack stack) {
        return wrap(MDBEnvInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link MDBEnvInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MDBEnvInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MDBEnvInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MDBEnvInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #me_mapaddr}. */
    public static long nme_mapaddr(long struct) { return memGetAddress(struct + MDBEnvInfo.ME_MAPADDR); }
    /** Unsafe version of {@link #me_mapsize}. */
    public static long nme_mapsize(long struct) { return memGetAddress(struct + MDBEnvInfo.ME_MAPSIZE); }
    /** Unsafe version of {@link #me_last_pgno}. */
    public static long nme_last_pgno(long struct) { return memGetAddress(struct + MDBEnvInfo.ME_LAST_PGNO); }
    /** Unsafe version of {@link #me_last_txnid}. */
    public static long nme_last_txnid(long struct) { return memGetAddress(struct + MDBEnvInfo.ME_LAST_TXNID); }
    /** Unsafe version of {@link #me_maxreaders}. */
    public static int nme_maxreaders(long struct) { return UNSAFE.getInt(null, struct + MDBEnvInfo.ME_MAXREADERS); }
    /** Unsafe version of {@link #me_numreaders}. */
    public static int nme_numreaders(long struct) { return UNSAFE.getInt(null, struct + MDBEnvInfo.ME_NUMREADERS); }

    // -----------------------------------

    /** An array of {@link MDBEnvInfo} structs. */
    public static class Buffer extends StructBuffer<MDBEnvInfo, Buffer> implements NativeResource {

        private static final MDBEnvInfo ELEMENT_FACTORY = MDBEnvInfo.create(-1L);

        /**
         * Creates a new {@code MDBEnvInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link MDBEnvInfo#SIZEOF}, and its mark will be undefined.
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
        protected MDBEnvInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link MDBEnvInfo#me_mapaddr} field. */
        @NativeType("void *")
        public long me_mapaddr() { return MDBEnvInfo.nme_mapaddr(address()); }
        /** @return the value of the {@link MDBEnvInfo#me_mapsize} field. */
        @NativeType("size_t")
        public long me_mapsize() { return MDBEnvInfo.nme_mapsize(address()); }
        /** @return the value of the {@link MDBEnvInfo#me_last_pgno} field. */
        @NativeType("size_t")
        public long me_last_pgno() { return MDBEnvInfo.nme_last_pgno(address()); }
        /** @return the value of the {@link MDBEnvInfo#me_last_txnid} field. */
        @NativeType("size_t")
        public long me_last_txnid() { return MDBEnvInfo.nme_last_txnid(address()); }
        /** @return the value of the {@link MDBEnvInfo#me_maxreaders} field. */
        @NativeType("unsigned int")
        public int me_maxreaders() { return MDBEnvInfo.nme_maxreaders(address()); }
        /** @return the value of the {@link MDBEnvInfo#me_numreaders} field. */
        @NativeType("unsigned int")
        public int me_numreaders() { return MDBEnvInfo.nme_numreaders(address()); }

    }

}