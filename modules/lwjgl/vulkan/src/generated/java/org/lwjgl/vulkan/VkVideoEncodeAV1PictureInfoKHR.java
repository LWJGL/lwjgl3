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

import org.lwjgl.vulkan.video.*;

import static org.lwjgl.vulkan.KHRVideoEncodeAV1.*;

/**
 * <pre>{@code
 * struct VkVideoEncodeAV1PictureInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkVideoEncodeAV1PredictionModeKHR predictionMode;
 *     VkVideoEncodeAV1RateControlGroupKHR rateControlGroup;
 *     uint32_t constantQIndex;
 *     {@link StdVideoEncodeAV1PictureInfo StdVideoEncodeAV1PictureInfo} const * pStdPictureInfo;
 *     int32_t referenceNameSlotIndices[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR];
 *     VkBool32 primaryReferenceCdfOnly;
 *     VkBool32 generateObuExtensionHeader;
 * }}</pre>
 */
public class VkVideoEncodeAV1PictureInfoKHR extends Struct<VkVideoEncodeAV1PictureInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PREDICTIONMODE,
        RATECONTROLGROUP,
        CONSTANTQINDEX,
        PSTDPICTUREINFO,
        REFERENCENAMESLOTINDICES,
        PRIMARYREFERENCECDFONLY,
        GENERATEOBUEXTENSIONHEADER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __array(4, VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PREDICTIONMODE = layout.offsetof(2);
        RATECONTROLGROUP = layout.offsetof(3);
        CONSTANTQINDEX = layout.offsetof(4);
        PSTDPICTUREINFO = layout.offsetof(5);
        REFERENCENAMESLOTINDICES = layout.offsetof(6);
        PRIMARYREFERENCECDFONLY = layout.offsetof(7);
        GENERATEOBUEXTENSIONHEADER = layout.offsetof(8);
    }

    protected VkVideoEncodeAV1PictureInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeAV1PictureInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeAV1PictureInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeAV1PictureInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeAV1PictureInfoKHR(ByteBuffer container) {
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
    /** @return the value of the {@code predictionMode} field. */
    @NativeType("VkVideoEncodeAV1PredictionModeKHR")
    public int predictionMode() { return npredictionMode(address()); }
    /** @return the value of the {@code rateControlGroup} field. */
    @NativeType("VkVideoEncodeAV1RateControlGroupKHR")
    public int rateControlGroup() { return nrateControlGroup(address()); }
    /** @return the value of the {@code constantQIndex} field. */
    @NativeType("uint32_t")
    public int constantQIndex() { return nconstantQIndex(address()); }
    /** @return a {@link StdVideoEncodeAV1PictureInfo} view of the struct pointed to by the {@code pStdPictureInfo} field. */
    @NativeType("StdVideoEncodeAV1PictureInfo const *")
    public StdVideoEncodeAV1PictureInfo pStdPictureInfo() { return npStdPictureInfo(address()); }
    /** @return a {@link IntBuffer} view of the {@code referenceNameSlotIndices} field. */
    @NativeType("int32_t[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR]")
    public IntBuffer referenceNameSlotIndices() { return nreferenceNameSlotIndices(address()); }
    /** @return the value at the specified index of the {@code referenceNameSlotIndices} field. */
    @NativeType("int32_t")
    public int referenceNameSlotIndices(int index) { return nreferenceNameSlotIndices(address(), index); }
    /** @return the value of the {@code primaryReferenceCdfOnly} field. */
    @NativeType("VkBool32")
    public boolean primaryReferenceCdfOnly() { return nprimaryReferenceCdfOnly(address()) != 0; }
    /** @return the value of the {@code generateObuExtensionHeader} field. */
    @NativeType("VkBool32")
    public boolean generateObuExtensionHeader() { return ngenerateObuExtensionHeader(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkVideoEncodeAV1PictureInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeAV1#VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_PICTURE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_AV1_PICTURE_INFO_KHR} value to the {@code sType} field. */
    public VkVideoEncodeAV1PictureInfoKHR sType$Default() { return sType(KHRVideoEncodeAV1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_PICTURE_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoEncodeAV1PictureInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code predictionMode} field. */
    public VkVideoEncodeAV1PictureInfoKHR predictionMode(@NativeType("VkVideoEncodeAV1PredictionModeKHR") int value) { npredictionMode(address(), value); return this; }
    /** Sets the specified value to the {@code rateControlGroup} field. */
    public VkVideoEncodeAV1PictureInfoKHR rateControlGroup(@NativeType("VkVideoEncodeAV1RateControlGroupKHR") int value) { nrateControlGroup(address(), value); return this; }
    /** Sets the specified value to the {@code constantQIndex} field. */
    public VkVideoEncodeAV1PictureInfoKHR constantQIndex(@NativeType("uint32_t") int value) { nconstantQIndex(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoEncodeAV1PictureInfo} to the {@code pStdPictureInfo} field. */
    public VkVideoEncodeAV1PictureInfoKHR pStdPictureInfo(@NativeType("StdVideoEncodeAV1PictureInfo const *") StdVideoEncodeAV1PictureInfo value) { npStdPictureInfo(address(), value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code referenceNameSlotIndices} field. */
    public VkVideoEncodeAV1PictureInfoKHR referenceNameSlotIndices(@NativeType("int32_t[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR]") IntBuffer value) { nreferenceNameSlotIndices(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code referenceNameSlotIndices} field. */
    public VkVideoEncodeAV1PictureInfoKHR referenceNameSlotIndices(int index, @NativeType("int32_t") int value) { nreferenceNameSlotIndices(address(), index, value); return this; }
    /** Sets the specified value to the {@code primaryReferenceCdfOnly} field. */
    public VkVideoEncodeAV1PictureInfoKHR primaryReferenceCdfOnly(@NativeType("VkBool32") boolean value) { nprimaryReferenceCdfOnly(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code generateObuExtensionHeader} field. */
    public VkVideoEncodeAV1PictureInfoKHR generateObuExtensionHeader(@NativeType("VkBool32") boolean value) { ngenerateObuExtensionHeader(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeAV1PictureInfoKHR set(
        int sType,
        long pNext,
        int predictionMode,
        int rateControlGroup,
        int constantQIndex,
        StdVideoEncodeAV1PictureInfo pStdPictureInfo,
        IntBuffer referenceNameSlotIndices,
        boolean primaryReferenceCdfOnly,
        boolean generateObuExtensionHeader
    ) {
        sType(sType);
        pNext(pNext);
        predictionMode(predictionMode);
        rateControlGroup(rateControlGroup);
        constantQIndex(constantQIndex);
        pStdPictureInfo(pStdPictureInfo);
        referenceNameSlotIndices(referenceNameSlotIndices);
        primaryReferenceCdfOnly(primaryReferenceCdfOnly);
        generateObuExtensionHeader(generateObuExtensionHeader);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeAV1PictureInfoKHR set(VkVideoEncodeAV1PictureInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeAV1PictureInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeAV1PictureInfoKHR malloc() {
        return new VkVideoEncodeAV1PictureInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeAV1PictureInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeAV1PictureInfoKHR calloc() {
        return new VkVideoEncodeAV1PictureInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeAV1PictureInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeAV1PictureInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeAV1PictureInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeAV1PictureInfoKHR} instance for the specified memory address. */
    public static VkVideoEncodeAV1PictureInfoKHR create(long address) {
        return new VkVideoEncodeAV1PictureInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoEncodeAV1PictureInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeAV1PictureInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1PictureInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1PictureInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1PictureInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1PictureInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1PictureInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1PictureInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeAV1PictureInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1PictureInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoEncodeAV1PictureInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeAV1PictureInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeAV1PictureInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeAV1PictureInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeAV1PictureInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeAV1PictureInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeAV1PictureInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1PictureInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1PictureInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1PictureInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1PictureInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoEncodeAV1PictureInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeAV1PictureInfoKHR.PNEXT); }
    /** Unsafe version of {@link #predictionMode}. */
    public static int npredictionMode(long struct) { return memGetInt(struct + VkVideoEncodeAV1PictureInfoKHR.PREDICTIONMODE); }
    /** Unsafe version of {@link #rateControlGroup}. */
    public static int nrateControlGroup(long struct) { return memGetInt(struct + VkVideoEncodeAV1PictureInfoKHR.RATECONTROLGROUP); }
    /** Unsafe version of {@link #constantQIndex}. */
    public static int nconstantQIndex(long struct) { return memGetInt(struct + VkVideoEncodeAV1PictureInfoKHR.CONSTANTQINDEX); }
    /** Unsafe version of {@link #pStdPictureInfo}. */
    public static StdVideoEncodeAV1PictureInfo npStdPictureInfo(long struct) { return StdVideoEncodeAV1PictureInfo.create(memGetAddress(struct + VkVideoEncodeAV1PictureInfoKHR.PSTDPICTUREINFO)); }
    /** Unsafe version of {@link #referenceNameSlotIndices}. */
    public static IntBuffer nreferenceNameSlotIndices(long struct) { return memIntBuffer(struct + VkVideoEncodeAV1PictureInfoKHR.REFERENCENAMESLOTINDICES, VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR); }
    /** Unsafe version of {@link #referenceNameSlotIndices(int) referenceNameSlotIndices}. */
    public static int nreferenceNameSlotIndices(long struct, int index) {
        return memGetInt(struct + VkVideoEncodeAV1PictureInfoKHR.REFERENCENAMESLOTINDICES + check(index, VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR) * 4);
    }
    /** Unsafe version of {@link #primaryReferenceCdfOnly}. */
    public static int nprimaryReferenceCdfOnly(long struct) { return memGetInt(struct + VkVideoEncodeAV1PictureInfoKHR.PRIMARYREFERENCECDFONLY); }
    /** Unsafe version of {@link #generateObuExtensionHeader}. */
    public static int ngenerateObuExtensionHeader(long struct) { return memGetInt(struct + VkVideoEncodeAV1PictureInfoKHR.GENERATEOBUEXTENSIONHEADER); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoEncodeAV1PictureInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeAV1PictureInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #predictionMode(int) predictionMode}. */
    public static void npredictionMode(long struct, int value) { memPutInt(struct + VkVideoEncodeAV1PictureInfoKHR.PREDICTIONMODE, value); }
    /** Unsafe version of {@link #rateControlGroup(int) rateControlGroup}. */
    public static void nrateControlGroup(long struct, int value) { memPutInt(struct + VkVideoEncodeAV1PictureInfoKHR.RATECONTROLGROUP, value); }
    /** Unsafe version of {@link #constantQIndex(int) constantQIndex}. */
    public static void nconstantQIndex(long struct, int value) { memPutInt(struct + VkVideoEncodeAV1PictureInfoKHR.CONSTANTQINDEX, value); }
    /** Unsafe version of {@link #pStdPictureInfo(StdVideoEncodeAV1PictureInfo) pStdPictureInfo}. */
    public static void npStdPictureInfo(long struct, StdVideoEncodeAV1PictureInfo value) { memPutAddress(struct + VkVideoEncodeAV1PictureInfoKHR.PSTDPICTUREINFO, value.address()); }
    /** Unsafe version of {@link #referenceNameSlotIndices(IntBuffer) referenceNameSlotIndices}. */
    public static void nreferenceNameSlotIndices(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR); }
        memCopy(memAddress(value), struct + VkVideoEncodeAV1PictureInfoKHR.REFERENCENAMESLOTINDICES, value.remaining() * 4);
    }
    /** Unsafe version of {@link #referenceNameSlotIndices(int, int) referenceNameSlotIndices}. */
    public static void nreferenceNameSlotIndices(long struct, int index, int value) {
        memPutInt(struct + VkVideoEncodeAV1PictureInfoKHR.REFERENCENAMESLOTINDICES + check(index, VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR) * 4, value);
    }
    /** Unsafe version of {@link #primaryReferenceCdfOnly(boolean) primaryReferenceCdfOnly}. */
    public static void nprimaryReferenceCdfOnly(long struct, int value) { memPutInt(struct + VkVideoEncodeAV1PictureInfoKHR.PRIMARYREFERENCECDFONLY, value); }
    /** Unsafe version of {@link #generateObuExtensionHeader(boolean) generateObuExtensionHeader}. */
    public static void ngenerateObuExtensionHeader(long struct, int value) { memPutInt(struct + VkVideoEncodeAV1PictureInfoKHR.GENERATEOBUEXTENSIONHEADER, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long pStdPictureInfo = memGetAddress(struct + VkVideoEncodeAV1PictureInfoKHR.PSTDPICTUREINFO);
        check(pStdPictureInfo);
        StdVideoEncodeAV1PictureInfo.validate(pStdPictureInfo);
    }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeAV1PictureInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeAV1PictureInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeAV1PictureInfoKHR ELEMENT_FACTORY = VkVideoEncodeAV1PictureInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeAV1PictureInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeAV1PictureInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeAV1PictureInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeAV1PictureInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeAV1PictureInfoKHR.npNext(address()); }
        /** @return the value of the {@code predictionMode} field. */
        @NativeType("VkVideoEncodeAV1PredictionModeKHR")
        public int predictionMode() { return VkVideoEncodeAV1PictureInfoKHR.npredictionMode(address()); }
        /** @return the value of the {@code rateControlGroup} field. */
        @NativeType("VkVideoEncodeAV1RateControlGroupKHR")
        public int rateControlGroup() { return VkVideoEncodeAV1PictureInfoKHR.nrateControlGroup(address()); }
        /** @return the value of the {@code constantQIndex} field. */
        @NativeType("uint32_t")
        public int constantQIndex() { return VkVideoEncodeAV1PictureInfoKHR.nconstantQIndex(address()); }
        /** @return a {@link StdVideoEncodeAV1PictureInfo} view of the struct pointed to by the {@code pStdPictureInfo} field. */
        @NativeType("StdVideoEncodeAV1PictureInfo const *")
        public StdVideoEncodeAV1PictureInfo pStdPictureInfo() { return VkVideoEncodeAV1PictureInfoKHR.npStdPictureInfo(address()); }
        /** @return a {@link IntBuffer} view of the {@code referenceNameSlotIndices} field. */
        @NativeType("int32_t[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR]")
        public IntBuffer referenceNameSlotIndices() { return VkVideoEncodeAV1PictureInfoKHR.nreferenceNameSlotIndices(address()); }
        /** @return the value at the specified index of the {@code referenceNameSlotIndices} field. */
        @NativeType("int32_t")
        public int referenceNameSlotIndices(int index) { return VkVideoEncodeAV1PictureInfoKHR.nreferenceNameSlotIndices(address(), index); }
        /** @return the value of the {@code primaryReferenceCdfOnly} field. */
        @NativeType("VkBool32")
        public boolean primaryReferenceCdfOnly() { return VkVideoEncodeAV1PictureInfoKHR.nprimaryReferenceCdfOnly(address()) != 0; }
        /** @return the value of the {@code generateObuExtensionHeader} field. */
        @NativeType("VkBool32")
        public boolean generateObuExtensionHeader() { return VkVideoEncodeAV1PictureInfoKHR.ngenerateObuExtensionHeader(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkVideoEncodeAV1PictureInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeAV1PictureInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeAV1#VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_PICTURE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_AV1_PICTURE_INFO_KHR} value to the {@code sType} field. */
        public VkVideoEncodeAV1PictureInfoKHR.Buffer sType$Default() { return sType(KHRVideoEncodeAV1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_PICTURE_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoEncodeAV1PictureInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeAV1PictureInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code predictionMode} field. */
        public VkVideoEncodeAV1PictureInfoKHR.Buffer predictionMode(@NativeType("VkVideoEncodeAV1PredictionModeKHR") int value) { VkVideoEncodeAV1PictureInfoKHR.npredictionMode(address(), value); return this; }
        /** Sets the specified value to the {@code rateControlGroup} field. */
        public VkVideoEncodeAV1PictureInfoKHR.Buffer rateControlGroup(@NativeType("VkVideoEncodeAV1RateControlGroupKHR") int value) { VkVideoEncodeAV1PictureInfoKHR.nrateControlGroup(address(), value); return this; }
        /** Sets the specified value to the {@code constantQIndex} field. */
        public VkVideoEncodeAV1PictureInfoKHR.Buffer constantQIndex(@NativeType("uint32_t") int value) { VkVideoEncodeAV1PictureInfoKHR.nconstantQIndex(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoEncodeAV1PictureInfo} to the {@code pStdPictureInfo} field. */
        public VkVideoEncodeAV1PictureInfoKHR.Buffer pStdPictureInfo(@NativeType("StdVideoEncodeAV1PictureInfo const *") StdVideoEncodeAV1PictureInfo value) { VkVideoEncodeAV1PictureInfoKHR.npStdPictureInfo(address(), value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code referenceNameSlotIndices} field. */
        public VkVideoEncodeAV1PictureInfoKHR.Buffer referenceNameSlotIndices(@NativeType("int32_t[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR]") IntBuffer value) { VkVideoEncodeAV1PictureInfoKHR.nreferenceNameSlotIndices(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code referenceNameSlotIndices} field. */
        public VkVideoEncodeAV1PictureInfoKHR.Buffer referenceNameSlotIndices(int index, @NativeType("int32_t") int value) { VkVideoEncodeAV1PictureInfoKHR.nreferenceNameSlotIndices(address(), index, value); return this; }
        /** Sets the specified value to the {@code primaryReferenceCdfOnly} field. */
        public VkVideoEncodeAV1PictureInfoKHR.Buffer primaryReferenceCdfOnly(@NativeType("VkBool32") boolean value) { VkVideoEncodeAV1PictureInfoKHR.nprimaryReferenceCdfOnly(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code generateObuExtensionHeader} field. */
        public VkVideoEncodeAV1PictureInfoKHR.Buffer generateObuExtensionHeader(@NativeType("VkBool32") boolean value) { VkVideoEncodeAV1PictureInfoKHR.ngenerateObuExtensionHeader(address(), value ? 1 : 0); return this; }

    }

}