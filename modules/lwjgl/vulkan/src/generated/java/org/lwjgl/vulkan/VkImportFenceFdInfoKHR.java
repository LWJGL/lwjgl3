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
 * (None).
 * 
 * <h5>Description</h5>
 * 
 * <p>The handle types supported by {@code handleType} are:</p>
 * 
 * <h6>Handle Types Supported by {@link VkImportFenceFdInfoKHR}</h6>
 * 
 * <table class="lwjgl">
 * <thead><tr><th>Handle Type</th><th>Transference</th><th>Permanence Supported</th></tr></thead>
 * <tbody>
 * <tr><td>{@link VK11#VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT}</td><td>Reference</td><td>Temporary,Permanent</td></tr>
 * <tr><td>{@link VK11#VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT}</td><td>Copy</td><td>Temporary</td></tr>
 * </tbody>
 * </table>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code handleType} <b>must</b> be a value included in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-fence-handletypes-fd">Handle Types Supported by {@link VkImportFenceFdInfoKHR}</a> table</li>
 * <li>{@code fd} <b>must</b> obey any requirements listed for {@code handleType} in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#external-fence-handle-types-compatibility">external fence handle types compatibility</a></li>
 * </ul>
 * 
 * <p>If {@code handleType} is {@link VK11#VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT}, the special value {@code -1} for {@code fd} is treated like a valid sync file descriptor referring to an object that has already signaled. The import operation will succeed and the {@code VkFence} will have a temporarily imported payload as if a valid file descriptor had been provided.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>This special behavior for importing an invalid sync file descriptor allows easier interoperability with other system APIs which use the convention that an invalid sync file descriptor represents work that has already completed and does not need to be waited for. It is consistent with the option for implementations to return a {@code -1} file descriptor when exporting a {@link VK11#VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT} from a {@code VkFence} which is signaled.</p>
 * </div>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRExternalFenceFd#VK_STRUCTURE_TYPE_IMPORT_FENCE_FD_INFO_KHR STRUCTURE_TYPE_IMPORT_FENCE_FD_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code fence} <b>must</b> be a valid {@code VkFence} handle</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkFenceImportFlagBits} values</li>
 * <li>{@code handleType} <b>must</b> be a valid {@code VkExternalFenceHandleTypeFlagBits} value</li>
 * </ul>
 * 
 * <h5>Host Synchronization</h5>
 * 
 * <ul>
 * <li>Host access to {@code fence} <b>must</b> be externally synchronized</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRExternalFenceFd#vkImportFenceFdKHR ImportFenceFdKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImportFenceFdInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkFence {@link #fence};
 *     VkFenceImportFlags {@link #flags};
 *     VkExternalFenceHandleTypeFlagBits {@link #handleType};
 *     int {@link #fd};
 * }</code></pre>
 */
public class VkImportFenceFdInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FENCE,
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
        FENCE = layout.offsetof(2);
        FLAGS = layout.offsetof(3);
        HANDLETYPE = layout.offsetof(4);
        FD = layout.offsetof(5);
    }

    /**
     * Creates a {@code VkImportFenceFdInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImportFenceFdInfoKHR(ByteBuffer container) {
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
    /** the fence into which the payload will be imported. */
    @NativeType("VkFence")
    public long fence() { return nfence(address()); }
    /** a bitmask of {@code VkFenceImportFlagBits} specifying additional parameters for the fence payload import operation. */
    @NativeType("VkFenceImportFlags")
    public int flags() { return nflags(address()); }
    /** a {@code VkExternalFenceHandleTypeFlagBits} value specifying the type of {@code fd}. */
    @NativeType("VkExternalFenceHandleTypeFlagBits")
    public int handleType() { return nhandleType(address()); }
    /** the external handle to import. */
    public int fd() { return nfd(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkImportFenceFdInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRExternalFenceFd#VK_STRUCTURE_TYPE_IMPORT_FENCE_FD_INFO_KHR STRUCTURE_TYPE_IMPORT_FENCE_FD_INFO_KHR} value to the {@link #sType} field. */
    public VkImportFenceFdInfoKHR sType$Default() { return sType(KHRExternalFenceFd.VK_STRUCTURE_TYPE_IMPORT_FENCE_FD_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkImportFenceFdInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #fence} field. */
    public VkImportFenceFdInfoKHR fence(@NativeType("VkFence") long value) { nfence(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkImportFenceFdInfoKHR flags(@NativeType("VkFenceImportFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #handleType} field. */
    public VkImportFenceFdInfoKHR handleType(@NativeType("VkExternalFenceHandleTypeFlagBits") int value) { nhandleType(address(), value); return this; }
    /** Sets the specified value to the {@link #fd} field. */
    public VkImportFenceFdInfoKHR fd(int value) { nfd(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImportFenceFdInfoKHR set(
        int sType,
        long pNext,
        long fence,
        int flags,
        int handleType,
        int fd
    ) {
        sType(sType);
        pNext(pNext);
        fence(fence);
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
    public VkImportFenceFdInfoKHR set(VkImportFenceFdInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImportFenceFdInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImportFenceFdInfoKHR malloc() {
        return wrap(VkImportFenceFdInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkImportFenceFdInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImportFenceFdInfoKHR calloc() {
        return wrap(VkImportFenceFdInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkImportFenceFdInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkImportFenceFdInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkImportFenceFdInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkImportFenceFdInfoKHR} instance for the specified memory address. */
    public static VkImportFenceFdInfoKHR create(long address) {
        return wrap(VkImportFenceFdInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImportFenceFdInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkImportFenceFdInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkImportFenceFdInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportFenceFdInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImportFenceFdInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportFenceFdInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImportFenceFdInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportFenceFdInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkImportFenceFdInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImportFenceFdInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImportFenceFdInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImportFenceFdInfoKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImportFenceFdInfoKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImportFenceFdInfoKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImportFenceFdInfoKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImportFenceFdInfoKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImportFenceFdInfoKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImportFenceFdInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImportFenceFdInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkImportFenceFdInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImportFenceFdInfoKHR malloc(MemoryStack stack) {
        return wrap(VkImportFenceFdInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkImportFenceFdInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImportFenceFdInfoKHR calloc(MemoryStack stack) {
        return wrap(VkImportFenceFdInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkImportFenceFdInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImportFenceFdInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImportFenceFdInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImportFenceFdInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkImportFenceFdInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImportFenceFdInfoKHR.PNEXT); }
    /** Unsafe version of {@link #fence}. */
    public static long nfence(long struct) { return UNSAFE.getLong(null, struct + VkImportFenceFdInfoKHR.FENCE); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkImportFenceFdInfoKHR.FLAGS); }
    /** Unsafe version of {@link #handleType}. */
    public static int nhandleType(long struct) { return UNSAFE.getInt(null, struct + VkImportFenceFdInfoKHR.HANDLETYPE); }
    /** Unsafe version of {@link #fd}. */
    public static int nfd(long struct) { return UNSAFE.getInt(null, struct + VkImportFenceFdInfoKHR.FD); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkImportFenceFdInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImportFenceFdInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #fence(long) fence}. */
    public static void nfence(long struct, long value) { UNSAFE.putLong(null, struct + VkImportFenceFdInfoKHR.FENCE, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkImportFenceFdInfoKHR.FLAGS, value); }
    /** Unsafe version of {@link #handleType(int) handleType}. */
    public static void nhandleType(long struct, int value) { UNSAFE.putInt(null, struct + VkImportFenceFdInfoKHR.HANDLETYPE, value); }
    /** Unsafe version of {@link #fd(int) fd}. */
    public static void nfd(long struct, int value) { UNSAFE.putInt(null, struct + VkImportFenceFdInfoKHR.FD, value); }

    // -----------------------------------

    /** An array of {@link VkImportFenceFdInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkImportFenceFdInfoKHR, Buffer> implements NativeResource {

        private static final VkImportFenceFdInfoKHR ELEMENT_FACTORY = VkImportFenceFdInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkImportFenceFdInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImportFenceFdInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkImportFenceFdInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkImportFenceFdInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImportFenceFdInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkImportFenceFdInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImportFenceFdInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkImportFenceFdInfoKHR#fence} field. */
        @NativeType("VkFence")
        public long fence() { return VkImportFenceFdInfoKHR.nfence(address()); }
        /** @return the value of the {@link VkImportFenceFdInfoKHR#flags} field. */
        @NativeType("VkFenceImportFlags")
        public int flags() { return VkImportFenceFdInfoKHR.nflags(address()); }
        /** @return the value of the {@link VkImportFenceFdInfoKHR#handleType} field. */
        @NativeType("VkExternalFenceHandleTypeFlagBits")
        public int handleType() { return VkImportFenceFdInfoKHR.nhandleType(address()); }
        /** @return the value of the {@link VkImportFenceFdInfoKHR#fd} field. */
        public int fd() { return VkImportFenceFdInfoKHR.nfd(address()); }

        /** Sets the specified value to the {@link VkImportFenceFdInfoKHR#sType} field. */
        public VkImportFenceFdInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkImportFenceFdInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRExternalFenceFd#VK_STRUCTURE_TYPE_IMPORT_FENCE_FD_INFO_KHR STRUCTURE_TYPE_IMPORT_FENCE_FD_INFO_KHR} value to the {@link VkImportFenceFdInfoKHR#sType} field. */
        public VkImportFenceFdInfoKHR.Buffer sType$Default() { return sType(KHRExternalFenceFd.VK_STRUCTURE_TYPE_IMPORT_FENCE_FD_INFO_KHR); }
        /** Sets the specified value to the {@link VkImportFenceFdInfoKHR#pNext} field. */
        public VkImportFenceFdInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkImportFenceFdInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkImportFenceFdInfoKHR#fence} field. */
        public VkImportFenceFdInfoKHR.Buffer fence(@NativeType("VkFence") long value) { VkImportFenceFdInfoKHR.nfence(address(), value); return this; }
        /** Sets the specified value to the {@link VkImportFenceFdInfoKHR#flags} field. */
        public VkImportFenceFdInfoKHR.Buffer flags(@NativeType("VkFenceImportFlags") int value) { VkImportFenceFdInfoKHR.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkImportFenceFdInfoKHR#handleType} field. */
        public VkImportFenceFdInfoKHR.Buffer handleType(@NativeType("VkExternalFenceHandleTypeFlagBits") int value) { VkImportFenceFdInfoKHR.nhandleType(address(), value); return this; }
        /** Sets the specified value to the {@link VkImportFenceFdInfoKHR#fd} field. */
        public VkImportFenceFdInfoKHR.Buffer fd(int value) { VkImportFenceFdInfoKHR.nfd(address(), value); return this; }

    }

}