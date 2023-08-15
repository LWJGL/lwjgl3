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
 * Structure specifying video coding control parameters.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code flags} includes {@link KHRVideoEncodeQueue#VK_VIDEO_CODING_CONTROL_ENCODE_RATE_CONTROL_BIT_KHR VIDEO_CODING_CONTROL_ENCODE_RATE_CONTROL_BIT_KHR}, then the {@code pNext} chain <b>must</b> include a {@link VkVideoEncodeRateControlInfoKHR} structure</li>
 * <li>If {@code flags} includes {@link KHRVideoEncodeQueue#VK_VIDEO_CODING_CONTROL_ENCODE_RATE_CONTROL_BIT_KHR VIDEO_CODING_CONTROL_ENCODE_RATE_CONTROL_BIT_KHR}, the {@code rateControlMode} member of {@link VkVideoEncodeRateControlInfoKHR} included in the {@code pNext} chain is not {@link KHRVideoEncodeQueue#VK_VIDEO_ENCODE_RATE_CONTROL_MODE_DEFAULT_KHR VIDEO_ENCODE_RATE_CONTROL_MODE_DEFAULT_KHR} or {@link KHRVideoEncodeQueue#VK_VIDEO_ENCODE_RATE_CONTROL_MODE_DISABLED_BIT_KHR VIDEO_ENCODE_RATE_CONTROL_MODE_DISABLED_BIT_KHR}, and the bound video session was created with the video codec operation {@link EXTVideoEncodeH264#VK_VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_EXT VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_EXT}, then the {@code pNext} chain <b>must</b> include a {@link VkVideoEncodeH264RateControlInfoEXT} structure</li>
 * <li>If the {@code pNext} chain includes a {@link VkVideoEncodeRateControlInfoKHR}, and {@link VkVideoEncodeRateControlInfoKHR}{@code ::layerCount} is greater than 1, then {@link VkVideoEncodeH264RateControlInfoEXT}{@code ::temporalLayerCount} <b>must</b> be equal to {@code layerCount}</li>
 * <li>If {@code flags} includes {@link KHRVideoEncodeQueue#VK_VIDEO_CODING_CONTROL_ENCODE_RATE_CONTROL_BIT_KHR VIDEO_CODING_CONTROL_ENCODE_RATE_CONTROL_BIT_KHR}, the {@code rateControlMode} member of {@link VkVideoEncodeRateControlInfoKHR} included in the {@code pNext} chain is not {@link KHRVideoEncodeQueue#VK_VIDEO_ENCODE_RATE_CONTROL_MODE_DEFAULT_KHR VIDEO_ENCODE_RATE_CONTROL_MODE_DEFAULT_KHR} or {@link KHRVideoEncodeQueue#VK_VIDEO_ENCODE_RATE_CONTROL_MODE_DISABLED_BIT_KHR VIDEO_ENCODE_RATE_CONTROL_MODE_DISABLED_BIT_KHR}, and the bound video session was created with the video codec operation {@link EXTVideoEncodeH265#VK_VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_EXT VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_EXT}, then the {@code pNext} chain <b>must</b> include a {@link VkVideoEncodeH265RateControlInfoEXT} structure</li>
 * <li>If the {@code pNext} chain includes a {@link VkVideoEncodeRateControlInfoKHR}, and {@link VkVideoEncodeRateControlInfoKHR}{@code ::layerCount} is greater than 1, then {@link VkVideoEncodeH265RateControlInfoEXT}{@code ::subLayerCount} <b>must</b> be equal to {@code layerCount}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_CODING_CONTROL_INFO_KHR STRUCTURE_TYPE_VIDEO_CODING_CONTROL_INFO_KHR}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkVideoEncodeH264RateControlInfoEXT}, {@link VkVideoEncodeH265RateControlInfoEXT}, {@link VkVideoEncodeQualityLevelInfoKHR}, or {@link VkVideoEncodeRateControlInfoKHR}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkVideoCodingControlFlagBitsKHR} values</li>
 * <li>{@code flags} <b>must</b> not be 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRVideoQueue#vkCmdControlVideoCodingKHR CmdControlVideoCodingKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoCodingControlInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkVideoCodingControlFlagsKHR {@link #flags};
 * }</code></pre>
 */
public class VkVideoCodingControlInfoKHR extends Struct<VkVideoCodingControlInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
    }

    protected VkVideoCodingControlInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoCodingControlInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoCodingControlInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoCodingControlInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoCodingControlInfoKHR(ByteBuffer container) {
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
    /** a bitmask of {@code VkVideoCodingControlFlagsKHR} specifying control flags. */
    @NativeType("VkVideoCodingControlFlagsKHR")
    public int flags() { return nflags(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoCodingControlInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_CODING_CONTROL_INFO_KHR STRUCTURE_TYPE_VIDEO_CODING_CONTROL_INFO_KHR} value to the {@link #sType} field. */
    public VkVideoCodingControlInfoKHR sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_CODING_CONTROL_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoCodingControlInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkVideoEncodeH264RateControlInfoEXT} value to the {@code pNext} chain. */
    public VkVideoCodingControlInfoKHR pNext(VkVideoEncodeH264RateControlInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeH265RateControlInfoEXT} value to the {@code pNext} chain. */
    public VkVideoCodingControlInfoKHR pNext(VkVideoEncodeH265RateControlInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeQualityLevelInfoKHR} value to the {@code pNext} chain. */
    public VkVideoCodingControlInfoKHR pNext(VkVideoEncodeQualityLevelInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeRateControlInfoKHR} value to the {@code pNext} chain. */
    public VkVideoCodingControlInfoKHR pNext(VkVideoEncodeRateControlInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #flags} field. */
    public VkVideoCodingControlInfoKHR flags(@NativeType("VkVideoCodingControlFlagsKHR") int value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoCodingControlInfoKHR set(
        int sType,
        long pNext,
        int flags
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoCodingControlInfoKHR set(VkVideoCodingControlInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoCodingControlInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoCodingControlInfoKHR malloc() {
        return new VkVideoCodingControlInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoCodingControlInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoCodingControlInfoKHR calloc() {
        return new VkVideoCodingControlInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoCodingControlInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoCodingControlInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoCodingControlInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoCodingControlInfoKHR} instance for the specified memory address. */
    public static VkVideoCodingControlInfoKHR create(long address) {
        return new VkVideoCodingControlInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoCodingControlInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoCodingControlInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoCodingControlInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoCodingControlInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoCodingControlInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoCodingControlInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoCodingControlInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoCodingControlInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoCodingControlInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoCodingControlInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoCodingControlInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoCodingControlInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoCodingControlInfoKHR malloc(MemoryStack stack) {
        return new VkVideoCodingControlInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoCodingControlInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoCodingControlInfoKHR calloc(MemoryStack stack) {
        return new VkVideoCodingControlInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoCodingControlInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoCodingControlInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoCodingControlInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoCodingControlInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoCodingControlInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoCodingControlInfoKHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkVideoCodingControlInfoKHR.FLAGS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoCodingControlInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoCodingControlInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoCodingControlInfoKHR.FLAGS, value); }

    // -----------------------------------

    /** An array of {@link VkVideoCodingControlInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoCodingControlInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoCodingControlInfoKHR ELEMENT_FACTORY = VkVideoCodingControlInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoCodingControlInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoCodingControlInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoCodingControlInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoCodingControlInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoCodingControlInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoCodingControlInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoCodingControlInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkVideoCodingControlInfoKHR#flags} field. */
        @NativeType("VkVideoCodingControlFlagsKHR")
        public int flags() { return VkVideoCodingControlInfoKHR.nflags(address()); }

        /** Sets the specified value to the {@link VkVideoCodingControlInfoKHR#sType} field. */
        public VkVideoCodingControlInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoCodingControlInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_CODING_CONTROL_INFO_KHR STRUCTURE_TYPE_VIDEO_CODING_CONTROL_INFO_KHR} value to the {@link VkVideoCodingControlInfoKHR#sType} field. */
        public VkVideoCodingControlInfoKHR.Buffer sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_CODING_CONTROL_INFO_KHR); }
        /** Sets the specified value to the {@link VkVideoCodingControlInfoKHR#pNext} field. */
        public VkVideoCodingControlInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoCodingControlInfoKHR.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkVideoEncodeH264RateControlInfoEXT} value to the {@code pNext} chain. */
        public VkVideoCodingControlInfoKHR.Buffer pNext(VkVideoEncodeH264RateControlInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeH265RateControlInfoEXT} value to the {@code pNext} chain. */
        public VkVideoCodingControlInfoKHR.Buffer pNext(VkVideoEncodeH265RateControlInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeQualityLevelInfoKHR} value to the {@code pNext} chain. */
        public VkVideoCodingControlInfoKHR.Buffer pNext(VkVideoEncodeQualityLevelInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeRateControlInfoKHR} value to the {@code pNext} chain. */
        public VkVideoCodingControlInfoKHR.Buffer pNext(VkVideoEncodeRateControlInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkVideoCodingControlInfoKHR#flags} field. */
        public VkVideoCodingControlInfoKHR.Buffer flags(@NativeType("VkVideoCodingControlFlagsKHR") int value) { VkVideoCodingControlInfoKHR.nflags(address(), value); return this; }

    }

}