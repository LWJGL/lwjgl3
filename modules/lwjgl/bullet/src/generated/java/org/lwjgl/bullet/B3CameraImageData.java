/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

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
 * struct b3CameraImageData {
 *     int m_pixelWidth;
 *     int m_pixelHeight;
 *     unsigned char const * m_rgbColorData;
 *     float const * m_depthValues;
 *     int const * m_segmentationMaskValues;
 * }</code></pre>
 */
@NativeType("struct b3CameraImageData")
public class B3CameraImageData extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        M_PIXELWIDTH,
        M_PIXELHEIGHT,
        M_RGBCOLORDATA,
        M_DEPTHVALUES,
        M_SEGMENTATIONMASKVALUES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        M_PIXELWIDTH = layout.offsetof(0);
        M_PIXELHEIGHT = layout.offsetof(1);
        M_RGBCOLORDATA = layout.offsetof(2);
        M_DEPTHVALUES = layout.offsetof(3);
        M_SEGMENTATIONMASKVALUES = layout.offsetof(4);
    }

    /**
     * Creates a {@code B3CameraImageData} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public B3CameraImageData(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code m_pixelWidth} field. */
    public int m_pixelWidth() { return nm_pixelWidth(address()); }
    /** Returns the value of the {@code m_pixelHeight} field. */
    public int m_pixelHeight() { return nm_pixelHeight(address()); }
    /**
     * Returns a {@link ByteBuffer} view of the data pointed to by the {@code m_rgbColorData} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("unsigned char const *")
    public ByteBuffer m_rgbColorData(int capacity) { return nm_rgbColorData(address(), capacity); }
    /**
     * Returns a {@link FloatBuffer} view of the data pointed to by the {@code m_depthValues} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("float const *")
    public FloatBuffer m_depthValues(int capacity) { return nm_depthValues(address(), capacity); }
    /**
     * Returns a {@link IntBuffer} view of the data pointed to by the {@code m_segmentationMaskValues} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("int const *")
    public IntBuffer m_segmentationMaskValues(int capacity) { return nm_segmentationMaskValues(address(), capacity); }

    /** Sets the specified value to the {@code m_pixelWidth} field. */
    public B3CameraImageData m_pixelWidth(int value) { nm_pixelWidth(address(), value); return this; }
    /** Sets the specified value to the {@code m_pixelHeight} field. */
    public B3CameraImageData m_pixelHeight(int value) { nm_pixelHeight(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code m_rgbColorData} field. */
    public B3CameraImageData m_rgbColorData(@NativeType("unsigned char const *") ByteBuffer value) { nm_rgbColorData(address(), value); return this; }
    /** Sets the address of the specified {@link FloatBuffer} to the {@code m_depthValues} field. */
    public B3CameraImageData m_depthValues(@NativeType("float const *") FloatBuffer value) { nm_depthValues(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code m_segmentationMaskValues} field. */
    public B3CameraImageData m_segmentationMaskValues(@NativeType("int const *") IntBuffer value) { nm_segmentationMaskValues(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public B3CameraImageData set(
        int m_pixelWidth,
        int m_pixelHeight,
        ByteBuffer m_rgbColorData,
        FloatBuffer m_depthValues,
        IntBuffer m_segmentationMaskValues
    ) {
        m_pixelWidth(m_pixelWidth);
        m_pixelHeight(m_pixelHeight);
        m_rgbColorData(m_rgbColorData);
        m_depthValues(m_depthValues);
        m_segmentationMaskValues(m_segmentationMaskValues);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public B3CameraImageData set(B3CameraImageData src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code B3CameraImageData} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static B3CameraImageData malloc() {
        return wrap(B3CameraImageData.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code B3CameraImageData} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static B3CameraImageData calloc() {
        return wrap(B3CameraImageData.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code B3CameraImageData} instance allocated with {@link BufferUtils}. */
    public static B3CameraImageData create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(B3CameraImageData.class, memAddress(container), container);
    }

    /** Returns a new {@code B3CameraImageData} instance for the specified memory address. */
    public static B3CameraImageData create(long address) {
        return wrap(B3CameraImageData.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3CameraImageData createSafe(long address) {
        return address == NULL ? null : wrap(B3CameraImageData.class, address);
    }

    /**
     * Returns a new {@link B3CameraImageData.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3CameraImageData.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link B3CameraImageData.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3CameraImageData.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3CameraImageData.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static B3CameraImageData.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link B3CameraImageData.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static B3CameraImageData.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3CameraImageData.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code B3CameraImageData} instance allocated on the thread-local {@link MemoryStack}. */
    public static B3CameraImageData mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code B3CameraImageData} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static B3CameraImageData callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code B3CameraImageData} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static B3CameraImageData mallocStack(MemoryStack stack) {
        return wrap(B3CameraImageData.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code B3CameraImageData} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static B3CameraImageData callocStack(MemoryStack stack) {
        return wrap(B3CameraImageData.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link B3CameraImageData.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static B3CameraImageData.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3CameraImageData.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static B3CameraImageData.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3CameraImageData.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3CameraImageData.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3CameraImageData.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3CameraImageData.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m_pixelWidth}. */
    public static int nm_pixelWidth(long struct) { return UNSAFE.getInt(null, struct + B3CameraImageData.M_PIXELWIDTH); }
    /** Unsafe version of {@link #m_pixelHeight}. */
    public static int nm_pixelHeight(long struct) { return UNSAFE.getInt(null, struct + B3CameraImageData.M_PIXELHEIGHT); }
    /** Unsafe version of {@link #m_rgbColorData(int) m_rgbColorData}. */
    public static ByteBuffer nm_rgbColorData(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + B3CameraImageData.M_RGBCOLORDATA), capacity); }
    /** Unsafe version of {@link #m_depthValues(int) m_depthValues}. */
    public static FloatBuffer nm_depthValues(long struct, int capacity) { return memFloatBuffer(memGetAddress(struct + B3CameraImageData.M_DEPTHVALUES), capacity); }
    /** Unsafe version of {@link #m_segmentationMaskValues(int) m_segmentationMaskValues}. */
    public static IntBuffer nm_segmentationMaskValues(long struct, int capacity) { return memIntBuffer(memGetAddress(struct + B3CameraImageData.M_SEGMENTATIONMASKVALUES), capacity); }

    /** Unsafe version of {@link #m_pixelWidth(int) m_pixelWidth}. */
    public static void nm_pixelWidth(long struct, int value) { UNSAFE.putInt(null, struct + B3CameraImageData.M_PIXELWIDTH, value); }
    /** Unsafe version of {@link #m_pixelHeight(int) m_pixelHeight}. */
    public static void nm_pixelHeight(long struct, int value) { UNSAFE.putInt(null, struct + B3CameraImageData.M_PIXELHEIGHT, value); }
    /** Unsafe version of {@link #m_rgbColorData(ByteBuffer) m_rgbColorData}. */
    public static void nm_rgbColorData(long struct, ByteBuffer value) { memPutAddress(struct + B3CameraImageData.M_RGBCOLORDATA, memAddress(value)); }
    /** Unsafe version of {@link #m_depthValues(FloatBuffer) m_depthValues}. */
    public static void nm_depthValues(long struct, FloatBuffer value) { memPutAddress(struct + B3CameraImageData.M_DEPTHVALUES, memAddress(value)); }
    /** Unsafe version of {@link #m_segmentationMaskValues(IntBuffer) m_segmentationMaskValues}. */
    public static void nm_segmentationMaskValues(long struct, IntBuffer value) { memPutAddress(struct + B3CameraImageData.M_SEGMENTATIONMASKVALUES, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + B3CameraImageData.M_RGBCOLORDATA));
        check(memGetAddress(struct + B3CameraImageData.M_DEPTHVALUES));
        check(memGetAddress(struct + B3CameraImageData.M_SEGMENTATIONMASKVALUES));
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

    /** An array of {@link B3CameraImageData} structs. */
    public static class Buffer extends StructBuffer<B3CameraImageData, Buffer> implements NativeResource {

        private static final B3CameraImageData ELEMENT_FACTORY = B3CameraImageData.create(-1L);

        /**
         * Creates a new {@code B3CameraImageData.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link B3CameraImageData#SIZEOF}, and its mark will be undefined.
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
        protected B3CameraImageData getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code m_pixelWidth} field. */
        public int m_pixelWidth() { return B3CameraImageData.nm_pixelWidth(address()); }
        /** Returns the value of the {@code m_pixelHeight} field. */
        public int m_pixelHeight() { return B3CameraImageData.nm_pixelHeight(address()); }
        /**
         * Returns a {@link ByteBuffer} view of the data pointed to by the {@code m_rgbColorData} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("unsigned char const *")
        public ByteBuffer m_rgbColorData(int capacity) { return B3CameraImageData.nm_rgbColorData(address(), capacity); }
        /**
         * Returns a {@link FloatBuffer} view of the data pointed to by the {@code m_depthValues} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("float const *")
        public FloatBuffer m_depthValues(int capacity) { return B3CameraImageData.nm_depthValues(address(), capacity); }
        /**
         * Returns a {@link IntBuffer} view of the data pointed to by the {@code m_segmentationMaskValues} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("int const *")
        public IntBuffer m_segmentationMaskValues(int capacity) { return B3CameraImageData.nm_segmentationMaskValues(address(), capacity); }

        /** Sets the specified value to the {@code m_pixelWidth} field. */
        public B3CameraImageData.Buffer m_pixelWidth(int value) { B3CameraImageData.nm_pixelWidth(address(), value); return this; }
        /** Sets the specified value to the {@code m_pixelHeight} field. */
        public B3CameraImageData.Buffer m_pixelHeight(int value) { B3CameraImageData.nm_pixelHeight(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code m_rgbColorData} field. */
        public B3CameraImageData.Buffer m_rgbColorData(@NativeType("unsigned char const *") ByteBuffer value) { B3CameraImageData.nm_rgbColorData(address(), value); return this; }
        /** Sets the address of the specified {@link FloatBuffer} to the {@code m_depthValues} field. */
        public B3CameraImageData.Buffer m_depthValues(@NativeType("float const *") FloatBuffer value) { B3CameraImageData.nm_depthValues(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code m_segmentationMaskValues} field. */
        public B3CameraImageData.Buffer m_segmentationMaskValues(@NativeType("int const *") IntBuffer value) { B3CameraImageData.nm_segmentationMaskValues(address(), value); return this; }

    }

}