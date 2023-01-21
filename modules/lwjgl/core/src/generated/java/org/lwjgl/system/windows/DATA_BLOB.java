/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * The {@code DATA_BLOB} structure contains an arbitrary array of bytes.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct DATA_BLOB {
 *     DWORD {@link #cbData};
 *     BYTE * {@link #pbData};
 * }</code></pre>
 */
public class DATA_BLOB extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CBDATA,
        PBDATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CBDATA = layout.offsetof(0);
        PBDATA = layout.offsetof(1);
    }

    /**
     * Creates a {@code DATA_BLOB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public DATA_BLOB(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the count, in bytes, of data */
    @NativeType("DWORD")
    public int cbData() { return ncbData(address()); }
    /** a pointer to the data buffer */
    @NativeType("BYTE *")
    public ByteBuffer pbData() { return npbData(address()); }

    /** Sets the address of the specified {@link ByteBuffer} to the {@link #pbData} field. */
    public DATA_BLOB pbData(@NativeType("BYTE *") ByteBuffer value) { npbData(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public DATA_BLOB set(DATA_BLOB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code DATA_BLOB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static DATA_BLOB malloc() {
        return wrap(DATA_BLOB.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code DATA_BLOB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static DATA_BLOB calloc() {
        return wrap(DATA_BLOB.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code DATA_BLOB} instance allocated with {@link BufferUtils}. */
    public static DATA_BLOB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(DATA_BLOB.class, memAddress(container), container);
    }

    /** Returns a new {@code DATA_BLOB} instance for the specified memory address. */
    public static DATA_BLOB create(long address) {
        return wrap(DATA_BLOB.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static DATA_BLOB createSafe(long address) {
        return address == NULL ? null : wrap(DATA_BLOB.class, address);
    }

    /**
     * Returns a new {@link DATA_BLOB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static DATA_BLOB.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link DATA_BLOB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static DATA_BLOB.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link DATA_BLOB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static DATA_BLOB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link DATA_BLOB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static DATA_BLOB.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static DATA_BLOB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code DATA_BLOB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static DATA_BLOB malloc(MemoryStack stack) {
        return wrap(DATA_BLOB.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code DATA_BLOB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static DATA_BLOB calloc(MemoryStack stack) {
        return wrap(DATA_BLOB.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link DATA_BLOB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static DATA_BLOB.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link DATA_BLOB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static DATA_BLOB.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #cbData}. */
    public static int ncbData(long struct) { return UNSAFE.getInt(null, struct + DATA_BLOB.CBDATA); }
    /** Unsafe version of {@link #pbData() pbData}. */
    public static ByteBuffer npbData(long struct) { return memByteBuffer(memGetAddress(struct + DATA_BLOB.PBDATA), ncbData(struct)); }

    /** Sets the specified value to the {@code cbData} field of the specified {@code struct}. */
    public static void ncbData(long struct, int value) { UNSAFE.putInt(null, struct + DATA_BLOB.CBDATA, value); }
    /** Unsafe version of {@link #pbData(ByteBuffer) pbData}. */
    public static void npbData(long struct, ByteBuffer value) { memPutAddress(struct + DATA_BLOB.PBDATA, memAddress(value)); ncbData(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + DATA_BLOB.PBDATA));
    }

    // -----------------------------------

    /** An array of {@link DATA_BLOB} structs. */
    public static class Buffer extends StructBuffer<DATA_BLOB, Buffer> implements NativeResource {

        private static final DATA_BLOB ELEMENT_FACTORY = DATA_BLOB.create(-1L);

        /**
         * Creates a new {@code DATA_BLOB.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link DATA_BLOB#SIZEOF}, and its mark will be undefined.
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
        protected DATA_BLOB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link DATA_BLOB#cbData} field. */
        @NativeType("DWORD")
        public int cbData() { return DATA_BLOB.ncbData(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@link DATA_BLOB#pbData} field. */
        @NativeType("BYTE *")
        public ByteBuffer pbData() { return DATA_BLOB.npbData(address()); }

        /** Sets the address of the specified {@link ByteBuffer} to the {@link DATA_BLOB#pbData} field. */
        public DATA_BLOB.Buffer pbData(@NativeType("BYTE *") ByteBuffer value) { DATA_BLOB.npbData(address(), value); return this; }

    }

}