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
 * Structure to set encode rate control parameters.
 * 
 * <h5>Description</h5>
 * 
 * <p>A codec-specific extension structure for further rate control parameter settings <b>may</b> be chained to {@link VkVideoEncodeRateControlInfoKHR}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoEncodeQueue#VK_STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_INFO_KHR}</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkVideoEncodeRateControlFlagBitsKHR} values</li>
 * <li>{@code flags} <b>must</b> not be 0</li>
 * <li>{@code rateControlMode} <b>must</b> be a valid {@code VkVideoEncodeRateControlModeFlagBitsKHR} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeRateControlInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkVideoEncodeRateControlFlagsKHR {@link #flags};
 *     VkVideoEncodeRateControlModeFlagBitsKHR {@link #rateControlMode};
 *     uint32_t {@link #averageBitrate};
 *     uint16_t {@link #peakToAverageBitrateRatio};
 *     uint16_t {@link #frameRateNumerator};
 *     uint16_t {@link #frameRateDenominator};
 *     uint32_t {@link #virtualBufferSizeInMs};
 * }</code></pre>
 */
public class VkVideoEncodeRateControlInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        RATECONTROLMODE,
        AVERAGEBITRATE,
        PEAKTOAVERAGEBITRATERATIO,
        FRAMERATENUMERATOR,
        FRAMERATEDENOMINATOR,
        VIRTUALBUFFERSIZEINMS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(2),
            __member(2),
            __member(2),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        RATECONTROLMODE = layout.offsetof(3);
        AVERAGEBITRATE = layout.offsetof(4);
        PEAKTOAVERAGEBITRATERATIO = layout.offsetof(5);
        FRAMERATENUMERATOR = layout.offsetof(6);
        FRAMERATEDENOMINATOR = layout.offsetof(7);
        VIRTUALBUFFERSIZEINMS = layout.offsetof(8);
    }

    /**
     * Creates a {@code VkVideoEncodeRateControlInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeRateControlInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a bitmask of {@code VkVideoEncodeRateControlModeFlagBitsKHR} specifying encode rate control flags. */
    @NativeType("VkVideoEncodeRateControlFlagsKHR")
    public int flags() { return nflags(address()); }
    /** a {@code VkVideoEncodeRateControlModeFlagBitsKHR} value specifying the encode rate control mode. */
    @NativeType("VkVideoEncodeRateControlModeFlagBitsKHR")
    public int rateControlMode() { return nrateControlMode(address()); }
    /** the average bitrate in bits/second. Valid when rate control is not {@link KHRVideoEncodeQueue#VK_VIDEO_ENCODE_RATE_CONTROL_MODE_NONE_BIT_KHR VIDEO_ENCODE_RATE_CONTROL_MODE_NONE_BIT_KHR}. */
    @NativeType("uint32_t")
    public int averageBitrate() { return naverageBitrate(address()); }
    /** the peak bitrate to average bitrate in percentage. Valid when rate control is {@link KHRVideoEncodeQueue#VK_VIDEO_ENCODE_RATE_CONTROL_MODE_VBR_BIT_KHR VIDEO_ENCODE_RATE_CONTROL_MODE_VBR_BIT_KHR}. */
    @NativeType("uint16_t")
    public short peakToAverageBitrateRatio() { return npeakToAverageBitrateRatio(address()); }
    /** the numerator of the frame rate. Valid when rate control is not {@link KHRVideoEncodeQueue#VK_VIDEO_ENCODE_RATE_CONTROL_MODE_NONE_BIT_KHR VIDEO_ENCODE_RATE_CONTROL_MODE_NONE_BIT_KHR}. */
    @NativeType("uint16_t")
    public short frameRateNumerator() { return nframeRateNumerator(address()); }
    /** the denominator of the frame rate. Valid when rate control is not {@link KHRVideoEncodeQueue#VK_VIDEO_ENCODE_RATE_CONTROL_MODE_NONE_BIT_KHR VIDEO_ENCODE_RATE_CONTROL_MODE_NONE_BIT_KHR}. */
    @NativeType("uint16_t")
    public short frameRateDenominator() { return nframeRateDenominator(address()); }
    /** the leaky bucket model virtual buffer size in milliseconds, with respect to peak bitrate. Valid when rate control is not {@link KHRVideoEncodeQueue#VK_VIDEO_ENCODE_RATE_CONTROL_MODE_NONE_BIT_KHR VIDEO_ENCODE_RATE_CONTROL_MODE_NONE_BIT_KHR}. For example, virtual buffer size is ({@code virtualBufferSizeInMs} * {@code peakToAverageBitrateRatio} * {@code averageBitrate} / 100000). */
    @NativeType("uint32_t")
    public int virtualBufferSizeInMs() { return nvirtualBufferSizeInMs(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeRateControlInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeQueue#VK_STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_INFO_KHR} value to the {@link #sType} field. */
    public VkVideoEncodeRateControlInfoKHR sType$Default() { return sType(KHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeRateControlInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkVideoEncodeRateControlInfoKHR flags(@NativeType("VkVideoEncodeRateControlFlagsKHR") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #rateControlMode} field. */
    public VkVideoEncodeRateControlInfoKHR rateControlMode(@NativeType("VkVideoEncodeRateControlModeFlagBitsKHR") int value) { nrateControlMode(address(), value); return this; }
    /** Sets the specified value to the {@link #averageBitrate} field. */
    public VkVideoEncodeRateControlInfoKHR averageBitrate(@NativeType("uint32_t") int value) { naverageBitrate(address(), value); return this; }
    /** Sets the specified value to the {@link #peakToAverageBitrateRatio} field. */
    public VkVideoEncodeRateControlInfoKHR peakToAverageBitrateRatio(@NativeType("uint16_t") short value) { npeakToAverageBitrateRatio(address(), value); return this; }
    /** Sets the specified value to the {@link #frameRateNumerator} field. */
    public VkVideoEncodeRateControlInfoKHR frameRateNumerator(@NativeType("uint16_t") short value) { nframeRateNumerator(address(), value); return this; }
    /** Sets the specified value to the {@link #frameRateDenominator} field. */
    public VkVideoEncodeRateControlInfoKHR frameRateDenominator(@NativeType("uint16_t") short value) { nframeRateDenominator(address(), value); return this; }
    /** Sets the specified value to the {@link #virtualBufferSizeInMs} field. */
    public VkVideoEncodeRateControlInfoKHR virtualBufferSizeInMs(@NativeType("uint32_t") int value) { nvirtualBufferSizeInMs(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeRateControlInfoKHR set(
        int sType,
        long pNext,
        int flags,
        int rateControlMode,
        int averageBitrate,
        short peakToAverageBitrateRatio,
        short frameRateNumerator,
        short frameRateDenominator,
        int virtualBufferSizeInMs
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        rateControlMode(rateControlMode);
        averageBitrate(averageBitrate);
        peakToAverageBitrateRatio(peakToAverageBitrateRatio);
        frameRateNumerator(frameRateNumerator);
        frameRateDenominator(frameRateDenominator);
        virtualBufferSizeInMs(virtualBufferSizeInMs);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeRateControlInfoKHR set(VkVideoEncodeRateControlInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeRateControlInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeRateControlInfoKHR malloc() {
        return wrap(VkVideoEncodeRateControlInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeRateControlInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeRateControlInfoKHR calloc() {
        return wrap(VkVideoEncodeRateControlInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeRateControlInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeRateControlInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoEncodeRateControlInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeRateControlInfoKHR} instance for the specified memory address. */
    public static VkVideoEncodeRateControlInfoKHR create(long address) {
        return wrap(VkVideoEncodeRateControlInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeRateControlInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoEncodeRateControlInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkVideoEncodeRateControlInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeRateControlInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeRateControlInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeRateControlInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeRateControlInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeRateControlInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoEncodeRateControlInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeRateControlInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeRateControlInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }


    /**
     * Returns a new {@code VkVideoEncodeRateControlInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeRateControlInfoKHR malloc(MemoryStack stack) {
        return wrap(VkVideoEncodeRateControlInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoEncodeRateControlInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeRateControlInfoKHR calloc(MemoryStack stack) {
        return wrap(VkVideoEncodeRateControlInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoEncodeRateControlInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeRateControlInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeRateControlInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeRateControlInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeRateControlInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeRateControlInfoKHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeRateControlInfoKHR.FLAGS); }
    /** Unsafe version of {@link #rateControlMode}. */
    public static int nrateControlMode(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeRateControlInfoKHR.RATECONTROLMODE); }
    /** Unsafe version of {@link #averageBitrate}. */
    public static int naverageBitrate(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeRateControlInfoKHR.AVERAGEBITRATE); }
    /** Unsafe version of {@link #peakToAverageBitrateRatio}. */
    public static short npeakToAverageBitrateRatio(long struct) { return UNSAFE.getShort(null, struct + VkVideoEncodeRateControlInfoKHR.PEAKTOAVERAGEBITRATERATIO); }
    /** Unsafe version of {@link #frameRateNumerator}. */
    public static short nframeRateNumerator(long struct) { return UNSAFE.getShort(null, struct + VkVideoEncodeRateControlInfoKHR.FRAMERATENUMERATOR); }
    /** Unsafe version of {@link #frameRateDenominator}. */
    public static short nframeRateDenominator(long struct) { return UNSAFE.getShort(null, struct + VkVideoEncodeRateControlInfoKHR.FRAMERATEDENOMINATOR); }
    /** Unsafe version of {@link #virtualBufferSizeInMs}. */
    public static int nvirtualBufferSizeInMs(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeRateControlInfoKHR.VIRTUALBUFFERSIZEINMS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeRateControlInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeRateControlInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeRateControlInfoKHR.FLAGS, value); }
    /** Unsafe version of {@link #rateControlMode(int) rateControlMode}. */
    public static void nrateControlMode(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeRateControlInfoKHR.RATECONTROLMODE, value); }
    /** Unsafe version of {@link #averageBitrate(int) averageBitrate}. */
    public static void naverageBitrate(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeRateControlInfoKHR.AVERAGEBITRATE, value); }
    /** Unsafe version of {@link #peakToAverageBitrateRatio(short) peakToAverageBitrateRatio}. */
    public static void npeakToAverageBitrateRatio(long struct, short value) { UNSAFE.putShort(null, struct + VkVideoEncodeRateControlInfoKHR.PEAKTOAVERAGEBITRATERATIO, value); }
    /** Unsafe version of {@link #frameRateNumerator(short) frameRateNumerator}. */
    public static void nframeRateNumerator(long struct, short value) { UNSAFE.putShort(null, struct + VkVideoEncodeRateControlInfoKHR.FRAMERATENUMERATOR, value); }
    /** Unsafe version of {@link #frameRateDenominator(short) frameRateDenominator}. */
    public static void nframeRateDenominator(long struct, short value) { UNSAFE.putShort(null, struct + VkVideoEncodeRateControlInfoKHR.FRAMERATEDENOMINATOR, value); }
    /** Unsafe version of {@link #virtualBufferSizeInMs(int) virtualBufferSizeInMs}. */
    public static void nvirtualBufferSizeInMs(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeRateControlInfoKHR.VIRTUALBUFFERSIZEINMS, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeRateControlInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeRateControlInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeRateControlInfoKHR ELEMENT_FACTORY = VkVideoEncodeRateControlInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeRateControlInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeRateControlInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkVideoEncodeRateControlInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeRateControlInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeRateControlInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeRateControlInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeRateControlInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeRateControlInfoKHR#flags} field. */
        @NativeType("VkVideoEncodeRateControlFlagsKHR")
        public int flags() { return VkVideoEncodeRateControlInfoKHR.nflags(address()); }
        /** @return the value of the {@link VkVideoEncodeRateControlInfoKHR#rateControlMode} field. */
        @NativeType("VkVideoEncodeRateControlModeFlagBitsKHR")
        public int rateControlMode() { return VkVideoEncodeRateControlInfoKHR.nrateControlMode(address()); }
        /** @return the value of the {@link VkVideoEncodeRateControlInfoKHR#averageBitrate} field. */
        @NativeType("uint32_t")
        public int averageBitrate() { return VkVideoEncodeRateControlInfoKHR.naverageBitrate(address()); }
        /** @return the value of the {@link VkVideoEncodeRateControlInfoKHR#peakToAverageBitrateRatio} field. */
        @NativeType("uint16_t")
        public short peakToAverageBitrateRatio() { return VkVideoEncodeRateControlInfoKHR.npeakToAverageBitrateRatio(address()); }
        /** @return the value of the {@link VkVideoEncodeRateControlInfoKHR#frameRateNumerator} field. */
        @NativeType("uint16_t")
        public short frameRateNumerator() { return VkVideoEncodeRateControlInfoKHR.nframeRateNumerator(address()); }
        /** @return the value of the {@link VkVideoEncodeRateControlInfoKHR#frameRateDenominator} field. */
        @NativeType("uint16_t")
        public short frameRateDenominator() { return VkVideoEncodeRateControlInfoKHR.nframeRateDenominator(address()); }
        /** @return the value of the {@link VkVideoEncodeRateControlInfoKHR#virtualBufferSizeInMs} field. */
        @NativeType("uint32_t")
        public int virtualBufferSizeInMs() { return VkVideoEncodeRateControlInfoKHR.nvirtualBufferSizeInMs(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeRateControlInfoKHR#sType} field. */
        public VkVideoEncodeRateControlInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeRateControlInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeQueue#VK_STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_INFO_KHR} value to the {@link VkVideoEncodeRateControlInfoKHR#sType} field. */
        public VkVideoEncodeRateControlInfoKHR.Buffer sType$Default() { return sType(KHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_INFO_KHR); }
        /** Sets the specified value to the {@link VkVideoEncodeRateControlInfoKHR#pNext} field. */
        public VkVideoEncodeRateControlInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeRateControlInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeRateControlInfoKHR#flags} field. */
        public VkVideoEncodeRateControlInfoKHR.Buffer flags(@NativeType("VkVideoEncodeRateControlFlagsKHR") int value) { VkVideoEncodeRateControlInfoKHR.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeRateControlInfoKHR#rateControlMode} field. */
        public VkVideoEncodeRateControlInfoKHR.Buffer rateControlMode(@NativeType("VkVideoEncodeRateControlModeFlagBitsKHR") int value) { VkVideoEncodeRateControlInfoKHR.nrateControlMode(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeRateControlInfoKHR#averageBitrate} field. */
        public VkVideoEncodeRateControlInfoKHR.Buffer averageBitrate(@NativeType("uint32_t") int value) { VkVideoEncodeRateControlInfoKHR.naverageBitrate(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeRateControlInfoKHR#peakToAverageBitrateRatio} field. */
        public VkVideoEncodeRateControlInfoKHR.Buffer peakToAverageBitrateRatio(@NativeType("uint16_t") short value) { VkVideoEncodeRateControlInfoKHR.npeakToAverageBitrateRatio(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeRateControlInfoKHR#frameRateNumerator} field. */
        public VkVideoEncodeRateControlInfoKHR.Buffer frameRateNumerator(@NativeType("uint16_t") short value) { VkVideoEncodeRateControlInfoKHR.nframeRateNumerator(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeRateControlInfoKHR#frameRateDenominator} field. */
        public VkVideoEncodeRateControlInfoKHR.Buffer frameRateDenominator(@NativeType("uint16_t") short value) { VkVideoEncodeRateControlInfoKHR.nframeRateDenominator(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeRateControlInfoKHR#virtualBufferSizeInMs} field. */
        public VkVideoEncodeRateControlInfoKHR.Buffer virtualBufferSizeInMs(@NativeType("uint32_t") int value) { VkVideoEncodeRateControlInfoKHR.nvirtualBufferSizeInMs(address(), value); return this; }

    }

}