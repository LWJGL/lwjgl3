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
 * Structure specifying image format properties.
 * 
 * <h5>Description</h5>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>If no format feature flags are supported, the format itself is not supported, and images of that format cannot be created.</p>
 * </div>
 * 
 * <p>If {@code format} is a block-compressed format, then {@code bufferFeatures} <b>must</b> not support any features for the format.</p>
 * 
 * <p>If {@code format} is not a multi-plane format then {@code linearTilingFeatures} and {@code optimalTilingFeatures} <b>must</b> not contain {@link VK11#VK_FORMAT_FEATURE_DISJOINT_BIT FORMAT_FEATURE_DISJOINT_BIT}.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkFormatProperties2}, {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkFormatProperties {
 *     VkFormatFeatureFlags {@link #linearTilingFeatures};
 *     VkFormatFeatureFlags {@link #optimalTilingFeatures};
 *     VkFormatFeatureFlags {@link #bufferFeatures};
 * }</code></pre>
 */
public class VkFormatProperties extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        LINEARTILINGFEATURES,
        OPTIMALTILINGFEATURES,
        BUFFERFEATURES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        LINEARTILINGFEATURES = layout.offsetof(0);
        OPTIMALTILINGFEATURES = layout.offsetof(1);
        BUFFERFEATURES = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkFormatProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkFormatProperties(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a bitmask of {@code VkFormatFeatureFlagBits} specifying features supported by images created with a {@code tiling} parameter of {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR}. */
    @NativeType("VkFormatFeatureFlags")
    public int linearTilingFeatures() { return nlinearTilingFeatures(address()); }
    /** a bitmask of {@code VkFormatFeatureFlagBits} specifying features supported by images created with a {@code tiling} parameter of {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}. */
    @NativeType("VkFormatFeatureFlags")
    public int optimalTilingFeatures() { return noptimalTilingFeatures(address()); }
    /** a bitmask of {@code VkFormatFeatureFlagBits} specifying features supported by buffers. */
    @NativeType("VkFormatFeatureFlags")
    public int bufferFeatures() { return nbufferFeatures(address()); }

    // -----------------------------------

    /** Returns a new {@code VkFormatProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkFormatProperties malloc() {
        return wrap(VkFormatProperties.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkFormatProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkFormatProperties calloc() {
        return wrap(VkFormatProperties.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkFormatProperties} instance allocated with {@link BufferUtils}. */
    public static VkFormatProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkFormatProperties.class, memAddress(container), container);
    }

    /** Returns a new {@code VkFormatProperties} instance for the specified memory address. */
    public static VkFormatProperties create(long address) {
        return wrap(VkFormatProperties.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkFormatProperties createSafe(long address) {
        return address == NULL ? null : wrap(VkFormatProperties.class, address);
    }

    /**
     * Returns a new {@link VkFormatProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkFormatProperties.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkFormatProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkFormatProperties.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFormatProperties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkFormatProperties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkFormatProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkFormatProperties.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkFormatProperties.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkFormatProperties mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkFormatProperties callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkFormatProperties mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkFormatProperties callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkFormatProperties.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkFormatProperties.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkFormatProperties.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkFormatProperties.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkFormatProperties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFormatProperties malloc(MemoryStack stack) {
        return wrap(VkFormatProperties.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkFormatProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFormatProperties calloc(MemoryStack stack) {
        return wrap(VkFormatProperties.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkFormatProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkFormatProperties.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFormatProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkFormatProperties.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #linearTilingFeatures}. */
    public static int nlinearTilingFeatures(long struct) { return UNSAFE.getInt(null, struct + VkFormatProperties.LINEARTILINGFEATURES); }
    /** Unsafe version of {@link #optimalTilingFeatures}. */
    public static int noptimalTilingFeatures(long struct) { return UNSAFE.getInt(null, struct + VkFormatProperties.OPTIMALTILINGFEATURES); }
    /** Unsafe version of {@link #bufferFeatures}. */
    public static int nbufferFeatures(long struct) { return UNSAFE.getInt(null, struct + VkFormatProperties.BUFFERFEATURES); }

    // -----------------------------------

    /** An array of {@link VkFormatProperties} structs. */
    public static class Buffer extends StructBuffer<VkFormatProperties, Buffer> implements NativeResource {

        private static final VkFormatProperties ELEMENT_FACTORY = VkFormatProperties.create(-1L);

        /**
         * Creates a new {@code VkFormatProperties.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkFormatProperties#SIZEOF}, and its mark will be undefined.
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
        protected VkFormatProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkFormatProperties#linearTilingFeatures} field. */
        @NativeType("VkFormatFeatureFlags")
        public int linearTilingFeatures() { return VkFormatProperties.nlinearTilingFeatures(address()); }
        /** @return the value of the {@link VkFormatProperties#optimalTilingFeatures} field. */
        @NativeType("VkFormatFeatureFlags")
        public int optimalTilingFeatures() { return VkFormatProperties.noptimalTilingFeatures(address()); }
        /** @return the value of the {@link VkFormatProperties#bufferFeatures} field. */
        @NativeType("VkFormatFeatureFlags")
        public int bufferFeatures() { return VkFormatProperties.nbufferFeatures(address()); }

    }

}