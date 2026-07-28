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
 * struct VkQueueFamilyDataGraphOpticalFlowPropertiesARM {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkDataGraphOpticalFlowGridSizeFlagsARM supportedOutputGridSizes;
 *     VkDataGraphOpticalFlowGridSizeFlagsARM supportedHintGridSizes;
 *     VkBool32 hintSupported;
 *     VkBool32 costSupported;
 *     uint32_t minWidth;
 *     uint32_t minHeight;
 *     uint32_t maxWidth;
 *     uint32_t maxHeight;
 * }}</pre>
 */
public class VkQueueFamilyDataGraphOpticalFlowPropertiesARM extends Struct<VkQueueFamilyDataGraphOpticalFlowPropertiesARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SUPPORTEDOUTPUTGRIDSIZES,
        SUPPORTEDHINTGRIDSIZES,
        HINTSUPPORTED,
        COSTSUPPORTED,
        MINWIDTH,
        MINHEIGHT,
        MAXWIDTH,
        MAXHEIGHT;

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
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SUPPORTEDOUTPUTGRIDSIZES = layout.offsetof(2);
        SUPPORTEDHINTGRIDSIZES = layout.offsetof(3);
        HINTSUPPORTED = layout.offsetof(4);
        COSTSUPPORTED = layout.offsetof(5);
        MINWIDTH = layout.offsetof(6);
        MINHEIGHT = layout.offsetof(7);
        MAXWIDTH = layout.offsetof(8);
        MAXHEIGHT = layout.offsetof(9);
    }

    protected VkQueueFamilyDataGraphOpticalFlowPropertiesARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkQueueFamilyDataGraphOpticalFlowPropertiesARM create(long address, @Nullable ByteBuffer container) {
        return new VkQueueFamilyDataGraphOpticalFlowPropertiesARM(address, container);
    }

    /**
     * Creates a {@code VkQueueFamilyDataGraphOpticalFlowPropertiesARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkQueueFamilyDataGraphOpticalFlowPropertiesARM(ByteBuffer container) {
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
    /** @return the value of the {@code supportedOutputGridSizes} field. */
    @NativeType("VkDataGraphOpticalFlowGridSizeFlagsARM")
    public int supportedOutputGridSizes() { return nsupportedOutputGridSizes(address()); }
    /** @return the value of the {@code supportedHintGridSizes} field. */
    @NativeType("VkDataGraphOpticalFlowGridSizeFlagsARM")
    public int supportedHintGridSizes() { return nsupportedHintGridSizes(address()); }
    /** @return the value of the {@code hintSupported} field. */
    @NativeType("VkBool32")
    public boolean hintSupported() { return nhintSupported(address()) != 0; }
    /** @return the value of the {@code costSupported} field. */
    @NativeType("VkBool32")
    public boolean costSupported() { return ncostSupported(address()) != 0; }
    /** @return the value of the {@code minWidth} field. */
    @NativeType("uint32_t")
    public int minWidth() { return nminWidth(address()); }
    /** @return the value of the {@code minHeight} field. */
    @NativeType("uint32_t")
    public int minHeight() { return nminHeight(address()); }
    /** @return the value of the {@code maxWidth} field. */
    @NativeType("uint32_t")
    public int maxWidth() { return nmaxWidth(address()); }
    /** @return the value of the {@code maxHeight} field. */
    @NativeType("uint32_t")
    public int maxHeight() { return nmaxHeight(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkQueueFamilyDataGraphOpticalFlowPropertiesARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMDataGraphOpticalFlow#VK_STRUCTURE_TYPE_QUEUE_FAMILY_DATA_GRAPH_OPTICAL_FLOW_PROPERTIES_ARM STRUCTURE_TYPE_QUEUE_FAMILY_DATA_GRAPH_OPTICAL_FLOW_PROPERTIES_ARM} value to the {@code sType} field. */
    public VkQueueFamilyDataGraphOpticalFlowPropertiesARM sType$Default() { return sType(ARMDataGraphOpticalFlow.VK_STRUCTURE_TYPE_QUEUE_FAMILY_DATA_GRAPH_OPTICAL_FLOW_PROPERTIES_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkQueueFamilyDataGraphOpticalFlowPropertiesARM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkQueueFamilyDataGraphOpticalFlowPropertiesARM set(
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
    public VkQueueFamilyDataGraphOpticalFlowPropertiesARM set(VkQueueFamilyDataGraphOpticalFlowPropertiesARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkQueueFamilyDataGraphOpticalFlowPropertiesARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkQueueFamilyDataGraphOpticalFlowPropertiesARM malloc() {
        return new VkQueueFamilyDataGraphOpticalFlowPropertiesARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkQueueFamilyDataGraphOpticalFlowPropertiesARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkQueueFamilyDataGraphOpticalFlowPropertiesARM calloc() {
        return new VkQueueFamilyDataGraphOpticalFlowPropertiesARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkQueueFamilyDataGraphOpticalFlowPropertiesARM} instance allocated with {@link BufferUtils}. */
    public static VkQueueFamilyDataGraphOpticalFlowPropertiesARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkQueueFamilyDataGraphOpticalFlowPropertiesARM(memAddress(container), container);
    }

    /** Returns a new {@code VkQueueFamilyDataGraphOpticalFlowPropertiesARM} instance for the specified memory address. */
    public static VkQueueFamilyDataGraphOpticalFlowPropertiesARM create(long address) {
        return new VkQueueFamilyDataGraphOpticalFlowPropertiesARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkQueueFamilyDataGraphOpticalFlowPropertiesARM createSafe(long address) {
        return address == NULL ? null : new VkQueueFamilyDataGraphOpticalFlowPropertiesARM(address, null);
    }

    /**
     * Returns a new {@link VkQueueFamilyDataGraphOpticalFlowPropertiesARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyDataGraphOpticalFlowPropertiesARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkQueueFamilyDataGraphOpticalFlowPropertiesARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyDataGraphOpticalFlowPropertiesARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkQueueFamilyDataGraphOpticalFlowPropertiesARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyDataGraphOpticalFlowPropertiesARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkQueueFamilyDataGraphOpticalFlowPropertiesARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyDataGraphOpticalFlowPropertiesARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkQueueFamilyDataGraphOpticalFlowPropertiesARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkQueueFamilyDataGraphOpticalFlowPropertiesARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkQueueFamilyDataGraphOpticalFlowPropertiesARM malloc(MemoryStack stack) {
        return new VkQueueFamilyDataGraphOpticalFlowPropertiesARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkQueueFamilyDataGraphOpticalFlowPropertiesARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkQueueFamilyDataGraphOpticalFlowPropertiesARM calloc(MemoryStack stack) {
        return new VkQueueFamilyDataGraphOpticalFlowPropertiesARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkQueueFamilyDataGraphOpticalFlowPropertiesARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyDataGraphOpticalFlowPropertiesARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkQueueFamilyDataGraphOpticalFlowPropertiesARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyDataGraphOpticalFlowPropertiesARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkQueueFamilyDataGraphOpticalFlowPropertiesARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkQueueFamilyDataGraphOpticalFlowPropertiesARM.PNEXT); }
    /** Unsafe version of {@link #supportedOutputGridSizes}. */
    public static int nsupportedOutputGridSizes(long struct) { return memGetInt(struct + VkQueueFamilyDataGraphOpticalFlowPropertiesARM.SUPPORTEDOUTPUTGRIDSIZES); }
    /** Unsafe version of {@link #supportedHintGridSizes}. */
    public static int nsupportedHintGridSizes(long struct) { return memGetInt(struct + VkQueueFamilyDataGraphOpticalFlowPropertiesARM.SUPPORTEDHINTGRIDSIZES); }
    /** Unsafe version of {@link #hintSupported}. */
    public static int nhintSupported(long struct) { return memGetInt(struct + VkQueueFamilyDataGraphOpticalFlowPropertiesARM.HINTSUPPORTED); }
    /** Unsafe version of {@link #costSupported}. */
    public static int ncostSupported(long struct) { return memGetInt(struct + VkQueueFamilyDataGraphOpticalFlowPropertiesARM.COSTSUPPORTED); }
    /** Unsafe version of {@link #minWidth}. */
    public static int nminWidth(long struct) { return memGetInt(struct + VkQueueFamilyDataGraphOpticalFlowPropertiesARM.MINWIDTH); }
    /** Unsafe version of {@link #minHeight}. */
    public static int nminHeight(long struct) { return memGetInt(struct + VkQueueFamilyDataGraphOpticalFlowPropertiesARM.MINHEIGHT); }
    /** Unsafe version of {@link #maxWidth}. */
    public static int nmaxWidth(long struct) { return memGetInt(struct + VkQueueFamilyDataGraphOpticalFlowPropertiesARM.MAXWIDTH); }
    /** Unsafe version of {@link #maxHeight}. */
    public static int nmaxHeight(long struct) { return memGetInt(struct + VkQueueFamilyDataGraphOpticalFlowPropertiesARM.MAXHEIGHT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkQueueFamilyDataGraphOpticalFlowPropertiesARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkQueueFamilyDataGraphOpticalFlowPropertiesARM.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkQueueFamilyDataGraphOpticalFlowPropertiesARM} structs. */
    public static class Buffer extends StructBuffer<VkQueueFamilyDataGraphOpticalFlowPropertiesARM, Buffer> implements NativeResource {

        private static final VkQueueFamilyDataGraphOpticalFlowPropertiesARM ELEMENT_FACTORY = VkQueueFamilyDataGraphOpticalFlowPropertiesARM.create(-1L);

        /**
         * Creates a new {@code VkQueueFamilyDataGraphOpticalFlowPropertiesARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkQueueFamilyDataGraphOpticalFlowPropertiesARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkQueueFamilyDataGraphOpticalFlowPropertiesARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkQueueFamilyDataGraphOpticalFlowPropertiesARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkQueueFamilyDataGraphOpticalFlowPropertiesARM.npNext(address()); }
        /** @return the value of the {@code supportedOutputGridSizes} field. */
        @NativeType("VkDataGraphOpticalFlowGridSizeFlagsARM")
        public int supportedOutputGridSizes() { return VkQueueFamilyDataGraphOpticalFlowPropertiesARM.nsupportedOutputGridSizes(address()); }
        /** @return the value of the {@code supportedHintGridSizes} field. */
        @NativeType("VkDataGraphOpticalFlowGridSizeFlagsARM")
        public int supportedHintGridSizes() { return VkQueueFamilyDataGraphOpticalFlowPropertiesARM.nsupportedHintGridSizes(address()); }
        /** @return the value of the {@code hintSupported} field. */
        @NativeType("VkBool32")
        public boolean hintSupported() { return VkQueueFamilyDataGraphOpticalFlowPropertiesARM.nhintSupported(address()) != 0; }
        /** @return the value of the {@code costSupported} field. */
        @NativeType("VkBool32")
        public boolean costSupported() { return VkQueueFamilyDataGraphOpticalFlowPropertiesARM.ncostSupported(address()) != 0; }
        /** @return the value of the {@code minWidth} field. */
        @NativeType("uint32_t")
        public int minWidth() { return VkQueueFamilyDataGraphOpticalFlowPropertiesARM.nminWidth(address()); }
        /** @return the value of the {@code minHeight} field. */
        @NativeType("uint32_t")
        public int minHeight() { return VkQueueFamilyDataGraphOpticalFlowPropertiesARM.nminHeight(address()); }
        /** @return the value of the {@code maxWidth} field. */
        @NativeType("uint32_t")
        public int maxWidth() { return VkQueueFamilyDataGraphOpticalFlowPropertiesARM.nmaxWidth(address()); }
        /** @return the value of the {@code maxHeight} field. */
        @NativeType("uint32_t")
        public int maxHeight() { return VkQueueFamilyDataGraphOpticalFlowPropertiesARM.nmaxHeight(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkQueueFamilyDataGraphOpticalFlowPropertiesARM.Buffer sType(@NativeType("VkStructureType") int value) { VkQueueFamilyDataGraphOpticalFlowPropertiesARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMDataGraphOpticalFlow#VK_STRUCTURE_TYPE_QUEUE_FAMILY_DATA_GRAPH_OPTICAL_FLOW_PROPERTIES_ARM STRUCTURE_TYPE_QUEUE_FAMILY_DATA_GRAPH_OPTICAL_FLOW_PROPERTIES_ARM} value to the {@code sType} field. */
        public VkQueueFamilyDataGraphOpticalFlowPropertiesARM.Buffer sType$Default() { return sType(ARMDataGraphOpticalFlow.VK_STRUCTURE_TYPE_QUEUE_FAMILY_DATA_GRAPH_OPTICAL_FLOW_PROPERTIES_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkQueueFamilyDataGraphOpticalFlowPropertiesARM.Buffer pNext(@NativeType("void *") long value) { VkQueueFamilyDataGraphOpticalFlowPropertiesARM.npNext(address(), value); return this; }

    }

}