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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_SfntLangTag {
 *     FT_Byte * string;
 *     FT_UInt string_len;
 * }</code></pre>
 */
public class FT_SfntLangTag extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STRING,
        STRING_LEN;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STRING = layout.offsetof(0);
        STRING_LEN = layout.offsetof(1);
    }

    /**
     * Creates a {@code FT_SfntLangTag} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_SfntLangTag(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code string} field. */
    @NativeType("FT_Byte *")
    public ByteBuffer string() { return nstring(address()); }
    /** @return the value of the {@code string_len} field. */
    @NativeType("FT_UInt")
    public int string_len() { return nstring_len(address()); }

    // -----------------------------------

    /** Returns a new {@code FT_SfntLangTag} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FT_SfntLangTag malloc() {
        return wrap(FT_SfntLangTag.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code FT_SfntLangTag} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FT_SfntLangTag calloc() {
        return wrap(FT_SfntLangTag.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code FT_SfntLangTag} instance allocated with {@link BufferUtils}. */
    public static FT_SfntLangTag create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(FT_SfntLangTag.class, memAddress(container), container);
    }

    /** Returns a new {@code FT_SfntLangTag} instance for the specified memory address. */
    public static FT_SfntLangTag create(long address) {
        return wrap(FT_SfntLangTag.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_SfntLangTag createSafe(long address) {
        return address == NULL ? null : wrap(FT_SfntLangTag.class, address);
    }

    /**
     * Returns a new {@link FT_SfntLangTag.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_SfntLangTag.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FT_SfntLangTag.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_SfntLangTag.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_SfntLangTag.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FT_SfntLangTag.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link FT_SfntLangTag.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_SfntLangTag.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_SfntLangTag.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code FT_SfntLangTag} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_SfntLangTag malloc(MemoryStack stack) {
        return wrap(FT_SfntLangTag.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code FT_SfntLangTag} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_SfntLangTag calloc(MemoryStack stack) {
        return wrap(FT_SfntLangTag.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link FT_SfntLangTag.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_SfntLangTag.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_SfntLangTag.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_SfntLangTag.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #string() string}. */
    public static ByteBuffer nstring(long struct) { return memByteBuffer(memGetAddress(struct + FT_SfntLangTag.STRING), nstring_len(struct)); }
    /** Unsafe version of {@link #string_len}. */
    public static int nstring_len(long struct) { return UNSAFE.getInt(null, struct + FT_SfntLangTag.STRING_LEN); }

    // -----------------------------------

    /** An array of {@link FT_SfntLangTag} structs. */
    public static class Buffer extends StructBuffer<FT_SfntLangTag, Buffer> implements NativeResource {

        private static final FT_SfntLangTag ELEMENT_FACTORY = FT_SfntLangTag.create(-1L);

        /**
         * Creates a new {@code FT_SfntLangTag.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_SfntLangTag#SIZEOF}, and its mark will be undefined.
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
        protected FT_SfntLangTag getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code string} field. */
        @NativeType("FT_Byte *")
        public ByteBuffer string() { return FT_SfntLangTag.nstring(address()); }
        /** @return the value of the {@code string_len} field. */
        @NativeType("FT_UInt")
        public int string_len() { return FT_SfntLangTag.nstring_len(address()); }

    }

}