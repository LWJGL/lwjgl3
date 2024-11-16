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
 * Structure describing H.265 stream rate control parameters.
 * 
 * <h5>Description</h5>
 * 
 * <p>When an instance of this structure is included in the {@code pNext} chain of the {@link VkVideoCodingControlInfoKHR} structure passed to the {@link KHRVideoQueue#vkCmdControlVideoCodingKHR CmdControlVideoCodingKHR} command, and {@link VkVideoCodingControlInfoKHR}{@code ::flags} includes {@link KHRVideoEncodeQueue#VK_VIDEO_CODING_CONTROL_ENCODE_RATE_CONTROL_BIT_KHR VIDEO_CODING_CONTROL_ENCODE_RATE_CONTROL_BIT_KHR}, the parameters in this structure are used as guidance for the implementation’s rate control algorithm (see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-coding-control">Video Coding Control</a>).</p>
 * 
 * <p>If {@code flags} includes {@link KHRVideoEncodeH265#VK_VIDEO_ENCODE_H265_RATE_CONTROL_ATTEMPT_HRD_COMPLIANCE_BIT_KHR VIDEO_ENCODE_H265_RATE_CONTROL_ATTEMPT_HRD_COMPLIANCE_BIT_KHR}, then the rate control state is reset to an initial state to meet HRD compliance requirements. Otherwise the new rate control state <b>may</b> be applied without a reset depending on the implementation and the specified rate control parameters.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>It would be possible to infer the picture type to be used when encoding a frame, on the basis of the values provided for {@code consecutiveBFrameCount}, {@code idrPeriod}, and {@code gopFrameCount}, but this inferred picture type will not be used by implementations to override the picture type provided to the video encode operation.</p>
 * </div>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@link VkVideoEncodeH265CapabilitiesKHR}{@code ::flags}, as returned by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} for the used video profile, does not include {@link KHRVideoEncodeH265#VK_VIDEO_ENCODE_H265_CAPABILITY_HRD_COMPLIANCE_BIT_KHR VIDEO_ENCODE_H265_CAPABILITY_HRD_COMPLIANCE_BIT_KHR}, then {@code flags} <b>must</b> not contain {@link KHRVideoEncodeH265#VK_VIDEO_ENCODE_H265_RATE_CONTROL_ATTEMPT_HRD_COMPLIANCE_BIT_KHR VIDEO_ENCODE_H265_RATE_CONTROL_ATTEMPT_HRD_COMPLIANCE_BIT_KHR}</li>
 * <li>If {@code flags} contains {@link KHRVideoEncodeH265#VK_VIDEO_ENCODE_H265_RATE_CONTROL_REFERENCE_PATTERN_FLAT_BIT_KHR VIDEO_ENCODE_H265_RATE_CONTROL_REFERENCE_PATTERN_FLAT_BIT_KHR} or {@link KHRVideoEncodeH265#VK_VIDEO_ENCODE_H265_RATE_CONTROL_REFERENCE_PATTERN_DYADIC_BIT_KHR VIDEO_ENCODE_H265_RATE_CONTROL_REFERENCE_PATTERN_DYADIC_BIT_KHR}, then it <b>must</b> also contain {@link KHRVideoEncodeH265#VK_VIDEO_ENCODE_H265_RATE_CONTROL_REGULAR_GOP_BIT_KHR VIDEO_ENCODE_H265_RATE_CONTROL_REGULAR_GOP_BIT_KHR}</li>
 * <li>If {@code flags} contains {@link KHRVideoEncodeH265#VK_VIDEO_ENCODE_H265_RATE_CONTROL_REFERENCE_PATTERN_FLAT_BIT_KHR VIDEO_ENCODE_H265_RATE_CONTROL_REFERENCE_PATTERN_FLAT_BIT_KHR}, then it <b>must</b> not also contain {@link KHRVideoEncodeH265#VK_VIDEO_ENCODE_H265_RATE_CONTROL_REFERENCE_PATTERN_DYADIC_BIT_KHR VIDEO_ENCODE_H265_RATE_CONTROL_REFERENCE_PATTERN_DYADIC_BIT_KHR}</li>
 * <li>If {@code flags} contains {@link KHRVideoEncodeH265#VK_VIDEO_ENCODE_H265_RATE_CONTROL_REGULAR_GOP_BIT_KHR VIDEO_ENCODE_H265_RATE_CONTROL_REGULAR_GOP_BIT_KHR}, then {@code gopFrameCount} <b>must</b> be greater than 0</li>
 * <li>If {@code idrPeriod} is not 0, then it <b>must</b> be greater than or equal to {@code gopFrameCount}</li>
 * <li>If {@code consecutiveBFrameCount} is not 0, then it <b>must</b> be less than {@code gopFrameCount}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_RATE_CONTROL_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H265_RATE_CONTROL_INFO_KHR}</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkVideoEncodeH265RateControlFlagBitsKHR} values</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH265RateControlInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkVideoEncodeH265RateControlFlagsKHR {@link #flags};
 *     uint32_t {@link #gopFrameCount};
 *     uint32_t {@link #idrPeriod};
 *     uint32_t {@link #consecutiveBFrameCount};
 *     uint32_t {@link #subLayerCount};
 * }</code></pre>
 */
public class VkVideoEncodeH265RateControlInfoKHR extends Struct<VkVideoEncodeH265RateControlInfoKHR> implements NativeResource {

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
        IDRPERIOD,
        CONSECUTIVEBFRAMECOUNT,
        SUBLAYERCOUNT;

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
        IDRPERIOD = layout.offsetof(4);
        CONSECUTIVEBFRAMECOUNT = layout.offsetof(5);
        SUBLAYERCOUNT = layout.offsetof(6);
    }

    protected VkVideoEncodeH265RateControlInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeH265RateControlInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH265RateControlInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeH265RateControlInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH265RateControlInfoKHR(ByteBuffer container) {
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
    /** a bitmask of {@code VkVideoEncodeH265RateControlFlagBitsKHR} specifying H.265 rate control flags. */
    @NativeType("VkVideoEncodeH265RateControlFlagsKHR")
    public int flags() { return nflags(address()); }
    /** the number of frames within a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-h265-gop">group of pictures (GOP)</a> intended to be used by the application. If it is set to 0, the rate control algorithm <b>may</b> assume an implementation-dependent GOP length. If it is set to {@code UINT32_MAX}, the GOP length is treated as infinite. */
    @NativeType("uint32_t")
    public int gopFrameCount() { return ngopFrameCount(address()); }
    /** the interval, in terms of number of frames, between two <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-h265-idr-pic">IDR frames</a> (see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-h265-idr-period">IDR period</a>). If it is set to 0, the rate control algorithm <b>may</b> assume an implementation-dependent IDR period. If it is set to {@code UINT32_MAX}, the IDR period is treated as infinite. */
    @NativeType("uint32_t")
    public int idrPeriod() { return nidrPeriod(address()); }
    /** the number of consecutive B frames between I and/or P frames within the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-h265-gop">GOP</a>. */
    @NativeType("uint32_t")
    public int consecutiveBFrameCount() { return nconsecutiveBFrameCount(address()); }
    /** specifies the number of H.265 sub-layers that the application intends to use. */
    @NativeType("uint32_t")
    public int subLayerCount() { return nsubLayerCount(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeH265RateControlInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_RATE_CONTROL_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H265_RATE_CONTROL_INFO_KHR} value to the {@link #sType} field. */
    public VkVideoEncodeH265RateControlInfoKHR sType$Default() { return sType(KHRVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_RATE_CONTROL_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeH265RateControlInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkVideoEncodeH265RateControlInfoKHR flags(@NativeType("VkVideoEncodeH265RateControlFlagsKHR") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #gopFrameCount} field. */
    public VkVideoEncodeH265RateControlInfoKHR gopFrameCount(@NativeType("uint32_t") int value) { ngopFrameCount(address(), value); return this; }
    /** Sets the specified value to the {@link #idrPeriod} field. */
    public VkVideoEncodeH265RateControlInfoKHR idrPeriod(@NativeType("uint32_t") int value) { nidrPeriod(address(), value); return this; }
    /** Sets the specified value to the {@link #consecutiveBFrameCount} field. */
    public VkVideoEncodeH265RateControlInfoKHR consecutiveBFrameCount(@NativeType("uint32_t") int value) { nconsecutiveBFrameCount(address(), value); return this; }
    /** Sets the specified value to the {@link #subLayerCount} field. */
    public VkVideoEncodeH265RateControlInfoKHR subLayerCount(@NativeType("uint32_t") int value) { nsubLayerCount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH265RateControlInfoKHR set(
        int sType,
        long pNext,
        int flags,
        int gopFrameCount,
        int idrPeriod,
        int consecutiveBFrameCount,
        int subLayerCount
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        gopFrameCount(gopFrameCount);
        idrPeriod(idrPeriod);
        consecutiveBFrameCount(consecutiveBFrameCount);
        subLayerCount(subLayerCount);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeH265RateControlInfoKHR set(VkVideoEncodeH265RateControlInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH265RateControlInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265RateControlInfoKHR malloc() {
        return new VkVideoEncodeH265RateControlInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265RateControlInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265RateControlInfoKHR calloc() {
        return new VkVideoEncodeH265RateControlInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265RateControlInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH265RateControlInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH265RateControlInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH265RateControlInfoKHR} instance for the specified memory address. */
    public static VkVideoEncodeH265RateControlInfoKHR create(long address) {
        return new VkVideoEncodeH265RateControlInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoEncodeH265RateControlInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeH265RateControlInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265RateControlInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265RateControlInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265RateControlInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265RateControlInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265RateControlInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265RateControlInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeH265RateControlInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265RateControlInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoEncodeH265RateControlInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265RateControlInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265RateControlInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeH265RateControlInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265RateControlInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265RateControlInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeH265RateControlInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265RateControlInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265RateControlInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265RateControlInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265RateControlInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoEncodeH265RateControlInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH265RateControlInfoKHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkVideoEncodeH265RateControlInfoKHR.FLAGS); }
    /** Unsafe version of {@link #gopFrameCount}. */
    public static int ngopFrameCount(long struct) { return memGetInt(struct + VkVideoEncodeH265RateControlInfoKHR.GOPFRAMECOUNT); }
    /** Unsafe version of {@link #idrPeriod}. */
    public static int nidrPeriod(long struct) { return memGetInt(struct + VkVideoEncodeH265RateControlInfoKHR.IDRPERIOD); }
    /** Unsafe version of {@link #consecutiveBFrameCount}. */
    public static int nconsecutiveBFrameCount(long struct) { return memGetInt(struct + VkVideoEncodeH265RateControlInfoKHR.CONSECUTIVEBFRAMECOUNT); }
    /** Unsafe version of {@link #subLayerCount}. */
    public static int nsubLayerCount(long struct) { return memGetInt(struct + VkVideoEncodeH265RateControlInfoKHR.SUBLAYERCOUNT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoEncodeH265RateControlInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH265RateControlInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkVideoEncodeH265RateControlInfoKHR.FLAGS, value); }
    /** Unsafe version of {@link #gopFrameCount(int) gopFrameCount}. */
    public static void ngopFrameCount(long struct, int value) { memPutInt(struct + VkVideoEncodeH265RateControlInfoKHR.GOPFRAMECOUNT, value); }
    /** Unsafe version of {@link #idrPeriod(int) idrPeriod}. */
    public static void nidrPeriod(long struct, int value) { memPutInt(struct + VkVideoEncodeH265RateControlInfoKHR.IDRPERIOD, value); }
    /** Unsafe version of {@link #consecutiveBFrameCount(int) consecutiveBFrameCount}. */
    public static void nconsecutiveBFrameCount(long struct, int value) { memPutInt(struct + VkVideoEncodeH265RateControlInfoKHR.CONSECUTIVEBFRAMECOUNT, value); }
    /** Unsafe version of {@link #subLayerCount(int) subLayerCount}. */
    public static void nsubLayerCount(long struct, int value) { memPutInt(struct + VkVideoEncodeH265RateControlInfoKHR.SUBLAYERCOUNT, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH265RateControlInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265RateControlInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeH265RateControlInfoKHR ELEMENT_FACTORY = VkVideoEncodeH265RateControlInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH265RateControlInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH265RateControlInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeH265RateControlInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeH265RateControlInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH265RateControlInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeH265RateControlInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH265RateControlInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeH265RateControlInfoKHR#flags} field. */
        @NativeType("VkVideoEncodeH265RateControlFlagsKHR")
        public int flags() { return VkVideoEncodeH265RateControlInfoKHR.nflags(address()); }
        /** @return the value of the {@link VkVideoEncodeH265RateControlInfoKHR#gopFrameCount} field. */
        @NativeType("uint32_t")
        public int gopFrameCount() { return VkVideoEncodeH265RateControlInfoKHR.ngopFrameCount(address()); }
        /** @return the value of the {@link VkVideoEncodeH265RateControlInfoKHR#idrPeriod} field. */
        @NativeType("uint32_t")
        public int idrPeriod() { return VkVideoEncodeH265RateControlInfoKHR.nidrPeriod(address()); }
        /** @return the value of the {@link VkVideoEncodeH265RateControlInfoKHR#consecutiveBFrameCount} field. */
        @NativeType("uint32_t")
        public int consecutiveBFrameCount() { return VkVideoEncodeH265RateControlInfoKHR.nconsecutiveBFrameCount(address()); }
        /** @return the value of the {@link VkVideoEncodeH265RateControlInfoKHR#subLayerCount} field. */
        @NativeType("uint32_t")
        public int subLayerCount() { return VkVideoEncodeH265RateControlInfoKHR.nsubLayerCount(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeH265RateControlInfoKHR#sType} field. */
        public VkVideoEncodeH265RateControlInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH265RateControlInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_RATE_CONTROL_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H265_RATE_CONTROL_INFO_KHR} value to the {@link VkVideoEncodeH265RateControlInfoKHR#sType} field. */
        public VkVideoEncodeH265RateControlInfoKHR.Buffer sType$Default() { return sType(KHRVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_RATE_CONTROL_INFO_KHR); }
        /** Sets the specified value to the {@link VkVideoEncodeH265RateControlInfoKHR#pNext} field. */
        public VkVideoEncodeH265RateControlInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH265RateControlInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265RateControlInfoKHR#flags} field. */
        public VkVideoEncodeH265RateControlInfoKHR.Buffer flags(@NativeType("VkVideoEncodeH265RateControlFlagsKHR") int value) { VkVideoEncodeH265RateControlInfoKHR.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265RateControlInfoKHR#gopFrameCount} field. */
        public VkVideoEncodeH265RateControlInfoKHR.Buffer gopFrameCount(@NativeType("uint32_t") int value) { VkVideoEncodeH265RateControlInfoKHR.ngopFrameCount(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265RateControlInfoKHR#idrPeriod} field. */
        public VkVideoEncodeH265RateControlInfoKHR.Buffer idrPeriod(@NativeType("uint32_t") int value) { VkVideoEncodeH265RateControlInfoKHR.nidrPeriod(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265RateControlInfoKHR#consecutiveBFrameCount} field. */
        public VkVideoEncodeH265RateControlInfoKHR.Buffer consecutiveBFrameCount(@NativeType("uint32_t") int value) { VkVideoEncodeH265RateControlInfoKHR.nconsecutiveBFrameCount(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265RateControlInfoKHR#subLayerCount} field. */
        public VkVideoEncodeH265RateControlInfoKHR.Buffer subLayerCount(@NativeType("uint32_t") int value) { VkVideoEncodeH265RateControlInfoKHR.nsubLayerCount(address(), value); return this; }

    }

}