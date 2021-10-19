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
 * See {@link VkSubpassDependency2}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSubpassDependency2KHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t srcSubpass;
 *     uint32_t dstSubpass;
 *     VkPipelineStageFlags srcStageMask;
 *     VkPipelineStageFlags dstStageMask;
 *     VkAccessFlags srcAccessMask;
 *     VkAccessFlags dstAccessMask;
 *     VkDependencyFlags dependencyFlags;
 *     int32_t viewOffset;
 * }</code></pre>
 */
public class VkSubpassDependency2KHR extends VkSubpassDependency2 {

    /**
     * Creates a {@code VkSubpassDependency2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSubpassDependency2KHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkSubpassDependency2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2 STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2} value to the {@code sType} field. */
    @Override
    public VkSubpassDependency2KHR sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkSubpassDependency2KHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code srcSubpass} field. */
    @Override
    public VkSubpassDependency2KHR srcSubpass(@NativeType("uint32_t") int value) { nsrcSubpass(address(), value); return this; }
    /** Sets the specified value to the {@code dstSubpass} field. */
    @Override
    public VkSubpassDependency2KHR dstSubpass(@NativeType("uint32_t") int value) { ndstSubpass(address(), value); return this; }
    /** Sets the specified value to the {@code srcStageMask} field. */
    @Override
    public VkSubpassDependency2KHR srcStageMask(@NativeType("VkPipelineStageFlags") int value) { nsrcStageMask(address(), value); return this; }
    /** Sets the specified value to the {@code dstStageMask} field. */
    @Override
    public VkSubpassDependency2KHR dstStageMask(@NativeType("VkPipelineStageFlags") int value) { ndstStageMask(address(), value); return this; }
    /** Sets the specified value to the {@code srcAccessMask} field. */
    @Override
    public VkSubpassDependency2KHR srcAccessMask(@NativeType("VkAccessFlags") int value) { nsrcAccessMask(address(), value); return this; }
    /** Sets the specified value to the {@code dstAccessMask} field. */
    @Override
    public VkSubpassDependency2KHR dstAccessMask(@NativeType("VkAccessFlags") int value) { ndstAccessMask(address(), value); return this; }
    /** Sets the specified value to the {@code dependencyFlags} field. */
    @Override
    public VkSubpassDependency2KHR dependencyFlags(@NativeType("VkDependencyFlags") int value) { ndependencyFlags(address(), value); return this; }
    /** Sets the specified value to the {@code viewOffset} field. */
    @Override
    public VkSubpassDependency2KHR viewOffset(@NativeType("int32_t") int value) { nviewOffset(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkSubpassDependency2KHR set(
        int sType,
        long pNext,
        int srcSubpass,
        int dstSubpass,
        int srcStageMask,
        int dstStageMask,
        int srcAccessMask,
        int dstAccessMask,
        int dependencyFlags,
        int viewOffset
    ) {
        sType(sType);
        pNext(pNext);
        srcSubpass(srcSubpass);
        dstSubpass(dstSubpass);
        srcStageMask(srcStageMask);
        dstStageMask(dstStageMask);
        srcAccessMask(srcAccessMask);
        dstAccessMask(dstAccessMask);
        dependencyFlags(dependencyFlags);
        viewOffset(viewOffset);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSubpassDependency2KHR set(VkSubpassDependency2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSubpassDependency2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSubpassDependency2KHR malloc() {
        return wrap(VkSubpassDependency2KHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSubpassDependency2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSubpassDependency2KHR calloc() {
        return wrap(VkSubpassDependency2KHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSubpassDependency2KHR} instance allocated with {@link BufferUtils}. */
    public static VkSubpassDependency2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSubpassDependency2KHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSubpassDependency2KHR} instance for the specified memory address. */
    public static VkSubpassDependency2KHR create(long address) {
        return wrap(VkSubpassDependency2KHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSubpassDependency2KHR createSafe(long address) {
        return address == NULL ? null : wrap(VkSubpassDependency2KHR.class, address);
    }

    /**
     * Returns a new {@link VkSubpassDependency2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDependency2KHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSubpassDependency2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDependency2KHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassDependency2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDependency2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSubpassDependency2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSubpassDependency2KHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSubpassDependency2KHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSubpassDependency2KHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSubpassDependency2KHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSubpassDependency2KHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSubpassDependency2KHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSubpassDependency2KHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSubpassDependency2KHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSubpassDependency2KHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSubpassDependency2KHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkSubpassDependency2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassDependency2KHR malloc(MemoryStack stack) {
        return wrap(VkSubpassDependency2KHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSubpassDependency2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassDependency2KHR calloc(MemoryStack stack) {
        return wrap(VkSubpassDependency2KHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSubpassDependency2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassDependency2KHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassDependency2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassDependency2KHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkSubpassDependency2KHR} structs. */
    public static class Buffer extends VkSubpassDependency2.Buffer {

        private static final VkSubpassDependency2KHR ELEMENT_FACTORY = VkSubpassDependency2KHR.create(-1L);

        /**
         * Creates a new {@code VkSubpassDependency2KHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSubpassDependency2KHR#SIZEOF}, and its mark will be undefined.
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
        protected VkSubpassDependency2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkSubpassDependency2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkSubpassDependency2KHR.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2 STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2} value to the {@code sType} field. */
        @Override
        public VkSubpassDependency2KHR.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkSubpassDependency2KHR.Buffer pNext(@NativeType("void const *") long value) { VkSubpassDependency2KHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code srcSubpass} field. */
        @Override
        public VkSubpassDependency2KHR.Buffer srcSubpass(@NativeType("uint32_t") int value) { VkSubpassDependency2KHR.nsrcSubpass(address(), value); return this; }
        /** Sets the specified value to the {@code dstSubpass} field. */
        @Override
        public VkSubpassDependency2KHR.Buffer dstSubpass(@NativeType("uint32_t") int value) { VkSubpassDependency2KHR.ndstSubpass(address(), value); return this; }
        /** Sets the specified value to the {@code srcStageMask} field. */
        @Override
        public VkSubpassDependency2KHR.Buffer srcStageMask(@NativeType("VkPipelineStageFlags") int value) { VkSubpassDependency2KHR.nsrcStageMask(address(), value); return this; }
        /** Sets the specified value to the {@code dstStageMask} field. */
        @Override
        public VkSubpassDependency2KHR.Buffer dstStageMask(@NativeType("VkPipelineStageFlags") int value) { VkSubpassDependency2KHR.ndstStageMask(address(), value); return this; }
        /** Sets the specified value to the {@code srcAccessMask} field. */
        @Override
        public VkSubpassDependency2KHR.Buffer srcAccessMask(@NativeType("VkAccessFlags") int value) { VkSubpassDependency2KHR.nsrcAccessMask(address(), value); return this; }
        /** Sets the specified value to the {@code dstAccessMask} field. */
        @Override
        public VkSubpassDependency2KHR.Buffer dstAccessMask(@NativeType("VkAccessFlags") int value) { VkSubpassDependency2KHR.ndstAccessMask(address(), value); return this; }
        /** Sets the specified value to the {@code dependencyFlags} field. */
        @Override
        public VkSubpassDependency2KHR.Buffer dependencyFlags(@NativeType("VkDependencyFlags") int value) { VkSubpassDependency2KHR.ndependencyFlags(address(), value); return this; }
        /** Sets the specified value to the {@code viewOffset} field. */
        @Override
        public VkSubpassDependency2KHR.Buffer viewOffset(@NativeType("int32_t") int value) { VkSubpassDependency2KHR.nviewOffset(address(), value); return this; }

    }

}