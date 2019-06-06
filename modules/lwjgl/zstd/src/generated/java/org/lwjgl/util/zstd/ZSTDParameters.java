/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.zstd;

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
 * struct ZSTD_parameters {
 *     {@link ZSTDCompressionParameters ZSTD_compressionParameters} cParams;
 *     {@link ZSTDFrameParameters ZSTD_frameParameters} fParams;
 * }</code></pre>
 */
@NativeType("struct ZSTD_parameters")
public class ZSTDParameters extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CPARAMS,
        FPARAMS;

    static {
        Layout layout = __struct(
            __member(ZSTDCompressionParameters.SIZEOF, ZSTDCompressionParameters.ALIGNOF),
            __member(ZSTDFrameParameters.SIZEOF, ZSTDFrameParameters.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CPARAMS = layout.offsetof(0);
        FPARAMS = layout.offsetof(1);
    }

    /**
     * Creates a {@code ZSTDParameters} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ZSTDParameters(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link ZSTDCompressionParameters} view of the {@code cParams} field. */
    @NativeType("ZSTD_compressionParameters")
    public ZSTDCompressionParameters cParams() { return ncParams(address()); }
    /** Returns a {@link ZSTDFrameParameters} view of the {@code fParams} field. */
    @NativeType("ZSTD_frameParameters")
    public ZSTDFrameParameters fParams() { return nfParams(address()); }

    /** Copies the specified {@link ZSTDCompressionParameters} to the {@code cParams} field. */
    public ZSTDParameters cParams(@NativeType("ZSTD_compressionParameters") ZSTDCompressionParameters value) { ncParams(address(), value); return this; }
    /** Passes the {@code cParams} field to the specified {@link java.util.function.Consumer Consumer}. */
    public ZSTDParameters cParams(java.util.function.Consumer<ZSTDCompressionParameters> consumer) { consumer.accept(cParams()); return this; }
    /** Copies the specified {@link ZSTDFrameParameters} to the {@code fParams} field. */
    public ZSTDParameters fParams(@NativeType("ZSTD_frameParameters") ZSTDFrameParameters value) { nfParams(address(), value); return this; }
    /** Passes the {@code fParams} field to the specified {@link java.util.function.Consumer Consumer}. */
    public ZSTDParameters fParams(java.util.function.Consumer<ZSTDFrameParameters> consumer) { consumer.accept(fParams()); return this; }

    /** Initializes this struct with the specified values. */
    public ZSTDParameters set(
        ZSTDCompressionParameters cParams,
        ZSTDFrameParameters fParams
    ) {
        cParams(cParams);
        fParams(fParams);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ZSTDParameters set(ZSTDParameters src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ZSTDParameters} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ZSTDParameters malloc() {
        return wrap(ZSTDParameters.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code ZSTDParameters} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ZSTDParameters calloc() {
        return wrap(ZSTDParameters.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code ZSTDParameters} instance allocated with {@link BufferUtils}. */
    public static ZSTDParameters create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(ZSTDParameters.class, memAddress(container), container);
    }

    /** Returns a new {@code ZSTDParameters} instance for the specified memory address. */
    public static ZSTDParameters create(long address) {
        return wrap(ZSTDParameters.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ZSTDParameters createSafe(long address) {
        return address == NULL ? null : wrap(ZSTDParameters.class, address);
    }

    /**
     * Returns a new {@link ZSTDParameters.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ZSTDParameters.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ZSTDParameters.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ZSTDParameters.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ZSTDParameters.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ZSTDParameters.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link ZSTDParameters.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ZSTDParameters.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ZSTDParameters.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code ZSTDParameters} instance allocated on the thread-local {@link MemoryStack}. */
    public static ZSTDParameters mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code ZSTDParameters} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static ZSTDParameters callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code ZSTDParameters} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ZSTDParameters mallocStack(MemoryStack stack) {
        return wrap(ZSTDParameters.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code ZSTDParameters} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ZSTDParameters callocStack(MemoryStack stack) {
        return wrap(ZSTDParameters.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link ZSTDParameters.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static ZSTDParameters.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link ZSTDParameters.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static ZSTDParameters.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link ZSTDParameters.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ZSTDParameters.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ZSTDParameters.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ZSTDParameters.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #cParams}. */
    public static ZSTDCompressionParameters ncParams(long struct) { return ZSTDCompressionParameters.create(struct + ZSTDParameters.CPARAMS); }
    /** Unsafe version of {@link #fParams}. */
    public static ZSTDFrameParameters nfParams(long struct) { return ZSTDFrameParameters.create(struct + ZSTDParameters.FPARAMS); }

    /** Unsafe version of {@link #cParams(ZSTDCompressionParameters) cParams}. */
    public static void ncParams(long struct, ZSTDCompressionParameters value) { memCopy(value.address(), struct + ZSTDParameters.CPARAMS, ZSTDCompressionParameters.SIZEOF); }
    /** Unsafe version of {@link #fParams(ZSTDFrameParameters) fParams}. */
    public static void nfParams(long struct, ZSTDFrameParameters value) { memCopy(value.address(), struct + ZSTDParameters.FPARAMS, ZSTDFrameParameters.SIZEOF); }

    // -----------------------------------

    /** An array of {@link ZSTDParameters} structs. */
    public static class Buffer extends StructBuffer<ZSTDParameters, Buffer> implements NativeResource {

        private static final ZSTDParameters ELEMENT_FACTORY = ZSTDParameters.create(-1L);

        /**
         * Creates a new {@code ZSTDParameters.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ZSTDParameters#SIZEOF}, and its mark will be undefined.
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
        protected ZSTDParameters getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link ZSTDCompressionParameters} view of the {@code cParams} field. */
        @NativeType("ZSTD_compressionParameters")
        public ZSTDCompressionParameters cParams() { return ZSTDParameters.ncParams(address()); }
        /** Returns a {@link ZSTDFrameParameters} view of the {@code fParams} field. */
        @NativeType("ZSTD_frameParameters")
        public ZSTDFrameParameters fParams() { return ZSTDParameters.nfParams(address()); }

        /** Copies the specified {@link ZSTDCompressionParameters} to the {@code cParams} field. */
        public ZSTDParameters.Buffer cParams(@NativeType("ZSTD_compressionParameters") ZSTDCompressionParameters value) { ZSTDParameters.ncParams(address(), value); return this; }
        /** Passes the {@code cParams} field to the specified {@link java.util.function.Consumer Consumer}. */
        public ZSTDParameters.Buffer cParams(java.util.function.Consumer<ZSTDCompressionParameters> consumer) { consumer.accept(cParams()); return this; }
        /** Copies the specified {@link ZSTDFrameParameters} to the {@code fParams} field. */
        public ZSTDParameters.Buffer fParams(@NativeType("ZSTD_frameParameters") ZSTDFrameParameters value) { ZSTDParameters.nfParams(address(), value); return this; }
        /** Passes the {@code fParams} field to the specified {@link java.util.function.Consumer Consumer}. */
        public ZSTDParameters.Buffer fParams(java.util.function.Consumer<ZSTDFrameParameters> consumer) { consumer.accept(fParams()); return this; }

    }

}