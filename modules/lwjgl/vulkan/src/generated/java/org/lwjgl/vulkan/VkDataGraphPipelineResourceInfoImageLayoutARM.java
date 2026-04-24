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
 * struct VkDataGraphPipelineResourceInfoImageLayoutARM {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkImageLayout layout;
 * }}</pre>
 */
public class VkDataGraphPipelineResourceInfoImageLayoutARM extends Struct<VkDataGraphPipelineResourceInfoImageLayoutARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        LAYOUT;

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
        LAYOUT = layout.offsetof(2);
    }

    protected VkDataGraphPipelineResourceInfoImageLayoutARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDataGraphPipelineResourceInfoImageLayoutARM create(long address, @Nullable ByteBuffer container) {
        return new VkDataGraphPipelineResourceInfoImageLayoutARM(address, container);
    }

    /**
     * Creates a {@code VkDataGraphPipelineResourceInfoImageLayoutARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDataGraphPipelineResourceInfoImageLayoutARM(ByteBuffer container) {
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
    /** @return the value of the {@code layout} field. */
    @NativeType("VkImageLayout")
    public int layout() { return nlayout(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDataGraphPipelineResourceInfoImageLayoutARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMDataGraphOpticalFlow#VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_RESOURCE_INFO_IMAGE_LAYOUT_ARM STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_RESOURCE_INFO_IMAGE_LAYOUT_ARM} value to the {@code sType} field. */
    public VkDataGraphPipelineResourceInfoImageLayoutARM sType$Default() { return sType(ARMDataGraphOpticalFlow.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_RESOURCE_INFO_IMAGE_LAYOUT_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDataGraphPipelineResourceInfoImageLayoutARM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code layout} field. */
    public VkDataGraphPipelineResourceInfoImageLayoutARM layout(@NativeType("VkImageLayout") int value) { nlayout(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDataGraphPipelineResourceInfoImageLayoutARM set(
        int sType,
        long pNext,
        int layout
    ) {
        sType(sType);
        pNext(pNext);
        layout(layout);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDataGraphPipelineResourceInfoImageLayoutARM set(VkDataGraphPipelineResourceInfoImageLayoutARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDataGraphPipelineResourceInfoImageLayoutARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDataGraphPipelineResourceInfoImageLayoutARM malloc() {
        return new VkDataGraphPipelineResourceInfoImageLayoutARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDataGraphPipelineResourceInfoImageLayoutARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDataGraphPipelineResourceInfoImageLayoutARM calloc() {
        return new VkDataGraphPipelineResourceInfoImageLayoutARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDataGraphPipelineResourceInfoImageLayoutARM} instance allocated with {@link BufferUtils}. */
    public static VkDataGraphPipelineResourceInfoImageLayoutARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDataGraphPipelineResourceInfoImageLayoutARM(memAddress(container), container);
    }

    /** Returns a new {@code VkDataGraphPipelineResourceInfoImageLayoutARM} instance for the specified memory address. */
    public static VkDataGraphPipelineResourceInfoImageLayoutARM create(long address) {
        return new VkDataGraphPipelineResourceInfoImageLayoutARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDataGraphPipelineResourceInfoImageLayoutARM createSafe(long address) {
        return address == NULL ? null : new VkDataGraphPipelineResourceInfoImageLayoutARM(address, null);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineResourceInfoImageLayoutARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineResourceInfoImageLayoutARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineResourceInfoImageLayoutARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineResourceInfoImageLayoutARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineResourceInfoImageLayoutARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineResourceInfoImageLayoutARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDataGraphPipelineResourceInfoImageLayoutARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineResourceInfoImageLayoutARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDataGraphPipelineResourceInfoImageLayoutARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDataGraphPipelineResourceInfoImageLayoutARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDataGraphPipelineResourceInfoImageLayoutARM malloc(MemoryStack stack) {
        return new VkDataGraphPipelineResourceInfoImageLayoutARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDataGraphPipelineResourceInfoImageLayoutARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDataGraphPipelineResourceInfoImageLayoutARM calloc(MemoryStack stack) {
        return new VkDataGraphPipelineResourceInfoImageLayoutARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineResourceInfoImageLayoutARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineResourceInfoImageLayoutARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineResourceInfoImageLayoutARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineResourceInfoImageLayoutARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDataGraphPipelineResourceInfoImageLayoutARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDataGraphPipelineResourceInfoImageLayoutARM.PNEXT); }
    /** Unsafe version of {@link #layout}. */
    public static int nlayout(long struct) { return memGetInt(struct + VkDataGraphPipelineResourceInfoImageLayoutARM.LAYOUT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDataGraphPipelineResourceInfoImageLayoutARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDataGraphPipelineResourceInfoImageLayoutARM.PNEXT, value); }
    /** Unsafe version of {@link #layout(int) layout}. */
    public static void nlayout(long struct, int value) { memPutInt(struct + VkDataGraphPipelineResourceInfoImageLayoutARM.LAYOUT, value); }

    // -----------------------------------

    /** An array of {@link VkDataGraphPipelineResourceInfoImageLayoutARM} structs. */
    public static class Buffer extends StructBuffer<VkDataGraphPipelineResourceInfoImageLayoutARM, Buffer> implements NativeResource {

        private static final VkDataGraphPipelineResourceInfoImageLayoutARM ELEMENT_FACTORY = VkDataGraphPipelineResourceInfoImageLayoutARM.create(-1L);

        /**
         * Creates a new {@code VkDataGraphPipelineResourceInfoImageLayoutARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDataGraphPipelineResourceInfoImageLayoutARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDataGraphPipelineResourceInfoImageLayoutARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDataGraphPipelineResourceInfoImageLayoutARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDataGraphPipelineResourceInfoImageLayoutARM.npNext(address()); }
        /** @return the value of the {@code layout} field. */
        @NativeType("VkImageLayout")
        public int layout() { return VkDataGraphPipelineResourceInfoImageLayoutARM.nlayout(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDataGraphPipelineResourceInfoImageLayoutARM.Buffer sType(@NativeType("VkStructureType") int value) { VkDataGraphPipelineResourceInfoImageLayoutARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMDataGraphOpticalFlow#VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_RESOURCE_INFO_IMAGE_LAYOUT_ARM STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_RESOURCE_INFO_IMAGE_LAYOUT_ARM} value to the {@code sType} field. */
        public VkDataGraphPipelineResourceInfoImageLayoutARM.Buffer sType$Default() { return sType(ARMDataGraphOpticalFlow.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_RESOURCE_INFO_IMAGE_LAYOUT_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDataGraphPipelineResourceInfoImageLayoutARM.Buffer pNext(@NativeType("void const *") long value) { VkDataGraphPipelineResourceInfoImageLayoutARM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code layout} field. */
        public VkDataGraphPipelineResourceInfoImageLayoutARM.Buffer layout(@NativeType("VkImageLayout") int value) { VkDataGraphPipelineResourceInfoImageLayoutARM.nlayout(address(), value); return this; }

    }

}