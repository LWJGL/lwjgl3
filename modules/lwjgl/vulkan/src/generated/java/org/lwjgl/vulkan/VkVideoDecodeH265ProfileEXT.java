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

import org.lwjgl.vulkan.video.*;

/**
 * Structure specifying H.265 decode profile.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVideoDecodeH265#VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_PROFILE_EXT STRUCTURE_TYPE_VIDEO_DECODE_H265_PROFILE_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoDecodeH265ProfileEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     StdVideoH265ProfileIdc {@link #stdProfileIdc};
 * }</code></pre>
 */
public class VkVideoDecodeH265ProfileEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        STDPROFILEIDC;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STDPROFILEIDC = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkVideoDecodeH265ProfileEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoDecodeH265ProfileEXT(ByteBuffer container) {
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
    /** a {@code StdVideoH265ProfileIdc} value specifying the H.265 codec profile IDC. */
    @NativeType("StdVideoH265ProfileIdc")
    public int stdProfileIdc() { return nstdProfileIdc(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoDecodeH265ProfileEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVideoDecodeH265#VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_PROFILE_EXT STRUCTURE_TYPE_VIDEO_DECODE_H265_PROFILE_EXT} value to the {@link #sType} field. */
    public VkVideoDecodeH265ProfileEXT sType$Default() { return sType(EXTVideoDecodeH265.VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_PROFILE_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoDecodeH265ProfileEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #stdProfileIdc} field. */
    public VkVideoDecodeH265ProfileEXT stdProfileIdc(@NativeType("StdVideoH265ProfileIdc") int value) { nstdProfileIdc(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoDecodeH265ProfileEXT set(
        int sType,
        long pNext,
        int stdProfileIdc
    ) {
        sType(sType);
        pNext(pNext);
        stdProfileIdc(stdProfileIdc);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoDecodeH265ProfileEXT set(VkVideoDecodeH265ProfileEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoDecodeH265ProfileEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeH265ProfileEXT malloc() {
        return wrap(VkVideoDecodeH265ProfileEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoDecodeH265ProfileEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeH265ProfileEXT calloc() {
        return wrap(VkVideoDecodeH265ProfileEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoDecodeH265ProfileEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoDecodeH265ProfileEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoDecodeH265ProfileEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoDecodeH265ProfileEXT} instance for the specified memory address. */
    public static VkVideoDecodeH265ProfileEXT create(long address) {
        return wrap(VkVideoDecodeH265ProfileEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoDecodeH265ProfileEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoDecodeH265ProfileEXT.class, address);
    }

    /**
     * Returns a new {@link VkVideoDecodeH265ProfileEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH265ProfileEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH265ProfileEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH265ProfileEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH265ProfileEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH265ProfileEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoDecodeH265ProfileEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH265ProfileEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoDecodeH265ProfileEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkVideoDecodeH265ProfileEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeH265ProfileEXT malloc(MemoryStack stack) {
        return wrap(VkVideoDecodeH265ProfileEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoDecodeH265ProfileEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeH265ProfileEXT calloc(MemoryStack stack) {
        return wrap(VkVideoDecodeH265ProfileEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoDecodeH265ProfileEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH265ProfileEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH265ProfileEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH265ProfileEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeH265ProfileEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoDecodeH265ProfileEXT.PNEXT); }
    /** Unsafe version of {@link #stdProfileIdc}. */
    public static int nstdProfileIdc(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeH265ProfileEXT.STDPROFILEIDC); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoDecodeH265ProfileEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoDecodeH265ProfileEXT.PNEXT, value); }
    /** Unsafe version of {@link #stdProfileIdc(int) stdProfileIdc}. */
    public static void nstdProfileIdc(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoDecodeH265ProfileEXT.STDPROFILEIDC, value); }

    // -----------------------------------

    /** An array of {@link VkVideoDecodeH265ProfileEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoDecodeH265ProfileEXT, Buffer> implements NativeResource {

        private static final VkVideoDecodeH265ProfileEXT ELEMENT_FACTORY = VkVideoDecodeH265ProfileEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoDecodeH265ProfileEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoDecodeH265ProfileEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkVideoDecodeH265ProfileEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoDecodeH265ProfileEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoDecodeH265ProfileEXT.nsType(address()); }
        /** @return the value of the {@link VkVideoDecodeH265ProfileEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoDecodeH265ProfileEXT.npNext(address()); }
        /** @return the value of the {@link VkVideoDecodeH265ProfileEXT#stdProfileIdc} field. */
        @NativeType("StdVideoH265ProfileIdc")
        public int stdProfileIdc() { return VkVideoDecodeH265ProfileEXT.nstdProfileIdc(address()); }

        /** Sets the specified value to the {@link VkVideoDecodeH265ProfileEXT#sType} field. */
        public VkVideoDecodeH265ProfileEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoDecodeH265ProfileEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVideoDecodeH265#VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_PROFILE_EXT STRUCTURE_TYPE_VIDEO_DECODE_H265_PROFILE_EXT} value to the {@link VkVideoDecodeH265ProfileEXT#sType} field. */
        public VkVideoDecodeH265ProfileEXT.Buffer sType$Default() { return sType(EXTVideoDecodeH265.VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_PROFILE_EXT); }
        /** Sets the specified value to the {@link VkVideoDecodeH265ProfileEXT#pNext} field. */
        public VkVideoDecodeH265ProfileEXT.Buffer pNext(@NativeType("void const *") long value) { VkVideoDecodeH265ProfileEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoDecodeH265ProfileEXT#stdProfileIdc} field. */
        public VkVideoDecodeH265ProfileEXT.Buffer stdProfileIdc(@NativeType("StdVideoH265ProfileIdc") int value) { VkVideoDecodeH265ProfileEXT.nstdProfileIdc(address(), value); return this; }

    }

}