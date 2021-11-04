/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.zstd;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ZSTD_inBuffer {
 *     void const * {@link #src};
 *     size_t {@link #size};
 *     size_t {@link #pos};
 * }</code></pre>
 */
@NativeType("struct ZSTD_inBuffer")
public class ZSTDInBuffer extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SRC,
        SIZE,
        POS;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SRC = layout.offsetof(0);
        SIZE = layout.offsetof(1);
        POS = layout.offsetof(2);
    }

    /**
     * Creates a {@code ZSTDInBuffer} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ZSTDInBuffer(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** start of input buffer */
    @NativeType("void const *")
    public ByteBuffer src() { return nsrc(address()); }
    /** size of input buffer */
    @NativeType("size_t")
    public long size() { return nsize(address()); }
    /** position where reading stopped. Will be updated. Necessarily 0 &le; {@code pos} &le; {@code size} */
    @NativeType("size_t")
    public long pos() { return npos(address()); }

    /** Sets the address of the specified {@link ByteBuffer} to the {@link #src} field. */
    public ZSTDInBuffer src(@NativeType("void const *") ByteBuffer value) { nsrc(address(), value); return this; }
    /** Sets the specified value to the {@link #pos} field. */
    public ZSTDInBuffer pos(@NativeType("size_t") long value) { npos(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ZSTDInBuffer set(
        ByteBuffer src,
        long pos
    ) {
        src(src);
        pos(pos);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ZSTDInBuffer set(ZSTDInBuffer src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ZSTDInBuffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ZSTDInBuffer malloc() {
        return wrap(ZSTDInBuffer.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code ZSTDInBuffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ZSTDInBuffer calloc() {
        return wrap(ZSTDInBuffer.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code ZSTDInBuffer} instance allocated with {@link BufferUtils}. */
    public static ZSTDInBuffer create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(ZSTDInBuffer.class, memAddress(container), container);
    }

    /** Returns a new {@code ZSTDInBuffer} instance for the specified memory address. */
    public static ZSTDInBuffer create(long address) {
        return wrap(ZSTDInBuffer.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ZSTDInBuffer createSafe(long address) {
        return address == NULL ? null : wrap(ZSTDInBuffer.class, address);
    }

    /**
     * Returns a new {@link ZSTDInBuffer.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ZSTDInBuffer.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ZSTDInBuffer.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ZSTDInBuffer.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ZSTDInBuffer.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ZSTDInBuffer.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link ZSTDInBuffer.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ZSTDInBuffer.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ZSTDInBuffer.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static ZSTDInBuffer mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static ZSTDInBuffer callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static ZSTDInBuffer mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static ZSTDInBuffer callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static ZSTDInBuffer.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static ZSTDInBuffer.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static ZSTDInBuffer.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static ZSTDInBuffer.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code ZSTDInBuffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ZSTDInBuffer malloc(MemoryStack stack) {
        return wrap(ZSTDInBuffer.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code ZSTDInBuffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ZSTDInBuffer calloc(MemoryStack stack) {
        return wrap(ZSTDInBuffer.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link ZSTDInBuffer.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ZSTDInBuffer.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ZSTDInBuffer.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ZSTDInBuffer.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #src() src}. */
    public static ByteBuffer nsrc(long struct) { return memByteBuffer(memGetAddress(struct + ZSTDInBuffer.SRC), (int)nsize(struct)); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return memGetAddress(struct + ZSTDInBuffer.SIZE); }
    /** Unsafe version of {@link #pos}. */
    public static long npos(long struct) { return memGetAddress(struct + ZSTDInBuffer.POS); }

    /** Unsafe version of {@link #src(ByteBuffer) src}. */
    public static void nsrc(long struct, ByteBuffer value) { memPutAddress(struct + ZSTDInBuffer.SRC, memAddress(value)); nsize(struct, value.remaining()); }
    /** Sets the specified value to the {@code size} field of the specified {@code struct}. */
    public static void nsize(long struct, long value) { memPutAddress(struct + ZSTDInBuffer.SIZE, value); }
    /** Unsafe version of {@link #pos(long) pos}. */
    public static void npos(long struct, long value) { memPutAddress(struct + ZSTDInBuffer.POS, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + ZSTDInBuffer.SRC));
    }

    // -----------------------------------

    /** An array of {@link ZSTDInBuffer} structs. */
    public static class Buffer extends StructBuffer<ZSTDInBuffer, Buffer> implements NativeResource {

        private static final ZSTDInBuffer ELEMENT_FACTORY = ZSTDInBuffer.create(-1L);

        /**
         * Creates a new {@code ZSTDInBuffer.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ZSTDInBuffer#SIZEOF}, and its mark will be undefined.
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
        protected ZSTDInBuffer getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the data pointed to by the {@link ZSTDInBuffer#src} field. */
        @NativeType("void const *")
        public ByteBuffer src() { return ZSTDInBuffer.nsrc(address()); }
        /** @return the value of the {@link ZSTDInBuffer#size} field. */
        @NativeType("size_t")
        public long size() { return ZSTDInBuffer.nsize(address()); }
        /** @return the value of the {@link ZSTDInBuffer#pos} field. */
        @NativeType("size_t")
        public long pos() { return ZSTDInBuffer.npos(address()); }

        /** Sets the address of the specified {@link ByteBuffer} to the {@link ZSTDInBuffer#src} field. */
        public ZSTDInBuffer.Buffer src(@NativeType("void const *") ByteBuffer value) { ZSTDInBuffer.nsrc(address(), value); return this; }
        /** Sets the specified value to the {@link ZSTDInBuffer#pos} field. */
        public ZSTDInBuffer.Buffer pos(@NativeType("size_t") long value) { ZSTDInBuffer.npos(address(), value); return this; }

    }

}