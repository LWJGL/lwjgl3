/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.libdivide;

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
 * struct libdivide_s16_branchfree_t {
 *     int16_t magic;
 *     uint8_t more;
 * }</code></pre>
 */
@NativeType("struct libdivide_s16_branchfree_t")
public class LibDivideS16BranchFree extends Struct implements NativeResource {

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
        return wrap(LibDivideS16BranchFree.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code LibDivideS16BranchFree} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static LibDivideS16BranchFree calloc() {
        return wrap(LibDivideS16BranchFree.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code LibDivideS16BranchFree} instance allocated with {@link BufferUtils}. */
    public static LibDivideS16BranchFree create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(LibDivideS16BranchFree.class, memAddress(container), container);
    }

    /** Returns a new {@code LibDivideS16BranchFree} instance for the specified memory address. */
    public static LibDivideS16BranchFree create(long address) {
        return wrap(LibDivideS16BranchFree.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LibDivideS16BranchFree createSafe(long address) {
        return address == NULL ? null : wrap(LibDivideS16BranchFree.class, address);
    }

    /**
     * Returns a new {@link LibDivideS16BranchFree.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LibDivideS16BranchFree.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link LibDivideS16BranchFree.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LibDivideS16BranchFree.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LibDivideS16BranchFree.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static LibDivideS16BranchFree.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link LibDivideS16BranchFree.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static LibDivideS16BranchFree.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LibDivideS16BranchFree.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code LibDivideS16BranchFree} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static LibDivideS16BranchFree malloc(MemoryStack stack) {
        return wrap(LibDivideS16BranchFree.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code LibDivideS16BranchFree} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static LibDivideS16BranchFree calloc(MemoryStack stack) {
        return wrap(LibDivideS16BranchFree.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link LibDivideS16BranchFree.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LibDivideS16BranchFree.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LibDivideS16BranchFree.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LibDivideS16BranchFree.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #magic}. */
    public static short nmagic(long struct) { return UNSAFE.getShort(null, struct + LibDivideS16BranchFree.MAGIC); }
    /** Unsafe version of {@link #more}. */
    public static byte nmore(long struct) { return UNSAFE.getByte(null, struct + LibDivideS16BranchFree.MORE); }

    /** Unsafe version of {@link #magic(short) magic}. */
    public static void nmagic(long struct, short value) { UNSAFE.putShort(null, struct + LibDivideS16BranchFree.MAGIC, value); }
    /** Unsafe version of {@link #more(byte) more}. */
    public static void nmore(long struct, byte value) { UNSAFE.putByte(null, struct + LibDivideS16BranchFree.MORE, value); }

    // -----------------------------------

    /** An array of {@link LibDivideS16BranchFree} structs. */
    public static class Buffer extends StructBuffer<LibDivideS16BranchFree, Buffer> implements NativeResource {

        private static final LibDivideS16BranchFree ELEMENT_FACTORY = LibDivideS16BranchFree.create(-1L);

        /**
         * Creates a new {@code LibDivideS16BranchFree.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link LibDivideS16BranchFree#SIZEOF}, and its mark will be undefined.
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