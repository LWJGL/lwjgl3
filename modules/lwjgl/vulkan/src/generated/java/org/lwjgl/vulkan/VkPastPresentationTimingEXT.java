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
 * <pre><code>
 * struct VkPastPresentationTimingEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint64_t presentId;
 *     uint64_t targetTime;
 *     uint32_t presentStageCount;
 *     {@link VkPresentStageTimeEXT VkPresentStageTimeEXT} * pPresentStages;
 *     VkTimeDomainKHR timeDomain;
 *     uint64_t timeDomainId;
 *     VkBool32 reportComplete;
 * }</code></pre>
 */
public class VkPastPresentationTimingEXT extends Struct<VkPastPresentationTimingEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PRESENTID,
        TARGETTIME,
        PRESENTSTAGECOUNT,
        PPRESENTSTAGES,
        TIMEDOMAIN,
        TIMEDOMAINID,
        REPORTCOMPLETE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PRESENTID = layout.offsetof(2);
        TARGETTIME = layout.offsetof(3);
        PRESENTSTAGECOUNT = layout.offsetof(4);
        PPRESENTSTAGES = layout.offsetof(5);
        TIMEDOMAIN = layout.offsetof(6);
        TIMEDOMAINID = layout.offsetof(7);
        REPORTCOMPLETE = layout.offsetof(8);
    }

    protected VkPastPresentationTimingEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPastPresentationTimingEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPastPresentationTimingEXT(address, container);
    }

    /**
     * Creates a {@code VkPastPresentationTimingEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPastPresentationTimingEXT(ByteBuffer container) {
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
    /** @return the value of the {@code presentId} field. */
    @NativeType("uint64_t")
    public long presentId() { return npresentId(address()); }
    /** @return the value of the {@code targetTime} field. */
    @NativeType("uint64_t")
    public long targetTime() { return ntargetTime(address()); }
    /** @return the value of the {@code presentStageCount} field. */
    @NativeType("uint32_t")
    public int presentStageCount() { return npresentStageCount(address()); }
    /** @return a {@link VkPresentStageTimeEXT.Buffer} view of the struct array pointed to by the {@code pPresentStages} field. */
    @NativeType("VkPresentStageTimeEXT *")
    public VkPresentStageTimeEXT.Buffer pPresentStages() { return npPresentStages(address()); }
    /** @return the value of the {@code timeDomain} field. */
    @NativeType("VkTimeDomainKHR")
    public int timeDomain() { return ntimeDomain(address()); }
    /** @return the value of the {@code timeDomainId} field. */
    @NativeType("uint64_t")
    public long timeDomainId() { return ntimeDomainId(address()); }
    /** @return the value of the {@code reportComplete} field. */
    @NativeType("VkBool32")
    public boolean reportComplete() { return nreportComplete(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPastPresentationTimingEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTPresentTiming#VK_STRUCTURE_TYPE_PAST_PRESENTATION_TIMING_EXT STRUCTURE_TYPE_PAST_PRESENTATION_TIMING_EXT} value to the {@code sType} field. */
    public VkPastPresentationTimingEXT sType$Default() { return sType(EXTPresentTiming.VK_STRUCTURE_TYPE_PAST_PRESENTATION_TIMING_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPastPresentationTimingEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code presentId} field. */
    public VkPastPresentationTimingEXT presentId(@NativeType("uint64_t") long value) { npresentId(address(), value); return this; }
    /** Sets the specified value to the {@code targetTime} field. */
    public VkPastPresentationTimingEXT targetTime(@NativeType("uint64_t") long value) { ntargetTime(address(), value); return this; }
    /** Sets the address of the specified {@link VkPresentStageTimeEXT.Buffer} to the {@code pPresentStages} field. */
    public VkPastPresentationTimingEXT pPresentStages(@NativeType("VkPresentStageTimeEXT *") VkPresentStageTimeEXT.Buffer value) { npPresentStages(address(), value); return this; }
    /** Sets the specified value to the {@code timeDomain} field. */
    public VkPastPresentationTimingEXT timeDomain(@NativeType("VkTimeDomainKHR") int value) { ntimeDomain(address(), value); return this; }
    /** Sets the specified value to the {@code timeDomainId} field. */
    public VkPastPresentationTimingEXT timeDomainId(@NativeType("uint64_t") long value) { ntimeDomainId(address(), value); return this; }
    /** Sets the specified value to the {@code reportComplete} field. */
    public VkPastPresentationTimingEXT reportComplete(@NativeType("VkBool32") boolean value) { nreportComplete(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPastPresentationTimingEXT set(
        int sType,
        long pNext,
        long presentId,
        long targetTime,
        VkPresentStageTimeEXT.Buffer pPresentStages,
        int timeDomain,
        long timeDomainId,
        boolean reportComplete
    ) {
        sType(sType);
        pNext(pNext);
        presentId(presentId);
        targetTime(targetTime);
        pPresentStages(pPresentStages);
        timeDomain(timeDomain);
        timeDomainId(timeDomainId);
        reportComplete(reportComplete);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPastPresentationTimingEXT set(VkPastPresentationTimingEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPastPresentationTimingEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPastPresentationTimingEXT malloc() {
        return new VkPastPresentationTimingEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPastPresentationTimingEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPastPresentationTimingEXT calloc() {
        return new VkPastPresentationTimingEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPastPresentationTimingEXT} instance allocated with {@link BufferUtils}. */
    public static VkPastPresentationTimingEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPastPresentationTimingEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPastPresentationTimingEXT} instance for the specified memory address. */
    public static VkPastPresentationTimingEXT create(long address) {
        return new VkPastPresentationTimingEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPastPresentationTimingEXT createSafe(long address) {
        return address == NULL ? null : new VkPastPresentationTimingEXT(address, null);
    }

    /**
     * Returns a new {@link VkPastPresentationTimingEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPastPresentationTimingEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPastPresentationTimingEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPastPresentationTimingEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPastPresentationTimingEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPastPresentationTimingEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPastPresentationTimingEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPastPresentationTimingEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPastPresentationTimingEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPastPresentationTimingEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPastPresentationTimingEXT malloc(MemoryStack stack) {
        return new VkPastPresentationTimingEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPastPresentationTimingEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPastPresentationTimingEXT calloc(MemoryStack stack) {
        return new VkPastPresentationTimingEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPastPresentationTimingEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPastPresentationTimingEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPastPresentationTimingEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPastPresentationTimingEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPastPresentationTimingEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPastPresentationTimingEXT.PNEXT); }
    /** Unsafe version of {@link #presentId}. */
    public static long npresentId(long struct) { return memGetLong(struct + VkPastPresentationTimingEXT.PRESENTID); }
    /** Unsafe version of {@link #targetTime}. */
    public static long ntargetTime(long struct) { return memGetLong(struct + VkPastPresentationTimingEXT.TARGETTIME); }
    /** Unsafe version of {@link #presentStageCount}. */
    public static int npresentStageCount(long struct) { return memGetInt(struct + VkPastPresentationTimingEXT.PRESENTSTAGECOUNT); }
    /** Unsafe version of {@link #pPresentStages}. */
    public static VkPresentStageTimeEXT.Buffer npPresentStages(long struct) { return VkPresentStageTimeEXT.create(memGetAddress(struct + VkPastPresentationTimingEXT.PPRESENTSTAGES), npresentStageCount(struct)); }
    /** Unsafe version of {@link #timeDomain}. */
    public static int ntimeDomain(long struct) { return memGetInt(struct + VkPastPresentationTimingEXT.TIMEDOMAIN); }
    /** Unsafe version of {@link #timeDomainId}. */
    public static long ntimeDomainId(long struct) { return memGetLong(struct + VkPastPresentationTimingEXT.TIMEDOMAINID); }
    /** Unsafe version of {@link #reportComplete}. */
    public static int nreportComplete(long struct) { return memGetInt(struct + VkPastPresentationTimingEXT.REPORTCOMPLETE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPastPresentationTimingEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPastPresentationTimingEXT.PNEXT, value); }
    /** Unsafe version of {@link #presentId(long) presentId}. */
    public static void npresentId(long struct, long value) { memPutLong(struct + VkPastPresentationTimingEXT.PRESENTID, value); }
    /** Unsafe version of {@link #targetTime(long) targetTime}. */
    public static void ntargetTime(long struct, long value) { memPutLong(struct + VkPastPresentationTimingEXT.TARGETTIME, value); }
    /** Sets the specified value to the {@code presentStageCount} field of the specified {@code struct}. */
    public static void npresentStageCount(long struct, int value) { memPutInt(struct + VkPastPresentationTimingEXT.PRESENTSTAGECOUNT, value); }
    /** Unsafe version of {@link #pPresentStages(VkPresentStageTimeEXT.Buffer) pPresentStages}. */
    public static void npPresentStages(long struct, VkPresentStageTimeEXT.Buffer value) { memPutAddress(struct + VkPastPresentationTimingEXT.PPRESENTSTAGES, value.address()); npresentStageCount(struct, value.remaining()); }
    /** Unsafe version of {@link #timeDomain(int) timeDomain}. */
    public static void ntimeDomain(long struct, int value) { memPutInt(struct + VkPastPresentationTimingEXT.TIMEDOMAIN, value); }
    /** Unsafe version of {@link #timeDomainId(long) timeDomainId}. */
    public static void ntimeDomainId(long struct, long value) { memPutLong(struct + VkPastPresentationTimingEXT.TIMEDOMAINID, value); }
    /** Unsafe version of {@link #reportComplete(boolean) reportComplete}. */
    public static void nreportComplete(long struct, int value) { memPutInt(struct + VkPastPresentationTimingEXT.REPORTCOMPLETE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkPastPresentationTimingEXT.PPRESENTSTAGES));
    }

    // -----------------------------------

    /** An array of {@link VkPastPresentationTimingEXT} structs. */
    public static class Buffer extends StructBuffer<VkPastPresentationTimingEXT, Buffer> implements NativeResource {

        private static final VkPastPresentationTimingEXT ELEMENT_FACTORY = VkPastPresentationTimingEXT.create(-1L);

        /**
         * Creates a new {@code VkPastPresentationTimingEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPastPresentationTimingEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPastPresentationTimingEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPastPresentationTimingEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPastPresentationTimingEXT.npNext(address()); }
        /** @return the value of the {@code presentId} field. */
        @NativeType("uint64_t")
        public long presentId() { return VkPastPresentationTimingEXT.npresentId(address()); }
        /** @return the value of the {@code targetTime} field. */
        @NativeType("uint64_t")
        public long targetTime() { return VkPastPresentationTimingEXT.ntargetTime(address()); }
        /** @return the value of the {@code presentStageCount} field. */
        @NativeType("uint32_t")
        public int presentStageCount() { return VkPastPresentationTimingEXT.npresentStageCount(address()); }
        /** @return a {@link VkPresentStageTimeEXT.Buffer} view of the struct array pointed to by the {@code pPresentStages} field. */
        @NativeType("VkPresentStageTimeEXT *")
        public VkPresentStageTimeEXT.Buffer pPresentStages() { return VkPastPresentationTimingEXT.npPresentStages(address()); }
        /** @return the value of the {@code timeDomain} field. */
        @NativeType("VkTimeDomainKHR")
        public int timeDomain() { return VkPastPresentationTimingEXT.ntimeDomain(address()); }
        /** @return the value of the {@code timeDomainId} field. */
        @NativeType("uint64_t")
        public long timeDomainId() { return VkPastPresentationTimingEXT.ntimeDomainId(address()); }
        /** @return the value of the {@code reportComplete} field. */
        @NativeType("VkBool32")
        public boolean reportComplete() { return VkPastPresentationTimingEXT.nreportComplete(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPastPresentationTimingEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPastPresentationTimingEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTPresentTiming#VK_STRUCTURE_TYPE_PAST_PRESENTATION_TIMING_EXT STRUCTURE_TYPE_PAST_PRESENTATION_TIMING_EXT} value to the {@code sType} field. */
        public VkPastPresentationTimingEXT.Buffer sType$Default() { return sType(EXTPresentTiming.VK_STRUCTURE_TYPE_PAST_PRESENTATION_TIMING_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPastPresentationTimingEXT.Buffer pNext(@NativeType("void *") long value) { VkPastPresentationTimingEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code presentId} field. */
        public VkPastPresentationTimingEXT.Buffer presentId(@NativeType("uint64_t") long value) { VkPastPresentationTimingEXT.npresentId(address(), value); return this; }
        /** Sets the specified value to the {@code targetTime} field. */
        public VkPastPresentationTimingEXT.Buffer targetTime(@NativeType("uint64_t") long value) { VkPastPresentationTimingEXT.ntargetTime(address(), value); return this; }
        /** Sets the address of the specified {@link VkPresentStageTimeEXT.Buffer} to the {@code pPresentStages} field. */
        public VkPastPresentationTimingEXT.Buffer pPresentStages(@NativeType("VkPresentStageTimeEXT *") VkPresentStageTimeEXT.Buffer value) { VkPastPresentationTimingEXT.npPresentStages(address(), value); return this; }
        /** Sets the specified value to the {@code timeDomain} field. */
        public VkPastPresentationTimingEXT.Buffer timeDomain(@NativeType("VkTimeDomainKHR") int value) { VkPastPresentationTimingEXT.ntimeDomain(address(), value); return this; }
        /** Sets the specified value to the {@code timeDomainId} field. */
        public VkPastPresentationTimingEXT.Buffer timeDomainId(@NativeType("uint64_t") long value) { VkPastPresentationTimingEXT.ntimeDomainId(address(), value); return this; }
        /** Sets the specified value to the {@code reportComplete} field. */
        public VkPastPresentationTimingEXT.Buffer reportComplete(@NativeType("VkBool32") boolean value) { VkPastPresentationTimingEXT.nreportComplete(address(), value ? 1 : 0); return this; }

    }

}