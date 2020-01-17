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
 * <p>If {@code viewFormatCount} is zero, {@code pViewFormats} is ignored and the image is created as if the {@link VkImageFormatListCreateInfo} structure were not included in the {@code pNext} list of {@link VkImageCreateInfo}.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code viewFormatCount} is not 0, all of the formats in the {@code pViewFormats} array <b>must</b> be compatible with the format specified in the {@code format} field of {@link VkImageCreateInfo}, as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#formats-compatibility">compatibility table</a>.</li>
 * <li>If {@link VkImageCreateInfo}{@code ::flags} does not contain {@link VK10#VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT IMAGE_CREATE_MUTABLE_FORMAT_BIT}, {@code viewFormatCount} <b>must</b> be 0 or 1.</li>
 * <li>If {@code viewFormatCount} is not 0, {@link VkImageCreateInfo}{@code ::format} <b>must</b> be in {@code pViewFormats}.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK12#VK_STRUCTURE_TYPE_IMAGE_FORMAT_LIST_CREATE_INFO STRUCTURE_TYPE_IMAGE_FORMAT_LIST_CREATE_INFO}</li>
 * <li>If {@code viewFormatCount} is not 0, {@code pViewFormats} <b>must</b> be a valid pointer to an array of {@code viewFormatCount} valid {@code VkFormat} values</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code viewFormatCount} &ndash; the number of entries in the {@code pViewFormats} array.</li>
 * <li>{@code pViewFormats} &ndash; an array which lists of all formats which <b>can</b> be used when creating views of this image.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImageFormatListCreateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t viewFormatCount;
 *     VkFormat const * pViewFormats;
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

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code viewFormatCount} field. */
    @NativeType("uint32_t")
    public int viewFormatCount() { return nviewFormatCount(address()); }
    /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pViewFormats} field. */
    @Nullable
    @NativeType("VkFormat const *")
    public IntBuffer pViewFormats() { return npViewFormats(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkImageFormatListCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkImageFormatListCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pViewFormats} field. */
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

    // -----------------------------------

    /** Returns a new {@code VkImageFormatListCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkImageFormatListCreateInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkImageFormatListCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkImageFormatListCreateInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkImageFormatListCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageFormatListCreateInfo mallocStack(MemoryStack stack) {
        return wrap(VkImageFormatListCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkImageFormatListCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageFormatListCreateInfo callocStack(MemoryStack stack) {
        return wrap(VkImageFormatListCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkImageFormatListCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageFormatListCreateInfo.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkImageFormatListCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageFormatListCreateInfo.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkImageFormatListCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageFormatListCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageFormatListCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageFormatListCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) {
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

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
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

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImageFormatListCreateInfo.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImageFormatListCreateInfo.npNext(address()); }
        /** Returns the value of the {@code viewFormatCount} field. */
        @NativeType("uint32_t")
        public int viewFormatCount() { return VkImageFormatListCreateInfo.nviewFormatCount(address()); }
        /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pViewFormats} field. */
        @Nullable
        @NativeType("VkFormat const *")
        public IntBuffer pViewFormats() { return VkImageFormatListCreateInfo.npViewFormats(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkImageFormatListCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkImageFormatListCreateInfo.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkImageFormatListCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkImageFormatListCreateInfo.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pViewFormats} field. */
        public VkImageFormatListCreateInfo.Buffer pViewFormats(@Nullable @NativeType("VkFormat const *") IntBuffer value) { VkImageFormatListCreateInfo.npViewFormats(address(), value); return this; }

    }

}