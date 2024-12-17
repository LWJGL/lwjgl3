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
 * <pre>{@code
 * struct VkPhysicalDeviceCudaKernelLaunchFeaturesNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 cudaKernelLaunchFeatures;
 * }}</pre>
 */
public class VkPhysicalDeviceCudaKernelLaunchFeaturesNV extends Struct<VkPhysicalDeviceCudaKernelLaunchFeaturesNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        CUDAKERNELLAUNCHFEATURES;

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
        CUDAKERNELLAUNCHFEATURES = layout.offsetof(2);
    }

    protected VkPhysicalDeviceCudaKernelLaunchFeaturesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceCudaKernelLaunchFeaturesNV create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceCudaKernelLaunchFeaturesNV(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceCudaKernelLaunchFeaturesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceCudaKernelLaunchFeaturesNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code cudaKernelLaunchFeatures} field. */
    @NativeType("VkBool32")
    public boolean cudaKernelLaunchFeatures() { return ncudaKernelLaunchFeatures(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceCudaKernelLaunchFeaturesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVCudaKernelLaunch#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUDA_KERNEL_LAUNCH_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_CUDA_KERNEL_LAUNCH_FEATURES_NV} value to the {@code sType} field. */
    public VkPhysicalDeviceCudaKernelLaunchFeaturesNV sType$Default() { return sType(NVCudaKernelLaunch.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUDA_KERNEL_LAUNCH_FEATURES_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceCudaKernelLaunchFeaturesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code cudaKernelLaunchFeatures} field. */
    public VkPhysicalDeviceCudaKernelLaunchFeaturesNV cudaKernelLaunchFeatures(@NativeType("VkBool32") boolean value) { ncudaKernelLaunchFeatures(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceCudaKernelLaunchFeaturesNV set(
        int sType,
        long pNext,
        boolean cudaKernelLaunchFeatures
    ) {
        sType(sType);
        pNext(pNext);
        cudaKernelLaunchFeatures(cudaKernelLaunchFeatures);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceCudaKernelLaunchFeaturesNV set(VkPhysicalDeviceCudaKernelLaunchFeaturesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceCudaKernelLaunchFeaturesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceCudaKernelLaunchFeaturesNV malloc() {
        return new VkPhysicalDeviceCudaKernelLaunchFeaturesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceCudaKernelLaunchFeaturesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceCudaKernelLaunchFeaturesNV calloc() {
        return new VkPhysicalDeviceCudaKernelLaunchFeaturesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceCudaKernelLaunchFeaturesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceCudaKernelLaunchFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceCudaKernelLaunchFeaturesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceCudaKernelLaunchFeaturesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceCudaKernelLaunchFeaturesNV create(long address) {
        return new VkPhysicalDeviceCudaKernelLaunchFeaturesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceCudaKernelLaunchFeaturesNV createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceCudaKernelLaunchFeaturesNV(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCudaKernelLaunchFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCudaKernelLaunchFeaturesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCudaKernelLaunchFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCudaKernelLaunchFeaturesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCudaKernelLaunchFeaturesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCudaKernelLaunchFeaturesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceCudaKernelLaunchFeaturesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCudaKernelLaunchFeaturesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceCudaKernelLaunchFeaturesNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceCudaKernelLaunchFeaturesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceCudaKernelLaunchFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceCudaKernelLaunchFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceCudaKernelLaunchFeaturesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceCudaKernelLaunchFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceCudaKernelLaunchFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCudaKernelLaunchFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCudaKernelLaunchFeaturesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCudaKernelLaunchFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCudaKernelLaunchFeaturesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceCudaKernelLaunchFeaturesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceCudaKernelLaunchFeaturesNV.PNEXT); }
    /** Unsafe version of {@link #cudaKernelLaunchFeatures}. */
    public static int ncudaKernelLaunchFeatures(long struct) { return memGetInt(struct + VkPhysicalDeviceCudaKernelLaunchFeaturesNV.CUDAKERNELLAUNCHFEATURES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceCudaKernelLaunchFeaturesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceCudaKernelLaunchFeaturesNV.PNEXT, value); }
    /** Unsafe version of {@link #cudaKernelLaunchFeatures(boolean) cudaKernelLaunchFeatures}. */
    public static void ncudaKernelLaunchFeatures(long struct, int value) { memPutInt(struct + VkPhysicalDeviceCudaKernelLaunchFeaturesNV.CUDAKERNELLAUNCHFEATURES, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceCudaKernelLaunchFeaturesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceCudaKernelLaunchFeaturesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceCudaKernelLaunchFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceCudaKernelLaunchFeaturesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceCudaKernelLaunchFeaturesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceCudaKernelLaunchFeaturesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceCudaKernelLaunchFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceCudaKernelLaunchFeaturesNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceCudaKernelLaunchFeaturesNV.npNext(address()); }
        /** @return the value of the {@code cudaKernelLaunchFeatures} field. */
        @NativeType("VkBool32")
        public boolean cudaKernelLaunchFeatures() { return VkPhysicalDeviceCudaKernelLaunchFeaturesNV.ncudaKernelLaunchFeatures(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceCudaKernelLaunchFeaturesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceCudaKernelLaunchFeaturesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVCudaKernelLaunch#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUDA_KERNEL_LAUNCH_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_CUDA_KERNEL_LAUNCH_FEATURES_NV} value to the {@code sType} field. */
        public VkPhysicalDeviceCudaKernelLaunchFeaturesNV.Buffer sType$Default() { return sType(NVCudaKernelLaunch.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUDA_KERNEL_LAUNCH_FEATURES_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceCudaKernelLaunchFeaturesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceCudaKernelLaunchFeaturesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code cudaKernelLaunchFeatures} field. */
        public VkPhysicalDeviceCudaKernelLaunchFeaturesNV.Buffer cudaKernelLaunchFeatures(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceCudaKernelLaunchFeaturesNV.ncudaKernelLaunchFeatures(address(), value ? 1 : 0); return this; }

    }

}