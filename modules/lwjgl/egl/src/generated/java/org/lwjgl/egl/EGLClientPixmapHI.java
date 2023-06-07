/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Specifies the width, height, stride, format and memory pointer of the pixmap to be used by the function {@link HIClientpixmap#eglCreatePixmapSurfaceHI CreatePixmapSurfaceHI} to
 * create the {@code PixmapSurface}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct EGLClientPixmapHI {
 *     void * {@link #pData};
 *     EGLint {@link #iWidth};
 *     EGLint {@link #iHeight};
 *     EGLint {@link #iStride};
 * }</code></pre>
 */
@NativeType("struct EGLClientPixmapHI")
public class EGLClientPixmapHI extends Struct<EGLClientPixmapHI> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PDATA,
        IWIDTH,
        IHEIGHT,
        ISTRIDE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PDATA = layout.offsetof(0);
        IWIDTH = layout.offsetof(1);
        IHEIGHT = layout.offsetof(2);
        ISTRIDE = layout.offsetof(3);
    }

    protected EGLClientPixmapHI(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected EGLClientPixmapHI create(long address, @Nullable ByteBuffer container) {
        return new EGLClientPixmapHI(address, container);
    }

    /**
     * Creates a {@code EGLClientPixmapHI} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public EGLClientPixmapHI(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /**
     * @param capacity the number of elements in the returned buffer
     *
     * @return pointer to a memory buffer allocated by the application that will contain the result of the drawing operations. It is up to the application to ensure
     *         that the buffer size corresponds to {@code iHeight * iStride * sizeof(pixel)}.
     */
    @NativeType("void *")
    public ByteBuffer pData(int capacity) { return npData(address(), capacity); }
    /** width of the buffer in pixels */
    @NativeType("EGLint")
    public int iWidth() { return niWidth(address()); }
    /**
     * height of the buffer in pixels. The height of the buffer can be negative; in that case the result of the drawing operations will be vertically swapped.
     * When positive, {@code pData} will point at the bottom-left corner of the image; when negative, to the top-left corner.
     */
    @NativeType("EGLint")
    public int iHeight() { return niHeight(address()); }
    /** stride of the buffer, in pixels. It is important to note that each row of the buffer must start on 32-bit boundaries. */
    @NativeType("EGLint")
    public int iStride() { return niStride(address()); }

    /** Sets the address of the specified {@link ByteBuffer} to the {@link #pData} field. */
    public EGLClientPixmapHI pData(@NativeType("void *") ByteBuffer value) { npData(address(), value); return this; }
    /** Sets the specified value to the {@link #iWidth} field. */
    public EGLClientPixmapHI iWidth(@NativeType("EGLint") int value) { niWidth(address(), value); return this; }
    /** Sets the specified value to the {@link #iHeight} field. */
    public EGLClientPixmapHI iHeight(@NativeType("EGLint") int value) { niHeight(address(), value); return this; }
    /** Sets the specified value to the {@link #iStride} field. */
    public EGLClientPixmapHI iStride(@NativeType("EGLint") int value) { niStride(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public EGLClientPixmapHI set(
        ByteBuffer pData,
        int iWidth,
        int iHeight,
        int iStride
    ) {
        pData(pData);
        iWidth(iWidth);
        iHeight(iHeight);
        iStride(iStride);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public EGLClientPixmapHI set(EGLClientPixmapHI src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code EGLClientPixmapHI} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static EGLClientPixmapHI malloc() {
        return new EGLClientPixmapHI(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code EGLClientPixmapHI} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static EGLClientPixmapHI calloc() {
        return new EGLClientPixmapHI(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code EGLClientPixmapHI} instance allocated with {@link BufferUtils}. */
    public static EGLClientPixmapHI create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new EGLClientPixmapHI(memAddress(container), container);
    }

    /** Returns a new {@code EGLClientPixmapHI} instance for the specified memory address. */
    public static EGLClientPixmapHI create(long address) {
        return new EGLClientPixmapHI(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static EGLClientPixmapHI createSafe(long address) {
        return address == NULL ? null : new EGLClientPixmapHI(address, null);
    }

    /**
     * Returns a new {@link EGLClientPixmapHI.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static EGLClientPixmapHI.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link EGLClientPixmapHI.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static EGLClientPixmapHI.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link EGLClientPixmapHI.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static EGLClientPixmapHI.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link EGLClientPixmapHI.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static EGLClientPixmapHI.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static EGLClientPixmapHI.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static EGLClientPixmapHI mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static EGLClientPixmapHI callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static EGLClientPixmapHI mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static EGLClientPixmapHI callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static EGLClientPixmapHI.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static EGLClientPixmapHI.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static EGLClientPixmapHI.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static EGLClientPixmapHI.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code EGLClientPixmapHI} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static EGLClientPixmapHI malloc(MemoryStack stack) {
        return new EGLClientPixmapHI(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code EGLClientPixmapHI} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static EGLClientPixmapHI calloc(MemoryStack stack) {
        return new EGLClientPixmapHI(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link EGLClientPixmapHI.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static EGLClientPixmapHI.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link EGLClientPixmapHI.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static EGLClientPixmapHI.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #pData(int) pData}. */
    public static ByteBuffer npData(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + EGLClientPixmapHI.PDATA), capacity); }
    /** Unsafe version of {@link #iWidth}. */
    public static int niWidth(long struct) { return UNSAFE.getInt(null, struct + EGLClientPixmapHI.IWIDTH); }
    /** Unsafe version of {@link #iHeight}. */
    public static int niHeight(long struct) { return UNSAFE.getInt(null, struct + EGLClientPixmapHI.IHEIGHT); }
    /** Unsafe version of {@link #iStride}. */
    public static int niStride(long struct) { return UNSAFE.getInt(null, struct + EGLClientPixmapHI.ISTRIDE); }

    /** Unsafe version of {@link #pData(ByteBuffer) pData}. */
    public static void npData(long struct, ByteBuffer value) { memPutAddress(struct + EGLClientPixmapHI.PDATA, memAddress(value)); }
    /** Unsafe version of {@link #iWidth(int) iWidth}. */
    public static void niWidth(long struct, int value) { UNSAFE.putInt(null, struct + EGLClientPixmapHI.IWIDTH, value); }
    /** Unsafe version of {@link #iHeight(int) iHeight}. */
    public static void niHeight(long struct, int value) { UNSAFE.putInt(null, struct + EGLClientPixmapHI.IHEIGHT, value); }
    /** Unsafe version of {@link #iStride(int) iStride}. */
    public static void niStride(long struct, int value) { UNSAFE.putInt(null, struct + EGLClientPixmapHI.ISTRIDE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + EGLClientPixmapHI.PDATA));
    }

    // -----------------------------------

    /** An array of {@link EGLClientPixmapHI} structs. */
    public static class Buffer extends StructBuffer<EGLClientPixmapHI, Buffer> implements NativeResource {

        private static final EGLClientPixmapHI ELEMENT_FACTORY = EGLClientPixmapHI.create(-1L);

        /**
         * Creates a new {@code EGLClientPixmapHI.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link EGLClientPixmapHI#SIZEOF}, and its mark will be undefined.</p>
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
        protected EGLClientPixmapHI getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /**
         * @return a {@link ByteBuffer} view of the data pointed to by the {@link EGLClientPixmapHI#pData} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("void *")
        public ByteBuffer pData(int capacity) { return EGLClientPixmapHI.npData(address(), capacity); }
        /** @return the value of the {@link EGLClientPixmapHI#iWidth} field. */
        @NativeType("EGLint")
        public int iWidth() { return EGLClientPixmapHI.niWidth(address()); }
        /** @return the value of the {@link EGLClientPixmapHI#iHeight} field. */
        @NativeType("EGLint")
        public int iHeight() { return EGLClientPixmapHI.niHeight(address()); }
        /** @return the value of the {@link EGLClientPixmapHI#iStride} field. */
        @NativeType("EGLint")
        public int iStride() { return EGLClientPixmapHI.niStride(address()); }

        /** Sets the address of the specified {@link ByteBuffer} to the {@link EGLClientPixmapHI#pData} field. */
        public EGLClientPixmapHI.Buffer pData(@NativeType("void *") ByteBuffer value) { EGLClientPixmapHI.npData(address(), value); return this; }
        /** Sets the specified value to the {@link EGLClientPixmapHI#iWidth} field. */
        public EGLClientPixmapHI.Buffer iWidth(@NativeType("EGLint") int value) { EGLClientPixmapHI.niWidth(address(), value); return this; }
        /** Sets the specified value to the {@link EGLClientPixmapHI#iHeight} field. */
        public EGLClientPixmapHI.Buffer iHeight(@NativeType("EGLint") int value) { EGLClientPixmapHI.niHeight(address(), value); return this; }
        /** Sets the specified value to the {@link EGLClientPixmapHI#iStride} field. */
        public EGLClientPixmapHI.Buffer iStride(@NativeType("EGLint") int value) { EGLClientPixmapHI.niStride(address(), value); return this; }

    }

}