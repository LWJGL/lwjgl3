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
 * struct VkPhysicalDevicePerStageDescriptorSetFeaturesNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 perStageDescriptorSet;
 *     VkBool32 dynamicPipelineLayout;
 * }}</pre>
 */
public class VkPhysicalDevicePerStageDescriptorSetFeaturesNV extends Struct<VkPhysicalDevicePerStageDescriptorSetFeaturesNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PERSTAGEDESCRIPTORSET,
        DYNAMICPIPELINELAYOUT;

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
        PERSTAGEDESCRIPTORSET = layout.offsetof(2);
        DYNAMICPIPELINELAYOUT = layout.offsetof(3);
    }

    protected VkPhysicalDevicePerStageDescriptorSetFeaturesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDevicePerStageDescriptorSetFeaturesNV create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDevicePerStageDescriptorSetFeaturesNV(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDevicePerStageDescriptorSetFeaturesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV(ByteBuffer container) {
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
    /** @return the value of the {@code perStageDescriptorSet} field. */
    @NativeType("VkBool32")
    public boolean perStageDescriptorSet() { return nperStageDescriptorSet(address()) != 0; }
    /** @return the value of the {@code dynamicPipelineLayout} field. */
    @NativeType("VkBool32")
    public boolean dynamicPipelineLayout() { return ndynamicPipelineLayout(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVPerStageDescriptorSet#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PER_STAGE_DESCRIPTOR_SET_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_PER_STAGE_DESCRIPTOR_SET_FEATURES_NV} value to the {@code sType} field. */
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV sType$Default() { return sType(NVPerStageDescriptorSet.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PER_STAGE_DESCRIPTOR_SET_FEATURES_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code perStageDescriptorSet} field. */
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV perStageDescriptorSet(@NativeType("VkBool32") boolean value) { nperStageDescriptorSet(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code dynamicPipelineLayout} field. */
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV dynamicPipelineLayout(@NativeType("VkBool32") boolean value) { ndynamicPipelineLayout(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV set(
        int sType,
        long pNext,
        boolean perStageDescriptorSet,
        boolean dynamicPipelineLayout
    ) {
        sType(sType);
        pNext(pNext);
        perStageDescriptorSet(perStageDescriptorSet);
        dynamicPipelineLayout(dynamicPipelineLayout);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV set(VkPhysicalDevicePerStageDescriptorSetFeaturesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDevicePerStageDescriptorSetFeaturesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePerStageDescriptorSetFeaturesNV malloc() {
        return new VkPhysicalDevicePerStageDescriptorSetFeaturesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePerStageDescriptorSetFeaturesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePerStageDescriptorSetFeaturesNV calloc() {
        return new VkPhysicalDevicePerStageDescriptorSetFeaturesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePerStageDescriptorSetFeaturesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDevicePerStageDescriptorSetFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePerStageDescriptorSetFeaturesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDevicePerStageDescriptorSetFeaturesNV} instance for the specified memory address. */
    public static VkPhysicalDevicePerStageDescriptorSetFeaturesNV create(long address) {
        return new VkPhysicalDevicePerStageDescriptorSetFeaturesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDevicePerStageDescriptorSetFeaturesNV createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDevicePerStageDescriptorSetFeaturesNV(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePerStageDescriptorSetFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePerStageDescriptorSetFeaturesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePerStageDescriptorSetFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePerStageDescriptorSetFeaturesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePerStageDescriptorSetFeaturesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePerStageDescriptorSetFeaturesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDevicePerStageDescriptorSetFeaturesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePerStageDescriptorSetFeaturesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDevicePerStageDescriptorSetFeaturesNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePerStageDescriptorSetFeaturesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePerStageDescriptorSetFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDevicePerStageDescriptorSetFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePerStageDescriptorSetFeaturesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePerStageDescriptorSetFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDevicePerStageDescriptorSetFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePerStageDescriptorSetFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePerStageDescriptorSetFeaturesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePerStageDescriptorSetFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePerStageDescriptorSetFeaturesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDevicePerStageDescriptorSetFeaturesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDevicePerStageDescriptorSetFeaturesNV.PNEXT); }
    /** Unsafe version of {@link #perStageDescriptorSet}. */
    public static int nperStageDescriptorSet(long struct) { return memGetInt(struct + VkPhysicalDevicePerStageDescriptorSetFeaturesNV.PERSTAGEDESCRIPTORSET); }
    /** Unsafe version of {@link #dynamicPipelineLayout}. */
    public static int ndynamicPipelineLayout(long struct) { return memGetInt(struct + VkPhysicalDevicePerStageDescriptorSetFeaturesNV.DYNAMICPIPELINELAYOUT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDevicePerStageDescriptorSetFeaturesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDevicePerStageDescriptorSetFeaturesNV.PNEXT, value); }
    /** Unsafe version of {@link #perStageDescriptorSet(boolean) perStageDescriptorSet}. */
    public static void nperStageDescriptorSet(long struct, int value) { memPutInt(struct + VkPhysicalDevicePerStageDescriptorSetFeaturesNV.PERSTAGEDESCRIPTORSET, value); }
    /** Unsafe version of {@link #dynamicPipelineLayout(boolean) dynamicPipelineLayout}. */
    public static void ndynamicPipelineLayout(long struct, int value) { memPutInt(struct + VkPhysicalDevicePerStageDescriptorSetFeaturesNV.DYNAMICPIPELINELAYOUT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDevicePerStageDescriptorSetFeaturesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePerStageDescriptorSetFeaturesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDevicePerStageDescriptorSetFeaturesNV ELEMENT_FACTORY = VkPhysicalDevicePerStageDescriptorSetFeaturesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDevicePerStageDescriptorSetFeaturesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDevicePerStageDescriptorSetFeaturesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDevicePerStageDescriptorSetFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDevicePerStageDescriptorSetFeaturesNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDevicePerStageDescriptorSetFeaturesNV.npNext(address()); }
        /** @return the value of the {@code perStageDescriptorSet} field. */
        @NativeType("VkBool32")
        public boolean perStageDescriptorSet() { return VkPhysicalDevicePerStageDescriptorSetFeaturesNV.nperStageDescriptorSet(address()) != 0; }
        /** @return the value of the {@code dynamicPipelineLayout} field. */
        @NativeType("VkBool32")
        public boolean dynamicPipelineLayout() { return VkPhysicalDevicePerStageDescriptorSetFeaturesNV.ndynamicPipelineLayout(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDevicePerStageDescriptorSetFeaturesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevicePerStageDescriptorSetFeaturesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVPerStageDescriptorSet#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PER_STAGE_DESCRIPTOR_SET_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_PER_STAGE_DESCRIPTOR_SET_FEATURES_NV} value to the {@code sType} field. */
        public VkPhysicalDevicePerStageDescriptorSetFeaturesNV.Buffer sType$Default() { return sType(NVPerStageDescriptorSet.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PER_STAGE_DESCRIPTOR_SET_FEATURES_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDevicePerStageDescriptorSetFeaturesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevicePerStageDescriptorSetFeaturesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code perStageDescriptorSet} field. */
        public VkPhysicalDevicePerStageDescriptorSetFeaturesNV.Buffer perStageDescriptorSet(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePerStageDescriptorSetFeaturesNV.nperStageDescriptorSet(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code dynamicPipelineLayout} field. */
        public VkPhysicalDevicePerStageDescriptorSetFeaturesNV.Buffer dynamicPipelineLayout(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePerStageDescriptorSetFeaturesNV.ndynamicPipelineLayout(address(), value ? 1 : 0); return this; }

    }

}