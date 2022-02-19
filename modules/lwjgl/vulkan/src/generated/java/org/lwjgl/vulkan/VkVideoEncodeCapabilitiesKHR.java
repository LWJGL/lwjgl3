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
 * Structure specifying encode capabilities.
 * 
 * <h5>Description</h5>
 * 
 * <p>The input content and encode resolution (specified in {@link VkVideoEncodeInfoKHR}{@code ::codedExtent}) may not be aligned with the codec-specific coding block size. For example, the input content may be 1920x1080 and the coding block size may be 16x16 pixel blocks. In this example, the content is horizontally aligned with the coding block size, but not vertically aligned with the coding block size. Encoding of the last row of blocks may be impacted by contents of the input image in pixel rows 1081 to 1088 (the next vertical alignment with the coding block size). In general, to ensure efficient encoding for the last row/column of blocks, and/or to ensure consistent encoding results between repeated encoding of the same input content, these extra pixel rows/columns should be filled to known values up to the coding block size alignment before encoding operations are performed. Some implementations support performing auto-fill of unaligned pixels beyond a specific alignment, which is reported in {@code inputImageDataFillAlignment}. For example, if an implementation reports 1x1 in {@code inputImageDataFillAlignment}, then the implementation will perform auto-fill for any unaligned pixels beyond the encode resolution up to the next coding block size. For a coding block size of 16x16, if the implementation reports 16x16 in {@code inputImageDataFillAlignment}, then it is the application’s responsibility to fill any unaligned pixels, if desired. If not, it may impact the encoding efficiency, but it will not affect the validity of the generated bitstream. If the implementation reports 8x8 in {@code inputImageDataFillAlignment}, then for the 1920x1080 example, since the content is aligned to 8 pixels vertically, the implementation will auto-fill pixel rows 1081 to 1088 (up to the 16x16 coding block size in the example). The auto-fill value(s) are implementation-specific. The auto-fill value(s) are not written to the input image memory, but are used as part of the encoding operation on the input image.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoEncodeQueue#VK_STRUCTURE_TYPE_VIDEO_ENCODE_CAPABILITIES_KHR STRUCTURE_TYPE_VIDEO_ENCODE_CAPABILITIES_KHR}</li>
 * <li>{@code rateControlModes} <b>must</b> be a valid combination of {@code VkVideoEncodeRateControlModeFlagBitsKHR} values</li>
 * <li>{@code rateControlModes} <b>must</b> not be 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtent2D}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeCapabilitiesKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkVideoEncodeCapabilityFlagsKHR {@link #flags};
 *     VkVideoEncodeRateControlModeFlagsKHR {@link #rateControlModes};
 *     uint8_t {@link #rateControlLayerCount};
 *     uint8_t {@link #qualityLevelCount};
 *     {@link VkExtent2D VkExtent2D} {@link #inputImageDataFillAlignment};
 * }</code></pre>
 */
public class VkVideoEncodeCapabilitiesKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        RATECONTROLMODES,
        RATECONTROLLAYERCOUNT,
        QUALITYLEVELCOUNT,
        INPUTIMAGEDATAFILLALIGNMENT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(1),
            __member(1),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        RATECONTROLMODES = layout.offsetof(3);
        RATECONTROLLAYERCOUNT = layout.offsetof(4);
        QUALITYLEVELCOUNT = layout.offsetof(5);
        INPUTIMAGEDATAFILLALIGNMENT = layout.offsetof(6);
    }

    /**
     * Creates a {@code VkVideoEncodeCapabilitiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeCapabilitiesKHR(ByteBuffer container) {
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
    /** a bitmask of {@code VkVideoEncodeCapabilityFlagBitsKHR} describing supported encoding features. */
    @NativeType("VkVideoEncodeCapabilityFlagsKHR")
    public int flags() { return nflags(address()); }
    /** a bitmask of {@code VkVideoEncodeRateControlModeFlagBitsKHR} describing supported rate control modes. All implementations <b>must</b> support {@link KHRVideoEncodeQueue#VK_VIDEO_ENCODE_RATE_CONTROL_MODE_NONE_BIT_KHR VIDEO_ENCODE_RATE_CONTROL_MODE_NONE_BIT_KHR}. */
    @NativeType("VkVideoEncodeRateControlModeFlagsKHR")
    public int rateControlModes() { return nrateControlModes(address()); }
    /** reports the maximum number of rate control layers supported. Implementations <b>must</b> report at least 1. */
    @NativeType("uint8_t")
    public byte rateControlLayerCount() { return nrateControlLayerCount(address()); }
    /** the number of discrete quality levels supported. Implementations <b>must</b> report at least 1. */
    @NativeType("uint8_t")
    public byte qualityLevelCount() { return nqualityLevelCount(address()); }
    /** reports alignment of data that should be filled in the input image horizontally and vertically in pixels before encode operations are performed on the input image. */
    public VkExtent2D inputImageDataFillAlignment() { return ninputImageDataFillAlignment(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeCapabilitiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeQueue#VK_STRUCTURE_TYPE_VIDEO_ENCODE_CAPABILITIES_KHR STRUCTURE_TYPE_VIDEO_ENCODE_CAPABILITIES_KHR} value to the {@link #sType} field. */
    public VkVideoEncodeCapabilitiesKHR sType$Default() { return sType(KHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_CAPABILITIES_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeCapabilitiesKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkVideoEncodeH264CapabilitiesEXT} value to the {@code pNext} chain. */
    public VkVideoEncodeCapabilitiesKHR pNext(VkVideoEncodeH264CapabilitiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeH265CapabilitiesEXT} value to the {@code pNext} chain. */
    public VkVideoEncodeCapabilitiesKHR pNext(VkVideoEncodeH265CapabilitiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #flags} field. */
    public VkVideoEncodeCapabilitiesKHR flags(@NativeType("VkVideoEncodeCapabilityFlagsKHR") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #rateControlModes} field. */
    public VkVideoEncodeCapabilitiesKHR rateControlModes(@NativeType("VkVideoEncodeRateControlModeFlagsKHR") int value) { nrateControlModes(address(), value); return this; }
    /** Sets the specified value to the {@link #rateControlLayerCount} field. */
    public VkVideoEncodeCapabilitiesKHR rateControlLayerCount(@NativeType("uint8_t") byte value) { nrateControlLayerCount(address(), value); return this; }
    /** Sets the specified value to the {@link #qualityLevelCount} field. */
    public VkVideoEncodeCapabilitiesKHR qualityLevelCount(@NativeType("uint8_t") byte value) { nqualityLevelCount(address(), value); return this; }
    /** Copies the specified {@link VkExtent2D} to the {@link #inputImageDataFillAlignment} field. */
    public VkVideoEncodeCapabilitiesKHR inputImageDataFillAlignment(VkExtent2D value) { ninputImageDataFillAlignment(address(), value); return this; }
    /** Passes the {@link #inputImageDataFillAlignment} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkVideoEncodeCapabilitiesKHR inputImageDataFillAlignment(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(inputImageDataFillAlignment()); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeCapabilitiesKHR set(
        int sType,
        long pNext,
        int flags,
        int rateControlModes,
        byte rateControlLayerCount,
        byte qualityLevelCount,
        VkExtent2D inputImageDataFillAlignment
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        rateControlModes(rateControlModes);
        rateControlLayerCount(rateControlLayerCount);
        qualityLevelCount(qualityLevelCount);
        inputImageDataFillAlignment(inputImageDataFillAlignment);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeCapabilitiesKHR set(VkVideoEncodeCapabilitiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeCapabilitiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeCapabilitiesKHR malloc() {
        return wrap(VkVideoEncodeCapabilitiesKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeCapabilitiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeCapabilitiesKHR calloc() {
        return wrap(VkVideoEncodeCapabilitiesKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeCapabilitiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeCapabilitiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoEncodeCapabilitiesKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeCapabilitiesKHR} instance for the specified memory address. */
    public static VkVideoEncodeCapabilitiesKHR create(long address) {
        return wrap(VkVideoEncodeCapabilitiesKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeCapabilitiesKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoEncodeCapabilitiesKHR.class, address);
    }

    /**
     * Returns a new {@link VkVideoEncodeCapabilitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeCapabilitiesKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeCapabilitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeCapabilitiesKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeCapabilitiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeCapabilitiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoEncodeCapabilitiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeCapabilitiesKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeCapabilitiesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeCapabilitiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeCapabilitiesKHR malloc(MemoryStack stack) {
        return wrap(VkVideoEncodeCapabilitiesKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoEncodeCapabilitiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeCapabilitiesKHR calloc(MemoryStack stack) {
        return wrap(VkVideoEncodeCapabilitiesKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoEncodeCapabilitiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeCapabilitiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeCapabilitiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeCapabilitiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeCapabilitiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeCapabilitiesKHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeCapabilitiesKHR.FLAGS); }
    /** Unsafe version of {@link #rateControlModes}. */
    public static int nrateControlModes(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeCapabilitiesKHR.RATECONTROLMODES); }
    /** Unsafe version of {@link #rateControlLayerCount}. */
    public static byte nrateControlLayerCount(long struct) { return UNSAFE.getByte(null, struct + VkVideoEncodeCapabilitiesKHR.RATECONTROLLAYERCOUNT); }
    /** Unsafe version of {@link #qualityLevelCount}. */
    public static byte nqualityLevelCount(long struct) { return UNSAFE.getByte(null, struct + VkVideoEncodeCapabilitiesKHR.QUALITYLEVELCOUNT); }
    /** Unsafe version of {@link #inputImageDataFillAlignment}. */
    public static VkExtent2D ninputImageDataFillAlignment(long struct) { return VkExtent2D.create(struct + VkVideoEncodeCapabilitiesKHR.INPUTIMAGEDATAFILLALIGNMENT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeCapabilitiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeCapabilitiesKHR.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeCapabilitiesKHR.FLAGS, value); }
    /** Unsafe version of {@link #rateControlModes(int) rateControlModes}. */
    public static void nrateControlModes(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeCapabilitiesKHR.RATECONTROLMODES, value); }
    /** Unsafe version of {@link #rateControlLayerCount(byte) rateControlLayerCount}. */
    public static void nrateControlLayerCount(long struct, byte value) { UNSAFE.putByte(null, struct + VkVideoEncodeCapabilitiesKHR.RATECONTROLLAYERCOUNT, value); }
    /** Unsafe version of {@link #qualityLevelCount(byte) qualityLevelCount}. */
    public static void nqualityLevelCount(long struct, byte value) { UNSAFE.putByte(null, struct + VkVideoEncodeCapabilitiesKHR.QUALITYLEVELCOUNT, value); }
    /** Unsafe version of {@link #inputImageDataFillAlignment(VkExtent2D) inputImageDataFillAlignment}. */
    public static void ninputImageDataFillAlignment(long struct, VkExtent2D value) { memCopy(value.address(), struct + VkVideoEncodeCapabilitiesKHR.INPUTIMAGEDATAFILLALIGNMENT, VkExtent2D.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeCapabilitiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeCapabilitiesKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeCapabilitiesKHR ELEMENT_FACTORY = VkVideoEncodeCapabilitiesKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeCapabilitiesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeCapabilitiesKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkVideoEncodeCapabilitiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeCapabilitiesKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeCapabilitiesKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeCapabilitiesKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeCapabilitiesKHR.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeCapabilitiesKHR#flags} field. */
        @NativeType("VkVideoEncodeCapabilityFlagsKHR")
        public int flags() { return VkVideoEncodeCapabilitiesKHR.nflags(address()); }
        /** @return the value of the {@link VkVideoEncodeCapabilitiesKHR#rateControlModes} field. */
        @NativeType("VkVideoEncodeRateControlModeFlagsKHR")
        public int rateControlModes() { return VkVideoEncodeCapabilitiesKHR.nrateControlModes(address()); }
        /** @return the value of the {@link VkVideoEncodeCapabilitiesKHR#rateControlLayerCount} field. */
        @NativeType("uint8_t")
        public byte rateControlLayerCount() { return VkVideoEncodeCapabilitiesKHR.nrateControlLayerCount(address()); }
        /** @return the value of the {@link VkVideoEncodeCapabilitiesKHR#qualityLevelCount} field. */
        @NativeType("uint8_t")
        public byte qualityLevelCount() { return VkVideoEncodeCapabilitiesKHR.nqualityLevelCount(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkVideoEncodeCapabilitiesKHR#inputImageDataFillAlignment} field. */
        public VkExtent2D inputImageDataFillAlignment() { return VkVideoEncodeCapabilitiesKHR.ninputImageDataFillAlignment(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeCapabilitiesKHR#sType} field. */
        public VkVideoEncodeCapabilitiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeCapabilitiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeQueue#VK_STRUCTURE_TYPE_VIDEO_ENCODE_CAPABILITIES_KHR STRUCTURE_TYPE_VIDEO_ENCODE_CAPABILITIES_KHR} value to the {@link VkVideoEncodeCapabilitiesKHR#sType} field. */
        public VkVideoEncodeCapabilitiesKHR.Buffer sType$Default() { return sType(KHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_CAPABILITIES_KHR); }
        /** Sets the specified value to the {@link VkVideoEncodeCapabilitiesKHR#pNext} field. */
        public VkVideoEncodeCapabilitiesKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeCapabilitiesKHR.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkVideoEncodeH264CapabilitiesEXT} value to the {@code pNext} chain. */
        public VkVideoEncodeCapabilitiesKHR.Buffer pNext(VkVideoEncodeH264CapabilitiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeH265CapabilitiesEXT} value to the {@code pNext} chain. */
        public VkVideoEncodeCapabilitiesKHR.Buffer pNext(VkVideoEncodeH265CapabilitiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkVideoEncodeCapabilitiesKHR#flags} field. */
        public VkVideoEncodeCapabilitiesKHR.Buffer flags(@NativeType("VkVideoEncodeCapabilityFlagsKHR") int value) { VkVideoEncodeCapabilitiesKHR.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeCapabilitiesKHR#rateControlModes} field. */
        public VkVideoEncodeCapabilitiesKHR.Buffer rateControlModes(@NativeType("VkVideoEncodeRateControlModeFlagsKHR") int value) { VkVideoEncodeCapabilitiesKHR.nrateControlModes(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeCapabilitiesKHR#rateControlLayerCount} field. */
        public VkVideoEncodeCapabilitiesKHR.Buffer rateControlLayerCount(@NativeType("uint8_t") byte value) { VkVideoEncodeCapabilitiesKHR.nrateControlLayerCount(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeCapabilitiesKHR#qualityLevelCount} field. */
        public VkVideoEncodeCapabilitiesKHR.Buffer qualityLevelCount(@NativeType("uint8_t") byte value) { VkVideoEncodeCapabilitiesKHR.nqualityLevelCount(address(), value); return this; }
        /** Copies the specified {@link VkExtent2D} to the {@link VkVideoEncodeCapabilitiesKHR#inputImageDataFillAlignment} field. */
        public VkVideoEncodeCapabilitiesKHR.Buffer inputImageDataFillAlignment(VkExtent2D value) { VkVideoEncodeCapabilitiesKHR.ninputImageDataFillAlignment(address(), value); return this; }
        /** Passes the {@link VkVideoEncodeCapabilitiesKHR#inputImageDataFillAlignment} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkVideoEncodeCapabilitiesKHR.Buffer inputImageDataFillAlignment(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(inputImageDataFillAlignment()); return this; }

    }

}