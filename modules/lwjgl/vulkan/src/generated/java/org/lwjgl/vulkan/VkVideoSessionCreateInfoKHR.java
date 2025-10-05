/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre><code>
 * struct VkVideoSessionCreateInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t queueFamilyIndex;
 *     VkVideoSessionCreateFlagsKHR flags;
 *     {@link VkVideoProfileInfoKHR VkVideoProfileInfoKHR} const * pVideoProfile;
 *     VkFormat pictureFormat;
 *     {@link VkExtent2D VkExtent2D} maxCodedExtent;
 *     VkFormat referencePictureFormat;
 *     uint32_t maxDpbSlots;
 *     uint32_t maxActiveReferencePictures;
 *     {@link VkExtensionProperties VkExtensionProperties} const * pStdHeaderVersion;
 * }</code></pre>
 */
public class VkVideoSessionCreateInfoKHR extends Struct<VkVideoSessionCreateInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        QUEUEFAMILYINDEX,
        FLAGS,
        PVIDEOPROFILE,
        PICTUREFORMAT,
        MAXCODEDEXTENT,
        REFERENCEPICTUREFORMAT,
        MAXDPBSLOTS,
        MAXACTIVEREFERENCEPICTURES,
        PSTDHEADERVERSION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        QUEUEFAMILYINDEX = layout.offsetof(2);
        FLAGS = layout.offsetof(3);
        PVIDEOPROFILE = layout.offsetof(4);
        PICTUREFORMAT = layout.offsetof(5);
        MAXCODEDEXTENT = layout.offsetof(6);
        REFERENCEPICTUREFORMAT = layout.offsetof(7);
        MAXDPBSLOTS = layout.offsetof(8);
        MAXACTIVEREFERENCEPICTURES = layout.offsetof(9);
        PSTDHEADERVERSION = layout.offsetof(10);
    }

    protected VkVideoSessionCreateInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoSessionCreateInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoSessionCreateInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoSessionCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoSessionCreateInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code queueFamilyIndex} field. */
    @NativeType("uint32_t")
    public int queueFamilyIndex() { return nqueueFamilyIndex(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("VkVideoSessionCreateFlagsKHR")
    public int flags() { return nflags(address()); }
    /** @return a {@link VkVideoProfileInfoKHR} view of the struct pointed to by the {@code pVideoProfile} field. */
    @NativeType("VkVideoProfileInfoKHR const *")
    public VkVideoProfileInfoKHR pVideoProfile() { return npVideoProfile(address()); }
    /** @return the value of the {@code pictureFormat} field. */
    @NativeType("VkFormat")
    public int pictureFormat() { return npictureFormat(address()); }
    /** @return a {@link VkExtent2D} view of the {@code maxCodedExtent} field. */
    public VkExtent2D maxCodedExtent() { return nmaxCodedExtent(address()); }
    /** @return the value of the {@code referencePictureFormat} field. */
    @NativeType("VkFormat")
    public int referencePictureFormat() { return nreferencePictureFormat(address()); }
    /** @return the value of the {@code maxDpbSlots} field. */
    @NativeType("uint32_t")
    public int maxDpbSlots() { return nmaxDpbSlots(address()); }
    /** @return the value of the {@code maxActiveReferencePictures} field. */
    @NativeType("uint32_t")
    public int maxActiveReferencePictures() { return nmaxActiveReferencePictures(address()); }
    /** @return a {@link VkExtensionProperties} view of the struct pointed to by the {@code pStdHeaderVersion} field. */
    @NativeType("VkExtensionProperties const *")
    public VkExtensionProperties pStdHeaderVersion() { return npStdHeaderVersion(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkVideoSessionCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_SESSION_CREATE_INFO_KHR STRUCTURE_TYPE_VIDEO_SESSION_CREATE_INFO_KHR} value to the {@code sType} field. */
    public VkVideoSessionCreateInfoKHR sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_SESSION_CREATE_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoSessionCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkVideoEncodeAV1SessionCreateInfoKHR} value to the {@code pNext} chain. */
    public VkVideoSessionCreateInfoKHR pNext(VkVideoEncodeAV1SessionCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeH264SessionCreateInfoKHR} value to the {@code pNext} chain. */
    public VkVideoSessionCreateInfoKHR pNext(VkVideoEncodeH264SessionCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeH265SessionCreateInfoKHR} value to the {@code pNext} chain. */
    public VkVideoSessionCreateInfoKHR pNext(VkVideoEncodeH265SessionCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeSessionIntraRefreshCreateInfoKHR} value to the {@code pNext} chain. */
    public VkVideoSessionCreateInfoKHR pNext(VkVideoEncodeSessionIntraRefreshCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeSessionRgbConversionCreateInfoVALVE} value to the {@code pNext} chain. */
    public VkVideoSessionCreateInfoKHR pNext(VkVideoEncodeSessionRgbConversionCreateInfoVALVE value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code queueFamilyIndex} field. */
    public VkVideoSessionCreateInfoKHR queueFamilyIndex(@NativeType("uint32_t") int value) { nqueueFamilyIndex(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkVideoSessionCreateInfoKHR flags(@NativeType("VkVideoSessionCreateFlagsKHR") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link VkVideoProfileInfoKHR} to the {@code pVideoProfile} field. */
    public VkVideoSessionCreateInfoKHR pVideoProfile(@NativeType("VkVideoProfileInfoKHR const *") VkVideoProfileInfoKHR value) { npVideoProfile(address(), value); return this; }
    /** Sets the specified value to the {@code pictureFormat} field. */
    public VkVideoSessionCreateInfoKHR pictureFormat(@NativeType("VkFormat") int value) { npictureFormat(address(), value); return this; }
    /** Copies the specified {@link VkExtent2D} to the {@code maxCodedExtent} field. */
    public VkVideoSessionCreateInfoKHR maxCodedExtent(VkExtent2D value) { nmaxCodedExtent(address(), value); return this; }
    /** Passes the {@code maxCodedExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkVideoSessionCreateInfoKHR maxCodedExtent(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(maxCodedExtent()); return this; }
    /** Sets the specified value to the {@code referencePictureFormat} field. */
    public VkVideoSessionCreateInfoKHR referencePictureFormat(@NativeType("VkFormat") int value) { nreferencePictureFormat(address(), value); return this; }
    /** Sets the specified value to the {@code maxDpbSlots} field. */
    public VkVideoSessionCreateInfoKHR maxDpbSlots(@NativeType("uint32_t") int value) { nmaxDpbSlots(address(), value); return this; }
    /** Sets the specified value to the {@code maxActiveReferencePictures} field. */
    public VkVideoSessionCreateInfoKHR maxActiveReferencePictures(@NativeType("uint32_t") int value) { nmaxActiveReferencePictures(address(), value); return this; }
    /** Sets the address of the specified {@link VkExtensionProperties} to the {@code pStdHeaderVersion} field. */
    public VkVideoSessionCreateInfoKHR pStdHeaderVersion(@NativeType("VkExtensionProperties const *") VkExtensionProperties value) { npStdHeaderVersion(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoSessionCreateInfoKHR set(
        int sType,
        long pNext,
        int queueFamilyIndex,
        int flags,
        VkVideoProfileInfoKHR pVideoProfile,
        int pictureFormat,
        VkExtent2D maxCodedExtent,
        int referencePictureFormat,
        int maxDpbSlots,
        int maxActiveReferencePictures,
        VkExtensionProperties pStdHeaderVersion
    ) {
        sType(sType);
        pNext(pNext);
        queueFamilyIndex(queueFamilyIndex);
        flags(flags);
        pVideoProfile(pVideoProfile);
        pictureFormat(pictureFormat);
        maxCodedExtent(maxCodedExtent);
        referencePictureFormat(referencePictureFormat);
        maxDpbSlots(maxDpbSlots);
        maxActiveReferencePictures(maxActiveReferencePictures);
        pStdHeaderVersion(pStdHeaderVersion);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoSessionCreateInfoKHR set(VkVideoSessionCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoSessionCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoSessionCreateInfoKHR malloc() {
        return new VkVideoSessionCreateInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoSessionCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoSessionCreateInfoKHR calloc() {
        return new VkVideoSessionCreateInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoSessionCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoSessionCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoSessionCreateInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoSessionCreateInfoKHR} instance for the specified memory address. */
    public static VkVideoSessionCreateInfoKHR create(long address) {
        return new VkVideoSessionCreateInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoSessionCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoSessionCreateInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoSessionCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoSessionCreateInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoSessionCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoSessionCreateInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoSessionCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoSessionCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoSessionCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoSessionCreateInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoSessionCreateInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoSessionCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoSessionCreateInfoKHR malloc(MemoryStack stack) {
        return new VkVideoSessionCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoSessionCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoSessionCreateInfoKHR calloc(MemoryStack stack) {
        return new VkVideoSessionCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoSessionCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoSessionCreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoSessionCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoSessionCreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoSessionCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoSessionCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #queueFamilyIndex}. */
    public static int nqueueFamilyIndex(long struct) { return memGetInt(struct + VkVideoSessionCreateInfoKHR.QUEUEFAMILYINDEX); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkVideoSessionCreateInfoKHR.FLAGS); }
    /** Unsafe version of {@link #pVideoProfile}. */
    public static VkVideoProfileInfoKHR npVideoProfile(long struct) { return VkVideoProfileInfoKHR.create(memGetAddress(struct + VkVideoSessionCreateInfoKHR.PVIDEOPROFILE)); }
    /** Unsafe version of {@link #pictureFormat}. */
    public static int npictureFormat(long struct) { return memGetInt(struct + VkVideoSessionCreateInfoKHR.PICTUREFORMAT); }
    /** Unsafe version of {@link #maxCodedExtent}. */
    public static VkExtent2D nmaxCodedExtent(long struct) { return VkExtent2D.create(struct + VkVideoSessionCreateInfoKHR.MAXCODEDEXTENT); }
    /** Unsafe version of {@link #referencePictureFormat}. */
    public static int nreferencePictureFormat(long struct) { return memGetInt(struct + VkVideoSessionCreateInfoKHR.REFERENCEPICTUREFORMAT); }
    /** Unsafe version of {@link #maxDpbSlots}. */
    public static int nmaxDpbSlots(long struct) { return memGetInt(struct + VkVideoSessionCreateInfoKHR.MAXDPBSLOTS); }
    /** Unsafe version of {@link #maxActiveReferencePictures}. */
    public static int nmaxActiveReferencePictures(long struct) { return memGetInt(struct + VkVideoSessionCreateInfoKHR.MAXACTIVEREFERENCEPICTURES); }
    /** Unsafe version of {@link #pStdHeaderVersion}. */
    public static VkExtensionProperties npStdHeaderVersion(long struct) { return VkExtensionProperties.create(memGetAddress(struct + VkVideoSessionCreateInfoKHR.PSTDHEADERVERSION)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoSessionCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoSessionCreateInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #queueFamilyIndex(int) queueFamilyIndex}. */
    public static void nqueueFamilyIndex(long struct, int value) { memPutInt(struct + VkVideoSessionCreateInfoKHR.QUEUEFAMILYINDEX, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkVideoSessionCreateInfoKHR.FLAGS, value); }
    /** Unsafe version of {@link #pVideoProfile(VkVideoProfileInfoKHR) pVideoProfile}. */
    public static void npVideoProfile(long struct, VkVideoProfileInfoKHR value) { memPutAddress(struct + VkVideoSessionCreateInfoKHR.PVIDEOPROFILE, value.address()); }
    /** Unsafe version of {@link #pictureFormat(int) pictureFormat}. */
    public static void npictureFormat(long struct, int value) { memPutInt(struct + VkVideoSessionCreateInfoKHR.PICTUREFORMAT, value); }
    /** Unsafe version of {@link #maxCodedExtent(VkExtent2D) maxCodedExtent}. */
    public static void nmaxCodedExtent(long struct, VkExtent2D value) { memCopy(value.address(), struct + VkVideoSessionCreateInfoKHR.MAXCODEDEXTENT, VkExtent2D.SIZEOF); }
    /** Unsafe version of {@link #referencePictureFormat(int) referencePictureFormat}. */
    public static void nreferencePictureFormat(long struct, int value) { memPutInt(struct + VkVideoSessionCreateInfoKHR.REFERENCEPICTUREFORMAT, value); }
    /** Unsafe version of {@link #maxDpbSlots(int) maxDpbSlots}. */
    public static void nmaxDpbSlots(long struct, int value) { memPutInt(struct + VkVideoSessionCreateInfoKHR.MAXDPBSLOTS, value); }
    /** Unsafe version of {@link #maxActiveReferencePictures(int) maxActiveReferencePictures}. */
    public static void nmaxActiveReferencePictures(long struct, int value) { memPutInt(struct + VkVideoSessionCreateInfoKHR.MAXACTIVEREFERENCEPICTURES, value); }
    /** Unsafe version of {@link #pStdHeaderVersion(VkExtensionProperties) pStdHeaderVersion}. */
    public static void npStdHeaderVersion(long struct, VkExtensionProperties value) { memPutAddress(struct + VkVideoSessionCreateInfoKHR.PSTDHEADERVERSION, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkVideoSessionCreateInfoKHR.PVIDEOPROFILE));
        check(memGetAddress(struct + VkVideoSessionCreateInfoKHR.PSTDHEADERVERSION));
    }

    // -----------------------------------

    /** An array of {@link VkVideoSessionCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoSessionCreateInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoSessionCreateInfoKHR ELEMENT_FACTORY = VkVideoSessionCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoSessionCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoSessionCreateInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkVideoSessionCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoSessionCreateInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoSessionCreateInfoKHR.npNext(address()); }
        /** @return the value of the {@code queueFamilyIndex} field. */
        @NativeType("uint32_t")
        public int queueFamilyIndex() { return VkVideoSessionCreateInfoKHR.nqueueFamilyIndex(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkVideoSessionCreateFlagsKHR")
        public int flags() { return VkVideoSessionCreateInfoKHR.nflags(address()); }
        /** @return a {@link VkVideoProfileInfoKHR} view of the struct pointed to by the {@code pVideoProfile} field. */
        @NativeType("VkVideoProfileInfoKHR const *")
        public VkVideoProfileInfoKHR pVideoProfile() { return VkVideoSessionCreateInfoKHR.npVideoProfile(address()); }
        /** @return the value of the {@code pictureFormat} field. */
        @NativeType("VkFormat")
        public int pictureFormat() { return VkVideoSessionCreateInfoKHR.npictureFormat(address()); }
        /** @return a {@link VkExtent2D} view of the {@code maxCodedExtent} field. */
        public VkExtent2D maxCodedExtent() { return VkVideoSessionCreateInfoKHR.nmaxCodedExtent(address()); }
        /** @return the value of the {@code referencePictureFormat} field. */
        @NativeType("VkFormat")
        public int referencePictureFormat() { return VkVideoSessionCreateInfoKHR.nreferencePictureFormat(address()); }
        /** @return the value of the {@code maxDpbSlots} field. */
        @NativeType("uint32_t")
        public int maxDpbSlots() { return VkVideoSessionCreateInfoKHR.nmaxDpbSlots(address()); }
        /** @return the value of the {@code maxActiveReferencePictures} field. */
        @NativeType("uint32_t")
        public int maxActiveReferencePictures() { return VkVideoSessionCreateInfoKHR.nmaxActiveReferencePictures(address()); }
        /** @return a {@link VkExtensionProperties} view of the struct pointed to by the {@code pStdHeaderVersion} field. */
        @NativeType("VkExtensionProperties const *")
        public VkExtensionProperties pStdHeaderVersion() { return VkVideoSessionCreateInfoKHR.npStdHeaderVersion(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkVideoSessionCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoSessionCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_SESSION_CREATE_INFO_KHR STRUCTURE_TYPE_VIDEO_SESSION_CREATE_INFO_KHR} value to the {@code sType} field. */
        public VkVideoSessionCreateInfoKHR.Buffer sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_SESSION_CREATE_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoSessionCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoSessionCreateInfoKHR.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkVideoEncodeAV1SessionCreateInfoKHR} value to the {@code pNext} chain. */
        public VkVideoSessionCreateInfoKHR.Buffer pNext(VkVideoEncodeAV1SessionCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeH264SessionCreateInfoKHR} value to the {@code pNext} chain. */
        public VkVideoSessionCreateInfoKHR.Buffer pNext(VkVideoEncodeH264SessionCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeH265SessionCreateInfoKHR} value to the {@code pNext} chain. */
        public VkVideoSessionCreateInfoKHR.Buffer pNext(VkVideoEncodeH265SessionCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeSessionIntraRefreshCreateInfoKHR} value to the {@code pNext} chain. */
        public VkVideoSessionCreateInfoKHR.Buffer pNext(VkVideoEncodeSessionIntraRefreshCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeSessionRgbConversionCreateInfoVALVE} value to the {@code pNext} chain. */
        public VkVideoSessionCreateInfoKHR.Buffer pNext(VkVideoEncodeSessionRgbConversionCreateInfoVALVE value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code queueFamilyIndex} field. */
        public VkVideoSessionCreateInfoKHR.Buffer queueFamilyIndex(@NativeType("uint32_t") int value) { VkVideoSessionCreateInfoKHR.nqueueFamilyIndex(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkVideoSessionCreateInfoKHR.Buffer flags(@NativeType("VkVideoSessionCreateFlagsKHR") int value) { VkVideoSessionCreateInfoKHR.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link VkVideoProfileInfoKHR} to the {@code pVideoProfile} field. */
        public VkVideoSessionCreateInfoKHR.Buffer pVideoProfile(@NativeType("VkVideoProfileInfoKHR const *") VkVideoProfileInfoKHR value) { VkVideoSessionCreateInfoKHR.npVideoProfile(address(), value); return this; }
        /** Sets the specified value to the {@code pictureFormat} field. */
        public VkVideoSessionCreateInfoKHR.Buffer pictureFormat(@NativeType("VkFormat") int value) { VkVideoSessionCreateInfoKHR.npictureFormat(address(), value); return this; }
        /** Copies the specified {@link VkExtent2D} to the {@code maxCodedExtent} field. */
        public VkVideoSessionCreateInfoKHR.Buffer maxCodedExtent(VkExtent2D value) { VkVideoSessionCreateInfoKHR.nmaxCodedExtent(address(), value); return this; }
        /** Passes the {@code maxCodedExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkVideoSessionCreateInfoKHR.Buffer maxCodedExtent(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(maxCodedExtent()); return this; }
        /** Sets the specified value to the {@code referencePictureFormat} field. */
        public VkVideoSessionCreateInfoKHR.Buffer referencePictureFormat(@NativeType("VkFormat") int value) { VkVideoSessionCreateInfoKHR.nreferencePictureFormat(address(), value); return this; }
        /** Sets the specified value to the {@code maxDpbSlots} field. */
        public VkVideoSessionCreateInfoKHR.Buffer maxDpbSlots(@NativeType("uint32_t") int value) { VkVideoSessionCreateInfoKHR.nmaxDpbSlots(address(), value); return this; }
        /** Sets the specified value to the {@code maxActiveReferencePictures} field. */
        public VkVideoSessionCreateInfoKHR.Buffer maxActiveReferencePictures(@NativeType("uint32_t") int value) { VkVideoSessionCreateInfoKHR.nmaxActiveReferencePictures(address(), value); return this; }
        /** Sets the address of the specified {@link VkExtensionProperties} to the {@code pStdHeaderVersion} field. */
        public VkVideoSessionCreateInfoKHR.Buffer pStdHeaderVersion(@NativeType("VkExtensionProperties const *") VkExtensionProperties value) { VkVideoSessionCreateInfoKHR.npStdHeaderVersion(address(), value); return this; }

    }

}