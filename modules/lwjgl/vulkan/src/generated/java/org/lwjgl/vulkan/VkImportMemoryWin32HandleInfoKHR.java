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
 * <p>Importing memory object payloads from Windows handles does not transfer ownership of the handle to the Vulkan implementation. For handle types defined as NT handles, the application <b>must</b> release handle ownership using the {@code CloseHandle} system call when the handle is no longer needed. For handle types defined as NT handles, the imported memory object holds a reference to its payload.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Non-NT handle import operations do not add a reference to their associated payload. If the original object owning the payload is destroyed, all resources and handles sharing that payload will become invalid.</p>
 * </div>
 * 
 * <p>Applications <b>can</b> import the same payload into multiple instances of Vulkan, into the same instance from which it was exported, and multiple times into a given Vulkan instance. In all cases, each import operation <b>must</b> create a distinct {@code VkDeviceMemory} object.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code handleType} is not 0, it <b>must</b> be supported for import, as reported by {@link VkExternalImageFormatProperties} or {@link VkExternalBufferProperties}</li>
 * <li>The memory from which {@code handle} was exported, or the memory named by {@code name} <b>must</b> have been created on the same underlying physical device as {@code device}</li>
 * <li>If {@code handleType} is not 0, it <b>must</b> be defined as an NT handle or a global share handle</li>
 * <li>If {@code handleType} is not {@link VK11#VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT}, {@link VK11#VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT}, {@link VK11#VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT}, or {@link VK11#VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT}, {@code name} <b>must</b> be {@code NULL}</li>
 * <li>If {@code handleType} is not 0 and {@code handle} is {@code NULL}, {@code name} <b>must</b> name a valid memory resource of the type specified by {@code handleType}</li>
 * <li>If {@code handleType} is not 0 and {@code name} is {@code NULL}, {@code handle} <b>must</b> be a valid handle of the type specified by {@code handleType}</li>
 * <li>if {@code handle} is not {@code NULL}, {@code name} <b>must</b> be {@code NULL}</li>
 * <li>If {@code handle} is not {@code NULL}, it <b>must</b> obey any requirements listed for {@code handleType} in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#external-memory-handle-types-compatibility">external memory handle types compatibility</a></li>
 * <li>If {@code name} is not {@code NULL}, it <b>must</b> obey any requirements listed for {@code handleType} in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#external-memory-handle-types-compatibility">external memory handle types compatibility</a></li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRExternalMemoryWin32#VK_STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_KHR STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_KHR}</li>
 * <li>If {@code handleType} is not 0, {@code handleType} <b>must</b> be a valid {@code VkExternalMemoryHandleTypeFlagBits} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImportMemoryWin32HandleInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkExternalMemoryHandleTypeFlagBits {@link #handleType};
 *     HANDLE {@link #handle};
 *     LPCWSTR {@link #name};
 * }</code></pre>
 */
public class VkImportMemoryWin32HandleInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        HANDLETYPE,
        HANDLE,
        NAME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        HANDLETYPE = layout.offsetof(2);
        HANDLE = layout.offsetof(3);
        NAME = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkImportMemoryWin32HandleInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImportMemoryWin32HandleInfoKHR(ByteBuffer container) {
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
    /** a {@code VkExternalMemoryHandleTypeFlagBits} value specifying the type of {@code handle} or {@code name}. */
    @NativeType("VkExternalMemoryHandleTypeFlagBits")
    public int handleType() { return nhandleType(address()); }
    /** {@code NULL} or the external handle to import. */
    @NativeType("HANDLE")
    public long handle() { return nhandle(address()); }
    /** {@code NULL} or a null-terminated UTF-16 string naming the payload to import. */
    @NativeType("LPCWSTR")
    public ByteBuffer name() { return nname(address()); }
    /** {@code NULL} or a null-terminated UTF-16 string naming the payload to import. */
    @NativeType("LPCWSTR")
    public String nameString() { return nnameString(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkImportMemoryWin32HandleInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRExternalMemoryWin32#VK_STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_KHR STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_KHR} value to the {@link #sType} field. */
    public VkImportMemoryWin32HandleInfoKHR sType$Default() { return sType(KHRExternalMemoryWin32.VK_STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkImportMemoryWin32HandleInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #handleType} field. */
    public VkImportMemoryWin32HandleInfoKHR handleType(@NativeType("VkExternalMemoryHandleTypeFlagBits") int value) { nhandleType(address(), value); return this; }
    /** Sets the specified value to the {@link #handle} field. */
    public VkImportMemoryWin32HandleInfoKHR handle(@NativeType("HANDLE") long value) { nhandle(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@link #name} field. */
    public VkImportMemoryWin32HandleInfoKHR name(@NativeType("LPCWSTR") ByteBuffer value) { nname(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImportMemoryWin32HandleInfoKHR set(
        int sType,
        long pNext,
        int handleType,
        long handle,
        ByteBuffer name
    ) {
        sType(sType);
        pNext(pNext);
        handleType(handleType);
        handle(handle);
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
    public VkImportMemoryWin32HandleInfoKHR set(VkImportMemoryWin32HandleInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImportMemoryWin32HandleInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImportMemoryWin32HandleInfoKHR malloc() {
        return wrap(VkImportMemoryWin32HandleInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkImportMemoryWin32HandleInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImportMemoryWin32HandleInfoKHR calloc() {
        return wrap(VkImportMemoryWin32HandleInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkImportMemoryWin32HandleInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkImportMemoryWin32HandleInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkImportMemoryWin32HandleInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkImportMemoryWin32HandleInfoKHR} instance for the specified memory address. */
    public static VkImportMemoryWin32HandleInfoKHR create(long address) {
        return wrap(VkImportMemoryWin32HandleInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImportMemoryWin32HandleInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkImportMemoryWin32HandleInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkImportMemoryWin32HandleInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportMemoryWin32HandleInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImportMemoryWin32HandleInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportMemoryWin32HandleInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImportMemoryWin32HandleInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportMemoryWin32HandleInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkImportMemoryWin32HandleInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImportMemoryWin32HandleInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImportMemoryWin32HandleInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImportMemoryWin32HandleInfoKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImportMemoryWin32HandleInfoKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImportMemoryWin32HandleInfoKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImportMemoryWin32HandleInfoKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImportMemoryWin32HandleInfoKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImportMemoryWin32HandleInfoKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImportMemoryWin32HandleInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImportMemoryWin32HandleInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkImportMemoryWin32HandleInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImportMemoryWin32HandleInfoKHR malloc(MemoryStack stack) {
        return wrap(VkImportMemoryWin32HandleInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkImportMemoryWin32HandleInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImportMemoryWin32HandleInfoKHR calloc(MemoryStack stack) {
        return wrap(VkImportMemoryWin32HandleInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkImportMemoryWin32HandleInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImportMemoryWin32HandleInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImportMemoryWin32HandleInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImportMemoryWin32HandleInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkImportMemoryWin32HandleInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImportMemoryWin32HandleInfoKHR.PNEXT); }
    /** Unsafe version of {@link #handleType}. */
    public static int nhandleType(long struct) { return UNSAFE.getInt(null, struct + VkImportMemoryWin32HandleInfoKHR.HANDLETYPE); }
    /** Unsafe version of {@link #handle}. */
    public static long nhandle(long struct) { return memGetAddress(struct + VkImportMemoryWin32HandleInfoKHR.HANDLE); }
    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBufferNT2(memGetAddress(struct + VkImportMemoryWin32HandleInfoKHR.NAME)); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memUTF16(memGetAddress(struct + VkImportMemoryWin32HandleInfoKHR.NAME)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkImportMemoryWin32HandleInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImportMemoryWin32HandleInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #handleType(int) handleType}. */
    public static void nhandleType(long struct, int value) { UNSAFE.putInt(null, struct + VkImportMemoryWin32HandleInfoKHR.HANDLETYPE, value); }
    /** Unsafe version of {@link #handle(long) handle}. */
    public static void nhandle(long struct, long value) { memPutAddress(struct + VkImportMemoryWin32HandleInfoKHR.HANDLE, check(value)); }
    /** Unsafe version of {@link #name(ByteBuffer) name}. */
    public static void nname(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT2(value); }
        memPutAddress(struct + VkImportMemoryWin32HandleInfoKHR.NAME, memAddress(value));
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkImportMemoryWin32HandleInfoKHR.HANDLE));
        check(memGetAddress(struct + VkImportMemoryWin32HandleInfoKHR.NAME));
    }

    // -----------------------------------

    /** An array of {@link VkImportMemoryWin32HandleInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkImportMemoryWin32HandleInfoKHR, Buffer> implements NativeResource {

        private static final VkImportMemoryWin32HandleInfoKHR ELEMENT_FACTORY = VkImportMemoryWin32HandleInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkImportMemoryWin32HandleInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImportMemoryWin32HandleInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkImportMemoryWin32HandleInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkImportMemoryWin32HandleInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImportMemoryWin32HandleInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkImportMemoryWin32HandleInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImportMemoryWin32HandleInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkImportMemoryWin32HandleInfoKHR#handleType} field. */
        @NativeType("VkExternalMemoryHandleTypeFlagBits")
        public int handleType() { return VkImportMemoryWin32HandleInfoKHR.nhandleType(address()); }
        /** @return the value of the {@link VkImportMemoryWin32HandleInfoKHR#handle} field. */
        @NativeType("HANDLE")
        public long handle() { return VkImportMemoryWin32HandleInfoKHR.nhandle(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@link VkImportMemoryWin32HandleInfoKHR#name} field. */
        @NativeType("LPCWSTR")
        public ByteBuffer name() { return VkImportMemoryWin32HandleInfoKHR.nname(address()); }
        /** @return the null-terminated string pointed to by the {@link VkImportMemoryWin32HandleInfoKHR#name} field. */
        @NativeType("LPCWSTR")
        public String nameString() { return VkImportMemoryWin32HandleInfoKHR.nnameString(address()); }

        /** Sets the specified value to the {@link VkImportMemoryWin32HandleInfoKHR#sType} field. */
        public VkImportMemoryWin32HandleInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkImportMemoryWin32HandleInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRExternalMemoryWin32#VK_STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_KHR STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_KHR} value to the {@link VkImportMemoryWin32HandleInfoKHR#sType} field. */
        public VkImportMemoryWin32HandleInfoKHR.Buffer sType$Default() { return sType(KHRExternalMemoryWin32.VK_STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_KHR); }
        /** Sets the specified value to the {@link VkImportMemoryWin32HandleInfoKHR#pNext} field. */
        public VkImportMemoryWin32HandleInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkImportMemoryWin32HandleInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkImportMemoryWin32HandleInfoKHR#handleType} field. */
        public VkImportMemoryWin32HandleInfoKHR.Buffer handleType(@NativeType("VkExternalMemoryHandleTypeFlagBits") int value) { VkImportMemoryWin32HandleInfoKHR.nhandleType(address(), value); return this; }
        /** Sets the specified value to the {@link VkImportMemoryWin32HandleInfoKHR#handle} field. */
        public VkImportMemoryWin32HandleInfoKHR.Buffer handle(@NativeType("HANDLE") long value) { VkImportMemoryWin32HandleInfoKHR.nhandle(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@link VkImportMemoryWin32HandleInfoKHR#name} field. */
        public VkImportMemoryWin32HandleInfoKHR.Buffer name(@NativeType("LPCWSTR") ByteBuffer value) { VkImportMemoryWin32HandleInfoKHR.nname(address(), value); return this; }

    }

}