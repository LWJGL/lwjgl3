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
 * Structure specifying Windows handle to import to a semaphore.
 * 
 * <h5>Description</h5>
 * 
 * <p>The handle types supported by {@code handleType} are:</p>
 * 
 * <h6>Handle Types Supported by {@link VkImportSemaphoreWin32HandleInfoKHR}</h6>
 * 
 * <table class="lwjgl">
 * <thead><tr><th>Handle Type</th><th>Transference</th><th>Permanence Supported</th></tr></thead>
 * <tbody>
 * <tr><td>{@link VK11#VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT}</td><td>Reference</td><td>Temporary,Permanent</td></tr>
 * <tr><td>{@link VK11#VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT}</td><td>Reference</td><td>Temporary,Permanent</td></tr>
 * <tr><td>{@link VK11#VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT}</td><td>Reference</td><td>Temporary,Permanent</td></tr>
 * </tbody>
 * </table>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code handleType} <b>must</b> be a value included in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-semaphore-handletypes-win32">Handle Types Supported by {@link VkImportSemaphoreWin32HandleInfoKHR}</a> table</li>
 * <li>If {@code handleType} is not {@link VK11#VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT} or {@link VK11#VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT}, {@code name} <b>must</b> be {@code NULL}</li>
 * <li>If {@code handle} is {@code NULL}, {@code name} <b>must</b> name a valid synchronization primitive of the type specified by {@code handleType}</li>
 * <li>If {@code name} is {@code NULL}, {@code handle} <b>must</b> be a valid handle of the type specified by {@code handleType}</li>
 * <li>If {@code handle} is not {@code NULL}, {@code name} <b>must</b> be {@code NULL}</li>
 * <li>If {@code handle} is not {@code NULL}, it <b>must</b> obey any requirements listed for {@code handleType} in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#external-semaphore-handle-types-compatibility">external semaphore handle types compatibility</a></li>
 * <li>If {@code name} is not {@code NULL}, it <b>must</b> obey any requirements listed for {@code handleType} in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#external-semaphore-handle-types-compatibility">external semaphore handle types compatibility</a></li>
 * <li>If {@code handleType} is {@link VK11#VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT} or {@link VK11#VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT}, the {@link VkSemaphoreCreateInfo}{@code ::flags} field <b>must</b> match that of the semaphore from which {@code handle} or {@code name} was exported</li>
 * <li>If {@code handleType} is {@link VK11#VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT} or {@link VK11#VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT}, the {@link VkSemaphoreTypeCreateInfo}{@code ::semaphoreType} field <b>must</b> match that of the semaphore from which {@code handle} or {@code name} was exported</li>
 * <li>If {@code flags} contains {@link VK11#VK_SEMAPHORE_IMPORT_TEMPORARY_BIT SEMAPHORE_IMPORT_TEMPORARY_BIT}, the {@link VkSemaphoreTypeCreateInfo}{@code ::semaphoreType} field of the semaphore from which {@code handle} or {@code name} was exported <b>must</b> not be {@link VK12#VK_SEMAPHORE_TYPE_TIMELINE SEMAPHORE_TYPE_TIMELINE}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRExternalSemaphoreWin32#VK_STRUCTURE_TYPE_IMPORT_SEMAPHORE_WIN32_HANDLE_INFO_KHR STRUCTURE_TYPE_IMPORT_SEMAPHORE_WIN32_HANDLE_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code semaphore} <b>must</b> be a valid {@code VkSemaphore} handle</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkSemaphoreImportFlagBits} values</li>
 * </ul>
 * 
 * <h5>Host Synchronization</h5>
 * 
 * <ul>
 * <li>Host access to {@code semaphore} <b>must</b> be externally synchronized</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRExternalSemaphoreWin32#vkImportSemaphoreWin32HandleKHR ImportSemaphoreWin32HandleKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImportSemaphoreWin32HandleInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkSemaphore {@link #semaphore};
 *     VkSemaphoreImportFlags {@link #flags};
 *     VkExternalSemaphoreHandleTypeFlagBits {@link #handleType};
 *     HANDLE {@link #handle};
 *     LPCWSTR {@link #name};
 * }</code></pre>
 */
public class VkImportSemaphoreWin32HandleInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SEMAPHORE,
        FLAGS,
        HANDLETYPE,
        HANDLE,
        NAME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SEMAPHORE = layout.offsetof(2);
        FLAGS = layout.offsetof(3);
        HANDLETYPE = layout.offsetof(4);
        HANDLE = layout.offsetof(5);
        NAME = layout.offsetof(6);
    }

    /**
     * Creates a {@code VkImportSemaphoreWin32HandleInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImportSemaphoreWin32HandleInfoKHR(ByteBuffer container) {
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
    /** the semaphore into which the payload will be imported. */
    @NativeType("VkSemaphore")
    public long semaphore() { return nsemaphore(address()); }
    /** a bitmask of {@code VkSemaphoreImportFlagBits} specifying additional parameters for the semaphore payload import operation. */
    @NativeType("VkSemaphoreImportFlags")
    public int flags() { return nflags(address()); }
    /** specifies the type of {@code handle}. */
    @NativeType("VkExternalSemaphoreHandleTypeFlagBits")
    public int handleType() { return nhandleType(address()); }
    /** the external handle to import, or {@code NULL}. */
    @NativeType("HANDLE")
    public long handle() { return nhandle(address()); }
    /** a null-terminated UTF-16 string naming the underlying synchronization primitive to import, or {@code NULL}. */
    @NativeType("LPCWSTR")
    public ByteBuffer name() { return nname(address()); }
    /** a null-terminated UTF-16 string naming the underlying synchronization primitive to import, or {@code NULL}. */
    @NativeType("LPCWSTR")
    public String nameString() { return nnameString(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkImportSemaphoreWin32HandleInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkImportSemaphoreWin32HandleInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #semaphore} field. */
    public VkImportSemaphoreWin32HandleInfoKHR semaphore(@NativeType("VkSemaphore") long value) { nsemaphore(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkImportSemaphoreWin32HandleInfoKHR flags(@NativeType("VkSemaphoreImportFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #handleType} field. */
    public VkImportSemaphoreWin32HandleInfoKHR handleType(@NativeType("VkExternalSemaphoreHandleTypeFlagBits") int value) { nhandleType(address(), value); return this; }
    /** Sets the specified value to the {@link #handle} field. */
    public VkImportSemaphoreWin32HandleInfoKHR handle(@NativeType("HANDLE") long value) { nhandle(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@link #name} field. */
    public VkImportSemaphoreWin32HandleInfoKHR name(@NativeType("LPCWSTR") ByteBuffer value) { nname(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImportSemaphoreWin32HandleInfoKHR set(
        int sType,
        long pNext,
        long semaphore,
        int flags,
        int handleType,
        long handle,
        ByteBuffer name
    ) {
        sType(sType);
        pNext(pNext);
        semaphore(semaphore);
        flags(flags);
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
    public VkImportSemaphoreWin32HandleInfoKHR set(VkImportSemaphoreWin32HandleInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImportSemaphoreWin32HandleInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImportSemaphoreWin32HandleInfoKHR malloc() {
        return wrap(VkImportSemaphoreWin32HandleInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkImportSemaphoreWin32HandleInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImportSemaphoreWin32HandleInfoKHR calloc() {
        return wrap(VkImportSemaphoreWin32HandleInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkImportSemaphoreWin32HandleInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkImportSemaphoreWin32HandleInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkImportSemaphoreWin32HandleInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkImportSemaphoreWin32HandleInfoKHR} instance for the specified memory address. */
    public static VkImportSemaphoreWin32HandleInfoKHR create(long address) {
        return wrap(VkImportSemaphoreWin32HandleInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImportSemaphoreWin32HandleInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkImportSemaphoreWin32HandleInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkImportSemaphoreWin32HandleInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportSemaphoreWin32HandleInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImportSemaphoreWin32HandleInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportSemaphoreWin32HandleInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImportSemaphoreWin32HandleInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportSemaphoreWin32HandleInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkImportSemaphoreWin32HandleInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImportSemaphoreWin32HandleInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImportSemaphoreWin32HandleInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkImportSemaphoreWin32HandleInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkImportSemaphoreWin32HandleInfoKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkImportSemaphoreWin32HandleInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkImportSemaphoreWin32HandleInfoKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkImportSemaphoreWin32HandleInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImportSemaphoreWin32HandleInfoKHR mallocStack(MemoryStack stack) {
        return wrap(VkImportSemaphoreWin32HandleInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkImportSemaphoreWin32HandleInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImportSemaphoreWin32HandleInfoKHR callocStack(MemoryStack stack) {
        return wrap(VkImportSemaphoreWin32HandleInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkImportSemaphoreWin32HandleInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportSemaphoreWin32HandleInfoKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkImportSemaphoreWin32HandleInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportSemaphoreWin32HandleInfoKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkImportSemaphoreWin32HandleInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImportSemaphoreWin32HandleInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImportSemaphoreWin32HandleInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImportSemaphoreWin32HandleInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkImportSemaphoreWin32HandleInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImportSemaphoreWin32HandleInfoKHR.PNEXT); }
    /** Unsafe version of {@link #semaphore}. */
    public static long nsemaphore(long struct) { return UNSAFE.getLong(null, struct + VkImportSemaphoreWin32HandleInfoKHR.SEMAPHORE); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkImportSemaphoreWin32HandleInfoKHR.FLAGS); }
    /** Unsafe version of {@link #handleType}. */
    public static int nhandleType(long struct) { return UNSAFE.getInt(null, struct + VkImportSemaphoreWin32HandleInfoKHR.HANDLETYPE); }
    /** Unsafe version of {@link #handle}. */
    public static long nhandle(long struct) { return memGetAddress(struct + VkImportSemaphoreWin32HandleInfoKHR.HANDLE); }
    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBufferNT2(memGetAddress(struct + VkImportSemaphoreWin32HandleInfoKHR.NAME)); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memUTF16(memGetAddress(struct + VkImportSemaphoreWin32HandleInfoKHR.NAME)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkImportSemaphoreWin32HandleInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImportSemaphoreWin32HandleInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #semaphore(long) semaphore}. */
    public static void nsemaphore(long struct, long value) { UNSAFE.putLong(null, struct + VkImportSemaphoreWin32HandleInfoKHR.SEMAPHORE, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkImportSemaphoreWin32HandleInfoKHR.FLAGS, value); }
    /** Unsafe version of {@link #handleType(int) handleType}. */
    public static void nhandleType(long struct, int value) { UNSAFE.putInt(null, struct + VkImportSemaphoreWin32HandleInfoKHR.HANDLETYPE, value); }
    /** Unsafe version of {@link #handle(long) handle}. */
    public static void nhandle(long struct, long value) { memPutAddress(struct + VkImportSemaphoreWin32HandleInfoKHR.HANDLE, check(value)); }
    /** Unsafe version of {@link #name(ByteBuffer) name}. */
    public static void nname(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT2(value); }
        memPutAddress(struct + VkImportSemaphoreWin32HandleInfoKHR.NAME, memAddress(value));
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkImportSemaphoreWin32HandleInfoKHR.HANDLE));
        check(memGetAddress(struct + VkImportSemaphoreWin32HandleInfoKHR.NAME));
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

    /** An array of {@link VkImportSemaphoreWin32HandleInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkImportSemaphoreWin32HandleInfoKHR, Buffer> implements NativeResource {

        private static final VkImportSemaphoreWin32HandleInfoKHR ELEMENT_FACTORY = VkImportSemaphoreWin32HandleInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkImportSemaphoreWin32HandleInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImportSemaphoreWin32HandleInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkImportSemaphoreWin32HandleInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkImportSemaphoreWin32HandleInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImportSemaphoreWin32HandleInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkImportSemaphoreWin32HandleInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImportSemaphoreWin32HandleInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkImportSemaphoreWin32HandleInfoKHR#semaphore} field. */
        @NativeType("VkSemaphore")
        public long semaphore() { return VkImportSemaphoreWin32HandleInfoKHR.nsemaphore(address()); }
        /** @return the value of the {@link VkImportSemaphoreWin32HandleInfoKHR#flags} field. */
        @NativeType("VkSemaphoreImportFlags")
        public int flags() { return VkImportSemaphoreWin32HandleInfoKHR.nflags(address()); }
        /** @return the value of the {@link VkImportSemaphoreWin32HandleInfoKHR#handleType} field. */
        @NativeType("VkExternalSemaphoreHandleTypeFlagBits")
        public int handleType() { return VkImportSemaphoreWin32HandleInfoKHR.nhandleType(address()); }
        /** @return the value of the {@link VkImportSemaphoreWin32HandleInfoKHR#handle} field. */
        @NativeType("HANDLE")
        public long handle() { return VkImportSemaphoreWin32HandleInfoKHR.nhandle(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@link VkImportSemaphoreWin32HandleInfoKHR#name} field. */
        @NativeType("LPCWSTR")
        public ByteBuffer name() { return VkImportSemaphoreWin32HandleInfoKHR.nname(address()); }
        /** @return the null-terminated string pointed to by the {@link VkImportSemaphoreWin32HandleInfoKHR#name} field. */
        @NativeType("LPCWSTR")
        public String nameString() { return VkImportSemaphoreWin32HandleInfoKHR.nnameString(address()); }

        /** Sets the specified value to the {@link VkImportSemaphoreWin32HandleInfoKHR#sType} field. */
        public VkImportSemaphoreWin32HandleInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkImportSemaphoreWin32HandleInfoKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@link VkImportSemaphoreWin32HandleInfoKHR#pNext} field. */
        public VkImportSemaphoreWin32HandleInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkImportSemaphoreWin32HandleInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkImportSemaphoreWin32HandleInfoKHR#semaphore} field. */
        public VkImportSemaphoreWin32HandleInfoKHR.Buffer semaphore(@NativeType("VkSemaphore") long value) { VkImportSemaphoreWin32HandleInfoKHR.nsemaphore(address(), value); return this; }
        /** Sets the specified value to the {@link VkImportSemaphoreWin32HandleInfoKHR#flags} field. */
        public VkImportSemaphoreWin32HandleInfoKHR.Buffer flags(@NativeType("VkSemaphoreImportFlags") int value) { VkImportSemaphoreWin32HandleInfoKHR.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkImportSemaphoreWin32HandleInfoKHR#handleType} field. */
        public VkImportSemaphoreWin32HandleInfoKHR.Buffer handleType(@NativeType("VkExternalSemaphoreHandleTypeFlagBits") int value) { VkImportSemaphoreWin32HandleInfoKHR.nhandleType(address(), value); return this; }
        /** Sets the specified value to the {@link VkImportSemaphoreWin32HandleInfoKHR#handle} field. */
        public VkImportSemaphoreWin32HandleInfoKHR.Buffer handle(@NativeType("HANDLE") long value) { VkImportSemaphoreWin32HandleInfoKHR.nhandle(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@link VkImportSemaphoreWin32HandleInfoKHR#name} field. */
        public VkImportSemaphoreWin32HandleInfoKHR.Buffer name(@NativeType("LPCWSTR") ByteBuffer value) { VkImportSemaphoreWin32HandleInfoKHR.nname(address(), value); return this; }

    }

}