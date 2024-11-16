/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.libdivide;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct libdivide_s16_branchfree_t {
 *     int16_t magic;
 *     uint8_t more;
 * }</code></pre>
 */
@NativeType("struct libdivide_s16_branchfree_t")
public class LibDivideS16BranchFree extends Struct<LibDivideS16BranchFree> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MAGIC,
        MORE;

    static {
        Layout layout = __struct(
            __member(2),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MAGIC = layout.offsetof(0);
        MORE = layout.offsetof(1);
    }

    protected LibDivideS16BranchFree(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected LibDivideS16BranchFree create(long address, @Nullable ByteBuffer container) {
        return new LibDivideS16BranchFree(address, container);
    }

    /**
     * Creates a {@code LibDivideS16BranchFree} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public LibDivideS16BranchFree(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code magic} field. */
    @NativeType("int16_t")
    public short magic() { return nmagic(address()); }
    /** @return the value of the {@code more} field. */
    @NativeType("uint8_t")
    public byte more() { return nmore(address()); }

    /** Sets the specified value to the {@code magic} field. */
    public LibDivideS16BranchFree magic(@NativeType("int16_t") short value) { nmagic(address(), value); return this; }
    /** Sets the specified value to the {@code more} field. */
    public LibDivideS16BranchFree more(@NativeType("uint8_t") byte value) { nmore(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public LibDivideS16BranchFree set(
        short magic,
        byte more
    ) {
        magic(magic);
        more(more);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public LibDivideS16BranchFree set(LibDivideS16BranchFree src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code LibDivideS16BranchFree} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static LibDivideS16BranchFree malloc() {
        return new LibDivideS16BranchFree(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code LibDivideS16BranchFree} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static LibDivideS16BranchFree calloc() {
        return new LibDivideS16BranchFree(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code LibDivideS16BranchFree} instance allocated with {@link BufferUtils}. */
    public static LibDivideS16BranchFree create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new LibDivideS16BranchFree(memAddress(container), container);
    }

    /** Returns a new {@code LibDivideS16BranchFree} instance for the specified memory address. */
    public static LibDivideS16BranchFree create(long address) {
        return new LibDivideS16BranchFree(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable LibDivideS16BranchFree createSafe(long address) {
        return address == NULL ? null : new LibDivideS16BranchFree(address, null);
    }

    /**
     * Returns a new {@link LibDivideS16BranchFree.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LibDivideS16BranchFree.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link LibDivideS16BranchFree.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LibDivideS16BranchFree.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LibDivideS16BranchFree.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static LibDivideS16BranchFree.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link LibDivideS16BranchFree.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static LibDivideS16BranchFree.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static LibDivideS16BranchFree.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code LibDivideS16BranchFree} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static LibDivideS16BranchFree malloc(MemoryStack stack) {
        return new LibDivideS16BranchFree(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code LibDivideS16BranchFree} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static LibDivideS16BranchFree calloc(MemoryStack stack) {
        return new LibDivideS16BranchFree(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link LibDivideS16BranchFree.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LibDivideS16BranchFree.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LibDivideS16BranchFree.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LibDivideS16BranchFree.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #magic}. */
    public static short nmagic(long struct) { return memGetShort(struct + LibDivideS16BranchFree.MAGIC); }
    /** Unsafe version of {@link #more}. */
    public static byte nmore(long struct) { return memGetByte(struct + LibDivideS16BranchFree.MORE); }

    /** Unsafe version of {@link #magic(short) magic}. */
    public static void nmagic(long struct, short value) { memPutShort(struct + LibDivideS16BranchFree.MAGIC, value); }
    /** Unsafe version of {@link #more(byte) more}. */
    public static void nmore(long struct, byte value) { memPutByte(struct + LibDivideS16BranchFree.MORE, value); }

    // -----------------------------------

    /** An array of {@link LibDivideS16BranchFree} structs. */
    public static class Buffer extends StructBuffer<LibDivideS16BranchFree, Buffer> implements NativeResource {

        private static final LibDivideS16BranchFree ELEMENT_FACTORY = LibDivideS16BranchFree.create(-1L);

        /**
         * Creates a new {@code LibDivideS16BranchFree.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link LibDivideS16BranchFree#SIZEOF}, and its mark will be undefined.</p>
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
        protected LibDivideS16BranchFree getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code magic} field. */
        @NativeType("int16_t")
        public short magic() { return LibDivideS16BranchFree.nmagic(address()); }
        /** @return the value of the {@code more} field. */
        @NativeType("uint8_t")
        public byte more() { return LibDivideS16BranchFree.nmore(address()); }

        /** Sets the specified value to the {@code magic} field. */
        public LibDivideS16BranchFree.Buffer magic(@NativeType("int16_t") short value) { LibDivideS16BranchFree.nmagic(address(), value); return this; }
        /** Sets the specified value to the {@code more} field. */
        public LibDivideS16BranchFree.Buffer more(@NativeType("uint8_t") byte value) { LibDivideS16BranchFree.nmore(address(), value); return this; }

    }

}