/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import org.lwjgl.vulkan.*;

/**
 * Debug utils object name info.
 * 
 * <h5>Description</h5>
 * 
 * <p>The runtime <b>must</b> return {@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED} if any bit of either {@code additionalCreateFlags} or {@code additionalUsageFlags} is not supported.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link METAVulkanSwapchainCreateInfo XR_META_vulkan_swapchain_create_info} extension <b>must</b> be enabled prior to using {@link XrVulkanSwapchainCreateInfoMETA}</li>
 * <li>{@code type} <b>must</b> be {@link METAVulkanSwapchainCreateInfo#XR_TYPE_VULKAN_SWAPCHAIN_CREATE_INFO_META TYPE_VULKAN_SWAPCHAIN_CREATE_INFO_META}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code additionalCreateFlags} <b>must</b> be a valid {@code VkImageCreateFlags} value</li>
 * <li>{@code additionalUsageFlags} <b>must</b> be a valid {@code VkImageUsageFlags} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrVulkanSwapchainCreateInfoMETA {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     VkImageCreateFlags {@link #additionalCreateFlags};
 *     VkImageUsageFlags {@link #additionalUsageFlags};
 * }</code></pre>
 */
public class XrVulkanSwapchainCreateInfoMETA extends Struct<XrVulkanSwapchainCreateInfoMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ADDITIONALCREATEFLAGS,
        ADDITIONALUSAGEFLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        ADDITIONALCREATEFLAGS = layout.offsetof(2);
        ADDITIONALUSAGEFLAGS = layout.offsetof(3);
    }

    protected XrVulkanSwapchainCreateInfoMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrVulkanSwapchainCreateInfoMETA create(long address, @Nullable ByteBuffer container) {
        return new XrVulkanSwapchainCreateInfoMETA(address, container);
    }

    /**
     * Creates a {@code XrVulkanSwapchainCreateInfoMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrVulkanSwapchainCreateInfoMETA(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** a bitmask of {@code VkImageCreateFlags} describing additional parameters of an image. */
    @NativeType("VkImageCreateFlags")
    public int additionalCreateFlags() { return nadditionalCreateFlags(address()); }
    /** a bitmask of {@code VkImageUsageFlags} describing additional parameters of an image. */
    @NativeType("VkImageUsageFlags")
    public int additionalUsageFlags() { return nadditionalUsageFlags(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrVulkanSwapchainCreateInfoMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAVulkanSwapchainCreateInfo#XR_TYPE_VULKAN_SWAPCHAIN_CREATE_INFO_META TYPE_VULKAN_SWAPCHAIN_CREATE_INFO_META} value to the {@link #type} field. */
    public XrVulkanSwapchainCreateInfoMETA type$Default() { return type(METAVulkanSwapchainCreateInfo.XR_TYPE_VULKAN_SWAPCHAIN_CREATE_INFO_META); }
    /** Sets the specified value to the {@link #next} field. */
    public XrVulkanSwapchainCreateInfoMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #additionalCreateFlags} field. */
    public XrVulkanSwapchainCreateInfoMETA additionalCreateFlags(@NativeType("VkImageCreateFlags") int value) { nadditionalCreateFlags(address(), value); return this; }
    /** Sets the specified value to the {@link #additionalUsageFlags} field. */
    public XrVulkanSwapchainCreateInfoMETA additionalUsageFlags(@NativeType("VkImageUsageFlags") int value) { nadditionalUsageFlags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrVulkanSwapchainCreateInfoMETA set(
        int type,
        long next,
        int additionalCreateFlags,
        int additionalUsageFlags
    ) {
        type(type);
        next(next);
        additionalCreateFlags(additionalCreateFlags);
        additionalUsageFlags(additionalUsageFlags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrVulkanSwapchainCreateInfoMETA set(XrVulkanSwapchainCreateInfoMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrVulkanSwapchainCreateInfoMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrVulkanSwapchainCreateInfoMETA malloc() {
        return new XrVulkanSwapchainCreateInfoMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrVulkanSwapchainCreateInfoMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrVulkanSwapchainCreateInfoMETA calloc() {
        return new XrVulkanSwapchainCreateInfoMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrVulkanSwapchainCreateInfoMETA} instance allocated with {@link BufferUtils}. */
    public static XrVulkanSwapchainCreateInfoMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrVulkanSwapchainCreateInfoMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrVulkanSwapchainCreateInfoMETA} instance for the specified memory address. */
    public static XrVulkanSwapchainCreateInfoMETA create(long address) {
        return new XrVulkanSwapchainCreateInfoMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrVulkanSwapchainCreateInfoMETA createSafe(long address) {
        return address == NULL ? null : new XrVulkanSwapchainCreateInfoMETA(address, null);
    }

    /**
     * Returns a new {@link XrVulkanSwapchainCreateInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrVulkanSwapchainCreateInfoMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrVulkanSwapchainCreateInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrVulkanSwapchainCreateInfoMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrVulkanSwapchainCreateInfoMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrVulkanSwapchainCreateInfoMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrVulkanSwapchainCreateInfoMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrVulkanSwapchainCreateInfoMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrVulkanSwapchainCreateInfoMETA.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrVulkanSwapchainCreateInfoMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrVulkanSwapchainCreateInfoMETA malloc(MemoryStack stack) {
        return new XrVulkanSwapchainCreateInfoMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrVulkanSwapchainCreateInfoMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrVulkanSwapchainCreateInfoMETA calloc(MemoryStack stack) {
        return new XrVulkanSwapchainCreateInfoMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrVulkanSwapchainCreateInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrVulkanSwapchainCreateInfoMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrVulkanSwapchainCreateInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrVulkanSwapchainCreateInfoMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrVulkanSwapchainCreateInfoMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrVulkanSwapchainCreateInfoMETA.NEXT); }
    /** Unsafe version of {@link #additionalCreateFlags}. */
    public static int nadditionalCreateFlags(long struct) { return UNSAFE.getInt(null, struct + XrVulkanSwapchainCreateInfoMETA.ADDITIONALCREATEFLAGS); }
    /** Unsafe version of {@link #additionalUsageFlags}. */
    public static int nadditionalUsageFlags(long struct) { return UNSAFE.getInt(null, struct + XrVulkanSwapchainCreateInfoMETA.ADDITIONALUSAGEFLAGS); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrVulkanSwapchainCreateInfoMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrVulkanSwapchainCreateInfoMETA.NEXT, value); }
    /** Unsafe version of {@link #additionalCreateFlags(int) additionalCreateFlags}. */
    public static void nadditionalCreateFlags(long struct, int value) { UNSAFE.putInt(null, struct + XrVulkanSwapchainCreateInfoMETA.ADDITIONALCREATEFLAGS, value); }
    /** Unsafe version of {@link #additionalUsageFlags(int) additionalUsageFlags}. */
    public static void nadditionalUsageFlags(long struct, int value) { UNSAFE.putInt(null, struct + XrVulkanSwapchainCreateInfoMETA.ADDITIONALUSAGEFLAGS, value); }

    // -----------------------------------

    /** An array of {@link XrVulkanSwapchainCreateInfoMETA} structs. */
    public static class Buffer extends StructBuffer<XrVulkanSwapchainCreateInfoMETA, Buffer> implements NativeResource {

        private static final XrVulkanSwapchainCreateInfoMETA ELEMENT_FACTORY = XrVulkanSwapchainCreateInfoMETA.create(-1L);

        /**
         * Creates a new {@code XrVulkanSwapchainCreateInfoMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrVulkanSwapchainCreateInfoMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrVulkanSwapchainCreateInfoMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrVulkanSwapchainCreateInfoMETA#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrVulkanSwapchainCreateInfoMETA.ntype(address()); }
        /** @return the value of the {@link XrVulkanSwapchainCreateInfoMETA#next} field. */
        @NativeType("void const *")
        public long next() { return XrVulkanSwapchainCreateInfoMETA.nnext(address()); }
        /** @return the value of the {@link XrVulkanSwapchainCreateInfoMETA#additionalCreateFlags} field. */
        @NativeType("VkImageCreateFlags")
        public int additionalCreateFlags() { return XrVulkanSwapchainCreateInfoMETA.nadditionalCreateFlags(address()); }
        /** @return the value of the {@link XrVulkanSwapchainCreateInfoMETA#additionalUsageFlags} field. */
        @NativeType("VkImageUsageFlags")
        public int additionalUsageFlags() { return XrVulkanSwapchainCreateInfoMETA.nadditionalUsageFlags(address()); }

        /** Sets the specified value to the {@link XrVulkanSwapchainCreateInfoMETA#type} field. */
        public XrVulkanSwapchainCreateInfoMETA.Buffer type(@NativeType("XrStructureType") int value) { XrVulkanSwapchainCreateInfoMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAVulkanSwapchainCreateInfo#XR_TYPE_VULKAN_SWAPCHAIN_CREATE_INFO_META TYPE_VULKAN_SWAPCHAIN_CREATE_INFO_META} value to the {@link XrVulkanSwapchainCreateInfoMETA#type} field. */
        public XrVulkanSwapchainCreateInfoMETA.Buffer type$Default() { return type(METAVulkanSwapchainCreateInfo.XR_TYPE_VULKAN_SWAPCHAIN_CREATE_INFO_META); }
        /** Sets the specified value to the {@link XrVulkanSwapchainCreateInfoMETA#next} field. */
        public XrVulkanSwapchainCreateInfoMETA.Buffer next(@NativeType("void const *") long value) { XrVulkanSwapchainCreateInfoMETA.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrVulkanSwapchainCreateInfoMETA#additionalCreateFlags} field. */
        public XrVulkanSwapchainCreateInfoMETA.Buffer additionalCreateFlags(@NativeType("VkImageCreateFlags") int value) { XrVulkanSwapchainCreateInfoMETA.nadditionalCreateFlags(address(), value); return this; }
        /** Sets the specified value to the {@link XrVulkanSwapchainCreateInfoMETA#additionalUsageFlags} field. */
        public XrVulkanSwapchainCreateInfoMETA.Buffer additionalUsageFlags(@NativeType("VkImageUsageFlags") int value) { XrVulkanSwapchainCreateInfoMETA.nadditionalUsageFlags(address(), value); return this; }

    }

}