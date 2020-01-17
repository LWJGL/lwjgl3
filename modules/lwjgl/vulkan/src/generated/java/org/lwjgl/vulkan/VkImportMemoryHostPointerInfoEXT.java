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
 * import memory from a host pointer.
 * 
 * <h5>Description</h5>
 * 
 * <p>Importing memory from a host pointer shares ownership of the memory between the host and the Vulkan implementation. The application <b>can</b> continue to access the memory through the host pointer but it is the application's responsibility to synchronize device and non-device access to the underlying memory as defined in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#memory-device-hostaccess">Host Access to Device Memory Objects</a>.</p>
 * 
 * <p>Applications <b>can</b> import the same underlying memory into multiple instances of Vulkan and multiple times into a given Vulkan instance. However, implementations <b>may</b> fail to import the same underlying memory multiple times into a given physical device due to platform constraints.</p>
 * 
 * <p>Importing memory from a particular host pointer <b>may</b> not be possible due to additional platform-specific restrictions beyond the scope of this specification in which case the implementation <b>must</b> fail the memory import operation with the error code {@link KHRExternalMemory#VK_ERROR_INVALID_EXTERNAL_HANDLE_KHR ERROR_INVALID_EXTERNAL_HANDLE_KHR}.</p>
 * 
 * <p>The application <b>must</b> ensure that the imported memory range remains valid and accessible for the lifetime of the imported memory object.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code handleType} is not 0, it <b>must</b> be supported for import, as reported in {@link VkExternalMemoryProperties}</li>
 * <li>If {@code handleType} is not 0, it <b>must</b> be {@link EXTExternalMemoryHost#VK_EXTERNAL_MEMORY_HANDLE_TYPE_HOST_ALLOCATION_BIT_EXT EXTERNAL_MEMORY_HANDLE_TYPE_HOST_ALLOCATION_BIT_EXT} or {@link EXTExternalMemoryHost#VK_EXTERNAL_MEMORY_HANDLE_TYPE_HOST_MAPPED_FOREIGN_MEMORY_BIT_EXT EXTERNAL_MEMORY_HANDLE_TYPE_HOST_MAPPED_FOREIGN_MEMORY_BIT_EXT}</li>
 * <li>{@code pHostPointer} <b>must</b> be a pointer aligned to an integer multiple of {@link VkPhysicalDeviceExternalMemoryHostPropertiesEXT}{@code ::minImportedHostPointerAlignment}</li>
 * <li>If {@code handleType} is {@link EXTExternalMemoryHost#VK_EXTERNAL_MEMORY_HANDLE_TYPE_HOST_ALLOCATION_BIT_EXT EXTERNAL_MEMORY_HANDLE_TYPE_HOST_ALLOCATION_BIT_EXT}, {@code pHostPointer} <b>must</b> be a pointer to {@code allocationSize} number of bytes of host memory, where {@code allocationSize} is the member of the {@link VkMemoryAllocateInfo} structure this structure is chained to</li>
 * <li>If {@code handleType} is {@link EXTExternalMemoryHost#VK_EXTERNAL_MEMORY_HANDLE_TYPE_HOST_MAPPED_FOREIGN_MEMORY_BIT_EXT EXTERNAL_MEMORY_HANDLE_TYPE_HOST_MAPPED_FOREIGN_MEMORY_BIT_EXT}, {@code pHostPointer} <b>must</b> be a pointer to {@code allocationSize} number of bytes of host mapped foreign memory, where {@code allocationSize} is the member of the {@link VkMemoryAllocateInfo} structure this structure is chained to</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTExternalMemoryHost#VK_STRUCTURE_TYPE_IMPORT_MEMORY_HOST_POINTER_INFO_EXT STRUCTURE_TYPE_IMPORT_MEMORY_HOST_POINTER_INFO_EXT}</li>
 * <li>{@code handleType} <b>must</b> be a valid {@code VkExternalMemoryHandleTypeFlagBits} value</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code handleType} &ndash; specifies the handle type.</li>
 * <li>{@code pHostPointer} &ndash; the host pointer to import from.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImportMemoryHostPointerInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkExternalMemoryHandleTypeFlagBits handleType;
 *     void * pHostPointer;
 * }</code></pre>
 */
public class VkImportMemoryHostPointerInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        HANDLETYPE,
        PHOSTPOINTER;

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
        PHOSTPOINTER = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkImportMemoryHostPointerInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImportMemoryHostPointerInfoEXT(ByteBuffer container) {
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
    /** Returns the value of the {@code pHostPointer} field. */
    @NativeType("void *")
    public long pHostPointer() { return npHostPointer(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkImportMemoryHostPointerInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkImportMemoryHostPointerInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code handleType} field. */
    public VkImportMemoryHostPointerInfoEXT handleType(@NativeType("VkExternalMemoryHandleTypeFlagBits") int value) { nhandleType(address(), value); return this; }
    /** Sets the specified value to the {@code pHostPointer} field. */
    public VkImportMemoryHostPointerInfoEXT pHostPointer(@NativeType("void *") long value) { npHostPointer(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImportMemoryHostPointerInfoEXT set(
        int sType,
        long pNext,
        int handleType,
        long pHostPointer
    ) {
        sType(sType);
        pNext(pNext);
        handleType(handleType);
        pHostPointer(pHostPointer);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImportMemoryHostPointerInfoEXT set(VkImportMemoryHostPointerInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImportMemoryHostPointerInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImportMemoryHostPointerInfoEXT malloc() {
        return wrap(VkImportMemoryHostPointerInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkImportMemoryHostPointerInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImportMemoryHostPointerInfoEXT calloc() {
        return wrap(VkImportMemoryHostPointerInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkImportMemoryHostPointerInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkImportMemoryHostPointerInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkImportMemoryHostPointerInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkImportMemoryHostPointerInfoEXT} instance for the specified memory address. */
    public static VkImportMemoryHostPointerInfoEXT create(long address) {
        return wrap(VkImportMemoryHostPointerInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImportMemoryHostPointerInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkImportMemoryHostPointerInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkImportMemoryHostPointerInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportMemoryHostPointerInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImportMemoryHostPointerInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportMemoryHostPointerInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImportMemoryHostPointerInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportMemoryHostPointerInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkImportMemoryHostPointerInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImportMemoryHostPointerInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImportMemoryHostPointerInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkImportMemoryHostPointerInfoEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkImportMemoryHostPointerInfoEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkImportMemoryHostPointerInfoEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkImportMemoryHostPointerInfoEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkImportMemoryHostPointerInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImportMemoryHostPointerInfoEXT mallocStack(MemoryStack stack) {
        return wrap(VkImportMemoryHostPointerInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkImportMemoryHostPointerInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImportMemoryHostPointerInfoEXT callocStack(MemoryStack stack) {
        return wrap(VkImportMemoryHostPointerInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkImportMemoryHostPointerInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportMemoryHostPointerInfoEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkImportMemoryHostPointerInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportMemoryHostPointerInfoEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkImportMemoryHostPointerInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImportMemoryHostPointerInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImportMemoryHostPointerInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImportMemoryHostPointerInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkImportMemoryHostPointerInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImportMemoryHostPointerInfoEXT.PNEXT); }
    /** Unsafe version of {@link #handleType}. */
    public static int nhandleType(long struct) { return UNSAFE.getInt(null, struct + VkImportMemoryHostPointerInfoEXT.HANDLETYPE); }
    /** Unsafe version of {@link #pHostPointer}. */
    public static long npHostPointer(long struct) { return memGetAddress(struct + VkImportMemoryHostPointerInfoEXT.PHOSTPOINTER); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkImportMemoryHostPointerInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImportMemoryHostPointerInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #handleType(int) handleType}. */
    public static void nhandleType(long struct, int value) { UNSAFE.putInt(null, struct + VkImportMemoryHostPointerInfoEXT.HANDLETYPE, value); }
    /** Unsafe version of {@link #pHostPointer(long) pHostPointer}. */
    public static void npHostPointer(long struct, long value) { memPutAddress(struct + VkImportMemoryHostPointerInfoEXT.PHOSTPOINTER, value); }

    // -----------------------------------

    /** An array of {@link VkImportMemoryHostPointerInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkImportMemoryHostPointerInfoEXT, Buffer> implements NativeResource {

        private static final VkImportMemoryHostPointerInfoEXT ELEMENT_FACTORY = VkImportMemoryHostPointerInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkImportMemoryHostPointerInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImportMemoryHostPointerInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkImportMemoryHostPointerInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImportMemoryHostPointerInfoEXT.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImportMemoryHostPointerInfoEXT.npNext(address()); }
        /** Returns the value of the {@code handleType} field. */
        @NativeType("VkExternalMemoryHandleTypeFlagBits")
        public int handleType() { return VkImportMemoryHostPointerInfoEXT.nhandleType(address()); }
        /** Returns the value of the {@code pHostPointer} field. */
        @NativeType("void *")
        public long pHostPointer() { return VkImportMemoryHostPointerInfoEXT.npHostPointer(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkImportMemoryHostPointerInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkImportMemoryHostPointerInfoEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkImportMemoryHostPointerInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkImportMemoryHostPointerInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code handleType} field. */
        public VkImportMemoryHostPointerInfoEXT.Buffer handleType(@NativeType("VkExternalMemoryHandleTypeFlagBits") int value) { VkImportMemoryHostPointerInfoEXT.nhandleType(address(), value); return this; }
        /** Sets the specified value to the {@code pHostPointer} field. */
        public VkImportMemoryHostPointerInfoEXT.Buffer pHostPointer(@NativeType("void *") long value) { VkImportMemoryHostPointerInfoEXT.npHostPointer(address(), value); return this; }

    }

}