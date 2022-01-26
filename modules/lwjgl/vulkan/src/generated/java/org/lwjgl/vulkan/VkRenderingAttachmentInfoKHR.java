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
 * See {@link VkRenderingAttachmentInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkRenderingAttachmentInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkImageView imageView;
 *     VkImageLayout imageLayout;
 *     VkResolveModeFlagBits resolveMode;
 *     VkImageView resolveImageView;
 *     VkImageLayout resolveImageLayout;
 *     VkAttachmentLoadOp loadOp;
 *     VkAttachmentStoreOp storeOp;
 *     {@link VkClearValue VkClearValue} clearValue;
 * }</code></pre>
 */
public class VkRenderingAttachmentInfoKHR extends VkRenderingAttachmentInfo {

    /**
     * Creates a {@code VkRenderingAttachmentInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRenderingAttachmentInfoKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkRenderingAttachmentInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO} value to the {@code sType} field. */
    @Override
    public VkRenderingAttachmentInfoKHR sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkRenderingAttachmentInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code imageView} field. */
    @Override
    public VkRenderingAttachmentInfoKHR imageView(@NativeType("VkImageView") long value) { nimageView(address(), value); return this; }
    /** Sets the specified value to the {@code imageLayout} field. */
    @Override
    public VkRenderingAttachmentInfoKHR imageLayout(@NativeType("VkImageLayout") int value) { nimageLayout(address(), value); return this; }
    /** Sets the specified value to the {@code resolveMode} field. */
    @Override
    public VkRenderingAttachmentInfoKHR resolveMode(@NativeType("VkResolveModeFlagBits") int value) { nresolveMode(address(), value); return this; }
    /** Sets the specified value to the {@code resolveImageView} field. */
    @Override
    public VkRenderingAttachmentInfoKHR resolveImageView(@NativeType("VkImageView") long value) { nresolveImageView(address(), value); return this; }
    /** Sets the specified value to the {@code resolveImageLayout} field. */
    @Override
    public VkRenderingAttachmentInfoKHR resolveImageLayout(@NativeType("VkImageLayout") int value) { nresolveImageLayout(address(), value); return this; }
    /** Sets the specified value to the {@code loadOp} field. */
    @Override
    public VkRenderingAttachmentInfoKHR loadOp(@NativeType("VkAttachmentLoadOp") int value) { nloadOp(address(), value); return this; }
    /** Sets the specified value to the {@code storeOp} field. */
    @Override
    public VkRenderingAttachmentInfoKHR storeOp(@NativeType("VkAttachmentStoreOp") int value) { nstoreOp(address(), value); return this; }
    /** Copies the specified {@link VkClearValue} to the {@code clearValue} field. */
    @Override
    public VkRenderingAttachmentInfoKHR clearValue(VkClearValue value) { nclearValue(address(), value); return this; }
    /** Passes the {@code clearValue} field to the specified {@link java.util.function.Consumer Consumer}. */
    @Override
    public VkRenderingAttachmentInfoKHR clearValue(java.util.function.Consumer<VkClearValue> consumer) { consumer.accept(clearValue()); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkRenderingAttachmentInfoKHR set(
        int sType,
        long pNext,
        long imageView,
        int imageLayout,
        int resolveMode,
        long resolveImageView,
        int resolveImageLayout,
        int loadOp,
        int storeOp,
        VkClearValue clearValue
    ) {
        sType(sType);
        pNext(pNext);
        imageView(imageView);
        imageLayout(imageLayout);
        resolveMode(resolveMode);
        resolveImageView(resolveImageView);
        resolveImageLayout(resolveImageLayout);
        loadOp(loadOp);
        storeOp(storeOp);
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
    public VkRenderingAttachmentInfoKHR set(VkRenderingAttachmentInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRenderingAttachmentInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRenderingAttachmentInfoKHR malloc() {
        return wrap(VkRenderingAttachmentInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkRenderingAttachmentInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRenderingAttachmentInfoKHR calloc() {
        return wrap(VkRenderingAttachmentInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkRenderingAttachmentInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkRenderingAttachmentInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkRenderingAttachmentInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkRenderingAttachmentInfoKHR} instance for the specified memory address. */
    public static VkRenderingAttachmentInfoKHR create(long address) {
        return wrap(VkRenderingAttachmentInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderingAttachmentInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkRenderingAttachmentInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkRenderingAttachmentInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderingAttachmentInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRenderingAttachmentInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderingAttachmentInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderingAttachmentInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderingAttachmentInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkRenderingAttachmentInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRenderingAttachmentInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderingAttachmentInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkRenderingAttachmentInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderingAttachmentInfoKHR malloc(MemoryStack stack) {
        return wrap(VkRenderingAttachmentInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkRenderingAttachmentInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderingAttachmentInfoKHR calloc(MemoryStack stack) {
        return wrap(VkRenderingAttachmentInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkRenderingAttachmentInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderingAttachmentInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderingAttachmentInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderingAttachmentInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkRenderingAttachmentInfoKHR} structs. */
    public static class Buffer extends VkRenderingAttachmentInfo.Buffer {

        private static final VkRenderingAttachmentInfoKHR ELEMENT_FACTORY = VkRenderingAttachmentInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkRenderingAttachmentInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderingAttachmentInfoKHR#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container);
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
        protected VkRenderingAttachmentInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkRenderingAttachmentInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderingAttachmentInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO} value to the {@code sType} field. */
        @Override
        public VkRenderingAttachmentInfoKHR.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkRenderingAttachmentInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkRenderingAttachmentInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code imageView} field. */
        @Override
        public VkRenderingAttachmentInfoKHR.Buffer imageView(@NativeType("VkImageView") long value) { VkRenderingAttachmentInfoKHR.nimageView(address(), value); return this; }
        /** Sets the specified value to the {@code imageLayout} field. */
        @Override
        public VkRenderingAttachmentInfoKHR.Buffer imageLayout(@NativeType("VkImageLayout") int value) { VkRenderingAttachmentInfoKHR.nimageLayout(address(), value); return this; }
        /** Sets the specified value to the {@code resolveMode} field. */
        @Override
        public VkRenderingAttachmentInfoKHR.Buffer resolveMode(@NativeType("VkResolveModeFlagBits") int value) { VkRenderingAttachmentInfoKHR.nresolveMode(address(), value); return this; }
        /** Sets the specified value to the {@code resolveImageView} field. */
        @Override
        public VkRenderingAttachmentInfoKHR.Buffer resolveImageView(@NativeType("VkImageView") long value) { VkRenderingAttachmentInfoKHR.nresolveImageView(address(), value); return this; }
        /** Sets the specified value to the {@code resolveImageLayout} field. */
        @Override
        public VkRenderingAttachmentInfoKHR.Buffer resolveImageLayout(@NativeType("VkImageLayout") int value) { VkRenderingAttachmentInfoKHR.nresolveImageLayout(address(), value); return this; }
        /** Sets the specified value to the {@code loadOp} field. */
        @Override
        public VkRenderingAttachmentInfoKHR.Buffer loadOp(@NativeType("VkAttachmentLoadOp") int value) { VkRenderingAttachmentInfoKHR.nloadOp(address(), value); return this; }
        /** Sets the specified value to the {@code storeOp} field. */
        @Override
        public VkRenderingAttachmentInfoKHR.Buffer storeOp(@NativeType("VkAttachmentStoreOp") int value) { VkRenderingAttachmentInfoKHR.nstoreOp(address(), value); return this; }
        /** Copies the specified {@link VkClearValue} to the {@code clearValue} field. */
        @Override
        public VkRenderingAttachmentInfoKHR.Buffer clearValue(VkClearValue value) { VkRenderingAttachmentInfoKHR.nclearValue(address(), value); return this; }
        /** Passes the {@code clearValue} field to the specified {@link java.util.function.Consumer Consumer}. */
        @Override
        public VkRenderingAttachmentInfoKHR.Buffer clearValue(java.util.function.Consumer<VkClearValue> consumer) { consumer.accept(clearValue()); return this; }

    }

}