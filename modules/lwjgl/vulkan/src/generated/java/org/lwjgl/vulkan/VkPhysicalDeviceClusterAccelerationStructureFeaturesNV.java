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
 * struct VkPhysicalDeviceClusterAccelerationStructureFeaturesNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 clusterAccelerationStructure;
 * }}</pre>
 */
public class VkPhysicalDeviceClusterAccelerationStructureFeaturesNV extends Struct<VkPhysicalDeviceClusterAccelerationStructureFeaturesNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        CLUSTERACCELERATIONSTRUCTURE;

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
        CLUSTERACCELERATIONSTRUCTURE = layout.offsetof(2);
    }

    protected VkPhysicalDeviceClusterAccelerationStructureFeaturesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceClusterAccelerationStructureFeaturesNV create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceClusterAccelerationStructureFeaturesNV(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceClusterAccelerationStructureFeaturesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceClusterAccelerationStructureFeaturesNV(ByteBuffer container) {
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
    /** @return the value of the {@code clusterAccelerationStructure} field. */
    @NativeType("VkBool32")
    public boolean clusterAccelerationStructure() { return nclusterAccelerationStructure(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceClusterAccelerationStructureFeaturesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVClusterAccelerationStructure#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_ACCELERATION_STRUCTURE_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_ACCELERATION_STRUCTURE_FEATURES_NV} value to the {@code sType} field. */
    public VkPhysicalDeviceClusterAccelerationStructureFeaturesNV sType$Default() { return sType(NVClusterAccelerationStructure.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_ACCELERATION_STRUCTURE_FEATURES_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceClusterAccelerationStructureFeaturesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code clusterAccelerationStructure} field. */
    public VkPhysicalDeviceClusterAccelerationStructureFeaturesNV clusterAccelerationStructure(@NativeType("VkBool32") boolean value) { nclusterAccelerationStructure(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceClusterAccelerationStructureFeaturesNV set(
        int sType,
        long pNext,
        boolean clusterAccelerationStructure
    ) {
        sType(sType);
        pNext(pNext);
        clusterAccelerationStructure(clusterAccelerationStructure);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceClusterAccelerationStructureFeaturesNV set(VkPhysicalDeviceClusterAccelerationStructureFeaturesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceClusterAccelerationStructureFeaturesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceClusterAccelerationStructureFeaturesNV malloc() {
        return new VkPhysicalDeviceClusterAccelerationStructureFeaturesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceClusterAccelerationStructureFeaturesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceClusterAccelerationStructureFeaturesNV calloc() {
        return new VkPhysicalDeviceClusterAccelerationStructureFeaturesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceClusterAccelerationStructureFeaturesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceClusterAccelerationStructureFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceClusterAccelerationStructureFeaturesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceClusterAccelerationStructureFeaturesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceClusterAccelerationStructureFeaturesNV create(long address) {
        return new VkPhysicalDeviceClusterAccelerationStructureFeaturesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceClusterAccelerationStructureFeaturesNV createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceClusterAccelerationStructureFeaturesNV(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceClusterAccelerationStructureFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceClusterAccelerationStructureFeaturesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceClusterAccelerationStructureFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceClusterAccelerationStructureFeaturesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceClusterAccelerationStructureFeaturesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceClusterAccelerationStructureFeaturesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceClusterAccelerationStructureFeaturesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceClusterAccelerationStructureFeaturesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceClusterAccelerationStructureFeaturesNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceClusterAccelerationStructureFeaturesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceClusterAccelerationStructureFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceClusterAccelerationStructureFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceClusterAccelerationStructureFeaturesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceClusterAccelerationStructureFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceClusterAccelerationStructureFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceClusterAccelerationStructureFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceClusterAccelerationStructureFeaturesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceClusterAccelerationStructureFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceClusterAccelerationStructureFeaturesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceClusterAccelerationStructureFeaturesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceClusterAccelerationStructureFeaturesNV.PNEXT); }
    /** Unsafe version of {@link #clusterAccelerationStructure}. */
    public static int nclusterAccelerationStructure(long struct) { return memGetInt(struct + VkPhysicalDeviceClusterAccelerationStructureFeaturesNV.CLUSTERACCELERATIONSTRUCTURE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceClusterAccelerationStructureFeaturesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceClusterAccelerationStructureFeaturesNV.PNEXT, value); }
    /** Unsafe version of {@link #clusterAccelerationStructure(boolean) clusterAccelerationStructure}. */
    public static void nclusterAccelerationStructure(long struct, int value) { memPutInt(struct + VkPhysicalDeviceClusterAccelerationStructureFeaturesNV.CLUSTERACCELERATIONSTRUCTURE, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceClusterAccelerationStructureFeaturesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceClusterAccelerationStructureFeaturesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceClusterAccelerationStructureFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceClusterAccelerationStructureFeaturesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceClusterAccelerationStructureFeaturesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceClusterAccelerationStructureFeaturesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceClusterAccelerationStructureFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceClusterAccelerationStructureFeaturesNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceClusterAccelerationStructureFeaturesNV.npNext(address()); }
        /** @return the value of the {@code clusterAccelerationStructure} field. */
        @NativeType("VkBool32")
        public boolean clusterAccelerationStructure() { return VkPhysicalDeviceClusterAccelerationStructureFeaturesNV.nclusterAccelerationStructure(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceClusterAccelerationStructureFeaturesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceClusterAccelerationStructureFeaturesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVClusterAccelerationStructure#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_ACCELERATION_STRUCTURE_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_ACCELERATION_STRUCTURE_FEATURES_NV} value to the {@code sType} field. */
        public VkPhysicalDeviceClusterAccelerationStructureFeaturesNV.Buffer sType$Default() { return sType(NVClusterAccelerationStructure.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_ACCELERATION_STRUCTURE_FEATURES_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceClusterAccelerationStructureFeaturesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceClusterAccelerationStructureFeaturesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code clusterAccelerationStructure} field. */
        public VkPhysicalDeviceClusterAccelerationStructureFeaturesNV.Buffer clusterAccelerationStructure(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceClusterAccelerationStructureFeaturesNV.nclusterAccelerationStructure(address(), value ? 1 : 0); return this; }

    }

}