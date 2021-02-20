/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.libffi;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * The libffi closure structure.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code cif} &ndash; a pointer to an {@code ffi_cif} structure</li>
 * <li>{@code fun} &ndash; a pointer to a function</li>
 * <li>{@code user_data} &ndash; a pointer to user-specified data</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ffi_closure {
 *     {@link FFICIF ffi_cif} * cif;
 *     void (*)(ffi_cif*,void*,void**,void*) fun;
 *     void * user_data;
 * }</code></pre>
 */
@NativeType("struct ffi_closure")
public class FFIClosure extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CIF,
        FUN,
        USER_DATA;

    static {
        try (MemoryStack stack = stackPush()) {
            IntBuffer offsets = stack.mallocInt(4);
            SIZEOF = offsets(memAddress(offsets));

            CIF = offsets.get(0);
            FUN = offsets.get(1);
            USER_DATA = offsets.get(2);

            ALIGNOF = offsets.get(3);
        }
    }

    private static native int offsets(long buffer);

    /**
     * Creates a {@code FFIClosure} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FFIClosure(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link FFICIF} view of the struct pointed to by the {@code cif} field. */
    @NativeType("ffi_cif *")
    public FFICIF cif() { return ncif(address()); }
    /** Returns the value of the {@code fun} field. */
    @NativeType("void (*)(ffi_cif*,void*,void**,void*)")
    public long fun() { return nfun(address()); }
    /** Returns the value of the {@code user_data} field. */
    @NativeType("void *")
    public long user_data() { return nuser_data(address()); }

    // -----------------------------------

    /** Returns a new {@code FFIClosure} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FFIClosure malloc() {
        return wrap(FFIClosure.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code FFIClosure} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FFIClosure calloc() {
        return wrap(FFIClosure.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code FFIClosure} instance allocated with {@link BufferUtils}. */
    public static FFIClosure create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(FFIClosure.class, memAddress(container), container);
    }

    /** Returns a new {@code FFIClosure} instance for the specified memory address. */
    public static FFIClosure create(long address) {
        return wrap(FFIClosure.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FFIClosure createSafe(long address) {
        return address == NULL ? null : wrap(FFIClosure.class, address);
    }

    /**
     * Returns a new {@link FFIClosure.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FFIClosure.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FFIClosure.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FFIClosure.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FFIClosure.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FFIClosure.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link FFIClosure.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FFIClosure.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FFIClosure.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code FFIClosure} instance allocated on the thread-local {@link MemoryStack}. */
    public static FFIClosure mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code FFIClosure} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static FFIClosure callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code FFIClosure} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FFIClosure mallocStack(MemoryStack stack) {
        return wrap(FFIClosure.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code FFIClosure} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FFIClosure callocStack(MemoryStack stack) {
        return wrap(FFIClosure.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link FFIClosure.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static FFIClosure.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link FFIClosure.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static FFIClosure.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link FFIClosure.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FFIClosure.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FFIClosure.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FFIClosure.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #cif}. */
    public static FFICIF ncif(long struct) { return FFICIF.create(memGetAddress(struct + FFIClosure.CIF)); }
    /** Unsafe version of {@link #fun}. */
    public static long nfun(long struct) { return memGetAddress(struct + FFIClosure.FUN); }
    /** Unsafe version of {@link #user_data}. */
    public static long nuser_data(long struct) { return memGetAddress(struct + FFIClosure.USER_DATA); }

    // -----------------------------------

    /** An array of {@link FFIClosure} structs. */
    public static class Buffer extends StructBuffer<FFIClosure, Buffer> implements NativeResource {

        private static final FFIClosure ELEMENT_FACTORY = FFIClosure.create(-1L);

        /**
         * Creates a new {@code FFIClosure.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FFIClosure#SIZEOF}, and its mark will be undefined.
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
        protected FFIClosure getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link FFICIF} view of the struct pointed to by the {@code cif} field. */
        @NativeType("ffi_cif *")
        public FFICIF cif() { return FFIClosure.ncif(address()); }
        /** Returns the value of the {@code fun} field. */
        @NativeType("void (*)(ffi_cif*,void*,void**,void*)")
        public long fun() { return FFIClosure.nfun(address()); }
        /** Returns the value of the {@code user_data} field. */
        @NativeType("void *")
        public long user_data() { return FFIClosure.nuser_data(address()); }

    }

}