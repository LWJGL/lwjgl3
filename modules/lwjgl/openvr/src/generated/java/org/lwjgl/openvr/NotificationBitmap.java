/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Used for passing graphic data.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct NotificationBitmap_t {
 *     void * m_pImageData;
 *     int32_t m_nWidth;
 *     int32_t m_nHeight;
 *     int32_t m_nBytesPerPixel;
 * }</code></pre>
 */
@NativeType("struct NotificationBitmap_t")
public class NotificationBitmap extends Struct<NotificationBitmap> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        M_PIMAGEDATA,
        M_NWIDTH,
        M_NHEIGHT,
        M_NBYTESPERPIXEL;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        M_PIMAGEDATA = layout.offsetof(0);
        M_NWIDTH = layout.offsetof(1);
        M_NHEIGHT = layout.offsetof(2);
        M_NBYTESPERPIXEL = layout.offsetof(3);
    }

    protected NotificationBitmap(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected NotificationBitmap create(long address, @Nullable ByteBuffer container) {
        return new NotificationBitmap(address, container);
    }

    /**
     * Creates a {@code NotificationBitmap} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NotificationBitmap(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /**
     * @return a {@link ByteBuffer} view of the data pointed to by the {@code m_pImageData} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("void *")
    public ByteBuffer m_pImageData(int capacity) { return nm_pImageData(address(), capacity); }
    /** @return the value of the {@code m_nWidth} field. */
    @NativeType("int32_t")
    public int m_nWidth() { return nm_nWidth(address()); }
    /** @return the value of the {@code m_nHeight} field. */
    @NativeType("int32_t")
    public int m_nHeight() { return nm_nHeight(address()); }
    /** @return the value of the {@code m_nBytesPerPixel} field. */
    @NativeType("int32_t")
    public int m_nBytesPerPixel() { return nm_nBytesPerPixel(address()); }

    /** Sets the address of the specified {@link ByteBuffer} to the {@code m_pImageData} field. */
    public NotificationBitmap m_pImageData(@NativeType("void *") ByteBuffer value) { nm_pImageData(address(), value); return this; }
    /** Sets the specified value to the {@code m_nWidth} field. */
    public NotificationBitmap m_nWidth(@NativeType("int32_t") int value) { nm_nWidth(address(), value); return this; }
    /** Sets the specified value to the {@code m_nHeight} field. */
    public NotificationBitmap m_nHeight(@NativeType("int32_t") int value) { nm_nHeight(address(), value); return this; }
    /** Sets the specified value to the {@code m_nBytesPerPixel} field. */
    public NotificationBitmap m_nBytesPerPixel(@NativeType("int32_t") int value) { nm_nBytesPerPixel(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public NotificationBitmap set(
        ByteBuffer m_pImageData,
        int m_nWidth,
        int m_nHeight,
        int m_nBytesPerPixel
    ) {
        m_pImageData(m_pImageData);
        m_nWidth(m_nWidth);
        m_nHeight(m_nHeight);
        m_nBytesPerPixel(m_nBytesPerPixel);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public NotificationBitmap set(NotificationBitmap src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code NotificationBitmap} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NotificationBitmap malloc() {
        return new NotificationBitmap(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code NotificationBitmap} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NotificationBitmap calloc() {
        return new NotificationBitmap(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code NotificationBitmap} instance allocated with {@link BufferUtils}. */
    public static NotificationBitmap create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new NotificationBitmap(memAddress(container), container);
    }

    /** Returns a new {@code NotificationBitmap} instance for the specified memory address. */
    public static NotificationBitmap create(long address) {
        return new NotificationBitmap(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable NotificationBitmap createSafe(long address) {
        return address == NULL ? null : new NotificationBitmap(address, null);
    }

    /**
     * Returns a new {@link NotificationBitmap.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NotificationBitmap.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link NotificationBitmap.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NotificationBitmap.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NotificationBitmap.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NotificationBitmap.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link NotificationBitmap.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NotificationBitmap.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static NotificationBitmap.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static NotificationBitmap mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static NotificationBitmap callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static NotificationBitmap mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static NotificationBitmap callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static NotificationBitmap.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static NotificationBitmap.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static NotificationBitmap.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static NotificationBitmap.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code NotificationBitmap} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NotificationBitmap malloc(MemoryStack stack) {
        return new NotificationBitmap(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code NotificationBitmap} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NotificationBitmap calloc(MemoryStack stack) {
        return new NotificationBitmap(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link NotificationBitmap.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NotificationBitmap.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NotificationBitmap.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NotificationBitmap.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m_pImageData(int) m_pImageData}. */
    public static ByteBuffer nm_pImageData(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + NotificationBitmap.M_PIMAGEDATA), capacity); }
    /** Unsafe version of {@link #m_nWidth}. */
    public static int nm_nWidth(long struct) { return memGetInt(struct + NotificationBitmap.M_NWIDTH); }
    /** Unsafe version of {@link #m_nHeight}. */
    public static int nm_nHeight(long struct) { return memGetInt(struct + NotificationBitmap.M_NHEIGHT); }
    /** Unsafe version of {@link #m_nBytesPerPixel}. */
    public static int nm_nBytesPerPixel(long struct) { return memGetInt(struct + NotificationBitmap.M_NBYTESPERPIXEL); }

    /** Unsafe version of {@link #m_pImageData(ByteBuffer) m_pImageData}. */
    public static void nm_pImageData(long struct, ByteBuffer value) { memPutAddress(struct + NotificationBitmap.M_PIMAGEDATA, memAddress(value)); }
    /** Unsafe version of {@link #m_nWidth(int) m_nWidth}. */
    public static void nm_nWidth(long struct, int value) { memPutInt(struct + NotificationBitmap.M_NWIDTH, value); }
    /** Unsafe version of {@link #m_nHeight(int) m_nHeight}. */
    public static void nm_nHeight(long struct, int value) { memPutInt(struct + NotificationBitmap.M_NHEIGHT, value); }
    /** Unsafe version of {@link #m_nBytesPerPixel(int) m_nBytesPerPixel}. */
    public static void nm_nBytesPerPixel(long struct, int value) { memPutInt(struct + NotificationBitmap.M_NBYTESPERPIXEL, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + NotificationBitmap.M_PIMAGEDATA));
    }

    // -----------------------------------

    /** An array of {@link NotificationBitmap} structs. */
    public static class Buffer extends StructBuffer<NotificationBitmap, Buffer> implements NativeResource {

        private static final NotificationBitmap ELEMENT_FACTORY = NotificationBitmap.create(-1L);

        /**
         * Creates a new {@code NotificationBitmap.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NotificationBitmap#SIZEOF}, and its mark will be undefined.</p>
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
        protected NotificationBitmap getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /**
         * @return a {@link ByteBuffer} view of the data pointed to by the {@code m_pImageData} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("void *")
        public ByteBuffer m_pImageData(int capacity) { return NotificationBitmap.nm_pImageData(address(), capacity); }
        /** @return the value of the {@code m_nWidth} field. */
        @NativeType("int32_t")
        public int m_nWidth() { return NotificationBitmap.nm_nWidth(address()); }
        /** @return the value of the {@code m_nHeight} field. */
        @NativeType("int32_t")
        public int m_nHeight() { return NotificationBitmap.nm_nHeight(address()); }
        /** @return the value of the {@code m_nBytesPerPixel} field. */
        @NativeType("int32_t")
        public int m_nBytesPerPixel() { return NotificationBitmap.nm_nBytesPerPixel(address()); }

        /** Sets the address of the specified {@link ByteBuffer} to the {@code m_pImageData} field. */
        public NotificationBitmap.Buffer m_pImageData(@NativeType("void *") ByteBuffer value) { NotificationBitmap.nm_pImageData(address(), value); return this; }
        /** Sets the specified value to the {@code m_nWidth} field. */
        public NotificationBitmap.Buffer m_nWidth(@NativeType("int32_t") int value) { NotificationBitmap.nm_nWidth(address(), value); return this; }
        /** Sets the specified value to the {@code m_nHeight} field. */
        public NotificationBitmap.Buffer m_nHeight(@NativeType("int32_t") int value) { NotificationBitmap.nm_nHeight(address(), value); return this; }
        /** Sets the specified value to the {@code m_nBytesPerPixel} field. */
        public NotificationBitmap.Buffer m_nBytesPerPixel(@NativeType("int32_t") int value) { NotificationBitmap.nm_nBytesPerPixel(address(), value); return this; }

    }

}