/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Client applications often need to associate their own data to a variety of FreeType core objects. For example, a text layout API might
 * want to associate a glyph cache to a given size object.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_Generic {
 *     void * data;
 *     {@link FT_Generic_FinalizerI FT_Generic_Finalizer} finalizer;
 * }</code></pre>
 */
public class FT_Generic extends Struct<FT_Generic> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DATA,
        FINALIZER;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DATA = layout.offsetof(0);
        FINALIZER = layout.offsetof(1);
    }

    protected FT_Generic(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_Generic create(long address, @Nullable ByteBuffer container) {
        return new FT_Generic(address, container);
    }

    /**
     * Creates a {@code FT_Generic} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_Generic(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code data} field. */
    @NativeType("void *")
    public long data() { return ndata(address()); }
    /** @return the value of the {@code finalizer} field. */
    public FT_Generic_Finalizer finalizer() { return nfinalizer(address()); }

    /** Sets the specified value to the {@code data} field. */
    public FT_Generic data(@NativeType("void *") long value) { ndata(address(), value); return this; }
    /** Sets the specified value to the {@code finalizer} field. */
    public FT_Generic finalizer(@NativeType("FT_Generic_Finalizer") FT_Generic_FinalizerI value) { nfinalizer(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FT_Generic set(
        long data,
        FT_Generic_FinalizerI finalizer
    ) {
        data(data);
        finalizer(finalizer);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FT_Generic set(FT_Generic src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FT_Generic} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FT_Generic malloc() {
        return new FT_Generic(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FT_Generic} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FT_Generic calloc() {
        return new FT_Generic(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FT_Generic} instance allocated with {@link BufferUtils}. */
    public static FT_Generic create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_Generic(memAddress(container), container);
    }

    /** Returns a new {@code FT_Generic} instance for the specified memory address. */
    public static FT_Generic create(long address) {
        return new FT_Generic(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Generic createSafe(long address) {
        return address == NULL ? null : new FT_Generic(address, null);
    }

    /**
     * Returns a new {@link FT_Generic.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Generic.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FT_Generic.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Generic.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_Generic.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Generic.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FT_Generic.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_Generic.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Generic.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FT_Generic} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_Generic malloc(MemoryStack stack) {
        return new FT_Generic(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FT_Generic} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_Generic calloc(MemoryStack stack) {
        return new FT_Generic(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FT_Generic.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_Generic.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_Generic.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_Generic.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #data}. */
    public static long ndata(long struct) { return memGetAddress(struct + FT_Generic.DATA); }
    /** Unsafe version of {@link #finalizer}. */
    public static FT_Generic_Finalizer nfinalizer(long struct) { return FT_Generic_Finalizer.create(memGetAddress(struct + FT_Generic.FINALIZER)); }

    /** Unsafe version of {@link #data(long) data}. */
    public static void ndata(long struct, long value) { memPutAddress(struct + FT_Generic.DATA, value); }
    /** Unsafe version of {@link #finalizer(FT_Generic_FinalizerI) finalizer}. */
    public static void nfinalizer(long struct, FT_Generic_FinalizerI value) { memPutAddress(struct + FT_Generic.FINALIZER, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + FT_Generic.FINALIZER));
    }

    // -----------------------------------

    /** An array of {@link FT_Generic} structs. */
    public static class Buffer extends StructBuffer<FT_Generic, Buffer> implements NativeResource {

        private static final FT_Generic ELEMENT_FACTORY = FT_Generic.create(-1L);

        /**
         * Creates a new {@code FT_Generic.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_Generic#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_Generic getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code data} field. */
        @NativeType("void *")
        public long data() { return FT_Generic.ndata(address()); }
        /** @return the value of the {@code finalizer} field. */
        public FT_Generic_Finalizer finalizer() { return FT_Generic.nfinalizer(address()); }

        /** Sets the specified value to the {@code data} field. */
        public FT_Generic.Buffer data(@NativeType("void *") long value) { FT_Generic.ndata(address(), value); return this; }
        /** Sets the specified value to the {@code finalizer} field. */
        public FT_Generic.Buffer finalizer(@NativeType("FT_Generic_Finalizer") FT_Generic_FinalizerI value) { FT_Generic.nfinalizer(address(), value); return this; }

    }

}