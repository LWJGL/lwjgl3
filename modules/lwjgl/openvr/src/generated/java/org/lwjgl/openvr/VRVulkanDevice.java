/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VRVulkanDevice_t {
 *     VkInstance_T * m_pInstance;
 *     VkDevice_T * m_pDevice;
 *     VkPhysicalDevice_T * m_pPhysicalDevice;
 *     VkQueue_T * m_pQueue;
 *     uint32_t m_uQueueFamilyIndex;
 * }</code></pre>
 */
@NativeType("struct VRVulkanDevice_t")
public class VRVulkanDevice extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        M_PINSTANCE,
        M_PDEVICE,
        M_PPHYSICALDEVICE,
        M_PQUEUE,
        M_UQUEUEFAMILYINDEX;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        M_PINSTANCE = layout.offsetof(0);
        M_PDEVICE = layout.offsetof(1);
        M_PPHYSICALDEVICE = layout.offsetof(2);
        M_PQUEUE = layout.offsetof(3);
        M_UQUEUEFAMILYINDEX = layout.offsetof(4);
    }

    /**
     * Creates a {@code VRVulkanDevice} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VRVulkanDevice(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code m_pInstance} field. */
    @NativeType("VkInstance_T *")
    public long m_pInstance() { return nm_pInstance(address()); }
    /** @return the value of the {@code m_pDevice} field. */
    @NativeType("VkDevice_T *")
    public long m_pDevice() { return nm_pDevice(address()); }
    /** @return the value of the {@code m_pPhysicalDevice} field. */
    @NativeType("VkPhysicalDevice_T *")
    public long m_pPhysicalDevice() { return nm_pPhysicalDevice(address()); }
    /** @return the value of the {@code m_pQueue} field. */
    @NativeType("VkQueue_T *")
    public long m_pQueue() { return nm_pQueue(address()); }
    /** @return the value of the {@code m_uQueueFamilyIndex} field. */
    @NativeType("uint32_t")
    public int m_uQueueFamilyIndex() { return nm_uQueueFamilyIndex(address()); }

    /** Sets the specified value to the {@code m_pInstance} field. */
    public VRVulkanDevice m_pInstance(@NativeType("VkInstance_T *") long value) { nm_pInstance(address(), value); return this; }
    /** Sets the specified value to the {@code m_pDevice} field. */
    public VRVulkanDevice m_pDevice(@NativeType("VkDevice_T *") long value) { nm_pDevice(address(), value); return this; }
    /** Sets the specified value to the {@code m_pPhysicalDevice} field. */
    public VRVulkanDevice m_pPhysicalDevice(@NativeType("VkPhysicalDevice_T *") long value) { nm_pPhysicalDevice(address(), value); return this; }
    /** Sets the specified value to the {@code m_pQueue} field. */
    public VRVulkanDevice m_pQueue(@NativeType("VkQueue_T *") long value) { nm_pQueue(address(), value); return this; }
    /** Sets the specified value to the {@code m_uQueueFamilyIndex} field. */
    public VRVulkanDevice m_uQueueFamilyIndex(@NativeType("uint32_t") int value) { nm_uQueueFamilyIndex(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VRVulkanDevice set(
        long m_pInstance,
        long m_pDevice,
        long m_pPhysicalDevice,
        long m_pQueue,
        int m_uQueueFamilyIndex
    ) {
        m_pInstance(m_pInstance);
        m_pDevice(m_pDevice);
        m_pPhysicalDevice(m_pPhysicalDevice);
        m_pQueue(m_pQueue);
        m_uQueueFamilyIndex(m_uQueueFamilyIndex);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VRVulkanDevice set(VRVulkanDevice src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VRVulkanDevice} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VRVulkanDevice malloc() {
        return wrap(VRVulkanDevice.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VRVulkanDevice} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VRVulkanDevice calloc() {
        return wrap(VRVulkanDevice.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VRVulkanDevice} instance allocated with {@link BufferUtils}. */
    public static VRVulkanDevice create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VRVulkanDevice.class, memAddress(container), container);
    }

    /** Returns a new {@code VRVulkanDevice} instance for the specified memory address. */
    public static VRVulkanDevice create(long address) {
        return wrap(VRVulkanDevice.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VRVulkanDevice createSafe(long address) {
        return address == NULL ? null : wrap(VRVulkanDevice.class, address);
    }

    /**
     * Returns a new {@link VRVulkanDevice.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VRVulkanDevice.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VRVulkanDevice.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VRVulkanDevice.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VRVulkanDevice.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VRVulkanDevice.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VRVulkanDevice.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VRVulkanDevice.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VRVulkanDevice.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }


    /**
     * Returns a new {@code VRVulkanDevice} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VRVulkanDevice malloc(MemoryStack stack) {
        return wrap(VRVulkanDevice.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VRVulkanDevice} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VRVulkanDevice calloc(MemoryStack stack) {
        return wrap(VRVulkanDevice.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VRVulkanDevice.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VRVulkanDevice.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VRVulkanDevice.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VRVulkanDevice.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m_pInstance}. */
    public static long nm_pInstance(long struct) { return memGetAddress(struct + VRVulkanDevice.M_PINSTANCE); }
    /** Unsafe version of {@link #m_pDevice}. */
    public static long nm_pDevice(long struct) { return memGetAddress(struct + VRVulkanDevice.M_PDEVICE); }
    /** Unsafe version of {@link #m_pPhysicalDevice}. */
    public static long nm_pPhysicalDevice(long struct) { return memGetAddress(struct + VRVulkanDevice.M_PPHYSICALDEVICE); }
    /** Unsafe version of {@link #m_pQueue}. */
    public static long nm_pQueue(long struct) { return memGetAddress(struct + VRVulkanDevice.M_PQUEUE); }
    /** Unsafe version of {@link #m_uQueueFamilyIndex}. */
    public static int nm_uQueueFamilyIndex(long struct) { return UNSAFE.getInt(null, struct + VRVulkanDevice.M_UQUEUEFAMILYINDEX); }

    /** Unsafe version of {@link #m_pInstance(long) m_pInstance}. */
    public static void nm_pInstance(long struct, long value) { memPutAddress(struct + VRVulkanDevice.M_PINSTANCE, check(value)); }
    /** Unsafe version of {@link #m_pDevice(long) m_pDevice}. */
    public static void nm_pDevice(long struct, long value) { memPutAddress(struct + VRVulkanDevice.M_PDEVICE, check(value)); }
    /** Unsafe version of {@link #m_pPhysicalDevice(long) m_pPhysicalDevice}. */
    public static void nm_pPhysicalDevice(long struct, long value) { memPutAddress(struct + VRVulkanDevice.M_PPHYSICALDEVICE, check(value)); }
    /** Unsafe version of {@link #m_pQueue(long) m_pQueue}. */
    public static void nm_pQueue(long struct, long value) { memPutAddress(struct + VRVulkanDevice.M_PQUEUE, check(value)); }
    /** Unsafe version of {@link #m_uQueueFamilyIndex(int) m_uQueueFamilyIndex}. */
    public static void nm_uQueueFamilyIndex(long struct, int value) { UNSAFE.putInt(null, struct + VRVulkanDevice.M_UQUEUEFAMILYINDEX, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VRVulkanDevice.M_PINSTANCE));
        check(memGetAddress(struct + VRVulkanDevice.M_PDEVICE));
        check(memGetAddress(struct + VRVulkanDevice.M_PPHYSICALDEVICE));
        check(memGetAddress(struct + VRVulkanDevice.M_PQUEUE));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VRVulkanDevice} structs. */
    public static class Buffer extends StructBuffer<VRVulkanDevice, Buffer> implements NativeResource {

        private static final VRVulkanDevice ELEMENT_FACTORY = VRVulkanDevice.create(-1L);

        /**
         * Creates a new {@code VRVulkanDevice.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VRVulkanDevice#SIZEOF}, and its mark will be undefined.
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
        protected VRVulkanDevice getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code m_pInstance} field. */
        @NativeType("VkInstance_T *")
        public long m_pInstance() { return VRVulkanDevice.nm_pInstance(address()); }
        /** @return the value of the {@code m_pDevice} field. */
        @NativeType("VkDevice_T *")
        public long m_pDevice() { return VRVulkanDevice.nm_pDevice(address()); }
        /** @return the value of the {@code m_pPhysicalDevice} field. */
        @NativeType("VkPhysicalDevice_T *")
        public long m_pPhysicalDevice() { return VRVulkanDevice.nm_pPhysicalDevice(address()); }
        /** @return the value of the {@code m_pQueue} field. */
        @NativeType("VkQueue_T *")
        public long m_pQueue() { return VRVulkanDevice.nm_pQueue(address()); }
        /** @return the value of the {@code m_uQueueFamilyIndex} field. */
        @NativeType("uint32_t")
        public int m_uQueueFamilyIndex() { return VRVulkanDevice.nm_uQueueFamilyIndex(address()); }

        /** Sets the specified value to the {@code m_pInstance} field. */
        public VRVulkanDevice.Buffer m_pInstance(@NativeType("VkInstance_T *") long value) { VRVulkanDevice.nm_pInstance(address(), value); return this; }
        /** Sets the specified value to the {@code m_pDevice} field. */
        public VRVulkanDevice.Buffer m_pDevice(@NativeType("VkDevice_T *") long value) { VRVulkanDevice.nm_pDevice(address(), value); return this; }
        /** Sets the specified value to the {@code m_pPhysicalDevice} field. */
        public VRVulkanDevice.Buffer m_pPhysicalDevice(@NativeType("VkPhysicalDevice_T *") long value) { VRVulkanDevice.nm_pPhysicalDevice(address(), value); return this; }
        /** Sets the specified value to the {@code m_pQueue} field. */
        public VRVulkanDevice.Buffer m_pQueue(@NativeType("VkQueue_T *") long value) { VRVulkanDevice.nm_pQueue(address(), value); return this; }
        /** Sets the specified value to the {@code m_uQueueFamilyIndex} field. */
        public VRVulkanDevice.Buffer m_uQueueFamilyIndex(@NativeType("uint32_t") int value) { VRVulkanDevice.nm_uQueueFamilyIndex(address(), value); return this; }

    }

}