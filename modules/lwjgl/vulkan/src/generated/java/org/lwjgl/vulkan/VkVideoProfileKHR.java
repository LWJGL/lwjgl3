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
 * Structure specifying the codec video profile.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_PROFILE_KHR STRUCTURE_TYPE_VIDEO_PROFILE_KHR}</li>
 * <li>{@code videoCodecOperation} <b>must</b> be a valid {@code VkVideoCodecOperationFlagBitsKHR} value</li>
 * <li>{@code chromaSubsampling} <b>must</b> be a valid combination of {@code VkVideoChromaSubsamplingFlagBitsKHR} values</li>
 * <li>{@code chromaSubsampling} <b>must</b> not be 0</li>
 * <li>{@code lumaBitDepth} <b>must</b> be a valid combination of {@code VkVideoComponentBitDepthFlagBitsKHR} values</li>
 * <li>{@code lumaBitDepth} <b>must</b> not be 0</li>
 * <li>{@code chromaBitDepth} <b>must</b> be a valid combination of {@code VkVideoComponentBitDepthFlagBitsKHR} values</li>
 * <li>{@code chromaBitDepth} <b>must</b> not be 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkVideoProfilesKHR}, {@link VkVideoSessionCreateInfoKHR}, {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoProfileKHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkVideoCodecOperationFlagBitsKHR {@link #videoCodecOperation};
 *     VkVideoChromaSubsamplingFlagsKHR {@link #chromaSubsampling};
 *     VkVideoComponentBitDepthFlagsKHR {@link #lumaBitDepth};
 *     VkVideoComponentBitDepthFlagsKHR {@link #chromaBitDepth};
 * }</code></pre>
 */
public class VkVideoProfileKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        VIDEOCODECOPERATION,
        CHROMASUBSAMPLING,
        LUMABITDEPTH,
        CHROMABITDEPTH;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        VIDEOCODECOPERATION = layout.offsetof(2);
        CHROMASUBSAMPLING = layout.offsetof(3);
        LUMABITDEPTH = layout.offsetof(4);
        CHROMABITDEPTH = layout.offsetof(5);
    }

    /**
     * Creates a {@code VkVideoProfileKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoProfileKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** a {@code VkVideoCodecOperationFlagBitsKHR} value specifying a video codec operation. */
    @NativeType("VkVideoCodecOperationFlagBitsKHR")
    public int videoCodecOperation() { return nvideoCodecOperation(address()); }
    /** a bitmask of {@code VkVideoChromaSubsamplingFlagBitsKHR} specifying video chroma subsampling information. */
    @NativeType("VkVideoChromaSubsamplingFlagsKHR")
    public int chromaSubsampling() { return nchromaSubsampling(address()); }
    /** a bitmask of {@code VkVideoComponentBitDepthFlagBitsKHR} specifying video luma bit depth information. */
    @NativeType("VkVideoComponentBitDepthFlagsKHR")
    public int lumaBitDepth() { return nlumaBitDepth(address()); }
    /** a bitmask of {@code VkVideoComponentBitDepthFlagBitsKHR} specifying video chroma bit depth information. */
    @NativeType("VkVideoComponentBitDepthFlagsKHR")
    public int chromaBitDepth() { return nchromaBitDepth(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoProfileKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_PROFILE_KHR STRUCTURE_TYPE_VIDEO_PROFILE_KHR} value to the {@link #sType} field. */
    public VkVideoProfileKHR sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_PROFILE_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoProfileKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkVideoDecodeH264ProfileEXT} value to the {@code pNext} chain. */
    public VkVideoProfileKHR pNext(VkVideoDecodeH264ProfileEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoDecodeH265ProfileEXT} value to the {@code pNext} chain. */
    public VkVideoProfileKHR pNext(VkVideoDecodeH265ProfileEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeH264ProfileEXT} value to the {@code pNext} chain. */
    public VkVideoProfileKHR pNext(VkVideoEncodeH264ProfileEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeH265ProfileEXT} value to the {@code pNext} chain. */
    public VkVideoProfileKHR pNext(VkVideoEncodeH265ProfileEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #videoCodecOperation} field. */
    public VkVideoProfileKHR videoCodecOperation(@NativeType("VkVideoCodecOperationFlagBitsKHR") int value) { nvideoCodecOperation(address(), value); return this; }
    /** Sets the specified value to the {@link #chromaSubsampling} field. */
    public VkVideoProfileKHR chromaSubsampling(@NativeType("VkVideoChromaSubsamplingFlagsKHR") int value) { nchromaSubsampling(address(), value); return this; }
    /** Sets the specified value to the {@link #lumaBitDepth} field. */
    public VkVideoProfileKHR lumaBitDepth(@NativeType("VkVideoComponentBitDepthFlagsKHR") int value) { nlumaBitDepth(address(), value); return this; }
    /** Sets the specified value to the {@link #chromaBitDepth} field. */
    public VkVideoProfileKHR chromaBitDepth(@NativeType("VkVideoComponentBitDepthFlagsKHR") int value) { nchromaBitDepth(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoProfileKHR set(
        int sType,
        long pNext,
        int videoCodecOperation,
        int chromaSubsampling,
        int lumaBitDepth,
        int chromaBitDepth
    ) {
        sType(sType);
        pNext(pNext);
        videoCodecOperation(videoCodecOperation);
        chromaSubsampling(chromaSubsampling);
        lumaBitDepth(lumaBitDepth);
        chromaBitDepth(chromaBitDepth);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoProfileKHR set(VkVideoProfileKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoProfileKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoProfileKHR malloc() {
        return wrap(VkVideoProfileKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoProfileKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoProfileKHR calloc() {
        return wrap(VkVideoProfileKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoProfileKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoProfileKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoProfileKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoProfileKHR} instance for the specified memory address. */
    public static VkVideoProfileKHR create(long address) {
        return wrap(VkVideoProfileKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoProfileKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoProfileKHR.class, address);
    }

    /**
     * Returns a new {@link VkVideoProfileKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoProfileKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoProfileKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoProfileKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoProfileKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoProfileKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoProfileKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoProfileKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoProfileKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkVideoProfileKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoProfileKHR malloc(MemoryStack stack) {
        return wrap(VkVideoProfileKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoProfileKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoProfileKHR calloc(MemoryStack stack) {
        return wrap(VkVideoProfileKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoProfileKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoProfileKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoProfileKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoProfileKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoProfileKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoProfileKHR.PNEXT); }
    /** Unsafe version of {@link #videoCodecOperation}. */
    public static int nvideoCodecOperation(long struct) { return UNSAFE.getInt(null, struct + VkVideoProfileKHR.VIDEOCODECOPERATION); }
    /** Unsafe version of {@link #chromaSubsampling}. */
    public static int nchromaSubsampling(long struct) { return UNSAFE.getInt(null, struct + VkVideoProfileKHR.CHROMASUBSAMPLING); }
    /** Unsafe version of {@link #lumaBitDepth}. */
    public static int nlumaBitDepth(long struct) { return UNSAFE.getInt(null, struct + VkVideoProfileKHR.LUMABITDEPTH); }
    /** Unsafe version of {@link #chromaBitDepth}. */
    public static int nchromaBitDepth(long struct) { return UNSAFE.getInt(null, struct + VkVideoProfileKHR.CHROMABITDEPTH); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoProfileKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoProfileKHR.PNEXT, value); }
    /** Unsafe version of {@link #videoCodecOperation(int) videoCodecOperation}. */
    public static void nvideoCodecOperation(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoProfileKHR.VIDEOCODECOPERATION, value); }
    /** Unsafe version of {@link #chromaSubsampling(int) chromaSubsampling}. */
    public static void nchromaSubsampling(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoProfileKHR.CHROMASUBSAMPLING, value); }
    /** Unsafe version of {@link #lumaBitDepth(int) lumaBitDepth}. */
    public static void nlumaBitDepth(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoProfileKHR.LUMABITDEPTH, value); }
    /** Unsafe version of {@link #chromaBitDepth(int) chromaBitDepth}. */
    public static void nchromaBitDepth(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoProfileKHR.CHROMABITDEPTH, value); }

    // -----------------------------------

    /** An array of {@link VkVideoProfileKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoProfileKHR, Buffer> implements NativeResource {

        private static final VkVideoProfileKHR ELEMENT_FACTORY = VkVideoProfileKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoProfileKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoProfileKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkVideoProfileKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoProfileKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoProfileKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoProfileKHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkVideoProfileKHR.npNext(address()); }
        /** @return the value of the {@link VkVideoProfileKHR#videoCodecOperation} field. */
        @NativeType("VkVideoCodecOperationFlagBitsKHR")
        public int videoCodecOperation() { return VkVideoProfileKHR.nvideoCodecOperation(address()); }
        /** @return the value of the {@link VkVideoProfileKHR#chromaSubsampling} field. */
        @NativeType("VkVideoChromaSubsamplingFlagsKHR")
        public int chromaSubsampling() { return VkVideoProfileKHR.nchromaSubsampling(address()); }
        /** @return the value of the {@link VkVideoProfileKHR#lumaBitDepth} field. */
        @NativeType("VkVideoComponentBitDepthFlagsKHR")
        public int lumaBitDepth() { return VkVideoProfileKHR.nlumaBitDepth(address()); }
        /** @return the value of the {@link VkVideoProfileKHR#chromaBitDepth} field. */
        @NativeType("VkVideoComponentBitDepthFlagsKHR")
        public int chromaBitDepth() { return VkVideoProfileKHR.nchromaBitDepth(address()); }

        /** Sets the specified value to the {@link VkVideoProfileKHR#sType} field. */
        public VkVideoProfileKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoProfileKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_PROFILE_KHR STRUCTURE_TYPE_VIDEO_PROFILE_KHR} value to the {@link VkVideoProfileKHR#sType} field. */
        public VkVideoProfileKHR.Buffer sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_PROFILE_KHR); }
        /** Sets the specified value to the {@link VkVideoProfileKHR#pNext} field. */
        public VkVideoProfileKHR.Buffer pNext(@NativeType("void *") long value) { VkVideoProfileKHR.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkVideoDecodeH264ProfileEXT} value to the {@code pNext} chain. */
        public VkVideoProfileKHR.Buffer pNext(VkVideoDecodeH264ProfileEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoDecodeH265ProfileEXT} value to the {@code pNext} chain. */
        public VkVideoProfileKHR.Buffer pNext(VkVideoDecodeH265ProfileEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeH264ProfileEXT} value to the {@code pNext} chain. */
        public VkVideoProfileKHR.Buffer pNext(VkVideoEncodeH264ProfileEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeH265ProfileEXT} value to the {@code pNext} chain. */
        public VkVideoProfileKHR.Buffer pNext(VkVideoEncodeH265ProfileEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkVideoProfileKHR#videoCodecOperation} field. */
        public VkVideoProfileKHR.Buffer videoCodecOperation(@NativeType("VkVideoCodecOperationFlagBitsKHR") int value) { VkVideoProfileKHR.nvideoCodecOperation(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoProfileKHR#chromaSubsampling} field. */
        public VkVideoProfileKHR.Buffer chromaSubsampling(@NativeType("VkVideoChromaSubsamplingFlagsKHR") int value) { VkVideoProfileKHR.nchromaSubsampling(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoProfileKHR#lumaBitDepth} field. */
        public VkVideoProfileKHR.Buffer lumaBitDepth(@NativeType("VkVideoComponentBitDepthFlagsKHR") int value) { VkVideoProfileKHR.nlumaBitDepth(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoProfileKHR#chromaBitDepth} field. */
        public VkVideoProfileKHR.Buffer chromaBitDepth(@NativeType("VkVideoComponentBitDepthFlagsKHR") int value) { VkVideoProfileKHR.nchromaBitDepth(address(), value); return this; }

    }

}