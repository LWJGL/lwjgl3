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
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct io_uring_probe {
 *     __u8 last_op;
 *     __u8 ops_len;
 *     __u16 resv;
 *     __u32 resv2[3];
 *     {@link IOURingProbeOp struct io_uring_probe_op} ops[0];
 * }</code></pre>
 */
@NativeType("struct io_uring_probe")
public class IOURingProbe extends Struct<IOURingProbe> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        LAST_OP,
        OPS_LEN,
        RESV,
        RESV2,
        OPS;

    static {
        Layout layout = __struct(
            __member(1),
            __member(1),
            __member(2),
            __array(4, 3),
            __array(IOURingProbeOp.SIZEOF, IOURingProbeOp.ALIGNOF, 0)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        LAST_OP = layout.offsetof(0);
        OPS_LEN = layout.offsetof(1);
        RESV = layout.offsetof(2);
        RESV2 = layout.offsetof(3);
        OPS = layout.offsetof(4);
    }

    protected IOURingProbe(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected IOURingProbe create(long address, @Nullable ByteBuffer container) {
        return new IOURingProbe(address, container);
    }

    /**
     * Creates a {@code IOURingProbe} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IOURingProbe(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code last_op} field. */
    @NativeType("__u8")
    public byte last_op() { return nlast_op(address()); }
    /** @return the value of the {@code ops_len} field. */
    @NativeType("__u8")
    public byte ops_len() { return nops_len(address()); }
    /** @return the value of the {@code resv} field. */
    @NativeType("__u16")
    public short resv() { return nresv(address()); }
    /** @return a {@link IOURingProbeOp}.Buffer view of the {@code ops} field. */
    @NativeType("struct io_uring_probe_op[0]")
    public IOURingProbeOp.Buffer ops() { return nops(address()); }
    /** @return a {@link IOURingProbeOp} view of the struct at the specified index of the {@code ops} field. */
    @NativeType("struct io_uring_probe_op")
    public IOURingProbeOp ops(int index) { return nops(address(), index); }

    /** Sets the specified value to the {@code last_op} field. */
    public IOURingProbe last_op(@NativeType("__u8") byte value) { nlast_op(address(), value); return this; }
    /** Sets the specified value to the {@code ops_len} field. */
    public IOURingProbe ops_len(@NativeType("__u8") byte value) { nops_len(address(), value); return this; }
    /** Sets the specified value to the {@code resv} field. */
    public IOURingProbe resv(@NativeType("__u16") short value) { nresv(address(), value); return this; }
    /** Copies the specified {@link IOURingProbeOp.Buffer} to the {@code ops} field. */
    public IOURingProbe ops(@NativeType("struct io_uring_probe_op[0]") IOURingProbeOp.Buffer value) { nops(address(), value); return this; }
    /** Copies the specified {@link IOURingProbeOp} at the specified index of the {@code ops} field. */
    public IOURingProbe ops(int index, @NativeType("struct io_uring_probe_op") IOURingProbeOp value) { nops(address(), index, value); return this; }
    /** Passes the {@code ops} field to the specified {@link java.util.function.Consumer Consumer}. */
    public IOURingProbe ops(java.util.function.Consumer<IOURingProbeOp.Buffer> consumer) { consumer.accept(ops()); return this; }
    /** Passes the element at {@code index} of the {@code ops} field to the specified {@link java.util.function.Consumer Consumer}. */
    public IOURingProbe ops(int index, java.util.function.Consumer<IOURingProbeOp> consumer) { consumer.accept(ops(index)); return this; }

    /** Initializes this struct with the specified values. */
    public IOURingProbe set(
        byte last_op,
        byte ops_len,
        short resv,
        IOURingProbeOp.Buffer ops
    ) {
        last_op(last_op);
        ops_len(ops_len);
        resv(resv);
        ops(ops);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public IOURingProbe set(IOURingProbe src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code IOURingProbe} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IOURingProbe malloc() {
        return new IOURingProbe(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code IOURingProbe} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IOURingProbe calloc() {
        return new IOURingProbe(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code IOURingProbe} instance allocated with {@link BufferUtils}. */
    public static IOURingProbe create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingProbe(memAddress(container), container);
    }

    /** Returns a new {@code IOURingProbe} instance for the specified memory address. */
    public static IOURingProbe create(long address) {
        return new IOURingProbe(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static IOURingProbe createSafe(long address) {
        return address == NULL ? null : new IOURingProbe(address, null);
    }

    /**
     * Returns a new {@link IOURingProbe.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingProbe.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IOURingProbe.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingProbe.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingProbe.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingProbe.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link IOURingProbe.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IOURingProbe.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static IOURingProbe.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code IOURingProbe} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingProbe malloc(MemoryStack stack) {
        return new IOURingProbe(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code IOURingProbe} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingProbe calloc(MemoryStack stack) {
        return new IOURingProbe(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link IOURingProbe.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingProbe.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingProbe.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingProbe.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #last_op}. */
    public static byte nlast_op(long struct) { return UNSAFE.getByte(null, struct + IOURingProbe.LAST_OP); }
    /** Unsafe version of {@link #ops_len}. */
    public static byte nops_len(long struct) { return UNSAFE.getByte(null, struct + IOURingProbe.OPS_LEN); }
    /** Unsafe version of {@link #resv}. */
    public static short nresv(long struct) { return UNSAFE.getShort(null, struct + IOURingProbe.RESV); }
    public static IntBuffer nresv2(long struct) { return memIntBuffer(struct + IOURingProbe.RESV2, 3); }
    public static int nresv2(long struct, int index) {
        return UNSAFE.getInt(null, struct + IOURingProbe.RESV2 + check(index, 3) * 4);
    }
    /** Unsafe version of {@link #ops}. */
    public static IOURingProbeOp.Buffer nops(long struct) { return IOURingProbeOp.create(struct + IOURingProbe.OPS, 0); }
    /** Unsafe version of {@link #ops(int) ops}. */
    public static IOURingProbeOp nops(long struct, int index) {
        return IOURingProbeOp.create(struct + IOURingProbe.OPS + check(index, 0) * IOURingProbeOp.SIZEOF);
    }

    /** Unsafe version of {@link #last_op(byte) last_op}. */
    public static void nlast_op(long struct, byte value) { UNSAFE.putByte(null, struct + IOURingProbe.LAST_OP, value); }
    /** Unsafe version of {@link #ops_len(byte) ops_len}. */
    public static void nops_len(long struct, byte value) { UNSAFE.putByte(null, struct + IOURingProbe.OPS_LEN, value); }
    /** Unsafe version of {@link #resv(short) resv}. */
    public static void nresv(long struct, short value) { UNSAFE.putShort(null, struct + IOURingProbe.RESV, value); }
    public static void nresv2(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + IOURingProbe.RESV2, value.remaining() * 4);
    }
    public static void nresv2(long struct, int index, int value) {
        UNSAFE.putInt(null, struct + IOURingProbe.RESV2 + check(index, 3) * 4, value);
    }
    /** Unsafe version of {@link #ops(IOURingProbeOp.Buffer) ops}. */
    public static void nops(long struct, IOURingProbeOp.Buffer value) {
        if (CHECKS) { checkGT(value, 0); }
        memCopy(value.address(), struct + IOURingProbe.OPS, value.remaining() * IOURingProbeOp.SIZEOF);
    }
    /** Unsafe version of {@link #ops(int, IOURingProbeOp) ops}. */
    public static void nops(long struct, int index, IOURingProbeOp value) {
        memCopy(value.address(), struct + IOURingProbe.OPS + check(index, 0) * IOURingProbeOp.SIZEOF, IOURingProbeOp.SIZEOF);
    }

    // -----------------------------------

    /** An array of {@link IOURingProbe} structs. */
    public static class Buffer extends StructBuffer<IOURingProbe, Buffer> implements NativeResource {

        private static final IOURingProbe ELEMENT_FACTORY = IOURingProbe.create(-1L);

        /**
         * Creates a new {@code IOURingProbe.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IOURingProbe#SIZEOF}, and its mark will be undefined.</p>
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
        protected IOURingProbe getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code last_op} field. */
        @NativeType("__u8")
        public byte last_op() { return IOURingProbe.nlast_op(address()); }
        /** @return the value of the {@code ops_len} field. */
        @NativeType("__u8")
        public byte ops_len() { return IOURingProbe.nops_len(address()); }
        /** @return the value of the {@code resv} field. */
        @NativeType("__u16")
        public short resv() { return IOURingProbe.nresv(address()); }
        /** @return a {@link IOURingProbeOp}.Buffer view of the {@code ops} field. */
        @NativeType("struct io_uring_probe_op[0]")
        public IOURingProbeOp.Buffer ops() { return IOURingProbe.nops(address()); }
        /** @return a {@link IOURingProbeOp} view of the struct at the specified index of the {@code ops} field. */
        @NativeType("struct io_uring_probe_op")
        public IOURingProbeOp ops(int index) { return IOURingProbe.nops(address(), index); }

        /** Sets the specified value to the {@code last_op} field. */
        public IOURingProbe.Buffer last_op(@NativeType("__u8") byte value) { IOURingProbe.nlast_op(address(), value); return this; }
        /** Sets the specified value to the {@code ops_len} field. */
        public IOURingProbe.Buffer ops_len(@NativeType("__u8") byte value) { IOURingProbe.nops_len(address(), value); return this; }
        /** Sets the specified value to the {@code resv} field. */
        public IOURingProbe.Buffer resv(@NativeType("__u16") short value) { IOURingProbe.nresv(address(), value); return this; }
        /** Copies the specified {@link IOURingProbeOp.Buffer} to the {@code ops} field. */
        public IOURingProbe.Buffer ops(@NativeType("struct io_uring_probe_op[0]") IOURingProbeOp.Buffer value) { IOURingProbe.nops(address(), value); return this; }
        /** Copies the specified {@link IOURingProbeOp} at the specified index of the {@code ops} field. */
        public IOURingProbe.Buffer ops(int index, @NativeType("struct io_uring_probe_op") IOURingProbeOp value) { IOURingProbe.nops(address(), index, value); return this; }
        /** Passes the {@code ops} field to the specified {@link java.util.function.Consumer Consumer}. */
        public IOURingProbe.Buffer ops(java.util.function.Consumer<IOURingProbeOp.Buffer> consumer) { consumer.accept(ops()); return this; }
        /** Passes the element at {@code index} of the {@code ops} field to the specified {@link java.util.function.Consumer Consumer}. */
        public IOURingProbe.Buffer ops(int index, java.util.function.Consumer<IOURingProbeOp> consumer) { consumer.accept(ops(index)); return this; }

    }

}