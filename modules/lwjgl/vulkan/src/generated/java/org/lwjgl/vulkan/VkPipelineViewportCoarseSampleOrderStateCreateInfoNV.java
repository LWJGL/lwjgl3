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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre><code>
 * struct VkPipelineViewportCoarseSampleOrderStateCreateInfoNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkCoarseSampleOrderTypeNV sampleOrderType;
 *     uint32_t customSampleOrderCount;
 *     {@link VkCoarseSampleOrderCustomNV VkCoarseSampleOrderCustomNV} const * pCustomSampleOrders;
 * }</code></pre>
 */
public class VkPipelineViewportCoarseSampleOrderStateCreateInfoNV extends Struct<VkPipelineViewportCoarseSampleOrderStateCreateInfoNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SAMPLEORDERTYPE,
        CUSTOMSAMPLEORDERCOUNT,
        PCUSTOMSAMPLEORDERS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SAMPLEORDERTYPE = layout.offsetof(2);
        CUSTOMSAMPLEORDERCOUNT = layout.offsetof(3);
        PCUSTOMSAMPLEORDERS = layout.offsetof(4);
    }

    protected VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelineViewportCoarseSampleOrderStateCreateInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(address, container);
    }

    /**
     * Creates a {@code VkPipelineViewportCoarseSampleOrderStateCreateInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code sampleOrderType} field. */
    @NativeType("VkCoarseSampleOrderTypeNV")
    public int sampleOrderType() { return nsampleOrderType(address()); }
    /** @return the value of the {@code customSampleOrderCount} field. */
    @NativeType("uint32_t")
    public int customSampleOrderCount() { return ncustomSampleOrderCount(address()); }
    /** @return a {@link VkCoarseSampleOrderCustomNV.Buffer} view of the struct array pointed to by the {@code pCustomSampleOrders} field. */
    @NativeType("VkCoarseSampleOrderCustomNV const *")
    public VkCoarseSampleOrderCustomNV.@Nullable Buffer pCustomSampleOrders() { return npCustomSampleOrders(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVShadingRateImage#VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_COARSE_SAMPLE_ORDER_STATE_CREATE_INFO_NV STRUCTURE_TYPE_PIPELINE_VIEWPORT_COARSE_SAMPLE_ORDER_STATE_CREATE_INFO_NV} value to the {@code sType} field. */
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV sType$Default() { return sType(NVShadingRateImage.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_COARSE_SAMPLE_ORDER_STATE_CREATE_INFO_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code sampleOrderType} field. */
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV sampleOrderType(@NativeType("VkCoarseSampleOrderTypeNV") int value) { nsampleOrderType(address(), value); return this; }
    /** Sets the address of the specified {@link VkCoarseSampleOrderCustomNV.Buffer} to the {@code pCustomSampleOrders} field. */
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV pCustomSampleOrders(@NativeType("VkCoarseSampleOrderCustomNV const *") VkCoarseSampleOrderCustomNV.@Nullable Buffer value) { npCustomSampleOrders(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV set(
        int sType,
        long pNext,
        int sampleOrderType,
        VkCoarseSampleOrderCustomNV.@Nullable Buffer pCustomSampleOrders
    ) {
        sType(sType);
        pNext(pNext);
        sampleOrderType(sampleOrderType);
        pCustomSampleOrders(pCustomSampleOrders);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV set(VkPipelineViewportCoarseSampleOrderStateCreateInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineViewportCoarseSampleOrderStateCreateInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV malloc() {
        return new VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineViewportCoarseSampleOrderStateCreateInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV calloc() {
        return new VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineViewportCoarseSampleOrderStateCreateInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineViewportCoarseSampleOrderStateCreateInfoNV} instance for the specified memory address. */
    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV create(long address) {
        return new VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPipelineViewportCoarseSampleOrderStateCreateInfoNV createSafe(long address) {
        return address == NULL ? null : new VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPipelineViewportCoarseSampleOrderStateCreateInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV malloc(MemoryStack stack) {
        return new VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPipelineViewportCoarseSampleOrderStateCreateInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV calloc(MemoryStack stack) {
        return new VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.PNEXT); }
    /** Unsafe version of {@link #sampleOrderType}. */
    public static int nsampleOrderType(long struct) { return memGetInt(struct + VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.SAMPLEORDERTYPE); }
    /** Unsafe version of {@link #customSampleOrderCount}. */
    public static int ncustomSampleOrderCount(long struct) { return memGetInt(struct + VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.CUSTOMSAMPLEORDERCOUNT); }
    /** Unsafe version of {@link #pCustomSampleOrders}. */
    public static VkCoarseSampleOrderCustomNV.@Nullable Buffer npCustomSampleOrders(long struct) { return VkCoarseSampleOrderCustomNV.createSafe(memGetAddress(struct + VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.PCUSTOMSAMPLEORDERS), ncustomSampleOrderCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #sampleOrderType(int) sampleOrderType}. */
    public static void nsampleOrderType(long struct, int value) { memPutInt(struct + VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.SAMPLEORDERTYPE, value); }
    /** Sets the specified value to the {@code customSampleOrderCount} field of the specified {@code struct}. */
    public static void ncustomSampleOrderCount(long struct, int value) { memPutInt(struct + VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.CUSTOMSAMPLEORDERCOUNT, value); }
    /** Unsafe version of {@link #pCustomSampleOrders(VkCoarseSampleOrderCustomNV.Buffer) pCustomSampleOrders}. */
    public static void npCustomSampleOrders(long struct, VkCoarseSampleOrderCustomNV.@Nullable Buffer value) { memPutAddress(struct + VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.PCUSTOMSAMPLEORDERS, memAddressSafe(value)); ncustomSampleOrderCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int customSampleOrderCount = ncustomSampleOrderCount(struct);
        if (customSampleOrderCount != 0) {
            long pCustomSampleOrders = memGetAddress(struct + VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.PCUSTOMSAMPLEORDERS);
            check(pCustomSampleOrders);
            validate(pCustomSampleOrders, customSampleOrderCount, VkCoarseSampleOrderCustomNV.SIZEOF, VkCoarseSampleOrderCustomNV::validate);
        }
    }

    // -----------------------------------

    /** An array of {@link VkPipelineViewportCoarseSampleOrderStateCreateInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkPipelineViewportCoarseSampleOrderStateCreateInfoNV, Buffer> implements NativeResource {

        private static final VkPipelineViewportCoarseSampleOrderStateCreateInfoNV ELEMENT_FACTORY = VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.create(-1L);

        /**
         * Creates a new {@code VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineViewportCoarseSampleOrderStateCreateInfoNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPipelineViewportCoarseSampleOrderStateCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.npNext(address()); }
        /** @return the value of the {@code sampleOrderType} field. */
        @NativeType("VkCoarseSampleOrderTypeNV")
        public int sampleOrderType() { return VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.nsampleOrderType(address()); }
        /** @return the value of the {@code customSampleOrderCount} field. */
        @NativeType("uint32_t")
        public int customSampleOrderCount() { return VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.ncustomSampleOrderCount(address()); }
        /** @return a {@link VkCoarseSampleOrderCustomNV.Buffer} view of the struct array pointed to by the {@code pCustomSampleOrders} field. */
        @NativeType("VkCoarseSampleOrderCustomNV const *")
        public VkCoarseSampleOrderCustomNV.@Nullable Buffer pCustomSampleOrders() { return VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.npCustomSampleOrders(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVShadingRateImage#VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_COARSE_SAMPLE_ORDER_STATE_CREATE_INFO_NV STRUCTURE_TYPE_PIPELINE_VIEWPORT_COARSE_SAMPLE_ORDER_STATE_CREATE_INFO_NV} value to the {@code sType} field. */
        public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.Buffer sType$Default() { return sType(NVShadingRateImage.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_COARSE_SAMPLE_ORDER_STATE_CREATE_INFO_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code sampleOrderType} field. */
        public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.Buffer sampleOrderType(@NativeType("VkCoarseSampleOrderTypeNV") int value) { VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.nsampleOrderType(address(), value); return this; }
        /** Sets the address of the specified {@link VkCoarseSampleOrderCustomNV.Buffer} to the {@code pCustomSampleOrders} field. */
        public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.Buffer pCustomSampleOrders(@NativeType("VkCoarseSampleOrderCustomNV const *") VkCoarseSampleOrderCustomNV.@Nullable Buffer value) { VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.npCustomSampleOrders(address(), value); return this; }

    }

}