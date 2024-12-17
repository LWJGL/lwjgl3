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
 * struct VkPhysicalDeviceSubgroupSizeControlFeatures {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 subgroupSizeControl;
 *     VkBool32 computeFullSubgroups;
 * }}</pre>
 */
public class VkPhysicalDeviceSubgroupSizeControlFeatures extends Struct<VkPhysicalDeviceSubgroupSizeControlFeatures> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SUBGROUPSIZECONTROL,
        COMPUTEFULLSUBGROUPS;

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
        SUBGROUPSIZECONTROL = layout.offsetof(2);
        COMPUTEFULLSUBGROUPS = layout.offsetof(3);
    }

    protected VkPhysicalDeviceSubgroupSizeControlFeatures(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceSubgroupSizeControlFeatures create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceSubgroupSizeControlFeatures(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceSubgroupSizeControlFeatures} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceSubgroupSizeControlFeatures(ByteBuffer container) {
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
    /** @return the value of the {@code subgroupSizeControl} field. */
    @NativeType("VkBool32")
    public boolean subgroupSizeControl() { return nsubgroupSizeControl(address()) != 0; }
    /** @return the value of the {@code computeFullSubgroups} field. */
    @NativeType("VkBool32")
    public boolean computeFullSubgroups() { return ncomputeFullSubgroups(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceSubgroupSizeControlFeatures sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_FEATURES} value to the {@code sType} field. */
    public VkPhysicalDeviceSubgroupSizeControlFeatures sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceSubgroupSizeControlFeatures pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code subgroupSizeControl} field. */
    public VkPhysicalDeviceSubgroupSizeControlFeatures subgroupSizeControl(@NativeType("VkBool32") boolean value) { nsubgroupSizeControl(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code computeFullSubgroups} field. */
    public VkPhysicalDeviceSubgroupSizeControlFeatures computeFullSubgroups(@NativeType("VkBool32") boolean value) { ncomputeFullSubgroups(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceSubgroupSizeControlFeatures set(
        int sType,
        long pNext,
        boolean subgroupSizeControl,
        boolean computeFullSubgroups
    ) {
        sType(sType);
        pNext(pNext);
        subgroupSizeControl(subgroupSizeControl);
        computeFullSubgroups(computeFullSubgroups);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceSubgroupSizeControlFeatures set(VkPhysicalDeviceSubgroupSizeControlFeatures src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceSubgroupSizeControlFeatures} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSubgroupSizeControlFeatures malloc() {
        return new VkPhysicalDeviceSubgroupSizeControlFeatures(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceSubgroupSizeControlFeatures} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSubgroupSizeControlFeatures calloc() {
        return new VkPhysicalDeviceSubgroupSizeControlFeatures(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceSubgroupSizeControlFeatures} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceSubgroupSizeControlFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceSubgroupSizeControlFeatures(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceSubgroupSizeControlFeatures} instance for the specified memory address. */
    public static VkPhysicalDeviceSubgroupSizeControlFeatures create(long address) {
        return new VkPhysicalDeviceSubgroupSizeControlFeatures(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceSubgroupSizeControlFeatures createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceSubgroupSizeControlFeatures(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubgroupSizeControlFeatures.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubgroupSizeControlFeatures.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubgroupSizeControlFeatures.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubgroupSizeControlFeatures.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubgroupSizeControlFeatures.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubgroupSizeControlFeatures.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceSubgroupSizeControlFeatures.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubgroupSizeControlFeatures.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceSubgroupSizeControlFeatures.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceSubgroupSizeControlFeatures} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSubgroupSizeControlFeatures malloc(MemoryStack stack) {
        return new VkPhysicalDeviceSubgroupSizeControlFeatures(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceSubgroupSizeControlFeatures} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSubgroupSizeControlFeatures calloc(MemoryStack stack) {
        return new VkPhysicalDeviceSubgroupSizeControlFeatures(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubgroupSizeControlFeatures.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubgroupSizeControlFeatures.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubgroupSizeControlFeatures.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubgroupSizeControlFeatures.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceSubgroupSizeControlFeatures.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceSubgroupSizeControlFeatures.PNEXT); }
    /** Unsafe version of {@link #subgroupSizeControl}. */
    public static int nsubgroupSizeControl(long struct) { return memGetInt(struct + VkPhysicalDeviceSubgroupSizeControlFeatures.SUBGROUPSIZECONTROL); }
    /** Unsafe version of {@link #computeFullSubgroups}. */
    public static int ncomputeFullSubgroups(long struct) { return memGetInt(struct + VkPhysicalDeviceSubgroupSizeControlFeatures.COMPUTEFULLSUBGROUPS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceSubgroupSizeControlFeatures.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceSubgroupSizeControlFeatures.PNEXT, value); }
    /** Unsafe version of {@link #subgroupSizeControl(boolean) subgroupSizeControl}. */
    public static void nsubgroupSizeControl(long struct, int value) { memPutInt(struct + VkPhysicalDeviceSubgroupSizeControlFeatures.SUBGROUPSIZECONTROL, value); }
    /** Unsafe version of {@link #computeFullSubgroups(boolean) computeFullSubgroups}. */
    public static void ncomputeFullSubgroups(long struct, int value) { memPutInt(struct + VkPhysicalDeviceSubgroupSizeControlFeatures.COMPUTEFULLSUBGROUPS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceSubgroupSizeControlFeatures} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceSubgroupSizeControlFeatures, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceSubgroupSizeControlFeatures ELEMENT_FACTORY = VkPhysicalDeviceSubgroupSizeControlFeatures.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceSubgroupSizeControlFeatures.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceSubgroupSizeControlFeatures#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceSubgroupSizeControlFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceSubgroupSizeControlFeatures.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceSubgroupSizeControlFeatures.npNext(address()); }
        /** @return the value of the {@code subgroupSizeControl} field. */
        @NativeType("VkBool32")
        public boolean subgroupSizeControl() { return VkPhysicalDeviceSubgroupSizeControlFeatures.nsubgroupSizeControl(address()) != 0; }
        /** @return the value of the {@code computeFullSubgroups} field. */
        @NativeType("VkBool32")
        public boolean computeFullSubgroups() { return VkPhysicalDeviceSubgroupSizeControlFeatures.ncomputeFullSubgroups(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceSubgroupSizeControlFeatures.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceSubgroupSizeControlFeatures.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_FEATURES} value to the {@code sType} field. */
        public VkPhysicalDeviceSubgroupSizeControlFeatures.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceSubgroupSizeControlFeatures.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceSubgroupSizeControlFeatures.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code subgroupSizeControl} field. */
        public VkPhysicalDeviceSubgroupSizeControlFeatures.Buffer subgroupSizeControl(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceSubgroupSizeControlFeatures.nsubgroupSizeControl(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code computeFullSubgroups} field. */
        public VkPhysicalDeviceSubgroupSizeControlFeatures.Buffer computeFullSubgroups(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceSubgroupSizeControlFeatures.ncomputeFullSubgroups(address(), value ? 1 : 0); return this; }

    }

}