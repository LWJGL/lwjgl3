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
 * Specify memory handle types that may be exported.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVExternalMemory#VK_STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO_NV STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO_NV}</li>
 * <li>{@code handleTypes} <b>must</b> be a valid combination of {@code VkExternalMemoryHandleTypeFlagBitsNV} values</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkExportMemoryAllocateInfoNV {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkExternalMemoryHandleTypeFlagsNV {@link #handleTypes};
 * }</code></pre>
 */
public class VkExportMemoryAllocateInfoNV extends Struct implements NativeResource {

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
     * Creates a {@code VkExportMemoryAllocateInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkExportMemoryAllocateInfoNV(ByteBuffer container) {
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
    /** a bitmask of {@code VkExternalMemoryHandleTypeFlagBitsNV} specifying one or more memory handle types that <b>may</b> be exported. Multiple handle types <b>may</b> be requested for the same allocation as long as they are compatible, as reported by {@link NVExternalMemoryCapabilities#vkGetPhysicalDeviceExternalImageFormatPropertiesNV GetPhysicalDeviceExternalImageFormatPropertiesNV}. */
    @NativeType("VkExternalMemoryHandleTypeFlagsNV")
    public int handleTypes() { return nhandleTypes(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkExportMemoryAllocateInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVExternalMemory#VK_STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO_NV STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO_NV} value to the {@link #sType} field. */
    public VkExportMemoryAllocateInfoNV sType$Default() { return sType(NVExternalMemory.VK_STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkExportMemoryAllocateInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #handleTypes} field. */
    public VkExportMemoryAllocateInfoNV handleTypes(@NativeType("VkExternalMemoryHandleTypeFlagsNV") int value) { nhandleTypes(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkExportMemoryAllocateInfoNV set(
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
    public VkExportMemoryAllocateInfoNV set(VkExportMemoryAllocateInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkExportMemoryAllocateInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkExportMemoryAllocateInfoNV malloc() {
        return wrap(VkExportMemoryAllocateInfoNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkExportMemoryAllocateInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkExportMemoryAllocateInfoNV calloc() {
        return wrap(VkExportMemoryAllocateInfoNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkExportMemoryAllocateInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkExportMemoryAllocateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkExportMemoryAllocateInfoNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkExportMemoryAllocateInfoNV} instance for the specified memory address. */
    public static VkExportMemoryAllocateInfoNV create(long address) {
        return wrap(VkExportMemoryAllocateInfoNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExportMemoryAllocateInfoNV createSafe(long address) {
        return address == NULL ? null : wrap(VkExportMemoryAllocateInfoNV.class, address);
    }

    /**
     * Returns a new {@link VkExportMemoryAllocateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportMemoryAllocateInfoNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkExportMemoryAllocateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportMemoryAllocateInfoNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExportMemoryAllocateInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportMemoryAllocateInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkExportMemoryAllocateInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkExportMemoryAllocateInfoNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExportMemoryAllocateInfoNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkExportMemoryAllocateInfoNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkExportMemoryAllocateInfoNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkExportMemoryAllocateInfoNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkExportMemoryAllocateInfoNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExportMemoryAllocateInfoNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExportMemoryAllocateInfoNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExportMemoryAllocateInfoNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExportMemoryAllocateInfoNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkExportMemoryAllocateInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExportMemoryAllocateInfoNV malloc(MemoryStack stack) {
        return wrap(VkExportMemoryAllocateInfoNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkExportMemoryAllocateInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExportMemoryAllocateInfoNV calloc(MemoryStack stack) {
        return wrap(VkExportMemoryAllocateInfoNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkExportMemoryAllocateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExportMemoryAllocateInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExportMemoryAllocateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExportMemoryAllocateInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkExportMemoryAllocateInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkExportMemoryAllocateInfoNV.PNEXT); }
    /** Unsafe version of {@link #handleTypes}. */
    public static int nhandleTypes(long struct) { return UNSAFE.getInt(null, struct + VkExportMemoryAllocateInfoNV.HANDLETYPES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkExportMemoryAllocateInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkExportMemoryAllocateInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #handleTypes(int) handleTypes}. */
    public static void nhandleTypes(long struct, int value) { UNSAFE.putInt(null, struct + VkExportMemoryAllocateInfoNV.HANDLETYPES, value); }

    // -----------------------------------

    /** An array of {@link VkExportMemoryAllocateInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkExportMemoryAllocateInfoNV, Buffer> implements NativeResource {

        private static final VkExportMemoryAllocateInfoNV ELEMENT_FACTORY = VkExportMemoryAllocateInfoNV.create(-1L);

        /**
         * Creates a new {@code VkExportMemoryAllocateInfoNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkExportMemoryAllocateInfoNV#SIZEOF}, and its mark will be undefined.
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
        protected VkExportMemoryAllocateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkExportMemoryAllocateInfoNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkExportMemoryAllocateInfoNV.nsType(address()); }
        /** @return the value of the {@link VkExportMemoryAllocateInfoNV#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkExportMemoryAllocateInfoNV.npNext(address()); }
        /** @return the value of the {@link VkExportMemoryAllocateInfoNV#handleTypes} field. */
        @NativeType("VkExternalMemoryHandleTypeFlagsNV")
        public int handleTypes() { return VkExportMemoryAllocateInfoNV.nhandleTypes(address()); }

        /** Sets the specified value to the {@link VkExportMemoryAllocateInfoNV#sType} field. */
        public VkExportMemoryAllocateInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkExportMemoryAllocateInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVExternalMemory#VK_STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO_NV STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO_NV} value to the {@link VkExportMemoryAllocateInfoNV#sType} field. */
        public VkExportMemoryAllocateInfoNV.Buffer sType$Default() { return sType(NVExternalMemory.VK_STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO_NV); }
        /** Sets the specified value to the {@link VkExportMemoryAllocateInfoNV#pNext} field. */
        public VkExportMemoryAllocateInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkExportMemoryAllocateInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkExportMemoryAllocateInfoNV#handleTypes} field. */
        public VkExportMemoryAllocateInfoNV.Buffer handleTypes(@NativeType("VkExternalMemoryHandleTypeFlagsNV") int value) { VkExportMemoryAllocateInfoNV.nhandleTypes(address(), value); return this; }

    }

}