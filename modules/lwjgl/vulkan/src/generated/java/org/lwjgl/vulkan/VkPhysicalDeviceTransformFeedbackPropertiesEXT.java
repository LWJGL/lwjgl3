/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure describing transform feedback properties that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTTransformFeedback#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_PROPERTIES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceTransformFeedbackPropertiesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint32_t {@link #maxTransformFeedbackStreams};
 *     uint32_t {@link #maxTransformFeedbackBuffers};
 *     VkDeviceSize {@link #maxTransformFeedbackBufferSize};
 *     uint32_t {@link #maxTransformFeedbackStreamDataSize};
 *     uint32_t {@link #maxTransformFeedbackBufferDataSize};
 *     uint32_t {@link #maxTransformFeedbackBufferDataStride};
 *     VkBool32 {@link #transformFeedbackQueries};
 *     VkBool32 {@link #transformFeedbackStreamsLinesTriangles};
 *     VkBool32 {@link #transformFeedbackRasterizationStreamSelect};
 *     VkBool32 {@link #transformFeedbackDraw};
 * }</code></pre>
 */
public class VkPhysicalDeviceTransformFeedbackPropertiesEXT extends Struct implements NativeResource {

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

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** the maximum number of vertex streams that can be output from geometry shaders declared with the {@code GeometryStreams} capability. If the implementation does not support {@link VkPhysicalDeviceTransformFeedbackFeaturesEXT}{@code ::geometryStreams} then {@code maxTransformFeedbackStreams} <b>must</b> be set to 1. */
    @NativeType("uint32_t")
    public int maxTransformFeedbackStreams() { return nmaxTransformFeedbackStreams(address()); }
    /** the maximum number of transform feedback buffers that can be bound for capturing shader outputs from the last <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader stage</a>. */
    @NativeType("uint32_t")
    public int maxTransformFeedbackBuffers() { return nmaxTransformFeedbackBuffers(address()); }
    /** the maximum size that can be specified when binding a buffer for transform feedback in {@link EXTTransformFeedback#vkCmdBindTransformFeedbackBuffersEXT CmdBindTransformFeedbackBuffersEXT}. */
    @NativeType("VkDeviceSize")
    public long maxTransformFeedbackBufferSize() { return nmaxTransformFeedbackBufferSize(address()); }
    /** the maximum amount of data in bytes for each vertex that captured to one or more transform feedback buffers associated with a specific vertex stream. */
    @NativeType("uint32_t")
    public int maxTransformFeedbackStreamDataSize() { return nmaxTransformFeedbackStreamDataSize(address()); }
    /** the maximum amount of data in bytes for each vertex that can be captured to a specific transform feedback buffer. */
    @NativeType("uint32_t")
    public int maxTransformFeedbackBufferDataSize() { return nmaxTransformFeedbackBufferDataSize(address()); }
    /** the maximum stride between each capture of vertex data to the buffer. */
    @NativeType("uint32_t")
    public int maxTransformFeedbackBufferDataStride() { return nmaxTransformFeedbackBufferDataStride(address()); }
    /** {@link VK10#VK_TRUE TRUE} if the implementation supports the {@link EXTTransformFeedback#VK_QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT} query type. {@code transformFeedbackQueries} is {@link VK10#VK_FALSE FALSE} if queries of this type <b>cannot</b> be created. */
    @NativeType("VkBool32")
    public boolean transformFeedbackQueries() { return ntransformFeedbackQueries(address()) != 0; }
    /** {@link VK10#VK_TRUE TRUE} if the implementation supports the geometry shader {@code OpExecutionMode} of {@code OutputLineStrip} and {@code OutputTriangleStrip} in addition to {@code OutputPoints} when more than one vertex stream is output. If {@code transformFeedbackStreamsLinesTriangles} is {@link VK10#VK_FALSE FALSE} the implementation only supports an {@code OpExecutionMode} of {@code OutputPoints} when more than one vertex stream is output from the geometry shader. */
    @NativeType("VkBool32")
    public boolean transformFeedbackStreamsLinesTriangles() { return ntransformFeedbackStreamsLinesTriangles(address()) != 0; }
    /** {@link VK10#VK_TRUE TRUE} if the implementation supports the {@code GeometryStreams} SPIR-V capability and the application can use {@link VkPipelineRasterizationStateStreamCreateInfoEXT} to modify which vertex stream output is used for rasterization. Otherwise vertex stream 0 <b>must</b> always be used for rasterization. */
    @NativeType("VkBool32")
    public boolean transformFeedbackRasterizationStreamSelect() { return ntransformFeedbackRasterizationStreamSelect(address()) != 0; }
    /** {@link VK10#VK_TRUE TRUE} if the implementation supports the {@link EXTTransformFeedback#vkCmdDrawIndirectByteCountEXT CmdDrawIndirectByteCountEXT} function otherwise the function <b>must</b> not be called. */
    @NativeType("VkBool32")
    public boolean transformFeedbackDraw() { return ntransformFeedbackDraw(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTTransformFeedback#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_PROPERTIES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT sType$Default() { return sType(EXTTransformFeedback.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_PROPERTIES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
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
        return wrap(VkPhysicalDeviceTransformFeedbackPropertiesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceTransformFeedbackPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT calloc() {
        return wrap(VkPhysicalDeviceTransformFeedbackPropertiesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceTransformFeedbackPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceTransformFeedbackPropertiesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceTransformFeedbackPropertiesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT create(long address) {
        return wrap(VkPhysicalDeviceTransformFeedbackPropertiesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceTransformFeedbackPropertiesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
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
        return wrap(VkPhysicalDeviceTransformFeedbackPropertiesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceTransformFeedbackPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceTransformFeedbackPropertiesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceTransformFeedbackPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceTransformFeedbackPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #maxTransformFeedbackStreams}. */
    public static int nmaxTransformFeedbackStreams(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceTransformFeedbackPropertiesEXT.MAXTRANSFORMFEEDBACKSTREAMS); }
    /** Unsafe version of {@link #maxTransformFeedbackBuffers}. */
    public static int nmaxTransformFeedbackBuffers(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceTransformFeedbackPropertiesEXT.MAXTRANSFORMFEEDBACKBUFFERS); }
    /** Unsafe version of {@link #maxTransformFeedbackBufferSize}. */
    public static long nmaxTransformFeedbackBufferSize(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceTransformFeedbackPropertiesEXT.MAXTRANSFORMFEEDBACKBUFFERSIZE); }
    /** Unsafe version of {@link #maxTransformFeedbackStreamDataSize}. */
    public static int nmaxTransformFeedbackStreamDataSize(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceTransformFeedbackPropertiesEXT.MAXTRANSFORMFEEDBACKSTREAMDATASIZE); }
    /** Unsafe version of {@link #maxTransformFeedbackBufferDataSize}. */
    public static int nmaxTransformFeedbackBufferDataSize(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceTransformFeedbackPropertiesEXT.MAXTRANSFORMFEEDBACKBUFFERDATASIZE); }
    /** Unsafe version of {@link #maxTransformFeedbackBufferDataStride}. */
    public static int nmaxTransformFeedbackBufferDataStride(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceTransformFeedbackPropertiesEXT.MAXTRANSFORMFEEDBACKBUFFERDATASTRIDE); }
    /** Unsafe version of {@link #transformFeedbackQueries}. */
    public static int ntransformFeedbackQueries(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceTransformFeedbackPropertiesEXT.TRANSFORMFEEDBACKQUERIES); }
    /** Unsafe version of {@link #transformFeedbackStreamsLinesTriangles}. */
    public static int ntransformFeedbackStreamsLinesTriangles(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceTransformFeedbackPropertiesEXT.TRANSFORMFEEDBACKSTREAMSLINESTRIANGLES); }
    /** Unsafe version of {@link #transformFeedbackRasterizationStreamSelect}. */
    public static int ntransformFeedbackRasterizationStreamSelect(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceTransformFeedbackPropertiesEXT.TRANSFORMFEEDBACKRASTERIZATIONSTREAMSELECT); }
    /** Unsafe version of {@link #transformFeedbackDraw}. */
    public static int ntransformFeedbackDraw(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceTransformFeedbackPropertiesEXT.TRANSFORMFEEDBACKDRAW); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceTransformFeedbackPropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceTransformFeedbackPropertiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceTransformFeedbackPropertiesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceTransformFeedbackPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceTransformFeedbackPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceTransformFeedbackPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceTransformFeedbackPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT#maxTransformFeedbackStreams} field. */
        @NativeType("uint32_t")
        public int maxTransformFeedbackStreams() { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.nmaxTransformFeedbackStreams(address()); }
        /** @return the value of the {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT#maxTransformFeedbackBuffers} field. */
        @NativeType("uint32_t")
        public int maxTransformFeedbackBuffers() { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.nmaxTransformFeedbackBuffers(address()); }
        /** @return the value of the {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT#maxTransformFeedbackBufferSize} field. */
        @NativeType("VkDeviceSize")
        public long maxTransformFeedbackBufferSize() { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.nmaxTransformFeedbackBufferSize(address()); }
        /** @return the value of the {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT#maxTransformFeedbackStreamDataSize} field. */
        @NativeType("uint32_t")
        public int maxTransformFeedbackStreamDataSize() { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.nmaxTransformFeedbackStreamDataSize(address()); }
        /** @return the value of the {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT#maxTransformFeedbackBufferDataSize} field. */
        @NativeType("uint32_t")
        public int maxTransformFeedbackBufferDataSize() { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.nmaxTransformFeedbackBufferDataSize(address()); }
        /** @return the value of the {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT#maxTransformFeedbackBufferDataStride} field. */
        @NativeType("uint32_t")
        public int maxTransformFeedbackBufferDataStride() { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.nmaxTransformFeedbackBufferDataStride(address()); }
        /** @return the value of the {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT#transformFeedbackQueries} field. */
        @NativeType("VkBool32")
        public boolean transformFeedbackQueries() { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.ntransformFeedbackQueries(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT#transformFeedbackStreamsLinesTriangles} field. */
        @NativeType("VkBool32")
        public boolean transformFeedbackStreamsLinesTriangles() { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.ntransformFeedbackStreamsLinesTriangles(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT#transformFeedbackRasterizationStreamSelect} field. */
        @NativeType("VkBool32")
        public boolean transformFeedbackRasterizationStreamSelect() { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.ntransformFeedbackRasterizationStreamSelect(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT#transformFeedbackDraw} field. */
        @NativeType("VkBool32")
        public boolean transformFeedbackDraw() { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.ntransformFeedbackDraw(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT#sType} field. */
        public VkPhysicalDeviceTransformFeedbackPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceTransformFeedbackPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTTransformFeedback#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_PROPERTIES_EXT} value to the {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT#sType} field. */
        public VkPhysicalDeviceTransformFeedbackPropertiesEXT.Buffer sType$Default() { return sType(EXTTransformFeedback.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_PROPERTIES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT#pNext} field. */
        public VkPhysicalDeviceTransformFeedbackPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceTransformFeedbackPropertiesEXT.npNext(address(), value); return this; }

    }

}