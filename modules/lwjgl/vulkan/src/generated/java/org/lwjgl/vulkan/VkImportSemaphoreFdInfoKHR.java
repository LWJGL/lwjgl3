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
 * Structure specifying POSIX file descriptor to import to a semaphore.
 * 
 * <h5>Description</h5>
 * 
 * <p>The handle types supported by {@code handleType} are:</p>
 * 
 * <h6>Handle Types Supported by {@link VkImportSemaphoreFdInfoKHR}</h6>
 * 
 * <table class="lwjgl">
 * <thead><tr><th>Handle Type</th><th>Transference</th><th>Permanence Supported</th></tr></thead>
 * <tbody>
 * <tr><td>{@link VK11#VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT}</td><td>Reference</td><td>Temporary,Permanent</td></tr>
 * <tr><td>{@link VK11#VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT}</td><td>Copy</td><td>Temporary</td></tr>
 * </tbody>
 * </table>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code handleType} <b>must</b> be a value included in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-semaphore-handletypes-fd">Handle Types Supported by {@link VkImportSemaphoreFdInfoKHR}</a> table</li>
 * <li>{@code fd} <b>must</b> obey any requirements listed for {@code handleType} in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#external-semaphore-handle-types-compatibility">external semaphore handle types compatibility</a></li>
 * <li>If {@code handleType} is {@link VK11#VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT}, the {@link VkSemaphoreCreateInfo}{@code ::flags} field <b>must</b> match that of the semaphore from which {@code fd} was exported</li>
 * <li>If {@code handleType} is {@link VK11#VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT}, the {@link VkSemaphoreTypeCreateInfo}{@code ::semaphoreType} field <b>must</b> match that of the semaphore from which {@code fd} was exported</li>
 * <li>If {@code flags} contains {@link VK11#VK_SEMAPHORE_IMPORT_TEMPORARY_BIT SEMAPHORE_IMPORT_TEMPORARY_BIT}, the {@link VkSemaphoreTypeCreateInfo}{@code ::semaphoreType} field of the semaphore from which {@code fd} was exported <b>must</b> not be {@link VK12#VK_SEMAPHORE_TYPE_TIMELINE SEMAPHORE_TYPE_TIMELINE}</li>
 * </ul>
 * 
 * <p>If {@code handleType} is {@link VK11#VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT}, the special value {@code -1} for {@code fd} is treated like a valid sync file descriptor referring to an object that has already signaled. The import operation will succeed and the {@code VkSemaphore} will have a temporarily imported payload as if a valid file descriptor had been provided.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>This special behavior for importing an invalid sync file descriptor allows easier interoperability with other system APIs which use the convention that an invalid sync file descriptor represents work that has already completed and does not need to be waited for. It is consistent with the option for implementations to return a {@code -1} file descriptor when exporting a {@link VK11#VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT} from a {@code VkSemaphore} which is signaled.</p>
 * </div>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRExternalSemaphoreFd#VK_STRUCTURE_TYPE_IMPORT_SEMAPHORE_FD_INFO_KHR STRUCTURE_TYPE_IMPORT_SEMAPHORE_FD_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code semaphore} <b>must</b> be a valid {@code VkSemaphore} handle</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkSemaphoreImportFlagBits} values</li>
 * <li>{@code handleType} <b>must</b> be a valid {@code VkExternalSemaphoreHandleTypeFlagBits} value</li>
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
 * <p>{@link KHRExternalSemaphoreFd#vkImportSemaphoreFdKHR ImportSemaphoreFdKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImportSemaphoreFdInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkSemaphore {@link #semaphore};
 *     VkSemaphoreImportFlags {@link #flags};
 *     VkExternalSemaphoreHandleTypeFlagBits {@link #handleType};
 *     int {@link #fd};
 * }</code></pre>
 */
public class VkImportSemaphoreFdInfoKHR extends Struct implements NativeResource {

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
        FD;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SEMAPHORE = layout.offsetof(2);
        FLAGS = layout.offsetof(3);
        HANDLETYPE = layout.offsetof(4);
        FD = layout.offsetof(5);
    }

    /**
     * Creates a {@code VkImportSemaphoreFdInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImportSemaphoreFdInfoKHR(ByteBuffer container) {
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
    /** a {@code VkExternalSemaphoreHandleTypeFlagBits} value specifying the type of {@code fd}. */
    @NativeType("VkExternalSemaphoreHandleTypeFlagBits")
    public int handleType() { return nhandleType(address()); }
    /** the external handle to import. */
    public int fd() { return nfd(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkImportSemaphoreFdInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRExternalSemaphoreFd#VK_STRUCTURE_TYPE_IMPORT_SEMAPHORE_FD_INFO_KHR STRUCTURE_TYPE_IMPORT_SEMAPHORE_FD_INFO_KHR} value to the {@link #sType} field. */
    public VkImportSemaphoreFdInfoKHR sType$Default() { return sType(KHRExternalSemaphoreFd.VK_STRUCTURE_TYPE_IMPORT_SEMAPHORE_FD_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkImportSemaphoreFdInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #semaphore} field. */
    public VkImportSemaphoreFdInfoKHR semaphore(@NativeType("VkSemaphore") long value) { nsemaphore(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkImportSemaphoreFdInfoKHR flags(@NativeType("VkSemaphoreImportFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #handleType} field. */
    public VkImportSemaphoreFdInfoKHR handleType(@NativeType("VkExternalSemaphoreHandleTypeFlagBits") int value) { nhandleType(address(), value); return this; }
    /** Sets the specified value to the {@link #fd} field. */
    public VkImportSemaphoreFdInfoKHR fd(int value) { nfd(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImportSemaphoreFdInfoKHR set(
        int sType,
        long pNext,
        long semaphore,
        int flags,
        int handleType,
        int fd
    ) {
        sType(sType);
        pNext(pNext);
        semaphore(semaphore);
        flags(flags);
        handleType(handleType);
        fd(fd);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImportSemaphoreFdInfoKHR set(VkImportSemaphoreFdInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImportSemaphoreFdInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImportSemaphoreFdInfoKHR malloc() {
        return wrap(VkImportSemaphoreFdInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkImportSemaphoreFdInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImportSemaphoreFdInfoKHR calloc() {
        return wrap(VkImportSemaphoreFdInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkImportSemaphoreFdInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkImportSemaphoreFdInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkImportSemaphoreFdInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkImportSemaphoreFdInfoKHR} instance for the specified memory address. */
    public static VkImportSemaphoreFdInfoKHR create(long address) {
        return wrap(VkImportSemaphoreFdInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImportSemaphoreFdInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkImportSemaphoreFdInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkImportSemaphoreFdInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportSemaphoreFdInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImportSemaphoreFdInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportSemaphoreFdInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImportSemaphoreFdInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportSemaphoreFdInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkImportSemaphoreFdInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImportSemaphoreFdInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImportSemaphoreFdInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImportSemaphoreFdInfoKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImportSemaphoreFdInfoKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImportSemaphoreFdInfoKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImportSemaphoreFdInfoKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImportSemaphoreFdInfoKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImportSemaphoreFdInfoKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImportSemaphoreFdInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImportSemaphoreFdInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkImportSemaphoreFdInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImportSemaphoreFdInfoKHR malloc(MemoryStack stack) {
        return wrap(VkImportSemaphoreFdInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkImportSemaphoreFdInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImportSemaphoreFdInfoKHR calloc(MemoryStack stack) {
        return wrap(VkImportSemaphoreFdInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkImportSemaphoreFdInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImportSemaphoreFdInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImportSemaphoreFdInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImportSemaphoreFdInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkImportSemaphoreFdInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImportSemaphoreFdInfoKHR.PNEXT); }
    /** Unsafe version of {@link #semaphore}. */
    public static long nsemaphore(long struct) { return UNSAFE.getLong(null, struct + VkImportSemaphoreFdInfoKHR.SEMAPHORE); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkImportSemaphoreFdInfoKHR.FLAGS); }
    /** Unsafe version of {@link #handleType}. */
    public static int nhandleType(long struct) { return UNSAFE.getInt(null, struct + VkImportSemaphoreFdInfoKHR.HANDLETYPE); }
    /** Unsafe version of {@link #fd}. */
    public static int nfd(long struct) { return UNSAFE.getInt(null, struct + VkImportSemaphoreFdInfoKHR.FD); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkImportSemaphoreFdInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImportSemaphoreFdInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #semaphore(long) semaphore}. */
    public static void nsemaphore(long struct, long value) { UNSAFE.putLong(null, struct + VkImportSemaphoreFdInfoKHR.SEMAPHORE, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkImportSemaphoreFdInfoKHR.FLAGS, value); }
    /** Unsafe version of {@link #handleType(int) handleType}. */
    public static void nhandleType(long struct, int value) { UNSAFE.putInt(null, struct + VkImportSemaphoreFdInfoKHR.HANDLETYPE, value); }
    /** Unsafe version of {@link #fd(int) fd}. */
    public static void nfd(long struct, int value) { UNSAFE.putInt(null, struct + VkImportSemaphoreFdInfoKHR.FD, value); }

    // -----------------------------------

    /** An array of {@link VkImportSemaphoreFdInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkImportSemaphoreFdInfoKHR, Buffer> implements NativeResource {

        private static final VkImportSemaphoreFdInfoKHR ELEMENT_FACTORY = VkImportSemaphoreFdInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkImportSemaphoreFdInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImportSemaphoreFdInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkImportSemaphoreFdInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkImportSemaphoreFdInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImportSemaphoreFdInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkImportSemaphoreFdInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImportSemaphoreFdInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkImportSemaphoreFdInfoKHR#semaphore} field. */
        @NativeType("VkSemaphore")
        public long semaphore() { return VkImportSemaphoreFdInfoKHR.nsemaphore(address()); }
        /** @return the value of the {@link VkImportSemaphoreFdInfoKHR#flags} field. */
        @NativeType("VkSemaphoreImportFlags")
        public int flags() { return VkImportSemaphoreFdInfoKHR.nflags(address()); }
        /** @return the value of the {@link VkImportSemaphoreFdInfoKHR#handleType} field. */
        @NativeType("VkExternalSemaphoreHandleTypeFlagBits")
        public int handleType() { return VkImportSemaphoreFdInfoKHR.nhandleType(address()); }
        /** @return the value of the {@link VkImportSemaphoreFdInfoKHR#fd} field. */
        public int fd() { return VkImportSemaphoreFdInfoKHR.nfd(address()); }

        /** Sets the specified value to the {@link VkImportSemaphoreFdInfoKHR#sType} field. */
        public VkImportSemaphoreFdInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkImportSemaphoreFdInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRExternalSemaphoreFd#VK_STRUCTURE_TYPE_IMPORT_SEMAPHORE_FD_INFO_KHR STRUCTURE_TYPE_IMPORT_SEMAPHORE_FD_INFO_KHR} value to the {@link VkImportSemaphoreFdInfoKHR#sType} field. */
        public VkImportSemaphoreFdInfoKHR.Buffer sType$Default() { return sType(KHRExternalSemaphoreFd.VK_STRUCTURE_TYPE_IMPORT_SEMAPHORE_FD_INFO_KHR); }
        /** Sets the specified value to the {@link VkImportSemaphoreFdInfoKHR#pNext} field. */
        public VkImportSemaphoreFdInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkImportSemaphoreFdInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkImportSemaphoreFdInfoKHR#semaphore} field. */
        public VkImportSemaphoreFdInfoKHR.Buffer semaphore(@NativeType("VkSemaphore") long value) { VkImportSemaphoreFdInfoKHR.nsemaphore(address(), value); return this; }
        /** Sets the specified value to the {@link VkImportSemaphoreFdInfoKHR#flags} field. */
        public VkImportSemaphoreFdInfoKHR.Buffer flags(@NativeType("VkSemaphoreImportFlags") int value) { VkImportSemaphoreFdInfoKHR.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkImportSemaphoreFdInfoKHR#handleType} field. */
        public VkImportSemaphoreFdInfoKHR.Buffer handleType(@NativeType("VkExternalSemaphoreHandleTypeFlagBits") int value) { VkImportSemaphoreFdInfoKHR.nhandleType(address(), value); return this; }
        /** Sets the specified value to the {@link VkImportSemaphoreFdInfoKHR#fd} field. */
        public VkImportSemaphoreFdInfoKHR.Buffer fd(int value) { VkImportSemaphoreFdInfoKHR.nfd(address(), value); return this; }

    }

}