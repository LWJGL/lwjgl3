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
 * Structure describing general video capabilities for a video profile.
 * 
 * <h5>Description</h5>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note:</h5>
 * 
 * <p>It is common for video compression standards to allow using all reference pictures associated with active DPB slots as active reference pictures, hence for video decode profiles the values returned in {@code maxDpbSlots} and {@code maxActiveReferencePictures} are often equal. Similarly, in case of video decode profiles supporting field pictures the value of {@code maxActiveReferencePictures} often equals <code>maxDpbSlots × 2</code>.</p>
 * </div>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_CAPABILITIES_KHR STRUCTURE_TYPE_VIDEO_CAPABILITIES_KHR}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkVideoDecodeCapabilitiesKHR}, {@link VkVideoDecodeH264CapabilitiesKHR}, {@link VkVideoDecodeH265CapabilitiesKHR}, {@link VkVideoEncodeCapabilitiesKHR}, {@link VkVideoEncodeH264CapabilitiesEXT}, or {@link VkVideoEncodeH265CapabilitiesEXT}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtensionProperties}, {@link VkExtent2D}, {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoCapabilitiesKHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkVideoCapabilityFlagsKHR {@link #flags};
 *     VkDeviceSize {@link #minBitstreamBufferOffsetAlignment};
 *     VkDeviceSize {@link #minBitstreamBufferSizeAlignment};
 *     {@link VkExtent2D VkExtent2D} {@link #pictureAccessGranularity};
 *     {@link VkExtent2D VkExtent2D} {@link #minCodedExtent};
 *     {@link VkExtent2D VkExtent2D} {@link #maxCodedExtent};
 *     uint32_t {@link #maxDpbSlots};
 *     uint32_t {@link #maxActiveReferencePictures};
 *     {@link VkExtensionProperties VkExtensionProperties} {@link #stdHeaderVersion};
 * }</code></pre>
 */
public class VkVideoCapabilitiesKHR extends Struct<VkVideoCapabilitiesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        MINBITSTREAMBUFFEROFFSETALIGNMENT,
        MINBITSTREAMBUFFERSIZEALIGNMENT,
        PICTUREACCESSGRANULARITY,
        MINCODEDEXTENT,
        MAXCODEDEXTENT,
        MAXDPBSLOTS,
        MAXACTIVEREFERENCEPICTURES,
        STDHEADERVERSION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(8),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(4),
            __member(4),
            __member(VkExtensionProperties.SIZEOF, VkExtensionProperties.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        MINBITSTREAMBUFFEROFFSETALIGNMENT = layout.offsetof(3);
        MINBITSTREAMBUFFERSIZEALIGNMENT = layout.offsetof(4);
        PICTUREACCESSGRANULARITY = layout.offsetof(5);
        MINCODEDEXTENT = layout.offsetof(6);
        MAXCODEDEXTENT = layout.offsetof(7);
        MAXDPBSLOTS = layout.offsetof(8);
        MAXACTIVEREFERENCEPICTURES = layout.offsetof(9);
        STDHEADERVERSION = layout.offsetof(10);
    }

    protected VkVideoCapabilitiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoCapabilitiesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoCapabilitiesKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoCapabilitiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoCapabilitiesKHR(ByteBuffer container) {
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
    /** a bitmask of {@code VkVideoCapabilityFlagBitsKHR} specifying capability flags. */
    @NativeType("VkVideoCapabilityFlagsKHR")
    public int flags() { return nflags(address()); }
    /** the minimum alignment for bitstream buffer offsets. */
    @NativeType("VkDeviceSize")
    public long minBitstreamBufferOffsetAlignment() { return nminBitstreamBufferOffsetAlignment(address()); }
    /** the minimum alignment for bitstream buffer range sizes. */
    @NativeType("VkDeviceSize")
    public long minBitstreamBufferSizeAlignment() { return nminBitstreamBufferSizeAlignment(address()); }
    /** the granularity at which image access to video picture resources happen. */
    public VkExtent2D pictureAccessGranularity() { return npictureAccessGranularity(address()); }
    /** the minimum width and height of the coded frames. */
    public VkExtent2D minCodedExtent() { return nminCodedExtent(address()); }
    /** the maximum width and height of the coded frames. */
    public VkExtent2D maxCodedExtent() { return nmaxCodedExtent(address()); }
    /** the maximum number of <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#dpb-slot">DPB slots</a> supported by a single video session. */
    @NativeType("uint32_t")
    public int maxDpbSlots() { return nmaxDpbSlots(address()); }
    /** the maximum number of <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#active-reference-pictures">active reference pictures</a> a single video coding operation <b>can</b> use. */
    @NativeType("uint32_t")
    public int maxActiveReferencePictures() { return nmaxActiveReferencePictures(address()); }
    /** a {@link VkExtensionProperties} structure reporting the Video Std header name and version supported for the video profile. */
    public VkExtensionProperties stdHeaderVersion() { return nstdHeaderVersion(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoCapabilitiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_CAPABILITIES_KHR STRUCTURE_TYPE_VIDEO_CAPABILITIES_KHR} value to the {@link #sType} field. */
    public VkVideoCapabilitiesKHR sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_CAPABILITIES_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoCapabilitiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkVideoDecodeCapabilitiesKHR} value to the {@code pNext} chain. */
    public VkVideoCapabilitiesKHR pNext(VkVideoDecodeCapabilitiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoDecodeH264CapabilitiesKHR} value to the {@code pNext} chain. */
    public VkVideoCapabilitiesKHR pNext(VkVideoDecodeH264CapabilitiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoDecodeH265CapabilitiesKHR} value to the {@code pNext} chain. */
    public VkVideoCapabilitiesKHR pNext(VkVideoDecodeH265CapabilitiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeCapabilitiesKHR} value to the {@code pNext} chain. */
    public VkVideoCapabilitiesKHR pNext(VkVideoEncodeCapabilitiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeH264CapabilitiesEXT} value to the {@code pNext} chain. */
    public VkVideoCapabilitiesKHR pNext(VkVideoEncodeH264CapabilitiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeH265CapabilitiesEXT} value to the {@code pNext} chain. */
    public VkVideoCapabilitiesKHR pNext(VkVideoEncodeH265CapabilitiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }

    /** Initializes this struct with the specified values. */
    public VkVideoCapabilitiesKHR set(
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
    public VkVideoCapabilitiesKHR set(VkVideoCapabilitiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoCapabilitiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoCapabilitiesKHR malloc() {
        return new VkVideoCapabilitiesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoCapabilitiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoCapabilitiesKHR calloc() {
        return new VkVideoCapabilitiesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoCapabilitiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoCapabilitiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoCapabilitiesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoCapabilitiesKHR} instance for the specified memory address. */
    public static VkVideoCapabilitiesKHR create(long address) {
        return new VkVideoCapabilitiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoCapabilitiesKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoCapabilitiesKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoCapabilitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoCapabilitiesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoCapabilitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoCapabilitiesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoCapabilitiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoCapabilitiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoCapabilitiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoCapabilitiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoCapabilitiesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoCapabilitiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoCapabilitiesKHR malloc(MemoryStack stack) {
        return new VkVideoCapabilitiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoCapabilitiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoCapabilitiesKHR calloc(MemoryStack stack) {
        return new VkVideoCapabilitiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoCapabilitiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoCapabilitiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoCapabilitiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoCapabilitiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoCapabilitiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoCapabilitiesKHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkVideoCapabilitiesKHR.FLAGS); }
    /** Unsafe version of {@link #minBitstreamBufferOffsetAlignment}. */
    public static long nminBitstreamBufferOffsetAlignment(long struct) { return UNSAFE.getLong(null, struct + VkVideoCapabilitiesKHR.MINBITSTREAMBUFFEROFFSETALIGNMENT); }
    /** Unsafe version of {@link #minBitstreamBufferSizeAlignment}. */
    public static long nminBitstreamBufferSizeAlignment(long struct) { return UNSAFE.getLong(null, struct + VkVideoCapabilitiesKHR.MINBITSTREAMBUFFERSIZEALIGNMENT); }
    /** Unsafe version of {@link #pictureAccessGranularity}. */
    public static VkExtent2D npictureAccessGranularity(long struct) { return VkExtent2D.create(struct + VkVideoCapabilitiesKHR.PICTUREACCESSGRANULARITY); }
    /** Unsafe version of {@link #minCodedExtent}. */
    public static VkExtent2D nminCodedExtent(long struct) { return VkExtent2D.create(struct + VkVideoCapabilitiesKHR.MINCODEDEXTENT); }
    /** Unsafe version of {@link #maxCodedExtent}. */
    public static VkExtent2D nmaxCodedExtent(long struct) { return VkExtent2D.create(struct + VkVideoCapabilitiesKHR.MAXCODEDEXTENT); }
    /** Unsafe version of {@link #maxDpbSlots}. */
    public static int nmaxDpbSlots(long struct) { return UNSAFE.getInt(null, struct + VkVideoCapabilitiesKHR.MAXDPBSLOTS); }
    /** Unsafe version of {@link #maxActiveReferencePictures}. */
    public static int nmaxActiveReferencePictures(long struct) { return UNSAFE.getInt(null, struct + VkVideoCapabilitiesKHR.MAXACTIVEREFERENCEPICTURES); }
    /** Unsafe version of {@link #stdHeaderVersion}. */
    public static VkExtensionProperties nstdHeaderVersion(long struct) { return VkExtensionProperties.create(struct + VkVideoCapabilitiesKHR.STDHEADERVERSION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoCapabilitiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoCapabilitiesKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkVideoCapabilitiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoCapabilitiesKHR, Buffer> implements NativeResource {

        private static final VkVideoCapabilitiesKHR ELEMENT_FACTORY = VkVideoCapabilitiesKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoCapabilitiesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoCapabilitiesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoCapabilitiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoCapabilitiesKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoCapabilitiesKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoCapabilitiesKHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkVideoCapabilitiesKHR.npNext(address()); }
        /** @return the value of the {@link VkVideoCapabilitiesKHR#flags} field. */
        @NativeType("VkVideoCapabilityFlagsKHR")
        public int flags() { return VkVideoCapabilitiesKHR.nflags(address()); }
        /** @return the value of the {@link VkVideoCapabilitiesKHR#minBitstreamBufferOffsetAlignment} field. */
        @NativeType("VkDeviceSize")
        public long minBitstreamBufferOffsetAlignment() { return VkVideoCapabilitiesKHR.nminBitstreamBufferOffsetAlignment(address()); }
        /** @return the value of the {@link VkVideoCapabilitiesKHR#minBitstreamBufferSizeAlignment} field. */
        @NativeType("VkDeviceSize")
        public long minBitstreamBufferSizeAlignment() { return VkVideoCapabilitiesKHR.nminBitstreamBufferSizeAlignment(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkVideoCapabilitiesKHR#pictureAccessGranularity} field. */
        public VkExtent2D pictureAccessGranularity() { return VkVideoCapabilitiesKHR.npictureAccessGranularity(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkVideoCapabilitiesKHR#minCodedExtent} field. */
        public VkExtent2D minCodedExtent() { return VkVideoCapabilitiesKHR.nminCodedExtent(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkVideoCapabilitiesKHR#maxCodedExtent} field. */
        public VkExtent2D maxCodedExtent() { return VkVideoCapabilitiesKHR.nmaxCodedExtent(address()); }
        /** @return the value of the {@link VkVideoCapabilitiesKHR#maxDpbSlots} field. */
        @NativeType("uint32_t")
        public int maxDpbSlots() { return VkVideoCapabilitiesKHR.nmaxDpbSlots(address()); }
        /** @return the value of the {@link VkVideoCapabilitiesKHR#maxActiveReferencePictures} field. */
        @NativeType("uint32_t")
        public int maxActiveReferencePictures() { return VkVideoCapabilitiesKHR.nmaxActiveReferencePictures(address()); }
        /** @return a {@link VkExtensionProperties} view of the {@link VkVideoCapabilitiesKHR#stdHeaderVersion} field. */
        public VkExtensionProperties stdHeaderVersion() { return VkVideoCapabilitiesKHR.nstdHeaderVersion(address()); }

        /** Sets the specified value to the {@link VkVideoCapabilitiesKHR#sType} field. */
        public VkVideoCapabilitiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoCapabilitiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_CAPABILITIES_KHR STRUCTURE_TYPE_VIDEO_CAPABILITIES_KHR} value to the {@link VkVideoCapabilitiesKHR#sType} field. */
        public VkVideoCapabilitiesKHR.Buffer sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_CAPABILITIES_KHR); }
        /** Sets the specified value to the {@link VkVideoCapabilitiesKHR#pNext} field. */
        public VkVideoCapabilitiesKHR.Buffer pNext(@NativeType("void *") long value) { VkVideoCapabilitiesKHR.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkVideoDecodeCapabilitiesKHR} value to the {@code pNext} chain. */
        public VkVideoCapabilitiesKHR.Buffer pNext(VkVideoDecodeCapabilitiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoDecodeH264CapabilitiesKHR} value to the {@code pNext} chain. */
        public VkVideoCapabilitiesKHR.Buffer pNext(VkVideoDecodeH264CapabilitiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoDecodeH265CapabilitiesKHR} value to the {@code pNext} chain. */
        public VkVideoCapabilitiesKHR.Buffer pNext(VkVideoDecodeH265CapabilitiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeCapabilitiesKHR} value to the {@code pNext} chain. */
        public VkVideoCapabilitiesKHR.Buffer pNext(VkVideoEncodeCapabilitiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeH264CapabilitiesEXT} value to the {@code pNext} chain. */
        public VkVideoCapabilitiesKHR.Buffer pNext(VkVideoEncodeH264CapabilitiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeH265CapabilitiesEXT} value to the {@code pNext} chain. */
        public VkVideoCapabilitiesKHR.Buffer pNext(VkVideoEncodeH265CapabilitiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }

    }

}