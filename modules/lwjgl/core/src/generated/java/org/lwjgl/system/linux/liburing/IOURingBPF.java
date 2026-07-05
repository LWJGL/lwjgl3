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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre><code>
 * struct io_uring_bpf {
 *     __u16 cmd_type;
 *     __u16 cmd_flags;
 *     __u32 resv;
 *     union {
 *         {@link IOURingBPFFilter struct io_uring_bpf_filter} filter;
 *     };
 * }</code></pre>
 */
@NativeType("struct io_uring_bpf")
public class IOURingBPF extends Struct<IOURingBPF> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CMD_TYPE,
        CMD_FLAGS,
        RESV,
        FILTER;

    static {
        Layout layout = __struct(
            __member(2),
            __member(2),
            __member(4),
            __union(
                __member(IOURingBPFFilter.SIZEOF, IOURingBPFFilter.ALIGNOF)
            )
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CMD_TYPE = layout.offsetof(0);
        CMD_FLAGS = layout.offsetof(1);
        RESV = layout.offsetof(2);
        FILTER = layout.offsetof(4);
    }

    protected IOURingBPF(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected IOURingBPF create(long address, @Nullable ByteBuffer container) {
        return new IOURingBPF(address, container);
    }

    /**
     * Creates a {@code IOURingBPF} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IOURingBPF(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code cmd_type} field. */
    @NativeType("__u16")
    public short cmd_type() { return ncmd_type(address()); }
    /** @return the value of the {@code cmd_flags} field. */
    @NativeType("__u16")
    public short cmd_flags() { return ncmd_flags(address()); }
    /** @return a {@link IOURingBPFFilter} view of the {@code filter} field. */
    @NativeType("struct io_uring_bpf_filter")
    public IOURingBPFFilter filter() { return nfilter(address()); }

    /** Sets the specified value to the {@code cmd_type} field. */
    public IOURingBPF cmd_type(@NativeType("__u16") short value) { ncmd_type(address(), value); return this; }
    /** Sets the specified value to the {@code cmd_flags} field. */
    public IOURingBPF cmd_flags(@NativeType("__u16") short value) { ncmd_flags(address(), value); return this; }
    /** Copies the specified {@link IOURingBPFFilter} to the {@code filter} field. */
    public IOURingBPF filter(@NativeType("struct io_uring_bpf_filter") IOURingBPFFilter value) { nfilter(address(), value); return this; }
    /** Passes the {@code filter} field to the specified {@link java.util.function.Consumer Consumer}. */
    public IOURingBPF filter(java.util.function.Consumer<IOURingBPFFilter> consumer) { consumer.accept(filter()); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public IOURingBPF set(IOURingBPF src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code IOURingBPF} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IOURingBPF malloc() {
        return new IOURingBPF(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code IOURingBPF} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IOURingBPF calloc() {
        return new IOURingBPF(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code IOURingBPF} instance allocated with {@link BufferUtils}. */
    public static IOURingBPF create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingBPF(memAddress(container), container);
    }

    /** Returns a new {@code IOURingBPF} instance for the specified memory address. */
    public static IOURingBPF create(long address) {
        return new IOURingBPF(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable IOURingBPF createSafe(long address) {
        return address == NULL ? null : new IOURingBPF(address, null);
    }

    /**
     * Returns a new {@link IOURingBPF.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingBPF.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IOURingBPF.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingBPF.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingBPF.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingBPF.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link IOURingBPF.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IOURingBPF.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static IOURingBPF.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code IOURingBPF} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingBPF malloc(MemoryStack stack) {
        return new IOURingBPF(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code IOURingBPF} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingBPF calloc(MemoryStack stack) {
        return new IOURingBPF(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link IOURingBPF.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingBPF.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingBPF.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingBPF.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #cmd_type}. */
    public static short ncmd_type(long struct) { return memGetShort(struct + IOURingBPF.CMD_TYPE); }
    /** Unsafe version of {@link #cmd_flags}. */
    public static short ncmd_flags(long struct) { return memGetShort(struct + IOURingBPF.CMD_FLAGS); }
    static int nresv(long struct) { return memGetInt(struct + IOURingBPF.RESV); }
    /** Unsafe version of {@link #filter}. */
    public static IOURingBPFFilter nfilter(long struct) { return IOURingBPFFilter.create(struct + IOURingBPF.FILTER); }

    /** Unsafe version of {@link #cmd_type(short) cmd_type}. */
    public static void ncmd_type(long struct, short value) { memPutShort(struct + IOURingBPF.CMD_TYPE, value); }
    /** Unsafe version of {@link #cmd_flags(short) cmd_flags}. */
    public static void ncmd_flags(long struct, short value) { memPutShort(struct + IOURingBPF.CMD_FLAGS, value); }
    static void nresv(long struct, int value) { memPutInt(struct + IOURingBPF.RESV, value); }
    /** Unsafe version of {@link #filter(IOURingBPFFilter) filter}. */
    public static void nfilter(long struct, IOURingBPFFilter value) { memCopy(value.address(), struct + IOURingBPF.FILTER, IOURingBPFFilter.SIZEOF); }

    // -----------------------------------

    /** An array of {@link IOURingBPF} structs. */
    public static class Buffer extends StructBuffer<IOURingBPF, Buffer> implements NativeResource {

        private static final IOURingBPF ELEMENT_FACTORY = IOURingBPF.create(-1L);

        /**
         * Creates a new {@code IOURingBPF.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IOURingBPF#SIZEOF}, and its mark will be undefined.</p>
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
        protected IOURingBPF getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code cmd_type} field. */
        @NativeType("__u16")
        public short cmd_type() { return IOURingBPF.ncmd_type(address()); }
        /** @return the value of the {@code cmd_flags} field. */
        @NativeType("__u16")
        public short cmd_flags() { return IOURingBPF.ncmd_flags(address()); }
        /** @return a {@link IOURingBPFFilter} view of the {@code filter} field. */
        @NativeType("struct io_uring_bpf_filter")
        public IOURingBPFFilter filter() { return IOURingBPF.nfilter(address()); }

        /** Sets the specified value to the {@code cmd_type} field. */
        public IOURingBPF.Buffer cmd_type(@NativeType("__u16") short value) { IOURingBPF.ncmd_type(address(), value); return this; }
        /** Sets the specified value to the {@code cmd_flags} field. */
        public IOURingBPF.Buffer cmd_flags(@NativeType("__u16") short value) { IOURingBPF.ncmd_flags(address(), value); return this; }
        /** Copies the specified {@link IOURingBPFFilter} to the {@code filter} field. */
        public IOURingBPF.Buffer filter(@NativeType("struct io_uring_bpf_filter") IOURingBPFFilter value) { IOURingBPF.nfilter(address(), value); return this; }
        /** Passes the {@code filter} field to the specified {@link java.util.function.Consumer Consumer}. */
        public IOURingBPF.Buffer filter(java.util.function.Consumer<IOURingBPFFilter> consumer) { consumer.accept(filter()); return this; }

    }

}