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
 * struct VkOpticalFlowSessionCreateInfoNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t width;
 *     uint32_t height;
 *     VkFormat imageFormat;
 *     VkFormat flowVectorFormat;
 *     VkFormat costFormat;
 *     VkOpticalFlowGridSizeFlagsNV outputGridSize;
 *     VkOpticalFlowGridSizeFlagsNV hintGridSize;
 *     VkOpticalFlowPerformanceLevelNV performanceLevel;
 *     VkOpticalFlowSessionCreateFlagsNV flags;
 * }}</pre>
 */
public class VkOpticalFlowSessionCreateInfoNV extends Struct<VkOpticalFlowSessionCreateInfoNV> implements NativeResource {

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

    protected VkOpticalFlowSessionCreateInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkOpticalFlowSessionCreateInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkOpticalFlowSessionCreateInfoNV(address, container);
    }

    /**
     * Creates a {@code VkOpticalFlowSessionCreateInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkOpticalFlowSessionCreateInfoNV(ByteBuffer container) {
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
    @NativeType("VkOpticalFlowGridSizeFlagsNV")
    public int outputGridSize() { return noutputGridSize(address()); }
    /** @return the value of the {@code hintGridSize} field. */
    @NativeType("VkOpticalFlowGridSizeFlagsNV")
    public int hintGridSize() { return nhintGridSize(address()); }
    /** @return the value of the {@code performanceLevel} field. */
    @NativeType("VkOpticalFlowPerformanceLevelNV")
    public int performanceLevel() { return nperformanceLevel(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("VkOpticalFlowSessionCreateFlagsNV")
    public int flags() { return nflags(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkOpticalFlowSessionCreateInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVOpticalFlow#VK_STRUCTURE_TYPE_OPTICAL_FLOW_SESSION_CREATE_INFO_NV STRUCTURE_TYPE_OPTICAL_FLOW_SESSION_CREATE_INFO_NV} value to the {@code sType} field. */
    public VkOpticalFlowSessionCreateInfoNV sType$Default() { return sType(NVOpticalFlow.VK_STRUCTURE_TYPE_OPTICAL_FLOW_SESSION_CREATE_INFO_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkOpticalFlowSessionCreateInfoNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkOpticalFlowSessionCreatePrivateDataInfoNV} value to the {@code pNext} chain. */
    public VkOpticalFlowSessionCreateInfoNV pNext(VkOpticalFlowSessionCreatePrivateDataInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code width} field. */
    public VkOpticalFlowSessionCreateInfoNV width(@NativeType("uint32_t") int value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@code height} field. */
    public VkOpticalFlowSessionCreateInfoNV height(@NativeType("uint32_t") int value) { nheight(address(), value); return this; }
    /** Sets the specified value to the {@code imageFormat} field. */
    public VkOpticalFlowSessionCreateInfoNV imageFormat(@NativeType("VkFormat") int value) { nimageFormat(address(), value); return this; }
    /** Sets the specified value to the {@code flowVectorFormat} field. */
    public VkOpticalFlowSessionCreateInfoNV flowVectorFormat(@NativeType("VkFormat") int value) { nflowVectorFormat(address(), value); return this; }
    /** Sets the specified value to the {@code costFormat} field. */
    public VkOpticalFlowSessionCreateInfoNV costFormat(@NativeType("VkFormat") int value) { ncostFormat(address(), value); return this; }
    /** Sets the specified value to the {@code outputGridSize} field. */
    public VkOpticalFlowSessionCreateInfoNV outputGridSize(@NativeType("VkOpticalFlowGridSizeFlagsNV") int value) { noutputGridSize(address(), value); return this; }
    /** Sets the specified value to the {@code hintGridSize} field. */
    public VkOpticalFlowSessionCreateInfoNV hintGridSize(@NativeType("VkOpticalFlowGridSizeFlagsNV") int value) { nhintGridSize(address(), value); return this; }
    /** Sets the specified value to the {@code performanceLevel} field. */
    public VkOpticalFlowSessionCreateInfoNV performanceLevel(@NativeType("VkOpticalFlowPerformanceLevelNV") int value) { nperformanceLevel(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkOpticalFlowSessionCreateInfoNV flags(@NativeType("VkOpticalFlowSessionCreateFlagsNV") int value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkOpticalFlowSessionCreateInfoNV set(
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
    public VkOpticalFlowSessionCreateInfoNV set(VkOpticalFlowSessionCreateInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkOpticalFlowSessionCreateInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkOpticalFlowSessionCreateInfoNV malloc() {
        return new VkOpticalFlowSessionCreateInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkOpticalFlowSessionCreateInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkOpticalFlowSessionCreateInfoNV calloc() {
        return new VkOpticalFlowSessionCreateInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkOpticalFlowSessionCreateInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkOpticalFlowSessionCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkOpticalFlowSessionCreateInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkOpticalFlowSessionCreateInfoNV} instance for the specified memory address. */
    public static VkOpticalFlowSessionCreateInfoNV create(long address) {
        return new VkOpticalFlowSessionCreateInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkOpticalFlowSessionCreateInfoNV createSafe(long address) {
        return address == NULL ? null : new VkOpticalFlowSessionCreateInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkOpticalFlowSessionCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkOpticalFlowSessionCreateInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkOpticalFlowSessionCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkOpticalFlowSessionCreateInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkOpticalFlowSessionCreateInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkOpticalFlowSessionCreateInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkOpticalFlowSessionCreateInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkOpticalFlowSessionCreateInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkOpticalFlowSessionCreateInfoNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkOpticalFlowSessionCreateInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkOpticalFlowSessionCreateInfoNV malloc(MemoryStack stack) {
        return new VkOpticalFlowSessionCreateInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkOpticalFlowSessionCreateInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkOpticalFlowSessionCreateInfoNV calloc(MemoryStack stack) {
        return new VkOpticalFlowSessionCreateInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkOpticalFlowSessionCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkOpticalFlowSessionCreateInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkOpticalFlowSessionCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkOpticalFlowSessionCreateInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkOpticalFlowSessionCreateInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkOpticalFlowSessionCreateInfoNV.PNEXT); }
    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return memGetInt(struct + VkOpticalFlowSessionCreateInfoNV.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return memGetInt(struct + VkOpticalFlowSessionCreateInfoNV.HEIGHT); }
    /** Unsafe version of {@link #imageFormat}. */
    public static int nimageFormat(long struct) { return memGetInt(struct + VkOpticalFlowSessionCreateInfoNV.IMAGEFORMAT); }
    /** Unsafe version of {@link #flowVectorFormat}. */
    public static int nflowVectorFormat(long struct) { return memGetInt(struct + VkOpticalFlowSessionCreateInfoNV.FLOWVECTORFORMAT); }
    /** Unsafe version of {@link #costFormat}. */
    public static int ncostFormat(long struct) { return memGetInt(struct + VkOpticalFlowSessionCreateInfoNV.COSTFORMAT); }
    /** Unsafe version of {@link #outputGridSize}. */
    public static int noutputGridSize(long struct) { return memGetInt(struct + VkOpticalFlowSessionCreateInfoNV.OUTPUTGRIDSIZE); }
    /** Unsafe version of {@link #hintGridSize}. */
    public static int nhintGridSize(long struct) { return memGetInt(struct + VkOpticalFlowSessionCreateInfoNV.HINTGRIDSIZE); }
    /** Unsafe version of {@link #performanceLevel}. */
    public static int nperformanceLevel(long struct) { return memGetInt(struct + VkOpticalFlowSessionCreateInfoNV.PERFORMANCELEVEL); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkOpticalFlowSessionCreateInfoNV.FLAGS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkOpticalFlowSessionCreateInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkOpticalFlowSessionCreateInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #width(int) width}. */
    public static void nwidth(long struct, int value) { memPutInt(struct + VkOpticalFlowSessionCreateInfoNV.WIDTH, value); }
    /** Unsafe version of {@link #height(int) height}. */
    public static void nheight(long struct, int value) { memPutInt(struct + VkOpticalFlowSessionCreateInfoNV.HEIGHT, value); }
    /** Unsafe version of {@link #imageFormat(int) imageFormat}. */
    public static void nimageFormat(long struct, int value) { memPutInt(struct + VkOpticalFlowSessionCreateInfoNV.IMAGEFORMAT, value); }
    /** Unsafe version of {@link #flowVectorFormat(int) flowVectorFormat}. */
    public static void nflowVectorFormat(long struct, int value) { memPutInt(struct + VkOpticalFlowSessionCreateInfoNV.FLOWVECTORFORMAT, value); }
    /** Unsafe version of {@link #costFormat(int) costFormat}. */
    public static void ncostFormat(long struct, int value) { memPutInt(struct + VkOpticalFlowSessionCreateInfoNV.COSTFORMAT, value); }
    /** Unsafe version of {@link #outputGridSize(int) outputGridSize}. */
    public static void noutputGridSize(long struct, int value) { memPutInt(struct + VkOpticalFlowSessionCreateInfoNV.OUTPUTGRIDSIZE, value); }
    /** Unsafe version of {@link #hintGridSize(int) hintGridSize}. */
    public static void nhintGridSize(long struct, int value) { memPutInt(struct + VkOpticalFlowSessionCreateInfoNV.HINTGRIDSIZE, value); }
    /** Unsafe version of {@link #performanceLevel(int) performanceLevel}. */
    public static void nperformanceLevel(long struct, int value) { memPutInt(struct + VkOpticalFlowSessionCreateInfoNV.PERFORMANCELEVEL, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkOpticalFlowSessionCreateInfoNV.FLAGS, value); }

    // -----------------------------------

    /** An array of {@link VkOpticalFlowSessionCreateInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkOpticalFlowSessionCreateInfoNV, Buffer> implements NativeResource {

        private static final VkOpticalFlowSessionCreateInfoNV ELEMENT_FACTORY = VkOpticalFlowSessionCreateInfoNV.create(-1L);

        /**
         * Creates a new {@code VkOpticalFlowSessionCreateInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkOpticalFlowSessionCreateInfoNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkOpticalFlowSessionCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkOpticalFlowSessionCreateInfoNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkOpticalFlowSessionCreateInfoNV.npNext(address()); }
        /** @return the value of the {@code width} field. */
        @NativeType("uint32_t")
        public int width() { return VkOpticalFlowSessionCreateInfoNV.nwidth(address()); }
        /** @return the value of the {@code height} field. */
        @NativeType("uint32_t")
        public int height() { return VkOpticalFlowSessionCreateInfoNV.nheight(address()); }
        /** @return the value of the {@code imageFormat} field. */
        @NativeType("VkFormat")
        public int imageFormat() { return VkOpticalFlowSessionCreateInfoNV.nimageFormat(address()); }
        /** @return the value of the {@code flowVectorFormat} field. */
        @NativeType("VkFormat")
        public int flowVectorFormat() { return VkOpticalFlowSessionCreateInfoNV.nflowVectorFormat(address()); }
        /** @return the value of the {@code costFormat} field. */
        @NativeType("VkFormat")
        public int costFormat() { return VkOpticalFlowSessionCreateInfoNV.ncostFormat(address()); }
        /** @return the value of the {@code outputGridSize} field. */
        @NativeType("VkOpticalFlowGridSizeFlagsNV")
        public int outputGridSize() { return VkOpticalFlowSessionCreateInfoNV.noutputGridSize(address()); }
        /** @return the value of the {@code hintGridSize} field. */
        @NativeType("VkOpticalFlowGridSizeFlagsNV")
        public int hintGridSize() { return VkOpticalFlowSessionCreateInfoNV.nhintGridSize(address()); }
        /** @return the value of the {@code performanceLevel} field. */
        @NativeType("VkOpticalFlowPerformanceLevelNV")
        public int performanceLevel() { return VkOpticalFlowSessionCreateInfoNV.nperformanceLevel(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkOpticalFlowSessionCreateFlagsNV")
        public int flags() { return VkOpticalFlowSessionCreateInfoNV.nflags(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkOpticalFlowSessionCreateInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkOpticalFlowSessionCreateInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVOpticalFlow#VK_STRUCTURE_TYPE_OPTICAL_FLOW_SESSION_CREATE_INFO_NV STRUCTURE_TYPE_OPTICAL_FLOW_SESSION_CREATE_INFO_NV} value to the {@code sType} field. */
        public VkOpticalFlowSessionCreateInfoNV.Buffer sType$Default() { return sType(NVOpticalFlow.VK_STRUCTURE_TYPE_OPTICAL_FLOW_SESSION_CREATE_INFO_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkOpticalFlowSessionCreateInfoNV.Buffer pNext(@NativeType("void *") long value) { VkOpticalFlowSessionCreateInfoNV.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkOpticalFlowSessionCreatePrivateDataInfoNV} value to the {@code pNext} chain. */
        public VkOpticalFlowSessionCreateInfoNV.Buffer pNext(VkOpticalFlowSessionCreatePrivateDataInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code width} field. */
        public VkOpticalFlowSessionCreateInfoNV.Buffer width(@NativeType("uint32_t") int value) { VkOpticalFlowSessionCreateInfoNV.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@code height} field. */
        public VkOpticalFlowSessionCreateInfoNV.Buffer height(@NativeType("uint32_t") int value) { VkOpticalFlowSessionCreateInfoNV.nheight(address(), value); return this; }
        /** Sets the specified value to the {@code imageFormat} field. */
        public VkOpticalFlowSessionCreateInfoNV.Buffer imageFormat(@NativeType("VkFormat") int value) { VkOpticalFlowSessionCreateInfoNV.nimageFormat(address(), value); return this; }
        /** Sets the specified value to the {@code flowVectorFormat} field. */
        public VkOpticalFlowSessionCreateInfoNV.Buffer flowVectorFormat(@NativeType("VkFormat") int value) { VkOpticalFlowSessionCreateInfoNV.nflowVectorFormat(address(), value); return this; }
        /** Sets the specified value to the {@code costFormat} field. */
        public VkOpticalFlowSessionCreateInfoNV.Buffer costFormat(@NativeType("VkFormat") int value) { VkOpticalFlowSessionCreateInfoNV.ncostFormat(address(), value); return this; }
        /** Sets the specified value to the {@code outputGridSize} field. */
        public VkOpticalFlowSessionCreateInfoNV.Buffer outputGridSize(@NativeType("VkOpticalFlowGridSizeFlagsNV") int value) { VkOpticalFlowSessionCreateInfoNV.noutputGridSize(address(), value); return this; }
        /** Sets the specified value to the {@code hintGridSize} field. */
        public VkOpticalFlowSessionCreateInfoNV.Buffer hintGridSize(@NativeType("VkOpticalFlowGridSizeFlagsNV") int value) { VkOpticalFlowSessionCreateInfoNV.nhintGridSize(address(), value); return this; }
        /** Sets the specified value to the {@code performanceLevel} field. */
        public VkOpticalFlowSessionCreateInfoNV.Buffer performanceLevel(@NativeType("VkOpticalFlowPerformanceLevelNV") int value) { VkOpticalFlowSessionCreateInfoNV.nperformanceLevel(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkOpticalFlowSessionCreateInfoNV.Buffer flags(@NativeType("VkOpticalFlowSessionCreateFlagsNV") int value) { VkOpticalFlowSessionCreateInfoNV.nflags(address(), value); return this; }

    }

}