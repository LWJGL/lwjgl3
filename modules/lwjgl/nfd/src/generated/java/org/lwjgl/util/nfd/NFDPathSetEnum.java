/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.nfd;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/** Opaque data structure -- see {@code NFD_PathSet_*}. */
@NativeType("struct nfdpathsetenum_t")
public class NFDPathSetEnum extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    static {
        LibNFD.initialize();

        try (MemoryStack stack = stackPush()) {
            IntBuffer offsets = stack.mallocInt(1);
            SIZEOF = offsets(memAddress(offsets));
            ALIGNOF = offsets.get(0);
        }
    }

    private static native int offsets(long buffer);

    /**
     * Creates a {@code NFDPathSetEnum} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NFDPathSetEnum(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    // -----------------------------------

    /** Returns a new {@code NFDPathSetEnum} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NFDPathSetEnum malloc() {
        return wrap(NFDPathSetEnum.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code NFDPathSetEnum} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NFDPathSetEnum calloc() {
        return wrap(NFDPathSetEnum.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code NFDPathSetEnum} instance allocated with {@link BufferUtils}. */
    public static NFDPathSetEnum create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(NFDPathSetEnum.class, memAddress(container), container);
    }

    /** Returns a new {@code NFDPathSetEnum} instance for the specified memory address. */
    public static NFDPathSetEnum create(long address) {
        return wrap(NFDPathSetEnum.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NFDPathSetEnum createSafe(long address) {
        return address == NULL ? null : wrap(NFDPathSetEnum.class, address);
    }

    /**
     * Returns a new {@link NFDPathSetEnum.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NFDPathSetEnum.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link NFDPathSetEnum.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NFDPathSetEnum.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NFDPathSetEnum.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NFDPathSetEnum.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link NFDPathSetEnum.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NFDPathSetEnum.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NFDPathSetEnum.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code NFDPathSetEnum} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NFDPathSetEnum malloc(MemoryStack stack) {
        return wrap(NFDPathSetEnum.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code NFDPathSetEnum} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NFDPathSetEnum calloc(MemoryStack stack) {
        return wrap(NFDPathSetEnum.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link NFDPathSetEnum.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NFDPathSetEnum.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NFDPathSetEnum.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NFDPathSetEnum.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    // -----------------------------------

    /** An array of {@link NFDPathSetEnum} structs. */
    public static class Buffer extends StructBuffer<NFDPathSetEnum, Buffer> implements NativeResource {

        private static final NFDPathSetEnum ELEMENT_FACTORY = NFDPathSetEnum.create(-1L);

        /**
         * Creates a new {@code NFDPathSetEnum.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NFDPathSetEnum#SIZEOF}, and its mark will be undefined.
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
        protected NFDPathSetEnum getElementFactory() {
            return ELEMENT_FACTORY;
        }

    }

}