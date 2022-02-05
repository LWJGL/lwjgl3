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
 * Structure specifying H.264 decode profile.
 * 
 * <h5>Description</h5>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>When passing {@link VkVideoDecodeH264ProfileEXT} to {@link KHRVideoQueue#vkCreateVideoSessionKHR CreateVideoSessionKHR} in the {@code pNext} chain of {@link VkVideoSessionCreateInfoKHR}, requests for a {@code pictureLayout} not supported by the implementation will result in failure of the command.</p>
 * </div>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the {@link VkVideoDecodeH264ProfileEXT} structure is included in the {@code pNext} chain of the {@link VkVideoCapabilitiesKHR} structure passed to {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR}, the value in {@code pictureLayout} is treated as a bitmask of requested picture layouts. It is always valid to use the value {@link EXTVideoDecodeH264#VK_VIDEO_DECODE_H264_PICTURE_LAYOUT_PROGRESSIVE_EXT VIDEO_DECODE_H264_PICTURE_LAYOUT_PROGRESSIVE_EXT} as the implementation is guaranteed to support decoding of progressive content.</li>
 * <li>If the {@link VkVideoDecodeH264ProfileEXT} structure is included in the {@code pNext} chain of the {@link VkVideoSessionCreateInfoKHR} structure passed to {@link KHRVideoQueue#vkCreateVideoSessionKHR CreateVideoSessionKHR}, the value in {@code pictureLayout} <b>must</b> be exactly one of {@link EXTVideoDecodeH264#VK_VIDEO_DECODE_H264_PICTURE_LAYOUT_PROGRESSIVE_EXT VIDEO_DECODE_H264_PICTURE_LAYOUT_PROGRESSIVE_EXT}, {@link EXTVideoDecodeH264#VK_VIDEO_DECODE_H264_PICTURE_LAYOUT_INTERLACED_INTERLEAVED_LINES_BIT_EXT VIDEO_DECODE_H264_PICTURE_LAYOUT_INTERLACED_INTERLEAVED_LINES_BIT_EXT} or {@link EXTVideoDecodeH264#VK_VIDEO_DECODE_H264_PICTURE_LAYOUT_INTERLACED_SEPARATE_PLANES_BIT_EXT VIDEO_DECODE_H264_PICTURE_LAYOUT_INTERLACED_SEPARATE_PLANES_BIT_EXT}.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVideoDecodeH264#VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_PROFILE_EXT STRUCTURE_TYPE_VIDEO_DECODE_H264_PROFILE_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoDecodeH264ProfileEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     StdVideoH264ProfileIdc {@link #stdProfileIdc};
 *     VkVideoDecodeH264PictureLayoutFlagsEXT {@link #pictureLayout};
 * }</code></pre>
 */
public class VkVideoDecodeH264ProfileEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        STDPROFILEIDC,
        PICTURELAYOUT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STDPROFILEIDC = layout.offsetof(2);
        PICTURELAYOUT = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkVideoDecodeH264ProfileEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoDecodeH264ProfileEXT(ByteBuffer container) {
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
    /** a {@code StdVideoH264ProfileIdc} value specifying the H.264 codec profile IDC */
    @NativeType("StdVideoH264ProfileIdc")
    public int stdProfileIdc() { return nstdProfileIdc(address()); }
    /** a bitmask of {@code VkVideoDecodeH264PictureLayoutFlagBitsEXT} specifying the layout of the decoded picture’s contents depending on the nature (progressive vs. interlaced) of the input content. */
    @NativeType("VkVideoDecodeH264PictureLayoutFlagsEXT")
    public int pictureLayout() { return npictureLayout(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoDecodeH264ProfileEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVideoDecodeH264#VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_PROFILE_EXT STRUCTURE_TYPE_VIDEO_DECODE_H264_PROFILE_EXT} value to the {@link #sType} field. */
    public VkVideoDecodeH264ProfileEXT sType$Default() { return sType(EXTVideoDecodeH264.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_PROFILE_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoDecodeH264ProfileEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #stdProfileIdc} field. */
    public VkVideoDecodeH264ProfileEXT stdProfileIdc(@NativeType("StdVideoH264ProfileIdc") int value) { nstdProfileIdc(address(), value); return this; }
    /** Sets the specified value to the {@link #pictureLayout} field. */
    public VkVideoDecodeH264ProfileEXT pictureLayout(@NativeType("VkVideoDecodeH264PictureLayoutFlagsEXT") int value) { npictureLayout(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoDecodeH264ProfileEXT set(
        int sType,
        long pNext,
        int stdProfileIdc,
        int pictureLayout
    ) {
        sType(sType);
        pNext(pNext);
        stdProfileIdc(stdProfileIdc);
        pictureLayout(pictureLayout);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoDecodeH264ProfileEXT set(VkVideoDecodeH264ProfileEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoDecodeH264ProfileEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeH264ProfileEXT malloc() {
        return wrap(VkVideoDecodeH264ProfileEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoDecodeH264ProfileEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeH264ProfileEXT calloc() {
        return wrap(VkVideoDecodeH264ProfileEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoDecodeH264ProfileEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoDecodeH264ProfileEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoDecodeH264ProfileEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoDecodeH264ProfileEXT} instance for the specified memory address. */
    public static VkVideoDecodeH264ProfileEXT create(long address) {
        return wrap(VkVideoDecodeH264ProfileEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoDecodeH264ProfileEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoDecodeH264ProfileEXT.class, address);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264ProfileEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264ProfileEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264ProfileEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264ProfileEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264ProfileEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264ProfileEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoDecodeH264ProfileEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264ProfileEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoDecodeH264ProfileEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkVideoDecodeH264ProfileEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeH264ProfileEXT malloc(MemoryStack stack) {
        return wrap(VkVideoDecodeH264ProfileEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoDecodeH264ProfileEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeH264ProfileEXT calloc(MemoryStack stack) {
        return wrap(VkVideoDecodeH264ProfileEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoDecodeH264ProfileEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264ProfileEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264ProfileEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264ProfileEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeH264ProfileEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoDecodeH264ProfileEXT.PNEXT); }
    /** Unsafe version of {@link #stdProfileIdc}. */
    public static int nstdProfileIdc(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeH264ProfileEXT.STDPROFILEIDC); }
    /** Unsafe version of {@link #pictureLayout}. */
    public static int npictureLayout(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeH264ProfileEXT.PICTURELAYOUT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoDecodeH264ProfileEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoDecodeH264ProfileEXT.PNEXT, value); }
    /** Unsafe version of {@link #stdProfileIdc(int) stdProfileIdc}. */
    public static void nstdProfileIdc(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoDecodeH264ProfileEXT.STDPROFILEIDC, value); }
    /** Unsafe version of {@link #pictureLayout(int) pictureLayout}. */
    public static void npictureLayout(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoDecodeH264ProfileEXT.PICTURELAYOUT, value); }

    // -----------------------------------

    /** An array of {@link VkVideoDecodeH264ProfileEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoDecodeH264ProfileEXT, Buffer> implements NativeResource {

        private static final VkVideoDecodeH264ProfileEXT ELEMENT_FACTORY = VkVideoDecodeH264ProfileEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoDecodeH264ProfileEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoDecodeH264ProfileEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkVideoDecodeH264ProfileEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoDecodeH264ProfileEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoDecodeH264ProfileEXT.nsType(address()); }
        /** @return the value of the {@link VkVideoDecodeH264ProfileEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoDecodeH264ProfileEXT.npNext(address()); }
        /** @return the value of the {@link VkVideoDecodeH264ProfileEXT#stdProfileIdc} field. */
        @NativeType("StdVideoH264ProfileIdc")
        public int stdProfileIdc() { return VkVideoDecodeH264ProfileEXT.nstdProfileIdc(address()); }
        /** @return the value of the {@link VkVideoDecodeH264ProfileEXT#pictureLayout} field. */
        @NativeType("VkVideoDecodeH264PictureLayoutFlagsEXT")
        public int pictureLayout() { return VkVideoDecodeH264ProfileEXT.npictureLayout(address()); }

        /** Sets the specified value to the {@link VkVideoDecodeH264ProfileEXT#sType} field. */
        public VkVideoDecodeH264ProfileEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoDecodeH264ProfileEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVideoDecodeH264#VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_PROFILE_EXT STRUCTURE_TYPE_VIDEO_DECODE_H264_PROFILE_EXT} value to the {@link VkVideoDecodeH264ProfileEXT#sType} field. */
        public VkVideoDecodeH264ProfileEXT.Buffer sType$Default() { return sType(EXTVideoDecodeH264.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_PROFILE_EXT); }
        /** Sets the specified value to the {@link VkVideoDecodeH264ProfileEXT#pNext} field. */
        public VkVideoDecodeH264ProfileEXT.Buffer pNext(@NativeType("void const *") long value) { VkVideoDecodeH264ProfileEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoDecodeH264ProfileEXT#stdProfileIdc} field. */
        public VkVideoDecodeH264ProfileEXT.Buffer stdProfileIdc(@NativeType("StdVideoH264ProfileIdc") int value) { VkVideoDecodeH264ProfileEXT.nstdProfileIdc(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoDecodeH264ProfileEXT#pictureLayout} field. */
        public VkVideoDecodeH264ProfileEXT.Buffer pictureLayout(@NativeType("VkVideoDecodeH264PictureLayoutFlagsEXT") int value) { VkVideoDecodeH264ProfileEXT.npictureLayout(address(), value); return this; }

    }

}