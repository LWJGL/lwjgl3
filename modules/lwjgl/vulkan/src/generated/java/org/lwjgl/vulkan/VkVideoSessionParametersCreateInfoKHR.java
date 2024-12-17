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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkVideoSessionParametersCreateInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkVideoSessionParametersCreateFlagsKHR flags;
 *     VkVideoSessionParametersKHR videoSessionParametersTemplate;
 *     VkVideoSessionKHR videoSession;
 * }}</pre>
 */
public class VkVideoSessionParametersCreateInfoKHR extends Struct<VkVideoSessionParametersCreateInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        VIDEOSESSIONPARAMETERSTEMPLATE,
        VIDEOSESSION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        VIDEOSESSIONPARAMETERSTEMPLATE = layout.offsetof(3);
        VIDEOSESSION = layout.offsetof(4);
    }

    protected VkVideoSessionParametersCreateInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoSessionParametersCreateInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoSessionParametersCreateInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoSessionParametersCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoSessionParametersCreateInfoKHR(ByteBuffer container) {
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
    /** @return the value of the {@code flags} field. */
    @NativeType("VkVideoSessionParametersCreateFlagsKHR")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code videoSessionParametersTemplate} field. */
    @NativeType("VkVideoSessionParametersKHR")
    public long videoSessionParametersTemplate() { return nvideoSessionParametersTemplate(address()); }
    /** @return the value of the {@code videoSession} field. */
    @NativeType("VkVideoSessionKHR")
    public long videoSession() { return nvideoSession(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkVideoSessionParametersCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_CREATE_INFO_KHR STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_CREATE_INFO_KHR} value to the {@code sType} field. */
    public VkVideoSessionParametersCreateInfoKHR sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_CREATE_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoSessionParametersCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkVideoDecodeAV1SessionParametersCreateInfoKHR} value to the {@code pNext} chain. */
    public VkVideoSessionParametersCreateInfoKHR pNext(VkVideoDecodeAV1SessionParametersCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoDecodeH264SessionParametersCreateInfoKHR} value to the {@code pNext} chain. */
    public VkVideoSessionParametersCreateInfoKHR pNext(VkVideoDecodeH264SessionParametersCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoDecodeH265SessionParametersCreateInfoKHR} value to the {@code pNext} chain. */
    public VkVideoSessionParametersCreateInfoKHR pNext(VkVideoDecodeH265SessionParametersCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeAV1SessionParametersCreateInfoKHR} value to the {@code pNext} chain. */
    public VkVideoSessionParametersCreateInfoKHR pNext(VkVideoEncodeAV1SessionParametersCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeH264SessionParametersCreateInfoKHR} value to the {@code pNext} chain. */
    public VkVideoSessionParametersCreateInfoKHR pNext(VkVideoEncodeH264SessionParametersCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeH265SessionParametersCreateInfoKHR} value to the {@code pNext} chain. */
    public VkVideoSessionParametersCreateInfoKHR pNext(VkVideoEncodeH265SessionParametersCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeQualityLevelInfoKHR} value to the {@code pNext} chain. */
    public VkVideoSessionParametersCreateInfoKHR pNext(VkVideoEncodeQualityLevelInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR} value to the {@code pNext} chain. */
    public VkVideoSessionParametersCreateInfoKHR pNext(VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code flags} field. */
    public VkVideoSessionParametersCreateInfoKHR flags(@NativeType("VkVideoSessionParametersCreateFlagsKHR") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code videoSessionParametersTemplate} field. */
    public VkVideoSessionParametersCreateInfoKHR videoSessionParametersTemplate(@NativeType("VkVideoSessionParametersKHR") long value) { nvideoSessionParametersTemplate(address(), value); return this; }
    /** Sets the specified value to the {@code videoSession} field. */
    public VkVideoSessionParametersCreateInfoKHR videoSession(@NativeType("VkVideoSessionKHR") long value) { nvideoSession(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoSessionParametersCreateInfoKHR set(
        int sType,
        long pNext,
        int flags,
        long videoSessionParametersTemplate,
        long videoSession
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        videoSessionParametersTemplate(videoSessionParametersTemplate);
        videoSession(videoSession);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoSessionParametersCreateInfoKHR set(VkVideoSessionParametersCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoSessionParametersCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoSessionParametersCreateInfoKHR malloc() {
        return new VkVideoSessionParametersCreateInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoSessionParametersCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoSessionParametersCreateInfoKHR calloc() {
        return new VkVideoSessionParametersCreateInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoSessionParametersCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoSessionParametersCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoSessionParametersCreateInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoSessionParametersCreateInfoKHR} instance for the specified memory address. */
    public static VkVideoSessionParametersCreateInfoKHR create(long address) {
        return new VkVideoSessionParametersCreateInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoSessionParametersCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoSessionParametersCreateInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoSessionParametersCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoSessionParametersCreateInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoSessionParametersCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoSessionParametersCreateInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoSessionParametersCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoSessionParametersCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoSessionParametersCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoSessionParametersCreateInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoSessionParametersCreateInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoSessionParametersCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoSessionParametersCreateInfoKHR malloc(MemoryStack stack) {
        return new VkVideoSessionParametersCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoSessionParametersCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoSessionParametersCreateInfoKHR calloc(MemoryStack stack) {
        return new VkVideoSessionParametersCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoSessionParametersCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoSessionParametersCreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoSessionParametersCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoSessionParametersCreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoSessionParametersCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoSessionParametersCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkVideoSessionParametersCreateInfoKHR.FLAGS); }
    /** Unsafe version of {@link #videoSessionParametersTemplate}. */
    public static long nvideoSessionParametersTemplate(long struct) { return memGetLong(struct + VkVideoSessionParametersCreateInfoKHR.VIDEOSESSIONPARAMETERSTEMPLATE); }
    /** Unsafe version of {@link #videoSession}. */
    public static long nvideoSession(long struct) { return memGetLong(struct + VkVideoSessionParametersCreateInfoKHR.VIDEOSESSION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoSessionParametersCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoSessionParametersCreateInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkVideoSessionParametersCreateInfoKHR.FLAGS, value); }
    /** Unsafe version of {@link #videoSessionParametersTemplate(long) videoSessionParametersTemplate}. */
    public static void nvideoSessionParametersTemplate(long struct, long value) { memPutLong(struct + VkVideoSessionParametersCreateInfoKHR.VIDEOSESSIONPARAMETERSTEMPLATE, value); }
    /** Unsafe version of {@link #videoSession(long) videoSession}. */
    public static void nvideoSession(long struct, long value) { memPutLong(struct + VkVideoSessionParametersCreateInfoKHR.VIDEOSESSION, value); }

    // -----------------------------------

    /** An array of {@link VkVideoSessionParametersCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoSessionParametersCreateInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoSessionParametersCreateInfoKHR ELEMENT_FACTORY = VkVideoSessionParametersCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoSessionParametersCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoSessionParametersCreateInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoSessionParametersCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoSessionParametersCreateInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoSessionParametersCreateInfoKHR.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkVideoSessionParametersCreateFlagsKHR")
        public int flags() { return VkVideoSessionParametersCreateInfoKHR.nflags(address()); }
        /** @return the value of the {@code videoSessionParametersTemplate} field. */
        @NativeType("VkVideoSessionParametersKHR")
        public long videoSessionParametersTemplate() { return VkVideoSessionParametersCreateInfoKHR.nvideoSessionParametersTemplate(address()); }
        /** @return the value of the {@code videoSession} field. */
        @NativeType("VkVideoSessionKHR")
        public long videoSession() { return VkVideoSessionParametersCreateInfoKHR.nvideoSession(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkVideoSessionParametersCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoSessionParametersCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_CREATE_INFO_KHR STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_CREATE_INFO_KHR} value to the {@code sType} field. */
        public VkVideoSessionParametersCreateInfoKHR.Buffer sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_CREATE_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoSessionParametersCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoSessionParametersCreateInfoKHR.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkVideoDecodeAV1SessionParametersCreateInfoKHR} value to the {@code pNext} chain. */
        public VkVideoSessionParametersCreateInfoKHR.Buffer pNext(VkVideoDecodeAV1SessionParametersCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoDecodeH264SessionParametersCreateInfoKHR} value to the {@code pNext} chain. */
        public VkVideoSessionParametersCreateInfoKHR.Buffer pNext(VkVideoDecodeH264SessionParametersCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoDecodeH265SessionParametersCreateInfoKHR} value to the {@code pNext} chain. */
        public VkVideoSessionParametersCreateInfoKHR.Buffer pNext(VkVideoDecodeH265SessionParametersCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeAV1SessionParametersCreateInfoKHR} value to the {@code pNext} chain. */
        public VkVideoSessionParametersCreateInfoKHR.Buffer pNext(VkVideoEncodeAV1SessionParametersCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeH264SessionParametersCreateInfoKHR} value to the {@code pNext} chain. */
        public VkVideoSessionParametersCreateInfoKHR.Buffer pNext(VkVideoEncodeH264SessionParametersCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeH265SessionParametersCreateInfoKHR} value to the {@code pNext} chain. */
        public VkVideoSessionParametersCreateInfoKHR.Buffer pNext(VkVideoEncodeH265SessionParametersCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeQualityLevelInfoKHR} value to the {@code pNext} chain. */
        public VkVideoSessionParametersCreateInfoKHR.Buffer pNext(VkVideoEncodeQualityLevelInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR} value to the {@code pNext} chain. */
        public VkVideoSessionParametersCreateInfoKHR.Buffer pNext(VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code flags} field. */
        public VkVideoSessionParametersCreateInfoKHR.Buffer flags(@NativeType("VkVideoSessionParametersCreateFlagsKHR") int value) { VkVideoSessionParametersCreateInfoKHR.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code videoSessionParametersTemplate} field. */
        public VkVideoSessionParametersCreateInfoKHR.Buffer videoSessionParametersTemplate(@NativeType("VkVideoSessionParametersKHR") long value) { VkVideoSessionParametersCreateInfoKHR.nvideoSessionParametersTemplate(address(), value); return this; }
        /** Sets the specified value to the {@code videoSession} field. */
        public VkVideoSessionParametersCreateInfoKHR.Buffer videoSession(@NativeType("VkVideoSessionKHR") long value) { VkVideoSessionParametersCreateInfoKHR.nvideoSession(address(), value); return this; }

    }

}