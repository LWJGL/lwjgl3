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
 * struct VkVideoEncodeH264SessionParametersGetInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkBool32 writeStdSPS;
 *     VkBool32 writeStdPPS;
 *     uint32_t stdSPSId;
 *     uint32_t stdPPSId;
 * }}</pre>
 */
public class VkVideoEncodeH264SessionParametersGetInfoKHR extends Struct<VkVideoEncodeH264SessionParametersGetInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        WRITESTDSPS,
        WRITESTDPPS,
        STDSPSID,
        STDPPSID;

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
        WRITESTDSPS = layout.offsetof(2);
        WRITESTDPPS = layout.offsetof(3);
        STDSPSID = layout.offsetof(4);
        STDPPSID = layout.offsetof(5);
    }

    protected VkVideoEncodeH264SessionParametersGetInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeH264SessionParametersGetInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH264SessionParametersGetInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeH264SessionParametersGetInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH264SessionParametersGetInfoKHR(ByteBuffer container) {
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
    /** @return the value of the {@code writeStdSPS} field. */
    @NativeType("VkBool32")
    public boolean writeStdSPS() { return nwriteStdSPS(address()) != 0; }
    /** @return the value of the {@code writeStdPPS} field. */
    @NativeType("VkBool32")
    public boolean writeStdPPS() { return nwriteStdPPS(address()) != 0; }
    /** @return the value of the {@code stdSPSId} field. */
    @NativeType("uint32_t")
    public int stdSPSId() { return nstdSPSId(address()); }
    /** @return the value of the {@code stdPPSId} field. */
    @NativeType("uint32_t")
    public int stdPPSId() { return nstdPPSId(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkVideoEncodeH264SessionParametersGetInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_GET_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_GET_INFO_KHR} value to the {@code sType} field. */
    public VkVideoEncodeH264SessionParametersGetInfoKHR sType$Default() { return sType(KHRVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_GET_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoEncodeH264SessionParametersGetInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code writeStdSPS} field. */
    public VkVideoEncodeH264SessionParametersGetInfoKHR writeStdSPS(@NativeType("VkBool32") boolean value) { nwriteStdSPS(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code writeStdPPS} field. */
    public VkVideoEncodeH264SessionParametersGetInfoKHR writeStdPPS(@NativeType("VkBool32") boolean value) { nwriteStdPPS(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code stdSPSId} field. */
    public VkVideoEncodeH264SessionParametersGetInfoKHR stdSPSId(@NativeType("uint32_t") int value) { nstdSPSId(address(), value); return this; }
    /** Sets the specified value to the {@code stdPPSId} field. */
    public VkVideoEncodeH264SessionParametersGetInfoKHR stdPPSId(@NativeType("uint32_t") int value) { nstdPPSId(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH264SessionParametersGetInfoKHR set(
        int sType,
        long pNext,
        boolean writeStdSPS,
        boolean writeStdPPS,
        int stdSPSId,
        int stdPPSId
    ) {
        sType(sType);
        pNext(pNext);
        writeStdSPS(writeStdSPS);
        writeStdPPS(writeStdPPS);
        stdSPSId(stdSPSId);
        stdPPSId(stdPPSId);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeH264SessionParametersGetInfoKHR set(VkVideoEncodeH264SessionParametersGetInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH264SessionParametersGetInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264SessionParametersGetInfoKHR malloc() {
        return new VkVideoEncodeH264SessionParametersGetInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH264SessionParametersGetInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264SessionParametersGetInfoKHR calloc() {
        return new VkVideoEncodeH264SessionParametersGetInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH264SessionParametersGetInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH264SessionParametersGetInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH264SessionParametersGetInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH264SessionParametersGetInfoKHR} instance for the specified memory address. */
    public static VkVideoEncodeH264SessionParametersGetInfoKHR create(long address) {
        return new VkVideoEncodeH264SessionParametersGetInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoEncodeH264SessionParametersGetInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeH264SessionParametersGetInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264SessionParametersGetInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionParametersGetInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264SessionParametersGetInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionParametersGetInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264SessionParametersGetInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionParametersGetInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeH264SessionParametersGetInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionParametersGetInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoEncodeH264SessionParametersGetInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264SessionParametersGetInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264SessionParametersGetInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeH264SessionParametersGetInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264SessionParametersGetInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264SessionParametersGetInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeH264SessionParametersGetInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264SessionParametersGetInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionParametersGetInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264SessionParametersGetInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionParametersGetInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoEncodeH264SessionParametersGetInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH264SessionParametersGetInfoKHR.PNEXT); }
    /** Unsafe version of {@link #writeStdSPS}. */
    public static int nwriteStdSPS(long struct) { return memGetInt(struct + VkVideoEncodeH264SessionParametersGetInfoKHR.WRITESTDSPS); }
    /** Unsafe version of {@link #writeStdPPS}. */
    public static int nwriteStdPPS(long struct) { return memGetInt(struct + VkVideoEncodeH264SessionParametersGetInfoKHR.WRITESTDPPS); }
    /** Unsafe version of {@link #stdSPSId}. */
    public static int nstdSPSId(long struct) { return memGetInt(struct + VkVideoEncodeH264SessionParametersGetInfoKHR.STDSPSID); }
    /** Unsafe version of {@link #stdPPSId}. */
    public static int nstdPPSId(long struct) { return memGetInt(struct + VkVideoEncodeH264SessionParametersGetInfoKHR.STDPPSID); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoEncodeH264SessionParametersGetInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH264SessionParametersGetInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #writeStdSPS(boolean) writeStdSPS}. */
    public static void nwriteStdSPS(long struct, int value) { memPutInt(struct + VkVideoEncodeH264SessionParametersGetInfoKHR.WRITESTDSPS, value); }
    /** Unsafe version of {@link #writeStdPPS(boolean) writeStdPPS}. */
    public static void nwriteStdPPS(long struct, int value) { memPutInt(struct + VkVideoEncodeH264SessionParametersGetInfoKHR.WRITESTDPPS, value); }
    /** Unsafe version of {@link #stdSPSId(int) stdSPSId}. */
    public static void nstdSPSId(long struct, int value) { memPutInt(struct + VkVideoEncodeH264SessionParametersGetInfoKHR.STDSPSID, value); }
    /** Unsafe version of {@link #stdPPSId(int) stdPPSId}. */
    public static void nstdPPSId(long struct, int value) { memPutInt(struct + VkVideoEncodeH264SessionParametersGetInfoKHR.STDPPSID, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH264SessionParametersGetInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264SessionParametersGetInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeH264SessionParametersGetInfoKHR ELEMENT_FACTORY = VkVideoEncodeH264SessionParametersGetInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH264SessionParametersGetInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH264SessionParametersGetInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeH264SessionParametersGetInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH264SessionParametersGetInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH264SessionParametersGetInfoKHR.npNext(address()); }
        /** @return the value of the {@code writeStdSPS} field. */
        @NativeType("VkBool32")
        public boolean writeStdSPS() { return VkVideoEncodeH264SessionParametersGetInfoKHR.nwriteStdSPS(address()) != 0; }
        /** @return the value of the {@code writeStdPPS} field. */
        @NativeType("VkBool32")
        public boolean writeStdPPS() { return VkVideoEncodeH264SessionParametersGetInfoKHR.nwriteStdPPS(address()) != 0; }
        /** @return the value of the {@code stdSPSId} field. */
        @NativeType("uint32_t")
        public int stdSPSId() { return VkVideoEncodeH264SessionParametersGetInfoKHR.nstdSPSId(address()); }
        /** @return the value of the {@code stdPPSId} field. */
        @NativeType("uint32_t")
        public int stdPPSId() { return VkVideoEncodeH264SessionParametersGetInfoKHR.nstdPPSId(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkVideoEncodeH264SessionParametersGetInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH264SessionParametersGetInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_GET_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_GET_INFO_KHR} value to the {@code sType} field. */
        public VkVideoEncodeH264SessionParametersGetInfoKHR.Buffer sType$Default() { return sType(KHRVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_GET_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoEncodeH264SessionParametersGetInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH264SessionParametersGetInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code writeStdSPS} field. */
        public VkVideoEncodeH264SessionParametersGetInfoKHR.Buffer writeStdSPS(@NativeType("VkBool32") boolean value) { VkVideoEncodeH264SessionParametersGetInfoKHR.nwriteStdSPS(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code writeStdPPS} field. */
        public VkVideoEncodeH264SessionParametersGetInfoKHR.Buffer writeStdPPS(@NativeType("VkBool32") boolean value) { VkVideoEncodeH264SessionParametersGetInfoKHR.nwriteStdPPS(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code stdSPSId} field. */
        public VkVideoEncodeH264SessionParametersGetInfoKHR.Buffer stdSPSId(@NativeType("uint32_t") int value) { VkVideoEncodeH264SessionParametersGetInfoKHR.nstdSPSId(address(), value); return this; }
        /** Sets the specified value to the {@code stdPPSId} field. */
        public VkVideoEncodeH264SessionParametersGetInfoKHR.Buffer stdPPSId(@NativeType("uint32_t") int value) { VkVideoEncodeH264SessionParametersGetInfoKHR.nstdPPSId(address(), value); return this; }

    }

}