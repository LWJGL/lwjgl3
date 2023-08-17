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
 * Structure describing the H.264 encode quality level properties.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_QUALITY_LEVEL_PROPERTIES_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_QUALITY_LEVEL_PROPERTIES_EXT}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkVideoEncodeH264QpEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH264QualityLevelPropertiesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkVideoEncodeH264RateControlFlagsEXT {@link #preferredRateControlFlags};
 *     uint32_t {@link #preferredGopFrameCount};
 *     uint32_t {@link #preferredIdrPeriod};
 *     uint32_t {@link #preferredConsecutiveBFrameCount};
 *     uint32_t {@link #preferredTemporalLayerCount};
 *     {@link VkVideoEncodeH264QpEXT VkVideoEncodeH264QpEXT} {@link #preferredConstantQp};
 *     uint32_t {@link #preferredMaxL0ReferenceCount};
 *     uint32_t {@link #preferredMaxL1ReferenceCount};
 *     VkBool32 {@link #preferredStdEntropyCodingModeFlag};
 * }</code></pre>
 */
public class VkVideoEncodeH264QualityLevelPropertiesEXT extends Struct<VkVideoEncodeH264QualityLevelPropertiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PREFERREDRATECONTROLFLAGS,
        PREFERREDGOPFRAMECOUNT,
        PREFERREDIDRPERIOD,
        PREFERREDCONSECUTIVEBFRAMECOUNT,
        PREFERREDTEMPORALLAYERCOUNT,
        PREFERREDCONSTANTQP,
        PREFERREDMAXL0REFERENCECOUNT,
        PREFERREDMAXL1REFERENCECOUNT,
        PREFERREDSTDENTROPYCODINGMODEFLAG;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(VkVideoEncodeH264QpEXT.SIZEOF, VkVideoEncodeH264QpEXT.ALIGNOF),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PREFERREDRATECONTROLFLAGS = layout.offsetof(2);
        PREFERREDGOPFRAMECOUNT = layout.offsetof(3);
        PREFERREDIDRPERIOD = layout.offsetof(4);
        PREFERREDCONSECUTIVEBFRAMECOUNT = layout.offsetof(5);
        PREFERREDTEMPORALLAYERCOUNT = layout.offsetof(6);
        PREFERREDCONSTANTQP = layout.offsetof(7);
        PREFERREDMAXL0REFERENCECOUNT = layout.offsetof(8);
        PREFERREDMAXL1REFERENCECOUNT = layout.offsetof(9);
        PREFERREDSTDENTROPYCODINGMODEFLAG = layout.offsetof(10);
    }

    protected VkVideoEncodeH264QualityLevelPropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeH264QualityLevelPropertiesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH264QualityLevelPropertiesEXT(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeH264QualityLevelPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH264QualityLevelPropertiesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** a bitmask of {@code VkVideoEncodeH264RateControlFlagBitsEXT} values indicating the preferred flags to use for {@link VkVideoEncodeH264RateControlInfoEXT}{@code ::flags}. */
    @NativeType("VkVideoEncodeH264RateControlFlagsEXT")
    public int preferredRateControlFlags() { return npreferredRateControlFlags(address()); }
    /** indicates the preferred value to use for {@link VkVideoEncodeH264RateControlInfoEXT}{@code ::gopFrameCount}. */
    @NativeType("uint32_t")
    public int preferredGopFrameCount() { return npreferredGopFrameCount(address()); }
    /** indicates the preferred value to use for {@link VkVideoEncodeH264RateControlInfoEXT}{@code ::idrPeriod}. */
    @NativeType("uint32_t")
    public int preferredIdrPeriod() { return npreferredIdrPeriod(address()); }
    /** indicates the preferred value to use for {@link VkVideoEncodeH264RateControlInfoEXT}{@code ::consecutiveBFrameCount}. */
    @NativeType("uint32_t")
    public int preferredConsecutiveBFrameCount() { return npreferredConsecutiveBFrameCount(address()); }
    /** indicates the preferred value to use for {@link VkVideoEncodeH264RateControlInfoEXT}{@code ::temporalLayerCount}. */
    @NativeType("uint32_t")
    public int preferredTemporalLayerCount() { return npreferredTemporalLayerCount(address()); }
    /** indicates the preferred values to use for {@link VkVideoEncodeH264NaluSliceInfoEXT}{@code ::constantQp} for each picture type when using rate control mode {@link KHRVideoEncodeQueue#VK_VIDEO_ENCODE_RATE_CONTROL_MODE_DISABLED_BIT_KHR VIDEO_ENCODE_RATE_CONTROL_MODE_DISABLED_BIT_KHR}. */
    public VkVideoEncodeH264QpEXT preferredConstantQp() { return npreferredConstantQp(address()); }
    /** indicates the preferred maximum number of reference pictures to use in the reference list L0. */
    @NativeType("uint32_t")
    public int preferredMaxL0ReferenceCount() { return npreferredMaxL0ReferenceCount(address()); }
    /** indicates the preferred maximum number of reference pictures to use in the reference list L1. */
    @NativeType("uint32_t")
    public int preferredMaxL1ReferenceCount() { return npreferredMaxL1ReferenceCount(address()); }
    /** indicates the preferred value to use for {@code entropy_coding_mode_flag} in {@code StdVideoH264PpsFlags}. */
    @NativeType("VkBool32")
    public boolean preferredStdEntropyCodingModeFlag() { return npreferredStdEntropyCodingModeFlag(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeH264QualityLevelPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_QUALITY_LEVEL_PROPERTIES_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_QUALITY_LEVEL_PROPERTIES_EXT} value to the {@link #sType} field. */
    public VkVideoEncodeH264QualityLevelPropertiesEXT sType$Default() { return sType(EXTVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_QUALITY_LEVEL_PROPERTIES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeH264QualityLevelPropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH264QualityLevelPropertiesEXT set(
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
    public VkVideoEncodeH264QualityLevelPropertiesEXT set(VkVideoEncodeH264QualityLevelPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH264QualityLevelPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264QualityLevelPropertiesEXT malloc() {
        return new VkVideoEncodeH264QualityLevelPropertiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH264QualityLevelPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264QualityLevelPropertiesEXT calloc() {
        return new VkVideoEncodeH264QualityLevelPropertiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH264QualityLevelPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH264QualityLevelPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH264QualityLevelPropertiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH264QualityLevelPropertiesEXT} instance for the specified memory address. */
    public static VkVideoEncodeH264QualityLevelPropertiesEXT create(long address) {
        return new VkVideoEncodeH264QualityLevelPropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH264QualityLevelPropertiesEXT createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeH264QualityLevelPropertiesEXT(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264QualityLevelPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264QualityLevelPropertiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264QualityLevelPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264QualityLevelPropertiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264QualityLevelPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264QualityLevelPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeH264QualityLevelPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264QualityLevelPropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH264QualityLevelPropertiesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264QualityLevelPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264QualityLevelPropertiesEXT malloc(MemoryStack stack) {
        return new VkVideoEncodeH264QualityLevelPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264QualityLevelPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264QualityLevelPropertiesEXT calloc(MemoryStack stack) {
        return new VkVideoEncodeH264QualityLevelPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264QualityLevelPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264QualityLevelPropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264QualityLevelPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264QualityLevelPropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264QualityLevelPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH264QualityLevelPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #preferredRateControlFlags}. */
    public static int npreferredRateControlFlags(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264QualityLevelPropertiesEXT.PREFERREDRATECONTROLFLAGS); }
    /** Unsafe version of {@link #preferredGopFrameCount}. */
    public static int npreferredGopFrameCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264QualityLevelPropertiesEXT.PREFERREDGOPFRAMECOUNT); }
    /** Unsafe version of {@link #preferredIdrPeriod}. */
    public static int npreferredIdrPeriod(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264QualityLevelPropertiesEXT.PREFERREDIDRPERIOD); }
    /** Unsafe version of {@link #preferredConsecutiveBFrameCount}. */
    public static int npreferredConsecutiveBFrameCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264QualityLevelPropertiesEXT.PREFERREDCONSECUTIVEBFRAMECOUNT); }
    /** Unsafe version of {@link #preferredTemporalLayerCount}. */
    public static int npreferredTemporalLayerCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264QualityLevelPropertiesEXT.PREFERREDTEMPORALLAYERCOUNT); }
    /** Unsafe version of {@link #preferredConstantQp}. */
    public static VkVideoEncodeH264QpEXT npreferredConstantQp(long struct) { return VkVideoEncodeH264QpEXT.create(struct + VkVideoEncodeH264QualityLevelPropertiesEXT.PREFERREDCONSTANTQP); }
    /** Unsafe version of {@link #preferredMaxL0ReferenceCount}. */
    public static int npreferredMaxL0ReferenceCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264QualityLevelPropertiesEXT.PREFERREDMAXL0REFERENCECOUNT); }
    /** Unsafe version of {@link #preferredMaxL1ReferenceCount}. */
    public static int npreferredMaxL1ReferenceCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264QualityLevelPropertiesEXT.PREFERREDMAXL1REFERENCECOUNT); }
    /** Unsafe version of {@link #preferredStdEntropyCodingModeFlag}. */
    public static int npreferredStdEntropyCodingModeFlag(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264QualityLevelPropertiesEXT.PREFERREDSTDENTROPYCODINGMODEFLAG); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264QualityLevelPropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH264QualityLevelPropertiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH264QualityLevelPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264QualityLevelPropertiesEXT, Buffer> implements NativeResource {

        private static final VkVideoEncodeH264QualityLevelPropertiesEXT ELEMENT_FACTORY = VkVideoEncodeH264QualityLevelPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH264QualityLevelPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH264QualityLevelPropertiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeH264QualityLevelPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeH264QualityLevelPropertiesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH264QualityLevelPropertiesEXT.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeH264QualityLevelPropertiesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkVideoEncodeH264QualityLevelPropertiesEXT.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeH264QualityLevelPropertiesEXT#preferredRateControlFlags} field. */
        @NativeType("VkVideoEncodeH264RateControlFlagsEXT")
        public int preferredRateControlFlags() { return VkVideoEncodeH264QualityLevelPropertiesEXT.npreferredRateControlFlags(address()); }
        /** @return the value of the {@link VkVideoEncodeH264QualityLevelPropertiesEXT#preferredGopFrameCount} field. */
        @NativeType("uint32_t")
        public int preferredGopFrameCount() { return VkVideoEncodeH264QualityLevelPropertiesEXT.npreferredGopFrameCount(address()); }
        /** @return the value of the {@link VkVideoEncodeH264QualityLevelPropertiesEXT#preferredIdrPeriod} field. */
        @NativeType("uint32_t")
        public int preferredIdrPeriod() { return VkVideoEncodeH264QualityLevelPropertiesEXT.npreferredIdrPeriod(address()); }
        /** @return the value of the {@link VkVideoEncodeH264QualityLevelPropertiesEXT#preferredConsecutiveBFrameCount} field. */
        @NativeType("uint32_t")
        public int preferredConsecutiveBFrameCount() { return VkVideoEncodeH264QualityLevelPropertiesEXT.npreferredConsecutiveBFrameCount(address()); }
        /** @return the value of the {@link VkVideoEncodeH264QualityLevelPropertiesEXT#preferredTemporalLayerCount} field. */
        @NativeType("uint32_t")
        public int preferredTemporalLayerCount() { return VkVideoEncodeH264QualityLevelPropertiesEXT.npreferredTemporalLayerCount(address()); }
        /** @return a {@link VkVideoEncodeH264QpEXT} view of the {@link VkVideoEncodeH264QualityLevelPropertiesEXT#preferredConstantQp} field. */
        public VkVideoEncodeH264QpEXT preferredConstantQp() { return VkVideoEncodeH264QualityLevelPropertiesEXT.npreferredConstantQp(address()); }
        /** @return the value of the {@link VkVideoEncodeH264QualityLevelPropertiesEXT#preferredMaxL0ReferenceCount} field. */
        @NativeType("uint32_t")
        public int preferredMaxL0ReferenceCount() { return VkVideoEncodeH264QualityLevelPropertiesEXT.npreferredMaxL0ReferenceCount(address()); }
        /** @return the value of the {@link VkVideoEncodeH264QualityLevelPropertiesEXT#preferredMaxL1ReferenceCount} field. */
        @NativeType("uint32_t")
        public int preferredMaxL1ReferenceCount() { return VkVideoEncodeH264QualityLevelPropertiesEXT.npreferredMaxL1ReferenceCount(address()); }
        /** @return the value of the {@link VkVideoEncodeH264QualityLevelPropertiesEXT#preferredStdEntropyCodingModeFlag} field. */
        @NativeType("VkBool32")
        public boolean preferredStdEntropyCodingModeFlag() { return VkVideoEncodeH264QualityLevelPropertiesEXT.npreferredStdEntropyCodingModeFlag(address()) != 0; }

        /** Sets the specified value to the {@link VkVideoEncodeH264QualityLevelPropertiesEXT#sType} field. */
        public VkVideoEncodeH264QualityLevelPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH264QualityLevelPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_QUALITY_LEVEL_PROPERTIES_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_QUALITY_LEVEL_PROPERTIES_EXT} value to the {@link VkVideoEncodeH264QualityLevelPropertiesEXT#sType} field. */
        public VkVideoEncodeH264QualityLevelPropertiesEXT.Buffer sType$Default() { return sType(EXTVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_QUALITY_LEVEL_PROPERTIES_EXT); }
        /** Sets the specified value to the {@link VkVideoEncodeH264QualityLevelPropertiesEXT#pNext} field. */
        public VkVideoEncodeH264QualityLevelPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkVideoEncodeH264QualityLevelPropertiesEXT.npNext(address(), value); return this; }

    }

}