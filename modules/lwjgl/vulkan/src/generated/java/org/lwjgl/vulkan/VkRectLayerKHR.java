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
 * Structure containing a rectangle, including layer, changed by vkQueuePresentKHR for a given VkImage.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The sum of {@code offset} and {@code extent} <b>must</b> be no greater than the {@code imageExtent} member of the {@link VkSwapchainCreateInfoKHR} structure given to {@link KHRSwapchain#vkCreateSwapchainKHR CreateSwapchainKHR}.</li>
 * <li>{@code layer} <b>must</b> be less than {@code imageArrayLayers} member of the {@link VkSwapchainCreateInfoKHR} structure given to {@link KHRSwapchain#vkCreateSwapchainKHR CreateSwapchainKHR}.</li>
 * </ul>
 * 
 * <p>Some platforms allow the size of a surface to change, and then scale the pixels of the image to fit the surface. {@link VkRectLayerKHR} specifies pixels of the swapchain's image(s), which will be constant for the life of the swapchain.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtent2D}, {@link VkOffset2D}, {@link VkPresentRegionKHR}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code offset} &ndash; the origin of the rectangle, in pixels.</li>
 * <li>{@code extent} &ndash; the size of the rectangle, in pixels.</li>
 * <li>{@code layer} &ndash; the layer of the image. For images with only one layer, the value of {@code layer} <b>must</b> be 0.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkRectLayerKHR {
 *     {@link VkOffset2D VkOffset2D} offset;
 *     {@link VkExtent2D VkExtent2D} extent;
 *     uint32_t layer;
 * }</code></pre>
 */
public class VkRectLayerKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        OFFSET,
        EXTENT,
        LAYER;

    static {
        Layout layout = __struct(
            __member(VkOffset2D.SIZEOF, VkOffset2D.ALIGNOF),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        OFFSET = layout.offsetof(0);
        EXTENT = layout.offsetof(1);
        LAYER = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkRectLayerKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRectLayerKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link VkOffset2D} view of the {@code offset} field. */
    public VkOffset2D offset() { return noffset(address()); }
    /** Returns a {@link VkExtent2D} view of the {@code extent} field. */
    public VkExtent2D extent() { return nextent(address()); }
    /** Returns the value of the {@code layer} field. */
    @NativeType("uint32_t")
    public int layer() { return nlayer(address()); }

    /** Copies the specified {@link VkOffset2D} to the {@code offset} field. */
    public VkRectLayerKHR offset(VkOffset2D value) { noffset(address(), value); return this; }
    /** Passes the {@code offset} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkRectLayerKHR offset(java.util.function.Consumer<VkOffset2D> consumer) { consumer.accept(offset()); return this; }
    /** Copies the specified {@link VkExtent2D} to the {@code extent} field. */
    public VkRectLayerKHR extent(VkExtent2D value) { nextent(address(), value); return this; }
    /** Passes the {@code extent} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkRectLayerKHR extent(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(extent()); return this; }
    /** Sets the specified value to the {@code layer} field. */
    public VkRectLayerKHR layer(@NativeType("uint32_t") int value) { nlayer(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkRectLayerKHR set(
        VkOffset2D offset,
        VkExtent2D extent,
        int layer
    ) {
        offset(offset);
        extent(extent);
        layer(layer);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRectLayerKHR set(VkRectLayerKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRectLayerKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRectLayerKHR malloc() {
        return wrap(VkRectLayerKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkRectLayerKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRectLayerKHR calloc() {
        return wrap(VkRectLayerKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkRectLayerKHR} instance allocated with {@link BufferUtils}. */
    public static VkRectLayerKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkRectLayerKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkRectLayerKHR} instance for the specified memory address. */
    public static VkRectLayerKHR create(long address) {
        return wrap(VkRectLayerKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRectLayerKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkRectLayerKHR.class, address);
    }

    /**
     * Returns a new {@link VkRectLayerKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRectLayerKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRectLayerKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRectLayerKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRectLayerKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRectLayerKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkRectLayerKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRectLayerKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRectLayerKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkRectLayerKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkRectLayerKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkRectLayerKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkRectLayerKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkRectLayerKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRectLayerKHR mallocStack(MemoryStack stack) {
        return wrap(VkRectLayerKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkRectLayerKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRectLayerKHR callocStack(MemoryStack stack) {
        return wrap(VkRectLayerKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkRectLayerKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRectLayerKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkRectLayerKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkRectLayerKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkRectLayerKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRectLayerKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRectLayerKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRectLayerKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #offset}. */
    public static VkOffset2D noffset(long struct) { return VkOffset2D.create(struct + VkRectLayerKHR.OFFSET); }
    /** Unsafe version of {@link #extent}. */
    public static VkExtent2D nextent(long struct) { return VkExtent2D.create(struct + VkRectLayerKHR.EXTENT); }
    /** Unsafe version of {@link #layer}. */
    public static int nlayer(long struct) { return UNSAFE.getInt(null, struct + VkRectLayerKHR.LAYER); }

    /** Unsafe version of {@link #offset(VkOffset2D) offset}. */
    public static void noffset(long struct, VkOffset2D value) { memCopy(value.address(), struct + VkRectLayerKHR.OFFSET, VkOffset2D.SIZEOF); }
    /** Unsafe version of {@link #extent(VkExtent2D) extent}. */
    public static void nextent(long struct, VkExtent2D value) { memCopy(value.address(), struct + VkRectLayerKHR.EXTENT, VkExtent2D.SIZEOF); }
    /** Unsafe version of {@link #layer(int) layer}. */
    public static void nlayer(long struct, int value) { UNSAFE.putInt(null, struct + VkRectLayerKHR.LAYER, value); }

    // -----------------------------------

    /** An array of {@link VkRectLayerKHR} structs. */
    public static class Buffer extends StructBuffer<VkRectLayerKHR, Buffer> implements NativeResource {

        private static final VkRectLayerKHR ELEMENT_FACTORY = VkRectLayerKHR.create(-1L);

        /**
         * Creates a new {@code VkRectLayerKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRectLayerKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkRectLayerKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link VkOffset2D} view of the {@code offset} field. */
        public VkOffset2D offset() { return VkRectLayerKHR.noffset(address()); }
        /** Returns a {@link VkExtent2D} view of the {@code extent} field. */
        public VkExtent2D extent() { return VkRectLayerKHR.nextent(address()); }
        /** Returns the value of the {@code layer} field. */
        @NativeType("uint32_t")
        public int layer() { return VkRectLayerKHR.nlayer(address()); }

        /** Copies the specified {@link VkOffset2D} to the {@code offset} field. */
        public VkRectLayerKHR.Buffer offset(VkOffset2D value) { VkRectLayerKHR.noffset(address(), value); return this; }
        /** Passes the {@code offset} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkRectLayerKHR.Buffer offset(java.util.function.Consumer<VkOffset2D> consumer) { consumer.accept(offset()); return this; }
        /** Copies the specified {@link VkExtent2D} to the {@code extent} field. */
        public VkRectLayerKHR.Buffer extent(VkExtent2D value) { VkRectLayerKHR.nextent(address(), value); return this; }
        /** Passes the {@code extent} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkRectLayerKHR.Buffer extent(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(extent()); return this; }
        /** Sets the specified value to the {@code layer} field. */
        public VkRectLayerKHR.Buffer layer(@NativeType("uint32_t") int value) { VkRectLayerKHR.nlayer(address(), value); return this; }

    }

}