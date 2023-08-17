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
 * Structure describing if memory decompression is supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceMemoryDecompressionFeaturesNV} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceMemoryDecompressionFeaturesNV} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVMemoryDecompression#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_FEATURES_NV}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceMemoryDecompressionFeaturesNV {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #memoryDecompression};
 * }</code></pre>
 */
public class VkPhysicalDeviceMemoryDecompressionFeaturesNV extends Struct<VkPhysicalDeviceMemoryDecompressionFeaturesNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MEMORYDECOMPRESSION;

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
        MEMORYDECOMPRESSION = layout.offsetof(2);
    }

    protected VkPhysicalDeviceMemoryDecompressionFeaturesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceMemoryDecompressionFeaturesNV create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceMemoryDecompressionFeaturesNV(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceMemoryDecompressionFeaturesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceMemoryDecompressionFeaturesNV(ByteBuffer container) {
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
    /** indicates whether memory decompression is supported. */
    @NativeType("VkBool32")
    public boolean memoryDecompression() { return nmemoryDecompression(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceMemoryDecompressionFeaturesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVMemoryDecompression#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_FEATURES_NV} value to the {@link #sType} field. */
    public VkPhysicalDeviceMemoryDecompressionFeaturesNV sType$Default() { return sType(NVMemoryDecompression.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_FEATURES_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceMemoryDecompressionFeaturesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #memoryDecompression} field. */
    public VkPhysicalDeviceMemoryDecompressionFeaturesNV memoryDecompression(@NativeType("VkBool32") boolean value) { nmemoryDecompression(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceMemoryDecompressionFeaturesNV set(
        int sType,
        long pNext,
        boolean memoryDecompression
    ) {
        sType(sType);
        pNext(pNext);
        memoryDecompression(memoryDecompression);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceMemoryDecompressionFeaturesNV set(VkPhysicalDeviceMemoryDecompressionFeaturesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceMemoryDecompressionFeaturesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMemoryDecompressionFeaturesNV malloc() {
        return new VkPhysicalDeviceMemoryDecompressionFeaturesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMemoryDecompressionFeaturesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMemoryDecompressionFeaturesNV calloc() {
        return new VkPhysicalDeviceMemoryDecompressionFeaturesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMemoryDecompressionFeaturesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceMemoryDecompressionFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMemoryDecompressionFeaturesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceMemoryDecompressionFeaturesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceMemoryDecompressionFeaturesNV create(long address) {
        return new VkPhysicalDeviceMemoryDecompressionFeaturesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceMemoryDecompressionFeaturesNV createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceMemoryDecompressionFeaturesNV(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryDecompressionFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryDecompressionFeaturesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryDecompressionFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryDecompressionFeaturesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryDecompressionFeaturesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryDecompressionFeaturesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceMemoryDecompressionFeaturesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryDecompressionFeaturesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceMemoryDecompressionFeaturesNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMemoryDecompressionFeaturesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMemoryDecompressionFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMemoryDecompressionFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMemoryDecompressionFeaturesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMemoryDecompressionFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMemoryDecompressionFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryDecompressionFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryDecompressionFeaturesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryDecompressionFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryDecompressionFeaturesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMemoryDecompressionFeaturesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceMemoryDecompressionFeaturesNV.PNEXT); }
    /** Unsafe version of {@link #memoryDecompression}. */
    public static int nmemoryDecompression(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMemoryDecompressionFeaturesNV.MEMORYDECOMPRESSION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceMemoryDecompressionFeaturesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceMemoryDecompressionFeaturesNV.PNEXT, value); }
    /** Unsafe version of {@link #memoryDecompression(boolean) memoryDecompression}. */
    public static void nmemoryDecompression(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceMemoryDecompressionFeaturesNV.MEMORYDECOMPRESSION, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceMemoryDecompressionFeaturesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMemoryDecompressionFeaturesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceMemoryDecompressionFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceMemoryDecompressionFeaturesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceMemoryDecompressionFeaturesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceMemoryDecompressionFeaturesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceMemoryDecompressionFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceMemoryDecompressionFeaturesNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceMemoryDecompressionFeaturesNV.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMemoryDecompressionFeaturesNV#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceMemoryDecompressionFeaturesNV.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMemoryDecompressionFeaturesNV#memoryDecompression} field. */
        @NativeType("VkBool32")
        public boolean memoryDecompression() { return VkPhysicalDeviceMemoryDecompressionFeaturesNV.nmemoryDecompression(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceMemoryDecompressionFeaturesNV#sType} field. */
        public VkPhysicalDeviceMemoryDecompressionFeaturesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceMemoryDecompressionFeaturesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVMemoryDecompression#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_FEATURES_NV} value to the {@link VkPhysicalDeviceMemoryDecompressionFeaturesNV#sType} field. */
        public VkPhysicalDeviceMemoryDecompressionFeaturesNV.Buffer sType$Default() { return sType(NVMemoryDecompression.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_FEATURES_NV); }
        /** Sets the specified value to the {@link VkPhysicalDeviceMemoryDecompressionFeaturesNV#pNext} field. */
        public VkPhysicalDeviceMemoryDecompressionFeaturesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceMemoryDecompressionFeaturesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceMemoryDecompressionFeaturesNV#memoryDecompression} field. */
        public VkPhysicalDeviceMemoryDecompressionFeaturesNV.Buffer memoryDecompression(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceMemoryDecompressionFeaturesNV.nmemoryDecompression(address(), value ? 1 : 0); return this; }

    }

}