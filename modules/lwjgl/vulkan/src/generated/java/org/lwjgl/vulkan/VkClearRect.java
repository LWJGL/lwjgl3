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
 * Structure specifying a clear rectangle.
 * 
 * <h5>Description</h5>
 * 
 * <p>The layers <code>[baseArrayLayer, baseArrayLayer + layerCount)</code> counting from the base layer of the attachment image view are cleared.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkRect2D}, {@link VK10#vkCmdClearAttachments CmdClearAttachments}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code rect} &ndash; the two-dimensional region to be cleared.</li>
 * <li>{@code baseArrayLayer} &ndash; the first layer to be cleared.</li>
 * <li>{@code layerCount} &ndash; the number of layers to clear.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkClearRect {
 *     {@link VkRect2D VkRect2D} rect;
 *     uint32_t baseArrayLayer;
 *     uint32_t layerCount;
 * }</code></pre>
 */
public class VkClearRect extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        RECT,
        BASEARRAYLAYER,
        LAYERCOUNT;

    static {
        Layout layout = __struct(
            __member(VkRect2D.SIZEOF, VkRect2D.ALIGNOF),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        RECT = layout.offsetof(0);
        BASEARRAYLAYER = layout.offsetof(1);
        LAYERCOUNT = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkClearRect} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkClearRect(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link VkRect2D} view of the {@code rect} field. */
    public VkRect2D rect() { return nrect(address()); }
    /** Returns the value of the {@code baseArrayLayer} field. */
    @NativeType("uint32_t")
    public int baseArrayLayer() { return nbaseArrayLayer(address()); }
    /** Returns the value of the {@code layerCount} field. */
    @NativeType("uint32_t")
    public int layerCount() { return nlayerCount(address()); }

    /** Copies the specified {@link VkRect2D} to the {@code rect} field. */
    public VkClearRect rect(VkRect2D value) { nrect(address(), value); return this; }
    /** Passes the {@code rect} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkClearRect rect(java.util.function.Consumer<VkRect2D> consumer) { consumer.accept(rect()); return this; }
    /** Sets the specified value to the {@code baseArrayLayer} field. */
    public VkClearRect baseArrayLayer(@NativeType("uint32_t") int value) { nbaseArrayLayer(address(), value); return this; }
    /** Sets the specified value to the {@code layerCount} field. */
    public VkClearRect layerCount(@NativeType("uint32_t") int value) { nlayerCount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkClearRect set(
        VkRect2D rect,
        int baseArrayLayer,
        int layerCount
    ) {
        rect(rect);
        baseArrayLayer(baseArrayLayer);
        layerCount(layerCount);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkClearRect set(VkClearRect src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkClearRect} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkClearRect malloc() {
        return wrap(VkClearRect.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkClearRect} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkClearRect calloc() {
        return wrap(VkClearRect.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkClearRect} instance allocated with {@link BufferUtils}. */
    public static VkClearRect create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkClearRect.class, memAddress(container), container);
    }

    /** Returns a new {@code VkClearRect} instance for the specified memory address. */
    public static VkClearRect create(long address) {
        return wrap(VkClearRect.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkClearRect createSafe(long address) {
        return address == NULL ? null : wrap(VkClearRect.class, address);
    }

    /**
     * Returns a new {@link VkClearRect.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkClearRect.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkClearRect.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkClearRect.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkClearRect.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkClearRect.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkClearRect.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkClearRect.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkClearRect.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkClearRect} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkClearRect mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkClearRect} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkClearRect callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkClearRect} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkClearRect mallocStack(MemoryStack stack) {
        return wrap(VkClearRect.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkClearRect} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkClearRect callocStack(MemoryStack stack) {
        return wrap(VkClearRect.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkClearRect.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkClearRect.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkClearRect.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkClearRect.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkClearRect.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkClearRect.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkClearRect.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkClearRect.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #rect}. */
    public static VkRect2D nrect(long struct) { return VkRect2D.create(struct + VkClearRect.RECT); }
    /** Unsafe version of {@link #baseArrayLayer}. */
    public static int nbaseArrayLayer(long struct) { return UNSAFE.getInt(null, struct + VkClearRect.BASEARRAYLAYER); }
    /** Unsafe version of {@link #layerCount}. */
    public static int nlayerCount(long struct) { return UNSAFE.getInt(null, struct + VkClearRect.LAYERCOUNT); }

    /** Unsafe version of {@link #rect(VkRect2D) rect}. */
    public static void nrect(long struct, VkRect2D value) { memCopy(value.address(), struct + VkClearRect.RECT, VkRect2D.SIZEOF); }
    /** Unsafe version of {@link #baseArrayLayer(int) baseArrayLayer}. */
    public static void nbaseArrayLayer(long struct, int value) { UNSAFE.putInt(null, struct + VkClearRect.BASEARRAYLAYER, value); }
    /** Unsafe version of {@link #layerCount(int) layerCount}. */
    public static void nlayerCount(long struct, int value) { UNSAFE.putInt(null, struct + VkClearRect.LAYERCOUNT, value); }

    // -----------------------------------

    /** An array of {@link VkClearRect} structs. */
    public static class Buffer extends StructBuffer<VkClearRect, Buffer> implements NativeResource {

        private static final VkClearRect ELEMENT_FACTORY = VkClearRect.create(-1L);

        /**
         * Creates a new {@code VkClearRect.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkClearRect#SIZEOF}, and its mark will be undefined.
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
        protected VkClearRect getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link VkRect2D} view of the {@code rect} field. */
        public VkRect2D rect() { return VkClearRect.nrect(address()); }
        /** Returns the value of the {@code baseArrayLayer} field. */
        @NativeType("uint32_t")
        public int baseArrayLayer() { return VkClearRect.nbaseArrayLayer(address()); }
        /** Returns the value of the {@code layerCount} field. */
        @NativeType("uint32_t")
        public int layerCount() { return VkClearRect.nlayerCount(address()); }

        /** Copies the specified {@link VkRect2D} to the {@code rect} field. */
        public VkClearRect.Buffer rect(VkRect2D value) { VkClearRect.nrect(address(), value); return this; }
        /** Passes the {@code rect} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkClearRect.Buffer rect(java.util.function.Consumer<VkRect2D> consumer) { consumer.accept(rect()); return this; }
        /** Sets the specified value to the {@code baseArrayLayer} field. */
        public VkClearRect.Buffer baseArrayLayer(@NativeType("uint32_t") int value) { VkClearRect.nbaseArrayLayer(address(), value); return this; }
        /** Sets the specified value to the {@code layerCount} field. */
        public VkClearRect.Buffer layerCount(@NativeType("uint32_t") int value) { VkClearRect.nlayerCount(address(), value); return this; }

    }

}