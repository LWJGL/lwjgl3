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
 * <p>In order to provide video encode stream rate control settings, add a {@link VkVideoEncodeRateControlInfoKHR} structure to the {@code pNext} chain of the {@link VkVideoCodingControlInfoKHR} structure passed to the {@link KHRVideoQueue#vkCmdControlVideoCodingKHR CmdControlVideoCodingKHR} command.</p>
 * 
 * <p>A codec-specific extension structure for further encode stream rate control parameter settings <b>may</b> be chained to {@link VkVideoEncodeRateControlInfoKHR}.</p>
 * 
 * <p>To ensure that the video session is properly initalized with stream-level rate control settings, the application <b>must</b> call {@link KHRVideoQueue#vkCmdControlVideoCodingKHR CmdControlVideoCodingKHR} with stream-level rate control settings at least once in execution order before the first {@link KHRVideoEncodeQueue#vkCmdEncodeVideoKHR CmdEncodeVideoKHR} command that is executed after video session reset. If not provided, default implementation-specific stream rate control settings will be used.</p>
 * 
 * <p>Stream rate control settings <b>can</b> also be re-initialized during an active video encoding session. The re-initialization takes effect whenever the {@link VkVideoEncodeRateControlInfoKHR} structure is included in the {@code pNext} chain of the {@link VkVideoCodingControlInfoKHR} structure in the call to {@link KHRVideoQueue#vkCmdControlVideoCodingKHR CmdControlVideoCodingKHR}, and only impacts {@link KHRVideoEncodeQueue#vkCmdEncodeVideoKHR CmdEncodeVideoKHR} operations that follow in execution order.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@link VkVideoEncodeH264RateControlInfoEXT} <b>must</b> be included in the {@code pNext} chain of {@link VkVideoEncodeRateControlInfoKHR} if and only if {@link VkVideoEncodeRateControlInfoKHR}{@code ::rateControlMode} is not {@link KHRVideoEncodeQueue#VK_VIDEO_ENCODE_RATE_CONTROL_MODE_NONE_BIT_KHR VIDEO_ENCODE_RATE_CONTROL_MODE_NONE_BIT_KHR} and the bound video session was created with {@link VkVideoProfileKHR}{@code ::videoCodecOperation} set to {@link EXTVideoEncodeH264#VK_VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_EXT VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_EXT}.</li>
 * <li>If {@link VkVideoEncodeRateControlInfoKHR}{@code ::layerCount} is greater than 1, then {@link VkVideoEncodeH264RateControlInfoEXT}{@code ::temporalLayerCount} <b>must</b> be equal to {@code layerCount}.</li>
 * <li>{@link VkVideoEncodeH265RateControlInfoEXT} <b>must</b> be included in the {@code pNext} chain of {@link VkVideoEncodeRateControlInfoKHR} if and only if {@link VkVideoEncodeRateControlInfoKHR}{@code ::rateControlMode} is not {@link KHRVideoEncodeQueue#VK_VIDEO_ENCODE_RATE_CONTROL_MODE_NONE_BIT_KHR VIDEO_ENCODE_RATE_CONTROL_MODE_NONE_BIT_KHR} and the bound video session was created with {@link VkVideoProfileKHR}{@code ::videoCodecOperation} set to {@link EXTVideoEncodeH265#VK_VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_EXT VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_EXT}.</li>
 * <li>If {@link VkVideoEncodeRateControlInfoKHR}{@code ::layerCount} is greater than 1, then {@link VkVideoEncodeH265RateControlInfoEXT}{@code ::subLayerCount} <b>must</b> be equal to {@code layerCount}.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoEncodeQueue#VK_STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_INFO_KHR}</li>
 * <li>{@code rateControlMode} <b>must</b> be a valid {@code VkVideoEncodeRateControlModeFlagBitsKHR} value</li>
 * <li>{@code pLayerConfigs} <b>must</b> be a valid pointer to an array of {@code layerCount} valid {@link VkVideoEncodeRateControlLayerInfoKHR} structures</li>
 * <li>{@code layerCount} <b>must</b> be greater than 0</li>
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
 *     uint8_t {@link #layerCount};
 *     {@link VkVideoEncodeRateControlLayerInfoKHR VkVideoEncodeRateControlLayerInfoKHR} const * {@link #pLayerConfigs};
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
        LAYERCOUNT,
        PLAYERCONFIGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(1),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        RATECONTROLMODE = layout.offsetof(3);
        LAYERCOUNT = layout.offsetof(4);
        PLAYERCONFIGS = layout.offsetof(5);
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
    /** a bitmask of {@code VkVideoEncodeRateControlFlagBitsKHR} specifying encode rate control flags. */
    @NativeType("VkVideoEncodeRateControlFlagsKHR")
    public int flags() { return nflags(address()); }
    /** a {@code VkVideoEncodeRateControlModeFlagBitsKHR} value specifying the encode stream rate control mode. */
    @NativeType("VkVideoEncodeRateControlModeFlagBitsKHR")
    public int rateControlMode() { return nrateControlMode(address()); }
    /** specifies the number of rate control layers in the video encode stream. */
    @NativeType("uint8_t")
    public byte layerCount() { return nlayerCount(address()); }
    /** a pointer to an array of {@link VkVideoEncodeRateControlLayerInfoKHR} structures specifying the rate control configurations of {@code layerCount} rate control layers. */
    @NativeType("VkVideoEncodeRateControlLayerInfoKHR const *")
    public VkVideoEncodeRateControlLayerInfoKHR.Buffer pLayerConfigs() { return npLayerConfigs(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeRateControlInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeQueue#VK_STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_INFO_KHR} value to the {@link #sType} field. */
    public VkVideoEncodeRateControlInfoKHR sType$Default() { return sType(KHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeRateControlInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkVideoEncodeH264RateControlInfoEXT} value to the {@code pNext} chain. */
    public VkVideoEncodeRateControlInfoKHR pNext(VkVideoEncodeH264RateControlInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeH265RateControlInfoEXT} value to the {@code pNext} chain. */
    public VkVideoEncodeRateControlInfoKHR pNext(VkVideoEncodeH265RateControlInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #flags} field. */
    public VkVideoEncodeRateControlInfoKHR flags(@NativeType("VkVideoEncodeRateControlFlagsKHR") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #rateControlMode} field. */
    public VkVideoEncodeRateControlInfoKHR rateControlMode(@NativeType("VkVideoEncodeRateControlModeFlagBitsKHR") int value) { nrateControlMode(address(), value); return this; }
    /** Sets the address of the specified {@link VkVideoEncodeRateControlLayerInfoKHR.Buffer} to the {@link #pLayerConfigs} field. */
    public VkVideoEncodeRateControlInfoKHR pLayerConfigs(@NativeType("VkVideoEncodeRateControlLayerInfoKHR const *") VkVideoEncodeRateControlLayerInfoKHR.Buffer value) { npLayerConfigs(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeRateControlInfoKHR set(
        int sType,
        long pNext,
        int flags,
        int rateControlMode,
        VkVideoEncodeRateControlLayerInfoKHR.Buffer pLayerConfigs
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        rateControlMode(rateControlMode);
        pLayerConfigs(pLayerConfigs);

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
    /** Unsafe version of {@link #layerCount}. */
    public static byte nlayerCount(long struct) { return UNSAFE.getByte(null, struct + VkVideoEncodeRateControlInfoKHR.LAYERCOUNT); }
    /** Unsafe version of {@link #pLayerConfigs}. */
    public static VkVideoEncodeRateControlLayerInfoKHR.Buffer npLayerConfigs(long struct) { return VkVideoEncodeRateControlLayerInfoKHR.create(memGetAddress(struct + VkVideoEncodeRateControlInfoKHR.PLAYERCONFIGS), Byte.toUnsignedInt(nlayerCount(struct))); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeRateControlInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeRateControlInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeRateControlInfoKHR.FLAGS, value); }
    /** Unsafe version of {@link #rateControlMode(int) rateControlMode}. */
    public static void nrateControlMode(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeRateControlInfoKHR.RATECONTROLMODE, value); }
    /** Sets the specified value to the {@code layerCount} field of the specified {@code struct}. */
    public static void nlayerCount(long struct, byte value) { UNSAFE.putByte(null, struct + VkVideoEncodeRateControlInfoKHR.LAYERCOUNT, value); }
    /** Unsafe version of {@link #pLayerConfigs(VkVideoEncodeRateControlLayerInfoKHR.Buffer) pLayerConfigs}. */
    public static void npLayerConfigs(long struct, VkVideoEncodeRateControlLayerInfoKHR.Buffer value) { memPutAddress(struct + VkVideoEncodeRateControlInfoKHR.PLAYERCONFIGS, value.address()); nlayerCount(struct, (byte)value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        byte layerCount = nlayerCount(struct);
        long pLayerConfigs = memGetAddress(struct + VkVideoEncodeRateControlInfoKHR.PLAYERCONFIGS);
        check(pLayerConfigs);
        validate(pLayerConfigs, layerCount, VkVideoEncodeRateControlLayerInfoKHR.SIZEOF, VkVideoEncodeRateControlLayerInfoKHR::validate);
    }

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
        /** @return the value of the {@link VkVideoEncodeRateControlInfoKHR#layerCount} field. */
        @NativeType("uint8_t")
        public byte layerCount() { return VkVideoEncodeRateControlInfoKHR.nlayerCount(address()); }
        /** @return a {@link VkVideoEncodeRateControlLayerInfoKHR.Buffer} view of the struct array pointed to by the {@link VkVideoEncodeRateControlInfoKHR#pLayerConfigs} field. */
        @NativeType("VkVideoEncodeRateControlLayerInfoKHR const *")
        public VkVideoEncodeRateControlLayerInfoKHR.Buffer pLayerConfigs() { return VkVideoEncodeRateControlInfoKHR.npLayerConfigs(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeRateControlInfoKHR#sType} field. */
        public VkVideoEncodeRateControlInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeRateControlInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeQueue#VK_STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_INFO_KHR} value to the {@link VkVideoEncodeRateControlInfoKHR#sType} field. */
        public VkVideoEncodeRateControlInfoKHR.Buffer sType$Default() { return sType(KHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_INFO_KHR); }
        /** Sets the specified value to the {@link VkVideoEncodeRateControlInfoKHR#pNext} field. */
        public VkVideoEncodeRateControlInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeRateControlInfoKHR.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkVideoEncodeH264RateControlInfoEXT} value to the {@code pNext} chain. */
        public VkVideoEncodeRateControlInfoKHR.Buffer pNext(VkVideoEncodeH264RateControlInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeH265RateControlInfoEXT} value to the {@code pNext} chain. */
        public VkVideoEncodeRateControlInfoKHR.Buffer pNext(VkVideoEncodeH265RateControlInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkVideoEncodeRateControlInfoKHR#flags} field. */
        public VkVideoEncodeRateControlInfoKHR.Buffer flags(@NativeType("VkVideoEncodeRateControlFlagsKHR") int value) { VkVideoEncodeRateControlInfoKHR.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeRateControlInfoKHR#rateControlMode} field. */
        public VkVideoEncodeRateControlInfoKHR.Buffer rateControlMode(@NativeType("VkVideoEncodeRateControlModeFlagBitsKHR") int value) { VkVideoEncodeRateControlInfoKHR.nrateControlMode(address(), value); return this; }
        /** Sets the address of the specified {@link VkVideoEncodeRateControlLayerInfoKHR.Buffer} to the {@link VkVideoEncodeRateControlInfoKHR#pLayerConfigs} field. */
        public VkVideoEncodeRateControlInfoKHR.Buffer pLayerConfigs(@NativeType("VkVideoEncodeRateControlLayerInfoKHR const *") VkVideoEncodeRateControlLayerInfoKHR.Buffer value) { VkVideoEncodeRateControlInfoKHR.npLayerConfigs(address(), value); return this; }

    }

}