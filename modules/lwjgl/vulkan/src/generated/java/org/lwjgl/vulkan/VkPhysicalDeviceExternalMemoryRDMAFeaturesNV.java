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
 * Structure describing the external memory RDMA features supported by the implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceExternalMemoryRDMAFeaturesNV} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceExternalMemoryRDMAFeaturesNV} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVExternalMemoryRdma#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_MEMORY_RDMA_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_MEMORY_RDMA_FEATURES_NV}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceExternalMemoryRDMAFeaturesNV {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #externalMemoryRDMA};
 * }</code></pre>
 */
public class VkPhysicalDeviceExternalMemoryRDMAFeaturesNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        EXTERNALMEMORYRDMA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        EXTERNALMEMORYRDMA = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceExternalMemoryRDMAFeaturesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceExternalMemoryRDMAFeaturesNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** indicates whether the implementation has support for the {@link NVExternalMemoryRdma#VK_MEMORY_PROPERTY_RDMA_CAPABLE_BIT_NV MEMORY_PROPERTY_RDMA_CAPABLE_BIT_NV} memory property and the {@link NVExternalMemoryRdma#VK_EXTERNAL_MEMORY_HANDLE_TYPE_RDMA_ADDRESS_BIT_NV EXTERNAL_MEMORY_HANDLE_TYPE_RDMA_ADDRESS_BIT_NV} external memory handle type. */
    @NativeType("VkBool32")
    public boolean externalMemoryRDMA() { return nexternalMemoryRDMA(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceExternalMemoryRDMAFeaturesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVExternalMemoryRdma#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_MEMORY_RDMA_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_MEMORY_RDMA_FEATURES_NV} value to the {@link #sType} field. */
    public VkPhysicalDeviceExternalMemoryRDMAFeaturesNV sType$Default() { return sType(NVExternalMemoryRdma.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_MEMORY_RDMA_FEATURES_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceExternalMemoryRDMAFeaturesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #externalMemoryRDMA} field. */
    public VkPhysicalDeviceExternalMemoryRDMAFeaturesNV externalMemoryRDMA(@NativeType("VkBool32") boolean value) { nexternalMemoryRDMA(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceExternalMemoryRDMAFeaturesNV set(
        int sType,
        long pNext,
        boolean externalMemoryRDMA
    ) {
        sType(sType);
        pNext(pNext);
        externalMemoryRDMA(externalMemoryRDMA);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceExternalMemoryRDMAFeaturesNV set(VkPhysicalDeviceExternalMemoryRDMAFeaturesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceExternalMemoryRDMAFeaturesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceExternalMemoryRDMAFeaturesNV malloc() {
        return wrap(VkPhysicalDeviceExternalMemoryRDMAFeaturesNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceExternalMemoryRDMAFeaturesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceExternalMemoryRDMAFeaturesNV calloc() {
        return wrap(VkPhysicalDeviceExternalMemoryRDMAFeaturesNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceExternalMemoryRDMAFeaturesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceExternalMemoryRDMAFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceExternalMemoryRDMAFeaturesNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceExternalMemoryRDMAFeaturesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceExternalMemoryRDMAFeaturesNV create(long address) {
        return wrap(VkPhysicalDeviceExternalMemoryRDMAFeaturesNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceExternalMemoryRDMAFeaturesNV createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceExternalMemoryRDMAFeaturesNV.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalMemoryRDMAFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalMemoryRDMAFeaturesNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalMemoryRDMAFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalMemoryRDMAFeaturesNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalMemoryRDMAFeaturesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalMemoryRDMAFeaturesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceExternalMemoryRDMAFeaturesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalMemoryRDMAFeaturesNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceExternalMemoryRDMAFeaturesNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceExternalMemoryRDMAFeaturesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceExternalMemoryRDMAFeaturesNV malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceExternalMemoryRDMAFeaturesNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceExternalMemoryRDMAFeaturesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceExternalMemoryRDMAFeaturesNV calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceExternalMemoryRDMAFeaturesNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalMemoryRDMAFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalMemoryRDMAFeaturesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalMemoryRDMAFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalMemoryRDMAFeaturesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExternalMemoryRDMAFeaturesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceExternalMemoryRDMAFeaturesNV.PNEXT); }
    /** Unsafe version of {@link #externalMemoryRDMA}. */
    public static int nexternalMemoryRDMA(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExternalMemoryRDMAFeaturesNV.EXTERNALMEMORYRDMA); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExternalMemoryRDMAFeaturesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceExternalMemoryRDMAFeaturesNV.PNEXT, value); }
    /** Unsafe version of {@link #externalMemoryRDMA(boolean) externalMemoryRDMA}. */
    public static void nexternalMemoryRDMA(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExternalMemoryRDMAFeaturesNV.EXTERNALMEMORYRDMA, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceExternalMemoryRDMAFeaturesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceExternalMemoryRDMAFeaturesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceExternalMemoryRDMAFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceExternalMemoryRDMAFeaturesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceExternalMemoryRDMAFeaturesNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceExternalMemoryRDMAFeaturesNV#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceExternalMemoryRDMAFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceExternalMemoryRDMAFeaturesNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceExternalMemoryRDMAFeaturesNV.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceExternalMemoryRDMAFeaturesNV#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceExternalMemoryRDMAFeaturesNV.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceExternalMemoryRDMAFeaturesNV#externalMemoryRDMA} field. */
        @NativeType("VkBool32")
        public boolean externalMemoryRDMA() { return VkPhysicalDeviceExternalMemoryRDMAFeaturesNV.nexternalMemoryRDMA(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceExternalMemoryRDMAFeaturesNV#sType} field. */
        public VkPhysicalDeviceExternalMemoryRDMAFeaturesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceExternalMemoryRDMAFeaturesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVExternalMemoryRdma#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_MEMORY_RDMA_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_MEMORY_RDMA_FEATURES_NV} value to the {@link VkPhysicalDeviceExternalMemoryRDMAFeaturesNV#sType} field. */
        public VkPhysicalDeviceExternalMemoryRDMAFeaturesNV.Buffer sType$Default() { return sType(NVExternalMemoryRdma.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_MEMORY_RDMA_FEATURES_NV); }
        /** Sets the specified value to the {@link VkPhysicalDeviceExternalMemoryRDMAFeaturesNV#pNext} field. */
        public VkPhysicalDeviceExternalMemoryRDMAFeaturesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceExternalMemoryRDMAFeaturesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceExternalMemoryRDMAFeaturesNV#externalMemoryRDMA} field. */
        public VkPhysicalDeviceExternalMemoryRDMAFeaturesNV.Buffer externalMemoryRDMA(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceExternalMemoryRDMAFeaturesNV.nexternalMemoryRDMA(address(), value ? 1 : 0); return this; }

    }

}