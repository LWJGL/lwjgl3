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
 * import memory created on the same physical device from a file descriptor.
 * 
 * <h5>Description</h5>
 * 
 * <p>Importing memory from a file descriptor transfers ownership of the file descriptor from the application to the Vulkan implementation. The application <b>must</b> not perform any operations on the file descriptor after a successful import.</p>
 * 
 * <p>Applications <b>can</b> import the same underlying memory into multiple instances of Vulkan, into the same instance from which it was exported, and multiple times into a given Vulkan instance. In all cases, each import operation <b>must</b> create a distinct {@code VkDeviceMemory} object.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code handleType} is not 0, it <b>must</b> be supported for import, as reported by {@link VkExternalImageFormatProperties} or {@link VkExternalBufferProperties}.</li>
 * <li>The memory from which {@code fd} was exported <b>must</b> have been created on the same underlying physical device as {@code device}.</li>
 * <li>If {@code handleType} is not 0, it <b>must</b> be defined as a POSIX file descriptor handle.</li>
 * <li>If {@code handleType} is not 0, {@code fd} <b>must</b> be a valid handle of the type specified by {@code handleType}.</li>
 * <li>The memory represented by {@code fd} <b>must</b> have been created from a physical device and driver that is compatible with {@code device} and {@code handleType}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#external-memory-handle-types-compatibility">External memory handle types compatibility</a>.</li>
 * <li>{@code fd} <b>must</b> obey any requirements listed for {@code handleType} in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#external-memory-handle-types-compatibility">external memory handle types compatibility</a>.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRExternalMemoryFd#VK_STRUCTURE_TYPE_IMPORT_MEMORY_FD_INFO_KHR STRUCTURE_TYPE_IMPORT_MEMORY_FD_INFO_KHR}</li>
 * <li>If {@code handleType} is not 0, {@code handleType} <b>must</b> be a valid {@code VkExternalMemoryHandleTypeFlagBits} value</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code handleType} &ndash; specifies the handle type of {@code fd}.</li>
 * <li>{@code fd} &ndash; the external handle to import.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImportMemoryFdInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkExternalMemoryHandleTypeFlagBits handleType;
 *     int fd;
 * }</code></pre>
 */
public class VkImportMemoryFdInfoKHR extends Struct implements NativeResource {

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

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code handleType} field. */
    @NativeType("VkExternalMemoryHandleTypeFlagBits")
    public int handleType() { return nhandleType(address()); }
    /** Returns the value of the {@code fd} field. */
    public int fd() { return nfd(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkImportMemoryFdInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkImportMemoryFdInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code handleType} field. */
    public VkImportMemoryFdInfoKHR handleType(@NativeType("VkExternalMemoryHandleTypeFlagBits") int value) { nhandleType(address(), value); return this; }
    /** Sets the specified value to the {@code fd} field. */
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
        return wrap(VkImportMemoryFdInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkImportMemoryFdInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImportMemoryFdInfoKHR calloc() {
        return wrap(VkImportMemoryFdInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkImportMemoryFdInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkImportMemoryFdInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkImportMemoryFdInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkImportMemoryFdInfoKHR} instance for the specified memory address. */
    public static VkImportMemoryFdInfoKHR create(long address) {
        return wrap(VkImportMemoryFdInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImportMemoryFdInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkImportMemoryFdInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkImportMemoryFdInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportMemoryFdInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImportMemoryFdInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportMemoryFdInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImportMemoryFdInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportMemoryFdInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkImportMemoryFdInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImportMemoryFdInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImportMemoryFdInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkImportMemoryFdInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkImportMemoryFdInfoKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkImportMemoryFdInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkImportMemoryFdInfoKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkImportMemoryFdInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImportMemoryFdInfoKHR mallocStack(MemoryStack stack) {
        return wrap(VkImportMemoryFdInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkImportMemoryFdInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImportMemoryFdInfoKHR callocStack(MemoryStack stack) {
        return wrap(VkImportMemoryFdInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkImportMemoryFdInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportMemoryFdInfoKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkImportMemoryFdInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportMemoryFdInfoKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkImportMemoryFdInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImportMemoryFdInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImportMemoryFdInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImportMemoryFdInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkImportMemoryFdInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImportMemoryFdInfoKHR.PNEXT); }
    /** Unsafe version of {@link #handleType}. */
    public static int nhandleType(long struct) { return UNSAFE.getInt(null, struct + VkImportMemoryFdInfoKHR.HANDLETYPE); }
    /** Unsafe version of {@link #fd}. */
    public static int nfd(long struct) { return UNSAFE.getInt(null, struct + VkImportMemoryFdInfoKHR.FD); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkImportMemoryFdInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImportMemoryFdInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #handleType(int) handleType}. */
    public static void nhandleType(long struct, int value) { UNSAFE.putInt(null, struct + VkImportMemoryFdInfoKHR.HANDLETYPE, value); }
    /** Unsafe version of {@link #fd(int) fd}. */
    public static void nfd(long struct, int value) { UNSAFE.putInt(null, struct + VkImportMemoryFdInfoKHR.FD, value); }

    // -----------------------------------

    /** An array of {@link VkImportMemoryFdInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkImportMemoryFdInfoKHR, Buffer> implements NativeResource {

        private static final VkImportMemoryFdInfoKHR ELEMENT_FACTORY = VkImportMemoryFdInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkImportMemoryFdInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImportMemoryFdInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkImportMemoryFdInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImportMemoryFdInfoKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImportMemoryFdInfoKHR.npNext(address()); }
        /** Returns the value of the {@code handleType} field. */
        @NativeType("VkExternalMemoryHandleTypeFlagBits")
        public int handleType() { return VkImportMemoryFdInfoKHR.nhandleType(address()); }
        /** Returns the value of the {@code fd} field. */
        public int fd() { return VkImportMemoryFdInfoKHR.nfd(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkImportMemoryFdInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkImportMemoryFdInfoKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkImportMemoryFdInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkImportMemoryFdInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code handleType} field. */
        public VkImportMemoryFdInfoKHR.Buffer handleType(@NativeType("VkExternalMemoryHandleTypeFlagBits") int value) { VkImportMemoryFdInfoKHR.nhandleType(address(), value); return this; }
        /** Sets the specified value to the {@code fd} field. */
        public VkImportMemoryFdInfoKHR.Buffer fd(int value) { VkImportMemoryFdInfoKHR.nfd(address(), value); return this; }

    }

}