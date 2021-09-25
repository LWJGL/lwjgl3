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
 * Specify exportable handle types for a device memory object.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The bits in {@code handleTypes} <b>must</b> be supported and compatible, as reported by {@link VkExternalImageFormatProperties} or {@link VkExternalBufferProperties}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO}</li>
 * <li>{@code handleTypes} <b>must</b> be a valid combination of {@code VkExternalMemoryHandleTypeFlagBits} values</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkExportMemoryAllocateInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkExternalMemoryHandleTypeFlags {@link #handleTypes};
 * }</code></pre>
 */
public class VkExportMemoryAllocateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        HANDLETYPES;

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
        HANDLETYPES = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkExportMemoryAllocateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkExportMemoryAllocateInfo(ByteBuffer container) {
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
    /** a bitmask of {@code VkExternalMemoryHandleTypeFlagBits} specifying one or more memory handle types the application <b>can</b> export from the resulting allocation. The application <b>can</b> request multiple handle types for the same allocation. */
    @NativeType("VkExternalMemoryHandleTypeFlags")
    public int handleTypes() { return nhandleTypes(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkExportMemoryAllocateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO} value to the {@link #sType} field. */
    public VkExportMemoryAllocateInfo sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkExportMemoryAllocateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #handleTypes} field. */
    public VkExportMemoryAllocateInfo handleTypes(@NativeType("VkExternalMemoryHandleTypeFlags") int value) { nhandleTypes(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkExportMemoryAllocateInfo set(
        int sType,
        long pNext,
        int handleTypes
    ) {
        sType(sType);
        pNext(pNext);
        handleTypes(handleTypes);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkExportMemoryAllocateInfo set(VkExportMemoryAllocateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkExportMemoryAllocateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkExportMemoryAllocateInfo malloc() {
        return wrap(VkExportMemoryAllocateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkExportMemoryAllocateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkExportMemoryAllocateInfo calloc() {
        return wrap(VkExportMemoryAllocateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkExportMemoryAllocateInfo} instance allocated with {@link BufferUtils}. */
    public static VkExportMemoryAllocateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkExportMemoryAllocateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkExportMemoryAllocateInfo} instance for the specified memory address. */
    public static VkExportMemoryAllocateInfo create(long address) {
        return wrap(VkExportMemoryAllocateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExportMemoryAllocateInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkExportMemoryAllocateInfo.class, address);
    }

    /**
     * Returns a new {@link VkExportMemoryAllocateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportMemoryAllocateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkExportMemoryAllocateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportMemoryAllocateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExportMemoryAllocateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportMemoryAllocateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkExportMemoryAllocateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkExportMemoryAllocateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExportMemoryAllocateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkExportMemoryAllocateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkExportMemoryAllocateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkExportMemoryAllocateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkExportMemoryAllocateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExportMemoryAllocateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExportMemoryAllocateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExportMemoryAllocateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExportMemoryAllocateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkExportMemoryAllocateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExportMemoryAllocateInfo malloc(MemoryStack stack) {
        return wrap(VkExportMemoryAllocateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkExportMemoryAllocateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExportMemoryAllocateInfo calloc(MemoryStack stack) {
        return wrap(VkExportMemoryAllocateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkExportMemoryAllocateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExportMemoryAllocateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExportMemoryAllocateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExportMemoryAllocateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkExportMemoryAllocateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkExportMemoryAllocateInfo.PNEXT); }
    /** Unsafe version of {@link #handleTypes}. */
    public static int nhandleTypes(long struct) { return UNSAFE.getInt(null, struct + VkExportMemoryAllocateInfo.HANDLETYPES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkExportMemoryAllocateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkExportMemoryAllocateInfo.PNEXT, value); }
    /** Unsafe version of {@link #handleTypes(int) handleTypes}. */
    public static void nhandleTypes(long struct, int value) { UNSAFE.putInt(null, struct + VkExportMemoryAllocateInfo.HANDLETYPES, value); }

    // -----------------------------------

    /** An array of {@link VkExportMemoryAllocateInfo} structs. */
    public static class Buffer extends StructBuffer<VkExportMemoryAllocateInfo, Buffer> implements NativeResource {

        private static final VkExportMemoryAllocateInfo ELEMENT_FACTORY = VkExportMemoryAllocateInfo.create(-1L);

        /**
         * Creates a new {@code VkExportMemoryAllocateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkExportMemoryAllocateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkExportMemoryAllocateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkExportMemoryAllocateInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkExportMemoryAllocateInfo.nsType(address()); }
        /** @return the value of the {@link VkExportMemoryAllocateInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkExportMemoryAllocateInfo.npNext(address()); }
        /** @return the value of the {@link VkExportMemoryAllocateInfo#handleTypes} field. */
        @NativeType("VkExternalMemoryHandleTypeFlags")
        public int handleTypes() { return VkExportMemoryAllocateInfo.nhandleTypes(address()); }

        /** Sets the specified value to the {@link VkExportMemoryAllocateInfo#sType} field. */
        public VkExportMemoryAllocateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkExportMemoryAllocateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO} value to the {@link VkExportMemoryAllocateInfo#sType} field. */
        public VkExportMemoryAllocateInfo.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO); }
        /** Sets the specified value to the {@link VkExportMemoryAllocateInfo#pNext} field. */
        public VkExportMemoryAllocateInfo.Buffer pNext(@NativeType("void const *") long value) { VkExportMemoryAllocateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkExportMemoryAllocateInfo#handleTypes} field. */
        public VkExportMemoryAllocateInfo.Buffer handleTypes(@NativeType("VkExternalMemoryHandleTypeFlags") int value) { VkExportMemoryAllocateInfo.nhandleTypes(address(), value); return this; }

    }

}