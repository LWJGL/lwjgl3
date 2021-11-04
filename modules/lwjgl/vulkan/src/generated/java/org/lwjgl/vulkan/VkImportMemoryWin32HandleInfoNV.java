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

import org.lwjgl.system.windows.*;

/**
 * Import Win32 memory created on the same physical device.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@code handleType} is 0, this structure is ignored by consumers of the {@link VkMemoryAllocateInfo} structure it is chained from.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code handleType} <b>must</b> not have more than one bit set</li>
 * <li>{@code handle} <b>must</b> be a valid handle to memory, obtained as specified by {@code handleType}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVExternalMemoryWin32#VK_STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_NV STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_NV}</li>
 * <li>{@code handleType} <b>must</b> be a valid combination of {@code VkExternalMemoryHandleTypeFlagBitsNV} values</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImportMemoryWin32HandleInfoNV {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkExternalMemoryHandleTypeFlagsNV {@link #handleType};
 *     HANDLE {@link #handle};
 * }</code></pre>
 */
public class VkImportMemoryWin32HandleInfoNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        HANDLETYPE,
        HANDLE;

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
        HANDLETYPE = layout.offsetof(2);
        HANDLE = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkImportMemoryWin32HandleInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImportMemoryWin32HandleInfoNV(ByteBuffer container) {
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
    /** 0 or a {@code VkExternalMemoryHandleTypeFlagBitsNV} value specifying the type of memory handle in {@code handle}. */
    @NativeType("VkExternalMemoryHandleTypeFlagsNV")
    public int handleType() { return nhandleType(address()); }
    /** a Windows {@code HANDLE} referring to the memory. */
    @NativeType("HANDLE")
    public long handle() { return nhandle(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkImportMemoryWin32HandleInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVExternalMemoryWin32#VK_STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_NV STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_NV} value to the {@link #sType} field. */
    public VkImportMemoryWin32HandleInfoNV sType$Default() { return sType(NVExternalMemoryWin32.VK_STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkImportMemoryWin32HandleInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #handleType} field. */
    public VkImportMemoryWin32HandleInfoNV handleType(@NativeType("VkExternalMemoryHandleTypeFlagsNV") int value) { nhandleType(address(), value); return this; }
    /** Sets the specified value to the {@link #handle} field. */
    public VkImportMemoryWin32HandleInfoNV handle(@NativeType("HANDLE") long value) { nhandle(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImportMemoryWin32HandleInfoNV set(
        int sType,
        long pNext,
        int handleType,
        long handle
    ) {
        sType(sType);
        pNext(pNext);
        handleType(handleType);
        handle(handle);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImportMemoryWin32HandleInfoNV set(VkImportMemoryWin32HandleInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImportMemoryWin32HandleInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImportMemoryWin32HandleInfoNV malloc() {
        return wrap(VkImportMemoryWin32HandleInfoNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkImportMemoryWin32HandleInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImportMemoryWin32HandleInfoNV calloc() {
        return wrap(VkImportMemoryWin32HandleInfoNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkImportMemoryWin32HandleInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkImportMemoryWin32HandleInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkImportMemoryWin32HandleInfoNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkImportMemoryWin32HandleInfoNV} instance for the specified memory address. */
    public static VkImportMemoryWin32HandleInfoNV create(long address) {
        return wrap(VkImportMemoryWin32HandleInfoNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImportMemoryWin32HandleInfoNV createSafe(long address) {
        return address == NULL ? null : wrap(VkImportMemoryWin32HandleInfoNV.class, address);
    }

    /**
     * Returns a new {@link VkImportMemoryWin32HandleInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportMemoryWin32HandleInfoNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImportMemoryWin32HandleInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportMemoryWin32HandleInfoNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImportMemoryWin32HandleInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportMemoryWin32HandleInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkImportMemoryWin32HandleInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImportMemoryWin32HandleInfoNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImportMemoryWin32HandleInfoNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImportMemoryWin32HandleInfoNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImportMemoryWin32HandleInfoNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImportMemoryWin32HandleInfoNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImportMemoryWin32HandleInfoNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImportMemoryWin32HandleInfoNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImportMemoryWin32HandleInfoNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImportMemoryWin32HandleInfoNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImportMemoryWin32HandleInfoNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkImportMemoryWin32HandleInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImportMemoryWin32HandleInfoNV malloc(MemoryStack stack) {
        return wrap(VkImportMemoryWin32HandleInfoNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkImportMemoryWin32HandleInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImportMemoryWin32HandleInfoNV calloc(MemoryStack stack) {
        return wrap(VkImportMemoryWin32HandleInfoNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkImportMemoryWin32HandleInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImportMemoryWin32HandleInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImportMemoryWin32HandleInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImportMemoryWin32HandleInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkImportMemoryWin32HandleInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImportMemoryWin32HandleInfoNV.PNEXT); }
    /** Unsafe version of {@link #handleType}. */
    public static int nhandleType(long struct) { return UNSAFE.getInt(null, struct + VkImportMemoryWin32HandleInfoNV.HANDLETYPE); }
    /** Unsafe version of {@link #handle}. */
    public static long nhandle(long struct) { return memGetAddress(struct + VkImportMemoryWin32HandleInfoNV.HANDLE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkImportMemoryWin32HandleInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImportMemoryWin32HandleInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #handleType(int) handleType}. */
    public static void nhandleType(long struct, int value) { UNSAFE.putInt(null, struct + VkImportMemoryWin32HandleInfoNV.HANDLETYPE, value); }
    /** Unsafe version of {@link #handle(long) handle}. */
    public static void nhandle(long struct, long value) { memPutAddress(struct + VkImportMemoryWin32HandleInfoNV.HANDLE, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkImportMemoryWin32HandleInfoNV.HANDLE));
    }

    // -----------------------------------

    /** An array of {@link VkImportMemoryWin32HandleInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkImportMemoryWin32HandleInfoNV, Buffer> implements NativeResource {

        private static final VkImportMemoryWin32HandleInfoNV ELEMENT_FACTORY = VkImportMemoryWin32HandleInfoNV.create(-1L);

        /**
         * Creates a new {@code VkImportMemoryWin32HandleInfoNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImportMemoryWin32HandleInfoNV#SIZEOF}, and its mark will be undefined.
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
        protected VkImportMemoryWin32HandleInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkImportMemoryWin32HandleInfoNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImportMemoryWin32HandleInfoNV.nsType(address()); }
        /** @return the value of the {@link VkImportMemoryWin32HandleInfoNV#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImportMemoryWin32HandleInfoNV.npNext(address()); }
        /** @return the value of the {@link VkImportMemoryWin32HandleInfoNV#handleType} field. */
        @NativeType("VkExternalMemoryHandleTypeFlagsNV")
        public int handleType() { return VkImportMemoryWin32HandleInfoNV.nhandleType(address()); }
        /** @return the value of the {@link VkImportMemoryWin32HandleInfoNV#handle} field. */
        @NativeType("HANDLE")
        public long handle() { return VkImportMemoryWin32HandleInfoNV.nhandle(address()); }

        /** Sets the specified value to the {@link VkImportMemoryWin32HandleInfoNV#sType} field. */
        public VkImportMemoryWin32HandleInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkImportMemoryWin32HandleInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVExternalMemoryWin32#VK_STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_NV STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_NV} value to the {@link VkImportMemoryWin32HandleInfoNV#sType} field. */
        public VkImportMemoryWin32HandleInfoNV.Buffer sType$Default() { return sType(NVExternalMemoryWin32.VK_STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_NV); }
        /** Sets the specified value to the {@link VkImportMemoryWin32HandleInfoNV#pNext} field. */
        public VkImportMemoryWin32HandleInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkImportMemoryWin32HandleInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkImportMemoryWin32HandleInfoNV#handleType} field. */
        public VkImportMemoryWin32HandleInfoNV.Buffer handleType(@NativeType("VkExternalMemoryHandleTypeFlagsNV") int value) { VkImportMemoryWin32HandleInfoNV.nhandleType(address(), value); return this; }
        /** Sets the specified value to the {@link VkImportMemoryWin32HandleInfoNV#handle} field. */
        public VkImportMemoryWin32HandleInfoNV.Buffer handle(@NativeType("HANDLE") long value) { VkImportMemoryWin32HandleInfoNV.nhandle(address(), value); return this; }

    }

}