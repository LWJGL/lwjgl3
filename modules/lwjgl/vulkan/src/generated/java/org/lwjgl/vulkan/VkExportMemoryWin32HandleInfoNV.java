/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import org.lwjgl.system.windows.*;

/**
 * Specify security attributes and access rights for Win32 memory handles.
 * 
 * <h5>Description</h5>
 * 
 * <p>If this structure is not present, or if {@code pAttributes} is set to {@code NULL}, default security descriptor values will be used, and child processes created by the application will not inherit the handle, as described in the MSDN documentation for “{@code Synchronization Object Security and Access Rights}”<sup>1</sup>. Further, if the structure is not present, the access rights will be</p>
 * 
 * <p>{@code DXGI_SHARED_RESOURCE_READ} | {@code DXGI_SHARED_RESOURCE_WRITE}</p>
 * 
 * <dl>
 * <dt>1</dt>
 * <dd><a href="https://docs.microsoft.com/en-us/windows/win32/sync/synchronization-object-security-and-access-rights">https://docs.microsoft.com/en-us/windows/win32/sync/synchronization-object-security-and-access-rights</a></dd>
 * </dl>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVExternalMemoryWin32#VK_STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_NV STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_NV}</li>
 * <li>If {@code pAttributes} is not {@code NULL}, {@code pAttributes} <b>must</b> be a valid pointer to a valid {@code SECURITY_ATTRIBUTES} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkExportMemoryWin32HandleInfoNV {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     {@link SECURITY_ATTRIBUTES SECURITY_ATTRIBUTES} const * {@link #pAttributes};
 *     DWORD {@link #dwAccess};
 * }</code></pre>
 */
public class VkExportMemoryWin32HandleInfoNV extends Struct<VkExportMemoryWin32HandleInfoNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PATTRIBUTES,
        DWACCESS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PATTRIBUTES = layout.offsetof(2);
        DWACCESS = layout.offsetof(3);
    }

    protected VkExportMemoryWin32HandleInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkExportMemoryWin32HandleInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkExportMemoryWin32HandleInfoNV(address, container);
    }

    /**
     * Creates a {@code VkExportMemoryWin32HandleInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkExportMemoryWin32HandleInfoNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a pointer to a Windows {@code SECURITY_ATTRIBUTES} structure specifying security attributes of the handle. */
    @NativeType("SECURITY_ATTRIBUTES const *")
    public @Nullable SECURITY_ATTRIBUTES pAttributes() { return npAttributes(address()); }
    /** a {@code DWORD} specifying access rights of the handle. */
    @NativeType("DWORD")
    public int dwAccess() { return ndwAccess(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkExportMemoryWin32HandleInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVExternalMemoryWin32#VK_STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_NV STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_NV} value to the {@link #sType} field. */
    public VkExportMemoryWin32HandleInfoNV sType$Default() { return sType(NVExternalMemoryWin32.VK_STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkExportMemoryWin32HandleInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link SECURITY_ATTRIBUTES} to the {@link #pAttributes} field. */
    public VkExportMemoryWin32HandleInfoNV pAttributes(@Nullable @NativeType("SECURITY_ATTRIBUTES const *") SECURITY_ATTRIBUTES value) { npAttributes(address(), value); return this; }
    /** Sets the specified value to the {@link #dwAccess} field. */
    public VkExportMemoryWin32HandleInfoNV dwAccess(@NativeType("DWORD") int value) { ndwAccess(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkExportMemoryWin32HandleInfoNV set(
        int sType,
        long pNext,
        @Nullable SECURITY_ATTRIBUTES pAttributes,
        int dwAccess
    ) {
        sType(sType);
        pNext(pNext);
        pAttributes(pAttributes);
        dwAccess(dwAccess);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkExportMemoryWin32HandleInfoNV set(VkExportMemoryWin32HandleInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkExportMemoryWin32HandleInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkExportMemoryWin32HandleInfoNV malloc() {
        return new VkExportMemoryWin32HandleInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkExportMemoryWin32HandleInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkExportMemoryWin32HandleInfoNV calloc() {
        return new VkExportMemoryWin32HandleInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkExportMemoryWin32HandleInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkExportMemoryWin32HandleInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExportMemoryWin32HandleInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkExportMemoryWin32HandleInfoNV} instance for the specified memory address. */
    public static VkExportMemoryWin32HandleInfoNV create(long address) {
        return new VkExportMemoryWin32HandleInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkExportMemoryWin32HandleInfoNV createSafe(long address) {
        return address == NULL ? null : new VkExportMemoryWin32HandleInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkExportMemoryWin32HandleInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportMemoryWin32HandleInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkExportMemoryWin32HandleInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportMemoryWin32HandleInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExportMemoryWin32HandleInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportMemoryWin32HandleInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkExportMemoryWin32HandleInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkExportMemoryWin32HandleInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkExportMemoryWin32HandleInfoNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkExportMemoryWin32HandleInfoNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkExportMemoryWin32HandleInfoNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkExportMemoryWin32HandleInfoNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkExportMemoryWin32HandleInfoNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExportMemoryWin32HandleInfoNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExportMemoryWin32HandleInfoNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExportMemoryWin32HandleInfoNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExportMemoryWin32HandleInfoNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkExportMemoryWin32HandleInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExportMemoryWin32HandleInfoNV malloc(MemoryStack stack) {
        return new VkExportMemoryWin32HandleInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkExportMemoryWin32HandleInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExportMemoryWin32HandleInfoNV calloc(MemoryStack stack) {
        return new VkExportMemoryWin32HandleInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkExportMemoryWin32HandleInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExportMemoryWin32HandleInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExportMemoryWin32HandleInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExportMemoryWin32HandleInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkExportMemoryWin32HandleInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkExportMemoryWin32HandleInfoNV.PNEXT); }
    /** Unsafe version of {@link #pAttributes}. */
    public static @Nullable SECURITY_ATTRIBUTES npAttributes(long struct) { return SECURITY_ATTRIBUTES.createSafe(memGetAddress(struct + VkExportMemoryWin32HandleInfoNV.PATTRIBUTES)); }
    /** Unsafe version of {@link #dwAccess}. */
    public static int ndwAccess(long struct) { return memGetInt(struct + VkExportMemoryWin32HandleInfoNV.DWACCESS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkExportMemoryWin32HandleInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkExportMemoryWin32HandleInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #pAttributes(SECURITY_ATTRIBUTES) pAttributes}. */
    public static void npAttributes(long struct, @Nullable SECURITY_ATTRIBUTES value) { memPutAddress(struct + VkExportMemoryWin32HandleInfoNV.PATTRIBUTES, memAddressSafe(value)); }
    /** Unsafe version of {@link #dwAccess(int) dwAccess}. */
    public static void ndwAccess(long struct, int value) { memPutInt(struct + VkExportMemoryWin32HandleInfoNV.DWACCESS, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long pAttributes = memGetAddress(struct + VkExportMemoryWin32HandleInfoNV.PATTRIBUTES);
        if (pAttributes != NULL) {
            SECURITY_ATTRIBUTES.validate(pAttributes);
        }
    }

    // -----------------------------------

    /** An array of {@link VkExportMemoryWin32HandleInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkExportMemoryWin32HandleInfoNV, Buffer> implements NativeResource {

        private static final VkExportMemoryWin32HandleInfoNV ELEMENT_FACTORY = VkExportMemoryWin32HandleInfoNV.create(-1L);

        /**
         * Creates a new {@code VkExportMemoryWin32HandleInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkExportMemoryWin32HandleInfoNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkExportMemoryWin32HandleInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkExportMemoryWin32HandleInfoNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkExportMemoryWin32HandleInfoNV.nsType(address()); }
        /** @return the value of the {@link VkExportMemoryWin32HandleInfoNV#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkExportMemoryWin32HandleInfoNV.npNext(address()); }
        /** @return a {@link SECURITY_ATTRIBUTES} view of the struct pointed to by the {@link VkExportMemoryWin32HandleInfoNV#pAttributes} field. */
        @NativeType("SECURITY_ATTRIBUTES const *")
        public @Nullable SECURITY_ATTRIBUTES pAttributes() { return VkExportMemoryWin32HandleInfoNV.npAttributes(address()); }
        /** @return the value of the {@link VkExportMemoryWin32HandleInfoNV#dwAccess} field. */
        @NativeType("DWORD")
        public int dwAccess() { return VkExportMemoryWin32HandleInfoNV.ndwAccess(address()); }

        /** Sets the specified value to the {@link VkExportMemoryWin32HandleInfoNV#sType} field. */
        public VkExportMemoryWin32HandleInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkExportMemoryWin32HandleInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVExternalMemoryWin32#VK_STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_NV STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_NV} value to the {@link VkExportMemoryWin32HandleInfoNV#sType} field. */
        public VkExportMemoryWin32HandleInfoNV.Buffer sType$Default() { return sType(NVExternalMemoryWin32.VK_STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_NV); }
        /** Sets the specified value to the {@link VkExportMemoryWin32HandleInfoNV#pNext} field. */
        public VkExportMemoryWin32HandleInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkExportMemoryWin32HandleInfoNV.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link SECURITY_ATTRIBUTES} to the {@link VkExportMemoryWin32HandleInfoNV#pAttributes} field. */
        public VkExportMemoryWin32HandleInfoNV.Buffer pAttributes(@Nullable @NativeType("SECURITY_ATTRIBUTES const *") SECURITY_ATTRIBUTES value) { VkExportMemoryWin32HandleInfoNV.npAttributes(address(), value); return this; }
        /** Sets the specified value to the {@link VkExportMemoryWin32HandleInfoNV#dwAccess} field. */
        public VkExportMemoryWin32HandleInfoNV.Buffer dwAccess(@NativeType("DWORD") int value) { VkExportMemoryWin32HandleInfoNV.ndwAccess(address(), value); return this; }

    }

}