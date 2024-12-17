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
 * struct VkPhysicalDeviceTransformFeedbackPropertiesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t maxTransformFeedbackStreams;
 *     uint32_t maxTransformFeedbackBuffers;
 *     VkDeviceSize maxTransformFeedbackBufferSize;
 *     uint32_t maxTransformFeedbackStreamDataSize;
 *     uint32_t maxTransformFeedbackBufferDataSize;
 *     uint32_t maxTransformFeedbackBufferDataStride;
 *     VkBool32 transformFeedbackQueries;
 *     VkBool32 transformFeedbackStreamsLinesTriangles;
 *     VkBool32 transformFeedbackRasterizationStreamSelect;
 *     VkBool32 transformFeedbackDraw;
 * }}</pre>
 */
public class VkPhysicalDeviceTransformFeedbackPropertiesEXT extends Struct<VkPhysicalDeviceTransformFeedbackPropertiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXTRANSFORMFEEDBACKSTREAMS,
        MAXTRANSFORMFEEDBACKBUFFERS,
        MAXTRANSFORMFEEDBACKBUFFERSIZE,
        MAXTRANSFORMFEEDBACKSTREAMDATASIZE,
        MAXTRANSFORMFEEDBACKBUFFERDATASIZE,
        MAXTRANSFORMFEEDBACKBUFFERDATASTRIDE,
        TRANSFORMFEEDBACKQUERIES,
        TRANSFORMFEEDBACKSTREAMSLINESTRIANGLES,
        TRANSFORMFEEDBACKRASTERIZATIONSTREAMSELECT,
        TRANSFORMFEEDBACKDRAW;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(8),
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
        MAXTRANSFORMFEEDBACKSTREAMS = layout.offsetof(2);
        MAXTRANSFORMFEEDBACKBUFFERS = layout.offsetof(3);
        MAXTRANSFORMFEEDBACKBUFFERSIZE = layout.offsetof(4);
        MAXTRANSFORMFEEDBACKSTREAMDATASIZE = layout.offsetof(5);
        MAXTRANSFORMFEEDBACKBUFFERDATASIZE = layout.offsetof(6);
        MAXTRANSFORMFEEDBACKBUFFERDATASTRIDE = layout.offsetof(7);
        TRANSFORMFEEDBACKQUERIES = layout.offsetof(8);
        TRANSFORMFEEDBACKSTREAMSLINESTRIANGLES = layout.offsetof(9);
        TRANSFORMFEEDBACKRASTERIZATIONSTREAMSELECT = layout.offsetof(10);
        TRANSFORMFEEDBACKDRAW = layout.offsetof(11);
    }

    protected VkPhysicalDeviceTransformFeedbackPropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceTransformFeedbackPropertiesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceTransformFeedbackPropertiesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceTransformFeedbackPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code maxTransformFeedbackStreams} field. */
    @NativeType("uint32_t")
    public int maxTransformFeedbackStreams() { return nmaxTransformFeedbackStreams(address()); }
    /** @return the value of the {@code maxTransformFeedbackBuffers} field. */
    @NativeType("uint32_t")
    public int maxTransformFeedbackBuffers() { return nmaxTransformFeedbackBuffers(address()); }
    /** @return the value of the {@code maxTransformFeedbackBufferSize} field. */
    @NativeType("VkDeviceSize")
    public long maxTransformFeedbackBufferSize() { return nmaxTransformFeedbackBufferSize(address()); }
    /** @return the value of the {@code maxTransformFeedbackStreamDataSize} field. */
    @NativeType("uint32_t")
    public int maxTransformFeedbackStreamDataSize() { return nmaxTransformFeedbackStreamDataSize(address()); }
    /** @return the value of the {@code maxTransformFeedbackBufferDataSize} field. */
    @NativeType("uint32_t")
    public int maxTransformFeedbackBufferDataSize() { return nmaxTransformFeedbackBufferDataSize(address()); }
    /** @return the value of the {@code maxTransformFeedbackBufferDataStride} field. */
    @NativeType("uint32_t")
    public int maxTransformFeedbackBufferDataStride() { return nmaxTransformFeedbackBufferDataStride(address()); }
    /** @return the value of the {@code transformFeedbackQueries} field. */
    @NativeType("VkBool32")
    public boolean transformFeedbackQueries() { return ntransformFeedbackQueries(address()) != 0; }
    /** @return the value of the {@code transformFeedbackStreamsLinesTriangles} field. */
    @NativeType("VkBool32")
    public boolean transformFeedbackStreamsLinesTriangles() { return ntransformFeedbackStreamsLinesTriangles(address()) != 0; }
    /** @return the value of the {@code transformFeedbackRasterizationStreamSelect} field. */
    @NativeType("VkBool32")
    public boolean transformFeedbackRasterizationStreamSelect() { return ntransformFeedbackRasterizationStreamSelect(address()) != 0; }
    /** @return the value of the {@code transformFeedbackDraw} field. */
    @NativeType("VkBool32")
    public boolean transformFeedbackDraw() { return ntransformFeedbackDraw(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTTransformFeedback#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_PROPERTIES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT sType$Default() { return sType(EXTTransformFeedback.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_PROPERTIES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT set(
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
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT set(VkPhysicalDeviceTransformFeedbackPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceTransformFeedbackPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT malloc() {
        return new VkPhysicalDeviceTransformFeedbackPropertiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceTransformFeedbackPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT calloc() {
        return new VkPhysicalDeviceTransformFeedbackPropertiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceTransformFeedbackPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceTransformFeedbackPropertiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceTransformFeedbackPropertiesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT create(long address) {
        return new VkPhysicalDeviceTransformFeedbackPropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceTransformFeedbackPropertiesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceTransformFeedbackPropertiesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceTransformFeedbackPropertiesEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceTransformFeedbackPropertiesEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceTransformFeedbackPropertiesEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceTransformFeedbackPropertiesEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceTransformFeedbackPropertiesEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceTransformFeedbackPropertiesEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceTransformFeedbackPropertiesEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceTransformFeedbackPropertiesEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceTransformFeedbackPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceTransformFeedbackPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceTransformFeedbackPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceTransformFeedbackPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceTransformFeedbackPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceTransformFeedbackPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #maxTransformFeedbackStreams}. */
    public static int nmaxTransformFeedbackStreams(long struct) { return memGetInt(struct + VkPhysicalDeviceTransformFeedbackPropertiesEXT.MAXTRANSFORMFEEDBACKSTREAMS); }
    /** Unsafe version of {@link #maxTransformFeedbackBuffers}. */
    public static int nmaxTransformFeedbackBuffers(long struct) { return memGetInt(struct + VkPhysicalDeviceTransformFeedbackPropertiesEXT.MAXTRANSFORMFEEDBACKBUFFERS); }
    /** Unsafe version of {@link #maxTransformFeedbackBufferSize}. */
    public static long nmaxTransformFeedbackBufferSize(long struct) { return memGetLong(struct + VkPhysicalDeviceTransformFeedbackPropertiesEXT.MAXTRANSFORMFEEDBACKBUFFERSIZE); }
    /** Unsafe version of {@link #maxTransformFeedbackStreamDataSize}. */
    public static int nmaxTransformFeedbackStreamDataSize(long struct) { return memGetInt(struct + VkPhysicalDeviceTransformFeedbackPropertiesEXT.MAXTRANSFORMFEEDBACKSTREAMDATASIZE); }
    /** Unsafe version of {@link #maxTransformFeedbackBufferDataSize}. */
    public static int nmaxTransformFeedbackBufferDataSize(long struct) { return memGetInt(struct + VkPhysicalDeviceTransformFeedbackPropertiesEXT.MAXTRANSFORMFEEDBACKBUFFERDATASIZE); }
    /** Unsafe version of {@link #maxTransformFeedbackBufferDataStride}. */
    public static int nmaxTransformFeedbackBufferDataStride(long struct) { return memGetInt(struct + VkPhysicalDeviceTransformFeedbackPropertiesEXT.MAXTRANSFORMFEEDBACKBUFFERDATASTRIDE); }
    /** Unsafe version of {@link #transformFeedbackQueries}. */
    public static int ntransformFeedbackQueries(long struct) { return memGetInt(struct + VkPhysicalDeviceTransformFeedbackPropertiesEXT.TRANSFORMFEEDBACKQUERIES); }
    /** Unsafe version of {@link #transformFeedbackStreamsLinesTriangles}. */
    public static int ntransformFeedbackStreamsLinesTriangles(long struct) { return memGetInt(struct + VkPhysicalDeviceTransformFeedbackPropertiesEXT.TRANSFORMFEEDBACKSTREAMSLINESTRIANGLES); }
    /** Unsafe version of {@link #transformFeedbackRasterizationStreamSelect}. */
    public static int ntransformFeedbackRasterizationStreamSelect(long struct) { return memGetInt(struct + VkPhysicalDeviceTransformFeedbackPropertiesEXT.TRANSFORMFEEDBACKRASTERIZATIONSTREAMSELECT); }
    /** Unsafe version of {@link #transformFeedbackDraw}. */
    public static int ntransformFeedbackDraw(long struct) { return memGetInt(struct + VkPhysicalDeviceTransformFeedbackPropertiesEXT.TRANSFORMFEEDBACKDRAW); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceTransformFeedbackPropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceTransformFeedbackPropertiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceTransformFeedbackPropertiesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceTransformFeedbackPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceTransformFeedbackPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceTransformFeedbackPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceTransformFeedbackPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.npNext(address()); }
        /** @return the value of the {@code maxTransformFeedbackStreams} field. */
        @NativeType("uint32_t")
        public int maxTransformFeedbackStreams() { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.nmaxTransformFeedbackStreams(address()); }
        /** @return the value of the {@code maxTransformFeedbackBuffers} field. */
        @NativeType("uint32_t")
        public int maxTransformFeedbackBuffers() { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.nmaxTransformFeedbackBuffers(address()); }
        /** @return the value of the {@code maxTransformFeedbackBufferSize} field. */
        @NativeType("VkDeviceSize")
        public long maxTransformFeedbackBufferSize() { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.nmaxTransformFeedbackBufferSize(address()); }
        /** @return the value of the {@code maxTransformFeedbackStreamDataSize} field. */
        @NativeType("uint32_t")
        public int maxTransformFeedbackStreamDataSize() { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.nmaxTransformFeedbackStreamDataSize(address()); }
        /** @return the value of the {@code maxTransformFeedbackBufferDataSize} field. */
        @NativeType("uint32_t")
        public int maxTransformFeedbackBufferDataSize() { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.nmaxTransformFeedbackBufferDataSize(address()); }
        /** @return the value of the {@code maxTransformFeedbackBufferDataStride} field. */
        @NativeType("uint32_t")
        public int maxTransformFeedbackBufferDataStride() { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.nmaxTransformFeedbackBufferDataStride(address()); }
        /** @return the value of the {@code transformFeedbackQueries} field. */
        @NativeType("VkBool32")
        public boolean transformFeedbackQueries() { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.ntransformFeedbackQueries(address()) != 0; }
        /** @return the value of the {@code transformFeedbackStreamsLinesTriangles} field. */
        @NativeType("VkBool32")
        public boolean transformFeedbackStreamsLinesTriangles() { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.ntransformFeedbackStreamsLinesTriangles(address()) != 0; }
        /** @return the value of the {@code transformFeedbackRasterizationStreamSelect} field. */
        @NativeType("VkBool32")
        public boolean transformFeedbackRasterizationStreamSelect() { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.ntransformFeedbackRasterizationStreamSelect(address()) != 0; }
        /** @return the value of the {@code transformFeedbackDraw} field. */
        @NativeType("VkBool32")
        public boolean transformFeedbackDraw() { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.ntransformFeedbackDraw(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceTransformFeedbackPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceTransformFeedbackPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTTransformFeedback#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_PROPERTIES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceTransformFeedbackPropertiesEXT.Buffer sType$Default() { return sType(EXTTransformFeedback.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_PROPERTIES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceTransformFeedbackPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceTransformFeedbackPropertiesEXT.npNext(address(), value); return this; }

    }

}