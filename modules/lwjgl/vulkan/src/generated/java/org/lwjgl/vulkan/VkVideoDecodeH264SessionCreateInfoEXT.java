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

/**
 * Structure specifies H.264 decode session creation parameters.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVideoDecodeH264#VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_CREATE_INFO_EXT STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_CREATE_INFO_EXT}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>{@code pStdExtensionVersion} <b>must</b> be a valid pointer to a valid {@link VkExtensionProperties} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtensionProperties}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoDecodeH264SessionCreateInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkVideoDecodeH264CreateFlagsEXT {@link #flags};
 *     {@link VkExtensionProperties VkExtensionProperties} const * {@link #pStdExtensionVersion};
 * }</code></pre>
 */
public class VkVideoDecodeH264SessionCreateInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        PSTDEXTENSIONVERSION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        PSTDEXTENSIONVERSION = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkVideoDecodeH264SessionCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoDecodeH264SessionCreateInfoEXT(ByteBuffer container) {
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
    /** reserved for future use. */
    @NativeType("VkVideoDecodeH264CreateFlagsEXT")
    public int flags() { return nflags(address()); }
    /** a pointer to a {@link VkExtensionProperties} structure specifying the H.264 codec extensions defined in {@code StdVideoH264Extensions}. */
    @NativeType("VkExtensionProperties const *")
    public VkExtensionProperties pStdExtensionVersion() { return npStdExtensionVersion(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoDecodeH264SessionCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVideoDecodeH264#VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_CREATE_INFO_EXT STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_CREATE_INFO_EXT} value to the {@link #sType} field. */
    public VkVideoDecodeH264SessionCreateInfoEXT sType$Default() { return sType(EXTVideoDecodeH264.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoDecodeH264SessionCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkVideoDecodeH264SessionCreateInfoEXT flags(@NativeType("VkVideoDecodeH264CreateFlagsEXT") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link VkExtensionProperties} to the {@link #pStdExtensionVersion} field. */
    public VkVideoDecodeH264SessionCreateInfoEXT pStdExtensionVersion(@NativeType("VkExtensionProperties const *") VkExtensionProperties value) { npStdExtensionVersion(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoDecodeH264SessionCreateInfoEXT set(
        int sType,
        long pNext,
        int flags,
        VkExtensionProperties pStdExtensionVersion
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pStdExtensionVersion(pStdExtensionVersion);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoDecodeH264SessionCreateInfoEXT set(VkVideoDecodeH264SessionCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoDecodeH264SessionCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeH264SessionCreateInfoEXT malloc() {
        return wrap(VkVideoDecodeH264SessionCreateInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoDecodeH264SessionCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeH264SessionCreateInfoEXT calloc() {
        return wrap(VkVideoDecodeH264SessionCreateInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoDecodeH264SessionCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoDecodeH264SessionCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoDecodeH264SessionCreateInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoDecodeH264SessionCreateInfoEXT} instance for the specified memory address. */
    public static VkVideoDecodeH264SessionCreateInfoEXT create(long address) {
        return wrap(VkVideoDecodeH264SessionCreateInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoDecodeH264SessionCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoDecodeH264SessionCreateInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264SessionCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264SessionCreateInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264SessionCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264SessionCreateInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264SessionCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264SessionCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoDecodeH264SessionCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264SessionCreateInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoDecodeH264SessionCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkVideoDecodeH264SessionCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeH264SessionCreateInfoEXT malloc(MemoryStack stack) {
        return wrap(VkVideoDecodeH264SessionCreateInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoDecodeH264SessionCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeH264SessionCreateInfoEXT calloc(MemoryStack stack) {
        return wrap(VkVideoDecodeH264SessionCreateInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoDecodeH264SessionCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264SessionCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264SessionCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264SessionCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeH264SessionCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoDecodeH264SessionCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeH264SessionCreateInfoEXT.FLAGS); }
    /** Unsafe version of {@link #pStdExtensionVersion}. */
    public static VkExtensionProperties npStdExtensionVersion(long struct) { return VkExtensionProperties.create(memGetAddress(struct + VkVideoDecodeH264SessionCreateInfoEXT.PSTDEXTENSIONVERSION)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoDecodeH264SessionCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoDecodeH264SessionCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoDecodeH264SessionCreateInfoEXT.FLAGS, value); }
    /** Unsafe version of {@link #pStdExtensionVersion(VkExtensionProperties) pStdExtensionVersion}. */
    public static void npStdExtensionVersion(long struct, VkExtensionProperties value) { memPutAddress(struct + VkVideoDecodeH264SessionCreateInfoEXT.PSTDEXTENSIONVERSION, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkVideoDecodeH264SessionCreateInfoEXT.PSTDEXTENSIONVERSION));
    }

    // -----------------------------------

    /** An array of {@link VkVideoDecodeH264SessionCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoDecodeH264SessionCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkVideoDecodeH264SessionCreateInfoEXT ELEMENT_FACTORY = VkVideoDecodeH264SessionCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoDecodeH264SessionCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoDecodeH264SessionCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkVideoDecodeH264SessionCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoDecodeH264SessionCreateInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoDecodeH264SessionCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkVideoDecodeH264SessionCreateInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoDecodeH264SessionCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkVideoDecodeH264SessionCreateInfoEXT#flags} field. */
        @NativeType("VkVideoDecodeH264CreateFlagsEXT")
        public int flags() { return VkVideoDecodeH264SessionCreateInfoEXT.nflags(address()); }
        /** @return a {@link VkExtensionProperties} view of the struct pointed to by the {@link VkVideoDecodeH264SessionCreateInfoEXT#pStdExtensionVersion} field. */
        @NativeType("VkExtensionProperties const *")
        public VkExtensionProperties pStdExtensionVersion() { return VkVideoDecodeH264SessionCreateInfoEXT.npStdExtensionVersion(address()); }

        /** Sets the specified value to the {@link VkVideoDecodeH264SessionCreateInfoEXT#sType} field. */
        public VkVideoDecodeH264SessionCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoDecodeH264SessionCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVideoDecodeH264#VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_CREATE_INFO_EXT STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_CREATE_INFO_EXT} value to the {@link VkVideoDecodeH264SessionCreateInfoEXT#sType} field. */
        public VkVideoDecodeH264SessionCreateInfoEXT.Buffer sType$Default() { return sType(EXTVideoDecodeH264.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@link VkVideoDecodeH264SessionCreateInfoEXT#pNext} field. */
        public VkVideoDecodeH264SessionCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkVideoDecodeH264SessionCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoDecodeH264SessionCreateInfoEXT#flags} field. */
        public VkVideoDecodeH264SessionCreateInfoEXT.Buffer flags(@NativeType("VkVideoDecodeH264CreateFlagsEXT") int value) { VkVideoDecodeH264SessionCreateInfoEXT.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link VkExtensionProperties} to the {@link VkVideoDecodeH264SessionCreateInfoEXT#pStdExtensionVersion} field. */
        public VkVideoDecodeH264SessionCreateInfoEXT.Buffer pStdExtensionVersion(@NativeType("VkExtensionProperties const *") VkExtensionProperties value) { VkVideoDecodeH264SessionCreateInfoEXT.npStdExtensionVersion(address(), value); return this; }

    }

}