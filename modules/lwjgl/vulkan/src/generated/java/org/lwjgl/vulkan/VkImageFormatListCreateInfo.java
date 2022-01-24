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
 * Specify that an image <b>can</b> be used with a particular set of formats.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@code viewFormatCount} is zero, {@code pViewFormats} is ignored and the image is created as if the {@link VkImageFormatListCreateInfo} structure were not included in the {@code pNext} chain of {@link VkImageCreateInfo}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK12#VK_STRUCTURE_TYPE_IMAGE_FORMAT_LIST_CREATE_INFO STRUCTURE_TYPE_IMAGE_FORMAT_LIST_CREATE_INFO}</li>
 * <li>If {@code viewFormatCount} is not 0, {@code pViewFormats} <b>must</b> be a valid pointer to an array of {@code viewFormatCount} valid {@code VkFormat} values</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImageFormatListCreateInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #viewFormatCount};
 *     VkFormat const * {@link #pViewFormats};
 * }</code></pre>
 */
public class VkImageFormatListCreateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        VIEWFORMATCOUNT,
        PVIEWFORMATS;

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
        VIEWFORMATCOUNT = layout.offsetof(2);
        PVIEWFORMATS = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkImageFormatListCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageFormatListCreateInfo(ByteBuffer container) {
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
    /** the number of entries in the {@code pViewFormats} array. */
    @NativeType("uint32_t")
    public int viewFormatCount() { return nviewFormatCount(address()); }
    /** a pointer to an array of {@code VkFormat} values specifying all formats which <b>can</b> be used when creating views of this image. */
    @Nullable
    @NativeType("VkFormat const *")
    public IntBuffer pViewFormats() { return npViewFormats(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkImageFormatListCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_IMAGE_FORMAT_LIST_CREATE_INFO STRUCTURE_TYPE_IMAGE_FORMAT_LIST_CREATE_INFO} value to the {@link #sType} field. */
    public VkImageFormatListCreateInfo sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_IMAGE_FORMAT_LIST_CREATE_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkImageFormatListCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #pViewFormats} field. */
    public VkImageFormatListCreateInfo pViewFormats(@Nullable @NativeType("VkFormat const *") IntBuffer value) { npViewFormats(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageFormatListCreateInfo set(
        int sType,
        long pNext,
        @Nullable IntBuffer pViewFormats
    ) {
        sType(sType);
        pNext(pNext);
        pViewFormats(pViewFormats);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageFormatListCreateInfo set(VkImageFormatListCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageFormatListCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageFormatListCreateInfo malloc() {
        return wrap(VkImageFormatListCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkImageFormatListCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageFormatListCreateInfo calloc() {
        return wrap(VkImageFormatListCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkImageFormatListCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkImageFormatListCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkImageFormatListCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkImageFormatListCreateInfo} instance for the specified memory address. */
    public static VkImageFormatListCreateInfo create(long address) {
        return wrap(VkImageFormatListCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageFormatListCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkImageFormatListCreateInfo.class, address);
    }

    /**
     * Returns a new {@link VkImageFormatListCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageFormatListCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageFormatListCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageFormatListCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageFormatListCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageFormatListCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkImageFormatListCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageFormatListCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageFormatListCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkImageFormatListCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageFormatListCreateInfo malloc(MemoryStack stack) {
        return wrap(VkImageFormatListCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkImageFormatListCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageFormatListCreateInfo calloc(MemoryStack stack) {
        return wrap(VkImageFormatListCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkImageFormatListCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageFormatListCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageFormatListCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageFormatListCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkImageFormatListCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImageFormatListCreateInfo.PNEXT); }
    /** Unsafe version of {@link #viewFormatCount}. */
    public static int nviewFormatCount(long struct) { return UNSAFE.getInt(null, struct + VkImageFormatListCreateInfo.VIEWFORMATCOUNT); }
    /** Unsafe version of {@link #pViewFormats() pViewFormats}. */
    @Nullable public static IntBuffer npViewFormats(long struct) { return memIntBufferSafe(memGetAddress(struct + VkImageFormatListCreateInfo.PVIEWFORMATS), nviewFormatCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkImageFormatListCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImageFormatListCreateInfo.PNEXT, value); }
    /** Sets the specified value to the {@code viewFormatCount} field of the specified {@code struct}. */
    public static void nviewFormatCount(long struct, int value) { UNSAFE.putInt(null, struct + VkImageFormatListCreateInfo.VIEWFORMATCOUNT, value); }
    /** Unsafe version of {@link #pViewFormats(IntBuffer) pViewFormats}. */
    public static void npViewFormats(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkImageFormatListCreateInfo.PVIEWFORMATS, memAddressSafe(value)); nviewFormatCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nviewFormatCount(struct) != 0) {
            check(memGetAddress(struct + VkImageFormatListCreateInfo.PVIEWFORMATS));
        }
    }

    // -----------------------------------

    /** An array of {@link VkImageFormatListCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkImageFormatListCreateInfo, Buffer> implements NativeResource {

        private static final VkImageFormatListCreateInfo ELEMENT_FACTORY = VkImageFormatListCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkImageFormatListCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageFormatListCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkImageFormatListCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkImageFormatListCreateInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImageFormatListCreateInfo.nsType(address()); }
        /** @return the value of the {@link VkImageFormatListCreateInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImageFormatListCreateInfo.npNext(address()); }
        /** @return the value of the {@link VkImageFormatListCreateInfo#viewFormatCount} field. */
        @NativeType("uint32_t")
        public int viewFormatCount() { return VkImageFormatListCreateInfo.nviewFormatCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link VkImageFormatListCreateInfo#pViewFormats} field. */
        @Nullable
        @NativeType("VkFormat const *")
        public IntBuffer pViewFormats() { return VkImageFormatListCreateInfo.npViewFormats(address()); }

        /** Sets the specified value to the {@link VkImageFormatListCreateInfo#sType} field. */
        public VkImageFormatListCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkImageFormatListCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_IMAGE_FORMAT_LIST_CREATE_INFO STRUCTURE_TYPE_IMAGE_FORMAT_LIST_CREATE_INFO} value to the {@link VkImageFormatListCreateInfo#sType} field. */
        public VkImageFormatListCreateInfo.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_IMAGE_FORMAT_LIST_CREATE_INFO); }
        /** Sets the specified value to the {@link VkImageFormatListCreateInfo#pNext} field. */
        public VkImageFormatListCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkImageFormatListCreateInfo.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link VkImageFormatListCreateInfo#pViewFormats} field. */
        public VkImageFormatListCreateInfo.Buffer pViewFormats(@Nullable @NativeType("VkFormat const *") IntBuffer value) { VkImageFormatListCreateInfo.npViewFormats(address(), value); return this; }

    }

}