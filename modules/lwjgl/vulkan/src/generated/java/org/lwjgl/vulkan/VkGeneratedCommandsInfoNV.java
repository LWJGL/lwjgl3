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
 * struct VkGeneratedCommandsInfoNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkPipelineBindPoint pipelineBindPoint;
 *     VkPipeline pipeline;
 *     VkIndirectCommandsLayoutNV indirectCommandsLayout;
 *     uint32_t streamCount;
 *     {@link VkIndirectCommandsStreamNV VkIndirectCommandsStreamNV} const * pStreams;
 *     uint32_t sequencesCount;
 *     VkBuffer preprocessBuffer;
 *     VkDeviceSize preprocessOffset;
 *     VkDeviceSize preprocessSize;
 *     VkBuffer sequencesCountBuffer;
 *     VkDeviceSize sequencesCountOffset;
 *     VkBuffer sequencesIndexBuffer;
 *     VkDeviceSize sequencesIndexOffset;
 * }}</pre>
 */
public class VkGeneratedCommandsInfoNV extends Struct<VkGeneratedCommandsInfoNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PIPELINEBINDPOINT,
        PIPELINE,
        INDIRECTCOMMANDSLAYOUT,
        STREAMCOUNT,
        PSTREAMS,
        SEQUENCESCOUNT,
        PREPROCESSBUFFER,
        PREPROCESSOFFSET,
        PREPROCESSSIZE,
        SEQUENCESCOUNTBUFFER,
        SEQUENCESCOUNTOFFSET,
        SEQUENCESINDEXBUFFER,
        SEQUENCESINDEXOFFSET;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(8),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PIPELINEBINDPOINT = layout.offsetof(2);
        PIPELINE = layout.offsetof(3);
        INDIRECTCOMMANDSLAYOUT = layout.offsetof(4);
        STREAMCOUNT = layout.offsetof(5);
        PSTREAMS = layout.offsetof(6);
        SEQUENCESCOUNT = layout.offsetof(7);
        PREPROCESSBUFFER = layout.offsetof(8);
        PREPROCESSOFFSET = layout.offsetof(9);
        PREPROCESSSIZE = layout.offsetof(10);
        SEQUENCESCOUNTBUFFER = layout.offsetof(11);
        SEQUENCESCOUNTOFFSET = layout.offsetof(12);
        SEQUENCESINDEXBUFFER = layout.offsetof(13);
        SEQUENCESINDEXOFFSET = layout.offsetof(14);
    }

    protected VkGeneratedCommandsInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkGeneratedCommandsInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkGeneratedCommandsInfoNV(address, container);
    }

    /**
     * Creates a {@code VkGeneratedCommandsInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkGeneratedCommandsInfoNV(ByteBuffer container) {
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
    /** @return the value of the {@code pipelineBindPoint} field. */
    @NativeType("VkPipelineBindPoint")
    public int pipelineBindPoint() { return npipelineBindPoint(address()); }
    /** @return the value of the {@code pipeline} field. */
    @NativeType("VkPipeline")
    public long pipeline() { return npipeline(address()); }
    /** @return the value of the {@code indirectCommandsLayout} field. */
    @NativeType("VkIndirectCommandsLayoutNV")
    public long indirectCommandsLayout() { return nindirectCommandsLayout(address()); }
    /** @return the value of the {@code streamCount} field. */
    @NativeType("uint32_t")
    public int streamCount() { return nstreamCount(address()); }
    /** @return a {@link VkIndirectCommandsStreamNV.Buffer} view of the struct array pointed to by the {@code pStreams} field. */
    @NativeType("VkIndirectCommandsStreamNV const *")
    public VkIndirectCommandsStreamNV.Buffer pStreams() { return npStreams(address()); }
    /** @return the value of the {@code sequencesCount} field. */
    @NativeType("uint32_t")
    public int sequencesCount() { return nsequencesCount(address()); }
    /** @return the value of the {@code preprocessBuffer} field. */
    @NativeType("VkBuffer")
    public long preprocessBuffer() { return npreprocessBuffer(address()); }
    /** @return the value of the {@code preprocessOffset} field. */
    @NativeType("VkDeviceSize")
    public long preprocessOffset() { return npreprocessOffset(address()); }
    /** @return the value of the {@code preprocessSize} field. */
    @NativeType("VkDeviceSize")
    public long preprocessSize() { return npreprocessSize(address()); }
    /** @return the value of the {@code sequencesCountBuffer} field. */
    @NativeType("VkBuffer")
    public long sequencesCountBuffer() { return nsequencesCountBuffer(address()); }
    /** @return the value of the {@code sequencesCountOffset} field. */
    @NativeType("VkDeviceSize")
    public long sequencesCountOffset() { return nsequencesCountOffset(address()); }
    /** @return the value of the {@code sequencesIndexBuffer} field. */
    @NativeType("VkBuffer")
    public long sequencesIndexBuffer() { return nsequencesIndexBuffer(address()); }
    /** @return the value of the {@code sequencesIndexOffset} field. */
    @NativeType("VkDeviceSize")
    public long sequencesIndexOffset() { return nsequencesIndexOffset(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkGeneratedCommandsInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVDeviceGeneratedCommands#VK_STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_NV STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_NV} value to the {@code sType} field. */
    public VkGeneratedCommandsInfoNV sType$Default() { return sType(NVDeviceGeneratedCommands.VK_STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkGeneratedCommandsInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code pipelineBindPoint} field. */
    public VkGeneratedCommandsInfoNV pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) { npipelineBindPoint(address(), value); return this; }
    /** Sets the specified value to the {@code pipeline} field. */
    public VkGeneratedCommandsInfoNV pipeline(@NativeType("VkPipeline") long value) { npipeline(address(), value); return this; }
    /** Sets the specified value to the {@code indirectCommandsLayout} field. */
    public VkGeneratedCommandsInfoNV indirectCommandsLayout(@NativeType("VkIndirectCommandsLayoutNV") long value) { nindirectCommandsLayout(address(), value); return this; }
    /** Sets the address of the specified {@link VkIndirectCommandsStreamNV.Buffer} to the {@code pStreams} field. */
    public VkGeneratedCommandsInfoNV pStreams(@NativeType("VkIndirectCommandsStreamNV const *") VkIndirectCommandsStreamNV.Buffer value) { npStreams(address(), value); return this; }
    /** Sets the specified value to the {@code sequencesCount} field. */
    public VkGeneratedCommandsInfoNV sequencesCount(@NativeType("uint32_t") int value) { nsequencesCount(address(), value); return this; }
    /** Sets the specified value to the {@code preprocessBuffer} field. */
    public VkGeneratedCommandsInfoNV preprocessBuffer(@NativeType("VkBuffer") long value) { npreprocessBuffer(address(), value); return this; }
    /** Sets the specified value to the {@code preprocessOffset} field. */
    public VkGeneratedCommandsInfoNV preprocessOffset(@NativeType("VkDeviceSize") long value) { npreprocessOffset(address(), value); return this; }
    /** Sets the specified value to the {@code preprocessSize} field. */
    public VkGeneratedCommandsInfoNV preprocessSize(@NativeType("VkDeviceSize") long value) { npreprocessSize(address(), value); return this; }
    /** Sets the specified value to the {@code sequencesCountBuffer} field. */
    public VkGeneratedCommandsInfoNV sequencesCountBuffer(@NativeType("VkBuffer") long value) { nsequencesCountBuffer(address(), value); return this; }
    /** Sets the specified value to the {@code sequencesCountOffset} field. */
    public VkGeneratedCommandsInfoNV sequencesCountOffset(@NativeType("VkDeviceSize") long value) { nsequencesCountOffset(address(), value); return this; }
    /** Sets the specified value to the {@code sequencesIndexBuffer} field. */
    public VkGeneratedCommandsInfoNV sequencesIndexBuffer(@NativeType("VkBuffer") long value) { nsequencesIndexBuffer(address(), value); return this; }
    /** Sets the specified value to the {@code sequencesIndexOffset} field. */
    public VkGeneratedCommandsInfoNV sequencesIndexOffset(@NativeType("VkDeviceSize") long value) { nsequencesIndexOffset(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkGeneratedCommandsInfoNV set(
        int sType,
        long pNext,
        int pipelineBindPoint,
        long pipeline,
        long indirectCommandsLayout,
        VkIndirectCommandsStreamNV.Buffer pStreams,
        int sequencesCount,
        long preprocessBuffer,
        long preprocessOffset,
        long preprocessSize,
        long sequencesCountBuffer,
        long sequencesCountOffset,
        long sequencesIndexBuffer,
        long sequencesIndexOffset
    ) {
        sType(sType);
        pNext(pNext);
        pipelineBindPoint(pipelineBindPoint);
        pipeline(pipeline);
        indirectCommandsLayout(indirectCommandsLayout);
        pStreams(pStreams);
        sequencesCount(sequencesCount);
        preprocessBuffer(preprocessBuffer);
        preprocessOffset(preprocessOffset);
        preprocessSize(preprocessSize);
        sequencesCountBuffer(sequencesCountBuffer);
        sequencesCountOffset(sequencesCountOffset);
        sequencesIndexBuffer(sequencesIndexBuffer);
        sequencesIndexOffset(sequencesIndexOffset);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkGeneratedCommandsInfoNV set(VkGeneratedCommandsInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkGeneratedCommandsInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkGeneratedCommandsInfoNV malloc() {
        return new VkGeneratedCommandsInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkGeneratedCommandsInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkGeneratedCommandsInfoNV calloc() {
        return new VkGeneratedCommandsInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkGeneratedCommandsInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkGeneratedCommandsInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkGeneratedCommandsInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkGeneratedCommandsInfoNV} instance for the specified memory address. */
    public static VkGeneratedCommandsInfoNV create(long address) {
        return new VkGeneratedCommandsInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkGeneratedCommandsInfoNV createSafe(long address) {
        return address == NULL ? null : new VkGeneratedCommandsInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkGeneratedCommandsInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkGeneratedCommandsInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGeneratedCommandsInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkGeneratedCommandsInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkGeneratedCommandsInfoNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkGeneratedCommandsInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGeneratedCommandsInfoNV malloc(MemoryStack stack) {
        return new VkGeneratedCommandsInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkGeneratedCommandsInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGeneratedCommandsInfoNV calloc(MemoryStack stack) {
        return new VkGeneratedCommandsInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkGeneratedCommandsInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGeneratedCommandsInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkGeneratedCommandsInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkGeneratedCommandsInfoNV.PNEXT); }
    /** Unsafe version of {@link #pipelineBindPoint}. */
    public static int npipelineBindPoint(long struct) { return memGetInt(struct + VkGeneratedCommandsInfoNV.PIPELINEBINDPOINT); }
    /** Unsafe version of {@link #pipeline}. */
    public static long npipeline(long struct) { return memGetLong(struct + VkGeneratedCommandsInfoNV.PIPELINE); }
    /** Unsafe version of {@link #indirectCommandsLayout}. */
    public static long nindirectCommandsLayout(long struct) { return memGetLong(struct + VkGeneratedCommandsInfoNV.INDIRECTCOMMANDSLAYOUT); }
    /** Unsafe version of {@link #streamCount}. */
    public static int nstreamCount(long struct) { return memGetInt(struct + VkGeneratedCommandsInfoNV.STREAMCOUNT); }
    /** Unsafe version of {@link #pStreams}. */
    public static VkIndirectCommandsStreamNV.Buffer npStreams(long struct) { return VkIndirectCommandsStreamNV.create(memGetAddress(struct + VkGeneratedCommandsInfoNV.PSTREAMS), nstreamCount(struct)); }
    /** Unsafe version of {@link #sequencesCount}. */
    public static int nsequencesCount(long struct) { return memGetInt(struct + VkGeneratedCommandsInfoNV.SEQUENCESCOUNT); }
    /** Unsafe version of {@link #preprocessBuffer}. */
    public static long npreprocessBuffer(long struct) { return memGetLong(struct + VkGeneratedCommandsInfoNV.PREPROCESSBUFFER); }
    /** Unsafe version of {@link #preprocessOffset}. */
    public static long npreprocessOffset(long struct) { return memGetLong(struct + VkGeneratedCommandsInfoNV.PREPROCESSOFFSET); }
    /** Unsafe version of {@link #preprocessSize}. */
    public static long npreprocessSize(long struct) { return memGetLong(struct + VkGeneratedCommandsInfoNV.PREPROCESSSIZE); }
    /** Unsafe version of {@link #sequencesCountBuffer}. */
    public static long nsequencesCountBuffer(long struct) { return memGetLong(struct + VkGeneratedCommandsInfoNV.SEQUENCESCOUNTBUFFER); }
    /** Unsafe version of {@link #sequencesCountOffset}. */
    public static long nsequencesCountOffset(long struct) { return memGetLong(struct + VkGeneratedCommandsInfoNV.SEQUENCESCOUNTOFFSET); }
    /** Unsafe version of {@link #sequencesIndexBuffer}. */
    public static long nsequencesIndexBuffer(long struct) { return memGetLong(struct + VkGeneratedCommandsInfoNV.SEQUENCESINDEXBUFFER); }
    /** Unsafe version of {@link #sequencesIndexOffset}. */
    public static long nsequencesIndexOffset(long struct) { return memGetLong(struct + VkGeneratedCommandsInfoNV.SEQUENCESINDEXOFFSET); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkGeneratedCommandsInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkGeneratedCommandsInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #pipelineBindPoint(int) pipelineBindPoint}. */
    public static void npipelineBindPoint(long struct, int value) { memPutInt(struct + VkGeneratedCommandsInfoNV.PIPELINEBINDPOINT, value); }
    /** Unsafe version of {@link #pipeline(long) pipeline}. */
    public static void npipeline(long struct, long value) { memPutLong(struct + VkGeneratedCommandsInfoNV.PIPELINE, value); }
    /** Unsafe version of {@link #indirectCommandsLayout(long) indirectCommandsLayout}. */
    public static void nindirectCommandsLayout(long struct, long value) { memPutLong(struct + VkGeneratedCommandsInfoNV.INDIRECTCOMMANDSLAYOUT, value); }
    /** Sets the specified value to the {@code streamCount} field of the specified {@code struct}. */
    public static void nstreamCount(long struct, int value) { memPutInt(struct + VkGeneratedCommandsInfoNV.STREAMCOUNT, value); }
    /** Unsafe version of {@link #pStreams(VkIndirectCommandsStreamNV.Buffer) pStreams}. */
    public static void npStreams(long struct, VkIndirectCommandsStreamNV.Buffer value) { memPutAddress(struct + VkGeneratedCommandsInfoNV.PSTREAMS, value.address()); nstreamCount(struct, value.remaining()); }
    /** Unsafe version of {@link #sequencesCount(int) sequencesCount}. */
    public static void nsequencesCount(long struct, int value) { memPutInt(struct + VkGeneratedCommandsInfoNV.SEQUENCESCOUNT, value); }
    /** Unsafe version of {@link #preprocessBuffer(long) preprocessBuffer}. */
    public static void npreprocessBuffer(long struct, long value) { memPutLong(struct + VkGeneratedCommandsInfoNV.PREPROCESSBUFFER, value); }
    /** Unsafe version of {@link #preprocessOffset(long) preprocessOffset}. */
    public static void npreprocessOffset(long struct, long value) { memPutLong(struct + VkGeneratedCommandsInfoNV.PREPROCESSOFFSET, value); }
    /** Unsafe version of {@link #preprocessSize(long) preprocessSize}. */
    public static void npreprocessSize(long struct, long value) { memPutLong(struct + VkGeneratedCommandsInfoNV.PREPROCESSSIZE, value); }
    /** Unsafe version of {@link #sequencesCountBuffer(long) sequencesCountBuffer}. */
    public static void nsequencesCountBuffer(long struct, long value) { memPutLong(struct + VkGeneratedCommandsInfoNV.SEQUENCESCOUNTBUFFER, value); }
    /** Unsafe version of {@link #sequencesCountOffset(long) sequencesCountOffset}. */
    public static void nsequencesCountOffset(long struct, long value) { memPutLong(struct + VkGeneratedCommandsInfoNV.SEQUENCESCOUNTOFFSET, value); }
    /** Unsafe version of {@link #sequencesIndexBuffer(long) sequencesIndexBuffer}. */
    public static void nsequencesIndexBuffer(long struct, long value) { memPutLong(struct + VkGeneratedCommandsInfoNV.SEQUENCESINDEXBUFFER, value); }
    /** Unsafe version of {@link #sequencesIndexOffset(long) sequencesIndexOffset}. */
    public static void nsequencesIndexOffset(long struct, long value) { memPutLong(struct + VkGeneratedCommandsInfoNV.SEQUENCESINDEXOFFSET, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkGeneratedCommandsInfoNV.PSTREAMS));
    }

    // -----------------------------------

    /** An array of {@link VkGeneratedCommandsInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkGeneratedCommandsInfoNV, Buffer> implements NativeResource {

        private static final VkGeneratedCommandsInfoNV ELEMENT_FACTORY = VkGeneratedCommandsInfoNV.create(-1L);

        /**
         * Creates a new {@code VkGeneratedCommandsInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkGeneratedCommandsInfoNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkGeneratedCommandsInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkGeneratedCommandsInfoNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkGeneratedCommandsInfoNV.npNext(address()); }
        /** @return the value of the {@code pipelineBindPoint} field. */
        @NativeType("VkPipelineBindPoint")
        public int pipelineBindPoint() { return VkGeneratedCommandsInfoNV.npipelineBindPoint(address()); }
        /** @return the value of the {@code pipeline} field. */
        @NativeType("VkPipeline")
        public long pipeline() { return VkGeneratedCommandsInfoNV.npipeline(address()); }
        /** @return the value of the {@code indirectCommandsLayout} field. */
        @NativeType("VkIndirectCommandsLayoutNV")
        public long indirectCommandsLayout() { return VkGeneratedCommandsInfoNV.nindirectCommandsLayout(address()); }
        /** @return the value of the {@code streamCount} field. */
        @NativeType("uint32_t")
        public int streamCount() { return VkGeneratedCommandsInfoNV.nstreamCount(address()); }
        /** @return a {@link VkIndirectCommandsStreamNV.Buffer} view of the struct array pointed to by the {@code pStreams} field. */
        @NativeType("VkIndirectCommandsStreamNV const *")
        public VkIndirectCommandsStreamNV.Buffer pStreams() { return VkGeneratedCommandsInfoNV.npStreams(address()); }
        /** @return the value of the {@code sequencesCount} field. */
        @NativeType("uint32_t")
        public int sequencesCount() { return VkGeneratedCommandsInfoNV.nsequencesCount(address()); }
        /** @return the value of the {@code preprocessBuffer} field. */
        @NativeType("VkBuffer")
        public long preprocessBuffer() { return VkGeneratedCommandsInfoNV.npreprocessBuffer(address()); }
        /** @return the value of the {@code preprocessOffset} field. */
        @NativeType("VkDeviceSize")
        public long preprocessOffset() { return VkGeneratedCommandsInfoNV.npreprocessOffset(address()); }
        /** @return the value of the {@code preprocessSize} field. */
        @NativeType("VkDeviceSize")
        public long preprocessSize() { return VkGeneratedCommandsInfoNV.npreprocessSize(address()); }
        /** @return the value of the {@code sequencesCountBuffer} field. */
        @NativeType("VkBuffer")
        public long sequencesCountBuffer() { return VkGeneratedCommandsInfoNV.nsequencesCountBuffer(address()); }
        /** @return the value of the {@code sequencesCountOffset} field. */
        @NativeType("VkDeviceSize")
        public long sequencesCountOffset() { return VkGeneratedCommandsInfoNV.nsequencesCountOffset(address()); }
        /** @return the value of the {@code sequencesIndexBuffer} field. */
        @NativeType("VkBuffer")
        public long sequencesIndexBuffer() { return VkGeneratedCommandsInfoNV.nsequencesIndexBuffer(address()); }
        /** @return the value of the {@code sequencesIndexOffset} field. */
        @NativeType("VkDeviceSize")
        public long sequencesIndexOffset() { return VkGeneratedCommandsInfoNV.nsequencesIndexOffset(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkGeneratedCommandsInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkGeneratedCommandsInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVDeviceGeneratedCommands#VK_STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_NV STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_NV} value to the {@code sType} field. */
        public VkGeneratedCommandsInfoNV.Buffer sType$Default() { return sType(NVDeviceGeneratedCommands.VK_STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkGeneratedCommandsInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkGeneratedCommandsInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code pipelineBindPoint} field. */
        public VkGeneratedCommandsInfoNV.Buffer pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) { VkGeneratedCommandsInfoNV.npipelineBindPoint(address(), value); return this; }
        /** Sets the specified value to the {@code pipeline} field. */
        public VkGeneratedCommandsInfoNV.Buffer pipeline(@NativeType("VkPipeline") long value) { VkGeneratedCommandsInfoNV.npipeline(address(), value); return this; }
        /** Sets the specified value to the {@code indirectCommandsLayout} field. */
        public VkGeneratedCommandsInfoNV.Buffer indirectCommandsLayout(@NativeType("VkIndirectCommandsLayoutNV") long value) { VkGeneratedCommandsInfoNV.nindirectCommandsLayout(address(), value); return this; }
        /** Sets the address of the specified {@link VkIndirectCommandsStreamNV.Buffer} to the {@code pStreams} field. */
        public VkGeneratedCommandsInfoNV.Buffer pStreams(@NativeType("VkIndirectCommandsStreamNV const *") VkIndirectCommandsStreamNV.Buffer value) { VkGeneratedCommandsInfoNV.npStreams(address(), value); return this; }
        /** Sets the specified value to the {@code sequencesCount} field. */
        public VkGeneratedCommandsInfoNV.Buffer sequencesCount(@NativeType("uint32_t") int value) { VkGeneratedCommandsInfoNV.nsequencesCount(address(), value); return this; }
        /** Sets the specified value to the {@code preprocessBuffer} field. */
        public VkGeneratedCommandsInfoNV.Buffer preprocessBuffer(@NativeType("VkBuffer") long value) { VkGeneratedCommandsInfoNV.npreprocessBuffer(address(), value); return this; }
        /** Sets the specified value to the {@code preprocessOffset} field. */
        public VkGeneratedCommandsInfoNV.Buffer preprocessOffset(@NativeType("VkDeviceSize") long value) { VkGeneratedCommandsInfoNV.npreprocessOffset(address(), value); return this; }
        /** Sets the specified value to the {@code preprocessSize} field. */
        public VkGeneratedCommandsInfoNV.Buffer preprocessSize(@NativeType("VkDeviceSize") long value) { VkGeneratedCommandsInfoNV.npreprocessSize(address(), value); return this; }
        /** Sets the specified value to the {@code sequencesCountBuffer} field. */
        public VkGeneratedCommandsInfoNV.Buffer sequencesCountBuffer(@NativeType("VkBuffer") long value) { VkGeneratedCommandsInfoNV.nsequencesCountBuffer(address(), value); return this; }
        /** Sets the specified value to the {@code sequencesCountOffset} field. */
        public VkGeneratedCommandsInfoNV.Buffer sequencesCountOffset(@NativeType("VkDeviceSize") long value) { VkGeneratedCommandsInfoNV.nsequencesCountOffset(address(), value); return this; }
        /** Sets the specified value to the {@code sequencesIndexBuffer} field. */
        public VkGeneratedCommandsInfoNV.Buffer sequencesIndexBuffer(@NativeType("VkBuffer") long value) { VkGeneratedCommandsInfoNV.nsequencesIndexBuffer(address(), value); return this; }
        /** Sets the specified value to the {@code sequencesIndexOffset} field. */
        public VkGeneratedCommandsInfoNV.Buffer sequencesIndexOffset(@NativeType("VkDeviceSize") long value) { VkGeneratedCommandsInfoNV.nsequencesIndexOffset(address(), value); return this; }

    }

}