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
 * struct VkDataGraphOpticalFlowImageFormatInfoARM {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkDataGraphOpticalFlowImageUsageFlagsARM usage;
 * }}</pre>
 */
public class VkDataGraphOpticalFlowImageFormatInfoARM extends Struct<VkDataGraphOpticalFlowImageFormatInfoARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        USAGE;

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
        USAGE = layout.offsetof(2);
    }

    protected VkDataGraphOpticalFlowImageFormatInfoARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDataGraphOpticalFlowImageFormatInfoARM create(long address, @Nullable ByteBuffer container) {
        return new VkDataGraphOpticalFlowImageFormatInfoARM(address, container);
    }

    /**
     * Creates a {@code VkDataGraphOpticalFlowImageFormatInfoARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDataGraphOpticalFlowImageFormatInfoARM(ByteBuffer container) {
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
    /** @return the value of the {@code usage} field. */
    @NativeType("VkDataGraphOpticalFlowImageUsageFlagsARM")
    public int usage() { return nusage(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDataGraphOpticalFlowImageFormatInfoARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMDataGraphOpticalFlow#VK_STRUCTURE_TYPE_DATA_GRAPH_OPTICAL_FLOW_IMAGE_FORMAT_INFO_ARM STRUCTURE_TYPE_DATA_GRAPH_OPTICAL_FLOW_IMAGE_FORMAT_INFO_ARM} value to the {@code sType} field. */
    public VkDataGraphOpticalFlowImageFormatInfoARM sType$Default() { return sType(ARMDataGraphOpticalFlow.VK_STRUCTURE_TYPE_DATA_GRAPH_OPTICAL_FLOW_IMAGE_FORMAT_INFO_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDataGraphOpticalFlowImageFormatInfoARM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code usage} field. */
    public VkDataGraphOpticalFlowImageFormatInfoARM usage(@NativeType("VkDataGraphOpticalFlowImageUsageFlagsARM") int value) { nusage(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDataGraphOpticalFlowImageFormatInfoARM set(
        int sType,
        long pNext,
        int usage
    ) {
        sType(sType);
        pNext(pNext);
        usage(usage);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDataGraphOpticalFlowImageFormatInfoARM set(VkDataGraphOpticalFlowImageFormatInfoARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDataGraphOpticalFlowImageFormatInfoARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDataGraphOpticalFlowImageFormatInfoARM malloc() {
        return new VkDataGraphOpticalFlowImageFormatInfoARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDataGraphOpticalFlowImageFormatInfoARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDataGraphOpticalFlowImageFormatInfoARM calloc() {
        return new VkDataGraphOpticalFlowImageFormatInfoARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDataGraphOpticalFlowImageFormatInfoARM} instance allocated with {@link BufferUtils}. */
    public static VkDataGraphOpticalFlowImageFormatInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDataGraphOpticalFlowImageFormatInfoARM(memAddress(container), container);
    }

    /** Returns a new {@code VkDataGraphOpticalFlowImageFormatInfoARM} instance for the specified memory address. */
    public static VkDataGraphOpticalFlowImageFormatInfoARM create(long address) {
        return new VkDataGraphOpticalFlowImageFormatInfoARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDataGraphOpticalFlowImageFormatInfoARM createSafe(long address) {
        return address == NULL ? null : new VkDataGraphOpticalFlowImageFormatInfoARM(address, null);
    }

    /**
     * Returns a new {@link VkDataGraphOpticalFlowImageFormatInfoARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphOpticalFlowImageFormatInfoARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphOpticalFlowImageFormatInfoARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphOpticalFlowImageFormatInfoARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphOpticalFlowImageFormatInfoARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphOpticalFlowImageFormatInfoARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDataGraphOpticalFlowImageFormatInfoARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDataGraphOpticalFlowImageFormatInfoARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDataGraphOpticalFlowImageFormatInfoARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDataGraphOpticalFlowImageFormatInfoARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDataGraphOpticalFlowImageFormatInfoARM malloc(MemoryStack stack) {
        return new VkDataGraphOpticalFlowImageFormatInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDataGraphOpticalFlowImageFormatInfoARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDataGraphOpticalFlowImageFormatInfoARM calloc(MemoryStack stack) {
        return new VkDataGraphOpticalFlowImageFormatInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDataGraphOpticalFlowImageFormatInfoARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDataGraphOpticalFlowImageFormatInfoARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphOpticalFlowImageFormatInfoARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDataGraphOpticalFlowImageFormatInfoARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDataGraphOpticalFlowImageFormatInfoARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDataGraphOpticalFlowImageFormatInfoARM.PNEXT); }
    /** Unsafe version of {@link #usage}. */
    public static int nusage(long struct) { return memGetInt(struct + VkDataGraphOpticalFlowImageFormatInfoARM.USAGE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDataGraphOpticalFlowImageFormatInfoARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDataGraphOpticalFlowImageFormatInfoARM.PNEXT, value); }
    /** Unsafe version of {@link #usage(int) usage}. */
    public static void nusage(long struct, int value) { memPutInt(struct + VkDataGraphOpticalFlowImageFormatInfoARM.USAGE, value); }

    // -----------------------------------

    /** An array of {@link VkDataGraphOpticalFlowImageFormatInfoARM} structs. */
    public static class Buffer extends StructBuffer<VkDataGraphOpticalFlowImageFormatInfoARM, Buffer> implements NativeResource {

        private static final VkDataGraphOpticalFlowImageFormatInfoARM ELEMENT_FACTORY = VkDataGraphOpticalFlowImageFormatInfoARM.create(-1L);

        /**
         * Creates a new {@code VkDataGraphOpticalFlowImageFormatInfoARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDataGraphOpticalFlowImageFormatInfoARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDataGraphOpticalFlowImageFormatInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDataGraphOpticalFlowImageFormatInfoARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDataGraphOpticalFlowImageFormatInfoARM.npNext(address()); }
        /** @return the value of the {@code usage} field. */
        @NativeType("VkDataGraphOpticalFlowImageUsageFlagsARM")
        public int usage() { return VkDataGraphOpticalFlowImageFormatInfoARM.nusage(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDataGraphOpticalFlowImageFormatInfoARM.Buffer sType(@NativeType("VkStructureType") int value) { VkDataGraphOpticalFlowImageFormatInfoARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMDataGraphOpticalFlow#VK_STRUCTURE_TYPE_DATA_GRAPH_OPTICAL_FLOW_IMAGE_FORMAT_INFO_ARM STRUCTURE_TYPE_DATA_GRAPH_OPTICAL_FLOW_IMAGE_FORMAT_INFO_ARM} value to the {@code sType} field. */
        public VkDataGraphOpticalFlowImageFormatInfoARM.Buffer sType$Default() { return sType(ARMDataGraphOpticalFlow.VK_STRUCTURE_TYPE_DATA_GRAPH_OPTICAL_FLOW_IMAGE_FORMAT_INFO_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDataGraphOpticalFlowImageFormatInfoARM.Buffer pNext(@NativeType("void const *") long value) { VkDataGraphOpticalFlowImageFormatInfoARM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code usage} field. */
        public VkDataGraphOpticalFlowImageFormatInfoARM.Buffer usage(@NativeType("VkDataGraphOpticalFlowImageUsageFlagsARM") int value) { VkDataGraphOpticalFlowImageFormatInfoARM.nusage(address(), value); return this; }

    }

}