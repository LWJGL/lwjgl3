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
 * struct VkVideoEncodeFeedback2CapabilitiesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t maxPerPartitionFeedbackEntries;
 *     VkVideoEncodePerPartitionFeedbackFlagsKHR supportedPerPartitionEncodeFeedbackFlags;
 * }}</pre>
 */
public class VkVideoEncodeFeedback2CapabilitiesKHR extends Struct<VkVideoEncodeFeedback2CapabilitiesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXPERPARTITIONFEEDBACKENTRIES,
        SUPPORTEDPERPARTITIONENCODEFEEDBACKFLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXPERPARTITIONFEEDBACKENTRIES = layout.offsetof(2);
        SUPPORTEDPERPARTITIONENCODEFEEDBACKFLAGS = layout.offsetof(3);
    }

    protected VkVideoEncodeFeedback2CapabilitiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeFeedback2CapabilitiesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeFeedback2CapabilitiesKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeFeedback2CapabilitiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeFeedback2CapabilitiesKHR(ByteBuffer container) {
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
    /** @return the value of the {@code maxPerPartitionFeedbackEntries} field. */
    @NativeType("uint32_t")
    public int maxPerPartitionFeedbackEntries() { return nmaxPerPartitionFeedbackEntries(address()); }
    /** @return the value of the {@code supportedPerPartitionEncodeFeedbackFlags} field. */
    @NativeType("VkVideoEncodePerPartitionFeedbackFlagsKHR")
    public int supportedPerPartitionEncodeFeedbackFlags() { return nsupportedPerPartitionEncodeFeedbackFlags(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkVideoEncodeFeedback2CapabilitiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeFeedback2#VK_STRUCTURE_TYPE_VIDEO_ENCODE_FEEDBACK_2_CAPABILITIES_KHR STRUCTURE_TYPE_VIDEO_ENCODE_FEEDBACK_2_CAPABILITIES_KHR} value to the {@code sType} field. */
    public VkVideoEncodeFeedback2CapabilitiesKHR sType$Default() { return sType(KHRVideoEncodeFeedback2.VK_STRUCTURE_TYPE_VIDEO_ENCODE_FEEDBACK_2_CAPABILITIES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoEncodeFeedback2CapabilitiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code maxPerPartitionFeedbackEntries} field. */
    public VkVideoEncodeFeedback2CapabilitiesKHR maxPerPartitionFeedbackEntries(@NativeType("uint32_t") int value) { nmaxPerPartitionFeedbackEntries(address(), value); return this; }
    /** Sets the specified value to the {@code supportedPerPartitionEncodeFeedbackFlags} field. */
    public VkVideoEncodeFeedback2CapabilitiesKHR supportedPerPartitionEncodeFeedbackFlags(@NativeType("VkVideoEncodePerPartitionFeedbackFlagsKHR") int value) { nsupportedPerPartitionEncodeFeedbackFlags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeFeedback2CapabilitiesKHR set(
        int sType,
        long pNext,
        int maxPerPartitionFeedbackEntries,
        int supportedPerPartitionEncodeFeedbackFlags
    ) {
        sType(sType);
        pNext(pNext);
        maxPerPartitionFeedbackEntries(maxPerPartitionFeedbackEntries);
        supportedPerPartitionEncodeFeedbackFlags(supportedPerPartitionEncodeFeedbackFlags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeFeedback2CapabilitiesKHR set(VkVideoEncodeFeedback2CapabilitiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeFeedback2CapabilitiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeFeedback2CapabilitiesKHR malloc() {
        return new VkVideoEncodeFeedback2CapabilitiesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeFeedback2CapabilitiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeFeedback2CapabilitiesKHR calloc() {
        return new VkVideoEncodeFeedback2CapabilitiesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeFeedback2CapabilitiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeFeedback2CapabilitiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeFeedback2CapabilitiesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeFeedback2CapabilitiesKHR} instance for the specified memory address. */
    public static VkVideoEncodeFeedback2CapabilitiesKHR create(long address) {
        return new VkVideoEncodeFeedback2CapabilitiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoEncodeFeedback2CapabilitiesKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeFeedback2CapabilitiesKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeFeedback2CapabilitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeFeedback2CapabilitiesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeFeedback2CapabilitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeFeedback2CapabilitiesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeFeedback2CapabilitiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeFeedback2CapabilitiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeFeedback2CapabilitiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeFeedback2CapabilitiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoEncodeFeedback2CapabilitiesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeFeedback2CapabilitiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeFeedback2CapabilitiesKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeFeedback2CapabilitiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeFeedback2CapabilitiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeFeedback2CapabilitiesKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeFeedback2CapabilitiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeFeedback2CapabilitiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeFeedback2CapabilitiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeFeedback2CapabilitiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeFeedback2CapabilitiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoEncodeFeedback2CapabilitiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeFeedback2CapabilitiesKHR.PNEXT); }
    /** Unsafe version of {@link #maxPerPartitionFeedbackEntries}. */
    public static int nmaxPerPartitionFeedbackEntries(long struct) { return memGetInt(struct + VkVideoEncodeFeedback2CapabilitiesKHR.MAXPERPARTITIONFEEDBACKENTRIES); }
    /** Unsafe version of {@link #supportedPerPartitionEncodeFeedbackFlags}. */
    public static int nsupportedPerPartitionEncodeFeedbackFlags(long struct) { return memGetInt(struct + VkVideoEncodeFeedback2CapabilitiesKHR.SUPPORTEDPERPARTITIONENCODEFEEDBACKFLAGS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoEncodeFeedback2CapabilitiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeFeedback2CapabilitiesKHR.PNEXT, value); }
    /** Unsafe version of {@link #maxPerPartitionFeedbackEntries(int) maxPerPartitionFeedbackEntries}. */
    public static void nmaxPerPartitionFeedbackEntries(long struct, int value) { memPutInt(struct + VkVideoEncodeFeedback2CapabilitiesKHR.MAXPERPARTITIONFEEDBACKENTRIES, value); }
    /** Unsafe version of {@link #supportedPerPartitionEncodeFeedbackFlags(int) supportedPerPartitionEncodeFeedbackFlags}. */
    public static void nsupportedPerPartitionEncodeFeedbackFlags(long struct, int value) { memPutInt(struct + VkVideoEncodeFeedback2CapabilitiesKHR.SUPPORTEDPERPARTITIONENCODEFEEDBACKFLAGS, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeFeedback2CapabilitiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeFeedback2CapabilitiesKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeFeedback2CapabilitiesKHR ELEMENT_FACTORY = VkVideoEncodeFeedback2CapabilitiesKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeFeedback2CapabilitiesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeFeedback2CapabilitiesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeFeedback2CapabilitiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeFeedback2CapabilitiesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkVideoEncodeFeedback2CapabilitiesKHR.npNext(address()); }
        /** @return the value of the {@code maxPerPartitionFeedbackEntries} field. */
        @NativeType("uint32_t")
        public int maxPerPartitionFeedbackEntries() { return VkVideoEncodeFeedback2CapabilitiesKHR.nmaxPerPartitionFeedbackEntries(address()); }
        /** @return the value of the {@code supportedPerPartitionEncodeFeedbackFlags} field. */
        @NativeType("VkVideoEncodePerPartitionFeedbackFlagsKHR")
        public int supportedPerPartitionEncodeFeedbackFlags() { return VkVideoEncodeFeedback2CapabilitiesKHR.nsupportedPerPartitionEncodeFeedbackFlags(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkVideoEncodeFeedback2CapabilitiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeFeedback2CapabilitiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeFeedback2#VK_STRUCTURE_TYPE_VIDEO_ENCODE_FEEDBACK_2_CAPABILITIES_KHR STRUCTURE_TYPE_VIDEO_ENCODE_FEEDBACK_2_CAPABILITIES_KHR} value to the {@code sType} field. */
        public VkVideoEncodeFeedback2CapabilitiesKHR.Buffer sType$Default() { return sType(KHRVideoEncodeFeedback2.VK_STRUCTURE_TYPE_VIDEO_ENCODE_FEEDBACK_2_CAPABILITIES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoEncodeFeedback2CapabilitiesKHR.Buffer pNext(@NativeType("void *") long value) { VkVideoEncodeFeedback2CapabilitiesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code maxPerPartitionFeedbackEntries} field. */
        public VkVideoEncodeFeedback2CapabilitiesKHR.Buffer maxPerPartitionFeedbackEntries(@NativeType("uint32_t") int value) { VkVideoEncodeFeedback2CapabilitiesKHR.nmaxPerPartitionFeedbackEntries(address(), value); return this; }
        /** Sets the specified value to the {@code supportedPerPartitionEncodeFeedbackFlags} field. */
        public VkVideoEncodeFeedback2CapabilitiesKHR.Buffer supportedPerPartitionEncodeFeedbackFlags(@NativeType("VkVideoEncodePerPartitionFeedbackFlagsKHR") int value) { VkVideoEncodeFeedback2CapabilitiesKHR.nsupportedPerPartitionEncodeFeedbackFlags(address(), value); return this; }

    }

}