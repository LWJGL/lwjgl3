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
 * Structure specifying additional attributes of Windows handles exported from a memory.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@link VkExportMemoryAllocateInfo} is not included in the same {@code pNext} chain, this structure is ignored.</p>
 * 
 * <p>If {@link VkExportMemoryAllocateInfo} is included in the {@code pNext} chain of {@link VkMemoryAllocateInfo} with a Windows {@code handleType}, but either {@link VkExportMemoryWin32HandleInfoKHR} is not included in the {@code pNext} chain, or if it is but {@code pAttributes} is set to {@code NULL}, default security descriptor values will be used, and child processes created by the application will not inherit the handle, as described in the MSDN documentation for “{@code Synchronization Object Security and Access Rights}”<sup>1</sup>. Further, if the structure is not present, the access rights used depend on the handle type.</p>
 * 
 * <p>For handles of the following types:</p>
 * 
 * <ul>
 * <li>{@link VK11#VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT}</li>
 * </ul>
 * 
 * <p>The implementation <b>must</b> ensure the access rights allow read and write access to the memory.</p>
 * 
 * <dl>
 * <dt>1</dt>
 * <dd><a target="_blank" href="https://docs.microsoft.com/en-us/windows/win32/sync/synchronization-object-security-and-access-rights">https://docs.microsoft.com/en-us/windows/win32/sync/synchronization-object-security-and-access-rights</a></dd>
 * </dl>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@link VkExportMemoryAllocateInfo}{@code ::handleTypes} does not include {@link VK11#VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT}, a {@link VkExportMemoryWin32HandleInfoKHR} structure <b>must</b> not be included in the {@code pNext} chain of {@link VkMemoryAllocateInfo}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRExternalMemoryWin32#VK_STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_KHR STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_KHR}</li>
 * <li>If {@code pAttributes} is not {@code NULL}, {@code pAttributes} <b>must</b> be a valid pointer to a valid {@code SECURITY_ATTRIBUTES} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkExportMemoryWin32HandleInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     {@link SECURITY_ATTRIBUTES SECURITY_ATTRIBUTES} const * {@link #pAttributes};
 *     DWORD {@link #dwAccess};
 *     LPCWSTR {@link #name};
 * }</code></pre>
 */
public class VkExportMemoryWin32HandleInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PATTRIBUTES,
        DWACCESS,
        NAME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PATTRIBUTES = layout.offsetof(2);
        DWACCESS = layout.offsetof(3);
        NAME = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkExportMemoryWin32HandleInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkExportMemoryWin32HandleInfoKHR(ByteBuffer container) {
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
    /** a pointer to a Windows {@code SECURITY_ATTRIBUTES} structure specifying security attributes of the handle. */
    @Nullable
    @NativeType("SECURITY_ATTRIBUTES const *")
    public SECURITY_ATTRIBUTES pAttributes() { return npAttributes(address()); }
    /** a {@code DWORD} specifying access rights of the handle. */
    @NativeType("DWORD")
    public int dwAccess() { return ndwAccess(address()); }
    /** a null-terminated UTF-16 string to associate with the payload referenced by NT handles exported from the created memory. */
    @NativeType("LPCWSTR")
    public ByteBuffer name() { return nname(address()); }
    /** a null-terminated UTF-16 string to associate with the payload referenced by NT handles exported from the created memory. */
    @NativeType("LPCWSTR")
    public String nameString() { return nnameString(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkExportMemoryWin32HandleInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRExternalMemoryWin32#VK_STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_KHR STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_KHR} value to the {@link #sType} field. */
    public VkExportMemoryWin32HandleInfoKHR sType$Default() { return sType(KHRExternalMemoryWin32.VK_STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkExportMemoryWin32HandleInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link SECURITY_ATTRIBUTES} to the {@link #pAttributes} field. */
    public VkExportMemoryWin32HandleInfoKHR pAttributes(@Nullable @NativeType("SECURITY_ATTRIBUTES const *") SECURITY_ATTRIBUTES value) { npAttributes(address(), value); return this; }
    /** Sets the specified value to the {@link #dwAccess} field. */
    public VkExportMemoryWin32HandleInfoKHR dwAccess(@NativeType("DWORD") int value) { ndwAccess(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@link #name} field. */
    public VkExportMemoryWin32HandleInfoKHR name(@NativeType("LPCWSTR") ByteBuffer value) { nname(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkExportMemoryWin32HandleInfoKHR set(
        int sType,
        long pNext,
        @Nullable SECURITY_ATTRIBUTES pAttributes,
        int dwAccess,
        ByteBuffer name
    ) {
        sType(sType);
        pNext(pNext);
        pAttributes(pAttributes);
        dwAccess(dwAccess);
        name(name);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkExportMemoryWin32HandleInfoKHR set(VkExportMemoryWin32HandleInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkExportMemoryWin32HandleInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkExportMemoryWin32HandleInfoKHR malloc() {
        return wrap(VkExportMemoryWin32HandleInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkExportMemoryWin32HandleInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkExportMemoryWin32HandleInfoKHR calloc() {
        return wrap(VkExportMemoryWin32HandleInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkExportMemoryWin32HandleInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkExportMemoryWin32HandleInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkExportMemoryWin32HandleInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkExportMemoryWin32HandleInfoKHR} instance for the specified memory address. */
    public static VkExportMemoryWin32HandleInfoKHR create(long address) {
        return wrap(VkExportMemoryWin32HandleInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExportMemoryWin32HandleInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkExportMemoryWin32HandleInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkExportMemoryWin32HandleInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportMemoryWin32HandleInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkExportMemoryWin32HandleInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportMemoryWin32HandleInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExportMemoryWin32HandleInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportMemoryWin32HandleInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkExportMemoryWin32HandleInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkExportMemoryWin32HandleInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExportMemoryWin32HandleInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkExportMemoryWin32HandleInfoKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkExportMemoryWin32HandleInfoKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkExportMemoryWin32HandleInfoKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkExportMemoryWin32HandleInfoKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExportMemoryWin32HandleInfoKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExportMemoryWin32HandleInfoKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExportMemoryWin32HandleInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExportMemoryWin32HandleInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkExportMemoryWin32HandleInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExportMemoryWin32HandleInfoKHR malloc(MemoryStack stack) {
        return wrap(VkExportMemoryWin32HandleInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkExportMemoryWin32HandleInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExportMemoryWin32HandleInfoKHR calloc(MemoryStack stack) {
        return wrap(VkExportMemoryWin32HandleInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkExportMemoryWin32HandleInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExportMemoryWin32HandleInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExportMemoryWin32HandleInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExportMemoryWin32HandleInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkExportMemoryWin32HandleInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkExportMemoryWin32HandleInfoKHR.PNEXT); }
    /** Unsafe version of {@link #pAttributes}. */
    @Nullable public static SECURITY_ATTRIBUTES npAttributes(long struct) { return SECURITY_ATTRIBUTES.createSafe(memGetAddress(struct + VkExportMemoryWin32HandleInfoKHR.PATTRIBUTES)); }
    /** Unsafe version of {@link #dwAccess}. */
    public static int ndwAccess(long struct) { return UNSAFE.getInt(null, struct + VkExportMemoryWin32HandleInfoKHR.DWACCESS); }
    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBufferNT2(memGetAddress(struct + VkExportMemoryWin32HandleInfoKHR.NAME)); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memUTF16(memGetAddress(struct + VkExportMemoryWin32HandleInfoKHR.NAME)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkExportMemoryWin32HandleInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkExportMemoryWin32HandleInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #pAttributes(SECURITY_ATTRIBUTES) pAttributes}. */
    public static void npAttributes(long struct, @Nullable SECURITY_ATTRIBUTES value) { memPutAddress(struct + VkExportMemoryWin32HandleInfoKHR.PATTRIBUTES, memAddressSafe(value)); }
    /** Unsafe version of {@link #dwAccess(int) dwAccess}. */
    public static void ndwAccess(long struct, int value) { UNSAFE.putInt(null, struct + VkExportMemoryWin32HandleInfoKHR.DWACCESS, value); }
    /** Unsafe version of {@link #name(ByteBuffer) name}. */
    public static void nname(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT2(value); }
        memPutAddress(struct + VkExportMemoryWin32HandleInfoKHR.NAME, memAddress(value));
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long pAttributes = memGetAddress(struct + VkExportMemoryWin32HandleInfoKHR.PATTRIBUTES);
        if (pAttributes != NULL) {
            SECURITY_ATTRIBUTES.validate(pAttributes);
        }
        check(memGetAddress(struct + VkExportMemoryWin32HandleInfoKHR.NAME));
    }

    // -----------------------------------

    /** An array of {@link VkExportMemoryWin32HandleInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkExportMemoryWin32HandleInfoKHR, Buffer> implements NativeResource {

        private static final VkExportMemoryWin32HandleInfoKHR ELEMENT_FACTORY = VkExportMemoryWin32HandleInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkExportMemoryWin32HandleInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkExportMemoryWin32HandleInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkExportMemoryWin32HandleInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkExportMemoryWin32HandleInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkExportMemoryWin32HandleInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkExportMemoryWin32HandleInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkExportMemoryWin32HandleInfoKHR.npNext(address()); }
        /** @return a {@link SECURITY_ATTRIBUTES} view of the struct pointed to by the {@link VkExportMemoryWin32HandleInfoKHR#pAttributes} field. */
        @Nullable
        @NativeType("SECURITY_ATTRIBUTES const *")
        public SECURITY_ATTRIBUTES pAttributes() { return VkExportMemoryWin32HandleInfoKHR.npAttributes(address()); }
        /** @return the value of the {@link VkExportMemoryWin32HandleInfoKHR#dwAccess} field. */
        @NativeType("DWORD")
        public int dwAccess() { return VkExportMemoryWin32HandleInfoKHR.ndwAccess(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@link VkExportMemoryWin32HandleInfoKHR#name} field. */
        @NativeType("LPCWSTR")
        public ByteBuffer name() { return VkExportMemoryWin32HandleInfoKHR.nname(address()); }
        /** @return the null-terminated string pointed to by the {@link VkExportMemoryWin32HandleInfoKHR#name} field. */
        @NativeType("LPCWSTR")
        public String nameString() { return VkExportMemoryWin32HandleInfoKHR.nnameString(address()); }

        /** Sets the specified value to the {@link VkExportMemoryWin32HandleInfoKHR#sType} field. */
        public VkExportMemoryWin32HandleInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkExportMemoryWin32HandleInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRExternalMemoryWin32#VK_STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_KHR STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_KHR} value to the {@link VkExportMemoryWin32HandleInfoKHR#sType} field. */
        public VkExportMemoryWin32HandleInfoKHR.Buffer sType$Default() { return sType(KHRExternalMemoryWin32.VK_STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_KHR); }
        /** Sets the specified value to the {@link VkExportMemoryWin32HandleInfoKHR#pNext} field. */
        public VkExportMemoryWin32HandleInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkExportMemoryWin32HandleInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link SECURITY_ATTRIBUTES} to the {@link VkExportMemoryWin32HandleInfoKHR#pAttributes} field. */
        public VkExportMemoryWin32HandleInfoKHR.Buffer pAttributes(@Nullable @NativeType("SECURITY_ATTRIBUTES const *") SECURITY_ATTRIBUTES value) { VkExportMemoryWin32HandleInfoKHR.npAttributes(address(), value); return this; }
        /** Sets the specified value to the {@link VkExportMemoryWin32HandleInfoKHR#dwAccess} field. */
        public VkExportMemoryWin32HandleInfoKHR.Buffer dwAccess(@NativeType("DWORD") int value) { VkExportMemoryWin32HandleInfoKHR.ndwAccess(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@link VkExportMemoryWin32HandleInfoKHR#name} field. */
        public VkExportMemoryWin32HandleInfoKHR.Buffer name(@NativeType("LPCWSTR") ByteBuffer value) { VkExportMemoryWin32HandleInfoKHR.nname(address(), value); return this; }

    }

}