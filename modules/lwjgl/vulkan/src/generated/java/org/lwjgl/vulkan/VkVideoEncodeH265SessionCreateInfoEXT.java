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
 * Structure specifies H.265 encoder creation parameters.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_CREATE_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_CREATE_INFO_EXT}</li>
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
 * struct VkVideoEncodeH265SessionCreateInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkVideoEncodeH265CreateFlagsEXT {@link #flags};
 *     {@link VkExtensionProperties VkExtensionProperties} const * {@link #pStdExtensionVersion};
 * }</code></pre>
 */
public class VkVideoEncodeH265SessionCreateInfoEXT extends Struct implements NativeResource {

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
     * Creates a {@code VkVideoEncodeH265SessionCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH265SessionCreateInfoEXT(ByteBuffer container) {
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
    @NativeType("VkVideoEncodeH265CreateFlagsEXT")
    public int flags() { return nflags(address()); }
    /** a pointer to a {@link VkExtensionProperties} structure specifying the H.265 codec extension version. */
    @NativeType("VkExtensionProperties const *")
    public VkExtensionProperties pStdExtensionVersion() { return npStdExtensionVersion(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeH265SessionCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_CREATE_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_CREATE_INFO_EXT} value to the {@link #sType} field. */
    public VkVideoEncodeH265SessionCreateInfoEXT sType$Default() { return sType(EXTVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeH265SessionCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkVideoEncodeH265SessionCreateInfoEXT flags(@NativeType("VkVideoEncodeH265CreateFlagsEXT") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link VkExtensionProperties} to the {@link #pStdExtensionVersion} field. */
    public VkVideoEncodeH265SessionCreateInfoEXT pStdExtensionVersion(@NativeType("VkExtensionProperties const *") VkExtensionProperties value) { npStdExtensionVersion(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH265SessionCreateInfoEXT set(
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
    public VkVideoEncodeH265SessionCreateInfoEXT set(VkVideoEncodeH265SessionCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH265SessionCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265SessionCreateInfoEXT malloc() {
        return wrap(VkVideoEncodeH265SessionCreateInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeH265SessionCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265SessionCreateInfoEXT calloc() {
        return wrap(VkVideoEncodeH265SessionCreateInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeH265SessionCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH265SessionCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoEncodeH265SessionCreateInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH265SessionCreateInfoEXT} instance for the specified memory address. */
    public static VkVideoEncodeH265SessionCreateInfoEXT create(long address) {
        return wrap(VkVideoEncodeH265SessionCreateInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH265SessionCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoEncodeH265SessionCreateInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265SessionCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionCreateInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265SessionCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionCreateInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265SessionCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoEncodeH265SessionCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionCreateInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH265SessionCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265SessionCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265SessionCreateInfoEXT malloc(MemoryStack stack) {
        return wrap(VkVideoEncodeH265SessionCreateInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoEncodeH265SessionCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265SessionCreateInfoEXT calloc(MemoryStack stack) {
        return wrap(VkVideoEncodeH265SessionCreateInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoEncodeH265SessionCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265SessionCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265SessionCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH265SessionCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265SessionCreateInfoEXT.FLAGS); }
    /** Unsafe version of {@link #pStdExtensionVersion}. */
    public static VkExtensionProperties npStdExtensionVersion(long struct) { return VkExtensionProperties.create(memGetAddress(struct + VkVideoEncodeH265SessionCreateInfoEXT.PSTDEXTENSIONVERSION)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265SessionCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH265SessionCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265SessionCreateInfoEXT.FLAGS, value); }
    /** Unsafe version of {@link #pStdExtensionVersion(VkExtensionProperties) pStdExtensionVersion}. */
    public static void npStdExtensionVersion(long struct, VkExtensionProperties value) { memPutAddress(struct + VkVideoEncodeH265SessionCreateInfoEXT.PSTDEXTENSIONVERSION, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkVideoEncodeH265SessionCreateInfoEXT.PSTDEXTENSIONVERSION));
    }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH265SessionCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265SessionCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkVideoEncodeH265SessionCreateInfoEXT ELEMENT_FACTORY = VkVideoEncodeH265SessionCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH265SessionCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH265SessionCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkVideoEncodeH265SessionCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeH265SessionCreateInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH265SessionCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeH265SessionCreateInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH265SessionCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeH265SessionCreateInfoEXT#flags} field. */
        @NativeType("VkVideoEncodeH265CreateFlagsEXT")
        public int flags() { return VkVideoEncodeH265SessionCreateInfoEXT.nflags(address()); }
        /** @return a {@link VkExtensionProperties} view of the struct pointed to by the {@link VkVideoEncodeH265SessionCreateInfoEXT#pStdExtensionVersion} field. */
        @NativeType("VkExtensionProperties const *")
        public VkExtensionProperties pStdExtensionVersion() { return VkVideoEncodeH265SessionCreateInfoEXT.npStdExtensionVersion(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeH265SessionCreateInfoEXT#sType} field. */
        public VkVideoEncodeH265SessionCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH265SessionCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_CREATE_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_CREATE_INFO_EXT} value to the {@link VkVideoEncodeH265SessionCreateInfoEXT#sType} field. */
        public VkVideoEncodeH265SessionCreateInfoEXT.Buffer sType$Default() { return sType(EXTVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@link VkVideoEncodeH265SessionCreateInfoEXT#pNext} field. */
        public VkVideoEncodeH265SessionCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH265SessionCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265SessionCreateInfoEXT#flags} field. */
        public VkVideoEncodeH265SessionCreateInfoEXT.Buffer flags(@NativeType("VkVideoEncodeH265CreateFlagsEXT") int value) { VkVideoEncodeH265SessionCreateInfoEXT.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link VkExtensionProperties} to the {@link VkVideoEncodeH265SessionCreateInfoEXT#pStdExtensionVersion} field. */
        public VkVideoEncodeH265SessionCreateInfoEXT.Buffer pStdExtensionVersion(@NativeType("VkExtensionProperties const *") VkExtensionProperties value) { VkVideoEncodeH265SessionCreateInfoEXT.npStdExtensionVersion(address(), value); return this; }

    }

}