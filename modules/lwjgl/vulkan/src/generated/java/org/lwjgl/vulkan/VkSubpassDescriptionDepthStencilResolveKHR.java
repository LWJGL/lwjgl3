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
 * See {@link VkSubpassDescriptionDepthStencilResolve}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSubpassDescriptionDepthStencilResolveKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkResolveModeFlagBits depthResolveMode;
 *     VkResolveModeFlagBits stencilResolveMode;
 *     {@link VkAttachmentReference2 VkAttachmentReference2} const * pDepthStencilResolveAttachment;
 * }</code></pre>
 */
public class VkSubpassDescriptionDepthStencilResolveKHR extends VkSubpassDescriptionDepthStencilResolve {

    /**
     * Creates a {@code VkSubpassDescriptionDepthStencilResolveKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSubpassDescriptionDepthStencilResolveKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkSubpassDescriptionDepthStencilResolveKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE STRUCTURE_TYPE_SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE} value to the {@code sType} field. */
    @Override
    public VkSubpassDescriptionDepthStencilResolveKHR sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkSubpassDescriptionDepthStencilResolveKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code depthResolveMode} field. */
    @Override
    public VkSubpassDescriptionDepthStencilResolveKHR depthResolveMode(@NativeType("VkResolveModeFlagBits") int value) { ndepthResolveMode(address(), value); return this; }
    /** Sets the specified value to the {@code stencilResolveMode} field. */
    @Override
    public VkSubpassDescriptionDepthStencilResolveKHR stencilResolveMode(@NativeType("VkResolveModeFlagBits") int value) { nstencilResolveMode(address(), value); return this; }
    /** Sets the address of the specified {@link VkAttachmentReference2} to the {@code pDepthStencilResolveAttachment} field. */
    @Override
    public VkSubpassDescriptionDepthStencilResolveKHR pDepthStencilResolveAttachment(@Nullable @NativeType("VkAttachmentReference2 const *") VkAttachmentReference2 value) { npDepthStencilResolveAttachment(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkSubpassDescriptionDepthStencilResolveKHR set(
        int sType,
        long pNext,
        int depthResolveMode,
        int stencilResolveMode,
        @Nullable VkAttachmentReference2 pDepthStencilResolveAttachment
    ) {
        sType(sType);
        pNext(pNext);
        depthResolveMode(depthResolveMode);
        stencilResolveMode(stencilResolveMode);
        pDepthStencilResolveAttachment(pDepthStencilResolveAttachment);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSubpassDescriptionDepthStencilResolveKHR set(VkSubpassDescriptionDepthStencilResolveKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSubpassDescriptionDepthStencilResolveKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSubpassDescriptionDepthStencilResolveKHR malloc() {
        return wrap(VkSubpassDescriptionDepthStencilResolveKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSubpassDescriptionDepthStencilResolveKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSubpassDescriptionDepthStencilResolveKHR calloc() {
        return wrap(VkSubpassDescriptionDepthStencilResolveKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSubpassDescriptionDepthStencilResolveKHR} instance allocated with {@link BufferUtils}. */
    public static VkSubpassDescriptionDepthStencilResolveKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSubpassDescriptionDepthStencilResolveKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSubpassDescriptionDepthStencilResolveKHR} instance for the specified memory address. */
    public static VkSubpassDescriptionDepthStencilResolveKHR create(long address) {
        return wrap(VkSubpassDescriptionDepthStencilResolveKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSubpassDescriptionDepthStencilResolveKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkSubpassDescriptionDepthStencilResolveKHR.class, address);
    }

    /**
     * Returns a new {@link VkSubpassDescriptionDepthStencilResolveKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescriptionDepthStencilResolveKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSubpassDescriptionDepthStencilResolveKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescriptionDepthStencilResolveKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassDescriptionDepthStencilResolveKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescriptionDepthStencilResolveKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSubpassDescriptionDepthStencilResolveKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescriptionDepthStencilResolveKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSubpassDescriptionDepthStencilResolveKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSubpassDescriptionDepthStencilResolveKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSubpassDescriptionDepthStencilResolveKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSubpassDescriptionDepthStencilResolveKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSubpassDescriptionDepthStencilResolveKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSubpassDescriptionDepthStencilResolveKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSubpassDescriptionDepthStencilResolveKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSubpassDescriptionDepthStencilResolveKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSubpassDescriptionDepthStencilResolveKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkSubpassDescriptionDepthStencilResolveKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassDescriptionDepthStencilResolveKHR malloc(MemoryStack stack) {
        return wrap(VkSubpassDescriptionDepthStencilResolveKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSubpassDescriptionDepthStencilResolveKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassDescriptionDepthStencilResolveKHR calloc(MemoryStack stack) {
        return wrap(VkSubpassDescriptionDepthStencilResolveKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSubpassDescriptionDepthStencilResolveKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescriptionDepthStencilResolveKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassDescriptionDepthStencilResolveKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescriptionDepthStencilResolveKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkSubpassDescriptionDepthStencilResolveKHR} structs. */
    public static class Buffer extends VkSubpassDescriptionDepthStencilResolve.Buffer {

        private static final VkSubpassDescriptionDepthStencilResolveKHR ELEMENT_FACTORY = VkSubpassDescriptionDepthStencilResolveKHR.create(-1L);

        /**
         * Creates a new {@code VkSubpassDescriptionDepthStencilResolveKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSubpassDescriptionDepthStencilResolveKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkSubpassDescriptionDepthStencilResolveKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkSubpassDescriptionDepthStencilResolveKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkSubpassDescriptionDepthStencilResolveKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE STRUCTURE_TYPE_SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE} value to the {@code sType} field. */
        @Override
        public VkSubpassDescriptionDepthStencilResolveKHR.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkSubpassDescriptionDepthStencilResolveKHR.Buffer pNext(@NativeType("void const *") long value) { VkSubpassDescriptionDepthStencilResolveKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code depthResolveMode} field. */
        @Override
        public VkSubpassDescriptionDepthStencilResolveKHR.Buffer depthResolveMode(@NativeType("VkResolveModeFlagBits") int value) { VkSubpassDescriptionDepthStencilResolveKHR.ndepthResolveMode(address(), value); return this; }
        /** Sets the specified value to the {@code stencilResolveMode} field. */
        @Override
        public VkSubpassDescriptionDepthStencilResolveKHR.Buffer stencilResolveMode(@NativeType("VkResolveModeFlagBits") int value) { VkSubpassDescriptionDepthStencilResolveKHR.nstencilResolveMode(address(), value); return this; }
        /** Sets the address of the specified {@link VkAttachmentReference2} to the {@code pDepthStencilResolveAttachment} field. */
        @Override
        public VkSubpassDescriptionDepthStencilResolveKHR.Buffer pDepthStencilResolveAttachment(@Nullable @NativeType("VkAttachmentReference2 const *") VkAttachmentReference2 value) { VkSubpassDescriptionDepthStencilResolveKHR.npDepthStencilResolveAttachment(address(), value); return this; }

    }

}