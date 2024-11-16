/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying a two-dimensional subregion.
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkBindImageMemoryDeviceGroupInfo}, {@link VkClearRect}, {@link VkCommandBufferInheritanceRenderPassTransformInfoQCOM}, {@link VkDeviceGroupRenderPassBeginInfo}, {@link VkDisplayPresentInfoKHR}, {@link VkExtent2D}, {@link VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM}, {@link VkOffset2D}, {@link VkOpticalFlowExecuteInfoNV}, {@link VkPipelineDiscardRectangleStateCreateInfoEXT}, {@link VkPipelineViewportExclusiveScissorStateCreateInfoNV}, {@link VkPipelineViewportStateCreateInfo}, {@link VkRenderPassBeginInfo}, {@link VkRenderPassStripeInfoARM}, {@link VkRenderingInfo}, {@link EXTDiscardRectangles#vkCmdSetDiscardRectangleEXT CmdSetDiscardRectangleEXT}, {@link NVScissorExclusive#vkCmdSetExclusiveScissorNV CmdSetExclusiveScissorNV}, {@link VK10#vkCmdSetScissor CmdSetScissor}, {@link VK13#vkCmdSetScissorWithCount CmdSetScissorWithCount}, {@link EXTShaderObject#vkCmdSetScissorWithCountEXT CmdSetScissorWithCountEXT}, {@link KHRSwapchain#vkGetPhysicalDevicePresentRectanglesKHR GetPhysicalDevicePresentRectanglesKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkRect2D {
 *     {@link VkOffset2D VkOffset2D} {@link #offset};
 *     {@link VkExtent2D VkExtent2D} {@link #extent};
 * }</code></pre>
 */
public class VkRect2D extends Struct<VkRect2D> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        OFFSET,
        EXTENT;

    static {
        Layout layout = __struct(
            __member(VkOffset2D.SIZEOF, VkOffset2D.ALIGNOF),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        OFFSET = layout.offsetof(0);
        EXTENT = layout.offsetof(1);
    }

    protected VkRect2D(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkRect2D create(long address, @Nullable ByteBuffer container) {
        return new VkRect2D(address, container);
    }

    /**
     * Creates a {@code VkRect2D} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRect2D(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@link VkOffset2D} specifying the rectangle offset. */
    public VkOffset2D offset() { return noffset(address()); }
    /** a {@link VkExtent2D} specifying the rectangle extent. */
    public VkExtent2D extent() { return nextent(address()); }

    /** Copies the specified {@link VkOffset2D} to the {@link #offset} field. */
    public VkRect2D offset(VkOffset2D value) { noffset(address(), value); return this; }
    /** Passes the {@link #offset} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkRect2D offset(java.util.function.Consumer<VkOffset2D> consumer) { consumer.accept(offset()); return this; }
    /** Copies the specified {@link VkExtent2D} to the {@link #extent} field. */
    public VkRect2D extent(VkExtent2D value) { nextent(address(), value); return this; }
    /** Passes the {@link #extent} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkRect2D extent(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(extent()); return this; }

    /** Initializes this struct with the specified values. */
    public VkRect2D set(
        VkOffset2D offset,
        VkExtent2D extent
    ) {
        offset(offset);
        extent(extent);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRect2D set(VkRect2D src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRect2D} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRect2D malloc() {
        return new VkRect2D(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkRect2D} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRect2D calloc() {
        return new VkRect2D(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkRect2D} instance allocated with {@link BufferUtils}. */
    public static VkRect2D create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRect2D(memAddress(container), container);
    }

    /** Returns a new {@code VkRect2D} instance for the specified memory address. */
    public static VkRect2D create(long address) {
        return new VkRect2D(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkRect2D createSafe(long address) {
        return address == NULL ? null : new VkRect2D(address, null);
    }

    /**
     * Returns a new {@link VkRect2D.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRect2D.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRect2D.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRect2D.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRect2D.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRect2D.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkRect2D.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRect2D.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkRect2D.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkRect2D mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkRect2D callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkRect2D mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkRect2D callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRect2D.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRect2D.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRect2D.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRect2D.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkRect2D} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRect2D malloc(MemoryStack stack) {
        return new VkRect2D(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkRect2D} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRect2D calloc(MemoryStack stack) {
        return new VkRect2D(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkRect2D.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRect2D.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRect2D.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRect2D.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #offset}. */
    public static VkOffset2D noffset(long struct) { return VkOffset2D.create(struct + VkRect2D.OFFSET); }
    /** Unsafe version of {@link #extent}. */
    public static VkExtent2D nextent(long struct) { return VkExtent2D.create(struct + VkRect2D.EXTENT); }

    /** Unsafe version of {@link #offset(VkOffset2D) offset}. */
    public static void noffset(long struct, VkOffset2D value) { memCopy(value.address(), struct + VkRect2D.OFFSET, VkOffset2D.SIZEOF); }
    /** Unsafe version of {@link #extent(VkExtent2D) extent}. */
    public static void nextent(long struct, VkExtent2D value) { memCopy(value.address(), struct + VkRect2D.EXTENT, VkExtent2D.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkRect2D} structs. */
    public static class Buffer extends StructBuffer<VkRect2D, Buffer> implements NativeResource {

        private static final VkRect2D ELEMENT_FACTORY = VkRect2D.create(-1L);

        /**
         * Creates a new {@code VkRect2D.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRect2D#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkRect2D getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link VkOffset2D} view of the {@link VkRect2D#offset} field. */
        public VkOffset2D offset() { return VkRect2D.noffset(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkRect2D#extent} field. */
        public VkExtent2D extent() { return VkRect2D.nextent(address()); }

        /** Copies the specified {@link VkOffset2D} to the {@link VkRect2D#offset} field. */
        public VkRect2D.Buffer offset(VkOffset2D value) { VkRect2D.noffset(address(), value); return this; }
        /** Passes the {@link VkRect2D#offset} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkRect2D.Buffer offset(java.util.function.Consumer<VkOffset2D> consumer) { consumer.accept(offset()); return this; }
        /** Copies the specified {@link VkExtent2D} to the {@link VkRect2D#extent} field. */
        public VkRect2D.Buffer extent(VkExtent2D value) { VkRect2D.nextent(address(), value); return this; }
        /** Passes the {@link VkRect2D#extent} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkRect2D.Buffer extent(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(extent()); return this; }

    }

}