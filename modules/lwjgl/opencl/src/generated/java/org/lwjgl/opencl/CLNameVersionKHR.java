/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Describes a combination of a name alongside a version number.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct cl_name_version_khr {
 *     cl_version_khr version;
 *     char name[64];
 * }</code></pre>
 */
@NativeType("struct cl_name_version_khr")
public class CLNameVersionKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VERSION,
        NAME;

    static {
        Layout layout = __struct(
            __member(4),
            __array(1, 64)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        VERSION = layout.offsetof(0);
        NAME = layout.offsetof(1);
    }

    /**
     * Creates a {@code CLNameVersionKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CLNameVersionKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code version} field. */
    @NativeType("cl_version_khr")
    public int version() { return nversion(address()); }
    /** @return a {@link ByteBuffer} view of the {@code name} field. */
    @NativeType("char[64]")
    public ByteBuffer name() { return nname(address()); }
    /** @return the null-terminated string stored in the {@code name} field. */
    @NativeType("char[64]")
    public String nameString() { return nnameString(address()); }

    // -----------------------------------

    /** Returns a new {@code CLNameVersionKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CLNameVersionKHR malloc() {
        return wrap(CLNameVersionKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code CLNameVersionKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CLNameVersionKHR calloc() {
        return wrap(CLNameVersionKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code CLNameVersionKHR} instance allocated with {@link BufferUtils}. */
    public static CLNameVersionKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CLNameVersionKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code CLNameVersionKHR} instance for the specified memory address. */
    public static CLNameVersionKHR create(long address) {
        return wrap(CLNameVersionKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CLNameVersionKHR createSafe(long address) {
        return address == NULL ? null : wrap(CLNameVersionKHR.class, address);
    }

    /**
     * Returns a new {@link CLNameVersionKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CLNameVersionKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CLNameVersionKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CLNameVersionKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CLNameVersionKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CLNameVersionKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CLNameVersionKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CLNameVersionKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CLNameVersionKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code CLNameVersionKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CLNameVersionKHR malloc(MemoryStack stack) {
        return wrap(CLNameVersionKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code CLNameVersionKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CLNameVersionKHR calloc(MemoryStack stack) {
        return wrap(CLNameVersionKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CLNameVersionKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CLNameVersionKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CLNameVersionKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CLNameVersionKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #version}. */
    public static int nversion(long struct) { return UNSAFE.getInt(null, struct + CLNameVersionKHR.VERSION); }
    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBuffer(struct + CLNameVersionKHR.NAME, 64); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memASCII(struct + CLNameVersionKHR.NAME); }

    // -----------------------------------

    /** An array of {@link CLNameVersionKHR} structs. */
    public static class Buffer extends StructBuffer<CLNameVersionKHR, Buffer> implements NativeResource {

        private static final CLNameVersionKHR ELEMENT_FACTORY = CLNameVersionKHR.create(-1L);

        /**
         * Creates a new {@code CLNameVersionKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CLNameVersionKHR#SIZEOF}, and its mark will be undefined.
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
        protected CLNameVersionKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code version} field. */
        @NativeType("cl_version_khr")
        public int version() { return CLNameVersionKHR.nversion(address()); }
        /** @return a {@link ByteBuffer} view of the {@code name} field. */
        @NativeType("char[64]")
        public ByteBuffer name() { return CLNameVersionKHR.nname(address()); }
        /** @return the null-terminated string stored in the {@code name} field. */
        @NativeType("char[64]")
        public String nameString() { return CLNameVersionKHR.nnameString(address()); }

    }

}