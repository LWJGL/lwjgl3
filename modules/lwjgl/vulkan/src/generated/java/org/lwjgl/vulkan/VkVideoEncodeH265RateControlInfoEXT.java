/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

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
 * <p>In order to provide H.265-specific stream rate control parameters, add a {@link VkVideoEncodeH265RateControlInfoEXT} structure to the {@code pNext} chain of the {@link VkVideoEncodeRateControlInfoKHR} structure in the {@code pNext} chain of the {@link VkVideoCodingControlInfoKHR} structure passed to the {@link KHRVideoQueue#vkCmdControlVideoCodingKHR CmdControlVideoCodingKHR} command.</p>
 * 
 * <p>The parameters from this structure act as a guidance for implementations to apply various rate control heuristics.</p>
 * 
 * <p>It is possible to infer the picture type to be used when encoding a frame, on the basis of the values provided for {@code consecutiveBFrameCount}, {@code idrPeriod}, and {@code gopFrameCount}, but this inferred picture type will not be used by implementations to override the picture type provided in {@link KHRVideoEncodeQueue#vkCmdEncodeVideoKHR CmdEncodeVideoKHR}. Additionally, it is not required for the video session to be reset if the inferred picture type does not match the actual picture type.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_RATE_CONTROL_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_RATE_CONTROL_INFO_EXT}</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkVideoEncodeH265RateControlFlagBitsEXT} values</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH265RateControlInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkVideoEncodeH265RateControlFlagsEXT {@link #flags};
 *     uint32_t {@link #gopFrameCount};
 *     uint32_t {@link #idrPeriod};
 *     uint32_t {@link #consecutiveBFrameCount};
 *     uint32_t {@link #subLayerCount};
 * }</code></pre>
 */
public class VkVideoEncodeH265RateControlInfoEXT extends Struct<VkVideoEncodeH265RateControlInfoEXT> implements NativeResource {

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

    protected VkVideoEncodeH265RateControlInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeH265RateControlInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH265RateControlInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeH265RateControlInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH265RateControlInfoEXT(ByteBuffer container) {
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
    /** a bitmask of {@code VkVideoEncodeH265RateControlFlagBitsEXT} specifying H.265 rate control flags. */
    @NativeType("VkVideoEncodeH265RateControlFlagsEXT")
    public int flags() { return nflags(address()); }
    /** the number of frames contained within the group of pictures (GOP), starting from an intra frame and until the next intra frame. If it is set to 0, the implementation chooses a suitable value. If it is set to {@code UINT32_MAX}, the GOP length is treated as infinite. */
    @NativeType("uint32_t")
    public int gopFrameCount() { return ngopFrameCount(address()); }
    /** the interval, in terms of number of frames, between two IDR frames. If it is set to 0, the implementation chooses a suitable value. If it is set to {@code UINT32_MAX}, the IDR period is treated as infinite. */
    @NativeType("uint32_t")
    public int idrPeriod() { return nidrPeriod(address()); }
    /** the number of consecutive B-frames between I- and/or P-frames within the GOP. */
    @NativeType("uint32_t")
    public int consecutiveBFrameCount() { return nconsecutiveBFrameCount(address()); }
    /** specifies the number of sub layers enabled in the stream. */
    @NativeType("uint32_t")
    public int subLayerCount() { return nsubLayerCount(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeH265RateControlInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_RATE_CONTROL_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_RATE_CONTROL_INFO_EXT} value to the {@link #sType} field. */
    public VkVideoEncodeH265RateControlInfoEXT sType$Default() { return sType(EXTVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_RATE_CONTROL_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeH265RateControlInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkVideoEncodeH265RateControlInfoEXT flags(@NativeType("VkVideoEncodeH265RateControlFlagsEXT") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #gopFrameCount} field. */
    public VkVideoEncodeH265RateControlInfoEXT gopFrameCount(@NativeType("uint32_t") int value) { ngopFrameCount(address(), value); return this; }
    /** Sets the specified value to the {@link #idrPeriod} field. */
    public VkVideoEncodeH265RateControlInfoEXT idrPeriod(@NativeType("uint32_t") int value) { nidrPeriod(address(), value); return this; }
    /** Sets the specified value to the {@link #consecutiveBFrameCount} field. */
    public VkVideoEncodeH265RateControlInfoEXT consecutiveBFrameCount(@NativeType("uint32_t") int value) { nconsecutiveBFrameCount(address(), value); return this; }
    /** Sets the specified value to the {@link #subLayerCount} field. */
    public VkVideoEncodeH265RateControlInfoEXT subLayerCount(@NativeType("uint32_t") int value) { nsubLayerCount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH265RateControlInfoEXT set(
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
    public VkVideoEncodeH265RateControlInfoEXT set(VkVideoEncodeH265RateControlInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH265RateControlInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265RateControlInfoEXT malloc() {
        return new VkVideoEncodeH265RateControlInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265RateControlInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265RateControlInfoEXT calloc() {
        return new VkVideoEncodeH265RateControlInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265RateControlInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH265RateControlInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH265RateControlInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH265RateControlInfoEXT} instance for the specified memory address. */
    public static VkVideoEncodeH265RateControlInfoEXT create(long address) {
        return new VkVideoEncodeH265RateControlInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH265RateControlInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeH265RateControlInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265RateControlInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265RateControlInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265RateControlInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265RateControlInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265RateControlInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265RateControlInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeH265RateControlInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265RateControlInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH265RateControlInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265RateControlInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265RateControlInfoEXT malloc(MemoryStack stack) {
        return new VkVideoEncodeH265RateControlInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265RateControlInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265RateControlInfoEXT calloc(MemoryStack stack) {
        return new VkVideoEncodeH265RateControlInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265RateControlInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265RateControlInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265RateControlInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265RateControlInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265RateControlInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH265RateControlInfoEXT.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265RateControlInfoEXT.FLAGS); }
    /** Unsafe version of {@link #gopFrameCount}. */
    public static int ngopFrameCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265RateControlInfoEXT.GOPFRAMECOUNT); }
    /** Unsafe version of {@link #idrPeriod}. */
    public static int nidrPeriod(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265RateControlInfoEXT.IDRPERIOD); }
    /** Unsafe version of {@link #consecutiveBFrameCount}. */
    public static int nconsecutiveBFrameCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265RateControlInfoEXT.CONSECUTIVEBFRAMECOUNT); }
    /** Unsafe version of {@link #subLayerCount}. */
    public static int nsubLayerCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265RateControlInfoEXT.SUBLAYERCOUNT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265RateControlInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH265RateControlInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265RateControlInfoEXT.FLAGS, value); }
    /** Unsafe version of {@link #gopFrameCount(int) gopFrameCount}. */
    public static void ngopFrameCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265RateControlInfoEXT.GOPFRAMECOUNT, value); }
    /** Unsafe version of {@link #idrPeriod(int) idrPeriod}. */
    public static void nidrPeriod(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265RateControlInfoEXT.IDRPERIOD, value); }
    /** Unsafe version of {@link #consecutiveBFrameCount(int) consecutiveBFrameCount}. */
    public static void nconsecutiveBFrameCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265RateControlInfoEXT.CONSECUTIVEBFRAMECOUNT, value); }
    /** Unsafe version of {@link #subLayerCount(int) subLayerCount}. */
    public static void nsubLayerCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265RateControlInfoEXT.SUBLAYERCOUNT, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH265RateControlInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265RateControlInfoEXT, Buffer> implements NativeResource {

        private static final VkVideoEncodeH265RateControlInfoEXT ELEMENT_FACTORY = VkVideoEncodeH265RateControlInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH265RateControlInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH265RateControlInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeH265RateControlInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeH265RateControlInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH265RateControlInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeH265RateControlInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH265RateControlInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeH265RateControlInfoEXT#flags} field. */
        @NativeType("VkVideoEncodeH265RateControlFlagsEXT")
        public int flags() { return VkVideoEncodeH265RateControlInfoEXT.nflags(address()); }
        /** @return the value of the {@link VkVideoEncodeH265RateControlInfoEXT#gopFrameCount} field. */
        @NativeType("uint32_t")
        public int gopFrameCount() { return VkVideoEncodeH265RateControlInfoEXT.ngopFrameCount(address()); }
        /** @return the value of the {@link VkVideoEncodeH265RateControlInfoEXT#idrPeriod} field. */
        @NativeType("uint32_t")
        public int idrPeriod() { return VkVideoEncodeH265RateControlInfoEXT.nidrPeriod(address()); }
        /** @return the value of the {@link VkVideoEncodeH265RateControlInfoEXT#consecutiveBFrameCount} field. */
        @NativeType("uint32_t")
        public int consecutiveBFrameCount() { return VkVideoEncodeH265RateControlInfoEXT.nconsecutiveBFrameCount(address()); }
        /** @return the value of the {@link VkVideoEncodeH265RateControlInfoEXT#subLayerCount} field. */
        @NativeType("uint32_t")
        public int subLayerCount() { return VkVideoEncodeH265RateControlInfoEXT.nsubLayerCount(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeH265RateControlInfoEXT#sType} field. */
        public VkVideoEncodeH265RateControlInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH265RateControlInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_RATE_CONTROL_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_RATE_CONTROL_INFO_EXT} value to the {@link VkVideoEncodeH265RateControlInfoEXT#sType} field. */
        public VkVideoEncodeH265RateControlInfoEXT.Buffer sType$Default() { return sType(EXTVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_RATE_CONTROL_INFO_EXT); }
        /** Sets the specified value to the {@link VkVideoEncodeH265RateControlInfoEXT#pNext} field. */
        public VkVideoEncodeH265RateControlInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH265RateControlInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265RateControlInfoEXT#flags} field. */
        public VkVideoEncodeH265RateControlInfoEXT.Buffer flags(@NativeType("VkVideoEncodeH265RateControlFlagsEXT") int value) { VkVideoEncodeH265RateControlInfoEXT.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265RateControlInfoEXT#gopFrameCount} field. */
        public VkVideoEncodeH265RateControlInfoEXT.Buffer gopFrameCount(@NativeType("uint32_t") int value) { VkVideoEncodeH265RateControlInfoEXT.ngopFrameCount(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265RateControlInfoEXT#idrPeriod} field. */
        public VkVideoEncodeH265RateControlInfoEXT.Buffer idrPeriod(@NativeType("uint32_t") int value) { VkVideoEncodeH265RateControlInfoEXT.nidrPeriod(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265RateControlInfoEXT#consecutiveBFrameCount} field. */
        public VkVideoEncodeH265RateControlInfoEXT.Buffer consecutiveBFrameCount(@NativeType("uint32_t") int value) { VkVideoEncodeH265RateControlInfoEXT.nconsecutiveBFrameCount(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265RateControlInfoEXT#subLayerCount} field. */
        public VkVideoEncodeH265RateControlInfoEXT.Buffer subLayerCount(@NativeType("uint32_t") int value) { VkVideoEncodeH265RateControlInfoEXT.nsubLayerCount(address(), value); return this; }

    }

}