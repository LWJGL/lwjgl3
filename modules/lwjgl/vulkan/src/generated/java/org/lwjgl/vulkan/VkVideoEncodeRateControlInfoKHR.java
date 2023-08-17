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
 * Structure to set encode stream rate control parameters.
 * 
 * <h5>Description</h5>
 * 
 * <p>Including this structure in the {@code pNext} chain of {@link VkVideoCodingControlInfoKHR} and including {@link KHRVideoEncodeQueue#VK_VIDEO_CODING_CONTROL_ENCODE_RATE_CONTROL_BIT_KHR VIDEO_CODING_CONTROL_ENCODE_RATE_CONTROL_BIT_KHR} in {@link VkVideoCodingControlInfoKHR}{@code ::flags} will define stream rate control settings for video encoding.</p>
 * 
 * <p>Additional structures providing codec-specific rate control parameters <b>may</b> need to be included in the {@code pNext} chain of {@link VkVideoCodingControlInfoKHR} depending on the codec profile the bound video session was created with and the parameters specified in {@link VkVideoEncodeRateControlInfoKHR} (see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-coding-control">Video Coding Control</a>).</p>
 * 
 * <p>To ensure that the video session is properly initialized with stream-level rate control settings, the application <b>must</b> call {@link KHRVideoQueue#vkCmdControlVideoCodingKHR CmdControlVideoCodingKHR} with stream-level rate control settings at least once in execution order before the first {@link KHRVideoEncodeQueue#vkCmdEncodeVideoKHR CmdEncodeVideoKHR} command that is executed after video session reset. If not provided, default implementation-specific stream rate control settings will be used.</p>
 * 
 * <p>Stream rate control settings <b>can</b> also be re-initialized during an active video encoding session. The re-initialization takes effect whenever the {@link VkVideoEncodeRateControlInfoKHR} structure is included in the {@code pNext} chain of the {@link VkVideoCodingControlInfoKHR} structure in the call to {@link KHRVideoQueue#vkCmdControlVideoCodingKHR CmdControlVideoCodingKHR}, and only impacts {@link KHRVideoEncodeQueue#vkCmdEncodeVideoKHR CmdEncodeVideoKHR} operations that follow in execution order.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoEncodeQueue#VK_STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_INFO_KHR}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>If {@code rateControlMode} is not 0, {@code rateControlMode} <b>must</b> be a valid {@code VkVideoEncodeRateControlModeFlagBitsKHR} value</li>
 * <li>If {@code layerCount} is not 0, {@code pLayers} <b>must</b> be a valid pointer to an array of {@code layerCount} valid {@link VkVideoEncodeRateControlLayerInfoKHR} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkVideoEncodeRateControlLayerInfoKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeRateControlInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkVideoEncodeRateControlFlagsKHR {@link #flags};
 *     VkVideoEncodeRateControlModeFlagBitsKHR {@link #rateControlMode};
 *     uint32_t {@link #layerCount};
 *     {@link VkVideoEncodeRateControlLayerInfoKHR VkVideoEncodeRateControlLayerInfoKHR} const * {@link #pLayers};
 *     uint32_t {@link #virtualBufferSizeInMs};
 *     uint32_t {@link #initialVirtualBufferSizeInMs};
 * }</code></pre>
 */
public class VkVideoEncodeRateControlInfoKHR extends Struct<VkVideoEncodeRateControlInfoKHR> implements NativeResource {

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
        LAYERCOUNT,
        PLAYERS,
        VIRTUALBUFFERSIZEINMS,
        INITIALVIRTUALBUFFERSIZEINMS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        RATECONTROLMODE = layout.offsetof(3);
        LAYERCOUNT = layout.offsetof(4);
        PLAYERS = layout.offsetof(5);
        VIRTUALBUFFERSIZEINMS = layout.offsetof(6);
        INITIALVIRTUALBUFFERSIZEINMS = layout.offsetof(7);
    }

    protected VkVideoEncodeRateControlInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeRateControlInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeRateControlInfoKHR(address, container);
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

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** reserved for future use. */
    @NativeType("VkVideoEncodeRateControlFlagsKHR")
    public int flags() { return nflags(address()); }
    /** a {@code VkVideoEncodeRateControlModeFlagBitsKHR} value specifying the encode stream rate control mode. */
    @NativeType("VkVideoEncodeRateControlModeFlagBitsKHR")
    public int rateControlMode() { return nrateControlMode(address()); }
    /** specifies the number of rate control layers in the video encode stream. */
    @NativeType("uint32_t")
    public int layerCount() { return nlayerCount(address()); }
    /** a pointer to an array of {@link VkVideoEncodeRateControlLayerInfoKHR} structures specifying the rate control configurations of {@code layerCount} rate control layers. */
    @Nullable
    @NativeType("VkVideoEncodeRateControlLayerInfoKHR const *")
    public VkVideoEncodeRateControlLayerInfoKHR.Buffer pLayers() { return npLayers(address()); }
    /** the leaky bucket model virtual buffer size in milliseconds, with respect to peak bitrate. Valid when rate control mode is {@link KHRVideoEncodeQueue#VK_VIDEO_ENCODE_RATE_CONTROL_MODE_CBR_BIT_KHR VIDEO_ENCODE_RATE_CONTROL_MODE_CBR_BIT_KHR} or {@link KHRVideoEncodeQueue#VK_VIDEO_ENCODE_RATE_CONTROL_MODE_VBR_BIT_KHR VIDEO_ENCODE_RATE_CONTROL_MODE_VBR_BIT_KHR}. For example, virtual buffer size is ({@code virtualBufferSizeInMs} × {@code maxBitrate} / 1000). */
    @NativeType("uint32_t")
    public int virtualBufferSizeInMs() { return nvirtualBufferSizeInMs(address()); }
    /** the initial occupancy in milliseconds of the virtual buffer in the leaky bucket model. Valid when rate control mode is {@link KHRVideoEncodeQueue#VK_VIDEO_ENCODE_RATE_CONTROL_MODE_CBR_BIT_KHR VIDEO_ENCODE_RATE_CONTROL_MODE_CBR_BIT_KHR} or {@link KHRVideoEncodeQueue#VK_VIDEO_ENCODE_RATE_CONTROL_MODE_VBR_BIT_KHR VIDEO_ENCODE_RATE_CONTROL_MODE_VBR_BIT_KHR}. */
    @NativeType("uint32_t")
    public int initialVirtualBufferSizeInMs() { return ninitialVirtualBufferSizeInMs(address()); }

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
    /** Sets the address of the specified {@link VkVideoEncodeRateControlLayerInfoKHR.Buffer} to the {@link #pLayers} field. */
    public VkVideoEncodeRateControlInfoKHR pLayers(@Nullable @NativeType("VkVideoEncodeRateControlLayerInfoKHR const *") VkVideoEncodeRateControlLayerInfoKHR.Buffer value) { npLayers(address(), value); return this; }
    /** Sets the specified value to the {@link #virtualBufferSizeInMs} field. */
    public VkVideoEncodeRateControlInfoKHR virtualBufferSizeInMs(@NativeType("uint32_t") int value) { nvirtualBufferSizeInMs(address(), value); return this; }
    /** Sets the specified value to the {@link #initialVirtualBufferSizeInMs} field. */
    public VkVideoEncodeRateControlInfoKHR initialVirtualBufferSizeInMs(@NativeType("uint32_t") int value) { ninitialVirtualBufferSizeInMs(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeRateControlInfoKHR set(
        int sType,
        long pNext,
        int flags,
        int rateControlMode,
        @Nullable VkVideoEncodeRateControlLayerInfoKHR.Buffer pLayers,
        int virtualBufferSizeInMs,
        int initialVirtualBufferSizeInMs
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        rateControlMode(rateControlMode);
        pLayers(pLayers);
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
    public VkVideoEncodeRateControlInfoKHR set(VkVideoEncodeRateControlInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeRateControlInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeRateControlInfoKHR malloc() {
        return new VkVideoEncodeRateControlInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeRateControlInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeRateControlInfoKHR calloc() {
        return new VkVideoEncodeRateControlInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeRateControlInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeRateControlInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeRateControlInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeRateControlInfoKHR} instance for the specified memory address. */
    public static VkVideoEncodeRateControlInfoKHR create(long address) {
        return new VkVideoEncodeRateControlInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeRateControlInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeRateControlInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeRateControlInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeRateControlInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeRateControlInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeRateControlInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeRateControlInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeRateControlInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeRateControlInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeRateControlInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeRateControlInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeRateControlInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeRateControlInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeRateControlInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeRateControlInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeRateControlInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeRateControlInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeRateControlInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeRateControlInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeRateControlInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeRateControlInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
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
    /** Unsafe version of {@link #layerCount}. */
    public static int nlayerCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeRateControlInfoKHR.LAYERCOUNT); }
    /** Unsafe version of {@link #pLayers}. */
    @Nullable public static VkVideoEncodeRateControlLayerInfoKHR.Buffer npLayers(long struct) { return VkVideoEncodeRateControlLayerInfoKHR.createSafe(memGetAddress(struct + VkVideoEncodeRateControlInfoKHR.PLAYERS), nlayerCount(struct)); }
    /** Unsafe version of {@link #virtualBufferSizeInMs}. */
    public static int nvirtualBufferSizeInMs(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeRateControlInfoKHR.VIRTUALBUFFERSIZEINMS); }
    /** Unsafe version of {@link #initialVirtualBufferSizeInMs}. */
    public static int ninitialVirtualBufferSizeInMs(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeRateControlInfoKHR.INITIALVIRTUALBUFFERSIZEINMS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeRateControlInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeRateControlInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeRateControlInfoKHR.FLAGS, value); }
    /** Unsafe version of {@link #rateControlMode(int) rateControlMode}. */
    public static void nrateControlMode(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeRateControlInfoKHR.RATECONTROLMODE, value); }
    /** Sets the specified value to the {@code layerCount} field of the specified {@code struct}. */
    public static void nlayerCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeRateControlInfoKHR.LAYERCOUNT, value); }
    /** Unsafe version of {@link #pLayers(VkVideoEncodeRateControlLayerInfoKHR.Buffer) pLayers}. */
    public static void npLayers(long struct, @Nullable VkVideoEncodeRateControlLayerInfoKHR.Buffer value) { memPutAddress(struct + VkVideoEncodeRateControlInfoKHR.PLAYERS, memAddressSafe(value)); nlayerCount(struct, value == null ? 0 : value.remaining()); }
    /** Unsafe version of {@link #virtualBufferSizeInMs(int) virtualBufferSizeInMs}. */
    public static void nvirtualBufferSizeInMs(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeRateControlInfoKHR.VIRTUALBUFFERSIZEINMS, value); }
    /** Unsafe version of {@link #initialVirtualBufferSizeInMs(int) initialVirtualBufferSizeInMs}. */
    public static void ninitialVirtualBufferSizeInMs(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeRateControlInfoKHR.INITIALVIRTUALBUFFERSIZEINMS, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nlayerCount(struct) != 0) {
            check(memGetAddress(struct + VkVideoEncodeRateControlInfoKHR.PLAYERS));
        }
    }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeRateControlInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeRateControlInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeRateControlInfoKHR ELEMENT_FACTORY = VkVideoEncodeRateControlInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeRateControlInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeRateControlInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        /** @return the value of the {@link VkVideoEncodeRateControlInfoKHR#layerCount} field. */
        @NativeType("uint32_t")
        public int layerCount() { return VkVideoEncodeRateControlInfoKHR.nlayerCount(address()); }
        /** @return a {@link VkVideoEncodeRateControlLayerInfoKHR.Buffer} view of the struct array pointed to by the {@link VkVideoEncodeRateControlInfoKHR#pLayers} field. */
        @Nullable
        @NativeType("VkVideoEncodeRateControlLayerInfoKHR const *")
        public VkVideoEncodeRateControlLayerInfoKHR.Buffer pLayers() { return VkVideoEncodeRateControlInfoKHR.npLayers(address()); }
        /** @return the value of the {@link VkVideoEncodeRateControlInfoKHR#virtualBufferSizeInMs} field. */
        @NativeType("uint32_t")
        public int virtualBufferSizeInMs() { return VkVideoEncodeRateControlInfoKHR.nvirtualBufferSizeInMs(address()); }
        /** @return the value of the {@link VkVideoEncodeRateControlInfoKHR#initialVirtualBufferSizeInMs} field. */
        @NativeType("uint32_t")
        public int initialVirtualBufferSizeInMs() { return VkVideoEncodeRateControlInfoKHR.ninitialVirtualBufferSizeInMs(address()); }

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
        /** Sets the address of the specified {@link VkVideoEncodeRateControlLayerInfoKHR.Buffer} to the {@link VkVideoEncodeRateControlInfoKHR#pLayers} field. */
        public VkVideoEncodeRateControlInfoKHR.Buffer pLayers(@Nullable @NativeType("VkVideoEncodeRateControlLayerInfoKHR const *") VkVideoEncodeRateControlLayerInfoKHR.Buffer value) { VkVideoEncodeRateControlInfoKHR.npLayers(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeRateControlInfoKHR#virtualBufferSizeInMs} field. */
        public VkVideoEncodeRateControlInfoKHR.Buffer virtualBufferSizeInMs(@NativeType("uint32_t") int value) { VkVideoEncodeRateControlInfoKHR.nvirtualBufferSizeInMs(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeRateControlInfoKHR#initialVirtualBufferSizeInMs} field. */
        public VkVideoEncodeRateControlInfoKHR.Buffer initialVirtualBufferSizeInMs(@NativeType("uint32_t") int value) { VkVideoEncodeRateControlInfoKHR.ninitialVirtualBufferSizeInMs(address(), value); return this; }

    }

}