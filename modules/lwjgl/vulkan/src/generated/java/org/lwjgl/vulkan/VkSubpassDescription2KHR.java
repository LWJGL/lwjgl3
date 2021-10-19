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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * See {@link VkSubpassDescription2}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSubpassDescription2KHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkSubpassDescriptionFlags flags;
 *     VkPipelineBindPoint pipelineBindPoint;
 *     uint32_t viewMask;
 *     uint32_t inputAttachmentCount;
 *     {@link VkAttachmentReference2 VkAttachmentReference2} const * pInputAttachments;
 *     uint32_t colorAttachmentCount;
 *     {@link VkAttachmentReference2 VkAttachmentReference2} const * pColorAttachments;
 *     {@link VkAttachmentReference2 VkAttachmentReference2} const * pResolveAttachments;
 *     {@link VkAttachmentReference2 VkAttachmentReference2} const * pDepthStencilAttachment;
 *     uint32_t preserveAttachmentCount;
 *     uint32_t const * pPreserveAttachments;
 * }</code></pre>
 */
public class VkSubpassDescription2KHR extends VkSubpassDescription2 {

    /**
     * Creates a {@code VkSubpassDescription2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSubpassDescription2KHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkSubpassDescription2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2 STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2} value to the {@code sType} field. */
    @Override
    public VkSubpassDescription2KHR sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkSubpassDescription2KHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    @Override
    public VkSubpassDescription2KHR flags(@NativeType("VkSubpassDescriptionFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code pipelineBindPoint} field. */
    @Override
    public VkSubpassDescription2KHR pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) { npipelineBindPoint(address(), value); return this; }
    /** Sets the specified value to the {@code viewMask} field. */
    @Override
    public VkSubpassDescription2KHR viewMask(@NativeType("uint32_t") int value) { nviewMask(address(), value); return this; }
    /** Sets the address of the specified {@link VkAttachmentReference2.Buffer} to the {@code pInputAttachments} field. */
    @Override
    public VkSubpassDescription2KHR pInputAttachments(@Nullable @NativeType("VkAttachmentReference2 const *") VkAttachmentReference2.Buffer value) { npInputAttachments(address(), value); return this; }
    /** Sets the specified value to the {@code colorAttachmentCount} field. */
    @Override
    public VkSubpassDescription2KHR colorAttachmentCount(@NativeType("uint32_t") int value) { ncolorAttachmentCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkAttachmentReference2.Buffer} to the {@code pColorAttachments} field. */
    @Override
    public VkSubpassDescription2KHR pColorAttachments(@Nullable @NativeType("VkAttachmentReference2 const *") VkAttachmentReference2.Buffer value) { npColorAttachments(address(), value); return this; }
    /** Sets the address of the specified {@link VkAttachmentReference2.Buffer} to the {@code pResolveAttachments} field. */
    @Override
    public VkSubpassDescription2KHR pResolveAttachments(@Nullable @NativeType("VkAttachmentReference2 const *") VkAttachmentReference2.Buffer value) { npResolveAttachments(address(), value); return this; }
    /** Sets the address of the specified {@link VkAttachmentReference2} to the {@code pDepthStencilAttachment} field. */
    @Override
    public VkSubpassDescription2KHR pDepthStencilAttachment(@Nullable @NativeType("VkAttachmentReference2 const *") VkAttachmentReference2 value) { npDepthStencilAttachment(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pPreserveAttachments} field. */
    @Override
    public VkSubpassDescription2KHR pPreserveAttachments(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npPreserveAttachments(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkSubpassDescription2KHR set(
        int sType,
        long pNext,
        int flags,
        int pipelineBindPoint,
        int viewMask,
        @Nullable VkAttachmentReference2.Buffer pInputAttachments,
        int colorAttachmentCount,
        @Nullable VkAttachmentReference2.Buffer pColorAttachments,
        @Nullable VkAttachmentReference2.Buffer pResolveAttachments,
        @Nullable VkAttachmentReference2 pDepthStencilAttachment,
        @Nullable IntBuffer pPreserveAttachments
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pipelineBindPoint(pipelineBindPoint);
        viewMask(viewMask);
        pInputAttachments(pInputAttachments);
        colorAttachmentCount(colorAttachmentCount);
        pColorAttachments(pColorAttachments);
        pResolveAttachments(pResolveAttachments);
        pDepthStencilAttachment(pDepthStencilAttachment);
        pPreserveAttachments(pPreserveAttachments);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSubpassDescription2KHR set(VkSubpassDescription2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSubpassDescription2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSubpassDescription2KHR malloc() {
        return wrap(VkSubpassDescription2KHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSubpassDescription2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSubpassDescription2KHR calloc() {
        return wrap(VkSubpassDescription2KHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSubpassDescription2KHR} instance allocated with {@link BufferUtils}. */
    public static VkSubpassDescription2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSubpassDescription2KHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSubpassDescription2KHR} instance for the specified memory address. */
    public static VkSubpassDescription2KHR create(long address) {
        return wrap(VkSubpassDescription2KHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSubpassDescription2KHR createSafe(long address) {
        return address == NULL ? null : wrap(VkSubpassDescription2KHR.class, address);
    }

    /**
     * Returns a new {@link VkSubpassDescription2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescription2KHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSubpassDescription2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescription2KHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassDescription2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescription2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSubpassDescription2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescription2KHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSubpassDescription2KHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSubpassDescription2KHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSubpassDescription2KHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSubpassDescription2KHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSubpassDescription2KHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSubpassDescription2KHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSubpassDescription2KHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSubpassDescription2KHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSubpassDescription2KHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkSubpassDescription2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassDescription2KHR malloc(MemoryStack stack) {
        return wrap(VkSubpassDescription2KHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSubpassDescription2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassDescription2KHR calloc(MemoryStack stack) {
        return wrap(VkSubpassDescription2KHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSubpassDescription2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescription2KHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassDescription2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescription2KHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkSubpassDescription2KHR} structs. */
    public static class Buffer extends VkSubpassDescription2.Buffer {

        private static final VkSubpassDescription2KHR ELEMENT_FACTORY = VkSubpassDescription2KHR.create(-1L);

        /**
         * Creates a new {@code VkSubpassDescription2KHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSubpassDescription2KHR#SIZEOF}, and its mark will be undefined.
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
        protected VkSubpassDescription2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkSubpassDescription2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkSubpassDescription2KHR.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2 STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2} value to the {@code sType} field. */
        @Override
        public VkSubpassDescription2KHR.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkSubpassDescription2KHR.Buffer pNext(@NativeType("void const *") long value) { VkSubpassDescription2KHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        @Override
        public VkSubpassDescription2KHR.Buffer flags(@NativeType("VkSubpassDescriptionFlags") int value) { VkSubpassDescription2KHR.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code pipelineBindPoint} field. */
        @Override
        public VkSubpassDescription2KHR.Buffer pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) { VkSubpassDescription2KHR.npipelineBindPoint(address(), value); return this; }
        /** Sets the specified value to the {@code viewMask} field. */
        @Override
        public VkSubpassDescription2KHR.Buffer viewMask(@NativeType("uint32_t") int value) { VkSubpassDescription2KHR.nviewMask(address(), value); return this; }
        /** Sets the address of the specified {@link VkAttachmentReference2.Buffer} to the {@code pInputAttachments} field. */
        @Override
        public VkSubpassDescription2KHR.Buffer pInputAttachments(@Nullable @NativeType("VkAttachmentReference2 const *") VkAttachmentReference2.Buffer value) { VkSubpassDescription2KHR.npInputAttachments(address(), value); return this; }
        /** Sets the specified value to the {@code colorAttachmentCount} field. */
        @Override
        public VkSubpassDescription2KHR.Buffer colorAttachmentCount(@NativeType("uint32_t") int value) { VkSubpassDescription2KHR.ncolorAttachmentCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkAttachmentReference2.Buffer} to the {@code pColorAttachments} field. */
        @Override
        public VkSubpassDescription2KHR.Buffer pColorAttachments(@Nullable @NativeType("VkAttachmentReference2 const *") VkAttachmentReference2.Buffer value) { VkSubpassDescription2KHR.npColorAttachments(address(), value); return this; }
        /** Sets the address of the specified {@link VkAttachmentReference2.Buffer} to the {@code pResolveAttachments} field. */
        @Override
        public VkSubpassDescription2KHR.Buffer pResolveAttachments(@Nullable @NativeType("VkAttachmentReference2 const *") VkAttachmentReference2.Buffer value) { VkSubpassDescription2KHR.npResolveAttachments(address(), value); return this; }
        /** Sets the address of the specified {@link VkAttachmentReference2} to the {@code pDepthStencilAttachment} field. */
        @Override
        public VkSubpassDescription2KHR.Buffer pDepthStencilAttachment(@Nullable @NativeType("VkAttachmentReference2 const *") VkAttachmentReference2 value) { VkSubpassDescription2KHR.npDepthStencilAttachment(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pPreserveAttachments} field. */
        @Override
        public VkSubpassDescription2KHR.Buffer pPreserveAttachments(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkSubpassDescription2KHR.npPreserveAttachments(address(), value); return this; }

    }

}