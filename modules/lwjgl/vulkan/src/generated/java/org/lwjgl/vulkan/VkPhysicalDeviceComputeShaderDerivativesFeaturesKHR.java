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
 * struct VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 computeDerivativeGroupQuads;
 *     VkBool32 computeDerivativeGroupLinear;
 * }}</pre>
 */
public class VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR extends Struct<VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        COMPUTEDERIVATIVEGROUPQUADS,
        COMPUTEDERIVATIVEGROUPLINEAR;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COMPUTEDERIVATIVEGROUPQUADS = layout.offsetof(2);
        COMPUTEDERIVATIVEGROUPLINEAR = layout.offsetof(3);
    }

    protected VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR(ByteBuffer container) {
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
    /** @return the value of the {@code computeDerivativeGroupQuads} field. */
    @NativeType("VkBool32")
    public boolean computeDerivativeGroupQuads() { return ncomputeDerivativeGroupQuads(address()) != 0; }
    /** @return the value of the {@code computeDerivativeGroupLinear} field. */
    @NativeType("VkBool32")
    public boolean computeDerivativeGroupLinear() { return ncomputeDerivativeGroupLinear(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRComputeShaderDerivatives#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_FEATURES_KHR} value to the {@code sType} field. */
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR sType$Default() { return sType(KHRComputeShaderDerivatives.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_FEATURES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code computeDerivativeGroupQuads} field. */
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR computeDerivativeGroupQuads(@NativeType("VkBool32") boolean value) { ncomputeDerivativeGroupQuads(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code computeDerivativeGroupLinear} field. */
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR computeDerivativeGroupLinear(@NativeType("VkBool32") boolean value) { ncomputeDerivativeGroupLinear(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR set(
        int sType,
        long pNext,
        boolean computeDerivativeGroupQuads,
        boolean computeDerivativeGroupLinear
    ) {
        sType(sType);
        pNext(pNext);
        computeDerivativeGroupQuads(computeDerivativeGroupQuads);
        computeDerivativeGroupLinear(computeDerivativeGroupLinear);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR set(VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR malloc() {
        return new VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR calloc() {
        return new VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR create(long address) {
        return new VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #computeDerivativeGroupQuads}. */
    public static int ncomputeDerivativeGroupQuads(long struct) { return memGetInt(struct + VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.COMPUTEDERIVATIVEGROUPQUADS); }
    /** Unsafe version of {@link #computeDerivativeGroupLinear}. */
    public static int ncomputeDerivativeGroupLinear(long struct) { return memGetInt(struct + VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.COMPUTEDERIVATIVEGROUPLINEAR); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #computeDerivativeGroupQuads(boolean) computeDerivativeGroupQuads}. */
    public static void ncomputeDerivativeGroupQuads(long struct, int value) { memPutInt(struct + VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.COMPUTEDERIVATIVEGROUPQUADS, value); }
    /** Unsafe version of {@link #computeDerivativeGroupLinear(boolean) computeDerivativeGroupLinear}. */
    public static void ncomputeDerivativeGroupLinear(long struct, int value) { memPutInt(struct + VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.COMPUTEDERIVATIVEGROUPLINEAR, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.npNext(address()); }
        /** @return the value of the {@code computeDerivativeGroupQuads} field. */
        @NativeType("VkBool32")
        public boolean computeDerivativeGroupQuads() { return VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.ncomputeDerivativeGroupQuads(address()) != 0; }
        /** @return the value of the {@code computeDerivativeGroupLinear} field. */
        @NativeType("VkBool32")
        public boolean computeDerivativeGroupLinear() { return VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.ncomputeDerivativeGroupLinear(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRComputeShaderDerivatives#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_FEATURES_KHR} value to the {@code sType} field. */
        public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.Buffer sType$Default() { return sType(KHRComputeShaderDerivatives.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_FEATURES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code computeDerivativeGroupQuads} field. */
        public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.Buffer computeDerivativeGroupQuads(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.ncomputeDerivativeGroupQuads(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code computeDerivativeGroupLinear} field. */
        public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.Buffer computeDerivativeGroupLinear(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.ncomputeDerivativeGroupLinear(address(), value ? 1 : 0); return this; }

    }

}