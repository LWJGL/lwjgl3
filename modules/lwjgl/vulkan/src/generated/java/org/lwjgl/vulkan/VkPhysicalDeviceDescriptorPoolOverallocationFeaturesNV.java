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
 * Structure describing feature to allow descriptor pool overallocation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVDescriptorPoolOverallocation#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_POOL_OVERALLOCATION_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_POOL_OVERALLOCATION_FEATURES_NV}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #descriptorPoolOverallocation};
 * }</code></pre>
 */
public class VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV extends Struct<VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DESCRIPTORPOOLOVERALLOCATION;

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
        DESCRIPTORPOOLOVERALLOCATION = layout.offsetof(2);
    }

    protected VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** indicates that the implementation allows the application to opt into descriptor pool overallocation by creating the descriptor pool with {@link NVDescriptorPoolOverallocation#VK_DESCRIPTOR_POOL_CREATE_ALLOW_OVERALLOCATION_SETS_BIT_NV DESCRIPTOR_POOL_CREATE_ALLOW_OVERALLOCATION_SETS_BIT_NV} and/or {@link NVDescriptorPoolOverallocation#VK_DESCRIPTOR_POOL_CREATE_ALLOW_OVERALLOCATION_POOLS_BIT_NV DESCRIPTOR_POOL_CREATE_ALLOW_OVERALLOCATION_POOLS_BIT_NV} flags. */
    @NativeType("VkBool32")
    public boolean descriptorPoolOverallocation() { return ndescriptorPoolOverallocation(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVDescriptorPoolOverallocation#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_POOL_OVERALLOCATION_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_POOL_OVERALLOCATION_FEATURES_NV} value to the {@link #sType} field. */
    public VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV sType$Default() { return sType(NVDescriptorPoolOverallocation.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_POOL_OVERALLOCATION_FEATURES_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #descriptorPoolOverallocation} field. */
    public VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV descriptorPoolOverallocation(@NativeType("VkBool32") boolean value) { ndescriptorPoolOverallocation(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV set(
        int sType,
        long pNext,
        boolean descriptorPoolOverallocation
    ) {
        sType(sType);
        pNext(pNext);
        descriptorPoolOverallocation(descriptorPoolOverallocation);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV set(VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV malloc() {
        return new VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV calloc() {
        return new VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV create(long address) {
        return new VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV.PNEXT); }
    /** Unsafe version of {@link #descriptorPoolOverallocation}. */
    public static int ndescriptorPoolOverallocation(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV.DESCRIPTORPOOLOVERALLOCATION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV.PNEXT, value); }
    /** Unsafe version of {@link #descriptorPoolOverallocation(boolean) descriptorPoolOverallocation}. */
    public static void ndescriptorPoolOverallocation(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV.DESCRIPTORPOOLOVERALLOCATION, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV#descriptorPoolOverallocation} field. */
        @NativeType("VkBool32")
        public boolean descriptorPoolOverallocation() { return VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV.ndescriptorPoolOverallocation(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV#sType} field. */
        public VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVDescriptorPoolOverallocation#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_POOL_OVERALLOCATION_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_POOL_OVERALLOCATION_FEATURES_NV} value to the {@link VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV#sType} field. */
        public VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV.Buffer sType$Default() { return sType(NVDescriptorPoolOverallocation.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_POOL_OVERALLOCATION_FEATURES_NV); }
        /** Sets the specified value to the {@link VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV#pNext} field. */
        public VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV#descriptorPoolOverallocation} field. */
        public VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV.Buffer descriptorPoolOverallocation(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV.ndescriptorPoolOverallocation(address(), value ? 1 : 0); return this; }

    }

}