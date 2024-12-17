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
 * <pre>{@code
 * struct VkPipelineFragmentShadingRateStateCreateInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     {@link VkExtent2D VkExtent2D} fragmentSize;
 *     VkFragmentShadingRateCombinerOpKHR combinerOps[2];
 * }}</pre>
 */
public class VkPipelineFragmentShadingRateStateCreateInfoKHR extends Struct<VkPipelineFragmentShadingRateStateCreateInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FRAGMENTSIZE,
        COMBINEROPS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __array(4, 2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FRAGMENTSIZE = layout.offsetof(2);
        COMBINEROPS = layout.offsetof(3);
    }

    protected VkPipelineFragmentShadingRateStateCreateInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelineFragmentShadingRateStateCreateInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPipelineFragmentShadingRateStateCreateInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkPipelineFragmentShadingRateStateCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineFragmentShadingRateStateCreateInfoKHR(ByteBuffer container) {
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
    /** @return a {@link VkExtent2D} view of the {@code fragmentSize} field. */
    public VkExtent2D fragmentSize() { return nfragmentSize(address()); }
    /** @return a {@link IntBuffer} view of the {@code combinerOps} field. */
    @NativeType("VkFragmentShadingRateCombinerOpKHR[2]")
    public IntBuffer combinerOps() { return ncombinerOps(address()); }
    /** @return the value at the specified index of the {@code combinerOps} field. */
    @NativeType("VkFragmentShadingRateCombinerOpKHR")
    public int combinerOps(int index) { return ncombinerOps(address(), index); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineFragmentShadingRateStateCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRFragmentShadingRate#VK_STRUCTURE_TYPE_PIPELINE_FRAGMENT_SHADING_RATE_STATE_CREATE_INFO_KHR STRUCTURE_TYPE_PIPELINE_FRAGMENT_SHADING_RATE_STATE_CREATE_INFO_KHR} value to the {@code sType} field. */
    public VkPipelineFragmentShadingRateStateCreateInfoKHR sType$Default() { return sType(KHRFragmentShadingRate.VK_STRUCTURE_TYPE_PIPELINE_FRAGMENT_SHADING_RATE_STATE_CREATE_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPipelineFragmentShadingRateStateCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Copies the specified {@link VkExtent2D} to the {@code fragmentSize} field. */
    public VkPipelineFragmentShadingRateStateCreateInfoKHR fragmentSize(VkExtent2D value) { nfragmentSize(address(), value); return this; }
    /** Passes the {@code fragmentSize} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkPipelineFragmentShadingRateStateCreateInfoKHR fragmentSize(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(fragmentSize()); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code combinerOps} field. */
    public VkPipelineFragmentShadingRateStateCreateInfoKHR combinerOps(@NativeType("VkFragmentShadingRateCombinerOpKHR[2]") IntBuffer value) { ncombinerOps(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code combinerOps} field. */
    public VkPipelineFragmentShadingRateStateCreateInfoKHR combinerOps(int index, @NativeType("VkFragmentShadingRateCombinerOpKHR") int value) { ncombinerOps(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineFragmentShadingRateStateCreateInfoKHR set(
        int sType,
        long pNext,
        VkExtent2D fragmentSize,
        IntBuffer combinerOps
    ) {
        sType(sType);
        pNext(pNext);
        fragmentSize(fragmentSize);
        combinerOps(combinerOps);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineFragmentShadingRateStateCreateInfoKHR set(VkPipelineFragmentShadingRateStateCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineFragmentShadingRateStateCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineFragmentShadingRateStateCreateInfoKHR malloc() {
        return new VkPipelineFragmentShadingRateStateCreateInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineFragmentShadingRateStateCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineFragmentShadingRateStateCreateInfoKHR calloc() {
        return new VkPipelineFragmentShadingRateStateCreateInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineFragmentShadingRateStateCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkPipelineFragmentShadingRateStateCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineFragmentShadingRateStateCreateInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineFragmentShadingRateStateCreateInfoKHR} instance for the specified memory address. */
    public static VkPipelineFragmentShadingRateStateCreateInfoKHR create(long address) {
        return new VkPipelineFragmentShadingRateStateCreateInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPipelineFragmentShadingRateStateCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkPipelineFragmentShadingRateStateCreateInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkPipelineFragmentShadingRateStateCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineFragmentShadingRateStateCreateInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineFragmentShadingRateStateCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineFragmentShadingRateStateCreateInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineFragmentShadingRateStateCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineFragmentShadingRateStateCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPipelineFragmentShadingRateStateCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineFragmentShadingRateStateCreateInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPipelineFragmentShadingRateStateCreateInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPipelineFragmentShadingRateStateCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineFragmentShadingRateStateCreateInfoKHR malloc(MemoryStack stack) {
        return new VkPipelineFragmentShadingRateStateCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPipelineFragmentShadingRateStateCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineFragmentShadingRateStateCreateInfoKHR calloc(MemoryStack stack) {
        return new VkPipelineFragmentShadingRateStateCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPipelineFragmentShadingRateStateCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineFragmentShadingRateStateCreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineFragmentShadingRateStateCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineFragmentShadingRateStateCreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPipelineFragmentShadingRateStateCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineFragmentShadingRateStateCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #fragmentSize}. */
    public static VkExtent2D nfragmentSize(long struct) { return VkExtent2D.create(struct + VkPipelineFragmentShadingRateStateCreateInfoKHR.FRAGMENTSIZE); }
    /** Unsafe version of {@link #combinerOps}. */
    public static IntBuffer ncombinerOps(long struct) { return memIntBuffer(struct + VkPipelineFragmentShadingRateStateCreateInfoKHR.COMBINEROPS, 2); }
    /** Unsafe version of {@link #combinerOps(int) combinerOps}. */
    public static int ncombinerOps(long struct, int index) {
        return memGetInt(struct + VkPipelineFragmentShadingRateStateCreateInfoKHR.COMBINEROPS + check(index, 2) * 4);
    }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineFragmentShadingRateStateCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineFragmentShadingRateStateCreateInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #fragmentSize(VkExtent2D) fragmentSize}. */
    public static void nfragmentSize(long struct, VkExtent2D value) { memCopy(value.address(), struct + VkPipelineFragmentShadingRateStateCreateInfoKHR.FRAGMENTSIZE, VkExtent2D.SIZEOF); }
    /** Unsafe version of {@link #combinerOps(IntBuffer) combinerOps}. */
    public static void ncombinerOps(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 2); }
        memCopy(memAddress(value), struct + VkPipelineFragmentShadingRateStateCreateInfoKHR.COMBINEROPS, value.remaining() * 4);
    }
    /** Unsafe version of {@link #combinerOps(int, int) combinerOps}. */
    public static void ncombinerOps(long struct, int index, int value) {
        memPutInt(struct + VkPipelineFragmentShadingRateStateCreateInfoKHR.COMBINEROPS + check(index, 2) * 4, value);
    }

    // -----------------------------------

    /** An array of {@link VkPipelineFragmentShadingRateStateCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkPipelineFragmentShadingRateStateCreateInfoKHR, Buffer> implements NativeResource {

        private static final VkPipelineFragmentShadingRateStateCreateInfoKHR ELEMENT_FACTORY = VkPipelineFragmentShadingRateStateCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkPipelineFragmentShadingRateStateCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineFragmentShadingRateStateCreateInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPipelineFragmentShadingRateStateCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineFragmentShadingRateStateCreateInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineFragmentShadingRateStateCreateInfoKHR.npNext(address()); }
        /** @return a {@link VkExtent2D} view of the {@code fragmentSize} field. */
        public VkExtent2D fragmentSize() { return VkPipelineFragmentShadingRateStateCreateInfoKHR.nfragmentSize(address()); }
        /** @return a {@link IntBuffer} view of the {@code combinerOps} field. */
        @NativeType("VkFragmentShadingRateCombinerOpKHR[2]")
        public IntBuffer combinerOps() { return VkPipelineFragmentShadingRateStateCreateInfoKHR.ncombinerOps(address()); }
        /** @return the value at the specified index of the {@code combinerOps} field. */
        @NativeType("VkFragmentShadingRateCombinerOpKHR")
        public int combinerOps(int index) { return VkPipelineFragmentShadingRateStateCreateInfoKHR.ncombinerOps(address(), index); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineFragmentShadingRateStateCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineFragmentShadingRateStateCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRFragmentShadingRate#VK_STRUCTURE_TYPE_PIPELINE_FRAGMENT_SHADING_RATE_STATE_CREATE_INFO_KHR STRUCTURE_TYPE_PIPELINE_FRAGMENT_SHADING_RATE_STATE_CREATE_INFO_KHR} value to the {@code sType} field. */
        public VkPipelineFragmentShadingRateStateCreateInfoKHR.Buffer sType$Default() { return sType(KHRFragmentShadingRate.VK_STRUCTURE_TYPE_PIPELINE_FRAGMENT_SHADING_RATE_STATE_CREATE_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineFragmentShadingRateStateCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkPipelineFragmentShadingRateStateCreateInfoKHR.npNext(address(), value); return this; }
        /** Copies the specified {@link VkExtent2D} to the {@code fragmentSize} field. */
        public VkPipelineFragmentShadingRateStateCreateInfoKHR.Buffer fragmentSize(VkExtent2D value) { VkPipelineFragmentShadingRateStateCreateInfoKHR.nfragmentSize(address(), value); return this; }
        /** Passes the {@code fragmentSize} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkPipelineFragmentShadingRateStateCreateInfoKHR.Buffer fragmentSize(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(fragmentSize()); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code combinerOps} field. */
        public VkPipelineFragmentShadingRateStateCreateInfoKHR.Buffer combinerOps(@NativeType("VkFragmentShadingRateCombinerOpKHR[2]") IntBuffer value) { VkPipelineFragmentShadingRateStateCreateInfoKHR.ncombinerOps(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code combinerOps} field. */
        public VkPipelineFragmentShadingRateStateCreateInfoKHR.Buffer combinerOps(int index, @NativeType("VkFragmentShadingRateCombinerOpKHR") int value) { VkPipelineFragmentShadingRateStateCreateInfoKHR.ncombinerOps(address(), index, value); return this; }

    }

}