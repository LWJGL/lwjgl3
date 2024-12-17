/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrSwapchainSubImage {
 *     XrSwapchain swapchain;
 *     {@link XrRect2Di XrRect2Di} imageRect;
 *     uint32_t imageArrayIndex;
 * }}</pre>
 */
public class XrSwapchainSubImage extends Struct<XrSwapchainSubImage> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SWAPCHAIN,
        IMAGERECT,
        IMAGEARRAYINDEX;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(XrRect2Di.SIZEOF, XrRect2Di.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SWAPCHAIN = layout.offsetof(0);
        IMAGERECT = layout.offsetof(1);
        IMAGEARRAYINDEX = layout.offsetof(2);
    }

    protected XrSwapchainSubImage(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSwapchainSubImage create(long address, @Nullable ByteBuffer container) {
        return new XrSwapchainSubImage(address, container);
    }

    /**
     * Creates a {@code XrSwapchainSubImage} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSwapchainSubImage(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code swapchain} field. */
    @NativeType("XrSwapchain")
    public long swapchain() { return nswapchain(address()); }
    /** @return a {@link XrRect2Di} view of the {@code imageRect} field. */
    public XrRect2Di imageRect() { return nimageRect(address()); }
    /** @return the value of the {@code imageArrayIndex} field. */
    @NativeType("uint32_t")
    public int imageArrayIndex() { return nimageArrayIndex(address()); }

    /** Sets the specified value to the {@code swapchain} field. */
    public XrSwapchainSubImage swapchain(XrSwapchain value) { nswapchain(address(), value); return this; }
    /** Copies the specified {@link XrRect2Di} to the {@code imageRect} field. */
    public XrSwapchainSubImage imageRect(XrRect2Di value) { nimageRect(address(), value); return this; }
    /** Passes the {@code imageRect} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSwapchainSubImage imageRect(java.util.function.Consumer<XrRect2Di> consumer) { consumer.accept(imageRect()); return this; }
    /** Sets the specified value to the {@code imageArrayIndex} field. */
    public XrSwapchainSubImage imageArrayIndex(@NativeType("uint32_t") int value) { nimageArrayIndex(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSwapchainSubImage set(
        XrSwapchain swapchain,
        XrRect2Di imageRect,
        int imageArrayIndex
    ) {
        swapchain(swapchain);
        imageRect(imageRect);
        imageArrayIndex(imageArrayIndex);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSwapchainSubImage set(XrSwapchainSubImage src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSwapchainSubImage} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSwapchainSubImage malloc() {
        return new XrSwapchainSubImage(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSwapchainSubImage} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSwapchainSubImage calloc() {
        return new XrSwapchainSubImage(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSwapchainSubImage} instance allocated with {@link BufferUtils}. */
    public static XrSwapchainSubImage create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSwapchainSubImage(memAddress(container), container);
    }

    /** Returns a new {@code XrSwapchainSubImage} instance for the specified memory address. */
    public static XrSwapchainSubImage create(long address) {
        return new XrSwapchainSubImage(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSwapchainSubImage createSafe(long address) {
        return address == NULL ? null : new XrSwapchainSubImage(address, null);
    }

    /**
     * Returns a new {@link XrSwapchainSubImage.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainSubImage.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainSubImage.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainSubImage.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainSubImage.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainSubImage.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSwapchainSubImage.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSwapchainSubImage.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSwapchainSubImage.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSwapchainSubImage} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSwapchainSubImage malloc(MemoryStack stack) {
        return new XrSwapchainSubImage(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSwapchainSubImage} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSwapchainSubImage calloc(MemoryStack stack) {
        return new XrSwapchainSubImage(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSwapchainSubImage.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSwapchainSubImage.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainSubImage.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSwapchainSubImage.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #swapchain}. */
    public static long nswapchain(long struct) { return memGetAddress(struct + XrSwapchainSubImage.SWAPCHAIN); }
    /** Unsafe version of {@link #imageRect}. */
    public static XrRect2Di nimageRect(long struct) { return XrRect2Di.create(struct + XrSwapchainSubImage.IMAGERECT); }
    /** Unsafe version of {@link #imageArrayIndex}. */
    public static int nimageArrayIndex(long struct) { return memGetInt(struct + XrSwapchainSubImage.IMAGEARRAYINDEX); }

    /** Unsafe version of {@link #swapchain(XrSwapchain) swapchain}. */
    public static void nswapchain(long struct, XrSwapchain value) { memPutAddress(struct + XrSwapchainSubImage.SWAPCHAIN, value.address()); }
    /** Unsafe version of {@link #imageRect(XrRect2Di) imageRect}. */
    public static void nimageRect(long struct, XrRect2Di value) { memCopy(value.address(), struct + XrSwapchainSubImage.IMAGERECT, XrRect2Di.SIZEOF); }
    /** Unsafe version of {@link #imageArrayIndex(int) imageArrayIndex}. */
    public static void nimageArrayIndex(long struct, int value) { memPutInt(struct + XrSwapchainSubImage.IMAGEARRAYINDEX, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSwapchainSubImage.SWAPCHAIN));
    }

    // -----------------------------------

    /** An array of {@link XrSwapchainSubImage} structs. */
    public static class Buffer extends StructBuffer<XrSwapchainSubImage, Buffer> implements NativeResource {

        private static final XrSwapchainSubImage ELEMENT_FACTORY = XrSwapchainSubImage.create(-1L);

        /**
         * Creates a new {@code XrSwapchainSubImage.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSwapchainSubImage#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSwapchainSubImage getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code swapchain} field. */
        @NativeType("XrSwapchain")
        public long swapchain() { return XrSwapchainSubImage.nswapchain(address()); }
        /** @return a {@link XrRect2Di} view of the {@code imageRect} field. */
        public XrRect2Di imageRect() { return XrSwapchainSubImage.nimageRect(address()); }
        /** @return the value of the {@code imageArrayIndex} field. */
        @NativeType("uint32_t")
        public int imageArrayIndex() { return XrSwapchainSubImage.nimageArrayIndex(address()); }

        /** Sets the specified value to the {@code swapchain} field. */
        public XrSwapchainSubImage.Buffer swapchain(XrSwapchain value) { XrSwapchainSubImage.nswapchain(address(), value); return this; }
        /** Copies the specified {@link XrRect2Di} to the {@code imageRect} field. */
        public XrSwapchainSubImage.Buffer imageRect(XrRect2Di value) { XrSwapchainSubImage.nimageRect(address(), value); return this; }
        /** Passes the {@code imageRect} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSwapchainSubImage.Buffer imageRect(java.util.function.Consumer<XrRect2Di> consumer) { consumer.accept(imageRect()); return this; }
        /** Sets the specified value to the {@code imageArrayIndex} field. */
        public XrSwapchainSubImage.Buffer imageArrayIndex(@NativeType("uint32_t") int value) { XrSwapchainSubImage.nimageArrayIndex(address(), value); return this; }

    }

}