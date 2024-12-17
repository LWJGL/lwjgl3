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
 * struct VkPhysicalDeviceCooperativeMatrix2FeaturesNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 cooperativeMatrixWorkgroupScope;
 *     VkBool32 cooperativeMatrixFlexibleDimensions;
 *     VkBool32 cooperativeMatrixReductions;
 *     VkBool32 cooperativeMatrixConversions;
 *     VkBool32 cooperativeMatrixPerElementOperations;
 *     VkBool32 cooperativeMatrixTensorAddressing;
 *     VkBool32 cooperativeMatrixBlockLoads;
 * }}</pre>
 */
public class VkPhysicalDeviceCooperativeMatrix2FeaturesNV extends Struct<VkPhysicalDeviceCooperativeMatrix2FeaturesNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        COOPERATIVEMATRIXWORKGROUPSCOPE,
        COOPERATIVEMATRIXFLEXIBLEDIMENSIONS,
        COOPERATIVEMATRIXREDUCTIONS,
        COOPERATIVEMATRIXCONVERSIONS,
        COOPERATIVEMATRIXPERELEMENTOPERATIONS,
        COOPERATIVEMATRIXTENSORADDRESSING,
        COOPERATIVEMATRIXBLOCKLOADS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COOPERATIVEMATRIXWORKGROUPSCOPE = layout.offsetof(2);
        COOPERATIVEMATRIXFLEXIBLEDIMENSIONS = layout.offsetof(3);
        COOPERATIVEMATRIXREDUCTIONS = layout.offsetof(4);
        COOPERATIVEMATRIXCONVERSIONS = layout.offsetof(5);
        COOPERATIVEMATRIXPERELEMENTOPERATIONS = layout.offsetof(6);
        COOPERATIVEMATRIXTENSORADDRESSING = layout.offsetof(7);
        COOPERATIVEMATRIXBLOCKLOADS = layout.offsetof(8);
    }

    protected VkPhysicalDeviceCooperativeMatrix2FeaturesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceCooperativeMatrix2FeaturesNV create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceCooperativeMatrix2FeaturesNV(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceCooperativeMatrix2FeaturesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV(ByteBuffer container) {
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
    /** @return the value of the {@code cooperativeMatrixWorkgroupScope} field. */
    @NativeType("VkBool32")
    public boolean cooperativeMatrixWorkgroupScope() { return ncooperativeMatrixWorkgroupScope(address()) != 0; }
    /** @return the value of the {@code cooperativeMatrixFlexibleDimensions} field. */
    @NativeType("VkBool32")
    public boolean cooperativeMatrixFlexibleDimensions() { return ncooperativeMatrixFlexibleDimensions(address()) != 0; }
    /** @return the value of the {@code cooperativeMatrixReductions} field. */
    @NativeType("VkBool32")
    public boolean cooperativeMatrixReductions() { return ncooperativeMatrixReductions(address()) != 0; }
    /** @return the value of the {@code cooperativeMatrixConversions} field. */
    @NativeType("VkBool32")
    public boolean cooperativeMatrixConversions() { return ncooperativeMatrixConversions(address()) != 0; }
    /** @return the value of the {@code cooperativeMatrixPerElementOperations} field. */
    @NativeType("VkBool32")
    public boolean cooperativeMatrixPerElementOperations() { return ncooperativeMatrixPerElementOperations(address()) != 0; }
    /** @return the value of the {@code cooperativeMatrixTensorAddressing} field. */
    @NativeType("VkBool32")
    public boolean cooperativeMatrixTensorAddressing() { return ncooperativeMatrixTensorAddressing(address()) != 0; }
    /** @return the value of the {@code cooperativeMatrixBlockLoads} field. */
    @NativeType("VkBool32")
    public boolean cooperativeMatrixBlockLoads() { return ncooperativeMatrixBlockLoads(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVCooperativeMatrix2#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_2_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_2_FEATURES_NV} value to the {@code sType} field. */
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV sType$Default() { return sType(NVCooperativeMatrix2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_2_FEATURES_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code cooperativeMatrixWorkgroupScope} field. */
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV cooperativeMatrixWorkgroupScope(@NativeType("VkBool32") boolean value) { ncooperativeMatrixWorkgroupScope(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code cooperativeMatrixFlexibleDimensions} field. */
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV cooperativeMatrixFlexibleDimensions(@NativeType("VkBool32") boolean value) { ncooperativeMatrixFlexibleDimensions(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code cooperativeMatrixReductions} field. */
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV cooperativeMatrixReductions(@NativeType("VkBool32") boolean value) { ncooperativeMatrixReductions(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code cooperativeMatrixConversions} field. */
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV cooperativeMatrixConversions(@NativeType("VkBool32") boolean value) { ncooperativeMatrixConversions(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code cooperativeMatrixPerElementOperations} field. */
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV cooperativeMatrixPerElementOperations(@NativeType("VkBool32") boolean value) { ncooperativeMatrixPerElementOperations(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code cooperativeMatrixTensorAddressing} field. */
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV cooperativeMatrixTensorAddressing(@NativeType("VkBool32") boolean value) { ncooperativeMatrixTensorAddressing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code cooperativeMatrixBlockLoads} field. */
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV cooperativeMatrixBlockLoads(@NativeType("VkBool32") boolean value) { ncooperativeMatrixBlockLoads(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV set(
        int sType,
        long pNext,
        boolean cooperativeMatrixWorkgroupScope,
        boolean cooperativeMatrixFlexibleDimensions,
        boolean cooperativeMatrixReductions,
        boolean cooperativeMatrixConversions,
        boolean cooperativeMatrixPerElementOperations,
        boolean cooperativeMatrixTensorAddressing,
        boolean cooperativeMatrixBlockLoads
    ) {
        sType(sType);
        pNext(pNext);
        cooperativeMatrixWorkgroupScope(cooperativeMatrixWorkgroupScope);
        cooperativeMatrixFlexibleDimensions(cooperativeMatrixFlexibleDimensions);
        cooperativeMatrixReductions(cooperativeMatrixReductions);
        cooperativeMatrixConversions(cooperativeMatrixConversions);
        cooperativeMatrixPerElementOperations(cooperativeMatrixPerElementOperations);
        cooperativeMatrixTensorAddressing(cooperativeMatrixTensorAddressing);
        cooperativeMatrixBlockLoads(cooperativeMatrixBlockLoads);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV set(VkPhysicalDeviceCooperativeMatrix2FeaturesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceCooperativeMatrix2FeaturesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceCooperativeMatrix2FeaturesNV malloc() {
        return new VkPhysicalDeviceCooperativeMatrix2FeaturesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceCooperativeMatrix2FeaturesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceCooperativeMatrix2FeaturesNV calloc() {
        return new VkPhysicalDeviceCooperativeMatrix2FeaturesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceCooperativeMatrix2FeaturesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceCooperativeMatrix2FeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceCooperativeMatrix2FeaturesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceCooperativeMatrix2FeaturesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceCooperativeMatrix2FeaturesNV create(long address) {
        return new VkPhysicalDeviceCooperativeMatrix2FeaturesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceCooperativeMatrix2FeaturesNV createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceCooperativeMatrix2FeaturesNV(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeMatrix2FeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrix2FeaturesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeMatrix2FeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrix2FeaturesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeMatrix2FeaturesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrix2FeaturesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceCooperativeMatrix2FeaturesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrix2FeaturesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceCooperativeMatrix2FeaturesNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceCooperativeMatrix2FeaturesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceCooperativeMatrix2FeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceCooperativeMatrix2FeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceCooperativeMatrix2FeaturesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceCooperativeMatrix2FeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceCooperativeMatrix2FeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeMatrix2FeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrix2FeaturesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeMatrix2FeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrix2FeaturesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceCooperativeMatrix2FeaturesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceCooperativeMatrix2FeaturesNV.PNEXT); }
    /** Unsafe version of {@link #cooperativeMatrixWorkgroupScope}. */
    public static int ncooperativeMatrixWorkgroupScope(long struct) { return memGetInt(struct + VkPhysicalDeviceCooperativeMatrix2FeaturesNV.COOPERATIVEMATRIXWORKGROUPSCOPE); }
    /** Unsafe version of {@link #cooperativeMatrixFlexibleDimensions}. */
    public static int ncooperativeMatrixFlexibleDimensions(long struct) { return memGetInt(struct + VkPhysicalDeviceCooperativeMatrix2FeaturesNV.COOPERATIVEMATRIXFLEXIBLEDIMENSIONS); }
    /** Unsafe version of {@link #cooperativeMatrixReductions}. */
    public static int ncooperativeMatrixReductions(long struct) { return memGetInt(struct + VkPhysicalDeviceCooperativeMatrix2FeaturesNV.COOPERATIVEMATRIXREDUCTIONS); }
    /** Unsafe version of {@link #cooperativeMatrixConversions}. */
    public static int ncooperativeMatrixConversions(long struct) { return memGetInt(struct + VkPhysicalDeviceCooperativeMatrix2FeaturesNV.COOPERATIVEMATRIXCONVERSIONS); }
    /** Unsafe version of {@link #cooperativeMatrixPerElementOperations}. */
    public static int ncooperativeMatrixPerElementOperations(long struct) { return memGetInt(struct + VkPhysicalDeviceCooperativeMatrix2FeaturesNV.COOPERATIVEMATRIXPERELEMENTOPERATIONS); }
    /** Unsafe version of {@link #cooperativeMatrixTensorAddressing}. */
    public static int ncooperativeMatrixTensorAddressing(long struct) { return memGetInt(struct + VkPhysicalDeviceCooperativeMatrix2FeaturesNV.COOPERATIVEMATRIXTENSORADDRESSING); }
    /** Unsafe version of {@link #cooperativeMatrixBlockLoads}. */
    public static int ncooperativeMatrixBlockLoads(long struct) { return memGetInt(struct + VkPhysicalDeviceCooperativeMatrix2FeaturesNV.COOPERATIVEMATRIXBLOCKLOADS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceCooperativeMatrix2FeaturesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceCooperativeMatrix2FeaturesNV.PNEXT, value); }
    /** Unsafe version of {@link #cooperativeMatrixWorkgroupScope(boolean) cooperativeMatrixWorkgroupScope}. */
    public static void ncooperativeMatrixWorkgroupScope(long struct, int value) { memPutInt(struct + VkPhysicalDeviceCooperativeMatrix2FeaturesNV.COOPERATIVEMATRIXWORKGROUPSCOPE, value); }
    /** Unsafe version of {@link #cooperativeMatrixFlexibleDimensions(boolean) cooperativeMatrixFlexibleDimensions}. */
    public static void ncooperativeMatrixFlexibleDimensions(long struct, int value) { memPutInt(struct + VkPhysicalDeviceCooperativeMatrix2FeaturesNV.COOPERATIVEMATRIXFLEXIBLEDIMENSIONS, value); }
    /** Unsafe version of {@link #cooperativeMatrixReductions(boolean) cooperativeMatrixReductions}. */
    public static void ncooperativeMatrixReductions(long struct, int value) { memPutInt(struct + VkPhysicalDeviceCooperativeMatrix2FeaturesNV.COOPERATIVEMATRIXREDUCTIONS, value); }
    /** Unsafe version of {@link #cooperativeMatrixConversions(boolean) cooperativeMatrixConversions}. */
    public static void ncooperativeMatrixConversions(long struct, int value) { memPutInt(struct + VkPhysicalDeviceCooperativeMatrix2FeaturesNV.COOPERATIVEMATRIXCONVERSIONS, value); }
    /** Unsafe version of {@link #cooperativeMatrixPerElementOperations(boolean) cooperativeMatrixPerElementOperations}. */
    public static void ncooperativeMatrixPerElementOperations(long struct, int value) { memPutInt(struct + VkPhysicalDeviceCooperativeMatrix2FeaturesNV.COOPERATIVEMATRIXPERELEMENTOPERATIONS, value); }
    /** Unsafe version of {@link #cooperativeMatrixTensorAddressing(boolean) cooperativeMatrixTensorAddressing}. */
    public static void ncooperativeMatrixTensorAddressing(long struct, int value) { memPutInt(struct + VkPhysicalDeviceCooperativeMatrix2FeaturesNV.COOPERATIVEMATRIXTENSORADDRESSING, value); }
    /** Unsafe version of {@link #cooperativeMatrixBlockLoads(boolean) cooperativeMatrixBlockLoads}. */
    public static void ncooperativeMatrixBlockLoads(long struct, int value) { memPutInt(struct + VkPhysicalDeviceCooperativeMatrix2FeaturesNV.COOPERATIVEMATRIXBLOCKLOADS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceCooperativeMatrix2FeaturesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceCooperativeMatrix2FeaturesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceCooperativeMatrix2FeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceCooperativeMatrix2FeaturesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceCooperativeMatrix2FeaturesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceCooperativeMatrix2FeaturesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceCooperativeMatrix2FeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceCooperativeMatrix2FeaturesNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceCooperativeMatrix2FeaturesNV.npNext(address()); }
        /** @return the value of the {@code cooperativeMatrixWorkgroupScope} field. */
        @NativeType("VkBool32")
        public boolean cooperativeMatrixWorkgroupScope() { return VkPhysicalDeviceCooperativeMatrix2FeaturesNV.ncooperativeMatrixWorkgroupScope(address()) != 0; }
        /** @return the value of the {@code cooperativeMatrixFlexibleDimensions} field. */
        @NativeType("VkBool32")
        public boolean cooperativeMatrixFlexibleDimensions() { return VkPhysicalDeviceCooperativeMatrix2FeaturesNV.ncooperativeMatrixFlexibleDimensions(address()) != 0; }
        /** @return the value of the {@code cooperativeMatrixReductions} field. */
        @NativeType("VkBool32")
        public boolean cooperativeMatrixReductions() { return VkPhysicalDeviceCooperativeMatrix2FeaturesNV.ncooperativeMatrixReductions(address()) != 0; }
        /** @return the value of the {@code cooperativeMatrixConversions} field. */
        @NativeType("VkBool32")
        public boolean cooperativeMatrixConversions() { return VkPhysicalDeviceCooperativeMatrix2FeaturesNV.ncooperativeMatrixConversions(address()) != 0; }
        /** @return the value of the {@code cooperativeMatrixPerElementOperations} field. */
        @NativeType("VkBool32")
        public boolean cooperativeMatrixPerElementOperations() { return VkPhysicalDeviceCooperativeMatrix2FeaturesNV.ncooperativeMatrixPerElementOperations(address()) != 0; }
        /** @return the value of the {@code cooperativeMatrixTensorAddressing} field. */
        @NativeType("VkBool32")
        public boolean cooperativeMatrixTensorAddressing() { return VkPhysicalDeviceCooperativeMatrix2FeaturesNV.ncooperativeMatrixTensorAddressing(address()) != 0; }
        /** @return the value of the {@code cooperativeMatrixBlockLoads} field. */
        @NativeType("VkBool32")
        public boolean cooperativeMatrixBlockLoads() { return VkPhysicalDeviceCooperativeMatrix2FeaturesNV.ncooperativeMatrixBlockLoads(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceCooperativeMatrix2FeaturesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceCooperativeMatrix2FeaturesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVCooperativeMatrix2#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_2_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_2_FEATURES_NV} value to the {@code sType} field. */
        public VkPhysicalDeviceCooperativeMatrix2FeaturesNV.Buffer sType$Default() { return sType(NVCooperativeMatrix2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_2_FEATURES_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceCooperativeMatrix2FeaturesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceCooperativeMatrix2FeaturesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code cooperativeMatrixWorkgroupScope} field. */
        public VkPhysicalDeviceCooperativeMatrix2FeaturesNV.Buffer cooperativeMatrixWorkgroupScope(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceCooperativeMatrix2FeaturesNV.ncooperativeMatrixWorkgroupScope(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code cooperativeMatrixFlexibleDimensions} field. */
        public VkPhysicalDeviceCooperativeMatrix2FeaturesNV.Buffer cooperativeMatrixFlexibleDimensions(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceCooperativeMatrix2FeaturesNV.ncooperativeMatrixFlexibleDimensions(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code cooperativeMatrixReductions} field. */
        public VkPhysicalDeviceCooperativeMatrix2FeaturesNV.Buffer cooperativeMatrixReductions(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceCooperativeMatrix2FeaturesNV.ncooperativeMatrixReductions(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code cooperativeMatrixConversions} field. */
        public VkPhysicalDeviceCooperativeMatrix2FeaturesNV.Buffer cooperativeMatrixConversions(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceCooperativeMatrix2FeaturesNV.ncooperativeMatrixConversions(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code cooperativeMatrixPerElementOperations} field. */
        public VkPhysicalDeviceCooperativeMatrix2FeaturesNV.Buffer cooperativeMatrixPerElementOperations(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceCooperativeMatrix2FeaturesNV.ncooperativeMatrixPerElementOperations(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code cooperativeMatrixTensorAddressing} field. */
        public VkPhysicalDeviceCooperativeMatrix2FeaturesNV.Buffer cooperativeMatrixTensorAddressing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceCooperativeMatrix2FeaturesNV.ncooperativeMatrixTensorAddressing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code cooperativeMatrixBlockLoads} field. */
        public VkPhysicalDeviceCooperativeMatrix2FeaturesNV.Buffer cooperativeMatrixBlockLoads(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceCooperativeMatrix2FeaturesNV.ncooperativeMatrixBlockLoads(address(), value ? 1 : 0); return this; }

    }

}