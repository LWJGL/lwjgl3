/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct cl_name_version {
 *     cl_version version;
 *     char name[64];
 * }}</pre>
 */
@NativeType("struct cl_name_version")
public class CLNameVersion extends Struct<CLNameVersion> implements NativeResource {

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

    protected CLNameVersion(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CLNameVersion create(long address, @Nullable ByteBuffer container) {
        return new CLNameVersion(address, container);
    }

    /**
     * Creates a {@code CLNameVersion} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CLNameVersion(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code version} field. */
    @NativeType("cl_version")
    public int version() { return nversion(address()); }
    /** @return a {@link ByteBuffer} view of the {@code name} field. */
    @NativeType("char[64]")
    public ByteBuffer name() { return nname(address()); }
    /** @return the null-terminated string stored in the {@code name} field. */
    @NativeType("char[64]")
    public String nameString() { return nnameString(address()); }

    // -----------------------------------

    /** Returns a new {@code CLNameVersion} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CLNameVersion malloc() {
        return new CLNameVersion(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CLNameVersion} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CLNameVersion calloc() {
        return new CLNameVersion(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CLNameVersion} instance allocated with {@link BufferUtils}. */
    public static CLNameVersion create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CLNameVersion(memAddress(container), container);
    }

    /** Returns a new {@code CLNameVersion} instance for the specified memory address. */
    public static CLNameVersion create(long address) {
        return new CLNameVersion(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable CLNameVersion createSafe(long address) {
        return address == NULL ? null : new CLNameVersion(address, null);
    }

    /**
     * Returns a new {@link CLNameVersion.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CLNameVersion.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CLNameVersion.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CLNameVersion.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CLNameVersion.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CLNameVersion.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CLNameVersion.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CLNameVersion.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static CLNameVersion.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code CLNameVersion} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CLNameVersion malloc(MemoryStack stack) {
        return new CLNameVersion(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CLNameVersion} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CLNameVersion calloc(MemoryStack stack) {
        return new CLNameVersion(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CLNameVersion.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CLNameVersion.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CLNameVersion.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CLNameVersion.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #version}. */
    public static int nversion(long struct) { return memGetInt(struct + CLNameVersion.VERSION); }
    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBuffer(struct + CLNameVersion.NAME, 64); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memASCII(struct + CLNameVersion.NAME); }

    // -----------------------------------

    /** An array of {@link CLNameVersion} structs. */
    public static class Buffer extends StructBuffer<CLNameVersion, Buffer> implements NativeResource {

        private static final CLNameVersion ELEMENT_FACTORY = CLNameVersion.create(-1L);

        /**
         * Creates a new {@code CLNameVersion.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CLNameVersion#SIZEOF}, and its mark will be undefined.</p>
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
        protected CLNameVersion getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code version} field. */
        @NativeType("cl_version")
        public int version() { return CLNameVersion.nversion(address()); }
        /** @return a {@link ByteBuffer} view of the {@code name} field. */
        @NativeType("char[64]")
        public ByteBuffer name() { return CLNameVersion.nname(address()); }
        /** @return the null-terminated string stored in the {@code name} field. */
        @NativeType("char[64]")
        public String nameString() { return CLNameVersion.nnameString(address()); }

    }

}