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

/**
 * Import memory created on the same physical device from a file descriptor.
 * 
 * <h5>Description</h5>
 * 
 * <p>Importing memory from a file descriptor transfers ownership of the file descriptor from the application to the Vulkan implementation. The application <b>must</b> not perform any operations on the file descriptor after a successful import. The imported memory object holds a reference to its payload.</p>
 * 
 * <p>Applications <b>can</b> import the same payload into multiple instances of Vulkan, into the same instance from which it was exported, and multiple times into a given Vulkan instance. In all cases, each import operation <b>must</b> create a distinct {@code VkDeviceMemory} object.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code handleType} is not 0, it <b>must</b> be supported for import, as reported by {@link VkExternalImageFormatProperties} or {@link VkExternalBufferProperties}</li>
 * <li>The memory from which {@code fd} was exported <b>must</b> have been created on the same underlying physical device as {@code device}</li>
 * <li>If {@code handleType} is not 0, it <b>must</b> be {@link VK11#VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT} or {@link EXTExternalMemoryDmaBuf#VK_EXTERNAL_MEMORY_HANDLE_TYPE_DMA_BUF_BIT_EXT EXTERNAL_MEMORY_HANDLE_TYPE_DMA_BUF_BIT_EXT}</li>
 * <li>If {@code handleType} is not 0, {@code fd} <b>must</b> be a valid handle of the type specified by {@code handleType}</li>
 * <li>The memory represented by {@code fd} <b>must</b> have been created from a physical device and driver that is compatible with {@code device} and {@code handleType}, as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#external-memory-handle-types-compatibility">External memory handle types compatibility</a></li>
 * <li>{@code fd} <b>must</b> obey any requirements listed for {@code handleType} in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#external-memory-handle-types-compatibility">external memory handle types compatibility</a></li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRExternalMemoryFd#VK_STRUCTURE_TYPE_IMPORT_MEMORY_FD_INFO_KHR STRUCTURE_TYPE_IMPORT_MEMORY_FD_INFO_KHR}</li>
 * <li>If {@code handleType} is not 0, {@code handleType} <b>must</b> be a valid {@code VkExternalMemoryHandleTypeFlagBits} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImportMemoryFdInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkExternalMemoryHandleTypeFlagBits {@link #handleType};
 *     int {@link #fd};
 * }</code></pre>
 */
public class VkImportMemoryFdInfoKHR extends Struct<VkImportMemoryFdInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        HANDLETYPE,
        FD;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        HANDLETYPE = layout.offsetof(2);
        FD = layout.offsetof(3);
    }

    protected VkImportMemoryFdInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkImportMemoryFdInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkImportMemoryFdInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkImportMemoryFdInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImportMemoryFdInfoKHR(ByteBuffer container) {
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
    /** a {@code VkExternalMemoryHandleTypeFlagBits} value specifying the handle type of {@code fd}. */
    @NativeType("VkExternalMemoryHandleTypeFlagBits")
    public int handleType() { return nhandleType(address()); }
    /** the external handle to import. */
    public int fd() { return nfd(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkImportMemoryFdInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRExternalMemoryFd#VK_STRUCTURE_TYPE_IMPORT_MEMORY_FD_INFO_KHR STRUCTURE_TYPE_IMPORT_MEMORY_FD_INFO_KHR} value to the {@link #sType} field. */
    public VkImportMemoryFdInfoKHR sType$Default() { return sType(KHRExternalMemoryFd.VK_STRUCTURE_TYPE_IMPORT_MEMORY_FD_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkImportMemoryFdInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #handleType} field. */
    public VkImportMemoryFdInfoKHR handleType(@NativeType("VkExternalMemoryHandleTypeFlagBits") int value) { nhandleType(address(), value); return this; }
    /** Sets the specified value to the {@link #fd} field. */
    public VkImportMemoryFdInfoKHR fd(int value) { nfd(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImportMemoryFdInfoKHR set(
        int sType,
        long pNext,
        int handleType,
        int fd
    ) {
        sType(sType);
        pNext(pNext);
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
    public VkImportMemoryFdInfoKHR set(VkImportMemoryFdInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImportMemoryFdInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImportMemoryFdInfoKHR malloc() {
        return new VkImportMemoryFdInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkImportMemoryFdInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImportMemoryFdInfoKHR calloc() {
        return new VkImportMemoryFdInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkImportMemoryFdInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkImportMemoryFdInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImportMemoryFdInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkImportMemoryFdInfoKHR} instance for the specified memory address. */
    public static VkImportMemoryFdInfoKHR create(long address) {
        return new VkImportMemoryFdInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkImportMemoryFdInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkImportMemoryFdInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkImportMemoryFdInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportMemoryFdInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImportMemoryFdInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportMemoryFdInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImportMemoryFdInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportMemoryFdInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkImportMemoryFdInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImportMemoryFdInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkImportMemoryFdInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImportMemoryFdInfoKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImportMemoryFdInfoKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImportMemoryFdInfoKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImportMemoryFdInfoKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImportMemoryFdInfoKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImportMemoryFdInfoKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImportMemoryFdInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImportMemoryFdInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkImportMemoryFdInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImportMemoryFdInfoKHR malloc(MemoryStack stack) {
        return new VkImportMemoryFdInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkImportMemoryFdInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImportMemoryFdInfoKHR calloc(MemoryStack stack) {
        return new VkImportMemoryFdInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkImportMemoryFdInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImportMemoryFdInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImportMemoryFdInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImportMemoryFdInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkImportMemoryFdInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImportMemoryFdInfoKHR.PNEXT); }
    /** Unsafe version of {@link #handleType}. */
    public static int nhandleType(long struct) { return memGetInt(struct + VkImportMemoryFdInfoKHR.HANDLETYPE); }
    /** Unsafe version of {@link #fd}. */
    public static int nfd(long struct) { return memGetInt(struct + VkImportMemoryFdInfoKHR.FD); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkImportMemoryFdInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImportMemoryFdInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #handleType(int) handleType}. */
    public static void nhandleType(long struct, int value) { memPutInt(struct + VkImportMemoryFdInfoKHR.HANDLETYPE, value); }
    /** Unsafe version of {@link #fd(int) fd}. */
    public static void nfd(long struct, int value) { memPutInt(struct + VkImportMemoryFdInfoKHR.FD, value); }

    // -----------------------------------

    /** An array of {@link VkImportMemoryFdInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkImportMemoryFdInfoKHR, Buffer> implements NativeResource {

        private static final VkImportMemoryFdInfoKHR ELEMENT_FACTORY = VkImportMemoryFdInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkImportMemoryFdInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImportMemoryFdInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkImportMemoryFdInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkImportMemoryFdInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImportMemoryFdInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkImportMemoryFdInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImportMemoryFdInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkImportMemoryFdInfoKHR#handleType} field. */
        @NativeType("VkExternalMemoryHandleTypeFlagBits")
        public int handleType() { return VkImportMemoryFdInfoKHR.nhandleType(address()); }
        /** @return the value of the {@link VkImportMemoryFdInfoKHR#fd} field. */
        public int fd() { return VkImportMemoryFdInfoKHR.nfd(address()); }

        /** Sets the specified value to the {@link VkImportMemoryFdInfoKHR#sType} field. */
        public VkImportMemoryFdInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkImportMemoryFdInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRExternalMemoryFd#VK_STRUCTURE_TYPE_IMPORT_MEMORY_FD_INFO_KHR STRUCTURE_TYPE_IMPORT_MEMORY_FD_INFO_KHR} value to the {@link VkImportMemoryFdInfoKHR#sType} field. */
        public VkImportMemoryFdInfoKHR.Buffer sType$Default() { return sType(KHRExternalMemoryFd.VK_STRUCTURE_TYPE_IMPORT_MEMORY_FD_INFO_KHR); }
        /** Sets the specified value to the {@link VkImportMemoryFdInfoKHR#pNext} field. */
        public VkImportMemoryFdInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkImportMemoryFdInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkImportMemoryFdInfoKHR#handleType} field. */
        public VkImportMemoryFdInfoKHR.Buffer handleType(@NativeType("VkExternalMemoryHandleTypeFlagBits") int value) { VkImportMemoryFdInfoKHR.nhandleType(address(), value); return this; }
        /** Sets the specified value to the {@link VkImportMemoryFdInfoKHR#fd} field. */
        public VkImportMemoryFdInfoKHR.Buffer fd(int value) { VkImportMemoryFdInfoKHR.nfd(address(), value); return this; }

    }

}