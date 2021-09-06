/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * The image format descriptor struct.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct cl_image_format {
 *     cl_channel_order {@link #image_channel_order};
 *     cl_channel_type {@link #image_channel_data_type};
 * }</code></pre>
 */
@NativeType("struct cl_image_format")
public class CLImageFormat extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        IMAGE_CHANNEL_ORDER,
        IMAGE_CHANNEL_DATA_TYPE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        IMAGE_CHANNEL_ORDER = layout.offsetof(0);
        IMAGE_CHANNEL_DATA_TYPE = layout.offsetof(1);
    }

    /**
     * Creates a {@code CLImageFormat} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CLImageFormat(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** specifies the number of channels and the channel layout i.e. the memory layout in which channels are stored in the image */
    @NativeType("cl_channel_order")
    public int image_channel_order() { return nimage_channel_order(address()); }
    /**
     * describes the size of the channel data type. The number of bits per element determined by the {@code image_channel_data_type} and
     * {@code image_channel_order} must be a power of two.
     */
    @NativeType("cl_channel_type")
    public int image_channel_data_type() { return nimage_channel_data_type(address()); }

    /** Sets the specified value to the {@link #image_channel_order} field. */
    public CLImageFormat image_channel_order(@NativeType("cl_channel_order") int value) { nimage_channel_order(address(), value); return this; }
    /** Sets the specified value to the {@link #image_channel_data_type} field. */
    public CLImageFormat image_channel_data_type(@NativeType("cl_channel_type") int value) { nimage_channel_data_type(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public CLImageFormat set(
        int image_channel_order,
        int image_channel_data_type
    ) {
        image_channel_order(image_channel_order);
        image_channel_data_type(image_channel_data_type);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CLImageFormat set(CLImageFormat src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CLImageFormat} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CLImageFormat malloc() {
        return wrap(CLImageFormat.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code CLImageFormat} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CLImageFormat calloc() {
        return wrap(CLImageFormat.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code CLImageFormat} instance allocated with {@link BufferUtils}. */
    public static CLImageFormat create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CLImageFormat.class, memAddress(container), container);
    }

    /** Returns a new {@code CLImageFormat} instance for the specified memory address. */
    public static CLImageFormat create(long address) {
        return wrap(CLImageFormat.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CLImageFormat createSafe(long address) {
        return address == NULL ? null : wrap(CLImageFormat.class, address);
    }

    /**
     * Returns a new {@link CLImageFormat.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CLImageFormat.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CLImageFormat.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CLImageFormat.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CLImageFormat.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CLImageFormat.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CLImageFormat.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CLImageFormat.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CLImageFormat.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CLImageFormat mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CLImageFormat callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CLImageFormat mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CLImageFormat callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CLImageFormat.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CLImageFormat.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CLImageFormat.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CLImageFormat.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code CLImageFormat} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CLImageFormat malloc(MemoryStack stack) {
        return wrap(CLImageFormat.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code CLImageFormat} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CLImageFormat calloc(MemoryStack stack) {
        return wrap(CLImageFormat.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CLImageFormat.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CLImageFormat.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CLImageFormat.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CLImageFormat.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #image_channel_order}. */
    public static int nimage_channel_order(long struct) { return UNSAFE.getInt(null, struct + CLImageFormat.IMAGE_CHANNEL_ORDER); }
    /** Unsafe version of {@link #image_channel_data_type}. */
    public static int nimage_channel_data_type(long struct) { return UNSAFE.getInt(null, struct + CLImageFormat.IMAGE_CHANNEL_DATA_TYPE); }

    /** Unsafe version of {@link #image_channel_order(int) image_channel_order}. */
    public static void nimage_channel_order(long struct, int value) { UNSAFE.putInt(null, struct + CLImageFormat.IMAGE_CHANNEL_ORDER, value); }
    /** Unsafe version of {@link #image_channel_data_type(int) image_channel_data_type}. */
    public static void nimage_channel_data_type(long struct, int value) { UNSAFE.putInt(null, struct + CLImageFormat.IMAGE_CHANNEL_DATA_TYPE, value); }

    // -----------------------------------

    /** An array of {@link CLImageFormat} structs. */
    public static class Buffer extends StructBuffer<CLImageFormat, Buffer> implements NativeResource {

        private static final CLImageFormat ELEMENT_FACTORY = CLImageFormat.create(-1L);

        /**
         * Creates a new {@code CLImageFormat.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CLImageFormat#SIZEOF}, and its mark will be undefined.
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
        protected CLImageFormat getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link CLImageFormat#image_channel_order} field. */
        @NativeType("cl_channel_order")
        public int image_channel_order() { return CLImageFormat.nimage_channel_order(address()); }
        /** @return the value of the {@link CLImageFormat#image_channel_data_type} field. */
        @NativeType("cl_channel_type")
        public int image_channel_data_type() { return CLImageFormat.nimage_channel_data_type(address()); }

        /** Sets the specified value to the {@link CLImageFormat#image_channel_order} field. */
        public CLImageFormat.Buffer image_channel_order(@NativeType("cl_channel_order") int value) { CLImageFormat.nimage_channel_order(address(), value); return this; }
        /** Sets the specified value to the {@link CLImageFormat#image_channel_data_type} field. */
        public CLImageFormat.Buffer image_channel_data_type(@NativeType("cl_channel_type") int value) { CLImageFormat.nimage_channel_data_type(address(), value); return this; }

    }

}