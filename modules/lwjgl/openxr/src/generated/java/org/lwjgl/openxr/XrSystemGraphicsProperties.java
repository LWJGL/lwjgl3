/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Graphics-related properties of a particular system.
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrSystemProperties}, {@link XrSystemTrackingProperties}, {@link XR10#xrGetSystem GetSystem}, {@link XR10#xrGetSystemProperties GetSystemProperties}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSystemGraphicsProperties {
 *     uint32_t {@link #maxSwapchainImageHeight};
 *     uint32_t {@link #maxSwapchainImageWidth};
 *     uint32_t {@link #maxLayerCount};
 * }</code></pre>
 */
public class XrSystemGraphicsProperties extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MAXSWAPCHAINIMAGEHEIGHT,
        MAXSWAPCHAINIMAGEWIDTH,
        MAXLAYERCOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MAXSWAPCHAINIMAGEHEIGHT = layout.offsetof(0);
        MAXSWAPCHAINIMAGEWIDTH = layout.offsetof(1);
        MAXLAYERCOUNT = layout.offsetof(2);
    }

    /**
     * Creates a {@code XrSystemGraphicsProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemGraphicsProperties(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the maximum swapchain image pixel height supported by this system. */
    @NativeType("uint32_t")
    public int maxSwapchainImageHeight() { return nmaxSwapchainImageHeight(address()); }
    /** the maximum swapchain image pixel width supported by this system. */
    @NativeType("uint32_t")
    public int maxSwapchainImageWidth() { return nmaxSwapchainImageWidth(address()); }
    /** the maximum number of composition layers supported by this system. The runtime <b>must</b> support at least {@link XR10#XR_MIN_COMPOSITION_LAYERS_SUPPORTED MIN_COMPOSITION_LAYERS_SUPPORTED} layers. */
    @NativeType("uint32_t")
    public int maxLayerCount() { return nmaxLayerCount(address()); }

    /** Sets the specified value to the {@link #maxSwapchainImageHeight} field. */
    public XrSystemGraphicsProperties maxSwapchainImageHeight(@NativeType("uint32_t") int value) { nmaxSwapchainImageHeight(address(), value); return this; }
    /** Sets the specified value to the {@link #maxSwapchainImageWidth} field. */
    public XrSystemGraphicsProperties maxSwapchainImageWidth(@NativeType("uint32_t") int value) { nmaxSwapchainImageWidth(address(), value); return this; }
    /** Sets the specified value to the {@link #maxLayerCount} field. */
    public XrSystemGraphicsProperties maxLayerCount(@NativeType("uint32_t") int value) { nmaxLayerCount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemGraphicsProperties set(
        int maxSwapchainImageHeight,
        int maxSwapchainImageWidth,
        int maxLayerCount
    ) {
        maxSwapchainImageHeight(maxSwapchainImageHeight);
        maxSwapchainImageWidth(maxSwapchainImageWidth);
        maxLayerCount(maxLayerCount);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSystemGraphicsProperties set(XrSystemGraphicsProperties src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemGraphicsProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemGraphicsProperties malloc() {
        return wrap(XrSystemGraphicsProperties.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSystemGraphicsProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemGraphicsProperties calloc() {
        return wrap(XrSystemGraphicsProperties.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSystemGraphicsProperties} instance allocated with {@link BufferUtils}. */
    public static XrSystemGraphicsProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSystemGraphicsProperties.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSystemGraphicsProperties} instance for the specified memory address. */
    public static XrSystemGraphicsProperties create(long address) {
        return wrap(XrSystemGraphicsProperties.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSystemGraphicsProperties createSafe(long address) {
        return address == NULL ? null : wrap(XrSystemGraphicsProperties.class, address);
    }

    /**
     * Returns a new {@link XrSystemGraphicsProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemGraphicsProperties.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemGraphicsProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemGraphicsProperties.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemGraphicsProperties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemGraphicsProperties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSystemGraphicsProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemGraphicsProperties.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSystemGraphicsProperties.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrSystemGraphicsProperties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemGraphicsProperties malloc(MemoryStack stack) {
        return wrap(XrSystemGraphicsProperties.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSystemGraphicsProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemGraphicsProperties calloc(MemoryStack stack) {
        return wrap(XrSystemGraphicsProperties.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSystemGraphicsProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemGraphicsProperties.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemGraphicsProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemGraphicsProperties.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #maxSwapchainImageHeight}. */
    public static int nmaxSwapchainImageHeight(long struct) { return UNSAFE.getInt(null, struct + XrSystemGraphicsProperties.MAXSWAPCHAINIMAGEHEIGHT); }
    /** Unsafe version of {@link #maxSwapchainImageWidth}. */
    public static int nmaxSwapchainImageWidth(long struct) { return UNSAFE.getInt(null, struct + XrSystemGraphicsProperties.MAXSWAPCHAINIMAGEWIDTH); }
    /** Unsafe version of {@link #maxLayerCount}. */
    public static int nmaxLayerCount(long struct) { return UNSAFE.getInt(null, struct + XrSystemGraphicsProperties.MAXLAYERCOUNT); }

    /** Unsafe version of {@link #maxSwapchainImageHeight(int) maxSwapchainImageHeight}. */
    public static void nmaxSwapchainImageHeight(long struct, int value) { UNSAFE.putInt(null, struct + XrSystemGraphicsProperties.MAXSWAPCHAINIMAGEHEIGHT, value); }
    /** Unsafe version of {@link #maxSwapchainImageWidth(int) maxSwapchainImageWidth}. */
    public static void nmaxSwapchainImageWidth(long struct, int value) { UNSAFE.putInt(null, struct + XrSystemGraphicsProperties.MAXSWAPCHAINIMAGEWIDTH, value); }
    /** Unsafe version of {@link #maxLayerCount(int) maxLayerCount}. */
    public static void nmaxLayerCount(long struct, int value) { UNSAFE.putInt(null, struct + XrSystemGraphicsProperties.MAXLAYERCOUNT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemGraphicsProperties} structs. */
    public static class Buffer extends StructBuffer<XrSystemGraphicsProperties, Buffer> implements NativeResource {

        private static final XrSystemGraphicsProperties ELEMENT_FACTORY = XrSystemGraphicsProperties.create(-1L);

        /**
         * Creates a new {@code XrSystemGraphicsProperties.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemGraphicsProperties#SIZEOF}, and its mark will be undefined.
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
        protected XrSystemGraphicsProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSystemGraphicsProperties#maxSwapchainImageHeight} field. */
        @NativeType("uint32_t")
        public int maxSwapchainImageHeight() { return XrSystemGraphicsProperties.nmaxSwapchainImageHeight(address()); }
        /** @return the value of the {@link XrSystemGraphicsProperties#maxSwapchainImageWidth} field. */
        @NativeType("uint32_t")
        public int maxSwapchainImageWidth() { return XrSystemGraphicsProperties.nmaxSwapchainImageWidth(address()); }
        /** @return the value of the {@link XrSystemGraphicsProperties#maxLayerCount} field. */
        @NativeType("uint32_t")
        public int maxLayerCount() { return XrSystemGraphicsProperties.nmaxLayerCount(address()); }

        /** Sets the specified value to the {@link XrSystemGraphicsProperties#maxSwapchainImageHeight} field. */
        public XrSystemGraphicsProperties.Buffer maxSwapchainImageHeight(@NativeType("uint32_t") int value) { XrSystemGraphicsProperties.nmaxSwapchainImageHeight(address(), value); return this; }
        /** Sets the specified value to the {@link XrSystemGraphicsProperties#maxSwapchainImageWidth} field. */
        public XrSystemGraphicsProperties.Buffer maxSwapchainImageWidth(@NativeType("uint32_t") int value) { XrSystemGraphicsProperties.nmaxSwapchainImageWidth(address(), value); return this; }
        /** Sets the specified value to the {@link XrSystemGraphicsProperties#maxLayerCount} field. */
        public XrSystemGraphicsProperties.Buffer maxLayerCount(@NativeType("uint32_t") int value) { XrSystemGraphicsProperties.nmaxLayerCount(address(), value); return this; }

    }

}