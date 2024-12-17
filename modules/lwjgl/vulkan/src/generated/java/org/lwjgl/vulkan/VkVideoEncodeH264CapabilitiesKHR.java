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

import org.lwjgl.vulkan.video.*;

/**
 * <pre>{@code
 * struct VkVideoEncodeH264CapabilitiesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkVideoEncodeH264CapabilityFlagsKHR flags;
 *     StdVideoH264LevelIdc maxLevelIdc;
 *     uint32_t maxSliceCount;
 *     uint32_t maxPPictureL0ReferenceCount;
 *     uint32_t maxBPictureL0ReferenceCount;
 *     uint32_t maxL1ReferenceCount;
 *     uint32_t maxTemporalLayerCount;
 *     VkBool32 expectDyadicTemporalLayerPattern;
 *     int32_t minQp;
 *     int32_t maxQp;
 *     VkBool32 prefersGopRemainingFrames;
 *     VkBool32 requiresGopRemainingFrames;
 *     VkVideoEncodeH264StdFlagsKHR stdSyntaxFlags;
 * }}</pre>
 */
public class VkVideoEncodeH264CapabilitiesKHR extends Struct<VkVideoEncodeH264CapabilitiesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        MAXLEVELIDC,
        MAXSLICECOUNT,
        MAXPPICTUREL0REFERENCECOUNT,
        MAXBPICTUREL0REFERENCECOUNT,
        MAXL1REFERENCECOUNT,
        MAXTEMPORALLAYERCOUNT,
        EXPECTDYADICTEMPORALLAYERPATTERN,
        MINQP,
        MAXQP,
        PREFERSGOPREMAININGFRAMES,
        REQUIRESGOPREMAININGFRAMES,
        STDSYNTAXFLAGS;

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
        FLAGS = layout.offsetof(2);
        MAXLEVELIDC = layout.offsetof(3);
        MAXSLICECOUNT = layout.offsetof(4);
        MAXPPICTUREL0REFERENCECOUNT = layout.offsetof(5);
        MAXBPICTUREL0REFERENCECOUNT = layout.offsetof(6);
        MAXL1REFERENCECOUNT = layout.offsetof(7);
        MAXTEMPORALLAYERCOUNT = layout.offsetof(8);
        EXPECTDYADICTEMPORALLAYERPATTERN = layout.offsetof(9);
        MINQP = layout.offsetof(10);
        MAXQP = layout.offsetof(11);
        PREFERSGOPREMAININGFRAMES = layout.offsetof(12);
        REQUIRESGOPREMAININGFRAMES = layout.offsetof(13);
        STDSYNTAXFLAGS = layout.offsetof(14);
    }

    protected VkVideoEncodeH264CapabilitiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeH264CapabilitiesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH264CapabilitiesKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeH264CapabilitiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH264CapabilitiesKHR(ByteBuffer container) {
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
    /** @return the value of the {@code flags} field. */
    @NativeType("VkVideoEncodeH264CapabilityFlagsKHR")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code maxLevelIdc} field. */
    @NativeType("StdVideoH264LevelIdc")
    public int maxLevelIdc() { return nmaxLevelIdc(address()); }
    /** @return the value of the {@code maxSliceCount} field. */
    @NativeType("uint32_t")
    public int maxSliceCount() { return nmaxSliceCount(address()); }
    /** @return the value of the {@code maxPPictureL0ReferenceCount} field. */
    @NativeType("uint32_t")
    public int maxPPictureL0ReferenceCount() { return nmaxPPictureL0ReferenceCount(address()); }
    /** @return the value of the {@code maxBPictureL0ReferenceCount} field. */
    @NativeType("uint32_t")
    public int maxBPictureL0ReferenceCount() { return nmaxBPictureL0ReferenceCount(address()); }
    /** @return the value of the {@code maxL1ReferenceCount} field. */
    @NativeType("uint32_t")
    public int maxL1ReferenceCount() { return nmaxL1ReferenceCount(address()); }
    /** @return the value of the {@code maxTemporalLayerCount} field. */
    @NativeType("uint32_t")
    public int maxTemporalLayerCount() { return nmaxTemporalLayerCount(address()); }
    /** @return the value of the {@code expectDyadicTemporalLayerPattern} field. */
    @NativeType("VkBool32")
    public boolean expectDyadicTemporalLayerPattern() { return nexpectDyadicTemporalLayerPattern(address()) != 0; }
    /** @return the value of the {@code minQp} field. */
    @NativeType("int32_t")
    public int minQp() { return nminQp(address()); }
    /** @return the value of the {@code maxQp} field. */
    @NativeType("int32_t")
    public int maxQp() { return nmaxQp(address()); }
    /** @return the value of the {@code prefersGopRemainingFrames} field. */
    @NativeType("VkBool32")
    public boolean prefersGopRemainingFrames() { return nprefersGopRemainingFrames(address()) != 0; }
    /** @return the value of the {@code requiresGopRemainingFrames} field. */
    @NativeType("VkBool32")
    public boolean requiresGopRemainingFrames() { return nrequiresGopRemainingFrames(address()) != 0; }
    /** @return the value of the {@code stdSyntaxFlags} field. */
    @NativeType("VkVideoEncodeH264StdFlagsKHR")
    public int stdSyntaxFlags() { return nstdSyntaxFlags(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkVideoEncodeH264CapabilitiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_CAPABILITIES_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H264_CAPABILITIES_KHR} value to the {@code sType} field. */
    public VkVideoEncodeH264CapabilitiesKHR sType$Default() { return sType(KHRVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_CAPABILITIES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoEncodeH264CapabilitiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH264CapabilitiesKHR set(
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
    public VkVideoEncodeH264CapabilitiesKHR set(VkVideoEncodeH264CapabilitiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH264CapabilitiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264CapabilitiesKHR malloc() {
        return new VkVideoEncodeH264CapabilitiesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH264CapabilitiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264CapabilitiesKHR calloc() {
        return new VkVideoEncodeH264CapabilitiesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH264CapabilitiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH264CapabilitiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH264CapabilitiesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH264CapabilitiesKHR} instance for the specified memory address. */
    public static VkVideoEncodeH264CapabilitiesKHR create(long address) {
        return new VkVideoEncodeH264CapabilitiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoEncodeH264CapabilitiesKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeH264CapabilitiesKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264CapabilitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264CapabilitiesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264CapabilitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264CapabilitiesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264CapabilitiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264CapabilitiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeH264CapabilitiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264CapabilitiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoEncodeH264CapabilitiesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264CapabilitiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264CapabilitiesKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeH264CapabilitiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264CapabilitiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264CapabilitiesKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeH264CapabilitiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264CapabilitiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264CapabilitiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264CapabilitiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264CapabilitiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoEncodeH264CapabilitiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH264CapabilitiesKHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkVideoEncodeH264CapabilitiesKHR.FLAGS); }
    /** Unsafe version of {@link #maxLevelIdc}. */
    public static int nmaxLevelIdc(long struct) { return memGetInt(struct + VkVideoEncodeH264CapabilitiesKHR.MAXLEVELIDC); }
    /** Unsafe version of {@link #maxSliceCount}. */
    public static int nmaxSliceCount(long struct) { return memGetInt(struct + VkVideoEncodeH264CapabilitiesKHR.MAXSLICECOUNT); }
    /** Unsafe version of {@link #maxPPictureL0ReferenceCount}. */
    public static int nmaxPPictureL0ReferenceCount(long struct) { return memGetInt(struct + VkVideoEncodeH264CapabilitiesKHR.MAXPPICTUREL0REFERENCECOUNT); }
    /** Unsafe version of {@link #maxBPictureL0ReferenceCount}. */
    public static int nmaxBPictureL0ReferenceCount(long struct) { return memGetInt(struct + VkVideoEncodeH264CapabilitiesKHR.MAXBPICTUREL0REFERENCECOUNT); }
    /** Unsafe version of {@link #maxL1ReferenceCount}. */
    public static int nmaxL1ReferenceCount(long struct) { return memGetInt(struct + VkVideoEncodeH264CapabilitiesKHR.MAXL1REFERENCECOUNT); }
    /** Unsafe version of {@link #maxTemporalLayerCount}. */
    public static int nmaxTemporalLayerCount(long struct) { return memGetInt(struct + VkVideoEncodeH264CapabilitiesKHR.MAXTEMPORALLAYERCOUNT); }
    /** Unsafe version of {@link #expectDyadicTemporalLayerPattern}. */
    public static int nexpectDyadicTemporalLayerPattern(long struct) { return memGetInt(struct + VkVideoEncodeH264CapabilitiesKHR.EXPECTDYADICTEMPORALLAYERPATTERN); }
    /** Unsafe version of {@link #minQp}. */
    public static int nminQp(long struct) { return memGetInt(struct + VkVideoEncodeH264CapabilitiesKHR.MINQP); }
    /** Unsafe version of {@link #maxQp}. */
    public static int nmaxQp(long struct) { return memGetInt(struct + VkVideoEncodeH264CapabilitiesKHR.MAXQP); }
    /** Unsafe version of {@link #prefersGopRemainingFrames}. */
    public static int nprefersGopRemainingFrames(long struct) { return memGetInt(struct + VkVideoEncodeH264CapabilitiesKHR.PREFERSGOPREMAININGFRAMES); }
    /** Unsafe version of {@link #requiresGopRemainingFrames}. */
    public static int nrequiresGopRemainingFrames(long struct) { return memGetInt(struct + VkVideoEncodeH264CapabilitiesKHR.REQUIRESGOPREMAININGFRAMES); }
    /** Unsafe version of {@link #stdSyntaxFlags}. */
    public static int nstdSyntaxFlags(long struct) { return memGetInt(struct + VkVideoEncodeH264CapabilitiesKHR.STDSYNTAXFLAGS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoEncodeH264CapabilitiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH264CapabilitiesKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH264CapabilitiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264CapabilitiesKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeH264CapabilitiesKHR ELEMENT_FACTORY = VkVideoEncodeH264CapabilitiesKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH264CapabilitiesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH264CapabilitiesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeH264CapabilitiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH264CapabilitiesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkVideoEncodeH264CapabilitiesKHR.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkVideoEncodeH264CapabilityFlagsKHR")
        public int flags() { return VkVideoEncodeH264CapabilitiesKHR.nflags(address()); }
        /** @return the value of the {@code maxLevelIdc} field. */
        @NativeType("StdVideoH264LevelIdc")
        public int maxLevelIdc() { return VkVideoEncodeH264CapabilitiesKHR.nmaxLevelIdc(address()); }
        /** @return the value of the {@code maxSliceCount} field. */
        @NativeType("uint32_t")
        public int maxSliceCount() { return VkVideoEncodeH264CapabilitiesKHR.nmaxSliceCount(address()); }
        /** @return the value of the {@code maxPPictureL0ReferenceCount} field. */
        @NativeType("uint32_t")
        public int maxPPictureL0ReferenceCount() { return VkVideoEncodeH264CapabilitiesKHR.nmaxPPictureL0ReferenceCount(address()); }
        /** @return the value of the {@code maxBPictureL0ReferenceCount} field. */
        @NativeType("uint32_t")
        public int maxBPictureL0ReferenceCount() { return VkVideoEncodeH264CapabilitiesKHR.nmaxBPictureL0ReferenceCount(address()); }
        /** @return the value of the {@code maxL1ReferenceCount} field. */
        @NativeType("uint32_t")
        public int maxL1ReferenceCount() { return VkVideoEncodeH264CapabilitiesKHR.nmaxL1ReferenceCount(address()); }
        /** @return the value of the {@code maxTemporalLayerCount} field. */
        @NativeType("uint32_t")
        public int maxTemporalLayerCount() { return VkVideoEncodeH264CapabilitiesKHR.nmaxTemporalLayerCount(address()); }
        /** @return the value of the {@code expectDyadicTemporalLayerPattern} field. */
        @NativeType("VkBool32")
        public boolean expectDyadicTemporalLayerPattern() { return VkVideoEncodeH264CapabilitiesKHR.nexpectDyadicTemporalLayerPattern(address()) != 0; }
        /** @return the value of the {@code minQp} field. */
        @NativeType("int32_t")
        public int minQp() { return VkVideoEncodeH264CapabilitiesKHR.nminQp(address()); }
        /** @return the value of the {@code maxQp} field. */
        @NativeType("int32_t")
        public int maxQp() { return VkVideoEncodeH264CapabilitiesKHR.nmaxQp(address()); }
        /** @return the value of the {@code prefersGopRemainingFrames} field. */
        @NativeType("VkBool32")
        public boolean prefersGopRemainingFrames() { return VkVideoEncodeH264CapabilitiesKHR.nprefersGopRemainingFrames(address()) != 0; }
        /** @return the value of the {@code requiresGopRemainingFrames} field. */
        @NativeType("VkBool32")
        public boolean requiresGopRemainingFrames() { return VkVideoEncodeH264CapabilitiesKHR.nrequiresGopRemainingFrames(address()) != 0; }
        /** @return the value of the {@code stdSyntaxFlags} field. */
        @NativeType("VkVideoEncodeH264StdFlagsKHR")
        public int stdSyntaxFlags() { return VkVideoEncodeH264CapabilitiesKHR.nstdSyntaxFlags(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkVideoEncodeH264CapabilitiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH264CapabilitiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_CAPABILITIES_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H264_CAPABILITIES_KHR} value to the {@code sType} field. */
        public VkVideoEncodeH264CapabilitiesKHR.Buffer sType$Default() { return sType(KHRVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_CAPABILITIES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoEncodeH264CapabilitiesKHR.Buffer pNext(@NativeType("void *") long value) { VkVideoEncodeH264CapabilitiesKHR.npNext(address(), value); return this; }

    }

}