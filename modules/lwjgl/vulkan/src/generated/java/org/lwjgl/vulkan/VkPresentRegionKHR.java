/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure containing rectangular region changed by vkQueuePresentKHR for a given VkImage.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>If {@code rectangleCount} is not 0, and {@code pRectangles} is not {@code NULL}, {@code pRectangles} <b>must</b> be a valid pointer to an array of {@code rectangleCount} valid {@link VkRectLayerKHR} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkPresentRegionsKHR}, {@link VkRectLayerKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPresentRegionKHR {
 *     uint32_t {@link #rectangleCount};
 *     {@link VkRectLayerKHR VkRectLayerKHR} const * {@link #pRectangles};
 * }</code></pre>
 */
public class VkPresentRegionKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        RECTANGLECOUNT,
        PRECTANGLES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        RECTANGLECOUNT = layout.offsetof(0);
        PRECTANGLES = layout.offsetof(1);
    }

    /**
     * Creates a {@code VkPresentRegionKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPresentRegionKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the number of rectangles in {@code pRectangles}, or zero if the entire image has changed and should be presented. */
    @NativeType("uint32_t")
    public int rectangleCount() { return nrectangleCount(address()); }
    /** either {@code NULL} or a pointer to an array of {@link VkRectLayerKHR} structures. The {@link VkRectLayerKHR} structure is the framebuffer coordinates, plus layer, of a portion of a presentable image that has changed and <b>must</b> be presented. If non-{@code NULL}, each entry in {@code pRectangles} is a rectangle of the given image that has changed since the last image was presented to the given swapchain. The rectangles <b>must</b> be specified relative to {@link VkSurfaceCapabilitiesKHR}{@code ::currentTransform}, regardless of the swapchain’s {@code preTransform}. The presentation engine will apply the {@code preTransform} transformation to the rectangles, along with any further transformation it applies to the image content. */
    @Nullable
    @NativeType("VkRectLayerKHR const *")
    public VkRectLayerKHR.Buffer pRectangles() { return npRectangles(address()); }

    /** Sets the specified value to the {@link #rectangleCount} field. */
    public VkPresentRegionKHR rectangleCount(@NativeType("uint32_t") int value) { nrectangleCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkRectLayerKHR.Buffer} to the {@link #pRectangles} field. */
    public VkPresentRegionKHR pRectangles(@Nullable @NativeType("VkRectLayerKHR const *") VkRectLayerKHR.Buffer value) { npRectangles(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPresentRegionKHR set(
        int rectangleCount,
        @Nullable VkRectLayerKHR.Buffer pRectangles
    ) {
        rectangleCount(rectangleCount);
        pRectangles(pRectangles);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPresentRegionKHR set(VkPresentRegionKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPresentRegionKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPresentRegionKHR malloc() {
        return wrap(VkPresentRegionKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPresentRegionKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPresentRegionKHR calloc() {
        return wrap(VkPresentRegionKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPresentRegionKHR} instance allocated with {@link BufferUtils}. */
    public static VkPresentRegionKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPresentRegionKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPresentRegionKHR} instance for the specified memory address. */
    public static VkPresentRegionKHR create(long address) {
        return wrap(VkPresentRegionKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPresentRegionKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPresentRegionKHR.class, address);
    }

    /**
     * Returns a new {@link VkPresentRegionKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentRegionKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPresentRegionKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentRegionKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPresentRegionKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentRegionKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPresentRegionKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPresentRegionKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPresentRegionKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPresentRegionKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPresentRegionKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPresentRegionKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPresentRegionKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPresentRegionKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPresentRegionKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPresentRegionKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPresentRegionKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPresentRegionKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPresentRegionKHR malloc(MemoryStack stack) {
        return wrap(VkPresentRegionKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPresentRegionKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPresentRegionKHR calloc(MemoryStack stack) {
        return wrap(VkPresentRegionKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPresentRegionKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPresentRegionKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPresentRegionKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPresentRegionKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #rectangleCount}. */
    public static int nrectangleCount(long struct) { return UNSAFE.getInt(null, struct + VkPresentRegionKHR.RECTANGLECOUNT); }
    /** Unsafe version of {@link #pRectangles}. */
    @Nullable public static VkRectLayerKHR.Buffer npRectangles(long struct) { return VkRectLayerKHR.createSafe(memGetAddress(struct + VkPresentRegionKHR.PRECTANGLES), nrectangleCount(struct)); }

    /** Sets the specified value to the {@code rectangleCount} field of the specified {@code struct}. */
    public static void nrectangleCount(long struct, int value) { UNSAFE.putInt(null, struct + VkPresentRegionKHR.RECTANGLECOUNT, value); }
    /** Unsafe version of {@link #pRectangles(VkRectLayerKHR.Buffer) pRectangles}. */
    public static void npRectangles(long struct, @Nullable VkRectLayerKHR.Buffer value) { memPutAddress(struct + VkPresentRegionKHR.PRECTANGLES, memAddressSafe(value)); if (value != null) { nrectangleCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkPresentRegionKHR} structs. */
    public static class Buffer extends StructBuffer<VkPresentRegionKHR, Buffer> implements NativeResource {

        private static final VkPresentRegionKHR ELEMENT_FACTORY = VkPresentRegionKHR.create(-1L);

        /**
         * Creates a new {@code VkPresentRegionKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPresentRegionKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPresentRegionKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPresentRegionKHR#rectangleCount} field. */
        @NativeType("uint32_t")
        public int rectangleCount() { return VkPresentRegionKHR.nrectangleCount(address()); }
        /** @return a {@link VkRectLayerKHR.Buffer} view of the struct array pointed to by the {@link VkPresentRegionKHR#pRectangles} field. */
        @Nullable
        @NativeType("VkRectLayerKHR const *")
        public VkRectLayerKHR.Buffer pRectangles() { return VkPresentRegionKHR.npRectangles(address()); }

        /** Sets the specified value to the {@link VkPresentRegionKHR#rectangleCount} field. */
        public VkPresentRegionKHR.Buffer rectangleCount(@NativeType("uint32_t") int value) { VkPresentRegionKHR.nrectangleCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkRectLayerKHR.Buffer} to the {@link VkPresentRegionKHR#pRectangles} field. */
        public VkPresentRegionKHR.Buffer pRectangles(@Nullable @NativeType("VkRectLayerKHR const *") VkRectLayerKHR.Buffer value) { VkPresentRegionKHR.npRectangles(address(), value); return this; }

    }

}