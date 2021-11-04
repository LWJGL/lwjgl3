/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Bitmap data.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct stbtt__bitmap {
 *     int {@link #w};
 *     int {@link #h};
 *     int {@link #stride};
 *     unsigned char * {@link #pixels};
 * }</code></pre>
 */
@NativeType("struct stbtt__bitmap")
public class STBTTBitmap extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        W,
        H,
        STRIDE,
        PIXELS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        W = layout.offsetof(0);
        H = layout.offsetof(1);
        STRIDE = layout.offsetof(2);
        PIXELS = layout.offsetof(3);
    }

    /**
     * Creates a {@code STBTTBitmap} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public STBTTBitmap(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the bitmap width */
    public int w() { return nw(address()); }
    /** the bitmap height */
    public int h() { return nh(address()); }
    /** the row stride, in bytes */
    public int stride() { return nstride(address()); }
    /**
     * @param capacity the number of elements in the returned buffer
     *
     * @return the bitmap data
     */
    @NativeType("unsigned char *")
    public ByteBuffer pixels(int capacity) { return npixels(address(), capacity); }

    /** Sets the specified value to the {@link #w} field. */
    public STBTTBitmap w(int value) { nw(address(), value); return this; }
    /** Sets the specified value to the {@link #h} field. */
    public STBTTBitmap h(int value) { nh(address(), value); return this; }
    /** Sets the specified value to the {@link #stride} field. */
    public STBTTBitmap stride(int value) { nstride(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@link #pixels} field. */
    public STBTTBitmap pixels(@NativeType("unsigned char *") ByteBuffer value) { npixels(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public STBTTBitmap set(
        int w,
        int h,
        int stride,
        ByteBuffer pixels
    ) {
        w(w);
        h(h);
        stride(stride);
        pixels(pixels);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public STBTTBitmap set(STBTTBitmap src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code STBTTBitmap} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static STBTTBitmap malloc() {
        return wrap(STBTTBitmap.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code STBTTBitmap} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static STBTTBitmap calloc() {
        return wrap(STBTTBitmap.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code STBTTBitmap} instance allocated with {@link BufferUtils}. */
    public static STBTTBitmap create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(STBTTBitmap.class, memAddress(container), container);
    }

    /** Returns a new {@code STBTTBitmap} instance for the specified memory address. */
    public static STBTTBitmap create(long address) {
        return wrap(STBTTBitmap.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static STBTTBitmap createSafe(long address) {
        return address == NULL ? null : wrap(STBTTBitmap.class, address);
    }

    /**
     * Returns a new {@link STBTTBitmap.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static STBTTBitmap.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link STBTTBitmap.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static STBTTBitmap.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link STBTTBitmap.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static STBTTBitmap.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link STBTTBitmap.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static STBTTBitmap.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static STBTTBitmap.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static STBTTBitmap mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static STBTTBitmap callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static STBTTBitmap mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static STBTTBitmap callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static STBTTBitmap.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static STBTTBitmap.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static STBTTBitmap.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static STBTTBitmap.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code STBTTBitmap} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static STBTTBitmap malloc(MemoryStack stack) {
        return wrap(STBTTBitmap.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code STBTTBitmap} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static STBTTBitmap calloc(MemoryStack stack) {
        return wrap(STBTTBitmap.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link STBTTBitmap.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static STBTTBitmap.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link STBTTBitmap.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static STBTTBitmap.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #w}. */
    public static int nw(long struct) { return UNSAFE.getInt(null, struct + STBTTBitmap.W); }
    /** Unsafe version of {@link #h}. */
    public static int nh(long struct) { return UNSAFE.getInt(null, struct + STBTTBitmap.H); }
    /** Unsafe version of {@link #stride}. */
    public static int nstride(long struct) { return UNSAFE.getInt(null, struct + STBTTBitmap.STRIDE); }
    /** Unsafe version of {@link #pixels(int) pixels}. */
    public static ByteBuffer npixels(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + STBTTBitmap.PIXELS), capacity); }

    /** Unsafe version of {@link #w(int) w}. */
    public static void nw(long struct, int value) { UNSAFE.putInt(null, struct + STBTTBitmap.W, value); }
    /** Unsafe version of {@link #h(int) h}. */
    public static void nh(long struct, int value) { UNSAFE.putInt(null, struct + STBTTBitmap.H, value); }
    /** Unsafe version of {@link #stride(int) stride}. */
    public static void nstride(long struct, int value) { UNSAFE.putInt(null, struct + STBTTBitmap.STRIDE, value); }
    /** Unsafe version of {@link #pixels(ByteBuffer) pixels}. */
    public static void npixels(long struct, ByteBuffer value) { memPutAddress(struct + STBTTBitmap.PIXELS, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + STBTTBitmap.PIXELS));
    }

    // -----------------------------------

    /** An array of {@link STBTTBitmap} structs. */
    public static class Buffer extends StructBuffer<STBTTBitmap, Buffer> implements NativeResource {

        private static final STBTTBitmap ELEMENT_FACTORY = STBTTBitmap.create(-1L);

        /**
         * Creates a new {@code STBTTBitmap.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link STBTTBitmap#SIZEOF}, and its mark will be undefined.
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
        protected STBTTBitmap getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link STBTTBitmap#w} field. */
        public int w() { return STBTTBitmap.nw(address()); }
        /** @return the value of the {@link STBTTBitmap#h} field. */
        public int h() { return STBTTBitmap.nh(address()); }
        /** @return the value of the {@link STBTTBitmap#stride} field. */
        public int stride() { return STBTTBitmap.nstride(address()); }
        /**
         * @return a {@link ByteBuffer} view of the data pointed to by the {@link STBTTBitmap#pixels} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("unsigned char *")
        public ByteBuffer pixels(int capacity) { return STBTTBitmap.npixels(address(), capacity); }

        /** Sets the specified value to the {@link STBTTBitmap#w} field. */
        public STBTTBitmap.Buffer w(int value) { STBTTBitmap.nw(address(), value); return this; }
        /** Sets the specified value to the {@link STBTTBitmap#h} field. */
        public STBTTBitmap.Buffer h(int value) { STBTTBitmap.nh(address(), value); return this; }
        /** Sets the specified value to the {@link STBTTBitmap#stride} field. */
        public STBTTBitmap.Buffer stride(int value) { STBTTBitmap.nstride(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@link STBTTBitmap#pixels} field. */
        public STBTTBitmap.Buffer pixels(@NativeType("unsigned char *") ByteBuffer value) { STBTTBitmap.npixels(address(), value); return this; }

    }

}