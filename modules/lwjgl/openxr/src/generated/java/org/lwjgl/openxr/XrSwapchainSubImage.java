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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Composition layer data.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code swapchain} <b>must</b> be a valid {@code XrSwapchain} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrCompositionLayerCylinderKHR}, {@link XrCompositionLayerDepthInfoKHR}, {@link XrCompositionLayerEquirect2KHR}, {@link XrCompositionLayerEquirectKHR}, {@link XrCompositionLayerProjectionView}, {@link XrCompositionLayerQuad}, {@link XrCompositionLayerSpaceWarpInfoFB}, {@link XrFrameEndInfo}, {@link XrRect2Di}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSwapchainSubImage {
 *     XrSwapchain {@link #swapchain};
 *     {@link XrRect2Di XrRect2Di} {@link #imageRect};
 *     uint32_t {@link #imageArrayIndex};
 * }</code></pre>
 */
public class XrSwapchainSubImage extends Struct implements NativeResource {

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

    /** the {@code XrSwapchain} to be displayed. */
    @NativeType("XrSwapchain")
    public long swapchain() { return nswapchain(address()); }
    /** an {@link XrRect2Di} representing the valid portion of the image to use, in pixels. It also implicitly defines the transform from normalized image coordinates into pixel coordinates. The coordinate origin depends on which graphics API is being used. See the graphics API extension details for more information on the coordinate origin definition. Note that the compositor <b>may</b> bleed in pixels from outside the bounds in some cases, for instance due to mipmapping. */
    public XrRect2Di imageRect() { return nimageRect(address()); }
    /** the image array index, with 0 meaning the first or only array element. */
    @NativeType("uint32_t")
    public int imageArrayIndex() { return nimageArrayIndex(address()); }

    /** Sets the specified value to the {@link #swapchain} field. */
    public XrSwapchainSubImage swapchain(XrSwapchain value) { nswapchain(address(), value); return this; }
    /** Copies the specified {@link XrRect2Di} to the {@link #imageRect} field. */
    public XrSwapchainSubImage imageRect(XrRect2Di value) { nimageRect(address(), value); return this; }
    /** Passes the {@link #imageRect} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSwapchainSubImage imageRect(java.util.function.Consumer<XrRect2Di> consumer) { consumer.accept(imageRect()); return this; }
    /** Sets the specified value to the {@link #imageArrayIndex} field. */
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
        return wrap(XrSwapchainSubImage.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSwapchainSubImage} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSwapchainSubImage calloc() {
        return wrap(XrSwapchainSubImage.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSwapchainSubImage} instance allocated with {@link BufferUtils}. */
    public static XrSwapchainSubImage create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSwapchainSubImage.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSwapchainSubImage} instance for the specified memory address. */
    public static XrSwapchainSubImage create(long address) {
        return wrap(XrSwapchainSubImage.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSwapchainSubImage createSafe(long address) {
        return address == NULL ? null : wrap(XrSwapchainSubImage.class, address);
    }

    /**
     * Returns a new {@link XrSwapchainSubImage.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainSubImage.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainSubImage.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainSubImage.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainSubImage.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainSubImage.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSwapchainSubImage.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSwapchainSubImage.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSwapchainSubImage.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrSwapchainSubImage} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSwapchainSubImage malloc(MemoryStack stack) {
        return wrap(XrSwapchainSubImage.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSwapchainSubImage} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSwapchainSubImage calloc(MemoryStack stack) {
        return wrap(XrSwapchainSubImage.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSwapchainSubImage.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSwapchainSubImage.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainSubImage.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSwapchainSubImage.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #swapchain}. */
    public static long nswapchain(long struct) { return memGetAddress(struct + XrSwapchainSubImage.SWAPCHAIN); }
    /** Unsafe version of {@link #imageRect}. */
    public static XrRect2Di nimageRect(long struct) { return XrRect2Di.create(struct + XrSwapchainSubImage.IMAGERECT); }
    /** Unsafe version of {@link #imageArrayIndex}. */
    public static int nimageArrayIndex(long struct) { return UNSAFE.getInt(null, struct + XrSwapchainSubImage.IMAGEARRAYINDEX); }

    /** Unsafe version of {@link #swapchain(XrSwapchain) swapchain}. */
    public static void nswapchain(long struct, XrSwapchain value) { memPutAddress(struct + XrSwapchainSubImage.SWAPCHAIN, value.address()); }
    /** Unsafe version of {@link #imageRect(XrRect2Di) imageRect}. */
    public static void nimageRect(long struct, XrRect2Di value) { memCopy(value.address(), struct + XrSwapchainSubImage.IMAGERECT, XrRect2Di.SIZEOF); }
    /** Unsafe version of {@link #imageArrayIndex(int) imageArrayIndex}. */
    public static void nimageArrayIndex(long struct, int value) { UNSAFE.putInt(null, struct + XrSwapchainSubImage.IMAGEARRAYINDEX, value); }

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
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSwapchainSubImage#SIZEOF}, and its mark will be undefined.
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
        protected XrSwapchainSubImage getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSwapchainSubImage#swapchain} field. */
        @NativeType("XrSwapchain")
        public long swapchain() { return XrSwapchainSubImage.nswapchain(address()); }
        /** @return a {@link XrRect2Di} view of the {@link XrSwapchainSubImage#imageRect} field. */
        public XrRect2Di imageRect() { return XrSwapchainSubImage.nimageRect(address()); }
        /** @return the value of the {@link XrSwapchainSubImage#imageArrayIndex} field. */
        @NativeType("uint32_t")
        public int imageArrayIndex() { return XrSwapchainSubImage.nimageArrayIndex(address()); }

        /** Sets the specified value to the {@link XrSwapchainSubImage#swapchain} field. */
        public XrSwapchainSubImage.Buffer swapchain(XrSwapchain value) { XrSwapchainSubImage.nswapchain(address(), value); return this; }
        /** Copies the specified {@link XrRect2Di} to the {@link XrSwapchainSubImage#imageRect} field. */
        public XrSwapchainSubImage.Buffer imageRect(XrRect2Di value) { XrSwapchainSubImage.nimageRect(address(), value); return this; }
        /** Passes the {@link XrSwapchainSubImage#imageRect} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSwapchainSubImage.Buffer imageRect(java.util.function.Consumer<XrRect2Di> consumer) { consumer.accept(imageRect()); return this; }
        /** Sets the specified value to the {@link XrSwapchainSubImage#imageArrayIndex} field. */
        public XrSwapchainSubImage.Buffer imageArrayIndex(@NativeType("uint32_t") int value) { XrSwapchainSubImage.nimageArrayIndex(address(), value); return this; }

    }

}