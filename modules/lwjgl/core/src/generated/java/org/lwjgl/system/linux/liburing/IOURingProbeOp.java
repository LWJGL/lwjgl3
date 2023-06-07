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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct io_uring_probe_op {
 *     __u8 op;
 *     __u8 resv;
 *     __u16 {@link #flags};
 *     __u32 resv2;
 * }</code></pre>
 */
@NativeType("struct io_uring_probe_op")
public class IOURingProbeOp extends Struct<IOURingProbeOp> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        OP,
        RESV,
        FLAGS,
        RESV2;

    static {
        Layout layout = __struct(
            __member(1),
            __member(1),
            __member(2),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        OP = layout.offsetof(0);
        RESV = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        RESV2 = layout.offsetof(3);
    }

    protected IOURingProbeOp(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected IOURingProbeOp create(long address, @Nullable ByteBuffer container) {
        return new IOURingProbeOp(address, container);
    }

    /**
     * Creates a {@code IOURingProbeOp} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IOURingProbeOp(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code op} field. */
    @NativeType("__u8")
    public byte op() { return nop(address()); }
    /** @return the value of the {@code resv} field. */
    @NativeType("__u8")
    public byte resv() { return nresv(address()); }
    /** one or more of:<br><table><tr><td>{@link LibIOURing#IO_URING_OP_SUPPORTED}</td></tr></table> */
    @NativeType("__u16")
    public short flags() { return nflags(address()); }
    /** @return the value of the {@code resv2} field. */
    @NativeType("__u32")
    public int resv2() { return nresv2(address()); }

    /** Sets the specified value to the {@code op} field. */
    public IOURingProbeOp op(@NativeType("__u8") byte value) { nop(address(), value); return this; }
    /** Sets the specified value to the {@code resv} field. */
    public IOURingProbeOp resv(@NativeType("__u8") byte value) { nresv(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public IOURingProbeOp flags(@NativeType("__u16") short value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code resv2} field. */
    public IOURingProbeOp resv2(@NativeType("__u32") int value) { nresv2(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public IOURingProbeOp set(
        byte op,
        byte resv,
        short flags,
        int resv2
    ) {
        op(op);
        resv(resv);
        flags(flags);
        resv2(resv2);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public IOURingProbeOp set(IOURingProbeOp src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code IOURingProbeOp} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IOURingProbeOp malloc() {
        return new IOURingProbeOp(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code IOURingProbeOp} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IOURingProbeOp calloc() {
        return new IOURingProbeOp(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code IOURingProbeOp} instance allocated with {@link BufferUtils}. */
    public static IOURingProbeOp create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingProbeOp(memAddress(container), container);
    }

    /** Returns a new {@code IOURingProbeOp} instance for the specified memory address. */
    public static IOURingProbeOp create(long address) {
        return new IOURingProbeOp(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static IOURingProbeOp createSafe(long address) {
        return address == NULL ? null : new IOURingProbeOp(address, null);
    }

    /**
     * Returns a new {@link IOURingProbeOp.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingProbeOp.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IOURingProbeOp.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingProbeOp.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingProbeOp.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingProbeOp.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link IOURingProbeOp.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IOURingProbeOp.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static IOURingProbeOp.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code IOURingProbeOp} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingProbeOp malloc(MemoryStack stack) {
        return new IOURingProbeOp(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code IOURingProbeOp} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingProbeOp calloc(MemoryStack stack) {
        return new IOURingProbeOp(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link IOURingProbeOp.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingProbeOp.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingProbeOp.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingProbeOp.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #op}. */
    public static byte nop(long struct) { return UNSAFE.getByte(null, struct + IOURingProbeOp.OP); }
    /** Unsafe version of {@link #resv}. */
    public static byte nresv(long struct) { return UNSAFE.getByte(null, struct + IOURingProbeOp.RESV); }
    /** Unsafe version of {@link #flags}. */
    public static short nflags(long struct) { return UNSAFE.getShort(null, struct + IOURingProbeOp.FLAGS); }
    /** Unsafe version of {@link #resv2}. */
    public static int nresv2(long struct) { return UNSAFE.getInt(null, struct + IOURingProbeOp.RESV2); }

    /** Unsafe version of {@link #op(byte) op}. */
    public static void nop(long struct, byte value) { UNSAFE.putByte(null, struct + IOURingProbeOp.OP, value); }
    /** Unsafe version of {@link #resv(byte) resv}. */
    public static void nresv(long struct, byte value) { UNSAFE.putByte(null, struct + IOURingProbeOp.RESV, value); }
    /** Unsafe version of {@link #flags(short) flags}. */
    public static void nflags(long struct, short value) { UNSAFE.putShort(null, struct + IOURingProbeOp.FLAGS, value); }
    /** Unsafe version of {@link #resv2(int) resv2}. */
    public static void nresv2(long struct, int value) { UNSAFE.putInt(null, struct + IOURingProbeOp.RESV2, value); }

    // -----------------------------------

    /** An array of {@link IOURingProbeOp} structs. */
    public static class Buffer extends StructBuffer<IOURingProbeOp, Buffer> implements NativeResource {

        private static final IOURingProbeOp ELEMENT_FACTORY = IOURingProbeOp.create(-1L);

        /**
         * Creates a new {@code IOURingProbeOp.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IOURingProbeOp#SIZEOF}, and its mark will be undefined.</p>
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
        protected IOURingProbeOp getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code op} field. */
        @NativeType("__u8")
        public byte op() { return IOURingProbeOp.nop(address()); }
        /** @return the value of the {@code resv} field. */
        @NativeType("__u8")
        public byte resv() { return IOURingProbeOp.nresv(address()); }
        /** @return the value of the {@link IOURingProbeOp#flags} field. */
        @NativeType("__u16")
        public short flags() { return IOURingProbeOp.nflags(address()); }
        /** @return the value of the {@code resv2} field. */
        @NativeType("__u32")
        public int resv2() { return IOURingProbeOp.nresv2(address()); }

        /** Sets the specified value to the {@code op} field. */
        public IOURingProbeOp.Buffer op(@NativeType("__u8") byte value) { IOURingProbeOp.nop(address(), value); return this; }
        /** Sets the specified value to the {@code resv} field. */
        public IOURingProbeOp.Buffer resv(@NativeType("__u8") byte value) { IOURingProbeOp.nresv(address(), value); return this; }
        /** Sets the specified value to the {@link IOURingProbeOp#flags} field. */
        public IOURingProbeOp.Buffer flags(@NativeType("__u16") short value) { IOURingProbeOp.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code resv2} field. */
        public IOURingProbeOp.Buffer resv2(@NativeType("__u32") int value) { IOURingProbeOp.nresv2(address(), value); return this; }

    }

}