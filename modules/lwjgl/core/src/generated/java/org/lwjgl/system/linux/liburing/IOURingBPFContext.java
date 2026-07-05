/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux.liburing;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct io_uring_bpf_ctx {
 *     __u64 user_data;
 *     __u8 opcode;
 *     __u8 sqe_flags;
 *     __u8 pdu_size;
 *     __u8 pad[5];
 *     union {
 *         struct {
 *             __u32 family;
 *             __u32 type;
 *             __u32 protocol;
 *         } socket;
 *         struct {
 *             __u64 flags;
 *             __u64 mode;
 *             __u64 resolve;
 *         } open;
 *     };
 * }}</pre>
 */
@NativeType("struct io_uring_bpf_ctx")
public class IOURingBPFContext extends Struct<IOURingBPFContext> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        USER_DATA,
        OPCODE,
        SQE_FLAGS,
        PDU_SIZE,
        PAD,
        SOCKET,
            SOCKET_FAMILY,
            SOCKET_TYPE,
            SOCKET_PROTOCOL,
        OPEN,
            OPEN_FLAGS,
            OPEN_MODE,
            OPEN_RESOLVE;

    static {
        Layout layout = __struct(
            __member(8),
            __member(1),
            __member(1),
            __member(1),
            __array(1, 5),
            __union(
                __struct(
                    __member(4),
                    __member(4),
                    __member(4)
                ),
                __struct(
                    __member(8),
                    __member(8),
                    __member(8)
                )
            )
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        USER_DATA = layout.offsetof(0);
        OPCODE = layout.offsetof(1);
        SQE_FLAGS = layout.offsetof(2);
        PDU_SIZE = layout.offsetof(3);
        PAD = layout.offsetof(4);
        SOCKET = layout.offsetof(6);
            SOCKET_FAMILY = layout.offsetof(7);
            SOCKET_TYPE = layout.offsetof(8);
            SOCKET_PROTOCOL = layout.offsetof(9);
        OPEN = layout.offsetof(10);
            OPEN_FLAGS = layout.offsetof(11);
            OPEN_MODE = layout.offsetof(12);
            OPEN_RESOLVE = layout.offsetof(13);
    }

    protected IOURingBPFContext(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected IOURingBPFContext create(long address, @Nullable ByteBuffer container) {
        return new IOURingBPFContext(address, container);
    }

    /**
     * Creates a {@code IOURingBPFContext} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IOURingBPFContext(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code user_data} field. */
    @NativeType("__u64")
    public long user_data() { return nuser_data(address()); }
    /** @return the value of the {@code opcode} field. */
    @NativeType("__u8")
    public byte opcode() { return nopcode(address()); }
    /** @return the value of the {@code sqe_flags} field. */
    @NativeType("__u8")
    public byte sqe_flags() { return nsqe_flags(address()); }
    /** @return the value of the {@code pdu_size} field. */
    @NativeType("__u8")
    public byte pdu_size() { return npdu_size(address()); }
    /** @return the value of the {@code socket.family} field. */
    @NativeType("__u32")
    public int socket_family() { return nsocket_family(address()); }
    /** @return the value of the {@code socket.type} field. */
    @NativeType("__u32")
    public int socket_type() { return nsocket_type(address()); }
    /** @return the value of the {@code socket.protocol} field. */
    @NativeType("__u32")
    public int socket_protocol() { return nsocket_protocol(address()); }
    /** @return the value of the {@code open.flags} field. */
    @NativeType("__u64")
    public long open_flags() { return nopen_flags(address()); }
    /** @return the value of the {@code open.mode} field. */
    @NativeType("__u64")
    public long open_mode() { return nopen_mode(address()); }
    /** @return the value of the {@code open.resolve} field. */
    @NativeType("__u64")
    public long open_resolve() { return nopen_resolve(address()); }

    /** Sets the specified value to the {@code user_data} field. */
    public IOURingBPFContext user_data(@NativeType("__u64") long value) { nuser_data(address(), value); return this; }
    /** Sets the specified value to the {@code opcode} field. */
    public IOURingBPFContext opcode(@NativeType("__u8") byte value) { nopcode(address(), value); return this; }
    /** Sets the specified value to the {@code sqe_flags} field. */
    public IOURingBPFContext sqe_flags(@NativeType("__u8") byte value) { nsqe_flags(address(), value); return this; }
    /** Sets the specified value to the {@code pdu_size} field. */
    public IOURingBPFContext pdu_size(@NativeType("__u8") byte value) { npdu_size(address(), value); return this; }
    /** Sets the specified value to the {@code family} field. */
    public IOURingBPFContext socket_family(@NativeType("__u32") int value) { nsocket_family(address(), value); return this; }
    /** Sets the specified value to the {@code type} field. */
    public IOURingBPFContext socket_type(@NativeType("__u32") int value) { nsocket_type(address(), value); return this; }
    /** Sets the specified value to the {@code protocol} field. */
    public IOURingBPFContext socket_protocol(@NativeType("__u32") int value) { nsocket_protocol(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public IOURingBPFContext open_flags(@NativeType("__u64") long value) { nopen_flags(address(), value); return this; }
    /** Sets the specified value to the {@code mode} field. */
    public IOURingBPFContext open_mode(@NativeType("__u64") long value) { nopen_mode(address(), value); return this; }
    /** Sets the specified value to the {@code resolve} field. */
    public IOURingBPFContext open_resolve(@NativeType("__u64") long value) { nopen_resolve(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public IOURingBPFContext set(IOURingBPFContext src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code IOURingBPFContext} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IOURingBPFContext malloc() {
        return new IOURingBPFContext(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code IOURingBPFContext} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IOURingBPFContext calloc() {
        return new IOURingBPFContext(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code IOURingBPFContext} instance allocated with {@link BufferUtils}. */
    public static IOURingBPFContext create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingBPFContext(memAddress(container), container);
    }

    /** Returns a new {@code IOURingBPFContext} instance for the specified memory address. */
    public static IOURingBPFContext create(long address) {
        return new IOURingBPFContext(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable IOURingBPFContext createSafe(long address) {
        return address == NULL ? null : new IOURingBPFContext(address, null);
    }

    /**
     * Returns a new {@link IOURingBPFContext.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingBPFContext.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IOURingBPFContext.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingBPFContext.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingBPFContext.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingBPFContext.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link IOURingBPFContext.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IOURingBPFContext.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static IOURingBPFContext.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code IOURingBPFContext} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingBPFContext malloc(MemoryStack stack) {
        return new IOURingBPFContext(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code IOURingBPFContext} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingBPFContext calloc(MemoryStack stack) {
        return new IOURingBPFContext(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link IOURingBPFContext.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingBPFContext.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingBPFContext.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingBPFContext.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #user_data}. */
    public static long nuser_data(long struct) { return memGetLong(struct + IOURingBPFContext.USER_DATA); }
    /** Unsafe version of {@link #opcode}. */
    public static byte nopcode(long struct) { return memGetByte(struct + IOURingBPFContext.OPCODE); }
    /** Unsafe version of {@link #sqe_flags}. */
    public static byte nsqe_flags(long struct) { return memGetByte(struct + IOURingBPFContext.SQE_FLAGS); }
    /** Unsafe version of {@link #pdu_size}. */
    public static byte npdu_size(long struct) { return memGetByte(struct + IOURingBPFContext.PDU_SIZE); }
    static ByteBuffer npad(long struct) { return memByteBuffer(struct + IOURingBPFContext.PAD, 5); }
    static byte npad(long struct, int index) {
        return memGetByte(struct + IOURingBPFContext.PAD + check(index, 5) * 1);
    }
    /** Unsafe version of {@link #socket_family}. */
    public static int nsocket_family(long struct) { return memGetInt(struct + IOURingBPFContext.SOCKET_FAMILY); }
    /** Unsafe version of {@link #socket_type}. */
    public static int nsocket_type(long struct) { return memGetInt(struct + IOURingBPFContext.SOCKET_TYPE); }
    /** Unsafe version of {@link #socket_protocol}. */
    public static int nsocket_protocol(long struct) { return memGetInt(struct + IOURingBPFContext.SOCKET_PROTOCOL); }
    /** Unsafe version of {@link #open_flags}. */
    public static long nopen_flags(long struct) { return memGetLong(struct + IOURingBPFContext.OPEN_FLAGS); }
    /** Unsafe version of {@link #open_mode}. */
    public static long nopen_mode(long struct) { return memGetLong(struct + IOURingBPFContext.OPEN_MODE); }
    /** Unsafe version of {@link #open_resolve}. */
    public static long nopen_resolve(long struct) { return memGetLong(struct + IOURingBPFContext.OPEN_RESOLVE); }

    /** Unsafe version of {@link #user_data(long) user_data}. */
    public static void nuser_data(long struct, long value) { memPutLong(struct + IOURingBPFContext.USER_DATA, value); }
    /** Unsafe version of {@link #opcode(byte) opcode}. */
    public static void nopcode(long struct, byte value) { memPutByte(struct + IOURingBPFContext.OPCODE, value); }
    /** Unsafe version of {@link #sqe_flags(byte) sqe_flags}. */
    public static void nsqe_flags(long struct, byte value) { memPutByte(struct + IOURingBPFContext.SQE_FLAGS, value); }
    /** Unsafe version of {@link #pdu_size(byte) pdu_size}. */
    public static void npdu_size(long struct, byte value) { memPutByte(struct + IOURingBPFContext.PDU_SIZE, value); }
    static void npad(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 5); }
        memCopy(memAddress(value), struct + IOURingBPFContext.PAD, value.remaining() * 1);
    }
    static void npad(long struct, int index, byte value) {
        memPutByte(struct + IOURingBPFContext.PAD + check(index, 5) * 1, value);
    }
    /** Unsafe version of {@link #socket_family(int) socket_family}. */
    public static void nsocket_family(long struct, int value) { memPutInt(struct + IOURingBPFContext.SOCKET_FAMILY, value); }
    /** Unsafe version of {@link #socket_type(int) socket_type}. */
    public static void nsocket_type(long struct, int value) { memPutInt(struct + IOURingBPFContext.SOCKET_TYPE, value); }
    /** Unsafe version of {@link #socket_protocol(int) socket_protocol}. */
    public static void nsocket_protocol(long struct, int value) { memPutInt(struct + IOURingBPFContext.SOCKET_PROTOCOL, value); }
    /** Unsafe version of {@link #open_flags(long) open_flags}. */
    public static void nopen_flags(long struct, long value) { memPutLong(struct + IOURingBPFContext.OPEN_FLAGS, value); }
    /** Unsafe version of {@link #open_mode(long) open_mode}. */
    public static void nopen_mode(long struct, long value) { memPutLong(struct + IOURingBPFContext.OPEN_MODE, value); }
    /** Unsafe version of {@link #open_resolve(long) open_resolve}. */
    public static void nopen_resolve(long struct, long value) { memPutLong(struct + IOURingBPFContext.OPEN_RESOLVE, value); }

    // -----------------------------------

    /** An array of {@link IOURingBPFContext} structs. */
    public static class Buffer extends StructBuffer<IOURingBPFContext, Buffer> implements NativeResource {

        private static final IOURingBPFContext ELEMENT_FACTORY = IOURingBPFContext.create(-1L);

        /**
         * Creates a new {@code IOURingBPFContext.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IOURingBPFContext#SIZEOF}, and its mark will be undefined.</p>
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
        protected IOURingBPFContext getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code user_data} field. */
        @NativeType("__u64")
        public long user_data() { return IOURingBPFContext.nuser_data(address()); }
        /** @return the value of the {@code opcode} field. */
        @NativeType("__u8")
        public byte opcode() { return IOURingBPFContext.nopcode(address()); }
        /** @return the value of the {@code sqe_flags} field. */
        @NativeType("__u8")
        public byte sqe_flags() { return IOURingBPFContext.nsqe_flags(address()); }
        /** @return the value of the {@code pdu_size} field. */
        @NativeType("__u8")
        public byte pdu_size() { return IOURingBPFContext.npdu_size(address()); }
        /** @return the value of the {@code socket.family} field. */
        @NativeType("__u32")
        public int socket_family() { return IOURingBPFContext.nsocket_family(address()); }
        /** @return the value of the {@code socket.type} field. */
        @NativeType("__u32")
        public int socket_type() { return IOURingBPFContext.nsocket_type(address()); }
        /** @return the value of the {@code socket.protocol} field. */
        @NativeType("__u32")
        public int socket_protocol() { return IOURingBPFContext.nsocket_protocol(address()); }
        /** @return the value of the {@code open.flags} field. */
        @NativeType("__u64")
        public long open_flags() { return IOURingBPFContext.nopen_flags(address()); }
        /** @return the value of the {@code open.mode} field. */
        @NativeType("__u64")
        public long open_mode() { return IOURingBPFContext.nopen_mode(address()); }
        /** @return the value of the {@code open.resolve} field. */
        @NativeType("__u64")
        public long open_resolve() { return IOURingBPFContext.nopen_resolve(address()); }

        /** Sets the specified value to the {@code user_data} field. */
        public IOURingBPFContext.Buffer user_data(@NativeType("__u64") long value) { IOURingBPFContext.nuser_data(address(), value); return this; }
        /** Sets the specified value to the {@code opcode} field. */
        public IOURingBPFContext.Buffer opcode(@NativeType("__u8") byte value) { IOURingBPFContext.nopcode(address(), value); return this; }
        /** Sets the specified value to the {@code sqe_flags} field. */
        public IOURingBPFContext.Buffer sqe_flags(@NativeType("__u8") byte value) { IOURingBPFContext.nsqe_flags(address(), value); return this; }
        /** Sets the specified value to the {@code pdu_size} field. */
        public IOURingBPFContext.Buffer pdu_size(@NativeType("__u8") byte value) { IOURingBPFContext.npdu_size(address(), value); return this; }
        /** Sets the specified value to the {@code family} field. */
        public IOURingBPFContext.Buffer socket_family(@NativeType("__u32") int value) { IOURingBPFContext.nsocket_family(address(), value); return this; }
        /** Sets the specified value to the {@code type} field. */
        public IOURingBPFContext.Buffer socket_type(@NativeType("__u32") int value) { IOURingBPFContext.nsocket_type(address(), value); return this; }
        /** Sets the specified value to the {@code protocol} field. */
        public IOURingBPFContext.Buffer socket_protocol(@NativeType("__u32") int value) { IOURingBPFContext.nsocket_protocol(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public IOURingBPFContext.Buffer open_flags(@NativeType("__u64") long value) { IOURingBPFContext.nopen_flags(address(), value); return this; }
        /** Sets the specified value to the {@code mode} field. */
        public IOURingBPFContext.Buffer open_mode(@NativeType("__u64") long value) { IOURingBPFContext.nopen_mode(address(), value); return this; }
        /** Sets the specified value to the {@code resolve} field. */
        public IOURingBPFContext.Buffer open_resolve(@NativeType("__u64") long value) { IOURingBPFContext.nopen_resolve(address(), value); return this; }

    }

}