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
 * See {@link VkAttachmentDescription2}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkAttachmentDescription2KHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkAttachmentDescriptionFlags flags;
 *     VkFormat format;
 *     VkSampleCountFlagBits samples;
 *     VkAttachmentLoadOp loadOp;
 *     VkAttachmentStoreOp storeOp;
 *     VkAttachmentLoadOp stencilLoadOp;
 *     VkAttachmentStoreOp stencilStoreOp;
 *     VkImageLayout initialLayout;
 *     VkImageLayout finalLayout;
 * }</code></pre>
 */
public class VkAttachmentDescription2KHR extends VkAttachmentDescription2 {

    /**
     * Creates a {@code VkAttachmentDescription2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAttachmentDescription2KHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkAttachmentDescription2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_2 STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_2} value to the {@code sType} field. */
    @Override
    public VkAttachmentDescription2KHR sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_2); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkAttachmentDescription2KHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    @Override
    public VkAttachmentDescription2KHR flags(@NativeType("VkAttachmentDescriptionFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code format} field. */
    @Override
    public VkAttachmentDescription2KHR format(@NativeType("VkFormat") int value) { nformat(address(), value); return this; }
    /** Sets the specified value to the {@code samples} field. */
    @Override
    public VkAttachmentDescription2KHR samples(@NativeType("VkSampleCountFlagBits") int value) { nsamples(address(), value); return this; }
    /** Sets the specified value to the {@code loadOp} field. */
    @Override
    public VkAttachmentDescription2KHR loadOp(@NativeType("VkAttachmentLoadOp") int value) { nloadOp(address(), value); return this; }
    /** Sets the specified value to the {@code storeOp} field. */
    @Override
    public VkAttachmentDescription2KHR storeOp(@NativeType("VkAttachmentStoreOp") int value) { nstoreOp(address(), value); return this; }
    /** Sets the specified value to the {@code stencilLoadOp} field. */
    @Override
    public VkAttachmentDescription2KHR stencilLoadOp(@NativeType("VkAttachmentLoadOp") int value) { nstencilLoadOp(address(), value); return this; }
    /** Sets the specified value to the {@code stencilStoreOp} field. */
    @Override
    public VkAttachmentDescription2KHR stencilStoreOp(@NativeType("VkAttachmentStoreOp") int value) { nstencilStoreOp(address(), value); return this; }
    /** Sets the specified value to the {@code initialLayout} field. */
    @Override
    public VkAttachmentDescription2KHR initialLayout(@NativeType("VkImageLayout") int value) { ninitialLayout(address(), value); return this; }
    /** Sets the specified value to the {@code finalLayout} field. */
    @Override
    public VkAttachmentDescription2KHR finalLayout(@NativeType("VkImageLayout") int value) { nfinalLayout(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkAttachmentDescription2KHR set(
        int sType,
        long pNext,
        int flags,
        int format,
        int samples,
        int loadOp,
        int storeOp,
        int stencilLoadOp,
        int stencilStoreOp,
        int initialLayout,
        int finalLayout
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        format(format);
        samples(samples);
        loadOp(loadOp);
        storeOp(storeOp);
        stencilLoadOp(stencilLoadOp);
        stencilStoreOp(stencilStoreOp);
        initialLayout(initialLayout);
        finalLayout(finalLayout);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAttachmentDescription2KHR set(VkAttachmentDescription2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAttachmentDescription2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAttachmentDescription2KHR malloc() {
        return wrap(VkAttachmentDescription2KHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkAttachmentDescription2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAttachmentDescription2KHR calloc() {
        return wrap(VkAttachmentDescription2KHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkAttachmentDescription2KHR} instance allocated with {@link BufferUtils}. */
    public static VkAttachmentDescription2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkAttachmentDescription2KHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkAttachmentDescription2KHR} instance for the specified memory address. */
    public static VkAttachmentDescription2KHR create(long address) {
        return wrap(VkAttachmentDescription2KHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAttachmentDescription2KHR createSafe(long address) {
        return address == NULL ? null : wrap(VkAttachmentDescription2KHR.class, address);
    }

    /**
     * Returns a new {@link VkAttachmentDescription2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentDescription2KHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentDescription2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentDescription2KHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentDescription2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentDescription2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkAttachmentDescription2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAttachmentDescription2KHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAttachmentDescription2KHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkAttachmentDescription2KHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkAttachmentDescription2KHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkAttachmentDescription2KHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkAttachmentDescription2KHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkAttachmentDescription2KHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkAttachmentDescription2KHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkAttachmentDescription2KHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkAttachmentDescription2KHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkAttachmentDescription2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAttachmentDescription2KHR malloc(MemoryStack stack) {
        return wrap(VkAttachmentDescription2KHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkAttachmentDescription2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAttachmentDescription2KHR calloc(MemoryStack stack) {
        return wrap(VkAttachmentDescription2KHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkAttachmentDescription2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAttachmentDescription2KHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentDescription2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAttachmentDescription2KHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkAttachmentDescription2KHR} structs. */
    public static class Buffer extends VkAttachmentDescription2.Buffer {

        private static final VkAttachmentDescription2KHR ELEMENT_FACTORY = VkAttachmentDescription2KHR.create(-1L);

        /**
         * Creates a new {@code VkAttachmentDescription2KHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAttachmentDescription2KHR#SIZEOF}, and its mark will be undefined.
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
        protected VkAttachmentDescription2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkAttachmentDescription2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkAttachmentDescription2KHR.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_2 STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_2} value to the {@code sType} field. */
        @Override
        public VkAttachmentDescription2KHR.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_2); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkAttachmentDescription2KHR.Buffer pNext(@NativeType("void const *") long value) { VkAttachmentDescription2KHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        @Override
        public VkAttachmentDescription2KHR.Buffer flags(@NativeType("VkAttachmentDescriptionFlags") int value) { VkAttachmentDescription2KHR.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code format} field. */
        @Override
        public VkAttachmentDescription2KHR.Buffer format(@NativeType("VkFormat") int value) { VkAttachmentDescription2KHR.nformat(address(), value); return this; }
        /** Sets the specified value to the {@code samples} field. */
        @Override
        public VkAttachmentDescription2KHR.Buffer samples(@NativeType("VkSampleCountFlagBits") int value) { VkAttachmentDescription2KHR.nsamples(address(), value); return this; }
        /** Sets the specified value to the {@code loadOp} field. */
        @Override
        public VkAttachmentDescription2KHR.Buffer loadOp(@NativeType("VkAttachmentLoadOp") int value) { VkAttachmentDescription2KHR.nloadOp(address(), value); return this; }
        /** Sets the specified value to the {@code storeOp} field. */
        @Override
        public VkAttachmentDescription2KHR.Buffer storeOp(@NativeType("VkAttachmentStoreOp") int value) { VkAttachmentDescription2KHR.nstoreOp(address(), value); return this; }
        /** Sets the specified value to the {@code stencilLoadOp} field. */
        @Override
        public VkAttachmentDescription2KHR.Buffer stencilLoadOp(@NativeType("VkAttachmentLoadOp") int value) { VkAttachmentDescription2KHR.nstencilLoadOp(address(), value); return this; }
        /** Sets the specified value to the {@code stencilStoreOp} field. */
        @Override
        public VkAttachmentDescription2KHR.Buffer stencilStoreOp(@NativeType("VkAttachmentStoreOp") int value) { VkAttachmentDescription2KHR.nstencilStoreOp(address(), value); return this; }
        /** Sets the specified value to the {@code initialLayout} field. */
        @Override
        public VkAttachmentDescription2KHR.Buffer initialLayout(@NativeType("VkImageLayout") int value) { VkAttachmentDescription2KHR.ninitialLayout(address(), value); return this; }
        /** Sets the specified value to the {@code finalLayout} field. */
        @Override
        public VkAttachmentDescription2KHR.Buffer finalLayout(@NativeType("VkImageLayout") int value) { VkAttachmentDescription2KHR.nfinalLayout(address(), value); return this; }

    }

}