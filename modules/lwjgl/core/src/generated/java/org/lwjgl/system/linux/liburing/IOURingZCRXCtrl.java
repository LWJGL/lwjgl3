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
 * <pre><code>
 * struct zcrx_ctrl {
 *     __u32 zcrx_id;
 *     __u32 op;
 *     __u64 __resv[2];
 *     union {
 *         {@link IOURingZCRXCtrlExport struct zcrx_ctrl_export} zc_export;
 *         {@link IOURingZCRXCtrlFlushRQ struct zcrx_ctrl_flush_rq} zc_flush;
 *     };
 * }</code></pre>
 */
@NativeType("struct zcrx_ctrl")
public class IOURingZCRXCtrl extends Struct<IOURingZCRXCtrl> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ZCRX_ID,
        OP,
        __RESV,
        ZC_EXPORT,
        ZC_FLUSH;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __array(8, 2),
            __union(
                __member(IOURingZCRXCtrlExport.SIZEOF, IOURingZCRXCtrlExport.ALIGNOF),
                __member(IOURingZCRXCtrlFlushRQ.SIZEOF, IOURingZCRXCtrlFlushRQ.ALIGNOF)
            )
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ZCRX_ID = layout.offsetof(0);
        OP = layout.offsetof(1);
        __RESV = layout.offsetof(2);
        ZC_EXPORT = layout.offsetof(4);
        ZC_FLUSH = layout.offsetof(5);
    }

    protected IOURingZCRXCtrl(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected IOURingZCRXCtrl create(long address, @Nullable ByteBuffer container) {
        return new IOURingZCRXCtrl(address, container);
    }

    /**
     * Creates a {@code IOURingZCRXCtrl} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IOURingZCRXCtrl(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code zcrx_id} field. */
    @NativeType("__u32")
    public int zcrx_id() { return nzcrx_id(address()); }
    /** @return the value of the {@code op} field. */
    @NativeType("__u32")
    public int op() { return nop(address()); }
    /** @return a {@link IOURingZCRXCtrlExport} view of the {@code zc_export} field. */
    @NativeType("struct zcrx_ctrl_export")
    public IOURingZCRXCtrlExport zc_export() { return nzc_export(address()); }
    /** @return a {@link IOURingZCRXCtrlFlushRQ} view of the {@code zc_flush} field. */
    @NativeType("struct zcrx_ctrl_flush_rq")
    public IOURingZCRXCtrlFlushRQ zc_flush() { return nzc_flush(address()); }

    /** Sets the specified value to the {@code zcrx_id} field. */
    public IOURingZCRXCtrl zcrx_id(@NativeType("__u32") int value) { nzcrx_id(address(), value); return this; }
    /** Sets the specified value to the {@code op} field. */
    public IOURingZCRXCtrl op(@NativeType("__u32") int value) { nop(address(), value); return this; }
    /** Copies the specified {@link IOURingZCRXCtrlExport} to the {@code zc_export} field. */
    public IOURingZCRXCtrl zc_export(@NativeType("struct zcrx_ctrl_export") IOURingZCRXCtrlExport value) { nzc_export(address(), value); return this; }
    /** Passes the {@code zc_export} field to the specified {@link java.util.function.Consumer Consumer}. */
    public IOURingZCRXCtrl zc_export(java.util.function.Consumer<IOURingZCRXCtrlExport> consumer) { consumer.accept(zc_export()); return this; }
    /** Copies the specified {@link IOURingZCRXCtrlFlushRQ} to the {@code zc_flush} field. */
    public IOURingZCRXCtrl zc_flush(@NativeType("struct zcrx_ctrl_flush_rq") IOURingZCRXCtrlFlushRQ value) { nzc_flush(address(), value); return this; }
    /** Passes the {@code zc_flush} field to the specified {@link java.util.function.Consumer Consumer}. */
    public IOURingZCRXCtrl zc_flush(java.util.function.Consumer<IOURingZCRXCtrlFlushRQ> consumer) { consumer.accept(zc_flush()); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public IOURingZCRXCtrl set(IOURingZCRXCtrl src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code IOURingZCRXCtrl} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IOURingZCRXCtrl malloc() {
        return new IOURingZCRXCtrl(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code IOURingZCRXCtrl} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IOURingZCRXCtrl calloc() {
        return new IOURingZCRXCtrl(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code IOURingZCRXCtrl} instance allocated with {@link BufferUtils}. */
    public static IOURingZCRXCtrl create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingZCRXCtrl(memAddress(container), container);
    }

    /** Returns a new {@code IOURingZCRXCtrl} instance for the specified memory address. */
    public static IOURingZCRXCtrl create(long address) {
        return new IOURingZCRXCtrl(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable IOURingZCRXCtrl createSafe(long address) {
        return address == NULL ? null : new IOURingZCRXCtrl(address, null);
    }

    /**
     * Returns a new {@link IOURingZCRXCtrl.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingZCRXCtrl.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IOURingZCRXCtrl.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingZCRXCtrl.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingZCRXCtrl.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingZCRXCtrl.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link IOURingZCRXCtrl.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IOURingZCRXCtrl.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static IOURingZCRXCtrl.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code IOURingZCRXCtrl} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingZCRXCtrl malloc(MemoryStack stack) {
        return new IOURingZCRXCtrl(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code IOURingZCRXCtrl} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingZCRXCtrl calloc(MemoryStack stack) {
        return new IOURingZCRXCtrl(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link IOURingZCRXCtrl.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingZCRXCtrl.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingZCRXCtrl.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingZCRXCtrl.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #zcrx_id}. */
    public static int nzcrx_id(long struct) { return memGetInt(struct + IOURingZCRXCtrl.ZCRX_ID); }
    /** Unsafe version of {@link #op}. */
    public static int nop(long struct) { return memGetInt(struct + IOURingZCRXCtrl.OP); }
    static LongBuffer n__resv(long struct) { return memLongBuffer(struct + IOURingZCRXCtrl.__RESV, 2); }
    static long n__resv(long struct, int index) {
        return memGetLong(struct + IOURingZCRXCtrl.__RESV + check(index, 2) * 8);
    }
    /** Unsafe version of {@link #zc_export}. */
    public static IOURingZCRXCtrlExport nzc_export(long struct) { return IOURingZCRXCtrlExport.create(struct + IOURingZCRXCtrl.ZC_EXPORT); }
    /** Unsafe version of {@link #zc_flush}. */
    public static IOURingZCRXCtrlFlushRQ nzc_flush(long struct) { return IOURingZCRXCtrlFlushRQ.create(struct + IOURingZCRXCtrl.ZC_FLUSH); }

    /** Unsafe version of {@link #zcrx_id(int) zcrx_id}. */
    public static void nzcrx_id(long struct, int value) { memPutInt(struct + IOURingZCRXCtrl.ZCRX_ID, value); }
    /** Unsafe version of {@link #op(int) op}. */
    public static void nop(long struct, int value) { memPutInt(struct + IOURingZCRXCtrl.OP, value); }
    static void n__resv(long struct, LongBuffer value) {
        if (CHECKS) { checkGT(value, 2); }
        memCopy(memAddress(value), struct + IOURingZCRXCtrl.__RESV, value.remaining() * 8);
    }
    static void n__resv(long struct, int index, long value) {
        memPutLong(struct + IOURingZCRXCtrl.__RESV + check(index, 2) * 8, value);
    }
    /** Unsafe version of {@link #zc_export(IOURingZCRXCtrlExport) zc_export}. */
    public static void nzc_export(long struct, IOURingZCRXCtrlExport value) { memCopy(value.address(), struct + IOURingZCRXCtrl.ZC_EXPORT, IOURingZCRXCtrlExport.SIZEOF); }
    /** Unsafe version of {@link #zc_flush(IOURingZCRXCtrlFlushRQ) zc_flush}. */
    public static void nzc_flush(long struct, IOURingZCRXCtrlFlushRQ value) { memCopy(value.address(), struct + IOURingZCRXCtrl.ZC_FLUSH, IOURingZCRXCtrlFlushRQ.SIZEOF); }

    // -----------------------------------

    /** An array of {@link IOURingZCRXCtrl} structs. */
    public static class Buffer extends StructBuffer<IOURingZCRXCtrl, Buffer> implements NativeResource {

        private static final IOURingZCRXCtrl ELEMENT_FACTORY = IOURingZCRXCtrl.create(-1L);

        /**
         * Creates a new {@code IOURingZCRXCtrl.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IOURingZCRXCtrl#SIZEOF}, and its mark will be undefined.</p>
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
        protected IOURingZCRXCtrl getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code zcrx_id} field. */
        @NativeType("__u32")
        public int zcrx_id() { return IOURingZCRXCtrl.nzcrx_id(address()); }
        /** @return the value of the {@code op} field. */
        @NativeType("__u32")
        public int op() { return IOURingZCRXCtrl.nop(address()); }
        /** @return a {@link IOURingZCRXCtrlExport} view of the {@code zc_export} field. */
        @NativeType("struct zcrx_ctrl_export")
        public IOURingZCRXCtrlExport zc_export() { return IOURingZCRXCtrl.nzc_export(address()); }
        /** @return a {@link IOURingZCRXCtrlFlushRQ} view of the {@code zc_flush} field. */
        @NativeType("struct zcrx_ctrl_flush_rq")
        public IOURingZCRXCtrlFlushRQ zc_flush() { return IOURingZCRXCtrl.nzc_flush(address()); }

        /** Sets the specified value to the {@code zcrx_id} field. */
        public IOURingZCRXCtrl.Buffer zcrx_id(@NativeType("__u32") int value) { IOURingZCRXCtrl.nzcrx_id(address(), value); return this; }
        /** Sets the specified value to the {@code op} field. */
        public IOURingZCRXCtrl.Buffer op(@NativeType("__u32") int value) { IOURingZCRXCtrl.nop(address(), value); return this; }
        /** Copies the specified {@link IOURingZCRXCtrlExport} to the {@code zc_export} field. */
        public IOURingZCRXCtrl.Buffer zc_export(@NativeType("struct zcrx_ctrl_export") IOURingZCRXCtrlExport value) { IOURingZCRXCtrl.nzc_export(address(), value); return this; }
        /** Passes the {@code zc_export} field to the specified {@link java.util.function.Consumer Consumer}. */
        public IOURingZCRXCtrl.Buffer zc_export(java.util.function.Consumer<IOURingZCRXCtrlExport> consumer) { consumer.accept(zc_export()); return this; }
        /** Copies the specified {@link IOURingZCRXCtrlFlushRQ} to the {@code zc_flush} field. */
        public IOURingZCRXCtrl.Buffer zc_flush(@NativeType("struct zcrx_ctrl_flush_rq") IOURingZCRXCtrlFlushRQ value) { IOURingZCRXCtrl.nzc_flush(address(), value); return this; }
        /** Passes the {@code zc_flush} field to the specified {@link java.util.function.Consumer Consumer}. */
        public IOURingZCRXCtrl.Buffer zc_flush(java.util.function.Consumer<IOURingZCRXCtrlFlushRQ> consumer) { consumer.accept(zc_flush()); return this; }

    }

}