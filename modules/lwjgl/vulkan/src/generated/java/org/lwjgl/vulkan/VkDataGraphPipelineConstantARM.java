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
 * struct VkDataGraphPipelineConstantARM {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t id;
 *     void const * pConstantData;
 * }}</pre>
 */
public class VkDataGraphPipelineConstantARM extends Struct<VkDataGraphPipelineConstantARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ID,
        PCONSTANTDATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ID = layout.offsetof(2);
        PCONSTANTDATA = layout.offsetof(3);
    }

    protected VkDataGraphPipelineConstantARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDataGraphPipelineConstantARM create(long address, @Nullable ByteBuffer container) {
        return new VkDataGraphPipelineConstantARM(address, container);
    }

    /**
     * Creates a {@code VkDataGraphPipelineConstantARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDataGraphPipelineConstantARM(ByteBuffer container) {
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
    /** @return the value of the {@code id} field. */
    @NativeType("uint32_t")
    public int id() { return nid(address()); }
    /** @return the value of the {@code pConstantData} field. */
    @NativeType("void const *")
    public long pConstantData() { return npConstantData(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDataGraphPipelineConstantARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMDataGraph#VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_CONSTANT_ARM STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_CONSTANT_ARM} value to the {@code sType} field. */
    public VkDataGraphPipelineConstantARM sType$Default() { return sType(ARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_CONSTANT_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDataGraphPipelineConstantARM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM} value to the {@code pNext} chain. */
    public VkDataGraphPipelineConstantARM pNext(VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkTensorDescriptionARM} value to the {@code pNext} chain. */
    public VkDataGraphPipelineConstantARM pNext(VkTensorDescriptionARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code id} field. */
    public VkDataGraphPipelineConstantARM id(@NativeType("uint32_t") int value) { nid(address(), value); return this; }
    /** Sets the specified value to the {@code pConstantData} field. */
    public VkDataGraphPipelineConstantARM pConstantData(@NativeType("void const *") long value) { npConstantData(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDataGraphPipelineConstantARM set(
        int sType,
        long pNext,
        int id,
        long pConstantData
    ) {
        sType(sType);
        pNext(pNext);
        id(id);
        pConstantData(pConstantData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDataGraphPipelineConstantARM set(VkDataGraphPipelineConstantARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDataGraphPipelineConstantARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDataGraphPipelineConstantARM malloc() {
        return new VkDataGraphPipelineConstantARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDataGraphPipelineConstantARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDataGraphPipelineConstantARM calloc() {
        return new VkDataGraphPipelineConstantARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDataGraphPipelineConstantARM} instance allocated with {@link BufferUtils}. */
    public static VkDataGraphPipelineConstantARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDataGraphPipelineConstantARM(memAddress(container), container);
    }

    /** Returns a new {@code VkDataGraphPipelineConstantARM} instance for the specified memory address. */
    public static VkDataGraphPipelineConstantARM create(long address) {
        return new VkDataGraphPipelineConstantARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDataGraphPipelineConstantARM createSafe(long address) {
        return address == NULL ? null : new VkDataGraphPipelineConstantARM(address, null);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineConstantARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineConstantARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineConstantARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineConstantARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineConstantARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineConstantARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDataGraphPipelineConstantARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineConstantARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDataGraphPipelineConstantARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDataGraphPipelineConstantARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDataGraphPipelineConstantARM malloc(MemoryStack stack) {
        return new VkDataGraphPipelineConstantARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDataGraphPipelineConstantARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDataGraphPipelineConstantARM calloc(MemoryStack stack) {
        return new VkDataGraphPipelineConstantARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineConstantARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineConstantARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineConstantARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineConstantARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDataGraphPipelineConstantARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDataGraphPipelineConstantARM.PNEXT); }
    /** Unsafe version of {@link #id}. */
    public static int nid(long struct) { return memGetInt(struct + VkDataGraphPipelineConstantARM.ID); }
    /** Unsafe version of {@link #pConstantData}. */
    public static long npConstantData(long struct) { return memGetAddress(struct + VkDataGraphPipelineConstantARM.PCONSTANTDATA); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDataGraphPipelineConstantARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDataGraphPipelineConstantARM.PNEXT, value); }
    /** Unsafe version of {@link #id(int) id}. */
    public static void nid(long struct, int value) { memPutInt(struct + VkDataGraphPipelineConstantARM.ID, value); }
    /** Unsafe version of {@link #pConstantData(long) pConstantData}. */
    public static void npConstantData(long struct, long value) { memPutAddress(struct + VkDataGraphPipelineConstantARM.PCONSTANTDATA, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkDataGraphPipelineConstantARM.PCONSTANTDATA));
    }

    // -----------------------------------

    /** An array of {@link VkDataGraphPipelineConstantARM} structs. */
    public static class Buffer extends StructBuffer<VkDataGraphPipelineConstantARM, Buffer> implements NativeResource {

        private static final VkDataGraphPipelineConstantARM ELEMENT_FACTORY = VkDataGraphPipelineConstantARM.create(-1L);

        /**
         * Creates a new {@code VkDataGraphPipelineConstantARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDataGraphPipelineConstantARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDataGraphPipelineConstantARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDataGraphPipelineConstantARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDataGraphPipelineConstantARM.npNext(address()); }
        /** @return the value of the {@code id} field. */
        @NativeType("uint32_t")
        public int id() { return VkDataGraphPipelineConstantARM.nid(address()); }
        /** @return the value of the {@code pConstantData} field. */
        @NativeType("void const *")
        public long pConstantData() { return VkDataGraphPipelineConstantARM.npConstantData(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDataGraphPipelineConstantARM.Buffer sType(@NativeType("VkStructureType") int value) { VkDataGraphPipelineConstantARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMDataGraph#VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_CONSTANT_ARM STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_CONSTANT_ARM} value to the {@code sType} field. */
        public VkDataGraphPipelineConstantARM.Buffer sType$Default() { return sType(ARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_CONSTANT_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDataGraphPipelineConstantARM.Buffer pNext(@NativeType("void const *") long value) { VkDataGraphPipelineConstantARM.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM} value to the {@code pNext} chain. */
        public VkDataGraphPipelineConstantARM.Buffer pNext(VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkTensorDescriptionARM} value to the {@code pNext} chain. */
        public VkDataGraphPipelineConstantARM.Buffer pNext(VkTensorDescriptionARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code id} field. */
        public VkDataGraphPipelineConstantARM.Buffer id(@NativeType("uint32_t") int value) { VkDataGraphPipelineConstantARM.nid(address(), value); return this; }
        /** Sets the specified value to the {@code pConstantData} field. */
        public VkDataGraphPipelineConstantARM.Buffer pConstantData(@NativeType("void const *") long value) { VkDataGraphPipelineConstantARM.npConstantData(address(), value); return this; }

    }

}