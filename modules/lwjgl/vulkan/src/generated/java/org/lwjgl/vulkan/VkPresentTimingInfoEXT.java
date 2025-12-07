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
 * struct VkPresentTimingInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkPresentTimingInfoFlagsEXT flags;
 *     uint64_t targetTime;
 *     uint64_t timeDomainId;
 *     VkPresentStageFlagsEXT presentStageQueries;
 *     VkPresentStageFlagsEXT targetTimeDomainPresentStage;
 * }}</pre>
 */
public class VkPresentTimingInfoEXT extends Struct<VkPresentTimingInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        TARGETTIME,
        TIMEDOMAINID,
        PRESENTSTAGEQUERIES,
        TARGETTIMEDOMAINPRESENTSTAGE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(8),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        TARGETTIME = layout.offsetof(3);
        TIMEDOMAINID = layout.offsetof(4);
        PRESENTSTAGEQUERIES = layout.offsetof(5);
        TARGETTIMEDOMAINPRESENTSTAGE = layout.offsetof(6);
    }

    protected VkPresentTimingInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPresentTimingInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPresentTimingInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkPresentTimingInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPresentTimingInfoEXT(ByteBuffer container) {
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
    /** @return the value of the {@code flags} field. */
    @NativeType("VkPresentTimingInfoFlagsEXT")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code targetTime} field. */
    @NativeType("uint64_t")
    public long targetTime() { return ntargetTime(address()); }
    /** @return the value of the {@code timeDomainId} field. */
    @NativeType("uint64_t")
    public long timeDomainId() { return ntimeDomainId(address()); }
    /** @return the value of the {@code presentStageQueries} field. */
    @NativeType("VkPresentStageFlagsEXT")
    public int presentStageQueries() { return npresentStageQueries(address()); }
    /** @return the value of the {@code targetTimeDomainPresentStage} field. */
    @NativeType("VkPresentStageFlagsEXT")
    public int targetTimeDomainPresentStage() { return ntargetTimeDomainPresentStage(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPresentTimingInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTPresentTiming#VK_STRUCTURE_TYPE_PRESENT_TIMING_INFO_EXT STRUCTURE_TYPE_PRESENT_TIMING_INFO_EXT} value to the {@code sType} field. */
    public VkPresentTimingInfoEXT sType$Default() { return sType(EXTPresentTiming.VK_STRUCTURE_TYPE_PRESENT_TIMING_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPresentTimingInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkPresentTimingInfoEXT flags(@NativeType("VkPresentTimingInfoFlagsEXT") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code targetTime} field. */
    public VkPresentTimingInfoEXT targetTime(@NativeType("uint64_t") long value) { ntargetTime(address(), value); return this; }
    /** Sets the specified value to the {@code timeDomainId} field. */
    public VkPresentTimingInfoEXT timeDomainId(@NativeType("uint64_t") long value) { ntimeDomainId(address(), value); return this; }
    /** Sets the specified value to the {@code presentStageQueries} field. */
    public VkPresentTimingInfoEXT presentStageQueries(@NativeType("VkPresentStageFlagsEXT") int value) { npresentStageQueries(address(), value); return this; }
    /** Sets the specified value to the {@code targetTimeDomainPresentStage} field. */
    public VkPresentTimingInfoEXT targetTimeDomainPresentStage(@NativeType("VkPresentStageFlagsEXT") int value) { ntargetTimeDomainPresentStage(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPresentTimingInfoEXT set(
        int sType,
        long pNext,
        int flags,
        long targetTime,
        long timeDomainId,
        int presentStageQueries,
        int targetTimeDomainPresentStage
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        targetTime(targetTime);
        timeDomainId(timeDomainId);
        presentStageQueries(presentStageQueries);
        targetTimeDomainPresentStage(targetTimeDomainPresentStage);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPresentTimingInfoEXT set(VkPresentTimingInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPresentTimingInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPresentTimingInfoEXT malloc() {
        return new VkPresentTimingInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPresentTimingInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPresentTimingInfoEXT calloc() {
        return new VkPresentTimingInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPresentTimingInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkPresentTimingInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPresentTimingInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPresentTimingInfoEXT} instance for the specified memory address. */
    public static VkPresentTimingInfoEXT create(long address) {
        return new VkPresentTimingInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPresentTimingInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkPresentTimingInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkPresentTimingInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentTimingInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPresentTimingInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentTimingInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPresentTimingInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentTimingInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPresentTimingInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPresentTimingInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPresentTimingInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPresentTimingInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPresentTimingInfoEXT malloc(MemoryStack stack) {
        return new VkPresentTimingInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPresentTimingInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPresentTimingInfoEXT calloc(MemoryStack stack) {
        return new VkPresentTimingInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPresentTimingInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPresentTimingInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPresentTimingInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPresentTimingInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPresentTimingInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPresentTimingInfoEXT.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkPresentTimingInfoEXT.FLAGS); }
    /** Unsafe version of {@link #targetTime}. */
    public static long ntargetTime(long struct) { return memGetLong(struct + VkPresentTimingInfoEXT.TARGETTIME); }
    /** Unsafe version of {@link #timeDomainId}. */
    public static long ntimeDomainId(long struct) { return memGetLong(struct + VkPresentTimingInfoEXT.TIMEDOMAINID); }
    /** Unsafe version of {@link #presentStageQueries}. */
    public static int npresentStageQueries(long struct) { return memGetInt(struct + VkPresentTimingInfoEXT.PRESENTSTAGEQUERIES); }
    /** Unsafe version of {@link #targetTimeDomainPresentStage}. */
    public static int ntargetTimeDomainPresentStage(long struct) { return memGetInt(struct + VkPresentTimingInfoEXT.TARGETTIMEDOMAINPRESENTSTAGE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPresentTimingInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPresentTimingInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkPresentTimingInfoEXT.FLAGS, value); }
    /** Unsafe version of {@link #targetTime(long) targetTime}. */
    public static void ntargetTime(long struct, long value) { memPutLong(struct + VkPresentTimingInfoEXT.TARGETTIME, value); }
    /** Unsafe version of {@link #timeDomainId(long) timeDomainId}. */
    public static void ntimeDomainId(long struct, long value) { memPutLong(struct + VkPresentTimingInfoEXT.TIMEDOMAINID, value); }
    /** Unsafe version of {@link #presentStageQueries(int) presentStageQueries}. */
    public static void npresentStageQueries(long struct, int value) { memPutInt(struct + VkPresentTimingInfoEXT.PRESENTSTAGEQUERIES, value); }
    /** Unsafe version of {@link #targetTimeDomainPresentStage(int) targetTimeDomainPresentStage}. */
    public static void ntargetTimeDomainPresentStage(long struct, int value) { memPutInt(struct + VkPresentTimingInfoEXT.TARGETTIMEDOMAINPRESENTSTAGE, value); }

    // -----------------------------------

    /** An array of {@link VkPresentTimingInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkPresentTimingInfoEXT, Buffer> implements NativeResource {

        private static final VkPresentTimingInfoEXT ELEMENT_FACTORY = VkPresentTimingInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkPresentTimingInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPresentTimingInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPresentTimingInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPresentTimingInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPresentTimingInfoEXT.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkPresentTimingInfoFlagsEXT")
        public int flags() { return VkPresentTimingInfoEXT.nflags(address()); }
        /** @return the value of the {@code targetTime} field. */
        @NativeType("uint64_t")
        public long targetTime() { return VkPresentTimingInfoEXT.ntargetTime(address()); }
        /** @return the value of the {@code timeDomainId} field. */
        @NativeType("uint64_t")
        public long timeDomainId() { return VkPresentTimingInfoEXT.ntimeDomainId(address()); }
        /** @return the value of the {@code presentStageQueries} field. */
        @NativeType("VkPresentStageFlagsEXT")
        public int presentStageQueries() { return VkPresentTimingInfoEXT.npresentStageQueries(address()); }
        /** @return the value of the {@code targetTimeDomainPresentStage} field. */
        @NativeType("VkPresentStageFlagsEXT")
        public int targetTimeDomainPresentStage() { return VkPresentTimingInfoEXT.ntargetTimeDomainPresentStage(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPresentTimingInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPresentTimingInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTPresentTiming#VK_STRUCTURE_TYPE_PRESENT_TIMING_INFO_EXT STRUCTURE_TYPE_PRESENT_TIMING_INFO_EXT} value to the {@code sType} field. */
        public VkPresentTimingInfoEXT.Buffer sType$Default() { return sType(EXTPresentTiming.VK_STRUCTURE_TYPE_PRESENT_TIMING_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPresentTimingInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkPresentTimingInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkPresentTimingInfoEXT.Buffer flags(@NativeType("VkPresentTimingInfoFlagsEXT") int value) { VkPresentTimingInfoEXT.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code targetTime} field. */
        public VkPresentTimingInfoEXT.Buffer targetTime(@NativeType("uint64_t") long value) { VkPresentTimingInfoEXT.ntargetTime(address(), value); return this; }
        /** Sets the specified value to the {@code timeDomainId} field. */
        public VkPresentTimingInfoEXT.Buffer timeDomainId(@NativeType("uint64_t") long value) { VkPresentTimingInfoEXT.ntimeDomainId(address(), value); return this; }
        /** Sets the specified value to the {@code presentStageQueries} field. */
        public VkPresentTimingInfoEXT.Buffer presentStageQueries(@NativeType("VkPresentStageFlagsEXT") int value) { VkPresentTimingInfoEXT.npresentStageQueries(address(), value); return this; }
        /** Sets the specified value to the {@code targetTimeDomainPresentStage} field. */
        public VkPresentTimingInfoEXT.Buffer targetTimeDomainPresentStage(@NativeType("VkPresentStageFlagsEXT") int value) { VkPresentTimingInfoEXT.ntargetTimeDomainPresentStage(address(), value); return this; }

    }

}