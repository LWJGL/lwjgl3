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
 * Structure specifying parameters for retrieving encoded H.265 parameter set data.
 * 
 * <h5>Description</h5>
 * 
 * <p>When this structure is specified in the {@code pNext} chain of the {@link VkVideoEncodeSessionParametersGetInfoKHR} structure passed to {@link KHRVideoEncodeQueue#vkGetEncodedVideoSessionParametersKHR GetEncodedVideoSessionParametersKHR}, the command will write encoded parameter data to the output buffer in the following order:</p>
 * 
 * <ul>
 * <li>The H.265 video parameter set identified by {@code stdVPSId}, if {@code writeStdVPS} is set to {@link VK10#VK_TRUE TRUE}.</li>
 * <li>The H.265 sequence parameter set identified by the pair constructed from {@code stdVPSId} and {@code stdSPSId}, if {@code writeStdSPS} is set to {@link VK10#VK_TRUE TRUE}.</li>
 * <li>The H.265 picture parameter set identified by the triplet constructed from {@code stdVPSId}, {@code stdSPSId}, and {@code stdPPSId}, if {@code writeStdPPS} is set to {@link VK10#VK_TRUE TRUE}.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_GET_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_GET_INFO_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH265SessionParametersGetInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkBool32 {@link #writeStdVPS};
 *     VkBool32 {@link #writeStdSPS};
 *     VkBool32 {@link #writeStdPPS};
 *     uint32_t {@link #stdVPSId};
 *     uint32_t {@link #stdSPSId};
 *     uint32_t {@link #stdPPSId};
 * }</code></pre>
 */
public class VkVideoEncodeH265SessionParametersGetInfoEXT extends Struct<VkVideoEncodeH265SessionParametersGetInfoEXT> implements NativeResource {

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

    protected VkVideoEncodeH265SessionParametersGetInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeH265SessionParametersGetInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH265SessionParametersGetInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeH265SessionParametersGetInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH265SessionParametersGetInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** indicates whether the encoded H.265 video parameter set identified by {@code stdVPSId} is requested to be retrieved. */
    @NativeType("VkBool32")
    public boolean writeStdVPS() { return nwriteStdVPS(address()) != 0; }
    /** indicates whether the encoded H.265 sequence parameter set identified by the pair constructed from {@code stdVPSId} and {@code stdSPSId} is requested to be retrieved. */
    @NativeType("VkBool32")
    public boolean writeStdSPS() { return nwriteStdSPS(address()) != 0; }
    /** indicates whether the encoded H.265 picture parameter set identified by the triplet constructed from {@code stdVPSId}, {@code stdSPSId}, and {@code stdPPSId} is requested to be retrieved. */
    @NativeType("VkBool32")
    public boolean writeStdPPS() { return nwriteStdPPS(address()) != 0; }
    /** specifies the H.265 video parameter set ID used to identify the retrieved H.265 video, sequence, and/or picture parameter set(s). */
    @NativeType("uint32_t")
    public int stdVPSId() { return nstdVPSId(address()); }
    /** specifies the H.265 sequence parameter set ID used to identify the retrieved H.265 sequence and/or picture parameter set(s) when {@code writeStdSPS} and/or {@code writeStdPPS} is set to {@link VK10#VK_TRUE TRUE}. */
    @NativeType("uint32_t")
    public int stdSPSId() { return nstdSPSId(address()); }
    /** specifies the H.265 picture parameter set ID used to identify the retrieved H.265 picture parameter set when {@code writeStdPPS} is set to {@link VK10#VK_TRUE TRUE}. */
    @NativeType("uint32_t")
    public int stdPPSId() { return nstdPPSId(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeH265SessionParametersGetInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_GET_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_GET_INFO_EXT} value to the {@link #sType} field. */
    public VkVideoEncodeH265SessionParametersGetInfoEXT sType$Default() { return sType(EXTVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_GET_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeH265SessionParametersGetInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #writeStdVPS} field. */
    public VkVideoEncodeH265SessionParametersGetInfoEXT writeStdVPS(@NativeType("VkBool32") boolean value) { nwriteStdVPS(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #writeStdSPS} field. */
    public VkVideoEncodeH265SessionParametersGetInfoEXT writeStdSPS(@NativeType("VkBool32") boolean value) { nwriteStdSPS(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #writeStdPPS} field. */
    public VkVideoEncodeH265SessionParametersGetInfoEXT writeStdPPS(@NativeType("VkBool32") boolean value) { nwriteStdPPS(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #stdVPSId} field. */
    public VkVideoEncodeH265SessionParametersGetInfoEXT stdVPSId(@NativeType("uint32_t") int value) { nstdVPSId(address(), value); return this; }
    /** Sets the specified value to the {@link #stdSPSId} field. */
    public VkVideoEncodeH265SessionParametersGetInfoEXT stdSPSId(@NativeType("uint32_t") int value) { nstdSPSId(address(), value); return this; }
    /** Sets the specified value to the {@link #stdPPSId} field. */
    public VkVideoEncodeH265SessionParametersGetInfoEXT stdPPSId(@NativeType("uint32_t") int value) { nstdPPSId(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH265SessionParametersGetInfoEXT set(
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
    public VkVideoEncodeH265SessionParametersGetInfoEXT set(VkVideoEncodeH265SessionParametersGetInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH265SessionParametersGetInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265SessionParametersGetInfoEXT malloc() {
        return new VkVideoEncodeH265SessionParametersGetInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265SessionParametersGetInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265SessionParametersGetInfoEXT calloc() {
        return new VkVideoEncodeH265SessionParametersGetInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265SessionParametersGetInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH265SessionParametersGetInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH265SessionParametersGetInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH265SessionParametersGetInfoEXT} instance for the specified memory address. */
    public static VkVideoEncodeH265SessionParametersGetInfoEXT create(long address) {
        return new VkVideoEncodeH265SessionParametersGetInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH265SessionParametersGetInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeH265SessionParametersGetInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265SessionParametersGetInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionParametersGetInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265SessionParametersGetInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionParametersGetInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265SessionParametersGetInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionParametersGetInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeH265SessionParametersGetInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionParametersGetInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH265SessionParametersGetInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265SessionParametersGetInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265SessionParametersGetInfoEXT malloc(MemoryStack stack) {
        return new VkVideoEncodeH265SessionParametersGetInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265SessionParametersGetInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265SessionParametersGetInfoEXT calloc(MemoryStack stack) {
        return new VkVideoEncodeH265SessionParametersGetInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265SessionParametersGetInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionParametersGetInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265SessionParametersGetInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionParametersGetInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265SessionParametersGetInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH265SessionParametersGetInfoEXT.PNEXT); }
    /** Unsafe version of {@link #writeStdVPS}. */
    public static int nwriteStdVPS(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265SessionParametersGetInfoEXT.WRITESTDVPS); }
    /** Unsafe version of {@link #writeStdSPS}. */
    public static int nwriteStdSPS(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265SessionParametersGetInfoEXT.WRITESTDSPS); }
    /** Unsafe version of {@link #writeStdPPS}. */
    public static int nwriteStdPPS(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265SessionParametersGetInfoEXT.WRITESTDPPS); }
    /** Unsafe version of {@link #stdVPSId}. */
    public static int nstdVPSId(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265SessionParametersGetInfoEXT.STDVPSID); }
    /** Unsafe version of {@link #stdSPSId}. */
    public static int nstdSPSId(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265SessionParametersGetInfoEXT.STDSPSID); }
    /** Unsafe version of {@link #stdPPSId}. */
    public static int nstdPPSId(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265SessionParametersGetInfoEXT.STDPPSID); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265SessionParametersGetInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH265SessionParametersGetInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #writeStdVPS(boolean) writeStdVPS}. */
    public static void nwriteStdVPS(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265SessionParametersGetInfoEXT.WRITESTDVPS, value); }
    /** Unsafe version of {@link #writeStdSPS(boolean) writeStdSPS}. */
    public static void nwriteStdSPS(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265SessionParametersGetInfoEXT.WRITESTDSPS, value); }
    /** Unsafe version of {@link #writeStdPPS(boolean) writeStdPPS}. */
    public static void nwriteStdPPS(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265SessionParametersGetInfoEXT.WRITESTDPPS, value); }
    /** Unsafe version of {@link #stdVPSId(int) stdVPSId}. */
    public static void nstdVPSId(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265SessionParametersGetInfoEXT.STDVPSID, value); }
    /** Unsafe version of {@link #stdSPSId(int) stdSPSId}. */
    public static void nstdSPSId(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265SessionParametersGetInfoEXT.STDSPSID, value); }
    /** Unsafe version of {@link #stdPPSId(int) stdPPSId}. */
    public static void nstdPPSId(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265SessionParametersGetInfoEXT.STDPPSID, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH265SessionParametersGetInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265SessionParametersGetInfoEXT, Buffer> implements NativeResource {

        private static final VkVideoEncodeH265SessionParametersGetInfoEXT ELEMENT_FACTORY = VkVideoEncodeH265SessionParametersGetInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH265SessionParametersGetInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH265SessionParametersGetInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeH265SessionParametersGetInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeH265SessionParametersGetInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH265SessionParametersGetInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeH265SessionParametersGetInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH265SessionParametersGetInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeH265SessionParametersGetInfoEXT#writeStdVPS} field. */
        @NativeType("VkBool32")
        public boolean writeStdVPS() { return VkVideoEncodeH265SessionParametersGetInfoEXT.nwriteStdVPS(address()) != 0; }
        /** @return the value of the {@link VkVideoEncodeH265SessionParametersGetInfoEXT#writeStdSPS} field. */
        @NativeType("VkBool32")
        public boolean writeStdSPS() { return VkVideoEncodeH265SessionParametersGetInfoEXT.nwriteStdSPS(address()) != 0; }
        /** @return the value of the {@link VkVideoEncodeH265SessionParametersGetInfoEXT#writeStdPPS} field. */
        @NativeType("VkBool32")
        public boolean writeStdPPS() { return VkVideoEncodeH265SessionParametersGetInfoEXT.nwriteStdPPS(address()) != 0; }
        /** @return the value of the {@link VkVideoEncodeH265SessionParametersGetInfoEXT#stdVPSId} field. */
        @NativeType("uint32_t")
        public int stdVPSId() { return VkVideoEncodeH265SessionParametersGetInfoEXT.nstdVPSId(address()); }
        /** @return the value of the {@link VkVideoEncodeH265SessionParametersGetInfoEXT#stdSPSId} field. */
        @NativeType("uint32_t")
        public int stdSPSId() { return VkVideoEncodeH265SessionParametersGetInfoEXT.nstdSPSId(address()); }
        /** @return the value of the {@link VkVideoEncodeH265SessionParametersGetInfoEXT#stdPPSId} field. */
        @NativeType("uint32_t")
        public int stdPPSId() { return VkVideoEncodeH265SessionParametersGetInfoEXT.nstdPPSId(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeH265SessionParametersGetInfoEXT#sType} field. */
        public VkVideoEncodeH265SessionParametersGetInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH265SessionParametersGetInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_GET_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_GET_INFO_EXT} value to the {@link VkVideoEncodeH265SessionParametersGetInfoEXT#sType} field. */
        public VkVideoEncodeH265SessionParametersGetInfoEXT.Buffer sType$Default() { return sType(EXTVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_GET_INFO_EXT); }
        /** Sets the specified value to the {@link VkVideoEncodeH265SessionParametersGetInfoEXT#pNext} field. */
        public VkVideoEncodeH265SessionParametersGetInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH265SessionParametersGetInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265SessionParametersGetInfoEXT#writeStdVPS} field. */
        public VkVideoEncodeH265SessionParametersGetInfoEXT.Buffer writeStdVPS(@NativeType("VkBool32") boolean value) { VkVideoEncodeH265SessionParametersGetInfoEXT.nwriteStdVPS(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265SessionParametersGetInfoEXT#writeStdSPS} field. */
        public VkVideoEncodeH265SessionParametersGetInfoEXT.Buffer writeStdSPS(@NativeType("VkBool32") boolean value) { VkVideoEncodeH265SessionParametersGetInfoEXT.nwriteStdSPS(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265SessionParametersGetInfoEXT#writeStdPPS} field. */
        public VkVideoEncodeH265SessionParametersGetInfoEXT.Buffer writeStdPPS(@NativeType("VkBool32") boolean value) { VkVideoEncodeH265SessionParametersGetInfoEXT.nwriteStdPPS(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265SessionParametersGetInfoEXT#stdVPSId} field. */
        public VkVideoEncodeH265SessionParametersGetInfoEXT.Buffer stdVPSId(@NativeType("uint32_t") int value) { VkVideoEncodeH265SessionParametersGetInfoEXT.nstdVPSId(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265SessionParametersGetInfoEXT#stdSPSId} field. */
        public VkVideoEncodeH265SessionParametersGetInfoEXT.Buffer stdSPSId(@NativeType("uint32_t") int value) { VkVideoEncodeH265SessionParametersGetInfoEXT.nstdSPSId(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265SessionParametersGetInfoEXT#stdPPSId} field. */
        public VkVideoEncodeH265SessionParametersGetInfoEXT.Buffer stdPPSId(@NativeType("uint32_t") int value) { VkVideoEncodeH265SessionParametersGetInfoEXT.nstdPPSId(address(), value); return this; }

    }

}