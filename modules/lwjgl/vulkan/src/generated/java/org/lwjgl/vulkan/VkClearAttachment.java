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
 * <pre><code>
 * struct VkClearAttachment {
 *     VkImageAspectFlags aspectMask;
 *     uint32_t colorAttachment;
 *     {@link VkClearValue VkClearValue} clearValue;
 * }</code></pre>
 */
public class VkClearAttachment extends Struct<VkClearAttachment> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ASPECTMASK,
        COLORATTACHMENT,
        CLEARVALUE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(VkClearValue.SIZEOF, VkClearValue.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ASPECTMASK = layout.offsetof(0);
        COLORATTACHMENT = layout.offsetof(1);
        CLEARVALUE = layout.offsetof(2);
    }

    protected VkClearAttachment(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkClearAttachment create(long address, @Nullable ByteBuffer container) {
        return new VkClearAttachment(address, container);
    }

    /**
     * Creates a {@code VkClearAttachment} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkClearAttachment(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code aspectMask} field. */
    @NativeType("VkImageAspectFlags")
    public int aspectMask() { return naspectMask(address()); }
    /** @return the value of the {@code colorAttachment} field. */
    @NativeType("uint32_t")
    public int colorAttachment() { return ncolorAttachment(address()); }
    /** @return a {@link VkClearValue} view of the {@code clearValue} field. */
    public VkClearValue clearValue() { return nclearValue(address()); }

    /** Sets the specified value to the {@code aspectMask} field. */
    public VkClearAttachment aspectMask(@NativeType("VkImageAspectFlags") int value) { naspectMask(address(), value); return this; }
    /** Sets the specified value to the {@code colorAttachment} field. */
    public VkClearAttachment colorAttachment(@NativeType("uint32_t") int value) { ncolorAttachment(address(), value); return this; }
    /** Copies the specified {@link VkClearValue} to the {@code clearValue} field. */
    public VkClearAttachment clearValue(VkClearValue value) { nclearValue(address(), value); return this; }
    /** Passes the {@code clearValue} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkClearAttachment clearValue(java.util.function.Consumer<VkClearValue> consumer) { consumer.accept(clearValue()); return this; }

    /** Initializes this struct with the specified values. */
    public VkClearAttachment set(
        int aspectMask,
        int colorAttachment,
        VkClearValue clearValue
    ) {
        aspectMask(aspectMask);
        colorAttachment(colorAttachment);
        clearValue(clearValue);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkClearAttachment set(VkClearAttachment src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkClearAttachment} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkClearAttachment malloc() {
        return new VkClearAttachment(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkClearAttachment} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkClearAttachment calloc() {
        return new VkClearAttachment(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkClearAttachment} instance allocated with {@link BufferUtils}. */
    public static VkClearAttachment create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkClearAttachment(memAddress(container), container);
    }

    /** Returns a new {@code VkClearAttachment} instance for the specified memory address. */
    public static VkClearAttachment create(long address) {
        return new VkClearAttachment(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkClearAttachment createSafe(long address) {
        return address == NULL ? null : new VkClearAttachment(address, null);
    }

    /**
     * Returns a new {@link VkClearAttachment.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkClearAttachment.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkClearAttachment.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkClearAttachment.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkClearAttachment.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkClearAttachment.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkClearAttachment.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkClearAttachment.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkClearAttachment.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkClearAttachment mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkClearAttachment callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkClearAttachment mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkClearAttachment callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkClearAttachment.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkClearAttachment.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkClearAttachment.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkClearAttachment.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkClearAttachment} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkClearAttachment malloc(MemoryStack stack) {
        return new VkClearAttachment(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkClearAttachment} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkClearAttachment calloc(MemoryStack stack) {
        return new VkClearAttachment(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkClearAttachment.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkClearAttachment.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkClearAttachment.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkClearAttachment.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #aspectMask}. */
    public static int naspectMask(long struct) { return memGetInt(struct + VkClearAttachment.ASPECTMASK); }
    /** Unsafe version of {@link #colorAttachment}. */
    public static int ncolorAttachment(long struct) { return memGetInt(struct + VkClearAttachment.COLORATTACHMENT); }
    /** Unsafe version of {@link #clearValue}. */
    public static VkClearValue nclearValue(long struct) { return VkClearValue.create(struct + VkClearAttachment.CLEARVALUE); }

    /** Unsafe version of {@link #aspectMask(int) aspectMask}. */
    public static void naspectMask(long struct, int value) { memPutInt(struct + VkClearAttachment.ASPECTMASK, value); }
    /** Unsafe version of {@link #colorAttachment(int) colorAttachment}. */
    public static void ncolorAttachment(long struct, int value) { memPutInt(struct + VkClearAttachment.COLORATTACHMENT, value); }
    /** Unsafe version of {@link #clearValue(VkClearValue) clearValue}. */
    public static void nclearValue(long struct, VkClearValue value) { memCopy(value.address(), struct + VkClearAttachment.CLEARVALUE, VkClearValue.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkClearAttachment} structs. */
    public static class Buffer extends StructBuffer<VkClearAttachment, Buffer> implements NativeResource {

        private static final VkClearAttachment ELEMENT_FACTORY = VkClearAttachment.create(-1L);

        /**
         * Creates a new {@code VkClearAttachment.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkClearAttachment#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkClearAttachment getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code aspectMask} field. */
        @NativeType("VkImageAspectFlags")
        public int aspectMask() { return VkClearAttachment.naspectMask(address()); }
        /** @return the value of the {@code colorAttachment} field. */
        @NativeType("uint32_t")
        public int colorAttachment() { return VkClearAttachment.ncolorAttachment(address()); }
        /** @return a {@link VkClearValue} view of the {@code clearValue} field. */
        public VkClearValue clearValue() { return VkClearAttachment.nclearValue(address()); }

        /** Sets the specified value to the {@code aspectMask} field. */
        public VkClearAttachment.Buffer aspectMask(@NativeType("VkImageAspectFlags") int value) { VkClearAttachment.naspectMask(address(), value); return this; }
        /** Sets the specified value to the {@code colorAttachment} field. */
        public VkClearAttachment.Buffer colorAttachment(@NativeType("uint32_t") int value) { VkClearAttachment.ncolorAttachment(address(), value); return this; }
        /** Copies the specified {@link VkClearValue} to the {@code clearValue} field. */
        public VkClearAttachment.Buffer clearValue(VkClearValue value) { VkClearAttachment.nclearValue(address(), value); return this; }
        /** Passes the {@code clearValue} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkClearAttachment.Buffer clearValue(java.util.function.Consumer<VkClearValue> consumer) { consumer.accept(clearValue()); return this; }

    }

}