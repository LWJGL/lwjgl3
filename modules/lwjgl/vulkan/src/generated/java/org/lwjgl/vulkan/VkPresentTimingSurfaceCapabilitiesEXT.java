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
 * struct VkPresentTimingSurfaceCapabilitiesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 presentTimingSupported;
 *     VkBool32 presentAtAbsoluteTimeSupported;
 *     VkBool32 presentAtRelativeTimeSupported;
 *     VkPresentStageFlagsEXT presentStageQueries;
 * }}</pre>
 */
public class VkPresentTimingSurfaceCapabilitiesEXT extends Struct<VkPresentTimingSurfaceCapabilitiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PRESENTTIMINGSUPPORTED,
        PRESENTATABSOLUTETIMESUPPORTED,
        PRESENTATRELATIVETIMESUPPORTED,
        PRESENTSTAGEQUERIES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PRESENTTIMINGSUPPORTED = layout.offsetof(2);
        PRESENTATABSOLUTETIMESUPPORTED = layout.offsetof(3);
        PRESENTATRELATIVETIMESUPPORTED = layout.offsetof(4);
        PRESENTSTAGEQUERIES = layout.offsetof(5);
    }

    protected VkPresentTimingSurfaceCapabilitiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPresentTimingSurfaceCapabilitiesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPresentTimingSurfaceCapabilitiesEXT(address, container);
    }

    /**
     * Creates a {@code VkPresentTimingSurfaceCapabilitiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPresentTimingSurfaceCapabilitiesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code presentTimingSupported} field. */
    @NativeType("VkBool32")
    public boolean presentTimingSupported() { return npresentTimingSupported(address()) != 0; }
    /** @return the value of the {@code presentAtAbsoluteTimeSupported} field. */
    @NativeType("VkBool32")
    public boolean presentAtAbsoluteTimeSupported() { return npresentAtAbsoluteTimeSupported(address()) != 0; }
    /** @return the value of the {@code presentAtRelativeTimeSupported} field. */
    @NativeType("VkBool32")
    public boolean presentAtRelativeTimeSupported() { return npresentAtRelativeTimeSupported(address()) != 0; }
    /** @return the value of the {@code presentStageQueries} field. */
    @NativeType("VkPresentStageFlagsEXT")
    public int presentStageQueries() { return npresentStageQueries(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPresentTimingSurfaceCapabilitiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTPresentTiming#VK_STRUCTURE_TYPE_PRESENT_TIMING_SURFACE_CAPABILITIES_EXT STRUCTURE_TYPE_PRESENT_TIMING_SURFACE_CAPABILITIES_EXT} value to the {@code sType} field. */
    public VkPresentTimingSurfaceCapabilitiesEXT sType$Default() { return sType(EXTPresentTiming.VK_STRUCTURE_TYPE_PRESENT_TIMING_SURFACE_CAPABILITIES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPresentTimingSurfaceCapabilitiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code presentTimingSupported} field. */
    public VkPresentTimingSurfaceCapabilitiesEXT presentTimingSupported(@NativeType("VkBool32") boolean value) { npresentTimingSupported(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code presentAtAbsoluteTimeSupported} field. */
    public VkPresentTimingSurfaceCapabilitiesEXT presentAtAbsoluteTimeSupported(@NativeType("VkBool32") boolean value) { npresentAtAbsoluteTimeSupported(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code presentAtRelativeTimeSupported} field. */
    public VkPresentTimingSurfaceCapabilitiesEXT presentAtRelativeTimeSupported(@NativeType("VkBool32") boolean value) { npresentAtRelativeTimeSupported(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code presentStageQueries} field. */
    public VkPresentTimingSurfaceCapabilitiesEXT presentStageQueries(@NativeType("VkPresentStageFlagsEXT") int value) { npresentStageQueries(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPresentTimingSurfaceCapabilitiesEXT set(
        int sType,
        long pNext,
        boolean presentTimingSupported,
        boolean presentAtAbsoluteTimeSupported,
        boolean presentAtRelativeTimeSupported,
        int presentStageQueries
    ) {
        sType(sType);
        pNext(pNext);
        presentTimingSupported(presentTimingSupported);
        presentAtAbsoluteTimeSupported(presentAtAbsoluteTimeSupported);
        presentAtRelativeTimeSupported(presentAtRelativeTimeSupported);
        presentStageQueries(presentStageQueries);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPresentTimingSurfaceCapabilitiesEXT set(VkPresentTimingSurfaceCapabilitiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPresentTimingSurfaceCapabilitiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPresentTimingSurfaceCapabilitiesEXT malloc() {
        return new VkPresentTimingSurfaceCapabilitiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPresentTimingSurfaceCapabilitiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPresentTimingSurfaceCapabilitiesEXT calloc() {
        return new VkPresentTimingSurfaceCapabilitiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPresentTimingSurfaceCapabilitiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPresentTimingSurfaceCapabilitiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPresentTimingSurfaceCapabilitiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPresentTimingSurfaceCapabilitiesEXT} instance for the specified memory address. */
    public static VkPresentTimingSurfaceCapabilitiesEXT create(long address) {
        return new VkPresentTimingSurfaceCapabilitiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPresentTimingSurfaceCapabilitiesEXT createSafe(long address) {
        return address == NULL ? null : new VkPresentTimingSurfaceCapabilitiesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPresentTimingSurfaceCapabilitiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentTimingSurfaceCapabilitiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPresentTimingSurfaceCapabilitiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentTimingSurfaceCapabilitiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPresentTimingSurfaceCapabilitiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentTimingSurfaceCapabilitiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPresentTimingSurfaceCapabilitiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPresentTimingSurfaceCapabilitiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPresentTimingSurfaceCapabilitiesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPresentTimingSurfaceCapabilitiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPresentTimingSurfaceCapabilitiesEXT malloc(MemoryStack stack) {
        return new VkPresentTimingSurfaceCapabilitiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPresentTimingSurfaceCapabilitiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPresentTimingSurfaceCapabilitiesEXT calloc(MemoryStack stack) {
        return new VkPresentTimingSurfaceCapabilitiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPresentTimingSurfaceCapabilitiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPresentTimingSurfaceCapabilitiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPresentTimingSurfaceCapabilitiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPresentTimingSurfaceCapabilitiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPresentTimingSurfaceCapabilitiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPresentTimingSurfaceCapabilitiesEXT.PNEXT); }
    /** Unsafe version of {@link #presentTimingSupported}. */
    public static int npresentTimingSupported(long struct) { return memGetInt(struct + VkPresentTimingSurfaceCapabilitiesEXT.PRESENTTIMINGSUPPORTED); }
    /** Unsafe version of {@link #presentAtAbsoluteTimeSupported}. */
    public static int npresentAtAbsoluteTimeSupported(long struct) { return memGetInt(struct + VkPresentTimingSurfaceCapabilitiesEXT.PRESENTATABSOLUTETIMESUPPORTED); }
    /** Unsafe version of {@link #presentAtRelativeTimeSupported}. */
    public static int npresentAtRelativeTimeSupported(long struct) { return memGetInt(struct + VkPresentTimingSurfaceCapabilitiesEXT.PRESENTATRELATIVETIMESUPPORTED); }
    /** Unsafe version of {@link #presentStageQueries}. */
    public static int npresentStageQueries(long struct) { return memGetInt(struct + VkPresentTimingSurfaceCapabilitiesEXT.PRESENTSTAGEQUERIES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPresentTimingSurfaceCapabilitiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPresentTimingSurfaceCapabilitiesEXT.PNEXT, value); }
    /** Unsafe version of {@link #presentTimingSupported(boolean) presentTimingSupported}. */
    public static void npresentTimingSupported(long struct, int value) { memPutInt(struct + VkPresentTimingSurfaceCapabilitiesEXT.PRESENTTIMINGSUPPORTED, value); }
    /** Unsafe version of {@link #presentAtAbsoluteTimeSupported(boolean) presentAtAbsoluteTimeSupported}. */
    public static void npresentAtAbsoluteTimeSupported(long struct, int value) { memPutInt(struct + VkPresentTimingSurfaceCapabilitiesEXT.PRESENTATABSOLUTETIMESUPPORTED, value); }
    /** Unsafe version of {@link #presentAtRelativeTimeSupported(boolean) presentAtRelativeTimeSupported}. */
    public static void npresentAtRelativeTimeSupported(long struct, int value) { memPutInt(struct + VkPresentTimingSurfaceCapabilitiesEXT.PRESENTATRELATIVETIMESUPPORTED, value); }
    /** Unsafe version of {@link #presentStageQueries(int) presentStageQueries}. */
    public static void npresentStageQueries(long struct, int value) { memPutInt(struct + VkPresentTimingSurfaceCapabilitiesEXT.PRESENTSTAGEQUERIES, value); }

    // -----------------------------------

    /** An array of {@link VkPresentTimingSurfaceCapabilitiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPresentTimingSurfaceCapabilitiesEXT, Buffer> implements NativeResource {

        private static final VkPresentTimingSurfaceCapabilitiesEXT ELEMENT_FACTORY = VkPresentTimingSurfaceCapabilitiesEXT.create(-1L);

        /**
         * Creates a new {@code VkPresentTimingSurfaceCapabilitiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPresentTimingSurfaceCapabilitiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPresentTimingSurfaceCapabilitiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPresentTimingSurfaceCapabilitiesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPresentTimingSurfaceCapabilitiesEXT.npNext(address()); }
        /** @return the value of the {@code presentTimingSupported} field. */
        @NativeType("VkBool32")
        public boolean presentTimingSupported() { return VkPresentTimingSurfaceCapabilitiesEXT.npresentTimingSupported(address()) != 0; }
        /** @return the value of the {@code presentAtAbsoluteTimeSupported} field. */
        @NativeType("VkBool32")
        public boolean presentAtAbsoluteTimeSupported() { return VkPresentTimingSurfaceCapabilitiesEXT.npresentAtAbsoluteTimeSupported(address()) != 0; }
        /** @return the value of the {@code presentAtRelativeTimeSupported} field. */
        @NativeType("VkBool32")
        public boolean presentAtRelativeTimeSupported() { return VkPresentTimingSurfaceCapabilitiesEXT.npresentAtRelativeTimeSupported(address()) != 0; }
        /** @return the value of the {@code presentStageQueries} field. */
        @NativeType("VkPresentStageFlagsEXT")
        public int presentStageQueries() { return VkPresentTimingSurfaceCapabilitiesEXT.npresentStageQueries(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPresentTimingSurfaceCapabilitiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPresentTimingSurfaceCapabilitiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTPresentTiming#VK_STRUCTURE_TYPE_PRESENT_TIMING_SURFACE_CAPABILITIES_EXT STRUCTURE_TYPE_PRESENT_TIMING_SURFACE_CAPABILITIES_EXT} value to the {@code sType} field. */
        public VkPresentTimingSurfaceCapabilitiesEXT.Buffer sType$Default() { return sType(EXTPresentTiming.VK_STRUCTURE_TYPE_PRESENT_TIMING_SURFACE_CAPABILITIES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPresentTimingSurfaceCapabilitiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPresentTimingSurfaceCapabilitiesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code presentTimingSupported} field. */
        public VkPresentTimingSurfaceCapabilitiesEXT.Buffer presentTimingSupported(@NativeType("VkBool32") boolean value) { VkPresentTimingSurfaceCapabilitiesEXT.npresentTimingSupported(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code presentAtAbsoluteTimeSupported} field. */
        public VkPresentTimingSurfaceCapabilitiesEXT.Buffer presentAtAbsoluteTimeSupported(@NativeType("VkBool32") boolean value) { VkPresentTimingSurfaceCapabilitiesEXT.npresentAtAbsoluteTimeSupported(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code presentAtRelativeTimeSupported} field. */
        public VkPresentTimingSurfaceCapabilitiesEXT.Buffer presentAtRelativeTimeSupported(@NativeType("VkBool32") boolean value) { VkPresentTimingSurfaceCapabilitiesEXT.npresentAtRelativeTimeSupported(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code presentStageQueries} field. */
        public VkPresentTimingSurfaceCapabilitiesEXT.Buffer presentStageQueries(@NativeType("VkPresentStageFlagsEXT") int value) { VkPresentTimingSurfaceCapabilitiesEXT.npresentStageQueries(address(), value); return this; }

    }

}