/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux.liburing;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Argument for {@code IORING_(UN)REGISTER_PBUF_RING}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct io_uring_buf_reg {
 *     __u64 ring_addr;
 *     __u32 ring_entries;
 *     __u16 bgid;
 *     __u16 pad;
 *     __u64 resv[3];
 * }</code></pre>
 */
@NativeType("struct io_uring_buf_reg")
public class IOURingBufReg extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        RING_ADDR,
        RING_ENTRIES,
        BGID,
        PAD,
        RESV;

    static {
        Layout layout = __struct(
            __member(8),
            __member(4),
            __member(2),
            __member(2),
            __array(8, 3)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        RING_ADDR = layout.offsetof(0);
        RING_ENTRIES = layout.offsetof(1);
        BGID = layout.offsetof(2);
        PAD = layout.offsetof(3);
        RESV = layout.offsetof(4);
    }

    /**
     * Creates a {@code IOURingBufReg} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IOURingBufReg(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code ring_addr} field. */
    @NativeType("__u64")
    public long ring_addr() { return nring_addr(address()); }
    /** @return the value of the {@code ring_entries} field. */
    @NativeType("__u32")
    public int ring_entries() { return nring_entries(address()); }
    /** @return the value of the {@code bgid} field. */
    @NativeType("__u16")
    public short bgid() { return nbgid(address()); }
    /** @return the value of the {@code pad} field. */
    @NativeType("__u16")
    public short pad() { return npad(address()); }
    /** @return a {@link LongBuffer} view of the {@code resv} field. */
    @NativeType("__u64[3]")
    public LongBuffer resv() { return nresv(address()); }
    /** @return the value at the specified index of the {@code resv} field. */
    @NativeType("__u64")
    public long resv(int index) { return nresv(address(), index); }

    /** Sets the specified value to the {@code ring_addr} field. */
    public IOURingBufReg ring_addr(@NativeType("__u64") long value) { nring_addr(address(), value); return this; }
    /** Sets the specified value to the {@code ring_entries} field. */
    public IOURingBufReg ring_entries(@NativeType("__u32") int value) { nring_entries(address(), value); return this; }
    /** Sets the specified value to the {@code bgid} field. */
    public IOURingBufReg bgid(@NativeType("__u16") short value) { nbgid(address(), value); return this; }
    /** Sets the specified value to the {@code pad} field. */
    public IOURingBufReg pad(@NativeType("__u16") short value) { npad(address(), value); return this; }
    /** Copies the specified {@link LongBuffer} to the {@code resv} field. */
    public IOURingBufReg resv(@NativeType("__u64[3]") LongBuffer value) { nresv(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code resv} field. */
    public IOURingBufReg resv(int index, @NativeType("__u64") long value) { nresv(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public IOURingBufReg set(
        long ring_addr,
        int ring_entries,
        short bgid,
        short pad,
        LongBuffer resv
    ) {
        ring_addr(ring_addr);
        ring_entries(ring_entries);
        bgid(bgid);
        pad(pad);
        resv(resv);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public IOURingBufReg set(IOURingBufReg src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code IOURingBufReg} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IOURingBufReg malloc() {
        return wrap(IOURingBufReg.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code IOURingBufReg} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IOURingBufReg calloc() {
        return wrap(IOURingBufReg.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code IOURingBufReg} instance allocated with {@link BufferUtils}. */
    public static IOURingBufReg create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(IOURingBufReg.class, memAddress(container), container);
    }

    /** Returns a new {@code IOURingBufReg} instance for the specified memory address. */
    public static IOURingBufReg create(long address) {
        return wrap(IOURingBufReg.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static IOURingBufReg createSafe(long address) {
        return address == NULL ? null : wrap(IOURingBufReg.class, address);
    }

    /**
     * Returns a new {@link IOURingBufReg.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingBufReg.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IOURingBufReg.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingBufReg.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingBufReg.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingBufReg.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link IOURingBufReg.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IOURingBufReg.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static IOURingBufReg.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code IOURingBufReg} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingBufReg malloc(MemoryStack stack) {
        return wrap(IOURingBufReg.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code IOURingBufReg} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingBufReg calloc(MemoryStack stack) {
        return wrap(IOURingBufReg.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link IOURingBufReg.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingBufReg.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingBufReg.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingBufReg.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #ring_addr}. */
    public static long nring_addr(long struct) { return UNSAFE.getLong(null, struct + IOURingBufReg.RING_ADDR); }
    /** Unsafe version of {@link #ring_entries}. */
    public static int nring_entries(long struct) { return UNSAFE.getInt(null, struct + IOURingBufReg.RING_ENTRIES); }
    /** Unsafe version of {@link #bgid}. */
    public static short nbgid(long struct) { return UNSAFE.getShort(null, struct + IOURingBufReg.BGID); }
    /** Unsafe version of {@link #pad}. */
    public static short npad(long struct) { return UNSAFE.getShort(null, struct + IOURingBufReg.PAD); }
    /** Unsafe version of {@link #resv}. */
    public static LongBuffer nresv(long struct) { return memLongBuffer(struct + IOURingBufReg.RESV, 3); }
    /** Unsafe version of {@link #resv(int) resv}. */
    public static long nresv(long struct, int index) {
        return UNSAFE.getLong(null, struct + IOURingBufReg.RESV + check(index, 3) * 8);
    }

    /** Unsafe version of {@link #ring_addr(long) ring_addr}. */
    public static void nring_addr(long struct, long value) { UNSAFE.putLong(null, struct + IOURingBufReg.RING_ADDR, value); }
    /** Unsafe version of {@link #ring_entries(int) ring_entries}. */
    public static void nring_entries(long struct, int value) { UNSAFE.putInt(null, struct + IOURingBufReg.RING_ENTRIES, value); }
    /** Unsafe version of {@link #bgid(short) bgid}. */
    public static void nbgid(long struct, short value) { UNSAFE.putShort(null, struct + IOURingBufReg.BGID, value); }
    /** Unsafe version of {@link #pad(short) pad}. */
    public static void npad(long struct, short value) { UNSAFE.putShort(null, struct + IOURingBufReg.PAD, value); }
    /** Unsafe version of {@link #resv(LongBuffer) resv}. */
    public static void nresv(long struct, LongBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + IOURingBufReg.RESV, value.remaining() * 8);
    }
    /** Unsafe version of {@link #resv(int, long) resv}. */
    public static void nresv(long struct, int index, long value) {
        UNSAFE.putLong(null, struct + IOURingBufReg.RESV + check(index, 3) * 8, value);
    }

    // -----------------------------------

    /** An array of {@link IOURingBufReg} structs. */
    public static class Buffer extends StructBuffer<IOURingBufReg, Buffer> implements NativeResource {

        private static final IOURingBufReg ELEMENT_FACTORY = IOURingBufReg.create(-1L);

        /**
         * Creates a new {@code IOURingBufReg.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IOURingBufReg#SIZEOF}, and its mark will be undefined.
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
        protected IOURingBufReg getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code ring_addr} field. */
        @NativeType("__u64")
        public long ring_addr() { return IOURingBufReg.nring_addr(address()); }
        /** @return the value of the {@code ring_entries} field. */
        @NativeType("__u32")
        public int ring_entries() { return IOURingBufReg.nring_entries(address()); }
        /** @return the value of the {@code bgid} field. */
        @NativeType("__u16")
        public short bgid() { return IOURingBufReg.nbgid(address()); }
        /** @return the value of the {@code pad} field. */
        @NativeType("__u16")
        public short pad() { return IOURingBufReg.npad(address()); }
        /** @return a {@link LongBuffer} view of the {@code resv} field. */
        @NativeType("__u64[3]")
        public LongBuffer resv() { return IOURingBufReg.nresv(address()); }
        /** @return the value at the specified index of the {@code resv} field. */
        @NativeType("__u64")
        public long resv(int index) { return IOURingBufReg.nresv(address(), index); }

        /** Sets the specified value to the {@code ring_addr} field. */
        public IOURingBufReg.Buffer ring_addr(@NativeType("__u64") long value) { IOURingBufReg.nring_addr(address(), value); return this; }
        /** Sets the specified value to the {@code ring_entries} field. */
        public IOURingBufReg.Buffer ring_entries(@NativeType("__u32") int value) { IOURingBufReg.nring_entries(address(), value); return this; }
        /** Sets the specified value to the {@code bgid} field. */
        public IOURingBufReg.Buffer bgid(@NativeType("__u16") short value) { IOURingBufReg.nbgid(address(), value); return this; }
        /** Sets the specified value to the {@code pad} field. */
        public IOURingBufReg.Buffer pad(@NativeType("__u16") short value) { IOURingBufReg.npad(address(), value); return this; }
        /** Copies the specified {@link LongBuffer} to the {@code resv} field. */
        public IOURingBufReg.Buffer resv(@NativeType("__u64[3]") LongBuffer value) { IOURingBufReg.nresv(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code resv} field. */
        public IOURingBufReg.Buffer resv(int index, @NativeType("__u64") long value) { IOURingBufReg.nresv(address(), index, value); return this; }

    }

}