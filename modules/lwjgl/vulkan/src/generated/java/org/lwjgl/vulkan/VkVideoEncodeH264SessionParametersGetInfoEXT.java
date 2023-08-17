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
 * Structure specifying parameters for retrieving encoded H.264 parameter set data.
 * 
 * <h5>Description</h5>
 * 
 * <p>When this structure is specified in the {@code pNext} chain of the {@link VkVideoEncodeSessionParametersGetInfoKHR} structure passed to {@link KHRVideoEncodeQueue#vkGetEncodedVideoSessionParametersKHR GetEncodedVideoSessionParametersKHR}, the command will write encoded parameter data to the output buffer in the following order:</p>
 * 
 * <ul>
 * <li>The H.264 sequence parameter set identified by {@code stdSPSId}, if {@code writeStdSPS} is set to {@link VK10#VK_TRUE TRUE}.</li>
 * <li>The H.264 picture parameter set identified by the pair constructed from {@code stdSPSId} and {@code stdPPSId}, if {@code writeStdPPS} is set to {@link VK10#VK_TRUE TRUE}.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_GET_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_GET_INFO_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH264SessionParametersGetInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkBool32 {@link #writeStdSPS};
 *     VkBool32 {@link #writeStdPPS};
 *     uint32_t {@link #stdSPSId};
 *     uint32_t {@link #stdPPSId};
 * }</code></pre>
 */
public class VkVideoEncodeH264SessionParametersGetInfoEXT extends Struct<VkVideoEncodeH264SessionParametersGetInfoEXT> implements NativeResource {

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

    protected VkVideoEncodeH264SessionParametersGetInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeH264SessionParametersGetInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH264SessionParametersGetInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeH264SessionParametersGetInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH264SessionParametersGetInfoEXT(ByteBuffer container) {
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
    /** indicates whether the encoded H.264 sequence parameter set identified by {@code stdSPSId} is requested to be retrieved. */
    @NativeType("VkBool32")
    public boolean writeStdSPS() { return nwriteStdSPS(address()) != 0; }
    /** indicates whether the encoded H.264 picture parameter set identified by the pair constructed from {@code stdSPSId} and {@code stdPPSId} is requested to be retrieved. */
    @NativeType("VkBool32")
    public boolean writeStdPPS() { return nwriteStdPPS(address()) != 0; }
    /** specifies the H.264 sequence parameter set ID used to identify the retrieved H.264 sequence and/or picture parameter set(s). */
    @NativeType("uint32_t")
    public int stdSPSId() { return nstdSPSId(address()); }
    /** specifies the H.264 picture parameter set ID used to identify the retrieved H.264 picture parameter set when {@code writeStdPPS} is set to {@link VK10#VK_TRUE TRUE}. */
    @NativeType("uint32_t")
    public int stdPPSId() { return nstdPPSId(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeH264SessionParametersGetInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_GET_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_GET_INFO_EXT} value to the {@link #sType} field. */
    public VkVideoEncodeH264SessionParametersGetInfoEXT sType$Default() { return sType(EXTVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_GET_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeH264SessionParametersGetInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #writeStdSPS} field. */
    public VkVideoEncodeH264SessionParametersGetInfoEXT writeStdSPS(@NativeType("VkBool32") boolean value) { nwriteStdSPS(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #writeStdPPS} field. */
    public VkVideoEncodeH264SessionParametersGetInfoEXT writeStdPPS(@NativeType("VkBool32") boolean value) { nwriteStdPPS(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #stdSPSId} field. */
    public VkVideoEncodeH264SessionParametersGetInfoEXT stdSPSId(@NativeType("uint32_t") int value) { nstdSPSId(address(), value); return this; }
    /** Sets the specified value to the {@link #stdPPSId} field. */
    public VkVideoEncodeH264SessionParametersGetInfoEXT stdPPSId(@NativeType("uint32_t") int value) { nstdPPSId(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH264SessionParametersGetInfoEXT set(
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
    public VkVideoEncodeH264SessionParametersGetInfoEXT set(VkVideoEncodeH264SessionParametersGetInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH264SessionParametersGetInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264SessionParametersGetInfoEXT malloc() {
        return new VkVideoEncodeH264SessionParametersGetInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH264SessionParametersGetInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264SessionParametersGetInfoEXT calloc() {
        return new VkVideoEncodeH264SessionParametersGetInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH264SessionParametersGetInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH264SessionParametersGetInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH264SessionParametersGetInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH264SessionParametersGetInfoEXT} instance for the specified memory address. */
    public static VkVideoEncodeH264SessionParametersGetInfoEXT create(long address) {
        return new VkVideoEncodeH264SessionParametersGetInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH264SessionParametersGetInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeH264SessionParametersGetInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264SessionParametersGetInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionParametersGetInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264SessionParametersGetInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionParametersGetInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264SessionParametersGetInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionParametersGetInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeH264SessionParametersGetInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionParametersGetInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH264SessionParametersGetInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264SessionParametersGetInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264SessionParametersGetInfoEXT malloc(MemoryStack stack) {
        return new VkVideoEncodeH264SessionParametersGetInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264SessionParametersGetInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264SessionParametersGetInfoEXT calloc(MemoryStack stack) {
        return new VkVideoEncodeH264SessionParametersGetInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264SessionParametersGetInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionParametersGetInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264SessionParametersGetInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionParametersGetInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264SessionParametersGetInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH264SessionParametersGetInfoEXT.PNEXT); }
    /** Unsafe version of {@link #writeStdSPS}. */
    public static int nwriteStdSPS(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264SessionParametersGetInfoEXT.WRITESTDSPS); }
    /** Unsafe version of {@link #writeStdPPS}. */
    public static int nwriteStdPPS(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264SessionParametersGetInfoEXT.WRITESTDPPS); }
    /** Unsafe version of {@link #stdSPSId}. */
    public static int nstdSPSId(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264SessionParametersGetInfoEXT.STDSPSID); }
    /** Unsafe version of {@link #stdPPSId}. */
    public static int nstdPPSId(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264SessionParametersGetInfoEXT.STDPPSID); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264SessionParametersGetInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH264SessionParametersGetInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #writeStdSPS(boolean) writeStdSPS}. */
    public static void nwriteStdSPS(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264SessionParametersGetInfoEXT.WRITESTDSPS, value); }
    /** Unsafe version of {@link #writeStdPPS(boolean) writeStdPPS}. */
    public static void nwriteStdPPS(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264SessionParametersGetInfoEXT.WRITESTDPPS, value); }
    /** Unsafe version of {@link #stdSPSId(int) stdSPSId}. */
    public static void nstdSPSId(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264SessionParametersGetInfoEXT.STDSPSID, value); }
    /** Unsafe version of {@link #stdPPSId(int) stdPPSId}. */
    public static void nstdPPSId(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264SessionParametersGetInfoEXT.STDPPSID, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH264SessionParametersGetInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264SessionParametersGetInfoEXT, Buffer> implements NativeResource {

        private static final VkVideoEncodeH264SessionParametersGetInfoEXT ELEMENT_FACTORY = VkVideoEncodeH264SessionParametersGetInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH264SessionParametersGetInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH264SessionParametersGetInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeH264SessionParametersGetInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeH264SessionParametersGetInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH264SessionParametersGetInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeH264SessionParametersGetInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH264SessionParametersGetInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeH264SessionParametersGetInfoEXT#writeStdSPS} field. */
        @NativeType("VkBool32")
        public boolean writeStdSPS() { return VkVideoEncodeH264SessionParametersGetInfoEXT.nwriteStdSPS(address()) != 0; }
        /** @return the value of the {@link VkVideoEncodeH264SessionParametersGetInfoEXT#writeStdPPS} field. */
        @NativeType("VkBool32")
        public boolean writeStdPPS() { return VkVideoEncodeH264SessionParametersGetInfoEXT.nwriteStdPPS(address()) != 0; }
        /** @return the value of the {@link VkVideoEncodeH264SessionParametersGetInfoEXT#stdSPSId} field. */
        @NativeType("uint32_t")
        public int stdSPSId() { return VkVideoEncodeH264SessionParametersGetInfoEXT.nstdSPSId(address()); }
        /** @return the value of the {@link VkVideoEncodeH264SessionParametersGetInfoEXT#stdPPSId} field. */
        @NativeType("uint32_t")
        public int stdPPSId() { return VkVideoEncodeH264SessionParametersGetInfoEXT.nstdPPSId(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeH264SessionParametersGetInfoEXT#sType} field. */
        public VkVideoEncodeH264SessionParametersGetInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH264SessionParametersGetInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_GET_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_GET_INFO_EXT} value to the {@link VkVideoEncodeH264SessionParametersGetInfoEXT#sType} field. */
        public VkVideoEncodeH264SessionParametersGetInfoEXT.Buffer sType$Default() { return sType(EXTVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_GET_INFO_EXT); }
        /** Sets the specified value to the {@link VkVideoEncodeH264SessionParametersGetInfoEXT#pNext} field. */
        public VkVideoEncodeH264SessionParametersGetInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH264SessionParametersGetInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH264SessionParametersGetInfoEXT#writeStdSPS} field. */
        public VkVideoEncodeH264SessionParametersGetInfoEXT.Buffer writeStdSPS(@NativeType("VkBool32") boolean value) { VkVideoEncodeH264SessionParametersGetInfoEXT.nwriteStdSPS(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH264SessionParametersGetInfoEXT#writeStdPPS} field. */
        public VkVideoEncodeH264SessionParametersGetInfoEXT.Buffer writeStdPPS(@NativeType("VkBool32") boolean value) { VkVideoEncodeH264SessionParametersGetInfoEXT.nwriteStdPPS(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH264SessionParametersGetInfoEXT#stdSPSId} field. */
        public VkVideoEncodeH264SessionParametersGetInfoEXT.Buffer stdSPSId(@NativeType("uint32_t") int value) { VkVideoEncodeH264SessionParametersGetInfoEXT.nstdSPSId(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH264SessionParametersGetInfoEXT#stdPPSId} field. */
        public VkVideoEncodeH264SessionParametersGetInfoEXT.Buffer stdPPSId(@NativeType("uint32_t") int value) { VkVideoEncodeH264SessionParametersGetInfoEXT.nstdPPSId(address(), value); return this; }

    }

}