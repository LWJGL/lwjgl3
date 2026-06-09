/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.tinyexr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre><code>
 * struct ExrDataSink {
 *     void * userdata;
 *     {@link ExrWriteCallbackI ExrWriteCallback} write;
 *     {@link ExrFetchCancelI ExrFetchCancel} cancel;
 *     uint32_t flags;
 * }</code></pre>
 */
public class ExrDataSink extends Struct<ExrDataSink> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        USERDATA,
        WRITE,
        CANCEL,
        FLAGS;

    static {
        java.util.Objects.requireNonNull(ExrWriteCallbackI.DESCRIPTOR);
        java.util.Objects.requireNonNull(ExrFetchCancelI.DESCRIPTOR);

        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        USERDATA = layout.offsetof(0);
        WRITE = layout.offsetof(1);
        CANCEL = layout.offsetof(2);
        FLAGS = layout.offsetof(3);
    }

    protected ExrDataSink(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ExrDataSink create(long address, @Nullable ByteBuffer container) {
        return new ExrDataSink(address, container);
    }

    /**
     * Creates a {@code ExrDataSink} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ExrDataSink(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code userdata} field. */
    @NativeType("void *")
    public long userdata() { return nuserdata(address()); }
    /** @return the value of the {@code write} field. */
    public ExrWriteCallback write() { return nwrite(address()); }
    /** @return the value of the {@code cancel} field. */
    public @Nullable ExrFetchCancel cancel() { return ncancel(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("uint32_t")
    public int flags() { return nflags(address()); }

    /** Sets the specified value to the {@code userdata} field. */
    public ExrDataSink userdata(@NativeType("void *") long value) { nuserdata(address(), value); return this; }
    /** Sets the specified value to the {@code write} field. */
    public ExrDataSink write(@NativeType("ExrWriteCallback") ExrWriteCallbackI value) { nwrite(address(), value); return this; }
    /** Sets the specified value to the {@code cancel} field. */
    public ExrDataSink cancel(@Nullable @NativeType("ExrFetchCancel") ExrFetchCancelI value) { ncancel(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public ExrDataSink flags(@NativeType("uint32_t") int value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ExrDataSink set(
        long userdata,
        ExrWriteCallbackI write,
        ExrFetchCancelI cancel,
        int flags
    ) {
        userdata(userdata);
        write(write);
        cancel(cancel);
        flags(flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ExrDataSink set(ExrDataSink src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ExrDataSink} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ExrDataSink malloc() {
        return new ExrDataSink(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ExrDataSink} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ExrDataSink calloc() {
        return new ExrDataSink(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ExrDataSink} instance allocated with {@link BufferUtils}. */
    public static ExrDataSink create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ExrDataSink(memAddress(container), container);
    }

    /** Returns a new {@code ExrDataSink} instance for the specified memory address. */
    public static ExrDataSink create(long address) {
        return new ExrDataSink(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ExrDataSink createSafe(long address) {
        return address == NULL ? null : new ExrDataSink(address, null);
    }

    /**
     * Returns a new {@link ExrDataSink.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrDataSink.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ExrDataSink.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrDataSink.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrDataSink.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ExrDataSink.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ExrDataSink.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ExrDataSink.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static ExrDataSink.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ExrDataSink} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrDataSink malloc(MemoryStack stack) {
        return new ExrDataSink(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ExrDataSink} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrDataSink calloc(MemoryStack stack) {
        return new ExrDataSink(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ExrDataSink.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrDataSink.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrDataSink.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrDataSink.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #userdata}. */
    public static long nuserdata(long struct) { return memGetAddress(struct + ExrDataSink.USERDATA); }
    /** Unsafe version of {@link #write}. */
    public static ExrWriteCallback nwrite(long struct) { return ExrWriteCallback.create(memGetAddress(struct + ExrDataSink.WRITE)); }
    /** Unsafe version of {@link #cancel}. */
    public static @Nullable ExrFetchCancel ncancel(long struct) { return ExrFetchCancel.createSafe(memGetAddress(struct + ExrDataSink.CANCEL)); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + ExrDataSink.FLAGS); }

    /** Unsafe version of {@link #userdata(long) userdata}. */
    public static void nuserdata(long struct, long value) { memPutAddress(struct + ExrDataSink.USERDATA, value); }
    /** Unsafe version of {@link #write(ExrWriteCallbackI) write}. */
    public static void nwrite(long struct, ExrWriteCallbackI value) { memPutAddress(struct + ExrDataSink.WRITE, value.address()); }
    /** Unsafe version of {@link #cancel(ExrFetchCancelI) cancel}. */
    public static void ncancel(long struct, @Nullable ExrFetchCancelI value) { memPutAddress(struct + ExrDataSink.CANCEL, memAddressSafe(value)); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + ExrDataSink.FLAGS, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + ExrDataSink.WRITE));
    }

    // -----------------------------------

    /** An array of {@link ExrDataSink} structs. */
    public static class Buffer extends StructBuffer<ExrDataSink, Buffer> implements NativeResource {

        private static final ExrDataSink ELEMENT_FACTORY = ExrDataSink.create(-1L);

        /**
         * Creates a new {@code ExrDataSink.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ExrDataSink#SIZEOF}, and its mark will be undefined.</p>
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
        protected ExrDataSink getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code userdata} field. */
        @NativeType("void *")
        public long userdata() { return ExrDataSink.nuserdata(address()); }
        /** @return the value of the {@code write} field. */
        public ExrWriteCallback write() { return ExrDataSink.nwrite(address()); }
        /** @return the value of the {@code cancel} field. */
        public @Nullable ExrFetchCancel cancel() { return ExrDataSink.ncancel(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("uint32_t")
        public int flags() { return ExrDataSink.nflags(address()); }

        /** Sets the specified value to the {@code userdata} field. */
        public ExrDataSink.Buffer userdata(@NativeType("void *") long value) { ExrDataSink.nuserdata(address(), value); return this; }
        /** Sets the specified value to the {@code write} field. */
        public ExrDataSink.Buffer write(@NativeType("ExrWriteCallback") ExrWriteCallbackI value) { ExrDataSink.nwrite(address(), value); return this; }
        /** Sets the specified value to the {@code cancel} field. */
        public ExrDataSink.Buffer cancel(@Nullable @NativeType("ExrFetchCancel") ExrFetchCancelI value) { ExrDataSink.ncancel(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public ExrDataSink.Buffer flags(@NativeType("uint32_t") int value) { ExrDataSink.nflags(address(), value); return this; }

    }

}