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
 * Structure specifying a clear value.
 * 
 * <h5>Description</h5>
 * 
 * <p>This union is used where part of the API requires either color or depth/stencil clear values, depending on the attachment, and defines the initial clear values in the {@link VkRenderPassBeginInfo} structure.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkClearAttachment}, {@link VkClearColorValue}, {@link VkClearDepthStencilValue}, {@link VkRenderPassBeginInfo}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code color} &ndash; specifies the color image clear values to use when clearing a color image or attachment.</li>
 * <li>{@code depthStencil} &ndash; specifies the depth and stencil clear values to use when clearing a depth/stencil image or attachment.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * union VkClearValue {
 *     {@link VkClearColorValue VkClearColorValue} color;
 *     {@link VkClearDepthStencilValue VkClearDepthStencilValue} depthStencil;
 * }</code></pre>
 */
public class VkClearValue extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        COLOR,
        DEPTHSTENCIL;

    static {
        Layout layout = __union(
            __member(VkClearColorValue.SIZEOF, VkClearColorValue.ALIGNOF),
            __member(VkClearDepthStencilValue.SIZEOF, VkClearDepthStencilValue.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        COLOR = layout.offsetof(0);
        DEPTHSTENCIL = layout.offsetof(1);
    }

    /**
     * Creates a {@code VkClearValue} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkClearValue(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link VkClearColorValue} view of the {@code color} field. */
    public VkClearColorValue color() { return ncolor(address()); }
    /** Returns a {@link VkClearDepthStencilValue} view of the {@code depthStencil} field. */
    public VkClearDepthStencilValue depthStencil() { return ndepthStencil(address()); }

    /** Copies the specified {@link VkClearColorValue} to the {@code color} field. */
    public VkClearValue color(VkClearColorValue value) { ncolor(address(), value); return this; }
    /** Passes the {@code color} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkClearValue color(java.util.function.Consumer<VkClearColorValue> consumer) { consumer.accept(color()); return this; }
    /** Copies the specified {@link VkClearDepthStencilValue} to the {@code depthStencil} field. */
    public VkClearValue depthStencil(VkClearDepthStencilValue value) { ndepthStencil(address(), value); return this; }
    /** Passes the {@code depthStencil} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkClearValue depthStencil(java.util.function.Consumer<VkClearDepthStencilValue> consumer) { consumer.accept(depthStencil()); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkClearValue set(VkClearValue src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkClearValue} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkClearValue malloc() {
        return wrap(VkClearValue.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkClearValue} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkClearValue calloc() {
        return wrap(VkClearValue.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkClearValue} instance allocated with {@link BufferUtils}. */
    public static VkClearValue create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkClearValue.class, memAddress(container), container);
    }

    /** Returns a new {@code VkClearValue} instance for the specified memory address. */
    public static VkClearValue create(long address) {
        return wrap(VkClearValue.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkClearValue createSafe(long address) {
        return address == NULL ? null : wrap(VkClearValue.class, address);
    }

    /**
     * Returns a new {@link VkClearValue.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkClearValue.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkClearValue.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkClearValue.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkClearValue.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkClearValue.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkClearValue.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkClearValue.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkClearValue.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkClearValue} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkClearValue mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkClearValue} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkClearValue callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkClearValue} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkClearValue mallocStack(MemoryStack stack) {
        return wrap(VkClearValue.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkClearValue} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkClearValue callocStack(MemoryStack stack) {
        return wrap(VkClearValue.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkClearValue.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkClearValue.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkClearValue.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkClearValue.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkClearValue.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkClearValue.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkClearValue.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkClearValue.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #color}. */
    public static VkClearColorValue ncolor(long struct) { return VkClearColorValue.create(struct + VkClearValue.COLOR); }
    /** Unsafe version of {@link #depthStencil}. */
    public static VkClearDepthStencilValue ndepthStencil(long struct) { return VkClearDepthStencilValue.create(struct + VkClearValue.DEPTHSTENCIL); }

    /** Unsafe version of {@link #color(VkClearColorValue) color}. */
    public static void ncolor(long struct, VkClearColorValue value) { memCopy(value.address(), struct + VkClearValue.COLOR, VkClearColorValue.SIZEOF); }
    /** Unsafe version of {@link #depthStencil(VkClearDepthStencilValue) depthStencil}. */
    public static void ndepthStencil(long struct, VkClearDepthStencilValue value) { memCopy(value.address(), struct + VkClearValue.DEPTHSTENCIL, VkClearDepthStencilValue.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkClearValue} structs. */
    public static class Buffer extends StructBuffer<VkClearValue, Buffer> implements NativeResource {

        private static final VkClearValue ELEMENT_FACTORY = VkClearValue.create(-1L);

        /**
         * Creates a new {@code VkClearValue.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkClearValue#SIZEOF}, and its mark will be undefined.
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
        protected VkClearValue getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link VkClearColorValue} view of the {@code color} field. */
        public VkClearColorValue color() { return VkClearValue.ncolor(address()); }
        /** Returns a {@link VkClearDepthStencilValue} view of the {@code depthStencil} field. */
        public VkClearDepthStencilValue depthStencil() { return VkClearValue.ndepthStencil(address()); }

        /** Copies the specified {@link VkClearColorValue} to the {@code color} field. */
        public VkClearValue.Buffer color(VkClearColorValue value) { VkClearValue.ncolor(address(), value); return this; }
        /** Passes the {@code color} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkClearValue.Buffer color(java.util.function.Consumer<VkClearColorValue> consumer) { consumer.accept(color()); return this; }
        /** Copies the specified {@link VkClearDepthStencilValue} to the {@code depthStencil} field. */
        public VkClearValue.Buffer depthStencil(VkClearDepthStencilValue value) { VkClearValue.ndepthStencil(address(), value); return this; }
        /** Passes the {@code depthStencil} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkClearValue.Buffer depthStencil(java.util.function.Consumer<VkClearDepthStencilValue> consumer) { consumer.accept(depthStencil()); return this; }

    }

}