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
 * struct VkSurfaceCapabilitiesKHR {
 *     uint32_t minImageCount;
 *     uint32_t maxImageCount;
 *     {@link VkExtent2D VkExtent2D} currentExtent;
 *     {@link VkExtent2D VkExtent2D} minImageExtent;
 *     {@link VkExtent2D VkExtent2D} maxImageExtent;
 *     uint32_t maxImageArrayLayers;
 *     VkSurfaceTransformFlagsKHR supportedTransforms;
 *     VkSurfaceTransformFlagBitsKHR currentTransform;
 *     VkCompositeAlphaFlagsKHR supportedCompositeAlpha;
 *     VkImageUsageFlags supportedUsageFlags;
 * }</code></pre>
 */
public class VkSurfaceCapabilitiesKHR extends Struct<VkSurfaceCapabilitiesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MINIMAGECOUNT,
        MAXIMAGECOUNT,
        CURRENTEXTENT,
        MINIMAGEEXTENT,
        MAXIMAGEEXTENT,
        MAXIMAGEARRAYLAYERS,
        SUPPORTEDTRANSFORMS,
        CURRENTTRANSFORM,
        SUPPORTEDCOMPOSITEALPHA,
        SUPPORTEDUSAGEFLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MINIMAGECOUNT = layout.offsetof(0);
        MAXIMAGECOUNT = layout.offsetof(1);
        CURRENTEXTENT = layout.offsetof(2);
        MINIMAGEEXTENT = layout.offsetof(3);
        MAXIMAGEEXTENT = layout.offsetof(4);
        MAXIMAGEARRAYLAYERS = layout.offsetof(5);
        SUPPORTEDTRANSFORMS = layout.offsetof(6);
        CURRENTTRANSFORM = layout.offsetof(7);
        SUPPORTEDCOMPOSITEALPHA = layout.offsetof(8);
        SUPPORTEDUSAGEFLAGS = layout.offsetof(9);
    }

    protected VkSurfaceCapabilitiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSurfaceCapabilitiesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkSurfaceCapabilitiesKHR(address, container);
    }

    /**
     * Creates a {@code VkSurfaceCapabilitiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSurfaceCapabilitiesKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code minImageCount} field. */
    @NativeType("uint32_t")
    public int minImageCount() { return nminImageCount(address()); }
    /** @return the value of the {@code maxImageCount} field. */
    @NativeType("uint32_t")
    public int maxImageCount() { return nmaxImageCount(address()); }
    /** @return a {@link VkExtent2D} view of the {@code currentExtent} field. */
    public VkExtent2D currentExtent() { return ncurrentExtent(address()); }
    /** @return a {@link VkExtent2D} view of the {@code minImageExtent} field. */
    public VkExtent2D minImageExtent() { return nminImageExtent(address()); }
    /** @return a {@link VkExtent2D} view of the {@code maxImageExtent} field. */
    public VkExtent2D maxImageExtent() { return nmaxImageExtent(address()); }
    /** @return the value of the {@code maxImageArrayLayers} field. */
    @NativeType("uint32_t")
    public int maxImageArrayLayers() { return nmaxImageArrayLayers(address()); }
    /** @return the value of the {@code supportedTransforms} field. */
    @NativeType("VkSurfaceTransformFlagsKHR")
    public int supportedTransforms() { return nsupportedTransforms(address()); }
    /** @return the value of the {@code currentTransform} field. */
    @NativeType("VkSurfaceTransformFlagBitsKHR")
    public int currentTransform() { return ncurrentTransform(address()); }
    /** @return the value of the {@code supportedCompositeAlpha} field. */
    @NativeType("VkCompositeAlphaFlagsKHR")
    public int supportedCompositeAlpha() { return nsupportedCompositeAlpha(address()); }
    /** @return the value of the {@code supportedUsageFlags} field. */
    @NativeType("VkImageUsageFlags")
    public int supportedUsageFlags() { return nsupportedUsageFlags(address()); }

    // -----------------------------------

    /** Returns a new {@code VkSurfaceCapabilitiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSurfaceCapabilitiesKHR malloc() {
        return new VkSurfaceCapabilitiesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSurfaceCapabilitiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSurfaceCapabilitiesKHR calloc() {
        return new VkSurfaceCapabilitiesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSurfaceCapabilitiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkSurfaceCapabilitiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSurfaceCapabilitiesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkSurfaceCapabilitiesKHR} instance for the specified memory address. */
    public static VkSurfaceCapabilitiesKHR create(long address) {
        return new VkSurfaceCapabilitiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSurfaceCapabilitiesKHR createSafe(long address) {
        return address == NULL ? null : new VkSurfaceCapabilitiesKHR(address, null);
    }

    /**
     * Returns a new {@link VkSurfaceCapabilitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilitiesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSurfaceCapabilitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilitiesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSurfaceCapabilitiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilitiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSurfaceCapabilitiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilitiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSurfaceCapabilitiesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSurfaceCapabilitiesKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSurfaceCapabilitiesKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSurfaceCapabilitiesKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSurfaceCapabilitiesKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSurfaceCapabilitiesKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSurfaceCapabilitiesKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSurfaceCapabilitiesKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSurfaceCapabilitiesKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkSurfaceCapabilitiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSurfaceCapabilitiesKHR malloc(MemoryStack stack) {
        return new VkSurfaceCapabilitiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSurfaceCapabilitiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSurfaceCapabilitiesKHR calloc(MemoryStack stack) {
        return new VkSurfaceCapabilitiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSurfaceCapabilitiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilitiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSurfaceCapabilitiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilitiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #minImageCount}. */
    public static int nminImageCount(long struct) { return memGetInt(struct + VkSurfaceCapabilitiesKHR.MINIMAGECOUNT); }
    /** Unsafe version of {@link #maxImageCount}. */
    public static int nmaxImageCount(long struct) { return memGetInt(struct + VkSurfaceCapabilitiesKHR.MAXIMAGECOUNT); }
    /** Unsafe version of {@link #currentExtent}. */
    public static VkExtent2D ncurrentExtent(long struct) { return VkExtent2D.create(struct + VkSurfaceCapabilitiesKHR.CURRENTEXTENT); }
    /** Unsafe version of {@link #minImageExtent}. */
    public static VkExtent2D nminImageExtent(long struct) { return VkExtent2D.create(struct + VkSurfaceCapabilitiesKHR.MINIMAGEEXTENT); }
    /** Unsafe version of {@link #maxImageExtent}. */
    public static VkExtent2D nmaxImageExtent(long struct) { return VkExtent2D.create(struct + VkSurfaceCapabilitiesKHR.MAXIMAGEEXTENT); }
    /** Unsafe version of {@link #maxImageArrayLayers}. */
    public static int nmaxImageArrayLayers(long struct) { return memGetInt(struct + VkSurfaceCapabilitiesKHR.MAXIMAGEARRAYLAYERS); }
    /** Unsafe version of {@link #supportedTransforms}. */
    public static int nsupportedTransforms(long struct) { return memGetInt(struct + VkSurfaceCapabilitiesKHR.SUPPORTEDTRANSFORMS); }
    /** Unsafe version of {@link #currentTransform}. */
    public static int ncurrentTransform(long struct) { return memGetInt(struct + VkSurfaceCapabilitiesKHR.CURRENTTRANSFORM); }
    /** Unsafe version of {@link #supportedCompositeAlpha}. */
    public static int nsupportedCompositeAlpha(long struct) { return memGetInt(struct + VkSurfaceCapabilitiesKHR.SUPPORTEDCOMPOSITEALPHA); }
    /** Unsafe version of {@link #supportedUsageFlags}. */
    public static int nsupportedUsageFlags(long struct) { return memGetInt(struct + VkSurfaceCapabilitiesKHR.SUPPORTEDUSAGEFLAGS); }

    // -----------------------------------

    /** An array of {@link VkSurfaceCapabilitiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkSurfaceCapabilitiesKHR, Buffer> implements NativeResource {

        private static final VkSurfaceCapabilitiesKHR ELEMENT_FACTORY = VkSurfaceCapabilitiesKHR.create(-1L);

        /**
         * Creates a new {@code VkSurfaceCapabilitiesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSurfaceCapabilitiesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSurfaceCapabilitiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code minImageCount} field. */
        @NativeType("uint32_t")
        public int minImageCount() { return VkSurfaceCapabilitiesKHR.nminImageCount(address()); }
        /** @return the value of the {@code maxImageCount} field. */
        @NativeType("uint32_t")
        public int maxImageCount() { return VkSurfaceCapabilitiesKHR.nmaxImageCount(address()); }
        /** @return a {@link VkExtent2D} view of the {@code currentExtent} field. */
        public VkExtent2D currentExtent() { return VkSurfaceCapabilitiesKHR.ncurrentExtent(address()); }
        /** @return a {@link VkExtent2D} view of the {@code minImageExtent} field. */
        public VkExtent2D minImageExtent() { return VkSurfaceCapabilitiesKHR.nminImageExtent(address()); }
        /** @return a {@link VkExtent2D} view of the {@code maxImageExtent} field. */
        public VkExtent2D maxImageExtent() { return VkSurfaceCapabilitiesKHR.nmaxImageExtent(address()); }
        /** @return the value of the {@code maxImageArrayLayers} field. */
        @NativeType("uint32_t")
        public int maxImageArrayLayers() { return VkSurfaceCapabilitiesKHR.nmaxImageArrayLayers(address()); }
        /** @return the value of the {@code supportedTransforms} field. */
        @NativeType("VkSurfaceTransformFlagsKHR")
        public int supportedTransforms() { return VkSurfaceCapabilitiesKHR.nsupportedTransforms(address()); }
        /** @return the value of the {@code currentTransform} field. */
        @NativeType("VkSurfaceTransformFlagBitsKHR")
        public int currentTransform() { return VkSurfaceCapabilitiesKHR.ncurrentTransform(address()); }
        /** @return the value of the {@code supportedCompositeAlpha} field. */
        @NativeType("VkCompositeAlphaFlagsKHR")
        public int supportedCompositeAlpha() { return VkSurfaceCapabilitiesKHR.nsupportedCompositeAlpha(address()); }
        /** @return the value of the {@code supportedUsageFlags} field. */
        @NativeType("VkImageUsageFlags")
        public int supportedUsageFlags() { return VkSurfaceCapabilitiesKHR.nsupportedUsageFlags(address()); }

    }

}