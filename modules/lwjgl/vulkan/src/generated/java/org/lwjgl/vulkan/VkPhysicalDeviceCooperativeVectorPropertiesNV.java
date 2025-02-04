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
 * struct VkPhysicalDeviceCooperativeVectorPropertiesNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkShaderStageFlags cooperativeVectorSupportedStages;
 *     VkBool32 cooperativeVectorTrainingFloat16Accumulation;
 *     VkBool32 cooperativeVectorTrainingFloat32Accumulation;
 *     uint32_t maxCooperativeVectorComponents;
 * }}</pre>
 */
public class VkPhysicalDeviceCooperativeVectorPropertiesNV extends Struct<VkPhysicalDeviceCooperativeVectorPropertiesNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        COOPERATIVEVECTORSUPPORTEDSTAGES,
        COOPERATIVEVECTORTRAININGFLOAT16ACCUMULATION,
        COOPERATIVEVECTORTRAININGFLOAT32ACCUMULATION,
        MAXCOOPERATIVEVECTORCOMPONENTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COOPERATIVEVECTORSUPPORTEDSTAGES = layout.offsetof(2);
        COOPERATIVEVECTORTRAININGFLOAT16ACCUMULATION = layout.offsetof(3);
        COOPERATIVEVECTORTRAININGFLOAT32ACCUMULATION = layout.offsetof(4);
        MAXCOOPERATIVEVECTORCOMPONENTS = layout.offsetof(5);
    }

    protected VkPhysicalDeviceCooperativeVectorPropertiesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceCooperativeVectorPropertiesNV create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceCooperativeVectorPropertiesNV(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceCooperativeVectorPropertiesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceCooperativeVectorPropertiesNV(ByteBuffer container) {
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
    /** @return the value of the {@code cooperativeVectorSupportedStages} field. */
    @NativeType("VkShaderStageFlags")
    public int cooperativeVectorSupportedStages() { return ncooperativeVectorSupportedStages(address()); }
    /** @return the value of the {@code cooperativeVectorTrainingFloat16Accumulation} field. */
    @NativeType("VkBool32")
    public boolean cooperativeVectorTrainingFloat16Accumulation() { return ncooperativeVectorTrainingFloat16Accumulation(address()) != 0; }
    /** @return the value of the {@code cooperativeVectorTrainingFloat32Accumulation} field. */
    @NativeType("VkBool32")
    public boolean cooperativeVectorTrainingFloat32Accumulation() { return ncooperativeVectorTrainingFloat32Accumulation(address()) != 0; }
    /** @return the value of the {@code maxCooperativeVectorComponents} field. */
    @NativeType("uint32_t")
    public int maxCooperativeVectorComponents() { return nmaxCooperativeVectorComponents(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceCooperativeVectorPropertiesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVCooperativeVector#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_VECTOR_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_VECTOR_PROPERTIES_NV} value to the {@code sType} field. */
    public VkPhysicalDeviceCooperativeVectorPropertiesNV sType$Default() { return sType(NVCooperativeVector.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_VECTOR_PROPERTIES_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceCooperativeVectorPropertiesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceCooperativeVectorPropertiesNV set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceCooperativeVectorPropertiesNV set(VkPhysicalDeviceCooperativeVectorPropertiesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceCooperativeVectorPropertiesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceCooperativeVectorPropertiesNV malloc() {
        return new VkPhysicalDeviceCooperativeVectorPropertiesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceCooperativeVectorPropertiesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceCooperativeVectorPropertiesNV calloc() {
        return new VkPhysicalDeviceCooperativeVectorPropertiesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceCooperativeVectorPropertiesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceCooperativeVectorPropertiesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceCooperativeVectorPropertiesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceCooperativeVectorPropertiesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceCooperativeVectorPropertiesNV create(long address) {
        return new VkPhysicalDeviceCooperativeVectorPropertiesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceCooperativeVectorPropertiesNV createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceCooperativeVectorPropertiesNV(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeVectorPropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeVectorPropertiesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeVectorPropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeVectorPropertiesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeVectorPropertiesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeVectorPropertiesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceCooperativeVectorPropertiesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeVectorPropertiesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceCooperativeVectorPropertiesNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceCooperativeVectorPropertiesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceCooperativeVectorPropertiesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceCooperativeVectorPropertiesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceCooperativeVectorPropertiesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceCooperativeVectorPropertiesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceCooperativeVectorPropertiesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeVectorPropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeVectorPropertiesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeVectorPropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeVectorPropertiesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceCooperativeVectorPropertiesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceCooperativeVectorPropertiesNV.PNEXT); }
    /** Unsafe version of {@link #cooperativeVectorSupportedStages}. */
    public static int ncooperativeVectorSupportedStages(long struct) { return memGetInt(struct + VkPhysicalDeviceCooperativeVectorPropertiesNV.COOPERATIVEVECTORSUPPORTEDSTAGES); }
    /** Unsafe version of {@link #cooperativeVectorTrainingFloat16Accumulation}. */
    public static int ncooperativeVectorTrainingFloat16Accumulation(long struct) { return memGetInt(struct + VkPhysicalDeviceCooperativeVectorPropertiesNV.COOPERATIVEVECTORTRAININGFLOAT16ACCUMULATION); }
    /** Unsafe version of {@link #cooperativeVectorTrainingFloat32Accumulation}. */
    public static int ncooperativeVectorTrainingFloat32Accumulation(long struct) { return memGetInt(struct + VkPhysicalDeviceCooperativeVectorPropertiesNV.COOPERATIVEVECTORTRAININGFLOAT32ACCUMULATION); }
    /** Unsafe version of {@link #maxCooperativeVectorComponents}. */
    public static int nmaxCooperativeVectorComponents(long struct) { return memGetInt(struct + VkPhysicalDeviceCooperativeVectorPropertiesNV.MAXCOOPERATIVEVECTORCOMPONENTS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceCooperativeVectorPropertiesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceCooperativeVectorPropertiesNV.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceCooperativeVectorPropertiesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceCooperativeVectorPropertiesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceCooperativeVectorPropertiesNV ELEMENT_FACTORY = VkPhysicalDeviceCooperativeVectorPropertiesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceCooperativeVectorPropertiesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceCooperativeVectorPropertiesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceCooperativeVectorPropertiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceCooperativeVectorPropertiesNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceCooperativeVectorPropertiesNV.npNext(address()); }
        /** @return the value of the {@code cooperativeVectorSupportedStages} field. */
        @NativeType("VkShaderStageFlags")
        public int cooperativeVectorSupportedStages() { return VkPhysicalDeviceCooperativeVectorPropertiesNV.ncooperativeVectorSupportedStages(address()); }
        /** @return the value of the {@code cooperativeVectorTrainingFloat16Accumulation} field. */
        @NativeType("VkBool32")
        public boolean cooperativeVectorTrainingFloat16Accumulation() { return VkPhysicalDeviceCooperativeVectorPropertiesNV.ncooperativeVectorTrainingFloat16Accumulation(address()) != 0; }
        /** @return the value of the {@code cooperativeVectorTrainingFloat32Accumulation} field. */
        @NativeType("VkBool32")
        public boolean cooperativeVectorTrainingFloat32Accumulation() { return VkPhysicalDeviceCooperativeVectorPropertiesNV.ncooperativeVectorTrainingFloat32Accumulation(address()) != 0; }
        /** @return the value of the {@code maxCooperativeVectorComponents} field. */
        @NativeType("uint32_t")
        public int maxCooperativeVectorComponents() { return VkPhysicalDeviceCooperativeVectorPropertiesNV.nmaxCooperativeVectorComponents(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceCooperativeVectorPropertiesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceCooperativeVectorPropertiesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVCooperativeVector#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_VECTOR_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_VECTOR_PROPERTIES_NV} value to the {@code sType} field. */
        public VkPhysicalDeviceCooperativeVectorPropertiesNV.Buffer sType$Default() { return sType(NVCooperativeVector.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_VECTOR_PROPERTIES_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceCooperativeVectorPropertiesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceCooperativeVectorPropertiesNV.npNext(address(), value); return this; }

    }

}