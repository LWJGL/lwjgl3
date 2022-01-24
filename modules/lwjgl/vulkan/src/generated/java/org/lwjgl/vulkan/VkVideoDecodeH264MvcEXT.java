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

import org.lwjgl.vulkan.video.*;

/**
 * Structure specifies parameters of mvc views.
 * 
 * <h5>Description</h5>
 * 
 * <p>When the content type is H.264 MVC, a {@link VkVideoDecodeH264MvcEXT} structure <b>must</b> be chained to {@link VkVideoDecodeH264PictureInfoEXT}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVideoDecodeH264#VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_MVC_EXT STRUCTURE_TYPE_VIDEO_DECODE_H264_MVC_EXT}</li>
 * <li>{@code pStdMvc} <b>must</b> be a valid pointer to a valid {@code StdVideoDecodeH264Mvc} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoDecodeH264MvcEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     {@link StdVideoDecodeH264Mvc StdVideoDecodeH264Mvc} const * {@link #pStdMvc};
 * }</code></pre>
 */
public class VkVideoDecodeH264MvcEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PSTDMVC;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PSTDMVC = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkVideoDecodeH264MvcEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoDecodeH264MvcEXT(ByteBuffer container) {
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
    /** a pointer to a {@code StdVideoDecodeH264Mvc} structure specifying H.264 codec specification information for MVC. */
    @NativeType("StdVideoDecodeH264Mvc const *")
    public StdVideoDecodeH264Mvc pStdMvc() { return npStdMvc(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoDecodeH264MvcEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVideoDecodeH264#VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_MVC_EXT STRUCTURE_TYPE_VIDEO_DECODE_H264_MVC_EXT} value to the {@link #sType} field. */
    public VkVideoDecodeH264MvcEXT sType$Default() { return sType(EXTVideoDecodeH264.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_MVC_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoDecodeH264MvcEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoDecodeH264Mvc} to the {@link #pStdMvc} field. */
    public VkVideoDecodeH264MvcEXT pStdMvc(@NativeType("StdVideoDecodeH264Mvc const *") StdVideoDecodeH264Mvc value) { npStdMvc(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoDecodeH264MvcEXT set(
        int sType,
        long pNext,
        StdVideoDecodeH264Mvc pStdMvc
    ) {
        sType(sType);
        pNext(pNext);
        pStdMvc(pStdMvc);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoDecodeH264MvcEXT set(VkVideoDecodeH264MvcEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoDecodeH264MvcEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeH264MvcEXT malloc() {
        return wrap(VkVideoDecodeH264MvcEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoDecodeH264MvcEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeH264MvcEXT calloc() {
        return wrap(VkVideoDecodeH264MvcEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoDecodeH264MvcEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoDecodeH264MvcEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoDecodeH264MvcEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoDecodeH264MvcEXT} instance for the specified memory address. */
    public static VkVideoDecodeH264MvcEXT create(long address) {
        return wrap(VkVideoDecodeH264MvcEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoDecodeH264MvcEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoDecodeH264MvcEXT.class, address);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264MvcEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264MvcEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264MvcEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264MvcEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264MvcEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264MvcEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoDecodeH264MvcEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264MvcEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoDecodeH264MvcEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkVideoDecodeH264MvcEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeH264MvcEXT malloc(MemoryStack stack) {
        return wrap(VkVideoDecodeH264MvcEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoDecodeH264MvcEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeH264MvcEXT calloc(MemoryStack stack) {
        return wrap(VkVideoDecodeH264MvcEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoDecodeH264MvcEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264MvcEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264MvcEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264MvcEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeH264MvcEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoDecodeH264MvcEXT.PNEXT); }
    /** Unsafe version of {@link #pStdMvc}. */
    public static StdVideoDecodeH264Mvc npStdMvc(long struct) { return StdVideoDecodeH264Mvc.create(memGetAddress(struct + VkVideoDecodeH264MvcEXT.PSTDMVC)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoDecodeH264MvcEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoDecodeH264MvcEXT.PNEXT, value); }
    /** Unsafe version of {@link #pStdMvc(StdVideoDecodeH264Mvc) pStdMvc}. */
    public static void npStdMvc(long struct, StdVideoDecodeH264Mvc value) { memPutAddress(struct + VkVideoDecodeH264MvcEXT.PSTDMVC, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long pStdMvc = memGetAddress(struct + VkVideoDecodeH264MvcEXT.PSTDMVC);
        check(pStdMvc);
        StdVideoDecodeH264Mvc.validate(pStdMvc);
    }

    // -----------------------------------

    /** An array of {@link VkVideoDecodeH264MvcEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoDecodeH264MvcEXT, Buffer> implements NativeResource {

        private static final VkVideoDecodeH264MvcEXT ELEMENT_FACTORY = VkVideoDecodeH264MvcEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoDecodeH264MvcEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoDecodeH264MvcEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkVideoDecodeH264MvcEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoDecodeH264MvcEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoDecodeH264MvcEXT.nsType(address()); }
        /** @return the value of the {@link VkVideoDecodeH264MvcEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoDecodeH264MvcEXT.npNext(address()); }
        /** @return a {@link StdVideoDecodeH264Mvc} view of the struct pointed to by the {@link VkVideoDecodeH264MvcEXT#pStdMvc} field. */
        @NativeType("StdVideoDecodeH264Mvc const *")
        public StdVideoDecodeH264Mvc pStdMvc() { return VkVideoDecodeH264MvcEXT.npStdMvc(address()); }

        /** Sets the specified value to the {@link VkVideoDecodeH264MvcEXT#sType} field. */
        public VkVideoDecodeH264MvcEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoDecodeH264MvcEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVideoDecodeH264#VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_MVC_EXT STRUCTURE_TYPE_VIDEO_DECODE_H264_MVC_EXT} value to the {@link VkVideoDecodeH264MvcEXT#sType} field. */
        public VkVideoDecodeH264MvcEXT.Buffer sType$Default() { return sType(EXTVideoDecodeH264.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_MVC_EXT); }
        /** Sets the specified value to the {@link VkVideoDecodeH264MvcEXT#pNext} field. */
        public VkVideoDecodeH264MvcEXT.Buffer pNext(@NativeType("void const *") long value) { VkVideoDecodeH264MvcEXT.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoDecodeH264Mvc} to the {@link VkVideoDecodeH264MvcEXT#pStdMvc} field. */
        public VkVideoDecodeH264MvcEXT.Buffer pStdMvc(@NativeType("StdVideoDecodeH264Mvc const *") StdVideoDecodeH264Mvc value) { VkVideoDecodeH264MvcEXT.npStdMvc(address(), value); return this; }

    }

}