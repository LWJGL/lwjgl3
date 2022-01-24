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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure to set encode per-layer rate control parameters.
 * 
 * <h5>Description</h5>
 * 
 * <p>A codec-specific structure specifying additional per-layer rate control settings <b>must</b> be chained to {@link VkVideoEncodeRateControlLayerInfoKHR}. If multiple rate control layers are enabled ({@link VkVideoEncodeRateControlInfoKHR}{@code ::layerCount} is greater than 1), then the chained codec-specific extension structure also identifies the specific video coding layer its parent {@link VkVideoEncodeRateControlLayerInfoKHR} applies to. If multiple rate control layers are enabled, the number of rate control layers <b>must</b> match the number of video coding layers. The specification for an encode codec-specific extension would describe how multiple video coding layers are enabled for the corresponding codec.</p>
 * 
 * <p>Per-layer rate control settings for all enabled rate control layers <b>must</b> be initialized or re-initialized whenever stream rate control settings are provided via {@link VkVideoEncodeRateControlInfoKHR}. This is done by specifying settings for all enabled rate control layers in {@link VkVideoEncodeRateControlInfoKHR}{@code ::pLayerConfigs}.</p>
 * 
 * <p>To adjust rate control settings for an individual layer at runtime, add a {@link VkVideoEncodeRateControlLayerInfoKHR} structure to the {@code pNext} chain of the {@link VkVideoCodingControlInfoKHR} structure passed to the {@link KHRVideoQueue#vkCmdControlVideoCodingKHR CmdControlVideoCodingKHR} command. This adjustment only impacts the specified layer without impacting the rate control settings or implementation rate control algorithm behavior for any other enabled rate control layers. The adjustment takes effect whenever the corresponding {@link KHRVideoQueue#vkCmdControlVideoCodingKHR CmdControlVideoCodingKHR} is executed, and only impacts {@link KHRVideoEncodeQueue#vkCmdEncodeVideoKHR CmdEncodeVideoKHR} operations pertaining to the corresponding video coding layer that follow in execution order.</p>
 * 
 * <p>It is possible for an application to enable multiple video coding layers (via codec-specific extensions to encoding operations) while only enabling a single layer of rate control for the entire video stream. To achieve this, {@code layerCount} in {@link VkVideoEncodeRateControlInfoKHR} <b>must</b> be set to 1, and the single {@link VkVideoEncodeRateControlLayerInfoKHR} provided in {@code pLayerConfigs} would apply to all encoded segments of the video stream, regardless of which codec-defined video coding layer they belong to. In this case, the implementation decides bitrate distribution across video coding layers (if applicable to the specified stream rate control mode).</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoEncodeQueue#VK_STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_LAYER_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_LAYER_INFO_KHR}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkVideoEncodeRateControlInfoKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeRateControlLayerInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #averageBitrate};
 *     uint32_t {@link #maxBitrate};
 *     uint32_t {@link #frameRateNumerator};
 *     uint32_t {@link #frameRateDenominator};
 *     uint32_t {@link #virtualBufferSizeInMs};
 *     uint32_t {@link #initialVirtualBufferSizeInMs};
 * }</code></pre>
 */
public class VkVideoEncodeRateControlLayerInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        AVERAGEBITRATE,
        MAXBITRATE,
        FRAMERATENUMERATOR,
        FRAMERATEDENOMINATOR,
        VIRTUALBUFFERSIZEINMS,
        INITIALVIRTUALBUFFERSIZEINMS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
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
        AVERAGEBITRATE = layout.offsetof(2);
        MAXBITRATE = layout.offsetof(3);
        FRAMERATENUMERATOR = layout.offsetof(4);
        FRAMERATEDENOMINATOR = layout.offsetof(5);
        VIRTUALBUFFERSIZEINMS = layout.offsetof(6);
        INITIALVIRTUALBUFFERSIZEINMS = layout.offsetof(7);
    }

    /**
     * Creates a {@code VkVideoEncodeRateControlLayerInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeRateControlLayerInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the average bitrate in bits/second. Valid when rate control mode is not {@link KHRVideoEncodeQueue#VK_VIDEO_ENCODE_RATE_CONTROL_MODE_NONE_BIT_KHR VIDEO_ENCODE_RATE_CONTROL_MODE_NONE_BIT_KHR}. */
    @NativeType("uint32_t")
    public int averageBitrate() { return naverageBitrate(address()); }
    /** the peak bitrate in bits/second. Valid when rate control mode is {@link KHRVideoEncodeQueue#VK_VIDEO_ENCODE_RATE_CONTROL_MODE_VBR_BIT_KHR VIDEO_ENCODE_RATE_CONTROL_MODE_VBR_BIT_KHR}. */
    @NativeType("uint32_t")
    public int maxBitrate() { return nmaxBitrate(address()); }
    /** the numerator of the frame rate. Valid when rate control mode is not {@link KHRVideoEncodeQueue#VK_VIDEO_ENCODE_RATE_CONTROL_MODE_NONE_BIT_KHR VIDEO_ENCODE_RATE_CONTROL_MODE_NONE_BIT_KHR}. */
    @NativeType("uint32_t")
    public int frameRateNumerator() { return nframeRateNumerator(address()); }
    /** the denominator of the frame rate. Valid when rate control mode is not {@link KHRVideoEncodeQueue#VK_VIDEO_ENCODE_RATE_CONTROL_MODE_NONE_BIT_KHR VIDEO_ENCODE_RATE_CONTROL_MODE_NONE_BIT_KHR}. */
    @NativeType("uint32_t")
    public int frameRateDenominator() { return nframeRateDenominator(address()); }
    /** the leaky bucket model virtual buffer size in milliseconds, with respect to peak bitrate. Valid when rate control mode is not {@link KHRVideoEncodeQueue#VK_VIDEO_ENCODE_RATE_CONTROL_MODE_NONE_BIT_KHR VIDEO_ENCODE_RATE_CONTROL_MODE_NONE_BIT_KHR}. For example, virtual buffer size is ({@code virtualBufferSizeInMs} * {@code maxBitrate} / 1000). */
    @NativeType("uint32_t")
    public int virtualBufferSizeInMs() { return nvirtualBufferSizeInMs(address()); }
    /** the initial occupancy in milliseconds of the virtual buffer in the leaky bucket model. Valid when the rate control mode is not {@link KHRVideoEncodeQueue#VK_VIDEO_ENCODE_RATE_CONTROL_MODE_NONE_BIT_KHR VIDEO_ENCODE_RATE_CONTROL_MODE_NONE_BIT_KHR}. */
    @NativeType("uint32_t")
    public int initialVirtualBufferSizeInMs() { return ninitialVirtualBufferSizeInMs(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeRateControlLayerInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeQueue#VK_STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_LAYER_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_LAYER_INFO_KHR} value to the {@link #sType} field. */
    public VkVideoEncodeRateControlLayerInfoKHR sType$Default() { return sType(KHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_LAYER_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeRateControlLayerInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkVideoEncodeH264RateControlLayerInfoEXT} value to the {@code pNext} chain. */
    public VkVideoEncodeRateControlLayerInfoKHR pNext(VkVideoEncodeH264RateControlLayerInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeH265RateControlLayerInfoEXT} value to the {@code pNext} chain. */
    public VkVideoEncodeRateControlLayerInfoKHR pNext(VkVideoEncodeH265RateControlLayerInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #averageBitrate} field. */
    public VkVideoEncodeRateControlLayerInfoKHR averageBitrate(@NativeType("uint32_t") int value) { naverageBitrate(address(), value); return this; }
    /** Sets the specified value to the {@link #maxBitrate} field. */
    public VkVideoEncodeRateControlLayerInfoKHR maxBitrate(@NativeType("uint32_t") int value) { nmaxBitrate(address(), value); return this; }
    /** Sets the specified value to the {@link #frameRateNumerator} field. */
    public VkVideoEncodeRateControlLayerInfoKHR frameRateNumerator(@NativeType("uint32_t") int value) { nframeRateNumerator(address(), value); return this; }
    /** Sets the specified value to the {@link #frameRateDenominator} field. */
    public VkVideoEncodeRateControlLayerInfoKHR frameRateDenominator(@NativeType("uint32_t") int value) { nframeRateDenominator(address(), value); return this; }
    /** Sets the specified value to the {@link #virtualBufferSizeInMs} field. */
    public VkVideoEncodeRateControlLayerInfoKHR virtualBufferSizeInMs(@NativeType("uint32_t") int value) { nvirtualBufferSizeInMs(address(), value); return this; }
    /** Sets the specified value to the {@link #initialVirtualBufferSizeInMs} field. */
    public VkVideoEncodeRateControlLayerInfoKHR initialVirtualBufferSizeInMs(@NativeType("uint32_t") int value) { ninitialVirtualBufferSizeInMs(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeRateControlLayerInfoKHR set(
        int sType,
        long pNext,
        int averageBitrate,
        int maxBitrate,
        int frameRateNumerator,
        int frameRateDenominator,
        int virtualBufferSizeInMs,
        int initialVirtualBufferSizeInMs
    ) {
        sType(sType);
        pNext(pNext);
        averageBitrate(averageBitrate);
        maxBitrate(maxBitrate);
        frameRateNumerator(frameRateNumerator);
        frameRateDenominator(frameRateDenominator);
        virtualBufferSizeInMs(virtualBufferSizeInMs);
        initialVirtualBufferSizeInMs(initialVirtualBufferSizeInMs);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeRateControlLayerInfoKHR set(VkVideoEncodeRateControlLayerInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeRateControlLayerInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeRateControlLayerInfoKHR malloc() {
        return wrap(VkVideoEncodeRateControlLayerInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeRateControlLayerInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeRateControlLayerInfoKHR calloc() {
        return wrap(VkVideoEncodeRateControlLayerInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeRateControlLayerInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeRateControlLayerInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoEncodeRateControlLayerInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeRateControlLayerInfoKHR} instance for the specified memory address. */
    public static VkVideoEncodeRateControlLayerInfoKHR create(long address) {
        return wrap(VkVideoEncodeRateControlLayerInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeRateControlLayerInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoEncodeRateControlLayerInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkVideoEncodeRateControlLayerInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeRateControlLayerInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeRateControlLayerInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeRateControlLayerInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeRateControlLayerInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeRateControlLayerInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoEncodeRateControlLayerInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeRateControlLayerInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeRateControlLayerInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeRateControlLayerInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeRateControlLayerInfoKHR malloc(MemoryStack stack) {
        return wrap(VkVideoEncodeRateControlLayerInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoEncodeRateControlLayerInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeRateControlLayerInfoKHR calloc(MemoryStack stack) {
        return wrap(VkVideoEncodeRateControlLayerInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoEncodeRateControlLayerInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeRateControlLayerInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeRateControlLayerInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeRateControlLayerInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeRateControlLayerInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeRateControlLayerInfoKHR.PNEXT); }
    /** Unsafe version of {@link #averageBitrate}. */
    public static int naverageBitrate(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeRateControlLayerInfoKHR.AVERAGEBITRATE); }
    /** Unsafe version of {@link #maxBitrate}. */
    public static int nmaxBitrate(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeRateControlLayerInfoKHR.MAXBITRATE); }
    /** Unsafe version of {@link #frameRateNumerator}. */
    public static int nframeRateNumerator(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeRateControlLayerInfoKHR.FRAMERATENUMERATOR); }
    /** Unsafe version of {@link #frameRateDenominator}. */
    public static int nframeRateDenominator(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeRateControlLayerInfoKHR.FRAMERATEDENOMINATOR); }
    /** Unsafe version of {@link #virtualBufferSizeInMs}. */
    public static int nvirtualBufferSizeInMs(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeRateControlLayerInfoKHR.VIRTUALBUFFERSIZEINMS); }
    /** Unsafe version of {@link #initialVirtualBufferSizeInMs}. */
    public static int ninitialVirtualBufferSizeInMs(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeRateControlLayerInfoKHR.INITIALVIRTUALBUFFERSIZEINMS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeRateControlLayerInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeRateControlLayerInfoKHR.PNEXT, check(value)); }
    /** Unsafe version of {@link #averageBitrate(int) averageBitrate}. */
    public static void naverageBitrate(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeRateControlLayerInfoKHR.AVERAGEBITRATE, value); }
    /** Unsafe version of {@link #maxBitrate(int) maxBitrate}. */
    public static void nmaxBitrate(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeRateControlLayerInfoKHR.MAXBITRATE, value); }
    /** Unsafe version of {@link #frameRateNumerator(int) frameRateNumerator}. */
    public static void nframeRateNumerator(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeRateControlLayerInfoKHR.FRAMERATENUMERATOR, value); }
    /** Unsafe version of {@link #frameRateDenominator(int) frameRateDenominator}. */
    public static void nframeRateDenominator(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeRateControlLayerInfoKHR.FRAMERATEDENOMINATOR, value); }
    /** Unsafe version of {@link #virtualBufferSizeInMs(int) virtualBufferSizeInMs}. */
    public static void nvirtualBufferSizeInMs(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeRateControlLayerInfoKHR.VIRTUALBUFFERSIZEINMS, value); }
    /** Unsafe version of {@link #initialVirtualBufferSizeInMs(int) initialVirtualBufferSizeInMs}. */
    public static void ninitialVirtualBufferSizeInMs(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeRateControlLayerInfoKHR.INITIALVIRTUALBUFFERSIZEINMS, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkVideoEncodeRateControlLayerInfoKHR.PNEXT));
    }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeRateControlLayerInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeRateControlLayerInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeRateControlLayerInfoKHR ELEMENT_FACTORY = VkVideoEncodeRateControlLayerInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeRateControlLayerInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeRateControlLayerInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkVideoEncodeRateControlLayerInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeRateControlLayerInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeRateControlLayerInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeRateControlLayerInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeRateControlLayerInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeRateControlLayerInfoKHR#averageBitrate} field. */
        @NativeType("uint32_t")
        public int averageBitrate() { return VkVideoEncodeRateControlLayerInfoKHR.naverageBitrate(address()); }
        /** @return the value of the {@link VkVideoEncodeRateControlLayerInfoKHR#maxBitrate} field. */
        @NativeType("uint32_t")
        public int maxBitrate() { return VkVideoEncodeRateControlLayerInfoKHR.nmaxBitrate(address()); }
        /** @return the value of the {@link VkVideoEncodeRateControlLayerInfoKHR#frameRateNumerator} field. */
        @NativeType("uint32_t")
        public int frameRateNumerator() { return VkVideoEncodeRateControlLayerInfoKHR.nframeRateNumerator(address()); }
        /** @return the value of the {@link VkVideoEncodeRateControlLayerInfoKHR#frameRateDenominator} field. */
        @NativeType("uint32_t")
        public int frameRateDenominator() { return VkVideoEncodeRateControlLayerInfoKHR.nframeRateDenominator(address()); }
        /** @return the value of the {@link VkVideoEncodeRateControlLayerInfoKHR#virtualBufferSizeInMs} field. */
        @NativeType("uint32_t")
        public int virtualBufferSizeInMs() { return VkVideoEncodeRateControlLayerInfoKHR.nvirtualBufferSizeInMs(address()); }
        /** @return the value of the {@link VkVideoEncodeRateControlLayerInfoKHR#initialVirtualBufferSizeInMs} field. */
        @NativeType("uint32_t")
        public int initialVirtualBufferSizeInMs() { return VkVideoEncodeRateControlLayerInfoKHR.ninitialVirtualBufferSizeInMs(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeRateControlLayerInfoKHR#sType} field. */
        public VkVideoEncodeRateControlLayerInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeRateControlLayerInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeQueue#VK_STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_LAYER_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_LAYER_INFO_KHR} value to the {@link VkVideoEncodeRateControlLayerInfoKHR#sType} field. */
        public VkVideoEncodeRateControlLayerInfoKHR.Buffer sType$Default() { return sType(KHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_LAYER_INFO_KHR); }
        /** Sets the specified value to the {@link VkVideoEncodeRateControlLayerInfoKHR#pNext} field. */
        public VkVideoEncodeRateControlLayerInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeRateControlLayerInfoKHR.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkVideoEncodeH264RateControlLayerInfoEXT} value to the {@code pNext} chain. */
        public VkVideoEncodeRateControlLayerInfoKHR.Buffer pNext(VkVideoEncodeH264RateControlLayerInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeH265RateControlLayerInfoEXT} value to the {@code pNext} chain. */
        public VkVideoEncodeRateControlLayerInfoKHR.Buffer pNext(VkVideoEncodeH265RateControlLayerInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkVideoEncodeRateControlLayerInfoKHR#averageBitrate} field. */
        public VkVideoEncodeRateControlLayerInfoKHR.Buffer averageBitrate(@NativeType("uint32_t") int value) { VkVideoEncodeRateControlLayerInfoKHR.naverageBitrate(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeRateControlLayerInfoKHR#maxBitrate} field. */
        public VkVideoEncodeRateControlLayerInfoKHR.Buffer maxBitrate(@NativeType("uint32_t") int value) { VkVideoEncodeRateControlLayerInfoKHR.nmaxBitrate(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeRateControlLayerInfoKHR#frameRateNumerator} field. */
        public VkVideoEncodeRateControlLayerInfoKHR.Buffer frameRateNumerator(@NativeType("uint32_t") int value) { VkVideoEncodeRateControlLayerInfoKHR.nframeRateNumerator(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeRateControlLayerInfoKHR#frameRateDenominator} field. */
        public VkVideoEncodeRateControlLayerInfoKHR.Buffer frameRateDenominator(@NativeType("uint32_t") int value) { VkVideoEncodeRateControlLayerInfoKHR.nframeRateDenominator(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeRateControlLayerInfoKHR#virtualBufferSizeInMs} field. */
        public VkVideoEncodeRateControlLayerInfoKHR.Buffer virtualBufferSizeInMs(@NativeType("uint32_t") int value) { VkVideoEncodeRateControlLayerInfoKHR.nvirtualBufferSizeInMs(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeRateControlLayerInfoKHR#initialVirtualBufferSizeInMs} field. */
        public VkVideoEncodeRateControlLayerInfoKHR.Buffer initialVirtualBufferSizeInMs(@NativeType("uint32_t") int value) { VkVideoEncodeRateControlLayerInfoKHR.ninitialVirtualBufferSizeInMs(address(), value); return this; }

    }

}