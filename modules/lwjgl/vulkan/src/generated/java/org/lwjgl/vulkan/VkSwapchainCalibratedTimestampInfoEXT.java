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
 * struct VkSwapchainCalibratedTimestampInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkSwapchainKHR swapchain;
 *     VkPresentStageFlagsEXT presentStage;
 *     uint64_t timeDomainId;
 * }}</pre>
 */
public class VkSwapchainCalibratedTimestampInfoEXT extends Struct<VkSwapchainCalibratedTimestampInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SWAPCHAIN,
        PRESENTSTAGE,
        TIMEDOMAINID;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SWAPCHAIN = layout.offsetof(2);
        PRESENTSTAGE = layout.offsetof(3);
        TIMEDOMAINID = layout.offsetof(4);
    }

    protected VkSwapchainCalibratedTimestampInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSwapchainCalibratedTimestampInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkSwapchainCalibratedTimestampInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkSwapchainCalibratedTimestampInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSwapchainCalibratedTimestampInfoEXT(ByteBuffer container) {
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
    /** @return the value of the {@code swapchain} field. */
    @NativeType("VkSwapchainKHR")
    public long swapchain() { return nswapchain(address()); }
    /** @return the value of the {@code presentStage} field. */
    @NativeType("VkPresentStageFlagsEXT")
    public int presentStage() { return npresentStage(address()); }
    /** @return the value of the {@code timeDomainId} field. */
    @NativeType("uint64_t")
    public long timeDomainId() { return ntimeDomainId(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkSwapchainCalibratedTimestampInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTPresentTiming#VK_STRUCTURE_TYPE_SWAPCHAIN_CALIBRATED_TIMESTAMP_INFO_EXT STRUCTURE_TYPE_SWAPCHAIN_CALIBRATED_TIMESTAMP_INFO_EXT} value to the {@code sType} field. */
    public VkSwapchainCalibratedTimestampInfoEXT sType$Default() { return sType(EXTPresentTiming.VK_STRUCTURE_TYPE_SWAPCHAIN_CALIBRATED_TIMESTAMP_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSwapchainCalibratedTimestampInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code swapchain} field. */
    public VkSwapchainCalibratedTimestampInfoEXT swapchain(@NativeType("VkSwapchainKHR") long value) { nswapchain(address(), value); return this; }
    /** Sets the specified value to the {@code presentStage} field. */
    public VkSwapchainCalibratedTimestampInfoEXT presentStage(@NativeType("VkPresentStageFlagsEXT") int value) { npresentStage(address(), value); return this; }
    /** Sets the specified value to the {@code timeDomainId} field. */
    public VkSwapchainCalibratedTimestampInfoEXT timeDomainId(@NativeType("uint64_t") long value) { ntimeDomainId(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSwapchainCalibratedTimestampInfoEXT set(
        int sType,
        long pNext,
        long swapchain,
        int presentStage,
        long timeDomainId
    ) {
        sType(sType);
        pNext(pNext);
        swapchain(swapchain);
        presentStage(presentStage);
        timeDomainId(timeDomainId);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSwapchainCalibratedTimestampInfoEXT set(VkSwapchainCalibratedTimestampInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSwapchainCalibratedTimestampInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSwapchainCalibratedTimestampInfoEXT malloc() {
        return new VkSwapchainCalibratedTimestampInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSwapchainCalibratedTimestampInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSwapchainCalibratedTimestampInfoEXT calloc() {
        return new VkSwapchainCalibratedTimestampInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSwapchainCalibratedTimestampInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkSwapchainCalibratedTimestampInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSwapchainCalibratedTimestampInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkSwapchainCalibratedTimestampInfoEXT} instance for the specified memory address. */
    public static VkSwapchainCalibratedTimestampInfoEXT create(long address) {
        return new VkSwapchainCalibratedTimestampInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSwapchainCalibratedTimestampInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkSwapchainCalibratedTimestampInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkSwapchainCalibratedTimestampInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainCalibratedTimestampInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainCalibratedTimestampInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainCalibratedTimestampInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainCalibratedTimestampInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainCalibratedTimestampInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSwapchainCalibratedTimestampInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSwapchainCalibratedTimestampInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSwapchainCalibratedTimestampInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSwapchainCalibratedTimestampInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSwapchainCalibratedTimestampInfoEXT malloc(MemoryStack stack) {
        return new VkSwapchainCalibratedTimestampInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSwapchainCalibratedTimestampInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSwapchainCalibratedTimestampInfoEXT calloc(MemoryStack stack) {
        return new VkSwapchainCalibratedTimestampInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSwapchainCalibratedTimestampInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSwapchainCalibratedTimestampInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainCalibratedTimestampInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSwapchainCalibratedTimestampInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSwapchainCalibratedTimestampInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSwapchainCalibratedTimestampInfoEXT.PNEXT); }
    /** Unsafe version of {@link #swapchain}. */
    public static long nswapchain(long struct) { return memGetLong(struct + VkSwapchainCalibratedTimestampInfoEXT.SWAPCHAIN); }
    /** Unsafe version of {@link #presentStage}. */
    public static int npresentStage(long struct) { return memGetInt(struct + VkSwapchainCalibratedTimestampInfoEXT.PRESENTSTAGE); }
    /** Unsafe version of {@link #timeDomainId}. */
    public static long ntimeDomainId(long struct) { return memGetLong(struct + VkSwapchainCalibratedTimestampInfoEXT.TIMEDOMAINID); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSwapchainCalibratedTimestampInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSwapchainCalibratedTimestampInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #swapchain(long) swapchain}. */
    public static void nswapchain(long struct, long value) { memPutLong(struct + VkSwapchainCalibratedTimestampInfoEXT.SWAPCHAIN, value); }
    /** Unsafe version of {@link #presentStage(int) presentStage}. */
    public static void npresentStage(long struct, int value) { memPutInt(struct + VkSwapchainCalibratedTimestampInfoEXT.PRESENTSTAGE, value); }
    /** Unsafe version of {@link #timeDomainId(long) timeDomainId}. */
    public static void ntimeDomainId(long struct, long value) { memPutLong(struct + VkSwapchainCalibratedTimestampInfoEXT.TIMEDOMAINID, value); }

    // -----------------------------------

    /** An array of {@link VkSwapchainCalibratedTimestampInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkSwapchainCalibratedTimestampInfoEXT, Buffer> implements NativeResource {

        private static final VkSwapchainCalibratedTimestampInfoEXT ELEMENT_FACTORY = VkSwapchainCalibratedTimestampInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkSwapchainCalibratedTimestampInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSwapchainCalibratedTimestampInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSwapchainCalibratedTimestampInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSwapchainCalibratedTimestampInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSwapchainCalibratedTimestampInfoEXT.npNext(address()); }
        /** @return the value of the {@code swapchain} field. */
        @NativeType("VkSwapchainKHR")
        public long swapchain() { return VkSwapchainCalibratedTimestampInfoEXT.nswapchain(address()); }
        /** @return the value of the {@code presentStage} field. */
        @NativeType("VkPresentStageFlagsEXT")
        public int presentStage() { return VkSwapchainCalibratedTimestampInfoEXT.npresentStage(address()); }
        /** @return the value of the {@code timeDomainId} field. */
        @NativeType("uint64_t")
        public long timeDomainId() { return VkSwapchainCalibratedTimestampInfoEXT.ntimeDomainId(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkSwapchainCalibratedTimestampInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkSwapchainCalibratedTimestampInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTPresentTiming#VK_STRUCTURE_TYPE_SWAPCHAIN_CALIBRATED_TIMESTAMP_INFO_EXT STRUCTURE_TYPE_SWAPCHAIN_CALIBRATED_TIMESTAMP_INFO_EXT} value to the {@code sType} field. */
        public VkSwapchainCalibratedTimestampInfoEXT.Buffer sType$Default() { return sType(EXTPresentTiming.VK_STRUCTURE_TYPE_SWAPCHAIN_CALIBRATED_TIMESTAMP_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSwapchainCalibratedTimestampInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkSwapchainCalibratedTimestampInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code swapchain} field. */
        public VkSwapchainCalibratedTimestampInfoEXT.Buffer swapchain(@NativeType("VkSwapchainKHR") long value) { VkSwapchainCalibratedTimestampInfoEXT.nswapchain(address(), value); return this; }
        /** Sets the specified value to the {@code presentStage} field. */
        public VkSwapchainCalibratedTimestampInfoEXT.Buffer presentStage(@NativeType("VkPresentStageFlagsEXT") int value) { VkSwapchainCalibratedTimestampInfoEXT.npresentStage(address(), value); return this; }
        /** Sets the specified value to the {@code timeDomainId} field. */
        public VkSwapchainCalibratedTimestampInfoEXT.Buffer timeDomainId(@NativeType("uint64_t") long value) { VkSwapchainCalibratedTimestampInfoEXT.ntimeDomainId(address(), value); return this; }

    }

}