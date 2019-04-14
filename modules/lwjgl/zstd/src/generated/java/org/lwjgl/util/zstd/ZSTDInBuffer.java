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
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code src} &ndash; start of input buffer</li>
 * <li>{@code size} &ndash; size of input buffer</li>
 * <li>{@code pos} &ndash; position where reading stopped. Will be updated. Necessarily 0 &le; {@code pos} &le; {@code size}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ZSTD_inBuffer {
 *     void const * src;
 *     size_t size;
 *     size_t pos;
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

    /** Returns a {@link ByteBuffer} view of the data pointed to by the {@code src} field. */
    @NativeType("void const *")
    public ByteBuffer src() { return nsrc(address()); }
    /** Returns the value of the {@code size} field. */
    @NativeType("size_t")
    public long size() { return nsize(address()); }
    /** Returns the value of the {@code pos} field. */
    @NativeType("size_t")
    public long pos() { return npos(address()); }

    /** Sets the address of the specified {@link ByteBuffer} to the {@code src} field. */
    public ZSTDInBuffer src(@NativeType("void const *") ByteBuffer value) { nsrc(address(), value); return this; }
    /** Sets the specified value to the {@code pos} field. */
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

    /** Returns a new {@code ZSTDInBuffer} instance allocated on the thread-local {@link MemoryStack}. */
    public static ZSTDInBuffer mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code ZSTDInBuffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static ZSTDInBuffer callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code ZSTDInBuffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ZSTDInBuffer mallocStack(MemoryStack stack) {
        return wrap(ZSTDInBuffer.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code ZSTDInBuffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ZSTDInBuffer callocStack(MemoryStack stack) {
        return wrap(ZSTDInBuffer.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link ZSTDInBuffer.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static ZSTDInBuffer.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link ZSTDInBuffer.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static ZSTDInBuffer.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link ZSTDInBuffer.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ZSTDInBuffer.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ZSTDInBuffer.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ZSTDInBuffer.Buffer callocStack(int capacity, MemoryStack stack) {
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

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
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

        /** Returns a {@link ByteBuffer} view of the data pointed to by the {@code src} field. */
        @NativeType("void const *")
        public ByteBuffer src() { return ZSTDInBuffer.nsrc(address()); }
        /** Returns the value of the {@code size} field. */
        @NativeType("size_t")
        public long size() { return ZSTDInBuffer.nsize(address()); }
        /** Returns the value of the {@code pos} field. */
        @NativeType("size_t")
        public long pos() { return ZSTDInBuffer.npos(address()); }

        /** Sets the address of the specified {@link ByteBuffer} to the {@code src} field. */
        public ZSTDInBuffer.Buffer src(@NativeType("void const *") ByteBuffer value) { ZSTDInBuffer.nsrc(address(), value); return this; }
        /** Sets the specified value to the {@code pos} field. */
        public ZSTDInBuffer.Buffer pos(@NativeType("size_t") long value) { ZSTDInBuffer.npos(address(), value); return this; }

    }

}