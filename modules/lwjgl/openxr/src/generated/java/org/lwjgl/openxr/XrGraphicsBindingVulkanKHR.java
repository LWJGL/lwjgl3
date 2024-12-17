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
 * <pre>{@code
 * struct XrGraphicsBindingVulkanKHR {
 *     XrStructureType type;
 *     void const * next;
 *     VkInstance instance;
 *     VkPhysicalDevice physicalDevice;
 *     VkDevice device;
 *     uint32_t queueFamilyIndex;
 *     uint32_t queueIndex;
 * }}</pre>
 */
public class XrGraphicsBindingVulkanKHR extends Struct<XrGraphicsBindingVulkanKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        INSTANCE,
        PHYSICALDEVICE,
        DEVICE,
        QUEUEFAMILYINDEX,
        QUEUEINDEX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        INSTANCE = layout.offsetof(2);
        PHYSICALDEVICE = layout.offsetof(3);
        DEVICE = layout.offsetof(4);
        QUEUEFAMILYINDEX = layout.offsetof(5);
        QUEUEINDEX = layout.offsetof(6);
    }

    protected XrGraphicsBindingVulkanKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrGraphicsBindingVulkanKHR create(long address, @Nullable ByteBuffer container) {
        return new XrGraphicsBindingVulkanKHR(address, container);
    }

    /**
     * Creates a {@code XrGraphicsBindingVulkanKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrGraphicsBindingVulkanKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code instance} field. */
    @NativeType("VkInstance")
    public long instance() { return ninstance(address()); }
    /** @return the value of the {@code physicalDevice} field. */
    @NativeType("VkPhysicalDevice")
    public long physicalDevice() { return nphysicalDevice(address()); }
    /** @return the value of the {@code device} field. */
    @NativeType("VkDevice")
    public long device() { return ndevice(address()); }
    /** @return the value of the {@code queueFamilyIndex} field. */
    @NativeType("uint32_t")
    public int queueFamilyIndex() { return nqueueFamilyIndex(address()); }
    /** @return the value of the {@code queueIndex} field. */
    @NativeType("uint32_t")
    public int queueIndex() { return nqueueIndex(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrGraphicsBindingVulkanKHR type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link KHRVulkanEnable#XR_TYPE_GRAPHICS_BINDING_VULKAN_KHR TYPE_GRAPHICS_BINDING_VULKAN_KHR} value to the {@code type} field. */
    public XrGraphicsBindingVulkanKHR type$Default() { return type(KHRVulkanEnable.XR_TYPE_GRAPHICS_BINDING_VULKAN_KHR); }
    /** Sets the specified value to the {@code next} field. */
    public XrGraphicsBindingVulkanKHR next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code instance} field. */
    public XrGraphicsBindingVulkanKHR instance(VkInstance value) { ninstance(address(), value); return this; }
    /** Sets the specified value to the {@code physicalDevice} field. */
    public XrGraphicsBindingVulkanKHR physicalDevice(VkPhysicalDevice value) { nphysicalDevice(address(), value); return this; }
    /** Sets the specified value to the {@code device} field. */
    public XrGraphicsBindingVulkanKHR device(VkDevice value) { ndevice(address(), value); return this; }
    /** Sets the specified value to the {@code queueFamilyIndex} field. */
    public XrGraphicsBindingVulkanKHR queueFamilyIndex(@NativeType("uint32_t") int value) { nqueueFamilyIndex(address(), value); return this; }
    /** Sets the specified value to the {@code queueIndex} field. */
    public XrGraphicsBindingVulkanKHR queueIndex(@NativeType("uint32_t") int value) { nqueueIndex(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrGraphicsBindingVulkanKHR set(
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
    public XrGraphicsBindingVulkanKHR set(XrGraphicsBindingVulkanKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrGraphicsBindingVulkanKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrGraphicsBindingVulkanKHR malloc() {
        return new XrGraphicsBindingVulkanKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrGraphicsBindingVulkanKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrGraphicsBindingVulkanKHR calloc() {
        return new XrGraphicsBindingVulkanKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrGraphicsBindingVulkanKHR} instance allocated with {@link BufferUtils}. */
    public static XrGraphicsBindingVulkanKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrGraphicsBindingVulkanKHR(memAddress(container), container);
    }

    /** Returns a new {@code XrGraphicsBindingVulkanKHR} instance for the specified memory address. */
    public static XrGraphicsBindingVulkanKHR create(long address) {
        return new XrGraphicsBindingVulkanKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrGraphicsBindingVulkanKHR createSafe(long address) {
        return address == NULL ? null : new XrGraphicsBindingVulkanKHR(address, null);
    }

    /**
     * Returns a new {@link XrGraphicsBindingVulkanKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingVulkanKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrGraphicsBindingVulkanKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingVulkanKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGraphicsBindingVulkanKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingVulkanKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrGraphicsBindingVulkanKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingVulkanKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrGraphicsBindingVulkanKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrGraphicsBindingVulkanKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGraphicsBindingVulkanKHR malloc(MemoryStack stack) {
        return new XrGraphicsBindingVulkanKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrGraphicsBindingVulkanKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGraphicsBindingVulkanKHR calloc(MemoryStack stack) {
        return new XrGraphicsBindingVulkanKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrGraphicsBindingVulkanKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingVulkanKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGraphicsBindingVulkanKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingVulkanKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrGraphicsBindingVulkanKHR.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrGraphicsBindingVulkanKHR.NEXT); }
    /** Unsafe version of {@link #instance}. */
    public static long ninstance(long struct) { return memGetAddress(struct + XrGraphicsBindingVulkanKHR.INSTANCE); }
    /** Unsafe version of {@link #physicalDevice}. */
    public static long nphysicalDevice(long struct) { return memGetAddress(struct + XrGraphicsBindingVulkanKHR.PHYSICALDEVICE); }
    /** Unsafe version of {@link #device}. */
    public static long ndevice(long struct) { return memGetAddress(struct + XrGraphicsBindingVulkanKHR.DEVICE); }
    /** Unsafe version of {@link #queueFamilyIndex}. */
    public static int nqueueFamilyIndex(long struct) { return memGetInt(struct + XrGraphicsBindingVulkanKHR.QUEUEFAMILYINDEX); }
    /** Unsafe version of {@link #queueIndex}. */
    public static int nqueueIndex(long struct) { return memGetInt(struct + XrGraphicsBindingVulkanKHR.QUEUEINDEX); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrGraphicsBindingVulkanKHR.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrGraphicsBindingVulkanKHR.NEXT, value); }
    /** Unsafe version of {@link #instance(VkInstance) instance}. */
    public static void ninstance(long struct, VkInstance value) { memPutAddress(struct + XrGraphicsBindingVulkanKHR.INSTANCE, value.address()); }
    /** Unsafe version of {@link #physicalDevice(VkPhysicalDevice) physicalDevice}. */
    public static void nphysicalDevice(long struct, VkPhysicalDevice value) { memPutAddress(struct + XrGraphicsBindingVulkanKHR.PHYSICALDEVICE, value.address()); }
    /** Unsafe version of {@link #device(VkDevice) device}. */
    public static void ndevice(long struct, VkDevice value) { memPutAddress(struct + XrGraphicsBindingVulkanKHR.DEVICE, value.address()); }
    /** Unsafe version of {@link #queueFamilyIndex(int) queueFamilyIndex}. */
    public static void nqueueFamilyIndex(long struct, int value) { memPutInt(struct + XrGraphicsBindingVulkanKHR.QUEUEFAMILYINDEX, value); }
    /** Unsafe version of {@link #queueIndex(int) queueIndex}. */
    public static void nqueueIndex(long struct, int value) { memPutInt(struct + XrGraphicsBindingVulkanKHR.QUEUEINDEX, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrGraphicsBindingVulkanKHR.INSTANCE));
        check(memGetAddress(struct + XrGraphicsBindingVulkanKHR.PHYSICALDEVICE));
        check(memGetAddress(struct + XrGraphicsBindingVulkanKHR.DEVICE));
    }

    // -----------------------------------

    /** An array of {@link XrGraphicsBindingVulkanKHR} structs. */
    public static class Buffer extends StructBuffer<XrGraphicsBindingVulkanKHR, Buffer> implements NativeResource {

        private static final XrGraphicsBindingVulkanKHR ELEMENT_FACTORY = XrGraphicsBindingVulkanKHR.create(-1L);

        /**
         * Creates a new {@code XrGraphicsBindingVulkanKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrGraphicsBindingVulkanKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrGraphicsBindingVulkanKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrGraphicsBindingVulkanKHR.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrGraphicsBindingVulkanKHR.nnext(address()); }
        /** @return the value of the {@code instance} field. */
        @NativeType("VkInstance")
        public long instance() { return XrGraphicsBindingVulkanKHR.ninstance(address()); }
        /** @return the value of the {@code physicalDevice} field. */
        @NativeType("VkPhysicalDevice")
        public long physicalDevice() { return XrGraphicsBindingVulkanKHR.nphysicalDevice(address()); }
        /** @return the value of the {@code device} field. */
        @NativeType("VkDevice")
        public long device() { return XrGraphicsBindingVulkanKHR.ndevice(address()); }
        /** @return the value of the {@code queueFamilyIndex} field. */
        @NativeType("uint32_t")
        public int queueFamilyIndex() { return XrGraphicsBindingVulkanKHR.nqueueFamilyIndex(address()); }
        /** @return the value of the {@code queueIndex} field. */
        @NativeType("uint32_t")
        public int queueIndex() { return XrGraphicsBindingVulkanKHR.nqueueIndex(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrGraphicsBindingVulkanKHR.Buffer type(@NativeType("XrStructureType") int value) { XrGraphicsBindingVulkanKHR.ntype(address(), value); return this; }
        /** Sets the {@link KHRVulkanEnable#XR_TYPE_GRAPHICS_BINDING_VULKAN_KHR TYPE_GRAPHICS_BINDING_VULKAN_KHR} value to the {@code type} field. */
        public XrGraphicsBindingVulkanKHR.Buffer type$Default() { return type(KHRVulkanEnable.XR_TYPE_GRAPHICS_BINDING_VULKAN_KHR); }
        /** Sets the specified value to the {@code next} field. */
        public XrGraphicsBindingVulkanKHR.Buffer next(@NativeType("void const *") long value) { XrGraphicsBindingVulkanKHR.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code instance} field. */
        public XrGraphicsBindingVulkanKHR.Buffer instance(VkInstance value) { XrGraphicsBindingVulkanKHR.ninstance(address(), value); return this; }
        /** Sets the specified value to the {@code physicalDevice} field. */
        public XrGraphicsBindingVulkanKHR.Buffer physicalDevice(VkPhysicalDevice value) { XrGraphicsBindingVulkanKHR.nphysicalDevice(address(), value); return this; }
        /** Sets the specified value to the {@code device} field. */
        public XrGraphicsBindingVulkanKHR.Buffer device(VkDevice value) { XrGraphicsBindingVulkanKHR.ndevice(address(), value); return this; }
        /** Sets the specified value to the {@code queueFamilyIndex} field. */
        public XrGraphicsBindingVulkanKHR.Buffer queueFamilyIndex(@NativeType("uint32_t") int value) { XrGraphicsBindingVulkanKHR.nqueueFamilyIndex(address(), value); return this; }
        /** Sets the specified value to the {@code queueIndex} field. */
        public XrGraphicsBindingVulkanKHR.Buffer queueIndex(@NativeType("uint32_t") int value) { XrGraphicsBindingVulkanKHR.nqueueIndex(address(), value); return this; }

    }

}