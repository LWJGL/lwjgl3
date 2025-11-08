/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.shaderc;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct spv_text_t {
 *     char const * str;
 *     size_t length;
 * }}</pre>
 */
@NativeType("struct spv_text_t")
public class SPVText extends Struct<SPVText> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STR,
        LENGTH;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STR = layout.offsetof(0);
        LENGTH = layout.offsetof(1);
    }

    protected SPVText(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SPVText create(long address, @Nullable ByteBuffer container) {
        return new SPVText(address, container);
    }

    /**
     * Creates a {@code SPVText} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SPVText(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code str} field. */
    @NativeType("char const *")
    public ByteBuffer str() { return nstr(address()); }
    /** @return the null-terminated string pointed to by the {@code str} field. */
    @NativeType("char const *")
    public String strString() { return nstrString(address()); }
    /** @return the value of the {@code length} field. */
    @NativeType("size_t")
    public long length() { return nlength(address()); }

    // -----------------------------------

    /** Returns a new {@code SPVText} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SPVText malloc() {
        return new SPVText(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SPVText} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SPVText calloc() {
        return new SPVText(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SPVText} instance allocated with {@link BufferUtils}. */
    public static SPVText create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SPVText(memAddress(container), container);
    }

    /** Returns a new {@code SPVText} instance for the specified memory address. */
    public static SPVText create(long address) {
        return new SPVText(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SPVText createSafe(long address) {
        return address == NULL ? null : new SPVText(address, null);
    }

    /**
     * Returns a new {@link SPVText.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SPVText.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SPVText.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SPVText.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SPVText.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SPVText.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SPVText.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SPVText.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SPVText.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SPVText} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SPVText malloc(MemoryStack stack) {
        return new SPVText(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SPVText} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SPVText calloc(MemoryStack stack) {
        return new SPVText(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SPVText.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SPVText.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SPVText.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SPVText.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #str}. */
    public static ByteBuffer nstr(long struct) { return memByteBufferNT1(memGetAddress(struct + SPVText.STR)); }
    /** Unsafe version of {@link #strString}. */
    public static String nstrString(long struct) { return memUTF8(memGetAddress(struct + SPVText.STR)); }
    /** Unsafe version of {@link #length}. */
    public static long nlength(long struct) { return memGetAddress(struct + SPVText.LENGTH); }

    // -----------------------------------

    /** An array of {@link SPVText} structs. */
    public static class Buffer extends StructBuffer<SPVText, Buffer> implements NativeResource {

        private static final SPVText ELEMENT_FACTORY = SPVText.create(-1L);

        /**
         * Creates a new {@code SPVText.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SPVText#SIZEOF}, and its mark will be undefined.</p>
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
        protected SPVText getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code str} field. */
        @NativeType("char const *")
        public ByteBuffer str() { return SPVText.nstr(address()); }
        /** @return the null-terminated string pointed to by the {@code str} field. */
        @NativeType("char const *")
        public String strString() { return SPVText.nstrString(address()); }
        /** @return the value of the {@code length} field. */
        @NativeType("size_t")
        public long length() { return SPVText.nlength(address()); }

    }

}