/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

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
 * union epoll_data_t {
 *     void * ptr;
 *     int fd;
 *     uint32_t u32;
 *     uint64_t u64;
 * }</code></pre>
 */
@NativeType("union epoll_data_t")
public class EpollData extends Struct<EpollData> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PTR,
        FD,
        U32,
        U64;

    static {
        Layout layout = __union(
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PTR = layout.offsetof(0);
        FD = layout.offsetof(1);
        U32 = layout.offsetof(2);
        U64 = layout.offsetof(3);
    }

    protected EpollData(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected EpollData create(long address, @Nullable ByteBuffer container) {
        return new EpollData(address, container);
    }

    /**
     * Creates a {@code EpollData} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public EpollData(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code ptr} field. */
    @NativeType("void *")
    public long ptr() { return nptr(address()); }
    /** @return the value of the {@code fd} field. */
    public int fd() { return nfd(address()); }
    /** @return the value of the {@code u32} field. */
    @NativeType("uint32_t")
    public int u32() { return nu32(address()); }
    /** @return the value of the {@code u64} field. */
    @NativeType("uint64_t")
    public long u64() { return nu64(address()); }

    /** Sets the specified value to the {@code ptr} field. */
    public EpollData ptr(@NativeType("void *") long value) { nptr(address(), value); return this; }
    /** Sets the specified value to the {@code fd} field. */
    public EpollData fd(int value) { nfd(address(), value); return this; }
    /** Sets the specified value to the {@code u32} field. */
    public EpollData u32(@NativeType("uint32_t") int value) { nu32(address(), value); return this; }
    /** Sets the specified value to the {@code u64} field. */
    public EpollData u64(@NativeType("uint64_t") long value) { nu64(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public EpollData set(EpollData src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code EpollData} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static EpollData malloc() {
        return new EpollData(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code EpollData} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static EpollData calloc() {
        return new EpollData(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code EpollData} instance allocated with {@link BufferUtils}. */
    public static EpollData create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new EpollData(memAddress(container), container);
    }

    /** Returns a new {@code EpollData} instance for the specified memory address. */
    public static EpollData create(long address) {
        return new EpollData(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static EpollData createSafe(long address) {
        return address == NULL ? null : new EpollData(address, null);
    }

    /**
     * Returns a new {@link EpollData.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static EpollData.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link EpollData.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static EpollData.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link EpollData.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static EpollData.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link EpollData.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static EpollData.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static EpollData.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code EpollData} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static EpollData malloc(MemoryStack stack) {
        return new EpollData(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code EpollData} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static EpollData calloc(MemoryStack stack) {
        return new EpollData(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link EpollData.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static EpollData.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link EpollData.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static EpollData.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #ptr}. */
    public static long nptr(long struct) { return memGetAddress(struct + EpollData.PTR); }
    /** Unsafe version of {@link #fd}. */
    public static int nfd(long struct) { return UNSAFE.getInt(null, struct + EpollData.FD); }
    /** Unsafe version of {@link #u32}. */
    public static int nu32(long struct) { return UNSAFE.getInt(null, struct + EpollData.U32); }
    /** Unsafe version of {@link #u64}. */
    public static long nu64(long struct) { return UNSAFE.getLong(null, struct + EpollData.U64); }

    /** Unsafe version of {@link #ptr(long) ptr}. */
    public static void nptr(long struct, long value) { memPutAddress(struct + EpollData.PTR, check(value)); }
    /** Unsafe version of {@link #fd(int) fd}. */
    public static void nfd(long struct, int value) { UNSAFE.putInt(null, struct + EpollData.FD, value); }
    /** Unsafe version of {@link #u32(int) u32}. */
    public static void nu32(long struct, int value) { UNSAFE.putInt(null, struct + EpollData.U32, value); }
    /** Unsafe version of {@link #u64(long) u64}. */
    public static void nu64(long struct, long value) { UNSAFE.putLong(null, struct + EpollData.U64, value); }

    // -----------------------------------

    /** An array of {@link EpollData} structs. */
    public static class Buffer extends StructBuffer<EpollData, Buffer> implements NativeResource {

        private static final EpollData ELEMENT_FACTORY = EpollData.create(-1L);

        /**
         * Creates a new {@code EpollData.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link EpollData#SIZEOF}, and its mark will be undefined.</p>
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
        protected EpollData getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code ptr} field. */
        @NativeType("void *")
        public long ptr() { return EpollData.nptr(address()); }
        /** @return the value of the {@code fd} field. */
        public int fd() { return EpollData.nfd(address()); }
        /** @return the value of the {@code u32} field. */
        @NativeType("uint32_t")
        public int u32() { return EpollData.nu32(address()); }
        /** @return the value of the {@code u64} field. */
        @NativeType("uint64_t")
        public long u64() { return EpollData.nu64(address()); }

        /** Sets the specified value to the {@code ptr} field. */
        public EpollData.Buffer ptr(@NativeType("void *") long value) { EpollData.nptr(address(), value); return this; }
        /** Sets the specified value to the {@code fd} field. */
        public EpollData.Buffer fd(int value) { EpollData.nfd(address(), value); return this; }
        /** Sets the specified value to the {@code u32} field. */
        public EpollData.Buffer u32(@NativeType("uint32_t") int value) { EpollData.nu32(address(), value); return this; }
        /** Sets the specified value to the {@code u64} field. */
        public EpollData.Buffer u64(@NativeType("uint64_t") long value) { EpollData.nu64(address(), value); return this; }

    }

}