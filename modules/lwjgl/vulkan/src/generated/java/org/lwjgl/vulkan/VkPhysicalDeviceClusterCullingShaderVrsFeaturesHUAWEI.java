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
 * struct VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 clusterShadingRate;
 * }}</pre>
 */
public class VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI extends Struct<VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        CLUSTERSHADINGRATE;

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
        CLUSTERSHADINGRATE = layout.offsetof(2);
    }

    protected VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI(ByteBuffer container) {
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
    /** @return the value of the {@code clusterShadingRate} field. */
    @NativeType("VkBool32")
    public boolean clusterShadingRate() { return nclusterShadingRate(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link HUAWEIClusterCullingShader#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_VRS_FEATURES_HUAWEI STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_VRS_FEATURES_HUAWEI} value to the {@code sType} field. */
    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI sType$Default() { return sType(HUAWEIClusterCullingShader.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_VRS_FEATURES_HUAWEI); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code clusterShadingRate} field. */
    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI clusterShadingRate(@NativeType("VkBool32") boolean value) { nclusterShadingRate(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI set(
        int sType,
        long pNext,
        boolean clusterShadingRate
    ) {
        sType(sType);
        pNext(pNext);
        clusterShadingRate(clusterShadingRate);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI set(VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI malloc() {
        return new VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI calloc() {
        return new VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI} instance for the specified memory address. */
    public static VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI create(long address) {
        return new VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI malloc(MemoryStack stack) {
        return new VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI calloc(MemoryStack stack) {
        return new VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.PNEXT); }
    /** Unsafe version of {@link #clusterShadingRate}. */
    public static int nclusterShadingRate(long struct) { return memGetInt(struct + VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.CLUSTERSHADINGRATE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.PNEXT, value); }
    /** Unsafe version of {@link #clusterShadingRate(boolean) clusterShadingRate}. */
    public static void nclusterShadingRate(long struct, int value) { memPutInt(struct + VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.CLUSTERSHADINGRATE, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI ELEMENT_FACTORY = VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.npNext(address()); }
        /** @return the value of the {@code clusterShadingRate} field. */
        @NativeType("VkBool32")
        public boolean clusterShadingRate() { return VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.nclusterShadingRate(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.nsType(address(), value); return this; }
        /** Sets the {@link HUAWEIClusterCullingShader#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_VRS_FEATURES_HUAWEI STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_VRS_FEATURES_HUAWEI} value to the {@code sType} field. */
        public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.Buffer sType$Default() { return sType(HUAWEIClusterCullingShader.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_VRS_FEATURES_HUAWEI); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code clusterShadingRate} field. */
        public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.Buffer clusterShadingRate(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.nclusterShadingRate(address(), value ? 1 : 0); return this; }

    }

}