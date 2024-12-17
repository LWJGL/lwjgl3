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
 * struct VkVideoEncodeAV1CapabilitiesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkVideoEncodeAV1CapabilityFlagsKHR flags;
 *     StdVideoAV1Level maxLevel;
 *     {@link VkExtent2D VkExtent2D} codedPictureAlignment;
 *     {@link VkExtent2D VkExtent2D} maxTiles;
 *     {@link VkExtent2D VkExtent2D} minTileSize;
 *     {@link VkExtent2D VkExtent2D} maxTileSize;
 *     VkVideoEncodeAV1SuperblockSizeFlagsKHR superblockSizes;
 *     uint32_t maxSingleReferenceCount;
 *     uint32_t singleReferenceNameMask;
 *     uint32_t maxUnidirectionalCompoundReferenceCount;
 *     uint32_t maxUnidirectionalCompoundGroup1ReferenceCount;
 *     uint32_t unidirectionalCompoundReferenceNameMask;
 *     uint32_t maxBidirectionalCompoundReferenceCount;
 *     uint32_t maxBidirectionalCompoundGroup1ReferenceCount;
 *     uint32_t maxBidirectionalCompoundGroup2ReferenceCount;
 *     uint32_t bidirectionalCompoundReferenceNameMask;
 *     uint32_t maxTemporalLayerCount;
 *     uint32_t maxSpatialLayerCount;
 *     uint32_t maxOperatingPoints;
 *     uint32_t minQIndex;
 *     uint32_t maxQIndex;
 *     VkBool32 prefersGopRemainingFrames;
 *     VkBool32 requiresGopRemainingFrames;
 *     VkVideoEncodeAV1StdFlagsKHR stdSyntaxFlags;
 * }}</pre>
 */
public class VkVideoEncodeAV1CapabilitiesKHR extends Struct<VkVideoEncodeAV1CapabilitiesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        MAXLEVEL,
        CODEDPICTUREALIGNMENT,
        MAXTILES,
        MINTILESIZE,
        MAXTILESIZE,
        SUPERBLOCKSIZES,
        MAXSINGLEREFERENCECOUNT,
        SINGLEREFERENCENAMEMASK,
        MAXUNIDIRECTIONALCOMPOUNDREFERENCECOUNT,
        MAXUNIDIRECTIONALCOMPOUNDGROUP1REFERENCECOUNT,
        UNIDIRECTIONALCOMPOUNDREFERENCENAMEMASK,
        MAXBIDIRECTIONALCOMPOUNDREFERENCECOUNT,
        MAXBIDIRECTIONALCOMPOUNDGROUP1REFERENCECOUNT,
        MAXBIDIRECTIONALCOMPOUNDGROUP2REFERENCECOUNT,
        BIDIRECTIONALCOMPOUNDREFERENCENAMEMASK,
        MAXTEMPORALLAYERCOUNT,
        MAXSPATIALLAYERCOUNT,
        MAXOPERATINGPOINTS,
        MINQINDEX,
        MAXQINDEX,
        PREFERSGOPREMAININGFRAMES,
        REQUIRESGOPREMAININGFRAMES,
        STDSYNTAXFLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
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
        MAXLEVEL = layout.offsetof(3);
        CODEDPICTUREALIGNMENT = layout.offsetof(4);
        MAXTILES = layout.offsetof(5);
        MINTILESIZE = layout.offsetof(6);
        MAXTILESIZE = layout.offsetof(7);
        SUPERBLOCKSIZES = layout.offsetof(8);
        MAXSINGLEREFERENCECOUNT = layout.offsetof(9);
        SINGLEREFERENCENAMEMASK = layout.offsetof(10);
        MAXUNIDIRECTIONALCOMPOUNDREFERENCECOUNT = layout.offsetof(11);
        MAXUNIDIRECTIONALCOMPOUNDGROUP1REFERENCECOUNT = layout.offsetof(12);
        UNIDIRECTIONALCOMPOUNDREFERENCENAMEMASK = layout.offsetof(13);
        MAXBIDIRECTIONALCOMPOUNDREFERENCECOUNT = layout.offsetof(14);
        MAXBIDIRECTIONALCOMPOUNDGROUP1REFERENCECOUNT = layout.offsetof(15);
        MAXBIDIRECTIONALCOMPOUNDGROUP2REFERENCECOUNT = layout.offsetof(16);
        BIDIRECTIONALCOMPOUNDREFERENCENAMEMASK = layout.offsetof(17);
        MAXTEMPORALLAYERCOUNT = layout.offsetof(18);
        MAXSPATIALLAYERCOUNT = layout.offsetof(19);
        MAXOPERATINGPOINTS = layout.offsetof(20);
        MINQINDEX = layout.offsetof(21);
        MAXQINDEX = layout.offsetof(22);
        PREFERSGOPREMAININGFRAMES = layout.offsetof(23);
        REQUIRESGOPREMAININGFRAMES = layout.offsetof(24);
        STDSYNTAXFLAGS = layout.offsetof(25);
    }

    protected VkVideoEncodeAV1CapabilitiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeAV1CapabilitiesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeAV1CapabilitiesKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeAV1CapabilitiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeAV1CapabilitiesKHR(ByteBuffer container) {
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
    @NativeType("VkVideoEncodeAV1CapabilityFlagsKHR")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code maxLevel} field. */
    @NativeType("StdVideoAV1Level")
    public int maxLevel() { return nmaxLevel(address()); }
    /** @return a {@link VkExtent2D} view of the {@code codedPictureAlignment} field. */
    public VkExtent2D codedPictureAlignment() { return ncodedPictureAlignment(address()); }
    /** @return a {@link VkExtent2D} view of the {@code maxTiles} field. */
    public VkExtent2D maxTiles() { return nmaxTiles(address()); }
    /** @return a {@link VkExtent2D} view of the {@code minTileSize} field. */
    public VkExtent2D minTileSize() { return nminTileSize(address()); }
    /** @return a {@link VkExtent2D} view of the {@code maxTileSize} field. */
    public VkExtent2D maxTileSize() { return nmaxTileSize(address()); }
    /** @return the value of the {@code superblockSizes} field. */
    @NativeType("VkVideoEncodeAV1SuperblockSizeFlagsKHR")
    public int superblockSizes() { return nsuperblockSizes(address()); }
    /** @return the value of the {@code maxSingleReferenceCount} field. */
    @NativeType("uint32_t")
    public int maxSingleReferenceCount() { return nmaxSingleReferenceCount(address()); }
    /** @return the value of the {@code singleReferenceNameMask} field. */
    @NativeType("uint32_t")
    public int singleReferenceNameMask() { return nsingleReferenceNameMask(address()); }
    /** @return the value of the {@code maxUnidirectionalCompoundReferenceCount} field. */
    @NativeType("uint32_t")
    public int maxUnidirectionalCompoundReferenceCount() { return nmaxUnidirectionalCompoundReferenceCount(address()); }
    /** @return the value of the {@code maxUnidirectionalCompoundGroup1ReferenceCount} field. */
    @NativeType("uint32_t")
    public int maxUnidirectionalCompoundGroup1ReferenceCount() { return nmaxUnidirectionalCompoundGroup1ReferenceCount(address()); }
    /** @return the value of the {@code unidirectionalCompoundReferenceNameMask} field. */
    @NativeType("uint32_t")
    public int unidirectionalCompoundReferenceNameMask() { return nunidirectionalCompoundReferenceNameMask(address()); }
    /** @return the value of the {@code maxBidirectionalCompoundReferenceCount} field. */
    @NativeType("uint32_t")
    public int maxBidirectionalCompoundReferenceCount() { return nmaxBidirectionalCompoundReferenceCount(address()); }
    /** @return the value of the {@code maxBidirectionalCompoundGroup1ReferenceCount} field. */
    @NativeType("uint32_t")
    public int maxBidirectionalCompoundGroup1ReferenceCount() { return nmaxBidirectionalCompoundGroup1ReferenceCount(address()); }
    /** @return the value of the {@code maxBidirectionalCompoundGroup2ReferenceCount} field. */
    @NativeType("uint32_t")
    public int maxBidirectionalCompoundGroup2ReferenceCount() { return nmaxBidirectionalCompoundGroup2ReferenceCount(address()); }
    /** @return the value of the {@code bidirectionalCompoundReferenceNameMask} field. */
    @NativeType("uint32_t")
    public int bidirectionalCompoundReferenceNameMask() { return nbidirectionalCompoundReferenceNameMask(address()); }
    /** @return the value of the {@code maxTemporalLayerCount} field. */
    @NativeType("uint32_t")
    public int maxTemporalLayerCount() { return nmaxTemporalLayerCount(address()); }
    /** @return the value of the {@code maxSpatialLayerCount} field. */
    @NativeType("uint32_t")
    public int maxSpatialLayerCount() { return nmaxSpatialLayerCount(address()); }
    /** @return the value of the {@code maxOperatingPoints} field. */
    @NativeType("uint32_t")
    public int maxOperatingPoints() { return nmaxOperatingPoints(address()); }
    /** @return the value of the {@code minQIndex} field. */
    @NativeType("uint32_t")
    public int minQIndex() { return nminQIndex(address()); }
    /** @return the value of the {@code maxQIndex} field. */
    @NativeType("uint32_t")
    public int maxQIndex() { return nmaxQIndex(address()); }
    /** @return the value of the {@code prefersGopRemainingFrames} field. */
    @NativeType("VkBool32")
    public boolean prefersGopRemainingFrames() { return nprefersGopRemainingFrames(address()) != 0; }
    /** @return the value of the {@code requiresGopRemainingFrames} field. */
    @NativeType("VkBool32")
    public boolean requiresGopRemainingFrames() { return nrequiresGopRemainingFrames(address()) != 0; }
    /** @return the value of the {@code stdSyntaxFlags} field. */
    @NativeType("VkVideoEncodeAV1StdFlagsKHR")
    public int stdSyntaxFlags() { return nstdSyntaxFlags(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkVideoEncodeAV1CapabilitiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeAV1#VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_CAPABILITIES_KHR STRUCTURE_TYPE_VIDEO_ENCODE_AV1_CAPABILITIES_KHR} value to the {@code sType} field. */
    public VkVideoEncodeAV1CapabilitiesKHR sType$Default() { return sType(KHRVideoEncodeAV1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_CAPABILITIES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoEncodeAV1CapabilitiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeAV1CapabilitiesKHR set(
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
    public VkVideoEncodeAV1CapabilitiesKHR set(VkVideoEncodeAV1CapabilitiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeAV1CapabilitiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeAV1CapabilitiesKHR malloc() {
        return new VkVideoEncodeAV1CapabilitiesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeAV1CapabilitiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeAV1CapabilitiesKHR calloc() {
        return new VkVideoEncodeAV1CapabilitiesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeAV1CapabilitiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeAV1CapabilitiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeAV1CapabilitiesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeAV1CapabilitiesKHR} instance for the specified memory address. */
    public static VkVideoEncodeAV1CapabilitiesKHR create(long address) {
        return new VkVideoEncodeAV1CapabilitiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoEncodeAV1CapabilitiesKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeAV1CapabilitiesKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1CapabilitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1CapabilitiesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1CapabilitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1CapabilitiesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1CapabilitiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1CapabilitiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeAV1CapabilitiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1CapabilitiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoEncodeAV1CapabilitiesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeAV1CapabilitiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeAV1CapabilitiesKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeAV1CapabilitiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeAV1CapabilitiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeAV1CapabilitiesKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeAV1CapabilitiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1CapabilitiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1CapabilitiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1CapabilitiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1CapabilitiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoEncodeAV1CapabilitiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeAV1CapabilitiesKHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkVideoEncodeAV1CapabilitiesKHR.FLAGS); }
    /** Unsafe version of {@link #maxLevel}. */
    public static int nmaxLevel(long struct) { return memGetInt(struct + VkVideoEncodeAV1CapabilitiesKHR.MAXLEVEL); }
    /** Unsafe version of {@link #codedPictureAlignment}. */
    public static VkExtent2D ncodedPictureAlignment(long struct) { return VkExtent2D.create(struct + VkVideoEncodeAV1CapabilitiesKHR.CODEDPICTUREALIGNMENT); }
    /** Unsafe version of {@link #maxTiles}. */
    public static VkExtent2D nmaxTiles(long struct) { return VkExtent2D.create(struct + VkVideoEncodeAV1CapabilitiesKHR.MAXTILES); }
    /** Unsafe version of {@link #minTileSize}. */
    public static VkExtent2D nminTileSize(long struct) { return VkExtent2D.create(struct + VkVideoEncodeAV1CapabilitiesKHR.MINTILESIZE); }
    /** Unsafe version of {@link #maxTileSize}. */
    public static VkExtent2D nmaxTileSize(long struct) { return VkExtent2D.create(struct + VkVideoEncodeAV1CapabilitiesKHR.MAXTILESIZE); }
    /** Unsafe version of {@link #superblockSizes}. */
    public static int nsuperblockSizes(long struct) { return memGetInt(struct + VkVideoEncodeAV1CapabilitiesKHR.SUPERBLOCKSIZES); }
    /** Unsafe version of {@link #maxSingleReferenceCount}. */
    public static int nmaxSingleReferenceCount(long struct) { return memGetInt(struct + VkVideoEncodeAV1CapabilitiesKHR.MAXSINGLEREFERENCECOUNT); }
    /** Unsafe version of {@link #singleReferenceNameMask}. */
    public static int nsingleReferenceNameMask(long struct) { return memGetInt(struct + VkVideoEncodeAV1CapabilitiesKHR.SINGLEREFERENCENAMEMASK); }
    /** Unsafe version of {@link #maxUnidirectionalCompoundReferenceCount}. */
    public static int nmaxUnidirectionalCompoundReferenceCount(long struct) { return memGetInt(struct + VkVideoEncodeAV1CapabilitiesKHR.MAXUNIDIRECTIONALCOMPOUNDREFERENCECOUNT); }
    /** Unsafe version of {@link #maxUnidirectionalCompoundGroup1ReferenceCount}. */
    public static int nmaxUnidirectionalCompoundGroup1ReferenceCount(long struct) { return memGetInt(struct + VkVideoEncodeAV1CapabilitiesKHR.MAXUNIDIRECTIONALCOMPOUNDGROUP1REFERENCECOUNT); }
    /** Unsafe version of {@link #unidirectionalCompoundReferenceNameMask}. */
    public static int nunidirectionalCompoundReferenceNameMask(long struct) { return memGetInt(struct + VkVideoEncodeAV1CapabilitiesKHR.UNIDIRECTIONALCOMPOUNDREFERENCENAMEMASK); }
    /** Unsafe version of {@link #maxBidirectionalCompoundReferenceCount}. */
    public static int nmaxBidirectionalCompoundReferenceCount(long struct) { return memGetInt(struct + VkVideoEncodeAV1CapabilitiesKHR.MAXBIDIRECTIONALCOMPOUNDREFERENCECOUNT); }
    /** Unsafe version of {@link #maxBidirectionalCompoundGroup1ReferenceCount}. */
    public static int nmaxBidirectionalCompoundGroup1ReferenceCount(long struct) { return memGetInt(struct + VkVideoEncodeAV1CapabilitiesKHR.MAXBIDIRECTIONALCOMPOUNDGROUP1REFERENCECOUNT); }
    /** Unsafe version of {@link #maxBidirectionalCompoundGroup2ReferenceCount}. */
    public static int nmaxBidirectionalCompoundGroup2ReferenceCount(long struct) { return memGetInt(struct + VkVideoEncodeAV1CapabilitiesKHR.MAXBIDIRECTIONALCOMPOUNDGROUP2REFERENCECOUNT); }
    /** Unsafe version of {@link #bidirectionalCompoundReferenceNameMask}. */
    public static int nbidirectionalCompoundReferenceNameMask(long struct) { return memGetInt(struct + VkVideoEncodeAV1CapabilitiesKHR.BIDIRECTIONALCOMPOUNDREFERENCENAMEMASK); }
    /** Unsafe version of {@link #maxTemporalLayerCount}. */
    public static int nmaxTemporalLayerCount(long struct) { return memGetInt(struct + VkVideoEncodeAV1CapabilitiesKHR.MAXTEMPORALLAYERCOUNT); }
    /** Unsafe version of {@link #maxSpatialLayerCount}. */
    public static int nmaxSpatialLayerCount(long struct) { return memGetInt(struct + VkVideoEncodeAV1CapabilitiesKHR.MAXSPATIALLAYERCOUNT); }
    /** Unsafe version of {@link #maxOperatingPoints}. */
    public static int nmaxOperatingPoints(long struct) { return memGetInt(struct + VkVideoEncodeAV1CapabilitiesKHR.MAXOPERATINGPOINTS); }
    /** Unsafe version of {@link #minQIndex}. */
    public static int nminQIndex(long struct) { return memGetInt(struct + VkVideoEncodeAV1CapabilitiesKHR.MINQINDEX); }
    /** Unsafe version of {@link #maxQIndex}. */
    public static int nmaxQIndex(long struct) { return memGetInt(struct + VkVideoEncodeAV1CapabilitiesKHR.MAXQINDEX); }
    /** Unsafe version of {@link #prefersGopRemainingFrames}. */
    public static int nprefersGopRemainingFrames(long struct) { return memGetInt(struct + VkVideoEncodeAV1CapabilitiesKHR.PREFERSGOPREMAININGFRAMES); }
    /** Unsafe version of {@link #requiresGopRemainingFrames}. */
    public static int nrequiresGopRemainingFrames(long struct) { return memGetInt(struct + VkVideoEncodeAV1CapabilitiesKHR.REQUIRESGOPREMAININGFRAMES); }
    /** Unsafe version of {@link #stdSyntaxFlags}. */
    public static int nstdSyntaxFlags(long struct) { return memGetInt(struct + VkVideoEncodeAV1CapabilitiesKHR.STDSYNTAXFLAGS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoEncodeAV1CapabilitiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeAV1CapabilitiesKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeAV1CapabilitiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeAV1CapabilitiesKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeAV1CapabilitiesKHR ELEMENT_FACTORY = VkVideoEncodeAV1CapabilitiesKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeAV1CapabilitiesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeAV1CapabilitiesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeAV1CapabilitiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeAV1CapabilitiesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkVideoEncodeAV1CapabilitiesKHR.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkVideoEncodeAV1CapabilityFlagsKHR")
        public int flags() { return VkVideoEncodeAV1CapabilitiesKHR.nflags(address()); }
        /** @return the value of the {@code maxLevel} field. */
        @NativeType("StdVideoAV1Level")
        public int maxLevel() { return VkVideoEncodeAV1CapabilitiesKHR.nmaxLevel(address()); }
        /** @return a {@link VkExtent2D} view of the {@code codedPictureAlignment} field. */
        public VkExtent2D codedPictureAlignment() { return VkVideoEncodeAV1CapabilitiesKHR.ncodedPictureAlignment(address()); }
        /** @return a {@link VkExtent2D} view of the {@code maxTiles} field. */
        public VkExtent2D maxTiles() { return VkVideoEncodeAV1CapabilitiesKHR.nmaxTiles(address()); }
        /** @return a {@link VkExtent2D} view of the {@code minTileSize} field. */
        public VkExtent2D minTileSize() { return VkVideoEncodeAV1CapabilitiesKHR.nminTileSize(address()); }
        /** @return a {@link VkExtent2D} view of the {@code maxTileSize} field. */
        public VkExtent2D maxTileSize() { return VkVideoEncodeAV1CapabilitiesKHR.nmaxTileSize(address()); }
        /** @return the value of the {@code superblockSizes} field. */
        @NativeType("VkVideoEncodeAV1SuperblockSizeFlagsKHR")
        public int superblockSizes() { return VkVideoEncodeAV1CapabilitiesKHR.nsuperblockSizes(address()); }
        /** @return the value of the {@code maxSingleReferenceCount} field. */
        @NativeType("uint32_t")
        public int maxSingleReferenceCount() { return VkVideoEncodeAV1CapabilitiesKHR.nmaxSingleReferenceCount(address()); }
        /** @return the value of the {@code singleReferenceNameMask} field. */
        @NativeType("uint32_t")
        public int singleReferenceNameMask() { return VkVideoEncodeAV1CapabilitiesKHR.nsingleReferenceNameMask(address()); }
        /** @return the value of the {@code maxUnidirectionalCompoundReferenceCount} field. */
        @NativeType("uint32_t")
        public int maxUnidirectionalCompoundReferenceCount() { return VkVideoEncodeAV1CapabilitiesKHR.nmaxUnidirectionalCompoundReferenceCount(address()); }
        /** @return the value of the {@code maxUnidirectionalCompoundGroup1ReferenceCount} field. */
        @NativeType("uint32_t")
        public int maxUnidirectionalCompoundGroup1ReferenceCount() { return VkVideoEncodeAV1CapabilitiesKHR.nmaxUnidirectionalCompoundGroup1ReferenceCount(address()); }
        /** @return the value of the {@code unidirectionalCompoundReferenceNameMask} field. */
        @NativeType("uint32_t")
        public int unidirectionalCompoundReferenceNameMask() { return VkVideoEncodeAV1CapabilitiesKHR.nunidirectionalCompoundReferenceNameMask(address()); }
        /** @return the value of the {@code maxBidirectionalCompoundReferenceCount} field. */
        @NativeType("uint32_t")
        public int maxBidirectionalCompoundReferenceCount() { return VkVideoEncodeAV1CapabilitiesKHR.nmaxBidirectionalCompoundReferenceCount(address()); }
        /** @return the value of the {@code maxBidirectionalCompoundGroup1ReferenceCount} field. */
        @NativeType("uint32_t")
        public int maxBidirectionalCompoundGroup1ReferenceCount() { return VkVideoEncodeAV1CapabilitiesKHR.nmaxBidirectionalCompoundGroup1ReferenceCount(address()); }
        /** @return the value of the {@code maxBidirectionalCompoundGroup2ReferenceCount} field. */
        @NativeType("uint32_t")
        public int maxBidirectionalCompoundGroup2ReferenceCount() { return VkVideoEncodeAV1CapabilitiesKHR.nmaxBidirectionalCompoundGroup2ReferenceCount(address()); }
        /** @return the value of the {@code bidirectionalCompoundReferenceNameMask} field. */
        @NativeType("uint32_t")
        public int bidirectionalCompoundReferenceNameMask() { return VkVideoEncodeAV1CapabilitiesKHR.nbidirectionalCompoundReferenceNameMask(address()); }
        /** @return the value of the {@code maxTemporalLayerCount} field. */
        @NativeType("uint32_t")
        public int maxTemporalLayerCount() { return VkVideoEncodeAV1CapabilitiesKHR.nmaxTemporalLayerCount(address()); }
        /** @return the value of the {@code maxSpatialLayerCount} field. */
        @NativeType("uint32_t")
        public int maxSpatialLayerCount() { return VkVideoEncodeAV1CapabilitiesKHR.nmaxSpatialLayerCount(address()); }
        /** @return the value of the {@code maxOperatingPoints} field. */
        @NativeType("uint32_t")
        public int maxOperatingPoints() { return VkVideoEncodeAV1CapabilitiesKHR.nmaxOperatingPoints(address()); }
        /** @return the value of the {@code minQIndex} field. */
        @NativeType("uint32_t")
        public int minQIndex() { return VkVideoEncodeAV1CapabilitiesKHR.nminQIndex(address()); }
        /** @return the value of the {@code maxQIndex} field. */
        @NativeType("uint32_t")
        public int maxQIndex() { return VkVideoEncodeAV1CapabilitiesKHR.nmaxQIndex(address()); }
        /** @return the value of the {@code prefersGopRemainingFrames} field. */
        @NativeType("VkBool32")
        public boolean prefersGopRemainingFrames() { return VkVideoEncodeAV1CapabilitiesKHR.nprefersGopRemainingFrames(address()) != 0; }
        /** @return the value of the {@code requiresGopRemainingFrames} field. */
        @NativeType("VkBool32")
        public boolean requiresGopRemainingFrames() { return VkVideoEncodeAV1CapabilitiesKHR.nrequiresGopRemainingFrames(address()) != 0; }
        /** @return the value of the {@code stdSyntaxFlags} field. */
        @NativeType("VkVideoEncodeAV1StdFlagsKHR")
        public int stdSyntaxFlags() { return VkVideoEncodeAV1CapabilitiesKHR.nstdSyntaxFlags(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkVideoEncodeAV1CapabilitiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeAV1CapabilitiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeAV1#VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_CAPABILITIES_KHR STRUCTURE_TYPE_VIDEO_ENCODE_AV1_CAPABILITIES_KHR} value to the {@code sType} field. */
        public VkVideoEncodeAV1CapabilitiesKHR.Buffer sType$Default() { return sType(KHRVideoEncodeAV1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_CAPABILITIES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoEncodeAV1CapabilitiesKHR.Buffer pNext(@NativeType("void *") long value) { VkVideoEncodeAV1CapabilitiesKHR.npNext(address(), value); return this; }

    }

}