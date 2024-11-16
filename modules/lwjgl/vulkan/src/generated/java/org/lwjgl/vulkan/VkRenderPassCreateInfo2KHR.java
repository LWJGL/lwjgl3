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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * See {@link VkRenderPassCreateInfo2}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkRenderPassCreateInfo2KHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkRenderPassCreateFlags flags;
 *     uint32_t attachmentCount;
 *     {@link VkAttachmentDescription2 VkAttachmentDescription2} const * pAttachments;
 *     uint32_t subpassCount;
 *     {@link VkSubpassDescription2 VkSubpassDescription2} const * pSubpasses;
 *     uint32_t dependencyCount;
 *     {@link VkSubpassDependency2 VkSubpassDependency2} const * pDependencies;
 *     uint32_t correlatedViewMaskCount;
 *     uint32_t const * pCorrelatedViewMasks;
 * }</code></pre>
 */
public class VkRenderPassCreateInfo2KHR extends VkRenderPassCreateInfo2 {

    protected VkRenderPassCreateInfo2KHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkRenderPassCreateInfo2KHR create(long address, @Nullable ByteBuffer container) {
        return new VkRenderPassCreateInfo2KHR(address, container);
    }

    /**
     * Creates a {@code VkRenderPassCreateInfo2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRenderPassCreateInfo2KHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkRenderPassCreateInfo2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2 STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2} value to the {@code sType} field. */
    @Override
    public VkRenderPassCreateInfo2KHR sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkRenderPassCreateInfo2KHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    @Override
    public VkRenderPassCreateInfo2KHR flags(@NativeType("VkRenderPassCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link VkAttachmentDescription2.Buffer} to the {@code pAttachments} field. */
    @Override
    public VkRenderPassCreateInfo2KHR pAttachments(@NativeType("VkAttachmentDescription2 const *") VkAttachmentDescription2.@Nullable Buffer value) { npAttachments(address(), value); return this; }
    /** Sets the address of the specified {@link VkSubpassDescription2.Buffer} to the {@code pSubpasses} field. */
    @Override
    public VkRenderPassCreateInfo2KHR pSubpasses(@NativeType("VkSubpassDescription2 const *") VkSubpassDescription2.Buffer value) { npSubpasses(address(), value); return this; }
    /** Sets the address of the specified {@link VkSubpassDependency2.Buffer} to the {@code pDependencies} field. */
    @Override
    public VkRenderPassCreateInfo2KHR pDependencies(@NativeType("VkSubpassDependency2 const *") VkSubpassDependency2.@Nullable Buffer value) { npDependencies(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pCorrelatedViewMasks} field. */
    @Override
    public VkRenderPassCreateInfo2KHR pCorrelatedViewMasks(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npCorrelatedViewMasks(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkRenderPassCreateInfo2KHR set(
        int sType,
        long pNext,
        int flags,
        VkAttachmentDescription2.@Nullable Buffer pAttachments,
        VkSubpassDescription2.Buffer pSubpasses,
        VkSubpassDependency2.@Nullable Buffer pDependencies,
        @Nullable IntBuffer pCorrelatedViewMasks
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pAttachments(pAttachments);
        pSubpasses(pSubpasses);
        pDependencies(pDependencies);
        pCorrelatedViewMasks(pCorrelatedViewMasks);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRenderPassCreateInfo2KHR set(VkRenderPassCreateInfo2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRenderPassCreateInfo2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRenderPassCreateInfo2KHR malloc() {
        return new VkRenderPassCreateInfo2KHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkRenderPassCreateInfo2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRenderPassCreateInfo2KHR calloc() {
        return new VkRenderPassCreateInfo2KHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkRenderPassCreateInfo2KHR} instance allocated with {@link BufferUtils}. */
    public static VkRenderPassCreateInfo2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderPassCreateInfo2KHR(memAddress(container), container);
    }

    /** Returns a new {@code VkRenderPassCreateInfo2KHR} instance for the specified memory address. */
    public static VkRenderPassCreateInfo2KHR create(long address) {
        return new VkRenderPassCreateInfo2KHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkRenderPassCreateInfo2KHR createSafe(long address) {
        return address == NULL ? null : new VkRenderPassCreateInfo2KHR(address, null);
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo2KHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo2KHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkRenderPassCreateInfo2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo2KHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkRenderPassCreateInfo2KHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkRenderPassCreateInfo2KHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkRenderPassCreateInfo2KHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkRenderPassCreateInfo2KHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkRenderPassCreateInfo2KHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRenderPassCreateInfo2KHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRenderPassCreateInfo2KHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRenderPassCreateInfo2KHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRenderPassCreateInfo2KHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkRenderPassCreateInfo2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassCreateInfo2KHR malloc(MemoryStack stack) {
        return new VkRenderPassCreateInfo2KHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkRenderPassCreateInfo2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassCreateInfo2KHR calloc(MemoryStack stack) {
        return new VkRenderPassCreateInfo2KHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo2KHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo2KHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkRenderPassCreateInfo2KHR} structs. */
    public static class Buffer extends VkRenderPassCreateInfo2.Buffer {

        private static final VkRenderPassCreateInfo2KHR ELEMENT_FACTORY = VkRenderPassCreateInfo2KHR.create(-1L);

        /**
         * Creates a new {@code VkRenderPassCreateInfo2KHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderPassCreateInfo2KHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkRenderPassCreateInfo2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkRenderPassCreateInfo2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderPassCreateInfo2KHR.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2 STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2} value to the {@code sType} field. */
        @Override
        public VkRenderPassCreateInfo2KHR.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkRenderPassCreateInfo2KHR.Buffer pNext(@NativeType("void const *") long value) { VkRenderPassCreateInfo2KHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        @Override
        public VkRenderPassCreateInfo2KHR.Buffer flags(@NativeType("VkRenderPassCreateFlags") int value) { VkRenderPassCreateInfo2KHR.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link VkAttachmentDescription2.Buffer} to the {@code pAttachments} field. */
        @Override
        public VkRenderPassCreateInfo2KHR.Buffer pAttachments(@NativeType("VkAttachmentDescription2 const *") VkAttachmentDescription2.@Nullable Buffer value) { VkRenderPassCreateInfo2KHR.npAttachments(address(), value); return this; }
        /** Sets the address of the specified {@link VkSubpassDescription2.Buffer} to the {@code pSubpasses} field. */
        @Override
        public VkRenderPassCreateInfo2KHR.Buffer pSubpasses(@NativeType("VkSubpassDescription2 const *") VkSubpassDescription2.Buffer value) { VkRenderPassCreateInfo2KHR.npSubpasses(address(), value); return this; }
        /** Sets the address of the specified {@link VkSubpassDependency2.Buffer} to the {@code pDependencies} field. */
        @Override
        public VkRenderPassCreateInfo2KHR.Buffer pDependencies(@NativeType("VkSubpassDependency2 const *") VkSubpassDependency2.@Nullable Buffer value) { VkRenderPassCreateInfo2KHR.npDependencies(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pCorrelatedViewMasks} field. */
        @Override
        public VkRenderPassCreateInfo2KHR.Buffer pCorrelatedViewMasks(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkRenderPassCreateInfo2KHR.npCorrelatedViewMasks(address(), value); return this; }

    }

}