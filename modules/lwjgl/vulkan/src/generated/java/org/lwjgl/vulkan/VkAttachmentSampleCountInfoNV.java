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
 * See {@link VkAttachmentSampleCountInfoAMD}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkAttachmentSampleCountInfoNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t colorAttachmentCount;
 *     VkSampleCountFlagBits const * pColorAttachmentSamples;
 *     VkSampleCountFlagBits depthStencilAttachmentSamples;
 * }</code></pre>
 */
public class VkAttachmentSampleCountInfoNV extends VkAttachmentSampleCountInfoAMD {

    /**
     * Creates a {@code VkAttachmentSampleCountInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAttachmentSampleCountInfoNV(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkAttachmentSampleCountInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRDynamicRendering#VK_STRUCTURE_TYPE_ATTACHMENT_SAMPLE_COUNT_INFO_AMD STRUCTURE_TYPE_ATTACHMENT_SAMPLE_COUNT_INFO_AMD} value to the {@code sType} field. */
    @Override
    public VkAttachmentSampleCountInfoNV sType$Default() { return sType(KHRDynamicRendering.VK_STRUCTURE_TYPE_ATTACHMENT_SAMPLE_COUNT_INFO_AMD); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkAttachmentSampleCountInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pColorAttachmentSamples} field. */
    @Override
    public VkAttachmentSampleCountInfoNV pColorAttachmentSamples(@Nullable @NativeType("VkSampleCountFlagBits const *") IntBuffer value) { npColorAttachmentSamples(address(), value); return this; }
    /** Sets the specified value to the {@code depthStencilAttachmentSamples} field. */
    @Override
    public VkAttachmentSampleCountInfoNV depthStencilAttachmentSamples(@NativeType("VkSampleCountFlagBits") int value) { ndepthStencilAttachmentSamples(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkAttachmentSampleCountInfoNV set(
        int sType,
        long pNext,
        @Nullable IntBuffer pColorAttachmentSamples,
        int depthStencilAttachmentSamples
    ) {
        sType(sType);
        pNext(pNext);
        pColorAttachmentSamples(pColorAttachmentSamples);
        depthStencilAttachmentSamples(depthStencilAttachmentSamples);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAttachmentSampleCountInfoNV set(VkAttachmentSampleCountInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAttachmentSampleCountInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAttachmentSampleCountInfoNV malloc() {
        return wrap(VkAttachmentSampleCountInfoNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkAttachmentSampleCountInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAttachmentSampleCountInfoNV calloc() {
        return wrap(VkAttachmentSampleCountInfoNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkAttachmentSampleCountInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkAttachmentSampleCountInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkAttachmentSampleCountInfoNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkAttachmentSampleCountInfoNV} instance for the specified memory address. */
    public static VkAttachmentSampleCountInfoNV create(long address) {
        return wrap(VkAttachmentSampleCountInfoNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAttachmentSampleCountInfoNV createSafe(long address) {
        return address == NULL ? null : wrap(VkAttachmentSampleCountInfoNV.class, address);
    }

    /**
     * Returns a new {@link VkAttachmentSampleCountInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentSampleCountInfoNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentSampleCountInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentSampleCountInfoNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentSampleCountInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentSampleCountInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkAttachmentSampleCountInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAttachmentSampleCountInfoNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAttachmentSampleCountInfoNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkAttachmentSampleCountInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAttachmentSampleCountInfoNV malloc(MemoryStack stack) {
        return wrap(VkAttachmentSampleCountInfoNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkAttachmentSampleCountInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAttachmentSampleCountInfoNV calloc(MemoryStack stack) {
        return wrap(VkAttachmentSampleCountInfoNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkAttachmentSampleCountInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAttachmentSampleCountInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentSampleCountInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAttachmentSampleCountInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkAttachmentSampleCountInfoNV} structs. */
    public static class Buffer extends VkAttachmentSampleCountInfoAMD.Buffer {

        private static final VkAttachmentSampleCountInfoNV ELEMENT_FACTORY = VkAttachmentSampleCountInfoNV.create(-1L);

        /**
         * Creates a new {@code VkAttachmentSampleCountInfoNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAttachmentSampleCountInfoNV#SIZEOF}, and its mark will be undefined.
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
        protected VkAttachmentSampleCountInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkAttachmentSampleCountInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkAttachmentSampleCountInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link KHRDynamicRendering#VK_STRUCTURE_TYPE_ATTACHMENT_SAMPLE_COUNT_INFO_AMD STRUCTURE_TYPE_ATTACHMENT_SAMPLE_COUNT_INFO_AMD} value to the {@code sType} field. */
        @Override
        public VkAttachmentSampleCountInfoNV.Buffer sType$Default() { return sType(KHRDynamicRendering.VK_STRUCTURE_TYPE_ATTACHMENT_SAMPLE_COUNT_INFO_AMD); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkAttachmentSampleCountInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkAttachmentSampleCountInfoNV.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pColorAttachmentSamples} field. */
        @Override
        public VkAttachmentSampleCountInfoNV.Buffer pColorAttachmentSamples(@Nullable @NativeType("VkSampleCountFlagBits const *") IntBuffer value) { VkAttachmentSampleCountInfoNV.npColorAttachmentSamples(address(), value); return this; }
        /** Sets the specified value to the {@code depthStencilAttachmentSamples} field. */
        @Override
        public VkAttachmentSampleCountInfoNV.Buffer depthStencilAttachmentSamples(@NativeType("VkSampleCountFlagBits") int value) { VkAttachmentSampleCountInfoNV.ndepthStencilAttachmentSamples(address(), value); return this; }

    }

}