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
 * struct VkDataGraphPipelineOpticalFlowCreateInfoARM {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t width;
 *     uint32_t height;
 *     VkFormat imageFormat;
 *     VkFormat flowVectorFormat;
 *     VkFormat costFormat;
 *     VkDataGraphOpticalFlowGridSizeFlagsARM outputGridSize;
 *     VkDataGraphOpticalFlowGridSizeFlagsARM hintGridSize;
 *     VkDataGraphOpticalFlowPerformanceLevelARM performanceLevel;
 *     VkDataGraphOpticalFlowCreateFlagsARM flags;
 * }}</pre>
 */
public class VkDataGraphPipelineOpticalFlowCreateInfoARM extends Struct<VkDataGraphPipelineOpticalFlowCreateInfoARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        WIDTH,
        HEIGHT,
        IMAGEFORMAT,
        FLOWVECTORFORMAT,
        COSTFORMAT,
        OUTPUTGRIDSIZE,
        HINTGRIDSIZE,
        PERFORMANCELEVEL,
        FLAGS;

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
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        WIDTH = layout.offsetof(2);
        HEIGHT = layout.offsetof(3);
        IMAGEFORMAT = layout.offsetof(4);
        FLOWVECTORFORMAT = layout.offsetof(5);
        COSTFORMAT = layout.offsetof(6);
        OUTPUTGRIDSIZE = layout.offsetof(7);
        HINTGRIDSIZE = layout.offsetof(8);
        PERFORMANCELEVEL = layout.offsetof(9);
        FLAGS = layout.offsetof(10);
    }

    protected VkDataGraphPipelineOpticalFlowCreateInfoARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDataGraphPipelineOpticalFlowCreateInfoARM create(long address, @Nullable ByteBuffer container) {
        return new VkDataGraphPipelineOpticalFlowCreateInfoARM(address, container);
    }

    /**
     * Creates a {@code VkDataGraphPipelineOpticalFlowCreateInfoARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDataGraphPipelineOpticalFlowCreateInfoARM(ByteBuffer container) {
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
    /** @return the value of the {@code width} field. */
    @NativeType("uint32_t")
    public int width() { return nwidth(address()); }
    /** @return the value of the {@code height} field. */
    @NativeType("uint32_t")
    public int height() { return nheight(address()); }
    /** @return the value of the {@code imageFormat} field. */
    @NativeType("VkFormat")
    public int imageFormat() { return nimageFormat(address()); }
    /** @return the value of the {@code flowVectorFormat} field. */
    @NativeType("VkFormat")
    public int flowVectorFormat() { return nflowVectorFormat(address()); }
    /** @return the value of the {@code costFormat} field. */
    @NativeType("VkFormat")
    public int costFormat() { return ncostFormat(address()); }
    /** @return the value of the {@code outputGridSize} field. */
    @NativeType("VkDataGraphOpticalFlowGridSizeFlagsARM")
    public int outputGridSize() { return noutputGridSize(address()); }
    /** @return the value of the {@code hintGridSize} field. */
    @NativeType("VkDataGraphOpticalFlowGridSizeFlagsARM")
    public int hintGridSize() { return nhintGridSize(address()); }
    /** @return the value of the {@code performanceLevel} field. */
    @NativeType("VkDataGraphOpticalFlowPerformanceLevelARM")
    public int performanceLevel() { return nperformanceLevel(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("VkDataGraphOpticalFlowCreateFlagsARM")
    public int flags() { return nflags(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDataGraphPipelineOpticalFlowCreateInfoARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMDataGraphOpticalFlow#VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_OPTICAL_FLOW_CREATE_INFO_ARM STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_OPTICAL_FLOW_CREATE_INFO_ARM} value to the {@code sType} field. */
    public VkDataGraphPipelineOpticalFlowCreateInfoARM sType$Default() { return sType(ARMDataGraphOpticalFlow.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_OPTICAL_FLOW_CREATE_INFO_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDataGraphPipelineOpticalFlowCreateInfoARM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code width} field. */
    public VkDataGraphPipelineOpticalFlowCreateInfoARM width(@NativeType("uint32_t") int value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@code height} field. */
    public VkDataGraphPipelineOpticalFlowCreateInfoARM height(@NativeType("uint32_t") int value) { nheight(address(), value); return this; }
    /** Sets the specified value to the {@code imageFormat} field. */
    public VkDataGraphPipelineOpticalFlowCreateInfoARM imageFormat(@NativeType("VkFormat") int value) { nimageFormat(address(), value); return this; }
    /** Sets the specified value to the {@code flowVectorFormat} field. */
    public VkDataGraphPipelineOpticalFlowCreateInfoARM flowVectorFormat(@NativeType("VkFormat") int value) { nflowVectorFormat(address(), value); return this; }
    /** Sets the specified value to the {@code costFormat} field. */
    public VkDataGraphPipelineOpticalFlowCreateInfoARM costFormat(@NativeType("VkFormat") int value) { ncostFormat(address(), value); return this; }
    /** Sets the specified value to the {@code outputGridSize} field. */
    public VkDataGraphPipelineOpticalFlowCreateInfoARM outputGridSize(@NativeType("VkDataGraphOpticalFlowGridSizeFlagsARM") int value) { noutputGridSize(address(), value); return this; }
    /** Sets the specified value to the {@code hintGridSize} field. */
    public VkDataGraphPipelineOpticalFlowCreateInfoARM hintGridSize(@NativeType("VkDataGraphOpticalFlowGridSizeFlagsARM") int value) { nhintGridSize(address(), value); return this; }
    /** Sets the specified value to the {@code performanceLevel} field. */
    public VkDataGraphPipelineOpticalFlowCreateInfoARM performanceLevel(@NativeType("VkDataGraphOpticalFlowPerformanceLevelARM") int value) { nperformanceLevel(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkDataGraphPipelineOpticalFlowCreateInfoARM flags(@NativeType("VkDataGraphOpticalFlowCreateFlagsARM") int value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDataGraphPipelineOpticalFlowCreateInfoARM set(
        int sType,
        long pNext,
        int width,
        int height,
        int imageFormat,
        int flowVectorFormat,
        int costFormat,
        int outputGridSize,
        int hintGridSize,
        int performanceLevel,
        int flags
    ) {
        sType(sType);
        pNext(pNext);
        width(width);
        height(height);
        imageFormat(imageFormat);
        flowVectorFormat(flowVectorFormat);
        costFormat(costFormat);
        outputGridSize(outputGridSize);
        hintGridSize(hintGridSize);
        performanceLevel(performanceLevel);
        flags(flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDataGraphPipelineOpticalFlowCreateInfoARM set(VkDataGraphPipelineOpticalFlowCreateInfoARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDataGraphPipelineOpticalFlowCreateInfoARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDataGraphPipelineOpticalFlowCreateInfoARM malloc() {
        return new VkDataGraphPipelineOpticalFlowCreateInfoARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDataGraphPipelineOpticalFlowCreateInfoARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDataGraphPipelineOpticalFlowCreateInfoARM calloc() {
        return new VkDataGraphPipelineOpticalFlowCreateInfoARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDataGraphPipelineOpticalFlowCreateInfoARM} instance allocated with {@link BufferUtils}. */
    public static VkDataGraphPipelineOpticalFlowCreateInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDataGraphPipelineOpticalFlowCreateInfoARM(memAddress(container), container);
    }

    /** Returns a new {@code VkDataGraphPipelineOpticalFlowCreateInfoARM} instance for the specified memory address. */
    public static VkDataGraphPipelineOpticalFlowCreateInfoARM create(long address) {
        return new VkDataGraphPipelineOpticalFlowCreateInfoARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDataGraphPipelineOpticalFlowCreateInfoARM createSafe(long address) {
        return address == NULL ? null : new VkDataGraphPipelineOpticalFlowCreateInfoARM(address, null);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineOpticalFlowCreateInfoARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineOpticalFlowCreateInfoARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineOpticalFlowCreateInfoARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineOpticalFlowCreateInfoARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineOpticalFlowCreateInfoARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineOpticalFlowCreateInfoARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDataGraphPipelineOpticalFlowCreateInfoARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineOpticalFlowCreateInfoARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDataGraphPipelineOpticalFlowCreateInfoARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDataGraphPipelineOpticalFlowCreateInfoARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDataGraphPipelineOpticalFlowCreateInfoARM malloc(MemoryStack stack) {
        return new VkDataGraphPipelineOpticalFlowCreateInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDataGraphPipelineOpticalFlowCreateInfoARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDataGraphPipelineOpticalFlowCreateInfoARM calloc(MemoryStack stack) {
        return new VkDataGraphPipelineOpticalFlowCreateInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineOpticalFlowCreateInfoARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineOpticalFlowCreateInfoARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineOpticalFlowCreateInfoARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineOpticalFlowCreateInfoARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDataGraphPipelineOpticalFlowCreateInfoARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDataGraphPipelineOpticalFlowCreateInfoARM.PNEXT); }
    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return memGetInt(struct + VkDataGraphPipelineOpticalFlowCreateInfoARM.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return memGetInt(struct + VkDataGraphPipelineOpticalFlowCreateInfoARM.HEIGHT); }
    /** Unsafe version of {@link #imageFormat}. */
    public static int nimageFormat(long struct) { return memGetInt(struct + VkDataGraphPipelineOpticalFlowCreateInfoARM.IMAGEFORMAT); }
    /** Unsafe version of {@link #flowVectorFormat}. */
    public static int nflowVectorFormat(long struct) { return memGetInt(struct + VkDataGraphPipelineOpticalFlowCreateInfoARM.FLOWVECTORFORMAT); }
    /** Unsafe version of {@link #costFormat}. */
    public static int ncostFormat(long struct) { return memGetInt(struct + VkDataGraphPipelineOpticalFlowCreateInfoARM.COSTFORMAT); }
    /** Unsafe version of {@link #outputGridSize}. */
    public static int noutputGridSize(long struct) { return memGetInt(struct + VkDataGraphPipelineOpticalFlowCreateInfoARM.OUTPUTGRIDSIZE); }
    /** Unsafe version of {@link #hintGridSize}. */
    public static int nhintGridSize(long struct) { return memGetInt(struct + VkDataGraphPipelineOpticalFlowCreateInfoARM.HINTGRIDSIZE); }
    /** Unsafe version of {@link #performanceLevel}. */
    public static int nperformanceLevel(long struct) { return memGetInt(struct + VkDataGraphPipelineOpticalFlowCreateInfoARM.PERFORMANCELEVEL); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkDataGraphPipelineOpticalFlowCreateInfoARM.FLAGS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDataGraphPipelineOpticalFlowCreateInfoARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDataGraphPipelineOpticalFlowCreateInfoARM.PNEXT, value); }
    /** Unsafe version of {@link #width(int) width}. */
    public static void nwidth(long struct, int value) { memPutInt(struct + VkDataGraphPipelineOpticalFlowCreateInfoARM.WIDTH, value); }
    /** Unsafe version of {@link #height(int) height}. */
    public static void nheight(long struct, int value) { memPutInt(struct + VkDataGraphPipelineOpticalFlowCreateInfoARM.HEIGHT, value); }
    /** Unsafe version of {@link #imageFormat(int) imageFormat}. */
    public static void nimageFormat(long struct, int value) { memPutInt(struct + VkDataGraphPipelineOpticalFlowCreateInfoARM.IMAGEFORMAT, value); }
    /** Unsafe version of {@link #flowVectorFormat(int) flowVectorFormat}. */
    public static void nflowVectorFormat(long struct, int value) { memPutInt(struct + VkDataGraphPipelineOpticalFlowCreateInfoARM.FLOWVECTORFORMAT, value); }
    /** Unsafe version of {@link #costFormat(int) costFormat}. */
    public static void ncostFormat(long struct, int value) { memPutInt(struct + VkDataGraphPipelineOpticalFlowCreateInfoARM.COSTFORMAT, value); }
    /** Unsafe version of {@link #outputGridSize(int) outputGridSize}. */
    public static void noutputGridSize(long struct, int value) { memPutInt(struct + VkDataGraphPipelineOpticalFlowCreateInfoARM.OUTPUTGRIDSIZE, value); }
    /** Unsafe version of {@link #hintGridSize(int) hintGridSize}. */
    public static void nhintGridSize(long struct, int value) { memPutInt(struct + VkDataGraphPipelineOpticalFlowCreateInfoARM.HINTGRIDSIZE, value); }
    /** Unsafe version of {@link #performanceLevel(int) performanceLevel}. */
    public static void nperformanceLevel(long struct, int value) { memPutInt(struct + VkDataGraphPipelineOpticalFlowCreateInfoARM.PERFORMANCELEVEL, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkDataGraphPipelineOpticalFlowCreateInfoARM.FLAGS, value); }

    // -----------------------------------

    /** An array of {@link VkDataGraphPipelineOpticalFlowCreateInfoARM} structs. */
    public static class Buffer extends StructBuffer<VkDataGraphPipelineOpticalFlowCreateInfoARM, Buffer> implements NativeResource {

        private static final VkDataGraphPipelineOpticalFlowCreateInfoARM ELEMENT_FACTORY = VkDataGraphPipelineOpticalFlowCreateInfoARM.create(-1L);

        /**
         * Creates a new {@code VkDataGraphPipelineOpticalFlowCreateInfoARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDataGraphPipelineOpticalFlowCreateInfoARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDataGraphPipelineOpticalFlowCreateInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDataGraphPipelineOpticalFlowCreateInfoARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkDataGraphPipelineOpticalFlowCreateInfoARM.npNext(address()); }
        /** @return the value of the {@code width} field. */
        @NativeType("uint32_t")
        public int width() { return VkDataGraphPipelineOpticalFlowCreateInfoARM.nwidth(address()); }
        /** @return the value of the {@code height} field. */
        @NativeType("uint32_t")
        public int height() { return VkDataGraphPipelineOpticalFlowCreateInfoARM.nheight(address()); }
        /** @return the value of the {@code imageFormat} field. */
        @NativeType("VkFormat")
        public int imageFormat() { return VkDataGraphPipelineOpticalFlowCreateInfoARM.nimageFormat(address()); }
        /** @return the value of the {@code flowVectorFormat} field. */
        @NativeType("VkFormat")
        public int flowVectorFormat() { return VkDataGraphPipelineOpticalFlowCreateInfoARM.nflowVectorFormat(address()); }
        /** @return the value of the {@code costFormat} field. */
        @NativeType("VkFormat")
        public int costFormat() { return VkDataGraphPipelineOpticalFlowCreateInfoARM.ncostFormat(address()); }
        /** @return the value of the {@code outputGridSize} field. */
        @NativeType("VkDataGraphOpticalFlowGridSizeFlagsARM")
        public int outputGridSize() { return VkDataGraphPipelineOpticalFlowCreateInfoARM.noutputGridSize(address()); }
        /** @return the value of the {@code hintGridSize} field. */
        @NativeType("VkDataGraphOpticalFlowGridSizeFlagsARM")
        public int hintGridSize() { return VkDataGraphPipelineOpticalFlowCreateInfoARM.nhintGridSize(address()); }
        /** @return the value of the {@code performanceLevel} field. */
        @NativeType("VkDataGraphOpticalFlowPerformanceLevelARM")
        public int performanceLevel() { return VkDataGraphPipelineOpticalFlowCreateInfoARM.nperformanceLevel(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkDataGraphOpticalFlowCreateFlagsARM")
        public int flags() { return VkDataGraphPipelineOpticalFlowCreateInfoARM.nflags(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDataGraphPipelineOpticalFlowCreateInfoARM.Buffer sType(@NativeType("VkStructureType") int value) { VkDataGraphPipelineOpticalFlowCreateInfoARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMDataGraphOpticalFlow#VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_OPTICAL_FLOW_CREATE_INFO_ARM STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_OPTICAL_FLOW_CREATE_INFO_ARM} value to the {@code sType} field. */
        public VkDataGraphPipelineOpticalFlowCreateInfoARM.Buffer sType$Default() { return sType(ARMDataGraphOpticalFlow.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_OPTICAL_FLOW_CREATE_INFO_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDataGraphPipelineOpticalFlowCreateInfoARM.Buffer pNext(@NativeType("void *") long value) { VkDataGraphPipelineOpticalFlowCreateInfoARM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code width} field. */
        public VkDataGraphPipelineOpticalFlowCreateInfoARM.Buffer width(@NativeType("uint32_t") int value) { VkDataGraphPipelineOpticalFlowCreateInfoARM.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@code height} field. */
        public VkDataGraphPipelineOpticalFlowCreateInfoARM.Buffer height(@NativeType("uint32_t") int value) { VkDataGraphPipelineOpticalFlowCreateInfoARM.nheight(address(), value); return this; }
        /** Sets the specified value to the {@code imageFormat} field. */
        public VkDataGraphPipelineOpticalFlowCreateInfoARM.Buffer imageFormat(@NativeType("VkFormat") int value) { VkDataGraphPipelineOpticalFlowCreateInfoARM.nimageFormat(address(), value); return this; }
        /** Sets the specified value to the {@code flowVectorFormat} field. */
        public VkDataGraphPipelineOpticalFlowCreateInfoARM.Buffer flowVectorFormat(@NativeType("VkFormat") int value) { VkDataGraphPipelineOpticalFlowCreateInfoARM.nflowVectorFormat(address(), value); return this; }
        /** Sets the specified value to the {@code costFormat} field. */
        public VkDataGraphPipelineOpticalFlowCreateInfoARM.Buffer costFormat(@NativeType("VkFormat") int value) { VkDataGraphPipelineOpticalFlowCreateInfoARM.ncostFormat(address(), value); return this; }
        /** Sets the specified value to the {@code outputGridSize} field. */
        public VkDataGraphPipelineOpticalFlowCreateInfoARM.Buffer outputGridSize(@NativeType("VkDataGraphOpticalFlowGridSizeFlagsARM") int value) { VkDataGraphPipelineOpticalFlowCreateInfoARM.noutputGridSize(address(), value); return this; }
        /** Sets the specified value to the {@code hintGridSize} field. */
        public VkDataGraphPipelineOpticalFlowCreateInfoARM.Buffer hintGridSize(@NativeType("VkDataGraphOpticalFlowGridSizeFlagsARM") int value) { VkDataGraphPipelineOpticalFlowCreateInfoARM.nhintGridSize(address(), value); return this; }
        /** Sets the specified value to the {@code performanceLevel} field. */
        public VkDataGraphPipelineOpticalFlowCreateInfoARM.Buffer performanceLevel(@NativeType("VkDataGraphOpticalFlowPerformanceLevelARM") int value) { VkDataGraphPipelineOpticalFlowCreateInfoARM.nperformanceLevel(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkDataGraphPipelineOpticalFlowCreateInfoARM.Buffer flags(@NativeType("VkDataGraphOpticalFlowCreateFlagsARM") int value) { VkDataGraphPipelineOpticalFlowCreateInfoARM.nflags(address(), value); return this; }

    }

}