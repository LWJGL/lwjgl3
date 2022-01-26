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
 * Structure specifying a clear attachment.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code aspectMask} includes {@link VK10#VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT}, it <b>must</b> not include {@link VK10#VK_IMAGE_ASPECT_DEPTH_BIT IMAGE_ASPECT_DEPTH_BIT} or {@link VK10#VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT}</li>
 * <li>{@code aspectMask} <b>must</b> not include {@link VK10#VK_IMAGE_ASPECT_METADATA_BIT IMAGE_ASPECT_METADATA_BIT}</li>
 * <li>{@code aspectMask} <b>must</b> not include <code>VK_IMAGE_ASPECT_MEMORY_PLANE<em>_i_</em>BIT_EXT</code> for any index <em>i</em></li>
 * <li>{@code clearValue} <b>must</b> be a valid {@link VkClearValue} union</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code aspectMask} <b>must</b> be a valid combination of {@code VkImageAspectFlagBits} values</li>
 * <li>{@code aspectMask} <b>must</b> not be 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkClearValue}, {@link VK10#vkCmdClearAttachments CmdClearAttachments}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkClearAttachment {
 *     VkImageAspectFlags {@link #aspectMask};
 *     uint32_t {@link #colorAttachment};
 *     {@link VkClearValue VkClearValue} {@link #clearValue};
 * }</code></pre>
 */
public class VkClearAttachment extends Struct implements NativeResource {

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

    /** a mask selecting the color, depth and/or stencil aspects of the attachment to be cleared. */
    @NativeType("VkImageAspectFlags")
    public int aspectMask() { return naspectMask(address()); }
    /** only meaningful if {@link VK10#VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT} is set in {@code aspectMask}, in which case it is an index into the currently bound color attachments. */
    @NativeType("uint32_t")
    public int colorAttachment() { return ncolorAttachment(address()); }
    /** the color or depth/stencil value to clear the attachment to, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#clears-values">Clear Values</a> below. */
    public VkClearValue clearValue() { return nclearValue(address()); }

    /** Sets the specified value to the {@link #aspectMask} field. */
    public VkClearAttachment aspectMask(@NativeType("VkImageAspectFlags") int value) { naspectMask(address(), value); return this; }
    /** Sets the specified value to the {@link #colorAttachment} field. */
    public VkClearAttachment colorAttachment(@NativeType("uint32_t") int value) { ncolorAttachment(address(), value); return this; }
    /** Copies the specified {@link VkClearValue} to the {@link #clearValue} field. */
    public VkClearAttachment clearValue(VkClearValue value) { nclearValue(address(), value); return this; }
    /** Passes the {@link #clearValue} field to the specified {@link java.util.function.Consumer Consumer}. */
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
        return wrap(VkClearAttachment.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkClearAttachment} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkClearAttachment calloc() {
        return wrap(VkClearAttachment.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkClearAttachment} instance allocated with {@link BufferUtils}. */
    public static VkClearAttachment create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkClearAttachment.class, memAddress(container), container);
    }

    /** Returns a new {@code VkClearAttachment} instance for the specified memory address. */
    public static VkClearAttachment create(long address) {
        return wrap(VkClearAttachment.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkClearAttachment createSafe(long address) {
        return address == NULL ? null : wrap(VkClearAttachment.class, address);
    }

    /**
     * Returns a new {@link VkClearAttachment.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkClearAttachment.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkClearAttachment.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkClearAttachment.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkClearAttachment.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkClearAttachment.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkClearAttachment.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkClearAttachment.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkClearAttachment.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
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
        return wrap(VkClearAttachment.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkClearAttachment} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkClearAttachment calloc(MemoryStack stack) {
        return wrap(VkClearAttachment.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkClearAttachment.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkClearAttachment.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkClearAttachment.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkClearAttachment.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #aspectMask}. */
    public static int naspectMask(long struct) { return UNSAFE.getInt(null, struct + VkClearAttachment.ASPECTMASK); }
    /** Unsafe version of {@link #colorAttachment}. */
    public static int ncolorAttachment(long struct) { return UNSAFE.getInt(null, struct + VkClearAttachment.COLORATTACHMENT); }
    /** Unsafe version of {@link #clearValue}. */
    public static VkClearValue nclearValue(long struct) { return VkClearValue.create(struct + VkClearAttachment.CLEARVALUE); }

    /** Unsafe version of {@link #aspectMask(int) aspectMask}. */
    public static void naspectMask(long struct, int value) { UNSAFE.putInt(null, struct + VkClearAttachment.ASPECTMASK, value); }
    /** Unsafe version of {@link #colorAttachment(int) colorAttachment}. */
    public static void ncolorAttachment(long struct, int value) { UNSAFE.putInt(null, struct + VkClearAttachment.COLORATTACHMENT, value); }
    /** Unsafe version of {@link #clearValue(VkClearValue) clearValue}. */
    public static void nclearValue(long struct, VkClearValue value) { memCopy(value.address(), struct + VkClearAttachment.CLEARVALUE, VkClearValue.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkClearAttachment} structs. */
    public static class Buffer extends StructBuffer<VkClearAttachment, Buffer> implements NativeResource {

        private static final VkClearAttachment ELEMENT_FACTORY = VkClearAttachment.create(-1L);

        /**
         * Creates a new {@code VkClearAttachment.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkClearAttachment#SIZEOF}, and its mark will be undefined.
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
        protected VkClearAttachment getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkClearAttachment#aspectMask} field. */
        @NativeType("VkImageAspectFlags")
        public int aspectMask() { return VkClearAttachment.naspectMask(address()); }
        /** @return the value of the {@link VkClearAttachment#colorAttachment} field. */
        @NativeType("uint32_t")
        public int colorAttachment() { return VkClearAttachment.ncolorAttachment(address()); }
        /** @return a {@link VkClearValue} view of the {@link VkClearAttachment#clearValue} field. */
        public VkClearValue clearValue() { return VkClearAttachment.nclearValue(address()); }

        /** Sets the specified value to the {@link VkClearAttachment#aspectMask} field. */
        public VkClearAttachment.Buffer aspectMask(@NativeType("VkImageAspectFlags") int value) { VkClearAttachment.naspectMask(address(), value); return this; }
        /** Sets the specified value to the {@link VkClearAttachment#colorAttachment} field. */
        public VkClearAttachment.Buffer colorAttachment(@NativeType("uint32_t") int value) { VkClearAttachment.ncolorAttachment(address(), value); return this; }
        /** Copies the specified {@link VkClearValue} to the {@link VkClearAttachment#clearValue} field. */
        public VkClearAttachment.Buffer clearValue(VkClearValue value) { VkClearAttachment.nclearValue(address(), value); return this; }
        /** Passes the {@link VkClearAttachment#clearValue} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkClearAttachment.Buffer clearValue(java.util.function.Consumer<VkClearValue> consumer) { consumer.accept(clearValue()); return this; }

    }

}