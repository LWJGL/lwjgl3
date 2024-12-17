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
 * struct VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 fragmentShadingRateEnums;
 *     VkBool32 supersampleFragmentShadingRates;
 *     VkBool32 noInvocationFragmentShadingRates;
 * }}</pre>
 */
public class VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV extends Struct<VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FRAGMENTSHADINGRATEENUMS,
        SUPERSAMPLEFRAGMENTSHADINGRATES,
        NOINVOCATIONFRAGMENTSHADINGRATES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FRAGMENTSHADINGRATEENUMS = layout.offsetof(2);
        SUPERSAMPLEFRAGMENTSHADINGRATES = layout.offsetof(3);
        NOINVOCATIONFRAGMENTSHADINGRATES = layout.offsetof(4);
    }

    protected VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(ByteBuffer container) {
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
    /** @return the value of the {@code fragmentShadingRateEnums} field. */
    @NativeType("VkBool32")
    public boolean fragmentShadingRateEnums() { return nfragmentShadingRateEnums(address()) != 0; }
    /** @return the value of the {@code supersampleFragmentShadingRates} field. */
    @NativeType("VkBool32")
    public boolean supersampleFragmentShadingRates() { return nsupersampleFragmentShadingRates(address()) != 0; }
    /** @return the value of the {@code noInvocationFragmentShadingRates} field. */
    @NativeType("VkBool32")
    public boolean noInvocationFragmentShadingRates() { return nnoInvocationFragmentShadingRates(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVFragmentShadingRateEnums#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_FEATURES_NV} value to the {@code sType} field. */
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV sType$Default() { return sType(NVFragmentShadingRateEnums.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_FEATURES_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code fragmentShadingRateEnums} field. */
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV fragmentShadingRateEnums(@NativeType("VkBool32") boolean value) { nfragmentShadingRateEnums(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code supersampleFragmentShadingRates} field. */
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV supersampleFragmentShadingRates(@NativeType("VkBool32") boolean value) { nsupersampleFragmentShadingRates(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code noInvocationFragmentShadingRates} field. */
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV noInvocationFragmentShadingRates(@NativeType("VkBool32") boolean value) { nnoInvocationFragmentShadingRates(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV set(
        int sType,
        long pNext,
        boolean fragmentShadingRateEnums,
        boolean supersampleFragmentShadingRates,
        boolean noInvocationFragmentShadingRates
    ) {
        sType(sType);
        pNext(pNext);
        fragmentShadingRateEnums(fragmentShadingRateEnums);
        supersampleFragmentShadingRates(supersampleFragmentShadingRates);
        noInvocationFragmentShadingRates(noInvocationFragmentShadingRates);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV set(VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV malloc() {
        return new VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV calloc() {
        return new VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV create(long address) {
        return new VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.PNEXT); }
    /** Unsafe version of {@link #fragmentShadingRateEnums}. */
    public static int nfragmentShadingRateEnums(long struct) { return memGetInt(struct + VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.FRAGMENTSHADINGRATEENUMS); }
    /** Unsafe version of {@link #supersampleFragmentShadingRates}. */
    public static int nsupersampleFragmentShadingRates(long struct) { return memGetInt(struct + VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.SUPERSAMPLEFRAGMENTSHADINGRATES); }
    /** Unsafe version of {@link #noInvocationFragmentShadingRates}. */
    public static int nnoInvocationFragmentShadingRates(long struct) { return memGetInt(struct + VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.NOINVOCATIONFRAGMENTSHADINGRATES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.PNEXT, value); }
    /** Unsafe version of {@link #fragmentShadingRateEnums(boolean) fragmentShadingRateEnums}. */
    public static void nfragmentShadingRateEnums(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.FRAGMENTSHADINGRATEENUMS, value); }
    /** Unsafe version of {@link #supersampleFragmentShadingRates(boolean) supersampleFragmentShadingRates}. */
    public static void nsupersampleFragmentShadingRates(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.SUPERSAMPLEFRAGMENTSHADINGRATES, value); }
    /** Unsafe version of {@link #noInvocationFragmentShadingRates(boolean) noInvocationFragmentShadingRates}. */
    public static void nnoInvocationFragmentShadingRates(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.NOINVOCATIONFRAGMENTSHADINGRATES, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.npNext(address()); }
        /** @return the value of the {@code fragmentShadingRateEnums} field. */
        @NativeType("VkBool32")
        public boolean fragmentShadingRateEnums() { return VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.nfragmentShadingRateEnums(address()) != 0; }
        /** @return the value of the {@code supersampleFragmentShadingRates} field. */
        @NativeType("VkBool32")
        public boolean supersampleFragmentShadingRates() { return VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.nsupersampleFragmentShadingRates(address()) != 0; }
        /** @return the value of the {@code noInvocationFragmentShadingRates} field. */
        @NativeType("VkBool32")
        public boolean noInvocationFragmentShadingRates() { return VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.nnoInvocationFragmentShadingRates(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVFragmentShadingRateEnums#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_FEATURES_NV} value to the {@code sType} field. */
        public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.Buffer sType$Default() { return sType(NVFragmentShadingRateEnums.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_FEATURES_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code fragmentShadingRateEnums} field. */
        public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.Buffer fragmentShadingRateEnums(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.nfragmentShadingRateEnums(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code supersampleFragmentShadingRates} field. */
        public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.Buffer supersampleFragmentShadingRates(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.nsupersampleFragmentShadingRates(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code noInvocationFragmentShadingRates} field. */
        public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.Buffer noInvocationFragmentShadingRates(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.nnoInvocationFragmentShadingRates(address(), value ? 1 : 0); return this; }

    }

}