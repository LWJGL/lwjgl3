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
 * Structure specifying parameters of video capabilities.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_CAPABILITIES_KHR STRUCTURE_TYPE_VIDEO_CAPABILITIES_KHR}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkVideoDecodeH264CapabilitiesEXT}, {@link VkVideoDecodeH265CapabilitiesEXT}, or {@link VkVideoEncodeCapabilitiesKHR}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtent2D}, {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoCapabilitiesKHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkVideoCapabilityFlagsKHR {@link #capabilityFlags};
 *     VkDeviceSize {@link #minBitstreamBufferOffsetAlignment};
 *     VkDeviceSize {@link #minBitstreamBufferSizeAlignment};
 *     {@link VkExtent2D VkExtent2D} {@link #videoPictureExtentGranularity};
 *     {@link VkExtent2D VkExtent2D} {@link #minExtent};
 *     {@link VkExtent2D VkExtent2D} {@link #maxExtent};
 *     uint32_t {@link #maxReferencePicturesSlotsCount};
 *     uint32_t {@link #maxReferencePicturesActiveCount};
 * }</code></pre>
 */
public class VkVideoCapabilitiesKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        CAPABILITYFLAGS,
        MINBITSTREAMBUFFEROFFSETALIGNMENT,
        MINBITSTREAMBUFFERSIZEALIGNMENT,
        VIDEOPICTUREEXTENTGRANULARITY,
        MINEXTENT,
        MAXEXTENT,
        MAXREFERENCEPICTURESSLOTSCOUNT,
        MAXREFERENCEPICTURESACTIVECOUNT;

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
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        CAPABILITYFLAGS = layout.offsetof(2);
        MINBITSTREAMBUFFEROFFSETALIGNMENT = layout.offsetof(3);
        MINBITSTREAMBUFFERSIZEALIGNMENT = layout.offsetof(4);
        VIDEOPICTUREEXTENTGRANULARITY = layout.offsetof(5);
        MINEXTENT = layout.offsetof(6);
        MAXEXTENT = layout.offsetof(7);
        MAXREFERENCEPICTURESSLOTSCOUNT = layout.offsetof(8);
        MAXREFERENCEPICTURESACTIVECOUNT = layout.offsetof(9);
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

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** a bitmask of {@code VkVideoCapabilityFlagBitsKHR} specifying capability flags. */
    @NativeType("VkVideoCapabilityFlagsKHR")
    public int capabilityFlags() { return ncapabilityFlags(address()); }
    /** the minimum alignment for the input or output bitstream buffer offset. */
    @NativeType("VkDeviceSize")
    public long minBitstreamBufferOffsetAlignment() { return nminBitstreamBufferOffsetAlignment(address()); }
    /** the minimum alignment for the input or output bitstream buffer size */
    @NativeType("VkDeviceSize")
    public long minBitstreamBufferSizeAlignment() { return nminBitstreamBufferSizeAlignment(address()); }
    /** the minimum size alignment of the extent with the required padding for the decoded or encoded video images. */
    public VkExtent2D videoPictureExtentGranularity() { return nvideoPictureExtentGranularity(address()); }
    /** the minimum width and height of the decoded or encoded video. */
    public VkExtent2D minExtent() { return nminExtent(address()); }
    /** the maximum width and height of the decoded or encoded video. */
    public VkExtent2D maxExtent() { return nmaxExtent(address()); }
    /** the maximum number of DPB Slots supported by the implementation for a single video session instance. */
    @NativeType("uint32_t")
    public int maxReferencePicturesSlotsCount() { return nmaxReferencePicturesSlotsCount(address()); }
    /** the maximum slots that can be used as <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#reference-picture">Reference Pictures</a> with a single decode or encode operation. */
    @NativeType("uint32_t")
    public int maxReferencePicturesActiveCount() { return nmaxReferencePicturesActiveCount(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoCapabilitiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_CAPABILITIES_KHR STRUCTURE_TYPE_VIDEO_CAPABILITIES_KHR} value to the {@link #sType} field. */
    public VkVideoCapabilitiesKHR sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_CAPABILITIES_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoCapabilitiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkVideoDecodeH264CapabilitiesEXT} value to the {@code pNext} chain. */
    public VkVideoCapabilitiesKHR pNext(VkVideoDecodeH264CapabilitiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoDecodeH265CapabilitiesEXT} value to the {@code pNext} chain. */
    public VkVideoCapabilitiesKHR pNext(VkVideoDecodeH265CapabilitiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeCapabilitiesKHR} value to the {@code pNext} chain. */
    public VkVideoCapabilitiesKHR pNext(VkVideoEncodeCapabilitiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }

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
        return wrap(VkVideoCapabilitiesKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoCapabilitiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoCapabilitiesKHR calloc() {
        return wrap(VkVideoCapabilitiesKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoCapabilitiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoCapabilitiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoCapabilitiesKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoCapabilitiesKHR} instance for the specified memory address. */
    public static VkVideoCapabilitiesKHR create(long address) {
        return wrap(VkVideoCapabilitiesKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoCapabilitiesKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoCapabilitiesKHR.class, address);
    }

    /**
     * Returns a new {@link VkVideoCapabilitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoCapabilitiesKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoCapabilitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoCapabilitiesKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoCapabilitiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoCapabilitiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoCapabilitiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoCapabilitiesKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoCapabilitiesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkVideoCapabilitiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoCapabilitiesKHR malloc(MemoryStack stack) {
        return wrap(VkVideoCapabilitiesKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoCapabilitiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoCapabilitiesKHR calloc(MemoryStack stack) {
        return wrap(VkVideoCapabilitiesKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoCapabilitiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoCapabilitiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoCapabilitiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoCapabilitiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoCapabilitiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoCapabilitiesKHR.PNEXT); }
    /** Unsafe version of {@link #capabilityFlags}. */
    public static int ncapabilityFlags(long struct) { return UNSAFE.getInt(null, struct + VkVideoCapabilitiesKHR.CAPABILITYFLAGS); }
    /** Unsafe version of {@link #minBitstreamBufferOffsetAlignment}. */
    public static long nminBitstreamBufferOffsetAlignment(long struct) { return UNSAFE.getLong(null, struct + VkVideoCapabilitiesKHR.MINBITSTREAMBUFFEROFFSETALIGNMENT); }
    /** Unsafe version of {@link #minBitstreamBufferSizeAlignment}. */
    public static long nminBitstreamBufferSizeAlignment(long struct) { return UNSAFE.getLong(null, struct + VkVideoCapabilitiesKHR.MINBITSTREAMBUFFERSIZEALIGNMENT); }
    /** Unsafe version of {@link #videoPictureExtentGranularity}. */
    public static VkExtent2D nvideoPictureExtentGranularity(long struct) { return VkExtent2D.create(struct + VkVideoCapabilitiesKHR.VIDEOPICTUREEXTENTGRANULARITY); }
    /** Unsafe version of {@link #minExtent}. */
    public static VkExtent2D nminExtent(long struct) { return VkExtent2D.create(struct + VkVideoCapabilitiesKHR.MINEXTENT); }
    /** Unsafe version of {@link #maxExtent}. */
    public static VkExtent2D nmaxExtent(long struct) { return VkExtent2D.create(struct + VkVideoCapabilitiesKHR.MAXEXTENT); }
    /** Unsafe version of {@link #maxReferencePicturesSlotsCount}. */
    public static int nmaxReferencePicturesSlotsCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoCapabilitiesKHR.MAXREFERENCEPICTURESSLOTSCOUNT); }
    /** Unsafe version of {@link #maxReferencePicturesActiveCount}. */
    public static int nmaxReferencePicturesActiveCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoCapabilitiesKHR.MAXREFERENCEPICTURESACTIVECOUNT); }

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
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoCapabilitiesKHR#SIZEOF}, and its mark will be undefined.
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
        /** @return the value of the {@link VkVideoCapabilitiesKHR#capabilityFlags} field. */
        @NativeType("VkVideoCapabilityFlagsKHR")
        public int capabilityFlags() { return VkVideoCapabilitiesKHR.ncapabilityFlags(address()); }
        /** @return the value of the {@link VkVideoCapabilitiesKHR#minBitstreamBufferOffsetAlignment} field. */
        @NativeType("VkDeviceSize")
        public long minBitstreamBufferOffsetAlignment() { return VkVideoCapabilitiesKHR.nminBitstreamBufferOffsetAlignment(address()); }
        /** @return the value of the {@link VkVideoCapabilitiesKHR#minBitstreamBufferSizeAlignment} field. */
        @NativeType("VkDeviceSize")
        public long minBitstreamBufferSizeAlignment() { return VkVideoCapabilitiesKHR.nminBitstreamBufferSizeAlignment(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkVideoCapabilitiesKHR#videoPictureExtentGranularity} field. */
        public VkExtent2D videoPictureExtentGranularity() { return VkVideoCapabilitiesKHR.nvideoPictureExtentGranularity(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkVideoCapabilitiesKHR#minExtent} field. */
        public VkExtent2D minExtent() { return VkVideoCapabilitiesKHR.nminExtent(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkVideoCapabilitiesKHR#maxExtent} field. */
        public VkExtent2D maxExtent() { return VkVideoCapabilitiesKHR.nmaxExtent(address()); }
        /** @return the value of the {@link VkVideoCapabilitiesKHR#maxReferencePicturesSlotsCount} field. */
        @NativeType("uint32_t")
        public int maxReferencePicturesSlotsCount() { return VkVideoCapabilitiesKHR.nmaxReferencePicturesSlotsCount(address()); }
        /** @return the value of the {@link VkVideoCapabilitiesKHR#maxReferencePicturesActiveCount} field. */
        @NativeType("uint32_t")
        public int maxReferencePicturesActiveCount() { return VkVideoCapabilitiesKHR.nmaxReferencePicturesActiveCount(address()); }

        /** Sets the specified value to the {@link VkVideoCapabilitiesKHR#sType} field. */
        public VkVideoCapabilitiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoCapabilitiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_CAPABILITIES_KHR STRUCTURE_TYPE_VIDEO_CAPABILITIES_KHR} value to the {@link VkVideoCapabilitiesKHR#sType} field. */
        public VkVideoCapabilitiesKHR.Buffer sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_CAPABILITIES_KHR); }
        /** Sets the specified value to the {@link VkVideoCapabilitiesKHR#pNext} field. */
        public VkVideoCapabilitiesKHR.Buffer pNext(@NativeType("void *") long value) { VkVideoCapabilitiesKHR.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkVideoDecodeH264CapabilitiesEXT} value to the {@code pNext} chain. */
        public VkVideoCapabilitiesKHR.Buffer pNext(VkVideoDecodeH264CapabilitiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoDecodeH265CapabilitiesEXT} value to the {@code pNext} chain. */
        public VkVideoCapabilitiesKHR.Buffer pNext(VkVideoDecodeH265CapabilitiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeCapabilitiesKHR} value to the {@code pNext} chain. */
        public VkVideoCapabilitiesKHR.Buffer pNext(VkVideoEncodeCapabilitiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }

    }

}