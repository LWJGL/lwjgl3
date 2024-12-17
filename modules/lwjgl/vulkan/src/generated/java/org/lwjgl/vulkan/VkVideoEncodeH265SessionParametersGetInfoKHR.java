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
 * struct VkVideoEncodeH265SessionParametersGetInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkBool32 writeStdVPS;
 *     VkBool32 writeStdSPS;
 *     VkBool32 writeStdPPS;
 *     uint32_t stdVPSId;
 *     uint32_t stdSPSId;
 *     uint32_t stdPPSId;
 * }}</pre>
 */
public class VkVideoEncodeH265SessionParametersGetInfoKHR extends Struct<VkVideoEncodeH265SessionParametersGetInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        WRITESTDVPS,
        WRITESTDSPS,
        WRITESTDPPS,
        STDVPSID,
        STDSPSID,
        STDPPSID;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        WRITESTDVPS = layout.offsetof(2);
        WRITESTDSPS = layout.offsetof(3);
        WRITESTDPPS = layout.offsetof(4);
        STDVPSID = layout.offsetof(5);
        STDSPSID = layout.offsetof(6);
        STDPPSID = layout.offsetof(7);
    }

    protected VkVideoEncodeH265SessionParametersGetInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeH265SessionParametersGetInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH265SessionParametersGetInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeH265SessionParametersGetInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH265SessionParametersGetInfoKHR(ByteBuffer container) {
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
    /** @return the value of the {@code writeStdVPS} field. */
    @NativeType("VkBool32")
    public boolean writeStdVPS() { return nwriteStdVPS(address()) != 0; }
    /** @return the value of the {@code writeStdSPS} field. */
    @NativeType("VkBool32")
    public boolean writeStdSPS() { return nwriteStdSPS(address()) != 0; }
    /** @return the value of the {@code writeStdPPS} field. */
    @NativeType("VkBool32")
    public boolean writeStdPPS() { return nwriteStdPPS(address()) != 0; }
    /** @return the value of the {@code stdVPSId} field. */
    @NativeType("uint32_t")
    public int stdVPSId() { return nstdVPSId(address()); }
    /** @return the value of the {@code stdSPSId} field. */
    @NativeType("uint32_t")
    public int stdSPSId() { return nstdSPSId(address()); }
    /** @return the value of the {@code stdPPSId} field. */
    @NativeType("uint32_t")
    public int stdPPSId() { return nstdPPSId(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkVideoEncodeH265SessionParametersGetInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_GET_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_GET_INFO_KHR} value to the {@code sType} field. */
    public VkVideoEncodeH265SessionParametersGetInfoKHR sType$Default() { return sType(KHRVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_GET_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoEncodeH265SessionParametersGetInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code writeStdVPS} field. */
    public VkVideoEncodeH265SessionParametersGetInfoKHR writeStdVPS(@NativeType("VkBool32") boolean value) { nwriteStdVPS(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code writeStdSPS} field. */
    public VkVideoEncodeH265SessionParametersGetInfoKHR writeStdSPS(@NativeType("VkBool32") boolean value) { nwriteStdSPS(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code writeStdPPS} field. */
    public VkVideoEncodeH265SessionParametersGetInfoKHR writeStdPPS(@NativeType("VkBool32") boolean value) { nwriteStdPPS(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code stdVPSId} field. */
    public VkVideoEncodeH265SessionParametersGetInfoKHR stdVPSId(@NativeType("uint32_t") int value) { nstdVPSId(address(), value); return this; }
    /** Sets the specified value to the {@code stdSPSId} field. */
    public VkVideoEncodeH265SessionParametersGetInfoKHR stdSPSId(@NativeType("uint32_t") int value) { nstdSPSId(address(), value); return this; }
    /** Sets the specified value to the {@code stdPPSId} field. */
    public VkVideoEncodeH265SessionParametersGetInfoKHR stdPPSId(@NativeType("uint32_t") int value) { nstdPPSId(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH265SessionParametersGetInfoKHR set(
        int sType,
        long pNext,
        boolean writeStdVPS,
        boolean writeStdSPS,
        boolean writeStdPPS,
        int stdVPSId,
        int stdSPSId,
        int stdPPSId
    ) {
        sType(sType);
        pNext(pNext);
        writeStdVPS(writeStdVPS);
        writeStdSPS(writeStdSPS);
        writeStdPPS(writeStdPPS);
        stdVPSId(stdVPSId);
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
    public VkVideoEncodeH265SessionParametersGetInfoKHR set(VkVideoEncodeH265SessionParametersGetInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH265SessionParametersGetInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265SessionParametersGetInfoKHR malloc() {
        return new VkVideoEncodeH265SessionParametersGetInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265SessionParametersGetInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265SessionParametersGetInfoKHR calloc() {
        return new VkVideoEncodeH265SessionParametersGetInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265SessionParametersGetInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH265SessionParametersGetInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH265SessionParametersGetInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH265SessionParametersGetInfoKHR} instance for the specified memory address. */
    public static VkVideoEncodeH265SessionParametersGetInfoKHR create(long address) {
        return new VkVideoEncodeH265SessionParametersGetInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoEncodeH265SessionParametersGetInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeH265SessionParametersGetInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265SessionParametersGetInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionParametersGetInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265SessionParametersGetInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionParametersGetInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265SessionParametersGetInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionParametersGetInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeH265SessionParametersGetInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionParametersGetInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoEncodeH265SessionParametersGetInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265SessionParametersGetInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265SessionParametersGetInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeH265SessionParametersGetInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265SessionParametersGetInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265SessionParametersGetInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeH265SessionParametersGetInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265SessionParametersGetInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionParametersGetInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265SessionParametersGetInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionParametersGetInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoEncodeH265SessionParametersGetInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH265SessionParametersGetInfoKHR.PNEXT); }
    /** Unsafe version of {@link #writeStdVPS}. */
    public static int nwriteStdVPS(long struct) { return memGetInt(struct + VkVideoEncodeH265SessionParametersGetInfoKHR.WRITESTDVPS); }
    /** Unsafe version of {@link #writeStdSPS}. */
    public static int nwriteStdSPS(long struct) { return memGetInt(struct + VkVideoEncodeH265SessionParametersGetInfoKHR.WRITESTDSPS); }
    /** Unsafe version of {@link #writeStdPPS}. */
    public static int nwriteStdPPS(long struct) { return memGetInt(struct + VkVideoEncodeH265SessionParametersGetInfoKHR.WRITESTDPPS); }
    /** Unsafe version of {@link #stdVPSId}. */
    public static int nstdVPSId(long struct) { return memGetInt(struct + VkVideoEncodeH265SessionParametersGetInfoKHR.STDVPSID); }
    /** Unsafe version of {@link #stdSPSId}. */
    public static int nstdSPSId(long struct) { return memGetInt(struct + VkVideoEncodeH265SessionParametersGetInfoKHR.STDSPSID); }
    /** Unsafe version of {@link #stdPPSId}. */
    public static int nstdPPSId(long struct) { return memGetInt(struct + VkVideoEncodeH265SessionParametersGetInfoKHR.STDPPSID); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoEncodeH265SessionParametersGetInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH265SessionParametersGetInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #writeStdVPS(boolean) writeStdVPS}. */
    public static void nwriteStdVPS(long struct, int value) { memPutInt(struct + VkVideoEncodeH265SessionParametersGetInfoKHR.WRITESTDVPS, value); }
    /** Unsafe version of {@link #writeStdSPS(boolean) writeStdSPS}. */
    public static void nwriteStdSPS(long struct, int value) { memPutInt(struct + VkVideoEncodeH265SessionParametersGetInfoKHR.WRITESTDSPS, value); }
    /** Unsafe version of {@link #writeStdPPS(boolean) writeStdPPS}. */
    public static void nwriteStdPPS(long struct, int value) { memPutInt(struct + VkVideoEncodeH265SessionParametersGetInfoKHR.WRITESTDPPS, value); }
    /** Unsafe version of {@link #stdVPSId(int) stdVPSId}. */
    public static void nstdVPSId(long struct, int value) { memPutInt(struct + VkVideoEncodeH265SessionParametersGetInfoKHR.STDVPSID, value); }
    /** Unsafe version of {@link #stdSPSId(int) stdSPSId}. */
    public static void nstdSPSId(long struct, int value) { memPutInt(struct + VkVideoEncodeH265SessionParametersGetInfoKHR.STDSPSID, value); }
    /** Unsafe version of {@link #stdPPSId(int) stdPPSId}. */
    public static void nstdPPSId(long struct, int value) { memPutInt(struct + VkVideoEncodeH265SessionParametersGetInfoKHR.STDPPSID, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH265SessionParametersGetInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265SessionParametersGetInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeH265SessionParametersGetInfoKHR ELEMENT_FACTORY = VkVideoEncodeH265SessionParametersGetInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH265SessionParametersGetInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH265SessionParametersGetInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeH265SessionParametersGetInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH265SessionParametersGetInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH265SessionParametersGetInfoKHR.npNext(address()); }
        /** @return the value of the {@code writeStdVPS} field. */
        @NativeType("VkBool32")
        public boolean writeStdVPS() { return VkVideoEncodeH265SessionParametersGetInfoKHR.nwriteStdVPS(address()) != 0; }
        /** @return the value of the {@code writeStdSPS} field. */
        @NativeType("VkBool32")
        public boolean writeStdSPS() { return VkVideoEncodeH265SessionParametersGetInfoKHR.nwriteStdSPS(address()) != 0; }
        /** @return the value of the {@code writeStdPPS} field. */
        @NativeType("VkBool32")
        public boolean writeStdPPS() { return VkVideoEncodeH265SessionParametersGetInfoKHR.nwriteStdPPS(address()) != 0; }
        /** @return the value of the {@code stdVPSId} field. */
        @NativeType("uint32_t")
        public int stdVPSId() { return VkVideoEncodeH265SessionParametersGetInfoKHR.nstdVPSId(address()); }
        /** @return the value of the {@code stdSPSId} field. */
        @NativeType("uint32_t")
        public int stdSPSId() { return VkVideoEncodeH265SessionParametersGetInfoKHR.nstdSPSId(address()); }
        /** @return the value of the {@code stdPPSId} field. */
        @NativeType("uint32_t")
        public int stdPPSId() { return VkVideoEncodeH265SessionParametersGetInfoKHR.nstdPPSId(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkVideoEncodeH265SessionParametersGetInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH265SessionParametersGetInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_GET_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_GET_INFO_KHR} value to the {@code sType} field. */
        public VkVideoEncodeH265SessionParametersGetInfoKHR.Buffer sType$Default() { return sType(KHRVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_GET_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoEncodeH265SessionParametersGetInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH265SessionParametersGetInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code writeStdVPS} field. */
        public VkVideoEncodeH265SessionParametersGetInfoKHR.Buffer writeStdVPS(@NativeType("VkBool32") boolean value) { VkVideoEncodeH265SessionParametersGetInfoKHR.nwriteStdVPS(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code writeStdSPS} field. */
        public VkVideoEncodeH265SessionParametersGetInfoKHR.Buffer writeStdSPS(@NativeType("VkBool32") boolean value) { VkVideoEncodeH265SessionParametersGetInfoKHR.nwriteStdSPS(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code writeStdPPS} field. */
        public VkVideoEncodeH265SessionParametersGetInfoKHR.Buffer writeStdPPS(@NativeType("VkBool32") boolean value) { VkVideoEncodeH265SessionParametersGetInfoKHR.nwriteStdPPS(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code stdVPSId} field. */
        public VkVideoEncodeH265SessionParametersGetInfoKHR.Buffer stdVPSId(@NativeType("uint32_t") int value) { VkVideoEncodeH265SessionParametersGetInfoKHR.nstdVPSId(address(), value); return this; }
        /** Sets the specified value to the {@code stdSPSId} field. */
        public VkVideoEncodeH265SessionParametersGetInfoKHR.Buffer stdSPSId(@NativeType("uint32_t") int value) { VkVideoEncodeH265SessionParametersGetInfoKHR.nstdSPSId(address(), value); return this; }
        /** Sets the specified value to the {@code stdPPSId} field. */
        public VkVideoEncodeH265SessionParametersGetInfoKHR.Buffer stdPPSId(@NativeType("uint32_t") int value) { VkVideoEncodeH265SessionParametersGetInfoKHR.nstdPPSId(address(), value); return this; }

    }

}