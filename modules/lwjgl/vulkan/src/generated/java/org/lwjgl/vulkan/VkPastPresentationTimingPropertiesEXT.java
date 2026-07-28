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
 * <pre><code>
 * struct VkPastPresentationTimingPropertiesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint64_t timingPropertiesCounter;
 *     uint64_t timeDomainsCounter;
 *     uint32_t presentationTimingCount;
 *     {@link VkPastPresentationTimingEXT VkPastPresentationTimingEXT} * pPresentationTimings;
 * }</code></pre>
 */
public class VkPastPresentationTimingPropertiesEXT extends Struct<VkPastPresentationTimingPropertiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        TIMINGPROPERTIESCOUNTER,
        TIMEDOMAINSCOUNTER,
        PRESENTATIONTIMINGCOUNT,
        PPRESENTATIONTIMINGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TIMINGPROPERTIESCOUNTER = layout.offsetof(2);
        TIMEDOMAINSCOUNTER = layout.offsetof(3);
        PRESENTATIONTIMINGCOUNT = layout.offsetof(4);
        PPRESENTATIONTIMINGS = layout.offsetof(5);
    }

    protected VkPastPresentationTimingPropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPastPresentationTimingPropertiesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPastPresentationTimingPropertiesEXT(address, container);
    }

    /**
     * Creates a {@code VkPastPresentationTimingPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPastPresentationTimingPropertiesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code timingPropertiesCounter} field. */
    @NativeType("uint64_t")
    public long timingPropertiesCounter() { return ntimingPropertiesCounter(address()); }
    /** @return the value of the {@code timeDomainsCounter} field. */
    @NativeType("uint64_t")
    public long timeDomainsCounter() { return ntimeDomainsCounter(address()); }
    /** @return the value of the {@code presentationTimingCount} field. */
    @NativeType("uint32_t")
    public int presentationTimingCount() { return npresentationTimingCount(address()); }
    /** @return a {@link VkPastPresentationTimingEXT.Buffer} view of the struct array pointed to by the {@code pPresentationTimings} field. */
    @NativeType("VkPastPresentationTimingEXT *")
    public VkPastPresentationTimingEXT.Buffer pPresentationTimings() { return npPresentationTimings(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPastPresentationTimingPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTPresentTiming#VK_STRUCTURE_TYPE_PAST_PRESENTATION_TIMING_PROPERTIES_EXT STRUCTURE_TYPE_PAST_PRESENTATION_TIMING_PROPERTIES_EXT} value to the {@code sType} field. */
    public VkPastPresentationTimingPropertiesEXT sType$Default() { return sType(EXTPresentTiming.VK_STRUCTURE_TYPE_PAST_PRESENTATION_TIMING_PROPERTIES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPastPresentationTimingPropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPastPresentationTimingPropertiesEXT set(
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
    public VkPastPresentationTimingPropertiesEXT set(VkPastPresentationTimingPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPastPresentationTimingPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPastPresentationTimingPropertiesEXT malloc() {
        return new VkPastPresentationTimingPropertiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPastPresentationTimingPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPastPresentationTimingPropertiesEXT calloc() {
        return new VkPastPresentationTimingPropertiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPastPresentationTimingPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPastPresentationTimingPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPastPresentationTimingPropertiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPastPresentationTimingPropertiesEXT} instance for the specified memory address. */
    public static VkPastPresentationTimingPropertiesEXT create(long address) {
        return new VkPastPresentationTimingPropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPastPresentationTimingPropertiesEXT createSafe(long address) {
        return address == NULL ? null : new VkPastPresentationTimingPropertiesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPastPresentationTimingPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPastPresentationTimingPropertiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPastPresentationTimingPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPastPresentationTimingPropertiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPastPresentationTimingPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPastPresentationTimingPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPastPresentationTimingPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPastPresentationTimingPropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPastPresentationTimingPropertiesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPastPresentationTimingPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPastPresentationTimingPropertiesEXT malloc(MemoryStack stack) {
        return new VkPastPresentationTimingPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPastPresentationTimingPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPastPresentationTimingPropertiesEXT calloc(MemoryStack stack) {
        return new VkPastPresentationTimingPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPastPresentationTimingPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPastPresentationTimingPropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPastPresentationTimingPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPastPresentationTimingPropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPastPresentationTimingPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPastPresentationTimingPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #timingPropertiesCounter}. */
    public static long ntimingPropertiesCounter(long struct) { return memGetLong(struct + VkPastPresentationTimingPropertiesEXT.TIMINGPROPERTIESCOUNTER); }
    /** Unsafe version of {@link #timeDomainsCounter}. */
    public static long ntimeDomainsCounter(long struct) { return memGetLong(struct + VkPastPresentationTimingPropertiesEXT.TIMEDOMAINSCOUNTER); }
    /** Unsafe version of {@link #presentationTimingCount}. */
    public static int npresentationTimingCount(long struct) { return memGetInt(struct + VkPastPresentationTimingPropertiesEXT.PRESENTATIONTIMINGCOUNT); }
    /** Unsafe version of {@link #pPresentationTimings}. */
    public static VkPastPresentationTimingEXT.Buffer npPresentationTimings(long struct) { return VkPastPresentationTimingEXT.create(memGetAddress(struct + VkPastPresentationTimingPropertiesEXT.PPRESENTATIONTIMINGS), npresentationTimingCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPastPresentationTimingPropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPastPresentationTimingPropertiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPastPresentationTimingPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPastPresentationTimingPropertiesEXT, Buffer> implements NativeResource {

        private static final VkPastPresentationTimingPropertiesEXT ELEMENT_FACTORY = VkPastPresentationTimingPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkPastPresentationTimingPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPastPresentationTimingPropertiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPastPresentationTimingPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPastPresentationTimingPropertiesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPastPresentationTimingPropertiesEXT.npNext(address()); }
        /** @return the value of the {@code timingPropertiesCounter} field. */
        @NativeType("uint64_t")
        public long timingPropertiesCounter() { return VkPastPresentationTimingPropertiesEXT.ntimingPropertiesCounter(address()); }
        /** @return the value of the {@code timeDomainsCounter} field. */
        @NativeType("uint64_t")
        public long timeDomainsCounter() { return VkPastPresentationTimingPropertiesEXT.ntimeDomainsCounter(address()); }
        /** @return the value of the {@code presentationTimingCount} field. */
        @NativeType("uint32_t")
        public int presentationTimingCount() { return VkPastPresentationTimingPropertiesEXT.npresentationTimingCount(address()); }
        /** @return a {@link VkPastPresentationTimingEXT.Buffer} view of the struct array pointed to by the {@code pPresentationTimings} field. */
        @NativeType("VkPastPresentationTimingEXT *")
        public VkPastPresentationTimingEXT.Buffer pPresentationTimings() { return VkPastPresentationTimingPropertiesEXT.npPresentationTimings(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPastPresentationTimingPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPastPresentationTimingPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTPresentTiming#VK_STRUCTURE_TYPE_PAST_PRESENTATION_TIMING_PROPERTIES_EXT STRUCTURE_TYPE_PAST_PRESENTATION_TIMING_PROPERTIES_EXT} value to the {@code sType} field. */
        public VkPastPresentationTimingPropertiesEXT.Buffer sType$Default() { return sType(EXTPresentTiming.VK_STRUCTURE_TYPE_PAST_PRESENTATION_TIMING_PROPERTIES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPastPresentationTimingPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPastPresentationTimingPropertiesEXT.npNext(address(), value); return this; }

    }

}