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
 * Structure specifying parameters of decode starts.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@link VkVideoBeginCodingInfoKHR}{@code ::referenceSlotCount} <b>must</b> not exceed the value specified in {@link VkVideoSessionCreateInfoKHR}{@code ::maxReferencePicturesSlotsCount} when creating the video session object that is being provided in {@code videoSession}</li>
 * <li>If {@code videoSessionParameters} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, it <b>must</b> have been created using {@code videoSession} as a parent object</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_BEGIN_CODING_INFO_KHR STRUCTURE_TYPE_VIDEO_BEGIN_CODING_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>{@code codecQualityPreset} <b>must</b> be a valid combination of {@code VkVideoCodingQualityPresetFlagBitsKHR} values</li>
 * <li>{@code codecQualityPreset} <b>must</b> not be 0</li>
 * <li>{@code videoSession} <b>must</b> be a valid {@code VkVideoSessionKHR} handle</li>
 * <li>If {@code videoSessionParameters} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code videoSessionParameters} <b>must</b> be a valid {@code VkVideoSessionParametersKHR} handle</li>
 * <li>If {@code referenceSlotCount} is not 0, {@code pReferenceSlots} <b>must</b> be a valid pointer to an array of {@code referenceSlotCount} valid {@link VkVideoReferenceSlotKHR} structures</li>
 * <li>If {@code videoSessionParameters} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code videoSession}</li>
 * <li>Both of {@code videoSession}, and {@code videoSessionParameters} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkVideoReferenceSlotKHR}, {@link KHRVideoQueue#vkCmdBeginVideoCodingKHR CmdBeginVideoCodingKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoBeginCodingInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkVideoBeginCodingFlagsKHR {@link #flags};
 *     VkVideoCodingQualityPresetFlagsKHR {@link #codecQualityPreset};
 *     VkVideoSessionKHR {@link #videoSession};
 *     VkVideoSessionParametersKHR {@link #videoSessionParameters};
 *     uint32_t {@link #referenceSlotCount};
 *     {@link VkVideoReferenceSlotKHR VkVideoReferenceSlotKHR} const * {@link #pReferenceSlots};
 * }</code></pre>
 */
public class VkVideoBeginCodingInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        CODECQUALITYPRESET,
        VIDEOSESSION,
        VIDEOSESSIONPARAMETERS,
        REFERENCESLOTCOUNT,
        PREFERENCESLOTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(8),
            __member(8),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        CODECQUALITYPRESET = layout.offsetof(3);
        VIDEOSESSION = layout.offsetof(4);
        VIDEOSESSIONPARAMETERS = layout.offsetof(5);
        REFERENCESLOTCOUNT = layout.offsetof(6);
        PREFERENCESLOTS = layout.offsetof(7);
    }

    /**
     * Creates a {@code VkVideoBeginCodingInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoBeginCodingInfoKHR(ByteBuffer container) {
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
    /** reserved for future use. */
    @NativeType("VkVideoBeginCodingFlagsKHR")
    public int flags() { return nflags(address()); }
    /** a bitmask of {@code VkVideoCodingQualityPresetFlagBitsKHR} specifying the Video Decode or Encode quality preset. */
    @NativeType("VkVideoCodingQualityPresetFlagsKHR")
    public int codecQualityPreset() { return ncodecQualityPreset(address()); }
    /** the video session object to be bound for the processing of the video commands. */
    @NativeType("VkVideoSessionKHR")
    public long videoSession() { return nvideoSession(address()); }
    /** {@link VK10#VK_NULL_HANDLE NULL_HANDLE} or a handle of a {@code VkVideoSessionParametersKHR} object to be used for the processing of the video commands. If {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, then no video session parameters apply to this command buffer context. */
    @NativeType("VkVideoSessionParametersKHR")
    public long videoSessionParameters() { return nvideoSessionParameters(address()); }
    /** the number of reference slot entries provided in {@code pReferenceSlots}. */
    @NativeType("uint32_t")
    public int referenceSlotCount() { return nreferenceSlotCount(address()); }
    /** a pointer to an array of {@link VkVideoReferenceSlotKHR} structures specifying reference slots, used within the video command context between this {@link KHRVideoQueue#vkCmdBeginVideoCodingKHR CmdBeginVideoCodingKHR} command and the {@link KHRVideoQueue#vkCmdEndVideoCodingKHR CmdEndVideoCodingKHR} commmand that follows. Each reference slot provides a slot index and the {@link VkVideoPictureResourceKHR} specifying the reference picture resource bound to this slot index. A slot index <b>must</b> not appear more than once in {@code pReferenceSlots} in a given command. */
    @Nullable
    @NativeType("VkVideoReferenceSlotKHR const *")
    public VkVideoReferenceSlotKHR.Buffer pReferenceSlots() { return npReferenceSlots(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoBeginCodingInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_BEGIN_CODING_INFO_KHR STRUCTURE_TYPE_VIDEO_BEGIN_CODING_INFO_KHR} value to the {@link #sType} field. */
    public VkVideoBeginCodingInfoKHR sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_BEGIN_CODING_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoBeginCodingInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkVideoBeginCodingInfoKHR flags(@NativeType("VkVideoBeginCodingFlagsKHR") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #codecQualityPreset} field. */
    public VkVideoBeginCodingInfoKHR codecQualityPreset(@NativeType("VkVideoCodingQualityPresetFlagsKHR") int value) { ncodecQualityPreset(address(), value); return this; }
    /** Sets the specified value to the {@link #videoSession} field. */
    public VkVideoBeginCodingInfoKHR videoSession(@NativeType("VkVideoSessionKHR") long value) { nvideoSession(address(), value); return this; }
    /** Sets the specified value to the {@link #videoSessionParameters} field. */
    public VkVideoBeginCodingInfoKHR videoSessionParameters(@NativeType("VkVideoSessionParametersKHR") long value) { nvideoSessionParameters(address(), value); return this; }
    /** Sets the address of the specified {@link VkVideoReferenceSlotKHR.Buffer} to the {@link #pReferenceSlots} field. */
    public VkVideoBeginCodingInfoKHR pReferenceSlots(@Nullable @NativeType("VkVideoReferenceSlotKHR const *") VkVideoReferenceSlotKHR.Buffer value) { npReferenceSlots(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoBeginCodingInfoKHR set(
        int sType,
        long pNext,
        int flags,
        int codecQualityPreset,
        long videoSession,
        long videoSessionParameters,
        @Nullable VkVideoReferenceSlotKHR.Buffer pReferenceSlots
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        codecQualityPreset(codecQualityPreset);
        videoSession(videoSession);
        videoSessionParameters(videoSessionParameters);
        pReferenceSlots(pReferenceSlots);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoBeginCodingInfoKHR set(VkVideoBeginCodingInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoBeginCodingInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoBeginCodingInfoKHR malloc() {
        return wrap(VkVideoBeginCodingInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoBeginCodingInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoBeginCodingInfoKHR calloc() {
        return wrap(VkVideoBeginCodingInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoBeginCodingInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoBeginCodingInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoBeginCodingInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoBeginCodingInfoKHR} instance for the specified memory address. */
    public static VkVideoBeginCodingInfoKHR create(long address) {
        return wrap(VkVideoBeginCodingInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoBeginCodingInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoBeginCodingInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkVideoBeginCodingInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoBeginCodingInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoBeginCodingInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoBeginCodingInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoBeginCodingInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoBeginCodingInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoBeginCodingInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoBeginCodingInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoBeginCodingInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkVideoBeginCodingInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoBeginCodingInfoKHR malloc(MemoryStack stack) {
        return wrap(VkVideoBeginCodingInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoBeginCodingInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoBeginCodingInfoKHR calloc(MemoryStack stack) {
        return wrap(VkVideoBeginCodingInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoBeginCodingInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoBeginCodingInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoBeginCodingInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoBeginCodingInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoBeginCodingInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoBeginCodingInfoKHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkVideoBeginCodingInfoKHR.FLAGS); }
    /** Unsafe version of {@link #codecQualityPreset}. */
    public static int ncodecQualityPreset(long struct) { return UNSAFE.getInt(null, struct + VkVideoBeginCodingInfoKHR.CODECQUALITYPRESET); }
    /** Unsafe version of {@link #videoSession}. */
    public static long nvideoSession(long struct) { return UNSAFE.getLong(null, struct + VkVideoBeginCodingInfoKHR.VIDEOSESSION); }
    /** Unsafe version of {@link #videoSessionParameters}. */
    public static long nvideoSessionParameters(long struct) { return UNSAFE.getLong(null, struct + VkVideoBeginCodingInfoKHR.VIDEOSESSIONPARAMETERS); }
    /** Unsafe version of {@link #referenceSlotCount}. */
    public static int nreferenceSlotCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoBeginCodingInfoKHR.REFERENCESLOTCOUNT); }
    /** Unsafe version of {@link #pReferenceSlots}. */
    @Nullable public static VkVideoReferenceSlotKHR.Buffer npReferenceSlots(long struct) { return VkVideoReferenceSlotKHR.createSafe(memGetAddress(struct + VkVideoBeginCodingInfoKHR.PREFERENCESLOTS), nreferenceSlotCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoBeginCodingInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoBeginCodingInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoBeginCodingInfoKHR.FLAGS, value); }
    /** Unsafe version of {@link #codecQualityPreset(int) codecQualityPreset}. */
    public static void ncodecQualityPreset(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoBeginCodingInfoKHR.CODECQUALITYPRESET, value); }
    /** Unsafe version of {@link #videoSession(long) videoSession}. */
    public static void nvideoSession(long struct, long value) { UNSAFE.putLong(null, struct + VkVideoBeginCodingInfoKHR.VIDEOSESSION, value); }
    /** Unsafe version of {@link #videoSessionParameters(long) videoSessionParameters}. */
    public static void nvideoSessionParameters(long struct, long value) { UNSAFE.putLong(null, struct + VkVideoBeginCodingInfoKHR.VIDEOSESSIONPARAMETERS, value); }
    /** Sets the specified value to the {@code referenceSlotCount} field of the specified {@code struct}. */
    public static void nreferenceSlotCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoBeginCodingInfoKHR.REFERENCESLOTCOUNT, value); }
    /** Unsafe version of {@link #pReferenceSlots(VkVideoReferenceSlotKHR.Buffer) pReferenceSlots}. */
    public static void npReferenceSlots(long struct, @Nullable VkVideoReferenceSlotKHR.Buffer value) { memPutAddress(struct + VkVideoBeginCodingInfoKHR.PREFERENCESLOTS, memAddressSafe(value)); nreferenceSlotCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int referenceSlotCount = nreferenceSlotCount(struct);
        if (referenceSlotCount != 0) {
            long pReferenceSlots = memGetAddress(struct + VkVideoBeginCodingInfoKHR.PREFERENCESLOTS);
            check(pReferenceSlots);
            validate(pReferenceSlots, referenceSlotCount, VkVideoReferenceSlotKHR.SIZEOF, VkVideoReferenceSlotKHR::validate);
        }
    }

    // -----------------------------------

    /** An array of {@link VkVideoBeginCodingInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoBeginCodingInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoBeginCodingInfoKHR ELEMENT_FACTORY = VkVideoBeginCodingInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoBeginCodingInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoBeginCodingInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkVideoBeginCodingInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoBeginCodingInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoBeginCodingInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoBeginCodingInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoBeginCodingInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkVideoBeginCodingInfoKHR#flags} field. */
        @NativeType("VkVideoBeginCodingFlagsKHR")
        public int flags() { return VkVideoBeginCodingInfoKHR.nflags(address()); }
        /** @return the value of the {@link VkVideoBeginCodingInfoKHR#codecQualityPreset} field. */
        @NativeType("VkVideoCodingQualityPresetFlagsKHR")
        public int codecQualityPreset() { return VkVideoBeginCodingInfoKHR.ncodecQualityPreset(address()); }
        /** @return the value of the {@link VkVideoBeginCodingInfoKHR#videoSession} field. */
        @NativeType("VkVideoSessionKHR")
        public long videoSession() { return VkVideoBeginCodingInfoKHR.nvideoSession(address()); }
        /** @return the value of the {@link VkVideoBeginCodingInfoKHR#videoSessionParameters} field. */
        @NativeType("VkVideoSessionParametersKHR")
        public long videoSessionParameters() { return VkVideoBeginCodingInfoKHR.nvideoSessionParameters(address()); }
        /** @return the value of the {@link VkVideoBeginCodingInfoKHR#referenceSlotCount} field. */
        @NativeType("uint32_t")
        public int referenceSlotCount() { return VkVideoBeginCodingInfoKHR.nreferenceSlotCount(address()); }
        /** @return a {@link VkVideoReferenceSlotKHR.Buffer} view of the struct array pointed to by the {@link VkVideoBeginCodingInfoKHR#pReferenceSlots} field. */
        @Nullable
        @NativeType("VkVideoReferenceSlotKHR const *")
        public VkVideoReferenceSlotKHR.Buffer pReferenceSlots() { return VkVideoBeginCodingInfoKHR.npReferenceSlots(address()); }

        /** Sets the specified value to the {@link VkVideoBeginCodingInfoKHR#sType} field. */
        public VkVideoBeginCodingInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoBeginCodingInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_BEGIN_CODING_INFO_KHR STRUCTURE_TYPE_VIDEO_BEGIN_CODING_INFO_KHR} value to the {@link VkVideoBeginCodingInfoKHR#sType} field. */
        public VkVideoBeginCodingInfoKHR.Buffer sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_BEGIN_CODING_INFO_KHR); }
        /** Sets the specified value to the {@link VkVideoBeginCodingInfoKHR#pNext} field. */
        public VkVideoBeginCodingInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoBeginCodingInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoBeginCodingInfoKHR#flags} field. */
        public VkVideoBeginCodingInfoKHR.Buffer flags(@NativeType("VkVideoBeginCodingFlagsKHR") int value) { VkVideoBeginCodingInfoKHR.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoBeginCodingInfoKHR#codecQualityPreset} field. */
        public VkVideoBeginCodingInfoKHR.Buffer codecQualityPreset(@NativeType("VkVideoCodingQualityPresetFlagsKHR") int value) { VkVideoBeginCodingInfoKHR.ncodecQualityPreset(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoBeginCodingInfoKHR#videoSession} field. */
        public VkVideoBeginCodingInfoKHR.Buffer videoSession(@NativeType("VkVideoSessionKHR") long value) { VkVideoBeginCodingInfoKHR.nvideoSession(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoBeginCodingInfoKHR#videoSessionParameters} field. */
        public VkVideoBeginCodingInfoKHR.Buffer videoSessionParameters(@NativeType("VkVideoSessionParametersKHR") long value) { VkVideoBeginCodingInfoKHR.nvideoSessionParameters(address(), value); return this; }
        /** Sets the address of the specified {@link VkVideoReferenceSlotKHR.Buffer} to the {@link VkVideoBeginCodingInfoKHR#pReferenceSlots} field. */
        public VkVideoBeginCodingInfoKHR.Buffer pReferenceSlots(@Nullable @NativeType("VkVideoReferenceSlotKHR const *") VkVideoReferenceSlotKHR.Buffer value) { VkVideoBeginCodingInfoKHR.npReferenceSlots(address(), value); return this; }

    }

}