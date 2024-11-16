/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import org.lwjgl.vulkan.*;

/**
 * See {@link XrGraphicsBindingVulkanKHR}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrGraphicsBindingVulkan2KHR {
 *     XrStructureType type;
 *     void const * next;
 *     VkInstance instance;
 *     VkPhysicalDevice physicalDevice;
 *     VkDevice device;
 *     uint32_t queueFamilyIndex;
 *     uint32_t queueIndex;
 * }</code></pre>
 */
public class XrGraphicsBindingVulkan2KHR extends XrGraphicsBindingVulkanKHR {

    protected XrGraphicsBindingVulkan2KHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrGraphicsBindingVulkan2KHR create(long address, @Nullable ByteBuffer container) {
        return new XrGraphicsBindingVulkan2KHR(address, container);
    }

    /**
     * Creates a {@code XrGraphicsBindingVulkan2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrGraphicsBindingVulkan2KHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code type} field. */
    @Override
    public XrGraphicsBindingVulkan2KHR type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link KHRVulkanEnable#XR_TYPE_GRAPHICS_BINDING_VULKAN_KHR TYPE_GRAPHICS_BINDING_VULKAN_KHR} value to the {@code type} field. */
    @Override
    public XrGraphicsBindingVulkan2KHR type$Default() { return type(KHRVulkanEnable.XR_TYPE_GRAPHICS_BINDING_VULKAN_KHR); }
    /** Sets the specified value to the {@code next} field. */
    @Override
    public XrGraphicsBindingVulkan2KHR next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code instance} field. */
    @Override
    public XrGraphicsBindingVulkan2KHR instance(VkInstance value) { ninstance(address(), value); return this; }
    /** Sets the specified value to the {@code physicalDevice} field. */
    @Override
    public XrGraphicsBindingVulkan2KHR physicalDevice(VkPhysicalDevice value) { nphysicalDevice(address(), value); return this; }
    /** Sets the specified value to the {@code device} field. */
    @Override
    public XrGraphicsBindingVulkan2KHR device(VkDevice value) { ndevice(address(), value); return this; }
    /** Sets the specified value to the {@code queueFamilyIndex} field. */
    @Override
    public XrGraphicsBindingVulkan2KHR queueFamilyIndex(@NativeType("uint32_t") int value) { nqueueFamilyIndex(address(), value); return this; }
    /** Sets the specified value to the {@code queueIndex} field. */
    @Override
    public XrGraphicsBindingVulkan2KHR queueIndex(@NativeType("uint32_t") int value) { nqueueIndex(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public XrGraphicsBindingVulkan2KHR set(
        int type,
        long next,
        VkInstance instance,
        VkPhysicalDevice physicalDevice,
        VkDevice device,
        int queueFamilyIndex,
        int queueIndex
    ) {
        type(type);
        next(next);
        instance(instance);
        physicalDevice(physicalDevice);
        device(device);
        queueFamilyIndex(queueFamilyIndex);
        queueIndex(queueIndex);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrGraphicsBindingVulkan2KHR set(XrGraphicsBindingVulkan2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrGraphicsBindingVulkan2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrGraphicsBindingVulkan2KHR malloc() {
        return new XrGraphicsBindingVulkan2KHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrGraphicsBindingVulkan2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrGraphicsBindingVulkan2KHR calloc() {
        return new XrGraphicsBindingVulkan2KHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrGraphicsBindingVulkan2KHR} instance allocated with {@link BufferUtils}. */
    public static XrGraphicsBindingVulkan2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrGraphicsBindingVulkan2KHR(memAddress(container), container);
    }

    /** Returns a new {@code XrGraphicsBindingVulkan2KHR} instance for the specified memory address. */
    public static XrGraphicsBindingVulkan2KHR create(long address) {
        return new XrGraphicsBindingVulkan2KHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrGraphicsBindingVulkan2KHR createSafe(long address) {
        return address == NULL ? null : new XrGraphicsBindingVulkan2KHR(address, null);
    }

    /**
     * Returns a new {@link XrGraphicsBindingVulkan2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingVulkan2KHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrGraphicsBindingVulkan2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingVulkan2KHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGraphicsBindingVulkan2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingVulkan2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrGraphicsBindingVulkan2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingVulkan2KHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrGraphicsBindingVulkan2KHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrGraphicsBindingVulkan2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGraphicsBindingVulkan2KHR malloc(MemoryStack stack) {
        return new XrGraphicsBindingVulkan2KHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrGraphicsBindingVulkan2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGraphicsBindingVulkan2KHR calloc(MemoryStack stack) {
        return new XrGraphicsBindingVulkan2KHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrGraphicsBindingVulkan2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingVulkan2KHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGraphicsBindingVulkan2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingVulkan2KHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link XrGraphicsBindingVulkan2KHR} structs. */
    public static class Buffer extends XrGraphicsBindingVulkanKHR.Buffer {

        private static final XrGraphicsBindingVulkan2KHR ELEMENT_FACTORY = XrGraphicsBindingVulkan2KHR.create(-1L);

        /**
         * Creates a new {@code XrGraphicsBindingVulkan2KHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrGraphicsBindingVulkan2KHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrGraphicsBindingVulkan2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code type} field. */
        @Override
        public XrGraphicsBindingVulkan2KHR.Buffer type(@NativeType("XrStructureType") int value) { XrGraphicsBindingVulkan2KHR.ntype(address(), value); return this; }
        /** Sets the {@link KHRVulkanEnable#XR_TYPE_GRAPHICS_BINDING_VULKAN_KHR TYPE_GRAPHICS_BINDING_VULKAN_KHR} value to the {@code type} field. */
        @Override
        public XrGraphicsBindingVulkan2KHR.Buffer type$Default() { return type(KHRVulkanEnable.XR_TYPE_GRAPHICS_BINDING_VULKAN_KHR); }
        /** Sets the specified value to the {@code next} field. */
        @Override
        public XrGraphicsBindingVulkan2KHR.Buffer next(@NativeType("void const *") long value) { XrGraphicsBindingVulkan2KHR.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code instance} field. */
        @Override
        public XrGraphicsBindingVulkan2KHR.Buffer instance(VkInstance value) { XrGraphicsBindingVulkan2KHR.ninstance(address(), value); return this; }
        /** Sets the specified value to the {@code physicalDevice} field. */
        @Override
        public XrGraphicsBindingVulkan2KHR.Buffer physicalDevice(VkPhysicalDevice value) { XrGraphicsBindingVulkan2KHR.nphysicalDevice(address(), value); return this; }
        /** Sets the specified value to the {@code device} field. */
        @Override
        public XrGraphicsBindingVulkan2KHR.Buffer device(VkDevice value) { XrGraphicsBindingVulkan2KHR.ndevice(address(), value); return this; }
        /** Sets the specified value to the {@code queueFamilyIndex} field. */
        @Override
        public XrGraphicsBindingVulkan2KHR.Buffer queueFamilyIndex(@NativeType("uint32_t") int value) { XrGraphicsBindingVulkan2KHR.nqueueFamilyIndex(address(), value); return this; }
        /** Sets the specified value to the {@code queueIndex} field. */
        @Override
        public XrGraphicsBindingVulkan2KHR.Buffer queueIndex(@NativeType("uint32_t") int value) { XrGraphicsBindingVulkan2KHR.nqueueIndex(address(), value); return this; }

    }

}