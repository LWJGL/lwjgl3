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
 * Structure defining rasterization order for a graphics pipeline.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link AMDRasterizationOrder#VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_RASTERIZATION_ORDER_AMD STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_RASTERIZATION_ORDER_AMD}</li>
 * <li>{@code rasterizationOrder} <b>must</b> be a valid {@code VkRasterizationOrderAMD} value</li>
 * </ul>
 * 
 * <p>If the {@link AMDRasterizationOrder VK_AMD_rasterization_order} device extension is not enabled or the application does not request a particular rasterization order through specifying a {@link VkPipelineRasterizationStateRasterizationOrderAMD} structure then the rasterization order used by the graphics pipeline defaults to {@link AMDRasterizationOrder#VK_RASTERIZATION_ORDER_STRICT_AMD RASTERIZATION_ORDER_STRICT_AMD}.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineRasterizationStateRasterizationOrderAMD {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkRasterizationOrderAMD {@link #rasterizationOrder};
 * }</code></pre>
 */
public class VkPipelineRasterizationStateRasterizationOrderAMD extends Struct<VkPipelineRasterizationStateRasterizationOrderAMD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        RASTERIZATIONORDER;

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
        RASTERIZATIONORDER = layout.offsetof(2);
    }

    protected VkPipelineRasterizationStateRasterizationOrderAMD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelineRasterizationStateRasterizationOrderAMD create(long address, @Nullable ByteBuffer container) {
        return new VkPipelineRasterizationStateRasterizationOrderAMD(address, container);
    }

    /**
     * Creates a {@code VkPipelineRasterizationStateRasterizationOrderAMD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineRasterizationStateRasterizationOrderAMD(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a {@code VkRasterizationOrderAMD} value specifying the primitive rasterization order to use. */
    @NativeType("VkRasterizationOrderAMD")
    public int rasterizationOrder() { return nrasterizationOrder(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPipelineRasterizationStateRasterizationOrderAMD sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link AMDRasterizationOrder#VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_RASTERIZATION_ORDER_AMD STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_RASTERIZATION_ORDER_AMD} value to the {@link #sType} field. */
    public VkPipelineRasterizationStateRasterizationOrderAMD sType$Default() { return sType(AMDRasterizationOrder.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_RASTERIZATION_ORDER_AMD); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPipelineRasterizationStateRasterizationOrderAMD pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #rasterizationOrder} field. */
    public VkPipelineRasterizationStateRasterizationOrderAMD rasterizationOrder(@NativeType("VkRasterizationOrderAMD") int value) { nrasterizationOrder(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineRasterizationStateRasterizationOrderAMD set(
        int sType,
        long pNext,
        int rasterizationOrder
    ) {
        sType(sType);
        pNext(pNext);
        rasterizationOrder(rasterizationOrder);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineRasterizationStateRasterizationOrderAMD set(VkPipelineRasterizationStateRasterizationOrderAMD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineRasterizationStateRasterizationOrderAMD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineRasterizationStateRasterizationOrderAMD malloc() {
        return new VkPipelineRasterizationStateRasterizationOrderAMD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineRasterizationStateRasterizationOrderAMD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineRasterizationStateRasterizationOrderAMD calloc() {
        return new VkPipelineRasterizationStateRasterizationOrderAMD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineRasterizationStateRasterizationOrderAMD} instance allocated with {@link BufferUtils}. */
    public static VkPipelineRasterizationStateRasterizationOrderAMD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineRasterizationStateRasterizationOrderAMD(memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineRasterizationStateRasterizationOrderAMD} instance for the specified memory address. */
    public static VkPipelineRasterizationStateRasterizationOrderAMD create(long address) {
        return new VkPipelineRasterizationStateRasterizationOrderAMD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPipelineRasterizationStateRasterizationOrderAMD createSafe(long address) {
        return address == NULL ? null : new VkPipelineRasterizationStateRasterizationOrderAMD(address, null);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationStateRasterizationOrderAMD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationStateRasterizationOrderAMD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationStateRasterizationOrderAMD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationStateRasterizationOrderAMD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationStateRasterizationOrderAMD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationStateRasterizationOrderAMD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPipelineRasterizationStateRasterizationOrderAMD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationStateRasterizationOrderAMD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPipelineRasterizationStateRasterizationOrderAMD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineRasterizationStateRasterizationOrderAMD mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineRasterizationStateRasterizationOrderAMD callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineRasterizationStateRasterizationOrderAMD mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineRasterizationStateRasterizationOrderAMD callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineRasterizationStateRasterizationOrderAMD.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineRasterizationStateRasterizationOrderAMD.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineRasterizationStateRasterizationOrderAMD.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineRasterizationStateRasterizationOrderAMD.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPipelineRasterizationStateRasterizationOrderAMD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineRasterizationStateRasterizationOrderAMD malloc(MemoryStack stack) {
        return new VkPipelineRasterizationStateRasterizationOrderAMD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPipelineRasterizationStateRasterizationOrderAMD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineRasterizationStateRasterizationOrderAMD calloc(MemoryStack stack) {
        return new VkPipelineRasterizationStateRasterizationOrderAMD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationStateRasterizationOrderAMD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationStateRasterizationOrderAMD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationStateRasterizationOrderAMD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationStateRasterizationOrderAMD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPipelineRasterizationStateRasterizationOrderAMD.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineRasterizationStateRasterizationOrderAMD.PNEXT); }
    /** Unsafe version of {@link #rasterizationOrder}. */
    public static int nrasterizationOrder(long struct) { return memGetInt(struct + VkPipelineRasterizationStateRasterizationOrderAMD.RASTERIZATIONORDER); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineRasterizationStateRasterizationOrderAMD.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineRasterizationStateRasterizationOrderAMD.PNEXT, value); }
    /** Unsafe version of {@link #rasterizationOrder(int) rasterizationOrder}. */
    public static void nrasterizationOrder(long struct, int value) { memPutInt(struct + VkPipelineRasterizationStateRasterizationOrderAMD.RASTERIZATIONORDER, value); }

    // -----------------------------------

    /** An array of {@link VkPipelineRasterizationStateRasterizationOrderAMD} structs. */
    public static class Buffer extends StructBuffer<VkPipelineRasterizationStateRasterizationOrderAMD, Buffer> implements NativeResource {

        private static final VkPipelineRasterizationStateRasterizationOrderAMD ELEMENT_FACTORY = VkPipelineRasterizationStateRasterizationOrderAMD.create(-1L);

        /**
         * Creates a new {@code VkPipelineRasterizationStateRasterizationOrderAMD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineRasterizationStateRasterizationOrderAMD#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPipelineRasterizationStateRasterizationOrderAMD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPipelineRasterizationStateRasterizationOrderAMD#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineRasterizationStateRasterizationOrderAMD.nsType(address()); }
        /** @return the value of the {@link VkPipelineRasterizationStateRasterizationOrderAMD#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineRasterizationStateRasterizationOrderAMD.npNext(address()); }
        /** @return the value of the {@link VkPipelineRasterizationStateRasterizationOrderAMD#rasterizationOrder} field. */
        @NativeType("VkRasterizationOrderAMD")
        public int rasterizationOrder() { return VkPipelineRasterizationStateRasterizationOrderAMD.nrasterizationOrder(address()); }

        /** Sets the specified value to the {@link VkPipelineRasterizationStateRasterizationOrderAMD#sType} field. */
        public VkPipelineRasterizationStateRasterizationOrderAMD.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineRasterizationStateRasterizationOrderAMD.nsType(address(), value); return this; }
        /** Sets the {@link AMDRasterizationOrder#VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_RASTERIZATION_ORDER_AMD STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_RASTERIZATION_ORDER_AMD} value to the {@link VkPipelineRasterizationStateRasterizationOrderAMD#sType} field. */
        public VkPipelineRasterizationStateRasterizationOrderAMD.Buffer sType$Default() { return sType(AMDRasterizationOrder.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_RASTERIZATION_ORDER_AMD); }
        /** Sets the specified value to the {@link VkPipelineRasterizationStateRasterizationOrderAMD#pNext} field. */
        public VkPipelineRasterizationStateRasterizationOrderAMD.Buffer pNext(@NativeType("void const *") long value) { VkPipelineRasterizationStateRasterizationOrderAMD.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineRasterizationStateRasterizationOrderAMD#rasterizationOrder} field. */
        public VkPipelineRasterizationStateRasterizationOrderAMD.Buffer rasterizationOrder(@NativeType("VkRasterizationOrderAMD") int value) { VkPipelineRasterizationStateRasterizationOrderAMD.nrasterizationOrder(address(), value); return this; }

    }

}