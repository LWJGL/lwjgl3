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
 * Data required for passing Vulkan textures to {@link VRCompositor#VRCompositor_Submit Submit}. Be sure to call {@link VR#VR_ShutdownInternal ShutdownInternal} before destroying these resources.
 * 
 * <p>Please see <a href="https://github.com/ValveSoftware/openvr/wiki/Vulkan">https://github.com/ValveSoftware/openvr/wiki/Vulkan</a> for Vulkan-specific
 * documentation.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VRVulkanTextureData_t {
 *     uint64_t {@link #m_nImage};
 *     VkDevice_T * m_pDevice;
 *     VkPhysicalDevice_T * m_pPhysicalDevice;
 *     VkInstance_T * m_pInstance;
 *     VkQueue_T * m_pQueue;
 *     uint32_t m_nQueueFamilyIndex;
 *     uint32_t m_nWidth;
 *     uint32_t m_nHeight;
 *     uint32_t m_nFormat;
 *     uint32_t m_nSampleCount;
 * }</code></pre>
 */
@NativeType("struct VRVulkanTextureData_t")
public class VRVulkanTextureData extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        M_NIMAGE,
        M_PDEVICE,
        M_PPHYSICALDEVICE,
        M_PINSTANCE,
        M_PQUEUE,
        M_NQUEUEFAMILYINDEX,
        M_NWIDTH,
        M_NHEIGHT,
        M_NFORMAT,
        M_NSAMPLECOUNT;

    static {
        Layout layout = __struct(
            __member(8),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        M_NIMAGE = layout.offsetof(0);
        M_PDEVICE = layout.offsetof(1);
        M_PPHYSICALDEVICE = layout.offsetof(2);
        M_PINSTANCE = layout.offsetof(3);
        M_PQUEUE = layout.offsetof(4);
        M_NQUEUEFAMILYINDEX = layout.offsetof(5);
        M_NWIDTH = layout.offsetof(6);
        M_NHEIGHT = layout.offsetof(7);
        M_NFORMAT = layout.offsetof(8);
        M_NSAMPLECOUNT = layout.offsetof(9);
    }

    /**
     * Creates a {@code VRVulkanTextureData} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VRVulkanTextureData(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** VkImage */
    @NativeType("uint64_t")
    public long m_nImage() { return nm_nImage(address()); }
    /** @return the value of the {@code m_pDevice} field. */
    @NativeType("VkDevice_T *")
    public long m_pDevice() { return nm_pDevice(address()); }
    /** @return the value of the {@code m_pPhysicalDevice} field. */
    @NativeType("VkPhysicalDevice_T *")
    public long m_pPhysicalDevice() { return nm_pPhysicalDevice(address()); }
    /** @return the value of the {@code m_pInstance} field. */
    @NativeType("VkInstance_T *")
    public long m_pInstance() { return nm_pInstance(address()); }
    /** @return the value of the {@code m_pQueue} field. */
    @NativeType("VkQueue_T *")
    public long m_pQueue() { return nm_pQueue(address()); }
    /** @return the value of the {@code m_nQueueFamilyIndex} field. */
    @NativeType("uint32_t")
    public int m_nQueueFamilyIndex() { return nm_nQueueFamilyIndex(address()); }
    /** @return the value of the {@code m_nWidth} field. */
    @NativeType("uint32_t")
    public int m_nWidth() { return nm_nWidth(address()); }
    /** @return the value of the {@code m_nHeight} field. */
    @NativeType("uint32_t")
    public int m_nHeight() { return nm_nHeight(address()); }
    /** @return the value of the {@code m_nFormat} field. */
    @NativeType("uint32_t")
    public int m_nFormat() { return nm_nFormat(address()); }
    /** @return the value of the {@code m_nSampleCount} field. */
    @NativeType("uint32_t")
    public int m_nSampleCount() { return nm_nSampleCount(address()); }

    /** Sets the specified value to the {@link #m_nImage} field. */
    public VRVulkanTextureData m_nImage(@NativeType("uint64_t") long value) { nm_nImage(address(), value); return this; }
    /** Sets the specified value to the {@code m_pDevice} field. */
    public VRVulkanTextureData m_pDevice(@NativeType("VkDevice_T *") long value) { nm_pDevice(address(), value); return this; }
    /** Sets the specified value to the {@code m_pPhysicalDevice} field. */
    public VRVulkanTextureData m_pPhysicalDevice(@NativeType("VkPhysicalDevice_T *") long value) { nm_pPhysicalDevice(address(), value); return this; }
    /** Sets the specified value to the {@code m_pInstance} field. */
    public VRVulkanTextureData m_pInstance(@NativeType("VkInstance_T *") long value) { nm_pInstance(address(), value); return this; }
    /** Sets the specified value to the {@code m_pQueue} field. */
    public VRVulkanTextureData m_pQueue(@NativeType("VkQueue_T *") long value) { nm_pQueue(address(), value); return this; }
    /** Sets the specified value to the {@code m_nQueueFamilyIndex} field. */
    public VRVulkanTextureData m_nQueueFamilyIndex(@NativeType("uint32_t") int value) { nm_nQueueFamilyIndex(address(), value); return this; }
    /** Sets the specified value to the {@code m_nWidth} field. */
    public VRVulkanTextureData m_nWidth(@NativeType("uint32_t") int value) { nm_nWidth(address(), value); return this; }
    /** Sets the specified value to the {@code m_nHeight} field. */
    public VRVulkanTextureData m_nHeight(@NativeType("uint32_t") int value) { nm_nHeight(address(), value); return this; }
    /** Sets the specified value to the {@code m_nFormat} field. */
    public VRVulkanTextureData m_nFormat(@NativeType("uint32_t") int value) { nm_nFormat(address(), value); return this; }
    /** Sets the specified value to the {@code m_nSampleCount} field. */
    public VRVulkanTextureData m_nSampleCount(@NativeType("uint32_t") int value) { nm_nSampleCount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VRVulkanTextureData set(
        long m_nImage,
        long m_pDevice,
        long m_pPhysicalDevice,
        long m_pInstance,
        long m_pQueue,
        int m_nQueueFamilyIndex,
        int m_nWidth,
        int m_nHeight,
        int m_nFormat,
        int m_nSampleCount
    ) {
        m_nImage(m_nImage);
        m_pDevice(m_pDevice);
        m_pPhysicalDevice(m_pPhysicalDevice);
        m_pInstance(m_pInstance);
        m_pQueue(m_pQueue);
        m_nQueueFamilyIndex(m_nQueueFamilyIndex);
        m_nWidth(m_nWidth);
        m_nHeight(m_nHeight);
        m_nFormat(m_nFormat);
        m_nSampleCount(m_nSampleCount);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VRVulkanTextureData set(VRVulkanTextureData src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VRVulkanTextureData} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VRVulkanTextureData malloc() {
        return wrap(VRVulkanTextureData.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VRVulkanTextureData} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VRVulkanTextureData calloc() {
        return wrap(VRVulkanTextureData.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VRVulkanTextureData} instance allocated with {@link BufferUtils}. */
    public static VRVulkanTextureData create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VRVulkanTextureData.class, memAddress(container), container);
    }

    /** Returns a new {@code VRVulkanTextureData} instance for the specified memory address. */
    public static VRVulkanTextureData create(long address) {
        return wrap(VRVulkanTextureData.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VRVulkanTextureData createSafe(long address) {
        return address == NULL ? null : wrap(VRVulkanTextureData.class, address);
    }

    /**
     * Returns a new {@link VRVulkanTextureData.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VRVulkanTextureData.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VRVulkanTextureData.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VRVulkanTextureData.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VRVulkanTextureData.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VRVulkanTextureData.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VRVulkanTextureData.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VRVulkanTextureData.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VRVulkanTextureData.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VRVulkanTextureData} instance allocated on the thread-local {@link MemoryStack}. */
    public static VRVulkanTextureData mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VRVulkanTextureData} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VRVulkanTextureData callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VRVulkanTextureData} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VRVulkanTextureData mallocStack(MemoryStack stack) {
        return wrap(VRVulkanTextureData.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VRVulkanTextureData} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VRVulkanTextureData callocStack(MemoryStack stack) {
        return wrap(VRVulkanTextureData.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VRVulkanTextureData.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VRVulkanTextureData.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VRVulkanTextureData.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VRVulkanTextureData.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VRVulkanTextureData.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VRVulkanTextureData.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VRVulkanTextureData.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VRVulkanTextureData.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m_nImage}. */
    public static long nm_nImage(long struct) { return UNSAFE.getLong(null, struct + VRVulkanTextureData.M_NIMAGE); }
    /** Unsafe version of {@link #m_pDevice}. */
    public static long nm_pDevice(long struct) { return memGetAddress(struct + VRVulkanTextureData.M_PDEVICE); }
    /** Unsafe version of {@link #m_pPhysicalDevice}. */
    public static long nm_pPhysicalDevice(long struct) { return memGetAddress(struct + VRVulkanTextureData.M_PPHYSICALDEVICE); }
    /** Unsafe version of {@link #m_pInstance}. */
    public static long nm_pInstance(long struct) { return memGetAddress(struct + VRVulkanTextureData.M_PINSTANCE); }
    /** Unsafe version of {@link #m_pQueue}. */
    public static long nm_pQueue(long struct) { return memGetAddress(struct + VRVulkanTextureData.M_PQUEUE); }
    /** Unsafe version of {@link #m_nQueueFamilyIndex}. */
    public static int nm_nQueueFamilyIndex(long struct) { return UNSAFE.getInt(null, struct + VRVulkanTextureData.M_NQUEUEFAMILYINDEX); }
    /** Unsafe version of {@link #m_nWidth}. */
    public static int nm_nWidth(long struct) { return UNSAFE.getInt(null, struct + VRVulkanTextureData.M_NWIDTH); }
    /** Unsafe version of {@link #m_nHeight}. */
    public static int nm_nHeight(long struct) { return UNSAFE.getInt(null, struct + VRVulkanTextureData.M_NHEIGHT); }
    /** Unsafe version of {@link #m_nFormat}. */
    public static int nm_nFormat(long struct) { return UNSAFE.getInt(null, struct + VRVulkanTextureData.M_NFORMAT); }
    /** Unsafe version of {@link #m_nSampleCount}. */
    public static int nm_nSampleCount(long struct) { return UNSAFE.getInt(null, struct + VRVulkanTextureData.M_NSAMPLECOUNT); }

    /** Unsafe version of {@link #m_nImage(long) m_nImage}. */
    public static void nm_nImage(long struct, long value) { UNSAFE.putLong(null, struct + VRVulkanTextureData.M_NIMAGE, value); }
    /** Unsafe version of {@link #m_pDevice(long) m_pDevice}. */
    public static void nm_pDevice(long struct, long value) { memPutAddress(struct + VRVulkanTextureData.M_PDEVICE, check(value)); }
    /** Unsafe version of {@link #m_pPhysicalDevice(long) m_pPhysicalDevice}. */
    public static void nm_pPhysicalDevice(long struct, long value) { memPutAddress(struct + VRVulkanTextureData.M_PPHYSICALDEVICE, check(value)); }
    /** Unsafe version of {@link #m_pInstance(long) m_pInstance}. */
    public static void nm_pInstance(long struct, long value) { memPutAddress(struct + VRVulkanTextureData.M_PINSTANCE, check(value)); }
    /** Unsafe version of {@link #m_pQueue(long) m_pQueue}. */
    public static void nm_pQueue(long struct, long value) { memPutAddress(struct + VRVulkanTextureData.M_PQUEUE, check(value)); }
    /** Unsafe version of {@link #m_nQueueFamilyIndex(int) m_nQueueFamilyIndex}. */
    public static void nm_nQueueFamilyIndex(long struct, int value) { UNSAFE.putInt(null, struct + VRVulkanTextureData.M_NQUEUEFAMILYINDEX, value); }
    /** Unsafe version of {@link #m_nWidth(int) m_nWidth}. */
    public static void nm_nWidth(long struct, int value) { UNSAFE.putInt(null, struct + VRVulkanTextureData.M_NWIDTH, value); }
    /** Unsafe version of {@link #m_nHeight(int) m_nHeight}. */
    public static void nm_nHeight(long struct, int value) { UNSAFE.putInt(null, struct + VRVulkanTextureData.M_NHEIGHT, value); }
    /** Unsafe version of {@link #m_nFormat(int) m_nFormat}. */
    public static void nm_nFormat(long struct, int value) { UNSAFE.putInt(null, struct + VRVulkanTextureData.M_NFORMAT, value); }
    /** Unsafe version of {@link #m_nSampleCount(int) m_nSampleCount}. */
    public static void nm_nSampleCount(long struct, int value) { UNSAFE.putInt(null, struct + VRVulkanTextureData.M_NSAMPLECOUNT, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VRVulkanTextureData.M_PDEVICE));
        check(memGetAddress(struct + VRVulkanTextureData.M_PPHYSICALDEVICE));
        check(memGetAddress(struct + VRVulkanTextureData.M_PINSTANCE));
        check(memGetAddress(struct + VRVulkanTextureData.M_PQUEUE));
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

    /** An array of {@link VRVulkanTextureData} structs. */
    public static class Buffer extends StructBuffer<VRVulkanTextureData, Buffer> implements NativeResource {

        private static final VRVulkanTextureData ELEMENT_FACTORY = VRVulkanTextureData.create(-1L);

        /**
         * Creates a new {@code VRVulkanTextureData.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VRVulkanTextureData#SIZEOF}, and its mark will be undefined.
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
        protected VRVulkanTextureData getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VRVulkanTextureData#m_nImage} field. */
        @NativeType("uint64_t")
        public long m_nImage() { return VRVulkanTextureData.nm_nImage(address()); }
        /** @return the value of the {@code m_pDevice} field. */
        @NativeType("VkDevice_T *")
        public long m_pDevice() { return VRVulkanTextureData.nm_pDevice(address()); }
        /** @return the value of the {@code m_pPhysicalDevice} field. */
        @NativeType("VkPhysicalDevice_T *")
        public long m_pPhysicalDevice() { return VRVulkanTextureData.nm_pPhysicalDevice(address()); }
        /** @return the value of the {@code m_pInstance} field. */
        @NativeType("VkInstance_T *")
        public long m_pInstance() { return VRVulkanTextureData.nm_pInstance(address()); }
        /** @return the value of the {@code m_pQueue} field. */
        @NativeType("VkQueue_T *")
        public long m_pQueue() { return VRVulkanTextureData.nm_pQueue(address()); }
        /** @return the value of the {@code m_nQueueFamilyIndex} field. */
        @NativeType("uint32_t")
        public int m_nQueueFamilyIndex() { return VRVulkanTextureData.nm_nQueueFamilyIndex(address()); }
        /** @return the value of the {@code m_nWidth} field. */
        @NativeType("uint32_t")
        public int m_nWidth() { return VRVulkanTextureData.nm_nWidth(address()); }
        /** @return the value of the {@code m_nHeight} field. */
        @NativeType("uint32_t")
        public int m_nHeight() { return VRVulkanTextureData.nm_nHeight(address()); }
        /** @return the value of the {@code m_nFormat} field. */
        @NativeType("uint32_t")
        public int m_nFormat() { return VRVulkanTextureData.nm_nFormat(address()); }
        /** @return the value of the {@code m_nSampleCount} field. */
        @NativeType("uint32_t")
        public int m_nSampleCount() { return VRVulkanTextureData.nm_nSampleCount(address()); }

        /** Sets the specified value to the {@link VRVulkanTextureData#m_nImage} field. */
        public VRVulkanTextureData.Buffer m_nImage(@NativeType("uint64_t") long value) { VRVulkanTextureData.nm_nImage(address(), value); return this; }
        /** Sets the specified value to the {@code m_pDevice} field. */
        public VRVulkanTextureData.Buffer m_pDevice(@NativeType("VkDevice_T *") long value) { VRVulkanTextureData.nm_pDevice(address(), value); return this; }
        /** Sets the specified value to the {@code m_pPhysicalDevice} field. */
        public VRVulkanTextureData.Buffer m_pPhysicalDevice(@NativeType("VkPhysicalDevice_T *") long value) { VRVulkanTextureData.nm_pPhysicalDevice(address(), value); return this; }
        /** Sets the specified value to the {@code m_pInstance} field. */
        public VRVulkanTextureData.Buffer m_pInstance(@NativeType("VkInstance_T *") long value) { VRVulkanTextureData.nm_pInstance(address(), value); return this; }
        /** Sets the specified value to the {@code m_pQueue} field. */
        public VRVulkanTextureData.Buffer m_pQueue(@NativeType("VkQueue_T *") long value) { VRVulkanTextureData.nm_pQueue(address(), value); return this; }
        /** Sets the specified value to the {@code m_nQueueFamilyIndex} field. */
        public VRVulkanTextureData.Buffer m_nQueueFamilyIndex(@NativeType("uint32_t") int value) { VRVulkanTextureData.nm_nQueueFamilyIndex(address(), value); return this; }
        /** Sets the specified value to the {@code m_nWidth} field. */
        public VRVulkanTextureData.Buffer m_nWidth(@NativeType("uint32_t") int value) { VRVulkanTextureData.nm_nWidth(address(), value); return this; }
        /** Sets the specified value to the {@code m_nHeight} field. */
        public VRVulkanTextureData.Buffer m_nHeight(@NativeType("uint32_t") int value) { VRVulkanTextureData.nm_nHeight(address(), value); return this; }
        /** Sets the specified value to the {@code m_nFormat} field. */
        public VRVulkanTextureData.Buffer m_nFormat(@NativeType("uint32_t") int value) { VRVulkanTextureData.nm_nFormat(address(), value); return this; }
        /** Sets the specified value to the {@code m_nSampleCount} field. */
        public VRVulkanTextureData.Buffer m_nSampleCount(@NativeType("uint32_t") int value) { VRVulkanTextureData.nm_nSampleCount(address(), value); return this; }

    }

}