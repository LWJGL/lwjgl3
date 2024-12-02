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
 * Structure describing AV1 stream rate control parameters.
 * 
 * <h5>Description</h5>
 * 
 * <p>When an instance of this structure is included in the {@code pNext} chain of the {@link VkVideoCodingControlInfoKHR} structure passed to the {@link KHRVideoQueue#vkCmdControlVideoCodingKHR CmdControlVideoCodingKHR} command, and {@link VkVideoCodingControlInfoKHR}{@code ::flags} includes {@link KHRVideoEncodeQueue#VK_VIDEO_CODING_CONTROL_ENCODE_RATE_CONTROL_BIT_KHR VIDEO_CODING_CONTROL_ENCODE_RATE_CONTROL_BIT_KHR}, the parameters in this structure are used as guidance for the implementation’s rate control algorithm (see <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#video-coding-control">Video Coding Control</a>).</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code flags} contains {@link KHRVideoEncodeAV1#VK_VIDEO_ENCODE_AV1_RATE_CONTROL_REFERENCE_PATTERN_FLAT_BIT_KHR VIDEO_ENCODE_AV1_RATE_CONTROL_REFERENCE_PATTERN_FLAT_BIT_KHR} or {@link KHRVideoEncodeAV1#VK_VIDEO_ENCODE_AV1_RATE_CONTROL_REFERENCE_PATTERN_DYADIC_BIT_KHR VIDEO_ENCODE_AV1_RATE_CONTROL_REFERENCE_PATTERN_DYADIC_BIT_KHR}, then it <b>must</b> also contain {@link KHRVideoEncodeAV1#VK_VIDEO_ENCODE_AV1_RATE_CONTROL_REGULAR_GOP_BIT_KHR VIDEO_ENCODE_AV1_RATE_CONTROL_REGULAR_GOP_BIT_KHR}</li>
 * <li>If {@code flags} contains {@link KHRVideoEncodeAV1#VK_VIDEO_ENCODE_AV1_RATE_CONTROL_REFERENCE_PATTERN_FLAT_BIT_KHR VIDEO_ENCODE_AV1_RATE_CONTROL_REFERENCE_PATTERN_FLAT_BIT_KHR}, then it <b>must</b> not also contain {@link KHRVideoEncodeAV1#VK_VIDEO_ENCODE_AV1_RATE_CONTROL_REFERENCE_PATTERN_DYADIC_BIT_KHR VIDEO_ENCODE_AV1_RATE_CONTROL_REFERENCE_PATTERN_DYADIC_BIT_KHR}</li>
 * <li>If {@code flags} contains {@link KHRVideoEncodeAV1#VK_VIDEO_ENCODE_AV1_RATE_CONTROL_REGULAR_GOP_BIT_KHR VIDEO_ENCODE_AV1_RATE_CONTROL_REGULAR_GOP_BIT_KHR}, then {@code gopFrameCount} <b>must</b> be greater than 0</li>
 * <li>If {@code keyFramePeriod} is not 0, then it <b>must</b> be greater than or equal to {@code gopFrameCount}</li>
 * <li>If {@code consecutiveBipredictiveFrameCount} is not 0, then it <b>must</b> be less than {@code gopFrameCount}</li>
 * <li>{@code temporalLayerCount} <b>must</b> be less than or equal to {@link VkVideoEncodeAV1CapabilitiesKHR}{@code ::maxTemporalLayerCount}, as returned by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} for the used video profile</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoEncodeAV1#VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_RATE_CONTROL_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_AV1_RATE_CONTROL_INFO_KHR}</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkVideoEncodeAV1RateControlFlagBitsKHR} values</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeAV1RateControlInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkVideoEncodeAV1RateControlFlagsKHR {@link #flags};
 *     uint32_t {@link #gopFrameCount};
 *     uint32_t {@link #keyFramePeriod};
 *     uint32_t {@link #consecutiveBipredictiveFrameCount};
 *     uint32_t {@link #temporalLayerCount};
 * }</code></pre>
 */
public class VkVideoEncodeAV1RateControlInfoKHR extends Struct<VkVideoEncodeAV1RateControlInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        GOPFRAMECOUNT,
        KEYFRAMEPERIOD,
        CONSECUTIVEBIPREDICTIVEFRAMECOUNT,
        TEMPORALLAYERCOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
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
        GOPFRAMECOUNT = layout.offsetof(3);
        KEYFRAMEPERIOD = layout.offsetof(4);
        CONSECUTIVEBIPREDICTIVEFRAMECOUNT = layout.offsetof(5);
        TEMPORALLAYERCOUNT = layout.offsetof(6);
    }

    protected VkVideoEncodeAV1RateControlInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeAV1RateControlInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeAV1RateControlInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeAV1RateControlInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeAV1RateControlInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a bitmask of {@code VkVideoEncodeAV1RateControlFlagBitsKHR} specifying AV1 rate control flags. */
    @NativeType("VkVideoEncodeAV1RateControlFlagsKHR")
    public int flags() { return nflags(address()); }
    /** the number of frames within a <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-gop">group of pictures (GOP)</a> intended to be used by the application. If it is set to 0, the rate control algorithm <b>may</b> assume an implementation-dependent GOP length. If it is set to {@code UINT32_MAX}, the GOP length is treated as infinite. */
    @NativeType("uint32_t")
    public int gopFrameCount() { return ngopFrameCount(address()); }
    /** the interval, in terms of number of frames, between two frames with the AV1 frame type {@code STD_VIDEO_AV1_FRAME_TYPE_KEY} (see <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-key-frame-period">key frame period</a>). If it is set to 0, the rate control algorithm <b>may</b> assume an implementation-dependent key frame period. If it is set to {@code UINT32_MAX}, the key frame period is treated as infinite. */
    @NativeType("uint32_t")
    public int keyFramePeriod() { return nkeyFramePeriod(address()); }
    /** the number of consecutive frames encoded with {@link KHRVideoEncodeAV1#VK_VIDEO_ENCODE_AV1_RATE_CONTROL_GROUP_BIPREDICTIVE_KHR VIDEO_ENCODE_AV1_RATE_CONTROL_GROUP_BIPREDICTIVE_KHR} between frames encoded with other <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-rate-control-group">rate control groups</a> within the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-gop">GOP</a>. */
    @NativeType("uint32_t")
    public int consecutiveBipredictiveFrameCount() { return nconsecutiveBipredictiveFrameCount(address()); }
    /** specifies the number of AV1 temporal layers that the application intends to use. */
    @NativeType("uint32_t")
    public int temporalLayerCount() { return ntemporalLayerCount(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeAV1RateControlInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeAV1#VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_RATE_CONTROL_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_AV1_RATE_CONTROL_INFO_KHR} value to the {@link #sType} field. */
    public VkVideoEncodeAV1RateControlInfoKHR sType$Default() { return sType(KHRVideoEncodeAV1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_RATE_CONTROL_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeAV1RateControlInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkVideoEncodeAV1RateControlInfoKHR flags(@NativeType("VkVideoEncodeAV1RateControlFlagsKHR") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #gopFrameCount} field. */
    public VkVideoEncodeAV1RateControlInfoKHR gopFrameCount(@NativeType("uint32_t") int value) { ngopFrameCount(address(), value); return this; }
    /** Sets the specified value to the {@link #keyFramePeriod} field. */
    public VkVideoEncodeAV1RateControlInfoKHR keyFramePeriod(@NativeType("uint32_t") int value) { nkeyFramePeriod(address(), value); return this; }
    /** Sets the specified value to the {@link #consecutiveBipredictiveFrameCount} field. */
    public VkVideoEncodeAV1RateControlInfoKHR consecutiveBipredictiveFrameCount(@NativeType("uint32_t") int value) { nconsecutiveBipredictiveFrameCount(address(), value); return this; }
    /** Sets the specified value to the {@link #temporalLayerCount} field. */
    public VkVideoEncodeAV1RateControlInfoKHR temporalLayerCount(@NativeType("uint32_t") int value) { ntemporalLayerCount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeAV1RateControlInfoKHR set(
        int sType,
        long pNext,
        int flags,
        int gopFrameCount,
        int keyFramePeriod,
        int consecutiveBipredictiveFrameCount,
        int temporalLayerCount
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        gopFrameCount(gopFrameCount);
        keyFramePeriod(keyFramePeriod);
        consecutiveBipredictiveFrameCount(consecutiveBipredictiveFrameCount);
        temporalLayerCount(temporalLayerCount);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeAV1RateControlInfoKHR set(VkVideoEncodeAV1RateControlInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeAV1RateControlInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeAV1RateControlInfoKHR malloc() {
        return new VkVideoEncodeAV1RateControlInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeAV1RateControlInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeAV1RateControlInfoKHR calloc() {
        return new VkVideoEncodeAV1RateControlInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeAV1RateControlInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeAV1RateControlInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeAV1RateControlInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeAV1RateControlInfoKHR} instance for the specified memory address. */
    public static VkVideoEncodeAV1RateControlInfoKHR create(long address) {
        return new VkVideoEncodeAV1RateControlInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoEncodeAV1RateControlInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeAV1RateControlInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1RateControlInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1RateControlInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1RateControlInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1RateControlInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1RateControlInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1RateControlInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeAV1RateControlInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1RateControlInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoEncodeAV1RateControlInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeAV1RateControlInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeAV1RateControlInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeAV1RateControlInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeAV1RateControlInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeAV1RateControlInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeAV1RateControlInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1RateControlInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1RateControlInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1RateControlInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1RateControlInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoEncodeAV1RateControlInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeAV1RateControlInfoKHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkVideoEncodeAV1RateControlInfoKHR.FLAGS); }
    /** Unsafe version of {@link #gopFrameCount}. */
    public static int ngopFrameCount(long struct) { return memGetInt(struct + VkVideoEncodeAV1RateControlInfoKHR.GOPFRAMECOUNT); }
    /** Unsafe version of {@link #keyFramePeriod}. */
    public static int nkeyFramePeriod(long struct) { return memGetInt(struct + VkVideoEncodeAV1RateControlInfoKHR.KEYFRAMEPERIOD); }
    /** Unsafe version of {@link #consecutiveBipredictiveFrameCount}. */
    public static int nconsecutiveBipredictiveFrameCount(long struct) { return memGetInt(struct + VkVideoEncodeAV1RateControlInfoKHR.CONSECUTIVEBIPREDICTIVEFRAMECOUNT); }
    /** Unsafe version of {@link #temporalLayerCount}. */
    public static int ntemporalLayerCount(long struct) { return memGetInt(struct + VkVideoEncodeAV1RateControlInfoKHR.TEMPORALLAYERCOUNT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoEncodeAV1RateControlInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeAV1RateControlInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkVideoEncodeAV1RateControlInfoKHR.FLAGS, value); }
    /** Unsafe version of {@link #gopFrameCount(int) gopFrameCount}. */
    public static void ngopFrameCount(long struct, int value) { memPutInt(struct + VkVideoEncodeAV1RateControlInfoKHR.GOPFRAMECOUNT, value); }
    /** Unsafe version of {@link #keyFramePeriod(int) keyFramePeriod}. */
    public static void nkeyFramePeriod(long struct, int value) { memPutInt(struct + VkVideoEncodeAV1RateControlInfoKHR.KEYFRAMEPERIOD, value); }
    /** Unsafe version of {@link #consecutiveBipredictiveFrameCount(int) consecutiveBipredictiveFrameCount}. */
    public static void nconsecutiveBipredictiveFrameCount(long struct, int value) { memPutInt(struct + VkVideoEncodeAV1RateControlInfoKHR.CONSECUTIVEBIPREDICTIVEFRAMECOUNT, value); }
    /** Unsafe version of {@link #temporalLayerCount(int) temporalLayerCount}. */
    public static void ntemporalLayerCount(long struct, int value) { memPutInt(struct + VkVideoEncodeAV1RateControlInfoKHR.TEMPORALLAYERCOUNT, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeAV1RateControlInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeAV1RateControlInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeAV1RateControlInfoKHR ELEMENT_FACTORY = VkVideoEncodeAV1RateControlInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeAV1RateControlInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeAV1RateControlInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeAV1RateControlInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeAV1RateControlInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeAV1RateControlInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeAV1RateControlInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeAV1RateControlInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeAV1RateControlInfoKHR#flags} field. */
        @NativeType("VkVideoEncodeAV1RateControlFlagsKHR")
        public int flags() { return VkVideoEncodeAV1RateControlInfoKHR.nflags(address()); }
        /** @return the value of the {@link VkVideoEncodeAV1RateControlInfoKHR#gopFrameCount} field. */
        @NativeType("uint32_t")
        public int gopFrameCount() { return VkVideoEncodeAV1RateControlInfoKHR.ngopFrameCount(address()); }
        /** @return the value of the {@link VkVideoEncodeAV1RateControlInfoKHR#keyFramePeriod} field. */
        @NativeType("uint32_t")
        public int keyFramePeriod() { return VkVideoEncodeAV1RateControlInfoKHR.nkeyFramePeriod(address()); }
        /** @return the value of the {@link VkVideoEncodeAV1RateControlInfoKHR#consecutiveBipredictiveFrameCount} field. */
        @NativeType("uint32_t")
        public int consecutiveBipredictiveFrameCount() { return VkVideoEncodeAV1RateControlInfoKHR.nconsecutiveBipredictiveFrameCount(address()); }
        /** @return the value of the {@link VkVideoEncodeAV1RateControlInfoKHR#temporalLayerCount} field. */
        @NativeType("uint32_t")
        public int temporalLayerCount() { return VkVideoEncodeAV1RateControlInfoKHR.ntemporalLayerCount(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeAV1RateControlInfoKHR#sType} field. */
        public VkVideoEncodeAV1RateControlInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeAV1RateControlInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeAV1#VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_RATE_CONTROL_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_AV1_RATE_CONTROL_INFO_KHR} value to the {@link VkVideoEncodeAV1RateControlInfoKHR#sType} field. */
        public VkVideoEncodeAV1RateControlInfoKHR.Buffer sType$Default() { return sType(KHRVideoEncodeAV1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_RATE_CONTROL_INFO_KHR); }
        /** Sets the specified value to the {@link VkVideoEncodeAV1RateControlInfoKHR#pNext} field. */
        public VkVideoEncodeAV1RateControlInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeAV1RateControlInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeAV1RateControlInfoKHR#flags} field. */
        public VkVideoEncodeAV1RateControlInfoKHR.Buffer flags(@NativeType("VkVideoEncodeAV1RateControlFlagsKHR") int value) { VkVideoEncodeAV1RateControlInfoKHR.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeAV1RateControlInfoKHR#gopFrameCount} field. */
        public VkVideoEncodeAV1RateControlInfoKHR.Buffer gopFrameCount(@NativeType("uint32_t") int value) { VkVideoEncodeAV1RateControlInfoKHR.ngopFrameCount(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeAV1RateControlInfoKHR#keyFramePeriod} field. */
        public VkVideoEncodeAV1RateControlInfoKHR.Buffer keyFramePeriod(@NativeType("uint32_t") int value) { VkVideoEncodeAV1RateControlInfoKHR.nkeyFramePeriod(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeAV1RateControlInfoKHR#consecutiveBipredictiveFrameCount} field. */
        public VkVideoEncodeAV1RateControlInfoKHR.Buffer consecutiveBipredictiveFrameCount(@NativeType("uint32_t") int value) { VkVideoEncodeAV1RateControlInfoKHR.nconsecutiveBipredictiveFrameCount(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeAV1RateControlInfoKHR#temporalLayerCount} field. */
        public VkVideoEncodeAV1RateControlInfoKHR.Buffer temporalLayerCount(@NativeType("uint32_t") int value) { VkVideoEncodeAV1RateControlInfoKHR.ntemporalLayerCount(address(), value); return this; }

    }

}